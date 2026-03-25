package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.ImageTextSelectData;
import com.okinc.business.dexlogic.main.swap.trade.input.bean.VerticalEditTextGroupData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ikx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24818ikx extends android.widget.LinearLayout {
    public C21511hCb KWHzl;

    /* JADX INFO: renamed from: o.ikx$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        public Activity(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.AEQbTJ = str2;
            this.KWHzl = str3;
            this.EZpvd = str4;
        }
    }

    public C24818ikx(android.content.Context context) {
        super(context);
        EZpvd(context, null);
    }

    public C24818ikx(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        EZpvd(context, attributeSet);
    }

    public C24818ikx(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        EZpvd(context, attributeSet);
    }

    public final void EZpvd(android.content.Context context, android.util.AttributeSet attributeSet) {
        if (context == null) {
            return;
        }
        this.KWHzl = C21511hCb.EZpvd(android.view.LayoutInflater.from(context), this);
    }

    public final void setTextSelectCallback(@NotNull final Function1<? super C24818ikx, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb != null) {
            c21511hCb.copydefault.setSelectClick(new Function1() { // from class: o.ikA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24818ikx.copydefault(function1, this, (C24819iky) obj);
                }
            });
        }
    }

    public static final Unit copydefault(Function1 function1, C24818ikx c24818ikx, C24819iky c24819iky) {
        Intrinsics.checkNotNullParameter(c24819iky, "");
        function1.invoke(c24818ikx);
        return Unit.INSTANCE;
    }

    public final void setSelectData(@NotNull ImageTextSelectData imageTextSelectData) {
        C24819iky c24819iky;
        Intrinsics.checkNotNullParameter(imageTextSelectData, "");
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (c24819iky = c21511hCb.copydefault) == null) {
            return;
        }
        c24819iky.setSelectData(imageTextSelectData);
    }

    public final ImageTextSelectData AEQbTJ() {
        C24819iky c24819iky;
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (c24819iky = c21511hCb.copydefault) == null) {
            return null;
        }
        return c24819iky.AEQbTJ();
    }

    public final VerticalEditTextGroupData KWHzl() {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return null;
        }
        return viewOnClickListenerC24771ikC.KWHzl();
    }

    public final void setEditData(@NotNull VerticalEditTextGroupData verticalEditTextGroupData) {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        Intrinsics.checkNotNullParameter(verticalEditTextGroupData, "");
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.setContentData(verticalEditTextGroupData);
    }

    public final void setHighRiskVisible(boolean z) {
        AppCompatTextView appCompatTextView;
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (appCompatTextView = c21511hCb.AEQbTJ) == null) {
            return;
        }
        appCompatTextView.setVisibility(z ? 0 : 8);
    }

    public final void EZpvd(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        Intrinsics.checkNotNullParameter(function2, "");
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.OLrzqt(function2);
    }

    public final void AEQbTJ(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        Intrinsics.checkNotNullParameter(function2, "");
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.KWHzl(function2);
    }

    public final void KWHzl(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        Intrinsics.checkNotNullParameter(function2, "");
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.EZpvd(function2);
    }

    public final void OLrzqt(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        Intrinsics.checkNotNullParameter(function2, "");
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.AEQbTJ(function2);
    }

    public final void KWHzl(@NotNull View.OnFocusChangeListener onFocusChangeListener) {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        Intrinsics.checkNotNullParameter(onFocusChangeListener, "");
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.copydefault(onFocusChangeListener);
    }

    public final void gEmmrt() {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.gEmmrt();
    }

    public static /* synthetic */ void setInputHintContent$default(C24818ikx c24818ikx, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        c24818ikx.setInputHintContent(z, str);
    }

    public final void setInputHintContent(boolean z, @NotNull java.lang.String str) {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        Intrinsics.checkNotNullParameter(str, "");
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.setInputHintContent(z, str);
    }

    public static /* synthetic */ void setEnableEdit$default(C24818ikx c24818ikx, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c24818ikx.setEnableEdit(z);
    }

    public final void setEnableEdit(boolean z) {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.setEnableEdit(z);
    }

    public final void setInputConfig(@NotNull Function1<? super C24806ikl, Unit> function1) {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        Intrinsics.checkNotNullParameter(function1, "");
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.setInputConfig(function1);
    }

    public final void setClickCallback(@NotNull Function0<Unit> function0) {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        Intrinsics.checkNotNullParameter(function0, "");
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.setClickCallback(function0);
    }

    public final void setClickValueDifferenceCallBack(@NotNull Function0<Unit> function0) {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        Intrinsics.checkNotNullParameter(function0, "");
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.setClickValueDifferenceCallBack(function0);
    }

    public final void setInputFocusCallBack(@NotNull Function0<Unit> function0) {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        Intrinsics.checkNotNullParameter(function0, "");
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.setInputFocusCallBack(function0);
    }

    public final void copydefault() {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.OLrzqt();
    }

    public final void setStartEndMargin(int i) {
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb != null) {
            ViewGroup.LayoutParams layoutParams = c21511hCb.KWHzl.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart(i);
                requestLayout();
            }
        }
    }

    public final void setLabelSecondColor(int i) {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.setLabelSecondColor(i);
    }

    public final void EZpvd() {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.copydefault();
    }

    public final void setCheckData(@NotNull java.lang.String str) {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        Intrinsics.checkNotNullParameter(str, "");
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.setCheckData(str);
    }

    public final C24806ikl OLrzqt() {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb == null || (viewOnClickListenerC24771ikC = c21511hCb.KWHzl) == null) {
            return null;
        }
        return viewOnClickListenerC24771ikC.AEQbTJ();
    }

    public final void setAccessibilityIds(@NotNull Activity activity) {
        ViewOnClickListenerC24771ikC viewOnClickListenerC24771ikC;
        C24819iky c24819iky;
        C24819iky c24819iky2;
        Intrinsics.checkNotNullParameter(activity, "");
        C21511hCb c21511hCb = this.KWHzl;
        if (c21511hCb != null && (c24819iky2 = c21511hCb.copydefault) != null) {
            c24819iky2.setContentDescription(activity.OLrzqt());
        }
        C21511hCb c21511hCb2 = this.KWHzl;
        if (c21511hCb2 != null && (c24819iky = c21511hCb2.copydefault) != null) {
            c24819iky.setTokenNameA11yPrefix(activity.EZpvd());
        }
        C21511hCb c21511hCb3 = this.KWHzl;
        if (c21511hCb3 == null || (viewOnClickListenerC24771ikC = c21511hCb3.KWHzl) == null) {
            return;
        }
        viewOnClickListenerC24771ikC.setAccessibilityIds(activity.copydefault(), activity.KWHzl());
    }
}
