package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55065xcs implements InterfaceC55066xct, InterfaceC52764wXm {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final int AEQbTJ;
    public final android.view.View EZpvd;
    public int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC55066xct
    public void setOKDSSize(int i) {
        this.KWHzl = i;
    }

    public C55065xcs(@NotNull android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd = view;
        this.AEQbTJ = i;
        this.KWHzl = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.view.View)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-4 int) : (r2v0 int))
 A[MD:(android.view.View, int):void (m)] (LINE:16) call: o.xcs.<init>(android.view.View, int):void type: THIS */
    public /* synthetic */ C55065xcs(android.view.View view, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i2 & 2) != 0 ? -4 : i);
    }

    @Override // o.InterfaceC52764wXm
    public void OLrzqt(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = this.EZpvd.getContext().obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.fGT, i, i2);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        try {
            this.KWHzl = typedArrayObtainStyledAttributes.getInt(C52761wXj.PictureInPictureParams.getConnectivityMgr, this.AEQbTJ);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: o.xcs$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xcs.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
