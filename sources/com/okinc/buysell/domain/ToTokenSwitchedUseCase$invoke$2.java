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
import o.C31663lzk;
import o.C56391yDq;
import o.C56442yFn;
import o.lyO;

/* JADX INFO: loaded from: classes7.dex */
public final class ToTokenSwitchedUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends C31394ltG, ? extends OKServerException>>, Object> {
    final /* synthetic */ ConvertCurrencyBean $fromCcy;
    final /* synthetic */ String $valuationUnit;
    int label;
    final /* synthetic */ C31663lzk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToTokenSwitchedUseCase$invoke$2(C31663lzk c31663lzk, String str, ConvertCurrencyBean convertCurrencyBean, Continuation<? super ToTokenSwitchedUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.this$0 = c31663lzk;
        this.$valuationUnit = str;
        this.$fromCcy = convertCurrencyBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ToTokenSwitchedUseCase$invoke$2(this.this$0, this.$valuationUnit, this.$fromCcy, continuation);
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
        return ((ToTokenSwitchedUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                lyO lyo = this.this$0.copydefault;
                String str = this.$valuationUnit;
                this.label = 1;
                obj = lyO.invoke$default(lyo, false, str, this, 1, null);
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
            ConvertCurrencyBean convertCurrencyBean = this.$fromCcy;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) ((ConvertCurrencyBean) next).getCcy(), (Object) convertCurrencyBean.getCcy())) {
                    break;
                }
            }
            ConvertCurrencyBean convertCurrencyBean2 = (ConvertCurrencyBean) next;
            if (convertCurrencyBean2 != null) {
                return new AbstractC43419rot.StateListAnimator(new C31394ltG(convertCurrencyBean2, list));
            }
            return new AbstractC43419rot.StateListAnimator(new C31394ltG(list.isEmpty() ^ true ? (ConvertCurrencyBean) CollectionsKt___CollectionsKt.AuCTelauCTel(list) : this.$fromCcy, list));
        } catch (OKServerException e) {
            return new AbstractC43419rot.ActionBar(e);
        }
    }
}
