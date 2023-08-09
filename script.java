// Sélectionner tous les boutons
var buttons = document.querySelectorAll('.buttons a');

// Ajouter un gestionnaire d'événement pour chaque bouton
buttons.forEach(function(button) {
  button.addEventListener('mouseover', function() {
    this.classList.add('button-hover');
  });

  button.addEventListener('mouseout', function() {
    this.classList.remove('button-hover');
  });
});
