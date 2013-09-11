package geogebra.html5.gui;

import org.vectomatic.dom.svg.ui.SVGResource;
import org.vectomatic.dom.svg.ui.SVGResource.Validated;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;

public interface ToolbarResources extends ClientBundle{
	public static final ToolbarResources INSTANCE = GWT.create(ToolbarResources.class);
	
	@Source("icons/svg/tools_specialline_best_fit_line.svg")
	@Validated(validated = false)
	SVGResource best_fit_line();

	@Source("icons/svg/tools_actionobject_checkbox_show_hide_objects.svg")
	@Validated(validated = false)
	SVGResource checkbox_to_show_hide_objects();

	@Source("icons/svg/tools_circleandarc_circle_through_three_points.svg")
	@Validated(validated = false)
	SVGResource circle_through_three_points();

	@Source("icons/svg/tools_circleandarc_circle_with_center_radius.svg")
	@Validated(validated = false)
	SVGResource circle_with_center_and_radius();

	@Source("icons/svg/tools_circleandarc_circle_with_center_through_point.svg")
	@Validated(validated = false)
	SVGResource circle_with_center_through_point();

	@Source("icons/svg/tools_circleandarc_circular_arc_with_center_between_two_points.svg")
	@Validated(validated = false)
	SVGResource circular_arc_with_center_between_two_points();

	@Source("icons/svg/tools_circleandarc_circular_sector_with_center_between_two_points.svg")
	@Validated(validated = false)
	SVGResource circular_sector_with_center_between_two_points();

	@Source("icons/svg/tools_circleandarc_circumcircular_arc_through_three_points.svg")
	@Validated(validated = false)
	SVGResource circumcircular_arc_through_three_points();

	@Source("icons/svg/tools_circleandarc_circumcircular_sector_through_three_points.svg")
	@Validated(validated = false)
	SVGResource circumcircular_sector_through_three_points();
	
	@Source("icons/svg/tools_measurement_angle.svg")
	@Validated(validated = false)
	SVGResource angle();

	@Source("icons/svg/tools_specialline_angle_bisector.svg")
	@Validated(validated = false)
	SVGResource angle_bisector();

	@Source("icons/svg/tools_measurement_area.svg")
	@Validated(validated = false)
	SVGResource area();
	
	@Source("icons/svg/tools_point_attach_detach_point.svg")
	@Validated(validated = false)
	SVGResource attach_detach_point();
	
	@Source("icons/svg/tools_circleandarc_compasses.svg")
	@Validated(validated = false)
	SVGResource compasses();

	@Source("icons/svg/tools_point_complex_number.svg")
	@Validated(validated = false)
	SVGResource complex_number();

	@Source("icons/svg/tools_conicsection_conic_through_5_points.svg")
	@Validated(validated = false)
	SVGResource conic_through_5_points();

	@Source("icons/svg/tools_generaltools_copy_visual_style.svg")
	@Validated(validated = false)
	SVGResource copy_visual_style();

	// ToolBar

	@Source("icons/svg/tools_measurement_create_list.svg")
	@Validated(validated = false)
	SVGResource create_list();

	@Source("icons/svg/tools_generaltools_delete.svg")
	@Validated(validated = false)
	SVGResource delete_object();

	@Source("icons/svg/tools_conicsection_ellipse.svg")
	@Validated(validated = false)
	SVGResource ellipse();

	@Source("icons/svg/tools_cas_evaluate.svg")
	@Validated(validated = false)
	SVGResource evaluate();

	@Source("icons/svg/tools_cas_expand.svg")
	@Validated(validated = false)
	SVGResource expand();

	@Source("icons/svg/tools_cas_factor.svg")
	@Validated(validated = false)
	SVGResource factor();

	@Source("icons/svg/tools_specialobject_freehand_shape.svg")
	@Validated(validated = false)
	SVGResource freehand_shape();

	@Source("icons/svg/tools_specialobject_function_inspector.svg")
	@Validated(validated = false)
	SVGResource function_inspector();

	@Source("icons/svg/tools_conicsection_hyperbola.svg")
	@Validated(validated = false)
	SVGResource hyperbola();

	@Source("icons/svg/tools_actionobject_insert_button.svg")
	@Validated(validated = false)
	SVGResource insert_button();

	@Source("icons/svg/tools_specialobject_insert_image.svg")
	@Validated(validated = false)
	SVGResource insert_image();

	@Source("icons/svg/tools_actionobject_insert_input_box.svg")
	@Validated(validated = false)
	SVGResource insert_input_box();

	@Source("icons/svg/tools_specialobject_insert_text.svg")
	@Validated(validated = false)
	SVGResource insert_text();

	@Source("icons/svg/tools_cas_integral.svg")
	@Validated(validated = false)
	SVGResource integral();

	@Source("icons/svg/tools_point_intersect_two_objects.svg")
	@Validated(validated = false)
	SVGResource intersect_two_objects();

	@Source("icons/svg/tools_cas_keep_input.svg")
	@Validated(validated = false)
	SVGResource keep_input();

	@Source("icons/svg/tools_generaltools_label.svg")
	@Validated(validated = false)
	SVGResource label();

	@Source("icons/svg/tools_line_line_through_two_points.svg")
	@Validated(validated = false)
	SVGResource line_through_two_points();

	@Source("icons/svg/tools_specialline_locus.svg")
	@Validated(validated = false)
	SVGResource locus();

	@Source("icons/svg/tools_point_midpoint_or_center.svg")
	@Validated(validated = false)
	SVGResource midpoint_or_center();

	@Source("icons/svg/tools_movement_move.svg")
	@Validated(validated = false)
	SVGResource move();

	@Source("icons/svg/tools_generaltools_move_graphics_view.svg")
	@Validated(validated = false)
	SVGResource move_graphics_view();

