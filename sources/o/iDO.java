package o;

import com.okinc.business.invest_biz.data.bean.response.BonusPopupDetailsResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iDO {
    public final android.content.Context AEQbTJ;

    @yCM
    public iDO(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context;
    }

    public static final java.lang.String EZpvd(BonusPopupDetailsResponse bonusPopupDetailsResponse) {
        Intrinsics.checkNotNullParameter(bonusPopupDetailsResponse, "");
        return bonusPopupDetailsResponse.getCurrencyAmount();
    }

    public final kotlin.Pair<java.lang.String, java.util.List<C27294jsV>> OLrzqt(@NotNull java.util.List<BonusPopupDetailsResponse> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String strEZpvd = C27488jwD.copydefault.EZpvd(C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, C27491jwG.AEQbTJ(list, new Function1() { // from class: o.iDS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iDO.EZpvd((BonusPopupDetailsResponse) obj);
            }
        }), null, null, null, 14, null));
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (BonusPopupDetailsResponse bonusPopupDetailsResponse : list) {
            arrayList.add(new C27294jsV(C56402yEa.EZpvd(bonusPopupDetailsResponse.getTokenLogo()), bonusPopupDetailsResponse.getTokenSymbol(), bonusPopupDetailsResponse.getCoinAmount(), bonusPopupDetailsResponse.getCurrencyAmount(), false, null, null, null, null, null, 224, null));
        }
        return new kotlin.Pair<>(strEZpvd, arrayList);
    }
}
