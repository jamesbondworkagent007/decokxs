package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.xp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC55709xp {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xp.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC55709xp(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC55709xp() {
    }

    /* JADX INFO: renamed from: o.xp$StateListAnimator */
    public static final class StateListAnimator extends AbstractC55709xp {
        public static final StateListAnimator OLrzqt = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.xp$ActionBar */
    public static abstract class ActionBar extends AbstractC55709xp {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: o.xp.ActionBar.<init>(java.lang.String):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String KWHzl() {
            return this.KWHzl;
        }

        public ActionBar(java.lang.String str) {
            super(null);
            this.KWHzl = str;
        }
    }

    /* JADX INFO: renamed from: o.xp$LoaderManager */
    public static final class LoaderManager extends ActionBar {
        public static final LoaderManager copydefault = new LoaderManager();

        private LoaderManager() {
            super("UNSIGNED-PAYLOAD", null);
        }
    }

    /* JADX INFO: renamed from: o.xp$Application */
    public static final class Application extends ActionBar {
        public static final Application copydefault = new Application();

        private Application() {
            super("e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855", null);
        }
    }

    /* JADX INFO: renamed from: o.xp$Activity */
    public static final class Activity extends ActionBar {
        public static final Activity copydefault = new Activity();

        private Activity() {
            super("STREAMING-AWS4-HMAC-SHA256-PAYLOAD", null);
        }
    }

    /* JADX INFO: renamed from: o.xp$TaskDescription */
    public static final class TaskDescription extends ActionBar {
        public static final TaskDescription EZpvd = new TaskDescription();

        private TaskDescription() {
            super("STREAMING-AWS4-HMAC-SHA256-PAYLOAD-TRAILER", null);
        }
    }

    /* JADX INFO: renamed from: o.xp$FragmentManager */
    public static final class FragmentManager extends ActionBar {
        public static final FragmentManager AEQbTJ = new FragmentManager();

        private FragmentManager() {
            super("STREAMING-UNSIGNED-PAYLOAD-TRAILER", null);
        }
    }
}