	@Source("icons/svg/tools_point_new_point.svg")
	@Validated(validated = false)
	SVGResource new_point();

	@Source("icons/svg/tools_cas_numeric.svg")
	@Validated(validated = false)
	SVGResource numeric();

	@Source("icons/svg/tools_conicsection_parabola.svg")
	@Validated(validated = false)
	SVGResource parabola();

	@Source("icons/svg/tools_specialline_parallel_line.svg")
	@Validated(validated = false)
	SVGResource parallel_line();

	@Source("icons/svg/tools_specialobject_pen.svg")
	@Validated(validated = false)
	SVGResource pen();

	@Source("icons/svg/tools_specialline_perpendicular_bisector.svg")
	@Validated(validated = false)
	SVGResource perpendicular_bisector();

	@Source("icons/svg/tools_specialline_perpendicular_line.svg")
	@Validated(validated = false)
	SVGResource perpendicular_line();

	@Source("icons/svg/tools_point_point_on_object.svg")
	@Validated(validated = false)
	SVGResource point_on_object();

	@Source("icons/svg/tools_specialline_polar_or_diameter_line.svg")
	@Validated(validated = false)
	SVGResource polar_or_diameter_line();

	@Source("icons/svg/tools_polygon_polygon.svg")
	@Validated(validated = false)
	SVGResource polygon();

	@Source("icons/svg/tools_line_polyline_between_points.svg")
	@Validated(validated = false)
	SVGResource polyline_between_points();

	@Source("icons/svg/tools_specialobject_probability_calculator.svg")
	@Validated(validated = false)
	SVGResource probability_calculator();
	
	@Source("icons/svg/tools_line_ray_through_two_points.svg")
	@Validated(validated = false)
	SVGResource ray_through_two_points();

	@Source("icons/svg/tools_movement_record_to_spreadsheet.svg")
	@Validated(validated = false)
	SVGResource record_to_spreadsheet();

	@Source("icons/svg/tools_transformation_reflect_object_about_circle.svg")
	@Validated(validated = false)
	SVGResource reflect_object_about_circle();

	@Source("icons/svg/tools_transformation_reflect_object_about_line.svg")
	@Validated(validated = false)
	SVGResource reflect_object_about_line();

	@Source("icons/svg/tools_transformation_reflect_object_about_point.svg")
	@Validated(validated = false)
	SVGResource reflect_object_about_point();

	@Source("icons/svg/tools_polygon_regular_polygon.svg")
	@Validated(validated = false)
	SVGResource regular_polygon();

	@Source("icons/svg/tools_specialobject_relation_between_two_objects.svg")
	@Validated(validated = false)
	SVGResource relation_between_two_objects();

	@Source("icons/svg/tools_polygon_rigid_polygon.svg")
	@Validated(validated = false)
	SVGResource rigid_polygon();

	@Source("icons/svg/tools_movement_rotate_around_point.svg")
	@Validated(validated = false)
	SVGResource rotate_around_point();

	@Source("icons/svg/tools_transformation_rotate_object_about_point_by_angle.svg")
	@Validated(validated = false)
	SVGResource rotate_object_about_point_by_angle();

	@Source("icons/svg/tools_line_segment_between_two_points.svg")
	@Validated(validated = false)
	SVGResource segment_between_two_points();

	@Source("icons/svg/tools_line_segment_with_given_length_from_point.svg")
	@Validated(validated = false)
	SVGResource segment_with_given_length_from_point();

	@Source("icons/svg/tools_circleandarc_semicircle.svg")
	@Validated(validated = false)
	SVGResource semicircle();

	@Source("icons/svg/tools_generaltools_label.svg")
	@Validated(validated = false)
	SVGResource show_hide_label();

	@Source("icons/svg/tools_generaltools_show_hide_object.svg")
	@Validated(validated = false)
	SVGResource show_hide_object();
	
	@Source("icons/svg/tools_actionobject_slider.svg")
	@Validated(validated = false)
	SVGResource slider();

	@Source("icons/svg/tools_measurement_slope.svg")
	@Validated(validated = false)
	SVGResource slope();

	@Source("icons/svg/tools_cas_solve.svg")
	@Validated(validated = false)
	SVGResource solve();

	@Source("icons/svg/tools_cas_solve_numerically.svg")
	@Validated(validated = false)
	SVGResource solve_numerically();

	@Source("icons/svg/tools_cas_substitute.svg")
	@Validated(validated = false)
	SVGResource substitute();

	@Source("icons/svg/tools_line_vector_between_two_points.svg")
	@Validated(validated = false)
	SVGResource vector_between_two_points();

	@Source("icons/svg/tools_line_vector_from_point.svg")
	@Validated(validated = false)
	SVGResource vector_from_point();

	@Source("icons/svg/tools_polygon_vector_polygon.svg")
	@Validated(validated = false)
	SVGResource vector_polygon();

	@Source("icons/svg/tools_generaltools_zoom_in.svg")
	@Validated(validated = false)
	SVGResource zoom_in();

	@Source("icons/svg/tools_generaltools_zoom_out.svg")
	@Validated(validated = false)
	SVGResource zoom_out();

	@Source("icons/svg/tools_specialline_tangents.svg")
	@Validated(validated = false)
	SVGResource tangents();

	@Source("icons/svg/tools_transformation_translate_object_by_vector.svg")
	@Validated(validated = false)
	SVGResource translate_object_by_vector();
	
	@Source("icons/svg/tools_transformation_dilate_object_from_point_by_factor.svg")
	@Validated(validated = false)
	SVGResource dilate_object_from_point_by_factor();

	@Source("icons/svg/tools_measurement_distance_or_length.svg")
	@Validated(validated = false)
	SVGResource distance_or_length();

}
