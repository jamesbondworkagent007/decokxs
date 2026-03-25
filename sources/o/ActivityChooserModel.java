package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public abstract class ActivityChooserModel {
    public static final Application AEQbTJ = new Application(null);
    public static final java.util.List<ActivityChooserModel> copydefault = yDY.gEmmrt(ActionBar.KWHzl, Activity.EZpvd);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ActivityChooserModel.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ActivityChooserModel(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String copydefault();

    private ActivityChooserModel() {
    }

    public static final class ActionBar extends ActivityChooserModel {
        public static final ActionBar KWHzl = new ActionBar();
        public static final java.lang.String EZpvd = "FreeOfAdultContent";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ActivityChooserModel
        public java.lang.String copydefault() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FreeOfAdultContent";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Activity extends ActivityChooserModel {
        public static final Activity EZpvd = new Activity();
        public static final java.lang.String OLrzqt = "FreeOfPersonallyIdentifiableInformation";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.ActivityChooserModel
        public java.lang.String copydefault() {
            return OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FreeOfPersonallyIdentifiableInformation";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ActivityChooserModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
