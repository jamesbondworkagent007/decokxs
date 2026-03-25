package o;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class qBY extends qBV {
    @Override // o.qBX, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        C42741rcD c42741rcDOLrzqt = OLrzqt();
        if (c42741rcDOLrzqt != null) {
            C55230xfy c55230xfy = c42741rcDOLrzqt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55230xfy, "");
            ViewGroup.LayoutParams layoutParams = c55230xfy.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = 0;
                marginLayoutParams.topMargin = 0;
                c55230xfy.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
