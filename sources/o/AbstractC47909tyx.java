package o;

import com.okinc.planet.biz_home.root.PlanetSubPage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tyx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC47909tyx {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tyx.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC47909tyx(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.tyx$StateListAnimator */
    public static final class StateListAnimator extends AbstractC47909tyx {
        public final int AEQbTJ;
        public final PlanetSubPage copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, PlanetSubPage planetSubPage, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                planetSubPage = stateListAnimator.copydefault;
            }
            if ((i2 & 2) != 0) {
                i = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.EZpvd(planetSubPage, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull PlanetSubPage planetSubPage, int i) {
            Intrinsics.checkNotNullParameter(planetSubPage, "");
            return new StateListAnimator(planetSubPage, i);
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
            return this.copydefault == stateListAnimator.copydefault && this.AEQbTJ == stateListAnimator.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + java.lang.Integer.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PageSelected(tab=" + this.copydefault + ", position=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull PlanetSubPage planetSubPage, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(planetSubPage, "");
            this.copydefault = planetSubPage;
            this.AEQbTJ = i;
        }
    }

    private AbstractC47909tyx() {
    }

    /* JADX INFO: renamed from: o.tyx$ActionBar */
    public static final class ActionBar extends AbstractC47909tyx {
        public final int KWHzl;
        public final java.util.List<PlanetSubPage> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tyx$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.List list, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                list = actionBar.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                i = actionBar.KWHzl;
            }
            return actionBar.AEQbTJ(list, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull java.util.List<? extends PlanetSubPage> list, int i) {
            Intrinsics.checkNotNullParameter(list, "");
            return new ActionBar(list, i);
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
            return Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && this.KWHzl == actionBar.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TabsUpdated(tabs=" + this.OLrzqt + ", newPosition=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.planet.biz_home.root.PlanetSubPage> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull java.util.List<? extends PlanetSubPage> list, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
            this.KWHzl = i;
        }
    }

    /* JADX INFO: renamed from: o.tyx$Application */
    public static final class Application extends AbstractC47909tyx {
        public final PlanetSubPage AEQbTJ;
        public final int KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, PlanetSubPage planetSubPage, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                planetSubPage = application.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                i = application.KWHzl;
            }
            return application.OLrzqt(planetSubPage, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull PlanetSubPage planetSubPage, int i) {
            Intrinsics.checkNotNullParameter(planetSubPage, "");
            return new Application(planetSubPage, i);
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
            return this.AEQbTJ == application.AEQbTJ && this.KWHzl == application.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + java.lang.Integer.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NavigateToTab(tab=" + this.AEQbTJ + ", position=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull PlanetSubPage planetSubPage, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(planetSubPage, "");
            this.AEQbTJ = planetSubPage;
            this.KWHzl = i;
        }
    }
}
