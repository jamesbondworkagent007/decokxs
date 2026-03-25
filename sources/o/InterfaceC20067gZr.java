package o;

import com.okinc.business.dex.trade.order.domain.model.OrderSide;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;

/* JADX INFO: renamed from: o.gZr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20067gZr {
    boolean getCanResume();

    java.lang.String getChainId();

    java.lang.String getChainLogo();

    java.lang.String getChainName();

    java.lang.String getCreateTime();

    boolean getFromIsCurrency();

    java.lang.String getFromTokenAddress();

    java.lang.String getFromTokenAmount();

    java.lang.String getFromTokenLogo();

    java.lang.String getFromTokenSymbol();

    java.lang.String getOrderId();

    OrderSide getOrderSide();

    OrderSubStatus getOrderStatus();

    int getStrategyMode();

    boolean getToIsCurrency();

    java.lang.String getToTokenAddress();

    java.lang.String getToTokenAmount();

    java.lang.String getToTokenCurrencyAmount();

    java.lang.String getToTokenLogo();

    java.lang.String getToTokenSymbol();
}
