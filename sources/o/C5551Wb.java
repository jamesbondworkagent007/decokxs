package o;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectReader;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InterfaceC5513Uq;

/* JADX INFO: renamed from: o.Wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5551Wb {
    public final int AEQbTJ;
    public final MatchStrength EZpvd;
    public final ObjectReader[] KWHzl;
    public final MatchStrength OLrzqt;

    public C5551Wb(ObjectReader... objectReaderArr) {
        this(objectReaderArr, MatchStrength.SOLID_MATCH, MatchStrength.WEAK_MATCH, 64);
    }

    public C5551Wb(ObjectReader[] objectReaderArr, MatchStrength matchStrength, MatchStrength matchStrength2, int i) {
        this.KWHzl = objectReaderArr;
        this.OLrzqt = matchStrength;
        this.EZpvd = matchStrength2;
        this.AEQbTJ = i;
    }

    public C5551Wb KWHzl(DeserializationConfig deserializationConfig) {
        int length = this.KWHzl.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i = 0; i < length; i++) {
            objectReaderArr[i] = this.KWHzl[i].with(deserializationConfig);
        }
        return new C5551Wb(objectReaderArr, this.OLrzqt, this.EZpvd, this.AEQbTJ);
    }

    public C5551Wb OLrzqt(JavaType javaType) {
        int length = this.KWHzl.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i = 0; i < length; i++) {
            objectReaderArr[i] = this.KWHzl[i].forType(javaType);
        }
        return new C5551Wb(objectReaderArr, this.OLrzqt, this.EZpvd, this.AEQbTJ);
    }

    public ActionBar copydefault(java.io.InputStream inputStream) throws java.io.IOException {
        return EZpvd(new StateListAnimator(inputStream, new byte[this.AEQbTJ]));
    }

    public ActionBar copydefault(byte[] bArr, int i, int i2) throws java.io.IOException {
        return EZpvd(new StateListAnimator(bArr, i, i2));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        ObjectReader[] objectReaderArr = this.KWHzl;
        int length = objectReaderArr.length;
        if (length > 0) {
            sb.append(objectReaderArr[0].getFactory().getFormatName());
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(this.KWHzl[i].getFactory().getFormatName());
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public final ActionBar EZpvd(StateListAnimator stateListAnimator) throws java.io.IOException {
        ObjectReader[] objectReaderArr = this.KWHzl;
        int length = objectReaderArr.length;
        ObjectReader objectReader = null;
        int i = 0;
        MatchStrength matchStrength = null;
        while (true) {
            if (i >= length) {
                break;
            }
            ObjectReader objectReader2 = objectReaderArr[i];
            stateListAnimator.AEQbTJ();
            MatchStrength matchStrengthHasFormat = objectReader2.getFactory().hasFormat(stateListAnimator);
            if (matchStrengthHasFormat != null && matchStrengthHasFormat.ordinal() >= this.EZpvd.ordinal() && (objectReader == null || matchStrength.ordinal() < matchStrengthHasFormat.ordinal())) {
                if (matchStrengthHasFormat.ordinal() >= this.OLrzqt.ordinal()) {
                    objectReader = objectReader2;
                    matchStrength = matchStrengthHasFormat;
                    break;
                }
                objectReader = objectReader2;
                matchStrength = matchStrengthHasFormat;
            }
            i++;
        }
        return stateListAnimator.AEQbTJ(objectReader, matchStrength);
    }

    /* JADX INFO: renamed from: o.Wb$StateListAnimator */
    public static class StateListAnimator extends InterfaceC5513Uq.TaskDescription {
        public StateListAnimator(java.io.InputStream inputStream, byte[] bArr) {
            super(inputStream, bArr);
        }

        public StateListAnimator(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
        }

        public ActionBar AEQbTJ(ObjectReader objectReader, MatchStrength matchStrength) {
            java.io.InputStream inputStream = this.OLrzqt;
            byte[] bArr = this.KWHzl;
            int i = this.EZpvd;
            return new ActionBar(inputStream, bArr, i, this.copydefault - i, objectReader, matchStrength);
        }
    }

    /* JADX INFO: renamed from: o.Wb$ActionBar */
    public static class ActionBar {
        public final byte[] AEQbTJ;
        public final MatchStrength EZpvd;
        public final int KWHzl;
        public final ObjectReader OLrzqt;
        public final int copydefault;
        public final java.io.InputStream djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ObjectReader KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean OLrzqt() {
            return this.OLrzqt != null;
        }

        public ActionBar(java.io.InputStream inputStream, byte[] bArr, int i, int i2, ObjectReader objectReader, MatchStrength matchStrength) {
            this.djBIcL = inputStream;
            this.AEQbTJ = bArr;
            this.KWHzl = i;
            this.copydefault = i2;
            this.OLrzqt = objectReader;
            this.EZpvd = matchStrength;
        }

        public JsonParser copydefault() throws java.io.IOException {
            ObjectReader objectReader = this.OLrzqt;
            if (objectReader == null) {
                return null;
            }
            JsonFactory factory = objectReader.getFactory();
            if (this.djBIcL == null) {
                return factory.createParser(this.AEQbTJ, this.KWHzl, this.copydefault);
            }
            return factory.createParser(AEQbTJ());
        }

        public java.io.InputStream AEQbTJ() {
            if (this.djBIcL == null) {
                return new java.io.ByteArrayInputStream(this.AEQbTJ, this.KWHzl, this.copydefault);
            }
            return new UA(null, this.djBIcL, this.AEQbTJ, this.KWHzl, this.copydefault);
        }
    }
}
