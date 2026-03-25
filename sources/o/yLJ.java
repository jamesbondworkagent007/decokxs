package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.WildcardType;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import o.yLN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yLJ implements InterfaceC56522yIm {
    public static final /* synthetic */ yJA<java.lang.Object>[] KWHzl = {C56524yIo.copydefault(new PropertyReference1Impl(yLJ.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(yLJ.class, "arguments", "getArguments()Ljava/util/List;", 0))};
    public final AbstractC59233zdF AEQbTJ;
    public final yLN.ActionBar EZpvd;
    public final yLN.ActionBar OLrzqt;
    public final yLN.ActionBar<java.lang.reflect.Type> copydefault;

    public final /* synthetic */ class Application {
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
    public final AbstractC59233zdF AEQbTJ() {
        return this.AEQbTJ;
    }

    public yLJ(@NotNull AbstractC59233zdF abstractC59233zdF, Function0<? extends java.lang.reflect.Type> function0) {
        Intrinsics.checkNotNullParameter(abstractC59233zdF, "");
        this.AEQbTJ = abstractC59233zdF;
        yLN.ActionBar<java.lang.reflect.Type> actionBarCopydefault = null;
        yLN.ActionBar<java.lang.reflect.Type> actionBar = function0 instanceof yLN.ActionBar ? (yLN.ActionBar) function0 : null;
        if (actionBar != null) {
            actionBarCopydefault = actionBar;
        } else if (function0 != null) {
            actionBarCopydefault = yLN.copydefault(function0);
        }
        this.copydefault = actionBarCopydefault;
        this.OLrzqt = yLN.copydefault(new yLL(this));
        this.EZpvd = yLN.copydefault(new yLK(this, function0));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.zdF)
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r2v0 kotlin.jvm.functions.Function0))
 A[MD:(o.zdF, kotlin.jvm.functions.Function0<? extends java.lang.reflect.Type>):void (m)] (LINE:38) call: o.yLJ.<init>(o.zdF, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ yLJ(AbstractC59233zdF abstractC59233zdF, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC59233zdF, (i & 2) != 0 ? null : function0);
    }

    @Override // o.InterfaceC56522yIm
    public java.lang.reflect.Type EZpvd() {
        yLN.ActionBar<java.lang.reflect.Type> actionBar = this.copydefault;
        if (actionBar != null) {
            return actionBar.invoke();
        }
        return null;
    }

    public static final InterfaceC56553yJq AEQbTJ(yLJ ylj) {
        return ylj.OLrzqt(ylj.AEQbTJ);
    }

    @Override // o.InterfaceC56559yJw
    public InterfaceC56553yJq getClassifier() {
        return (InterfaceC56553yJq) this.OLrzqt.KWHzl(this, KWHzl[0]);
    }

    public final InterfaceC56553yJq OLrzqt(AbstractC59233zdF abstractC59233zdF) {
        AbstractC59233zdF abstractC59233zdFOLrzqt;
        InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdF.djBIcL().KWHzl();
        if (interfaceC56663yNsKWHzl instanceof InterfaceC56658yNn) {
            java.lang.Class<?> clsOLrzqt = yLX.OLrzqt((InterfaceC56658yNn) interfaceC56663yNsKWHzl);
            if (clsOLrzqt == null) {
                return null;
            }
            if (clsOLrzqt.isArray()) {
                InterfaceC59317zek interfaceC59317zek = (InterfaceC59317zek) CollectionsKt___CollectionsKt.zuBGHE(abstractC59233zdF.bY_());
                if (interfaceC59317zek == null || (abstractC59233zdFOLrzqt = interfaceC59317zek.OLrzqt()) == null) {
                    return new C56586yKw(clsOLrzqt);
                }
                InterfaceC56553yJq interfaceC56553yJqOLrzqt = OLrzqt(abstractC59233zdFOLrzqt);
                if (interfaceC56553yJqOLrzqt == null) {
                    throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
                }
                return new C56586yKw(yLX.AEQbTJ((java.lang.Class<?>) yHE.OLrzqt(yJL.EZpvd(interfaceC56553yJqOLrzqt))));
            }
            if (!C59322zep.valueOf(abstractC59233zdF)) {
                java.lang.Class<?> clsOLrzqt2 = C56743yQr.OLrzqt(clsOLrzqt);
                if (clsOLrzqt2 != null) {
                    clsOLrzqt = clsOLrzqt2;
                }
                return new C56586yKw(clsOLrzqt);
            }
            return new C56586yKw(clsOLrzqt);
        }
        if (interfaceC56663yNsKWHzl instanceof InterfaceC56691yOt) {
            return new yLQ(null, (InterfaceC56691yOt) interfaceC56663yNsKWHzl);
        }
        if (!(interfaceC56663yNsKWHzl instanceof InterfaceC56690yOs)) {
            return null;
        }
        throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
    }

    @Override // o.InterfaceC56559yJw
    public java.util.List<KTypeProjection> getArguments() {
        T tKWHzl = this.EZpvd.KWHzl(this, KWHzl[1]);
        Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
        return (java.util.List) tKWHzl;
    }

    public static final java.util.List copydefault(yLJ ylj, Function0 function0) {
        KTypeProjection kTypeProjectionKWHzl;
        java.util.List<InterfaceC59317zek> listBY_ = ylj.AEQbTJ.bY_();
        if (listBY_.isEmpty()) {
            return yDY.AhwBna();
        }
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new yLH(ylj));
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listBY_, 10));
        int i = 0;
        for (java.lang.Object obj : listBY_) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            InterfaceC59317zek interfaceC59317zek = (InterfaceC59317zek) obj;
            if (interfaceC59317zek.AEQbTJ()) {
                kTypeProjectionKWHzl = KTypeProjection.copydefault.EZpvd();
            } else {
                AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zek.OLrzqt();
                Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
                yLJ ylj2 = new yLJ(abstractC59233zdFOLrzqt, function0 == null ? null : new yLI(ylj, i, interfaceC56387yDmEZpvd));
                int i2 = Application.copydefault[interfaceC59317zek.EZpvd().ordinal()];
                if (i2 == 1) {
                    kTypeProjectionKWHzl = KTypeProjection.copydefault.KWHzl(ylj2);
                } else if (i2 == 2) {
                    kTypeProjectionKWHzl = KTypeProjection.copydefault.EZpvd(ylj2);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kTypeProjectionKWHzl = KTypeProjection.copydefault.AEQbTJ(ylj2);
                }
            }
            arrayList.add(kTypeProjectionKWHzl);
            i++;
        }
        return arrayList;
    }

    public static final java.util.List<java.lang.reflect.Type> EZpvd(InterfaceC56387yDm<? extends java.util.List<? extends java.lang.reflect.Type>> interfaceC56387yDm) {
        return (java.util.List) interfaceC56387yDm.getValue();
    }

    public static final java.util.List KWHzl(yLJ ylj) {
        java.lang.reflect.Type typeEZpvd = ylj.EZpvd();
        Intrinsics.copydefault(typeEZpvd);
        return C56743yQr.OLrzqt(typeEZpvd);
    }

    public static final java.lang.reflect.Type copydefault(yLJ ylj, int i, InterfaceC56387yDm<? extends java.util.List<? extends java.lang.reflect.Type>> interfaceC56387yDm) {
        java.lang.reflect.Type type;
        java.lang.reflect.Type typeEZpvd = ylj.EZpvd();
        if (typeEZpvd instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) typeEZpvd;
            java.lang.Class componentType = cls.isArray() ? cls.getComponentType() : java.lang.Object.class;
            Intrinsics.copydefault(componentType);
            return componentType;
        }
        if (typeEZpvd instanceof GenericArrayType) {
            if (i != 0) {
                throw new KotlinReflectionInternalError("Array type has been queried for a non-0th argument: " + ylj);
            }
            java.lang.reflect.Type genericComponentType = ((GenericArrayType) typeEZpvd).getGenericComponentType();
            Intrinsics.copydefault(genericComponentType);
            return genericComponentType;
        }
        if (typeEZpvd instanceof ParameterizedType) {
            java.lang.reflect.Type type2 = EZpvd(interfaceC56387yDm).get(i);
            if (!(type2 instanceof WildcardType)) {
                return type2;
            }
            WildcardType wildcardType = (WildcardType) type2;
            java.lang.reflect.Type[] lowerBounds = wildcardType.getLowerBounds();
            Intrinsics.checkNotNullExpressionValue(lowerBounds, "");
            java.lang.reflect.Type type3 = (java.lang.reflect.Type) yDV.zsXlph(lowerBounds);
            if (type3 == null) {
                java.lang.reflect.Type[] upperBounds = wildcardType.getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "");
                type = (java.lang.reflect.Type) yDV.AuCTelauCTel(upperBounds);
            } else {
                type = type3;
            }
            Intrinsics.copydefault(type);
            return type;
        }
        throw new KotlinReflectionInternalError("Non-generic type has been queried for arguments: " + ylj);
    }

    @Override // o.InterfaceC56559yJw
    public boolean isMarkedNullable() {
        return this.AEQbTJ.AEQbTJ();
    }

    @Override // o.InterfaceC56544yJh
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return yLX.KWHzl(this.AEQbTJ);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof yLJ) {
            yLJ ylj = (yLJ) obj;
            if (Intrinsics.EZpvd(this.AEQbTJ, ylj.AEQbTJ) && Intrinsics.EZpvd(getClassifier(), ylj.getClassifier()) && Intrinsics.EZpvd(getArguments(), ylj.getArguments())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        InterfaceC56553yJq classifier = getClassifier();
        return (((iHashCode * 31) + (classifier != null ? classifier.hashCode() : 0)) * 31) + getArguments().hashCode();
    }

    public java.lang.String toString() {
        return yLS.EZpvd.OLrzqt(this.AEQbTJ);
    }
}
