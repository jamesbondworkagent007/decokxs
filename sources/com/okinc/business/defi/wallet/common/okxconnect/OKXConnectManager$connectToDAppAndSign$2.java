package com.okinc.business.defi.wallet.common.okxconnect;

import com.okinc.business.defi.wallet.common.okxconnect.model.DAppSession;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent;
import com.okinc.wallet.core.sign.ton.X25519KeyPair;
import com.reown.android.internal.common.di.CoreNetworkModuleKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.AbstractC12782ctV;
import o.C13754dXa;
import o.C15935eaT;
import o.C15974ebF;
import o.C16000ebf;
import o.C56391yDq;
import o.C56406yEe;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes4.dex */
public final class OKXConnectManager$connectToDAppAndSign$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ WalletEvent $connectEvent;
    final /* synthetic */ AbstractC12782ctV $wallet;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C15935eaT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OKXConnectManager$connectToDAppAndSign$2(C15935eaT c15935eaT, WalletEvent walletEvent, AbstractC12782ctV abstractC12782ctV, Continuation<? super OKXConnectManager$connectToDAppAndSign$2> continuation) {
        super(2, continuation);
        this.this$0 = c15935eaT;
        this.$connectEvent = walletEvent;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OKXConnectManager$connectToDAppAndSign$2(this.this$0, this.$connectEvent, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((OKXConnectManager$connectToDAppAndSign$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0205 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0224 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        X25519KeyPair x25519KeyPairOLrzqt;
        DAppConnectRequest dAppConnectRequest;
        boolean z;
        Object objM7386unboximpl;
        X25519KeyPair x25519KeyPair;
        int i;
        List listAhwBna;
        int i2;
        Object obj2;
        C15935eaT c15935eaT;
        WalletEvent.ConnectSuccess.Payload payload;
        List<WalletEvent.ConnectSuccess.Payload.Response> responses;
        C15974ebF c15974ebF;
        int i3;
        C15935eaT c15935eaT2;
        String redirect;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i4 = this.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            DAppConnectRequest dAppConnectRequest2 = this.this$0.AEQbTJ;
            if (dAppConnectRequest2 != null && (x25519KeyPairOLrzqt = this.this$0.OLrzqt()) != null) {
                C15935eaT c15935eaT3 = this.this$0;
                Json json = c15935eaT3.gEmmrt;
                WalletEvent walletEvent = this.$connectEvent;
                json.getSerializersModule();
                String strAEQbTJ = c15935eaT3.AEQbTJ(json.encodeToString(WalletEvent.Companion.serializer(), walletEvent), x25519KeyPairOLrzqt.getPrvKey(), dAppConnectRequest2.getClientId());
                boolean z2 = this.$connectEvent instanceof WalletEvent.ConnectSuccess;
                Json json2 = this.this$0.gEmmrt;
                JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                JsonElementBuildersKt.put(jsonObjectBuilder, CoreNetworkModuleKt.KEY_CLIENT_ID, x25519KeyPairOLrzqt.getPubKey());
                JsonElementBuildersKt.put(jsonObjectBuilder, "message", strAEQbTJ);
                JsonObject jsonObjectBuild = jsonObjectBuilder.build();
                json2.getSerializersModule();
                String strEncodeToString = json2.encodeToString(JsonObject.Companion.serializer(), jsonObjectBuild);
                C16000ebf c16000ebf = this.this$0.fetchVPNInfo;
                String topic = dAppConnectRequest2.getTopic();
                this.L$0 = dAppConnectRequest2;
                this.L$1 = x25519KeyPairOLrzqt;
                this.I$0 = z2 ? 1 : 0;
                this.label = 1;
                dAppConnectRequest = dAppConnectRequest2;
                z = true;
                Object objKWHzl = c16000ebf.KWHzl(topic, strEncodeToString, (28 & 4) != 0 ? false : false, (28 & 8) != 0, (28 & 16) != 0 ? false : false, this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                objM7386unboximpl = objKWHzl;
                x25519KeyPair = x25519KeyPairOLrzqt;
                i = z2 ? 1 : 0;
            }
            return C56443yFo.KWHzl(false);
        }
        if (i4 == 1) {
            i = this.I$0;
            X25519KeyPair x25519KeyPair2 = (X25519KeyPair) this.L$1;
            DAppConnectRequest dAppConnectRequest3 = (DAppConnectRequest) this.L$0;
            C56391yDq.AEQbTJ(obj);
            x25519KeyPair = x25519KeyPair2;
            dAppConnectRequest = dAppConnectRequest3;
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
            z = true;
        } else if (i4 == 2) {
            int i5 = this.I$0;
            C15935eaT c15935eaT4 = (C15935eaT) this.L$1;
            Object obj3 = this.L$0;
            C56391yDq.AEQbTJ(obj);
            c15935eaT = c15935eaT4;
            obj2 = obj3;
            z = true;
            i2 = i5;
            c15974ebF = c15935eaT.djBIcL;
            i3 = C13754dXa.FragmentManager.getTitle;
            this.L$0 = obj2;
            this.L$1 = c15935eaT;
            this.I$0 = i2;
            this.label = 3;
            Object obj4 = obj2;
            if (C15974ebF.displayToast$default(c15974ebF, i3, false, true, false, this, 10, null) != objCopydefault) {
                return objCopydefault;
            }
            i = i2;
            c15935eaT2 = c15935eaT;
            objM7386unboximpl = obj4;
            DAppConnectRequest dAppConnectRequest4 = c15935eaT2.AEQbTJ;
            if (dAppConnectRequest4 == null) {
            }
            this.L$0 = objM7386unboximpl;
            this.L$1 = c15935eaT2;
            this.I$0 = i;
            this.label = 4;
            if (c15935eaT2.OLrzqt(redirect, (Continuation<? super Unit>) this) == objCopydefault) {
            }
            c15935eaT2.AEQbTJ = null;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
            if (thM7380exceptionOrNullimpl == null) {
            }
        } else {
            if (i4 != 3) {
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.I$0;
                c15935eaT2 = (C15935eaT) this.L$1;
                objM7386unboximpl = this.L$0;
                C56391yDq.AEQbTJ(obj);
                z = true;
                c15935eaT2.AEQbTJ = null;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
                if (thM7380exceptionOrNullimpl == null) {
                    pUU.AEQbTJ("OKXConnectManager", "Error sending out connect message - " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                    return C56443yFo.KWHzl(false);
                }
                return C56443yFo.KWHzl(i != 0 ? z : false);
            }
            i = this.I$0;
            c15935eaT2 = (C15935eaT) this.L$1;
            objM7386unboximpl = this.L$0;
            C56391yDq.AEQbTJ(obj);
            z = true;
            DAppConnectRequest dAppConnectRequest42 = c15935eaT2.AEQbTJ;
            redirect = dAppConnectRequest42 == null ? dAppConnectRequest42.getRedirect() : null;
            this.L$0 = objM7386unboximpl;
            this.L$1 = c15935eaT2;
            this.I$0 = i;
            this.label = 4;
            if (c15935eaT2.OLrzqt(redirect, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
            c15935eaT2.AEQbTJ = null;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
            if (thM7380exceptionOrNullimpl == null) {
            }
        }
        WalletEvent walletEvent2 = this.$connectEvent;
        C15935eaT c15935eaT5 = this.this$0;
        AbstractC12782ctV abstractC12782ctV = this.$wallet;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            if (i != 0) {
                WalletEvent.ConnectSuccess connectSuccess = walletEvent2 instanceof WalletEvent.ConnectSuccess ? (WalletEvent.ConnectSuccess) walletEvent2 : null;
                if (connectSuccess == null || (payload = connectSuccess.getPayload()) == null || (responses = payload.getResponses()) == null) {
                    listAhwBna = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : responses) {
                        if (obj5 instanceof WalletEvent.ConnectSuccess.Payload.Response.Accounts) {
                            arrayList.add(obj5);
                        }
                    }
                    listAhwBna = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        List<WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account> accounts = ((WalletEvent.ConnectSuccess.Payload.Response.Accounts) it.next()).getAccounts();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it2 = accounts.iterator();
                        while (it2.hasNext()) {
                            C56406yEe.KWHzl(arrayList2, ((WalletEvent.ConnectSuccess.Payload.Response.Accounts.Account) it2.next()).getAddresses());
                        }
                        C56406yEe.KWHzl(listAhwBna, arrayList2);
                    }
                }
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                List list = listAhwBna;
                String strDbNXlk = abstractC12782ctV.DbNXlk();
                DAppSession dAppSession = new DAppSession(dAppConnectRequest.getClientId(), dAppConnectRequest.getTopic(), abstractC12782ctV.DbNXlk(), x25519KeyPair, dAppConnectRequest.getDAppInfo(), dAppConnectRequest.getHasLegacyTonRequest(), list, C56443yFo.KWHzl(dAppConnectRequest.getHasCosmosRequest()), dAppConnectRequest.getRedirect(), System.currentTimeMillis(), null, C56443yFo.KWHzl(System.currentTimeMillis()), 1024, null);
                this.L$0 = objM7386unboximpl;
                this.L$1 = c15935eaT5;
                this.I$0 = i;
                this.label = 2;
                if (c15935eaT5.EZpvd(strDbNXlk, dAppSession, (Continuation<? super Unit>) this) == objCopydefault) {
                    return objCopydefault;
                }
                i2 = i;
                obj2 = objM7386unboximpl;
                c15935eaT = c15935eaT5;
                c15974ebF = c15935eaT.djBIcL;
                i3 = C13754dXa.FragmentManager.getTitle;
                this.L$0 = obj2;
                this.L$1 = c15935eaT;
                this.I$0 = i2;
                this.label = 3;
                Object obj42 = obj2;
                if (C15974ebF.displayToast$default(c15974ebF, i3, false, true, false, this, 10, null) != objCopydefault) {
                }
            }
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
        if (thM7380exceptionOrNullimpl == null) {
        }
    }
}
