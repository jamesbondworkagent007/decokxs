package o;

import android.graphics.RectF;
import android.view.View;
import com.okinc.kline.api.bean.MarketCoinInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import o.oKA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wPS extends android.widget.LinearLayout {
    public final android.widget.TextView AEQbTJ;
    public AbstractC55737xpb EZpvd;
    public final android.widget.TextView copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wPS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        setOrientation(0);
        setGravity(16);
        android.view.LayoutInflater.from(context).inflate(C48033uCm.Activity.OKvQBs, this);
        this.AEQbTJ = (android.widget.TextView) findViewById(C48033uCm.Application.getSupportedCipherSuites);
        this.copydefault = (android.widget.TextView) findViewById(C48033uCm.Application.LayoutRes);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        java.lang.String strEZpvd;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instType;
        java.lang.String instFamily;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        xMS xmsGEmmrt = null;
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str2, str, null, null, 12, null) : null;
        java.lang.String str3 = "";
        if (Intrinsics.EZpvd((java.lang.Object) (suggestedInstrument$default != null ? suggestedInstrument$default.getQuoteSymbol() : null), (java.lang.Object) "USDC")) {
            strEZpvd = "";
        } else {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            strEZpvd = (interfaceC54581xNrOLrzqt2 == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt2.OLrzqt(str2)) == null) ? null : abstractC54531xLwOLrzqt.EZpvd(suggestedInstrument$default);
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt3 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt3 != null) {
            if (suggestedInstrument$default == null || (instType = suggestedInstrument$default.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt2 = interfaceC54581xNrOLrzqt3.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt2 != null) {
                if (suggestedInstrument$default != null && (instFamily = suggestedInstrument$default.getInstFamily()) != null) {
                    str3 = instFamily;
                }
                xmsGEmmrt = abstractC54531xLwOLrzqt2.gEmmrt(str3);
            }
        }
        OLrzqt();
        TaskDescription taskDescription = new TaskDescription(str, this, strEZpvd, xmsGEmmrt, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        this.EZpvd = taskDescription;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = c54589xNz.copydefault();
        if (interfaceC54581xNrCopydefault != null) {
            interfaceC54581xNrCopydefault.copydefault(yDY.copydefault(taskDescription));
        }
    }

    public static final class TaskDescription extends AbstractC55737xpb {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ xMS OLrzqt;
        public final /* synthetic */ wPS copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(java.lang.String str, wPS wps, java.lang.String str2, xMS xms, java.lang.String str3) {
            super(str, str3, false, 4, null);
            this.copydefault = wps;
            this.AEQbTJ = str2;
            this.OLrzqt = xms;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Ljava/lang/String;)V */
        @Override // o.AbstractC55755xpt
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(java.util.List<TickersData> list, java.lang.String str) {
            java.lang.String strAhwBna;
            int iTradeFall$default;
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            TickersData tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (tickersData != null) {
                wPS wps = this.copydefault;
                java.lang.String str2 = this.AEQbTJ;
                xMS xms = this.OLrzqt;
                if (tickersData.getLast().length() == 0) {
                    return;
                }
                android.widget.TextView textView = wps.copydefault;
                xMR xmr = xMR.copydefault;
                if (xms == null || (strAhwBna = xms.AhwBna(tickersData.getLast())) == null) {
                    strAhwBna = "";
                }
                textView.setText(str2 + xmr.AEQbTJ(strAhwBna, C33129mqd.AhwBna(xms != null ? xms.AEQbTJ() : null)));
                double dDoubleValue = C54789xVj.EZpvd.AEQbTJ(tickersData.getLast(), tickersData.getOpen24h(), tickersData.getSodUtc0(), tickersData.getSodUtc8()).getFirst().doubleValue();
                android.widget.TextView textView2 = wps.copydefault;
                if (C33129mqd.AEQbTJ(java.lang.Double.valueOf(dDoubleValue), 0)) {
                    C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                    android.content.Context context = wps.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    iTradeFall$default = C33512mxp.tradeRise$default(c33512mxp, context, 0.0f, 2, null);
                } else {
                    C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
                    android.content.Context context2 = wps.getContext();
                    Intrinsics.checkNotNullExpressionValue(context2, "");
                    iTradeFall$default = C33512mxp.tradeFall$default(c33512mxp2, context2, 0.0f, 2, null);
                }
                textView2.setTextColor(iTradeFall$default);
            }
        }
    }

    public final void OLrzqt() {
        InterfaceC54581xNr interfaceC54581xNrCopydefault;
        AbstractC55737xpb abstractC55737xpb = this.EZpvd;
        if (abstractC55737xpb == null || (interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault()) == null) {
            return;
        }
        interfaceC54581xNrCopydefault.AEQbTJ(yDY.copydefault(abstractC55737xpb));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OLrzqt();
    }

    public final java.lang.CharSequence AEQbTJ(java.lang.String str, java.lang.String str2, @androidx.annotation.ColorInt final int i, @androidx.annotation.ColorInt final int i2) {
        return C33061mpO.setupSpanStyles$default(str, new java.lang.String[]{str2}, 0, null, false, new Function1() { // from class: o.wPR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wPS.KWHzl(i, i2, this, (java.util.List) obj);
            }
        }, 14, null);
    }

    public static final Unit KWHzl(int i, int i2, wPS wps, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new mAD(0.0f, 0, i, C55298xhM.dp2px$default(2.0f, null, 1, null), new RectF(C55298xhM.dp2pxFloat$default(4.0f, null, 1, null), C55298xhM.dp2pxFloat$default(1.0f, null, 1, null), C55298xhM.dp2pxFloat$default(4.0f, null, 1, null), C55298xhM.dp2pxFloat$default(1.0f, null, 1, null)), null, C55298xhM.dp2px$default(1.0f, null, 1, null), i2, 32, null));
        list.add(new android.text.style.TextAppearanceSpan(wps.getContext(), C32113mPz.Dialog.AkhnZx));
        list.add(new android.text.style.TypefaceSpan(com.google.android.exoplayer2.C.SANS_SERIF_NAME));
        return Unit.INSTANCE;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ wPS KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, java.lang.String str, java.lang.String str2, wPS wps) {
            this.EZpvd = view;
            this.copydefault = j;
            this.AEQbTJ = str;
            this.OLrzqt = str2;
            this.KWHzl = wps;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                MarketCoinInfo marketCoinInfo = new MarketCoinInfo(this.AEQbTJ, this.OLrzqt, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 28, (DefaultConstructorMarker) null);
                oKA oka = (oKA) C43251rlk.OLrzqt(oKA.class);
                if (oka != null) {
                    android.content.Context context = this.KWHzl.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    oKA.TaskDescription.gotoNewKlinePage$default(oka, context, marketCoinInfo, null, null, "bot_page_trade", null, null, null, null, null, null, 2028, null);
                }
            }
        }
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String futureTitleText$default;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        setOnClickListener(new Activity(this, 1000L, str, str2, this));
        C54799xVt c54799xVt = C54799xVt.AEQbTJ;
        java.lang.String titleByIdAndType$default = C54799xVt.getTitleByIdAndType$default(c54799xVt, str, str2, false, false, 12, null);
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "SWAP")) {
            futureTitleText$default = AEQbTJ(titleByIdAndType$default, C33070mpX.AYXKKw(C55688xof.Application.QSAYLr), C33070mpX.copydefault(C52761wXj.Activity.invokespecialhOMIpD), C33070mpX.copydefault(C48033uCm.StateListAnimator.AEQbTJ));
        } else {
            futureTitleText$default = titleByIdAndType$default;
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "FUTURES")) {
                futureTitleText$default = C54799xVt.setFutureTitleText$default(c54799xVt, str, str2, false, true, 4, null);
            }
        }
        this.AEQbTJ.setText(futureTitleText$default);
        EZpvd(str, str2);
    }
}
