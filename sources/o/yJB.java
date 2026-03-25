package o;

import java.lang.reflect.Modifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.TypesJVMKt$typeToString$unwrap$1;
import kotlin.sequences.Sequence;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yJB {

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    public static final java.lang.reflect.Type AEQbTJ(@NotNull InterfaceC56559yJw interfaceC56559yJw) {
        java.lang.reflect.Type typeEZpvd;
        Intrinsics.checkNotNullParameter(interfaceC56559yJw, "");
        return (!(interfaceC56559yJw instanceof InterfaceC56522yIm) || (typeEZpvd = ((InterfaceC56522yIm) interfaceC56559yJw).EZpvd()) == null) ? computeJavaType$default(interfaceC56559yJw, false, 1, null) : typeEZpvd;
    }

    public static /* synthetic */ java.lang.reflect.Type computeJavaType$default(InterfaceC56559yJw interfaceC56559yJw, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return AEQbTJ(interfaceC56559yJw, z);
    }

    public static final java.lang.reflect.Type AEQbTJ(InterfaceC56559yJw interfaceC56559yJw, boolean z) {
        InterfaceC56553yJq classifier = interfaceC56559yJw.getClassifier();
        if (classifier instanceof yJD) {
            return new yJE((yJD) classifier);
        }
        if (classifier instanceof InterfaceC56551yJo) {
            InterfaceC56551yJo interfaceC56551yJo = (InterfaceC56551yJo) classifier;
            java.lang.Class clsCopydefault = z ? yHE.copydefault(interfaceC56551yJo) : yHE.OLrzqt(interfaceC56551yJo);
            java.util.List<KTypeProjection> arguments = interfaceC56559yJw.getArguments();
            if (arguments.isEmpty()) {
                return clsCopydefault;
            }
            if (clsCopydefault.isArray()) {
                if (clsCopydefault.getComponentType().isPrimitive()) {
                    return clsCopydefault;
                }
                KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt___CollectionsKt.zuBGHE(arguments);
                if (kTypeProjection == null) {
                    throw new java.lang.IllegalArgumentException("kotlin.Array must have exactly one type argument: " + interfaceC56559yJw);
                }
                KVariance kVarianceKWHzl = kTypeProjection.KWHzl();
                InterfaceC56559yJw interfaceC56559yJwEZpvd = kTypeProjection.EZpvd();
                int i = kVarianceKWHzl == null ? -1 : Activity.EZpvd[kVarianceKWHzl.ordinal()];
                if (i == -1 || i == 1) {
                    return clsCopydefault;
                }
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.copydefault(interfaceC56559yJwEZpvd);
                java.lang.reflect.Type typeComputeJavaType$default = computeJavaType$default(interfaceC56559yJwEZpvd, false, 1, null);
                return typeComputeJavaType$default instanceof java.lang.Class ? clsCopydefault : new C56546yJj(typeComputeJavaType$default);
            }
            return AEQbTJ((java.lang.Class<?>) clsCopydefault, arguments);
        }
        throw new java.lang.UnsupportedOperationException("Unsupported type classifier: " + interfaceC56559yJw);
    }

    public static final java.lang.reflect.Type AEQbTJ(java.lang.Class<?> cls, java.util.List<KTypeProjection> list) {
        java.lang.Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            if (!Modifier.isStatic(cls.getModifiers())) {
                int length = cls.getTypeParameters().length;
                java.lang.reflect.Type typeAEQbTJ = AEQbTJ(declaringClass, list.subList(length, list.size()));
                java.util.List<KTypeProjection> listSubList = list.subList(0, length);
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listSubList, 10));
                java.util.Iterator<T> it = listSubList.iterator();
                while (it.hasNext()) {
                    arrayList.add(KWHzl((KTypeProjection) it.next()));
                }
                return new yJF(cls, typeAEQbTJ, arrayList);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(KWHzl((KTypeProjection) it2.next()));
            }
            return new yJF(cls, declaringClass, arrayList2);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList3.add(KWHzl((KTypeProjection) it3.next()));
        }
        return new yJF(cls, null, arrayList3);
    }

    public static final java.lang.reflect.Type KWHzl(KTypeProjection kTypeProjection) {
        KVariance kVarianceOLrzqt = kTypeProjection.OLrzqt();
        if (kVarianceOLrzqt == null) {
            return yJH.AEQbTJ.copydefault();
        }
        InterfaceC56559yJw interfaceC56559yJwCopydefault = kTypeProjection.copydefault();
        Intrinsics.copydefault(interfaceC56559yJwCopydefault);
        int i = Activity.EZpvd[kVarianceOLrzqt.ordinal()];
        if (i == 1) {
            return new yJH(null, AEQbTJ(interfaceC56559yJwCopydefault, true));
        }
        if (i == 2) {
            return AEQbTJ(interfaceC56559yJwCopydefault, true);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return new yJH(AEQbTJ(interfaceC56559yJwCopydefault, true), null);
    }

    public static final java.lang.String EZpvd(java.lang.reflect.Type type) {
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            if (cls.isArray()) {
                Sequence sequenceEZpvd = C59405zgS.EZpvd(type, (Function1<? super java.lang.reflect.Type, ? extends java.lang.reflect.Type>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) TypesJVMKt$typeToString$unwrap$1.INSTANCE));
                return ((java.lang.Class) C59467zhb.zsXlph(sequenceEZpvd)).getName() + C59449zhJ.copydefault(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, C59467zhb.uzCIH(sequenceEZpvd));
            }
            java.lang.String name = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            return name;
        }
        return type.toString();
    }
}
