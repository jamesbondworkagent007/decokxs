package o;

import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.SolanaSignType;
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

/* JADX INFO: renamed from: o.kXf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28325kXf extends AbstractC28328kXi {
    public final gYX AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final C28327kXh KWHzl;
    public final C19700gMb OLrzqt;
    public final C23212htv copydefault;
    public final kKG valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public kKG AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public gYX EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public C19700gMb KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28328kXi
    public C28327kXh copydefault() {
        return this.KWHzl;
    }

    @yCM
    public C28325kXf(@NotNull C23212htv c23212htv, @NotNull kKG kkg, @NotNull gYX gyx, @NotNull C28327kXh c28327kXh, @NotNull C19700gMb c19700gMb, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(gyx, "");
        Intrinsics.checkNotNullParameter(c28327kXh, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = c23212htv;
        this.valueOf = kkg;
        this.AEQbTJ = gyx;
        this.KWHzl = c28327kXh;
        this.OLrzqt = c19700gMb;
        this.EZpvd = coroutineDispatcher;
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
        SolanaSignType solanaSignType = z ? SolanaSignType.FAST : SolanaSignType.NORMAL;
        java.lang.String strOLrzqt = AhwBna().OLrzqt();
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String chainId = (commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getChainId();
        java.lang.String str2 = chainId == null ? "" : chainId;
        java.lang.String unsignedTx = v6CalldataResponseData != null ? v6CalldataResponseData.getUnsignedTx() : null;
        DappInteractionArgs dappInteractionArgs = new DappInteractionArgs(strOLrzqt, null, str2, null, unsignedTx == null ? "" : unsignedTx, null, "dex", 3, null, null, null, null, false, false, null, true, null, null, null, null, null, null, null, null, null, null, 1, null, null, solanaSignType, null, null, -604012758, null);
        dappInteractionArgs.setMemeOptimization(true);
        AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> abstractC58260yxtAEQbTJ = AhwBna().AEQbTJ(dappInteractionArgs, function1);
        final Function1 function12 = new Function1() { // from class: o.kXd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28325kXf.AEQbTJ(v6BaseQuoteResponse, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<InterfaceC9734bbF, V6BaseQuoteResponse>> abstractC58185ywXEZpvd = abstractC58260yxtAEQbTJ.copydefault(new InterfaceC58229yxO() { // from class: o.kXc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C28325kXf.copydefault(function12, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair AEQbTJ(V6BaseQuoteResponse v6BaseQuoteResponse, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return C56390yDp.OLrzqt(pair.getFirst(), v6BaseQuoteResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Pair copydefault(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }
}
