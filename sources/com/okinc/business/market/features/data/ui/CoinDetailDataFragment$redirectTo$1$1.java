package com.okinc.business.market.features.data.ui;

import com.okinc.business.market.features.data.domain.type.DataTabType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.C23505hzW;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.jQQ;

/* JADX INFO: loaded from: classes15.dex */
public final class CoinDetailDataFragment$redirectTo$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DataTabType $redirect;
    final /* synthetic */ C23505hzW $this_apply;
    int label;
    final /* synthetic */ jQQ this$0;

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DataTabType.values().length];
            try {
                iArr[DataTabType.HOLDERS_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataTabType.HOLDING_7D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataTabType.LIQUIDITY_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DataTabType.POOL_INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailDataFragment$redirectTo$1$1(DataTabType dataTabType, C23505hzW c23505hzW, jQQ jqq, Continuation<? super CoinDetailDataFragment$redirectTo$1$1> continuation) {
        super(2, continuation);
        this.$redirect = dataTabType;
        this.$this_apply = c23505hzW;
        this.this$0 = jqq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinDetailDataFragment$redirectTo$1$1(this.$redirect, this.$this_apply, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinDetailDataFragment$redirectTo$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        float y;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.label = 1;
            if (DelayKt.delay(500L, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        int i2 = Activity.copydefault[this.$redirect.ordinal()];
        if (i2 == 1) {
            y = this.$this_apply.KWHzl.getY();
        } else if (i2 == 2) {
            y = this.$this_apply.djBIcL.getY();
        } else if (i2 == 3) {
            y = this.$this_apply.AhwBna.getY();
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            y = this.$this_apply.isConnected.getY();
        }
        this.$this_apply.values.smoothScrollTo(0, C33129mqd.AhwBna(C56443yFo.OLrzqt(y)));
        this.this$0.AYXKKw = null;
        return Unit.INSTANCE;
    }
}
