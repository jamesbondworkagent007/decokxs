package o;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.JsonElement;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.OfflineQuote;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketSolPMMTxV6UseCase$submitPMMOrder$1;
import com.okinc.business.trade.features.home.advanced.usecase.AdvancedMarketSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1;
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

/* JADX INFO: renamed from: o.kRx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28181kRx extends AbstractC28177kRt {
    public final CoroutineDispatcher KWHzl;
    public final C28196kSl OLrzqt;
    public final C28180kRw copydefault;

    @yCM
    public C28181kRx(@NotNull C28196kSl c28196kSl, @NotNull C28180kRw c28180kRw, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c28196kSl, "");
        Intrinsics.checkNotNullParameter(c28180kRw, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = c28196kSl;
        this.copydefault = c28180kRw;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.AbstractC28177kRt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, int i, @NotNull FragmentActivity fragmentActivity, boolean z, @NotNull InterfaceC9740bbL.TaskDescription taskDescription, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        AdvancedMarketSolPMMTxV6UseCase$submitPMMOrder$1 advancedMarketSolPMMTxV6UseCase$submitPMMOrder$1;
        if (continuation instanceof AdvancedMarketSolPMMTxV6UseCase$submitPMMOrder$1) {
            advancedMarketSolPMMTxV6UseCase$submitPMMOrder$1 = (AdvancedMarketSolPMMTxV6UseCase$submitPMMOrder$1) continuation;
            int i2 = advancedMarketSolPMMTxV6UseCase$submitPMMOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                advancedMarketSolPMMTxV6UseCase$submitPMMOrder$1.label = i2 - Integer.MIN_VALUE;
            } else {
                advancedMarketSolPMMTxV6UseCase$submitPMMOrder$1 = new AdvancedMarketSolPMMTxV6UseCase$submitPMMOrder$1(this, continuation);
            }
        }
        AdvancedMarketSolPMMTxV6UseCase$submitPMMOrder$1 advancedMarketSolPMMTxV6UseCase$submitPMMOrder$12 = advancedMarketSolPMMTxV6UseCase$submitPMMOrder$1;
        java.lang.Object objWithContext = advancedMarketSolPMMTxV6UseCase$submitPMMOrder$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = advancedMarketSolPMMTxV6UseCase$submitPMMOrder$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            AdvancedMarketSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1 advancedMarketSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1 = new AdvancedMarketSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1(null, v6BaseQuoteResponse, this, i, fragmentActivity, z, taskDescription);
            advancedMarketSolPMMTxV6UseCase$submitPMMOrder$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, advancedMarketSolPMMTxV6UseCase$submitPMMOrderhUnOzRk$$inlined$dexRunCatching$1, advancedMarketSolPMMTxV6UseCase$submitPMMOrder$12);
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

    public final Function1<NewCallbackBean, AbstractC58185ywX<ResponseData<java.lang.String>>> copydefault(final V6BaseQuoteResponse v6BaseQuoteResponse, final java.lang.String str, final int i) {
        return new Function1() { // from class: o.kRu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28181kRx.EZpvd(this.EZpvd, v6BaseQuoteResponse, str, i, (NewCallbackBean) obj);
            }
        };
    }

    public static final AbstractC58185ywX EZpvd(C28181kRx c28181kRx, V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.String str, int i, NewCallbackBean newCallbackBean) {
        OfflineQuote calldata;
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        JsonElement jsonElement = newCallbackBean.getBody().get("signedTx");
        java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
        if (asString == null || asString.length() == 0) {
            AbstractC58185ywX abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ((java.lang.Throwable) new OKServerException(0, C33070mpX.AYXKKw(C23274hvD.Fragment.getStarRating), null, null, 13, null));
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        C28180kRw c28180kRw = c28181kRx.copydefault;
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        java.lang.String quote = (selectedDeFiPlatform == null || (calldata = selectedDeFiPlatform.getCalldata()) == null) ? null : calldata.getQuote();
        java.lang.String str2 = quote == null ? "" : quote;
        DefiPlatformInfo selectedDeFiPlatform2 = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        return c28180kRw.AEQbTJ(asString, str2, str, selectedDeFiPlatform2 != null ? selectedDeFiPlatform2.getDefiPlatformId() : null, i);
    }
}
