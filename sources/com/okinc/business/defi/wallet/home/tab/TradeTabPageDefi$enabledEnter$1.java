package com.okinc.business.defi.wallet.home.tab;

import android.content.Context;
import com.okinc.business.defi.api.bean.DexFeature;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C18170fdO;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC9772bbr;

/* JADX INFO: loaded from: classes5.dex */
public final class TradeTabPageDefi$enabledEnter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ C18170fdO this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeTabPageDefi$enabledEnter$1(C18170fdO c18170fdO, Context context, Continuation<? super TradeTabPageDefi$enabledEnter$1> continuation) {
        super(2, continuation);
        this.this$0 = c18170fdO;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeTabPageDefi$enabledEnter$1(this.this$0, this.$context, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((TradeTabPageDefi$enabledEnter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        InterfaceC9772bbr interfaceC9772bbr;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            List listDbNXlk = this.this$0.DbNXlk();
            if (listDbNXlk == null || (interfaceC9772bbr = (InterfaceC9772bbr) CollectionsKt___CollectionsKt.AuCTelauCTel(listDbNXlk)) == null) {
                zBooleanValue = false;
                return C56443yFo.KWHzl(!zBooleanValue);
            }
            Context context = this.$context;
            DexFeature dexFeature = DexFeature.TRADE;
            this.label = 1;
            obj = interfaceC9772bbr.KWHzl(context, dexFeature, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        return C56443yFo.KWHzl(!zBooleanValue);
    }
}
