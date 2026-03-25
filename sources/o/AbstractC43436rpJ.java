package o;

import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.nft.ui.mediapicker.data.bean.MediaInfo;

/* JADX INFO: renamed from: o.rpJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC43436rpJ extends ViewDataBinding {
    public final android.widget.FrameLayout AEQbTJ;
    public final android.widget.TextView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.ImageView copydefault;

    @Bindable
    public MediaInfo gEmmrt;
    public final android.widget.ImageView valueOf;

    public AbstractC43436rpJ(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, android.widget.FrameLayout frameLayout, android.widget.TextView textView, android.widget.ImageView imageView2, android.widget.ImageView imageView3, android.widget.ImageView imageView4) {
        super(obj, view, i);
        this.KWHzl = imageView;
        this.AEQbTJ = frameLayout;
        this.EZpvd = textView;
        this.copydefault = imageView2;
        this.OLrzqt = imageView3;
        this.valueOf = imageView4;
    }
}
