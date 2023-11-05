node{
        stage('git checkout'){
            echo "checking out the code from github"
            git 'https://github.com/Just-inC16/insurance-project-demo.git'
        }
        
        stage('maven build'){
            sh 'mvn clean package'
        }
        
        stage('Build Docker image'){
            sh 'docker build -t jchan3719/insure-me:1.0 .'
        }
        
         stage('push docker image to docker hub registry')
           
        {
            echo 'pushing images to registry'
            
            withCredentials([string(credentialsId: 'dockerLogin', variable: 'dockerLogin')]) {
                sh "docker login -u jchan3719 -p ${dockerLogin}"
                sh 'docker push jchan3719/insure-me:1.0'
            }
        }
        stage('configure ansible for test server'){
            ansiblePlaybook become: true, credentialsId: 'ssh-connection-private', disableHostKeyChecking: true, installation: 'ansible', inventory: '/etc/ansible/hosts', playbook: 'configure-test-server.yml', vaultTmpPath: ''
        }
        stage('Test selenium tests'){
            sh 'mvn test'
        }
        stage('configure ansible for prod server '){
            ansiblePlaybook become: true, credentialsId: 'ssh-connection-private', disableHostKeyChecking: true, installation: 'ansible', inventory: '/etc/ansible/hosts', playbook: 'configure-prod-server.yml', vaultTmpPath: ''
        }
        
        
        
}
