package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class oPH extends ViewDataBinding {
    public final C39843pzw AEQbTJ;

    @Bindable
    public boolean AYXKKw;

    @Bindable
    public boolean AhwBna;
    public final C39846pzz EZpvd;
    public final C39845pzy KWHzl;
    public final C39842pzv OLrzqt;
    public final LinearLayoutCompat copydefault;
    public final android.widget.TextView djBIcL;

    @Bindable
    public boolean gEmmrt;
    public final NestedScrollView valueOf;

    public abstract void AEQbTJ(boolean z);

    public abstract void KWHzl(boolean z);

    public abstract void OLrzqt(boolean z);

    public oPH(java.lang.Object obj, android.view.View view, int i, LinearLayoutCompat linearLayoutCompat, C39845pzy c39845pzy, C39846pzz c39846pzz, C39843pzw c39843pzw, C39842pzv c39842pzv, NestedScrollView nestedScrollView, android.widget.TextView textView) {
        super(obj, view, i);
        this.copydefault = linearLayoutCompat;
        this.KWHzl = c39845pzy;
        this.EZpvd = c39846pzz;
        this.AEQbTJ = c39843pzw;
        this.OLrzqt = c39842pzv;
        this.valueOf = nestedScrollView;
        this.djBIcL = textView;
    }
}
