package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C49511upt;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wlE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53420wlE extends ConstraintLayout implements InterfaceC50054vAe {
    public AbstractC50961vdy AEQbTJ;
    public Function1<? super android.view.View, Unit> KWHzl;
    public java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53420wlE(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53420wlE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC50054vAe
    public void AEQbTJ(@NotNull Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:21) call: o.wlE.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53420wlE(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53420wlE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "";
        if (isInEditMode()) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.aKErDB);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.dxcTrN, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.wlI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53420wlE.AEQbTJ(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        typedArrayObtainStyledAttributes.recycle();
        KWHzl();
    }

    public static final Unit AEQbTJ(C53420wlE c53420wlE, int i) {
        c53420wlE.OLrzqt = C33070mpX.AYXKKw(i);
        return Unit.INSTANCE;
    }

    private final void KWHzl() {
        setBackgroundTintList(android.content.res.ColorStateList.valueOf(C33070mpX.copydefault(C52761wXj.Activity.pause)));
        AbstractC50961vdy abstractC50961vdy = (AbstractC50961vdy) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.OEsIKP, this, true);
        this.AEQbTJ = abstractC50961vdy;
        AbstractC50961vdy abstractC50961vdy2 = null;
        if (abstractC50961vdy == null) {
            Intrinsics.gEmmrt("");
            abstractC50961vdy = null;
        }
        abstractC50961vdy.EZpvd.setTitle(this.OLrzqt);
        AbstractC50961vdy abstractC50961vdy3 = this.AEQbTJ;
        if (abstractC50961vdy3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50961vdy2 = abstractC50961vdy3;
        }
        abstractC50961vdy2.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.wlD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53420wlE.copydefault(this.KWHzl, view);
            }
        });
    }

    public static final void copydefault(C53420wlE c53420wlE, android.view.View view) {
        Function1<? super android.view.View, Unit> function1;
        AbstractC50961vdy abstractC50961vdy = c53420wlE.AEQbTJ;
        if (abstractC50961vdy == null) {
            Intrinsics.gEmmrt("");
            abstractC50961vdy = null;
        }
        if (abstractC50961vdy.getRoot().isSelected() || (function1 = c53420wlE.KWHzl) == null) {
            return;
        }
        function1.invoke(c53420wlE);
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC50961vdy abstractC50961vdy = this.AEQbTJ;
        if (abstractC50961vdy == null) {
            Intrinsics.gEmmrt("");
            abstractC50961vdy = null;
        }
        abstractC50961vdy.EZpvd.setTitle(str);
    }

    @Override // o.InterfaceC50054vAe
    public void setSelect(boolean z) {
        AbstractC50961vdy abstractC50961vdy = this.AEQbTJ;
        AbstractC50961vdy abstractC50961vdy2 = null;
        if (abstractC50961vdy == null) {
            Intrinsics.gEmmrt("");
            abstractC50961vdy = null;
        }
        abstractC50961vdy.getRoot().setSelected(z);
        if (z) {
            AbstractC50961vdy abstractC50961vdy3 = this.AEQbTJ;
            if (abstractC50961vdy3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC50961vdy2 = abstractC50961vdy3;
            }
            abstractC50961vdy2.KWHzl.setBackground(C33070mpX.KWHzl(C49511upt.TaskDescription.copydefault));
            return;
        }
        AbstractC50961vdy abstractC50961vdy4 = this.AEQbTJ;
        if (abstractC50961vdy4 == null) {
            Intrinsics.gEmmrt("");
            abstractC50961vdy4 = null;
        }
        abstractC50961vdy4.KWHzl.setBackground(null);
    }

    public final void setSelectDisable() {
        AbstractC50961vdy abstractC50961vdy = this.AEQbTJ;
        if (abstractC50961vdy == null) {
            Intrinsics.gEmmrt("");
            abstractC50961vdy = null;
        }
        abstractC50961vdy.KWHzl.setBackground(C33070mpX.KWHzl(C49511upt.TaskDescription.gEmmrt));
    }
}
