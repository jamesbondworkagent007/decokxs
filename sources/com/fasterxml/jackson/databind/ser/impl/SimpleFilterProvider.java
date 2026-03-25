package com.fasterxml.jackson.databind.ser.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o.XS;
import o.XV;
import o.XX;

/* JADX INFO: loaded from: classes21.dex */
public class SimpleFilterProvider extends XS implements Serializable {
    private static final long serialVersionUID = 1;
    protected boolean _cfgFailOnUnknownId;
    protected XX _defaultFilter;
    protected final Map<String, XX> _filtersById;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public XX getDefaultFilter() {
        return this._defaultFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleFilterProvider setDefaultFilter(SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
        this._defaultFilter = simpleBeanPropertyFilter;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleFilterProvider setDefaultFilter(XX xx) {
        this._defaultFilter = xx;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleFilterProvider setFailOnUnknownId(boolean z) {
        this._cfgFailOnUnknownId = z;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean willFailOnUnknownId() {
        return this._cfgFailOnUnknownId;
    }

    public SimpleFilterProvider() {
        this(new HashMap());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.String, ?> */
    /* JADX WARN: Multi-variable type inference failed */
    public SimpleFilterProvider(Map<String, ?> map) {
        this._cfgFailOnUnknownId = true;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            if (!(it.next() instanceof XX)) {
                this._filtersById = _convert(map);
                return;
            }
        }
        this._filtersById = map;
    }

    private static final Map<String, XX> _convert(Map<String, ?> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof XX) {
                map2.put(entry.getKey(), (XX) value);
            } else {
                if (!(value instanceof XV)) {
                    throw new IllegalArgumentException("Unrecognized filter type (" + value.getClass().getName() + ")");
                }
                map2.put(entry.getKey(), _convert((XV) value));
            }
        }
        return map2;
    }

    private static final XX _convert(XV xv) {
        return SimpleBeanPropertyFilter.from(xv);
    }

    @Deprecated
    public SimpleFilterProvider setDefaultFilter(XV xv) {
        this._defaultFilter = SimpleBeanPropertyFilter.from(xv);
        return this;
    }

    @Deprecated
    public SimpleFilterProvider addFilter(String str, XV xv) {
        this._filtersById.put(str, _convert(xv));
        return this;
    }

    public SimpleFilterProvider addFilter(String str, XX xx) {
        this._filtersById.put(str, xx);
        return this;
    }

    public SimpleFilterProvider addFilter(String str, SimpleBeanPropertyFilter simpleBeanPropertyFilter) {
        this._filtersById.put(str, simpleBeanPropertyFilter);
        return this;
    }

    public XX removeFilter(String str) {
        return this._filtersById.remove(str);
    }

    @Override // o.XS
    @Deprecated
    public XV findFilter(Object obj) {
        throw new UnsupportedOperationException("Access to deprecated filters not supported");
    }

    @Override // o.XS
    public XX findPropertyFilter(Object obj, Object obj2) {
        XX xx = this._filtersById.get(obj);
        if (xx != null || (xx = this._defaultFilter) != null || !this._cfgFailOnUnknownId) {
            return xx;
        }
        throw new IllegalArgumentException("No filter configured with id '" + obj + "' (type " + obj.getClass().getName() + ")");
    }
}
