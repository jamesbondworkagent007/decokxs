package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.udg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48862udg {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public boolean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C48862udg() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C48862udg(@NotNull InterfaceC56387yDm<pUV> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        this.AEQbTJ = interfaceC56387yDm;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:o.yDm:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yDm:0x0009: INVOKE 
  (wrap:kotlin.jvm.functions.Function0:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:10) call: o.udc.<init>():void type: CONSTRUCTOR)
 STATIC call: o.yDr.copydefault(kotlin.jvm.functions.Function0):o.yDm A[MD:<T>:(kotlin.jvm.functions.Function0<? extends T>):o.yDm<T> (m), WRAPPED] (LINE:10)) : (r1v0 o.yDm))
 A[MD:(o.yDm<o.pUV>):void (m)] (LINE:10) call: o.udg.<init>(o.yDm):void type: THIS */
    public /* synthetic */ C48862udg(InterfaceC56387yDm interfaceC56387yDm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C56392yDr.copydefault(new Function0() { // from class: o.udc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C48862udg.copydefault();
            }
        }) : interfaceC56387yDm);
    }

    public static final pUV copydefault() {
        return new pUV("RemoteConfigVerify", false, false, false, 14, null);
    }

    public final pUV AEQbTJ() {
        return (pUV) this.AEQbTJ.getValue();
    }

    public final void copydefault(int i) {
        if (this.KWHzl) {
            return;
        }
        if (i > 0) {
            this.KWHzl = true;
            AEQbTJ().copydefault("configSize:" + i + " verify pass");
            return;
        }
        AEQbTJ().EZpvd("configSize is zero. TBD");
    }

    /* JADX INFO: renamed from: o.udg$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.udg.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
