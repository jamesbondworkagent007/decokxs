package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.video.AudioStats;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import com.okinc.unify_trade.biz.BotLeverConfig;
import com.okinc.unify_trade.biz.LiquidatePriceResponse;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vlg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51367vlg extends AbstractC51292vkK {
    public wYK AEQbTJ;
    public C53539wnR AYXKKw;
    public final Function2<C47988uAv, java.lang.String, Unit> AhwBna;
    public vKO AkhnZx;
    public vKO AuCTel;
    public C53539wnR DbNXlk;
    public Function2<? super android.widget.CompoundButton, ? super java.lang.Boolean, Unit> EZpvd;
    public Function1<? super java.lang.String, Unit> KWHzl;
    public android.widget.TextView OLrzqt;
    public Function1<? super java.lang.String, Unit> copydefault;
    public C47988uAv djBIcL;
    public android.widget.TextView ejfBZ;
    public Function1<? super java.lang.String, Unit> fARcdN;
    public vKO fIwbmz;
    public android.widget.TextView fJNWhG;
    public android.widget.LinearLayout fetchVPNInfo;
    public final Function2<C47988uAv, java.lang.String, Unit> gEmmrt;
    public android.widget.TextView getNewProxyInstance;
    public C54154wyx hDKMBd;
    public C47988uAv isConnected;
    public C55320xhi valueOf;
    public C50191vFg values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51292vkK
    public void setAmtChangeListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51292vkK
    public void setExtraAmtChangeListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51292vkK
    public void setOnCheckedChangeListener(Function2<? super android.widget.CompoundButton, ? super java.lang.Boolean, Unit> function2) {
        this.EZpvd = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC51292vkK
    public void setQuotePercentListener(@NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.fARcdN = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51367vlg(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Function2<C47988uAv, java.lang.String, Unit> function2 = new Function2() { // from class: o.vlf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51367vlg.EZpvd(this.KWHzl, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.AhwBna = function2;
        Function2<C47988uAv, java.lang.String, Unit> function22 = new Function2() { // from class: o.vld
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51367vlg.AEQbTJ(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.gEmmrt = function22;
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.DTeKQX, this);
        this.isConnected = (C47988uAv) viewInflate.findViewById(C48033uCm.Application.ICustomTabsCallback);
        this.DbNXlk = (C53539wnR) viewInflate.findViewById(C48033uCm.Application.DaRZkR);
        this.AkhnZx = (vKO) viewInflate.findViewById(C48033uCm.Application.putString);
        this.AuCTel = (vKO) viewInflate.findViewById(C48033uCm.Application.onScrollChanged);
        this.values = (C50191vFg) viewInflate.findViewById(C48033uCm.Application.postOrRun);
        this.OLrzqt = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.UJpkuA);
        C47988uAv c47988uAv = this.isConnected;
        if (c47988uAv != null) {
            c47988uAv.setOnTextChangeCallback(function2);
        }
        C47988uAv c47988uAv2 = this.isConnected;
        if (c47988uAv2 != null) {
            c47988uAv2.setPercentSeekBarListener(new Function1() { // from class: o.vll
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51367vlg.copydefault(this.OLrzqt, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        this.AEQbTJ = (wYK) viewInflate.findViewById(C48033uCm.Application.fbC);
        this.AYXKKw = (C53539wnR) viewInflate.findViewById(C48033uCm.Application.dXhJGx);
        this.ejfBZ = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.setOnDismissListener);
        this.fJNWhG = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.attachBaseContext2);
        this.fetchVPNInfo = (android.widget.LinearLayout) viewInflate.findViewById(C48033uCm.Application.setSubscription);
        C47988uAv c47988uAv3 = (C47988uAv) viewInflate.findViewById(C48033uCm.Application.svUkWZ);
        this.djBIcL = c47988uAv3;
        if (c47988uAv3 != null) {
            c47988uAv3.setOnTextChangeCallback(function22);
        }
        this.valueOf = (C55320xhi) viewInflate.findViewById(C48033uCm.Application.notifyNotificationWithChannel);
        vKO vko = (vKO) viewInflate.findViewById(C48033uCm.Application.dispatchMenuVisibilityChanged);
        this.fIwbmz = vko;
        if (vko != null) {
            vko.setTextTvGravity(8388613);
        }
        vKO vko2 = this.fIwbmz;
        if (vko2 != null) {
            vko2.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DQYQgr));
        }
        vKO vko3 = this.fIwbmz;
        if (vko3 != null) {
            vko3.setValue("--");
        }
        this.getNewProxyInstance = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.NavItemSelectedListener);
        this.hDKMBd = (C54154wyx) viewInflate.findViewById(C48033uCm.Application.getMinimumWidth);
        setBalance("--");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51367vlg(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        Function2<C47988uAv, java.lang.String, Unit> function2 = new Function2() { // from class: o.vlf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51367vlg.EZpvd(this.KWHzl, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.AhwBna = function2;
        Function2<C47988uAv, java.lang.String, Unit> function22 = new Function2() { // from class: o.vld
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51367vlg.AEQbTJ(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.gEmmrt = function22;
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.DTeKQX, this);
        this.isConnected = (C47988uAv) viewInflate.findViewById(C48033uCm.Application.ICustomTabsCallback);
        this.DbNXlk = (C53539wnR) viewInflate.findViewById(C48033uCm.Application.DaRZkR);
        this.AkhnZx = (vKO) viewInflate.findViewById(C48033uCm.Application.putString);
        this.AuCTel = (vKO) viewInflate.findViewById(C48033uCm.Application.onScrollChanged);
        this.values = (C50191vFg) viewInflate.findViewById(C48033uCm.Application.postOrRun);
        this.OLrzqt = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.UJpkuA);
        C47988uAv c47988uAv = this.isConnected;
        if (c47988uAv != null) {
            c47988uAv.setOnTextChangeCallback(function2);
        }
        C47988uAv c47988uAv2 = this.isConnected;
        if (c47988uAv2 != null) {
            c47988uAv2.setPercentSeekBarListener(new Function1() { // from class: o.vll
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51367vlg.copydefault(this.OLrzqt, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        this.AEQbTJ = (wYK) viewInflate.findViewById(C48033uCm.Application.fbC);
        this.AYXKKw = (C53539wnR) viewInflate.findViewById(C48033uCm.Application.dXhJGx);
        this.ejfBZ = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.setOnDismissListener);
        this.fJNWhG = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.attachBaseContext2);
        this.fetchVPNInfo = (android.widget.LinearLayout) viewInflate.findViewById(C48033uCm.Application.setSubscription);
        C47988uAv c47988uAv3 = (C47988uAv) viewInflate.findViewById(C48033uCm.Application.svUkWZ);
        this.djBIcL = c47988uAv3;
        if (c47988uAv3 != null) {
            c47988uAv3.setOnTextChangeCallback(function22);
        }
        this.valueOf = (C55320xhi) viewInflate.findViewById(C48033uCm.Application.notifyNotificationWithChannel);
        vKO vko = (vKO) viewInflate.findViewById(C48033uCm.Application.dispatchMenuVisibilityChanged);
        this.fIwbmz = vko;
        if (vko != null) {
            vko.setTextTvGravity(8388613);
        }
        vKO vko2 = this.fIwbmz;
        if (vko2 != null) {
            vko2.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DQYQgr));
        }
        vKO vko3 = this.fIwbmz;
        if (vko3 != null) {
            vko3.setValue("--");
        }
        this.getNewProxyInstance = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.NavItemSelectedListener);
        this.hDKMBd = (C54154wyx) viewInflate.findViewById(C48033uCm.Application.getMinimumWidth);
        setBalance("--");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51367vlg(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        Function2<C47988uAv, java.lang.String, Unit> function2 = new Function2() { // from class: o.vlf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51367vlg.EZpvd(this.KWHzl, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.AhwBna = function2;
        Function2<C47988uAv, java.lang.String, Unit> function22 = new Function2() { // from class: o.vld
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51367vlg.AEQbTJ(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.gEmmrt = function22;
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.DTeKQX, this);
        this.isConnected = (C47988uAv) viewInflate.findViewById(C48033uCm.Application.ICustomTabsCallback);
        this.DbNXlk = (C53539wnR) viewInflate.findViewById(C48033uCm.Application.DaRZkR);
        this.AkhnZx = (vKO) viewInflate.findViewById(C48033uCm.Application.putString);
        this.AuCTel = (vKO) viewInflate.findViewById(C48033uCm.Application.onScrollChanged);
        this.values = (C50191vFg) viewInflate.findViewById(C48033uCm.Application.postOrRun);
        this.OLrzqt = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.UJpkuA);
        C47988uAv c47988uAv = this.isConnected;
        if (c47988uAv != null) {
            c47988uAv.setOnTextChangeCallback(function2);
        }
        C47988uAv c47988uAv2 = this.isConnected;
        if (c47988uAv2 != null) {
            c47988uAv2.setPercentSeekBarListener(new Function1() { // from class: o.vll
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51367vlg.copydefault(this.OLrzqt, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        this.AEQbTJ = (wYK) viewInflate.findViewById(C48033uCm.Application.fbC);
        this.AYXKKw = (C53539wnR) viewInflate.findViewById(C48033uCm.Application.dXhJGx);
        this.ejfBZ = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.setOnDismissListener);
        this.fJNWhG = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.attachBaseContext2);
        this.fetchVPNInfo = (android.widget.LinearLayout) viewInflate.findViewById(C48033uCm.Application.setSubscription);
        C47988uAv c47988uAv3 = (C47988uAv) viewInflate.findViewById(C48033uCm.Application.svUkWZ);
        this.djBIcL = c47988uAv3;
        if (c47988uAv3 != null) {
            c47988uAv3.setOnTextChangeCallback(function22);
        }
        this.valueOf = (C55320xhi) viewInflate.findViewById(C48033uCm.Application.notifyNotificationWithChannel);
        vKO vko = (vKO) viewInflate.findViewById(C48033uCm.Application.dispatchMenuVisibilityChanged);
        this.fIwbmz = vko;
        if (vko != null) {
            vko.setTextTvGravity(8388613);
        }
        vKO vko2 = this.fIwbmz;
        if (vko2 != null) {
            vko2.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.DQYQgr));
        }
        vKO vko3 = this.fIwbmz;
        if (vko3 != null) {
            vko3.setValue("--");
        }
        this.getNewProxyInstance = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.NavItemSelectedListener);
        this.hDKMBd = (C54154wyx) viewInflate.findViewById(C48033uCm.Application.getMinimumWidth);
        setBalance("--");
    }

    public static final Unit EZpvd(C51367vlg c51367vlg, C47988uAv c47988uAv, java.lang.String str) {
        java.lang.String strAkhnZx;
        C47988uAv c47988uAv2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, c51367vlg.isConnected)) {
            C47988uAv c47988uAv3 = c51367vlg.isConnected;
            if (c47988uAv3 != null && c47988uAv3.zLjUOn() && (c47988uAv2 = c51367vlg.isConnected) != null) {
                C47988uAv.clearSeekBarData$default(c47988uAv2, false, 1, null);
            }
            Function1<? super java.lang.String, Unit> function1 = c51367vlg.copydefault;
            if (function1 != null) {
                C47988uAv c47988uAv4 = c51367vlg.isConnected;
                if (c47988uAv4 != null && (strAkhnZx = c47988uAv4.AkhnZx()) != null) {
                    str2 = strAkhnZx;
                }
                function1.invoke(str2);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C51367vlg c51367vlg, C47988uAv c47988uAv, java.lang.String str) {
        Function1<? super java.lang.String, Unit> function1;
        java.lang.String strAkhnZx;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, c51367vlg.djBIcL) && (function1 = c51367vlg.KWHzl) != null) {
            C47988uAv c47988uAv2 = c51367vlg.djBIcL;
            if (c47988uAv2 != null && (strAkhnZx = c47988uAv2.AkhnZx()) != null) {
                str2 = strAkhnZx;
            }
            function1.invoke(str2);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51367vlg c51367vlg, float f) {
        AbstractC51292vkK.refreshValidView$default(c51367vlg, true, null, 2, null);
        Function1<? super java.lang.String, Unit> function1 = c51367vlg.fARcdN;
        if (function1 != null) {
            function1.invoke(C33129mqd.gEmmrt(java.lang.Float.valueOf(f)));
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC51292vkK
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        wYK wyk = this.AEQbTJ;
        if (wyk != null) {
            wyk.setChecked(true);
        }
        C53539wnR c53539wnR = this.AYXKKw;
        if (c53539wnR != null) {
            c53539wnR.setVisibility(0);
        }
        C53539wnR c53539wnR2 = this.AYXKKw;
        if (c53539wnR2 != null) {
            c53539wnR2.setFooterAvaValueGravity(8388613);
        }
        C53539wnR c53539wnR3 = this.AYXKKw;
        if (c53539wnR3 != null) {
            c53539wnR3.setFooterAvaValue("--");
        }
        android.widget.TextView textView = this.ejfBZ;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = this.fJNWhG;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout = this.fetchVPNInfo;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        C47988uAv c47988uAv = this.djBIcL;
        if (c47988uAv != null) {
            c47988uAv.setInputUnit(str);
        }
        C47988uAv c47988uAv2 = this.djBIcL;
        if (c47988uAv2 != null) {
            C47988uAv.setInputLabel$default(c47988uAv2, "≥ " + xMR.copydefault.copydefault("0"), null, 2, null);
        }
        final C55320xhi c55320xhi = this.valueOf;
        if (c55320xhi != null) {
            c55320xhi.gEmmrt();
            C8003auW.copydefault(c55320xhi).throttleFirst(1L, java.util.concurrent.TimeUnit.SECONDS).subscribe(new InterfaceC58227yxM() { // from class: o.vln
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    C51367vlg.AEQbTJ(c55320xhi, obj);
                }
            });
        }
        wYK wyk2 = this.AEQbTJ;
        if (wyk2 != null) {
            wyk2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vlp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    C51367vlg.KWHzl(this.OLrzqt, compoundButton, z);
                }
            });
        }
    }

    public static final void AEQbTJ(C55320xhi c55320xhi, java.lang.Object obj) {
        android.content.Context context = c55320xhi.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C48033uCm.Fragment.reset);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.DQzvGNdrmXxudrmXxu));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.QWSkGZ), new View.OnClickListener() { // from class: o.vli
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51367vlg.AEQbTJ(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(C51367vlg c51367vlg, android.widget.CompoundButton compoundButton, boolean z) {
        if (z) {
            C53539wnR c53539wnR = c51367vlg.AYXKKw;
            if (c53539wnR != null) {
                c53539wnR.setVisibility(0);
            }
            android.widget.LinearLayout linearLayout = c51367vlg.fetchVPNInfo;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            android.widget.TextView textView = c51367vlg.ejfBZ;
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            C53539wnR c53539wnR2 = c51367vlg.AYXKKw;
            if (c53539wnR2 != null) {
                c53539wnR2.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout2 = c51367vlg.fetchVPNInfo;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            android.widget.TextView textView2 = c51367vlg.ejfBZ;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
        }
        Function2<? super android.widget.CompoundButton, ? super java.lang.Boolean, Unit> function2 = c51367vlg.EZpvd;
        if (function2 != null) {
            Intrinsics.copydefault(compoundButton);
            function2.invoke(compoundButton, java.lang.Boolean.valueOf(z));
        }
    }

    /* JADX INFO: renamed from: o.vlg$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ C50191vFg AYXKKw;
        public final /* synthetic */ long AhwBna;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ BotLeverConfig OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;
        public final /* synthetic */ android.view.View gEmmrt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50191vFg c50191vFg, java.lang.String str, java.lang.String str2, BotLeverConfig botLeverConfig, java.lang.String str3, java.lang.String str4) {
            this.gEmmrt = view;
            this.AhwBna = j;
            this.AYXKKw = c50191vFg;
            this.KWHzl = str;
            this.AEQbTJ = str2;
            this.OLrzqt = botLeverConfig;
            this.copydefault = str3;
            this.EZpvd = str4;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            androidx.fragment.app.FragmentManager supportFragmentManager;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.gEmmrt) > this.AhwBna || (this.gEmmrt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.gEmmrt, jCurrentTimeMillis);
                C50191vFg c50191vFg = this.AYXKKw;
                java.lang.String str = this.KWHzl;
                java.lang.String str2 = this.AEQbTJ;
                java.lang.String leveragePercents = this.OLrzqt.getLeveragePercents();
                java.lang.String minLever = this.OLrzqt.getMinLever();
                java.lang.String maxLever = this.OLrzqt.getMaxLever();
                java.lang.String str3 = this.copydefault;
                android.content.Context context = this.AYXKKw.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                AppCompatActivity appCompatActivityCopydefault = C49955uyM.copydefault(context);
                if (appCompatActivityCopydefault == null || (supportFragmentManager = appCompatActivityCopydefault.getSupportFragmentManager()) == null) {
                    return;
                }
                c50191vFg.AEQbTJ(str, str2, leveragePercents, minLever, maxLever, str3, "cross", supportFragmentManager, this.EZpvd);
            }
        }
    }

    @Override // o.AbstractC51292vkK
    public void OLrzqt(StrategyConfigInfo strategyConfigInfo) {
        C54154wyx c54154wyx = this.hDKMBd;
        if (c54154wyx != null) {
            C54149wys.AEQbTJ.EZpvd(c54154wyx, strategyConfigInfo);
        }
    }

    @Override // o.AbstractC51292vkK
    public void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C53539wnR c53539wnR = this.DbNXlk;
        if (c53539wnR != null) {
            c53539wnR.setTransferCoin(str3);
        }
        C47988uAv c47988uAv = this.isConnected;
        if (c47988uAv != null) {
            C47988uAv.setInputLabel$default(c47988uAv, str, null, 2, null);
        }
        C47988uAv c47988uAv2 = this.isConnected;
        if (c47988uAv2 != null) {
            c47988uAv2.setInputUnit(str2);
        }
        C47988uAv c47988uAv3 = this.isConnected;
        if (c47988uAv3 != null) {
            c47988uAv3.setMaxDecimal(i);
        }
    }

    @Override // o.AbstractC51292vkK
    public void setMinInvest(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C47988uAv c47988uAv = this.isConnected;
        if (c47988uAv != null) {
            c47988uAv.setInputHint(str);
        }
    }

    @Override // o.AbstractC51292vkK
    public void setBalance(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C53539wnR c53539wnR = this.DbNXlk;
        if (c53539wnR != null) {
            c53539wnR.setFooterAvaValue(str);
        }
    }

    @Override // o.AbstractC51292vkK
    public void setActualPlusMarginAmtAvaValue(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C53539wnR c53539wnR = this.AYXKKw;
        if (c53539wnR != null) {
            c53539wnR.setFooterAvaValue(str);
        }
    }

    @Override // o.AbstractC51292vkK
    public void setTotalInvest(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        vKO vko = this.fIwbmz;
        if (vko != null) {
            vko.setValue(str);
        }
    }

    @Override // o.AbstractC51292vkK
    public void setQuoteContent(@NotNull java.lang.String str) {
        java.lang.String strAkhnZx;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        C47988uAv c47988uAv = this.isConnected;
        if (c47988uAv == null || !c47988uAv.zLjUOn()) {
            C47988uAv c47988uAv2 = this.isConnected;
            if (c47988uAv2 != null) {
                C47988uAv.setInputContent$default(c47988uAv2, "", false, false, 6, null);
                return;
            }
            return;
        }
        C47988uAv c47988uAv3 = this.isConnected;
        if (c47988uAv3 != null) {
            c47988uAv3.setOnTextChangeCallback(null);
        }
        C47988uAv c47988uAv4 = this.isConnected;
        if (c47988uAv4 != null) {
            C47988uAv.setInputContent$default(c47988uAv4, str, false, false, 6, null);
        }
        C47988uAv c47988uAv5 = this.isConnected;
        if (c47988uAv5 != null) {
            c47988uAv5.setOnTextChangeCallback(this.AhwBna);
        }
        Function1<? super java.lang.String, Unit> function1 = this.copydefault;
        if (function1 != null) {
            C47988uAv c47988uAv6 = this.isConnected;
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
            C47988uAv c47988uAv = this.isConnected;
            if (c47988uAv != null) {
                c47988uAv.copydefault();
                return;
            }
            return;
        }
        C47988uAv c47988uAv2 = this.isConnected;
        if (c47988uAv2 != null) {
            c47988uAv2.setInputErrorMsg(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    @Override // o.AbstractC51292vkK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void OLrzqt(java.lang.String str, java.lang.String str2) {
        wYK wyk = this.AEQbTJ;
        if (wyk == null || !wyk.isChecked()) {
            C47988uAv c47988uAv = this.isConnected;
            double dAEQbTJ = C33129mqd.AEQbTJ(c47988uAv != null ? c47988uAv.AkhnZx() : null);
            C47988uAv c47988uAv2 = this.djBIcL;
            double dAEQbTJ2 = C33129mqd.AEQbTJ(c47988uAv2 != null ? c47988uAv2.AkhnZx() : null);
            double dAEQbTJ3 = str2 != null ? C33129mqd.AEQbTJ(str2) : AudioStats.AUDIO_AMPLITUDE_NONE;
            android.widget.TextView textView = this.OLrzqt;
            if (textView != null) {
                textView.setVisibility((Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "recurring") || dAEQbTJ2 + dAEQbTJ <= dAEQbTJ3) ? 8 : 0);
                return;
            }
            return;
        }
        android.widget.TextView textView2 = this.OLrzqt;
        if (textView2 != null) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "recurring") || str2 == null) {
                i = 8;
            } else {
                C47988uAv c47988uAv3 = this.isConnected;
                if (!C33129mqd.AEQbTJ(c47988uAv3 != null ? c47988uAv3.AkhnZx() : null, str2)) {
                }
            }
            textView2.setVisibility(i);
        }
    }

    @Override // o.AbstractC51292vkK
    public void KWHzl(java.lang.String str, java.lang.String str2) {
        wYK wyk = this.AEQbTJ;
        if (wyk == null || !wyk.isChecked()) {
            C47988uAv c47988uAv = this.isConnected;
            double dAEQbTJ = C33129mqd.AEQbTJ(c47988uAv != null ? c47988uAv.AkhnZx() : null);
            C47988uAv c47988uAv2 = this.djBIcL;
            double dAEQbTJ2 = C33129mqd.AEQbTJ(c47988uAv2 != null ? c47988uAv2.AkhnZx() : null);
            double dAEQbTJ3 = str2 != null ? C33129mqd.AEQbTJ(str2) : AudioStats.AUDIO_AMPLITUDE_NONE;
            C47988uAv c47988uAv3 = this.djBIcL;
            boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) (c47988uAv3 != null ? c47988uAv3.AkhnZx() : null));
            android.widget.TextView textView = this.ejfBZ;
            if (textView != null) {
                textView.setVisibility(((true ^ zOLrzqt) || dAEQbTJ2 < 0.3d * dAEQbTJ) ? 0 : 8);
            }
            android.widget.TextView textView2 = this.fJNWhG;
            if (textView2 != null) {
                textView2.setVisibility(dAEQbTJ2 + dAEQbTJ <= dAEQbTJ3 ? 8 : 0);
            }
        }
    }

    @Override // o.AbstractC51292vkK
    public CopyBotReqParam EZpvd() {
        java.lang.String strAkhnZx;
        C47988uAv c47988uAv = this.isConnected;
        if (c47988uAv == null || (strAkhnZx = c47988uAv.AkhnZx()) == null) {
            strAkhnZx = "";
        }
        return new CopyBotReqParam(null, strAkhnZx, null, false, null, java.lang.Boolean.valueOf(AYXKKw()), null, null, false, null, 989, null);
    }

    @Override // o.AbstractC51292vkK
    public void EZpvd(@NotNull final LiquidatePriceResponse liquidatePriceResponse) {
        Intrinsics.checkNotNullParameter(liquidatePriceResponse, "");
        vKO vko = this.AkhnZx;
        if (vko != null) {
            vko.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) liquidatePriceResponse.getLongLiqTitle()) ? 0 : 8);
        }
        vKO vko2 = this.AkhnZx;
        if (vko2 != null) {
            vko2.setTitle(liquidatePriceResponse.getLongLiqTitle());
        }
        vKO vko3 = this.AkhnZx;
        if (vko3 != null) {
            vko3.setValue(liquidatePriceResponse.getLongLiqPx());
        }
        vKO vko4 = this.AkhnZx;
        if (vko4 != null) {
            vko4.EZpvd(C33129mqd.OLrzqt((java.lang.CharSequence) liquidatePriceResponse.getLongLiqDoubt()), new View.OnClickListener() { // from class: o.vlk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51367vlg.KWHzl(this.EZpvd, liquidatePriceResponse, view);
                }
            });
        }
        vKO vko5 = this.AuCTel;
        if (vko5 != null) {
            vko5.setVisibility(C33129mqd.OLrzqt((java.lang.CharSequence) liquidatePriceResponse.getShortLiqTitle()) ? 0 : 8);
        }
        vKO vko6 = this.AuCTel;
        if (vko6 != null) {
            vko6.setTitle(liquidatePriceResponse.getShortLiqTitle());
        }
        vKO vko7 = this.AuCTel;
        if (vko7 != null) {
            vko7.setValue(liquidatePriceResponse.getShortLiqPx());
        }
        vKO vko8 = this.AuCTel;
        if (vko8 != null) {
            vko8.EZpvd(C33129mqd.OLrzqt((java.lang.CharSequence) liquidatePriceResponse.getShortLiqDoubt()), new View.OnClickListener() { // from class: o.vlh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C51367vlg.EZpvd(this.EZpvd, liquidatePriceResponse, view);
                }
            });
        }
        android.widget.TextView textView = this.getNewProxyInstance;
        if (textView != null) {
            textView.setVisibility(liquidatePriceResponse.getLiqPriceCheck() ^ true ? 0 : 8);
        }
    }

    public static final void KWHzl(C51367vlg c51367vlg, LiquidatePriceResponse liquidatePriceResponse, android.view.View view) {
        java.lang.String longLiqDoubt = liquidatePriceResponse.getLongLiqDoubt();
        if (longLiqDoubt == null) {
            longLiqDoubt = "";
        }
        c51367vlg.KWHzl(longLiqDoubt);
    }

    public static final void EZpvd(C51367vlg c51367vlg, LiquidatePriceResponse liquidatePriceResponse, android.view.View view) {
        java.lang.String shortLiqDoubt = liquidatePriceResponse.getShortLiqDoubt();
        if (shortLiqDoubt == null) {
            shortLiqDoubt = "";
        }
        c51367vlg.KWHzl(shortLiqDoubt);
    }

    private final void KWHzl(java.lang.String str) {
        android.content.Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.fjfviF), new View.OnClickListener() { // from class: o.vlj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51367vlg.OLrzqt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractC51292vkK
    public boolean AEQbTJ() {
        C47988uAv c47988uAv = this.isConnected;
        java.lang.String strAkhnZx = c47988uAv != null ? c47988uAv.AkhnZx() : null;
        if (strAkhnZx == null || strAkhnZx.length() == 0) {
            C47988uAv c47988uAv2 = this.isConnected;
            if (c47988uAv2 != null) {
                c47988uAv2.zsXlph();
            }
            return false;
        }
        C47988uAv c47988uAv3 = this.isConnected;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (c47988uAv3 != null ? c47988uAv3.fetchVPNInfo() : null))) {
            C47988uAv c47988uAv4 = this.isConnected;
            if (c47988uAv4 != null) {
                c47988uAv4.zsXlph();
            }
            return false;
        }
        android.widget.TextView textView = this.OLrzqt;
        if (textView == null || textView.getVisibility() != 0) {
            return true;
        }
        C56002xub.KWHzl.OLrzqt();
        return false;
    }

    @Override // o.AbstractC51292vkK
    public boolean AYXKKw() {
        wYK wyk = this.AEQbTJ;
        if (wyk != null) {
            return wyk.isChecked();
        }
        return true;
    }

    @Override // o.AbstractC51292vkK
    public java.lang.String OLrzqt() {
        java.lang.String strAkhnZx;
        C47988uAv c47988uAv = this.isConnected;
        return (c47988uAv == null || (strAkhnZx = c47988uAv.AkhnZx()) == null) ? "" : strAkhnZx;
    }

    @Override // o.AbstractC51292vkK
    public java.lang.String KWHzl() {
        java.lang.String strAkhnZx;
        C47988uAv c47988uAv = this.djBIcL;
        return (c47988uAv == null || (strAkhnZx = c47988uAv.AkhnZx()) == null) ? "" : strAkhnZx;
    }

    @Override // o.AbstractC51292vkK
    public void copydefault(java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull BotLeverConfig botLeverConfig, @NotNull java.lang.String str4, @NotNull Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(botLeverConfig, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(function1, "");
        C50191vFg c50191vFg = this.values;
        if (c50191vFg != null) {
            c50191vFg.setVisibility(0);
            c50191vFg.setOnLeverChangeCallback(function1);
            c50191vFg.OLrzqt(botLeverConfig.getCurrentLever());
            c50191vFg.setOnClickListener(new Activity(c50191vFg, 1000L, c50191vFg, str2, str3, botLeverConfig, str4, str));
        }
    }
}
