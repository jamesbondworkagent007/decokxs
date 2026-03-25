package me.relex.circleindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;
import o.C59544ziz;

/* JADX INFO: loaded from: classes13.dex */
public class SnackbarBehavior extends CoordinatorLayout.Behavior<C59544ziz> {
    public static int AEQbTJ;
    public static int OLrzqt;

    public SnackbarBehavior() {
    }

    public SnackbarBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX DEBUG: Method merged with bridge method: layoutDependsOn(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean layoutDependsOn(@NonNull CoordinatorLayout coordinatorLayout, @NonNull C59544ziz c59544ziz, @NonNull View view) {
        return view instanceof Snackbar.SnackbarLayout;
    }

    /* JADX DEBUG: Method merged with bridge method: onDependentViewChanged(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean onDependentViewChanged(@NonNull CoordinatorLayout coordinatorLayout, @NonNull C59544ziz c59544ziz, @NonNull View view) {
        c59544ziz.setTranslationY(EZpvd(coordinatorLayout, c59544ziz));
        return true;
    }

    public final float EZpvd(CoordinatorLayout coordinatorLayout, C59544ziz c59544ziz) {
        List<View> dependencies = coordinatorLayout.getDependencies(c59544ziz);
        int size = dependencies.size();
        float fMin = 0.0f;
        for (int i = 0; i < size; i++) {
            View view = dependencies.get(i);
            if ((view instanceof Snackbar.SnackbarLayout) && coordinatorLayout.doViewsOverlap(c59544ziz, view)) {
                fMin = Math.min(fMin, view.getTranslationY() - view.getHeight());
            }
        }
        return fMin;
    }

    public static int AEQbTJ() {
        int i = OLrzqt;
        int i2 = i % 6877658;
        OLrzqt = i + 1;
        if (i2 != 0) {
            return AEQbTJ;
        }
        int i3 = (int) Runtime.getRuntime().totalMemory();
        AEQbTJ = i3;
        return i3;
    }
}
