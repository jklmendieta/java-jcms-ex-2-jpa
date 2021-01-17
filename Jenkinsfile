pipeline{
	agent any
	
	stages{
			stage('Compile Stage'){ 
			
				steps{
						withMaven(maven:'maven_3_6_3'){
						
							bat 'mvn clean compile'
					}
				}
			
			}
			
			stage('Package Stage'){ 
			
				steps{
						withMaven(maven:'maven_3_6_3'){
						
							bat 'mvn package'
					}
				}
			
			}
			
			stage('Testing Stage'){ 
			
				steps{
						withMaven(maven:'maven_3_6_3'){
						
							bat 'mvn test'
					}
				}
			
			}
			
			stage('Docker Deployment Stage'){ 
			
				steps{
						bat 'docker build -t jklmendieta/java-jcms-ex-2-jpa --pull=true'
				}
			
			}
			
			
	
	}



}