package com.okinc.ok_kyc_core.presentation.views;

import com.okinc.ok_kyc_core.data.remote.networkmodel.GroupDynamic;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UIComponentAppModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC42074rFj;
import o.C41979rBw;
import o.C56391yDq;
import o.C56442yFn;
import o.rGL;

/* JADX INFO: loaded from: classes23.dex */
public final class CtaCardView$observe$1$3$1$1$contentList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends UIComponentAppModel>>, Object> {
    final /* synthetic */ GroupDynamic $dynamic;
    final /* synthetic */ Ref.ObjectRef<Map<String, String>> $queryMap;
    final /* synthetic */ AbstractC42074rFj $vm;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CtaCardView$observe$1$3$1$1$contentList$1(AbstractC42074rFj abstractC42074rFj, GroupDynamic groupDynamic, Ref.ObjectRef<Map<String, String>> objectRef, Continuation<? super CtaCardView$observe$1$3$1$1$contentList$1> continuation) {
        super(2, continuation);
        this.$vm = abstractC42074rFj;
        this.$dynamic = groupDynamic;
        this.$queryMap = objectRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CtaCardView$observe$1$3$1$1$contentList$1(this.$vm, this.$dynamic, this.$queryMap, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends UIComponentAppModel>> continuation) {
        return ((CtaCardView$observe$1$3$1$1$contentList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C41979rBw c41979rBwCopydefault = ((rGL) this.$vm).gHZMYf().copydefault();
            String uri = this.$dynamic.getUri();
            if (uri == null) {
                uri = "";
            }
            Map<String, String> map = this.$queryMap.element;
            this.label = 1;
            obj = c41979rBwCopydefault.copydefault(uri, map, this);
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
