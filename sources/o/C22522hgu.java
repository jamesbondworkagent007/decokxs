package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMemeExchangeDirection;
import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailResult;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.TxDirection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hgu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C22522hgu {

    /* JADX INFO: renamed from: o.hgu$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[LimitMemeExchangeDirection.values().length];
            try {
                iArr[LimitMemeExchangeDirection.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[LimitMemeExchangeDirection.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    public static final AdvancedModeParams EZpvd(@NotNull OrderDetailResult orderDetailResult) {
        TxDirection txDirection;
        Intrinsics.checkNotNullParameter(orderDetailResult, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBean = new DexMultiTokenInfoBean((java.lang.String) null, orderDetailResult.getFromToken().getChainId(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, orderDetailResult.getFromToken().getTokenContractAddress(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.String.valueOf(orderDetailResult.getFromToken().isNativeToken()), (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -1091, 134217727, (DefaultConstructorMarker) null);
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = new DexMultiTokenInfoBean((java.lang.String) null, orderDetailResult.getToToken().getChainId(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, orderDetailResult.getToToken().getTokenContractAddress(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.String.valueOf(orderDetailResult.getToToken().isNativeToken()), (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -1091, 134217727, (DefaultConstructorMarker) null);
        int i = StateListAnimator.KWHzl[orderDetailResult.getExchangeDirection().ordinal()];
        if (i != 1 && i == 2) {
            txDirection = TxDirection.SELL;
        } else {
            txDirection = TxDirection.BUY;
        }
        return new AdvancedModeParams(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, txDirection, Intrinsics.EZpvd((java.lang.Object) orderDetailResult.getStatus(), (java.lang.Object) java.lang.String.valueOf(OrderSubStatus.Failed.getStatus())) ? orderDetailResult.getFromToken().getTokenAmount() : "", AdvancedOrderType.LIMIT, null, 32, null);
    }

    public static final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return OrderSubStatus.Companion.KWHzl(C33129mqd.AhwBna(str)).isTerminalState();
    }
}
