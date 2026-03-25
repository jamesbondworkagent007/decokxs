package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.edit.OKEditText;
import o.C47315tni;

/* JADX INFO: renamed from: o.trc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47518trc extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final ConstraintLayout OLrzqt;
    public final OKEditText copydefault;

    public AbstractC47518trc(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, OKEditText oKEditText, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = constraintLayout;
        this.copydefault = oKEditText;
        this.AEQbTJ = textView;
    }

    public static AbstractC47518trc EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return AEQbTJ(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47518trc AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47518trc) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.DCUTEIdCUTEI, viewGroup, z, obj);
    }
}
