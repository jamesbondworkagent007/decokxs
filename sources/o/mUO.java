package o;

import android.view.View;
import androidx.core.os.BundleKt;
import com.okinc.dexkline.dex.api.bean.CoinDetailRedirection;
import com.okinc.dexkline.dex.api.bean.TokenBase;
import com.okinc.network.okg.cor.SubdomainStrategy;
import com.okinc.web.WebActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class mUO {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final java.lang.String OLrzqt() {
        return "--";
    }

    public static /* synthetic */ java.lang.String formatAddress$default(java.lang.String str, int i, int i2, java.lang.String str2, int i3, java.lang.Object obj) {
        if ((i3 & 4) != 0) {
            str2 = "...";
        }
        return KWHzl(str, i, i2, str2);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, int i, int i2, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str.length() <= i + i2 + 1) {
            return str;
        }
        return C59454zhO.AkhnZx(str, i) + str2 + C59454zhO.isConnected(str, i2);
    }

    public static /* synthetic */ void setOnDoubleCheckClickListener$default(android.view.View view, long j, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 500;
        }
        KWHzl(view, j, function1);
    }

    public static final void KWHzl(android.view.View view, final long j, @NotNull final Function1<? super android.view.View, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: o.mUX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    mUO.EZpvd(j, function1, view2);
                }
            });
        }
    }

    public static final void EZpvd(long j, Function1 function1, android.view.View view) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Object tag = view.getTag(C35964oKf.StateListAnimator.zzQwtT);
        java.lang.Long l = tag instanceof java.lang.Long ? (java.lang.Long) tag : null;
        if (jElapsedRealtime - (l != null ? l.longValue() : 0L) > j) {
            view.setTag(C35964oKf.StateListAnimator.zzQwtT, java.lang.Long.valueOf(jElapsedRealtime));
            Intrinsics.copydefault(view);
            function1.invoke(view);
        }
    }

    public static /* synthetic */ void setRiseDownPercentColorAndValue$default(android.widget.TextView textView, java.lang.String str, boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 2;
        }
        EZpvd(textView, str, z, i);
    }

    public static final void OLrzqt(@NotNull android.widget.TextView textView, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.content.Context contextKWHzl = mUM.KWHzl(context);
        textView.setTextColor(mRE.EZpvd(str, 0) ? C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, contextKWHzl, 0.0f, 2, null) : C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, contextKWHzl, 0.0f, 2, null));
    }

    public static final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @androidx.annotation.StringRes int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(str2);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, i, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static /* synthetic */ void showOKDialogCheckboxWithCallback$default(android.content.Context context, java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, int i, java.lang.String str3, Function1 function1, int i2, java.lang.Object obj) {
        if ((i2 & 16) != 0) {
            str3 = "";
        }
        java.lang.String str4 = str3;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        KWHzl(context, str, charSequence, str2, i, str4, function1);
    }

    public static final void KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.CharSequence charSequence, @NotNull java.lang.String str2, @androidx.annotation.StringRes int i, @NotNull java.lang.String str3, final Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(charSequence, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(str);
        viewOnClickListenerC54939xaY.EZpvd(charSequence);
        android.content.Context context2 = viewOnClickListenerC54939xaY.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        final wYK wyk = new wYK(context2, null, 0, 6, null);
        wyk.setText(str2);
        viewOnClickListenerC54939xaY.EZpvd(wyk);
        viewOnClickListenerC54939xaY.EZpvd(i, new View.OnClickListener() { // from class: o.mUV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                mUO.OLrzqt(function1, wyk, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        if (str3.length() > 0) {
            ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, str3, (View.OnClickListener) null, 2, (java.lang.Object) null);
        }
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(Function1 function1, wYK wyk, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(wyk.isChecked()));
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(@NotNull android.content.Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.gtdfxv));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(z ? C35964oKf.Fragment.cBPFI : C35964oKf.Fragment.scanPackages));
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C35964oKf.Fragment.DcMfJKDGTeJD, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (context != null) {
            WebActivity.TaskDescription.openPage$default(WebActivity.Companion, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", str), C56390yDp.OLrzqt("subdomainstrategy", SubdomainStrategy.Global.INSTANCE.toString())), null, 4, null);
        }
    }

    public static final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objEZpvd = C6832aWn.EZpvd("clipboard");
        android.content.ClipboardManager clipboardManager = objEZpvd instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) objEZpvd : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(android.content.ClipData.newPlainText(null, str));
        }
    }

    public static /* synthetic */ void setNetworkError$default(C55173xeu c55173xeu, boolean z, java.lang.String str, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        copydefault(c55173xeu, z, str, function0);
    }

    public static final void copydefault(@NotNull C55173xeu c55173xeu, boolean z, java.lang.String str, @NotNull final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(c55173xeu, "");
        Intrinsics.checkNotNullParameter(function0, "");
        if (z) {
            c55173xeu.setVisibility(0);
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.dpErvT));
            if (str == null) {
                str = C33070mpX.AYXKKw(C35964oKf.Fragment.RKcVTr);
            }
            c55173xeu.setSubTitle((java.lang.CharSequence) str);
            c55173xeu.setRetry(C33070mpX.AYXKKw(C35964oKf.Fragment.AwvSrB));
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.mUQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    mUO.AEQbTJ(function0, view);
                }
            });
            return;
        }
        c55173xeu.setVisibility(8);
    }

    public static final void AEQbTJ(Function0 function0, android.view.View view) {
        function0.invoke();
    }

    public static /* synthetic */ void openMarketDetailPage$default(android.content.Context context, java.lang.String str, TokenBase tokenBase, java.lang.String str2, CoinDetailRedirection coinDetailRedirection, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            coinDetailRedirection = null;
        }
        CoinDetailRedirection coinDetailRedirection2 = coinDetailRedirection;
        if ((i & 16) != 0) {
            str3 = "0";
        }
        java.lang.String str5 = str3;
        if ((i & 32) != 0) {
            str4 = "";
        }
        copydefault(context, str, tokenBase, str2, coinDetailRedirection2, str5, str4);
    }

    public static final void copydefault(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull TokenBase tokenBase, @NotNull java.lang.String str2, CoinDetailRedirection coinDetailRedirection, @NotNull java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tokenBase, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC38834pgs.class);
        C34656ngH.AEQbTJ(intent, str);
        intent.putExtra("token_base", tokenBase);
        intent.putExtra("key.page_from", str2);
        intent.putExtra("coin_detail_redirection", coinDetailRedirection);
        intent.putExtra("is_show_price_alert", !Intrinsics.EZpvd((java.lang.Object) str3, (java.lang.Object) "0"));
        intent.putExtra("firstTab", str4);
        context.startActivity(intent);
    }

    public static final int KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Context contextKWHzl = mUM.KWHzl(context);
        return str.length() == 0 ? mUM.EZpvd(C52761wXj.ActionBar.getPostValueLengthLimit, contextKWHzl) : mRE.EZpvd(str, 0) ? C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, contextKWHzl, 0.0f, 2, null) : mRE.AEQbTJ(str, 0) ? C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, contextKWHzl, 0.0f, 2, null) : mUM.EZpvd(C52761wXj.ActionBar.getPostValueLengthLimit, contextKWHzl);
    }

    public static final void EZpvd(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC32309mXf.class);
        intent.putExtra("key.token_image_url", str);
        context.startActivity(intent);
    }

    public static final void AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        OLrzqt(context, C33070mpX.AYXKKw(C35964oKf.Fragment.siEkQe) + str);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.mRv.formatPercentWithSymbol$default(java.lang.String, boolean, int, int, java.math.RoundingMode, java.util.Locale, int, java.lang.Object):java.lang.String */
    public static final void EZpvd(@NotNull android.widget.TextView textView, @NotNull java.lang.String str, boolean z, int i) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strAEQbTJ = C34663ngO.AEQbTJ(C33129mqd.OLrzqt((java.lang.CharSequence) str) ? C32163mRv.formatPercentWithSymbol$default(str, z, 0, i, null, null, 26, null) : "", new Function0() { // from class: o.mUP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return mUO.OLrzqt();
            }
        });
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iKWHzl = KWHzl(context, str);
        textView.setText(strAEQbTJ);
        textView.setTextColor(iKWHzl);
    }
}
