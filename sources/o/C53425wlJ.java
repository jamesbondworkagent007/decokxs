package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wlJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53425wlJ extends ConstraintLayout {
    public java.lang.String KWHzl;
    public uXB copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53425wlJ(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53425wlJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.wlJ.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53425wlJ(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53425wlJ(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = "";
        if (isInEditMode()) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.AEQbTJ);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.copydefault, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.wlH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53425wlJ.AEQbTJ(this.EZpvd, ((java.lang.Integer) obj).intValue());
            }
        });
        typedArrayObtainStyledAttributes.recycle();
        KWHzl();
    }

    public static final Unit AEQbTJ(C53425wlJ c53425wlJ, int i) {
        c53425wlJ.KWHzl = C33070mpX.AYXKKw(i);
        return Unit.INSTANCE;
    }

    private final void KWHzl() {
        C55320xhi c55320xhiKWHzl;
        uXB uxb = (uXB) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.GPCHlQ, this, true);
        this.copydefault = uxb;
        if (uxb == null) {
            Intrinsics.gEmmrt("");
            uxb = null;
        }
        C55312xha c55312xhaValueOf = uxb.copydefault.valueOf();
        if (c55312xhaValueOf == null || (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(this.KWHzl);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        uXB uxb = this.copydefault;
        if (uxb == null) {
            Intrinsics.gEmmrt("");
            uxb = null;
        }
        uxb.copydefault.setText(str);
        this.KWHzl = str;
    }

    public final void setWarning(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        uXB uxb = this.copydefault;
        uXB uxb2 = null;
        if (uxb == null) {
            Intrinsics.gEmmrt("");
            uxb = null;
        }
        AppCompatTextView appCompatTextView = uxb.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true ? 0 : 8);
        uXB uxb3 = this.copydefault;
        if (uxb3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uxb2 = uxb3;
        }
        uxb2.AEQbTJ.setText(str);
    }

    public final void setEnable(boolean z) {
        uXB uxb = this.copydefault;
        if (uxb == null) {
            Intrinsics.gEmmrt("");
            uxb = null;
        }
        uxb.KWHzl.setEnabled(z);
    }

    public final void setClickAction(@NotNull View.OnClickListener onClickListener) {
        C55320xhi c55320xhiKWHzl;
        Intrinsics.checkNotNullParameter(onClickListener, "");
        uXB uxb = this.copydefault;
        uXB uxb2 = null;
        if (uxb == null) {
            Intrinsics.gEmmrt("");
            uxb = null;
        }
        C55312xha c55312xhaValueOf = uxb.copydefault.valueOf();
        if (c55312xhaValueOf != null) {
            c55312xhaValueOf.OLrzqt();
        }
        uXB uxb3 = this.copydefault;
        if (uxb3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            uxb2 = uxb3;
        }
        C55312xha c55312xhaValueOf2 = uxb2.copydefault.valueOf();
        if (c55312xhaValueOf2 == null || (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setOnClickListener(new TaskDescription(c55320xhiKWHzl, 1000L, onClickListener));
    }

    public final void setOnCheckedChangeListener(@NotNull CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        Intrinsics.checkNotNullParameter(onCheckedChangeListener, "");
        uXB uxb = this.copydefault;
        if (uxb == null) {
            Intrinsics.gEmmrt("");
            uxb = null;
        }
        uxb.KWHzl.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public final void setChecked(boolean z) {
        uXB uxb = this.copydefault;
        if (uxb == null) {
            Intrinsics.gEmmrt("");
            uxb = null;
        }
        uxb.KWHzl.setChecked(z);
    }

    public final boolean OLrzqt() {
        uXB uxb = this.copydefault;
        if (uxb == null) {
            Intrinsics.gEmmrt("");
            uxb = null;
        }
        return uxb.KWHzl.isChecked();
    }

    /* JADX INFO: renamed from: o.wlJ$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ View.OnClickListener KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, View.OnClickListener onClickListener) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.onClick((C55320xhi) this.AEQbTJ);
            }
        }
    }
}
