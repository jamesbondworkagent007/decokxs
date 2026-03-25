package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xVJ {
    public static final xVJ KWHzl = new xVJ();
    public static final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.xVO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return xVJ.OLrzqt();
        }
    });
    public static final LinkedHashMap<java.lang.String, java.lang.Object> AEQbTJ = new LinkedHashMap<java.lang.String, java.lang.Object>() { // from class: com.okinc.unify_trade.utils.TradeJsonParser$cache$1
        private final int MAX_ENTRIES = 10;

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return containsKey((String) obj);
            }
            return false;
        }

        public /* bridge */ boolean containsKey(String str) {
            return super.containsKey((Object) str);
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<String, Object>> entrySet() {
            return getEntries();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof String) {
                return get((String) obj);
            }
            return null;
        }

        public /* bridge */ Object get(String str) {
            return super.get((Object) str);
        }

        public Set<Map.Entry<String, Object>> getEntries() {
            return super.entrySet();
        }

        public Set<String> getKeys() {
            return super.keySet();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, obj2);
        }

        public /* bridge */ Object getOrDefault(String str, Object obj) {
            return super.getOrDefault((Object) str, obj);
        }

        public int getSize() {
            return super.size();
        }

        public Collection<Object> getValues() {
            return super.values();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final Set<String> keySet() {
            return getKeys();
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof String) {
                return remove((String) obj);
            }
            return null;
        }

        public /* bridge */ Object remove(String str) {
            return super.remove((Object) str);
        }

        @Override // java.util.HashMap, java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof String) && obj2 != null) {
                return remove((String) obj, obj2);
            }
            return false;
        }

        public /* bridge */ boolean remove(String str, Object obj) {
            return super.remove((Object) str, obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final int size() {
            return getSize();
        }

        @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
        public final Collection<Object> values() {
            return getValues();
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, Object> entry) {
            Intrinsics.checkNotNullParameter(entry, "");
            return size() > this.MAX_ENTRIES;
        }
    };
    public static final java.lang.Object OLrzqt = new java.lang.Object();
    public static final int EZpvd = 8;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class Activity<T> extends TypeToken<T> {
    }

    private xVJ() {
    }

    public static final Gson OLrzqt() {
        return new Gson();
    }

    public final Gson copydefault() {
        return (Gson) copydefault.getValue();
    }

    public static /* synthetic */ java.lang.Object convert$default(xVJ xvj, java.lang.String str, java.lang.reflect.Type type, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return xvj.OLrzqt(str, type, z);
    }

    public final <T> T OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.reflect.Type type, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(type, "");
        T t = null;
        if (str.length() == 0) {
            return null;
        }
        if (z) {
            java.lang.String str2 = type.hashCode() + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + str.hashCode();
            synchronized (OLrzqt) {
                LinkedHashMap<java.lang.String, java.lang.Object> linkedHashMap = AEQbTJ;
                T t2 = (T) linkedHashMap.get(str2);
                if (t2 != null) {
                    pUU.EZpvd("TradeJsonParser", "useCache size:" + linkedHashMap.size() + " reuse it:" + t2 + " ");
                    return t2;
                }
            }
        }
        try {
            t = (T) copydefault().fromJson(str, type);
        } catch (java.lang.Exception e) {
            pUU.copydefault("TradeJsonParser", "Exception -type:" + type + " jsonConvert: " + e.getMessage());
        } catch (java.lang.OutOfMemoryError e2) {
            pUU.copydefault("TradeJsonParser", "OOM -type:" + type + " jsonConvert: " + e2.getMessage());
        }
        if (t != null && z) {
            synchronized (OLrzqt) {
                AEQbTJ.put(type.hashCode() + ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER + str.hashCode(), t);
                Unit unit = Unit.INSTANCE;
            }
        }
        return t;
    }

    public static /* synthetic */ java.lang.Object convert$default(xVJ xvj, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.OLrzqt();
        java.lang.reflect.Type type = new Activity().getType();
        Intrinsics.copydefault(type);
        return xvj.OLrzqt(str, type, z);
    }
}
