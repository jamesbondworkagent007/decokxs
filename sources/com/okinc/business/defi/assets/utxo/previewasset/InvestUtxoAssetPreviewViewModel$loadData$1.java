package com.okinc.business.defi.assets.utxo.previewasset;

import com.okinc.business.defi.assets.utxo.utxomanagement.AssetsUnderUtxo;
import com.okinc.business.defi.assets.utxo.utxomanagement.UtxoAssetItem;
import com.okinc.network.okg.response.OKServerException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC43419rot;
import o.C10306blv;
import o.C13934dbu;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC10310blz;
import o.pUU;
import o.yDY;

/* JADX INFO: loaded from: classes3.dex */
public final class InvestUtxoAssetPreviewViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InvestUtxoAssetPreviewParams $params;
    Object L$0;
    int label;
    final /* synthetic */ InvestUtxoAssetPreviewViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestUtxoAssetPreviewViewModel$loadData$1(InvestUtxoAssetPreviewViewModel investUtxoAssetPreviewViewModel, InvestUtxoAssetPreviewParams investUtxoAssetPreviewParams, Continuation<? super InvestUtxoAssetPreviewViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = investUtxoAssetPreviewViewModel;
        this.$params = investUtxoAssetPreviewParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestUtxoAssetPreviewViewModel$loadData$1(this.this$0, this.$params, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestUtxoAssetPreviewViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.KWHzl;
            InterfaceC10310blz.Activity activity = InterfaceC10310blz.Activity.copydefault;
            this.label = 1;
            if (mutableStateFlow.emit(activity, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        if (i != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                        return Unit.INSTANCE;
                    }
                    abstractC43419rot = (AbstractC43419rot) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    InvestUtxoAssetPreviewViewModel investUtxoAssetPreviewViewModel = this.this$0;
                    if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                        OKServerException oKServerException = (OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl();
                        pUU.KWHzl(oKServerException);
                        MutableStateFlow mutableStateFlow2 = investUtxoAssetPreviewViewModel.KWHzl;
                        InterfaceC10310blz.TaskDescription taskDescription = new InterfaceC10310blz.TaskDescription(oKServerException);
                        this.L$0 = abstractC43419rot;
                        this.label = 5;
                        if (mutableStateFlow2.emit(taskDescription, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                InvestUtxoAssetPreviewViewModel investUtxoAssetPreviewViewModel2 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    AssetsUnderUtxo assetsUnderUtxo = (AssetsUnderUtxo) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl();
                    if (assetsUnderUtxo.copydefault().isEmpty()) {
                        MutableStateFlow mutableStateFlow3 = investUtxoAssetPreviewViewModel2.KWHzl;
                        InterfaceC10310blz.StateListAnimator stateListAnimator = new InterfaceC10310blz.StateListAnimator(assetsUnderUtxo.OLrzqt(), yDY.AhwBna());
                        this.L$0 = abstractC43419rot;
                        this.label = 3;
                        if (mutableStateFlow3.emit(stateListAnimator, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        MutableStateFlow mutableStateFlow4 = investUtxoAssetPreviewViewModel2.KWHzl;
                        List<String> listOLrzqt = assetsUnderUtxo.OLrzqt();
                        List<UtxoAssetItem> listCopydefault = assetsUnderUtxo.copydefault();
                        C10306blv c10306blv = investUtxoAssetPreviewViewModel2.AEQbTJ;
                        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                        Iterator<T> it = listCopydefault.iterator();
                        while (it.hasNext()) {
                            arrayList.add(c10306blv.AEQbTJ((UtxoAssetItem) it.next()));
                        }
                        InterfaceC10310blz.StateListAnimator stateListAnimator2 = new InterfaceC10310blz.StateListAnimator(listOLrzqt, arrayList);
                        this.L$0 = abstractC43419rot;
                        this.label = 4;
                        if (mutableStateFlow4.emit(stateListAnimator2, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                }
                InvestUtxoAssetPreviewViewModel investUtxoAssetPreviewViewModel3 = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        C13934dbu c13934dbu = this.this$0.copydefault;
        String strCopydefault = this.$params.copydefault();
        int iOLrzqt = this.$params.OLrzqt();
        long jEZpvd = this.$params.EZpvd();
        int iKWHzl = this.$params.KWHzl();
        String strAEQbTJ = this.$params.AEQbTJ();
        this.label = 2;
        obj = c13934dbu.copydefault(strCopydefault, iOLrzqt, jEZpvd, iKWHzl, strAEQbTJ, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        InvestUtxoAssetPreviewViewModel investUtxoAssetPreviewViewModel22 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
        }
        InvestUtxoAssetPreviewViewModel investUtxoAssetPreviewViewModel32 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
