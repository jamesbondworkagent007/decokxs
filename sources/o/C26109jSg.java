package o;

import com.okinc.business.market.features.favorite_list_signal.domain.FavoriteListSignalUseCase$reset$1;
import com.okinc.business.market.features.favorite_list_signal.domain.FavoriteListSignalUseCase$resetIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.favorite_list_signal.domain.FavoriteListSignalUseCase$signalFavoriteListChange$1;
import com.okinc.business.market.features.favorite_list_signal.domain.FavoriteListSignalUseCase$signalFavoriteListChangeIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.favorite_list_signal.domain.FavoriteListSignalUseCase$signalGroupListChange$1;
import com.okinc.business.market.features.favorite_list_signal.domain.FavoriteListSignalUseCase$signalGroupListChangeIoAF18A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jSg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@yCR
public final class C26109jSg {
    public final StateFlow<java.lang.Long> AEQbTJ;
    public final MutableStateFlow<java.lang.Long> EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final MutableStateFlow<java.lang.Long> OLrzqt;
    public final StateFlow<java.lang.Long> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Long> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Long> OLrzqt() {
        return this.copydefault;
    }

    @yCM
    public C26109jSg(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = coroutineDispatcher;
        MutableStateFlow<java.lang.Long> MutableStateFlow = StateFlowKt.MutableStateFlow(0L);
        this.EZpvd = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<java.lang.Long> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0L);
        this.OLrzqt = MutableStateFlow2;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        FavoriteListSignalUseCase$signalFavoriteListChange$1 favoriteListSignalUseCase$signalFavoriteListChange$1;
        if (continuation instanceof FavoriteListSignalUseCase$signalFavoriteListChange$1) {
            favoriteListSignalUseCase$signalFavoriteListChange$1 = (FavoriteListSignalUseCase$signalFavoriteListChange$1) continuation;
            int i = favoriteListSignalUseCase$signalFavoriteListChange$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                favoriteListSignalUseCase$signalFavoriteListChange$1.label = i - Integer.MIN_VALUE;
            } else {
                favoriteListSignalUseCase$signalFavoriteListChange$1 = new FavoriteListSignalUseCase$signalFavoriteListChange$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = favoriteListSignalUseCase$signalFavoriteListChange$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = favoriteListSignalUseCase$signalFavoriteListChange$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            FavoriteListSignalUseCase$signalFavoriteListChangeIoAF18A$$inlined$dexRunCatching$1 favoriteListSignalUseCase$signalFavoriteListChangeIoAF18A$$inlined$dexRunCatching$1 = new FavoriteListSignalUseCase$signalFavoriteListChangeIoAF18A$$inlined$dexRunCatching$1(null, this);
            favoriteListSignalUseCase$signalFavoriteListChange$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, favoriteListSignalUseCase$signalFavoriteListChangeIoAF18A$$inlined$dexRunCatching$1, favoriteListSignalUseCase$signalFavoriteListChange$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        FavoriteListSignalUseCase$reset$1 favoriteListSignalUseCase$reset$1;
        if (continuation instanceof FavoriteListSignalUseCase$reset$1) {
            favoriteListSignalUseCase$reset$1 = (FavoriteListSignalUseCase$reset$1) continuation;
            int i = favoriteListSignalUseCase$reset$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                favoriteListSignalUseCase$reset$1.label = i - Integer.MIN_VALUE;
            } else {
                favoriteListSignalUseCase$reset$1 = new FavoriteListSignalUseCase$reset$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = favoriteListSignalUseCase$reset$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = favoriteListSignalUseCase$reset$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            FavoriteListSignalUseCase$resetIoAF18A$$inlined$dexRunCatching$1 favoriteListSignalUseCase$resetIoAF18A$$inlined$dexRunCatching$1 = new FavoriteListSignalUseCase$resetIoAF18A$$inlined$dexRunCatching$1(null, this);
            favoriteListSignalUseCase$reset$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, favoriteListSignalUseCase$resetIoAF18A$$inlined$dexRunCatching$1, favoriteListSignalUseCase$reset$1);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Result<Unit>> continuation) throws java.lang.Throwable {
        FavoriteListSignalUseCase$signalGroupListChange$1 favoriteListSignalUseCase$signalGroupListChange$1;
        if (continuation instanceof FavoriteListSignalUseCase$signalGroupListChange$1) {
            favoriteListSignalUseCase$signalGroupListChange$1 = (FavoriteListSignalUseCase$signalGroupListChange$1) continuation;
            int i = favoriteListSignalUseCase$signalGroupListChange$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                favoriteListSignalUseCase$signalGroupListChange$1.label = i - Integer.MIN_VALUE;
            } else {
                favoriteListSignalUseCase$signalGroupListChange$1 = new FavoriteListSignalUseCase$signalGroupListChange$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = favoriteListSignalUseCase$signalGroupListChange$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = favoriteListSignalUseCase$signalGroupListChange$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            FavoriteListSignalUseCase$signalGroupListChangeIoAF18A$$inlined$dexRunCatching$1 favoriteListSignalUseCase$signalGroupListChangeIoAF18A$$inlined$dexRunCatching$1 = new FavoriteListSignalUseCase$signalGroupListChangeIoAF18A$$inlined$dexRunCatching$1(null, this);
            favoriteListSignalUseCase$signalGroupListChange$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, favoriteListSignalUseCase$signalGroupListChangeIoAF18A$$inlined$dexRunCatching$1, favoriteListSignalUseCase$signalGroupListChange$1);
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
