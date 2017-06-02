if((typeof mpnchat=='undefined' || !mpnchat) && (document.body && document.body.getAttribute("mpnchatinit") != "1"))
var mpnchat={
env:{
server:{
url:'http://www.mpnco.cn/',
site:'http://www.mpnco.cn/',
black:'http://s.mpnco.cn/black.htm',
stat:'http://s.mpnco.cn/stat/',
chat:'http://c.mpnco.cn/chat/',
file:'http://f.mpnco.cn/files/'
,call:'http://s.mpnco.cn/call/'
},
gId:'b7bff1fe-8bf0-4328-ba1d-2b5b2c64b484',
cId:'4abeaf33-d20c-4f20-9abd-bafeca97ea0f',
sId:'b7bff1fe-8bf0-4328-ba1d-2b5b2c64b484',
sdId:'',
emps:[],
rId:'',
statInterval:3000,
status:'',
statSetting:'0',
black:'',
isChat:false,
os:'',
line:false
},
monitor:{},panel:{},room:{},
client:{ref:'',h:'',w:'',prot:'',scn:'',ua:'',dt:'',iv:'',ct:''},
init:function(){
document.write('<div id="MPN_PANEL"></div>');
document.write('<link rel="stylesheet" type="text/css" href="http://f.mpnco.cn/files/css/client.css" />');
document.write('<link rel="stylesheet" type="text/css" href="http://f.mpnco.cn/files/css/chatroom.mini.css" />');
document.write('<script type="text/javascript" src="http://f.mpnco.cn/files/js/sharedcookie.js"></script>');
document.write('<script type="text/javascript" src="http://f.mpnco.cn/files/js/client.js"></script>');
}
};

if(document.body && document.body.getAttribute("mpnchatinit") != "1")
mpnchat.init();