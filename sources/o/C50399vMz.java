package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentActivity;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.DcdBotQuotesDetail;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.bot.dcd.config.DcdTpMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vMz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50399vMz extends LinearLayoutCompat {
    public DcdTpMode AEQbTJ;
    public final AbstractC50895vcl EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public Function1<? super DcdTpMode, Unit> copydefault;

    /* JADX INFO: renamed from: o.vMz$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DcdTpMode.values().length];
            try {
                iArr[DcdTpMode.BUY_PRICE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DcdTpMode.CUSTOM_PRICE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DcdTpMode.DECIMAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTpModeChange(Function1<? super DcdTpMode, Unit> function1) {
        this.copydefault = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50399vMz(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC50895vcl abstractC50895vclOLrzqt = AbstractC50895vcl.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC50895vclOLrzqt, "");
        this.EZpvd = abstractC50895vclOLrzqt;
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.vMy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50399vMz.KWHzl(context);
            }
        });
        this.AEQbTJ = DcdTpMode.BUY_PRICE;
        setOrientation(1);
    }

    private final androidx.fragment.app.FragmentManager EZpvd() {
        return (androidx.fragment.app.FragmentManager) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.fragment.app.FragmentManager KWHzl(android.content.Context context) {
        Intrinsics.copydefault(context, "");
        return ((FragmentActivity) context).getSupportFragmentManager();
    }

    public final void EZpvd(boolean z) {
        java.lang.Object next;
        java.util.List<TradeMenuItemBean> listOLrzqt = OLrzqt(z);
        C53530wnI c53530wnI = this.EZpvd.EZpvd;
        c53530wnI.setTypeMenu(listOLrzqt, EZpvd(), new Function1() { // from class: o.vMA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50399vMz.AEQbTJ(this.OLrzqt, (TradeMenuItemBean) obj);
            }
        });
        java.util.Iterator<T> it = listOLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((TradeMenuItemBean) next).isSelect()) {
                    break;
                }
            }
        }
        c53530wnI.AEQbTJ((TradeMenuItemBean) next);
        c53530wnI.setTitleAppearance(C32113mPz.Dialog.AYXKKw);
        c53530wnI.setContentHeight(C55298xhM.dpInt$default(48.0f, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    public static final Unit AEQbTJ(C50399vMz c50399vMz, TradeMenuItemBean tradeMenuItemBean) {
        Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
        java.lang.Object data = tradeMenuItemBean.getData();
        Intrinsics.copydefault(data, "");
        DcdTpMode dcdTpMode = (DcdTpMode) data;
        c50399vMz.copydefault(dcdTpMode);
        Function1<? super DcdTpMode, Unit> function1 = c50399vMz.copydefault;
        if (function1 != null) {
            function1.invoke(dcdTpMode);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(DcdTpMode dcdTpMode) {
        this.AEQbTJ = dcdTpMode;
        this.EZpvd.EZpvd.setTypeText(C33070mpX.AYXKKw(dcdTpMode.getDesc()), true);
        C47988uAv c47988uAv = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c47988uAv.setVisibility(dcdTpMode == DcdTpMode.CUSTOM_PRICE ? 0 : 8);
        C50387vMn c50387vMn = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c50387vMn, "");
        c50387vMn.setVisibility(dcdTpMode == DcdTpMode.DECIMAL ? 0 : 8);
    }

    public final void EZpvd(@NotNull DcdBotQuotesDetail dcdBotQuotesDetail) {
        Intrinsics.checkNotNullParameter(dcdBotQuotesDetail, "");
        AEQbTJ(dcdBotQuotesDetail);
        KWHzl();
        copydefault(dcdBotQuotesDetail.getCurrency());
    }

    public final void AEQbTJ(final DcdBotQuotesDetail dcdBotQuotesDetail) {
        final C47988uAv c47988uAv = this.EZpvd.AEQbTJ;
        c47988uAv.setInputUnit(dcdBotQuotesDetail.getAlternativeCurrency());
        c47988uAv.setMaxDecimal(C33129mqd.AhwBna(dcdBotQuotesDetail.getCurrencyScale()));
        xMR xmr = xMR.copydefault;
        java.lang.String strike = dcdBotQuotesDetail.getStrike();
        if (strike == null) {
            strike = "";
        }
        C47988uAv.setInputLabel$default(c47988uAv, "> " + xmr.AhwBna(strike, C33129mqd.AhwBna(dcdBotQuotesDetail.getCurrencyScale())), null, 2, null);
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.vME
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50399vMz.AEQbTJ(dcdBotQuotesDetail, c47988uAv, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    public static final Unit AEQbTJ(DcdBotQuotesDetail dcdBotQuotesDetail, C47988uAv c47988uAv, C47988uAv c47988uAv2, java.lang.String str) {
        java.lang.String strCopydefault;
        strCopydefault = "";
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        if (C33129mqd.valueOf(str, dcdBotQuotesDetail.getStrike())) {
            int i = C48033uCm.Fragment.RXzakW;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            xMR xmr = xMR.copydefault;
            java.lang.String strike = dcdBotQuotesDetail.getStrike();
            if (strike == null) {
                strike = "";
            }
            pairArr[0] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xmr.copydefault(strike));
            java.lang.String alternativeCurrency = dcdBotQuotesDetail.getAlternativeCurrency();
            pairArr[1] = C56390yDp.OLrzqt("unit", alternativeCurrency != null ? alternativeCurrency : "");
            strCopydefault = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
        }
        if (strCopydefault.length() > 0) {
            c47988uAv.setInputErrorMsg(strCopydefault);
        } else {
            c47988uAv.copydefault();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        C50387vMn c50387vMn = this.EZpvd.OLrzqt;
        c50387vMn.setRecommendValue("0.05", "0.1", "0.3");
        c50387vMn.setPercentDigit(1);
        c50387vMn.setPxChangeListener(new Function2() { // from class: o.vMx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50399vMz.OLrzqt((C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c50387vMn.KWHzl().AkhnZx())) {
            return;
        }
        c50387vMn.copydefault();
    }

    public static final Unit OLrzqt(C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        return Unit.INSTANCE;
    }

    public final java.util.Map<DcdTpMode, java.lang.String> OLrzqt() {
        java.lang.String strAkhnZx;
        DcdTpMode dcdTpMode = this.AEQbTJ;
        int i = Activity.KWHzl[dcdTpMode.ordinal()];
        if (i == 1) {
            strAkhnZx = "";
        } else if (i == 2) {
            strAkhnZx = this.EZpvd.AEQbTJ.AkhnZx();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            strAkhnZx = xMR.formatHundredQuot$default(xMR.copydefault, this.EZpvd.OLrzqt.AEQbTJ(), 0, false, null, 14, null);
        }
        return C56423yEv.EZpvd(C56390yDp.OLrzqt(dcdTpMode, strAkhnZx));
    }

    public final boolean copydefault() {
        int i = Activity.KWHzl[this.AEQbTJ.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return this.EZpvd.AEQbTJ.hDKMBd();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C33129mqd.AEQbTJ(this.EZpvd.OLrzqt.AEQbTJ(), 0);
    }

    public final void copydefault(java.lang.String str) {
        C55258xgZ c55258xgZ = this.EZpvd.KWHzl;
        c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this, str));
    }

    public final java.util.List<TradeMenuItemBean> OLrzqt(boolean z) {
        java.util.List<DcdTpMode> listEZpvd = DcdTpMode.Companion.EZpvd(z);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listEZpvd, 10));
        for (DcdTpMode dcdTpMode : listEZpvd) {
            arrayList.add(new TradeMenuItemBean(C33070mpX.AYXKKw(dcdTpMode.getDesc()), dcdTpMode == this.AEQbTJ, dcdTpMode, null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.vMz$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C50399vMz EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C50399vMz c50399vMz, java.lang.String str) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.EZpvd = c50399vMz;
            this.KWHzl = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context context = this.EZpvd.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.UscePu));
                int i = C48033uCm.Fragment.Ufzxmz;
                java.lang.String str = this.KWHzl;
                viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, str != null ? str : ""))));
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C33070mpX.AYXKKw(C55688xof.Application.onCreate), (View.OnClickListener) null, 2, (java.lang.Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
    }
}
