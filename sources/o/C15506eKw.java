package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eKw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15506eKw extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15506eKw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setFixAutoSizeText(java.lang.CharSequence charSequence) {
        int i;
        int autoSizeMinTextSize;
        int autoSizeMaxTextSize;
        boolean z = TextViewCompat.getAutoSizeTextType(this) != 0;
        if (z) {
            autoSizeMinTextSize = TextViewCompat.getAutoSizeMinTextSize(this);
            autoSizeMaxTextSize = TextViewCompat.getAutoSizeMaxTextSize(this);
            if (autoSizeMinTextSize <= 0 || autoSizeMaxTextSize <= autoSizeMinTextSize) {
                z = false;
                i = 0;
            } else {
                int autoSizeStepGranularity = TextViewCompat.getAutoSizeStepGranularity(this);
                i = autoSizeStepGranularity >= 0 ? autoSizeStepGranularity : 1;
                TextViewCompat.setAutoSizeTextTypeWithDefaults(this, 0);
                setTextSize(0, autoSizeMaxTextSize);
                measure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
                setRight(getLeft());
                setBottom(getTop());
                requestLayout();
            }
        } else {
            i = 0;
            autoSizeMinTextSize = 0;
            autoSizeMaxTextSize = 0;
        }
        super.setText(charSequence);
        if (z) {
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this, autoSizeMinTextSize, autoSizeMaxTextSize, i, 0);
        }
    }
}
