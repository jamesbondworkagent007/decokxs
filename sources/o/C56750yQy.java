package o;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$constructors$1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$constructors$2;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$fields$1;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$fields$2;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass$methods$2;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import o.yOE;
import o.yPV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56750yQy extends yQG implements InterfaceC56746yQu, yQK, yTT {
    public final java.lang.Class<?> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl()Ljava/lang/reflect/AnnotatedElement; */
    @Override // o.InterfaceC56746yQu
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public java.lang.Class<?> KWHzl() {
        return this.KWHzl;
    }

    @Override // o.yTT
    public LightClassOriginKind AkhnZx() {
        return null;
    }

    @Override // o.yTM
    public boolean EZpvd() {
        return false;
    }

    @Override // o.yTT
    public boolean getFieldNames() {
        return false;
    }

    @Override // o.yTM
    public /* bridge */ /* synthetic */ java.util.Collection AEQbTJ() {
        return AEQbTJ();
    }

    @Override // o.yTM
    public /* synthetic */ yTO copydefault(C56933yXs c56933yXs) {
        return KWHzl(c56933yXs);
    }

    @Override // o.InterfaceC56746yQu, o.yTM
    public java.util.List<C56741yQp> AEQbTJ() {
        java.lang.annotation.Annotation[] declaredAnnotations;
        java.util.List<C56741yQp> listEZpvd;
        java.lang.reflect.AnnotatedElement annotatedElementKWHzl = KWHzl();
        return (annotatedElementKWHzl == null || (declaredAnnotations = annotatedElementKWHzl.getDeclaredAnnotations()) == null || (listEZpvd = C56744yQs.EZpvd(declaredAnnotations)) == null) ? yDY.AhwBna() : listEZpvd;
    }

    @Override // o.InterfaceC56834yUa
    public boolean uzCIH() {
        return Modifier.isAbstract(fetchVPNInfo());
    }

    @Override // o.InterfaceC56746yQu
    public C56741yQp KWHzl(C56933yXs c56933yXs) {
        java.lang.annotation.Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        java.lang.reflect.AnnotatedElement annotatedElementKWHzl = KWHzl();
        if (annotatedElementKWHzl == null || (declaredAnnotations = annotatedElementKWHzl.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C56744yQs.KWHzl(declaredAnnotations, c56933yXs);
    }

    public C56750yQy(@NotNull java.lang.Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "");
        this.KWHzl = cls;
    }

    @Override // o.InterfaceC56834yUa
    public boolean sSMYrx() {
        return Modifier.isStatic(fetchVPNInfo());
    }

    @Override // o.yQK
    public int fetchVPNInfo() {
        return this.KWHzl.getModifiers();
    }

    @Override // o.InterfaceC56834yUa
    public boolean zsXlph() {
        return Modifier.isFinal(fetchVPNInfo());
    }

    @Override // o.InterfaceC56834yUa
    public yOD iwGUEr() {
        int iFetchVPNInfo = fetchVPNInfo();
        if (Modifier.isPublic(iFetchVPNInfo)) {
            return yOE.Fragment.OLrzqt;
        }
        if (Modifier.isPrivate(iFetchVPNInfo)) {
            return yOE.StateListAnimator.OLrzqt;
        }
        if (Modifier.isProtected(iFetchVPNInfo)) {
            return Modifier.isStatic(iFetchVPNInfo) ? yPV.Activity.AEQbTJ : yPV.TaskDescription.KWHzl;
        }
        return yPV.Application.OLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: djBIcL()Ljava/util/Collection; */
    @Override // o.yTT
    /* JADX INFO: renamed from: DbNXlk, reason: merged with bridge method [inline-methods] */
    public java.util.List<C56935yXu> djBIcL() {
        java.lang.Class<?>[] declaredClasses = this.KWHzl.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "");
        return C59467zhb.zuBGHE(C59467zhb.fJNWhG(C59467zhb.values(yDV.getNewProxyInstance(declaredClasses), yQB.OLrzqt), yQA.EZpvd));
    }

    public static final boolean OLrzqt(java.lang.Class cls) {
        java.lang.String simpleName = cls.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        return simpleName.length() == 0;
    }

    public static final C56935yXu AEQbTJ(java.lang.Class cls) {
        java.lang.String simpleName = cls.getSimpleName();
        if (!C56935yXu.EZpvd(simpleName)) {
            simpleName = null;
        }
        if (simpleName != null) {
            return C56935yXu.AEQbTJ(simpleName);
        }
        return null;
    }

    @Override // o.yTT
    public C56933yXs valueOf() {
        return C56743yQr.AEQbTJ(this.KWHzl).AEQbTJ();
    }

    /* JADX DEBUG: Method merged with bridge method: AuCTel()Lo/yTT; */
    @Override // o.yTT
    /* JADX INFO: renamed from: fJNWhG, reason: merged with bridge method [inline-methods] */
    public C56750yQy AuCTel() {
        java.lang.Class<?> declaringClass = this.KWHzl.getDeclaringClass();
        if (declaringClass != null) {
            return new C56750yQy(declaringClass);
        }
        return null;
    }

    @Override // o.yTT
    public java.util.Collection<yTU> hDKMBd() {
        if (Intrinsics.EZpvd(this.KWHzl, java.lang.Object.class)) {
            return yDY.AhwBna();
        }
        C56533yIx c56533yIx = new C56533yIx(2);
        java.lang.reflect.Type genericSuperclass = this.KWHzl.getGenericSuperclass();
        c56533yIx.copydefault(genericSuperclass != null ? genericSuperclass : java.lang.Object.class);
        c56533yIx.EZpvd(this.KWHzl.getGenericInterfaces());
        java.util.List listGEmmrt = yDY.gEmmrt(c56533yIx.copydefault((java.lang.Object[]) new java.lang.reflect.Type[c56533yIx.KWHzl()]));
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        java.util.Iterator it = listGEmmrt.iterator();
        while (it.hasNext()) {
            arrayList.add(new yQC((java.lang.reflect.Type) it.next()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Method merged with bridge method: values()Ljava/util/Collection; */
    @Override // o.yTT
    /* JADX INFO: renamed from: isConnected, reason: merged with bridge method [inline-methods] */
    public java.util.List<yQI> values() {
        java.lang.reflect.Method[] declaredMethods = this.KWHzl.getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "");
        return C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(yDV.getNewProxyInstance(declaredMethods), new C56749yQx(this)), ReflectJavaClass$methods$2.INSTANCE));
    }

    public static final boolean AEQbTJ(C56750yQy c56750yQy, java.lang.reflect.Method method) {
        if (!method.isSynthetic()) {
            if (c56750yQy.zLjUOn()) {
                Intrinsics.copydefault(method);
                if (!c56750yQy.AEQbTJ(method)) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean AEQbTJ(java.lang.reflect.Method method) {
        java.lang.String name = method.getName();
        if (Intrinsics.EZpvd((java.lang.Object) name, (java.lang.Object) "values")) {
            java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
            if (parameterTypes.length == 0) {
                return true;
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) name, (java.lang.Object) "valueOf")) {
            return java.util.Arrays.equals(method.getParameterTypes(), new java.lang.Class[]{java.lang.String.class});
        }
        return false;
    }

    /* JADX DEBUG: Method merged with bridge method: AhwBna()Ljava/util/Collection; */
    @Override // o.yTT
    /* JADX INFO: renamed from: gEmmrt, reason: merged with bridge method [inline-methods] */
    public java.util.List<yQE> AhwBna() {
        java.lang.reflect.Field[] declaredFields = this.KWHzl.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "");
        return C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C59467zhb.values(yDV.getNewProxyInstance(declaredFields), ReflectJavaClass$fields$1.INSTANCE), ReflectJavaClass$fields$2.INSTANCE));
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/util/Collection; */
    @Override // o.yTT
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.List<yQD> OLrzqt() {
        java.lang.reflect.Constructor<?>[] declaredConstructors = this.KWHzl.getDeclaredConstructors();
        Intrinsics.checkNotNullExpressionValue(declaredConstructors, "");
        return C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C59467zhb.values(yDV.getNewProxyInstance(declaredConstructors), ReflectJavaClass$constructors$1.INSTANCE), ReflectJavaClass$constructors$2.INSTANCE));
    }

    @Override // o.InterfaceC56838yUe
    public C56935yXu fIwbmz() {
        if (this.KWHzl.isAnonymousClass()) {
            java.lang.String name = this.KWHzl.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(StringsKt__StringsKt.substringAfterLast$default(name, JwtUtilsKt.JWT_DELIMITER, (java.lang.String) null, 2, (java.lang.Object) null));
            Intrinsics.copydefault(c56935yXuAEQbTJ);
            return c56935yXuAEQbTJ;
        }
        C56935yXu c56935yXuAEQbTJ2 = C56935yXu.AEQbTJ(this.KWHzl.getSimpleName());
        Intrinsics.copydefault(c56935yXuAEQbTJ2);
        return c56935yXuAEQbTJ2;
    }

    @Override // o.InterfaceC56847yUn
    public java.util.List<yQP> getNewProxyInstance() {
        java.lang.reflect.TypeVariable<java.lang.Class<?>>[] typeParameters = this.KWHzl.getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeParameters.length);
        for (java.lang.reflect.TypeVariable<java.lang.Class<?>> typeVariable : typeParameters) {
            arrayList.add(new yQP(typeVariable));
        }
        return arrayList;
    }

    @Override // o.yTT
    public boolean AubY() {
        return this.KWHzl.isInterface();
    }

    @Override // o.yTT
    public boolean AuCTelauCTel() {
        return this.KWHzl.isAnnotation();
    }

    @Override // o.yTT
    public boolean zLjUOn() {
        return this.KWHzl.isEnum();
    }

    @Override // o.yTT
    public boolean wlaJM() throws java.lang.IllegalAccessException, InvocationTargetException {
        java.lang.Boolean boolKWHzl = C56736yQk.EZpvd.KWHzl(this.KWHzl);
        if (boolKWHzl != null) {
            return boolKWHzl.booleanValue();
        }
        return false;
    }

    @Override // o.yTT
    public java.util.Collection<InterfaceC56841yUh> fARcdN() {
        java.lang.Object[] objArrEZpvd = C56736yQk.EZpvd.EZpvd(this.KWHzl);
        if (objArrEZpvd == null) {
            objArrEZpvd = new java.lang.Object[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(objArrEZpvd.length);
        for (java.lang.Object obj : objArrEZpvd) {
            arrayList.add(new yQQ(obj));
        }
        return arrayList;
    }

    @Override // o.yTT
    public boolean gHZMYf() throws java.lang.IllegalAccessException, InvocationTargetException {
        java.lang.Boolean boolAEQbTJ = C56736yQk.EZpvd.AEQbTJ(this.KWHzl);
        if (boolAEQbTJ != null) {
            return boolAEQbTJ.booleanValue();
        }
        return false;
    }

    @Override // o.yTT
    public Sequence<yTU> ejfBZ() throws java.lang.IllegalAccessException, InvocationTargetException {
        java.lang.Class<?>[] clsArrOLrzqt = C56736yQk.EZpvd.OLrzqt(this.KWHzl);
        if (clsArrOLrzqt != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(clsArrOLrzqt.length);
            for (java.lang.Class<?> cls : clsArrOLrzqt) {
                arrayList.add(new yQC(cls));
            }
            Sequence<yTU> sequenceQVAiDq = CollectionsKt___CollectionsKt.QVAiDq(arrayList);
            if (sequenceQVAiDq != null) {
                return sequenceQVAiDq;
            }
        }
        return C59405zgS.OLrzqt();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof C56750yQy) && Intrinsics.EZpvd(this.KWHzl, ((C56750yQy) obj).KWHzl);
    }

    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    public java.lang.String toString() {
        return C56750yQy.class.getName() + ": " + this.KWHzl;
    }
}
