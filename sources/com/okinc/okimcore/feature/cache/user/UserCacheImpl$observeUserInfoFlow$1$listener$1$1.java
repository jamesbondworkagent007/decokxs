package com.okinc.okimcore.feature.cache.user;

import com.okinc.okimcore.model.remote.UserInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProducerScope;
import o.C44175sGb;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class UserCacheImpl$observeUserInfoFlow$1$listener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ProducerScope<UserInfo> $$this$callbackFlow;
    final /* synthetic */ String $key;
    final /* synthetic */ String $uuid;
    int label;
    final /* synthetic */ C44175sGb this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlinx.coroutines.channels.ProducerScope<? super com.okinc.okimcore.model.remote.UserInfo> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserCacheImpl$observeUserInfoFlow$1$listener$1$1(String str, String str2, ProducerScope<? super UserInfo> producerScope, C44175sGb c44175sGb, Continuation<? super UserCacheImpl$observeUserInfoFlow$1$listener$1$1> continuation) {
        super(2, continuation);
        this.$key = str;
        this.$uuid = str2;
        this.$$this$callbackFlow = producerScope;
        this.this$0 = c44175sGb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserCacheImpl$observeUserInfoFlow$1$listener$1$1(this.$key, this.$uuid, this.$$this$callbackFlow, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserCacheImpl$observeUserInfoFlow$1$listener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (Intrinsics.EZpvd((Object) this.$key, (Object) this.$uuid)) {
                ProducerScope<UserInfo> producerScope = this.$$this$callbackFlow;
                UserInfo userInfoOLrzqt = this.this$0.OLrzqt();
                this.label = 1;
                if (producerScope.send(userInfoOLrzqt, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
