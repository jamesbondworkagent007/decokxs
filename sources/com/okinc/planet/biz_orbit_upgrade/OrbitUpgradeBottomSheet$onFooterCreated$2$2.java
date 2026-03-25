package com.okinc.planet.biz_orbit_upgrade;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.biz_onboarding.OrbitEditProfileScenario;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33070mpX;
import o.C46437tUh;
import o.C47501trL;
import o.C52794wYp;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.tAB;
import o.tAH;
import o.tKX;
import o.wYF;

/* JADX INFO: loaded from: classes10.dex */
public final class OrbitUpgradeBottomSheet$onFooterCreated$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ wYF $buttonbox;
    int label;
    final /* synthetic */ tAB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrbitUpgradeBottomSheet$onFooterCreated$2$2(wYF wyf, tAB tab, Continuation<? super OrbitUpgradeBottomSheet$onFooterCreated$2$2> continuation) {
        super(2, continuation);
        this.$buttonbox = wyf;
        this.this$0 = tab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrbitUpgradeBottomSheet$onFooterCreated$2$2(this.$buttonbox, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrbitUpgradeBottomSheet$onFooterCreated$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C52794wYp c52794wYpCopydefault = this.$buttonbox.copydefault();
            if (c52794wYpCopydefault != null) {
                C52794wYp.startLoading$default(c52794wYpCopydefault, 0L, 1, null);
            }
            tAH tahEZpvd = this.this$0.EZpvd();
            this.label = 1;
            obj = tahEZpvd.copydefault(this);
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
        OKServerException oKServerException = (OKServerException) pair.component2();
        C52794wYp c52794wYpCopydefault2 = this.$buttonbox.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.fIwbmz();
        }
        if (zBooleanValue) {
            Function1<Boolean, Unit> function1AEQbTJ = this.this$0.AEQbTJ();
            if (function1AEQbTJ != null) {
                function1AEQbTJ.invoke(C56443yFo.KWHzl(true));
            }
            this.this$0.dismissAllowingStateLoss();
        } else if (C46437tUh.OLrzqt.AEQbTJ() && oKServerException != null && oKServerException.getCode() == 50032) {
            OrbitEditProfileScenario.EnrollOrbiter enrollOrbiter = OrbitEditProfileScenario.EnrollOrbiter.AEQbTJ;
            tKX tkxOLrzqt = tKX.Companion.OLrzqt();
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            final tAB tab = this.this$0;
            tkxOLrzqt.AEQbTJ(fragmentActivityRequireActivity, enrollOrbiter, false, new Function2<Boolean, String, Unit>() { // from class: com.okinc.planet.biz_orbit_upgrade.OrbitUpgradeBottomSheet$onFooterCreated$2$2.5
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function2
                public /* synthetic */ Unit invoke(Boolean bool, String str) {
                    copydefault(bool.booleanValue(), str);
                    return Unit.INSTANCE;
                }

                public final void copydefault(boolean z, String str) {
                    if (z) {
                        tab.EZpvd().KWHzl(tab.AEQbTJ());
                        tab.EZpvd().EZpvd();
                    }
                }
            });
        } else {
            C55326xho.toast$default(C33070mpX.AYXKKw(C47501trL.Fragment.fGQ), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
