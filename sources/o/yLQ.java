package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import o.yLN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yLQ implements yJD, yKQ {
    public static final /* synthetic */ yJA<java.lang.Object>[] AEQbTJ = {C56524yIo.copydefault(new PropertyReference1Impl(yLQ.class, "upperBounds", "getUpperBounds()Ljava/util/List;", 0))};
    public final yLM KWHzl;
    public final InterfaceC56691yOt OLrzqt;
    public final yLN.ActionBar copydefault;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: fJNWhG()Lo/yNs; */
    @Override // o.yKQ
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public InterfaceC56691yOt fJNWhG() {
        return this.OLrzqt;
    }

    public yLQ(yLM ylm, @NotNull InterfaceC56691yOt interfaceC56691yOt) {
        C56586yKw<?> c56586yKwKWHzl;
        java.lang.Object objAEQbTJ;
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        this.OLrzqt = interfaceC56691yOt;
        this.copydefault = yLN.copydefault(new yLO(this));
        if (ylm == null) {
            InterfaceC56665yNu interfaceC56665yNuAuCTel = fJNWhG().AuCTel();
            Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAuCTel, "");
            if (interfaceC56665yNuAuCTel instanceof InterfaceC56658yNn) {
                objAEQbTJ = KWHzl((InterfaceC56658yNn) interfaceC56665yNuAuCTel);
            } else if (interfaceC56665yNuAuCTel instanceof CallableMemberDescriptor) {
                InterfaceC56665yNu interfaceC56665yNuAuCTel2 = ((CallableMemberDescriptor) interfaceC56665yNuAuCTel).AuCTel();
                Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAuCTel2, "");
                if (interfaceC56665yNuAuCTel2 instanceof InterfaceC56658yNn) {
                    c56586yKwKWHzl = KWHzl((InterfaceC56658yNn) interfaceC56665yNuAuCTel2);
                } else {
                    InterfaceC59144zbW interfaceC59144zbW = interfaceC56665yNuAuCTel instanceof InterfaceC59144zbW ? (InterfaceC59144zbW) interfaceC56665yNuAuCTel : null;
                    if (interfaceC59144zbW == null) {
                        throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + interfaceC56665yNuAuCTel);
                    }
                    InterfaceC56551yJo interfaceC56551yJoKWHzl = yHE.KWHzl(AEQbTJ(interfaceC59144zbW));
                    Intrinsics.copydefault(interfaceC56551yJoKWHzl, "");
                    c56586yKwKWHzl = (C56586yKw) interfaceC56551yJoKWHzl;
                }
                objAEQbTJ = interfaceC56665yNuAuCTel.AEQbTJ(new C56564yKa(c56586yKwKWHzl), Unit.INSTANCE);
            } else {
                throw new KotlinReflectionInternalError("Unknown type parameter container: " + interfaceC56665yNuAuCTel);
            }
            ylm = (yLM) objAEQbTJ;
        }
        this.KWHzl = ylm;
    }

    @Override // o.yJD
    public java.lang.String OLrzqt() {
        java.lang.String strAEQbTJ = fJNWhG().bR_().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        return strAEQbTJ;
    }

    public static final java.util.List OLrzqt(yLQ ylq) {
        java.util.List<AbstractC59233zdF> listDjBIcL = ylq.fJNWhG().djBIcL();
        Intrinsics.checkNotNullExpressionValue(listDjBIcL, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
        java.util.Iterator<T> it = listDjBIcL.iterator();
        while (it.hasNext()) {
            arrayList.add(new yLJ((AbstractC59233zdF) it.next(), null, 2, null));
        }
        return arrayList;
    }

    @Override // o.yJD
    public java.util.List<InterfaceC56559yJw> EZpvd() {
        T tKWHzl = this.copydefault.KWHzl(this, AEQbTJ[0]);
        Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
        return (java.util.List) tKWHzl;
    }

    @Override // o.yJD
    public KVariance copydefault() {
        int i = Activity.copydefault[fJNWhG().values().ordinal()];
        if (i == 1) {
            return KVariance.INVARIANT;
        }
        if (i == 2) {
            return KVariance.IN;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return KVariance.OUT;
    }

    public final C56586yKw<?> KWHzl(InterfaceC56658yNn interfaceC56658yNn) {
        java.lang.Class<?> clsOLrzqt = yLX.OLrzqt(interfaceC56658yNn);
        C56586yKw<?> c56586yKw = (C56586yKw) (clsOLrzqt != null ? yHE.KWHzl(clsOLrzqt) : null);
        if (c56586yKw != null) {
            return c56586yKw;
        }
        throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + interfaceC56658yNn.AuCTel());
    }

    public final java.lang.Class<?> AEQbTJ(InterfaceC59144zbW interfaceC59144zbW) {
        java.lang.Class<?> clsAEQbTJ;
        InterfaceC59145zbX interfaceC59145zbXOcIXYQ = interfaceC59144zbW.OcIXYQ();
        yVS yvs = interfaceC59145zbXOcIXYQ instanceof yVS ? (yVS) interfaceC59145zbXOcIXYQ : null;
        InterfaceC56893yWf interfaceC56893yWfOLrzqt = yvs != null ? yvs.OLrzqt() : null;
        C56726yQa c56726yQa = interfaceC56893yWfOLrzqt instanceof C56726yQa ? (C56726yQa) interfaceC56893yWfOLrzqt : null;
        if (c56726yQa != null && (clsAEQbTJ = c56726yQa.AEQbTJ()) != null) {
            return clsAEQbTJ;
        }
        throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + interfaceC59144zbW);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof yLQ) {
            yLQ ylq = (yLQ) obj;
            if (Intrinsics.EZpvd(this.KWHzl, ylq.KWHzl) && Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) ylq.OLrzqt())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + OLrzqt().hashCode();
    }

    public java.lang.String toString() {
        return C56531yIv.copydefault.OLrzqt(this);
    }
}
