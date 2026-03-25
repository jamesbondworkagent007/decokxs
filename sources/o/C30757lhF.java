package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lhF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30757lhF extends android.widget.LinearLayout {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public ActionBar KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30757lhF(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActionBar gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback$OKDex_dex_impl(ActionBar actionBar) {
        this.KWHzl = actionBar;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:51) call: o.lhF.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C30757lhF(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30757lhF(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX INFO: renamed from: o.lhF$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lhF.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void valueOf() {
        EZpvd();
        OLrzqt();
        KWHzl();
        copydefault();
        AEQbTJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(AdvancedQuoteUiData advancedQuoteUiData, DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z) {
        boolean z2;
        java.lang.String strZLjUOn;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl2;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl3;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAubY;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl4;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl5;
        java.lang.String strZLjUOn2;
        if (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl5 = advancedQuoteUiData.KWHzl()) == null || (strZLjUOn2 = advancedQuoteAndCallDataKWHzl5.zLjUOn()) == null) {
            z2 = false;
        } else {
            z2 = true;
            if (!C33129mqd.OLrzqt((java.lang.Object) strZLjUOn2, (java.lang.Object) 0)) {
            }
        }
        DeFiPlatformForSwap deFiPlatformForSwapEZpvd = null;
        if (!z2) {
            strZLjUOn = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl4 = advancedQuoteUiData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl4.zLjUOn();
            if (strZLjUOn == null) {
                strZLjUOn = "";
            }
        }
        java.lang.String tokenSymbol = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl3 = advancedQuoteUiData.KWHzl()) == null || (dexMultiTokenInfoBeanAubY = advancedQuoteAndCallDataKWHzl3.AubY()) == null) ? null : dexMultiTokenInfoBeanAubY.getTokenSymbol();
        java.lang.String tokenSymbol2 = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getTokenSymbol() : null;
        if (tokenSymbol2 == null) {
            tokenSymbol2 = "";
        }
        if (tokenSymbol == null || tokenSymbol.length() == 0) {
            tokenSymbol = tokenSymbol2;
        }
        copydefault(strZLjUOn, tokenSymbol);
        AEQbTJ(z2 ? "" : (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl.AxsJAY(), EZpvd(advancedQuoteUiData));
        android.view.View viewAYXKKw = AYXKKw();
        Intrinsics.checkNotNullExpressionValue(viewAYXKKw, "");
        viewAYXKKw.setVisibility(z ^ true ? 0 : 8);
        android.view.View viewAkhnZx = AkhnZx();
        Intrinsics.checkNotNullExpressionValue(viewAkhnZx, "");
        viewAkhnZx.setVisibility(z ? 0 : 8);
        if (advancedQuoteUiData != null && (advancedQuoteAndCallDataKWHzl2 = advancedQuoteUiData.KWHzl()) != null) {
            deFiPlatformForSwapEZpvd = advancedQuoteAndCallDataKWHzl2.EZpvd();
        }
        EZpvd(deFiPlatformForSwapEZpvd);
    }

    public final void copydefault(@NotNull java.lang.String str, DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0 || dexMultiTokenInfoBean == null) {
            str2 = "--";
        } else if (C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
            str2 = "0 " + C30565ldZ.getFmtSymbol$default(dexMultiTokenInfoBean.getTokenSymbol(), 0, 1, null);
        } else {
            str2 = C23322hvz.toLocalizedNumber$default(str, false, (RoundingMode) null, false, false, 15, (java.lang.Object) null) + " " + C30565ldZ.getFmtSymbol$default(dexMultiTokenInfoBean.getTokenSymbol(), 0, 1, null);
        }
        java.lang.String str3 = str2;
        android.view.View viewDjBIcL = djBIcL();
        Intrinsics.checkNotNullExpressionValue(viewDjBIcL, "");
        C30759lhH c30759lhHCopydefault = copydefault(viewDjBIcL);
        c30759lhHCopydefault.OLrzqt().setText(str3);
        C30565ldZ.setTextWithAutoSize$default(c30759lhHCopydefault.OLrzqt(), str3, 8, 12, 1, 0, 16, null);
        c30759lhHCopydefault.AEQbTJ().setVisibility(z ? 0 : 8);
    }

    public final void KWHzl(@NotNull java.lang.String str, java.util.List<java.lang.String> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        android.view.View viewAkhnZx = AkhnZx();
        Intrinsics.copydefault(viewAkhnZx);
        viewAkhnZx.setVisibility(z ? 0 : 8);
        android.view.View viewAYXKKw = AYXKKw();
        Intrinsics.checkNotNullExpressionValue(viewAYXKKw, "");
        viewAYXKKw.setVisibility(z ^ true ? 0 : 8);
        C30565ldZ.setTextWithAutoSize$default(copydefault(viewAkhnZx).OLrzqt(), C24695iig.copydefault(str, list, true), 8, 12, 1, 0, 16, null);
    }

    public final void copydefault(@NotNull AdvancedOrderType advancedOrderType) {
        Intrinsics.checkNotNullParameter(advancedOrderType, "");
        android.view.View viewAYXKKw = AYXKKw();
        Intrinsics.checkNotNullExpressionValue(viewAYXKKw, "");
        viewAYXKKw.setVisibility(advancedOrderType == AdvancedOrderType.MARKET ? 0 : 8);
        android.view.View viewAkhnZx = AkhnZx();
        Intrinsics.checkNotNullExpressionValue(viewAkhnZx, "");
        AdvancedOrderType advancedOrderType2 = AdvancedOrderType.LIMIT;
        viewAkhnZx.setVisibility(advancedOrderType == advancedOrderType2 ? 0 : 8);
        android.view.View viewAhwBna = AhwBna();
        Intrinsics.checkNotNullExpressionValue(viewAhwBna, "");
        C30759lhH c30759lhHCopydefault = copydefault(viewAhwBna);
        c30759lhHCopydefault.EZpvd().setHelperLabelType(advancedOrderType == advancedOrderType2 ? 1 : 2);
        C55258xgZ c55258xgZEZpvd = c30759lhHCopydefault.EZpvd();
        c55258xgZEZpvd.setOnClickListener(new Dialog(c55258xgZEZpvd, 1000L, advancedOrderType, this));
    }

    public final void copydefault(java.lang.String str, java.lang.String str2) {
        android.view.View viewAhwBna = AhwBna();
        java.lang.String str3 = "";
        Intrinsics.checkNotNullExpressionValue(viewAhwBna, "");
        C30759lhH c30759lhHCopydefault = copydefault(viewAhwBna);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str.length() == 0 ? "0" : str, false, null, false, false, false, true, null, false, false, 475, null));
        if (str2.length() != 0) {
            str3 = " " + C30565ldZ.getFmtSymbol$default(str2, 0, 1, null);
        }
        sb.append(str3);
        C30565ldZ.setTextWithAutoSize$default(c30759lhHCopydefault.OLrzqt(), sb.toString(), 8, 12, 1, 0, 16, null);
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        int iKWHzl;
        C55320xhi c55320xhiKWHzl;
        android.view.View viewValues = values();
        Intrinsics.copydefault(viewValues);
        C30759lhH c30759lhHCopydefault = copydefault(viewValues);
        if (str == null || str.length() == 0) {
            str3 = "--";
            str4 = str3;
        } else {
            str3 = "--";
            str4 = "≈" + C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, false, null, false, false, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
        }
        int i = 0;
        viewValues.setVisibility((str == null || str.length() == 0) ? 4 : 0);
        c30759lhHCopydefault.OLrzqt().setText(str4);
        c30759lhHCopydefault.KWHzl().setTextValue("(" + str2 + ")");
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) str3)) {
            return;
        }
        if (C23313hvq.EZpvd(str2, java.lang.Double.valueOf(0.001d))) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iKWHzl = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
        } else if (C23313hvq.valueOf(str2, java.lang.Double.valueOf(-0.1d))) {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iKWHzl = C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null);
        } else {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.QwvEab);
        }
        int i2 = iKWHzl;
        c30759lhHCopydefault.KWHzl().setTextValue("(" + C23311hvo.formatPercentWithSymbol$default(str2, false, 0, 0, null, null, 31, null) + ")");
        c30759lhHCopydefault.KWHzl().setTextColor(i2);
        C55312xha c55312xhaValueOf = c30759lhHCopydefault.KWHzl().valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setUnderlineColor(i2);
        }
        C55258xgZ c55258xgZKWHzl = c30759lhHCopydefault.KWHzl();
        if (C33129mqd.gEmmrt(str2, java.lang.Double.valueOf(0.001d)) && C33129mqd.AEQbTJ(str2, java.lang.Double.valueOf(-0.001d))) {
            i = 8;
        }
        c55258xgZKWHzl.setVisibility(i);
    }

    /* JADX INFO: renamed from: o.lhF$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C30757lhF OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C30757lhF c30757lhF) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c30757lhF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ActionBar actionBarGEmmrt = this.OLrzqt.gEmmrt();
                if (actionBarGEmmrt != null) {
                    ActionBar.Application.onAddBalanceClick$default(actionBarGEmmrt, false, 1, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.lhF$AssistContent */
    public static final class AssistContent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(android.view.View view, long j) {
            this.AEQbTJ = view;
            this.KWHzl = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
            }
        }
    }

    /* JADX INFO: renamed from: o.lhF$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C30757lhF KWHzl;
        public final /* synthetic */ AdvancedOrderType OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, AdvancedOrderType advancedOrderType, C30757lhF c30757lhF) {
            this.EZpvd = view;
            this.copydefault = j;
            this.OLrzqt = advancedOrderType;
            this.KWHzl = c30757lhF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.OLrzqt != AdvancedOrderType.MARKET) {
                    C30454lbU c30454lbU = new C30454lbU(C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatMediaSessionImplBaseMessageHandler), C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatOnActiveChangeListener));
                    android.content.Context context = this.KWHzl.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    C25404iwA.AEQbTJ(c30454lbU, context);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.lhF$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ C30757lhF AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C30757lhF c30757lhF) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c30757lhF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ActionBar actionBarGEmmrt = this.AEQbTJ.gEmmrt();
                if (actionBarGEmmrt != null) {
                    actionBarGEmmrt.values();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.lhF$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C30757lhF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C30757lhF c30757lhF) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c30757lhF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                ActionBar actionBarGEmmrt = this.copydefault.gEmmrt();
                if (actionBarGEmmrt != null) {
                    actionBarGEmmrt.AkhnZx();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.lhF$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C30757lhF EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C30757lhF c30757lhF) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c30757lhF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ActionBar actionBarGEmmrt = this.EZpvd.gEmmrt();
                if (actionBarGEmmrt != null) {
                    actionBarGEmmrt.fJNWhG();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.lhF$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C30757lhF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C30757lhF c30757lhF) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c30757lhF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                ActionBar actionBarGEmmrt = this.copydefault.gEmmrt();
                if (actionBarGEmmrt != null) {
                    actionBarGEmmrt.values();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.lhF$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C30757lhF KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C30757lhF c30757lhF) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.KWHzl = c30757lhF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                ActionBar actionBarGEmmrt = this.KWHzl.gEmmrt();
                if (actionBarGEmmrt != null) {
                    actionBarGEmmrt.AkhnZx();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.lhF$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C30757lhF EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C30757lhF c30757lhF) {
            this.copydefault = view;
            this.KWHzl = j;
            this.EZpvd = c30757lhF;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context context = this.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.onSetRating);
                viewOnClickListenerC54939xaY.copydefault(C23274hvD.Fragment.DfrfUJ);
                java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C23274hvD.Fragment.OcIXYQ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, string, (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.lhF$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j) {
            this.copydefault = view;
            this.KWHzl = j;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
            }
        }
    }

    public final java.lang.String EZpvd(AdvancedQuoteUiData advancedQuoteUiData) {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        java.lang.String strCopydefault = (advancedQuoteUiData == null || (advancedQuoteAndCallDataKWHzl = advancedQuoteUiData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl.copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        return strCopydefault.length() == 0 ? "--" : strCopydefault;
    }

    public final void EZpvd(DeFiPlatformForSwap deFiPlatformForSwap) {
        java.lang.String receiveAmount;
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        android.view.View viewAYXKKw = AYXKKw();
        java.lang.String name = deFiPlatformForSwap != null ? deFiPlatformForSwap.getName() : null;
        if (name != null && name.length() != 0) {
            if (deFiPlatformForSwap == null || (receiveAmount = deFiPlatformForSwap.getReceiveAmount()) == null) {
                receiveAmount = null;
            } else if (receiveAmount.length() == 0) {
                receiveAmount = "0";
            }
            if (!C33129mqd.OLrzqt((java.lang.Object) receiveAmount, (java.lang.Object) 0)) {
                Intrinsics.copydefault(viewAYXKKw);
                C30759lhH c30759lhHCopydefault = copydefault(viewAYXKKw);
                android.widget.TextView textViewOLrzqt = c30759lhHCopydefault.OLrzqt();
                java.lang.String name2 = deFiPlatformForSwap != null ? deFiPlatformForSwap.getName() : null;
                if (name2 == null) {
                    name2 = "";
                }
                textViewOLrzqt.setText(name2);
                c30759lhHCopydefault.copydefault().setVisibility(0);
                android.widget.ImageView imageViewCopydefault = c30759lhHCopydefault.copydefault();
                java.lang.String logo = deFiPlatformForSwap != null ? deFiPlatformForSwap.getLogo() : null;
                java.lang.String str = logo != null ? logo : "";
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.gasjUx);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(C25382ivf.KWHzl(C23274hvD.StateListAnimator.copydefault));
                    Unit unit = Unit.INSTANCE;
                    drawable = drawableKWHzl;
                } else {
                    drawable = null;
                }
                android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.gasjUx);
                if (drawableKWHzl2 != null) {
                    drawableKWHzl2.setTint(C25382ivf.KWHzl(C23274hvD.StateListAnimator.copydefault));
                    Unit unit2 = Unit.INSTANCE;
                    drawable2 = drawableKWHzl2;
                } else {
                    drawable2 = null;
                }
                C25386ivj.KWHzl(imageViewCopydefault, str, new C25385ivi(drawable, drawable2, 0.0f, 0, 12, null));
                c30759lhHCopydefault.AEQbTJ().setVisibility(0);
                c30759lhHCopydefault.AEQbTJ().setImageResource(C52761wXj.TaskDescription.DGUQLI);
                android.widget.TextView textViewOLrzqt2 = c30759lhHCopydefault.OLrzqt();
                textViewOLrzqt2.setOnClickListener(new PendingIntent(textViewOLrzqt2, 1000L, this));
                android.widget.ImageView imageViewAEQbTJ = c30759lhHCopydefault.AEQbTJ();
                imageViewAEQbTJ.setOnClickListener(new Fragment(imageViewAEQbTJ, 1000L, this));
                return;
            }
        }
        Intrinsics.copydefault(viewAYXKKw);
        C30759lhH c30759lhHCopydefault2 = copydefault(viewAYXKKw);
        c30759lhHCopydefault2.OLrzqt().setText("--");
        c30759lhHCopydefault2.copydefault().setVisibility(8);
        c30759lhHCopydefault2.AEQbTJ().setVisibility(8);
        android.widget.TextView textViewOLrzqt3 = c30759lhHCopydefault2.OLrzqt();
        textViewOLrzqt3.setOnClickListener(new VoiceInteractor(textViewOLrzqt3, 1000L));
        android.widget.ImageView imageViewAEQbTJ2 = c30759lhHCopydefault2.AEQbTJ();
        imageViewAEQbTJ2.setOnClickListener(new AssistContent(imageViewAEQbTJ2, 1000L));
    }

    public final void EZpvd() {
        android.view.View viewDbNXlk = DbNXlk();
        Intrinsics.copydefault(viewDbNXlk);
        C30759lhH c30759lhHCopydefault = copydefault(viewDbNXlk);
        c30759lhHCopydefault.EZpvd().setHelperLabelType(2);
        c30759lhHCopydefault.EZpvd().setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.fJk));
        c30759lhHCopydefault.OLrzqt().setText("--");
        c30759lhHCopydefault.AEQbTJ().setVisibility(0);
        c30759lhHCopydefault.AEQbTJ().setImageResource(C52761wXj.TaskDescription.fzHEvu);
        android.widget.ImageView imageViewAEQbTJ = c30759lhHCopydefault.AEQbTJ();
        imageViewAEQbTJ.setOnClickListener(new Activity(imageViewAEQbTJ, 1000L, this));
        c30759lhHCopydefault.OLrzqt().setContentDescription("web3_dex_advance_available_balance_label");
        addView(viewDbNXlk);
    }

    public final void OLrzqt() {
        android.view.View viewDbNXlk = DbNXlk();
        Intrinsics.copydefault(viewDbNXlk);
        C30759lhH c30759lhHCopydefault = copydefault(viewDbNXlk);
        c30759lhHCopydefault.EZpvd().setHelperLabelType(2);
        c30759lhHCopydefault.EZpvd().setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.DIIpTV));
        c30759lhHCopydefault.OLrzqt().setText("--");
        c30759lhHCopydefault.AEQbTJ().setVisibility(8);
        c30759lhHCopydefault.AEQbTJ().setContentDescription("web3_dex_advance_provider_row");
        c30759lhHCopydefault.OLrzqt().setContentDescription("web3_dex_advance_provider_label");
        addView(viewDbNXlk);
    }

    public final void KWHzl() {
        android.view.View viewDbNXlk = DbNXlk();
        Intrinsics.copydefault(viewDbNXlk);
        C30759lhH c30759lhHCopydefault = copydefault(viewDbNXlk);
        c30759lhHCopydefault.EZpvd().setHelperLabelType(1);
        c30759lhHCopydefault.EZpvd().setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.onSetRating));
        C55258xgZ c55258xgZEZpvd = c30759lhHCopydefault.EZpvd();
        c55258xgZEZpvd.setOnClickListener(new TaskDescription(c55258xgZEZpvd, 1000L, this));
        c30759lhHCopydefault.OLrzqt().setText("--");
        c30759lhHCopydefault.AEQbTJ().setVisibility(0);
        c30759lhHCopydefault.AEQbTJ().setImageResource(C52761wXj.TaskDescription.DGUQLI);
        android.widget.ImageView imageViewAEQbTJ = c30759lhHCopydefault.AEQbTJ();
        imageViewAEQbTJ.setOnClickListener(new StateListAnimator(imageViewAEQbTJ, 1000L, this));
        android.widget.TextView textViewOLrzqt = c30759lhHCopydefault.OLrzqt();
        textViewOLrzqt.setOnClickListener(new FragmentManager(textViewOLrzqt, 1000L, this));
        addView(viewDbNXlk);
        viewDbNXlk.setVisibility(8);
    }

    public final void copydefault() {
        android.view.View viewDbNXlk = DbNXlk();
        Intrinsics.copydefault(viewDbNXlk);
        C30759lhH c30759lhHCopydefault = copydefault(viewDbNXlk);
        c30759lhHCopydefault.EZpvd().setHelperLabelType(1);
        c30759lhHCopydefault.EZpvd().setTextValue(C33070mpX.AYXKKw(C23274hvD.Fragment.hpmliR));
        c30759lhHCopydefault.OLrzqt().setText("--");
        c30759lhHCopydefault.AEQbTJ().setVisibility(8);
        c30759lhHCopydefault.OLrzqt().setContentDescription("web3_dex_advance_est_amount_label");
        addView(viewDbNXlk);
    }

    public final void AEQbTJ() {
        android.view.View viewDbNXlk = DbNXlk();
        Intrinsics.copydefault(viewDbNXlk);
        C30759lhH c30759lhHCopydefault = copydefault(viewDbNXlk);
        c30759lhHCopydefault.EZpvd().setVisibility(8);
        c30759lhHCopydefault.OLrzqt().setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, "0", false, null, false, false, true, false, null, false, false, 495, null));
        c30759lhHCopydefault.KWHzl().setVisibility(0);
        C55258xgZ c55258xgZKWHzl = c30759lhHCopydefault.KWHzl();
        c55258xgZKWHzl.setOnClickListener(new LoaderManager(c55258xgZKWHzl, 1000L, this));
        c30759lhHCopydefault.OLrzqt().setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        c30759lhHCopydefault.AEQbTJ().setVisibility(8);
        viewDbNXlk.setVisibility(4);
        addView(viewDbNXlk);
        ViewGroup.LayoutParams layoutParams = viewDbNXlk.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.topMargin = 0;
            viewDbNXlk.setLayoutParams(layoutParams2);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    private final android.view.View DbNXlk() {
        return android.view.LayoutInflater.from(getContext()).inflate(C23274hvD.Activity.gZKUVK, (android.view.ViewGroup) this, false);
    }

    public final C30759lhH copydefault(android.view.View view) {
        android.view.View viewFindViewById = view.findViewById(C23274hvD.Application.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi26);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "");
        C55258xgZ c55258xgZ = (C55258xgZ) viewFindViewById;
        android.view.View viewFindViewById2 = view.findViewById(C23274hvD.Application.getMediaUri);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "");
        android.widget.TextView textView = (android.widget.TextView) viewFindViewById2;
        android.view.View viewFindViewById3 = view.findViewById(C23274hvD.Application.setSubscription);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "");
        C55258xgZ c55258xgZ2 = (C55258xgZ) viewFindViewById3;
        android.view.View viewFindViewById4 = view.findViewById(C23274hvD.Application.SaJVGb);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "");
        android.widget.ImageView imageView = (android.widget.ImageView) viewFindViewById4;
        android.view.View viewFindViewById5 = view.findViewById(C23274hvD.Application.OFQuKP);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "");
        return new C30759lhH(c55258xgZ, textView, c55258xgZ2, imageView, (android.widget.ImageView) viewFindViewById5);
    }

    private final android.view.View djBIcL() {
        return getChildAt(0);
    }

    private final android.view.View AYXKKw() {
        return getChildAt(1);
    }

    private final android.view.View AkhnZx() {
        return getChildAt(2);
    }

    private final android.view.View AhwBna() {
        return getChildAt(3);
    }

    private final android.view.View values() {
        return getChildAt(4);
    }

    /* JADX INFO: renamed from: o.lhF$ActionBar */
    public interface ActionBar {
        void AkhnZx();

        void KWHzl(boolean z);

        void fJNWhG();

        void values();

        /* JADX INFO: renamed from: o.lhF$ActionBar$Application */
        public static final class Application {
            public static /* synthetic */ void onAddBalanceClick$default(ActionBar actionBar, boolean z, int i, java.lang.Object obj) {
                if (obj != null) {
                    throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onAddBalanceClick");
                }
                if ((i & 1) != 0) {
                    z = false;
                }
                actionBar.KWHzl(z);
            }
        }
    }
}
