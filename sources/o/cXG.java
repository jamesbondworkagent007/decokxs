package o;

import com.okinc.business.defi.biz.impl.SecuritySignaturePermissionServiceImpl$connectVerificationServer$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cXG extends AbstractC43215rlA implements InterfaceC9845bdK {
    public static final TaskDescription Companion = new TaskDescription(null);

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cXG.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.InterfaceC9845bdK
    public java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<? extends java.lang.Object>> continuation) {
        pUU.KWHzl("SecuritySignaturePermissionCheck", "verifyClient: " + str + ", " + str2);
        return C14491dmU.Companion.OLrzqt().AEQbTJ(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC9845bdK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull java.lang.String str, long j, @NotNull Continuation<? super Result<java.lang.String>> continuation) {
        SecuritySignaturePermissionServiceImpl$connectVerificationServer$1 securitySignaturePermissionServiceImpl$connectVerificationServer$1;
        if (continuation instanceof SecuritySignaturePermissionServiceImpl$connectVerificationServer$1) {
            securitySignaturePermissionServiceImpl$connectVerificationServer$1 = (SecuritySignaturePermissionServiceImpl$connectVerificationServer$1) continuation;
            int i = securitySignaturePermissionServiceImpl$connectVerificationServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                securitySignaturePermissionServiceImpl$connectVerificationServer$1.label = i - Integer.MIN_VALUE;
            } else {
                securitySignaturePermissionServiceImpl$connectVerificationServer$1 = new SecuritySignaturePermissionServiceImpl$connectVerificationServer$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = securitySignaturePermissionServiceImpl$connectVerificationServer$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = securitySignaturePermissionServiceImpl$connectVerificationServer$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            pUU.KWHzl("SecuritySignaturePermissionCheck", "connectVerificationServer packageName=" + str);
            securitySignaturePermissionServiceImpl$connectVerificationServer$1.L$0 = str;
            securitySignaturePermissionServiceImpl$connectVerificationServer$1.J$0 = j;
            securitySignaturePermissionServiceImpl$connectVerificationServer$1.label = 1;
            C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(securitySignaturePermissionServiceImpl$connectVerificationServer$1));
            C14486dmP.Companion.AEQbTJ().OLrzqt(str, j, new StateListAnimator(c56434yFf));
            objKWHzl = c56434yFf.KWHzl();
            if (objKWHzl == C56442yFn.copydefault()) {
                C56447yFs.copydefault(securitySignaturePermissionServiceImpl$connectVerificationServer$1);
            }
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        return ((Result) objKWHzl).m7386unboximpl();
    }

    public static final class StateListAnimator implements Function2<java.lang.Boolean, java.lang.String, Unit> {
        public final /* synthetic */ Continuation<Result<java.lang.String>> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.String>> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(Continuation<? super Result<java.lang.String>> continuation) {
            this.KWHzl = continuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(java.lang.Boolean bool, java.lang.String str) {
            OLrzqt(bool.booleanValue(), str);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(boolean z, java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (z) {
                pUU.KWHzl("SecuritySignaturePermissionCheck", "connectVerificationServer success, token=" + str);
                Continuation<Result<java.lang.String>> continuation = this.KWHzl;
                Result.Application application = Result.Companion;
                continuation.resumeWith(Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(str))));
                return;
            }
            pUU.KWHzl("SecuritySignaturePermissionCheck", "connectVerificationServer failure, token=" + str);
            Continuation<Result<java.lang.String>> continuation2 = this.KWHzl;
            Result.Application application2 = Result.Companion;
            continuation2.resumeWith(Result.m7377constructorimpl(Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(new java.lang.Exception("Connection failed: " + str))))));
        }
    }
}
