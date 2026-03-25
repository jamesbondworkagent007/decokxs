package o;

import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.wallet.api.WalletDexService;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22799hmF extends AbstractC22802hmI {
    public final AbstractC23101hrq KWHzl;

    public C22799hmF(@NotNull AbstractC23101hrq abstractC23101hrq) {
        Intrinsics.checkNotNullParameter(abstractC23101hrq, "");
        this.KWHzl = abstractC23101hrq;
    }

    @Override // o.AbstractC22802hmI
    public C22803hmJ EZpvd(@NotNull android.content.Context context) {
        java.lang.String countDownText$default;
        Intrinsics.checkNotNullParameter(context, "");
        QuotePriceRes quotePriceResAxsJAYsNCnLh = this.KWHzl.AxsJAYsNCnLh();
        java.lang.String showDataWithPrefix$default = "--";
        if (quotePriceResAxsJAYsNCnLh == null) {
            return new C22803hmJ(false, "--", "--", "--" + context.getString(C23274hvD.Fragment.gdLjtZ), 1, null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) quotePriceResAxsJAYsNCnLh.estimatedTime())) {
            countDownText$default = C23311hvo.setCountDownText$default(C33129mqd.AhwBna(quotePriceResAxsJAYsNCnLh.estimatedTime()), false, 2, null);
        } else {
            countDownText$default = "--" + context.getString(C23274hvD.Fragment.gdLjtZ);
        }
        java.lang.String str = countDownText$default;
        WalletDexService.FeeInfo value = this.KWHzl.RlQdEF().getBtcFreeGasLiveData().getValue();
        java.lang.String feeValue = value != null ? value.getFeeValue() : null;
        java.lang.String str2 = feeValue == null ? "" : feeValue;
        java.lang.String feeSymbol = value != null ? value.getFeeSymbol() : null;
        java.lang.String showDataWithSymbol$default = str2.length() == 0 ? "--" : C23271hvA.getShowDataWithSymbol$default(C23271hvA.copydefault, str2, feeSymbol == null ? "" : feeSymbol, false, RoundingMode.DOWN, false, false, 52, null);
        java.lang.String feeCurrencyValue = value != null ? value.getFeeCurrencyValue() : null;
        if (feeCurrencyValue != null && feeCurrencyValue.length() != 0) {
            showDataWithPrefix$default = C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, feeCurrencyValue, false, false, RoundingMode.DOWN, false, 20, null);
        }
        return new C22803hmJ(false, showDataWithSymbol$default, showDataWithPrefix$default, str, 1, null);
    }
}
