package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import o.AbstractC59164zbq;
import o.InterfaceC56657yNm;
import o.yOL;
import o.yWP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zbb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59149zbb {
    public final C59080zaL EZpvd;
    public final C59087zaS OLrzqt;

    public final int EZpvd(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    public C59149zbb(@NotNull C59087zaS c59087zaS) {
        Intrinsics.checkNotNullParameter(c59087zaS, "");
        this.OLrzqt = c59087zaS;
        this.EZpvd = new C59080zaL(c59087zaS.EZpvd().fetchVPNInfo(), c59087zaS.EZpvd().fARcdN());
    }

    public final InterfaceC56676yOe OLrzqt(@NotNull ProtoBuf.Property property) {
        ProtoBuf.Property property2;
        yOL yolOLrzqt;
        C59218zcr c59218zcr;
        InterfaceC56679yOh interfaceC56679yOhCopydefault;
        yPL yplCopydefault;
        yPL ypl;
        boolean z;
        yPN ypnEZpvd;
        AbstractC59233zdF abstractC59233zdFOLrzqt;
        Intrinsics.checkNotNullParameter(property, "");
        int flags = property.hasFlags() ? property.getFlags() : EZpvd(property.getOldFlags());
        InterfaceC56665yNu interfaceC56665yNuKWHzl = this.OLrzqt.KWHzl();
        yOL yolAEQbTJ = AEQbTJ(property, flags, AnnotatedCallableKind.PROPERTY);
        C59168zbu c59168zbu = C59168zbu.copydefault;
        Modality modalityCopydefault = c59168zbu.copydefault(yWP.ORxRYg.KWHzl(flags));
        yNC yncAEQbTJ = C59167zbt.AEQbTJ(c59168zbu, yWP.RJOkX.KWHzl(flags));
        java.lang.Boolean boolKWHzl = yWP.DTwDnp.KWHzl(flags);
        Intrinsics.checkNotNullExpressionValue(boolKWHzl, "");
        boolean zBooleanValue = boolKWHzl.booleanValue();
        C56935yXu c56935yXuOLrzqt = C59160zbm.OLrzqt(this.OLrzqt.copydefault(), property.getName());
        CallableMemberDescriptor.Kind kindEZpvd = C59167zbt.EZpvd(c59168zbu, yWP.QOLQEE.KWHzl(flags));
        java.lang.Boolean boolKWHzl2 = yWP.zLjUOn.KWHzl(flags);
        Intrinsics.checkNotNullExpressionValue(boolKWHzl2, "");
        boolean zBooleanValue2 = boolKWHzl2.booleanValue();
        java.lang.Boolean boolKWHzl3 = yWP.valueOf.KWHzl(flags);
        Intrinsics.checkNotNullExpressionValue(boolKWHzl3, "");
        boolean zBooleanValue3 = boolKWHzl3.booleanValue();
        java.lang.Boolean boolKWHzl4 = yWP.AuCTel.KWHzl(flags);
        Intrinsics.checkNotNullExpressionValue(boolKWHzl4, "");
        boolean zBooleanValue4 = boolKWHzl4.booleanValue();
        java.lang.Boolean boolKWHzl5 = yWP.AkhnZx.KWHzl(flags);
        Intrinsics.checkNotNullExpressionValue(boolKWHzl5, "");
        boolean zBooleanValue5 = boolKWHzl5.booleanValue();
        java.lang.Boolean boolKWHzl6 = yWP.fARcdN.KWHzl(flags);
        Intrinsics.checkNotNullExpressionValue(boolKWHzl6, "");
        int i = flags;
        C59218zcr c59218zcr2 = new C59218zcr(interfaceC56665yNuKWHzl, null, yolAEQbTJ, modalityCopydefault, yncAEQbTJ, zBooleanValue, c56935yXuOLrzqt, kindEZpvd, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, boolKWHzl6.booleanValue(), property, this.OLrzqt.copydefault(), this.OLrzqt.gEmmrt(), this.OLrzqt.djBIcL(), this.OLrzqt.AEQbTJ());
        C59087zaS c59087zaS = this.OLrzqt;
        java.util.List<ProtoBuf.TypeParameter> typeParameterList = property.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "");
        C59087zaS c59087zaSChildContext$default = C59087zaS.childContext$default(c59087zaS, c59218zcr2, typeParameterList, null, null, null, null, 60, null);
        java.lang.Boolean boolKWHzl7 = yWP.AhwBna.KWHzl(i);
        Intrinsics.checkNotNullExpressionValue(boolKWHzl7, "");
        boolean zBooleanValue6 = boolKWHzl7.booleanValue();
        if (zBooleanValue6 && yWU.OLrzqt(property)) {
            property2 = property;
            yolOLrzqt = OLrzqt(property2, AnnotatedCallableKind.PROPERTY_GETTER);
        } else {
            property2 = property;
            yolOLrzqt = yOL.KWHzl.OLrzqt();
        }
        AbstractC59233zdF abstractC59233zdFOLrzqt2 = c59087zaSChildContext$default.AYXKKw().OLrzqt(yWU.copydefault(property2, this.OLrzqt.gEmmrt()));
        java.util.List<InterfaceC56691yOt> listAEQbTJ = c59087zaSChildContext$default.AYXKKw().AEQbTJ();
        InterfaceC56679yOh interfaceC56679yOhCopydefault2 = copydefault();
        ProtoBuf.Type typeKWHzl = yWU.KWHzl(property2, this.OLrzqt.gEmmrt());
        if (typeKWHzl == null || (abstractC59233zdFOLrzqt = c59087zaSChildContext$default.AYXKKw().OLrzqt(typeKWHzl)) == null) {
            c59218zcr = c59218zcr2;
            interfaceC56679yOhCopydefault = null;
        } else {
            c59218zcr = c59218zcr2;
            interfaceC56679yOhCopydefault = yYI.copydefault(c59218zcr, abstractC59233zdFOLrzqt, yolOLrzqt);
        }
        java.util.List<ProtoBuf.Type> listOLrzqt = yWU.OLrzqt(property2, this.OLrzqt.gEmmrt());
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        int i2 = 0;
        for (java.lang.Object obj : listOLrzqt) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            arrayList.add(OLrzqt((ProtoBuf.Type) obj, c59087zaSChildContext$default, c59218zcr, i2));
            i2++;
        }
        c59218zcr.AEQbTJ(abstractC59233zdFOLrzqt2, listAEQbTJ, interfaceC56679yOhCopydefault2, interfaceC56679yOhCopydefault, arrayList);
        java.lang.Boolean boolKWHzl8 = yWP.copydefault.KWHzl(i);
        Intrinsics.checkNotNullExpressionValue(boolKWHzl8, "");
        boolean zBooleanValue7 = boolKWHzl8.booleanValue();
        yWP.StateListAnimator<ProtoBuf.Visibility> stateListAnimator = yWP.RJOkX;
        ProtoBuf.Visibility visibilityKWHzl = stateListAnimator.KWHzl(i);
        yWP.StateListAnimator<ProtoBuf.Modality> stateListAnimator2 = yWP.ORxRYg;
        int iEZpvd = yWP.EZpvd(zBooleanValue7, visibilityKWHzl, stateListAnimator2.KWHzl(i), false, false, false);
        if (zBooleanValue6) {
            int getterFlags = property.hasGetterFlags() ? property.getGetterFlags() : iEZpvd;
            java.lang.Boolean boolKWHzl9 = yWP.AuCTelauCTel.KWHzl(getterFlags);
            Intrinsics.checkNotNullExpressionValue(boolKWHzl9, "");
            boolean zBooleanValue8 = boolKWHzl9.booleanValue();
            java.lang.Boolean boolKWHzl10 = yWP.fIwbmz.KWHzl(getterFlags);
            Intrinsics.checkNotNullExpressionValue(boolKWHzl10, "");
            boolean zBooleanValue9 = boolKWHzl10.booleanValue();
            java.lang.Boolean boolKWHzl11 = yWP.hDKMBd.KWHzl(getterFlags);
            Intrinsics.checkNotNullExpressionValue(boolKWHzl11, "");
            boolean zBooleanValue10 = boolKWHzl11.booleanValue();
            yOL yolAEQbTJ2 = AEQbTJ(property2, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
            if (zBooleanValue8) {
                C59168zbu c59168zbu2 = C59168zbu.copydefault;
                yplCopydefault = new yPL(c59218zcr, yolAEQbTJ2, c59168zbu2.copydefault(stateListAnimator2.KWHzl(getterFlags)), C59167zbt.AEQbTJ(c59168zbu2, stateListAnimator.KWHzl(getterFlags)), !zBooleanValue8, zBooleanValue9, zBooleanValue10, c59218zcr.bW_(), null, InterfaceC56686yOo.copydefault);
            } else {
                yplCopydefault = yYI.copydefault(c59218zcr, yolAEQbTJ2);
                Intrinsics.copydefault(yplCopydefault);
            }
            yplCopydefault.OLrzqt(c59218zcr.gEmmrt());
        } else {
            yplCopydefault = null;
        }
        if (yWP.djBIcL.KWHzl(i).booleanValue()) {
            if (property.hasSetterFlags()) {
                iEZpvd = property.getSetterFlags();
            }
            java.lang.Boolean boolKWHzl12 = yWP.AuCTelauCTel.KWHzl(iEZpvd);
            Intrinsics.checkNotNullExpressionValue(boolKWHzl12, "");
            boolean zBooleanValue11 = boolKWHzl12.booleanValue();
            java.lang.Boolean boolKWHzl13 = yWP.fIwbmz.KWHzl(iEZpvd);
            Intrinsics.checkNotNullExpressionValue(boolKWHzl13, "");
            boolean zBooleanValue12 = boolKWHzl13.booleanValue();
            java.lang.Boolean boolKWHzl14 = yWP.hDKMBd.KWHzl(iEZpvd);
            Intrinsics.checkNotNullExpressionValue(boolKWHzl14, "");
            boolean zBooleanValue13 = boolKWHzl14.booleanValue();
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            yOL yolAEQbTJ3 = AEQbTJ(property2, iEZpvd, annotatedCallableKind);
            if (zBooleanValue11) {
                C59168zbu c59168zbu3 = C59168zbu.copydefault;
                yPN ypn = new yPN(c59218zcr, yolAEQbTJ3, c59168zbu3.copydefault(stateListAnimator2.KWHzl(iEZpvd)), C59167zbt.AEQbTJ(c59168zbu3, stateListAnimator.KWHzl(iEZpvd)), !zBooleanValue11, zBooleanValue12, zBooleanValue13, c59218zcr.bW_(), null, InterfaceC56686yOo.copydefault);
                ypl = yplCopydefault;
                z = false;
                ypn.OLrzqt((InterfaceC56695yOx) CollectionsKt___CollectionsKt.gHZMYf(C59087zaS.childContext$default(c59087zaSChildContext$default, ypn, yDY.AhwBna(), null, null, null, null, 60, null).OLrzqt().OLrzqt(C56402yEa.EZpvd(property.getSetterValueParameter()), property2, annotatedCallableKind)));
                ypnEZpvd = ypn;
            } else {
                ypl = yplCopydefault;
                z = false;
                ypnEZpvd = yYI.EZpvd(c59218zcr, yolAEQbTJ3, yOL.KWHzl.OLrzqt());
                Intrinsics.copydefault(ypnEZpvd);
            }
        } else {
            ypl = yplCopydefault;
            z = false;
            ypnEZpvd = null;
        }
        if (yWP.KWHzl.KWHzl(i).booleanValue()) {
            c59218zcr.OLrzqt(new C59158zbk(this, property2, c59218zcr));
        }
        InterfaceC56665yNu interfaceC56665yNuKWHzl2 = this.OLrzqt.KWHzl();
        InterfaceC56658yNn interfaceC56658yNn = interfaceC56665yNuKWHzl2 instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56665yNuKWHzl2 : null;
        if ((interfaceC56658yNn != null ? interfaceC56658yNn.DbNXlk() : null) == ClassKind.ANNOTATION_CLASS) {
            c59218zcr.OLrzqt(new C59155zbh(this, property2, c59218zcr));
        }
        c59218zcr.copydefault(ypl, ypnEZpvd, new C56715yPq(EZpvd(property2, z), c59218zcr), new C56715yPq(EZpvd(property2, true), c59218zcr));
        return c59218zcr;
    }

    public static final InterfaceC59180zcF KWHzl(C59149zbb c59149zbb, ProtoBuf.Property property, C59218zcr c59218zcr) {
        return c59149zbb.OLrzqt.valueOf().copydefault(new C59162zbo(c59149zbb, property, c59218zcr));
    }

    public static final AbstractC56975yZg gEmmrt(C59149zbb c59149zbb, ProtoBuf.Property property, C59218zcr c59218zcr) {
        AbstractC59164zbq abstractC59164zbqCopydefault = c59149zbb.copydefault(c59149zbb.OLrzqt.KWHzl());
        Intrinsics.copydefault(abstractC59164zbqCopydefault);
        InterfaceC59077zaI<yOJ, AbstractC56975yZg<?>> interfaceC59077zaICopydefault = c59149zbb.OLrzqt.EZpvd().copydefault();
        AbstractC59233zdF abstractC59233zdFGEmmrt = c59218zcr.gEmmrt();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFGEmmrt, "");
        return interfaceC59077zaICopydefault.KWHzl(abstractC59164zbqCopydefault, property, abstractC59233zdFGEmmrt);
    }

    public static final InterfaceC59180zcF djBIcL(C59149zbb c59149zbb, ProtoBuf.Property property, C59218zcr c59218zcr) {
        return c59149zbb.OLrzqt.valueOf().copydefault(new C59161zbn(c59149zbb, property, c59218zcr));
    }

    public static final AbstractC56975yZg AhwBna(C59149zbb c59149zbb, ProtoBuf.Property property, C59218zcr c59218zcr) {
        AbstractC59164zbq abstractC59164zbqCopydefault = c59149zbb.copydefault(c59149zbb.OLrzqt.KWHzl());
        Intrinsics.copydefault(abstractC59164zbqCopydefault);
        InterfaceC59077zaI<yOJ, AbstractC56975yZg<?>> interfaceC59077zaICopydefault = c59149zbb.OLrzqt.EZpvd().copydefault();
        AbstractC59233zdF abstractC59233zdFGEmmrt = c59218zcr.gEmmrt();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFGEmmrt, "");
        return interfaceC59077zaICopydefault.EZpvd(abstractC59164zbqCopydefault, property, abstractC59233zdFGEmmrt);
    }

    public final void KWHzl(C59221zcu c59221zcu, InterfaceC56679yOh interfaceC56679yOh, InterfaceC56679yOh interfaceC56679yOh2, java.util.List<? extends InterfaceC56679yOh> list, java.util.List<? extends InterfaceC56691yOt> list2, java.util.List<? extends InterfaceC56695yOx> list3, AbstractC59233zdF abstractC59233zdF, Modality modality, yNC ync, java.util.Map<? extends InterfaceC56657yNm.Application<?>, ?> map) {
        c59221zcu.EZpvd(interfaceC56679yOh, interfaceC56679yOh2, list, list2, list3, abstractC59233zdF, modality, ync, map);
    }

    public final InterfaceC56687yOp OLrzqt(@NotNull ProtoBuf.Function function) {
        yOL yolOLrzqt;
        yWX ywxDjBIcL;
        AbstractC59233zdF abstractC59233zdFOLrzqt;
        Intrinsics.checkNotNullParameter(function, "");
        int flags = function.hasFlags() ? function.getFlags() : EZpvd(function.getOldFlags());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        yOL yolAEQbTJ = AEQbTJ(function, flags, annotatedCallableKind);
        if (yWU.AEQbTJ(function)) {
            yolOLrzqt = OLrzqt(function, annotatedCallableKind);
        } else {
            yolOLrzqt = yOL.KWHzl.OLrzqt();
        }
        if (Intrinsics.EZpvd(yZE.EZpvd(this.OLrzqt.KWHzl()).KWHzl(C59160zbm.OLrzqt(this.OLrzqt.copydefault(), function.getName())), C59166zbs.AEQbTJ)) {
            ywxDjBIcL = yWX.EZpvd.KWHzl();
        } else {
            ywxDjBIcL = this.OLrzqt.djBIcL();
        }
        C59221zcu c59221zcu = new C59221zcu(this.OLrzqt.KWHzl(), null, yolAEQbTJ, C59160zbm.OLrzqt(this.OLrzqt.copydefault(), function.getName()), C59167zbt.EZpvd(C59168zbu.copydefault, yWP.QOLQEE.KWHzl(flags)), function, this.OLrzqt.copydefault(), this.OLrzqt.gEmmrt(), ywxDjBIcL, this.OLrzqt.AEQbTJ(), null, 1024, null);
        C59087zaS c59087zaS = this.OLrzqt;
        java.util.List<ProtoBuf.TypeParameter> typeParameterList = function.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "");
        C59087zaS c59087zaSChildContext$default = C59087zaS.childContext$default(c59087zaS, c59221zcu, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type typeOLrzqt = yWU.OLrzqt(function, this.OLrzqt.gEmmrt());
        InterfaceC56679yOh interfaceC56679yOhCopydefault = (typeOLrzqt == null || (abstractC59233zdFOLrzqt = c59087zaSChildContext$default.AYXKKw().OLrzqt(typeOLrzqt)) == null) ? null : yYI.copydefault(c59221zcu, abstractC59233zdFOLrzqt, yolOLrzqt);
        InterfaceC56679yOh interfaceC56679yOhCopydefault2 = copydefault();
        java.util.List<ProtoBuf.Type> listEZpvd = yWU.EZpvd(function, this.OLrzqt.gEmmrt());
        java.util.List<? extends InterfaceC56679yOh> arrayList = new java.util.ArrayList<>();
        int i = 0;
        for (java.lang.Object obj : listEZpvd) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            InterfaceC56679yOh interfaceC56679yOhOLrzqt = OLrzqt((ProtoBuf.Type) obj, c59087zaSChildContext$default, c59221zcu, i);
            if (interfaceC56679yOhOLrzqt != null) {
                arrayList.add(interfaceC56679yOhOLrzqt);
            }
            i++;
        }
        java.util.List<InterfaceC56691yOt> listAEQbTJ = c59087zaSChildContext$default.AYXKKw().AEQbTJ();
        C59149zbb c59149zbbOLrzqt = c59087zaSChildContext$default.OLrzqt();
        java.util.List<ProtoBuf.ValueParameter> valueParameterList = function.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "");
        java.util.List<InterfaceC56695yOx> listOLrzqt = c59149zbbOLrzqt.OLrzqt(valueParameterList, function, AnnotatedCallableKind.FUNCTION);
        AbstractC59233zdF abstractC59233zdFOLrzqt2 = c59087zaSChildContext$default.AYXKKw().OLrzqt(yWU.KWHzl(function, this.OLrzqt.gEmmrt()));
        C59168zbu c59168zbu = C59168zbu.copydefault;
        KWHzl(c59221zcu, interfaceC56679yOhCopydefault, interfaceC56679yOhCopydefault2, arrayList, listAEQbTJ, listOLrzqt, abstractC59233zdFOLrzqt2, c59168zbu.copydefault(yWP.ORxRYg.KWHzl(flags)), C59167zbt.AEQbTJ(c59168zbu, yWP.RJOkX.KWHzl(flags)), C56424yEw.KWHzl());
        c59221zcu.AYXKKw(yWP.AxsJAY.KWHzl(flags).booleanValue());
        c59221zcu.gEmmrt(yWP.iwGUEr.KWHzl(flags).booleanValue());
        c59221zcu.AEQbTJ(yWP.ejfBZ.KWHzl(flags).booleanValue());
        c59221zcu.valueOf(yWP.getNewProxyInstance.KWHzl(flags).booleanValue());
        c59221zcu.isConnected(yWP.gHZMYf.KWHzl(flags).booleanValue());
        c59221zcu.values(yWP.zuBGHE.KWHzl(flags).booleanValue());
        c59221zcu.OLrzqt(yWP.values.KWHzl(flags).booleanValue());
        c59221zcu.EZpvd(!yWP.uzCIH.KWHzl(flags).booleanValue());
        kotlin.Pair<InterfaceC56657yNm.Application<?>, java.lang.Object> pairOLrzqt = this.OLrzqt.EZpvd().djBIcL().OLrzqt(function, c59221zcu, this.OLrzqt.gEmmrt(), c59087zaSChildContext$default.AYXKKw());
        if (pairOLrzqt != null) {
            c59221zcu.copydefault(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
        }
        return c59221zcu;
    }

    public final InterfaceC56690yOs OLrzqt(@NotNull ProtoBuf.TypeAlias typeAlias) {
        Intrinsics.checkNotNullParameter(typeAlias, "");
        yOL.Application application = yOL.KWHzl;
        java.util.List<ProtoBuf.Annotation> annotationList = typeAlias.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(annotationList, 10));
        for (ProtoBuf.Annotation annotation : annotationList) {
            C59080zaL c59080zaL = this.EZpvd;
            Intrinsics.copydefault(annotation);
            arrayList.add(c59080zaL.copydefault(annotation, this.OLrzqt.copydefault()));
        }
        C59222zcv c59222zcv = new C59222zcv(this.OLrzqt.valueOf(), this.OLrzqt.KWHzl(), application.EZpvd(arrayList), C59160zbm.OLrzqt(this.OLrzqt.copydefault(), typeAlias.getName()), C59167zbt.AEQbTJ(C59168zbu.copydefault, yWP.RJOkX.KWHzl(typeAlias.getFlags())), typeAlias, this.OLrzqt.copydefault(), this.OLrzqt.gEmmrt(), this.OLrzqt.djBIcL(), this.OLrzqt.AEQbTJ());
        C59087zaS c59087zaS = this.OLrzqt;
        java.util.List<ProtoBuf.TypeParameter> typeParameterList = typeAlias.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "");
        C59087zaS c59087zaSChildContext$default = C59087zaS.childContext$default(c59087zaS, c59222zcv, typeParameterList, null, null, null, null, 60, null);
        c59222zcv.KWHzl(c59087zaSChildContext$default.AYXKKw().AEQbTJ(), c59087zaSChildContext$default.AYXKKw().EZpvd(yWU.OLrzqt(typeAlias, this.OLrzqt.gEmmrt()), false), c59087zaSChildContext$default.AYXKKw().EZpvd(yWU.EZpvd(typeAlias, this.OLrzqt.gEmmrt()), false));
        return c59222zcv;
    }

    public final InterfaceC56679yOh copydefault() {
        InterfaceC56665yNu interfaceC56665yNuKWHzl = this.OLrzqt.KWHzl();
        InterfaceC56658yNn interfaceC56658yNn = interfaceC56665yNuKWHzl instanceof InterfaceC56658yNn ? (InterfaceC56658yNn) interfaceC56665yNuKWHzl : null;
        if (interfaceC56658yNn != null) {
            return interfaceC56658yNn.DTwDnp();
        }
        return null;
    }

    public final InterfaceC56656yNl EZpvd(@NotNull ProtoBuf.Constructor constructor, boolean z) {
        Intrinsics.checkNotNullParameter(constructor, "");
        InterfaceC56665yNu interfaceC56665yNuKWHzl = this.OLrzqt.KWHzl();
        Intrinsics.copydefault(interfaceC56665yNuKWHzl, "");
        InterfaceC56658yNn interfaceC56658yNn = (InterfaceC56658yNn) interfaceC56665yNuKWHzl;
        int flags = constructor.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        C59128zbG c59128zbG = new C59128zbG(interfaceC56658yNn, null, AEQbTJ(constructor, flags, annotatedCallableKind), z, CallableMemberDescriptor.Kind.DECLARATION, constructor, this.OLrzqt.copydefault(), this.OLrzqt.gEmmrt(), this.OLrzqt.djBIcL(), this.OLrzqt.AEQbTJ(), null, 1024, null);
        C59149zbb c59149zbbOLrzqt = C59087zaS.childContext$default(this.OLrzqt, c59128zbG, yDY.AhwBna(), null, null, null, null, 60, null).OLrzqt();
        java.util.List<ProtoBuf.ValueParameter> valueParameterList = constructor.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "");
        c59128zbG.AEQbTJ(c59149zbbOLrzqt.OLrzqt(valueParameterList, constructor, annotatedCallableKind), C59167zbt.AEQbTJ(C59168zbu.copydefault, yWP.RJOkX.KWHzl(constructor.getFlags())));
        c59128zbG.EZpvd(interfaceC56658yNn.bQ_());
        c59128zbG.OLrzqt(interfaceC56658yNn.zLjUOn());
        c59128zbG.EZpvd(!yWP.gEmmrt.KWHzl(constructor.getFlags()).booleanValue());
        return c59128zbG;
    }

    public final yOL AEQbTJ(yXQ yxq, int i, AnnotatedCallableKind annotatedCallableKind) {
        if (!yWP.copydefault.KWHzl(i).booleanValue()) {
            return yOL.KWHzl.OLrzqt();
        }
        return new C59220zct(this.OLrzqt.valueOf(), new C59156zbi(this, yxq, annotatedCallableKind));
    }

    public static final java.util.List KWHzl(C59149zbb c59149zbb, yXQ yxq, AnnotatedCallableKind annotatedCallableKind) {
        AbstractC59164zbq abstractC59164zbqCopydefault = c59149zbb.copydefault(c59149zbb.OLrzqt.KWHzl());
        java.util.List listAxsJAYsNCnLh = abstractC59164zbqCopydefault != null ? CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c59149zbb.OLrzqt.EZpvd().copydefault().AEQbTJ(abstractC59164zbqCopydefault, yxq, annotatedCallableKind)) : null;
        return listAxsJAYsNCnLh == null ? yDY.AhwBna() : listAxsJAYsNCnLh;
    }

    public final yOL EZpvd(ProtoBuf.Property property, boolean z) {
        if (!yWP.copydefault.KWHzl(property.getFlags()).booleanValue()) {
            return yOL.KWHzl.OLrzqt();
        }
        return new C59220zct(this.OLrzqt.valueOf(), new C59157zbj(this, z, property));
    }

    public static final java.util.List OLrzqt(C59149zbb c59149zbb, boolean z, ProtoBuf.Property property) {
        java.util.List listAxsJAYsNCnLh;
        AbstractC59164zbq abstractC59164zbqCopydefault = c59149zbb.copydefault(c59149zbb.OLrzqt.KWHzl());
        if (abstractC59164zbqCopydefault == null) {
            listAxsJAYsNCnLh = null;
        } else if (z) {
            listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c59149zbb.OLrzqt.EZpvd().copydefault().EZpvd(abstractC59164zbqCopydefault, property));
        } else {
            listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c59149zbb.OLrzqt.EZpvd().copydefault().AEQbTJ(abstractC59164zbqCopydefault, property));
        }
        return listAxsJAYsNCnLh == null ? yDY.AhwBna() : listAxsJAYsNCnLh;
    }

    public final yOL OLrzqt(yXQ yxq, AnnotatedCallableKind annotatedCallableKind) {
        return new C59129zbH(this.OLrzqt.valueOf(), new C59154zbg(this, yxq, annotatedCallableKind));
    }

    public static final java.util.List AEQbTJ(C59149zbb c59149zbb, yXQ yxq, AnnotatedCallableKind annotatedCallableKind) {
        AbstractC59164zbq abstractC59164zbqCopydefault = c59149zbb.copydefault(c59149zbb.OLrzqt.KWHzl());
        java.util.List<yOJ> listOLrzqt = abstractC59164zbqCopydefault != null ? c59149zbb.OLrzqt.EZpvd().copydefault().OLrzqt(abstractC59164zbqCopydefault, yxq, annotatedCallableKind) : null;
        return listOLrzqt == null ? yDY.AhwBna() : listOLrzqt;
    }

    public final java.util.List<InterfaceC56695yOx> OLrzqt(java.util.List<ProtoBuf.ValueParameter> list, yXQ yxq, AnnotatedCallableKind annotatedCallableKind) {
        yOL yolOLrzqt;
        InterfaceC56665yNu interfaceC56665yNuKWHzl = this.OLrzqt.KWHzl();
        Intrinsics.copydefault(interfaceC56665yNuKWHzl, "");
        InterfaceC56657yNm interfaceC56657yNm = (InterfaceC56657yNm) interfaceC56665yNuKWHzl;
        InterfaceC56665yNu interfaceC56665yNuAuCTel = interfaceC56657yNm.AuCTel();
        Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAuCTel, "");
        AbstractC59164zbq abstractC59164zbqCopydefault = copydefault(interfaceC56665yNuAuCTel);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            if (abstractC59164zbqCopydefault != null && yWP.copydefault.KWHzl(flags).booleanValue()) {
                yolOLrzqt = new C59220zct(this.OLrzqt.valueOf(), new C59163zbp(this, abstractC59164zbqCopydefault, yxq, annotatedCallableKind, i, valueParameter));
            } else {
                yolOLrzqt = yOL.KWHzl.OLrzqt();
            }
            yOL yol = yolOLrzqt;
            C56935yXu c56935yXuOLrzqt = C59160zbm.OLrzqt(this.OLrzqt.copydefault(), valueParameter.getName());
            AbstractC59233zdF abstractC59233zdFOLrzqt = this.OLrzqt.AYXKKw().OLrzqt(yWU.copydefault(valueParameter, this.OLrzqt.gEmmrt()));
            java.lang.Boolean boolKWHzl = yWP.AEQbTJ.KWHzl(flags);
            Intrinsics.checkNotNullExpressionValue(boolKWHzl, "");
            boolean zBooleanValue = boolKWHzl.booleanValue();
            java.lang.Boolean boolKWHzl2 = yWP.DbNXlk.KWHzl(flags);
            Intrinsics.checkNotNullExpressionValue(boolKWHzl2, "");
            boolean zBooleanValue2 = boolKWHzl2.booleanValue();
            java.lang.Boolean boolKWHzl3 = yWP.wlaJM.KWHzl(flags);
            Intrinsics.checkNotNullExpressionValue(boolKWHzl3, "");
            boolean zBooleanValue3 = boolKWHzl3.booleanValue();
            ProtoBuf.Type typeKWHzl = yWU.KWHzl(valueParameter, this.OLrzqt.gEmmrt());
            AbstractC59233zdF abstractC59233zdFOLrzqt2 = typeKWHzl != null ? this.OLrzqt.AYXKKw().OLrzqt(typeKWHzl) : null;
            InterfaceC56686yOo interfaceC56686yOo = InterfaceC56686yOo.copydefault;
            Intrinsics.checkNotNullExpressionValue(interfaceC56686yOo, "");
            java.util.ArrayList arrayList2 = arrayList;
            arrayList2.add(new yPP(interfaceC56657yNm, null, i, yol, c56935yXuOLrzqt, abstractC59233zdFOLrzqt, zBooleanValue, zBooleanValue2, zBooleanValue3, abstractC59233zdFOLrzqt2, interfaceC56686yOo));
            i++;
            arrayList = arrayList2;
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    public static final java.util.List copydefault(C59149zbb c59149zbb, AbstractC59164zbq abstractC59164zbq, yXQ yxq, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter) {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c59149zbb.OLrzqt.EZpvd().copydefault().AEQbTJ(abstractC59164zbq, yxq, annotatedCallableKind, i, valueParameter));
    }

    public final AbstractC59164zbq copydefault(InterfaceC56665yNu interfaceC56665yNu) {
        if (interfaceC56665yNu instanceof yNW) {
            return new AbstractC59164zbq.TaskDescription(((yNW) interfaceC56665yNu).KWHzl(), this.OLrzqt.copydefault(), this.OLrzqt.gEmmrt(), this.OLrzqt.AEQbTJ());
        }
        if (interfaceC56665yNu instanceof C59127zbF) {
            return ((C59127zbF) interfaceC56665yNu).QVAiDq();
        }
        return null;
    }

    public final InterfaceC56679yOh OLrzqt(ProtoBuf.Type type, C59087zaS c59087zaS, InterfaceC56657yNm interfaceC56657yNm, int i) {
        return yYI.EZpvd(interfaceC56657yNm, c59087zaS.AYXKKw().OLrzqt(type), (C56935yXu) null, yOL.KWHzl.OLrzqt(), i);
    }
}
