package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o.AbstractC5566Wq;
import o.C5569Wt;

/* JADX INFO: loaded from: classes21.dex */
public final class PropertyBasedCreator {
    public final ValueInstantiator AEQbTJ;
    public final int KWHzl;
    public final HashMap<String, SettableBeanProperty> OLrzqt;
    public final SettableBeanProperty[] copydefault;

    public PropertyBasedCreator(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z, boolean z2) {
        this.AEQbTJ = valueInstantiator;
        if (z) {
            this.OLrzqt = CaseInsensitiveMap.construct(deserializationContext.getConfig().getLocale());
        } else {
            this.OLrzqt = new HashMap<>();
        }
        int length = settableBeanPropertyArr.length;
        this.KWHzl = length;
        this.copydefault = new SettableBeanProperty[length];
        if (z2) {
            DeserializationConfig config = deserializationContext.getConfig();
            for (SettableBeanProperty settableBeanProperty : settableBeanPropertyArr) {
                if (!settableBeanProperty.isIgnorable()) {
                    List<PropertyName> listFindAliases = settableBeanProperty.findAliases(config);
                    if (!listFindAliases.isEmpty()) {
                        Iterator<PropertyName> it = listFindAliases.iterator();
                        while (it.hasNext()) {
                            this.OLrzqt.put(it.next().getSimpleName(), settableBeanProperty);
                        }
                    }
                }
            }
        }
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanProperty2 = settableBeanPropertyArr[i];
            this.copydefault[i] = settableBeanProperty2;
            if (!settableBeanProperty2.isIgnorable()) {
                this.OLrzqt.put(settableBeanProperty2.getName(), settableBeanProperty2);
            }
        }
    }

    public static PropertyBasedCreator OLrzqt(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, BeanPropertyMap beanPropertyMap) throws JsonMappingException {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanPropertyWithValueDeserializer = settableBeanPropertyArr[i];
            if (!settableBeanPropertyWithValueDeserializer.hasValueDeserializer() && !settableBeanPropertyWithValueDeserializer.isInjectionOnly()) {
                settableBeanPropertyWithValueDeserializer = settableBeanPropertyWithValueDeserializer.withValueDeserializer(deserializationContext.findContextualValueDeserializer(settableBeanPropertyWithValueDeserializer.getType(), settableBeanPropertyWithValueDeserializer));
            }
            settableBeanPropertyArr2[i] = settableBeanPropertyWithValueDeserializer;
        }
        return new PropertyBasedCreator(deserializationContext, valueInstantiator, settableBeanPropertyArr2, beanPropertyMap.isCaseInsensitive(), true);
    }

    public static PropertyBasedCreator OLrzqt(DeserializationContext deserializationContext, ValueInstantiator valueInstantiator, SettableBeanProperty[] settableBeanPropertyArr, boolean z) throws JsonMappingException {
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = new SettableBeanProperty[length];
        for (int i = 0; i < length; i++) {
            SettableBeanProperty settableBeanPropertyWithValueDeserializer = settableBeanPropertyArr[i];
            if (!settableBeanPropertyWithValueDeserializer.hasValueDeserializer()) {
                settableBeanPropertyWithValueDeserializer = settableBeanPropertyWithValueDeserializer.withValueDeserializer(deserializationContext.findContextualValueDeserializer(settableBeanPropertyWithValueDeserializer.getType(), settableBeanPropertyWithValueDeserializer));
            }
            settableBeanPropertyArr2[i] = settableBeanPropertyWithValueDeserializer;
        }
        return new PropertyBasedCreator(deserializationContext, valueInstantiator, settableBeanPropertyArr2, z, false);
    }

    public Collection<SettableBeanProperty> AEQbTJ() {
        return this.OLrzqt.values();
    }

    public SettableBeanProperty KWHzl(String str) {
        return this.OLrzqt.get(str);
    }

    public SettableBeanProperty copydefault(int i) {
        for (SettableBeanProperty settableBeanProperty : this.OLrzqt.values()) {
            if (settableBeanProperty.getPropertyIndex() == i) {
                return settableBeanProperty;
            }
        }
        return null;
    }

    public C5569Wt OLrzqt(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectIdReader objectIdReader) {
        return new C5569Wt(jsonParser, deserializationContext, this.KWHzl, objectIdReader);
    }

    public Object EZpvd(DeserializationContext deserializationContext, C5569Wt c5569Wt) throws IOException {
        Object objCreateFromObjectWith = this.AEQbTJ.createFromObjectWith(deserializationContext, this.copydefault, c5569Wt);
        if (objCreateFromObjectWith != null) {
            objCreateFromObjectWith = c5569Wt.EZpvd(deserializationContext, objCreateFromObjectWith);
            for (AbstractC5566Wq abstractC5566WqCopydefault = c5569Wt.copydefault(); abstractC5566WqCopydefault != null; abstractC5566WqCopydefault = abstractC5566WqCopydefault.EZpvd) {
                abstractC5566WqCopydefault.copydefault(objCreateFromObjectWith);
            }
        }
        return objCreateFromObjectWith;
    }

    public static class CaseInsensitiveMap extends HashMap<String, SettableBeanProperty> {
        private static final long serialVersionUID = 1;
        protected final Locale _locale;

        @Deprecated
        public CaseInsensitiveMap() {
            this(Locale.getDefault());
        }

        public CaseInsensitiveMap(Locale locale) {
            this._locale = locale;
        }

        public static CaseInsensitiveMap construct(Locale locale) {
            return new CaseInsensitiveMap(locale);
        }

        /* JADX DEBUG: Method merged with bridge method: get(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public SettableBeanProperty get(Object obj) {
            return (SettableBeanProperty) super.get((Object) ((String) obj).toLowerCase(this._locale));
        }

        /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        public SettableBeanProperty put(String str, SettableBeanProperty settableBeanProperty) {
            return (SettableBeanProperty) super.put(str.toLowerCase(this._locale), settableBeanProperty);
        }
    }
}
