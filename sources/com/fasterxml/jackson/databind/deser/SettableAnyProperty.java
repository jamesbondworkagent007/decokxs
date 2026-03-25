package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.impl.JDKValueInstantiators;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5565Wp;
import o.C5619Yr;
import o.VC;

/* JADX INFO: loaded from: classes21.dex */
public abstract class SettableAnyProperty implements Serializable {
    private static final long serialVersionUID = 1;
    protected final VC _keyDeserializer;
    protected final BeanProperty _property;
    protected final AnnotatedMember _setter;
    protected final boolean _setterIsField;
    protected final JavaType _type;
    protected AbstractC5548Vy<Object> _valueDeserializer;
    protected final AbstractC5597Xv _valueTypeDeserializer;

    public abstract void _set(Object obj, Object obj2, Object obj3) throws Exception;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BeanProperty getProperty() {
        return this._property;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JavaType getType() {
        return this._type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasValueDeserializer() {
        return this._valueDeserializer != null;
    }

    public abstract SettableAnyProperty withValueDeserializer(AbstractC5548Vy<Object> abstractC5548Vy);

    public SettableAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, VC vc, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv) {
        this._property = beanProperty;
        this._setter = annotatedMember;
        this._type = javaType;
        this._valueDeserializer = abstractC5548Vy;
        this._valueTypeDeserializer = abstractC5597Xv;
        this._keyDeserializer = vc;
        this._setterIsField = annotatedMember instanceof AnnotatedField;
    }

    public static SettableAnyProperty constructForMethod(DeserializationContext deserializationContext, BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, VC vc, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv) {
        return new MethodAnyProperty(beanProperty, annotatedMember, javaType, vc, abstractC5548Vy, abstractC5597Xv);
    }

    public static SettableAnyProperty constructForMapField(DeserializationContext deserializationContext, BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, VC vc, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv) {
        Class<?> rawType = annotatedMember.getRawType();
        if (rawType == Map.class) {
            rawType = LinkedHashMap.class;
        }
        return new MapFieldAnyProperty(beanProperty, annotatedMember, javaType, vc, abstractC5548Vy, abstractC5597Xv, JDKValueInstantiators.KWHzl(deserializationContext.getConfig(), rawType));
    }

    public static SettableAnyProperty constructForJsonNodeField(DeserializationContext deserializationContext, BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, AbstractC5548Vy<Object> abstractC5548Vy) {
        return new JsonNodeFieldAnyProperty(beanProperty, annotatedMember, javaType, abstractC5548Vy, deserializationContext.getNodeFactory());
    }

    public void fixAccess(DeserializationConfig deserializationConfig) {
        this._setter.fixAccess(deserializationConfig.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
    }

    public Object readResolve() {
        AnnotatedMember annotatedMember = this._setter;
        if (annotatedMember == null || annotatedMember.getAnnotated() == null) {
            throw new IllegalArgumentException("Missing method/field (broken JDK (de)serialization?)");
        }
        return this;
    }

    public String getPropertyName() {
        return this._property.getName();
    }

    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
        try {
            VC vc = this._keyDeserializer;
            set(obj, vc == null ? str : vc.deserializeKey(str, deserializationContext), deserialize(jsonParser, deserializationContext));
        } catch (UnresolvedForwardReference e) {
            if (this._valueDeserializer.getObjectIdReader() == null) {
                throw JsonMappingException.from(jsonParser, "Unresolved forward reference but no identity info.", e);
            }
            e.getRoid().AEQbTJ((C5565Wp.Activity) new StateListAnimator(this, e, this._type.getRawClass(), obj, str));
        }
    }

    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.copydefault(JsonToken.VALUE_NULL)) {
            return this._valueDeserializer.getNullValue(deserializationContext);
        }
        AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
        if (abstractC5597Xv != null) {
            return this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
        }
        return this._valueDeserializer.deserialize(jsonParser, deserializationContext);
    }

    public void set(Object obj, Object obj2, Object obj3) throws IOException {
        try {
            _set(obj, obj2, obj3);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            _throwAsIOE(e2, obj2, obj3);
        }
    }

    public void _throwAsIOE(Exception exc, Object obj, Object obj2) throws IOException {
        if (exc instanceof IllegalArgumentException) {
            String strCopydefault = C5619Yr.copydefault(obj2);
            StringBuilder sb = new StringBuilder("Problem deserializing \"any-property\" '");
            sb.append(obj);
            sb.append("' of class " + getClassName() + " (expected type: ");
            sb.append(this._type);
            sb.append("; actual type: ");
            sb.append(strCopydefault);
            sb.append(")");
            String strEZpvd = C5619Yr.EZpvd((Throwable) exc);
            if (strEZpvd != null) {
                sb.append(", problem: ");
                sb.append(strEZpvd);
            } else {
                sb.append(" (no error message provided)");
            }
            throw new JsonMappingException((Closeable) null, sb.toString(), exc);
        }
        C5619Yr.KWHzl((Throwable) exc);
        C5619Yr.AhwBna(exc);
        Throwable thOLrzqt = C5619Yr.OLrzqt((Throwable) exc);
        throw new JsonMappingException((Closeable) null, C5619Yr.EZpvd(thOLrzqt), thOLrzqt);
    }

    private String getClassName() {
        return C5619Yr.uzCIH(this._setter.getDeclaringClass());
    }

    public String toString() {
        return "[any property on class " + getClassName() + "]";
    }

    public static class StateListAnimator extends C5565Wp.Activity {
        public final Object AEQbTJ;
        public final SettableAnyProperty KWHzl;
        public final String OLrzqt;

        public StateListAnimator(SettableAnyProperty settableAnyProperty, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls, Object obj, String str) {
            super(unresolvedForwardReference, cls);
            this.KWHzl = settableAnyProperty;
            this.AEQbTJ = obj;
            this.OLrzqt = str;
        }

        @Override // o.C5565Wp.Activity
        public void copydefault(Object obj, Object obj2) throws IOException {
            if (!EZpvd(obj)) {
                throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj.toString() + "] that wasn't previously registered.");
            }
            this.KWHzl.set(this.AEQbTJ, this.OLrzqt, obj2);
        }
    }

    public static class MethodAnyProperty extends SettableAnyProperty implements Serializable {
        private static final long serialVersionUID = 1;

        public MethodAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, VC vc, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv) {
            super(beanProperty, annotatedMember, javaType, vc, abstractC5548Vy, abstractC5597Xv);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public void _set(Object obj, Object obj2, Object obj3) throws Exception {
            ((AnnotatedMethod) this._setter).callOnWith(obj, obj2, obj3);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public SettableAnyProperty withValueDeserializer(AbstractC5548Vy<Object> abstractC5548Vy) {
            return new MethodAnyProperty(this._property, this._setter, this._type, this._keyDeserializer, abstractC5548Vy, this._valueTypeDeserializer);
        }
    }

    public static class MapFieldAnyProperty extends SettableAnyProperty implements Serializable {
        private static final long serialVersionUID = 1;
        protected final ValueInstantiator _valueInstantiator;

        public MapFieldAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, VC vc, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv, ValueInstantiator valueInstantiator) {
            super(beanProperty, annotatedMember, javaType, vc, abstractC5548Vy, abstractC5597Xv);
            this._valueInstantiator = valueInstantiator;
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public SettableAnyProperty withValueDeserializer(AbstractC5548Vy<Object> abstractC5548Vy) {
            return new MapFieldAnyProperty(this._property, this._setter, this._type, this._keyDeserializer, abstractC5548Vy, this._valueTypeDeserializer, this._valueInstantiator);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public void _set(Object obj, Object obj2, Object obj3) throws Exception {
            AnnotatedField annotatedField = (AnnotatedField) this._setter;
            Map<Object, Object> map_createAndSetMap = (Map) annotatedField.getValue(obj);
            if (map_createAndSetMap == null) {
                map_createAndSetMap = _createAndSetMap(null, annotatedField, obj, obj2);
            }
            map_createAndSetMap.put(obj2, obj3);
        }

        public Map<Object, Object> _createAndSetMap(DeserializationContext deserializationContext, AnnotatedField annotatedField, Object obj, Object obj2) throws IOException {
            ValueInstantiator valueInstantiator = this._valueInstantiator;
            if (valueInstantiator == null) {
                throw JsonMappingException.from(deserializationContext, String.format("Cannot create an instance of %s for use as \"any-setter\" '%s'", C5619Yr.uzCIH(this._type.getRawClass()), this._property.getName()));
            }
            Map<Object, Object> map = (Map) valueInstantiator.createUsingDefault(deserializationContext);
            annotatedField.setValue(obj, map);
            return map;
        }
    }

    public static class JsonNodeFieldAnyProperty extends SettableAnyProperty implements Serializable {
        private static final long serialVersionUID = 1;
        protected final JsonNodeFactory _nodeFactory;

        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public SettableAnyProperty withValueDeserializer(AbstractC5548Vy<Object> abstractC5548Vy) {
            return this;
        }

        public JsonNodeFieldAnyProperty(BeanProperty beanProperty, AnnotatedMember annotatedMember, JavaType javaType, AbstractC5548Vy<Object> abstractC5548Vy, JsonNodeFactory jsonNodeFactory) {
            super(beanProperty, annotatedMember, javaType, null, abstractC5548Vy, null);
            this._nodeFactory = jsonNodeFactory;
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj, String str) throws IOException {
            setProperty(obj, str, (JsonNode) deserialize(jsonParser, deserializationContext));
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            return this._valueDeserializer.deserialize(jsonParser, deserializationContext);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableAnyProperty
        public void _set(Object obj, Object obj2, Object obj3) throws Exception {
            setProperty(obj, (String) obj2, (JsonNode) obj3);
        }

        public void setProperty(Object obj, String str, JsonNode jsonNode) throws IOException {
            ObjectNode objectNode;
            AnnotatedField annotatedField = (AnnotatedField) this._setter;
            Object value = annotatedField.getValue(obj);
            if (value == null) {
                objectNode = this._nodeFactory.objectNode();
                annotatedField.setValue(obj, objectNode);
            } else {
                if (!(value instanceof ObjectNode)) {
                    throw JsonMappingException.from((DeserializationContext) null, String.format("Value \"any-setter\" '%s' not `ObjectNode` but %s", getPropertyName(), C5619Yr.uzCIH(value.getClass())));
                }
                objectNode = (ObjectNode) value;
            }
            objectNode.set(str, jsonNode);
        }
    }
}
