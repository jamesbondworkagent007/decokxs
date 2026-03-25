package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.Glide;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.DcdBotQuotesDetail;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.wJM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vMu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50394vMu extends ConstraintLayout {
    public final AbstractC50890vcg KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50394vMu(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        AbstractC50890vcg abstractC50890vcgOLrzqt = AbstractC50890vcg.OLrzqt(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(abstractC50890vcgOLrzqt, "");
        this.KWHzl = abstractC50890vcgOLrzqt;
        LinearLayoutCompat linearLayoutCompat = abstractC50890vcgOLrzqt.KWHzl;
        linearLayoutCompat.setOnClickListener(new TaskDescription(linearLayoutCompat, 1000L, context));
    }

    public final java.lang.String OLrzqt() {
        return this.KWHzl.AYXKKw.getText().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull DcdBotQuotesDetail dcdBotQuotesDetail) {
        java.lang.String strValueOf;
        java.lang.String strValueOf2;
        Intrinsics.checkNotNullParameter(dcdBotQuotesDetail, "");
        int i = C48033uCm.Fragment.TarCU;
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        java.lang.String currency = dcdBotQuotesDetail.getCurrency();
        if (currency == null) {
            currency = "";
        }
        pairArr[0] = C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, currency);
        xMR xmr = xMR.copydefault;
        java.lang.String strike = dcdBotQuotesDetail.getStrike();
        if (strike == null) {
            strike = "";
        }
        pairArr[1] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xmr.copydefault(strike));
        java.lang.String alternativeCurrency = dcdBotQuotesDetail.getAlternativeCurrency();
        if (alternativeCurrency == null) {
            alternativeCurrency = "";
        }
        pairArr[2] = C56390yDp.OLrzqt("unit", alternativeCurrency);
        java.lang.String strCopydefault = C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr));
        AbstractC50890vcg abstractC50890vcg = this.KWHzl;
        abstractC50890vcg.AYXKKw.setText(strCopydefault);
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(getContext());
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ, "");
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            strValueOf = "";
        } else {
            java.lang.String currency2 = dcdBotQuotesDetail.getCurrency();
            if (currency2 == null) {
                currency2 = "";
            }
            strValueOf = interfaceC54581xNrOLrzqt.valueOf(currency2);
            if (strValueOf == null) {
            }
        }
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ, strValueOf, "lfit", 40, 40).EZpvd((android.widget.ImageView) abstractC50890vcg.valueOf);
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ2 = Glide.AEQbTJ(getContext());
        Intrinsics.checkNotNullExpressionValue(componentCallbacks2C5333NrAEQbTJ2, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null) {
            strValueOf2 = "";
        } else {
            java.lang.String alternativeCurrency2 = dcdBotQuotesDetail.getAlternativeCurrency();
            if (alternativeCurrency2 == null) {
                alternativeCurrency2 = "";
            }
            strValueOf2 = interfaceC54581xNrOLrzqt2.valueOf(alternativeCurrency2);
            if (strValueOf2 == null) {
            }
        }
        C55297xhL.AEQbTJ(componentCallbacks2C5333NrAEQbTJ2, strValueOf2, "lfit", 24, 24).EZpvd((android.widget.ImageView) abstractC50890vcg.gEmmrt);
        AppCompatTextView appCompatTextView = abstractC50890vcg.AEQbTJ;
        java.lang.String annualYieldPercentage = dcdBotQuotesDetail.getAnnualYieldPercentage();
        appCompatTextView.setText(xMR.formatPercentWithSymbol$default(xmr, annualYieldPercentage == null ? "" : annualYieldPercentage, 0, 0, null, 14, null));
        AppCompatTextView appCompatTextView2 = abstractC50890vcg.AEQbTJ;
        java.lang.String annualYieldPercentage2 = dcdBotQuotesDetail.getAnnualYieldPercentage();
        appCompatTextView2.setTextColor(C56033xvF.OLrzqt((java.lang.Object) (annualYieldPercentage2 != null ? annualYieldPercentage2 : "")));
        abstractC50890vcg.AhwBna.setText(pTA.format$default(new Date(C33129mqd.valueOf(dcdBotQuotesDetail.getSettlementTime())), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null));
        abstractC50890vcg.OLrzqt.setText(C55861xrt.OLrzqt.EZpvd(dcdBotQuotesDetail.getTerm()));
    }

    /* JADX INFO: renamed from: o.vMu$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.content.Context OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, android.content.Context context) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.OLrzqt = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            androidx.fragment.app.FragmentManager supportFragmentManager;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                wJM.StateListAnimator stateListAnimator = wJM.Companion;
                android.content.Context context = this.OLrzqt;
                FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
                if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
                    return;
                }
                stateListAnimator.KWHzl(supportFragmentManager, C51468vnb.AkhnZx());
            }
        }
    }
}
