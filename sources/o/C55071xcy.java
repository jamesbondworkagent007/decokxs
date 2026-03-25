package o;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xcy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55071xcy extends AppCompatTextView {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public int AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55071xcy(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C55071xcy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:22) call: o.xcy.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C55071xcy(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55071xcy(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C52761wXj.PictureInPictureParams.AuCTel, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        setStyle(typedArrayObtainStyledAttributes.getInteger(C52761wXj.PictureInPictureParams.fARcdN, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void setStyle(int i) {
        this.AEQbTJ = i;
        AEQbTJ();
    }

    private final void AEQbTJ() {
        int iOLrzqt;
        int iOLrzqt2;
        int iOLrzqt3;
        C55280xgv c55280xgv = new C55280xgv();
        C55279xgu c55279xgu = new C55279xgu();
        int i = this.AEQbTJ;
        if (i < 3) {
            if (i == 0) {
                C33517mxu c33517mxu = C33517mxu.KWHzl;
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iOLrzqt3 = c33517mxu.OLrzqt(context, C52761wXj.ActionBar.DTwDnp);
            } else if (i == 1) {
                C33517mxu c33517mxu2 = C33517mxu.KWHzl;
                android.content.Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                iOLrzqt3 = c33517mxu2.OLrzqt(context2, C52761wXj.ActionBar.AxsJAY);
            } else {
                C33517mxu c33517mxu3 = C33517mxu.KWHzl;
                android.content.Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "");
                iOLrzqt3 = c33517mxu3.OLrzqt(context3, C52761wXj.ActionBar.sSMYrx);
            }
            setTextColor(iOLrzqt3);
            c55279xgu.isConnected(ContextCompat.getColor(getContext(), C52761wXj.Activity.aBDePw));
            c55280xgv.KWHzl(this, c55279xgu);
            setGravity(8388613);
            return;
        }
        if (i == 3) {
            C33517mxu c33517mxu4 = C33517mxu.KWHzl;
            android.content.Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "");
            iOLrzqt = c33517mxu4.OLrzqt(context4, C52761wXj.ActionBar.QOLQEE);
        } else if (i == 4) {
            C33517mxu c33517mxu5 = C33517mxu.KWHzl;
            android.content.Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "");
            iOLrzqt = c33517mxu5.OLrzqt(context5, C52761wXj.ActionBar.zuBGHE);
        } else {
            C33517mxu c33517mxu6 = C33517mxu.KWHzl;
            android.content.Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "");
            iOLrzqt = c33517mxu6.OLrzqt(context6, C52761wXj.ActionBar.gHZMYf);
        }
        setTextColor(iOLrzqt);
        android.content.Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "");
        int iOLrzqt4 = C55298xhM.OLrzqt(12, context7);
        android.content.Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "");
        int iOLrzqt5 = C55298xhM.OLrzqt(4, context8);
        android.content.Context context9 = getContext();
        Intrinsics.checkNotNullExpressionValue(context9, "");
        int iOLrzqt6 = C55298xhM.OLrzqt(12, context9);
        android.content.Context context10 = getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "");
        setPaddingRelative(iOLrzqt4, iOLrzqt5, iOLrzqt6, C55298xhM.OLrzqt(4, context10));
        c55279xgu.AkhnZx(0);
        android.content.Context context11 = getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "");
        c55279xgu.OLrzqt(C55298xhM.EZpvd(4.0f, context11));
        int i2 = this.AEQbTJ;
        if (i2 == 3) {
            C33517mxu c33517mxu7 = C33517mxu.KWHzl;
            android.content.Context context12 = getContext();
            Intrinsics.checkNotNullExpressionValue(context12, "");
            iOLrzqt2 = c33517mxu7.OLrzqt(context12, C52761wXj.ActionBar.hUfVAv);
        } else if (i2 == 4) {
            C33517mxu c33517mxu8 = C33517mxu.KWHzl;
            android.content.Context context13 = getContext();
            Intrinsics.checkNotNullExpressionValue(context13, "");
            iOLrzqt2 = c33517mxu8.OLrzqt(context13, C52761wXj.ActionBar.fZBcTu);
        } else {
            C33517mxu c33517mxu9 = C33517mxu.KWHzl;
            android.content.Context context14 = getContext();
            Intrinsics.checkNotNullExpressionValue(context14, "");
            iOLrzqt2 = c33517mxu9.OLrzqt(context14, C52761wXj.ActionBar.gkJEwt);
        }
        c55279xgu.isConnected(iOLrzqt2);
        c55280xgv.KWHzl(this, c55279xgu);
        setGravity(17);
    }

    public final void setStyleWithTheme(int i) {
        setStyle(i);
    }

    /* JADX INFO: renamed from: o.xcy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xcy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
