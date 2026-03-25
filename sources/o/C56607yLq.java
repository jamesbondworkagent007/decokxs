package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import o.C56632yMo;
import o.yLN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yLq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56607yLq implements KParameter {
    public static final /* synthetic */ yJA<java.lang.Object>[] AEQbTJ = {C56524yIo.copydefault(new PropertyReference1Impl(C56607yLq.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(C56607yLq.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};
    public final yLN.ActionBar EZpvd;
    public final yLN.ActionBar KWHzl;
    public final int OLrzqt;
    public final AbstractC56573yKj<?> copydefault;
    public final KParameter.Kind djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.reflect.KParameter
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC56573yKj<?> AhwBna() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.reflect.KParameter
    public KParameter.Kind OLrzqt() {
        return this.djBIcL;
    }

    public C56607yLq(@NotNull AbstractC56573yKj<?> abstractC56573yKj, int i, @NotNull KParameter.Kind kind, @NotNull Function0<? extends InterfaceC56678yOg> function0) {
        Intrinsics.checkNotNullParameter(abstractC56573yKj, "");
        Intrinsics.checkNotNullParameter(kind, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.copydefault = abstractC56573yKj;
        this.OLrzqt = i;
        this.djBIcL = kind;
        this.EZpvd = yLN.copydefault(function0);
        this.KWHzl = yLN.copydefault(new C56605yLo(this));
    }

    public final InterfaceC56678yOg gEmmrt() {
        T tKWHzl = this.EZpvd.KWHzl(this, AEQbTJ[0]);
        Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
        return (InterfaceC56678yOg) tKWHzl;
    }

    public static final java.util.List AEQbTJ(C56607yLq c56607yLq) {
        return yLX.KWHzl(c56607yLq.gEmmrt());
    }

    @Override // o.InterfaceC56544yJh
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        T tKWHzl = this.KWHzl.KWHzl(this, AEQbTJ[1]);
        Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
        return (java.util.List) tKWHzl;
    }

    @Override // kotlin.reflect.KParameter
    public java.lang.String KWHzl() {
        InterfaceC56678yOg interfaceC56678yOgGEmmrt = gEmmrt();
        InterfaceC56695yOx interfaceC56695yOx = interfaceC56678yOgGEmmrt instanceof InterfaceC56695yOx ? (InterfaceC56695yOx) interfaceC56678yOgGEmmrt : null;
        if (interfaceC56695yOx == null || interfaceC56695yOx.AYXKKw().values()) {
            return null;
        }
        C56935yXu c56935yXuBR_ = interfaceC56695yOx.bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
        if (c56935yXuBR_.OLrzqt()) {
            return null;
        }
        return c56935yXuBR_.AEQbTJ();
    }

    public final java.lang.reflect.Type OLrzqt(java.lang.reflect.Type... typeArr) {
        int length = typeArr.length;
        if (length == 0) {
            throw new KotlinReflectionNotSupportedError("Expected at least 1 type for compound type");
        }
        if (length == 1) {
            return (java.lang.reflect.Type) yDV.sSMYrx(typeArr);
        }
        return new StateListAnimator(typeArr);
    }

    /* JADX INFO: renamed from: o.yLq$StateListAnimator */
    public static final class StateListAnimator implements java.lang.reflect.Type {
        public final int AEQbTJ;
        public final java.lang.reflect.Type[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ;
        }

        public StateListAnimator(@NotNull java.lang.reflect.Type[] typeArr) {
            Intrinsics.checkNotNullParameter(typeArr, "");
            this.OLrzqt = typeArr;
            this.AEQbTJ = java.util.Arrays.hashCode(typeArr);
        }

        @Override // java.lang.reflect.Type
        public java.lang.String getTypeName() {
            return yDV.joinToString$default(this.OLrzqt, ", ", "[", "]", 0, (java.lang.CharSequence) null, (Function1) null, 56, (java.lang.Object) null);
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof StateListAnimator) && java.util.Arrays.equals(this.OLrzqt, ((StateListAnimator) obj).OLrzqt);
        }

        public java.lang.String toString() {
            return getTypeName();
        }
    }

    @Override // kotlin.reflect.KParameter
    public InterfaceC56559yJw copydefault() {
        AbstractC59233zdF abstractC59233zdFUzCIH = gEmmrt().uzCIH();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFUzCIH, "");
        return new yLJ(abstractC59233zdFUzCIH, new C56604yLn(this));
    }

    public static final java.lang.reflect.Type KWHzl(C56607yLq c56607yLq) {
        java.util.List listCopydefault;
        InterfaceC56678yOg interfaceC56678yOgGEmmrt = c56607yLq.gEmmrt();
        if ((interfaceC56678yOgGEmmrt instanceof InterfaceC56679yOh) && Intrinsics.EZpvd(yLX.EZpvd((InterfaceC56657yNm) c56607yLq.copydefault.values()), interfaceC56678yOgGEmmrt) && c56607yLq.copydefault.values().bW_() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            InterfaceC56665yNu interfaceC56665yNuAYXKKw = c56607yLq.copydefault.values().AYXKKw();
            Intrinsics.copydefault(interfaceC56665yNuAYXKKw, "");
            java.lang.Class<?> clsOLrzqt = yLX.OLrzqt((InterfaceC56658yNn) interfaceC56665yNuAYXKKw);
            if (clsOLrzqt != null) {
                return clsOLrzqt;
            }
            throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + interfaceC56678yOgGEmmrt);
        }
        InterfaceC56627yMj<?> interfaceC56627yMjEZpvd = c56607yLq.copydefault.EZpvd();
        if (interfaceC56627yMjEZpvd instanceof C56632yMo) {
            if (c56607yLq.copydefault.gEmmrt()) {
                C56632yMo c56632yMo = (C56632yMo) interfaceC56627yMjEZpvd;
                kotlin.ranges.IntRange intRangeCopydefault = c56632yMo.copydefault(c56607yLq.AEQbTJ() + 1);
                int iCopydefault = c56632yMo.copydefault(0).copydefault() + 1;
                listCopydefault = CollectionsKt___CollectionsKt.copydefault((java.util.List) c56632yMo.AEQbTJ(), new kotlin.ranges.IntRange(intRangeCopydefault.KWHzl() - iCopydefault, intRangeCopydefault.copydefault() - iCopydefault));
            } else {
                C56632yMo c56632yMo2 = (C56632yMo) interfaceC56627yMjEZpvd;
                listCopydefault = CollectionsKt___CollectionsKt.copydefault((java.util.List) c56632yMo2.AEQbTJ(), c56632yMo2.copydefault(c56607yLq.AEQbTJ()));
            }
            java.lang.reflect.Type[] typeArr = (java.lang.reflect.Type[]) listCopydefault.toArray(new java.lang.reflect.Type[0]);
            return c56607yLq.OLrzqt((java.lang.reflect.Type[]) java.util.Arrays.copyOf(typeArr, typeArr.length));
        }
        if (interfaceC56627yMjEZpvd instanceof C56632yMo.ActionBar) {
            java.lang.Class[] clsArr = (java.lang.Class[]) ((C56632yMo.ActionBar) interfaceC56627yMjEZpvd).AYXKKw().get(c56607yLq.AEQbTJ()).toArray(new java.lang.Class[0]);
            return c56607yLq.OLrzqt((java.lang.reflect.Type[]) java.util.Arrays.copyOf(clsArr, clsArr.length));
        }
        return interfaceC56627yMjEZpvd.AEQbTJ().get(c56607yLq.AEQbTJ());
    }

    @Override // kotlin.reflect.KParameter
    public boolean EZpvd() {
        InterfaceC56678yOg interfaceC56678yOgGEmmrt = gEmmrt();
        InterfaceC56695yOx interfaceC56695yOx = interfaceC56678yOgGEmmrt instanceof InterfaceC56695yOx ? (InterfaceC56695yOx) interfaceC56678yOgGEmmrt : null;
        if (interfaceC56695yOx != null) {
            return yZE.copydefault(interfaceC56695yOx);
        }
        return false;
    }

    @Override // kotlin.reflect.KParameter
    public boolean valueOf() {
        InterfaceC56678yOg interfaceC56678yOgGEmmrt = gEmmrt();
        return (interfaceC56678yOgGEmmrt instanceof InterfaceC56695yOx) && ((InterfaceC56695yOx) interfaceC56678yOgGEmmrt).ejfBZ() != null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C56607yLq) {
            C56607yLq c56607yLq = (C56607yLq) obj;
            if (Intrinsics.EZpvd(this.copydefault, c56607yLq.copydefault) && AEQbTJ() == c56607yLq.AEQbTJ()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + java.lang.Integer.hashCode(AEQbTJ());
    }

    public java.lang.String toString() {
        return yLS.EZpvd.AEQbTJ(this);
    }
}
