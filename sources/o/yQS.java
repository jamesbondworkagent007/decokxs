package o;

import java.lang.reflect.WildcardType;
import kotlin.jvm.internal.Intrinsics;
import o.yQN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yQS extends yQN implements InterfaceC56845yUl {
    public final java.util.Collection<yTO> KWHzl;
    public final boolean OLrzqt;
    public final WildcardType copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yTM
    public java.util.Collection<yTO> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yTM
    public boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/lang/reflect/Type; */
    @Override // o.yQN
    /* JADX INFO: renamed from: djBIcL, reason: merged with bridge method [inline-methods] */
    public WildcardType OLrzqt() {
        return this.copydefault;
    }

    public yQS(@NotNull WildcardType wildcardType) {
        Intrinsics.checkNotNullParameter(wildcardType, "");
        this.copydefault = wildcardType;
        this.KWHzl = yDY.AhwBna();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault()Lo/yUf; */
    @Override // o.InterfaceC56845yUl
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public yQN copydefault() {
        java.lang.reflect.Type[] upperBounds = OLrzqt().getUpperBounds();
        java.lang.reflect.Type[] lowerBounds = OLrzqt().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new java.lang.UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + OLrzqt());
        }
        if (lowerBounds.length == 1) {
            yQN.StateListAnimator stateListAnimator = yQN.AYXKKw;
            Intrinsics.copydefault(lowerBounds);
            java.lang.Object objSSMYrx = yDV.sSMYrx(lowerBounds);
            Intrinsics.checkNotNullExpressionValue(objSSMYrx, "");
            return stateListAnimator.EZpvd((java.lang.reflect.Type) objSSMYrx);
        }
        if (upperBounds.length == 1) {
            Intrinsics.copydefault(upperBounds);
            java.lang.reflect.Type type = (java.lang.reflect.Type) yDV.sSMYrx(upperBounds);
            if (!Intrinsics.EZpvd(type, java.lang.Object.class)) {
                yQN.StateListAnimator stateListAnimator2 = yQN.AYXKKw;
                Intrinsics.copydefault(type);
                return stateListAnimator2.EZpvd(type);
            }
        }
        return null;
    }

    @Override // o.InterfaceC56845yUl
    public boolean AhwBna() {
        Intrinsics.checkNotNullExpressionValue(OLrzqt().getUpperBounds(), "");
        return !Intrinsics.EZpvd(yDV.zsXlph(r0), java.lang.Object.class);
    }
}
