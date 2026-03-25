package o;

import com.okinc.okimcore.model.im.inhouseim.ws.WSJoinLiveStream;
import com.okinc.okimcore.model.im.inhouseim.ws.WSJoinLiveStreamAck;
import com.okinc.okimcore.model.im.inhouseim.ws.WSLeaveLiveStream;
import com.okinc.okimcore.model.im.inhouseim.ws.WSLeaveLiveStreamAck;
import com.okinc.okimcore.usecase.LiveStreamUseCase$joinLiveStream$1;
import com.okinc.okimcore.usecase.LiveStreamUseCase$leaveLiveStream$1;
import com.okinc.okimcore.usecase.LiveStreamUseCase$sendJoinLiveStreamRequest$1;
import com.okinc.okimcore.usecase.LiveStreamUseCase$sendLeaveLiveStreamRequest$1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44499sSb {
    public final C44489sRs EZpvd;

    @yCM
    public C44499sSb(@NotNull C44489sRs c44489sRs) {
        Intrinsics.checkNotNullParameter(c44489sRs, "");
        this.EZpvd = c44489sRs;
    }

    /* JADX INFO: renamed from: o.sSb$Activity */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sSb.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: o.sSb$Activity$Application */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class Application extends Activity {
            public static final Application OLrzqt = new Application();

            private Application() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.sSb$Activity$TaskDescription */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class TaskDescription extends Activity {
            public final java.lang.Throwable AEQbTJ;
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = taskDescription.copydefault;
                }
                if ((i & 2) != 0) {
                    th = taskDescription.AEQbTJ;
                }
                return taskDescription.KWHzl(str, th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(@NotNull java.lang.String str, java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(str, "");
                return new TaskDescription(str, th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, taskDescription.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.copydefault.hashCode();
                java.lang.Throwable th = this.AEQbTJ;
                return (iHashCode * 31) + (th == null ? 0 : th.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failed(message=" + this.copydefault + ", throwable=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull java.lang.String str, java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = str;
                this.AEQbTJ = th;
            }
        }
    }

    public final Flow<Activity> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flow(new LiveStreamUseCase$joinLiveStream$1(this, str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(WSJoinLiveStream wSJoinLiveStream, Continuation<? super WSJoinLiveStreamAck> continuation) throws java.lang.Throwable {
        LiveStreamUseCase$sendJoinLiveStreamRequest$1 liveStreamUseCase$sendJoinLiveStreamRequest$1;
        if (continuation instanceof LiveStreamUseCase$sendJoinLiveStreamRequest$1) {
            liveStreamUseCase$sendJoinLiveStreamRequest$1 = (LiveStreamUseCase$sendJoinLiveStreamRequest$1) continuation;
            int i = liveStreamUseCase$sendJoinLiveStreamRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liveStreamUseCase$sendJoinLiveStreamRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                liveStreamUseCase$sendJoinLiveStreamRequest$1 = new LiveStreamUseCase$sendJoinLiveStreamRequest$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = liveStreamUseCase$sendJoinLiveStreamRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = liveStreamUseCase$sendJoinLiveStreamRequest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            this.EZpvd.OLrzqt();
            C44489sRs c44489sRs = this.EZpvd;
            liveStreamUseCase$sendJoinLiveStreamRequest$1.label = 1;
            objKWHzl = c44489sRs.KWHzl(wSJoinLiveStream, liveStreamUseCase$sendJoinLiveStreamRequest$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        WSJoinLiveStreamAck wSJoinLiveStreamAck = (WSJoinLiveStreamAck) objKWHzl;
        if (wSJoinLiveStreamAck != null) {
            return wSJoinLiveStreamAck;
        }
        throw new java.lang.IllegalArgumentException("join livestream => ack is null".toString());
    }

    /* JADX INFO: renamed from: o.sSb$TaskDescription */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sSb.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        /* JADX INFO: renamed from: o.sSb$TaskDescription$StateListAnimator */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class StateListAnimator extends TaskDescription {
            public final WSLeaveLiveStreamAck OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, WSLeaveLiveStreamAck wSLeaveLiveStreamAck, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    wSLeaveLiveStreamAck = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.KWHzl(wSLeaveLiveStreamAck);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull WSLeaveLiveStreamAck wSLeaveLiveStreamAck) {
                Intrinsics.checkNotNullParameter(wSLeaveLiveStreamAck, "");
                return new StateListAnimator(wSLeaveLiveStreamAck);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.OLrzqt, ((StateListAnimator) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Left(ack=" + this.OLrzqt + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull WSLeaveLiveStreamAck wSLeaveLiveStreamAck) {
                super(null);
                Intrinsics.checkNotNullParameter(wSLeaveLiveStreamAck, "");
                this.OLrzqt = wSLeaveLiveStreamAck;
            }
        }

        /* JADX INFO: renamed from: o.sSb$TaskDescription$Application */
        /* JADX INFO: loaded from: classes19.dex */
        public static final class Application extends TaskDescription {
            public final java.lang.Throwable KWHzl;
            public final java.lang.String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = application.OLrzqt;
                }
                if ((i & 2) != 0) {
                    th = application.KWHzl;
                }
                return application.AEQbTJ(str, th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(@NotNull java.lang.String str, java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Application(str, th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.OLrzqt.hashCode();
                java.lang.Throwable th = this.KWHzl;
                return (iHashCode * 31) + (th == null ? 0 : th.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Failed(message=" + this.OLrzqt + ", throwable=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull java.lang.String str, java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
                this.KWHzl = th;
            }
        }
    }

    public final Flow<TaskDescription> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flow(new LiveStreamUseCase$leaveLiveStream$1(this, str, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(WSLeaveLiveStream wSLeaveLiveStream, Continuation<? super WSLeaveLiveStreamAck> continuation) throws java.lang.Throwable {
        LiveStreamUseCase$sendLeaveLiveStreamRequest$1 liveStreamUseCase$sendLeaveLiveStreamRequest$1;
        if (continuation instanceof LiveStreamUseCase$sendLeaveLiveStreamRequest$1) {
            liveStreamUseCase$sendLeaveLiveStreamRequest$1 = (LiveStreamUseCase$sendLeaveLiveStreamRequest$1) continuation;
            int i = liveStreamUseCase$sendLeaveLiveStreamRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                liveStreamUseCase$sendLeaveLiveStreamRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                liveStreamUseCase$sendLeaveLiveStreamRequest$1 = new LiveStreamUseCase$sendLeaveLiveStreamRequest$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = liveStreamUseCase$sendLeaveLiveStreamRequest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = liveStreamUseCase$sendLeaveLiveStreamRequest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            this.EZpvd.OLrzqt();
            C44489sRs c44489sRs = this.EZpvd;
            liveStreamUseCase$sendLeaveLiveStreamRequest$1.label = 1;
            objKWHzl = c44489sRs.KWHzl(wSLeaveLiveStream, liveStreamUseCase$sendLeaveLiveStreamRequest$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        WSLeaveLiveStreamAck wSLeaveLiveStreamAck = (WSLeaveLiveStreamAck) objKWHzl;
        if (wSLeaveLiveStreamAck != null) {
            return wSLeaveLiveStreamAck;
        }
        throw new java.lang.IllegalArgumentException("leave livestream => ack is null".toString());
    }
}
