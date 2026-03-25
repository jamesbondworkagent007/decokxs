package com.okinc.business.defi.wallet.tx.send;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.defi.api.model.tx.signdata.CeDefiTransferSignData;
import com.okinc.business.defi.api.model.tx.signdata.SignDataArgs;
import com.okinc.business.defi.wallet.tx.send.WalletSelectReceiveAddressForAAFragment$observeData$2;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.C19577gHn;
import o.C33129mqd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C9694baS;
import o.fXY;
import o.gGY;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletSelectReceiveAddressForAAFragment$observeData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ gGY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSelectReceiveAddressForAAFragment$observeData$2(gGY ggy, Continuation<? super WalletSelectReceiveAddressForAAFragment$observeData$2> continuation) {
        super(2, continuation);
        this.this$0 = ggy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSelectReceiveAddressForAAFragment$observeData$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSelectReceiveAddressForAAFragment$observeData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            SharedFlow<C19577gHn> sharedFlowEZpvd = this.this$0.OLrzqt().EZpvd();
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0);
            this.label = 1;
            if (sharedFlowEZpvd.collect(anonymousClass4, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.tx.send.WalletSelectReceiveAddressForAAFragment$observeData$2$4, reason: invalid class name */
    public static final class AnonymousClass4<T> implements FlowCollector {
        public final /* synthetic */ gGY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(gGY ggy) {
            this.AEQbTJ = ggy;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(C19577gHn c19577gHn, Continuation<? super Unit> continuation) {
            CeDeFiAAAssetInfo ceDeFiAAAssetInfoKWHzl = this.AEQbTJ.OLrzqt().KWHzl();
            if (ceDeFiAAAssetInfoKWHzl != null) {
                final gGY ggy = this.AEQbTJ;
                C9694baS.Application application = C9694baS.Companion;
                fXY.Application application2 = fXY.Companion;
                FragmentActivity activity = ggy.getActivity();
                if (activity == null) {
                    return Unit.INSTANCE;
                }
                application.KWHzl(ggy, application2.OLrzqt(activity, new SignDataArgs<>(ggy.OLrzqt().AEQbTJ(), null, C33129mqd.valueOf(ceDeFiAAAssetInfoKWHzl.getChainIndex()), new CeDefiTransferSignData(ceDeFiAAAssetInfoKWHzl.getAccountId(), ceDeFiAAAssetInfoKWHzl.getChainIndex(), ceDeFiAAAssetInfoKWHzl.getTokenAddress(), ceDeFiAAAssetInfoKWHzl.getAddress(), c19577gHn.OLrzqt(), ceDeFiAAAssetInfoKWHzl.getBalance(), ceDeFiAAAssetInfoKWHzl.getDecimalNum(), ceDeFiAAAssetInfoKWHzl.getDisplayPrecision(), ceDeFiAAAssetInfoKWHzl.getUsdValue(), ceDeFiAAAssetInfoKWHzl.getSymbol(), ceDeFiAAAssetInfoKWHzl.getLogo(), !ceDeFiAAAssetInfoKWHzl.isMainCoin(), c19577gHn.copydefault()), null, null, null, null, null, null, C56443yFo.AEQbTJ(1), null, null, C56443yFo.AEQbTJ(0), null, null, null, false, false, null, false, false, false, false, 16767986, null)), new Function2() { // from class: o.gHe
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return WalletSelectReceiveAddressForAAFragment$observeData$2.AnonymousClass4.OLrzqt(ggy, ((java.lang.Integer) obj).intValue(), (android.content.Intent) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        public static final Unit OLrzqt(gGY ggy, int i, Intent intent) {
            if (i == -1) {
                FragmentActivity activity = ggy.getActivity();
                if (activity != null) {
                    activity.setResult(i);
                }
                FragmentActivity activity2 = ggy.getActivity();
                if (activity2 != null) {
                    activity2.finish();
                }
            }
            return Unit.INSTANCE;
        }
    }
}
