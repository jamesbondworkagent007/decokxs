package com.okinc.business.defi.biz.net.interceptor;

import com.okinc.business.defi.api.bean.WalletJwtException;
import com.okinc.business.defi.wallet.jwt.WalletJwtErrorCode;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import o.C13925dbl;
import o.C18438fiR;
import o.C18443fiW;
import o.C54907xZt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56548yJl;
import o.InterfaceC18439fiS;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class WalletJwtInterceptor$intercept$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response>, Object> {
    final /* synthetic */ String $accountId;
    final /* synthetic */ Request.Builder $builder;
    final /* synthetic */ Interceptor.Chain $chain;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C13925dbl this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletJwtInterceptor$intercept$1(C13925dbl c13925dbl, String str, Request.Builder builder, Interceptor.Chain chain, Continuation<? super WalletJwtInterceptor$intercept$1> continuation) {
        super(2, continuation);
        this.this$0 = c13925dbl;
        this.$accountId = str;
        this.$builder = builder;
        this.$chain = chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        WalletJwtInterceptor$intercept$1 walletJwtInterceptor$intercept$1 = new WalletJwtInterceptor$intercept$1(this.this$0, this.$accountId, this.$builder, this.$chain, continuation);
        walletJwtInterceptor$intercept$1.L$0 = obj;
        return walletJwtInterceptor$intercept$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response> continuation) {
        return ((WalletJwtInterceptor$intercept$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v45, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v24, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v7, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r11v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v22, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r5v23, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x014e: MOVE (r12 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:56:0x014e */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0174 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0126 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0216  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.ObjectRef objectRef3;
        Response responseProceed;
        String strString;
        Object objM7377constructorimpl;
        JsonObject jsonObject;
        Integer intOrNull;
        ResponseBody responseBodyCreate;
        Response responseBuild;
        String strHeader$default;
        JsonObject jsonObject2;
        Ref.ObjectRef objectRef4;
        Integer num;
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitive;
        JsonElement jsonElement2;
        CharSequence charSequence;
        JsonPrimitive jsonPrimitive2;
        CoroutineScope coroutineScope;
        Ref.ObjectRef objectRef5;
        T t;
        C13925dbl c13925dbl;
        String str;
        Request.Builder builder;
        Object objAEQbTJ;
        Ref.ObjectRef objectRef6;
        Request.Builder builder2;
        Ref.ObjectRef objectRef7;
        T t2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String contentOrNull = null;
        try {
        } catch (Throwable th) {
            th = th;
            objectRef2 = objectRef;
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            objectRef3 = new Ref.ObjectRef();
            InterfaceC18439fiS interfaceC18439fiS = this.this$0.AEQbTJ;
            String str2 = this.$accountId;
            this.L$0 = coroutineScope2;
            this.L$1 = objectRef3;
            this.L$2 = objectRef3;
            this.label = 1;
            Object objAEQbTJ2 = interfaceC18439fiS.AEQbTJ(str2, this);
            if (objAEQbTJ2 == objCopydefault) {
                return objCopydefault;
            }
            coroutineScope = coroutineScope2;
            objectRef5 = objectRef3;
            t = objAEQbTJ2;
        } else {
            if (i != 1) {
                if (i == 2) {
                    builder = (Request.Builder) this.L$4;
                    String str3 = (String) this.L$3;
                    C13925dbl c13925dbl2 = (C13925dbl) this.L$2;
                    objectRef2 = (Ref.ObjectRef) this.L$1;
                    coroutineScope = (CoroutineScope) this.L$0;
                    try {
                        C56391yDq.AEQbTJ(obj);
                        ((Result) obj).m7386unboximpl();
                        c13925dbl = c13925dbl2;
                        str = str3;
                        objectRef3 = objectRef2;
                        InterfaceC18439fiS interfaceC18439fiS2 = c13925dbl.AEQbTJ;
                        this.L$0 = coroutineScope;
                        this.L$1 = objectRef3;
                        this.L$2 = builder;
                        this.L$3 = objectRef3;
                        this.L$4 = null;
                        this.label = 3;
                        objAEQbTJ = interfaceC18439fiS2.AEQbTJ(str, this);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Application application = Result.Companion;
                        Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        objectRef3 = objectRef2;
                        responseProceed = this.$chain.proceed(this.$builder.build());
                        ResponseBody responseBodyBody = responseProceed.body();
                        if (responseBodyBody == null) {
                        }
                        if (strString == null) {
                        }
                        if (jsonObject != null) {
                        }
                        jsonElement2 = (JsonElement) jsonObject.get((Object) "msg");
                        if (jsonElement2 != null) {
                        }
                        if (contentOrNull == null) {
                        }
                        charSequence = (CharSequence) objectRef3.element;
                        if (charSequence == null) {
                        }
                        throw new OKServerException(0, null, null, new WalletJwtException(jsonObject), 7, null);
                    }
                    if (objAEQbTJ != objCopydefault) {
                        return objCopydefault;
                    }
                    objectRef6 = objectRef3;
                    builder2 = builder;
                    objectRef7 = objectRef6;
                    t2 = objAEQbTJ;
                    objectRef7.element = t2;
                    String str4 = (String) objectRef6.element;
                    if (str4 == null) {
                        Result.m7377constructorimpl((str4 == null && str4.length() != 0 && (StringsKt__StringsKt.fARcdN((CharSequence) str4) ^ true)) ? builder2.header("X-Web3-Auth", str4) : null);
                        objectRef3 = objectRef6;
                        responseProceed = this.$chain.proceed(this.$builder.build());
                        ResponseBody responseBodyBody2 = responseProceed.body();
                        if (responseBodyBody2 == null) {
                        }
                        if (strString == null) {
                        }
                        if (jsonObject != null) {
                            if (intOrNull == null) {
                            }
                            Response.Builder builderNewBuilder = responseProceed.newBuilder();
                            if (strString == null) {
                            }
                            responseBuild = builderNewBuilder.body(responseBodyCreate).build();
                            strHeader$default = Response.header$default(responseBuild, "X-Web3-Auth", null, 2, null);
                            C13925dbl c13925dbl3 = this.this$0;
                            String str5 = this.$accountId;
                            return strHeader$default != null ? responseBuild : responseBuild;
                        }
                    }
                    jsonElement2 = (JsonElement) jsonObject.get((Object) "msg");
                    if (jsonElement2 != null) {
                    }
                    if (contentOrNull == null) {
                    }
                    charSequence = (CharSequence) objectRef3.element;
                    if (charSequence == null) {
                    }
                    throw new OKServerException(0, null, null, new WalletJwtException(jsonObject), 7, null);
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Response response = (Response) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        return response;
                    }
                    num = (Integer) this.L$2;
                    jsonObject2 = (JsonObject) this.L$1;
                    objectRef4 = (Ref.ObjectRef) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    intOrNull = num;
                    jsonObject = jsonObject2;
                    objectRef3 = objectRef4;
                    jsonElement2 = (JsonElement) jsonObject.get((Object) "msg");
                    if (jsonElement2 != null && (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement2)) != null) {
                        contentOrNull = JsonElementKt.getContentOrNull(jsonPrimitive2);
                    }
                    if (contentOrNull == null) {
                        contentOrNull = "";
                    }
                    charSequence = (CharSequence) objectRef3.element;
                    if (charSequence == null || StringsKt__StringsKt.fARcdN(charSequence)) {
                        C18443fiW.AEQbTJ(WalletJwtErrorCode.EMPTY_JWT_ERROR, contentOrNull, intOrNull.intValue());
                    } else {
                        C18443fiW.AEQbTJ(WalletJwtErrorCode.VALIDATE_JWT_ERROR, contentOrNull, intOrNull.intValue());
                    }
                    throw new OKServerException(0, null, null, new WalletJwtException(jsonObject), 7, null);
                }
                objectRef7 = (Ref.ObjectRef) this.L$3;
                Request.Builder builder3 = (Request.Builder) this.L$2;
                Ref.ObjectRef objectRef8 = (Ref.ObjectRef) this.L$1;
                C56391yDq.AEQbTJ(obj);
                objectRef6 = objectRef8;
                builder2 = builder3;
                t2 = obj;
                try {
                    objectRef7.element = t2;
                    String str42 = (String) objectRef6.element;
                    Result.m7377constructorimpl((str42 == null && str42.length() != 0 && (StringsKt__StringsKt.fARcdN((CharSequence) str42) ^ true)) ? builder2.header("X-Web3-Auth", str42) : null);
                    objectRef3 = objectRef6;
                } catch (Throwable th3) {
                    th = th3;
                    objectRef2 = objectRef6;
                    Result.Application application2 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                    objectRef3 = objectRef2;
                }
                responseProceed = this.$chain.proceed(this.$builder.build());
                ResponseBody responseBodyBody22 = responseProceed.body();
                strString = responseBodyBody22 == null ? responseBodyBody22.string() : null;
                if (strString == null) {
                    try {
                        Result.Application application3 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl((JsonObject) C54907xZt.OLrzqt(JsonObject.Companion.serializer(), strString));
                    } catch (Throwable th4) {
                        Result.Application application4 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th4));
                    }
                    if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                        objM7377constructorimpl = null;
                    }
                    jsonObject = (JsonObject) objM7377constructorimpl;
                } else {
                    jsonObject = null;
                }
                intOrNull = (jsonObject != null || (jsonElement = (JsonElement) jsonObject.get((Object) "code")) == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) == null) ? null : JsonElementKt.getIntOrNull(jsonPrimitive);
                if (intOrNull == null && C56548yJl.AhwBna(41001, 42000).AEQbTJ(intOrNull.intValue())) {
                    if (intOrNull.intValue() == 41008) {
                        MainCoroutineDispatcher main = Dispatchers.getMain();
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                        this.L$0 = objectRef3;
                        this.L$1 = jsonObject;
                        this.L$2 = intOrNull;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.label = 4;
                        if (BuildersKt.withContext(main, anonymousClass2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        jsonObject2 = jsonObject;
                        objectRef4 = objectRef3;
                        num = intOrNull;
                        intOrNull = num;
                        jsonObject = jsonObject2;
                        objectRef3 = objectRef4;
                    }
                    jsonElement2 = (JsonElement) jsonObject.get((Object) "msg");
                    if (jsonElement2 != null) {
                        contentOrNull = JsonElementKt.getContentOrNull(jsonPrimitive2);
                    }
                    if (contentOrNull == null) {
                    }
                    charSequence = (CharSequence) objectRef3.element;
                    if (charSequence == null) {
                        C18443fiW.AEQbTJ(WalletJwtErrorCode.EMPTY_JWT_ERROR, contentOrNull, intOrNull.intValue());
                    }
                    throw new OKServerException(0, null, null, new WalletJwtException(jsonObject), 7, null);
                }
                Response.Builder builderNewBuilder2 = responseProceed.newBuilder();
                if (strString == null) {
                    ResponseBody.Companion companion = ResponseBody.Companion;
                    ResponseBody responseBodyBody3 = responseProceed.body();
                    responseBodyCreate = companion.create(strString, responseBodyBody3 != null ? responseBodyBody3.contentType() : null);
                } else {
                    responseBodyCreate = null;
                }
                responseBuild = builderNewBuilder2.body(responseBodyCreate).build();
                strHeader$default = Response.header$default(responseBuild, "X-Web3-Auth", null, 2, null);
                C13925dbl c13925dbl32 = this.this$0;
                String str52 = this.$accountId;
                if (strHeader$default != null || strHeader$default.length() == 0 || !(!StringsKt__StringsKt.fARcdN((CharSequence) strHeader$default))) {
                    return responseBuild;
                }
                InterfaceC18439fiS interfaceC18439fiS3 = c13925dbl32.AEQbTJ;
                this.L$0 = responseBuild;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 5;
                return interfaceC18439fiS3.AEQbTJ(str52, strHeader$default, this) == objCopydefault ? objCopydefault : responseBuild;
            }
            objectRef5 = (Ref.ObjectRef) this.L$2;
            objectRef3 = (Ref.ObjectRef) this.L$1;
            CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
            coroutineScope = coroutineScope3;
            t = obj;
        }
        objectRef5.element = t;
        if (!this.this$0.EZpvd((String) objectRef3.element)) {
            if (this.this$0.KWHzl.AEQbTJ()) {
                C13925dbl c13925dbl4 = this.this$0;
                String str6 = this.$accountId;
                Request.Builder builder4 = this.$builder;
                Result.Application application5 = Result.Companion;
                C18438fiR c18438fiR = c13925dbl4.OLrzqt;
                String strOLrzqt = c13925dbl4.KWHzl.OLrzqt();
                this.L$0 = coroutineScope;
                this.L$1 = objectRef3;
                this.L$2 = c13925dbl4;
                this.L$3 = str6;
                this.L$4 = builder4;
                this.label = 2;
                if (c18438fiR.copydefault(str6, strOLrzqt, this) == objCopydefault) {
                    return objCopydefault;
                }
                c13925dbl = c13925dbl4;
                str = str6;
                builder = builder4;
                InterfaceC18439fiS interfaceC18439fiS22 = c13925dbl.AEQbTJ;
                this.L$0 = coroutineScope;
                this.L$1 = objectRef3;
                this.L$2 = builder;
                this.L$3 = objectRef3;
                this.L$4 = null;
                this.label = 3;
                objAEQbTJ = interfaceC18439fiS22.AEQbTJ(str, this);
                if (objAEQbTJ != objCopydefault) {
                }
            }
        } else {
            Request.Builder builder5 = this.$builder;
            T t3 = objectRef3.element;
            Intrinsics.copydefault(t3);
            builder5.header("X-Web3-Auth", (String) t3);
        }
        responseProceed = this.$chain.proceed(this.$builder.build());
        ResponseBody responseBodyBody222 = responseProceed.body();
        if (responseBodyBody222 == null) {
        }
        if (strString == null) {
        }
        if (jsonObject != null) {
        }
        jsonElement2 = (JsonElement) jsonObject.get((Object) "msg");
        if (jsonElement2 != null) {
        }
        if (contentOrNull == null) {
        }
        charSequence = (CharSequence) objectRef3.element;
        if (charSequence == null) {
        }
        throw new OKServerException(0, null, null, new WalletJwtException(jsonObject), 7, null);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.biz.net.interceptor.WalletJwtInterceptor$intercept$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ C13925dbl this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C13925dbl c13925dbl, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c13925dbl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.KWHzl.EZpvd();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
