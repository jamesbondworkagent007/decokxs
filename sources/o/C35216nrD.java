package o;

import com.okinc.im.call.model.CallDirection;
import com.okinc.im.call.model.CallStateV2;
import com.okinc.im.call.model.DisconnectReason;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC35264nrz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nrD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35216nrD {
    public static final C35216nrD AEQbTJ = new C35216nrD();

    /* JADX INFO: renamed from: o.nrD$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CallDirection.values().length];
            try {
                iArr[CallDirection.OUTGOING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CallDirection.INCOMING.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    private C35216nrD() {
    }

    public final Activity OLrzqt(@NotNull CallStateV2 callStateV2, @NotNull AbstractC35264nrz abstractC35264nrz) {
        Intrinsics.checkNotNullParameter(callStateV2, "");
        Intrinsics.checkNotNullParameter(abstractC35264nrz, "");
        if (callStateV2 instanceof CallStateV2.Idle) {
            return AEQbTJ((CallStateV2.Idle) callStateV2, abstractC35264nrz);
        }
        if (callStateV2 instanceof CallStateV2.Ringing) {
            return EZpvd((CallStateV2.Ringing) callStateV2, abstractC35264nrz);
        }
        if (callStateV2 instanceof CallStateV2.Connecting) {
            return EZpvd((CallStateV2.Connecting) callStateV2, abstractC35264nrz);
        }
        if (callStateV2 instanceof CallStateV2.Connected) {
            return OLrzqt((CallStateV2.Connected) callStateV2, abstractC35264nrz);
        }
        if (callStateV2 instanceof CallStateV2.Disconnected) {
            return copydefault((CallStateV2.Disconnected) callStateV2, abstractC35264nrz);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Activity AEQbTJ(CallStateV2.Idle idle, AbstractC35264nrz abstractC35264nrz) {
        if (abstractC35264nrz instanceof AbstractC35264nrz.LoaderManager) {
            return new Activity.TaskDescription(new CallStateV2.Ringing(((AbstractC35264nrz.LoaderManager) abstractC35264nrz).AEQbTJ(), CallDirection.OUTGOING, 0L, 4, (DefaultConstructorMarker) null));
        }
        if (abstractC35264nrz instanceof AbstractC35264nrz.Application) {
            return new Activity.TaskDescription(new CallStateV2.Ringing(((AbstractC35264nrz.Application) abstractC35264nrz).copydefault(), CallDirection.INCOMING, 0L, 4, (DefaultConstructorMarker) null));
        }
        return abstractC35264nrz instanceof AbstractC35264nrz.ClipData ? new Activity.Application(idle) : copydefault(idle, abstractC35264nrz);
    }

    public final Activity EZpvd(CallStateV2.Ringing ringing, AbstractC35264nrz abstractC35264nrz) {
        Activity activityOLrzqt;
        int i = StateListAnimator.copydefault[ringing.valueOf().ordinal()];
        if (i == 1) {
            activityOLrzqt = OLrzqt(ringing, abstractC35264nrz);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            activityOLrzqt = AEQbTJ(ringing, abstractC35264nrz);
        }
        return activityOLrzqt == null ? copydefault(ringing, abstractC35264nrz) : activityOLrzqt;
    }

    public final Activity OLrzqt(CallStateV2.Ringing ringing, AbstractC35264nrz abstractC35264nrz) {
        if (abstractC35264nrz instanceof AbstractC35264nrz.VoiceInteractor) {
            return new Activity.TaskDescription(new CallStateV2.Connecting(ringing.djBIcL(), ringing.valueOf()));
        }
        if (abstractC35264nrz instanceof AbstractC35264nrz.PendingIntent) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(ringing.djBIcL(), DisconnectReason.LOCAL_CANCEL, (java.lang.Long) null, 4, (DefaultConstructorMarker) null));
        }
        if (abstractC35264nrz instanceof AbstractC35264nrz.AssistContent) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(ringing.djBIcL(), DisconnectReason.REMOTE_REJECT, (java.lang.Long) null, 4, (DefaultConstructorMarker) null));
        }
        return null;
    }

    public final Activity AEQbTJ(CallStateV2.Ringing ringing, AbstractC35264nrz abstractC35264nrz) {
        if (abstractC35264nrz instanceof AbstractC35264nrz.Dialog) {
            return new Activity.TaskDescription(new CallStateV2.Connecting(ringing.djBIcL(), ringing.valueOf()));
        }
        if (abstractC35264nrz instanceof AbstractC35264nrz.Fragment) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(ringing.djBIcL(), DisconnectReason.LOCAL_REJECT, (java.lang.Long) null, 4, (DefaultConstructorMarker) null));
        }
        if (abstractC35264nrz instanceof AbstractC35264nrz.SharedElementCallback) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(ringing.djBIcL(), DisconnectReason.REMOTE_CANCEL, (java.lang.Long) null, 4, (DefaultConstructorMarker) null));
        }
        if (abstractC35264nrz instanceof AbstractC35264nrz.ActionBar) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(ringing.djBIcL(), DisconnectReason.ACCEPTED_ON_OTHER_DEVICE, (java.lang.Long) null, 4, (DefaultConstructorMarker) null));
        }
        return null;
    }

    public final Activity copydefault(CallStateV2.Ringing ringing, AbstractC35264nrz abstractC35264nrz) {
        if (abstractC35264nrz instanceof AbstractC35264nrz.ComponentCallbacks2) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(ringing.djBIcL(), DisconnectReason.NO_ANSWER, (java.lang.Long) null, 4, (DefaultConstructorMarker) null));
        }
        if (abstractC35264nrz instanceof AbstractC35264nrz.PictureInPictureParams) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(ringing.djBIcL(), DisconnectReason.NETWORK_ERROR, (java.lang.Long) null, 4, (DefaultConstructorMarker) null));
        }
        if (abstractC35264nrz instanceof AbstractC35264nrz.Activity) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(ringing.djBIcL(), DisconnectReason.UNKNOWN, (java.lang.Long) null, 4, (DefaultConstructorMarker) null));
        }
        if ((abstractC35264nrz instanceof AbstractC35264nrz.TaskDescription) || (abstractC35264nrz instanceof AbstractC35264nrz.ComponentName)) {
            return new Activity.Application(ringing);
        }
        return copydefault((CallStateV2) ringing, abstractC35264nrz);
    }

    public final Activity EZpvd(CallStateV2.Connecting connecting, AbstractC35264nrz abstractC35264nrz) {
        if (abstractC35264nrz instanceof AbstractC35264nrz.TaskDescription) {
            return new Activity.TaskDescription(new CallStateV2.Connected(connecting.AYXKKw(), 0L, 2, (DefaultConstructorMarker) null));
        }
        if ((abstractC35264nrz instanceof AbstractC35264nrz.Activity) || (abstractC35264nrz instanceof AbstractC35264nrz.StateListAnimator)) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(connecting.AYXKKw(), DisconnectReason.AGORA_ERROR, (java.lang.Long) null, 4, (DefaultConstructorMarker) null));
        }
        if (abstractC35264nrz instanceof AbstractC35264nrz.PictureInPictureParams) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(connecting.AYXKKw(), DisconnectReason.NETWORK_ERROR, (java.lang.Long) null, 4, (DefaultConstructorMarker) null));
        }
        if (abstractC35264nrz instanceof AbstractC35264nrz.FragmentManager) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(connecting.AYXKKw(), DisconnectReason.LOCAL_HANGUP, (java.lang.Long) null, 4, (DefaultConstructorMarker) null));
        }
        if (abstractC35264nrz instanceof AbstractC35264nrz.PendingIntent) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(connecting.AYXKKw(), DisconnectReason.LOCAL_CANCEL, (java.lang.Long) null, 4, (DefaultConstructorMarker) null));
        }
        if (abstractC35264nrz instanceof AbstractC35264nrz.SharedElementCallback) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(connecting.AYXKKw(), DisconnectReason.REMOTE_CANCEL, (java.lang.Long) null, 4, (DefaultConstructorMarker) null));
        }
        if (abstractC35264nrz instanceof AbstractC35264nrz.TaskStackBuilder) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(connecting.AYXKKw(), DisconnectReason.REMOTE_HANGUP, (java.lang.Long) null, 4, (DefaultConstructorMarker) null));
        }
        return abstractC35264nrz instanceof AbstractC35264nrz.ComponentName ? new Activity.Application(connecting) : copydefault(connecting, abstractC35264nrz);
    }

    public final Activity OLrzqt(CallStateV2.Connected connected, AbstractC35264nrz abstractC35264nrz) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - connected.EZpvd();
        if (abstractC35264nrz instanceof AbstractC35264nrz.FragmentManager) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(connected.AYXKKw(), DisconnectReason.LOCAL_HANGUP, java.lang.Long.valueOf(jCurrentTimeMillis)));
        }
        if ((abstractC35264nrz instanceof AbstractC35264nrz.TaskStackBuilder) || (abstractC35264nrz instanceof AbstractC35264nrz.BroadcastReceiver)) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(connected.AYXKKw(), DisconnectReason.REMOTE_HANGUP, java.lang.Long.valueOf(jCurrentTimeMillis)));
        }
        if (abstractC35264nrz instanceof AbstractC35264nrz.PictureInPictureParams) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(connected.AYXKKw(), DisconnectReason.NETWORK_ERROR, java.lang.Long.valueOf(jCurrentTimeMillis)));
        }
        if ((abstractC35264nrz instanceof AbstractC35264nrz.StateListAnimator) || (abstractC35264nrz instanceof AbstractC35264nrz.Activity)) {
            return new Activity.TaskDescription(new CallStateV2.Disconnected(connected.AYXKKw(), DisconnectReason.AGORA_ERROR, java.lang.Long.valueOf(jCurrentTimeMillis)));
        }
        if ((abstractC35264nrz instanceof AbstractC35264nrz.ComponentName) || (abstractC35264nrz instanceof AbstractC35264nrz.TaskDescription)) {
            return new Activity.Application(connected);
        }
        return copydefault(connected, abstractC35264nrz);
    }

    public final Activity copydefault(CallStateV2.Disconnected disconnected, AbstractC35264nrz abstractC35264nrz) {
        return abstractC35264nrz instanceof AbstractC35264nrz.ClipData ? new Activity.TaskDescription(CallStateV2.Idle.INSTANCE) : copydefault((CallStateV2) disconnected, abstractC35264nrz);
    }

    public final Activity.StateListAnimator copydefault(CallStateV2 callStateV2, AbstractC35264nrz abstractC35264nrz) {
        return new Activity.StateListAnimator(callStateV2, abstractC35264nrz, "Invalid transition from " + C56524yIo.AEQbTJ(callStateV2.getClass()).valueOf() + " with " + C56524yIo.AEQbTJ(abstractC35264nrz.getClass()).valueOf());
    }

    /* JADX INFO: renamed from: o.nrD$Activity */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nrD.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: o.nrD$Activity$TaskDescription */
        public static final class TaskDescription extends Activity {
            public final CallStateV2 AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, CallStateV2 callStateV2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    callStateV2 = taskDescription.AEQbTJ;
                }
                return taskDescription.AEQbTJ(callStateV2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription AEQbTJ(@NotNull CallStateV2 callStateV2) {
                Intrinsics.checkNotNullParameter(callStateV2, "");
                return new TaskDescription(callStateV2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CallStateV2 KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.AEQbTJ, ((TaskDescription) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Valid(newState=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull CallStateV2 callStateV2) {
                super(null);
                Intrinsics.checkNotNullParameter(callStateV2, "");
                this.AEQbTJ = callStateV2;
            }
        }

        /* JADX INFO: renamed from: o.nrD$Activity$Application */
        public static final class Application extends Activity {
            public final CallStateV2 AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, CallStateV2 callStateV2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    callStateV2 = application.AEQbTJ;
                }
                return application.copydefault(callStateV2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(@NotNull CallStateV2 callStateV2) {
                Intrinsics.checkNotNullParameter(callStateV2, "");
                return new Application(callStateV2);
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
                return "NoOp(currentState=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull CallStateV2 callStateV2) {
                super(null);
                Intrinsics.checkNotNullParameter(callStateV2, "");
                this.AEQbTJ = callStateV2;
            }
        }

        /* JADX INFO: renamed from: o.nrD$Activity$StateListAnimator */
        public static final class StateListAnimator extends Activity {
            public final java.lang.String AEQbTJ;
            public final CallStateV2 EZpvd;
            public final AbstractC35264nrz KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, CallStateV2 callStateV2, AbstractC35264nrz abstractC35264nrz, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    callStateV2 = stateListAnimator.EZpvd;
                }
                if ((i & 2) != 0) {
                    abstractC35264nrz = stateListAnimator.KWHzl;
                }
                if ((i & 4) != 0) {
                    str = stateListAnimator.AEQbTJ;
                }
                return stateListAnimator.OLrzqt(callStateV2, abstractC35264nrz, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(@NotNull CallStateV2 callStateV2, @NotNull AbstractC35264nrz abstractC35264nrz, @NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(callStateV2, "");
                Intrinsics.checkNotNullParameter(abstractC35264nrz, "");
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(callStateV2, abstractC35264nrz, str);
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
                return Intrinsics.EZpvd(this.EZpvd, stateListAnimator.EZpvd) && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Invalid(currentState=" + this.EZpvd + ", event=" + this.KWHzl + ", reason=" + this.AEQbTJ + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull CallStateV2 callStateV2, @NotNull AbstractC35264nrz abstractC35264nrz, @NotNull java.lang.String str) {
                super(null);
                Intrinsics.checkNotNullParameter(callStateV2, "");
                Intrinsics.checkNotNullParameter(abstractC35264nrz, "");
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = callStateV2;
                this.KWHzl = abstractC35264nrz;
                this.AEQbTJ = str;
            }
        }
    }
}
