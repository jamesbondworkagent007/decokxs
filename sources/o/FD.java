package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.FA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FD {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FD.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ FD(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract int EZpvd();

    private FD() {
    }

    public static final class Application extends FD {
        public static final Application EZpvd = new Application();
        public static final int KWHzl = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.FD
        public int EZpvd() {
            return KWHzl;
        }

        private Application() {
            super(null);
        }
    }

    public static final class Activity extends FD {
        public static final int AEQbTJ = 0;
        public static final Activity OLrzqt = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.FD
        public int EZpvd() {
            return AEQbTJ;
        }

        private Activity() {
            super(null);
        }
    }

    public static abstract class TaskDescription extends FD {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.FD.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
            super(null);
        }

        /* JADX INFO: renamed from: o.FD$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0803TaskDescription extends TaskDescription {
            public final boolean AEQbTJ;
            public final C0803TaskDescription EZpvd;
            public final int KWHzl;
            public final FA.Application copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0803TaskDescription copy$default(C0803TaskDescription c0803TaskDescription, FA.Application application, C0803TaskDescription c0803TaskDescription2, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    application = c0803TaskDescription.copydefault;
                }
                if ((i & 2) != 0) {
                    c0803TaskDescription2 = c0803TaskDescription.EZpvd;
                }
                if ((i & 4) != 0) {
                    z = c0803TaskDescription.AEQbTJ;
                }
                return c0803TaskDescription.KWHzl(application, c0803TaskDescription2, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FD
            public int EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0803TaskDescription KWHzl(@NotNull FA.Application application, C0803TaskDescription c0803TaskDescription, boolean z) {
                Intrinsics.checkNotNullParameter(application, "");
                return new C0803TaskDescription(application, c0803TaskDescription, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public FA.Application OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C0803TaskDescription copydefault() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0803TaskDescription)) {
                    return false;
                }
                C0803TaskDescription c0803TaskDescription = (C0803TaskDescription) obj;
                return Intrinsics.EZpvd(this.copydefault, c0803TaskDescription.copydefault) && Intrinsics.EZpvd(this.EZpvd, c0803TaskDescription.EZpvd) && this.AEQbTJ == c0803TaskDescription.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.copydefault.hashCode();
                C0803TaskDescription c0803TaskDescription = this.EZpvd;
                return (((iHashCode * 31) + (c0803TaskDescription == null ? 0 : c0803TaskDescription.hashCode())) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OpenTag(name=" + this.copydefault + ", parent=" + this.EZpvd + ", seenChildren=" + this.AEQbTJ + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0803TaskDescription(@NotNull FA.Application application, C0803TaskDescription c0803TaskDescription, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(application, "");
                this.copydefault = application;
                this.EZpvd = c0803TaskDescription;
                this.AEQbTJ = z;
                C0803TaskDescription c0803TaskDescriptionCopydefault = copydefault();
                this.KWHzl = (c0803TaskDescriptionCopydefault != null ? c0803TaskDescriptionCopydefault.EZpvd() : 0) + 1;
            }
        }

        public static final class Activity extends TaskDescription {
            public final FA.Application EZpvd;
            public final int KWHzl;
            public final C0803TaskDescription OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, FA.Application application, C0803TaskDescription c0803TaskDescription, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    application = activity.EZpvd;
                }
                if ((i & 2) != 0) {
                    c0803TaskDescription = activity.OLrzqt;
                }
                return activity.KWHzl(application, c0803TaskDescription);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.FD
            public int EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(@NotNull FA.Application application, C0803TaskDescription c0803TaskDescription) {
                Intrinsics.checkNotNullParameter(application, "");
                return new Activity(application, c0803TaskDescription);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C0803TaskDescription KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public FA.Application copydefault() {
                return this.EZpvd;
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
                return Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.EZpvd.hashCode();
                C0803TaskDescription c0803TaskDescription = this.OLrzqt;
                return (iHashCode * 31) + (c0803TaskDescription == null ? 0 : c0803TaskDescription.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "EmptyTag(name=" + this.EZpvd + ", parent=" + this.OLrzqt + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull FA.Application application, C0803TaskDescription c0803TaskDescription) {
                super(null);
                Intrinsics.checkNotNullParameter(application, "");
                this.EZpvd = application;
                this.OLrzqt = c0803TaskDescription;
                C0803TaskDescription c0803TaskDescriptionKWHzl = KWHzl();
                this.KWHzl = (c0803TaskDescriptionKWHzl != null ? c0803TaskDescriptionKWHzl.EZpvd() : 0) + 1;
            }
        }
    }

    public static final class ActionBar extends FD {
        public static final ActionBar AEQbTJ = new ActionBar();
        public static final int OLrzqt = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.FD
        public int EZpvd() {
            return OLrzqt;
        }

        private ActionBar() {
            super(null);
        }
    }
}
