package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.market.ext.UpDownColor;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qKB extends AbstractC40510qYn<qWC, C42889ret> {
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC40510qYn
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C42889ret AEQbTJ(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        C42889ret c42889retKWHzl = C42889ret.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c42889retKWHzl, "");
        return c42889retKWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [78=5] */
    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroidx/viewbinding/ViewBinding;ILo/qYt;)V */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.AbstractC40510qYn
    public void AEQbTJ(@NotNull final C42889ret c42889ret, int i, @NotNull final qWC qwc) {
        java.lang.String strGEmmrt;
        Intrinsics.checkNotNullParameter(c42889ret, "");
        Intrinsics.checkNotNullParameter(qwc, "");
        final CoinQuote coinQuoteKWHzl = qwc.KWHzl();
        boolean z = coinQuoteKWHzl.isNewLabel() && ((strGEmmrt = qwc.gEmmrt()) == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt));
        AppCompatImageView appCompatImageView = c42889ret.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        appCompatImageView.setVisibility(0);
        c42889ret.EZpvd.setSelected(true);
        java.lang.String instType = coinQuoteKWHzl.getInstType();
        switch (instType.hashCode()) {
            case -1956807563:
                if (instType.equals("OPTION")) {
                    AppCompatImageView appCompatImageView2 = c42889ret.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                    appCompatImageView2.setVisibility(8);
                    C40358qSx c40358qSx = c42889ret.AEQbTJ;
                    kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, coinQuoteKWHzl.getInstId(), coinQuoteKWHzl.getInstType(), false, false, false, 28, null), "");
                    java.lang.String turnover = qwc.KWHzl().getTurnover();
                    java.lang.String str = turnover == null ? "" : turnover;
                    java.lang.String price = coinQuoteKWHzl.getPrice();
                    java.lang.String strAEQbTJ = pTF.KWHzl.AEQbTJ(coinQuoteKWHzl.getChangePercentDisplay());
                    UpDownColor upDownColorOLrzqt = UpDownColor.Companion.OLrzqt(coinQuoteKWHzl.getChangePercent());
                    AppCompatImageView appCompatImageView3 = c42889ret.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "");
                    boolean z2 = appCompatImageView3.getVisibility() == 0;
                    AppCompatImageView appCompatImageView4 = c42889ret.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView4, "");
                    c40358qSx.setData(pairOLrzqt, null, str, price, strAEQbTJ, upDownColorOLrzqt, z2, appCompatImageView4.getVisibility() == 0, false, z, (195584 & 1024) != 0 ? null : null, (195584 & 2048) != 0 ? null : null, (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : null, (65536 & 195584) != 0 ? null : coinQuoteKWHzl.getTurnover(), (195584 & 131072) != 0 ? null : null);
                }
                break;
            case 2074257:
                if (instType.equals("COIN")) {
                    AppCompatImageView appCompatImageView5 = c42889ret.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView5, "");
                    appCompatImageView5.setVisibility(0);
                    AppCompatImageView appCompatImageView6 = c42889ret.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView6, "");
                    java.lang.String icon = qwc.KWHzl().getIcon();
                    if (icon == null) {
                        icon = "";
                    }
                    C46742tcs.AEQbTJ(appCompatImageView6, icon);
                    C40358qSx c40358qSx2 = c42889ret.AEQbTJ;
                    kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(coinQuoteKWHzl.getBaseCurrency(), "");
                    java.lang.String quoteCurrency = coinQuoteKWHzl.getQuoteCurrency();
                    java.lang.String price2 = coinQuoteKWHzl.getPrice();
                    java.lang.String strAEQbTJ2 = pTF.KWHzl.AEQbTJ(coinQuoteKWHzl.getChangePercentDisplay());
                    UpDownColor upDownColorOLrzqt2 = UpDownColor.Companion.OLrzqt(coinQuoteKWHzl.getChangePercent());
                    AppCompatImageView appCompatImageView7 = c42889ret.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView7, "");
                    boolean z3 = appCompatImageView7.getVisibility() == 0;
                    AppCompatImageView appCompatImageView8 = c42889ret.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView8, "");
                    c40358qSx2.setData(pairOLrzqt2, null, quoteCurrency, price2, strAEQbTJ2, upDownColorOLrzqt2, z3, appCompatImageView8.getVisibility() == 0, false, z, (195584 & 1024) != 0 ? null : null, (195584 & 2048) != 0 ? null : null, (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : null, (65536 & 195584) != 0 ? null : null, (195584 & 131072) != 0 ? null : null);
                }
                break;
            case 2552066:
                if (instType.equals("SPOT")) {
                    AppCompatImageView appCompatImageView9 = c42889ret.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView9, "");
                    appCompatImageView9.setVisibility(0);
                    AppCompatImageView appCompatImageView10 = c42889ret.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView10, "");
                    java.lang.String icon2 = qwc.KWHzl().getIcon();
                    if (icon2 == null) {
                        icon2 = "";
                    }
                    C46742tcs.AEQbTJ(appCompatImageView10, icon2);
                    C40492qXw c40492qXw = c42889ret.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c40492qXw, "");
                    boolean zAEQbTJ = C41310qoR.AEQbTJ(c40492qXw, qwc.KWHzl().getCountDownInfo(), qwc.copydefault().getInstId(), qwc.copydefault().getInstType());
                    C40492qXw c40492qXw2 = c42889ret.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c40492qXw2, "");
                    c40492qXw2.setVisibility(zAEQbTJ ? 0 : 8);
                    c42889ret.AEQbTJ.setPriceLayoutVisible(!zAEQbTJ);
                    java.lang.String str2 = (C33129mqd.OLrzqt((java.lang.CharSequence) coinQuoteKWHzl.getLeverageRatio()) && C55608xnE.EZpvd()) ? coinQuoteKWHzl.getLeverageRatio() + "x" : null;
                    C40358qSx c40358qSx3 = c42889ret.AEQbTJ;
                    kotlin.Pair pairOLrzqt3 = C56390yDp.OLrzqt(coinQuoteKWHzl.getBaseCurrency(), coinQuoteKWHzl.getQuoteCurrency());
                    java.util.List listEZpvd = str2 != null ? C56402yEa.EZpvd(str2) : null;
                    java.lang.String turnover2 = qwc.KWHzl().getTurnover();
                    java.lang.String str3 = turnover2 == null ? "" : turnover2;
                    java.lang.String price3 = zAEQbTJ ? "" : coinQuoteKWHzl.getPrice();
                    java.lang.String strAEQbTJ3 = zAEQbTJ ? "" : pTF.KWHzl.AEQbTJ(coinQuoteKWHzl.getChangePercentDisplay());
                    UpDownColor upDownColorOLrzqt3 = zAEQbTJ ? null : UpDownColor.Companion.OLrzqt(coinQuoteKWHzl.getChangePercent());
                    AppCompatImageView appCompatImageView11 = c42889ret.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView11, "");
                    boolean z4 = appCompatImageView11.getVisibility() == 0;
                    AppCompatImageView appCompatImageView12 = c42889ret.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView12, "");
                    c40358qSx3.setData(pairOLrzqt3, listEZpvd, str3, price3, strAEQbTJ3, upDownColorOLrzqt3, z4, appCompatImageView12.getVisibility() == 0, false, z, (195584 & 1024) != 0 ? null : null, (195584 & 2048) != 0 ? null : null, (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : null, (65536 & 195584) != 0 ? null : coinQuoteKWHzl.getTurnover(), (195584 & 131072) != 0 ? null : null);
                }
                break;
            case 2558355:
                if (instType.equals("SWAP")) {
                    AppCompatImageView appCompatImageView13 = c42889ret.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView13, "");
                    appCompatImageView13.setVisibility(0);
                    AppCompatImageView appCompatImageView14 = c42889ret.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView14, "");
                    java.lang.String icon3 = qwc.KWHzl().getIcon();
                    if (icon3 == null) {
                        icon3 = "";
                    }
                    C46742tcs.AEQbTJ(appCompatImageView14, icon3);
                    C40492qXw c40492qXw3 = c42889ret.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c40492qXw3, "");
                    boolean zAEQbTJ2 = C41310qoR.AEQbTJ(c40492qXw3, qwc.KWHzl().getCountDownInfo(), qwc.copydefault().getInstId(), qwc.copydefault().getInstType());
                    C40492qXw c40492qXw4 = c42889ret.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c40492qXw4, "");
                    c40492qXw4.setVisibility(zAEQbTJ2 ? 0 : 8);
                    if (!zAEQbTJ2) {
                        C40358qSx c40358qSx4 = c42889ret.AEQbTJ;
                        kotlin.Pair pairOLrzqt4 = C56390yDp.OLrzqt(C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, coinQuoteKWHzl.getInstId(), coinQuoteKWHzl.getInstType(), false, false, false, 12, null), "");
                        java.util.List listGEmmrt = coinQuoteKWHzl.isPreMarket() ? yDY.gEmmrt(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ), C33070mpX.AYXKKw(qZH.PendingIntent.hbZCHz)) : coinQuoteKWHzl.isRebase() ? yDY.gEmmrt(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ), C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPRGtXKCDKRTZD)) : C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ));
                        java.lang.String turnover3 = qwc.KWHzl().getTurnover();
                        java.lang.String str4 = turnover3 == null ? "" : turnover3;
                        java.lang.String price4 = coinQuoteKWHzl.getPrice();
                        java.lang.String strAEQbTJ4 = pTF.KWHzl.AEQbTJ(coinQuoteKWHzl.getChangePercentDisplay());
                        UpDownColor upDownColorOLrzqt4 = UpDownColor.Companion.OLrzqt(coinQuoteKWHzl.getChangePercent());
                        AppCompatImageView appCompatImageView15 = c42889ret.OLrzqt;
                        Intrinsics.checkNotNullExpressionValue(appCompatImageView15, "");
                        boolean z5 = appCompatImageView15.getVisibility() == 0;
                        AppCompatImageView appCompatImageView16 = c42889ret.EZpvd;
                        Intrinsics.checkNotNullExpressionValue(appCompatImageView16, "");
                        c40358qSx4.setData(pairOLrzqt4, listGEmmrt, str4, price4, strAEQbTJ4, upDownColorOLrzqt4, z5, appCompatImageView16.getVisibility() == 0, false, z, (195584 & 1024) != 0 ? null : java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD), (195584 & 2048) != 0 ? null : java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ), (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : null, (65536 & 195584) != 0 ? null : coinQuoteKWHzl.getTurnover(), (195584 & 131072) != 0 ? null : null);
                    } else {
                        final boolean z6 = false;
                        final boolean z7 = z;
                        c42889ret.KWHzl.post(new java.lang.Runnable() { // from class: o.qKD
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                qKB.OLrzqt(c42889ret, coinQuoteKWHzl, qwc, z6, z7);
                            }
                        });
                    }
                }
                break;
            case 214415088:
                if (instType.equals("FUTURES")) {
                    AppCompatImageView appCompatImageView17 = c42889ret.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView17, "");
                    appCompatImageView17.setVisibility(0);
                    AppCompatImageView appCompatImageView18 = c42889ret.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView18, "");
                    java.lang.String icon4 = qwc.KWHzl().getIcon();
                    if (icon4 == null) {
                        icon4 = "";
                    }
                    C46742tcs.AEQbTJ(appCompatImageView18, icon4);
                    C40358qSx c40358qSx5 = c42889ret.AEQbTJ;
                    kotlin.Pair pairOLrzqt5 = C56390yDp.OLrzqt(C40381qTt.copydefault.copydefault(coinQuoteKWHzl.getInstId(), coinQuoteKWHzl.getInstType(), true, true, coinQuoteKWHzl.isPreMarket()), "");
                    java.lang.String turnover4 = qwc.KWHzl().getTurnover();
                    java.lang.String str5 = turnover4 == null ? "" : turnover4;
                    java.lang.String price5 = coinQuoteKWHzl.getPrice();
                    java.lang.String strAEQbTJ5 = pTF.KWHzl.AEQbTJ(coinQuoteKWHzl.getChangePercentDisplay());
                    UpDownColor upDownColorOLrzqt5 = UpDownColor.Companion.OLrzqt(coinQuoteKWHzl.getChangePercent());
                    AppCompatImageView appCompatImageView19 = c42889ret.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView19, "");
                    boolean z8 = appCompatImageView19.getVisibility() == 0;
                    AppCompatImageView appCompatImageView20 = c42889ret.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView20, "");
                    c40358qSx5.setData(pairOLrzqt5, null, str5, price5, strAEQbTJ5, upDownColorOLrzqt5, z8, appCompatImageView20.getVisibility() == 0, false, z, (195584 & 1024) != 0 ? null : null, (195584 & 2048) != 0 ? null : null, (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : null, (65536 & 195584) != 0 ? null : coinQuoteKWHzl.getTurnover(), (195584 & 131072) != 0 ? null : null);
                }
                break;
        }
        AppCompatImageView appCompatImageView21 = c42889ret.EZpvd;
        appCompatImageView21.setOnClickListener(new StateListAnimator(appCompatImageView21, 1000L, c42889ret, coinQuoteKWHzl));
        ConstraintLayout root = c42889ret.getRoot();
        root.setOnClickListener(new ActionBar(root, 1000L, coinQuoteKWHzl, c42889ret, qwc, i));
    }

    public static final void OLrzqt(C42889ret c42889ret, CoinQuote coinQuote, qWC qwc, boolean z, boolean z2) {
        java.util.List listEZpvd;
        C40358qSx c40358qSx = c42889ret.AEQbTJ;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(C40381qTt.getTitleByIdAndType$default(C40381qTt.copydefault, coinQuote.getInstId(), coinQuote.getInstType(), false, false, false, 12, null), "");
        if (coinQuote.isPreMarket()) {
            listEZpvd = yDY.gEmmrt(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ), C33070mpX.AYXKKw(qZH.PendingIntent.hbZCHz));
        } else if (coinQuote.isRebase()) {
            listEZpvd = yDY.gEmmrt(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ), C33070mpX.AYXKKw(qZH.PendingIntent.HJWChPRGtXKCDKRTZD));
        } else {
            listEZpvd = C56402yEa.EZpvd(C33070mpX.AYXKKw(qZH.PendingIntent.dvKsVJ));
        }
        java.util.List list = listEZpvd;
        java.lang.String turnover = qwc.KWHzl().getTurnover();
        java.lang.String str = turnover == null ? "" : turnover;
        AppCompatImageView appCompatImageView = c42889ret.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
        boolean z3 = appCompatImageView.getVisibility() == 0;
        AppCompatImageView appCompatImageView2 = c42889ret.EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
        c40358qSx.setData(pairOLrzqt, list, str, "", "", null, z3, appCompatImageView2.getVisibility() == 0, z, z2, (195584 & 1024) != 0 ? null : java.lang.Integer.valueOf(C52761wXj.Activity.invokespecialhOMIpD), (195584 & 2048) != 0 ? null : java.lang.Integer.valueOf(qZH.TaskDescription.AEQbTJ), (195584 & 4096) != 0 ? false : false, (195584 & 8192) != 0 ? java.lang.Boolean.FALSE : null, (195584 & 16384) != 0 ? "" : null, (32768 & 195584) != 0 ? 0 : java.lang.Integer.valueOf(c42889ret.KWHzl.getWidth()), (65536 & 195584) != 0 ? null : coinQuote.getTurnover(), (195584 & 131072) != 0 ? null : null);
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ CoinQuote AEQbTJ;
        public final /* synthetic */ long AYXKKw;
        public final /* synthetic */ C42889ret EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ qWC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, CoinQuote coinQuote, C42889ret c42889ret, qWC qwc, int i) {
            this.KWHzl = view;
            this.AYXKKw = j;
            this.AEQbTJ = coinQuote;
            this.EZpvd = c42889ret;
            this.copydefault = qwc;
            this.OLrzqt = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AYXKKw || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ.getInstType(), (java.lang.Object) "COIN")) {
                    ConstraintLayout root = this.EZpvd.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "");
                    qPL qplAEQbTJ = qPS.AEQbTJ(root);
                    if (qplAEQbTJ != null) {
                        qplAEQbTJ.copydefault(new C40131qKm(this.AEQbTJ.getInstId()));
                        return;
                    }
                    return;
                }
                java.lang.String strGEmmrt = this.copydefault.gEmmrt();
                boolean z = strGEmmrt == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strGEmmrt);
                ConstraintLayout root2 = this.EZpvd.getRoot();
                Intrinsics.checkNotNullExpressionValue(root2, "");
                qPL qplAEQbTJ2 = qPS.AEQbTJ(root2);
                if (qplAEQbTJ2 != null) {
                    ConstraintLayout root3 = this.EZpvd.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root3, "");
                    qplAEQbTJ2.AEQbTJ(root3, new C48915ueg(this.AEQbTJ.getInstId(), this.AEQbTJ.getInstType(), java.lang.Integer.valueOf(this.OLrzqt), C27989kKu.Companion.djBIcL()), "favorites", this.AEQbTJ.getInstType(), !z, this.copydefault.copydefault());
                }
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ CoinQuote EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C42889ret copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C42889ret c42889ret, CoinQuote coinQuote) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.copydefault = c42889ret;
            this.EZpvd = coinQuote;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                AppCompatImageView appCompatImageView = this.copydefault.EZpvd;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                qKN qknOLrzqt = qKO.OLrzqt(appCompatImageView);
                if (qknOLrzqt != null) {
                    BizInstrument watchMarketInstrument$default = xUD.getWatchMarketInstrument$default(this.EZpvd.getInstType(), this.EZpvd.getInstId(), null, null, false, 28, null);
                    if (watchMarketInstrument$default == null) {
                        return;
                    }
                    C40375qTn.AEQbTJ.copydefault("NavFavoritesItemBinder", "removeWatching error, cause Instrument is null, instId: " + this.EZpvd.getInstId() + ", instType: " + this.EZpvd.getInstType());
                    qknOLrzqt.KWHzl(watchMarketInstrument$default);
                }
                AppCompatImageView appCompatImageView2 = this.copydefault.EZpvd;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
                qPT qptKWHzl = qPU.KWHzl(appCompatImageView2);
                if (qptKWHzl != null) {
                    qptKWHzl.djBIcL(C27989kKu.Companion.isConnected());
                }
            }
        }
    }
}
