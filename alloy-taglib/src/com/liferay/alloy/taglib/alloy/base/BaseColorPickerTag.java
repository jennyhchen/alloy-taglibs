package com.liferay.alloy.taglib.alloy.base;

import com.liferay.alloy.taglib.util.IncludeTag;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;

/**
 * <a href="BaseColorPickerTag.java.html"><b><i>View Source</i></b></a>
 *
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 */
public class BaseColorPickerTag extends IncludeTag {

	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	protected String _getPage() {
		return _PAGE;
	}

	public java.lang.Object getAlign() {
		return _align;
	}

	public java.lang.String getColorpickerBodyContent() {
		return _colorpickerBodyContent;
	}

	public java.lang.String getBoundingBox() {
		return _boundingBox;
	}

	public java.lang.String getCancellableHide() {
		return _cancellableHide;
	}

	public java.lang.String getCentered() {
		return _centered;
	}

	public java.lang.String getConstrain() {
		return _constrain;
	}

	public java.lang.String getContentBox() {
		return _contentBox;
	}

	public java.lang.String getCssClass() {
		return _cssClass;
	}

	public java.lang.String getCurrentNode() {
		return _currentNode;
	}

	public java.lang.String getDestroyed() {
		return _destroyed;
	}

	public java.lang.String getDisabled() {
		return _disabled;
	}

	public java.lang.String getFillHeight() {
		return _fillHeight;
	}

	public java.lang.String getFocused() {
		return _focused;
	}

	public java.lang.String getFooterContent() {
		return _footerContent;
	}

	public java.lang.String getHeaderContent() {
		return _headerContent;
	}

	public java.lang.String getHeight() {
		return _height;
	}

	public java.lang.String getHideClass() {
		return _hideClass;
	}

	public java.lang.String getHideDelay() {
		return _hideDelay;
	}

	public java.lang.String getHideOn() {
		return _hideOn;
	}

	public java.lang.String getHideOnDocumentClick() {
		return _hideOnDocumentClick;
	}

	public java.lang.String getColorpickerId() {
		return _colorpickerId;
	}

	public java.lang.String getInitialized() {
		return _initialized;
	}

	public java.lang.String getPreventOverlap() {
		return _preventOverlap;
	}

	public java.lang.String getRender() {
		return _render;
	}

	public java.lang.String getRendered() {
		return _rendered;
	}

	public java.lang.String getShim() {
		return _shim;
	}

	public java.lang.String getShowDelay() {
		return _showDelay;
	}

	public java.lang.String getShowOn() {
		return _showOn;
	}

	public java.lang.String getSrcNode() {
		return _srcNode;
	}

	public java.lang.Object getStrings() {
		return _strings;
	}

	public java.lang.String getTabIndex() {
		return _tabIndex;
	}

	public java.lang.String getTrigger() {
		return _trigger;
	}

	public java.lang.String getVisible() {
		return _visible;
	}

	public java.lang.String getWidth() {
		return _width;
	}

	public java.lang.String getX() {
		return _x;
	}

	public java.lang.Object getXy() {
		return _xy;
	}

	public java.lang.String getY() {
		return _y;
	}

	public java.lang.String getZIndex() {
		return _zIndex;
	}

	public java.lang.String getAfterAlignChange() {
		return _afterAlignChange;
	}

	public java.lang.String getAfterBodyContentChange() {
		return _afterBodyContentChange;
	}

	public java.lang.String getAfterBoundingBoxChange() {
		return _afterBoundingBoxChange;
	}

	public java.lang.String getAfterCancellableHideChange() {
		return _afterCancellableHideChange;
	}

	public java.lang.String getAfterCenteredChange() {
		return _afterCenteredChange;
	}

	public java.lang.String getAfterConstrainChange() {
		return _afterConstrainChange;
	}

	public java.lang.String getAfterContentBoxChange() {
		return _afterContentBoxChange;
	}

	public java.lang.String getAfterCssClassChange() {
		return _afterCssClassChange;
	}

	public java.lang.String getAfterCurrentNodeChange() {
		return _afterCurrentNodeChange;
	}

	public java.lang.String getAfterDestroy() {
		return _afterDestroy;
	}

	public java.lang.String getAfterDestroyedChange() {
		return _afterDestroyedChange;
	}

	public java.lang.String getAfterDisabledChange() {
		return _afterDisabledChange;
	}

	public java.lang.String getAfterFillHeightChange() {
		return _afterFillHeightChange;
	}

	public java.lang.String getAfterFocusedChange() {
		return _afterFocusedChange;
	}

	public java.lang.String getAfterFooterContentChange() {
		return _afterFooterContentChange;
	}

	public java.lang.String getAfterHeaderContentChange() {
		return _afterHeaderContentChange;
	}

	public java.lang.String getAfterHeightChange() {
		return _afterHeightChange;
	}

	public java.lang.String getAfterHideClassChange() {
		return _afterHideClassChange;
	}

	public java.lang.String getAfterHideDelayChange() {
		return _afterHideDelayChange;
	}

	public java.lang.String getAfterHideOnChange() {
		return _afterHideOnChange;
	}

	public java.lang.String getAfterHideOnDocumentClickChange() {
		return _afterHideOnDocumentClickChange;
	}

	public java.lang.String getAfterIdChange() {
		return _afterIdChange;
	}

	public java.lang.String getAfterInit() {
		return _afterInit;
	}

	public java.lang.String getAfterInitializedChange() {
		return _afterInitializedChange;
	}

	public java.lang.String getAfterPreventOverlapChange() {
		return _afterPreventOverlapChange;
	}

	public java.lang.String getAfterRenderChange() {
		return _afterRenderChange;
	}

	public java.lang.String getAfterRenderedChange() {
		return _afterRenderedChange;
	}

	public java.lang.String getAfterShimChange() {
		return _afterShimChange;
	}

	public java.lang.String getAfterShowDelayChange() {
		return _afterShowDelayChange;
	}

	public java.lang.String getAfterShowOnChange() {
		return _afterShowOnChange;
	}

