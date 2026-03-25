package com.okinc.business.market.features.floatwindow.ui;

import com.okinc.business.market.features.holdings.domain.model.HoldingAsset;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28434kah;
import o.C56391yDq;
import o.C56442yFn;
import o.jWO;
import o.kKG;
import o.yDY;

/* JADX INFO: loaded from: classes7.dex */
public final class FloatWindowViewModel$getHoldingToken$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $forceLoad;
    final /* synthetic */ boolean $showLoading;
    int label;
    final /* synthetic */ FloatWindowViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatWindowViewModel$getHoldingToken$1(FloatWindowViewModel floatWindowViewModel, boolean z, boolean z2, Continuation<? super FloatWindowViewModel$getHoldingToken$1> continuation) {
        super(2, continuation);
        this.this$0 = floatWindowViewModel;
        this.$showLoading = z;
        this.$forceLoad = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FloatWindowViewModel$getHoldingToken$1(this.this$0, this.$showLoading, this.$forceLoad, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FloatWindowViewModel$getHoldingToken$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM8660invokeBWLJW6A$default;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kKG kkg = this.this$0.KWHzl;
            this.label = 1;
            obj = kkg.AEQbTJ(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM8660invokeBWLJW6A$default = ((Result) obj).m7386unboximpl();
                FloatWindowViewModel floatWindowViewModel = this.this$0;
                if (Result.m7384isSuccessimpl(objM8660invokeBWLJW6A$default)) {
                    floatWindowViewModel.OLrzqt.setValue(new jWO.Activity(floatWindowViewModel.KWHzl((List<HoldingAsset>) objM8660invokeBWLJW6A$default), 0L, false, 6, null));
                    floatWindowViewModel.djBIcL();
                }
                FloatWindowViewModel floatWindowViewModel2 = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objM8660invokeBWLJW6A$default) != null) {
                    floatWindowViewModel2.OLrzqt.setValue(jWO.ActionBar.AEQbTJ);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((CharSequence) obj).length() == 0) {
            this.this$0.OLrzqt.setValue(new jWO.Application(0L, 1, null));
            return Unit.INSTANCE;
        }
        Object value = this.this$0.OLrzqt.getValue();
        jWO.Activity activity = value instanceof jWO.Activity ? (jWO.Activity) value : null;
        List<HoldingAsset> listCopydefault = activity != null ? activity.copydefault() : null;
        if (listCopydefault == null) {
            listCopydefault = yDY.AhwBna();
        }
        List<HoldingAsset> list = listCopydefault;
        if (this.$showLoading) {
            this.this$0.OLrzqt.setValue(jWO.StateListAnimator.KWHzl);
        }
        if (this.$forceLoad || !(!list.isEmpty())) {
            C28434kah c28434kah = this.this$0.EZpvd;
            this.label = 2;
            objM8660invokeBWLJW6A$default = C28434kah.m8660invokeBWLJW6A$default(c28434kah, null, false, null, this, 5, null);
            if (objM8660invokeBWLJW6A$default == objCopydefault) {
                return objCopydefault;
            }
            FloatWindowViewModel floatWindowViewModel3 = this.this$0;
            if (Result.m7384isSuccessimpl(objM8660invokeBWLJW6A$default)) {
            }
            FloatWindowViewModel floatWindowViewModel22 = this.this$0;
            if (Result.m7380exceptionOrNullimpl(objM8660invokeBWLJW6A$default) != null) {
            }
            return Unit.INSTANCE;
        }
        this.this$0.djBIcL();
        this.this$0.OLrzqt.setValue(new jWO.Activity(list, 0L, false, 6, null));
        return Unit.INSTANCE;
    }
}
