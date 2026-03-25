package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nKQ extends ViewDataBinding {
    public final android.widget.RelativeLayout AEQbTJ;
    public final android.widget.FrameLayout EZpvd;
    public final android.widget.TextView KWHzl;
    public final android.widget.ImageView OLrzqt;

    @Bindable
    public boolean copydefault;

    @Bindable
    public java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean AEQbTJ() {
        return this.copydefault;
    }

    public abstract void KWHzl(@androidx.annotation.Nullable java.lang.String str);

    public abstract void copydefault(boolean z);

    public nKQ(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, android.widget.TextView textView, android.widget.ImageView imageView, android.widget.RelativeLayout relativeLayout) {
        super(obj, view, i);
        this.EZpvd = frameLayout;
        this.KWHzl = textView;
        this.OLrzqt = imageView;
        this.AEQbTJ = relativeLayout;
    }
}
