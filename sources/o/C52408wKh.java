package o;

import android.view.View;
import com.okinc.unify_trade.biz.BannerOrderDetails;
import com.okinc.unify_trade.biz.InstrumentPercentBean;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;

/* JADX INFO: renamed from: o.wKh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52408wKh implements InterfaceC52406wKf {
    public final android.os.Parcelable AEQbTJ;
    public final android.content.Context KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.os.Parcelable AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public android.content.Context copydefault() {
        return this.KWHzl;
    }

    public C52408wKh(android.content.Context context, android.os.Parcelable parcelable) {
        this.KWHzl = context;
        this.AEQbTJ = parcelable;
    }

    @Override // o.InterfaceC52406wKf
    public void KWHzl() {
        EZpvd();
    }

    public final void EZpvd() {
        java.util.ArrayList<InstrumentPercentBean> instrumentPercent;
        java.lang.String percent$default;
        android.content.Context contextCopydefault = copydefault();
        if (contextCopydefault == null) {
            return;
        }
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextCopydefault);
        viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.PlaybackStateCompatErrorCode);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Parcelable parcelableAEQbTJ = AEQbTJ();
        BannerOrderDetails bannerOrderDetails = parcelableAEQbTJ instanceof BannerOrderDetails ? (BannerOrderDetails) parcelableAEQbTJ : null;
        if (bannerOrderDetails != null && (instrumentPercent = bannerOrderDetails.getInstrumentPercent()) != null) {
            for (InstrumentPercentBean instrumentPercentBean : instrumentPercent) {
                java.lang.String instrumentName = instrumentPercentBean.getInstrumentName();
                if (instrumentName == null) {
                    instrumentName = "";
                }
                java.lang.String percent = instrumentPercentBean.getPercent();
                if (percent == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) percent)) {
                    percent$default = "--";
                } else {
                    xMR xmr = xMR.copydefault;
                    java.lang.String percent2 = instrumentPercentBean.getPercent();
                    percent$default = xMR.formatPercent$default(xmr, percent2 == null ? "" : percent2, 2, 2, null, 8, null);
                }
                arrayList.add(new C55846xre(instrumentName, percent$default));
            }
        }
        C52559wPx.KWHzl(viewOnClickListenerC54939xaY, arrayList);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.wKg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52408wKh.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }
}
