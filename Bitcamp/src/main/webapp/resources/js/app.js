/**
 * 
 */
var app = app || {};
app = {
	init : x=>{
		var head = document.createElement( 'head' );
		var body = document.createElement( 'body' );
		document.documentElement.appendChild(head);
		document.documentElement.appendChild(body);
		//head와 body 만드는 것
		$(createDiv({id: 'wrapper'})).appendTo('body');
		$(createDiv({id: 'container'})).appendTo('#wrapper');
			if(x.result=='true'){
				alert("보기:/exsit");
				$('#container').load(x.context + '/exist');
			}else{
				$('#container').load(x.context + '/not-exist');
			}
	}
}
var createDiv = x=>{
	return '<div id="'+x.id+'" clazz="'+x.clazz+'"></div>';
}
var createHTag =x=>{
	return '<h'+x.num+' id="'+x.id+'">'+x.val+'</h'+x.num+'>';
}
/*dom.documentElement.innerHTML = '<head></head><body></body>';
Or go with the more rigorous:

var head = dom.createElement( 'head' );
var body = dom.createElement( 'body' );
dom.documentElement.appendChild(head);
dom.documentElement.appendChild(body);*/