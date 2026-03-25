package o;

import com.okinc.business.market.features.identity.domain.DexUserIdentity;
import com.okinc.business.market.features.identity.domain.GetUserIdentityUseCase$invoke$1;
import com.okinc.business.market.features.identity.domain.GetUserIdentityUseCase$invokeIoAF18A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kda, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28586kda {
    public final CoroutineDispatcher KWHzl;
    public final kKG copydefault;

    @yCM
    public C28586kda(@NotNull kKG kkg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = kkg;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Result<DexUserIdentity>> continuation) throws java.lang.Throwable {
        GetUserIdentityUseCase$invoke$1 getUserIdentityUseCase$invoke$1;
        if (continuation instanceof GetUserIdentityUseCase$invoke$1) {
            getUserIdentityUseCase$invoke$1 = (GetUserIdentityUseCase$invoke$1) continuation;
            int i = getUserIdentityUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getUserIdentityUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getUserIdentityUseCase$invoke$1 = new GetUserIdentityUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getUserIdentityUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getUserIdentityUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.KWHzl;
            GetUserIdentityUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 getUserIdentityUseCase$invokeIoAF18A$$inlined$dexRunCatching$1 = new GetUserIdentityUseCase$invokeIoAF18A$$inlined$dexRunCatching$1(null, this);
            getUserIdentityUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getUserIdentityUseCase$invokeIoAF18A$$inlined$dexRunCatching$1, getUserIdentityUseCase$invoke$1);
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
