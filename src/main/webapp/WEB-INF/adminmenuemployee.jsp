<c:choose>
	<c:when
		test="${authenticatedUser !=null}">
		<li><a
			href="listinstructors.php?page=instructors&&user_role=empl&&action=list"><img
						src="icons/application_view_list.png" /> Instructors</a>
		</li>
		<li><a class="idTabs" href="#evaluations"><img
				src="icons/application_side_expand.png" /> Evaluation Tracking</a>
			<ul class="noJS">
				<li><a
					href="listevaluations.php?page=evaluations&&action=list"><img
						src="icons/application_view_list.png" /> Discipline status</a></li>
				<li><a
					href="listevaluations.php?page=evaluations&&action=list"><img
						src="icons/application_view_list.png" /> Marks records</a></li>
			</ul></li>
		
	</c:when>
	<c:otherwise>

	</c:otherwise>
</c:choose>