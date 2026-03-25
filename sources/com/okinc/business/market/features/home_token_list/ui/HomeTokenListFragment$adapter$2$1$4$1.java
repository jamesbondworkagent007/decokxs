package com.okinc.business.market.features.home_token_list.ui;

import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C21847hOn;
import o.C28518kcL;
import o.C28558kcz;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeTokenListFragment$adapter$2$1$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ HomeToken $item;
    int label;
    final /* synthetic */ C28558kcz this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeTokenListFragment$adapter$2$1$4$1(C28558kcz c28558kcz, HomeToken homeToken, Continuation<? super HomeTokenListFragment$adapter$2$1$4$1> continuation) {
        super(2, continuation);
        this.this$0 = c28558kcz;
        this.$item = homeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeTokenListFragment$adapter$2$1$4$1(this.this$0, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeTokenListFragment$adapter$2$1$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            String strCopydefault = C28518kcL.copydefault(this.this$0.djBIcL().EZpvd());
            String strOLrzqt = this.$item.OLrzqt();
            String strEZpvd = this.$item.EZpvd();
            String strAYXKKw = this.$item.AYXKKw();
            String strValues = this.$item.values();
            C21847hOn.EZpvd("app_web3", (114682 & 2) != 0 ? null : null, (114682 & 4) != 0 ? null : strCopydefault, (114682 & 8) != 0 ? null : null, (114682 & 16) != 0 ? null : null, (114682 & 32) != 0 ? null : strEZpvd, (114682 & 64) != 0 ? null : null, (114682 & 128) != 0 ? null : null, (114682 & 256) != 0 ? null : null, (114682 & 512) != 0 ? null : null, (114682 & 1024) != 0 ? null : strOLrzqt, (114682 & 2048) != 0 ? null : strAYXKKw, (114682 & 4096) != 0 ? null : strValues, (114682 & 8192) != 0 ? null : "xboost_launch_tag", this.this$0.AYXKKw().OLrzqt(), (32768 & 114682) != 0 ? null : C56443yFo.KWHzl(this.this$0.valueOf()), (114682 & 65536) != 0 ? null : this.this$0.djBIcL().EZpvd());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
