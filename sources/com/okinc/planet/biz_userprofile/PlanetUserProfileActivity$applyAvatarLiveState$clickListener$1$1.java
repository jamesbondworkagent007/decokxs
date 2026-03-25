package com.okinc.planet.biz_userprofile;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC44531sTi;
import o.tJI;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetUserProfileActivity$applyAvatarLiveState$clickListener$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $shareCode;
    int label;
    final /* synthetic */ tJI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetUserProfileActivity$applyAvatarLiveState$clickListener$1$1(tJI tji, String str, Continuation<? super PlanetUserProfileActivity$applyAvatarLiveState$clickListener$1$1> continuation) {
        super(2, continuation);
        this.this$0 = tji;
        this.$shareCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetUserProfileActivity$applyAvatarLiveState$clickListener$1$1(this.this$0, this.$shareCode, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetUserProfileActivity$applyAvatarLiveState$clickListener$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC44531sTi interfaceC44531sTi = (InterfaceC44531sTi) C43251rlk.OLrzqt(InterfaceC44531sTi.class);
            if (interfaceC44531sTi != null) {
                tJI tji = this.this$0;
                String str = this.$shareCode;
                this.label = 1;
                if (InterfaceC44531sTi.Application.navigateToLiveStreamPage$default(interfaceC44531sTi, tji, str, null, "orbit_personal_profile", null, null, this, 52, null) == objCopydefault) {
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
