package com.okinc.business.dexlogic.main.swap.coinlist;

import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.trade.features.home.domain.model.ChainBizType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C22593hiL;
import o.C28243kUe;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC22600hiS;
import o.InterfaceC28245kUg;
import o.kUH;
import o.yET;

/* JADX INFO: loaded from: classes6.dex */
public final class SelectNetWorkViewModel$loadChainList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ TradeMode $tradeMode;
    final /* synthetic */ ChainBizType $type;
    int label;
    final /* synthetic */ SelectNetWorkViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectNetWorkViewModel$loadChainList$1(SelectNetWorkViewModel selectNetWorkViewModel, ChainBizType chainBizType, TradeMode tradeMode, Continuation<? super SelectNetWorkViewModel$loadChainList$1> continuation) {
        super(2, continuation);
        this.this$0 = selectNetWorkViewModel;
        this.$type = chainBizType;
        this.$tradeMode = tradeMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SelectNetWorkViewModel$loadChainList$1(this.this$0, this.$type, this.$tradeMode, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SelectNetWorkViewModel$loadChainList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        List listEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kUH kuh = this.this$0.KWHzl;
            ChainBizType chainBizType = this.$type;
            this.label = 1;
            obj = kuh.EZpvd(chainBizType, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        List<DefiChainInfo> list = (List) ((AbstractC43419rot) obj).copydefault();
        if (list == null) {
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        SelectNetWorkViewModel selectNetWorkViewModel = this.this$0;
        ChainBizType chainBizType2 = this.$type;
        TradeMode tradeMode = this.$tradeMode;
        for (DefiChainInfo defiChainInfo : list) {
            InterfaceC28245kUg interfaceC28245kUgKWHzl = selectNetWorkViewModel.KWHzl.KWHzl(new C28243kUe(chainBizType2, defiChainInfo, selectNetWorkViewModel.EZpvd, selectNetWorkViewModel.copydefault, tradeMode));
            if (Intrinsics.EZpvd(interfaceC28245kUgKWHzl, InterfaceC28245kUg.StateListAnimator.OLrzqt)) {
                Unit unit = Unit.INSTANCE;
            } else if (Intrinsics.EZpvd(interfaceC28245kUgKWHzl, InterfaceC28245kUg.Activity.copydefault)) {
                C56443yFo.KWHzl(arrayList.add(new C22593hiL(defiChainInfo, true)));
            } else {
                if (!Intrinsics.EZpvd(interfaceC28245kUgKWHzl, InterfaceC28245kUg.TaskDescription.copydefault)) {
                    throw new NoWhenBranchMatchedException();
                }
                C56443yFo.KWHzl(arrayList.add(new C22593hiL(defiChainInfo, false)));
            }
        }
        MutableStateFlow mutableStateFlow = this.this$0.AEQbTJ;
        TradeMode tradeMode2 = this.$tradeMode;
        if (tradeMode2 != null) {
            listEZpvd = arrayList;
            if (!tradeMode2.isCopyTrading()) {
                listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new ActionBar());
            }
        }
        mutableStateFlow.setValue(new InterfaceC22600hiS.StateListAnimator(listEZpvd));
        return Unit.INSTANCE;
    }

    public static final class ActionBar<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((C22593hiL) t).KWHzl().getChainName(), ((C22593hiL) t2).KWHzl().getChainName());
        }
    }
}
