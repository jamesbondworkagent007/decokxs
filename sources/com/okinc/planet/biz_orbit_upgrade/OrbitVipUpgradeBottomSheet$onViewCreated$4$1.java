package com.okinc.planet.biz_orbit_upgrade;

import android.graphics.drawable.Drawable;
import com.okinc.components.track.TrackChannel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32866mlf;
import o.C33070mpX;
import o.C47501trL;
import o.C52794wYp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.tAE;
import o.tAI;
import o.tNS;
import o.wYF;

/* JADX INFO: loaded from: classes16.dex */
public final class OrbitVipUpgradeBottomSheet$onViewCreated$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ tAI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrbitVipUpgradeBottomSheet$onViewCreated$4$1(tAI tai, Continuation<? super OrbitVipUpgradeBottomSheet$onViewCreated$4$1> continuation) {
        super(2, continuation);
        this.this$0 = tai;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrbitVipUpgradeBottomSheet$onViewCreated$4$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrbitVipUpgradeBottomSheet$onViewCreated$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        wYF wyf;
        C52794wYp c52794wYpCopydefault;
        wYF wyf2;
        C52794wYp c52794wYpCopydefault2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            tNS tns = this.this$0.AEQbTJ;
            if (tns != null && (wyf = tns.EZpvd) != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
                C52794wYp.startLoading$default(c52794wYpCopydefault, 0L, 1, null);
            }
            tAE taeEZpvd = this.this$0.EZpvd();
            this.label = 1;
            obj = taeEZpvd.copydefault(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Pair pair = (Pair) obj;
        boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
        tNS tns2 = this.this$0.AEQbTJ;
        if (tns2 != null && (wyf2 = tns2.EZpvd) != null && (c52794wYpCopydefault2 = wyf2.copydefault()) != null) {
            c52794wYpCopydefault2.fIwbmz();
        }
        if (zBooleanValue) {
            C32866mlf.onEvent$default("Orbit_UpgradeToOrbiterPlus_Success_View", (TrackChannel[]) null, (Function1) null, 3, (Object) null);
            Function1<Boolean, Unit> function1AEQbTJ = this.this$0.AEQbTJ();
            if (function1AEQbTJ != null) {
                function1AEQbTJ.invoke(C56443yFo.KWHzl(true));
            }
            this.this$0.dismissAllowingStateLoss();
        } else {
            C55326xho.toast$default(C33070mpX.AYXKKw(C47501trL.Fragment.iCPUKe), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
