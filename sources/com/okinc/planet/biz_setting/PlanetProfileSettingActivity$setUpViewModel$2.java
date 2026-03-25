package com.okinc.planet.biz_setting;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.im.bean.ChatSettingViewComponentScene;
import com.okinc.planet.biz_setting.PlanetProfileSettingActivity$setUpViewModel$2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import o.AbstractC46197tLk;
import o.ActivityC46100tHv;
import o.C43251rlk;
import o.C46095tHq;
import o.C46099tHu;
import o.C46106tIa;
import o.C46126tIu;
import o.C46231tMr;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC35180nqU;
import o.InterfaceC46104tHz;
import o.InterfaceC46130tIy;
import o.pUU;
import o.rVN;
import o.tHW;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
public final class PlanetProfileSettingActivity$setUpViewModel$2 extends SuspendLambda implements Function2<AbstractC46197tLk<? extends C46126tIu>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ActivityC46100tHv this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlanetProfileSettingActivity$setUpViewModel$2(ActivityC46100tHv activityC46100tHv, Continuation<? super PlanetProfileSettingActivity$setUpViewModel$2> continuation) {
        super(2, continuation);
        this.this$0 = activityC46100tHv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlanetProfileSettingActivity$setUpViewModel$2 planetProfileSettingActivity$setUpViewModel$2 = new PlanetProfileSettingActivity$setUpViewModel$2(this.this$0, continuation);
        planetProfileSettingActivity$setUpViewModel$2.L$0 = obj;
        return planetProfileSettingActivity$setUpViewModel$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(AbstractC46197tLk<? extends C46126tIu> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return invoke2((AbstractC46197tLk<C46126tIu>) abstractC46197tLk, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(AbstractC46197tLk<C46126tIu> abstractC46197tLk, Continuation<? super Unit> continuation) {
        return ((PlanetProfileSettingActivity$setUpViewModel$2) create(abstractC46197tLk, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC35180nqU interfaceC35180nqU;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) this.L$0;
            final int i = 0;
            if (abstractC46197tLk instanceof AbstractC46197tLk.Activity) {
                this.this$0.copydefault().submitList(yDY.AhwBna());
                C46099tHu c46099tHu = this.this$0.AYXKKw;
                final ActivityC46100tHv activityC46100tHv = this.this$0;
                c46099tHu.submitList(new InterfaceC46104tHz.TaskDescription(null, 0.0f, new C46095tHq(null, null, null, null, false, new Function0() { // from class: o.tHR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return PlanetProfileSettingActivity$setUpViewModel$2.invokeSuspend$lambda$0(activityC46100tHv);
                    }
                }, 31, null), true, false, null, false, 115, null).valueOf());
                if (!this.this$0.valueOf) {
                    this.this$0.valueOf = true;
                    rVN.reportFullyDrawn$default((Activity) this.this$0, false, (String) null, 2, (Object) null);
                }
            } else if (abstractC46197tLk instanceof AbstractC46197tLk.Application) {
                this.this$0.AYXKKw.submitList(yDY.AhwBna());
                AbstractC46197tLk.Application application = (AbstractC46197tLk.Application) abstractC46197tLk;
                List<InterfaceC46130tIy> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) ((C46126tIu) application.copydefault()).OLrzqt());
                this.this$0.EZpvd(((C46126tIu) application.copydefault()).copydefault());
                Iterator it = listFJNWhG.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((InterfaceC46130tIy) it.next()) instanceof InterfaceC46130tIy.ActionBar) {
                        break;
                    }
                    i++;
                }
                if (i >= 0 && this.this$0.AhwBna == null && (interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class)) != null) {
                    this.this$0.AhwBna = interfaceC35180nqU.EZpvd(ChatSettingViewComponentScene.ORBIT);
                }
                C46106tIa c46106tIaCopydefault = this.this$0.copydefault();
                ActivityC46100tHv activityC46100tHv2 = this.this$0;
                for (InterfaceC46130tIy interfaceC46130tIy : listFJNWhG) {
                    pUU.KWHzl(activityC46100tHv2.getTAG(), "submitList add: " + interfaceC46130tIy.getClass().getSimpleName());
                }
                c46106tIaCopydefault.submitList(listFJNWhG);
                this.this$0.copydefault().notifyDataSetChanged();
                if (i >= 0 && this.this$0.AhwBna != null) {
                    final ActivityC46100tHv activityC46100tHv3 = this.this$0;
                    activityC46100tHv3.AEQbTJ(new Function1() { // from class: o.tHS
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return PlanetProfileSettingActivity$setUpViewModel$2.invokeSuspend$lambda$6(i, activityC46100tHv3, (C46231tMr) obj2);
                        }
                    });
                }
                if (!this.this$0.valueOf) {
                    this.this$0.valueOf = true;
                    rVN.reportFullyDrawn$default((Activity) this.this$0, true, (String) null, 2, (Object) null);
                }
            } else if (!(abstractC46197tLk instanceof AbstractC46197tLk.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(ActivityC46100tHv activityC46100tHv) {
        activityC46100tHv.EZpvd().KWHzl(tHW.TaskDescription.Application.copydefault);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$6(final int i, final ActivityC46100tHv activityC46100tHv, final C46231tMr c46231tMr) {
        c46231tMr.copydefault.post(new Runnable() { // from class: o.tHQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                PlanetProfileSettingActivity$setUpViewModel$2.invokeSuspend$lambda$6$lambda$5(c46231tMr, i, activityC46100tHv);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$6$lambda$5(C46231tMr c46231tMr, int i, ActivityC46100tHv activityC46100tHv) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c46231tMr.copydefault.findViewHolderForAdapterPosition(i);
        if (viewHolderFindViewHolderForAdapterPosition instanceof C46106tIa.TaskDescription) {
            ((C46106tIa.TaskDescription) viewHolderFindViewHolderForAdapterPosition).copydefault(activityC46100tHv.AhwBna);
        }
    }
}
