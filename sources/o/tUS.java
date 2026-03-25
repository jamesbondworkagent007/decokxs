package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.okinc.planet.widget.SimpleLabelValuePairView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tUS extends ConstraintLayout {
    public final tUC EZpvd;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUS(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tUS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:14) call: o.tUS.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ tUS(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tUS(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        tUC tuc = new tUC(context, null, 0, 6, null);
        int iCopydefault = C55298xhM.copydefault(8.0f, context);
        tuc.setPadding(iCopydefault, iCopydefault, iCopydefault, iCopydefault);
        this.EZpvd = tuc;
        ShapeAppearanceModel shapeAppearanceModelBuild = new ShapeAppearanceModel.Builder().setAllCornerSizes(C55298xhM.EZpvd(4.0f, context)).build();
        Intrinsics.checkNotNullExpressionValue(shapeAppearanceModelBuild, "");
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelBuild);
        materialShapeDrawable.setFillColor(android.content.res.ColorStateList.valueOf(C33070mpX.OLrzqt(C52761wXj.Activity.idLUrz, context)));
        tuc.setBackground(materialShapeDrawable);
        addView(tuc, new ConstraintLayout.LayoutParams(-1, -2));
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tUS.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public final void setLabelValuePairs(@NotNull java.util.List<? extends SimpleLabelValuePairView.StateListAnimator> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            SimpleLabelValuePairView simpleLabelValuePairView = new SimpleLabelValuePairView(context, null, 0, 6, null);
            simpleLabelValuePairView.setContent((SimpleLabelValuePairView.StateListAnimator) obj);
            arrayList.add(simpleLabelValuePairView);
            i++;
        }
        tUC tuc = this.EZpvd;
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        tuc.KWHzl(arrayList, 1, 0, C55298xhM.copydefault(8.0f, context2));
    }
}
