package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C35399nuc;

/* JADX INFO: renamed from: o.nMe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33959nMe extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.ImageView KWHzl;
    public final ConstraintLayout OLrzqt;
    public final android.widget.TextView copydefault;

    public AbstractC33959nMe(java.lang.Object obj, android.view.View view, int i, ConstraintLayout constraintLayout, android.widget.ImageView imageView, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.OLrzqt = constraintLayout;
        this.KWHzl = imageView;
        this.copydefault = textView;
        this.AEQbTJ = textView2;
    }

    public static AbstractC33959nMe KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return KWHzl(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC33959nMe KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC33959nMe) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.zDUObI, viewGroup, z, obj);
    }
}
