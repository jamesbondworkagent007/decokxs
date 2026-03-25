package o;

import com.okinc.business.market.features.watch_list_groups.domain.SortWatchlistGroupsUseCase$invoke$1;
import com.okinc.business.market.features.watch_list_groups.domain.SortWatchlistGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kCq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27768kCq {
    public final kKG AEQbTJ;
    public final CoroutineDispatcher KWHzl;
    public final InterfaceC27771kCt OLrzqt;

    @yCM
    public C27768kCq(@NotNull InterfaceC27771kCt interfaceC27771kCt, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27771kCt, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC27771kCt;
        this.AEQbTJ = kkg;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super Result<Unit>> continuation) {
        SortWatchlistGroupsUseCase$invoke$1 sortWatchlistGroupsUseCase$invoke$1;
        if (continuation instanceof SortWatchlistGroupsUseCase$invoke$1) {
            sortWatchlistGroupsUseCase$invoke$1 = (SortWatchlistGroupsUseCase$invoke$1) continuation;
            int i = sortWatchlistGroupsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sortWatchlistGroupsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                sortWatchlistGroupsUseCase$invoke$1 = new SortWatchlistGroupsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = sortWatchlistGroupsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = sortWatchlistGroupsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            SortWatchlistGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1 sortWatchlistGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1 = new SortWatchlistGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1(null, this, list);
            sortWatchlistGroupsUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, sortWatchlistGroupsUseCase$invokegIAlus$$inlined$dexRunCatching$1, sortWatchlistGroupsUseCase$invoke$1);
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
