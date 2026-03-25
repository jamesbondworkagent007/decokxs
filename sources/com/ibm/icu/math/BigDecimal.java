package com.ibm.icu.math;

import java.io.Serializable;
import java.math.BigInteger;
import o.C7223afl;

/* JADX INFO: loaded from: classes3.dex */
public class BigDecimal extends Number implements Serializable, Comparable<BigDecimal> {
    private static final int MaxArg = 999999999;
    private static final int MaxExp = 999999999;
    private static final int MinArg = -999999999;
    private static final int MinExp = -999999999;
    public static final int ROUND_CEILING = 2;
    public static final int ROUND_DOWN = 1;
    public static final int ROUND_FLOOR = 3;
    public static final int ROUND_HALF_DOWN = 5;
    public static final int ROUND_HALF_EVEN = 6;
    public static final int ROUND_HALF_UP = 4;
    public static final int ROUND_UNNECESSARY = 7;
    public static final int ROUND_UP = 0;
    private static final byte isneg = -1;
    private static final byte ispos = 1;
    private static final byte iszero = 0;
    private static final long serialVersionUID = 8245355804974198832L;
    private int exp;
    private byte form;
    private byte ind;
    private byte[] mant;
    public static final BigDecimal ZERO = new BigDecimal(0L);
    public static final BigDecimal ONE = new BigDecimal(1L);
    public static final BigDecimal TEN = new BigDecimal(10);
    private static final MathContext plainMC = new MathContext(0, 0);
    private static byte[] bytecar = new byte[190];
    private static byte[] bytedig = diginit();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int scale() {
        int i = this.exp;
        if (i >= 0) {
            return 0;
        }
        return -i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int signum() {
        return this.ind;
    }

    public BigDecimal(java.math.BigDecimal bigDecimal) {
        this(bigDecimal.toString());
    }

    public BigDecimal(BigInteger bigInteger) {
        this(bigInteger.toString(10));
    }

    public BigDecimal(BigInteger bigInteger, int i) {
        this(bigInteger.toString(10));
        if (i >= 0) {
            this.exp = -i;
            return;
        }
        throw new NumberFormatException("Negative scale: " + i);
    }

    public BigDecimal(char[] cArr) {
        this(cArr, 0, cArr.length);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BigDecimal(char[] cArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        boolean z2;
        byte[] bArr;
        int i8;
        boolean z3;
        int iKWHzl;
        this.form = (byte) 0;
        if (i2 <= 0) {
            bad(cArr);
        }
        this.ind = (byte) 1;
        char c = cArr[i];
        int i9 = -1;
        if (c == '-') {
            i4 = i2 - 1;
            if (i4 == 0) {
                bad(cArr);
            }
            this.ind = (byte) -1;
        } else if (c == '+') {
            i4 = i2 - 1;
            if (i4 == 0) {
                bad(cArr);
            }
        } else {
            i3 = i;
            i4 = i2;
            i5 = 0;
            z = false;
            i6 = i4;
            i7 = -1;
            int i10 = i3;
            while (i6 > 0) {
                char c2 = cArr[i10];
                if (c2 >= '0' && c2 <= '9') {
                    i5++;
                    i7 = i10;
                } else if (c2 == '.') {
                    if (i9 >= 0) {
                        bad(cArr);
                    }
                    i9 = i10 - i3;
                } else if (c2 != 'e' && c2 != 'E') {
                    if (!C7223afl.gEmmrt(c2)) {
                        bad(cArr);
                    }
                    i5++;
                    i7 = i10;
                    z = true;
                } else {
                    if (i10 - i3 > i4 - 2) {
                        bad(cArr);
                    }
                    int i11 = i10 + 1;
                    char c3 = cArr[i11];
                    if (c3 == '-') {
                        i8 = i10 + 2;
                        z3 = true;
                    } else {
                        i8 = c3 == '+' ? i10 + 2 : i11;
                        z3 = false;
                    }
                    int i12 = i4 - (i8 - i3);
                    if ((i12 == 0) | (i12 > 9)) {
                        bad(cArr);
                    }
                    while (i12 > 0) {
                        char c4 = cArr[i8];
                        if (c4 < '0') {
                            bad(cArr);
                        }
                        if (c4 > '9') {
                            if (!C7223afl.gEmmrt(c4)) {
                                bad(cArr);
                            }
                            iKWHzl = C7223afl.KWHzl(c4, 10);
                            if (iKWHzl < 0) {
                                bad(cArr);
                            }
                        } else {
                            iKWHzl = c4 - '0';
                        }
                        this.exp = (this.exp * 10) + iKWHzl;
                        i12--;
                        i8++;
                    }
                    if (z3) {
                        this.exp = -this.exp;
                    }
                    z2 = true;
                    if (i5 == 0) {
                        bad(cArr);
                    }
                    if (i9 >= 0) {
                        this.exp = (this.exp + i9) - i5;
                    }
                    int i13 = i3;
                    while (i3 <= i7 - 1) {
                        char c5 = cArr[i3];
                        if (c5 != '0') {
                            if (c5 != '.') {
                                if (c5 <= '9' || C7223afl.KWHzl(c5, 10) != 0) {
                                    break;
                                }
                                i13++;
                                i9--;
                                i5--;
                            } else {
                                i13++;
                                i9--;
                            }
                        } else {
                            i13++;
                            i9--;
                            i5--;
                        }
                        i3++;
                    }
                    this.mant = new byte[i5];
                    if (z) {
                        int i14 = 0;
                        while (i5 > 0) {
                            i13 = i14 == i9 ? i13 + 1 : i13;
                            char c6 = cArr[i13];
                            if (c6 <= '9') {
                                this.mant[i14] = (byte) (c6 - '0');
                            } else {
                                int iKWHzl2 = C7223afl.KWHzl(c6, 10);
                                if (iKWHzl2 < 0) {
                                    bad(cArr);
                                }
                                this.mant[i14] = (byte) iKWHzl2;
                            }
                            i13++;
                            i5--;
                            i14++;
                        }
                    } else {
                        int i15 = 0;
                        while (i5 > 0) {
                            if (i15 == i9) {
                                i13++;
                            }
                            this.mant[i15] = (byte) (cArr[i13] - '0');
                            i13++;
                            i5--;
                            i15++;
                        }
                    }
                    bArr = this.mant;
                    if (bArr[0] == 0) {
                        this.ind = (byte) 0;
                        if (this.exp > 0) {
                            this.exp = 0;
                        }
                        if (z2) {
                            this.mant = ZERO.mant;
                            this.exp = 0;
                            return;
                        }
                        return;
                    }
                    if (z2) {
                        this.form = (byte) 1;
                        int length = (this.exp + bArr.length) - 1;
                        if ((length < -999999999) || (length > 999999999)) {
                            bad(cArr);
                            return;
                        }
                        return;
                    }
                    return;
                }
                i6--;
                i10++;
            }
            z2 = false;
            if (i5 == 0) {
            }
            if (i9 >= 0) {
            }
            int i132 = i3;
            while (i3 <= i7 - 1) {
            }
            this.mant = new byte[i5];
            if (z) {
            }
            bArr = this.mant;
            if (bArr[0] == 0) {
            }
        }
        i3 = i + 1;
        i5 = 0;
        z = false;
        i6 = i4;
        i7 = -1;
        int i102 = i3;
        while (i6 > 0) {
        }
        z2 = false;
        if (i5 == 0) {
        }
        if (i9 >= 0) {
        }
        int i1322 = i3;
        while (i3 <= i7 - 1) {
        }
        this.mant = new byte[i5];
        if (z) {
        }
        bArr = this.mant;
        if (bArr[0] == 0) {
        }
    }

    public BigDecimal(double d) {
        this(new java.math.BigDecimal(d).toString());
    }

    public BigDecimal(int i) {
        this.form = (byte) 0;
        if (i <= 9 && i >= -9) {
            if (i == 0) {
                this.mant = ZERO.mant;
                this.ind = (byte) 0;
                return;
            }
            if (i == 1) {
                this.mant = ONE.mant;
                this.ind = (byte) 1;
                return;
            }
            if (i == -1) {
                this.mant = ONE.mant;
            } else {
                byte[] bArr = new byte[1];
                this.mant = bArr;
                if (i > 0) {
                    bArr[0] = (byte) i;
                    this.ind = (byte) 1;
                    return;
                }
                bArr[0] = (byte) (-i);
            }
            this.ind = (byte) -1;
            return;
        }
        if (i > 0) {
            this.ind = (byte) 1;
            i = -i;
        } else {
            this.ind = (byte) -1;
        }
        int i2 = i;
        int i3 = 9;
        while (true) {
            i2 /= 10;
            if (i2 == 0) {
                break;
            } else {
                i3--;
            }
        }
        this.mant = new byte[10 - i3];
        int i4 = 9 - i3;
        while (true) {
            this.mant[i4] = (byte) (-((byte) (i % 10)));
            i /= 10;
            if (i == 0) {
                return;
            } else {
                i4--;
            }
        }
    }

    public BigDecimal(long j) {
        this.form = (byte) 0;
        if (j > 0) {
            this.ind = (byte) 1;
            j = -j;
        } else {
            this.ind = j != 0 ? (byte) -1 : (byte) 0;
        }
        long j2 = j;
        int i = 18;
        while (true) {
            j2 /= 10;
            if (j2 == 0) {
                break;
            } else {
                i--;
            }
        }
        this.mant = new byte[19 - i];
        int i2 = 18 - i;
        while (true) {
            this.mant[i2] = (byte) (-((byte) (j % 10)));
            j /= 10;
            if (j == 0) {
                return;
            } else {
                i2--;
            }
        }
    }

    public BigDecimal(String str) {
        this(str.toCharArray(), 0, str.length());
    }

    private BigDecimal() {
        this.form = (byte) 0;
    }

    public BigDecimal abs() {
        return abs(plainMC);
    }

    public BigDecimal abs(MathContext mathContext) {
        if (this.ind == -1) {
            return negate(mathContext);
        }
        return plus(mathContext);
    }

    public BigDecimal add(BigDecimal bigDecimal) {
        return add(bigDecimal, plainMC);
    }

    public BigDecimal add(BigDecimal bigDecimal, MathContext mathContext) {
        BigDecimal bigDecimalRound;
        int i;
        byte[] bArr;
        int i2;
        byte[] bArr2;
        int i3;
        byte b;
        BigDecimal bigDecimalRound2 = bigDecimal;
        if (mathContext.lostDigits) {
            checkdigits(bigDecimalRound2, mathContext.digits);
        }
        if (this.ind == 0 && mathContext.form != 0) {
            return bigDecimal.plus(mathContext);
        }
        if (bigDecimalRound2.ind == 0 && mathContext.form != 0) {
            return plus(mathContext);
        }
        int i4 = mathContext.digits;
        if (i4 > 0) {
            bigDecimalRound = this.mant.length > i4 ? clone(this).round(mathContext) : this;
            if (bigDecimalRound2.mant.length > i4) {
                bigDecimalRound2 = clone(bigDecimal).round(mathContext);
            }
        } else {
            bigDecimalRound = this;
        }
        BigDecimal bigDecimal2 = new BigDecimal();
        byte[] bArr3 = bigDecimalRound.mant;
        int length = bArr3.length;
        byte[] bArr4 = bigDecimalRound2.mant;
        int length2 = bArr4.length;
        int i5 = bigDecimalRound.exp;
        int i6 = bigDecimalRound2.exp;
        if (i5 == i6) {
            bigDecimal2.exp = i5;
        } else if (i5 > i6) {
            int i7 = (length + i5) - i6;
            if (i7 >= length2 + i4 + 1 && i4 > 0) {
                bigDecimal2.mant = bArr3;
                bigDecimal2.exp = i5;
                bigDecimal2.ind = bigDecimalRound.ind;
                if (length < i4) {
                    bigDecimal2.mant = extend(bigDecimalRound.mant, i4);
                    bigDecimal2.exp -= i4 - length;
                }
                return bigDecimal2.finish(mathContext, false);
            }
            bigDecimal2.exp = i6;
            int i8 = i4 + 1;
            if (i7 > i8 && i4 > 0) {
                int i9 = (i7 - i4) - 1;
                length2 -= i9;
                bigDecimal2.exp = i6 + i9;
                i7 = i8;
            }
            if (i7 > length) {
                length = i7;
            }
        } else {
            int i10 = (length2 + i6) - i5;
            if (i10 >= length + i4 + 1 && i4 > 0) {
                bigDecimal2.mant = bArr4;
                bigDecimal2.exp = i6;
                bigDecimal2.ind = bigDecimalRound2.ind;
                if (length2 < i4) {
                    bigDecimal2.mant = extend(bigDecimalRound2.mant, i4);
                    bigDecimal2.exp -= i4 - length2;
                }
                return bigDecimal2.finish(mathContext, false);
            }
            bigDecimal2.exp = i5;
            int i11 = i4 + 1;
            if (i10 > i11 && i4 > 0) {
                int i12 = (i10 - i4) - 1;
                length -= i12;
                bigDecimal2.exp = i5 + i12;
                i10 = i11;
            }
            if (i10 > length2) {
                length2 = i10;
            }
        }
        byte b2 = bigDecimalRound.ind;
        if (b2 == 0) {
            bigDecimal2.ind = (byte) 1;
        } else {
            bigDecimal2.ind = b2;
        }
        byte b3 = bigDecimalRound.ind;
        boolean z = b3 == -1;
        byte b4 = bigDecimalRound2.ind;
        if (z == (b4 == -1)) {
            i2 = length;
            bArr2 = bArr4;
            i3 = length2;
            i = 1;
            bArr = bArr3;
        } else if (b4 != 0) {
            if ((length < length2) || (b3 == 0)) {
                bigDecimal2.ind = (byte) (-bigDecimal2.ind);
            } else {
                if (length <= length2) {
                    int length3 = bArr3.length;
                    int length4 = bArr4.length - 1;
                    int i13 = 0;
                    int i14 = 0;
                    while (true) {
                        if (i13 <= length3 - 1) {
                            b = bArr3[i13];
                        } else if (i14 <= length4) {
                            b = 0;
                        } else if (mathContext.form != 0) {
                            return ZERO;
                        }
                        byte b5 = i14 <= length4 ? bArr4[i14] : (byte) 0;
                        if (b == b5) {
                            i13++;
                            i14++;
                        } else if (b < b5) {
                            bigDecimal2.ind = (byte) (-bigDecimal2.ind);
                        }
                    }
                }
                i = -1;
                bArr = bArr3;
                i2 = length;
                bArr2 = bArr4;
                i3 = length2;
            }
            i = -1;
            bArr2 = bArr3;
            i3 = length;
            bArr = bArr4;
            i2 = length2;
        } else {
            i = -1;
            bArr = bArr3;
            i2 = length;
            bArr2 = bArr4;
            i3 = length2;
        }
        bigDecimal2.mant = byteaddsub(bArr, i2, bArr2, i3, i, false);
        return bigDecimal2.finish(mathContext, false);
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(BigDecimal bigDecimal) {
        return compareTo(bigDecimal, plainMC);
    }

    public int compareTo(BigDecimal bigDecimal, MathContext mathContext) {
        if (mathContext.lostDigits) {
            checkdigits(bigDecimal, mathContext.digits);
        }
        byte b = this.ind;
        byte b2 = bigDecimal.ind;
        if ((b == b2) && (this.exp == bigDecimal.exp)) {
            int length = this.mant.length;
            byte[] bArr = bigDecimal.mant;
            if (length < bArr.length) {
                return (byte) (-b);
            }
            if (length > bArr.length) {
                return b;
            }
            int i = mathContext.digits;
            if ((length <= i) | (i == 0)) {
                int i2 = 0;
                while (length > 0) {
                    byte b3 = this.mant[i2];
                    byte b4 = bigDecimal.mant[i2];
                    if (b3 < b4) {
                        return (byte) (-this.ind);
                    }
                    if (b3 > b4) {
                        return this.ind;
                    }
                    length--;
                    i2++;
                }
                return 0;
            }
        } else {
            if (b < b2) {
                return -1;
            }
            if (b > b2) {
                return 1;
            }
        }
        BigDecimal bigDecimalClone = clone(bigDecimal);
        bigDecimalClone.ind = (byte) (-bigDecimalClone.ind);
        return add(bigDecimalClone, mathContext).ind;
    }

    public BigDecimal divide(BigDecimal bigDecimal) {
        return dodivide('D', bigDecimal, plainMC, -1);
    }

    public BigDecimal divide(BigDecimal bigDecimal, int i) {
        return dodivide('D', bigDecimal, new MathContext(0, 0, false, i), -1);
    }

    public BigDecimal divide(BigDecimal bigDecimal, int i, int i2) {
        if (i < 0) {
            throw new ArithmeticException("Negative scale: " + i);
        }
        return dodivide('D', bigDecimal, new MathContext(0, 0, false, i2), i);
    }

    public BigDecimal divide(BigDecimal bigDecimal, MathContext mathContext) {
        return dodivide('D', bigDecimal, mathContext, -1);
    }

    public BigDecimal divideInteger(BigDecimal bigDecimal) {
        return dodivide('I', bigDecimal, plainMC, 0);
    }

    public BigDecimal divideInteger(BigDecimal bigDecimal, MathContext mathContext) {
        return dodivide('I', bigDecimal, mathContext, 0);
    }

    public BigDecimal max(BigDecimal bigDecimal) {
        return max(bigDecimal, plainMC);
    }

    public BigDecimal max(BigDecimal bigDecimal, MathContext mathContext) {
        if (compareTo(bigDecimal, mathContext) >= 0) {
            return plus(mathContext);
        }
        return bigDecimal.plus(mathContext);
    }

    public BigDecimal min(BigDecimal bigDecimal) {
        return min(bigDecimal, plainMC);
    }

    public BigDecimal min(BigDecimal bigDecimal, MathContext mathContext) {
        if (compareTo(bigDecimal, mathContext) <= 0) {
            return plus(mathContext);
        }
        return bigDecimal.plus(mathContext);
    }

    public BigDecimal multiply(BigDecimal bigDecimal) {
        return multiply(bigDecimal, plainMC);
    }

    public BigDecimal multiply(BigDecimal bigDecimal, MathContext mathContext) {
        int i;
        BigDecimal bigDecimalRound;
        byte[] bArr;
        BigDecimal bigDecimalRound2 = bigDecimal;
        if (mathContext.lostDigits) {
            checkdigits(bigDecimalRound2, mathContext.digits);
        }
        int i2 = mathContext.digits;
        if (i2 > 0) {
            bigDecimalRound = this.mant.length > i2 ? clone(this).round(mathContext) : this;
            if (bigDecimalRound2.mant.length > i2) {
                bigDecimalRound2 = clone(bigDecimal).round(mathContext);
            }
            i = 0;
        } else {
            i = this.exp;
            if (i <= 0) {
                i = 0;
            }
            int i3 = bigDecimalRound2.exp;
            if (i3 > 0) {
                i += i3;
            }
            bigDecimalRound = this;
        }
        byte[] bArr2 = bigDecimalRound.mant;
        int length = bArr2.length;
        byte[] bArr3 = bigDecimalRound2.mant;
        if (length < bArr3.length) {
            bArr = bArr3;
        } else {
            bArr = bArr2;
            bArr2 = bArr3;
        }
        int length2 = bArr2.length + bArr.length;
        int i4 = length2 - 1;
        if (bArr2[0] * bArr[0] <= 9) {
            length2 = i4;
        }
        BigDecimal bigDecimal2 = new BigDecimal();
        byte[] bArrByteaddsub = new byte[length2];
        int i5 = 0;
        int i6 = i4;
        int length3 = bArr2.length;
        while (length3 > 0) {
            byte b = bArr2[i5];
            if (b != 0) {
                bArrByteaddsub = byteaddsub(bArrByteaddsub, bArrByteaddsub.length, bArr, i6, b, true);
            }
            i6--;
            length3--;
            i5++;
        }
        bigDecimal2.ind = (byte) (bigDecimalRound.ind * bigDecimalRound2.ind);
        bigDecimal2.exp = (bigDecimalRound.exp + bigDecimalRound2.exp) - i;
        if (i == 0) {
            bigDecimal2.mant = bArrByteaddsub;
        } else {
            bigDecimal2.mant = extend(bArrByteaddsub, bArrByteaddsub.length + i);
        }
        return bigDecimal2.finish(mathContext, false);
    }

    public BigDecimal negate() {
        return negate(plainMC);
    }

    public BigDecimal negate(MathContext mathContext) {
        if (mathContext.lostDigits) {
            checkdigits(null, mathContext.digits);
        }
        BigDecimal bigDecimalClone = clone(this);
        bigDecimalClone.ind = (byte) (-bigDecimalClone.ind);
        return bigDecimalClone.finish(mathContext, false);
    }

    public BigDecimal plus() {
        return plus(plainMC);
    }

    public BigDecimal plus(MathContext mathContext) {
        if (mathContext.lostDigits) {
            checkdigits(null, mathContext.digits);
        }
        if (mathContext.form == 0 && this.form == 0) {
            int length = this.mant.length;
            int i = mathContext.digits;
            if (length <= i || i == 0) {
                return this;
            }
        }
        return clone(this).finish(mathContext, false);
    }

    public BigDecimal pow(BigDecimal bigDecimal) {
        return pow(bigDecimal, plainMC);
    }

    public BigDecimal pow(BigDecimal bigDecimal, MathContext mathContext) {
        BigDecimal bigDecimalRound;
        int length;
        if (mathContext.lostDigits) {
            checkdigits(bigDecimal, mathContext.digits);
        }
        int iIntcheck = bigDecimal.intcheck(-999999999, 999999999);
        int i = mathContext.digits;
        boolean z = false;
        if (i == 0) {
            if (bigDecimal.ind == -1) {
                throw new ArithmeticException("Negative power: " + bigDecimal.toString());
            }
            bigDecimalRound = this;
            length = 0;
        } else {
            if (bigDecimal.mant.length + bigDecimal.exp > i) {
                throw new ArithmeticException("Too many digits: " + bigDecimal.toString());
            }
            bigDecimalRound = this.mant.length > i ? clone(this).round(mathContext) : this;
            length = i + bigDecimal.mant.length + bigDecimal.exp + 1;
        }
        MathContext mathContext2 = new MathContext(length, mathContext.form, false, mathContext.roundingMode);
        BigDecimal bigDecimalDivide = ONE;
        if (iIntcheck == 0) {
            return bigDecimalDivide;
        }
        if (iIntcheck < 0) {
            iIntcheck = -iIntcheck;
        }
        int i2 = 1;
        while (true) {
            iIntcheck += iIntcheck;
            if (iIntcheck < 0) {
                bigDecimalDivide = bigDecimalDivide.multiply(bigDecimalRound, mathContext2);
                z = true;
            }
            if (i2 == 31) {
                break;
            }
            if (z) {
                bigDecimalDivide = bigDecimalDivide.multiply(bigDecimalDivide, mathContext2);
            }
            i2++;
        }
        if (bigDecimal.ind < 0) {
            bigDecimalDivide = ONE.divide(bigDecimalDivide, mathContext2);
        }
        return bigDecimalDivide.finish(mathContext, true);
    }

    public BigDecimal remainder(BigDecimal bigDecimal) {
        return dodivide('R', bigDecimal, plainMC, -1);
    }

    public BigDecimal remainder(BigDecimal bigDecimal, MathContext mathContext) {
        return dodivide('R', bigDecimal, mathContext, -1);
    }

    public BigDecimal subtract(BigDecimal bigDecimal) {
        return subtract(bigDecimal, plainMC);
    }

    public BigDecimal subtract(BigDecimal bigDecimal, MathContext mathContext) {
        if (mathContext.lostDigits) {
            checkdigits(bigDecimal, mathContext.digits);
        }
        BigDecimal bigDecimalClone = clone(bigDecimal);
        bigDecimalClone.ind = (byte) (-bigDecimalClone.ind);
        return add(bigDecimalClone, mathContext);
    }

    public byte byteValueExact() {
        int iIntValueExact = intValueExact();
        if (!(iIntValueExact > 127) && !(iIntValueExact < -128)) {
            return (byte) iIntValueExact;
        }
        throw new ArithmeticException("Conversion overflow: " + toString());
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.valueOf(toString()).doubleValue();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BigDecimal)) {
            return false;
        }
        BigDecimal bigDecimal = (BigDecimal) obj;
        if (this.ind != bigDecimal.ind) {
            return false;
        }
        byte[] bArr = this.mant;
        if ((bArr.length == bigDecimal.mant.length) & (this.exp == bigDecimal.exp) & (this.form == bigDecimal.form)) {
            int length = bArr.length;
            int i = 0;
            while (length > 0) {
                if (this.mant[i] != bigDecimal.mant[i]) {
                    return false;
                }
                length--;
                i++;
            }
        } else {
            char[] cArrLayout = layout();
            char[] cArrLayout2 = bigDecimal.layout();
            if (cArrLayout.length != cArrLayout2.length) {
                return false;
            }
            int length2 = cArrLayout.length;
            int i2 = 0;
            while (length2 > 0) {
                if (cArrLayout[i2] != cArrLayout2[i2]) {
                    return false;
                }
                length2--;
                i2++;
            }
        }
        return true;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.valueOf(toString()).floatValue();
    }

    public String format(int i, int i2) {
        return format(i, i2, -1, -1, 1, 4);
    }

    public String format(int i, int i2, int i3, int i4, int i5, int i6) {
        int length;
        if ((i < -1) | (i == 0)) {
            badarg("format", 1, String.valueOf(i));
        }
        if (i2 < -1) {
            badarg("format", 2, String.valueOf(i2));
        }
        if ((i3 < -1) | (i3 == 0)) {
            badarg("format", 3, String.valueOf(i3));
        }
        if (i4 < -1) {
            badarg("format", 4, String.valueOf(i3));
        }
        if (i5 != 1 && i5 != 2) {
            if (i5 == -1) {
                i5 = 1;
            } else {
                badarg("format", 5, String.valueOf(i5));
            }
        }
        if (i6 != 4) {
            if (i6 == -1) {
                i6 = 4;
            } else {
                try {
                    new MathContext(9, 1, false, i6);
                } catch (IllegalArgumentException unused) {
                    badarg("format", 6, String.valueOf(i6));
                }
            }
        }
        BigDecimal bigDecimalClone = clone(this);
        if (i4 == -1 || bigDecimalClone.ind == 0) {
            bigDecimalClone.form = (byte) 0;
        } else {
            int length2 = bigDecimalClone.exp + bigDecimalClone.mant.length;
            if (length2 > i4 || length2 < -5) {
                bigDecimalClone.form = (byte) i5;
            } else {
                bigDecimalClone.form = (byte) 0;
            }
        }
        if (i2 >= 0) {
            while (true) {
                byte b = bigDecimalClone.form;
                if (b == 0) {
                    length = -bigDecimalClone.exp;
                } else if (b == 1) {
                    length = bigDecimalClone.mant.length - 1;
                } else {
                    int i7 = bigDecimalClone.exp;
                    byte[] bArr = bigDecimalClone.mant;
                    int length3 = ((i7 + bArr.length) - 1) % 3;
                    if (length3 < 0) {
                        length3 += 3;
                    }
                    int i8 = length3 + 1;
                    length = i8 >= bArr.length ? 0 : bArr.length - i8;
                }
                if (length == i2) {
                    break;
                }
                if (length < i2) {
                    byte[] bArr2 = bigDecimalClone.mant;
                    bigDecimalClone.mant = extend(bArr2, (bArr2.length + i2) - length);
                    int i9 = bigDecimalClone.exp - (i2 - length);
                    bigDecimalClone.exp = i9;
                    if (i9 < -999999999) {
                        throw new ArithmeticException("Exponent Overflow: " + bigDecimalClone.exp);
                    }
                } else {
                    int i10 = length - i2;
                    byte[] bArr3 = bigDecimalClone.mant;
                    if (i10 > bArr3.length) {
                        bigDecimalClone.mant = ZERO.mant;
                        bigDecimalClone.ind = (byte) 0;
                        bigDecimalClone.exp = 0;
                    } else {
                        int length4 = bArr3.length;
                        int i11 = bigDecimalClone.exp;
                        bigDecimalClone.round(length4 - i10, i6);
                        if (bigDecimalClone.exp - i11 == i10) {
                            break;
                        }
                    }
                }
            }
        }
        char[] cArrLayout = bigDecimalClone.layout();
        if (i > 0) {
            int length5 = cArrLayout.length;
            int i12 = 0;
            while (length5 > 0) {
                char c = cArrLayout[i12];
                if (c == '.' || c == 'E') {
                    break;
                }
                length5--;
                i12++;
            }
            if (i12 > i) {
                badarg("format", 1, String.valueOf(i));
            }
            if (i12 < i) {
                char[] cArr = new char[(cArrLayout.length + i) - i12];
                int i13 = i - i12;
                int i14 = 0;
                while (i13 > 0) {
                    cArr[i14] = ' ';
                    i13--;
                    i14++;
                }
                System.arraycopy(cArrLayout, 0, cArr, i14, cArrLayout.length);
                cArrLayout = cArr;
            }
        }
        if (i3 > 0) {
            int length6 = cArrLayout.length - 1;
            int length7 = cArrLayout.length - 1;
            while (length6 > 0 && cArrLayout[length7] != 'E') {
                length6--;
                length7--;
            }
            if (length7 == 0) {
                char[] cArr2 = new char[cArrLayout.length + i3 + 2];
                System.arraycopy(cArrLayout, 0, cArr2, 0, cArrLayout.length);
                int i15 = i3 + 2;
                int length8 = cArrLayout.length;
                while (i15 > 0) {
                    cArr2[length8] = ' ';
                    i15--;
                    length8++;
                }
                cArrLayout = cArr2;
            } else {
                int length9 = (cArrLayout.length - length7) - 2;
                if (length9 > i3) {
                    badarg("format", 3, String.valueOf(i3));
                }
                if (length9 < i3) {
                    char[] cArr3 = new char[(cArrLayout.length + i3) - length9];
                    int i16 = length7 + 2;
                    System.arraycopy(cArrLayout, 0, cArr3, 0, i16);
                    int i17 = i3 - length9;
                    int i18 = i16;
                    while (i17 > 0) {
                        cArr3[i18] = '0';
                        i17--;
                        i18++;
                    }
                    System.arraycopy(cArrLayout, i16, cArr3, i18, length9);
                    cArrLayout = cArr3;
                }
            }
        }
        return new String(cArrLayout);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        return toBigInteger().intValue();
    }

    public int intValueExact() {
        if (this.ind == 0) {
            return 0;
        }
        byte[] bArr = this.mant;
        int length = bArr.length - 1;
        int i = this.exp;
        if (i < 0) {
            length += i;
            if (!allzero(bArr, length + 1)) {
                throw new ArithmeticException("Decimal part non-zero: " + toString());
            }
            if (length < 0) {
                return 0;
            }
            i = 0;
        } else if (i + length > 9) {
            throw new ArithmeticException("Conversion overflow: " + toString());
        }
        int i2 = i + length;
        int i3 = 0;
        for (int i4 = 0; i4 <= i2; i4++) {
            i3 *= 10;
            if (i4 <= length) {
                i3 += this.mant[i4];
            }
        }
        if (i2 == 9) {
            int i5 = i3 / 1000000000;
            byte b = this.mant[0];
            if (i5 != b) {
                if (i3 == Integer.MIN_VALUE && this.ind == -1 && b == 2) {
                    return i3;
                }
                throw new ArithmeticException("Conversion overflow: " + toString());
            }
        }
        return this.ind == 1 ? i3 : -i3;
    }

    @Override // java.lang.Number
    public long longValue() {
        return toBigInteger().longValue();
    }

    public long longValueExact() {
        long j = 0;
        if (this.ind == 0) {
            return 0L;
        }
        byte[] bArr = this.mant;
        int length = bArr.length - 1;
        int i = this.exp;
        if (i < 0) {
            length += i;
            if (!allzero(bArr, length < 0 ? 0 : length + 1)) {
                throw new ArithmeticException("Decimal part non-zero: " + toString());
            }
            if (length < 0) {
                return 0L;
            }
            i = 0;
        } else if (bArr.length + i > 18) {
            throw new ArithmeticException("Conversion overflow: " + toString());
        }
        int i2 = i + length;
        for (int i3 = 0; i3 <= i2; i3++) {
            j *= 10;
            if (i3 <= length) {
                j += (long) this.mant[i3];
            }
        }
        if (i2 == 18) {
            long j2 = j / 1000000000000000000L;
            byte b = this.mant[0];
            if (j2 != b) {
                if (j == Long.MIN_VALUE && this.ind == -1 && b == 9) {
                    return j;
                }
                throw new ArithmeticException("Conversion overflow: " + toString());
            }
        }
        return this.ind == 1 ? j : -j;
    }

    public BigDecimal movePointLeft(int i) {
        BigDecimal bigDecimalClone = clone(this);
        bigDecimalClone.exp -= i;
        return bigDecimalClone.finish(plainMC, false);
    }

    public BigDecimal movePointRight(int i) {
        BigDecimal bigDecimalClone = clone(this);
        bigDecimalClone.exp += i;
        return bigDecimalClone.finish(plainMC, false);
    }

    public BigDecimal setScale(int i) {
        return setScale(i, 7);
    }

    public BigDecimal setScale(int i, int i2) {
        int iScale = scale();
        if (iScale == i && this.form == 0) {
            return this;
        }
        BigDecimal bigDecimalClone = clone(this);
        if (iScale <= i) {
            int i3 = iScale == 0 ? bigDecimalClone.exp + i : i - iScale;
            byte[] bArr = bigDecimalClone.mant;
            bigDecimalClone.mant = extend(bArr, bArr.length + i3);
            bigDecimalClone.exp = -i;
        } else {
            if (i < 0) {
                throw new ArithmeticException("Negative scale: " + i);
            }
            bigDecimalClone = bigDecimalClone.round(bigDecimalClone.mant.length - (iScale - i), i2);
            if (bigDecimalClone.exp != (-i)) {
                byte[] bArr2 = bigDecimalClone.mant;
                bigDecimalClone.mant = extend(bArr2, bArr2.length + 1);
                bigDecimalClone.exp--;
            }
        }
        bigDecimalClone.form = (byte) 0;
        return bigDecimalClone;
    }

    public short shortValueExact() {
        int iIntValueExact = intValueExact();
        if (!(iIntValueExact > 32767) && !(iIntValueExact < -32768)) {
            return (short) iIntValueExact;
        }
        throw new ArithmeticException("Conversion overflow: " + toString());
    }

    public java.math.BigDecimal toBigDecimal() {
        return new java.math.BigDecimal(unscaledValue(), scale());
    }

    public BigInteger toBigInteger() {
        BigDecimal bigDecimalClone;
        int i = this.exp;
        if ((this.form == 0) && (i >= 0)) {
            bigDecimalClone = this;
        } else if (i >= 0) {
            bigDecimalClone = clone(this);
            bigDecimalClone.form = (byte) 0;
        } else if ((-i) >= this.mant.length) {
            bigDecimalClone = ZERO;
        } else {
            bigDecimalClone = clone(this);
            byte[] bArr = bigDecimalClone.mant;
            int length = bArr.length + bigDecimalClone.exp;
            byte[] bArr2 = new byte[length];
            System.arraycopy(bArr, 0, bArr2, 0, length);
            bigDecimalClone.mant = bArr2;
            bigDecimalClone.form = (byte) 0;
            bigDecimalClone.exp = 0;
        }
        return new BigInteger(new String(bigDecimalClone.layout()));
    }

    public BigInteger toBigIntegerExact() {
        int i = this.exp;
        if (i < 0) {
            byte[] bArr = this.mant;
            if (!allzero(bArr, bArr.length + i)) {
                throw new ArithmeticException("Decimal part non-zero: " + toString());
            }
        }
        return toBigInteger();
    }

    public char[] toCharArray() {
        return layout();
    }

    public String toString() {
        return new String(layout());
    }

    public BigInteger unscaledValue() {
        BigDecimal bigDecimalClone;
        if (this.exp >= 0) {
            bigDecimalClone = this;
        } else {
            bigDecimalClone = clone(this);
            bigDecimalClone.exp = 0;
        }
        return bigDecimalClone.toBigInteger();
    }

    public static BigDecimal valueOf(double d) {
        return new BigDecimal(new Double(d).toString());
    }

    public static BigDecimal valueOf(long j) {
        return valueOf(j, 0);
    }

    public static BigDecimal valueOf(long j, int i) {
        BigDecimal bigDecimal;
        if (j == 0) {
            bigDecimal = ZERO;
        } else if (j == 1) {
            bigDecimal = ONE;
        } else {
            bigDecimal = j == 10 ? TEN : new BigDecimal(j);
        }
        if (i == 0) {
            return bigDecimal;
        }
        if (i < 0) {
            throw new NumberFormatException("Negative scale: " + i);
        }
        BigDecimal bigDecimalClone = clone(bigDecimal);
        bigDecimalClone.exp = -i;
        return bigDecimalClone;
    }

    private char[] layout() {
        byte[] bArr = this.mant;
        int length = bArr.length;
        char[] cArr = new char[length];
        int length2 = bArr.length;
        int i = 0;
        while (length2 > 0) {
            cArr[i] = (char) (this.mant[i] + 48);
            length2--;
            i++;
        }
        char c = '-';
        if (this.form != 0) {
            StringBuilder sb = new StringBuilder(length + 15);
            if (this.ind == -1) {
                sb.append('-');
            }
            int i2 = (this.exp + length) - 1;
            if (this.form == 1) {
                sb.append(cArr[0]);
                if (length > 1) {
                    sb.append('.');
                    sb.append(cArr, 1, length - 1);
                }
            } else {
                int i3 = i2 % 3;
                if (i3 < 0) {
                    i3 += 3;
                }
                i2 -= i3;
                int i4 = i3 + 1;
                if (i4 >= length) {
                    sb.append(cArr, 0, length);
                    for (int i5 = i4 - length; i5 > 0; i5--) {
                        sb.append('0');
                    }
                } else {
                    sb.append(cArr, 0, i4);
                    sb.append('.');
                    sb.append(cArr, i4, length - i4);
                }
            }
            if (i2 != 0) {
                if (i2 < 0) {
                    i2 = -i2;
                } else {
                    c = '+';
                }
                sb.append('E');
                sb.append(c);
                sb.append(i2);
            }
            char[] cArr2 = new char[sb.length()];
            int length3 = sb.length();
            if (length3 != 0) {
                sb.getChars(0, length3, cArr2, 0);
            }
            return cArr2;
        }
        int i6 = this.exp;
        if (i6 == 0) {
            if (this.ind >= 0) {
                return cArr;
            }
            char[] cArr3 = new char[length + 1];
            cArr3[0] = '-';
            System.arraycopy(cArr, 0, cArr3, 1, length);
            return cArr3;
        }
        int i7 = this.ind == -1 ? 1 : 0;
        int i8 = i6 + length;
        if (i8 < 1) {
            int i9 = i7 + 2;
            char[] cArr4 = new char[i9 - i6];
            if (i7 != 0) {
                cArr4[0] = '-';
            }
            cArr4[i7] = '0';
            cArr4[i7 + 1] = '.';
            int i10 = -i8;
            int i11 = i9;
            while (i10 > 0) {
                cArr4[i11] = '0';
                i10--;
                i11++;
            }
            System.arraycopy(cArr, 0, cArr4, i9 - i8, length);
            return cArr4;
        }
        if (i8 > length) {
            char[] cArr5 = new char[i7 + i8];
            if (i7 != 0) {
                cArr5[0] = '-';
            }
            System.arraycopy(cArr, 0, cArr5, i7, length);
            int i12 = i8 - length;
            int i13 = i7 + length;
            while (i12 > 0) {
                cArr5[i13] = '0';
                i12--;
                i13++;
            }
            return cArr5;
        }
        char[] cArr6 = new char[i7 + 1 + length];
        if (i7 != 0) {
            cArr6[0] = '-';
        }
        System.arraycopy(cArr, 0, cArr6, i7, i8);
        int i14 = i7 + i8;
        cArr6[i14] = '.';
        System.arraycopy(cArr, i8, cArr6, i14 + 1, length - i8);
        return cArr6;
    }

    private int intcheck(int i, int i2) {
        int iIntValueExact = intValueExact();
        if (!(iIntValueExact < i) && !(iIntValueExact > i2)) {
            return iIntValueExact;
        }
        throw new ArithmeticException("Conversion overflow: " + iIntValueExact);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0105, code lost:
    
        r22 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BigDecimal dodivide(char c, BigDecimal bigDecimal, MathContext mathContext, int i) {
        BigDecimal bigDecimalRound;
        int i2;
        int i3;
        byte[] bArr;
        int i4;
        char c2;
        boolean z;
        boolean z2;
        int i5;
        int i6;
        byte b;
        BigDecimal bigDecimalRound2 = bigDecimal;
        int iScale = i;
        if (mathContext.lostDigits) {
            checkdigits(bigDecimalRound2, mathContext.digits);
        }
        if (bigDecimalRound2.ind == 0) {
            throw new ArithmeticException("Divide by 0");
        }
        if (this.ind == 0) {
            return mathContext.form != 0 ? ZERO : iScale == -1 ? this : setScale(iScale);
        }
        int length = mathContext.digits;
        if (length > 0) {
            bigDecimalRound = this.mant.length > length ? clone(this).round(mathContext) : this;
            if (bigDecimalRound2.mant.length > length) {
                bigDecimalRound2 = clone(bigDecimal).round(mathContext);
            }
        } else {
            if (iScale == -1) {
                iScale = scale();
            }
            byte[] bArr2 = this.mant;
            int length2 = bArr2.length;
            int i7 = this.exp;
            if (iScale != (-i7)) {
                length2 = length2 + iScale + i7;
            }
            byte[] bArr3 = bigDecimalRound2.mant;
            int length3 = (length2 - (bArr3.length - 1)) - bigDecimalRound2.exp;
            if (length3 < bArr2.length) {
                length3 = bArr2.length;
            }
            length = length3 < bArr3.length ? bArr3.length : length3;
            bigDecimalRound = this;
        }
        int length4 = ((bigDecimalRound.exp - bigDecimalRound2.exp) + bigDecimalRound.mant.length) - bigDecimalRound2.mant.length;
        int i8 = 0;
        if (length4 < 0 && c != 'D') {
            return c == 'I' ? ZERO : clone(bigDecimalRound).finish(mathContext, false);
        }
        BigDecimal bigDecimal2 = new BigDecimal();
        bigDecimal2.ind = (byte) (bigDecimalRound.ind * bigDecimalRound2.ind);
        bigDecimal2.exp = length4;
        int i9 = length + 1;
        bigDecimal2.mant = new byte[i9];
        int i10 = length + length + 1;
        byte[] bArrExtend = extend(bigDecimalRound.mant, i10);
        byte[] bArr4 = bigDecimalRound2.mant;
        int i11 = (bArr4[0] * 10) + 1;
        if (bArr4.length > 1) {
            i11 += bArr4[1];
        }
        int i12 = i11;
        int i13 = 0;
        int i14 = i10;
        int i15 = i14;
        loop0: while (true) {
            i2 = i15;
            while (true) {
                if (i2 < i14) {
                    i3 = i12;
                    bArr = bArr4;
                    break;
                }
                if (i2 == i14) {
                    int i16 = i2;
                    int i17 = 0;
                    while (i16 > 0) {
                        i3 = i12;
                        if (i17 < bArr4.length) {
                            b = bArr4[i17];
                            bArr = bArr4;
                        } else {
                            bArr = bArr4;
                            b = 0;
                        }
                        byte b2 = bArrExtend[i17];
                        if (b2 < b) {
                            break;
                        }
                        if (b2 > b) {
                            i6 = bArrExtend[0];
                            i5 = 1;
                        } else {
                            i16--;
                            i17++;
                            bArr4 = bArr;
                            i12 = i3;
                        }
                    }
                    bigDecimal2.mant[i13] = (byte) (i8 + 1);
                    i13++;
                    bArrExtend[0] = 0;
                    break loop0;
                }
                i3 = i12;
                bArr = bArr4;
                i5 = 1;
                i6 = bArrExtend[0] * 10;
                if (i2 > 1) {
                    i6 += bArrExtend[1];
                }
                int i18 = (i6 * 10) / i3;
                if (i18 == 0) {
                    i18 = i5;
                }
                i8 += i18;
                byte[] bArr5 = bArr;
                bArrExtend = byteaddsub(bArrExtend, i2, bArr, i14, -i18, true);
                if (bArrExtend[0] == 0) {
                    int i19 = i2;
                    int i20 = 0;
                    while (i20 <= i2 - 2 && bArrExtend[i20] == 0) {
                        i19--;
                        i20++;
                    }
                    if (i20 != 0) {
                        System.arraycopy(bArrExtend, i20, bArrExtend, 0, i19);
                    }
                    i2 = i19;
                }
                bArr4 = bArr5;
                i12 = i3;
            }
            if ((i13 != 0) || (i8 != 0)) {
                bigDecimal2.mant[i13] = (byte) i8;
                int i21 = i13 + 1;
                if (i21 == i9 || bArrExtend[0] == 0) {
                    break;
                }
                i13 = i21;
                if ((iScale < 0 && (-bigDecimal2.exp) > iScale) || (c != 'D' && bigDecimal2.exp <= 0)) {
                    break;
                }
                bigDecimal2.exp--;
                i14--;
                i15 = i2;
                bArr4 = bArr;
                i12 = i3;
                i8 = 0;
            } else if (iScale < 0) {
                bigDecimal2.exp--;
                i14--;
                i15 = i2;
                bArr4 = bArr;
                i12 = i3;
                i8 = 0;
            } else {
                bigDecimal2.exp--;
                i14--;
                i15 = i2;
                bArr4 = bArr;
                i12 = i3;
                i8 = 0;
            }
        }
        if (i13 == 0) {
            c2 = 'I';
            i4 = 1;
        } else {
            i4 = i13;
            c2 = 'I';
        }
        if ((c == c2) || (c == 'R')) {
            int i22 = bigDecimal2.exp;
            if (i4 + i22 > length) {
                throw new ArithmeticException("Integer overflow");
            }
            if (c == 'R') {
                if (bigDecimal2.mant[0] == 0) {
                    return clone(bigDecimalRound).finish(mathContext, false);
                }
                if (bArrExtend[0] == 0) {
                    return ZERO;
                }
                bigDecimal2.ind = bigDecimalRound.ind;
                bigDecimal2.exp = (i22 - (i10 - bigDecimalRound.mant.length)) + bigDecimalRound.exp;
                for (int i23 = i2 - 1; i23 >= 1; i23--) {
                    int i24 = bigDecimal2.exp;
                    if ((!(i24 < bigDecimalRound.exp) || !(i24 < bigDecimalRound2.exp)) || bArrExtend[i23] != 0) {
                        break;
                    }
                    i2--;
                    bigDecimal2.exp = i24 + 1;
                }
                if (i2 < bArrExtend.length) {
                    byte[] bArr6 = new byte[i2];
                    z2 = false;
                    System.arraycopy(bArrExtend, 0, bArr6, 0, i2);
                    bArrExtend = bArr6;
                } else {
                    z2 = false;
                }
                bigDecimal2.mant = bArrExtend;
                return bigDecimal2.finish(mathContext, z2);
            }
        } else if (bArrExtend[0] != 0) {
            byte[] bArr7 = bigDecimal2.mant;
            int i25 = i4 - 1;
            byte b3 = bArr7[i25];
            if (b3 % 5 == 0) {
                bArr7[i25] = (byte) (b3 + 1);
            }
        }
        if (iScale >= 0) {
            byte[] bArr8 = bigDecimal2.mant;
            if (i4 != bArr8.length) {
                bigDecimal2.exp -= bArr8.length - i4;
            }
            bigDecimal2.round(bArr8.length - ((-bigDecimal2.exp) - iScale), mathContext.roundingMode);
            if (bigDecimal2.exp != (-iScale)) {
                byte[] bArr9 = bigDecimal2.mant;
                z = true;
                bigDecimal2.mant = extend(bArr9, bArr9.length + 1);
                bigDecimal2.exp--;
            } else {
                z = true;
            }
            return bigDecimal2.finish(mathContext, z);
        }
        byte[] bArr10 = bigDecimal2.mant;
        if (i4 == bArr10.length) {
            bigDecimal2.round(mathContext);
        } else {
            if (bArr10[0] == 0) {
                return ZERO;
            }
            byte[] bArr11 = new byte[i4];
            System.arraycopy(bArr10, 0, bArr11, 0, i4);
            bigDecimal2.mant = bArr11;
        }
        return bigDecimal2.finish(mathContext, true);
    }

    private void bad(char[] cArr) {
        throw new NumberFormatException("Not a number: " + String.valueOf(cArr));
    }

    private void badarg(String str, int i, String str2) {
        throw new IllegalArgumentException("Bad argument " + i + " to " + str + ": " + str2);
    }

    private static final byte[] extend(byte[] bArr, int i) {
        if (bArr.length == i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static final byte[] byteaddsub(byte[] bArr, int i, byte[] bArr2, int i2, int i3, boolean z) {
        int i4;
        int length = bArr.length;
        int length2 = bArr2.length;
        int i5 = i - 1;
        int i6 = i2 - 1;
        int i7 = i6 < i5 ? i5 : i6;
        byte[] bArr3 = null;
        byte[] bArr4 = (z && i7 + 1 == length) ? bArr : null;
        if (bArr4 == null) {
            bArr4 = new byte[i7 + 1];
        }
        int i8 = 0;
        boolean z2 = i3 == 1 || i3 == -1;
        int i9 = 0;
        for (int i10 = i7; i10 >= 0; i10--) {
            if (i5 >= 0) {
                if (i5 < length) {
                    i9 += bArr[i5];
                }
                i5--;
            }
            if (i6 >= 0) {
                if (i6 < length2) {
                    if (!z2) {
                        i4 = bArr2[i6] * i3;
                    } else if (i3 > 0) {
                        i4 = bArr2[i6];
                    } else {
                        i9 -= bArr2[i6];
                    }
                    i9 += i4;
                }
                i6--;
            }
            if (i9 < 10 && i9 >= 0) {
                bArr4[i10] = (byte) i9;
                i9 = 0;
            } else {
                int i11 = i9 + 90;
                bArr4[i10] = bytedig[i11];
                i9 = bytecar[i11];
            }
        }
        if (i9 == 0) {
            return bArr4;
        }
        if (z && i7 + 2 == bArr.length) {
            bArr3 = bArr;
        }
        if (bArr3 == null) {
            bArr3 = new byte[i7 + 2];
        }
        bArr3[0] = (byte) i9;
        if (i7 < 10) {
            int i12 = i7 + 1;
            while (i12 > 0) {
                int i13 = i8 + 1;
                bArr3[i13] = bArr4[i8];
                i12--;
                i8 = i13;
            }
        } else {
            System.arraycopy(bArr4, 0, bArr3, 1, i7 + 1);
        }
        return bArr3;
    }

    private static final byte[] diginit() {
        byte[] bArr = new byte[190];
        for (int i = 0; i <= 189; i++) {
            int i2 = i - 90;
            if (i2 >= 0) {
                bArr[i] = (byte) (i2 % 10);
                bytecar[i] = (byte) (i2 / 10);
            } else {
                bArr[i] = (byte) ((i + 10) % 10);
                bytecar[i] = (byte) ((r2 / 10) - 10);
            }
        }
        return bArr;
    }

    private static final BigDecimal clone(BigDecimal bigDecimal) {
        BigDecimal bigDecimal2 = new BigDecimal();
        bigDecimal2.ind = bigDecimal.ind;
        bigDecimal2.exp = bigDecimal.exp;
        bigDecimal2.form = bigDecimal.form;
        bigDecimal2.mant = bigDecimal.mant;
        return bigDecimal2;
    }

    private void checkdigits(BigDecimal bigDecimal, int i) {
        if (i == 0) {
            return;
        }
        byte[] bArr = this.mant;
        if (bArr.length > i && !allzero(bArr, i)) {
            throw new ArithmeticException("Too many digits: " + toString());
        }
        if (bigDecimal == null) {
            return;
        }
        byte[] bArr2 = bigDecimal.mant;
        if (bArr2.length <= i || allzero(bArr2, i)) {
            return;
        }
        throw new ArithmeticException("Too many digits: " + bigDecimal.toString());
    }

    private BigDecimal round(MathContext mathContext) {
        return round(mathContext.digits, mathContext.roundingMode);
    }

    private BigDecimal round(int i, int i2) {
        byte b;
        boolean z;
        byte[] bArr = this.mant;
        int length = bArr.length - i;
        if (length <= 0) {
            return this;
        }
        this.exp += length;
        byte b2 = this.ind;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            this.mant = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, i);
            b = bArr[i];
            z = true;
        } else {
            this.mant = ZERO.mant;
            this.ind = (byte) 0;
            if (i == 0) {
                b = bArr[0];
                z = false;
            } else {
                b = 0;
                z = false;
            }
        }
        if (i2 != 4) {
            if (i2 == 7) {
                if (!allzero(bArr, i)) {
                    throw new ArithmeticException("Rounding necessary");
                }
            } else if (i2 == 5) {
                if (b <= 5 && (b != 5 || allzero(bArr, i + 1))) {
                }
            } else if (i2 == 6) {
                if (b <= 5) {
                    if (b == 5) {
                        if (allzero(bArr, i + 1)) {
                            byte[] bArr3 = this.mant;
                            if (bArr3[bArr3.length - 1] % 2 == 0) {
                            }
                        }
                    }
                }
            } else if (i2 != 1) {
                if (i2 == 0) {
                    if (allzero(bArr, i)) {
                    }
                } else if (i2 == 2) {
                    if (b2 <= 0 || allzero(bArr, i)) {
                    }
                } else if (i2 == 3) {
                    if (b2 >= 0 || allzero(bArr, i)) {
                    }
                } else {
                    throw new IllegalArgumentException("Bad round value: " + i2);
                }
            }
            b2 = 0;
        } else if (b < 5) {
            b2 = 0;
        }
        if (b2 != 0) {
            byte b3 = this.ind;
            if (b3 == 0) {
                this.mant = ONE.mant;
                this.ind = b2;
            } else {
                int i3 = b3 == -1 ? -b2 : b2;
                byte[] bArr4 = this.mant;
                byte[] bArrByteaddsub = byteaddsub(bArr4, bArr4.length, ONE.mant, 1, i3, z);
                int length2 = bArrByteaddsub.length;
                byte[] bArr5 = this.mant;
                if (length2 > bArr5.length) {
                    this.exp++;
                    System.arraycopy(bArrByteaddsub, 0, bArr5, 0, bArr5.length);
                } else {
                    this.mant = bArrByteaddsub;
                }
            }
        }
        if (this.exp <= 999999999) {
            return this;
        }
        throw new ArithmeticException("Exponent Overflow: " + this.exp);
    }

    private static final boolean allzero(byte[] bArr, int i) {
        if (i < 0) {
            i = 0;
        }
        int length = bArr.length;
        while (i <= length - 1) {
            if (bArr[i] != 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0096, code lost:
    
        if (r9 <= 999999999) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private BigDecimal finish(MathContext mathContext, boolean z) {
        int i;
        int i2 = mathContext.digits;
        if (i2 != 0 && this.mant.length > i2) {
            round(mathContext);
        }
        if (z && mathContext.form != 0) {
            int length = this.mant.length;
            for (int i3 = length - 1; i3 >= 1 && this.mant[i3] == 0; i3--) {
                length--;
                this.exp++;
            }
            byte[] bArr = this.mant;
            if (length < bArr.length) {
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 0, bArr2, 0, length);
                this.mant = bArr2;
            }
        }
        this.form = (byte) 0;
        int length2 = this.mant.length;
        int i4 = 0;
        while (length2 > 0) {
            byte[] bArr3 = this.mant;
            if (bArr3[i4] != 0) {
                if (i4 > 0) {
                    byte[] bArr4 = new byte[bArr3.length - i4];
                    System.arraycopy(bArr3, i4, bArr4, 0, bArr3.length - i4);
                    this.mant = bArr4;
                }
                int length3 = this.exp + this.mant.length;
                if (length3 > 0) {
                    int i5 = mathContext.digits;
                    if (length3 > i5 && i5 != 0) {
                        this.form = (byte) mathContext.form;
                    }
                    if (length3 - 1 <= 999999999) {
                        return this;
                    }
                } else if (length3 < -5) {
                    this.form = (byte) mathContext.form;
                }
                int i6 = length3 - 1;
                if ((i6 < -999999999) | (i6 > 999999999)) {
                    if (this.form == 2) {
                        int i7 = i6 % 3;
                        if (i7 < 0) {
                            i7 += 3;
                        }
                        i6 -= i7;
                        if (i6 >= -999999999) {
                        }
                    }
                    throw new ArithmeticException("Exponent Overflow: " + i6);
                }
                return this;
            }
            length2--;
            i4++;
        }
        this.ind = (byte) 0;
        if (mathContext.form != 0 || (i = this.exp) > 0) {
            this.exp = 0;
        } else if (i < -999999999) {
            throw new ArithmeticException("Exponent Overflow: " + this.exp);
        }
        this.mant = ZERO.mant;
        return this;
    }
}
