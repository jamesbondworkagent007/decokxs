package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC40812qex extends InterfaceC40518qYv {
    int AEQbTJ();

    Function0<androidx.fragment.app.Fragment> KWHzl();

    @Override // o.InterfaceC40518qYv
    androidx.fragment.app.Fragment createFragment();

    /* JADX INFO: renamed from: o.qex$ActionBar */
    public static final class ActionBar implements InterfaceC40812qex {
        public final Function0<androidx.fragment.app.Fragment> AEQbTJ;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qex$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, Function0 function0, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = actionBar.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                function0 = actionBar.AEQbTJ;
            }
            return actionBar.copydefault(i, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC40812qex
        public int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC40812qex
        public Function0<androidx.fragment.app.Fragment> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@androidx.annotation.StringRes int i, @NotNull Function0<? extends androidx.fragment.app.Fragment> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            return new ActionBar(i, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.OLrzqt == actionBar.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OptionsChain(titleResId=" + this.OLrzqt + ", onCreateFragment=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.fragment.app.Fragment> */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@androidx.annotation.StringRes int i, @NotNull Function0<? extends androidx.fragment.app.Fragment> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.OLrzqt = i;
            this.AEQbTJ = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.qZH.PendingIntent.itxZVF int) : (r1v0 int))
  (r2v0 kotlin.jvm.functions.Function0)
 A[MD:(int, kotlin.jvm.functions.Function0<? extends androidx.fragment.app.Fragment>):void (m)] (LINE:13) call: o.qex.ActionBar.<init>(int, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ ActionBar(int i, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? qZH.PendingIntent.itxZVF : i, function0);
        }

        @Override // o.InterfaceC40812qex, o.InterfaceC40518qYv
        public androidx.fragment.app.Fragment createFragment() {
            return TaskDescription.AEQbTJ(this);
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareContents(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return TaskDescription.EZpvd(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareItems(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return TaskDescription.OLrzqt(this, interfaceC40518qYv);
        }
    }

    /* JADX INFO: renamed from: o.qex$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC40812qex {
        public final int AEQbTJ;
        public final Function0<androidx.fragment.app.Fragment> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qex$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, Function0 function0, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = stateListAnimator.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                function0 = stateListAnimator.KWHzl;
            }
            return stateListAnimator.AEQbTJ(i, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC40812qex
        public int AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@androidx.annotation.StringRes int i, @NotNull Function0<? extends androidx.fragment.app.Fragment> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            return new StateListAnimator(i, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC40812qex
        public Function0<androidx.fragment.app.Fragment> KWHzl() {
            return this.KWHzl;
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
            return this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd(this.KWHzl, stateListAnimator.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OptionsQuote(titleResId=" + this.AEQbTJ + ", onCreateFragment=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.fragment.app.Fragment> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@androidx.annotation.StringRes int i, @NotNull Function0<? extends androidx.fragment.app.Fragment> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.AEQbTJ = i;
            this.KWHzl = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.qZH.PendingIntent.ONJgbh int) : (r1v0 int))
  (r2v0 kotlin.jvm.functions.Function0)
 A[MD:(int, kotlin.jvm.functions.Function0<? extends androidx.fragment.app.Fragment>):void (m)] (LINE:19) call: o.qex.StateListAnimator.<init>(int, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ StateListAnimator(int i, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? qZH.PendingIntent.ONJgbh : i, function0);
        }

        @Override // o.InterfaceC40812qex, o.InterfaceC40518qYv
        public androidx.fragment.app.Fragment createFragment() {
            return TaskDescription.AEQbTJ(this);
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareContents(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return TaskDescription.EZpvd(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareItems(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return TaskDescription.OLrzqt(this, interfaceC40518qYv);
        }
    }

    /* JADX INFO: renamed from: o.qex$Application */
    public static final class Application implements InterfaceC40812qex {
        public final int OLrzqt;
        public final Function0<androidx.fragment.app.Fragment> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qex$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, int i, Function0 function0, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = application.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                function0 = application.copydefault;
            }
            return application.KWHzl(i, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC40812qex
        public int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC40812qex
        public Function0<androidx.fragment.app.Fragment> KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@androidx.annotation.StringRes int i, @NotNull Function0<? extends androidx.fragment.app.Fragment> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            return new Application(i, function0);
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
            return this.OLrzqt == application.OLrzqt && Intrinsics.EZpvd(this.copydefault, application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SimpleOptions(titleResId=" + this.OLrzqt + ", onCreateFragment=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.fragment.app.Fragment> */
        /* JADX WARN: Multi-variable type inference failed */
        public Application(@androidx.annotation.StringRes int i, @NotNull Function0<? extends androidx.fragment.app.Fragment> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.OLrzqt = i;
            this.copydefault = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.qZH.PendingIntent.config int) : (r1v0 int))
  (r2v0 kotlin.jvm.functions.Function0)
 A[MD:(int, kotlin.jvm.functions.Function0<? extends androidx.fragment.app.Fragment>):void (m)] (LINE:25) call: o.qex.Application.<init>(int, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ Application(int i, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? qZH.PendingIntent.config : i, function0);
        }

        @Override // o.InterfaceC40812qex, o.InterfaceC40518qYv
        public androidx.fragment.app.Fragment createFragment() {
            return TaskDescription.AEQbTJ(this);
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareContents(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return TaskDescription.EZpvd(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareItems(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return TaskDescription.OLrzqt(this, interfaceC40518qYv);
        }
    }

    /* JADX INFO: renamed from: o.qex$Activity */
    public static final class Activity implements InterfaceC40812qex {
        public final Function0<androidx.fragment.app.Fragment> AEQbTJ;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qex$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, Function0 function0, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = activity.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                function0 = activity.AEQbTJ;
            }
            return activity.KWHzl(i, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC40812qex
        public int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC40812qex
        public Function0<androidx.fragment.app.Fragment> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity KWHzl(@androidx.annotation.StringRes int i, @NotNull Function0<? extends androidx.fragment.app.Fragment> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            return new Activity(i, function0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return this.OLrzqt == activity.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.OLrzqt) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OptionsCopilot(titleResId=" + this.OLrzqt + ", onCreateFragment=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends androidx.fragment.app.Fragment> */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@androidx.annotation.StringRes int i, @NotNull Function0<? extends androidx.fragment.app.Fragment> function0) {
            Intrinsics.checkNotNullParameter(function0, "");
            this.OLrzqt = i;
            this.AEQbTJ = function0;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:int:0x0004: SGET  A[WRAPPED] o.qZH.PendingIntent.zbGDDc int) : (r1v0 int))
  (r2v0 kotlin.jvm.functions.Function0)
 A[MD:(int, kotlin.jvm.functions.Function0<? extends androidx.fragment.app.Fragment>):void (m)] (LINE:31) call: o.qex.Activity.<init>(int, kotlin.jvm.functions.Function0):void type: THIS */
        public /* synthetic */ Activity(int i, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? qZH.PendingIntent.zbGDDc : i, function0);
        }

        @Override // o.InterfaceC40812qex, o.InterfaceC40518qYv
        public androidx.fragment.app.Fragment createFragment() {
            return TaskDescription.AEQbTJ(this);
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareContents(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return TaskDescription.EZpvd(this, interfaceC40518qYv);
        }

        @Override // o.InterfaceC40518qYv
        public boolean onCompareItems(@NotNull InterfaceC40518qYv interfaceC40518qYv) {
            return TaskDescription.OLrzqt(this, interfaceC40518qYv);
        }
    }

    /* JADX INFO: renamed from: o.qex$TaskDescription */
    public static final class TaskDescription {
        public static boolean OLrzqt(@NotNull InterfaceC40812qex interfaceC40812qex, @NotNull InterfaceC40518qYv interfaceC40518qYv) {
            Intrinsics.checkNotNullParameter(interfaceC40518qYv, "");
            return Intrinsics.EZpvd(interfaceC40812qex, interfaceC40518qYv);
        }

        public static boolean EZpvd(@NotNull InterfaceC40812qex interfaceC40812qex, @NotNull InterfaceC40518qYv interfaceC40518qYv) {
            Intrinsics.checkNotNullParameter(interfaceC40518qYv, "");
            return Intrinsics.EZpvd(interfaceC40812qex, interfaceC40518qYv);
        }

        public static androidx.fragment.app.Fragment AEQbTJ(@NotNull InterfaceC40812qex interfaceC40812qex) {
            return interfaceC40812qex.KWHzl().invoke();
        }
    }
}
