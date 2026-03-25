package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import okio.Utf8;

/* JADX INFO: loaded from: classes21.dex */
public final class UG extends java.io.Writer {
    public java.io.OutputStream AEQbTJ;
    public byte[] EZpvd;
    public final C5517Ut KWHzl;
    public int OLrzqt = 0;
    public final int copydefault;
    public int valueOf;

    public UG(C5517Ut c5517Ut, java.io.OutputStream outputStream) {
        this.KWHzl = c5517Ut;
        this.AEQbTJ = outputStream;
        this.EZpvd = c5517Ut.copydefault();
        this.copydefault = r1.length - 4;
    }

    /* JADX DEBUG: Method merged with bridge method: append(C)Ljava/lang/Appendable; */
    @Override // java.io.Writer, java.lang.Appendable
    public java.io.Writer append(char c) throws java.io.IOException {
        write(c);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        java.io.OutputStream outputStream = this.AEQbTJ;
        if (outputStream != null) {
            int i = this.OLrzqt;
            if (i > 0) {
                outputStream.write(this.EZpvd, 0, i);
                this.OLrzqt = 0;
            }
            java.io.OutputStream outputStream2 = this.AEQbTJ;
            this.AEQbTJ = null;
            byte[] bArr = this.EZpvd;
            if (bArr != null) {
                this.EZpvd = null;
                this.KWHzl.KWHzl(bArr);
            }
            outputStream2.close();
            int i2 = this.valueOf;
            this.valueOf = 0;
            if (i2 > 0) {
                copydefault(i2);
            }
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws java.io.IOException {
        java.io.OutputStream outputStream = this.AEQbTJ;
        if (outputStream != null) {
            int i = this.OLrzqt;
            if (i > 0) {
                outputStream.write(this.EZpvd, 0, i);
                this.OLrzqt = 0;
            }
            this.AEQbTJ.flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws java.io.IOException {
        write(cArr, 0, cArr.length);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws java.io.IOException {
        int i3;
        if (i2 < 2) {
            if (i2 == 1) {
                write(cArr[i]);
                return;
            }
            return;
        }
        if (this.valueOf > 0) {
            i2--;
            write(EZpvd(cArr[i]));
            i++;
        }
        int i4 = this.OLrzqt;
        byte[] bArr = this.EZpvd;
        int i5 = this.copydefault;
        int i6 = i2 + i;
        while (i < i6) {
            if (i4 >= i5) {
                this.AEQbTJ.write(bArr, 0, i4);
                i4 = 0;
            }
            int i7 = i + 1;
            char c = cArr[i];
            if (c < 128) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) c;
                int i9 = i6 - i7;
                int i10 = i5 - i8;
                int i11 = i9 > i10 ? i10 : i9;
                i = i7;
                i4 = i8;
                while (i < i11 + i7) {
                    int i12 = i + 1;
                    c = cArr[i];
                    if (c >= 128) {
                        i7 = i12;
                    } else {
                        bArr[i4] = (byte) c;
                        i = i12;
                        i4++;
                    }
                }
            }
            if (c < 2048) {
                bArr[i4] = (byte) ((c >> 6) | 192);
                i3 = i4 + 2;
                bArr[i4 + 1] = (byte) ((c & '?') | 128);
            } else if (c < 55296 || c > 57343) {
                bArr[i4] = (byte) ((c >> '\f') | 224);
                bArr[i4 + 1] = (byte) (((c >> 6) & 63) | 128);
                i3 = i4 + 3;
                bArr[i4 + 2] = (byte) ((c & '?') | 128);
            } else {
                if (c > 56319) {
                    this.OLrzqt = i4;
                    copydefault(c);
                }
                this.valueOf = c;
                if (i7 >= i6) {
                    break;
                }
                i = i7 + 1;
                int iEZpvd = EZpvd(cArr[i7]);
                if (iEZpvd > 1114111) {
                    this.OLrzqt = i4;
                    copydefault(iEZpvd);
                }
                bArr[i4] = (byte) ((iEZpvd >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                bArr[i4 + 1] = (byte) (((iEZpvd >> 12) & 63) | 128);
                bArr[i4 + 2] = (byte) (((iEZpvd >> 6) & 63) | 128);
                bArr[i4 + 3] = (byte) ((iEZpvd & 63) | 128);
                i4 += 4;
            }
            i4 = i3;
            i = i7;
        }
        this.OLrzqt = i4;
    }

    @Override // java.io.Writer
    public void write(int i) throws java.io.IOException {
        int i2;
        if (this.valueOf > 0) {
            i = EZpvd(i);
        } else if (i >= 55296 && i <= 57343) {
            if (i > 56319) {
                copydefault(i);
            }
            this.valueOf = i;
            return;
        }
        int i3 = this.OLrzqt;
        if (i3 >= this.copydefault) {
            this.AEQbTJ.write(this.EZpvd, 0, i3);
            this.OLrzqt = 0;
        }
        if (i < 128) {
            byte[] bArr = this.EZpvd;
            int i4 = this.OLrzqt;
            this.OLrzqt = i4 + 1;
            bArr[i4] = (byte) i;
            return;
        }
        int i5 = this.OLrzqt;
        if (i < 2048) {
            byte[] bArr2 = this.EZpvd;
            bArr2[i5] = (byte) ((i >> 6) | 192);
            i2 = i5 + 2;
            bArr2[i5 + 1] = (byte) ((i & 63) | 128);
        } else if (i <= 65535) {
            byte[] bArr3 = this.EZpvd;
            bArr3[i5] = (byte) ((i >> 12) | 224);
            bArr3[i5 + 1] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 3;
            bArr3[i5 + 2] = (byte) ((i & 63) | 128);
        } else {
            if (i > 1114111) {
                copydefault(i);
            }
            byte[] bArr4 = this.EZpvd;
            bArr4[i5] = (byte) ((i >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            bArr4[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
            bArr4[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
            i2 = i5 + 4;
            bArr4[i5 + 3] = (byte) ((i & 63) | 128);
        }
        this.OLrzqt = i2;
    }

    @Override // java.io.Writer
    public void write(java.lang.String str) throws java.io.IOException {
        write(str, 0, str.length());
    }

    @Override // java.io.Writer
    public void write(java.lang.String str, int i, int i2) throws java.io.IOException {
        int i3;
        if (i2 < 2) {
            if (i2 == 1) {
                write(str.charAt(i));
                return;
            }
            return;
        }
        if (this.valueOf > 0) {
            i2--;
            write(EZpvd(str.charAt(i)));
            i++;
        }
        int i4 = this.OLrzqt;
        byte[] bArr = this.EZpvd;
        int i5 = this.copydefault;
        int i6 = i2 + i;
        while (i < i6) {
            if (i4 >= i5) {
                this.AEQbTJ.write(bArr, 0, i4);
                i4 = 0;
            }
            int i7 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) cCharAt;
                int i9 = i6 - i7;
                int i10 = i5 - i8;
                int i11 = i9 > i10 ? i10 : i9;
                i = i7;
                i4 = i8;
                while (i < i11 + i7) {
                    int i12 = i + 1;
                    cCharAt = str.charAt(i);
                    if (cCharAt >= 128) {
                        i7 = i12;
                    } else {
                        bArr[i4] = (byte) cCharAt;
                        i = i12;
                        i4++;
                    }
                }
            }
            if (cCharAt < 2048) {
                bArr[i4] = (byte) ((cCharAt >> 6) | 192);
                i3 = i4 + 2;
                bArr[i4 + 1] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                bArr[i4] = (byte) ((cCharAt >> '\f') | 224);
                bArr[i4 + 1] = (byte) (((cCharAt >> 6) & 63) | 128);
                i3 = i4 + 3;
                bArr[i4 + 2] = (byte) ((cCharAt & '?') | 128);
            } else {
                if (cCharAt > 56319) {
                    this.OLrzqt = i4;
                    copydefault(cCharAt);
                }
                this.valueOf = cCharAt;
                if (i7 >= i6) {
                    break;
                }
                i = i7 + 1;
                int iEZpvd = EZpvd(str.charAt(i7));
                if (iEZpvd > 1114111) {
                    this.OLrzqt = i4;
                    copydefault(iEZpvd);
                }
                bArr[i4] = (byte) ((iEZpvd >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                bArr[i4 + 1] = (byte) (((iEZpvd >> 12) & 63) | 128);
                bArr[i4 + 2] = (byte) (((iEZpvd >> 6) & 63) | 128);
                bArr[i4 + 3] = (byte) ((iEZpvd & 63) | 128);
                i4 += 4;
            }
            i4 = i3;
            i = i7;
        }
        this.OLrzqt = i4;
    }

    public int EZpvd(int i) throws java.io.IOException {
        int i2 = this.valueOf;
        this.valueOf = 0;
        if (i >= 56320 && i <= 57343) {
            return ((i2 - 55296) << 10) + 65536 + (i - Utf8.LOG_SURROGATE_HEADER);
        }
        throw new java.io.IOException("Broken surrogate pair: first char 0x" + java.lang.Integer.toHexString(i2) + ", second 0x" + java.lang.Integer.toHexString(i) + "; illegal combination");
    }

    public static void copydefault(int i) throws java.io.IOException {
        throw new java.io.IOException(OLrzqt(i));
    }

    public static java.lang.String OLrzqt(int i) {
        if (i > 1114111) {
            return "Illegal character point (0x" + java.lang.Integer.toHexString(i) + ") to output; max is 0x10FFFF as per RFC 4627";
        }
        if (i < 55296) {
            return "Illegal character point (0x" + java.lang.Integer.toHexString(i) + ") to output";
        }
        if (i <= 56319) {
            return "Unmatched first part of surrogate pair (0x" + java.lang.Integer.toHexString(i) + ")";
        }
        return "Unmatched second part of surrogate pair (0x" + java.lang.Integer.toHexString(i) + ")";
    }
}
