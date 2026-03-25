package com.okinc.share.jsbridge;

import android.app.Activity;
import com.okinc.jsbridge.Message;
import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.jsbridge.bean.JSShareConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.AbstractActivityC33041mov;
import o.C33489mxS;
import o.C43251rlk;
import o.C49009ugU;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC48893ueK;
import o.InterfaceC57336ygW;
import o.pUU;

/* JADX INFO: loaded from: classes19.dex */
public final class ShareJSBridgeHandler$showSharePopup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ InterfaceC57336ygW $callback;
    final /* synthetic */ Message $message;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareJSBridgeHandler$showSharePopup$1(Message message, Activity activity, InterfaceC57336ygW interfaceC57336ygW, Continuation<? super ShareJSBridgeHandler$showSharePopup$1> continuation) {
        super(2, continuation);
        this.$message = message;
        this.$activity = activity;
        this.$callback = interfaceC57336ygW;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareJSBridgeHandler$showSharePopup$1(this.$message, this.$activity, this.$callback, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShareJSBridgeHandler$showSharePopup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            e.printStackTrace();
            pUU.copydefault("OKShare", "showSharePopup occur error:" + e.getMessage());
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(e, this.$callback, this.$message, null);
            this.label = 2;
            if (BuildersKt.withContext(main, anonymousClass2, this) == objCopydefault) {
                return objCopydefault;
            }
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            pUU.copydefault("OKShare", "showSharePopup occur OutOfMemoryError:" + e2.getMessage());
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(e2, this.$callback, this.$message, null);
            this.label = 3;
            if (BuildersKt.withContext(main2, anonymousClass3, this) == objCopydefault) {
                return objCopydefault;
            }
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Message message = this.$message;
            String str = message.data;
            pUU.KWHzl("OKShare", "showSharePopup-> message:" + message);
            C33489mxS c33489mxS = C33489mxS.KWHzl;
            KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(JSShareConfig.Companion.serializer());
            Intrinsics.copydefault((Object) str);
            MultiShareConfig multiShareConfigKWHzl = C49009ugU.KWHzl.KWHzl((AbstractActivityC33041mov) this.$activity, (List<JSShareConfig>) c33489mxS.OLrzqt((DeserializationStrategy) kSerializerListSerializer, str));
            pUU.KWHzl("OKShare", "showSharePopup-> multiShareConfig:" + multiShareConfigKWHzl);
            MainCoroutineDispatcher main3 = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activity, multiShareConfigKWHzl, this.$callback, this.$message, null);
            this.label = 1;
            if (BuildersKt.withContext(main3, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.share.jsbridge.ShareJSBridgeHandler$showSharePopup$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ InterfaceC57336ygW $callback;
        final /* synthetic */ Message $message;
        final /* synthetic */ MultiShareConfig $multiShareConfig;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Activity activity, MultiShareConfig multiShareConfig, InterfaceC57336ygW interfaceC57336ygW, Message message, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = activity;
            this.$multiShareConfig = multiShareConfig;
            this.$callback = interfaceC57336ygW;
            this.$message = message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$activity, this.$multiShareConfig, this.$callback, this.$message, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!((AbstractActivityC33041mov) this.$activity).isDestroyed()) {
                    ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).OLrzqt((AbstractActivityC33041mov) this.$activity, this.$multiShareConfig);
                    this.$callback.OLrzqt(this.$message, "success");
                } else {
                    C55326xho.OLrzqt("activity is destroyed");
                    this.$callback.copydefault(this.$message, "showSharePopup occur error: activity is destroyed");
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.share.jsbridge.ShareJSBridgeHandler$showSharePopup$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC57336ygW $callback;
        final /* synthetic */ Exception $e;
        final /* synthetic */ Message $message;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Exception exc, InterfaceC57336ygW interfaceC57336ygW, Message message, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$e = exc;
            this.$callback = interfaceC57336ygW;
            this.$message = message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$e, this.$callback, this.$message, continuation);
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
                C55326xho.OLrzqt(this.$e.getMessage());
                this.$callback.copydefault(this.$message, "showSharePopup occur error:" + this.$e.getMessage());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.okinc.share.jsbridge.ShareJSBridgeHandler$showSharePopup$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InterfaceC57336ygW $callback;
        final /* synthetic */ OutOfMemoryError $e;
        final /* synthetic */ Message $message;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OutOfMemoryError outOfMemoryError, InterfaceC57336ygW interfaceC57336ygW, Message message, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$e = outOfMemoryError;
            this.$callback = interfaceC57336ygW;
            this.$message = message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$e, this.$callback, this.$message, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                C55326xho.OLrzqt(this.$e.getMessage());
                this.$callback.copydefault(this.$message, "showSharePopup occur OutOfMemoryError:" + this.$e.getMessage());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
