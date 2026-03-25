package o;

import androidx.camera.video.AudioStats;
import androidx.compose.material3.TextFieldImplKt;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import o.C56737yQl;
import o.C56984yZp;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yLX {
    public static final C56933yXs KWHzl = new C56933yXs("kotlin.jvm.JvmStatic");

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PrimitiveType.values().length];
            try {
                iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PrimitiveType.CHAR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PrimitiveType.BYTE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PrimitiveType.SHORT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[PrimitiveType.INT.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[PrimitiveType.LONG.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final C56933yXs copydefault() {
        return KWHzl;
    }

    public static final java.lang.Class<?> OLrzqt(@NotNull InterfaceC56658yNn interfaceC56658yNn) {
        Intrinsics.checkNotNullParameter(interfaceC56658yNn, "");
        InterfaceC56686yOo interfaceC56686yOoFARcdN = interfaceC56658yNn.fARcdN();
        Intrinsics.checkNotNullExpressionValue(interfaceC56686yOoFARcdN, "");
        if (interfaceC56686yOoFARcdN instanceof C56891yWd) {
            InterfaceC56893yWf interfaceC56893yWfEZpvd = ((C56891yWd) interfaceC56686yOoFARcdN).EZpvd();
            Intrinsics.copydefault(interfaceC56893yWfEZpvd, "");
            return ((C56726yQa) interfaceC56893yWfEZpvd).AEQbTJ();
        }
        if (interfaceC56686yOoFARcdN instanceof C56737yQl.StateListAnimator) {
            yQG yqgEZpvd = ((C56737yQl.StateListAnimator) interfaceC56686yOoFARcdN).EZpvd();
            Intrinsics.copydefault(yqgEZpvd, "");
            return ((C56750yQy) yqgEZpvd).KWHzl();
        }
        C56929yXo c56929yXoEZpvd = yZE.EZpvd((InterfaceC56663yNs) interfaceC56658yNn);
        if (c56929yXoEZpvd == null) {
            return null;
        }
        return copydefault(C56743yQr.copydefault(interfaceC56658yNn.getClass()), c56929yXoEZpvd, 0);
    }

    public static /* synthetic */ java.lang.Class loadClass$default(java.lang.ClassLoader classLoader, C56929yXo c56929yXo, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return copydefault(classLoader, c56929yXo, i);
    }

    public static final java.lang.Class<?> copydefault(java.lang.ClassLoader classLoader, C56929yXo c56929yXo, int i) {
        C56929yXo c56929yXoAEQbTJ = yML.OLrzqt.AEQbTJ(c56929yXo.AEQbTJ().AYXKKw());
        if (c56929yXoAEQbTJ != null) {
            c56929yXo = c56929yXoAEQbTJ;
        }
        return OLrzqt(classLoader, c56929yXo.OLrzqt().KWHzl(), c56929yXo.copydefault().KWHzl(), i);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final java.lang.Class<?> OLrzqt(java.lang.ClassLoader classLoader, java.lang.String str, java.lang.String str2, int i) {
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return java.lang.Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str.length() > 0) {
            sb.append(str + '.');
        }
        sb.append(C59449zhJ.replace$default(str2, '.', '$', false, 4, (java.lang.Object) null));
        if (i > 0) {
            sb.append(";");
        }
        return C56728yQc.AEQbTJ(classLoader, sb.toString());
    }

    public static final java.lang.Class<?> AEQbTJ(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        return java.lang.reflect.Array.newInstance(cls, 0).getClass();
    }

    public static final KVisibility OLrzqt(@NotNull yNC ync) {
        Intrinsics.checkNotNullParameter(ync, "");
        if (Intrinsics.EZpvd(ync, C56669yNy.fetchVPNInfo)) {
            return KVisibility.PUBLIC;
        }
        if (Intrinsics.EZpvd(ync, C56669yNy.isConnected)) {
            return KVisibility.PROTECTED;
        }
        if (Intrinsics.EZpvd(ync, C56669yNy.KWHzl)) {
            return KVisibility.INTERNAL;
        }
        if (Intrinsics.EZpvd(ync, C56669yNy.AkhnZx) || Intrinsics.EZpvd(ync, C56669yNy.values)) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    public static final java.util.List<java.lang.annotation.Annotation> KWHzl(@NotNull yOB yob) {
        java.lang.annotation.Annotation annotationEZpvd;
        Intrinsics.checkNotNullParameter(yob, "");
        yOL yolCopydefault = yob.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (yOJ yoj : yolCopydefault) {
            InterfaceC56686yOo interfaceC56686yOoEZpvd = yoj.EZpvd();
            if (interfaceC56686yOoEZpvd instanceof yPY) {
                annotationEZpvd = ((yPY) interfaceC56686yOoEZpvd).KWHzl();
            } else if (interfaceC56686yOoEZpvd instanceof C56737yQl.StateListAnimator) {
                yQG yqgEZpvd = ((C56737yQl.StateListAnimator) interfaceC56686yOoEZpvd).EZpvd();
                C56741yQp c56741yQp = yqgEZpvd instanceof C56741yQp ? (C56741yQp) yqgEZpvd : null;
                annotationEZpvd = c56741yQp != null ? c56741yQp.OLrzqt() : null;
            } else {
                annotationEZpvd = EZpvd(yoj);
            }
            if (annotationEZpvd != null) {
                arrayList.add(annotationEZpvd);
            }
        }
        return OLrzqt((java.util.List<? extends java.lang.annotation.Annotation>) arrayList);
    }

    public static final java.lang.annotation.Annotation EZpvd(yOJ yoj) {
        InterfaceC56658yNn interfaceC56658yNnOLrzqt = yZE.OLrzqt(yoj);
        java.lang.Class<?> clsOLrzqt = interfaceC56658yNnOLrzqt != null ? OLrzqt(interfaceC56658yNnOLrzqt) : null;
        if (!(clsOLrzqt instanceof java.lang.Class)) {
            clsOLrzqt = null;
        }
        if (clsOLrzqt == null) {
            return null;
        }
        java.util.Set<Map.Entry<C56935yXu, AbstractC56975yZg<?>>> setEntrySet = yoj.OLrzqt().entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C56935yXu c56935yXu = (C56935yXu) entry.getKey();
            AbstractC56975yZg abstractC56975yZg = (AbstractC56975yZg) entry.getValue();
            java.lang.ClassLoader classLoader = clsOLrzqt.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader, "");
            java.lang.Object objCopydefault = copydefault(abstractC56975yZg, classLoader);
            kotlin.Pair pairOLrzqt = objCopydefault != null ? C56390yDp.OLrzqt(c56935yXu.AEQbTJ(), objCopydefault) : null;
            if (pairOLrzqt != null) {
                arrayList.add(pairOLrzqt);
            }
        }
        return (java.lang.annotation.Annotation) C56619yMb.createAnnotationInstance$default(clsOLrzqt, C56424yEw.copydefault(arrayList), null, 4, null);
    }

    public static final java.lang.Object copydefault(AbstractC56975yZg<?> abstractC56975yZg, java.lang.ClassLoader classLoader) {
        if (abstractC56975yZg instanceof C56970yZb) {
            return EZpvd(((C56970yZb) abstractC56975yZg).KWHzl());
        }
        if (abstractC56975yZg instanceof C56971yZc) {
            return EZpvd((C56971yZc) abstractC56975yZg, classLoader);
        }
        if (abstractC56975yZg instanceof C56981yZm) {
            kotlin.Pair<? extends C56929yXo, ? extends C56935yXu> pairKWHzl = ((C56981yZm) abstractC56975yZg).KWHzl();
            C56929yXo c56929yXoComponent1 = pairKWHzl.component1();
            C56935yXu c56935yXuComponent2 = pairKWHzl.component2();
            java.lang.Class clsLoadClass$default = loadClass$default(classLoader, c56929yXoComponent1, 0, 4, null);
            if (clsLoadClass$default != null) {
                return yLY.AEQbTJ(clsLoadClass$default, c56935yXuComponent2.AEQbTJ());
            }
        } else if (abstractC56975yZg instanceof C56984yZp) {
            C56984yZp.ActionBar actionBarKWHzl = ((C56984yZp) abstractC56975yZg).KWHzl();
            if (actionBarKWHzl instanceof C56984yZp.ActionBar.Activity) {
                C56984yZp.ActionBar.Activity activity = (C56984yZp.ActionBar.Activity) actionBarKWHzl;
                return copydefault(classLoader, activity.KWHzl(), activity.OLrzqt());
            }
            if (!(actionBarKWHzl instanceof C56984yZp.ActionBar.Application)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC56663yNs interfaceC56663yNsKWHzl = ((C56984yZp.ActionBar.Application) actionBarKWHzl).AEQbTJ().djBIcL().OLrzqt();
            InterfaceC56658yNn interfaceC56658yNn = interfaceC56663yNsKWHzl instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsKWHzl : null;
            if (interfaceC56658yNn != null) {
                return OLrzqt(interfaceC56658yNn);
            }
        } else if (!(abstractC56975yZg instanceof AbstractC56979yZk) && !(abstractC56975yZg instanceof C56992yZx)) {
            return abstractC56975yZg.KWHzl();
        }
        return null;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:89:0x01f3 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v17, resolved type: java.lang.Object */
    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r8v10, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r8v12, types: [byte[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v14, types: [int[]] */
    /* JADX WARN: Type inference failed for: r8v15, types: [float[]] */
    /* JADX WARN: Type inference failed for: r8v16, types: [long[]] */
    /* JADX WARN: Type inference failed for: r8v18, types: [double[]] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.String[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(C56971yZc c56971yZc, java.lang.ClassLoader classLoader) {
        AbstractC59233zdF abstractC59233zdFEZpvd;
        java.lang.Class clsLoadClass$default;
        short[] sArr;
        C56989yZu c56989yZu = c56971yZc instanceof C56989yZu ? (C56989yZu) c56971yZc : null;
        if (c56989yZu == null || (abstractC59233zdFEZpvd = c56989yZu.EZpvd()) == null) {
            return null;
        }
        java.util.List<? extends AbstractC56975yZg<?>> listKWHzl = c56971yZc.KWHzl();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            arrayList.add(copydefault((AbstractC56975yZg) it.next(), classLoader));
        }
        PrimitiveType primitiveTypeEZpvd = AbstractC56640yMw.EZpvd(abstractC59233zdFEZpvd);
        int i = 0;
        switch (primitiveTypeEZpvd == null ? -1 : Activity.OLrzqt[primitiveTypeEZpvd.ordinal()]) {
            case -1:
                if (!AbstractC56640yMw.OLrzqt(abstractC59233zdFEZpvd)) {
                    throw new java.lang.IllegalStateException(("Not an array type: " + abstractC59233zdFEZpvd).toString());
                }
                AbstractC59233zdF abstractC59233zdFOLrzqt = ((InterfaceC59317zek) CollectionsKt___CollectionsKt.gHZMYf(abstractC59233zdFEZpvd.bY_())).OLrzqt();
                Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
                InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdFOLrzqt.djBIcL().OLrzqt();
                InterfaceC56658yNn interfaceC56658yNn = interfaceC56663yNsKWHzl instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56663yNsKWHzl : null;
                if (interfaceC56658yNn == null) {
                    throw new java.lang.IllegalStateException(("Not a class type: " + abstractC59233zdFOLrzqt).toString());
                }
                if (AbstractC56640yMw.AkhnZx(abstractC59233zdFOLrzqt)) {
                    int size = c56971yZc.KWHzl().size();
                    sArr = new java.lang.String[size];
                    while (i < size) {
                        java.lang.Object obj = arrayList.get(i);
                        Intrinsics.copydefault(obj, "");
                        sArr[i] = obj;
                        i++;
                    }
                } else if (AbstractC56640yMw.KWHzl(interfaceC56658yNn)) {
                    int size2 = c56971yZc.KWHzl().size();
                    sArr = new java.lang.Class[size2];
                    while (i < size2) {
                        java.lang.Object obj2 = arrayList.get(i);
                        Intrinsics.copydefault(obj2, "");
                        sArr[i] = obj2;
                        i++;
                    }
                } else {
                    C56929yXo c56929yXoEZpvd = yZE.EZpvd((InterfaceC56663yNs) interfaceC56658yNn);
                    if (c56929yXoEZpvd == null || (clsLoadClass$default = loadClass$default(classLoader, c56929yXoEZpvd, 0, 4, null)) == null) {
                        return null;
                    }
                    java.lang.Object objNewInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) clsLoadClass$default, c56971yZc.KWHzl().size());
                    Intrinsics.copydefault(objNewInstance, "");
                    sArr = (java.lang.Object[]) objNewInstance;
                    int size3 = arrayList.size();
                    while (i < size3) {
                        sArr[i] = arrayList.get(i);
                        i++;
                    }
                }
                return sArr;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                int size4 = c56971yZc.KWHzl().size();
                sArr = new boolean[size4];
                while (i < size4) {
                    java.lang.Object obj3 = arrayList.get(i);
                    Intrinsics.copydefault(obj3, "");
                    sArr[i] = ((java.lang.Boolean) obj3).booleanValue();
                    i++;
                }
                return sArr;
            case 2:
                int size5 = c56971yZc.KWHzl().size();
                sArr = new char[size5];
                while (i < size5) {
                    java.lang.Object obj4 = arrayList.get(i);
                    Intrinsics.copydefault(obj4, "");
                    sArr[i] = ((java.lang.Character) obj4).charValue();
                    i++;
                }
                return sArr;
            case 3:
                int size6 = c56971yZc.KWHzl().size();
                sArr = new byte[size6];
                while (i < size6) {
                    java.lang.Object obj5 = arrayList.get(i);
                    Intrinsics.copydefault(obj5, "");
                    sArr[i] = ((java.lang.Byte) obj5).byteValue();
                    i++;
                }
                return sArr;
            case 4:
                int size7 = c56971yZc.KWHzl().size();
                sArr = new short[size7];
                while (i < size7) {
                    java.lang.Object obj6 = arrayList.get(i);
                    Intrinsics.copydefault(obj6, "");
                    sArr[i] = ((java.lang.Short) obj6).shortValue();
                    i++;
                }
                return sArr;
            case 5:
                int size8 = c56971yZc.KWHzl().size();
                sArr = new int[size8];
                while (i < size8) {
                    java.lang.Object obj7 = arrayList.get(i);
                    Intrinsics.copydefault(obj7, "");
                    sArr[i] = ((java.lang.Integer) obj7).intValue();
                    i++;
                }
                return sArr;
            case 6:
                int size9 = c56971yZc.KWHzl().size();
                sArr = new float[size9];
                while (i < size9) {
                    java.lang.Object obj8 = arrayList.get(i);
                    Intrinsics.copydefault(obj8, "");
                    sArr[i] = ((java.lang.Float) obj8).floatValue();
                    i++;
                }
                return sArr;
            case 7:
                int size10 = c56971yZc.KWHzl().size();
                sArr = new long[size10];
                while (i < size10) {
                    java.lang.Object obj9 = arrayList.get(i);
                    Intrinsics.copydefault(obj9, "");
                    sArr[i] = ((java.lang.Long) obj9).longValue();
                    i++;
                }
                return sArr;
            case 8:
                int size11 = c56971yZc.KWHzl().size();
                sArr = new double[size11];
                while (i < size11) {
                    java.lang.Object obj10 = arrayList.get(i);
                    Intrinsics.copydefault(obj10, "");
                    sArr[i] = ((java.lang.Double) obj10).doubleValue();
                    i++;
                }
                return sArr;
        }
    }

    public static final yKT EZpvd(java.lang.Object obj) {
        yKT ykt = obj instanceof yKT ? (yKT) obj : null;
        if (ykt != null) {
            return ykt;
        }
        FunctionReference functionReference = obj instanceof FunctionReference ? (FunctionReference) obj : null;
        InterfaceC56549yJm interfaceC56549yJmCompute = functionReference != null ? functionReference.compute() : null;
        if (interfaceC56549yJmCompute instanceof yKT) {
            return (yKT) interfaceC56549yJmCompute;
        }
        return null;
    }

    public static final AbstractC56615yLy<?> OLrzqt(java.lang.Object obj) {
        AbstractC56615yLy<?> abstractC56615yLy = obj instanceof AbstractC56615yLy ? (AbstractC56615yLy) obj : null;
        if (abstractC56615yLy != null) {
            return abstractC56615yLy;
        }
        PropertyReference propertyReference = obj instanceof PropertyReference ? (PropertyReference) obj : null;
        InterfaceC56549yJm interfaceC56549yJmCompute = propertyReference != null ? propertyReference.compute() : null;
        if (interfaceC56549yJmCompute instanceof AbstractC56615yLy) {
            return (AbstractC56615yLy) interfaceC56549yJmCompute;
        }
        return null;
    }

    public static final AbstractC56573yKj<?> AEQbTJ(java.lang.Object obj) {
        AbstractC56573yKj<?> abstractC56573yKj = obj instanceof AbstractC56573yKj ? (AbstractC56573yKj) obj : null;
        if (abstractC56573yKj != null) {
            return abstractC56573yKj;
        }
        yKT yktEZpvd = EZpvd(obj);
        return yktEZpvd != null ? yktEZpvd : OLrzqt(obj);
    }

    public static final InterfaceC56679yOh EZpvd(@NotNull InterfaceC56657yNm interfaceC56657yNm) {
        Intrinsics.checkNotNullParameter(interfaceC56657yNm, "");
        if (interfaceC56657yNm.AEQbTJ() == null) {
            return null;
        }
        InterfaceC56665yNu interfaceC56665yNuAYXKKw = interfaceC56657yNm.AuCTel();
        Intrinsics.copydefault(interfaceC56665yNuAYXKKw, "");
        return ((InterfaceC56658yNn) interfaceC56665yNuAYXKKw).DTwDnp();
    }

    public static final <M extends yXQ, D extends InterfaceC56657yNm> D EZpvd(@NotNull java.lang.Class<?> cls, @NotNull M m, @NotNull yWS yws, @NotNull yWW yww, @NotNull yWQ ywq, @NotNull Function2<? super C59149zbb, ? super M, ? extends D> function2) {
        java.util.List<ProtoBuf.TypeParameter> typeParameterList;
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(m, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(yww, "");
        Intrinsics.checkNotNullParameter(ywq, "");
        Intrinsics.checkNotNullParameter(function2, "");
        C56731yQf c56731yQfCopydefault = yLP.copydefault(cls);
        if (m instanceof ProtoBuf.Function) {
            typeParameterList = ((ProtoBuf.Function) m).getTypeParameterList();
        } else {
            if (!(m instanceof ProtoBuf.Property)) {
                throw new java.lang.IllegalStateException(("Unsupported message: " + m).toString());
            }
            typeParameterList = ((ProtoBuf.Property) m).getTypeParameterList();
        }
        java.util.List<ProtoBuf.TypeParameter> list = typeParameterList;
        C59083zaO c59083zaOOLrzqt = c56731yQfCopydefault.OLrzqt();
        yNP ynpEZpvd = c56731yQfCopydefault.EZpvd();
        yWX ywxKWHzl = yWX.EZpvd.KWHzl();
        Intrinsics.copydefault(list);
        return function2.invoke(new C59149zbb(new C59087zaS(c59083zaOOLrzqt, yws, ynpEZpvd, yww, ywxKWHzl, ywq, null, null, list)), m);
    }

    public static final boolean KWHzl(@NotNull InterfaceC56559yJw interfaceC56559yJw) {
        AbstractC59233zdF abstractC59233zdFAEQbTJ;
        Intrinsics.checkNotNullParameter(interfaceC56559yJw, "");
        yLJ ylj = interfaceC56559yJw instanceof yLJ ? (yLJ) interfaceC56559yJw : null;
        return (ylj == null || (abstractC59233zdFAEQbTJ = ylj.AEQbTJ()) == null || !yYK.OLrzqt(abstractC59233zdFAEQbTJ)) ? false : true;
    }

    public static final boolean EZpvd(@NotNull InterfaceC56559yJw interfaceC56559yJw) {
        AbstractC59233zdF abstractC59233zdFAEQbTJ;
        Intrinsics.checkNotNullParameter(interfaceC56559yJw, "");
        yLJ ylj = interfaceC56559yJw instanceof yLJ ? (yLJ) interfaceC56559yJw : null;
        return (ylj == null || (abstractC59233zdFAEQbTJ = ylj.AEQbTJ()) == null || !yYK.KWHzl(abstractC59233zdFAEQbTJ)) ? false : true;
    }

    public static final java.lang.Object AEQbTJ(@NotNull java.lang.reflect.Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        if (type instanceof java.lang.Class) {
            java.lang.Class cls = (java.lang.Class) type;
            if (cls.isPrimitive()) {
                if (Intrinsics.EZpvd(cls, java.lang.Boolean.TYPE)) {
                    return java.lang.Boolean.FALSE;
                }
                if (Intrinsics.EZpvd(cls, java.lang.Character.TYPE)) {
                    return (char) 0;
                }
                if (Intrinsics.EZpvd(cls, java.lang.Byte.TYPE)) {
                    return (byte) 0;
                }
                if (Intrinsics.EZpvd(cls, java.lang.Short.TYPE)) {
                    return (short) 0;
                }
                if (Intrinsics.EZpvd(cls, java.lang.Integer.TYPE)) {
                    return 0;
                }
                if (Intrinsics.EZpvd(cls, java.lang.Float.TYPE)) {
                    return java.lang.Float.valueOf(0.0f);
                }
                if (Intrinsics.EZpvd(cls, java.lang.Long.TYPE)) {
                    return 0L;
                }
                if (Intrinsics.EZpvd(cls, java.lang.Double.TYPE)) {
                    return java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
                }
                if (Intrinsics.EZpvd(cls, java.lang.Void.TYPE)) {
                    throw new java.lang.IllegalStateException("Parameter with void type is illegal");
                }
                throw new java.lang.UnsupportedOperationException("Unknown primitive: " + type);
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends java.lang.annotation.Annotation> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.util.List<java.lang.annotation.Annotation> OLrzqt(java.util.List<? extends java.lang.annotation.Annotation> list) throws java.lang.IllegalAccessException, InvocationTargetException {
        java.util.List listEZpvd;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return list;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Intrinsics.EZpvd((java.lang.Object) yHE.OLrzqt(yHE.OLrzqt((java.lang.annotation.Annotation) it.next())).getSimpleName(), (java.lang.Object) TextFieldImplKt.ContainerId)) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.annotation.Annotation annotation : list) {
                    java.lang.Class clsOLrzqt = yHE.OLrzqt(yHE.OLrzqt(annotation));
                    if (Intrinsics.EZpvd((java.lang.Object) clsOLrzqt.getSimpleName(), (java.lang.Object) TextFieldImplKt.ContainerId) && clsOLrzqt.getAnnotation(InterfaceC56528yIs.class) != null) {
                        java.lang.Object objInvoke = clsOLrzqt.getDeclaredMethod("value", new java.lang.Class[0]).invoke(annotation, new java.lang.Object[0]);
                        Intrinsics.copydefault(objInvoke, "");
                        listEZpvd = yDT.fIwbmz((java.lang.annotation.Annotation[]) objInvoke);
                    } else {
                        listEZpvd = C56402yEa.EZpvd(annotation);
                    }
                    C56406yEe.KWHzl(arrayList, listEZpvd);
                }
                return arrayList;
            }
        }
        return list;
    }
}
