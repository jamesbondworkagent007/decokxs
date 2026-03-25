package com.okinc.kline.ui;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.okinc.buysell.api.BSCEntranceParameters;
import com.okinc.buysell.api.BSCTargetTab;
import com.okinc.buysell.api.data.BSCFlowType;
import com.okinc.buysell.api.data.OKPaymentSourceLegacy;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kline.data.QuotePriceBean;
import com.okinc.kline.ui.CoinMoreTradeFragmentV2$onCreate$1$1$1;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C32866mlf;
import o.C33069mpW;
import o.C33070mpX;
import o.C35964oKf;
import o.C37858pDh;
import o.C38516pas;
import o.C43251rlk;
import o.C56390yDp;
import o.C56391yDq;
import o.C56423yEv;
import o.C56442yFn;
import o.InterfaceC31422lti;
import o.InterfaceC54581xNr;
import o.pWO;

/* JADX INFO: loaded from: classes18.dex */
public final class CoinMoreTradeFragmentV2$onCreate$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Pair<String, String> $it;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C38516pas this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinMoreTradeFragmentV2$onCreate$1$1$1(C38516pas c38516pas, Pair<String, String> pair, Continuation<? super CoinMoreTradeFragmentV2$onCreate$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c38516pas;
        this.$it = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CoinMoreTradeFragmentV2$onCreate$1$1$1 coinMoreTradeFragmentV2$onCreate$1$1$1 = new CoinMoreTradeFragmentV2$onCreate$1$1$1(this.this$0, this.$it, continuation);
        coinMoreTradeFragmentV2$onCreate$1$1$1.L$0 = obj;
        return coinMoreTradeFragmentV2$onCreate$1$1$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CoinMoreTradeFragmentV2$onCreate$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            C38516pas c38516pas = this.this$0;
            View view = c38516pas.EZpvd;
            String strAYXKKw = C33070mpX.AYXKKw(C35964oKf.Fragment.gqOnQv);
            String strAYXKKw2 = C33070mpX.AYXKKw(C35964oKf.Fragment.DztXDE);
            final Pair<String, String> pair = this.$it;
            final C38516pas c38516pas2 = this.this$0;
            c38516pas.copydefault(view, strAYXKKw, strAYXKKw2, new Function0() { // from class: o.paK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return CoinMoreTradeFragmentV2$onCreate$1$1$1.invokeSuspend$lambda$1(pair, c38516pas2);
                }
            });
            TextView textView = this.this$0.AYXKKw;
            if (textView != null) {
                textView.setText(C33069mpW.copydefault(this.this$0, C35964oKf.Fragment.DFbvW, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, this.$it.getFirst()))));
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.this$0, this.$it, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(Pair pair, final C38516pas c38516pas) {
        TradeCoinInfo tradeCoinInfoAhwBna;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
        String symbol = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna((String) pair.getFirst())) == null) ? null : tradeCoinInfoAhwBna.getSymbol();
        InterfaceC31422lti interfaceC31422lti = (InterfaceC31422lti) C43251rlk.OLrzqt(InterfaceC31422lti.class);
        if (interfaceC31422lti != null) {
            FragmentActivity fragmentActivityRequireActivity = c38516pas.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC31422lti.KWHzl(fragmentActivityRequireActivity, new BSCEntranceParameters(BSCTargetTab.CONVERT, null, null, null, null, null, symbol == null ? "" : symbol, null, null, null, false, OKPaymentSourceLegacy.UNKNOWN_SOURCE, null, null, BSCFlowType.OFFSHORE, false, 47038, null), false, true);
        }
        C32866mlf.onEvent$default("Token_Trade_TokenList_Click", (TrackChannel[]) null, new Function1() { // from class: o.paH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return CoinMoreTradeFragmentV2$onCreate$1$1$1.invokeSuspend$lambda$1$lambda$0(c38516pas, (EventParamsList) obj);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$lambda$0(C38516pas c38516pas, EventParamsList eventParamsList) {
        String first;
        eventParamsList.put("type", "convert", true);
        Pair<String, String> value = c38516pas.gEmmrt().ejfBZ().getValue();
        if (value == null || (first = value.getFirst()) == null) {
            first = "";
        }
        EventParamsList.put$default(eventParamsList, "token", first, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.kline.ui.CoinMoreTradeFragmentV2$onCreate$1$1$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Pair<String, String> $it;
        Object L$0;
        int label;
        final /* synthetic */ C38516pas this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C38516pas c38516pas, Pair<String, String> pair, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = c38516pas;
            this.$it = pair;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$it, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM7377constructorimpl;
            Pair pair;
            C37858pDh c37858pDhGEmmrt;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            try {
            } catch (Throwable th) {
                Result.Application application = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                c37858pDhGEmmrt = this.this$0.gEmmrt();
                C37858pDh c37858pDhGEmmrt2 = this.this$0.gEmmrt();
                String first = this.$it.getFirst();
                this.L$0 = c37858pDhGEmmrt;
                this.label = 1;
                obj = c37858pDhGEmmrt2.copydefault(first, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7377constructorimpl = Result.m7377constructorimpl((Pair) obj);
                    pair = (Pair) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
                    if (pair != null) {
                        this.this$0.AEQbTJ();
                    } else {
                        C38516pas c38516pas = this.this$0;
                        Pair<String, String> pair2 = this.$it;
                        Intrinsics.copydefault(pair2);
                        c38516pas.KWHzl((Pair<String, String>) pair2, (Pair<String, QuotePriceBean>) pair);
                    }
                    return Unit.INSTANCE;
                }
                c37858pDhGEmmrt = (C37858pDh) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            if (!c37858pDhGEmmrt.EZpvd(((Boolean) obj).booleanValue())) {
                this.this$0.AEQbTJ();
                return Unit.INSTANCE;
            }
            C38516pas c38516pas2 = this.this$0;
            Pair<String, String> pair3 = this.$it;
            Result.Application application2 = Result.Companion;
            C37858pDh c37858pDhGEmmrt3 = c38516pas2.gEmmrt();
            String first2 = pair3.getFirst();
            this.L$0 = null;
            this.label = 2;
            obj = c37858pDhGEmmrt3.KWHzl(first2, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
            objM7377constructorimpl = Result.m7377constructorimpl((Pair) obj);
            pair = (Pair) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            if (pair != null) {
            }
            return Unit.INSTANCE;
        }
    }
}
