package o;

import com.google.android.gms.fido.fido2.Fido2ApiClient;
import com.okinc.auth.impl.passkey.data.PasskeyApiService;
import com.okinc.auth.impl.passkey.domain.SecurityFido2ManagementUseCase$getAuthenticatorList$1;
import com.okinc.auth.impl.passkey.domain.SecurityFido2ManagementUseCase$prepareUnlockTokenWithFidoFlow$2;
import com.okinc.auth.impl.passkey.domain.SecurityFido2ManagementUseCase$renameAuthenticator$1;
import com.okinc.auth.impl.passkey.domain.SecurityFido2ManagementUseCase$renameAuthenticator$2;
import com.okinc.auth.impl.passkey.model.GetAuthenticatorListResponse;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5973aGa {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final C5904aFK AEQbTJ;
    public final CoroutineDispatcher AhwBna;
    public final Fido2ApiClient KWHzl;
    public final C5903aFJ OLrzqt;
    public final PasskeyApiService copydefault;

    @yCM
    public C5973aGa(@NotNull PasskeyApiService passkeyApiService, @NotNull Fido2ApiClient fido2ApiClient, @NotNull C5904aFK c5904aFK, @NotNull C5903aFJ c5903aFJ, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(passkeyApiService, "");
        Intrinsics.checkNotNullParameter(fido2ApiClient, "");
        Intrinsics.checkNotNullParameter(c5904aFK, "");
        Intrinsics.checkNotNullParameter(c5903aFJ, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = passkeyApiService;
        this.KWHzl = fido2ApiClient;
        this.AEQbTJ = c5904aFK;
        this.OLrzqt = c5903aFJ;
        this.AhwBna = coroutineDispatcher;
    }

    /* JADX INFO: renamed from: o.aGa$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aGa.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final Flow<AbstractC32955mnO<GetAuthenticatorListResponse>> OLrzqt() {
        return FlowKt.flowOn(FlowKt.flow(new SecurityFido2ManagementUseCase$getAuthenticatorList$1(this, null)), this.AhwBna);
    }

    public final java.lang.Object copydefault(@NotNull Continuation<? super AbstractC5990aGr> continuation) {
        return BuildersKt.withContext(this.AhwBna, new SecurityFido2ManagementUseCase$prepareUnlockTokenWithFidoFlow$2(this, null), continuation);
    }

    public final Flow<AbstractC32955mnO<Unit>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FlowKt.flowOn(FlowKt.m7441catch(FlowKt.flow(new SecurityFido2ManagementUseCase$renameAuthenticator$1(str, str2, this, null)), new SecurityFido2ManagementUseCase$renameAuthenticator$2(null)), this.AhwBna);
    }
}
