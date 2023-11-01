const numbers = prompt("Enter numbers separated by commas:").split(',').map(Number);

numbers.sort(function(a, b) {
    return b - a;
});

console.log("Sorted in descending order:", numbers);