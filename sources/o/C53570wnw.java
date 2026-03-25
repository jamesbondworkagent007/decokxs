package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.TextViewCompat;
import androidx.databinding.DataBindingUtil;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wnw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53570wnw extends ConstraintLayout implements InterfaceC50054vAe {
    public AbstractC48628uYl AEQbTJ;
    public Function2<? super C47988uAv, ? super java.lang.String, ? extends java.lang.Object> EZpvd;
    public Function1<? super android.view.View, Unit> OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53570wnw(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53570wnw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC50054vAe
    public void AEQbTJ(@NotNull Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = function1;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:27) call: o.wnw.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53570wnw(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53570wnw(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = "";
        if (isInEditMode()) {
            return;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.RcXXUw);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.UeEOUB, 0), (Function1<? super java.lang.Integer, Unit>) new Function1() { // from class: o.wnA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53570wnw.OLrzqt(this.KWHzl, ((java.lang.Integer) obj).intValue());
            }
        });
        typedArrayObtainStyledAttributes.recycle();
        EZpvd();
        KWHzl();
    }

    public static final Unit OLrzqt(C53570wnw c53570wnw, int i) {
        c53570wnw.copydefault = C33070mpX.AYXKKw(i);
        return Unit.INSTANCE;
    }

    private final void EZpvd() {
        AbstractC48628uYl abstractC48628uYl = (AbstractC48628uYl) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.zFtALg, this, true);
        this.AEQbTJ = abstractC48628uYl;
        if (abstractC48628uYl == null) {
            Intrinsics.gEmmrt("");
            abstractC48628uYl = null;
        }
        abstractC48628uYl.OLrzqt.setTitle(this.copydefault);
    }

    public static final Unit AEQbTJ(C53570wnw c53570wnw, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        Function1<? super android.view.View, Unit> function1 = c53570wnw.OLrzqt;
        if (function1 != null) {
            function1.invoke(c53570wnw);
        }
        return Unit.INSTANCE;
    }

    private final void KWHzl() {
        AbstractC48628uYl abstractC48628uYl = this.AEQbTJ;
        if (abstractC48628uYl == null) {
            Intrinsics.gEmmrt("");
            abstractC48628uYl = null;
        }
        abstractC48628uYl.OLrzqt.AEQbTJ(new Function1() { // from class: o.wnB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53570wnw.AEQbTJ(this.KWHzl, (android.view.View) obj);
            }
        });
    }

    public final void setItemTitle(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC48628uYl abstractC48628uYl = this.AEQbTJ;
        if (abstractC48628uYl == null) {
            Intrinsics.gEmmrt("");
            abstractC48628uYl = null;
        }
        abstractC48628uYl.OLrzqt.setTitle(str);
    }

    @Override // o.InterfaceC50054vAe
    public void setSelect(boolean z) {
        AbstractC48628uYl abstractC48628uYl = this.AEQbTJ;
        if (abstractC48628uYl == null) {
            Intrinsics.gEmmrt("");
            abstractC48628uYl = null;
        }
        abstractC48628uYl.OLrzqt.setSelect(z);
        android.view.View root = abstractC48628uYl.copydefault.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        root.setVisibility(z ? 0 : 8);
        C47988uAv c47988uAv = abstractC48628uYl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c47988uAv.setVisibility(z ? 0 : 8);
        if (z || abstractC48628uYl.EZpvd.isConnected() != InputLayoutState.NORMAL) {
            return;
        }
        C47988uAv.setInputContent$default(abstractC48628uYl.EZpvd, "", false, false, 6, null);
    }

    public final void setSelectDisable() {
        AbstractC48628uYl abstractC48628uYl = this.AEQbTJ;
        if (abstractC48628uYl == null) {
            Intrinsics.gEmmrt("");
            abstractC48628uYl = null;
        }
        abstractC48628uYl.OLrzqt.setSelectDisable();
    }

    public static /* synthetic */ void firstInputConfig$default(C53570wnw c53570wnw, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num, boolean z, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z = true;
        }
        c53570wnw.KWHzl(str, str2, str3, num, z);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3, java.lang.Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC48628uYl abstractC48628uYl = this.AEQbTJ;
        if (abstractC48628uYl == null) {
            Intrinsics.gEmmrt("");
            abstractC48628uYl = null;
        }
        C47988uAv c47988uAv = abstractC48628uYl.EZpvd;
        C47988uAv.setInputLabel$default(c47988uAv, str, null, 2, null);
        c47988uAv.setInputUnit(str2);
        c47988uAv.setInputHint(str3);
        if (num != null) {
            c47988uAv.setMaxDecimal(num.intValue());
        }
        C47988uAv.setInputLayoutState$default(c47988uAv, z ? InputLayoutState.NORMAL : InputLayoutState.GREY_UN_CLICKABLE, false, 2, null);
    }

    public final void setRsiEditListener(@NotNull View.OnClickListener onClickListener) {
        Intrinsics.checkNotNullParameter(onClickListener, "");
        AbstractC48628uYl abstractC48628uYl = this.AEQbTJ;
        if (abstractC48628uYl == null) {
            Intrinsics.gEmmrt("");
            abstractC48628uYl = null;
        }
        AppCompatTextView appCompatTextView = abstractC48628uYl.copydefault.OLrzqt;
        appCompatTextView.setOnClickListener(new ActionBar(appCompatTextView, 1000L, onClickListener));
    }

    public final void KWHzl(Function2<? super C47988uAv, ? super java.lang.String, ? extends java.lang.Object> function2) {
        this.EZpvd = function2;
        AbstractC48628uYl abstractC48628uYl = this.AEQbTJ;
        if (abstractC48628uYl == null) {
            Intrinsics.gEmmrt("");
            abstractC48628uYl = null;
        }
        C47988uAv c47988uAv = abstractC48628uYl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        copydefault(c47988uAv, function2);
    }

    public final void copydefault(C47988uAv c47988uAv, final Function2<? super C47988uAv, ? super java.lang.String, ? extends java.lang.Object> function2) {
        c47988uAv.setOnTextChangeCallback(new Function2() { // from class: o.wny
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53570wnw.KWHzl(function2, this, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
    }

    public static final Unit KWHzl(Function2 function2, C53570wnw c53570wnw, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        c53570wnw.copydefault(c47988uAv, function2 != null ? function2.invoke(c47988uAv, str) : null);
        return Unit.INSTANCE;
    }

    public final void copydefault(C47988uAv c47988uAv, java.lang.Object obj) {
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

    public final void setRsiContent(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        AbstractC48628uYl abstractC48628uYl = this.AEQbTJ;
        if (abstractC48628uYl == null) {
            Intrinsics.gEmmrt("");
            abstractC48628uYl = null;
        }
        uWI uwi = abstractC48628uYl.copydefault;
        uwi.EZpvd.setText(str);
        uwi.AYXKKw.setText(str2);
        uwi.valueOf.setText(str3);
        uwi.AEQbTJ.setText(str4);
    }

    public final void setRsiEnable(boolean z) {
        AbstractC48628uYl abstractC48628uYl = this.AEQbTJ;
        if (abstractC48628uYl == null) {
            Intrinsics.gEmmrt("");
            abstractC48628uYl = null;
        }
        uWI uwi = abstractC48628uYl.copydefault;
        uwi.OLrzqt.setEnabled(z);
        uwi.OLrzqt.setClickable(z);
        uwi.getRoot().setEnabled(z);
        int iCopydefault = C33070mpX.copydefault(z ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.QwvEab);
        uwi.OLrzqt.setTextColor(iCopydefault);
        TextViewCompat.setCompoundDrawableTintList(uwi.OLrzqt, android.content.res.ColorStateList.valueOf(iCopydefault));
    }

    public final void setFirstContent(java.lang.String str) {
        AbstractC48628uYl abstractC48628uYl = this.AEQbTJ;
        if (abstractC48628uYl == null) {
            Intrinsics.gEmmrt("");
            abstractC48628uYl = null;
        }
        C47988uAv.setInputContent$default(abstractC48628uYl.EZpvd, str, false, false, 6, null);
    }

    public final boolean OLrzqt() {
        AbstractC48628uYl abstractC48628uYl = this.AEQbTJ;
        if (abstractC48628uYl == null) {
            Intrinsics.gEmmrt("");
            abstractC48628uYl = null;
        }
        C47988uAv c47988uAv = abstractC48628uYl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        if (c47988uAv.getVisibility() == 0) {
            abstractC48628uYl.EZpvd.AuCTelauCTel();
            Function2<? super C47988uAv, ? super java.lang.String, ? extends java.lang.Object> function2 = this.EZpvd;
            if (function2 != null) {
                C47988uAv c47988uAv2 = abstractC48628uYl.EZpvd;
                Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
                java.lang.Object objInvoke = function2.invoke(c47988uAv2, abstractC48628uYl.EZpvd.AkhnZx());
                if (objInvoke != null) {
                    C47988uAv c47988uAv3 = abstractC48628uYl.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv3, "");
                    copydefault(c47988uAv3, objInvoke);
                }
            }
            if (abstractC48628uYl.EZpvd.getFieldNames()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: o.wnw$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ View.OnClickListener KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, View.OnClickListener onClickListener) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.KWHzl = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.KWHzl.onClick((AppCompatTextView) this.EZpvd);
            }
        }
    }
}
