package o;

import java.lang.reflect.Modifier;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.yOE;
import o.yPV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yQH extends yQG implements InterfaceC56746yQu, yQK, InterfaceC56836yUc {
    @Override // o.yTM
    public boolean EZpvd() {
        return false;
    }

    public abstract java.lang.reflect.Member copydefault();

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

    @Override // o.InterfaceC56834yUa
    public boolean sSMYrx() {
        return Modifier.isStatic(fetchVPNInfo());
    }

    @Override // o.InterfaceC56746yQu
    public java.lang.reflect.AnnotatedElement KWHzl() {
        java.lang.reflect.Member memberCopydefault = copydefault();
        Intrinsics.copydefault(memberCopydefault, "");
        return (java.lang.reflect.AnnotatedElement) memberCopydefault;
    }

    @Override // o.yQK
    public int fetchVPNInfo() {
        return copydefault().getModifiers();
    }

    @Override // o.InterfaceC56834yUa
    public boolean zsXlph() {
        return Modifier.isFinal(fetchVPNInfo());
    }

    @Override // o.InterfaceC56838yUe
    public C56935yXu fIwbmz() {
        C56935yXu c56935yXuAEQbTJ;
        java.lang.String name = copydefault().getName();
        return (name == null || (c56935yXuAEQbTJ = C56935yXu.AEQbTJ(name)) == null) ? C56938yXx.isConnected : c56935yXuAEQbTJ;
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

    /* JADX DEBUG: Method merged with bridge method: AkhnZx()Lo/yTT; */
    @Override // o.InterfaceC56836yUc
    /* JADX INFO: renamed from: isConnected, reason: merged with bridge method [inline-methods] */
    public C56750yQy AkhnZx() {
        java.lang.Class<?> declaringClass = copydefault().getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "");
        return new C56750yQy(declaringClass);
    }

    public final java.util.List<InterfaceC56844yUk> copydefault(@NotNull java.lang.reflect.Type[] typeArr, @NotNull java.lang.annotation.Annotation[][] annotationArr, boolean z) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(typeArr, "");
        Intrinsics.checkNotNullParameter(annotationArr, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(typeArr.length);
        java.util.List<java.lang.String> listAEQbTJ = C56735yQj.AEQbTJ.AEQbTJ(copydefault());
        int size = listAEQbTJ != null ? listAEQbTJ.size() - typeArr.length : 0;
        int length = typeArr.length;
        int i = 0;
        while (i < length) {
            yQN yqnEZpvd = yQN.AYXKKw.EZpvd(typeArr[i]);
            if (listAEQbTJ != null) {
                str = (java.lang.String) CollectionsKt___CollectionsKt.AkhnZx(listAEQbTJ, i + size);
                if (str == null) {
                    throw new java.lang.IllegalStateException(("No parameter with index " + i + '+' + size + " (name=" + fIwbmz() + " type=" + yqnEZpvd + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new yQO(yqnEZpvd, annotationArr[i], str, z && i == yDV.zLjUOn(typeArr)));
            i++;
        }
        return arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof yQH) && Intrinsics.EZpvd(copydefault(), ((yQH) obj).copydefault());
    }

    public int hashCode() {
        return copydefault().hashCode();
    }

    public java.lang.String toString() {
        return getClass().getName() + ": " + copydefault();
    }
}
