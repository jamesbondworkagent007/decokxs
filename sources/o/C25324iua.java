package o;

import androidx.core.content.ContextCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C25325iub;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iua, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25324iua extends android.widget.LinearLayout {
    public int AEQbTJ;
    public Activity EZpvd;
    public boolean KWHzl;
    public hHK copydefault;

    /* JADX INFO: renamed from: o.iua$Activity */
    public interface Activity {
        void KWHzl();

        void copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCallback$OKDex_dex_impl(Activity activity) {
        this.EZpvd = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25324iua(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = true;
        this.AEQbTJ = C31172lox.Companion.KWHzl();
        gEmmrt();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25324iua(@NotNull android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25324iua(@NotNull android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C25324iua(@NotNull android.content.Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "");
    }

    public final void gEmmrt() {
        if (getContext() == null) {
            return;
        }
        this.copydefault = hHK.copydefault(android.view.LayoutInflater.from(getContext()), this, true);
    }

    public final void KWHzl(int i) {
        C25325iub c25325iub;
        C25325iub c25325iub2;
        C25325iub c25325iub3;
        this.AEQbTJ = i;
        hHK hhk = this.copydefault;
        if (hhk != null && (c25325iub3 = hhk.AEQbTJ) != null) {
            c25325iub3.setVisibility(C31172lox.KWHzl(i, C31172lox.Companion.OLrzqt()) ^ true ? 0 : 8);
        }
        hHK hhk2 = this.copydefault;
        if (hhk2 != null && (c25325iub2 = hhk2.AEQbTJ) != null) {
            c25325iub2.setupView(new C25325iub.TaskDescription(C33070mpX.AYXKKw(C23274hvD.Fragment.DIIpTV), 0, 0, null, 0, false, null, false, 254, null));
        }
        hHK hhk3 = this.copydefault;
        if (hhk3 != null && (c25325iub = hhk3.EZpvd) != null) {
            c25325iub.setupView(new C25325iub.TaskDescription(C33070mpX.AYXKKw(C23274hvD.Fragment.DUUtXg), 0, 1, null, 0, false, null, false, 250, null));
        }
        setInvalidState();
    }

    public final void OLrzqt(long j) {
        C25332iui c25332iui;
        C25325iub c25325iub;
        C25325iub c25325iub2;
        hHK hhk = this.copydefault;
        if (hhk != null && (c25325iub2 = hhk.AEQbTJ) != null) {
            c25325iub2.copydefault(j);
        }
        hHK hhk2 = this.copydefault;
        if (hhk2 != null && (c25325iub = hhk2.EZpvd) != null) {
            c25325iub.copydefault(j);
        }
        hHK hhk3 = this.copydefault;
        if (hhk3 == null || (c25332iui = hhk3.OLrzqt) == null) {
            return;
        }
        c25332iui.copydefault(j);
    }

    public final void AhwBna() {
        C25332iui c25332iui;
        C25325iub c25325iub;
        C25325iub c25325iub2;
        hHK hhk = this.copydefault;
        if (hhk != null && (c25325iub2 = hhk.AEQbTJ) != null) {
            c25325iub2.gEmmrt();
        }
        hHK hhk2 = this.copydefault;
        if (hhk2 != null && (c25325iub = hhk2.EZpvd) != null) {
            c25325iub.gEmmrt();
        }
        hHK hhk3 = this.copydefault;
        if (hhk3 == null || (c25332iui = hhk3.OLrzqt) == null) {
            return;
        }
        c25332iui.gEmmrt();
    }

    public static /* synthetic */ void updateOrderInfo$default(C25324iua c25324iua, kVI kvi, boolean z, boolean z2, Function0 function0, boolean z3, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            z3 = true;
        }
        c25324iua.EZpvd(kvi, z, z2, function0, z3);
    }

    public final void EZpvd(kVI kvi, boolean z, boolean z2, @NotNull Function0<Unit> function0, boolean z3) {
        C25332iui c25332iui;
        C25325iub c25325iub;
        C25325iub c25325iub2;
        Intrinsics.checkNotNullParameter(function0, "");
        AhwBna();
        if (z3) {
            setVisibility(kvi != null ? 0 : 8);
        }
        if (kvi == null) {
            return;
        }
        hHK hhk = this.copydefault;
        if (hhk != null && (c25325iub2 = hhk.AEQbTJ) != null) {
            c25325iub2.setVisibility(z ? 0 : 8);
        }
        hHK hhk2 = this.copydefault;
        if (hhk2 != null && (c25325iub = hhk2.AEQbTJ) != null && c25325iub.getVisibility() == 0) {
            java.lang.String strKWHzl = kvi.KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            java.lang.String strEZpvd = kvi.EZpvd();
            if (strEZpvd == null) {
                strEZpvd = "";
            }
            AEQbTJ(strKWHzl, strEZpvd);
        }
        java.lang.String strAEQbTJ = kvi.AEQbTJ();
        OLrzqt(strAEQbTJ != null ? strAEQbTJ : "");
        OLrzqt(kvi.copydefault(), z2, function0);
        boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) kvi.OLrzqt(), (java.lang.Object) "11");
        hHK hhk3 = this.copydefault;
        if (hhk3 == null || (c25332iui = hhk3.OLrzqt) == null) {
            return;
        }
        c25332iui.setVisibility(zEZpvd ? 0 : 8);
    }

    public final void setInvalidState() {
        C25332iui c25332iui;
        C25325iub c25325iub;
        C25325iub c25325iub2;
        AhwBna();
        hHK hhk = this.copydefault;
        if (hhk != null && (c25325iub2 = hhk.EZpvd) != null) {
            c25325iub2.setVisibility(8);
        }
        hHK hhk2 = this.copydefault;
        if (hhk2 != null && (c25325iub = hhk2.AEQbTJ) != null) {
            c25325iub.setVisibility(8);
        }
        hHK hhk3 = this.copydefault;
        if (hhk3 != null && (c25332iui = hhk3.OLrzqt) != null) {
            c25332iui.setVisibility(0);
        }
        OLrzqt(null, false, new Function0() { // from class: o.iuc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C25324iua.EZpvd();
            }
        });
    }

    public static final Unit EZpvd() {
        return Unit.INSTANCE;
    }

    public final void AEQbTJ(boolean z) {
        C25325iub c25325iub;
        hHK hhk = this.copydefault;
        if (hhk != null && (c25325iub = hhk.EZpvd) != null) {
            c25325iub.setVisibility(z ? 0 : 8);
        }
        this.KWHzl = z;
    }

    public final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        C25325iub c25325iub;
        C25325iub c25325iub2;
        C25325iub c25325iub3;
        C25325iub c25325iub4;
        hHK hhk = this.copydefault;
        if (hhk != null && (c25325iub4 = hhk.AEQbTJ) != null) {
            c25325iub4.setVisibility(C31172lox.KWHzl(this.AEQbTJ, C31172lox.Companion.OLrzqt()) ^ true ? 0 : 8);
        }
        if (str.length() == 0) {
            hHK hhk2 = this.copydefault;
            if (hhk2 == null || (c25325iub3 = hhk2.AEQbTJ) == null) {
                return;
            }
            c25325iub3.setupView(new C25325iub.TaskDescription(C33070mpX.AYXKKw(C23274hvD.Fragment.DIIpTV), 0, 0, null, 0, false, null, false, 254, null));
            return;
        }
        hHK hhk3 = this.copydefault;
        if (hhk3 != null && (c25325iub2 = hhk3.AEQbTJ) != null) {
            c25325iub2.setupListeners(new Function0() { // from class: o.itZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C25324iua.KWHzl();
                }
            }, new Function0() { // from class: o.iuh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C25324iua.AEQbTJ(this.EZpvd);
                }
            });
        }
        hHK hhk4 = this.copydefault;
        if (hhk4 == null || (c25325iub = hhk4.AEQbTJ) == null) {
            return;
        }
        c25325iub.setupView(new C25325iub.TaskDescription(C33070mpX.AYXKKw(C23274hvD.Fragment.DIIpTV), 0, 0, str, 0, true, str2, true, 22, null));
    }

    public static final Unit KWHzl() {
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C25324iua c25324iua) {
        Activity activity = c25324iua.EZpvd;
        if (activity != null) {
            activity.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
        C25325iub c25325iub;
        int iKWHzl;
        C25325iub c25325iub2;
        C25325iub c25325iub3;
        hHK hhk = this.copydefault;
        if (hhk != null && (c25325iub3 = hhk.EZpvd) != null) {
            c25325iub3.setVisibility((!this.KWHzl || str.length() <= 0) ? 8 : 0);
        }
        hHK hhk2 = this.copydefault;
        if (hhk2 != null && (c25325iub2 = hhk2.EZpvd) != null) {
            c25325iub2.setupListeners(new Function0() { // from class: o.iuf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C25324iua.OLrzqt(this.copydefault);
                }
            }, new Function0() { // from class: o.iue
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C25324iua.valueOf();
                }
            });
        }
        hHK hhk3 = this.copydefault;
        if (hhk3 == null || (c25325iub = hhk3.EZpvd) == null) {
            return;
        }
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.DUUtXg);
        java.lang.String percentWithSymbol$default = C23311hvo.formatPercentWithSymbol$default(str, false, 0, 0, null, null, 31, null);
        if (C23313hvq.EZpvd(str, "0.001")) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = c25325iub.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            iKWHzl = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
        } else if (C23313hvq.valueOf(str, java.lang.Double.valueOf(-0.1d))) {
            C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
            android.content.Context context2 = c25325iub.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "");
            iKWHzl = C33512mxp.tradeFallDefault$default(c33512mxp2, context2, 0.0f, 2, null);
        } else {
            iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl);
        }
        c25325iub.setupView(new C25325iub.TaskDescription(strAYXKKw, 0, 1, percentWithSymbol$default, iKWHzl, false, null, false, 226, null));
    }

    public static final Unit OLrzqt(C25324iua c25324iua) {
        Activity activity = c25324iua.EZpvd;
        if (activity != null) {
            activity.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final kVO kvo, boolean z, Function0<Unit> function0) {
        C25332iui c25332iui;
        C25332iui c25332iui2;
        C25332iui c25332iui3;
        C25332iui c25332iui4;
        java.lang.CharSequence charSequenceEZpvd = kvo == null ? "--" : kVM.EZpvd(kvo);
        hHK hhk = this.copydefault;
        if (hhk != null && (c25332iui4 = hhk.OLrzqt) != null) {
            c25332iui4.setIsShowReferralView(z, function0);
        }
        hHK hhk2 = this.copydefault;
        if (hhk2 != null && (c25332iui3 = hhk2.OLrzqt) != null) {
            c25332iui3.setupServiceFee(charSequenceEZpvd, new Function0() { // from class: o.iud
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C25324iua.copydefault(kvo, this);
                }
            });
        }
        hHK hhk3 = this.copydefault;
        if (hhk3 != null && (c25332iui2 = hhk3.OLrzqt) != null) {
            c25332iui2.setTitleColor(ContextCompat.getColor(getContext(), kvo != null ? C52761wXj.Activity.QwvEab : C52761wXj.Activity.UlJrfe));
        }
        hHK hhk4 = this.copydefault;
        if (hhk4 == null || (c25332iui = hhk4.OLrzqt) == null) {
            return;
        }
        c25332iui.setServiceFeeValueColor(ContextCompat.getColor(getContext(), kvo != null ? C52761wXj.Activity.fdOvFl : C52761wXj.Activity.UlJrfe));
    }

    public static final Unit copydefault(kVO kvo, C25324iua c25324iua) {
        if (kvo != null) {
            android.content.Context context = c25324iua.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            kVM.EZpvd(kvo, context);
        }
        return Unit.INSTANCE;
    }
}
