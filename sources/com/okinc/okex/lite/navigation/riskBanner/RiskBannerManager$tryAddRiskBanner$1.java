package com.okinc.okex.lite.navigation.riskBanner;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C45762swh;
import o.C45763swi;
import o.C45765swk;
import o.C45771swq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes16.dex */
public final class RiskBannerManager$tryAddRiskBanner$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isOnResume;
    final /* synthetic */ Activity $toActivity;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiskBannerManager$tryAddRiskBanner$1(boolean z, Activity activity, Continuation<? super RiskBannerManager$tryAddRiskBanner$1> continuation) {
        super(2, continuation);
        this.$isOnResume = z;
        this.$toActivity = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RiskBannerManager$tryAddRiskBanner$1(this.$isOnResume, this.$toActivity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RiskBannerManager$tryAddRiskBanner$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C45771swq c45771swq = C45771swq.AEQbTJ;
            boolean z = this.$isOnResume;
            this.label = 1;
            obj = c45771swq.copydefault(z, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        C45762swh c45762swh = (C45762swh) obj;
        if (c45762swh != null && !C45763swi.OLrzqt(c45762swh.AEQbTJ().OLrzqt())) {
            C45765swk.EZpvd.copydefault((AbstractActivityC33041mov) this.$toActivity, c45762swh);
            return Unit.INSTANCE;
        }
        C45765swk.EZpvd.AEQbTJ((AppCompatActivity) this.$toActivity);
        return Unit.INSTANCE;
    }
}
