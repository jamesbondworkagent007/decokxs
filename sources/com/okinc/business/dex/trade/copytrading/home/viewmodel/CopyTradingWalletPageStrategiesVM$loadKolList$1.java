package com.okinc.business.dex.trade.copytrading.home.viewmodel;

import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.TagExtraData;
import com.okinc.business.market.features.address_tracker_sa.domain.model.TopTradersItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.gWH;
import o.gWO;
import o.jBD;
import o.yDY;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingWalletPageStrategiesVM$loadKolList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ CopyTradingWalletPageStrategiesVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingWalletPageStrategiesVM$loadKolList$1(CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM, Continuation<? super CopyTradingWalletPageStrategiesVM$loadKolList$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingWalletPageStrategiesVM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingWalletPageStrategiesVM$loadKolList$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingWalletPageStrategiesVM$loadKolList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objOLrzqt;
        String strAhwBna;
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jBD jbd = this.this$0.gEmmrt;
            String str = this.this$0.copydefault;
            this.label = 1;
            objOLrzqt = jbd.OLrzqt(str, this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objOLrzqt = ((Result) obj).m7386unboximpl();
        }
        CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM = this.this$0;
        if (Result.m7384isSuccessimpl(objOLrzqt)) {
            List<TopTradersItem> list = (List) objOLrzqt;
            MutableStateFlow mutableStateFlow = copyTradingWalletPageStrategiesVM.AEQbTJ;
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (TopTradersItem topTradersItem : list) {
                Iterator<T> it = topTradersItem.getTraderList().iterator();
                while (true) {
                    strAhwBna = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((CompactTagData) next).copydefault(), (Object) "kol")) {
                        break;
                    }
                }
                CompactTagData compactTagData = (CompactTagData) next;
                TagExtraData tagExtraDataAEQbTJ = compactTagData != null ? compactTagData.AEQbTJ() : null;
                String strGEmmrt = tagExtraDataAEQbTJ != null ? tagExtraDataAEQbTJ.gEmmrt() : null;
                if (tagExtraDataAEQbTJ != null) {
                    strAhwBna = tagExtraDataAEQbTJ.AhwBna();
                }
                arrayList.add(new gWH.StateListAnimator(strGEmmrt, strAhwBna, topTradersItem.getPnl(), topTradersItem.getRoi()));
            }
            mutableStateFlow.setValue(new gWO.TaskDescription(arrayList));
        }
        CopyTradingWalletPageStrategiesVM copyTradingWalletPageStrategiesVM2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objOLrzqt) != null) {
            copyTradingWalletPageStrategiesVM2.AEQbTJ.setValue(new gWO.TaskDescription(yDY.AhwBna()));
        }
        return Unit.INSTANCE;
    }
}
