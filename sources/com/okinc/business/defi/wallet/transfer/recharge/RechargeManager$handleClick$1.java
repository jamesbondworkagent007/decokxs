package com.okinc.business.defi.wallet.transfer.recharge;

import androidx.fragment.app.FragmentManager;
import com.okinc.business.defi.biz.net.bean.RechargeBean;
import com.okinc.business.defi.wallet.transfer.recharge.RechargeManager$handleClick$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C13754dXa;
import o.C14140dfo;
import o.C21027grx;
import o.C21139guC;
import o.C33070mpX;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC8223ayg;

/* JADX INFO: loaded from: classes5.dex */
public final class RechargeManager$handleClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ RechargeBean $item;
    final /* synthetic */ InterfaceC8223ayg $withdrawalEntryPoint;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RechargeManager$handleClick$1(AbstractActivityC33041mov abstractActivityC33041mov, RechargeBean rechargeBean, InterfaceC8223ayg interfaceC8223ayg, Continuation<? super RechargeManager$handleClick$1> continuation) {
        super(2, continuation);
        this.$activity = abstractActivityC33041mov;
        this.$item = rechargeBean;
        this.$withdrawalEntryPoint = interfaceC8223ayg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RechargeManager$handleClick$1(this.$activity, this.$item, this.$withdrawalEntryPoint, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RechargeManager$handleClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C21027grx c21027grx = C21027grx.copydefault;
            AbstractActivityC33041mov abstractActivityC33041mov = this.$activity;
            FragmentManager supportFragmentManager = abstractActivityC33041mov.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            this.label = 1;
            obj = c21027grx.OLrzqt(abstractActivityC33041mov, supportFragmentManager, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            if (!this.$item.getNavigationData().isTrackingWallet()) {
                C21139guC.OLrzqt.AEQbTJ(this.$withdrawalEntryPoint, this.$item.getNavigationData());
            } else {
                C14140dfo instance$default = C14140dfo.TaskDescription.getInstance$default(C14140dfo.Companion, null, 1, null);
                FragmentManager supportFragmentManager2 = this.$activity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "");
                String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AttrRes);
                String strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsPickMultipleVisualMedia);
                String strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.size);
                String strAYXKKw4 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContracts);
                final InterfaceC8223ayg interfaceC8223ayg = this.$withdrawalEntryPoint;
                final RechargeBean rechargeBean = this.$item;
                instance$default.copydefault(supportFragmentManager2, strAYXKKw, strAYXKKw2, strAYXKKw3, strAYXKKw4, new Function0() { // from class: o.gvl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return RechargeManager$handleClick$1.invokeSuspend$lambda$0(interfaceC8223ayg, rechargeBean);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(InterfaceC8223ayg interfaceC8223ayg, RechargeBean rechargeBean) {
        C21139guC.OLrzqt.AEQbTJ(interfaceC8223ayg, rechargeBean.getNavigationData());
        return Unit.INSTANCE;
    }
}
