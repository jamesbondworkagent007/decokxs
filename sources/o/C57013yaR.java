package o;

import com.keystone.module.CashInput;
import com.keystone.module.CashTx;
import com.keystone.module.DecodeResult;
import com.keystone.module.EthSignRequest;
import com.keystone.module.Input;
import com.keystone.module.KeystoneSignRequest;
import com.keystone.module.LtcTx;
import com.keystone.module.MultiAccounts;
import com.keystone.module.Note;
import com.keystone.module.Output;
import com.keystone.module.TokenInfo;
import com.keystone.module.TronSignRequest;
import com.keystone.module.TronSignature;
import com.keystone.module.UTXO;
import com.keystone.sdk.KeystoneBitcoinSDK;
import com.keystone.sdk.KeystoneEthereumSDK;
import com.keystone.sdk.KeystoneSDK;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.hardware.api.keystone.KeystoneAccount;
import com.okinc.wallet.hardware.api.keystone.KeystoneEvmSignType;
import com.okinc.wallet.hardware.api.keystone.KeystoneMultiAccount;
import com.okinc.wallet.hardware.api.keystone.KeystoneSignResult;
import com.okinc.wallet.hardware.api.keystone.KeystoneTokenInfo;
import com.okinc.wallet.hardware.api.keystone.ParseKeystoneAccountsResp;
import com.okinc.wallet.hardware.api.keystone.ParseKeystoneSignResp;
import com.okinc.wallet.hardware.api.keystone.RSV;
import com.sparrowwallet.hummingbird.UREncoder;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yaR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57013yaR {
    public final KeystoneSDK AEQbTJ;
    public final AbstractC58253yxm KWHzl;
    public DecodeResult copydefault;

    /* JADX INFO: renamed from: o.yaR$TaskDescription */
    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[KeystoneEvmSignType.values().length];
            try {
                iArr[KeystoneEvmSignType.Legacy.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[KeystoneEvmSignType.EIP1559.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[KeystoneEvmSignType.PersonalMessage.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[KeystoneEvmSignType.TypeMessage.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    public C57013yaR(@NotNull KeystoneSDK keystoneSDK, @NotNull AbstractC58253yxm abstractC58253yxm) {
        Intrinsics.checkNotNullParameter(keystoneSDK, "");
        Intrinsics.checkNotNullParameter(abstractC58253yxm, "");
        this.AEQbTJ = keystoneSDK;
        this.KWHzl = abstractC58253yxm;
    }

    public final ParseKeystoneAccountsResp OLrzqt(com.sparrowwallet.hummingbird.UR ur) {
        java.lang.String device;
        try {
            MultiAccounts multiAccounts = this.AEQbTJ.parseMultiAccounts(ur);
            java.lang.String deviceId = multiAccounts.getDeviceId();
            if (deviceId == null || deviceId.length() == 0 || (device = multiAccounts.getDevice()) == null || device.length() == 0 || multiAccounts.getMasterFingerprint().length() == 0 || multiAccounts.getKeys().isEmpty()) {
                throw new java.lang.IllegalArgumentException("MultiAccount value(s) are null or empty");
            }
            java.lang.String masterFingerprint = multiAccounts.getMasterFingerprint();
            java.lang.String device2 = multiAccounts.getDevice();
            java.lang.String deviceId2 = multiAccounts.getDeviceId();
            java.lang.String deviceVersion = multiAccounts.getDeviceVersion();
            java.util.List<com.keystone.module.Account> keys = multiAccounts.getKeys();
            java.util.ArrayList<com.keystone.module.Account> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : keys) {
                com.keystone.module.Account account = (com.keystone.module.Account) obj;
                if (account.getExtra().getOkx().getChainId() != 0 || !Intrinsics.EZpvd(CollectionsKt___CollectionsKt.AkhnZx(StringsKt__StringsKt.split$default((java.lang.CharSequence) account.getPath(), new java.lang.String[]{"/"}, false, 0, 6, (java.lang.Object) null), 1), (java.lang.Object) "86'")) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            for (com.keystone.module.Account account2 : arrayList) {
                arrayList2.add(new KeystoneAccount(account2.getChain(), account2.getExtra().getOkx().getChainId(), account2.getPath(), account2.getChainCode(), account2.getPublicKey(), account2.getExtendedPublicKey(), Intrinsics.EZpvd((java.lang.Object) account2.getNote(), (java.lang.Object) Note.LEDGER_LIVE.getValue())));
            }
            return new ParseKeystoneAccountsResp(100, new KeystoneMultiAccount(masterFingerprint, device2, deviceId2, deviceVersion, arrayList2));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("KeystoneSDKManager", "Failed to parse decoded result: " + e.getMessage(), e);
            return new ParseKeystoneAccountsResp(-1, null);
        }
    }

    public final ParseKeystoneAccountsResp AEQbTJ(@NotNull java.lang.String str) {
        DecodeResult decodeResultDecodeQR;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            decodeResultDecodeQR = this.AEQbTJ.decodeQR(str);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("KeystoneSDKManager", "Failed to decode QR: " + e.getMessage(), e);
            decodeResultDecodeQR = null;
        }
        this.copydefault = decodeResultDecodeQR;
        if (decodeResultDecodeQR == null) {
            this.AEQbTJ.resetQRDecoder();
            return new ParseKeystoneAccountsResp(-1, null);
        }
        if (decodeResultDecodeQR.getProgress() == 100) {
            com.sparrowwallet.hummingbird.UR ur = decodeResultDecodeQR.getUr();
            if (ur == null) {
                return new ParseKeystoneAccountsResp(decodeResultDecodeQR.getProgress(), null);
            }
            this.AEQbTJ.resetQRDecoder();
            return OLrzqt(ur);
        }
        return new ParseKeystoneAccountsResp(decodeResultDecodeQR.getProgress(), null);
    }

    public final AbstractC58185ywX<java.lang.String> OLrzqt(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull KeystoneEvmSignType keystoneEvmSignType, @NotNull java.lang.String str4) {
        KeystoneEthereumSDK.DataType dataType;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(keystoneEvmSignType, "");
        Intrinsics.checkNotNullParameter(str4, "");
        KeystoneEthereumSDK eth = this.AEQbTJ.getEth();
        int i = TaskDescription.KWHzl[keystoneEvmSignType.ordinal()];
        if (i == 1) {
            dataType = KeystoneEthereumSDK.DataType.Transaction;
        } else if (i == 2) {
            dataType = KeystoneEthereumSDK.DataType.TypedTransaction;
        } else if (i == 3) {
            dataType = KeystoneEthereumSDK.DataType.PersonalMessage;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            dataType = KeystoneEthereumSDK.DataType.TypedData;
        }
        return OLrzqt(eth.generateSignRequest(new EthSignRequest(str, str4, dataType, C33129mqd.AhwBna(java.lang.Long.valueOf(j)), str2, str3, null, "OKX Wallet", 64, null)));
    }

    public final AbstractC58185ywX<java.lang.String> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        KeystoneBitcoinSDK btc = this.AEQbTJ.getBtc();
        java.util.List listAYXKKw = C59454zhO.AYXKKw((java.lang.CharSequence) str, 2);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAYXKKw, 10));
        java.util.Iterator it = listAYXKKw.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Byte.valueOf((byte) java.lang.Integer.parseInt((java.lang.String) it.next(), CharsKt__CharJVMKt.checkRadix(16))));
        }
        return OLrzqt(btc.generatePSBT(CollectionsKt___CollectionsKt.DbNXlk(arrayList)));
    }

    public static /* synthetic */ AbstractC58185ywX generateTronTransactionQRCode$default(C57013yaR c57013yaR, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, KeystoneTokenInfo keystoneTokenInfo, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            keystoneTokenInfo = null;
        }
        return c57013yaR.OLrzqt(str, str2, str3, str4, keystoneTokenInfo);
    }

    public final AbstractC58185ywX<java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, KeystoneTokenInfo keystoneTokenInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return OLrzqt(this.AEQbTJ.getTron().generateSignRequest(new TronSignRequest(str, str2, str3, str4, keystoneTokenInfo != null ? new TokenInfo(keystoneTokenInfo.getTokenName(), keystoneTokenInfo.getTokenSymbol(), keystoneTokenInfo.getTokenDecimals()) : null, "OKX Wallet")));
    }

    public static /* synthetic */ AbstractC58185ywX generateLtcTransactionQRCode$default(C57013yaR c57013yaR, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        return c57013yaR.KWHzl(str, str2, str3);
    }

    public final AbstractC58185ywX<java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return OLrzqt(this.AEQbTJ.getLtc().generateSignRequest(new KeystoneSignRequest<>(str2, (LtcTx) EZpvd(str, new Function1() { // from class: o.yaX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57013yaR.AEQbTJ(this.AEQbTJ, (JsonObject) obj);
            }
        }, new yHS() { // from class: o.yaV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHS
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                return C57013yaR.EZpvd((java.util.ArrayList) obj, (java.util.ArrayList) obj2, ((java.lang.Long) obj3).longValue(), (java.lang.String) obj4, ((java.lang.Integer) obj5).intValue());
            }
        }), str3, null, 8, null)));
    }

    public static final java.util.ArrayList AEQbTJ(C57013yaR c57013yaR, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        JsonElement jsonElement = (JsonElement) jsonObject.get("txin");
        java.util.List jsonArray = jsonElement != null ? JsonElementKt.getJsonArray(jsonElement) : null;
        if (jsonArray == null) {
            jsonArray = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(jsonArray, 10));
        java.util.Iterator it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonObject jsonObject2 = JsonElementKt.getJsonObject((JsonElement) it.next());
            arrayList.add(new Input(c57013yaR.OLrzqt(jsonObject2, "tx_id"), C33129mqd.AhwBna(c57013yaR.OLrzqt(jsonObject2, "index")), new UTXO(c57013yaR.OLrzqt(jsonObject2, "publicKey"), C33129mqd.valueOf(c57013yaR.OLrzqt(jsonObject2, "coin_amount")), null, 4, null), c57013yaR.OLrzqt(jsonObject2, "derivationPath")));
        }
        return new java.util.ArrayList(arrayList);
    }

    public static final LtcTx EZpvd(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, long j, java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new LtcTx(arrayList, arrayList2, j, str, i);
    }

    public static /* synthetic */ AbstractC58185ywX generateDashTransactionQRCode$default(C57013yaR c57013yaR, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        return c57013yaR.OLrzqt(str, str2, str3);
    }

    public final AbstractC58185ywX<java.lang.String> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return OLrzqt(this.AEQbTJ.getDash().generateSignRequest(new KeystoneSignRequest<>(str2, EZpvd(str), str3, null, 8, null)));
    }

    public static /* synthetic */ AbstractC58185ywX generateBchTransactionQRCode$default(C57013yaR c57013yaR, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        return c57013yaR.copydefault(str, str2, str3);
    }

    public final AbstractC58185ywX<java.lang.String> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return OLrzqt(this.AEQbTJ.getBch().generateSignRequest(new KeystoneSignRequest<>(str2, EZpvd(str), str3, null, 8, null)));
    }

    /* JADX DEBUG: Type inference failed for r7v1. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<java.lang.String> */
    public final AbstractC58185ywX<java.lang.String> OLrzqt(final UREncoder uREncoder) {
        if (uREncoder.isSinglePart()) {
            AbstractC58185ywX<java.lang.String> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(uREncoder.nextPart());
            Intrinsics.copydefault(abstractC58185ywXKWHzl);
            return abstractC58185ywXKWHzl;
        }
        AbstractC58185ywX<java.lang.Long> abstractC58185ywXKWHzl2 = AbstractC58185ywX.KWHzl(0L, 100L, java.util.concurrent.TimeUnit.MILLISECONDS, this.KWHzl);
        final Function1 function1 = new Function1() { // from class: o.yaZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57013yaR.AEQbTJ(uREncoder, (java.lang.Long) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXKWHzl2.AEQbTJ(new InterfaceC58229yxO() { // from class: o.yaY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return C57013yaR.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.lang.String AEQbTJ(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.lang.String) function1.invoke(obj);
    }

    public static final java.lang.String AEQbTJ(UREncoder uREncoder, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(l, "");
        return uREncoder.nextPart();
    }

    public final RSV OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() >= 130) {
            java.lang.String strSubstring = str.substring(0, 64);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            java.lang.String strSubstring2 = str.substring(64, 128);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
            java.lang.String strSubstring3 = str.substring(128);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "");
            return new RSV(strSubstring, strSubstring2, strSubstring3);
        }
        return new RSV((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (DefaultConstructorMarker) null);
    }

    public final ParseKeystoneSignResp AEQbTJ(@NotNull java.lang.String str, @NotNull Function1<? super com.sparrowwallet.hummingbird.UR, KeystoneSignResult> function1) {
        DecodeResult decodeResultDecodeQR;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            decodeResultDecodeQR = this.AEQbTJ.decodeQR(str);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("KeystoneSDKManager", "Failed to decode QR: " + e.getMessage(), e);
            decodeResultDecodeQR = null;
        }
        this.copydefault = decodeResultDecodeQR;
        if (decodeResultDecodeQR == null) {
            this.AEQbTJ.resetQRDecoder();
            return new ParseKeystoneSignResp(-1, null);
        }
        if (decodeResultDecodeQR.getProgress() == 100) {
            com.sparrowwallet.hummingbird.UR ur = decodeResultDecodeQR.getUr();
            if (ur == null) {
                return new ParseKeystoneSignResp(decodeResultDecodeQR.getProgress(), null);
            }
            this.AEQbTJ.resetQRDecoder();
            try {
                return new ParseKeystoneSignResp(100, function1.invoke(ur));
            } catch (java.lang.Exception e2) {
                pUU.AEQbTJ("KeystoneSDKManager", "Failed to parse decoded result: " + e2.getMessage(), e2);
                return new ParseKeystoneSignResp(-1, null);
            }
        }
        return new ParseKeystoneSignResp(decodeResultDecodeQR.getProgress(), null);
    }

    public final java.lang.String AEQbTJ(@NotNull com.sparrowwallet.hummingbird.UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        return C57137ycj.copydefault.copydefault(this.AEQbTJ.getBtc().parsePSBT(ur));
    }

    public final com.keystone.module.Signature copydefault(@NotNull com.sparrowwallet.hummingbird.UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        return this.AEQbTJ.getEth().parseSignature(ur);
    }

    public final TronSignature valueOf(@NotNull com.sparrowwallet.hummingbird.UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        return this.AEQbTJ.getTron().parseSignature(ur);
    }

    public final com.keystone.module.KeystoneSignResult djBIcL(@NotNull com.sparrowwallet.hummingbird.UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        return this.AEQbTJ.getLtc().parseSignResult(ur);
    }

    public final com.keystone.module.KeystoneSignResult EZpvd(@NotNull com.sparrowwallet.hummingbird.UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        return this.AEQbTJ.getDash().parseSignResult(ur);
    }

    public final com.keystone.module.KeystoneSignResult KWHzl(@NotNull com.sparrowwallet.hummingbird.UR ur) {
        Intrinsics.checkNotNullParameter(ur, "");
        return this.AEQbTJ.getBch().parseSignResult(ur);
    }

    public final CashTx EZpvd(java.lang.String str) {
        return (CashTx) EZpvd(str, new Function1() { // from class: o.yaW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57013yaR.copydefault(this.AEQbTJ, (JsonObject) obj);
            }
        }, new yHS() { // from class: o.ybd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHS
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                return C57013yaR.OLrzqt((java.util.ArrayList) obj, (java.util.ArrayList) obj2, ((java.lang.Long) obj3).longValue(), (java.lang.String) obj4, ((java.lang.Integer) obj5).intValue());
            }
        });
    }

    public static final java.util.ArrayList copydefault(C57013yaR c57013yaR, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "");
        JsonElement jsonElement = (JsonElement) jsonObject.get("txin");
        java.util.List jsonArray = jsonElement != null ? JsonElementKt.getJsonArray(jsonElement) : null;
        if (jsonArray == null) {
            jsonArray = yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(jsonArray, 10));
        java.util.Iterator it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonObject jsonObject2 = JsonElementKt.getJsonObject((JsonElement) it.next());
            arrayList.add(new CashInput(c57013yaR.OLrzqt(jsonObject2, "tx_id"), C33129mqd.AhwBna(c57013yaR.OLrzqt(jsonObject2, "index")), C33129mqd.valueOf(c57013yaR.OLrzqt(jsonObject2, "coin_amount")), c57013yaR.OLrzqt(jsonObject2, "publicKey"), c57013yaR.OLrzqt(jsonObject2, "derivationPath")));
        }
        return new java.util.ArrayList(arrayList);
    }

    public static final CashTx OLrzqt(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, long j, java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new CashTx(arrayList, arrayList2, j, str, i);
    }

    public final <INPUTS, T> T EZpvd(java.lang.String str, Function1<? super JsonObject, ? extends INPUTS> function1, yHS<? super INPUTS, ? super java.util.ArrayList<Output>, ? super java.lang.Long, ? super java.lang.String, ? super java.lang.Integer, ? extends T> yhs) {
        JsonObject jsonObject = JsonElementKt.getJsonObject(Json.Default.parseToJsonElement(str));
        java.lang.String strOLrzqt = OLrzqt(jsonObject, "to");
        long jValueOf = C33129mqd.valueOf(OLrzqt(jsonObject, OtcExtraKeys.AMOUNT));
        long jValueOf2 = C33129mqd.valueOf(OLrzqt(jsonObject, "balance"));
        java.lang.String strOLrzqt2 = OLrzqt(jsonObject, "changeAddress");
        java.lang.String strOLrzqt3 = OLrzqt(jsonObject, "derivationPath");
        long jValueOf3 = C33129mqd.valueOf(OLrzqt(jsonObject, "fee"));
        int iAhwBna = C33129mqd.AhwBna(OLrzqt(jsonObject, "dustLimit"));
        long j = (jValueOf2 - jValueOf) - jValueOf3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new Output(strOLrzqt, jValueOf, false, null, 12, null));
        if (j >= 0) {
            arrayList.add(new Output(strOLrzqt2, j, true, strOLrzqt3));
        }
        return yhs.invoke(function1.invoke(jsonObject), arrayList, java.lang.Long.valueOf(jValueOf3), "OKX Wallet", java.lang.Integer.valueOf(iAhwBna));
    }

    public final java.lang.String OLrzqt(JsonObject jsonObject, java.lang.String str) {
        JsonElement jsonElement = (JsonElement) jsonObject.get((java.lang.Object) str);
        if (jsonElement == null) {
            return "";
        }
        try {
            return JsonElementKt.getJsonPrimitive(jsonElement).getContent();
        } catch (java.lang.IllegalArgumentException unused) {
            return "";
        }
    }
}
