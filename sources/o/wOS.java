package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.tradingbot.impl.dto.InterestInfoResponse;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C38307pTy;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class wOS extends AbstractC59533zio<InterestInfoResponse, Application> {
    /* JADX DEBUG: Method merged with bridge method: onCreateViewHolder(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder; */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public Application onCreateViewHolder(@NotNull android.view.LayoutInflater layoutInflater, @NotNull android.view.ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        Intrinsics.checkNotNullParameter(viewGroup, "");
        uMM ummKWHzl = uMM.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(ummKWHzl, "");
        return new Application(this, ummKWHzl);
    }

    /* JADX DEBUG: Method merged with bridge method: onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;Ljava/lang/Object;)V */
    @Override // o.AbstractC59533zio
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NotNull Application application, @NotNull InterestInfoResponse interestInfoResponse) {
        TradeCoinInfo tradeCoinInfoAhwBna;
        java.lang.String sizeDig;
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(interestInfoResponse, "");
        uMM ummOLrzqt = application.OLrzqt();
        ummOLrzqt.AEQbTJ.setText(KWHzl(interestInfoResponse.copydefault()));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        int iAhwBna = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(interestInfoResponse.AEQbTJ())) == null || (sizeDig = tradeCoinInfoAhwBna.getSizeDig()) == null) ? 2 : C33129mqd.AhwBna(sizeDig);
        ummOLrzqt.OLrzqt.setText(copydefault(interestInfoResponse.EZpvd(), interestInfoResponse, iAhwBna, true));
        ummOLrzqt.KWHzl.setText(onBindViewHolder$lambda$0$formatInterest$default(interestInfoResponse.KWHzl(), interestInfoResponse, iAhwBna, false, 4, null));
        ummOLrzqt.djBIcL.setText(onBindViewHolder$lambda$0$formatInterest$default(interestInfoResponse.gEmmrt(), interestInfoResponse, iAhwBna, false, 4, null));
        ummOLrzqt.copydefault.setText(xMR.formatPercent$default(xMR.copydefault, interestInfoResponse.OLrzqt(), 0, null, 6, null));
        ummOLrzqt.gEmmrt.setText(copydefault(interestInfoResponse.AhwBna(), interestInfoResponse, iAhwBna, true));
    }

    public static /* synthetic */ java.lang.String onBindViewHolder$lambda$0$formatInterest$default(java.lang.String str, InterestInfoResponse interestInfoResponse, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return copydefault(str, interestInfoResponse, i, z);
    }

    public static final java.lang.String copydefault(java.lang.String str, InterestInfoResponse interestInfoResponse, int i, boolean z) {
        BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(str);
        java.lang.String strAEQbTJ = interestInfoResponse.AEQbTJ();
        RoundingMode roundingMode = RoundingMode.DOWN;
        C38307pTy.Application application = C38307pTy.Companion;
        if (z) {
            i = 8;
        }
        return C38305pTw.formatCryptoCode$default(bigDecimalEZpvd, strAEQbTJ, roundingMode, application.AEQbTJ(i), null, null, null, 56, null);
    }

    public final android.text.SpannableStringBuilder KWHzl(long j) {
        java.lang.String str = pTA.format$default(new Date(j), OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM, null, null, false, 28, null);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(C33069mpW.copydefault(C48033uCm.Fragment.glVQsU, C56423yEv.EZpvd(C56390yDp.OLrzqt("deductTime", str))));
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) spannableStringBuilder, str, 0, false, 6, (java.lang.Object) null);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), iIndexOf$default, str.length() + iIndexOf$default, 0);
        return spannableStringBuilder;
    }

    public final class Application extends RecyclerView.ViewHolder {
        public final /* synthetic */ wOS AEQbTJ;
        public final uMM KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final uMM OLrzqt() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull wOS wos, uMM umm) {
            super(umm.getRoot());
            Intrinsics.checkNotNullParameter(umm, "");
            this.AEQbTJ = wos;
            this.KWHzl = umm;
        }
    }
}
