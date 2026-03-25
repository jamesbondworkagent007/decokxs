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
import o.C37248oqJ;
import o.C44157sFk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59454zhO;
import o.yET;

/* JADX INFO: loaded from: classes18.dex */
public final class ContactOrderHelper$sortFriendRelationDisplayNameByWord$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends C37248oqJ>>, Object> {
    final /* synthetic */ List<C37248oqJ> $this_sortFriendRelationDisplayNameByWord;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactOrderHelper$sortFriendRelationDisplayNameByWord$2(List<C37248oqJ> list, Continuation<? super ContactOrderHelper$sortFriendRelationDisplayNameByWord$2> continuation) {
        super(2, continuation);
        this.$this_sortFriendRelationDisplayNameByWord = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactOrderHelper$sortFriendRelationDisplayNameByWord$2(this.$this_sortFriendRelationDisplayNameByWord, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends C37248oqJ>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<C37248oqJ>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<C37248oqJ>> continuation) {
        return ((ContactOrderHelper$sortFriendRelationDisplayNameByWord$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public static final class Activity<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(C44157sFk.getDisplayName$default(((C37248oqJ) t).OLrzqt(), null, 1, null), C44157sFk.getDisplayName$default(((C37248oqJ) t2).OLrzqt(), null, 1, null));
        }
    }

    public static final class StateListAnimator<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(C44157sFk.getDisplayName$default(((C37248oqJ) t).OLrzqt(), null, 1, null), C44157sFk.getDisplayName$default(((C37248oqJ) t2).OLrzqt(), null, 1, null));
        }
    }

    public static final class TaskDescription<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(C44157sFk.getDisplayName$default(((C37248oqJ) t).OLrzqt(), null, 1, null), C44157sFk.getDisplayName$default(((C37248oqJ) t2).OLrzqt(), null, 1, null));
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
            for (C37248oqJ c37248oqJ : this.$this_sortFriendRelationDisplayNameByWord) {
                String displayName$default = C44157sFk.getDisplayName$default(c37248oqJ.OLrzqt(), null, 1, null);
                if (!C33129mqd.OLrzqt((CharSequence) displayName$default)) {
                    displayName$default = null;
                }
                Character chKWHzl = displayName$default != null ? C56443yFo.KWHzl(C59454zhO.zLjUOn((CharSequence) displayName$default)) : null;
                if (chKWHzl == null) {
                    arrayList3.add(c37248oqJ);
                } else if (Character.isLetter(chKWHzl.charValue()) || Intrinsics.EZpvd((Object) chKWHzl.toString(), (Object) "↑")) {
                    arrayList.add(c37248oqJ);
                } else if (Character.isDigit(chKWHzl.charValue())) {
                    arrayList2.add(c37248oqJ);
                } else {
                    arrayList3.add(c37248oqJ);
                }
            }
            return CollectionsKt___CollectionsKt.djBIcL((Collection) CollectionsKt___CollectionsKt.djBIcL((Collection) CollectionsKt___CollectionsKt.EZpvd(arrayList, new Activity()), (Iterable) CollectionsKt___CollectionsKt.EZpvd(arrayList2, new StateListAnimator())), (Iterable) CollectionsKt___CollectionsKt.EZpvd(arrayList3, new TaskDescription()));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
