package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.content.ContextCompat;
import com.okinc.business.market.features.position.ui.widget.BalanceInfoBottomSheet;
import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC29126knk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.koE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29147koE extends android.widget.FrameLayout {
    public final InterfaceC56387yDm AEQbTJ;
    public boolean AYXKKw;
    public boolean EZpvd;
    public InterfaceC29127knl KWHzl;
    public PnLDetailsUiModel OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public boolean djBIcL;
    public Function0<Unit> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29147koE(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C29147koE(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(android.view.View view) {
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:85) call: o.koE.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C29147koE(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29147koE(@NotNull final android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.koJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29147koE.AEQbTJ(context, this);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.koG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29147koE.EZpvd();
            }
        });
        AEQbTJ().djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.koI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29147koE.OLrzqt(this.AEQbTJ, view);
            }
        });
    }

    private final C21655hHk AEQbTJ() {
        return (C21655hHk) this.copydefault.getValue();
    }

    public static final C21655hHk AEQbTJ(android.content.Context context, C29147koE c29147koE) {
        return C21655hHk.KWHzl(android.view.LayoutInflater.from(context), c29147koE, true);
    }

    private final android.content.res.ColorStateList OLrzqt() {
        return (android.content.res.ColorStateList) this.AEQbTJ.getValue();
    }

    public static final android.content.res.ColorStateList EZpvd() {
        return C25382ivf.copydefault(C52761wXj.Activity.invokespecialDPHOMC);
    }

    public static final void OLrzqt(C29147koE c29147koE, android.view.View view) {
        c29147koE.AYXKKw = true;
        boolean z = true ^ c29147koE.djBIcL;
        c29147koE.djBIcL = z;
        c29147koE.OLrzqt(z);
    }

    public static /* synthetic */ void setData$default(C29147koE c29147koE, PnLDetailsUiModel pnLDetailsUiModel, boolean z, InterfaceC29127knl interfaceC29127knl, boolean z2, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            z2 = false;
        }
        c29147koE.setData(pnLDetailsUiModel, z, interfaceC29127knl, z2);
    }

    public final void setData(@NotNull PnLDetailsUiModel pnLDetailsUiModel, boolean z, InterfaceC29127knl interfaceC29127knl, boolean z2) {
        Intrinsics.checkNotNullParameter(pnLDetailsUiModel, "");
        this.KWHzl = interfaceC29127knl;
        this.OLrzqt = pnLDetailsUiModel;
        this.EZpvd = z;
        C21655hHk c21655hHkAEQbTJ = AEQbTJ();
        if (z2) {
            this.djBIcL = true;
            OLrzqt(true);
            wYC wyc = c21655hHkAEQbTJ.EZpvd;
            Intrinsics.checkNotNullExpressionValue(wyc, "");
            wyc.setVisibility(8);
            c21655hHkAEQbTJ.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.koH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29147koE.KWHzl(view);
                }
            });
            c21655hHkAEQbTJ.copydefault.setBackgroundTintList(OLrzqt());
            c21655hHkAEQbTJ.AEQbTJ.setBackgroundTintList(OLrzqt());
            c21655hHkAEQbTJ.OLrzqt.setBackgroundTintList(OLrzqt());
            c21655hHkAEQbTJ.KWHzl.setBackgroundTintList(OLrzqt());
        } else if (!this.AYXKKw) {
            boolean z3 = !(C33129mqd.djBIcL(pnLDetailsUiModel.DbNXlk()) == 0.0f);
            this.djBIcL = z3;
            OLrzqt(z3);
        }
        LinearLayoutCompat linearLayoutCompat = c21655hHkAEQbTJ.djBIcL;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(pnLDetailsUiModel.AYXKKw() ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat2 = c21655hHkAEQbTJ.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility((pnLDetailsUiModel.AYXKKw() && this.djBIcL) ? 0 : 8);
        if (!pnLDetailsUiModel.AYXKKw()) {
            android.widget.TextView textView = c21655hHkAEQbTJ.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            C55296xhK.margin$default(textView, null, java.lang.Float.valueOf(6.0f), null, null, 13, null);
        } else {
            copydefault(pnLDetailsUiModel);
            OLrzqt(pnLDetailsUiModel);
            KWHzl(pnLDetailsUiModel);
            EZpvd(pnLDetailsUiModel);
            AEQbTJ(pnLDetailsUiModel);
        }
    }

    private final void AEQbTJ(PnLDetailsUiModel pnLDetailsUiModel) {
        final C21655hHk c21655hHkAEQbTJ = AEQbTJ();
        c21655hHkAEQbTJ.copydefault.setOnClickListener(new View.OnClickListener() { // from class: o.koB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29147koE.setSoldPositionAndVolume$lambda$10$lambda$6(this.AEQbTJ, view);
            }
        });
        c21655hHkAEQbTJ.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.koF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29147koE.setSoldPositionAndVolume$lambda$10$lambda$7(c21655hHkAEQbTJ, view);
            }
        });
        LinearLayoutCompat linearLayoutCompat = c21655hHkAEQbTJ.KWHzl;
        linearLayoutCompat.setOnClickListener(new StateListAnimator(linearLayoutCompat, 1000L, this));
        c21655hHkAEQbTJ.AkhnZx.setOnClickListener(new View.OnClickListener() { // from class: o.koC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29147koE.setSoldPositionAndVolume$lambda$10$lambda$9(c21655hHkAEQbTJ, view);
            }
        });
        if (this.EZpvd) {
            c21655hHkAEQbTJ.values.setText("***");
            c21655hHkAEQbTJ.uzCIH.setText("***");
        } else {
            c21655hHkAEQbTJ.values.setText(EZpvd(pnLDetailsUiModel.OLrzqt()));
            c21655hHkAEQbTJ.uzCIH.setText(EZpvd(pnLDetailsUiModel.values()));
        }
    }

    public static final void setSoldPositionAndVolume$lambda$10$lambda$6(C29147koE c29147koE, android.view.View view) {
        InterfaceC29127knl interfaceC29127knl = c29147koE.KWHzl;
        if (interfaceC29127knl != null) {
            interfaceC29127knl.copydefault(new InterfaceC29126knk.ActionBar(yDY.gEmmrt(new BalanceInfoBottomSheet.Companion.PositionContent(C33070mpX.AYXKKw(C23274hvD.Fragment.isDevMode), C33070mpX.AYXKKw(C23274hvD.Fragment.sGvRiA)), new BalanceInfoBottomSheet.Companion.PositionContent(C33070mpX.AYXKKw(C23274hvD.Fragment.wtf), C33070mpX.AYXKKw(C23274hvD.Fragment.f1059a)))));
        }
    }

    /* JADX INFO: renamed from: o.koE$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C29147koE EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C29147koE c29147koE) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c29147koE;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                InterfaceC29127knl interfaceC29127knl = this.EZpvd.KWHzl;
                if (interfaceC29127knl != null) {
                    interfaceC29127knl.copydefault(new InterfaceC29126knk.ActionBar(yDY.gEmmrt(new BalanceInfoBottomSheet.Companion.PositionContent(C33070mpX.AYXKKw(C23274hvD.Fragment.IIEbr), C33070mpX.AYXKKw(C23274hvD.Fragment.sjbWxX)), new BalanceInfoBottomSheet.Companion.PositionContent(C33070mpX.AYXKKw(C23274hvD.Fragment.GVpNrsfQMcgE), C33070mpX.AYXKKw(C23274hvD.Fragment.fVBECu)))));
                }
            }
        }
    }

    public static final void setSoldPositionAndVolume$lambda$10$lambda$7(C21655hHk c21655hHk, android.view.View view) {
        c21655hHk.copydefault.performClick();
    }

    public static final void setSoldPositionAndVolume$lambda$10$lambda$9(C21655hHk c21655hHk, android.view.View view) {
        c21655hHk.KWHzl.performClick();
    }

    private final void EZpvd(PnLDetailsUiModel pnLDetailsUiModel) {
        C21655hHk c21655hHkAEQbTJ = AEQbTJ();
        if (this.EZpvd) {
            c21655hHkAEQbTJ.AYXKKw.setText("***");
            c21655hHkAEQbTJ.fARcdN.setText("***");
        } else {
            c21655hHkAEQbTJ.AYXKKw.setText(EZpvd(pnLDetailsUiModel.KWHzl()));
            c21655hHkAEQbTJ.fARcdN.setText(EZpvd(pnLDetailsUiModel.AhwBna()));
        }
    }

    private final void KWHzl(PnLDetailsUiModel pnLDetailsUiModel) {
        C21655hHk c21655hHkAEQbTJ = AEQbTJ();
        if (this.EZpvd) {
            c21655hHkAEQbTJ.fetchVPNInfo.setText("***");
            c21655hHkAEQbTJ.isConnected.setText("***");
            c21655hHkAEQbTJ.fetchVPNInfo.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            c21655hHkAEQbTJ.isConnected.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
            return;
        }
        java.lang.String strCopydefault = copydefault(pnLDetailsUiModel.gEmmrt());
        c21655hHkAEQbTJ.fetchVPNInfo.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, pnLDetailsUiModel.EZpvd(), true, RoundingMode.DOWN, false, false, false, false, DisplaySign.EXCEPT_ZERO, false, false, 444, null));
        android.widget.TextView textView = c21655hHkAEQbTJ.fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        kLY.KWHzl(textView, pnLDetailsUiModel.EZpvd(), java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl));
        c21655hHkAEQbTJ.isConnected.setText(strCopydefault);
        android.widget.TextView textView2 = c21655hHkAEQbTJ.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        kLY.updateColorByValue$default(textView2, pnLDetailsUiModel.gEmmrt(), null, 2, null);
    }

    private final void OLrzqt(PnLDetailsUiModel pnLDetailsUiModel) {
        C21655hHk c21655hHkAEQbTJ = AEQbTJ();
        if (this.EZpvd) {
            c21655hHkAEQbTJ.getFieldNames.setText("*****");
            c21655hHkAEQbTJ.getFieldNames.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            return;
        }
        c21655hHkAEQbTJ.getFieldNames.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, pnLDetailsUiModel.AkhnZx(), true, RoundingMode.DOWN, false, false, false, false, DisplaySign.EXCEPT_ZERO, false, false, 444, null) + " (" + copydefault(pnLDetailsUiModel.isConnected()) + ")");
        android.widget.TextView textView = c21655hHkAEQbTJ.getFieldNames;
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        textView.setTextColor(C25352ivB.EZpvd(context, pnLDetailsUiModel.AkhnZx()));
    }

    public final void setPnLHelper(final Function0<Unit> function0) {
        this.gEmmrt = function0;
        C55258xgZ c55258xgZ = AEQbTJ().hDKMBd;
        c55258xgZ.setHelperLabelType(1);
        C25352ivB.setOnDoubleCheckClickListener$default(c55258xgZ, 0L, new Function1() { // from class: o.koD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29147koE.KWHzl(function0, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final Unit KWHzl(Function0 function0, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final void copydefault(PnLDetailsUiModel pnLDetailsUiModel) {
        C21655hHk c21655hHkAEQbTJ = AEQbTJ();
        if (this.EZpvd) {
            c21655hHkAEQbTJ.fJNWhG.setText("***");
            c21655hHkAEQbTJ.ejfBZ.setText("***");
            c21655hHkAEQbTJ.fJNWhG.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
            c21655hHkAEQbTJ.ejfBZ.setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab));
            return;
        }
        java.lang.String strCopydefault = copydefault(pnLDetailsUiModel.fetchVPNInfo());
        c21655hHkAEQbTJ.fJNWhG.setText(C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, pnLDetailsUiModel.DbNXlk(), true, RoundingMode.DOWN, false, false, false, false, DisplaySign.EXCEPT_ZERO, false, false, 444, null));
        android.widget.TextView textView = c21655hHkAEQbTJ.fJNWhG;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        kLY.KWHzl(textView, pnLDetailsUiModel.DbNXlk(), java.lang.Integer.valueOf(C52761wXj.Activity.fdOvFl));
        c21655hHkAEQbTJ.ejfBZ.setText(strCopydefault);
        android.widget.TextView textView2 = c21655hHkAEQbTJ.ejfBZ;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        kLY.updateColorByValue$default(textView2, pnLDetailsUiModel.fetchVPNInfo(), null, 2, null);
    }

    public final void OLrzqt(boolean z) {
        C21655hHk c21655hHkAEQbTJ = AEQbTJ();
        c21655hHkAEQbTJ.EZpvd.setImageDrawable(ContextCompat.getDrawable(getContext(), z ? C52761wXj.TaskDescription.OxVOHk : C52761wXj.TaskDescription.OJuSTm));
        LinearLayoutCompat linearLayoutCompat = c21655hHkAEQbTJ.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        linearLayoutCompat.setVisibility(z ? 0 : 8);
    }

    public final java.lang.String copydefault(java.lang.String str) {
        java.lang.String strAEQbTJ = C31256lqb.AEQbTJ(str, (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.koK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29147koE.OLrzqt((java.lang.String) obj);
            }
        });
        return strAEQbTJ.length() == 0 ? "--" : strAEQbTJ;
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return kLY.formatPercentage$default(str, DisplaySign.EXCEPT_ZERO, false, null, null, 2, null);
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        return C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, str, true, RoundingMode.DOWN, false, false, false, false, null, false, false, TypedValues.PositionType.TYPE_CURVE_FIT, null);
    }

    public final void setLimitOrderData(@NotNull C29183koo c29183koo) {
        Intrinsics.checkNotNullParameter(c29183koo, "");
        C21655hHk c21655hHkAEQbTJ = AEQbTJ();
        android.widget.TextView textView = c21655hHkAEQbTJ.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(c29183koo.copydefault() ? 0 : 8);
        if (c29183koo.copydefault()) {
            java.lang.String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(C23272hvB.KWHzl, c29183koo.KWHzl(), false, null, false, false, false, false, null, false, false, FrameMetricsAggregator.EVERY_DURATION, null);
            java.lang.String tokenCode$default = C23271hvA.formatTokenCode$default(C23271hvA.copydefault, c29183koo.EZpvd(), true, null, false, null, null, 30, null);
            android.widget.TextView textView2 = c21655hHkAEQbTJ.DbNXlk;
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView2.setText(C33069mpW.KWHzl(context, C23274hvD.Fragment.gISBfG, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("num1", scientificCurrency$default), C56390yDp.OLrzqt("num2", tokenCode$default))));
        }
    }
}
