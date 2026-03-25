package com.okinc.common.application;

import androidx.fragment.app.Fragment;
import com.okinc.okapm.okqpl.QPLMarker;
import com.okinc.okapm.okqpl.QPLType;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC32996moC;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class BaseApplication$initOKQPL$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isAppear;
    final /* synthetic */ long $timeStamp;
    final /* synthetic */ WeakReference<Fragment> $weakFragment;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplication$initOKQPL$1$1(WeakReference<Fragment> weakReference, boolean z, long j, Continuation<? super BaseApplication$initOKQPL$1$1> continuation) {
        super(2, continuation);
        this.$weakFragment = weakReference;
        this.$isAppear = z;
        this.$timeStamp = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseApplication$initOKQPL$1$1(this.$weakFragment, this.$isAppear, this.$timeStamp, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BaseApplication$initOKQPL$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            WeakReference<Fragment> weakReference = this.$weakFragment;
            Fragment fragment = weakReference != null ? weakReference.get() : null;
            if (fragment != null) {
                boolean z = this.$isAppear;
                long j = this.$timeStamp;
                if (fragment instanceof AbstractC32996moC) {
                    AbstractC32996moC abstractC32996moC = (AbstractC32996moC) fragment;
                    abstractC32996moC.getOkQPL().copydefault(QPLType.LIFE_CYCLE, z ? QPLMarker.LOADING_APPEAR : QPLMarker.LOADING_DISAPPEAR, abstractC32996moC.getQPLSourceName(), j);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
