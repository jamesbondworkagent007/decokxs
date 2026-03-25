package o;

import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.CountDownType;
import com.okinc.unify_trade.constants.MarketTypeEnum;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jyb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27618jyb {

    /* JADX INFO: renamed from: o.jyb$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;

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
            KWHzl = iArr;
            int[] iArr2 = new int[MarketTypeEnum.values().length];
            try {
                iArr2[MarketTypeEnum.CALL_AUCTION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[MarketTypeEnum.PRE_QUOTE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            EZpvd = iArr2;
        }
    }

    public static final void EZpvd(@NotNull CountDownInfo countDownInfo, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(countDownInfo, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (textView instanceof C42963rgN) {
            CountDownType showType = countDownInfo.getShowType();
            int i = showType == null ? -1 : Application.KWHzl[showType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                ((C42963rgN) textView).setContent(false, 0L, C33070mpX.AYXKKw(qZH.PendingIntent.RihMUf));
            } else {
                C42963rgN c42963rgN = (C42963rgN) textView;
                c42963rgN.setContent(true, C33129mqd.valueOf(countDownInfo.getOnlineTime()), "");
                c42963rgN.setCountDownEvent("SEARCH_COUNT_DOWN_EVENT");
            }
        }
    }

    public static final void KWHzl(@NotNull CountDownInfo countDownInfo, @NotNull android.widget.TextView textView) {
        Intrinsics.checkNotNullParameter(countDownInfo, "");
        Intrinsics.checkNotNullParameter(textView, "");
        CountDownType showType = countDownInfo.getShowType();
        int i = showType == null ? -1 : Application.KWHzl[showType.ordinal()];
        if (i == 1) {
            textView.setVisibility(0);
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(AEQbTJ(countDownInfo));
            textView.setText(C33061mpO.setupSpanStyles$default(strAYXKKw, new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.jyd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C27618jyb.OLrzqt((java.util.List) obj);
                }
            }, 14, null));
        } else {
            if (i != 2) {
                return;
            }
            textView.setText("");
            textView.setVisibility(8);
        }
    }

    public static final Unit OLrzqt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)));
        return Unit.INSTANCE;
    }

    public static final int AEQbTJ(@NotNull CountDownInfo countDownInfo) {
        Intrinsics.checkNotNullParameter(countDownInfo, "");
        int i = Application.EZpvd[countDownInfo.getNextStage().ordinal()];
        return (i == 1 || i == 2) ? qZH.PendingIntent.zlvcHA : qZH.PendingIntent.fvQaOB;
    }
}
