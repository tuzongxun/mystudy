import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import { Button, Select,Container,Header,Aside,Main,Icon, Table,TableColumn,Row,Col,Menu,Submenu,MenuItem,MenuItemGroup,Input } from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';

Vue.use(Button);
Vue.use(Select);
Vue.use(Container);
Vue.use(Header);
Vue.use(Aside);
Vue.use(Main);
Vue.use(Icon);
Vue.use(Table);
Vue.use(TableColumn);
Vue.use(Row);
Vue.use(Col);
Vue.use(Menu);
Vue.use(Submenu);
Vue.use(MenuItem);
Vue.use(Input);
Vue.use(MenuItemGroup);



Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