	public java.lang.String getAfterSrcNodeChange() {
		return _afterSrcNodeChange;
	}

	public java.lang.String getAfterStringsChange() {
		return _afterStringsChange;
	}

	public java.lang.String getAfterTabIndexChange() {
		return _afterTabIndexChange;
	}

	public java.lang.String getAfterTriggerChange() {
		return _afterTriggerChange;
	}

	public java.lang.String getAfterVisibleChange() {
		return _afterVisibleChange;
	}

	public java.lang.String getAfterContentUpdate() {
		return _afterContentUpdate;
	}

	public java.lang.String getAfterRender() {
		return _afterRender;
	}

	public java.lang.String getAfterWidthChange() {
		return _afterWidthChange;
	}

	public java.lang.String getAfterXChange() {
		return _afterXChange;
	}

	public java.lang.String getAfterXyChange() {
		return _afterXyChange;
	}

	public java.lang.String getAfterYChange() {
		return _afterYChange;
	}

	public java.lang.String getAfterZIndexChange() {
		return _afterZIndexChange;
	}

	public java.lang.String getOnAlignChange() {
		return _onAlignChange;
	}

	public java.lang.String getOnBodyContentChange() {
		return _onBodyContentChange;
	}

	public java.lang.String getOnBoundingBoxChange() {
		return _onBoundingBoxChange;
	}

	public java.lang.String getOnCancellableHideChange() {
		return _onCancellableHideChange;
	}

	public java.lang.String getOnCenteredChange() {
		return _onCenteredChange;
	}

	public java.lang.String getOnConstrainChange() {
		return _onConstrainChange;
	}

	public java.lang.String getOnContentBoxChange() {
		return _onContentBoxChange;
	}

	public java.lang.String getOnCssClassChange() {
		return _onCssClassChange;
	}

	public java.lang.String getOnCurrentNodeChange() {
		return _onCurrentNodeChange;
	}

	public java.lang.String getOnDestroy() {
		return _onDestroy;
	}

	public java.lang.String getOnDestroyedChange() {
		return _onDestroyedChange;
	}

	public java.lang.String getOnDisabledChange() {
		return _onDisabledChange;
	}

	public java.lang.String getOnFillHeightChange() {
		return _onFillHeightChange;
	}

	public java.lang.String getOnFocusedChange() {
		return _onFocusedChange;
	}

	public java.lang.String getOnFooterContentChange() {
		return _onFooterContentChange;
	}

	public java.lang.String getOnHeaderContentChange() {
		return _onHeaderContentChange;
	}

	public java.lang.String getOnHeightChange() {
		return _onHeightChange;
	}

	public java.lang.String getOnHideClassChange() {
		return _onHideClassChange;
	}

	public java.lang.String getOnHideDelayChange() {
		return _onHideDelayChange;
	}

	public java.lang.String getOnHideOnChange() {
		return _onHideOnChange;
	}

	public java.lang.String getOnHideOnDocumentClickChange() {
		return _onHideOnDocumentClickChange;
	}

	public java.lang.String getOnIdChange() {
		return _onIdChange;
	}

	public java.lang.String getOnInit() {
		return _onInit;
	}

	public java.lang.String getOnInitializedChange() {
		return _onInitializedChange;
	}

	public java.lang.String getOnPreventOverlapChange() {
		return _onPreventOverlapChange;
	}

	public java.lang.String getOnRenderChange() {
		return _onRenderChange;
	}

	public java.lang.String getOnRenderedChange() {
		return _onRenderedChange;
	}

	public java.lang.String getOnShimChange() {
		return _onShimChange;
	}

	public java.lang.String getOnShowDelayChange() {
		return _onShowDelayChange;
	}

	public java.lang.String getOnShowOnChange() {
		return _onShowOnChange;
	}

	public java.lang.String getOnSrcNodeChange() {
		return _onSrcNodeChange;
	}

	public java.lang.String getOnStringsChange() {
		return _onStringsChange;
	}

	public java.lang.String getOnTabIndexChange() {
		return _onTabIndexChange;
	}

	public java.lang.String getOnTriggerChange() {
		return _onTriggerChange;
	}

	public java.lang.String getOnVisibleChange() {
		return _onVisibleChange;
	}

	public java.lang.String getOnContentUpdate() {
		return _onContentUpdate;
	}

	public java.lang.String getOnRender() {
		return _onRender;
	}

	public java.lang.String getOnWidthChange() {
		return _onWidthChange;
	}

	public java.lang.String getOnXChange() {
		return _onXChange;
	}

	public java.lang.String getOnXyChange() {
		return _onXyChange;
	}

	public java.lang.String getOnYChange() {
		return _onYChange;
	}

	public java.lang.String getOnZIndexChange() {
		return _onZIndexChange;
	}

	public void setAlign(java.lang.Object align) {
		_align = align;

		setScopedAttribute("align", align);
	}

	public void setColorpickerBodyContent(java.lang.String colorpickerBodyContent) {
		_colorpickerBodyContent = colorpickerBodyContent;

		setScopedAttribute("colorpickerBodyContent", colorpickerBodyContent);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		_boundingBox = boundingBox;

		setScopedAttribute("boundingBox", boundingBox);
	}

	public void setCancellableHide(java.lang.String cancellableHide) {
		_cancellableHide = cancellableHide;

		setScopedAttribute("cancellableHide", cancellableHide);
	}

	public void setCentered(java.lang.String centered) {
		_centered = centered;

		setScopedAttribute("centered", centered);
	}

	public void setConstrain(java.lang.String constrain) {
		_constrain = constrain;

		setScopedAttribute("constrain", constrain);
	}

	public void setContentBox(java.lang.String contentBox) {
		_contentBox = contentBox;

		setScopedAttribute("contentBox", contentBox);
	}

	public void setCssClass(java.lang.String cssClass) {
		_cssClass = cssClass;

		setScopedAttribute("cssClass", cssClass);
	}

	public void setCurrentNode(java.lang.String currentNode) {
		_currentNode = currentNode;

		setScopedAttribute("currentNode", currentNode);
	}

