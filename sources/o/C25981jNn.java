package o;

import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.features.chain_list.domain.GetFavoriteChainListUseCase$getFavoriteChainList$1;
import com.okinc.business.market.features.chain_list.domain.GetFavoriteChainListUseCase$getFavoriteChainListIoAF18A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jNn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25981jNn {
    public final CoroutineDispatcher EZpvd;
    public final C25983jNp KWHzl;

    @yCM
    public C25981jNn(@NotNull C25983jNp c25983jNp, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c25983jNp, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = c25983jNp;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Result<? extends java.util.List<MarketChainBean>>> continuation) throws java.lang.Throwable {
        GetFavoriteChainListUseCase$getFavoriteChainList$1 getFavoriteChainListUseCase$getFavoriteChainList$1;
        if (continuation instanceof GetFavoriteChainListUseCase$getFavoriteChainList$1) {
            getFavoriteChainListUseCase$getFavoriteChainList$1 = (GetFavoriteChainListUseCase$getFavoriteChainList$1) continuation;
            int i = getFavoriteChainListUseCase$getFavoriteChainList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getFavoriteChainListUseCase$getFavoriteChainList$1.label = i - Integer.MIN_VALUE;
            } else {
                getFavoriteChainListUseCase$getFavoriteChainList$1 = new GetFavoriteChainListUseCase$getFavoriteChainList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getFavoriteChainListUseCase$getFavoriteChainList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getFavoriteChainListUseCase$getFavoriteChainList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            GetFavoriteChainListUseCase$getFavoriteChainListIoAF18A$$inlined$dexRunCatching$1 getFavoriteChainListUseCase$getFavoriteChainListIoAF18A$$inlined$dexRunCatching$1 = new GetFavoriteChainListUseCase$getFavoriteChainListIoAF18A$$inlined$dexRunCatching$1(null, this);
            getFavoriteChainListUseCase$getFavoriteChainList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getFavoriteChainListUseCase$getFavoriteChainListIoAF18A$$inlined$dexRunCatching$1, getFavoriteChainListUseCase$getFavoriteChainList$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }
}
