package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.IOException;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InterfaceC5501Ue;
import o.InterfaceC5504Uh;
import o.InterfaceC5539Vp;

/* JADX INFO: loaded from: classes21.dex */
public class DefaultPrettyPrinter implements InterfaceC5504Uh, InterfaceC5539Vp<DefaultPrettyPrinter>, Serializable {
    public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
    private static final long serialVersionUID = 1;
    protected Application _arrayIndenter;
    protected transient int _nesting;
    public String _objectFieldValueSeparatorWithSpaces;
    protected Application _objectIndenter;
    protected final InterfaceC5501Ue _rootSeparator;
    protected Separators _separators;
    protected boolean _spacesInObjectEntries;

    public interface Application {
        boolean isInline();

        void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException;
    }

    public static class NopIndenter implements Application, Serializable {
        public static final NopIndenter instance = new NopIndenter();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Application
        public boolean isInline() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Application
        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
        }
    }

    public DefaultPrettyPrinter() {
        this(DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    public DefaultPrettyPrinter(String str) {
        this(str == null ? null : new SerializedString(str));
    }

    public DefaultPrettyPrinter(InterfaceC5501Ue interfaceC5501Ue) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._rootSeparator = interfaceC5501Ue;
        withSeparators(InterfaceC5504Uh.EZpvd);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter) {
        this(defaultPrettyPrinter, defaultPrettyPrinter._rootSeparator);
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter, InterfaceC5501Ue interfaceC5501Ue) {
        this._arrayIndenter = FixedSpaceIndenter.instance;
        this._objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        this._spacesInObjectEntries = true;
        this._arrayIndenter = defaultPrettyPrinter._arrayIndenter;
        this._objectIndenter = defaultPrettyPrinter._objectIndenter;
        this._spacesInObjectEntries = defaultPrettyPrinter._spacesInObjectEntries;
        this._nesting = defaultPrettyPrinter._nesting;
        this._separators = defaultPrettyPrinter._separators;
        this._objectFieldValueSeparatorWithSpaces = defaultPrettyPrinter._objectFieldValueSeparatorWithSpaces;
        this._rootSeparator = interfaceC5501Ue;
    }

    public DefaultPrettyPrinter withRootSeparator(InterfaceC5501Ue interfaceC5501Ue) {
        InterfaceC5501Ue interfaceC5501Ue2 = this._rootSeparator;
        return (interfaceC5501Ue2 == interfaceC5501Ue || (interfaceC5501Ue != null && interfaceC5501Ue.equals(interfaceC5501Ue2))) ? this : new DefaultPrettyPrinter(this, interfaceC5501Ue);
    }

    public DefaultPrettyPrinter withRootSeparator(String str) {
        return withRootSeparator(str == null ? null : new SerializedString(str));
    }

    public void indentArraysWith(Application application) {
        if (application == null) {
            application = NopIndenter.instance;
        }
        this._arrayIndenter = application;
    }

    public void indentObjectsWith(Application application) {
        if (application == null) {
            application = NopIndenter.instance;
        }
        this._objectIndenter = application;
    }

    public DefaultPrettyPrinter withArrayIndenter(Application application) {
        if (application == null) {
            application = NopIndenter.instance;
        }
        if (this._arrayIndenter == application) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._arrayIndenter = application;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withObjectIndenter(Application application) {
        if (application == null) {
            application = NopIndenter.instance;
        }
        if (this._objectIndenter == application) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._objectIndenter = application;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withSpacesInObjectEntries() {
        return _withSpaces(true);
    }

    public DefaultPrettyPrinter withoutSpacesInObjectEntries() {
        return _withSpaces(false);
    }

    public DefaultPrettyPrinter _withSpaces(boolean z) {
        if (this._spacesInObjectEntries == z) {
            return this;
        }
        DefaultPrettyPrinter defaultPrettyPrinter = new DefaultPrettyPrinter(this);
        defaultPrettyPrinter._spacesInObjectEntries = z;
        return defaultPrettyPrinter;
    }

    public DefaultPrettyPrinter withSeparators(Separators separators) {
        this._separators = separators;
        this._objectFieldValueSeparatorWithSpaces = " " + separators.getObjectFieldValueSeparator() + " ";
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: createInstance()Ljava/lang/Object; */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.InterfaceC5539Vp
    public DefaultPrettyPrinter createInstance() {
        if (getClass() != DefaultPrettyPrinter.class) {
            throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
        }
        return new DefaultPrettyPrinter(this);
    }

    @Override // o.InterfaceC5504Uh
    public void writeRootValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        InterfaceC5501Ue interfaceC5501Ue = this._rootSeparator;
        if (interfaceC5501Ue != null) {
            jsonGenerator.OLrzqt(interfaceC5501Ue);
        }
    }

    @Override // o.InterfaceC5504Uh
    public void writeStartObject(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.copydefault(AbstractJsonLexerKt.BEGIN_OBJ);
        if (this._objectIndenter.isInline()) {
            return;
        }
        this._nesting++;
    }

    @Override // o.InterfaceC5504Uh
    public void beforeObjectEntries(JsonGenerator jsonGenerator) throws IOException {
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // o.InterfaceC5504Uh
    public void writeObjectFieldValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        if (this._spacesInObjectEntries) {
            jsonGenerator.copydefault(this._objectFieldValueSeparatorWithSpaces);
        } else {
            jsonGenerator.copydefault(this._separators.getObjectFieldValueSeparator());
        }
    }

    @Override // o.InterfaceC5504Uh
    public void writeObjectEntrySeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.copydefault(this._separators.getObjectEntrySeparator());
        this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // o.InterfaceC5504Uh
    public void writeEndObject(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this._objectIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._objectIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.copydefault(' ');
        }
        jsonGenerator.copydefault(AbstractJsonLexerKt.END_OBJ);
    }

    @Override // o.InterfaceC5504Uh
    public void writeStartArray(JsonGenerator jsonGenerator) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting++;
        }
        jsonGenerator.copydefault(AbstractJsonLexerKt.BEGIN_LIST);
    }

    @Override // o.InterfaceC5504Uh
    public void beforeArrayValues(JsonGenerator jsonGenerator) throws IOException {
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // o.InterfaceC5504Uh
    public void writeArrayValueSeparator(JsonGenerator jsonGenerator) throws IOException {
        jsonGenerator.copydefault(this._separators.getArrayValueSeparator());
        this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
    }

    @Override // o.InterfaceC5504Uh
    public void writeEndArray(JsonGenerator jsonGenerator, int i) throws IOException {
        if (!this._arrayIndenter.isInline()) {
            this._nesting--;
        }
        if (i > 0) {
            this._arrayIndenter.writeIndentation(jsonGenerator, this._nesting);
        } else {
            jsonGenerator.copydefault(' ');
        }
        jsonGenerator.copydefault(AbstractJsonLexerKt.END_LIST);
    }

    public static class FixedSpaceIndenter extends NopIndenter {
        public static final FixedSpaceIndenter instance = new FixedSpaceIndenter();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Application
        public boolean isInline() {
            return true;
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Application
        public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
            jsonGenerator.copydefault(' ');
        }
    }
}
