package o;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.primitives.UnsignedBytes;
import java.math.BigDecimal;

/* JADX INFO: renamed from: o.Va, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C5524Va extends UW {
    public byte[] AuCTelauCTel;
    public final int AubY;
    public byte AwvSrB;
    public boolean getNewProxyInstance;
    public final java.io.OutputStream sSMYrx;
    public final int wlaJM;
    public final int zLjUOn;
    public char[] zsXlph;
    public int zuBGHE;
    public static final byte[] getFieldNames = C5521Ux.EZpvd(true);
    public static final byte[] uzCIH = C5521Ux.EZpvd(false);
    public static final byte[] hDKMBd = {110, 117, 108, 108};
    public static final byte[] iwGUEr = {116, 114, 117, 101};
    public static final byte[] fIwbmz = {102, 97, 108, 115, 101};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final byte[] fARcdN() {
        return this.DbNXlk ? getFieldNames : uzCIH;
    }

    public C5524Va(C5517Ut c5517Ut, int i, AbstractC5505Ui abstractC5505Ui, java.io.OutputStream outputStream, char c) {
        super(c5517Ut, i, abstractC5505Ui);
        this.sSMYrx = outputStream;
        this.AwvSrB = (byte) c;
        if (c != '\"') {
            this.AuCTel = C5521Ux.copydefault(c);
        }
        this.getNewProxyInstance = true;
        byte[] bArrCopydefault = c5517Ut.copydefault();
        this.AuCTelauCTel = bArrCopydefault;
        int length = bArrCopydefault.length;
        this.AubY = length;
        this.wlaJM = length >> 3;
        char[] cArrEZpvd = c5517Ut.EZpvd();
        this.zsXlph = cArrEZpvd;
        this.zLjUOn = cArrEZpvd.length;
        if (OLrzqt(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            EZpvd(127);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void KWHzl(java.lang.String str) throws java.io.IOException {
        if (this.copydefault != null) {
            djBIcL(str);
            return;
        }
        int iCopydefault = this.djBIcL.copydefault(str);
        if (iCopydefault == 4) {
            AEQbTJ("Can not write a field name, expecting a value");
        }
        if (iCopydefault == 1) {
            if (this.zuBGHE >= this.AubY) {
                AuCTel();
            }
            byte[] bArr = this.AuCTelauCTel;
            int i = this.zuBGHE;
            this.zuBGHE = i + 1;
            bArr[i] = 44;
        }
        if (this.AkhnZx) {
            AEQbTJ(str, false);
            return;
        }
        int length = str.length();
        if (length > this.zLjUOn) {
            AEQbTJ(str, true);
            return;
        }
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr2 = this.AuCTelauCTel;
        int i2 = this.zuBGHE;
        int i3 = i2 + 1;
        this.zuBGHE = i3;
        bArr2[i2] = this.AwvSrB;
        if (length <= this.wlaJM) {
            if (i3 + length > this.AubY) {
                AuCTel();
            }
            copydefault(str, 0, length);
        } else {
            AhwBna(str, 0, length);
        }
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr3 = this.AuCTelauCTel;
        int i4 = this.zuBGHE;
        this.zuBGHE = i4 + 1;
        bArr3[i4] = this.AwvSrB;
    }

    @Override // o.AbstractC5510Un, com.fasterxml.jackson.core.JsonGenerator
    public void copydefault(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        if (this.copydefault != null) {
            AYXKKw(interfaceC5501Ue);
            return;
        }
        int iCopydefault = this.djBIcL.copydefault(interfaceC5501Ue.getValue());
        if (iCopydefault == 4) {
            AEQbTJ("Can not write a field name, expecting a value");
        }
        if (iCopydefault == 1) {
            if (this.zuBGHE >= this.AubY) {
                AuCTel();
            }
            byte[] bArr = this.AuCTelauCTel;
            int i = this.zuBGHE;
            this.zuBGHE = i + 1;
            bArr[i] = 44;
        }
        if (this.AkhnZx) {
            gEmmrt(interfaceC5501Ue);
            return;
        }
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr2 = this.AuCTelauCTel;
        int i2 = this.zuBGHE;
        int i3 = i2 + 1;
        this.zuBGHE = i3;
        bArr2[i2] = this.AwvSrB;
        int iAppendQuotedUTF8 = interfaceC5501Ue.appendQuotedUTF8(bArr2, i3);
        if (iAppendQuotedUTF8 < 0) {
            EZpvd(interfaceC5501Ue.asQuotedUTF8());
        } else {
            this.zuBGHE += iAppendQuotedUTF8;
        }
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr3 = this.AuCTelauCTel;
        int i4 = this.zuBGHE;
        this.zuBGHE = i4 + 1;
        bArr3[i4] = this.AwvSrB;
    }

    public final void gEmmrt(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        int iAppendQuotedUTF8 = interfaceC5501Ue.appendQuotedUTF8(this.AuCTelauCTel, this.zuBGHE);
        if (iAppendQuotedUTF8 < 0) {
            EZpvd(interfaceC5501Ue.asQuotedUTF8());
        } else {
            this.zuBGHE += iAppendQuotedUTF8;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void values() throws java.io.IOException {
        gEmmrt("start an array");
        this.djBIcL = this.djBIcL.AkhnZx();
        InterfaceC5504Uh interfaceC5504Uh = this.copydefault;
        if (interfaceC5504Uh != null) {
            interfaceC5504Uh.writeStartArray(this);
            return;
        }
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i = this.zuBGHE;
        this.zuBGHE = i + 1;
        bArr[i] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void gEmmrt(java.lang.Object obj) throws java.io.IOException {
        gEmmrt("start an array");
        this.djBIcL = this.djBIcL.EZpvd(obj);
        InterfaceC5504Uh interfaceC5504Uh = this.copydefault;
        if (interfaceC5504Uh != null) {
            interfaceC5504Uh.writeStartArray(this);
            return;
        }
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i = this.zuBGHE;
        this.zuBGHE = i + 1;
        bArr[i] = 91;
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
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i2 = this.zuBGHE;
        this.zuBGHE = i2 + 1;
        bArr[i2] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void fetchVPNInfo() throws java.io.IOException {
        if (!this.djBIcL.valueOf()) {
            AEQbTJ("Current context not Array but " + this.djBIcL.DbNXlk());
        }
        InterfaceC5504Uh interfaceC5504Uh = this.copydefault;
        if (interfaceC5504Uh != null) {
            interfaceC5504Uh.writeEndArray(this, this.djBIcL.EZpvd());
        } else {
            if (this.zuBGHE >= this.AubY) {
                AuCTel();
            }
            byte[] bArr = this.AuCTelauCTel;
            int i = this.zuBGHE;
            this.zuBGHE = i + 1;
            bArr[i] = 93;
        }
        this.djBIcL = this.djBIcL.fetchVPNInfo();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void AkhnZx() throws java.io.IOException {
        gEmmrt("start an object");
        this.djBIcL = this.djBIcL.values();
        InterfaceC5504Uh interfaceC5504Uh = this.copydefault;
        if (interfaceC5504Uh != null) {
            interfaceC5504Uh.writeStartObject(this);
            return;
        }
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i = this.zuBGHE;
        this.zuBGHE = i + 1;
        bArr[i] = 123;
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
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i = this.zuBGHE;
        this.zuBGHE = i + 1;
        bArr[i] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(java.lang.Object obj, int i) throws java.io.IOException {
        AYXKKw(obj);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void DbNXlk() throws java.io.IOException {
        if (!this.djBIcL.djBIcL()) {
            AEQbTJ("Current context not Object but " + this.djBIcL.DbNXlk());
        }
        InterfaceC5504Uh interfaceC5504Uh = this.copydefault;
        if (interfaceC5504Uh != null) {
            interfaceC5504Uh.writeEndObject(this, this.djBIcL.EZpvd());
        } else {
            if (this.zuBGHE >= this.AubY) {
                AuCTel();
            }
            byte[] bArr = this.AuCTelauCTel;
            int i = this.zuBGHE;
            this.zuBGHE = i + 1;
            bArr[i] = 125;
        }
        this.djBIcL = this.djBIcL.fetchVPNInfo();
    }

    public final void djBIcL(java.lang.String str) throws java.io.IOException {
        int iCopydefault = this.djBIcL.copydefault(str);
        if (iCopydefault == 4) {
            AEQbTJ("Can not write a field name, expecting a value");
        }
        if (iCopydefault == 1) {
            this.copydefault.writeObjectEntrySeparator(this);
        } else {
            this.copydefault.beforeObjectEntries(this);
        }
        if (this.AkhnZx) {
            AEQbTJ(str, false);
            return;
        }
        int length = str.length();
        if (length > this.zLjUOn) {
            AEQbTJ(str, true);
            return;
        }
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i = this.zuBGHE;
        this.zuBGHE = i + 1;
        bArr[i] = this.AwvSrB;
        str.getChars(0, length, this.zsXlph, 0);
        if (length <= this.wlaJM) {
            if (this.zuBGHE + length > this.AubY) {
                AuCTel();
            }
            djBIcL(this.zsXlph, 0, length);
        } else {
            gEmmrt(this.zsXlph, 0, length);
        }
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr2 = this.AuCTelauCTel;
        int i2 = this.zuBGHE;
        this.zuBGHE = i2 + 1;
        bArr2[i2] = this.AwvSrB;
    }

    public final void AYXKKw(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        int iCopydefault = this.djBIcL.copydefault(interfaceC5501Ue.getValue());
        if (iCopydefault == 4) {
            AEQbTJ("Can not write a field name, expecting a value");
        }
        if (iCopydefault == 1) {
            this.copydefault.writeObjectEntrySeparator(this);
        } else {
            this.copydefault.beforeObjectEntries(this);
        }
        boolean z = !this.AkhnZx;
        if (z) {
            if (this.zuBGHE >= this.AubY) {
                AuCTel();
            }
            byte[] bArr = this.AuCTelauCTel;
            int i = this.zuBGHE;
            this.zuBGHE = i + 1;
            bArr[i] = this.AwvSrB;
        }
        int iAppendQuotedUTF8 = interfaceC5501Ue.appendQuotedUTF8(this.AuCTelauCTel, this.zuBGHE);
        if (iAppendQuotedUTF8 < 0) {
            EZpvd(interfaceC5501Ue.asQuotedUTF8());
        } else {
            this.zuBGHE += iAppendQuotedUTF8;
        }
        if (z) {
            if (this.zuBGHE >= this.AubY) {
                AuCTel();
            }
            byte[] bArr2 = this.AuCTelauCTel;
            int i2 = this.zuBGHE;
            this.zuBGHE = i2 + 1;
            bArr2[i2] = this.AwvSrB;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AhwBna(java.lang.String str) throws java.io.IOException {
        gEmmrt("write a string");
        if (str == null) {
            fIwbmz();
            return;
        }
        int length = str.length();
        if (length > this.wlaJM) {
            AEQbTJ(str, true);
            return;
        }
        if (this.zuBGHE + length >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i = this.zuBGHE;
        this.zuBGHE = i + 1;
        bArr[i] = this.AwvSrB;
        copydefault(str, 0, length);
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr2 = this.AuCTelauCTel;
        int i2 = this.zuBGHE;
        this.zuBGHE = i2 + 1;
        bArr2[i2] = this.AwvSrB;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void KWHzl(char[] cArr, int i, int i2) throws java.io.IOException {
        gEmmrt("write a string");
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i3 = this.zuBGHE;
        int i4 = i3 + 1;
        this.zuBGHE = i4;
        bArr[i3] = this.AwvSrB;
        if (i2 <= this.wlaJM) {
            if (i4 + i2 > this.AubY) {
                AuCTel();
            }
            djBIcL(cArr, i, i2);
        } else {
            gEmmrt(cArr, i, i2);
        }
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr2 = this.AuCTelauCTel;
        int i5 = this.zuBGHE;
        this.zuBGHE = i5 + 1;
        bArr2[i5] = this.AwvSrB;
    }

    @Override // o.AbstractC5510Un, com.fasterxml.jackson.core.JsonGenerator
    public final void EZpvd(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        gEmmrt("write a string");
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i = this.zuBGHE;
        int i2 = i + 1;
        this.zuBGHE = i2;
        bArr[i] = this.AwvSrB;
        int iAppendQuotedUTF8 = interfaceC5501Ue.appendQuotedUTF8(bArr, i2);
        if (iAppendQuotedUTF8 < 0) {
            EZpvd(interfaceC5501Ue.asQuotedUTF8());
        } else {
            this.zuBGHE += iAppendQuotedUTF8;
        }
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr2 = this.AuCTelauCTel;
        int i3 = this.zuBGHE;
        this.zuBGHE = i3 + 1;
        bArr2[i3] = this.AwvSrB;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copydefault(java.lang.String str) throws java.io.IOException {
        int length = str.length();
        char[] cArr = this.zsXlph;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            AEQbTJ(cArr, 0, length);
        } else {
            djBIcL(str, 0, length);
        }
    }

    public void djBIcL(java.lang.String str, int i, int i2) throws java.io.IOException {
        int i3;
        char c;
        KWHzl(str, i, i2);
        char[] cArr = this.zsXlph;
        int length = cArr.length;
        if (i2 <= length) {
            str.getChars(i, i + i2, cArr, 0);
            AEQbTJ(cArr, 0, i2);
            return;
        }
        int i4 = this.AubY;
        int iMin = java.lang.Math.min(length, (i4 >> 2) + (i4 >> 4));
        while (i2 > 0) {
            int iMin2 = java.lang.Math.min(iMin, i2);
            str.getChars(i, i + iMin2, cArr, 0);
            if (this.zuBGHE + (iMin * 3) > this.AubY) {
                AuCTel();
            }
            if (iMin2 > 1 && (c = cArr[iMin2 - 1]) >= 55296 && c <= 56319) {
                iMin2 = i3;
            }
            EZpvd(cArr, 0, iMin2);
            i += iMin2;
            i2 -= iMin2;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void OLrzqt(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        int iAppendUnquotedUTF8 = interfaceC5501Ue.appendUnquotedUTF8(this.AuCTelauCTel, this.zuBGHE);
        if (iAppendUnquotedUTF8 < 0) {
            EZpvd(interfaceC5501Ue.asUnquotedUTF8());
        } else {
            this.zuBGHE += iAppendUnquotedUTF8;
        }
    }

    @Override // o.AbstractC5510Un, com.fasterxml.jackson.core.JsonGenerator
    public void AEQbTJ(InterfaceC5501Ue interfaceC5501Ue) throws java.io.IOException {
        gEmmrt("write a raw (unencoded) value");
        int iAppendUnquotedUTF8 = interfaceC5501Ue.appendUnquotedUTF8(this.AuCTelauCTel, this.zuBGHE);
        if (iAppendUnquotedUTF8 < 0) {
            EZpvd(interfaceC5501Ue.asUnquotedUTF8());
        } else {
            this.zuBGHE += iAppendUnquotedUTF8;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void AEQbTJ(char[] cArr, int i, int i2) throws java.io.IOException {
        copydefault(cArr, i, i2);
        int i3 = i2 + i2 + i2;
        int i4 = this.zuBGHE;
        int i5 = this.AubY;
        if (i4 + i3 > i5) {
            if (i5 < i3) {
                valueOf(cArr, i, i2);
                return;
            }
            AuCTel();
        }
        int i6 = i2 + i;
        while (i < i6) {
            do {
                char c = cArr[i];
                if (c > 127) {
                    i++;
                    if (c < 2048) {
                        byte[] bArr = this.AuCTelauCTel;
                        int i7 = this.zuBGHE;
                        bArr[i7] = (byte) ((c >> 6) | 192);
                        this.zuBGHE = i7 + 2;
                        bArr[i7 + 1] = (byte) ((c & '?') | 128);
                    } else {
                        i = KWHzl(c, cArr, i, i6);
                    }
                } else {
                    byte[] bArr2 = this.AuCTelauCTel;
                    int i8 = this.zuBGHE;
                    this.zuBGHE = i8 + 1;
                    bArr2[i8] = (byte) c;
                    i++;
                }
            } while (i < i6);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copydefault(char c) throws java.io.IOException {
        if (this.zuBGHE + 3 >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        if (c <= 127) {
            int i = this.zuBGHE;
            this.zuBGHE = i + 1;
            bArr[i] = (byte) c;
        } else {
            if (c < 2048) {
                int i2 = this.zuBGHE;
                bArr[i2] = (byte) ((c >> 6) | 192);
                this.zuBGHE = i2 + 2;
                bArr[i2 + 1] = (byte) ((c & '?') | 128);
                return;
            }
            KWHzl(c, null, 0, 0);
        }
    }

    public final void valueOf(char[] cArr, int i, int i2) throws java.io.IOException {
        int i3 = this.AubY;
        byte[] bArr = this.AuCTelauCTel;
        int i4 = i2 + i;
        while (i < i4) {
            do {
                char c = cArr[i];
                if (c < 128) {
                    if (this.zuBGHE >= i3) {
                        AuCTel();
                    }
                    int i5 = this.zuBGHE;
                    this.zuBGHE = i5 + 1;
                    bArr[i5] = (byte) c;
                    i++;
                } else {
                    if (this.zuBGHE + 3 >= this.AubY) {
                        AuCTel();
                    }
                    int i6 = i + 1;
                    char c2 = cArr[i];
                    if (c2 < 2048) {
                        int i7 = this.zuBGHE;
                        bArr[i7] = (byte) ((c2 >> 6) | 192);
                        this.zuBGHE = i7 + 2;
                        bArr[i7 + 1] = (byte) ((c2 & '?') | 128);
                        i = i6;
                    } else {
                        i = KWHzl(c2, cArr, i6, i4);
                    }
                }
            } while (i < i4);
            return;
        }
    }

    public final void EZpvd(char[] cArr, int i, int i2) throws java.io.IOException {
        while (i < i2) {
            do {
                char c = cArr[i];
                if (c > 127) {
                    i++;
                    if (c < 2048) {
                        byte[] bArr = this.AuCTelauCTel;
                        int i3 = this.zuBGHE;
                        bArr[i3] = (byte) ((c >> 6) | 192);
                        this.zuBGHE = i3 + 2;
                        bArr[i3 + 1] = (byte) ((c & '?') | 128);
                    } else {
                        i = KWHzl(c, cArr, i, i2);
                    }
                } else {
                    byte[] bArr2 = this.AuCTelauCTel;
                    int i4 = this.zuBGHE;
                    this.zuBGHE = i4 + 1;
                    bArr2[i4] = (byte) c;
                    i++;
                }
            } while (i < i2);
            return;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws java.io.IOException {
        OLrzqt(bArr, i, i2);
        gEmmrt("write a binary value");
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr2 = this.AuCTelauCTel;
        int i3 = this.zuBGHE;
        this.zuBGHE = i3 + 1;
        bArr2[i3] = this.AwvSrB;
        OLrzqt(base64Variant, bArr, i, i2 + i);
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr3 = this.AuCTelauCTel;
        int i4 = this.zuBGHE;
        this.zuBGHE = i4 + 1;
        bArr3[i4] = this.AwvSrB;
    }

    @Override // o.AbstractC5510Un, com.fasterxml.jackson.core.JsonGenerator
    public int KWHzl(Base64Variant base64Variant, java.io.InputStream inputStream, int i) throws java.io.IOException {
        gEmmrt("write a binary value");
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i2 = this.zuBGHE;
        this.zuBGHE = i2 + 1;
        bArr[i2] = this.AwvSrB;
        byte[] bArrKWHzl = this.fJNWhG.KWHzl();
        try {
            if (i < 0) {
                i = OLrzqt(base64Variant, inputStream, bArrKWHzl);
            } else {
                int iCopydefault = copydefault(base64Variant, inputStream, bArrKWHzl, i);
                if (iCopydefault > 0) {
                    AEQbTJ("Too few bytes available: missing " + iCopydefault + " bytes (out of " + i + ")");
                }
            }
            this.fJNWhG.AEQbTJ(bArrKWHzl);
            if (this.zuBGHE >= this.AubY) {
                AuCTel();
            }
            byte[] bArr2 = this.AuCTelauCTel;
            int i3 = this.zuBGHE;
            this.zuBGHE = i3 + 1;
            bArr2[i3] = this.AwvSrB;
            return i;
        } catch (java.lang.Throwable th) {
            this.fJNWhG.AEQbTJ(bArrKWHzl);
            throw th;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void OLrzqt(short s) throws java.io.IOException {
        gEmmrt("write a number");
        if (this.zuBGHE + 6 >= this.AubY) {
            AuCTel();
        }
        if (this.AYXKKw) {
            EZpvd(s);
        } else {
            this.zuBGHE = UB.KWHzl((int) s, this.AuCTelauCTel, this.zuBGHE);
        }
    }

    public final void EZpvd(short s) throws java.io.IOException {
        if (this.zuBGHE + 8 >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i = this.zuBGHE;
        int i2 = i + 1;
        this.zuBGHE = i2;
        bArr[i] = this.AwvSrB;
        int iKWHzl = UB.KWHzl((int) s, bArr, i2);
        byte[] bArr2 = this.AuCTelauCTel;
        this.zuBGHE = iKWHzl + 1;
        bArr2[iKWHzl] = this.AwvSrB;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void copydefault(int i) throws java.io.IOException {
        gEmmrt("write a number");
        if (this.zuBGHE + 11 >= this.AubY) {
            AuCTel();
        }
        if (this.AYXKKw) {
            OLrzqt(i);
        } else {
            this.zuBGHE = UB.KWHzl(i, this.AuCTelauCTel, this.zuBGHE);
        }
    }

    public final void OLrzqt(int i) throws java.io.IOException {
        if (this.zuBGHE + 13 >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i2 = this.zuBGHE;
        int i3 = i2 + 1;
        this.zuBGHE = i3;
        bArr[i2] = this.AwvSrB;
        int iKWHzl = UB.KWHzl(i, bArr, i3);
        byte[] bArr2 = this.AuCTelauCTel;
        this.zuBGHE = iKWHzl + 1;
        bArr2[iKWHzl] = this.AwvSrB;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(long j) throws java.io.IOException {
        gEmmrt("write a number");
        if (this.AYXKKw) {
            KWHzl(j);
            return;
        }
        if (this.zuBGHE + 21 >= this.AubY) {
            AuCTel();
        }
        this.zuBGHE = UB.KWHzl(j, this.AuCTelauCTel, this.zuBGHE);
    }

    public final void KWHzl(long j) throws java.io.IOException {
        if (this.zuBGHE + 23 >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i = this.zuBGHE;
        int i2 = i + 1;
        this.zuBGHE = i2;
        bArr[i] = this.AwvSrB;
        int iKWHzl = UB.KWHzl(j, bArr, i2);
        byte[] bArr2 = this.AuCTelauCTel;
        this.zuBGHE = iKWHzl + 1;
        bArr2[iKWHzl] = this.AwvSrB;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void KWHzl(java.math.BigInteger bigInteger) throws java.io.IOException {
        gEmmrt("write a number");
        if (bigInteger == null) {
            fIwbmz();
        } else if (this.AYXKKw) {
            values(bigInteger.toString());
        } else {
            copydefault(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void KWHzl(double d) throws java.io.IOException {
        if (this.AYXKKw || (UB.KWHzl(d) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.AhwBna))) {
            AhwBna(UB.EZpvd(d, OLrzqt(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        } else {
            gEmmrt("write a number");
            copydefault(UB.EZpvd(d, OLrzqt(JsonGenerator.Feature.USE_FAST_DOUBLE_WRITER)));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void AEQbTJ(float f) throws java.io.IOException {
        if (this.AYXKKw || (UB.AEQbTJ(f) && JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this.AhwBna))) {
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
            fIwbmz();
        } else if (this.AYXKKw) {
            values(KWHzl(bigDecimal));
        } else {
            copydefault(KWHzl(bigDecimal));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void EZpvd(java.lang.String str) throws java.io.IOException {
        gEmmrt("write a number");
        if (str == null) {
            fIwbmz();
        } else if (this.AYXKKw) {
            values(str);
        } else {
            copydefault(str);
        }
    }

    public final void values(java.lang.String str) throws java.io.IOException {
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i = this.zuBGHE;
        this.zuBGHE = i + 1;
        bArr[i] = this.AwvSrB;
        copydefault(str);
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr2 = this.AuCTelauCTel;
        int i2 = this.zuBGHE;
        this.zuBGHE = i2 + 1;
        bArr2[i2] = this.AwvSrB;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void OLrzqt(boolean z) throws java.io.IOException {
        gEmmrt("write a boolean value");
        if (this.zuBGHE + 5 >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = z ? iwGUEr : fIwbmz;
        int length = bArr.length;
        java.lang.System.arraycopy(bArr, 0, this.AuCTelauCTel, this.zuBGHE, length);
        this.zuBGHE += length;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void isConnected() throws java.io.IOException {
        gEmmrt("write a null");
        fIwbmz();
    }

    @Override // o.AbstractC5510Un
    public final void gEmmrt(java.lang.String str) throws java.io.IOException {
        byte b;
        int iFIwbmz = this.djBIcL.fIwbmz();
        if (this.copydefault != null) {
            OLrzqt(str, iFIwbmz);
            return;
        }
        if (iFIwbmz == 1) {
            b = 44;
        } else {
            if (iFIwbmz != 2) {
                if (iFIwbmz != 3) {
                    if (iFIwbmz != 5) {
                        return;
                    }
                    valueOf(str);
                    return;
                }
                InterfaceC5501Ue interfaceC5501Ue = this.ejfBZ;
                if (interfaceC5501Ue != null) {
                    byte[] bArrAsUnquotedUTF8 = interfaceC5501Ue.asUnquotedUTF8();
                    if (bArrAsUnquotedUTF8.length > 0) {
                        EZpvd(bArrAsUnquotedUTF8);
                        return;
                    }
                    return;
                }
                return;
            }
            b = 58;
        }
        if (this.zuBGHE >= this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i = this.zuBGHE;
        this.zuBGHE = i + 1;
        bArr[i] = b;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws java.io.IOException {
        AuCTel();
        if (this.sSMYrx == null || !OLrzqt(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.sSMYrx.flush();
    }

    @Override // o.AbstractC5510Un, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.lang.Throwable {
        super.close();
        try {
            if (this.AuCTelauCTel != null && OLrzqt(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
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
        this.zuBGHE = 0;
        if (this.sSMYrx != null) {
            try {
                if (this.fJNWhG.AhwBna() || OLrzqt(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                    this.sSMYrx.close();
                } else if (OLrzqt(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                    this.sSMYrx.flush();
                }
            } catch (java.io.IOException | java.lang.RuntimeException e2) {
                if (e != null) {
                    e2.addSuppressed(e);
                }
                throw e2;
            }
        }
        fJNWhG();
        if (e != null) {
            throw e;
        }
    }

    public void fJNWhG() {
        byte[] bArr = this.AuCTelauCTel;
        if (bArr != null && this.getNewProxyInstance) {
            this.AuCTelauCTel = null;
            this.fJNWhG.KWHzl(bArr);
        }
        char[] cArr = this.zsXlph;
        if (cArr != null) {
            this.zsXlph = null;
            this.fJNWhG.KWHzl(cArr);
        }
    }

    public final void EZpvd(byte[] bArr) throws java.io.IOException {
        int length = bArr.length;
        if (this.zuBGHE + length > this.AubY) {
            AuCTel();
            if (length > 512) {
                this.sSMYrx.write(bArr, 0, length);
                return;
            }
        }
        java.lang.System.arraycopy(bArr, 0, this.AuCTelauCTel, this.zuBGHE, length);
        this.zuBGHE += length;
    }

    public final void AEQbTJ(java.lang.String str, boolean z) throws java.io.IOException {
        if (z) {
            if (this.zuBGHE >= this.AubY) {
                AuCTel();
            }
            byte[] bArr = this.AuCTelauCTel;
            int i = this.zuBGHE;
            this.zuBGHE = i + 1;
            bArr[i] = this.AwvSrB;
        }
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            int iMin = java.lang.Math.min(this.wlaJM, length);
            if (this.zuBGHE + iMin > this.AubY) {
                AuCTel();
            }
            copydefault(str, i2, iMin);
            i2 += iMin;
            length -= iMin;
        }
        if (z) {
            if (this.zuBGHE >= this.AubY) {
                AuCTel();
            }
            byte[] bArr2 = this.AuCTelauCTel;
            int i3 = this.zuBGHE;
            this.zuBGHE = i3 + 1;
            bArr2[i3] = this.AwvSrB;
        }
    }

    public final void gEmmrt(char[] cArr, int i, int i2) throws java.io.IOException {
        do {
            int iMin = java.lang.Math.min(this.wlaJM, i2);
            if (this.zuBGHE + iMin > this.AubY) {
                AuCTel();
            }
            djBIcL(cArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    public final void AhwBna(java.lang.String str, int i, int i2) throws java.io.IOException {
        do {
            int iMin = java.lang.Math.min(this.wlaJM, i2);
            if (this.zuBGHE + iMin > this.AubY) {
                AuCTel();
            }
            copydefault(str, i, iMin);
            i += iMin;
            i2 -= iMin;
        } while (i2 > 0);
    }

    public final void djBIcL(char[] cArr, int i, int i2) throws java.io.IOException {
        int i3 = i2 + i;
        int i4 = this.zuBGHE;
        byte[] bArr = this.AuCTelauCTel;
        int[] iArr = this.AuCTel;
        while (i < i3) {
            char c = cArr[i];
            if (c > 127 || iArr[c] != 0) {
                break;
            }
            bArr[i4] = (byte) c;
            i++;
            i4++;
        }
        this.zuBGHE = i4;
        if (i < i3) {
            if (this.isConnected != null) {
                OLrzqt(cArr, i, i3);
            } else if (this.fARcdN == 0) {
                AhwBna(cArr, i, i3);
            } else {
                AYXKKw(cArr, i, i3);
            }
        }
    }

    public final void copydefault(java.lang.String str, int i, int i2) throws java.io.IOException {
        int i3 = i2 + i;
        int i4 = this.zuBGHE;
        byte[] bArr = this.AuCTelauCTel;
        int[] iArr = this.AuCTel;
        while (i < i3) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 127 || iArr[cCharAt] != 0) {
                break;
            }
            bArr[i4] = (byte) cCharAt;
            i++;
            i4++;
        }
        this.zuBGHE = i4;
        if (i < i3) {
            if (this.isConnected != null) {
                OLrzqt(str, i, i3);
            } else if (this.fARcdN == 0) {
                EZpvd(str, i, i3);
            } else {
                AEQbTJ(str, i, i3);
            }
        }
    }

    public final void AhwBna(char[] cArr, int i, int i2) throws java.io.IOException {
        int iOLrzqt;
        if (this.zuBGHE + ((i2 - i) * 6) > this.AubY) {
            AuCTel();
        }
        int i3 = this.zuBGHE;
        byte[] bArr = this.AuCTelauCTel;
        int[] iArr = this.AuCTel;
        while (i < i2) {
            int i4 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                int i5 = iArr[c];
                if (i5 == 0) {
                    bArr[i3] = (byte) c;
                    i3++;
                } else {
                    if (i5 > 0) {
                        bArr[i3] = 92;
                        iOLrzqt = i3 + 2;
                        bArr[i3 + 1] = (byte) i5;
                    } else {
                        iOLrzqt = gEmmrt(c, i3);
                    }
                    i3 = iOLrzqt;
                }
            } else if (c <= 2047) {
                bArr[i3] = (byte) ((c >> 6) | 192);
                int i6 = i3 + 2;
                bArr[i3 + 1] = (byte) ((c & '?') | 128);
                i3 = i6;
            } else {
                iOLrzqt = OLrzqt(c, i3);
                i3 = iOLrzqt;
            }
            i = i4;
        }
        this.zuBGHE = i3;
    }

    public final void EZpvd(java.lang.String str, int i, int i2) throws java.io.IOException {
        int iOLrzqt;
        if (this.zuBGHE + ((i2 - i) * 6) > this.AubY) {
            AuCTel();
        }
        int i3 = this.zuBGHE;
        byte[] bArr = this.AuCTelauCTel;
        int[] iArr = this.AuCTel;
        while (i < i2) {
            int i4 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                int i5 = iArr[cCharAt];
                if (i5 == 0) {
                    bArr[i3] = (byte) cCharAt;
                    i3++;
                } else {
                    if (i5 > 0) {
                        bArr[i3] = 92;
                        iOLrzqt = i3 + 2;
                        bArr[i3 + 1] = (byte) i5;
                    } else {
                        iOLrzqt = gEmmrt(cCharAt, i3);
                    }
                    i3 = iOLrzqt;
                }
            } else if (cCharAt <= 2047) {
                bArr[i3] = (byte) ((cCharAt >> 6) | 192);
                int i6 = i3 + 2;
                bArr[i3 + 1] = (byte) ((cCharAt & '?') | 128);
                i3 = i6;
            } else {
                iOLrzqt = OLrzqt(cCharAt, i3);
                i3 = iOLrzqt;
            }
            i = i4;
        }
        this.zuBGHE = i3;
    }

    public final void AYXKKw(char[] cArr, int i, int i2) throws java.io.IOException {
        int iOLrzqt;
        if (this.zuBGHE + ((i2 - i) * 6) > this.AubY) {
            AuCTel();
        }
        int i3 = this.zuBGHE;
        byte[] bArr = this.AuCTelauCTel;
        int[] iArr = this.AuCTel;
        int i4 = this.fARcdN;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                int i6 = iArr[c];
                if (i6 == 0) {
                    bArr[i3] = (byte) c;
                    i3++;
                } else {
                    if (i6 > 0) {
                        bArr[i3] = 92;
                        iOLrzqt = i3 + 2;
                        bArr[i3 + 1] = (byte) i6;
                    } else {
                        iOLrzqt = gEmmrt(c, i3);
                    }
                    i3 = iOLrzqt;
                }
            } else {
                if (c > i4) {
                    iOLrzqt = gEmmrt(c, i3);
                } else if (c <= 2047) {
                    bArr[i3] = (byte) ((c >> 6) | 192);
                    int i7 = i3 + 2;
                    bArr[i3 + 1] = (byte) ((c & '?') | 128);
                    i3 = i7;
                } else {
                    iOLrzqt = OLrzqt(c, i3);
                }
                i3 = iOLrzqt;
            }
            i = i5;
        }
        this.zuBGHE = i3;
    }

    public final void AEQbTJ(java.lang.String str, int i, int i2) throws java.io.IOException {
        int iOLrzqt;
        if (this.zuBGHE + ((i2 - i) * 6) > this.AubY) {
            AuCTel();
        }
        int i3 = this.zuBGHE;
        byte[] bArr = this.AuCTelauCTel;
        int[] iArr = this.AuCTel;
        int i4 = this.fARcdN;
        while (i < i2) {
            int i5 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                int i6 = iArr[cCharAt];
                if (i6 == 0) {
                    bArr[i3] = (byte) cCharAt;
                    i3++;
                } else {
                    if (i6 > 0) {
                        bArr[i3] = 92;
                        iOLrzqt = i3 + 2;
                        bArr[i3 + 1] = (byte) i6;
                    } else {
                        iOLrzqt = gEmmrt(cCharAt, i3);
                    }
                    i3 = iOLrzqt;
                }
            } else {
                if (cCharAt > i4) {
                    iOLrzqt = gEmmrt(cCharAt, i3);
                } else if (cCharAt <= 2047) {
                    bArr[i3] = (byte) ((cCharAt >> 6) | 192);
                    int i7 = i3 + 2;
                    bArr[i3 + 1] = (byte) ((cCharAt & '?') | 128);
                    i3 = i7;
                } else {
                    iOLrzqt = OLrzqt(cCharAt, i3);
                }
                i3 = iOLrzqt;
            }
            i = i5;
        }
        this.zuBGHE = i3;
    }

    public final void OLrzqt(char[] cArr, int i, int i2) throws java.io.IOException {
        int iOLrzqt;
        if (this.zuBGHE + ((i2 - i) * 6) > this.AubY) {
            AuCTel();
        }
        int i3 = this.zuBGHE;
        byte[] bArr = this.AuCTelauCTel;
        int[] iArr = this.AuCTel;
        int i4 = this.fARcdN;
        if (i4 <= 0) {
            i4 = 65535;
        }
        CharacterEscapes characterEscapes = this.isConnected;
        while (i < i2) {
            int i5 = i + 1;
            char c = cArr[i];
            if (c <= 127) {
                int i6 = iArr[c];
                if (i6 == 0) {
                    bArr[i3] = (byte) c;
                    i3++;
                } else {
                    if (i6 > 0) {
                        bArr[i3] = 92;
                        iOLrzqt = i3 + 2;
                        bArr[i3 + 1] = (byte) i6;
                    } else if (i6 == -2) {
                        InterfaceC5501Ue escapeSequence = characterEscapes.getEscapeSequence(c);
                        if (escapeSequence == null) {
                            AEQbTJ("Invalid custom escape definitions; custom escape not found for character code 0x" + java.lang.Integer.toHexString(c) + ", although was supposed to have one");
                        }
                        iOLrzqt = copydefault(bArr, i3, escapeSequence, i2 - i5);
                    } else {
                        iOLrzqt = gEmmrt(c, i3);
                    }
                    i3 = iOLrzqt;
                }
            } else {
                if (c > i4) {
                    iOLrzqt = gEmmrt(c, i3);
                } else {
                    InterfaceC5501Ue escapeSequence2 = characterEscapes.getEscapeSequence(c);
                    if (escapeSequence2 != null) {
                        iOLrzqt = copydefault(bArr, i3, escapeSequence2, i2 - i5);
                    } else if (c <= 2047) {
                        bArr[i3] = (byte) ((c >> 6) | 192);
                        bArr[i3 + 1] = (byte) ((c & '?') | 128);
                        i3 += 2;
                    } else {
                        iOLrzqt = OLrzqt(c, i3);
                    }
                }
                i3 = iOLrzqt;
            }
            i = i5;
        }
        this.zuBGHE = i3;
    }

    public final void OLrzqt(java.lang.String str, int i, int i2) throws java.io.IOException {
        int iOLrzqt;
        if (this.zuBGHE + ((i2 - i) * 6) > this.AubY) {
            AuCTel();
        }
        int i3 = this.zuBGHE;
        byte[] bArr = this.AuCTelauCTel;
        int[] iArr = this.AuCTel;
        int i4 = this.fARcdN;
        if (i4 <= 0) {
            i4 = 65535;
        }
        CharacterEscapes characterEscapes = this.isConnected;
        while (i < i2) {
            int i5 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt <= 127) {
                int i6 = iArr[cCharAt];
                if (i6 == 0) {
                    bArr[i3] = (byte) cCharAt;
                    i3++;
                } else {
                    if (i6 > 0) {
                        bArr[i3] = 92;
                        iOLrzqt = i3 + 2;
                        bArr[i3 + 1] = (byte) i6;
                    } else if (i6 == -2) {
                        InterfaceC5501Ue escapeSequence = characterEscapes.getEscapeSequence(cCharAt);
                        if (escapeSequence == null) {
                            AEQbTJ("Invalid custom escape definitions; custom escape not found for character code 0x" + java.lang.Integer.toHexString(cCharAt) + ", although was supposed to have one");
                        }
                        iOLrzqt = copydefault(bArr, i3, escapeSequence, i2 - i5);
                    } else {
                        iOLrzqt = gEmmrt(cCharAt, i3);
                    }
                    i3 = iOLrzqt;
                }
            } else {
                if (cCharAt > i4) {
                    iOLrzqt = gEmmrt(cCharAt, i3);
                } else {
                    InterfaceC5501Ue escapeSequence2 = characterEscapes.getEscapeSequence(cCharAt);
                    if (escapeSequence2 != null) {
                        iOLrzqt = copydefault(bArr, i3, escapeSequence2, i2 - i5);
                    } else if (cCharAt <= 2047) {
                        bArr[i3] = (byte) ((cCharAt >> 6) | 192);
                        bArr[i3 + 1] = (byte) ((cCharAt & '?') | 128);
                        i3 += 2;
                    } else {
                        iOLrzqt = OLrzqt(cCharAt, i3);
                    }
                }
                i3 = iOLrzqt;
            }
            i = i5;
        }
        this.zuBGHE = i3;
    }

    public final int copydefault(byte[] bArr, int i, InterfaceC5501Ue interfaceC5501Ue, int i2) throws java.io.IOException {
        byte[] bArrAsUnquotedUTF8 = interfaceC5501Ue.asUnquotedUTF8();
        int length = bArrAsUnquotedUTF8.length;
        if (length > 6) {
            return EZpvd(bArr, i, this.AubY, bArrAsUnquotedUTF8, i2);
        }
        java.lang.System.arraycopy(bArrAsUnquotedUTF8, 0, bArr, i, length);
        return i + length;
    }

    public final int EZpvd(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws java.io.IOException {
        int length = bArr2.length;
        if (i + length > i2) {
            this.zuBGHE = i;
            AuCTel();
            i = this.zuBGHE;
            if (length > bArr.length) {
                this.sSMYrx.write(bArr2, 0, length);
                return i;
            }
        }
        java.lang.System.arraycopy(bArr2, 0, bArr, i, length);
        int i4 = i + length;
        if ((i3 * 6) + i4 <= i2) {
            return i4;
        }
        this.zuBGHE = i4;
        AuCTel();
        return this.zuBGHE;
    }

    public final void OLrzqt(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3;
        int iEncodeBase64Chunk;
        int i4 = this.AubY - 6;
        int maxLineLength = base64Variant.getMaxLineLength();
        loop0: while (true) {
            int i5 = maxLineLength >> 2;
            while (i <= i2 - 3) {
                if (this.zuBGHE > i4) {
                    AuCTel();
                }
                byte b = bArr[i];
                byte b2 = bArr[i + 1];
                i3 = i + 3;
                iEncodeBase64Chunk = base64Variant.encodeBase64Chunk((bArr[i + 2] & UnsignedBytes.MAX_VALUE) | (((b << 8) | (b2 & UnsignedBytes.MAX_VALUE)) << 8), this.AuCTelauCTel, this.zuBGHE);
                this.zuBGHE = iEncodeBase64Chunk;
                i5--;
                if (i5 <= 0) {
                    break;
                } else {
                    i = i3;
                }
            }
            byte[] bArr2 = this.AuCTelauCTel;
            bArr2[iEncodeBase64Chunk] = 92;
            this.zuBGHE = iEncodeBase64Chunk + 2;
            bArr2[iEncodeBase64Chunk + 1] = 110;
            maxLineLength = base64Variant.getMaxLineLength();
            i = i3;
        }
        int i6 = i2 - i;
        if (i6 > 0) {
            if (this.zuBGHE > i4) {
                AuCTel();
            }
            int i7 = bArr[i] << 16;
            if (i6 == 2) {
                i7 |= (bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 8;
            }
            this.zuBGHE = base64Variant.encodeBase64Partial(i7, i6, this.AuCTelauCTel, this.zuBGHE);
        }
    }

    public final int copydefault(Base64Variant base64Variant, java.io.InputStream inputStream, byte[] bArr, int i) throws java.io.IOException {
        int iKWHzl;
        int i2 = this.AubY - 6;
        int i3 = 2;
        int i4 = -3;
        int i5 = i;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i6 = 0;
        int iKWHzl2 = 0;
        while (true) {
            if (i5 <= 2) {
                break;
            }
            if (i6 > i4) {
                iKWHzl2 = KWHzl(inputStream, bArr, i6, iKWHzl2, i5);
                if (iKWHzl2 < 3) {
                    i6 = 0;
                    break;
                }
                i4 = iKWHzl2 - 3;
                i6 = 0;
            }
            if (this.zuBGHE > i2) {
                AuCTel();
            }
            int i7 = i6 + 3;
            i5 -= 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i6] << 8) | (bArr[i6 + 1] & UnsignedBytes.MAX_VALUE)) << 8) | (bArr[i6 + 2] & UnsignedBytes.MAX_VALUE), this.AuCTelauCTel, this.zuBGHE);
            this.zuBGHE = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this.AuCTelauCTel;
                bArr2[iEncodeBase64Chunk] = 92;
                this.zuBGHE = iEncodeBase64Chunk + 2;
                bArr2[iEncodeBase64Chunk + 1] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i6 = i7;
        }
        if (i5 <= 0 || (iKWHzl = KWHzl(inputStream, bArr, i6, iKWHzl2, i5)) <= 0) {
            return i5;
        }
        if (this.zuBGHE > i2) {
            AuCTel();
        }
        int i8 = bArr[0] << 16;
        if (1 < iKWHzl) {
            i8 |= (bArr[1] & UnsignedBytes.MAX_VALUE) << 8;
        } else {
            i3 = 1;
        }
        this.zuBGHE = base64Variant.encodeBase64Partial(i8, i3, this.AuCTelauCTel, this.zuBGHE);
        return i5 - i3;
    }

    public final int OLrzqt(Base64Variant base64Variant, java.io.InputStream inputStream, byte[] bArr) throws java.io.IOException {
        int i = this.AubY - 6;
        int i2 = 2;
        int i3 = -3;
        int i4 = 0;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i5 = 0;
        int iKWHzl = 0;
        int i6 = 0;
        while (true) {
            if (i5 > i3) {
                iKWHzl = KWHzl(inputStream, bArr, i5, iKWHzl, bArr.length);
                if (iKWHzl < 3) {
                    break;
                }
                i3 = iKWHzl - 3;
                i5 = i4;
            }
            if (this.zuBGHE > i) {
                AuCTel();
            }
            int i7 = i5 + 3;
            i6 += 3;
            int iEncodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i5] << 8) | (bArr[i5 + 1] & UnsignedBytes.MAX_VALUE)) << 8) | (bArr[i5 + 2] & UnsignedBytes.MAX_VALUE), this.AuCTelauCTel, this.zuBGHE);
            this.zuBGHE = iEncodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this.AuCTelauCTel;
                bArr2[iEncodeBase64Chunk] = 92;
                this.zuBGHE = iEncodeBase64Chunk + 2;
                bArr2[iEncodeBase64Chunk + 1] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i5 = i7;
            i4 = 0;
        }
        if (iKWHzl <= 0) {
            return i6;
        }
        if (this.zuBGHE > i) {
            AuCTel();
        }
        int i8 = bArr[i4] << 16;
        if (1 < iKWHzl) {
            i8 |= (bArr[1] & UnsignedBytes.MAX_VALUE) << 8;
        } else {
            i2 = 1;
        }
        int i9 = i6 + i2;
        this.zuBGHE = base64Variant.encodeBase64Partial(i8, i2, this.AuCTelauCTel, this.zuBGHE);
        return i9;
    }

    public final int KWHzl(java.io.InputStream inputStream, byte[] bArr, int i, int i2, int i3) throws java.io.IOException {
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

    public final int KWHzl(int i, char[] cArr, int i2, int i3) throws java.io.IOException {
        if (i >= 55296 && i <= 57343) {
            if (i2 >= i3 || cArr == null) {
                AEQbTJ(java.lang.String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", java.lang.Integer.valueOf(i)));
            } else {
                djBIcL(i, cArr[i2]);
            }
            return i2 + 1;
        }
        byte[] bArr = this.AuCTelauCTel;
        int i4 = this.zuBGHE;
        bArr[i4] = (byte) ((i >> 12) | 224);
        bArr[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
        this.zuBGHE = i4 + 3;
        bArr[i4 + 2] = (byte) ((i & 63) | 128);
        return i2;
    }

    public final void djBIcL(int i, int i2) throws java.io.IOException {
        int iEZpvd = EZpvd(i, i2);
        if (this.zuBGHE + 4 > this.AubY) {
            AuCTel();
        }
        byte[] bArr = this.AuCTelauCTel;
        int i3 = this.zuBGHE;
        bArr[i3] = (byte) ((iEZpvd >> 18) | PsExtractor.VIDEO_STREAM_MASK);
        bArr[i3 + 1] = (byte) (((iEZpvd >> 12) & 63) | 128);
        bArr[i3 + 2] = (byte) (((iEZpvd >> 6) & 63) | 128);
        this.zuBGHE = i3 + 4;
        bArr[i3 + 3] = (byte) ((iEZpvd & 63) | 128);
    }

    public final int OLrzqt(int i, int i2) throws java.io.IOException {
        byte[] bArrFARcdN = fARcdN();
        byte[] bArr = this.AuCTelauCTel;
        if (i >= 55296 && i <= 57343) {
            bArr[i2] = 92;
            bArr[i2 + 1] = 117;
            bArr[i2 + 2] = bArrFARcdN[(i >> 12) & 15];
            bArr[i2 + 3] = bArrFARcdN[(i >> 8) & 15];
            bArr[i2 + 4] = bArrFARcdN[(i >> 4) & 15];
            int i3 = i2 + 6;
            bArr[i2 + 5] = bArrFARcdN[i & 15];
            return i3;
        }
        bArr[i2] = (byte) ((i >> 12) | 224);
        bArr[i2 + 1] = (byte) (((i >> 6) & 63) | 128);
        int i4 = i2 + 3;
        bArr[i2 + 2] = (byte) ((i & 63) | 128);
        return i4;
    }

    public final void fIwbmz() throws java.io.IOException {
        if (this.zuBGHE + 4 >= this.AubY) {
            AuCTel();
        }
        java.lang.System.arraycopy(hDKMBd, 0, this.AuCTelauCTel, this.zuBGHE, 4);
        this.zuBGHE += 4;
    }

    public final int gEmmrt(int i, int i2) throws java.io.IOException {
        int i3;
        byte[] bArr = this.AuCTelauCTel;
        byte[] bArrFARcdN = fARcdN();
        bArr[i2] = 92;
        int i4 = i2 + 2;
        bArr[i2 + 1] = 117;
        if (i > 255) {
            int i5 = i >> 8;
            bArr[i4] = bArrFARcdN[(i5 & 255) >> 4];
            i3 = i2 + 4;
            bArr[i2 + 3] = bArrFARcdN[i5 & 15];
            i &= 255;
        } else {
            bArr[i4] = 48;
            i3 = i2 + 4;
            bArr[i2 + 3] = 48;
        }
        bArr[i3] = bArrFARcdN[i >> 4];
        bArr[i3 + 1] = bArrFARcdN[i & 15];
        return i3 + 2;
    }

    public final void AuCTel() throws java.io.IOException {
        int i = this.zuBGHE;
        if (i > 0) {
            this.zuBGHE = 0;
            this.sSMYrx.write(this.AuCTelauCTel, 0, i);
        }
    }
}
