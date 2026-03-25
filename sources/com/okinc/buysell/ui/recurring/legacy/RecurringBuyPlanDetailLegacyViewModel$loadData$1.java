package com.okinc.buysell.ui.recurring.legacy;

import com.okinc.buysell.ui.recurring.RecurringBuyPlanStatus;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyFrequencyBean;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyPlanDetailRootBean;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.InterfaceC30234lQv;
import o.lQE;
import o.lTT;
import o.mHA;
import o.pUU;

/* JADX INFO: loaded from: classes18.dex */
public final class RecurringBuyPlanDetailLegacyViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $planId;
    int label;
    final /* synthetic */ RecurringBuyPlanDetailLegacyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringBuyPlanDetailLegacyViewModel$loadData$1(RecurringBuyPlanDetailLegacyViewModel recurringBuyPlanDetailLegacyViewModel, String str, Continuation<? super RecurringBuyPlanDetailLegacyViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = recurringBuyPlanDetailLegacyViewModel;
        this.$planId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecurringBuyPlanDetailLegacyViewModel$loadData$1(this.this$0, this.$planId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecurringBuyPlanDetailLegacyViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3 A[Catch: Exception -> 0x0128, TryCatch #0 {Exception -> 0x0128, blocks: (B:5:0x0010, B:13:0x004e, B:15:0x0058, B:20:0x0064, B:22:0x0068, B:29:0x0099, B:31:0x00a3, B:34:0x00a9, B:36:0x00ad, B:37:0x00b4, B:39:0x00b8, B:40:0x00d7, B:41:0x00dc, B:42:0x00dd, B:44:0x00e1, B:49:0x00eb, B:50:0x0118, B:23:0x006f, B:25:0x0073, B:26:0x0092, B:27:0x0097, B:10:0x0020), top: B:55:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9 A[Catch: Exception -> 0x0128, TryCatch #0 {Exception -> 0x0128, blocks: (B:5:0x0010, B:13:0x004e, B:15:0x0058, B:20:0x0064, B:22:0x0068, B:29:0x0099, B:31:0x00a3, B:34:0x00a9, B:36:0x00ad, B:37:0x00b4, B:39:0x00b8, B:40:0x00d7, B:41:0x00dc, B:42:0x00dd, B:44:0x00e1, B:49:0x00eb, B:50:0x0118, B:23:0x006f, B:25:0x0073, B:26:0x0092, B:27:0x0097, B:10:0x0020), top: B:55:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e1 A[Catch: Exception -> 0x0128, TryCatch #0 {Exception -> 0x0128, blocks: (B:5:0x0010, B:13:0x004e, B:15:0x0058, B:20:0x0064, B:22:0x0068, B:29:0x0099, B:31:0x00a3, B:34:0x00a9, B:36:0x00ad, B:37:0x00b4, B:39:0x00b8, B:40:0x00d7, B:41:0x00dc, B:42:0x00dd, B:44:0x00e1, B:49:0x00eb, B:50:0x0118, B:23:0x006f, B:25:0x0073, B:26:0x0092, B:27:0x0097, B:10:0x0020), top: B:55:0x000c }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objKWHzl;
        List<RecurringBuyFrequencyBean> list;
        AbstractC43419rot abstractC43419rot;
        RecurringBuyPlanDetailRootBean recurringBuyPlanDetailRootBean;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        Object objKWHzl2 = null;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Map mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("load_recurring_frequency_task_key", new RecurringBuyPlanDetailLegacyViewModel$loadData$1$apiResults$1(this.this$0, this.$planId, null)), C56390yDp.OLrzqt("load_plan_detail_task_key", new RecurringBuyPlanDetailLegacyViewModel$loadData$1$apiResults$2(this.this$0, this.$planId, null)));
                this.label = 1;
                obj = lTT.KWHzl(mapGEmmrt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            Map map = (Map) obj;
            Object obj2 = map.get("load_recurring_frequency_task_key");
            AbstractC43419rot abstractC43419rot2 = obj2 instanceof AbstractC43419rot ? (AbstractC43419rot) obj2 : null;
            if (abstractC43419rot2 == null) {
                objKWHzl = null;
                list = (List) objKWHzl;
                Object obj3 = map.get("load_plan_detail_task_key");
                abstractC43419rot = obj3 instanceof AbstractC43419rot ? (AbstractC43419rot) obj3 : null;
                if (abstractC43419rot != null) {
                    if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                        objKWHzl2 = ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    } else {
                        if (!(abstractC43419rot instanceof AbstractC43419rot.ActionBar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pUU.copydefault("API task failed", "Task 'load_plan_detail_task_key' failed: " + ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl());
                    }
                }
                recurringBuyPlanDetailRootBean = (RecurringBuyPlanDetailRootBean) objKWHzl2;
                if (list != null && !list.isEmpty() && recurringBuyPlanDetailRootBean != null) {
                    this.this$0.gEmmrt = RecurringBuyPlanStatus.Companion.KWHzl(recurringBuyPlanDetailRootBean.getStatus());
                    RecurringBuyPlanDetailLegacyViewModel recurringBuyPlanDetailLegacyViewModel = this.this$0;
                    lQE lqeKWHzl = recurringBuyPlanDetailLegacyViewModel.values.KWHzl(recurringBuyPlanDetailRootBean, list);
                    mHA.OLrzqt.OLrzqt(this.this$0.AYXKKw, new InterfaceC30234lQv.ActionBar(lqeKWHzl));
                    recurringBuyPlanDetailLegacyViewModel.valueOf = lqeKWHzl;
                }
                mHA.OLrzqt.OLrzqt(this.this$0.AYXKKw, InterfaceC30234lQv.Activity.AEQbTJ);
                return Unit.INSTANCE;
            }
            if (abstractC43419rot2 instanceof AbstractC43419rot.StateListAnimator) {
                objKWHzl = ((AbstractC43419rot.StateListAnimator) abstractC43419rot2).KWHzl();
                list = (List) objKWHzl;
                Object obj32 = map.get("load_plan_detail_task_key");
                if (obj32 instanceof AbstractC43419rot) {
                }
                if (abstractC43419rot != null) {
                }
                recurringBuyPlanDetailRootBean = (RecurringBuyPlanDetailRootBean) objKWHzl2;
                if (list != null) {
                    this.this$0.gEmmrt = RecurringBuyPlanStatus.Companion.KWHzl(recurringBuyPlanDetailRootBean.getStatus());
                    RecurringBuyPlanDetailLegacyViewModel recurringBuyPlanDetailLegacyViewModel2 = this.this$0;
                    lQE lqeKWHzl2 = recurringBuyPlanDetailLegacyViewModel2.values.KWHzl(recurringBuyPlanDetailRootBean, list);
                    mHA.OLrzqt.OLrzqt(this.this$0.AYXKKw, new InterfaceC30234lQv.ActionBar(lqeKWHzl2));
                    recurringBuyPlanDetailLegacyViewModel2.valueOf = lqeKWHzl2;
                }
                mHA.OLrzqt.OLrzqt(this.this$0.AYXKKw, InterfaceC30234lQv.Activity.AEQbTJ);
                return Unit.INSTANCE;
            }
            if (!(abstractC43419rot2 instanceof AbstractC43419rot.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            pUU.copydefault("API task failed", "Task 'load_recurring_frequency_task_key' failed: " + ((AbstractC43419rot.ActionBar) abstractC43419rot2).KWHzl());
            objKWHzl = null;
            list = (List) objKWHzl;
            Object obj322 = map.get("load_plan_detail_task_key");
            if (obj322 instanceof AbstractC43419rot) {
            }
            if (abstractC43419rot != null) {
            }
            recurringBuyPlanDetailRootBean = (RecurringBuyPlanDetailRootBean) objKWHzl2;
            if (list != null) {
            }
            mHA.OLrzqt.OLrzqt(this.this$0.AYXKKw, InterfaceC30234lQv.Activity.AEQbTJ);
            return Unit.INSTANCE;
        } catch (Exception unused) {
            mHA.OLrzqt.OLrzqt(this.this$0.AYXKKw, InterfaceC30234lQv.Activity.AEQbTJ);
        }
        return Unit.INSTANCE;
    }
}
