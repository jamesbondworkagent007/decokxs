package o;

import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.network.okg.response.ResponseData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kWZ extends AbstractC28328kXi {
    public final CoroutineDispatcher AEQbTJ;
    public final kKG AhwBna;
    public final gYX EZpvd;
    public final C23212htv KWHzl;
    public final C28327kXh OLrzqt;
    public final C19700gMb copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public kKG AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public gYX EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public C19700gMb KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public C28327kXh copydefault() {
        return this.OLrzqt;
    }

    @yCM
    public kWZ(@NotNull C23212htv c23212htv, @NotNull kKG kkg, @NotNull gYX gyx, @NotNull C28327kXh c28327kXh, @NotNull C19700gMb c19700gMb, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(gyx, "");
        Intrinsics.checkNotNullParameter(c28327kXh, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c23212htv;
        this.AhwBna = kkg;
        this.EZpvd = gyx;
        this.OLrzqt = c28327kXh;
        this.copydefault = c19700gMb;
        this.AEQbTJ = coroutineDispatcher;
    }

    @Override // o.AbstractC28328kXi
    public java.util.List<java.lang.String> copydefault(NewCallbackBean.DexCallbackBean dexCallbackBean, MevConfig mevConfig) {
        if (mevConfig == null || !mevConfig.getEnableMev()) {
            return null;
        }
        return mevConfig.getMevSuppliers();
    }

    @Override // o.AbstractC28328kXi
    public AbstractC58185ywX<kotlin.Pair<InterfaceC9734bbF, V6BaseQuoteResponse>> copydefault(@NotNull final V6BaseQuoteResponse v6BaseQuoteResponse, V6CalldataResponseData v6CalldataResponseData, java.lang.String str, boolean z, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        DexMultiTokenInfoBean fromToken;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        java.lang.String strOLrzqt = AhwBna().OLrzqt();
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String chainId = (commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getChainId();
        java.lang.String str2 = chainId == null ? "" : chainId;
        java.lang.String unsignedTx = v6CalldataResponseData != null ? v6CalldataResponseData.getUnsignedTx() : null;
        AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> abstractC58260yxtAEQbTJ = AhwBna().AEQbTJ(new DappInteractionArgs(strOLrzqt, null, str2, null, unsignedTx == null ? "" : unsignedTx, null, "dex", 3, null, null, null, null, false, false, null, true, null, null, null, null, null, null, null, null, null, null, 1, null, null, null, null, null, -67141846, null), function1);
        final Function1 function12 = new Function1() { // from class: o.kXg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kWZ.OLrzqt(v6BaseQuoteResponse, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<InterfaceC9734bbF, V6BaseQuoteResponse>> abstractC58185ywXEZpvd = abstractC58260yxtAEQbTJ.copydefault(new InterfaceC58229yxO() { // from class: o.kXe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return kWZ.copydefault(function12, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair OLrzqt(V6BaseQuoteResponse v6BaseQuoteResponse, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return C56390yDp.OLrzqt(pair.getFirst(), v6BaseQuoteResponse);
    }

    public static final kotlin.Pair copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }
}
