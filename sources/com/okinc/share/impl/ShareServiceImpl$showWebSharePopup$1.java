package com.okinc.share.impl;

import com.okinc.share.bean.MultiShareConfig;
import com.okinc.share.jsbridge.bean.JSShareConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.AbstractActivityC33041mov;
import o.C33489mxS;
import o.C43251rlk;
import o.C49009ugU;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC48893ueK;
import o.pUU;

/* JADX INFO: loaded from: classes11.dex */
public final class ShareServiceImpl$showWebSharePopup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ String $json;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareServiceImpl$showWebSharePopup$1(String str, AbstractActivityC33041mov abstractActivityC33041mov, Continuation<? super ShareServiceImpl$showWebSharePopup$1> continuation) {
        super(2, continuation);
        this.$json = str;
        this.$activity = abstractActivityC33041mov;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareServiceImpl$showWebSharePopup$1(this.$json, this.$activity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShareServiceImpl$showWebSharePopup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("OKShare", "showWebSharePopup-> json:" + this.$json);
                MultiShareConfig multiShareConfigKWHzl = C49009ugU.KWHzl.KWHzl(this.$activity, (List<JSShareConfig>) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.ListSerializer(JSShareConfig.Companion.serializer()), this.$json));
                pUU.KWHzl("OKShare", "showWebSharePopup-> multiShareConfig:" + multiShareConfigKWHzl);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activity, multiShareConfigKWHzl, null);
                this.label = 1;
                if (BuildersKt.withContext(main, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
            pUU.copydefault("OKShare", "showWebSharePopup occur error:" + e.getMessage());
            C55326xho.OLrzqt(e.getMessage());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.share.impl.ShareServiceImpl$showWebSharePopup$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Object>, Object> {
        final /* synthetic */ AbstractActivityC33041mov $activity;
        final /* synthetic */ MultiShareConfig $multiShareConfig;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractActivityC33041mov abstractActivityC33041mov, MultiShareConfig multiShareConfig, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$activity = abstractActivityC33041mov;
            this.$multiShareConfig = multiShareConfig;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$activity, this.$multiShareConfig, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Object> continuation) {
            return invoke2(coroutineScope, (Continuation<Object>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<Object> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!this.$activity.isDestroyed()) {
                    return ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).OLrzqt(this.$activity, this.$multiShareConfig);
                }
                C55326xho.OLrzqt("activity is destroyed");
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
