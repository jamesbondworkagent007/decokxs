package com.okinc.business.defi.wallet.imported;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C18377fhJ;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC18379fhL;
import o.InterfaceC18392fhY;
import o.yDY;
import o.yHO;

/* JADX INFO: loaded from: classes18.dex */
public final class SelectNetworkViewModel$selectNetworkStateStream$1 extends SuspendLambda implements yHO<List<? extends InterfaceC18379fhL>, Long, Continuation<? super C18377fhJ>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SelectNetworkViewModel$selectNetworkStateStream$1(Continuation<? super SelectNetworkViewModel$selectNetworkStateStream$1> continuation) {
        super(3, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(List<? extends InterfaceC18379fhL> list, Long l, Continuation<? super C18377fhJ> continuation) {
        SelectNetworkViewModel$selectNetworkStateStream$1 selectNetworkViewModel$selectNetworkStateStream$1 = new SelectNetworkViewModel$selectNetworkStateStream$1(continuation);
        selectNetworkViewModel$selectNetworkStateStream$1.L$0 = list;
        selectNetworkViewModel$selectNetworkStateStream$1.L$1 = l;
        return selectNetworkViewModel$selectNetworkStateStream$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ArrayList arrayList;
        Object activity;
        Object activity2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            List<InterfaceC18379fhL> list = (List) this.L$0;
            Long l = (Long) this.L$1;
            boolean z = false;
            if (l == null) {
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (!((InterfaceC18379fhL) it.next()).copydefault()) {
                        break;
                    }
                    i++;
                }
                arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                int i2 = 0;
                for (Object obj2 : list) {
                    if (i2 < 0) {
                        yDY.AYXKKw();
                    }
                    InterfaceC18379fhL interfaceC18379fhL = (InterfaceC18379fhL) obj2;
                    boolean z2 = i2 == i;
                    if (interfaceC18379fhL instanceof InterfaceC18379fhL.Activity) {
                        activity2 = new InterfaceC18392fhY.Application((InterfaceC18379fhL.Activity) interfaceC18379fhL, z2);
                    } else if (interfaceC18379fhL instanceof InterfaceC18379fhL.StateListAnimator) {
                        activity2 = new InterfaceC18392fhY.ActionBar((InterfaceC18379fhL.StateListAnimator) interfaceC18379fhL, z2);
                    } else {
                        if (!(interfaceC18379fhL instanceof InterfaceC18379fhL.ActionBar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        activity2 = new InterfaceC18392fhY.Activity((InterfaceC18379fhL.ActionBar) interfaceC18379fhL, z2);
                    }
                    arrayList.add(activity2);
                    i2++;
                }
            } else {
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (InterfaceC18379fhL interfaceC18379fhL2 : list) {
                    boolean z3 = interfaceC18379fhL2.KWHzl() == l.longValue();
                    if (interfaceC18379fhL2 instanceof InterfaceC18379fhL.Activity) {
                        activity = new InterfaceC18392fhY.Application((InterfaceC18379fhL.Activity) interfaceC18379fhL2, z3);
                    } else if (interfaceC18379fhL2 instanceof InterfaceC18379fhL.StateListAnimator) {
                        activity = new InterfaceC18392fhY.ActionBar((InterfaceC18379fhL.StateListAnimator) interfaceC18379fhL2, z3);
                    } else {
                        if (!(interfaceC18379fhL2 instanceof InterfaceC18379fhL.ActionBar)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        activity = new InterfaceC18392fhY.Activity((InterfaceC18379fhL.ActionBar) interfaceC18379fhL2, z3);
                    }
                    arrayList2.add(activity);
                }
                arrayList = arrayList2;
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((InterfaceC18392fhY) it2.next()).OLrzqt()) {
                        z = true;
                        break;
                    }
                }
            }
            return new C18377fhJ(arrayList, z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
