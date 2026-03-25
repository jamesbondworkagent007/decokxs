package o;

import com.okinc.business.defi.biz.impl.WalletJwtServiceImpl$generateJwt$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.C13754dXa;
import o.InterfaceC13426dKx;
import o.InterfaceC9755bba;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cZG extends AbstractC43215rlA implements InterfaceC9858bdX {
    public final C18438fiR EZpvd;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public cZG() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (wrap:o.fiR:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.fiR:0x0010: CONSTRUCTOR 
  (null o.dbu)
  (null o.cuN)
  (null o.byA)
  (null o.fiS)
  (null o.aXp)
  (null o.xYU)
  (63 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(o.dbu, o.cuN, o.byA, o.fiS, o.aXp, o.xYU, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:21) call: o.fiR.<init>(o.dbu, o.cuN, o.byA, o.fiS, o.aXp, o.xYU, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r10v0 o.fiR))
 A[MD:(o.fiR):void (m)] (LINE:20) call: o.cZG.<init>(o.fiR):void type: THIS */
    public /* synthetic */ cZG(C18438fiR c18438fiR, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C18438fiR(null, null, null, null, null, null, 63, null) : c18438fiR);
    }

    public cZG(@NotNull C18438fiR c18438fiR) {
        Intrinsics.checkNotNullParameter(c18438fiR, "");
        this.EZpvd = c18438fiR;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cZG.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.InterfaceC9858bdX
    public Interceptor AEQbTJ() {
        InterfaceC13426dKx.TaskDescription taskDescription = InterfaceC13426dKx.Companion;
        return new C13925dbl(InterfaceC13426dKx.TaskDescription.getInstance$default(taskDescription, null, 1, null).OcIXYQ(), InterfaceC13426dKx.TaskDescription.getInstance$default(taskDescription, null, 1, null).AwvSrB(), C8342bAs.Companion.EZpvd(), this.EZpvd);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC9858bdX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull Continuation<? super InterfaceC9755bba> continuation) throws java.lang.Throwable {
        WalletJwtServiceImpl$generateJwt$1 walletJwtServiceImpl$generateJwt$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        java.lang.String str2;
        cZG czg;
        java.lang.Object objCopydefault;
        java.lang.Object obj;
        if (continuation instanceof WalletJwtServiceImpl$generateJwt$1) {
            walletJwtServiceImpl$generateJwt$1 = (WalletJwtServiceImpl$generateJwt$1) continuation;
            int i = walletJwtServiceImpl$generateJwt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletJwtServiceImpl$generateJwt$1.label = i - Integer.MIN_VALUE;
            } else {
                walletJwtServiceImpl$generateJwt$1 = new WalletJwtServiceImpl$generateJwt$1(this, continuation);
            }
        }
        java.lang.Object result = walletJwtServiceImpl$generateJwt$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = walletJwtServiceImpl$generateJwt$1.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(result);
            Result.Application application2 = Result.Companion;
            walletJwtServiceImpl$generateJwt$1.L$0 = this;
            walletJwtServiceImpl$generateJwt$1.L$1 = fragmentManager;
            str2 = str;
            walletJwtServiceImpl$generateJwt$1.L$2 = str2;
            walletJwtServiceImpl$generateJwt$1.L$3 = walletJwtServiceImpl$generateJwt$1;
            walletJwtServiceImpl$generateJwt$1.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(walletJwtServiceImpl$generateJwt$1), 1);
            cancellableContinuationImpl.initCancellability();
            new C14461dlr(fragmentManager, "generateJwt", new Activity(cancellableContinuationImpl), new ActionBar(cancellableContinuationImpl), null, false, 48, null).EZpvd();
            result = cancellableContinuationImpl.getResult();
            if (result == C56442yFn.copydefault()) {
                C56447yFs.copydefault(walletJwtServiceImpl$generateJwt$1);
            }
            if (result == objCopydefault2) {
                return objCopydefault2;
            }
            czg = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(result);
                objCopydefault = ((Result) result).m7386unboximpl();
                C56391yDq.AEQbTJ(objCopydefault);
                obj = InterfaceC9755bba.TaskDescription.EZpvd;
                objM7377constructorimpl = Result.m7377constructorimpl(obj);
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl == null) {
                    return objM7377constructorimpl;
                }
                pUU.AEQbTJ("WalletJwtServiceImpl", "generateJwt failed", thM7380exceptionOrNullimpl);
                return new InterfaceC9755bba.ActionBar(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStubProxy));
            }
            str2 = (java.lang.String) walletJwtServiceImpl$generateJwt$1.L$2;
            czg = (cZG) walletJwtServiceImpl$generateJwt$1.L$0;
            C56391yDq.AEQbTJ(result);
        }
        kotlin.Pair pair = (kotlin.Pair) result;
        java.lang.String str3 = (java.lang.String) pair.component1();
        if (((java.lang.Boolean) pair.component2()).booleanValue()) {
            obj = InterfaceC9755bba.Application.EZpvd;
            objM7377constructorimpl = Result.m7377constructorimpl(obj);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
            }
        } else {
            if (str3.length() == 0) {
                pUU.copydefault("WalletJwtServiceImpl", "password is empty");
                new InterfaceC9755bba.ActionBar(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStubProxy));
            }
            C18438fiR c18438fiR = czg.EZpvd;
            walletJwtServiceImpl$generateJwt$1.L$0 = null;
            walletJwtServiceImpl$generateJwt$1.L$1 = null;
            walletJwtServiceImpl$generateJwt$1.L$2 = null;
            walletJwtServiceImpl$generateJwt$1.L$3 = null;
            walletJwtServiceImpl$generateJwt$1.label = 2;
            objCopydefault = c18438fiR.copydefault(str2, str3, walletJwtServiceImpl$generateJwt$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            C56391yDq.AEQbTJ(objCopydefault);
            obj = InterfaceC9755bba.TaskDescription.EZpvd;
            objM7377constructorimpl = Result.m7377constructorimpl(obj);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
            }
        }
    }

    public static final class ActionBar implements Function0<Unit> {
        public final /* synthetic */ CancellableContinuation<kotlin.Pair<java.lang.String, java.lang.Boolean>> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Pair<java.lang.String, java.lang.Boolean>> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(CancellableContinuation<? super kotlin.Pair<java.lang.String, java.lang.Boolean>> cancellableContinuation) {
            this.AEQbTJ = cancellableContinuation;
        }

        public final void EZpvd() {
            if (this.AEQbTJ.isActive()) {
                CancellableContinuation<kotlin.Pair<java.lang.String, java.lang.Boolean>> cancellableContinuation = this.AEQbTJ;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56390yDp.OLrzqt("", java.lang.Boolean.TRUE)));
            }
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            EZpvd();
            return Unit.INSTANCE;
        }
    }

    public static final class Activity implements Function1<java.lang.String, Unit> {
        public final /* synthetic */ CancellableContinuation<kotlin.Pair<java.lang.String, java.lang.Boolean>> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Pair<java.lang.String, java.lang.Boolean>> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(CancellableContinuation<? super kotlin.Pair<java.lang.String, java.lang.Boolean>> cancellableContinuation) {
            this.KWHzl = cancellableContinuation;
        }

        public final void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (this.KWHzl.isActive()) {
                CancellableContinuation<kotlin.Pair<java.lang.String, java.lang.Boolean>> cancellableContinuation = this.KWHzl;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(C56390yDp.OLrzqt(str, java.lang.Boolean.FALSE)));
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            OLrzqt(str);
            return Unit.INSTANCE;
        }
    }
}
