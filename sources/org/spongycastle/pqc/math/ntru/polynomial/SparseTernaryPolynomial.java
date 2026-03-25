package org.spongycastle.pqc.math.ntru.polynomial;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.pqc.math.ntru.util.ArrayEncoder;
import org.spongycastle.pqc.math.ntru.util.Util;
import org.spongycastle.util.Arrays;

/* JADX INFO: loaded from: classes25.dex */
public class SparseTernaryPolynomial implements TernaryPolynomial {
    private static final int BITS_PER_INDEX = 11;
    private int N;
    private int[] negOnes;
    private int[] ones;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial
    public int[] getNegOnes() {
        return this.negOnes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial
    public int[] getOnes() {
        return this.ones;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial
    public int size() {
        return this.N;
    }

    public SparseTernaryPolynomial(int i, int[] iArr, int[] iArr2) {
        this.N = i;
        this.ones = iArr;
        this.negOnes = iArr2;
    }

    public SparseTernaryPolynomial(IntegerPolynomial integerPolynomial) {
        this(integerPolynomial.coeffs);
    }

    public SparseTernaryPolynomial(int[] iArr) {
        int length = iArr.length;
        this.N = length;
        this.ones = new int[length];
        this.negOnes = new int[length];
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.N; i3++) {
            int i4 = iArr[i3];
            if (i4 == -1) {
                this.negOnes[i2] = i3;
                i2++;
            } else if (i4 == 0) {
                continue;
            } else {
                if (i4 != 1) {
                    throw new IllegalArgumentException("Illegal value: " + i4 + ", must be one of {-1, 0, 1}");
                }
                this.ones[i] = i3;
                i++;
            }
        }
        this.ones = Arrays.copyOf(this.ones, i);
        this.negOnes = Arrays.copyOf(this.negOnes, i2);
    }

    public static SparseTernaryPolynomial fromBinary(InputStream inputStream, int i, int i2, int i3) throws IOException {
        int iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(2047);
        return new SparseTernaryPolynomial(i, ArrayEncoder.decodeModQ(Util.readFullLength(inputStream, ((i2 * iNumberOfLeadingZeros) + 7) / 8), i2, 2048), ArrayEncoder.decodeModQ(Util.readFullLength(inputStream, ((iNumberOfLeadingZeros * i3) + 7) / 8), i3, 2048));
    }

    public static SparseTernaryPolynomial generateRandom(int i, int i2, int i3, SecureRandom secureRandom) {
        return new SparseTernaryPolynomial(Util.generateRandomTernary(i, i2, i3, secureRandom));
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial, org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial) {
        int[] iArr = integerPolynomial.coeffs;
        int length = iArr.length;
        int i = this.N;
        if (length != i) {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        int[] iArr2 = new int[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr3 = this.ones;
            if (i3 == iArr3.length) {
                break;
            }
            int i4 = iArr3[i3];
            int i5 = this.N;
            int i6 = (i5 - 1) - i4;
            while (true) {
                i5--;
                if (i5 >= 0) {
                    iArr2[i5] = iArr2[i5] + iArr[i6];
                    i6--;
                    if (i6 < 0) {
                        i6 = this.N - 1;
                    }
                }
            }
            i3++;
        }
        while (true) {
            int[] iArr4 = this.negOnes;
            if (i2 != iArr4.length) {
                int i7 = iArr4[i2];
                int i8 = this.N;
                int i9 = (i8 - 1) - i7;
                while (true) {
                    i8--;
                    if (i8 >= 0) {
                        iArr2[i8] = iArr2[i8] - iArr[i9];
                        i9--;
                        if (i9 < 0) {
                            i9 = this.N - 1;
                        }
                    }
                }
                i2++;
            } else {
                return new IntegerPolynomial(iArr2);
            }
        }
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial, int i) {
        IntegerPolynomial integerPolynomialMult = mult(integerPolynomial);
        integerPolynomialMult.mod(i);
        return integerPolynomialMult;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public BigIntPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        BigInteger[] bigIntegerArr = bigIntPolynomial.coeffs;
        int length = bigIntegerArr.length;
        int i = this.N;
        if (length != i) {
            throw new IllegalArgumentException("Number of coefficients must be the same");
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[i];
        int i2 = 0;
        for (int i3 = 0; i3 < this.N; i3++) {
            bigIntegerArr2[i3] = BigInteger.ZERO;
        }
        int i4 = 0;
        while (true) {
            int[] iArr = this.ones;
            if (i4 == iArr.length) {
                break;
            }
            int i5 = iArr[i4];
            int i6 = this.N;
            int i7 = (i6 - 1) - i5;
            while (true) {
                i6--;
                if (i6 >= 0) {
                    bigIntegerArr2[i6] = bigIntegerArr2[i6].add(bigIntegerArr[i7]);
                    i7--;
                    if (i7 < 0) {
                        i7 = this.N - 1;
                    }
                }
            }
            i4++;
        }
        while (true) {
            int[] iArr2 = this.negOnes;
            if (i2 != iArr2.length) {
                int i8 = iArr2[i2];
                int i9 = this.N;
                int i10 = (i9 - 1) - i8;
                while (true) {
                    i9--;
                    if (i9 >= 0) {
                        bigIntegerArr2[i9] = bigIntegerArr2[i9].subtract(bigIntegerArr[i10]);
                        i10--;
                        if (i10 < 0) {
                            i10 = this.N - 1;
                        }
                    }
                }
                i2++;
            } else {
                return new BigIntPolynomial(bigIntegerArr2);
            }
        }
    }

    public byte[] toBinary() {
        byte[] bArrEncodeModQ = ArrayEncoder.encodeModQ(this.ones, 2048);
        byte[] bArrEncodeModQ2 = ArrayEncoder.encodeModQ(this.negOnes, 2048);
        byte[] bArrCopyOf = Arrays.copyOf(bArrEncodeModQ, bArrEncodeModQ.length + bArrEncodeModQ2.length);
        System.arraycopy(bArrEncodeModQ2, 0, bArrCopyOf, bArrEncodeModQ.length, bArrEncodeModQ2.length);
        return bArrCopyOf;
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.Polynomial
    public IntegerPolynomial toIntegerPolynomial() {
        int[] iArr = new int[this.N];
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.ones;
            if (i2 == iArr2.length) {
                break;
            }
            iArr[iArr2[i2]] = 1;
            i2++;
        }
        while (true) {
            int[] iArr3 = this.negOnes;
            if (i != iArr3.length) {
                iArr[iArr3[i]] = -1;
                i++;
            } else {
                return new IntegerPolynomial(iArr);
            }
        }
    }

    @Override // org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial
    public void clear() {
        int i = 0;
        while (true) {
            int[] iArr = this.ones;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = 0;
            i++;
        }
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.negOnes;
            if (i2 >= iArr2.length) {
                return;
            }
            iArr2[i2] = 0;
            i2++;
        }
    }

    public int hashCode() {
        int i = this.N;
        return ((((i + 31) * 31) + Arrays.hashCode(this.negOnes)) * 31) + Arrays.hashCode(this.ones);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparseTernaryPolynomial sparseTernaryPolynomial = (SparseTernaryPolynomial) obj;
        return this.N == sparseTernaryPolynomial.N && Arrays.areEqual(this.negOnes, sparseTernaryPolynomial.negOnes) && Arrays.areEqual(this.ones, sparseTernaryPolynomial.ones);
    }
}
