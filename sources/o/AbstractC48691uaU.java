package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: o.uaU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC48691uaU extends ViewDataBinding {

    @Bindable
    public boolean AEQbTJ;
    public final AppCompatTextView AYXKKw;
    public final android.widget.ImageView EZpvd;
    public final android.widget.ImageView KWHzl;

    @Bindable
    public boolean OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final C55251xgS djBIcL;

    @Bindable
    public boolean gEmmrt;

    public abstract void AEQbTJ(boolean z);

    public abstract void KWHzl(boolean z);

    public AbstractC48691uaU(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView, android.widget.ImageView imageView2, C55251xgS c55251xgS, AppCompatTextView appCompatTextView) {
        super(obj, view, i);
        this.copydefault = frameLayout;
        this.KWHzl = imageView;
        this.EZpvd = imageView2;
        this.djBIcL = c55251xgS;
        this.AYXKKw = appCompatTextView;
    }
}
