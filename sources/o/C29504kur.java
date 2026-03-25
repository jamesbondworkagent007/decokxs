package o;

import com.okinc.business.market.features.smart_money.signal.domain.GetSignalAlertHistoryUseCase$invoke$1;
import com.okinc.business.market.features.smart_money.signal.domain.GetSignalAlertHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29504kur {
    public final CoroutineDispatcher AEQbTJ;
    public final InterfaceC29466kuF EZpvd;
    public final C29474kuN OLrzqt;

    @yCM
    public C29504kur(@NotNull InterfaceC29466kuF interfaceC29466kuF, @NotNull C29474kuN c29474kuN, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29466kuF, "");
        Intrinsics.checkNotNullParameter(c29474kuN, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = interfaceC29466kuF;
        this.OLrzqt = c29474kuN;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<java.lang.Integer> list, @NotNull Continuation<? super Result<C29584kwR>> continuation) throws java.lang.Throwable {
        GetSignalAlertHistoryUseCase$invoke$1 getSignalAlertHistoryUseCase$invoke$1;
        if (continuation instanceof GetSignalAlertHistoryUseCase$invoke$1) {
            getSignalAlertHistoryUseCase$invoke$1 = (GetSignalAlertHistoryUseCase$invoke$1) continuation;
            int i = getSignalAlertHistoryUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSignalAlertHistoryUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getSignalAlertHistoryUseCase$invoke$1 = new GetSignalAlertHistoryUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getSignalAlertHistoryUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getSignalAlertHistoryUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            GetSignalAlertHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 getSignalAlertHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 = new GetSignalAlertHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(null, this, str, str2, list);
            getSignalAlertHistoryUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getSignalAlertHistoryUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1, getSignalAlertHistoryUseCase$invoke$1);
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

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.kur */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: invoke-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8673invokeBWLJW6A$default(C29504kur c29504kur, java.lang.String str, java.lang.String str2, java.util.List list, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            list = yDY.AhwBna();
        }
        return c29504kur.copydefault(str, str2, list, continuation);
    }
}
