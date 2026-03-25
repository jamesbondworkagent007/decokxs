package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.uilab.view.OKSortTextView;
import o.C47315tni;

/* JADX INFO: renamed from: o.top, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47375top extends ViewDataBinding {
    public final OKSortTextView AEQbTJ;
    public final RecyclerView EZpvd;
    public final C6989aZl KWHzl;
    public final android.widget.RelativeLayout OLrzqt;
    public final C33546myW copydefault;

    public AbstractC47375top(java.lang.Object obj, android.view.View view, int i, OKSortTextView oKSortTextView, C6989aZl c6989aZl, android.widget.RelativeLayout relativeLayout, RecyclerView recyclerView, C33546myW c33546myW) {
        super(obj, view, i);
        this.AEQbTJ = oKSortTextView;
        this.KWHzl = c6989aZl;
        this.OLrzqt = relativeLayout;
        this.EZpvd = recyclerView;
        this.copydefault = c33546myW;
    }

    public static AbstractC47375top OLrzqt(@androidx.annotation.NonNull android.view.View view) {
        return copydefault(view, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47375top copydefault(@androidx.annotation.NonNull android.view.View view, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47375top) ViewDataBinding.bind(obj, view, C47315tni.ActionBar.gHZMYf);
    }
}
