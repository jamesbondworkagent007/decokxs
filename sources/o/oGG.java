package o;

import com.okinc.okimcore.model.im.OKMessage;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oGG {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final oGH copydefault;

    @yCM
    public oGG(@NotNull oGH ogh) {
        Intrinsics.checkNotNullParameter(ogh, "");
        this.copydefault = ogh;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGG.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.oGH.execute$default(o.oGH, com.okinc.okimcore.model.im.OKMessage, java.util.List, java.lang.Long, java.lang.String, java.lang.Boolean, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Boolean, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    public final java.lang.Object AEQbTJ(@NotNull C36558odI c36558odI, @NotNull OKMessage oKMessage, @NotNull java.util.List<OKMessage> list, ActionBar actionBar, Application application, java.lang.Boolean bool, TaskDescription taskDescription, StateListAnimator stateListAnimator, @NotNull Continuation<? super C35254nrp> continuation) {
        java.lang.Long lKWHzl;
        java.lang.Integer numFetchVPNInfo;
        if (actionBar != null) {
            lKWHzl = actionBar.KWHzl();
        } else {
            OKMessage oKMessageAkhnZx = c36558odI.AkhnZx();
            lKWHzl = oKMessageAkhnZx != null ? C56443yFo.KWHzl(oKMessageAkhnZx.getSeq()) : null;
        }
        return this.copydefault.EZpvd(oKMessage, (256 & 2) != 0 ? yDY.AhwBna() : list, (256 & 4) != 0 ? null : lKWHzl, (256 & 8) != 0 ? null : application != null ? application.EZpvd() : c36558odI.gEmmrt(), (256 & 16) != 0 ? null : bool, (256 & 32) != 0 ? null : taskDescription != null ? taskDescription.KWHzl() : c36558odI.AYXKKw(), (256 & 64) != 0 ? null : stateListAnimator != null ? stateListAnimator.AEQbTJ() : c36558odI.copydefault(), (256 & 128) != 0 ? 0 : C56443yFo.AEQbTJ((stateListAnimator == null ? (numFetchVPNInfo = c36558odI.fetchVPNInfo()) == null : (numFetchVPNInfo = stateListAnimator.EZpvd()) == null) ? 0 : numFetchVPNInfo.intValue()), (256 & 256) != 0 ? null : null, continuation);
    }

    public static final class TaskDescription {
        public final java.lang.Long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.Long l, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = taskDescription.OLrzqt;
            }
            return taskDescription.OLrzqt(l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(java.lang.Long l) {
            return new TaskDescription(l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.OLrzqt, ((TaskDescription) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Long l = this.OLrzqt;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SendStatus(seq=" + this.OLrzqt + ")";
        }

        public TaskDescription(java.lang.Long l) {
            this.OLrzqt = l;
        }
    }

    public static final class StateListAnimator {
        public final java.lang.Integer AEQbTJ;
        public final java.lang.Long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.Long l, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = stateListAnimator.KWHzl;
            }
            if ((i & 2) != 0) {
                num = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.AEQbTJ(l, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(java.lang.Long l, java.lang.Integer num) {
            return new StateListAnimator(l, num);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Long l = this.KWHzl;
            int iHashCode = l == null ? 0 : l.hashCode();
            java.lang.Integer num = this.AEQbTJ;
            return (iHashCode * 31) + (num != null ? num.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "UnreadIndicator(seq=" + this.KWHzl + ", indicatorCount=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(java.lang.Long l, java.lang.Integer num) {
            this.KWHzl = l;
            this.AEQbTJ = num;
        }
    }

    public static final class Application {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.copydefault;
            }
            return application.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(java.lang.String str) {
            return new Application(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((Application) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.copydefault;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SearchKey(searchKey=" + this.copydefault + ")";
        }

        public Application(java.lang.String str) {
            this.copydefault = str;
        }
    }

    public static final class ActionBar {
        public final java.lang.Long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.Long l, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                l = actionBar.KWHzl;
            }
            return actionBar.copydefault(l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Long KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(java.lang.Long l) {
            return new ActionBar(l);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.KWHzl, ((ActionBar) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.Long l = this.KWHzl;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TargetMessage(seq=" + this.KWHzl + ")";
        }

        public ActionBar(java.lang.Long l) {
            this.KWHzl = l;
        }
    }
}
