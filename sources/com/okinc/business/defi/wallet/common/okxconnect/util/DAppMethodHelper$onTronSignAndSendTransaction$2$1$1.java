package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.content.Context;
import com.okinc.account.api.model.login.BindConst;
import com.okinc.business.defi.api.bean.DappInteractionArgs;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.C15974ebF;
import o.C33129mqd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56441yFm;
import o.C56442yFn;
import o.C56443yFo;
import o.C56447yFs;
import o.C56529yIt;
import o.C59449zhJ;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$onTronSignAndSendTransaction$2$1$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ String $caip2ChainId;
    final /* synthetic */ JsonObject $content;
    final /* synthetic */ DAppInfo $dAppInfo;
    final /* synthetic */ boolean $isBroadcastToBlockchain;
    final /* synthetic */ String $messageId;
    final /* synthetic */ String $walletId;
    Object L$0;
    int label;
    final /* synthetic */ C15974ebF this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DAppMethodHelper$onTronSignAndSendTransaction$2$1$1(C15974ebF c15974ebF, String str, DAppInfo dAppInfo, JsonObject jsonObject, boolean z, String str2, String str3, Continuation<? super DAppMethodHelper$onTronSignAndSendTransaction$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = c15974ebF;
        this.$caip2ChainId = str;
        this.$dAppInfo = dAppInfo;
        this.$content = jsonObject;
        this.$isBroadcastToBlockchain = z;
        this.$walletId = str2;
        this.$messageId = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DAppMethodHelper$onTronSignAndSendTransaction$2$1$1(this.this$0, this.$caip2ChainId, this.$dAppInfo, this.$content, this.$isBroadcastToBlockchain, this.$walletId, this.$messageId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((DAppMethodHelper$onTronSignAndSendTransaction$2$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1324=4] */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(1:(1:(1:(1:(1:(3:9|71|83)(2:10|11))(3:12|75|84))(3:13|79|80))(7:14|28|(1:47)(1:46)|48|(1:50)(1:51)|(2:53|(1:58)(1:57))|(4:76|(1:78)|79|80)(2:63|(4:72|(1:74)|75|84)(4:68|(1:70)|71|83))))(1:15))(2:16|(1:18))|19|81|20|21|24|(1:26)(12:27|28|(1:30)|47|48|(0)(0)|(0)|(1:60)|76|(0)|79|80)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009c, code lost:
    
        o.pUU.AEQbTJ("DAppMethodHelper", "Decode txToastCheckPayload failure", r0);
        r38 = "";
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0221 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objAEQbTJ;
        Object objOLrzqt;
        DappInteractionArgs dappInteractionArgs;
        WeakReference weakReference;
        JsonObject jsonObject;
        Object objWithContext;
        Object objWithContext2;
        Object objWithContext3;
        JsonPrimitive jsonPrimitive;
        JsonObject jsonObject2;
        JsonElement jsonElement;
        JsonArray jsonArray;
        JsonElement jsonElement2;
        JsonObject jsonObject3;
        JsonElement jsonElement3;
        JsonObject jsonObject4;
        JsonElement jsonElement4;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String content = "";
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15974ebF c15974ebF = this.this$0;
            String str = this.$caip2ChainId;
            this.label = 1;
            objAEQbTJ = c15974ebF.AEQbTJ(str, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C56391yDq.AEQbTJ(obj);
                        objWithContext = obj;
                        return (String) objWithContext;
                    }
                    if (i == 4) {
                        C56391yDq.AEQbTJ(obj);
                        objWithContext2 = obj;
                        return (String) objWithContext2;
                    }
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objWithContext3 = obj;
                    return (String) objWithContext3;
                }
                DappInteractionArgs dappInteractionArgs2 = (DappInteractionArgs) this.L$0;
                C56391yDq.AEQbTJ(obj);
                dappInteractionArgs = dappInteractionArgs2;
                objOLrzqt = obj;
                weakReference = (WeakReference) objOLrzqt;
                JsonElement jsonElement5 = (JsonElement) JsonElementKt.getJsonObject(this.$content).get((Object) "raw_data");
                jsonObject = (jsonElement5 != null || (jsonObject2 = JsonElementKt.getJsonObject(jsonElement5)) == null || (jsonElement = (JsonElement) jsonObject2.get((Object) "contract")) == null || (jsonArray = JsonElementKt.getJsonArray(jsonElement)) == null || (jsonElement2 = (JsonElement) CollectionsKt___CollectionsKt.firstOrNull(jsonArray)) == null || (jsonObject3 = JsonElementKt.getJsonObject(jsonElement2)) == null || (jsonElement3 = (JsonElement) jsonObject3.get((Object) "parameter")) == null || (jsonObject4 = JsonElementKt.getJsonObject(jsonElement3)) == null || (jsonElement4 = (JsonElement) jsonObject4.get((Object) "value")) == null) ? null : JsonElementKt.getJsonObject(jsonElement4);
                if ((jsonObject == null ? (JsonElement) jsonObject.get((Object) "data") : null) != null) {
                    JsonElement jsonElement6 = (JsonElement) jsonObject.get((Object) "data");
                    content = (jsonElement6 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement6)) == null) ? null : jsonPrimitive.getContent();
                }
                if (content != null || content.length() == 0) {
                    CoroutineDispatcher coroutineDispatcher = this.this$0.AkhnZx;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$messageId, weakReference, dappInteractionArgs, this.$isBroadcastToBlockchain, null);
                    this.L$0 = null;
                    this.label = 3;
                    objWithContext = BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    return (String) objWithContext;
                }
                if (C59449zhJ.startsWith$default(content, "0x095ea7b3", false, 2, null) || C59449zhJ.startsWith$default(content, "095ea7b3", false, 2, null)) {
                    CoroutineDispatcher coroutineDispatcher2 = this.this$0.AkhnZx;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$messageId, weakReference, dappInteractionArgs, this.$isBroadcastToBlockchain, null);
                    this.L$0 = null;
                    this.label = 4;
                    objWithContext2 = BuildersKt.withContext(coroutineDispatcher2, anonymousClass2, this);
                    if (objWithContext2 == objCopydefault) {
                        return objCopydefault;
                    }
                    return (String) objWithContext2;
                }
                CoroutineDispatcher coroutineDispatcher3 = this.this$0.AkhnZx;
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$messageId, weakReference, dappInteractionArgs, this.$isBroadcastToBlockchain, null);
                this.L$0 = null;
                this.label = 5;
                objWithContext3 = BuildersKt.withContext(coroutineDispatcher3, anonymousClass3, this);
                if (objWithContext3 == objCopydefault) {
                    return objCopydefault;
                }
                return (String) objWithContext3;
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        String str2 = (String) objAEQbTJ;
        Json json = this.this$0.fetchVPNInfo;
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        String strEncodeToString = json.encodeToString(BuiltinSerializersKt.MapSerializer(BuiltinSerializersKt.serializer(c56529yIt), BuiltinSerializersKt.serializer(c56529yIt)), C56424yEw.gEmmrt(C56390yDp.OLrzqt("dappUrl", this.$dAppInfo.getUrl()), C56390yDp.OLrzqt("signDataJson", C33129mqd.gEmmrt(this.$content))));
        DappInteractionArgs dappInteractionArgs3 = new DappInteractionArgs(this.$walletId, null, str2, new PlatformItem(0L, this.$dAppInfo.getName(), this.$dAppInfo.getIcon(), (String) null, (String) null, (String) null, (List) null, (List) null, this.$dAppInfo.getUrl(), (String) null, 0L, 0, (String) null, (String) null, 16121, (DefaultConstructorMarker) null), this.$content.toString(), null, "dapp", C56443yFo.AEQbTJ(2), null, null, null, null, false, false, null, !this.$isBroadcastToBlockchain, null, null, null, null, null, null, null, null, null, null, C56443yFo.AEQbTJ(6), strEncodeToString, null, null, null, null, -201359614, null);
        C15974ebF c15974ebF2 = this.this$0;
        this.L$0 = dappInteractionArgs3;
        this.label = 2;
        objOLrzqt = c15974ebF2.OLrzqt((Continuation<? super WeakReference<Context>>) this);
        if (objOLrzqt == objCopydefault) {
            return objCopydefault;
        }
        dappInteractionArgs = dappInteractionArgs3;
        weakReference = (WeakReference) objOLrzqt;
        JsonElement jsonElement52 = (JsonElement) JsonElementKt.getJsonObject(this.$content).get((Object) "raw_data");
        if (jsonElement52 != null) {
        }
        if ((jsonObject == null ? (JsonElement) jsonObject.get((Object) "data") : null) != null) {
        }
        if (content != null) {
        }
        CoroutineDispatcher coroutineDispatcher4 = this.this$0.AkhnZx;
        AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, this.$messageId, weakReference, dappInteractionArgs, this.$isBroadcastToBlockchain, null);
        this.L$0 = null;
        this.label = 3;
        objWithContext = BuildersKt.withContext(coroutineDispatcher4, anonymousClass12, this);
        if (objWithContext == objCopydefault) {
        }
        return (String) objWithContext;
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onTronSignAndSendTransaction$2$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ DappInteractionArgs $args;
        final /* synthetic */ WeakReference<Context> $context;
        final /* synthetic */ boolean $isBroadcastToBlockchain;
        final /* synthetic */ String $messageId;
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
            this.$context = weakReference;
            this.$args = dappInteractionArgs;
            this.$isBroadcastToBlockchain = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$messageId, this.$context, this.$args, this.$isBroadcastToBlockchain, continuation);
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
                WeakReference<Context> weakReference = this.$context;
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
                    MethodHelperActivity.Companion.KWHzl(context, str, dappInteractionArgs, z ? "data" : BindConst.TELEGRAM_RESULT_KEY, c15974ebF);
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onTronSignAndSendTransaction$2$1$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ DappInteractionArgs $args;
        final /* synthetic */ WeakReference<Context> $context;
        final /* synthetic */ boolean $isBroadcastToBlockchain;
        final /* synthetic */ String $messageId;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        final /* synthetic */ C15974ebF this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C15974ebF c15974ebF, String str, WeakReference<Context> weakReference, DappInteractionArgs dappInteractionArgs, boolean z, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c15974ebF;
            this.$messageId = str;
            this.$context = weakReference;
            this.$args = dappInteractionArgs;
            this.$isBroadcastToBlockchain = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$messageId, this.$context, this.$args, this.$isBroadcastToBlockchain, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C15974ebF c15974ebF = this.this$0;
                String str = this.$messageId;
                WeakReference<Context> weakReference = this.$context;
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
                    MethodHelperActivity.Companion.EZpvd(context, str, dappInteractionArgs, z ? "data" : BindConst.TELEGRAM_RESULT_KEY, c15974ebF);
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

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onTronSignAndSendTransaction$2$1$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ DappInteractionArgs $args;
        final /* synthetic */ WeakReference<Context> $context;
        final /* synthetic */ boolean $isBroadcastToBlockchain;
        final /* synthetic */ String $messageId;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        final /* synthetic */ C15974ebF this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C15974ebF c15974ebF, String str, WeakReference<Context> weakReference, DappInteractionArgs dappInteractionArgs, boolean z, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = c15974ebF;
            this.$messageId = str;
            this.$context = weakReference;
            this.$args = dappInteractionArgs;
            this.$isBroadcastToBlockchain = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, this.$messageId, this.$context, this.$args, this.$isBroadcastToBlockchain, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C15974ebF c15974ebF = this.this$0;
                String str = this.$messageId;
                WeakReference<Context> weakReference = this.$context;
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
                    MethodHelperActivity.Companion.AEQbTJ(context, str, dappInteractionArgs, z ? "data" : BindConst.TELEGRAM_RESULT_KEY, !z, c15974ebF);
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
