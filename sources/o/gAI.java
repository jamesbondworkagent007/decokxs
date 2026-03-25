package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.res.ResourcesCompat;
import com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import o.eKF;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes5.dex */
public final class gAI {
    public final java.lang.String AEQbTJ(long j) {
        return pTA.formatSimpleDate$default(new Date(j), null, 1, null);
    }

    public final long KWHzl(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[PHI: r2 r3 r4
  0x00a7: PHI (r2v20 java.lang.String) = (r2v17 java.lang.String), (r2v47 java.lang.String) binds: [B:186:0x059e, B:33:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x00a7: PHI (r3v14 int) = (r3v12 int), (r3v49 int) binds: [B:186:0x059e, B:33:0x00a3] A[DONT_GENERATE, DONT_INLINE]
  0x00a7: PHI (r4v22 java.lang.String) = (r4v20 java.lang.String), (r4v49 java.lang.String) binds: [B:186:0x059e, B:33:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, @NotNull yHO<? super java.lang.Integer, ? super java.lang.String, ? super java.lang.String, Unit> yho) {
        java.lang.String str;
        int i;
        java.lang.String strAYXKKw;
        java.lang.String strCopydefault;
        int i2;
        java.lang.String strAYXKKw2;
        java.lang.String strAEQbTJ;
        java.lang.String strValueOf;
        java.lang.String strCopydefault2;
        java.lang.String strAYXKKw3;
        java.lang.String strAEQbTJ2;
        str = "";
        Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
        Intrinsics.checkNotNullParameter(yho, "");
        int txType = coinAndAddressHistoryDetail.getTxType();
        if (txType != 65) {
            if (txType == 87) {
                i = C13754dXa.Activity.OxVOHk;
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.access001);
                java.lang.String strAYXKKw4 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.initViewTreeOwners);
                C14079deg c14079deg = C14079deg.EZpvd;
                C15487eKd c15487eKd = C15487eKd.AEQbTJ;
                java.lang.String walletId = coinAndAddressHistoryDetail.getWalletId();
                if (walletId == null) {
                    walletId = "";
                }
                strCopydefault = strAYXKKw4 + C14079deg.getAddressStr$default(c14079deg, c15487eKd.KWHzl(walletId, coinAndAddressHistoryDetail.getTxType(), coinAndAddressHistoryDetail.getMainCoinId(), coinAndAddressHistoryDetail.getFrom(), true, false), false, 2, null);
            } else {
                if (txType == 73) {
                    i2 = C13754dXa.Activity.QVsKAR;
                    strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.heceqZ);
                    if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                        strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                    } else {
                        strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                    }
                } else {
                    if (txType == 74) {
                        i2 = C13754dXa.Activity.UlJrfe;
                        strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambdanew1);
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                            strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                        } else {
                            strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                        }
                    } else if (txType == 84) {
                        i = C13754dXa.Activity.OxVOHk;
                        strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.createFullyDrawnExecutor);
                        java.lang.String strAYXKKw5 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.initViewTreeOwners);
                        C14079deg c14079deg2 = C14079deg.EZpvd;
                        C15487eKd c15487eKd2 = C15487eKd.AEQbTJ;
                        java.lang.String walletId2 = coinAndAddressHistoryDetail.getWalletId();
                        if (walletId2 == null) {
                            walletId2 = "";
                        }
                        strCopydefault = strAYXKKw5 + C14079deg.getAddressStr$default(c14079deg2, c15487eKd2.KWHzl(walletId2, coinAndAddressHistoryDetail.getTxType(), coinAndAddressHistoryDetail.getMainCoinId(), coinAndAddressHistoryDetail.getFrom(), true, false), false, 2, null);
                    } else if (txType != 85) {
                        switch (txType) {
                            case 1:
                                break;
                            case 2:
                                i = C13754dXa.Activity.QwvEab;
                                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambdanew2);
                                java.lang.String okexAccount = coinAndAddressHistoryDetail.getOkexAccount();
                                if (okexAccount == null || okexAccount.length() == 0) {
                                    C14079deg c14079deg3 = C14079deg.EZpvd;
                                    C15487eKd c15487eKd3 = C15487eKd.AEQbTJ;
                                    java.lang.String walletId3 = coinAndAddressHistoryDetail.getWalletId();
                                    if (walletId3 == null) {
                                        walletId3 = "";
                                    }
                                    strValueOf = java.lang.String.valueOf(C14079deg.getAddressStr$default(c14079deg3, c15487eKd3.KWHzl(walletId3, coinAndAddressHistoryDetail.getTxType(), coinAndAddressHistoryDetail.getMainCoinId(), coinAndAddressHistoryDetail.getTo(), false, (32 & 32) != 0), false, 2, null));
                                } else {
                                    strValueOf = java.lang.String.valueOf(coinAndAddressHistoryDetail.getOkexAccount());
                                }
                                if ((C33129mqd.OLrzqt((java.lang.CharSequence) strValueOf) ? strValueOf : null) != null && (strCopydefault2 = C33069mpW.copydefault(C13754dXa.FragmentManager.onScrollStateChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, strValueOf)))) != null) {
                                    str = strCopydefault2;
                                }
                                strCopydefault = str;
                                break;
                            case 3:
                                i2 = C13754dXa.Activity.QSLkRj;
                                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivity);
                                if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                    strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                } else {
                                    strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                }
                                break;
                            case 4:
                                i2 = C13754dXa.Activity.ODXsMY;
                                strAYXKKw2 = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.r8lambdah2i_RK2mddCIbAsGubaI4eL8_cU), C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", coinAndAddressHistoryDetail.getCoinSymbol())));
                                if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                    strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                } else {
                                    strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                }
                                break;
                            case 5:
                                i2 = C13754dXa.Activity.UlJrfe;
                                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambdanew1);
                                if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                    strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                } else {
                                    strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                }
                                break;
                            case 6:
                                i2 = C13754dXa.Activity.ODXsMY;
                                strAYXKKw2 = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.r8lambdahrfbBpVkizzQbtGmrw6DTx0hH1A), C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", coinAndAddressHistoryDetail.getCoinSymbol())));
                                if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                    strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                } else {
                                    strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                }
                                break;
                            case 7:
                                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(coinAndAddressHistoryDetail.getCoinId());
                                int i3 = C13754dXa.Activity.QCjLjM;
                                if (c10854bwMKWHzl != null && c10854bwMKWHzl.DCUTEIdCUTEI()) {
                                    int i4 = C13754dXa.FragmentManager.getActivityResultRegistry;
                                    java.lang.String strDjBIcL = c10854bwMKWHzl.djBIcL();
                                    strAYXKKw3 = C33069mpW.copydefault(i4, C56423yEv.EZpvd(C56390yDp.OLrzqt("net", strDjBIcL != null ? strDjBIcL : "")));
                                    strAEQbTJ2 = C14079deg.getAddressStr$default(C14079deg.EZpvd, coinAndAddressHistoryDetail.getFrom(), false, 2, null);
                                } else {
                                    strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDrawerArrowDrawable);
                                    if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                        strAEQbTJ2 = coinAndAddressHistoryDetail.getContractName();
                                    } else {
                                        strAEQbTJ2 = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                    }
                                }
                                strAYXKKw2 = strAYXKKw3;
                                strCopydefault = strAEQbTJ2;
                                i2 = i3;
                                break;
                            case 8:
                                i2 = C13754dXa.Activity.OxVOHk;
                                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getCREATORannotations);
                                strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.initViewTreeOwners) + coinAndAddressHistoryDetail.getOkexAccount();
                                break;
                            case 9:
                                i = C13754dXa.Activity.QwvEab;
                                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setMediaTypeactivity_release);
                                int i5 = C13754dXa.FragmentManager.onScrollStateChanged;
                                java.lang.String okexAccount2 = coinAndAddressHistoryDetail.getOkexAccount();
                                strCopydefault = C33069mpW.copydefault(i5, C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, okexAccount2 != null ? okexAccount2 : "")));
                                break;
                            case 10:
                                i2 = C13754dXa.Activity.OxVOHk;
                                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.putString);
                                strCopydefault = C33070mpX.AYXKKw(C13754dXa.FragmentManager.putRating) + pTB.formatLocalized$default(coinAndAddressHistoryDetail.getPayAmount(), null, 1, null) + coinAndAddressHistoryDetail.getPayCurrency();
                                break;
                            case 11:
                                i2 = C13754dXa.Activity.QCjLjM;
                                C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(coinAndAddressHistoryDetail.getCoinId());
                                if (c10854bwMKWHzl2 != null && c10854bwMKWHzl2.hCLrkq()) {
                                    strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKtviewModelsfactoryPromise1);
                                } else {
                                    strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getDefaultViewModelProviderFactory);
                                }
                                strCopydefault = C14079deg.getAddressStr$default(C14079deg.EZpvd, coinAndAddressHistoryDetail.getFrom(), false, 2, null);
                                break;
                            case 12:
                                i = C13754dXa.Activity.QCjLjM;
                                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.invoke);
                                C14079deg c14079deg4 = C14079deg.EZpvd;
                                C15487eKd c15487eKd4 = C15487eKd.AEQbTJ;
                                java.lang.String walletId4 = coinAndAddressHistoryDetail.getWalletId();
                                if (walletId4 == null) {
                                    walletId4 = "";
                                }
                                java.lang.String addressStr$default = C14079deg.getAddressStr$default(c14079deg4, c15487eKd4.KWHzl(walletId4, coinAndAddressHistoryDetail.getTxType(), coinAndAddressHistoryDetail.getMainCoinId(), coinAndAddressHistoryDetail.getTo(), false, (32 & 32) != 0), false, 2, null);
                                if ((C33129mqd.OLrzqt((java.lang.CharSequence) addressStr$default) ? addressStr$default : null) != null && (strCopydefault2 = C33069mpW.copydefault(C13754dXa.FragmentManager.onScrollStateChanged, C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, addressStr$default)))) != null) {
                                }
                                strCopydefault = str;
                                break;
                            default:
                                switch (txType) {
                                    case 22:
                                        i2 = C13754dXa.Activity.UlJrfe;
                                        strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambdanew1);
                                        if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                            strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                        } else {
                                            strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                        }
                                        break;
                                    case 23:
                                        i2 = C13754dXa.Activity.UlJrfe;
                                        strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambdanew1);
                                        if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                            strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                        } else {
                                            strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                        }
                                        break;
                                    case 24:
                                        i2 = C13754dXa.Activity.OJuSTm;
                                        strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setPipParamsSourceRectHint);
                                        if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                            strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                        } else {
                                            strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                        }
                                        break;
                                    default:
                                        switch (txType) {
                                            case 30:
                                            case 33:
                                                i2 = C13754dXa.Activity.DLWbHP;
                                                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.zAEkPU);
                                                if (coinAndAddressHistoryDetail.getTxType() == 33) {
                                                    strCopydefault = C14079deg.EZpvd.copydefault(coinAndAddressHistoryDetail.getPoolId());
                                                } else if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                                    strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                                } else {
                                                    strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                                }
                                                break;
                                            case 31:
                                            case 34:
                                                i2 = C13754dXa.Activity.OFhtUX;
                                                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.zKcAg);
                                                if (coinAndAddressHistoryDetail.getTxType() == 34) {
                                                    strCopydefault = C14079deg.EZpvd.copydefault(coinAndAddressHistoryDetail.getPoolId());
                                                } else if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                                    strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                                } else {
                                                    strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                                }
                                                break;
                                            case 32:
                                            case 35:
                                                i2 = C13754dXa.Activity.OFhtUX;
                                                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.tIwhY);
                                                if (coinAndAddressHistoryDetail.getTxType() == 35) {
                                                    strCopydefault = C14079deg.EZpvd.copydefault(coinAndAddressHistoryDetail.getPoolId());
                                                } else if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                                    strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                                } else {
                                                    strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                                }
                                                break;
                                            default:
                                                switch (txType) {
                                                    case 40:
                                                        i2 = C13754dXa.Activity.UlJrfe;
                                                        strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getFullyDrawnReporter);
                                                        if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                                            strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                                        } else {
                                                            strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                                        }
                                                        break;
                                                    case 41:
                                                        i2 = C13754dXa.Activity.hBpjJd;
                                                        strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplApi28ExternalSyntheticApiModelOutline0);
                                                        if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                                            strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                                        } else {
                                                            strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                                        }
                                                        break;
                                                    case 42:
                                                        i2 = C13754dXa.Activity.UlJrfe;
                                                        strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.isAttachedToWindow);
                                                        if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                                            strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                                        } else {
                                                            strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                                        }
                                                        break;
                                                    case 43:
                                                        i2 = C13754dXa.Activity.OxVOHk;
                                                        strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0);
                                                        if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                                            strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                                        } else {
                                                            strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                                        }
                                                        break;
                                                    case 44:
                                                        i2 = C13754dXa.Activity.QwvEab;
                                                        strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.Cancellable);
                                                        if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                                            strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                                        } else {
                                                            strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                                        }
                                                        break;
                                                    case 45:
                                                        i2 = C13754dXa.Activity.USBtdM;
                                                        strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambdanew0);
                                                        if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                                            strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                                        } else {
                                                            strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                                        }
                                                        break;
                                                    default:
                                                        switch (txType) {
                                                            case 50:
                                                                break;
                                                            case 51:
                                                                i2 = C13754dXa.Activity.QVsKAR;
                                                                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.RatingCompatStarStyle);
                                                                if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                                                    strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                                                } else {
                                                                    strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                                                }
                                                                break;
                                                            case 52:
                                                                break;
                                                            case 53:
                                                                break;
                                                            case 54:
                                                                break;
                                                            default:
                                                                switch (txType) {
                                                                    case 56:
                                                                        break;
                                                                    case 57:
                                                                        break;
                                                                    case 58:
                                                                        break;
                                                                    case 59:
                                                                        break;
                                                                    case 60:
                                                                    case 61:
                                                                    case 62:
                                                                        break;
                                                                    default:
                                                                        switch (txType) {
                                                                            case 80:
                                                                                i2 = C13754dXa.Activity.QSLkRj;
                                                                                strAYXKKw2 = coinAndAddressHistoryDetail.getKysTxTypeText();
                                                                                java.lang.String strAYXKKw6 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivity);
                                                                                if (strAYXKKw2 == null || strAYXKKw2.length() == 0) {
                                                                                    strAYXKKw2 = strAYXKKw6;
                                                                                }
                                                                                if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                                                                    strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                                                                } else {
                                                                                    strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                                                                }
                                                                                break;
                                                                            case 81:
                                                                                i2 = C13754dXa.Activity.dxcTrN;
                                                                                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getViewModelStore);
                                                                                if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                                                                    strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                                                                } else {
                                                                                    strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                                                                }
                                                                                break;
                                                                            case 82:
                                                                                i2 = C13754dXa.Activity.djSkpj;
                                                                                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.onConfigurationChanged);
                                                                                break;
                                                                            default:
                                                                                i2 = C13754dXa.Activity.QSLkRj;
                                                                                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivity);
                                                                                if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                                                                    strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                                                                } else {
                                                                                    strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                                                                }
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                        break;
                                                }
                                            case 36:
                                                i2 = C13754dXa.Activity.OJuSTm;
                                                int txType2 = coinAndAddressHistoryDetail.getTxType();
                                                if (txType2 == 36) {
                                                    strCopydefault = C14079deg.EZpvd.copydefault(coinAndAddressHistoryDetail.getPoolId());
                                                    strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.iPSTqm);
                                                } else if (txType2 == 60 || txType2 == 61) {
                                                    strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.RatingCompatStarStyle);
                                                    if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                                        strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                                    } else {
                                                        strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                                    }
                                                } else {
                                                    strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.onCaptioningEnabledChanged);
                                                    if (C33129mqd.OLrzqt((java.lang.CharSequence) coinAndAddressHistoryDetail.getContractName())) {
                                                        strAEQbTJ = coinAndAddressHistoryDetail.getContractName();
                                                    } else {
                                                        strAEQbTJ = C14079deg.EZpvd.AEQbTJ(coinAndAddressHistoryDetail.getContractAddress(), true);
                                                    }
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    }
                    yho.invoke(java.lang.Integer.valueOf(i2), strAYXKKw2, strCopydefault);
                }
                strCopydefault = strAEQbTJ;
                yho.invoke(java.lang.Integer.valueOf(i2), strAYXKKw2, strCopydefault);
            }
        } else {
            i = C13754dXa.Activity.OxVOHk;
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getRatingStyle);
            java.lang.String strAYXKKw7 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.initViewTreeOwners);
            C15487eKd c15487eKd5 = C15487eKd.AEQbTJ;
            java.lang.String walletId5 = coinAndAddressHistoryDetail.getWalletId();
            if (walletId5 == null) {
                walletId5 = "";
            }
            strCopydefault = strAYXKKw7 + " " + c15487eKd5.KWHzl(walletId5, coinAndAddressHistoryDetail.getTxType(), coinAndAddressHistoryDetail.getMainCoinId(), coinAndAddressHistoryDetail.getFrom(), true, false);
        }
        i2 = i;
        strAYXKKw2 = strAYXKKw;
        yho.invoke(java.lang.Integer.valueOf(i2), strAYXKKw2, strCopydefault);
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.widget.ImageView AEQbTJ;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, android.widget.ImageView imageView, int i) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = imageView;
            this.KWHzl = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C55326xho.toast$default(this.AEQbTJ.getContext().getString(this.KWHzl), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        }
    }

    public final void KWHzl(@NotNull CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, boolean z, @NotNull C15503eKt c15503eKt) {
        java.lang.String str;
        int iCopydefault;
        Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
        Intrinsics.checkNotNullParameter(c15503eKt, "");
        if (C33129mqd.OLrzqt(coinAndAddressHistoryDetail.getCoinAmountNum(), "0") && coinAndAddressHistoryDetail.getTxType() != 1 && coinAndAddressHistoryDetail.getTxType() != 2 && coinAndAddressHistoryDetail.getTxType() != 12 && coinAndAddressHistoryDetail.getTxType() != 53 && coinAndAddressHistoryDetail.getTxType() != 54 && coinAndAddressHistoryDetail.getTxType() != 51 && coinAndAddressHistoryDetail.getTxType() != 58 && coinAndAddressHistoryDetail.getTxType() != 50 && coinAndAddressHistoryDetail.getTxType() != 52 && coinAndAddressHistoryDetail.getTxType() != 8 && coinAndAddressHistoryDetail.getTxType() != 9 && coinAndAddressHistoryDetail.getTxType() != 10 && coinAndAddressHistoryDetail.getTxType() != 60 && coinAndAddressHistoryDetail.getTxType() != 61 && coinAndAddressHistoryDetail.getTxType() != 62) {
            C15503eKt.setText$default(c15503eKt, "", "", "", false, 8, null);
            return;
        }
        c15503eKt.setTextSize(16.0f);
        java.lang.String direction = coinAndAddressHistoryDetail.getDirection();
        if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "1")) {
            str = Marker.ANY_NON_NULL_MARKER;
        } else {
            str = Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "2") ? "-" : "";
        }
        boolean z2 = !C13912dbY.copydefault.djBIcL();
        if (z2) {
            C15503eKt.setText$default(c15503eKt, C13821dZn.EZpvd.OLrzqt(""), "", "", false, 8, null);
        } else {
            c15503eKt.setAutoSizeTextTypeFixWithConfiguration(12.0f, 16.0f, 2);
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(coinAndAddressHistoryDetail.getCoinId()));
            C15503eKt.setText$default(c15503eKt, str + C54870xYj.EZpvd(coinAndAddressHistoryDetail.getCoinAmountNum(), coinAndAddressHistoryDetail.getDecimalNum(), c10854bwMKWHzl != null ? c10854bwMKWHzl.AkhnZx() : 6, null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null), " ", coinAndAddressHistoryDetail.getCoinSymbol(), false, 8, null);
        }
        if (!z2 && z) {
            if (Intrinsics.EZpvd((java.lang.Object) coinAndAddressHistoryDetail.getDirection(), (java.lang.Object) "1")) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context context = c15503eKt.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                iCopydefault = C33512mxp.tradeRiseDefault$default(c33512mxp, context, 0.0f, 2, null);
            } else {
                iCopydefault = Intrinsics.EZpvd((java.lang.Object) coinAndAddressHistoryDetail.getDirection(), (java.lang.Object) "2") ? C33070mpX.copydefault(C52761wXj.Activity.fdOvFl) : C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            }
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        }
        c15503eKt.setTextColor(iCopydefault);
    }

    public final void copydefault(@NotNull CoinAndAddressHistoryDetail coinAndAddressHistoryDetail, @NotNull android.widget.TextView textView) {
        java.lang.String ordinalNftName;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(coinAndAddressHistoryDetail, "");
        Intrinsics.checkNotNullParameter(textView, "");
        if (coinAndAddressHistoryDetail.getTxType() == 65) {
            textView.setVisibility(0);
            java.lang.String direction = coinAndAddressHistoryDetail.getDirection();
            if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "1")) {
                str = "-";
            } else if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "2")) {
                str = Marker.ANY_NON_NULL_MARKER;
            }
            eKF.Activity activity = new eKF.Activity(14, C33070mpX.copydefault(C52761wXj.Activity.QwvEab), MS.copydefault(textView.getContext(), 16), C52761wXj.Dialog.KWHzl);
            textView.setTextSize(activity.EZpvd());
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = activity.OLrzqt();
            }
            textView.setTextColor(activity.copydefault());
            textView.setTypeface(ResourcesCompat.getFont(textView.getContext(), activity.AEQbTJ()));
            textView.setText(str + coinAndAddressHistoryDetail.getPayAmount() + " " + coinAndAddressHistoryDetail.getPayCurrency());
            return;
        }
        if (C33129mqd.valueOf(coinAndAddressHistoryDetail.getOrdinalNftAmount(), "0") || coinAndAddressHistoryDetail.getOrdinalNftDirection() == null || (ordinalNftName = coinAndAddressHistoryDetail.getOrdinalNftName()) == null || ordinalNftName.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        java.lang.Integer ordinalNftDirection = coinAndAddressHistoryDetail.getOrdinalNftDirection();
        if (ordinalNftDirection != null && ordinalNftDirection.intValue() == 1) {
            str = Marker.ANY_NON_NULL_MARKER;
        } else if (ordinalNftDirection != null && ordinalNftDirection.intValue() == 2) {
            str = "-";
        }
        if (!C13912dbY.copydefault.djBIcL()) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(str + coinAndAddressHistoryDetail.getOrdinalNftAmount() + " " + coinAndAddressHistoryDetail.getOrdinalNftName());
    }

    public final void EZpvd(@NotNull AppCompatImageView appCompatImageView, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(appCompatImageView, "");
        Intrinsics.checkNotNullParameter(str, "");
        C57304yfr.copydefault.copydefault(appCompatImageView, 8, 8, 8, 8);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "")) {
            appCompatImageView.setVisibility(8);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "phishing")) {
            AEQbTJ(appCompatImageView, C52761wXj.TaskDescription.zFZsbn, C13754dXa.FragmentManager.setSupportProgressBarIndeterminate);
        } else {
            AEQbTJ(appCompatImageView, C52761wXj.TaskDescription.ZpNRhN, C13754dXa.FragmentManager.setSupportProgress);
        }
    }

    public final void AEQbTJ(android.widget.ImageView imageView, int i, int i2) {
        imageView.setVisibility(0);
        imageView.setImageResource(i);
        imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, imageView, i2));
    }
}
