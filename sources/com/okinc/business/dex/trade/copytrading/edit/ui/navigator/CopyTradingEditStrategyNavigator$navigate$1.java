package com.okinc.business.dex.trade.copytrading.edit.ui.navigator;

import androidx.activity.result.ActivityResultLauncher;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C23274hvD;
import o.C33069mpW;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.gSN;
import o.gTI;
import o.gWI;
import o.kUK;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingEditStrategyNavigator$navigate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ gSN.Application $input;
    final /* synthetic */ ActivityResultLauncher<gSN.Application> $launcher;
    final /* synthetic */ Integer $orderCount;
    int label;
    final /* synthetic */ gTI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingEditStrategyNavigator$navigate$1(Integer num, gTI gti, gSN.Application application, ActivityResultLauncher<gSN.Application> activityResultLauncher, Continuation<? super CopyTradingEditStrategyNavigator$navigate$1> continuation) {
        super(2, continuation);
        this.$orderCount = num;
        this.this$0 = gti;
        this.$input = application;
        this.$launcher = activityResultLauncher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingEditStrategyNavigator$navigate$1(this.$orderCount, this.this$0, this.$input, this.$launcher, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingEditStrategyNavigator$navigate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        List listAhwBna;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$orderCount != null) {
                gWI gwi = this.this$0.EZpvd;
                this.label = 1;
                obj = gwi.copydefault(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            if (this.$input.OLrzqt() != null) {
                kUK kuk = this.this$0.AEQbTJ;
                this.label = 2;
                obj = kuk.KWHzl(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                list = (List) ((AbstractC43419rot) obj).copydefault();
                if (list != null) {
                }
                if (!listAhwBna.contains(this.$input.OLrzqt())) {
                }
            }
            this.$launcher.launch(this.$input);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            list = (List) ((AbstractC43419rot) obj).copydefault();
            if (list != null) {
                listAhwBna = yDY.AhwBna();
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((DefiChainInfo) obj2).getSupportCopyTradeCreate()) {
                        arrayList.add(obj2);
                    }
                }
                listAhwBna = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    listAhwBna.add(((DefiChainInfo) it.next()).getChainId());
                }
            }
            if (!listAhwBna.contains(this.$input.OLrzqt())) {
                C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.gqOnQv, 0, 1, (Object) null);
                return Unit.INSTANCE;
            }
            this.$launcher.launch(this.$input);
            return Unit.INSTANCE;
        }
        C56391yDq.AEQbTJ(obj);
        int iIntValue = ((Number) obj).intValue();
        if (this.$orderCount.intValue() >= iIntValue) {
            C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(C23274hvD.Fragment.RcvFxC, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", String.valueOf(iIntValue)))), 0, 1, (Object) null);
            return Unit.INSTANCE;
        }
        if (this.$input.OLrzqt() != null) {
        }
        this.$launcher.launch(this.$input);
        return Unit.INSTANCE;
    }
}
