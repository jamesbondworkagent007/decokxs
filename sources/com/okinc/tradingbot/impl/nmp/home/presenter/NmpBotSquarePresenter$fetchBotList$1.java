package com.okinc.tradingbot.impl.nmp.home.presenter;

import com.okinc.unify_trade.biz.HomeStrategyDropDownInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes11.dex */
public final class NmpBotSquarePresenter$fetchBotList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $baseCcy;
    final /* synthetic */ boolean $forceReload;
    final /* synthetic */ boolean $sortConfigChanged;
    int label;
    final /* synthetic */ NmpBotSquarePresenter this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NmpBotSquarePresenter$fetchBotList$1(String str, NmpBotSquarePresenter nmpBotSquarePresenter, boolean z, boolean z2, Continuation<? super NmpBotSquarePresenter$fetchBotList$1> continuation) {
        super(2, continuation);
        this.$baseCcy = str;
        this.this$0 = nmpBotSquarePresenter;
        this.$forceReload = z;
        this.$sortConfigChanged = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NmpBotSquarePresenter$fetchBotList$1(this.$baseCcy, this.this$0, this.$forceReload, this.$sortConfigChanged, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NmpBotSquarePresenter$fetchBotList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$baseCcy == null) {
                NmpBotSquarePresenter nmpBotSquarePresenter = this.this$0;
                this.label = 1;
                obj = nmpBotSquarePresenter.OLrzqt((HomeStrategyDropDownInfo) null, (Continuation<? super Boolean>) this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                zBooleanValue = false;
                if (!this.$forceReload || this.$sortConfigChanged || zBooleanValue) {
                    this.this$0.AYXKKw(this.$baseCcy);
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (!this.$forceReload) {
            this.this$0.AYXKKw(this.$baseCcy);
        }
        return Unit.INSTANCE;
    }
}
