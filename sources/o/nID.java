package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nID extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final androidx.appcompat.widget.Toolbar EZpvd;
    public final android.widget.FrameLayout OLrzqt;
    public final android.widget.LinearLayout copydefault;

    public nID(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, android.widget.LinearLayout linearLayout, androidx.appcompat.widget.Toolbar toolbar, android.widget.TextView textView) {
        super(obj, view, i);
        this.OLrzqt = frameLayout;
        this.copydefault = linearLayout;
        this.EZpvd = toolbar;
        this.AEQbTJ = textView;
    }

    public static nID AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return KWHzl(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static nID KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (nID) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.wlaJM, null, false, obj);
    }
}
