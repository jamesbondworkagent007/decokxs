package o;

import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.okinc.auth.impl.passkey.domain.PasskeyCheckDeviceSupportBySdkUseCase$invoke$1;
import com.okinc.auth.impl.passkey.domain.PasskeyCheckDeviceSupportBySdkUseCase$invoke$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aFJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5903aFJ {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final Fido2ApiClient EZpvd;

    @yCM
    public C5903aFJ(@NotNull Fido2ApiClient fido2ApiClient) {
        Intrinsics.checkNotNullParameter(fido2ApiClient, "");
        this.EZpvd = fido2ApiClient;
    }

    /* JADX INFO: renamed from: o.aFJ$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aFJ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        PasskeyCheckDeviceSupportBySdkUseCase$invoke$1 passkeyCheckDeviceSupportBySdkUseCase$invoke$1;
        boolean zBooleanValue;
        java.lang.Boolean bool;
        if (continuation instanceof PasskeyCheckDeviceSupportBySdkUseCase$invoke$1) {
            passkeyCheckDeviceSupportBySdkUseCase$invoke$1 = (PasskeyCheckDeviceSupportBySdkUseCase$invoke$1) continuation;
            int i = passkeyCheckDeviceSupportBySdkUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                passkeyCheckDeviceSupportBySdkUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                passkeyCheckDeviceSupportBySdkUseCase$invoke$1 = new PasskeyCheckDeviceSupportBySdkUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithTimeoutOrNull = passkeyCheckDeviceSupportBySdkUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = passkeyCheckDeviceSupportBySdkUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithTimeoutOrNull);
                PasskeyCheckDeviceSupportBySdkUseCase$invoke$2 passkeyCheckDeviceSupportBySdkUseCase$invoke$2 = new PasskeyCheckDeviceSupportBySdkUseCase$invoke$2(this, null);
                passkeyCheckDeviceSupportBySdkUseCase$invoke$1.L$0 = this;
                passkeyCheckDeviceSupportBySdkUseCase$invoke$1.label = 1;
                objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(5000L, passkeyCheckDeviceSupportBySdkUseCase$invoke$2, passkeyCheckDeviceSupportBySdkUseCase$invoke$1);
                if (objWithTimeoutOrNull == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithTimeoutOrNull);
            }
            bool = (java.lang.Boolean) objWithTimeoutOrNull;
        } catch (java.lang.Exception e) {
            pUU.copydefault("passkey checkDeviceSupportBySdkUseCase: " + e.getMessage());
        }
        if (bool == null) {
            pUU.AEQbTJ("passkey checkDeviceSupportBySdkUseCase: timeout in 5000 ms");
            zBooleanValue = false;
            return C56443yFo.KWHzl(zBooleanValue);
        }
        zBooleanValue = bool.booleanValue();
        return C56443yFo.KWHzl(zBooleanValue);
    }
}
