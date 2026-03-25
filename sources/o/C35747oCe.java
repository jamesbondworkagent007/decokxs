package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.im.imui.messageV2.model.StringResource;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35747oCe {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final android.content.Context AEQbTJ;
    public final C36576oda copydefault;

    @yCM
    public C35747oCe(@NotNull C36576oda c36576oda, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(c36576oda, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = c36576oda;
        this.AEQbTJ = context;
    }

    /* JADX INFO: renamed from: o.oCe$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oCe.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.oCe$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public static abstract class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oCe.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.oCe$ActionBar$Activity */
        public static final class Activity extends ActionBar {
            public static final Activity OLrzqt = new Activity();

            private Activity() {
                super(null);
            }
        }

        private ActionBar() {
        }

        /* JADX INFO: renamed from: o.oCe$ActionBar$Application */
        public static final class Application extends ActionBar {
            public static final Application OLrzqt = new Application();

            private Application() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: o.oCe$ActionBar$StateListAnimator */
        public static final class StateListAnimator extends ActionBar {
            public final StringResource KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, StringResource stringResource, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    stringResource = stateListAnimator.KWHzl;
                }
                return stateListAnimator.KWHzl(stringResource);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull StringResource stringResource) {
                Intrinsics.checkNotNullParameter(stringResource, "");
                return new StateListAnimator(stringResource);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StringResource OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Toast(res=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull StringResource stringResource) {
                super(null);
                Intrinsics.checkNotNullParameter(stringResource, "");
                this.KWHzl = stringResource;
            }
        }

        /* JADX INFO: renamed from: o.oCe$ActionBar$TaskDescription */
        public static final class TaskDescription extends ActionBar {
            public static final int AEQbTJ = C35254nrp.EZpvd;
            public final C35254nrp copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, C35254nrp c35254nrp, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    c35254nrp = taskDescription.copydefault;
                }
                return taskDescription.EZpvd(c35254nrp);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C35254nrp AEQbTJ() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription EZpvd(@NotNull C35254nrp c35254nrp) {
                Intrinsics.checkNotNullParameter(c35254nrp, "");
                return new TaskDescription(c35254nrp);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.copydefault, ((TaskDescription) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "PlayAudio(message=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull C35254nrp c35254nrp) {
                super(null);
                Intrinsics.checkNotNullParameter(c35254nrp, "");
                this.copydefault = c35254nrp;
            }
        }
    }

    public final java.lang.Object KWHzl(@NotNull C36558odI c36558odI, @NotNull OKMessage oKMessage, @NotNull Continuation<? super java.util.List<? extends ActionBar>> continuation) {
        java.lang.Object next;
        C36576oda c36576oda = this.copydefault;
        C43246rlf c43246rlf = C43246rlf.OLrzqt;
        boolean zEZpvd = c36576oda.EZpvd(c43246rlf.valueOf());
        boolean zCopydefault = this.copydefault.copydefault(c43246rlf.valueOf());
        if (!zEZpvd && zCopydefault) {
            return C56402yEa.EZpvd(new ActionBar.StateListAnimator(new StringResource.Res(C35399nuc.LoaderManager.dcEsSD)));
        }
        if (Intrinsics.EZpvd((java.lang.Object) oKMessage.getTargetId(), (java.lang.Object) c36558odI.OLrzqt().getTargetId())) {
            long seq = oKMessage.getSeq();
            java.util.Iterator<T> it = c36558odI.AEQbTJ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C35254nrp) next).OLrzqt().getSeq() == seq) {
                    break;
                }
            }
            C35254nrp c35254nrp = (C35254nrp) next;
            OKMessage oKMessageOLrzqt = c35254nrp != null ? c35254nrp.OLrzqt() : null;
            if (oKMessageOLrzqt != null) {
                if (this.copydefault.AYXKKw()) {
                    if (Intrinsics.EZpvd(this.copydefault.djBIcL(), C44169sFw.OLrzqt(oKMessageOLrzqt, this.AEQbTJ))) {
                        pUU.KWHzl("PlayAudioActionUseCase", "[" + oKMessage.getTargetId() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessage.getSeq() + "] onPause");
                        return C56402yEa.EZpvd(ActionBar.Activity.OLrzqt);
                    }
                    pUU.KWHzl("PlayAudioActionUseCase", "[" + oKMessage.getTargetId() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessage.getSeq() + "] onStopAndPlay");
                    return yDY.gEmmrt(ActionBar.Application.OLrzqt, new ActionBar.TaskDescription(c35254nrp));
                }
                if (Intrinsics.EZpvd(this.copydefault.djBIcL(), C44169sFw.OLrzqt(oKMessageOLrzqt, this.AEQbTJ))) {
                    pUU.KWHzl("PlayAudioActionUseCase", "[" + oKMessage.getTargetId() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessage.getSeq() + "] onPlay");
                    return C56402yEa.EZpvd(new ActionBar.TaskDescription(c35254nrp));
                }
                pUU.KWHzl("PlayAudioActionUseCase", "[" + oKMessage.getTargetId() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + oKMessage.getSeq() + "] onStopAndPlay");
                return yDY.gEmmrt(ActionBar.Application.OLrzqt, new ActionBar.TaskDescription(c35254nrp));
            }
            return yDY.AhwBna();
        }
        return yDY.AhwBna();
    }
}
