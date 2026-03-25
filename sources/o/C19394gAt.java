package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gAt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19394gAt extends ConstraintLayout {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public final AbstractC17130eww KWHzl;
    public Function0<Unit> OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19394gAt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C13754dXa.TaskDescription.fGT, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC17130eww abstractC17130eww = (AbstractC17130eww) viewDataBindingInflate;
        this.KWHzl = abstractC17130eww;
        this.EZpvd = "";
        this.AEQbTJ = "";
        abstractC17130eww.KWHzl.setClickable(false);
        abstractC17130eww.KWHzl.setFocusable(false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19394gAt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19394gAt(@NotNull android.content.Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void setOnAssetVisibilityToggled(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = function0;
        this.KWHzl.KWHzl.setClickable(true);
        this.KWHzl.KWHzl.setFocusable(true);
        ConstraintLayout constraintLayout = this.KWHzl.KWHzl;
        constraintLayout.setOnClickListener(new TaskDescription(constraintLayout, 1000L, this));
    }

    public static /* synthetic */ void setCoinCount$default(C19394gAt c19394gAt, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        c19394gAt.setCoinCount(str, str2);
    }

    public final void setCoinCount(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        android.widget.TextView textView = this.KWHzl.EZpvd;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)), 0, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        this.KWHzl.EZpvd.setTypeface(ResourcesCompat.getFont(getContext(), C52761wXj.Dialog.EZpvd));
        this.KWHzl.EZpvd.requestLayout();
    }

    public final void setValuation(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.KWHzl.copydefault.setText(str);
    }

    public final void EZpvd() {
        this.KWHzl.copydefault.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.gAt$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C19394gAt KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C19394gAt c19394gAt) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.KWHzl = c19394gAt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            Function0 function0;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (!C13912dbY.copydefault.OLrzqt(!r7.djBIcL()) || (function0 = this.KWHzl.OLrzqt) == null) {
                    return;
                }
                function0.invoke();
            }
        }
    }
}
