let button = document.createElement('button');

let container = document.querySelector('div');
container.appendChild(button);

button.textContent = 'click me!! click me!!!!!!!!!!!!!';

button.addEventListener('click', function() {
  window.location.href = 'js/DOM-practice/shopping-list/shopping-list.html';
})