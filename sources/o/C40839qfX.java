package o;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.market.widget.FlowedChipsView;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C52761wXj;
import o.pVX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qfX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40839qfX implements FlowedChipsView.Application {
    @Override // com.okinc.market.widget.FlowedChipsView.Application
    public <T extends FlowedChipsView.Application.Activity> android.view.View EZpvd(@NotNull android.content.Context context, @NotNull T t) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(t, "");
        android.content.res.ColorStateList colorStateList = new android.content.res.ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{ResourcesCompat.getColor(context.getResources(), C52761wXj.Activity.fdOvFl, null), ResourcesCompat.getColor(context.getResources(), C52761wXj.Activity.fdOvFl, null), ResourcesCompat.getColor(context.getResources(), C52761wXj.Activity.QwvEab, null)});
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(context.getResources().getDimension(C32113mPz.StateListAnimator.fetchVPNInfo));
        gradientDrawable.setColor(ResourcesCompat.getColor(context.getResources(), pVX.TaskDescription.DbNXlk, null));
        stateListDrawable.addState(new int[]{android.R.attr.state_selected}, gradientDrawable);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        android.widget.TextView textView = new android.widget.TextView(context);
        if (!textView.isInEditMode()) {
            TextViewCompat.setTextAppearance(textView, C52761wXj.LoaderManager.QOLQEE);
        }
        textView.setTextColor(colorStateList);
        textView.setBackground(stateListDrawable);
        textView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
        textView.setPadding((int) context.getResources().getDimension(C52761wXj.StateListAnimator.giSNqX), 0, (int) context.getResources().getDimension(C52761wXj.StateListAnimator.giSNqX), 0);
        textView.setMinWidth((int) context.getResources().getDimension(C52761wXj.StateListAnimator.DXXBbs));
        textView.setMinHeight((int) context.getResources().getDimension(C52761wXj.StateListAnimator.iwGUEr));
        OLrzqt(textView, t);
        textView.setGravity(17);
        return textView;
    }

    public <T extends FlowedChipsView.Application.Activity> void OLrzqt(@NotNull android.widget.TextView textView, @NotNull T t) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(t, "");
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setText(t.getItemText(context));
    }
}
