package o;

import com.okinc.business.market.features.watch_list_groups.domain.DeleteWatchlistGroupUseCase$invoke$1;
import com.okinc.business.market.features.watch_list_groups.domain.DeleteWatchlistGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kCn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27765kCn {
    public final kKG AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC27771kCt KWHzl;

    @yCM
    public C27765kCn(@NotNull InterfaceC27771kCt interfaceC27771kCt, @NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27771kCt, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC27771kCt;
        this.AEQbTJ = kkg;
        this.EZpvd = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(int i, @NotNull Continuation<? super Result<java.lang.Integer>> continuation) {
        DeleteWatchlistGroupUseCase$invoke$1 deleteWatchlistGroupUseCase$invoke$1;
        if (continuation instanceof DeleteWatchlistGroupUseCase$invoke$1) {
            deleteWatchlistGroupUseCase$invoke$1 = (DeleteWatchlistGroupUseCase$invoke$1) continuation;
            int i2 = deleteWatchlistGroupUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteWatchlistGroupUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                deleteWatchlistGroupUseCase$invoke$1 = new DeleteWatchlistGroupUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = deleteWatchlistGroupUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = deleteWatchlistGroupUseCase$invoke$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            DeleteWatchlistGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1 deleteWatchlistGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1 = new DeleteWatchlistGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1(null, this, i);
            deleteWatchlistGroupUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, deleteWatchlistGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1, deleteWatchlistGroupUseCase$invoke$1);
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
