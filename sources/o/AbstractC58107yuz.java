package o;

import com.tinder.scarlet.internal.servicemethod.ServiceMethod$Receive$execute$stream$2;
import java.lang.reflect.ParameterizedType;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58096yuo;
import o.AbstractC58107yuz;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58107yuz {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX INFO: renamed from: o.yuz$ActionBar */
    public interface ActionBar {
        AbstractC58107yuz EZpvd(@NotNull C58093yul c58093yul, @NotNull java.lang.reflect.Method method);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yuz.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC58107yuz(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC58107yuz() {
    }

    /* JADX INFO: renamed from: o.yuz$Application */
    public static final class Application extends AbstractC58107yuz {
        public final C58093yul AEQbTJ;
        public final InterfaceC58026ytX<java.lang.Object> EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C58093yul c58093yul, @NotNull InterfaceC58026ytX<java.lang.Object> interfaceC58026ytX) {
            super(null);
            Intrinsics.checkNotNullParameter(c58093yul, "");
            Intrinsics.checkNotNullParameter(interfaceC58026ytX, "");
            this.AEQbTJ = c58093yul;
            this.EZpvd = interfaceC58026ytX;
        }

        public final java.lang.Object AEQbTJ(@NotNull java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return java.lang.Boolean.valueOf(this.AEQbTJ.OLrzqt(this.EZpvd.EZpvd(obj)));
        }

        /* JADX INFO: renamed from: o.yuz$Application$ActionBar */
        public static final class ActionBar implements ActionBar {
            public final C58056yuA AEQbTJ;

            public ActionBar(@NotNull C58056yuA c58056yuA) {
                Intrinsics.checkNotNullParameter(c58056yuA, "");
                this.AEQbTJ = c58056yuA;
            }

            /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/yul;Ljava/lang/reflect/Method;)Lo/yuz; */
            @Override // o.AbstractC58107yuz.ActionBar
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public Application EZpvd(@NotNull C58093yul c58093yul, @NotNull java.lang.reflect.Method method) {
                Intrinsics.checkNotNullParameter(c58093yul, "");
                Intrinsics.checkNotNullParameter(method, "");
                TaskDescription taskDescription = AbstractC58107yuz.Companion;
                java.lang.Class[] clsArr = {java.lang.Object.class};
                if (method.getGenericParameterTypes().length != 1) {
                    throw new java.lang.IllegalArgumentException(("Send method must have one and only one parameter: " + method).toString());
                }
                java.lang.reflect.Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
                java.util.List<kotlin.Pair> listAEQbTJ = yDV.AEQbTJ(genericParameterTypes, clsArr);
                if (!(listAEQbTJ instanceof java.util.Collection) || !listAEQbTJ.isEmpty()) {
                    for (kotlin.Pair pair : listAEQbTJ) {
                        java.lang.reflect.Type type = (java.lang.reflect.Type) pair.component1();
                        java.lang.Class cls = (java.lang.Class) pair.component2();
                        if (cls != type && !cls.isInstance(type)) {
                            throw new java.lang.IllegalArgumentException(("Send method must have one and only one parameter: " + method).toString());
                        }
                    }
                }
                TaskDescription taskDescription2 = AbstractC58107yuz.Companion;
                java.lang.Class cls2 = java.lang.Boolean.TYPE;
                java.lang.Class cls3 = java.lang.Void.TYPE;
                Intrinsics.checkNotNullExpressionValue(cls3, "");
                java.lang.Class[] clsArr2 = {cls2, cls3};
                for (int i = 0; i < 2; i++) {
                    java.lang.Class cls4 = clsArr2[i];
                    if (cls4 == method.getGenericReturnType() || cls4.isInstance(method.getGenericReturnType())) {
                        TaskDescription taskDescription3 = AbstractC58107yuz.Companion;
                        return new Application(c58093yul, this.AEQbTJ.AEQbTJ(taskDescription3.KWHzl(method), taskDescription3.copydefault(method)));
                    }
                }
                throw new java.lang.IllegalArgumentException(("Send method must return Boolean or Void: " + method).toString());
            }
        }
    }

    /* JADX INFO: renamed from: o.yuz$StateListAnimator */
    public static final class StateListAnimator extends AbstractC58107yuz {
        public final InterfaceC58091yuj<java.lang.Object, java.lang.Object> AEQbTJ;
        public final C58093yul EZpvd;
        public final AbstractC58096yuo<?> OLrzqt;
        public final AbstractC58253yxm copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull AbstractC58096yuo<?> abstractC58096yuo, @NotNull C58093yul c58093yul, @NotNull AbstractC58253yxm abstractC58253yxm, @NotNull InterfaceC58091yuj<java.lang.Object, ? extends java.lang.Object> interfaceC58091yuj) {
            super(null);
            Intrinsics.checkNotNullParameter(abstractC58096yuo, "");
            Intrinsics.checkNotNullParameter(c58093yul, "");
            Intrinsics.checkNotNullParameter(abstractC58253yxm, "");
            Intrinsics.checkNotNullParameter(interfaceC58091yuj, "");
            this.OLrzqt = abstractC58096yuo;
            this.EZpvd = c58093yul;
            this.copydefault = abstractC58253yxm;
            this.AEQbTJ = interfaceC58091yuj;
        }

        public static final InterfaceC60096zvd copydefault(StateListAnimator stateListAnimator) {
            Intrinsics.checkNotNullParameter(stateListAnimator, "");
            return stateListAnimator.EZpvd.KWHzl();
        }

        public final java.lang.Object OLrzqt() {
            AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.EZpvd(new Callable() { // from class: o.yux
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return AbstractC58107yuz.StateListAnimator.copydefault(this.KWHzl);
                }
            }).KWHzl(this.copydefault);
            final ServiceMethod$Receive$execute$stream$2 serviceMethod$Receive$execute$stream$2 = new ServiceMethod$Receive$execute$stream$2(this.OLrzqt);
            AbstractC58185ywX abstractC58185ywXEZpvd = abstractC58185ywXKWHzl.EZpvd(new InterfaceC58229yxO() { // from class: o.yuy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return AbstractC58107yuz.StateListAnimator.EZpvd(serviceMethod$Receive$execute$stream$2, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
            return this.AEQbTJ.adapt(C58135yva.AEQbTJ(abstractC58185ywXEZpvd));
        }

        public static final InterfaceC58246yxf EZpvd(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(function1, "");
            return (InterfaceC58246yxf) function1.invoke(obj);
        }

        /* JADX INFO: renamed from: o.yuz$StateListAnimator$ActionBar */
        public static final class ActionBar implements ActionBar {
            public final AbstractC58253yxm AEQbTJ;
            public final AbstractC58096yuo.TaskDescription OLrzqt;
            public final C58059yuD copydefault;

            public ActionBar(@NotNull AbstractC58253yxm abstractC58253yxm, @NotNull AbstractC58096yuo.TaskDescription taskDescription, @NotNull C58059yuD c58059yuD) {
                Intrinsics.checkNotNullParameter(abstractC58253yxm, "");
                Intrinsics.checkNotNullParameter(taskDescription, "");
                Intrinsics.checkNotNullParameter(c58059yuD, "");
                this.AEQbTJ = abstractC58253yxm;
                this.OLrzqt = taskDescription;
                this.copydefault = c58059yuD;
            }

            /* JADX DEBUG: Method merged with bridge method: EZpvd(Lo/yul;Ljava/lang/reflect/Method;)Lo/yuz; */
            @Override // o.AbstractC58107yuz.ActionBar
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public StateListAnimator EZpvd(@NotNull C58093yul c58093yul, @NotNull java.lang.reflect.Method method) {
                Intrinsics.checkNotNullParameter(c58093yul, "");
                Intrinsics.checkNotNullParameter(method, "");
                TaskDescription taskDescription = AbstractC58107yuz.Companion;
                java.lang.Class[] clsArr = new java.lang.Class[0];
                if (method.getGenericParameterTypes().length != 0) {
                    throw new java.lang.IllegalArgumentException(("Receive method must have zero parameter: " + method).toString());
                }
                java.lang.reflect.Type[] genericParameterTypes = method.getGenericParameterTypes();
                Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
                java.util.List<kotlin.Pair> listAEQbTJ = yDV.AEQbTJ(genericParameterTypes, clsArr);
                if (!(listAEQbTJ instanceof java.util.Collection) || !listAEQbTJ.isEmpty()) {
                    for (kotlin.Pair pair : listAEQbTJ) {
                        java.lang.reflect.Type type = (java.lang.reflect.Type) pair.component1();
                        java.lang.Class cls = (java.lang.Class) pair.component2();
                        if (cls != type && !cls.isInstance(type)) {
                            throw new java.lang.IllegalArgumentException(("Receive method must have zero parameter: " + method).toString());
                        }
                    }
                }
                TaskDescription taskDescription2 = AbstractC58107yuz.Companion;
                if (ParameterizedType.class != method.getGenericReturnType() && !ParameterizedType.class.isInstance(method.getGenericReturnType())) {
                    throw new java.lang.IllegalArgumentException(("Receive method must return ParameterizedType: " + method).toString());
                }
                Intrinsics.checkNotNullExpressionValue(method.getGenericReturnType(), "");
                if (!(!C58137yvc.KWHzl(r1))) {
                    throw new java.lang.IllegalArgumentException(("Method return type must not include a type variable or wildcard: " + method.getGenericReturnType()).toString());
                }
                return new StateListAnimator(EZpvd(method), c58093yul, this.AEQbTJ, KWHzl(method));
            }

            public final AbstractC58096yuo<?> EZpvd(java.lang.reflect.Method method) {
                AbstractC58096yuo.TaskDescription taskDescription = this.OLrzqt;
                java.lang.reflect.Type genericReturnType = method.getGenericReturnType();
                Intrinsics.copydefault(genericReturnType, "");
                java.lang.annotation.Annotation[] annotations = method.getAnnotations();
                Intrinsics.checkNotNullExpressionValue(annotations, "");
                return taskDescription.copydefault((ParameterizedType) genericReturnType, annotations);
            }

            public final InterfaceC58091yuj<java.lang.Object, java.lang.Object> KWHzl(java.lang.reflect.Method method) {
                C58059yuD c58059yuD = this.copydefault;
                java.lang.reflect.Type genericReturnType = method.getGenericReturnType();
                Intrinsics.checkNotNullExpressionValue(genericReturnType, "");
                return c58059yuD.KWHzl(genericReturnType);
            }
        }
    }

    /* JADX INFO: renamed from: o.yuz$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yuz.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.lang.reflect.Type KWHzl(java.lang.reflect.Method method) {
            java.lang.reflect.Type[] genericParameterTypes = method.getGenericParameterTypes();
            Intrinsics.checkNotNullExpressionValue(genericParameterTypes, "");
            java.lang.Object objAuCTelauCTel = yDV.AuCTelauCTel(genericParameterTypes);
            Intrinsics.checkNotNullExpressionValue(objAuCTelauCTel, "");
            return (java.lang.reflect.Type) objAuCTelauCTel;
        }

        public final java.lang.annotation.Annotation[] copydefault(java.lang.reflect.Method method) {
            java.lang.annotation.Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            Intrinsics.checkNotNullExpressionValue(parameterAnnotations, "");
            java.lang.Object objAuCTelauCTel = yDV.AuCTelauCTel(parameterAnnotations);
            Intrinsics.checkNotNullExpressionValue(objAuCTelauCTel, "");
            return (java.lang.annotation.Annotation[]) objAuCTelauCTel;
        }
    }
}
