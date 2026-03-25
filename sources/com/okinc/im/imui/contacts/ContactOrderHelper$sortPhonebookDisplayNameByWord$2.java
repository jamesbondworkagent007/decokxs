package com.okinc.im.imui.contacts;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C37246oqH;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59454zhO;
import o.yET;

/* JADX INFO: loaded from: classes18.dex */
public final class ContactOrderHelper$sortPhonebookDisplayNameByWord$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends C37246oqH>>, Object> {
    final /* synthetic */ List<C37246oqH> $this_sortPhonebookDisplayNameByWord;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactOrderHelper$sortPhonebookDisplayNameByWord$2(List<C37246oqH> list, Continuation<? super ContactOrderHelper$sortPhonebookDisplayNameByWord$2> continuation) {
        super(2, continuation);
        this.$this_sortPhonebookDisplayNameByWord = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactOrderHelper$sortPhonebookDisplayNameByWord$2(this.$this_sortPhonebookDisplayNameByWord, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends C37246oqH>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<C37246oqH>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<C37246oqH>> continuation) {
        return ((ContactOrderHelper$sortPhonebookDisplayNameByWord$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class ActionBar<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((C37246oqH) t).EZpvd(), ((C37246oqH) t2).EZpvd());
        }
    }

    public static final class StateListAnimator<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((C37246oqH) t).EZpvd(), ((C37246oqH) t2).EZpvd());
        }
    }

    public static final class TaskDescription<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((C37246oqH) t).EZpvd(), ((C37246oqH) t2).EZpvd());
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (C37246oqH c37246oqH : this.$this_sortPhonebookDisplayNameByWord) {
                String strEZpvd = c37246oqH.EZpvd();
                if (!C33129mqd.OLrzqt((CharSequence) strEZpvd)) {
                    strEZpvd = null;
                }
                Character chKWHzl = strEZpvd != null ? C56443yFo.KWHzl(C59454zhO.zLjUOn((CharSequence) strEZpvd)) : null;
                if (chKWHzl == null) {
                    arrayList3.add(c37246oqH);
                } else if (Character.isLetter(chKWHzl.charValue()) || Intrinsics.EZpvd((Object) chKWHzl.toString(), (Object) "↑")) {
                    arrayList.add(c37246oqH);
                } else if (Character.isDigit(chKWHzl.charValue())) {
                    arrayList2.add(c37246oqH);
                } else {
                    arrayList3.add(c37246oqH);
                }
            }
            return CollectionsKt___CollectionsKt.djBIcL((Collection) CollectionsKt___CollectionsKt.djBIcL((Collection) CollectionsKt___CollectionsKt.EZpvd(arrayList, new TaskDescription()), (Iterable) CollectionsKt___CollectionsKt.EZpvd(arrayList2, new ActionBar())), (Iterable) CollectionsKt___CollectionsKt.EZpvd(arrayList3, new StateListAnimator()));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
