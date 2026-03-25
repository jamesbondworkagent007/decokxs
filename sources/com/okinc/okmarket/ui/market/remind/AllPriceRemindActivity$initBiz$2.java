package com.okinc.okmarket.ui.market.remind;

import androidx.lifecycle.MutableLiveData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC54531xLw;
import o.ActivityC46751tdA;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.yDY;
import o.yHT;

/* JADX INFO: loaded from: classes10.dex */
public final class AllPriceRemindActivity$initBiz$2 extends SuspendLambda implements yHT<Boolean, InterfaceC54581xNr, Exception, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ActivityC46751tdA this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllPriceRemindActivity$initBiz$2(ActivityC46751tdA activityC46751tdA, Continuation<? super AllPriceRemindActivity$initBiz$2> continuation) {
        super(4, continuation);
        this.this$0 = activityC46751tdA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // o.yHT
    public /* synthetic */ Object invoke(Boolean bool, InterfaceC54581xNr interfaceC54581xNr, Exception exc, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), interfaceC54581xNr, exc, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object invoke(boolean z, InterfaceC54581xNr interfaceC54581xNr, Exception exc, Continuation<? super Unit> continuation) {
        AllPriceRemindActivity$initBiz$2 allPriceRemindActivity$initBiz$2 = new AllPriceRemindActivity$initBiz$2(this.this$0, continuation);
        allPriceRemindActivity$initBiz$2.L$0 = interfaceC54581xNr;
        return allPriceRemindActivity$initBiz$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0074 -> B:19:0x0077). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007a -> B:21:0x007b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC54581xNr interfaceC54581xNr;
        ActivityC46751tdA activityC46751tdA;
        Iterator it;
        int i;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = this.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC54581xNr interfaceC54581xNr2 = (InterfaceC54581xNr) this.L$0;
            ArrayList arrayList = this.this$0.copydefault;
            interfaceC54581xNr = interfaceC54581xNr2;
            activityC46751tdA = this.this$0;
            it = arrayList.iterator();
            i = 0;
            if (!it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$1;
            int i3 = this.I$0;
            it = (Iterator) this.L$2;
            activityC46751tdA = (ActivityC46751tdA) this.L$1;
            interfaceC54581xNr = (InterfaceC54581xNr) this.L$0;
            C56391yDq.AEQbTJ(obj);
            AbstractC54531xLw abstractC54531xLw = (AbstractC54531xLw) obj;
            ((MutableLiveData) activityC46751tdA.copydefault.get(i)).postValue(abstractC54531xLw);
            i = i3;
            if (!it.hasNext()) {
                Object next = it.next();
                i3 = i + 1;
                if (i < 0) {
                    yDY.AYXKKw();
                }
                if (interfaceC54581xNr == null) {
                    abstractC54531xLw = null;
                    ((MutableLiveData) activityC46751tdA.copydefault.get(i)).postValue(abstractC54531xLw);
                    i = i3;
                    if (!it.hasNext()) {
                    }
                } else {
                    String str = activityC46751tdA.AkhnZx().get(i);
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    this.L$0 = interfaceC54581xNr;
                    this.L$1 = activityC46751tdA;
                    this.L$2 = it;
                    this.I$0 = i3;
                    this.I$1 = i;
                    this.label = 1;
                    obj = interfaceC54581xNr.EZpvd(str, this);
                    if (obj == objCopydefault) {
                        return objCopydefault;
                    }
                    AbstractC54531xLw abstractC54531xLw2 = (AbstractC54531xLw) obj;
                    ((MutableLiveData) activityC46751tdA.copydefault.get(i)).postValue(abstractC54531xLw2);
                    i = i3;
                    if (!it.hasNext()) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }
}
