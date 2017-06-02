function setTab($name){
	
	$name.children('[togle]').on("mouseover",function(){
		$(this).siblings().removeClass("index");
		$(this).addClass("index");
		$(this).parent().siblings('[tog]').hide();

		 $("#"+"con_"+$(this).attr('togle')).show();
		
		
		});
	
	
	}
	
	
function setTab1($name){
	
	$name.children('[togle]').on("mouseover",function(){
		$(this).siblings().removeClass("index");
		$(this).addClass("index");
		$(this).parent().siblings(".divcons").find('[tog]').hide();
		$("#"+"con_"+$(this).attr('togle')).show();
		
		
		});
	
	
	}	

	setTab($("#tabs1"));
/*	setTab($("#tabs3"));*/
	
	
$("#show1").click(function(){
	$("#gdxx").toggle();
	$(this).find("span").toggleClass('bg2');
	
	});	
	
Array.prototype.rand = function() {
	this.sort(function () {
		return Math.random() - 0.5;
	});
	return this;
};	

/*首页标签特效代码*/
var randPic = {
	idom:null,
	data:null,
	hasInit:false,
	start:0,
	len:13,
	top1:10,
	top2:120,
	top3:230,
	max:new Array(),
	indexArr:new Array(),
	classArr:new Array(),
	leftArr:new Array(),
	topArr:new Array(),
	init:function() {
		if(!this.idom || !this.data) return;
		this.initDom(); 
		this.initIndex();
		this.initRow1();

		this.initRow2();
		this.initRow3();
	},
	initIndex:function() {
		for(var i=0;i<this.len;i++) {
			this.indexArr.push(i);
		}
		this.indexArr.rand();
	},
	initRow1:function() {
		var arr = new Array(1,3,1,1,2), l=0;
		arr.rand();
		for(var i=0;i<arr.length;i++) {
			this.topArr.push(this.top1);
			this.classArr.push(arr[i]);
			this.leftArr.push(l);
			if(arr[i]==3) {
				this.max.push(i);
				this.max.push(l);
			}
			l += this.width(arr[i]) + 10;
		}	

		
	},
	initRow2:function() {
		var arr = new Array(1,1,1,3), j = this.max[0], y = this.max[1], c=1, m=0, x=0, w=150;
		arr.rand();
		for(var i=0;i<arr.length;i++) {
			this.topArr.push(this.top2);
			c = arr[i];
			if(y==0) {
				i==0 ? m = 260 : m += this.width(this.classArr[4+i])+10;
			} else if(y%160==0) {
				c = 1;
				if(i<y/160) {
					x++;
					if(i>0) m += this.width(c) + 10;
				} else {
					i == y/160 ? m = x*160 + 260 : m += this.width(this.classArr[4+i])+10;
					if(i==arr.length-1) c = 3;
				}
			} else {
				c = 1;
				if(i < j) {
					i==0 ? c = 3 : m += this.width(this.classArr[4+i]) + 10;
				}else if(i == j) {
					m += this.width(this.classArr[4+i]) + 270;
				}else{
					m += this.width(c) + 10;
				}
			}
			this.classArr.push(c);
			this.leftArr.push(m);
			if(c==3) {
				this.max[0] = i;
				this.max[1] = m;
			}
		}
	},
	initRow3:function() {
		var arr = new Array(1,1,1,2), j = this.max[0], y = this.max[1], c=1, m=0, x=0, w=150;
		arr.rand();
		for(var i=0;i<arr.length;i++) {
			this.topArr.push(this.top3);
			if(y==0) {
				c = arr[i];
				i==0 ? m = 260 : m += this.width(this.classArr[8+i]) + 10;
			} else if((y%160)==0){
				c = 1;
				if(i<(y/160)) {
					x++;
					if(i>0) m += this.width(c) + 10;
				} else {
					i == y/160 ? m = x*160 + 260 : m += this.width(this.classArr[8+i]) + 10;
					x++;
					x>3 ? c = 2 : c = 1;
				}
			} else {
				c = 1;
				if(j==arr.length-1) {
					c = arr[i];
					if(i>0) {
						m += this.width(this.classArr[8+i]) + 10;
					}
				} else if(j==0) {
					if(i==0) {
						c = 2;
					} else {
						c = 1;
						if(i==1) m += 260;
						m += this.width(this.classArr[8+i]) + 10;
					}
				} else {
					if(i <= j) {
						i==0 ? c = 2 : m += this.width(this.classArr[8+i]) + 10;
					} else {
						i == j+1 ? m += this.width(this.classArr[8+i]) + 270 : m += this.width(c) + 10;
					}
				}
			}
			this.classArr.push(c);
			this.leftArr.push(m);
		}
	},
	initDom:function() {
		for(var i=0; i<this.len; i++) {
			this.idom.append('<li></li>');
		}
	},
	initContent:function() {
		var j = this.start + this.len, data, idx, n=0;
		if(this.hasInit) return ;
		for(var i=this.start; i<j; i++) {
			if(i>=this.data.length) {
				idx = i-this.data.length;
			} else {
				idx = i;
			}
			if(!this.data[idx]) continue;
			data = this.data[idx];
			this.idom.find('li').eq(n).html('<a href="'+data.url+'" target="_blank"><div class="find-tea-con"><img src="'+data.img+'" /><br/>'+data.name+'</div></a>');
			n++;
		}
		this.start = idx+1;
		this.hasInit = true;
	},
	load:function() {
	
		this.init();
		var _t = this;
		this.idom.find('li').each(function(i){
			$(this).addClass('ccolor'+ _t.indexArr[i]);
			$(this).css({
				width:  _t.mywidth(_t.classArr[i]) + 'px',
				height: _t.myheight(_t.classArr[i]) + 'px',
				left:	(_t.leftArr[i])*1.2+'px',
				top:	(_t.topArr[i])*1.2+'px'
			});
			
		});
		this.initContent();
		this.idom.find(".find-tea-con").css({
			width:"auto",
			height:"82px",
			opacity:"1",
			overflow:"hidden"
		});
	},
	reset:function() {
		this.idom.html('');
		this.indexArr = new Array();
		this.classArr = new Array();
		this.leftArr = new Array();
		this.topArr = new Array();
		this.max = new Array();
		this.hasInit = false;
	},
	reload:function() {

		this.reset();
		this.init();
		var _t = this;
		_t.idom.find('li').each(function(i){
			var w = Math.ceil(Math.random() * (990 - _t.width(_t.classArr[i])));
			var h = Math.ceil(Math.random() * (340 - _t.height(_t.classArr[i])));
			$(this).css({left:w+'px', top:h+'px'});
		});
		
		
		_t.idom.find('li').each(function(i){
			$(this).addClass('ccolor'+ _t.indexArr[i]);
			$(this).animate({
				width:  _t.mywidth(_t.classArr[i]) + 'px',
				height: _t.myheight(_t.classArr[i]) + 'px',
				left:	(_t.leftArr[i])*1.2+'px',
				top:	(_t.topArr[i])*1.2+'px'
			}, 1000, 'swing');

			_t.initContent();

			console.log();
			$(this).find(".find-tea-con").animate({
				width:"80%",
				height:"82px",
				opacity:"1",
			}, 1000, 'swing');
		});
	},
	width:function(s) {
		return s==1?150:250;
	},
	height:function(h) {
		return h==3?210:100;
	},
	mywidth:function(s) {
		return s==1?180:300;
	},
	myheight:function(h) {
		return h==3?252:120;
	}
};

	$('.find-change').click(function() {
		randPic.reload();
	});
/*首页标签特效代码*/	