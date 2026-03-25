package com.okinc.business.market.features.meme.aped_together.ui;

import com.okinc.business.market.features.address_tracker.domain.TrackingAddressAlias;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C28653keo;
import o.C28655keq;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import o.InterfaceC28618keF;

/* JADX INFO: loaded from: classes7.dex */
public final class ApedTogetherViewModel$loadApedData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ ApedTogetherViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApedTogetherViewModel$loadApedData$1(ApedTogetherViewModel apedTogetherViewModel, String str, String str2, Continuation<? super ApedTogetherViewModel$loadApedData$1> continuation) {
        super(2, continuation);
        this.this$0 = apedTogetherViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ApedTogetherViewModel$loadApedData$1(this.this$0, this.$chainId, this.$tokenContractAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ApedTogetherViewModel$loadApedData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8663invokeyxL6bBk$default;
        InterfaceC28618keF actionBar;
        String strAYXKKw;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28655keq c28655keq = this.this$0.OLrzqt;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            String strCopydefault = this.this$0.gEmmrt.copydefault();
            this.label = 1;
            objM8663invokeyxL6bBk$default = C28655keq.m8663invokeyxL6bBk$default(c28655keq, str, str2, strCopydefault, 0, this, 8, null);
            if (objM8663invokeyxL6bBk$default == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objM8663invokeyxL6bBk$default = ((Result) obj).m7386unboximpl();
        }
        ApedTogetherViewModel apedTogetherViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM8663invokeyxL6bBk$default)) {
            List<C28653keo> list = (List) objM8663invokeyxL6bBk$default;
            MutableStateFlow<InterfaceC28618keF> mutableStateFlowKWHzl = apedTogetherViewModel.KWHzl();
            if (list.isEmpty()) {
                actionBar = InterfaceC28618keF.Application.KWHzl;
            } else {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (C28653keo c28653keo : list) {
                    TrackingAddressAlias trackingAddressAlias = (TrackingAddressAlias) apedTogetherViewModel.EZpvd.get(c28653keo.AhwBna());
                    if (trackingAddressAlias == null || (strAYXKKw = trackingAddressAlias.getAddressAlias()) == null) {
                        strAYXKKw = c28653keo.AYXKKw();
                    }
                    arrayList.add(c28653keo.AEQbTJ((2043 & 1) != 0 ? c28653keo.KWHzl : null, (2043 & 2) != 0 ? c28653keo.DbNXlk : null, (2043 & 4) != 0 ? c28653keo.djBIcL : strAYXKKw, (2043 & 8) != 0 ? c28653keo.EZpvd : null, (2043 & 16) != 0 ? c28653keo.OLrzqt : null, (2043 & 32) != 0 ? c28653keo.valueOf : null, (2043 & 64) != 0 ? c28653keo.AYXKKw : null, (2043 & 128) != 0 ? c28653keo.AhwBna : null, (2043 & 256) != 0 ? c28653keo.gEmmrt : null, (2043 & 512) != 0 ? c28653keo.AEQbTJ : null, (2043 & 1024) != 0 ? c28653keo.copydefault : null));
                }
                actionBar = new InterfaceC28618keF.ActionBar(arrayList);
            }
            mutableStateFlowKWHzl.setValue(actionBar);
        }
        ApedTogetherViewModel apedTogetherViewModel2 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objM8663invokeyxL6bBk$default) != null) {
            apedTogetherViewModel2.KWHzl().setValue(InterfaceC28618keF.StateListAnimator.EZpvd);
        }
        return Unit.INSTANCE;
    }
}
