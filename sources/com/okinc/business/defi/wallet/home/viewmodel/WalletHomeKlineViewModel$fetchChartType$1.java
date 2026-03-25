package com.okinc.business.defi.wallet.home.viewmodel;

import com.okinc.business.defi.api.bean.ChartType;
import com.okinc.business.defi.wallet.home.viewmodel.WalletHomeKlineViewModel$fetchChartType$1;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC12782ctV;
import o.AbstractC18281ffT;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C18275ffN;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletHomeKlineViewModel$fetchChartType$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractC12782ctV $mainWallet;
    int label;
    final /* synthetic */ C18275ffN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletHomeKlineViewModel$fetchChartType$1(C18275ffN c18275ffN, AbstractC12782ctV abstractC12782ctV, Continuation<? super WalletHomeKlineViewModel$fetchChartType$1> continuation) {
        super(2, continuation);
        this.this$0 = c18275ffN;
        this.$mainWallet = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletHomeKlineViewModel$fetchChartType$1(this.this$0, this.$mainWallet, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletHomeKlineViewModel$fetchChartType$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13934dbu c13934dbu = this.this$0.fetchVPNInfo;
            this.label = 1;
            obj = c13934dbu.djBIcL(this);
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
        C18275ffN c18275ffN = this.this$0;
        AbstractC12782ctV abstractC12782ctV = this.$mainWallet;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            List<ChartType> list = (List) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
            ChartType chartType = (ChartType) CollectionsKt___CollectionsKt.firstOrNull(list);
            c18275ffN.valueOf.copydefault(list);
            if (chartType != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((ChartType) next).getChartTypeId() == c18275ffN.valueOf.OLrzqt()) {
                        break;
                    }
                }
                ChartType chartType2 = (ChartType) next;
                c18275ffN.OLrzqt(chartType2 != null ? chartType2.getChartTypeId() : chartType.getChartTypeId());
            } else {
                pUU.copydefault("WalletHomeKlineViewModel", "fetchChartType: `chartTypes` is empty");
            }
            c18275ffN.EZpvd(abstractC12782ctV);
        }
        C18275ffN c18275ffN2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            c18275ffN2.KWHzl(new Function1() { // from class: o.ffP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return WalletHomeKlineViewModel$fetchChartType$1.invokeSuspend$lambda$3$lambda$2((AbstractC18281ffT) obj2);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC18281ffT invokeSuspend$lambda$3$lambda$2(AbstractC18281ffT abstractC18281ffT) {
        return AbstractC18281ffT.TaskDescription.KWHzl;
    }
}
