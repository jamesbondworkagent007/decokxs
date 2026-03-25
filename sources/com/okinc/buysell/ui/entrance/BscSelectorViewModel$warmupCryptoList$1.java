package com.okinc.buysell.ui.entrance;

import com.okinc.crcore.coreapi.enums.TradeType;
import com.okinc.crcore.shared.net.responsebean.bsc.DefaultCurrencyBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31656lzd;
import o.C56391yDq;
import o.C56442yFn;
import o.lyD;
import o.lyR;

/* JADX INFO: loaded from: classes7.dex */
public final class BscSelectorViewModel$warmupCryptoList$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isCedefiEnabled;
    Object L$0;
    int label;
    final /* synthetic */ BscSelectorViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BscSelectorViewModel$warmupCryptoList$1(boolean z, BscSelectorViewModel bscSelectorViewModel, Continuation<? super BscSelectorViewModel$warmupCryptoList$1> continuation) {
        super(2, continuation);
        this.$isCedefiEnabled = z;
        this.this$0 = bscSelectorViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BscSelectorViewModel$warmupCryptoList$1(this.$isCedefiEnabled, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BscSelectorViewModel$warmupCryptoList$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [27=4] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC43419rot abstractC43419rot;
        AbstractC43419rot abstractC43419rot2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            if (this.$isCedefiEnabled) {
                lyD lyd = this.this$0.EZpvd;
                this.label = 1;
                obj = lyd.AEQbTJ(300, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                lyD lyd2 = this.this$0.EZpvd;
                this.label = 2;
                obj = lyd2.copydefault(300, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else if (i == 1) {
            C56391yDq.AEQbTJ(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        abstractC43419rot2 = (AbstractC43419rot) this.L$0;
                        C56391yDq.AEQbTJ(obj);
                        abstractC43419rot = abstractC43419rot2;
                        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC43419rot2 = (AbstractC43419rot) this.L$0;
                    C56391yDq.AEQbTJ(obj);
                    abstractC43419rot = abstractC43419rot2;
                    if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                    }
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                abstractC43419rot = (AbstractC43419rot) obj;
                boolean z = this.$isCedefiEnabled;
                BscSelectorViewModel bscSelectorViewModel = this.this$0;
                if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
                    String sell = ((DefaultCurrencyBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getSell();
                    if (z) {
                        C31656lzd c31656lzd = bscSelectorViewModel.KWHzl;
                        this.L$0 = abstractC43419rot;
                        this.label = 4;
                        Object sellCryptoAndDexList$default = C31656lzd.getSellCryptoAndDexList$default(c31656lzd, sell, false, this, 2, null);
                        if (sellCryptoAndDexList$default == objCopydefault) {
                            return objCopydefault;
                        }
                        abstractC43419rot2 = abstractC43419rot;
                        obj = sellCryptoAndDexList$default;
                        abstractC43419rot = abstractC43419rot2;
                    } else {
                        C31656lzd c31656lzd2 = bscSelectorViewModel.KWHzl;
                        this.L$0 = abstractC43419rot;
                        this.label = 5;
                        Object sellCryptoList$default = C31656lzd.getSellCryptoList$default(c31656lzd2, sell, false, this, 2, null);
                        if (sellCryptoList$default == objCopydefault) {
                            return objCopydefault;
                        }
                        abstractC43419rot2 = abstractC43419rot;
                        obj = sellCryptoList$default;
                        abstractC43419rot = abstractC43419rot2;
                    }
                }
                if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        lyR lyr = this.this$0.AEQbTJ;
        TradeType tradeType = TradeType.SELL;
        this.label = 3;
        obj = lyr.copydefault(tradeType, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        abstractC43419rot = (AbstractC43419rot) obj;
        boolean z2 = this.$isCedefiEnabled;
        BscSelectorViewModel bscSelectorViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
        }
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
        }
        return Unit.INSTANCE;
    }
}