	public void setDestroyed(java.lang.String destroyed) {
		_destroyed = destroyed;

		setScopedAttribute("destroyed", destroyed);
	}

	public void setDisabled(java.lang.String disabled) {
		_disabled = disabled;

		setScopedAttribute("disabled", disabled);
	}

	public void setFillHeight(java.lang.String fillHeight) {
		_fillHeight = fillHeight;

		setScopedAttribute("fillHeight", fillHeight);
	}

	public void setFocused(java.lang.String focused) {
		_focused = focused;

		setScopedAttribute("focused", focused);
	}

	public void setFooterContent(java.lang.String footerContent) {
		_footerContent = footerContent;

		setScopedAttribute("footerContent", footerContent);
	}

	public void setHeaderContent(java.lang.String headerContent) {
		_headerContent = headerContent;

		setScopedAttribute("headerContent", headerContent);
	}

	public void setHeight(java.lang.String height) {
		_height = height;

		setScopedAttribute("height", height);
	}

	public void setHideClass(java.lang.String hideClass) {
		_hideClass = hideClass;

		setScopedAttribute("hideClass", hideClass);
	}

	public void setHideDelay(java.lang.String hideDelay) {
		_hideDelay = hideDelay;

		setScopedAttribute("hideDelay", hideDelay);
	}

	public void setHideOn(java.lang.String hideOn) {
		_hideOn = hideOn;

		setScopedAttribute("hideOn", hideOn);
	}

	public void setHideOnDocumentClick(java.lang.String hideOnDocumentClick) {
		_hideOnDocumentClick = hideOnDocumentClick;

		setScopedAttribute("hideOnDocumentClick", hideOnDocumentClick);
	}

	public void setColorpickerId(java.lang.String colorpickerId) {
		_colorpickerId = colorpickerId;

		setScopedAttribute("colorpickerId", colorpickerId);
	}

	public void setInitialized(java.lang.String initialized) {
		_initialized = initialized;

		setScopedAttribute("initialized", initialized);
	}

	public void setPreventOverlap(java.lang.String preventOverlap) {
		_preventOverlap = preventOverlap;

		setScopedAttribute("preventOverlap", preventOverlap);
	}

	public void setRender(java.lang.String render) {
		_render = render;

		setScopedAttribute("render", render);
	}

	public void setRendered(java.lang.String rendered) {
		_rendered = rendered;

		setScopedAttribute("rendered", rendered);
	}

	public void setShim(java.lang.String shim) {
		_shim = shim;

		setScopedAttribute("shim", shim);
	}

	public void setShowDelay(java.lang.String showDelay) {
		_showDelay = showDelay;

		setScopedAttribute("showDelay", showDelay);
	}

	public void setShowOn(java.lang.String showOn) {
		_showOn = showOn;

		setScopedAttribute("showOn", showOn);
	}

	public void setSrcNode(java.lang.String srcNode) {
		_srcNode = srcNode;

		setScopedAttribute("srcNode", srcNode);
	}

	public void setStrings(java.lang.Object strings) {
		_strings = strings;

		setScopedAttribute("strings", strings);
	}

	public void setTabIndex(java.lang.String tabIndex) {
		_tabIndex = tabIndex;

		setScopedAttribute("tabIndex", tabIndex);
	}

	public void setTrigger(java.lang.String trigger) {
		_trigger = trigger;

		setScopedAttribute("trigger", trigger);
	}

	public void setVisible(java.lang.String visible) {
		_visible = visible;

		setScopedAttribute("visible", visible);
	}

	public void setWidth(java.lang.String width) {
		_width = width;

		setScopedAttribute("width", width);
	}

	public void setX(java.lang.String x) {
		_x = x;

		setScopedAttribute("x", x);
	}

	public void setXy(java.lang.Object xy) {
		_xy = xy;

		setScopedAttribute("xy", xy);
	}

	public void setY(java.lang.String y) {
		_y = y;

		setScopedAttribute("y", y);
	}

	public void setZIndex(java.lang.String zIndex) {
		_zIndex = zIndex;

		setScopedAttribute("zIndex", zIndex);
	}

	public void setAfterAlignChange(java.lang.String afterAlignChange) {
		_afterAlignChange = afterAlignChange;

		setScopedAttribute("afterAlignChange", afterAlignChange);
	}

	public void setAfterBodyContentChange(java.lang.String afterBodyContentChange) {
		_afterBodyContentChange = afterBodyContentChange;

		setScopedAttribute("afterBodyContentChange", afterBodyContentChange);
	}

	public void setAfterBoundingBoxChange(java.lang.String afterBoundingBoxChange) {
		_afterBoundingBoxChange = afterBoundingBoxChange;

		setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
	}

	public void setAfterCancellableHideChange(java.lang.String afterCancellableHideChange) {
		_afterCancellableHideChange = afterCancellableHideChange;

		setScopedAttribute("afterCancellableHideChange", afterCancellableHideChange);
	}

	public void setAfterCenteredChange(java.lang.String afterCenteredChange) {
		_afterCenteredChange = afterCenteredChange;

		setScopedAttribute("afterCenteredChange", afterCenteredChange);
	}

	public void setAfterConstrainChange(java.lang.String afterConstrainChange) {
		_afterConstrainChange = afterConstrainChange;

		setScopedAttribute("afterConstrainChange", afterConstrainChange);
	}

	public void setAfterContentBoxChange(java.lang.String afterContentBoxChange) {
		_afterContentBoxChange = afterContentBoxChange;

		setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
	}

	public void setAfterCssClassChange(java.lang.String afterCssClassChange) {
		_afterCssClassChange = afterCssClassChange;

		setScopedAttribute("afterCssClassChange", afterCssClassChange);
	}

	public void setAfterCurrentNodeChange(java.lang.String afterCurrentNodeChange) {
		_afterCurrentNodeChange = afterCurrentNodeChange;

		setScopedAttribute("afterCurrentNodeChange", afterCurrentNodeChange);
	}

