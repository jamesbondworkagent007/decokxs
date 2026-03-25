package o;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.ViewModelStoreOwner;
import com.okinc.biz.TradeType;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotLeverConfig;
import com.okinc.unify_trade.biz.LiquidatePriceResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vlo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51375vlo extends AbstractC51292vkK implements InterfaceC53558wnk {
    public final Function2<C47988uAv, java.lang.String, Unit> AEQbTJ;
    public vKO AYXKKw;
    public final uBL AhwBna;
    public Function1<? super java.lang.String, Unit> EZpvd;
    public android.widget.TextView KWHzl;
    public C53539wnR OLrzqt;
    public C50191vFg copydefault;
    public Function1<? super java.lang.String, Unit> djBIcL;
    public C47988uAv gEmmrt;
    public vKO valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51292vkK
    public void setAmtChangeListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51292vkK
    public void setQuotePercentListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.djBIcL = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51375vlo(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Function2<C47988uAv, java.lang.String, Unit> function2 = new Function2() { // from class: o.vlq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51375vlo.AEQbTJ(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.AEQbTJ = function2;
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.iHkeWl, this);
        this.gEmmrt = (C47988uAv) viewInflate.findViewById(C48033uCm.Application.ICustomTabsCallback);
        this.OLrzqt = (C53539wnR) viewInflate.findViewById(C48033uCm.Application.DaRZkR);
        this.valueOf = (vKO) viewInflate.findViewById(C48033uCm.Application.putString);
        this.AYXKKw = (vKO) viewInflate.findViewById(C48033uCm.Application.onScrollChanged);
        this.copydefault = (C50191vFg) viewInflate.findViewById(C48033uCm.Application.postOrRun);
        this.KWHzl = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.UJpkuA);
        this.AhwBna = (uBL) viewInflate.findViewById(C48033uCm.Application.WindowDecorActionBarActionModeImpl);
        C47988uAv c47988uAv = this.gEmmrt;
        if (c47988uAv != null) {
            c47988uAv.setOnTextChangeCallback(function2);
        }
        C47988uAv c47988uAv2 = this.gEmmrt;
        if (c47988uAv2 != null) {
            c47988uAv2.setPercentSeekBarListener(new Function1() { // from class: o.vlm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51375vlo.EZpvd(this.KWHzl, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        setBalance("--");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51375vlo(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        Function2<C47988uAv, java.lang.String, Unit> function2 = new Function2() { // from class: o.vlq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51375vlo.AEQbTJ(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.AEQbTJ = function2;
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.iHkeWl, this);
        this.gEmmrt = (C47988uAv) viewInflate.findViewById(C48033uCm.Application.ICustomTabsCallback);
        this.OLrzqt = (C53539wnR) viewInflate.findViewById(C48033uCm.Application.DaRZkR);
        this.valueOf = (vKO) viewInflate.findViewById(C48033uCm.Application.putString);
        this.AYXKKw = (vKO) viewInflate.findViewById(C48033uCm.Application.onScrollChanged);
        this.copydefault = (C50191vFg) viewInflate.findViewById(C48033uCm.Application.postOrRun);
        this.KWHzl = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.UJpkuA);
        this.AhwBna = (uBL) viewInflate.findViewById(C48033uCm.Application.WindowDecorActionBarActionModeImpl);
        C47988uAv c47988uAv = this.gEmmrt;
        if (c47988uAv != null) {
            c47988uAv.setOnTextChangeCallback(function2);
        }
        C47988uAv c47988uAv2 = this.gEmmrt;
        if (c47988uAv2 != null) {
            c47988uAv2.setPercentSeekBarListener(new Function1() { // from class: o.vlm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51375vlo.EZpvd(this.KWHzl, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        setBalance("--");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51375vlo(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        Function2<C47988uAv, java.lang.String, Unit> function2 = new Function2() { // from class: o.vlq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51375vlo.AEQbTJ(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.AEQbTJ = function2;
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.iHkeWl, this);
        this.gEmmrt = (C47988uAv) viewInflate.findViewById(C48033uCm.Application.ICustomTabsCallback);
        this.OLrzqt = (C53539wnR) viewInflate.findViewById(C48033uCm.Application.DaRZkR);
        this.valueOf = (vKO) viewInflate.findViewById(C48033uCm.Application.putString);
        this.AYXKKw = (vKO) viewInflate.findViewById(C48033uCm.Application.onScrollChanged);
        this.copydefault = (C50191vFg) viewInflate.findViewById(C48033uCm.Application.postOrRun);
        this.KWHzl = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.UJpkuA);
        this.AhwBna = (uBL) viewInflate.findViewById(C48033uCm.Application.WindowDecorActionBarActionModeImpl);
        C47988uAv c47988uAv = this.gEmmrt;
        if (c47988uAv != null) {
            c47988uAv.setOnTextChangeCallback(function2);
        }
        C47988uAv c47988uAv2 = this.gEmmrt;
        if (c47988uAv2 != null) {
            c47988uAv2.setPercentSeekBarListener(new Function1() { // from class: o.vlm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51375vlo.EZpvd(this.KWHzl, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        setBalance("--");
    }

    public static final Unit AEQbTJ(C51375vlo c51375vlo, C47988uAv c47988uAv, java.lang.String str) {
        java.lang.String strAkhnZx;
        C47988uAv c47988uAv2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, c51375vlo.gEmmrt)) {
            C47988uAv c47988uAv3 = c51375vlo.gEmmrt;
            if (c47988uAv3 != null && c47988uAv3.zLjUOn() && (c47988uAv2 = c51375vlo.gEmmrt) != null) {
                C47988uAv.clearSeekBarData$default(c47988uAv2, false, 1, null);
            }
            Function1<? super java.lang.String, Unit> function1 = c51375vlo.EZpvd;
            if (function1 != null) {
                C47988uAv c47988uAv4 = c51375vlo.gEmmrt;
                if (c47988uAv4 != null && (strAkhnZx = c47988uAv4.AkhnZx()) != null) {
                    str2 = strAkhnZx;
                }
                function1.invoke(str2);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C51375vlo c51375vlo, float f) {
        AbstractC51292vkK.refreshValidView$default(c51375vlo, true, null, 2, null);
        Function1<? super java.lang.String, Unit> function1 = c51375vlo.djBIcL;
        if (function1 != null) {
            function1.invoke(C33129mqd.gEmmrt(java.lang.Float.valueOf(f)));
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC51292vkK
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C53539wnR c53539wnR = this.OLrzqt;
        if (c53539wnR != null) {
            c53539wnR.setTransferCoin(str3);
        }
        C47988uAv c47988uAv = this.gEmmrt;
        if (c47988uAv != null) {
            C47988uAv.setInputLabel$default(c47988uAv, str, null, 2, null);
        }
        C47988uAv c47988uAv2 = this.gEmmrt;
        if (c47988uAv2 != null) {
            c47988uAv2.setInputUnit(str2);
        }
        C47988uAv c47988uAv3 = this.gEmmrt;
        if (c47988uAv3 != null) {
            c47988uAv3.setMaxDecimal(i);
        }
    }

    @Override // o.InterfaceC53558wnk
    public void AEQbTJ(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AhwBna.setOnSelectedCallback(function1);
        uBL ubl = this.AhwBna;
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(getContext());
        AppCompatActivity appCompatActivity = activityOLrzqt instanceof AppCompatActivity ? (AppCompatActivity) activityOLrzqt : null;
        ubl.setFm(appCompatActivity != null ? appCompatActivity.getSupportFragmentManager() : null);
    }

    @Override // o.InterfaceC53558wnk
    public java.lang.String EZpvd(ViewModelStoreOwner viewModelStoreOwner, BizInstrument bizInstrument, @NotNull TradeType tradeType) {
        java.lang.String displayQuoteSymbol;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(tradeType, "");
        this.AhwBna.copydefault(viewModelStoreOwner, bizInstrument, tradeType, true);
        this.AhwBna.setVisibility((bizInstrument == null || !bizInstrument.isDisplayTradeReceive()) ? 8 : 0);
        uBL ubl = this.AhwBna;
        int i = C55688xof.Application.getLegacyAudioStream;
        if (bizInstrument != null && (displayQuoteSymbol = bizInstrument.getDisplayQuoteSymbol()) != null) {
            str = displayQuoteSymbol;
        }
        ubl.setReminderText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("investCcy", str))));
        return AhwBna();
    }

    @Override // o.InterfaceC53558wnk
    public java.lang.String AhwBna() {
        return this.AhwBna.OLrzqt();
    }

    @Override // o.AbstractC51292vkK
    public void setMinInvest(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C47988uAv c47988uAv = this.gEmmrt;
        if (c47988uAv != null) {
            c47988uAv.setInputHint(str);
        }
    }

    @Override // o.AbstractC51292vkK
    public void setBalance(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C53539wnR c53539wnR = this.OLrzqt;
        if (c53539wnR != null) {
            c53539wnR.setFooterAvaValue(str);
        }
    }

    @Override // o.AbstractC51292vkK
    public void setQuoteContent(@NotNull java.lang.String str) {
        java.lang.String strAkhnZx;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        C47988uAv c47988uAv = this.gEmmrt;
        if (c47988uAv == null || !c47988uAv.zLjUOn()) {
            C47988uAv c47988uAv2 = this.gEmmrt;
            if (c47988uAv2 != null) {
                C47988uAv.setInputContent$default(c47988uAv2, "", false, false, 6, null);
                return;
            }
            return;
        }
        C47988uAv c47988uAv3 = this.gEmmrt;
        if (c47988uAv3 != null) {
            c47988uAv3.setOnTextChangeCallback(null);
        }
        C47988uAv c47988uAv4 = this.gEmmrt;
        if (c47988uAv4 != null) {
            C47988uAv.setInputContent$default(c47988uAv4, str, false, false, 6, null);
        }
        C47988uAv c47988uAv5 = this.gEmmrt;
        if (c47988uAv5 != null) {
            c47988uAv5.setOnTextChangeCallback(this.AEQbTJ);
        }
        Function1<? super java.lang.String, Unit> function1 = this.EZpvd;
        if (function1 != null) {
            C47988uAv c47988uAv6 = this.gEmmrt;
            if (c47988uAv6 != null && (strAkhnZx = c47988uAv6.AkhnZx()) != null) {
                str2 = strAkhnZx;
            }
            function1.invoke(str2);
        }
    }

    @Override // o.AbstractC51292vkK
    public void EZpvd(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            C47988uAv c47988uAv = this.gEmmrt;
            if (c47988uAv != null) {
                c47988uAv.copydefault();
                return;
            }
            return;
        }
        C47988uAv c47988uAv2 = this.gEmmrt;
        if (c47988uAv2 != null) {
            c47988uAv2.setInputErrorMsg(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    @Override // o.AbstractC51292vkK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(java.lang.String str, java.lang.String str2) {
        int i;
        android.widget.TextView textView = this.KWHzl;
        if (textView != null) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "recurring") || str2 == null) {
                i = 8;
            } else {
                C47988uAv c47988uAv = this.gEmmrt;
                if (C33129mqd.AEQbTJ(c47988uAv != null ? c47988uAv.AkhnZx() : null, str2)) {
                    i = 0;
                }
            }
            textView.setVisibility(i);
        }
    }

    @Override // o.AbstractC51292vkK
    public CopyBotReqParam EZpvd() {
        java.lang.String strAkhnZx;
        C47988uAv c47988uAv = this.gEmmrt;
        if (c47988uAv == null || (strAkhnZx = c47988uAv.AkhnZx()) == null) {
            strAkhnZx = "";
        }
        return new CopyBotReqParam(null, strAkhnZx, null, false, null, null, null, null, false, null, PointerIconCompat.TYPE_GRABBING, null);
    }

    /* JADX INFO: renamed from: o.vlo$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ C50191vFg AhwBna;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ BotLeverConfig KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;
        public final /* synthetic */ long djBIcL;
        public final /* synthetic */ android.view.View valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C50191vFg c50191vFg, java.lang.String str, java.lang.String str2, BotLeverConfig botLeverConfig, java.lang.String str3, java.lang.String str4) {
            this.valueOf = view;
            this.djBIcL = j;
            this.AhwBna = c50191vFg;
            this.copydefault = str;
            this.EZpvd = str2;
            this.KWHzl = botLeverConfig;
            this.OLrzqt = str3;
            this.AEQbTJ = str4;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            androidx.fragment.app.FragmentManager supportFragmentManager;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.valueOf) > this.djBIcL || (this.valueOf instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.valueOf, jCurrentTimeMillis);
                C50191vFg c50191vFg = this.AhwBna;
                java.lang.String str = this.copydefault;
                java.lang.String str2 = this.EZpvd;
                java.lang.String leveragePercents = this.KWHzl.getLeveragePercents();
                java.lang.String minLever = this.KWHzl.getMinLever();
                java.lang.String maxLever = this.KWHzl.getMaxLever();
                java.lang.String str3 = this.OLrzqt;
                android.content.Context context = this.AhwBna.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
                if (appCompatActivityCopydefault == null || (supportFragmentManager = appCompatActivityCopydefault.getSupportFragmentManager()) == null) {
                    return;
                }
                c50191vFg.AEQbTJ(str, str2, leveragePercents, minLever, maxLever, str3, "cross", supportFragmentManager, this.AEQbTJ);
            }
        }
    }

    @Override // o.AbstractC51292vkK
    public void EZpvd(@NotNull final LiquidatePriceResponse liquidatePriceResponse) {
        Intrinsics.checkNotNullParameter(liquidatePriceResponse, "");
        vKO vko = this.valueOf;
        if (vko != null) {
            vko.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) liquidatePriceResponse.getLongLiqTitle()) ? 0 : 8);
        }
        vKO vko2 = this.valueOf;
        if (vko2 != null) {
            vko2.setTitle(liquidatePriceResponse.getLongLiqTitle());
        }
        vKO vko3 = this.valueOf;
        if (vko3 != null) {
            vko3.setValue(liquidatePriceResponse.getLongLiqPx());
        }
        vKO vko4 = this.valueOf;
        if (vko4 != null) {
            vko4.EZpvd(C33129mqd.OLrzqt((java.lang.CharSequence) liquidatePriceResponse.getLongLiqDoubt()), new View.OnClickListener() { // from class: o.vlv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51375vlo.AEQbTJ(this.EZpvd, liquidatePriceResponse, view);
                }
            });
        }
        vKO vko5 = this.AYXKKw;
        if (vko5 != null) {
            vko5.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) liquidatePriceResponse.getShortLiqTitle()) ? 0 : 8);
        }
        vKO vko6 = this.AYXKKw;
        if (vko6 != null) {
            vko6.setTitle(liquidatePriceResponse.getShortLiqTitle());
        }
        vKO vko7 = this.AYXKKw;
        if (vko7 != null) {
            vko7.setValue(liquidatePriceResponse.getShortLiqPx());
        }
        vKO vko8 = this.AYXKKw;
        if (vko8 != null) {
            vko8.EZpvd(C33129mqd.OLrzqt((java.lang.CharSequence) liquidatePriceResponse.getShortLiqDoubt()), new View.OnClickListener() { // from class: o.vlu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51375vlo.copydefault(this.copydefault, liquidatePriceResponse, view);
                }
            });
        }
    }

    public static final void AEQbTJ(C51375vlo c51375vlo, LiquidatePriceResponse liquidatePriceResponse, android.view.View view) {
        java.lang.String longLiqDoubt = liquidatePriceResponse.getLongLiqDoubt();
        if (longLiqDoubt == null) {
            longLiqDoubt = "";
        }
        c51375vlo.OLrzqt(longLiqDoubt);
    }

    public static final void copydefault(C51375vlo c51375vlo, LiquidatePriceResponse liquidatePriceResponse, android.view.View view) {
        java.lang.String shortLiqDoubt = liquidatePriceResponse.getShortLiqDoubt();
        if (shortLiqDoubt == null) {
            shortLiqDoubt = "";
        }
        c51375vlo.OLrzqt(shortLiqDoubt);
    }

    public final void OLrzqt(java.lang.String str) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.fjfviF), new View.OnClickListener() { // from class: o.vls
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51375vlo.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractC51292vkK
    public boolean AEQbTJ() {
        C47988uAv c47988uAv = this.gEmmrt;
        java.lang.String strAkhnZx = c47988uAv != null ? c47988uAv.AkhnZx() : null;
        if (strAkhnZx == null || strAkhnZx.length() == 0) {
            C47988uAv c47988uAv2 = this.gEmmrt;
            if (c47988uAv2 != null) {
                c47988uAv2.zsXlph();
            }
            return false;
        }
        C47988uAv c47988uAv3 = this.gEmmrt;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (c47988uAv3 != null ? c47988uAv3.fetchVPNInfo() : null))) {
            C47988uAv c47988uAv4 = this.gEmmrt;
            if (c47988uAv4 != null) {
                c47988uAv4.zsXlph();
            }
            return false;
        }
        android.widget.TextView textView = this.KWHzl;
        if (textView == null || textView.getVisibility() != 0) {
            return true;
        }
        C56002xub.KWHzl.OLrzqt();
        return false;
    }

    @Override // o.AbstractC51292vkK
    public void copydefault(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull BotLeverConfig botLeverConfig, @NotNull java.lang.String str4, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(botLeverConfig, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C50191vFg c50191vFg = this.copydefault;
        if (c50191vFg != null) {
            c50191vFg.setVisibility(0);
            c50191vFg.setOnLeverChangeCallback(function1);
            c50191vFg.OLrzqt(botLeverConfig.getCurrentLever());
            c50191vFg.setOnClickListener(new Application(c50191vFg, 1000L, c50191vFg, str2, str3, botLeverConfig, str4, str));
        }
    }
}
