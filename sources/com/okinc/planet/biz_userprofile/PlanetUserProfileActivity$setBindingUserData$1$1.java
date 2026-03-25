package com.okinc.planet.biz_userprofile;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C46237tMx;
import o.C56391yDq;
import o.C56442yFn;
import o.tJI;
import o.tWM;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetUserProfileActivity$setBindingUserData$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C46237tMx $this_setBindingUserData;
    int label;
    final /* synthetic */ tJI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetUserProfileActivity$setBindingUserData$1$1(tJI tji, C46237tMx c46237tMx, Continuation<? super PlanetUserProfileActivity$setBindingUserData$1$1> continuation) {
        super(2, continuation);
        this.this$0 = tji;
        this.$this_setBindingUserData = c46237tMx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetUserProfileActivity$setBindingUserData$1$1(this.this$0, this.$this_setBindingUserData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetUserProfileActivity$setBindingUserData$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tWM twm = (tWM) C43251rlk.copydefault(tWM.class);
            tJI tji = this.this$0;
            PlanetPublisherChannelId planetPublisherChannelId = PlanetPublisherChannelId.PERSONAL_HOMEPAGE;
            ConstraintLayout root = this.$this_setBindingUserData.getRoot();
            this.label = 1;
            if (tWM.StateListAnimator.openPublishPage$default(twm, tji, planetPublisherChannelId, null, root, null, false, this, 48, null) == objCopydefault) {
                return objCopydefault;
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
