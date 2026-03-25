package o;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iCK {
    public static final iCK AEQbTJ = new iCK();

    private iCK() {
    }

    public final void KWHzl(JsonObject jsonObject, InvestTxModel investTxModel, int i) {
        jsonObject.addProperty("accountId", investTxModel.getWalletId());
        jsonObject.addProperty("totalValue", investTxModel.getTotalValue());
        JsonPrimitive asJsonPrimitive = jsonObject.getAsJsonPrimitive("uopHash");
        if (asJsonPrimitive != null) {
            jsonObject.addProperty("uopHash", asJsonPrimitive.getAsString());
            jsonObject.remove("txHash");
        }
        jsonObject.addProperty("orderType", java.lang.Integer.valueOf(investTxModel.getOrderType()));
        C33489mxS c33489mxS = C33489mxS.KWHzl;
        java.lang.String contextJson = investTxModel.getContextJson();
        InvestTransactionParam.Companion companion = InvestTransactionParam.Companion;
        jsonObject.addProperty("contextJson", c33489mxS.KWHzl(companion.serializer(), InvestTransactionParam.copy$default((InvestTransactionParam) c33489mxS.OLrzqt((DeserializationStrategy) companion.serializer(), contextJson), null, false, false, 0L, null, null, null, null, null, java.lang.Integer.valueOf(i), null, null, null, null, null, null, 65023, null)));
        jsonObject.addProperty(WiseOpenHianalyticsData.UNION_COSTTIME, java.lang.Integer.valueOf(i));
    }

    public final void EZpvd(JsonObject jsonObject, InvestTxModel investTxModel) {
        java.lang.Long stakeId = investTxModel.getStakeId();
        if (stakeId != null) {
            stakeId.longValue();
            jsonObject.addProperty("stakeId", investTxModel.getStakeId());
        }
    }

    public final void KWHzl(JsonObject jsonObject, InvestTxModel investTxModel) {
        java.util.List<InvestTokenWithAmount> userInputList;
        Gson gson = new Gson();
        InvestTradeManager investTradeManager = InvestTradeManager.OLrzqt;
        if (investTradeManager.copydefault(investTxModel.getOrderType())) {
            userInputList = investTxModel.getExpectOutputList();
        } else {
            userInputList = investTxModel.getUserInputList();
        }
        jsonObject.add("tokenInfo", gson.toJsonTree(investTradeManager.OLrzqt(userInputList)));
        if (investTradeManager.copydefault(investTxModel.getOrderType()) || !(!investTxModel.getExpectTokenList().isEmpty())) {
            return;
        }
        jsonObject.add("expectTokenInfo", new Gson().toJsonTree(investTradeManager.OLrzqt(investTxModel.getExpectTokenList())));
    }

    public final void AEQbTJ(JsonObject jsonObject, NewCallbackBean newCallbackBean) {
        NewCallbackBean.DexCallbackBean dexCallbackBean = newCallbackBean.getDexCallbackBean();
        jsonObject.add("mevSuppliers", new Gson().toJsonTree(dexCallbackBean != null ? dexCallbackBean.getMevSuppliers() : null));
    }

    public final void OLrzqt(JsonObject jsonObject, InvestTxModel investTxModel) {
        jsonObject.addProperty("chainId", java.lang.Long.valueOf(investTxModel.getChainId()));
        if (investTxModel.isAvailableClaim()) {
            jsonObject.addProperty("analysisPlatformId", investTxModel.getAnalysisPlatformId());
        } else {
            jsonObject.addProperty("investmentId", (java.lang.Number) CollectionsKt___CollectionsKt.firstOrNull(investTxModel.getInvestmentId()));
        }
    }

    public final void copydefault(JsonObject jsonObject, InvestTxModel investTxModel) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) investTxModel.getProviderPubkey())) {
            jsonObject.addProperty("providerPubkey", investTxModel.getProviderPubkey());
            JsonObject asJsonObject = JsonParser.parseString(jsonObject.get("extJson").getAsString()).getAsJsonObject();
            asJsonObject.addProperty("providerPubkey", investTxModel.getProviderPubkey());
            jsonObject.remove("extJson");
            jsonObject.addProperty("extJson", asJsonObject.toString());
        }
    }

    public final JsonObject OLrzqt(@NotNull NewCallbackBean newCallbackBean, @NotNull InvestTxModel investTxModel) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        Intrinsics.checkNotNullParameter(investTxModel, "");
        JsonObject asJsonObject = newCallbackBean.getBody().getAsJsonObject("walletTxData");
        iCK ick = AEQbTJ;
        Intrinsics.copydefault(asJsonObject);
        ick.KWHzl(asJsonObject, investTxModel, C33129mqd.AhwBna(newCallbackBean.getEstTime()));
        ick.KWHzl(asJsonObject, investTxModel);
        ick.AEQbTJ(asJsonObject, newCallbackBean);
        ick.OLrzqt(asJsonObject, investTxModel);
        ick.copydefault(asJsonObject, investTxModel);
        ick.EZpvd(asJsonObject, investTxModel);
        Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
        return asJsonObject;
    }
}
