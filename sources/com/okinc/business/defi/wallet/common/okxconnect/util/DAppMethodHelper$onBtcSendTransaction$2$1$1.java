package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.content.Context;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.api.model.tx.signdata.BRC20MintSignData;
import com.okinc.business.defi.api.model.tx.signdata.RunesTransferSignData;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo;
import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.p2p.api.OtcExtraKeys;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.AbstractC12782ctV;
import o.C10525bqB;
import o.C10854bwM;
import o.C10954byG;
import o.C15974ebF;
import o.C33129mqd;
import o.C33490mxT;
import o.C56391yDq;
import o.C56403yEb;
import o.C56424yEw;
import o.C56441yFm;
import o.C56442yFn;
import o.C56443yFo;
import o.C56447yFs;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$onBtcSendTransaction$2$1$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ int $bizType;
    final /* synthetic */ String $caip2ChainId;
    final /* synthetic */ DAppInfo $dAppInfo;
    final /* synthetic */ String $messageId;
    final /* synthetic */ JsonObject $param;
    final /* synthetic */ String $walletId;
    Object L$0;
    int label;
    final /* synthetic */ C15974ebF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$onBtcSendTransaction$2$1$1(C15974ebF c15974ebF, String str, int i, JsonObject jsonObject, String str2, DAppInfo dAppInfo, String str3, Continuation<? super DAppMethodHelper$onBtcSendTransaction$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = c15974ebF;
        this.$caip2ChainId = str;
        this.$bizType = i;
        this.$param = jsonObject;
        this.$walletId = str2;
        this.$dAppInfo = dAppInfo;
        this.$messageId = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DAppMethodHelper$onBtcSendTransaction$2$1$1(this.this$0, this.$caip2ChainId, this.$bizType, this.$param, this.$walletId, this.$dAppInfo, this.$messageId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((DAppMethodHelper$onBtcSendTransaction$2$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1157=4] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0369 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0388 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0126  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objAEQbTJ;
        String str;
        String strEncodeToString;
        JsonPrimitive jsonPrimitive;
        String content;
        JsonPrimitive jsonPrimitive2;
        JsonPrimitive jsonPrimitive3;
        JsonPrimitive jsonPrimitive4;
        JsonPrimitive jsonPrimitive5;
        JsonPrimitive jsonPrimitive6;
        String content2;
        JsonPrimitive jsonPrimitive7;
        JsonPrimitive jsonPrimitive8;
        JsonPrimitive jsonPrimitive9;
        Object objKWHzl;
        JsonArray jsonArray;
        JsonElement jsonElement;
        JsonObject jsonObject;
        JsonElement jsonElement2;
        JsonPrimitive jsonPrimitive10;
        String content3;
        DappInteractionArgs dappInteractionArgs;
        Object objOLrzqt;
        JsonElement jsonElement3;
        ArrayList arrayList;
        JsonArray jsonArray2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        int iAhwBna = 1;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15974ebF c15974ebF = this.this$0;
            String str2 = this.$caip2ChainId;
            this.label = 1;
            objAEQbTJ = c15974ebF.AEQbTJ(str2, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        } else {
            if (i == 2) {
                C56391yDq.AEQbTJ(obj);
                throw new OKXConnectException(OKXConnectException.ErrorType.METHOD_NOT_SUPPORTED, (String) null, 2, (DefaultConstructorMarker) null);
            }
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return obj;
                }
                dappInteractionArgs = (DappInteractionArgs) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                DappInteractionArgs dappInteractionArgs2 = dappInteractionArgs;
                CoroutineDispatcher coroutineDispatcher = this.this$0.AkhnZx;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$messageId, (WeakReference) objOLrzqt, dappInteractionArgs2, null);
                this.L$0 = null;
                this.label = 5;
                Object objWithContext = BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this);
                return objWithContext != objCopydefault ? objCopydefault : objWithContext;
            }
            str = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = obj;
            C10525bqB c10525bqBAEQbTJ = ((AbstractC12782ctV) objKWHzl).AEQbTJ(C33129mqd.valueOf(str));
            Long lKWHzl = c10525bqBAEQbTJ == null ? C56443yFo.KWHzl(c10525bqBAEQbTJ.OLrzqt()) : null;
            jsonElement3 = (JsonElement) this.$param.get((Object) "batchBean");
            if (jsonElement3 != null || (jsonArray2 = JsonElementKt.getJsonArray(jsonElement3)) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(C56403yEb.AYXKKw(jsonArray2, 10));
                Iterator<JsonElement> it = jsonArray2.iterator();
                while (it.hasNext()) {
                    Map mapIsConnected = C56424yEw.isConnected(JsonElementKt.getJsonObject(it.next()));
                    mapIsConnected.put("coinId", JsonElementKt.JsonPrimitive(lKWHzl));
                    arrayList.add(new JsonObject(mapIsConnected));
                }
            }
            Map mapIsConnected2 = C56424yEw.isConnected(this.$param);
            if (arrayList != null) {
                mapIsConnected2.put("batchBean", new JsonArray(arrayList));
            }
            JsonObject jsonObject2 = new JsonObject(mapIsConnected2);
            Json json = this.this$0.fetchVPNInfo;
            json.getSerializersModule();
            strEncodeToString = json.encodeToString(JsonObject.Companion.serializer(), jsonObject2);
            dappInteractionArgs = new DappInteractionArgs(this.$walletId, null, str, new PlatformItem(0L, this.$dAppInfo.getName(), this.$dAppInfo.getIcon(), (String) null, (String) null, (String) null, (List) null, (List) null, this.$dAppInfo.getUrl(), (String) null, 0L, 0, (String) null, (String) null, 16121, (DefaultConstructorMarker) null), strEncodeToString, null, "okx_connect", C56443yFo.AEQbTJ(5), null, null, null, null, false, false, null, false, null, null, null, C56443yFo.AEQbTJ(this.$bizType), null, null, null, null, null, null, C56443yFo.AEQbTJ(0), null, null, null, null, null, -67633374, null);
            C15974ebF c15974ebF2 = this.this$0;
            this.L$0 = dappInteractionArgs;
            this.label = 4;
            objOLrzqt = c15974ebF2.OLrzqt((Continuation<? super WeakReference<Context>>) this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            DappInteractionArgs dappInteractionArgs22 = dappInteractionArgs;
            CoroutineDispatcher coroutineDispatcher2 = this.this$0.AkhnZx;
            AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, this.$messageId, (WeakReference) objOLrzqt, dappInteractionArgs22, null);
            this.L$0 = null;
            this.label = 5;
            Object objWithContext2 = BuildersKt.withContext(coroutineDispatcher2, anonymousClass12, this);
            if (objWithContext2 != objCopydefault) {
            }
        }
        str = (String) objAEQbTJ;
        int i2 = this.$bizType;
        if (i2 == 10) {
            JsonElement jsonElement4 = (JsonElement) this.$param.get((Object) "batchBean");
            Integer intOrNull = (jsonElement4 == null || (jsonArray = JsonElementKt.getJsonArray(jsonElement4)) == null || (jsonElement = (JsonElement) CollectionsKt___CollectionsKt.firstOrNull(jsonArray)) == null || (jsonObject = JsonElementKt.getJsonObject(jsonElement)) == null || (jsonElement2 = (JsonElement) jsonObject.get((Object) "protocolId")) == null || (jsonPrimitive10 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null || (content3 = jsonPrimitive10.getContent()) == null) ? null : StringsKt__StringNumberConversionsKt.toIntOrNull(content3);
            if ((intOrNull != null && intOrNull.intValue() == 8) || (intOrNull != null && intOrNull.intValue() == 2)) {
                C15974ebF c15974ebF3 = this.this$0;
                this.label = 2;
                if (DAppMethodHelper$onBtcSendTransaction$2.invokeSuspend$showUnsupportedDialog(c15974ebF3, this) == objCopydefault) {
                    return objCopydefault;
                }
                throw new OKXConnectException(OKXConnectException.ErrorType.METHOD_NOT_SUPPORTED, (String) null, 2, (DefaultConstructorMarker) null);
            }
            C15974ebF c15974ebF4 = this.this$0;
            String str3 = this.$walletId;
            this.L$0 = str;
            this.label = 3;
            objKWHzl = c15974ebF4.KWHzl(str3, (Continuation<? super AbstractC12782ctV>) this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            C10525bqB c10525bqBAEQbTJ2 = ((AbstractC12782ctV) objKWHzl).AEQbTJ(C33129mqd.valueOf(str));
            if (c10525bqBAEQbTJ2 == null) {
            }
            jsonElement3 = (JsonElement) this.$param.get((Object) "batchBean");
            if (jsonElement3 != null) {
                arrayList = null;
                Map mapIsConnected22 = C56424yEw.isConnected(this.$param);
                if (arrayList != null) {
                }
                JsonObject jsonObject22 = new JsonObject(mapIsConnected22);
                Json json2 = this.this$0.fetchVPNInfo;
                json2.getSerializersModule();
                strEncodeToString = json2.encodeToString(JsonObject.Companion.serializer(), jsonObject22);
                dappInteractionArgs = new DappInteractionArgs(this.$walletId, null, str, new PlatformItem(0L, this.$dAppInfo.getName(), this.$dAppInfo.getIcon(), (String) null, (String) null, (String) null, (List) null, (List) null, this.$dAppInfo.getUrl(), (String) null, 0L, 0, (String) null, (String) null, 16121, (DefaultConstructorMarker) null), strEncodeToString, null, "okx_connect", C56443yFo.AEQbTJ(5), null, null, null, null, false, false, null, false, null, null, null, C56443yFo.AEQbTJ(this.$bizType), null, null, null, null, null, null, C56443yFo.AEQbTJ(0), null, null, null, null, null, -67633374, null);
                C15974ebF c15974ebF22 = this.this$0;
                this.L$0 = dappInteractionArgs;
                this.label = 4;
                objOLrzqt = c15974ebF22.OLrzqt((Continuation<? super WeakReference<Context>>) this);
                if (objOLrzqt == objCopydefault) {
                }
            }
            DappInteractionArgs dappInteractionArgs222 = dappInteractionArgs;
            CoroutineDispatcher coroutineDispatcher22 = this.this$0.AkhnZx;
            AnonymousClass1 anonymousClass122 = new AnonymousClass1(this.this$0, this.$messageId, (WeakReference) objOLrzqt, dappInteractionArgs222, null);
            this.L$0 = null;
            this.label = 5;
            Object objWithContext22 = BuildersKt.withContext(coroutineDispatcher22, anonymousClass122, this);
            if (objWithContext22 != objCopydefault) {
            }
        } else {
            int iAhwBna2 = 13;
            if (i2 == 13) {
                JsonElement jsonElement5 = (JsonElement) this.$param.get((Object) RemoteMessageConst.Notification.TICKER);
                String content4 = (jsonElement5 == null || (jsonPrimitive9 = JsonElementKt.getJsonPrimitive(jsonElement5)) == null) ? null : jsonPrimitive9.getContent();
                JsonElement jsonElement6 = (JsonElement) this.$param.get((Object) OtcExtraKeys.AMOUNT);
                String content5 = (jsonElement6 == null || (jsonPrimitive8 = JsonElementKt.getJsonPrimitive(jsonElement6)) == null) ? null : jsonPrimitive8.getContent();
                JsonElement jsonElement7 = (JsonElement) this.$param.get((Object) "fromAddress");
                String content6 = (jsonElement7 == null || (jsonPrimitive7 = JsonElementKt.getJsonPrimitive(jsonElement7)) == null) ? null : jsonPrimitive7.getContent();
                String str4 = content6 == null ? "" : content6;
                JsonElement jsonElement8 = (JsonElement) this.$param.get((Object) "protocolId");
                if (jsonElement8 != null && (jsonPrimitive6 = JsonElementKt.getJsonPrimitive(jsonElement8)) != null && (content2 = jsonPrimitive6.getContent()) != null) {
                    iAhwBna = C33129mqd.AhwBna(content2);
                }
                int i3 = iAhwBna;
                C10854bwM c10854bwMCopydefault = C10954byG.EZpvd.valueOf().copydefault(C33129mqd.valueOf(str));
                strEncodeToString = C33490mxT.OLrzqt(new BRC20MintSignData(c10854bwMCopydefault != null ? C56443yFo.KWHzl(c10854bwMCopydefault.AhwBna()) : null, str4, str4, content5 == null ? "" : content5, false, false, null, i3, 9, null, null, content4 == null ? "" : content4, 1536, null));
            } else if (i2 == 14) {
                JsonElement jsonElement9 = (JsonElement) this.$param.get((Object) WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
                String content7 = (jsonElement9 == null || (jsonPrimitive5 = JsonElementKt.getJsonPrimitive(jsonElement9)) == null) ? null : jsonPrimitive5.getContent();
                JsonElement jsonElement10 = (JsonElement) this.$param.get((Object) "runeid");
                String content8 = (jsonElement10 == null || (jsonPrimitive4 = JsonElementKt.getJsonPrimitive(jsonElement10)) == null) ? null : jsonPrimitive4.getContent();
                JsonElement jsonElement11 = (JsonElement) this.$param.get((Object) OtcExtraKeys.AMOUNT);
                String content9 = (jsonElement11 == null || (jsonPrimitive3 = JsonElementKt.getJsonPrimitive(jsonElement11)) == null) ? null : jsonPrimitive3.getContent();
                JsonElement jsonElement12 = (JsonElement) this.$param.get((Object) "fromAddress");
                String content10 = (jsonElement12 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement12)) == null) ? null : jsonPrimitive2.getContent();
                String str5 = content10 == null ? "" : content10;
                JsonElement jsonElement13 = (JsonElement) this.$param.get((Object) "protocolId");
                if (jsonElement13 != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement13)) != null && (content = jsonPrimitive.getContent()) != null) {
                    iAhwBna2 = C33129mqd.AhwBna(content);
                }
                int i4 = iAhwBna2;
                C10854bwM c10854bwMCopydefault2 = C10954byG.EZpvd.valueOf().copydefault(C33129mqd.valueOf(str));
                strEncodeToString = C33490mxT.OLrzqt(new RunesTransferSignData(c10854bwMCopydefault2 != null ? c10854bwMCopydefault2.AhwBna() : -1L, content8 == null ? "" : content8, i4, str5, content7 == null ? "" : content7, content9 == null ? "" : content9, false, false, null));
            } else {
                Json json3 = this.this$0.fetchVPNInfo;
                JsonObject jsonObject3 = this.$param;
                json3.getSerializersModule();
                strEncodeToString = json3.encodeToString(JsonObject.Companion.serializer(), jsonObject3);
            }
            dappInteractionArgs = new DappInteractionArgs(this.$walletId, null, str, new PlatformItem(0L, this.$dAppInfo.getName(), this.$dAppInfo.getIcon(), (String) null, (String) null, (String) null, (List) null, (List) null, this.$dAppInfo.getUrl(), (String) null, 0L, 0, (String) null, (String) null, 16121, (DefaultConstructorMarker) null), strEncodeToString, null, "okx_connect", C56443yFo.AEQbTJ(5), null, null, null, null, false, false, null, false, null, null, null, C56443yFo.AEQbTJ(this.$bizType), null, null, null, null, null, null, C56443yFo.AEQbTJ(0), null, null, null, null, null, -67633374, null);
            C15974ebF c15974ebF222 = this.this$0;
            this.L$0 = dappInteractionArgs;
            this.label = 4;
            objOLrzqt = c15974ebF222.OLrzqt((Continuation<? super WeakReference<Context>>) this);
            if (objOLrzqt == objCopydefault) {
            }
            DappInteractionArgs dappInteractionArgs2222 = dappInteractionArgs;
            CoroutineDispatcher coroutineDispatcher222 = this.this$0.AkhnZx;
            AnonymousClass1 anonymousClass1222 = new AnonymousClass1(this.this$0, this.$messageId, (WeakReference) objOLrzqt, dappInteractionArgs2222, null);
            this.L$0 = null;
            this.label = 5;
            Object objWithContext222 = BuildersKt.withContext(coroutineDispatcher222, anonymousClass1222, this);
            if (objWithContext222 != objCopydefault) {
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onBtcSendTransaction$2$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ DappInteractionArgs $args;
        final /* synthetic */ String $messageId;
        final /* synthetic */ WeakReference<Context> $weakContext;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final /* synthetic */ C15974ebF this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C15974ebF c15974ebF, String str, WeakReference<Context> weakReference, DappInteractionArgs dappInteractionArgs, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c15974ebF;
            this.$messageId = str;
            this.$weakContext = weakReference;
            this.$args = dappInteractionArgs;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$messageId, this.$weakContext, this.$args, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C15974ebF c15974ebF = this.this$0;
                String str = this.$messageId;
                WeakReference<Context> weakReference = this.$weakContext;
                DappInteractionArgs dappInteractionArgs = this.$args;
                this.L$0 = c15974ebF;
                this.L$1 = str;
                this.L$2 = weakReference;
                this.L$3 = dappInteractionArgs;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
                cancellableContinuationImpl.initCancellability();
                c15974ebF.copydefault(str, cancellableContinuationImpl);
                Context context = weakReference.get();
                if (context != null) {
                    MethodHelperActivity.Companion.copydefault(context, str, dappInteractionArgs, "tx_hash", c15974ebF);
                } else {
                    c15974ebF.OLrzqt(str, "");
                }
                obj = cancellableContinuationImpl.getResult();
                if (obj == C56442yFn.copydefault()) {
                    C56447yFs.copydefault(this);
                }
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return obj;
        }
    }
}
