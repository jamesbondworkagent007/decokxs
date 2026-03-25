package o;

import com.okinc.im.usecase.relationlist.HasPhoneRelationUseCase$execute$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oGr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35868oGr {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final sKN EZpvd;

    @yCM
    public C35868oGr(@NotNull sKN skn) {
        Intrinsics.checkNotNullParameter(skn, "");
        this.EZpvd = skn;
    }

    /* JADX INFO: renamed from: o.oGr$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGr.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        HasPhoneRelationUseCase$execute$1 hasPhoneRelationUseCase$execute$1;
        if (continuation instanceof HasPhoneRelationUseCase$execute$1) {
            hasPhoneRelationUseCase$execute$1 = (HasPhoneRelationUseCase$execute$1) continuation;
            int i = hasPhoneRelationUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hasPhoneRelationUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                hasPhoneRelationUseCase$execute$1 = new HasPhoneRelationUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = hasPhoneRelationUseCase$execute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = hasPhoneRelationUseCase$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            sKN skn = this.EZpvd;
            hasPhoneRelationUseCase$execute$1.label = 1;
            objCopydefault = skn.copydefault(hasPhoneRelationUseCase$execute$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        boolean zBooleanValue = ((java.lang.Boolean) objCopydefault).booleanValue();
        pUU.KWHzl("HasPhoneRelationUseCase", "hasPhoneRelation:" + zBooleanValue);
        return C56443yFo.KWHzl(zBooleanValue);
    }
}
