package o;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import com.okinc.business.dexui.main.swap.trade.savings.SavingsOrderParams;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C23274hvD;
import o.C52761wXj;
import o.InterfaceC9857bdW;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.ivC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C25353ivC {
    public static final void AEQbTJ(@NotNull android.widget.TextView textView, @NotNull final C25402ivz c25402ivz, @NotNull final androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(c25402ivz, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (C22416heu.zsXlph()) {
            android.content.Context context = textView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView.setText(KWHzl(context, c25402ivz));
            android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.iOIMNp);
            if (drawableKWHzl != null) {
                drawableKWHzl.mutate();
                int iDpInt$default = C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null);
                drawableKWHzl.setBounds(0, 0, iDpInt$default, iDpInt$default);
                drawableKWHzl.setColorFilter(new PorterDuffColorFilter(C25382ivf.KWHzl(C52761wXj.Activity.dvKsVJ), PorterDuff.Mode.SRC_IN));
            } else {
                drawableKWHzl = null;
            }
            android.graphics.drawable.Drawable drawableKWHzl2 = C33070mpX.KWHzl(C52761wXj.TaskDescription.DGOPHZDGOPHZ);
            if (drawableKWHzl2 != null) {
                drawableKWHzl2.mutate();
                int iDpInt$default2 = C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null);
                drawableKWHzl2.setBounds(0, 0, iDpInt$default2, iDpInt$default2);
                drawableKWHzl2.setColorFilter(new PorterDuffColorFilter(C25382ivf.KWHzl(C52761wXj.Activity.Dmq), PorterDuff.Mode.SRC_IN));
            } else {
                drawableKWHzl2 = null;
            }
            textView.setCompoundDrawables(drawableKWHzl, null, drawableKWHzl2, null);
            textView.setOnClickListener(new View.OnClickListener() { // from class: o.ivE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C25353ivC.OLrzqt(c25402ivz, fragmentManager, view);
                }
            });
            return;
        }
        textView.setVisibility(8);
    }

    public static final void OLrzqt(C25402ivz c25402ivz, androidx.fragment.app.FragmentManager fragmentManager, android.view.View view) {
        C24782ikN.Companion.EZpvd(new SavingsOrderParams(c25402ivz.copydefault(), c25402ivz.gEmmrt(), c25402ivz.djBIcL(), c25402ivz.AYXKKw(), c25402ivz.AEQbTJ(), c25402ivz.KWHzl(), c25402ivz.valueOf(), c25402ivz.OLrzqt(), c25402ivz.EZpvd())).show(fragmentManager);
    }

    public static final android.text.SpannableStringBuilder KWHzl(@NotNull android.content.Context context, @NotNull C25402ivz c25402ivz) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(c25402ivz, "");
        InterfaceC9857bdW interfaceC9857bdW = (InterfaceC9857bdW) C43251rlk.copydefault(InterfaceC9857bdW.class);
        java.lang.String str = Marker.ANY_NON_NULL_MARKER + C23322hvz.toLocalizedNumber$default(c25402ivz.copydefault(), false, (RoundingMode) null, false, false, 11, (java.lang.Object) null) + " " + c25402ivz.djBIcL();
        java.lang.String strLocalizeFiatAmount$default = InterfaceC9857bdW.TaskDescription.localizeFiatAmount$default(interfaceC9857bdW, new BigDecimal(c25402ivz.gEmmrt()), 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, 46, null);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.lang.String str2 = context.getString(C23274hvD.Fragment.newThumbRating) + " ";
        spannableStringBuilder.append((java.lang.CharSequence) str2);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl)), 0, str2.length(), 33);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) str);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(C52761wXj.Activity.dvKsVJ)), length, spannableStringBuilder.length(), 33);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((java.lang.CharSequence) (" (≈" + strLocalizeFiatAmount$default + ")"));
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(C25382ivf.KWHzl(C52761wXj.Activity.QwvEab)), length2, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static final android.text.SpannableStringBuilder AEQbTJ(@NotNull android.content.Context context, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.String strKWHzl = C33069mpW.KWHzl(context, C23274hvD.Fragment.updateBackInvokedCallbackStateactivity_release, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("surplusCount", C23322hvz.toLocalizedNumber$default(str, false, (RoundingMode) null, false, false, 11, (java.lang.Object) null)), C56390yDp.OLrzqt("surplusToken", str3)));
        java.lang.String strKWHzl2 = C33069mpW.KWHzl(context, C23274hvD.Fragment.setOnBackInvokedDispatcher, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt("surplusInfo", strKWHzl), C56390yDp.OLrzqt("fromToken", str2), C56390yDp.OLrzqt("toToken", str3)));
        int iKWHzl = C25382ivf.KWHzl(C52761wXj.Activity.dvKsVJ);
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(strKWHzl2);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) strKWHzl2, strKWHzl, 0, false, 6, (java.lang.Object) null);
        if (iIndexOf$default >= 0) {
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(iKWHzl), iIndexOf$default, strKWHzl.length() + iIndexOf$default, 33);
        }
        return spannableStringBuilder;
    }

    public static /* synthetic */ void setSurplusToast$default(C55097xdX c55097xdX, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        EZpvd(c55097xdX, str, str2, str3);
    }

    public static final void EZpvd(@NotNull C55097xdX c55097xdX, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(c55097xdX, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        android.content.Context context = c55097xdX.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        android.text.SpannableStringBuilder spannableStringBuilderAEQbTJ = AEQbTJ(context, str, str2, str3);
        java.lang.String string = spannableStringBuilderAEQbTJ.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55097xdX.setTitle(string);
        c55097xdX.EZpvd().setText(spannableStringBuilderAEQbTJ);
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.iOIMNp);
        if (drawableKWHzl != null) {
            drawableKWHzl.mutate();
            drawableKWHzl.setColorFilter(new PorterDuffColorFilter(C25382ivf.KWHzl(C52761wXj.Activity.dvKsVJ), PorterDuff.Mode.SRC_IN));
        } else {
            drawableKWHzl = null;
        }
        c55097xdX.setLeadingIcon(drawableKWHzl);
        c55097xdX.setCloseBtnShow(false);
    }
}
