package com.okinc.tradingbot.impl.nmp.home;

import androidx.fragment.app.Fragment;
import com.okinc.unify_trade.biz.HomeStrategyCardInfo;
import com.okinc.unify_trade.biz.HomeStrategyCardResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C51995vxY;
import o.C54589xNz;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC54581xNr;
import o.rVN;

/* JADX INFO: loaded from: classes16.dex */
public final class NmpBotSquareFragment$subscribeOnUIChange$5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeStrategyCardResult $it;
    Object L$0;
    int label;
    final /* synthetic */ C51995vxY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NmpBotSquareFragment$subscribeOnUIChange$5$1(HomeStrategyCardResult homeStrategyCardResult, C51995vxY c51995vxY, Continuation<? super NmpBotSquareFragment$subscribeOnUIChange$5$1> continuation) {
        super(2, continuation);
        this.$it = homeStrategyCardResult;
        this.this$0 = c51995vxY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NmpBotSquareFragment$subscribeOnUIChange$5$1(this.$it, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NmpBotSquareFragment$subscribeOnUIChange$5$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0076 -> B:27:0x0079). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Iterator it;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List<HomeStrategyCardInfo> strategies = this.$it.getStrategies();
            if (strategies != null) {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(strategies, 10));
                Iterator<T> it2 = strategies.iterator();
                while (it2.hasNext()) {
                    String instType = ((HomeStrategyCardInfo) it2.next()).getInstType();
                    if (instType == null) {
                        instType = "";
                    }
                    arrayList.add(instType);
                }
                Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
                if (setOqFWZa != null) {
                    it = setOqFWZa.iterator();
                    while (it.hasNext()) {
                    }
                }
            }
            C51995vxY c51995vxY = this.this$0;
            c51995vxY.EZpvd((List<? extends Object>) C51995vxY.OLrzqt(c51995vxY).EZpvd());
            rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        it = (Iterator) this.L$0;
        C56391yDq.AEQbTJ(obj);
        while (it.hasNext()) {
            String str = (String) it.next();
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                this.L$0 = it;
                this.label = 1;
                obj = interfaceC54581xNrOLrzqt.EZpvd(str, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
                while (it.hasNext()) {
                }
            }
        }
        C51995vxY c51995vxY2 = this.this$0;
        c51995vxY2.EZpvd((List<? extends Object>) C51995vxY.OLrzqt(c51995vxY2).EZpvd());
        rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
        return Unit.INSTANCE;
    }
}
