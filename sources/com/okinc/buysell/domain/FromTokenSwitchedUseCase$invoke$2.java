package com.okinc.buysell.domain;

import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.network.okg.response.OKServerException;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C31394ltG;
import o.C56391yDq;
import o.C56442yFn;
import o.lyH;
import o.lyK;
import o.lyV;

/* JADX INFO: loaded from: classes7.dex */
public final class FromTokenSwitchedUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends C31394ltG, ? extends OKServerException>>, Object> {
    final /* synthetic */ boolean $applyCachePolicy;
    final /* synthetic */ String $fromCcy;
    final /* synthetic */ String $localCurrency;
    final /* synthetic */ String $toCcy;
    int label;
    final /* synthetic */ lyH this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FromTokenSwitchedUseCase$invoke$2(lyH lyh, boolean z, String str, String str2, String str3, Continuation<? super FromTokenSwitchedUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = lyh;
        this.$applyCachePolicy = z;
        this.$fromCcy = str;
        this.$localCurrency = str2;
        this.$toCcy = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FromTokenSwitchedUseCase$invoke$2(this.this$0, this.$applyCachePolicy, this.$fromCcy, this.$localCurrency, this.$toCcy, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends C31394ltG, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<C31394ltG, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<C31394ltG, OKServerException>> continuation) {
        return ((FromTokenSwitchedUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        C31394ltG c31394ltG;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                lyV lyv = this.this$0.OLrzqt;
                boolean z = this.$applyCachePolicy;
                String str = this.$fromCcy;
                String str2 = this.$localCurrency;
                this.label = 1;
                obj = lyv.OLrzqt(z, str, str2, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            List list = (List) ((AbstractC43419rot) obj).AEQbTJ();
            String str3 = this.$toCcy;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((ConvertCurrencyBean) next).getCcy(), (Object) str3)) {
                    break;
                }
            }
            ConvertCurrencyBean convertCurrencyBean = (ConvertCurrencyBean) next;
            if (convertCurrencyBean != null) {
                return new AbstractC43419rot.StateListAnimator(new C31394ltG(convertCurrencyBean, list));
            }
            if (!list.isEmpty()) {
                c31394ltG = new C31394ltG((ConvertCurrencyBean) CollectionsKt___CollectionsKt.AuCTelauCTel(list), list);
            } else {
                String str4 = this.$fromCcy;
                lyK lyk = lyK.copydefault;
                if (Intrinsics.EZpvd((Object) str4, (Object) lyk.OLrzqt().getSecond().getCcy())) {
                    c31394ltG = new C31394ltG(lyk.OLrzqt().getFirst(), list);
                } else {
                    c31394ltG = new C31394ltG(lyk.OLrzqt().getSecond(), list);
                }
            }
            return new AbstractC43419rot.StateListAnimator(c31394ltG);
        } catch (OKServerException e) {
            return new AbstractC43419rot.ActionBar(e);
        }
    }
}
