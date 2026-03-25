package com.okinc.okmarket.ui.market.remind;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.market.bean.TokenInfoForAlert;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC46767tdQ;
import o.C46704tcG;
import o.C46705tcH;
import o.C46818teO;
import o.C46846teq;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class IAllPriceRemindActivity$onCreate$8$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C46705tcH $tmpItem;
    int label;
    final /* synthetic */ AbstractActivityC46767tdQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAllPriceRemindActivity$onCreate$8$1(C46705tcH c46705tcH, AbstractActivityC46767tdQ abstractActivityC46767tdQ, Continuation<? super IAllPriceRemindActivity$onCreate$8$1> continuation) {
        super(2, continuation);
        this.$tmpItem = c46705tcH;
        this.this$0 = abstractActivityC46767tdQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IAllPriceRemindActivity$onCreate$8$1(this.$tmpItem, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((IAllPriceRemindActivity$onCreate$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C46818teO c46818teOOLrzqt = C46818teO.Companion.OLrzqt(this.$tmpItem.values(), C46846teq.EZpvd.EZpvd(this.$tmpItem.KWHzl()), C46704tcG.copydefault(this.$tmpItem), (56 & 8) != 0 ? "" : null, (56 & 16) != 0 ? "" : this.$tmpItem.AhwBna(), (56 & 32) != 0 ? "" : "0", this.$tmpItem.AuCTel(), new TokenInfoForAlert(this.$tmpItem.AEQbTJ(), null, this.$tmpItem.fIwbmz(), this.$tmpItem.getNewProxyInstance(), this.$tmpItem.OLrzqt(), this.$tmpItem.hDKMBd(), null, null, false, 0, 962, null));
            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            this.label = 1;
            objOLrzqt = c46818teOOLrzqt.OLrzqt(supportFragmentManager, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = obj;
        }
        if (((Boolean) objOLrzqt).booleanValue()) {
            this.this$0.AEQbTJ();
        }
        return Unit.INSTANCE;
    }
}
