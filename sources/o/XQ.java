package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.BinaryNode;
import com.fasterxml.jackson.databind.node.NumericNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TextNode;
import java.math.BigDecimal;
import o.XP;

/* JADX INFO: loaded from: classes21.dex */
public class XQ extends AbstractC5514Ur {
    public AbstractC5505Ui AYXKKw;
    public boolean KWHzl;
    public XP OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser
    public C5541Vr<StreamReadCapability> AubY() {
        return JsonParser.AEQbTJ;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean DTwDnp() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.KWHzl) {
            return;
        }
        this.KWHzl = true;
        this.OLrzqt = null;
        this.QVAiDq = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser
    public AbstractC5505Ui values() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser
    public AbstractC5503Ug wlaJM() {
        return this.OLrzqt;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int zuBGHE() throws java.io.IOException {
        return 0;
    }

    public XQ(JsonNode jsonNode) {
        this(jsonNode, null);
    }

    public XQ(JsonNode jsonNode, AbstractC5505Ui abstractC5505Ui) {
        super(0);
        this.AYXKKw = abstractC5505Ui;
        this.OLrzqt = new XP.ActionBar(jsonNode, null);
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.JsonToken RcXXUw() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonTokenAkhnZx = this.OLrzqt.AkhnZx();
        this.QVAiDq = jsonTokenAkhnZx;
        if (jsonTokenAkhnZx == null) {
            this.KWHzl = true;
            return null;
        }
        int i = AnonymousClass4.EZpvd[jsonTokenAkhnZx.ordinal()];
        if (i == 1) {
            this.OLrzqt = this.OLrzqt.fARcdN();
        } else if (i == 2) {
            this.OLrzqt = this.OLrzqt.AuCTel();
        } else if (i == 3 || i == 4) {
            this.OLrzqt = this.OLrzqt.AEQbTJ();
        }
        return this.QVAiDq;
    }

    /* JADX INFO: renamed from: o.XQ$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        public static final /* synthetic */ int[] EZpvd;

        static {
            int[] iArr = new int[com.fasterxml.jackson.core.JsonToken.values().length];
            EZpvd = iArr;
            try {
                iArr[com.fasterxml.jackson.core.JsonToken.START_OBJECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.START_ARRAY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.END_OBJECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.END_ARRAY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.FIELD_NAME.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.VALUE_STRING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                EZpvd[com.fasterxml.jackson.core.JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
        }
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public JsonParser UeEOUB() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.START_OBJECT) {
            this.OLrzqt = this.OLrzqt.AEQbTJ();
            this.QVAiDq = com.fasterxml.jackson.core.JsonToken.END_OBJECT;
        } else if (jsonToken == com.fasterxml.jackson.core.JsonToken.START_ARRAY) {
            this.OLrzqt = this.OLrzqt.AEQbTJ();
            this.QVAiDq = com.fasterxml.jackson.core.JsonToken.END_ARRAY;
        }
        return this;
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public java.lang.String isConnected() {
        XP xpAEQbTJ = this.OLrzqt;
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.START_OBJECT || jsonToken == com.fasterxml.jackson.core.JsonToken.START_ARRAY) {
            xpAEQbTJ = xpAEQbTJ.AEQbTJ();
        }
        if (xpAEQbTJ == null) {
            return null;
        }
        return xpAEQbTJ.copydefault();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation gHZMYf() {
        return JsonLocation.NA;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation fetchVPNInfo() {
        return JsonLocation.NA;
    }

    @Override // o.AbstractC5514Ur, com.fasterxml.jackson.core.JsonParser
    public java.lang.String zLjUOn() {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == null) {
            return null;
        }
        switch (AnonymousClass4.EZpvd[jsonToken.ordinal()]) {
            case 5:
                return this.OLrzqt.copydefault();
            case 6:
                return djSkpj().textValue();
            case 7:
            case 8:
                return java.lang.String.valueOf(djSkpj().numberValue());
            case 9:
                JsonNode jsonNodeDjSkpj = djSkpj();
                if (jsonNodeDjSkpj != null && jsonNodeDjSkpj.isBinary()) {
                    return jsonNodeDjSkpj.asText();
                }
                break;
        }
        return this.QVAiDq.asString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public char[] sSMYrx() throws java.io.IOException {
        return zLjUOn().toCharArray();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int AwvSrB() throws java.io.IOException {
        return zLjUOn().length();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser.NumberType uzCIH() throws java.io.IOException {
        JsonNode jsonNodeFZBcTu = fZBcTu();
        if (jsonNodeFZBcTu == null) {
            return null;
        }
        return jsonNodeFZBcTu.numberType();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public java.math.BigInteger gEmmrt() throws java.io.IOException {
        return fZBcTu().bigIntegerValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public BigDecimal fJNWhG() throws java.io.IOException {
        return fZBcTu().decimalValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double fARcdN() throws java.io.IOException {
        return fZBcTu().doubleValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public float ejfBZ() throws java.io.IOException {
        return (float) fZBcTu().doubleValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getFieldNames() throws java.io.IOException {
        NumericNode numericNode = (NumericNode) fZBcTu();
        if (!numericNode.canConvertToInt()) {
            DXXBbs();
        }
        return numericNode.intValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getNewProxyInstance() throws java.io.IOException {
        NumericNode numericNode = (NumericNode) fZBcTu();
        if (!numericNode.canConvertToLong()) {
            getPostValueLengthLimit();
        }
        return numericNode.longValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public java.lang.Number hDKMBd() throws java.io.IOException {
        return fZBcTu().numberValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public java.lang.Object AuCTel() {
        JsonNode jsonNodeDjSkpj;
        if (this.KWHzl || (jsonNodeDjSkpj = djSkpj()) == null) {
            return null;
        }
        if (jsonNodeDjSkpj.isPojo()) {
            return ((POJONode) jsonNodeDjSkpj).getPojo();
        }
        if (jsonNodeDjSkpj.isBinary()) {
            return ((BinaryNode) jsonNodeDjSkpj).binaryValue();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean QfsBiF() {
        if (this.KWHzl) {
            return false;
        }
        JsonNode jsonNodeDjSkpj = djSkpj();
        if (jsonNodeDjSkpj instanceof NumericNode) {
            return ((NumericNode) jsonNodeDjSkpj).isNaN();
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] copydefault(Base64Variant base64Variant) throws java.io.IOException {
        JsonNode jsonNodeDjSkpj = djSkpj();
        if (jsonNodeDjSkpj == null) {
            return null;
        }
        if (jsonNodeDjSkpj instanceof TextNode) {
            return ((TextNode) jsonNodeDjSkpj).getBinaryValue(base64Variant);
        }
        return jsonNodeDjSkpj.binaryValue();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int KWHzl(Base64Variant base64Variant, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArrCopydefault = copydefault(base64Variant);
        if (bArrCopydefault == null) {
            return 0;
        }
        outputStream.write(bArrCopydefault, 0, bArrCopydefault.length);
        return bArrCopydefault.length;
    }

    public JsonNode djSkpj() {
        XP xp;
        if (this.KWHzl || (xp = this.OLrzqt) == null) {
            return null;
        }
        return xp.values();
    }

    public JsonNode fZBcTu() throws JacksonException {
        JsonNode jsonNodeDjSkpj = djSkpj();
        if (jsonNodeDjSkpj != null && jsonNodeDjSkpj.isNumber()) {
            return jsonNodeDjSkpj;
        }
        throw EZpvd("Current token (" + (jsonNodeDjSkpj == null ? null : jsonNodeDjSkpj.asToken()) + ") not numeric, cannot use numeric value accessors");
    }

    @Override // o.AbstractC5514Ur
    public void gGvvIC() {
        DarRvM();
    }
}
