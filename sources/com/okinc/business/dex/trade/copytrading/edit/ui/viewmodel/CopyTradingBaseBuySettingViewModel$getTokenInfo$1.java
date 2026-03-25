package com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel;

import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C19866gSf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingBaseBuySettingViewModel$getTokenInfo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexMultiTokenInfoBean $token;
    int label;
    final /* synthetic */ CopyTradingBaseBuySettingViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingBaseBuySettingViewModel$getTokenInfo$1(CopyTradingBaseBuySettingViewModel copyTradingBaseBuySettingViewModel, DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super CopyTradingBaseBuySettingViewModel$getTokenInfo$1> continuation) {
        super(2, continuation);
        this.this$0 = copyTradingBaseBuySettingViewModel;
        this.$token = dexMultiTokenInfoBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingBaseBuySettingViewModel$getTokenInfo$1(this.this$0, this.$token, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingBaseBuySettingViewModel$getTokenInfo$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C19866gSf c19866gSf = this.this$0.KWHzl;
            DexMultiTokenInfoBean dexMultiTokenInfoBean = this.$token;
            this.label = 1;
            obj = c19866gSf.KWHzl(dexMultiTokenInfoBean, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        CopyTradingBaseBuySettingViewModel copyTradingBaseBuySettingViewModel = this.this$0;
        DexMultiTokenInfoBean dexMultiTokenInfoBean2 = this.$token;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            copyTradingBaseBuySettingViewModel.OLrzqt.setValue(((DexMultiTokenInfoBean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).getAmountNum());
            copyTradingBaseBuySettingViewModel.AEQbTJ(dexMultiTokenInfoBean2);
        }
        CopyTradingBaseBuySettingViewModel copyTradingBaseBuySettingViewModel2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            copyTradingBaseBuySettingViewModel2.OLrzqt.setValue("");
        }
        return Unit.INSTANCE;
    }
}
