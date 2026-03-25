package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.msi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC33240msi {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: o.msi.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC33240msi(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    public AbstractC33240msi(java.lang.String str) {
        this.KWHzl = str;
    }

    /* JADX INFO: renamed from: o.msi$Application */
    public static final class Application extends AbstractC33240msi implements InterfaceC33241msj {
        public static final Application copydefault = new Application();

        private Application() {
            super("legacy", null);
        }
    }

    /* JADX INFO: renamed from: o.msi$Activity */
    public static final class Activity extends AbstractC33240msi implements InterfaceC33241msj {
        public static final Activity OLrzqt = new Activity();

        private Activity() {
            super("simple", null);
        }
    }

    /* JADX INFO: renamed from: o.msi$ActionBar */
    public static final class ActionBar extends AbstractC33240msi implements InterfaceC33241msj {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
            super("advanced", null);
        }
    }

    /* JADX INFO: renamed from: o.msi$LoaderManager */
    public static final class LoaderManager extends AbstractC33240msi {
        public static final LoaderManager EZpvd = new LoaderManager();

        private LoaderManager() {
            super("wallet", null);
        }
    }

    /* JADX INFO: renamed from: o.msi$TaskDescription */
    public static final class TaskDescription extends AbstractC33240msi {
        public static final TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
            super("pay", null);
        }
    }

    /* JADX INFO: renamed from: o.msi$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.msi.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [15=4] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final AbstractC33240msi KWHzl(java.lang.String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -902286926:
                        if (str.equals("simple")) {
                            return Activity.OLrzqt;
                        }
                        break;
                    case -795192327:
                        if (str.equals("wallet")) {
                            return LoaderManager.EZpvd;
                        }
                        break;
                    case -718837726:
                        if (str.equals("advanced")) {
                            return ActionBar.EZpvd;
                        }
                        break;
                    case 110760:
                        if (str.equals("pay")) {
                            return TaskDescription.OLrzqt;
                        }
                        break;
                }
            }
            return Application.copydefault;
        }

        public final AbstractC33240msi AEQbTJ(java.lang.String str) {
            return KWHzl(str);
        }
    }
}
