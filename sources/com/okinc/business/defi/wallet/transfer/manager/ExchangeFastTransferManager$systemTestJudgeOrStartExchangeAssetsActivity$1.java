package com.okinc.business.defi.wallet.transfer.manager;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractActivityC33041mov;
import o.C21027grx;
import o.C21118gti;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class ExchangeFastTransferManager$systemTestJudgeOrStartExchangeAssetsActivity$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ boolean $animationFromBottom;
    final /* synthetic */ FragmentManager $fragmentManager;
    final /* synthetic */ boolean $isFirstTimeUse;
    final /* synthetic */ String $walletId;
    final /* synthetic */ ActivityResultLauncher<C21118gti.Application> $withdrawalCoinsLauncher;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeFastTransferManager$systemTestJudgeOrStartExchangeAssetsActivity$1(FragmentActivity fragmentActivity, FragmentManager fragmentManager, boolean z, ActivityResultLauncher<C21118gti.Application> activityResultLauncher, String str, boolean z2, Continuation<? super ExchangeFastTransferManager$systemTestJudgeOrStartExchangeAssetsActivity$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$fragmentManager = fragmentManager;
        this.$isFirstTimeUse = z;
        this.$withdrawalCoinsLauncher = activityResultLauncher;
        this.$walletId = str;
        this.$animationFromBottom = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ExchangeFastTransferManager$systemTestJudgeOrStartExchangeAssetsActivity$1 exchangeFastTransferManager$systemTestJudgeOrStartExchangeAssetsActivity$1 = new ExchangeFastTransferManager$systemTestJudgeOrStartExchangeAssetsActivity$1(this.$activity, this.$fragmentManager, this.$isFirstTimeUse, this.$withdrawalCoinsLauncher, this.$walletId, this.$animationFromBottom, continuation);
        exchangeFastTransferManager$systemTestJudgeOrStartExchangeAssetsActivity$1.L$0 = obj;
        return exchangeFastTransferManager$systemTestJudgeOrStartExchangeAssetsActivity$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ExchangeFastTransferManager$systemTestJudgeOrStartExchangeAssetsActivity$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            C21027grx c21027grx = C21027grx.copydefault;
            FragmentActivity fragmentActivity = this.$activity;
            FragmentManager fragmentManager = this.$fragmentManager;
            this.L$0 = coroutineScope;
            this.label = 1;
            obj = c21027grx.OLrzqt(fragmentActivity, fragmentManager, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            Unit unit = null;
            if (this.$isFirstTimeUse) {
                FragmentActivity fragmentActivity2 = this.$activity;
                AbstractActivityC33041mov abstractActivityC33041mov = fragmentActivity2 instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivity2 : null;
                if (abstractActivityC33041mov != null) {
                    abstractActivityC33041mov.showLoading();
                }
                ActivityResultLauncher<C21118gti.Application> activityResultLauncher = this.$withdrawalCoinsLauncher;
                String str = this.$walletId;
                boolean z = this.$animationFromBottom;
                try {
                    Result.Application application = Result.Companion;
                    if (abstractActivityC33041mov != null) {
                        abstractActivityC33041mov.dismissLoading();
                    }
                    if (activityResultLauncher != null) {
                        activityResultLauncher.launch(new C21118gti.Application(str, z, true));
                        unit = Unit.INSTANCE;
                    }
                    Result.m7377constructorimpl(unit);
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
            } else {
                ActivityResultLauncher<C21118gti.Application> activityResultLauncher2 = this.$withdrawalCoinsLauncher;
                String str2 = this.$walletId;
                boolean z2 = this.$animationFromBottom;
                try {
                    Result.Application application3 = Result.Companion;
                    if (activityResultLauncher2 != null) {
                        activityResultLauncher2.launch(new C21118gti.Application(str2, z2, false));
                        unit = Unit.INSTANCE;
                    }
                    Result.m7377constructorimpl(unit);
                } catch (Throwable th2) {
                    Result.Application application4 = Result.Companion;
                    Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
