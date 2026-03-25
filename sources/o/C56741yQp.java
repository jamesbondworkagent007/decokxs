package o;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC56740yQo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56741yQp extends yQG implements yTO {
    public final java.lang.annotation.Annotation KWHzl;

    @Override // o.yTO
    public boolean EZpvd() {
        return false;
    }

    @Override // o.yTO
    public boolean KWHzl() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.annotation.Annotation OLrzqt() {
        return this.KWHzl;
    }

    public C56741yQp(@NotNull java.lang.annotation.Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "");
        this.KWHzl = annotation;
    }

    @Override // o.yTO
    public java.util.Collection<yTN> copydefault() throws java.lang.IllegalAccessException, InvocationTargetException {
        java.lang.reflect.Method[] declaredMethods = yHE.OLrzqt(yHE.OLrzqt(this.KWHzl)).getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(declaredMethods.length);
        for (java.lang.reflect.Method method : declaredMethods) {
            AbstractC56740yQo.TaskDescription taskDescription = AbstractC56740yQo.OLrzqt;
            java.lang.Object objInvoke = method.invoke(this.KWHzl, new java.lang.Object[0]);
            Intrinsics.checkNotNullExpressionValue(objInvoke, "");
            arrayList.add(taskDescription.copydefault(objInvoke, C56935yXu.AEQbTJ(method.getName())));
        }
        return arrayList;
    }

    @Override // o.yTO
    public C56929yXo AEQbTJ() {
        return C56743yQr.AEQbTJ((java.lang.Class<?>) yHE.OLrzqt(yHE.OLrzqt(this.KWHzl)));
    }

    /* JADX DEBUG: Method merged with bridge method: AYXKKw()Lo/yTT; */
    @Override // o.yTO
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] */
    public C56750yQy AYXKKw() {
        return new C56750yQy(yHE.OLrzqt(yHE.OLrzqt(this.KWHzl)));
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof C56741yQp) && this.KWHzl == ((C56741yQp) obj).KWHzl;
    }

    public int hashCode() {
        return java.lang.System.identityHashCode(this.KWHzl);
    }

    public java.lang.String toString() {
        return C56741yQp.class.getName() + ": " + this.KWHzl;
    }
}
