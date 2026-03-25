package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47287tnG extends ViewDataBinding {
    public final android.widget.FrameLayout EZpvd;
    public final C55230xfy OLrzqt;
    public final android.widget.LinearLayout copydefault;

    public AbstractC47287tnG(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, C55230xfy c55230xfy, android.widget.FrameLayout frameLayout) {
        super(obj, view, i);
        this.copydefault = linearLayout;
        this.OLrzqt = c55230xfy;
        this.EZpvd = frameLayout;
    }

    public static AbstractC47287tnG AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return copydefault(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47287tnG copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47287tnG) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.DbNXlk, null, false, obj);
    }
}
