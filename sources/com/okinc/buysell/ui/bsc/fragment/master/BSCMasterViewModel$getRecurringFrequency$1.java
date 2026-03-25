package com.okinc.buysell.ui.bsc.fragment.master;

import com.okinc.buysell.data.BuyFrequencyOption;
import com.okinc.crcore.shared.net.responsebean.bsc.recurring.RecurringBuyFrequencyBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC31764mDa;
import o.mHA;

/* JADX INFO: loaded from: classes7.dex */
public final class BSCMasterViewModel$getRecurringFrequency$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BSCMasterViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BSCMasterViewModel$getRecurringFrequency$1(BSCMasterViewModel bSCMasterViewModel, Continuation<? super BSCMasterViewModel$getRecurringFrequency$1> continuation) {
        super(2, continuation);
        this.this$0 = bSCMasterViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BSCMasterViewModel$getRecurringFrequency$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BSCMasterViewModel$getRecurringFrequency$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC31764mDa interfaceC31764mDa = this.this$0.getFieldNames;
            this.label = 1;
            obj = InterfaceC31764mDa.ActionBar.getRecurringFrequency$default(interfaceC31764mDa, null, this, 1, null);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        BSCMasterViewModel bSCMasterViewModel = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            List list = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            if (list.isEmpty()) {
                mHA.OLrzqt.OLrzqt(bSCMasterViewModel.values, bSCMasterViewModel.getNewProxyInstance);
            } else {
                List list2 = bSCMasterViewModel.getNewProxyInstance;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(BuyFrequencyOption.Companion.copydefault((RecurringBuyFrequencyBean) it.next()));
                }
                mHA.OLrzqt.OLrzqt(bSCMasterViewModel.values, CollectionsKt___CollectionsKt.djBIcL((Collection) list2, (Iterable) arrayList));
            }
        }
        BSCMasterViewModel bSCMasterViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            mHA.OLrzqt.OLrzqt(bSCMasterViewModel2.values, bSCMasterViewModel2.getNewProxyInstance);
        }
        return Unit.INSTANCE;
    }
}
