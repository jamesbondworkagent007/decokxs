package o;

import com.okinc.business.defi.biz.impl.WalletSilentSignServiceImpl$requestUserAuthentication$1;
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
import o.InterfaceC9759bbe;
import o.InterfaceC9762bbh;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.daz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13886daz extends AbstractC43215rlA implements InterfaceC9855bdU {
    public static final Application Companion = new Application(null);

    /* JADX INFO: renamed from: o.daz$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.daz.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // o.InterfaceC9855bdU
    public InterfaceC9759bbe copydefault() {
        if (C14454dlk.EZpvd.OLrzqt() && C14473dmC.EZpvd.KWHzl()) {
            return InterfaceC9759bbe.Activity.EZpvd;
        }
        if (!C14453dlj.EZpvd.OLrzqt()) {
            return InterfaceC9759bbe.ActionBar.copydefault;
        }
        if (!C8342bAs.Companion.EZpvd().AEQbTJ()) {
            return InterfaceC9759bbe.Application.KWHzl;
        }
        if (C14436dlS.KWHzl.OLrzqt()) {
            return InterfaceC9759bbe.TaskDescription.AEQbTJ;
        }
        return InterfaceC9759bbe.StateListAnimator.OLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC9855bdU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Continuation<? super InterfaceC9762bbh> continuation) throws java.lang.Throwable {
        WalletSilentSignServiceImpl$requestUserAuthentication$1 walletSilentSignServiceImpl$requestUserAuthentication$1;
        java.lang.Object objM7377constructorimpl;
        java.lang.Object obj;
        if (continuation instanceof WalletSilentSignServiceImpl$requestUserAuthentication$1) {
            walletSilentSignServiceImpl$requestUserAuthentication$1 = (WalletSilentSignServiceImpl$requestUserAuthentication$1) continuation;
            int i = walletSilentSignServiceImpl$requestUserAuthentication$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletSilentSignServiceImpl$requestUserAuthentication$1.label = i - Integer.MIN_VALUE;
            } else {
                walletSilentSignServiceImpl$requestUserAuthentication$1 = new WalletSilentSignServiceImpl$requestUserAuthentication$1(this, continuation);
            }
        }
        java.lang.Object result = walletSilentSignServiceImpl$requestUserAuthentication$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletSilentSignServiceImpl$requestUserAuthentication$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(result);
                Result.Application application = Result.Companion;
                walletSilentSignServiceImpl$requestUserAuthentication$1.L$0 = fragmentManager;
                walletSilentSignServiceImpl$requestUserAuthentication$1.L$1 = walletSilentSignServiceImpl$requestUserAuthentication$1;
                walletSilentSignServiceImpl$requestUserAuthentication$1.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(walletSilentSignServiceImpl$requestUserAuthentication$1), 1);
                cancellableContinuationImpl.initCancellability();
                new C14461dlr(fragmentManager, "requestUserAuthentication", new TaskDescription(cancellableContinuationImpl), new StateListAnimator(cancellableContinuationImpl), null, false, 48, null).EZpvd();
                result = cancellableContinuationImpl.getResult();
                if (result == C56442yFn.copydefault()) {
                    C56447yFs.copydefault(walletSilentSignServiceImpl$requestUserAuthentication$1);
                }
                if (result == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(result);
            }
            if (((java.lang.Boolean) ((kotlin.Pair) result).component2()).booleanValue()) {
                obj = InterfaceC9762bbh.Application.OLrzqt;
            } else {
                obj = InterfaceC9762bbh.TaskDescription.AEQbTJ;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(obj);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return objM7377constructorimpl;
        }
        pUU.AEQbTJ("WalletSilentSignServiceImpl", "requestUserAuthentication failed", thM7380exceptionOrNullimpl);
        return new InterfaceC9762bbh.StateListAnimator(C33070mpX.AYXKKw(C13754dXa.FragmentManager.IMediaSessionStubProxy));
    }

    /* JADX INFO: renamed from: o.daz$StateListAnimator */
    public static final class StateListAnimator implements Function0<Unit> {
        public final /* synthetic */ CancellableContinuation<kotlin.Pair<java.lang.String, java.lang.Boolean>> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Pair<java.lang.String, java.lang.Boolean>> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(CancellableContinuation<? super kotlin.Pair<java.lang.String, java.lang.Boolean>> cancellableContinuation) {
            this.copydefault = cancellableContinuation;
        }

        public final void EZpvd() {
            if (this.copydefault.isActive()) {
                CancellableContinuation<kotlin.Pair<java.lang.String, java.lang.Boolean>> cancellableContinuation = this.copydefault;
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

    /* JADX INFO: renamed from: o.daz$TaskDescription */
    public static final class TaskDescription implements Function1<java.lang.String, Unit> {
        public final /* synthetic */ CancellableContinuation<kotlin.Pair<java.lang.String, java.lang.Boolean>> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Pair<java.lang.String, java.lang.Boolean>> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(CancellableContinuation<? super kotlin.Pair<java.lang.String, java.lang.Boolean>> cancellableContinuation) {
            this.AEQbTJ = cancellableContinuation;
        }

        public final void OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            if (this.AEQbTJ.isActive()) {
                CancellableContinuation<kotlin.Pair<java.lang.String, java.lang.Boolean>> cancellableContinuation = this.AEQbTJ;
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
