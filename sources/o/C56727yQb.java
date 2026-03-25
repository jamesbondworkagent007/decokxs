package o;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import o.InterfaceC56893yWf;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56727yQb {
    public static final C56727yQb copydefault = new C56727yQb();

    private C56727yQb() {
    }

    public final void EZpvd(@NotNull java.lang.Class<?> cls, @NotNull InterfaceC56893yWf.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(taskDescription, "");
        java.util.Iterator itEZpvd = yHX.EZpvd(cls.getDeclaredAnnotations());
        while (itEZpvd.hasNext()) {
            java.lang.annotation.Annotation annotation = (java.lang.annotation.Annotation) itEZpvd.next();
            Intrinsics.copydefault(annotation);
            KWHzl(taskDescription, annotation);
        }
        taskDescription.EZpvd();
    }

    public final void copydefault(@NotNull java.lang.Class<?> cls, @NotNull InterfaceC56893yWf.StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(cls, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        AEQbTJ(cls, stateListAnimator);
        EZpvd(cls, stateListAnimator);
        OLrzqt(cls, stateListAnimator);
    }

    public final void AEQbTJ(java.lang.Class<?> cls, InterfaceC56893yWf.StateListAnimator stateListAnimator) throws InvocationTargetException {
        java.util.Iterator itEZpvd = yHX.EZpvd(cls.getDeclaredMethods());
        while (itEZpvd.hasNext()) {
            java.lang.reflect.Method method = (java.lang.reflect.Method) itEZpvd.next();
            C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(method.getName());
            Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
            C56738yQm c56738yQm = C56738yQm.OLrzqt;
            Intrinsics.copydefault(method);
            InterfaceC56893yWf.ActionBar actionBarOLrzqt = stateListAnimator.OLrzqt(c56935yXuAEQbTJ, c56738yQm.copydefault(method));
            if (actionBarOLrzqt != null) {
                java.util.Iterator itEZpvd2 = yHX.EZpvd(method.getDeclaredAnnotations());
                while (itEZpvd2.hasNext()) {
                    java.lang.annotation.Annotation annotation = (java.lang.annotation.Annotation) itEZpvd2.next();
                    Intrinsics.copydefault(annotation);
                    KWHzl(actionBarOLrzqt, annotation);
                }
                java.lang.annotation.Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "");
                java.lang.annotation.Annotation[][] annotationArr = parameterAnnotations;
                int length = annotationArr.length;
                for (int i = 0; i < length; i++) {
                    java.util.Iterator itEZpvd3 = yHX.EZpvd(annotationArr[i]);
                    while (itEZpvd3.hasNext()) {
                        java.lang.annotation.Annotation annotation2 = (java.lang.annotation.Annotation) itEZpvd3.next();
                        java.lang.Class<?> clsOLrzqt = yHE.OLrzqt(yHE.OLrzqt(annotation2));
                        C56929yXo c56929yXoAEQbTJ = C56743yQr.AEQbTJ(clsOLrzqt);
                        Intrinsics.copydefault(annotation2);
                        InterfaceC56893yWf.Application applicationOLrzqt = actionBarOLrzqt.OLrzqt(i, c56929yXoAEQbTJ, new yPY(annotation2));
                        if (applicationOLrzqt != null) {
                            copydefault.KWHzl(applicationOLrzqt, annotation2, clsOLrzqt);
                        }
                    }
                }
                actionBarOLrzqt.EZpvd();
            }
        }
    }

    public final void EZpvd(java.lang.Class<?> cls, InterfaceC56893yWf.StateListAnimator stateListAnimator) throws InvocationTargetException {
        java.util.Iterator itEZpvd = yHX.EZpvd(cls.getDeclaredConstructors());
        while (itEZpvd.hasNext()) {
            java.lang.reflect.Constructor<?> constructor = (java.lang.reflect.Constructor) itEZpvd.next();
            C56935yXu c56935yXu = C56938yXx.valueOf;
            C56738yQm c56738yQm = C56738yQm.OLrzqt;
            Intrinsics.copydefault(constructor);
            InterfaceC56893yWf.ActionBar actionBarOLrzqt = stateListAnimator.OLrzqt(c56935yXu, c56738yQm.AEQbTJ(constructor));
            if (actionBarOLrzqt != null) {
                java.util.Iterator itEZpvd2 = yHX.EZpvd(constructor.getDeclaredAnnotations());
                while (itEZpvd2.hasNext()) {
                    java.lang.annotation.Annotation annotation = (java.lang.annotation.Annotation) itEZpvd2.next();
                    Intrinsics.copydefault(annotation);
                    KWHzl(actionBarOLrzqt, annotation);
                }
                java.lang.annotation.Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                Intrinsics.copydefault(parameterAnnotations);
                if (!(parameterAnnotations.length == 0)) {
                    int length = constructor.getParameterTypes().length;
                    int length2 = parameterAnnotations.length;
                    int length3 = parameterAnnotations.length;
                    for (int i = 0; i < length3; i++) {
                        java.util.Iterator itEZpvd3 = yHX.EZpvd(parameterAnnotations[i]);
                        while (itEZpvd3.hasNext()) {
                            java.lang.annotation.Annotation annotation2 = (java.lang.annotation.Annotation) itEZpvd3.next();
                            java.lang.Class<?> clsOLrzqt = yHE.OLrzqt(yHE.OLrzqt(annotation2));
                            C56929yXo c56929yXoAEQbTJ = C56743yQr.AEQbTJ(clsOLrzqt);
                            Intrinsics.copydefault(annotation2);
                            InterfaceC56893yWf.Application applicationOLrzqt = actionBarOLrzqt.OLrzqt((length - length2) + i, c56929yXoAEQbTJ, new yPY(annotation2));
                            if (applicationOLrzqt != null) {
                                copydefault.KWHzl(applicationOLrzqt, annotation2, clsOLrzqt);
                            }
                        }
                    }
                }
                actionBarOLrzqt.EZpvd();
            }
        }
    }

    public final void OLrzqt(java.lang.Class<?> cls, InterfaceC56893yWf.StateListAnimator stateListAnimator) throws InvocationTargetException {
        java.util.Iterator itEZpvd = yHX.EZpvd(cls.getDeclaredFields());
        while (itEZpvd.hasNext()) {
            java.lang.reflect.Field field = (java.lang.reflect.Field) itEZpvd.next();
            C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(field.getName());
            Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
            C56738yQm c56738yQm = C56738yQm.OLrzqt;
            Intrinsics.copydefault(field);
            InterfaceC56893yWf.TaskDescription taskDescriptionEZpvd = stateListAnimator.EZpvd(c56935yXuAEQbTJ, c56738yQm.copydefault(field), null);
            if (taskDescriptionEZpvd != null) {
                java.util.Iterator itEZpvd2 = yHX.EZpvd(field.getDeclaredAnnotations());
                while (itEZpvd2.hasNext()) {
                    java.lang.annotation.Annotation annotation = (java.lang.annotation.Annotation) itEZpvd2.next();
                    Intrinsics.copydefault(annotation);
                    KWHzl(taskDescriptionEZpvd, annotation);
                }
                taskDescriptionEZpvd.EZpvd();
            }
        }
    }

    public final void KWHzl(InterfaceC56893yWf.TaskDescription taskDescription, java.lang.annotation.Annotation annotation) throws InvocationTargetException {
        java.lang.Class<?> clsOLrzqt = yHE.OLrzqt(yHE.OLrzqt(annotation));
        InterfaceC56893yWf.Application applicationCopydefault = taskDescription.copydefault(C56743yQr.AEQbTJ(clsOLrzqt), new yPY(annotation));
        if (applicationCopydefault != null) {
            copydefault.KWHzl(applicationCopydefault, annotation, clsOLrzqt);
        }
    }

    public final void KWHzl(InterfaceC56893yWf.Application application, java.lang.annotation.Annotation annotation, java.lang.Class<?> cls) throws InvocationTargetException {
        java.util.Iterator itEZpvd = yHX.EZpvd(cls.getDeclaredMethods());
        while (itEZpvd.hasNext()) {
            java.lang.reflect.Method method = (java.lang.reflect.Method) itEZpvd.next();
            try {
                java.lang.Object objInvoke = method.invoke(annotation, new java.lang.Object[0]);
                Intrinsics.copydefault(objInvoke);
                C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(method.getName());
                Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
                OLrzqt(application, c56935yXuAEQbTJ, objInvoke);
            } catch (java.lang.IllegalAccessException unused) {
            }
        }
        application.copydefault();
    }

    public final C56977yZi copydefault(java.lang.Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            if (Intrinsics.EZpvd(cls, java.lang.Void.TYPE)) {
                return new C56977yZi(C56929yXo.AEQbTJ.KWHzl(yMB.Application.DLWbHP.djBIcL()), i);
            }
            PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "");
            if (i > 0) {
                return new C56977yZi(C56929yXo.AEQbTJ.KWHzl(primitiveType.getArrayTypeFqName()), i - 1);
            }
            return new C56977yZi(C56929yXo.AEQbTJ.KWHzl(primitiveType.getTypeFqName()), i);
        }
        C56929yXo c56929yXoAEQbTJ = C56743yQr.AEQbTJ(cls);
        C56929yXo c56929yXoKWHzl = yML.OLrzqt.KWHzl(c56929yXoAEQbTJ.AEQbTJ());
        if (c56929yXoKWHzl != null) {
            c56929yXoAEQbTJ = c56929yXoKWHzl;
        }
        return new C56977yZi(c56929yXoAEQbTJ, i);
    }

    public final void OLrzqt(InterfaceC56893yWf.Application application, C56935yXu c56935yXu, java.lang.Object obj) throws InvocationTargetException {
        java.lang.Class<?> enclosingClass = obj.getClass();
        if (Intrinsics.EZpvd(enclosingClass, java.lang.Class.class)) {
            Intrinsics.copydefault(obj, "");
            application.AEQbTJ(c56935yXu, copydefault((java.lang.Class) obj));
            return;
        }
        if (C56730yQe.EZpvd.contains(enclosingClass)) {
            application.AEQbTJ(c56935yXu, obj);
            return;
        }
        if (C56743yQr.AhwBna(enclosingClass)) {
            if (!enclosingClass.isEnum()) {
                enclosingClass = enclosingClass.getEnclosingClass();
            }
            Intrinsics.copydefault(enclosingClass);
            C56929yXo c56929yXoAEQbTJ = C56743yQr.AEQbTJ(enclosingClass);
            Intrinsics.copydefault(obj, "");
            C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(((java.lang.Enum) obj).name());
            Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
            application.OLrzqt(c56935yXu, c56929yXoAEQbTJ, c56935yXuAEQbTJ);
            return;
        }
        if (java.lang.annotation.Annotation.class.isAssignableFrom(enclosingClass)) {
            java.lang.Class<?>[] interfaces = enclosingClass.getInterfaces();
            Intrinsics.checkNotNullExpressionValue(interfaces, "");
            java.lang.Class<?> cls = (java.lang.Class) yDV.sSMYrx(interfaces);
            Intrinsics.copydefault(cls);
            InterfaceC56893yWf.Application applicationKWHzl = application.KWHzl(c56935yXu, C56743yQr.AEQbTJ(cls));
            if (applicationKWHzl == null) {
                return;
            }
            Intrinsics.copydefault(obj, "");
            KWHzl(applicationKWHzl, (java.lang.annotation.Annotation) obj, cls);
            return;
        }
        if (enclosingClass.isArray()) {
            InterfaceC56893yWf.Activity activityEZpvd = application.EZpvd(c56935yXu);
            if (activityEZpvd == null) {
                return;
            }
            java.lang.Class<?> componentType = enclosingClass.getComponentType();
            int i = 0;
            if (componentType.isEnum()) {
                Intrinsics.copydefault(componentType);
                C56929yXo c56929yXoAEQbTJ2 = C56743yQr.AEQbTJ(componentType);
                Intrinsics.copydefault(obj, "");
                java.lang.Object[] objArr = (java.lang.Object[]) obj;
                int length = objArr.length;
                while (i < length) {
                    java.lang.Object obj2 = objArr[i];
                    Intrinsics.copydefault(obj2, "");
                    C56935yXu c56935yXuAEQbTJ2 = C56935yXu.AEQbTJ(((java.lang.Enum) obj2).name());
                    Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ2, "");
                    activityEZpvd.AEQbTJ(c56929yXoAEQbTJ2, c56935yXuAEQbTJ2);
                    i++;
                }
            } else if (Intrinsics.EZpvd(componentType, java.lang.Class.class)) {
                Intrinsics.copydefault(obj, "");
                java.lang.Object[] objArr2 = (java.lang.Object[]) obj;
                int length2 = objArr2.length;
                while (i < length2) {
                    java.lang.Object obj3 = objArr2[i];
                    Intrinsics.copydefault(obj3, "");
                    activityEZpvd.OLrzqt(copydefault((java.lang.Class) obj3));
                    i++;
                }
            } else if (java.lang.annotation.Annotation.class.isAssignableFrom(componentType)) {
                Intrinsics.copydefault(obj, "");
                java.lang.Object[] objArr3 = (java.lang.Object[]) obj;
                int length3 = objArr3.length;
                while (i < length3) {
                    java.lang.Object obj4 = objArr3[i];
                    Intrinsics.copydefault(componentType);
                    InterfaceC56893yWf.Application applicationKWHzl2 = activityEZpvd.KWHzl(C56743yQr.AEQbTJ(componentType));
                    if (applicationKWHzl2 != null) {
                        Intrinsics.copydefault(obj4, "");
                        KWHzl(applicationKWHzl2, (java.lang.annotation.Annotation) obj4, componentType);
                    }
                    i++;
                }
            } else {
                Intrinsics.copydefault(obj, "");
                java.lang.Object[] objArr4 = (java.lang.Object[]) obj;
                int length4 = objArr4.length;
                while (i < length4) {
                    activityEZpvd.OLrzqt(objArr4[i]);
                    i++;
                }
            }
            activityEZpvd.KWHzl();
            return;
        }
        throw new java.lang.UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + obj);
    }
}
