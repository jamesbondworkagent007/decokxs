package o;

import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47330tnx extends ViewDataBinding {
    public final C55178xez AEQbTJ;
    public final Guideline OLrzqt;
    public final android.widget.ImageView copydefault;

    public AbstractC47330tnx(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, Guideline guideline, C55178xez c55178xez) {
        super(obj, view, i);
        this.copydefault = imageView;
        this.OLrzqt = guideline;
        this.AEQbTJ = c55178xez;
    }

    public static AbstractC47330tnx AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return EZpvd(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47330tnx EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47330tnx) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.djBIcL, null, false, obj);
    }
}
