package com.reown.android.internal.common.modal.domain.usecase;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.reown.android.internal.common.modal.data.model.Wallet;

/* JADX INFO: loaded from: classes17.dex */
public final class GetSamplesWalletsUseCaseInterfaceKt {
    public static final Wallet SampleWalletDebug = new Wallet("SampleWalletDebug", "Android Sample Debug", "https://walletconnect.com", "https://raw.githubusercontent.com/WalletConnect/WalletConnectKotlinV2/develop/sample/wallet/src/main/res/drawable-xxxhdpi/wc_icon.png", "1", "kotlin-web3wallet://", null, null, "https://appkit-lab.reown.com/wallet_debug", true);
    public static final Wallet SampleWalletInternal = new Wallet("SampleWalletInternal", "Android Sample Internal", "https://walletconnect.com", "https://raw.githubusercontent.com/WalletConnect/WalletConnectKotlinV2/develop/sample/wallet/src/main/res/drawable-xxxhdpi/wc_icon.png", "2", "kotlin-web3wallet://", null, null, "https://appkit-lab.reown.com/wallet_internal", true);
    public static final Wallet SampleWalletRelease = new Wallet("SampleWalletRelease", "Android Sample Release", "https://walletconnect.com", "https://raw.githubusercontent.com/WalletConnect/WalletConnectKotlinV2/develop/sample/wallet/src/main/res/drawable-xxxhdpi/wc_icon.png", "3", "kotlin-web3wallet://", null, null, "https://appkit-lab.reown.com/wallet_release", true);
    public static final Wallet RNSampleWalletInternal = new Wallet("RNSampleWallet", "RN Sample", "https://walletconnect.com", "https://raw.githubusercontent.com/WalletConnect/WalletConnectKotlinV2/develop/sample/wallet/src/main/res/drawable-xxxhdpi/wc_icon.png", "4", "rn-web3wallet://", null, null, "https://appkit-lab.reown.com/rn_walletkit_internal", true);
    public static final Wallet RNSampleWallet = new Wallet("RNSampleWalletInternal", "RN Sample Internal", "https://walletconnect.com", "https://raw.githubusercontent.com/WalletConnect/WalletConnectKotlinV2/develop/sample/wallet/src/main/res/drawable-xxxhdpi/wc_icon.png", "5", "rn-web3wallet://", null, null, "https://appkit-lab.reown.com/rn_walletkit", true);
    public static final Wallet FLSampleWallet = new Wallet("FLSampleWallet", "FL Sample", "https://walletconnect.com", "https://raw.githubusercontent.com/WalletConnect/WalletConnectKotlinV2/develop/sample/wallet/src/main/res/drawable-xxxhdpi/wc_icon.png", OrderDetailListItem.SLIP_OUT, "wcflutterwallet://", null, null, "https://appkit-lab.reown.com/flutter_walletkit", true);
    public static final Wallet FLSampleWalletInternal = new Wallet("FLSampleWalletInternal", "FL Sample Internal", "https://walletconnect.com", "https://raw.githubusercontent.com/WalletConnect/WalletConnectKotlinV2/develop/sample/wallet/src/main/res/drawable-xxxhdpi/wc_icon.png", "7", "wcflutterwallet-internal://", null, null, "https://appkit-lab.reown.com/flutter_walletkit_internal", true);
}
