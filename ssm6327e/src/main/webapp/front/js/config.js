
var projectName = '农作物信息服务平台';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

]


var indexNav = [

{
	name: '种植物信息',
	url: './pages/zhongzhiwuxinxi/list.html'
}, 
{
	name: '种植技术',
	url: './pages/zhongzhijishu/list.html'
}, 
{
	name: '病虫防治',
	url: './pages/bingchongfangzhi/list.html'
}, 

{
	name: '在线交流',
	url: './pages/forum/list.html'
}, 
{
	name: '热点新闻',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssm6327e/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","技术"],"menu":"种植物信息","menuJump":"列表","tableName":"zhongzhiwuxinxi"}],"menu":"种植物信息管理"},{"child":[{"buttons":["查看","修改","删除","防治"],"menu":"种植技术","menuJump":"列表","tableName":"zhongzhijishu"}],"menu":"种植技术管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"病虫防治","menuJump":"列表","tableName":"bingchongfangzhi"}],"menu":"病虫防治管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"品种类型","menuJump":"列表","tableName":"pinzhongleixing"}],"menu":"品种类型管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"农业资讯","menuJump":"列表","tableName":"nongyezixun"}],"menu":"农业资讯管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"在线交流","tableName":"forum"}],"menu":"在线交流"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"热点新闻","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"种植物信息列表","menuJump":"列表","tableName":"zhongzhiwuxinxi"}],"menu":"种植物信息模块"},{"child":[{"buttons":["查看"],"menu":"种植技术列表","menuJump":"列表","tableName":"zhongzhijishu"}],"menu":"种植技术模块"},{"child":[{"buttons":["查看"],"menu":"病虫防治列表","menuJump":"列表","tableName":"bingchongfangzhi"}],"menu":"病虫防治模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"种植物信息列表","menuJump":"列表","tableName":"zhongzhiwuxinxi"}],"menu":"种植物信息模块"},{"child":[{"buttons":["查看"],"menu":"种植技术列表","menuJump":"列表","tableName":"zhongzhijishu"}],"menu":"种植技术模块"},{"child":[{"buttons":["查看"],"menu":"病虫防治列表","menuJump":"列表","tableName":"bingchongfangzhi"}],"menu":"病虫防治模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
