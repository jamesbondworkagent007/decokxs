package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.uCy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48045uCy extends C43265rly {
    public static final TaskDescription Companion = new TaskDescription(null);

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return false;
    }

    /* JADX INFO: renamed from: o.uCy$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uCy.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        super.onCreate();
        tWM twm = (tWM) C43251rlk.OLrzqt(tWM.class);
        if (twm != null) {
            twm.KWHzl(new C53655wpb());
        }
    }
}
