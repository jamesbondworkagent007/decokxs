package o;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import o.C47315tni;

/* JADX INFO: renamed from: o.toj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47369toj extends ViewDataBinding {
    public final C55008xbo AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final C52794wYp AhwBna;
    public final C55008xbo EZpvd;
    public final android.widget.LinearLayout KWHzl;
    public final C55018xby OLrzqt;
    public final C55008xbo copydefault;
    public final C52794wYp djBIcL;
    public final C52794wYp gEmmrt;
    public final android.widget.TextView valueOf;

    public AbstractC47369toj(java.lang.Object obj, android.view.View view, int i, android.widget.LinearLayout linearLayout, C55008xbo c55008xbo, C55008xbo c55008xbo2, C55008xbo c55008xbo3, C55018xby c55018xby, C52794wYp c52794wYp, C52794wYp c52794wYp2, C52794wYp c52794wYp3, android.widget.TextView textView, android.widget.TextView textView2) {
        super(obj, view, i);
        this.KWHzl = linearLayout;
        this.EZpvd = c55008xbo;
        this.copydefault = c55008xbo2;
        this.AEQbTJ = c55008xbo3;
        this.OLrzqt = c55018xby;
        this.gEmmrt = c52794wYp;
        this.djBIcL = c52794wYp2;
        this.AhwBna = c52794wYp3;
        this.valueOf = textView;
        this.AYXKKw = textView2;
    }

    public static AbstractC47369toj copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z) {
        return copydefault(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47369toj copydefault(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable android.view.ViewGroup viewGroup, boolean z, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47369toj) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.AuCTelauCTel, viewGroup, z, obj);
    }
}
