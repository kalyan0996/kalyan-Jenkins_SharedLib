def call() {
    dependencyCheck(
        additionalArguments: '--scan ./ --noupdate --data /var/lib/jenkins/dependency-check-data --format ALL',
        odcInstallation: 'OWASP'
    )
    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
