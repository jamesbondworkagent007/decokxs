package o;

import com.okinc.business.market.features.home_favorite_list.domain.UpdatePinWatchlistUseCase$pinWatchlistItem$1;
import com.okinc.business.market.features.home_favorite_list.domain.UpdatePinWatchlistUseCase$pinWatchlistItemBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.home_favorite_list.domain.UpdatePinWatchlistUseCase$removeWatchlist$1;
import com.okinc.business.market.features.home_favorite_list.domain.UpdatePinWatchlistUseCase$removeWatchlistgIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kaP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28416kaP {
    public final kKG AEQbTJ;
    public final C28586kda EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C28424kaX copydefault;

    @yCM
    public C28416kaP(@NotNull kKG kkg, @NotNull C28424kaX c28424kaX, @NotNull C28586kda c28586kda, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28424kaX, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = kkg;
        this.copydefault = c28424kaX;
        this.EZpvd = c28586kda;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        UpdatePinWatchlistUseCase$pinWatchlistItem$1 updatePinWatchlistUseCase$pinWatchlistItem$1;
        if (continuation instanceof UpdatePinWatchlistUseCase$pinWatchlistItem$1) {
            updatePinWatchlistUseCase$pinWatchlistItem$1 = (UpdatePinWatchlistUseCase$pinWatchlistItem$1) continuation;
            int i2 = updatePinWatchlistUseCase$pinWatchlistItem$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updatePinWatchlistUseCase$pinWatchlistItem$1.label = i2 - Integer.MIN_VALUE;
            } else {
                updatePinWatchlistUseCase$pinWatchlistItem$1 = new UpdatePinWatchlistUseCase$pinWatchlistItem$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = updatePinWatchlistUseCase$pinWatchlistItem$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = updatePinWatchlistUseCase$pinWatchlistItem$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            UpdatePinWatchlistUseCase$pinWatchlistItemBWLJW6A$$inlined$dexRunCatching$1 updatePinWatchlistUseCase$pinWatchlistItemBWLJW6A$$inlined$dexRunCatching$1 = new UpdatePinWatchlistUseCase$pinWatchlistItemBWLJW6A$$inlined$dexRunCatching$1(null, this, str, str2, i);
            updatePinWatchlistUseCase$pinWatchlistItem$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, updatePinWatchlistUseCase$pinWatchlistItemBWLJW6A$$inlined$dexRunCatching$1, updatePinWatchlistUseCase$pinWatchlistItem$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.util.List<C28422kaV> list, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) throws java.lang.Throwable {
        UpdatePinWatchlistUseCase$removeWatchlist$1 updatePinWatchlistUseCase$removeWatchlist$1;
        if (continuation instanceof UpdatePinWatchlistUseCase$removeWatchlist$1) {
            updatePinWatchlistUseCase$removeWatchlist$1 = (UpdatePinWatchlistUseCase$removeWatchlist$1) continuation;
            int i = updatePinWatchlistUseCase$removeWatchlist$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updatePinWatchlistUseCase$removeWatchlist$1.label = i - Integer.MIN_VALUE;
            } else {
                updatePinWatchlistUseCase$removeWatchlist$1 = new UpdatePinWatchlistUseCase$removeWatchlist$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = updatePinWatchlistUseCase$removeWatchlist$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updatePinWatchlistUseCase$removeWatchlist$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            UpdatePinWatchlistUseCase$removeWatchlistgIAlus$$inlined$dexRunCatching$1 updatePinWatchlistUseCase$removeWatchlistgIAlus$$inlined$dexRunCatching$1 = new UpdatePinWatchlistUseCase$removeWatchlistgIAlus$$inlined$dexRunCatching$1(null, this, list);
            updatePinWatchlistUseCase$removeWatchlist$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, updatePinWatchlistUseCase$removeWatchlistgIAlus$$inlined$dexRunCatching$1, updatePinWatchlistUseCase$removeWatchlist$1);
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
