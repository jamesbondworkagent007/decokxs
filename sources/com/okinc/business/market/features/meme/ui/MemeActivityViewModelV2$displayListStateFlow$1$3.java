package com.okinc.business.market.features.meme.ui;

import com.okinc.business.market.features.meme.domain.model.MemeUiModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28694kfc;
import o.yDY;
import o.yEJ;
import o.yHO;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeActivityViewModelV2$displayListStateFlow$1$3 extends SuspendLambda implements yHO<Pair<? extends InterfaceC28694kfc, ? extends InterfaceC28694kfc>, InterfaceC28694kfc, Continuation<? super Pair<? extends InterfaceC28694kfc, ? extends InterfaceC28694kfc>>, Object> {
    final /* synthetic */ int $index;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ MemeActivityViewModelV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeActivityViewModelV2$displayListStateFlow$1$3(MemeActivityViewModelV2 memeActivityViewModelV2, int i, Continuation<? super MemeActivityViewModelV2$displayListStateFlow$1$3> continuation) {
        super(3, continuation);
        this.this$0 = memeActivityViewModelV2;
        this.$index = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHO
    public final Object invoke(Pair<? extends InterfaceC28694kfc, ? extends InterfaceC28694kfc> pair, InterfaceC28694kfc interfaceC28694kfc, Continuation<? super Pair<? extends InterfaceC28694kfc, ? extends InterfaceC28694kfc>> continuation) {
        MemeActivityViewModelV2$displayListStateFlow$1$3 memeActivityViewModelV2$displayListStateFlow$1$3 = new MemeActivityViewModelV2$displayListStateFlow$1$3(this.this$0, this.$index, continuation);
        memeActivityViewModelV2$displayListStateFlow$1$3.L$0 = pair;
        memeActivityViewModelV2$displayListStateFlow$1$3.L$1 = interfaceC28694kfc;
        return memeActivityViewModelV2$displayListStateFlow$1$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<MemeUiModel> listAhwBna;
        List<MemeUiModel> listAhwBna2;
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair pair = (Pair) this.L$0;
            InterfaceC28694kfc interfaceC28694kfc = (InterfaceC28694kfc) this.L$1;
            InterfaceC28694kfc interfaceC28694kfc2 = (InterfaceC28694kfc) pair.component2();
            InterfaceC28694kfc.Application application = interfaceC28694kfc2 instanceof InterfaceC28694kfc.Application ? (InterfaceC28694kfc.Application) interfaceC28694kfc2 : null;
            if (application == null || (listAhwBna = application.KWHzl()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            InterfaceC28694kfc.Application application2 = interfaceC28694kfc instanceof InterfaceC28694kfc.Application ? (InterfaceC28694kfc.Application) interfaceC28694kfc : null;
            if (application2 == null || (listAhwBna2 = application2.KWHzl()) == null) {
                listAhwBna2 = yDY.AhwBna();
            }
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
            for (MemeUiModel memeUiModel : listAhwBna) {
                arrayList.add(memeUiModel.AuCTel() + "_" + memeUiModel.KWHzl());
            }
            Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listAhwBna2, 10));
            for (MemeUiModel memeUiModel2 : listAhwBna2) {
                arrayList2.add(memeUiModel2.AuCTel() + "_" + memeUiModel2.KWHzl());
            }
            Set setEZpvd = yEJ.EZpvd(CollectionsKt___CollectionsKt.OqFWZa(arrayList2), (Iterable) setOqFWZa);
            if ((!listAhwBna.isEmpty()) && (!setEZpvd.isEmpty())) {
                this.this$0.AhwBna(this.$index);
            }
            return C56390yDp.OLrzqt(interfaceC28694kfc2, interfaceC28694kfc);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
