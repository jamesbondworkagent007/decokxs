package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.edit.OKEditText;
import o.C47315tni;

/* JADX INFO: renamed from: o.tre, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47520tre extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final OKEditText copydefault;

    public AbstractC47520tre(java.lang.Object obj, android.view.View view, int i, OKEditText oKEditText, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.copydefault = oKEditText;
        this.AEQbTJ = textView;
        this.EZpvd = textView2;
    }

    public static AbstractC47520tre EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47520tre copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47520tre) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.DGOPHZ, viewGroup, z, obj);
    }
}
