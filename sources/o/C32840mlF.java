package o;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32840mlF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mlF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32840mlF implements java.util.Map<java.lang.String, java.lang.String>, yIG {
    public static final java.util.Collection<java.lang.String> AYXKKw;
    public static final ConcurrentHashMap<java.lang.String, java.lang.String> AhwBna;
    public static final int EZpvd;
    public static final java.util.Set<java.lang.String> KWHzl;
    public static final java.util.Set<Map.Entry<java.lang.String, java.lang.String>> OLrzqt;
    public static final int gEmmrt;
    public static final C32840mlF copydefault = new C32840mlF();
    public static final java.util.ArrayList<StateListAnimator> AEQbTJ = new java.util.ArrayList<>();

    /* JADX INFO: renamed from: o.mlF$StateListAnimator */
    public interface StateListAnimator {
        void copydefault(@NotNull java.lang.String str, java.lang.String str2);

        void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<java.lang.String> AEQbTJ() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Collection<java.lang.String> EZpvd() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<Map.Entry<java.lang.String, java.lang.String>> KWHzl() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        return gEmmrt;
    }

    private C32840mlF() {
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return copydefault((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return OLrzqt((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<java.lang.String, java.lang.String>> entrySet() {
        return KWHzl();
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Map
    public final /* synthetic */ java.lang.String get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return AEQbTJ((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final java.util.Set<java.lang.String> keySet() {
        return AEQbTJ();
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Map
    public final /* synthetic */ java.lang.String remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return EZpvd((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return OLrzqt();
    }

    @Override // java.util.Map
    public final java.util.Collection<java.lang.String> values() {
        return EZpvd();
    }

    static {
        ConcurrentHashMap<java.lang.String, java.lang.String> concurrentHashMap = new ConcurrentHashMap<>();
        AhwBna = concurrentHashMap;
        gEmmrt = concurrentHashMap.size();
        java.util.Set<Map.Entry<java.lang.String, java.lang.String>> setEntrySet = concurrentHashMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        OLrzqt = setEntrySet;
        java.util.Set<java.lang.String> setKeySet = concurrentHashMap.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        KWHzl = setKeySet;
        java.util.Collection<java.lang.String> collectionValues = concurrentHashMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        AYXKKw = collectionValues;
        EZpvd = 8;
    }

    public final void copydefault(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        AEQbTJ.add(stateListAnimator);
    }

    public boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AhwBna.contains(str);
    }

    public boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AhwBna.containsValue(str);
    }

    public java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return AhwBna.get(str);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return AhwBna.isEmpty();
    }

    @Override // java.util.Map
    public void clear() {
        AhwBna.clear();
    }

    /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.String put(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final java.lang.String strPut = AhwBna.put(str, str2);
        copydefault(new Function1() { // from class: o.mlH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32840mlF.copydefault(str, str2, strPut, (C32840mlF.StateListAnimator) obj);
            }
        });
        return strPut;
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.copydefault(str, str2, str3);
        return Unit.INSTANCE;
    }

    @Override // java.util.Map
    public void putAll(@NotNull java.util.Map<? extends java.lang.String, ? extends java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AhwBna.putAll(map);
    }

    public java.lang.String EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final java.lang.String strRemove = AhwBna.remove(str);
        copydefault(new Function1() { // from class: o.mlL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32840mlF.EZpvd(str, strRemove, (C32840mlF.StateListAnimator) obj);
            }
        });
        return strRemove;
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        stateListAnimator.copydefault(str, str2);
        return Unit.INSTANCE;
    }

    public final java.util.Map<java.lang.String, java.lang.String> copydefault() {
        ConcurrentHashMap<java.lang.String, java.lang.String> concurrentHashMap = AhwBna;
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap(concurrentHashMap.size());
        arrayMap.putAll(concurrentHashMap);
        return arrayMap;
    }

    public final void copydefault(Function1<? super StateListAnimator, Unit> function1) {
        java.util.Iterator<T> it = AEQbTJ.iterator();
        while (it.hasNext()) {
            function1.invoke((StateListAnimator) it.next());
        }
    }
}
