package geogebra.touch.utils;

import geogebra.common.awt.GColor;
import geogebra.common.main.GeoGebraColorConstants;
import geogebra.html5.gui.ToolbarResources;
import geogebra.touch.TouchEntryPoint;
import geogebra.touch.gui.laf.DefaultResources;

import org.vectomatic.dom.svg.ui.SVGResource;

public enum StyleBarDefaultSettings {
	Point(GColor.blue, new SVGResource[] { getLafIcons().color(),
			ToolbarResources.INSTANCE.label() }), PointOnObject(
			GeoGebraColorConstants.LIGHTBLUE, new SVGResource[] {
					getLafIcons().color(), ToolbarResources.INSTANCE.label() }), DependentPoints(
			GColor.darkGray, new SVGResource[] { getLafIcons().color(),
					ToolbarResources.INSTANCE.label() }), Line(GColor.black,
			new SVGResource[] { getLafIcons().color(),
					getLafIcons().properties_default(), ToolbarResources.INSTANCE.label(),
					getLafIcons().properties_default() }), Polygon(
			GeoGebraColorConstants.BROWN, new SVGResource[] {
					getLafIcons().color(), getLafIcons().properties_default(),
					ToolbarResources.INSTANCE.label(), getLafIcons().properties_default() }), Move(
			null, new SVGResource[] { getLafIcons().show_or_hide_the_axes(),
					getLafIcons().show_or_hide_the_grid() }), Angle(
			GeoGebraColorConstants.DARKGREEN, new SVGResource[] {
					getLafIcons().color(), getLafIcons().properties_default(),
					ToolbarResources.INSTANCE.label() });

	private static DefaultResources getLafIcons() {
		return TouchEntryPoint.getLookAndFeel().getIcons();
	}

	private GColor defaultColor;

	private SVGResource[] entry;

	StyleBarDefaultSettings(final GColor color, final SVGResource[] entries) {
		this.defaultColor = color;
		this.entry = entries;
	}

	public GColor getColor() {
		return this.defaultColor;
	}

	public SVGResource[] getResources() {
		return this.entry;
	}
}
