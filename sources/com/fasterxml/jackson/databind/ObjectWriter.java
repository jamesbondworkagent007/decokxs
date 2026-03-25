package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.StreamWriteFeature;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.Writer;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import o.AbstractC5533Vj;
import o.AbstractC5601Xz;
import o.C5537Vn;
import o.C5608Yg;
import o.C5619Yr;
import o.InterfaceC5497Ua;
import o.InterfaceC5498Ub;
import o.InterfaceC5501Ue;
import o.InterfaceC5504Uh;
import o.InterfaceC5539Vp;
import o.InterfaceC5584Xi;
import o.UC;
import o.VD;
import o.VH;
import o.VT;
import o.VV;
import o.XS;
import o.XY;

/* JADX INFO: loaded from: classes21.dex */
public class ObjectWriter implements Serializable {
    protected static final InterfaceC5504Uh NULL_PRETTY_PRINTER = new MinimalPrettyPrinter();
    private static final long serialVersionUID = 1;
    protected final SerializationConfig _config;
    protected final JsonFactory _generatorFactory;
    protected final GeneratorSettings _generatorSettings;
    protected final Prefetch _prefetch;
    protected final XY _serializerFactory;
    protected final DefaultSerializerProvider _serializerProvider;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SerializationConfig getConfig() {
        return this._config;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonFactory getFactory() {
        return this._generatorFactory;
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, JavaType javaType, InterfaceC5504Uh interfaceC5504Uh) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = interfaceC5504Uh == null ? GeneratorSettings.empty : new GeneratorSettings(interfaceC5504Uh, null, null, null);
        if (javaType == null) {
            this._prefetch = Prefetch.empty;
        } else if (javaType.hasRawClass(Object.class)) {
            this._prefetch = Prefetch.empty.forRootType(this, javaType);
        } else {
            this._prefetch = Prefetch.empty.forRootType(this, javaType.withStaticTyping());
        }
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = GeneratorSettings.empty;
        this._prefetch = Prefetch.empty;
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig, InterfaceC5497Ua interfaceC5497Ua) {
        this._config = serializationConfig;
        this._serializerProvider = objectMapper._serializerProvider;
        this._serializerFactory = objectMapper._serializerFactory;
        this._generatorFactory = objectMapper._jsonFactory;
        this._generatorSettings = interfaceC5497Ua == null ? GeneratorSettings.empty : new GeneratorSettings(null, interfaceC5497Ua, null, null);
        this._prefetch = Prefetch.empty;
    }

    public ObjectWriter(ObjectWriter objectWriter, SerializationConfig serializationConfig, GeneratorSettings generatorSettings, Prefetch prefetch) {
        this._config = serializationConfig;
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._generatorFactory = objectWriter._generatorFactory;
        this._generatorSettings = generatorSettings;
        this._prefetch = prefetch;
    }

    public ObjectWriter(ObjectWriter objectWriter, SerializationConfig serializationConfig) {
        this._config = serializationConfig;
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._generatorFactory = objectWriter._generatorFactory;
        this._generatorSettings = objectWriter._generatorSettings;
        this._prefetch = objectWriter._prefetch;
    }

    public ObjectWriter(ObjectWriter objectWriter, JsonFactory jsonFactory) {
        this._config = objectWriter._config.with(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, jsonFactory.requiresPropertyOrdering());
        this._serializerProvider = objectWriter._serializerProvider;
        this._serializerFactory = objectWriter._serializerFactory;
        this._generatorFactory = jsonFactory;
        this._generatorSettings = objectWriter._generatorSettings;
        this._prefetch = objectWriter._prefetch;
    }

    public Version version() {
        return VV.KWHzl;
    }

    public ObjectWriter _new(ObjectWriter objectWriter, JsonFactory jsonFactory) {
        return new ObjectWriter(objectWriter, jsonFactory);
    }

    public ObjectWriter _new(ObjectWriter objectWriter, SerializationConfig serializationConfig) {
        return serializationConfig == this._config ? this : new ObjectWriter(objectWriter, serializationConfig);
    }

    public ObjectWriter _new(GeneratorSettings generatorSettings, Prefetch prefetch) {
        return (this._generatorSettings == generatorSettings && this._prefetch == prefetch) ? this : new ObjectWriter(this, this._config, generatorSettings, prefetch);
    }

