package o;

import android.view.View;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C31976mKx;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mLQ extends android.widget.FrameLayout {
    public AbstractC32043mNj EZpvd;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfirm(Function0<Unit> function0) {
        this.copydefault = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mLQ(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mLQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mLQ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C31976mKx.Application.OcIXYQ, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC32043mNj) viewDataBindingInflate;
        copydefault();
    }

    public final void copydefault() {
        this.EZpvd.OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.mLR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mLQ.AEQbTJ(this.copydefault, view);
            }
        });
    }

    public static final void AEQbTJ(mLQ mlq, android.view.View view) {
        Function0<Unit> function0 = mlq.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
