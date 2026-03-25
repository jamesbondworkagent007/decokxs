package com.okinc.share;

import com.google.android.exoplayer2.C;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class InviteParamsBuilder extends HashMap<String, String> {
    public static final int $stable = 0;
    public static final TaskDescription Companion = new TaskDescription(null);

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

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof String) {
            return containsValue((String) obj);
        }
        return false;
    }

    public /* bridge */ boolean containsValue(String str) {
        return super.containsValue((Object) str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, String>> entrySet() {
        return getEntries();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ String get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public /* bridge */ String get(String str) {
        return (String) super.get((Object) str);
    }

    public Set<Map.Entry<String, String>> getEntries() {
        return super.entrySet();
    }

    public Set<String> getKeys() {
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (String) obj2);
    }

    public final /* bridge */ String getOrDefault(Object obj, String str) {
        return !(obj instanceof String) ? str : getOrDefault((String) obj, str);
    }

    public /* bridge */ String getOrDefault(String str, String str2) {
        return (String) super.getOrDefault((Object) str, str2);
    }

    public int getSize() {
        return super.size();
    }

    public Collection<String> getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ String remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    public /* bridge */ String remove(String str) {
        return (String) super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof String)) {
            return remove((String) obj, (String) obj2);
        }
        return false;
    }

    public /* bridge */ boolean remove(String str, String str2) {
        return super.remove((Object) str, (Object) str2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Collection<String> values() {
        return getValues();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.share.InviteParamsBuilder.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final boolean AEQbTJ(String str) {
            return StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "_", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) ":", false, 2, (Object) null);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String put(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        TaskDescription taskDescription = Companion;
        if (!taskDescription.AEQbTJ(str)) {
            if (taskDescription.AEQbTJ(str2)) {
                throw new IllegalArgumentException(str2 + " can not contains _ or : ");
            }
            return (String) super.put(str, str2);
        }
        throw new IllegalArgumentException(str + " can not contains _ or : ");
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(@NotNull Map<? extends String, ? extends String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        super.putAll(map);
    }

    public final String buildParamsString() {
        StringBuffer stringBuffer = new StringBuffer();
        int size = size();
        int i = 0;
        for (Map.Entry<String, String> entry : entrySet()) {
            stringBuffer.append(URLEncoder.encode(entry.getKey(), C.UTF8_NAME));
            stringBuffer.append(URLEncoder.encode(":", C.UTF8_NAME));
            stringBuffer.append(URLEncoder.encode(entry.getValue(), C.UTF8_NAME));
            if (i < size - 1) {
                stringBuffer.append(URLEncoder.encode("_", C.UTF8_NAME));
            }
            i++;
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public final InviteParamsBuilder parse(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Iterator it = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"_"}, false, 0, 6, (Object) null).iterator();
        while (it.hasNext()) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{":"}, false, 0, 6, (Object) null);
            if (listSplit$default.size() == 2) {
                put((String) listSplit$default.get(0), (String) listSplit$default.get(1));
            }
        }
        return this;
    }
}
