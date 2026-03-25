package com.beloo.widget.chipslayoutmanager;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes21.dex */
public class ChildViewsIterable implements Iterable<View> {
    private RecyclerView.LayoutManager layoutManager;

    public ChildViewsIterable(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    @Override // java.lang.Iterable
    public Iterator<View> iterator() {
        return new Iterator<View>() { // from class: com.beloo.widget.chipslayoutmanager.ChildViewsIterable.1
            int i = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.i < ChildViewsIterable.this.layoutManager.getChildCount();
            }

            /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public View next() {
                RecyclerView.LayoutManager layoutManager = ChildViewsIterable.this.layoutManager;
                int i = this.i;
                this.i = i + 1;
                return layoutManager.getChildAt(i);
            }
        };
    }

    public int size() {
        return this.layoutManager.getChildCount();
    }
}
