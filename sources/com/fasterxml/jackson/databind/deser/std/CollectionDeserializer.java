package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.CoercionAction;
import com.fasterxml.jackson.databind.cfg.CoercionInputShape;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o.AbstractC5548Vy;
import o.AbstractC5597Xv;
import o.C5565Wp;
import o.C5619Yr;
import o.InterfaceC5554We;
import o.InterfaceC5555Wf;
import o.VK;

/* JADX INFO: loaded from: classes21.dex */
@VK
public class CollectionDeserializer extends ContainerDeserializerBase<Collection<Object>> implements InterfaceC5554We {
    private static final long serialVersionUID = -1;
    protected final AbstractC5548Vy<Object> _delegateDeserializer;
    protected final AbstractC5548Vy<Object> _valueDeserializer;
    protected final ValueInstantiator _valueInstantiator;
    protected final AbstractC5597Xv _valueTypeDeserializer;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase
    public AbstractC5548Vy<Object> getContentDeserializer() {
        return this._valueDeserializer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public ValueInstantiator getValueInstantiator() {
        return this._valueInstantiator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5548Vy
    public boolean isCachable() {
        return this._valueDeserializer == null && this._valueTypeDeserializer == null && this._delegateDeserializer == null;
    }

    public CollectionDeserializer(JavaType javaType, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv, ValueInstantiator valueInstantiator) {
        this(javaType, abstractC5548Vy, abstractC5597Xv, valueInstantiator, null, null, null);
    }

    public CollectionDeserializer(JavaType javaType, AbstractC5548Vy<Object> abstractC5548Vy, AbstractC5597Xv abstractC5597Xv, ValueInstantiator valueInstantiator, AbstractC5548Vy<Object> abstractC5548Vy2, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
        super(javaType, interfaceC5555Wf, bool);
        this._valueDeserializer = abstractC5548Vy;
        this._valueTypeDeserializer = abstractC5597Xv;
        this._valueInstantiator = valueInstantiator;
        this._delegateDeserializer = abstractC5548Vy2;
    }

    public CollectionDeserializer(CollectionDeserializer collectionDeserializer) {
        super(collectionDeserializer);
        this._valueDeserializer = collectionDeserializer._valueDeserializer;
        this._valueTypeDeserializer = collectionDeserializer._valueTypeDeserializer;
        this._valueInstantiator = collectionDeserializer._valueInstantiator;
        this._delegateDeserializer = collectionDeserializer._delegateDeserializer;
    }

    public CollectionDeserializer withResolved(AbstractC5548Vy<?> abstractC5548Vy, AbstractC5548Vy<?> abstractC5548Vy2, AbstractC5597Xv abstractC5597Xv, InterfaceC5555Wf interfaceC5555Wf, Boolean bool) {
        return new CollectionDeserializer(this._containerType, abstractC5548Vy2, abstractC5597Xv, this._valueInstantiator, abstractC5548Vy, interfaceC5555Wf, bool);
    }

    @Override // o.AbstractC5548Vy
    public LogicalType logicalType() {
        return LogicalType.Collection;
    }

    /* JADX DEBUG: Method merged with bridge method: createContextual(Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/BeanProperty;)Lo/Vy; */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    @Override // o.InterfaceC5554We
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CollectionDeserializer createContextual(DeserializationContext deserializationContext, BeanProperty beanProperty) throws JsonMappingException {
        AbstractC5548Vy<Object> abstractC5548VyFindDeserializer;
        AbstractC5548Vy<?> abstractC5548VyHandleSecondaryContextualization;
        ValueInstantiator valueInstantiator = this._valueInstantiator;
        if (valueInstantiator == null) {
            abstractC5548VyFindDeserializer = null;
        } else if (valueInstantiator.canCreateUsingDelegate()) {
            JavaType delegateType = this._valueInstantiator.getDelegateType(deserializationContext.getConfig());
            if (delegateType == null) {
                JavaType javaType = this._containerType;
                deserializationContext.reportBadDefinition(javaType, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'", javaType, this._valueInstantiator.getClass().getName()));
            }
            abstractC5548VyFindDeserializer = findDeserializer(deserializationContext, delegateType, beanProperty);
        } else if (this._valueInstantiator.canCreateUsingArrayDelegate()) {
            JavaType arrayDelegateType = this._valueInstantiator.getArrayDelegateType(deserializationContext.getConfig());
            if (arrayDelegateType == null) {
                JavaType javaType2 = this._containerType;
                deserializationContext.reportBadDefinition(javaType2, String.format("Invalid delegate-creator definition for %s: value instantiator (%s) returned true for 'canCreateUsingArrayDelegate()', but null for 'getArrayDelegateType()'", javaType2, this._valueInstantiator.getClass().getName()));
            }
            abstractC5548VyFindDeserializer = findDeserializer(deserializationContext, arrayDelegateType, beanProperty);
        }
        AbstractC5548Vy<Object> abstractC5548Vy = abstractC5548VyFindDeserializer;
        Boolean boolFindFormatFeature = findFormatFeature(deserializationContext, beanProperty, Collection.class, JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        AbstractC5548Vy<?> abstractC5548VyFindConvertingContentDeserializer = findConvertingContentDeserializer(deserializationContext, beanProperty, this._valueDeserializer);
        JavaType contentType = this._containerType.getContentType();
        if (abstractC5548VyFindConvertingContentDeserializer == null) {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.findContextualValueDeserializer(contentType, beanProperty);
        } else {
            abstractC5548VyHandleSecondaryContextualization = deserializationContext.handleSecondaryContextualization(abstractC5548VyFindConvertingContentDeserializer, beanProperty, contentType);
        }
        AbstractC5548Vy<?> abstractC5548Vy2 = abstractC5548VyHandleSecondaryContextualization;
        AbstractC5597Xv abstractC5597XvForProperty = this._valueTypeDeserializer;
        if (abstractC5597XvForProperty != null) {
            abstractC5597XvForProperty = abstractC5597XvForProperty.forProperty(beanProperty);
        }
        AbstractC5597Xv abstractC5597Xv = abstractC5597XvForProperty;
        InterfaceC5555Wf interfaceC5555WfFindContentNullProvider = findContentNullProvider(deserializationContext, beanProperty, abstractC5548Vy2);
        return (Objects.equals(boolFindFormatFeature, this._unwrapSingle) && interfaceC5555WfFindContentNullProvider == this._nullProvider && abstractC5548Vy == this._delegateDeserializer && abstractC5548Vy2 == this._valueDeserializer && abstractC5597Xv == this._valueTypeDeserializer) ? this : withResolved(abstractC5548Vy, abstractC5548Vy2, abstractC5597Xv, interfaceC5555WfFindContentNullProvider, boolFindFormatFeature);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public Collection<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        AbstractC5548Vy<Object> abstractC5548Vy = this._delegateDeserializer;
        if (abstractC5548Vy != null) {
            return (Collection) this._valueInstantiator.createUsingDelegate(deserializationContext, abstractC5548Vy.deserialize(jsonParser, deserializationContext));
        }
        if (jsonParser.RJOkX()) {
            return _deserializeFromArray(jsonParser, deserializationContext, createDefaultInstance(deserializationContext));
        }
        if (jsonParser.copydefault(JsonToken.VALUE_STRING)) {
            return _deserializeFromString(jsonParser, deserializationContext, jsonParser.zLjUOn());
        }
        return handleNonArray(jsonParser, deserializationContext, createDefaultInstance(deserializationContext));
    }

    public Collection<Object> createDefaultInstance(DeserializationContext deserializationContext) throws IOException {
        return (Collection) this._valueInstantiator.createUsingDefault(deserializationContext);
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // o.AbstractC5548Vy
    public Collection<Object> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        if (jsonParser.RJOkX()) {
            return _deserializeFromArray(jsonParser, deserializationContext, collection);
        }
        return handleNonArray(jsonParser, deserializationContext, collection);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, o.AbstractC5548Vy
    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5597Xv abstractC5597Xv) throws IOException {
        return abstractC5597Xv.deserializeTypedFromArray(jsonParser, deserializationContext);
    }

    public Collection<Object> _deserializeFromString(JsonParser jsonParser, DeserializationContext deserializationContext, String str) throws IOException {
        Class<?> clsHandledType = handledType();
        if (str.isEmpty()) {
            CoercionAction coercionActionFindCoercionAction = deserializationContext.findCoercionAction(logicalType(), clsHandledType, CoercionInputShape.EmptyString);
            if (coercionActionFindCoercionAction != null && coercionActionFindCoercionAction != CoercionAction.Fail) {
                return (Collection) _deserializeFromEmptyString(jsonParser, deserializationContext, coercionActionFindCoercionAction, clsHandledType, "empty String (\"\")");
            }
        } else if (StdDeserializer._isBlank(str)) {
            LogicalType logicalType = logicalType();
            CoercionAction coercionAction = CoercionAction.Fail;
            CoercionAction coercionActionFindCoercionFromBlankString = deserializationContext.findCoercionFromBlankString(logicalType, clsHandledType, coercionAction);
            if (coercionActionFindCoercionFromBlankString != coercionAction) {
                return (Collection) _deserializeFromEmptyString(jsonParser, deserializationContext, coercionActionFindCoercionFromBlankString, clsHandledType, "blank String (all whitespace)");
            }
        }
        return handleNonArray(jsonParser, deserializationContext, createDefaultInstance(deserializationContext));
    }

    public Collection<Object> _deserializeFromArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object objDeserializeWithType;
        jsonParser.KWHzl(collection);
        AbstractC5548Vy<Object> abstractC5548Vy = this._valueDeserializer;
        if (abstractC5548Vy.getObjectIdReader() != null) {
            return _deserializeWithObjectId(jsonParser, deserializationContext, collection);
        }
        AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
        while (true) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            if (jsonTokenRcXXUw == JsonToken.END_ARRAY) {
                return collection;
            }
            try {
                if (jsonTokenRcXXUw == JsonToken.VALUE_NULL) {
                    if (!this._skipNullValues) {
                        objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                    }
                } else if (abstractC5597Xv == null) {
                    objDeserializeWithType = abstractC5548Vy.deserialize(jsonParser, deserializationContext);
                } else {
                    objDeserializeWithType = abstractC5548Vy.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
                }
                collection.add(objDeserializeWithType);
            } catch (Exception e) {
                if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                    C5619Yr.AhwBna(e);
                }
                throw JsonMappingException.wrapWithPath(e, collection, collection.size());
            }
        }
    }

    public final Collection<Object> handleNonArray(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object objDeserializeWithType;
        Boolean bool = this._unwrapSingle;
        if (bool != Boolean.TRUE && (bool != null || !deserializationContext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            return (Collection) deserializationContext.handleUnexpectedToken(this._containerType, jsonParser);
        }
        AbstractC5548Vy<Object> abstractC5548Vy = this._valueDeserializer;
        AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
        try {
            if (jsonParser.copydefault(JsonToken.VALUE_NULL)) {
                if (this._skipNullValues) {
                    return collection;
                }
                objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
            } else if (abstractC5597Xv == null) {
                objDeserializeWithType = abstractC5548Vy.deserialize(jsonParser, deserializationContext);
            } else {
                objDeserializeWithType = abstractC5548Vy.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
            }
            collection.add(objDeserializeWithType);
            return collection;
        } catch (Exception e) {
            if (!deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                C5619Yr.AhwBna(e);
            }
            throw JsonMappingException.wrapWithPath(e, Object.class, collection.size());
        }
    }

    public Collection<Object> _deserializeWithObjectId(JsonParser jsonParser, DeserializationContext deserializationContext, Collection<Object> collection) throws IOException {
        Object objDeserializeWithType;
        if (!jsonParser.RJOkX()) {
            return handleNonArray(jsonParser, deserializationContext, collection);
        }
        jsonParser.KWHzl(collection);
        AbstractC5548Vy<Object> abstractC5548Vy = this._valueDeserializer;
        AbstractC5597Xv abstractC5597Xv = this._valueTypeDeserializer;
        Activity activity = new Activity(this._containerType.getContentType().getRawClass(), collection);
        while (true) {
            JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
            if (jsonTokenRcXXUw == JsonToken.END_ARRAY) {
                return collection;
            }
            try {
            } catch (UnresolvedForwardReference e) {
                e.getRoid().AEQbTJ(activity.OLrzqt(e));
            } catch (Exception e2) {
                if (deserializationContext != null && !deserializationContext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS)) {
                    C5619Yr.AhwBna(e2);
                }
                throw JsonMappingException.wrapWithPath(e2, collection, collection.size());
            }
            if (jsonTokenRcXXUw == JsonToken.VALUE_NULL) {
                if (!this._skipNullValues) {
                    objDeserializeWithType = this._nullProvider.getNullValue(deserializationContext);
                }
            } else if (abstractC5597Xv == null) {
                objDeserializeWithType = abstractC5548Vy.deserialize(jsonParser, deserializationContext);
            } else {
                objDeserializeWithType = abstractC5548Vy.deserializeWithType(jsonParser, deserializationContext, abstractC5597Xv);
            }
            activity.KWHzl(objDeserializeWithType);
        }
    }

    public static class Activity {
        public final Collection<Object> KWHzl;
        public final Class<?> OLrzqt;
        public List<StateListAnimator> copydefault = new ArrayList();

        public Activity(Class<?> cls, Collection<Object> collection) {
            this.OLrzqt = cls;
            this.KWHzl = collection;
        }

        public void KWHzl(Object obj) {
            if (this.copydefault.isEmpty()) {
                this.KWHzl.add(obj);
            } else {
                this.copydefault.get(r0.size() - 1).KWHzl.add(obj);
            }
        }

        public C5565Wp.Activity OLrzqt(UnresolvedForwardReference unresolvedForwardReference) {
            StateListAnimator stateListAnimator = new StateListAnimator(this, unresolvedForwardReference, this.OLrzqt);
            this.copydefault.add(stateListAnimator);
            return stateListAnimator;
        }

        public void copydefault(Object obj, Object obj2) throws IOException {
            Iterator<StateListAnimator> it = this.copydefault.iterator();
            Collection collection = this.KWHzl;
            while (it.hasNext()) {
                StateListAnimator next = it.next();
                if (next.EZpvd(obj)) {
                    it.remove();
                    collection.add(obj2);
                    collection.addAll(next.KWHzl);
                    return;
                }
                collection = next.KWHzl;
            }
            throw new IllegalArgumentException("Trying to resolve a forward reference with id [" + obj + "] that wasn't previously seen as unresolved.");
        }
    }

    public static final class StateListAnimator extends C5565Wp.Activity {
        public final List<Object> KWHzl;
        public final Activity OLrzqt;

        public StateListAnimator(Activity activity, UnresolvedForwardReference unresolvedForwardReference, Class<?> cls) {
            super(unresolvedForwardReference, cls);
            this.KWHzl = new ArrayList();
            this.OLrzqt = activity;
        }

        @Override // o.C5565Wp.Activity
        public void copydefault(Object obj, Object obj2) throws IOException {
            this.OLrzqt.copydefault(obj, obj2);
        }
    }
}
