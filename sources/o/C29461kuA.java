package o;

import com.okinc.business.market.data.model.UpdateSignalAlertsRequest;
import com.okinc.business.market.features.smart_money.signal.domain.UpdateSignalAlertsUseCase$addAlert$1;
import com.okinc.business.market.features.smart_money.signal.domain.UpdateSignalAlertsUseCase$addAlertBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.smart_money.signal.domain.UpdateSignalAlertsUseCase$deleteAlert$1;
import com.okinc.business.market.features.smart_money.signal.domain.UpdateSignalAlertsUseCase$deleteAlertBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.smart_money.signal.domain.UpdateSignalAlertsUseCase$getJwtToken$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C29463kuC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29461kuA {
    public final CoroutineDispatcher AEQbTJ;
    public final C28603kdr KWHzl;
    public final InterfaceC29466kuF OLrzqt;

    public final int AEQbTJ(C29463kuC.Application application) {
        return application == null ? 1 : 2;
    }

    @yCM
    public C29461kuA(@NotNull InterfaceC29466kuF interfaceC29466kuF, @NotNull C28603kdr c28603kdr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29466kuF, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.OLrzqt = interfaceC29466kuF;
        this.KWHzl = c28603kdr;
        this.AEQbTJ = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, long j, C29463kuC.Application application, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        UpdateSignalAlertsUseCase$addAlert$1 updateSignalAlertsUseCase$addAlert$1;
        if (continuation instanceof UpdateSignalAlertsUseCase$addAlert$1) {
            updateSignalAlertsUseCase$addAlert$1 = (UpdateSignalAlertsUseCase$addAlert$1) continuation;
            int i = updateSignalAlertsUseCase$addAlert$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateSignalAlertsUseCase$addAlert$1.label = i - Integer.MIN_VALUE;
            } else {
                updateSignalAlertsUseCase$addAlert$1 = new UpdateSignalAlertsUseCase$addAlert$1(this, continuation);
            }
        }
        UpdateSignalAlertsUseCase$addAlert$1 updateSignalAlertsUseCase$addAlert$12 = updateSignalAlertsUseCase$addAlert$1;
        java.lang.Object objWithContext = updateSignalAlertsUseCase$addAlert$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateSignalAlertsUseCase$addAlert$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            UpdateSignalAlertsUseCase$addAlertBWLJW6A$$inlined$dexRunCatching$1 updateSignalAlertsUseCase$addAlertBWLJW6A$$inlined$dexRunCatching$1 = new UpdateSignalAlertsUseCase$addAlertBWLJW6A$$inlined$dexRunCatching$1(null, this, str, application, j);
            updateSignalAlertsUseCase$addAlert$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, updateSignalAlertsUseCase$addAlertBWLJW6A$$inlined$dexRunCatching$1, updateSignalAlertsUseCase$addAlert$12);
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, long j, C29463kuC.Application application, @NotNull Continuation<? super Result<java.lang.Boolean>> continuation) {
        UpdateSignalAlertsUseCase$deleteAlert$1 updateSignalAlertsUseCase$deleteAlert$1;
        if (continuation instanceof UpdateSignalAlertsUseCase$deleteAlert$1) {
            updateSignalAlertsUseCase$deleteAlert$1 = (UpdateSignalAlertsUseCase$deleteAlert$1) continuation;
            int i = updateSignalAlertsUseCase$deleteAlert$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateSignalAlertsUseCase$deleteAlert$1.label = i - Integer.MIN_VALUE;
            } else {
                updateSignalAlertsUseCase$deleteAlert$1 = new UpdateSignalAlertsUseCase$deleteAlert$1(this, continuation);
            }
        }
        UpdateSignalAlertsUseCase$deleteAlert$1 updateSignalAlertsUseCase$deleteAlert$12 = updateSignalAlertsUseCase$deleteAlert$1;
        java.lang.Object objWithContext = updateSignalAlertsUseCase$deleteAlert$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateSignalAlertsUseCase$deleteAlert$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
            UpdateSignalAlertsUseCase$deleteAlertBWLJW6A$$inlined$dexRunCatching$1 updateSignalAlertsUseCase$deleteAlertBWLJW6A$$inlined$dexRunCatching$1 = new UpdateSignalAlertsUseCase$deleteAlertBWLJW6A$$inlined$dexRunCatching$1(null, this, str, application, j);
            updateSignalAlertsUseCase$deleteAlert$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, updateSignalAlertsUseCase$deleteAlertBWLJW6A$$inlined$dexRunCatching$1, updateSignalAlertsUseCase$deleteAlert$12);
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

    public final UpdateSignalAlertsRequest EZpvd(java.lang.String str, C29463kuC.Application application, int i) {
        java.lang.String strCopydefault;
        return new UpdateSignalAlertsRequest(str, AEQbTJ(application), i, (application == null || (strCopydefault = application.copydefault()) == null) ? null : StringsKt__StringNumberConversionsKt.getFieldNames(strCopydefault), application != null ? application.AEQbTJ() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        UpdateSignalAlertsUseCase$getJwtToken$1 updateSignalAlertsUseCase$getJwtToken$1;
        java.lang.Object objAEQbTJ;
        if (continuation instanceof UpdateSignalAlertsUseCase$getJwtToken$1) {
            updateSignalAlertsUseCase$getJwtToken$1 = (UpdateSignalAlertsUseCase$getJwtToken$1) continuation;
            int i = updateSignalAlertsUseCase$getJwtToken$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateSignalAlertsUseCase$getJwtToken$1.label = i - Integer.MIN_VALUE;
            } else {
                updateSignalAlertsUseCase$getJwtToken$1 = new UpdateSignalAlertsUseCase$getJwtToken$1(this, continuation);
            }
        }
        java.lang.Object obj = updateSignalAlertsUseCase$getJwtToken$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateSignalAlertsUseCase$getJwtToken$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C28603kdr c28603kdr = this.KWHzl;
            updateSignalAlertsUseCase$getJwtToken$1.label = 1;
            objAEQbTJ = c28603kdr.AEQbTJ(str, updateSignalAlertsUseCase$getJwtToken$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = null;
        }
        java.lang.String str2 = (java.lang.String) objAEQbTJ;
        if (str2 != null) {
            return str2;
        }
        throw new java.lang.IllegalArgumentException("Invalid jwtToken");
    }
}
