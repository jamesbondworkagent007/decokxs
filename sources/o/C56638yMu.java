package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* JADX INFO: renamed from: o.yMu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56638yMu extends AbstractC56640yMw {
    public static final Application copydefault = new Application(null);
    public static final InterfaceC56387yDm<C56638yMu> KWHzl = C56392yDr.copydefault(C56642yMy.copydefault);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C56638yMu() {
        this(false, 1, null);
    }

    public C56638yMu(boolean z) {
        super(new LockBasedStorageManager("DefaultBuiltIns"));
        if (z) {
            KWHzl(false);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0001: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:21) call: o.yMu.<init>(boolean):void type: THIS */
    public /* synthetic */ C56638yMu(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    /* JADX INFO: renamed from: o.yMu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yMu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C56638yMu copydefault() {
            return (C56638yMu) C56638yMu.KWHzl.getValue();
        }
    }

    public static final C56638yMu KWHzl() {
        return new C56638yMu(false, 1, null);
    }
}
