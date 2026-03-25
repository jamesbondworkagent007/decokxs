package o;

import com.okinc.business.market.features.favorites.editing.data.po.MarketFavoritesGroupNamePayload;
import com.okinc.business.market.features.favorites.editing.domain.group.CreateNewMarketFavoritesGroupUseCase$onExecute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jSs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26121jSs extends AbstractC49400uno<java.lang.String, java.lang.String> {
    public final CoroutineDispatcher EZpvd;
    public final C26117jSo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @yCM
    public C26121jSs(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C26117jSo c26117jSo) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c26117jSo, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = c26117jSo;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        CreateNewMarketFavoritesGroupUseCase$onExecute$1 createNewMarketFavoritesGroupUseCase$onExecute$1;
        if (continuation instanceof CreateNewMarketFavoritesGroupUseCase$onExecute$1) {
            createNewMarketFavoritesGroupUseCase$onExecute$1 = (CreateNewMarketFavoritesGroupUseCase$onExecute$1) continuation;
            int i = createNewMarketFavoritesGroupUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createNewMarketFavoritesGroupUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                createNewMarketFavoritesGroupUseCase$onExecute$1 = new CreateNewMarketFavoritesGroupUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = createNewMarketFavoritesGroupUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = createNewMarketFavoritesGroupUseCase$onExecute$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str2 = (java.lang.String) createNewMarketFavoritesGroupUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
            return str2;
        }
        C56391yDq.AEQbTJ(obj);
        C26117jSo c26117jSo = this.copydefault;
        MarketFavoritesGroupNamePayload marketFavoritesGroupNamePayload = new MarketFavoritesGroupNamePayload(str);
        createNewMarketFavoritesGroupUseCase$onExecute$1.L$0 = str;
        createNewMarketFavoritesGroupUseCase$onExecute$1.label = 1;
        return c26117jSo.KWHzl(marketFavoritesGroupNamePayload, createNewMarketFavoritesGroupUseCase$onExecute$1) == objCopydefault ? objCopydefault : str;
    }
}
