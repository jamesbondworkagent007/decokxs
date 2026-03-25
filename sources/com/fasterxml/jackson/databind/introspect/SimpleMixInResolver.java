package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import o.WX;

/* JADX INFO: loaded from: classes21.dex */
public class SimpleMixInResolver implements WX.TaskDescription, Serializable {
    private static final long serialVersionUID = 1;
    protected Map<ClassKey, Class<?>> _localMixIns;
    protected final WX.TaskDescription _overrides;

    public SimpleMixInResolver(WX.TaskDescription taskDescription) {
        this._overrides = taskDescription;
    }

    public SimpleMixInResolver(WX.TaskDescription taskDescription, Map<ClassKey, Class<?>> map) {
        this._overrides = taskDescription;
        this._localMixIns = map;
    }

    public SimpleMixInResolver withOverrides(WX.TaskDescription taskDescription) {
        return new SimpleMixInResolver(taskDescription, this._localMixIns);
    }

    public SimpleMixInResolver withoutLocalDefinitions() {
        return new SimpleMixInResolver(this._overrides, null);
    }

    public void setLocalDefinitions(Map<Class<?>, Class<?>> map) {
        if (map == null || map.isEmpty()) {
            this._localMixIns = null;
            return;
        }
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry<Class<?>, Class<?>> entry : map.entrySet()) {
            map2.put(new ClassKey(entry.getKey()), entry.getValue());
        }
        this._localMixIns = map2;
    }

    public void addLocalDefinition(Class<?> cls, Class<?> cls2) {
        if (this._localMixIns == null) {
            this._localMixIns = new HashMap();
        }
        this._localMixIns.put(new ClassKey(cls), cls2);
    }

    /* JADX DEBUG: Method merged with bridge method: copy()Lo/WX$TaskDescription; */
    @Override // o.WX.TaskDescription
    public SimpleMixInResolver copy() {
        WX.TaskDescription taskDescription = this._overrides;
        return new SimpleMixInResolver(taskDescription == null ? null : taskDescription.copy(), this._localMixIns != null ? new HashMap(this._localMixIns) : null);
    }

    @Override // o.WX.TaskDescription
    public Class<?> findMixInClassFor(Class<?> cls) {
        Map<ClassKey, Class<?>> map;
        WX.TaskDescription taskDescription = this._overrides;
        Class<?> clsFindMixInClassFor = taskDescription == null ? null : taskDescription.findMixInClassFor(cls);
        return (clsFindMixInClassFor != null || (map = this._localMixIns) == null) ? clsFindMixInClassFor : map.get(new ClassKey(cls));
    }

    public int localSize() {
        Map<ClassKey, Class<?>> map = this._localMixIns;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public boolean hasMixIns() {
        if (this._localMixIns != null) {
            return true;
        }
        WX.TaskDescription taskDescription = this._overrides;
        if (taskDescription == null) {
            return false;
        }
        if (taskDescription instanceof SimpleMixInResolver) {
            return ((SimpleMixInResolver) taskDescription).hasMixIns();
        }
        return true;
    }
}
