package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import java.util.Collection;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28856kif;
import o.jNR;
import o.jNX;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class DevTokenTabViewModel$fetchData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ boolean $isInitialLoad;
    final /* synthetic */ int $page;
    final /* synthetic */ int $pageSize;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ DevTokenTabViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevTokenTabViewModel$fetchData$1(DevTokenTabViewModel devTokenTabViewModel, String str, String str2, int i, int i2, boolean z, Continuation<? super DevTokenTabViewModel$fetchData$1> continuation) {
        super(2, continuation);
        this.this$0 = devTokenTabViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
        this.$page = i;
        this.$pageSize = i2;
        this.$isInitialLoad = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DevTokenTabViewModel$fetchData$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$page, this.$pageSize, this.$isInitialLoad, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DevTokenTabViewModel$fetchData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<jNX> listDjBIcL;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineDispatcher coroutineDispatcher = this.this$0.AEQbTJ;
            DevTokenTabViewModel$fetchData$1$result$1 devTokenTabViewModel$fetchData$1$result$1 = new DevTokenTabViewModel$fetchData$1$result$1(this.this$0, this.$chainId, this.$tokenContractAddress, this.$page, this.$pageSize, null);
            this.label = 1;
            obj = BuildersKt.withContext(coroutineDispatcher, devTokenTabViewModel$fetchData$1$result$1, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        Object objM7386unboximpl = ((Result) obj).m7386unboximpl();
        DevTokenTabViewModel devTokenTabViewModel = this.this$0;
        boolean z = this.$isInitialLoad;
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            jNR jnr = (jNR) objM7386unboximpl;
            devTokenTabViewModel.djBIcL.copydefault(C33129mqd.AhwBna(jnr.EZpvd()), C33129mqd.AhwBna(jnr.OLrzqt()));
            if (!z) {
                Object value = devTokenTabViewModel.EZpvd.getValue();
                InterfaceC28856kif.StateListAnimator stateListAnimator = value instanceof InterfaceC28856kif.StateListAnimator ? (InterfaceC28856kif.StateListAnimator) value : null;
                List<jNX> listOLrzqt = stateListAnimator != null ? stateListAnimator.OLrzqt() : null;
                if (listOLrzqt == null) {
                    listOLrzqt = yDY.AhwBna();
                }
                listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((Collection) listOLrzqt, (Iterable) jnr.KWHzl());
            } else {
                listDjBIcL = jnr.KWHzl();
            }
            devTokenTabViewModel.EZpvd.setValue(new InterfaceC28856kif.StateListAnimator(jnr.copydefault(), listDjBIcL));
            devTokenTabViewModel.djBIcL.OLrzqt(false);
        }
        boolean z2 = this.$isInitialLoad;
        DevTokenTabViewModel devTokenTabViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
            if (z2) {
                devTokenTabViewModel2.EZpvd.setValue(InterfaceC28856kif.ActionBar.OLrzqt);
            }
            devTokenTabViewModel2.djBIcL.OLrzqt(false);
        }
        return Unit.INSTANCE;
    }
}
