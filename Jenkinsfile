pipeline {
  environment{
  	registry = "sac08/devops-calculator"
    registryCredential = 'dockerhub'
    dockerImage = ''
  }
  agent any
 
  stages 
    {
    stage('Cloning Git') {
	steps {
		git 'https://github.com/Sac08/devops_calc_assnmnt.git'
  	}
    }
    stage('Clean prev build') {
      steps {
        sh 'mvn clean'
      }
    }
    stage('Compile') {
      steps {
        sh 'mvn compile'
      }
    }
    stage('Test and produce jar') {
      steps {
        sh 'mvn test install'
      }
    }
    stage('Building docker image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Deploying docker Image') {
      steps{
        script {
          docker.withRegistry( '', registryCredential ) {
            dockerImage.push()
          }
        }
      }
    }
    stage('Remove Unused docker image') {
      steps{
        sh "docker rmi $registry:$BUILD_NUMBER"
      }
    }
    stage('Deployment') {
	steps {
		build 'rundeck_deploy'
	}
     }
  }
}

