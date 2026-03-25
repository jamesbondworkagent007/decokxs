package o;

import com.okinc.core.util.SPUtils;
import com.okinc.fiat.api.bean.CoinType;
import com.okinc.fiat.api.bean.FiatCryptoCoinBean;
import com.okinc.fiat.api.bean.FiatCryptoCoinPairBean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.niJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34745niJ {
    public static final C34745niJ AEQbTJ = new C34745niJ();
    public static final FiatCryptoCoinPairBean copydefault = new FiatCryptoCoinPairBean();
    public static final FiatCryptoCoinPairBean EZpvd = new FiatCryptoCoinPairBean();
    public static final int OLrzqt = 8;

    /* JADX INFO: renamed from: o.niJ$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[CoinType.values().length];
            try {
                iArr[CoinType.COIN_TYPE_BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[CoinType.COIN_TYPE_SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    private C34745niJ() {
    }

    public final boolean valueOf(CoinType coinType) {
        int i = coinType == null ? -1 : StateListAnimator.copydefault[coinType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (EZpvd.getDigital() != null) {
                    return true;
                }
            } else if (copydefault.getDigital() != null) {
                return true;
            }
        } else if (copydefault.getDigital() != null) {
            return true;
        }
        return false;
    }

    public final java.lang.String djBIcL(CoinType coinType) {
        int i = coinType == null ? -1 : StateListAnimator.copydefault[coinType.ordinal()];
        if (i == 1) {
            FiatCryptoCoinBean legal = copydefault.getLegal();
            if (legal != null) {
                return legal.getCurrency();
            }
        } else if (i == 2) {
            FiatCryptoCoinBean legal2 = EZpvd.getLegal();
            if (legal2 != null) {
                return legal2.getCurrency();
            }
        } else {
            FiatCryptoCoinBean legal3 = copydefault.getLegal();
            if (legal3 != null) {
                return legal3.getCurrency();
            }
        }
        return null;
    }

    public final FiatCryptoCoinBean EZpvd(CoinType coinType) {
        int i = coinType == null ? -1 : StateListAnimator.copydefault[coinType.ordinal()];
        if (i == 1) {
            return copydefault.getLegal();
        }
        if (i == 2) {
            return EZpvd.getLegal();
        }
        return copydefault.getLegal();
    }

    public final java.lang.String KWHzl(CoinType coinType) {
        int i = coinType == null ? -1 : StateListAnimator.copydefault[coinType.ordinal()];
        if (i == 1) {
            FiatCryptoCoinBean digital = copydefault.getDigital();
            if (digital != null) {
                return digital.getCurrency();
            }
        } else if (i == 2) {
            FiatCryptoCoinBean digital2 = EZpvd.getDigital();
            if (digital2 != null) {
                return digital2.getCurrency();
            }
        } else {
            FiatCryptoCoinBean digital3 = copydefault.getDigital();
            if (digital3 != null) {
                return digital3.getCurrency();
            }
        }
        return null;
    }

    public final FiatCryptoCoinBean OLrzqt(CoinType coinType) {
        int i = coinType == null ? -1 : StateListAnimator.copydefault[coinType.ordinal()];
        if (i == 1) {
            return copydefault.getDigital();
        }
        if (i == 2) {
            return EZpvd.getDigital();
        }
        return copydefault.getDigital();
    }

    public final void AEQbTJ(CoinType coinType) {
        java.lang.String str;
        int i = StateListAnimator.copydefault[coinType.ordinal()];
        if (i == 1) {
            str = "crypto_buy_last_legal";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "crypto_sell_last_legal";
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) djBIcL(coinType))) {
            SPUtils.put(str, djBIcL(coinType));
        }
    }

    public final java.lang.String gEmmrt(@NotNull CoinType coinType) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(coinType, "");
        int i = StateListAnimator.copydefault[coinType.ordinal()];
        if (i == 1) {
            str = "crypto_buy_last_legal";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "crypto_sell_last_legal";
        }
        java.lang.String string = SPUtils.getString(str, "");
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
            return C34744niI.OLrzqt.KWHzl();
        }
        Intrinsics.copydefault((java.lang.Object) string);
        return string;
    }

    public static /* synthetic */ void setLegalByCoinType$default(C34745niJ c34745niJ, CoinType coinType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        c34745niJ.EZpvd(coinType, str);
    }

    public final void EZpvd(@NotNull CoinType coinType, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(coinType, "");
        Intrinsics.checkNotNullParameter(str, "");
        FiatCryptoCoinBean fiatCryptoCoinBeanOLrzqt = OLrzqt(coinType, str);
        if (fiatCryptoCoinBeanOLrzqt != null) {
            EZpvd(coinType, fiatCryptoCoinBeanOLrzqt);
        } else {
            FiatCryptoCoinBean fiatCryptoCoinBeanCopydefault = copydefault(coinType);
            if (fiatCryptoCoinBeanCopydefault != null) {
                AEQbTJ.EZpvd(coinType, fiatCryptoCoinBeanCopydefault);
            }
        }
        AEQbTJ(coinType);
    }

    public static /* synthetic */ void setDigitalByCoinType$default(C34745niJ c34745niJ, CoinType coinType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        c34745niJ.OLrzqt(coinType, str, str2);
    }

    public final void OLrzqt(@NotNull CoinType coinType, java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(coinType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strDjBIcL = (str == null || str.length() == 0) ? djBIcL(coinType) : str;
        FiatCryptoCoinBean fiatCryptoCoinBeanCopydefault = copydefault(coinType, str, str2);
        if (fiatCryptoCoinBeanCopydefault != null) {
            AEQbTJ(coinType, fiatCryptoCoinBeanCopydefault);
            return;
        }
        if (valueOf(coinType)) {
            FiatCryptoCoinBean fiatCryptoCoinBeanCopydefault2 = copydefault(coinType, strDjBIcL, KWHzl(coinType));
            if (fiatCryptoCoinBeanCopydefault2 != null) {
                AEQbTJ(coinType, fiatCryptoCoinBeanCopydefault2);
                return;
            }
            FiatCryptoCoinBean fiatCryptoCoinBeanAEQbTJ = AEQbTJ(coinType, strDjBIcL);
            if (fiatCryptoCoinBeanAEQbTJ != null) {
                AEQbTJ.AEQbTJ(coinType, fiatCryptoCoinBeanAEQbTJ);
                return;
            }
            return;
        }
        FiatCryptoCoinBean fiatCryptoCoinBeanAEQbTJ2 = AEQbTJ(coinType, strDjBIcL);
        if (fiatCryptoCoinBeanAEQbTJ2 != null) {
            AEQbTJ.AEQbTJ(coinType, fiatCryptoCoinBeanAEQbTJ2);
        }
    }

    public final void AEQbTJ(FiatCryptoCoinBean fiatCryptoCoinBean) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) fiatCryptoCoinBean.getCurrency())) {
            copydefault.setLegal(fiatCryptoCoinBean);
        }
    }

    public final void copydefault(FiatCryptoCoinBean fiatCryptoCoinBean) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) fiatCryptoCoinBean.getCurrency())) {
            copydefault.setDigital(fiatCryptoCoinBean);
        }
    }

    public final void KWHzl(FiatCryptoCoinBean fiatCryptoCoinBean) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) fiatCryptoCoinBean.getCurrency())) {
            EZpvd.setLegal(fiatCryptoCoinBean);
        }
    }

    public final void OLrzqt(FiatCryptoCoinBean fiatCryptoCoinBean) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) fiatCryptoCoinBean.getCurrency())) {
            EZpvd.setDigital(fiatCryptoCoinBean);
        }
    }

    public final void EZpvd(@NotNull CoinType coinType, @NotNull FiatCryptoCoinBean fiatCryptoCoinBean) {
        Intrinsics.checkNotNullParameter(coinType, "");
        Intrinsics.checkNotNullParameter(fiatCryptoCoinBean, "");
        int i = StateListAnimator.copydefault[coinType.ordinal()];
        if (i == 1) {
            AEQbTJ(fiatCryptoCoinBean);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            KWHzl(fiatCryptoCoinBean);
        }
    }

    public final void AEQbTJ(CoinType coinType, FiatCryptoCoinBean fiatCryptoCoinBean) {
        int i = StateListAnimator.copydefault[coinType.ordinal()];
        if (i == 1) {
            copydefault(fiatCryptoCoinBean);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            OLrzqt(fiatCryptoCoinBean);
        }
    }

    public final FiatCryptoCoinBean OLrzqt(@NotNull CoinType coinType, java.lang.String str) {
        Intrinsics.checkNotNullParameter(coinType, "");
        java.util.ArrayList<FiatCryptoCoinBean> arrayListOLrzqt = C34746niK.OLrzqt.OLrzqt(coinType);
        java.lang.Object obj = null;
        if (arrayListOLrzqt == null) {
            return null;
        }
        java.util.Iterator<T> it = arrayListOLrzqt.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (C59449zhJ.gEmmrt(((FiatCryptoCoinBean) next).getCurrency(), str, true)) {
                obj = next;
                break;
            }
        }
        return (FiatCryptoCoinBean) obj;
    }

    public final FiatCryptoCoinBean copydefault(@NotNull CoinType coinType, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(coinType, "");
        java.util.ArrayList<FiatCryptoCoinBean> arrayListAEQbTJ = C34746niK.OLrzqt.AEQbTJ(coinType, str);
        java.lang.Object obj = null;
        if (arrayListAEQbTJ == null) {
            return null;
        }
        java.util.Iterator<T> it = arrayListAEQbTJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (C59449zhJ.gEmmrt(((FiatCryptoCoinBean) next).getCurrency(), str2, true)) {
                obj = next;
                break;
            }
        }
        return (FiatCryptoCoinBean) obj;
    }

    public final FiatCryptoCoinBean copydefault(@NotNull CoinType coinType) {
        Intrinsics.checkNotNullParameter(coinType, "");
        FiatCryptoCoinBean fiatCryptoCoinBeanOLrzqt = OLrzqt(coinType, C34744niI.OLrzqt.KWHzl());
        java.util.ArrayList<FiatCryptoCoinBean> arrayListOLrzqt = C34746niK.OLrzqt.OLrzqt(coinType);
        if (fiatCryptoCoinBeanOLrzqt != null) {
            return fiatCryptoCoinBeanOLrzqt;
        }
        FiatCryptoCoinBean fiatCryptoCoinBeanOLrzqt2 = OLrzqt(coinType, "USD");
        if (fiatCryptoCoinBeanOLrzqt2 != null) {
            return fiatCryptoCoinBeanOLrzqt2;
        }
        if (arrayListOLrzqt != null) {
            return (FiatCryptoCoinBean) CollectionsKt___CollectionsKt.firstOrNull(arrayListOLrzqt);
        }
        return null;
    }

    public final FiatCryptoCoinBean AEQbTJ(CoinType coinType, java.lang.String str) {
        java.util.ArrayList<FiatCryptoCoinBean> arrayListAEQbTJ = C34746niK.OLrzqt.AEQbTJ(coinType, str);
        if (!C33129mqd.KWHzl((java.util.Collection) arrayListAEQbTJ)) {
            return null;
        }
        Intrinsics.copydefault(arrayListAEQbTJ);
        return arrayListAEQbTJ.get(0);
    }
}
