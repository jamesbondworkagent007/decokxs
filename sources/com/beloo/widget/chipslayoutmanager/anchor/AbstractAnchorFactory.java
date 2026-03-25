package com.beloo.widget.chipslayoutmanager.anchor;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.beloo.widget.chipslayoutmanager.layouter.ICanvas;

/* JADX INFO: loaded from: classes21.dex */
abstract class AbstractAnchorFactory implements IAnchorFactory {
    private ICanvas canvas;
    RecyclerView.LayoutManager lm;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ICanvas getCanvas() {
        return this.canvas;
    }

    public AbstractAnchorFactory(RecyclerView.LayoutManager layoutManager, ICanvas iCanvas) {
        this.lm = layoutManager;
        this.canvas = iCanvas;
    }

    public AnchorViewState createAnchorState(View view) {
        return new AnchorViewState(this.lm.getPosition(view), this.canvas.getViewRect(view));
    }

    @Override // com.beloo.widget.chipslayoutmanager.anchor.IAnchorFactory
    public AnchorViewState createNotFound() {
        return AnchorViewState.getNotFoundState();
    }
}
