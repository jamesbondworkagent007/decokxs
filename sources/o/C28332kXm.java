package o;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonElement;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.OfflineQuote;
import com.okinc.business.trade.features.home.meme.usecase.transaction.v6.pmm.MemeV6MarketSolPMMTxUseCase$submitPMMOrder$1;
import com.okinc.business.trade.features.home.meme.usecase.transaction.v6.pmm.MemeV6MarketSolPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C23274hvD;
import o.InterfaceC9740bbL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kXm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28332kXm extends AbstractC28329kXj {
    public final C28327kXh AEQbTJ;
    public final kKG EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final kVE OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC28329kXj
    public kVE AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public C28332kXm(@NotNull kVE kve, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C28327kXh c28327kXh) {
        Intrinsics.checkNotNullParameter(kve, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c28327kXh, "");
        this.OLrzqt = kve;
        this.EZpvd = kkg;
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = c28327kXh;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.AbstractC28329kXj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.String str, int i, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        MemeV6MarketSolPMMTxUseCase$submitPMMOrder$1 memeV6MarketSolPMMTxUseCase$submitPMMOrder$1;
        if (continuation instanceof MemeV6MarketSolPMMTxUseCase$submitPMMOrder$1) {
            memeV6MarketSolPMMTxUseCase$submitPMMOrder$1 = (MemeV6MarketSolPMMTxUseCase$submitPMMOrder$1) continuation;
            int i2 = memeV6MarketSolPMMTxUseCase$submitPMMOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                memeV6MarketSolPMMTxUseCase$submitPMMOrder$1.label = i2 - Integer.MIN_VALUE;
            } else {
                memeV6MarketSolPMMTxUseCase$submitPMMOrder$1 = new MemeV6MarketSolPMMTxUseCase$submitPMMOrder$1(this, continuation);
            }
        }
        MemeV6MarketSolPMMTxUseCase$submitPMMOrder$1 memeV6MarketSolPMMTxUseCase$submitPMMOrder$12 = memeV6MarketSolPMMTxUseCase$submitPMMOrder$1;
        java.lang.Object objWithContext = memeV6MarketSolPMMTxUseCase$submitPMMOrder$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = memeV6MarketSolPMMTxUseCase$submitPMMOrder$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            MemeV6MarketSolPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1 memeV6MarketSolPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1 = new MemeV6MarketSolPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1(null, v6BaseQuoteResponse, str, this, i, fragmentActivity, z, taskDescription);
            memeV6MarketSolPMMTxUseCase$submitPMMOrder$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, memeV6MarketSolPMMTxUseCase$submitPMMOrderbMdYcbs$$inlined$dexRunCatching$1, memeV6MarketSolPMMTxUseCase$submitPMMOrder$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<java.lang.String>>> AEQbTJ(final V6BaseQuoteResponse v6BaseQuoteResponse, final java.lang.String str, final int i) {
        return new Function1() { // from class: o.kXp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28332kXm.KWHzl(this.KWHzl, v6BaseQuoteResponse, str, i, (NewCallbackBean) obj);
            }
        };
    }

    public static final AbstractC58185ywX KWHzl(C28332kXm c28332kXm, V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.String str, int i, NewCallbackBean newCallbackBean) {
        OfflineQuote calldata;
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        JsonElement jsonElement = newCallbackBean.getBody().get("signedTx");
        java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
        if (asString == null || asString.length() == 0) {
            AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null));
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        java.lang.String quote = (selectedDeFiPlatform == null || (calldata = selectedDeFiPlatform.getCalldata()) == null) ? null : calldata.getQuote();
        java.lang.String str2 = quote == null ? "" : quote;
        DefiPlatformInfo selectedDeFiPlatform2 = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        return c28332kXm.EZpvd(asString, str2, str, selectedDeFiPlatform2 != null ? selectedDeFiPlatform2.getDefiPlatformId() : null, i);
    }
}
