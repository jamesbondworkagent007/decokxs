package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35161nqB {
    public final InterfaceC56387yDm KWHzl;
    public boolean copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C35161nqB() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public C35161nqB(@NotNull InterfaceC56387yDm<pUV> interfaceC56387yDm) {
        Intrinsics.checkNotNullParameter(interfaceC56387yDm, "");
        this.KWHzl = interfaceC56387yDm;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:o.yDm:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.yDm:0x0009: INVOKE 
  (wrap:kotlin.jvm.functions.Function0:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:12) call: o.nqC.<init>():void type: CONSTRUCTOR)
 STATIC call: o.yDr.copydefault(kotlin.jvm.functions.Function0):o.yDm A[MD:<T>:(kotlin.jvm.functions.Function0<? extends T>):o.yDm<T> (m), WRAPPED] (LINE:12)) : (r1v0 o.yDm))
 A[MD:(o.yDm<o.pUV>):void (m)] (LINE:12) call: o.nqB.<init>(o.yDm):void type: THIS */
    public /* synthetic */ C35161nqB(InterfaceC56387yDm interfaceC56387yDm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C56392yDr.copydefault(new Function0() { // from class: o.nqC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C35161nqB.AEQbTJ();
            }
        }) : interfaceC56387yDm);
    }

    public static final pUV AEQbTJ() {
        return new pUV("GrayVerify", false, false, false, 14, null);
    }

    public final pUV copydefault() {
        return (pUV) this.KWHzl.getValue();
    }

    public final void EZpvd(int i) {
        if (this.copydefault) {
            pUU.EZpvd("GrayVerify", "graySuccess is true, skip verifyGrayConfig");
            return;
        }
        if (i > 0) {
            this.copydefault = true;
            copydefault().copydefault("configSize:" + i + " verify pass");
            return;
        }
        copydefault().EZpvd("configSize is zero. TBD");
    }

    /* JADX INFO: renamed from: o.nqB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nqB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
