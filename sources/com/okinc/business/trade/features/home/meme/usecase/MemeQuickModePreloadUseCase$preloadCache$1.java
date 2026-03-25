package com.okinc.business.trade.features.home.meme.usecase;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import o.kVR;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeQuickModePreloadUseCase$preloadCache$1 extends LinkedHashMap<String, kVR.StateListAnimator> {
    public MemeQuickModePreloadUseCase$preloadCache$1() {
        super(10, 0.75f, true);
    }

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
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof kVR.StateListAnimator) {
            return containsValue((kVR.StateListAnimator) obj);
        }
        return false;
    }

    public /* bridge */ boolean containsValue(kVR.StateListAnimator stateListAnimator) {
        return super.containsValue((Object) stateListAnimator);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<String, kVR.StateListAnimator>> entrySet() {
        return getEntries();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ kVR.StateListAnimator get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public /* bridge */ kVR.StateListAnimator get(String str) {
        return (kVR.StateListAnimator) super.get((Object) str);
    }

    public Set<Map.Entry<String, kVR.StateListAnimator>> getEntries() {
        return super.entrySet();
    }

    public Set<String> getKeys() {
        return super.keySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (kVR.StateListAnimator) obj2);
    }

    public final /* bridge */ kVR.StateListAnimator getOrDefault(Object obj, kVR.StateListAnimator stateListAnimator) {
        return !(obj instanceof String) ? stateListAnimator : getOrDefault((String) obj, stateListAnimator);
    }

    public /* bridge */ kVR.StateListAnimator getOrDefault(String str, kVR.StateListAnimator stateListAnimator) {
        return (kVR.StateListAnimator) super.getOrDefault((Object) str, stateListAnimator);
    }

    public int getSize() {
        return super.size();
    }

    public Collection<kVR.StateListAnimator> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
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
    public final /* bridge */ kVR.StateListAnimator remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    public /* bridge */ kVR.StateListAnimator remove(String str) {
        return (kVR.StateListAnimator) super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof kVR.StateListAnimator)) {
            return remove((String) obj, (kVR.StateListAnimator) obj2);
        }
        return false;
    }

    public /* bridge */ boolean remove(String str, kVR.StateListAnimator stateListAnimator) {
        return super.remove((Object) str, (Object) stateListAnimator);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Collection<kVR.StateListAnimator> values() {
        return getValues();
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<String, kVR.StateListAnimator> entry) {
        kVR.StateListAnimator value;
        if (size() <= 10) {
            return false;
        }
        if (entry == null || (value = entry.getValue()) == null) {
            return true;
        }
        value.copydefault();
        return true;
    }
}
