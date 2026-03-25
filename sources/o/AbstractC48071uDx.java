package o;

import com.okinc.tradingbot.impl.aiBot.domain.model.Indicator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uDx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC48071uDx {
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: o.uDx.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC48071uDx(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.uDx$ActionBar */
    public static final class ActionBar extends AbstractC48071uDx {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.AEQbTJ;
            }
            return actionBar.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((ActionBar) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Divider(sectionName=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.String str) {
            super("divider_" + str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }
    }

    public AbstractC48071uDx(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX INFO: renamed from: o.uDx$TaskDescription */
    public static final class TaskDescription extends AbstractC48071uDx {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.copydefault;
            }
            return taskDescription.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new TaskDescription(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((TaskDescription) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Header(title=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str) {
            super("header_" + str, null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }
    }

    /* JADX INFO: renamed from: o.uDx$StateListAnimator */
    public static final class StateListAnimator extends AbstractC48071uDx {
        public final boolean AEQbTJ;
        public final Indicator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, Indicator indicator, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                indicator = stateListAnimator.copydefault;
            }
            if ((i & 2) != 0) {
                z = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.KWHzl(indicator, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Indicator EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull Indicator indicator, boolean z) {
            Intrinsics.checkNotNullParameter(indicator, "");
            return new StateListAnimator(indicator, z);
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
            return Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && this.AEQbTJ == stateListAnimator.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "IndicatorItem(indicator=" + this.copydefault + ", canSelect=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull Indicator indicator, boolean z) {
            super(indicator.EZpvd(), null);
            Intrinsics.checkNotNullParameter(indicator, "");
            this.copydefault = indicator;
            this.AEQbTJ = z;
        }
    }
}
