Confluence.Blueprint.setWizard('dk.rn.modalitylist:create-by-sample-template', function(wizard) {
    wizard.on('submit.page1Id', function(e, state) {
        var myName = state.pageData.myName;
        if (myName == 'abc') {
            alert('That is not a real name!');
            return false;
        }
    });
});