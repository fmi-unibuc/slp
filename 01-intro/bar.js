function bar(x) { 
  return function() { var x = 5; return x; }; 
}
var f = bar(200);
console.log("%d", f());
