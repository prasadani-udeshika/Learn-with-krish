function MissingNumber(number){

var min = Math.min(...number);
var max = Math.max(...number);

    var missingvalue = []
     for(let i=min; i<= max; i++) {
      if(!number.includes(i)) { 
        missingvalue.push(i);
      }
    }
    return missingvalue;

}
var arrayNum = [30,25,29,28,22,24,27,26,21];
console.log(MissingNumber(arrayNum))
