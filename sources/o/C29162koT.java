package o;

import com.okinc.business.market.features.overview.domain.RwaTradingStatus;
import com.okinc.business.market.features.rwa.domain.RwaStatusUseCase$getRwaStatuses$1;
import com.okinc.business.market.features.rwa.domain.RwaStatusUseCase$getRwaStatusesgIAlus$$inlined$dexRunCatching$1;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.koT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@yCR
public final class C29162koT {
    public final InterfaceC29159koQ AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final java.util.Map<java.lang.String, java.util.List<RwaTradingStatus>> KWHzl;
    public final C29715kyq copydefault;

    @yCM
    public C29162koT(@NotNull InterfaceC29159koQ interfaceC29159koQ, @NotNull C29715kyq c29715kyq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29159koQ, "");
        Intrinsics.checkNotNullParameter(c29715kyq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC29159koQ;
        this.copydefault = c29715kyq;
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull Continuation<? super Result<? extends java.util.List<RwaTradingStatus>>> continuation) throws java.lang.Throwable {
        RwaStatusUseCase$getRwaStatuses$1 rwaStatusUseCase$getRwaStatuses$1;
        C29162koT c29162koT;
        if (continuation instanceof RwaStatusUseCase$getRwaStatuses$1) {
            rwaStatusUseCase$getRwaStatuses$1 = (RwaStatusUseCase$getRwaStatuses$1) continuation;
            int i = rwaStatusUseCase$getRwaStatuses$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rwaStatusUseCase$getRwaStatuses$1.label = i - Integer.MIN_VALUE;
            } else {
                rwaStatusUseCase$getRwaStatuses$1 = new RwaStatusUseCase$getRwaStatuses$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = rwaStatusUseCase$getRwaStatuses$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = rwaStatusUseCase$getRwaStatuses$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            java.util.List<RwaTradingStatus> list = this.KWHzl.get(str);
            if (list != null) {
                Result.Application application = Result.Companion;
                return Result.m7377constructorimpl(list);
            }
            CoroutineDispatcher coroutineDispatcher = this.EZpvd;
            RwaStatusUseCase$getRwaStatusesgIAlus$$inlined$dexRunCatching$1 rwaStatusUseCase$getRwaStatusesgIAlus$$inlined$dexRunCatching$1 = new RwaStatusUseCase$getRwaStatusesgIAlus$$inlined$dexRunCatching$1(null, this, str);
            rwaStatusUseCase$getRwaStatuses$1.L$0 = this;
            rwaStatusUseCase$getRwaStatuses$1.L$1 = str;
            rwaStatusUseCase$getRwaStatuses$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, rwaStatusUseCase$getRwaStatusesgIAlus$$inlined$dexRunCatching$1, rwaStatusUseCase$getRwaStatuses$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            c29162koT = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) rwaStatusUseCase$getRwaStatuses$1.L$1;
            c29162koT = (C29162koT) rwaStatusUseCase$getRwaStatuses$1.L$0;
            C56391yDq.AEQbTJ(objWithContext);
        }
        java.lang.Object objM7386unboximpl = ((Result) objWithContext).m7386unboximpl();
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            c29162koT.KWHzl.put(str, (java.util.List) objM7386unboximpl);
        }
        return objM7386unboximpl;
    }
}
