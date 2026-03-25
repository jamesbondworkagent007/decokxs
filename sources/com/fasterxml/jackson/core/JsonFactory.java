package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.CharArrayReader;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.net.URL;
import o.AbstractC5505Ui;
import o.AbstractC5507Uk;
import o.C5502Uf;
import o.C5517Ut;
import o.C5524Va;
import o.C5525Vb;
import o.C5526Vc;
import o.C5528Ve;
import o.C5530Vg;
import o.C5532Vi;
import o.C5534Vk;
import o.C5536Vm;
import o.C5538Vo;
import o.InterfaceC5497Ua;
import o.InterfaceC5498Ub;
import o.InterfaceC5501Ue;
import o.InterfaceC5513Uq;
import o.InterfaceC5540Vq;
import o.UG;
import o.UT;
import o.UY;
import o.UZ;

/* JADX INFO: loaded from: classes21.dex */
public class JsonFactory extends TokenStreamFactory implements Serializable {
    public static final char DEFAULT_QUOTE_CHAR = '\"';
    public static final String FORMAT_NAME_JSON = "JSON";
    private static final long serialVersionUID = 2;
    protected final transient C5532Vi _byteSymbolCanonicalizer;
    protected CharacterEscapes _characterEscapes;
    public int _factoryFeatures;
    public int _generatorFeatures;
    protected InputDecorator _inputDecorator;
    public int _maximumNonEscapedChar;
    public AbstractC5505Ui _objectCodec;
    protected OutputDecorator _outputDecorator;
    public int _parserFeatures;
    protected final char _quoteChar;
    protected final transient C5534Vk _rootCharSymbols;
    public InterfaceC5501Ue _rootValueSeparator;
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
    public static final InterfaceC5501Ue DEFAULT_ROOT_VALUE_SEPARATOR = DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean canHandleBinaryNatively() {
        return false;
    }

