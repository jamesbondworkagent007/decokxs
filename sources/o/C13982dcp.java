package o;

import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.business.defi.api.bean.CustomNetworkInfo;
import com.okinc.business.defi.biz.core.error.OKWException;
import com.okinc.business.defi.biz.walletconnect.MetaxEthereumTransaction;
import com.okinc.business.defi.biz.walletconnect.NativeCurrency;
import com.okinc.business.defi.biz.walletconnect.OKXAuthPayloadParams;
import com.okinc.business.defi.biz.walletconnect.WCEthereumSignMessage;
import com.okinc.business.defi.biz.walletconnect.WCEthereumTransaction;
import com.okinc.business.defi.biz.walletconnect.WCSolanaSignMessage;
import com.okinc.business.defi.biz.walletconnect.WalletAddEthereumChain;
import com.okinc.business.defi.biz.walletconnect.WalletConnectV2Manager$onForegroundSessionRequest$1;
import com.okinc.business.defi.biz.walletconnect.WalletConnectV2Manager$startSessionRequestListener$1;
import com.okinc.business.defi.biz.walletconnect.WalletSwitchEthereumChain;
import com.okinc.business.defi.biz.walletconnect.WalletWatchAsset;
import com.okinc.business.defi.wallet.common.WalletConnectUtils;
import com.okinc.business.defi.wallet.common.okxconnect.track.ConnectEventTracking;
import com.reown.android.Core;
import com.reown.android.CoreClient;
import com.reown.android.CoreInterface;
import com.reown.android.cacao.signature.SignatureType;
import com.reown.android.internal.common.exception.PairWithExistingPairingIsNotAllowed;
import com.reown.android.relay.ConnectionType;
import com.reown.android.relay.NetworkClientTimeout;
import com.reown.android.relay.RelayConnectionInterface;
import com.reown.walletkit.client.Wallet;
import com.reown.walletkit.client.WalletKit;
import java.net.URISyntaxException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.reactive.AwaitKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.AbstractC13976dcj;
import o.C13754dXa;
import o.C13982dcp;
import o.C6777aVl;
import o.InterfaceC13979dcm;
import o.InterfaceC13980dcn;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dcp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13982dcp {
    public static final C13982dcp AEQbTJ;
    public static final kotlinx.coroutines.channels.Channel<Wallet.Model.SessionRequest> AYXKKw;
    public static final CopyOnWriteArraySet<java.lang.String> AhwBna;
    public static final Creator AkhnZx;
    public static Activity EZpvd;
    public static final Gson KWHzl;
    public static final int OLrzqt;
    public static final Context copydefault;
    public static final CoroutineScope djBIcL;
    public static final AtomicBoolean fetchVPNInfo;
    public static final CopyOnWriteArraySet<java.lang.Long> gEmmrt;
    public static final InterfaceC56387yDm isConnected;
    public static final CopyOnWriteArraySet<Application> valueOf;
    public static InterfaceC13979dcm values;

    /* JADX INFO: renamed from: o.dcp$Canvas */
    public static final class Canvas extends TypeToken<java.util.List<? extends WalletAddEthereumChain>> {
    }

    /* JADX INFO: renamed from: o.dcp$Cursor */
    public static final class Cursor extends TypeToken<WCSolanaSignMessage> {
    }

    /* JADX INFO: renamed from: o.dcp$CursorFactory */
    public static final class CursorFactory extends TypeToken<WalletWatchAsset> {
    }

    /* JADX INFO: renamed from: o.dcp$DatabaseErrorHandler */
    public static final class DatabaseErrorHandler extends TypeToken<java.util.List<? extends WCEthereumTransaction>> {
    }

    /* JADX INFO: renamed from: o.dcp$Resources */
    public static final class Resources extends TypeToken<java.util.List<? extends java.lang.String>> {
    }

    /* JADX INFO: renamed from: o.dcp$SQLiteClosable */
    public static final class SQLiteClosable extends TypeToken<java.util.List<? extends MetaxEthereumTransaction>> {
    }

    /* JADX INFO: renamed from: o.dcp$Theme */
    public static final class Theme extends TypeToken<java.util.List<? extends java.lang.String>> {
    }

    /* JADX INFO: renamed from: o.dcp$TypedArray */
    public static final class TypedArray extends TypeToken<JsonArray> {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull InterfaceC13979dcm interfaceC13979dcm) {
        Intrinsics.checkNotNullParameter(interfaceC13979dcm, "");
        values = interfaceC13979dcm;
    }

    /* JADX INFO: renamed from: o.dcp$Application */
    public static final class Application {
        public final long OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.copydefault;
            }
            if ((i & 2) != 0) {
                j = application.OLrzqt;
            }
            return application.OLrzqt(str, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull java.lang.String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && this.OLrzqt == application.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + java.lang.Long.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SessionRequestIdentifier(topic=" + this.copydefault + ", requestId=" + this.OLrzqt + ")";
        }

        public Application(@NotNull java.lang.String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.OLrzqt = j;
        }
    }

    private C13982dcp() {
    }

    /* JADX DEBUG: Class process forced to load method for inline: kotlinx.coroutines.channels.ChannelKt.Channel$default(int, kotlinx.coroutines.channels.BufferOverflow, kotlin.jvm.functions.Function1, int, java.lang.Object):kotlinx.coroutines.channels.Channel */
    static {
        C13982dcp c13982dcp = new C13982dcp();
        AEQbTJ = c13982dcp;
        fetchVPNInfo = new AtomicBoolean(false);
        isConnected = C56392yDr.copydefault(new Function0() { // from class: o.dcr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C13982dcp.AkhnZx();
            }
        });
        djBIcL = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getIO()));
        AYXKKw = ChannelKt.Channel$default(-2, null, null, 6, null);
        KWHzl = new GsonBuilder().serializeNulls().create();
        AhwBna = new CopyOnWriteArraySet<>();
        gEmmrt = new CopyOnWriteArraySet<>();
        valueOf = new CopyOnWriteArraySet<>();
        copydefault = new Context();
        AkhnZx = new Creator();
        c13982dcp.values();
        OLrzqt = 8;
    }

    public final android.os.Handler isConnected() {
        return (android.os.Handler) isConnected.getValue();
    }

    public static final android.os.Handler AkhnZx() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: o.dcp$Context */
    public static final class Context implements CoreClient.CoreDelegate {
        @Override // com.reown.android.pairing.client.PairingInterface.Delegate
        public void onPairingDelete(Core.Model.DeletedPairing deletedPairing) {
            CoreClient.CoreDelegate.DefaultImpls.onPairingDelete(this, deletedPairing);
        }

        @Override // com.reown.android.pairing.client.PairingInterface.Delegate
        public void onPairingExpired(Core.Model.ExpiredPairing expiredPairing) {
            CoreClient.CoreDelegate.DefaultImpls.onPairingExpired(this, expiredPairing);
        }

        @Override // com.reown.android.pairing.client.PairingInterface.Delegate
        public void onPairingState(Core.Model.PairingState pairingState) {
            Intrinsics.checkNotNullParameter(pairingState, "");
            CoreClient.CoreDelegate.DefaultImpls.onPairingState(this, pairingState);
            pUU.KWHzl("WalletConnectV2Manager", "onPairingState    " + pairingState);
        }
    }

    /* JADX INFO: renamed from: o.dcp$Creator */
    public static final class Creator implements WalletKit.WalletDelegate {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.reown.walletkit.client.WalletKit.WalletDelegate
        public Function2<Wallet.Model.SessionAuthenticate, Wallet.Model.VerifyContext, Unit> getOnSessionAuthenticate() {
            return new Function2() { // from class: o.dco
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C13982dcp.Creator.copydefault((Wallet.Model.SessionAuthenticate) obj, (Wallet.Model.VerifyContext) obj2);
                }
            };
        }

        public static final Unit copydefault(Wallet.Model.SessionAuthenticate sessionAuthenticate, Wallet.Model.VerifyContext verifyContext) {
            Intrinsics.checkNotNullParameter(sessionAuthenticate, "");
            Intrinsics.checkNotNullParameter(verifyContext, "");
            pUU.KWHzl("WalletConnectV2Manager", "onAuthRequest: authRequest=" + sessionAuthenticate);
            pUU.KWHzl("WalletConnectV2Manager", "onAuthRequest: verifyContext=" + verifyContext);
            if (C13982dcp.gEmmrt.add(java.lang.Long.valueOf(sessionAuthenticate.getId()))) {
                Activity activity = C13982dcp.EZpvd;
                if (activity != null) {
                    C13982dcp.AEQbTJ.isConnected().removeCallbacks(activity);
                    C13982dcp.EZpvd = null;
                }
                InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
                if (interfaceC13979dcm != null) {
                    interfaceC13979dcm.AEQbTJ(sessionAuthenticate.getPairingTopic(), sessionAuthenticate.getId(), C13977dck.AEQbTJ(sessionAuthenticate.getPayloadParams()));
                }
            } else {
                pUU.copydefault("WalletConnectV2Manager", "onAuthRequest: id=" + sessionAuthenticate.getId() + " already handling");
            }
            return Unit.INSTANCE;
        }

        @Override // com.reown.walletkit.client.WalletKit.WalletDelegate
        public void onSessionProposal(Wallet.Model.SessionProposal sessionProposal, Wallet.Model.VerifyContext verifyContext) {
            Intrinsics.checkNotNullParameter(sessionProposal, "");
            Intrinsics.checkNotNullParameter(verifyContext, "");
            pUU.KWHzl("WalletConnectV2Manager", "onSessionProposal    " + sessionProposal);
            if (!C13982dcp.AhwBna.add(sessionProposal.getPairingTopic())) {
                pUU.copydefault("WalletConnectV2Manager", "onSessionProposal: topic=" + sessionProposal.getPairingTopic() + " already handling");
                return;
            }
            Activity activity = C13982dcp.EZpvd;
            if (activity != null) {
                C13982dcp.AEQbTJ.isConnected().removeCallbacks(activity);
                C13982dcp.EZpvd = null;
            }
            C13982dcp c13982dcp = C13982dcp.AEQbTJ;
            if (c13982dcp.EZpvd(sessionProposal)) {
                InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
                if (interfaceC13979dcm != null) {
                    interfaceC13979dcm.valueOf(sessionProposal.getPairingTopic());
                    return;
                }
                return;
            }
            InterfaceC13979dcm interfaceC13979dcm2 = C13982dcp.values;
            if (interfaceC13979dcm2 != null) {
                interfaceC13979dcm2.EZpvd(sessionProposal.getPairingTopic());
            }
            c13982dcp.KWHzl(sessionProposal.getPairingTopic(), true);
        }

        @Override // com.reown.walletkit.client.WalletKit.WalletDelegate
        public void onSessionSettleResponse(Wallet.Model.SettledSessionResponse settledSessionResponse) {
            Intrinsics.checkNotNullParameter(settledSessionResponse, "");
            pUU.KWHzl("WalletConnectV2Manager", "onSessionSettleResponse    " + settledSessionResponse);
            if (settledSessionResponse instanceof Wallet.Model.SettledSessionResponse.Result) {
                InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
                if (interfaceC13979dcm != null) {
                    Wallet.Model.SettledSessionResponse.Result result = (Wallet.Model.SettledSessionResponse.Result) settledSessionResponse;
                    interfaceC13979dcm.EZpvd(result.getSession().getPairingTopic(), result.getSession().getTopic(), result.getSession().getExpiry());
                    return;
                }
                return;
            }
            if (!(settledSessionResponse instanceof Wallet.Model.SettledSessionResponse.Error)) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.copydefault("WalletConnectV2Manager", "onSessionSettleResponse: Error(" + ((Wallet.Model.SettledSessionResponse.Error) settledSessionResponse).getErrorMessage() + ")");
            InterfaceC13979dcm interfaceC13979dcm2 = C13982dcp.values;
            if (interfaceC13979dcm2 != null) {
                interfaceC13979dcm2.copydefault(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            }
        }

        @Override // com.reown.walletkit.client.WalletKit.WalletDelegate
        public void onSessionUpdateResponse(Wallet.Model.SessionUpdateResponse sessionUpdateResponse) {
            Intrinsics.checkNotNullParameter(sessionUpdateResponse, "");
            pUU.KWHzl("WalletConnectV2Manager", "onSessionUpdateResponse    " + sessionUpdateResponse);
        }

        @Override // com.reown.walletkit.client.WalletKit.WalletDelegate
        public void onSessionRequest(Wallet.Model.SessionRequest sessionRequest, Wallet.Model.VerifyContext verifyContext) {
            Intrinsics.checkNotNullParameter(sessionRequest, "");
            Intrinsics.checkNotNullParameter(verifyContext, "");
            pUU.KWHzl("WalletConnectV2Manager", "onSessionRequest topic=" + sessionRequest.getTopic());
            pUU.KWHzl("WalletConnectV2Manager", "onSessionRequest id=" + sessionRequest.getRequest().getId());
            pUU.KWHzl("WalletConnectV2Manager", "onSessionRequest method=" + sessionRequest.getRequest().getMethod());
            pUU.KWHzl("WalletConnectV2Manager", "onSessionRequest params=" + sessionRequest.getRequest().getParams());
            C13982dcp.AYXKKw.mo5769trySendJP2dKIU(sessionRequest);
        }

        @Override // com.reown.walletkit.client.WalletKit.WalletDelegate
        public void onSessionExtend(Wallet.Model.Session session) {
            Intrinsics.checkNotNullParameter(session, "");
            pUU.KWHzl("WalletConnectV2Manager", "onSessionExtend    " + session);
        }

        @Override // com.reown.walletkit.client.WalletKit.WalletDelegate
        public void onSessionDelete(Wallet.Model.SessionDelete sessionDelete) {
            Intrinsics.checkNotNullParameter(sessionDelete, "");
            pUU.KWHzl("WalletConnectV2Manager", "onSessionDelete    " + sessionDelete);
            if (!(sessionDelete instanceof Wallet.Model.SessionDelete.Success)) {
                if (!(sessionDelete instanceof Wallet.Model.SessionDelete.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
                if (interfaceC13979dcm != null) {
                    interfaceC13979dcm.copydefault(((Wallet.Model.SessionDelete.Success) sessionDelete).getTopic(), false);
                }
            }
        }

        @Override // com.reown.walletkit.client.WalletKit.WalletDelegate
        public void onProposalExpired(Wallet.Model.ExpiredProposal expiredProposal) {
            Intrinsics.checkNotNullParameter(expiredProposal, "");
            WalletKit.WalletDelegate.DefaultImpls.onProposalExpired(this, expiredProposal);
            pUU.KWHzl("WalletConnectV2Manager", "onProposalExpired    topic: " + expiredProposal.getPairingTopic());
        }

        @Override // com.reown.walletkit.client.WalletKit.WalletDelegate
        public void onRequestExpired(Wallet.Model.ExpiredRequest expiredRequest) {
            Intrinsics.checkNotNullParameter(expiredRequest, "");
            WalletKit.WalletDelegate.DefaultImpls.onRequestExpired(this, expiredRequest);
            pUU.KWHzl("WalletConnectV2Manager", "onRequestExpired    id: " + expiredRequest.getId());
        }

        @Override // com.reown.walletkit.client.WalletKit.WalletDelegate
        public void onConnectionStateChange(Wallet.Model.ConnectionState connectionState) {
            Intrinsics.checkNotNullParameter(connectionState, "");
            pUU.KWHzl("WalletConnectV2Manager", "onConnectionStateChange    " + connectionState);
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.dcm.StateListAnimator.onFailure$default(o.dcm, java.lang.String, int, java.lang.Object):void */
        @Override // com.reown.walletkit.client.WalletKit.WalletDelegate
        public void onError(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            pUU.AEQbTJ("WalletConnectV2Manager", "onError", error.getThrowable());
            InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
            if (interfaceC13979dcm != null) {
                InterfaceC13979dcm.StateListAnimator.onFailure$default(interfaceC13979dcm, null, 1, null);
            }
        }
    }

    public final boolean copydefault(Wallet.Model.SessionRequest sessionRequest) {
        java.lang.Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull((java.util.List) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) kotlinx.serialization.json.JsonArray.Companion.serializer(), sessionRequest.getRequest().getParams()));
        JsonObject jsonObject = objFirstOrNull instanceof JsonObject ? (JsonObject) objFirstOrNull : null;
        JsonElement jsonElement = jsonObject != null ? (JsonElement) jsonObject.get((java.lang.Object) "from") : null;
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null && jsonPrimitive.isString()) {
            return true;
        }
        C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
        OKWException oKWException = new OKWException("WalletKit eth_sendTransactions invalid params", null);
        kotlin.Pair[] pairArr = new kotlin.Pair[3];
        pairArr[0] = C56390yDp.OLrzqt(MetricsSQLiteCacheKt.METRICS_PARAMS, sessionRequest.getRequest().getParams());
        Core.Model.AppMetaData peerMetaData = sessionRequest.getPeerMetaData();
        java.lang.String name = peerMetaData != null ? peerMetaData.getName() : null;
        if (name == null) {
            name = "";
        }
        pairArr[1] = C56390yDp.OLrzqt("name", name);
        Core.Model.AppMetaData peerMetaData2 = sessionRequest.getPeerMetaData();
        java.lang.String url = peerMetaData2 != null ? peerMetaData2.getUrl() : null;
        pairArr[2] = C56390yDp.OLrzqt("dapp", url != null ? url : "");
        taskDescription.OLrzqt(oKWException, C56424yEw.gEmmrt(pairArr), java.lang.Boolean.FALSE);
        rejectRequest$default(this, sessionRequest.getTopic(), sessionRequest.getRequest().getId(), "WalletKit eth_sendTransactions invalid params", 0, false, 24, null);
        return false;
    }

    /* JADX INFO: renamed from: o.dcp$Activity */
    public static final class Activity implements java.lang.Runnable {
        public final java.lang.String AEQbTJ;

        public Activity(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            pUU.KWHzl("WalletConnectV2Manager", "timed out after connect " + this.AEQbTJ + " success");
            InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
            if (interfaceC13979dcm != null) {
                interfaceC13979dcm.EZpvd(this.AEQbTJ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            }
        }
    }

    public final Job values() {
        return BuildersKt__Builders_commonKt.launch$default(djBIcL, null, null, new WalletConnectV2Manager$startSessionRequestListener$1(null), 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [323=12] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0342 A[Catch: Exception -> 0x0642, LOOP:0: B:126:0x033c->B:128:0x0342, LOOP_END, TryCatch #6 {Exception -> 0x0642, blocks: (B:83:0x01e8, B:85:0x01f0, B:86:0x01fc, B:236:0x0618, B:88:0x0201, B:121:0x02ff, B:123:0x031d, B:125:0x0321, B:126:0x033c, B:128:0x0342, B:129:0x0352, B:130:0x035e, B:91:0x020b, B:94:0x0215, B:96:0x0219, B:97:0x0234, B:100:0x023e, B:102:0x025d, B:103:0x0270, B:106:0x027a, B:108:0x029a, B:109:0x02ad, B:112:0x02b7, B:114:0x02d5, B:116:0x02d9, B:117:0x02f1, B:118:0x02f5, B:131:0x0362, B:134:0x036c, B:136:0x038e, B:138:0x0397, B:140:0x039d, B:142:0x03a3, B:144:0x03ae, B:146:0x03b4, B:148:0x03bd, B:150:0x03c8, B:153:0x03d3, B:155:0x03d9, B:156:0x03e2, B:158:0x03e8, B:160:0x03fb, B:164:0x0406, B:166:0x040c, B:169:0x0417, B:171:0x041d, B:173:0x0428, B:175:0x0440, B:177:0x044e, B:179:0x0454, B:180:0x0458, B:181:0x045f, B:182:0x0463, B:185:0x046d, B:187:0x048d, B:189:0x0498, B:192:0x04b0, B:194:0x04b6, B:195:0x04bd, B:197:0x04c3, B:198:0x04d4, B:199:0x04d8, B:202:0x04e2, B:204:0x0525, B:206:0x0529, B:207:0x053a, B:208:0x053e, B:211:0x0548, B:213:0x0568, B:214:0x057f, B:217:0x0589, B:219:0x05a7, B:221:0x05ab, B:222:0x05c3, B:223:0x05c7, B:226:0x05d0, B:228:0x05d6, B:230:0x05d9, B:232:0x0600, B:234:0x0604, B:235:0x0615), top: B:257:0x01e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ae A[PHI: r4 r12 r14
  0x01ae: PHI (r4v9 o.dcp$Application) = (r4v7 o.dcp$Application), (r4v11 o.dcp$Application) binds: [B:74:0x01ab, B:68:0x01a1] A[DONT_GENERATE, DONT_INLINE]
  0x01ae: PHI (r12v8 o.dcp) = (r12v0 o.dcp), (r12v10 o.dcp) binds: [B:74:0x01ab, B:68:0x01a1] A[DONT_GENERATE, DONT_INLINE]
  0x01ae: PHI (r14v9 com.reown.walletkit.client.Wallet$Model$SessionRequest) = 
  (r14v2 com.reown.walletkit.client.Wallet$Model$SessionRequest)
  (r14v11 com.reown.walletkit.client.Wallet$Model$SessionRequest)
 binds: [B:74:0x01ab, B:68:0x01a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1 A[Catch: Exception -> 0x01a5, TryCatch #2 {Exception -> 0x01a5, blocks: (B:67:0x019b, B:77:0x01b1, B:79:0x01d1), top: B:250:0x019b }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d1 A[Catch: Exception -> 0x01a5, TRY_LEAVE, TryCatch #2 {Exception -> 0x01a5, blocks: (B:67:0x019b, B:77:0x01b1, B:79:0x01d1), top: B:250:0x019b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01f0 A[Catch: Exception -> 0x0642, TryCatch #6 {Exception -> 0x0642, blocks: (B:83:0x01e8, B:85:0x01f0, B:86:0x01fc, B:236:0x0618, B:88:0x0201, B:121:0x02ff, B:123:0x031d, B:125:0x0321, B:126:0x033c, B:128:0x0342, B:129:0x0352, B:130:0x035e, B:91:0x020b, B:94:0x0215, B:96:0x0219, B:97:0x0234, B:100:0x023e, B:102:0x025d, B:103:0x0270, B:106:0x027a, B:108:0x029a, B:109:0x02ad, B:112:0x02b7, B:114:0x02d5, B:116:0x02d9, B:117:0x02f1, B:118:0x02f5, B:131:0x0362, B:134:0x036c, B:136:0x038e, B:138:0x0397, B:140:0x039d, B:142:0x03a3, B:144:0x03ae, B:146:0x03b4, B:148:0x03bd, B:150:0x03c8, B:153:0x03d3, B:155:0x03d9, B:156:0x03e2, B:158:0x03e8, B:160:0x03fb, B:164:0x0406, B:166:0x040c, B:169:0x0417, B:171:0x041d, B:173:0x0428, B:175:0x0440, B:177:0x044e, B:179:0x0454, B:180:0x0458, B:181:0x045f, B:182:0x0463, B:185:0x046d, B:187:0x048d, B:189:0x0498, B:192:0x04b0, B:194:0x04b6, B:195:0x04bd, B:197:0x04c3, B:198:0x04d4, B:199:0x04d8, B:202:0x04e2, B:204:0x0525, B:206:0x0529, B:207:0x053a, B:208:0x053e, B:211:0x0548, B:213:0x0568, B:214:0x057f, B:217:0x0589, B:219:0x05a7, B:221:0x05ab, B:222:0x05c3, B:223:0x05c7, B:226:0x05d0, B:228:0x05d6, B:230:0x05d9, B:232:0x0600, B:234:0x0604, B:235:0x0615), top: B:257:0x01e8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Wallet.Model.SessionRequest sessionRequest, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WalletConnectV2Manager$onForegroundSessionRequest$1 walletConnectV2Manager$onForegroundSessionRequest$1;
        Application application;
        Wallet.Model.SessionRequest sessionRequest2;
        C13982dcp c13982dcp;
        C13982dcp c13982dcp2;
        java.lang.String chainId;
        C13982dcp c13982dcp3;
        boolean z;
        Application application2;
        InterfaceC13979dcm interfaceC13979dcm;
        InterfaceC13979dcm interfaceC13979dcm2;
        InterfaceC13979dcm interfaceC13979dcm3;
        java.util.ArrayList arrayList;
        java.lang.String chainId2;
        java.util.List<java.lang.String> blockExplorerUrls;
        NativeCurrency nativeCurrency;
        java.util.List<java.lang.String> rpcUrls;
        java.util.List<java.lang.String> icons;
        InterfaceC13979dcm interfaceC13979dcm4;
        JsonArray jsonArray;
        InterfaceC13979dcm interfaceC13979dcm5;
        java.util.Iterator<com.google.gson.JsonElement> it;
        if (continuation instanceof WalletConnectV2Manager$onForegroundSessionRequest$1) {
            walletConnectV2Manager$onForegroundSessionRequest$1 = (WalletConnectV2Manager$onForegroundSessionRequest$1) continuation;
            int i = walletConnectV2Manager$onForegroundSessionRequest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletConnectV2Manager$onForegroundSessionRequest$1.label = i - Integer.MIN_VALUE;
            } else {
                walletConnectV2Manager$onForegroundSessionRequest$1 = new WalletConnectV2Manager$onForegroundSessionRequest$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = walletConnectV2Manager$onForegroundSessionRequest$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = walletConnectV2Manager$onForegroundSessionRequest$1.label;
        java.lang.String strOLrzqt = null;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            try {
                Result.Application application3 = Result.Companion;
                ConnectEventTracking connectEventTracking = ConnectEventTracking.AEQbTJ;
                Core.Model.AppMetaData peerMetaData = sessionRequest.getPeerMetaData();
                java.lang.String url = peerMetaData != null ? peerMetaData.getUrl() : null;
                java.lang.String str = url == null ? "" : url;
                java.lang.String method = sessionRequest.getRequest().getMethod();
                java.lang.String chainId3 = sessionRequest.getChainId();
                if (chainId3 != null) {
                    InterfaceC13987dcu interfaceC13987dcuAEQbTJ = InterfaceC13987dcu.Companion.AEQbTJ(chainId3);
                    if (interfaceC13987dcuAEQbTJ == null || (chainId = C56443yFo.KWHzl(interfaceC13987dcuAEQbTJ.OLrzqt()).toString()) == null) {
                        chainId = sessionRequest.getChainId();
                    }
                } else {
                    chainId = null;
                }
                java.lang.String str2 = chainId == null ? "" : chainId;
                Core.Model.AppMetaData peerMetaData2 = sessionRequest.getPeerMetaData();
                java.lang.String name = peerMetaData2 != null ? peerMetaData2.getName() : null;
                Result.m7377constructorimpl(Result.m7376boximpl(connectEventTracking.EZpvd(str, method, str2, name == null ? "" : name, ConnectEventTracking.Source.WALLET_CONNECT)));
            } catch (java.lang.Throwable th) {
                Result.Application application4 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            pUU.KWHzl("WalletConnectV2Manager", "onForegroundSessionRequest topic=" + sessionRequest.getTopic());
            pUU.KWHzl("WalletConnectV2Manager", "onForegroundSessionRequest id=" + sessionRequest.getRequest().getId());
            pUU.KWHzl("WalletConnectV2Manager", "onForegroundSessionRequest method=" + sessionRequest.getRequest().getMethod());
            pUU.KWHzl("WalletConnectV2Manager", "onForegroundSessionRequest params=" + sessionRequest.getRequest().getParams());
            application = new Application(sessionRequest.getTopic(), sessionRequest.getRequest().getId());
            if (!valueOf.add(application)) {
                pUU.copydefault("WalletConnectV2Manager", "onForegroundSessionRequest: " + application + " already handling");
                return Unit.INSTANCE;
            }
            try {
                InterfaceC13979dcm interfaceC13979dcm6 = values;
                if (interfaceC13979dcm6 != null) {
                    java.lang.String topic = sessionRequest.getTopic();
                    long id = sessionRequest.getRequest().getId();
                    walletConnectV2Manager$onForegroundSessionRequest$1.L$0 = this;
                    sessionRequest2 = sessionRequest;
                    try {
                        walletConnectV2Manager$onForegroundSessionRequest$1.L$1 = sessionRequest2;
                        walletConnectV2Manager$onForegroundSessionRequest$1.L$2 = application;
                        walletConnectV2Manager$onForegroundSessionRequest$1.label = 1;
                        objCopydefault = interfaceC13979dcm6.copydefault(topic, id, walletConnectV2Manager$onForegroundSessionRequest$1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        c13982dcp2 = this;
                        if (!((java.lang.Boolean) objCopydefault).booleanValue()) {
                        }
                        if (z) {
                        }
                    } catch (java.lang.Exception e) {
                        e = e;
                        c13982dcp = this;
                        pUU.AEQbTJ("WalletConnectV2Manager", "onForegroundSessionRequest", e);
                        rejectRequest$default(c13982dcp, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), "Error when handling session request", 0, false, 24, null);
                    }
                } else {
                    sessionRequest2 = sessionRequest;
                    c13982dcp2 = this;
                    if (z) {
                    }
                }
            } catch (java.lang.Exception e2) {
                e = e2;
                sessionRequest2 = sessionRequest;
            }
            c13982dcp = this;
            pUU.AEQbTJ("WalletConnectV2Manager", "onForegroundSessionRequest", e);
            rejectRequest$default(c13982dcp, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), "Error when handling session request", 0, false, 24, null);
        } else if (i2 == 1) {
            application = (Application) walletConnectV2Manager$onForegroundSessionRequest$1.L$2;
            Wallet.Model.SessionRequest sessionRequest3 = (Wallet.Model.SessionRequest) walletConnectV2Manager$onForegroundSessionRequest$1.L$1;
            c13982dcp2 = (C13982dcp) walletConnectV2Manager$onForegroundSessionRequest$1.L$0;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
                sessionRequest2 = sessionRequest3;
            } catch (java.lang.Exception e3) {
                e = e3;
                sessionRequest2 = sessionRequest3;
                c13982dcp3 = c13982dcp2;
                c13982dcp = c13982dcp3;
                pUU.AEQbTJ("WalletConnectV2Manager", "onForegroundSessionRequest", e);
                rejectRequest$default(c13982dcp, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), "Error when handling session request", 0, false, 24, null);
                return Unit.INSTANCE;
            }
            try {
                z = !((java.lang.Boolean) objCopydefault).booleanValue();
                if (z) {
                    pUU.KWHzl("WalletConnectV2Manager", "onForegroundSessionRequest " + sessionRequest2.getTopic() + " unavailable");
                    return Unit.INSTANCE;
                }
                AbstractC58185ywX<java.lang.Boolean> abstractC58185ywXAEQbTJ = C10337bmZ.KWHzl.AEQbTJ(true);
                walletConnectV2Manager$onForegroundSessionRequest$1.L$0 = c13982dcp2;
                walletConnectV2Manager$onForegroundSessionRequest$1.L$1 = sessionRequest2;
                walletConnectV2Manager$onForegroundSessionRequest$1.L$2 = application;
                walletConnectV2Manager$onForegroundSessionRequest$1.label = 2;
                objCopydefault = AwaitKt.awaitFirst(abstractC58185ywXAEQbTJ, walletConnectV2Manager$onForegroundSessionRequest$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                application2 = application;
                c13982dcp3 = c13982dcp2;
                if (((java.lang.Boolean) objCopydefault).booleanValue()) {
                }
            } catch (java.lang.Exception e4) {
                e = e4;
                c13982dcp3 = c13982dcp2;
                c13982dcp = c13982dcp3;
                pUU.AEQbTJ("WalletConnectV2Manager", "onForegroundSessionRequest", e);
                rejectRequest$default(c13982dcp, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), "Error when handling session request", 0, false, 24, null);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            application2 = (Application) walletConnectV2Manager$onForegroundSessionRequest$1.L$2;
            Wallet.Model.SessionRequest sessionRequest4 = (Wallet.Model.SessionRequest) walletConnectV2Manager$onForegroundSessionRequest$1.L$1;
            c13982dcp3 = (C13982dcp) walletConnectV2Manager$onForegroundSessionRequest$1.L$0;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
                sessionRequest2 = sessionRequest4;
                try {
                    if (((java.lang.Boolean) objCopydefault).booleanValue()) {
                        java.lang.String method2 = sessionRequest2.getRequest().getMethod();
                        switch (method2.hashCode()) {
                            case -1958497392:
                                if (method2.equals("eth_sendTransaction")) {
                                    if (!c13982dcp3.copydefault(sessionRequest2)) {
                                        return Unit.INSTANCE;
                                    }
                                    Gson gson = KWHzl;
                                    Intrinsics.checkNotNullExpressionValue(gson, "");
                                    java.lang.Object objFromJson = gson.fromJson(sessionRequest2.getRequest().getParams(), new DatabaseErrorHandler().getType());
                                    Intrinsics.checkNotNullExpressionValue(objFromJson, "");
                                    WCEthereumTransaction wCEthereumTransaction = (WCEthereumTransaction) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objFromJson);
                                    if (wCEthereumTransaction != null && (interfaceC13979dcm = values) != null) {
                                        interfaceC13979dcm.AEQbTJ(sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), wCEthereumTransaction);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    Unit unit2 = Unit.INSTANCE;
                                } else {
                                    c13982dcp3.isConnected(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode));
                                    rejectRequest$default(c13982dcp3, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode), 0, false, 24, null);
                                    Unit unit3 = Unit.INSTANCE;
                                }
                                break;
                            case -1424874333:
                                if (method2.equals("eth_sign")) {
                                    Gson gson2 = KWHzl;
                                    Intrinsics.checkNotNullExpressionValue(gson2, "");
                                    java.util.List list = (java.util.List) gson2.fromJson(sessionRequest2.getRequest().getParams(), new Resources().getType());
                                    if (list != null && (interfaceC13979dcm2 = values) != null) {
                                        interfaceC13979dcm2.AEQbTJ(sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), new WCEthereumSignMessage(list, WCEthereumSignMessage.WCSignType.MESSAGE));
                                        Unit unit4 = Unit.INSTANCE;
                                    }
                                    Unit unit5 = Unit.INSTANCE;
                                } else {
                                    c13982dcp3.isConnected(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode));
                                    rejectRequest$default(c13982dcp3, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode), 0, false, 24, null);
                                    Unit unit32 = Unit.INSTANCE;
                                }
                                break;
                            case -1073453553:
                                if (method2.equals("solana_signMessage")) {
                                    Gson gson3 = KWHzl;
                                    Intrinsics.checkNotNullExpressionValue(gson3, "");
                                    WCSolanaSignMessage wCSolanaSignMessage = (WCSolanaSignMessage) gson3.fromJson(sessionRequest2.getRequest().getParams(), new Cursor().getType());
                                    InterfaceC13979dcm interfaceC13979dcm7 = values;
                                    if (interfaceC13979dcm7 != null) {
                                        interfaceC13979dcm7.EZpvd(sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), wCSolanaSignMessage.getMessage());
                                        Unit unit6 = Unit.INSTANCE;
                                    }
                                } else {
                                    c13982dcp3.isConnected(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode));
                                    rejectRequest$default(c13982dcp3, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode), 0, false, 24, null);
                                    Unit unit322 = Unit.INSTANCE;
                                }
                                break;
                            case -872177398:
                                if (method2.equals("metax_sendTransaction")) {
                                    pUU.KWHzl("WalletConnectV2Manager", "METAX_SENDTRANSACTION: " + sessionRequest2.getRequest().getParams());
                                    Gson gson4 = KWHzl;
                                    Intrinsics.checkNotNullExpressionValue(gson4, "");
                                    java.lang.Object objFromJson2 = gson4.fromJson(sessionRequest2.getRequest().getParams(), new SQLiteClosable().getType());
                                    Intrinsics.checkNotNullExpressionValue(objFromJson2, "");
                                    MetaxEthereumTransaction metaxEthereumTransaction = (MetaxEthereumTransaction) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) objFromJson2);
                                    if (metaxEthereumTransaction != null && (interfaceC13979dcm3 = values) != null) {
                                        interfaceC13979dcm3.OLrzqt(sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), metaxEthereumTransaction);
                                        Unit unit7 = Unit.INSTANCE;
                                    }
                                    Unit unit8 = Unit.INSTANCE;
                                } else {
                                    c13982dcp3.isConnected(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode));
                                    rejectRequest$default(c13982dcp3, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode), 0, false, 24, null);
                                    Unit unit3222 = Unit.INSTANCE;
                                }
                                break;
                            case -120530073:
                                if (method2.equals("wallet_watchAsset")) {
                                    Gson gson5 = KWHzl;
                                    Intrinsics.checkNotNullExpressionValue(gson5, "");
                                    WalletWatchAsset walletWatchAsset = (WalletWatchAsset) gson5.fromJson(sessionRequest2.getRequest().getParams(), new CursorFactory().getType());
                                    if (walletWatchAsset != null) {
                                        valueOf.remove(application2);
                                        java.lang.String chainId4 = sessionRequest2.getChainId();
                                        java.util.List listSplit$default = chainId4 != null ? StringsKt__StringsKt.split$default((java.lang.CharSequence) chainId4, new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null) : null;
                                        if (listSplit$default != null && listSplit$default.size() == 2) {
                                            strOLrzqt = (java.lang.String) listSplit$default.get(1);
                                        }
                                        java.lang.String str3 = strOLrzqt;
                                        InterfaceC13979dcm interfaceC13979dcm8 = values;
                                        if (interfaceC13979dcm8 != null) {
                                            interfaceC13979dcm8.copydefault(sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), str3, walletWatchAsset);
                                            Unit unit9 = Unit.INSTANCE;
                                        }
                                    }
                                    Unit unit10 = Unit.INSTANCE;
                                } else {
                                    c13982dcp3.isConnected(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode));
                                    rejectRequest$default(c13982dcp3, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode), 0, false, 24, null);
                                    Unit unit32222 = Unit.INSTANCE;
                                }
                                break;
                            case 27131247:
                                if (method2.equals("wallet_addEthereumChain")) {
                                    Gson gson6 = KWHzl;
                                    Intrinsics.checkNotNullExpressionValue(gson6, "");
                                    java.util.List list2 = (java.util.List) gson6.fromJson(sessionRequest2.getRequest().getParams(), new Canvas().getType());
                                    Core.Model.AppMetaData peerMetaData3 = sessionRequest2.getPeerMetaData();
                                    java.lang.String name2 = peerMetaData3 != null ? peerMetaData3.getName() : null;
                                    Core.Model.AppMetaData peerMetaData4 = sessionRequest2.getPeerMetaData();
                                    java.lang.String str4 = (peerMetaData4 == null || (icons = peerMetaData4.getIcons()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(icons);
                                    Core.Model.AppMetaData peerMetaData5 = sessionRequest2.getPeerMetaData();
                                    java.lang.String url2 = peerMetaData5 != null ? peerMetaData5.getUrl() : null;
                                    Intrinsics.copydefault(list2);
                                    WalletAddEthereumChain walletAddEthereumChain = (WalletAddEthereumChain) CollectionsKt___CollectionsKt.firstOrNull(list2);
                                    java.lang.String chainName = walletAddEthereumChain != null ? walletAddEthereumChain.getChainName() : null;
                                    if (walletAddEthereumChain == null || (rpcUrls = walletAddEthereumChain.getRpcUrls()) == null) {
                                        arrayList = null;
                                    } else {
                                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                        for (java.lang.Object obj : rpcUrls) {
                                            if (WalletConnectUtils.ActionBar.getInstance$default(WalletConnectUtils.Companion, null, 1, null).AkhnZx((java.lang.String) obj)) {
                                                arrayList2.add(obj);
                                            }
                                        }
                                        arrayList = arrayList2;
                                    }
                                    CustomNetworkInfo customNetworkInfo = new CustomNetworkInfo(str4, name2, url2, chainName, arrayList, (walletAddEthereumChain == null || (nativeCurrency = walletAddEthereumChain.getNativeCurrency()) == null) ? null : nativeCurrency.getSymbol(), (walletAddEthereumChain == null || (blockExplorerUrls = walletAddEthereumChain.getBlockExplorerUrls()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(blockExplorerUrls), null, 0, MLKEMEngine.KyberPolyBytes, null);
                                    valueOf.remove(application2);
                                    InterfaceC13979dcm interfaceC13979dcm9 = values;
                                    if (interfaceC13979dcm9 != null) {
                                        java.lang.String topic2 = sessionRequest2.getTopic();
                                        long id2 = sessionRequest2.getRequest().getId();
                                        if (walletAddEthereumChain != null && (chainId2 = walletAddEthereumChain.getChainId()) != null) {
                                            strOLrzqt = C33491mxU.OLrzqt(chainId2);
                                        }
                                        interfaceC13979dcm9.AEQbTJ(topic2, id2, strOLrzqt, customNetworkInfo);
                                        Unit unit11 = Unit.INSTANCE;
                                    }
                                    Unit unit12 = Unit.INSTANCE;
                                } else {
                                    c13982dcp3.isConnected(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode));
                                    rejectRequest$default(c13982dcp3, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode), 0, false, 24, null);
                                    Unit unit322222 = Unit.INSTANCE;
                                }
                                break;
                            case 510720465:
                                if (!method2.equals("eth_signTypedData")) {
                                    c13982dcp3.isConnected(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode));
                                    rejectRequest$default(c13982dcp3, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode), 0, false, 24, null);
                                    Unit unit3222222 = Unit.INSTANCE;
                                }
                                Gson gson7 = KWHzl;
                                Intrinsics.checkNotNullExpressionValue(gson7, "");
                                jsonArray = (JsonArray) gson7.fromJson(sessionRequest2.getRequest().getParams(), new TypedArray().getType());
                                if (jsonArray != null && (interfaceC13979dcm5 = values) != null) {
                                    java.lang.String topic3 = sessionRequest2.getTopic();
                                    long id3 = sessionRequest2.getRequest().getId();
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(jsonArray, 10));
                                    it = jsonArray.iterator();
                                    while (it.hasNext()) {
                                        arrayList3.add(KWHzl.toJson(it.next()));
                                    }
                                    interfaceC13979dcm5.AEQbTJ(topic3, id3, new WCEthereumSignMessage(arrayList3, WCEthereumSignMessage.WCSignType.TYPED_MESSAGE));
                                    Unit unit13 = Unit.INSTANCE;
                                }
                                Unit unit14 = Unit.INSTANCE;
                                break;
                            case 581195868:
                                if (method2.equals("personal_sign")) {
                                    Gson gson8 = KWHzl;
                                    Intrinsics.checkNotNullExpressionValue(gson8, "");
                                    java.util.List list3 = (java.util.List) gson8.fromJson(sessionRequest2.getRequest().getParams(), new Theme().getType());
                                    if (list3 != null && (interfaceC13979dcm4 = values) != null) {
                                        interfaceC13979dcm4.AEQbTJ(sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), new WCEthereumSignMessage(list3, WCEthereumSignMessage.WCSignType.PERSONAL_MESSAGE));
                                        Unit unit15 = Unit.INSTANCE;
                                    }
                                    Unit unit16 = Unit.INSTANCE;
                                } else {
                                    c13982dcp3.isConnected(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode));
                                    rejectRequest$default(c13982dcp3, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode), 0, false, 24, null);
                                    Unit unit32222222 = Unit.INSTANCE;
                                }
                                break;
                            case 907795424:
                                if (method2.equals("sync_all_addresses")) {
                                    pUU.KWHzl("WalletConnectV2Manager", "SYNC_ALL_ADDRESSES: " + sessionRequest2.getRequest().getParams());
                                    InterfaceC13979dcm interfaceC13979dcm10 = values;
                                    if (interfaceC13979dcm10 != null) {
                                        interfaceC13979dcm10.copydefault(sessionRequest2.getTopic(), sessionRequest2.getRequest().getId());
                                        Unit unit17 = Unit.INSTANCE;
                                    }
                                } else {
                                    c13982dcp3.isConnected(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode));
                                    rejectRequest$default(c13982dcp3, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode), 0, false, 24, null);
                                    Unit unit322222222 = Unit.INSTANCE;
                                }
                                break;
                            case 1865879792:
                                if (method2.equals("wallet_switchEthereumChain")) {
                                    java.util.List<WalletSwitchEthereumChain> list4 = (java.util.List) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) new ArrayListSerializer(WalletSwitchEthereumChain.Companion.serializer()), sessionRequest2.getRequest().getParams());
                                    InterfaceC13979dcm interfaceC13979dcm11 = values;
                                    if (interfaceC13979dcm11 != null) {
                                        interfaceC13979dcm11.KWHzl(sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), list4);
                                        Unit unit18 = Unit.INSTANCE;
                                    }
                                } else {
                                    c13982dcp3.isConnected(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode));
                                    rejectRequest$default(c13982dcp3, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode), 0, false, 24, null);
                                    Unit unit3222222222 = Unit.INSTANCE;
                                }
                                break;
                            case 1879569638:
                                if (method2.equals("solana_signTransaction")) {
                                    InterfaceC13979dcm interfaceC13979dcm12 = values;
                                    if (interfaceC13979dcm12 != null) {
                                        interfaceC13979dcm12.OLrzqt(sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), sessionRequest2.getRequest().getParams());
                                        Unit unit19 = Unit.INSTANCE;
                                    }
                                } else {
                                    c13982dcp3.isConnected(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode));
                                    rejectRequest$default(c13982dcp3, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode), 0, false, 24, null);
                                    Unit unit32222222222 = Unit.INSTANCE;
                                }
                                break;
                            case 2099305388:
                                if (!method2.equals("eth_signTypedData_v4")) {
                                    c13982dcp3.isConnected(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode));
                                    rejectRequest$default(c13982dcp3, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode), 0, false, 24, null);
                                    Unit unit322222222222 = Unit.INSTANCE;
                                }
                                Gson gson72 = KWHzl;
                                Intrinsics.checkNotNullExpressionValue(gson72, "");
                                jsonArray = (JsonArray) gson72.fromJson(sessionRequest2.getRequest().getParams(), new TypedArray().getType());
                                if (jsonArray != null) {
                                    java.lang.String topic32 = sessionRequest2.getTopic();
                                    long id32 = sessionRequest2.getRequest().getId();
                                    java.util.ArrayList arrayList32 = new java.util.ArrayList(C56403yEb.AYXKKw(jsonArray, 10));
                                    it = jsonArray.iterator();
                                    while (it.hasNext()) {
                                    }
                                    interfaceC13979dcm5.AEQbTJ(topic32, id32, new WCEthereumSignMessage(arrayList32, WCEthereumSignMessage.WCSignType.TYPED_MESSAGE));
                                    Unit unit132 = Unit.INSTANCE;
                                }
                                Unit unit142 = Unit.INSTANCE;
                                break;
                            default:
                                c13982dcp3.isConnected(C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode));
                                rejectRequest$default(c13982dcp3, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), C33070mpX.AYXKKw(C13754dXa.FragmentManager.getStatusCode), 0, false, 24, null);
                                Unit unit3222222222222 = Unit.INSTANCE;
                                break;
                        }
                    }
                } catch (java.lang.Exception e5) {
                    e = e5;
                    c13982dcp = c13982dcp3;
                    pUU.AEQbTJ("WalletConnectV2Manager", "onForegroundSessionRequest", e);
                    rejectRequest$default(c13982dcp, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), "Error when handling session request", 0, false, 24, null);
                }
            } catch (java.lang.Exception e6) {
                e = e6;
                c13982dcp = c13982dcp3;
                sessionRequest2 = sessionRequest4;
                pUU.AEQbTJ("WalletConnectV2Manager", "onForegroundSessionRequest", e);
                rejectRequest$default(c13982dcp, sessionRequest2.getTopic(), sessionRequest2.getRequest().getId(), "Error when handling session request", 0, false, 24, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.dcp$ComponentName */
    public static final class ComponentName implements Function1<java.lang.Throwable, Unit> {
        public static final ComponentName EZpvd = new ComponentName();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            copydefault(th);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.reown.android.CoreInterface.DefaultImpls.initialize$default(com.reown.android.CoreInterface, android.app.Application, java.lang.String, com.reown.android.Core$Model$AppMetaData, com.reown.android.relay.ConnectionType, com.reown.android.relay.RelayConnectionInterface, java.lang.String, com.reown.android.relay.NetworkClientTimeout, boolean, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public static /* synthetic */ void checkInit$default(C13982dcp c13982dcp, android.app.Application application, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
        android.app.Application applicationAEQbTJ = (i & 1) != 0 ? C9678baC.Companion.AEQbTJ() : application;
        Function1 function12 = (i & 2) != 0 ? ComponentName.EZpvd : function1;
        Function0 function02 = (i & 4) != 0 ? ComponentCallbacks.EZpvd : function0;
        Intrinsics.checkNotNullParameter(applicationAEQbTJ, "");
        Intrinsics.checkNotNullParameter(function12, "");
        Intrinsics.checkNotNullParameter(function02, "");
        pUU.KWHzl("WalletConnectV2Manager", "checkInit    isInitialized:" + fetchVPNInfo);
        if (fetchVPNInfo.get()) {
            function02.invoke();
            return;
        }
        pUU.KWHzl("WalletConnectV2Manager", "initWC");
        CoreClient coreClient = CoreClient.INSTANCE;
        java.lang.String str = C34703nhO.copydefault() ? "7f235442ef83a2d6f345f9fdbae72783" : "aef737a395c3d77d0df683f9ed219cde";
        ConnectionType connectionType = ConnectionType.AUTOMATIC;
        java.lang.String string = applicationAEQbTJ.getString(C13754dXa.FragmentManager.NRYds);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = applicationAEQbTJ.getString(C13754dXa.FragmentManager.ibnZAm);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CoreInterface.DefaultImpls.initialize$default((CoreInterface) coreClient, applicationAEQbTJ, str, new Core.Model.AppMetaData(string, string2, applicationAEQbTJ.getString(C13754dXa.FragmentManager.ONJgbh) + "?version=" + C59449zhJ.replace$default(C32979mnm.EZpvd.EZpvd(), "beta", "", false, 4, (java.lang.Object) null), yDY.copydefault(C43386roM.EZpvd.EZpvd() + applicationAEQbTJ.getString(C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21)), "okx://wallet/wallet/home", null, false, null, 224, null), connectionType, (RelayConnectionInterface) null, (java.lang.String) null, NetworkClientTimeout.Companion.getDefaultTimeout(), false, (Function1) new AssetManager(function12), 48, (java.lang.Object) null);
        WalletKit walletKit = WalletKit.INSTANCE;
        walletKit.initialize(new Wallet.Params.Init(coreClient), new Configuration(function02), new PackageManager(function12));
        coreClient.setDelegate(copydefault);
        walletKit.setWalletDelegate(AkhnZx);
    }

    /* JADX INFO: renamed from: o.dcp$ComponentCallbacks */
    public static final class ComponentCallbacks implements Function0<Unit> {
        public static final ComponentCallbacks EZpvd = new ComponentCallbacks();

        public final void OLrzqt() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.dcp$PackageItemInfo */
    public static final class PackageItemInfo implements Function1<java.lang.Throwable, Unit> {
        public static final PackageItemInfo KWHzl = new PackageItemInfo();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.Throwable th) {
            copydefault(th);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.dcp$ColorStateList */
    public static final class ColorStateList implements Function0<Unit> {
        public static final ColorStateList copydefault = new ColorStateList();

        public final void copydefault() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void initWC$default(C13982dcp c13982dcp, android.app.Application application, Function1 function1, Function0 function0, int i, java.lang.Object obj) {
        Function1 function12 = (i & 2) != 0 ? PackageItemInfo.KWHzl : function1;
        Function0 function02 = (i & 4) != 0 ? ColorStateList.copydefault : function0;
        pUU.KWHzl("WalletConnectV2Manager", "initWC");
        CoreClient coreClient = CoreClient.INSTANCE;
        java.lang.String str = C34703nhO.copydefault() ? "7f235442ef83a2d6f345f9fdbae72783" : "aef737a395c3d77d0df683f9ed219cde";
        ConnectionType connectionType = ConnectionType.AUTOMATIC;
        java.lang.String string = application.getString(C13754dXa.FragmentManager.NRYds);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = application.getString(C13754dXa.FragmentManager.ibnZAm);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CoreInterface.DefaultImpls.initialize$default((CoreInterface) coreClient, application, str, new Core.Model.AppMetaData(string, string2, application.getString(C13754dXa.FragmentManager.ONJgbh) + "?version=" + C59449zhJ.replace$default(C32979mnm.EZpvd.EZpvd(), "beta", "", false, 4, (java.lang.Object) null), yDY.copydefault(C43386roM.EZpvd.EZpvd() + application.getString(C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21)), "okx://wallet/wallet/home", null, false, null, 224, null), connectionType, (RelayConnectionInterface) null, (java.lang.String) null, NetworkClientTimeout.Companion.getDefaultTimeout(), false, (Function1) new AssetManager(function12), 48, (java.lang.Object) null);
        WalletKit walletKit = WalletKit.INSTANCE;
        walletKit.initialize(new Wallet.Params.Init(coreClient), new Configuration(function02), new PackageManager(function12));
        coreClient.setDelegate(copydefault);
        walletKit.setWalletDelegate(AkhnZx);
    }

    /* JADX INFO: renamed from: o.dcp$ActionBar */
    public static final class ActionBar implements Function1<Core.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Core.Model.Error error) {
            AEQbTJ(error);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Core.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  CoreClient initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$AssetManager */
    public static final class AssetManager implements Function1<Core.Model.Error, Unit> {
        public final /* synthetic */ Function1<java.lang.Throwable, Unit> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public AssetManager(Function1<? super java.lang.Throwable, Unit> function1) {
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Core.Model.Error error) {
            AEQbTJ(error);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Core.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            this.KWHzl.invoke(error.getThrowable());
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  CoreClient initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$BaseBundle */
    public static final class BaseBundle implements Function1<Core.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Core.Model.Error error) {
            KWHzl(error);
            return Unit.INSTANCE;
        }

        public final void KWHzl(Core.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  CoreClient initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$Bitmap */
    public static final class Bitmap implements Function1<Core.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Core.Model.Error error) {
            copydefault(error);
            return Unit.INSTANCE;
        }

        public final void copydefault(Core.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  CoreClient initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$BroadcastReceiver */
    public static final class BroadcastReceiver implements Function1<Core.Model.Error, Unit> {
        public final /* synthetic */ java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BroadcastReceiver(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Core.Model.Error error) {
            KWHzl(error);
            return Unit.INSTANCE;
        }

        public final void KWHzl(Core.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            pUU.AEQbTJ("WalletConnectV2Manager", "connect init error url:" + this.AEQbTJ, error.getThrowable());
            InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
            if (interfaceC13979dcm != null) {
                interfaceC13979dcm.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            }
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  CoreClient initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$Dialog */
    public static final class Dialog implements Function1<Core.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Core.Model.Error error) {
            KWHzl(error);
            return Unit.INSTANCE;
        }

        public final void KWHzl(Core.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  CoreClient initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$IntentFilter */
    public static final class IntentFilter implements Function1<Core.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Core.Model.Error error) {
            KWHzl(error);
            return Unit.INSTANCE;
        }

        public final void KWHzl(Core.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  CoreClient initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$MediaController */
    public static final class MediaController implements Function1<Core.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Core.Model.Error error) {
            copydefault(error);
            return Unit.INSTANCE;
        }

        public final void copydefault(Core.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  CoreClient initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$Rect */
    public static final class Rect implements Function1<Core.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Core.Model.Error error) {
            EZpvd(error);
            return Unit.INSTANCE;
        }

        public final void EZpvd(Core.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  CoreClient initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$SharedElementCallback */
    public static final class SharedElementCallback implements Function1<Core.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Core.Model.Error error) {
            copydefault(error);
            return Unit.INSTANCE;
        }

        public final void copydefault(Core.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  CoreClient initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$AssistContent */
    public static final class AssistContent implements Function0<Unit> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ java.util.List OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(java.lang.String str, java.util.List list, java.lang.String str2) {
            this.AEQbTJ = str;
            this.OLrzqt = list;
            this.KWHzl = str2;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            pUU.copydefault("WalletConnectV2Manager", "initWC  WalletKit initialize   success");
            C13982dcp.fetchVPNInfo.set(true);
            pUU.copydefault("WalletConnectV2Manager", "approveSession    " + this.AEQbTJ);
            C13982dcp c13982dcp = C13982dcp.AEQbTJ;
            Wallet.Model.SessionProposal sessionProposalValueOf = c13982dcp.valueOf(this.AEQbTJ);
            if (sessionProposalValueOf != null) {
                try {
                    WalletKit walletKit = WalletKit.INSTANCE;
                    walletKit.approveSession(new Wallet.Params.SessionApprove(sessionProposalValueOf.getProposerPublicKey(), walletKit.generateApprovedNamespaces(sessionProposalValueOf, c13982dcp.KWHzl(sessionProposalValueOf, this.OLrzqt)), null, 4, null), new ComponentCallbacks2(this.AEQbTJ, sessionProposalValueOf, this.KWHzl), new ClipData(this.AEQbTJ, sessionProposalValueOf));
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ("WalletConnectV2Manager", "approveSession error " + this.AEQbTJ, e);
                    InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
                    if (interfaceC13979dcm != null) {
                        interfaceC13979dcm.OLrzqt(this.AEQbTJ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
                    }
                    C13982dcp.AEQbTJ.KWHzl(this.AEQbTJ, true);
                }
            } else {
                pUU.copydefault("WalletConnectV2Manager", "Unable to get session proposal for pairing topic " + this.AEQbTJ);
                InterfaceC13979dcm interfaceC13979dcm2 = C13982dcp.values;
                if (interfaceC13979dcm2 != null) {
                    interfaceC13979dcm2.OLrzqt(this.AEQbTJ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
                }
                c13982dcp.KWHzl(this.AEQbTJ, true);
            }
            C13982dcp.AhwBna.remove(this.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.dcp$Callback */
    public static final class Callback implements Function0<Unit> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Callback(java.lang.String str, boolean z) {
            this.AEQbTJ = str;
            this.copydefault = z;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            InterfaceC13979dcm interfaceC13979dcm;
            InterfaceC13979dcm interfaceC13979dcm2;
            pUU.copydefault("WalletConnectV2Manager", "initWC  WalletKit initialize   success");
            C13982dcp.fetchVPNInfo.set(true);
            pUU.copydefault("WalletConnectV2Manager", "rejectSession    " + this.AEQbTJ);
            try {
                Wallet.Model.SessionProposal sessionProposalValueOf = C13982dcp.AEQbTJ.valueOf(this.AEQbTJ);
                if (sessionProposalValueOf != null) {
                    WalletKit.INSTANCE.rejectSession(new Wallet.Params.SessionReject(sessionProposalValueOf.getProposerPublicKey(), "Reject Session"), new Bundle(this.AEQbTJ, this.copydefault), new Handler(this.AEQbTJ, this.copydefault));
                } else {
                    pUU.copydefault("WalletConnectV2Manager", "rejectSession: sessionProposal is null, pairingTopic=" + this.AEQbTJ);
                    if (!this.copydefault && (interfaceC13979dcm2 = C13982dcp.values) != null) {
                        interfaceC13979dcm2.KWHzl(this.AEQbTJ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("WalletConnectV2Manager", "rejectSession error " + this.AEQbTJ, e);
                if (!this.copydefault && (interfaceC13979dcm = C13982dcp.values) != null) {
                    interfaceC13979dcm.KWHzl(this.AEQbTJ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
                }
            }
            C13982dcp.AhwBna.remove(this.AEQbTJ);
        }
    }

    /* JADX INFO: renamed from: o.dcp$Configuration */
    public static final class Configuration implements Function0<Unit> {
        public final /* synthetic */ Function0<Unit> AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Configuration(Function0<Unit> function0) {
            this.AEQbTJ = function0;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            pUU.copydefault("WalletConnectV2Manager", "initWC  WalletKit initialize   success");
            C13982dcp.fetchVPNInfo.set(true);
            this.AEQbTJ.invoke();
        }
    }

    /* JADX INFO: renamed from: o.dcp$ContentResolver */
    public static final class ContentResolver implements Function0<Unit> {
        public final /* synthetic */ java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContentResolver(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            pUU.copydefault("WalletConnectV2Manager", "initWC  WalletKit initialize   success");
            C13982dcp.fetchVPNInfo.set(true);
            pUU.KWHzl("WalletConnectV2Manager", "connect start " + this.AEQbTJ);
            try {
                WalletKit.INSTANCE.pair(new Wallet.Params.Pair(this.AEQbTJ), new ContextWrapper(this.AEQbTJ), new Intent(this.AEQbTJ));
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("WalletConnectV2Manager", "connect    exception", e);
            }
        }
    }

    /* JADX INFO: renamed from: o.dcp$DialogInterface */
    public static final class DialogInterface implements Function1<Wallet.Model.Error, Unit> {
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DialogInterface(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            OLrzqt(error);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            C13982dcp.fetchVPNInfo.set(false);
            pUU.AEQbTJ("WalletConnectV2Manager", "connect init error url:" + this.copydefault, error.getThrowable());
            InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
            if (interfaceC13979dcm != null) {
                interfaceC13979dcm.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            }
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  WalletKit initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$Environment */
    public static final class Environment implements Function1<Wallet.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            copydefault(error);
            return Unit.INSTANCE;
        }

        public final void copydefault(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            C13982dcp.fetchVPNInfo.set(false);
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  WalletKit initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$Fragment */
    public static final class Fragment implements Function1<Wallet.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            copydefault(error);
            return Unit.INSTANCE;
        }

        public final void copydefault(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            C13982dcp.fetchVPNInfo.set(false);
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  WalletKit initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$FragmentManager */
    public static final class FragmentManager implements Function0<Unit> {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(java.lang.String str, long j, java.lang.String str2) {
            this.copydefault = str;
            this.EZpvd = j;
            this.OLrzqt = str2;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            pUU.copydefault("WalletConnectV2Manager", "initWC  WalletKit initialize   success");
            C13982dcp.fetchVPNInfo.set(true);
            pUU.KWHzl("WalletConnectV2Manager", "approveRequest " + this.copydefault + ", " + this.EZpvd);
            WalletKit.INSTANCE.respondSessionRequest(new Wallet.Params.SessionRequestResponse(this.copydefault, new Wallet.Model.JsonRpcResponse.JsonRpcResult(this.EZpvd, this.OLrzqt)), new TaskStackBuilder(this.copydefault, this.EZpvd), new VoiceInteractor(this.copydefault, this.EZpvd));
            C13982dcp.valueOf.remove(new Application(this.copydefault, this.EZpvd));
        }
    }

    /* JADX INFO: renamed from: o.dcp$IBinder */
    public static final class IBinder implements Function0<Unit> {
        public final /* synthetic */ Function2 AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public IBinder(java.lang.String str, Function2 function2, java.lang.String str2, java.lang.String str3) {
            this.OLrzqt = str;
            this.AEQbTJ = function2;
            this.KWHzl = str2;
            this.EZpvd = str3;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            KWHzl();
            return Unit.INSTANCE;
        }

        public final void KWHzl() {
            pUU.copydefault("WalletConnectV2Manager", "initWC  WalletKit initialize   success");
            C13982dcp.fetchVPNInfo.set(true);
            Wallet.Model.Session sessionAEQbTJ = C13982dcp.AEQbTJ.AEQbTJ(this.OLrzqt);
            if (sessionAEQbTJ != null) {
                java.util.HashMap map = new java.util.HashMap();
                java.util.Map<java.lang.String, Wallet.Model.Namespace.Session> namespaces = sessionAEQbTJ.getNamespaces();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(namespaces.size()));
                java.util.Iterator<T> it = namespaces.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    java.lang.Object key = entry.getKey();
                    java.util.List<java.lang.String> chains = ((Wallet.Model.Namespace.Session) entry.getValue()).getChains();
                    if (chains == null) {
                        chains = yDY.AhwBna();
                    }
                    map.put(entry.getKey(), new Wallet.Model.Namespace.Session(CollectionsKt___CollectionsKt.QbewEr(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) chains, (java.lang.Iterable) C56402yEa.EZpvd(entry.getKey() + ":" + this.KWHzl))), CollectionsKt___CollectionsKt.QbewEr(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) ((Wallet.Model.Namespace.Session) entry.getValue()).getAccounts(), (java.lang.Iterable) C56402yEa.EZpvd(entry.getKey() + ":" + this.KWHzl + ":" + this.EZpvd))), ((Wallet.Model.Namespace.Session) entry.getValue()).getMethods(), ((Wallet.Model.Namespace.Session) entry.getValue()).getEvents()));
                    linkedHashMap.put(key, Unit.INSTANCE);
                }
                WalletKit.INSTANCE.updateSession(new Wallet.Params.SessionUpdate(this.OLrzqt, map), new Looper(this.OLrzqt, this.AEQbTJ), new LocaleList(this.AEQbTJ, this.OLrzqt));
                return;
            }
            pUU.copydefault("WalletConnectV2Manager", "updateSession: session is null, topic=" + this.OLrzqt);
            this.AEQbTJ.invoke(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
        }
    }

    /* JADX INFO: renamed from: o.dcp$Mode */
    public static final class Mode implements Function1<Wallet.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            AEQbTJ(error);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            C13982dcp.fetchVPNInfo.set(false);
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  WalletKit initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$PackageManager */
    public static final class PackageManager implements Function1<Wallet.Model.Error, Unit> {
        public final /* synthetic */ Function1<java.lang.Throwable, Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public PackageManager(Function1<? super java.lang.Throwable, Unit> function1) {
            this.OLrzqt = function1;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            OLrzqt(error);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            C13982dcp.fetchVPNInfo.set(false);
            this.OLrzqt.invoke(error.getThrowable());
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  WalletKit initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$Paint */
    public static final class Paint implements Function0<Unit> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ int KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Paint(java.lang.String str, long j, int i, java.lang.String str2, boolean z) {
            this.EZpvd = str;
            this.copydefault = j;
            this.KWHzl = i;
            this.AEQbTJ = str2;
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            pUU.copydefault("WalletConnectV2Manager", "initWC  WalletKit initialize   success");
            C13982dcp.fetchVPNInfo.set(true);
            WalletKit.INSTANCE.respondSessionRequest(new Wallet.Params.SessionRequestResponse(this.EZpvd, new Wallet.Model.JsonRpcResponse.JsonRpcError(this.copydefault, this.KWHzl, this.AEQbTJ)), new Typeface(this.EZpvd, this.copydefault, this.OLrzqt), new Drawable(this.EZpvd, this.copydefault));
            C13982dcp.valueOf.remove(new Application(this.EZpvd, this.copydefault));
        }
    }

    /* JADX INFO: renamed from: o.dcp$Parcel */
    public static final class Parcel implements Function1<Wallet.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            KWHzl(error);
            return Unit.INSTANCE;
        }

        public final void KWHzl(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            C13982dcp.fetchVPNInfo.set(false);
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  WalletKit initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$PictureInPictureParams */
    public static final class PictureInPictureParams implements Function1<Wallet.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            AEQbTJ(error);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            C13982dcp.fetchVPNInfo.set(false);
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  WalletKit initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$SQLiteDatabase */
    public static final class SQLiteDatabase implements Function0<Unit> {
        public final /* synthetic */ boolean AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SQLiteDatabase(long j, java.lang.String str, boolean z) {
            this.EZpvd = j;
            this.copydefault = str;
            this.AEQbTJ = z;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            OLrzqt();
            return Unit.INSTANCE;
        }

        public final void OLrzqt() {
            pUU.copydefault("WalletConnectV2Manager", "initWC  WalletKit initialize   success");
            C13982dcp.fetchVPNInfo.set(true);
            WalletKit.INSTANCE.rejectSessionAuthenticate(new Wallet.Params.RejectSessionAuthenticate(this.EZpvd, this.copydefault), new Point(this.EZpvd, this.AEQbTJ), new Matrix(this.EZpvd, this.AEQbTJ));
            C13982dcp.gEmmrt.remove(java.lang.Long.valueOf(this.EZpvd));
        }
    }

    /* JADX INFO: renamed from: o.dcp$ServiceConnection */
    public static final class ServiceConnection implements Function0<Unit> {
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ServiceConnection(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            pUU.copydefault("WalletConnectV2Manager", "initWC  WalletKit initialize   success");
            C13982dcp.fetchVPNInfo.set(true);
            pUU.KWHzl("WalletConnectV2Manager", "disconnect " + this.OLrzqt);
            try {
                WalletKit.INSTANCE.disconnectSession(new Wallet.Params.SessionDisconnect(this.OLrzqt), new ApplicationInfo(this.OLrzqt), new IntentSender(this.OLrzqt));
            } catch (java.lang.Exception e) {
                C13982dcp.AEQbTJ.KWHzl(this.OLrzqt, e);
            }
        }
    }

    /* JADX INFO: renamed from: o.dcp$SharedPreferences */
    public static final class SharedPreferences implements Function1<Wallet.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            AEQbTJ(error);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            C13982dcp.fetchVPNInfo.set(false);
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  WalletKit initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$StateListAnimator */
    public static final class StateListAnimator implements Function0<Unit> {
        public final /* synthetic */ Wallet.Model.PayloadAuthRequestParams AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ boolean KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Wallet.Model.PayloadAuthRequestParams payloadAuthRequestParams, long j, java.lang.String str, boolean z, java.lang.String str2) {
            this.AEQbTJ = payloadAuthRequestParams;
            this.EZpvd = j;
            this.OLrzqt = str;
            this.KWHzl = z;
            this.copydefault = str2;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            pUU.copydefault("WalletConnectV2Manager", "initWC  WalletKit initialize   success");
            C13982dcp.fetchVPNInfo.set(true);
            pUU.KWHzl("WalletConnectV2Manager", "approve authRequest payloadParams:" + this.AEQbTJ);
            Wallet.Model.PayloadAuthRequestParams payloadAuthRequestParams = this.AEQbTJ;
            if (payloadAuthRequestParams == null) {
                InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
                if (interfaceC13979dcm != null) {
                    interfaceC13979dcm.KWHzl(this.EZpvd, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
                    return;
                }
                return;
            }
            WalletKit walletKit = WalletKit.INSTANCE;
            walletKit.approveSessionAuthenticate(new Wallet.Params.ApproveSessionAuthenticate(this.EZpvd, C56402yEa.EZpvd(walletKit.generateAuthObject(payloadAuthRequestParams, this.OLrzqt, new Wallet.Model.Cacao.Signature((this.KWHzl ? SignatureType.EIP1271 : SignatureType.EIP191).getHeader(), this.copydefault, null)))), new PendingIntent(this.EZpvd), new LoaderManager(this.EZpvd));
            C13982dcp.gEmmrt.remove(java.lang.Long.valueOf(this.EZpvd));
        }
    }

    /* JADX INFO: renamed from: o.dcp$TaskDescription */
    public static final class TaskDescription implements Function1<Wallet.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            copydefault(error);
            return Unit.INSTANCE;
        }

        public final void copydefault(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            C13982dcp.fetchVPNInfo.set(false);
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  WalletKit initialize", error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$Uri */
    public static final class Uri implements Function1<Wallet.Model.Error, Unit> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            OLrzqt(error);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            C13982dcp.fetchVPNInfo.set(false);
            error.getThrowable();
            pUU.AEQbTJ("WalletConnectV2Manager", "initWC  WalletKit initialize", error.getThrowable());
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.KWHzl("WalletConnectV2Manager", "connect    url:" + str);
        android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
        pUU.KWHzl("WalletConnectV2Manager", "checkInit    isInitialized:" + fetchVPNInfo);
        if (fetchVPNInfo.get()) {
            pUU.KWHzl("WalletConnectV2Manager", "connect start " + str);
            try {
                WalletKit.INSTANCE.pair(new Wallet.Params.Pair(str), new ContextWrapper(str), new Intent(str));
                return;
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("WalletConnectV2Manager", "connect    exception", e);
                return;
            }
        }
        pUU.KWHzl("WalletConnectV2Manager", "initWC");
        CoreClient coreClient = CoreClient.INSTANCE;
        java.lang.String str2 = C34703nhO.copydefault() ? "7f235442ef83a2d6f345f9fdbae72783" : "aef737a395c3d77d0df683f9ed219cde";
        ConnectionType connectionType = ConnectionType.AUTOMATIC;
        java.lang.String string = applicationAEQbTJ.getString(C13754dXa.FragmentManager.NRYds);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = applicationAEQbTJ.getString(C13754dXa.FragmentManager.ibnZAm);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CoreInterface.DefaultImpls.initialize$default((CoreInterface) coreClient, applicationAEQbTJ, str2, new Core.Model.AppMetaData(string, string2, applicationAEQbTJ.getString(C13754dXa.FragmentManager.ONJgbh) + "?version=" + C59449zhJ.replace$default(C32979mnm.EZpvd.EZpvd(), "beta", "", false, 4, (java.lang.Object) null), yDY.copydefault(C43386roM.EZpvd.EZpvd() + applicationAEQbTJ.getString(C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21)), "okx://wallet/wallet/home", null, false, null, 224, null), connectionType, (RelayConnectionInterface) null, (java.lang.String) null, NetworkClientTimeout.Companion.getDefaultTimeout(), false, (Function1) new BroadcastReceiver(str), 48, (java.lang.Object) null);
        WalletKit walletKit = WalletKit.INSTANCE;
        walletKit.initialize(new Wallet.Params.Init(coreClient), new ContentResolver(str), new DialogInterface(str));
        coreClient.setDelegate(copydefault);
        walletKit.setWalletDelegate(AkhnZx);
    }

    /* JADX INFO: renamed from: o.dcp$ContextWrapper */
    public static final class ContextWrapper implements Function1<Wallet.Params.Pair, Unit> {
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContextWrapper(java.lang.String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Params.Pair pair) {
            KWHzl(pair);
            return Unit.INSTANCE;
        }

        public final void KWHzl(Wallet.Params.Pair pair) {
            Intrinsics.checkNotNullParameter(pair, "");
            pUU.KWHzl("WalletConnectV2Manager", "connect success " + this.copydefault);
            Activity activity = C13982dcp.EZpvd;
            if (activity != null) {
                C13982dcp.AEQbTJ.isConnected().removeCallbacks(activity);
            }
            Activity activity2 = new Activity(this.copydefault);
            C13982dcp c13982dcp = C13982dcp.AEQbTJ;
            C13982dcp.EZpvd = activity2;
            c13982dcp.isConnected().postDelayed(activity2, 15000L);
            InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
            if (interfaceC13979dcm != null) {
                interfaceC13979dcm.AEQbTJ(this.copydefault);
            }
        }
    }

    /* JADX INFO: renamed from: o.dcp$Intent */
    public static final class Intent implements Function1<Wallet.Model.Error, Unit> {
        public final /* synthetic */ java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Intent(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            AEQbTJ(error);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            pUU.AEQbTJ("WalletConnectV2Manager", "connect error " + this.EZpvd + " ", error.getThrowable());
            if (error.getThrowable() instanceof PairWithExistingPairingIsNotAllowed) {
                Wallet.Model.SessionProposal sessionProposalGEmmrt = C13982dcp.AEQbTJ.gEmmrt(this.EZpvd);
                if (sessionProposalGEmmrt != null) {
                    InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
                    if (interfaceC13979dcm != null) {
                        interfaceC13979dcm.AEQbTJ(this.EZpvd);
                    }
                    C13982dcp.AkhnZx.onSessionProposal(sessionProposalGEmmrt, new Wallet.Model.VerifyContext(0L, "", Wallet.Model.Validation.VALID, "", null));
                    return;
                }
                InterfaceC13979dcm interfaceC13979dcm2 = C13982dcp.values;
                if (interfaceC13979dcm2 != null) {
                    interfaceC13979dcm2.EZpvd(this.EZpvd, C33070mpX.AYXKKw(C13754dXa.FragmentManager.fbC));
                    return;
                }
                return;
            }
            InterfaceC13979dcm interfaceC13979dcm3 = C13982dcp.values;
            if (interfaceC13979dcm3 != null) {
                interfaceC13979dcm3.EZpvd(this.EZpvd, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            }
        }
    }

    /* JADX INFO: renamed from: o.dcp$ClipData */
    public static final class ClipData implements Function1<Wallet.Model.Error, Unit> {
        public final /* synthetic */ Wallet.Model.SessionProposal KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ClipData(java.lang.String str, Wallet.Model.SessionProposal sessionProposal) {
            this.OLrzqt = str;
            this.KWHzl = sessionProposal;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            OLrzqt(error);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            pUU.AEQbTJ("WalletConnectV2Manager", "approveSession error " + this.OLrzqt + ", redirect: " + this.KWHzl.getRedirect(), error.getThrowable());
            InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
            if (interfaceC13979dcm != null) {
                interfaceC13979dcm.OLrzqt(this.OLrzqt, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            }
        }
    }

    /* JADX INFO: renamed from: o.dcp$ComponentCallbacks2 */
    public static final class ComponentCallbacks2 implements Function1<Wallet.Params.SessionApprove, Unit> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ Wallet.Model.SessionProposal EZpvd;
        public final /* synthetic */ java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks2(java.lang.String str, Wallet.Model.SessionProposal sessionProposal, java.lang.String str2) {
            this.KWHzl = str;
            this.EZpvd = sessionProposal;
            this.AEQbTJ = str2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Params.SessionApprove sessionApprove) {
            KWHzl(sessionApprove);
            return Unit.INSTANCE;
        }

        public final void KWHzl(Wallet.Params.SessionApprove sessionApprove) {
            Intrinsics.checkNotNullParameter(sessionApprove, "");
            pUU.KWHzl("WalletConnectV2Manager", "approveSession success " + this.KWHzl + ", redirect: " + this.EZpvd.getRedirect());
            InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
            if (interfaceC13979dcm != null) {
                interfaceC13979dcm.AEQbTJ(this.KWHzl, this.AEQbTJ, this.EZpvd.getRedirect());
            }
        }
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<C13983dcq> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Wallet.Model.SessionProposal sessionProposalValueOf = valueOf(str);
        if (sessionProposalValueOf == null) {
            return false;
        }
        java.util.Map<java.lang.String, Wallet.Model.Namespace.Session> mapKWHzl = AEQbTJ.KWHzl(sessionProposalValueOf, list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<Map.Entry<java.lang.String, Wallet.Model.Namespace.Session>> it = mapKWHzl.entrySet().iterator();
        while (it.hasNext()) {
            C56406yEe.KWHzl(arrayList, it.next().getValue().getAccounts());
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        try {
            WalletKit.INSTANCE.generateApprovedNamespaces(sessionProposalValueOf, mapKWHzl);
            return true;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("WalletConnectV2Manager", "session proposal not supported", e);
            return false;
        }
    }

    public static /* synthetic */ void rejectSession$default(C13982dcp c13982dcp, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        c13982dcp.KWHzl(str, z);
    }

    /* JADX INFO: renamed from: o.dcp$Bundle */
    public static final class Bundle implements Function1<Wallet.Params.SessionReject, Unit> {
        public final /* synthetic */ java.lang.String EZpvd;
        public final /* synthetic */ boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Bundle(java.lang.String str, boolean z) {
            this.EZpvd = str;
            this.KWHzl = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Params.SessionReject sessionReject) {
            AEQbTJ(sessionReject);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Wallet.Params.SessionReject sessionReject) {
            InterfaceC13979dcm interfaceC13979dcm;
            Intrinsics.checkNotNullParameter(sessionReject, "");
            pUU.copydefault("WalletConnectV2Manager", "rejectSession success " + this.EZpvd);
            if (this.KWHzl || (interfaceC13979dcm = C13982dcp.values) == null) {
                return;
            }
            interfaceC13979dcm.KWHzl(this.EZpvd);
        }
    }

    /* JADX INFO: renamed from: o.dcp$Handler */
    public static final class Handler implements Function1<Wallet.Model.Error, Unit> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Handler(java.lang.String str, boolean z) {
            this.AEQbTJ = str;
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            EZpvd(error);
            return Unit.INSTANCE;
        }

        public final void EZpvd(Wallet.Model.Error error) {
            InterfaceC13979dcm interfaceC13979dcm;
            Intrinsics.checkNotNullParameter(error, "");
            pUU.AEQbTJ("WalletConnectV2Manager", "rejectSession error " + this.AEQbTJ, error.getThrowable());
            if (this.OLrzqt || (interfaceC13979dcm = C13982dcp.values) == null) {
                return;
            }
            interfaceC13979dcm.KWHzl(this.AEQbTJ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
        }
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function2, "");
        pUU.KWHzl("WalletConnectV2Manager", "updateSession topic:" + str + " address:" + str3);
        android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
        pUU.KWHzl("WalletConnectV2Manager", "checkInit    isInitialized:" + fetchVPNInfo);
        if (fetchVPNInfo.get()) {
            Wallet.Model.Session sessionAEQbTJ = AEQbTJ.AEQbTJ(str);
            if (sessionAEQbTJ != null) {
                java.util.HashMap map = new java.util.HashMap();
                java.util.Map<java.lang.String, Wallet.Model.Namespace.Session> namespaces = sessionAEQbTJ.getNamespaces();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(namespaces.size()));
                java.util.Iterator<T> it = namespaces.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    java.lang.Object key = entry.getKey();
                    java.util.List<java.lang.String> chains = ((Wallet.Model.Namespace.Session) entry.getValue()).getChains();
                    if (chains == null) {
                        chains = yDY.AhwBna();
                    }
                    map.put(entry.getKey(), new Wallet.Model.Namespace.Session(CollectionsKt___CollectionsKt.QbewEr(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) chains, (java.lang.Iterable) C56402yEa.EZpvd(entry.getKey() + ":" + str2))), CollectionsKt___CollectionsKt.QbewEr(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) ((Wallet.Model.Namespace.Session) entry.getValue()).getAccounts(), (java.lang.Iterable) C56402yEa.EZpvd(entry.getKey() + ":" + str2 + ":" + str3))), ((Wallet.Model.Namespace.Session) entry.getValue()).getMethods(), ((Wallet.Model.Namespace.Session) entry.getValue()).getEvents()));
                    linkedHashMap.put(key, Unit.INSTANCE);
                }
                WalletKit.INSTANCE.updateSession(new Wallet.Params.SessionUpdate(str, map), new Looper(str, function2), new LocaleList(function2, str));
                return;
            }
            pUU.copydefault("WalletConnectV2Manager", "updateSession: session is null, topic=" + str);
            function2.invoke(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            return;
        }
        pUU.KWHzl("WalletConnectV2Manager", "initWC");
        CoreClient coreClient = CoreClient.INSTANCE;
        java.lang.String str4 = C34703nhO.copydefault() ? "7f235442ef83a2d6f345f9fdbae72783" : "aef737a395c3d77d0df683f9ed219cde";
        ConnectionType connectionType = ConnectionType.AUTOMATIC;
        java.lang.String string = applicationAEQbTJ.getString(C13754dXa.FragmentManager.NRYds);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = applicationAEQbTJ.getString(C13754dXa.FragmentManager.ibnZAm);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CoreInterface.DefaultImpls.initialize$default((CoreInterface) coreClient, applicationAEQbTJ, str4, new Core.Model.AppMetaData(string, string2, applicationAEQbTJ.getString(C13754dXa.FragmentManager.ONJgbh) + "?version=" + C59449zhJ.replace$default(C32979mnm.EZpvd.EZpvd(), "beta", "", false, 4, (java.lang.Object) null), yDY.copydefault(C43386roM.EZpvd.EZpvd() + applicationAEQbTJ.getString(C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21)), "okx://wallet/wallet/home", null, false, null, 224, null), connectionType, (RelayConnectionInterface) null, (java.lang.String) null, NetworkClientTimeout.Companion.getDefaultTimeout(), false, (Function1) new BaseBundle(), 48, (java.lang.Object) null);
        WalletKit walletKit = WalletKit.INSTANCE;
        walletKit.initialize(new Wallet.Params.Init(coreClient), new IBinder(str, function2, str2, str3), new Parcel());
        coreClient.setDelegate(copydefault);
        walletKit.setWalletDelegate(AkhnZx);
    }

    /* JADX INFO: renamed from: o.dcp$LocaleList */
    public static final class LocaleList implements Function1<Wallet.Model.Error, Unit> {
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ Function2<java.lang.Boolean, java.lang.String, Unit> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public LocaleList(Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2, java.lang.String str) {
            this.copydefault = function2;
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            EZpvd(error);
            return Unit.INSTANCE;
        }

        public final void EZpvd(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            this.copydefault.invoke(java.lang.Boolean.FALSE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DlmWDR));
            pUU.AEQbTJ("WalletConnectV2Manager", "updateSession error " + this.OLrzqt, error.getThrowable());
        }
    }

    /* JADX INFO: renamed from: o.dcp$Looper */
    public static final class Looper implements Function1<Wallet.Params.SessionUpdate, Unit> {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ Function2<java.lang.Boolean, java.lang.String, Unit> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.String, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public Looper(java.lang.String str, Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
            this.AEQbTJ = str;
            this.OLrzqt = function2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Params.SessionUpdate sessionUpdate) {
            OLrzqt(sessionUpdate);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Wallet.Params.SessionUpdate sessionUpdate) {
            Intrinsics.checkNotNullParameter(sessionUpdate, "");
            pUU.KWHzl("WalletConnectV2Manager", "updateSession success " + this.AEQbTJ);
            this.OLrzqt.invoke(java.lang.Boolean.TRUE, C33070mpX.AYXKKw(C13754dXa.FragmentManager.XW));
        }
    }

    /* JADX INFO: renamed from: o.dcp$TaskStackBuilder */
    public static final class TaskStackBuilder implements Function1<Wallet.Params.SessionRequestResponse, Unit> {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(java.lang.String str, long j) {
            this.OLrzqt = str;
            this.KWHzl = j;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Params.SessionRequestResponse sessionRequestResponse) {
            EZpvd(sessionRequestResponse);
            return Unit.INSTANCE;
        }

        public final void EZpvd(Wallet.Params.SessionRequestResponse sessionRequestResponse) {
            Intrinsics.checkNotNullParameter(sessionRequestResponse, "");
            pUU.KWHzl("WalletConnectV2Manager", "approveRequest success " + this.OLrzqt + ", " + this.KWHzl);
            InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
            if (interfaceC13979dcm != null) {
                interfaceC13979dcm.KWHzl(this.OLrzqt, this.KWHzl);
            }
        }
    }

    /* JADX INFO: renamed from: o.dcp$VoiceInteractor */
    public static final class VoiceInteractor implements Function1<Wallet.Model.Error, Unit> {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(java.lang.String str, long j) {
            this.KWHzl = str;
            this.AEQbTJ = j;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            EZpvd(error);
            return Unit.INSTANCE;
        }

        public final void EZpvd(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            pUU.AEQbTJ("WalletConnectV2Manager", "approveRequest error " + this.KWHzl + ", " + this.AEQbTJ, error.getThrowable());
            InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
            if (interfaceC13979dcm != null) {
                interfaceC13979dcm.AEQbTJ(this.KWHzl, this.AEQbTJ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            }
        }
    }

    public static /* synthetic */ void rejectRequest$default(C13982dcp c13982dcp, java.lang.String str, long j, java.lang.String str2, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            i = 5000;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = false;
        }
        c13982dcp.EZpvd(str, j, str2, i3, z);
    }

    /* JADX INFO: renamed from: o.dcp$Drawable */
    public static final class Drawable implements Function1<Wallet.Model.Error, Unit> {
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Drawable(java.lang.String str, long j) {
            this.copydefault = str;
            this.OLrzqt = j;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            EZpvd(error);
            return Unit.INSTANCE;
        }

        public final void EZpvd(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            pUU.AEQbTJ("WalletConnectV2Manager", "rejectRequest failed " + this.copydefault + ", " + this.OLrzqt, error.getThrowable());
            InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
            if (interfaceC13979dcm != null) {
                interfaceC13979dcm.KWHzl(this.copydefault, this.OLrzqt, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            }
        }
    }

    /* JADX INFO: renamed from: o.dcp$Typeface */
    public static final class Typeface implements Function1<Wallet.Params.SessionRequestResponse, Unit> {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Typeface(java.lang.String str, long j, boolean z) {
            this.copydefault = str;
            this.KWHzl = j;
            this.OLrzqt = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Params.SessionRequestResponse sessionRequestResponse) {
            OLrzqt(sessionRequestResponse);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Wallet.Params.SessionRequestResponse sessionRequestResponse) {
            Intrinsics.checkNotNullParameter(sessionRequestResponse, "");
            pUU.KWHzl("WalletConnectV2Manager", "rejectRequest success " + this.copydefault + ", " + this.KWHzl);
            InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
            if (interfaceC13979dcm != null) {
                interfaceC13979dcm.AEQbTJ(this.copydefault, this.KWHzl, this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.dcp$LoaderManager */
    public static final class LoaderManager implements Function1<Wallet.Model.Error, Unit> {
        public final /* synthetic */ long AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(long j) {
            this.AEQbTJ = j;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            KWHzl(error);
            return Unit.INSTANCE;
        }

        public final void KWHzl(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            pUU.AEQbTJ("WalletConnectV2Manager", "approve authRequest " + this.AEQbTJ + " failed", error.getThrowable());
            InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
            if (interfaceC13979dcm != null) {
                interfaceC13979dcm.KWHzl(this.AEQbTJ, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
            }
        }
    }

    /* JADX INFO: renamed from: o.dcp$PendingIntent */
    public static final class PendingIntent implements Function1<Wallet.Params.ApproveSessionAuthenticate, Unit> {
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(long j) {
            this.copydefault = j;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Params.ApproveSessionAuthenticate approveSessionAuthenticate) {
            OLrzqt(approveSessionAuthenticate);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Wallet.Params.ApproveSessionAuthenticate approveSessionAuthenticate) {
            Intrinsics.checkNotNullParameter(approveSessionAuthenticate, "");
            pUU.KWHzl("WalletConnectV2Manager", "approve authRequest " + this.copydefault + " success: " + approveSessionAuthenticate);
            InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
            if (interfaceC13979dcm != null) {
                interfaceC13979dcm.KWHzl(this.copydefault);
            }
        }
    }

    public static /* synthetic */ void rejectAuthRequest$default(C13982dcp c13982dcp, long j, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c13982dcp.AEQbTJ(j, str, z);
    }

    /* JADX INFO: renamed from: o.dcp$Matrix */
    public static final class Matrix implements Function1<Wallet.Model.Error, Unit> {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Matrix(long j, boolean z) {
            this.EZpvd = j;
            this.KWHzl = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            AEQbTJ(error);
            return Unit.INSTANCE;
        }

        public final void AEQbTJ(Wallet.Model.Error error) {
            InterfaceC13979dcm interfaceC13979dcm;
            Intrinsics.checkNotNullParameter(error, "");
            pUU.AEQbTJ("WalletConnectV2Manager", "reject authRequest " + this.EZpvd + " failed", error.getThrowable());
            if (this.KWHzl || (interfaceC13979dcm = C13982dcp.values) == null) {
                return;
            }
            interfaceC13979dcm.OLrzqt(this.EZpvd, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
        }
    }

    /* JADX INFO: renamed from: o.dcp$Point */
    public static final class Point implements Function1<Wallet.Params.RejectSessionAuthenticate, Unit> {
        public final /* synthetic */ boolean EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Point(long j, boolean z) {
            this.OLrzqt = j;
            this.EZpvd = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Params.RejectSessionAuthenticate rejectSessionAuthenticate) {
            OLrzqt(rejectSessionAuthenticate);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Wallet.Params.RejectSessionAuthenticate rejectSessionAuthenticate) {
            InterfaceC13979dcm interfaceC13979dcm;
            Intrinsics.checkNotNullParameter(rejectSessionAuthenticate, "");
            pUU.KWHzl("WalletConnectV2Manager", "reject authRequest " + this.OLrzqt + " success: " + rejectSessionAuthenticate);
            if (this.EZpvd || (interfaceC13979dcm = C13982dcp.values) == null) {
                return;
            }
            interfaceC13979dcm.OLrzqt(this.OLrzqt);
        }
    }

    /* JADX INFO: renamed from: o.dcp$ApplicationInfo */
    public static final class ApplicationInfo implements Function1<Wallet.Params.SessionDisconnect, Unit> {
        public final /* synthetic */ java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ApplicationInfo(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Params.SessionDisconnect sessionDisconnect) {
            OLrzqt(sessionDisconnect);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Wallet.Params.SessionDisconnect sessionDisconnect) {
            Intrinsics.checkNotNullParameter(sessionDisconnect, "");
            pUU.KWHzl("WalletConnectV2Manager", "disconnect " + this.EZpvd + " success");
            InterfaceC13979dcm interfaceC13979dcm = C13982dcp.values;
            if (interfaceC13979dcm != null) {
                interfaceC13979dcm.copydefault(this.EZpvd, true);
            }
        }
    }

    /* JADX INFO: renamed from: o.dcp$IntentSender */
    public static final class IntentSender implements Function1<Wallet.Model.Error, Unit> {
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public IntentSender(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Wallet.Model.Error error) {
            OLrzqt(error);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(Wallet.Model.Error error) {
            Intrinsics.checkNotNullParameter(error, "");
            C13982dcp.AEQbTJ.KWHzl(this.OLrzqt, error.getThrowable());
        }
    }

    public final void KWHzl(java.lang.String str, java.lang.Throwable th) {
        pUU.AEQbTJ("WalletConnectV2Manager", "disconnect " + str + " error", th);
        if (AEQbTJ(str) != null) {
            InterfaceC13979dcm interfaceC13979dcm = values;
            if (interfaceC13979dcm != null) {
                interfaceC13979dcm.copydefault(str, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
                return;
            }
            return;
        }
        pUU.KWHzl("WalletConnectV2Manager", "session already deleted, consider as success");
        InterfaceC13979dcm interfaceC13979dcm2 = values;
        if (interfaceC13979dcm2 != null) {
            interfaceC13979dcm2.copydefault(str, true);
        }
    }

    public final java.util.Map<java.lang.String, Wallet.Model.Namespace.Session> KWHzl(@NotNull Wallet.Model.SessionProposal sessionProposal, @NotNull java.util.List<C13983dcq> list) {
        java.util.ArrayList arrayList;
        Intrinsics.checkNotNullParameter(sessionProposal, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.HashMap map = new java.util.HashMap();
        for (Map.Entry<java.lang.String, Wallet.Model.Namespace.Proposal> entry : sessionProposal.getRequiredNamespaces().entrySet()) {
            Wallet.Model.Namespace.Proposal value = entry.getValue();
            map.put(entry.getKey(), new Wallet.Model.Namespace.Proposal(value.getChains(), value.getMethods(), value.getEvents()));
        }
        for (Map.Entry<java.lang.String, Wallet.Model.Namespace.Proposal> entry2 : sessionProposal.getOptionalNamespaces().entrySet()) {
            Wallet.Model.Namespace.Proposal value2 = entry2.getValue();
            java.util.List<java.lang.String> chains = value2.getChains();
            if (chains != null) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : chains) {
                    if (AEQbTJ.djBIcL((java.lang.String) obj)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                arrayList = null;
            }
            java.util.List<java.lang.String> methods = value2.getMethods();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : methods) {
                if (AEQbTJ.AhwBna((java.lang.String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            if (map.get(entry2.getKey()) != null) {
                C13982dcp c13982dcp = AEQbTJ;
                Wallet.Model.Namespace.Proposal proposal = (Wallet.Model.Namespace.Proposal) map.get(entry2.getKey());
                java.util.List<java.lang.String> listAEQbTJ = c13982dcp.AEQbTJ(proposal != null ? proposal.getChains() : null, arrayList);
                Wallet.Model.Namespace.Proposal proposal2 = (Wallet.Model.Namespace.Proposal) map.get(entry2.getKey());
                java.util.List<java.lang.String> listAEQbTJ2 = c13982dcp.AEQbTJ(proposal2 != null ? proposal2.getMethods() : null, arrayList2);
                if (listAEQbTJ2 == null) {
                    listAEQbTJ2 = yDY.AhwBna();
                }
                Wallet.Model.Namespace.Proposal proposal3 = (Wallet.Model.Namespace.Proposal) map.get(entry2.getKey());
                java.util.List<java.lang.String> listAEQbTJ3 = c13982dcp.AEQbTJ(proposal3 != null ? proposal3.getEvents() : null, value2.getEvents());
                if (listAEQbTJ3 == null) {
                    listAEQbTJ3 = yDY.AhwBna();
                }
                map.put(entry2.getKey(), new Wallet.Model.Namespace.Proposal(listAEQbTJ, listAEQbTJ2, listAEQbTJ3));
            } else {
                map.put(entry2.getKey(), new Wallet.Model.Namespace.Proposal(arrayList, arrayList2, value2.getEvents()));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        for (Map.Entry<java.lang.String, Wallet.Model.Namespace.Proposal> entry3 : map.entrySet()) {
            linkedHashMap.put(entry3.getKey(), AEQbTJ.copydefault(entry3, list));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry4 : linkedHashMap.entrySet()) {
            Wallet.Model.Namespace.Session session = (Wallet.Model.Namespace.Session) entry4.getValue();
            if (C33129mqd.KWHzl((java.util.Collection) session.getChains()) && C33129mqd.KWHzl((java.util.Collection) session.getAccounts())) {
                linkedHashMap2.put(entry4.getKey(), entry4.getValue());
            }
        }
        return linkedHashMap2;
    }

    public final java.util.List<java.lang.String> AEQbTJ(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        if (list == null && list2 == null) {
            return null;
        }
        if (list == null) {
            list = yDY.AhwBna();
        }
        if (list2 == null) {
            list2 = yDY.AhwBna();
        }
        return CollectionsKt___CollectionsKt.QbewEr(CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) list, (java.lang.Iterable) list2));
    }

    public final Wallet.Model.Namespace.Session copydefault(Map.Entry<java.lang.String, Wallet.Model.Namespace.Proposal> entry, java.util.List<C13983dcq> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<java.lang.String> chains = entry.getValue().getChains();
        if (chains == null || chains.isEmpty()) {
            C13983dcq c13983dcqKWHzl = KWHzl(list, entry.getKey());
            if (c13983dcqKWHzl != null) {
                arrayList.add(C13983dcq.Companion.OLrzqt(entry.getKey(), c13983dcqKWHzl.EZpvd()));
            }
        } else {
            java.util.List<java.lang.String> chains2 = entry.getValue().getChains();
            if (chains2 != null) {
                for (java.lang.String str : chains2) {
                    C13983dcq c13983dcqKWHzl2 = AEQbTJ.KWHzl(list, str);
                    if (c13983dcqKWHzl2 != null) {
                        arrayList.add(C13983dcq.Companion.OLrzqt(str, c13983dcqKWHzl2.EZpvd()));
                    }
                }
            }
        }
        return new Wallet.Model.Namespace.Session(entry.getValue().getChains(), arrayList, entry.getValue().getMethods(), entry.getValue().getEvents());
    }

    public final C13983dcq KWHzl(java.util.List<C13983dcq> list, java.lang.String str) {
        java.lang.Object next;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C13983dcq) next).copydefault().KWHzl(str)) {
                break;
            }
        }
        return (C13983dcq) next;
    }

    public final boolean EZpvd(Wallet.Model.SessionProposal sessionProposal) {
        for (Map.Entry<java.lang.String, Wallet.Model.Namespace.Proposal> entry : sessionProposal.getRequiredNamespaces().entrySet()) {
            if (!AEQbTJ.AYXKKw(entry.getKey())) {
                return false;
            }
            java.util.List<java.lang.String> chains = entry.getValue().getChains();
            if (chains != null) {
                java.util.Iterator<T> it = chains.iterator();
                while (it.hasNext()) {
                    if (!AEQbTJ.djBIcL((java.lang.String) it.next())) {
                        return false;
                    }
                }
            }
        }
        if (sessionProposal.getRequiredNamespaces().isEmpty()) {
            java.util.Map<java.lang.String, Wallet.Model.Namespace.Proposal> optionalNamespaces = sessionProposal.getOptionalNamespaces();
            if (!optionalNamespaces.isEmpty()) {
                java.util.Iterator<Map.Entry<java.lang.String, Wallet.Model.Namespace.Proposal>> it2 = optionalNamespaces.entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!(!AEQbTJ.AYXKKw(it2.next().getKey()))) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.Iterator<Map.Entry<java.lang.String, Wallet.Model.Namespace.Proposal>> it3 = optionalNamespaces.entrySet().iterator();
                        while (it3.hasNext()) {
                            java.util.List<java.lang.String> chains2 = it3.next().getValue().getChains();
                            if (chains2 == null) {
                                chains2 = yDY.AhwBna();
                            }
                            C56406yEe.KWHzl(arrayList, chains2);
                        }
                        if (!arrayList.isEmpty()) {
                            java.util.Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                if (!(!AEQbTJ.djBIcL((java.lang.String) it4.next()))) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AhwBna(java.lang.String str) {
        switch (str.hashCode()) {
            case -1958497392:
                return str.equals("eth_sendTransaction");
            case -1424874333:
                if (!str.equals("eth_sign")) {
                }
                break;
            case -1073453553:
                if (!str.equals("solana_signMessage")) {
                }
                break;
            case -120530073:
                if (!str.equals("wallet_watchAsset")) {
                }
                break;
            case 27131247:
                if (!str.equals("wallet_addEthereumChain")) {
                }
                break;
            case 510720465:
                if (!str.equals("eth_signTypedData")) {
                }
                break;
            case 581195868:
                if (!str.equals("personal_sign")) {
                }
                break;
            case 1865879792:
                if (!str.equals("wallet_switchEthereumChain")) {
                }
                break;
            case 1879569638:
                if (!str.equals("solana_signTransaction")) {
                }
                break;
            case 2099305388:
                if (str.equals("eth_signTypedData_v4")) {
                }
                break;
        }
    }

    public final void isConnected(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        isConnected().post(new java.lang.Runnable() { // from class: o.dcs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C13982dcp.KWHzl(str);
            }
        });
    }

    public static final void KWHzl(java.lang.String str) {
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
    }

    public final InterfaceC13980dcn values(@NotNull java.lang.String str) {
        java.lang.String strReplace$default;
        Intrinsics.checkNotNullParameter(str, "");
        if (!C59449zhJ.startsWith$default(str, "wc:", false, 2, null)) {
            return new InterfaceC13980dcn.TaskDescription(str);
        }
        if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "wc://", false, 2, (java.lang.Object) null)) {
            strReplace$default = str;
        } else {
            strReplace$default = StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "wc:/", false, 2, (java.lang.Object) null) ? C59449zhJ.replace$default(str, "wc:/", "wc://", false, 4, (java.lang.Object) null) : C59449zhJ.replace$default(str, "wc:", "wc://", false, 4, (java.lang.Object) null);
        }
        try {
            java.net.URI uri = new java.net.URI(strReplace$default);
            java.lang.String userInfo = uri.getUserInfo();
            if (userInfo == null || userInfo.length() == 0) {
                return new InterfaceC13980dcn.TaskDescription(str);
            }
            java.lang.String query = uri.getQuery();
            Intrinsics.checkNotNullExpressionValue(query, "");
            java.util.List<java.lang.String> listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) query, new java.lang.String[]{ContainerUtils.FIELD_DELIMITER}, false, 0, 6, (java.lang.Object) null);
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listSplit$default, 10)), 16));
            for (java.lang.String str2 : listSplit$default) {
                kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(StringsKt__StringsKt.substringBefore$default(str2, ContainerUtils.KEY_VALUE_DELIMITER, (java.lang.String) null, 2, (java.lang.Object) null), StringsKt__StringsKt.substringAfter$default(str2, ContainerUtils.KEY_VALUE_DELIMITER, (java.lang.String) null, 2, (java.lang.Object) null));
                linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
            }
            java.lang.String str3 = (java.lang.String) linkedHashMap.get("relay-protocol");
            if (str3 == null) {
                return new InterfaceC13980dcn.Activity(str);
            }
            if (str3.length() == 0) {
                return new InterfaceC13980dcn.Activity(str);
            }
            java.lang.String str4 = (java.lang.String) linkedHashMap.get("symKey");
            if (str4 == null) {
                return new InterfaceC13980dcn.Activity(str);
            }
            if (str4.length() == 0) {
                return new InterfaceC13980dcn.Activity(str);
            }
            java.lang.String userInfo2 = uri.getUserInfo();
            Intrinsics.checkNotNullExpressionValue(userInfo2, "");
            return new InterfaceC13980dcn.Application(str, userInfo2);
        } catch (URISyntaxException unused) {
            return new InterfaceC13980dcn.TaskDescription(str);
        }
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return "did:pkh:" + str2 + ":" + str;
    }

    public final OKXAuthPayloadParams OLrzqt(@NotNull Wallet.Model.PayloadAuthRequestParams payloadAuthRequestParams, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(payloadAuthRequestParams, "");
        Intrinsics.checkNotNullParameter(list, "");
        return C13977dck.AEQbTJ(WalletKit.INSTANCE.generateAuthPayloadParams(payloadAuthRequestParams, list, yDY.gEmmrt("personal_sign", "eth_sign", "eth_signTypedData", "eth_signTypedData_v4", "eth_sendTransaction")));
    }

    public final java.lang.String AEQbTJ(@NotNull Wallet.Model.PayloadAuthRequestParams payloadAuthRequestParams, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(payloadAuthRequestParams, "");
        Intrinsics.checkNotNullParameter(str, "");
        return WalletKit.INSTANCE.formatAuthMessage(new Wallet.Params.FormatAuthMessage(payloadAuthRequestParams, str));
    }

    public final boolean AYXKKw(java.lang.String str) {
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractC13976dcj.TaskDescription.AEQbTJ.EZpvd()) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) AbstractC13976dcj.Activity.KWHzl.OLrzqt());
    }

    public final boolean djBIcL(java.lang.String str) {
        return InterfaceC13987dcu.Companion.AEQbTJ(str) != null;
    }

    public final Wallet.Model.SessionProposal fetchVPNInfo() {
        java.lang.Object objM7377constructorimpl;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((Wallet.Model.SessionProposal) CollectionsKt___CollectionsKt.wlaJM(WalletKit.INSTANCE.getSessionProposals()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletConnectV2Manager", "getSessionProposalLast", thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (Wallet.Model.SessionProposal) objM7377constructorimpl;
    }

    public final Wallet.Model.SessionProposal gEmmrt(java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object next;
        try {
            Result.Application application = Result.Companion;
            java.util.Iterator<T> it = WalletKit.INSTANCE.getSessionProposals().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) ((Wallet.Model.SessionProposal) next).getPairingTopic(), false, 2, (java.lang.Object) null)) {
                    break;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Wallet.Model.SessionProposal) next);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletConnectV2Manager", "getSessionProposalByUrl(" + str + ")", thM7380exceptionOrNullimpl);
        }
        return (Wallet.Model.SessionProposal) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final Wallet.Model.SessionProposal valueOf(@NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            java.util.Iterator<T> it = WalletKit.INSTANCE.getSessionProposals().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((Wallet.Model.SessionProposal) next).getPairingTopic(), (java.lang.Object) str)) {
                    break;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Wallet.Model.SessionProposal) next);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletConnectV2Manager", "getSessionProposalByPTopic(" + str + ")", thM7380exceptionOrNullimpl);
        }
        return (Wallet.Model.SessionProposal) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final Wallet.Model.Session AEQbTJ(@NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(WalletKit.INSTANCE.getActiveSessionByTopic(str));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletConnectV2Manager", "getActiveSessionByTopic(" + str + ")", thM7380exceptionOrNullimpl);
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (Wallet.Model.Session) objM7377constructorimpl;
    }

    public final Wallet.Model.SessionRequest copydefault(@NotNull java.lang.String str, long j) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            java.util.Iterator<T> it = WalletKit.INSTANCE.getPendingListOfSessionRequests(str).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((Wallet.Model.SessionRequest) next).getRequest().getId() == j) {
                    break;
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Wallet.Model.SessionRequest) next);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WalletConnectV2Manager", "getSessionRequest(" + str + ", " + j + ")", thM7380exceptionOrNullimpl);
        }
        return (Wallet.Model.SessionRequest) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<C13983dcq> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
        pUU.KWHzl("WalletConnectV2Manager", "checkInit    isInitialized:" + fetchVPNInfo);
        if (fetchVPNInfo.get()) {
            pUU.copydefault("WalletConnectV2Manager", "approveSession    " + str);
            C13982dcp c13982dcp = AEQbTJ;
            Wallet.Model.SessionProposal sessionProposalValueOf = c13982dcp.valueOf(str);
            if (sessionProposalValueOf != null) {
                try {
                    WalletKit walletKit = WalletKit.INSTANCE;
                    walletKit.approveSession(new Wallet.Params.SessionApprove(sessionProposalValueOf.getProposerPublicKey(), walletKit.generateApprovedNamespaces(sessionProposalValueOf, c13982dcp.KWHzl(sessionProposalValueOf, list)), null, 4, null), new ComponentCallbacks2(str, sessionProposalValueOf, str2), new ClipData(str, sessionProposalValueOf));
                } catch (java.lang.Exception e) {
                    pUU.AEQbTJ("WalletConnectV2Manager", "approveSession error " + str, e);
                    InterfaceC13979dcm interfaceC13979dcm = values;
                    if (interfaceC13979dcm != null) {
                        interfaceC13979dcm.OLrzqt(str, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
                    }
                    AEQbTJ.KWHzl(str, true);
                }
            } else {
                pUU.copydefault("WalletConnectV2Manager", "Unable to get session proposal for pairing topic " + str);
                InterfaceC13979dcm interfaceC13979dcm2 = values;
                if (interfaceC13979dcm2 != null) {
                    interfaceC13979dcm2.OLrzqt(str, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
                }
                c13982dcp.KWHzl(str, true);
            }
            AhwBna.remove(str);
            return;
        }
        pUU.KWHzl("WalletConnectV2Manager", "initWC");
        CoreClient coreClient = CoreClient.INSTANCE;
        java.lang.String str3 = C34703nhO.copydefault() ? "7f235442ef83a2d6f345f9fdbae72783" : "aef737a395c3d77d0df683f9ed219cde";
        ConnectionType connectionType = ConnectionType.AUTOMATIC;
        java.lang.String string = applicationAEQbTJ.getString(C13754dXa.FragmentManager.NRYds);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = applicationAEQbTJ.getString(C13754dXa.FragmentManager.ibnZAm);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CoreInterface.DefaultImpls.initialize$default((CoreInterface) coreClient, applicationAEQbTJ, str3, new Core.Model.AppMetaData(string, string2, applicationAEQbTJ.getString(C13754dXa.FragmentManager.ONJgbh) + "?version=" + C59449zhJ.replace$default(C32979mnm.EZpvd.EZpvd(), "beta", "", false, 4, (java.lang.Object) null), yDY.copydefault(C43386roM.EZpvd.EZpvd() + applicationAEQbTJ.getString(C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21)), "okx://wallet/wallet/home", null, false, null, 224, null), connectionType, (RelayConnectionInterface) null, (java.lang.String) null, NetworkClientTimeout.Companion.getDefaultTimeout(), false, (Function1) new SharedElementCallback(), 48, (java.lang.Object) null);
        WalletKit walletKit2 = WalletKit.INSTANCE;
        walletKit2.initialize(new Wallet.Params.Init(coreClient), new AssistContent(str, list, str2), new PictureInPictureParams());
        coreClient.setDelegate(copydefault);
        walletKit2.setWalletDelegate(AkhnZx);
    }

    public final void KWHzl(@NotNull java.lang.String str, boolean z) {
        InterfaceC13979dcm interfaceC13979dcm;
        InterfaceC13979dcm interfaceC13979dcm2;
        Intrinsics.checkNotNullParameter(str, "");
        android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
        pUU.KWHzl("WalletConnectV2Manager", "checkInit    isInitialized:" + fetchVPNInfo);
        if (fetchVPNInfo.get()) {
            pUU.copydefault("WalletConnectV2Manager", "rejectSession    " + str);
            try {
                Wallet.Model.SessionProposal sessionProposalValueOf = AEQbTJ.valueOf(str);
                if (sessionProposalValueOf != null) {
                    WalletKit.INSTANCE.rejectSession(new Wallet.Params.SessionReject(sessionProposalValueOf.getProposerPublicKey(), "Reject Session"), new Bundle(str, z), new Handler(str, z));
                } else {
                    pUU.copydefault("WalletConnectV2Manager", "rejectSession: sessionProposal is null, pairingTopic=" + str);
                    if (!z && (interfaceC13979dcm2 = values) != null) {
                        interfaceC13979dcm2.KWHzl(str, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
                    }
                }
            } catch (java.lang.Exception e) {
                pUU.AEQbTJ("WalletConnectV2Manager", "rejectSession error " + str, e);
                if (!z && (interfaceC13979dcm = values) != null) {
                    interfaceC13979dcm.KWHzl(str, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
                }
            }
            AhwBna.remove(str);
            return;
        }
        pUU.KWHzl("WalletConnectV2Manager", "initWC");
        CoreClient coreClient = CoreClient.INSTANCE;
        java.lang.String str2 = C34703nhO.copydefault() ? "7f235442ef83a2d6f345f9fdbae72783" : "aef737a395c3d77d0df683f9ed219cde";
        ConnectionType connectionType = ConnectionType.AUTOMATIC;
        java.lang.String string = applicationAEQbTJ.getString(C13754dXa.FragmentManager.NRYds);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = applicationAEQbTJ.getString(C13754dXa.FragmentManager.ibnZAm);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CoreInterface.DefaultImpls.initialize$default((CoreInterface) coreClient, applicationAEQbTJ, str2, new Core.Model.AppMetaData(string, string2, applicationAEQbTJ.getString(C13754dXa.FragmentManager.ONJgbh) + "?version=" + C59449zhJ.replace$default(C32979mnm.EZpvd.EZpvd(), "beta", "", false, 4, (java.lang.Object) null), yDY.copydefault(C43386roM.EZpvd.EZpvd() + applicationAEQbTJ.getString(C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21)), "okx://wallet/wallet/home", null, false, null, 224, null), connectionType, (RelayConnectionInterface) null, (java.lang.String) null, NetworkClientTimeout.Companion.getDefaultTimeout(), false, (Function1) new MediaController(), 48, (java.lang.Object) null);
        WalletKit walletKit = WalletKit.INSTANCE;
        walletKit.initialize(new Wallet.Params.Init(coreClient), new Callback(str, z), new Environment());
        coreClient.setDelegate(copydefault);
        walletKit.setWalletDelegate(AkhnZx);
    }

    public final void OLrzqt(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
        pUU.KWHzl("WalletConnectV2Manager", "checkInit    isInitialized:" + fetchVPNInfo);
        if (fetchVPNInfo.get()) {
            pUU.KWHzl("WalletConnectV2Manager", "approveRequest " + str + ", " + j);
            WalletKit.INSTANCE.respondSessionRequest(new Wallet.Params.SessionRequestResponse(str, new Wallet.Model.JsonRpcResponse.JsonRpcResult(j, str2)), new TaskStackBuilder(str, j), new VoiceInteractor(str, j));
            valueOf.remove(new Application(str, j));
            return;
        }
        pUU.KWHzl("WalletConnectV2Manager", "initWC");
        CoreClient coreClient = CoreClient.INSTANCE;
        java.lang.String str3 = C34703nhO.copydefault() ? "7f235442ef83a2d6f345f9fdbae72783" : "aef737a395c3d77d0df683f9ed219cde";
        ConnectionType connectionType = ConnectionType.AUTOMATIC;
        java.lang.String string = applicationAEQbTJ.getString(C13754dXa.FragmentManager.NRYds);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = applicationAEQbTJ.getString(C13754dXa.FragmentManager.ibnZAm);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CoreInterface.DefaultImpls.initialize$default((CoreInterface) coreClient, applicationAEQbTJ, str3, new Core.Model.AppMetaData(string, string2, applicationAEQbTJ.getString(C13754dXa.FragmentManager.ONJgbh) + "?version=" + C59449zhJ.replace$default(C32979mnm.EZpvd.EZpvd(), "beta", "", false, 4, (java.lang.Object) null), yDY.copydefault(C43386roM.EZpvd.EZpvd() + applicationAEQbTJ.getString(C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21)), "okx://wallet/wallet/home", null, false, null, 224, null), connectionType, (RelayConnectionInterface) null, (java.lang.String) null, NetworkClientTimeout.Companion.getDefaultTimeout(), false, (Function1) new Dialog(), 48, (java.lang.Object) null);
        WalletKit walletKit = WalletKit.INSTANCE;
        walletKit.initialize(new Wallet.Params.Init(coreClient), new FragmentManager(str, j, str2), new Fragment());
        coreClient.setDelegate(copydefault);
        walletKit.setWalletDelegate(AkhnZx);
    }

    public final void EZpvd(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
        pUU.KWHzl("WalletConnectV2Manager", "checkInit    isInitialized:" + fetchVPNInfo);
        if (fetchVPNInfo.get()) {
            WalletKit.INSTANCE.respondSessionRequest(new Wallet.Params.SessionRequestResponse(str, new Wallet.Model.JsonRpcResponse.JsonRpcError(j, i, str2)), new Typeface(str, j, z), new Drawable(str, j));
            valueOf.remove(new Application(str, j));
            return;
        }
        pUU.KWHzl("WalletConnectV2Manager", "initWC");
        CoreClient coreClient = CoreClient.INSTANCE;
        java.lang.String str3 = C34703nhO.copydefault() ? "7f235442ef83a2d6f345f9fdbae72783" : "aef737a395c3d77d0df683f9ed219cde";
        ConnectionType connectionType = ConnectionType.AUTOMATIC;
        java.lang.String string = applicationAEQbTJ.getString(C13754dXa.FragmentManager.NRYds);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = applicationAEQbTJ.getString(C13754dXa.FragmentManager.ibnZAm);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CoreInterface.DefaultImpls.initialize$default((CoreInterface) coreClient, applicationAEQbTJ, str3, new Core.Model.AppMetaData(string, string2, applicationAEQbTJ.getString(C13754dXa.FragmentManager.ONJgbh) + "?version=" + C59449zhJ.replace$default(C32979mnm.EZpvd.EZpvd(), "beta", "", false, 4, (java.lang.Object) null), yDY.copydefault(C43386roM.EZpvd.EZpvd() + applicationAEQbTJ.getString(C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21)), "okx://wallet/wallet/home", null, false, null, 224, null), connectionType, (RelayConnectionInterface) null, (java.lang.String) null, NetworkClientTimeout.Companion.getDefaultTimeout(), false, (Function1) new Rect(), 48, (java.lang.Object) null);
        WalletKit walletKit = WalletKit.INSTANCE;
        walletKit.initialize(new Wallet.Params.Init(coreClient), new Paint(str, j, i, str2, z), new Uri());
        coreClient.setDelegate(copydefault);
        walletKit.setWalletDelegate(AkhnZx);
    }

    public final void EZpvd(long j, Wallet.Model.PayloadAuthRequestParams payloadAuthRequestParams, @NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
        pUU.KWHzl("WalletConnectV2Manager", "checkInit    isInitialized:" + fetchVPNInfo);
        if (fetchVPNInfo.get()) {
            pUU.KWHzl("WalletConnectV2Manager", "approve authRequest payloadParams:" + payloadAuthRequestParams);
            if (payloadAuthRequestParams == null) {
                InterfaceC13979dcm interfaceC13979dcm = values;
                if (interfaceC13979dcm != null) {
                    interfaceC13979dcm.KWHzl(j, C33070mpX.AYXKKw(C13754dXa.FragmentManager.DcMfJKffREWX));
                    return;
                }
                return;
            }
            WalletKit walletKit = WalletKit.INSTANCE;
            walletKit.approveSessionAuthenticate(new Wallet.Params.ApproveSessionAuthenticate(j, C56402yEa.EZpvd(walletKit.generateAuthObject(payloadAuthRequestParams, str2, new Wallet.Model.Cacao.Signature((z ? SignatureType.EIP1271 : SignatureType.EIP191).getHeader(), str, null)))), new PendingIntent(j), new LoaderManager(j));
            gEmmrt.remove(java.lang.Long.valueOf(j));
            return;
        }
        pUU.KWHzl("WalletConnectV2Manager", "initWC");
        CoreClient coreClient = CoreClient.INSTANCE;
        java.lang.String str3 = C34703nhO.copydefault() ? "7f235442ef83a2d6f345f9fdbae72783" : "aef737a395c3d77d0df683f9ed219cde";
        ConnectionType connectionType = ConnectionType.AUTOMATIC;
        java.lang.String string = applicationAEQbTJ.getString(C13754dXa.FragmentManager.NRYds);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = applicationAEQbTJ.getString(C13754dXa.FragmentManager.ibnZAm);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CoreInterface.DefaultImpls.initialize$default((CoreInterface) coreClient, applicationAEQbTJ, str3, new Core.Model.AppMetaData(string, string2, applicationAEQbTJ.getString(C13754dXa.FragmentManager.ONJgbh) + "?version=" + C59449zhJ.replace$default(C32979mnm.EZpvd.EZpvd(), "beta", "", false, 4, (java.lang.Object) null), yDY.copydefault(C43386roM.EZpvd.EZpvd() + applicationAEQbTJ.getString(C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21)), "okx://wallet/wallet/home", null, false, null, 224, null), connectionType, (RelayConnectionInterface) null, (java.lang.String) null, NetworkClientTimeout.Companion.getDefaultTimeout(), false, (Function1) new ActionBar(), 48, (java.lang.Object) null);
        WalletKit walletKit2 = WalletKit.INSTANCE;
        walletKit2.initialize(new Wallet.Params.Init(coreClient), new StateListAnimator(payloadAuthRequestParams, j, str2, z, str), new TaskDescription());
        coreClient.setDelegate(copydefault);
        walletKit2.setWalletDelegate(AkhnZx);
    }

    public final void AEQbTJ(long j, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
        pUU.KWHzl("WalletConnectV2Manager", "checkInit    isInitialized:" + fetchVPNInfo);
        if (fetchVPNInfo.get()) {
            WalletKit.INSTANCE.rejectSessionAuthenticate(new Wallet.Params.RejectSessionAuthenticate(j, str), new Point(j, z), new Matrix(j, z));
            gEmmrt.remove(java.lang.Long.valueOf(j));
            return;
        }
        pUU.KWHzl("WalletConnectV2Manager", "initWC");
        CoreClient coreClient = CoreClient.INSTANCE;
        java.lang.String str2 = C34703nhO.copydefault() ? "7f235442ef83a2d6f345f9fdbae72783" : "aef737a395c3d77d0df683f9ed219cde";
        ConnectionType connectionType = ConnectionType.AUTOMATIC;
        java.lang.String string = applicationAEQbTJ.getString(C13754dXa.FragmentManager.NRYds);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = applicationAEQbTJ.getString(C13754dXa.FragmentManager.ibnZAm);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CoreInterface.DefaultImpls.initialize$default((CoreInterface) coreClient, applicationAEQbTJ, str2, new Core.Model.AppMetaData(string, string2, applicationAEQbTJ.getString(C13754dXa.FragmentManager.ONJgbh) + "?version=" + C59449zhJ.replace$default(C32979mnm.EZpvd.EZpvd(), "beta", "", false, 4, (java.lang.Object) null), yDY.copydefault(C43386roM.EZpvd.EZpvd() + applicationAEQbTJ.getString(C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21)), "okx://wallet/wallet/home", null, false, null, 224, null), connectionType, (RelayConnectionInterface) null, (java.lang.String) null, NetworkClientTimeout.Companion.getDefaultTimeout(), false, (Function1) new Bitmap(), 48, (java.lang.Object) null);
        WalletKit walletKit = WalletKit.INSTANCE;
        walletKit.initialize(new Wallet.Params.Init(coreClient), new SQLiteDatabase(j, str, z), new Mode());
        coreClient.setDelegate(copydefault);
        walletKit.setWalletDelegate(AkhnZx);
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.app.Application applicationAEQbTJ = C9678baC.Companion.AEQbTJ();
        pUU.KWHzl("WalletConnectV2Manager", "checkInit    isInitialized:" + fetchVPNInfo);
        if (fetchVPNInfo.get()) {
            pUU.KWHzl("WalletConnectV2Manager", "disconnect " + str);
            try {
                WalletKit.INSTANCE.disconnectSession(new Wallet.Params.SessionDisconnect(str), new ApplicationInfo(str), new IntentSender(str));
                return;
            } catch (java.lang.Exception e) {
                AEQbTJ.KWHzl(str, e);
                return;
            }
        }
        pUU.KWHzl("WalletConnectV2Manager", "initWC");
        CoreClient coreClient = CoreClient.INSTANCE;
        java.lang.String str2 = C34703nhO.copydefault() ? "7f235442ef83a2d6f345f9fdbae72783" : "aef737a395c3d77d0df683f9ed219cde";
        ConnectionType connectionType = ConnectionType.AUTOMATIC;
        java.lang.String string = applicationAEQbTJ.getString(C13754dXa.FragmentManager.NRYds);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = applicationAEQbTJ.getString(C13754dXa.FragmentManager.ibnZAm);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        CoreInterface.DefaultImpls.initialize$default((CoreInterface) coreClient, applicationAEQbTJ, str2, new Core.Model.AppMetaData(string, string2, applicationAEQbTJ.getString(C13754dXa.FragmentManager.ONJgbh) + "?version=" + C59449zhJ.replace$default(C32979mnm.EZpvd.EZpvd(), "beta", "", false, 4, (java.lang.Object) null), yDY.copydefault(C43386roM.EZpvd.EZpvd() + applicationAEQbTJ.getString(C13754dXa.FragmentManager.MediaBrowserCompatSubscriptionCallbackSubscriptionCallbackApi21)), "okx://wallet/wallet/home", null, false, null, 224, null), connectionType, (RelayConnectionInterface) null, (java.lang.String) null, NetworkClientTimeout.Companion.getDefaultTimeout(), false, (Function1) new IntentFilter(), 48, (java.lang.Object) null);
        WalletKit walletKit = WalletKit.INSTANCE;
        walletKit.initialize(new Wallet.Params.Init(coreClient), new ServiceConnection(str), new SharedPreferences());
        coreClient.setDelegate(copydefault);
        walletKit.setWalletDelegate(AkhnZx);
    }
}
