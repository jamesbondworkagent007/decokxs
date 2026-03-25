package o;

import com.okinc.business.market.features.vibes.domain.VibesKolData;
import com.okinc.business.market.features.vibes.domain.VibesSortType;
import com.okinc.business.market.features.vibes.domain.VibesTimeRange;
import com.okinc.business.market.features.vibes.domain.VibesTopKolType;
import com.okinc.business.market.features.vibes.repo.VibesKolRepositoryImpl$fetchTopKolInfo$1;
import com.okinc.business.market.features.vibes.repo.VibesKolRepositoryImpl$fetchTopKolInfohUnOzRk$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kBa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27725kBa implements kAP {
    public final InterfaceC23231huN EZpvd;
    public final CoroutineDispatcher KWHzl;

    public C27725kBa(@NotNull InterfaceC23231huN interfaceC23231huN, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23231huN, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC23231huN;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // o.kAP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull VibesSortType vibesSortType, @NotNull VibesTopKolType vibesTopKolType, @NotNull VibesTimeRange vibesTimeRange, @NotNull Continuation<? super Result<? extends java.util.List<VibesKolData>>> continuation) {
        VibesKolRepositoryImpl$fetchTopKolInfo$1 vibesKolRepositoryImpl$fetchTopKolInfo$1;
        if (continuation instanceof VibesKolRepositoryImpl$fetchTopKolInfo$1) {
            vibesKolRepositoryImpl$fetchTopKolInfo$1 = (VibesKolRepositoryImpl$fetchTopKolInfo$1) continuation;
            int i = vibesKolRepositoryImpl$fetchTopKolInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vibesKolRepositoryImpl$fetchTopKolInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                vibesKolRepositoryImpl$fetchTopKolInfo$1 = new VibesKolRepositoryImpl$fetchTopKolInfo$1(this, continuation);
            }
        }
        VibesKolRepositoryImpl$fetchTopKolInfo$1 vibesKolRepositoryImpl$fetchTopKolInfo$12 = vibesKolRepositoryImpl$fetchTopKolInfo$1;
        java.lang.Object objWithContext = vibesKolRepositoryImpl$fetchTopKolInfo$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = vibesKolRepositoryImpl$fetchTopKolInfo$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            VibesKolRepositoryImpl$fetchTopKolInfohUnOzRk$$inlined$dexRunCatching$1 vibesKolRepositoryImpl$fetchTopKolInfohUnOzRk$$inlined$dexRunCatching$1 = new VibesKolRepositoryImpl$fetchTopKolInfohUnOzRk$$inlined$dexRunCatching$1(null, this, str, str2, vibesSortType, vibesTopKolType, vibesTimeRange);
            vibesKolRepositoryImpl$fetchTopKolInfo$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, vibesKolRepositoryImpl$fetchTopKolInfohUnOzRk$$inlined$dexRunCatching$1, vibesKolRepositoryImpl$fetchTopKolInfo$12);
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
