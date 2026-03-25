package o;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC56570yKg;
import o.AbstractC56572yKi;
import o.AbstractC56919yXe;
import o.yMB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yLT {
    public static final yLT KWHzl = new yLT();
    public static final C56929yXo copydefault = C56929yXo.AEQbTJ.KWHzl(new C56933yXs("java.lang.Void"));

    private yLT() {
    }

    public final AbstractC56570yKg AEQbTJ(@NotNull yNG yng) {
        java.lang.reflect.Method methodCopydefault;
        AbstractC56919yXe.TaskDescription taskDescriptionCopydefault;
        AbstractC56919yXe.TaskDescription taskDescriptionOLrzqt;
        Intrinsics.checkNotNullParameter(yng, "");
        yNG yngFJNWhG = ((yNG) yYH.OLrzqt(yng)).bT_();
        Intrinsics.checkNotNullExpressionValue(yngFJNWhG, "");
        if (yngFJNWhG instanceof InterfaceC59131zbJ) {
            InterfaceC59144zbW interfaceC59144zbW = (InterfaceC59144zbW) yngFJNWhG;
            yXQ yxqQUSxYX = interfaceC59144zbW.QUSxYX();
            if ((yxqQUSxYX instanceof ProtoBuf.Function) && (taskDescriptionOLrzqt = C56928yXn.AEQbTJ.OLrzqt((ProtoBuf.Function) yxqQUSxYX, interfaceC59144zbW.QKVWgx(), interfaceC59144zbW.RJOkX())) != null) {
                return new AbstractC56570yKg.StateListAnimator(taskDescriptionOLrzqt);
            }
            if ((yxqQUSxYX instanceof ProtoBuf.Constructor) && (taskDescriptionCopydefault = C56928yXn.AEQbTJ.copydefault((ProtoBuf.Constructor) yxqQUSxYX, interfaceC59144zbW.QKVWgx(), interfaceC59144zbW.RJOkX())) != null) {
                InterfaceC56665yNu interfaceC56665yNuAuCTel = yng.AuCTel();
                Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAuCTel, "");
                if (yYK.EZpvd(interfaceC56665yNuAuCTel)) {
                    return new AbstractC56570yKg.StateListAnimator(taskDescriptionCopydefault);
                }
                InterfaceC56665yNu interfaceC56665yNuAuCTel2 = yng.AuCTel();
                Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAuCTel2, "");
                if (yYK.AEQbTJ(interfaceC56665yNuAuCTel2)) {
                    InterfaceC56660yNp interfaceC56660yNp = (InterfaceC56660yNp) yng;
                    if (interfaceC56660yNp.getFieldNames()) {
                        if (!Intrinsics.EZpvd((java.lang.Object) taskDescriptionCopydefault.KWHzl(), (java.lang.Object) "constructor-impl") || !C59449zhJ.endsWith$default(taskDescriptionCopydefault.AEQbTJ(), ")V", false, 2, null)) {
                            throw new java.lang.IllegalArgumentException(("Invalid signature: " + taskDescriptionCopydefault).toString());
                        }
                    } else {
                        if (!Intrinsics.EZpvd((java.lang.Object) taskDescriptionCopydefault.KWHzl(), (java.lang.Object) "constructor-impl")) {
                            throw new java.lang.IllegalArgumentException(("Invalid signature: " + taskDescriptionCopydefault).toString());
                        }
                        InterfaceC56658yNn interfaceC56658yNnFIwbmz = interfaceC56660yNp.fIwbmz();
                        Intrinsics.checkNotNullExpressionValue(interfaceC56658yNnFIwbmz, "");
                        java.lang.String strKWHzl = C56630yMm.KWHzl((InterfaceC56663yNs) interfaceC56658yNnFIwbmz);
                        if (C59449zhJ.endsWith$default(taskDescriptionCopydefault.AEQbTJ(), ")V", false, 2, null)) {
                            taskDescriptionCopydefault = AbstractC56919yXe.TaskDescription.copy$default(taskDescriptionCopydefault, null, StringsKt__StringsKt.EZpvd(taskDescriptionCopydefault.AEQbTJ(), (java.lang.CharSequence) ExifInterface.GPS_MEASUREMENT_INTERRUPTED) + strKWHzl, 1, null);
                        } else if (!C59449zhJ.endsWith$default(taskDescriptionCopydefault.AEQbTJ(), strKWHzl, false, 2, null)) {
                            throw new java.lang.IllegalArgumentException(("Invalid signature: " + taskDescriptionCopydefault).toString());
                        }
                    }
                    return new AbstractC56570yKg.StateListAnimator(taskDescriptionCopydefault);
                }
                return new AbstractC56570yKg.ActionBar(taskDescriptionCopydefault);
            }
            return KWHzl(yngFJNWhG);
        }
        if (yngFJNWhG instanceof JavaMethodDescriptor) {
            InterfaceC56686yOo interfaceC56686yOoFARcdN = ((JavaMethodDescriptor) yngFJNWhG).fARcdN();
            yTK ytk = interfaceC56686yOoFARcdN instanceof yTK ? (yTK) interfaceC56686yOoFARcdN : null;
            yTY ytyEZpvd = ytk != null ? ytk.EZpvd() : null;
            yQI yqi = ytyEZpvd instanceof yQI ? (yQI) ytyEZpvd : null;
            if (yqi == null || (methodCopydefault = yqi.copydefault()) == null) {
                throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + yngFJNWhG);
            }
            return new AbstractC56570yKg.Application(methodCopydefault);
        }
        if (yngFJNWhG instanceof yRZ) {
            InterfaceC56686yOo interfaceC56686yOoFARcdN2 = ((yRZ) yngFJNWhG).fARcdN();
            yTK ytk2 = interfaceC56686yOoFARcdN2 instanceof yTK ? (yTK) interfaceC56686yOoFARcdN2 : null;
            yTY ytyEZpvd2 = ytk2 != null ? ytk2.EZpvd() : null;
            if (ytyEZpvd2 instanceof yQD) {
                return new AbstractC56570yKg.TaskDescription(((yQD) ytyEZpvd2).copydefault());
            }
            if (ytyEZpvd2 instanceof C56750yQy) {
                C56750yQy c56750yQy = (C56750yQy) ytyEZpvd2;
                if (c56750yQy.AuCTelauCTel()) {
                    return new AbstractC56570yKg.Activity(c56750yQy.KWHzl());
                }
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + yngFJNWhG + " (" + ytyEZpvd2 + ')');
        }
        if (EZpvd(yngFJNWhG)) {
            return KWHzl(yngFJNWhG);
        }
        throw new KotlinReflectionInternalError("Unknown origin of " + yngFJNWhG + " (" + yngFJNWhG.getClass() + ')');
    }

    public final AbstractC56572yKi EZpvd(@NotNull InterfaceC56676yOe interfaceC56676yOe) {
        Intrinsics.checkNotNullParameter(interfaceC56676yOe, "");
        InterfaceC56676yOe interfaceC56676yOeAuCTel = ((InterfaceC56676yOe) yYH.OLrzqt(interfaceC56676yOe)).AhwBna();
        Intrinsics.checkNotNullExpressionValue(interfaceC56676yOeAuCTel, "");
        if (interfaceC56676yOeAuCTel instanceof C59218zcr) {
            C59218zcr c59218zcr = (C59218zcr) interfaceC56676yOeAuCTel;
            ProtoBuf.Property propertyDTwDnp = c59218zcr.QUSxYX();
            GeneratedMessageLite.Activity<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> activity = JvmProtoBuf.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(activity, "");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) yWY.KWHzl(propertyDTwDnp, activity);
            if (jvmPropertySignature != null) {
                return new AbstractC56572yKi.TaskDescription(interfaceC56676yOeAuCTel, propertyDTwDnp, jvmPropertySignature, c59218zcr.QKVWgx(), c59218zcr.RJOkX());
            }
        } else if (interfaceC56676yOeAuCTel instanceof C56788ySi) {
            C56788ySi c56788ySi = (C56788ySi) interfaceC56676yOeAuCTel;
            InterfaceC56686yOo interfaceC56686yOoFARcdN = c56788ySi.fARcdN();
            yTK ytk = interfaceC56686yOoFARcdN instanceof yTK ? (yTK) interfaceC56686yOoFARcdN : null;
            yTY ytyEZpvd = ytk != null ? ytk.EZpvd() : null;
            if (ytyEZpvd instanceof yQE) {
                return new AbstractC56572yKi.Activity(((yQE) ytyEZpvd).copydefault());
            }
            if (ytyEZpvd instanceof yQI) {
                java.lang.reflect.Method methodCopydefault = ((yQI) ytyEZpvd).copydefault();
                InterfaceC56680yOi fieldNames = c56788ySi.getFieldNames();
                InterfaceC56686yOo interfaceC56686yOoFARcdN2 = fieldNames != null ? fieldNames.fARcdN() : null;
                yTK ytk2 = interfaceC56686yOoFARcdN2 instanceof yTK ? (yTK) interfaceC56686yOoFARcdN2 : null;
                yTY ytyEZpvd2 = ytk2 != null ? ytk2.EZpvd() : null;
                yQI yqi = ytyEZpvd2 instanceof yQI ? (yQI) ytyEZpvd2 : null;
                return new AbstractC56572yKi.StateListAnimator(methodCopydefault, yqi != null ? yqi.copydefault() : null);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + interfaceC56676yOeAuCTel + " (source = " + ytyEZpvd + ')');
        }
        InterfaceC56675yOd interfaceC56675yOdEjfBZ = interfaceC56676yOeAuCTel.ejfBZ();
        Intrinsics.copydefault(interfaceC56675yOdEjfBZ);
        AbstractC56570yKg.StateListAnimator stateListAnimatorKWHzl = KWHzl(interfaceC56675yOdEjfBZ);
        InterfaceC56680yOi fieldNames2 = interfaceC56676yOeAuCTel.getFieldNames();
        return new AbstractC56572yKi.ActionBar(stateListAnimatorKWHzl, fieldNames2 != null ? KWHzl(fieldNames2) : null);
    }

    public final boolean EZpvd(yNG yng) {
        if (yYI.KWHzl(yng) || yYI.copydefault(yng)) {
            return true;
        }
        return Intrinsics.EZpvd(yng.bR_(), yMK.AEQbTJ.EZpvd()) && yng.fetchVPNInfo().isEmpty();
    }

    public final AbstractC56570yKg.StateListAnimator KWHzl(yNG yng) {
        return new AbstractC56570yKg.StateListAnimator(new AbstractC56919yXe.TaskDescription(OLrzqt(yng), C56896yWi.computeJvmDescriptor$default(yng, false, false, 1, null)));
    }

    public final java.lang.String OLrzqt(CallableMemberDescriptor callableMemberDescriptor) {
        java.lang.String strOLrzqt = yRG.OLrzqt(callableMemberDescriptor);
        if (strOLrzqt != null) {
            return strOLrzqt;
        }
        if (callableMemberDescriptor instanceof InterfaceC56675yOd) {
            java.lang.String strAEQbTJ = yZE.AEQbTJ(callableMemberDescriptor).bR_().AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
            return C56777yRy.copydefault(strAEQbTJ);
        }
        if (callableMemberDescriptor instanceof InterfaceC56680yOi) {
            java.lang.String strAEQbTJ2 = yZE.AEQbTJ(callableMemberDescriptor).bR_().AEQbTJ();
            Intrinsics.checkNotNullExpressionValue(strAEQbTJ2, "");
            return C56777yRy.OLrzqt(strAEQbTJ2);
        }
        java.lang.String strAEQbTJ3 = callableMemberDescriptor.bR_().AEQbTJ();
        Intrinsics.checkNotNullExpressionValue(strAEQbTJ3, "");
        return strAEQbTJ3;
    }

    public final C56929yXo KWHzl(@NotNull java.lang.Class<?> cls) {
        C56929yXo c56929yXoKWHzl;
        Intrinsics.checkNotNullParameter(cls, "");
        if (cls.isArray()) {
            java.lang.Class<?> componentType = cls.getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "");
            PrimitiveType primitiveTypeEZpvd = EZpvd(componentType);
            if (primitiveTypeEZpvd != null) {
                return new C56929yXo(yMB.AEQbTJ, primitiveTypeEZpvd.getArrayTypeName());
            }
            return C56929yXo.AEQbTJ.KWHzl(yMB.Application.ejfBZ.djBIcL());
        }
        if (Intrinsics.EZpvd(cls, java.lang.Void.TYPE)) {
            return copydefault;
        }
        PrimitiveType primitiveTypeEZpvd2 = EZpvd(cls);
        if (primitiveTypeEZpvd2 != null) {
            return new C56929yXo(yMB.AEQbTJ, primitiveTypeEZpvd2.getTypeName());
        }
        C56929yXo c56929yXoAEQbTJ = C56743yQr.AEQbTJ(cls);
        return (c56929yXoAEQbTJ.AhwBna() || (c56929yXoKWHzl = yML.OLrzqt.KWHzl(c56929yXoAEQbTJ.AEQbTJ())) == null) ? c56929yXoAEQbTJ : c56929yXoKWHzl;
    }

    public final PrimitiveType EZpvd(java.lang.Class<?> cls) {
        if (cls.isPrimitive()) {
            return JvmPrimitiveType.get(cls.getSimpleName()).getPrimitiveType();
        }
        return null;
    }
}
