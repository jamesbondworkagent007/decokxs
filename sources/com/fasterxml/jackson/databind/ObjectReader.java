package com.fasterxml.jackson.databind;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadFeature;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.filter.TokenFilter;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.DataInput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import o.AbstractC5505Ui;
import o.AbstractC5531Vh;
import o.AbstractC5533Vj;
import o.AbstractC5548Vy;
import o.AbstractC5552Wc;
import o.C5511Uo;
import o.C5516Us;
import o.C5551Wb;
import o.C5619Yr;
import o.InterfaceC5497Ua;
import o.InterfaceC5498Ub;
import o.InterfaceC5509Um;
import o.VB;
import o.VT;
import o.VV;
import o.XQ;

/* JADX INFO: loaded from: classes21.dex */
public class ObjectReader extends AbstractC5505Ui implements Serializable {
    private static final long serialVersionUID = 2;
    protected final DeserializationConfig _config;
    protected final DefaultDeserializationContext _context;
    protected final C5551Wb _dataFormatReaders;
    private final TokenFilter _filter;
    protected final InjectableValues _injectableValues;
    protected transient JavaType _jsonNodeType;
    protected final JsonFactory _parserFactory;
    protected final AbstractC5548Vy<Object> _rootDeserializer;
    protected final ConcurrentHashMap<JavaType, AbstractC5548Vy<Object>> _rootDeserializers;
    protected final InterfaceC5497Ua _schema;
    protected final boolean _unwrapRoot;
    protected final Object _valueToUpdate;
    protected final JavaType _valueType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DeserializationConfig getConfig() {
        return this._config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC5505Ui
    public JsonFactory getFactory() {
        return this._parserFactory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InjectableValues getInjectableValues() {
        return this._injectableValues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JavaType getValueType() {
        return this._valueType;
    }

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig) {
        this(objectMapper, deserializationConfig, null, null, null, null);
    }

    public ObjectReader(ObjectMapper objectMapper, DeserializationConfig deserializationConfig, JavaType javaType, Object obj, InterfaceC5497Ua interfaceC5497Ua, InjectableValues injectableValues) {
        this._config = deserializationConfig;
        this._context = objectMapper._deserializationContext;
        this._rootDeserializers = objectMapper._rootDeserializers;
        this._parserFactory = objectMapper._jsonFactory;
        this._valueType = javaType;
        this._valueToUpdate = obj;
        this._schema = interfaceC5497Ua;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._rootDeserializer = _prefetchRootDeserializer(javaType);
        this._dataFormatReaders = null;
        this._filter = null;
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, AbstractC5548Vy<Object> abstractC5548Vy, Object obj, InterfaceC5497Ua interfaceC5497Ua, InjectableValues injectableValues, C5551Wb c5551Wb) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = javaType;
        this._rootDeserializer = abstractC5548Vy;
        this._valueToUpdate = obj;
        this._schema = interfaceC5497Ua;
        this._injectableValues = injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = c5551Wb;
        this._filter = objectReader._filter;
    }

    public ObjectReader(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        this._config = deserializationConfig;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = deserializationConfig.useRootWrapping();
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public ObjectReader(ObjectReader objectReader, JsonFactory jsonFactory) {
        this._config = objectReader._config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, jsonFactory.requiresPropertyOrdering());
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = jsonFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = objectReader._unwrapRoot;
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = objectReader._filter;
    }

    public ObjectReader(ObjectReader objectReader, TokenFilter tokenFilter) {
        this._config = objectReader._config;
        this._context = objectReader._context;
        this._rootDeserializers = objectReader._rootDeserializers;
        this._parserFactory = objectReader._parserFactory;
        this._valueType = objectReader._valueType;
        this._rootDeserializer = objectReader._rootDeserializer;
        this._valueToUpdate = objectReader._valueToUpdate;
        this._schema = objectReader._schema;
        this._injectableValues = objectReader._injectableValues;
        this._unwrapRoot = objectReader._unwrapRoot;
        this._dataFormatReaders = objectReader._dataFormatReaders;
        this._filter = tokenFilter;
    }

    @Override // o.AbstractC5505Ui
    public Version version() {
        return VV.KWHzl;
    }

    public ObjectReader _new(ObjectReader objectReader, JsonFactory jsonFactory) {
        return new ObjectReader(objectReader, jsonFactory);
    }

    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig) {
        return new ObjectReader(objectReader, deserializationConfig);
    }

    public ObjectReader _new(ObjectReader objectReader, DeserializationConfig deserializationConfig, JavaType javaType, AbstractC5548Vy<Object> abstractC5548Vy, Object obj, InterfaceC5497Ua interfaceC5497Ua, InjectableValues injectableValues, C5551Wb c5551Wb) {
        return new ObjectReader(objectReader, deserializationConfig, javaType, abstractC5548Vy, obj, interfaceC5497Ua, injectableValues, c5551Wb);
    }

