package o;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hoC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC22902hoC {
    java.lang.String EZpvd();

    java.lang.String KWHzl();

    TradeInputGroup OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2);

    TradeInputGroup copydefault(@NotNull QuotePriceRes quotePriceRes, @NotNull java.lang.String str);

    TradeInputGroup copydefault(@NotNull java.lang.String str, boolean z);

    boolean copydefault();

    TradeInputGroup djBIcL();

    boolean valueOf();
}
