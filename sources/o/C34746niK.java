package o;

import com.okinc.fiat.api.bean.CoinType;
import com.okinc.fiat.api.bean.FiatCryptoCoinBean;
import com.okinc.fiat.api.bean.FiatCryptoCoinListBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.niK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C34746niK {
    public static final C34746niK OLrzqt = new C34746niK();
    public static final java.util.ArrayList<FiatCryptoCoinBean> KWHzl = new java.util.ArrayList<>();
    public static final java.util.ArrayList<FiatCryptoCoinBean> AEQbTJ = new java.util.ArrayList<>();
    public static final java.util.ArrayList<FiatCryptoCoinBean> gEmmrt = new java.util.ArrayList<>();
    public static final java.util.HashMap<java.lang.String, java.util.ArrayList<FiatCryptoCoinBean>> copydefault = new java.util.HashMap<>();
    public static final int EZpvd = 8;

    /* JADX INFO: renamed from: o.niK$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CoinType.values().length];
            try {
                iArr[CoinType.COIN_TYPE_BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
        }
    }

    private C34746niK() {
    }

    public final void OLrzqt(@NotNull FiatCryptoCoinListBean fiatCryptoCoinListBean) {
        Intrinsics.checkNotNullParameter(fiatCryptoCoinListBean, "");
        java.util.ArrayList<FiatCryptoCoinBean> arrayList = KWHzl;
        arrayList.clear();
        arrayList.addAll(fiatCryptoCoinListBean.getQuoteCurrencies());
        java.util.ArrayList<FiatCryptoCoinBean> arrayList2 = AEQbTJ;
        arrayList2.clear();
        arrayList2.addAll(fiatCryptoCoinListBean.getBaseCurrencies());
        java.util.ArrayList<FiatCryptoCoinBean> arrayList3 = gEmmrt;
        arrayList3.clear();
        arrayList3.addAll(fiatCryptoCoinListBean.getSellSupportQuoteCurrencies());
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.util.ArrayList<FiatCryptoCoinBean> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.HashMap<java.lang.String, java.util.ArrayList<FiatCryptoCoinBean>> map = copydefault;
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.String upperCase = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        if (map.containsKey(upperCase)) {
            java.lang.String upperCase2 = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "");
            if (C33129mqd.KWHzl((java.util.Collection) map.get(upperCase2))) {
                java.lang.String upperCase3 = str.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase3, "");
                java.util.ArrayList<FiatCryptoCoinBean> arrayList2 = map.get(upperCase3);
                if (arrayList2 != null) {
                    arrayList2.clear();
                }
                java.lang.String upperCase4 = str.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase4, "");
                map.put(upperCase4, arrayList);
                return;
            }
        }
        java.lang.String upperCase5 = str.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase5, "");
        map.put(upperCase5, arrayList);
    }

    public final java.util.ArrayList<FiatCryptoCoinBean> OLrzqt(@NotNull CoinType coinType) {
        Intrinsics.checkNotNullParameter(coinType, "");
        return StateListAnimator.EZpvd[coinType.ordinal()] == 1 ? KWHzl : gEmmrt;
    }

    public static /* synthetic */ java.util.ArrayList queryDigitalListCache$default(C34746niK c34746niK, CoinType coinType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return c34746niK.AEQbTJ(coinType, str);
    }

    public final java.util.ArrayList<FiatCryptoCoinBean> AEQbTJ(@NotNull CoinType coinType, java.lang.String str) {
        java.lang.String upperCase;
        Intrinsics.checkNotNullParameter(coinType, "");
        if (StateListAnimator.EZpvd[coinType.ordinal()] == 1) {
            return AEQbTJ;
        }
        java.util.HashMap<java.lang.String, java.util.ArrayList<FiatCryptoCoinBean>> map = copydefault;
        if (str != null) {
            upperCase = str.toUpperCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "");
        } else {
            upperCase = null;
        }
        return map.get(upperCase);
    }
}
