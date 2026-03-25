package o;

import androidx.fragment.app.FragmentActivity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.okinc.business.defi.api.bean.CustomNetworkInfo;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.biz.walletconnect.NativeCurrency;
import com.okinc.business.defi.biz.walletconnect.WalletAddEthereumChain;
import com.okinc.business.defi.biz.walletconnect.WalletWatchAssetOption;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC17951fYi;
import o.ActivityC20546git;
import o.ActivityC20550gix;
import o.C12827cuN;
import o.C13754dXa;
import o.C9694baS;
import o.fYV;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cYA extends AbstractC43215rlA implements xWE {
    public final Gson KWHzl = new GsonBuilder().serializeNulls().create();

    public static final class ActionBar extends TypeToken<WalletAddEthereumChain> {
    }

    public static final class StateListAnimator extends TypeToken<WalletWatchAssetOption> {
    }

    @Override // o.xWE
    public void KWHzl(@NotNull final android.content.Context context, @NotNull final DappInteractionArgs dappInteractionArgs, java.lang.String str, final Function1<? super android.os.Bundle, Unit> function1) {
        java.util.ArrayList arrayList;
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            Gson gson = this.KWHzl;
            Intrinsics.checkNotNullExpressionValue(gson, "");
            WalletAddEthereumChain walletAddEthereumChain = (WalletAddEthereumChain) gson.fromJson(str, new ActionBar().getType());
            if (walletAddEthereumChain == null) {
                return;
            }
            PlatformItem dapp = dappInteractionArgs.getDapp();
            java.lang.String platform = dapp != null ? dapp.getPlatform() : null;
            PlatformItem dapp2 = dappInteractionArgs.getDapp();
            java.lang.String logo = dapp2 != null ? dapp2.getLogo() : null;
            PlatformItem dapp3 = dappInteractionArgs.getDapp();
            java.lang.String url = dapp3 != null ? dapp3.getUrl() : null;
            java.lang.String chainName = walletAddEthereumChain.getChainName();
            java.util.List<java.lang.String> rpcUrls = walletAddEthereumChain.getRpcUrls();
            if (rpcUrls != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj : rpcUrls) {
                    if (WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).AkhnZx((java.lang.String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            NativeCurrency nativeCurrency = walletAddEthereumChain.getNativeCurrency();
            java.lang.String symbol = nativeCurrency != null ? nativeCurrency.getSymbol() : null;
            java.util.List<java.lang.String> blockExplorerUrls = walletAddEthereumChain.getBlockExplorerUrls();
            CustomNetworkInfo customNetworkInfo = new CustomNetworkInfo(logo, platform, url, chainName, arrayList, symbol, blockExplorerUrls != null ? (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(blockExplorerUrls) : null, null, 0, MLKEMEngine.KyberPolyBytes, null);
            java.lang.String chainId = walletAddEthereumChain.getChainId();
            if (chainId == null || (strOLrzqt = C33491mxU.OLrzqt(chainId)) == null) {
                return;
            }
            dappInteractionArgs.setChainId(strOLrzqt);
            dappInteractionArgs.setCustomNetworkInfo(customNetworkInfo);
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(dappInteractionArgs.getWalletId(), false);
        final Function1 function12 = new Function1() { // from class: o.cYM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return cYA.OLrzqt(this.EZpvd, context, dappInteractionArgs, function1, (AbstractC12782ctV) obj2);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cYL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                cYA.AEQbTJ(function12, obj2);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.cYP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return cYA.OLrzqt((java.lang.Throwable) obj2);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cYN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj2) {
                cYA.valueOf(function13, obj2);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(cYA cya, android.content.Context context, final DappInteractionArgs dappInteractionArgs, final Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        if (!abstractC12782ctV.getFieldNames() && AbstractC12782ctV.isCustomNetworkSupport$default(abstractC12782ctV, false, 1, null)) {
            if (C8396bBt.AEQbTJ.copydefault()) {
                androidx.fragment.app.FragmentManager fragmentManagerKWHzl = cya.KWHzl(context);
                if (fragmentManagerKWHzl != null) {
                    C9694baS.Application application = C9694baS.Companion;
                    ActivityC20546git.Activity activity = ActivityC20546git.Companion;
                    java.lang.String walletId = dappInteractionArgs.getWalletId();
                    java.lang.String chainId = dappInteractionArgs.getChainId();
                    java.lang.Integer source = dappInteractionArgs.getSource();
                    if (source == null) {
                        return Unit.INSTANCE;
                    }
                    int iIntValue = source.intValue();
                    CustomNetworkInfo customNetworkInfo = dappInteractionArgs.getCustomNetworkInfo();
                    if (customNetworkInfo == null) {
                        return Unit.INSTANCE;
                    }
                    application.KWHzl(fragmentManagerKWHzl, activity.AEQbTJ(context, walletId, chainId, iIntValue, customNetworkInfo, dappInteractionArgs.getWcTopic(), dappInteractionArgs.getWcId()), new Function2() { // from class: o.cYB
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return cYA.copydefault(dappInteractionArgs, function1, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                        }
                    });
                }
                ActivityC20546git.Companion.EZpvd(new Function1() { // from class: o.cYD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return cYA.OLrzqt(function1, (android.os.Bundle) obj);
                    }
                });
            } else {
                androidx.fragment.app.FragmentManager fragmentManagerKWHzl2 = cya.KWHzl(context);
                if (fragmentManagerKWHzl2 != null) {
                    C9694baS.Application application2 = C9694baS.Companion;
                    ActivityC17951fYi.Application application3 = ActivityC17951fYi.Companion;
                    java.lang.String walletId2 = dappInteractionArgs.getWalletId();
                    java.lang.String chainId2 = dappInteractionArgs.getChainId();
                    java.lang.Integer source2 = dappInteractionArgs.getSource();
                    if (source2 == null) {
                        return Unit.INSTANCE;
                    }
                    int iIntValue2 = source2.intValue();
                    CustomNetworkInfo customNetworkInfo2 = dappInteractionArgs.getCustomNetworkInfo();
                    if (customNetworkInfo2 == null) {
                        return Unit.INSTANCE;
                    }
                    application2.KWHzl(fragmentManagerKWHzl2, application3.KWHzl(context, walletId2, chainId2, iIntValue2, customNetworkInfo2, dappInteractionArgs.getWcTopic(), dappInteractionArgs.getWcId()), new Function2() { // from class: o.cYE
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return cYA.AEQbTJ(dappInteractionArgs, function1, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                        }
                    });
                }
                ActivityC17951fYi.Companion.KWHzl(new Function1() { // from class: o.cYI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return cYA.EZpvd(function1, (android.os.Bundle) obj);
                    }
                });
            }
        } else {
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DDjfYY), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            if (function1 != null) {
                function1.invoke(null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(DappInteractionArgs dappInteractionArgs, Function1 function1, int i, android.content.Intent intent) {
        if (Intrinsics.EZpvd((java.lang.Object) dappInteractionArgs.getFrom(), (java.lang.Object) "okx_connect")) {
            if (function1 != null) {
                function1.invoke(intent != null ? intent.getExtras() : null);
            }
            return Unit.INSTANCE;
        }
        if (i == -1 && function1 != null) {
            function1.invoke(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function1 function1, android.os.Bundle bundle) {
        if (function1 != null) {
            function1.invoke(bundle);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(DappInteractionArgs dappInteractionArgs, Function1 function1, int i, android.content.Intent intent) {
        if (Intrinsics.EZpvd((java.lang.Object) dappInteractionArgs.getFrom(), (java.lang.Object) "okx_connect")) {
            if (function1 != null) {
                function1.invoke(intent != null ? intent.getExtras() : null);
            }
            return Unit.INSTANCE;
        }
        if (i == -1 && function1 != null) {
            function1.invoke(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(Function1 function1, android.os.Bundle bundle) {
        if (function1 != null) {
            function1.invoke(bundle);
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        pUU.copydefault("WalletDappAddCustomNetworkServiceImpl", "addCustomEvmChain getWalletById error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    @Override // o.xWE
    public void copydefault(@NotNull final android.content.Context context, @NotNull final DappInteractionArgs dappInteractionArgs, java.lang.String str, final Function1<? super android.os.Bundle, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(dappInteractionArgs, "");
        if (dappInteractionArgs.getChainId().length() == 0) {
            return;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            try {
                Gson gson = this.KWHzl;
                Intrinsics.checkNotNullExpressionValue(gson, "");
                WalletWatchAssetOption walletWatchAssetOption = (WalletWatchAssetOption) gson.fromJson(str, new StateListAnimator().getType());
                if (walletWatchAssetOption == null) {
                    return;
                }
                java.lang.String image = walletWatchAssetOption.getImage();
                java.lang.String symbol = walletWatchAssetOption.getSymbol();
                java.lang.Integer decimals = walletWatchAssetOption.getDecimals();
                dappInteractionArgs.setCustomNetworkInfo(new CustomNetworkInfo(image, null, null, null, null, symbol, null, walletWatchAssetOption.getAddress(), decimals != null ? decimals.intValue() : -1, 94, null));
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            if (dappInteractionArgs.getCustomNetworkInfo() == null) {
                return;
            }
        }
        AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(dappInteractionArgs.getWalletId(), false);
        final Function1 function12 = new Function1() { // from class: o.cYF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cYA.EZpvd(this.AEQbTJ, context, dappInteractionArgs, function1, (AbstractC12782ctV) obj);
            }
        };
        InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.cYC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                cYA.AhwBna(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.cYK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return cYA.KWHzl((java.lang.Throwable) obj);
            }
        };
        abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.cYG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                cYA.AYXKKw(function13, obj);
            }
        });
    }

    public static final void AhwBna(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(cYA cya, android.content.Context context, DappInteractionArgs dappInteractionArgs, final Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        if (!abstractC12782ctV.getFieldNames() && AbstractC12782ctV.isCustomNetworkSupport$default(abstractC12782ctV, false, 1, null)) {
            if (C8396bBt.AEQbTJ.copydefault()) {
                androidx.fragment.app.FragmentManager fragmentManagerKWHzl = cya.KWHzl(context);
                if (fragmentManagerKWHzl != null) {
                    C9694baS.Application application = C9694baS.Companion;
                    ActivityC20550gix.Activity activity = ActivityC20550gix.Companion;
                    java.lang.String walletId = dappInteractionArgs.getWalletId();
                    java.lang.String chainId = dappInteractionArgs.getChainId();
                    java.lang.Integer source = dappInteractionArgs.getSource();
                    if (source == null) {
                        return Unit.INSTANCE;
                    }
                    int iIntValue = source.intValue();
                    CustomNetworkInfo customNetworkInfo = dappInteractionArgs.getCustomNetworkInfo();
                    if (customNetworkInfo == null) {
                        return Unit.INSTANCE;
                    }
                    application.KWHzl(fragmentManagerKWHzl, activity.KWHzl(context, walletId, chainId, iIntValue, customNetworkInfo, dappInteractionArgs.getWcTopic(), dappInteractionArgs.getWcId()), new Function2() { // from class: o.cYH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return cYA.OLrzqt(function1, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                        }
                    });
                }
            } else {
                androidx.fragment.app.FragmentManager fragmentManagerKWHzl2 = cya.KWHzl(context);
                if (fragmentManagerKWHzl2 != null) {
                    C9694baS.Application application2 = C9694baS.Companion;
                    fYV.ActionBar actionBar = fYV.Companion;
                    java.lang.String walletId2 = dappInteractionArgs.getWalletId();
                    java.lang.String chainId2 = dappInteractionArgs.getChainId();
                    java.lang.Integer source2 = dappInteractionArgs.getSource();
                    if (source2 == null) {
                        return Unit.INSTANCE;
                    }
                    int iIntValue2 = source2.intValue();
                    CustomNetworkInfo customNetworkInfo2 = dappInteractionArgs.getCustomNetworkInfo();
                    if (customNetworkInfo2 == null) {
                        return Unit.INSTANCE;
                    }
                    application2.KWHzl(fragmentManagerKWHzl2, actionBar.OLrzqt(context, walletId2, chainId2, iIntValue2, customNetworkInfo2, dappInteractionArgs.getWcTopic(), dappInteractionArgs.getWcId()), new Function2() { // from class: o.cYJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return cYA.copydefault(function1, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                        }
                    });
                }
            }
        } else {
            C55326xho.toast$default(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DDjfYY), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            if (function1 != null) {
                function1.invoke(null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(Function1 function1, int i, android.content.Intent intent) {
        if (function1 != null) {
            function1.invoke(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function1 function1, int i, android.content.Intent intent) {
        if (function1 != null) {
            function1.invoke(intent != null ? intent.getExtras() : null);
        }
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        pUU.copydefault("WalletDappAddCustomNetworkServiceImpl", "watchEvmAsset getWalletById error message :" + th.getMessage());
        return Unit.INSTANCE;
    }

    @Override // o.xWE
    public boolean KWHzl(long j, boolean z) {
        InterfaceC9731bbC interfaceC9731bbCEZpvd;
        if (z && (interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(j, true)) != null) {
            return C10598brV.AEQbTJ.AhwBna(interfaceC9731bbCEZpvd.isConnected()) != null;
        }
        return false;
    }

    @Override // o.xWE
    public java.lang.String OLrzqt(long j) {
        CustomChainMeta customChainMetaOLrzqt;
        java.lang.String strIsConnected;
        InterfaceC9731bbC interfaceC9731bbCEZpvd = ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault().EZpvd(j, true);
        if (interfaceC9731bbCEZpvd != null) {
            CustomChainCoinMeta customChainCoinMetaAhwBna = C10598brV.AEQbTJ.AhwBna(interfaceC9731bbCEZpvd.isConnected());
            if (customChainCoinMetaAhwBna != null && (customChainMetaOLrzqt = customChainCoinMetaAhwBna.OLrzqt()) != null && (strIsConnected = customChainMetaOLrzqt.isConnected()) != null) {
                return strIsConnected;
            }
        }
        return "";
    }

    private final androidx.fragment.app.FragmentManager KWHzl(android.content.Context context) {
        android.app.Activity activityOLrzqt = C33569myt.OLrzqt(context);
        FragmentActivity fragmentActivity = activityOLrzqt instanceof FragmentActivity ? (FragmentActivity) activityOLrzqt : null;
        if (fragmentActivity != null) {
            return fragmentActivity.getSupportFragmentManager();
        }
        return null;
    }
}
