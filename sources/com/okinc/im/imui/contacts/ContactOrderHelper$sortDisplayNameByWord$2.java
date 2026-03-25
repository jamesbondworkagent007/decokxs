package com.okinc.im.imui.contacts;

import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import o.C33129mqd;
import o.C44157sFk;
import o.C44508sSk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59454zhO;
import o.yET;

/* JADX INFO: loaded from: classes8.dex */
public final class ContactOrderHelper$sortDisplayNameByWord$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends RelationInfo>>, Object> {
    final /* synthetic */ List<RelationInfo> $this_sortDisplayNameByWord;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactOrderHelper$sortDisplayNameByWord$2(List<RelationInfo> list, Continuation<? super ContactOrderHelper$sortDisplayNameByWord$2> continuation) {
        super(2, continuation);
        this.$this_sortDisplayNameByWord = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactOrderHelper$sortDisplayNameByWord$2(this.$this_sortDisplayNameByWord, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends RelationInfo>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<RelationInfo>>) continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<RelationInfo>> continuation) {
        return ((ContactOrderHelper$sortDisplayNameByWord$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (RelationInfo relationInfo : this.$this_sortDisplayNameByWord) {
                String displayName$default = C44157sFk.getDisplayName$default(relationInfo, null, 1, null);
                relationInfo.setDisplayAlphabetText(StringsKt__StringsKt.fARcdN((CharSequence) displayName$default) ? ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER : displayName$default);
                if (!C33129mqd.OLrzqt((CharSequence) displayName$default)) {
                    displayName$default = null;
                }
                Character chKWHzl = displayName$default != null ? C56443yFo.KWHzl(C59454zhO.zLjUOn((CharSequence) displayName$default)) : null;
                if (chKWHzl == null) {
                    arrayList2.add(relationInfo);
                } else if (C44508sSk.OLrzqt.KWHzl(chKWHzl.charValue()) || Intrinsics.EZpvd((Object) chKWHzl.toString(), (Object) "↑")) {
                    arrayList.add(relationInfo);
                } else {
                    arrayList2.add(relationInfo);
                }
            }
            return CollectionsKt___CollectionsKt.djBIcL((Collection) CollectionsKt___CollectionsKt.EZpvd(arrayList, new TaskDescription()), (Iterable) CollectionsKt___CollectionsKt.EZpvd(arrayList2, new Activity()));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static final class Activity<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((RelationInfo) t).getDisplayAlphabetText(), ((RelationInfo) t2).getDisplayAlphabetText());
        }
    }

    public static final class TaskDescription<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            String displayAlphabetText = ((RelationInfo) t).getDisplayAlphabetText();
            Locale locale = Locale.ROOT;
            String lowerCase = displayAlphabetText.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            String lowerCase2 = ((RelationInfo) t2).getDisplayAlphabetText().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return yET.KWHzl(lowerCase, lowerCase2);
        }
    }
}
