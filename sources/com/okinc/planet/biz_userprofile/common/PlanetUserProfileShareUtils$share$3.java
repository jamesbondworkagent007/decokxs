package com.okinc.planet.biz_userprofile.common;

import com.okinc.planet.biz_userprofile.data.PlanetTradeTypes;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C46189tLc;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC46198tLl;
import o.tLH;
import o.tLN;
import o.tLR;

/* JADX INFO: loaded from: classes16.dex */
public final class PlanetUserProfileShareUtils$share$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ String $authorId;
    final /* synthetic */ InterfaceC46198tLl $currentTab;
    final /* synthetic */ String $uniqueName;
    final /* synthetic */ C46189tLc $user;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetUserProfileShareUtils$share$3(AbstractActivityC33041mov abstractActivityC33041mov, String str, String str2, C46189tLc c46189tLc, InterfaceC46198tLl interfaceC46198tLl, Continuation<? super PlanetUserProfileShareUtils$share$3> continuation) {
        super(2, continuation);
        this.$activity = abstractActivityC33041mov;
        this.$uniqueName = str;
        this.$authorId = str2;
        this.$user = c46189tLc;
        this.$currentTab = interfaceC46198tLl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetUserProfileShareUtils$share$3(this.$activity, this.$uniqueName, this.$authorId, this.$user, this.$currentTab, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetUserProfileShareUtils$share$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tLN tlnOLrzqt = tLN.Companion.OLrzqt();
            tLH.Activity activity = new tLH.Activity(this.$activity, new tLR.ActionBar.StateListAnimator(this.$uniqueName, this.$authorId, this.$user.OLrzqt().KWHzl(), null, PlanetTradeTypes.Swap, 8, null));
            InterfaceC46198tLl interfaceC46198tLl = this.$currentTab;
            this.label = 1;
            if (tlnOLrzqt.OLrzqt(activity, interfaceC46198tLl, this) == objCopydefault) {
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
