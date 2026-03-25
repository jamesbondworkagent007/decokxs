package o;

import com.okinc.business.market.features.watch_list_groups.domain.CreateWatchlistGroupUseCase$invoke$1;
import com.okinc.business.market.features.watch_list_groups.domain.CreateWatchlistGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kCk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27762kCk {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC27771kCt EZpvd;
    public final C27766kCo OLrzqt;
    public final kKG copydefault;

    @yCM
    public C27762kCk(@NotNull InterfaceC27771kCt interfaceC27771kCt, @NotNull kKG kkg, @NotNull C27766kCo c27766kCo, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27771kCt, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c27766kCo, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC27771kCt;
        this.copydefault = kkg;
        this.OLrzqt = c27766kCo;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends InterfaceC26243jXf>> continuation) {
        CreateWatchlistGroupUseCase$invoke$1 createWatchlistGroupUseCase$invoke$1;
        if (continuation instanceof CreateWatchlistGroupUseCase$invoke$1) {
            createWatchlistGroupUseCase$invoke$1 = (CreateWatchlistGroupUseCase$invoke$1) continuation;
            int i = createWatchlistGroupUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                createWatchlistGroupUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                createWatchlistGroupUseCase$invoke$1 = new CreateWatchlistGroupUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = createWatchlistGroupUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = createWatchlistGroupUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            CreateWatchlistGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1 createWatchlistGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1 = new CreateWatchlistGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1(null, this, str);
            createWatchlistGroupUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, createWatchlistGroupUseCase$invokegIAlus$$inlined$dexRunCatching$1, createWatchlistGroupUseCase$invoke$1);
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
