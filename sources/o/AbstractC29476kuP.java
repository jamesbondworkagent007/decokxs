package o;

import com.okinc.business.defi.api.bean.DappSignArgs;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C29463kuC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kuP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC29476kuP {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kuP.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC29476kuP(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.kuP$StateListAnimator */
    public static final class StateListAnimator extends AbstractC29476kuP {
        public final C29463kuC.Application KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, C29463kuC.Application application, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                application = stateListAnimator.KWHzl;
            }
            return stateListAnimator.KWHzl(application);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(C29463kuC.Application application) {
            return new StateListAnimator(application);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C29463kuC.Application OLrzqt() {
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
            C29463kuC.Application application = this.KWHzl;
            if (application == null) {
                return 0;
            }
            return application.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NewTokenAlertToggle(tokenAlert=" + this.KWHzl + ")";
        }

        public StateListAnimator(C29463kuC.Application application) {
            super(null);
            this.KWHzl = application;
        }
    }

    private AbstractC29476kuP() {
    }

    /* JADX INFO: renamed from: o.kuP$Application */
    public static final class Application extends AbstractC29476kuP {
        public static final int AEQbTJ = DappSignArgs.$stable;
        public final C29463kuC.Application KWHzl;
        public final DappSignArgs copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, DappSignArgs dappSignArgs, C29463kuC.Application application2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dappSignArgs = application.copydefault;
            }
            if ((i & 2) != 0) {
                application2 = application.KWHzl;
            }
            return application.copydefault(dappSignArgs, application2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C29463kuC.Application OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DappSignArgs copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull DappSignArgs dappSignArgs, C29463kuC.Application application) {
            Intrinsics.checkNotNullParameter(dappSignArgs, "");
            return new Application(dappSignArgs, application);
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
            return Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            C29463kuC.Application application = this.KWHzl;
            return (iHashCode * 31) + (application == null ? 0 : application.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SignMessageGenerated(args=" + this.copydefault + ", tokenAlert=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull DappSignArgs dappSignArgs, C29463kuC.Application application) {
            super(null);
            Intrinsics.checkNotNullParameter(dappSignArgs, "");
            this.copydefault = dappSignArgs;
            this.KWHzl = application;
        }
    }

    /* JADX INFO: renamed from: o.kuP$Activity */
    public static final class Activity extends AbstractC29476kuP {
        public final java.lang.Throwable OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = activity.OLrzqt;
            }
            return activity.AEQbTJ(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new Activity(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.OLrzqt, ((Activity) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SignatureFailure(exception=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.OLrzqt = th;
        }
    }

    /* JADX INFO: renamed from: o.kuP$TaskDescription */
    public static final class TaskDescription extends AbstractC29476kuP {
        public final C29463kuC.Application KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, C29463kuC.Application application, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                application = taskDescription.KWHzl;
            }
            return taskDescription.copydefault(application);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C29463kuC.Application copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription copydefault(C29463kuC.Application application) {
            return new TaskDescription(application);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.KWHzl, ((TaskDescription) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            C29463kuC.Application application = this.KWHzl;
            if (application == null) {
                return 0;
            }
            return application.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HasValidJwt(tokenAlert=" + this.KWHzl + ")";
        }

        public TaskDescription(C29463kuC.Application application) {
            super(null);
            this.KWHzl = application;
        }
    }
}
