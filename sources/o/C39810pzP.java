package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.kline.news.data.vo.KlineFlashItem;
import com.okinc.kline.ui.view.model.MarketTopInfo;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C35964oKf;
import o.C52761wXj;
import o.InterfaceC54581xNr;
import o.pDU;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.pzP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39810pzP extends ConstraintLayout {
    public android.widget.TextView AEQbTJ;
    public android.widget.TextView AYXKKw;
    public android.widget.TextView AhwBna;
    public android.widget.TextView AkhnZx;
    public android.widget.TextView AuCTel;
    public android.widget.TextView AuCTelauCTel;
    public android.widget.TextView AubY;
    public final xUS AwvSrB;
    public android.widget.TextView AxsJAY;
    public C39826pzf DTwDnp;
    public android.widget.TextView DbNXlk;
    public android.widget.TextView EZpvd;
    public android.widget.TextView KWHzl;
    public android.widget.TextView OLrzqt;
    public boolean ORxRYg;
    public android.widget.ImageView OcIXYQ;
    public int QKVWgx;
    public ActionBar QOLQEE;
    public android.widget.LinearLayout QUSxYX;
    public android.widget.LinearLayout QVAiDq;
    public android.widget.LinearLayout QbewEr;
    public android.widget.LinearLayout QfsBiF;
    public android.widget.LinearLayout RJOkX;
    public android.widget.LinearLayout RcXXUw;
    public android.widget.LinearLayout UeEOUB;
    public final long aKErDB;
    public android.widget.TextView copydefault;
    public android.widget.LinearLayout dNCPSb;
    public android.widget.TextView djBIcL;
    public int djSkpj;
    public android.widget.LinearLayout dvKsVJ;
    public android.widget.TextView ejfBZ;
    public android.widget.TextView fARcdN;
    public float fFgQHt;
    public android.widget.TextView fIwbmz;
    public android.widget.ImageView fJNWhG;
    public android.widget.TextView fetchVPNInfo;
    public android.widget.TextView finit;
    public android.widget.TextView gEmmrt;
    public android.widget.TextView gHZMYf;
    public android.widget.TextView getFieldNames;
    public C55258xgZ getNewProxyInstance;
    public android.widget.TextView hDKMBd;
    public android.widget.TextView isConnected;
    public android.widget.TextView iwGUEr;
    public android.widget.LinearLayout sSMYrx;
    public android.widget.TextView uzCIH;
    public android.widget.TextView valueOf;
    public android.widget.TextView values;
    public android.widget.TextView wlaJM;
    public android.widget.TextView zLjUOn;
    public android.widget.TextView zsXlph;
    public C55372xih zuBGHE;

    /* JADX INFO: renamed from: o.pzP$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public interface ActionBar {
        void AEQbTJ(boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55372xih OLrzqt() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCl_fold(@NotNull android.widget.LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "");
        this.sSMYrx = linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setParent(android.widget.LinearLayout linearLayout) {
        this.dvKsVJ = linearLayout;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C39810pzP(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.QKVWgx = C55298xhM.copydefault(186.0f, context2);
        this.ORxRYg = true;
        this.AwvSrB = new xUS();
        this.aKErDB = 7200000L;
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C35964oKf.Application.invokespecialaVhqwO, this);
        this.dvKsVJ = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.dbAction);
        this.QfsBiF = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.sanrWj);
        this.QVAiDq = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.xxhdY);
        this.dNCPSb = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.avCqka);
        this.fetchVPNInfo = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.fdOvFl);
        this.fJNWhG = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.fjfviF);
        this.copydefault = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.QVsKAR);
        this.OLrzqt = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.OJuSTm);
        this.AuCTel = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.spnCvw);
        this.RcXXUw = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.gvFztT);
        this.UeEOUB = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.FF);
        this.getNewProxyInstance = (C55258xgZ) viewInflate.findViewById(C35964oKf.StateListAnimator.ixgjPv);
        this.AEQbTJ = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.OHqIaq);
        this.EZpvd = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.OxVOHk);
        this.AuCTelauCTel = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.UrRBLY);
        this.zLjUOn = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DWgRXt);
        this.ejfBZ = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.zblBkD);
        this.values = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.fERRXa);
        this.AkhnZx = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.igXuih);
        this.fARcdN = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.Dmq);
        this.fIwbmz = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DCUTEIdCUTEI);
        this.AubY = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DGOPHZ);
        this.zsXlph = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DcqEDu);
        this.iwGUEr = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.WS);
        this.uzCIH = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.run);
        this.hDKMBd = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.call);
        this.getFieldNames = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DCUTEIddSDPG);
        setCl_fold((android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.RXzakW));
        this.finit = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi216);
        this.QUSxYX = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.znKlvJ);
        this.isConnected = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.htlTjW);
        this.KWHzl = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.QSLkRj);
        this.djBIcL = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.USBtdM);
        this.AYXKKw = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.dUDNAs);
        this.gEmmrt = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.QCjLjM);
        this.RJOkX = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.adevsa);
        this.valueOf = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.aUsmxb);
        this.QbewEr = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.ardYFU);
        this.wlaJM = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.KDccX);
        this.AxsJAY = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.hCLrkq);
        this.gHZMYf = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.fHqPtx);
        this.DbNXlk = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.QwvEab);
        this.AhwBna = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.UlJrfe);
        this.OcIXYQ = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.DBAlnt);
        this.zuBGHE = (C55372xih) viewInflate.findViewById(C35964oKf.StateListAnimator.gSBher);
        this.DTwDnp = (C39826pzf) viewInflate.findViewById(C35964oKf.StateListAnimator.svY);
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        if (!C38303pTu.OLrzqt(locale)) {
            java.util.Locale locale2 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            if (!C38303pTu.KWHzl(locale2)) {
                java.util.Locale locale3 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                if (C38303pTu.copydefault(locale3)) {
                    android.widget.LinearLayout linearLayout = this.RcXXUw;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    android.widget.LinearLayout linearLayout2 = this.UeEOUB;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                } else {
                    android.widget.LinearLayout linearLayout3 = this.RcXXUw;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                    }
                    android.widget.LinearLayout linearLayout4 = this.UeEOUB;
                    if (linearLayout4 != null) {
                        linearLayout4.setVisibility(0);
                    }
                }
            }
        }
        android.widget.ImageView imageView = this.OcIXYQ;
        if (imageView != null) {
            imageView.post(new java.lang.Runnable() { // from class: o.pzQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C39810pzP.EZpvd(this.KWHzl);
                }
            });
        }
        android.widget.ImageView imageView2 = this.OcIXYQ;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.pzT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39810pzP.copydefault(this.OLrzqt, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C39810pzP(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.QKVWgx = C55298xhM.copydefault(186.0f, context2);
        this.ORxRYg = true;
        this.AwvSrB = new xUS();
        this.aKErDB = 7200000L;
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C35964oKf.Application.invokespecialaVhqwO, this);
        this.dvKsVJ = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.dbAction);
        this.QfsBiF = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.sanrWj);
        this.QVAiDq = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.xxhdY);
        this.dNCPSb = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.avCqka);
        this.fetchVPNInfo = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.fdOvFl);
        this.fJNWhG = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.fjfviF);
        this.copydefault = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.QVsKAR);
        this.OLrzqt = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.OJuSTm);
        this.AuCTel = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.spnCvw);
        this.RcXXUw = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.gvFztT);
        this.UeEOUB = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.FF);
        this.getNewProxyInstance = (C55258xgZ) viewInflate.findViewById(C35964oKf.StateListAnimator.ixgjPv);
        this.AEQbTJ = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.OHqIaq);
        this.EZpvd = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.OxVOHk);
        this.AuCTelauCTel = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.UrRBLY);
        this.zLjUOn = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DWgRXt);
        this.ejfBZ = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.zblBkD);
        this.values = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.fERRXa);
        this.AkhnZx = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.igXuih);
        this.fARcdN = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.Dmq);
        this.fIwbmz = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DCUTEIdCUTEI);
        this.AubY = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DGOPHZ);
        this.zsXlph = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DcqEDu);
        this.iwGUEr = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.WS);
        this.uzCIH = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.run);
        this.hDKMBd = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.call);
        this.getFieldNames = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DCUTEIddSDPG);
        setCl_fold((android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.RXzakW));
        this.finit = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi216);
        this.QUSxYX = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.znKlvJ);
        this.isConnected = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.htlTjW);
        this.KWHzl = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.QSLkRj);
        this.djBIcL = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.USBtdM);
        this.AYXKKw = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.dUDNAs);
        this.gEmmrt = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.QCjLjM);
        this.RJOkX = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.adevsa);
        this.valueOf = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.aUsmxb);
        this.QbewEr = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.ardYFU);
        this.wlaJM = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.KDccX);
        this.AxsJAY = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.hCLrkq);
        this.gHZMYf = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.fHqPtx);
        this.DbNXlk = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.QwvEab);
        this.AhwBna = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.UlJrfe);
        this.OcIXYQ = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.DBAlnt);
        this.zuBGHE = (C55372xih) viewInflate.findViewById(C35964oKf.StateListAnimator.gSBher);
        this.DTwDnp = (C39826pzf) viewInflate.findViewById(C35964oKf.StateListAnimator.svY);
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        if (!C38303pTu.OLrzqt(locale)) {
            java.util.Locale locale2 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            if (!C38303pTu.KWHzl(locale2)) {
                java.util.Locale locale3 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                if (C38303pTu.copydefault(locale3)) {
                    android.widget.LinearLayout linearLayout = this.RcXXUw;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    android.widget.LinearLayout linearLayout2 = this.UeEOUB;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                } else {
                    android.widget.LinearLayout linearLayout3 = this.RcXXUw;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                    }
                    android.widget.LinearLayout linearLayout4 = this.UeEOUB;
                    if (linearLayout4 != null) {
                        linearLayout4.setVisibility(0);
                    }
                }
            }
        }
        android.widget.ImageView imageView = this.OcIXYQ;
        if (imageView != null) {
            imageView.post(new java.lang.Runnable() { // from class: o.pzQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C39810pzP.EZpvd(this.KWHzl);
                }
            });
        }
        android.widget.ImageView imageView2 = this.OcIXYQ;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.pzT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39810pzP.copydefault(this.OLrzqt, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x023e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C39810pzP(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.QKVWgx = C55298xhM.copydefault(186.0f, context2);
        this.ORxRYg = true;
        this.AwvSrB = new xUS();
        this.aKErDB = 7200000L;
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C35964oKf.Application.invokespecialaVhqwO, this);
        this.dvKsVJ = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.dbAction);
        this.QfsBiF = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.sanrWj);
        this.QVAiDq = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.xxhdY);
        this.dNCPSb = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.avCqka);
        this.fetchVPNInfo = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.fdOvFl);
        this.fJNWhG = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.fjfviF);
        this.copydefault = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.QVsKAR);
        this.OLrzqt = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.OJuSTm);
        this.AuCTel = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.spnCvw);
        this.RcXXUw = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.gvFztT);
        this.UeEOUB = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.FF);
        this.getNewProxyInstance = (C55258xgZ) viewInflate.findViewById(C35964oKf.StateListAnimator.ixgjPv);
        this.AEQbTJ = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.OHqIaq);
        this.EZpvd = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.OxVOHk);
        this.AuCTelauCTel = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.UrRBLY);
        this.zLjUOn = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DWgRXt);
        this.ejfBZ = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.zblBkD);
        this.values = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.fERRXa);
        this.AkhnZx = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.igXuih);
        this.fARcdN = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.Dmq);
        this.fIwbmz = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DCUTEIdCUTEI);
        this.AubY = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DGOPHZ);
        this.zsXlph = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DcqEDu);
        this.iwGUEr = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.WS);
        this.uzCIH = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.run);
        this.hDKMBd = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.call);
        this.getFieldNames = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.DCUTEIddSDPG);
        setCl_fold((android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.RXzakW));
        this.finit = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.MediaBrowserCompatMediaBrowserImplApi216);
        this.QUSxYX = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.znKlvJ);
        this.isConnected = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.htlTjW);
        this.KWHzl = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.QSLkRj);
        this.djBIcL = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.USBtdM);
        this.AYXKKw = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.dUDNAs);
        this.gEmmrt = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.QCjLjM);
        this.RJOkX = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.adevsa);
        this.valueOf = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.aUsmxb);
        this.QbewEr = (android.widget.LinearLayout) viewInflate.findViewById(C35964oKf.StateListAnimator.ardYFU);
        this.wlaJM = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.KDccX);
        this.AxsJAY = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.hCLrkq);
        this.gHZMYf = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.fHqPtx);
        this.DbNXlk = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.QwvEab);
        this.AhwBna = (android.widget.TextView) viewInflate.findViewById(C35964oKf.StateListAnimator.UlJrfe);
        this.OcIXYQ = (android.widget.ImageView) viewInflate.findViewById(C35964oKf.StateListAnimator.DBAlnt);
        this.zuBGHE = (C55372xih) viewInflate.findViewById(C35964oKf.StateListAnimator.gSBher);
        this.DTwDnp = (C39826pzf) viewInflate.findViewById(C35964oKf.StateListAnimator.svY);
        java.util.Locale locale = java.util.Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        if (!C38303pTu.OLrzqt(locale)) {
            java.util.Locale locale2 = java.util.Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            if (!C38303pTu.KWHzl(locale2)) {
                java.util.Locale locale3 = java.util.Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale3, "");
                if (C38303pTu.copydefault(locale3)) {
                    android.widget.LinearLayout linearLayout = this.RcXXUw;
                    if (linearLayout != null) {
                        linearLayout.setVisibility(0);
                    }
                    android.widget.LinearLayout linearLayout2 = this.UeEOUB;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                } else {
                    android.widget.LinearLayout linearLayout3 = this.RcXXUw;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                    }
                    android.widget.LinearLayout linearLayout4 = this.UeEOUB;
                    if (linearLayout4 != null) {
                        linearLayout4.setVisibility(0);
                    }
                }
            }
        }
        android.widget.ImageView imageView = this.OcIXYQ;
        if (imageView != null) {
            imageView.post(new java.lang.Runnable() { // from class: o.pzQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C39810pzP.EZpvd(this.KWHzl);
                }
            });
        }
        android.widget.ImageView imageView2 = this.OcIXYQ;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.pzT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C39810pzP.copydefault(this.OLrzqt, view);
                }
            });
        }
    }

    public final android.widget.LinearLayout KWHzl() {
        android.widget.LinearLayout linearLayout = this.sSMYrx;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: renamed from: o.pzP$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j) {
            this.AEQbTJ = view;
            this.copydefault = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
            }
        }
    }

    /* JADX INFO: renamed from: o.pzP$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
            }
        }
    }

    /* JADX INFO: renamed from: o.pzP$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C39810pzP OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C39810pzP c39810pzP) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c39810pzP;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.KWHzl(C35964oKf.Fragment.dGrqPl);
            }
        }
    }

    /* JADX INFO: renamed from: o.pzP$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j) {
            this.EZpvd = view;
            this.AEQbTJ = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
            }
        }
    }

    public static final void EZpvd(C39810pzP c39810pzP) {
        int iEZpvd = C33518mxv.EZpvd(c39810pzP.getContext(), 62.0f);
        android.widget.ImageView imageView = c39810pzP.OcIXYQ;
        java.lang.Integer numValueOf = imageView != null ? java.lang.Integer.valueOf(imageView.getHeight()) : null;
        Intrinsics.copydefault(numValueOf);
        c39810pzP.djSkpj = iEZpvd + numValueOf.intValue();
    }

    public static final void copydefault(C39810pzP c39810pzP, android.view.View view) {
        ActionBar actionBar = c39810pzP.QOLQEE;
        if (actionBar != null) {
            actionBar.AEQbTJ(c39810pzP.ORxRYg);
        }
        if (c39810pzP.ORxRYg) {
            android.widget.ImageView imageView = c39810pzP.OcIXYQ;
            if (imageView != null) {
                imageView.setImageResource(C52761wXj.TaskDescription.DNMMPQ);
            }
            pDU.TaskDescription taskDescription = pDU.Companion;
            android.content.Context context = c39810pzP.getContext();
            Intrinsics.copydefault(context);
            pDU.toggle$default(taskDescription.OLrzqt(context, c39810pzP.KWHzl(), c39810pzP.djSkpj), false, 1, null);
        } else {
            android.widget.ImageView imageView2 = c39810pzP.OcIXYQ;
            if (imageView2 != null) {
                imageView2.setImageResource(C52761wXj.TaskDescription.DCUTEIddSDPG);
            }
            pDU.TaskDescription taskDescription2 = pDU.Companion;
            android.content.Context context2 = c39810pzP.getContext();
            Intrinsics.copydefault(context2);
            pDU.toggle$default(taskDescription2.OLrzqt(context2, c39810pzP.KWHzl(), c39810pzP.djSkpj), false, 1, null);
        }
        c39810pzP.ORxRYg = !c39810pzP.ORxRYg;
    }

    public final void KWHzl(java.lang.String str) {
        android.widget.TextView textView = this.fetchVPNInfo;
        Intrinsics.copydefault(textView);
        textView.setTextSize(2, 30.0f);
        android.widget.TextView textView2 = this.fetchVPNInfo;
        Intrinsics.copydefault(textView2);
        float textSize = textView2.getTextSize();
        this.fFgQHt = textSize;
        int iAEQbTJ = C33518mxv.AEQbTJ(getContext(), 1.0f);
        android.widget.TextView textView3 = this.fetchVPNInfo;
        Intrinsics.copydefault(textView3);
        float fMeasureText = textView3.getPaint().measureText(str);
        float fOLrzqt = C33097mpy.OLrzqt(getContext()) - this.QKVWgx;
        if (fMeasureText < fOLrzqt) {
            return;
        }
        while (fMeasureText > fOLrzqt) {
            textSize -= iAEQbTJ;
            android.widget.TextView textView4 = this.fetchVPNInfo;
            Intrinsics.copydefault(textView4);
            textView4.setTextSize(textSize);
            android.widget.TextView textView5 = this.fetchVPNInfo;
            Intrinsics.copydefault(textView5);
            fMeasureText = textView5.getPaint().measureText(str);
        }
    }

    public static /* synthetic */ void setData$default(C39810pzP c39810pzP, MarketTopInfo marketTopInfo, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c39810pzP.setData(marketTopInfo, z);
    }

    public final void setData(@NotNull MarketTopInfo marketTopInfo, boolean z) {
        android.widget.TextView textView;
        java.lang.String str;
        java.lang.String str2;
        android.widget.TextView textView2;
        java.lang.String tLocalPrice;
        Intrinsics.checkNotNullParameter(marketTopInfo, "");
        android.widget.TextView textView3 = this.fetchVPNInfo;
        if (textView3 != null) {
            textView3.setText(marketTopInfo.getTPrice());
        }
        android.widget.LinearLayout linearLayout = this.QfsBiF;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout2 = this.QVAiDq;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        try {
            KWHzl(marketTopInfo.getTPrice());
        } catch (java.lang.Exception e) {
            C6777aVl.Companion.EZpvd(new java.lang.Exception(e.getLocalizedMessage(), e));
        }
        android.widget.TextView textView4 = this.copydefault;
        if (textView4 != null) {
            textView4.setText(Intrinsics.EZpvd((java.lang.Object) marketTopInfo.getTPrice(), (java.lang.Object) "--") ? "--" : pTF.KWHzl.AEQbTJ(marketTopInfo.getTIncrease()));
        }
        android.widget.TextView textView5 = this.AuCTel;
        if (textView5 != null) {
            if (Intrinsics.EZpvd((java.lang.Object) marketTopInfo.getTLocalPrice(), (java.lang.Object) "--")) {
                tLocalPrice = marketTopInfo.getTLocalPrice();
            } else {
                tLocalPrice = "≈" + marketTopInfo.getTLocalPrice();
            }
            textView5.setText(tLocalPrice);
        }
        if (!android.text.TextUtils.isEmpty(marketTopInfo.getMaskPrice()) && (textView2 = this.ejfBZ) != null) {
            textView2.setText(marketTopInfo.getMaskPrice());
        }
        android.widget.TextView textView6 = this.values;
        if (textView6 != null) {
            textView6.setText(marketTopInfo.getT24HighPrice());
        }
        android.widget.TextView textView7 = this.AkhnZx;
        if (textView7 != null) {
            textView7.setText(marketTopInfo.getT24HighPrice());
        }
        android.widget.TextView textView8 = this.fARcdN;
        if (textView8 != null) {
            textView8.setText(marketTopInfo.getT24LowPrice());
        }
        android.widget.TextView textView9 = this.fIwbmz;
        if (textView9 != null) {
            textView9.setText(marketTopInfo.getT24LowPrice());
        }
        android.widget.TextView textView10 = this.AuCTelauCTel;
        if (textView10 != null) {
            textView10.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.RlQdEF) + " (" + ((java.lang.Object) marketTopInfo.getT24Volume().getSecond()) + ")");
        }
        android.widget.TextView textView11 = this.zLjUOn;
        if (textView11 != null) {
            textView11.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.RlQdEF) + " (" + ((java.lang.Object) marketTopInfo.getT24Volume().getSecond()) + ")");
        }
        android.widget.TextView textView12 = this.AubY;
        if (textView12 != null) {
            textView12.setText(marketTopInfo.getT24Volume().getFirst());
        }
        android.widget.TextView textView13 = this.zsXlph;
        if (textView13 != null) {
            textView13.setText(marketTopInfo.getT24Volume().getFirst());
        }
        android.widget.TextView textView14 = this.iwGUEr;
        if (textView14 != null) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.DXXBbs);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) marketTopInfo.getT24Turnover().getSecond())) {
                str2 = " (" + ((java.lang.Object) marketTopInfo.getT24Turnover().getSecond()) + ")";
            } else {
                str2 = "";
            }
            textView14.setText(strAYXKKw + str2);
        }
        android.widget.TextView textView15 = this.uzCIH;
        if (textView15 != null) {
            java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C35964oKf.Fragment.DXXBbs);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) marketTopInfo.getT24Turnover().getSecond())) {
                str = " (" + ((java.lang.Object) marketTopInfo.getT24Turnover().getSecond()) + ")";
            } else {
                str = "";
            }
            textView15.setText(strAYXKKw2 + str);
        }
        android.widget.TextView textView16 = this.hDKMBd;
        if (textView16 != null) {
            textView16.setText(marketTopInfo.getT24Turnover().getFirst());
        }
        android.widget.TextView textView17 = this.getFieldNames;
        if (textView17 != null) {
            textView17.setText(marketTopInfo.getT24Turnover().getFirst());
        }
        android.widget.TextView textView18 = this.isConnected;
        if (textView18 != null) {
            textView18.setText(marketTopInfo.getTMarketPosition());
        }
        android.widget.TextView textView19 = this.KWHzl;
        if (textView19 != null) {
            textView19.setText(marketTopInfo.getTDelta());
        }
        android.widget.TextView textView20 = this.djBIcL;
        if (textView20 != null) {
            textView20.setText(marketTopInfo.getTGamma());
        }
        android.widget.TextView textView21 = this.AYXKKw;
        if (textView21 != null) {
            textView21.setText(marketTopInfo.getTMarkedVolatility());
        }
        android.widget.TextView textView22 = this.wlaJM;
        if (textView22 != null) {
            textView22.setText(marketTopInfo.getTSpotIndex());
        }
        android.widget.TextView textView23 = this.AxsJAY;
        if (textView23 != null) {
            textView23.setText(marketTopInfo.getTVega());
        }
        android.widget.TextView textView24 = this.gHZMYf;
        if (textView24 != null) {
            textView24.setText(marketTopInfo.getTTheta());
        }
        android.widget.TextView textView25 = this.DbNXlk;
        if (textView25 != null) {
            textView25.setText(marketTopInfo.getTLeverageMultiple());
        }
        if (!android.text.TextUtils.isEmpty(marketTopInfo.getStrikePrice()) && (textView = this.gEmmrt) != null) {
            textView.setText(marketTopInfo.getStrikePrice());
        }
        if (z || Intrinsics.EZpvd((java.lang.Object) marketTopInfo.getTIncrease(), (java.lang.Object) "--") || Intrinsics.EZpvd((java.lang.Object) marketTopInfo.getTPrice(), (java.lang.Object) "--")) {
            android.widget.TextView textView26 = this.fetchVPNInfo;
            if (textView26 != null) {
                textView26.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
            }
            android.widget.TextView textView27 = this.OLrzqt;
            if (textView27 != null) {
                textView27.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
            }
            android.widget.TextView textView28 = this.copydefault;
            if (textView28 != null) {
                textView28.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.DeEinT));
            }
        } else if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) marketTopInfo.getTIncrease(), (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
            android.widget.TextView textView29 = this.fetchVPNInfo;
            if (textView29 != null) {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                textView29.setTextColor(C33508mxl.AEQbTJ(context));
            }
            android.widget.TextView textView30 = this.OLrzqt;
            if (textView30 != null) {
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                textView30.setTextColor(C33508mxl.AEQbTJ(context2));
            }
            android.widget.TextView textView31 = this.copydefault;
            if (textView31 != null) {
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                textView31.setTextColor(C33508mxl.AEQbTJ(context3));
            }
        } else {
            android.widget.TextView textView32 = this.fetchVPNInfo;
            if (textView32 != null) {
                android.content.Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                textView32.setTextColor(C33508mxl.copydefault(context4));
            }
            android.widget.TextView textView33 = this.OLrzqt;
            if (textView33 != null) {
                android.content.Context context5 = getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "");
                textView33.setTextColor(C33508mxl.copydefault(context5));
            }
            if (Intrinsics.EZpvd((java.lang.Object) marketTopInfo.getTIncrease(), (java.lang.Object) pTB.KWHzl(pTB.OLrzqt((java.lang.Object) "0.00"), 2, RoundingMode.DOWN))) {
                android.widget.TextView textView34 = this.copydefault;
                if (textView34 != null) {
                    textView34.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.QwvEab));
                }
            } else {
                android.widget.TextView textView35 = this.copydefault;
                if (textView35 != null) {
                    android.content.Context context6 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context6, "");
                    textView35.setTextColor(C33508mxl.copydefault(context6));
                }
            }
        }
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) marketTopInfo.getTPriceDifference(), (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null)) {
            android.widget.TextView textView36 = this.OLrzqt;
            if (textView36 != null) {
                textView36.setText(marketTopInfo.getTPriceDifference());
            }
        } else if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) marketTopInfo.getTPriceDifference(), (java.lang.CharSequence) Marker.ANY_NON_NULL_MARKER, false, 2, (java.lang.Object) null) || Intrinsics.EZpvd((java.lang.Object) "0", (java.lang.Object) marketTopInfo.getTPriceDifference())) {
            android.widget.TextView textView37 = this.OLrzqt;
            if (textView37 != null) {
                textView37.setText(marketTopInfo.getTPriceDifference());
            }
        } else {
            android.widget.TextView textView38 = this.OLrzqt;
            if (textView38 != null) {
                textView38.setText(Marker.ANY_NON_NULL_MARKER + marketTopInfo.getTPriceDifference());
            }
        }
        if (Intrinsics.EZpvd((java.lang.Object) "INDEX", (java.lang.Object) marketTopInfo.getType())) {
            android.widget.TextView textView39 = this.AuCTelauCTel;
            if (textView39 != null) {
                textView39.setVisibility(8);
            }
            android.widget.TextView textView40 = this.zLjUOn;
            if (textView40 != null) {
                textView40.setVisibility(8);
            }
            android.widget.TextView textView41 = this.AubY;
            if (textView41 != null) {
                textView41.setVisibility(8);
            }
            android.widget.TextView textView42 = this.zsXlph;
            if (textView42 != null) {
                textView42.setVisibility(8);
                return;
            }
            return;
        }
        android.widget.TextView textView43 = this.AubY;
        if (textView43 != null) {
            textView43.setVisibility(0);
        }
        android.widget.TextView textView44 = this.zsXlph;
        if (textView44 != null) {
            textView44.setVisibility(0);
        }
        android.widget.TextView textView45 = this.AuCTelauCTel;
        if (textView45 != null) {
            textView45.setVisibility(0);
        }
        android.widget.TextView textView46 = this.zLjUOn;
        if (textView46 != null) {
            textView46.setVisibility(0);
        }
    }

    public final void setFlashNewsData(@NotNull java.util.List<KlineFlashItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C39826pzf c39826pzf = this.DTwDnp;
        if (c39826pzf != null) {
            c39826pzf.setFlashNewsData(list);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pzP */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void displayFeedNewsLayout$default(C39810pzP c39810pzP, java.lang.String str, java.lang.String str2, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            function1 = null;
        }
        c39810pzP.KWHzl(str, str2, z, function1);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, Function1<? super KlineFlashItem, Unit> function1) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        BizInstrument bizInstrumentValueOf;
        java.lang.String tradeSymbol;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() == 0 || str2.length() == 0) {
            return;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2)) != null && (bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str)) != null && (tradeSymbol = bizInstrumentValueOf.getTradeSymbol()) != null) {
            str3 = tradeSymbol;
        }
        C39826pzf c39826pzf = this.DTwDnp;
        if (c39826pzf != null) {
            c39826pzf.setOnFlashNewsClick(function1);
        }
        C39826pzf c39826pzf2 = this.DTwDnp;
        if (c39826pzf2 != null) {
            c39826pzf2.copydefault(str3, z);
        }
    }

    public final void copydefault() {
        C39826pzf c39826pzf = this.DTwDnp;
        if (c39826pzf != null) {
            c39826pzf.OLrzqt();
        }
    }

    public final void EZpvd() {
        C39826pzf c39826pzf = this.DTwDnp;
        if (c39826pzf != null) {
            c39826pzf.KWHzl();
        }
    }

    public final void setEstimateTime(@NotNull MarketCoinInfo marketCoinInfo) {
        xMS xmsGEmmrt;
        InterfaceC54577xNn interfaceC54577xNn;
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        InterfaceC54577xNn interfaceC54577xNn2;
        InterfaceC54581xNr interfaceC54581xNrCopydefault2;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(marketCoinInfo, "");
        if (Intrinsics.EZpvd((java.lang.Object) "OPTION", (java.lang.Object) marketCoinInfo.getInstrumentType())) {
            long jValueOf = C33129mqd.valueOf(marketCoinInfo.getExpireTime());
            if (jValueOf <= 0) {
                android.widget.TextView textView = this.valueOf;
                if (textView != null) {
                    textView.setVisibility(4);
                }
                android.widget.TextView textView2 = this.AhwBna;
                if (textView2 != null) {
                    textView2.setVisibility(4);
                }
                android.widget.TextView textView3 = this.gEmmrt;
                if (textView3 != null) {
                    textView3.setVisibility(4);
                }
                android.widget.TextView textView4 = this.finit;
                if (textView4 != null) {
                    textView4.setVisibility(4);
                    return;
                }
                return;
            }
            InterfaceC49425uoM interfaceC49425uoM = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            BizInstrument suggestedInstrument$default = (interfaceC49425uoM == null || (interfaceC54577xNn2 = (InterfaceC54577xNn) interfaceC49425uoM.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrCopydefault2 = interfaceC54577xNn2.copydefault()) == null) ? null : InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrCopydefault2, marketCoinInfo.getInstrumentType(), marketCoinInfo.getInstrumentId(), null, null, 12, null);
            InterfaceC49425uoM interfaceC49425uoM2 = (InterfaceC49425uoM) C43251rlk.OLrzqt(InterfaceC49425uoM.class);
            if (interfaceC49425uoM2 == null || (interfaceC54577xNn = (InterfaceC54577xNn) interfaceC49425uoM2.KWHzl(TradeKey.MANAGER)) == null || (interfaceC54581xNrCopydefault = interfaceC54577xNn.copydefault()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(marketCoinInfo.getInstrumentType())) == null) {
                xmsGEmmrt = null;
            } else {
                if (suggestedInstrument$default != null && (instFamily = suggestedInstrument$default.getInstFamily()) != null) {
                    str = instFamily;
                }
                xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(str);
            }
            java.lang.String strAkhnZx = xmsGEmmrt != null ? xmsGEmmrt.AkhnZx(marketCoinInfo.getStrikePrice()) : null;
            android.widget.TextView textView5 = this.gEmmrt;
            if (textView5 != null) {
                textView5.setText(strAkhnZx);
            }
            this.AwvSrB.copydefault();
            this.AwvSrB.KWHzl(jValueOf - java.lang.System.currentTimeMillis(), this.aKErDB, 1000L, new Function1() { // from class: o.pzR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C39810pzP.EZpvd(this.copydefault, (java.lang.Long) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(C39810pzP c39810pzP, java.lang.Long l) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        if (l == null) {
            android.widget.TextView textView5 = c39810pzP.valueOf;
            if (textView5 != null) {
                textView5.setVisibility(4);
            }
            android.widget.TextView textView6 = c39810pzP.AhwBna;
            if (textView6 != null) {
                textView6.setVisibility(4);
            }
            android.widget.TextView textView7 = c39810pzP.gEmmrt;
            if (textView7 != null) {
                textView7.setVisibility(4);
            }
            android.widget.TextView textView8 = c39810pzP.finit;
            if (textView8 != null) {
                textView8.setVisibility(4);
            }
        } else {
            android.widget.TextView textView9 = c39810pzP.valueOf;
            if (textView9 != null && textView9.getVisibility() == 4 && (textView4 = c39810pzP.valueOf) != null) {
                textView4.setVisibility(0);
            }
            android.widget.TextView textView10 = c39810pzP.AhwBna;
            if (textView10 != null && textView10.getVisibility() == 4 && (textView3 = c39810pzP.AhwBna) != null) {
                textView3.setVisibility(0);
            }
            android.widget.TextView textView11 = c39810pzP.gEmmrt;
            if (textView11 != null && textView11.getVisibility() == 4 && (textView2 = c39810pzP.gEmmrt) != null) {
                textView2.setVisibility(0);
            }
            android.widget.TextView textView12 = c39810pzP.finit;
            if (textView12 != null && textView12.getVisibility() == 4 && (textView = c39810pzP.finit) != null) {
                textView.setVisibility(0);
            }
            android.widget.TextView textView13 = c39810pzP.AhwBna;
            if (textView13 != null) {
                textView13.setText(xUX.KWHzl(l.longValue()));
            }
        }
        return Unit.INSTANCE;
    }

    public final void setPriceTypeAndInstType(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if ((!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "SPOT") || pFS.KWHzl.AEQbTJ(str2)) && !z) {
            C55258xgZ c55258xgZ = this.getNewProxyInstance;
            if (c55258xgZ != null) {
                c55258xgZ.setVisibility(0);
            }
            android.widget.TextView textView = this.ejfBZ;
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1109595108) {
                    if (iHashCode != 313565562) {
                        if (iHashCode == 363605869 && str.equals("TYPE_INDEX_KLINE")) {
                            C55258xgZ c55258xgZ2 = this.getNewProxyInstance;
                            if (c55258xgZ2 != null) {
                                c55258xgZ2.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.zOIQXb));
                            }
                            C55258xgZ c55258xgZ3 = this.getNewProxyInstance;
                            if (c55258xgZ3 != null) {
                                c55258xgZ3.setHelperLabelType(2);
                            }
                            C55258xgZ c55258xgZ4 = this.getNewProxyInstance;
                            if (c55258xgZ4 != null) {
                                c55258xgZ4.setOnClickListener(new Application(c55258xgZ4, 1000L));
                            }
                        }
                    } else if (str.equals("TYPE_KLINE")) {
                        C55258xgZ c55258xgZ5 = this.getNewProxyInstance;
                        if (c55258xgZ5 != null) {
                            c55258xgZ5.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.hlkKmr));
                        }
                        if (z2) {
                            C55258xgZ c55258xgZ6 = this.getNewProxyInstance;
                            if (c55258xgZ6 != null) {
                                c55258xgZ6.setHelperLabelType(1);
                            }
                            C55258xgZ c55258xgZ7 = this.getNewProxyInstance;
                            if (c55258xgZ7 != null) {
                                c55258xgZ7.setOnClickListener(new StateListAnimator(c55258xgZ7, 1000L, this));
                            }
                        } else {
                            C55258xgZ c55258xgZ8 = this.getNewProxyInstance;
                            if (c55258xgZ8 != null) {
                                c55258xgZ8.setHelperLabelType(2);
                            }
                            C55258xgZ c55258xgZ9 = this.getNewProxyInstance;
                            if (c55258xgZ9 != null) {
                                c55258xgZ9.setOnClickListener(new Activity(c55258xgZ9, 1000L));
                            }
                        }
                    }
                } else if (str.equals("TYPE_MARK_PRICE_KLINE")) {
                    C55258xgZ c55258xgZ10 = this.getNewProxyInstance;
                    if (c55258xgZ10 != null) {
                        c55258xgZ10.setText(C33070mpX.AYXKKw(C35964oKf.Fragment.zOIQXb));
                    }
                    C55258xgZ c55258xgZ11 = this.getNewProxyInstance;
                    if (c55258xgZ11 != null) {
                        c55258xgZ11.setHelperLabelType(2);
                    }
                    C55258xgZ c55258xgZ12 = this.getNewProxyInstance;
                    if (c55258xgZ12 != null) {
                        c55258xgZ12.setOnClickListener(new TaskDescription(c55258xgZ12, 1000L));
                    }
                }
            }
        } else {
            C55258xgZ c55258xgZ13 = this.getNewProxyInstance;
            if (c55258xgZ13 != null) {
                c55258xgZ13.setVisibility(8);
            }
            android.widget.TextView textView2 = this.ejfBZ;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        if (!Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "OPTION")) {
            android.widget.ImageView imageView = this.OcIXYQ;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            KWHzl().setVisibility(8);
            if (Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "INDEX")) {
                C55258xgZ c55258xgZ14 = this.getNewProxyInstance;
                if (c55258xgZ14 != null) {
                    c55258xgZ14.setVisibility(8);
                }
                android.widget.TextView textView3 = this.ejfBZ;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "TYPE_INDEX_KLINE")) {
            android.widget.ImageView imageView2 = this.OcIXYQ;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            KWHzl().setVisibility(8);
            return;
        }
        android.widget.ImageView imageView3 = this.OcIXYQ;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        if (this.ORxRYg) {
            android.widget.ImageView imageView4 = this.OcIXYQ;
            if (imageView4 != null) {
                imageView4.setImageResource(C35964oKf.Activity.AkhnZx);
            }
            KWHzl().setVisibility(8);
            return;
        }
        android.widget.ImageView imageView5 = this.OcIXYQ;
        if (imageView5 != null) {
            imageView5.setImageResource(C35964oKf.Activity.QOLQEE);
        }
        KWHzl().setVisibility(0);
    }

    public final void AEQbTJ() {
        this.AwvSrB.copydefault();
    }

    public final void KWHzl(@androidx.annotation.StringRes int i) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.copydefault(i);
        java.lang.String string = getContext().getString(C35964oKf.Fragment.sSMYrx);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
        viewOnClickListenerC54939xaY.show();
    }
}
