package o;

import java.lang.reflect.Modifier;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import o.AbstractC56570yKg;
import o.AbstractC56628yMk;
import o.C56632yMo;
import o.InterfaceC56567yKd;
import o.yLN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yKT extends AbstractC56573yKj<java.lang.Object> implements InterfaceC56517yIh<java.lang.Object>, InterfaceC56555yJs<java.lang.Object>, InterfaceC56567yKd {
    public static final /* synthetic */ yJA<java.lang.Object>[] AhwBna = {C56524yIo.copydefault(new PropertyReference1Impl(yKT.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0))};
    public final KDeclarationContainerImpl AYXKKw;
    public final yLN.ActionBar fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final java.lang.Object isConnected;
    public final InterfaceC56387yDm valueOf;
    public final java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC56573yKj
    public KDeclarationContainerImpl KWHzl() {
        return this.AYXKKw;
    }

    @Override // kotlin.jvm.functions.Function0
    public java.lang.Object invoke() {
        return InterfaceC56567yKd.Application.AEQbTJ(this);
    }

    @Override // kotlin.jvm.functions.Function1
    public java.lang.Object invoke(java.lang.Object obj) {
        return InterfaceC56567yKd.Application.KWHzl(this, obj);
    }

    @Override // kotlin.jvm.functions.Function2
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return InterfaceC56567yKd.Application.KWHzl(this, obj, obj2);
    }

    @Override // o.yHO
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return InterfaceC56567yKd.Application.copydefault(this, obj, obj2, obj3);
    }

    @Override // o.yHT
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        return InterfaceC56567yKd.Application.OLrzqt(this, obj, obj2, obj3, obj4);
    }

    @Override // o.yHS
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        return InterfaceC56567yKd.Application.OLrzqt(this, obj, obj2, obj3, obj4, obj5);
    }

    @Override // o.yHQ
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6) {
        return InterfaceC56567yKd.Application.AEQbTJ(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // o.yHR
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        return InterfaceC56567yKd.Application.copydefault(this, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // o.yHP
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8) {
        return InterfaceC56567yKd.Application.EZpvd(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // o.yHY
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9) {
        return InterfaceC56567yKd.Application.AEQbTJ(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // o.yHC
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10) {
        return InterfaceC56567yKd.Application.KWHzl(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // o.yHA
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11) {
        return InterfaceC56567yKd.Application.EZpvd(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // o.yHD
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12) {
        return InterfaceC56567yKd.Application.AEQbTJ(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // o.yHB
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13) {
        return InterfaceC56567yKd.Application.copydefault(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // o.yHI
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14) {
        return InterfaceC56567yKd.Application.AEQbTJ(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    @Override // o.yHJ
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15) {
        return InterfaceC56567yKd.Application.OLrzqt(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // o.yHF
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16) {
        return InterfaceC56567yKd.Application.OLrzqt(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // o.yHG
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17) {
        return InterfaceC56567yKd.Application.AEQbTJ(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // o.yHH
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18) {
        return InterfaceC56567yKd.Application.KWHzl(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    @Override // o.yHL
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19) {
        return InterfaceC56567yKd.Application.KWHzl(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // o.yHM
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19, java.lang.Object obj20) {
        return InterfaceC56567yKd.Application.KWHzl(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // o.yHN
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19, java.lang.Object obj20, java.lang.Object obj21) {
        return InterfaceC56567yKd.Application.copydefault(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // o.yHK
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12, java.lang.Object obj13, java.lang.Object obj14, java.lang.Object obj15, java.lang.Object obj16, java.lang.Object obj17, java.lang.Object obj18, java.lang.Object obj19, java.lang.Object obj20, java.lang.Object obj21, java.lang.Object obj22) {
        return InterfaceC56567yKd.Application.EZpvd(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r7v0 kotlin.reflect.jvm.internal.KDeclarationContainerImpl)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 o.yNG)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Object:0x0004: SGET  A[WRAPPED] (LINE:47) kotlin.jvm.internal.CallableReference.NO_RECEIVER java.lang.Object) : (r11v0 java.lang.Object))
 A[MD:(kotlin.reflect.jvm.internal.KDeclarationContainerImpl, java.lang.String, java.lang.String, o.yNG, java.lang.Object):void (m)] (LINE:42) call: o.yKT.<init>(kotlin.reflect.jvm.internal.KDeclarationContainerImpl, java.lang.String, java.lang.String, o.yNG, java.lang.Object):void type: THIS */
    public /* synthetic */ yKT(KDeclarationContainerImpl kDeclarationContainerImpl, java.lang.String str, java.lang.String str2, yNG yng, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kDeclarationContainerImpl, str, str2, yng, (i & 16) != 0 ? CallableReference.NO_RECEIVER : obj);
    }

    public yKT(KDeclarationContainerImpl kDeclarationContainerImpl, java.lang.String str, java.lang.String str2, yNG yng, java.lang.Object obj) {
        this.AYXKKw = kDeclarationContainerImpl;
        this.values = str2;
        this.isConnected = obj;
        this.fetchVPNInfo = yLN.copydefault(yng, new yKV(this, str));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.gEmmrt = C56392yDr.EZpvd(lazyThreadSafetyMode, new C56593yLc(this));
        this.valueOf = C56392yDr.EZpvd(lazyThreadSafetyMode, new C56592yLb(this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yKT(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.Object obj) {
        this(kDeclarationContainerImpl, str, str2, null, obj);
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public yKT(@NotNull KDeclarationContainerImpl kDeclarationContainerImpl, @NotNull yNG yng) {
        Intrinsics.checkNotNullParameter(kDeclarationContainerImpl, "");
        Intrinsics.checkNotNullParameter(yng, "");
        java.lang.String strAEQbTJ = yng.bR_().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        this(kDeclarationContainerImpl, strAEQbTJ, yLT.KWHzl.AEQbTJ(yng).OLrzqt(), yng, null, 16, null);
    }

    @Override // o.AbstractC56573yKj
    public boolean gEmmrt() {
        return this.isConnected != CallableReference.NO_RECEIVER;
    }

    /* JADX DEBUG: Method merged with bridge method: valueOf()Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor; */
    @Override // o.AbstractC56573yKj
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public yNG values() {
        T tKWHzl = this.fetchVPNInfo.KWHzl(this, AhwBna[0]);
        Intrinsics.checkNotNullExpressionValue(tKWHzl, "");
        return (yNG) tKWHzl;
    }

    public static final yNG EZpvd(yKT ykt, java.lang.String str) {
        return ykt.KWHzl().EZpvd(str, ykt.values);
    }

    @Override // o.InterfaceC56549yJm
    public java.lang.String getName() {
        java.lang.String strAEQbTJ = values().bR_().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
        return strAEQbTJ;
    }

    @Override // o.AbstractC56573yKj
    public InterfaceC56627yMj<?> EZpvd() {
        return (InterfaceC56627yMj) this.gEmmrt.getValue();
    }

    public static final InterfaceC56627yMj EZpvd(yKT ykt) {
        java.lang.Object objEZpvd;
        InterfaceC56627yMj<?> interfaceC56627yMjOLrzqt;
        AbstractC56570yKg abstractC56570yKgAEQbTJ = yLT.KWHzl.AEQbTJ(ykt.values());
        if (abstractC56570yKgAEQbTJ instanceof AbstractC56570yKg.ActionBar) {
            if (ykt.AYXKKw()) {
                java.lang.Class<?> clsOLrzqt = ykt.KWHzl().OLrzqt();
                java.util.List<KParameter> parameters = ykt.getParameters();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(parameters, 10));
                java.util.Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    java.lang.String strKWHzl = ((KParameter) it.next()).KWHzl();
                    Intrinsics.copydefault((java.lang.Object) strKWHzl);
                    arrayList.add(strKWHzl);
                }
                return new AnnotationConstructorCaller(clsOLrzqt, arrayList, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
            }
            objEZpvd = ykt.KWHzl().copydefault(((AbstractC56570yKg.ActionBar) abstractC56570yKgAEQbTJ).copydefault());
        } else if (abstractC56570yKgAEQbTJ instanceof AbstractC56570yKg.StateListAnimator) {
            yNG yngValues = ykt.values();
            InterfaceC56665yNu interfaceC56665yNuAYXKKw = yngValues.AuCTel();
            Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAYXKKw, "");
            if (yYK.AEQbTJ(interfaceC56665yNuAYXKKw) && (yngValues instanceof InterfaceC56660yNp) && ((InterfaceC56660yNp) yngValues).getFieldNames()) {
                yNG yngValues2 = ykt.values();
                KDeclarationContainerImpl kDeclarationContainerImplKWHzl = ykt.KWHzl();
                java.lang.String strKWHzl2 = ((AbstractC56570yKg.StateListAnimator) abstractC56570yKgAEQbTJ).KWHzl();
                java.util.List<InterfaceC56695yOx> listFetchVPNInfo = ykt.values().fetchVPNInfo();
                Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
                return new C56632yMo.ActionBar(yngValues2, kDeclarationContainerImplKWHzl, strKWHzl2, listFetchVPNInfo);
            }
            AbstractC56570yKg.StateListAnimator stateListAnimator = (AbstractC56570yKg.StateListAnimator) abstractC56570yKgAEQbTJ;
            objEZpvd = ykt.KWHzl().copydefault(stateListAnimator.AEQbTJ(), stateListAnimator.KWHzl());
        } else if (abstractC56570yKgAEQbTJ instanceof AbstractC56570yKg.Application) {
            objEZpvd = ((AbstractC56570yKg.Application) abstractC56570yKgAEQbTJ).EZpvd();
            Intrinsics.copydefault(objEZpvd, "");
        } else {
            if (!(abstractC56570yKgAEQbTJ instanceof AbstractC56570yKg.TaskDescription)) {
                if (!(abstractC56570yKgAEQbTJ instanceof AbstractC56570yKg.Activity)) {
                    throw new NoWhenBranchMatchedException();
                }
                java.util.List<java.lang.reflect.Method> listCopydefault = ((AbstractC56570yKg.Activity) abstractC56570yKgAEQbTJ).copydefault();
                java.lang.Class<?> clsOLrzqt2 = ykt.KWHzl().OLrzqt();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                java.util.Iterator<T> it2 = listCopydefault.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((java.lang.reflect.Method) it2.next()).getName());
                }
                return new AnnotationConstructorCaller(clsOLrzqt2, arrayList2, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.JAVA, listCopydefault);
            }
            objEZpvd = ((AbstractC56570yKg.TaskDescription) abstractC56570yKgAEQbTJ).EZpvd();
            Intrinsics.copydefault(objEZpvd, "");
        }
        if (objEZpvd instanceof java.lang.reflect.Constructor) {
            interfaceC56627yMjOLrzqt = ykt.copydefault((java.lang.reflect.Constructor) objEZpvd, ykt.values(), false);
        } else if (objEZpvd instanceof java.lang.reflect.Method) {
            java.lang.reflect.Method method = (java.lang.reflect.Method) objEZpvd;
            if (!Modifier.isStatic(method.getModifiers())) {
                interfaceC56627yMjOLrzqt = ykt.copydefault(method);
            } else if (ykt.values().copydefault().EZpvd(yLX.copydefault()) != null) {
                interfaceC56627yMjOLrzqt = ykt.OLrzqt(method);
            } else {
                interfaceC56627yMjOLrzqt = ykt.OLrzqt(method, false);
            }
        } else {
            throw new KotlinReflectionInternalError("Could not compute caller for function: " + ykt.values() + " (member = " + objEZpvd + ')');
        }
        return C56630yMm.createValueClassAwareCallerIfNeeded$default(interfaceC56627yMjOLrzqt, ykt.values(), false, 2, null);
    }

    @Override // o.AbstractC56573yKj
    public InterfaceC56627yMj<?> AhwBna() {
        return (InterfaceC56627yMj) this.valueOf.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC56627yMj copydefault(yKT ykt) {
        java.lang.reflect.GenericDeclaration genericDeclarationOLrzqt;
        InterfaceC56627yMj<?> interfaceC56627yMjOLrzqt;
        yLT ylt = yLT.KWHzl;
        AbstractC56570yKg abstractC56570yKgAEQbTJ = ylt.AEQbTJ(ykt.values());
        if (abstractC56570yKgAEQbTJ instanceof AbstractC56570yKg.StateListAnimator) {
            yNG yngValues = ykt.values();
            InterfaceC56665yNu interfaceC56665yNuAYXKKw = yngValues.AuCTel();
            Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAYXKKw, "");
            if (yYK.AEQbTJ(interfaceC56665yNuAYXKKw) && (yngValues instanceof InterfaceC56660yNp) && ((InterfaceC56660yNp) yngValues).getFieldNames()) {
                throw new KotlinReflectionInternalError(ykt.values().AuCTel() + " cannot have default arguments");
            }
            yNG yngOLrzqt = ykt.OLrzqt(ykt.values());
            if (yngOLrzqt != null) {
                AbstractC56570yKg abstractC56570yKgAEQbTJ2 = ylt.AEQbTJ(yngOLrzqt);
                Intrinsics.copydefault(abstractC56570yKgAEQbTJ2, "");
                AbstractC56570yKg.StateListAnimator stateListAnimator = (AbstractC56570yKg.StateListAnimator) abstractC56570yKgAEQbTJ2;
                genericDeclarationOLrzqt = ykt.KWHzl().copydefault(stateListAnimator.AEQbTJ(), stateListAnimator.KWHzl(), true);
            } else {
                KDeclarationContainerImpl kDeclarationContainerImplKWHzl = ykt.KWHzl();
                AbstractC56570yKg.StateListAnimator stateListAnimator2 = (AbstractC56570yKg.StateListAnimator) abstractC56570yKgAEQbTJ;
                java.lang.String strAEQbTJ = stateListAnimator2.AEQbTJ();
                java.lang.String strKWHzl = stateListAnimator2.KWHzl();
                Intrinsics.copydefault(ykt.EZpvd().OLrzqt());
                genericDeclarationOLrzqt = kDeclarationContainerImplKWHzl.copydefault(strAEQbTJ, strKWHzl, !Modifier.isStatic(r6.getModifiers()));
            }
        } else if (abstractC56570yKgAEQbTJ instanceof AbstractC56570yKg.ActionBar) {
            if (ykt.AYXKKw()) {
                java.lang.Class<?> clsOLrzqt = ykt.KWHzl().OLrzqt();
                java.util.List<KParameter> parameters = ykt.getParameters();
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(parameters, 10));
                java.util.Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    java.lang.String strKWHzl2 = ((KParameter) it.next()).KWHzl();
                    Intrinsics.copydefault((java.lang.Object) strKWHzl2);
                    arrayList.add(strKWHzl2);
                }
                return new AnnotationConstructorCaller(clsOLrzqt, arrayList, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
            }
            genericDeclarationOLrzqt = ykt.KWHzl().OLrzqt(((AbstractC56570yKg.ActionBar) abstractC56570yKgAEQbTJ).copydefault());
        } else {
            if (abstractC56570yKgAEQbTJ instanceof AbstractC56570yKg.Activity) {
                java.util.List<java.lang.reflect.Method> listCopydefault = ((AbstractC56570yKg.Activity) abstractC56570yKgAEQbTJ).copydefault();
                java.lang.Class<?> clsOLrzqt2 = ykt.KWHzl().OLrzqt();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
                java.util.Iterator<T> it2 = listCopydefault.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((java.lang.reflect.Method) it2.next()).getName());
                }
                return new AnnotationConstructorCaller(clsOLrzqt2, arrayList2, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.JAVA, listCopydefault);
            }
            genericDeclarationOLrzqt = null;
        }
        if (genericDeclarationOLrzqt instanceof java.lang.reflect.Constructor) {
            interfaceC56627yMjOLrzqt = ykt.copydefault((java.lang.reflect.Constructor) genericDeclarationOLrzqt, ykt.values(), true);
        } else if (!(genericDeclarationOLrzqt instanceof java.lang.reflect.Method)) {
            interfaceC56627yMjOLrzqt = null;
        } else if (ykt.values().copydefault().EZpvd(yLX.copydefault()) != null) {
            InterfaceC56665yNu interfaceC56665yNuAYXKKw2 = ykt.values().AuCTel();
            Intrinsics.copydefault(interfaceC56665yNuAYXKKw2, "");
            if (!((InterfaceC56658yNn) interfaceC56665yNuAYXKKw2).AuCTelauCTel()) {
                interfaceC56627yMjOLrzqt = ykt.OLrzqt((java.lang.reflect.Method) genericDeclarationOLrzqt);
            } else {
                interfaceC56627yMjOLrzqt = ykt.OLrzqt((java.lang.reflect.Method) genericDeclarationOLrzqt, ykt.EZpvd().EZpvd());
            }
        }
        if (interfaceC56627yMjOLrzqt != null) {
            return C56630yMm.OLrzqt((InterfaceC56627yMj) interfaceC56627yMjOLrzqt, (CallableMemberDescriptor) ykt.values(), true);
        }
        return null;
    }

    public final yNG OLrzqt(yNG yng) {
        CallableMemberDescriptor next;
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo = yng.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
        if (!(listFetchVPNInfo instanceof java.util.Collection) || !listFetchVPNInfo.isEmpty()) {
            java.util.Iterator<T> it = listFetchVPNInfo.iterator();
            while (it.hasNext()) {
                if (((InterfaceC56695yOx) it.next()).EZpvd()) {
                    return null;
                }
            }
        }
        InterfaceC56665yNu interfaceC56665yNuAYXKKw = yng.AuCTel();
        Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAYXKKw, "");
        if (!yYK.copydefault(interfaceC56665yNuAYXKKw)) {
            return null;
        }
        java.lang.reflect.Member memberOLrzqt = EZpvd().OLrzqt();
        Intrinsics.copydefault(memberOLrzqt);
        if (!Modifier.isStatic(memberOLrzqt.getModifiers())) {
            return null;
        }
        java.util.Iterator<CallableMemberDescriptor> it2 = yZE.OLrzqt((CallableMemberDescriptor) yng, false).iterator();
        loop0: while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            java.util.List<InterfaceC56695yOx> listFetchVPNInfo2 = next.fetchVPNInfo();
            Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo2, "");
            if (!(listFetchVPNInfo2 instanceof java.util.Collection) || !listFetchVPNInfo2.isEmpty()) {
                java.util.Iterator<T> it3 = listFetchVPNInfo2.iterator();
                while (it3.hasNext()) {
                    if (((InterfaceC56695yOx) it3.next()).EZpvd()) {
                        break loop0;
                    }
                }
            }
        }
        if (next instanceof yNG) {
            return (yNG) next;
        }
        return null;
    }

    private final java.lang.Object djBIcL() {
        return C56630yMm.AEQbTJ(this.isConnected, values());
    }

    public final boolean KWHzl(java.lang.reflect.Method method) {
        AbstractC59233zdF abstractC59233zdFUzCIH;
        InterfaceC56679yOh interfaceC56679yOhAEQbTJ = values().AEQbTJ();
        if (interfaceC56679yOhAEQbTJ != null && (abstractC59233zdFUzCIH = interfaceC56679yOhAEQbTJ.uzCIH()) != null && yYK.OLrzqt(abstractC59233zdFUzCIH)) {
            java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "");
            java.lang.Class cls = (java.lang.Class) yDV.zsXlph(parameterTypes);
            if (cls != null && cls.isInterface()) {
                return true;
            }
        }
        return false;
    }

    public final InterfaceC56627yMj<?> OLrzqt(java.lang.reflect.Method method, boolean z) {
        if (gEmmrt()) {
            return new AbstractC56628yMk.FragmentManager.Activity(method, z, KWHzl(method) ? this.isConnected : djBIcL());
        }
        return new AbstractC56628yMk.FragmentManager.Dialog(method);
    }

    public final AbstractC56628yMk.FragmentManager OLrzqt(java.lang.reflect.Method method) {
        return gEmmrt() ? new AbstractC56628yMk.FragmentManager.Application(method) : new AbstractC56628yMk.FragmentManager.C1001FragmentManager(method);
    }

    public final AbstractC56628yMk.FragmentManager copydefault(java.lang.reflect.Method method) {
        return gEmmrt() ? new AbstractC56628yMk.FragmentManager.ActionBar(method, djBIcL()) : new AbstractC56628yMk.FragmentManager.TaskDescription(method);
    }

    public final AbstractC56628yMk<java.lang.reflect.Constructor<?>> copydefault(java.lang.reflect.Constructor<?> constructor, yNG yng, boolean z) {
        if (!z && yZR.OLrzqt(yng)) {
            if (gEmmrt()) {
                return new AbstractC56628yMk.Application(constructor, djBIcL());
            }
            return new AbstractC56628yMk.TaskDescription(constructor);
        }
        if (gEmmrt()) {
            return new AbstractC56628yMk.Activity(constructor, djBIcL());
        }
        return new AbstractC56628yMk.StateListAnimator(constructor);
    }

    @Override // o.InterfaceC56517yIh
    public int getArity() {
        return C56625yMh.AEQbTJ(EZpvd());
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

    public boolean equals(java.lang.Object obj) {
        yKT yktEZpvd = yLX.EZpvd(obj);
        return yktEZpvd != null && Intrinsics.EZpvd(KWHzl(), yktEZpvd.KWHzl()) && Intrinsics.EZpvd((java.lang.Object) getName(), (java.lang.Object) yktEZpvd.getName()) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) yktEZpvd.values) && Intrinsics.EZpvd(this.isConnected, yktEZpvd.isConnected);
    }

    public int hashCode() {
        return (((KWHzl().hashCode() * 31) + getName().hashCode()) * 31) + this.values.hashCode();
    }

    public java.lang.String toString() {
        return yLS.EZpvd.KWHzl(values());
    }
}
