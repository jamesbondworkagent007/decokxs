package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.io.JsonEOFException;
import java.math.BigDecimal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.Ur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5514Ur extends JsonParser {
    public static final BigDecimal AwvSrB;
    public static final java.math.BigInteger DTwDnp;
    public static final java.math.BigInteger ORxRYg;
    public static final java.math.BigInteger OcIXYQ;
    public static final BigDecimal QKVWgx;
    public static final BigDecimal QOLQEE;
    public static final java.math.BigInteger QbewEr;
    public static final BigDecimal zuBGHE;
    public com.fasterxml.jackson.core.JsonToken QVAiDq;
    public com.fasterxml.jackson.core.JsonToken QfsBiF;
    public static final byte[] QUSxYX = new byte[0];
    public static final int[] RJOkX = new int[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.JsonToken DbNXlk() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser
    public void OLrzqt() {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken != null) {
            this.QfsBiF = jsonToken;
            this.QVAiDq = null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean QOLQEE() {
        return this.QVAiDq != null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract com.fasterxml.jackson.core.JsonToken RcXXUw() throws java.io.IOException;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean copydefault(com.fasterxml.jackson.core.JsonToken jsonToken) {
        return this.QVAiDq == jsonToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonParser
    public com.fasterxml.jackson.core.JsonToken djBIcL() {
        return this.QVAiDq;
    }

    public abstract void gGvvIC() throws JsonParseException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract java.lang.String isConnected() throws java.io.IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract java.lang.String zLjUOn() throws java.io.IOException;

    static {
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(-2147483648L);
        DTwDnp = bigIntegerValueOf;
        java.math.BigInteger bigIntegerValueOf2 = java.math.BigInteger.valueOf(2147483647L);
        ORxRYg = bigIntegerValueOf2;
        java.math.BigInteger bigIntegerValueOf3 = java.math.BigInteger.valueOf(Long.MIN_VALUE);
        QbewEr = bigIntegerValueOf3;
        java.math.BigInteger bigIntegerValueOf4 = java.math.BigInteger.valueOf(Long.MAX_VALUE);
        OcIXYQ = bigIntegerValueOf4;
        QKVWgx = new BigDecimal(bigIntegerValueOf3);
        zuBGHE = new BigDecimal(bigIntegerValueOf4);
        QOLQEE = new BigDecimal(bigIntegerValueOf);
        AwvSrB = new BigDecimal(bigIntegerValueOf2);
    }

    public AbstractC5514Ur() {
    }

    public AbstractC5514Ur(int i) {
        super(i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int valueOf() {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @java.lang.Deprecated
    public int fIwbmz() {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.id();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean OLrzqt(int i) {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        return jsonToken == null ? i == 0 : jsonToken.id() == i;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean RJOkX() {
        return this.QVAiDq == com.fasterxml.jackson.core.JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean QVAiDq() {
        return this.QVAiDq == com.fasterxml.jackson.core.JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean QUSxYX() {
        return this.QVAiDq == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser UeEOUB() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken != com.fasterxml.jackson.core.JsonToken.START_OBJECT && jsonToken != com.fasterxml.jackson.core.JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            com.fasterxml.jackson.core.JsonToken jsonTokenRcXXUw = RcXXUw();
            if (jsonTokenRcXXUw == null) {
                gGvvIC();
                return this;
            }
            if (jsonTokenRcXXUw.isStructStart()) {
                i++;
            } else if (jsonTokenRcXXUw.isStructEnd()) {
                i--;
                if (i == 0) {
                    return this;
                }
            } else if (jsonTokenRcXXUw == com.fasterxml.jackson.core.JsonToken.NOT_AVAILABLE) {
                EZpvd("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int OcIXYQ() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT || jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT) {
            return getFieldNames();
        }
        return AEQbTJ(0);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int AEQbTJ(int i) throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT || jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT) {
            return getFieldNames();
        }
        if (jsonToken == null) {
            return i;
        }
        int iId = jsonToken.id();
        if (iId == 6) {
            java.lang.String strZLjUOn = zLjUOn();
            if (OLrzqt(strZLjUOn)) {
                return 0;
            }
            return C5522Uy.AEQbTJ(strZLjUOn, i);
        }
        switch (iId) {
            case 9:
                return 1;
            case 10:
            case 11:
                return 0;
            case 12:
                java.lang.Object objAuCTel = AuCTel();
                return objAuCTel instanceof java.lang.Number ? ((java.lang.Number) objAuCTel).intValue() : i;
            default:
                return i;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long ORxRYg() throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT || jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT) {
            return getNewProxyInstance();
        }
        return AEQbTJ(0L);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long AEQbTJ(long j) throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT || jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT) {
            return getNewProxyInstance();
        }
        if (jsonToken == null) {
            return j;
        }
        int iId = jsonToken.id();
        if (iId == 6) {
            java.lang.String strZLjUOn = zLjUOn();
            if (OLrzqt(strZLjUOn)) {
                return 0L;
            }
            return C5522Uy.copydefault(strZLjUOn, j);
        }
        switch (iId) {
            case 9:
                return 1L;
            case 10:
            case 11:
                return 0L;
            case 12:
                java.lang.Object objAuCTel = AuCTel();
                return objAuCTel instanceof java.lang.Number ? ((java.lang.Number) objAuCTel).longValue() : j;
            default:
                return j;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public java.lang.String QKVWgx() throws java.io.IOException {
        return AEQbTJ((java.lang.String) null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public java.lang.String AEQbTJ(java.lang.String str) throws java.io.IOException {
        com.fasterxml.jackson.core.JsonToken jsonToken = this.QVAiDq;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            return zLjUOn();
        }
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.FIELD_NAME) {
            return isConnected();
        }
        return (jsonToken == null || jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) ? str : zLjUOn();
    }

    public void KWHzl(java.lang.String str, C5537Vn c5537Vn, Base64Variant base64Variant) throws java.io.IOException {
        try {
            base64Variant.decode(str, c5537Vn);
        } catch (java.lang.IllegalArgumentException e) {
            valueOf(e.getMessage());
        }
    }

    public boolean OLrzqt(java.lang.String str) {
        return AbstractJsonLexerKt.NULL.equals(str);
    }

    public <T> T AEQbTJ(int i, java.lang.String str) throws JsonParseException {
        java.lang.String str2 = java.lang.String.format("Unexpected character (%s) in numeric value", AYXKKw(i));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        valueOf(str2);
        return null;
    }

    public void AYXKKw(java.lang.String str) throws JsonParseException {
        valueOf("Invalid numeric value: " + str);
    }

    public void DXXBbs() throws java.io.IOException {
        djBIcL(zLjUOn());
    }

    public void djBIcL(java.lang.String str) throws java.io.IOException {
        EZpvd(str, djBIcL());
    }

    public void EZpvd(java.lang.String str, com.fasterxml.jackson.core.JsonToken jsonToken) throws java.io.IOException {
        KWHzl(java.lang.String.format("Numeric value (%s) out of range of int (%d - %s)", KWHzl(str), Integer.MIN_VALUE, Integer.MAX_VALUE), jsonToken, java.lang.Integer.TYPE);
    }

    public void getPostValueLengthLimit() throws java.io.IOException {
        gEmmrt(zLjUOn());
    }

    public void gEmmrt(java.lang.String str) throws java.io.IOException {
        copydefault(str, djBIcL());
    }

    public void copydefault(java.lang.String str, com.fasterxml.jackson.core.JsonToken jsonToken) throws java.io.IOException {
        KWHzl(java.lang.String.format("Numeric value (%s) out of range of long (%d - %s)", KWHzl(str), Long.MIN_VALUE, Long.MAX_VALUE), jsonToken, java.lang.Long.TYPE);
    }

    public void KWHzl(java.lang.String str, com.fasterxml.jackson.core.JsonToken jsonToken, java.lang.Class<?> cls) throws InputCoercionException {
        throw new InputCoercionException(this, str, jsonToken, cls);
    }

    public java.lang.String KWHzl(java.lang.String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return java.lang.String.format("[Integer with %d digits]", java.lang.Integer.valueOf(length));
    }

    public java.lang.String copydefault(java.lang.String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return java.lang.String.format("[number with %d characters]", java.lang.Integer.valueOf(length));
    }

    public void OLrzqt(int i, java.lang.String str) throws JsonParseException {
        if (i < 0) {
            ODWQjV();
        }
        java.lang.String str2 = java.lang.String.format("Unexpected character (%s)", AYXKKw(i));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        valueOf(str2);
    }

    public void ODWQjV() throws JsonParseException {
        OLrzqt(" in " + this.QVAiDq, this.QVAiDq);
    }

    public void EZpvd(com.fasterxml.jackson.core.JsonToken jsonToken) throws JsonParseException {
        java.lang.String str;
        if (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_STRING) {
            str = " in a String value";
        } else {
            str = (jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT || jsonToken == com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value";
        }
        OLrzqt(str, jsonToken);
    }

    public void OLrzqt(java.lang.String str, com.fasterxml.jackson.core.JsonToken jsonToken) throws JsonParseException {
        throw new JsonEOFException(this, jsonToken, "Unexpected end-of-input" + str);
    }

    public void valueOf(int i) throws JsonParseException {
        OLrzqt(i, "Expected space separating root-level values");
    }

    public void djBIcL(int i) throws JsonParseException {
        valueOf("Illegal character (" + AYXKKw((char) i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    public static final java.lang.String AYXKKw(int i) {
        char c = (char) i;
        if (java.lang.Character.isISOControl(c)) {
            return "(CTRL-CHAR, code " + i + ")";
        }
        if (i > 255) {
            return "'" + c + "' (code " + i + " / 0x" + java.lang.Integer.toHexString(i) + ")";
        }
        return "'" + c + "' (code " + i + ")";
    }

    public final void valueOf(java.lang.String str) throws JsonParseException {
        throw EZpvd(str);
    }

    public final void EZpvd(java.lang.String str, java.lang.Object obj) throws JsonParseException {
        throw EZpvd(java.lang.String.format(str, obj));
    }

    public final void EZpvd(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) throws JsonParseException {
        throw EZpvd(java.lang.String.format(str, obj, obj2));
    }

    public final void EZpvd(java.lang.String str, java.lang.Throwable th) throws JsonParseException {
        throw AEQbTJ(str, th);
    }

    public final void DarRvM() {
        C5546Vw.OLrzqt();
    }

    public final JsonParseException AEQbTJ(java.lang.String str, java.lang.Throwable th) {
        return new JsonParseException(this, str, th);
    }
}
