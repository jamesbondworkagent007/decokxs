package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.immomo.mls.fun.constants.TextAlign;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.bean.UnitType;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C25247itC;
import o.C31172lox;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.itK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25255itK extends android.widget.LinearLayout {
    public final hHL AEQbTJ;
    public UnitType AYXKKw;
    public long EZpvd;
    public InterfaceC58217yxC KWHzl;
    public final java.util.ArrayList<Function2<C55001xbh, java.lang.String, Unit>> OLrzqt;
    public UnitType copydefault;
    public java.lang.String djBIcL;
    public int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25255itK(@NotNull android.content.Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnitType copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
 A[MD:(android.content.Context, android.util.AttributeSet):void (m)] (LINE:28) call: o.itK.<init>(android.content.Context, android.util.AttributeSet):void type: THIS */
    public /* synthetic */ C25255itK(android.content.Context context, android.util.AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25255itK(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        hHL hhlEZpvd = hHL.EZpvd(android.view.LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(hhlEZpvd, "");
        this.AEQbTJ = hhlEZpvd;
        UnitType unitType = UnitType.UnitTypePercent;
        this.AYXKKw = unitType;
        this.copydefault = unitType;
        this.OLrzqt = new java.util.ArrayList<>();
        this.EZpvd = 500L;
        this.djBIcL = "";
        C31172lox.TaskDescription taskDescription = C31172lox.Companion;
        this.valueOf = taskDescription.KWHzl();
        int[] iArr = C23274hvD.LoaderManager.AubY;
        Intrinsics.checkNotNullExpressionValue(iArr, "");
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
        this.valueOf = taskDescription.OLrzqt(typedArrayObtainStyledAttributes.getInt(C23274hvD.LoaderManager.AuCTelauCTel, taskDescription.KWHzl()));
        typedArrayObtainStyledAttributes.recycle();
        int i = this.valueOf;
        if (C31172lox.KWHzl(i, taskDescription.KWHzl())) {
            hhlEZpvd.getRoot().setBackgroundResource(C23274hvD.ActionBar.values);
            hhlEZpvd.copydefault.setGravity(17);
            android.widget.ImageView imageView = hhlEZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C55298xhM.OLrzqt(12, context);
                layoutParams.height = C55298xhM.OLrzqt(12, context);
                imageView.setLayoutParams(layoutParams);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        } else if (C31172lox.KWHzl(i, taskDescription.OLrzqt())) {
            hhlEZpvd.getRoot().setBackgroundResource(C23274hvD.ActionBar.djBIcL);
            hhlEZpvd.copydefault.setGravity(TextAlign.LEFT);
            android.widget.ImageView imageView2 = hhlEZpvd.KWHzl;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = C55298xhM.OLrzqt(20, context);
                layoutParams2.height = C55298xhM.OLrzqt(20, context);
                imageView2.setLayoutParams(layoutParams2);
                TextViewCompat.setTextAppearance(hhlEZpvd.copydefault, C52761wXj.LoaderManager.KWHzl);
            } else {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        hhlEZpvd.copydefault.setShowThousandsSeparator(true);
        setContentText$default(this, null, false, 3, null);
    }

    public static /* synthetic */ void setUnit$default(C25255itK c25255itK, UnitType unitType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c25255itK.setUnit(unitType, str);
    }

    public final void setUnit(@NotNull UnitType unitType, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(unitType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = unitType;
        if (unitType == UnitType.UnitTypeToken) {
            this.djBIcL = str;
            AEQbTJ(str);
        }
    }

    public static /* synthetic */ void setChainIcon$default(C25255itK c25255itK, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c25255itK.KWHzl(str);
    }

    private final void KWHzl(java.lang.String str) {
        if (str.length() > 0) {
            this.AEQbTJ.OLrzqt.setVisibility(0);
            this.AEQbTJ.AhwBna.setVisibility(8);
            android.widget.ImageView imageView = this.AEQbTJ.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            C25386ivj.loadImageWithBorder$default(imageView, str, null, 2, null);
            return;
        }
        this.AEQbTJ.OLrzqt.setVisibility(8);
        this.AEQbTJ.AhwBna.setVisibility(0);
    }

    public final void copydefault(androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, final java.lang.String str2, java.lang.String str3, final Function1<? super C55276xgr, Unit> function1) {
        C55276xgr[] c55276xgrArr = new C55276xgr[2];
        UnitType unitType = this.copydefault;
        UnitType unitType2 = UnitType.UnitTypePercent;
        c55276xgrArr[0] = new C55276xgr("%", unitType2, null, unitType == unitType2, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        UnitType unitType3 = this.copydefault;
        UnitType unitType4 = UnitType.UnitTypeToken;
        c55276xgrArr[1] = new C55276xgr(str, unitType4, null, unitType3 == unitType4, false, null, null, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, null);
        java.util.List listGEmmrt = yDY.gEmmrt(c55276xgrArr);
        C25247itC.Application application = C25247itC.Companion;
        int i = this.valueOf;
        C31172lox.TaskDescription taskDescription = C31172lox.Companion;
        C25247itC.Application.newInstance$default(application, listGEmmrt, null, C31172lox.KWHzl(i, taskDescription.OLrzqt()), C31172lox.KWHzl(this.valueOf, taskDescription.OLrzqt()) ? C52761wXj.Activity.OJuSTm : 0, 2, null).AEQbTJ(fragmentManager, "MemeModeUnitSelectDialog", new Function1() { // from class: o.itR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25255itK.KWHzl(this.AEQbTJ, str2, function1, (C55276xgr) obj);
            }
        }, new Function0() { // from class: o.itS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25255itK.EZpvd();
            }
        });
    }

    public static final Unit KWHzl(C25255itK c25255itK, java.lang.String str, Function1 function1, C55276xgr c55276xgr) {
        java.lang.Object objOLrzqt = c55276xgr != null ? c55276xgr.OLrzqt() : null;
        Intrinsics.copydefault(objOLrzqt, "");
        c25255itK.AYXKKw = (UnitType) objOLrzqt;
        java.lang.Object objOLrzqt2 = c55276xgr.OLrzqt();
        Intrinsics.copydefault(objOLrzqt2, "");
        UnitType unitType = (UnitType) objOLrzqt2;
        c25255itK.copydefault = unitType;
        c25255itK.djBIcL = unitType == UnitType.UnitTypeToken ? str : "";
        c25255itK.AEQbTJ(str);
        function1.invoke(c55276xgr);
        c25255itK.AEQbTJ.copydefault.setText("");
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public final C55001xbh KWHzl() {
        C55001xbh c55001xbh = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
        return c55001xbh;
    }

    public static /* synthetic */ void setEditTextByAuto$default(C25255itK c25255itK, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c25255itK.setEditTextByAuto(str);
    }

    public final void setEditTextByAuto(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() == 0) {
            android.text.Editable text = this.AEQbTJ.copydefault.getText();
            if (text != null) {
                text.clear();
            }
            setUnit(this.AYXKKw, this.djBIcL);
            this.AEQbTJ.copydefault.setHint(C31172lox.KWHzl(this.valueOf, C31172lox.Companion.KWHzl()) ? getContext().getString(C23274hvD.Fragment.MediaDescriptionCompat1) : "");
            return;
        }
        this.AEQbTJ.copydefault.setPlainNumericText(str);
    }

    public static /* synthetic */ void setContentText$default(C25255itK c25255itK, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            z = false;
        }
        c25255itK.setContentText(str, z);
    }

    public final void setContentText(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() != 0 || z) {
            if (z) {
                this.AEQbTJ.copydefault.requestFocus();
                this.AEQbTJ.copydefault.setText(str);
                return;
            }
            return;
        }
        android.text.Editable text = this.AEQbTJ.copydefault.getText();
        if (text != null) {
            text.clear();
        }
        setUnit(this.AYXKKw, this.djBIcL);
        this.AEQbTJ.copydefault.setHint(C31172lox.KWHzl(this.valueOf, C31172lox.Companion.KWHzl()) ? getContext().getString(C23274hvD.Fragment.MediaDescriptionCompat1) : "");
    }

    public final void setUnitSelectClickListener(@NotNull final androidx.fragment.app.FragmentManager fragmentManager, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, final java.lang.String str3, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super C55276xgr, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.itN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C25255itK.setUnitSelectClickListener$lambda$5(function0, this, fragmentManager, str, str2, str3, function1, view);
            }
        });
    }

    public static final void setUnitSelectClickListener$lambda$5(Function0 function0, C25255itK c25255itK, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, java.lang.String str2, java.lang.String str3, Function1 function1, android.view.View view) {
        function0.invoke();
        c25255itK.copydefault(fragmentManager, str, str2, str3, function1);
    }

    public final void OLrzqt(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        if (this.OLrzqt.isEmpty()) {
            AEQbTJ();
        }
        this.OLrzqt.add(function2);
    }

    public final void AEQbTJ(@NotNull Function2<? super C55001xbh, ? super java.lang.String, Unit> function2) {
        InterfaceC58217yxC interfaceC58217yxC;
        Intrinsics.checkNotNullParameter(function2, "");
        this.OLrzqt.remove(function2);
        if (!this.OLrzqt.isEmpty() || (interfaceC58217yxC = this.KWHzl) == null) {
            return;
        }
        interfaceC58217yxC.dispose();
    }

    public final void AEQbTJ() {
        InterfaceC58217yxC interfaceC58217yxC = this.KWHzl;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        final C55001xbh c55001xbh = this.AEQbTJ.copydefault;
        Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
        AbstractC58247yxg<AbstractC8060avc> abstractC58247yxgObserveOn = C8062ave.AEQbTJ(c55001xbh).skip(1L).debounce(this.EZpvd, java.util.concurrent.TimeUnit.MILLISECONDS).observeOn(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.itJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25255itK.OLrzqt(this.EZpvd, c55001xbh, (AbstractC8060avc) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC8060avc> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.itP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25255itK.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.itO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C25255itK.copydefault((java.lang.Throwable) obj);
            }
        };
        this.KWHzl = abstractC58247yxgObserveOn.subscribe(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.itQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C25255itK.copydefault(function12, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C25255itK c25255itK, C55001xbh c55001xbh, AbstractC8060avc abstractC8060avc) {
        java.util.Iterator<T> it = c25255itK.OLrzqt.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(c55001xbh, c55001xbh.isConnected());
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setUnitVisibility$default(C25255itK c25255itK, TransactionType transactionType, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c25255itK.setUnitVisibility(transactionType, z);
    }

    public final void setUnitVisibility(@NotNull TransactionType transactionType, boolean z) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        LinearLayoutCompat linearLayoutCompat = this.AEQbTJ.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility((transactionType == TransactionType.Sell && z) ? 0 : 8);
    }

    private final void AEQbTJ(java.lang.String str) {
        if (this.copydefault == UnitType.UnitTypePercent) {
            str = "";
        }
        KWHzl(str);
    }

    public static /* synthetic */ void setCustomViewBg$default(C25255itK c25255itK, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c25255itK.setCustomViewBg(z);
    }

    public final void setCustomViewBg(boolean z) {
        if (!z) {
            this.AEQbTJ.copydefault.clearFocus();
        }
        this.AEQbTJ.EZpvd.setSelected(z);
    }

    public final void setEditTextListener(@NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.AEQbTJ.copydefault.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.itL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C25255itK.setEditTextListener$lambda$11(function0, this, view, z);
            }
        });
    }

    public static final void setEditTextListener$lambda$11(Function0 function0, C25255itK c25255itK, android.view.View view, boolean z) {
        if (z) {
            function0.invoke();
            android.text.Editable text = c25255itK.AEQbTJ.copydefault.getText();
            if (text == null || text.length() != 0) {
                return;
            }
            c25255itK.AEQbTJ.copydefault.setHint("");
        }
    }
}
