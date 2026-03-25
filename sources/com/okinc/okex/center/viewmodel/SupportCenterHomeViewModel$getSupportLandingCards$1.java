package com.okinc.okex.center.viewmodel;

import com.okinc.okex.center.bean.SupportLandingResponse;
import com.okinc.okex.center.bean.enums.RecommendSection;
import com.okinc.okex.center.viewmodel.SupportCenterHomeViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C44760scx;
import o.C44854sel;
import o.C44857seo;
import o.C44906sfk;
import o.C45348soB;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportCenterHomeViewModel$getSupportLandingCards$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isSilentRefresh;
    final /* synthetic */ String $slug;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SupportCenterHomeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportCenterHomeViewModel$getSupportLandingCards$1(boolean z, SupportCenterHomeViewModel supportCenterHomeViewModel, String str, Continuation<? super SupportCenterHomeViewModel$getSupportLandingCards$1> continuation) {
        super(2, continuation);
        this.$isSilentRefresh = z;
        this.this$0 = supportCenterHomeViewModel;
        this.$slug = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportCenterHomeViewModel$getSupportLandingCards$1(this.$isSilentRefresh, this.this$0, this.$slug, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportCenterHomeViewModel$getSupportLandingCards$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        C45348soB.StateListAnimator stateListAnimator;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (!this.$isSilentRefresh) {
                this.this$0.AYXKKw.setValue(SupportCenterHomeViewModel.StateListAnimator.ActionBar.copydefault);
            }
            String strOLrzqt = C44906sfk.OLrzqt.OLrzqt();
            C45348soB c45348soB = this.this$0.valueOf;
            String str2 = this.$slug;
            this.L$0 = strOLrzqt;
            this.label = 1;
            Object objAEQbTJ = c45348soB.AEQbTJ(str2, strOLrzqt, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            str = strOLrzqt;
            obj = objAEQbTJ;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                stateListAnimator = (C45348soB.StateListAnimator) this.L$1;
                str = (String) this.L$0;
                C56391yDq.AEQbTJ(obj);
                boolean zOLrzqt = C44854sel.OLrzqt(((C45348soB.StateListAnimator.ActionBar) stateListAnimator).copydefault().getDisplayControl(), RecommendSection.RECENT_ACTIVITIES);
                if (C44857seo.AEQbTJ(str) && zOLrzqt) {
                    this.this$0.EZpvd(str);
                }
                return Unit.INSTANCE;
            }
            str = (String) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        C45348soB.StateListAnimator stateListAnimator2 = (C45348soB.StateListAnimator) obj;
        if (stateListAnimator2 instanceof C45348soB.StateListAnimator.ActionBar) {
            SupportCenterHomeViewModel supportCenterHomeViewModel = this.this$0;
            SupportLandingResponse supportLandingResponseCopydefault = ((C45348soB.StateListAnimator.ActionBar) stateListAnimator2).copydefault();
            this.L$0 = str;
            this.L$1 = stateListAnimator2;
            this.label = 2;
            if (supportCenterHomeViewModel.EZpvd(supportLandingResponseCopydefault, (Continuation<? super Unit>) this) == objCopydefault) {
                return objCopydefault;
            }
            stateListAnimator = stateListAnimator2;
            boolean zOLrzqt2 = C44854sel.OLrzqt(((C45348soB.StateListAnimator.ActionBar) stateListAnimator).copydefault().getDisplayControl(), RecommendSection.RECENT_ACTIVITIES);
            if (C44857seo.AEQbTJ(str)) {
                this.this$0.EZpvd(str);
            }
            return Unit.INSTANCE;
        }
        if (!(stateListAnimator2 instanceof C45348soB.StateListAnimator.C0950StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        C45348soB.StateListAnimator.C0950StateListAnimator c0950StateListAnimator = (C45348soB.StateListAnimator.C0950StateListAnimator) stateListAnimator2;
        C44760scx.log$default("getSupportLandingCards: Failure: " + c0950StateListAnimator.copydefault() + ", isSilentRefresh: " + this.$isSilentRefresh, null, 2, null);
        if (!this.$isSilentRefresh) {
            this.this$0.AYXKKw.setValue(new SupportCenterHomeViewModel.StateListAnimator.Application(c0950StateListAnimator.copydefault()));
        }
        return Unit.INSTANCE;
    }
}
