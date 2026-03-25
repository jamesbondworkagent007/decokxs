package o;

import com.okinc.auth.impl.guard.domain.GetAndroidOriginUseCase$invoke$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aBJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5691aBJ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final C5694aBM OLrzqt;

    @yCM
    public C5691aBJ(@NotNull C5694aBM c5694aBM) {
        Intrinsics.checkNotNullParameter(c5694aBM, "");
        this.OLrzqt = c5694aBM;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(android.content.Context context, @NotNull Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        GetAndroidOriginUseCase$invoke$1 getAndroidOriginUseCase$invoke$1;
        java.lang.Object objKWHzl;
        if (continuation instanceof GetAndroidOriginUseCase$invoke$1) {
            getAndroidOriginUseCase$invoke$1 = (GetAndroidOriginUseCase$invoke$1) continuation;
            int i = getAndroidOriginUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getAndroidOriginUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getAndroidOriginUseCase$invoke$1 = new GetAndroidOriginUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = getAndroidOriginUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getAndroidOriginUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C5694aBM c5694aBM = this.OLrzqt;
            getAndroidOriginUseCase$invoke$1.label = 1;
            objKWHzl = c5694aBM.KWHzl(context, getAndroidOriginUseCase$invoke$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objKWHzl)) {
            objKWHzl = "";
        }
        return "android:apk-key-hash:" + ((java.lang.String) objKWHzl);
    }

    /* JADX INFO: renamed from: o.aBJ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aBJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
