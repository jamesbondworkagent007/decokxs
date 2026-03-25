package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ConfigUpdate {
    public static final ActionBar KWHzl = new ActionBar(null);
    public static final java.util.List<ConfigUpdate> OLrzqt = yDY.gEmmrt(Activity.AEQbTJ, TaskDescription.AEQbTJ);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ConfigUpdate.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ConfigUpdate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String OLrzqt();

    private ConfigUpdate() {
    }

    public static final class Activity extends ConfigUpdate {
        public static final Activity AEQbTJ = new Activity();
        public static final java.lang.String EZpvd = "AUGMENTED_MANIFEST";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ConfigUpdate
        public java.lang.String OLrzqt() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AugmentedManifest";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class TaskDescription extends ConfigUpdate {
        public static final TaskDescription AEQbTJ = new TaskDescription();
        public static final java.lang.String EZpvd = "COMPREHEND_CSV";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ConfigUpdate
        public java.lang.String OLrzqt() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ComprehendCsv";
        }

        private TaskDescription() {
            super(null);
        }
    }

    public static final class Application extends ConfigUpdate {
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.copydefault;
            }
            return application.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ConfigUpdate
        public java.lang.String OLrzqt() {
            return this.copydefault;
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
            return this.copydefault.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + OLrzqt() + ')';
        }
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ConfigUpdate.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ConfigUpdate copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "AUGMENTED_MANIFEST") ? Activity.AEQbTJ : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "COMPREHEND_CSV") ? TaskDescription.AEQbTJ : new Application(str);
        }
    }
}
