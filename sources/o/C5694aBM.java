package o;

import java.security.MessageDigest;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aBM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5694aBM extends AbstractC5726aBs<android.content.Context, java.lang.String> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final CoroutineDispatcher copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C5694aBM(@NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.AbstractC5726aBs
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Object EZpvd(android.content.Context context, @NotNull Continuation<? super java.lang.String> continuation) {
        if (context == null) {
            pUU.copydefault("GetAppSigningCertPublicKeyUseCase", "Context is null");
            return "";
        }
        try {
            android.content.pm.Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            android.content.pm.Signature signature = signatureArr != null ? (android.content.pm.Signature) yDV.zsXlph(signatureArr) : null;
            if (signature == null) {
                pUU.copydefault("GetAppSigningCertPublicKeyUseCase", "packageInfo.signatures is null");
                return "";
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(signature.toByteArray());
            Intrinsics.copydefault(bArrDigest);
            java.lang.String strAEQbTJ = C6617aSi.AEQbTJ(bArrDigest);
            pUU.KWHzl("GetAppSigningCertPublicKeyUseCase", "hashBase64Url: " + strAEQbTJ);
            return strAEQbTJ;
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            pUU.copydefault("GetAppSigningCertPublicKeyUseCase", "e: " + Unit.INSTANCE);
            return "";
        }
    }

    /* JADX INFO: renamed from: o.aBM$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aBM.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
