package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.immomo.mls.fun.constants.TextAlign;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C49511upt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uzz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC50047uzz extends android.widget.FrameLayout {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public java.lang.String AEQbTJ;
    public final AbstractC49536uqR EZpvd;
    public Function0<Unit> OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC50047uzz(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC50047uzz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public abstract void KWHzl();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHintClickCallBack(Function0<Unit> function0) {
        this.OLrzqt = function0;
    }

    public final void setTitleTextColor(int i) {
    }

    /* JADX INFO: renamed from: o.uzz$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ AbstractC50047uzz AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, AbstractC50047uzz abstractC50047uzz) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = abstractC50047uzz;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C57594ylP.AEQbTJ(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C57594ylP.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.KWHzl();
            }
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:28) call: o.uzz.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ AbstractC50047uzz(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC50047uzz(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C49511upt.StateListAnimator.values, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.EZpvd = (AbstractC49536uqR) viewDataBindingInflate;
        EZpvd();
    }

    public final void EZpvd() {
        ConstraintLayout constraintLayout = this.EZpvd.EZpvd;
        constraintLayout.setOnClickListener(new TaskDescription(constraintLayout, 1000L, this));
        this.EZpvd.KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.uzB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC50047uzz.EZpvd(this.KWHzl, view);
            }
        });
        this.EZpvd.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.uzA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AbstractC50047uzz.AEQbTJ(this.EZpvd, view);
            }
        });
    }

    public static final void EZpvd(AbstractC50047uzz abstractC50047uzz, android.view.View view) {
        android.view.View viewInflate = android.view.LayoutInflater.from(abstractC50047uzz.getContext()).inflate(C49511upt.StateListAnimator.QKVWgx, (android.view.ViewGroup) null, false);
        android.content.Context context = abstractC50047uzz.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        Intrinsics.copydefault(viewInflate);
        viewOnClickListenerC54939xaY.EZpvd(viewInflate);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C49511upt.Activity.isConnected);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.uzx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                AbstractC50047uzz.OLrzqt(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AEQbTJ(AbstractC50047uzz abstractC50047uzz, android.view.View view) {
        Function0<Unit> function0 = abstractC50047uzz.OLrzqt;
        if (function0 != null) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        android.content.Context context = abstractC50047uzz.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(abstractC50047uzz.copydefault);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C49511upt.Activity.isConnected);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.uzy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                AbstractC50047uzz.EZpvd(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void setTitleText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd.djBIcL.setText(str);
        this.EZpvd.djBIcL.setVisibility(0);
    }

    public final void setTitleColor(int i) {
        this.EZpvd.djBIcL.setTextColor(ContextCompat.getColor(getContext(), i));
    }

    public final void setTitlePaddingLeft(int i) {
        android.widget.TextView textView = this.EZpvd.djBIcL;
        textView.setPaddingRelative(i, textView.getPaddingTop(), this.EZpvd.djBIcL.getPaddingRight(), this.EZpvd.djBIcL.getPaddingBottom());
    }

    public static /* synthetic */ void setTypeText$default(AbstractC50047uzz abstractC50047uzz, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTypeText");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC50047uzz.setTypeText(str, z);
    }

    public final void setTypeText(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            this.EZpvd.OLrzqt.setText(str);
        } else {
            this.EZpvd.OLrzqt.setText("");
            setTitleText(str);
        }
    }

    public final void setSelectedTypeColor(@androidx.annotation.ColorRes int i) {
        this.EZpvd.OLrzqt.setTextColor(C33070mpX.copydefault(i));
    }

    public static /* synthetic */ void setTypeTextCopy$default(AbstractC50047uzz abstractC50047uzz, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTypeTextCopy");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        abstractC50047uzz.setTypeTextCopy(str, z);
    }

    public final void setTypeTextCopy(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!z) {
            this.EZpvd.valueOf.setText(str);
        } else {
            this.EZpvd.valueOf.setText("");
            setTitleText(str);
        }
    }

    public final void setHintText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        if (str.length() == 0) {
            this.EZpvd.KWHzl.setVisibility(8);
        } else {
            this.EZpvd.KWHzl.setVisibility(0);
        }
    }

    public final void setContentHintText(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        if (str.length() == 0) {
            this.EZpvd.AEQbTJ.setVisibility(8);
        } else {
            this.EZpvd.AEQbTJ.setVisibility(0);
        }
    }

    public final void setTitleAppearance(int i) {
        TextViewCompat.setTextAppearance(this.EZpvd.djBIcL, i);
    }

    public final void setCorePaddingLeft(float f) {
        this.EZpvd.EZpvd.setPaddingRelative(yII.EZpvd(f), this.EZpvd.EZpvd.getPaddingTop(), this.EZpvd.EZpvd.getPaddingRight(), this.EZpvd.EZpvd.getPaddingBottom());
    }

    public final void setContentHeight(int i) {
        this.EZpvd.EZpvd.getLayoutParams().height = i;
    }

    public final void setTitleStart() {
        android.widget.TextView textView = this.EZpvd.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        android.widget.ImageView imageView = this.EZpvd.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        imageView.setVisibility(8);
        this.EZpvd.OLrzqt.getLayoutParams().width = -1;
        this.EZpvd.OLrzqt.setGravity(TextAlign.LEFT);
    }

    public final void setDrawableEnd(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        }
        this.EZpvd.OLrzqt.setCompoundDrawablesRelative(null, null, drawable, null);
    }

    public final void setArrowDirection(int i) {
        this.EZpvd.OLrzqt.setSelected(i == 1);
    }

    public final void setArrowColor(int i) {
        this.EZpvd.OLrzqt.setCompoundDrawableTintList(android.content.res.ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: o.uzz$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uzz.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
