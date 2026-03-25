package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.InterfaceC28532kcZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kdd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28589kdd extends android.widget.FrameLayout {
    public InterfaceC28588kdc KWHzl;
    public final C21663hHs OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28589kdd(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C28589kdd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback(@NotNull InterfaceC28588kdc interfaceC28588kdc) {
        Intrinsics.checkNotNullParameter(interfaceC28588kdc, "");
        this.KWHzl = interfaceC28588kdc;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:25) call: o.kdd.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C28589kdd(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28589kdd(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        C21663hHs c21663hHsCopydefault = C21663hHs.copydefault(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(c21663hHsCopydefault, "");
        this.OLrzqt = c21663hHsCopydefault;
    }

    public final void setData(@NotNull java.util.List<? extends InterfaceC28532kcZ> list) {
        int iKWHzl;
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.getRoot().removeAllViews();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            InterfaceC28532kcZ interfaceC28532kcZ = (InterfaceC28532kcZ) obj;
            if (i == 0) {
                iKWHzl = 0;
            } else {
                android.content.Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iKWHzl = C55298xhM.KWHzl(12.0f, context);
            }
            android.view.View viewKWHzl = KWHzl(interfaceC28532kcZ, iKWHzl);
            if (viewKWHzl != null) {
                viewKWHzl.setOnClickListener(new StateListAnimator(viewKWHzl, 1000L, this, interfaceC28532kcZ));
                viewKWHzl.setTag(java.lang.Integer.valueOf(i));
                this.OLrzqt.getRoot().addView(viewKWHzl);
            }
            i++;
        }
    }

    public final android.view.View KWHzl(int i) {
        return this.OLrzqt.getRoot().findViewWithTag(java.lang.Integer.valueOf(i));
    }

    public final android.view.View KWHzl(InterfaceC28532kcZ interfaceC28532kcZ, int i) {
        if (interfaceC28532kcZ instanceof InterfaceC28532kcZ.TaskDescription) {
            return AEQbTJ((InterfaceC28532kcZ.TaskDescription) interfaceC28532kcZ, i);
        }
        if (interfaceC28532kcZ instanceof InterfaceC28532kcZ.Application) {
            return copydefault((InterfaceC28532kcZ.Application) interfaceC28532kcZ, i);
        }
        return null;
    }

    public static /* synthetic */ android.widget.ImageView createImageView$default(C28589kdd c28589kdd, InterfaceC28532kcZ.TaskDescription taskDescription, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c28589kdd.AEQbTJ(taskDescription, i);
    }

    public final android.widget.ImageView AEQbTJ(InterfaceC28532kcZ.TaskDescription taskDescription, int i) {
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        android.content.Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(20.0f, context);
        android.content.Context context2 = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(iCopydefault, C55298xhM.KWHzl(20.0f, context2));
        layoutParams.setMargins(i, 0, 0, 0);
        imageView.setLayoutParams(layoutParams);
        if (taskDescription.KWHzl().length() > 0) {
            C33054mpH.AEQbTJ(imageView, taskDescription.KWHzl());
            return imageView;
        }
        java.lang.Integer numOLrzqt = taskDescription.OLrzqt();
        if (numOLrzqt != null) {
            android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(getContext(), numOLrzqt.intValue());
            if (drawable != null) {
                drawable.setTint(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            } else {
                drawable = null;
            }
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        return imageView;
    }

    public static /* synthetic */ C55052xcf createChip$default(C28589kdd c28589kdd, InterfaceC28532kcZ.Application application, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c28589kdd.copydefault(application, i);
    }

    public final C55052xcf copydefault(InterfaceC28532kcZ.Application application, int i) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        C55052xcf c55052xcf = new C55052xcf(context, null, 2, null);
        LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
        layoutParams.setMargins(i, 0, 0, 0);
        c55052xcf.setLayoutParams(layoutParams);
        c55052xcf.setOKDSSize(-5);
        c55052xcf.setTitle(application.AEQbTJ());
        return c55052xcf;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.KWHzl = null;
    }

    /* JADX INFO: renamed from: o.kdd$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C28589kdd EZpvd;
        public final /* synthetic */ InterfaceC28532kcZ KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C28589kdd c28589kdd, InterfaceC28532kcZ interfaceC28532kcZ) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c28589kdd;
            this.KWHzl = interfaceC28532kcZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                InterfaceC28588kdc interfaceC28588kdc = this.EZpvd.KWHzl;
                if (interfaceC28588kdc != null) {
                    interfaceC28588kdc.EZpvd(this.KWHzl);
                }
            }
        }
    }
}
