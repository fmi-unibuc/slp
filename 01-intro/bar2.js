function bar(x) { 
  return function() { var x = x; return x; }; 
}
var f = bar(200);
console.log("%d", f());
