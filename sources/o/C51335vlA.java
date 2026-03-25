package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.PointerIconCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.biz.TradeType;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C32113mPz;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vlA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51335vlA extends AbstractC51292vkK implements InterfaceC53558wnk {
    public Function1<? super java.lang.Boolean, Unit> AEQbTJ;
    public Function1<? super java.lang.String, Unit> EZpvd;
    public Function1<? super java.lang.String, Unit> KWHzl;
    public final uSD OLrzqt;
    public final Function2<C47988uAv, java.lang.String, Unit> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmtChangeCallback(Function1<? super java.lang.String, Unit> function1) {
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51292vkK
    public void setAmtChangeListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLockFundChangeCallback(Function1<? super java.lang.Boolean, Unit> function1) {
        this.AEQbTJ = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51292vkK
    public void setQuotePercentListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51335vlA(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.ggKfIT, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (uSD) viewDataBindingInflate;
        this.copydefault = new Function2() { // from class: o.vlF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51335vlA.OLrzqt(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        gEmmrt();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51335vlA(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.ggKfIT, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (uSD) viewDataBindingInflate;
        this.copydefault = new Function2() { // from class: o.vlF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51335vlA.OLrzqt(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        gEmmrt();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51335vlA(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C48033uCm.Activity.ggKfIT, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        this.OLrzqt = (uSD) viewDataBindingInflate;
        this.copydefault = new Function2() { // from class: o.vlF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51335vlA.OLrzqt(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        gEmmrt();
    }

    public static final Unit OLrzqt(C51335vlA c51335vlA, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        Function1<? super java.lang.String, Unit> function1 = c51335vlA.KWHzl;
        if (function1 != null) {
            if (str == null) {
                str = "";
            }
            function1.invoke(str);
        }
        if (c47988uAv.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c47988uAv, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    private final void gEmmrt() {
        setOrientation(1);
        this.OLrzqt.KWHzl.setOnTextChangeCallback(this.copydefault);
        this.OLrzqt.KWHzl.setPercentSeekBarListener(new Function1() { // from class: o.vlE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51335vlA.OLrzqt(this.KWHzl, ((java.lang.Float) obj).floatValue());
            }
        });
        this.OLrzqt.valueOf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vlD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C51335vlA.OLrzqt(this.KWHzl, compoundButton, z);
            }
        });
        C55258xgZ c55258xgZ = this.OLrzqt.EZpvd;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
        this.OLrzqt.valueOf.setChecked(true);
    }

    public static final Unit OLrzqt(C51335vlA c51335vlA, float f) {
        Function1<? super java.lang.String, Unit> function1 = c51335vlA.EZpvd;
        if (function1 != null) {
            function1.invoke(C33129mqd.gEmmrt(java.lang.Float.valueOf(f)));
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C51335vlA c51335vlA, android.widget.CompoundButton compoundButton, boolean z) {
        android.widget.TextView textView = c51335vlA.OLrzqt.djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        boolean z2 = !z;
        textView.setVisibility(z2 ? 0 : 8);
        ConstraintLayout constraintLayout = c51335vlA.OLrzqt.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(z2 ? 0 : 8);
        Function1<? super java.lang.Boolean, Unit> function1 = c51335vlA.AEQbTJ;
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: o.vlA$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    @Override // o.AbstractC51292vkK
    public void OLrzqt(StrategyConfigInfo strategyConfigInfo) {
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = this.OLrzqt.values;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.EZpvd(c54154wyx, strategyConfigInfo);
    }

    @Override // o.InterfaceC53558wnk
    public void AEQbTJ(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt.AkhnZx.setOnSelectedCallback(function1);
        uBL ubl = this.OLrzqt.AkhnZx;
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(getContext());
        AppCompatActivity appCompatActivity = activityOLrzqt instanceof AppCompatActivity ? (AppCompatActivity) activityOLrzqt : null;
        ubl.setFm(appCompatActivity != null ? appCompatActivity.getSupportFragmentManager() : null);
    }

    @Override // o.InterfaceC53558wnk
    public java.lang.String EZpvd(ViewModelStoreOwner viewModelStoreOwner, BizInstrument bizInstrument, @NotNull TradeType tradeType) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        this.OLrzqt.AkhnZx.copydefault(viewModelStoreOwner, bizInstrument, tradeType, false);
        uBL ubl = this.OLrzqt.AkhnZx;
        Intrinsics.checkNotNullExpressionValue(ubl, "");
        ubl.setVisibility((bizInstrument == null || !bizInstrument.isDisplayTradeReceive()) ? 8 : 0);
        return AhwBna();
    }

    @Override // o.InterfaceC53558wnk
    public java.lang.String AhwBna() {
        return this.OLrzqt.AkhnZx.OLrzqt();
    }

    @Override // o.AbstractC51292vkK
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.OLrzqt.copydefault.setTransferCoin(str3);
        C47988uAv.setInputLabel$default(this.OLrzqt.KWHzl, str, null, 2, null);
        this.OLrzqt.KWHzl.setInputUnit(str2);
        this.OLrzqt.KWHzl.setMaxDecimal(i);
    }

    @Override // o.AbstractC51292vkK
    public void setBalance(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.copydefault.setFooterAvaValue(str);
    }

    @Override // o.AbstractC51292vkK
    public void setMinInvest(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.KWHzl.setInputHint(str);
    }

    @Override // o.AbstractC51292vkK
    public void setQuoteContent(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt.KWHzl.setOnTextChangeCallback(null);
        C47988uAv.setInputContent$default(this.OLrzqt.KWHzl, str, false, false, 6, null);
        this.OLrzqt.KWHzl.setOnTextChangeCallback(this.copydefault);
        this.OLrzqt.KWHzl.copydefault();
        Function1<? super java.lang.String, Unit> function1 = this.KWHzl;
        if (function1 != null) {
            function1.invoke(this.OLrzqt.KWHzl.AkhnZx());
        }
    }

    @Override // o.AbstractC51292vkK
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            this.OLrzqt.KWHzl.copydefault();
        } else {
            this.OLrzqt.KWHzl.setInputErrorMsg(str);
        }
    }

    @Override // o.AbstractC51292vkK
    public CopyBotReqParam EZpvd() {
        return new CopyBotReqParam(null, this.OLrzqt.KWHzl.AkhnZx(), null, false, null, null, null, null, false, null, PointerIconCompat.TYPE_GRABBING, null);
    }

    @Override // o.AbstractC51292vkK
    public boolean AEQbTJ() {
        if (this.OLrzqt.KWHzl.AkhnZx().length() == 0) {
            this.OLrzqt.KWHzl.zsXlph();
            return false;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.OLrzqt.KWHzl.fetchVPNInfo())) {
            this.OLrzqt.KWHzl.zsXlph();
            return false;
        }
        android.widget.TextView textView = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        if (textView.getVisibility() != 0) {
            return true;
        }
        C56002xub.KWHzl.OLrzqt();
        return false;
    }

    /* JADX INFO: renamed from: o.vlA$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C51335vlA AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51335vlA c51335vlA) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c51335vlA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.hrNTAI));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), (View.OnClickListener) new ActionBar(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public final void OLrzqt(boolean z) {
        android.widget.TextView textView = this.OLrzqt.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.widget.TextView textView = this.OLrzqt.AhwBna;
        if (str.length() == 0) {
            str = "--";
        }
        textView.setText(str);
    }

    public final void copydefault(boolean z) {
        this.OLrzqt.valueOf.setEnabled(z);
        this.OLrzqt.EZpvd.setTextColor(C33070mpX.copydefault(z ? C32113mPz.ActionBar.zLjUOn : C32113mPz.ActionBar.getFieldNames));
    }

    @Override // o.AbstractC51292vkK
    public void copydefault() {
        if (this.OLrzqt.KWHzl.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(this.OLrzqt.KWHzl, false, 1, null);
            this.OLrzqt.KWHzl.setInputCover(null);
        }
    }
}
