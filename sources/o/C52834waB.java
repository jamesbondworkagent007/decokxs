package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.waB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52834waB extends ConstraintLayout {
    public boolean AEQbTJ;
    public Function1<? super java.lang.Boolean, Unit> EZpvd;
    public boolean OLrzqt;
    public C50917vdG copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52834waB(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52834waB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightClickEnable(boolean z) {
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRightIconClick(boolean z, Function1<? super java.lang.Boolean, Unit> function1) {
        this.AEQbTJ = z;
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:12) call: o.waB.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52834waB(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52834waB(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = true;
        OLrzqt();
    }

    private final void OLrzqt() {
        C50917vdG c50917vdGAEQbTJ = C50917vdG.AEQbTJ(android.view.LayoutInflater.from(getContext()), this, true);
        this.copydefault = c50917vdGAEQbTJ;
        if (c50917vdGAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            c50917vdGAEQbTJ = null;
        }
        c50917vdGAEQbTJ.getRoot().setOnClickListener(new View.OnClickListener() { // from class: o.waz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52834waB.EZpvd(this.KWHzl, view);
            }
        });
    }

    public static final void EZpvd(C52834waB c52834waB, android.view.View view) {
        if (c52834waB.AEQbTJ) {
            c52834waB.copydefault();
            return;
        }
        if (c52834waB.OLrzqt) {
            C50917vdG c50917vdG = c52834waB.copydefault;
            C50917vdG c50917vdG2 = null;
            if (c50917vdG == null) {
                Intrinsics.gEmmrt("");
                c50917vdG = null;
            }
            ConstraintLayout root = c50917vdG.getRoot();
            C50917vdG c50917vdG3 = c52834waB.copydefault;
            if (c50917vdG3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c50917vdG2 = c50917vdG3;
            }
            root.setSelected(!c50917vdG2.getRoot().isSelected());
            c52834waB.copydefault();
            c52834waB.EZpvd();
        }
    }

    public final void copydefault() {
        Function1<? super java.lang.Boolean, Unit> function1 = this.EZpvd;
        if (function1 != null) {
            C50917vdG c50917vdG = this.copydefault;
            if (c50917vdG == null) {
                Intrinsics.gEmmrt("");
                c50917vdG = null;
            }
            function1.invoke(java.lang.Boolean.valueOf(c50917vdG.getRoot().isSelected()));
        }
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C50917vdG c50917vdG = this.copydefault;
        if (c50917vdG == null) {
            Intrinsics.gEmmrt("");
            c50917vdG = null;
        }
        c50917vdG.EZpvd.setText(str);
    }

    public static /* synthetic */ void setTitleIcon$default(C52834waB c52834waB, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c52834waB.setTitleIcon(str);
    }

    public final void setTitleIcon(java.lang.String str) {
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(getContext());
        if (str == null) {
            str = "";
        }
        C5335Nt<android.graphics.drawable.Drawable> c5335NtEZpvd = componentCallbacks2C5333NrAEQbTJ.EZpvd(str);
        C50917vdG c50917vdG = this.copydefault;
        if (c50917vdG == null) {
            Intrinsics.gEmmrt("");
            c50917vdG = null;
        }
        c5335NtEZpvd.EZpvd(c50917vdG.AEQbTJ);
    }

    public final void setTitleIcon(java.lang.Integer num) {
        if (C33129mqd.OLrzqt((java.lang.Object) num, (java.lang.Object) 0) || num == null) {
            return;
        }
        int iIntValue = num.intValue();
        C50917vdG c50917vdG = this.copydefault;
        if (c50917vdG == null) {
            Intrinsics.gEmmrt("");
            c50917vdG = null;
        }
        c50917vdG.AEQbTJ.setImageDrawable(C33070mpX.KWHzl(iIntValue));
    }

    public final void EZpvd() {
        C50917vdG c50917vdG = null;
        if (!this.OLrzqt) {
            C50917vdG c50917vdG2 = this.copydefault;
            if (c50917vdG2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c50917vdG = c50917vdG2;
            }
            c50917vdG.KWHzl.setEnabled(false);
            return;
        }
        C50917vdG c50917vdG3 = this.copydefault;
        if (c50917vdG3 == null) {
            Intrinsics.gEmmrt("");
            c50917vdG3 = null;
        }
        c50917vdG3.KWHzl.setEnabled(true);
        C50917vdG c50917vdG4 = this.copydefault;
        if (c50917vdG4 == null) {
            Intrinsics.gEmmrt("");
            c50917vdG4 = null;
        }
        android.widget.ImageView imageView = c50917vdG4.KWHzl;
        C50917vdG c50917vdG5 = this.copydefault;
        if (c50917vdG5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c50917vdG = c50917vdG5;
        }
        imageView.setSelected(c50917vdG.getRoot().isSelected());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.waB */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setRightIconClick$default(C52834waB c52834waB, boolean z, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        c52834waB.setRightIconClick(z, function1);
    }

    public final void setRightIconCheck(boolean z) {
        C50917vdG c50917vdG = this.copydefault;
        if (c50917vdG == null) {
            Intrinsics.gEmmrt("");
            c50917vdG = null;
        }
        c50917vdG.getRoot().setSelected(z);
        EZpvd();
    }
}
