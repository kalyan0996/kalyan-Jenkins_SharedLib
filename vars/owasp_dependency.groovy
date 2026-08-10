def call() {
    dependencyCheck(
        additionalArguments: '--scan ./ --data /var/lib/jenkins/dependency-check-data',
        odcInstallation: 'OWASP'
    )

    dependencyCheckPublisher pattern: '**/dependency-check-report.xml'
}
