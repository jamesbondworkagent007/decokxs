package o;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes21.dex */
public final class UT {
    public final java.io.InputStream AEQbTJ;
    public final byte[] AYXKKw;
    public int EZpvd;
    public final boolean KWHzl;
    public boolean OLrzqt;
    public final C5517Ut copydefault;
    public int djBIcL;
    public int gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt(int i) {
        if ((65280 & i) == 0) {
            this.OLrzqt = true;
        } else {
            if ((i & 255) != 0) {
                return false;
            }
            this.OLrzqt = false;
        }
        this.EZpvd = 2;
        return true;
    }

    public UT(C5517Ut c5517Ut, java.io.InputStream inputStream) {
        this.OLrzqt = true;
        this.copydefault = c5517Ut;
        this.AEQbTJ = inputStream;
        this.AYXKKw = c5517Ut.AEQbTJ();
        this.gEmmrt = 0;
        this.djBIcL = 0;
        this.KWHzl = true;
    }

    public UT(C5517Ut c5517Ut, byte[] bArr, int i, int i2) {
        this.OLrzqt = true;
        this.copydefault = c5517Ut;
        this.AEQbTJ = null;
        this.AYXKKw = bArr;
        this.gEmmrt = i;
        this.djBIcL = i + i2;
        this.KWHzl = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonEncoding OLrzqt() throws java.io.IOException {
        JsonEncoding jsonEncoding;
        if (KWHzl(4)) {
            byte[] bArr = this.AYXKKw;
            int i = this.gEmmrt;
            int i2 = (bArr[i + 3] & UnsignedBytes.MAX_VALUE) | (bArr[i] << Ascii.CAN) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 8);
            if (EZpvd(i2) || AEQbTJ(i2) || OLrzqt(i2 >>> 16)) {
                int i3 = this.EZpvd;
                if (i3 == 1) {
                    jsonEncoding = JsonEncoding.UTF8;
                } else if (i3 == 2) {
                    jsonEncoding = this.OLrzqt ? JsonEncoding.UTF16_BE : JsonEncoding.UTF16_LE;
                } else if (i3 == 4) {
                    jsonEncoding = this.OLrzqt ? JsonEncoding.UTF32_BE : JsonEncoding.UTF32_LE;
                } else {
                    throw new java.lang.RuntimeException("Internal error");
                }
            } else {
                jsonEncoding = JsonEncoding.UTF8;
            }
        } else {
            if (KWHzl(2)) {
                byte[] bArr2 = this.AYXKKw;
                int i4 = this.gEmmrt;
                if (OLrzqt((bArr2[i4 + 1] & UnsignedBytes.MAX_VALUE) | ((bArr2[i4] & UnsignedBytes.MAX_VALUE) << 8))) {
                }
            }
            jsonEncoding = JsonEncoding.UTF8;
        }
        this.copydefault.KWHzl(jsonEncoding);
        return jsonEncoding;
    }

