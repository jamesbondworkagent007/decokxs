package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.math.RoundingMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dyH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15114dyH {
    public static final boolean AEQbTJ(long j) {
        return j == 0 || j == 70000061 || j == 70000038 || j == 70000047;
    }

    public static final boolean AEQbTJ() {
        return Intrinsics.EZpvd((java.lang.Object) AEQbTJ("checkJsChain", "2"), (java.lang.Object) "2");
    }

    public static final java.lang.String AEQbTJ(java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str2, "");
        JsonObject jsonObjectAEQbTJ = C48787ucK.AEQbTJ.AEQbTJ("mlnconfig");
        if (jsonObjectAEQbTJ == null) {
            return str2;
        }
        JsonElement jsonElement = jsonObjectAEQbTJ.get(str);
        if (android.text.TextUtils.isEmpty(jsonElement != null ? jsonElement.getAsString() : null)) {
            return str2;
        }
        java.lang.String asString = jsonObjectAEQbTJ.get(str).getAsString();
        Intrinsics.copydefault((java.lang.Object) asString);
        return asString;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.dyH$Activity */
    public static final class Activity<T> implements Function1<T, Unit> {
        public final /* synthetic */ CancellableContinuation<T> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(CancellableContinuation<? super T> cancellableContinuation) {
            this.OLrzqt = cancellableContinuation;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Object obj) {
            EZpvd(obj);
            return Unit.INSTANCE;
        }

        public final void EZpvd(T t) {
            CancellableContinuation<T> cancellableContinuation = this.OLrzqt;
            Result.Application application = Result.Companion;
            cancellableContinuation.resumeWith(Result.m7377constructorimpl(t));
        }
    }

    /* JADX INFO: renamed from: o.dyH$Application */
    public static final class Application implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ CancellableContinuation<T> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(CancellableContinuation<? super T> cancellableContinuation) {
            this.AEQbTJ = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            OLrzqt(th);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(java.lang.Throwable th) {
            Continuation continuation = this.AEQbTJ;
            Result.Application application = Result.Companion;
            Intrinsics.copydefault(th);
            continuation.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(th)));
        }
    }

    /* JADX INFO: renamed from: o.dyH$TaskDescription */
    public static final class TaskDescription implements Function1<java.lang.Throwable, Unit> {
        public final /* synthetic */ InterfaceC58217yxC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(InterfaceC58217yxC interfaceC58217yxC) {
            this.copydefault = interfaceC58217yxC;
        }

        public final void OLrzqt(java.lang.Throwable th) {
            this.copydefault.dispose();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            OLrzqt(th);
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ java.lang.String formatBigNumber$default(java.lang.String str, RoundingMode roundingMode, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            roundingMode = RoundingMode.DOWN;
        }
        return EZpvd(str, roundingMode);
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull RoundingMode roundingMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(roundingMode, "");
        return str.length() == 0 ? "0" : pTB.formatICUCompact$default(C33129mqd.EZpvd(str), roundingMode, C38307pTy.Companion.KWHzl(0, 2), null, null, 12, null);
    }

    public static final <T> java.lang.Object AEQbTJ(@NotNull AbstractC58185ywX<T> abstractC58185ywX, @NotNull Continuation<? super T> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new TaskDescription(abstractC58185ywX.AEQbTJ(new InterfaceC58227yxM(new Activity(cancellableContinuationImpl)) { // from class: o.dyH.StateListAnimator
            public final /* synthetic */ Function1 copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                Intrinsics.checkNotNullParameter(function1, "");
                this.copydefault = function1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final /* synthetic */ void accept(java.lang.Object obj) {
                this.copydefault.invoke(obj);
            }
        }, new InterfaceC58227yxM(new Application(cancellableContinuationImpl)) { // from class: o.dyH.StateListAnimator
            public final /* synthetic */ Function1 copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                Intrinsics.checkNotNullParameter(function1, "");
                this.copydefault = function1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final /* synthetic */ void accept(java.lang.Object obj) {
                this.copydefault.invoke(obj);
            }
        })));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }
}
