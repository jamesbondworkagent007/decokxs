package o;

import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.ReserveBean;
import com.okinc.business.invest_biz.data.bean.InvestCallDataResult;
import com.okinc.business.invest_biz.data.bean.InvestDetail;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC27342jtQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iCF {
    public static final InterfaceC27342jtQ copydefault(@NotNull final InvestDetail investDetail, @NotNull Function2<? super java.lang.String, ? super java.lang.String, java.lang.String> function2, @NotNull Function2<? super java.lang.Long, ? super java.lang.String, Unit> function22, @NotNull final yHS<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, ? super java.lang.Boolean, ? super java.lang.String, Unit> yhs) {
        Intrinsics.checkNotNullParameter(investDetail, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        Intrinsics.checkNotNullParameter(yhs, "");
        java.lang.Long investmentId = investDetail.getInvestmentId();
        return new InterfaceC27342jtQ.StateListAnimator(investmentId != null ? investmentId.longValue() : 0L, investDetail.getActivityImageUrlNew(), investDetail.getActivityName(), investDetail.getActivityTextKey(), investDetail.getActivityButtonKey(), investDetail.getActivityNameNew(), new Function0() { // from class: o.iCC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return iCF.copydefault(yhs, investDetail);
            }
        });
    }

    public static final Unit copydefault(yHS yhs, InvestDetail investDetail) {
        yhs.invoke(investDetail.getActivityUrl(), investDetail.getActivityDeeplinkUrl(), investDetail.getActivityLuaDeeplinkUrl(), investDetail.getUseLuaFlag(), investDetail.getActivityName());
        return Unit.INSTANCE;
    }

    public static final boolean EZpvd(@NotNull NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        if (newCallbackBean.getReserved() != null) {
            ReserveBean reserved = newCallbackBean.getReserved();
            Intrinsics.copydefault(reserved);
            if (reserved.getReservedAmount().length() > 0) {
                ReserveBean reserved2 = newCallbackBean.getReserved();
                Intrinsics.copydefault(reserved2);
                if (reserved2.getPrecision() >= 0) {
                    ReserveBean reserved3 = newCallbackBean.getReserved();
                    Intrinsics.copydefault(reserved3);
                    if (reserved3.isNativeToken()) {
                        ReserveBean reserved4 = newCallbackBean.getReserved();
                        Intrinsics.copydefault(reserved4);
                        if (reserved4.getTokenContractAddress().length() != 0) {
                        }
                        return true;
                    }
                    ReserveBean reserved5 = newCallbackBean.getReserved();
                    Intrinsics.copydefault(reserved5);
                    if (!reserved5.isNativeToken()) {
                        ReserveBean reserved6 = newCallbackBean.getReserved();
                        Intrinsics.copydefault(reserved6);
                        if (reserved6.getTokenContractAddress().length() > 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final NewCallbackBean copydefault(int i, @NotNull InvestCallDataResult investCallDataResult) {
        Intrinsics.checkNotNullParameter(investCallDataResult, "");
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("serviceCharge", investCallDataResult.copydefault());
        jsonObject.addProperty("signedTx", investCallDataResult.AYXKKw());
        jsonObject.addProperty("fromAdr", investCallDataResult.KWHzl());
        jsonObject.addProperty("toAdr", investCallDataResult.djBIcL());
        jsonObject.addProperty("txType", java.lang.Integer.valueOf(i));
        jsonObject.addProperty("coinAmount", "0");
        jsonObject.addProperty("extJson", investCallDataResult.OLrzqt());
        java.util.Map mapKWHzl = C56424yEw.KWHzl();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add("walletTxData", jsonObject);
        return new NewCallbackBean(mapKWHzl, jsonObject2, false, null, false, null, null, null, null, null, null, 2044, null);
    }

    public static final NewCallbackBean EZpvd(int i, @NotNull InvestCallDataResult investCallDataResult) {
        Intrinsics.checkNotNullParameter(investCallDataResult, "");
        InterfaceC9739bbK interfaceC9739bbKAhwBna = ((InterfaceC23916iOb) C43251rlk.copydefault(InterfaceC23916iOb.class)).AhwBna();
        java.lang.String strOLrzqt = interfaceC9739bbKAhwBna.OLrzqt(investCallDataResult.AYXKKw());
        java.lang.String strOLrzqt2 = interfaceC9739bbKAhwBna.OLrzqt(strOLrzqt, 0L);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("serviceCharge", investCallDataResult.copydefault());
        jsonObject.addProperty("signedTx", strOLrzqt);
        jsonObject.addProperty("txHash", strOLrzqt2);
        jsonObject.addProperty("fromAdr", investCallDataResult.KWHzl());
        jsonObject.addProperty("toAdr", investCallDataResult.djBIcL());
        jsonObject.addProperty("txType", java.lang.Integer.valueOf(i));
        jsonObject.addProperty("coinAmount", "0");
        jsonObject.addProperty("extJson", investCallDataResult.OLrzqt());
        java.util.Map mapKWHzl = C56424yEw.KWHzl();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.add("walletTxData", jsonObject);
        return new NewCallbackBean(mapKWHzl, jsonObject2, false, null, false, null, null, null, null, null, null, 2044, null);
    }
}
