package com.okinc.kline.ui.mvp;

import com.okinc.core.util.SPUtils;
import com.okinc.kline.ui.view.model.KlineIndicatorBean;
import com.okinc.kline.ui.view.model.KlineIndicatorData;
import com.okinc.network.okg.response.ResponseData;
import java.util.ArrayList;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC36262oVg;
import o.C37943pGl;
import o.C39562pug;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC39563puh;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketDetailPresent$getIndicatorList$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ResponseData<KlineIndicatorData> $resp;
    Object L$0;
    int label;
    final /* synthetic */ C39562pug this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketDetailPresent$getIndicatorList$2$1(C39562pug c39562pug, ResponseData<KlineIndicatorData> responseData, Continuation<? super MarketDetailPresent$getIndicatorList$2$1> continuation) {
        super(2, continuation);
        this.this$0 = c39562pug;
        this.$resp = responseData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketDetailPresent$getIndicatorList$2$1(this.this$0, this.$resp, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketDetailPresent$getIndicatorList$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            objectRef2.element = new ArrayList();
            CoroutineDispatcher coroutineDispatcherOLrzqt = C37943pGl.OLrzqt.OLrzqt();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resp, objectRef2, this.this$0, null);
            this.L$0 = objectRef2;
            this.label = 1;
            if (BuildersKt.withContext(coroutineDispatcherOLrzqt, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
            }
            objectRef = objectRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC39563puh.Application application = this.this$0.wlaJM;
        if (application != null) {
            application.EZpvd((ArrayList<Triple<AbstractC36262oVg, Boolean, KlineIndicatorBean>>) objectRef.element);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.mvp.MarketDetailPresent$getIndicatorList$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<ArrayList<Triple<AbstractC36262oVg, Boolean, KlineIndicatorBean>>> $arrayList;
        final /* synthetic */ ResponseData<KlineIndicatorData> $resp;
        int label;
        final /* synthetic */ C39562pug this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ResponseData<KlineIndicatorData> responseData, Ref.ObjectRef<ArrayList<Triple<AbstractC36262oVg, Boolean, KlineIndicatorBean>>> objectRef, C39562pug c39562pug, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$resp = responseData;
            this.$arrayList = objectRef;
            this.this$0 = c39562pug;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$resp, this.$arrayList, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r5v8, types: [T, java.util.ArrayList] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            KlineIndicatorData data;
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                ResponseData<KlineIndicatorData> responseData = this.$resp;
                if (responseData.getCode() == 0 && responseData.getData() != null && (data = this.$resp.getData()) != null) {
                    Ref.ObjectRef<ArrayList<Triple<AbstractC36262oVg, Boolean, KlineIndicatorBean>>> objectRef = this.$arrayList;
                    C39562pug c39562pug = this.this$0;
                    SPUtils.put("kline_indicator_version", data.getTimeVersion());
                    objectRef.element = c39562pug.KWHzl(data);
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
