package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.trk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47526trk extends ViewDataBinding {
    public final android.widget.ToggleButton AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.ToggleButton AhwBna;
    public final android.widget.TextView DbNXlk;
    public final android.widget.TextView EZpvd;
    public final android.widget.ToggleButton KWHzl;
    public final android.widget.ToggleButton OLrzqt;
    public final android.widget.LinearLayout copydefault;
    public final android.widget.ToggleButton djBIcL;
    public final android.widget.TextView fetchVPNInfo;
    public final android.widget.ToggleButton gEmmrt;
    public final android.widget.ToggleButton valueOf;
    public final android.widget.LinearLayout values;

    public AbstractC47526trk(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, android.widget.TextView textView, android.widget.ToggleButton toggleButton, android.widget.ToggleButton toggleButton2, android.widget.ToggleButton toggleButton3, android.widget.ToggleButton toggleButton4, android.widget.ToggleButton toggleButton5, android.widget.ToggleButton toggleButton6, android.widget.ToggleButton toggleButton7, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.TextView textView4, android.widget.LinearLayout linearLayout2) {
        super(obj, view, i);
        this.copydefault = linearLayout;
        this.EZpvd = textView;
        this.KWHzl = toggleButton;
        this.AEQbTJ = toggleButton2;
        this.OLrzqt = toggleButton3;
        this.djBIcL = toggleButton4;
        this.gEmmrt = toggleButton5;
        this.AhwBna = toggleButton6;
        this.valueOf = toggleButton7;
        this.AYXKKw = textView2;
        this.DbNXlk = textView3;
        this.fetchVPNInfo = textView4;
        this.values = linearLayout2;
    }

    public static AbstractC47526trk copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47526trk copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47526trk) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.run, viewGroup, z, obj);
    }
}
