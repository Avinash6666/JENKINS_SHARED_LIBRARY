def call(){
    withKubeConfig(cacertificate: '', clusterName: '', contextName: '', credentialsId: 'k8s', namespace: '', restrictKubeConfigAccess: false, serverUrl: '')
    sh 'kubectl delete -f deployment.yml'
}