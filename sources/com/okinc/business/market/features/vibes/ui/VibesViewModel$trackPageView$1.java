package com.okinc.business.market.features.vibes.ui;

import com.okinc.business.market.features.vibes.ui.VibesViewModel$trackPageView$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27727kBc;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC9847bdM;

/* JADX INFO: loaded from: classes7.dex */
public final class VibesViewModel$trackPageView$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chainId;
    final /* synthetic */ String $tokenContractAddress;
    int label;
    final /* synthetic */ VibesViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VibesViewModel$trackPageView$1(VibesViewModel vibesViewModel, String str, String str2, Continuation<? super VibesViewModel$trackPageView$1> continuation) {
        super(2, continuation);
        this.this$0 = vibesViewModel;
        this.$chainId = str;
        this.$tokenContractAddress = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VibesViewModel$trackPageView$1(this.this$0, this.$chainId, this.$tokenContractAddress, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((VibesViewModel$trackPageView$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            VibesViewModel vibesViewModel = this.this$0;
            String str = this.$chainId;
            String str2 = this.$tokenContractAddress;
            this.label = 1;
            obj = vibesViewModel.EZpvd(str, str2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        final C27727kBc c27727kBc = (C27727kBc) obj;
        final String str3 = this.$tokenContractAddress;
        InterfaceC9847bdM.StateListAnimator.event$default((InterfaceC9847bdM) C43251rlk.copydefault(InterfaceC9847bdM.class), "DEXMarket_Vibes_Page_View", new TrackChannel[0], new Function1() { // from class: o.kBH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return VibesViewModel$trackPageView$1.invokeSuspend$lambda$0(c27727kBc, str3, (EventParamsList) obj2);
            }
        }, false, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(C27727kBc c27727kBc, String str, EventParamsList eventParamsList) {
        EventParamsList.put$default(eventParamsList, "chain_name", c27727kBc.KWHzl(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain_symbol", c27727kBc.OLrzqt(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_address", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_name", c27727kBc.AEQbTJ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "source", "MARKET", false, 4, null);
        EventParamsList.put$default(eventParamsList, "terminal", "android", false, 4, null);
        return Unit.INSTANCE;
    }
}
