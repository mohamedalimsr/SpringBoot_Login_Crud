
function remove(id) {
	console.log(id);
	swal({
		  title: "Delete User",
		  text: "Once deleted, it cannot be restored.!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/remove/"+id,
				 success: function(res) {
					console.log(res);
				},
			  });
		    swal("User Deleted  ", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/";
		    	}
		    });
		  }
		});
}

