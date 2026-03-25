package o;

import java.lang.reflect.Modifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import o.AbstractC56570yKg;
import o.AbstractC56572yKi;
import o.AbstractC56615yLy;
import o.AbstractC56626yMi;
import o.AbstractC56628yMk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yLF {
    public static final java.lang.Object AEQbTJ(@NotNull AbstractC56615yLy.Application<?, ?> application) {
        Intrinsics.checkNotNullParameter(application, "");
        return application.fetchVPNInfo().AkhnZx();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yMm.createValueClassAwareCallerIfNeeded$default(o.yMj, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, boolean, int, java.lang.Object):o.yMj */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC56627yMj<?> AEQbTJ(AbstractC56615yLy.Application<?, ?> application, boolean z) {
        AbstractC56570yKg.StateListAnimator stateListAnimatorEZpvd;
        java.lang.reflect.Method methodAEQbTJ;
        InterfaceC56627yMj actionBar;
        JvmProtoBuf.JvmMethodSignature setter;
        java.lang.reflect.Method methodCopydefault;
        InterfaceC56627yMj activity;
        java.lang.reflect.Method methodEZpvd;
        if (KDeclarationContainerImpl.KWHzl.KWHzl().matches(application.fetchVPNInfo().AuCTel())) {
            return C56633yMp.OLrzqt;
        }
        AbstractC56572yKi abstractC56572yKiEZpvd = yLT.KWHzl.EZpvd(application.fetchVPNInfo().values());
        if (abstractC56572yKiEZpvd instanceof AbstractC56572yKi.TaskDescription) {
            AbstractC56572yKi.TaskDescription taskDescription = (AbstractC56572yKi.TaskDescription) abstractC56572yKiEZpvd;
            JvmProtoBuf.JvmPropertySignature jvmPropertySignatureAYXKKw = taskDescription.AYXKKw();
            if (z) {
                setter = jvmPropertySignatureAYXKKw.hasGetter() ? jvmPropertySignatureAYXKKw.getGetter() : null;
                methodCopydefault = setter == null ? application.fetchVPNInfo().KWHzl().copydefault(taskDescription.EZpvd().KWHzl(setter.getName()), taskDescription.EZpvd().KWHzl(setter.getDesc())) : null;
                if (methodCopydefault != null) {
                    if (yYK.OLrzqt((yOC) application.fetchVPNInfo().values()) && Intrinsics.EZpvd(application.fetchVPNInfo().values().getNewProxyInstance(), C56669yNy.KWHzl)) {
                        java.lang.Class<?> clsKWHzl = C56630yMm.KWHzl(application.fetchVPNInfo().values().AuCTel());
                        if (clsKWHzl == null || (methodEZpvd = C56630yMm.EZpvd(clsKWHzl, application.fetchVPNInfo().values())) == null) {
                            throw new KotlinReflectionInternalError("Underlying property of inline class " + application.fetchVPNInfo() + " should have a field");
                        }
                        actionBar = application.gEmmrt() ? new AbstractC56626yMi.StateListAnimator(methodEZpvd, AEQbTJ(application)) : new AbstractC56626yMi.Activity(methodEZpvd);
                    } else {
                        java.lang.reflect.Field fieldValues = application.fetchVPNInfo().values();
                        if (fieldValues == null) {
                            throw new KotlinReflectionInternalError("No accessors or field is found for property " + application.fetchVPNInfo());
                        }
                        actionBar = OLrzqt(application, z, fieldValues);
                    }
                } else {
                    if (!Modifier.isStatic(methodCopydefault.getModifiers())) {
                        activity = application.gEmmrt() ? new AbstractC56628yMk.FragmentManager.ActionBar(methodCopydefault, AEQbTJ(application)) : new AbstractC56628yMk.FragmentManager.TaskDescription(methodCopydefault);
                    } else if (copydefault(application)) {
                        activity = application.gEmmrt() ? new AbstractC56628yMk.FragmentManager.Application(methodCopydefault) : new AbstractC56628yMk.FragmentManager.C1001FragmentManager(methodCopydefault);
                    } else {
                        activity = application.gEmmrt() ? new AbstractC56628yMk.FragmentManager.Activity(methodCopydefault, false, AEQbTJ(application)) : new AbstractC56628yMk.FragmentManager.Dialog(methodCopydefault);
                    }
                    actionBar = activity;
                }
            } else {
                if (jvmPropertySignatureAYXKKw.hasSetter()) {
                    setter = jvmPropertySignatureAYXKKw.getSetter();
                }
                if (setter == null) {
                }
                if (methodCopydefault != null) {
                }
            }
        } else if (abstractC56572yKiEZpvd instanceof AbstractC56572yKi.Activity) {
            actionBar = OLrzqt(application, z, ((AbstractC56572yKi.Activity) abstractC56572yKiEZpvd).EZpvd());
        } else if (abstractC56572yKiEZpvd instanceof AbstractC56572yKi.StateListAnimator) {
            if (z) {
                methodAEQbTJ = ((AbstractC56572yKi.StateListAnimator) abstractC56572yKiEZpvd).OLrzqt();
            } else {
                AbstractC56572yKi.StateListAnimator stateListAnimator = (AbstractC56572yKi.StateListAnimator) abstractC56572yKiEZpvd;
                methodAEQbTJ = stateListAnimator.AEQbTJ();
                if (methodAEQbTJ == null) {
                    throw new KotlinReflectionInternalError("No source found for setter of Java method property: " + stateListAnimator.OLrzqt());
                }
            }
            actionBar = application.gEmmrt() ? new AbstractC56628yMk.FragmentManager.ActionBar(methodAEQbTJ, AEQbTJ(application)) : new AbstractC56628yMk.FragmentManager.TaskDescription(methodAEQbTJ);
        } else {
            if (!(abstractC56572yKiEZpvd instanceof AbstractC56572yKi.ActionBar)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z) {
                stateListAnimatorEZpvd = ((AbstractC56572yKi.ActionBar) abstractC56572yKiEZpvd).OLrzqt();
            } else {
                stateListAnimatorEZpvd = ((AbstractC56572yKi.ActionBar) abstractC56572yKiEZpvd).EZpvd();
                if (stateListAnimatorEZpvd == null) {
                    throw new KotlinReflectionInternalError("No setter found for property " + application.fetchVPNInfo());
                }
            }
            java.lang.reflect.Method methodCopydefault2 = application.fetchVPNInfo().KWHzl().copydefault(stateListAnimatorEZpvd.AEQbTJ(), stateListAnimatorEZpvd.KWHzl());
            if (methodCopydefault2 == null) {
                throw new KotlinReflectionInternalError("No accessor found for property " + application.fetchVPNInfo());
            }
            Modifier.isStatic(methodCopydefault2.getModifiers());
            return application.gEmmrt() ? new AbstractC56628yMk.FragmentManager.ActionBar(methodCopydefault2, AEQbTJ(application)) : new AbstractC56628yMk.FragmentManager.TaskDescription(methodCopydefault2);
        }
        return C56630yMm.createValueClassAwareCallerIfNeeded$default(actionBar, application.values(), false, 2, null);
    }

    public static final boolean copydefault(AbstractC56615yLy.Application<?, ?> application) {
        return application.fetchVPNInfo().values().copydefault().copydefault(yLX.copydefault());
    }

    public static final boolean OLrzqt(AbstractC56615yLy.Application<?, ?> application) {
        return !C59322zep.valueOf(application.fetchVPNInfo().values().uzCIH());
    }

    public static final AbstractC56628yMk<java.lang.reflect.Field> OLrzqt(AbstractC56615yLy.Application<?, ?> application, boolean z, java.lang.reflect.Field field) {
        AbstractC56628yMk<java.lang.reflect.Field> taskDescription;
        if (OLrzqt(application.fetchVPNInfo().values()) || !Modifier.isStatic(field.getModifiers())) {
            if (z) {
                if (!application.gEmmrt()) {
                    return new AbstractC56628yMk.Dialog.ActionBar(field);
                }
                taskDescription = new AbstractC56628yMk.Dialog.TaskDescription(field, AEQbTJ(application));
            } else {
                taskDescription = application.gEmmrt() ? new AbstractC56628yMk.LoaderManager.TaskDescription(field, OLrzqt(application), AEQbTJ(application)) : new AbstractC56628yMk.LoaderManager.StateListAnimator(field, OLrzqt(application));
            }
        } else if (copydefault(application)) {
            if (z) {
                return application.gEmmrt() ? new AbstractC56628yMk.Dialog.Activity(field) : new AbstractC56628yMk.Dialog.StateListAnimator(field);
            }
            taskDescription = application.gEmmrt() ? new AbstractC56628yMk.LoaderManager.ActionBar(field, OLrzqt(application)) : new AbstractC56628yMk.LoaderManager.Application(field, OLrzqt(application));
        } else {
            if (z) {
                return new AbstractC56628yMk.Dialog.Application(field);
            }
            taskDescription = new AbstractC56628yMk.LoaderManager.Activity(field, OLrzqt(application));
        }
        return taskDescription;
    }

    public static final boolean OLrzqt(InterfaceC56676yOe interfaceC56676yOe) {
        InterfaceC56665yNu interfaceC56665yNuAYXKKw = interfaceC56676yOe.AuCTel();
        Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAYXKKw, "");
        if (!yYH.isConnected(interfaceC56665yNuAYXKKw)) {
            return false;
        }
        InterfaceC56665yNu interfaceC56665yNuAYXKKw2 = interfaceC56665yNuAYXKKw.AuCTel();
        return !(yYH.AuCTel(interfaceC56665yNuAYXKKw2) || yYH.djBIcL(interfaceC56665yNuAYXKKw2)) || ((interfaceC56676yOe instanceof C59218zcr) && C56928yXn.EZpvd(((C59218zcr) interfaceC56676yOe).QUSxYX()));
    }
}
