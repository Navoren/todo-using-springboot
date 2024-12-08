const form = document.getElementById('taskForm');
const taskInput = document.getElementById('taskInput');

form.addEventListener('submit', function(event) {
    if (event.submitter.name === 'action' && event.submitter.value === 'deleteAll') {
        taskInput.removeAttribute('required');
    } else {
        taskInput.setAttribute('required', true);
    }
});