	public void setAfterDestroy(java.lang.String afterDestroy) {
		_afterDestroy = afterDestroy;

		setScopedAttribute("afterDestroy", afterDestroy);
	}

	public void setAfterDestroyedChange(java.lang.String afterDestroyedChange) {
		_afterDestroyedChange = afterDestroyedChange;

		setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
	}

	public void setAfterDisabledChange(java.lang.String afterDisabledChange) {
		_afterDisabledChange = afterDisabledChange;

		setScopedAttribute("afterDisabledChange", afterDisabledChange);
	}

	public void setAfterFillHeightChange(java.lang.String afterFillHeightChange) {
		_afterFillHeightChange = afterFillHeightChange;

		setScopedAttribute("afterFillHeightChange", afterFillHeightChange);
	}

	public void setAfterFocusedChange(java.lang.String afterFocusedChange) {
		_afterFocusedChange = afterFocusedChange;

		setScopedAttribute("afterFocusedChange", afterFocusedChange);
	}

	public void setAfterFooterContentChange(java.lang.String afterFooterContentChange) {
		_afterFooterContentChange = afterFooterContentChange;

		setScopedAttribute("afterFooterContentChange", afterFooterContentChange);
	}

	public void setAfterHeaderContentChange(java.lang.String afterHeaderContentChange) {
		_afterHeaderContentChange = afterHeaderContentChange;

		setScopedAttribute("afterHeaderContentChange", afterHeaderContentChange);
	}

	public void setAfterHeightChange(java.lang.String afterHeightChange) {
		_afterHeightChange = afterHeightChange;

		setScopedAttribute("afterHeightChange", afterHeightChange);
	}

	public void setAfterHideClassChange(java.lang.String afterHideClassChange) {
		_afterHideClassChange = afterHideClassChange;

		setScopedAttribute("afterHideClassChange", afterHideClassChange);
	}

	public void setAfterHideDelayChange(java.lang.String afterHideDelayChange) {
		_afterHideDelayChange = afterHideDelayChange;

		setScopedAttribute("afterHideDelayChange", afterHideDelayChange);
	}

	public void setAfterHideOnChange(java.lang.String afterHideOnChange) {
		_afterHideOnChange = afterHideOnChange;

		setScopedAttribute("afterHideOnChange", afterHideOnChange);
	}

	public void setAfterHideOnDocumentClickChange(java.lang.String afterHideOnDocumentClickChange) {
		_afterHideOnDocumentClickChange = afterHideOnDocumentClickChange;

		setScopedAttribute("afterHideOnDocumentClickChange", afterHideOnDocumentClickChange);
	}

	public void setAfterIdChange(java.lang.String afterIdChange) {
		_afterIdChange = afterIdChange;

		setScopedAttribute("afterIdChange", afterIdChange);
	}

	public void setAfterInit(java.lang.String afterInit) {
		_afterInit = afterInit;

		setScopedAttribute("afterInit", afterInit);
	}

	public void setAfterInitializedChange(java.lang.String afterInitializedChange) {
		_afterInitializedChange = afterInitializedChange;

		setScopedAttribute("afterInitializedChange", afterInitializedChange);
	}

	public void setAfterPreventOverlapChange(java.lang.String afterPreventOverlapChange) {
		_afterPreventOverlapChange = afterPreventOverlapChange;

		setScopedAttribute("afterPreventOverlapChange", afterPreventOverlapChange);
	}

	public void setAfterRenderChange(java.lang.String afterRenderChange) {
		_afterRenderChange = afterRenderChange;

		setScopedAttribute("afterRenderChange", afterRenderChange);
	}

	public void setAfterRenderedChange(java.lang.String afterRenderedChange) {
		_afterRenderedChange = afterRenderedChange;

		setScopedAttribute("afterRenderedChange", afterRenderedChange);
	}

	public void setAfterShimChange(java.lang.String afterShimChange) {
		_afterShimChange = afterShimChange;

		setScopedAttribute("afterShimChange", afterShimChange);
	}

	public void setAfterShowDelayChange(java.lang.String afterShowDelayChange) {
		_afterShowDelayChange = afterShowDelayChange;

		setScopedAttribute("afterShowDelayChange", afterShowDelayChange);
	}

	public void setAfterShowOnChange(java.lang.String afterShowOnChange) {
		_afterShowOnChange = afterShowOnChange;

		setScopedAttribute("afterShowOnChange", afterShowOnChange);
	}

	public void setAfterSrcNodeChange(java.lang.String afterSrcNodeChange) {
		_afterSrcNodeChange = afterSrcNodeChange;

		setScopedAttribute("afterSrcNodeChange", afterSrcNodeChange);
	}

	public void setAfterStringsChange(java.lang.String afterStringsChange) {
		_afterStringsChange = afterStringsChange;

		setScopedAttribute("afterStringsChange", afterStringsChange);
	}

	public void setAfterTabIndexChange(java.lang.String afterTabIndexChange) {
		_afterTabIndexChange = afterTabIndexChange;

		setScopedAttribute("afterTabIndexChange", afterTabIndexChange);
	}

	public void setAfterTriggerChange(java.lang.String afterTriggerChange) {
		_afterTriggerChange = afterTriggerChange;

		setScopedAttribute("afterTriggerChange", afterTriggerChange);
	}

	public void setAfterVisibleChange(java.lang.String afterVisibleChange) {
		_afterVisibleChange = afterVisibleChange;

		setScopedAttribute("afterVisibleChange", afterVisibleChange);
	}

	public void setAfterContentUpdate(java.lang.String afterContentUpdate) {
		_afterContentUpdate = afterContentUpdate;

		setScopedAttribute("afterContentUpdate", afterContentUpdate);
	}

	public void setAfterRender(java.lang.String afterRender) {
		_afterRender = afterRender;

		setScopedAttribute("afterRender", afterRender);
	}

	public void setAfterWidthChange(java.lang.String afterWidthChange) {
		_afterWidthChange = afterWidthChange;

		setScopedAttribute("afterWidthChange", afterWidthChange);
	}

