const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm6327e/",
            name: "ssm6327e",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm6327e/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "农作物信息服务平台"
        } 
    }
}
export default base
