package o;

import androidx.core.view.PointerIconCompat;
import com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wMr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52472wMr extends AbstractC51292vkK {
    public C47988uAv AEQbTJ;
    public Function1<? super java.lang.String, Unit> AhwBna;
    public Function1<? super java.lang.String, Unit> EZpvd;
    public C53539wnR KWHzl;
    public final Function2<C47988uAv, java.lang.String, Unit> OLrzqt;
    public android.widget.TextView copydefault;

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
        this.AhwBna = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52472wMr(@NotNull android.content.Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        Function2<C47988uAv, java.lang.String, Unit> function2 = new Function2() { // from class: o.wMs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52472wMr.AEQbTJ(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.OLrzqt = function2;
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.aKErDB, this);
        this.AEQbTJ = (C47988uAv) viewInflate.findViewById(C48033uCm.Application.ICustomTabsCallback);
        this.KWHzl = (C53539wnR) viewInflate.findViewById(C48033uCm.Application.DaRZkR);
        this.copydefault = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.UJpkuA);
        C47988uAv c47988uAv = this.AEQbTJ;
        if (c47988uAv != null) {
            c47988uAv.setOnTextChangeCallback(function2);
        }
        C47988uAv c47988uAv2 = this.AEQbTJ;
        if (c47988uAv2 != null) {
            c47988uAv2.setPercentSeekBarListener(new Function1() { // from class: o.wMq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52472wMr.KWHzl(this.KWHzl, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        setBalance("--");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52472wMr(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        Function2<C47988uAv, java.lang.String, Unit> function2 = new Function2() { // from class: o.wMs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52472wMr.AEQbTJ(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.OLrzqt = function2;
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.aKErDB, this);
        this.AEQbTJ = (C47988uAv) viewInflate.findViewById(C48033uCm.Application.ICustomTabsCallback);
        this.KWHzl = (C53539wnR) viewInflate.findViewById(C48033uCm.Application.DaRZkR);
        this.copydefault = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.UJpkuA);
        C47988uAv c47988uAv = this.AEQbTJ;
        if (c47988uAv != null) {
            c47988uAv.setOnTextChangeCallback(function2);
        }
        C47988uAv c47988uAv2 = this.AEQbTJ;
        if (c47988uAv2 != null) {
            c47988uAv2.setPercentSeekBarListener(new Function1() { // from class: o.wMq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52472wMr.KWHzl(this.KWHzl, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        setBalance("--");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52472wMr(@NotNull android.content.Context context, @NotNull android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(attributeSet, "");
        Function2<C47988uAv, java.lang.String, Unit> function2 = new Function2() { // from class: o.wMs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52472wMr.AEQbTJ(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.OLrzqt = function2;
        android.view.View viewInflate = android.view.LayoutInflater.from(getContext()).inflate(C48033uCm.Activity.aKErDB, this);
        this.AEQbTJ = (C47988uAv) viewInflate.findViewById(C48033uCm.Application.ICustomTabsCallback);
        this.KWHzl = (C53539wnR) viewInflate.findViewById(C48033uCm.Application.DaRZkR);
        this.copydefault = (android.widget.TextView) viewInflate.findViewById(C48033uCm.Application.UJpkuA);
        C47988uAv c47988uAv = this.AEQbTJ;
        if (c47988uAv != null) {
            c47988uAv.setOnTextChangeCallback(function2);
        }
        C47988uAv c47988uAv2 = this.AEQbTJ;
        if (c47988uAv2 != null) {
            c47988uAv2.setPercentSeekBarListener(new Function1() { // from class: o.wMq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52472wMr.KWHzl(this.KWHzl, ((java.lang.Float) obj).floatValue());
                }
            });
        }
        setBalance("--");
    }

    public static final Unit AEQbTJ(C52472wMr c52472wMr, C47988uAv c47988uAv, java.lang.String str) {
        java.lang.String strAkhnZx;
        C47988uAv c47988uAv2;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, c52472wMr.AEQbTJ)) {
            C47988uAv c47988uAv3 = c52472wMr.AEQbTJ;
            if (c47988uAv3 != null && c47988uAv3.zLjUOn() && (c47988uAv2 = c52472wMr.AEQbTJ) != null) {
                C47988uAv.clearSeekBarData$default(c47988uAv2, false, 1, null);
            }
            Function1<? super java.lang.String, Unit> function1 = c52472wMr.EZpvd;
            if (function1 != null) {
                C47988uAv c47988uAv4 = c52472wMr.AEQbTJ;
                if (c47988uAv4 != null && (strAkhnZx = c47988uAv4.AkhnZx()) != null) {
                    str2 = strAkhnZx;
                }
                function1.invoke(str2);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52472wMr c52472wMr, float f) {
        AbstractC51292vkK.refreshValidView$default(c52472wMr, true, null, 2, null);
        Function1<? super java.lang.String, Unit> function1 = c52472wMr.AhwBna;
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
        C53539wnR c53539wnR = this.KWHzl;
        if (c53539wnR != null) {
            c53539wnR.setTransferCoin(str3);
        }
        C47988uAv c47988uAv = this.AEQbTJ;
        if (c47988uAv != null) {
            C47988uAv.setInputLabel$default(c47988uAv, str, null, 2, null);
        }
        C47988uAv c47988uAv2 = this.AEQbTJ;
        if (c47988uAv2 != null) {
            c47988uAv2.setInputUnit(str2);
        }
        C47988uAv c47988uAv3 = this.AEQbTJ;
        if (c47988uAv3 != null) {
            c47988uAv3.setMaxDecimal(i);
        }
    }

    @Override // o.AbstractC51292vkK
    public void setMinInvest(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C47988uAv c47988uAv = this.AEQbTJ;
        if (c47988uAv != null) {
            c47988uAv.setInputHint(str);
        }
    }

    @Override // o.AbstractC51292vkK
    public void setBalance(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C53539wnR c53539wnR = this.KWHzl;
        if (c53539wnR != null) {
            c53539wnR.setFooterAvaValue(str);
        }
    }

    @Override // o.AbstractC51292vkK
    public void setBalanceTitle(@NotNull java.lang.String str, boolean z, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        C53539wnR c53539wnR = this.KWHzl;
        if (c53539wnR != null) {
            c53539wnR.setFooterAvaTitle(str, z, function0);
        }
    }

    @Override // o.AbstractC51292vkK
    public void setQuoteContent(@NotNull java.lang.String str) {
        java.lang.String strAkhnZx;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        C47988uAv c47988uAv = this.AEQbTJ;
        if (c47988uAv == null || !c47988uAv.zLjUOn()) {
            C47988uAv c47988uAv2 = this.AEQbTJ;
            if (c47988uAv2 != null) {
                C47988uAv.setInputContent$default(c47988uAv2, "", false, false, 6, null);
                return;
            }
            return;
        }
        C47988uAv c47988uAv3 = this.AEQbTJ;
        if (c47988uAv3 != null) {
            c47988uAv3.setOnTextChangeCallback(null);
        }
        C47988uAv c47988uAv4 = this.AEQbTJ;
        if (c47988uAv4 != null) {
            C47988uAv.setInputContent$default(c47988uAv4, str, false, false, 6, null);
        }
        C47988uAv c47988uAv5 = this.AEQbTJ;
        if (c47988uAv5 != null) {
            c47988uAv5.setOnTextChangeCallback(this.OLrzqt);
        }
        Function1<? super java.lang.String, Unit> function1 = this.EZpvd;
        if (function1 != null) {
            C47988uAv c47988uAv6 = this.AEQbTJ;
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
            C47988uAv c47988uAv = this.AEQbTJ;
            if (c47988uAv != null) {
                c47988uAv.copydefault();
                return;
            }
            return;
        }
        C47988uAv c47988uAv2 = this.AEQbTJ;
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
        android.widget.TextView textView = this.copydefault;
        if (textView != null) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "recurring") || str2 == null) {
                i = 8;
            } else {
                C47988uAv c47988uAv = this.AEQbTJ;
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
        C47988uAv c47988uAv = this.AEQbTJ;
        if (c47988uAv == null || (strAkhnZx = c47988uAv.AkhnZx()) == null) {
            strAkhnZx = "";
        }
        return new CopyBotReqParam(null, strAkhnZx, null, false, null, null, null, null, false, null, PointerIconCompat.TYPE_GRABBING, null);
    }

    @Override // o.AbstractC51292vkK
    public boolean AEQbTJ() {
        C47988uAv c47988uAv = this.AEQbTJ;
        java.lang.String strAkhnZx = c47988uAv != null ? c47988uAv.AkhnZx() : null;
        if (strAkhnZx == null || strAkhnZx.length() == 0) {
            C47988uAv c47988uAv2 = this.AEQbTJ;
            if (c47988uAv2 != null) {
                c47988uAv2.zsXlph();
            }
            return false;
        }
        C47988uAv c47988uAv3 = this.AEQbTJ;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (c47988uAv3 != null ? c47988uAv3.fetchVPNInfo() : null))) {
            C47988uAv c47988uAv4 = this.AEQbTJ;
            if (c47988uAv4 != null) {
                c47988uAv4.zsXlph();
            }
            return false;
        }
        android.widget.TextView textView = this.copydefault;
        if (textView == null || textView.getVisibility() != 0) {
            return true;
        }
        C56002xub.KWHzl.OLrzqt();
        return false;
    }
}
