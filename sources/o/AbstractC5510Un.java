package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.math.BigDecimal;
import okio.Utf8;

/* JADX INFO: renamed from: o.Un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC5510Un extends JsonGenerator {
    public static final int OLrzqt = (JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask()) | JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
    public boolean AYXKKw;
    public int AhwBna;
    public UX djBIcL;
    public boolean gEmmrt;
    public AbstractC5505Ui valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.gEmmrt = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int gEmmrt() {
        return this.AhwBna;
    }

    public abstract void gEmmrt(java.lang.String str) throws java.io.IOException;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.fasterxml.jackson.core.JsonGenerator
    public AbstractC5503Ug valueOf() {
        return this.djBIcL;
    }

    public AbstractC5510Un(int i, AbstractC5505Ui abstractC5505Ui) {
        this.AhwBna = i;
        this.valueOf = abstractC5505Ui;
        this.djBIcL = UX.EZpvd(JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? UV.copydefault(this) : null);
        this.AYXKKw = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void KWHzl(java.lang.Object obj) {
        UX ux = this.djBIcL;
        if (ux != null) {
            ux.copydefault(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final boolean OLrzqt(JsonGenerator.Feature feature) {
        return (feature.getMask() & this.AhwBna) != 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator KWHzl(JsonGenerator.Feature feature) {
        int mask = feature.getMask();
        this.AhwBna &= ~mask;
        if ((mask & OLrzqt) != 0) {
            if (feature == JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS) {
                this.AYXKKw = false;
            } else if (feature == JsonGenerator.Feature.ESCAPE_NON_ASCII) {
                EZpvd(0);
            } else if (feature == JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION) {
                this.djBIcL = this.djBIcL.copydefault((UV) null);
            }
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    @java.lang.Deprecated
    public JsonGenerator AEQbTJ(int i) {
        int i2 = this.AhwBna ^ i;
        this.AhwBna = i;
        if (i2 != 0) {
            KWHzl(i, i2);
        }
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator AEQbTJ(int i, int i2) {
        int i3 = this.AhwBna;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this.AhwBna = i4;
            KWHzl(i4, i5);
        }
        return this;
    }

    public void KWHzl(int i, int i2) {
        if ((OLrzqt & i2) == 0) {
            return;
        }
        this.AYXKKw = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
        JsonGenerator.Feature feature = JsonGenerator.Feature.ESCAPE_NON_ASCII;
        if (feature.enabledIn(i2)) {
            if (feature.enabledIn(i)) {
                EZpvd(127);
            } else {
                EZpvd(0);
            }
        }
        JsonGenerator.Feature feature2 = JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION;
        if (feature2.enabledIn(i2)) {
            if (feature2.enabledIn(i)) {
                if (this.djBIcL.fARcdN() == null) {
                    this.djBIcL = this.djBIcL.copydefault(UV.copydefault(this));
                    return;
                }
                return;
            }
            this.djBIcL = this.djBIcL.copydefault((UV) null);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public JsonGenerator AhwBna() {
        return djBIcL() != null ? this : EZpvd(ejfBZ());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AYXKKw(java.lang.Object obj) throws java.io.IOException {
        AkhnZx();
        if (obj != null) {
            KWHzl(obj);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copydefault(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        KWHzl(interfaceC5501Ue.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        AhwBna(interfaceC5501Ue.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AYXKKw(java.lang.String str) throws java.io.IOException {
        gEmmrt("write raw value");
        copydefault(str);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AEQbTJ(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        gEmmrt("write raw value");
        OLrzqt(interfaceC5501Ue);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int KWHzl(Base64Variant base64Variant, java.io.InputStream inputStream, int i) throws java.io.IOException {
        copydefault();
        return 0;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(java.lang.Object obj) throws java.io.IOException {
        if (obj == null) {
            isConnected();
            return;
        }
        AbstractC5505Ui abstractC5505Ui = this.valueOf;
        if (abstractC5505Ui != null) {
            abstractC5505Ui.writeValue(this, obj);
        } else {
            OLrzqt(obj);
        }
    }

    public InterfaceC5504Uh ejfBZ() {
        return new DefaultPrettyPrinter();
    }

    public java.lang.String KWHzl(BigDecimal bigDecimal) throws java.io.IOException {
        if (JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this.AhwBna)) {
            int iScale = bigDecimal.scale();
            if (iScale < -9999 || iScale > 9999) {
                AEQbTJ(java.lang.String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", java.lang.Integer.valueOf(iScale), 9999, 9999));
            }
            return bigDecimal.toPlainString();
        }
        return bigDecimal.toString();
    }

    public final int EZpvd(int i, int i2) throws java.io.IOException {
        if (i2 < 56320 || i2 > 57343) {
            AEQbTJ(java.lang.String.format("Incomplete surrogate pair: first char 0x%04X, second 0x%04X", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
        return ((i - 55296) << 10) + 65536 + (i2 - Utf8.LOG_SURROGATE_HEADER);
    }

    public void OLrzqt(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (bArr == null) {
            AEQbTJ("Invalid `byte[]` argument: `null`");
        }
        int length = bArr.length;
        int i3 = i + i2;
        if ((i3 | i | i2 | (length - i3)) < 0) {
            AEQbTJ(java.lang.String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(length)));
        }
    }

    public void copydefault(char[] cArr, int i, int i2) throws java.io.IOException {
        if (cArr == null) {
            AEQbTJ("Invalid `char[]` argument: `null`");
        }
        int length = cArr.length;
        int i3 = i + i2;
        if ((i3 | i | i2 | (length - i3)) < 0) {
            AEQbTJ(java.lang.String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(length)));
        }
    }

    public void KWHzl(java.lang.String str, int i, int i2) throws java.io.IOException {
        if (str == null) {
            AEQbTJ("Invalid `String` argument: `null`");
        }
        int length = str.length();
        int i3 = i + i2;
        if ((i3 | i | i2 | (length - i3)) < 0) {
            AEQbTJ(java.lang.String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `String` of length %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(length)));
        }
    }
}
