package com.okinc.business.defi.wallet.common.okxconnect;

import com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent;
import com.okinc.wallet.core.sign.ton.X25519KeyPair;
import com.reown.android.internal.common.di.CoreNetworkModuleKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.AbstractC12782ctV;
import o.C13754dXa;
import o.C15935eaT;
import o.C15974ebF;
import o.C16000ebf;
import o.C16013ebs;
import o.C56391yDq;
import o.C56406yEe;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectManager$connectToDApp$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ AbstractC12782ctV $wallet;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ C15935eaT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectManager$connectToDApp$2(C15935eaT c15935eaT, AbstractC12782ctV abstractC12782ctV, Continuation<? super OKXConnectManager$connectToDApp$2> continuation) {
        super(2, continuation);
        this.this$0 = c15935eaT;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectManager$connectToDApp$2(this.this$0, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((OKXConnectManager$connectToDApp$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:94:0x01ce */
    /* JADX DEBUG: Type inference failed for r1v13. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r6v15. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0244 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0262 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x028c  */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent$ConnectSuccess] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.ArrayList, java.util.Collection] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        X25519KeyPair x25519KeyPairOLrzqt;
        Object connectRequestResponse$default;
        DAppConnectRequest dAppConnectRequest;
        X25519KeyPair x25519KeyPair;
        DAppConnectRequest dAppConnectRequest2;
        Object objM7386unboximpl;
        X25519KeyPair x25519KeyPair2;
        int i;
        WalletEvent walletEvent;
        DAppConnectRequest dAppConnectRequest3;
        ?? arrayList;
        int i2;
        Object obj2;
        C15935eaT c15935eaT;
        WalletEvent.ConnectSuccess.Payload payload;
        List<WalletEvent.ConnectSuccess.Payload.Response> responses;
        C15974ebF c15974ebF;
        int i3;
        C15935eaT c15935eaT2;
        ?? redirect;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = this.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            DAppConnectRequest dAppConnectRequest4 = this.this$0.AEQbTJ;
            if (dAppConnectRequest4 != null && (x25519KeyPairOLrzqt = this.this$0.OLrzqt()) != null) {
                C16013ebs c16013ebs = this.this$0.OLrzqt;
                AbstractC12782ctV abstractC12782ctV = this.$wallet;
                this.L$0 = dAppConnectRequest4;
                this.L$1 = x25519KeyPairOLrzqt;
                this.label = 1;
                connectRequestResponse$default = C16013ebs.getConnectRequestResponse$default(c16013ebs, abstractC12782ctV, dAppConnectRequest4, null, this, 4, null);
                if (connectRequestResponse$default == objCopydefault) {
                    return objCopydefault;
                }
                dAppConnectRequest = dAppConnectRequest4;
                x25519KeyPair = x25519KeyPairOLrzqt;
            }
            return C56443yFo.KWHzl(false);
        }
        if (i4 == 1) {
            X25519KeyPair x25519KeyPair3 = (X25519KeyPair) this.L$1;
            DAppConnectRequest dAppConnectRequest5 = (DAppConnectRequest) this.L$0;
            C56391yDq.AEQbTJ(obj);
            x25519KeyPair = x25519KeyPair3;
            dAppConnectRequest = dAppConnectRequest5;
            connectRequestResponse$default = obj;
        } else if (i4 == 2) {
            i = this.I$0;
            walletEvent = (WalletEvent) this.L$2;
            X25519KeyPair x25519KeyPair4 = (X25519KeyPair) this.L$1;
            dAppConnectRequest3 = (DAppConnectRequest) this.L$0;
            C56391yDq.AEQbTJ(obj);
            x25519KeyPair2 = x25519KeyPair4;
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            dAppConnectRequest2 = null;
            C15935eaT c15935eaT3 = this.this$0;
            AbstractC12782ctV abstractC12782ctV2 = this.$wallet;
            if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
                if (i != 0) {
                    ?? r8 = walletEvent instanceof WalletEvent.ConnectSuccess ? (WalletEvent.ConnectSuccess) walletEvent : dAppConnectRequest2;
                    if (r8 == 0 || (payload = r8.getPayload()) == null || (responses = payload.getResponses()) == null) {
                        arrayList = dAppConnectRequest2;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : responses) {
                            if (obj3 instanceof WalletEvent.ConnectSuccess.Payload.Response.Accounts) {
                                arrayList2.add(obj3);
                            }
                        }
                        arrayList = new ArrayList();
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            List<WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account> accounts = ((WalletEvent.ConnectSuccess.Payload.Response.Accounts) it.next()).getAccounts();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = accounts.iterator();
                            while (it2.hasNext()) {
                                C56406yEe.KWHzl(arrayList3, ((WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account) it2.next()).getAddresses());
                            }
                            C56406yEe.KWHzl((Collection) arrayList, arrayList3);
                        }
                    }
                    ?? AhwBna = arrayList == 0 ? yDY.AhwBna() : arrayList;
                    String strDbNXlk = abstractC12782ctV2.DbNXlk();
                    DAppSession dAppSession = new DAppSession(dAppConnectRequest3.getClientId(), dAppConnectRequest3.getTopic(), abstractC12782ctV2.DbNXlk(), x25519KeyPair2, dAppConnectRequest3.getDAppInfo(), dAppConnectRequest3.getHasLegacyTonRequest(), AhwBna, C56443yFo.KWHzl(dAppConnectRequest3.getHasCosmosRequest()), dAppConnectRequest3.getRedirect(), System.currentTimeMillis(), dAppConnectRequest3.getNewProtocolVersion(), C56443yFo.KWHzl(System.currentTimeMillis()));
                    this.L$0 = objM7386unboximpl;
                    this.L$1 = c15935eaT3;
                    this.L$2 = dAppConnectRequest2;
                    this.I$0 = i;
                    this.label = 3;
                    if (c15935eaT3.EZpvd(strDbNXlk, dAppSession, (Continuation<? super Unit>) this) == objCopydefault) {
                        return objCopydefault;
                    }
                    i2 = i;
                    obj2 = objM7386unboximpl;
                    c15935eaT = c15935eaT3;
                    c15974ebF = c15935eaT.djBIcL;
                    i3 = C13754dXa.FragmentManager.getTitle;
                    this.L$0 = obj2;
                    this.L$1 = c15935eaT;
                    this.I$0 = i2;
                    this.label = 4;
                    if (C15974ebF.displayToast$default(c15974ebF, i3, false, true, false, this, 10, null) != objCopydefault) {
                    }
                }
            }
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else if (i4 == 3) {
            int i5 = this.I$0;
            C15935eaT c15935eaT4 = (C15935eaT) this.L$1;
            Object obj4 = this.L$0;
            C56391yDq.AEQbTJ(obj);
            i2 = i5;
            c15935eaT = c15935eaT4;
            obj2 = obj4;
            dAppConnectRequest2 = null;
            c15974ebF = c15935eaT.djBIcL;
            i3 = C13754dXa.FragmentManager.getTitle;
            this.L$0 = obj2;
            this.L$1 = c15935eaT;
            this.I$0 = i2;
            this.label = 4;
            if (C15974ebF.displayToast$default(c15974ebF, i3, false, true, false, this, 10, null) != objCopydefault) {
                return objCopydefault;
            }
            i = i2;
            c15935eaT2 = c15935eaT;
            objM7386unboximpl = obj2;
            DAppConnectRequest dAppConnectRequest6 = c15935eaT2.AEQbTJ;
            if (dAppConnectRequest6 == null) {
            }
            this.L$0 = objM7386unboximpl;
            this.L$1 = c15935eaT2;
            this.I$0 = i;
            this.label = 5;
            if (c15935eaT2.OLrzqt((String) redirect, (Continuation<? super Unit>) this) == objCopydefault) {
            }
            c15935eaT2.AEQbTJ = dAppConnectRequest2;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
        } else {
            if (i4 != 4) {
                if (i4 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                c15935eaT2 = (C15935eaT) this.L$1;
                objM7386unboximpl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                dAppConnectRequest2 = null;
                c15935eaT2.AEQbTJ = dAppConnectRequest2;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("OKXConnectManager", "Error sending out connect message - " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                    return C56443yFo.KWHzl(false);
                }
                return C56443yFo.KWHzl(i != 0);
            }
            i = this.I$0;
            c15935eaT2 = (C15935eaT) this.L$1;
            objM7386unboximpl = this.L$0;
            C56391yDq.AEQbTJ(obj);
            dAppConnectRequest2 = null;
            DAppConnectRequest dAppConnectRequest62 = c15935eaT2.AEQbTJ;
            redirect = dAppConnectRequest62 == null ? dAppConnectRequest62.getRedirect() : dAppConnectRequest2;
            this.L$0 = objM7386unboximpl;
            this.L$1 = c15935eaT2;
            this.I$0 = i;
            this.label = 5;
            if (c15935eaT2.OLrzqt((String) redirect, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
            c15935eaT2.AEQbTJ = dAppConnectRequest2;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
            if (thM7380exceptionOrNullimpl != null) {
            }
        }
        WalletEvent walletEvent2 = (WalletEvent) connectRequestResponse$default;
        C15935eaT c15935eaT5 = this.this$0;
        Json json = c15935eaT5.gEmmrt;
        json.getSerializersModule();
        String strAEQbTJ = c15935eaT5.AEQbTJ(json.encodeToString(BuiltinSerializersKt.getNullable(WalletEvent.Companion.serializer()), walletEvent2), x25519KeyPair.getPrvKey(), dAppConnectRequest.getClientId());
        boolean z = walletEvent2 instanceof WalletEvent.ConnectSuccess;
        Json json2 = this.this$0.gEmmrt;
        JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
        JsonElementBuildersKt.put(jsonObjectBuilder, CoreNetworkModuleKt.KEY_CLIENT_ID, x25519KeyPair.getPubKey());
        JsonElementBuildersKt.put(jsonObjectBuilder, "message", strAEQbTJ);
        JsonObject jsonObjectBuild = jsonObjectBuilder.build();
        json2.getSerializersModule();
        String strEncodeToString = json2.encodeToString(JsonObject.Companion.serializer(), jsonObjectBuild);
        C16000ebf c16000ebf = this.this$0.fetchVPNInfo;
        String topic = dAppConnectRequest.getTopic();
        this.L$0 = dAppConnectRequest;
        this.L$1 = x25519KeyPair;
        this.L$2 = walletEvent2;
        this.I$0 = z ? 1 : 0;
        this.label = 2;
        DAppConnectRequest dAppConnectRequest7 = dAppConnectRequest;
        X25519KeyPair x25519KeyPair5 = x25519KeyPair;
        dAppConnectRequest2 = null;
        Object objKWHzl = c16000ebf.KWHzl(topic, strEncodeToString, (28 & 4) != 0 ? false : false, (28 & 8) != 0, (28 & 16) != 0 ? false : false, this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        objM7386unboximpl = objKWHzl;
        x25519KeyPair2 = x25519KeyPair5;
        i = z ? 1 : 0;
        walletEvent = walletEvent2;
        dAppConnectRequest3 = dAppConnectRequest7;
        C15935eaT c15935eaT32 = this.this$0;
        AbstractC12782ctV abstractC12782ctV22 = this.$wallet;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
    }
}
