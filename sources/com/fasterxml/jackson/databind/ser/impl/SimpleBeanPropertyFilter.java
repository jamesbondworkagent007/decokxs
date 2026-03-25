package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.InterfaceC5593Xr;
import o.VI;
import o.XV;
import o.XX;

/* JADX INFO: loaded from: classes21.dex */
public class SimpleBeanPropertyFilter implements XV, XX {
    public boolean include(BeanPropertyWriter beanPropertyWriter) {
        return true;
    }

    public boolean include(PropertyWriter propertyWriter) {
        return true;
    }

    public boolean includeElement(Object obj) {
        return true;
    }

    public static SimpleBeanPropertyFilter serializeAll() {
        return SerializeExceptFilter.INCLUDE_ALL;
    }

    @Deprecated
    public static SimpleBeanPropertyFilter serializeAll(Set<String> set) {
        return new FilterExceptFilter(set);
    }

    public static SimpleBeanPropertyFilter filterOutAllExcept(Set<String> set) {
        return new FilterExceptFilter(set);
    }

    public static SimpleBeanPropertyFilter filterOutAllExcept(String... strArr) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new FilterExceptFilter(hashSet);
    }

    public static SimpleBeanPropertyFilter serializeAllExcept(Set<String> set) {
        return new SerializeExceptFilter(set);
    }

    public static SimpleBeanPropertyFilter serializeAllExcept(String... strArr) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new SerializeExceptFilter(hashSet);
    }

    public static XX from(final XV xv) {
        return new XX() { // from class: com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter.4
            @Override // o.XX
            public void serializeAsField(Object obj, JsonGenerator jsonGenerator, VI vi, PropertyWriter propertyWriter) throws Exception {
                xv.serializeAsField(obj, jsonGenerator, vi, (BeanPropertyWriter) propertyWriter);
            }

            @Override // o.XX
            public void depositSchemaProperty(PropertyWriter propertyWriter, ObjectNode objectNode, VI vi) throws JsonMappingException {
                xv.depositSchemaProperty((BeanPropertyWriter) propertyWriter, objectNode, vi);
            }

            @Override // o.XX
            public void depositSchemaProperty(PropertyWriter propertyWriter, InterfaceC5593Xr interfaceC5593Xr, VI vi) throws JsonMappingException {
                xv.depositSchemaProperty((BeanPropertyWriter) propertyWriter, interfaceC5593Xr, vi);
            }
        };
    }

    @Override // o.XV
    @Deprecated
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, VI vi, BeanPropertyWriter beanPropertyWriter) throws Exception {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.serializeAsField(obj, jsonGenerator, vi);
        } else {
            if (jsonGenerator.OLrzqt()) {
                return;
            }
            beanPropertyWriter.serializeAsOmittedField(obj, jsonGenerator, vi);
        }
    }

    @Override // o.XV
    @Deprecated
    public void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, ObjectNode objectNode, VI vi) throws JsonMappingException {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.depositSchemaProperty(objectNode, vi);
        }
    }

    @Override // o.XV
    @Deprecated
    public void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, InterfaceC5593Xr interfaceC5593Xr, VI vi) throws JsonMappingException {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.depositSchemaProperty(interfaceC5593Xr, vi);
        }
    }

    @Override // o.XX
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, VI vi, PropertyWriter propertyWriter) throws Exception {
        if (include(propertyWriter)) {
            propertyWriter.serializeAsField(obj, jsonGenerator, vi);
        } else {
            if (jsonGenerator.OLrzqt()) {
                return;
            }
            propertyWriter.serializeAsOmittedField(obj, jsonGenerator, vi);
        }
    }

    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, VI vi, PropertyWriter propertyWriter) throws Exception {
        if (includeElement(obj)) {
            propertyWriter.serializeAsElement(obj, jsonGenerator, vi);
        }
    }

    @Override // o.XX
    @Deprecated
    public void depositSchemaProperty(PropertyWriter propertyWriter, ObjectNode objectNode, VI vi) throws JsonMappingException {
        if (include(propertyWriter)) {
            propertyWriter.depositSchemaProperty(objectNode, vi);
        }
    }

    @Override // o.XX
    public void depositSchemaProperty(PropertyWriter propertyWriter, InterfaceC5593Xr interfaceC5593Xr, VI vi) throws JsonMappingException {
        if (include(propertyWriter)) {
            propertyWriter.depositSchemaProperty(interfaceC5593Xr, vi);
        }
    }

    public static class FilterExceptFilter extends SimpleBeanPropertyFilter implements Serializable {
        private static final long serialVersionUID = 1;
        protected final Set<String> _propertiesToInclude;

        public FilterExceptFilter(Set<String> set) {
            this._propertiesToInclude = set;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(BeanPropertyWriter beanPropertyWriter) {
            return this._propertiesToInclude.contains(beanPropertyWriter.getName());
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(PropertyWriter propertyWriter) {
            return this._propertiesToInclude.contains(propertyWriter.getName());
        }
    }

    public static class SerializeExceptFilter extends SimpleBeanPropertyFilter implements Serializable {
        static final SerializeExceptFilter INCLUDE_ALL = new SerializeExceptFilter();
        private static final long serialVersionUID = 1;
        protected final Set<String> _propertiesToExclude;

        public SerializeExceptFilter() {
            this._propertiesToExclude = Collections.emptySet();
        }

        public SerializeExceptFilter(Set<String> set) {
            this._propertiesToExclude = set;
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(BeanPropertyWriter beanPropertyWriter) {
            return !this._propertiesToExclude.contains(beanPropertyWriter.getName());
        }

        @Override // com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter
        public boolean include(PropertyWriter propertyWriter) {
            return !this._propertiesToExclude.contains(propertyWriter.getName());
        }
    }
}
