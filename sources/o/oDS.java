package o;

import com.okinc.im.usecase.group.join.UpdateJoinGroupReviewsUseCase$invoke$1;
import com.okinc.im.usecase.group.join.UpdateJoinGroupReviewsUseCase$invoke$2$1;
import com.okinc.okimcore.model.im.GroupActionFailReason;
import com.okinc.okimcore.model.remote.GroupJoinApplicationIdsRequest;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDS {
    public final sIR AEQbTJ;
    public final CoroutineDispatcher copydefault;

    @yCM
    public oDS(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull sIR sir) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(sir, "");
        this.copydefault = coroutineDispatcher;
        this.AEQbTJ = sir;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oDS.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static final class StateListAnimator extends Activity {
            public final java.util.List<java.lang.String> AEQbTJ;
            public final java.util.Map<GroupActionFailReason, java.util.List<java.lang.String>> KWHzl;
            public final boolean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.oDS$Activity$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.util.List list, boolean z, java.util.Map map, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = stateListAnimator.AEQbTJ;
                }
                if ((i & 2) != 0) {
                    z = stateListAnimator.OLrzqt;
                }
                if ((i & 4) != 0) {
                    map = stateListAnimator.KWHzl;
                }
                return stateListAnimator.OLrzqt(list, z, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.List<java.lang.String> AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.Map<GroupActionFailReason, java.util.List<java.lang.String>> EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(@NotNull java.util.List<java.lang.String> list, boolean z, @NotNull java.util.Map<GroupActionFailReason, ? extends java.util.List<java.lang.String>> map) {
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(map, "");
                return new StateListAnimator(list, z, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                StateListAnimator stateListAnimator = (StateListAnimator) obj;
                return Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ) && this.OLrzqt == stateListAnimator.OLrzqt && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.AEQbTJ.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success(reviewedIds=" + this.AEQbTJ + ", hasFailedUpdates=" + this.OLrzqt + ", failedReasons=" + this.KWHzl + ")";
            }

            /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.Map<com.okinc.okimcore.model.im.GroupActionFailReason, ? extends java.util.List<java.lang.String>> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public StateListAnimator(@NotNull java.util.List<java.lang.String> list, boolean z, @NotNull java.util.Map<GroupActionFailReason, ? extends java.util.List<java.lang.String>> map) {
                super(null);
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(map, "");
                this.AEQbTJ = list;
                this.OLrzqt = z;
                this.KWHzl = map;
            }
        }

        public static final class Application extends Activity {
            public final java.lang.Throwable AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = application.AEQbTJ;
                }
                return application.copydefault(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new Application(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.AEQbTJ, ((Application) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Error(error=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.AEQbTJ = th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(long j, @NotNull java.util.List<java.lang.String> list, boolean z, @NotNull Continuation<? super Activity> continuation) throws java.lang.Throwable {
        UpdateJoinGroupReviewsUseCase$invoke$1 updateJoinGroupReviewsUseCase$invoke$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof UpdateJoinGroupReviewsUseCase$invoke$1) {
            updateJoinGroupReviewsUseCase$invoke$1 = (UpdateJoinGroupReviewsUseCase$invoke$1) continuation;
            int i = updateJoinGroupReviewsUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateJoinGroupReviewsUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                updateJoinGroupReviewsUseCase$invoke$1 = new UpdateJoinGroupReviewsUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = updateJoinGroupReviewsUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = updateJoinGroupReviewsUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                Result.Application application = Result.Companion;
                GroupJoinApplicationIdsRequest groupJoinApplicationIdsRequest = new GroupJoinApplicationIdsRequest(j, list);
                CoroutineDispatcher coroutineDispatcher = this.copydefault;
                UpdateJoinGroupReviewsUseCase$invoke$2$1 updateJoinGroupReviewsUseCase$invoke$2$1 = new UpdateJoinGroupReviewsUseCase$invoke$2$1(z, this, groupJoinApplicationIdsRequest, null);
                updateJoinGroupReviewsUseCase$invoke$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, updateJoinGroupReviewsUseCase$invoke$2$1, updateJoinGroupReviewsUseCase$invoke$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Activity.StateListAnimator) objWithContext);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            return objM7377constructorimpl;
        }
        C44124sEe.AYXKKw("UpdateJoinGroupReviewsUseCase: Error submitting join group reviews", thM7380exceptionOrNullimpl);
        return new Activity.Application(thM7380exceptionOrNullimpl);
    }
}
