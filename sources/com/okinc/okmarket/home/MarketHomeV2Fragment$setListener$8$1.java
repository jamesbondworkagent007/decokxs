package com.okinc.okmarket.home;

import android.os.Bundle;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2Fragment$setListener$8$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Bundle $bundle;
    Object L$0;
    int label;
    final /* synthetic */ MarketHomeV2Fragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeV2Fragment$setListener$8$1(Bundle bundle, MarketHomeV2Fragment marketHomeV2Fragment, Continuation<? super MarketHomeV2Fragment$setListener$8$1> continuation) {
        super(2, continuation);
        this.$bundle = bundle;
        this.this$0 = marketHomeV2Fragment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketHomeV2Fragment$setListener$8$1(this.$bundle, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketHomeV2Fragment$setListener$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String string;
        String str;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            string = this.$bundle.getString("InstType");
            String string2 = this.$bundle.getString("data");
            if (string2 != null) {
                int iHashCode = string2.hashCode();
                if (iHashCode != -336625236) {
                    if (iHashCode == -284735458 && string2.equals("up-rank")) {
                        MarketHomeV2ViewModel marketHomeV2ViewModelAubY = this.this$0.AubY();
                        this.L$0 = string;
                        this.label = 2;
                        if (marketHomeV2ViewModelAubY.copydefault(string, this) == objCopydefault) {
                            return objCopydefault;
                        }
                        str = string;
                    }
                } else if (string2.equals("hot-rank")) {
                    MarketHomeV2ViewModel marketHomeV2ViewModelAubY2 = this.this$0.AubY();
                    this.L$0 = string;
                    this.label = 1;
                    if (marketHomeV2ViewModelAubY2.KWHzl(string, this) == objCopydefault) {
                        return objCopydefault;
                    }
                    str = string;
                }
            }
            this.this$0.OLrzqt(string);
            return Unit.INSTANCE;
        }
        if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) this.L$0;
        C56391yDq.AEQbTJ(obj);
        string = str;
        this.this$0.OLrzqt(string);
        return Unit.INSTANCE;
    }
}
