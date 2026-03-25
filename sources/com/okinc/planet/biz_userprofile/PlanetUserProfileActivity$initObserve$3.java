package com.okinc.planet.biz_userprofile;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C55254xgV;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC46198tLl;
import o.tJI;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetUserProfileActivity$initObserve$3 extends SuspendLambda implements Function2<List<? extends InterfaceC46198tLl>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tJI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetUserProfileActivity$initObserve$3(tJI tji, Continuation<? super PlanetUserProfileActivity$initObserve$3> continuation) {
        super(2, continuation);
        this.this$0 = tji;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetUserProfileActivity$initObserve$3 planetUserProfileActivity$initObserve$3 = new PlanetUserProfileActivity$initObserve$3(this.this$0, continuation);
        planetUserProfileActivity$initObserve$3.L$0 = obj;
        return planetUserProfileActivity$initObserve$3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends InterfaceC46198tLl> list, Continuation<? super Unit> continuation) {
        return ((PlanetUserProfileActivity$initObserve$3) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List list = (List) this.L$0;
            if (list.isEmpty()) {
                return Unit.INSTANCE;
            }
            boolean zEZpvd = Intrinsics.EZpvd(list.get(0), InterfaceC46198tLl.ActionBar.OLrzqt);
            tJI tji = this.this$0;
            tji.OLrzqt(tji.gEmmrt(), zEZpvd);
            this.this$0.KWHzl(!zEZpvd);
            View view = this.this$0.gEmmrt().AxsJAY;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(zEZpvd ? 8 : 0);
            C55254xgV c55254xgV = this.this$0.gEmmrt().AwvSrB;
            Intrinsics.checkNotNullExpressionValue(c55254xgV, "");
            c55254xgV.setVisibility(zEZpvd ? 8 : 0);
            if (zEZpvd) {
                ConstraintLayout constraintLayout = this.this$0.gEmmrt().fIwbmz;
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                constraintLayout.setPadding(constraintLayout.getPaddingLeft(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingRight(), 0);
            } else {
                this.this$0.KWHzl((List<? extends InterfaceC46198tLl>) list);
                this.this$0.gEmmrt().AEQbTJ.addOnOffsetChangedListener(this.this$0.ejfBZ);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
