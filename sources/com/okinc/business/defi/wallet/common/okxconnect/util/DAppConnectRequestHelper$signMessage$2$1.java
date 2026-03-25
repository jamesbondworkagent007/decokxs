package com.okinc.business.defi.wallet.common.okxconnect.util;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.bean.TrxDappSignData;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaWCSignResult;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignRequest;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignResponse;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import com.okinc.network.okg.response.ResponseData;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import o.AbstractC58260yxt;
import o.AbstractC8610bFv;
import o.C13983dcq;
import o.C16013ebs;
import o.C56391yDq;
import o.C56442yFn;
import o.C8396bBt;
import o.C9748bbT;
import o.InterfaceC9740bbL;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class DAppConnectRequestHelper$signMessage$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ List<String> $accountAddresses;
    final /* synthetic */ FragmentActivity $fragmentActivity;
    final /* synthetic */ DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod $request;
    final /* synthetic */ AbstractC8610bFv<?> $signMessage;
    final /* synthetic */ C16013ebs $this_runCatching;
    int label;

    public static final class TaskDescription implements InterfaceC9740bbL.TaskDescription {
        @Override // o.InterfaceC9740bbL.TaskDescription
        public void EZpvd() {
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void copydefault() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppConnectRequestHelper$signMessage$2$1(C16013ebs c16013ebs, FragmentActivity fragmentActivity, AbstractC8610bFv<?> abstractC8610bFv, DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod connectRequestMethod, List<String> list, Continuation<? super DAppConnectRequestHelper$signMessage$2$1> continuation) {
        super(2, continuation);
        this.$this_runCatching = c16013ebs;
        this.$fragmentActivity = fragmentActivity;
        this.$signMessage = abstractC8610bFv;
        this.$request = connectRequestMethod;
        this.$accountAddresses = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppConnectRequestHelper$signMessage$2$1(this.$this_runCatching, this.$fragmentActivity, this.$signMessage, this.$request, this.$accountAddresses, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((DAppConnectRequestHelper$signMessage$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAwait;
        Object next;
        String strOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58260yxt abstractC58260yxtSubmitWithIgnoreCondition$default = C8396bBt.submitWithIgnoreCondition$default(this.$this_runCatching.DbNXlk, this.$fragmentActivity, this.$signMessage, true, false, false, false, new TaskDescription(), 32, null);
            this.label = 1;
            objAwait = RxAwaitKt.await(abstractC58260yxtSubmitWithIgnoreCondition$default, this);
            if (objAwait == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAwait = obj;
        }
        C9748bbT c9748bbT = (C9748bbT) ((ResponseData) objAwait).getData();
        String strAEQbTJ = c9748bbT != null ? c9748bbT.AEQbTJ() : null;
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        String method = this.$request.getMethod();
        switch (method.hashCode()) {
            case -2021880892:
                if (!method.equals("tron_signMessageV2")) {
                    return strAEQbTJ;
                }
                break;
            case -1073453553:
                if (!method.equals("solana_signMessage")) {
                    return strAEQbTJ;
                }
                try {
                    Json jsonOLrzqt = this.$this_runCatching.OLrzqt();
                    jsonOLrzqt.getSerializersModule();
                    return ((SolanaWCSignResult) jsonOLrzqt.decodeFromString(SolanaWCSignResult.Companion.serializer(), strAEQbTJ)).getSignature();
                } catch (Exception unused) {
                    pUU.copydefault("DAppConnectRequestHelper", "Failed to decode SolanaWCSignResult");
                    return strAEQbTJ;
                }
            case -506050796:
                if (!method.equals("aptos_signMessage")) {
                    return strAEQbTJ;
                }
                try {
                    JsonObject params = this.$request.getParams();
                    if (params == null) {
                        return strAEQbTJ;
                    }
                    List<String> list = this.$accountAddresses;
                    DAppConnectRequest.Request.RequestAccounts.ConnectRequestMethod connectRequestMethod = this.$request;
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (Intrinsics.EZpvd((Object) C13983dcq.Companion.KWHzl((String) next), (Object) connectRequestMethod.getCaipChainId())) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    String str = (String) next;
                    if (str == null || (strOLrzqt = C13983dcq.Companion.OLrzqt(str)) == null) {
                        return strAEQbTJ;
                    }
                    Json jsonOLrzqt2 = this.$this_runCatching.OLrzqt();
                    jsonOLrzqt2.getSerializersModule();
                    AptosSignRequest aptosSignRequest = (AptosSignRequest) jsonOLrzqt2.decodeFromJsonElement(AptosSignRequest.Companion.serializer(), params);
                    String fullMessage = aptosSignRequest.formatFullMessage(strOLrzqt);
                    Json jsonOLrzqt3 = this.$this_runCatching.OLrzqt();
                    String applicationUrl = aptosSignRequest.getApplicationUrl();
                    long aptosChainId = aptosSignRequest.getAptosChainId();
                    AptosSignRequest.SignData data = aptosSignRequest.getData();
                    String message = data != null ? data.getMessage() : null;
                    if (message == null) {
                        message = "";
                    }
                    AptosSignRequest.SignData data2 = aptosSignRequest.getData();
                    String nonce = data2 != null ? data2.getNonce() : null;
                    AptosSignResponse aptosSignResponse = new AptosSignResponse(strOLrzqt, applicationUrl, aptosChainId, fullMessage, message, nonce == null ? "" : nonce, aptosSignRequest.getPrefix(), strAEQbTJ);
                    jsonOLrzqt3.getSerializersModule();
                    return jsonOLrzqt3.encodeToString(AptosSignResponse.Companion.serializer(), aptosSignResponse);
                } catch (Exception unused2) {
                    pUU.copydefault("DAppConnectRequestHelper", "Failed to encode to AptosSignResponse");
                    return strAEQbTJ;
                }
            case 2071636776:
                if (!method.equals("tron_signMessage")) {
                    return strAEQbTJ;
                }
                break;
            default:
                return strAEQbTJ;
        }
        try {
            Json jsonOLrzqt4 = this.$this_runCatching.OLrzqt();
            jsonOLrzqt4.getSerializersModule();
            List<String> signature = ((TrxDappSignData) jsonOLrzqt4.decodeFromString(TrxDappSignData.Companion.serializer(), strAEQbTJ)).getSignature();
            if (signature != null) {
                String str2 = (String) CollectionsKt___CollectionsKt.firstOrNull(signature);
                if (str2 != null) {
                    return str2;
                }
            }
            return strAEQbTJ;
        } catch (Exception unused3) {
            pUU.copydefault("DAppConnectRequestHelper", "Failed to decode TrxDappSignData");
            return strAEQbTJ;
        }
    }
}
