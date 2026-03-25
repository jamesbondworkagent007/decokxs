package com.okinc.business.trade.features.home.advanced.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.AbstractC30503lcQ;
import o.C28196kSl;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30595leC;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderVM$handleAddBalance$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AbstractActivityC33041mov $activity;
    final /* synthetic */ boolean $forFee;
    int label;
    final /* synthetic */ AdvancedPlaceOrderVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderVM$handleAddBalance$1(AdvancedPlaceOrderVM advancedPlaceOrderVM, AbstractActivityC33041mov abstractActivityC33041mov, boolean z, Continuation<? super AdvancedPlaceOrderVM$handleAddBalance$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderVM;
        this.$activity = abstractActivityC33041mov;
        this.$forFee = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderVM$handleAddBalance$1(this.this$0, this.$activity, this.$forFee, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderVM$handleAddBalance$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        C28196kSl c28196kSl;
        AbstractActivityC33041mov abstractActivityC33041mov;
        String str2;
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28196kSl c28196kSl2 = this.this$0.DCUTEI;
            DexMultiTokenInfoBean value = this.this$0.ejfBZ().getValue();
            String chainId = value != null ? value.getChainId() : null;
            boolean z2 = this.this$0.RJOkX() || (this.this$0.djBIcL().getValue() instanceof AbstractC30503lcQ.StateListAnimator);
            this.label = 1;
            obj = c28196kSl2.copydefault(chainId, z2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                DexMultiTokenInfoBean value2 = this.this$0.ejfBZ().getValue();
                if (value2 == null || value2.isMainChainCoin()) {
                    str = "";
                    c28196kSl = this.this$0.DCUTEI;
                    abstractActivityC33041mov = this.$activity;
                    DexMultiTokenInfoBean value3 = this.this$0.ejfBZ().getValue();
                    String chainId2 = value3 != null ? value3.getChainId() : null;
                    str2 = chainId2 != null ? "" : chainId2;
                    z = this.$forFee;
                    this.label = 3;
                    if (c28196kSl.KWHzl(abstractActivityC33041mov, str2, str, z, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    DexMultiTokenInfoBean value4 = this.this$0.ejfBZ().getValue();
                    String tokenContractAddress = value4 != null ? value4.getTokenContractAddress() : null;
                    if (tokenContractAddress != null) {
                        str = tokenContractAddress;
                    }
                    c28196kSl = this.this$0.DCUTEI;
                    abstractActivityC33041mov = this.$activity;
                    DexMultiTokenInfoBean value32 = this.this$0.ejfBZ().getValue();
                    if (value32 != null) {
                    }
                    if (chainId2 != null) {
                    }
                    z = this.$forFee;
                    this.label = 3;
                    if (c28196kSl.KWHzl(abstractActivityC33041mov, str2, str, z, this) == objCopydefault) {
                    }
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        InterfaceC30595leC interfaceC30595leC = (InterfaceC30595leC) obj;
        if (interfaceC30595leC == null) {
            C28196kSl c28196kSl3 = this.this$0.DCUTEI;
            AbstractActivityC33041mov abstractActivityC33041mov2 = this.$activity;
            String str3 = this.this$0.accept;
            this.label = 2;
            obj = c28196kSl3.OLrzqt(abstractActivityC33041mov2, str3, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            if (!((Boolean) obj).booleanValue()) {
            }
        } else {
            this.this$0.EZpvd(interfaceC30595leC);
            return Unit.INSTANCE;
        }
    }
}
