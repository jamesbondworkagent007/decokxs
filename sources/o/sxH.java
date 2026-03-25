package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes16.dex */
public abstract class sxH {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (m)] call: o.sxH.<init>(java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ sxH(java.lang.String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public sxH(java.lang.String str) {
        this.copydefault = str;
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar extends sxH {
        public static final ActionBar OLrzqt = new ActionBar();

        private ActionBar() {
            super("pro_discover", null);
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sxH.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
