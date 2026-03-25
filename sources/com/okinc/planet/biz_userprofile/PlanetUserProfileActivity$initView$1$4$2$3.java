package com.okinc.planet.biz_userprofile;

import androidx.fragment.app.FragmentManager;
import com.okinc.planet.biz_userprofile.PlanetUserProfileActivity$initView$1$4$2$3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C46189tLc;
import o.C46196tLj;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.pUU;
import o.tJI;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetUserProfileActivity$initView$1$4$2$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ tJI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetUserProfileActivity$initView$1$4$2$3(tJI tji, Continuation<? super PlanetUserProfileActivity$initView$1$4$2$3> continuation) {
        super(2, continuation);
        this.this$0 = tji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PlanetUserProfileActivity$initView$1$4$2$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PlanetUserProfileActivity$initView$1$4$2$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strCopydefault;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
            if (interfaceC35180nqU != null) {
                tJI tji = this.this$0;
                FragmentManager supportFragmentManager = tji.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C46189tLc c46189tLcAEQbTJ = this.this$0.getFieldNames().AEQbTJ();
                String str = (c46189tLcAEQbTJ == null || (strCopydefault = C46196tLj.EZpvd.copydefault(c46189tLcAEQbTJ)) == null) ? "" : strCopydefault;
                String strGEmmrt = this.this$0.getFieldNames().gEmmrt();
                final tJI tji2 = this.this$0;
                Function1<? super Boolean, Unit> function1 = new Function1() { // from class: o.tKw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return PlanetUserProfileActivity$initView$1$4$2$3.invokeSuspend$lambda$0(tji2, ((java.lang.Boolean) obj2).booleanValue());
                    }
                };
                this.label = 1;
                if (interfaceC35180nqU.KWHzl(tji, supportFragmentManager, str, strGEmmrt, function1, this) == objCopydefault) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(tJI tji, boolean z) {
        pUU.EZpvd(tji.getTAG(), "presentIMPublicGroupJoinFlow, status=" + z);
        if (z) {
            tji.showLoading();
        } else {
            tji.dismissLoading();
        }
        return Unit.INSTANCE;
    }
}
