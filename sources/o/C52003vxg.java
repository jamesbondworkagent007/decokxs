package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vxg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C52003vxg extends ConstraintLayout {
    public final android.widget.TextView AEQbTJ;
    public final android.widget.TextView OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52003vxg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52003vxg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.vxg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52003vxg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52003vxg(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C48033uCm.Activity.RidNCX, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        this.AEQbTJ = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.ActivityResultContract);
        this.OLrzqt = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.IKQXqd);
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.gHZMYf);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.OcIXYQ, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.vxf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52003vxg.KWHzl(this.KWHzl, ((java.lang.Integer) obj).intValue());
                }
            });
            C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.sSMYrx, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.vxe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52003vxg.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            });
            C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.QKVWgx, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.vxd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52003vxg.KWHzl(this.KWHzl, context, ((java.lang.Integer) obj).intValue());
                }
            });
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static final Unit KWHzl(C52003vxg c52003vxg, int i) {
        c52003vxg.AEQbTJ.setText(C33070mpX.AYXKKw(i));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C52003vxg c52003vxg, int i) {
        c52003vxg.OLrzqt.setText(C33070mpX.AYXKKw(i));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52003vxg c52003vxg, android.content.Context context, int i) {
        c52003vxg.OLrzqt.setTextAppearance(context, i);
        return Unit.INSTANCE;
    }

    public final void setTitle(@androidx.annotation.StringRes int i) {
        this.AEQbTJ.setText(i);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ.setText(str);
    }

    public final void setContent(@androidx.annotation.StringRes int i) {
        this.OLrzqt.setText(i);
    }

    public final void setContent(java.lang.String str) {
        this.OLrzqt.setText(str);
    }
}
