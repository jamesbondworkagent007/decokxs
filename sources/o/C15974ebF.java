package o;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.business.defi.api.bean.CustomNetworkInfo;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.DexDappSubSignArgs;
import com.okinc.business.defi.api.bean.DexTransferData;
import com.okinc.business.defi.api.bean.MpcSignType;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.bean.SignType;
import com.okinc.business.defi.api.bean.TronSignMethodVersion;
import com.okinc.business.defi.biz.walletconnect.WalletAddEthereumChain;
import com.okinc.business.defi.biz.walletconnect.WalletWatchAsset;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppWrapper;
import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.BtcSignRequest;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$constructDAppSignArgs$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$displayToast$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$ensureWalletCoreInit$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$getChainIdFromCaipChainId$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$getChainIdFromCaipChainId$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$getMethodResult$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$getMethodResult$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$getWalletById$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$getWeakContext$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$getWeakContext$3;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$handleSendTransaction$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$handleSign$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onAddEthereumChain$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onAddEthereumChain$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onAptosInteraction$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onAptosInteraction$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onAptosSignMessage$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onAptosSignMessage$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onBtcSendTransaction$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onBtcSendTransaction$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onBtcSign$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onBtcSign$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onBtcSignAndPushPsbt$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onBtcSignAndPushPsbt$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onCosmosSignAmino$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onCosmosSignAmino$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onCosmosSignArbitrary$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onCosmosSignArbitrary$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onCosmosSignDirect$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onCosmosSignDirect$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onEthSendTransaction$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onEthSendTransaction$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onPersonalSign$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onPersonalSign$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onSolInteraction$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onSolInteraction$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onSolSignMessage$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onSolSignMessage$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onStarknetSendTransaction$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onStarknetSendTransaction$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onStarknetSignMessage$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onStarknetSignMessage$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onSuiInteraction$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onSuiInteraction$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onSuiSignMessage$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onSuiSignMessage$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onSwitchEvmChain$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onSwitchEvmChain$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onSyncAllAddresses$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onSyncAllAddresses$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onTronSignAndSendTransaction$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onTronSignAndSendTransaction$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onTronSignMessage$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onTronSignMessage$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onTypedDataSign$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onTypedDataSign$2;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onWatchEvmAsset$1;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onWatchEvmAsset$2;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonPrimitive;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ebF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15974ebF implements InterfaceC16048eca {
    public final CoroutineDispatcher AkhnZx;
    public final C48787ucK AuCTel;
    public final CoroutineDispatcher DbNXlk;
    public final C12827cuN ejfBZ;
    public final C10337bmZ fARcdN;
    public final C57259yez fIwbmz;
    public final Json fetchVPNInfo;
    public final C54819xWm isConnected;
    public final ConcurrentHashMap<java.lang.String, CancellableContinuation<java.lang.String>> values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final java.util.List<java.lang.String> KWHzl = yDY.gEmmrt("wallet_addEthereumChain", "wallet_switchEthereumChain", "wallet_watchAsset", "personal_sign", "eth_signTypedData_v4", "eth_sendTransaction", "kaia_signTransaction");
    public static final java.util.List<java.lang.String> gEmmrt = C56402yEa.EZpvd("ton_sendTransaction");
    public static final java.util.List<java.lang.String> valueOf = yDY.gEmmrt("solana_signMessage", "solana_signTransaction", "solana_signAllTransactions", "solana_signAndSendTransaction");
    public static final java.util.List<java.lang.String> AhwBna = yDY.gEmmrt("sui_signMessage", "sui_signPersonalMessage", "sui_signTransactionBlock", "sui_signAndExecuteTransactionBlock");
    public static final java.util.List<java.lang.String> copydefault = yDY.gEmmrt("btc_signMessage", "btc_signPsbts", "btc_send", "btc_sendInscription", "btc_signAndPushPsbt", "btc_inscribeTransfer", "btc_sendRunes");
    public static final java.util.List<java.lang.String> EZpvd = yDY.gEmmrt("aptos_signMessage", "aptos_signTransaction", "aptos_signAndSubmitTransaction");
    public static final java.util.List<java.lang.String> AEQbTJ = yDY.gEmmrt("cosmos_signArbitrary", "cosmos_signAmino", "cosmos_signDirect");
    public static final java.util.List<java.lang.String> AYXKKw = yDY.gEmmrt("tron_signMessage", "tron_signMessageV2", "tron_signTransaction", "tron_signAndSendTransaction");
    public static final java.util.List<java.lang.String> djBIcL = yDY.gEmmrt("starknet_signMessage", "starknet_sendTransaction");

    public C15974ebF(@NotNull C54819xWm c54819xWm, @NotNull C48787ucK c48787ucK, @NotNull C10337bmZ c10337bmZ, @NotNull C12827cuN c12827cuN, @NotNull C57259yez c57259yez, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2) {
        Intrinsics.checkNotNullParameter(c54819xWm, "");
        Intrinsics.checkNotNullParameter(c48787ucK, "");
        Intrinsics.checkNotNullParameter(c10337bmZ, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c57259yez, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        this.isConnected = c54819xWm;
        this.AuCTel = c48787ucK;
        this.fARcdN = c10337bmZ;
        this.ejfBZ = c12827cuN;
        this.fIwbmz = c57259yez;
        this.AkhnZx = coroutineDispatcher;
        this.DbNXlk = coroutineDispatcher2;
        this.fetchVPNInfo = JsonKt.Json$default(null, new Function1() { // from class: o.ebI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15974ebF.EZpvd((JsonBuilder) obj);
            }
        }, 1, null);
        this.values = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: o.ebF$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ebF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.util.List<java.lang.String> OLrzqt() {
            return C15974ebF.KWHzl;
        }

        public final java.util.List<java.lang.String> gEmmrt() {
            return C15974ebF.gEmmrt;
        }

        public final java.util.List<java.lang.String> KWHzl() {
            return C15974ebF.valueOf;
        }

        public final java.util.List<java.lang.String> AYXKKw() {
            return C15974ebF.AhwBna;
        }

        public final java.util.List<java.lang.String> AEQbTJ() {
            return C15974ebF.copydefault;
        }

        public final java.util.List<java.lang.String> copydefault() {
            return C15974ebF.EZpvd;
        }

        public final java.util.List<java.lang.String> EZpvd() {
            return C15974ebF.AEQbTJ;
        }

        public final java.util.List<java.lang.String> AhwBna() {
            return C15974ebF.AYXKKw;
        }

        public final java.util.List<java.lang.String> valueOf() {
            return C15974ebF.djBIcL;
        }
    }

    public final java.util.List<java.lang.String> values() {
        java.util.ArrayList arrayList;
        JsonObject jsonObjectAEQbTJ;
        JsonElement jsonElement;
        JsonArray asJsonArray;
        try {
            jsonObjectAEQbTJ = this.AuCTel.AEQbTJ("okxConnectConfiguration");
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DAppMethodHelper", "Failed to get remote connectAndSignSupportedMethods", e);
        }
        if (jsonObjectAEQbTJ == null || (jsonElement = jsonObjectAEQbTJ.get("connectAndSignSupportedMethods")) == null || (asJsonArray = jsonElement.getAsJsonArray()) == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(asJsonArray, 10));
            java.util.Iterator<JsonElement> it = asJsonArray.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getAsString());
            }
        }
        return arrayList == null ? yDY.AhwBna() : arrayList;
    }

    public final android.app.Activity valueOf() {
        return this.isConnected.AEQbTJ();
    }

    public static final Unit EZpvd(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(true);
        jsonBuilder.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public final void copydefault(java.lang.String str, CancellableContinuation<? super java.lang.String> cancellableContinuation) {
        this.values.put(str, cancellableContinuation);
    }

    @Override // o.InterfaceC16048eca
    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        pUU.EZpvd("DAppMethodHelper", "onMethodHelperResult: " + str2);
        CancellableContinuation<java.lang.String> cancellableContinuation = this.values.get(str);
        if (cancellableContinuation != null && cancellableContinuation.isActive()) {
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "IS_STARKNET_REGISTER")) {
                CancellableContinuation<java.lang.String> cancellableContinuation2 = this.values.get(str);
                if (cancellableContinuation2 != null) {
                    Result.Application application = Result.Companion;
                    cancellableContinuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(new OKXConnectException(OKXConnectException.ErrorType.USER_ADDRESS_REGISTRATION, (java.lang.String) null, 2, (DefaultConstructorMarker) (0 == true ? 1 : 0)))));
                }
            } else {
                CancellableContinuation<java.lang.String> cancellableContinuation3 = this.values.get(str);
                if (cancellableContinuation3 != null) {
                    Result.Application application2 = Result.Companion;
                    cancellableContinuation3.resumeWith(Result.m7377constructorimpl(str2));
                }
            }
        }
        this.values.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onSyncAllAddresses$1 dAppMethodHelper$onSyncAllAddresses$1;
        if (continuation instanceof DAppMethodHelper$onSyncAllAddresses$1) {
            dAppMethodHelper$onSyncAllAddresses$1 = (DAppMethodHelper$onSyncAllAddresses$1) continuation;
            int i = dAppMethodHelper$onSyncAllAddresses$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onSyncAllAddresses$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onSyncAllAddresses$1 = new DAppMethodHelper$onSyncAllAddresses$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dAppMethodHelper$onSyncAllAddresses$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onSyncAllAddresses$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onSyncAllAddresses$2 dAppMethodHelper$onSyncAllAddresses$2 = new DAppMethodHelper$onSyncAllAddresses$2(this, str, null);
            dAppMethodHelper$onSyncAllAddresses$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onSyncAllAddresses$2, dAppMethodHelper$onSyncAllAddresses$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull DAppWrapper dAppWrapper, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$getMethodResult$1 dAppMethodHelper$getMethodResult$1;
        if (continuation instanceof DAppMethodHelper$getMethodResult$1) {
            dAppMethodHelper$getMethodResult$1 = (DAppMethodHelper$getMethodResult$1) continuation;
            int i = dAppMethodHelper$getMethodResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$getMethodResult$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$getMethodResult$1 = new DAppMethodHelper$getMethodResult$1(this, continuation);
            }
        }
        DAppMethodHelper$getMethodResult$1 dAppMethodHelper$getMethodResult$12 = dAppMethodHelper$getMethodResult$1;
        java.lang.Object objWithContext = dAppMethodHelper$getMethodResult$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$getMethodResult$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$getMethodResult$2 dAppMethodHelper$getMethodResult$2 = new DAppMethodHelper$getMethodResult$2(this, str2, dAppWrapper, str, dAppInfo, str3, str4, null);
            dAppMethodHelper$getMethodResult$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$getMethodResult$2, dAppMethodHelper$getMethodResult$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    public final java.lang.Object KWHzl(WeakReference<android.content.Context> weakReference, java.lang.String str, java.lang.String str2, DAppWrapper.DAppSignWrapper dAppSignWrapper, DAppInfo dAppInfo, java.lang.String str3, java.lang.String str4, Continuation<? super java.lang.String> continuation) {
        long j = 0;
        java.lang.String str5 = null;
        MpcSignType mpcSignType = null;
        boolean z = false;
        boolean z2 = false;
        DexDappSubSignArgs dexDappSubSignArgs = null;
        byte b = 0 == true ? 1 : 0;
        byte b2 = 0 == true ? 1 : 0;
        return BuildersKt.withContext(this.AkhnZx, new DAppMethodHelper$handleSign$2(str2, this, str4, weakReference, new DappSignArgs(str, dAppSignWrapper.AEQbTJ(), new PlatformItem(j, dAppInfo.getName(), dAppInfo.getIcon(), (java.lang.String) null, (java.lang.String) null, str5, (java.util.List) null, (java.util.List) null, dAppInfo.getUrl(), (java.lang.String) null, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16121, (DefaultConstructorMarker) null), dAppSignWrapper.EZpvd(), mpcSignType, dAppSignWrapper.gEmmrt(), C56443yFo.AEQbTJ(5), str3, dAppSignWrapper.copydefault(), dAppSignWrapper.djBIcL(), z, z2, str2, dAppSignWrapper.OLrzqt(), dexDappSubSignArgs, dAppSignWrapper.KWHzl(), null, null, false, b, str5, b2, 4148240, null), null), continuation);
    }

    public final java.lang.Object EZpvd(WeakReference<android.content.Context> weakReference, java.lang.String str, java.lang.String str2, DAppWrapper.DAppInteractionWrapper dAppInteractionWrapper, DAppInfo dAppInfo, java.lang.String str3, java.lang.String str4, Continuation<? super java.lang.String> continuation) {
        long j = 0;
        java.lang.String str5 = null;
        java.lang.String str6 = null;
        java.lang.String str7 = null;
        java.lang.Long l = null;
        boolean z = false;
        boolean z2 = false;
        java.lang.String str8 = null;
        java.lang.Integer num = null;
        DexTransferData dexTransferData = null;
        CustomNetworkInfo customNetworkInfo = null;
        DappInteractionArgs.Companion.ShowStyle showStyle = null;
        byte b = 0 == true ? 1 : 0;
        byte b2 = 0 == true ? 1 : 0;
        byte b3 = 0 == true ? 1 : 0;
        byte b4 = 0 == true ? 1 : 0;
        return BuildersKt.withContext(this.AkhnZx, new DAppMethodHelper$handleSendTransaction$2(str2, this, str4, weakReference, new DappInteractionArgs(str, str7, dAppInteractionWrapper.OLrzqt(), new PlatformItem(j, dAppInfo.getName(), dAppInfo.getIcon(), (java.lang.String) null, (java.lang.String) null, str5, (java.util.List) null, (java.util.List) null, dAppInfo.getUrl(), str6, 0L, 0, (java.lang.String) null, (java.lang.String) null, 16121, (DefaultConstructorMarker) null), dAppInteractionWrapper.copydefault(), l, str3, C56443yFo.AEQbTJ(5), dAppInteractionWrapper.AEQbTJ(), dAppInteractionWrapper.gEmmrt(), dAppInteractionWrapper.KWHzl(), dAppInteractionWrapper.EZpvd(), dAppInteractionWrapper.AYXKKw(), z, str5, z2, b, str8, str6, num, dexTransferData, customNetworkInfo, b2, b3, showStyle, b4, dAppInteractionWrapper.djBIcL(), null, null, null, null, null, -67117022, null), null), continuation);
    }

    public final java.lang.String KWHzl(java.lang.String str) {
        try {
            byte[] bArrCopydefault = C58171ywJ.copydefault(str);
            Intrinsics.checkNotNullExpressionValue(bArrCopydefault, "");
            java.lang.String str2 = new java.lang.String(bArrCopydefault, Charsets.UTF_8);
            Json json = this.fetchVPNInfo;
            JsonArrayBuilder jsonArrayBuilder = new JsonArrayBuilder();
            Json json2 = this.fetchVPNInfo;
            json2.getSerializersModule();
            jsonArrayBuilder.add(json2.encodeToJsonElement(StringSerializer.INSTANCE, str2));
            kotlinx.serialization.json.JsonArray jsonArrayBuild = jsonArrayBuilder.build();
            json.getSerializersModule();
            return json.encodeToString(kotlinx.serialization.json.JsonArray.Companion.serializer(), jsonArrayBuild);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DAppMethodHelper", "Failed to decode base58", e);
            return str;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.BtcSignRequest.copy$default(com.okinc.business.defi.wallet.common.okxconnect.model.dapp.BtcSignRequest, java.lang.String, java.lang.String, int, java.lang.Object):com.okinc.business.defi.wallet.common.okxconnect.model.dapp.BtcSignRequest */
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [435=10] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod connectRequestMethod, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull Continuation<? super DappSignArgs> continuation) throws java.lang.Exception {
        DAppMethodHelper$constructDAppSignArgs$1 dAppMethodHelper$constructDAppSignArgs$1;
        DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod connectRequestMethod2;
        AbstractC12782ctV abstractC12782ctV2;
        C15974ebF c15974ebF;
        java.util.List list;
        kotlinx.serialization.json.JsonObject params;
        DappSignArgs dappSignArgs;
        JsonPrimitive jsonPrimitive;
        kotlinx.serialization.json.JsonObject params2;
        java.lang.String str;
        java.util.Map map;
        java.util.Map map2;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        JsonPrimitive jsonPrimitive2;
        kotlinx.serialization.json.JsonObject params3;
        JsonPrimitive jsonPrimitive3;
        kotlinx.serialization.json.JsonObject params4;
        java.lang.Object next;
        java.lang.String strOLrzqt;
        kotlinx.serialization.json.JsonObject params5;
        java.lang.Object next2;
        java.lang.String strOLrzqt2;
        kotlinx.serialization.json.JsonObject params6;
        JsonPrimitive jsonPrimitive4;
        kotlinx.serialization.json.JsonObject params7;
        JsonPrimitive jsonPrimitive5;
        kotlinx.serialization.json.JsonObject params8;
        JsonPrimitive jsonPrimitive6;
        kotlinx.serialization.json.JsonObject params9;
        java.lang.Object next3;
        java.lang.String strOLrzqt3;
        kotlinx.serialization.json.JsonObject params10;
        JsonPrimitive jsonPrimitive7;
        if (continuation instanceof DAppMethodHelper$constructDAppSignArgs$1) {
            dAppMethodHelper$constructDAppSignArgs$1 = (DAppMethodHelper$constructDAppSignArgs$1) continuation;
            int i = dAppMethodHelper$constructDAppSignArgs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$constructDAppSignArgs$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$constructDAppSignArgs$1 = new DAppMethodHelper$constructDAppSignArgs$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = dAppMethodHelper$constructDAppSignArgs$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$constructDAppSignArgs$1.label;
        java.lang.String content = null;
        content = null;
        java.lang.String content2 = null;
        content = null;
        java.lang.String content3 = null;
        content = null;
        java.lang.String content4 = null;
        content = null;
        java.lang.String content5 = null;
        content = null;
        java.lang.String content6 = null;
        content = null;
        java.lang.String content7 = null;
        content = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            if (!values().contains(connectRequestMethod.getMethod())) {
                return null;
            }
            java.util.List<C13983dcq> listCopydefault = C13990dcx.copydefault(abstractC12782ctV);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (it.hasNext()) {
                arrayList.add(((C13983dcq) it.next()).AEQbTJ());
            }
            java.lang.String caipChainId = connectRequestMethod.getCaipChainId();
            dAppMethodHelper$constructDAppSignArgs$1.L$0 = this;
            connectRequestMethod2 = connectRequestMethod;
            dAppMethodHelper$constructDAppSignArgs$1.L$1 = connectRequestMethod2;
            abstractC12782ctV2 = abstractC12782ctV;
            dAppMethodHelper$constructDAppSignArgs$1.L$2 = abstractC12782ctV2;
            dAppMethodHelper$constructDAppSignArgs$1.L$3 = arrayList;
            dAppMethodHelper$constructDAppSignArgs$1.label = 1;
            objAEQbTJ = AEQbTJ(caipChainId, dAppMethodHelper$constructDAppSignArgs$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c15974ebF = this;
            list = arrayList;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (java.util.Map) dAppMethodHelper$constructDAppSignArgs$1.L$4;
                str = (java.lang.String) dAppMethodHelper$constructDAppSignArgs$1.L$3;
                map2 = (java.util.Map) dAppMethodHelper$constructDAppSignArgs$1.L$2;
                str2 = (java.lang.String) dAppMethodHelper$constructDAppSignArgs$1.L$1;
                str3 = (java.lang.String) dAppMethodHelper$constructDAppSignArgs$1.L$0;
                C56391yDq.AEQbTJ(objAEQbTJ);
                map.put(str, JsonElementKt.JsonPrimitive(((AbstractC12782ctV) objAEQbTJ).EZpvd(9004L)));
                params2 = new kotlinx.serialization.json.JsonObject(map2);
                str5 = str3;
                str4 = str2;
                return new DappSignArgs(str4, str5, null, params2.toString(), false, C56443yFo.AEQbTJ(5), "okx_connect", null, false, false, null, null, null, null, null, false, null, 130948, null);
            }
            java.util.List list2 = (java.util.List) dAppMethodHelper$constructDAppSignArgs$1.L$3;
            AbstractC12782ctV abstractC12782ctV3 = (AbstractC12782ctV) dAppMethodHelper$constructDAppSignArgs$1.L$2;
            DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod connectRequestMethod3 = (DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod) dAppMethodHelper$constructDAppSignArgs$1.L$1;
            c15974ebF = (C15974ebF) dAppMethodHelper$constructDAppSignArgs$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
            abstractC12782ctV2 = abstractC12782ctV3;
            connectRequestMethod2 = connectRequestMethod3;
            list = list2;
        }
        java.lang.String str6 = (java.lang.String) objAEQbTJ;
        java.lang.String strDbNXlk = abstractC12782ctV2.DbNXlk();
        java.lang.String method = connectRequestMethod2.getMethod();
        switch (method.hashCode()) {
            case -2021880892:
                if (!method.equals("tron_signMessageV2") || (params = connectRequestMethod2.getParams()) == null) {
                    return null;
                }
                kotlinx.serialization.json.JsonElement jsonElement = (kotlinx.serialization.json.JsonElement) params.get("message");
                if (jsonElement != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
                    content = jsonPrimitive.getContent();
                }
                dappSignArgs = new DappSignArgs(strDbNXlk, str6, null, content == null ? "" : content, true, C56443yFo.AEQbTJ(5), "okx_connect", null, false, false, null, null, null, null, TronSignMethodVersion.V2, true, null, 81668, null);
                return dappSignArgs;
            case -1876451729:
                if (!method.equals("starknet_signMessage") || (params2 = connectRequestMethod2.getParams()) == null) {
                    return null;
                }
                str = "accountAddress";
                kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) params2.get("accountAddress");
                if (jsonElement2 != null && (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement2)) != null) {
                    content7 = jsonPrimitive2.getContent();
                }
                if (content7 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) content7)) {
                    str4 = strDbNXlk;
                    str5 = str6;
                    return new DappSignArgs(str4, str5, null, params2.toString(), false, C56443yFo.AEQbTJ(5), "okx_connect", null, false, false, null, null, null, null, null, false, null, 130948, null);
                }
                java.util.Map mapIsConnected = C56424yEw.isConnected(params2);
                dAppMethodHelper$constructDAppSignArgs$1.L$0 = str6;
                dAppMethodHelper$constructDAppSignArgs$1.L$1 = strDbNXlk;
                dAppMethodHelper$constructDAppSignArgs$1.L$2 = mapIsConnected;
                dAppMethodHelper$constructDAppSignArgs$1.L$3 = "accountAddress";
                dAppMethodHelper$constructDAppSignArgs$1.L$4 = mapIsConnected;
                dAppMethodHelper$constructDAppSignArgs$1.label = 2;
                java.lang.Object objKWHzl = c15974ebF.KWHzl(strDbNXlk, dAppMethodHelper$constructDAppSignArgs$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                map = mapIsConnected;
                map2 = map;
                objAEQbTJ = objKWHzl;
                str2 = strDbNXlk;
                str3 = str6;
                map.put(str, JsonElementKt.JsonPrimitive(((AbstractC12782ctV) objAEQbTJ).EZpvd(9004L)));
                params2 = new kotlinx.serialization.json.JsonObject(map2);
                str5 = str3;
                str4 = str2;
                return new DappSignArgs(str4, str5, null, params2.toString(), false, C56443yFo.AEQbTJ(5), "okx_connect", null, false, false, null, null, null, null, null, false, null, 130948, null);
            case -1073453553:
                if (!method.equals("solana_signMessage") || (params3 = connectRequestMethod2.getParams()) == null) {
                    return null;
                }
                kotlinx.serialization.json.JsonElement jsonElement3 = (kotlinx.serialization.json.JsonElement) params3.get("bs58Message");
                if (jsonElement3 != null && (jsonPrimitive3 = JsonElementKt.getJsonPrimitive(jsonElement3)) != null) {
                    content6 = jsonPrimitive3.getContent();
                }
                return new DappSignArgs(strDbNXlk, str6, null, c15974ebF.KWHzl(content6 != null ? content6 : ""), false, C56443yFo.AEQbTJ(5), "okx_connect", null, false, !Intrinsics.EZpvd((java.lang.Object) r1, (java.lang.Object) r15), null, null, null, null, null, false, null, 130452, null);
            case -782293348:
                if (!method.equals("btc_signMessage") || (params4 = connectRequestMethod2.getParams()) == null) {
                    return null;
                }
                Json json = c15974ebF.fetchVPNInfo;
                json.getSerializersModule();
                BtcSignRequest btcSignRequest = (BtcSignRequest) json.decodeFromJsonElement(BtcSignRequest.Companion.serializer(), params4);
                java.util.Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.EZpvd((java.lang.Object) C13983dcq.Companion.KWHzl((java.lang.String) next), (java.lang.Object) connectRequestMethod2.getCaipChainId())) {
                        }
                    } else {
                        next = null;
                    }
                }
                java.lang.String str7 = (java.lang.String) next;
                if (str7 == null || (strOLrzqt = C13983dcq.Companion.OLrzqt(str7)) == null) {
                    return null;
                }
                Json json2 = c15974ebF.fetchVPNInfo;
                BtcSignRequest btcSignRequestCopy$default = BtcSignRequest.copy$default(btcSignRequest, null, strOLrzqt, 1, null);
                json2.getSerializersModule();
                return new DappSignArgs(strDbNXlk, str6, null, json2.encodeToString(BtcSignRequest.Companion.serializer(), btcSignRequestCopy$default), false, C56443yFo.AEQbTJ(5), "okx_connect", null, false, false, "btc_message", null, null, null, null, false, null, 129940, null);
            case -506050796:
                if (!method.equals("aptos_signMessage") || (params5 = connectRequestMethod2.getParams()) == null) {
                    return null;
                }
                Json json3 = c15974ebF.fetchVPNInfo;
                json3.getSerializersModule();
                AptosSignRequest aptosSignRequest = (AptosSignRequest) json3.decodeFromJsonElement(AptosSignRequest.Companion.serializer(), params5);
                java.util.Iterator it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (Intrinsics.EZpvd((java.lang.Object) C13983dcq.Companion.KWHzl((java.lang.String) next2), (java.lang.Object) connectRequestMethod2.getCaipChainId())) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                java.lang.String str8 = (java.lang.String) next2;
                if (str8 == null || (strOLrzqt2 = C13983dcq.Companion.OLrzqt(str8)) == null) {
                    return null;
                }
                byte[] bytes = aptosSignRequest.formatFullMessage(strOLrzqt2).getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "");
                return new DappSignArgs(strDbNXlk, str6, null, EIP1271Verifier.hexPrefix + yDV.joinToString$default(bytes, (java.lang.CharSequence) "", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, new Function1() { // from class: o.ebB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C15974ebF.copydefault(((java.lang.Byte) obj).byteValue());
                    }
                }, 30, (java.lang.Object) null), false, C56443yFo.AEQbTJ(5), "okx_connect", null, false, false, null, null, null, null, null, false, null, 130964, null);
            case 581195868:
                if (!method.equals("personal_sign") || (params6 = connectRequestMethod2.getParams()) == null) {
                    return null;
                }
                kotlinx.serialization.json.JsonElement jsonElement4 = (kotlinx.serialization.json.JsonElement) params6.get("message");
                if (jsonElement4 != null && (jsonPrimitive4 = JsonElementKt.getJsonPrimitive(jsonElement4)) != null) {
                    content5 = jsonPrimitive4.getContent();
                }
                java.lang.String str9 = content5 == null ? "" : content5;
                return new DappSignArgs(strDbNXlk, str6, null, str9, true, C56443yFo.AEQbTJ(5), "okx_connect", null, false, false, DappSignArgs.SIGN_PERSONALMESSAGE, SignType.PERSONAL_MESSAGE, null, str9, null, false, null, 119684, null);
            case 1105274258:
                if (!method.equals("sui_signMessage") || (params7 = connectRequestMethod2.getParams()) == null) {
                    return null;
                }
                kotlinx.serialization.json.JsonElement jsonElement5 = (kotlinx.serialization.json.JsonElement) params7.get("message");
                if (jsonElement5 != null && (jsonPrimitive5 = JsonElementKt.getJsonPrimitive(jsonElement5)) != null) {
                    content4 = jsonPrimitive5.getContent();
                }
                return new DappSignArgs(strDbNXlk, str6, null, content4 == null ? "" : content4, false, C56443yFo.AEQbTJ(5), "okx_connect", null, false, false, null, null, null, null, null, false, null, 130948, null);
            case 1402426418:
                if (!method.equals("sui_signPersonalMessage") || (params8 = connectRequestMethod2.getParams()) == null) {
                    return null;
                }
                kotlinx.serialization.json.JsonElement jsonElement6 = (kotlinx.serialization.json.JsonElement) params8.get("message");
                if (jsonElement6 != null && (jsonPrimitive6 = JsonElementKt.getJsonPrimitive(jsonElement6)) != null) {
                    content3 = jsonPrimitive6.getContent();
                }
                return new DappSignArgs(strDbNXlk, str6, null, content3 == null ? "" : content3, true, C56443yFo.AEQbTJ(5), "okx_connect", null, false, false, null, null, null, null, null, false, null, 130948, null);
            case 1900613984:
                if (!method.equals("cosmos_signArbitrary") || (params9 = connectRequestMethod2.getParams()) == null) {
                    return null;
                }
                java.util.Iterator it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next3 = it4.next();
                        if (Intrinsics.EZpvd((java.lang.Object) C13983dcq.Companion.KWHzl((java.lang.String) next3), (java.lang.Object) connectRequestMethod2.getCaipChainId())) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                java.lang.String str10 = (java.lang.String) next3;
                if (str10 == null || (strOLrzqt3 = C13983dcq.Companion.OLrzqt(str10)) == null) {
                    return null;
                }
                kotlinx.serialization.json.JsonObject jsonObjectKWHzl = new C15939eaX().KWHzl(params9, strOLrzqt3);
                Json json4 = c15974ebF.fetchVPNInfo;
                kotlinx.serialization.json.JsonElement jsonElement7 = (kotlinx.serialization.json.JsonElement) jsonObjectKWHzl.get((java.lang.Object) "data");
                kotlinx.serialization.json.JsonObject jsonObject = jsonElement7 != null ? JsonElementKt.getJsonObject(jsonElement7) : null;
                json4.getSerializersModule();
                return new DappSignArgs(strDbNXlk, str6, null, json4.encodeToString(BuiltinSerializersKt.getNullable(kotlinx.serialization.json.JsonObject.Companion.serializer()), jsonObject), false, C56443yFo.AEQbTJ(5), "okx_connect", null, false, false, null, null, null, null, null, false, null, 130964, null);
            case 2071636776:
                if (!method.equals("tron_signMessage") || (params10 = connectRequestMethod2.getParams()) == null) {
                    return null;
                }
                kotlinx.serialization.json.JsonElement jsonElement8 = (kotlinx.serialization.json.JsonElement) params10.get("message");
                if (jsonElement8 != null && (jsonPrimitive7 = JsonElementKt.getJsonPrimitive(jsonElement8)) != null) {
                    content2 = jsonPrimitive7.getContent();
                }
                dappSignArgs = new DappSignArgs(strDbNXlk, str6, null, content2 == null ? "" : content2, true, C56443yFo.AEQbTJ(5), "okx_connect", null, false, false, null, null, null, null, TronSignMethodVersion.V1, true, null, 81668, null);
                return dappSignArgs;
            default:
                return null;
        }
    }

    public static final java.lang.CharSequence copydefault(byte b) {
        java.lang.String str = java.lang.String.format("%02x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onSwitchEvmChain$1 dAppMethodHelper$onSwitchEvmChain$1;
        if (continuation instanceof DAppMethodHelper$onSwitchEvmChain$1) {
            dAppMethodHelper$onSwitchEvmChain$1 = (DAppMethodHelper$onSwitchEvmChain$1) continuation;
            int i = dAppMethodHelper$onSwitchEvmChain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onSwitchEvmChain$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onSwitchEvmChain$1 = new DAppMethodHelper$onSwitchEvmChain$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = dAppMethodHelper$onSwitchEvmChain$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onSwitchEvmChain$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onSwitchEvmChain$2 dAppMethodHelper$onSwitchEvmChain$2 = new DAppMethodHelper$onSwitchEvmChain$2(this, str, str2, null);
            dAppMethodHelper$onSwitchEvmChain$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onSwitchEvmChain$2, dAppMethodHelper$onSwitchEvmChain$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull WalletAddEthereumChain walletAddEthereumChain, @NotNull java.lang.String str2, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onAddEthereumChain$1 dAppMethodHelper$onAddEthereumChain$1;
        if (continuation instanceof DAppMethodHelper$onAddEthereumChain$1) {
            dAppMethodHelper$onAddEthereumChain$1 = (DAppMethodHelper$onAddEthereumChain$1) continuation;
            int i = dAppMethodHelper$onAddEthereumChain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onAddEthereumChain$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onAddEthereumChain$1 = new DAppMethodHelper$onAddEthereumChain$1(this, continuation);
            }
        }
        DAppMethodHelper$onAddEthereumChain$1 dAppMethodHelper$onAddEthereumChain$12 = dAppMethodHelper$onAddEthereumChain$1;
        java.lang.Object objWithContext = dAppMethodHelper$onAddEthereumChain$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onAddEthereumChain$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onAddEthereumChain$2 dAppMethodHelper$onAddEthereumChain$2 = new DAppMethodHelper$onAddEthereumChain$2(this, walletAddEthereumChain, str, dAppInfo, str2, null);
            dAppMethodHelper$onAddEthereumChain$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onAddEthereumChain$2, dAppMethodHelper$onAddEthereumChain$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: onAddEthereumChain-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8576onAddEthereumChainyxL6bBk$default(C15974ebF c15974ebF, java.lang.String str, DAppInfo dAppInfo, WalletAddEthereumChain walletAddEthereumChain, java.lang.String str2, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str2 = UUID.randomUUID().toString();
        }
        return c15974ebF.OLrzqt(str, dAppInfo, walletAddEthereumChain, str2, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull WalletWatchAsset walletWatchAsset, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onWatchEvmAsset$1 dAppMethodHelper$onWatchEvmAsset$1;
        if (continuation instanceof DAppMethodHelper$onWatchEvmAsset$1) {
            dAppMethodHelper$onWatchEvmAsset$1 = (DAppMethodHelper$onWatchEvmAsset$1) continuation;
            int i = dAppMethodHelper$onWatchEvmAsset$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onWatchEvmAsset$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onWatchEvmAsset$1 = new DAppMethodHelper$onWatchEvmAsset$1(this, continuation);
            }
        }
        DAppMethodHelper$onWatchEvmAsset$1 dAppMethodHelper$onWatchEvmAsset$12 = dAppMethodHelper$onWatchEvmAsset$1;
        java.lang.Object objWithContext = dAppMethodHelper$onWatchEvmAsset$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onWatchEvmAsset$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onWatchEvmAsset$2 dAppMethodHelper$onWatchEvmAsset$2 = new DAppMethodHelper$onWatchEvmAsset$2(this, str2, walletWatchAsset, str, str3, null);
            dAppMethodHelper$onWatchEvmAsset$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onWatchEvmAsset$2, dAppMethodHelper$onWatchEvmAsset$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: onWatchEvmAsset-yxL6bBk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8596onWatchEvmAssetyxL6bBk$default(C15974ebF c15974ebF, java.lang.String str, java.lang.String str2, WalletWatchAsset walletWatchAsset, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            str3 = UUID.randomUUID().toString();
        }
        return c15974ebF.AEQbTJ(str, str2, walletWatchAsset, str3, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onPersonalSign$1 dAppMethodHelper$onPersonalSign$1;
        if (continuation instanceof DAppMethodHelper$onPersonalSign$1) {
            dAppMethodHelper$onPersonalSign$1 = (DAppMethodHelper$onPersonalSign$1) continuation;
            int i = dAppMethodHelper$onPersonalSign$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onPersonalSign$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onPersonalSign$1 = new DAppMethodHelper$onPersonalSign$1(this, continuation);
            }
        }
        DAppMethodHelper$onPersonalSign$1 dAppMethodHelper$onPersonalSign$12 = dAppMethodHelper$onPersonalSign$1;
        java.lang.Object objWithContext = dAppMethodHelper$onPersonalSign$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onPersonalSign$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onPersonalSign$2 dAppMethodHelper$onPersonalSign$2 = new DAppMethodHelper$onPersonalSign$2(this, str2, dAppInfo, str, str3, str4, null);
            dAppMethodHelper$onPersonalSign$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onPersonalSign$2, dAppMethodHelper$onPersonalSign$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: onPersonalSign-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8586onPersonalSignhUnOzRk$default(C15974ebF c15974ebF, java.lang.String str, DAppInfo dAppInfo, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str4 = UUID.randomUUID().toString();
        }
        return c15974ebF.EZpvd(str, dAppInfo, str2, str3, str4, (Continuation<? super Result<java.lang.String>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onTypedDataSign$1 dAppMethodHelper$onTypedDataSign$1;
        if (continuation instanceof DAppMethodHelper$onTypedDataSign$1) {
            dAppMethodHelper$onTypedDataSign$1 = (DAppMethodHelper$onTypedDataSign$1) continuation;
            int i = dAppMethodHelper$onTypedDataSign$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onTypedDataSign$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onTypedDataSign$1 = new DAppMethodHelper$onTypedDataSign$1(this, continuation);
            }
        }
        DAppMethodHelper$onTypedDataSign$1 dAppMethodHelper$onTypedDataSign$12 = dAppMethodHelper$onTypedDataSign$1;
        java.lang.Object objWithContext = dAppMethodHelper$onTypedDataSign$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onTypedDataSign$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onTypedDataSign$2 dAppMethodHelper$onTypedDataSign$2 = new DAppMethodHelper$onTypedDataSign$2(this, str2, str4, str3, dAppInfo, str, null);
            dAppMethodHelper$onTypedDataSign$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onTypedDataSign$2, dAppMethodHelper$onTypedDataSign$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: onTypedDataSign-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8595onTypedDataSignhUnOzRk$default(C15974ebF c15974ebF, java.lang.String str, DAppInfo dAppInfo, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str4 = UUID.randomUUID().toString();
        }
        return c15974ebF.AEQbTJ(str, dAppInfo, str2, str3, str4, (Continuation<? super Result<java.lang.String>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull kotlinx.serialization.json.JsonObject jsonObject, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onEthSendTransaction$1 dAppMethodHelper$onEthSendTransaction$1;
        if (continuation instanceof DAppMethodHelper$onEthSendTransaction$1) {
            dAppMethodHelper$onEthSendTransaction$1 = (DAppMethodHelper$onEthSendTransaction$1) continuation;
            int i = dAppMethodHelper$onEthSendTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onEthSendTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onEthSendTransaction$1 = new DAppMethodHelper$onEthSendTransaction$1(this, continuation);
            }
        }
        DAppMethodHelper$onEthSendTransaction$1 dAppMethodHelper$onEthSendTransaction$12 = dAppMethodHelper$onEthSendTransaction$1;
        java.lang.Object objWithContext = dAppMethodHelper$onEthSendTransaction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onEthSendTransaction$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onEthSendTransaction$2 dAppMethodHelper$onEthSendTransaction$2 = new DAppMethodHelper$onEthSendTransaction$2(this, str2, dAppInfo, jsonObject, z, str, str3, str4, null);
            dAppMethodHelper$onEthSendTransaction$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onEthSendTransaction$2, dAppMethodHelper$onEthSendTransaction$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.eaT.copydefault(com.okinc.business.defi.wallet.common.okxconnect.network.rpc.Data, kotlin.coroutines.Continuation<? super kotlin.Unit>):java.lang.Object] */
    /* JADX INFO: renamed from: onEthSendTransaction-eH_QyT8$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8585onEthSendTransactioneH_QyT8$default(C15974ebF c15974ebF, java.lang.String str, DAppInfo dAppInfo, java.lang.String str2, kotlinx.serialization.json.JsonObject jsonObject, java.lang.String str3, boolean z, java.lang.String str4, Continuation continuation, int i, java.lang.Object obj) {
        return c15974ebF.EZpvd(str, dAppInfo, str2, jsonObject, (i & 16) != 0 ? UUID.randomUUID().toString() : str3, (i & 32) != 0 ? true : z, (i & 64) != 0 ? "data" : str4, (Continuation<? super Result<java.lang.String>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onSolSignMessage$1 dAppMethodHelper$onSolSignMessage$1;
        if (continuation instanceof DAppMethodHelper$onSolSignMessage$1) {
            dAppMethodHelper$onSolSignMessage$1 = (DAppMethodHelper$onSolSignMessage$1) continuation;
            int i = dAppMethodHelper$onSolSignMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onSolSignMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onSolSignMessage$1 = new DAppMethodHelper$onSolSignMessage$1(this, continuation);
            }
        }
        DAppMethodHelper$onSolSignMessage$1 dAppMethodHelper$onSolSignMessage$12 = dAppMethodHelper$onSolSignMessage$1;
        java.lang.Object objWithContext = dAppMethodHelper$onSolSignMessage$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onSolSignMessage$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onSolSignMessage$2 dAppMethodHelper$onSolSignMessage$2 = new DAppMethodHelper$onSolSignMessage$2(this, str2, str3, dAppInfo, str, str4, null);
            dAppMethodHelper$onSolSignMessage$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onSolSignMessage$2, dAppMethodHelper$onSolSignMessage$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: onSolSignMessage-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8588onSolSignMessagehUnOzRk$default(C15974ebF c15974ebF, java.lang.String str, DAppInfo dAppInfo, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str4 = UUID.randomUUID().toString();
        }
        return c15974ebF.KWHzl(str, dAppInfo, str2, str3, str4, (Continuation<? super Result<java.lang.String>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onSolInteraction$1 dAppMethodHelper$onSolInteraction$1;
        if (continuation instanceof DAppMethodHelper$onSolInteraction$1) {
            dAppMethodHelper$onSolInteraction$1 = (DAppMethodHelper$onSolInteraction$1) continuation;
            int i = dAppMethodHelper$onSolInteraction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onSolInteraction$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onSolInteraction$1 = new DAppMethodHelper$onSolInteraction$1(this, continuation);
            }
        }
        DAppMethodHelper$onSolInteraction$1 dAppMethodHelper$onSolInteraction$12 = dAppMethodHelper$onSolInteraction$1;
        java.lang.Object objWithContext = dAppMethodHelper$onSolInteraction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onSolInteraction$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onSolInteraction$2 dAppMethodHelper$onSolInteraction$2 = new DAppMethodHelper$onSolInteraction$2(this, str2, dAppInfo, z, str, str3, str4, null);
            dAppMethodHelper$onSolInteraction$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onSolInteraction$2, dAppMethodHelper$onSolInteraction$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onSuiSignMessage$1 dAppMethodHelper$onSuiSignMessage$1;
        if (continuation instanceof DAppMethodHelper$onSuiSignMessage$1) {
            dAppMethodHelper$onSuiSignMessage$1 = (DAppMethodHelper$onSuiSignMessage$1) continuation;
            int i = dAppMethodHelper$onSuiSignMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onSuiSignMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onSuiSignMessage$1 = new DAppMethodHelper$onSuiSignMessage$1(this, continuation);
            }
        }
        DAppMethodHelper$onSuiSignMessage$1 dAppMethodHelper$onSuiSignMessage$12 = dAppMethodHelper$onSuiSignMessage$1;
        java.lang.Object objWithContext = dAppMethodHelper$onSuiSignMessage$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onSuiSignMessage$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onSuiSignMessage$2 dAppMethodHelper$onSuiSignMessage$2 = new DAppMethodHelper$onSuiSignMessage$2(this, str2, dAppInfo, str, str3, z, str4, null);
            dAppMethodHelper$onSuiSignMessage$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onSuiSignMessage$2, dAppMethodHelper$onSuiSignMessage$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z, @NotNull java.lang.String str4, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onSuiInteraction$1 dAppMethodHelper$onSuiInteraction$1;
        if (continuation instanceof DAppMethodHelper$onSuiInteraction$1) {
            dAppMethodHelper$onSuiInteraction$1 = (DAppMethodHelper$onSuiInteraction$1) continuation;
            int i = dAppMethodHelper$onSuiInteraction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onSuiInteraction$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onSuiInteraction$1 = new DAppMethodHelper$onSuiInteraction$1(this, continuation);
            }
        }
        DAppMethodHelper$onSuiInteraction$1 dAppMethodHelper$onSuiInteraction$12 = dAppMethodHelper$onSuiInteraction$1;
        java.lang.Object objWithContext = dAppMethodHelper$onSuiInteraction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onSuiInteraction$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onSuiInteraction$2 dAppMethodHelper$onSuiInteraction$2 = new DAppMethodHelper$onSuiInteraction$2(this, str2, dAppInfo, z, str, str3, str4, null);
            dAppMethodHelper$onSuiInteraction$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onSuiInteraction$2, dAppMethodHelper$onSuiInteraction$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onBtcSign$1 dAppMethodHelper$onBtcSign$1;
        if (continuation instanceof DAppMethodHelper$onBtcSign$1) {
            dAppMethodHelper$onBtcSign$1 = (DAppMethodHelper$onBtcSign$1) continuation;
            int i = dAppMethodHelper$onBtcSign$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onBtcSign$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onBtcSign$1 = new DAppMethodHelper$onBtcSign$1(this, continuation);
            }
        }
        DAppMethodHelper$onBtcSign$1 dAppMethodHelper$onBtcSign$12 = dAppMethodHelper$onBtcSign$1;
        java.lang.Object objWithContext = dAppMethodHelper$onBtcSign$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onBtcSign$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onBtcSign$2 dAppMethodHelper$onBtcSign$2 = new DAppMethodHelper$onBtcSign$2(this, str2, dAppInfo, str, str3, str4, str5, null);
            dAppMethodHelper$onBtcSign$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onBtcSign$2, dAppMethodHelper$onBtcSign$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onBtcSignAndPushPsbt$1 dAppMethodHelper$onBtcSignAndPushPsbt$1;
        if (continuation instanceof DAppMethodHelper$onBtcSignAndPushPsbt$1) {
            dAppMethodHelper$onBtcSignAndPushPsbt$1 = (DAppMethodHelper$onBtcSignAndPushPsbt$1) continuation;
            int i = dAppMethodHelper$onBtcSignAndPushPsbt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onBtcSignAndPushPsbt$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onBtcSignAndPushPsbt$1 = new DAppMethodHelper$onBtcSignAndPushPsbt$1(this, continuation);
            }
        }
        DAppMethodHelper$onBtcSignAndPushPsbt$1 dAppMethodHelper$onBtcSignAndPushPsbt$12 = dAppMethodHelper$onBtcSignAndPushPsbt$1;
        java.lang.Object objWithContext = dAppMethodHelper$onBtcSignAndPushPsbt$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onBtcSignAndPushPsbt$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onBtcSignAndPushPsbt$2 dAppMethodHelper$onBtcSignAndPushPsbt$2 = new DAppMethodHelper$onBtcSignAndPushPsbt$2(this, str2, dAppInfo, str, str3, str4, null);
            dAppMethodHelper$onBtcSignAndPushPsbt$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onBtcSignAndPushPsbt$2, dAppMethodHelper$onBtcSignAndPushPsbt$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: onBtcSignAndPushPsbt-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8581onBtcSignAndPushPsbthUnOzRk$default(C15974ebF c15974ebF, java.lang.String str, DAppInfo dAppInfo, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str4 = UUID.randomUUID().toString();
        }
        return c15974ebF.OLrzqt(str, dAppInfo, str2, str3, str4, (Continuation<? super Result<java.lang.String>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull kotlinx.serialization.json.JsonObject jsonObject, int i, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onBtcSendTransaction$1 dAppMethodHelper$onBtcSendTransaction$1;
        if (continuation instanceof DAppMethodHelper$onBtcSendTransaction$1) {
            dAppMethodHelper$onBtcSendTransaction$1 = (DAppMethodHelper$onBtcSendTransaction$1) continuation;
            int i2 = dAppMethodHelper$onBtcSendTransaction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onBtcSendTransaction$1.label = i2 - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onBtcSendTransaction$1 = new DAppMethodHelper$onBtcSendTransaction$1(this, continuation);
            }
        }
        DAppMethodHelper$onBtcSendTransaction$1 dAppMethodHelper$onBtcSendTransaction$12 = dAppMethodHelper$onBtcSendTransaction$1;
        java.lang.Object objWithContext = dAppMethodHelper$onBtcSendTransaction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = dAppMethodHelper$onBtcSendTransaction$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onBtcSendTransaction$2 dAppMethodHelper$onBtcSendTransaction$2 = new DAppMethodHelper$onBtcSendTransaction$2(this, str2, i, jsonObject, str, dAppInfo, str3, null);
            dAppMethodHelper$onBtcSendTransaction$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onBtcSendTransaction$2, dAppMethodHelper$onBtcSendTransaction$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull TronSignMethodVersion tronSignMethodVersion, @NotNull java.lang.String str4, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onTronSignMessage$1 dAppMethodHelper$onTronSignMessage$1;
        if (continuation instanceof DAppMethodHelper$onTronSignMessage$1) {
            dAppMethodHelper$onTronSignMessage$1 = (DAppMethodHelper$onTronSignMessage$1) continuation;
            int i = dAppMethodHelper$onTronSignMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onTronSignMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onTronSignMessage$1 = new DAppMethodHelper$onTronSignMessage$1(this, continuation);
            }
        }
        DAppMethodHelper$onTronSignMessage$1 dAppMethodHelper$onTronSignMessage$12 = dAppMethodHelper$onTronSignMessage$1;
        java.lang.Object objWithContext = dAppMethodHelper$onTronSignMessage$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onTronSignMessage$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onTronSignMessage$2 dAppMethodHelper$onTronSignMessage$2 = new DAppMethodHelper$onTronSignMessage$2(this, str2, str, dAppInfo, str3, tronSignMethodVersion, str4, null);
            dAppMethodHelper$onTronSignMessage$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onTronSignMessage$2, dAppMethodHelper$onTronSignMessage$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull kotlinx.serialization.json.JsonObject jsonObject, boolean z, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onTronSignAndSendTransaction$1 dAppMethodHelper$onTronSignAndSendTransaction$1;
        if (continuation instanceof DAppMethodHelper$onTronSignAndSendTransaction$1) {
            dAppMethodHelper$onTronSignAndSendTransaction$1 = (DAppMethodHelper$onTronSignAndSendTransaction$1) continuation;
            int i = dAppMethodHelper$onTronSignAndSendTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onTronSignAndSendTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onTronSignAndSendTransaction$1 = new DAppMethodHelper$onTronSignAndSendTransaction$1(this, continuation);
            }
        }
        DAppMethodHelper$onTronSignAndSendTransaction$1 dAppMethodHelper$onTronSignAndSendTransaction$12 = dAppMethodHelper$onTronSignAndSendTransaction$1;
        java.lang.Object objWithContext = dAppMethodHelper$onTronSignAndSendTransaction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onTronSignAndSendTransaction$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onTronSignAndSendTransaction$2 dAppMethodHelper$onTronSignAndSendTransaction$2 = new DAppMethodHelper$onTronSignAndSendTransaction$2(this, str2, dAppInfo, jsonObject, z, str, str3, null);
            dAppMethodHelper$onTronSignAndSendTransaction$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onTronSignAndSendTransaction$2, dAppMethodHelper$onTronSignAndSendTransaction$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onAptosSignMessage$1 dAppMethodHelper$onAptosSignMessage$1;
        if (continuation instanceof DAppMethodHelper$onAptosSignMessage$1) {
            dAppMethodHelper$onAptosSignMessage$1 = (DAppMethodHelper$onAptosSignMessage$1) continuation;
            int i = dAppMethodHelper$onAptosSignMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onAptosSignMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onAptosSignMessage$1 = new DAppMethodHelper$onAptosSignMessage$1(this, continuation);
            }
        }
        DAppMethodHelper$onAptosSignMessage$1 dAppMethodHelper$onAptosSignMessage$12 = dAppMethodHelper$onAptosSignMessage$1;
        java.lang.Object objWithContext = dAppMethodHelper$onAptosSignMessage$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onAptosSignMessage$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onAptosSignMessage$2 dAppMethodHelper$onAptosSignMessage$2 = new DAppMethodHelper$onAptosSignMessage$2(this, str2, dAppInfo, str, str3, str4, null);
            dAppMethodHelper$onAptosSignMessage$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onAptosSignMessage$2, dAppMethodHelper$onAptosSignMessage$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: onAptosSignMessage-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8578onAptosSignMessagehUnOzRk$default(C15974ebF c15974ebF, java.lang.String str, DAppInfo dAppInfo, java.lang.String str2, java.lang.String str3, java.lang.String str4, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str4 = UUID.randomUUID().toString();
        }
        return c15974ebF.copydefault(str, dAppInfo, str2, str3, str4, (Continuation<? super Result<java.lang.String>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull kotlinx.serialization.json.JsonObject jsonObject, boolean z, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onAptosInteraction$1 dAppMethodHelper$onAptosInteraction$1;
        if (continuation instanceof DAppMethodHelper$onAptosInteraction$1) {
            dAppMethodHelper$onAptosInteraction$1 = (DAppMethodHelper$onAptosInteraction$1) continuation;
            int i = dAppMethodHelper$onAptosInteraction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onAptosInteraction$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onAptosInteraction$1 = new DAppMethodHelper$onAptosInteraction$1(this, continuation);
            }
        }
        DAppMethodHelper$onAptosInteraction$1 dAppMethodHelper$onAptosInteraction$12 = dAppMethodHelper$onAptosInteraction$1;
        java.lang.Object objWithContext = dAppMethodHelper$onAptosInteraction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onAptosInteraction$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onAptosInteraction$2 dAppMethodHelper$onAptosInteraction$2 = new DAppMethodHelper$onAptosInteraction$2(this, str2, jsonObject, str, dAppInfo, z, str3, null);
            dAppMethodHelper$onAptosInteraction$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onAptosInteraction$2, dAppMethodHelper$onAptosInteraction$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull kotlinx.serialization.json.JsonObject jsonObject, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onCosmosSignArbitrary$1 dAppMethodHelper$onCosmosSignArbitrary$1;
        if (continuation instanceof DAppMethodHelper$onCosmosSignArbitrary$1) {
            dAppMethodHelper$onCosmosSignArbitrary$1 = (DAppMethodHelper$onCosmosSignArbitrary$1) continuation;
            int i = dAppMethodHelper$onCosmosSignArbitrary$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onCosmosSignArbitrary$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onCosmosSignArbitrary$1 = new DAppMethodHelper$onCosmosSignArbitrary$1(this, continuation);
            }
        }
        DAppMethodHelper$onCosmosSignArbitrary$1 dAppMethodHelper$onCosmosSignArbitrary$12 = dAppMethodHelper$onCosmosSignArbitrary$1;
        java.lang.Object objWithContext = dAppMethodHelper$onCosmosSignArbitrary$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onCosmosSignArbitrary$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onCosmosSignArbitrary$2 dAppMethodHelper$onCosmosSignArbitrary$2 = new DAppMethodHelper$onCosmosSignArbitrary$2(this, str2, dAppInfo, jsonObject, str, str3, null);
            dAppMethodHelper$onCosmosSignArbitrary$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onCosmosSignArbitrary$2, dAppMethodHelper$onCosmosSignArbitrary$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: onCosmosSignArbitrary-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8583onCosmosSignArbitraryhUnOzRk$default(C15974ebF c15974ebF, java.lang.String str, DAppInfo dAppInfo, java.lang.String str2, kotlinx.serialization.json.JsonObject jsonObject, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str3 = UUID.randomUUID().toString();
        }
        return c15974ebF.AEQbTJ(str, dAppInfo, str2, jsonObject, str3, (Continuation<? super Result<java.lang.String>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull kotlinx.serialization.json.JsonObject jsonObject, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onCosmosSignAmino$1 dAppMethodHelper$onCosmosSignAmino$1;
        if (continuation instanceof DAppMethodHelper$onCosmosSignAmino$1) {
            dAppMethodHelper$onCosmosSignAmino$1 = (DAppMethodHelper$onCosmosSignAmino$1) continuation;
            int i = dAppMethodHelper$onCosmosSignAmino$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onCosmosSignAmino$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onCosmosSignAmino$1 = new DAppMethodHelper$onCosmosSignAmino$1(this, continuation);
            }
        }
        DAppMethodHelper$onCosmosSignAmino$1 dAppMethodHelper$onCosmosSignAmino$12 = dAppMethodHelper$onCosmosSignAmino$1;
        java.lang.Object objWithContext = dAppMethodHelper$onCosmosSignAmino$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onCosmosSignAmino$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onCosmosSignAmino$2 dAppMethodHelper$onCosmosSignAmino$2 = new DAppMethodHelper$onCosmosSignAmino$2(this, str2, jsonObject, dAppInfo, str, str3, null);
            dAppMethodHelper$onCosmosSignAmino$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onCosmosSignAmino$2, dAppMethodHelper$onCosmosSignAmino$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: onCosmosSignAmino-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8582onCosmosSignAminohUnOzRk$default(C15974ebF c15974ebF, java.lang.String str, DAppInfo dAppInfo, java.lang.String str2, kotlinx.serialization.json.JsonObject jsonObject, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str3 = UUID.randomUUID().toString();
        }
        return c15974ebF.KWHzl(str, dAppInfo, str2, jsonObject, str3, (Continuation<? super Result<java.lang.String>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull kotlinx.serialization.json.JsonObject jsonObject, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onCosmosSignDirect$1 dAppMethodHelper$onCosmosSignDirect$1;
        if (continuation instanceof DAppMethodHelper$onCosmosSignDirect$1) {
            dAppMethodHelper$onCosmosSignDirect$1 = (DAppMethodHelper$onCosmosSignDirect$1) continuation;
            int i = dAppMethodHelper$onCosmosSignDirect$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onCosmosSignDirect$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onCosmosSignDirect$1 = new DAppMethodHelper$onCosmosSignDirect$1(this, continuation);
            }
        }
        DAppMethodHelper$onCosmosSignDirect$1 dAppMethodHelper$onCosmosSignDirect$12 = dAppMethodHelper$onCosmosSignDirect$1;
        java.lang.Object objWithContext = dAppMethodHelper$onCosmosSignDirect$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onCosmosSignDirect$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onCosmosSignDirect$2 dAppMethodHelper$onCosmosSignDirect$2 = new DAppMethodHelper$onCosmosSignDirect$2(this, str2, dAppInfo, jsonObject, str, str3, null);
            dAppMethodHelper$onCosmosSignDirect$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onCosmosSignDirect$2, dAppMethodHelper$onCosmosSignDirect$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: onCosmosSignDirect-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8584onCosmosSignDirecthUnOzRk$default(C15974ebF c15974ebF, java.lang.String str, DAppInfo dAppInfo, java.lang.String str2, kotlinx.serialization.json.JsonObject jsonObject, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str3 = UUID.randomUUID().toString();
        }
        return c15974ebF.OLrzqt(str, dAppInfo, str2, jsonObject, str3, (Continuation<? super Result<java.lang.String>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull kotlinx.serialization.json.JsonObject jsonObject, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onStarknetSignMessage$1 dAppMethodHelper$onStarknetSignMessage$1;
        if (continuation instanceof DAppMethodHelper$onStarknetSignMessage$1) {
            dAppMethodHelper$onStarknetSignMessage$1 = (DAppMethodHelper$onStarknetSignMessage$1) continuation;
            int i = dAppMethodHelper$onStarknetSignMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onStarknetSignMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onStarknetSignMessage$1 = new DAppMethodHelper$onStarknetSignMessage$1(this, continuation);
            }
        }
        DAppMethodHelper$onStarknetSignMessage$1 dAppMethodHelper$onStarknetSignMessage$12 = dAppMethodHelper$onStarknetSignMessage$1;
        java.lang.Object objWithContext = dAppMethodHelper$onStarknetSignMessage$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onStarknetSignMessage$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onStarknetSignMessage$2 dAppMethodHelper$onStarknetSignMessage$2 = new DAppMethodHelper$onStarknetSignMessage$2(this, str2, jsonObject, dAppInfo, str, str3, null);
            dAppMethodHelper$onStarknetSignMessage$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onStarknetSignMessage$2, dAppMethodHelper$onStarknetSignMessage$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: onStarknetSignMessage-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8590onStarknetSignMessagehUnOzRk$default(C15974ebF c15974ebF, java.lang.String str, DAppInfo dAppInfo, java.lang.String str2, kotlinx.serialization.json.JsonObject jsonObject, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str3 = UUID.randomUUID().toString();
        }
        return c15974ebF.EZpvd(str, dAppInfo, str2, jsonObject, str3, (Continuation<? super Result<java.lang.String>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull DAppInfo dAppInfo, @NotNull java.lang.String str2, @NotNull kotlinx.serialization.json.JsonObject jsonObject, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<java.lang.String>> continuation) throws java.lang.Throwable {
        DAppMethodHelper$onStarknetSendTransaction$1 dAppMethodHelper$onStarknetSendTransaction$1;
        if (continuation instanceof DAppMethodHelper$onStarknetSendTransaction$1) {
            dAppMethodHelper$onStarknetSendTransaction$1 = (DAppMethodHelper$onStarknetSendTransaction$1) continuation;
            int i = dAppMethodHelper$onStarknetSendTransaction$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$onStarknetSendTransaction$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$onStarknetSendTransaction$1 = new DAppMethodHelper$onStarknetSendTransaction$1(this, continuation);
            }
        }
        DAppMethodHelper$onStarknetSendTransaction$1 dAppMethodHelper$onStarknetSendTransaction$12 = dAppMethodHelper$onStarknetSendTransaction$1;
        java.lang.Object objWithContext = dAppMethodHelper$onStarknetSendTransaction$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$onStarknetSendTransaction$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.DbNXlk;
            DAppMethodHelper$onStarknetSendTransaction$2 dAppMethodHelper$onStarknetSendTransaction$2 = new DAppMethodHelper$onStarknetSendTransaction$2(this, str2, dAppInfo, jsonObject, str, str3, null);
            dAppMethodHelper$onStarknetSendTransaction$12.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, dAppMethodHelper$onStarknetSendTransaction$2, dAppMethodHelper$onStarknetSendTransaction$12);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: onStarknetSendTransaction-hUnOzRk$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8589onStarknetSendTransactionhUnOzRk$default(C15974ebF c15974ebF, java.lang.String str, DAppInfo dAppInfo, java.lang.String str2, kotlinx.serialization.json.JsonObject jsonObject, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str3 = UUID.randomUUID().toString();
        }
        return c15974ebF.copydefault(str, dAppInfo, str2, jsonObject, str3, (Continuation<? super Result<java.lang.String>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(java.lang.String str, Continuation<? super AbstractC12782ctV> continuation) throws java.lang.Throwable {
        DAppMethodHelper$getWalletById$1 dAppMethodHelper$getWalletById$1;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof DAppMethodHelper$getWalletById$1) {
            dAppMethodHelper$getWalletById$1 = (DAppMethodHelper$getWalletById$1) continuation;
            int i = dAppMethodHelper$getWalletById$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$getWalletById$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$getWalletById$1 = new DAppMethodHelper$getWalletById$1(this, continuation);
            }
        }
        java.lang.Object objAwait = dAppMethodHelper$getWalletById$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$getWalletById$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objAwait);
                Result.Application application = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = this.ejfBZ.OLrzqt(str, false);
                dAppMethodHelper$getWalletById$1.label = 1;
                objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, dAppMethodHelper$getWalletById$1);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwait);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) objAwait);
        } catch (CancellationException e) {
            throw e;
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("DAppMethodHelper", "getWalletById failure", thM7380exceptionOrNullimpl);
        }
        java.lang.String str2 = null;
        byte b = 0;
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) objM7377constructorimpl;
        if (abstractC12782ctV != null) {
            return abstractC12782ctV;
        }
        throw new OKXConnectException(OKXConnectException.ErrorType.UNKNOWN, str2, 2, (DefaultConstructorMarker) (b == true ? 1 : 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, Continuation<? super java.lang.String> continuation) throws java.lang.Exception {
        DAppMethodHelper$getChainIdFromCaipChainId$1 dAppMethodHelper$getChainIdFromCaipChainId$1;
        if (continuation instanceof DAppMethodHelper$getChainIdFromCaipChainId$1) {
            dAppMethodHelper$getChainIdFromCaipChainId$1 = (DAppMethodHelper$getChainIdFromCaipChainId$1) continuation;
            int i = dAppMethodHelper$getChainIdFromCaipChainId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$getChainIdFromCaipChainId$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$getChainIdFromCaipChainId$1 = new DAppMethodHelper$getChainIdFromCaipChainId$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = dAppMethodHelper$getChainIdFromCaipChainId$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$getChainIdFromCaipChainId$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            DAppMethodHelper$getChainIdFromCaipChainId$2 dAppMethodHelper$getChainIdFromCaipChainId$2 = new DAppMethodHelper$getChainIdFromCaipChainId$2(str, null);
            dAppMethodHelper$getChainIdFromCaipChainId$1.label = 1;
            objKWHzl = KWHzl(dAppMethodHelper$getChainIdFromCaipChainId$2, dAppMethodHelper$getChainIdFromCaipChainId$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objKWHzl);
        }
        java.lang.String str2 = (java.lang.String) objKWHzl;
        if (str2 != null) {
            return str2;
        }
        throw new java.lang.Exception("Invalid caip");
    }

    /* JADX DEBUG: Class process forced to load method for inline: kotlinx.coroutines.CancellableContinuation.DefaultImpls.cancel$default(kotlinx.coroutines.CancellableContinuation, java.lang.Throwable, int, java.lang.Object):boolean */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super WeakReference<android.content.Context>> continuation) throws java.lang.Exception {
        DAppMethodHelper$getWeakContext$1 dAppMethodHelper$getWeakContext$1;
        if (continuation instanceof DAppMethodHelper$getWeakContext$1) {
            dAppMethodHelper$getWeakContext$1 = (DAppMethodHelper$getWeakContext$1) continuation;
            int i = dAppMethodHelper$getWeakContext$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$getWeakContext$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$getWeakContext$1 = new DAppMethodHelper$getWeakContext$1(this, continuation);
            }
        }
        java.lang.Object objWithTimeoutOrNull = dAppMethodHelper$getWeakContext$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$getWeakContext$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithTimeoutOrNull);
            for (Map.Entry<java.lang.String, CancellableContinuation<java.lang.String>> entry : this.values.entrySet()) {
                java.lang.String key = entry.getKey();
                CancellableContinuation<java.lang.String> value = entry.getValue();
                if (value.isActive()) {
                    CancellableContinuation.DefaultImpls.cancel$default(value, null, 1, null);
                }
                this.values.remove(key);
            }
            DAppMethodHelper$getWeakContext$3 dAppMethodHelper$getWeakContext$3 = new DAppMethodHelper$getWeakContext$3(this, null);
            dAppMethodHelper$getWeakContext$1.label = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(4000L, dAppMethodHelper$getWeakContext$3, dAppMethodHelper$getWeakContext$1);
            if (objWithTimeoutOrNull == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithTimeoutOrNull);
        }
        WeakReference weakReference = (WeakReference) objWithTimeoutOrNull;
        if (weakReference != null) {
            return weakReference;
        }
        throw new java.lang.Exception("Failed to get currentActivity");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> java.lang.Object KWHzl(@NotNull Function1<? super Continuation<? super T>, ? extends java.lang.Object> function1, @NotNull Continuation<? super T> continuation) throws java.lang.Exception {
        DAppMethodHelper$ensureWalletCoreInit$1 dAppMethodHelper$ensureWalletCoreInit$1;
        C15974ebF c15974ebF;
        if (continuation instanceof DAppMethodHelper$ensureWalletCoreInit$1) {
            dAppMethodHelper$ensureWalletCoreInit$1 = (DAppMethodHelper$ensureWalletCoreInit$1) continuation;
            int i = dAppMethodHelper$ensureWalletCoreInit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppMethodHelper$ensureWalletCoreInit$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppMethodHelper$ensureWalletCoreInit$1 = new DAppMethodHelper$ensureWalletCoreInit$1(this, continuation);
            }
        }
        DAppMethodHelper$ensureWalletCoreInit$1 dAppMethodHelper$ensureWalletCoreInit$12 = dAppMethodHelper$ensureWalletCoreInit$1;
        java.lang.Object objAwaitFirst = dAppMethodHelper$ensureWalletCoreInit$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppMethodHelper$ensureWalletCoreInit$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAwaitFirst);
            pUU.EZpvd("DAppMethodHelper", "ensureWalletCoreInit");
            AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = this.fARcdN.AEQbTJ(true);
            dAppMethodHelper$ensureWalletCoreInit$12.L$0 = this;
            dAppMethodHelper$ensureWalletCoreInit$12.L$1 = function1;
            dAppMethodHelper$ensureWalletCoreInit$12.label = 1;
            objAwaitFirst = AwaitKt.awaitFirst(abstractC58185ywXAEQbTJ, dAppMethodHelper$ensureWalletCoreInit$12);
            if (objAwaitFirst == objCopydefault) {
                return objCopydefault;
            }
            c15974ebF = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objAwaitFirst);
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAwaitFirst);
                throw new java.lang.Exception("WalletCore not initialised");
            }
            function1 = (Function1) dAppMethodHelper$ensureWalletCoreInit$12.L$1;
            c15974ebF = (C15974ebF) dAppMethodHelper$ensureWalletCoreInit$12.L$0;
            C56391yDq.AEQbTJ(objAwaitFirst);
        }
        if (((java.lang.Boolean) objAwaitFirst).booleanValue()) {
            dAppMethodHelper$ensureWalletCoreInit$12.L$0 = null;
            dAppMethodHelper$ensureWalletCoreInit$12.L$1 = null;
            dAppMethodHelper$ensureWalletCoreInit$12.label = 2;
            objAwaitFirst = function1.invoke(dAppMethodHelper$ensureWalletCoreInit$12);
            return objAwaitFirst == objCopydefault ? objCopydefault : objAwaitFirst;
        }
        pUU.copydefault("DAppMethodHelper", "WalletCore.ensureInitialized false");
        int i3 = C13754dXa.FragmentManager.sendQueue;
        dAppMethodHelper$ensureWalletCoreInit$12.L$0 = null;
        dAppMethodHelper$ensureWalletCoreInit$12.L$1 = null;
        dAppMethodHelper$ensureWalletCoreInit$12.label = 3;
        if (displayToast$default(c15974ebF, i3, false, false, false, dAppMethodHelper$ensureWalletCoreInit$12, 14, null) == objCopydefault) {
            return objCopydefault;
        }
        throw new java.lang.Exception("WalletCore not initialised");
    }

    public static /* synthetic */ java.lang.Object displayToast$default(C15974ebF c15974ebF, int i, boolean z, boolean z2, boolean z3, Continuation continuation, int i2, java.lang.Object obj) {
        return c15974ebF.EZpvd(i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, continuation);
    }

    public final java.lang.Object EZpvd(@androidx.annotation.StringRes int i, boolean z, boolean z2, boolean z3, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.AkhnZx, new DAppMethodHelper$displayToast$2(z, i, z2, z3, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
