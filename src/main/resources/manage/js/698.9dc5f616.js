"use strict";(self["webpackChunkvue3_nb0"]=self["webpackChunkvue3_nb0"]||[]).push([[698],{3698:(t,e,a)=>{a.r(e),a.d(e,{default:()=>E});a(5271),a(3134),a(2033);var o=a(7377),n=a(8479),u=a(1290),i=a(1370),l={class:"home_view"},r={class:"projectTitle"},c={class:"count_list"},s={class:"index_card_head"},d=(0,o._)("div",{class:"card_head_title"}," 投稿 ",-1),h={class:"card_head_right"},f={class:"count_item"},_=(0,o._)("div",{class:"count_title"},"投稿总数",-1),g={class:"count_num"},p={class:"card_list"},v={class:"index_card_head"},w=(0,o._)("div",{class:"card_head_title"}," 投稿 ",-1),y={class:"card_head_right"},m={class:"card_item"},C=(0,o._)("div",{id:"tougaogaojianfenleiEchart1",style:{width:"100%",height:"400px"}},null,-1),T=[C],W={class:"index_card_head"},k=(0,o._)("div",{class:"card_head_title"}," 投稿 ",-1),x={class:"card_head_right"},b={class:"card_item"},j=(0,o._)("div",{id:"tougaosfshEchart2",style:{width:"100%",height:"400px"}},null,-1),F=[j];const I={__name:"HomeView",setup:function(t){var e,a=null===(e=(0,o.FN)())||void 0===e?void 0:e.appContext.config.globalProperties,C=a.$project.projectName,j=(0,u.iH)({}),I=function(){j.value.closetougaoCountType=!0,j.value.hiddentougaoCountType=!0,B("tougao","首页总数")&&E()},A=(0,u.iH)(0),E=function(){null===a||void 0===a||a.$http({url:"tougao/count",method:"get"}).then((function(t){A.value=t.data.data}))},$=function(t){j.value[t]=!j.value[t]},z=function(){I(),L()},B=function(t,e){return null===a||void 0===a?void 0:a.$toolUtil.isAuth(t,e)},H=(0,o.f3)("echarts"),q=function(t){U.value[t]=!U.value[t],setTimeout((function(){L()}),1e3)},U=(0,u.iH)({closetougaoChartType1:!0,hiddentougaoChartType1:!0,closetougaoChartType2:!0,hiddentougaoChartType2:!0}),L=function(){B("tougao","首页统计")&&N(),B("tougao","首页统计")&&O()},N=function(){(0,o.Y3)((function(){var t=H.init(document.getElementById("tougaogaojianfenleiEchart1"),"macarons");null===a||void 0===a||a.$http({url:"tougao/group/gaojianfenlei",method:"get"}).then((function(e){for(var a=e.data.data,o=[],n=[],u=[],i=0;i<a.length;i++)o.push(a[i].gaojianfenlei),n.push(parseFloat(a[i].total)),u.push({value:parseFloat(a[i].total),name:a[i].gaojianfenlei});var l={};l={title:{text:"投稿数量统计",left:"center"},tooltip:{trigger:"item",formatter:"{b} : {c}"},xAxis:{type:"category",data:o,axisLabel:{rotate:40}},yAxis:{type:"value"},series:[{data:n,type:"bar"}]},t.clear(),t.setOption(l),t.resize()}))}))},O=function(){(0,o.Y3)((function(){var t=H.init(document.getElementById("tougaosfshEchart2"),"macarons");null===a||void 0===a||a.$http({url:"tougao/group/sfsh",method:"get"}).then((function(e){for(var a=e.data.data,o=[],n=[],u=[],i=0;i<a.length;i++)o.push(a[i].sfsh),n.push(parseFloat(a[i].total)),u.push({value:parseFloat(a[i].total),name:a[i].sfsh});var l={};l={title:{text:"审稿统计",left:"center"},tooltip:{trigger:"item",formatter:"{b} : {c}"},xAxis:{type:"category",data:o,axisLabel:{rotate:40}},yAxis:{type:"value"},series:[{data:n,type:"bar"}]},t.clear(),t.setOption(l),t.resize()}))}))};return z(),function(t,e){var a=(0,o.up)("ArrowUpBold"),I=(0,o.up)("el-icon"),E=(0,o.up)("CloseBold"),z=(0,o.up)("el-collapse-transition"),H=(0,o.up)("el-card");return(0,o.wg)(),(0,o.iD)("div",l,[(0,o._)("div",r,"欢迎使用 "+(0,n.zw)((0,u.SU)(C)),1),(0,o._)("div",c,[B("tougao","首页总数")?((0,o.wg)(),(0,o.j4)(z,{key:0},{default:(0,o.w5)((function(){return[(0,o.wy)((0,o.Wm)(H,{class:"card_view"},{header:(0,o.w5)((function(){return[(0,o._)("div",s,[d,(0,o._)("div",h,[(0,o.Wm)(I,{onClick:e[0]||(e[0]=function(t){return $("hiddentougaoCountType")}),class:(0,n.C_)(["showIcons",j.value.hiddentougaoCountType?"showIcons1":""])},{default:(0,o.w5)((function(){return[(0,o.Wm)(a)]})),_:1},8,["class"]),(0,o.Wm)(I,{onClick:e[1]||(e[1]=function(t){return $("closetougaoCountType")}),class:"closeIcons"},{default:(0,o.w5)((function(){return[(0,o.Wm)(E)]})),_:1})])])]})),default:(0,o.w5)((function(){return[(0,o.Wm)(z,null,{default:(0,o.w5)((function(){return[(0,o.wy)((0,o._)("div",f,[_,(0,o._)("div",g,(0,n.zw)(A.value),1)],512),[[i.F8,j.value.hiddentougaoCountType]])]})),_:1})]})),_:1},512),[[i.F8,j.value.closetougaoCountType]])]})),_:1})):(0,o.kq)("",!0)]),(0,o._)("div",p,[B("tougao","首页统计")?((0,o.wg)(),(0,o.j4)(z,{key:0},{default:(0,o.w5)((function(){return[(0,o.wy)((0,o.Wm)(H,{class:"card_view"},{header:(0,o.w5)((function(){return[(0,o._)("div",v,[w,(0,o._)("div",y,[(0,o.Wm)(I,{onClick:e[2]||(e[2]=function(t){return q("hiddentougaoChartType1")}),class:(0,n.C_)(["showIcons",U.value.hiddentougaoChartType1?"showIcons1":""])},{default:(0,o.w5)((function(){return[(0,o.Wm)(a)]})),_:1},8,["class"]),(0,o.Wm)(I,{onClick:e[3]||(e[3]=function(t){return q("closetougaoChartType1")}),class:"closeIcons"},{default:(0,o.w5)((function(){return[(0,o.Wm)(E)]})),_:1})])])]})),default:(0,o.w5)((function(){return[(0,o.Wm)(z,null,{default:(0,o.w5)((function(){return[(0,o.wy)((0,o._)("div",m,T,512),[[i.F8,U.value.hiddentougaoChartType1]])]})),_:1})]})),_:1},512),[[i.F8,U.value.closetougaoChartType1]])]})),_:1})):(0,o.kq)("",!0),B("tougao","首页统计")?((0,o.wg)(),(0,o.j4)(z,{key:1},{default:(0,o.w5)((function(){return[(0,o.wy)((0,o.Wm)(H,{class:"card_view"},{header:(0,o.w5)((function(){return[(0,o._)("div",W,[k,(0,o._)("div",x,[(0,o.Wm)(I,{onClick:e[4]||(e[4]=function(t){return q("hiddentougaoChartType2")}),class:(0,n.C_)(["showIcons",U.value.hiddentougaoChartType2?"showIcons1":""])},{default:(0,o.w5)((function(){return[(0,o.Wm)(a)]})),_:1},8,["class"]),(0,o.Wm)(I,{onClick:e[5]||(e[5]=function(t){return q("closetougaoChartType2")}),class:"closeIcons"},{default:(0,o.w5)((function(){return[(0,o.Wm)(E)]})),_:1})])])]})),default:(0,o.w5)((function(){return[(0,o.Wm)(z,null,{default:(0,o.w5)((function(){return[(0,o.wy)((0,o._)("div",b,F,512),[[i.F8,U.value.hiddentougaoChartType2]])]})),_:1})]})),_:1},512),[[i.F8,U.value.closetougaoChartType2]])]})),_:1})):(0,o.kq)("",!0)])])}}},A=I,E=A}}]);
//# sourceMappingURL=698.9dc5f616.js.map