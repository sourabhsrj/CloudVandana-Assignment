function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ');
    const reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });
    return reversedWords.join(' ');
}

const inputSentence = prompt("Enter a sentence:");
if (inputSentence) {
    const reversedSentence = reverseWordsInSentence(inputSentence);
    console.log("Reversed sentence: " + reversedSentence);
} else {
    console.log("No input provided.");
}