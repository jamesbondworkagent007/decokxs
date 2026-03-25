package com.okinc.buysell.domain;

import com.okinc.buysell.domain.BothTokenSwitchedUseCase;
import com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean;
import com.okinc.crcore.shared.net.responsebean.CurrencySuggestionPairsBean;
import com.okinc.network.okg.response.OKServerException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import o.AbstractC43419rot;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.yDY;

/* JADX INFO: loaded from: classes18.dex */
public final class BothTokenSwitchedUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot<? extends Triple<? extends ConvertCurrencyBean, ? extends ConvertCurrencyBean, ? extends List<? extends ConvertCurrencyBean>>, ? extends OKServerException>>, Object> {
    final /* synthetic */ ConvertCurrencyBean $fromCcy;
    final /* synthetic */ ConvertCurrencyBean $toCcy;
    final /* synthetic */ String $valuationUnit;
    int label;
    final /* synthetic */ BothTokenSwitchedUseCase this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BothTokenSwitchedUseCase$invoke$2(ConvertCurrencyBean convertCurrencyBean, ConvertCurrencyBean convertCurrencyBean2, BothTokenSwitchedUseCase bothTokenSwitchedUseCase, String str, Continuation<? super BothTokenSwitchedUseCase$invoke$2> continuation) {
        super(2, continuation);
        this.$fromCcy = convertCurrencyBean;
        this.$toCcy = convertCurrencyBean2;
        this.this$0 = bothTokenSwitchedUseCase;
        this.$valuationUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BothTokenSwitchedUseCase$invoke$2(this.$fromCcy, this.$toCcy, this.this$0, this.$valuationUnit, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends Triple<? extends ConvertCurrencyBean, ? extends ConvertCurrencyBean, ? extends List<? extends ConvertCurrencyBean>>, ? extends OKServerException>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot<? extends Triple<ConvertCurrencyBean, ConvertCurrencyBean, ? extends List<ConvertCurrencyBean>>, OKServerException>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot<? extends Triple<ConvertCurrencyBean, ConvertCurrencyBean, ? extends List<ConvertCurrencyBean>>, OKServerException>> continuation) {
        return ((BothTokenSwitchedUseCase$invoke$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [T, com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean] */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = this.$fromCcy;
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                ?? r7 = this.$toCcy;
                objectRef2.element = r7;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(objectRef, this.$fromCcy, objectRef2, r7, this.this$0, this.$valuationUnit, null);
                this.label = 1;
                obj = CoroutineScopeKt.coroutineScope(anonymousClass1, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return (AbstractC43419rot) obj;
        } catch (OKServerException e) {
            return new AbstractC43419rot.ActionBar(e);
        }
    }

    /* JADX INFO: renamed from: com.okinc.buysell.domain.BothTokenSwitchedUseCase$invoke$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AbstractC43419rot.StateListAnimator<? extends Triple<? extends ConvertCurrencyBean, ? extends ConvertCurrencyBean, ? extends List<? extends ConvertCurrencyBean>>>>, Object> {
        final /* synthetic */ ConvertCurrencyBean $fromCcy;
        final /* synthetic */ Ref.ObjectRef<ConvertCurrencyBean> $newFromToken;
        final /* synthetic */ Ref.ObjectRef<ConvertCurrencyBean> $newToToken;
        final /* synthetic */ ConvertCurrencyBean $toCcy;
        final /* synthetic */ String $valuationUnit;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ BothTokenSwitchedUseCase this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<ConvertCurrencyBean> objectRef, ConvertCurrencyBean convertCurrencyBean, Ref.ObjectRef<ConvertCurrencyBean> objectRef2, ConvertCurrencyBean convertCurrencyBean2, BothTokenSwitchedUseCase bothTokenSwitchedUseCase, String str, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$newFromToken = objectRef;
            this.$fromCcy = convertCurrencyBean;
            this.$newToToken = objectRef2;
            this.$toCcy = convertCurrencyBean2;
            this.this$0 = bothTokenSwitchedUseCase;
            this.$valuationUnit = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$newFromToken, this.$fromCcy, this.$newToToken, this.$toCcy, this.this$0, this.$valuationUnit, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot.StateListAnimator<? extends Triple<? extends ConvertCurrencyBean, ? extends ConvertCurrencyBean, ? extends List<? extends ConvertCurrencyBean>>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super AbstractC43419rot.StateListAnimator<? extends Triple<ConvertCurrencyBean, ConvertCurrencyBean, ? extends List<ConvertCurrencyBean>>>>) continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super AbstractC43419rot.StateListAnimator<? extends Triple<ConvertCurrencyBean, ConvertCurrencyBean, ? extends List<ConvertCurrencyBean>>>> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v16, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v17, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v19, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v20, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
        /* JADX WARN: Type inference failed for: r3v7, types: [T, com.okinc.crcore.shared.net.responsebean.ConvertCurrencyBean] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            T t;
            List listAhwBna;
            Object next;
            Object next2;
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } else {
                C56391yDq.AEQbTJ(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                List listGEmmrt = yDY.gEmmrt(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new BothTokenSwitchedUseCase$invoke$2$1$deferredTasks$1(this.this$0, this.$valuationUnit, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new BothTokenSwitchedUseCase$invoke$2$1$deferredTasks$2(this.this$0, this.$newFromToken, this.$valuationUnit, null), 3, null), BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new BothTokenSwitchedUseCase$invoke$2$1$deferredTasks$3(this.this$0, this.$toCcy, this.$valuationUnit, null), 3, null));
                this.label = 1;
                obj = AwaitKt.awaitAll(listGEmmrt, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            }
            Map mapCopydefault = C56424yEw.copydefault((Iterable) obj);
            Object obj2 = mapCopydefault.get(BothTokenSwitchedUseCase.ApiTask.GET_CONVERT_FROM_LIST);
            AbstractC43419rot abstractC43419rot = obj2 instanceof AbstractC43419rot ? (AbstractC43419rot) obj2 : null;
            List list = abstractC43419rot != null ? (List) abstractC43419rot.copydefault() : null;
            Ref.ObjectRef<ConvertCurrencyBean> objectRef = this.$newFromToken;
            if (list != null) {
                ConvertCurrencyBean convertCurrencyBean = this.$fromCcy;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    if (Intrinsics.EZpvd((Object) ((ConvertCurrencyBean) next2).getCcy(), (Object) convertCurrencyBean.getCcy())) {
                        break;
                    }
                }
                ConvertCurrencyBean convertCurrencyBean2 = (ConvertCurrencyBean) next2;
                t = convertCurrencyBean2;
                if (convertCurrencyBean2 == null) {
                    t = this.$fromCcy;
                }
            }
            objectRef.element = t;
            Object obj3 = mapCopydefault.get(BothTokenSwitchedUseCase.ApiTask.GET_CONVERT_TO_LIST);
            AbstractC43419rot abstractC43419rot2 = obj3 instanceof AbstractC43419rot ? (AbstractC43419rot) obj3 : null;
            if (abstractC43419rot2 == null || (listAhwBna = (List) abstractC43419rot2.copydefault()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            Ref.ObjectRef<ConvertCurrencyBean> objectRef2 = this.$newToToken;
            ConvertCurrencyBean convertCurrencyBean3 = this.$toCcy;
            Iterator it2 = listAhwBna.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.EZpvd((Object) ((ConvertCurrencyBean) next).getCcy(), (Object) convertCurrencyBean3.getCcy())) {
                    break;
                }
            }
            ConvertCurrencyBean convertCurrencyBean4 = (ConvertCurrencyBean) next;
            T t2 = convertCurrencyBean4;
            if (convertCurrencyBean4 == null) {
                t2 = this.$toCcy;
            }
            objectRef2.element = t2;
            Object obj4 = mapCopydefault.get(BothTokenSwitchedUseCase.ApiTask.GET_PAIR_SUGGESTION);
            CurrencySuggestionPairsBean currencySuggestionPairsBean = obj4 instanceof CurrencySuggestionPairsBean ? (CurrencySuggestionPairsBean) obj4 : null;
            if (currencySuggestionPairsBean != null) {
                Ref.ObjectRef<ConvertCurrencyBean> objectRef3 = this.$newFromToken;
                Ref.ObjectRef<ConvertCurrencyBean> objectRef4 = this.$newToToken;
                for (?? r3 : yDY.valueOf(currencySuggestionPairsBean.getFrom(), currencySuggestionPairsBean.getTo())) {
                    String ccy = r3.getCcy();
                    if (Intrinsics.EZpvd((Object) ccy, (Object) objectRef3.element.getCcy())) {
                        objectRef3.element = r3;
                    } else if (Intrinsics.EZpvd((Object) ccy, (Object) objectRef4.element.getCcy())) {
                        objectRef4.element = r3;
                    }
                }
            }
            return new AbstractC43419rot.StateListAnimator(new Triple(this.$newFromToken.element, this.$newToToken.element, listAhwBna));
        }
    }
}