    public <T> VB<T> _newIterator(JsonParser jsonParser, DeserializationContext deserializationContext, AbstractC5548Vy<?> abstractC5548Vy, boolean z) {
        return new VB<>(this._valueType, jsonParser, deserializationContext, abstractC5548Vy, z, this._valueToUpdate);
    }

    public JsonToken _initForReading(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        this._config.initialize(jsonParser, this._schema);
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        if (jsonTokenDjBIcL == null && (jsonTokenDjBIcL = jsonParser.RcXXUw()) == null) {
            deserializationContext.reportInputMismatch(this._valueType, "No content to map due to end-of-input", new Object[0]);
        }
        return jsonTokenDjBIcL;
    }

    public void _initForMultiRead(DeserializationContext deserializationContext, JsonParser jsonParser) throws IOException {
        this._config.initialize(jsonParser, this._schema);
    }

    public ObjectReader with(DeserializationFeature deserializationFeature) {
        return _with(this._config.with(deserializationFeature));
    }

    public ObjectReader with(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.with(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader withFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withFeatures(deserializationFeatureArr));
    }

    public ObjectReader without(DeserializationFeature deserializationFeature) {
        return _with(this._config.without(deserializationFeature));
    }

    public ObjectReader without(DeserializationFeature deserializationFeature, DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.without(deserializationFeature, deserializationFeatureArr));
    }

    public ObjectReader withoutFeatures(DeserializationFeature... deserializationFeatureArr) {
        return _with(this._config.withoutFeatures(deserializationFeatureArr));
    }

    public ObjectReader with(VT vt) {
        return _with(this._config.with(vt));
    }

    public ObjectReader withFeatures(VT... vtArr) {
        return _with(this._config.withFeatures(vtArr));
    }

    public ObjectReader without(VT vt) {
        return _with(this._config.without(vt));
    }

    public ObjectReader withoutFeatures(VT... vtArr) {
        return _with(this._config.withoutFeatures(vtArr));
    }

    public ObjectReader with(JsonParser.Feature feature) {
        return _with(this._config.with(feature));
    }

    public ObjectReader withFeatures(JsonParser.Feature... featureArr) {
        return _with(this._config.withFeatures(featureArr));
    }

    public ObjectReader without(JsonParser.Feature feature) {
        return _with(this._config.without(feature));
    }

    public ObjectReader withoutFeatures(JsonParser.Feature... featureArr) {
        return _with(this._config.withoutFeatures(featureArr));
    }

    public ObjectReader with(StreamReadFeature streamReadFeature) {
        return _with(this._config.with(streamReadFeature.mappedFeature()));
    }

    public ObjectReader without(StreamReadFeature streamReadFeature) {
        return _with(this._config.without(streamReadFeature.mappedFeature()));
    }

    public ObjectReader with(InterfaceC5498Ub interfaceC5498Ub) {
        return _with(this._config.with(interfaceC5498Ub));
    }

    public ObjectReader withFeatures(InterfaceC5498Ub... interfaceC5498UbArr) {
        return _with(this._config.withFeatures(interfaceC5498UbArr));
    }

    public ObjectReader without(InterfaceC5498Ub interfaceC5498Ub) {
        return _with(this._config.without(interfaceC5498Ub));
    }

    public ObjectReader withoutFeatures(InterfaceC5498Ub... interfaceC5498UbArr) {
        return _with(this._config.withoutFeatures(interfaceC5498UbArr));
    }

    public ObjectReader at(String str) {
        _assertNotNull("pointerExpr", str);
        return new ObjectReader(this, new C5511Uo(str));
    }

    public ObjectReader at(JsonPointer jsonPointer) {
        _assertNotNull("pointer", jsonPointer);
        return new ObjectReader(this, new C5511Uo(jsonPointer));
    }

    public ObjectReader with(DeserializationConfig deserializationConfig) {
        return _with(deserializationConfig);
    }

    public ObjectReader with(InjectableValues injectableValues) {
        return this._injectableValues == injectableValues ? this : _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, this._schema, injectableValues, this._dataFormatReaders);
    }

    public ObjectReader with(JsonNodeFactory jsonNodeFactory) {
        return _with(this._config.with(jsonNodeFactory));
    }

    public ObjectReader with(JsonFactory jsonFactory) {
        if (jsonFactory == this._parserFactory) {
            return this;
        }
        ObjectReader objectReader_new = _new(this, jsonFactory);
        if (jsonFactory.getCodec() == null) {
            jsonFactory.setCodec(objectReader_new);
        }
        return objectReader_new;
    }

    public ObjectReader withRootName(String str) {
        return _with(this._config.withRootName(str));
    }

    public ObjectReader withRootName(PropertyName propertyName) {
        return _with(this._config.withRootName(propertyName));
    }

    public ObjectReader withoutRootName() {
        return _with(this._config.withRootName(PropertyName.NO_NAME));
    }

    public ObjectReader with(InterfaceC5497Ua interfaceC5497Ua) {
        if (this._schema == interfaceC5497Ua) {
            return this;
        }
        _verifySchemaType(interfaceC5497Ua);
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, interfaceC5497Ua, this._injectableValues, this._dataFormatReaders);
    }

    public ObjectReader forType(JavaType javaType) {
        if (javaType != null && javaType.equals(this._valueType)) {
            return this;
        }
        AbstractC5548Vy<Object> abstractC5548Vy_prefetchRootDeserializer = _prefetchRootDeserializer(javaType);
        C5551Wb c5551WbOLrzqt = this._dataFormatReaders;
        if (c5551WbOLrzqt != null) {
            c5551WbOLrzqt = c5551WbOLrzqt.OLrzqt(javaType);
        }
        return _new(this, this._config, javaType, abstractC5548Vy_prefetchRootDeserializer, this._valueToUpdate, this._schema, this._injectableValues, c5551WbOLrzqt);
    }

    public ObjectReader forType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public ObjectReader forType(AbstractC5533Vj<?> abstractC5533Vj) {
        return forType(this._config.getTypeFactory().constructType(abstractC5533Vj.AEQbTJ()));
    }

    @Deprecated
    public ObjectReader withType(JavaType javaType) {
        return forType(javaType);
    }

    @Deprecated
    public ObjectReader withType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    @Deprecated
    public ObjectReader withType(Type type) {
        return forType(this._config.getTypeFactory().constructType(type));
    }

    @Deprecated
    public ObjectReader withType(AbstractC5533Vj<?> abstractC5533Vj) {
        return forType(this._config.getTypeFactory().constructType(abstractC5533Vj.AEQbTJ()));
    }

    public ObjectReader withValueToUpdate(Object obj) {
        if (obj == this._valueToUpdate) {
            return this;
        }
        if (obj == null) {
            return _new(this, this._config, this._valueType, this._rootDeserializer, null, this._schema, this._injectableValues, this._dataFormatReaders);
        }
        JavaType javaTypeConstructType = this._valueType;
        if (javaTypeConstructType == null) {
            javaTypeConstructType = this._config.constructType(obj.getClass());
        }
        return _new(this, this._config, javaTypeConstructType, this._rootDeserializer, obj, this._schema, this._injectableValues, this._dataFormatReaders);
    }

    public ObjectReader withView(Class<?> cls) {
        return _with(this._config.withView(cls));
    }

    public ObjectReader with(Locale locale) {
        return _with(this._config.with(locale));
    }

    public ObjectReader with(TimeZone timeZone) {
        return _with(this._config.with(timeZone));
    }

    public ObjectReader withHandler(AbstractC5552Wc abstractC5552Wc) {
        return _with(this._config.withHandler(abstractC5552Wc));
    }

    public ObjectReader with(Base64Variant base64Variant) {
        return _with(this._config.with(base64Variant));
    }

    public ObjectReader withFormatDetection(ObjectReader... objectReaderArr) {
        return withFormatDetection(new C5551Wb(objectReaderArr));
    }

    public ObjectReader withFormatDetection(C5551Wb c5551Wb) {
        return _new(this, this._config, this._valueType, this._rootDeserializer, this._valueToUpdate, this._schema, this._injectableValues, c5551Wb);
    }

    public ObjectReader with(ContextAttributes contextAttributes) {
        return _with(this._config.with(contextAttributes));
    }

    public ObjectReader withAttributes(Map<?, ?> map) {
        return _with(this._config.withAttributes(map));
    }

    public ObjectReader withAttribute(Object obj, Object obj2) {
        return _with(this._config.withAttribute(obj, obj2));
    }

    public ObjectReader withoutAttribute(Object obj) {
        return _with(this._config.withoutAttribute(obj));
    }

    public ObjectReader _with(DeserializationConfig deserializationConfig) {
        if (deserializationConfig == this._config) {
            return this;
        }
        ObjectReader objectReader_new = _new(this, deserializationConfig);
        C5551Wb c5551Wb = this._dataFormatReaders;
        return c5551Wb != null ? objectReader_new.withFormatDetection(c5551Wb.KWHzl(deserializationConfig)) : objectReader_new;
    }

    public boolean isEnabled(DeserializationFeature deserializationFeature) {
        return this._config.isEnabled(deserializationFeature);
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public boolean isEnabled(VT vt) {
        return this._config.isEnabled(vt);
    }

    public boolean isEnabled(JsonParser.Feature feature) {
        return this._config.isEnabled(feature, this._parserFactory);
    }

    public boolean isEnabled(StreamReadFeature streamReadFeature) {
        return this._config.isEnabled(streamReadFeature.mappedFeature(), this._parserFactory);
    }

    public TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public ContextAttributes getAttributes() {
        return this._config.getAttributes();
    }

    public JsonParser createParser(File file) throws IOException {
        _assertNotNull("src", file);
        return this._config.initialize(this._parserFactory.createParser(file), this._schema);
    }

    public JsonParser createParser(URL url) throws IOException {
        _assertNotNull("src", url);
        return this._config.initialize(this._parserFactory.createParser(url), this._schema);
    }

    public JsonParser createParser(InputStream inputStream) throws IOException {
        _assertNotNull("in", inputStream);
        return this._config.initialize(this._parserFactory.createParser(inputStream), this._schema);
    }

    public JsonParser createParser(Reader reader) throws IOException {
        _assertNotNull("r", reader);
        return this._config.initialize(this._parserFactory.createParser(reader), this._schema);
    }

    public JsonParser createParser(byte[] bArr) throws IOException {
        _assertNotNull("content", bArr);
        return this._config.initialize(this._parserFactory.createParser(bArr), this._schema);
    }

    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException {
        _assertNotNull("content", bArr);
        return this._config.initialize(this._parserFactory.createParser(bArr, i, i2), this._schema);
    }

    public JsonParser createParser(String str) throws IOException {
        _assertNotNull("content", str);
        return this._config.initialize(this._parserFactory.createParser(str), this._schema);
    }

    public JsonParser createParser(char[] cArr) throws IOException {
        _assertNotNull("content", cArr);
        return this._config.initialize(this._parserFactory.createParser(cArr), this._schema);
    }

    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        _assertNotNull("content", cArr);
        return this._config.initialize(this._parserFactory.createParser(cArr, i, i2), this._schema);
    }

    public JsonParser createParser(DataInput dataInput) throws IOException {
        _assertNotNull("content", dataInput);
        return this._config.initialize(this._parserFactory.createParser(dataInput), this._schema);
    }

    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        return this._config.initialize(this._parserFactory.createNonBlockingByteArrayParser(), this._schema);
    }

    public <T> T readValue(JsonParser jsonParser) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        return (T) _bind(jsonParser, this._valueToUpdate);
    }

    @Override // o.AbstractC5505Ui
    public <T> T readValue(JsonParser jsonParser, Class<T> cls) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        return (T) forType((Class<?>) cls).readValue(jsonParser);
    }

    @Override // o.AbstractC5505Ui
    public <T> T readValue(JsonParser jsonParser, AbstractC5533Vj<T> abstractC5533Vj) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        return (T) forType((AbstractC5533Vj<?>) abstractC5533Vj).readValue(jsonParser);
    }

    @Override // o.AbstractC5505Ui
    public <T> T readValue(JsonParser jsonParser, AbstractC5531Vh abstractC5531Vh) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        return (T) forType((JavaType) abstractC5531Vh).readValue(jsonParser);
    }

    public <T> T readValue(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        return (T) forType(javaType).readValue(jsonParser);
    }

    @Override // o.AbstractC5505Ui
    public <T> Iterator<T> readValues(JsonParser jsonParser, Class<T> cls) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        return forType((Class<?>) cls).readValues(jsonParser);
    }

    @Override // o.AbstractC5505Ui
    public <T> Iterator<T> readValues(JsonParser jsonParser, AbstractC5533Vj<T> abstractC5533Vj) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        return forType((AbstractC5533Vj<?>) abstractC5533Vj).readValues(jsonParser);
    }

    @Override // o.AbstractC5505Ui
    public <T> Iterator<T> readValues(JsonParser jsonParser, AbstractC5531Vh abstractC5531Vh) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        return readValues(jsonParser, (JavaType) abstractC5531Vh);
    }

    public <T> Iterator<T> readValues(JsonParser jsonParser, JavaType javaType) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        return forType(javaType).readValues(jsonParser);
    }

    /* JADX DEBUG: Method merged with bridge method: createArrayNode()Lo/Um; */
    @Override // o.AbstractC5505Ui, o.AbstractC5506Uj
    public JsonNode createArrayNode() {
        return this._config.getNodeFactory().arrayNode();
    }

    /* JADX DEBUG: Method merged with bridge method: createObjectNode()Lo/Um; */
    @Override // o.AbstractC5505Ui, o.AbstractC5506Uj
    public JsonNode createObjectNode() {
        return this._config.getNodeFactory().objectNode();
    }

    /* JADX DEBUG: Method merged with bridge method: missingNode()Lo/Um; */
    @Override // o.AbstractC5506Uj
    public JsonNode missingNode() {
        return this._config.getNodeFactory().missingNode();
    }

    /* JADX DEBUG: Method merged with bridge method: nullNode()Lo/Um; */
    @Override // o.AbstractC5506Uj
    public JsonNode nullNode() {
        return this._config.getNodeFactory().m6141nullNode();
    }

    @Override // o.AbstractC5505Ui, o.AbstractC5506Uj
    public JsonParser treeAsTokens(InterfaceC5509Um interfaceC5509Um) {
        _assertNotNull("n", interfaceC5509Um);
        return new XQ((JsonNode) interfaceC5509Um, withValueToUpdate(null));
    }

    @Override // o.AbstractC5505Ui, o.AbstractC5506Uj
    public <T extends InterfaceC5509Um> T readTree(JsonParser jsonParser) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        return _bindAsTreeOrNull(jsonParser);
    }

    @Override // o.AbstractC5505Ui, o.AbstractC5506Uj
    public void writeTree(JsonGenerator jsonGenerator, InterfaceC5509Um interfaceC5509Um) {
        throw new UnsupportedOperationException();
    }

    public <T> T readValue(InputStream inputStream) throws IOException {
        C5551Wb c5551Wb = this._dataFormatReaders;
        if (c5551Wb != null) {
            return (T) _detectBindAndClose(c5551Wb.copydefault(inputStream), false);
        }
        return (T) _bindAndClose(_considerFilter(createParser(inputStream), false));
    }

    public <T> T readValue(InputStream inputStream, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(inputStream);
    }

    public <T> T readValue(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return (T) _bindAndClose(_considerFilter(createParser(reader), false));
    }

    public <T> T readValue(Reader reader, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(reader);
    }

    public <T> T readValue(String str) throws JsonProcessingException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        try {
            return (T) _bindAndClose(_considerFilter(createParser(str), false));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public <T> T readValue(String str, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(str);
    }

    public <T> T readValue(byte[] bArr) throws IOException {
        if (this._dataFormatReaders != null) {
            return (T) _detectBindAndClose(bArr, 0, bArr.length);
        }
        return (T) _bindAndClose(_considerFilter(createParser(bArr), false));
    }

    public <T> T readValue(byte[] bArr, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(bArr);
    }

    public <T> T readValue(byte[] bArr, int i, int i2) throws IOException {
        if (this._dataFormatReaders != null) {
            return (T) _detectBindAndClose(bArr, i, i2);
        }
        return (T) _bindAndClose(_considerFilter(createParser(bArr, i, i2), false));
    }

    public <T> T readValue(byte[] bArr, int i, int i2, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(bArr, i, i2);
    }

    public <T> T readValue(File file) throws IOException {
        C5551Wb c5551Wb = this._dataFormatReaders;
        if (c5551Wb != null) {
            return (T) _detectBindAndClose(c5551Wb.copydefault(_inputStream(file)), true);
        }
        return (T) _bindAndClose(_considerFilter(createParser(file), false));
    }

    public <T> T readValue(File file, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(file);
    }

    public <T> T readValue(URL url) throws IOException {
        C5551Wb c5551Wb = this._dataFormatReaders;
        if (c5551Wb != null) {
            return (T) _detectBindAndClose(c5551Wb.copydefault(_inputStream(url)), true);
        }
        return (T) _bindAndClose(_considerFilter(createParser(url), false));
    }

    public <T> T readValue(URL url, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(url);
    }

    public <T> T readValue(JsonNode jsonNode) throws IOException {
        _assertNotNull("content", jsonNode);
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(jsonNode);
        }
        return (T) _bindAndClose(_considerFilter(treeAsTokens(jsonNode), false));
    }

    public <T> T readValue(JsonNode jsonNode, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(jsonNode);
    }

    public <T> T readValue(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return (T) _bindAndClose(_considerFilter(createParser(dataInput), false));
    }

    public <T> T readValue(DataInput dataInput, Class<T> cls) throws IOException {
        return (T) forType((Class<?>) cls).readValue(dataInput);
    }

    public JsonNode readTree(InputStream inputStream) throws IOException {
        if (this._dataFormatReaders != null) {
            return _detectBindAndCloseAsTree(inputStream);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(inputStream), false));
    }

    public JsonNode readTree(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(reader), false));
    }

    public JsonNode readTree(String str) throws JsonProcessingException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        try {
            return _bindAndCloseAsTree(_considerFilter(createParser(str), false));
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public JsonNode readTree(byte[] bArr) throws IOException {
        _assertNotNull(MTPushConstants.Analysis.KEY_JSON, bArr);
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(bArr);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(bArr), false));
    }

    public JsonNode readTree(byte[] bArr, int i, int i2) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(bArr);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(bArr, i, i2), false));
    }

    public JsonNode readTree(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndCloseAsTree(_considerFilter(createParser(dataInput), false));
    }

    public <T> VB<T> readValues(JsonParser jsonParser) throws IOException {
        _assertNotNull(TtmlNode.TAG_P, jsonParser);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        return _newIterator(jsonParser, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), false);
    }

    public <T> VB<T> readValues(InputStream inputStream) throws IOException {
        C5551Wb c5551Wb = this._dataFormatReaders;
        if (c5551Wb != null) {
            return _detectBindAndReadValues(c5551Wb.copydefault(inputStream), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(inputStream), true));
    }

    public <T> VB<T> readValues(Reader reader) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(reader);
        }
        JsonParser jsonParser_considerFilter = _considerFilter(createParser(reader), true);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser_considerFilter);
        _initForMultiRead(defaultDeserializationContextCreateDeserializationContext, jsonParser_considerFilter);
        jsonParser_considerFilter.RcXXUw();
        return _newIterator(jsonParser_considerFilter, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), true);
    }

    public <T> VB<T> readValues(String str) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(str);
        }
        JsonParser jsonParser_considerFilter = _considerFilter(createParser(str), true);
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser_considerFilter);
        _initForMultiRead(defaultDeserializationContextCreateDeserializationContext, jsonParser_considerFilter);
        jsonParser_considerFilter.RcXXUw();
        return _newIterator(jsonParser_considerFilter, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), true);
    }

    public <T> VB<T> readValues(byte[] bArr, int i, int i2) throws IOException {
        C5551Wb c5551Wb = this._dataFormatReaders;
        if (c5551Wb != null) {
            return _detectBindAndReadValues(c5551Wb.copydefault(bArr, i, i2), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(bArr, i, i2), true));
    }

    public final <T> VB<T> readValues(byte[] bArr) throws IOException {
        _assertNotNull("src", bArr);
        return readValues(bArr, 0, bArr.length);
    }

    public <T> VB<T> readValues(File file) throws IOException {
        C5551Wb c5551Wb = this._dataFormatReaders;
        if (c5551Wb != null) {
            return _detectBindAndReadValues(c5551Wb.copydefault(_inputStream(file)), false);
        }
        return _bindAndReadValues(_considerFilter(createParser(file), true));
    }

    public <T> VB<T> readValues(URL url) throws IOException {
        C5551Wb c5551Wb = this._dataFormatReaders;
        if (c5551Wb != null) {
            return _detectBindAndReadValues(c5551Wb.copydefault(_inputStream(url)), true);
        }
        return _bindAndReadValues(_considerFilter(createParser(url), true));
    }

    public <T> VB<T> readValues(DataInput dataInput) throws IOException {
        if (this._dataFormatReaders != null) {
            _reportUndetectableSource(dataInput);
        }
        return _bindAndReadValues(_considerFilter(createParser(dataInput), true));
    }

    @Override // o.AbstractC5505Ui
    public <T> T treeToValue(InterfaceC5509Um interfaceC5509Um, Class<T> cls) throws JsonProcessingException {
        _assertNotNull("n", interfaceC5509Um);
        try {
            return (T) readValue(treeAsTokens(interfaceC5509Um), cls);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public <T> T treeToValue(InterfaceC5509Um interfaceC5509Um, JavaType javaType) throws JsonProcessingException {
        _assertNotNull("n", interfaceC5509Um);
        try {
            return (T) readValue(treeAsTokens(interfaceC5509Um), javaType);
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    @Override // o.AbstractC5505Ui
    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        throw new UnsupportedOperationException("Not implemented for ObjectReader");
    }

    public Object _bind(JsonParser jsonParser, Object obj) throws IOException {
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        JsonToken jsonToken_initForReading = _initForReading(defaultDeserializationContextCreateDeserializationContext, jsonParser);
        if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
            if (obj == null) {
                obj = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext).getNullValue(defaultDeserializationContextCreateDeserializationContext);
            }
        } else if (jsonToken_initForReading != JsonToken.END_ARRAY && jsonToken_initForReading != JsonToken.END_OBJECT) {
            obj = defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, this._valueType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), this._valueToUpdate);
        }
        jsonParser.OLrzqt();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType);
        }
        return obj;
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public Object _bindAndClose(JsonParser jsonParser) throws IOException {
        Object rootValue;
        try {
            DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
            JsonToken jsonToken_initForReading = _initForReading(defaultDeserializationContextCreateDeserializationContext, jsonParser);
            if (jsonToken_initForReading == JsonToken.VALUE_NULL) {
                rootValue = this._valueToUpdate;
                if (rootValue == null) {
                    rootValue = _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext).getNullValue(defaultDeserializationContextCreateDeserializationContext);
                }
            } else {
                rootValue = (jsonToken_initForReading == JsonToken.END_ARRAY || jsonToken_initForReading == JsonToken.END_OBJECT) ? this._valueToUpdate : defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, this._valueType, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), this._valueToUpdate);
            }
            if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
                _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, this._valueType);
            }
            if (jsonParser != null) {
                jsonParser.close();
            }
            return rootValue;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final JsonNode _bindAndCloseAsTree(JsonParser jsonParser) throws IOException {
        try {
            JsonNode jsonNode_bindAsTree = _bindAsTree(jsonParser);
            if (jsonParser != null) {
                jsonParser.close();
            }
            return jsonNode_bindAsTree;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (jsonParser != null) {
                    try {
                        jsonParser.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public final JsonNode _bindAsTree(JsonParser jsonParser) throws IOException {
        JsonNode jsonNodeNullNode;
        Object obj = this._valueToUpdate;
        if (obj != null) {
            return (JsonNode) _bind(jsonParser, obj);
        }
        this._config.initialize(jsonParser);
        InterfaceC5497Ua interfaceC5497Ua = this._schema;
        if (interfaceC5497Ua != null) {
            jsonParser.EZpvd(interfaceC5497Ua);
        }
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        if (jsonTokenDjBIcL == null && (jsonTokenDjBIcL = jsonParser.RcXXUw()) == null) {
            return this._config.getNodeFactory().missingNode();
        }
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        if (jsonTokenDjBIcL == JsonToken.VALUE_NULL) {
            jsonNodeNullNode = this._config.getNodeFactory().m6141nullNode();
        } else {
            jsonNodeNullNode = (JsonNode) defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, _jsonNodeType(), _findTreeDeserializer(defaultDeserializationContextCreateDeserializationContext), null);
        }
        jsonParser.OLrzqt();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, _jsonNodeType());
        }
        return jsonNodeNullNode;
    }

    public final JsonNode _bindAsTreeOrNull(JsonParser jsonParser) throws IOException {
        JsonNode jsonNodeNullNode;
        Object obj = this._valueToUpdate;
        if (obj != null) {
            return (JsonNode) _bind(jsonParser, obj);
        }
        this._config.initialize(jsonParser);
        InterfaceC5497Ua interfaceC5497Ua = this._schema;
        if (interfaceC5497Ua != null) {
            jsonParser.EZpvd(interfaceC5497Ua);
        }
        JsonToken jsonTokenDjBIcL = jsonParser.djBIcL();
        if (jsonTokenDjBIcL == null && (jsonTokenDjBIcL = jsonParser.RcXXUw()) == null) {
            return null;
        }
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        if (jsonTokenDjBIcL == JsonToken.VALUE_NULL) {
            jsonNodeNullNode = this._config.getNodeFactory().m6141nullNode();
        } else {
            jsonNodeNullNode = (JsonNode) defaultDeserializationContextCreateDeserializationContext.readRootValue(jsonParser, _jsonNodeType(), _findTreeDeserializer(defaultDeserializationContextCreateDeserializationContext), null);
        }
        jsonParser.OLrzqt();
        if (this._config.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS)) {
            _verifyNoTrailingTokens(jsonParser, defaultDeserializationContextCreateDeserializationContext, _jsonNodeType());
        }
        return jsonNodeNullNode;
    }

    public <T> VB<T> _bindAndReadValues(JsonParser jsonParser) throws IOException {
        DefaultDeserializationContext defaultDeserializationContextCreateDeserializationContext = createDeserializationContext(jsonParser);
        _initForMultiRead(defaultDeserializationContextCreateDeserializationContext, jsonParser);
        jsonParser.RcXXUw();
        return _newIterator(jsonParser, defaultDeserializationContextCreateDeserializationContext, _findRootDeserializer(defaultDeserializationContextCreateDeserializationContext), true);
    }

    public JsonParser _considerFilter(JsonParser jsonParser, boolean z) {
        return (this._filter == null || C5516Us.class.isInstance(jsonParser)) ? jsonParser : new C5516Us(jsonParser, this._filter, TokenFilter.Inclusion.ONLY_INCLUDE_ALL, z);
    }

    public final void _verifyNoTrailingTokens(JsonParser jsonParser, DeserializationContext deserializationContext, JavaType javaType) throws IOException {
        Object obj;
        JsonToken jsonTokenRcXXUw = jsonParser.RcXXUw();
        if (jsonTokenRcXXUw != null) {
            Class<?> clsEZpvd = C5619Yr.EZpvd(javaType);
            if (clsEZpvd == null && (obj = this._valueToUpdate) != null) {
                clsEZpvd = obj.getClass();
            }
            deserializationContext.reportTrailingTokens(clsEZpvd, jsonParser, jsonTokenRcXXUw);
        }
    }

    public Object _detectBindAndClose(byte[] bArr, int i, int i2) throws IOException {
        C5551Wb.ActionBar actionBarCopydefault = this._dataFormatReaders.copydefault(bArr, i, i2);
        if (!actionBarCopydefault.OLrzqt()) {
            _reportUnkownFormat(this._dataFormatReaders, actionBarCopydefault);
        }
        return actionBarCopydefault.KWHzl()._bindAndClose(actionBarCopydefault.copydefault());
    }

    public Object _detectBindAndClose(C5551Wb.ActionBar actionBar, boolean z) throws IOException {
        if (!actionBar.OLrzqt()) {
            _reportUnkownFormat(this._dataFormatReaders, actionBar);
        }
        JsonParser jsonParserCopydefault = actionBar.copydefault();
        if (z) {
            jsonParserCopydefault.EZpvd(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        }
        return actionBar.KWHzl()._bindAndClose(jsonParserCopydefault);
    }

    public <T> VB<T> _detectBindAndReadValues(C5551Wb.ActionBar actionBar, boolean z) throws IOException {
        if (!actionBar.OLrzqt()) {
            _reportUnkownFormat(this._dataFormatReaders, actionBar);
        }
        JsonParser jsonParserCopydefault = actionBar.copydefault();
        if (z) {
            jsonParserCopydefault.EZpvd(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        }
        return actionBar.KWHzl()._bindAndReadValues(jsonParserCopydefault);
    }

    public JsonNode _detectBindAndCloseAsTree(InputStream inputStream) throws IOException {
        C5551Wb.ActionBar actionBarCopydefault = this._dataFormatReaders.copydefault(inputStream);
        if (!actionBarCopydefault.OLrzqt()) {
            _reportUnkownFormat(this._dataFormatReaders, actionBarCopydefault);
        }
        JsonParser jsonParserCopydefault = actionBarCopydefault.copydefault();
        jsonParserCopydefault.EZpvd(JsonParser.Feature.AUTO_CLOSE_SOURCE);
        return actionBarCopydefault.KWHzl()._bindAndCloseAsTree(jsonParserCopydefault);
    }

    public void _reportUnkownFormat(C5551Wb c5551Wb, C5551Wb.ActionBar actionBar) throws IOException {
        throw new JsonParseException((JsonParser) null, "Cannot detect format from input, does not look like any of detectable formats " + c5551Wb.toString());
    }

    public void _verifySchemaType(InterfaceC5497Ua interfaceC5497Ua) {
        if (interfaceC5497Ua == null || this._parserFactory.canUseSchema(interfaceC5497Ua)) {
            return;
        }
        throw new IllegalArgumentException("Cannot use FormatSchema of type " + interfaceC5497Ua.getClass().getName() + " for format " + this._parserFactory.getFormatName());
    }

    public DefaultDeserializationContext createDeserializationContext(JsonParser jsonParser) {
        return this._context.createInstance(this._config, jsonParser, this._injectableValues);
    }

    public DefaultDeserializationContext createDummyDeserializationContext() {
        return this._context.createDummyInstance(this._config);
    }

    public InputStream _inputStream(URL url) throws IOException {
        return url.openStream();
    }

    public InputStream _inputStream(File file) throws IOException {
        return new FileInputStream(file);
    }

    public void _reportUndetectableSource(Object obj) throws StreamReadException {
        throw new JsonParseException((JsonParser) null, "Cannot use source of type " + obj.getClass().getName() + " with format auto-detection: must be byte- not char-based");
    }

    public AbstractC5548Vy<Object> _findRootDeserializer(DeserializationContext deserializationContext) throws DatabindException {
        AbstractC5548Vy<Object> abstractC5548Vy = this._rootDeserializer;
        if (abstractC5548Vy != null) {
            return abstractC5548Vy;
        }
        JavaType javaType = this._valueType;
        if (javaType == null) {
            deserializationContext.reportBadDefinition((JavaType) null, "No value type configured for ObjectReader");
        }
        AbstractC5548Vy<Object> abstractC5548Vy2 = this._rootDeserializers.get(javaType);
        if (abstractC5548Vy2 != null) {
            return abstractC5548Vy2;
        }
        AbstractC5548Vy<Object> abstractC5548VyFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType);
        if (abstractC5548VyFindRootValueDeserializer == null) {
            deserializationContext.reportBadDefinition(javaType, "Cannot find a deserializer for type " + javaType);
        }
        this._rootDeserializers.put(javaType, abstractC5548VyFindRootValueDeserializer);
        return abstractC5548VyFindRootValueDeserializer;
    }

    public AbstractC5548Vy<Object> _findTreeDeserializer(DeserializationContext deserializationContext) throws DatabindException {
        JavaType javaType_jsonNodeType = _jsonNodeType();
        AbstractC5548Vy<Object> abstractC5548VyFindRootValueDeserializer = this._rootDeserializers.get(javaType_jsonNodeType);
        if (abstractC5548VyFindRootValueDeserializer == null) {
            abstractC5548VyFindRootValueDeserializer = deserializationContext.findRootValueDeserializer(javaType_jsonNodeType);
            if (abstractC5548VyFindRootValueDeserializer == null) {
                deserializationContext.reportBadDefinition(javaType_jsonNodeType, "Cannot find a deserializer for type " + javaType_jsonNodeType);
            }
            this._rootDeserializers.put(javaType_jsonNodeType, abstractC5548VyFindRootValueDeserializer);
        }
        return abstractC5548VyFindRootValueDeserializer;
    }

    public AbstractC5548Vy<Object> _prefetchRootDeserializer(JavaType javaType) {
        if (javaType == null || !this._config.isEnabled(DeserializationFeature.EAGER_DESERIALIZER_FETCH)) {
            return null;
        }
        AbstractC5548Vy<Object> abstractC5548VyFindRootValueDeserializer = this._rootDeserializers.get(javaType);
        if (abstractC5548VyFindRootValueDeserializer == null) {
            try {
                abstractC5548VyFindRootValueDeserializer = createDummyDeserializationContext().findRootValueDeserializer(javaType);
                if (abstractC5548VyFindRootValueDeserializer != null) {
                    this._rootDeserializers.put(javaType, abstractC5548VyFindRootValueDeserializer);
                }
            } catch (JacksonException unused) {
            }
        }
        return abstractC5548VyFindRootValueDeserializer;
    }

    public final JavaType _jsonNodeType() {
        JavaType javaType = this._jsonNodeType;
        if (javaType != null) {
            return javaType;
        }
        JavaType javaTypeConstructType = getTypeFactory().constructType(JsonNode.class);
        this._jsonNodeType = javaTypeConstructType;
        return javaTypeConstructType;
    }

    public final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }
}
