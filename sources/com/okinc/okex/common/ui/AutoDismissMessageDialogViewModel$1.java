package com.okinc.okex.common.ui;

import androidx.lifecycle.MutableLiveData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C32989mnw;
import o.C45318snY;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes23.dex */
public final class AutoDismissMessageDialogViewModel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ C45318snY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoDismissMessageDialogViewModel$1(C45318snY c45318snY, Continuation<? super AutoDismissMessageDialogViewModel$1> continuation) {
        super(2, continuation);
        this.this$0 = c45318snY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AutoDismissMessageDialogViewModel$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AutoDismissMessageDialogViewModel$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x006d -> B:14:0x0070). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        int i2;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = this.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            int iIntValue = this.this$0.AhwBna.intValue();
            if (iIntValue >= 0) {
                i = 0;
                i2 = iIntValue;
                int iIntValue2 = this.this$0.AhwBna.intValue();
                MutableLiveData mutableLiveData = this.this$0.copydefault;
                C45318snY c45318snY = this.this$0;
                mutableLiveData.setValue(c45318snY.KWHzl(c45318snY.AEQbTJ.intValue(), C56423yEv.EZpvd(C56390yDp.OLrzqt(this.this$0.EZpvd, C56443yFo.AEQbTJ(iIntValue2 - i)))));
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 1;
                if (DelayKt.delay(1000L, this) == objCopydefault) {
                }
                if (i != i2) {
                }
            }
            MutableLiveData mutableLiveData2 = this.this$0.OLrzqt;
            Unit unit = Unit.INSTANCE;
            mutableLiveData2.setValue(new C32989mnw(unit));
            return unit;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = this.I$1;
        i = this.I$0;
        C56391yDq.AEQbTJ(obj);
        if (i != i2) {
            i++;
            int iIntValue22 = this.this$0.AhwBna.intValue();
            MutableLiveData mutableLiveData3 = this.this$0.copydefault;
            C45318snY c45318snY2 = this.this$0;
            mutableLiveData3.setValue(c45318snY2.KWHzl(c45318snY2.AEQbTJ.intValue(), C56423yEv.EZpvd(C56390yDp.OLrzqt(this.this$0.EZpvd, C56443yFo.AEQbTJ(iIntValue22 - i)))));
            this.I$0 = i;
            this.I$1 = i2;
            this.label = 1;
            if (DelayKt.delay(1000L, this) == objCopydefault) {
                return objCopydefault;
            }
            if (i != i2) {
            }
        }
        MutableLiveData mutableLiveData22 = this.this$0.OLrzqt;
        Unit unit2 = Unit.INSTANCE;
        mutableLiveData22.setValue(new C32989mnw(unit2));
        return unit2;
    }
}
