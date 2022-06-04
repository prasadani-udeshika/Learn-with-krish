var n = [30,25,29,28,22,24,27,26,21],
  count = n[n.length - 1];
var FindMissingVal = [];
for ( var i = 21; i <= count; i++ ) {
	if (n.indexOf(i) == -1) {
		FindMissingVal.push(i);
	}
}
console.log(FindMissingVal);
