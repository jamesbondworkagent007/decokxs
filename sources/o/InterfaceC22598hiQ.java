package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dex.trade.order.domain.model.HistoryOrderType;
import com.okinc.business.dexlogic.bean.AddressType;
import com.okinc.business.dexlogic.bean.BlackListTypes;
import com.okinc.business.dexlogic.bean.DexMultiTokenDetailReq;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.LiquidityListItem;
import com.okinc.business.dexlogic.bean.OrderDetailBean;
import com.okinc.business.dexlogic.bean.QuotePriceReq;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.SelfSwapStatus;
import com.okinc.business.dexlogic.bean.TokenCheckInfo;
import com.okinc.business.dexlogic.net.DexSourceResp;
import com.okinc.business.dexui.main.market.MarketParams;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hiQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC22598hiQ extends InterfaceC22387heR {
    AbstractC58185ywX<DexSourceResp<QuotePriceRes>> AEQbTJ(@NotNull QuotePriceReq quotePriceReq, @NotNull Function1<? super java.lang.Boolean, Unit> function1);

    void AEQbTJ(MarketParams marketParams);

    StateFlow<MarketParams> AYXKKw();

    AbstractC58185ywX<java.util.List<DexMultiTokenInfoBean>> EZpvd(@NotNull DexMultiTokenDetailReq dexMultiTokenDetailReq);

    AbstractC58185ywX<java.util.List<LiquidityListItem>> EZpvd(@NotNull java.lang.String str);

    AbstractC58185ywX<QuotePriceRes> KWHzl(@NotNull QuotePriceReq quotePriceReq);

    AbstractC58185ywX<ResponseData<OrderDetailBean>> OLrzqt(@NotNull java.lang.String str, @NotNull HistoryOrderType historyOrderType);

    AbstractC58185ywX<BlackListTypes> OLrzqt(@NotNull java.lang.String str, java.lang.String str2);

    boolean OLrzqt(@NotNull java.lang.String str);

    AbstractC58185ywX<SelfSwapStatus> copydefault(@NotNull java.lang.String str);

    AbstractC58185ywX<AddressType> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2);

    AbstractC58185ywX<TokenCheckInfo> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6);

    AbstractC58185ywX<DexMultiTokenInfoBean> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull InterfaceC23194htd interfaceC23194htd, java.lang.Integer num);

    MutableLiveData<java.lang.Boolean> djBIcL();

    InterfaceC22646hjL gEmmrt();

    MutableLiveData<TradeParam> valueOf();
}
