pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('plantslife-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/mohammed-mutaliev/plantslife_devops.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}