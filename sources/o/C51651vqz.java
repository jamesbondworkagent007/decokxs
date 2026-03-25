package o;

import com.okinc.localization.util.currency.Notation;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.RecommendBulletItem;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.InterfaceC43294rma;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vqz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C51651vqz {
    public static final void EZpvd(@NotNull android.widget.TextView textView, @NotNull RecommendBulletItem recommendBulletItem) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(textView, "");
        Intrinsics.checkNotNullParameter(recommendBulletItem, "");
        java.lang.String bulletChatType = recommendBulletItem.getBulletChatType();
        int i = (bulletChatType == null || !bulletChatType.equals("1")) ? C48033uCm.Fragment.invokespecialhlXVux : C48033uCm.Fragment.invokespecialdPnHjp;
        java.lang.String symbol = recommendBulletItem.getSymbol();
        if (symbol == null || symbol.length() == 0) {
            symbol = "USDT";
        }
        java.lang.String str = symbol;
        java.lang.String bulletChatType2 = recommendBulletItem.getBulletChatType();
        if (bulletChatType2 != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) bulletChatType2, (java.lang.CharSequence) "1", false, 2, (java.lang.Object) null)) {
            BigDecimal bigDecimal = new BigDecimal(C33129mqd.gEmmrt(recommendBulletItem.getAmount()));
            RoundingMode roundingMode = RoundingMode.HALF_DOWN;
            C38307pTy c38307pTyEZpvd = C38307pTy.Companion.EZpvd(1);
            DisplaySign displaySign = DisplaySign.EXCEPT_ZERO;
            Notation notation = Notation.COMPACT_SHORT;
            java.util.Locale locale = java.util.Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            strCopydefault = C38305pTw.copydefault(bigDecimal, str, roundingMode, c38307pTyEZpvd, displaySign, notation, locale);
        } else {
            BigDecimal bigDecimal2 = new BigDecimal(C33129mqd.gEmmrt(recommendBulletItem.getAmount()));
            RoundingMode roundingMode2 = RoundingMode.HALF_DOWN;
            C38307pTy c38307pTyEZpvd2 = C38307pTy.Companion.EZpvd(1);
            DisplaySign displaySign2 = DisplaySign.AUTO;
            Notation notation2 = Notation.COMPACT_SHORT;
            java.util.Locale locale2 = java.util.Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            strCopydefault = C38305pTw.copydefault(bigDecimal2, str, roundingMode2, c38307pTyEZpvd2, displaySign2, notation2, locale2);
        }
        java.lang.String sectorName = recommendBulletItem.getSectorName();
        if (sectorName == null) {
            sectorName = "";
        }
        android.content.Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        java.lang.CharSequence charSequenceKWHzl = C33069mpW.KWHzl(context, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, strCopydefault), C56390yDp.OLrzqt("botType", sectorName)));
        java.lang.String bulletChatType3 = recommendBulletItem.getBulletChatType();
        if (bulletChatType3 != null && StringsKt__StringsKt.contains$default((java.lang.CharSequence) bulletChatType3, (java.lang.CharSequence) "1", false, 2, (java.lang.Object) null)) {
            android.text.SpannableString spannableString = new android.text.SpannableString(charSequenceKWHzl);
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default(charSequenceKWHzl, strCopydefault, 0, false, 6, (java.lang.Object) null);
            if (iIndexOf$default != -1) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context context2 = textView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33512mxp.tradeRiseDefault$default(c33512mxp, context2, 0.0f, 2, null)), iIndexOf$default, strCopydefault.length() + iIndexOf$default, 33);
            }
            textView.setText(spannableString);
            return;
        }
        textView.setText(charSequenceKWHzl);
    }

    public static final void AEQbTJ(@NotNull android.view.ViewGroup viewGroup, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(viewGroup, "");
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC43294rma.Application.processDeeplink$default((InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class), C35334ntP.KWHzl(viewGroup), C56071xvr.gEmmrt.KWHzl(str, "trade_bot_main_page_smartpicks_card"), null, new Function1() { // from class: o.vqF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51651vqz.OLrzqt((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }
}
