package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5576Xa;
import o.C5619Yr;
import o.InterfaceC5555Wf;
import o.InterfaceC5593Xr;
import o.InterfaceC5609Yh;
import o.VI;
import o.WT;

/* JADX INFO: loaded from: classes21.dex */
public abstract class SettableBeanProperty extends ConcreteBeanPropertyBase implements Serializable {
    protected static final AbstractC5548Vy<Object> MISSING_VALUE_DESERIALIZER = new FailingDeserializer("No _valueDeserializer assigned");
    protected final transient InterfaceC5609Yh _contextAnnotations;
    protected String _managedReferenceName;
    public final InterfaceC5555Wf _nullProvider;
    public C5576Xa _objectIdInfo;
    protected final PropertyName _propName;
    protected int _propertyIndex;
    public final JavaType _type;
    public final AbstractC5548Vy<Object> _valueDeserializer;
    public final AbstractC5597Xv _valueTypeDeserializer;
    protected ViewMatcher _viewMatcher;
    protected final PropertyName _wrapperName;

    public abstract void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException;

    public abstract Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException;

    public void fixAccess(DeserializationConfig deserializationConfig) {
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract <A extends Annotation> A getAnnotation(Class<A> cls);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getFullName() {
        return this._propName;
    }

    public Object getInjectableValueId() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getManagedReferenceName() {
        return this._managedReferenceName;
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public abstract AnnotatedMember getMember();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC5555Wf getNullValueProvider() {
        return this._nullProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5576Xa getObjectIdInfo() {
        return this._objectIdInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getPropertyIndex() {
        return this._propertyIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.BeanProperty
    public JavaType getType() {
        return this._type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC5548Vy<Object> getValueDeserializer() {
        AbstractC5548Vy<Object> abstractC5548Vy = this._valueDeserializer;
        if (abstractC5548Vy == MISSING_VALUE_DESERIALIZER) {
            return null;
        }
        return abstractC5548Vy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC5597Xv getValueTypeDeserializer() {
        return this._valueTypeDeserializer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.BeanProperty
    public PropertyName getWrapperName() {
        return this._wrapperName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasValueDeserializer() {
        AbstractC5548Vy<Object> abstractC5548Vy = this._valueDeserializer;
        return (abstractC5548Vy == null || abstractC5548Vy == MISSING_VALUE_DESERIALIZER) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasValueTypeDeserializer() {
        return this._valueTypeDeserializer != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean hasViews() {
        return this._viewMatcher != null;
    }

    public boolean isIgnorable() {
        return false;
    }

    public boolean isInjectionOnly() {
        return false;
    }

    public void markAsIgnorable() {
    }

    public abstract void set(Object obj, Object obj2) throws IOException;

    public abstract Object setAndReturn(Object obj, Object obj2) throws IOException;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setManagedReferenceName(String str) {
        this._managedReferenceName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setObjectIdInfo(C5576Xa c5576Xa) {
        this._objectIdInfo = c5576Xa;
    }

    public abstract SettableBeanProperty withName(PropertyName propertyName);

    public abstract SettableBeanProperty withNullProvider(InterfaceC5555Wf interfaceC5555Wf);

    public abstract SettableBeanProperty withValueDeserializer(AbstractC5548Vy<?> abstractC5548Vy);

    public SettableBeanProperty(WT wt, JavaType javaType, AbstractC5597Xv abstractC5597Xv, InterfaceC5609Yh interfaceC5609Yh) {
        this(wt.isConnected(), javaType, wt.getNewProxyInstance(), abstractC5597Xv, interfaceC5609Yh, wt.DbNXlk());
    }

    public SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AbstractC5597Xv abstractC5597Xv, InterfaceC5609Yh interfaceC5609Yh, PropertyMetadata propertyMetadata) {
        super(propertyMetadata);
        this._propertyIndex = -1;
        if (propertyName == null) {
            this._propName = PropertyName.NO_NAME;
        } else {
            this._propName = propertyName.internSimpleName();
        }
        this._type = javaType;
        this._wrapperName = propertyName2;
        this._contextAnnotations = interfaceC5609Yh;
        this._viewMatcher = null;
        this._valueTypeDeserializer = abstractC5597Xv != null ? abstractC5597Xv.forProperty(this) : abstractC5597Xv;
        AbstractC5548Vy<Object> abstractC5548Vy = MISSING_VALUE_DESERIALIZER;
        this._valueDeserializer = abstractC5548Vy;
        this._nullProvider = abstractC5548Vy;
    }

    public SettableBeanProperty(PropertyName propertyName, JavaType javaType, PropertyMetadata propertyMetadata, AbstractC5548Vy<Object> abstractC5548Vy) {
        super(propertyMetadata);
        this._propertyIndex = -1;
        if (propertyName == null) {
            this._propName = PropertyName.NO_NAME;
        } else {
            this._propName = propertyName.internSimpleName();
        }
        this._type = javaType;
        this._wrapperName = null;
        this._contextAnnotations = null;
        this._viewMatcher = null;
        this._valueTypeDeserializer = null;
        this._valueDeserializer = abstractC5548Vy;
        this._nullProvider = abstractC5548Vy;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty) {
        super(settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = settableBeanProperty._propName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueDeserializer = settableBeanProperty._valueDeserializer;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        this._viewMatcher = settableBeanProperty._viewMatcher;
        this._nullProvider = settableBeanProperty._nullProvider;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, AbstractC5548Vy<?> abstractC5548Vy, InterfaceC5555Wf interfaceC5555Wf) {
        super(settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = settableBeanProperty._propName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        this._valueDeserializer = abstractC5548Vy == null ? MISSING_VALUE_DESERIALIZER : abstractC5548Vy;
        this._viewMatcher = settableBeanProperty._viewMatcher;
        this._nullProvider = interfaceC5555Wf == MISSING_VALUE_DESERIALIZER ? this._valueDeserializer : interfaceC5555Wf;
    }

    public SettableBeanProperty(SettableBeanProperty settableBeanProperty, PropertyName propertyName) {
        super(settableBeanProperty);
        this._propertyIndex = -1;
        this._propName = propertyName;
        this._type = settableBeanProperty._type;
        this._wrapperName = settableBeanProperty._wrapperName;
        this._contextAnnotations = settableBeanProperty._contextAnnotations;
        this._valueDeserializer = settableBeanProperty._valueDeserializer;
        this._valueTypeDeserializer = settableBeanProperty._valueTypeDeserializer;
        this._managedReferenceName = settableBeanProperty._managedReferenceName;
        this._propertyIndex = settableBeanProperty._propertyIndex;
        this._viewMatcher = settableBeanProperty._viewMatcher;
        this._nullProvider = settableBeanProperty._nullProvider;
    }

    public SettableBeanProperty withSimpleName(String str) {
        PropertyName propertyNameWithSimpleName;
        PropertyName propertyName = this._propName;
        if (propertyName == null) {
            propertyNameWithSimpleName = new PropertyName(str);
        } else {
            propertyNameWithSimpleName = propertyName.withSimpleName(str);
        }
        return propertyNameWithSimpleName == this._propName ? this : withName(propertyNameWithSimpleName);
    }

    public void setViews(Class<?>[] clsArr) {
        if (clsArr == null) {
            this._viewMatcher = null;
        } else {
            this._viewMatcher = ViewMatcher.construct(clsArr);
        }
    }

    public void assignIndex(int i) {
        if (this._propertyIndex == -1) {
            this._propertyIndex = i;
            return;
        }
        throw new IllegalStateException("Property '" + getName() + "' already had index (" + this._propertyIndex + "), trying to assign " + i);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty, o.InterfaceC5623Yw
    public final String getName() {
        return this._propName.getSimpleName();
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getContextAnnotation(Class<A> cls) {
        return (A) this._contextAnnotations.get(cls);
    }

    @Override // com.fasterxml.jackson.databind.BeanProperty
    public void depositSchemaProperty(InterfaceC5593Xr interfaceC5593Xr, VI vi) throws JsonMappingException {
        if (isRequired()) {
            interfaceC5593Xr.OLrzqt(this);
        } else {
            interfaceC5593Xr.copydefault(this);
        }
    }

    public Class<?> getDeclaringClass() {
        return getMember().getDeclaringClass();
    }

    public boolean visibleInView(Class<?> cls) {
        ViewMatcher viewMatcher = this._viewMatcher;
        return viewMatcher == null || viewMatcher.isVisibleForView(cls);
    }

    public int getCreatorIndex() {
        throw new IllegalStateException(String.format("Internal error: no creator index for property '%s' (of type %s)", getName(), getClass().getName()));
    }

    public final Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        if (jsonParser.copydefault(JsonToken.VALUE_NULL)) {
            return this._nullProvider.getNullValue(deserializationContext);
        }
        AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
        if (abstractC5597Xv != null) {
            return this._valueDeserializer.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
        }
        Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext);
        return objDeserialize == null ? this._nullProvider.getNullValue(deserializationContext) : objDeserialize;
    }

    public final Object deserializeWith(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        if (jsonParser.copydefault(JsonToken.VALUE_NULL)) {
            return NullsConstantProvider.isSkipper(this._nullProvider) ? obj : this._nullProvider.getNullValue(deserializationContext);
        }
        if (this._valueTypeDeserializer != null) {
            return deserializationContext.findContextualValueDeserializer(deserializationContext.getTypeFactory().constructType(obj.getClass()), this).deserialize(jsonParser, deserializationContext, obj);
        }
        Object objDeserialize = this._valueDeserializer.deserialize(jsonParser, deserializationContext, obj);
        return objDeserialize == null ? NullsConstantProvider.isSkipper(this._nullProvider) ? obj : this._nullProvider.getNullValue(deserializationContext) : objDeserialize;
    }

    public void _throwAsIOE(JsonParser jsonParser, Exception exc, Object obj) throws IOException {
        if (exc instanceof IllegalArgumentException) {
            String strCopydefault = C5619Yr.copydefault(obj);
            StringBuilder sb = new StringBuilder("Problem deserializing property '");
            sb.append(getName());
            sb.append("' (expected type: ");
            sb.append(getType());
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
            throw JsonMappingException.from(jsonParser, sb.toString(), exc);
        }
        _throwAsIOE(jsonParser, exc);
    }

    public IOException _throwAsIOE(JsonParser jsonParser, Exception exc) throws IOException {
        C5619Yr.KWHzl((Throwable) exc);
        C5619Yr.AhwBna(exc);
        Throwable thOLrzqt = C5619Yr.OLrzqt((Throwable) exc);
        throw JsonMappingException.from(jsonParser, C5619Yr.EZpvd(thOLrzqt), thOLrzqt);
    }

    @Deprecated
    public IOException _throwAsIOE(Exception exc) throws IOException {
        return _throwAsIOE((JsonParser) null, exc);
    }

    public void _throwAsIOE(Exception exc, Object obj) throws IOException {
        _throwAsIOE(null, exc, obj);
    }

    public String toString() {
        return "[property '" + getName() + "']";
    }

    public static abstract class Delegating extends SettableBeanProperty {
        public final SettableBeanProperty delegate;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SettableBeanProperty getDelegate() {
            return this.delegate;
        }

        public abstract SettableBeanProperty withDelegate(SettableBeanProperty settableBeanProperty);

        public Delegating(SettableBeanProperty settableBeanProperty) {
            super(settableBeanProperty);
            this.delegate = settableBeanProperty;
        }

        public SettableBeanProperty _with(SettableBeanProperty settableBeanProperty) {
            return settableBeanProperty == this.delegate ? this : withDelegate(settableBeanProperty);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public SettableBeanProperty withValueDeserializer(AbstractC5548Vy<?> abstractC5548Vy) {
            return _with(this.delegate.withValueDeserializer(abstractC5548Vy));
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public SettableBeanProperty withName(PropertyName propertyName) {
            return _with(this.delegate.withName(propertyName));
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public SettableBeanProperty withNullProvider(InterfaceC5555Wf interfaceC5555Wf) {
            return _with(this.delegate.withNullProvider(interfaceC5555Wf));
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void assignIndex(int i) {
            this.delegate.assignIndex(i);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void fixAccess(DeserializationConfig deserializationConfig) {
            this.delegate.fixAccess(deserializationConfig);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Class<?> getDeclaringClass() {
            return this.delegate.getDeclaringClass();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public String getManagedReferenceName() {
            return this.delegate.getManagedReferenceName();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public C5576Xa getObjectIdInfo() {
            return this.delegate.getObjectIdInfo();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean hasValueDeserializer() {
            return this.delegate.hasValueDeserializer();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean hasValueTypeDeserializer() {
            return this.delegate.hasValueTypeDeserializer();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public AbstractC5548Vy<Object> getValueDeserializer() {
            return this.delegate.getValueDeserializer();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public AbstractC5597Xv getValueTypeDeserializer() {
            return this.delegate.getValueTypeDeserializer();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean visibleInView(Class<?> cls) {
            return this.delegate.visibleInView(cls);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean hasViews() {
            return this.delegate.hasViews();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public int getPropertyIndex() {
            return this.delegate.getPropertyIndex();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public int getCreatorIndex() {
            return this.delegate.getCreatorIndex();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object getInjectableValueId() {
            return this.delegate.getInjectableValueId();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public boolean isInjectionOnly() {
            return this.delegate.isInjectionOnly();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
        public AnnotatedMember getMember() {
            return this.delegate.getMember();
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
        public <A extends Annotation> A getAnnotation(Class<A> cls) {
            return (A) this.delegate.getAnnotation(cls);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            this.delegate.deserializeAndSet(jsonParser, deserializationContext, obj);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
            return this.delegate.deserializeSetAndReturn(jsonParser, deserializationContext, obj);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public void set(Object obj, Object obj2) throws IOException {
            this.delegate.set(obj, obj2);
        }

        @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
        public Object setAndReturn(Object obj, Object obj2) throws IOException {
            return this.delegate.setAndReturn(obj, obj2);
        }
    }
}
