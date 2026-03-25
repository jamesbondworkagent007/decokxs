package o;

import androidx.databinding.DataBindingUtil;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wnt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53567wnt extends android.widget.LinearLayout implements InterfaceC50054vAe {
    public yHO<? super C47988uAv, ? super java.lang.String, ? super java.lang.Boolean, ? extends java.lang.Object> AEQbTJ;
    public Function1<? super android.view.View, Unit> EZpvd;
    public yHO<? super C47988uAv, ? super java.lang.String, ? super java.lang.Boolean, ? extends java.lang.Object> KWHzl;
    public java.lang.String OLrzqt;
    public AbstractC48621uYe copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53567wnt(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53567wnt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC50054vAe
    public void AEQbTJ(@NotNull Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:23) call: o.wnt.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53567wnt(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53567wnt(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.OLrzqt = "";
        if (isInEditMode()) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.QfsBiF);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.djSkpj, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.wnv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53567wnt.AEQbTJ(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
            }
        });
        typedArrayObtainStyledAttributes.recycle();
        EZpvd();
        KWHzl();
    }

    public static final Unit AEQbTJ(C53567wnt c53567wnt, int i) {
        c53567wnt.OLrzqt = C33070mpX.AYXKKw(i);
        return Unit.INSTANCE;
    }

    private final void EZpvd() {
        setOrientation(1);
        AbstractC48621uYe abstractC48621uYe = (AbstractC48621uYe) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.gAnGwV, this, true);
        this.copydefault = abstractC48621uYe;
        if (abstractC48621uYe == null) {
            Intrinsics.gEmmrt("");
            abstractC48621uYe = null;
        }
        abstractC48621uYe.EZpvd.setTitle(this.OLrzqt);
    }

    public static final Unit KWHzl(C53567wnt c53567wnt, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function1<? super android.view.View, Unit> function1 = c53567wnt.EZpvd;
        if (function1 != null) {
            function1.invoke(c53567wnt);
        }
        return Unit.INSTANCE;
    }

    private final void KWHzl() {
        AbstractC48621uYe abstractC48621uYe = this.copydefault;
        if (abstractC48621uYe == null) {
            Intrinsics.gEmmrt("");
            abstractC48621uYe = null;
        }
        abstractC48621uYe.EZpvd.AEQbTJ(new Function1() { // from class: o.wnu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53567wnt.KWHzl(this.OLrzqt, (android.view.View) obj);
            }
        });
    }

    public final void setItemTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC48621uYe abstractC48621uYe = this.copydefault;
        if (abstractC48621uYe == null) {
            Intrinsics.gEmmrt("");
            abstractC48621uYe = null;
        }
        abstractC48621uYe.EZpvd.setTitle(str);
    }

    @Override // o.InterfaceC50054vAe
    public void setSelect(boolean z) {
        AbstractC48621uYe abstractC48621uYe = this.copydefault;
        if (abstractC48621uYe == null) {
            Intrinsics.gEmmrt("");
            abstractC48621uYe = null;
        }
        abstractC48621uYe.EZpvd.setSelect(z);
        C47988uAv c47988uAv = abstractC48621uYe.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c47988uAv.setVisibility(z ? 0 : 8);
        C47988uAv c47988uAv2 = abstractC48621uYe.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
        c47988uAv2.setVisibility(z ? 0 : 8);
        if (z) {
            return;
        }
        InputLayoutState inputLayoutStateIsConnected = abstractC48621uYe.OLrzqt.isConnected();
        InputLayoutState inputLayoutState = InputLayoutState.NORMAL;
        if (inputLayoutStateIsConnected == inputLayoutState) {
            C47988uAv.setInputContent$default(abstractC48621uYe.OLrzqt, "", false, false, 6, null);
        }
        if (abstractC48621uYe.KWHzl.isConnected() == inputLayoutState) {
            C47988uAv.setInputContent$default(abstractC48621uYe.KWHzl, "", false, false, 6, null);
        }
    }

    public final void setSelectDisable() {
        AbstractC48621uYe abstractC48621uYe = this.copydefault;
        if (abstractC48621uYe == null) {
            Intrinsics.gEmmrt("");
            abstractC48621uYe = null;
        }
        abstractC48621uYe.EZpvd.setSelectDisable();
    }

    public static /* synthetic */ void firstInputConfig$default(C53567wnt c53567wnt, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        c53567wnt.copydefault(str, str2, str3, num, z);
    }

    public final void copydefault(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC48621uYe abstractC48621uYe = this.copydefault;
        if (abstractC48621uYe == null) {
            Intrinsics.gEmmrt("");
            abstractC48621uYe = null;
        }
        C47988uAv c47988uAv = abstractC48621uYe.OLrzqt;
        C47988uAv.setInputLabel$default(c47988uAv, str, null, 2, null);
        c47988uAv.setInputUnit(str2);
        c47988uAv.setInputHint(str3);
        if (num != null) {
            c47988uAv.setMaxDecimal(num.intValue());
        }
        C47988uAv.setInputLayoutState$default(c47988uAv, z ? InputLayoutState.NORMAL : InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
    }

    public static /* synthetic */ void secondInputConfig$default(C53567wnt c53567wnt, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        c53567wnt.KWHzl(str, str2, str3, num, z);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, java.lang.Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC48621uYe abstractC48621uYe = this.copydefault;
        if (abstractC48621uYe == null) {
            Intrinsics.gEmmrt("");
            abstractC48621uYe = null;
        }
        C47988uAv c47988uAv = abstractC48621uYe.KWHzl;
        C47988uAv.setInputLabel$default(c47988uAv, str, null, 2, null);
        c47988uAv.setInputUnit(str2);
        c47988uAv.setInputHint(str3);
        if (num != null) {
            c47988uAv.setMaxDecimal(num.intValue());
        }
        C47988uAv.setInputLayoutState$default(c47988uAv, z ? InputLayoutState.NORMAL : InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
    }

    public final void AEQbTJ(yHO<? super C47988uAv, ? super java.lang.String, ? super java.lang.Boolean, ? extends java.lang.Object> yho) {
        this.AEQbTJ = yho;
        AbstractC48621uYe abstractC48621uYe = this.copydefault;
        if (abstractC48621uYe == null) {
            Intrinsics.gEmmrt("");
            abstractC48621uYe = null;
        }
        C47988uAv c47988uAv = abstractC48621uYe.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        EZpvd(c47988uAv, yho);
    }

    public final void EZpvd(yHO<? super C47988uAv, ? super java.lang.String, ? super java.lang.Boolean, ? extends java.lang.Object> yho) {
        this.KWHzl = yho;
        AbstractC48621uYe abstractC48621uYe = this.copydefault;
        if (abstractC48621uYe == null) {
            Intrinsics.gEmmrt("");
            abstractC48621uYe = null;
        }
        C47988uAv c47988uAv = abstractC48621uYe.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        EZpvd(c47988uAv, yho);
    }

    public final void EZpvd(C47988uAv c47988uAv, final yHO<? super C47988uAv, ? super java.lang.String, ? super java.lang.Boolean, ? extends java.lang.Object> yho) {
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.wnx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53567wnt.OLrzqt(yho, this, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    public static final Unit OLrzqt(yHO yho, C53567wnt c53567wnt, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        c53567wnt.EZpvd(c47988uAv, yho != null ? yho.invoke(c47988uAv, str, java.lang.Boolean.FALSE) : null);
        return Unit.INSTANCE;
    }

    private final void EZpvd(C47988uAv c47988uAv, java.lang.Object obj) {
        if (obj instanceof java.lang.Object[]) {
            Intrinsics.copydefault(obj, "");
            c47988uAv.setInputErrorMsg((java.lang.String[]) obj);
        } else {
            if (obj instanceof java.lang.String) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) obj)) {
                    c47988uAv.setInputErrorMsg((java.lang.String) obj);
                    return;
                } else {
                    c47988uAv.copydefault();
                    return;
                }
            }
            c47988uAv.copydefault();
        }
    }

    public final void setFirstContent(java.lang.String str) {
        AbstractC48621uYe abstractC48621uYe = this.copydefault;
        if (abstractC48621uYe == null) {
            Intrinsics.gEmmrt("");
            abstractC48621uYe = null;
        }
        C47988uAv.setInputContent$default(abstractC48621uYe.OLrzqt, str, false, false, 6, null);
    }

    public final void setSecondContent(java.lang.String str) {
        AbstractC48621uYe abstractC48621uYe = this.copydefault;
        if (abstractC48621uYe == null) {
            Intrinsics.gEmmrt("");
            abstractC48621uYe = null;
        }
        C47988uAv.setInputContent$default(abstractC48621uYe.KWHzl, str, false, false, 6, null);
    }

    public final void copydefault() {
        AbstractC48621uYe abstractC48621uYe = this.copydefault;
        if (abstractC48621uYe == null) {
            Intrinsics.gEmmrt("");
            abstractC48621uYe = null;
        }
        abstractC48621uYe.OLrzqt.copydefault();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OLrzqt() {
        AbstractC48621uYe abstractC48621uYe = this.copydefault;
        if (abstractC48621uYe == null) {
            Intrinsics.gEmmrt("");
            abstractC48621uYe = null;
        }
        C47988uAv c47988uAv = abstractC48621uYe.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        if (c47988uAv.getVisibility() != 0) {
            C47988uAv c47988uAv2 = abstractC48621uYe.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
            if (c47988uAv2.getVisibility() == 0) {
            }
        } else {
            abstractC48621uYe.OLrzqt.AuCTelauCTel();
            abstractC48621uYe.KWHzl.AuCTelauCTel();
            yHO<? super C47988uAv, ? super java.lang.String, ? super java.lang.Boolean, ? extends java.lang.Object> yho = this.AEQbTJ;
            if (yho != null) {
                C47988uAv c47988uAv3 = abstractC48621uYe.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(c47988uAv3, "");
                java.lang.Object objInvoke = yho.invoke(c47988uAv3, abstractC48621uYe.OLrzqt.AkhnZx(), java.lang.Boolean.TRUE);
                if (objInvoke != null) {
                    C47988uAv c47988uAv4 = abstractC48621uYe.OLrzqt;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv4, "");
                    EZpvd(c47988uAv4, objInvoke);
                }
            }
            yHO<? super C47988uAv, ? super java.lang.String, ? super java.lang.Boolean, ? extends java.lang.Object> yho2 = this.KWHzl;
            if (yho2 != null) {
                C47988uAv c47988uAv5 = abstractC48621uYe.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c47988uAv5, "");
                java.lang.Object objInvoke2 = yho2.invoke(c47988uAv5, abstractC48621uYe.KWHzl.AkhnZx(), java.lang.Boolean.TRUE);
                if (objInvoke2 != null) {
                    C47988uAv c47988uAv6 = abstractC48621uYe.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv6, "");
                    EZpvd(c47988uAv6, objInvoke2);
                }
            }
            if (abstractC48621uYe.OLrzqt.getFieldNames() || abstractC48621uYe.KWHzl.getFieldNames()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.AEQbTJ = null;
        this.KWHzl = null;
        this.EZpvd = null;
    }
}
