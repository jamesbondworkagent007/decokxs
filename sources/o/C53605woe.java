package o;

import android.view.View;
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

/* JADX INFO: renamed from: o.woe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53605woe extends android.widget.RelativeLayout {
    public final AbstractC50994vee AEQbTJ;
    public java.lang.String EZpvd;
    public Function0<Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53605woe(@NotNull android.content.Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C53605woe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferClickCallback(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferCoin(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (wrap:android.util.AttributeSet:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null android.util.AttributeSet) : (r2v0 android.util.AttributeSet))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(android.content.Context, android.util.AttributeSet, int):void (m)] (LINE:26) call: o.woe.<init>(android.content.Context, android.util.AttributeSet, int):void type: THIS */
    public /* synthetic */ C53605woe(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53605woe(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        boolean z = true;
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(context), C48033uCm.Activity.OtRJxF, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC50994vee abstractC50994vee = (AbstractC50994vee) viewDataBindingInflate;
        this.AEQbTJ = abstractC50994vee;
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
                if (C56071xvr.gEmmrt.ejfBZ()) {
                    abstractC50994vee.EZpvd.setVisibility(8);
                } else {
                    C54589xNz c54589xNz = C54589xNz.EZpvd;
                    if (c54589xNz.EZpvd()) {
                        abstractC50994vee.EZpvd.setVisibility(8);
                    } else {
                        if (!typedArrayObtainStyledAttributes.getBoolean(C48033uCm.LoaderManager.giSNqX, false) || c54589xNz.EZpvd() || !C55697xoo.OLrzqt.isConnected()) {
                            z = false;
                        }
                        setAvaShowTransfer(java.lang.Boolean.valueOf(z));
                    }
                }
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.EZpvd = "";
    }

    public final void setFooterAvaTitle(java.lang.String str) {
        this.AEQbTJ.OLrzqt.setText(str);
    }

    public final void setFooterAvaValue(java.lang.String str) {
        this.AEQbTJ.copydefault.setText(str);
    }

    public final void setAvaShowTransfer(java.lang.Boolean bool) {
        if (Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE)) {
            this.AEQbTJ.EZpvd.setVisibility(0);
            this.AEQbTJ.EZpvd.setOnClickListener(new View.OnClickListener() { // from class: o.wof
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C53605woe.setAvaShowTransfer$lambda$1(this.OLrzqt, view);
                }
            });
        } else {
            this.AEQbTJ.EZpvd.setVisibility(8);
            this.AEQbTJ.EZpvd.setOnClickListener(null);
        }
    }

    public static final void setAvaShowTransfer$lambda$1(C53605woe c53605woe, android.view.View view) {
        java.lang.String tradeSymbol;
        TradeCoinInfo tradeCoinInfoAhwBna;
        java.lang.String id;
        Function0<Unit> function0 = c53605woe.copydefault;
        if (function0 != null) {
            function0.invoke();
        }
        java.lang.String str = c53605woe.EZpvd;
        if (str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            BizInstrument bizInstrumentIsConnected = C56059xvf.EZpvd.isConnected();
            if (bizInstrumentIsConnected == null || (tradeSymbol = bizInstrumentIsConnected.getTradeSymbol()) == null) {
                tradeSymbol = "";
            }
        } else {
            tradeSymbol = c53605woe.EZpvd;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        int iAhwBna = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(tradeSymbol)) == null || (id = tradeCoinInfoAhwBna.getId()) == null) ? -1 : C33129mqd.AhwBna(id);
        android.content.Context context = c53605woe.getContext();
        FragmentActivity fragmentActivity = context instanceof FragmentActivity ? (FragmentActivity) context : null;
        if (fragmentActivity != null) {
            ((InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI)).OLrzqt(fragmentActivity, new CurrencyModel(iAhwBna, java.lang.String.valueOf(tradeSymbol)), false);
        }
    }
}
