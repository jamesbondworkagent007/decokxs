package com.beloo.widget.chipslayoutmanager.anchor;

/* JADX INFO: loaded from: classes21.dex */
public interface IAnchorFactory {
    AnchorViewState createNotFound();

    AnchorViewState getAnchor();

    void resetRowCoordinates(AnchorViewState anchorViewState);
}