	public void setAfterXChange(java.lang.String afterXChange) {
		_afterXChange = afterXChange;

		setScopedAttribute("afterXChange", afterXChange);
	}

	public void setAfterXyChange(java.lang.String afterXyChange) {
		_afterXyChange = afterXyChange;

		setScopedAttribute("afterXyChange", afterXyChange);
	}

	public void setAfterYChange(java.lang.String afterYChange) {
		_afterYChange = afterYChange;

		setScopedAttribute("afterYChange", afterYChange);
	}

	public void setAfterZIndexChange(java.lang.String afterZIndexChange) {
		_afterZIndexChange = afterZIndexChange;

		setScopedAttribute("afterZIndexChange", afterZIndexChange);
	}

	public void setOnAlignChange(java.lang.String onAlignChange) {
		_onAlignChange = onAlignChange;

		setScopedAttribute("onAlignChange", onAlignChange);
	}

	public void setOnBodyContentChange(java.lang.String onBodyContentChange) {
		_onBodyContentChange = onBodyContentChange;

		setScopedAttribute("onBodyContentChange", onBodyContentChange);
	}

	public void setOnBoundingBoxChange(java.lang.String onBoundingBoxChange) {
		_onBoundingBoxChange = onBoundingBoxChange;

		setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
	}

	public void setOnCancellableHideChange(java.lang.String onCancellableHideChange) {
		_onCancellableHideChange = onCancellableHideChange;

		setScopedAttribute("onCancellableHideChange", onCancellableHideChange);
	}

	public void setOnCenteredChange(java.lang.String onCenteredChange) {
		_onCenteredChange = onCenteredChange;

		setScopedAttribute("onCenteredChange", onCenteredChange);
	}

	public void setOnConstrainChange(java.lang.String onConstrainChange) {
		_onConstrainChange = onConstrainChange;

		setScopedAttribute("onConstrainChange", onConstrainChange);
	}

	public void setOnContentBoxChange(java.lang.String onContentBoxChange) {
		_onContentBoxChange = onContentBoxChange;

		setScopedAttribute("onContentBoxChange", onContentBoxChange);
	}

	public void setOnCssClassChange(java.lang.String onCssClassChange) {
		_onCssClassChange = onCssClassChange;

		setScopedAttribute("onCssClassChange", onCssClassChange);
	}

	public void setOnCurrentNodeChange(java.lang.String onCurrentNodeChange) {
		_onCurrentNodeChange = onCurrentNodeChange;

		setScopedAttribute("onCurrentNodeChange", onCurrentNodeChange);
	}

	public void setOnDestroy(java.lang.String onDestroy) {
		_onDestroy = onDestroy;

		setScopedAttribute("onDestroy", onDestroy);
	}

	public void setOnDestroyedChange(java.lang.String onDestroyedChange) {
		_onDestroyedChange = onDestroyedChange;

		setScopedAttribute("onDestroyedChange", onDestroyedChange);
	}

	public void setOnDisabledChange(java.lang.String onDisabledChange) {
		_onDisabledChange = onDisabledChange;

		setScopedAttribute("onDisabledChange", onDisabledChange);
	}

	public void setOnFillHeightChange(java.lang.String onFillHeightChange) {
		_onFillHeightChange = onFillHeightChange;

		setScopedAttribute("onFillHeightChange", onFillHeightChange);
	}

	public void setOnFocusedChange(java.lang.String onFocusedChange) {
		_onFocusedChange = onFocusedChange;

		setScopedAttribute("onFocusedChange", onFocusedChange);
	}

	public void setOnFooterContentChange(java.lang.String onFooterContentChange) {
		_onFooterContentChange = onFooterContentChange;

		setScopedAttribute("onFooterContentChange", onFooterContentChange);
	}

	public void setOnHeaderContentChange(java.lang.String onHeaderContentChange) {
		_onHeaderContentChange = onHeaderContentChange;

		setScopedAttribute("onHeaderContentChange", onHeaderContentChange);
	}

	public void setOnHeightChange(java.lang.String onHeightChange) {
		_onHeightChange = onHeightChange;

		setScopedAttribute("onHeightChange", onHeightChange);
	}

	public void setOnHideClassChange(java.lang.String onHideClassChange) {
		_onHideClassChange = onHideClassChange;

		setScopedAttribute("onHideClassChange", onHideClassChange);
	}

	public void setOnHideDelayChange(java.lang.String onHideDelayChange) {
		_onHideDelayChange = onHideDelayChange;

		setScopedAttribute("onHideDelayChange", onHideDelayChange);
	}

	public void setOnHideOnChange(java.lang.String onHideOnChange) {
		_onHideOnChange = onHideOnChange;

		setScopedAttribute("onHideOnChange", onHideOnChange);
	}

	public void setOnHideOnDocumentClickChange(java.lang.String onHideOnDocumentClickChange) {
		_onHideOnDocumentClickChange = onHideOnDocumentClickChange;

		setScopedAttribute("onHideOnDocumentClickChange", onHideOnDocumentClickChange);
	}

	public void setOnIdChange(java.lang.String onIdChange) {
		_onIdChange = onIdChange;

		setScopedAttribute("onIdChange", onIdChange);
	}

	public void setOnInit(java.lang.String onInit) {
		_onInit = onInit;

		setScopedAttribute("onInit", onInit);
	}

	public void setOnInitializedChange(java.lang.String onInitializedChange) {
		_onInitializedChange = onInitializedChange;

		setScopedAttribute("onInitializedChange", onInitializedChange);
	}

	public void setOnPreventOverlapChange(java.lang.String onPreventOverlapChange) {
		_onPreventOverlapChange = onPreventOverlapChange;

		setScopedAttribute("onPreventOverlapChange", onPreventOverlapChange);
	}

	public void setOnRenderChange(java.lang.String onRenderChange) {
		_onRenderChange = onRenderChange;

		setScopedAttribute("onRenderChange", onRenderChange);
	}

