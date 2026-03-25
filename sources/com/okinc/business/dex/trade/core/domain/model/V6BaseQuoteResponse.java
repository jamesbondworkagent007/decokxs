package com.okinc.business.dex.trade.core.domain.model;

import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C31212lpk;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface V6BaseQuoteResponse extends Parcelable {
    AutoSlippageInfo autoSlippageInfo();

    boolean deFiPlatformNotAvailableAnymore(@NotNull String str);

    CommonDexInfo getCommonDexInfo();

    List<DefiPlatformInfo> getDefiPlatformInfoList();

    NetworkFeeInfo getNetworkFeeInfo();

    DefiPlatformInfo getSelectedDeFiPlatform();

    String getSelectedDeFiPlatformId();

    boolean isAutoConfirmQuotaRemaining();

    boolean isBlackAddressErrorCode();

    boolean isHoneypotErrorCode();

    boolean isOKXPlatform();

    boolean isOkxDexNotAvailableAnymore();

    boolean isQuoteAmountNotEmpty();

    boolean isSingle();

    String receiveAmount();

    void setLocalSelectedDeFiPlatformId(@NotNull String str);

    boolean showValueDiffWarn();

    public static final class Application {
        public static boolean OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
            CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
            String remainingQuota = commonDexInfo != null ? commonDexInfo.getRemainingQuota() : null;
            if (remainingQuota != null && remainingQuota.length() != 0) {
                CommonDexInfo commonDexInfo2 = v6BaseQuoteResponse.getCommonDexInfo();
                String remainingQuota2 = commonDexInfo2 != null ? commonDexInfo2.getRemainingQuota() : null;
                CommonDexInfo commonDexInfo3 = v6BaseQuoteResponse.getCommonDexInfo();
                if (!C33129mqd.copydefault(remainingQuota2, commonDexInfo3 != null ? commonDexInfo3.getFromTokenAmount() : null)) {
                    return false;
                }
            }
            return true;
        }

        public static DefiPlatformInfo AEQbTJ(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
            Object next;
            List<DefiPlatformInfo> defiPlatformInfoList = v6BaseQuoteResponse.getDefiPlatformInfoList();
            if (defiPlatformInfoList != null) {
                Iterator<T> it = defiPlatformInfoList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((DefiPlatformInfo) next).getDefiPlatformId(), (Object) v6BaseQuoteResponse.getSelectedDeFiPlatformId())) {
                        break;
                    }
                }
                DefiPlatformInfo defiPlatformInfo = (DefiPlatformInfo) next;
                if (defiPlatformInfo != null) {
                    return defiPlatformInfo;
                }
            }
            List<DefiPlatformInfo> defiPlatformInfoList2 = v6BaseQuoteResponse.getDefiPlatformInfoList();
            if (defiPlatformInfoList2 != null) {
                return (DefiPlatformInfo) CollectionsKt___CollectionsKt.firstOrNull(defiPlatformInfoList2);
            }
            return null;
        }

        public static String djBIcL(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
            DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
            String receiveAmount = selectedDeFiPlatform != null ? selectedDeFiPlatform.getReceiveAmount() : null;
            return receiveAmount == null ? "" : receiveAmount;
        }

        public static boolean gEmmrt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
            return C33129mqd.OLrzqt((CharSequence) v6BaseQuoteResponse.receiveAmount());
        }

        public static boolean valueOf(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
            DexMultiTokenInfoBean toToken;
            DexMultiTokenInfoBean fromToken;
            CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
            String chainId = null;
            String chainId2 = (commonDexInfo == null || (fromToken = commonDexInfo.getFromToken()) == null) ? null : fromToken.getChainId();
            CommonDexInfo commonDexInfo2 = v6BaseQuoteResponse.getCommonDexInfo();
            if (commonDexInfo2 != null && (toToken = commonDexInfo2.getToToken()) != null) {
                chainId = toToken.getChainId();
            }
            return Intrinsics.EZpvd((Object) chainId2, (Object) chainId);
        }

        public static boolean isConnected(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
            DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
            if (selectedDeFiPlatform != null) {
                return selectedDeFiPlatform.getShowValueDiffWarn();
            }
            return false;
        }

        public static AutoSlippageInfo copydefault(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
            DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
            if (selectedDeFiPlatform != null) {
                return selectedDeFiPlatform.getAutoSlippageInfo();
            }
            return null;
        }

        public static boolean EZpvd(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
            C31212lpk c31212lpk = C31212lpk.copydefault;
            CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
            return c31212lpk.OLrzqt(C33129mqd.AhwBna(commonDexInfo != null ? commonDexInfo.getCode() : null));
        }

        public static boolean AhwBna(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
            return v6BaseQuoteResponse.deFiPlatformNotAvailableAnymore("11");
        }

        public static boolean KWHzl(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            List<DefiPlatformInfo> defiPlatformInfoList = v6BaseQuoteResponse.getDefiPlatformInfoList();
            Object obj = null;
            if (defiPlatformInfoList != null) {
                Iterator<T> it = defiPlatformInfoList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (Intrinsics.EZpvd((Object) ((DefiPlatformInfo) next).getDefiPlatformId(), (Object) str)) {
                        obj = next;
                        break;
                    }
                }
                obj = (DefiPlatformInfo) obj;
            }
            return obj == null;
        }

        public static boolean KWHzl(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
            C31212lpk c31212lpk = C31212lpk.copydefault;
            CommonDexInfo commonDexInfo = v6BaseQuoteResponse.getCommonDexInfo();
            return c31212lpk.EZpvd(C33129mqd.AhwBna(commonDexInfo != null ? commonDexInfo.getCode() : null));
        }

        public static boolean AYXKKw(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
            DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
            return Intrinsics.EZpvd((Object) (selectedDeFiPlatform != null ? selectedDeFiPlatform.getDefiPlatformId() : null), (Object) "11");
        }
    }
}
