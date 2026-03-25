package o;

import com.okinc.business.market.features.smart_money.signal.domain.GetSignalAlertsUseCase$invoke$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalAlertsUseCase$invokegIAlus$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kup, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29502kup {
    public final InterfaceC29466kuF EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C29502kup(@NotNull InterfaceC29466kuF interfaceC29466kuF, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29466kuF, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC29466kuF;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Result<C29463kuC>> continuation) {
        GetSignalAlertsUseCase$invoke$1 getSignalAlertsUseCase$invoke$1;
        if (continuation instanceof GetSignalAlertsUseCase$invoke$1) {
            getSignalAlertsUseCase$invoke$1 = (GetSignalAlertsUseCase$invoke$1) continuation;
            int i = getSignalAlertsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSignalAlertsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getSignalAlertsUseCase$invoke$1 = new GetSignalAlertsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getSignalAlertsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSignalAlertsUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.copydefault;
            GetSignalAlertsUseCase$invokegIAlus$$inlined$dexRunCatching$1 getSignalAlertsUseCase$invokegIAlus$$inlined$dexRunCatching$1 = new GetSignalAlertsUseCase$invokegIAlus$$inlined$dexRunCatching$1(null, this, str);
            getSignalAlertsUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getSignalAlertsUseCase$invokegIAlus$$inlined$dexRunCatching$1, getSignalAlertsUseCase$invoke$1);
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
