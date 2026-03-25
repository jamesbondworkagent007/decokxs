package com.okinc.business.defi.share.bean;

import com.okinc.business.defi.share.bean.Web3ShareLinkInfo;
import com.okinc.wallet.api.WalletReferralSource;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import o.dTJ;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Web3ShareModel {
    private String deepLink;
    private Map<String, String> linkQueryParams;
    private String modelId;
    public Web3ShareType shareType;
    private WalletReferralSource source;
    private String webUrl;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;
    private String shareFrom = "";
    private String accountId = "";
    private List<? extends Web3ShareBaseInfo> shareInfoList = yDY.AhwBna();
    private String luaAppID = "okluanft";
    private String luaPageUrl = "/nftRouter";
    private String luaRootVC = "NFTShareDispatcher";
    private String referralCode = "";
    private String discountRate = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeepLink() {
        return this.deepLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscountRate() {
        return this.discountRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getLinkQueryParams() {
        return this.linkQueryParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLuaAppID() {
        return this.luaAppID;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLuaPageUrl() {
        return this.luaPageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLuaRootVC() {
        return this.luaRootVC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModelId() {
        return this.modelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferralCode() {
        return this.referralCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShareFrom() {
        return this.shareFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.okinc.business.defi.share.bean.Web3ShareBaseInfo>, java.util.List<com.okinc.business.defi.share.bean.Web3ShareBaseInfo> */
    public final List<Web3ShareBaseInfo> getShareInfoList() {
        return this.shareInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletReferralSource getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWebUrl() {
        return this.webUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(String str) {
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDeepLink(String str) {
        this.deepLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDiscountRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.discountRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLinkQueryParams(Map<String, String> map) {
        this.linkQueryParams = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLuaAppID(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.luaAppID = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLuaPageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.luaPageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLuaRootVC(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.luaRootVC = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModelId(String str) {
        this.modelId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReferralCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.referralCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.shareFrom = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareInfoList(@NotNull List<? extends Web3ShareBaseInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.shareInfoList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShareType(@NotNull Web3ShareType web3ShareType) {
        Intrinsics.checkNotNullParameter(web3ShareType, "");
        this.shareType = web3ShareType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(WalletReferralSource walletReferralSource) {
        this.source = walletReferralSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWebUrl(String str) {
        this.webUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setupLuaInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.luaAppID = str;
        this.luaPageUrl = str2;
        this.luaRootVC = str3;
    }

    public final Web3ShareType getShareType() {
        Web3ShareType web3ShareType = this.shareType;
        if (web3ShareType != null) {
            return web3ShareType;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.share.bean.Web3ShareModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final Web3ShareModel KWHzl(String str, Map<String, String> map, @NotNull String str2, @NotNull Web3ShareImageInfo web3ShareImageInfo, @NotNull String str3, WalletReferralSource walletReferralSource) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(web3ShareImageInfo, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return EZpvd(str, null, null, map, str2, C56402yEa.EZpvd(web3ShareImageInfo), Web3ShareType.SHARE_IMAGE, str3, walletReferralSource);
        }

        public final Web3ShareModel copydefault(String str, Map<String, String> map, @NotNull String str2, @NotNull List<Web3ShareImageInfo> list, @NotNull String str3, WalletReferralSource walletReferralSource) {
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return EZpvd(str, null, null, map, str2, list, Web3ShareType.SHARE_IMAGE, str3, walletReferralSource);
        }

        public final Web3ShareModel OLrzqt(@NotNull String str, String str2, @NotNull String str3, @NotNull Web3ShareImageInfo web3ShareImageInfo, String str4, WalletReferralSource walletReferralSource) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(web3ShareImageInfo, "");
            return EZpvd(null, str, str2, null, str3, C56402yEa.EZpvd(web3ShareImageInfo), Web3ShareType.SHARE_IMAGE, str4, walletReferralSource);
        }

        public static /* synthetic */ Web3ShareModel createShareMultiImageByWebUrl$default(Application application, String str, String str2, String str3, List list, String str4, WalletReferralSource walletReferralSource, int i, Object obj) {
            if ((i & 32) != 0) {
                walletReferralSource = null;
            }
            return application.OLrzqt(str, str2, str3, (List<Web3ShareImageInfo>) list, str4, walletReferralSource);
        }

        public final Web3ShareModel OLrzqt(@NotNull String str, String str2, @NotNull String str3, @NotNull List<Web3ShareImageInfo> list, @NotNull String str4, WalletReferralSource walletReferralSource) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return EZpvd(null, str, str2, null, str3, list, Web3ShareType.SHARE_IMAGE, str4, walletReferralSource);
        }

        public final Web3ShareModel EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, Web3ShareLinkInfo web3ShareLinkInfo, @NotNull String str4, WalletReferralSource walletReferralSource) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return EZpvd(null, str, str2, null, str3, C56402yEa.EZpvd(web3ShareLinkInfo == null ? Web3ShareLinkInfo.Activity.create$default(Web3ShareLinkInfo.Companion, null, 1, null) : web3ShareLinkInfo), Web3ShareType.SHARE_WEBPAGE, str4, walletReferralSource);
        }

        public final Web3ShareModel OLrzqt(@NotNull String str, Map<String, String> map, String str2, @NotNull String str3, Web3ShareLinkInfo web3ShareLinkInfo, @NotNull String str4, WalletReferralSource walletReferralSource) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return EZpvd(str, str2, null, map, str3, C56402yEa.EZpvd(web3ShareLinkInfo == null ? Web3ShareLinkInfo.Activity.create$default(Web3ShareLinkInfo.Companion, null, 1, null) : web3ShareLinkInfo), Web3ShareType.SHARE_WEBPAGE, str4, walletReferralSource);
        }

        public static /* synthetic */ Web3ShareModel createMiniProgramModel$default(Application application, String str, String str2, String str3, dTJ dtj, String str4, WalletReferralSource walletReferralSource, int i, Object obj) {
            if ((i & 32) != 0) {
                walletReferralSource = null;
            }
            return application.AEQbTJ(str, str2, str3, dtj, str4, walletReferralSource);
        }

        public final Web3ShareModel AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull dTJ dtj, @NotNull String str4, WalletReferralSource walletReferralSource) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(dtj, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return EZpvd(null, str, str2, null, str3, C56402yEa.EZpvd(dtj), Web3ShareType.SHARE_CUSTOMIZE, str4, walletReferralSource);
        }

        public final Web3ShareModel copydefault(@NotNull String str, Map<String, String> map, @NotNull String str2, @NotNull dTJ dtj, @NotNull String str3, WalletReferralSource walletReferralSource) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(dtj, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return EZpvd(str, null, null, map, str2, C56402yEa.EZpvd(dtj), Web3ShareType.SHARE_CUSTOMIZE, str3, walletReferralSource);
        }

        public final Web3ShareModel EZpvd(String str, String str2, String str3, Map<String, String> map, String str4, List<? extends Web3ShareBaseInfo> list, Web3ShareType web3ShareType, String str5, WalletReferralSource walletReferralSource) {
            Web3ShareModel web3ShareModel = new Web3ShareModel();
            web3ShareModel.setModelId(str);
            web3ShareModel.setLinkQueryParams(map);
            web3ShareModel.setWebUrl(str2);
            web3ShareModel.setDeepLink(str3);
            web3ShareModel.setShareFrom(str4);
            web3ShareModel.setShareInfoList(list);
            web3ShareModel.setShareType(web3ShareType);
            web3ShareModel.setAccountId(str5);
            web3ShareModel.setSource(walletReferralSource);
            return web3ShareModel;
        }
    }
}