    public VH _newSequenceWriter(boolean z, JsonGenerator jsonGenerator, boolean z2) throws IOException {
        return new VH(_serializerProvider(), _configureGenerator(jsonGenerator), z2, this._prefetch).EZpvd(z);
    }

    public ObjectWriter with(SerializationFeature serializationFeature) {
        return _new(this, this._config.with(serializationFeature));
    }

    public ObjectWriter with(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.with(serializationFeature, serializationFeatureArr));
    }

    public ObjectWriter withFeatures(SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.withFeatures(serializationFeatureArr));
    }

    public ObjectWriter without(SerializationFeature serializationFeature) {
        return _new(this, this._config.without(serializationFeature));
    }

    public ObjectWriter without(SerializationFeature serializationFeature, SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.without(serializationFeature, serializationFeatureArr));
    }

    public ObjectWriter withoutFeatures(SerializationFeature... serializationFeatureArr) {
        return _new(this, this._config.withoutFeatures(serializationFeatureArr));
    }

    public ObjectWriter with(VT vt) {
        return _new(this, this._config.with(vt));
    }

    public ObjectWriter withFeatures(VT... vtArr) {
        return _new(this, this._config.withFeatures(vtArr));
    }

    public ObjectWriter without(VT vt) {
        return _new(this, this._config.without(vt));
    }

    public ObjectWriter withoutFeatures(VT... vtArr) {
        return _new(this, this._config.withoutFeatures(vtArr));
    }

    public ObjectWriter with(JsonGenerator.Feature feature) {
        return _new(this, this._config.with(feature));
    }

    public ObjectWriter withFeatures(JsonGenerator.Feature... featureArr) {
        return _new(this, this._config.withFeatures(featureArr));
    }

    public ObjectWriter without(JsonGenerator.Feature feature) {
        return _new(this, this._config.without(feature));
    }

    public ObjectWriter withoutFeatures(JsonGenerator.Feature... featureArr) {
        return _new(this, this._config.withoutFeatures(featureArr));
    }

    public ObjectWriter with(StreamWriteFeature streamWriteFeature) {
        return _new(this, this._config.with(streamWriteFeature.mappedFeature()));
    }

    public ObjectWriter without(StreamWriteFeature streamWriteFeature) {
        return _new(this, this._config.without(streamWriteFeature.mappedFeature()));
    }

    public ObjectWriter with(InterfaceC5498Ub interfaceC5498Ub) {
        return _new(this, this._config.with(interfaceC5498Ub));
    }

    public ObjectWriter withFeatures(InterfaceC5498Ub... interfaceC5498UbArr) {
        return _new(this, this._config.withFeatures(interfaceC5498UbArr));
    }

    public ObjectWriter without(InterfaceC5498Ub interfaceC5498Ub) {
        return _new(this, this._config.without(interfaceC5498Ub));
    }

    public ObjectWriter withoutFeatures(InterfaceC5498Ub... interfaceC5498UbArr) {
        return _new(this, this._config.withoutFeatures(interfaceC5498UbArr));
    }

    public ObjectWriter forType(JavaType javaType) {
        return _new(this._generatorSettings, this._prefetch.forRootType(this, javaType));
    }

    public ObjectWriter forType(Class<?> cls) {
        return forType(this._config.constructType(cls));
    }

    public ObjectWriter forType(AbstractC5533Vj<?> abstractC5533Vj) {
        return forType(this._config.getTypeFactory().constructType(abstractC5533Vj.AEQbTJ()));
    }

    @Deprecated
    public ObjectWriter withType(JavaType javaType) {
        return forType(javaType);
    }

    @Deprecated
    public ObjectWriter withType(Class<?> cls) {
        return forType(cls);
    }

    @Deprecated
    public ObjectWriter withType(AbstractC5533Vj<?> abstractC5533Vj) {
        return forType(abstractC5533Vj);
    }

    public ObjectWriter with(DateFormat dateFormat) {
        return _new(this, this._config.with(dateFormat));
    }

    public ObjectWriter withDefaultPrettyPrinter() {
        return with(this._config.getDefaultPrettyPrinter());
    }

    public ObjectWriter with(XS xs) {
        return xs == this._config.getFilterProvider() ? this : _new(this, this._config.withFilters(xs));
    }

    public ObjectWriter with(InterfaceC5504Uh interfaceC5504Uh) {
        return _new(this._generatorSettings.with(interfaceC5504Uh), this._prefetch);
    }

    public ObjectWriter withRootName(String str) {
        return _new(this, this._config.withRootName(str));
    }

    public ObjectWriter withRootName(PropertyName propertyName) {
        return _new(this, this._config.withRootName(propertyName));
    }

    public ObjectWriter withoutRootName() {
        return _new(this, this._config.withRootName(PropertyName.NO_NAME));
    }

    public ObjectWriter with(InterfaceC5497Ua interfaceC5497Ua) {
        _verifySchemaType(interfaceC5497Ua);
        return _new(this._generatorSettings.with(interfaceC5497Ua), this._prefetch);
    }

    @Deprecated
    public ObjectWriter withSchema(InterfaceC5497Ua interfaceC5497Ua) {
        return with(interfaceC5497Ua);
    }

    public ObjectWriter withView(Class<?> cls) {
        return _new(this, this._config.withView(cls));
    }

    public ObjectWriter with(Locale locale) {
        return _new(this, this._config.with(locale));
    }

    public ObjectWriter with(TimeZone timeZone) {
        return _new(this, this._config.with(timeZone));
    }

    public ObjectWriter with(Base64Variant base64Variant) {
        return _new(this, this._config.with(base64Variant));
    }

    public ObjectWriter with(CharacterEscapes characterEscapes) {
        return _new(this._generatorSettings.with(characterEscapes), this._prefetch);
    }

    public ObjectWriter with(JsonFactory jsonFactory) {
        return jsonFactory == this._generatorFactory ? this : _new(this, jsonFactory);
    }

    public ObjectWriter with(ContextAttributes contextAttributes) {
        return _new(this, this._config.with(contextAttributes));
    }

    public ObjectWriter withAttributes(Map<?, ?> map) {
        return _new(this, this._config.withAttributes(map));
    }

    public ObjectWriter withAttribute(Object obj, Object obj2) {
        return _new(this, this._config.withAttribute(obj, obj2));
    }

    public ObjectWriter withoutAttribute(Object obj) {
        return _new(this, this._config.withoutAttribute(obj));
    }

    public ObjectWriter withRootValueSeparator(String str) {
        return _new(this._generatorSettings.withRootValueSeparator(str), this._prefetch);
    }

    public ObjectWriter withRootValueSeparator(InterfaceC5501Ue interfaceC5501Ue) {
        return _new(this._generatorSettings.withRootValueSeparator(interfaceC5501Ue), this._prefetch);
    }

    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        _assertNotNull("out", outputStream);
        return _configureGenerator(this._generatorFactory.createGenerator(outputStream, JsonEncoding.UTF8));
    }

    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("out", outputStream);
        return _configureGenerator(this._generatorFactory.createGenerator(outputStream, jsonEncoding));
    }

    public JsonGenerator createGenerator(Writer writer) throws IOException {
        _assertNotNull("w", writer);
        return _configureGenerator(this._generatorFactory.createGenerator(writer));
    }

    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        _assertNotNull("outputFile", file);
        return _configureGenerator(this._generatorFactory.createGenerator(file, jsonEncoding));
    }

    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        _assertNotNull("out", dataOutput);
        return _configureGenerator(this._generatorFactory.createGenerator(dataOutput));
    }

    public VH writeValues(File file) throws IOException {
        return _newSequenceWriter(false, createGenerator(file, JsonEncoding.UTF8), true);
    }

    public VH writeValues(JsonGenerator jsonGenerator) throws IOException {
        _assertNotNull("g", jsonGenerator);
        return _newSequenceWriter(false, _configureGenerator(jsonGenerator), false);
    }

    public VH writeValues(Writer writer) throws IOException {
        return _newSequenceWriter(false, createGenerator(writer), true);
    }

    public VH writeValues(OutputStream outputStream) throws IOException {
        return _newSequenceWriter(false, createGenerator(outputStream, JsonEncoding.UTF8), true);
    }

    public VH writeValues(DataOutput dataOutput) throws IOException {
        return _newSequenceWriter(false, createGenerator(dataOutput), true);
    }

    public VH writeValuesAsArray(File file) throws IOException {
        return _newSequenceWriter(true, createGenerator(file, JsonEncoding.UTF8), true);
    }

    public VH writeValuesAsArray(JsonGenerator jsonGenerator) throws IOException {
        _assertNotNull("gen", jsonGenerator);
        return _newSequenceWriter(true, jsonGenerator, false);
    }

    public VH writeValuesAsArray(Writer writer) throws IOException {
        return _newSequenceWriter(true, createGenerator(writer), true);
    }

    public VH writeValuesAsArray(OutputStream outputStream) throws IOException {
        return _newSequenceWriter(true, createGenerator(outputStream, JsonEncoding.UTF8), true);
    }

    public VH writeValuesAsArray(DataOutput dataOutput) throws IOException {
        return _newSequenceWriter(true, createGenerator(dataOutput), true);
    }

    public boolean isEnabled(SerializationFeature serializationFeature) {
        return this._config.isEnabled(serializationFeature);
    }

    public boolean isEnabled(MapperFeature mapperFeature) {
        return this._config.isEnabled(mapperFeature);
    }

    public boolean isEnabled(VT vt) {
        return this._config.isEnabled(vt);
    }

    @Deprecated
    public boolean isEnabled(JsonParser.Feature feature) {
        return this._generatorFactory.isEnabled(feature);
    }

    public boolean isEnabled(JsonGenerator.Feature feature) {
        return this._generatorFactory.isEnabled(feature);
    }

    public boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return this._generatorFactory.isEnabled(streamWriteFeature);
    }

    public TypeFactory getTypeFactory() {
        return this._config.getTypeFactory();
    }

    public boolean hasPrefetchedSerializer() {
        return this._prefetch.hasSerializer();
    }

    public ContextAttributes getAttributes() {
        return this._config.getAttributes();
    }

    public void writeValue(JsonGenerator jsonGenerator, Object obj) throws IOException {
        _assertNotNull("g", jsonGenerator);
        _configureGenerator(jsonGenerator);
        if (this._config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            Closeable closeable = (Closeable) obj;
            try {
                this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
                if (this._config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
                    jsonGenerator.flush();
                }
                closeable.close();
                return;
            } catch (Exception e) {
                C5619Yr.OLrzqt((JsonGenerator) null, closeable, e);
                return;
            }
        }
        this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
        if (this._config.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE)) {
            jsonGenerator.flush();
        }
    }

    public void writeValue(File file, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(file, JsonEncoding.UTF8), obj);
    }

    public void writeValue(OutputStream outputStream, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(outputStream, JsonEncoding.UTF8), obj);
    }

    public void writeValue(Writer writer, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(writer), obj);
    }

    public void writeValue(DataOutput dataOutput, Object obj) throws IOException {
        _writeValueAndClose(createGenerator(dataOutput), obj);
    }

    public String writeValueAsString(Object obj) throws JsonProcessingException {
        UC uc = new UC(this._generatorFactory._getBufferRecycler());
        try {
            _writeValueAndClose(createGenerator(uc), obj);
            return uc.OLrzqt();
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public byte[] writeValueAsBytes(Object obj) throws JsonProcessingException {
        try {
            C5537Vn c5537Vn = new C5537Vn(this._generatorFactory._getBufferRecycler());
            try {
                _writeValueAndClose(createGenerator(c5537Vn, JsonEncoding.UTF8), obj);
                byte[] bArrAYXKKw = c5537Vn.AYXKKw();
                c5537Vn.OLrzqt();
                c5537Vn.close();
                return bArrAYXKKw;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        c5537Vn.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.fromUnexpectedIOE(e2);
        }
    }

    public void acceptJsonFormatVisitor(JavaType javaType, InterfaceC5584Xi interfaceC5584Xi) throws JsonMappingException {
        _assertNotNull("type", javaType);
        _assertNotNull("visitor", interfaceC5584Xi);
        _serializerProvider().acceptJsonFormatVisitor(javaType, interfaceC5584Xi);
    }

    public void acceptJsonFormatVisitor(Class<?> cls, InterfaceC5584Xi interfaceC5584Xi) throws JsonMappingException {
        _assertNotNull("type", cls);
        _assertNotNull("visitor", interfaceC5584Xi);
        acceptJsonFormatVisitor(this._config.constructType(cls), interfaceC5584Xi);
    }

    public boolean canSerialize(Class<?> cls) {
        _assertNotNull("type", cls);
        return _serializerProvider().hasSerializerFor(cls, null);
    }

    public boolean canSerialize(Class<?> cls, AtomicReference<Throwable> atomicReference) {
        _assertNotNull("type", cls);
        return _serializerProvider().hasSerializerFor(cls, atomicReference);
    }

    public DefaultSerializerProvider _serializerProvider() {
        return this._serializerProvider.createInstance(this._config, this._serializerFactory);
    }

    public void _verifySchemaType(InterfaceC5497Ua interfaceC5497Ua) {
        if (interfaceC5497Ua == null || this._generatorFactory.canUseSchema(interfaceC5497Ua)) {
            return;
        }
        throw new IllegalArgumentException("Cannot use FormatSchema of type " + interfaceC5497Ua.getClass().getName() + " for format " + this._generatorFactory.getFormatName());
    }

    public final void _writeValueAndClose(JsonGenerator jsonGenerator, Object obj) throws IOException {
        if (this._config.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable)) {
            _writeCloseable(jsonGenerator, obj);
            return;
        }
        try {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
            jsonGenerator.close();
        } catch (Exception e) {
            C5619Yr.copydefault(jsonGenerator, e);
        }
    }

    private final void _writeCloseable(JsonGenerator jsonGenerator, Object obj) throws IOException {
        Closeable closeable = (Closeable) obj;
        try {
            this._prefetch.serialize(jsonGenerator, obj, _serializerProvider());
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e) {
                e = e;
                closeable = null;
                C5619Yr.OLrzqt(jsonGenerator, closeable, e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final JsonGenerator _configureGenerator(JsonGenerator jsonGenerator) {
        this._config.initialize(jsonGenerator);
        this._generatorSettings.initialize(jsonGenerator);
        return jsonGenerator;
    }

    public final void _assertNotNull(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", str));
        }
    }

    public static final class GeneratorSettings implements Serializable {
        public static final GeneratorSettings empty = new GeneratorSettings(null, null, null, null);
        private static final long serialVersionUID = 1;
        public final CharacterEscapes characterEscapes;
        public final InterfaceC5504Uh prettyPrinter;
        public final InterfaceC5501Ue rootValueSeparator;
        public final InterfaceC5497Ua schema;

        public GeneratorSettings(InterfaceC5504Uh interfaceC5504Uh, InterfaceC5497Ua interfaceC5497Ua, CharacterEscapes characterEscapes, InterfaceC5501Ue interfaceC5501Ue) {
            this.prettyPrinter = interfaceC5504Uh;
            this.schema = interfaceC5497Ua;
            this.characterEscapes = characterEscapes;
            this.rootValueSeparator = interfaceC5501Ue;
        }

        public GeneratorSettings with(InterfaceC5504Uh interfaceC5504Uh) {
            if (interfaceC5504Uh == null) {
                interfaceC5504Uh = ObjectWriter.NULL_PRETTY_PRINTER;
            }
            return interfaceC5504Uh == this.prettyPrinter ? this : new GeneratorSettings(interfaceC5504Uh, this.schema, this.characterEscapes, this.rootValueSeparator);
        }

        public GeneratorSettings with(InterfaceC5497Ua interfaceC5497Ua) {
            return this.schema == interfaceC5497Ua ? this : new GeneratorSettings(this.prettyPrinter, interfaceC5497Ua, this.characterEscapes, this.rootValueSeparator);
        }

        public GeneratorSettings with(CharacterEscapes characterEscapes) {
            return this.characterEscapes == characterEscapes ? this : new GeneratorSettings(this.prettyPrinter, this.schema, characterEscapes, this.rootValueSeparator);
        }

        public GeneratorSettings withRootValueSeparator(String str) {
            return str == null ? this.rootValueSeparator == null ? this : new GeneratorSettings(this.prettyPrinter, this.schema, this.characterEscapes, null) : str.equals(_rootValueSeparatorAsString()) ? this : new GeneratorSettings(this.prettyPrinter, this.schema, this.characterEscapes, new SerializedString(str));
        }

        public GeneratorSettings withRootValueSeparator(InterfaceC5501Ue interfaceC5501Ue) {
            return interfaceC5501Ue == null ? this.rootValueSeparator == null ? this : new GeneratorSettings(this.prettyPrinter, this.schema, this.characterEscapes, null) : interfaceC5501Ue.equals(this.rootValueSeparator) ? this : new GeneratorSettings(this.prettyPrinter, this.schema, this.characterEscapes, interfaceC5501Ue);
        }

        private final String _rootValueSeparatorAsString() {
            InterfaceC5501Ue interfaceC5501Ue = this.rootValueSeparator;
            if (interfaceC5501Ue == null) {
                return null;
            }
            return interfaceC5501Ue.getValue();
        }

        public void initialize(JsonGenerator jsonGenerator) {
            InterfaceC5504Uh interfaceC5504Uh = this.prettyPrinter;
            if (interfaceC5504Uh != null) {
                if (interfaceC5504Uh == ObjectWriter.NULL_PRETTY_PRINTER) {
                    jsonGenerator.EZpvd((InterfaceC5504Uh) null);
                } else {
                    if (interfaceC5504Uh instanceof InterfaceC5539Vp) {
                        interfaceC5504Uh = (InterfaceC5504Uh) ((InterfaceC5539Vp) interfaceC5504Uh).createInstance();
                    }
                    jsonGenerator.EZpvd(interfaceC5504Uh);
                }
            }
            CharacterEscapes characterEscapes = this.characterEscapes;
            if (characterEscapes != null) {
                jsonGenerator.copydefault(characterEscapes);
            }
            InterfaceC5497Ua interfaceC5497Ua = this.schema;
            if (interfaceC5497Ua != null) {
                jsonGenerator.copydefault(interfaceC5497Ua);
            }
            InterfaceC5501Ue interfaceC5501Ue = this.rootValueSeparator;
            if (interfaceC5501Ue != null) {
                jsonGenerator.KWHzl(interfaceC5501Ue);
            }
        }
    }

    public static final class Prefetch implements Serializable {
        public static final Prefetch empty = new Prefetch(null, null, null);
        private static final long serialVersionUID = 1;
        private final JavaType rootType;
        private final AbstractC5601Xz typeSerializer;
        private final VD<Object> valueSerializer;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC5601Xz getTypeSerializer() {
            return this.typeSerializer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final VD<Object> getValueSerializer() {
            return this.valueSerializer;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean hasSerializer() {
            return (this.valueSerializer == null && this.typeSerializer == null) ? false : true;
        }

        private Prefetch(JavaType javaType, VD<Object> vd, AbstractC5601Xz abstractC5601Xz) {
            this.rootType = javaType;
            this.valueSerializer = vd;
            this.typeSerializer = abstractC5601Xz;
        }

        public Prefetch forRootType(ObjectWriter objectWriter, JavaType javaType) {
            if (javaType == null) {
                return (this.rootType == null || this.valueSerializer == null) ? this : new Prefetch(null, null, null);
            }
            if (javaType.equals(this.rootType)) {
                return this;
            }
            if (javaType.isJavaLangObject()) {
                try {
                    return new Prefetch(null, null, objectWriter._serializerProvider().findTypeSerializer(javaType));
                } catch (JsonMappingException e) {
                    throw new RuntimeJsonMappingException(e);
                }
            }
            if (objectWriter.isEnabled(SerializationFeature.EAGER_SERIALIZER_FETCH)) {
                try {
                    VD<Object> vdFindTypedValueSerializer = objectWriter._serializerProvider().findTypedValueSerializer(javaType, true, (BeanProperty) null);
                    if (vdFindTypedValueSerializer instanceof C5608Yg) {
                        return new Prefetch(javaType, null, ((C5608Yg) vdFindTypedValueSerializer).copydefault());
                    }
                    return new Prefetch(javaType, vdFindTypedValueSerializer, null);
                } catch (DatabindException unused) {
                }
            }
            return new Prefetch(javaType, null, this.typeSerializer);
        }

        public void serialize(JsonGenerator jsonGenerator, Object obj, DefaultSerializerProvider defaultSerializerProvider) throws IOException {
            AbstractC5601Xz abstractC5601Xz = this.typeSerializer;
            if (abstractC5601Xz != null) {
                defaultSerializerProvider.serializePolymorphic(jsonGenerator, obj, this.rootType, this.valueSerializer, abstractC5601Xz);
                return;
            }
            VD<Object> vd = this.valueSerializer;
            if (vd != null) {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj, this.rootType, vd);
                return;
            }
            JavaType javaType = this.rootType;
            if (javaType != null) {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj, javaType);
            } else {
                defaultSerializerProvider.serializeValue(jsonGenerator, obj);
            }
        }
    }
}
