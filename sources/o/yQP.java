package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yQP extends yQG implements InterfaceC56746yQu, InterfaceC56843yUj {
    public final java.lang.reflect.TypeVariable<?> AEQbTJ;

    @Override // o.yTM
    public boolean EZpvd() {
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

    public yQP(@NotNull java.lang.reflect.TypeVariable<?> typeVariable) {
        Intrinsics.checkNotNullParameter(typeVariable, "");
        this.AEQbTJ = typeVariable;
    }

    @Override // o.InterfaceC56746yQu, o.yTM
    public java.util.List<C56741yQp> AEQbTJ() {
        java.lang.annotation.Annotation[] declaredAnnotations;
        java.util.List<C56741yQp> listEZpvd;
        java.lang.reflect.AnnotatedElement annotatedElementKWHzl = KWHzl();
        return (annotatedElementKWHzl == null || (declaredAnnotations = annotatedElementKWHzl.getDeclaredAnnotations()) == null || (listEZpvd = C56744yQs.EZpvd(declaredAnnotations)) == null) ? yDY.AhwBna() : listEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt()Ljava/util/Collection; */
    @Override // o.InterfaceC56843yUj
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.util.List<yQC> OLrzqt() {
        java.lang.reflect.Type[] bounds = this.AEQbTJ.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(bounds.length);
        for (java.lang.reflect.Type type : bounds) {
            arrayList.add(new yQC(type));
        }
        yQC yqc = (yQC) CollectionsKt___CollectionsKt.zuBGHE(arrayList);
        return Intrinsics.EZpvd(yqc != null ? yqc.OLrzqt() : null, java.lang.Object.class) ? yDY.AhwBna() : arrayList;
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

    @Override // o.InterfaceC56746yQu
    public java.lang.reflect.AnnotatedElement KWHzl() {
        java.lang.reflect.TypeVariable<?> typeVariable = this.AEQbTJ;
        if (typeVariable instanceof java.lang.reflect.AnnotatedElement) {
            return (java.lang.reflect.AnnotatedElement) typeVariable;
        }
        return null;
    }

    @Override // o.InterfaceC56838yUe
    public C56935yXu fIwbmz() {
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(this.AEQbTJ.getName());
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return c56935yXuAEQbTJ;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof yQP) && Intrinsics.EZpvd(this.AEQbTJ, ((yQP) obj).AEQbTJ);
    }

    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    public java.lang.String toString() {
        return yQP.class.getName() + ": " + this.AEQbTJ;
    }
}
