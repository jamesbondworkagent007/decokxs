package com.okinc.business.market.features.home_favorite_list.ui;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import o.C27670jza;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.yHW;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavoriteListViewModel$dismissGuide$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeFavoriteListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFavoriteListViewModel$dismissGuide$1(HomeFavoriteListViewModel homeFavoriteListViewModel, Continuation<? super HomeFavoriteListViewModel$dismissGuide$1> continuation) {
        super(2, continuation);
        this.this$0 = homeFavoriteListViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeFavoriteListViewModel$dismissGuide$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeFavoriteListViewModel$dismissGuide$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C27670jza c27670jza = this.this$0.djBIcL;
            KSerializer<Boolean> kSerializerSerializer = BuiltinSerializersKt.serializer(yHW.OLrzqt);
            Boolean boolKWHzl = C56443yFo.KWHzl(true);
            this.label = 1;
            if (c27670jza.EZpvd("key.show_guide", kSerializerSerializer, boolKWHzl, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        return Unit.INSTANCE;
    }
}
