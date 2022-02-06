pipeline 
{
    agent any

    stages 
    {
        stage('Build') 
        {
            steps 
            {
                echo 'Building Application'
            }
        }

        stage('Test') 
        {
            steps 
            {
                echo 'Testing Application'
            }
        }

        stage('Deploy') 
        {
            steps 
            {
                echo 'Deploying Application'
            }
        }
    }

    post
    {
        always
        {
            emailext body: 'Test email for pipeline jobs', subject: 'Pipeline Status', to: 'vicky.selenium@gmail.com'

        }

    }
}
