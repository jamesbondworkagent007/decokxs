package com.beloo.widget.chipslayoutmanager.util.log;

import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;

/* JADX INFO: loaded from: classes21.dex */
public interface IFillLogger {
    void onAfterLayouter();

    void onAfterRemovingViews();

    void onBeforeLayouter(AnchorViewState anchorViewState);

    void onFinishedLayouter();

    void onItemRecycled();

    void onItemRequested();

    void onRemovedAndRecycled(int i);

    void onStartLayouter(int i);
}
