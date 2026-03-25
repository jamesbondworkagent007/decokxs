package com.fasterxml.jackson.core.util;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public class Separators implements Serializable {
    private static final long serialVersionUID = 1;
    private final char arrayValueSeparator;
    private final char objectEntrySeparator;
    private final char objectFieldValueSeparator;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public char getArrayValueSeparator() {
        return this.arrayValueSeparator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public char getObjectEntrySeparator() {
        return this.objectEntrySeparator;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public char getObjectFieldValueSeparator() {
        return this.objectFieldValueSeparator;
    }

    public static Separators createDefaultInstance() {
        return new Separators();
    }

    public Separators() {
        this(AbstractJsonLexerKt.COLON, AbstractJsonLexerKt.COMMA, AbstractJsonLexerKt.COMMA);
    }

    public Separators(char c, char c2, char c3) {
        this.objectFieldValueSeparator = c;
        this.objectEntrySeparator = c2;
        this.arrayValueSeparator = c3;
    }

    public Separators withObjectFieldValueSeparator(char c) {
        return this.objectFieldValueSeparator == c ? this : new Separators(c, this.objectEntrySeparator, this.arrayValueSeparator);
    }

    public Separators withObjectEntrySeparator(char c) {
        return this.objectEntrySeparator == c ? this : new Separators(this.objectFieldValueSeparator, c, this.arrayValueSeparator);
    }

    public Separators withArrayValueSeparator(char c) {
        return this.arrayValueSeparator == c ? this : new Separators(this.objectFieldValueSeparator, this.objectEntrySeparator, c);
    }
}
