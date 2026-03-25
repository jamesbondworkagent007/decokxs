package com.okinc.im.imui.messageV2.model;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class RecentlyEmojiList extends LinkedHashMap<Integer, String> {
    public static final int $stable = 0;
    public static final TaskDescription Companion = new TaskDescription(null);
    private static final int MAX_SIZE = 8;

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.messageV2.model.RecentlyEmojiList.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public /* bridge */ boolean containsKey(Integer num) {
        return super.containsKey((Object) num);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof Integer) {
            return containsKey((Integer) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof String) {
            return containsValue((String) obj);
        }
        return false;
    }

    public /* bridge */ boolean containsValue(String str) {
        return super.containsValue((Object) str);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<Integer, String>> entrySet() {
        return getEntries();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof Integer) {
            return get((Integer) obj);
        }
        return null;
    }

    public /* bridge */ String get(Integer num) {
        return (String) super.get((Object) num);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ String get(Object obj) {
        if (obj instanceof Integer) {
            return get((Integer) obj);
        }
        return null;
    }

    public Set<Map.Entry<Integer, String>> getEntries() {
        return super.entrySet();
    }

    public Set<Integer> getKeys() {
        return super.keySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof Integer) ? obj2 : getOrDefault((Integer) obj, (String) obj2);
    }

    public /* bridge */ String getOrDefault(Integer num, String str) {
        return (String) super.getOrDefault((Object) num, str);
    }

    public final /* bridge */ String getOrDefault(Object obj, String str) {
        return !(obj instanceof Integer) ? str : getOrDefault((Integer) obj, str);
    }

    public int getSize() {
        return super.size();
    }

    public Collection<String> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Integer> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return put(((Number) obj).intValue(), (String) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof Integer) {
            return remove((Integer) obj);
        }
        return null;
    }

    public /* bridge */ String remove(Integer num) {
        return (String) super.remove((Object) num);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ String remove(Object obj) {
        if (obj instanceof Integer) {
            return remove((Integer) obj);
        }
        return null;
    }

    public /* bridge */ boolean remove(Integer num, String str) {
        return super.remove((Object) num, (Object) str);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof Integer) && (obj2 instanceof String)) {
            return remove((Integer) obj, (String) obj2);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Collection<String> values() {
        return getValues();
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<Integer, String> entry) {
        return size() > 8;
    }

    public String put(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (containsKey((Object) Integer.valueOf(i))) {
            remove((Object) Integer.valueOf(i));
        }
        return (String) super.put(Integer.valueOf(i), str);
    }

    public final void addEmoji(int i) {
        char[] chars = Character.toChars(i);
        Intrinsics.checkNotNullExpressionValue(chars, "");
        put(i, new String(chars));
    }
}
