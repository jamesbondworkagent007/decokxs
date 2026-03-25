package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes21.dex */
public abstract class DhcpClientEvent {
    public static final TaskDescription AEQbTJ = new TaskDescription(null);
    public static final java.util.List<DhcpClientEvent> copydefault = yDY.gEmmrt(ActionBar.OLrzqt, Activity.OLrzqt);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DhcpClientEvent.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DhcpClientEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String copydefault();

    private DhcpClientEvent() {
    }

    public static final class ActionBar extends DhcpClientEvent {
        public static final ActionBar OLrzqt = new ActionBar();
        public static final java.lang.String EZpvd = "AUGMENTED_MANIFEST";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.DhcpClientEvent
        public java.lang.String copydefault() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AugmentedManifest";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Activity extends DhcpClientEvent {
        public static final Activity OLrzqt = new Activity();
        public static final java.lang.String EZpvd = "COMPREHEND_CSV";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.DhcpClientEvent
        public java.lang.String copydefault() {
            return EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ComprehendCsv";
        }

        private Activity() {
            super(null);
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DhcpClientEvent.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
