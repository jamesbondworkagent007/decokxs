package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uRO extends ViewDataBinding {
    public final AppCompatTextView EZpvd;
    public final RecyclerView KWHzl;

    public uRO(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.KWHzl = recyclerView;
        this.EZpvd = appCompatTextView;
    }
}
