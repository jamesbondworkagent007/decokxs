package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC59439zh {
    public static final TaskDescription djBIcL = new TaskDescription(null);
    public final boolean gEmmrt;
    public final java.lang.Long valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zh.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC59439zh(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.Long OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        return this.gEmmrt;
    }

    private AbstractC59439zh() {
        this.gEmmrt = true;
    }

    /* JADX INFO: renamed from: o.zh$Application */
    public static abstract class Application extends AbstractC59439zh {
        public final boolean copydefault;

        public abstract byte[] EZpvd();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC59439zh
        public final boolean copydefault() {
            return this.copydefault;
        }

        public Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.zh$Activity */
    public static abstract class Activity extends AbstractC59439zh {
        public abstract CS EZpvd();

        public Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.zh$StateListAnimator */
    public static abstract class StateListAnimator extends AbstractC59439zh {
        public abstract InterfaceC5060De AEQbTJ();

        public StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.zh$TaskDescription */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zh.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
