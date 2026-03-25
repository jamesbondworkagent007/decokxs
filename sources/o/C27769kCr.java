package o;

import com.okinc.business.market.features.watch_list_groups.domain.RenameWatchlistGroupUseCase$invoke$1;
import com.okinc.business.market.features.watch_list_groups.domain.RenameWatchlistGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kCr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27769kCr {
    public final C27766kCo AEQbTJ;
    public final kKG EZpvd;
    public final InterfaceC27771kCt KWHzl;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C27769kCr(@NotNull InterfaceC27771kCt interfaceC27771kCt, @NotNull kKG kkg, @NotNull C27766kCo c27766kCo, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27771kCt, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c27766kCo, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = interfaceC27771kCt;
        this.EZpvd = kkg;
        this.AEQbTJ = c27766kCo;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(int i, @NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends InterfaceC26243jXf>> continuation) {
        RenameWatchlistGroupUseCase$invoke$1 renameWatchlistGroupUseCase$invoke$1;
        if (continuation instanceof RenameWatchlistGroupUseCase$invoke$1) {
            renameWatchlistGroupUseCase$invoke$1 = (RenameWatchlistGroupUseCase$invoke$1) continuation;
            int i2 = renameWatchlistGroupUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                renameWatchlistGroupUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                renameWatchlistGroupUseCase$invoke$1 = new RenameWatchlistGroupUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = renameWatchlistGroupUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = renameWatchlistGroupUseCase$invoke$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            RenameWatchlistGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 renameWatchlistGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1 = new RenameWatchlistGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1(null, this, i, str);
            renameWatchlistGroupUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, renameWatchlistGroupUseCase$invoke0E7RQCE$$inlined$dexRunCatching$1, renameWatchlistGroupUseCase$invoke$1);
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
