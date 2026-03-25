package com.okinc.business.dex.trade.copytrading.edit.ui.fragment;

import androidx.activity.result.ActivityResultLauncher;
import com.okinc.business.dex.trade.copytrading.edit.ui.viewmodel.CopyTradingEditStrategyViewModel;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSettingsContract;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C19900gTm;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes15.dex */
public final class CopyTradingSellSettingFragment$bindSellSettings$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C19900gTm this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingSellSettingFragment$bindSellSettings$3$1(C19900gTm c19900gTm, Continuation<? super CopyTradingSellSettingFragment$bindSellSettings$3$1> continuation) {
        super(2, continuation);
        this.this$0 = c19900gTm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CopyTradingSellSettingFragment$bindSellSettings$3$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CopyTradingSellSettingFragment$bindSellSettings$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ActivityResultLauncher activityResultLauncher;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityResultLauncher activityResultLauncher2 = this.this$0.copydefault;
            CopyTradingEditStrategyViewModel copyTradingEditStrategyViewModelCopydefault = this.this$0.copydefault();
            this.L$0 = activityResultLauncher2;
            this.label = 1;
            Object objEZpvd = copyTradingEditStrategyViewModelCopydefault.EZpvd(true, (Continuation<? super AdvancedSettingsContract.Input>) this);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            activityResultLauncher = activityResultLauncher2;
            obj = objEZpvd;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            activityResultLauncher = (ActivityResultLauncher) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        AdvancedSettingsContract.Input input = (AdvancedSettingsContract.Input) obj;
        if (input == null) {
            return Unit.INSTANCE;
        }
        activityResultLauncher.launch(input);
        return Unit.INSTANCE;
    }
}
