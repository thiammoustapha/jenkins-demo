pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/thiammoustapha/jenkins-spring-gradle.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}