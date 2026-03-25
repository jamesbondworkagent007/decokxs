package o;

import com.okinc.business.market.data.model.HomeTabRequest;
import com.okinc.business.market.features.home.domain.GetHomeTabListUseCase$getHomeTabList$1;
import com.okinc.business.market.features.home.domain.GetHomeTabListUseCase$getHomeTabList0E7RQCE$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.home.domain.HomeTab;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kat, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28446kat {
    public final C28547kco AEQbTJ;
    public final CoroutineDispatcher OLrzqt;
    public final C28447kau copydefault;

    @yCM
    public C28446kat(@NotNull C28547kco c28547kco, @NotNull C28447kau c28447kau, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c28547kco, "");
        Intrinsics.checkNotNullParameter(c28447kau, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = c28547kco;
        this.copydefault = c28447kau;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: getHomeTabList-0E7RQCE$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8661getHomeTabList0E7RQCE$default(C28446kat c28446kat, java.lang.String str, HomeTabRequest homeTabRequest, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            homeTabRequest = HomeTabRequest.EOA;
        }
        return c28446kat.AEQbTJ(str, homeTabRequest, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull HomeTabRequest homeTabRequest, @NotNull Continuation<? super Result<? extends java.util.List<HomeTab>>> continuation) throws java.lang.Throwable {
        GetHomeTabListUseCase$getHomeTabList$1 getHomeTabListUseCase$getHomeTabList$1;
        if (continuation instanceof GetHomeTabListUseCase$getHomeTabList$1) {
            getHomeTabListUseCase$getHomeTabList$1 = (GetHomeTabListUseCase$getHomeTabList$1) continuation;
            int i = getHomeTabListUseCase$getHomeTabList$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getHomeTabListUseCase$getHomeTabList$1.label = i - Integer.MIN_VALUE;
            } else {
                getHomeTabListUseCase$getHomeTabList$1 = new GetHomeTabListUseCase$getHomeTabList$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getHomeTabListUseCase$getHomeTabList$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getHomeTabListUseCase$getHomeTabList$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.OLrzqt;
            GetHomeTabListUseCase$getHomeTabList0E7RQCE$$inlined$dexRunCatching$1 getHomeTabListUseCase$getHomeTabList0E7RQCE$$inlined$dexRunCatching$1 = new GetHomeTabListUseCase$getHomeTabList0E7RQCE$$inlined$dexRunCatching$1(null, this, homeTabRequest, str);
            getHomeTabListUseCase$getHomeTabList$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getHomeTabListUseCase$getHomeTabList0E7RQCE$$inlined$dexRunCatching$1, getHomeTabListUseCase$getHomeTabList$1);
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
