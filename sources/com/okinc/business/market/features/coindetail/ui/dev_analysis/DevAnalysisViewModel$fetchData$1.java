package com.okinc.business.market.features.coindetail.ui.dev_analysis;

import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.jNR;
import o.jNT;
import o.jNX;
import o.jOU;
import o.yDY;

/* JADX INFO: loaded from: classes6.dex */
public final class DevAnalysisViewModel$fetchData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ boolean $isInitialLoad;
    final /* synthetic */ int $page;
    final /* synthetic */ int $pageSize;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ DevAnalysisViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevAnalysisViewModel$fetchData$1(DevAnalysisViewModel devAnalysisViewModel, String str, String str2, int i, int i2, boolean z, Continuation<? super DevAnalysisViewModel$fetchData$1> continuation) {
        super(2, continuation);
        this.this$0 = devAnalysisViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$page = i;
        this.$pageSize = i2;
        this.$isInitialLoad = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DevAnalysisViewModel$fetchData$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$page, this.$pageSize, this.$isInitialLoad, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DevAnalysisViewModel$fetchData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        List<jNX> listDjBIcL;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            jNT jnt = this.this$0.EZpvd;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            int i2 = this.$page;
            int i3 = this.$pageSize;
            this.label = 1;
            objAEQbTJ = jnt.AEQbTJ(str, str2, i2, i3, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        DevAnalysisViewModel devAnalysisViewModel = this.this$0;
        boolean z = this.$isInitialLoad;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            jNR jnr = (jNR) objAEQbTJ;
            devAnalysisViewModel.copydefault.OLrzqt(C33129mqd.AhwBna(jnr.EZpvd()), C33129mqd.AhwBna(jnr.OLrzqt()));
            if (!z) {
                Object value = devAnalysisViewModel.AEQbTJ.getValue();
                jOU.TaskDescription taskDescription = value instanceof jOU.TaskDescription ? (jOU.TaskDescription) value : null;
                List<jNX> listCopydefault = taskDescription != null ? taskDescription.copydefault() : null;
                if (listCopydefault == null) {
                    listCopydefault = yDY.AhwBna();
                }
                listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) listCopydefault, (Iterable) jnr.KWHzl());
            } else {
                listDjBIcL = jnr.KWHzl();
            }
            devAnalysisViewModel.AEQbTJ.setValue(new jOU.TaskDescription(jnr.copydefault(), listDjBIcL));
            devAnalysisViewModel.copydefault.OLrzqt(false);
        }
        boolean z2 = this.$isInitialLoad;
        DevAnalysisViewModel devAnalysisViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
            if (z2) {
                devAnalysisViewModel2.AEQbTJ.setValue(jOU.ActionBar.EZpvd);
            }
            devAnalysisViewModel2.copydefault.OLrzqt(false);
        }
        return Unit.INSTANCE;
    }
}
