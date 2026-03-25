package o;

import android.view.ViewGroup;
import com.github.mikephil.charting.components.MarkerView;
import com.github.mikephil.charting.utils.MPPointF;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vsT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51725vsT extends MarkerView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51725vsT(@NotNull android.content.Context context) {
        super(context, C48033uCm.Activity.FQNKFG);
        Intrinsics.checkNotNullParameter(context, "");
        copydefault();
    }

    public final void copydefault() {
        C33566myq c33566myq = C33566myq.EZpvd;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iEZpvd = c33566myq.EZpvd(context);
        android.content.Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        float fAEQbTJ = C33052mpF.AEQbTJ(300.0f, context2);
        android.view.View viewFindViewById = findViewById(C48033uCm.Application.getRepeatMode);
        if (viewFindViewById != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.height = C33129mqd.AhwBna(java.lang.Float.valueOf(fAEQbTJ * 2));
            layoutParams.width = iEZpvd;
            viewFindViewById.setLayoutParams(layoutParams);
        }
    }

    public final void setPointBg(boolean z) {
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(C48033uCm.Application.sendEvent);
        if (C33492mxV.OLrzqt()) {
            imageView.setActivated(true);
        } else if (AEQbTJ()) {
            imageView.setSelected(z);
        } else {
            imageView.setSelected(!z);
        }
    }

    @Override // com.github.mikephil.charting.components.MarkerView, com.github.mikephil.charting.components.IMarker
    public MPPointF getOffsetForDrawingAtPoint(float f, float f2) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new MPPointF(C33052mpF.AEQbTJ(-3.0f, context), (-getHeight()) / 2);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        copydefault();
    }

    public final boolean AEQbTJ() {
        return C33512mxp.AEQbTJ.isConnected() == 0;
    }
}
