package o;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.LiveData;
import com.okinc.business.market.bean.CoinQuote;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CountDownType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC27554jxQ;
import o.C32113mPz;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public class kJO extends AbstractC27554jxQ {
    public final LiveData<java.lang.String> AkhnZx;
    public boolean DbNXlk;
    public final C54536xML isConnected;
    public final boolean values;

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CountDownType.values().length];
            try {
                iArr[CountDownType.SHOW_COUNT_DOWN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CountDownType.SHOW_EXPECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kJO(@NotNull LiveData<java.lang.String> liveData, AbstractC27554jxQ.ActionBar actionBar) {
        super(actionBar);
        Intrinsics.checkNotNullParameter(liveData, "");
        this.AkhnZx = liveData;
        this.DbNXlk = C55608xnE.EZpvd();
        this.values = !C27550jxM.KWHzl.OLrzqt();
        this.isConnected = new C54536xML();
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence gEmmrt(@NotNull final android.content.Context context, @NotNull CoinQuote coinQuote) {
        java.lang.String quoteCurrency;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        if (Intrinsics.EZpvd((java.lang.Object) coinQuote.getInstType(), (java.lang.Object) "SPOT")) {
            quoteCurrency = coinQuote.getDisplayQuoteSymbol();
            if (!C33129mqd.OLrzqt((java.lang.CharSequence) quoteCurrency)) {
                quoteCurrency = null;
            }
            if (quoteCurrency == null) {
                quoteCurrency = coinQuote.getQuoteCurrency();
            }
        } else {
            quoteCurrency = coinQuote.getQuoteCurrency();
        }
        if (C55296xhK.OLrzqt(context)) {
            return StringsKt__StringsKt.hDKMBd(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(quoteCurrency + " / " + ((java.lang.Object) OLrzqt(coinQuote)), new java.lang.String[]{quoteCurrency + " /"}, 0, MatchPattern.LAST_ONLY, false, new Function1() { // from class: o.kJT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kJO.isConnected(context, (java.util.List) obj);
                }
            }, 10, null), new java.lang.String[]{java.lang.String.valueOf(coinQuote)}, 0, MatchPattern.FIRST_ONLY, false, new Function1() { // from class: o.kJW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kJO.DbNXlk(context, (java.util.List) obj);
                }
            }, 10, null));
        }
        return StringsKt__StringsKt.hDKMBd(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(((java.lang.Object) OLrzqt(coinQuote)) + " / " + quoteCurrency, new java.lang.String[]{java.lang.String.valueOf(coinQuote)}, 0, null, false, new Function1() { // from class: o.kJU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kJO.values(context, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{"/ " + quoteCurrency}, 0, null, false, new Function1() { // from class: o.kJV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return kJO.AkhnZx(context, (java.util.List) obj);
            }
        }, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit isConnected(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.QSBOWP));
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.gHZMYf));
        return Unit.INSTANCE;
    }

    public static final Unit values(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C32113mPz.Dialog.gHZMYf));
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.QSBOWP));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence djBIcL(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String strAEQbTJ = AEQbTJ(coinQuote);
        if (strAEQbTJ.length() == 0) {
            return null;
        }
        return strAEQbTJ;
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence copydefault(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        if (Intrinsics.EZpvd((java.lang.Object) this.AkhnZx.getValue(), (java.lang.Object) "Volume")) {
            C54536xML c54536xML = this.isConnected;
            java.lang.String voulum = coinQuote.getVoulum();
            return c54536xML.OLrzqt(voulum != null ? voulum : "") + " " + coinQuote.getBaseCurrency();
        }
        return java.lang.String.valueOf(coinQuote.getTurnover());
    }

    private final java.lang.String AEQbTJ(CoinQuote coinQuote) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) coinQuote.getLeverageRatio()) || !this.DbNXlk || !this.values) {
            return "";
        }
        return coinQuote.getLeverageRatio() + "x";
    }

    public final java.lang.CharSequence OLrzqt(@NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String baseCurrency = coinQuote.getBaseCurrency();
        if (coinQuote.getBaseCurrency().length() < 10) {
            return baseCurrency;
        }
        java.lang.String strSubstring = baseCurrency.substring(0, 6);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring + "...";
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.CharSequence AEQbTJ(@NotNull final android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        CountDownInfo countDownInfo = coinQuote.getCountDownInfo();
        if (countDownInfo == null || (countDownInfo.countDownTimeExpire() && countDownInfo.getShowType() != CountDownType.SHOW_EXPECT)) {
            countDownInfo = null;
        }
        CountDownType showType = countDownInfo != null ? countDownInfo.getShowType() : null;
        int i = showType == null ? -1 : TaskDescription.EZpvd[showType.ordinal()];
        if (i == 1) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C27618jyb.AEQbTJ(countDownInfo));
            return C33061mpO.setupSpanStyles$default(strAYXKKw, new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.kJX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return kJO.djBIcL(context, (java.util.List) obj);
                }
            }, 14, null);
        }
        if (i != 2) {
            return super.AEQbTJ(context, coinQuote);
        }
        return null;
    }

    public static final Unit djBIcL(android.content.Context context, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.TextAppearanceSpan(context, C52761wXj.LoaderManager.QSBOWP));
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C32113mPz.ActionBar.iwGUEr)));
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC27554jxQ
    public double EZpvd(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        CountDownInfo countDownInfo = coinQuote.getCountDownInfo();
        if (countDownInfo == null || (countDownInfo.countDownTimeExpire() && countDownInfo.getShowType() != CountDownType.SHOW_EXPECT)) {
            countDownInfo = null;
        }
        CountDownType showType = countDownInfo != null ? countDownInfo.getShowType() : null;
        int i = showType == null ? -1 : TaskDescription.EZpvd[showType.ordinal()];
        return (i == 1 || i == 2) ? AudioStats.AUDIO_AMPLITUDE_NONE : super.EZpvd(context, coinQuote);
    }

    @Override // o.AbstractC27554jxQ
    public java.lang.String OLrzqt(@NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        CountDownInfo countDownInfo = coinQuote.getCountDownInfo();
        if (countDownInfo == null || (countDownInfo.countDownTimeExpire() && countDownInfo.getShowType() != CountDownType.SHOW_EXPECT)) {
            countDownInfo = null;
        }
        CountDownType showType = countDownInfo != null ? countDownInfo.getShowType() : null;
        int i = showType == null ? -1 : TaskDescription.EZpvd[showType.ordinal()];
        return (i == 1 || i == 2) ? "--" : super.OLrzqt(context, coinQuote);
    }

    @Override // o.AbstractC27554jxQ
    public void OLrzqt(@NotNull C42670ram c42670ram, @NotNull android.content.Context context, @NotNull CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(c42670ram, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(coinQuote, "");
        CountDownInfo countDownInfo = coinQuote.getCountDownInfo();
        if (countDownInfo == null || (countDownInfo.countDownTimeExpire() && countDownInfo.getShowType() != CountDownType.SHOW_EXPECT)) {
            countDownInfo = null;
        }
        CountDownType showType = countDownInfo != null ? countDownInfo.getShowType() : null;
        int i = showType == null ? -1 : TaskDescription.EZpvd[showType.ordinal()];
        if (i == 1) {
            c42670ram.AhwBna.setText("");
            C42963rgN c42963rgN = c42670ram.AhwBna;
            if (c42963rgN instanceof C42963rgN) {
                c42963rgN.setContent(true, C33129mqd.valueOf(countDownInfo.getOnlineTime()), "");
                c42670ram.AhwBna.setCountDownEvent("WATCH_COUNT_DOWN_EVENT");
            }
            java.lang.CharSequence charSequenceAEQbTJ = AEQbTJ(context, coinQuote);
            if (charSequenceAEQbTJ == null || charSequenceAEQbTJ.length() == 0) {
                c42670ram.AkhnZx.setVisibility(8);
                return;
            } else {
                c42670ram.AkhnZx.setVisibility(0);
                c42670ram.AkhnZx.setText(charSequenceAEQbTJ);
                return;
            }
        }
        if (i == 2) {
            c42670ram.AhwBna.setText(C33070mpX.AYXKKw(qZH.PendingIntent.RihMUf));
            C42963rgN c42963rgN2 = c42670ram.AhwBna;
            if (c42963rgN2 instanceof C42963rgN) {
                c42963rgN2.setContent(false, C33129mqd.valueOf(countDownInfo.getOnlineTime()), C33070mpX.AYXKKw(qZH.PendingIntent.RihMUf));
            }
            java.lang.CharSequence charSequenceAEQbTJ2 = AEQbTJ(context, coinQuote);
            if (charSequenceAEQbTJ2 == null || charSequenceAEQbTJ2.length() == 0) {
                c42670ram.AkhnZx.setVisibility(8);
                return;
            } else {
                c42670ram.AkhnZx.setVisibility(0);
                c42670ram.AkhnZx.setText(charSequenceAEQbTJ2);
                return;
            }
        }
        C42963rgN c42963rgN3 = c42670ram.AhwBna;
        if (c42963rgN3 instanceof C42963rgN) {
            c42963rgN3.AEQbTJ();
        }
        super.OLrzqt(c42670ram, context, coinQuote);
    }
}