	public void setOnRenderedChange(java.lang.String onRenderedChange) {
		_onRenderedChange = onRenderedChange;

		setScopedAttribute("onRenderedChange", onRenderedChange);
	}

	public void setOnShimChange(java.lang.String onShimChange) {
		_onShimChange = onShimChange;

		setScopedAttribute("onShimChange", onShimChange);
	}

	public void setOnShowDelayChange(java.lang.String onShowDelayChange) {
		_onShowDelayChange = onShowDelayChange;

		setScopedAttribute("onShowDelayChange", onShowDelayChange);
	}

	public void setOnShowOnChange(java.lang.String onShowOnChange) {
		_onShowOnChange = onShowOnChange;

		setScopedAttribute("onShowOnChange", onShowOnChange);
	}

	public void setOnSrcNodeChange(java.lang.String onSrcNodeChange) {
		_onSrcNodeChange = onSrcNodeChange;

		setScopedAttribute("onSrcNodeChange", onSrcNodeChange);
	}

	public void setOnStringsChange(java.lang.String onStringsChange) {
		_onStringsChange = onStringsChange;

		setScopedAttribute("onStringsChange", onStringsChange);
	}

	public void setOnTabIndexChange(java.lang.String onTabIndexChange) {
		_onTabIndexChange = onTabIndexChange;

		setScopedAttribute("onTabIndexChange", onTabIndexChange);
	}

	public void setOnTriggerChange(java.lang.String onTriggerChange) {
		_onTriggerChange = onTriggerChange;

		setScopedAttribute("onTriggerChange", onTriggerChange);
	}

	public void setOnVisibleChange(java.lang.String onVisibleChange) {
		_onVisibleChange = onVisibleChange;

		setScopedAttribute("onVisibleChange", onVisibleChange);
	}

	public void setOnContentUpdate(java.lang.String onContentUpdate) {
		_onContentUpdate = onContentUpdate;

		setScopedAttribute("onContentUpdate", onContentUpdate);
	}

	public void setOnRender(java.lang.String onRender) {
		_onRender = onRender;

		setScopedAttribute("onRender", onRender);
	}

	public void setOnWidthChange(java.lang.String onWidthChange) {
		_onWidthChange = onWidthChange;

		setScopedAttribute("onWidthChange", onWidthChange);
	}

	public void setOnXChange(java.lang.String onXChange) {
		_onXChange = onXChange;

		setScopedAttribute("onXChange", onXChange);
	}

	public void setOnXyChange(java.lang.String onXyChange) {
		_onXyChange = onXyChange;

		setScopedAttribute("onXyChange", onXyChange);
	}

	public void setOnYChange(java.lang.String onYChange) {
		_onYChange = onYChange;

		setScopedAttribute("onYChange", onYChange);
	}

	public void setOnZIndexChange(java.lang.String onZIndexChange) {
		_onZIndexChange = onZIndexChange;

		setScopedAttribute("onZIndexChange", onZIndexChange);
	}

