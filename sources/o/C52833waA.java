package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.waA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C52833waA extends ConstraintLayout {
    public Function1<? super android.view.View, Unit> AEQbTJ;
    public AbstractC50921vdK KWHzl;
    public Function1<? super C53526wnE, Unit> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52833waA(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C52833waA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClick(@NotNull Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTypeSelectClick(@NotNull Function1<? super C53526wnE, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:20) call: o.waA.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C52833waA(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52833waA(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        AhwBna();
    }

    private final void AhwBna() {
        AbstractC50921vdK abstractC50921vdK = (AbstractC50921vdK) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.fGsPTM, this, true);
        this.KWHzl = abstractC50921vdK;
        AbstractC50921vdK abstractC50921vdK2 = null;
        if (abstractC50921vdK == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK = null;
        }
        abstractC50921vdK.OLrzqt.AEQbTJ(new Function1() { // from class: o.waD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52833waA.EZpvd(this.copydefault, (android.view.View) obj);
            }
        });
        AbstractC50921vdK abstractC50921vdK3 = this.KWHzl;
        if (abstractC50921vdK3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50921vdK2 = abstractC50921vdK3;
        }
        abstractC50921vdK2.copydefault.KWHzl(new Function1() { // from class: o.waF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52833waA.OLrzqt(this.OLrzqt, (C53526wnE) obj);
            }
        });
    }

    public static final Unit EZpvd(C52833waA c52833waA, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function1<? super android.view.View, Unit> function1 = c52833waA.AEQbTJ;
        if (function1 != null) {
            function1.invoke(view);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52833waA c52833waA, C53526wnE c53526wnE) {
        Intrinsics.checkNotNullParameter(c53526wnE, "");
        Function1<? super C53526wnE, Unit> function1 = c52833waA.OLrzqt;
        if (function1 != null) {
            function1.invoke(c53526wnE);
        }
        return Unit.INSTANCE;
    }

    public final void setTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC50921vdK abstractC50921vdK = this.KWHzl;
        if (abstractC50921vdK == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK = null;
        }
        abstractC50921vdK.OLrzqt.setTitle(str);
    }

    public final void setTpSlTypeTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC50921vdK abstractC50921vdK = this.KWHzl;
        if (abstractC50921vdK == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK = null;
        }
        abstractC50921vdK.copydefault.setTitleText(str);
    }

    public final void setSelect(boolean z) {
        AbstractC50921vdK abstractC50921vdK = this.KWHzl;
        AbstractC50921vdK abstractC50921vdK2 = null;
        if (abstractC50921vdK == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK = null;
        }
        abstractC50921vdK.OLrzqt.setSelect(z);
        if (z) {
            AbstractC50921vdK abstractC50921vdK3 = this.KWHzl;
            if (abstractC50921vdK3 == null) {
                Intrinsics.gEmmrt("");
                abstractC50921vdK3 = null;
            }
            C53526wnE c53526wnE = abstractC50921vdK3.copydefault;
            Intrinsics.checkNotNullExpressionValue(c53526wnE, "");
            c53526wnE.setVisibility(0);
            AbstractC50921vdK abstractC50921vdK4 = this.KWHzl;
            if (abstractC50921vdK4 == null) {
                Intrinsics.gEmmrt("");
                abstractC50921vdK4 = null;
            }
            C47988uAv c47988uAv = abstractC50921vdK4.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
            c47988uAv.setVisibility(0);
            AbstractC50921vdK abstractC50921vdK5 = this.KWHzl;
            if (abstractC50921vdK5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC50921vdK2 = abstractC50921vdK5;
            }
            C47988uAv c47988uAv2 = abstractC50921vdK2.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
            c47988uAv2.setVisibility(0);
            return;
        }
        AbstractC50921vdK abstractC50921vdK6 = this.KWHzl;
        if (abstractC50921vdK6 == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK6 = null;
        }
        C53526wnE c53526wnE2 = abstractC50921vdK6.copydefault;
        Intrinsics.checkNotNullExpressionValue(c53526wnE2, "");
        c53526wnE2.setVisibility(8);
        AbstractC50921vdK abstractC50921vdK7 = this.KWHzl;
        if (abstractC50921vdK7 == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK7 = null;
        }
        C47988uAv c47988uAv3 = abstractC50921vdK7.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c47988uAv3, "");
        c47988uAv3.setVisibility(8);
        AbstractC50921vdK abstractC50921vdK8 = this.KWHzl;
        if (abstractC50921vdK8 == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK8 = null;
        }
        C47988uAv c47988uAv4 = abstractC50921vdK8.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c47988uAv4, "");
        c47988uAv4.setVisibility(8);
        AbstractC50921vdK abstractC50921vdK9 = this.KWHzl;
        if (abstractC50921vdK9 == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK9 = null;
        }
        C47988uAv.setInputContent$default(abstractC50921vdK9.EZpvd, "", false, false, 6, null);
        AbstractC50921vdK abstractC50921vdK10 = this.KWHzl;
        if (abstractC50921vdK10 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50921vdK2 = abstractC50921vdK10;
        }
        C47988uAv.setInputContent$default(abstractC50921vdK2.KWHzl, "", false, false, 6, null);
    }

    public static /* synthetic */ void setTpInputViewConfig$default(C52833waA c52833waA, java.lang.String str, java.lang.String str2, java.lang.Integer num, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        c52833waA.setTpInputViewConfig(str, str2, num, z);
    }

    public final void setTpInputViewConfig(java.lang.String str, java.lang.String str2, java.lang.Integer num, boolean z) {
        AbstractC50921vdK abstractC50921vdK = null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            AbstractC50921vdK abstractC50921vdK2 = this.KWHzl;
            if (abstractC50921vdK2 == null) {
                Intrinsics.gEmmrt("");
                abstractC50921vdK2 = null;
            }
            C47988uAv.setInputLabel$default(abstractC50921vdK2.EZpvd, str, null, 2, null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            AbstractC50921vdK abstractC50921vdK3 = this.KWHzl;
            if (abstractC50921vdK3 == null) {
                Intrinsics.gEmmrt("");
                abstractC50921vdK3 = null;
            }
            abstractC50921vdK3.EZpvd.setInputUnit(str2);
        }
        if (num != null) {
            AbstractC50921vdK abstractC50921vdK4 = this.KWHzl;
            if (abstractC50921vdK4 == null) {
                Intrinsics.gEmmrt("");
                abstractC50921vdK4 = null;
            }
            abstractC50921vdK4.EZpvd.setMaxDecimal(num.intValue());
        }
        AbstractC50921vdK abstractC50921vdK5 = this.KWHzl;
        if (abstractC50921vdK5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50921vdK = abstractC50921vdK5;
        }
        abstractC50921vdK.EZpvd.setEnabled(z);
    }

    public static /* synthetic */ void setSlInputViewConfig$default(C52833waA c52833waA, java.lang.String str, java.lang.String str2, java.lang.Integer num, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        c52833waA.setSlInputViewConfig(str, str2, num, z);
    }

    public final void setSlInputViewConfig(java.lang.String str, java.lang.String str2, java.lang.Integer num, boolean z) {
        AbstractC50921vdK abstractC50921vdK = null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            AbstractC50921vdK abstractC50921vdK2 = this.KWHzl;
            if (abstractC50921vdK2 == null) {
                Intrinsics.gEmmrt("");
                abstractC50921vdK2 = null;
            }
            C47988uAv.setInputLabel$default(abstractC50921vdK2.KWHzl, str, null, 2, null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            AbstractC50921vdK abstractC50921vdK3 = this.KWHzl;
            if (abstractC50921vdK3 == null) {
                Intrinsics.gEmmrt("");
                abstractC50921vdK3 = null;
            }
            abstractC50921vdK3.KWHzl.setInputUnit(str2);
        }
        if (num != null) {
            AbstractC50921vdK abstractC50921vdK4 = this.KWHzl;
            if (abstractC50921vdK4 == null) {
                Intrinsics.gEmmrt("");
                abstractC50921vdK4 = null;
            }
            abstractC50921vdK4.KWHzl.setMaxDecimal(num.intValue());
        }
        AbstractC50921vdK abstractC50921vdK5 = this.KWHzl;
        if (abstractC50921vdK5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50921vdK = abstractC50921vdK5;
        }
        abstractC50921vdK.KWHzl.setEnabled(z);
    }

    public final void KWHzl(Function2<? super C47988uAv, ? super java.lang.String, Unit> function2) {
        AbstractC50921vdK abstractC50921vdK = this.KWHzl;
        if (abstractC50921vdK == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK = null;
        }
        abstractC50921vdK.EZpvd.setOnTextChangeCallback(function2);
    }

    public final void EZpvd(Function2<? super C47988uAv, ? super java.lang.String, Unit> function2) {
        AbstractC50921vdK abstractC50921vdK = this.KWHzl;
        if (abstractC50921vdK == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK = null;
        }
        abstractC50921vdK.KWHzl.setOnTextChangeCallback(function2);
    }

    public final void valueOf() {
        AbstractC50921vdK abstractC50921vdK = this.KWHzl;
        if (abstractC50921vdK == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK = null;
        }
        abstractC50921vdK.EZpvd.setOnTextChangeCallback(null);
        AbstractC50921vdK abstractC50921vdK2 = this.KWHzl;
        if (abstractC50921vdK2 == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK2 = null;
        }
        abstractC50921vdK2.KWHzl.setOnTextChangeCallback(null);
    }

    public final void setTpInputError(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            AbstractC50921vdK abstractC50921vdK = this.KWHzl;
            if (abstractC50921vdK == null) {
                Intrinsics.gEmmrt("");
                abstractC50921vdK = null;
            }
            abstractC50921vdK.EZpvd.setInputErrorMsg(str);
        }
    }

    public final void setSlInputError(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            AbstractC50921vdK abstractC50921vdK = this.KWHzl;
            if (abstractC50921vdK == null) {
                Intrinsics.gEmmrt("");
                abstractC50921vdK = null;
            }
            abstractC50921vdK.KWHzl.setInputErrorMsg(str);
        }
    }

    public final void setTpContent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC50921vdK abstractC50921vdK = this.KWHzl;
        if (abstractC50921vdK == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK = null;
        }
        C47988uAv.setInputContent$default(abstractC50921vdK.EZpvd, str, false, false, 6, null);
    }

    public final void setSlContent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC50921vdK abstractC50921vdK = this.KWHzl;
        if (abstractC50921vdK == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK = null;
        }
        C47988uAv.setInputContent$default(abstractC50921vdK.KWHzl, str, false, false, 6, null);
    }

    public final void AEQbTJ() {
        AbstractC50921vdK abstractC50921vdK = this.KWHzl;
        AbstractC50921vdK abstractC50921vdK2 = null;
        if (abstractC50921vdK == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK = null;
        }
        C47988uAv.setInputContent$default(abstractC50921vdK.EZpvd, "", false, false, 6, null);
        AbstractC50921vdK abstractC50921vdK3 = this.KWHzl;
        if (abstractC50921vdK3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC50921vdK2 = abstractC50921vdK3;
        }
        C47988uAv.setInputContent$default(abstractC50921vdK2.KWHzl, "", false, false, 6, null);
    }

    public final java.lang.String EZpvd() {
        AbstractC50921vdK abstractC50921vdK = this.KWHzl;
        if (abstractC50921vdK == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK = null;
        }
        return abstractC50921vdK.EZpvd.AkhnZx();
    }

    public final java.lang.String OLrzqt() {
        AbstractC50921vdK abstractC50921vdK = this.KWHzl;
        if (abstractC50921vdK == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK = null;
        }
        return abstractC50921vdK.KWHzl.AkhnZx();
    }

    public final void KWHzl() {
        AbstractC50921vdK abstractC50921vdK = this.KWHzl;
        if (abstractC50921vdK == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK = null;
        }
        abstractC50921vdK.EZpvd.copydefault();
    }

    public final void copydefault() {
        AbstractC50921vdK abstractC50921vdK = this.KWHzl;
        if (abstractC50921vdK == null) {
            Intrinsics.gEmmrt("");
            abstractC50921vdK = null;
        }
        abstractC50921vdK.KWHzl.copydefault();
    }
}
