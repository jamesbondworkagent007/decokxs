package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.tabs.TabLayout;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47326tnt extends ViewDataBinding {
    public final TabLayout KWHzl;
    public final C33542myS OLrzqt;

    public AbstractC47326tnt(java.lang.Object obj, android.view.View view, int i, TabLayout tabLayout, C33542myS c33542myS) {
        super(obj, view, i);
        this.KWHzl = tabLayout;
        this.OLrzqt = c33542myS;
    }

    public static AbstractC47326tnt copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return AEQbTJ(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47326tnt AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47326tnt) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.EZpvd, null, false, obj);
    }
}
