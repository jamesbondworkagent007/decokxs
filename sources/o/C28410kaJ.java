package o;

import com.okinc.business.market.features.home_favorite_list.domain.GetFavoriteListUseCase$getFavoriteList$1;
import com.okinc.business.market.features.home_favorite_list.domain.GetFavoriteListUseCase$getFavoriteList0E7RQCE$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kaJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28410kaJ {
    public final kKG EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C28413kaM OLrzqt;
    public final InterfaceC27771kCt copydefault;

    @yCM
    public C28410kaJ(@NotNull InterfaceC27771kCt interfaceC27771kCt, @NotNull kKG kkg, @NotNull C28413kaM c28413kaM, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27771kCt, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28413kaM, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = interfaceC27771kCt;
        this.EZpvd = kkg;
        this.OLrzqt = c28413kaM;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: getFavoriteList-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8659getFavoriteList0E7RQCE$default(C28410kaJ c28410kaJ, int i, java.lang.String str, Continuation continuation, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return c28410kaJ.EZpvd(i, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(int i, java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<C28422kaV>>> continuation) {
        GetFavoriteListUseCase$getFavoriteList$1 getFavoriteListUseCase$getFavoriteList$1;
        if (continuation instanceof GetFavoriteListUseCase$getFavoriteList$1) {
            getFavoriteListUseCase$getFavoriteList$1 = (GetFavoriteListUseCase$getFavoriteList$1) continuation;
            int i2 = getFavoriteListUseCase$getFavoriteList$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getFavoriteListUseCase$getFavoriteList$1.label = i2 - Integer.MIN_VALUE;
            } else {
                getFavoriteListUseCase$getFavoriteList$1 = new GetFavoriteListUseCase$getFavoriteList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getFavoriteListUseCase$getFavoriteList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = getFavoriteListUseCase$getFavoriteList$1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            GetFavoriteListUseCase$getFavoriteList0E7RQCE$$inlined$dexRunCatching$1 getFavoriteListUseCase$getFavoriteList0E7RQCE$$inlined$dexRunCatching$1 = new GetFavoriteListUseCase$getFavoriteList0E7RQCE$$inlined$dexRunCatching$1(null, this, i, str);
            getFavoriteListUseCase$getFavoriteList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getFavoriteListUseCase$getFavoriteList0E7RQCE$$inlined$dexRunCatching$1, getFavoriteListUseCase$getFavoriteList$1);
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
