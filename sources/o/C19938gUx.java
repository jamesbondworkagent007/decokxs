package o;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gUx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19938gUx extends LinearLayoutCompat {
    public final C23525hzq EZpvd;
    public boolean KWHzl;
    public int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19938gUx(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        C23525hzq c23525hzqCopydefault = C23525hzq.copydefault(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c23525hzqCopydefault, "");
        this.EZpvd = c23525hzqCopydefault;
        this.KWHzl = true;
        setOrientation(1);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.djBIcL);
        if (drawable != null) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt = C55298xhM.OLrzqt(12, context2);
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(12, context3));
        } else {
            drawable = null;
        }
        TextViewCompat.setCompoundDrawablesRelative(copydefault(), drawable, null, null, null);
        EZpvd().setOnEnableAddStrategyButtonListener(new Function2() { // from class: o.gUC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C19938gUx.OLrzqt(this.copydefault, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Integer) obj2).intValue());
            }
        });
        EZpvd().setOnErrorMessageVisibilityChangedListener(new Function1() { // from class: o.gUz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19938gUx.OLrzqt(this.EZpvd, (java.lang.Integer) obj);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19938gUx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        C23525hzq c23525hzqCopydefault = C23525hzq.copydefault(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c23525hzqCopydefault, "");
        this.EZpvd = c23525hzqCopydefault;
        this.KWHzl = true;
        setOrientation(1);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.djBIcL);
        if (drawable != null) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt = C55298xhM.OLrzqt(12, context2);
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(12, context3));
        } else {
            drawable = null;
        }
        TextViewCompat.setCompoundDrawablesRelative(copydefault(), drawable, null, null, null);
        EZpvd().setOnEnableAddStrategyButtonListener(new Function2() { // from class: o.gUC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C19938gUx.OLrzqt(this.copydefault, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Integer) obj2).intValue());
            }
        });
        EZpvd().setOnErrorMessageVisibilityChangedListener(new Function1() { // from class: o.gUz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19938gUx.OLrzqt(this.EZpvd, (java.lang.Integer) obj);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19938gUx(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C23525hzq c23525hzqCopydefault = C23525hzq.copydefault(android.view.LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(c23525hzqCopydefault, "");
        this.EZpvd = c23525hzqCopydefault;
        this.KWHzl = true;
        setOrientation(1);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), C52761wXj.TaskDescription.djBIcL);
        if (drawable != null) {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            int iOLrzqt = C55298xhM.OLrzqt(12, context2);
            android.content.Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "");
            drawable.setBounds(0, 0, iOLrzqt, C55298xhM.OLrzqt(12, context3));
        } else {
            drawable = null;
        }
        TextViewCompat.setCompoundDrawablesRelative(copydefault(), drawable, null, null, null);
        EZpvd().setOnEnableAddStrategyButtonListener(new Function2() { // from class: o.gUC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C19938gUx.OLrzqt(this.copydefault, ((java.lang.Boolean) obj).booleanValue(), ((java.lang.Integer) obj2).intValue());
            }
        });
        EZpvd().setOnErrorMessageVisibilityChangedListener(new Function1() { // from class: o.gUz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19938gUx.OLrzqt(this.EZpvd, (java.lang.Integer) obj);
            }
        });
    }

    public final gUB EZpvd() {
        gUB gub = this.EZpvd.EZpvd;
        Intrinsics.checkNotNullExpressionValue(gub, "");
        return gub;
    }

    public final android.widget.TextView AEQbTJ() {
        android.widget.TextView textView = this.EZpvd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final android.widget.TextView copydefault() {
        android.widget.TextView textView = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    public final void setBtnAddStrategyEnabled(boolean z) {
        this.KWHzl = z;
        int i = z ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe;
        int i2 = z ? C23274hvD.ActionBar.fJNWhG : 0;
        android.content.res.ColorStateList colorStateList = ContextCompat.getColorStateList(getContext(), i);
        copydefault().setBackgroundResource(i2);
        copydefault().setTextColor(colorStateList);
        TextViewCompat.setCompoundDrawableTintList(copydefault(), colorStateList);
    }

    public static final Unit OLrzqt(C19938gUx c19938gUx, boolean z, int i) {
        c19938gUx.setBtnAddStrategyEnabled(z);
        c19938gUx.OLrzqt = i;
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C19938gUx c19938gUx, java.lang.Integer num) {
        if (num == null) {
            c19938gUx.AEQbTJ().setVisibility(8);
            return Unit.INSTANCE;
        }
        c19938gUx.AEQbTJ().setVisibility(0);
        c19938gUx.AEQbTJ().setText(num.intValue());
        return Unit.INSTANCE;
    }
}
