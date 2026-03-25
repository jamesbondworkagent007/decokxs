package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlinx.serialization.internal.CollectionDescriptorsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yIu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56530yIu implements InterfaceC56559yJw {
    public static final Application AEQbTJ = new Application(null);
    public final java.util.List<KTypeProjection> EZpvd;
    public final InterfaceC56559yJw KWHzl;
    public final int OLrzqt;
    public final InterfaceC56553yJq copydefault;

    /* JADX INFO: renamed from: o.yIu$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56559yJw
    public java.util.List<KTypeProjection> getArguments() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56559yJw
    public InterfaceC56553yJq getClassifier() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56559yJw
    public boolean isMarkedNullable() {
        return (this.OLrzqt & 1) != 0;
    }

    public C56530yIu(@NotNull InterfaceC56553yJq interfaceC56553yJq, @NotNull java.util.List<KTypeProjection> list, InterfaceC56559yJw interfaceC56559yJw, int i) {
        Intrinsics.checkNotNullParameter(interfaceC56553yJq, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = interfaceC56553yJq;
        this.EZpvd = list;
        this.KWHzl = interfaceC56559yJw;
        this.OLrzqt = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C56530yIu(@NotNull InterfaceC56553yJq interfaceC56553yJq, @NotNull java.util.List<KTypeProjection> list, boolean z) {
        this(interfaceC56553yJq, list, null, z ? 1 : 0);
        Intrinsics.checkNotNullParameter(interfaceC56553yJq, "");
        Intrinsics.checkNotNullParameter(list, "");
    }

    @Override // o.InterfaceC56544yJh
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return yDY.AhwBna();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C56530yIu) {
            C56530yIu c56530yIu = (C56530yIu) obj;
            if (Intrinsics.EZpvd(getClassifier(), c56530yIu.getClassifier()) && Intrinsics.EZpvd(getArguments(), c56530yIu.getArguments()) && Intrinsics.EZpvd(this.KWHzl, c56530yIu.KWHzl) && this.OLrzqt == c56530yIu.OLrzqt) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + java.lang.Integer.hashCode(this.OLrzqt);
    }

    public java.lang.String toString() {
        return copydefault(false) + " (Kotlin reflection is not available)";
    }

    public final java.lang.String copydefault(boolean z) {
        java.lang.String name;
        InterfaceC56553yJq classifier = getClassifier();
        InterfaceC56551yJo interfaceC56551yJo = classifier instanceof InterfaceC56551yJo ? (InterfaceC56551yJo) classifier : null;
        java.lang.Class<?> clsOLrzqt = interfaceC56551yJo != null ? yHE.OLrzqt(interfaceC56551yJo) : null;
        if (clsOLrzqt == null) {
            name = getClassifier().toString();
        } else if ((this.OLrzqt & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsOLrzqt.isArray()) {
            name = OLrzqt(clsOLrzqt);
        } else if (z && clsOLrzqt.isPrimitive()) {
            InterfaceC56553yJq classifier2 = getClassifier();
            Intrinsics.copydefault(classifier2, "");
            name = yHE.copydefault((InterfaceC56551yJo) classifier2).getName();
        } else {
            name = clsOLrzqt.getName();
        }
        java.lang.String str = name + (getArguments().isEmpty() ? "" : CollectionsKt___CollectionsKt.joinToString$default(getArguments(), ", ", "<", ">", 0, null, new Function1() { // from class: o.yIy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C56530yIu.copydefault(this.KWHzl, (KTypeProjection) obj);
            }
        }, 24, null)) + (isMarkedNullable() ? "?" : "");
        InterfaceC56559yJw interfaceC56559yJw = this.KWHzl;
        if (!(interfaceC56559yJw instanceof C56530yIu)) {
            return str;
        }
        java.lang.String strCopydefault = ((C56530yIu) interfaceC56559yJw).copydefault(true);
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) str)) {
            return str;
        }
        if (Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) (str + '?'))) {
            return str + '!';
        }
        return '(' + str + ".." + strCopydefault + ')';
    }

    public static final java.lang.CharSequence copydefault(C56530yIu c56530yIu, KTypeProjection kTypeProjection) {
        Intrinsics.checkNotNullParameter(kTypeProjection, "");
        return c56530yIu.copydefault(kTypeProjection);
    }

    public final java.lang.String OLrzqt(java.lang.Class<?> cls) {
        return Intrinsics.EZpvd(cls, boolean[].class) ? "kotlin.BooleanArray" : Intrinsics.EZpvd(cls, char[].class) ? "kotlin.CharArray" : Intrinsics.EZpvd(cls, byte[].class) ? "kotlin.ByteArray" : Intrinsics.EZpvd(cls, short[].class) ? "kotlin.ShortArray" : Intrinsics.EZpvd(cls, int[].class) ? "kotlin.IntArray" : Intrinsics.EZpvd(cls, float[].class) ? "kotlin.FloatArray" : Intrinsics.EZpvd(cls, long[].class) ? "kotlin.LongArray" : Intrinsics.EZpvd(cls, double[].class) ? "kotlin.DoubleArray" : CollectionDescriptorsKt.ARRAY_NAME;
    }

    public final java.lang.String copydefault(KTypeProjection kTypeProjection) {
        java.lang.String strValueOf;
        if (kTypeProjection.OLrzqt() == null) {
            return "*";
        }
        InterfaceC56559yJw interfaceC56559yJwCopydefault = kTypeProjection.copydefault();
        C56530yIu c56530yIu = interfaceC56559yJwCopydefault instanceof C56530yIu ? (C56530yIu) interfaceC56559yJwCopydefault : null;
        if (c56530yIu == null || (strValueOf = c56530yIu.copydefault(true)) == null) {
            strValueOf = java.lang.String.valueOf(kTypeProjection.copydefault());
        }
        KVariance kVarianceOLrzqt = kTypeProjection.OLrzqt();
        int i = kVarianceOLrzqt == null ? -1 : TaskDescription.copydefault[kVarianceOLrzqt.ordinal()];
        if (i == 1) {
            return strValueOf;
        }
        if (i == 2) {
            return "in " + strValueOf;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + strValueOf;
    }

    /* JADX INFO: renamed from: o.yIu$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yIu.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
