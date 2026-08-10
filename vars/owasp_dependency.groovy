def call() {
    withCredentials([string(credentialsId: 'nvd-api-key', variable: 'NVD_API_KEY')]) {
        dependencyCheck(
            additionalArguments: "--scan ./ --nvdApiKey ${NVD_API_KEY} --data /var/lib/jenkins/dependency-check-data",
            odcInstallation: 'OWASP'
        )
    }
    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
