package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.nft.ui.mediapicker.data.bean.MediaInfo;

/* JADX INFO: renamed from: o.rpH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC43434rpH extends ViewDataBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.TextView AhwBna;
    public final android.widget.ImageView EZpvd;
    public final android.widget.TextView KWHzl;

    @Bindable
    public MediaInfo OLrzqt;
    public final android.widget.ImageView copydefault;
    public final android.widget.TextView gEmmrt;

    public AbstractC43434rpH(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.FrameLayout frameLayout, android.widget.ImageView imageView2, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3) {
        super(obj, view, i);
        this.EZpvd = imageView;
        this.AEQbTJ = frameLayout;
        this.copydefault = imageView2;
        this.KWHzl = textView;
        this.gEmmrt = textView2;
        this.AhwBna = textView3;
    }
}
