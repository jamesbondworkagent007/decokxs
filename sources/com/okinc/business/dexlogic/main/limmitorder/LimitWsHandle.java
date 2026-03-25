package com.okinc.business.dexlogic.main.limmitorder;

import androidx.lifecycle.MutableLiveData;
import com.okinc.business.dexlogic.main.limmitorder.LimitWsHandle;
import com.okinc.business.dexlogic.main.limmitorder.bean.FromChildOrderDetailVO;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitState;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23168htD;
import o.C23243huZ;
import o.C23264huu;
import o.C23271hvA;
import o.C23274hvD;
import o.C32979mnm;
import o.C33050mpD;
import o.C33069mpW;
import o.C56390yDp;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitWsHandle {
    public static final int $stable = 8;
    private C23168htD dexWsClient;
    private final MutableLiveData<LimitState> innerLimitState;
    private Object mainWallet;
    private final String sourceType;
    private C23264huu typeThreePushStrategy;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<LimitState> getInnerLimitState() {
        return this.innerLimitState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceType() {
        return this.sourceType;
    }

    public LimitWsHandle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sourceType = str;
        this.mainWallet = new Object();
        this.typeThreePushStrategy = new C23264huu();
        this.innerLimitState = new MutableLiveData<>();
        this.dexWsClient = new C23168htD(str, new Function1() { // from class: o.hgs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitWsHandle.dexWsClient$lambda$1(this.AEQbTJ, (java.lang.String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dexWsClient$lambda$1(final LimitWsHandle limitWsHandle, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) new JSONObject(str).optString("type"), (Object) "3")) {
            limitWsHandle.typeThreePushStrategy.copydefault(str, new Function1() { // from class: o.hgq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitWsHandle.dexWsClient$lambda$1$lambda$0(this.AEQbTJ, (LimitState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dexWsClient$lambda$1$lambda$0(LimitWsHandle limitWsHandle, LimitState limitState) {
        Intrinsics.checkNotNullParameter(limitState, "");
        limitWsHandle.innerLimitState.setValue(limitState);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [63=4] */
    public final Pair<String, String> getWsShowData(@NotNull LimitState limitState) {
        Intrinsics.checkNotNullParameter(limitState, "");
        FromChildOrderDetailVO fromChildOrderDetailVO = limitState.getFromChildOrderDetailVO();
        String fromTokenSymbol = fromChildOrderDetailVO != null ? fromChildOrderDetailVO.getFromTokenSymbol() : null;
        if (fromTokenSymbol == null) {
            fromTokenSymbol = "";
        }
        C23271hvA c23271hvA = C23271hvA.copydefault;
        FromChildOrderDetailVO fromChildOrderDetailVO2 = limitState.getFromChildOrderDetailVO();
        String fromAmount = fromChildOrderDetailVO2 != null ? fromChildOrderDetailVO2.getFromAmount() : null;
        String tokenCode$default = C23271hvA.formatTokenCode$default(c23271hvA, fromAmount == null ? "" : fromAmount, true, null, false, null, null, 30, null);
        FromChildOrderDetailVO fromChildOrderDetailVO3 = limitState.getFromChildOrderDetailVO();
        String toTokenSymbol = fromChildOrderDetailVO3 != null ? fromChildOrderDetailVO3.getToTokenSymbol() : null;
        String str = toTokenSymbol == null ? "" : toTokenSymbol;
        FromChildOrderDetailVO fromChildOrderDetailVO4 = limitState.getFromChildOrderDetailVO();
        String toAmount = fromChildOrderDetailVO4 != null ? fromChildOrderDetailVO4.getToAmount() : null;
        Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("sellValue", tokenCode$default), C56390yDp.OLrzqt("sellToken", fromTokenSymbol), C56390yDp.OLrzqt("receiveValue", C23271hvA.formatTokenCode$default(c23271hvA, toAmount == null ? "" : toAmount, true, null, false, null, null, 30, null)), C56390yDp.OLrzqt("receiveToken", str), C56390yDp.OLrzqt("fromToken", fromTokenSymbol), C56390yDp.OLrzqt("toToken", str));
        String status = limitState.getStatus();
        int iHashCode = status.hashCode();
        if (iHashCode != 1629) {
            if (iHashCode != 1660) {
                if (iHashCode != 1691) {
                    if (iHashCode == 1722 && status.equals("60")) {
                        C23243huZ.OLrzqt(DexTrackEventParameter.TxStatus.FAILURE.getStatus());
                        return C56390yDp.OLrzqt(limitState.getExploreUrl(), C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.setExtraBinder, (Map<String, ? extends Object>) mapGEmmrt));
                    }
                } else if (status.equals("50")) {
                    C23243huZ.OLrzqt(DexTrackEventParameter.TxStatus.SUCCESS.getStatus());
                    return C56390yDp.OLrzqt(limitState.getExploreUrl(), C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.toBundle, (Map<String, ? extends Object>) mapGEmmrt));
                }
            } else if (status.equals("40")) {
                return C56390yDp.OLrzqt("", C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.UUsvzUhTFPAC, (Map<String, ? extends Object>) mapGEmmrt));
            }
        } else if (status.equals("30")) {
            return C56390yDp.OLrzqt("", C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.DLl, (Map<String, ? extends Object>) mapGEmmrt));
        }
        return C56390yDp.OLrzqt("", "");
    }

    public final void unSubWs() {
        this.dexWsClient.copydefault();
    }

    public final void subWs() {
        this.dexWsClient.OLrzqt();
    }

    public final void releaseChangeWallet() {
        unSubWs();
        C33050mpD.OLrzqt(this.mainWallet);
    }
}
