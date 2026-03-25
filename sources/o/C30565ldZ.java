package o;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedApproveState;
import com.okinc.network.okg.response.OKServerException;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC30561ldV;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC30595leC;
import o.gLQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ldZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30565ldZ {
    public static final boolean OLrzqt(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        return Intrinsics.EZpvd((java.lang.Object) dexMultiTokenInfoBean.getChainId(), (java.lang.Object) (dexMultiTokenInfoBean2 != null ? dexMultiTokenInfoBean2.getChainId() : null)) && Intrinsics.EZpvd((java.lang.Object) dexMultiTokenInfoBean.getTokenContractAddress(), (java.lang.Object) dexMultiTokenInfoBean2.getTokenContractAddress());
    }

    public static final int copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        android.view.View viewInflate = android.view.LayoutInflater.from(context).inflate(C23274hvD.Activity.fGT, (android.view.ViewGroup) null);
        viewInflate.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        return viewInflate.getMeasuredHeight();
    }

    /* JADX INFO: renamed from: o.ldZ$Application */
    public static final class Application implements View.OnLayoutChangeListener {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ android.widget.TextView EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ int OLrzqt;
        public final /* synthetic */ int copydefault;

        public Application(android.widget.TextView textView, int i, int i2, int i3, int i4) {
            this.EZpvd = textView;
            this.OLrzqt = i;
            this.KWHzl = i2;
            this.copydefault = i3;
            this.AEQbTJ = i4;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(this.EZpvd, this.OLrzqt, this.KWHzl, this.copydefault, this.AEQbTJ);
        }
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString().length() > i) {
            java.lang.String strSubstring = str.substring(0, i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            return strSubstring + "...";
        }
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
    }

    public static /* synthetic */ java.lang.String getFmtSymbol$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 8;
        }
        return KWHzl(str, i);
    }

    public static final void EZpvd(@NotNull AbstractC30799lhv abstractC30799lhv, boolean z) {
        C55009xbp c55009xbpFIwbmz;
        Intrinsics.checkNotNullParameter(abstractC30799lhv, "");
        int i = !z ? C52761wXj.Activity.UlJrfe : C52761wXj.Activity.fdOvFl;
        abstractC30799lhv.setEnabled(z);
        abstractC30799lhv.setFocusable(z);
        abstractC30799lhv.setClickable(z);
        abstractC30799lhv.setFocusableInTouchMode(z);
        C55001xbh c55001xbhAhwBna = abstractC30799lhv.AhwBna();
        if (c55001xbhAhwBna != null) {
            if (!z) {
                c55001xbhAhwBna.setPlainNumericText("");
            }
            c55001xbhAhwBna.setEnabled(z);
            c55001xbhAhwBna.setFocusable(z);
            c55001xbhAhwBna.setClickable(z);
            c55001xbhAhwBna.setFocusableInTouchMode(z);
        }
        C55008xbo c55008xboValueOf = abstractC30799lhv.valueOf();
        if (c55008xboValueOf != null && (c55009xbpFIwbmz = c55008xboValueOf.fIwbmz()) != null) {
            c55009xbpFIwbmz.setEnabled(z);
            c55009xbpFIwbmz.setFocusable(z);
            c55009xbpFIwbmz.setClickable(z);
        }
        AppCompatTextView appCompatTextViewGEmmrt = abstractC30799lhv.gEmmrt();
        if (appCompatTextViewGEmmrt != null) {
            appCompatTextViewGEmmrt.setEnabled(z);
            appCompatTextViewGEmmrt.setFocusable(z);
            appCompatTextViewGEmmrt.setClickable(z);
            appCompatTextViewGEmmrt.setTextColor(C25382ivf.KWHzl(i));
            android.graphics.drawable.Drawable drawable = appCompatTextViewGEmmrt.getCompoundDrawablesRelative()[2];
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(appCompatTextViewGEmmrt.getContext(), i), PorterDuff.Mode.SRC_IN));
            }
        }
        AppCompatTextView appCompatTextViewAYXKKw = abstractC30799lhv.AYXKKw();
        if (appCompatTextViewAYXKKw != null) {
            appCompatTextViewAYXKKw.setEnabled(z);
            appCompatTextViewAYXKKw.setFocusable(false);
            appCompatTextViewAYXKKw.setClickable(false);
            appCompatTextViewAYXKKw.setTextColor(C25382ivf.KWHzl(z ? C52761wXj.Activity.QwvEab : C52761wXj.Activity.UlJrfe));
        }
    }

    public static final int KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return 2;
        }
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
        int i = 0;
        if (C59449zhJ.startsWith$default(string, "-", false, 2, null)) {
            string = string.substring(1);
            Intrinsics.checkNotNullExpressionValue(string, "");
        }
        try {
            if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) string, (java.lang.CharSequence) "E", true) || StringsKt__StringsKt.contains$default((java.lang.CharSequence) string, (java.lang.CharSequence) "e", false, 2, (java.lang.Object) null)) {
                string = C33129mqd.copydefault(string).toPlainString();
            }
            java.lang.String str2 = string;
            Intrinsics.copydefault((java.lang.Object) str2);
            if (!C31194lpS.copydefault(str2)) {
                return 2;
            }
            if (OLrzqt(str2)) {
                return 0;
            }
            java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str2, new char[]{'.'}, false, 0, 6, (java.lang.Object) null);
            java.lang.String str3 = listSplit$default.size() > 1 ? (java.lang.String) listSplit$default.get(1) : "";
            if (str3.length() == 0) {
                return 0;
            }
            int length = str3.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (str3.charAt(i) != '0') {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 2;
            }
            return java.lang.Math.max(2, i + java.lang.Math.min(5, str3.length() - i));
        } catch (java.lang.NumberFormatException unused) {
            return 2;
        }
    }

    public static final boolean OLrzqt(java.lang.String str) {
        return C59449zhJ.replace$default(C59449zhJ.replace$default(str, JwtUtilsKt.JWT_DELIMITER, "", false, 4, (java.lang.Object) null), "0", "", false, 4, (java.lang.Object) null).length() == 0;
    }

    public static final java.lang.String OLrzqt(java.lang.String str, int i) {
        return (str == null || str.length() == 0) ? str == null ? "" : str : C33129mqd.mulS$default(str, 1, java.lang.Integer.valueOf(i), null, null, 12, null);
    }

    public static final java.lang.String EZpvd(java.lang.Throwable th) {
        java.lang.String string;
        OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
        java.lang.Throwable origin = oKServerException != null ? oKServerException.getOrigin() : null;
        OKServerException oKServerException2 = origin instanceof OKServerException ? (OKServerException) origin : null;
        return (oKServerException2 == null || (string = java.lang.Integer.valueOf(oKServerException2.getCode()).toString()) == null) ? oKServerException != null ? java.lang.Integer.valueOf(oKServerException.getCode()).toString() : "" : string;
    }

    public static final java.lang.String AEQbTJ(java.lang.Throwable th) {
        java.lang.String message;
        OKServerException oKServerException = th instanceof OKServerException ? (OKServerException) th : null;
        java.lang.Throwable origin = oKServerException != null ? oKServerException.getOrigin() : null;
        OKServerException oKServerException2 = origin instanceof OKServerException ? (OKServerException) origin : null;
        if (oKServerException2 != null && (message = oKServerException2.getMessage()) != null) {
            return message;
        }
        java.lang.String message2 = th != null ? th.getMessage() : null;
        return message2 == null ? "" : message2;
    }

    public static final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return str.length() > 0 && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--") && C33129mqd.AhwBna(str, 0);
    }

    public static final InterfaceC30619lea AEQbTJ(InterfaceC30595leC interfaceC30595leC) {
        return new AbstractC30561ldV.TaskDescription(copydefault(interfaceC30595leC));
    }

    public static final java.lang.String copydefault(InterfaceC30595leC interfaceC30595leC) {
        if (interfaceC30595leC instanceof InterfaceC30595leC.Activity) {
            return ((InterfaceC30595leC.Activity) interfaceC30595leC).KWHzl() == AdvancedApproveState.CANCEL_APPROVE ? "revoke" : "approve";
        }
        if (interfaceC30595leC instanceof InterfaceC30595leC.ActionBar) {
            return "DAPP";
        }
        if (interfaceC30595leC instanceof InterfaceC30595leC.Application) {
            return "connect_wallet";
        }
        if (interfaceC30595leC instanceof InterfaceC30595leC.ContextWrapper) {
            InterfaceC30595leC.ContextWrapper contextWrapper = (InterfaceC30595leC.ContextWrapper) interfaceC30595leC;
            if (contextWrapper.OLrzqt() instanceof gLQ.ActionBar) {
                return "unlock_sa";
            }
            if (OLrzqt(contextWrapper.OLrzqt())) {
                return "re_enable_sa";
            }
        } else {
            if (interfaceC30595leC instanceof InterfaceC30595leC.PictureInPictureParams) {
                return copydefault(((InterfaceC30595leC.PictureInPictureParams) interfaceC30595leC).AEQbTJ());
            }
            if ((interfaceC30595leC instanceof InterfaceC30595leC.ComponentName) || interfaceC30595leC == null) {
                return "submit";
            }
        }
        return "";
    }

    public static final boolean OLrzqt(@NotNull gLQ glq) {
        Intrinsics.checkNotNullParameter(glq, "");
        return (glq instanceof gLQ.FragmentManager) || (glq instanceof gLQ.AssistContent) || (glq instanceof gLQ.Activity);
    }

    public static /* synthetic */ void setTextWithAutoSize$default(android.widget.TextView textView, java.lang.CharSequence charSequence, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 8) != 0) {
            i3 = 1;
        }
        int i6 = i3;
        if ((i5 & 16) != 0) {
            i4 = 2;
        }
        KWHzl(textView, charSequence, i, i2, i6, i4);
    }

    public static final void KWHzl(@NotNull android.widget.TextView textView, java.lang.CharSequence charSequence, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(textView, "");
        TextViewCompat.setAutoSizeTextTypeWithDefaults(textView, 0);
        textView.setTextSize(i4, i2);
        textView.setText(charSequence);
        if (ViewCompat.isLaidOut(textView) && !textView.isLayoutRequested()) {
            TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(textView, i, i2, i3, i4);
        } else {
            textView.addOnLayoutChangeListener(new Application(textView, i, i2, i3, i4));
        }
    }
}
