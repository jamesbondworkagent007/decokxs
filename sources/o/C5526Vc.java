package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.google.common.primitives.UnsignedBytes;
import java.math.BigDecimal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.Vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5526Vc extends UW {
    public int AuCTelauCTel;
    public char AubY;
    public InterfaceC5501Ue getFieldNames;
    public char[] hDKMBd;
    public char[] iwGUEr;
    public char[] uzCIH;
    public int wlaJM;
    public final java.io.Writer zLjUOn;
    public int zsXlph;
    public static final char[] getNewProxyInstance = C5521Ux.AEQbTJ(true);
    public static final char[] fIwbmz = C5521Ux.AEQbTJ(false);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final char[] fARcdN() {
        return this.DbNXlk ? getNewProxyInstance : fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final char[] fJNWhG() {
        char[] cArr = {AbstractJsonLexerKt.STRING_ESC, 0, AbstractJsonLexerKt.STRING_ESC, 'u', '0', '0', 0, 0, AbstractJsonLexerKt.STRING_ESC, 'u', 0, 0, 0, 0};
        this.hDKMBd = cArr;
        return cArr;
    }

    public C5526Vc(C5517Ut c5517Ut, int i, AbstractC5505Ui abstractC5505Ui, java.io.Writer writer, char c) {
        super(c5517Ut, i, abstractC5505Ui);
        this.zLjUOn = writer;
        char[] cArrEZpvd = c5517Ut.EZpvd();
        this.uzCIH = cArrEZpvd;
        this.wlaJM = cArrEZpvd.length;
        this.AubY = c;
        if (c != '\"') {
            this.AuCTel = C5521Ux.copydefault(c);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void KWHzl(java.lang.String str) throws java.io.IOException {
        int iCopydefault = this.djBIcL.copydefault(str);
        if (iCopydefault == 4) {
            AEQbTJ("Can not write a field name, expecting a value");
        }
        KWHzl(str, iCopydefault == 1);
    }

    @Override // o.AbstractC5510Un, com.fasterxml.jackson.core.JsonGenerator
    public void copydefault(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        int iCopydefault = this.djBIcL.copydefault(interfaceC5501Ue.getValue());
        if (iCopydefault == 4) {
            AEQbTJ("Can not write a field name, expecting a value");
        }
        KWHzl(interfaceC5501Ue, iCopydefault == 1);
    }

    public final void KWHzl(java.lang.String str, boolean z) throws java.io.IOException {
        if (this.copydefault != null) {
            AEQbTJ(str, z);
            return;
        }
        if (this.zsXlph + 1 >= this.wlaJM) {
            AuCTel();
        }
        if (z) {
            char[] cArr = this.uzCIH;
            int i = this.zsXlph;
            this.zsXlph = i + 1;
            cArr[i] = AbstractJsonLexerKt.COMMA;
        }
        if (this.AkhnZx) {
            isConnected(str);
            return;
        }
        char[] cArr2 = this.uzCIH;
        int i2 = this.zsXlph;
        this.zsXlph = i2 + 1;
        cArr2[i2] = this.AubY;
        isConnected(str);
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr3 = this.uzCIH;
        int i3 = this.zsXlph;
        this.zsXlph = i3 + 1;
        cArr3[i3] = this.AubY;
    }

    public final void KWHzl(InterfaceC5501Ue interfaceC5501Ue, boolean z) throws java.io.IOException {
        if (this.copydefault != null) {
            AEQbTJ(interfaceC5501Ue, z);
            return;
        }
        if (this.zsXlph + 1 >= this.wlaJM) {
            AuCTel();
        }
        if (z) {
            char[] cArr = this.uzCIH;
            int i = this.zsXlph;
            this.zsXlph = i + 1;
            cArr[i] = AbstractJsonLexerKt.COMMA;
        }
        if (this.AkhnZx) {
            char[] cArrAsQuotedChars = interfaceC5501Ue.asQuotedChars();
            AEQbTJ(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        char[] cArr2 = this.uzCIH;
        int i2 = this.zsXlph;
        int i3 = i2 + 1;
        this.zsXlph = i3;
        cArr2[i2] = this.AubY;
        int iAppendQuoted = interfaceC5501Ue.appendQuoted(cArr2, i3);
        if (iAppendQuoted < 0) {
            gEmmrt(interfaceC5501Ue);
            return;
        }
        int i4 = this.zsXlph + iAppendQuoted;
        this.zsXlph = i4;
        if (i4 >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr3 = this.uzCIH;
        int i5 = this.zsXlph;
        this.zsXlph = i5 + 1;
        cArr3[i5] = this.AubY;
    }

    public final void gEmmrt(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        char[] cArrAsQuotedChars = interfaceC5501Ue.asQuotedChars();
        AEQbTJ(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i = this.zsXlph;
        this.zsXlph = i + 1;
        cArr[i] = this.AubY;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void values() throws java.io.IOException {
        gEmmrt("start an array");
        this.djBIcL = this.djBIcL.AkhnZx();
        InterfaceC5504Uh interfaceC5504Uh = this.copydefault;
        if (interfaceC5504Uh != null) {
            interfaceC5504Uh.writeStartArray(this);
            return;
        }
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i = this.zsXlph;
        this.zsXlph = i + 1;
        cArr[i] = AbstractJsonLexerKt.BEGIN_LIST;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void gEmmrt(java.lang.Object obj) throws java.io.IOException {
        gEmmrt("start an array");
        this.djBIcL = this.djBIcL.EZpvd(obj);
        InterfaceC5504Uh interfaceC5504Uh = this.copydefault;
        if (interfaceC5504Uh != null) {
            interfaceC5504Uh.writeStartArray(this);
            return;
        }
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i = this.zsXlph;
        this.zsXlph = i + 1;
        cArr[i] = AbstractJsonLexerKt.BEGIN_LIST;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AEQbTJ(java.lang.Object obj, int i) throws java.io.IOException {
        gEmmrt("start an array");
        this.djBIcL = this.djBIcL.EZpvd(obj);
        InterfaceC5504Uh interfaceC5504Uh = this.copydefault;
        if (interfaceC5504Uh != null) {
            interfaceC5504Uh.writeStartArray(this);
            return;
        }
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i2 = this.zsXlph;
        this.zsXlph = i2 + 1;
        cArr[i2] = AbstractJsonLexerKt.BEGIN_LIST;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void fetchVPNInfo() throws java.io.IOException {
        if (!this.djBIcL.valueOf()) {
            AEQbTJ("Current context not Array but " + this.djBIcL.DbNXlk());
        }
        InterfaceC5504Uh interfaceC5504Uh = this.copydefault;
        if (interfaceC5504Uh != null) {
            interfaceC5504Uh.writeEndArray(this, this.djBIcL.EZpvd());
        } else {
            if (this.zsXlph >= this.wlaJM) {
                AuCTel();
            }
            char[] cArr = this.uzCIH;
            int i = this.zsXlph;
            this.zsXlph = i + 1;
            cArr[i] = AbstractJsonLexerKt.END_LIST;
        }
        this.djBIcL = this.djBIcL.fetchVPNInfo();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AkhnZx() throws java.io.IOException {
        gEmmrt("start an object");
        this.djBIcL = this.djBIcL.values();
        InterfaceC5504Uh interfaceC5504Uh = this.copydefault;
        if (interfaceC5504Uh != null) {
            interfaceC5504Uh.writeStartObject(this);
            return;
        }
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i = this.zsXlph;
        this.zsXlph = i + 1;
        cArr[i] = AbstractJsonLexerKt.BEGIN_OBJ;
    }

    @Override // o.AbstractC5510Un, com.fasterxml.jackson.core.JsonGenerator
    public void AYXKKw(java.lang.Object obj) throws java.io.IOException {
        gEmmrt("start an object");
        this.djBIcL = this.djBIcL.AEQbTJ(obj);
        InterfaceC5504Uh interfaceC5504Uh = this.copydefault;
        if (interfaceC5504Uh != null) {
            interfaceC5504Uh.writeStartObject(this);
            return;
        }
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i = this.zsXlph;
        this.zsXlph = i + 1;
        cArr[i] = AbstractJsonLexerKt.BEGIN_OBJ;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(java.lang.Object obj, int i) throws java.io.IOException {
        AYXKKw(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void DbNXlk() throws java.io.IOException {
        if (!this.djBIcL.djBIcL()) {
            AEQbTJ("Current context not Object but " + this.djBIcL.DbNXlk());
        }
        InterfaceC5504Uh interfaceC5504Uh = this.copydefault;
        if (interfaceC5504Uh != null) {
            interfaceC5504Uh.writeEndObject(this, this.djBIcL.EZpvd());
        } else {
            if (this.zsXlph >= this.wlaJM) {
                AuCTel();
            }
            char[] cArr = this.uzCIH;
            int i = this.zsXlph;
            this.zsXlph = i + 1;
            cArr[i] = AbstractJsonLexerKt.END_OBJ;
        }
        this.djBIcL = this.djBIcL.fetchVPNInfo();
    }

    public final void AEQbTJ(java.lang.String str, boolean z) throws java.io.IOException {
        if (z) {
            this.copydefault.writeObjectEntrySeparator(this);
        } else {
            this.copydefault.beforeObjectEntries(this);
        }
        if (this.AkhnZx) {
            isConnected(str);
            return;
        }
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i = this.zsXlph;
        this.zsXlph = i + 1;
        cArr[i] = this.AubY;
        isConnected(str);
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr2 = this.uzCIH;
        int i2 = this.zsXlph;
        this.zsXlph = i2 + 1;
        cArr2[i2] = this.AubY;
    }

    public final void AEQbTJ(InterfaceC5501Ue interfaceC5501Ue, boolean z) throws java.io.IOException {
        if (z) {
            this.copydefault.writeObjectEntrySeparator(this);
        } else {
            this.copydefault.beforeObjectEntries(this);
        }
        char[] cArrAsQuotedChars = interfaceC5501Ue.asQuotedChars();
        if (this.AkhnZx) {
            AEQbTJ(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
            return;
        }
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i = this.zsXlph;
        this.zsXlph = i + 1;
        cArr[i] = this.AubY;
        AEQbTJ(cArrAsQuotedChars, 0, cArrAsQuotedChars.length);
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr2 = this.uzCIH;
        int i2 = this.zsXlph;
        this.zsXlph = i2 + 1;
        cArr2[i2] = this.AubY;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AhwBna(java.lang.String str) throws java.io.IOException {
        gEmmrt("write a string");
        if (str == null) {
            iwGUEr();
            return;
        }
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i = this.zsXlph;
        this.zsXlph = i + 1;
        cArr[i] = this.AubY;
        isConnected(str);
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr2 = this.uzCIH;
        int i2 = this.zsXlph;
        this.zsXlph = i2 + 1;
        cArr2[i2] = this.AubY;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void KWHzl(char[] cArr, int i, int i2) throws java.io.IOException {
        gEmmrt("write a string");
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr2 = this.uzCIH;
        int i3 = this.zsXlph;
        this.zsXlph = i3 + 1;
        cArr2[i3] = this.AubY;
        EZpvd(cArr, i, i2);
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr3 = this.uzCIH;
        int i4 = this.zsXlph;
        this.zsXlph = i4 + 1;
        cArr3[i4] = this.AubY;
    }

    @Override // o.AbstractC5510Un, com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        gEmmrt("write a string");
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i = this.zsXlph;
        int i2 = i + 1;
        this.zsXlph = i2;
        cArr[i] = this.AubY;
        int iAppendQuoted = interfaceC5501Ue.appendQuoted(cArr, i2);
        if (iAppendQuoted < 0) {
            djBIcL(interfaceC5501Ue);
            return;
        }
        int i3 = this.zsXlph + iAppendQuoted;
        this.zsXlph = i3;
        if (i3 >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr2 = this.uzCIH;
        int i4 = this.zsXlph;
        this.zsXlph = i4 + 1;
        cArr2[i4] = this.AubY;
    }

    public final void djBIcL(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        char[] cArrAsQuotedChars = interfaceC5501Ue.asQuotedChars();
        int length = cArrAsQuotedChars.length;
        if (length < 32) {
            if (length > this.wlaJM - this.zsXlph) {
                AuCTel();
            }
            java.lang.System.arraycopy(cArrAsQuotedChars, 0, this.uzCIH, this.zsXlph, length);
            this.zsXlph += length;
        } else {
            AuCTel();
            this.zLjUOn.write(cArrAsQuotedChars, 0, length);
        }
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i = this.zsXlph;
        this.zsXlph = i + 1;
        cArr[i] = this.AubY;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copydefault(java.lang.String str) throws java.io.IOException {
        int length = str.length();
        int i = this.wlaJM - this.zsXlph;
        if (i == 0) {
            AuCTel();
            i = this.wlaJM - this.zsXlph;
        }
        if (i >= length) {
            str.getChars(0, length, this.uzCIH, this.zsXlph);
            this.zsXlph += length;
        } else {
            DbNXlk(str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void OLrzqt(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        int iAppendUnquoted = interfaceC5501Ue.appendUnquoted(this.uzCIH, this.zsXlph);
        if (iAppendUnquoted < 0) {
            copydefault(interfaceC5501Ue.getValue());
        } else {
            this.zsXlph += iAppendUnquoted;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AEQbTJ(char[] cArr, int i, int i2) throws java.io.IOException {
        copydefault(cArr, i, i2);
        if (i2 < 32) {
            if (i2 > this.wlaJM - this.zsXlph) {
                AuCTel();
            }
            java.lang.System.arraycopy(cArr, i, this.uzCIH, this.zsXlph, i2);
            this.zsXlph += i2;
            return;
        }
        AuCTel();
        this.zLjUOn.write(cArr, i, i2);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copydefault(char c) throws java.io.IOException {
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i = this.zsXlph;
        this.zsXlph = i + 1;
        cArr[i] = c;
    }

    public final void DbNXlk(java.lang.String str) throws java.io.IOException {
        int i = this.wlaJM;
        int i2 = this.zsXlph;
        int i3 = i - i2;
        str.getChars(0, i3, this.uzCIH, i2);
        this.zsXlph += i3;
        AuCTel();
        int length = str.length() - i3;
        while (true) {
            int i4 = this.wlaJM;
            if (length > i4) {
                int i5 = i3 + i4;
                str.getChars(i3, i5, this.uzCIH, 0);
                this.AuCTelauCTel = 0;
                this.zsXlph = i4;
                AuCTel();
                length -= i4;
                i3 = i5;
            } else {
                str.getChars(i3, i3 + length, this.uzCIH, 0);
                this.AuCTelauCTel = 0;
                this.zsXlph = length;
                return;
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws java.io.IOException {
        OLrzqt(bArr, i, i2);
        gEmmrt("write a binary value");
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i3 = this.zsXlph;
        this.zsXlph = i3 + 1;
        cArr[i3] = this.AubY;
        OLrzqt(base64Variant, bArr, i, i2 + i);
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr2 = this.uzCIH;
        int i4 = this.zsXlph;
        this.zsXlph = i4 + 1;
        cArr2[i4] = this.AubY;
    }

    @Override // o.AbstractC5510Un, com.fasterxml.jackson.core.JsonGenerator
    public int KWHzl(Base64Variant base64Variant, java.io.InputStream inputStream, int i) throws java.io.IOException {
        gEmmrt("write a binary value");
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i2 = this.zsXlph;
        this.zsXlph = i2 + 1;
        cArr[i2] = this.AubY;
        byte[] bArrKWHzl = this.fJNWhG.KWHzl();
        try {
            if (i < 0) {
                i = OLrzqt(base64Variant, inputStream, bArrKWHzl);
            } else {
                int iEZpvd = EZpvd(base64Variant, inputStream, bArrKWHzl, i);
                if (iEZpvd > 0) {
                    AEQbTJ("Too few bytes available: missing " + iEZpvd + " bytes (out of " + i + ")");
                }
            }
            this.fJNWhG.AEQbTJ(bArrKWHzl);
            if (this.zsXlph >= this.wlaJM) {
                AuCTel();
            }
            char[] cArr2 = this.uzCIH;
            int i3 = this.zsXlph;
            this.zsXlph = i3 + 1;
            cArr2[i3] = this.AubY;
            return i;
        } catch (java.lang.Throwable th) {
            this.fJNWhG.AEQbTJ(bArrKWHzl);
            throw th;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void OLrzqt(short s) throws java.io.IOException {
        gEmmrt("write a number");
        if (this.AYXKKw) {
            AEQbTJ(s);
            return;
        }
        if (this.zsXlph + 6 >= this.wlaJM) {
            AuCTel();
        }
        this.zsXlph = UB.KWHzl(s, this.uzCIH, this.zsXlph);
    }

    private void AEQbTJ(short s) throws java.io.IOException {
        if (this.zsXlph + 8 >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i = this.zsXlph;
        int i2 = i + 1;
        this.zsXlph = i2;
        cArr[i] = this.AubY;
        int iKWHzl = UB.KWHzl(s, cArr, i2);
        char[] cArr2 = this.uzCIH;
        this.zsXlph = iKWHzl + 1;
        cArr2[iKWHzl] = this.AubY;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copydefault(int i) throws java.io.IOException {
        gEmmrt("write a number");
        if (this.AYXKKw) {
            AhwBna(i);
            return;
        }
        if (this.zsXlph + 11 >= this.wlaJM) {
            AuCTel();
        }
        this.zsXlph = UB.KWHzl(i, this.uzCIH, this.zsXlph);
    }

    private void AhwBna(int i) throws java.io.IOException {
        if (this.zsXlph + 13 >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i2 = this.zsXlph;
        int i3 = i2 + 1;
        this.zsXlph = i3;
        cArr[i2] = this.AubY;
        int iKWHzl = UB.KWHzl(i, cArr, i3);
        char[] cArr2 = this.uzCIH;
        this.zsXlph = iKWHzl + 1;
        cArr2[iKWHzl] = this.AubY;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(long j) throws java.io.IOException {
        gEmmrt("write a number");
        if (this.AYXKKw) {
            KWHzl(j);
            return;
        }
        if (this.zsXlph + 21 >= this.wlaJM) {
            AuCTel();
        }
        this.zsXlph = UB.AEQbTJ(j, this.uzCIH, this.zsXlph);
    }

    private void KWHzl(long j) throws java.io.IOException {
        if (this.zsXlph + 23 >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i = this.zsXlph;
        int i2 = i + 1;
        this.zsXlph = i2;
        cArr[i] = this.AubY;
        int iAEQbTJ = UB.AEQbTJ(j, cArr, i2);
        char[] cArr2 = this.uzCIH;
        this.zsXlph = iAEQbTJ + 1;
        cArr2[iAEQbTJ] = this.AubY;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void KWHzl(java.math.BigInteger bigInteger) throws java.io.IOException {
        gEmmrt("write a number");
        if (bigInteger == null) {
            iwGUEr();
        } else if (this.AYXKKw) {
            AkhnZx(bigInteger.toString());
        } else {
            copydefault(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void KWHzl(double d) throws java.io.IOException {
        if (this.AYXKKw || (UB.KWHzl(d) && OLrzqt(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            AhwBna(UB.EZpvd(d, OLrzqt(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        } else {
            gEmmrt("write a number");
            copydefault(UB.EZpvd(d, OLrzqt(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AEQbTJ(float f) throws java.io.IOException {
        if (this.AYXKKw || (UB.AEQbTJ(f) && OLrzqt(JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS))) {
            AhwBna(UB.copydefault(f, OLrzqt(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        } else {
            gEmmrt("write a number");
            copydefault(UB.copydefault(f, OLrzqt(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void OLrzqt(BigDecimal bigDecimal) throws java.io.IOException {
        gEmmrt("write a number");
        if (bigDecimal == null) {
            iwGUEr();
        } else if (this.AYXKKw) {
            AkhnZx(KWHzl(bigDecimal));
        } else {
            copydefault(KWHzl(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(java.lang.String str) throws java.io.IOException {
        gEmmrt("write a number");
        if (str == null) {
            iwGUEr();
        } else if (this.AYXKKw) {
            AkhnZx(str);
        } else {
            copydefault(str);
        }
    }

    private void AkhnZx(java.lang.String str) throws java.io.IOException {
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i = this.zsXlph;
        this.zsXlph = i + 1;
        cArr[i] = this.AubY;
        copydefault(str);
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr2 = this.uzCIH;
        int i2 = this.zsXlph;
        this.zsXlph = i2 + 1;
        cArr2[i2] = this.AubY;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void OLrzqt(boolean z) throws java.io.IOException {
        int i;
        gEmmrt("write a boolean value");
        if (this.zsXlph + 5 >= this.wlaJM) {
            AuCTel();
        }
        int i2 = this.zsXlph;
        char[] cArr = this.uzCIH;
        if (z) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this.zsXlph = i + 1;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void isConnected() throws java.io.IOException {
        gEmmrt("write a null");
        iwGUEr();
    }

    @Override // o.AbstractC5510Un
    public final void gEmmrt(java.lang.String str) throws java.io.IOException {
        char c;
        int iFIwbmz = this.djBIcL.fIwbmz();
        if (this.copydefault != null) {
            OLrzqt(str, iFIwbmz);
            return;
        }
        if (iFIwbmz == 1) {
            c = AbstractJsonLexerKt.COMMA;
        } else {
            if (iFIwbmz != 2) {
                if (iFIwbmz != 3) {
                    if (iFIwbmz != 5) {
                        return;
                    }
                    valueOf(str);
                    return;
                } else {
                    InterfaceC5501Ue interfaceC5501Ue = this.ejfBZ;
                    if (interfaceC5501Ue != null) {
                        copydefault(interfaceC5501Ue.getValue());
                        return;
                    }
                    return;
                }
            }
            c = AbstractJsonLexerKt.COLON;
        }
        if (this.zsXlph >= this.wlaJM) {
            AuCTel();
        }
        char[] cArr = this.uzCIH;
        int i = this.zsXlph;
        this.zsXlph = i + 1;
        cArr[i] = c;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws java.io.IOException {
        AuCTel();
        if (this.zLjUOn == null || !OLrzqt(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.zLjUOn.flush();
    }

    @Override // o.AbstractC5510Un, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.lang.Throwable {
        super.close();
        try {
            if (this.uzCIH != null && OLrzqt(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
                while (true) {
                    AbstractC5503Ug abstractC5503UgValueOf = valueOf();
                    if (abstractC5503UgValueOf.valueOf()) {
                        fetchVPNInfo();
                    } else if (!abstractC5503UgValueOf.djBIcL()) {
                        break;
                    } else {
                        DbNXlk();
                    }
                }
            }
            AuCTel();
            e = null;
        } catch (java.io.IOException e) {
            e = e;
        }
        this.AuCTelauCTel = 0;
        this.zsXlph = 0;
        if (this.zLjUOn != null) {
            try {
                if (this.fJNWhG.AhwBna() || OLrzqt(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                    this.zLjUOn.close();
                } else if (OLrzqt(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                    this.zLjUOn.flush();
                }
            } catch (java.io.IOException | java.lang.RuntimeException e2) {
                if (e != null) {
                    e2.addSuppressed(e);
                }
                throw e2;
            }
        }
        fIwbmz();
        if (e != null) {
            throw e;
        }
    }

    public void fIwbmz() {
        char[] cArr = this.uzCIH;
        if (cArr != null) {
            this.uzCIH = null;
            this.fJNWhG.KWHzl(cArr);
        }
        char[] cArr2 = this.iwGUEr;
        if (cArr2 != null) {
            this.iwGUEr = null;
            this.fJNWhG.copydefault(cArr2);
        }
    }

    public final void isConnected(java.lang.String str) throws java.io.IOException {
        int length = str.length();
        int i = this.wlaJM;
        if (length > i) {
            djBIcL(str);
            return;
        }
        if (this.zsXlph + length > i) {
            AuCTel();
        }
        str.getChars(0, length, this.uzCIH, this.zsXlph);
        if (this.isConnected != null) {
            AYXKKw(length);
            return;
        }
        int i2 = this.fARcdN;
        if (i2 != 0) {
            valueOf(length, i2);
        } else {
            gEmmrt(length);
        }
    }

    public final void gEmmrt(int i) throws java.io.IOException {
        int i2;
        int i3 = this.zsXlph + i;
        int[] iArr = this.AuCTel;
        int length = iArr.length;
        while (this.zsXlph < i3) {
            do {
                char[] cArr = this.uzCIH;
                int i4 = this.zsXlph;
                char c = cArr[i4];
                if (c >= length || iArr[c] == 0) {
                    i2 = i4 + 1;
                    this.zsXlph = i2;
                } else {
                    int i5 = this.AuCTelauCTel;
                    int i6 = i4 - i5;
                    if (i6 > 0) {
                        this.zLjUOn.write(cArr, i5, i6);
                    }
                    char[] cArr2 = this.uzCIH;
                    int i7 = this.zsXlph;
                    this.zsXlph = i7 + 1;
                    char c2 = cArr2[i7];
                    AEQbTJ(c2, iArr[c2]);
                }
            } while (i2 < i3);
            return;
        }
    }

    public final void djBIcL(java.lang.String str) throws java.io.IOException {
        AuCTel();
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = this.wlaJM;
            if (i + i2 > length) {
                i2 = length - i;
            }
            int i3 = i + i2;
            str.getChars(i, i3, this.uzCIH, 0);
            if (this.isConnected != null) {
                valueOf(i2);
            } else {
                int i4 = this.fARcdN;
                if (i4 != 0) {
                    OLrzqt(i2, i4);
                } else {
                    OLrzqt(i2);
                }
            }
            if (i3 >= length) {
                return;
            } else {
                i = i3;
            }
        }
    }

    public final void OLrzqt(int i) throws java.io.IOException {
        char[] cArr;
        char c;
        int[] iArr = this.AuCTel;
        int length = iArr.length;
        int i2 = 0;
        int iOLrzqt = 0;
        while (i2 < i) {
            do {
                cArr = this.uzCIH;
                c = cArr[i2];
                if (c < length && iArr[c] != 0) {
                    break;
                } else {
                    i2++;
                }
            } while (i2 < i);
            int i3 = i2 - iOLrzqt;
            if (i3 > 0) {
                this.zLjUOn.write(cArr, iOLrzqt, i3);
                if (i2 >= i) {
                    return;
                }
            }
            i2++;
            iOLrzqt = OLrzqt(this.uzCIH, i2, i, c, iArr[c]);
        }
    }

    public final void EZpvd(char[] cArr, int i, int i2) throws java.io.IOException {
        if (this.isConnected != null) {
            OLrzqt(cArr, i, i2);
            return;
        }
        int i3 = this.fARcdN;
        if (i3 != 0) {
            KWHzl(cArr, i, i2, i3);
            return;
        }
        int i4 = i2 + i;
        int[] iArr = this.AuCTel;
        int length = iArr.length;
        while (i < i4) {
            int i5 = i;
            do {
                char c = cArr[i5];
                if (c < length && iArr[c] != 0) {
                    break;
                } else {
                    i5++;
                }
            } while (i5 < i4);
            int i6 = i5 - i;
            if (i6 < 32) {
                if (this.zsXlph + i6 > this.wlaJM) {
                    AuCTel();
                }
                if (i6 > 0) {
                    java.lang.System.arraycopy(cArr, i, this.uzCIH, this.zsXlph, i6);
                    this.zsXlph += i6;
                }
            } else {
                AuCTel();
                this.zLjUOn.write(cArr, i, i6);
            }
            if (i5 >= i4) {
                return;
            }
            i = i5 + 1;
            char c2 = cArr[i5];
            KWHzl(c2, iArr[c2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf(int i, int i2) throws java.io.IOException {
        int i3;
        int i4;
        int i5;
        int i6 = this.zsXlph + i;
        int[] iArr = this.AuCTel;
        int iMin = java.lang.Math.min(iArr.length, i2 + 1);
        while (this.zsXlph < i6) {
            do {
                char[] cArr = this.uzCIH;
                int i7 = this.zsXlph;
                char c = cArr[i7];
                if (c < iMin) {
                    i3 = iArr[c];
                    if (i3 != 0) {
                        int i8 = this.AuCTelauCTel;
                        i4 = i7 - i8;
                        if (i4 <= 0) {
                            this.zLjUOn.write(cArr, i8, i4);
                        }
                        this.zsXlph++;
                        AEQbTJ(c, i3);
                    }
                    i5 = i7 + 1;
                    this.zsXlph = i5;
                } else {
                    if (c > i2) {
                        i3 = -1;
                        int i82 = this.AuCTelauCTel;
                        i4 = i7 - i82;
                        if (i4 <= 0) {
                        }
                        this.zsXlph++;
                        AEQbTJ(c, i3);
                    }
                    i5 = i7 + 1;
                    this.zsXlph = i5;
                }
            } while (i5 < i6);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d A[PHI: r3
  0x001d: PHI (r3v5 int) = (r3v2 int), (r3v6 int) binds: [B:9:0x0019, B:7:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(int i, int i2) throws java.io.IOException {
        char[] cArr;
        char c;
        int[] iArr = this.AuCTel;
        int iMin = java.lang.Math.min(iArr.length, i2 + 1);
        int i3 = 0;
        int i4 = 0;
        int iOLrzqt = 0;
        while (i3 < i) {
            while (true) {
                cArr = this.uzCIH;
                c = cArr[i3];
                if (c < iMin) {
                    i4 = iArr[c];
                    if (i4 != 0) {
                        break;
                    }
                    i3++;
                    if (i3 >= i) {
                        break;
                    }
                } else if (c > i2) {
                    i4 = -1;
                    break;
                }
            }
            int i5 = i3 - iOLrzqt;
            if (i5 > 0) {
                this.zLjUOn.write(cArr, iOLrzqt, i5);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            iOLrzqt = OLrzqt(this.uzCIH, i3, i, c, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[PHI: r2
  0x001b: PHI (r2v6 int) = (r2v3 int), (r2v7 int) binds: [B:10:0x0017, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(char[] cArr, int i, int i2, int i3) throws java.io.IOException {
        char c;
        int i4 = i2 + i;
        int[] iArr = this.AuCTel;
        int iMin = java.lang.Math.min(iArr.length, i3 + 1);
        int i5 = 0;
        while (i < i4) {
            int i6 = i;
            while (true) {
                c = cArr[i6];
                if (c < iMin) {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                    i6++;
                    if (i6 >= i4) {
                        break;
                    }
                } else if (c > i3) {
                    i5 = -1;
                    break;
                }
            }
            int i7 = i6 - i;
            if (i7 < 32) {
                if (this.zsXlph + i7 > this.wlaJM) {
                    AuCTel();
                }
                if (i7 > 0) {
                    java.lang.System.arraycopy(cArr, i, this.uzCIH, this.zsXlph, i7);
                    this.zsXlph += i7;
                }
            } else {
                AuCTel();
                this.zLjUOn.write(cArr, i, i7);
            }
            if (i6 >= i4) {
                return;
            }
            i = i6 + 1;
            KWHzl(c, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AYXKKw(int i) throws java.io.IOException {
        int i2;
        int i3;
        int i4;
        int i5 = this.zsXlph + i;
        int[] iArr = this.AuCTel;
        int i6 = this.fARcdN;
        if (i6 < 1) {
            i6 = 65535;
        }
        int iMin = java.lang.Math.min(iArr.length, i6 + 1);
        CharacterEscapes characterEscapes = this.isConnected;
        while (this.zsXlph < i5) {
            do {
                char c = this.uzCIH[this.zsXlph];
                if (c < iMin) {
                    i2 = iArr[c];
                    if (i2 != 0) {
                        int i7 = this.zsXlph;
                        int i8 = this.AuCTelauCTel;
                        i3 = i7 - i8;
                        if (i3 <= 0) {
                            this.zLjUOn.write(this.uzCIH, i8, i3);
                        }
                        this.zsXlph++;
                        AEQbTJ(c, i2);
                    }
                    i4 = this.zsXlph + 1;
                    this.zsXlph = i4;
                } else {
                    if (c > i6) {
                        i2 = -1;
                    } else {
                        InterfaceC5501Ue escapeSequence = characterEscapes.getEscapeSequence(c);
                        this.getFieldNames = escapeSequence;
                        if (escapeSequence != null) {
                            i2 = -2;
                        }
                        i4 = this.zsXlph + 1;
                        this.zsXlph = i4;
                    }
                    int i72 = this.zsXlph;
                    int i82 = this.AuCTelauCTel;
                    i3 = i72 - i82;
                    if (i3 <= 0) {
                    }
                    this.zsXlph++;
                    AEQbTJ(c, i2);
                }
            } while (i4 < i5);
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[PHI: r5
  0x0031: PHI (r5v6 int) = (r5v2 int), (r5v7 int) binds: [B:15:0x002d, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf(int i) throws java.io.IOException {
        char c;
        int[] iArr = this.AuCTel;
        int i2 = this.fARcdN;
        if (i2 < 1) {
            i2 = 65535;
        }
        int iMin = java.lang.Math.min(iArr.length, i2 + 1);
        CharacterEscapes characterEscapes = this.isConnected;
        int i3 = 0;
        int i4 = 0;
        int iOLrzqt = 0;
        while (i3 < i) {
            while (true) {
                c = this.uzCIH[i3];
                if (c < iMin) {
                    i4 = iArr[c];
                    if (i4 != 0) {
                        break;
                    }
                    i3++;
                    if (i3 >= i) {
                        break;
                    }
                } else {
                    if (c > i2) {
                        i4 = -1;
                        break;
                    }
                    InterfaceC5501Ue escapeSequence = characterEscapes.getEscapeSequence(c);
                    this.getFieldNames = escapeSequence;
                    if (escapeSequence != null) {
                        i4 = -2;
                        break;
                    }
                }
            }
            int i5 = i3 - iOLrzqt;
            if (i5 > 0) {
                this.zLjUOn.write(this.uzCIH, iOLrzqt, i5);
                if (i3 >= i) {
                    return;
                }
            }
            i3++;
            iOLrzqt = OLrzqt(this.uzCIH, i3, i, c, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[PHI: r4
  0x002f: PHI (r4v6 int) = (r4v2 int), (r4v7 int) binds: [B:16:0x002b, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(char[] cArr, int i, int i2) throws java.io.IOException {
        char c;
        int i3 = i2 + i;
        int[] iArr = this.AuCTel;
        int i4 = this.fARcdN;
        if (i4 < 1) {
            i4 = 65535;
        }
        int iMin = java.lang.Math.min(iArr.length, i4 + 1);
        CharacterEscapes characterEscapes = this.isConnected;
        int i5 = 0;
        while (i < i3) {
            int i6 = i;
            while (true) {
                c = cArr[i6];
                if (c < iMin) {
                    i5 = iArr[c];
                    if (i5 != 0) {
                        break;
                    }
                    i6++;
                    if (i6 >= i3) {
                        break;
                    }
                } else {
                    if (c > i4) {
                        i5 = -1;
                        break;
                    }
                    InterfaceC5501Ue escapeSequence = characterEscapes.getEscapeSequence(c);
                    this.getFieldNames = escapeSequence;
                    if (escapeSequence != null) {
                        i5 = -2;
                        break;
                    }
                }
            }
            int i7 = i6 - i;
            if (i7 < 32) {
                if (this.zsXlph + i7 > this.wlaJM) {
                    AuCTel();
                }
                if (i7 > 0) {
                    java.lang.System.arraycopy(cArr, i, this.uzCIH, this.zsXlph, i7);
                    this.zsXlph += i7;
                }
            } else {
                AuCTel();
                this.zLjUOn.write(cArr, i, i7);
            }
            if (i6 >= i3) {
                return;
            }
            i = i6 + 1;
            KWHzl(c, i5);
        }
    }

    public final void OLrzqt(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3;
        int iEncodeBase64Chunk;
        int i4 = this.wlaJM - 6;
        int maxLineLength = base64Variant.getMaxLineLength();
        loop0: while (true) {
            int i5 = maxLineLength >> 2;
            while (i <= i2 - 3) {
                if (this.zsXlph > i4) {
                    AuCTel();
                }
                byte b = bArr[i];
                byte b2 = bArr[i + 1];
                i3 = i + 3;
                iEncodeBase64Chunk = base64Variant.encodeBase64Chunk((bArr[i + 2] & UnsignedBytes.MAX_VALUE) | (((b << 8) | (b2 & UnsignedBytes.MAX_VALUE)) << 8), this.uzCIH, this.zsXlph);
                this.zsXlph = iEncodeBase64Chunk;
                i5--;
                if (i5 <= 0) {
                    break;
                } else {
                    i = i3;
                }
            }
            char[] cArr = this.uzCIH;
            cArr[iEncodeBase64Chunk] = AbstractJsonLexerKt.STRING_ESC;
            this.zsXlph = iEncodeBase64Chunk + 2;
            cArr[iEncodeBase64Chunk + 1] = 'n';
            maxLineLength = base64Variant.getMaxLineLength();
            i = i3;
        }
        int i6 = i2 - i;
        if (i6 > 0) {
            if (this.zsXlph > i4) {
                AuCTel();
            }
            int i7 = bArr[i] << 16;
            if (i6 == 2) {
                i7 |= (bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8;
            }
            this.zsXlph = base64Variant.encodeBase64Partial(i7, i6, this.uzCIH, this.zsXlph);
        }
    }

    public final int EZpvd(Base64Variant base64Variant, java.io.InputStream inputStream, byte[] bArr, int i) throws java.io.IOException {
        int iEZpvd;
        int i2 = this.wlaJM - 6;
        int i3 = 2;
        int i4 = -3;
        int i5 = i;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i6 = 0;
        int iEZpvd2 = 0;
        while (true) {
            if (i5 <= 2) {
                break;
            }
            if (i6 > i4) {
                iEZpvd2 = EZpvd(inputStream, bArr, i6, iEZpvd2, i5);
                if (iEZpvd2 < 3) {
                    i6 = 0;
                    break;
                }
                i4 = iEZpvd2 - 3;
                i6 = 0;
            }
            if (this.zsXlph > i2) {
                AuCTel();
            }
            int i7 = i6 + 3;
            i5 -= 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i6] << 8) | (bArr[i6 + 1] & UnsignedBytes.MAX_VALUE)) << 8) | (bArr[i6 + 2] & UnsignedBytes.MAX_VALUE), this.uzCIH, this.zsXlph);
            this.zsXlph = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this.uzCIH;
                cArr[iEncodeBase64Chunk] = AbstractJsonLexerKt.STRING_ESC;
                this.zsXlph = iEncodeBase64Chunk + 2;
                cArr[iEncodeBase64Chunk + 1] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i6 = i7;
        }
        if (i5 <= 0 || (iEZpvd = EZpvd(inputStream, bArr, i6, iEZpvd2, i5)) <= 0) {
            return i5;
        }
        if (this.zsXlph > i2) {
            AuCTel();
        }
        int i8 = bArr[0] << 16;
        if (1 < iEZpvd) {
            i8 |= (bArr[1] & UnsignedBytes.MAX_VALUE) << 8;
        } else {
            i3 = 1;
        }
        this.zsXlph = base64Variant.encodeBase64Partial(i8, i3, this.uzCIH, this.zsXlph);
        return i5 - i3;
    }

    public final int OLrzqt(Base64Variant base64Variant, java.io.InputStream inputStream, byte[] bArr) throws java.io.IOException {
        int i = this.wlaJM - 6;
        int i2 = 2;
        int i3 = -3;
        int i4 = 0;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i5 = 0;
        int iEZpvd = 0;
        int i6 = 0;
        while (true) {
            if (i5 > i3) {
                iEZpvd = EZpvd(inputStream, bArr, i5, iEZpvd, bArr.length);
                if (iEZpvd < 3) {
                    break;
                }
                i3 = iEZpvd - 3;
                i5 = i4;
            }
            if (this.zsXlph > i) {
                AuCTel();
            }
            int i7 = i5 + 3;
            i6 += 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i5] << 8) | (bArr[i5 + 1] & UnsignedBytes.MAX_VALUE)) << 8) | (bArr[i5 + 2] & UnsignedBytes.MAX_VALUE), this.uzCIH, this.zsXlph);
            this.zsXlph = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                char[] cArr = this.uzCIH;
                cArr[iEncodeBase64Chunk] = AbstractJsonLexerKt.STRING_ESC;
                this.zsXlph = iEncodeBase64Chunk + 2;
                cArr[iEncodeBase64Chunk + 1] = 'n';
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i5 = i7;
            i4 = 0;
        }
        if (iEZpvd <= 0) {
            return i6;
        }
        if (this.zsXlph > i) {
            AuCTel();
        }
        int i8 = bArr[i4] << 16;
        if (1 < iEZpvd) {
            i8 |= (bArr[1] & UnsignedBytes.MAX_VALUE) << 8;
        } else {
            i2 = 1;
        }
        int i9 = i6 + i2;
        this.zsXlph = base64Variant.encodeBase64Partial(i8, i2, this.uzCIH, this.zsXlph);
        return i9;
    }

    private int EZpvd(java.io.InputStream inputStream, byte[] bArr, int i, int i2, int i3) throws java.io.IOException {
        int i4 = 0;
        while (i < i2) {
            bArr[i4] = bArr[i];
            i4++;
            i++;
        }
        int iMin = java.lang.Math.min(i3, bArr.length);
        do {
            int i5 = iMin - i4;
            if (i5 == 0) {
                break;
            }
            int i6 = inputStream.read(bArr, i4, i5);
            if (i6 < 0) {
                return i4;
            }
            i4 += i6;
        } while (i4 < 3);
        return i4;
    }

    private final void iwGUEr() throws java.io.IOException {
        if (this.zsXlph + 4 >= this.wlaJM) {
            AuCTel();
        }
        int i = this.zsXlph;
        char[] cArr = this.uzCIH;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.zsXlph = i + 4;
    }

    public final void AEQbTJ(char c, int i) throws java.io.IOException {
        java.lang.String value;
        int i2;
        if (i >= 0) {
            int i3 = this.zsXlph;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.AuCTelauCTel = i4;
                char[] cArr = this.uzCIH;
                cArr[i4] = AbstractJsonLexerKt.STRING_ESC;
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArrFJNWhG = this.hDKMBd;
            if (cArrFJNWhG == null) {
                cArrFJNWhG = fJNWhG();
            }
            this.AuCTelauCTel = this.zsXlph;
            cArrFJNWhG[1] = (char) i;
            this.zLjUOn.write(cArrFJNWhG, 0, 2);
            return;
        }
        if (i != -2) {
            char[] cArrFARcdN = fARcdN();
            int i5 = this.zsXlph;
            if (i5 < 6) {
                char[] cArrFJNWhG2 = this.hDKMBd;
                if (cArrFJNWhG2 == null) {
                    cArrFJNWhG2 = fJNWhG();
                }
                this.AuCTelauCTel = this.zsXlph;
                if (c > 255) {
                    int i6 = c >> '\b';
                    cArrFJNWhG2[10] = cArrFARcdN[(i6 & 255) >> 4];
                    cArrFJNWhG2[11] = cArrFARcdN[i6 & 15];
                    cArrFJNWhG2[12] = cArrFARcdN[(c & 255) >> 4];
                    cArrFJNWhG2[13] = cArrFARcdN[c & 15];
                    this.zLjUOn.write(cArrFJNWhG2, 8, 6);
                    return;
                }
                cArrFJNWhG2[6] = cArrFARcdN[c >> 4];
                cArrFJNWhG2[7] = cArrFARcdN[c & 15];
                this.zLjUOn.write(cArrFJNWhG2, 2, 6);
                return;
            }
            char[] cArr2 = this.uzCIH;
            int i7 = i5 - 6;
            this.AuCTelauCTel = i7;
            cArr2[i7] = AbstractJsonLexerKt.STRING_ESC;
            cArr2[i5 - 5] = 'u';
            if (c > 255) {
                int i8 = c >> '\b';
                cArr2[i5 - 4] = cArrFARcdN[(i8 & 255) >> 4];
                i2 = i5 - 3;
                cArr2[i2] = cArrFARcdN[i8 & 15];
                c = (char) (c & 255);
            } else {
                cArr2[i5 - 4] = '0';
                i2 = i5 - 3;
                cArr2[i2] = '0';
            }
            cArr2[i2 + 1] = cArrFARcdN[c >> 4];
            cArr2[i2 + 2] = cArrFARcdN[c & 15];
            return;
        }
        InterfaceC5501Ue interfaceC5501Ue = this.getFieldNames;
        if (interfaceC5501Ue == null) {
            value = this.isConnected.getEscapeSequence(c).getValue();
        } else {
            value = interfaceC5501Ue.getValue();
            this.getFieldNames = null;
        }
        int length = value.length();
        int i9 = this.zsXlph;
        if (i9 >= length) {
            int i10 = i9 - length;
            this.AuCTelauCTel = i10;
            value.getChars(0, length, this.uzCIH, i10);
        } else {
            this.AuCTelauCTel = i9;
            this.zLjUOn.write(value);
        }
    }

    public final int OLrzqt(char[] cArr, int i, int i2, char c, int i3) throws java.io.IOException {
        java.lang.String value;
        int i4;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = AbstractJsonLexerKt.STRING_ESC;
                cArr[i - 1] = (char) i3;
                return i5;
            }
            char[] cArrFJNWhG = this.hDKMBd;
            if (cArrFJNWhG == null) {
                cArrFJNWhG = fJNWhG();
            }
            cArrFJNWhG[1] = (char) i3;
            this.zLjUOn.write(cArrFJNWhG, 0, 2);
            return i;
        }
        if (i3 != -2) {
            char[] cArrFARcdN = fARcdN();
            if (i > 5 && i < i2) {
                cArr[i - 6] = AbstractJsonLexerKt.STRING_ESC;
                int i6 = i - 4;
                cArr[i - 5] = 'u';
                if (c > 255) {
                    int i7 = c >> '\b';
                    cArr[i6] = cArrFARcdN[(i7 & 255) >> 4];
                    i4 = i - 2;
                    cArr[i - 3] = cArrFARcdN[i7 & 15];
                    c = (char) (c & 255);
                } else {
                    cArr[i6] = '0';
                    i4 = i - 2;
                    cArr[i - 3] = '0';
                }
                cArr[i4] = cArrFARcdN[c >> 4];
                cArr[i4 + 1] = cArrFARcdN[c & 15];
                return i4 - 4;
            }
            char[] cArrFJNWhG2 = this.hDKMBd;
            if (cArrFJNWhG2 == null) {
                cArrFJNWhG2 = fJNWhG();
            }
            this.AuCTelauCTel = this.zsXlph;
            if (c > 255) {
                int i8 = c >> '\b';
                cArrFJNWhG2[10] = cArrFARcdN[(i8 & 255) >> 4];
                cArrFJNWhG2[11] = cArrFARcdN[i8 & 15];
                cArrFJNWhG2[12] = cArrFARcdN[(c & 255) >> 4];
                cArrFJNWhG2[13] = cArrFARcdN[c & 15];
                this.zLjUOn.write(cArrFJNWhG2, 8, 6);
                return i;
            }
            cArrFJNWhG2[6] = cArrFARcdN[c >> 4];
            cArrFJNWhG2[7] = cArrFARcdN[c & 15];
            this.zLjUOn.write(cArrFJNWhG2, 2, 6);
            return i;
        }
        InterfaceC5501Ue interfaceC5501Ue = this.getFieldNames;
        if (interfaceC5501Ue == null) {
            value = this.isConnected.getEscapeSequence(c).getValue();
        } else {
            value = interfaceC5501Ue.getValue();
            this.getFieldNames = null;
        }
        int length = value.length();
        if (i >= length && i < i2) {
            int i9 = i - length;
            value.getChars(0, length, cArr, i9);
            return i9;
        }
        this.zLjUOn.write(value);
        return i;
    }

    public final void KWHzl(char c, int i) throws java.io.IOException {
        java.lang.String value;
        int i2;
        if (i >= 0) {
            if (this.zsXlph + 2 > this.wlaJM) {
                AuCTel();
            }
            char[] cArr = this.uzCIH;
            int i3 = this.zsXlph;
            cArr[i3] = AbstractJsonLexerKt.STRING_ESC;
            this.zsXlph = i3 + 2;
            cArr[i3 + 1] = (char) i;
            return;
        }
        if (i != -2) {
            if (this.zsXlph + 5 >= this.wlaJM) {
                AuCTel();
            }
            int i4 = this.zsXlph;
            char[] cArr2 = this.uzCIH;
            char[] cArrFARcdN = fARcdN();
            cArr2[i4] = AbstractJsonLexerKt.STRING_ESC;
            int i5 = i4 + 2;
            cArr2[i4 + 1] = 'u';
            if (c > 255) {
                int i6 = c >> '\b';
                cArr2[i5] = cArrFARcdN[(i6 & 255) >> 4];
                i2 = i4 + 4;
                cArr2[i4 + 3] = cArrFARcdN[i6 & 15];
                c = (char) (c & 255);
            } else {
                cArr2[i5] = '0';
                i2 = i4 + 4;
                cArr2[i4 + 3] = '0';
            }
            cArr2[i2] = cArrFARcdN[c >> 4];
            cArr2[i2 + 1] = cArrFARcdN[c & 15];
            this.zsXlph = i2 + 2;
            return;
        }
        InterfaceC5501Ue interfaceC5501Ue = this.getFieldNames;
        if (interfaceC5501Ue == null) {
            value = this.isConnected.getEscapeSequence(c).getValue();
        } else {
            value = interfaceC5501Ue.getValue();
            this.getFieldNames = null;
        }
        int length = value.length();
        if (this.zsXlph + length > this.wlaJM) {
            AuCTel();
            if (length > this.wlaJM) {
                this.zLjUOn.write(value);
                return;
            }
        }
        value.getChars(0, length, this.uzCIH, this.zsXlph);
        this.zsXlph += length;
    }

    public void AuCTel() throws java.io.IOException {
        int i = this.zsXlph;
        int i2 = this.AuCTelauCTel;
        int i3 = i - i2;
        if (i3 > 0) {
            this.AuCTelauCTel = 0;
            this.zsXlph = 0;
            this.zLjUOn.write(this.uzCIH, i2, i3);
        }
    }
}
