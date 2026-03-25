package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C5166Hg;
import o.C5167Hh;
import o.C55603xn;
import o.C56390yDp;
import o.C56403yEb;
import o.C56423yEv;
import o.C56548yJl;
import o.DL;
import o.DN;
import o.DS;
import o.yET;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C55603xn {
    public static final java.util.Set<java.lang.String> EZpvd = yEE.AhwBna("connection", "expect", "sec-websocket-key", "sec-websocket-protocol", "sec-websocket-version", "upgrade", "user-agent", "x-amzn-trace-id");
    public static final Regex AEQbTJ = new Regex(" +");

    public static final java.lang.String EZpvd(@NotNull DL.Application application, @NotNull final C55338xi c55338xi) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(c55338xi, "");
        final DS.TaskDescription taskDescriptionAYXKKw = application.AYXKKw();
        final java.util.List<C5166Hg> listKWHzl = taskDescriptionAYXKKw.KWHzl();
        final Function1 function1 = c55338xi.fetchVPNInfo() ? new Function1<C5166Hg, C5166Hg>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.CanonicalizerKt$canonicalPath$mapper$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final C5166Hg invoke(@NotNull C5166Hg c5166Hg) {
                Intrinsics.checkNotNullParameter(c5166Hg, "");
                return C5167Hh.KWHzl.AhwBna().AEQbTJ(c5166Hg.AEQbTJ());
            }
        } : new Function1<C5166Hg, C5166Hg>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.CanonicalizerKt$canonicalPath$mapper$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final C5166Hg invoke(@NotNull C5166Hg c5166Hg) {
                Intrinsics.checkNotNullParameter(c5166Hg, "");
                return c5166Hg;
            }
        };
        return DS.copydefault.EZpvd(new Function1<DS.TaskDescription, Unit>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.CanonicalizerKt$canonicalPath$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super o.Hg, o.Hg> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DS.TaskDescription taskDescription) {
                invoke2(taskDescription);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DS.TaskDescription taskDescription) {
                Intrinsics.checkNotNullParameter(taskDescription, "");
                List<C5166Hg> list = listKWHzl;
                List<C5166Hg> listKWHzl2 = taskDescription.KWHzl();
                Function1<C5166Hg, C5166Hg> function12 = function1;
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    listKWHzl2.add(function12.invoke((C5166Hg) it.next()));
                }
                taskDescription.copydefault(taskDescriptionAYXKKw.EZpvd());
                if (c55338xi.valueOf()) {
                    taskDescription.copydefault();
                }
            }
        }).toString();
    }

    public static final java.lang.String copydefault(@NotNull final DL.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        return StringsKt__StringsKt.KWHzl(DN.EZpvd.AEQbTJ(new Function1<DN.StateListAnimator, Unit>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.CanonicalizerKt$canonicalQueryParams$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            public static final class ActionBar<T> implements Comparator {
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return yET.KWHzl(((C5166Hg) ((Map.Entry) t).getKey()).AEQbTJ(), ((C5166Hg) ((Map.Entry) t2).getKey()).AEQbTJ());
                }
            }

            public static final class Activity<T> implements Comparator {
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return yET.KWHzl(((C5166Hg) t).AEQbTJ(), ((C5166Hg) t2).AEQbTJ());
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DN.StateListAnimator stateListAnimator) {
                invoke2(stateListAnimator);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DN.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                Set<Map.Entry<C5166Hg, List<C5166Hg>>> setEntrySet = application.EZpvd().entrySet();
                LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(setEntrySet, 10)), 16));
                Iterator<T> it = setEntrySet.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    C5166Hg c5166Hg = (C5166Hg) entry.getKey();
                    List list = (List) entry.getValue();
                    C5166Hg c5166HgKWHzl = c5166Hg.KWHzl(C5167Hh.KWHzl.AhwBna());
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((C5166Hg) it2.next()).KWHzl(C5167Hh.KWHzl.AhwBna()));
                    }
                    Pair pairOLrzqt = C56390yDp.OLrzqt(c5166HgKWHzl, arrayList);
                    linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                }
                for (Map.Entry entry2 : CollectionsKt___CollectionsKt.EZpvd(linkedHashMap.entrySet(), new ActionBar())) {
                    Pair pairOLrzqt2 = C56390yDp.OLrzqt((C5166Hg) entry2.getKey(), CollectionsKt___CollectionsKt.fJNWhG((Collection) CollectionsKt___CollectionsKt.EZpvd((List) entry2.getValue(), new Activity())));
                    stateListAnimator.put(pairOLrzqt2.getFirst(), pairOLrzqt2.getSecond());
                }
            }
        }).toString(), (java.lang.CharSequence) "?");
    }

    public static final java.lang.String KWHzl(kotlin.Pair<java.lang.String, ? extends java.util.List<java.lang.String>> pair) {
        return pair.getFirst() + AbstractJsonLexerKt.COLON + CollectionsKt___CollectionsKt.joinToString$default(pair.getSecond(), ",", null, null, 0, null, new Function1<java.lang.String, java.lang.CharSequence>() { // from class: aws.smithy.kotlin.runtime.auth.awssigning.CanonicalizerKt$canonicalLine$valuesString$1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return C55603xn.OLrzqt(str);
            }
        }, 30, null);
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) AEQbTJ.replace(str, " ")).toString();
    }

    public static final boolean OLrzqt(java.lang.String str, C55338xi c55338xi) {
        java.util.Set<java.lang.String> set = EZpvd;
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return !set.contains(lowerCase) && c55338xi.gEmmrt().invoke(str).booleanValue();
    }
}
