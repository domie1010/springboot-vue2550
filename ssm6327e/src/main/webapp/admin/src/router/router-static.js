import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import forum from '@/views/modules/forum/list'
    import news from '@/views/modules/news/list'
    import pinzhongleixing from '@/views/modules/pinzhongleixing/list'
    import yonghu from '@/views/modules/yonghu/list'
    import zhongzhijishu from '@/views/modules/zhongzhijishu/list'
    import messages from '@/views/modules/messages/list'
    import bingchongfangzhi from '@/views/modules/bingchongfangzhi/list'
    import zhongzhiwuxinxi from '@/views/modules/zhongzhiwuxinxi/list'
    import nongyezixun from '@/views/modules/nongyezixun/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/forum',
        name: '在线交流',
        component: forum
      }
      ,{
	path: '/news',
        name: '热点新闻',
        component: news
      }
      ,{
	path: '/pinzhongleixing',
        name: '品种类型',
        component: pinzhongleixing
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/zhongzhijishu',
        name: '种植技术',
        component: zhongzhijishu
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
	path: '/bingchongfangzhi',
        name: '病虫防治',
        component: bingchongfangzhi
      }
      ,{
	path: '/zhongzhiwuxinxi',
        name: '种植物信息',
        component: zhongzhiwuxinxi
      }
      ,{
	path: '/nongyezixun',
        name: '农业资讯',
        component: nongyezixun
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
