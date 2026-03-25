package com.okinc.business.invest_biz.utils;

import android.content.Context;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.C43056riA;
import o.C43082ria;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.InterfaceC7340ahw;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsNavigation$navigate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Long $chainId;
    final /* synthetic */ Context $context;
    final /* synthetic */ CoroutineScope $customScope;
    final /* synthetic */ Integer $investmentCategory;
    final /* synthetic */ Long $investmentId;
    final /* synthetic */ boolean $isFromSubscription;
    final /* synthetic */ String $source;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsNavigation$navigate$1(Context context, CoroutineScope coroutineScope, Long l, Long l2, String str, Integer num, boolean z, Continuation<? super ProductDetailsNavigation$navigate$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$customScope = coroutineScope;
        this.$investmentId = l;
        this.$chainId = l2;
        this.$source = str;
        this.$investmentCategory = num;
        this.$isFromSubscription = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProductDetailsNavigation$navigate$1(this.$context, this.$customScope, this.$investmentId, this.$chainId, this.$source, this.$investmentCategory, this.$isFromSubscription, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProductDetailsNavigation$navigate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                Context applicationContext = this.$context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                final Long l = this.$investmentId;
                final Long l2 = this.$chainId;
                final String str = this.$source;
                final Integer num = this.$investmentCategory;
                final boolean z = this.$isFromSubscription;
                final Context context = this.$context;
                C43082ria.copydefault(applicationContext, new InterfaceC7340ahw() { // from class: com.okinc.business.invest_biz.utils.ProductDetailsNavigation$navigate$1.1
                    @Override // o.InterfaceC7340ahw
                    public void EZpvd(Throwable th) {
                        InterfaceC7340ahw.StateListAnimator.copydefault(this, th);
                    }

                    @Override // o.InterfaceC7340ahw
                    public void OLrzqt() {
                        Pair[] pairArr = new Pair[6];
                        pairArr[0] = C56390yDp.OLrzqt("appearance", "alternativeweb3");
                        pairArr[1] = C56390yDp.OLrzqt("investmentId", String.valueOf(l));
                        pairArr[2] = C56390yDp.OLrzqt("chainId", String.valueOf(l2));
                        String str2 = str;
                        if (str2 == null) {
                            str2 = "";
                        }
                        pairArr[3] = C56390yDp.OLrzqt("source", str2);
                        Integer num2 = num;
                        String string = num2 != null ? num2.toString() : null;
                        pairArr[4] = C56390yDp.OLrzqt("kind", string != null ? string : "");
                        pairArr[5] = C56390yDp.OLrzqt("isFromSubscription", Boolean.valueOf(z));
                        C43056riA.AEQbTJ.copydefault(context, "okluadiscover", "/defi/detail", C56424yEw.gEmmrt(pairArr));
                    }
                });
                CoroutineScopeKt.cancel$default(this.$customScope, null, 1, null);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                CoroutineScopeKt.cancel$default(this.$customScope, null, 1, null);
                throw th;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
