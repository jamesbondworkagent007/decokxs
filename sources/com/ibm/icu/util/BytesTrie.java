package com.ibm.icu.util;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class BytesTrie implements Cloneable, Iterable<Application> {
    public static Result[] OLrzqt = {Result.INTERMEDIATE_VALUE, Result.FINAL_VALUE};
    public byte[] AEQbTJ;
    public int EZpvd;
    public int KWHzl;
    public int copydefault;

    public static int EZpvd(int i, int i2) {
        return i2 >= 162 ? i2 < 216 ? i + 1 : i2 < 252 ? i + 2 : i + ((i2 >> 1) & 1) + 3 : i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BytesTrie AEQbTJ() {
        this.EZpvd = this.KWHzl;
        this.copydefault = -1;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BytesTrie EZpvd(long j) {
        this.copydefault = (int) (j >> 32);
        this.EZpvd = (int) j;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long KWHzl() {
        return (((long) this.copydefault) << 32) | ((long) this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf() {
        this.EZpvd = -1;
    }

    public BytesTrie(byte[] bArr, int i) {
        this.AEQbTJ = bArr;
        this.KWHzl = i;
        this.EZpvd = i;
        this.copydefault = -1;
    }

    public BytesTrie(BytesTrie bytesTrie) {
        this.AEQbTJ = bytesTrie.AEQbTJ;
        this.KWHzl = bytesTrie.KWHzl;
        this.EZpvd = bytesTrie.EZpvd;
        this.copydefault = bytesTrie.copydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public BytesTrie clone() throws CloneNotSupportedException {
        return (BytesTrie) super.clone();
    }

    public enum Result {
        NO_MATCH,
        NO_VALUE,
        FINAL_VALUE,
        INTERMEDIATE_VALUE;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean matches() {
            return this != NO_MATCH;
        }

        public boolean hasValue() {
            return ordinal() >= 2;
        }

        public boolean hasNext() {
            return (ordinal() & 1) != 0;
        }
    }

    public Result OLrzqt(int i) {
        this.copydefault = -1;
        if (i < 0) {
            i += 256;
        }
        return copydefault(this.KWHzl, i);
    }

    public Result AEQbTJ(int i) {
        int i2 = this.EZpvd;
        if (i2 < 0) {
            return Result.NO_MATCH;
        }
        if (i < 0) {
            i += 256;
        }
        int i3 = this.copydefault;
        if (i3 >= 0) {
            byte[] bArr = this.AEQbTJ;
            int i4 = i2 + 1;
            if (i != (bArr[i2] & UnsignedBytes.MAX_VALUE)) {
                valueOf();
                return Result.NO_MATCH;
            }
            int i5 = i3 - 1;
            this.copydefault = i5;
            this.EZpvd = i4;
            if (i5 < 0) {
                byte b = bArr[i4];
                if ((b & UnsignedBytes.MAX_VALUE) >= 32) {
                    return OLrzqt[b & 1];
                }
            }
            return Result.NO_VALUE;
        }
        return copydefault(i2, i);
    }

    public int EZpvd() {
        int i = this.EZpvd;
        byte[] bArr = this.AEQbTJ;
        return AEQbTJ(bArr, i + 1, (bArr[i] & UnsignedBytes.MAX_VALUE) >> 1);
    }

    /* JADX DEBUG: Method merged with bridge method: iterator()Ljava/util/Iterator; */
    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ActionBar iterator() {
        return new ActionBar(this.AEQbTJ, this.EZpvd, this.copydefault, 0);
    }

    public static final class Application {
        public int AEQbTJ;
        public byte[] KWHzl;
        public int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(int i) {
            this.AEQbTJ = i;
        }

        public Application(int i) {
            this.KWHzl = new byte[i];
        }

        public byte OLrzqt(int i) {
            return this.KWHzl[i];
        }

        public final void EZpvd(int i) {
            byte[] bArr = this.KWHzl;
            if (bArr.length < i) {
                byte[] bArr2 = new byte[Math.min(bArr.length * 2, i * 2)];
                System.arraycopy(this.KWHzl, 0, bArr2, 0, this.AEQbTJ);
                this.KWHzl = bArr2;
            }
        }

        public final void AEQbTJ(byte b) {
            EZpvd(this.AEQbTJ + 1);
            byte[] bArr = this.KWHzl;
            int i = this.AEQbTJ;
            this.AEQbTJ = i + 1;
            bArr[i] = b;
        }

        public final void EZpvd(byte[] bArr, int i, int i2) {
            EZpvd(this.AEQbTJ + i2);
            System.arraycopy(bArr, i, this.KWHzl, this.AEQbTJ, i2);
            this.AEQbTJ += i2;
        }
    }

    public static final class ActionBar implements Iterator<Application> {
        public byte[] AEQbTJ;
        public ArrayList<Long> AYXKKw;
        public int AhwBna;
        public int EZpvd;
        public int KWHzl;
        public Application OLrzqt;
        public int copydefault;
        public int djBIcL;

        public ActionBar(byte[] bArr, int i, int i2, int i3) {
            this.AYXKKw = new ArrayList<>();
            this.AEQbTJ = bArr;
            this.EZpvd = i;
            this.djBIcL = i;
            this.KWHzl = i2;
            this.AhwBna = i2;
            this.copydefault = i3;
            Application application = new Application(i3 == 0 ? 32 : i3);
            this.OLrzqt = application;
            int i4 = this.AhwBna;
            if (i4 >= 0) {
                int i5 = i4 + 1;
                int i6 = this.copydefault;
                if (i6 > 0 && i5 > i6) {
                    i5 = i6;
                }
                application.EZpvd(this.AEQbTJ, this.djBIcL, i5);
                this.djBIcL += i5;
                this.AhwBna -= i5;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.djBIcL >= 0 || !this.AYXKKw.isEmpty();
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public Application next() {
            int iKWHzl = this.djBIcL;
            if (iKWHzl < 0) {
                if (this.AYXKKw.isEmpty()) {
                    throw new NoSuchElementException();
                }
                ArrayList<Long> arrayList = this.AYXKKw;
                long jLongValue = arrayList.remove(arrayList.size() - 1).longValue();
                int i = (int) jLongValue;
                int i2 = (int) (jLongValue >> 32);
                this.OLrzqt.copydefault(65535 & i);
                int i3 = i >>> 16;
                if (i3 <= 1) {
                    this.OLrzqt.AEQbTJ(this.AEQbTJ[i2]);
                    iKWHzl = i2 + 1;
                } else {
                    iKWHzl = KWHzl(i2, i3);
                    if (iKWHzl < 0) {
                        return this.OLrzqt;
                    }
                }
            }
            if (this.AhwBna >= 0) {
                return AEQbTJ();
            }
            while (true) {
                byte[] bArr = this.AEQbTJ;
                int i4 = iKWHzl + 1;
                byte b = bArr[iKWHzl];
                int i5 = b & UnsignedBytes.MAX_VALUE;
                if (i5 >= 32) {
                    boolean z = (b & 1) != 0;
                    this.OLrzqt.OLrzqt = BytesTrie.AEQbTJ(bArr, i4, i5 >> 1);
                    this.djBIcL = (z || (this.copydefault > 0 && this.OLrzqt.AEQbTJ == this.copydefault)) ? -1 : BytesTrie.EZpvd(i4, i5);
                    return this.OLrzqt;
                }
                if (this.copydefault > 0 && this.OLrzqt.AEQbTJ == this.copydefault) {
                    return AEQbTJ();
                }
                if (i5 >= 16) {
                    int i6 = i5 - 15;
                    if (this.copydefault > 0) {
                        int i7 = this.OLrzqt.AEQbTJ;
                        int i8 = this.copydefault;
                        if (i7 + i6 > i8) {
                            Application application = this.OLrzqt;
                            application.EZpvd(this.AEQbTJ, i4, i8 - application.AEQbTJ);
                            return AEQbTJ();
                        }
                    }
                    this.OLrzqt.EZpvd(this.AEQbTJ, i4, i6);
                    iKWHzl = i4 + i6;
                } else {
                    if (i5 == 0) {
                        i5 = this.AEQbTJ[i4] & UnsignedBytes.MAX_VALUE;
                        i4 = iKWHzl + 2;
                    }
                    iKWHzl = KWHzl(i4, i5 + 1);
                    if (iKWHzl < 0) {
                        return this.OLrzqt;
                    }
                }
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public final Application AEQbTJ() {
            this.djBIcL = -1;
            Application application = this.OLrzqt;
            application.OLrzqt = -1;
            return application;
        }

        public final int KWHzl(int i, int i2) {
            while (i2 > 5) {
                int i3 = i + 1;
                int i4 = i2 >> 1;
                this.AYXKKw.add(Long.valueOf((((long) BytesTrie.EZpvd(this.AEQbTJ, i3)) << 32) | ((long) ((i2 - i4) << 16)) | ((long) this.OLrzqt.AEQbTJ)));
                i = BytesTrie.KWHzl(this.AEQbTJ, i3);
                i2 = i4;
            }
            byte[] bArr = this.AEQbTJ;
            byte b = bArr[i];
            int i5 = i + 2;
            byte b2 = bArr[i + 1];
            int i6 = b2 & UnsignedBytes.MAX_VALUE;
            boolean z = (b2 & 1) != 0;
            int iAEQbTJ = BytesTrie.AEQbTJ(bArr, i5, i6 >> 1);
            int iEZpvd = BytesTrie.EZpvd(i5, i6);
            this.AYXKKw.add(Long.valueOf((((long) iEZpvd) << 32) | ((long) ((i2 - 1) << 16)) | ((long) this.OLrzqt.AEQbTJ)));
            this.OLrzqt.AEQbTJ(b);
            if (!z) {
                return iEZpvd + iAEQbTJ;
            }
            this.djBIcL = -1;
            this.OLrzqt.OLrzqt = iAEQbTJ;
            return -1;
        }
    }

    public static int AEQbTJ(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        if (i2 < 81) {
            return i2 - 16;
        }
        if (i2 < 108) {
            i3 = (i2 - 81) << 8;
            i4 = bArr[i];
        } else if (i2 < 126) {
            i3 = ((i2 - 108) << 16) | ((bArr[i] & 255) << 8);
            i4 = bArr[i + 1];
        } else if (i2 == 126) {
            i3 = ((bArr[i] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
            i4 = bArr[i + 2];
        } else {
            i3 = (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
            i4 = bArr[i + 3];
        }
        return i3 | (i4 & 255);
    }

    public static int OLrzqt(byte[] bArr, int i) {
        return EZpvd(i + 1, bArr[i] & UnsignedBytes.MAX_VALUE);
    }

    public static int KWHzl(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        if (i3 >= 192) {
            if (i3 < 240) {
                i3 = ((i3 - 192) << 8) | (bArr[i2] & 255);
                i2 = i + 2;
            } else if (i3 < 254) {
                i3 = ((bArr[i2] & 255) << 8) | ((i3 - 240) << 16) | (bArr[i + 2] & 255);
                i2 = i + 3;
            } else if (i3 == 254) {
                i3 = ((bArr[i2] & 255) << 16) | ((bArr[i + 2] & 255) << 8) | (bArr[i + 3] & 255);
                i2 = i + 4;
            } else {
                i3 = (bArr[i2] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 8) | (bArr[i + 4] & 255);
                i2 = i + 5;
            }
        }
        return i2 + i3;
    }

    public static int EZpvd(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = bArr[i];
        int i4 = i3 & 255;
        return i4 >= 192 ? i4 < 240 ? i + 2 : i4 < 254 ? i + 3 : i2 + (i3 & 1) + 3 : i2;
    }

    public final Result EZpvd(int i, int i2, int i3) {
        int i4;
        Result result;
        if (i2 == 0) {
            i2 = this.AEQbTJ[i] & UnsignedBytes.MAX_VALUE;
            i++;
        }
        int i5 = i2 + 1;
        while (i5 > 5) {
            byte[] bArr = this.AEQbTJ;
            int i6 = i + 1;
            if (i3 < (bArr[i] & UnsignedBytes.MAX_VALUE)) {
                i5 >>= 1;
                i = KWHzl(bArr, i6);
            } else {
                i5 -= i5 >> 1;
                i = EZpvd(bArr, i6);
            }
        }
        do {
            byte[] bArr2 = this.AEQbTJ;
            int i7 = i + 1;
            if (i3 == (bArr2[i] & UnsignedBytes.MAX_VALUE)) {
                byte b = bArr2[i7];
                if ((b & 1) != 0) {
                    result = Result.FINAL_VALUE;
                } else {
                    int i8 = i + 2;
                    int i9 = (b & UnsignedBytes.MAX_VALUE) >> 1;
                    if (i9 < 81) {
                        i4 = i9 - 16;
                    } else if (i9 < 108) {
                        i4 = ((i9 - 81) << 8) | (bArr2[i8] & UnsignedBytes.MAX_VALUE);
                        i8 = i + 3;
                    } else if (i9 < 126) {
                        i4 = ((i9 - 108) << 16) | ((bArr2[i8] & UnsignedBytes.MAX_VALUE) << 8) | (bArr2[i + 3] & UnsignedBytes.MAX_VALUE);
                        i8 = i + 4;
                    } else if (i9 == 126) {
                        i4 = ((bArr2[i8] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr2[i + 3] & UnsignedBytes.MAX_VALUE) << 8) | (bArr2[i + 4] & UnsignedBytes.MAX_VALUE);
                        i8 = i + 5;
                    } else {
                        i4 = (bArr2[i8] << Ascii.CAN) | ((bArr2[i + 3] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr2[i + 4] & UnsignedBytes.MAX_VALUE) << 8) | (bArr2[i + 5] & UnsignedBytes.MAX_VALUE);
                        i8 = i + 6;
                    }
                    i7 = i8 + i4;
                    byte b2 = bArr2[i7];
                    result = (b2 & UnsignedBytes.MAX_VALUE) >= 32 ? OLrzqt[b2 & 1] : Result.NO_VALUE;
                }
                this.EZpvd = i7;
                return result;
            }
            i5--;
            i = OLrzqt(bArr2, i7);
        } while (i5 > 1);
        byte[] bArr3 = this.AEQbTJ;
        int i10 = i + 1;
        if (i3 == (bArr3[i] & UnsignedBytes.MAX_VALUE)) {
            this.EZpvd = i10;
            byte b3 = bArr3[i10];
            return (b3 & UnsignedBytes.MAX_VALUE) >= 32 ? OLrzqt[b3 & 1] : Result.NO_VALUE;
        }
        valueOf();
        return Result.NO_MATCH;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        valueOf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        return com.ibm.icu.util.BytesTrie.Result.NO_MATCH;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Result copydefault(int i, int i2) {
        while (true) {
            byte[] bArr = this.AEQbTJ;
            int i3 = i + 1;
            byte b = bArr[i];
            int i4 = b & UnsignedBytes.MAX_VALUE;
            if (i4 < 16) {
                return EZpvd(i3, i4, i2);
            }
            if (i4 < 32) {
                int i5 = i + 2;
                if (i2 == (bArr[i3] & UnsignedBytes.MAX_VALUE)) {
                    int i6 = i4 - 17;
                    this.copydefault = i6;
                    this.EZpvd = i5;
                    if (i6 < 0) {
                        byte b2 = bArr[i5];
                        if ((b2 & UnsignedBytes.MAX_VALUE) >= 32) {
                            return OLrzqt[b2 & 1];
                        }
                    }
                    return Result.NO_VALUE;
                }
            } else {
                if ((b & 1) != 0) {
                    break;
                }
                i = EZpvd(i3, i4);
            }
        }
    }
}
