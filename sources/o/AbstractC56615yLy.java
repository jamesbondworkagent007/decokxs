package o;

import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import o.AbstractC56572yKi;
import o.AbstractC56919yXe;
import o.InterfaceC56558yJv;
import o.yJA;
import o.yLN;
import o.yOL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yLy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56615yLy<V> extends AbstractC56573yKj<V> implements yJA<V> {
    public final InterfaceC56387yDm<java.lang.reflect.Field> DbNXlk;
    public final java.lang.String ejfBZ;
    public final java.lang.Object fARcdN;
    public final java.lang.String fIwbmz;
    public final yLN.ActionBar<InterfaceC56676yOe> fetchVPNInfo;
    public final KDeclarationContainerImpl isConnected;
    public static final StateListAnimator values = new StateListAnimator(null);
    public static final java.lang.Object AkhnZx = new java.lang.Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTel() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC56573yKj
    public KDeclarationContainerImpl KWHzl() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56549yJm
    public java.lang.String getName() {
        return this.fIwbmz;
    }

    public abstract ActionBar<V> isConnected();

    @Override // o.InterfaceC56549yJm
    public boolean isSuspend() {
        return false;
    }

    public AbstractC56615yLy(KDeclarationContainerImpl kDeclarationContainerImpl, java.lang.String str, java.lang.String str2, InterfaceC56676yOe interfaceC56676yOe, java.lang.Object obj) {
        this.isConnected = kDeclarationContainerImpl;
        this.fIwbmz = str;
        this.ejfBZ = str2;
        this.fARcdN = obj;
        this.DbNXlk = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new yLA(this));
        yLN.ActionBar<InterfaceC56676yOe> actionBarCopydefault = yLN.copydefault(interfaceC56676yOe, new C56616yLz(this));
        Intrinsics.checkNotNullExpressionValue(actionBarCopydefault, "");
        this.fetchVPNInfo = actionBarCopydefault;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractC56615yLy(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj);
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC56615yLy(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull InterfaceC56676yOe interfaceC56676yOe) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(interfaceC56676yOe, "");
        java.lang.String strAEQbTJ = interfaceC56676yOe.bR_().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        this(kDeclarationContainerImpl, strAEQbTJ, yLT.KWHzl.EZpvd(interfaceC56676yOe).KWHzl(), interfaceC56676yOe, CallableReference.NO_RECEIVER);
    }

    public final java.lang.Object AkhnZx() {
        return C56630yMm.AEQbTJ(this.fARcdN, values());
    }

    @Override // o.AbstractC56573yKj
    public boolean gEmmrt() {
        return this.fARcdN != CallableReference.NO_RECEIVER;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yXn.getJvmFieldSignature$default(o.yXn, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, o.yWS, o.yWW, boolean, int, java.lang.Object):o.yXe$Activity */
    public static final java.lang.reflect.Field EZpvd(AbstractC56615yLy abstractC56615yLy) {
        java.lang.Class<?> enclosingClass;
        AbstractC56572yKi abstractC56572yKiEZpvd = yLT.KWHzl.EZpvd(abstractC56615yLy.values());
        if (abstractC56572yKiEZpvd instanceof AbstractC56572yKi.TaskDescription) {
            AbstractC56572yKi.TaskDescription taskDescription = (AbstractC56572yKi.TaskDescription) abstractC56572yKiEZpvd;
            InterfaceC56676yOe interfaceC56676yOeCopydefault = taskDescription.copydefault();
            AbstractC56919yXe.Activity jvmFieldSignature$default = C56928yXn.getJvmFieldSignature$default(C56928yXn.AEQbTJ, taskDescription.AEQbTJ(), taskDescription.EZpvd(), taskDescription.AhwBna(), false, 8, null);
            if (jvmFieldSignature$default != null) {
                if (C56760yRh.KWHzl(interfaceC56676yOeCopydefault) || C56928yXn.EZpvd(taskDescription.AEQbTJ())) {
                    enclosingClass = abstractC56615yLy.KWHzl().OLrzqt().getEnclosingClass();
                } else {
                    InterfaceC56665yNu interfaceC56665yNuAYXKKw = interfaceC56676yOeCopydefault.AuCTel();
                    enclosingClass = interfaceC56665yNuAYXKKw instanceof InterfaceC56658yNn ? yLX.OLrzqt((InterfaceC56658yNn) interfaceC56665yNuAYXKKw) : abstractC56615yLy.KWHzl().OLrzqt();
                }
                if (enclosingClass != null) {
                    try {
                        return enclosingClass.getDeclaredField(jvmFieldSignature$default.AEQbTJ());
                    } catch (java.lang.NoSuchFieldException unused) {
                    }
                }
            }
        } else {
            if (abstractC56572yKiEZpvd instanceof AbstractC56572yKi.Activity) {
                return ((AbstractC56572yKi.Activity) abstractC56572yKiEZpvd).EZpvd();
            }
            if (!(abstractC56572yKiEZpvd instanceof AbstractC56572yKi.StateListAnimator) && !(abstractC56572yKiEZpvd instanceof AbstractC56572yKi.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    public final java.lang.reflect.Field values() {
        return this.DbNXlk.getValue();
    }

    public final java.lang.reflect.Member DbNXlk() {
        if (!values().sSMYrx()) {
            return null;
        }
        AbstractC56572yKi abstractC56572yKiEZpvd = yLT.KWHzl.EZpvd(values());
        if (abstractC56572yKiEZpvd instanceof AbstractC56572yKi.TaskDescription) {
            AbstractC56572yKi.TaskDescription taskDescription = (AbstractC56572yKi.TaskDescription) abstractC56572yKiEZpvd;
            if (taskDescription.AYXKKw().hasDelegateMethod()) {
                JvmProtoBuf.JvmMethodSignature delegateMethod = taskDescription.AYXKKw().getDelegateMethod();
                if (!delegateMethod.hasName() || !delegateMethod.hasDesc()) {
                    return null;
                }
                return KWHzl().copydefault(taskDescription.EZpvd().KWHzl(delegateMethod.getName()), taskDescription.EZpvd().KWHzl(delegateMethod.getDesc()));
            }
        }
        return values();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.lang.reflect.Member */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object AEQbTJ(java.lang.reflect.Member member, java.lang.Object obj, java.lang.Object obj2) throws IllegalPropertyDelegateAccessException {
        try {
            java.lang.Object obj3 = AkhnZx;
            if ((obj == obj3 || obj2 == obj3) && values().djBIcL() == null) {
                throw new java.lang.RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            java.lang.Object objAkhnZx = gEmmrt() ? AkhnZx() : obj;
            if (objAkhnZx == obj3) {
                objAkhnZx = null;
            }
            if (!gEmmrt()) {
                obj = obj2;
            }
            if (obj == obj3) {
                obj = null;
            }
            java.lang.reflect.AccessibleObject accessibleObject = member instanceof java.lang.reflect.AccessibleObject ? (java.lang.reflect.AccessibleObject) member : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(yJG.EZpvd(this));
            }
            if (member == 0) {
                return null;
            }
            if (member instanceof java.lang.reflect.Field) {
                return ((java.lang.reflect.Field) member).get(objAkhnZx);
            }
            if (!(member instanceof java.lang.reflect.Method)) {
                throw new java.lang.AssertionError("delegate field/method " + member + " neither field nor method");
            }
            int length = ((java.lang.reflect.Method) member).getParameterTypes().length;
            if (length == 0) {
                return ((java.lang.reflect.Method) member).invoke(null, new java.lang.Object[0]);
            }
            if (length == 1) {
                java.lang.reflect.Method method = (java.lang.reflect.Method) member;
                java.lang.Object[] objArr = new java.lang.Object[1];
                if (objAkhnZx == null) {
                    java.lang.Class<?> cls = ((java.lang.reflect.Method) member).getParameterTypes()[0];
                    Intrinsics.checkNotNullExpressionValue(cls, "");
                    objAkhnZx = yLX.AEQbTJ((java.lang.reflect.Type) cls);
                }
                objArr[0] = objAkhnZx;
                return method.invoke(null, objArr);
            }
            if (length == 2) {
                java.lang.reflect.Method method2 = (java.lang.reflect.Method) member;
                java.lang.Object[] objArr2 = new java.lang.Object[2];
                objArr2[0] = objAkhnZx;
                if (obj == null) {
                    java.lang.Class<?> cls2 = ((java.lang.reflect.Method) member).getParameterTypes()[1];
                    Intrinsics.checkNotNullExpressionValue(cls2, "");
                    obj = yLX.AEQbTJ((java.lang.reflect.Type) cls2);
                }
                objArr2[1] = obj;
                return method2.invoke(null, objArr2);
            }
            throw new java.lang.AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
        } catch (java.lang.IllegalAccessException e) {
            throw new IllegalPropertyDelegateAccessException(e);
        }
    }

    public static final InterfaceC56676yOe AEQbTJ(AbstractC56615yLy abstractC56615yLy) {
        return abstractC56615yLy.KWHzl().OLrzqt(abstractC56615yLy.getName(), abstractC56615yLy.ejfBZ);
    }

    /* JADX DEBUG: Method merged with bridge method: valueOf()Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    @Override // o.AbstractC56573yKj
    /* JADX INFO: renamed from: fetchVPNInfo, reason: merged with bridge method [inline-methods] */
    public InterfaceC56676yOe values() {
        InterfaceC56676yOe interfaceC56676yOeInvoke = this.fetchVPNInfo.invoke();
        Intrinsics.checkNotNullExpressionValue(interfaceC56676yOeInvoke, "");
        return interfaceC56676yOeInvoke;
    }

    @Override // o.AbstractC56573yKj
    public InterfaceC56627yMj<?> EZpvd() {
        return isConnected().EZpvd();
    }

    @Override // o.AbstractC56573yKj
    public InterfaceC56627yMj<?> AhwBna() {
        return isConnected().AhwBna();
    }

    @Override // o.yJA
    public boolean isLateinit() {
        return values().AuCTelauCTel();
    }

    @Override // o.yJA
    public boolean isConst() {
        return values().wlaJM();
    }

    public boolean equals(java.lang.Object obj) {
        AbstractC56615yLy<?> abstractC56615yLyOLrzqt = yLX.OLrzqt(obj);
        return abstractC56615yLyOLrzqt != null && Intrinsics.EZpvd(KWHzl(), abstractC56615yLyOLrzqt.KWHzl()) && Intrinsics.EZpvd((java.lang.Object) getName(), (java.lang.Object) abstractC56615yLyOLrzqt.getName()) && Intrinsics.EZpvd((java.lang.Object) this.ejfBZ, (java.lang.Object) abstractC56615yLyOLrzqt.ejfBZ) && Intrinsics.EZpvd(this.fARcdN, abstractC56615yLyOLrzqt.fARcdN);
    }

    public int hashCode() {
        return (((KWHzl().hashCode() * 31) + getName().hashCode()) * 31) + this.ejfBZ.hashCode();
    }

    public java.lang.String toString() {
        return yLS.EZpvd.AEQbTJ(values());
    }

    /* JADX INFO: renamed from: o.yLy$Application */
    public static abstract class Application<PropertyType, ReturnType> extends AbstractC56573yKj<ReturnType> implements InterfaceC56555yJs<ReturnType>, yJA.ActionBar<PropertyType> {
        @Override // o.AbstractC56573yKj
        public InterfaceC56627yMj<?> AhwBna() {
            return null;
        }

        public abstract AbstractC56615yLy<PropertyType> fetchVPNInfo();

        public abstract InterfaceC56677yOf values();

        @Override // o.AbstractC56573yKj
        public KDeclarationContainerImpl KWHzl() {
            return fetchVPNInfo().KWHzl();
        }

        @Override // o.AbstractC56573yKj
        public boolean gEmmrt() {
            return fetchVPNInfo().gEmmrt();
        }

        @Override // o.InterfaceC56555yJs
        public boolean isInline() {
            return values().EZpvd();
        }

        @Override // o.InterfaceC56555yJs
        public boolean isExternal() {
            return values().zsXlph();
        }

        @Override // o.InterfaceC56555yJs
        public boolean isOperator() {
            return values().AwvSrB();
        }

        @Override // o.InterfaceC56555yJs
        public boolean isInfix() {
            return values().AuCTelauCTel();
        }

        @Override // o.InterfaceC56549yJm
        public boolean isSuspend() {
            return values().AxsJAY();
        }
    }

    /* JADX INFO: renamed from: o.yLy$ActionBar */
    public static abstract class ActionBar<V> extends Application<V, V> implements yJA.StateListAnimator<V> {
        public static final /* synthetic */ yJA<java.lang.Object>[] gEmmrt = {C56524yIo.copydefault(new PropertyReference1Impl(ActionBar.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};
        public final yLN.ActionBar AkhnZx = yLN.copydefault(new yLD(this));
        public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new yLE(this));

        @Override // o.InterfaceC56549yJm
        public java.lang.String getName() {
            return "<get-" + fetchVPNInfo().getName() + '>';
        }

        /* JADX DEBUG: Method merged with bridge method: valueOf()Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
        /* JADX DEBUG: Method merged with bridge method: values()Lo/yOf; */
        @Override // o.AbstractC56615yLy.Application
        /* JADX INFO: renamed from: AkhnZx, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public InterfaceC56675yOd values() {
            T tKWHzl = this.AkhnZx.KWHzl(this, gEmmrt[0]);
            Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
            return (InterfaceC56675yOd) tKWHzl;
        }

        public static final InterfaceC56675yOd KWHzl(ActionBar actionBar) {
            InterfaceC56675yOd interfaceC56675yOdEjfBZ = actionBar.fetchVPNInfo().values().ejfBZ();
            if (interfaceC56675yOdEjfBZ != null) {
                return interfaceC56675yOdEjfBZ;
            }
            yPL yplCopydefault = yYI.copydefault(actionBar.fetchVPNInfo().values(), yOL.KWHzl.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(yplCopydefault, "");
            return yplCopydefault;
        }

        @Override // o.AbstractC56573yKj
        public InterfaceC56627yMj<?> EZpvd() {
            return (InterfaceC56627yMj) this.fetchVPNInfo.getValue();
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.yLF.KWHzl(o.yLy$Application, boolean):o.yMj */
        public static final InterfaceC56627yMj OLrzqt(ActionBar actionBar) {
            return yLF.AEQbTJ(actionBar, true);
        }

        public java.lang.String toString() {
            return "getter of " + fetchVPNInfo();
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(fetchVPNInfo(), ((ActionBar) obj).fetchVPNInfo());
        }

        public int hashCode() {
            return fetchVPNInfo().hashCode();
        }
    }

    /* JADX INFO: renamed from: o.yLy$TaskDescription */
    public static abstract class TaskDescription<V> extends Application<V, Unit> implements InterfaceC56558yJv.StateListAnimator<V> {
        public static final /* synthetic */ yJA<java.lang.Object>[] valueOf = {C56524yIo.copydefault(new PropertyReference1Impl(TaskDescription.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", 0))};
        public final yLN.ActionBar fetchVPNInfo = yLN.copydefault(new yLG(this));
        public final InterfaceC56387yDm AYXKKw = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new yLC(this));

        @Override // o.InterfaceC56549yJm
        public java.lang.String getName() {
            return "<set-" + fetchVPNInfo().getName() + '>';
        }

        /* JADX DEBUG: Method merged with bridge method: valueOf()Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
        /* JADX DEBUG: Method merged with bridge method: values()Lo/yOf; */
        @Override // o.AbstractC56615yLy.Application
        /* JADX INFO: renamed from: DbNXlk, reason: merged with bridge method [inline-methods] */
        public InterfaceC56680yOi values() {
            T tKWHzl = this.fetchVPNInfo.KWHzl(this, valueOf[0]);
            Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
            return (InterfaceC56680yOi) tKWHzl;
        }

        public static final InterfaceC56680yOi OLrzqt(TaskDescription taskDescription) {
            InterfaceC56680yOi fieldNames = taskDescription.fetchVPNInfo().values().getFieldNames();
            if (fieldNames != null) {
                return fieldNames;
            }
            InterfaceC56676yOe interfaceC56676yOeValues = taskDescription.fetchVPNInfo().values();
            yOL.Application application = yOL.KWHzl;
            yPN ypnEZpvd = yYI.EZpvd(interfaceC56676yOeValues, application.OLrzqt(), application.OLrzqt());
            Intrinsics.checkNotNullExpressionValue(ypnEZpvd, "");
            return ypnEZpvd;
        }

        @Override // o.AbstractC56573yKj
        public InterfaceC56627yMj<?> EZpvd() {
            return (InterfaceC56627yMj) this.AYXKKw.getValue();
        }

        public static final InterfaceC56627yMj EZpvd(TaskDescription taskDescription) {
            return yLF.AEQbTJ(taskDescription, false);
        }

        public java.lang.String toString() {
            return "setter of " + fetchVPNInfo();
        }

        public boolean equals(java.lang.Object obj) {
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(fetchVPNInfo(), ((TaskDescription) obj).fetchVPNInfo());
        }

        public int hashCode() {
            return fetchVPNInfo().hashCode();
        }
    }

    /* JADX INFO: renamed from: o.yLy$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yLy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