    public static int OLrzqt(java.io.DataInput dataInput) throws java.io.IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte != 239) {
            return unsignedByte;
        }
        int unsignedByte2 = dataInput.readUnsignedByte();
        if (unsignedByte2 != 187) {
            throw new java.io.IOException("Unexpected byte 0x" + java.lang.Integer.toHexString(unsignedByte2) + " following 0xEF; should get 0xBB as part of UTF-8 BOM");
        }
        int unsignedByte3 = dataInput.readUnsignedByte();
        if (unsignedByte3 != 191) {
            throw new java.io.IOException("Unexpected byte 0x" + java.lang.Integer.toHexString(unsignedByte3) + " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
        }
        return dataInput.readUnsignedByte();
    }

    public java.io.Reader copydefault() throws java.io.IOException {
        JsonEncoding jsonEncodingGEmmrt = this.copydefault.gEmmrt();
        int iBits = jsonEncodingGEmmrt.bits();
        if (iBits != 8 && iBits != 16) {
            if (iBits == 32) {
                C5517Ut c5517Ut = this.copydefault;
                return new C5523Uz(c5517Ut, this.AEQbTJ, this.AYXKKw, this.gEmmrt, this.djBIcL, c5517Ut.gEmmrt().isBigEndian());
            }
            throw new java.lang.RuntimeException("Internal error");
        }
        java.io.InputStream ua = this.AEQbTJ;
        if (ua == null) {
            ua = new java.io.ByteArrayInputStream(this.AYXKKw, this.gEmmrt, this.djBIcL);
        } else if (this.gEmmrt < this.djBIcL) {
            ua = new UA(this.copydefault, ua, this.AYXKKw, this.gEmmrt, this.djBIcL);
        }
        return new java.io.InputStreamReader(ua, jsonEncodingGEmmrt.getJavaName());
    }

    public JsonParser AEQbTJ(int i, AbstractC5505Ui abstractC5505Ui, C5532Vi c5532Vi, C5534Vk c5534Vk, int i2) throws java.io.IOException {
        int i3 = this.gEmmrt;
        JsonEncoding jsonEncodingOLrzqt = OLrzqt();
        int i4 = this.gEmmrt;
        if (jsonEncodingOLrzqt == JsonEncoding.UTF8 && JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i2)) {
            return new C5527Vd(this.copydefault, i, this.AEQbTJ, abstractC5505Ui, c5532Vi.AhwBna(i2), this.AYXKKw, this.gEmmrt, this.djBIcL, i4 - i3, this.KWHzl);
        }
        return new UZ(this.copydefault, i, copydefault(), abstractC5505Ui, c5534Vk.KWHzl(i2));
    }

    public static MatchStrength EZpvd(InterfaceC5513Uq interfaceC5513Uq) throws java.io.IOException {
        if (!interfaceC5513Uq.KWHzl()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte bCopydefault = interfaceC5513Uq.copydefault();
        if (bCopydefault == -17) {
            if (!interfaceC5513Uq.KWHzl()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (interfaceC5513Uq.copydefault() != -69) {
                return MatchStrength.NO_MATCH;
            }
            if (!interfaceC5513Uq.KWHzl()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (interfaceC5513Uq.copydefault() != -65) {
                return MatchStrength.NO_MATCH;
            }
            if (!interfaceC5513Uq.KWHzl()) {
                return MatchStrength.INCONCLUSIVE;
            }
            bCopydefault = interfaceC5513Uq.copydefault();
        }
        int iCopydefault = copydefault(interfaceC5513Uq, bCopydefault);
        if (iCopydefault < 0) {
            return MatchStrength.INCONCLUSIVE;
        }
        if (iCopydefault == 123) {
            int iKWHzl = KWHzl(interfaceC5513Uq);
            if (iKWHzl < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (iKWHzl == 34 || iKWHzl == 125) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.NO_MATCH;
        }
        if (iCopydefault == 91) {
            int iKWHzl2 = KWHzl(interfaceC5513Uq);
            if (iKWHzl2 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (iKWHzl2 == 93 || iKWHzl2 == 91) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.SOLID_MATCH;
        }
        MatchStrength matchStrength = MatchStrength.WEAK_MATCH;
        if (iCopydefault == 34) {
            return matchStrength;
        }
        if (iCopydefault <= 57 && iCopydefault >= 48) {
            return matchStrength;
        }
        if (iCopydefault == 45) {
            int iKWHzl3 = KWHzl(interfaceC5513Uq);
            if (iKWHzl3 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            return (iKWHzl3 > 57 || iKWHzl3 < 48) ? MatchStrength.NO_MATCH : matchStrength;
        }
        if (iCopydefault == 110) {
            return copydefault(interfaceC5513Uq, "ull", matchStrength);
        }
        if (iCopydefault == 116) {
            return copydefault(interfaceC5513Uq, "rue", matchStrength);
        }
        if (iCopydefault == 102) {
            return copydefault(interfaceC5513Uq, "alse", matchStrength);
        }
        return MatchStrength.NO_MATCH;
    }

    public static MatchStrength copydefault(InterfaceC5513Uq interfaceC5513Uq, java.lang.String str, MatchStrength matchStrength) throws java.io.IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!interfaceC5513Uq.KWHzl()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (interfaceC5513Uq.copydefault() != str.charAt(i)) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    public static int KWHzl(InterfaceC5513Uq interfaceC5513Uq) throws java.io.IOException {
        if (interfaceC5513Uq.KWHzl()) {
            return copydefault(interfaceC5513Uq, interfaceC5513Uq.copydefault());
        }
        return -1;
    }

    public static int copydefault(InterfaceC5513Uq interfaceC5513Uq, byte b) throws java.io.IOException {
        while (true) {
            int i = b & UnsignedBytes.MAX_VALUE;
            if (i != 32 && i != 13 && i != 10 && i != 9) {
                return i;
            }
            if (!interfaceC5513Uq.KWHzl()) {
                return -1;
            }
            b = interfaceC5513Uq.copydefault();
        }
    }

    public final boolean EZpvd(int i) throws java.io.IOException {
        if (i == -16842752) {
            AEQbTJ("3412");
        } else {
            if (i == -131072) {
                this.gEmmrt += 4;
                this.EZpvd = 4;
                this.OLrzqt = false;
                return true;
            }
            if (i == 65279) {
                this.OLrzqt = true;
                this.gEmmrt += 4;
                this.EZpvd = 4;
                return true;
            }
            if (i == 65534) {
                AEQbTJ("2143");
            }
        }
        int i2 = i >>> 16;
        if (i2 == 65279) {
            this.gEmmrt += 2;
            this.EZpvd = 2;
            this.OLrzqt = true;
            return true;
        }
        if (i2 == 65534) {
            this.gEmmrt += 2;
            this.EZpvd = 2;
            this.OLrzqt = false;
            return true;
        }
        if ((i >>> 8) != 15711167) {
            return false;
        }
        this.gEmmrt += 3;
        this.EZpvd = 1;
        this.OLrzqt = true;
        return true;
    }

    public final boolean AEQbTJ(int i) throws java.io.IOException {
        if ((i >> 8) == 0) {
            this.OLrzqt = true;
        } else if ((16777215 & i) == 0) {
            this.OLrzqt = false;
        } else if (((-16711681) & i) == 0) {
            AEQbTJ("3412");
        } else {
            if ((i & (-65281)) != 0) {
                return false;
            }
            AEQbTJ("2143");
        }
        this.EZpvd = 4;
        return true;
    }

    public final void AEQbTJ(java.lang.String str) throws java.io.IOException {
        throw new java.io.CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    public boolean KWHzl(int i) throws java.io.IOException {
        int i2;
        int i3 = this.djBIcL - this.gEmmrt;
        while (i3 < i) {
            java.io.InputStream inputStream = this.AEQbTJ;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = this.AYXKKw;
                int i4 = this.djBIcL;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this.djBIcL += i2;
            i3 += i2;
        }
        return true;
    }
}
