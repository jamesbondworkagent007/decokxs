package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.GsonBuilder;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.core.aa.AAGenOriPaymasterTokenV7;
import com.okinc.wallet.core.aa.AAParseInitCode;
import com.okinc.wallet.core.aa.AAParsePaymasterDataV7;
import com.okinc.wallet.core.aa.AAPaymasterAndTokenParams;
import com.okinc.wallet.core.aa.AAPaymasterAndTokenParamsV7;
import com.okinc.wallet.core.aa.AAPaymasterDataAndSignature;
import com.okinc.wallet.core.aa.AAPaymasterDataAndSignatureV7;
import com.okinc.wallet.core.decode.PsbtDecodeItem;
import com.okinc.wallet.core.decode.PsbtDecodeItemDetails;
import com.okinc.wallet.core.decode.PsbtDecodeNewItem;
import com.okinc.wallet.core.decode.PsbtDecodeParams;
import com.okinc.wallet.core.decode.PsbtDecodeParamsNew;
import com.okinc.wallet.core.keypair.KeyPair;
import com.okinc.wallet.core.keypair.KeyPairParams;
import com.okinc.wallet.core.mnemonic.MnemonicValidateResult;
import com.okinc.wallet.core.mpc.CurveInfo;
import com.okinc.wallet.core.mpc.HDWalletCoin;
import com.okinc.wallet.core.mpc.MpcPrivateKey;
import com.okinc.wallet.core.mpc.PrivateKeyOriginData;
import com.okinc.wallet.core.mpc.WalletAddressList;
import com.okinc.wallet.core.other.CalUTXOInfo;
import com.okinc.wallet.core.other.CallDataParams;
import com.okinc.wallet.core.other.ChainInfo;
import com.okinc.wallet.core.other.DerivePath;
import com.okinc.wallet.core.sign.ECDSA;
import com.okinc.wallet.core.sign.ED25519;
import com.okinc.wallet.core.sign.InvokeMethodParams;
import com.okinc.wallet.core.sign.MPCeCDSAToHEX;
import com.okinc.wallet.core.sign.RawData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.UnsignedTx;
import com.okinc.wallet.core.sign.cosmos.CosmosFeeAmountAndGas;
import com.okinc.wallet.core.sign.cosmos.CosmosSignDocTransaction;
import com.okinc.wallet.core.sign.cosmos.CosmosTransactionData;
import com.okinc.wallet.core.sign.evm.OpCalDataTransaction;
import com.okinc.wallet.core.sign.evm.SigData;
import com.okinc.wallet.core.sign.stacks.StacksContractTransaction;
import com.okinc.wallet.core.sign.stacks.StacksTransaction;
import com.okinc.wallet.core.sign.sui.SuiTokenTxData;
import com.okinc.wallet.core.sign.sui.SuiTxData;
import com.okinc.wallet.core.sign.tron.TronGenerateUnsignedContract;
import com.okinc.wallet.core.sign.tron.TronSignContract;
import com.okinc.wallet.core.sign.tron.TronSignData;
import com.okinc.wallet.core.sign.utxo.ARCBuyTransactionResult;
import com.okinc.wallet.core.sign.utxo.BRC20TransactionResult;
import com.okinc.wallet.core.sign.utxo.DummySignedTx;
import com.okinc.wallet.core.sign.utxo.MPCBRC20PsbtResult;
import com.okinc.wallet.core.sign.utxo.MPCBtcMessage;
import com.okinc.wallet.core.sign.utxo.MPCRawPsbtTx;
import com.okinc.wallet.core.sign.utxo.RuneMainMintTransactionResult;
import com.okinc.wallet.core.sign.utxo.RunesMainBuyTransactionResult;
import com.okinc.wallet.core.sign.utxo.RunesTransactionResult;
import com.okinc.wallet.core.sign.utxo.UTXOTransaction;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import com.okinc.wallet.core.tee.HPKEEncryptData;
import com.okinc.wallet.core.tee.HPKEKeypair;
import com.okinc.wallet.core.tee.TeeAttestationVerifyData;
import com.okinc.wallet.core.tee.TeeRsaVerifyData;
import com.okinc.wallet.core.wallet.KeystoneAddressInfo;
import com.okinc.wallet.core.wallet.KeystonePubKeyInfo;
import com.okinc.web3.security.bridge.Web3SecurityBridge;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class xXV {
    public static final xXV KWHzl = new xXV();

    private xXV() {
    }

    public final java.lang.String uzCIH(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "random_mnemonic", C56423yEv.EZpvd(C56390yDp.OLrzqt("language", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public static /* synthetic */ MnemonicValidateResult validateMnemonic$default(xXV xxv, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return xxv.zsXlph(str);
    }

    public final MnemonicValidateResult zsXlph(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "validate_mnemonic", C56423yEv.EZpvd(C56390yDp.OLrzqt("mnemonic", str)), false, 4, null);
        if (objDispatch$default instanceof JSONObject) {
            java.lang.String string = ((JSONObject) objDispatch$default).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            MnemonicValidateResult mnemonicValidateResult = (MnemonicValidateResult) C33490mxT.EZpvd(string, MnemonicValidateResult.class);
            return mnemonicValidateResult == null ? new MnemonicValidateResult("", false, 0, 4, (DefaultConstructorMarker) null) : mnemonicValidateResult;
        }
        return new MnemonicValidateResult("", false, 0, 4, (DefaultConstructorMarker) null);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, boolean z, int i, int i2, @NotNull java.lang.String str3, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mnemonic_get_prvkey", C56424yEw.gEmmrt(C56390yDp.OLrzqt("mnemonic", str), C56390yDp.OLrzqt("language", str2), C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(j)), C56390yDp.OLrzqt("mainNetWork", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("addressIndex", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("addressType", java.lang.Integer.valueOf(i2)), C56390yDp.OLrzqt("fromAddress", str3), C56390yDp.OLrzqt("isSpecificMnemonic", java.lang.Boolean.valueOf(z2))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.util.List<WalletAddressList> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<HDWalletCoin> list, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "generate_hdwallets", C56424yEw.gEmmrt(C56390yDp.OLrzqt("language", str2), C56390yDp.OLrzqt("mnemonic", str), C56390yDp.OLrzqt("Coins", list), C56390yDp.OLrzqt("signInfo", C56423yEv.EZpvd(C56390yDp.OLrzqt("walletId", str3)))), false, 4, null);
        if (objDispatch$default instanceof JSONArray) {
            KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(WalletAddressList.Companion.serializer());
            java.lang.String string = ((JSONArray) objDispatch$default).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return (java.util.List) C54907xZt.OLrzqt(kSerializerListSerializer, string);
        }
        return yDY.AhwBna();
    }

    public final WalletAddressList copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, long j2, int i, int i2, @NotNull java.lang.String str3, boolean z, boolean z2, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "generate_hdwallet", C56424yEw.gEmmrt(C56390yDp.OLrzqt("language", str2), C56390yDp.OLrzqt("mnemonic", str), C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(j)), C56390yDp.OLrzqt("realChainId", java.lang.Long.valueOf(j2)), C56390yDp.OLrzqt("addressIndex", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("mainNetWork", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("addressHrp", str3), C56390yDp.OLrzqt("addressType", java.lang.Integer.valueOf(i2)), C56390yDp.OLrzqt("isSpecificMnemonic", java.lang.Boolean.valueOf(z2)), C56390yDp.OLrzqt("walletId", str4)), false, 4, null);
        if (!(objDispatch$default instanceof JSONObject)) {
            return null;
        }
        java.lang.String string = ((JSONObject) objDispatch$default).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return (WalletAddressList) C33490mxT.EZpvd(string, WalletAddressList.class);
    }

    public final WalletAddressList AEQbTJ(@NotNull java.lang.String str, long j, long j2, int i, @NotNull java.lang.String str2, boolean z, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "generate_keywallet", C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(j)), C56390yDp.OLrzqt("realChainId", java.lang.Long.valueOf(j2)), C56390yDp.OLrzqt("mainNetWork", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("addressType", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("addressHrp", str2), C56390yDp.OLrzqt("walletId", str3)), false, 4, null);
        if (!(objDispatch$default instanceof JSONObject)) {
            return null;
        }
        java.lang.String string = ((JSONObject) objDispatch$default).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return (WalletAddressList) C33490mxT.EZpvd(string, WalletAddressList.class);
    }

    public final java.util.List<KeystoneAddressInfo> KWHzl(@NotNull java.util.List<KeystonePubKeyInfo> list) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "keystone_pubkey_to_addr", list, false, 4, null);
        if (objDispatch$default != null) {
            try {
                string = objDispatch$default.toString();
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("WalletCoreBridge", "Failed to deserialize: " + e.getMessage(), e);
                return null;
            }
        } else {
            string = null;
        }
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(KeystoneAddressInfo.Companion.serializer()), string);
    }

    public final boolean AEQbTJ(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "validate_address", C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(j)), C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str), C56390yDp.OLrzqt("addressHrp", str2)), false, 4, null);
        java.lang.Boolean bool = objDispatch$default instanceof java.lang.Boolean ? (java.lang.Boolean) objDispatch$default : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final KeyPair OLrzqt(@NotNull KeyPairParams keyPairParams) {
        Intrinsics.checkNotNullParameter(keyPairParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "generate_key_pair", keyPairParams, false, 4, null);
        int i = 3;
        java.lang.String str = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        if (objDispatch$default instanceof JSONObject) {
            java.lang.String string = ((JSONObject) objDispatch$default).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            KeyPair keyPair = (KeyPair) C33490mxT.EZpvd(string, KeyPair.class);
            return keyPair == null ? new KeyPair(str, (java.lang.String) (b5 == true ? 1 : 0), i, (DefaultConstructorMarker) (b4 == true ? 1 : 0)) : keyPair;
        }
        return new KeyPair((java.lang.String) (b3 == true ? 1 : 0), (java.lang.String) (b2 == true ? 1 : 0), i, (DefaultConstructorMarker) (b == true ? 1 : 0));
    }

    public final java.lang.String copydefault() {
        java.lang.Object objDispatch$default = dispatch$default(this, "generate_password", null, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "encrypt_pass", C56423yEv.EZpvd(C56390yDp.OLrzqt("passWord", valueOf(str))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final boolean fJNWhG(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "validate_pass", C56424yEw.gEmmrt(C56390yDp.OLrzqt("passWord", valueOf(str)), C56390yDp.OLrzqt("passWordHash", str2)), false, 4, null);
        if (objDispatch$default instanceof java.lang.Boolean) {
            return ((java.lang.Boolean) objDispatch$default).booleanValue();
        }
        return false;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "encrypt_data", C56424yEw.gEmmrt(C56390yDp.OLrzqt("passWord", valueOf(str)), C56390yDp.OLrzqt("passWordHash", str2), C56390yDp.OLrzqt("data", str3), C56390yDp.OLrzqt("inputEncrypted", java.lang.Boolean.valueOf(z))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "decode_data", C56424yEw.gEmmrt(C56390yDp.OLrzqt("passWord", valueOf(str)), C56390yDp.OLrzqt("passWordHash", str2), C56390yDp.OLrzqt("data", str3), C56390yDp.OLrzqt("outputEncrypted", java.lang.Boolean.valueOf(z))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String isConnected(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objAEQbTJ = AEQbTJ("sign_message", (java.lang.Object) C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("message", str2)), false);
        java.lang.String string = objAEQbTJ != null ? objAEQbTJ.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AkhnZx(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objAEQbTJ = AEQbTJ("sign_message_unified", (java.lang.Object) C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("message", str2)), false);
        java.lang.String string = objAEQbTJ != null ? objAEQbTJ.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String DbNXlk(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "sign_transaction", transactionParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final BRC20TransactionResult values(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "brc20_sign_mint_tx", transactionParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (BRC20TransactionResult) C54907xZt.OLrzqt(BRC20TransactionResult.Companion.serializer(), string);
    }

    public final XRC20TransactionResult djBIcL(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "atomical_sign_transfer_tx", transactionParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0) {
            return null;
        }
        return (XRC20TransactionResult) C54907xZt.OLrzqt(XRC20TransactionResult.Companion.serializer(), string);
    }

    public final ARCBuyTransactionResult valueOf(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "atomical_generate_buyer_tx", transactionParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0) {
            return null;
        }
        return (ARCBuyTransactionResult) C54907xZt.OLrzqt(ARCBuyTransactionResult.Companion.serializer(), string);
    }

    public final RunesMainBuyTransactionResult copydefault(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "runemain_generate_buyer_tx", transactionParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0) {
            return null;
        }
        return (RunesMainBuyTransactionResult) C54907xZt.OLrzqt(RunesMainBuyTransactionResult.Companion.serializer(), string);
    }

    public final XRC20TransactionResult AkhnZx(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "src20_sign_mint_tx", transactionParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0) {
            return null;
        }
        return (XRC20TransactionResult) C54907xZt.OLrzqt(XRC20TransactionResult.Companion.serializer(), string);
    }

    public final RunesTransactionResult fetchVPNInfo(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "sign_transaction_v1", transactionParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0) {
            return null;
        }
        return (RunesTransactionResult) C54907xZt.OLrzqt(RunesTransactionResult.Companion.serializer(), string);
    }

    public final RuneMainMintTransactionResult isConnected(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "sign_transaction_v1", transactionParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0) {
            return null;
        }
        return (RuneMainMintTransactionResult) C54907xZt.OLrzqt(RuneMainMintTransactionResult.Companion.serializer(), string);
    }

    public final java.lang.String AEQbTJ(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "brc20_generate_buyer_tx", transactionParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String KWHzl(@NotNull InvokeMethodParams invokeMethodParams) {
        Intrinsics.checkNotNullParameter(invokeMethodParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "invoke_method", invokeMethodParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AEQbTJ(@NotNull InvokeMethodParams invokeMethodParams) {
        Intrinsics.checkNotNullParameter(invokeMethodParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "invoke_method_no_key", invokeMethodParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final CalUTXOInfo KWHzl(@NotNull SignParams signParams, @NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "utxo_fee", TransactionParams.Companion.AEQbTJ(signParams, uTXOTransaction), false, 4, null);
        if (objDispatch$default instanceof JSONObject) {
            java.lang.String string = ((JSONObject) objDispatch$default).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            CalUTXOInfo calUTXOInfo = (CalUTXOInfo) C33490mxT.EZpvd(string, CalUTXOInfo.class);
            return calUTXOInfo == null ? new CalUTXOInfo() : calUTXOInfo;
        }
        return new CalUTXOInfo();
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "eth_cal_txid", C56424yEw.gEmmrt(C56390yDp.OLrzqt("rawTransaction", str), C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(j))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "eth_cal_eip712hash", C56423yEv.EZpvd(C56390yDp.OLrzqt("typedData", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "eth_cal_eip712hash_with_typed_data_hash", C56424yEw.gEmmrt(C56390yDp.OLrzqt("domainSeparator", str), C56390yDp.OLrzqt("typedDataHash", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "eth_token_transfer_data", C56424yEw.gEmmrt(C56390yDp.OLrzqt("to", str), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "eth_sign_message", C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("message", str2), C56390yDp.OLrzqt("addPrefix", java.lang.Boolean.valueOf(z))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "eth_ec_recover", C56424yEw.gEmmrt(C56390yDp.OLrzqt("message", str), C56390yDp.OLrzqt("signature", str2), C56390yDp.OLrzqt("addPrefix", java.lang.String.valueOf(z))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, long j, @NotNull SigData sigData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sigData, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "eth_sign_transaction", C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(j)), C56390yDp.OLrzqt("sigData", sigData)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String EZpvd(long j, @NotNull SigData sigData) {
        Intrinsics.checkNotNullParameter(sigData, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "eth_generate_unsigned_transaction", C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(j)), C56390yDp.OLrzqt("sigData", sigData)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AYXKKw(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "tron_cal_data", C56424yEw.gEmmrt(C56390yDp.OLrzqt("to", str), C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str2), C56390yDp.OLrzqt(FirebaseAnalytics.Param.METHOD, str3)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AuCTelauCTel(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "tron_cal_address", C56423yEv.EZpvd(C56390yDp.OLrzqt("hex", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "tron_sign_message", C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("message", str2), C56390yDp.OLrzqt("addPrefix", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("version", java.lang.Integer.valueOf(i))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AEQbTJ(@NotNull TronSignContract tronSignContract) {
        Intrinsics.checkNotNullParameter(tronSignContract, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "tron_sign_contract", tronSignContract, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull TronSignData tronSignData, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tronSignData, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "tron_sign_transaction", C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("sigData", new GsonBuilder().disableHtmlEscaping().create().toJson(tronSignData)), C56390yDp.OLrzqt("expiration", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "sol_find_program_address", C56424yEw.gEmmrt(C56390yDp.OLrzqt(JwtUtilsKt.DID_METHOD_KEY, str), C56390yDp.OLrzqt("programId", str2), C56390yDp.OLrzqt("pubKeys", str3)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String DbNXlk(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "sol_sign_dapp_messages", C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("messages", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String fetchVPNInfo(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "sol_sign_message", C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("message", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AuCTel(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "sol_sign_messages", C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("messages", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String copydefault(@NotNull SignParams signParams, @NotNull OpCalDataTransaction opCalDataTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(opCalDataTransaction, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "op_cal_data", TransactionParams.Companion.AEQbTJ(signParams, opCalDataTransaction), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "aptos_sign_message", C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("message", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "aptos_expand_address", C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AubY(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "zk_pack_amount", C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String OLrzqt(@NotNull SuiTxData suiTxData) {
        Intrinsics.checkNotNullParameter(suiTxData, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "sui_tx_bytes", suiTxData, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String OLrzqt(@NotNull SuiTokenTxData suiTokenTxData) {
        Intrinsics.checkNotNullParameter(suiTokenTxData, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "sui_token_tx_bytes", suiTokenTxData, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String copydefault(@NotNull StacksTransaction stacksTransaction) {
        Intrinsics.checkNotNullParameter(stacksTransaction, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "stacks_tx_bytes", stacksTransaction, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AEQbTJ(@NotNull StacksContractTransaction stacksContractTransaction) {
        Intrinsics.checkNotNullParameter(stacksContractTransaction, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "stacks_contract_call_tx_bytes", stacksContractTransaction, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String hDKMBd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "stacks_transform_private_key", C56423yEv.EZpvd(C56390yDp.OLrzqt("prvKey", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "cosmos_compress_pub_key", C56423yEv.EZpvd(C56390yDp.OLrzqt("publicKey", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final CosmosSignDocTransaction OLrzqt(@NotNull CosmosFeeAmountAndGas cosmosFeeAmountAndGas, CosmosSignDocTransaction cosmosSignDocTransaction) {
        Intrinsics.checkNotNullParameter(cosmosFeeAmountAndGas, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "cosmos_reset_data", C56424yEw.gEmmrt(C56390yDp.OLrzqt("feeData", cosmosFeeAmountAndGas), C56390yDp.OLrzqt("signDocData", cosmosSignDocTransaction)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return (CosmosSignDocTransaction) C33490mxT.EZpvd(string != null ? string : "", CosmosSignDocTransaction.class);
    }

    public final java.lang.String fARcdN(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "starknet_sign_message", C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("message", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String valueOf(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "kaspa_sign_message", C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("message", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "btc_sign_message", C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("message", str3), C56390yDp.OLrzqt("type", str4), C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "btc_sign_psbt", C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("sigData", obj)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "btc_sign_psbts", C56424yEw.gEmmrt(C56390yDp.OLrzqt("prvKey", str), C56390yDp.OLrzqt("sigData", obj)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, long j, boolean z, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "get_nostr_prvkey", C56424yEw.gEmmrt(C56390yDp.OLrzqt("mnemonic", str), C56390yDp.OLrzqt("language", str2), C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(j)), C56390yDp.OLrzqt("mainNetWork", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("addressIndex", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("addressType", java.lang.Integer.valueOf(i2))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String getFieldNames(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "parse_bech32_address_hrp", C56423yEv.EZpvd(C56390yDp.OLrzqt(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "decode_tx", C56424yEw.gEmmrt(C56390yDp.OLrzqt("rawTx", str), C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(j))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "cal_tx_hash", C56424yEw.gEmmrt(C56390yDp.OLrzqt("rawTx", str), C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(j))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "btc_extract_tx_from_signed_psbt", C56423yEv.EZpvd(C56390yDp.OLrzqt("signedPsbtHex", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String OLrzqt(@NotNull UnsignedTx unsignedTx) {
        Intrinsics.checkNotNullParameter(unsignedTx, "");
        java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(unsignedTx);
        Intrinsics.checkNotNullExpressionValue(json, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "generate_unsigned_raw_transaction", C33490mxT.OLrzqt(json), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String EZpvd(@NotNull RawData rawData) {
        Intrinsics.checkNotNullParameter(rawData, "");
        java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(rawData);
        Intrinsics.checkNotNullExpressionValue(json, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "generate_raw_transaction", C33490mxT.OLrzqt(json), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String KWHzl(@NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(uTXOTransaction);
        Intrinsics.checkNotNullExpressionValue(json, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "keystone_generate_unsigned_psbt", C33490mxT.OLrzqt(json), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "keystone_signed_psbt_to_tx", C56423yEv.EZpvd(C56390yDp.OLrzqt("psbtHex", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String copydefault(@NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(uTXOTransaction);
        Intrinsics.checkNotNullExpressionValue(json, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "route_onekey_build_btc_tx", C33490mxT.OLrzqt(json), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String zLjUOn(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "zip_string", C56423yEv.EZpvd(C56390yDp.OLrzqt("value", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String wlaJM(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "unzip_string", C56423yEv.EZpvd(C56390yDp.OLrzqt("value", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.util.List<DerivePath> copydefault(@NotNull java.util.List<ChainInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "get_derive_path", list, false, 4, null);
        if (objDispatch$default instanceof JSONArray) {
            KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(DerivePath.Companion.serializer());
            java.lang.String string = ((JSONArray) objDispatch$default).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return (java.util.List) C54907xZt.OLrzqt(kSerializerListSerializer, string);
        }
        return yDY.AhwBna();
    }

    public final java.lang.String AEQbTJ(@NotNull CallDataParams callDataParams) {
        Intrinsics.checkNotNullParameter(callDataParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "generate_call_data", callDataParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String EZpvd(@NotNull CallDataParams callDataParams) {
        Intrinsics.checkNotNullParameter(callDataParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "decode_rpc_data", callDataParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final long copydefault(long j, @NotNull java.lang.String str) {
        java.lang.String string;
        java.lang.Long fieldNames;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "generate_coin_id", C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(j)), C56390yDp.OLrzqt("contractAddress", str)), false, 4, null);
        if (objDispatch$default == null || (string = objDispatch$default.toString()) == null || (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(string)) == null) {
            return -1L;
        }
        return fieldNames.longValue();
    }

    public final java.lang.String fetchVPNInfo(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "btc_get_publickey_by_addresstype", C56423yEv.EZpvd(C56390yDp.OLrzqt("publicKeyHex", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String KWHzl(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Integer num, java.lang.String str5) {
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_key_reshare", C56424yEw.gEmmrt(C56390yDp.OLrzqt("step", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("mpcId", str), C56390yDp.OLrzqt("serverStepData", str2), C56390yDp.OLrzqt("localShareEcdsa", str3), C56390yDp.OLrzqt("localShareEd25519", str4), C56390yDp.OLrzqt("shareNumber", num), C56390yDp.OLrzqt("aesKey", str5)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.util.List<WalletAddressList> EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<HDWalletCoin> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_generate_wallets", C56424yEw.gEmmrt(C56390yDp.OLrzqt("ecdsaPublicKey", str), C56390yDp.OLrzqt("ecdsaChainCode", str2), C56390yDp.OLrzqt("ed25519PublicKey", str3), C56390yDp.OLrzqt("ed25519ChainCode", str4), C56390yDp.OLrzqt("Coins", list)), false, 4, null);
        if (objDispatch$default instanceof JSONArray) {
            KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(WalletAddressList.Companion.serializer());
            java.lang.String string = ((JSONArray) objDispatch$default).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return (java.util.List) C54907xZt.OLrzqt(kSerializerListSerializer, string);
        }
        return yDY.AhwBna();
    }

    public final CurveInfo copydefault(long j) {
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_get_curve_info", C56423yEv.EZpvd(C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(j))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (CurveInfo) C33490mxT.EZpvd(string, CurveInfo.class);
    }

    public final java.lang.String AEQbTJ(long j, int i) {
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_get_coin_path", C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(j)), C56390yDp.OLrzqt("addressIndex", java.lang.Integer.valueOf(i))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String OLrzqt() {
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_get_aes_key", null, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String fJNWhG(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_get_encrypted_aes_key", C56423yEv.EZpvd(C56390yDp.OLrzqt("aesKey", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String KWHzl(@NotNull ECDSA ecdsa) {
        Intrinsics.checkNotNullParameter(ecdsa, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_sign_ecdsa", ecdsa, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String OLrzqt(@NotNull MPCeCDSAToHEX mPCeCDSAToHEX) {
        Intrinsics.checkNotNullParameter(mPCeCDSAToHEX, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_share2_to_hex", mPCeCDSAToHEX, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AEQbTJ(@NotNull ED25519 ed25519) {
        Intrinsics.checkNotNullParameter(ed25519, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_sign_ed25519", ed25519, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final KeyPair fARcdN(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_generate_key_pair", C56423yEv.EZpvd(C56390yDp.OLrzqt("ecdsaPublicKey", str)), false, 4, null);
        int i = 3;
        java.lang.String str2 = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        if (objDispatch$default instanceof JSONObject) {
            java.lang.String string = ((JSONObject) objDispatch$default).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            KeyPair keyPair = (KeyPair) C33490mxT.EZpvd(string, KeyPair.class);
            return keyPair == null ? new KeyPair(str2, (java.lang.String) (b5 == true ? 1 : 0), i, (DefaultConstructorMarker) (b4 == true ? 1 : 0)) : keyPair;
        }
        return new KeyPair((java.lang.String) (b3 == true ? 1 : 0), (java.lang.String) (b2 == true ? 1 : 0), i, (DefaultConstructorMarker) (b == true ? 1 : 0));
    }

    public final KeyPair EZpvd() {
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_generate_rsa_key_pair", null, false, 4, null);
        int i = 3;
        java.lang.String str = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        if (objDispatch$default instanceof JSONObject) {
            java.lang.String string = ((JSONObject) objDispatch$default).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            KeyPair keyPair = (KeyPair) C33490mxT.EZpvd(string, KeyPair.class);
            return keyPair == null ? new KeyPair(str, (java.lang.String) (b5 == true ? 1 : 0), i, (DefaultConstructorMarker) (b4 == true ? 1 : 0)) : keyPair;
        }
        return new KeyPair((java.lang.String) (b3 == true ? 1 : 0), (java.lang.String) (b2 == true ? 1 : 0), i, (DefaultConstructorMarker) (b == true ? 1 : 0));
    }

    public final java.lang.String values(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_rsa_encode", C56424yEw.gEmmrt(C56390yDp.OLrzqt("message", str), C56390yDp.OLrzqt("publicKey", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AhwBna(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_rsa_decode", C56424yEw.gEmmrt(C56390yDp.OLrzqt("secret", str), C56390yDp.OLrzqt("privateKey", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String djBIcL(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_aes_qr_encode", C56424yEw.gEmmrt(C56390yDp.OLrzqt("message", str), C56390yDp.OLrzqt("accountId", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String AYXKKw(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_aes_qr_decode", C56424yEw.gEmmrt(C56390yDp.OLrzqt("secret", str), C56390yDp.OLrzqt("accountId", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String ejfBZ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_generate_share_sign", C56424yEw.gEmmrt(C56390yDp.OLrzqt("ecdsaShare", str), C56390yDp.OLrzqt("timestamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final TxMessage copydefault(@NotNull UnsignedTx unsignedTx) {
        Intrinsics.checkNotNullParameter(unsignedTx, "");
        java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(unsignedTx);
        Intrinsics.checkNotNullExpressionValue(json, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_generate_unsigned_raw_transaction", C33490mxT.OLrzqt(json), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (TxMessage) C54907xZt.OLrzqt(TxMessage.Companion.serializer(), string);
    }

    public final java.lang.String copydefault(@NotNull RawData rawData) {
        Intrinsics.checkNotNullParameter(rawData, "");
        java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(rawData);
        Intrinsics.checkNotNullExpressionValue(json, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_generate_raw_transaction", C33490mxT.OLrzqt(json), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.util.List<MpcPrivateKey> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<HDWalletCoin> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_generate_escape_private_keys", C56424yEw.gEmmrt(C56390yDp.OLrzqt("ecdsaShare2", str), C56390yDp.OLrzqt("ecdsaShare3", str2), C56390yDp.OLrzqt("ed25519Share2", str3), C56390yDp.OLrzqt("ed25519Share3", str4), C56390yDp.OLrzqt("coins", list)), false, 4, null);
        if (objDispatch$default instanceof JSONArray) {
            KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(MpcPrivateKey.Companion.serializer());
            java.lang.String string = ((JSONArray) objDispatch$default).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return (java.util.List) C54907xZt.OLrzqt(kSerializerListSerializer, string);
        }
        return yDY.AhwBna();
    }

    public final java.lang.String gEmmrt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_parse_share_info", C56424yEw.gEmmrt(C56390yDp.OLrzqt("ecdsaShare", str), C56390yDp.OLrzqt("ed25519Share", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final TxMessage OLrzqt(long j, @NotNull SigData sigData) {
        Intrinsics.checkNotNullParameter(sigData, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_eth_generate_unsigned_transaction", C56424yEw.gEmmrt(C56390yDp.OLrzqt("chainId", java.lang.Long.valueOf(j)), C56390yDp.OLrzqt("sigData", sigData)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (TxMessage) C54907xZt.OLrzqt(TxMessage.Companion.serializer(), string);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_eth_generate_unsigned_message", C56424yEw.gEmmrt(C56390yDp.OLrzqt("message", str), C56390yDp.OLrzqt("addPrefix", java.lang.Boolean.valueOf(z))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_eth_generate_signed_message", C56424yEw.gEmmrt(C56390yDp.OLrzqt("r", str), C56390yDp.OLrzqt(com.ibm.icu.text.DateFormat.SECOND, str2), C56390yDp.OLrzqt(com.ibm.icu.text.DateFormat.ABBR_GENERIC_TZ, str3)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final TxMessage AEQbTJ(@NotNull TronGenerateUnsignedContract tronGenerateUnsignedContract) {
        Intrinsics.checkNotNullParameter(tronGenerateUnsignedContract, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_tron_unsigned_contract", tronGenerateUnsignedContract, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (TxMessage) C54907xZt.OLrzqt(TxMessage.Companion.serializer(), string);
    }

    public final TxMessage copydefault(@NotNull TronSignData tronSignData, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(tronSignData, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_tron_unsigned_transaction", C56424yEw.gEmmrt(C56390yDp.OLrzqt("sigData", new GsonBuilder().disableHtmlEscaping().create().toJson(tronSignData)), C56390yDp.OLrzqt("expiration", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (TxMessage) C54907xZt.OLrzqt(TxMessage.Companion.serializer(), string);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_tron_generate_unsigned_message", C56424yEw.gEmmrt(C56390yDp.OLrzqt("message", str), C56390yDp.OLrzqt("addPrefix", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("version", java.lang.Integer.valueOf(i))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_tron_generate_signed_message", C56424yEw.gEmmrt(C56390yDp.OLrzqt("r", str), C56390yDp.OLrzqt(com.ibm.icu.text.DateFormat.SECOND, str2), C56390yDp.OLrzqt(com.ibm.icu.text.DateFormat.ABBR_GENERIC_TZ, str3)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final TxMessage KWHzl(@NotNull java.lang.String str, @NotNull CosmosTransactionData cosmosTransactionData, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cosmosTransactionData, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "mpc_cosmos_generate_unsigned_message", C56424yEw.gEmmrt(C56390yDp.OLrzqt("publicKey", str), C56390yDp.OLrzqt("message", cosmosTransactionData), C56390yDp.OLrzqt("signType", java.lang.Integer.valueOf(i))), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (TxMessage) C54907xZt.OLrzqt(TxMessage.Companion.serializer(), string);
    }

    public final BRC20TransactionResult gEmmrt(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "brc20_mpc_unsigned_mint_tx", transactionParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (BRC20TransactionResult) C54907xZt.OLrzqt(BRC20TransactionResult.Companion.serializer(), string);
    }

    public final BRC20TransactionResult KWHzl(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "brc20_mpc_signed_mint_tx", transactionParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (BRC20TransactionResult) C54907xZt.OLrzqt(BRC20TransactionResult.Companion.serializer(), string);
    }

    public final DummySignedTx AYXKKw(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "brc20_mpc_unsigned_dummy_tx", transactionParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (DummySignedTx) C54907xZt.OLrzqt(DummySignedTx.Companion.serializer(), string);
    }

    public final DummySignedTx OLrzqt(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "brc20_mpc_signed_dummy_tx", transactionParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (DummySignedTx) C54907xZt.OLrzqt(DummySignedTx.Companion.serializer(), string);
    }

    public final MPCBRC20PsbtResult AhwBna(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "brc20_mpc_unsigned_psbt_buy_tx", transactionParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (MPCBRC20PsbtResult) C54907xZt.OLrzqt(MPCBRC20PsbtResult.Companion.serializer(), string);
    }

    public final MPCBRC20PsbtResult EZpvd(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "brc20_mpc_signed_psbt_buy_tx", transactionParams, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (MPCBRC20PsbtResult) C54907xZt.OLrzqt(MPCBRC20PsbtResult.Companion.serializer(), string);
    }

    public final MPCBRC20PsbtResult EZpvd(@NotNull MPCBtcMessage mPCBtcMessage) {
        Intrinsics.checkNotNullParameter(mPCBtcMessage, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "btc_mpc_unsigned_message", mPCBtcMessage, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (MPCBRC20PsbtResult) C54907xZt.OLrzqt(MPCBRC20PsbtResult.Companion.serializer(), string);
    }

    public final MPCBRC20PsbtResult AEQbTJ(@NotNull MPCBtcMessage mPCBtcMessage) {
        Intrinsics.checkNotNullParameter(mPCBtcMessage, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "btc_mpc_signed_message", mPCBtcMessage, false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (MPCBRC20PsbtResult) C54907xZt.OLrzqt(MPCBRC20PsbtResult.Companion.serializer(), string);
    }

    public final MPCBRC20PsbtResult EZpvd(@NotNull MPCRawPsbtTx mPCRawPsbtTx) {
        Intrinsics.checkNotNullParameter(mPCRawPsbtTx, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "brc20_mpc_unsigned_raw_psbt_tx", C56423yEv.EZpvd(C56390yDp.OLrzqt("sigData", mPCRawPsbtTx)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (MPCBRC20PsbtResult) C54907xZt.OLrzqt(MPCBRC20PsbtResult.Companion.serializer(), string);
    }

    public final MPCBRC20PsbtResult copydefault(@NotNull MPCRawPsbtTx mPCRawPsbtTx) {
        Intrinsics.checkNotNullParameter(mPCRawPsbtTx, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "brc20_mpc_signed_raw_psbt_tx", C56423yEv.EZpvd(C56390yDp.OLrzqt("sigData", mPCRawPsbtTx)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (MPCBRC20PsbtResult) C54907xZt.OLrzqt(MPCBRC20PsbtResult.Companion.serializer(), string);
    }

    public final java.util.List<AAPaymasterDataAndSignature> AEQbTJ(@NotNull AAPaymasterAndTokenParams aAPaymasterAndTokenParams) {
        Intrinsics.checkNotNullParameter(aAPaymasterAndTokenParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "aa_paymaster_token", aAPaymasterAndTokenParams, false, 4, null);
        java.util.List<AAPaymasterDataAndSignature> list = null;
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string != null && string.length() != 0 && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            list = (java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(AAPaymasterDataAndSignature.Companion.serializer()), string);
        }
        return list == null ? yDY.AhwBna() : list;
    }

    public final java.util.List<AAPaymasterDataAndSignatureV7> EZpvd(@NotNull AAPaymasterAndTokenParamsV7 aAPaymasterAndTokenParamsV7) {
        Intrinsics.checkNotNullParameter(aAPaymasterAndTokenParamsV7, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "aa_sign_paymaster_token_v7", aAPaymasterAndTokenParamsV7, false, 4, null);
        java.util.List<AAPaymasterDataAndSignatureV7> list = null;
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string != null && string.length() != 0 && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            list = (java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(AAPaymasterDataAndSignatureV7.Companion.serializer()), string);
        }
        return list == null ? yDY.AhwBna() : list;
    }

    public final AAParseInitCode AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "aa_parse_init_code", C56423yEv.EZpvd(C56390yDp.OLrzqt("initCode", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (AAParseInitCode) C54907xZt.OLrzqt(AAParseInitCode.Companion.serializer(), string);
    }

    public final AAGenOriPaymasterTokenV7 copydefault(@NotNull java.lang.String str, int i, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "aa_gen_ori_paymaster_token_v7", C56424yEw.gEmmrt(C56390yDp.OLrzqt("token", str), C56390yDp.OLrzqt(OtcExtraKeys.MODE, java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("businessId", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (AAGenOriPaymasterTokenV7) C54907xZt.OLrzqt(AAGenOriPaymasterTokenV7.Companion.serializer(), string);
    }

    public final AAParsePaymasterDataV7 copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "aa_parse_paymaster_data_v7", C56423yEv.EZpvd(C56390yDp.OLrzqt("payMasterAndData", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (AAParsePaymasterDataV7) C54907xZt.OLrzqt(AAParsePaymasterDataV7.Companion.serializer(), string);
    }

    public final HPKEKeypair ejfBZ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "tee_generate_hpke_keypair", C56424yEw.gEmmrt(C56390yDp.OLrzqt("seedHex", str), C56390yDp.OLrzqt("salt", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (HPKEKeypair) C54907xZt.OLrzqt(HPKEKeypair.Companion.serializer(), string);
    }

    public final TeeAttestationVerifyData iwGUEr(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "tee_attestation_verify", C56423yEv.EZpvd(C56390yDp.OLrzqt("attestationDocHex", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (TeeAttestationVerifyData) C54907xZt.OLrzqt(TeeAttestationVerifyData.Companion.serializer(), string);
    }

    public final boolean AhwBna(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "tee_rsa_verify", C56424yEw.gEmmrt(C56390yDp.OLrzqt("message", str), C56390yDp.OLrzqt("pubKey", str2), C56390yDp.OLrzqt("signature", str3)), false, 4, null);
        TeeRsaVerifyData teeRsaVerifyData = null;
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string != null && string.length() != 0 && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            teeRsaVerifyData = (TeeRsaVerifyData) C54907xZt.OLrzqt(TeeRsaVerifyData.Companion.serializer(), string);
        }
        if (teeRsaVerifyData != null) {
            return Intrinsics.EZpvd(teeRsaVerifyData.getValidate(), java.lang.Boolean.TRUE);
        }
        return false;
    }

    public final java.lang.String fIwbmz(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "tee_rsa_enc", C56424yEw.gEmmrt(C56390yDp.OLrzqt("plaintext", str), C56390yDp.OLrzqt("pubKey", str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final HPKEEncryptData AEQbTJ(@NotNull java.util.List<PrivateKeyOriginData> list, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "tee_hpke_seal", C56424yEw.gEmmrt(C56390yDp.OLrzqt("sealItems", list), C56390yDp.OLrzqt("associatedDataHex", str), C56390yDp.OLrzqt("receiverPubKeyHex", str2), C56390yDp.OLrzqt("senderPriKeyHex", str3)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string == null || string.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            return null;
        }
        return (HPKEEncryptData) C54907xZt.OLrzqt(HPKEEncryptData.Companion.serializer(), string);
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "tee_hpke_open", C56424yEw.gEmmrt(C56390yDp.OLrzqt("ciphertextHex", str), C56390yDp.OLrzqt("associatedDataHex", str2), C56390yDp.OLrzqt("encapsulatedKeyHex", str3), C56390yDp.OLrzqt("receiverPriKeyHex", str4), C56390yDp.OLrzqt("senderPubKeyHex", str5)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return (string != null ? string : "").length() > 0;
    }

    public final boolean KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "tee_ed25519_verify", C56424yEw.gEmmrt(C56390yDp.OLrzqt("message", str), C56390yDp.OLrzqt("pubKeyHex", str2), C56390yDp.OLrzqt("signatureBase64", str3)), false, 4, null);
        TeeRsaVerifyData teeRsaVerifyData = null;
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        if (string != null && string.length() != 0 && (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) string))) {
            teeRsaVerifyData = (TeeRsaVerifyData) C54907xZt.OLrzqt(TeeRsaVerifyData.Companion.serializer(), string);
        }
        if (teeRsaVerifyData != null) {
            return Intrinsics.EZpvd(teeRsaVerifyData.getValidate(), java.lang.Boolean.TRUE);
        }
        return false;
    }

    public final KeyPair values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "generate_key_pair_with_privateKey", C56423yEv.EZpvd(C56390yDp.OLrzqt("prvKey", str)), false, 4, null);
        int i = 3;
        java.lang.String str2 = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        if (objDispatch$default instanceof JSONObject) {
            java.lang.String string = ((JSONObject) objDispatch$default).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            KeyPair keyPair = (KeyPair) C33490mxT.EZpvd(string, KeyPair.class);
            return keyPair == null ? new KeyPair(str2, (java.lang.String) (b5 == true ? 1 : 0), i, (DefaultConstructorMarker) (b4 == true ? 1 : 0)) : keyPair;
        }
        return new KeyPair((java.lang.String) (b3 == true ? 1 : 0), (java.lang.String) (b2 == true ? 1 : 0), i, (DefaultConstructorMarker) (b == true ? 1 : 0));
    }

    public final java.lang.String isConnected(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "tee_sha256_sum", C56423yEv.EZpvd(C56390yDp.OLrzqt("message", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "aes_encrypt", C56424yEw.gEmmrt(C56390yDp.OLrzqt("message", str), C56390yDp.OLrzqt(JwtUtilsKt.DID_METHOD_KEY, str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "aes_decrypt", C56424yEw.gEmmrt(C56390yDp.OLrzqt("secret", str), C56390yDp.OLrzqt(JwtUtilsKt.DID_METHOD_KEY, str2)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "base58_encode", C56423yEv.EZpvd(C56390yDp.OLrzqt("message", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "base58_decode", C56423yEv.EZpvd(C56390yDp.OLrzqt("message", str)), false, 4, null);
        java.lang.String string = objDispatch$default != null ? objDispatch$default.toString() : null;
        return string == null ? "" : string;
    }

    public final java.lang.String DbNXlk(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Web3SecurityBridge.INSTANCE.hexStringToString(str);
    }

    public final java.lang.String getNewProxyInstance(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Web3SecurityBridge.INSTANCE.stringToHexString(str);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return Web3SecurityBridge.INSTANCE.encodeABI(str, str2, str3);
    }

    public final java.lang.String fIwbmz(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Web3SecurityBridge.INSTANCE.hexToBase58(str);
    }

    public final java.lang.String AuCTel(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Web3SecurityBridge.INSTANCE.hexToBase64(str);
    }

    public final java.util.List<PsbtDecodeItem> EZpvd(@NotNull PsbtDecodeParams psbtDecodeParams) {
        Intrinsics.checkNotNullParameter(psbtDecodeParams, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "btc_decode_psbts", psbtDecodeParams, false, 4, null);
        java.lang.String str = objDispatch$default instanceof java.lang.String ? (java.lang.String) objDispatch$default : null;
        if (str == null) {
            return yDY.AhwBna();
        }
        java.util.List list = (java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.ListSerializer(PsbtDecodeItemDetails.Companion.serializer())), str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = psbtDecodeParams.getHexList().size();
        for (int i = 0; i < size; i++) {
            if (i >= 0 && i < list.size()) {
                arrayList.add(new PsbtDecodeItem(psbtDecodeParams.getHexList().get(i), (java.util.List) list.get(i)));
            }
        }
        return arrayList;
    }

    public final java.util.List<PsbtDecodeNewItem> copydefault(@NotNull PsbtDecodeParamsNew psbtDecodeParamsNew) {
        Intrinsics.checkNotNullParameter(psbtDecodeParamsNew, "");
        java.lang.Object objDispatch$default = dispatch$default(this, "btc_decode_psbts", psbtDecodeParamsNew, false, 4, null);
        java.lang.String str = objDispatch$default instanceof java.lang.String ? (java.lang.String) objDispatch$default : null;
        if (str == null) {
            return yDY.AhwBna();
        }
        return (java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(PsbtDecodeNewItem.Companion.serializer()), str);
    }

    public static /* synthetic */ java.lang.Object dispatch$default(xXV xxv, java.lang.String str, java.lang.Object obj, boolean z, int i, java.lang.Object obj2) {
        if ((i & 4) != 0) {
            z = true;
        }
        return xxv.AEQbTJ(str, obj, z);
    }

    public final java.lang.Object AEQbTJ(java.lang.String str, java.lang.Object obj, boolean z) {
        return Web3SecurityBridge.INSTANCE.dispatch(str, obj, z);
    }

    public final java.lang.String valueOf(java.lang.String str) {
        return C54909xZv.OLrzqt.AEQbTJ(C43246rlf.OLrzqt.valueOf(), str);
    }
}
