package o;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C32935mmv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mmv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32935mmv implements java.util.Map<java.lang.String, java.lang.String>, yIG {
    public static final java.util.Collection<java.lang.String> AhwBna;
    public static final java.util.Set<Map.Entry<java.lang.String, java.lang.String>> EZpvd;
    public static final int OLrzqt;
    public static final java.util.Set<java.lang.String> copydefault;
    public static final ConcurrentHashMap<java.lang.String, java.lang.String> gEmmrt;
    public static final int valueOf;
    public static final C32935mmv KWHzl = new C32935mmv();
    public static final java.util.ArrayList<Application> AEQbTJ = new java.util.ArrayList<>();

    /* JADX INFO: renamed from: o.mmv$Application */
    public interface Application {
        void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3);

        void copydefault(@NotNull java.lang.String str, java.lang.String str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<Map.Entry<java.lang.String, java.lang.String>> AEQbTJ() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Collection<java.lang.String> KWHzl() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<java.lang.String> OLrzqt() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int copydefault() {
        return valueOf;
    }

    private C32935mmv() {
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return OLrzqt((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return KWHzl((java.lang.String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final java.util.Set<Map.Entry<java.lang.String, java.lang.String>> entrySet() {
        return AEQbTJ();
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Map
    public final /* synthetic */ java.lang.String get(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return copydefault((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final java.util.Set<java.lang.String> keySet() {
        return OLrzqt();
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Map
    public final /* synthetic */ java.lang.String remove(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            return AEQbTJ((java.lang.String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return copydefault();
    }

    @Override // java.util.Map
    public final java.util.Collection<java.lang.String> values() {
        return KWHzl();
    }

    static {
        ConcurrentHashMap<java.lang.String, java.lang.String> concurrentHashMap = new ConcurrentHashMap<>();
        gEmmrt = concurrentHashMap;
        valueOf = concurrentHashMap.size();
        java.util.Set<Map.Entry<java.lang.String, java.lang.String>> setEntrySet = concurrentHashMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "");
        EZpvd = setEntrySet;
        java.util.Set<java.lang.String> setKeySet = concurrentHashMap.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "");
        copydefault = setKeySet;
        java.util.Collection<java.lang.String> collectionValues = concurrentHashMap.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "");
        AhwBna = collectionValues;
        OLrzqt = 8;
    }

    public final void KWHzl(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        AEQbTJ.add(application);
    }

    public boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return gEmmrt.contains(str);
    }

    public boolean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return gEmmrt.containsValue(str);
    }

    public java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return gEmmrt.get(str);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return gEmmrt.isEmpty();
    }

    @Override // java.util.Map
    public void clear() {
        gEmmrt.clear();
    }

    /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.String put(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final java.lang.String strPut = gEmmrt.put(str, str2);
        try {
            AEQbTJ(new Function1() { // from class: o.mmt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C32935mmv.AEQbTJ(str, str2, strPut, (C32935mmv.Application) obj);
                }
            });
        } catch (java.lang.Exception e) {
            pUU.copydefault("onPropertyPutted", "exception:" + e + " key:" + str + ",value:" + str2);
            pUX.OLrzqt.AEQbTJ(new java.lang.Exception("onPropertyPutted exception:" + e + "  key:" + str + ",value:" + str2));
        }
        return strPut;
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        application.EZpvd(str, str2, str3);
        return Unit.INSTANCE;
    }

    @Override // java.util.Map
    public void putAll(@NotNull java.util.Map<? extends java.lang.String, ? extends java.lang.String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        gEmmrt.putAll(map);
    }

    public java.lang.String AEQbTJ(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        final java.lang.String strRemove = gEmmrt.remove(str);
        AEQbTJ(new Function1() { // from class: o.mmz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32935mmv.AEQbTJ(str, strRemove, (C32935mmv.Application) obj);
            }
        });
        return strRemove;
    }

    public static final Unit AEQbTJ(java.lang.String str, java.lang.String str2, Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        application.copydefault(str, str2);
        return Unit.INSTANCE;
    }

    public final java.util.Map<java.lang.String, java.lang.String> EZpvd() {
        ConcurrentHashMap<java.lang.String, java.lang.String> concurrentHashMap = gEmmrt;
        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap(concurrentHashMap.size());
        arrayMap.putAll(concurrentHashMap);
        return arrayMap;
    }

    private final void AEQbTJ(Function1<? super Application, Unit> function1) {
        java.util.Iterator<T> it = AEQbTJ.iterator();
        while (it.hasNext()) {
            function1.invoke((Application) it.next());
        }
    }
}
