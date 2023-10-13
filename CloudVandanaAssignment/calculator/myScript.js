let currentResult = "";

function appendToResult(value) {
  currentResult += value;
  document.getElementById("result").value = currentResult;
}

function appendOperator(operator) {
  if (currentResult === "" || isNaN(currentResult[currentResult.length - 1])) {
    return;
  }
  appendToResult(operator);
}

function clearResult() {
  currentResult = "";
  document.getElementById("result").value = currentResult;
}

function calculateResult() {
  if (currentResult === "" || isNaN(currentResult[currentResult.length - 1])) {
    return;
  }
  try {
    currentResult = eval(currentResult);
    document.getElementById("result").value = currentResult;
  } catch (error) {
    document.getElementById("result").value = "Error";
  }
}
