def call() {
    dependencyCheck(
        additionalArguments: '--scan ./ --noupdate --data /var/lib/jenkins/dependency-check-data --disableNvdApi --format ALL',
        odcInstallation: 'OWASP'
    )
    dependencyCheckPublisher(
        pattern: '**/dependency-check-report.xml'
    )
}
EOF
