def call(String gitUrl, String gitBranch)
{
    checkoutGit([
        $class: 'GitSCM',
        branches: [[name: gitBranch]],
        userRemoteConfigd: [[url: gitUrl]]
    ])
}