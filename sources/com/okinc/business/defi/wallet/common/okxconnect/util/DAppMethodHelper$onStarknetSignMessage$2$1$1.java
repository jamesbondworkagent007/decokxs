package com.okinc.business.defi.wallet.common.okxconnect.util;

import android.content.Context;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.api.bean.PlatformItem;
import com.okinc.business.defi.wallet.common.okxconnect.model.DAppInfo;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.AbstractC12782ctV;
import o.C15974ebF;
import o.C56391yDq;
import o.C56424yEw;
import o.C56441yFm;
import o.C56442yFn;
import o.C56443yFo;
import o.C56447yFs;

/* JADX INFO: loaded from: classes4.dex */
public final class DAppMethodHelper$onStarknetSignMessage$2$1$1 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ String $caip2ChainId;
    final /* synthetic */ JsonObject $content;
    final /* synthetic */ DAppInfo $dAppInfo;
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
    public DAppMethodHelper$onStarknetSignMessage$2$1$1(C15974ebF c15974ebF, String str, JsonObject jsonObject, DAppInfo dAppInfo, String str2, String str3, Continuation<? super DAppMethodHelper$onStarknetSignMessage$2$1$1> continuation) {
        super(1, continuation);
        this.this$0 = c15974ebF;
        this.$caip2ChainId = str;
        this.$content = jsonObject;
        this.$dAppInfo = dAppInfo;
        this.$walletId = str2;
        this.$messageId = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new DAppMethodHelper$onStarknetSignMessage$2$1$1(this.this$0, this.$caip2ChainId, this.$content, this.$dAppInfo, this.$walletId, this.$messageId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((DAppMethodHelper$onStarknetSignMessage$2$1$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objAEQbTJ;
        JsonObject jsonObject;
        String str;
        Map mapIsConnected;
        Object objKWHzl;
        String str2;
        Map map;
        String str3;
        JsonPrimitive jsonPrimitive;
        DappSignArgs dappSignArgs;
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C15974ebF c15974ebF = this.this$0;
            String str4 = this.$caip2ChainId;
            this.label = 1;
            objAEQbTJ = c15974ebF.AEQbTJ(str4, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return obj;
                }
                dappSignArgs = (DappSignArgs) this.L$0;
                C56391yDq.AEQbTJ(obj);
                objOLrzqt = obj;
                DappSignArgs dappSignArgs2 = dappSignArgs;
                CoroutineDispatcher coroutineDispatcher = this.this$0.AkhnZx;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$messageId, (WeakReference) objOLrzqt, dappSignArgs2, null);
                this.L$0 = null;
                this.label = 4;
                Object objWithContext = BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this);
                return objWithContext != objCopydefault ? objCopydefault : objWithContext;
            }
            mapIsConnected = (Map) this.L$3;
            String str5 = (String) this.L$2;
            Map map2 = (Map) this.L$1;
            String str6 = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
            str2 = str6;
            map = map2;
            str = str5;
            objKWHzl = obj;
            mapIsConnected.put(str, JsonElementKt.JsonPrimitive(((AbstractC12782ctV) objKWHzl).EZpvd(9004L)));
            jsonObject = new JsonObject(map);
            str3 = str2;
            dappSignArgs = new DappSignArgs(this.$walletId, str3, new PlatformItem(0L, this.$dAppInfo.getName(), this.$dAppInfo.getIcon(), (String) null, (String) null, (String) null, (List) null, (List) null, this.$dAppInfo.getUrl(), (String) null, 0L, 0, (String) null, (String) null, 16121, (DefaultConstructorMarker) null), jsonObject.toString(), false, C56443yFo.AEQbTJ(5), "okx_connect", null, false, false, null, null, null, null, null, false, null, 130944, null);
            C15974ebF c15974ebF2 = this.this$0;
            this.L$0 = dappSignArgs;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            objOLrzqt = c15974ebF2.OLrzqt((Continuation<? super WeakReference<Context>>) this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            DappSignArgs dappSignArgs22 = dappSignArgs;
            CoroutineDispatcher coroutineDispatcher2 = this.this$0.AkhnZx;
            AnonymousClass1 anonymousClass12 = new AnonymousClass1(this.this$0, this.$messageId, (WeakReference) objOLrzqt, dappSignArgs22, null);
            this.L$0 = null;
            this.label = 4;
            Object objWithContext2 = BuildersKt.withContext(coroutineDispatcher2, anonymousClass12, this);
            if (objWithContext2 != objCopydefault) {
            }
        }
        String str7 = (String) objAEQbTJ;
        jsonObject = this.$content;
        str = "accountAddress";
        JsonElement jsonElement = (JsonElement) jsonObject.get((Object) "accountAddress");
        String content = (jsonElement == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : jsonPrimitive.getContent();
        if (content == null || StringsKt__StringsKt.fARcdN((CharSequence) content)) {
            mapIsConnected = C56424yEw.isConnected(this.$content);
            C15974ebF c15974ebF3 = this.this$0;
            String str8 = this.$walletId;
            this.L$0 = str7;
            this.L$1 = mapIsConnected;
            this.L$2 = "accountAddress";
            this.L$3 = mapIsConnected;
            this.label = 2;
            objKWHzl = c15974ebF3.KWHzl(str8, (Continuation<? super AbstractC12782ctV>) this);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            str2 = str7;
            map = mapIsConnected;
            mapIsConnected.put(str, JsonElementKt.JsonPrimitive(((AbstractC12782ctV) objKWHzl).EZpvd(9004L)));
            jsonObject = new JsonObject(map);
            str3 = str2;
            dappSignArgs = new DappSignArgs(this.$walletId, str3, new PlatformItem(0L, this.$dAppInfo.getName(), this.$dAppInfo.getIcon(), (String) null, (String) null, (String) null, (List) null, (List) null, this.$dAppInfo.getUrl(), (String) null, 0L, 0, (String) null, (String) null, 16121, (DefaultConstructorMarker) null), jsonObject.toString(), false, C56443yFo.AEQbTJ(5), "okx_connect", null, false, false, null, null, null, null, null, false, null, 130944, null);
            C15974ebF c15974ebF22 = this.this$0;
            this.L$0 = dappSignArgs;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            objOLrzqt = c15974ebF22.OLrzqt((Continuation<? super WeakReference<Context>>) this);
            if (objOLrzqt == objCopydefault) {
            }
            DappSignArgs dappSignArgs222 = dappSignArgs;
            CoroutineDispatcher coroutineDispatcher22 = this.this$0.AkhnZx;
            AnonymousClass1 anonymousClass122 = new AnonymousClass1(this.this$0, this.$messageId, (WeakReference) objOLrzqt, dappSignArgs222, null);
            this.L$0 = null;
            this.label = 4;
            Object objWithContext22 = BuildersKt.withContext(coroutineDispatcher22, anonymousClass122, this);
            if (objWithContext22 != objCopydefault) {
            }
        } else {
            str3 = str7;
            dappSignArgs = new DappSignArgs(this.$walletId, str3, new PlatformItem(0L, this.$dAppInfo.getName(), this.$dAppInfo.getIcon(), (String) null, (String) null, (String) null, (List) null, (List) null, this.$dAppInfo.getUrl(), (String) null, 0L, 0, (String) null, (String) null, 16121, (DefaultConstructorMarker) null), jsonObject.toString(), false, C56443yFo.AEQbTJ(5), "okx_connect", null, false, false, null, null, null, null, null, false, null, 130944, null);
            C15974ebF c15974ebF222 = this.this$0;
            this.L$0 = dappSignArgs;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 3;
            objOLrzqt = c15974ebF222.OLrzqt((Continuation<? super WeakReference<Context>>) this);
            if (objOLrzqt == objCopydefault) {
            }
            DappSignArgs dappSignArgs2222 = dappSignArgs;
            CoroutineDispatcher coroutineDispatcher222 = this.this$0.AkhnZx;
            AnonymousClass1 anonymousClass1222 = new AnonymousClass1(this.this$0, this.$messageId, (WeakReference) objOLrzqt, dappSignArgs2222, null);
            this.L$0 = null;
            this.label = 4;
            Object objWithContext222 = BuildersKt.withContext(coroutineDispatcher222, anonymousClass1222, this);
            if (objWithContext222 != objCopydefault) {
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.common.okxconnect.util.DAppMethodHelper$onStarknetSignMessage$2$1$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        final /* synthetic */ DappSignArgs $args;
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
        public AnonymousClass1(C15974ebF c15974ebF, String str, WeakReference<Context> weakReference, DappSignArgs dappSignArgs, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c15974ebF;
            this.$messageId = str;
            this.$weakContext = weakReference;
            this.$args = dappSignArgs;
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
                DappSignArgs dappSignArgs = this.$args;
                this.L$0 = c15974ebF;
                this.L$1 = str;
                this.L$2 = weakReference;
                this.L$3 = dappSignArgs;
                this.label = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
                cancellableContinuationImpl.initCancellability();
                c15974ebF.copydefault(str, cancellableContinuationImpl);
                Context context = weakReference.get();
                if (context != null) {
                    MethodHelperActivity.Companion.OLrzqt(context, str, dappSignArgs, c15974ebF);
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
