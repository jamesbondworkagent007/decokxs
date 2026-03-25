package com.okinc.business.market.features.meme.ui;

import com.okinc.business.market.features.meme.domain.model.MemeUiModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import o.C28634keV;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28694kfc;
import o.InterfaceC28911kjh;
import o.yHT;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeActivityViewModelV2$displayListStateFlow$1$1$1 extends SuspendLambda implements yHT<InterfaceC28694kfc, InterfaceC28911kjh, C28634keV, Continuation<? super InterfaceC28694kfc>, Object> {
    final /* synthetic */ int $index;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ MemeActivityViewModelV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeActivityViewModelV2$displayListStateFlow$1$1$1(MemeActivityViewModelV2 memeActivityViewModelV2, int i, Continuation<? super MemeActivityViewModelV2$displayListStateFlow$1$1$1> continuation) {
        super(4, continuation);
        this.this$0 = memeActivityViewModelV2;
        this.$index = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.yHT
    public final Object invoke(InterfaceC28694kfc interfaceC28694kfc, InterfaceC28911kjh interfaceC28911kjh, C28634keV c28634keV, Continuation<? super InterfaceC28694kfc> continuation) {
        MemeActivityViewModelV2$displayListStateFlow$1$1$1 memeActivityViewModelV2$displayListStateFlow$1$1$1 = new MemeActivityViewModelV2$displayListStateFlow$1$1$1(this.this$0, this.$index, continuation);
        memeActivityViewModelV2$displayListStateFlow$1$1$1.L$0 = interfaceC28694kfc;
        memeActivityViewModelV2$displayListStateFlow$1$1$1.L$1 = interfaceC28911kjh;
        memeActivityViewModelV2$displayListStateFlow$1$1$1.L$2 = c28634keV;
        return memeActivityViewModelV2$displayListStateFlow$1$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28694kfc interfaceC28694kfc = (InterfaceC28694kfc) this.L$0;
            InterfaceC28911kjh interfaceC28911kjh = (InterfaceC28911kjh) this.L$1;
            C28634keV c28634keV = (C28634keV) this.L$2;
            InterfaceC28694kfc.TaskDescription taskDescription = InterfaceC28694kfc.TaskDescription.EZpvd;
            if (Intrinsics.EZpvd(interfaceC28694kfc, taskDescription)) {
                return taskDescription;
            }
            InterfaceC28694kfc.Activity activity = InterfaceC28694kfc.Activity.KWHzl;
            if (Intrinsics.EZpvd(interfaceC28694kfc, activity)) {
                return activity;
            }
            if (!(interfaceC28694kfc instanceof InterfaceC28694kfc.Application) || !(interfaceC28911kjh instanceof InterfaceC28911kjh.TaskDescription)) {
                return taskDescription;
            }
            List<MemeUiModel> listCopydefault = ((InterfaceC28911kjh.TaskDescription) interfaceC28911kjh).copydefault();
            MemeActivityViewModelV2 memeActivityViewModelV2 = this.this$0;
            int i = this.$index;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listCopydefault) {
                if (memeActivityViewModelV2.values.KWHzl(i, (MemeUiModel) obj2, c28634keV)) {
                    arrayList.add(obj2);
                }
            }
            List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((Iterable) arrayList, this.this$0.djBIcL);
            return listAhwBna.isEmpty() ? InterfaceC28694kfc.StateListAnimator.copydefault : this.this$0.copydefault((List<MemeUiModel>) listAhwBna, this.$index);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
