package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.msr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33249msr {
    public static final Activity Companion = new Activity(null);
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: o.msr.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC33249msr(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    public AbstractC33249msr(java.lang.String str) {
        this.OLrzqt = str;
    }

    /* JADX INFO: renamed from: o.msr$Application */
    public static final class Application extends AbstractC33249msr {
        public static final Application AEQbTJ = new Application();

        private Application() {
            super("pay", null);
        }
    }

    /* JADX INFO: renamed from: o.msr$TaskDescription */
    public static final class TaskDescription extends AbstractC33249msr {
        public static final TaskDescription KWHzl = new TaskDescription();

        private TaskDescription() {
            super("exchange", null);
        }
    }

    /* JADX INFO: renamed from: o.msr$ActionBar */
    public static final class ActionBar extends AbstractC33249msr {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
            super("wallet", null);
        }
    }

    /* JADX INFO: renamed from: o.msr$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.msr.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final AbstractC33249msr copydefault(java.lang.String str) {
            if (str != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -795192327) {
                    if (iHashCode != 110760) {
                        if (iHashCode == 1989774883 && str.equals("exchange")) {
                            return TaskDescription.KWHzl;
                        }
                    } else if (str.equals("pay")) {
                        return Application.AEQbTJ;
                    }
                } else if (str.equals("wallet")) {
                    return ActionBar.EZpvd;
                }
            }
            return TaskDescription.KWHzl;
        }

        public final AbstractC33249msr OLrzqt(java.lang.String str) {
            return copydefault(str);
        }
    }
}
