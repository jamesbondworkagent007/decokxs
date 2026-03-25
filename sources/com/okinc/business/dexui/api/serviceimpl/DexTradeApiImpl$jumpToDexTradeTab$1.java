package com.okinc.business.dexui.api.serviceimpl;

import android.content.Context;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C23285hvO;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC28261kUw;

/* JADX INFO: loaded from: classes6.dex */
public final class DexTradeApiImpl$jumpToDexTradeTab$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ TradingType $currentMode;
    final /* synthetic */ Function1<Boolean, Unit> $loadingCallback;
    final /* synthetic */ TradeParam $param;
    int label;
    final /* synthetic */ C23285hvO this$0;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradingType.values().length];
            try {
                iArr[TradingType.Meme.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradingType.Advanced.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DexTradeApiImpl$jumpToDexTradeTab$1(TradingType tradingType, Context context, TradeParam tradeParam, Function1<? super Boolean, Unit> function1, C23285hvO c23285hvO, Continuation<? super DexTradeApiImpl$jumpToDexTradeTab$1> continuation) {
        super(2, continuation);
        this.$currentMode = tradingType;
        this.$context = context;
        this.$param = tradeParam;
        this.$loadingCallback = function1;
        this.this$0 = c23285hvO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexTradeApiImpl$jumpToDexTradeTab$1(this.$currentMode, this.$context, this.$param, this.$loadingCallback, this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexTradeApiImpl$jumpToDexTradeTab$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC28261kUw tradingModeProvider = this.$currentMode.getTradingModeProvider();
            Context context = this.$context;
            TradeParam tradeParam = this.$param;
            this.label = 1;
            objAEQbTJ = tradingModeProvider.AEQbTJ(context, tradeParam, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = obj;
        }
        boolean zBooleanValue = ((Boolean) objAEQbTJ).booleanValue();
        this.$loadingCallback.invoke(C56443yFo.KWHzl(false));
        if (!zBooleanValue) {
            C23285hvO c23285hvO = this.this$0;
            Context context2 = this.$context;
            TradeParam tradeParam2 = this.$param;
            c23285hvO.EZpvd(context2, tradeParam2.copy((15807 & 1) != 0 ? tradeParam2.walletId : null, (15807 & 2) != 0 ? tradeParam2.type : null, (15807 & 4) != 0 ? tradeParam2.fromCoinInfo : null, (15807 & 8) != 0 ? tradeParam2.toCoinInfo : null, (15807 & 16) != 0 ? tradeParam2.fromAmount : null, (15807 & 32) != 0 ? tradeParam2.addressType : null, (15807 & 64) != 0 ? tradeParam2.swapType : "type_swap", (15807 & 128) != 0 ? tradeParam2.isFromWalletCoinDetail : false, (15807 & 256) != 0 ? tradeParam2.tradeMode : null, (15807 & 512) != 0 ? tradeParam2.recordSwapTypeCache : null, (15807 & 1024) != 0 ? tradeParam2.isOldTradingDialog : false, (15807 & 2048) != 0 ? tradeParam2.sourcePageName : null, (15807 & 4096) != 0 ? tradeParam2.srcType : 0, (15807 & 8192) != 0 ? tradeParam2.strategyType : null));
        } else {
            int i2 = ActionBar.AEQbTJ[this.$currentMode.ordinal()];
            if (i2 == 1) {
                this.this$0.OLrzqt(this.$context, this.$param);
            } else if (i2 != 2) {
                this.this$0.EZpvd(this.$context, this.$param);
            } else {
                this.this$0.AEQbTJ(this.$context, this.$param);
            }
        }
        return Unit.INSTANCE;
    }
}
