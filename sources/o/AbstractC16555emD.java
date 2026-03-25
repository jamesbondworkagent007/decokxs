package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.emD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16555emD extends ViewDataBinding {
    public final AppCompatTextView AEQbTJ;
    public final RecyclerView copydefault;

    public AbstractC16555emD(java.lang.Object obj, android.view.View view, int i, RecyclerView recyclerView, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.copydefault = recyclerView;
        this.AEQbTJ = appCompatTextView;
    }
}
