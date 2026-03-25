package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC18379fhL {
    java.lang.String EZpvd();

    long KWHzl();

    boolean copydefault();

    /* JADX INFO: renamed from: o.fhL$Activity */
    public static final class Activity implements InterfaceC18379fhL {
        public final boolean AEQbTJ;
        public final C10854bwM KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, C10854bwM c10854bwM, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c10854bwM = activity.KWHzl;
            }
            if ((i & 2) != 0) {
                str = activity.OLrzqt;
            }
            if ((i & 4) != 0) {
                z = activity.AEQbTJ;
            }
            return activity.EZpvd(c10854bwM, str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C10854bwM AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC18379fhL
        public java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(c10854bwM, str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC18379fhL
        public boolean copydefault() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && this.AEQbTJ == activity.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Chain(coinMeta=" + this.KWHzl + ", address=" + this.OLrzqt + ", isAdded=" + this.AEQbTJ + ")";
        }

        public Activity(@NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = c10854bwM;
            this.OLrzqt = str;
            this.AEQbTJ = z;
        }

        /* JADX INFO: renamed from: o.fhL$Activity$TaskDescription */
        public static final class TaskDescription {
            public final java.lang.String EZpvd;
            public boolean OLrzqt;
            public final C10854bwM copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C10854bwM KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription copydefault(boolean z) {
                this.OLrzqt = z;
                return this;
            }

            public TaskDescription(@NotNull C10854bwM c10854bwM, @NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(c10854bwM, "");
                Intrinsics.checkNotNullParameter(str, "");
                this.copydefault = c10854bwM;
                this.EZpvd = str;
            }

            public final Activity AEQbTJ() {
                return new Activity(this.copydefault, this.EZpvd, this.OLrzqt);
            }
        }

        @Override // o.InterfaceC18379fhL
        public long KWHzl() {
            return this.KWHzl.AEQbTJ();
        }
    }

    /* JADX INFO: renamed from: o.fhL$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC18379fhL {
        public final int AEQbTJ;
        public final java.lang.String EZpvd;
        public final boolean KWHzl;
        public final java.util.List<C10854bwM> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fhL$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, java.util.List list, java.lang.String str, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = stateListAnimator.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                list = stateListAnimator.copydefault;
            }
            if ((i2 & 4) != 0) {
                str = stateListAnimator.EZpvd;
            }
            if ((i2 & 8) != 0) {
                z = stateListAnimator.KWHzl;
            }
            return stateListAnimator.OLrzqt(i, list, str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC18379fhL
        public java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C10854bwM> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(int i, @NotNull java.util.List<C10854bwM> list, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(i, list, str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC18379fhL
        public boolean copydefault() {
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
            return this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && this.KWHzl == stateListAnimator.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((java.lang.Integer.hashCode(this.AEQbTJ) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CompatibleChain(factionType=" + this.AEQbTJ + ", coinMetaList=" + this.copydefault + ", address=" + this.EZpvd + ", isAdded=" + this.KWHzl + ")";
        }

        public StateListAnimator(int i, @NotNull java.util.List<C10854bwM> list, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = i;
            this.copydefault = list;
            this.EZpvd = str;
            this.KWHzl = z;
        }

        @Override // o.InterfaceC18379fhL
        public long KWHzl() {
            return C18388fhU.OLrzqt(this.copydefault, this.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.fhL$ActionBar */
    public static final class ActionBar implements InterfaceC18379fhL {
        public final java.lang.String AEQbTJ;
        public final java.util.List<C10854bwM> KWHzl;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fhL$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.util.List list, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = actionBar.KWHzl;
            }
            if ((i & 2) != 0) {
                str = actionBar.AEQbTJ;
            }
            if ((i & 4) != 0) {
                z = actionBar.copydefault;
            }
            return actionBar.KWHzl(list, str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC18379fhL
        public java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar KWHzl(@NotNull java.util.List<C10854bwM> list, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(list, str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC18379fhL
        public boolean copydefault() {
            return this.copydefault;
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
            return Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && this.copydefault == actionBar.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SvmChain(coinMetaList=" + this.KWHzl + ", address=" + this.AEQbTJ + ", isAdded=" + this.copydefault + ")";
        }

        public ActionBar(@NotNull java.util.List<C10854bwM> list, @NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = list;
            this.AEQbTJ = str;
            this.copydefault = z;
        }

        @Override // o.InterfaceC18379fhL
        public long KWHzl() {
            java.lang.Object next;
            java.util.Iterator<T> it = this.KWHzl.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C10854bwM) next).fdOvFl()) {
                    break;
                }
            }
            C10854bwM c10854bwM = (C10854bwM) next;
            if (c10854bwM != null) {
                return c10854bwM.AEQbTJ();
            }
            C10854bwM c10854bwMHDKMBd = C10954byG.EZpvd.valueOf().hDKMBd();
            return c10854bwMHDKMBd != null ? c10854bwMHDKMBd.AEQbTJ() : ((C10854bwM) CollectionsKt___CollectionsKt.AuCTelauCTel(this.KWHzl)).AEQbTJ();
        }
    }
}
