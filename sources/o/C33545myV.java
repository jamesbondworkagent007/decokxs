package o;

import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.myV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33545myV extends AppCompatCheckBox {
    public CompoundButton.OnCheckedChangeListener copydefault;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C33545myV(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C33545myV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33545myV(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setCheckedIgnoreListen(boolean z) {
        super.setOnCheckedChangeListener(null);
        setChecked(z);
        super.setOnCheckedChangeListener(this.copydefault);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.copydefault = onCheckedChangeListener;
        super.setOnCheckedChangeListener(onCheckedChangeListener);
    }
}
