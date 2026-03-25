package org.spongycastle.pqc.crypto.ntru;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.pqc.crypto.ntru.NTRUSigningPrivateKeyParameters;
import org.spongycastle.pqc.math.ntru.euclid.BigIntEuclidean;
import org.spongycastle.pqc.math.ntru.polynomial.BigDecimalPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.BigIntPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Resultant;

/* JADX INFO: loaded from: classes25.dex */
public class NTRUSigningKeyPairGenerator implements AsymmetricCipherKeyPairGenerator {
    private NTRUSigningKeyGenerationParameters params;

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(KeyGenerationParameters keyGenerationParameters) {
        this.params = (NTRUSigningKeyGenerationParameters) keyGenerationParameters;
    }

    @Override // org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator
    public AsymmetricCipherKeyPair generateKeyPair() {
        NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        ArrayList arrayList = new ArrayList();
        int i = this.params.B;
        while (true) {
            nTRUSigningPublicKeyParameters = null;
            byte b = 0;
            if (i < 0) {
                break;
            }
            arrayList.add(executorServiceNewCachedThreadPool.submit(new BasisGenerationTask()));
            i--;
        }
        executorServiceNewCachedThreadPool.shutdown();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = this.params.B; i2 >= 0; i2--) {
            Future future = (Future) arrayList.get(i2);
            try {
                arrayList2.add(future.get());
                if (i2 == this.params.B) {
                    nTRUSigningPublicKeyParameters = new NTRUSigningPublicKeyParameters(((NTRUSigningPrivateKeyParameters.Basis) future.get()).h, this.params.getSigningParameters());
                }
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) nTRUSigningPublicKeyParameters, (AsymmetricKeyParameter) new NTRUSigningPrivateKeyParameters(arrayList2, nTRUSigningPublicKeyParameters));
    }

    public AsymmetricCipherKeyPair generateKeyPairSingleThread() {
        ArrayList arrayList = new ArrayList();
        NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters = null;
        for (int i = this.params.B; i >= 0; i--) {
            NTRUSigningPrivateKeyParameters.Basis basisGenerateBoundedBasis = generateBoundedBasis();
            arrayList.add(basisGenerateBoundedBasis);
            if (i == 0) {
                nTRUSigningPublicKeyParameters = new NTRUSigningPublicKeyParameters(basisGenerateBoundedBasis.h, this.params.getSigningParameters());
            }
        }
        return new AsymmetricCipherKeyPair((AsymmetricKeyParameter) nTRUSigningPublicKeyParameters, (AsymmetricKeyParameter) new NTRUSigningPrivateKeyParameters(arrayList, nTRUSigningPublicKeyParameters));
    }

    private void minimizeFG(IntegerPolynomial integerPolynomial, IntegerPolynomial integerPolynomial2, IntegerPolynomial integerPolynomial3, IntegerPolynomial integerPolynomial4, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = integerPolynomial.coeffs[i3];
            int i5 = integerPolynomial2.coeffs[i3];
            i2 += i * 2 * ((i4 * i4) + (i5 * i5));
        }
        int i6 = i2 - 4;
        IntegerPolynomial integerPolynomial5 = (IntegerPolynomial) integerPolynomial.clone();
        IntegerPolynomial integerPolynomial6 = (IntegerPolynomial) integerPolynomial2.clone();
        int i7 = 0;
        int i8 = 0;
        while (i7 < i && i8 < i) {
            int i9 = 0;
            for (int i10 = 0; i10 < i; i10++) {
                i9 += i * 4 * ((integerPolynomial3.coeffs[i10] * integerPolynomial.coeffs[i10]) + (integerPolynomial4.coeffs[i10] * integerPolynomial2.coeffs[i10]));
            }
            int iSumCoeffs = i9 - ((integerPolynomial3.sumCoeffs() + integerPolynomial4.sumCoeffs()) * 4);
            if (iSumCoeffs > i6) {
                integerPolynomial3.sub(integerPolynomial5);
                integerPolynomial4.sub(integerPolynomial6);
            } else if (iSumCoeffs < (-i6)) {
                integerPolynomial3.add(integerPolynomial5);
                integerPolynomial4.add(integerPolynomial6);
            } else {
                i8++;
                integerPolynomial5.rotate1();
                integerPolynomial6.rotate1();
            }
            i7++;
            i8 = 0;
            i8++;
            integerPolynomial5.rotate1();
            integerPolynomial6.rotate1();
        }
    }

    private FGBasis generateBasis() {
        int i;
        Polynomial polynomialGenerateRandom;
        Polynomial polynomial;
        IntegerPolynomial integerPolynomial;
        IntegerPolynomial integerPolynomialInvertFq;
        int i2;
        Resultant resultant;
        int i3;
        IntegerPolynomial integerPolynomial2;
        int i4;
        IntegerPolynomial integerPolynomial3;
        int i5;
        Polynomial polynomial2;
        Polynomial polynomialGenerateRandom2;
        Polynomial polynomial3;
        IntegerPolynomial integerPolynomial4;
        Resultant resultant2;
        BigIntEuclidean bigIntEuclideanCalculate;
        BigIntPolynomial bigIntPolynomialRound;
        IntegerPolynomial integerPolynomialMult;
        Polynomial polynomial4;
        NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = this.params;
        int i6 = nTRUSigningKeyGenerationParameters.N;
        int i7 = nTRUSigningKeyGenerationParameters.q;
        int i8 = nTRUSigningKeyGenerationParameters.d;
        int i9 = nTRUSigningKeyGenerationParameters.d1;
        int i10 = nTRUSigningKeyGenerationParameters.d2;
        int i11 = nTRUSigningKeyGenerationParameters.d3;
        int i12 = nTRUSigningKeyGenerationParameters.basisType;
        int i13 = (i6 * 2) + 1;
        boolean z = nTRUSigningKeyGenerationParameters.primeCheck;
        while (true) {
            if (this.params.polyType == 0) {
                polynomialGenerateRandom = DenseTernaryPolynomial.generateRandom(i6, i8 + 1, i8, new SecureRandom());
                i = i13;
            } else {
                i = i13;
                polynomialGenerateRandom = ProductFormPolynomial.generateRandom(i6, i9, i10, i11 + 1, i11, new SecureRandom());
            }
            polynomial = polynomialGenerateRandom;
            integerPolynomial = polynomial.toIntegerPolynomial();
            if (z && integerPolynomial.resultant(i).res.equals(BigInteger.ZERO)) {
                i13 = i;
            } else {
                integerPolynomialInvertFq = integerPolynomial.invertFq(i7);
                if (integerPolynomialInvertFq != null) {
                    break;
                }
                i13 = i;
            }
        }
        Resultant resultant3 = integerPolynomial.resultant();
        while (true) {
            if (this.params.polyType == 0) {
                polynomialGenerateRandom2 = DenseTernaryPolynomial.generateRandom(i6, i8 + 1, i8, new SecureRandom());
                i2 = i8;
                i3 = i9;
                i4 = i10;
                i5 = i11;
                resultant = resultant3;
                integerPolynomial2 = integerPolynomialInvertFq;
                integerPolynomial3 = integerPolynomial;
                polynomial2 = polynomial;
            } else {
                int i14 = i9;
                i2 = i8;
                resultant = resultant3;
                int i15 = i10;
                i3 = i9;
                integerPolynomial2 = integerPolynomialInvertFq;
                i4 = i10;
                integerPolynomial3 = integerPolynomial;
                int i16 = i11;
                i5 = i11;
                polynomial2 = polynomial;
                polynomialGenerateRandom2 = ProductFormPolynomial.generateRandom(i6, i14, i15, i11 + 1, i16, new SecureRandom());
            }
            polynomial3 = polynomialGenerateRandom2;
            integerPolynomial4 = polynomial3.toIntegerPolynomial();
            if ((!z || !integerPolynomial4.resultant(i).res.equals(BigInteger.ZERO)) && integerPolynomial4.invertFq(i7) != null) {
                resultant2 = integerPolynomial4.resultant();
                bigIntEuclideanCalculate = BigIntEuclidean.calculate(resultant.res, resultant2.res);
                if (bigIntEuclideanCalculate.gcd.equals(BigInteger.ONE)) {
                    break;
                }
            }
            resultant3 = resultant;
            integerPolynomialInvertFq = integerPolynomial2;
            integerPolynomial = integerPolynomial3;
            polynomial = polynomial2;
            i10 = i4;
            i12 = i12;
            i8 = i2;
            i9 = i3;
            i11 = i5;
        }
        BigIntPolynomial bigIntPolynomial = (BigIntPolynomial) resultant.rho.clone();
        int i17 = i12;
        bigIntPolynomial.mult(bigIntEuclideanCalculate.x.multiply(BigInteger.valueOf(i7)));
        BigIntPolynomial bigIntPolynomial2 = (BigIntPolynomial) resultant2.rho.clone();
        bigIntPolynomial2.mult(bigIntEuclideanCalculate.y.multiply(BigInteger.valueOf(-i7)));
        int i18 = 0;
        if (this.params.keyGenAlg == 0) {
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            iArr[0] = integerPolynomial3.coeffs[0];
            iArr2[0] = integerPolynomial4.coeffs[0];
            for (int i19 = 1; i19 < i6; i19++) {
                int i20 = i6 - i19;
                iArr[i19] = integerPolynomial3.coeffs[i20];
                iArr2[i19] = integerPolynomial4.coeffs[i20];
            }
            IntegerPolynomial integerPolynomial5 = new IntegerPolynomial(iArr);
            IntegerPolynomial integerPolynomial6 = new IntegerPolynomial(iArr2);
            IntegerPolynomial integerPolynomialMult2 = polynomial2.mult(integerPolynomial5);
            integerPolynomialMult2.add(polynomial3.mult(integerPolynomial6));
            Resultant resultant4 = integerPolynomialMult2.resultant();
            BigIntPolynomial bigIntPolynomialMult = integerPolynomial5.mult(bigIntPolynomial2);
            bigIntPolynomialMult.add(integerPolynomial6.mult(bigIntPolynomial));
            bigIntPolynomialRound = bigIntPolynomialMult.mult(resultant4.rho);
            bigIntPolynomialRound.div(resultant4.res);
        } else {
            for (int i21 = 1; i21 < i6; i21 *= 10) {
                i18++;
            }
            BigDecimalPolynomial bigDecimalPolynomialDiv = resultant.rho.div(new BigDecimal(resultant.res), bigIntPolynomial2.getMaxCoeffLength() + 1 + i18);
            BigDecimalPolynomial bigDecimalPolynomialDiv2 = resultant2.rho.div(new BigDecimal(resultant2.res), bigIntPolynomial.getMaxCoeffLength() + 1 + i18);
            BigDecimalPolynomial bigDecimalPolynomialMult = bigDecimalPolynomialDiv.mult(bigIntPolynomial2);
            bigDecimalPolynomialMult.add(bigDecimalPolynomialDiv2.mult(bigIntPolynomial));
            bigDecimalPolynomialMult.halve();
            bigIntPolynomialRound = bigDecimalPolynomialMult.round();
        }
        BigIntPolynomial bigIntPolynomial3 = (BigIntPolynomial) bigIntPolynomial2.clone();
        bigIntPolynomial3.sub(polynomial2.mult(bigIntPolynomialRound));
        BigIntPolynomial bigIntPolynomial4 = (BigIntPolynomial) bigIntPolynomial.clone();
        bigIntPolynomial4.sub(polynomial3.mult(bigIntPolynomialRound));
        IntegerPolynomial integerPolynomial7 = new IntegerPolynomial(bigIntPolynomial3);
        IntegerPolynomial integerPolynomial8 = new IntegerPolynomial(bigIntPolynomial4);
        minimizeFG(integerPolynomial3, integerPolynomial4, integerPolynomial7, integerPolynomial8, i6);
        if (i17 == 0) {
            integerPolynomialMult = polynomial3.mult(integerPolynomial2, i7);
            polynomial4 = integerPolynomial7;
        } else {
            integerPolynomialMult = integerPolynomial7.mult(integerPolynomial2, i7);
            polynomial4 = polynomial3;
        }
        integerPolynomialMult.modPositive(i7);
        return new FGBasis(polynomial2, polynomial4, integerPolynomialMult, integerPolynomial7, integerPolynomial8, this.params);
    }

    public NTRUSigningPrivateKeyParameters.Basis generateBoundedBasis() {
        FGBasis fGBasisGenerateBasis;
        do {
            fGBasisGenerateBasis = generateBasis();
        } while (!fGBasisGenerateBasis.isNormOk());
        return fGBasisGenerateBasis;
    }

    public class BasisGenerationTask implements Callable<NTRUSigningPrivateKeyParameters.Basis> {
        private BasisGenerationTask() {
        }

        /* JADX DEBUG: Method merged with bridge method: call()Ljava/lang/Object; */
        @Override // java.util.concurrent.Callable
        public NTRUSigningPrivateKeyParameters.Basis call() throws Exception {
            return NTRUSigningKeyPairGenerator.this.generateBoundedBasis();
        }
    }

    public class FGBasis extends NTRUSigningPrivateKeyParameters.Basis {
        public IntegerPolynomial F;
        public IntegerPolynomial G;

        public FGBasis(Polynomial polynomial, Polynomial polynomial2, IntegerPolynomial integerPolynomial, IntegerPolynomial integerPolynomial2, IntegerPolynomial integerPolynomial3, NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters) {
            super(polynomial, polynomial2, integerPolynomial, nTRUSigningKeyGenerationParameters);
            this.F = integerPolynomial2;
            this.G = integerPolynomial3;
        }

        public boolean isNormOk() {
            NTRUSigningKeyGenerationParameters nTRUSigningKeyGenerationParameters = this.params;
            double d = nTRUSigningKeyGenerationParameters.keyNormBoundSq;
            int i = nTRUSigningKeyGenerationParameters.q;
            return ((double) this.F.centeredNormSq(i)) < d && ((double) this.G.centeredNormSq(i)) < d;
        }
    }
}
