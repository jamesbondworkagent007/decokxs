package o;

import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import o.C35399nuc;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nNV extends ViewDataBinding {
    public final AppCompatCheckBox AEQbTJ;

    @Bindable
    public GroupMemberInfo AYXKKw;
    public final android.widget.TextView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView DbNXlk;
    public final android.widget.TextView EZpvd;
    public final ConstraintLayout KWHzl;
    public final ConstraintLayout OLrzqt;
    public final C35893oHp copydefault;
    public final android.widget.TextView djBIcL;
    public final C55251xgS gEmmrt;
    public final android.widget.TextView valueOf;
    public final android.widget.TextView values;

    public nNV(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, AppCompatCheckBox appCompatCheckBox, ConstraintLayout constraintLayout, C35893oHp c35893oHp, ConstraintLayout constraintLayout2, C55251xgS c55251xgS, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.TextView textView5, android.widget.TextView textView6, android.widget.TextView textView7) {
        super(obj, view, i);
        this.EZpvd = textView;
        this.AEQbTJ = appCompatCheckBox;
        this.KWHzl = constraintLayout;
        this.copydefault = c35893oHp;
        this.OLrzqt = constraintLayout2;
        this.gEmmrt = c55251xgS;
        this.djBIcL = textView2;
        this.AhwBna = textView3;
        this.valueOf = textView4;
        this.values = textView5;
        this.AkhnZx = textView6;
        this.DbNXlk = textView7;
    }

    public static nNV KWHzl(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return EZpvd(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static nNV EZpvd(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (nNV) ViewDataBinding.inflateInternal(layoutInflater, C35399nuc.Dialog.fXYAwm, viewGroup, z, obj);
    }
}
