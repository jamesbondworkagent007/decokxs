package o;

import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58107yuz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58061yuF {
    public final java.util.Map<java.lang.reflect.Method, AbstractC58107yuz> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Map<java.lang.reflect.Method, ? extends o.yuz> */
    /* JADX WARN: Multi-variable type inference failed */
    public C58061yuF(@NotNull java.util.Map<java.lang.reflect.Method, ? extends AbstractC58107yuz> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.OLrzqt = map;
    }

    public final java.lang.Object KWHzl(@NotNull java.lang.reflect.Method method, @NotNull java.lang.Object[] objArr) {
        Intrinsics.checkNotNullParameter(method, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        AbstractC58107yuz abstractC58107yuz = this.OLrzqt.get(method);
        if (abstractC58107yuz == null) {
            throw new java.lang.IllegalStateException("Service method not found".toString());
        }
        AbstractC58107yuz abstractC58107yuz2 = abstractC58107yuz;
        if (abstractC58107yuz2 instanceof AbstractC58107yuz.Application) {
            return ((AbstractC58107yuz.Application) abstractC58107yuz2).AEQbTJ(objArr[0]);
        }
        if (abstractC58107yuz2 instanceof AbstractC58107yuz.StateListAnimator) {
            return ((AbstractC58107yuz.StateListAnimator) abstractC58107yuz2).OLrzqt();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: o.yuF$StateListAnimator */
    public static final class StateListAnimator {
        public final AbstractC58107yuz.StateListAnimator.ActionBar EZpvd;
        public final AbstractC58057yuB OLrzqt;
        public final AbstractC58107yuz.Application.ActionBar copydefault;

        public StateListAnimator(@NotNull AbstractC58057yuB abstractC58057yuB, @NotNull AbstractC58107yuz.Application.ActionBar actionBar, @NotNull AbstractC58107yuz.StateListAnimator.ActionBar actionBar2) {
            Intrinsics.checkNotNullParameter(abstractC58057yuB, "");
            Intrinsics.checkNotNullParameter(actionBar, "");
            Intrinsics.checkNotNullParameter(actionBar2, "");
            this.OLrzqt = abstractC58057yuB;
            this.copydefault = actionBar;
            this.EZpvd = actionBar2;
        }

        public final C58061yuF AEQbTJ(@NotNull java.lang.Class<?> cls, @NotNull C58093yul c58093yul) {
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(c58093yul, "");
            return new C58061yuF(EZpvd(cls, c58093yul));
        }

        public final java.util.Map<java.lang.reflect.Method, AbstractC58107yuz> EZpvd(java.lang.Class<?> cls, C58093yul c58093yul) {
            java.lang.reflect.Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "");
            java.util.ArrayList<java.lang.reflect.Method> arrayList = new java.util.ArrayList();
            for (java.lang.reflect.Method method : declaredMethods) {
                AbstractC58057yuB abstractC58057yuB = this.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(method, "");
                if (!abstractC58057yuB.copydefault(method)) {
                    arrayList.add(method);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            for (java.lang.reflect.Method method2 : arrayList) {
                Intrinsics.checkNotNullExpressionValue(method2, "");
                arrayList2.add(EZpvd(method2, c58093yul));
            }
            return C56424yEw.copydefault(CollectionsKt___CollectionsKt.values(arrayList, arrayList2));
        }

        public final AbstractC58107yuz EZpvd(java.lang.reflect.Method method, C58093yul c58093yul) {
            java.lang.annotation.Annotation[] annotations = method.getAnnotations();
            Intrinsics.checkNotNullExpressionValue(annotations, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.annotation.Annotation annotation : annotations) {
                Intrinsics.checkNotNullExpressionValue(annotation, "");
                AbstractC58107yuz.ActionBar actionBarAEQbTJ = AEQbTJ(annotation);
                if (actionBarAEQbTJ != null) {
                    arrayList.add(actionBarAEQbTJ);
                }
            }
            if (arrayList.size() != 1) {
                throw new java.lang.IllegalArgumentException(("A method must have one and only one service method annotation: " + method).toString());
            }
            return ((AbstractC58107yuz.ActionBar) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList)).EZpvd(c58093yul, method);
        }

        public final AbstractC58107yuz.ActionBar AEQbTJ(java.lang.annotation.Annotation annotation) {
            if (annotation instanceof InterfaceC58150yvp) {
                return this.copydefault;
            }
            if (annotation instanceof InterfaceC58154yvt) {
                return this.EZpvd;
            }
            return null;
        }
    }
}
