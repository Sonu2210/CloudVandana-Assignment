// Take a sentence as an input and reverse every word in that sentence.
// Example - This is a sunny day > shiT si a ynnus yad.

let word = "This is a sunny day";
// let word =
//   "Take a sentence as an input and reverse every word in that sentence";

let array = word.split(" ");

let ans = array.map((ele) => reverseAWord(ele)).join(" ");

console.log(ans);

function reverseAWord(word) {
  //function to reverse a word
  return word.split("").reverse().join("");
}
