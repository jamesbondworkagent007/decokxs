package com.ibm.icu.impl.number;

import com.ibm.icu.impl.FormattedValueStringBuilderImpl;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.util.ULocale;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.text.AttributedCharacterIterator;
import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;
import o.C7020abU;
import o.C7045acS;
import o.C7167aei;
import o.C7232afu;

/* JADX INFO: loaded from: classes3.dex */
public class LocalizedNumberFormatterAsFormat extends Format {
    private static final long serialVersionUID = 1;
    private final transient C7232afu formatter;
    private final transient ULocale locale;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C7232afu getNumberFormatter() {
        return this.formatter;
    }

    public LocalizedNumberFormatterAsFormat(C7232afu c7232afu, ULocale uLocale) {
        this.formatter = c7232afu;
        this.locale = uLocale;
    }

    @Override // java.text.Format
    public StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (!(obj instanceof Number)) {
            throw new IllegalArgumentException();
        }
        C7167aei c7167aei = new C7167aei((Number) obj);
        C7020abU c7020abU = new C7020abU();
        this.formatter.KWHzl(c7167aei, c7020abU);
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(0);
        if (FormattedValueStringBuilderImpl.KWHzl(c7020abU, fieldPosition) && stringBuffer.length() != 0) {
            fieldPosition.setBeginIndex(fieldPosition.getBeginIndex() + stringBuffer.length());
            fieldPosition.setEndIndex(fieldPosition.getEndIndex() + stringBuffer.length());
        }
        C7045acS.copydefault((CharSequence) c7020abU, stringBuffer);
        return stringBuffer;
    }

    @Override // java.text.Format
    public AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        if (!(obj instanceof Number)) {
            throw new IllegalArgumentException();
        }
        return this.formatter.EZpvd((Number) obj).OLrzqt();
    }

    @Override // java.text.Format
    public Object parseObject(String str, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }

    public int hashCode() {
        return this.formatter.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof LocalizedNumberFormatterAsFormat)) {
            return this.formatter.equals(((LocalizedNumberFormatterAsFormat) obj).getNumberFormatter());
        }
        return false;
    }

    private Object writeReplace() throws ObjectStreamException {
        Proxy proxy = new Proxy();
        proxy.languageTag = this.locale.toLanguageTag();
        proxy.skeleton = this.formatter.EZpvd();
        return proxy;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static class Proxy implements Externalizable {
        private static final long serialVersionUID = 1;
        String languageTag;
        String skeleton;

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(0);
            objectOutput.writeUTF(this.languageTag);
            objectOutput.writeUTF(this.skeleton);
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            objectInput.readByte();
            this.languageTag = objectInput.readUTF();
            this.skeleton = objectInput.readUTF();
        }

        private Object readResolve() throws ObjectStreamException {
            return NumberFormatter.KWHzl(this.skeleton).EZpvd(ULocale.forLanguageTag(this.languageTag)).OLrzqt();
        }
    }
}
