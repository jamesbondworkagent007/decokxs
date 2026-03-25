package com.okinc.business.defi.wallet.common.okxconnect.util;

import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo;
import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException;
import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent;
import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletInfo;
import com.okinc.business.defi.wallet.common.okxconnect.util.DAppConnectRequestHelper$getConnectRequestResponse$2;
import com.okinc.business.defi.wallet.common.tonconnect.ValidateCanConnectResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonArrayBuilder;
import kotlinx.serialization.json.JsonElementBuildersKt;
import kotlinx.serialization.json.JsonObjectBuilder;
import o.AbstractC12782ctV;
import o.C15937eaV;
import o.C16013ebs;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppConnectRequestHelper$getConnectRequestResponse$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WalletEvent>, Object> {
    final /* synthetic */ C15937eaV $connectAndSignData;
    final /* synthetic */ DAppConnectRequest $connectRequest;
    final /* synthetic */ AbstractC12782ctV $wallet;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ C16013ebs this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppConnectRequestHelper$getConnectRequestResponse$2(C15937eaV c15937eaV, DAppConnectRequest dAppConnectRequest, C16013ebs c16013ebs, AbstractC12782ctV abstractC12782ctV, Continuation<? super DAppConnectRequestHelper$getConnectRequestResponse$2> continuation) {
        super(2, continuation);
        this.$connectAndSignData = c15937eaV;
        this.$connectRequest = dAppConnectRequest;
        this.this$0 = c16013ebs;
        this.$wallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DAppConnectRequestHelper$getConnectRequestResponse$2(this.$connectAndSignData, this.$connectRequest, this.this$0, this.$wallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WalletEvent> continuation) {
        return ((DAppConnectRequestHelper$getConnectRequestResponse$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9 A[Catch: Exception -> 0x0149, TryCatch #0 {Exception -> 0x0149, blocks: (B:8:0x0038, B:44:0x0139, B:48:0x016f, B:30:0x00d3, B:32:0x00d9, B:35:0x00e9, B:38:0x00f2, B:40:0x00f6, B:47:0x014c, B:49:0x0177, B:51:0x017d, B:60:0x01b4, B:62:0x01b8, B:71:0x0210, B:65:0x01bf, B:66:0x01c3, B:68:0x01c9, B:70:0x01d5, B:54:0x0184, B:55:0x0188, B:57:0x018e, B:59:0x019a, B:13:0x004e, B:29:0x00aa, B:26:0x0081), top: B:75:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0177 A[Catch: Exception -> 0x0149, TryCatch #0 {Exception -> 0x0149, blocks: (B:8:0x0038, B:44:0x0139, B:48:0x016f, B:30:0x00d3, B:32:0x00d9, B:35:0x00e9, B:38:0x00f2, B:40:0x00f6, B:47:0x014c, B:49:0x0177, B:51:0x017d, B:60:0x01b4, B:62:0x01b8, B:71:0x0210, B:65:0x01bf, B:66:0x01c3, B:68:0x01c9, B:70:0x01d5, B:54:0x0184, B:55:0x0188, B:57:0x018e, B:59:0x019a, B:13:0x004e, B:29:0x00aa, B:26:0x0081), top: B:75:0x000c }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e3 -> B:48:0x016f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00ed -> B:48:0x016f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x012e -> B:44:0x0139). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x014c -> B:48:0x016f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault;
        WalletEvent.ConnectSuccess.Payload.Response responseAEQbTJ;
        Object objKWHzl;
        Iterator it;
        C15937eaV c15937eaV;
        Collection collection;
        AbstractC12782ctV abstractC12782ctV;
        DAppConnectRequest dAppConnectRequest;
        WalletEvent.ConnectSuccess.Payload.Response error;
        C16013ebs c16013ebs;
        WalletEvent.ConnectSuccess.Payload.Response response;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                if (this.$connectAndSignData != null && this.$connectRequest.isStarknetRequired()) {
                    C16013ebs c16013ebs2 = this.this$0;
                    AbstractC12782ctV abstractC12782ctV2 = this.$wallet;
                    this.label = 1;
                    objCopydefault = c16013ebs2.copydefault(9004L, abstractC12782ctV2, (Continuation<? super ValidateCanConnectResult>) this);
                    if (objCopydefault == objCopydefault2) {
                        return objCopydefault2;
                    }
                }
                responseAEQbTJ = this.this$0.AEQbTJ(this.$wallet, this.$connectRequest.getFirstTonAddrRequest());
                C16013ebs c16013ebs3 = this.this$0;
                AbstractC12782ctV abstractC12782ctV3 = this.$wallet;
                DAppConnectRequest.Request.TonProof firstTonProofRequest = this.$connectRequest.getFirstTonProofRequest();
                DAppInfo dAppInfo = this.$connectRequest.getDAppInfo();
                this.L$0 = responseAEQbTJ;
                this.label = 2;
                objKWHzl = c16013ebs3.KWHzl(abstractC12782ctV3, firstTonProofRequest, dAppInfo, (Continuation<? super WalletEvent.ConnectSuccess.Payload.Response>) this);
                if (objKWHzl == objCopydefault2) {
                    return objCopydefault2;
                }
                Set<DAppConnectRequest.Request> requests = this.$connectRequest.getRequests();
                C16013ebs c16013ebs4 = this.this$0;
                AbstractC12782ctV abstractC12782ctV4 = this.$wallet;
                DAppConnectRequest dAppConnectRequest2 = this.$connectRequest;
                C15937eaV c15937eaV2 = this.$connectAndSignData;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(requests, 10));
                it = requests.iterator();
                c15937eaV = c15937eaV2;
                collection = arrayList;
                abstractC12782ctV = abstractC12782ctV4;
                dAppConnectRequest = dAppConnectRequest2;
                error = (WalletEvent.ConnectSuccess.Payload.Response) objKWHzl;
                c16013ebs = c16013ebs4;
                response = responseAEQbTJ;
                if (it.hasNext()) {
                }
            } else if (i == 1) {
                C56391yDq.AEQbTJ(obj);
                objCopydefault = obj;
            } else if (i == 2) {
                responseAEQbTJ = (WalletEvent.ConnectSuccess.Payload.Response) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objKWHzl = obj;
                Set<DAppConnectRequest.Request> requests2 = this.$connectRequest.getRequests();
                C16013ebs c16013ebs42 = this.this$0;
                AbstractC12782ctV abstractC12782ctV42 = this.$wallet;
                DAppConnectRequest dAppConnectRequest22 = this.$connectRequest;
                C15937eaV c15937eaV22 = this.$connectAndSignData;
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(requests2, 10));
                it = requests2.iterator();
                c15937eaV = c15937eaV22;
                collection = arrayList2;
                abstractC12782ctV = abstractC12782ctV42;
                dAppConnectRequest = dAppConnectRequest22;
                error = (WalletEvent.ConnectSuccess.Payload.Response) objKWHzl;
                c16013ebs = c16013ebs42;
                response = responseAEQbTJ;
                if (it.hasNext()) {
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Collection collection2 = (Collection) this.L$8;
                Iterator it2 = (Iterator) this.L$7;
                Collection collection3 = (Collection) this.L$6;
                C15937eaV c15937eaV3 = (C15937eaV) this.L$5;
                DAppConnectRequest dAppConnectRequest3 = (DAppConnectRequest) this.L$4;
                AbstractC12782ctV abstractC12782ctV5 = (AbstractC12782ctV) this.L$3;
                C16013ebs c16013ebs5 = (C16013ebs) this.L$2;
                WalletEvent.ConnectSuccess.Payload.Response response2 = (WalletEvent.ConnectSuccess.Payload.Response) this.L$1;
                WalletEvent.ConnectSuccess.Payload.Response response3 = (WalletEvent.ConnectSuccess.Payload.Response) this.L$0;
                C56391yDq.AEQbTJ(obj);
                WalletEvent.ConnectSuccess.Payload.Response response4 = response3;
                collection = collection2;
                Object objEZpvd = obj;
                it = it2;
                c15937eaV = c15937eaV3;
                WalletEvent.ConnectSuccess.Payload.Response response5 = response2;
                response = response4;
                dAppConnectRequest = dAppConnectRequest3;
                error = (WalletEvent.ConnectSuccess.Payload.Response) objEZpvd;
                C16013ebs c16013ebs6 = c16013ebs5;
                abstractC12782ctV = abstractC12782ctV5;
                c16013ebs = c16013ebs6;
                collection.add(error);
                collection = collection3;
                error = response5;
                if (it.hasNext()) {
                    DAppConnectRequest.Request request = (DAppConnectRequest.Request) it.next();
                    if (request instanceof DAppConnectRequest.Request.TonAddress) {
                        response5 = error;
                        collection3 = collection;
                        error = response;
                    } else if (request instanceof DAppConnectRequest.Request.TonProof) {
                        response5 = error;
                        collection3 = collection;
                    } else if (request instanceof DAppConnectRequest.Request.RequestAccounts) {
                        this.L$0 = response;
                        this.L$1 = error;
                        this.L$2 = c16013ebs;
                        this.L$3 = abstractC12782ctV;
                        this.L$4 = dAppConnectRequest;
                        this.L$5 = c15937eaV;
                        this.L$6 = collection;
                        this.L$7 = it;
                        this.L$8 = collection;
                        this.label = 3;
                        response4 = response;
                        WalletEvent.ConnectSuccess.Payload.Response response6 = error;
                        C16013ebs c16013ebs7 = c16013ebs;
                        AbstractC12782ctV abstractC12782ctV6 = abstractC12782ctV;
                        DAppConnectRequest dAppConnectRequest4 = dAppConnectRequest;
                        objEZpvd = c16013ebs.EZpvd(abstractC12782ctV, dAppConnectRequest.getDAppInfo(), (DAppConnectRequest.Request.RequestAccounts) request, response4, response6, c15937eaV, this);
                        if (objEZpvd == objCopydefault2) {
                            return objCopydefault2;
                        }
                        collection3 = collection;
                        it2 = it;
                        c15937eaV3 = c15937eaV;
                        response2 = response6;
                        c16013ebs5 = c16013ebs7;
                        abstractC12782ctV5 = abstractC12782ctV6;
                        dAppConnectRequest3 = dAppConnectRequest4;
                        it = it2;
                        c15937eaV = c15937eaV3;
                        WalletEvent.ConnectSuccess.Payload.Response response52 = response2;
                        response = response4;
                        dAppConnectRequest = dAppConnectRequest3;
                        error = (WalletEvent.ConnectSuccess.Payload.Response) objEZpvd;
                        C16013ebs c16013ebs62 = c16013ebs5;
                        abstractC12782ctV = abstractC12782ctV5;
                        c16013ebs = c16013ebs62;
                    } else {
                        response52 = error;
                        error = new WalletEvent.ConnectSuccess.Payload.Response.Error(request.getName(), new OKXConnectException(OKXConnectException.ErrorType.METHOD_NOT_SUPPORTED, (String) null, 2, (DefaultConstructorMarker) null));
                        collection3 = collection;
                        response = response;
                        c16013ebs = c16013ebs;
                        abstractC12782ctV = abstractC12782ctV;
                        dAppConnectRequest = dAppConnectRequest;
                    }
                    collection.add(error);
                    collection = collection3;
                    error = response52;
                    if (it.hasNext()) {
                        List list = (List) collection;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it3 = list.iterator();
                            while (it3.hasNext()) {
                                if (((WalletEvent.ConnectSuccess.Payload.Response) it3.next()).isUserReject()) {
                                    return new WalletEvent.ConnectError(this.$connectRequest.getRequestId(), (String) null, new OKXConnectException(OKXConnectException.ErrorType.USER_REJECTED, (String) null, 2, (DefaultConstructorMarker) null), (WalletInfo) null, 10, (DefaultConstructorMarker) null);
                                }
                            }
                        }
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator it4 = list.iterator();
                            while (it4.hasNext()) {
                                if (!((WalletEvent.ConnectSuccess.Payload.Response) it4.next()).isErrorResponse()) {
                                    String requestId = this.$connectRequest.getRequestId();
                                    JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                                    JsonElementBuildersKt.putJsonArray(jsonObjectBuilder, "ton", new Function1() { // from class: o.ebA
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj2) {
                                            return DAppConnectRequestHelper$getConnectRequestResponse$2.invokeSuspend$lambda$4$lambda$3((JsonArrayBuilder) obj2);
                                        }
                                    });
                                    Unit unit = Unit.INSTANCE;
                                    return new WalletEvent.ConnectSuccess(requestId, (String) null, new WalletEvent.ConnectSuccess.Payload(list, new WalletInfo((String) null, (String) null, (String) null, 0, jsonObjectBuilder.build(), 15, (DefaultConstructorMarker) null)), 2, (DefaultConstructorMarker) null);
                                }
                            }
                        }
                        String requestId2 = this.$connectRequest.getRequestId();
                        Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(list);
                        Intrinsics.copydefault(objFirstOrNull, "");
                        return new WalletEvent.ConnectError(requestId2, (String) null, ((WalletEvent.ConnectSuccess.Payload.Response.Error) objFirstOrNull).getError(), (WalletInfo) null, 10, (DefaultConstructorMarker) null);
                    }
                }
            }
            if (!((ValidateCanConnectResult) objCopydefault).AEQbTJ()) {
                return null;
            }
            responseAEQbTJ = this.this$0.AEQbTJ(this.$wallet, this.$connectRequest.getFirstTonAddrRequest());
            C16013ebs c16013ebs32 = this.this$0;
            AbstractC12782ctV abstractC12782ctV32 = this.$wallet;
            DAppConnectRequest.Request.TonProof firstTonProofRequest2 = this.$connectRequest.getFirstTonProofRequest();
            DAppInfo dAppInfo2 = this.$connectRequest.getDAppInfo();
            this.L$0 = responseAEQbTJ;
            this.label = 2;
            objKWHzl = c16013ebs32.KWHzl(abstractC12782ctV32, firstTonProofRequest2, dAppInfo2, (Continuation<? super WalletEvent.ConnectSuccess.Payload.Response>) this);
            if (objKWHzl == objCopydefault2) {
            }
            Set<DAppConnectRequest.Request> requests22 = this.$connectRequest.getRequests();
            C16013ebs c16013ebs422 = this.this$0;
            AbstractC12782ctV abstractC12782ctV422 = this.$wallet;
            DAppConnectRequest dAppConnectRequest222 = this.$connectRequest;
            C15937eaV c15937eaV222 = this.$connectAndSignData;
            ArrayList arrayList22 = new ArrayList(C56403yEb.AYXKKw(requests22, 10));
            it = requests22.iterator();
            c15937eaV = c15937eaV222;
            collection = arrayList22;
            abstractC12782ctV = abstractC12782ctV422;
            dAppConnectRequest = dAppConnectRequest222;
            error = (WalletEvent.ConnectSuccess.Payload.Response) objKWHzl;
            c16013ebs = c16013ebs422;
            response = responseAEQbTJ;
            if (it.hasNext()) {
            }
        } catch (Exception e) {
            pUU.AEQbTJ("DAppConnectRequestHelper", "Failed to get ton address: " + e.getMessage(), e);
            return new WalletEvent.ConnectError(this.$connectRequest.getRequestId(), (String) null, new OKXConnectException(OKXConnectException.ErrorType.BAD_REQUEST, (String) null, 2, (DefaultConstructorMarker) null), (WalletInfo) null, 10, (DefaultConstructorMarker) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$4$lambda$3(JsonArrayBuilder jsonArrayBuilder) {
        JsonElementBuildersKt.add(jsonArrayBuilder, "ton_sendTransaction");
        return Unit.INSTANCE;
    }
}
