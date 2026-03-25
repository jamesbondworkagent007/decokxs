package o;

import com.okinc.im.usecase.group.members.RemoveGroupMembersUseCase$invoke$1;
import com.okinc.im.usecase.group.members.RemoveGroupMembersUseCase$invoke$2$1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDV {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final sIR KWHzl;

    @yCM
    public oDV(@NotNull sIR sir, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(sir, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = sir;
        this.AEQbTJ = coroutineDispatcher;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oDV.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oDV.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class ActionBar extends Application {
            public static final ActionBar KWHzl = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        private Application() {
        }

        public static final class StateListAnimator extends Application {
            public final java.lang.Throwable EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = stateListAnimator.EZpvd;
                }
                return stateListAnimator.KWHzl(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new StateListAnimator(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.EZpvd, ((StateListAnimator) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failed(error=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.EZpvd = th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Application> continuation) throws java.lang.Throwable {
        RemoveGroupMembersUseCase$invoke$1 removeGroupMembersUseCase$invoke$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof RemoveGroupMembersUseCase$invoke$1) {
            removeGroupMembersUseCase$invoke$1 = (RemoveGroupMembersUseCase$invoke$1) continuation;
            int i = removeGroupMembersUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                removeGroupMembersUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                removeGroupMembersUseCase$invoke$1 = new RemoveGroupMembersUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object obj = removeGroupMembersUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = removeGroupMembersUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                CoroutineDispatcher coroutineDispatcher = this.AEQbTJ;
                RemoveGroupMembersUseCase$invoke$2$1 removeGroupMembersUseCase$invoke$2$1 = new RemoveGroupMembersUseCase$invoke$2$1(this, str, list, null);
                removeGroupMembersUseCase$invoke$1.L$0 = str;
                removeGroupMembersUseCase$invoke$1.label = 1;
                if (BuildersKt.withContext(coroutineDispatcher, removeGroupMembersUseCase$invoke$2$1, removeGroupMembersUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) removeGroupMembersUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Application.ActionBar.KWHzl);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return objM7377constructorimpl;
        }
        pUU.AEQbTJ("RemoveGroupMembersUseCase", "Failed to remove members from group " + str, thM7380exceptionOrNullimpl);
        return new Application.StateListAnimator(thM7380exceptionOrNullimpl);
    }
}
