package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.okinc.okimcore.model.im.OKReferenceMessage;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nMO extends ViewDataBinding {
    public final android.widget.ImageView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.FrameLayout AhwBna;
    public final ShapeableImageView AkhnZx;
    public final LinearLayoutCompat AuCTel;
    public final oHK DbNXlk;
    public final C37728ozM EZpvd;
    public final ShapeableImageView KWHzl;
    public final android.widget.ImageView OLrzqt;
    public final android.widget.FrameLayout copydefault;
    public final sDA djBIcL;
    public final CardView ejfBZ;
    public final android.widget.TextView fARcdN;
    public final android.widget.TextView fJNWhG;
    public final android.widget.ImageView fetchVPNInfo;
    public final C55113xdn gEmmrt;
    public final LinearLayoutCompat isConnected;

    @Bindable
    public OKReferenceMessage valueOf;
    public final nMT values;

    public nMO(java.lang.Object obj, android.view.View view, int i, android.widget.FrameLayout frameLayout, C37728ozM c37728ozM, android.widget.ImageView imageView, android.widget.ImageView imageView2, ShapeableImageView shapeableImageView, C55113xdn c55113xdn, sDA sda, android.widget.FrameLayout frameLayout2, android.widget.TextView textView, android.widget.ImageView imageView3, ShapeableImageView shapeableImageView2, nMT nmt, LinearLayoutCompat linearLayoutCompat, oHK ohk, android.widget.TextView textView2, android.widget.TextView textView3, LinearLayoutCompat linearLayoutCompat2, CardView cardView) {
        super(obj, view, i);
        this.copydefault = frameLayout;
        this.EZpvd = c37728ozM;
        this.OLrzqt = imageView;
        this.AEQbTJ = imageView2;
        this.KWHzl = shapeableImageView;
        this.gEmmrt = c55113xdn;
        this.djBIcL = sda;
        this.AhwBna = frameLayout2;
        this.AYXKKw = textView;
        this.fetchVPNInfo = imageView3;
        this.AkhnZx = shapeableImageView2;
        this.values = nmt;
        this.isConnected = linearLayoutCompat;
        this.DbNXlk = ohk;
        this.fARcdN = textView2;
        this.fJNWhG = textView3;
        this.AuCTel = linearLayoutCompat2;
        this.ejfBZ = cardView;
    }
}
