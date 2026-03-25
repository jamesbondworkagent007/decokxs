package com.okinc.business.defi.dapp.webview;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.dapp.webview.DappTabData;
import com.okinc.dapp.bean.DappChains;
import com.okinc.dapp.bean.RpcUrl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13241dEa;
import o.C14923duc;
import o.C15152dyt;
import o.C33129mqd;
import o.C43251rlk;
import o.C55173xeu;
import o.InterfaceC9731bbC;
import o.InterfaceC9738bbJ;
import o.InterfaceC9846bdL;
import o.InterfaceC9852bdR;
import o.dBW;
import o.xWE;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class DappTabData implements Serializable {
    private Boolean aaPromptFlag;
    private ArrayList<Long> chainIdList;
    private Long currentChainId;
    private transient InterfaceC9738bbJ currentWallet;
    private transient C55173xeu errorView;
    private boolean hasError;
    private boolean hasShowAATips;
    private boolean hasShowTranslateReminder;
    private transient boolean hasShownSplashScreen;
    private transient boolean isConnectedByWalletConnect;
    private transient boolean isLoaded;
    private transient boolean isTranslated;
    private List<DappChains> mChainList;
    private transient Bitmap mIcon;
    private byte[] mIconByte;
    private PlatformItem mItem;
    private transient Bitmap mThumbImage;
    private byte[] mThumbImageByte;
    private String mThumbImageFileName;
    private String mTitle;
    private String mUrl;
    private transient C13241dEa mWebView;
    private boolean okxConnect;
    private transient String originUrl;
    private int progress;
    private String splashLogo;
    private String splashTitle;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;
    private int webViewUiMode = 2;
    private List<String> okxConnectRequiredGeneralChainIds = new ArrayList();
    private long mChainId = 1;
    private String mRpcUrl = dBW.Companion.KWHzl();
    private transient String currentAddress = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAaPromptFlag() {
        return this.aaPromptFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> getChainIdList() {
        return this.chainIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentAddress() {
        return this.currentAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCurrentChainId() {
        return this.currentChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC9738bbJ getCurrentWallet() {
        return this.currentWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C55173xeu getErrorView() {
        return this.errorView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasError() {
        return this.hasError;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasShowAATips() {
        return this.hasShowAATips;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasShowTranslateReminder() {
        return this.hasShowTranslateReminder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasShownSplashScreen() {
        return this.hasShownSplashScreen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getMChainId() {
        return this.mChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DappChains> getMChainList() {
        return this.mChainList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bitmap getMIcon() {
        return this.mIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] getMIconByte() {
        return this.mIconByte;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlatformItem getMItem() {
        return this.mItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMRpcUrl() {
        return this.mRpcUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] getMThumbImageByte() {
        return this.mThumbImageByte;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMThumbImageFileName() {
        return this.mThumbImageFileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMTitle() {
        return this.mTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C13241dEa getMWebView() {
        return this.mWebView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getOkxConnect() {
        return this.okxConnect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getOkxConnectRequiredGeneralChainIds() {
        return this.okxConnectRequiredGeneralChainIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginUrl() {
        return this.originUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProgress() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSplashLogo() {
        return this.splashLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSplashTitle() {
        return this.splashTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWebViewUiMode() {
        return this.webViewUiMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnectedByWalletConnect() {
        return this.isConnectedByWalletConnect;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLoaded() {
        return this.isLoaded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTranslated() {
        return this.isTranslated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAaPromptFlag(Boolean bool) {
        this.aaPromptFlag = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIdList(ArrayList<Long> arrayList) {
        this.chainIdList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConnectedByWalletConnect(boolean z) {
        this.isConnectedByWalletConnect = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currentAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentChainId(Long l) {
        this.currentChainId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrentWallet(InterfaceC9738bbJ interfaceC9738bbJ) {
        this.currentWallet = interfaceC9738bbJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorView(C55173xeu c55173xeu) {
        this.errorView = c55173xeu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasError(boolean z) {
        this.hasError = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasShowAATips(boolean z) {
        this.hasShowAATips = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasShowTranslateReminder(boolean z) {
        this.hasShowTranslateReminder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasShownSplashScreen(boolean z) {
        this.hasShownSplashScreen = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoaded(boolean z) {
        this.isLoaded = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMChainId(long j) {
        this.mChainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMChainList(List<DappChains> list) {
        this.mChainList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMIcon(Bitmap bitmap) {
        this.mIcon = bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMIconByte(byte[] bArr) {
        this.mIconByte = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMRpcUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mRpcUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMThumbImage(Bitmap bitmap) {
        this.mThumbImage = bitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMThumbImageByte(byte[] bArr) {
        this.mThumbImageByte = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMThumbImageFileName(String str) {
        this.mThumbImageFileName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMTitle(String str) {
        this.mTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMUrl(String str) {
        this.mUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMWebView(C13241dEa c13241dEa) {
        this.mWebView = c13241dEa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkxConnect(boolean z) {
        this.okxConnect = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkxConnectRequiredGeneralChainIds(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.okxConnectRequiredGeneralChainIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginUrl(String str) {
        this.originUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProgress(int i) {
        this.progress = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSplashLogo(String str) {
        this.splashLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSplashTitle(String str) {
        this.splashTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTranslated(boolean z) {
        this.isTranslated = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWebViewUiMode(int i) {
        this.webViewUiMode = i;
    }

    public final String getMUrl() {
        String url;
        C13241dEa c13241dEa = this.mWebView;
        if (c13241dEa == null || (url = c13241dEa.getUrl()) == null) {
            url = this.mUrl;
        }
        this.mUrl = url;
        return url;
    }

    public final void setMItem(PlatformItem platformItem) {
        this.mItem = platformItem;
        this.originUrl = platformItem != null ? platformItem.getUrl() : null;
    }

    public final Bitmap getMThumbImage() {
        if (this.mThumbImage == null) {
            this.mThumbImage = bytes2Bimap(this.mThumbImageByte);
        }
        return this.mThumbImage;
    }

    public final String getTitle() {
        String str = this.mTitle;
        if (str != null) {
            return str;
        }
        PlatformItem platformItem = this.mItem;
        if (platformItem != null) {
            return platformItem.getPlatform();
        }
        return null;
    }

    public final Bitmap getIcon() {
        if (this.mIcon == null) {
            this.mIcon = bytes2Bimap(this.mIconByte);
        }
        return this.mIcon;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.dapp.webview.DappTabData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setCurrentChain$default(DappTabData dappTabData, long j, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = new Function2() { // from class: o.dDH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return DappTabData.setCurrentChain$lambda$0((java.lang.String) obj2, ((java.lang.Long) obj3).longValue());
                }
            };
        }
        dappTabData.setCurrentChain(j, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCurrentChain$lambda$0(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public final void setCurrentChain(long j, @NotNull final Function2<? super String, ? super Long, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        String mUrl = getMUrl();
        if (mUrl != null) {
            C14923duc.EZpvd.EZpvd(mUrl, j);
        }
        String str = this.originUrl;
        if (str != null) {
            C14923duc.EZpvd.EZpvd(str, j);
        }
        if (((xWE) C43251rlk.copydefault(xWE.class)).KWHzl(j, true)) {
            this.mRpcUrl = ((xWE) C43251rlk.copydefault(xWE.class)).OLrzqt(j);
            this.mChainId = j;
        } else {
            for (InterfaceC9731bbC interfaceC9731bbC : ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().copydefault(true)) {
                if (interfaceC9731bbC.fetchVPNInfo() == j) {
                    this.mChainId = interfaceC9731bbC.fetchVPNInfo();
                    if (interfaceC9731bbC.fetchVPNInfo() == 1284) {
                        this.mRpcUrl = dBW.Companion.EZpvd(Companion.copydefault(this.mChainId) + "_rpc_dapp2", "https://rpc.ankr.com/moonbeam");
                    } else {
                        List<RpcUrl> listEZpvd = C15152dyt.EZpvd.EZpvd();
                        if (listEZpvd != null) {
                            int i = 0;
                            for (Object obj : listEZpvd) {
                                if (i < 0) {
                                    yDY.AYXKKw();
                                }
                                RpcUrl rpcUrl = (RpcUrl) obj;
                                if (C33129mqd.OLrzqt((CharSequence) rpcUrl.getChainId()) && Intrinsics.EZpvd((Object) rpcUrl.getChainId(), (Object) String.valueOf(this.mChainId)) && C33129mqd.OLrzqt((CharSequence) rpcUrl.getRpcSendPath())) {
                                    this.mRpcUrl = rpcUrl.getRpcSendPath();
                                } else {
                                    i++;
                                }
                            }
                        }
                        this.mRpcUrl = dBW.Companion.EZpvd(Companion.copydefault(this.mChainId) + "_rpc_dapp2", C15152dyt.EZpvd.KWHzl(this.mChainId));
                        InterfaceC9846bdL interfaceC9846bdL = (InterfaceC9846bdL) C43251rlk.OLrzqt(InterfaceC9846bdL.class);
                        if (interfaceC9846bdL != null) {
                            interfaceC9846bdL.copydefault(String.valueOf(this.mChainId), new Function1() { // from class: o.dDE
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return DappTabData.setCurrentChain$lambda$6$lambda$4(this.copydefault, function2, (java.lang.String) obj2);
                                }
                            }, new Function1() { // from class: o.dDF
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj2) {
                                    return DappTabData.setCurrentChain$lambda$6$lambda$5((java.lang.String) obj2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
            }
        }
        C13241dEa c13241dEa = this.mWebView;
        if (c13241dEa != null) {
            c13241dEa.setChainIdAndRpc(this.mChainId, this.mRpcUrl);
        }
        function2.invoke(this.mRpcUrl, Long.valueOf(this.mChainId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCurrentChain$lambda$6$lambda$4(DappTabData dappTabData, Function2 function2, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!C33129mqd.OLrzqt((CharSequence) str)) {
            str = dBW.Companion.EZpvd(Companion.copydefault(dappTabData.mChainId) + "_rpc_dapp2", C15152dyt.EZpvd.KWHzl(dappTabData.mChainId));
        }
        dappTabData.mRpcUrl = str;
        C13241dEa c13241dEa = dappTabData.mWebView;
        if (c13241dEa != null) {
            c13241dEa.setChainIdAndRpc(dappTabData.mChainId, str);
        }
        function2.invoke(dappTabData.mRpcUrl, Long.valueOf(dappTabData.mChainId));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCurrentChain$lambda$6$lambda$5(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.dapp.webview.DappTabData.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault(long j) {
            return j == 1 ? "eth" : j == 66 ? "okc" : j == 56 ? "bsc" : j == 137 ? "polygon" : j == 43114 ? "avax" : j == 195 ? "tron" : j == 501 ? "solana" : j == 42161 ? "arbitrum" : j == 250 ? "fantom" : j == 10 ? "optimism" : j == 25 ? "cronos" : j == 8217 ? "klaytn" : j == 1313161554 ? "aurora" : j == 2020 ? "ronin" : j == 1284 ? "moonbeam" : j == 1285 ? "moonriver" : j == 1666600000 ? "harmony" : j == 321 ? "kcc" : j == 1088 ? "metis" : j == 288 ? "boba" : j == 100 ? "gnosis" : j == 10001 ? "ethw" : j == 513100 ? "ethf" : j == 1116 ? "core" : "eth";
        }

        private StateListAnimator() {
        }
    }

    private final Bitmap bytes2Bimap(byte[] bArr) {
        if (bArr != null) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }
}