    public boolean canUseCharArrays() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CharacterEscapes getCharacterEscapes() {
        return this._characterEscapes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AbstractC5505Ui getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public int getFormatGeneratorFeatures() {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public int getFormatParserFeatures() {
        return 0;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public Class<? extends InterfaceC5498Ub> getFormatReadFeatureType() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public Class<? extends InterfaceC5498Ub> getFormatWriteFeatureType() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final int getGeneratorFeatures() {
        return this._generatorFeatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InputDecorator getInputDecorator() {
        return this._inputDecorator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OutputDecorator getOutputDecorator() {
        return this._outputDecorator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final int getParserFeatures() {
        return this._parserFeatures;
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean requiresPropertyOrdering() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonFactory setCharacterEscapes(CharacterEscapes characterEscapes) {
        this._characterEscapes = characterEscapes;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public JsonFactory setCodec(AbstractC5505Ui abstractC5505Ui) {
        this._objectCodec = abstractC5505Ui;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public JsonFactory setInputDecorator(InputDecorator inputDecorator) {
        this._inputDecorator = inputDecorator;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Deprecated
    public JsonFactory setOutputDecorator(OutputDecorator outputDecorator) {
        this._outputDecorator = outputDecorator;
        return this;
    }

    public enum Feature implements InterfaceC5540Vq {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);

        private final boolean _defaultState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC5540Vq
        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public static int collectDefaults() {
            int mask = 0;
            for (Feature feature : values()) {
                if (feature.enabledByDefault()) {
                    mask |= feature.getMask();
                }
            }
            return mask;
        }

        Feature(boolean z) {
            this._defaultState = z;
        }

        @Override // o.InterfaceC5540Vq
        public boolean enabledIn(int i) {
            return (i & getMask()) != 0;
        }

        @Override // o.InterfaceC5540Vq
        public int getMask() {
            return 1 << ordinal();
        }
    }

    public JsonFactory() {
        this((AbstractC5505Ui) null);
    }

    public JsonFactory(AbstractC5505Ui abstractC5505Ui) {
        this._rootCharSymbols = C5534Vk.copydefault();
        this._byteSymbolCanonicalizer = C5532Vi.AEQbTJ();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = abstractC5505Ui;
        this._quoteChar = '\"';
    }

    public JsonFactory(JsonFactory jsonFactory, AbstractC5505Ui abstractC5505Ui) {
        this._rootCharSymbols = C5534Vk.copydefault();
        this._byteSymbolCanonicalizer = C5532Vi.AEQbTJ();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = abstractC5505Ui;
        this._factoryFeatures = jsonFactory._factoryFeatures;
        this._parserFeatures = jsonFactory._parserFeatures;
        this._generatorFeatures = jsonFactory._generatorFeatures;
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._characterEscapes = jsonFactory._characterEscapes;
        this._rootValueSeparator = jsonFactory._rootValueSeparator;
        this._maximumNonEscapedChar = jsonFactory._maximumNonEscapedChar;
        this._quoteChar = jsonFactory._quoteChar;
    }

    public JsonFactory(C5502Uf c5502Uf) {
        this._rootCharSymbols = C5534Vk.copydefault();
        this._byteSymbolCanonicalizer = C5532Vi.AEQbTJ();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = c5502Uf.valueOf;
        this._parserFeatures = c5502Uf.DbNXlk;
        this._generatorFeatures = c5502Uf.AkhnZx;
        this._inputDecorator = c5502Uf.gEmmrt;
        this._outputDecorator = c5502Uf.AhwBna;
        this._characterEscapes = c5502Uf.OLrzqt;
        this._rootValueSeparator = c5502Uf.copydefault;
        this._maximumNonEscapedChar = c5502Uf.KWHzl;
        this._quoteChar = c5502Uf.EZpvd;
    }

    public JsonFactory(AbstractC5507Uk<?, ?> abstractC5507Uk, boolean z) {
        this._rootCharSymbols = C5534Vk.copydefault();
        this._byteSymbolCanonicalizer = C5532Vi.AEQbTJ();
        this._factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
        this._parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
        this._generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
        this._rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
        this._objectCodec = null;
        this._factoryFeatures = abstractC5507Uk.valueOf;
        this._parserFeatures = abstractC5507Uk.DbNXlk;
        this._generatorFeatures = abstractC5507Uk.AkhnZx;
        this._inputDecorator = abstractC5507Uk.gEmmrt;
        this._outputDecorator = abstractC5507Uk.AhwBna;
        this._characterEscapes = null;
        this._rootValueSeparator = null;
        this._maximumNonEscapedChar = 0;
        this._quoteChar = '\"';
    }

    public AbstractC5507Uk<?, ?> rebuild() {
        _requireJSONFactory("Factory implementation for format (%s) MUST override `rebuild()` method");
        return new C5502Uf(this);
    }

    public static AbstractC5507Uk<?, ?> builder() {
        return new C5502Uf();
    }

    public JsonFactory copy() {
        _checkInvalidCopy(JsonFactory.class);
        return new JsonFactory(this, (AbstractC5505Ui) null);
    }

    public void _checkInvalidCopy(Class<?> cls) {
        if (getClass() == cls) {
            return;
        }
        throw new IllegalStateException("Failed copy(): " + getClass().getName() + " (version: " + version() + ") does not override copy(); it has to");
    }

    public Object readResolve() {
        return new JsonFactory(this, this._objectCodec);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean canParseAsync() {
        return _isJSONFactory();
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public boolean canUseSchema(InterfaceC5497Ua interfaceC5497Ua) {
        String formatName;
        return (interfaceC5497Ua == null || (formatName = getFormatName()) == null || !formatName.equals(interfaceC5497Ua.OLrzqt())) ? false : true;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public String getFormatName() {
        if (getClass() == JsonFactory.class) {
            return FORMAT_NAME_JSON;
        }
        return null;
    }

    public MatchStrength hasFormat(InterfaceC5513Uq interfaceC5513Uq) throws IOException {
        if (getClass() == JsonFactory.class) {
            return hasJSONFormat(interfaceC5513Uq);
        }
        return null;
    }

    public MatchStrength hasJSONFormat(InterfaceC5513Uq interfaceC5513Uq) throws IOException {
        return UT.EZpvd(interfaceC5513Uq);
    }

    public Version version() {
        return C5525Vb.copydefault;
    }

    @Deprecated
    public final JsonFactory configure(Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    @Deprecated
    public JsonFactory enable(Feature feature) {
        this._factoryFeatures = feature.getMask() | this._factoryFeatures;
        return this;
    }

    @Deprecated
    public JsonFactory disable(Feature feature) {
        this._factoryFeatures = (~feature.getMask()) & this._factoryFeatures;
        return this;
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.getMask() & this._factoryFeatures) != 0;
    }

    public final JsonFactory configure(JsonParser.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonFactory enable(JsonParser.Feature feature) {
        this._parserFeatures = feature.getMask() | this._parserFeatures;
        return this;
    }

    public JsonFactory disable(JsonParser.Feature feature) {
        this._parserFeatures = (~feature.getMask()) & this._parserFeatures;
        return this;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final boolean isEnabled(JsonParser.Feature feature) {
        return (feature.getMask() & this._parserFeatures) != 0;
    }

    public final boolean isEnabled(StreamReadFeature streamReadFeature) {
        return (streamReadFeature.mappedFeature().getMask() & this._parserFeatures) != 0;
    }

    public final JsonFactory configure(JsonGenerator.Feature feature, boolean z) {
        return z ? enable(feature) : disable(feature);
    }

    public JsonFactory enable(JsonGenerator.Feature feature) {
        this._generatorFeatures = feature.getMask() | this._generatorFeatures;
        return this;
    }

    public JsonFactory disable(JsonGenerator.Feature feature) {
        this._generatorFeatures = (~feature.getMask()) & this._generatorFeatures;
        return this;
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public final boolean isEnabled(JsonGenerator.Feature feature) {
        return (feature.getMask() & this._generatorFeatures) != 0;
    }

    public final boolean isEnabled(StreamWriteFeature streamWriteFeature) {
        return (streamWriteFeature.mappedFeature().getMask() & this._generatorFeatures) != 0;
    }

    public JsonFactory setRootValueSeparator(String str) {
        this._rootValueSeparator = str == null ? null : new SerializedString(str);
        return this;
    }

    public String getRootValueSeparator() {
        InterfaceC5501Ue interfaceC5501Ue = this._rootValueSeparator;
        if (interfaceC5501Ue == null) {
            return null;
        }
        return interfaceC5501Ue.getValue();
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(File file) throws IOException {
        C5517Ut c5517Ut_createContext = _createContext(_createContentReference(file), true);
        return _createParser(_decorate(_fileInputStream(file), c5517Ut_createContext), c5517Ut_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(URL url) throws IOException {
        C5517Ut c5517Ut_createContext = _createContext(_createContentReference(url), true);
        return _createParser(_decorate(_optimizedStreamFromURL(url), c5517Ut_createContext), c5517Ut_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(InputStream inputStream) throws IOException {
        C5517Ut c5517Ut_createContext = _createContext(_createContentReference(inputStream), false);
        return _createParser(_decorate(inputStream, c5517Ut_createContext), c5517Ut_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(Reader reader) throws IOException {
        C5517Ut c5517Ut_createContext = _createContext(_createContentReference(reader), false);
        return _createParser(_decorate(reader, c5517Ut_createContext), c5517Ut_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(byte[] bArr) throws IOException {
        InputStream inputStreamDecorate;
        C5517Ut c5517Ut_createContext = _createContext(_createContentReference(bArr), true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null && (inputStreamDecorate = inputDecorator.decorate(c5517Ut_createContext, bArr, 0, bArr.length)) != null) {
            return _createParser(inputStreamDecorate, c5517Ut_createContext);
        }
        return _createParser(bArr, 0, bArr.length, c5517Ut_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStreamDecorate;
        _checkRangeBoundsForByteArray(bArr, i, i2);
        C5517Ut c5517Ut_createContext = _createContext(_createContentReference(bArr, i, i2), true);
        InputDecorator inputDecorator = this._inputDecorator;
        if (inputDecorator != null && (inputStreamDecorate = inputDecorator.decorate(c5517Ut_createContext, bArr, i, i2)) != null) {
            return _createParser(inputStreamDecorate, c5517Ut_createContext);
        }
        return _createParser(bArr, i, i2, c5517Ut_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(String str) throws IOException {
        int length = str.length();
        if (this._inputDecorator != null || length > 32768 || !canUseCharArrays()) {
            return createParser(new StringReader(str));
        }
        C5517Ut c5517Ut_createContext = _createContext(_createContentReference(str), true);
        char[] cArrEZpvd = c5517Ut_createContext.EZpvd(length);
        str.getChars(0, length, cArrEZpvd, 0);
        return _createParser(cArrEZpvd, 0, length, c5517Ut_createContext, true);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(char[] cArr) throws IOException {
        return createParser(cArr, 0, cArr.length);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(char[] cArr, int i, int i2) throws IOException {
        _checkRangeBoundsForCharArray(cArr, i, i2);
        if (this._inputDecorator != null) {
            return createParser(new CharArrayReader(cArr, i, i2));
        }
        return _createParser(cArr, i, i2, _createContext(_createContentReference(cArr, i, i2), true), false);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createParser(DataInput dataInput) throws IOException {
        C5517Ut c5517Ut_createContext = _createContext(_createContentReference(dataInput), false);
        return _createParser(_decorate(dataInput, c5517Ut_createContext), c5517Ut_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createNonBlockingByteArrayParser() throws IOException {
        _requireJSONFactory("Non-blocking source not (yet?) supported for this format (%s)");
        return new C5528Ve(_createNonBlockingContext(null), this._parserFeatures, this._byteSymbolCanonicalizer.AhwBna(this._factoryFeatures));
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonParser createNonBlockingByteBufferParser() throws IOException {
        _requireJSONFactory("Non-blocking source not (yet?) supported for this format (%s)");
        return new C5530Vg(_createNonBlockingContext(null), this._parserFeatures, this._byteSymbolCanonicalizer.AhwBna(this._factoryFeatures));
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        C5517Ut c5517Ut_createContext = _createContext(_createContentReference(outputStream), false);
        c5517Ut_createContext.KWHzl(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate(outputStream, c5517Ut_createContext), c5517Ut_createContext);
        }
        return _createGenerator(_decorate(_createWriter(outputStream, jsonEncoding, c5517Ut_createContext), c5517Ut_createContext), c5517Ut_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(Writer writer) throws IOException {
        C5517Ut c5517Ut_createContext = _createContext(_createContentReference(writer), false);
        return _createGenerator(_decorate(writer, c5517Ut_createContext), c5517Ut_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(File file, JsonEncoding jsonEncoding) throws IOException {
        OutputStream outputStream_fileOutputStream = _fileOutputStream(file);
        C5517Ut c5517Ut_createContext = _createContext(_createContentReference(outputStream_fileOutputStream), true);
        c5517Ut_createContext.KWHzl(jsonEncoding);
        if (jsonEncoding == JsonEncoding.UTF8) {
            return _createUTF8Generator(_decorate(outputStream_fileOutputStream, c5517Ut_createContext), c5517Ut_createContext);
        }
        return _createGenerator(_decorate(_createWriter(outputStream_fileOutputStream, jsonEncoding, c5517Ut_createContext), c5517Ut_createContext), c5517Ut_createContext);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(DataOutput dataOutput, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), jsonEncoding);
    }

    @Override // com.fasterxml.jackson.core.TokenStreamFactory
    public JsonGenerator createGenerator(DataOutput dataOutput) throws IOException {
        return createGenerator(_createDataOutputWrapper(dataOutput), JsonEncoding.UTF8);
    }

    @Deprecated
    public JsonParser createJsonParser(File file) throws IOException {
        return createParser(file);
    }

    @Deprecated
    public JsonParser createJsonParser(URL url) throws IOException {
        return createParser(url);
    }

    @Deprecated
    public JsonParser createJsonParser(InputStream inputStream) throws IOException {
        return createParser(inputStream);
    }

    @Deprecated
    public JsonParser createJsonParser(Reader reader) throws IOException {
        return createParser(reader);
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr) throws IOException {
        return createParser(bArr);
    }

    @Deprecated
    public JsonParser createJsonParser(byte[] bArr, int i, int i2) throws IOException {
        return createParser(bArr, i, i2);
    }

    @Deprecated
    public JsonParser createJsonParser(String str) throws IOException {
        return createParser(str);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream, JsonEncoding jsonEncoding) throws IOException {
        return createGenerator(outputStream, jsonEncoding);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(Writer writer) throws IOException {
        return createGenerator(writer);
    }

    @Deprecated
    public JsonGenerator createJsonGenerator(OutputStream outputStream) throws IOException {
        return createGenerator(outputStream, JsonEncoding.UTF8);
    }

    public JsonParser _createParser(InputStream inputStream, C5517Ut c5517Ut) throws IOException {
        try {
            return new UT(c5517Ut, inputStream).AEQbTJ(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
        } catch (IOException | RuntimeException e) {
            if (c5517Ut.AhwBna()) {
                try {
                    inputStream.close();
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                }
            }
            throw e;
        }
    }

    public JsonParser _createParser(Reader reader, C5517Ut c5517Ut) throws IOException {
        return new UZ(c5517Ut, this._parserFeatures, reader, this._objectCodec, this._rootCharSymbols.KWHzl(this._factoryFeatures));
    }

    public JsonParser _createParser(char[] cArr, int i, int i2, C5517Ut c5517Ut, boolean z) throws IOException {
        return new UZ(c5517Ut, this._parserFeatures, null, this._objectCodec, this._rootCharSymbols.KWHzl(this._factoryFeatures), cArr, i, i + i2, z);
    }

    public JsonParser _createParser(byte[] bArr, int i, int i2, C5517Ut c5517Ut) throws IOException {
        return new UT(c5517Ut, bArr, i, i2).AEQbTJ(this._parserFeatures, this._objectCodec, this._byteSymbolCanonicalizer, this._rootCharSymbols, this._factoryFeatures);
    }

    public JsonParser _createParser(DataInput dataInput, C5517Ut c5517Ut) throws IOException {
        _requireJSONFactory("InputData source not (yet?) supported for this format (%s)");
        int iOLrzqt = UT.OLrzqt(dataInput);
        return new UY(c5517Ut, this._parserFeatures, dataInput, this._objectCodec, this._byteSymbolCanonicalizer.AhwBna(this._factoryFeatures), iOLrzqt);
    }

    public JsonGenerator _createGenerator(Writer writer, C5517Ut c5517Ut) throws IOException {
        C5526Vc c5526Vc = new C5526Vc(c5517Ut, this._generatorFeatures, this._objectCodec, writer, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            c5526Vc.EZpvd(i);
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            c5526Vc.copydefault(characterEscapes);
        }
        InterfaceC5501Ue interfaceC5501Ue = this._rootValueSeparator;
        if (interfaceC5501Ue != DEFAULT_ROOT_VALUE_SEPARATOR) {
            c5526Vc.KWHzl(interfaceC5501Ue);
        }
        return c5526Vc;
    }

    public JsonGenerator _createUTF8Generator(OutputStream outputStream, C5517Ut c5517Ut) throws IOException {
        C5524Va c5524Va = new C5524Va(c5517Ut, this._generatorFeatures, this._objectCodec, outputStream, this._quoteChar);
        int i = this._maximumNonEscapedChar;
        if (i > 0) {
            c5524Va.EZpvd(i);
        }
        CharacterEscapes characterEscapes = this._characterEscapes;
        if (characterEscapes != null) {
            c5524Va.copydefault(characterEscapes);
        }
        InterfaceC5501Ue interfaceC5501Ue = this._rootValueSeparator;
        if (interfaceC5501Ue != DEFAULT_ROOT_VALUE_SEPARATOR) {
            c5524Va.KWHzl(interfaceC5501Ue);
        }
        return c5524Va;
    }

    public Writer _createWriter(OutputStream outputStream, JsonEncoding jsonEncoding, C5517Ut c5517Ut) throws IOException {
        if (jsonEncoding == JsonEncoding.UTF8) {
            return new UG(c5517Ut, outputStream);
        }
        return new OutputStreamWriter(outputStream, jsonEncoding.getJavaName());
    }

    public final InputStream _decorate(InputStream inputStream, C5517Ut c5517Ut) throws IOException {
        InputStream inputStreamDecorate;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (inputStreamDecorate = inputDecorator.decorate(c5517Ut, inputStream)) == null) ? inputStream : inputStreamDecorate;
    }

    public final Reader _decorate(Reader reader, C5517Ut c5517Ut) throws IOException {
        Reader readerDecorate;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (readerDecorate = inputDecorator.decorate(c5517Ut, reader)) == null) ? reader : readerDecorate;
    }

    public final DataInput _decorate(DataInput dataInput, C5517Ut c5517Ut) throws IOException {
        DataInput dataInputDecorate;
        InputDecorator inputDecorator = this._inputDecorator;
        return (inputDecorator == null || (dataInputDecorate = inputDecorator.decorate(c5517Ut, dataInput)) == null) ? dataInput : dataInputDecorate;
    }

    public final OutputStream _decorate(OutputStream outputStream, C5517Ut c5517Ut) throws IOException {
        OutputStream outputStreamDecorate;
        OutputDecorator outputDecorator = this._outputDecorator;
        return (outputDecorator == null || (outputStreamDecorate = outputDecorator.decorate(c5517Ut, outputStream)) == null) ? outputStream : outputStreamDecorate;
    }

    public final Writer _decorate(Writer writer, C5517Ut c5517Ut) throws IOException {
        Writer writerDecorate;
        OutputDecorator outputDecorator = this._outputDecorator;
        return (outputDecorator == null || (writerDecorate = outputDecorator.decorate(c5517Ut, writer)) == null) ? writer : writerDecorate;
    }

    public C5536Vm _getBufferRecycler() {
        if (Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(this._factoryFeatures)) {
            return C5538Vo.copydefault();
        }
        return new C5536Vm();
    }

    public C5517Ut _createContext(ContentReference contentReference, boolean z) {
        if (contentReference == null) {
            contentReference = ContentReference.unknown();
        }
        return new C5517Ut(_getBufferRecycler(), contentReference, z);
    }

    @Deprecated
    public C5517Ut _createContext(Object obj, boolean z) {
        return new C5517Ut(_getBufferRecycler(), _createContentReference(obj), z);
    }

    public C5517Ut _createNonBlockingContext(Object obj) {
        return new C5517Ut(_getBufferRecycler(), _createContentReference(obj), false);
    }

    public ContentReference _createContentReference(Object obj) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj);
    }

    public ContentReference _createContentReference(Object obj, int i, int i2) {
        return ContentReference.construct(!canHandleBinaryNatively(), obj, i, i2);
    }

    private final void _requireJSONFactory(String str) {
        if (!_isJSONFactory()) {
            throw new UnsupportedOperationException(String.format(str, getFormatName()));
        }
    }

    private final boolean _isJSONFactory() {
        return getFormatName() == FORMAT_NAME_JSON;
    }
}
