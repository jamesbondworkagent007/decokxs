package com.okinc.business.trade.features.home.ui.cefi.placeorder;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.DeFiPlatformSelectionSource;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.data.V6QuoteRequestWrapper;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.ActivityC25022ioq;
import o.C31200lpY;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC56387yDm;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderFragment$onDexRouterClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AdvancedQuoteAndCallData $quoteData;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AdvancedPlaceOrderFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedPlaceOrderFragment$onDexRouterClick$1(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, AdvancedQuoteAndCallData advancedQuoteAndCallData, Continuation<? super AdvancedPlaceOrderFragment$onDexRouterClick$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedPlaceOrderFragment;
        this.$quoteData = advancedQuoteAndCallData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedPlaceOrderFragment$onDexRouterClick$1(this.this$0, this.$quoteData, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedPlaceOrderFragment$onDexRouterClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String value;
        Object objAEQbTJ;
        String str;
        String str2;
        String str3;
        ActivityC25022ioq.StateListAnimator stateListAnimator;
        Context context;
        Object objOLrzqt;
        InterfaceC56387yDm<String> interfaceC56387yDmCopydefault;
        V6QuoteRequestWrapper v6QuoteRequestWrapper;
        DeFiPlatformSelectionSource deFiPlatformSelectionSource;
        DexMultiTokenInfoBean fromToken;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        String chainId = null;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC25022ioq.StateListAnimator stateListAnimator2 = ActivityC25022ioq.Companion;
            FragmentActivity fragmentActivityRequireActivity = this.this$0.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            Fragment parentFragment = this.this$0.getParentFragment();
            if (parentFragment == null || (interfaceC56387yDmCopydefault = C31200lpY.copydefault(parentFragment)) == null || (value = interfaceC56387yDmCopydefault.getValue()) == null) {
                value = "default_trade";
            }
            String strAxsJAY = this.this$0.AEQbTJ().AxsJAY();
            String strZuBGHE = this.this$0.AEQbTJ().zuBGHE();
            if (this.this$0.AEQbTJ().aKErDB()) {
                AdvancedPlaceOrderVM advancedPlaceOrderVMAEQbTJ = this.this$0.AEQbTJ();
                this.L$0 = stateListAnimator2;
                this.L$1 = fragmentActivityRequireActivity;
                this.L$2 = value;
                this.L$3 = strAxsJAY;
                this.L$4 = strZuBGHE;
                this.label = 1;
                objOLrzqt = advancedPlaceOrderVMAEQbTJ.OLrzqt(this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                str = strZuBGHE;
                str2 = value;
                str3 = strAxsJAY;
                stateListAnimator = stateListAnimator2;
                context = fragmentActivityRequireActivity;
                v6QuoteRequestWrapper = new V6QuoteRequestWrapper((V6QuoteRequest) objOLrzqt, (V6QuoteAndCalldataRequest) null, 2, (DefaultConstructorMarker) null);
            } else {
                AdvancedPlaceOrderVM advancedPlaceOrderVMAEQbTJ2 = this.this$0.AEQbTJ();
                this.L$0 = stateListAnimator2;
                this.L$1 = fragmentActivityRequireActivity;
                this.L$2 = value;
                this.L$3 = strAxsJAY;
                this.L$4 = strZuBGHE;
                this.label = 2;
                objAEQbTJ = advancedPlaceOrderVMAEQbTJ2.AEQbTJ(this);
                if (objAEQbTJ == objCopydefault) {
                    return objCopydefault;
                }
                str = strZuBGHE;
                str2 = value;
                str3 = strAxsJAY;
                stateListAnimator = stateListAnimator2;
                context = fragmentActivityRequireActivity;
                v6QuoteRequestWrapper = new V6QuoteRequestWrapper((V6QuoteRequest) null, (V6QuoteAndCalldataRequest) objAEQbTJ, 1, (DefaultConstructorMarker) null);
            }
        } else if (i == 1) {
            str = (String) this.L$4;
            str3 = (String) this.L$3;
            String str4 = (String) this.L$2;
            Context context2 = (Context) this.L$1;
            ActivityC25022ioq.StateListAnimator stateListAnimator3 = (ActivityC25022ioq.StateListAnimator) this.L$0;
            C56391yDq.AEQbTJ(obj);
            stateListAnimator = stateListAnimator3;
            context = context2;
            str2 = str4;
            objOLrzqt = obj;
            v6QuoteRequestWrapper = new V6QuoteRequestWrapper((V6QuoteRequest) objOLrzqt, (V6QuoteAndCalldataRequest) null, 2, (DefaultConstructorMarker) null);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$4;
            str3 = (String) this.L$3;
            String str5 = (String) this.L$2;
            Context context3 = (Context) this.L$1;
            ActivityC25022ioq.StateListAnimator stateListAnimator4 = (ActivityC25022ioq.StateListAnimator) this.L$0;
            C56391yDq.AEQbTJ(obj);
            stateListAnimator = stateListAnimator4;
            context = context3;
            str2 = str5;
            objAEQbTJ = obj;
            v6QuoteRequestWrapper = new V6QuoteRequestWrapper((V6QuoteRequest) null, (V6QuoteAndCalldataRequest) objAEQbTJ, 1, (DefaultConstructorMarker) null);
        }
        String str6 = str;
        String str7 = str3;
        String str8 = str2;
        Context context4 = context;
        ActivityC25022ioq.StateListAnimator stateListAnimator5 = stateListAnimator;
        V6QuoteRequestWrapper v6QuoteRequestWrapper2 = v6QuoteRequestWrapper;
        V6BaseQuoteResponse v6BaseQuoteResponseSSMYrx = ((AdvancedQuoteAndCallData.V6) this.$quoteData).sSMYrx();
        if (this.this$0.AEQbTJ().DTwDnp().getValue() == AdvancedTradeType.BUY) {
            deFiPlatformSelectionSource = DeFiPlatformSelectionSource.ADVANCED_MODE_BUY;
        } else {
            deFiPlatformSelectionSource = DeFiPlatformSelectionSource.ADVANCED_MODE_SELL;
        }
        Intent intentAEQbTJ = stateListAnimator5.AEQbTJ(context4, str8, str7, str6, v6QuoteRequestWrapper2, v6BaseQuoteResponseSSMYrx, deFiPlatformSelectionSource, this.this$0.AEQbTJ().aKErDB());
        AdvancedPlaceOrderFragment advancedPlaceOrderFragment = this.this$0;
        CommonDexInfo commonDexInfo = ((AdvancedQuoteAndCallData.V6) this.$quoteData).sSMYrx().getCommonDexInfo();
        if (commonDexInfo != null && (fromToken = commonDexInfo.getFromToken()) != null) {
            chainId = fromToken.getChainId();
        }
        advancedPlaceOrderFragment.OLrzqt(chainId != null ? chainId : "", intentAEQbTJ);
        return Unit.INSTANCE;
    }
}