	protected void _setAttributes(HttpServletRequest request) {
		setNamespacedAttribute(request, "align", _align);
		setNamespacedAttribute(request, "colorpickerBodyContent", _colorpickerBodyContent);
		setNamespacedAttribute(request, "boundingBox", _boundingBox);
		setNamespacedAttribute(request, "cancellableHide", _cancellableHide);
		setNamespacedAttribute(request, "centered", _centered);
		setNamespacedAttribute(request, "constrain", _constrain);
		setNamespacedAttribute(request, "contentBox", _contentBox);
		setNamespacedAttribute(request, "cssClass", _cssClass);
		setNamespacedAttribute(request, "currentNode", _currentNode);
		setNamespacedAttribute(request, "destroyed", _destroyed);
		setNamespacedAttribute(request, "disabled", _disabled);
		setNamespacedAttribute(request, "fillHeight", _fillHeight);
		setNamespacedAttribute(request, "focused", _focused);
		setNamespacedAttribute(request, "footerContent", _footerContent);
		setNamespacedAttribute(request, "headerContent", _headerContent);
		setNamespacedAttribute(request, "height", _height);
		setNamespacedAttribute(request, "hideClass", _hideClass);
		setNamespacedAttribute(request, "hideDelay", _hideDelay);
		setNamespacedAttribute(request, "hideOn", _hideOn);
		setNamespacedAttribute(request, "hideOnDocumentClick", _hideOnDocumentClick);
		setNamespacedAttribute(request, "colorpickerId", _colorpickerId);
		setNamespacedAttribute(request, "initialized", _initialized);
		setNamespacedAttribute(request, "preventOverlap", _preventOverlap);
		setNamespacedAttribute(request, "render", _render);
		setNamespacedAttribute(request, "rendered", _rendered);
		setNamespacedAttribute(request, "shim", _shim);
		setNamespacedAttribute(request, "showDelay", _showDelay);
		setNamespacedAttribute(request, "showOn", _showOn);
		setNamespacedAttribute(request, "srcNode", _srcNode);
		setNamespacedAttribute(request, "strings", _strings);
		setNamespacedAttribute(request, "tabIndex", _tabIndex);
		setNamespacedAttribute(request, "trigger", _trigger);
		setNamespacedAttribute(request, "visible", _visible);
		setNamespacedAttribute(request, "width", _width);
		setNamespacedAttribute(request, "x", _x);
		setNamespacedAttribute(request, "xy", _xy);
		setNamespacedAttribute(request, "y", _y);
		setNamespacedAttribute(request, "zIndex", _zIndex);
		setNamespacedAttribute(request, "afterAlignChange", _afterAlignChange);
		setNamespacedAttribute(request, "afterBodyContentChange", _afterBodyContentChange);
		setNamespacedAttribute(request, "afterBoundingBoxChange", _afterBoundingBoxChange);
		setNamespacedAttribute(request, "afterCancellableHideChange", _afterCancellableHideChange);
		setNamespacedAttribute(request, "afterCenteredChange", _afterCenteredChange);
		setNamespacedAttribute(request, "afterConstrainChange", _afterConstrainChange);
		setNamespacedAttribute(request, "afterContentBoxChange", _afterContentBoxChange);
		setNamespacedAttribute(request, "afterCssClassChange", _afterCssClassChange);
		setNamespacedAttribute(request, "afterCurrentNodeChange", _afterCurrentNodeChange);
		setNamespacedAttribute(request, "afterDestroy", _afterDestroy);
		setNamespacedAttribute(request, "afterDestroyedChange", _afterDestroyedChange);
		setNamespacedAttribute(request, "afterDisabledChange", _afterDisabledChange);
		setNamespacedAttribute(request, "afterFillHeightChange", _afterFillHeightChange);
		setNamespacedAttribute(request, "afterFocusedChange", _afterFocusedChange);
		setNamespacedAttribute(request, "afterFooterContentChange", _afterFooterContentChange);
		setNamespacedAttribute(request, "afterHeaderContentChange", _afterHeaderContentChange);
		setNamespacedAttribute(request, "afterHeightChange", _afterHeightChange);
		setNamespacedAttribute(request, "afterHideClassChange", _afterHideClassChange);
		setNamespacedAttribute(request, "afterHideDelayChange", _afterHideDelayChange);
		setNamespacedAttribute(request, "afterHideOnChange", _afterHideOnChange);
		setNamespacedAttribute(request, "afterHideOnDocumentClickChange", _afterHideOnDocumentClickChange);
		setNamespacedAttribute(request, "afterIdChange", _afterIdChange);
		setNamespacedAttribute(request, "afterInit", _afterInit);
		setNamespacedAttribute(request, "afterInitializedChange", _afterInitializedChange);
		setNamespacedAttribute(request, "afterPreventOverlapChange", _afterPreventOverlapChange);
		setNamespacedAttribute(request, "afterRenderChange", _afterRenderChange);
		setNamespacedAttribute(request, "afterRenderedChange", _afterRenderedChange);
		setNamespacedAttribute(request, "afterShimChange", _afterShimChange);
		setNamespacedAttribute(request, "afterShowDelayChange", _afterShowDelayChange);
		setNamespacedAttribute(request, "afterShowOnChange", _afterShowOnChange);
		setNamespacedAttribute(request, "afterSrcNodeChange", _afterSrcNodeChange);
		setNamespacedAttribute(request, "afterStringsChange", _afterStringsChange);
		setNamespacedAttribute(request, "afterTabIndexChange", _afterTabIndexChange);
		setNamespacedAttribute(request, "afterTriggerChange", _afterTriggerChange);
		setNamespacedAttribute(request, "afterVisibleChange", _afterVisibleChange);
		setNamespacedAttribute(request, "afterContentUpdate", _afterContentUpdate);
		setNamespacedAttribute(request, "afterRender", _afterRender);
		setNamespacedAttribute(request, "afterWidthChange", _afterWidthChange);
		setNamespacedAttribute(request, "afterXChange", _afterXChange);
		setNamespacedAttribute(request, "afterXyChange", _afterXyChange);
		setNamespacedAttribute(request, "afterYChange", _afterYChange);
		setNamespacedAttribute(request, "afterZIndexChange", _afterZIndexChange);
		setNamespacedAttribute(request, "onAlignChange", _onAlignChange);
		setNamespacedAttribute(request, "onBodyContentChange", _onBodyContentChange);
		setNamespacedAttribute(request, "onBoundingBoxChange", _onBoundingBoxChange);
		setNamespacedAttribute(request, "onCancellableHideChange", _onCancellableHideChange);
		setNamespacedAttribute(request, "onCenteredChange", _onCenteredChange);
		setNamespacedAttribute(request, "onConstrainChange", _onConstrainChange);
		setNamespacedAttribute(request, "onContentBoxChange", _onContentBoxChange);
		setNamespacedAttribute(request, "onCssClassChange", _onCssClassChange);
		setNamespacedAttribute(request, "onCurrentNodeChange", _onCurrentNodeChange);
		setNamespacedAttribute(request, "onDestroy", _onDestroy);
		setNamespacedAttribute(request, "onDestroyedChange", _onDestroyedChange);
		setNamespacedAttribute(request, "onDisabledChange", _onDisabledChange);
		setNamespacedAttribute(request, "onFillHeightChange", _onFillHeightChange);
		setNamespacedAttribute(request, "onFocusedChange", _onFocusedChange);
		setNamespacedAttribute(request, "onFooterContentChange", _onFooterContentChange);
		setNamespacedAttribute(request, "onHeaderContentChange", _onHeaderContentChange);
		setNamespacedAttribute(request, "onHeightChange", _onHeightChange);
		setNamespacedAttribute(request, "onHideClassChange", _onHideClassChange);
		setNamespacedAttribute(request, "onHideDelayChange", _onHideDelayChange);
		setNamespacedAttribute(request, "onHideOnChange", _onHideOnChange);
		setNamespacedAttribute(request, "onHideOnDocumentClickChange", _onHideOnDocumentClickChange);
		setNamespacedAttribute(request, "onIdChange", _onIdChange);
		setNamespacedAttribute(request, "onInit", _onInit);
		setNamespacedAttribute(request, "onInitializedChange", _onInitializedChange);
		setNamespacedAttribute(request, "onPreventOverlapChange", _onPreventOverlapChange);
		setNamespacedAttribute(request, "onRenderChange", _onRenderChange);
		setNamespacedAttribute(request, "onRenderedChange", _onRenderedChange);
		setNamespacedAttribute(request, "onShimChange", _onShimChange);
		setNamespacedAttribute(request, "onShowDelayChange", _onShowDelayChange);
		setNamespacedAttribute(request, "onShowOnChange", _onShowOnChange);
		setNamespacedAttribute(request, "onSrcNodeChange", _onSrcNodeChange);
		setNamespacedAttribute(request, "onStringsChange", _onStringsChange);
		setNamespacedAttribute(request, "onTabIndexChange", _onTabIndexChange);
		setNamespacedAttribute(request, "onTriggerChange", _onTriggerChange);
		setNamespacedAttribute(request, "onVisibleChange", _onVisibleChange);
		setNamespacedAttribute(request, "onContentUpdate", _onContentUpdate);
		setNamespacedAttribute(request, "onRender", _onRender);
		setNamespacedAttribute(request, "onWidthChange", _onWidthChange);
		setNamespacedAttribute(request, "onXChange", _onXChange);
		setNamespacedAttribute(request, "onXyChange", _onXyChange);
		setNamespacedAttribute(request, "onYChange", _onYChange);
		setNamespacedAttribute(request, "onZIndexChange", _onZIndexChange);
	}

