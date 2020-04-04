pipeline {
  agent any
  stages 
    {
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
    stage('Test the build') {
      steps {
        sh 'mvn test'
      }
    }
  }
}

