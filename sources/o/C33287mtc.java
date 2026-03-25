package o;

import com.okinc.components.track.ABTestManager;
import com.okinc.okuser.data.User;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mtc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33287mtc {
    public final InterfaceC47278tmy EZpvd;

    @yCM
    public C33287mtc(@NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        this.EZpvd = interfaceC47278tmy;
    }

    /* JADX INFO: renamed from: o.mtc$Application */
    public static final class Application implements Function1<java.lang.Boolean, Unit> {
        public final /* synthetic */ CancellableContinuation<Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(CancellableContinuation<? super Unit> cancellableContinuation) {
            this.OLrzqt = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Boolean bool) {
            AEQbTJ(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(boolean z) {
            pUU.KWHzl("ConfigManager", "ABTestManager.refreshCefiFlagsWithLoginChange: " + z);
            CancellableContinuation<Unit> cancellableContinuation = this.OLrzqt;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
        }
    }

    public final java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) {
        java.lang.String tk;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        ABTestManager aBTestManager = ABTestManager.AEQbTJ;
        User userOLrzqt = this.EZpvd.OLrzqt();
        if (userOLrzqt == null || (tk = userOLrzqt.getTk()) == null) {
            tk = "";
        }
        ABTestManager.refreshCefiFlagsWithLoginChange$default(aBTestManager, tk, 0L, new Application(cancellableContinuationImpl), 2, null);
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result == C56442yFn.copydefault() ? result : Unit.INSTANCE;
    }
}
