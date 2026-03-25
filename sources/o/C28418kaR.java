package o;

import com.okinc.business.market.features.home_favorite_list.domain.SortFavoriteTokensUseCase$invoke$1;
import com.okinc.business.market.features.home_favorite_list.domain.SortFavoriteTokensUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kaR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28418kaR {
    public final kKG KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final InterfaceC27771kCt copydefault;

    @yCM
    public C28418kaR(@NotNull InterfaceC27771kCt interfaceC27771kCt, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27771kCt, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC27771kCt;
        this.KWHzl = kkg;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(int i, @NotNull java.util.List<C28422kaV> list, @NotNull Continuation<? super Result<java.lang.Integer>> continuation) {
        SortFavoriteTokensUseCase$invoke$1 sortFavoriteTokensUseCase$invoke$1;
        if (continuation instanceof SortFavoriteTokensUseCase$invoke$1) {
            sortFavoriteTokensUseCase$invoke$1 = (SortFavoriteTokensUseCase$invoke$1) continuation;
            int i2 = sortFavoriteTokensUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sortFavoriteTokensUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                sortFavoriteTokensUseCase$invoke$1 = new SortFavoriteTokensUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = sortFavoriteTokensUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = sortFavoriteTokensUseCase$invoke$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            SortFavoriteTokensUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 sortFavoriteTokensUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 = new SortFavoriteTokensUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(null, this, i, list);
            sortFavoriteTokensUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, sortFavoriteTokensUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1, sortFavoriteTokensUseCase$invoke$1);
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
}
