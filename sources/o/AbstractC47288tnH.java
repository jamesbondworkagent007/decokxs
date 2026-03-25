package o;

import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.uilab.edit.OKEditText;
import o.C47315tni;

/* JADX INFO: renamed from: o.tnH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC47288tnH extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final OKEditText AYXKKw;
    public final C55018xby AhwBna;
    public final C55018xby EZpvd;
    public final C52794wYp KWHzl;
    public final android.widget.TextView OLrzqt;
    public final NestedScrollView copydefault;
    public final android.widget.TextView djBIcL;

    public AbstractC47288tnH(java.lang.Object obj, android.view.View view, int i, android.widget.TextView textView, android.widget.TextView textView2, C55018xby c55018xby, NestedScrollView nestedScrollView, C52794wYp c52794wYp, C55018xby c55018xby2, OKEditText oKEditText, android.widget.TextView textView3) {
        super(obj, view, i);
        this.OLrzqt = textView;
        this.AEQbTJ = textView2;
        this.EZpvd = c55018xby;
        this.copydefault = nestedScrollView;
        this.KWHzl = c52794wYp;
        this.AhwBna = c55018xby2;
        this.AYXKKw = oKEditText;
        this.djBIcL = textView3;
    }

    public static AbstractC47288tnH AEQbTJ(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater) {
        return OLrzqt(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @java.lang.Deprecated
    public static AbstractC47288tnH OLrzqt(@androidx.annotation.NonNull android.view.LayoutInflater layoutInflater, @androidx.annotation.Nullable java.lang.Object obj) {
        return (AbstractC47288tnH) ViewDataBinding.inflateInternal(layoutInflater, C47315tni.ActionBar.AkhnZx, null, false, obj);
    }
}
