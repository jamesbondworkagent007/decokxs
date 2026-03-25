package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Objects;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.InterfaceC5554We;
import o.InterfaceC5555Wf;

/* JADX INFO: loaded from: classes21.dex */
public class EnumSetDeserializer extends StdDeserializer<EnumSet<?>> implements InterfaceC5554We {
    private static final long serialVersionUID = 1;
    protected AbstractC5548Vy<Enum<?>> _enumDeserializer;
    protected final JavaType _enumType;
    protected final InterfaceC5555Wf _nullProvider;
    protected final boolean _skipNullValues;
    protected final Boolean _unwrapSingle;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return Boolean.TRUE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.Vy<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public EnumSetDeserializer(JavaType javaType, AbstractC5548Vy<?> abstractC5548Vy) {
        super((Class<?>) EnumSet.class);
        this._enumType = javaType;
        if (javaType.isEnumType()) {
            this._enumDeserializer = abstractC5548Vy;
            this._unwrapSingle = null;
            this._nullProvider = null;
            this._skipNullValues = false;
            return;
        }
        throw new IllegalArgumentException("Type " + javaType + " not Java Enum type");
    }

    @Deprecated
    public EnumSetDeserializer(EnumSetDeserializer enumSetDeserializer, AbstractC5548Vy<?> abstractC5548Vy, Boolean bool) {
        this(enumSetDeserializer, abstractC5548Vy, enumSetDeserializer._nullProvider, bool);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.Vy<?> */
    /* JADX WARN: Multi-variable type inference failed */
    public EnumSetDeserializer(EnumSetDeserializer enumSetDeserializer, AbstractC5548Vy<?> abstractC5548Vy, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
        super(enumSetDeserializer);
        this._enumType = enumSetDeserializer._enumType;
        this._enumDeserializer = abstractC5548Vy;
        this._nullProvider = interfaceC5555Wf;
        this._skipNullValues = NullsConstantProvider.isSkipper(interfaceC5555Wf);
        this._unwrapSingle = bool;
    }

    public EnumSetDeserializer withDeserializer(AbstractC5548Vy<?> abstractC5548Vy) {
        return this._enumDeserializer == abstractC5548Vy ? this : new EnumSetDeserializer(this, abstractC5548Vy, this._nullProvider, this._unwrapSingle);
    }

    @Deprecated
    public EnumSetDeserializer withResolved(AbstractC5548Vy<?> abstractC5548Vy, Boolean bool) {
        return withResolved(abstractC5548Vy, this._nullProvider, bool);
    }

    public EnumSetDeserializer withResolved(AbstractC5548Vy<?> abstractC5548Vy, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
        return (Objects.equals(this._unwrapSingle, bool) && this._enumDeserializer == abstractC5548Vy && this._nullProvider == abstractC5548Vy) ? this : new EnumSetDeserializer(this, abstractC5548Vy, interfaceC5555Wf, bool);
    }

    @Override // o.AbstractC5548Vy
    public boolean isCachable() {
        return this._enumType.getValueHandler() == null;
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Collection;
    }

    @Override // o.AbstractC5548Vy
    public Object getEmptyValue(DeserializationContext deserializationContext) throws JsonMappingException {
        return constructSet();
    }

    @Override // o.AbstractC5548Vy
    public AccessPattern getEmptyAccessPattern() {
        return AccessPattern.DYNAMIC;
    }

    @Override // o.InterfaceC5554We
    public AbstractC5548Vy<?> createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC5548Vy<?> abstractC5548VyHandleSecondaryContextualization;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, EnumSet.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        AbstractC5548Vy<Enum<?>> abstractC5548Vy = this._enumDeserializer;
        if (abstractC5548Vy == null) {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(this._enumType, beanProperty);
        } else {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(abstractC5548Vy, beanProperty, this._enumType);
        }
        return withResolved(abstractC5548VyHandleSecondaryContextualization, findContentNullProvider(deserializationContext, beanProperty, abstractC5548VyHandleSecondaryContextualization), boolFindFormatFeature);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public EnumSet<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        EnumSet enumSetConstructSet = constructSet();
        if (!jsonParser.RJOkX()) {
            return handleNonArray(jsonParser, deserializationContext, enumSetConstructSet);
        }
        return _deserialize(jsonParser, deserializationContext, enumSetConstructSet);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public EnumSet<?> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet<?> enumSet) throws IOException {
        if (!jsonParser.RJOkX()) {
            return handleNonArray(jsonParser, deserializationContext, enumSet);
        }
        return _deserialize(jsonParser, deserializationContext, enumSet);
    }

    public final EnumSet<?> _deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws IOException {
        Enum<?> enumDeserialize;
        while (true) {
            try {
                JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
                if (jsonTokenRcXXUw == JsonToken.END_ARRAY) {
                    return enumSet;
                }
                if (jsonTokenRcXXUw != JsonToken.VALUE_NULL) {
                    enumDeserialize = this._enumDeserializer.deserialize(jsonParser, deserializationContext);
                } else if (!this._skipNullValues) {
                    enumDeserialize = (Enum) this._nullProvider.getNullValue(deserializationContext);
                }
                if (enumDeserialize != null) {
                    enumSet.add(enumDeserialize);
                }
            } catch (Exception e) {
                throw JsonMappingException.wrapWithPath(e, enumSet, enumSet.size());
            }
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        return abstractC5597Xv.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    private EnumSet constructSet() {
        return EnumSet.noneOf(this._enumType.getRawClass());
    }

    public EnumSet<?> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, EnumSet enumSet) throws IOException {
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (EnumSet) deserializationContext.handleUnexpectedToken(EnumSet.class, jsonParser);
        }
        if (jsonParser.copydefault(JsonToken.VALUE_NULL)) {
            return (EnumSet) deserializationContext.handleUnexpectedToken(this._enumType, jsonParser);
        }
        try {
            Enum<?> enumDeserialize = this._enumDeserializer.deserialize(jsonParser, deserializationContext);
            if (enumDeserialize != null) {
                enumSet.add(enumDeserialize);
            }
            return enumSet;
        } catch (Exception e) {
            throw JsonMappingException.wrapWithPath(e, enumSet, enumSet.size());
        }
    }
}
