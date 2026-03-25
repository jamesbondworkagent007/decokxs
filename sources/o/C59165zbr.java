package o;

import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import o.C56929yXo;
import o.C59265zdl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zbr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59165zbr {
    public final Function1<java.lang.Integer, InterfaceC56663yNs> AEQbTJ;
    public final Function1<java.lang.Integer, InterfaceC56663yNs> AhwBna;
    public final java.lang.String EZpvd;
    public final C59165zbr KWHzl;
    public final C59087zaS OLrzqt;
    public final java.lang.String copydefault;
    public final java.util.Map<java.lang.Integer, InterfaceC56691yOt> djBIcL;

    public C59165zbr(@NotNull C59087zaS c59087zaS, C59165zbr c59165zbr, @NotNull java.util.List<ProtoBuf.TypeParameter> list, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.util.Map<java.lang.Integer, InterfaceC56691yOt> linkedHashMap;
        Intrinsics.checkNotNullParameter(c59087zaS, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = c59087zaS;
        this.KWHzl = c59165zbr;
        this.copydefault = str;
        this.EZpvd = str2;
        this.AEQbTJ = c59087zaS.valueOf().OLrzqt(new C59173zbz(this));
        this.AhwBna = c59087zaS.valueOf().OLrzqt(new C59172zby(this));
        if (list.isEmpty()) {
            linkedHashMap = C56424yEw.KWHzl();
        } else {
            linkedHashMap = new LinkedHashMap<>();
            int i = 0;
            for (ProtoBuf.TypeParameter typeParameter : list) {
                linkedHashMap.put(java.lang.Integer.valueOf(typeParameter.getId()), new C59224zcx(this.OLrzqt, typeParameter, i));
                i++;
            }
        }
        this.djBIcL = linkedHashMap;
    }

    public static final InterfaceC56663yNs AEQbTJ(C59165zbr c59165zbr, int i) {
        return c59165zbr.OLrzqt(i);
    }

    public static final InterfaceC56663yNs EZpvd(C59165zbr c59165zbr, int i) {
        return c59165zbr.EZpvd(i);
    }

    public final java.util.List<InterfaceC56691yOt> AEQbTJ() {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.djBIcL.values());
    }

    public final AbstractC59233zdF OLrzqt(@NotNull ProtoBuf.Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        if (type.hasFlexibleTypeCapabilitiesId()) {
            java.lang.String strKWHzl = this.OLrzqt.copydefault().KWHzl(type.getFlexibleTypeCapabilitiesId());
            AbstractC59242zdO abstractC59242zdOSimpleType$default = simpleType$default(this, type, false, 2, null);
            ProtoBuf.Type typeCopydefault = yWU.copydefault(type, this.OLrzqt.gEmmrt());
            Intrinsics.copydefault(typeCopydefault);
            return this.OLrzqt.EZpvd().AkhnZx().OLrzqt(type, strKWHzl, abstractC59242zdOSimpleType$default, simpleType$default(this, typeCopydefault, false, 2, null));
        }
        return EZpvd(type, true);
    }

    public static /* synthetic */ AbstractC59242zdO simpleType$default(C59165zbr c59165zbr, ProtoBuf.Type type, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c59165zbr.EZpvd(type, z);
    }

    public final AbstractC59242zdO EZpvd(@NotNull ProtoBuf.Type type, boolean z) {
        AbstractC59242zdO abstractC59242zdOAEQbTJ;
        AbstractC59242zdO abstractC59242zdOSimpleType$default;
        AbstractC59242zdO abstractC59242zdOAEQbTJ2;
        Intrinsics.checkNotNullParameter(type, "");
        if (type.hasClassName()) {
            abstractC59242zdOAEQbTJ = AEQbTJ(type.getClassName());
        } else {
            abstractC59242zdOAEQbTJ = type.hasTypeAliasName() ? AEQbTJ(type.getTypeAliasName()) : null;
        }
        if (abstractC59242zdOAEQbTJ != null) {
            return abstractC59242zdOAEQbTJ;
        }
        InterfaceC59315zei interfaceC59315zeiKWHzl = KWHzl(type);
        if (C59370zfk.KWHzl(interfaceC59315zeiKWHzl.OLrzqt())) {
            return C59370zfk.AEQbTJ.KWHzl(ErrorTypeKind.TYPE_FOR_ERROR_TYPE_CONSTRUCTOR, interfaceC59315zeiKWHzl, interfaceC59315zeiKWHzl.toString());
        }
        C59129zbH c59129zbH = new C59129zbH(this.OLrzqt.valueOf(), new C59171zbx(this, type));
        C59308zeb c59308zebAEQbTJ = AEQbTJ(this.OLrzqt.EZpvd().AuCTel(), c59129zbH, interfaceC59315zeiKWHzl, this.OLrzqt.KWHzl());
        java.util.List<ProtoBuf.Type.Argument> listOLrzqt = OLrzqt(type, this);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listOLrzqt, 10));
        int i = 0;
        for (java.lang.Object obj : listOLrzqt) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.util.List<InterfaceC56691yOt> listCopydefault = interfaceC59315zeiKWHzl.copydefault();
            Intrinsics.checkNotNullExpressionValue(listCopydefault, "");
            arrayList.add(AEQbTJ((InterfaceC56691yOt) CollectionsKt___CollectionsKt.AkhnZx(listCopydefault, i), (ProtoBuf.Type.Argument) obj));
            i++;
        }
        java.util.List<? extends InterfaceC59317zek> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
        InterfaceC56663yNs interfaceC56663yNsKWHzl = interfaceC59315zeiKWHzl.OLrzqt();
        if (z && (interfaceC56663yNsKWHzl instanceof InterfaceC56690yOs)) {
            C59231zdD c59231zdD = C59231zdD.OLrzqt;
            AbstractC59242zdO abstractC59242zdOKWHzl = C59231zdD.KWHzl((InterfaceC56690yOs) interfaceC56663yNsKWHzl, listAxsJAYsNCnLh);
            abstractC59242zdOSimpleType$default = abstractC59242zdOKWHzl.AEQbTJ(C59238zdK.KWHzl(abstractC59242zdOKWHzl) || type.getNullable()).AEQbTJ(AEQbTJ(this.OLrzqt.EZpvd().AuCTel(), yOL.KWHzl.EZpvd(CollectionsKt___CollectionsKt.valueOf(c59129zbH, abstractC59242zdOKWHzl.copydefault())), interfaceC59315zeiKWHzl, this.OLrzqt.KWHzl()));
        } else if (yWP.QUSxYX.KWHzl(type.getFlags()).booleanValue()) {
            abstractC59242zdOSimpleType$default = OLrzqt(c59308zebAEQbTJ, interfaceC59315zeiKWHzl, listAxsJAYsNCnLh, type.getNullable());
        } else {
            abstractC59242zdOSimpleType$default = C59231zdD.simpleType$default(c59308zebAEQbTJ, interfaceC59315zeiKWHzl, listAxsJAYsNCnLh, type.getNullable(), (AbstractC59287zeG) null, 16, (java.lang.Object) null);
            if (yWP.OLrzqt.KWHzl(type.getFlags()).booleanValue()) {
                C59265zdl c59265zdlMakeDefinitelyNotNull$default = C59265zdl.ActionBar.makeDefinitelyNotNull$default(C59265zdl.copydefault, abstractC59242zdOSimpleType$default, true, false, 4, null);
                if (c59265zdlMakeDefinitelyNotNull$default == null) {
                    throw new java.lang.IllegalStateException(("null DefinitelyNotNullType for '" + abstractC59242zdOSimpleType$default + '\'').toString());
                }
                abstractC59242zdOSimpleType$default = c59265zdlMakeDefinitelyNotNull$default;
            }
        }
        ProtoBuf.Type typeAEQbTJ = yWU.AEQbTJ(type, this.OLrzqt.gEmmrt());
        return (typeAEQbTJ == null || (abstractC59242zdOAEQbTJ2 = C59245zdR.AEQbTJ(abstractC59242zdOSimpleType$default, EZpvd(typeAEQbTJ, false))) == null) ? abstractC59242zdOSimpleType$default : abstractC59242zdOAEQbTJ2;
    }

    public static final java.util.List KWHzl(C59165zbr c59165zbr, ProtoBuf.Type type) {
        return c59165zbr.OLrzqt.EZpvd().copydefault().EZpvd(type, c59165zbr.OLrzqt.copydefault());
    }

    public static final java.util.List<ProtoBuf.Type.Argument> OLrzqt(ProtoBuf.Type type, C59165zbr c59165zbr) {
        java.util.List<ProtoBuf.Type.Argument> argumentList = type.getArgumentList();
        Intrinsics.checkNotNullExpressionValue(argumentList, "");
        ProtoBuf.Type typeEZpvd = yWU.EZpvd(type, c59165zbr.OLrzqt.gEmmrt());
        java.util.List<ProtoBuf.Type.Argument> listOLrzqt = typeEZpvd != null ? OLrzqt(typeEZpvd, c59165zbr) : null;
        if (listOLrzqt == null) {
            listOLrzqt = yDY.AhwBna();
        }
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) argumentList, (java.lang.Iterable) listOLrzqt);
    }

    public static final InterfaceC56658yNn copydefault(C59165zbr c59165zbr, ProtoBuf.Type type, int i) {
        C56929yXo c56929yXoEZpvd = C59160zbm.EZpvd(c59165zbr.OLrzqt.copydefault(), i);
        java.util.List<java.lang.Integer> listAxsJAY = C59467zhb.AxsJAY(C59467zhb.fetchVPNInfo(C59405zgS.EZpvd(type, (Function1<? super ProtoBuf.Type, ? extends ProtoBuf.Type>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) new C59169zbv(c59165zbr))), C59170zbw.KWHzl));
        int iUzCIH = C59467zhb.uzCIH(C59405zgS.EZpvd(c56929yXoEZpvd, (Function1<? super C56929yXo, ? extends C56929yXo>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) new PropertyReference1Impl() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((C56929yXo) obj).KWHzl();
            }
        })));
        while (listAxsJAY.size() < iUzCIH) {
            listAxsJAY.add(0);
        }
        return c59165zbr.OLrzqt.EZpvd().fARcdN().OLrzqt(c56929yXoEZpvd, listAxsJAY);
    }

    public static final ProtoBuf.Type EZpvd(C59165zbr c59165zbr, ProtoBuf.Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        return yWU.EZpvd(type, c59165zbr.OLrzqt.gEmmrt());
    }

    public static final int copydefault(ProtoBuf.Type type) {
        Intrinsics.checkNotNullParameter(type, "");
        return type.getArgumentCount();
    }

    public final InterfaceC59315zei KWHzl(ProtoBuf.Type type) {
        InterfaceC56663yNs interfaceC56663yNsInvoke;
        java.lang.Object next;
        if (type.hasClassName()) {
            interfaceC56663yNsInvoke = this.AEQbTJ.invoke(java.lang.Integer.valueOf(type.getClassName()));
            if (interfaceC56663yNsInvoke == null) {
                interfaceC56663yNsInvoke = copydefault(this, type, type.getClassName());
            }
        } else if (type.hasTypeParameter()) {
            interfaceC56663yNsInvoke = copydefault(type.getTypeParameter());
            if (interfaceC56663yNsInvoke == null) {
                C59370zfk c59370zfk = C59370zfk.AEQbTJ;
                ErrorTypeKind errorTypeKind = ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER;
                int typeParameter = type.getTypeParameter();
                return c59370zfk.AEQbTJ(errorTypeKind, java.lang.String.valueOf(typeParameter), this.EZpvd);
            }
        } else if (type.hasTypeParameterName()) {
            java.lang.String strKWHzl = this.OLrzqt.copydefault().KWHzl(type.getTypeParameterName());
            java.util.Iterator<T> it = AEQbTJ().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((InterfaceC56691yOt) next).bR_().AEQbTJ(), (java.lang.Object) strKWHzl)) {
                    break;
                }
            }
            interfaceC56663yNsInvoke = (InterfaceC56691yOt) next;
            if (interfaceC56663yNsInvoke == null) {
                return C59370zfk.AEQbTJ.AEQbTJ(ErrorTypeKind.CANNOT_LOAD_DESERIALIZE_TYPE_PARAMETER_BY_NAME, strKWHzl, this.OLrzqt.KWHzl().toString());
            }
        } else if (type.hasTypeAliasName()) {
            interfaceC56663yNsInvoke = this.AhwBna.invoke(java.lang.Integer.valueOf(type.getTypeAliasName()));
            if (interfaceC56663yNsInvoke == null) {
                interfaceC56663yNsInvoke = copydefault(this, type, type.getTypeAliasName());
            }
        } else {
            return C59370zfk.AEQbTJ.AEQbTJ(ErrorTypeKind.UNKNOWN_TYPE, new java.lang.String[0]);
        }
        InterfaceC59315zei interfaceC59315zeiFJNWhG = interfaceC56663yNsInvoke.fJNWhG();
        Intrinsics.checkNotNullExpressionValue(interfaceC59315zeiFJNWhG, "");
        return interfaceC59315zeiFJNWhG;
    }

    public final AbstractC59242zdO OLrzqt(C59308zeb c59308zeb, InterfaceC59315zei interfaceC59315zei, java.util.List<? extends InterfaceC59317zek> list, boolean z) {
        AbstractC59242zdO abstractC59242zdOAEQbTJ;
        int size;
        int size2 = interfaceC59315zei.copydefault().size() - list.size();
        if (size2 == 0) {
            abstractC59242zdOAEQbTJ = AEQbTJ(c59308zeb, interfaceC59315zei, list, z);
        } else if (size2 == 1 && (size = list.size() - 1) >= 0) {
            InterfaceC59315zei interfaceC59315zeiFJNWhG = interfaceC59315zei.bU_().copydefault(size).fJNWhG();
            Intrinsics.checkNotNullExpressionValue(interfaceC59315zeiFJNWhG, "");
            abstractC59242zdOAEQbTJ = C59231zdD.simpleType$default(c59308zeb, interfaceC59315zeiFJNWhG, list, z, (AbstractC59287zeG) null, 16, (java.lang.Object) null);
        } else {
            abstractC59242zdOAEQbTJ = null;
        }
        return abstractC59242zdOAEQbTJ == null ? C59370zfk.AEQbTJ.AEQbTJ(ErrorTypeKind.INCONSISTENT_SUSPEND_FUNCTION, list, interfaceC59315zei, new java.lang.String[0]) : abstractC59242zdOAEQbTJ;
    }

    public final AbstractC59242zdO AEQbTJ(C59308zeb c59308zeb, InterfaceC59315zei interfaceC59315zei, java.util.List<? extends InterfaceC59317zek> list, boolean z) {
        AbstractC59242zdO abstractC59242zdOSimpleType$default = C59231zdD.simpleType$default(c59308zeb, interfaceC59315zei, list, z, (AbstractC59287zeG) null, 16, (java.lang.Object) null);
        if (C56643yMz.AYXKKw(abstractC59242zdOSimpleType$default)) {
            return KWHzl(abstractC59242zdOSimpleType$default);
        }
        return null;
    }

    public final AbstractC59242zdO KWHzl(AbstractC59233zdF abstractC59233zdF) {
        AbstractC59233zdF abstractC59233zdFOLrzqt;
        InterfaceC59317zek interfaceC59317zek = (InterfaceC59317zek) CollectionsKt___CollectionsKt.wlaJM(C56643yMz.AhwBna(abstractC59233zdF));
        if (interfaceC59317zek == null || (abstractC59233zdFOLrzqt = interfaceC59317zek.OLrzqt()) == null) {
            return null;
        }
        InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59233zdFOLrzqt.djBIcL().OLrzqt();
        C56933yXs c56933yXsEZpvd = interfaceC56663yNsKWHzl != null ? yZE.EZpvd((InterfaceC56665yNu) interfaceC56663yNsKWHzl) : null;
        if (abstractC59233zdFOLrzqt.bY_().size() != 1 || (!Intrinsics.EZpvd(c56933yXsEZpvd, yMB.valueOf) && !Intrinsics.EZpvd(c56933yXsEZpvd, C59126zbE.OLrzqt))) {
            return (AbstractC59242zdO) abstractC59233zdF;
        }
        AbstractC59233zdF abstractC59233zdFOLrzqt2 = ((InterfaceC59317zek) CollectionsKt___CollectionsKt.gHZMYf(abstractC59233zdFOLrzqt.bY_())).OLrzqt();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt2, "");
        InterfaceC56665yNu interfaceC56665yNuKWHzl = this.OLrzqt.KWHzl();
        InterfaceC56657yNm interfaceC56657yNm = interfaceC56665yNuKWHzl instanceof InterfaceC56657yNm ? (InterfaceC56657yNm) interfaceC56665yNuKWHzl : null;
        if (Intrinsics.EZpvd(interfaceC56657yNm != null ? yZE.KWHzl(interfaceC56657yNm) : null, C59166zbs.AEQbTJ)) {
            return EZpvd(abstractC59233zdF, abstractC59233zdFOLrzqt2);
        }
        return EZpvd(abstractC59233zdF, abstractC59233zdFOLrzqt2);
    }

    public final AbstractC59242zdO EZpvd(AbstractC59233zdF abstractC59233zdF, AbstractC59233zdF abstractC59233zdF2) {
        AbstractC56640yMw abstractC56640yMwCopydefault = C59336zfC.copydefault(abstractC59233zdF);
        yOL yolCopydefault = abstractC59233zdF.copydefault();
        AbstractC59233zdF abstractC59233zdFAEQbTJ = C56643yMz.AEQbTJ(abstractC59233zdF);
        java.util.List<AbstractC59233zdF> listEZpvd = C56643yMz.EZpvd(abstractC59233zdF);
        java.util.List listAYXKKw = CollectionsKt___CollectionsKt.AYXKKw((java.util.List) C56643yMz.AhwBna(abstractC59233zdF), 1);
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAYXKKw, 10));
        java.util.Iterator it = listAYXKKw.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC59317zek) it.next()).OLrzqt());
        }
        return C56643yMz.OLrzqt(abstractC56640yMwCopydefault, yolCopydefault, abstractC59233zdFAEQbTJ, listEZpvd, arrayList, null, abstractC59233zdF2, true).AEQbTJ(abstractC59233zdF.AEQbTJ());
    }

    public final InterfaceC56691yOt copydefault(int i) {
        InterfaceC56691yOt interfaceC56691yOt = this.djBIcL.get(java.lang.Integer.valueOf(i));
        if (interfaceC56691yOt != null) {
            return interfaceC56691yOt;
        }
        C59165zbr c59165zbr = this.KWHzl;
        if (c59165zbr != null) {
            return c59165zbr.copydefault(i);
        }
        return null;
    }

    public final InterfaceC56663yNs OLrzqt(int i) {
        C56929yXo c56929yXoEZpvd = C59160zbm.EZpvd(this.OLrzqt.copydefault(), i);
        if (c56929yXoEZpvd.AhwBna()) {
            return this.OLrzqt.EZpvd().KWHzl(c56929yXoEZpvd);
        }
        return yNE.EZpvd(this.OLrzqt.EZpvd().fetchVPNInfo(), c56929yXoEZpvd);
    }

    public final AbstractC59242zdO AEQbTJ(int i) {
        if (C59160zbm.EZpvd(this.OLrzqt.copydefault(), i).AhwBna()) {
            return this.OLrzqt.EZpvd().values().OLrzqt();
        }
        return null;
    }

    public final InterfaceC56663yNs EZpvd(int i) {
        C56929yXo c56929yXoEZpvd = C59160zbm.EZpvd(this.OLrzqt.copydefault(), i);
        if (c56929yXoEZpvd.AhwBna()) {
            return null;
        }
        return yNE.KWHzl(this.OLrzqt.EZpvd().fetchVPNInfo(), c56929yXoEZpvd);
    }

    public final InterfaceC59317zek AEQbTJ(InterfaceC56691yOt interfaceC56691yOt, ProtoBuf.Type.Argument argument) {
        if (argument.getProjection() == ProtoBuf.Type.Argument.Projection.STAR) {
            if (interfaceC56691yOt == null) {
                return new C59248zdU(this.OLrzqt.EZpvd().fetchVPNInfo().AEQbTJ());
            }
            return new C59250zdW(interfaceC56691yOt);
        }
        C59168zbu c59168zbu = C59168zbu.copydefault;
        ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
        Intrinsics.checkNotNullExpressionValue(projection, "");
        Variance varianceAEQbTJ = c59168zbu.AEQbTJ(projection);
        ProtoBuf.Type typeEZpvd = yWU.EZpvd(argument, this.OLrzqt.gEmmrt());
        if (typeEZpvd == null) {
            return new C59323zeq(C59370zfk.EZpvd(ErrorTypeKind.NO_RECORDED_TYPE, argument.toString()));
        }
        return new C59323zeq(varianceAEQbTJ, OLrzqt(typeEZpvd));
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.copydefault);
        if (this.KWHzl == null) {
            str = "";
        } else {
            str = ". Child of " + this.KWHzl.copydefault;
        }
        sb.append(str);
        return sb.toString();
    }

    public final C59308zeb AEQbTJ(java.util.List<? extends InterfaceC59309zec> list, yOL yol, InterfaceC59315zei interfaceC59315zei, InterfaceC56665yNu interfaceC56665yNu) {
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC59309zec) it.next()).OLrzqt(yol, interfaceC59315zei, interfaceC56665yNu));
        }
        return C59308zeb.OLrzqt.KWHzl(C56403yEb.QOLQEE(arrayList));
    }
}
