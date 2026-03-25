package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.io.IOException;
import java.lang.annotation.Annotation;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5619Yr;
import o.InterfaceC5555Wf;
import o.InterfaceC5609Yh;

/* JADX INFO: loaded from: classes21.dex */
public class CreatorProperty extends SettableBeanProperty {
    private static final long serialVersionUID = 1;
    protected final AnnotatedParameter _annotated;
    protected final int _creatorIndex;
    protected SettableBeanProperty _fallbackSetter;
    protected boolean _ignorable;
    protected final JacksonInject.Value _injectableValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public int getCreatorIndex() {
        return this._creatorIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public AnnotatedMember getMember() {
        return this._annotated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public boolean isIgnorable() {
        return this._ignorable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void markAsIgnorable() {
        this._ignorable = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFallbackSetter(SettableBeanProperty settableBeanProperty) {
        this._fallbackSetter = settableBeanProperty;
    }

    public CreatorProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AbstractC5597Xv abstractC5597Xv, InterfaceC5609Yh interfaceC5609Yh, AnnotatedParameter annotatedParameter, int i, JacksonInject.Value value, PropertyMetadata propertyMetadata) {
        super(propertyName, javaType, propertyName2, abstractC5597Xv, interfaceC5609Yh, propertyMetadata);
        this._annotated = annotatedParameter;
        this._creatorIndex = i;
        this._injectableValue = value;
        this._fallbackSetter = null;
    }

    @Deprecated
    public CreatorProperty(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AbstractC5597Xv abstractC5597Xv, InterfaceC5609Yh interfaceC5609Yh, AnnotatedParameter annotatedParameter, int i, Object obj, PropertyMetadata propertyMetadata) {
        this(propertyName, javaType, propertyName2, abstractC5597Xv, interfaceC5609Yh, annotatedParameter, i, obj != null ? JacksonInject.Value.construct(obj, null) : null, propertyMetadata);
    }

    public static CreatorProperty construct(PropertyName propertyName, JavaType javaType, PropertyName propertyName2, AbstractC5597Xv abstractC5597Xv, InterfaceC5609Yh interfaceC5609Yh, AnnotatedParameter annotatedParameter, int i, JacksonInject.Value value, PropertyMetadata propertyMetadata) {
        return new CreatorProperty(propertyName, javaType, propertyName2, abstractC5597Xv, interfaceC5609Yh, annotatedParameter, i, value, propertyMetadata);
    }

    public CreatorProperty(CreatorProperty creatorProperty, PropertyName propertyName) {
        super(creatorProperty, propertyName);
        this._annotated = creatorProperty._annotated;
        this._injectableValue = creatorProperty._injectableValue;
        this._fallbackSetter = creatorProperty._fallbackSetter;
        this._creatorIndex = creatorProperty._creatorIndex;
        this._ignorable = creatorProperty._ignorable;
    }

    public CreatorProperty(CreatorProperty creatorProperty, AbstractC5548Vy<?> abstractC5548Vy, InterfaceC5555Wf interfaceC5555Wf) {
        super(creatorProperty, abstractC5548Vy, interfaceC5555Wf);
        this._annotated = creatorProperty._annotated;
        this._injectableValue = creatorProperty._injectableValue;
        this._fallbackSetter = creatorProperty._fallbackSetter;
        this._creatorIndex = creatorProperty._creatorIndex;
        this._ignorable = creatorProperty._ignorable;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withName(PropertyName propertyName) {
        return new CreatorProperty(this, propertyName);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withValueDeserializer(AbstractC5548Vy<?> abstractC5548Vy) {
        AbstractC5548Vy<?> abstractC5548Vy2 = this._valueDeserializer;
        if (abstractC5548Vy2 == abstractC5548Vy) {
            return this;
        }
        InterfaceC5555Wf interfaceC5555Wf = this._nullProvider;
        if (abstractC5548Vy2 == interfaceC5555Wf) {
            interfaceC5555Wf = abstractC5548Vy;
        }
        return new CreatorProperty(this, abstractC5548Vy, interfaceC5555Wf);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public SettableBeanProperty withNullProvider(InterfaceC5555Wf interfaceC5555Wf) {
        return new CreatorProperty(this, this._valueDeserializer, interfaceC5555Wf);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void fixAccess(DeserializationConfig deserializationConfig) {
        SettableBeanProperty settableBeanProperty = this._fallbackSetter;
        if (settableBeanProperty != null) {
            settableBeanProperty.fixAccess(deserializationConfig);
        }
    }

    @Deprecated
    public Object findInjectableValue(DeserializationContext deserializationContext, Object obj) throws JsonMappingException {
        if (this._injectableValue == null) {
            deserializationContext.reportBadDefinition(C5619Yr.OLrzqt(obj), String.format("Property %s (type %s) has no injectable value id configured", C5619Yr.copydefault(getName()), C5619Yr.copydefault(this)));
        }
        return deserializationContext.findInjectableValue(this._injectableValue.getId(), this, obj);
    }

    @Deprecated
    public void inject(DeserializationContext deserializationContext, Object obj) throws IOException {
        set(obj, findInjectableValue(deserializationContext, obj));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty, com.fasterxml.jackson.databind.BeanProperty
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        AnnotatedParameter annotatedParameter = this._annotated;
        if (annotatedParameter == null) {
            return null;
        }
        return (A) annotatedParameter.getAnnotation(cls);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void deserializeAndSet(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        _verifySetter();
        this._fallbackSetter.set(obj, deserialize(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object deserializeSetAndReturn(JsonParser jsonParser, DeserializationContext deserializationContext, Object obj) throws IOException {
        _verifySetter();
        return this._fallbackSetter.setAndReturn(obj, deserialize(jsonParser, deserializationContext));
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public void set(Object obj, Object obj2) throws IOException {
        _verifySetter();
        this._fallbackSetter.set(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object setAndReturn(Object obj, Object obj2) throws IOException {
        _verifySetter();
        return this._fallbackSetter.setAndReturn(obj, obj2);
    }

    @Override // com.fasterxml.jackson.databind.introspect.ConcreteBeanPropertyBase, com.fasterxml.jackson.databind.BeanProperty
    public PropertyMetadata getMetadata() {
        PropertyMetadata metadata = super.getMetadata();
        SettableBeanProperty settableBeanProperty = this._fallbackSetter;
        return settableBeanProperty != null ? metadata.withMergeInfo(settableBeanProperty.getMetadata().getMergeInfo()) : metadata;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public Object getInjectableValueId() {
        JacksonInject.Value value = this._injectableValue;
        if (value == null) {
            return null;
        }
        return value.getId();
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public boolean isInjectionOnly() {
        JacksonInject.Value value = this._injectableValue;
        return (value == null || value.willUseInput(true)) ? false : true;
    }

    @Override // com.fasterxml.jackson.databind.deser.SettableBeanProperty
    public String toString() {
        return "[creator property, name " + C5619Yr.copydefault(getName()) + "; inject id '" + getInjectableValueId() + "']";
    }

    private final void _verifySetter() throws IOException {
        if (this._fallbackSetter == null) {
            _reportMissingSetter(null, null);
        }
    }

    private void _reportMissingSetter(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String str = "No fallback setter/field defined for creator property " + C5619Yr.copydefault(getName());
        if (deserializationContext != null) {
            deserializationContext.reportBadDefinition(getType(), str);
            return;
        }
        throw InvalidDefinitionException.from(jsonParser, str, getType());
    }
}
