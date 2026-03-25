package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.SolanaSignType;
import com.okinc.business.dex.trade.core.domain.model.ApproveUnsignedData;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6CalldataResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.MevConfig;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kRr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28175kRr extends kRB {
    public final gYX AEQbTJ;
    public final C23212htv EZpvd;
    public final C28180kRw KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final C19700gMb copydefault;
    public final C28196kSl gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kRB
    public C19700gMb AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kRB
    public C28196kSl EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kRB
    public gYX KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kRB
    public CoroutineDispatcher OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.kRB
    public C28180kRw copydefault() {
        return this.KWHzl;
    }

    @yCM
    public C28175kRr(@NotNull C23212htv c23212htv, @NotNull C28196kSl c28196kSl, @NotNull gYX gyx, @NotNull C28180kRw c28180kRw, @NotNull C19700gMb c19700gMb, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(gyx, "");
        Intrinsics.checkNotNullParameter(c28180kRw, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c23212htv;
        this.gEmmrt = c28196kSl;
        this.AEQbTJ = gyx;
        this.KWHzl = c28180kRw;
        this.copydefault = c19700gMb;
        this.OLrzqt = coroutineDispatcher;
    }

    @Override // o.kRB
    public java.lang.Object OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull V6CalldataResponseData v6CalldataResponseData, @NotNull ApproveUnsignedData approveUnsignedData, boolean z, @NotNull FragmentActivity fragmentActivity, boolean z2, @NotNull Continuation<? super Result<java.lang.String>> continuation) {
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(C56391yDq.EZpvd(new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null)));
    }

    @Override // o.kRB
    public AbstractC58185ywX<kotlin.Pair<InterfaceC9734bbF, V6BaseQuoteResponse>> KWHzl(@NotNull final V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull V6CalldataResponseData v6CalldataResponseData, boolean z, Function1<? super NewCallbackBean, ? extends AbstractC58185ywX<ResponseData<java.lang.String>>> function1) {
        DexMultiTokenInfoBean fromToken;
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        Intrinsics.checkNotNullParameter(v6CalldataResponseData, "");
        SolanaSignType solanaSignType = z ? SolanaSignType.FAST : SolanaSignType.NORMAL;
        java.lang.String strCopydefault = EZpvd().copydefault();
        CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
        java.lang.String chainId = (commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getChainId();
        java.lang.String str = chainId == null ? "" : chainId;
        java.lang.String unsignedTx = v6CalldataResponseData.getUnsignedTx();
        AbstractC58260yxt<kotlin.Pair<InterfaceC9734bbF, java.lang.String>> abstractC58260yxtOLrzqt = EZpvd().OLrzqt(new DappInteractionArgs(strCopydefault, null, str, null, unsignedTx == null ? "" : unsignedTx, null, "dex", 3, null, null, null, null, false, false, null, true, null, null, null, null, null, null, null, null, null, null, 1, null, null, solanaSignType, null, null, -604012758, null), function1);
        final Function1 function12 = new Function1() { // from class: o.kRs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28175kRr.EZpvd(v6BaseQuoteResponse, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX<kotlin.Pair<InterfaceC9734bbF, V6BaseQuoteResponse>> abstractC58185ywXEZpvd = abstractC58260yxtOLrzqt.copydefault(new InterfaceC58229yxO() { // from class: o.kRp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C28175kRr.EZpvd(function12, obj);
            }
        }).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public static final kotlin.Pair EZpvd(V6BaseQuoteResponse v6BaseQuoteResponse, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        return C56390yDp.OLrzqt(pair.getFirst(), v6BaseQuoteResponse);
    }

    public static final kotlin.Pair EZpvd(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (kotlin.Pair) function1.invoke(obj);
    }

    @Override // o.kRB
    public java.util.List<java.lang.String> OLrzqt(@NotNull NewCallbackBean newCallbackBean, @NotNull V6CalldataResponseData v6CalldataResponseData) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        Intrinsics.checkNotNullParameter(v6CalldataResponseData, "");
        MevConfig mevConfig = v6CalldataResponseData.getMevConfig();
        if (mevConfig != null) {
            return mevConfig.getMevSuppliers();
        }
        return null;
    }
}
