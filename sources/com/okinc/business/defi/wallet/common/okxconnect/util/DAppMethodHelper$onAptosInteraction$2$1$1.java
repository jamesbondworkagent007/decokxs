package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.content.Context;
import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.AptosSignType;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo;
import com.okinc.network.okg.response.ResponseData;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.AbstractC12782ctV;
import o.C13926dbm;
import o.C15974ebF;
import o.C33129mqd;
import o.C56391yDq;
import o.C56441yFm;
import o.C56442yFn;
import o.C56443yFo;
import o.C56447yFs;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$onAptosInteraction$2$1$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ String $caip2ChainId;
    final /* synthetic */ JsonObject $content;
    final /* synthetic */ DAppInfo $dAppInfo;
    final /* synthetic */ boolean $isBroadcastToBlockchain;
    final /* synthetic */ String $messageId;
    final /* synthetic */ String $walletId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C15974ebF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$onAptosInteraction$2$1$1(C15974ebF c15974ebF, String str, JsonObject jsonObject, String str2, DAppInfo dAppInfo, boolean z, String str3, Continuation<? super DAppMethodHelper$onAptosInteraction$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = c15974ebF;
        this.$caip2ChainId = str;
        this.$content = jsonObject;
        this.$walletId = str2;
        this.$dAppInfo = dAppInfo;
        this.$isBroadcastToBlockchain = z;
        this.$messageId = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DAppMethodHelper$onAptosInteraction$2$1$1(this.this$0, this.$caip2ChainId, this.$content, this.$walletId, this.$dAppInfo, this.$isBroadcastToBlockchain, this.$messageId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((DAppMethodHelper$onAptosInteraction$2$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1475=5] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objAEQbTJ;
        String content;
        Object objKWHzl;
        String str;
        String str2;
        String json;
        JsonPrimitive jsonPrimitive;
        JsonPrimitive jsonPrimitive2;
        AbstractC12782ctV abstractC12782ctV;
        Object objOLrzqt;
        String str3;
        String str4;
        JsonPrimitive jsonPrimitive3;
        JsonPrimitive jsonPrimitive4;
        JsonPrimitive jsonPrimitive5;
        JsonPrimitive jsonPrimitive6;
        String str5;
        Object objOLrzqt2;
        DappInteractionArgs dappInteractionArgs;
        int length;
        int i;
        JSONObject jSONObjectOptJSONObject;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C15974ebF c15974ebF = this.this$0;
            String str6 = this.$caip2ChainId;
            this.label = 1;
            objAEQbTJ = c15974ebF.AEQbTJ(str6, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else if (i2 == 1) {
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        } else if (i2 == 2) {
            json = (String) this.L$3;
            String str7 = (String) this.L$2;
            String str8 = (String) this.L$1;
            String str9 = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            str = str8;
            str2 = str9;
            content = str7;
            objKWHzl = obj;
            abstractC12782ctV = (AbstractC12782ctV) objKWHzl;
            if (!Intrinsics.EZpvd((Object) "raw_transaction", (Object) content)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("from", abstractC12782ctV.EZpvd(C33129mqd.valueOf(str2)));
                JsonElement jsonElement = (JsonElement) this.$content.get((Object) "payload");
                linkedHashMap.put("payload", (jsonElement == null || (jsonPrimitive6 = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive6.getContent());
                JsonElement jsonElement2 = (JsonElement) this.$content.get((Object) "maxGasAmount");
                linkedHashMap.put("maxGasAmount", (jsonElement2 == null || (jsonPrimitive5 = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : jsonPrimitive5.getContent());
                JsonElement jsonElement3 = (JsonElement) this.$content.get((Object) "gasUnitPrice");
                linkedHashMap.put("gasUnitPrice", (jsonElement3 == null || (jsonPrimitive4 = JsonElementKt.getJsonPrimitive(jsonElement3)) == null) ? null : jsonPrimitive4.getContent());
                JsonElement jsonElement4 = (JsonElement) this.$content.get((Object) "isSimpleTransaction");
                linkedHashMap.put("signType", (jsonElement4 == null || (jsonPrimitive3 = JsonElementKt.getJsonPrimitive(jsonElement4)) == null || !JsonElementKt.getBoolean(jsonPrimitive3)) ? AptosSignType.SIGN_RAW_MULTI_AGENT : AptosSignType.SIGN_RAW_SIMPLE);
                json = new Gson().toJson(linkedHashMap);
            } else if (C33129mqd.OLrzqt((CharSequence) str)) {
                Intrinsics.copydefault((Object) str);
                List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"::"}, false, 0, 6, (Object) null);
                if (listSplit$default.size() > 1) {
                    String str10 = (String) listSplit$default.get(0);
                    String str11 = (String) listSplit$default.get(1);
                    C13926dbm c13926dbm = new C13926dbm();
                    this.L$0 = str2;
                    this.L$1 = json;
                    this.L$2 = abstractC12782ctV;
                    this.L$3 = str11;
                    this.label = 3;
                    objOLrzqt = c13926dbm.OLrzqt(str10, str2, this);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    str3 = json;
                    str4 = str11;
                    JSONArray jSONArray = new JSONArray((String) ((ResponseData) objOLrzqt).getData());
                    length = jSONArray.length();
                    while (i < length) {
                    }
                    str5 = str3;
                    DappInteractionArgs dappInteractionArgs2 = new DappInteractionArgs(this.$walletId, null, str2, new PlatformItem(0L, this.$dAppInfo.getName(), this.$dAppInfo.getIcon(), (String) null, (String) null, (String) null, (List) null, (List) null, this.$dAppInfo.getUrl(), (String) null, 0L, 0, (String) null, (String) null, 16121, (DefaultConstructorMarker) null), str5, null, "okx_connect", C56443yFo.AEQbTJ(5), null, null, null, null, false, false, null, !this.$isBroadcastToBlockchain, null, null, null, null, null, null, null, null, null, null, C56443yFo.AEQbTJ(0), null, null, null, null, null, -67141886, null);
                    C15974ebF c15974ebF2 = this.this$0;
                    this.L$0 = dappInteractionArgs2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.label = 4;
                    objOLrzqt2 = c15974ebF2.OLrzqt((Continuation<? super WeakReference<Context>>) this);
                    if (objOLrzqt2 != objCopydefault) {
                    }
                }
            }
            str5 = json;
            DappInteractionArgs dappInteractionArgs22 = new DappInteractionArgs(this.$walletId, null, str2, new PlatformItem(0L, this.$dAppInfo.getName(), this.$dAppInfo.getIcon(), (String) null, (String) null, (String) null, (List) null, (List) null, this.$dAppInfo.getUrl(), (String) null, 0L, 0, (String) null, (String) null, 16121, (DefaultConstructorMarker) null), str5, null, "okx_connect", C56443yFo.AEQbTJ(5), null, null, null, null, false, false, null, !this.$isBroadcastToBlockchain, null, null, null, null, null, null, null, null, null, null, C56443yFo.AEQbTJ(0), null, null, null, null, null, -67141886, null);
            C15974ebF c15974ebF22 = this.this$0;
            this.L$0 = dappInteractionArgs22;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 4;
            objOLrzqt2 = c15974ebF22.OLrzqt((Continuation<? super WeakReference<Context>>) this);
            if (objOLrzqt2 != objCopydefault) {
            }
        } else {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return obj;
                }
                DappInteractionArgs dappInteractionArgs3 = (DappInteractionArgs) this.L$0;
                C56391yDq.AEQbTJ(obj);
                dappInteractionArgs = dappInteractionArgs3;
                objOLrzqt2 = obj;
                WeakReference weakReference = (WeakReference) objOLrzqt2;
                CoroutineDispatcher coroutineDispatcher = this.this$0.AkhnZx;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$messageId, weakReference, dappInteractionArgs, this.$isBroadcastToBlockchain, null);
                this.L$0 = null;
                this.label = 5;
                Object objWithContext = BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this);
                return objWithContext != objCopydefault ? objCopydefault : objWithContext;
            }
            str4 = (String) this.L$3;
            AbstractC12782ctV abstractC12782ctV2 = (AbstractC12782ctV) this.L$2;
            str3 = (String) this.L$1;
            str2 = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            abstractC12782ctV = abstractC12782ctV2;
            objOLrzqt = obj;
            JSONArray jSONArray2 = new JSONArray((String) ((ResponseData) objOLrzqt).getData());
            length = jSONArray2.length();
            for (i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArray2.optJSONObject(i);
                if (jSONObjectOptJSONObject2 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("abi")) != null && Intrinsics.EZpvd((Object) jSONObjectOptJSONObject.optString("name"), (Object) str4)) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("from", abstractC12782ctV.EZpvd(C33129mqd.valueOf(str2)));
                    Json json2 = this.this$0.fetchVPNInfo;
                    JsonObject jsonObject = this.$content;
                    json2.getSerializersModule();
                    linkedHashMap2.put("payload", json2.encodeToString(JsonObject.Companion.serializer(), jsonObject));
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("abi", jSONObjectOptJSONObject);
                    JSONArray jSONArray3 = new JSONArray();
                    jSONArray3.put(jSONObject);
                    linkedHashMap2.put("abi", jSONArray3.toString());
                    Json json3 = this.this$0.fetchVPNInfo;
                    json3.getSerializersModule();
                    StringSerializer stringSerializer = StringSerializer.INSTANCE;
                    json = json3.encodeToString(new LinkedHashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer)), linkedHashMap2);
                    str5 = json;
                    break;
                }
            }
            str5 = str3;
            DappInteractionArgs dappInteractionArgs222 = new DappInteractionArgs(this.$walletId, null, str2, new PlatformItem(0L, this.$dAppInfo.getName(), this.$dAppInfo.getIcon(), (String) null, (String) null, (String) null, (List) null, (List) null, this.$dAppInfo.getUrl(), (String) null, 0L, 0, (String) null, (String) null, 16121, (DefaultConstructorMarker) null), str5, null, "okx_connect", C56443yFo.AEQbTJ(5), null, null, null, null, false, false, null, !this.$isBroadcastToBlockchain, null, null, null, null, null, null, null, null, null, null, C56443yFo.AEQbTJ(0), null, null, null, null, null, -67141886, null);
            C15974ebF c15974ebF222 = this.this$0;
            this.L$0 = dappInteractionArgs222;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 4;
            objOLrzqt2 = c15974ebF222.OLrzqt((Continuation<? super WeakReference<Context>>) this);
            if (objOLrzqt2 != objCopydefault) {
                return objCopydefault;
            }
            dappInteractionArgs = dappInteractionArgs222;
            WeakReference weakReference2 = (WeakReference) objOLrzqt2;
            CoroutineDispatcher coroutineDispatcher2 = this.this$0.AkhnZx;
            AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, this.$messageId, weakReference2, dappInteractionArgs, this.$isBroadcastToBlockchain, null);
            this.L$0 = null;
            this.label = 5;
            Object objWithContext2 = BuildersKt.withContext(coroutineDispatcher2, anonymousClass12, this);
            if (objWithContext2 != objCopydefault) {
            }
        }
        String str12 = (String) objAEQbTJ;
        JsonElement jsonElement5 = (JsonElement) this.$content.get((Object) "function");
        String content2 = (jsonElement5 == null || (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement5)) == null) ? null : jsonPrimitive2.getContent();
        JsonElement jsonElement6 = (JsonElement) this.$content.get((Object) "dataType");
        content = (jsonElement6 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement6)) == null) ? null : jsonPrimitive.getContent();
        C15974ebF c15974ebF3 = this.this$0;
        String str13 = this.$walletId;
        this.L$0 = str12;
        this.L$1 = content2;
        this.L$2 = content;
        this.L$3 = "";
        this.label = 2;
        objKWHzl = c15974ebF3.KWHzl(str13, (Continuation<? super AbstractC12782ctV>) this);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        str = content2;
        str2 = str12;
        json = "";
        abstractC12782ctV = (AbstractC12782ctV) objKWHzl;
        if (!Intrinsics.EZpvd((Object) "raw_transaction", (Object) content)) {
        }
        str5 = json;
        DappInteractionArgs dappInteractionArgs2222 = new DappInteractionArgs(this.$walletId, null, str2, new PlatformItem(0L, this.$dAppInfo.getName(), this.$dAppInfo.getIcon(), (String) null, (String) null, (String) null, (List) null, (List) null, this.$dAppInfo.getUrl(), (String) null, 0L, 0, (String) null, (String) null, 16121, (DefaultConstructorMarker) null), str5, null, "okx_connect", C56443yFo.AEQbTJ(5), null, null, null, null, false, false, null, !this.$isBroadcastToBlockchain, null, null, null, null, null, null, null, null, null, null, C56443yFo.AEQbTJ(0), null, null, null, null, null, -67141886, null);
        C15974ebF c15974ebF2222 = this.this$0;
        this.L$0 = dappInteractionArgs2222;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 4;
        objOLrzqt2 = c15974ebF2222.OLrzqt((Continuation<? super WeakReference<Context>>) this);
        if (objOLrzqt2 != objCopydefault) {
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onAptosInteraction$2$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ DappInteractionArgs $args;
        final /* synthetic */ boolean $isBroadcastToBlockchain;
        final /* synthetic */ String $messageId;
        final /* synthetic */ WeakReference<Context> $weakContext;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        final /* synthetic */ C15974ebF this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C15974ebF c15974ebF, String str, WeakReference<Context> weakReference, DappInteractionArgs dappInteractionArgs, boolean z, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c15974ebF;
            this.$messageId = str;
            this.$weakContext = weakReference;
            this.$args = dappInteractionArgs;
            this.$isBroadcastToBlockchain = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$messageId, this.$weakContext, this.$args, this.$isBroadcastToBlockchain, continuation);
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
                boolean z = this.$isBroadcastToBlockchain;
                this.L$0 = c15974ebF;
                this.L$1 = str;
                this.L$2 = weakReference;
                this.L$3 = dappInteractionArgs;
                this.Z$0 = z;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
                cancellableContinuationImpl.initCancellability();
                c15974ebF.copydefault(str, cancellableContinuationImpl);
                Context context = weakReference.get();
                if (context != null) {
                    MethodHelperActivity.Companion.AEQbTJ(context, str, dappInteractionArgs, z ? "data" : "tx_sign", !z, c15974ebF);
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