	private static final String _ATTRIBUTE_NAMESPACE = "alloy:color-picker:";

	private static final String _PAGE =
		"/html/taglib/alloy/color_picker/page.jsp";

	private java.lang.Object _align;
	private java.lang.String _colorpickerBodyContent;
	private java.lang.String _boundingBox;
	private java.lang.String _cancellableHide;
	private java.lang.String _centered;
	private java.lang.String _constrain;
	private java.lang.String _contentBox;
	private java.lang.String _cssClass;
	private java.lang.String _currentNode;
	private java.lang.String _destroyed;
	private java.lang.String _disabled;
	private java.lang.String _fillHeight;
	private java.lang.String _focused;
	private java.lang.String _footerContent;
	private java.lang.String _headerContent;
	private java.lang.String _height;
	private java.lang.String _hideClass;
	private java.lang.String _hideDelay;
	private java.lang.String _hideOn;
	private java.lang.String _hideOnDocumentClick;
	private java.lang.String _colorpickerId;
	private java.lang.String _initialized;
	private java.lang.String _preventOverlap;
	private java.lang.String _render;
	private java.lang.String _rendered;
	private java.lang.String _shim;
	private java.lang.String _showDelay;
	private java.lang.String _showOn;
	private java.lang.String _srcNode;
	private java.lang.Object _strings;
	private java.lang.String _tabIndex;
	private java.lang.String _trigger;
	private java.lang.String _visible;
	private java.lang.String _width;
	private java.lang.String _x;
	private java.lang.Object _xy;
	private java.lang.String _y;
	private java.lang.String _zIndex;
	private java.lang.String _afterAlignChange;
	private java.lang.String _afterBodyContentChange;
	private java.lang.String _afterBoundingBoxChange;
	private java.lang.String _afterCancellableHideChange;
	private java.lang.String _afterCenteredChange;
	private java.lang.String _afterConstrainChange;
	private java.lang.String _afterContentBoxChange;
	private java.lang.String _afterCssClassChange;
	private java.lang.String _afterCurrentNodeChange;
	private java.lang.String _afterDestroy;
	private java.lang.String _afterDestroyedChange;
	private java.lang.String _afterDisabledChange;
	private java.lang.String _afterFillHeightChange;
	private java.lang.String _afterFocusedChange;
	private java.lang.String _afterFooterContentChange;
	private java.lang.String _afterHeaderContentChange;
	private java.lang.String _afterHeightChange;
	private java.lang.String _afterHideClassChange;
	private java.lang.String _afterHideDelayChange;
	private java.lang.String _afterHideOnChange;
	private java.lang.String _afterHideOnDocumentClickChange;
	private java.lang.String _afterIdChange;
	private java.lang.String _afterInit;
	private java.lang.String _afterInitializedChange;
	private java.lang.String _afterPreventOverlapChange;
	private java.lang.String _afterRenderChange;
	private java.lang.String _afterRenderedChange;
	private java.lang.String _afterShimChange;
	private java.lang.String _afterShowDelayChange;
	private java.lang.String _afterShowOnChange;
	private java.lang.String _afterSrcNodeChange;
	private java.lang.String _afterStringsChange;
	private java.lang.String _afterTabIndexChange;
	private java.lang.String _afterTriggerChange;
	private java.lang.String _afterVisibleChange;
	private java.lang.String _afterContentUpdate;
	private java.lang.String _afterRender;
	private java.lang.String _afterWidthChange;
	private java.lang.String _afterXChange;
	private java.lang.String _afterXyChange;
	private java.lang.String _afterYChange;
	private java.lang.String _afterZIndexChange;
	private java.lang.String _onAlignChange;
	private java.lang.String _onBodyContentChange;
	private java.lang.String _onBoundingBoxChange;
	private java.lang.String _onCancellableHideChange;
	private java.lang.String _onCenteredChange;
	private java.lang.String _onConstrainChange;
	private java.lang.String _onContentBoxChange;
	private java.lang.String _onCssClassChange;
	private java.lang.String _onCurrentNodeChange;
	private java.lang.String _onDestroy;
	private java.lang.String _onDestroyedChange;
	private java.lang.String _onDisabledChange;
	private java.lang.String _onFillHeightChange;
	private java.lang.String _onFocusedChange;
	private java.lang.String _onFooterContentChange;
	private java.lang.String _onHeaderContentChange;
	private java.lang.String _onHeightChange;
	private java.lang.String _onHideClassChange;
	private java.lang.String _onHideDelayChange;
	private java.lang.String _onHideOnChange;
	private java.lang.String _onHideOnDocumentClickChange;
	private java.lang.String _onIdChange;
	private java.lang.String _onInit;
	private java.lang.String _onInitializedChange;
	private java.lang.String _onPreventOverlapChange;
	private java.lang.String _onRenderChange;
	private java.lang.String _onRenderedChange;
	private java.lang.String _onShimChange;
	private java.lang.String _onShowDelayChange;
	private java.lang.String _onShowOnChange;
	private java.lang.String _onSrcNodeChange;
	private java.lang.String _onStringsChange;
	private java.lang.String _onTabIndexChange;
	private java.lang.String _onTriggerChange;
	private java.lang.String _onVisibleChange;
	private java.lang.String _onContentUpdate;
	private java.lang.String _onRender;
	private java.lang.String _onWidthChange;
	private java.lang.String _onXChange;
	private java.lang.String _onXyChange;
	private java.lang.String _onYChange;
	private java.lang.String _onZIndexChange;

}
