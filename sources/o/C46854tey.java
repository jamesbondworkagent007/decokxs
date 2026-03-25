package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okmarket.ui.market.remind.data.model.TokenPriceResponse;
import com.okinc.okmarket.ui.market.remind.domain.DexTokenPriceUseCase$onExecute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tey, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46854tey extends AbstractC49400uno<kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>, TokenPriceResponse> {
    public final C46855tez AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C46854tey(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C46855tez c46855tez) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c46855tez, "");
        this.EZpvd = coroutineDispatcher;
        this.AEQbTJ = c46855tez;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<java.lang.String, java.lang.String> pair, @NotNull Continuation<? super TokenPriceResponse> continuation) throws java.lang.Throwable {
        DexTokenPriceUseCase$onExecute$1 dexTokenPriceUseCase$onExecute$1;
        if (continuation instanceof DexTokenPriceUseCase$onExecute$1) {
            dexTokenPriceUseCase$onExecute$1 = (DexTokenPriceUseCase$onExecute$1) continuation;
            int i = dexTokenPriceUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dexTokenPriceUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                dexTokenPriceUseCase$onExecute$1 = new DexTokenPriceUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = dexTokenPriceUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dexTokenPriceUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C46855tez c46855tez = this.AEQbTJ;
            java.lang.String first = pair.getFirst();
            java.lang.String second = pair.getSecond();
            dexTokenPriceUseCase$onExecute$1.label = 1;
            objOLrzqt = c46855tez.OLrzqt(first, second, dexTokenPriceUseCase$onExecute$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        return ((ResponseData) objOLrzqt).getData();
    }
}
