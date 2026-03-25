package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.ViewDataBinding;
import com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageViewProvider;

/* JADX INFO: renamed from: o.lwL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC31558lwL extends ViewDataBinding {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView AYXKKw;
    public final android.widget.ImageView AhwBna;
    public final android.widget.TextView AkhnZx;
    public final android.widget.TextView AuCTel;
    public final android.widget.ImageView DbNXlk;
    public final android.widget.ImageView EZpvd;
    public final C52794wYp KWHzl;
    public final android.widget.LinearLayout OLrzqt;
    public final android.widget.TextView copydefault;

    @Bindable
    public OtcAgentTradeCardMessageViewProvider.StateListAnimator djBIcL;
    public final android.widget.TextView ejfBZ;
    public final android.widget.LinearLayout fARcdN;
    public final android.widget.TextView fIwbmz;
    public final android.widget.LinearLayout fJNWhG;
    public final ConstraintLayout fetchVPNInfo;
    public final android.widget.LinearLayout gEmmrt;
    public final android.widget.TextView getNewProxyInstance;
    public final C57635ymD isConnected;
    public final android.widget.TextView uzCIH;
    public final android.widget.TextView valueOf;
    public final ConstraintLayout values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OtcAgentTradeCardMessageViewProvider.StateListAnimator AEQbTJ() {
        return this.djBIcL;
    }

    public abstract void EZpvd(@androidx.annotation.Nullable OtcAgentTradeCardMessageViewProvider.StateListAnimator stateListAnimator);

    public AbstractC31558lwL(java.lang.Object obj, android.view.View view, int i, android.widget.ImageView imageView, C52794wYp c52794wYp, android.widget.TextView textView, android.widget.LinearLayout linearLayout, android.widget.TextView textView2, android.widget.TextView textView3, android.widget.ImageView imageView2, android.widget.TextView textView4, android.widget.LinearLayout linearLayout2, android.widget.TextView textView5, C57635ymD c57635ymD, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, android.widget.ImageView imageView3, android.widget.TextView textView6, android.widget.TextView textView7, android.widget.LinearLayout linearLayout3, android.widget.LinearLayout linearLayout4, android.widget.TextView textView8, android.widget.TextView textView9, android.widget.TextView textView10) {
        super(obj, view, i);
        this.EZpvd = imageView;
        this.KWHzl = c52794wYp;
        this.AEQbTJ = textView;
        this.OLrzqt = linearLayout;
        this.copydefault = textView2;
        this.valueOf = textView3;
        this.AhwBna = imageView2;
        this.AYXKKw = textView4;
        this.gEmmrt = linearLayout2;
        this.AkhnZx = textView5;
        this.isConnected = c57635ymD;
        this.values = constraintLayout;
        this.fetchVPNInfo = constraintLayout2;
        this.DbNXlk = imageView3;
        this.fIwbmz = textView6;
        this.ejfBZ = textView7;
        this.fJNWhG = linearLayout3;
        this.fARcdN = linearLayout4;
        this.AuCTel = textView8;
        this.uzCIH = textView9;
        this.getNewProxyInstance = textView10;
    }
}
