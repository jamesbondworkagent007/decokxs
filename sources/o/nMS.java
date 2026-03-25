package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.okimcore.model.im.OKReferenceMessage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nMS extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final C55113xdn AYXKKw;
    public final android.widget.FrameLayout AhwBna;
    public final ShapeableImageView AkhnZx;
    public final android.widget.TextView AuCTel;
    public final android.widget.ImageView DbNXlk;
    public final ShapeableImageView EZpvd;
    public final android.widget.ImageView KWHzl;
    public final android.widget.FrameLayout OLrzqt;
    public final C37728ozM copydefault;

    @Bindable
    public OKReferenceMessage djBIcL;
    public final LinearLayoutCompat fARcdN;
    public final CardView fIwbmz;
    public final android.widget.TextView fJNWhG;
    public final LinearLayoutCompat fetchVPNInfo;
    public final android.widget.TextView gEmmrt;
    public final oHK isConnected;
    public final sDA valueOf;
    public final nMT values;

    public nMS(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, C37728ozM c37728ozM, android.widget.ImageView imageView, android.widget.ImageView imageView2, ShapeableImageView shapeableImageView, C55113xdn c55113xdn, sDA sda, android.widget.FrameLayout frameLayout2, android.widget.TextView textView, android.widget.ImageView imageView3, ShapeableImageView shapeableImageView2, nMT nmt, LinearLayoutCompat linearLayoutCompat, oHK ohk, android.widget.TextView textView2, android.widget.TextView textView3, LinearLayoutCompat linearLayoutCompat2, CardView cardView) {
        super(obj, view, i);
        this.OLrzqt = frameLayout;
        this.copydefault = c37728ozM;
        this.AEQbTJ = imageView;
        this.KWHzl = imageView2;
        this.EZpvd = shapeableImageView;
        this.AYXKKw = c55113xdn;
        this.valueOf = sda;
        this.AhwBna = frameLayout2;
        this.gEmmrt = textView;
        this.DbNXlk = imageView3;
        this.AkhnZx = shapeableImageView2;
        this.values = nmt;
        this.fetchVPNInfo = linearLayoutCompat;
        this.isConnected = ohk;
        this.AuCTel = textView2;
        this.fJNWhG = textView3;
        this.fARcdN = linearLayoutCompat2;
        this.fIwbmz = cardView;
    }
}
