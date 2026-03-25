package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import com.okinc.tradeapi.bean.CurrencyModel;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wnR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53539wnR extends ConstraintLayout {
    public Function0<Unit> KWHzl;
    public final AbstractC50994vee OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53539wnR(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53539wnR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.KWHzl = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferCoin(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:29) call: o.wnR.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53539wnR(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53539wnR(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.OtRJxF, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC50994vee abstractC50994vee = (AbstractC50994vee) viewDataBindingInflate;
        this.OLrzqt = abstractC50994vee;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C48033uCm.LoaderManager.gGvvIC, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "");
            try {
                abstractC50994vee.OLrzqt.setText(C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.flVtFt, 0)));
                C55312xha c55312xhaValueOf = abstractC50994vee.OLrzqt.valueOf();
                if (c55312xhaValueOf != null) {
                    c55312xhaValueOf.setShowUnderline(false);
                }
                C55312xha c55312xhaValueOf2 = abstractC50994vee.OLrzqt.valueOf();
                if (c55312xhaValueOf2 != null) {
                    c55312xhaValueOf2.copydefault();
                }
                abstractC50994vee.copydefault.setText(C33054mpH.AEQbTJ(typedArrayObtainStyledAttributes.getResourceId(C48033uCm.LoaderManager.gasjUx, 0)));
                android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.fzHEvu);
                if (drawable != null) {
                    DrawableCompat.setTint(drawable, ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl));
                }
                abstractC50994vee.EZpvd.setImageDrawable(drawable);
                if (C54589xNz.EZpvd.EZpvd() || !C55697xoo.OLrzqt.isConnected() || C56071xvr.gEmmrt.ejfBZ()) {
                    abstractC50994vee.EZpvd.setVisibility(8);
                } else {
                    setAvaShowTransfer(java.lang.Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(C48033uCm.LoaderManager.giSNqX, false)));
                }
                if (typedArrayObtainStyledAttributes.getBoolean(C48033uCm.LoaderManager.AxsJAYaxsJAY, false)) {
                    ConstraintSet constraintSet = new ConstraintSet();
                    android.view.View root = abstractC50994vee.getRoot();
                    Intrinsics.copydefault(root, "");
                    constraintSet.clone((ConstraintLayout) root);
                    constraintSet.setHorizontalBias(C48033uCm.Application.DBxZfM, 1.0f);
                    android.view.View root2 = abstractC50994vee.getRoot();
                    Intrinsics.copydefault(root2, "");
                    constraintSet.applyTo((ConstraintLayout) root2);
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.copydefault = "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wnR */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setFooterAvaTitle$default(C53539wnR c53539wnR, java.lang.String str, boolean z, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function0 = null;
        }
        c53539wnR.setFooterAvaTitle(str, z, function0);
    }

    public final void setFooterAvaTitle(java.lang.String str, boolean z, final Function0<Unit> function0) {
        C55258xgZ c55258xgZ = this.OLrzqt.OLrzqt;
        c55258xgZ.setText(str);
        if (!z) {
            C55312xha c55312xhaValueOf = c55258xgZ.valueOf();
            if (c55312xhaValueOf != null) {
                c55312xhaValueOf.setShowUnderline(false);
            }
            C55312xha c55312xhaValueOf2 = c55258xgZ.valueOf();
            if (c55312xhaValueOf2 != null) {
                c55312xhaValueOf2.copydefault();
            }
            c55258xgZ.setOnClickListener(null);
            return;
        }
        C55312xha c55312xhaValueOf3 = c55258xgZ.valueOf();
        if (c55312xhaValueOf3 != null) {
            c55312xhaValueOf3.setShowUnderline(true);
        }
        C55312xha c55312xhaValueOf4 = c55258xgZ.valueOf();
        if (c55312xhaValueOf4 != null) {
            c55312xhaValueOf4.OLrzqt();
        }
        c55258xgZ.setOnClickListener(new View.OnClickListener() { // from class: o.wnQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53539wnR.setFooterAvaTitle$lambda$1$lambda$0(function0, view);
            }
        });
    }

    public static final void setFooterAvaTitle$lambda$1$lambda$0(Function0 function0, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setUnderlineClick(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        C55312xha c55312xhaValueOf = this.OLrzqt.OLrzqt.valueOf();
        if (c55312xhaValueOf != null) {
            c55312xhaValueOf.setShowUnderline(true);
            c55312xhaValueOf.setOnClickListener(new Application(c55312xhaValueOf, 400L, function0));
        }
    }

    public final void setFooterAvaValue(java.lang.String str) {
        this.OLrzqt.copydefault.setText(str);
    }

    public final void setFooterAvaValueGravity(int i) {
        this.OLrzqt.copydefault.setGravity(i);
    }

    public final void setAvaShowTransfer(java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            this.OLrzqt.EZpvd.setVisibility(0);
            this.OLrzqt.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.wnV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C53539wnR.setAvaShowTransfer$lambda$5(this.KWHzl, view);
                }
            });
        } else {
            this.OLrzqt.EZpvd.setVisibility(8);
            this.OLrzqt.EZpvd.setOnClickListener(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void setAvaShowTransfer$lambda$5(C53539wnR c53539wnR, android.view.View view) {
        int iAhwBna;
        java.lang.String id;
        Function0<Unit> function0 = c53539wnR.KWHzl;
        if (function0 != null) {
            function0.invoke();
        }
        java.lang.String tradeSymbol = c53539wnR.copydefault;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeSymbol)) {
            BizInstrument bizInstrumentIsConnected = C56059xvf.EZpvd.isConnected();
            tradeSymbol = bizInstrumentIsConnected != null ? bizInstrumentIsConnected.getTradeSymbol() : null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            iAhwBna = -1;
        } else {
            TradeCoinInfo tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(tradeSymbol == null ? "" : tradeSymbol);
            if (tradeCoinInfoAhwBna != null && (id = tradeCoinInfoAhwBna.getId()) != null) {
                iAhwBna = C33129mqd.AhwBna(id);
            }
        }
        ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).OLrzqt((FragmentActivity) C35334ntP.EZpvd(c53539wnR), new CurrencyModel(iAhwBna, java.lang.String.valueOf(tradeSymbol)), false);
    }

    public final void setFooterAvaTextSize(float f) {
        this.OLrzqt.OLrzqt.setTextSize(f);
        this.OLrzqt.copydefault.setTextSize(f);
    }

    public final C55258xgZ OLrzqt() {
        C55258xgZ c55258xgZ = this.OLrzqt.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55258xgZ, "");
        return c55258xgZ;
    }

    public final android.widget.TextView copydefault() {
        android.widget.TextView textView = this.OLrzqt.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return textView;
    }

    /* JADX INFO: renamed from: o.wnR$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ Function0 AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, Function0 function0) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = function0;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.invoke();
            }
        }
    }
}
