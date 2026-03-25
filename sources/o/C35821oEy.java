package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35821oEy {
    public final sKH KWHzl;

    @yCM
    public C35821oEy(@NotNull sKH skh) {
        Intrinsics.checkNotNullParameter(skh, "");
        this.KWHzl = skh;
    }

    public final java.lang.Object EZpvd(@NotNull OKMessage oKMessage, @NotNull Continuation<? super OKMessage> continuation) {
        java.lang.Object objM7377constructorimpl;
        C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        try {
            Result.Application application = Result.Companion;
            this.KWHzl.KWHzl(oKMessage, new Application(c56434yFf));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            Result.Application application3 = Result.Companion;
            c56434yFf.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(thM7380exceptionOrNullimpl)));
        }
        java.lang.Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl;
    }

    /* JADX INFO: renamed from: o.oEy$Application */
    public static final class Application implements InterfaceC44289sKh {
        public final /* synthetic */ Continuation<OKMessage> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC44289sKh
        public void copydefault(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super com.okinc.okimcore.model.im.OKMessage> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(Continuation<? super OKMessage> continuation) {
            this.EZpvd = continuation;
        }

        @Override // o.InterfaceC44289sKh
        public void AEQbTJ(OKMessage oKMessage) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Continuation<OKMessage> continuation = this.EZpvd;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(oKMessage));
        }

        @Override // o.InterfaceC44289sKh
        public void OLrzqt(OKMessage oKMessage, java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(oKMessage, "");
            Intrinsics.checkNotNullParameter(th, "");
            Continuation<OKMessage> continuation = this.EZpvd;
            Result.Application application = Result.Companion;
            continuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(th)));
        }
    }
}
