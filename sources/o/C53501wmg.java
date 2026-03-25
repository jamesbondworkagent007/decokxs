package o;

import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.okinc.unify_trade.biz.ArbitragePriceSetting;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C47978uAl;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.wmg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53501wmg extends android.widget.LinearLayout implements vBA {
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public InterfaceC50102vBz AhwBna;
    public Function2<? super java.lang.String, ? super java.lang.String, Unit> AkhnZx;
    public ArbitragePriceSetting DbNXlk;
    public java.lang.String EZpvd;
    public final AbstractC50860vcC KWHzl;
    public vBB OLrzqt;
    public java.lang.String copydefault;
    public androidx.fragment.app.FragmentManager djBIcL;
    public vBP fetchVPNInfo;
    public View.OnClickListener gEmmrt;
    public java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53501wmg(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53501wmg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    @Override // o.vBA
    public void setCrossType(java.lang.String str, boolean z) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFragmentManger(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.djBIcL = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.vBA
    public void setInstId(java.lang.String str) {
        this.AYXKKw = str;
    }

    @Override // o.vBA
    public void setLeverage(java.lang.String str) {
    }

    @Override // o.vBA
    public void setMarginMode(java.lang.String str, boolean z) {
    }

    @Override // o.vBA
    public void setMarginNum(java.lang.String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOnTradeModeClickListener(View.OnClickListener onClickListener) {
        this.gEmmrt = onClickListener;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPresenter(InterfaceC50102vBz interfaceC50102vBz) {
        this.AhwBna = interfaceC50102vBz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceCallback(@NotNull vBB vbb) {
        Intrinsics.checkNotNullParameter(vbb, "");
        this.OLrzqt = vbb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChangeCallback(Function2<? super java.lang.String, ? super java.lang.String, Unit> function2) {
        this.AkhnZx = function2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:50) call: o.wmg.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53501wmg(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53501wmg(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.OGitdB, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC50860vcC abstractC50860vcC = (AbstractC50860vcC) viewDataBindingInflate;
        this.KWHzl = abstractC50860vcC;
        this.AEQbTJ = "enter";
        setOrientation(1);
        abstractC50860vcC.djBIcL.setOnClickListener(new View.OnClickListener() { // from class: o.wmh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53501wmg.AYXKKw(this.OLrzqt, view);
            }
        });
        abstractC50860vcC.AYXKKw.setOnClickListener(new View.OnClickListener() { // from class: o.wmj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53501wmg.gEmmrt(this.OLrzqt, view);
            }
        });
        abstractC50860vcC.AhwBna.setOnClickListener(new View.OnClickListener() { // from class: o.wmi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53501wmg.valueOf(this.AEQbTJ, view);
            }
        });
        abstractC50860vcC.valueOf.setOnClickListener(new View.OnClickListener() { // from class: o.wmk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53501wmg.djBIcL(this.EZpvd, view);
            }
        });
        abstractC50860vcC.gEmmrt.setOnClickListener(new View.OnClickListener() { // from class: o.wmn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53501wmg.isConnected(this.OLrzqt, view);
            }
        });
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.QSLkRj);
        if (drawable != null) {
            drawable.setTint(context.getResources().getColor(C52761wXj.Activity.QwvEab));
        }
        if (drawable != null) {
            drawable.setBounds(0, 0, C33052mpF.AEQbTJ(12, context), C33052mpF.AEQbTJ(12, context));
        }
        abstractC50860vcC.OLrzqt.setActivated(true);
        abstractC50860vcC.djBIcL.setCompoundDrawablesRelative(null, null, drawable, null);
        abstractC50860vcC.EZpvd.setShowThousandsSeparator(true);
        abstractC50860vcC.EZpvd.addTextChangedListener(new uBH(new Function0() { // from class: o.wml
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53501wmg.EZpvd(this.KWHzl);
            }
        }));
        abstractC50860vcC.EZpvd.setOnTouchListener(new View.OnTouchListener() { // from class: o.wmm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                return C53501wmg.AEQbTJ(this.OLrzqt, view, motionEvent);
            }
        });
        abstractC50860vcC.EZpvd.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.wmo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                C53501wmg.AEQbTJ(this.copydefault, view, z);
            }
        });
        abstractC50860vcC.AEQbTJ.setOnClickListener(new View.OnClickListener() { // from class: o.wmp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53501wmg.AkhnZx(this.copydefault, view);
            }
        });
    }

    public static final void AYXKKw(C53501wmg c53501wmg, android.view.View view) {
        c53501wmg.gEmmrt();
        View.OnClickListener onClickListener = c53501wmg.gEmmrt;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static final void gEmmrt(C53501wmg c53501wmg, android.view.View view) {
        java.lang.String strValueOf;
        c53501wmg.KWHzl(!view.isSelected());
        ArbitragePriceSetting arbitragePriceSetting = c53501wmg.DbNXlk;
        if ((arbitragePriceSetting != null ? arbitragePriceSetting.getMakerRange() : null) == null) {
            strValueOf = java.lang.String.valueOf(c53501wmg.KWHzl.AYXKKw.getText());
        } else {
            java.lang.CharSequence text = c53501wmg.KWHzl.AYXKKw.getText();
            java.lang.String strValues = c53501wmg.values();
            ArbitragePriceSetting arbitragePriceSetting2 = c53501wmg.DbNXlk;
            strValueOf = ((java.lang.Object) text) + strValues + (arbitragePriceSetting2 != null ? arbitragePriceSetting2.getMakerRange() : null);
        }
        c53501wmg.KWHzl(strValueOf);
        android.widget.TextView textView = c53501wmg.KWHzl.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        c53501wmg.OLrzqt(textView);
        if (c53501wmg.KWHzl.AYXKKw.isSelected()) {
            c53501wmg.AEQbTJ = "queuingPrice";
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c53501wmg.AkhnZx;
            if (function2 != null) {
                ArbitragePriceSetting arbitragePriceSetting3 = c53501wmg.DbNXlk;
                function2.invoke("queuingPrice", java.lang.String.valueOf(arbitragePriceSetting3 != null ? arbitragePriceSetting3.getMakerRange() : null));
                return;
            }
            return;
        }
        c53501wmg.AEQbTJ = "enter";
        Function2<? super java.lang.String, ? super java.lang.String, Unit> function22 = c53501wmg.AkhnZx;
        if (function22 != null) {
            function22.invoke("enter", "");
        }
    }

    public static final void valueOf(C53501wmg c53501wmg, android.view.View view) {
        java.lang.String strValueOf;
        c53501wmg.KWHzl(!view.isSelected());
        ArbitragePriceSetting arbitragePriceSetting = c53501wmg.DbNXlk;
        if ((arbitragePriceSetting != null ? arbitragePriceSetting.getTakerRange() : null) == null) {
            strValueOf = java.lang.String.valueOf(c53501wmg.KWHzl.AhwBna.getText());
        } else {
            java.lang.CharSequence text = c53501wmg.KWHzl.AhwBna.getText();
            java.lang.String strAYXKKw = c53501wmg.AYXKKw();
            ArbitragePriceSetting arbitragePriceSetting2 = c53501wmg.DbNXlk;
            strValueOf = ((java.lang.Object) text) + strAYXKKw + (arbitragePriceSetting2 != null ? arbitragePriceSetting2.getTakerRange() : null);
        }
        c53501wmg.KWHzl(strValueOf);
        android.widget.TextView textView = c53501wmg.KWHzl.AhwBna;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        c53501wmg.OLrzqt(textView);
        if (c53501wmg.KWHzl.AhwBna.isSelected()) {
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c53501wmg.AkhnZx;
            if (function2 != null) {
                ArbitragePriceSetting arbitragePriceSetting3 = c53501wmg.DbNXlk;
                function2.invoke("overpriced", java.lang.String.valueOf(arbitragePriceSetting3 != null ? arbitragePriceSetting3.getTakerRange() : null));
            }
            c53501wmg.AEQbTJ = "overpriced";
            return;
        }
        c53501wmg.AEQbTJ = "enter";
        Function2<? super java.lang.String, ? super java.lang.String, Unit> function22 = c53501wmg.AkhnZx;
        if (function22 != null) {
            function22.invoke("enter", "");
        }
    }

    public static final void djBIcL(C53501wmg c53501wmg, android.view.View view) {
        c53501wmg.KWHzl(!view.isSelected());
        android.widget.TextView textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
        c53501wmg.KWHzl(java.lang.String.valueOf(textView != null ? textView.getText() : null));
        android.widget.TextView textView2 = c53501wmg.KWHzl.valueOf;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        c53501wmg.OLrzqt(textView2);
        if (c53501wmg.KWHzl.valueOf.isSelected()) {
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c53501wmg.AkhnZx;
            if (function2 != null) {
                function2.invoke("counterpartyPrice", "");
            }
            c53501wmg.AEQbTJ = "counterpartyPrice";
            return;
        }
        c53501wmg.AEQbTJ = "enter";
        Function2<? super java.lang.String, ? super java.lang.String, Unit> function22 = c53501wmg.AkhnZx;
        if (function22 != null) {
            function22.invoke("enter", "");
        }
    }

    public static final void isConnected(C53501wmg c53501wmg, android.view.View view) {
        if (Intrinsics.EZpvd((java.lang.Object) c53501wmg.valueOf, (java.lang.Object) "OPTION")) {
            C33134mqi.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.getFlagsValues));
            return;
        }
        c53501wmg.KWHzl(!view.isSelected());
        android.widget.TextView textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
        c53501wmg.KWHzl(java.lang.String.valueOf(textView != null ? textView.getText() : null));
        android.widget.TextView textView2 = c53501wmg.KWHzl.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        c53501wmg.OLrzqt(textView2);
        if (c53501wmg.KWHzl.gEmmrt.isSelected()) {
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c53501wmg.AkhnZx;
            if (function2 != null) {
                function2.invoke("marketPrice", "");
            }
            c53501wmg.AEQbTJ = "marketPrice";
            return;
        }
        Function2<? super java.lang.String, ? super java.lang.String, Unit> function22 = c53501wmg.AkhnZx;
        if (function22 != null) {
            function22.invoke("enter", "");
        }
        c53501wmg.AEQbTJ = "enter";
    }

    public static final Unit EZpvd(C53501wmg c53501wmg) {
        if (Intrinsics.EZpvd((java.lang.Object) c53501wmg.AEQbTJ, (java.lang.Object) "enter")) {
            Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = c53501wmg.AkhnZx;
            if (function2 != null) {
                function2.invoke("enter", c53501wmg.KWHzl.EZpvd.isConnected());
            }
            c53501wmg.AhwBna();
        }
        return Unit.INSTANCE;
    }

    public static final boolean AEQbTJ(C53501wmg c53501wmg, android.view.View view, android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            showEnterInputModel$default(c53501wmg, false, 1, null);
            c53501wmg.KWHzl(true);
        }
        return true;
    }

    public static final void AEQbTJ(C53501wmg c53501wmg, android.view.View view, boolean z) {
        c53501wmg.KWHzl.OLrzqt.setSelected(z);
        if (z) {
            return;
        }
        c53501wmg.KWHzl();
    }

    public static final void AkhnZx(C53501wmg c53501wmg, android.view.View view) {
        c53501wmg.KWHzl(true);
        showEnterInputModel$default(c53501wmg, false, 1, null);
    }

    public final void gEmmrt() {
        vBS vbs;
        InterfaceC50102vBz interfaceC50102vBz = this.AhwBna;
        if (interfaceC50102vBz instanceof vBS) {
            Intrinsics.copydefault(interfaceC50102vBz, "");
            vbs = (vBS) interfaceC50102vBz;
        } else {
            vbs = null;
        }
        androidx.fragment.app.FragmentManager fragmentManager = this.djBIcL;
        if (fragmentManager == null || vbs == null || fragmentManager == null) {
            return;
        }
        java.util.List<vBP> listValues = vbs.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listValues, 10));
        for (vBP vbp : listValues) {
            java.lang.String strAEQbTJ = vbp.AEQbTJ();
            java.lang.String str = strAEQbTJ == null ? "" : strAEQbTJ;
            java.lang.String strAEQbTJ2 = vbp.AEQbTJ();
            vBP vbpIsConnected = vbs.isConnected();
            arrayList.add(new TradeMenuItemBean(str, Intrinsics.EZpvd((java.lang.Object) strAEQbTJ2, (java.lang.Object) (vbpIsConnected != null ? vbpIsConnected.AEQbTJ() : null)), vbp, null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
        }
        C47978uAl c47978uAlNewInstance$default = C47978uAl.Application.newInstance$default(C47978uAl.Companion, arrayList, null, false, null, 0, 30, null);
        c47978uAlNewInstance$default.KWHzl(new ActionBar(vbs, this));
        c47978uAlNewInstance$default.show(fragmentManager, "trade_order_type");
    }

    /* JADX INFO: renamed from: o.wmg$ActionBar */
    public static final class ActionBar implements C47978uAl.StateListAnimator {
        public final /* synthetic */ C53501wmg AEQbTJ;
        public final /* synthetic */ vBS copydefault;

        public ActionBar(vBS vbs, C53501wmg c53501wmg) {
            this.copydefault = vbs;
            this.AEQbTJ = c53501wmg;
        }

        @Override // o.C47978uAl.StateListAnimator
        public void copydefault(TradeMenuItemBean tradeMenuItemBean) {
            java.lang.String strKWHzl;
            java.lang.String strOLrzqt;
            java.lang.String str = "";
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            vBS vbs = this.copydefault;
            java.lang.Object data = tradeMenuItemBean.getData();
            vbs.AEQbTJ(data instanceof vBP ? (vBP) data : null);
            vBA vbaEjfBZ = this.copydefault.ejfBZ();
            if (vbaEjfBZ != null) {
                vbaEjfBZ.setTradeOrderType(this.copydefault.isConnected());
            }
            vBB vbb = this.AEQbTJ.OLrzqt;
            if (vbb != null) {
                vBP vbpIsConnected = this.copydefault.isConnected();
                if (vbpIsConnected == null || (strKWHzl = vbpIsConnected.KWHzl()) == null) {
                    strKWHzl = "";
                }
                vBP vbpIsConnected2 = this.copydefault.isConnected();
                if (vbpIsConnected2 != null && (strOLrzqt = vbpIsConnected2.OLrzqt()) != null) {
                    str = strOLrzqt;
                }
                vbb.AEQbTJ(strKWHzl, str);
            }
        }
    }

    public final void KWHzl(boolean z) {
        android.widget.TextView textView = this.KWHzl.values;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
        if (z) {
            this.KWHzl.EZpvd.setGravity(8388613);
        } else {
            this.KWHzl.EZpvd.setGravity(8388611);
        }
    }

    public final void setPriceInputFilters(int i) {
        this.KWHzl.EZpvd.setMaxDecimalValue(i);
    }

    private final java.lang.String AYXKKw() {
        vBP vbp = this.fetchVPNInfo;
        return Intrinsics.EZpvd((java.lang.Object) (vbp != null ? vbp.KWHzl() : null), (java.lang.Object) "buy") ? Marker.ANY_NON_NULL_MARKER : "-";
    }

    private final java.lang.String values() {
        vBP vbp = this.fetchVPNInfo;
        return Intrinsics.EZpvd((java.lang.Object) (vbp != null ? vbp.KWHzl() : null), (java.lang.Object) "buy") ? "-" : Marker.ANY_NON_NULL_MARKER;
    }

    public final void OLrzqt(android.widget.TextView textView) {
        if (!Intrinsics.EZpvd(textView, this.KWHzl.AYXKKw)) {
            this.KWHzl.AYXKKw.setSelected(false);
        }
        if (!Intrinsics.EZpvd(textView, this.KWHzl.AhwBna)) {
            this.KWHzl.AhwBna.setSelected(false);
        }
        if (!Intrinsics.EZpvd(textView, this.KWHzl.valueOf)) {
            this.KWHzl.valueOf.setSelected(false);
        }
        if (!Intrinsics.EZpvd(textView, this.KWHzl.gEmmrt)) {
            this.KWHzl.gEmmrt.setSelected(false);
        }
        textView.setSelected(!textView.isSelected());
        this.KWHzl.EZpvd.setCursorVisible(false);
        this.KWHzl.OLrzqt.setSelected(false);
        if (textView.isSelected()) {
            return;
        }
        EZpvd(false);
        KWHzl(true);
    }

    public final void djBIcL() {
        this.KWHzl.EZpvd.requestFocus();
        this.KWHzl.EZpvd.setCursorVisible(true);
        if (C33565myp.EZpvd().KWHzl((android.app.Activity) getContext())) {
            return;
        }
        java.lang.Object systemService = getContext().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInputFromWindow(this.KWHzl.EZpvd.getWindowToken(), 0, 2);
        }
    }

    @Override // o.vBA
    public void setCoinName(java.lang.String str) {
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) this.EZpvd)) {
            EZpvd();
        }
        this.EZpvd = str;
    }

    @Override // o.vBA
    public void setTradeOrderType(vBP vbp) {
        int iAEQbTJ;
        this.fetchVPNInfo = vbp;
        this.KWHzl.djBIcL.setText(vbp != null ? vbp.AEQbTJ() : null);
        android.widget.TextView textView = this.KWHzl.djBIcL;
        if (Intrinsics.EZpvd((java.lang.Object) (vbp != null ? vbp.KWHzl() : null), (java.lang.Object) "buy")) {
            android.content.Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iAEQbTJ = C33508mxl.copydefault(context);
        } else {
            android.content.Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iAEQbTJ = C33508mxl.AEQbTJ(context2);
        }
        textView.setTextColor(iAEQbTJ);
        valueOf();
    }

    @Override // o.vBA
    public void setInsType(java.lang.String str) {
        this.valueOf = str;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "OPTION")) {
            this.KWHzl.gEmmrt.setTextColor(getContext().getResources().getColor(C32113mPz.ActionBar.getFieldNames));
        } else {
            this.KWHzl.gEmmrt.setTextColor(ContextCompat.getColorStateList(getContext(), C48033uCm.StateListAnimator.OLrzqt));
        }
    }

    @Override // o.vBA
    public void setUnit(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl.isConnected.setText(str);
    }

    public final void valueOf() {
        if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "queuingPrice")) {
            java.lang.CharSequence text = this.KWHzl.AYXKKw.getText();
            java.lang.String strValues = values();
            ArbitragePriceSetting arbitragePriceSetting = this.DbNXlk;
            KWHzl(((java.lang.Object) text) + strValues + (arbitragePriceSetting != null ? arbitragePriceSetting.getMakerRange() : null));
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "overpriced")) {
            java.lang.CharSequence text2 = this.KWHzl.AhwBna.getText();
            java.lang.String strAYXKKw = AYXKKw();
            ArbitragePriceSetting arbitragePriceSetting2 = this.DbNXlk;
            KWHzl(((java.lang.Object) text2) + strAYXKKw + (arbitragePriceSetting2 != null ? arbitragePriceSetting2.getTakerRange() : null));
        }
    }

    public static /* synthetic */ void showEnterInputModel$default(C53501wmg c53501wmg, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c53501wmg.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        this.KWHzl.OLrzqt.setSelected(true);
        this.KWHzl.AYXKKw.setSelected(false);
        this.KWHzl.AhwBna.setSelected(false);
        this.KWHzl.valueOf.setSelected(false);
        this.KWHzl.gEmmrt.setSelected(false);
        this.KWHzl.EZpvd.setCursorVisible(true);
        if (!Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) "enter")) {
            copydefault();
            this.KWHzl.EZpvd.setPlainNumericText("");
        }
        this.AEQbTJ = "enter";
        Function2<? super java.lang.String, ? super java.lang.String, Unit> function2 = this.AkhnZx;
        if (function2 != null) {
            function2.invoke("enter", "0");
        }
        if (z) {
            djBIcL();
        }
    }

    public final void EZpvd() {
        this.AEQbTJ = "enter";
        copydefault();
        this.KWHzl.EZpvd.setPlainNumericText("");
        this.KWHzl.AYXKKw.setSelected(false);
        this.KWHzl.AhwBna.setSelected(false);
        this.KWHzl.valueOf.setSelected(false);
        this.KWHzl.gEmmrt.setSelected(false);
        if (Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) "OPTION")) {
            this.KWHzl.gEmmrt.setTextColor(getContext().getResources().getColor(C32113mPz.ActionBar.getFieldNames));
        } else {
            this.KWHzl.gEmmrt.setTextColor(ContextCompat.getColorStateList(getContext(), C48033uCm.StateListAnimator.OLrzqt));
        }
        KWHzl(true);
    }

    public final void AhwBna() {
        java.lang.String str;
        java.lang.String str2 = this.AYXKKw;
        if (str2 == null || str2.length() == 0 || (str = this.valueOf) == null || str.length() == 0) {
            return;
        }
        java.lang.String strIsConnected = this.KWHzl.EZpvd.isConnected();
        pUU.EZpvd("ArbitragePriceView", "text: " + strIsConnected + ", instId: " + this.AYXKKw + ", insType: " + this.valueOf);
        setInputErrorMsg(xVK.EZpvd.EZpvd(strIsConnected, this.AYXKKw, this.valueOf));
    }

    public final void setInputErrorMsg(java.lang.String[] strArr) {
        java.lang.String str;
        if (strArr != null && strArr.length == 2) {
            this.KWHzl.OLrzqt.setActivated(false);
            android.widget.TextView textView = this.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            this.KWHzl.copydefault.setText(strArr[0]);
            pUU.EZpvd("ArbitragePriceView", "errorMsg: " + strArr[0]);
            str = strArr[1];
        } else {
            this.KWHzl.OLrzqt.setActivated(true);
            this.KWHzl.copydefault.setText("");
            android.widget.TextView textView2 = this.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            pUU.EZpvd("ArbitragePriceView", "errorMsg is null!");
            str = null;
        }
        this.copydefault = str;
    }

    public final void KWHzl() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.copydefault)) {
            this.KWHzl.OLrzqt.setActivated(true);
            android.widget.TextView textView = this.KWHzl.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            this.KWHzl.copydefault.setText("");
            C55001xbh c55001xbh = this.KWHzl.EZpvd;
            java.lang.String str = this.copydefault;
            Intrinsics.copydefault((java.lang.Object) str);
            c55001xbh.setPlainNumericText(str);
            this.copydefault = null;
        }
    }

    public final void setPriceSetting(ArbitragePriceSetting arbitragePriceSetting) {
        this.DbNXlk = arbitragePriceSetting;
        valueOf();
    }

    public final java.lang.String AEQbTJ() {
        return this.KWHzl.djBIcL.getText().toString();
    }

    public final java.lang.String OLrzqt() {
        return this.KWHzl.isConnected.getText().toString();
    }

    private final void KWHzl(java.lang.String str) {
        android.widget.TextView textView = this.KWHzl.values;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        android.widget.TextView textView2 = this.KWHzl.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        this.KWHzl.EZpvd.setPlainNumericText("");
        C55001xbh c55001xbh = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
        c55001xbh.setVisibility(8);
        android.widget.TextView textView3 = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(0);
        this.KWHzl.KWHzl.setText(str);
    }

    public final void copydefault() {
        android.widget.TextView textView = this.KWHzl.values;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        android.widget.TextView textView2 = this.KWHzl.isConnected;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        this.KWHzl.KWHzl.setText("");
        android.widget.TextView textView3 = this.KWHzl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(8);
        C55001xbh c55001xbh = this.KWHzl.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55001xbh, "");
        c55001xbh.setVisibility(0);
        this.KWHzl.EZpvd.setPlainNumericText("");
        this.KWHzl.EZpvd.requestFocus();
    }
}
