package com.okinc.planet.biz_userprofile.view.share;

import com.okinc.planet.biz_userprofile.data.PlanetProfileShareBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC48893ueK;
import o.tLN;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetShareManager$handleShareBeanWithShortLinks$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $baseActivity;
    final /* synthetic */ String $deepLink;
    final /* synthetic */ PlanetProfileShareBean $this_handleShareBeanWithShortLinks;
    int label;
    final /* synthetic */ tLN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetShareManager$handleShareBeanWithShortLinks$2(tLN tln, AbstractActivityC33041mov abstractActivityC33041mov, PlanetProfileShareBean planetProfileShareBean, String str, Continuation<? super PlanetShareManager$handleShareBeanWithShortLinks$2> continuation) {
        super(2, continuation);
        this.this$0 = tln;
        this.$baseActivity = abstractActivityC33041mov;
        this.$this_handleShareBeanWithShortLinks = planetProfileShareBean;
        this.$deepLink = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetShareManager$handleShareBeanWithShortLinks$2(this.this$0, this.$baseActivity, this.$this_handleShareBeanWithShortLinks, this.$deepLink, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((PlanetShareManager$handleShareBeanWithShortLinks$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CompletableDeferred completableDeferredCopydefault = this.this$0.copydefault((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class), this.$baseActivity, this.$this_handleShareBeanWithShortLinks.values(), this.$deepLink);
            this.label = 1;
            obj = completableDeferredCopydefault.await(this);
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
