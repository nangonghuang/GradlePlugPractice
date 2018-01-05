package test.gradle.plug

import org.gradle.api.Plugin
import org.gradle.api.Project

public class PluginImpl implements Plugin<Project> {
    void apply(Project project) {

        project.gradle.addListener(new TimeListener())

        project.task('testTask')  {
            doLast {
                println "+++++++++++Hello gradle plugin++++++++++"
            }
        }
    }
}