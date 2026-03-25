package org.spongycastle.pqc.math.linearalgebra;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes25.dex */
public abstract class GF2nField {
    protected GF2Polynomial fieldPolynomial;
    protected java.util.Vector fields;
    protected int mDegree;
    protected java.util.Vector matrices;
    protected final SecureRandom random;

    public abstract void computeCOBMatrix(GF2nField gF2nField);

    public abstract void computeFieldPolynomial();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDegree() {
        return this.mDegree;
    }

    public abstract GF2nElement getRandomRoot(GF2Polynomial gF2Polynomial);

    public GF2nField(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public final GF2Polynomial getFieldPolynomial() {
        if (this.fieldPolynomial == null) {
            computeFieldPolynomial();
        }
        return new GF2Polynomial(this.fieldPolynomial);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nField)) {
            return false;
        }
        GF2nField gF2nField = (GF2nField) obj;
        if (gF2nField.mDegree != this.mDegree || !this.fieldPolynomial.equals(gF2nField.fieldPolynomial)) {
            return false;
        }
        if (!(this instanceof GF2nPolynomialField) || (gF2nField instanceof GF2nPolynomialField)) {
            return !(this instanceof GF2nONBField) || (gF2nField instanceof GF2nONBField);
        }
        return false;
    }

    public int hashCode() {
        return this.mDegree + this.fieldPolynomial.hashCode();
    }

    public final GF2Polynomial[] invertMatrix(GF2Polynomial[] gF2PolynomialArr) {
        GF2Polynomial[] gF2PolynomialArr2 = new GF2Polynomial[gF2PolynomialArr.length];
        GF2Polynomial[] gF2PolynomialArr3 = new GF2Polynomial[gF2PolynomialArr.length];
        int i = 0;
        for (int i2 = 0; i2 < this.mDegree; i2++) {
            try {
                gF2PolynomialArr2[i2] = new GF2Polynomial(gF2PolynomialArr[i2]);
                GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree);
                gF2PolynomialArr3[i2] = gF2Polynomial;
                gF2Polynomial.setBit((this.mDegree - 1) - i2);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        while (true) {
            int i3 = this.mDegree - 1;
            if (i >= i3) {
                while (i3 > 0) {
                    for (int i4 = i3 - 1; i4 >= 0; i4--) {
                        if (gF2PolynomialArr2[i4].testBit((this.mDegree - 1) - i3)) {
                            gF2PolynomialArr2[i4].addToThis(gF2PolynomialArr2[i3]);
                            gF2PolynomialArr3[i4].addToThis(gF2PolynomialArr3[i3]);
                        }
                    }
                    i3--;
                }
                return gF2PolynomialArr3;
            }
            int i5 = i;
            while (true) {
                int i6 = this.mDegree;
                if (i5 >= i6 || gF2PolynomialArr2[i5].testBit((i6 - 1) - i)) {
                    break;
                }
                i5++;
            }
            if (i5 >= this.mDegree) {
                throw new RuntimeException("GF2nField.invertMatrix: Matrix cannot be inverted!");
            }
            if (i != i5) {
                GF2Polynomial gF2Polynomial2 = gF2PolynomialArr2[i];
                gF2PolynomialArr2[i] = gF2PolynomialArr2[i5];
                gF2PolynomialArr2[i5] = gF2Polynomial2;
                GF2Polynomial gF2Polynomial3 = gF2PolynomialArr3[i];
                gF2PolynomialArr3[i] = gF2PolynomialArr3[i5];
                gF2PolynomialArr3[i5] = gF2Polynomial3;
            }
            int i7 = i + 1;
            int i8 = i7;
            while (true) {
                int i9 = this.mDegree;
                if (i8 < i9) {
                    if (gF2PolynomialArr2[i8].testBit((i9 - 1) - i)) {
                        gF2PolynomialArr2[i8].addToThis(gF2PolynomialArr2[i]);
                        gF2PolynomialArr3[i8].addToThis(gF2PolynomialArr3[i]);
                    }
                    i8++;
                }
            }
            i = i7;
        }
    }

    public final GF2nElement convert(GF2nElement gF2nElement, GF2nField gF2nField) throws RuntimeException {
        if (gF2nField == this) {
            return (GF2nElement) gF2nElement.clone();
        }
        if (this.fieldPolynomial.equals(gF2nField.fieldPolynomial)) {
            return (GF2nElement) gF2nElement.clone();
        }
        if (this.mDegree != gF2nField.mDegree) {
            throw new RuntimeException("GF2nField.convert: B1 has a different degree and thus cannot be coverted to!");
        }
        int iIndexOf = this.fields.indexOf(gF2nField);
        if (iIndexOf == -1) {
            computeCOBMatrix(gF2nField);
            iIndexOf = this.fields.indexOf(gF2nField);
        }
        GF2Polynomial[] gF2PolynomialArr = (GF2Polynomial[]) this.matrices.elementAt(iIndexOf);
        GF2nElement gF2nElement2 = (GF2nElement) gF2nElement.clone();
        if (gF2nElement2 instanceof GF2nONBElement) {
            ((GF2nONBElement) gF2nElement2).reverseOrder();
        }
        GF2Polynomial gF2Polynomial = new GF2Polynomial(this.mDegree, gF2nElement2.toFlexiBigInt());
        gF2Polynomial.expandN(this.mDegree);
        GF2Polynomial gF2Polynomial2 = new GF2Polynomial(this.mDegree);
        for (int i = 0; i < this.mDegree; i++) {
            if (gF2Polynomial.vectorMult(gF2PolynomialArr[i])) {
                gF2Polynomial2.setBit((this.mDegree - 1) - i);
            }
        }
        if (gF2nField instanceof GF2nPolynomialField) {
            return new GF2nPolynomialElement((GF2nPolynomialField) gF2nField, gF2Polynomial2);
        }
        if (gF2nField instanceof GF2nONBField) {
            GF2nONBElement gF2nONBElement = new GF2nONBElement((GF2nONBField) gF2nField, gF2Polynomial2.toFlexiBigInt());
            gF2nONBElement.reverseOrder();
            return gF2nONBElement;
        }
        throw new RuntimeException("GF2nField.convert: B1 must be an instance of GF2nPolynomialField or GF2nONBField!");
    }
}
