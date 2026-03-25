package org.spongycastle.math.ec;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes25.dex */
public class FixedPointCombMultiplier extends AbstractECMultiplier {
    public int getWidthForCombSize(int i) {
        return i > 257 ? 6 : 5;
    }

    @Override // org.spongycastle.math.ec.AbstractECMultiplier
    public ECPoint multiplyPositive(ECPoint eCPoint, BigInteger bigInteger) {
        ECCurve curve = eCPoint.getCurve();
        int combSize = FixedPointUtil.getCombSize(curve);
        if (bigInteger.bitLength() > combSize) {
            throw new IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        FixedPointPreCompInfo fixedPointPreCompInfoPrecompute = FixedPointUtil.precompute(eCPoint, getWidthForCombSize(combSize));
        ECPoint[] preComp = fixedPointPreCompInfoPrecompute.getPreComp();
        int width = ((combSize + r3) - 1) / fixedPointPreCompInfoPrecompute.getWidth();
        ECPoint infinity = curve.getInfinity();
        for (int i = 0; i < width; i++) {
            int i2 = 0;
            for (int i3 = ((r3 * width) - 1) - i; i3 >= 0; i3 -= width) {
                i2 <<= 1;
                if (bigInteger.testBit(i3)) {
                    i2 |= 1;
                }
            }
            infinity = infinity.twicePlus(preComp[i2]);
        }
        return infinity.add(fixedPointPreCompInfoPrecompute.getOffset());
    }
}
