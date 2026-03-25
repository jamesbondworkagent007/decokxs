package o;

import com.okinc.dexkline.market.features.favorite_list_signal.domain.FavoriteListSignalUseCase$reset$1;
import com.okinc.dexkline.market.features.favorite_list_signal.domain.FavoriteListSignalUseCase$resetIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.favorite_list_signal.domain.FavoriteListSignalUseCase$signalFavoriteListChange$1;
import com.okinc.dexkline.market.features.favorite_list_signal.domain.FavoriteListSignalUseCase$signalFavoriteListChangeIoAF18A$$inlined$dexRunCatching$1;
import com.okinc.dexkline.market.features.favorite_list_signal.domain.FavoriteListSignalUseCase$signalGroupListChange$1;
import com.okinc.dexkline.market.features.favorite_list_signal.domain.FavoriteListSignalUseCase$signalGroupListChangeIoAF18A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@yCR
public final class mYU {
    public final MutableStateFlow<java.lang.Long> KWHzl;
    public final CoroutineDispatcher OLrzqt;
    public final MutableStateFlow<java.lang.Long> copydefault;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<Unit>> continuation) {
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
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
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super Result<Unit>> continuation) {
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
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
    public final java.lang.Object copydefault(@NotNull Continuation<? super Result<Unit>> continuation) {
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
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
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
