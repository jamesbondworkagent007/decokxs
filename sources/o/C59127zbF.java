package o;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$computeValueClassRepresentation$1;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$computeValueClassRepresentation$2;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$memberScopeHolder$1;
import o.AbstractC59164zbq;
import o.InterfaceC56685yOn;
import o.InterfaceC59098zad;
import o.InterfaceC59101zag;
import o.yNO;
import o.yWX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zbF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59127zbF extends yOW implements yNH {
    public final InterfaceC59180zcF<InterfaceC56658yNn> AEQbTJ;
    public final ClassKind AYXKKw;
    public final Application AhwBna;
    public final InterfaceC59180zcF<InterfaceC56656yNl> AuCTel;
    public final C59087zaS EZpvd;
    public final yOL KWHzl;
    public final C56929yXo OLrzqt;
    public final ProtoBuf.Class copydefault;
    public final boolean djBIcL;
    public final InterfaceC59182zcH<java.util.Collection<InterfaceC56658yNn>> ejfBZ;
    public final yWQ fIwbmz;
    public final Modality fJNWhG;
    public final C56683yOl<TaskDescription> fetchVPNInfo;
    public final InterfaceC56665yNu gEmmrt;
    public final InterfaceC59180zcF<yOA<AbstractC59242zdO>> getFieldNames;
    public final AbstractC59100zaf getNewProxyInstance;
    public final InterfaceC56686yOo hDKMBd;
    public final StateListAnimator iwGUEr;
    public final AbstractC59164zbq.StateListAnimator uzCIH;
    public final InterfaceC59182zcH<java.util.Collection<InterfaceC56656yNl>> valueOf;
    public final yNC wlaJM;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56658yNn, o.InterfaceC56666yNv, o.InterfaceC56665yNu
    /* JADX INFO: renamed from: AYXKKw */
    public InterfaceC56665yNu AuCTel() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56658yNn
    public ClassKind DbNXlk() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProtoBuf.Class QKVWgx() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59087zaS QOLQEE() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: ejfBZ()Lo/zad; */
    @Override // o.InterfaceC56658yNn
    /* JADX INFO: renamed from: QUSxYX, reason: merged with bridge method [inline-methods] */
    public AbstractC59100zaf ejfBZ() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC59164zbq.StateListAnimator QVAiDq() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yWQ QfsBiF() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yOB
    public yOL copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56664yNt
    public InterfaceC56686yOo fARcdN() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56663yNs
    public InterfaceC59315zei fJNWhG() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56658yNn, o.yNJ, o.InterfaceC56668yNx
    public yNC getNewProxyInstance() {
        return this.wlaJM;
    }

    @Override // o.yNJ
    public boolean hDKMBd() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56658yNn, o.yNJ
    public Modality isConnected() {
        return this.fJNWhG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59127zbF(@NotNull C59087zaS c59087zaS, @NotNull ProtoBuf.Class r11, @NotNull yWS yws, @NotNull yWQ ywq, @NotNull InterfaceC56686yOo interfaceC56686yOo) {
        AbstractC59100zaf c59105zak;
        yOL c59220zct;
        super(c59087zaS.valueOf(), C59160zbm.EZpvd(yws, r11.getFqName()).AYXKKw());
        Intrinsics.checkNotNullParameter(c59087zaS, "");
        Intrinsics.checkNotNullParameter(r11, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(ywq, "");
        Intrinsics.checkNotNullParameter(interfaceC56686yOo, "");
        this.copydefault = r11;
        this.fIwbmz = ywq;
        this.hDKMBd = interfaceC56686yOo;
        this.OLrzqt = C59160zbm.EZpvd(yws, r11.getFqName());
        C59168zbu c59168zbu = C59168zbu.copydefault;
        this.fJNWhG = c59168zbu.copydefault(yWP.ORxRYg.KWHzl(r11.getFlags()));
        this.wlaJM = C59167zbt.AEQbTJ(c59168zbu, yWP.RJOkX.KWHzl(r11.getFlags()));
        ClassKind classKindAEQbTJ = c59168zbu.AEQbTJ(yWP.EZpvd.KWHzl(r11.getFlags()));
        this.AYXKKw = classKindAEQbTJ;
        java.util.List<ProtoBuf.TypeParameter> typeParameterList = r11.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "");
        ProtoBuf.TypeTable typeTable = r11.getTypeTable();
        Intrinsics.checkNotNullExpressionValue(typeTable, "");
        yWW yww = new yWW(typeTable);
        yWX.StateListAnimator stateListAnimator = yWX.EZpvd;
        ProtoBuf.VersionRequirementTable versionRequirementTable = r11.getVersionRequirementTable();
        Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "");
        C59087zaS c59087zaSOLrzqt = c59087zaS.OLrzqt(this, typeParameterList, yws, yww, stateListAnimator.EZpvd(versionRequirementTable), ywq);
        this.EZpvd = c59087zaSOLrzqt;
        java.lang.Boolean boolKWHzl = yWP.AYXKKw.KWHzl(r11.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolKWHzl, "");
        boolean zBooleanValue = boolKWHzl.booleanValue();
        this.djBIcL = zBooleanValue;
        ClassKind classKind = ClassKind.ENUM_CLASS;
        if (classKindAEQbTJ == classKind) {
            c59105zak = new C59105zak(c59087zaSOLrzqt.valueOf(), this, zBooleanValue || Intrinsics.EZpvd(c59087zaSOLrzqt.EZpvd().valueOf().OLrzqt(), java.lang.Boolean.TRUE));
        } else {
            c59105zak = InterfaceC59098zad.ActionBar.copydefault;
        }
        this.getNewProxyInstance = c59105zak;
        this.iwGUEr = new StateListAnimator();
        this.fetchVPNInfo = C56683yOl.OLrzqt.EZpvd(this, c59087zaSOLrzqt.valueOf(), c59087zaSOLrzqt.EZpvd().DbNXlk().EZpvd(), new DeserializedClassDescriptor$memberScopeHolder$1(this));
        this.AhwBna = classKindAEQbTJ == classKind ? new Application() : null;
        InterfaceC56665yNu interfaceC56665yNuKWHzl = c59087zaS.KWHzl();
        this.gEmmrt = interfaceC56665yNuKWHzl;
        this.AuCTel = c59087zaSOLrzqt.valueOf().copydefault(new C59135zbN(this));
        this.valueOf = c59087zaSOLrzqt.valueOf().KWHzl(new C59134zbM(this));
        this.AEQbTJ = c59087zaSOLrzqt.valueOf().copydefault(new C59132zbK(this));
        this.ejfBZ = c59087zaSOLrzqt.valueOf().KWHzl(new C59133zbL(this));
        this.getFieldNames = c59087zaSOLrzqt.valueOf().copydefault(new C59136zbO(this));
        yWS ywsCopydefault = c59087zaSOLrzqt.copydefault();
        yWW ywwGEmmrt = c59087zaSOLrzqt.gEmmrt();
        C59127zbF c59127zbF = interfaceC56665yNuKWHzl instanceof C59127zbF ? (C59127zbF) interfaceC56665yNuKWHzl : null;
        this.uzCIH = new AbstractC59164zbq.StateListAnimator(r11, ywsCopydefault, ywwGEmmrt, interfaceC56686yOo, c59127zbF != null ? c59127zbF.uzCIH : null);
        if (!yWP.copydefault.KWHzl(r11.getFlags()).booleanValue()) {
            c59220zct = yOL.KWHzl.OLrzqt();
        } else {
            c59220zct = new C59220zct(c59087zaSOLrzqt.valueOf(), new C59137zbP(this));
        }
        this.KWHzl = c59220zct;
    }

    public final TaskDescription RJOkX() {
        return (TaskDescription) this.fetchVPNInfo.OLrzqt(this.EZpvd.EZpvd().DbNXlk().EZpvd());
    }

    public static final InterfaceC56656yNl fetchVPNInfo(C59127zbF c59127zbF) {
        return c59127zbF.values();
    }

    public static final java.util.Collection DbNXlk(C59127zbF c59127zbF) {
        return c59127zbF.AhwBna();
    }

    public static final InterfaceC56658yNn values(C59127zbF c59127zbF) {
        return c59127zbF.AEQbTJ();
    }

    public static final java.util.Collection AkhnZx(C59127zbF c59127zbF) {
        return c59127zbF.fIwbmz();
    }

    public static final yOA isConnected(C59127zbF c59127zbF) {
        return c59127zbF.getFieldNames();
    }

    public static final java.util.List AYXKKw(C59127zbF c59127zbF) {
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c59127zbF.EZpvd.EZpvd().copydefault().EZpvd(c59127zbF.uzCIH));
    }

    @Override // o.InterfaceC56659yNo
    public boolean gHZMYf() {
        java.lang.Boolean boolKWHzl = yWP.zsXlph.KWHzl(this.copydefault.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolKWHzl, "");
        return boolKWHzl.booleanValue();
    }

    @Override // o.InterfaceC56658yNn
    public boolean AubY() {
        java.lang.Boolean boolKWHzl = yWP.isConnected.KWHzl(this.copydefault.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolKWHzl, "");
        return boolKWHzl.booleanValue();
    }

    @Override // o.InterfaceC56658yNn
    public boolean sSMYrx() {
        return yWP.QKVWgx.KWHzl(this.copydefault.getFlags()).booleanValue() && this.fIwbmz.EZpvd(1, 4, 1);
    }

    @Override // o.yNJ
    public boolean zLjUOn() {
        java.lang.Boolean boolKWHzl = yWP.fetchVPNInfo.KWHzl(this.copydefault.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolKWHzl, "");
        return boolKWHzl.booleanValue();
    }

    @Override // o.yNJ
    public boolean zsXlph() {
        java.lang.Boolean boolKWHzl = yWP.fJNWhG.KWHzl(this.copydefault.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolKWHzl, "");
        return boolKWHzl.booleanValue();
    }

    @Override // o.InterfaceC56658yNn
    public boolean wlaJM() {
        java.lang.Boolean boolKWHzl = yWP.getFieldNames.KWHzl(this.copydefault.getFlags());
        Intrinsics.checkNotNullExpressionValue(boolKWHzl, "");
        return boolKWHzl.booleanValue();
    }

    @Override // o.InterfaceC56658yNn
    public boolean AwvSrB() {
        return yWP.QKVWgx.KWHzl(this.copydefault.getFlags()).booleanValue() && this.fIwbmz.OLrzqt(1, 4, 2);
    }

    @Override // o.AbstractC56722yPx
    public InterfaceC59098zad AEQbTJ(@NotNull AbstractC59287zeG abstractC59287zeG) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        return this.fetchVPNInfo.OLrzqt(abstractC59287zeG);
    }

    @Override // o.InterfaceC56658yNn
    public boolean AuCTelauCTel() {
        return yWP.EZpvd.KWHzl(this.copydefault.getFlags()) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    public final InterfaceC56656yNl values() {
        java.lang.Object next;
        if (this.AYXKKw.isSingleton()) {
            C56707yPi c56707yPiOLrzqt = yYI.OLrzqt(this, InterfaceC56686yOo.copydefault);
            c56707yPiOLrzqt.EZpvd(bQ_());
            return c56707yPiOLrzqt;
        }
        java.util.List<ProtoBuf.Constructor> constructorList = this.copydefault.getConstructorList();
        Intrinsics.checkNotNullExpressionValue(constructorList, "");
        java.util.Iterator<T> it = constructorList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!yWP.sSMYrx.KWHzl(((ProtoBuf.Constructor) next).getFlags()).booleanValue()) {
                break;
            }
        }
        ProtoBuf.Constructor constructor = (ProtoBuf.Constructor) next;
        if (constructor != null) {
            return this.EZpvd.OLrzqt().EZpvd(constructor, true);
        }
        return null;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC56656yNl uzCIH() {
        return this.AuCTel.invoke();
    }

    public final java.util.Collection<InterfaceC56656yNl> AhwBna() {
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) AuCTel(), (java.lang.Iterable) yDY.OLrzqt(uzCIH())), (java.lang.Iterable) this.EZpvd.EZpvd().AEQbTJ().KWHzl(this));
    }

    public final java.util.List<InterfaceC56656yNl> AuCTel() {
        java.util.List<ProtoBuf.Constructor> constructorList = this.copydefault.getConstructorList();
        Intrinsics.checkNotNullExpressionValue(constructorList, "");
        java.util.ArrayList<ProtoBuf.Constructor> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : constructorList) {
            java.lang.Boolean boolKWHzl = yWP.sSMYrx.KWHzl(((ProtoBuf.Constructor) obj).getFlags());
            Intrinsics.checkNotNullExpressionValue(boolKWHzl, "");
            if (boolKWHzl.booleanValue()) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (ProtoBuf.Constructor constructor : arrayList) {
            C59149zbb c59149zbbOLrzqt = this.EZpvd.OLrzqt();
            Intrinsics.copydefault(constructor);
            arrayList2.add(c59149zbbOLrzqt.EZpvd(constructor, false));
        }
        return arrayList2;
    }

    @Override // o.InterfaceC56658yNn
    public java.util.Collection<InterfaceC56656yNl> djBIcL() {
        return this.valueOf.invoke();
    }

    @Override // o.yOW, o.InterfaceC56658yNn
    public java.util.List<InterfaceC56679yOh> AxsJAY() {
        java.util.List<ProtoBuf.Type> listKWHzl = yWU.KWHzl(this.copydefault, this.EZpvd.gEmmrt());
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listKWHzl, 10));
        java.util.Iterator<T> it = listKWHzl.iterator();
        while (it.hasNext()) {
            arrayList.add(new yPM(DTwDnp(), new C59116zav(this, this.EZpvd.AYXKKw().OLrzqt((ProtoBuf.Type) it.next()), null, null), yOL.KWHzl.OLrzqt()));
        }
        return arrayList;
    }

    public final InterfaceC56658yNn AEQbTJ() {
        if (!this.copydefault.hasCompanionObjectName()) {
            return null;
        }
        InterfaceC56663yNs interfaceC56663yNsEZpvd = RJOkX().EZpvd(C59160zbm.OLrzqt(this.EZpvd.copydefault(), this.copydefault.getCompanionObjectName()), NoLookupLocation.FROM_DESERIALIZATION);
        if (interfaceC56663yNsEZpvd instanceof InterfaceC56658yNn) {
            return (InterfaceC56658yNn) interfaceC56663yNsEZpvd;
        }
        return null;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC56658yNn valueOf() {
        return this.AEQbTJ.invoke();
    }

    public final boolean KWHzl(@NotNull C56935yXu c56935yXu) {
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        return RJOkX().AYXKKw().contains(c56935yXu);
    }

    public final java.util.Collection<InterfaceC56658yNn> fIwbmz() {
        if (this.fJNWhG != Modality.SEALED) {
            return yDY.AhwBna();
        }
        java.util.List<java.lang.Integer> sealedSubclassFqNameList = this.copydefault.getSealedSubclassFqNameList();
        Intrinsics.copydefault(sealedSubclassFqNameList);
        if (!(!sealedSubclassFqNameList.isEmpty())) {
            return yYA.copydefault.KWHzl(this, false);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Integer num : sealedSubclassFqNameList) {
            C59083zaO c59083zaOEZpvd = this.EZpvd.EZpvd();
            yWS ywsCopydefault = this.EZpvd.copydefault();
            Intrinsics.copydefault(num);
            InterfaceC56658yNn interfaceC56658yNnKWHzl = c59083zaOEZpvd.KWHzl(C59160zbm.EZpvd(ywsCopydefault, num.intValue()));
            if (interfaceC56658yNnKWHzl != null) {
                arrayList.add(interfaceC56658yNnKWHzl);
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC56658yNn
    public java.util.Collection<InterfaceC56658yNn> fetchVPNInfo() {
        return this.ejfBZ.invoke();
    }

    @Override // o.InterfaceC56658yNn
    public yOA<AbstractC59242zdO> iwGUEr() {
        return this.getFieldNames.invoke();
    }

    public final yOA<AbstractC59242zdO> getFieldNames() {
        if (!sSMYrx() && !AwvSrB()) {
            return null;
        }
        yOA<AbstractC59242zdO> yoaEZpvd = C59123zbB.EZpvd(this.copydefault, this.EZpvd.copydefault(), this.EZpvd.gEmmrt(), new DeserializedClassDescriptor$computeValueClassRepresentation$1(this.EZpvd.AYXKKw()), new DeserializedClassDescriptor$computeValueClassRepresentation$2(this));
        if (yoaEZpvd != null) {
            return yoaEZpvd;
        }
        if (this.fIwbmz.OLrzqt(1, 5, 1)) {
            return null;
        }
        InterfaceC56656yNl interfaceC56656yNlUzCIH = uzCIH();
        if (interfaceC56656yNlUzCIH == null) {
            throw new java.lang.IllegalStateException(("Inline class has no primary constructor: " + this).toString());
        }
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo = interfaceC56656yNlUzCIH.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
        C56935yXu c56935yXuBR_ = ((InterfaceC56695yOx) CollectionsKt___CollectionsKt.AuCTelauCTel(listFetchVPNInfo)).bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
        AbstractC59242zdO abstractC59242zdOOLrzqt = OLrzqt(c56935yXuBR_);
        if (abstractC59242zdOOLrzqt == null) {
            throw new java.lang.IllegalStateException(("Value class has no underlying property: " + this).toString());
        }
        return new yNL(c56935yXuBR_, abstractC59242zdOOLrzqt);
    }

    public final AbstractC59242zdO OLrzqt(C56935yXu c56935yXu) {
        java.util.Iterator<T> it = RJOkX().copydefault(c56935yXu, NoLookupLocation.FROM_DESERIALIZATION).iterator();
        boolean z = false;
        java.lang.Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                java.lang.Object next = it.next();
                if (((InterfaceC56676yOe) next).djBIcL() == null) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        InterfaceC56676yOe interfaceC56676yOe = (InterfaceC56676yOe) obj;
        return (AbstractC59242zdO) (interfaceC56676yOe != null ? interfaceC56676yOe.uzCIH() : null);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("deserialized ");
        sb.append(zLjUOn() ? "expect " : "");
        sb.append("class ");
        sb.append(bR_());
        return sb.toString();
    }

    @Override // o.InterfaceC56658yNn, o.InterfaceC56659yNo
    public java.util.List<InterfaceC56691yOt> AkhnZx() {
        return this.EZpvd.AYXKKw().AEQbTJ();
    }

    /* JADX INFO: renamed from: o.zbF$StateListAnimator */
    public final class StateListAnimator extends AbstractC59184zcJ {
        public final InterfaceC59182zcH<java.util.List<InterfaceC56691yOt>> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/yNs; */
        /* JADX DEBUG: Method merged with bridge method: OLrzqt()Lo/yNn; */
        @Override // o.AbstractC59184zcJ
        /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C59127zbF OLrzqt() {
            return C59127zbF.this;
        }

        @Override // o.InterfaceC59315zei
        public boolean gEmmrt() {
            return true;
        }

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public StateListAnimator() {
            super(C59127zbF.this.QOLQEE().valueOf());
            this.EZpvd = C59127zbF.this.QOLQEE().valueOf().KWHzl(new C59140zbS(C59127zbF.this));
        }

        public static final java.util.List EZpvd(C59127zbF c59127zbF) {
            return C56692yOu.copydefault((InterfaceC56659yNo) c59127zbF);
        }

        @Override // o.AbstractC59197zcW
        public java.util.Collection<AbstractC59233zdF> AEQbTJ() {
            java.lang.String strAEQbTJ;
            C56933yXs c56933yXsAEQbTJ;
            java.util.List<ProtoBuf.Type> listCopydefault = yWU.copydefault(C59127zbF.this.QKVWgx(), C59127zbF.this.QOLQEE().gEmmrt());
            C59127zbF c59127zbF = C59127zbF.this;
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
            java.util.Iterator<T> it = listCopydefault.iterator();
            while (it.hasNext()) {
                arrayList.add(c59127zbF.QOLQEE().AYXKKw().OLrzqt((ProtoBuf.Type) it.next()));
            }
            java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) arrayList, (java.lang.Iterable) C59127zbF.this.QOLQEE().EZpvd().AEQbTJ().OLrzqt(C59127zbF.this));
            java.util.ArrayList<yNO.Activity> arrayList2 = new java.util.ArrayList();
            java.util.Iterator it2 = listDjBIcL.iterator();
            while (it2.hasNext()) {
                InterfaceC56663yNs interfaceC56663yNsOLrzqt = ((AbstractC59233zdF) it2.next()).djBIcL().OLrzqt();
                yNO.Activity activity = interfaceC56663yNsOLrzqt instanceof yNO.Activity ? (yNO.Activity) interfaceC56663yNsOLrzqt : null;
                if (activity != null) {
                    arrayList2.add(activity);
                }
            }
            if (!arrayList2.isEmpty()) {
                InterfaceC59148zba interfaceC59148zbaGEmmrt = C59127zbF.this.QOLQEE().EZpvd().gEmmrt();
                C59127zbF c59127zbF2 = C59127zbF.this;
                java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
                for (yNO.Activity activity2 : arrayList2) {
                    C56929yXo c56929yXoEZpvd = yZE.EZpvd((InterfaceC56663yNs) activity2);
                    if (c56929yXoEZpvd == null || (c56933yXsAEQbTJ = c56929yXoEZpvd.AEQbTJ()) == null || (strAEQbTJ = c56933yXsAEQbTJ.KWHzl()) == null) {
                        strAEQbTJ = activity2.bR_().AEQbTJ();
                        Intrinsics.checkNotNullExpressionValue(strAEQbTJ, "");
                    }
                    arrayList3.add(strAEQbTJ);
                }
                interfaceC59148zbaGEmmrt.KWHzl(c59127zbF2, arrayList3);
            }
            return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(listDjBIcL);
        }

        @Override // o.InterfaceC59315zei
        public java.util.List<InterfaceC56691yOt> copydefault() {
            return this.EZpvd.invoke();
        }

        public java.lang.String toString() {
            java.lang.String string = C59127zbF.this.bR_().toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }

        @Override // o.AbstractC59197zcW
        public InterfaceC56685yOn djBIcL() {
            return InterfaceC56685yOn.Activity.KWHzl;
        }
    }

    /* JADX INFO: renamed from: o.zbF$TaskDescription */
    public final class TaskDescription extends AbstractC59147zbZ {
        public final /* synthetic */ C59127zbF AEQbTJ;
        public final InterfaceC59182zcH<java.util.Collection<InterfaceC56665yNu>> KWHzl;
        public final InterfaceC59182zcH<java.util.Collection<AbstractC59233zdF>> OLrzqt;
        public final AbstractC59287zeG copydefault;

        public static final java.util.List OLrzqt(java.util.List list) {
            return list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C59127zbF OLrzqt() {
            return this.AEQbTJ;
        }

        public TaskDescription(@NotNull C59127zbF c59127zbF, AbstractC59287zeG abstractC59287zeG) {
            Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
            this.AEQbTJ = c59127zbF;
            C59087zaS c59087zaSQOLQEE = c59127zbF.QOLQEE();
            java.util.List<ProtoBuf.Function> functionList = c59127zbF.QKVWgx().getFunctionList();
            Intrinsics.checkNotNullExpressionValue(functionList, "");
            java.util.List<ProtoBuf.Property> propertyList = c59127zbF.QKVWgx().getPropertyList();
            Intrinsics.checkNotNullExpressionValue(propertyList, "");
            java.util.List<ProtoBuf.TypeAlias> typeAliasList = c59127zbF.QKVWgx().getTypeAliasList();
            Intrinsics.checkNotNullExpressionValue(typeAliasList, "");
            java.util.List<java.lang.Integer> nestedClassNameList = c59127zbF.QKVWgx().getNestedClassNameList();
            Intrinsics.checkNotNullExpressionValue(nestedClassNameList, "");
            yWS ywsCopydefault = c59127zbF.QOLQEE().copydefault();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(nestedClassNameList, 10));
            java.util.Iterator<T> it = nestedClassNameList.iterator();
            while (it.hasNext()) {
                arrayList.add(C59160zbm.OLrzqt(ywsCopydefault, ((java.lang.Number) it.next()).intValue()));
            }
            super(c59087zaSQOLQEE, functionList, propertyList, typeAliasList, new C59138zbQ(arrayList));
            this.copydefault = abstractC59287zeG;
            this.KWHzl = valueOf().valueOf().KWHzl(new C59141zbT(this));
            this.OLrzqt = valueOf().valueOf().KWHzl(new C59139zbR(this));
        }

        public static final java.util.Collection copydefault(TaskDescription taskDescription) {
            return taskDescription.EZpvd(yZU.AEQbTJ, InterfaceC59098zad.hDKMBd.AEQbTJ(), NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
        }

        public static final java.util.Collection KWHzl(TaskDescription taskDescription) {
            return taskDescription.copydefault.OLrzqt(taskDescription.OLrzqt());
        }

        @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
        public java.util.Collection<InterfaceC56665yNu> copydefault(@NotNull yZU yzu, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
            Intrinsics.checkNotNullParameter(yzu, "");
            Intrinsics.checkNotNullParameter(function1, "");
            return this.KWHzl.invoke();
        }

        @Override // o.AbstractC59147zbZ, o.AbstractC59100zaf, o.InterfaceC59098zad, o.InterfaceC59101zag
        public java.util.Collection<InterfaceC56687yOp> AEQbTJ(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(yqv, "");
            OLrzqt(c56935yXu, yqv);
            return super.AEQbTJ(c56935yXu, yqv);
        }

        @Override // o.AbstractC59147zbZ, o.AbstractC59100zaf, o.InterfaceC59098zad
        public java.util.Collection<InterfaceC56676yOe> copydefault(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(yqv, "");
            OLrzqt(c56935yXu, yqv);
            return super.copydefault(c56935yXu, yqv);
        }

        @Override // o.AbstractC59147zbZ
        public boolean OLrzqt(@NotNull InterfaceC56687yOp interfaceC56687yOp) {
            Intrinsics.checkNotNullParameter(interfaceC56687yOp, "");
            return valueOf().EZpvd().fIwbmz().copydefault(this.AEQbTJ, interfaceC56687yOp);
        }

        @Override // o.AbstractC59147zbZ
        public void EZpvd(@NotNull C56935yXu c56935yXu, @NotNull java.util.List<InterfaceC56687yOp> list) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<AbstractC59233zdF> it = this.OLrzqt.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().OLrzqt().AEQbTJ(c56935yXu, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            list.addAll(valueOf().EZpvd().AEQbTJ().AEQbTJ(c56935yXu, this.AEQbTJ));
            copydefault(c56935yXu, arrayList, list);
        }

        @Override // o.AbstractC59147zbZ
        public void KWHzl(@NotNull C56935yXu c56935yXu, @NotNull java.util.List<InterfaceC56676yOe> list) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<AbstractC59233zdF> it = this.OLrzqt.invoke().iterator();
            while (it.hasNext()) {
                arrayList.addAll(it.next().OLrzqt().copydefault(c56935yXu, NoLookupLocation.FOR_ALREADY_TRACKED));
            }
            copydefault(c56935yXu, arrayList, list);
        }

        public final <D extends CallableMemberDescriptor> void copydefault(C56935yXu c56935yXu, java.util.Collection<? extends D> collection, java.util.List<D> list) {
            valueOf().EZpvd().DbNXlk().KWHzl().OLrzqt(c56935yXu, collection, new java.util.ArrayList(list), OLrzqt(), new Application(list));
        }

        /* JADX INFO: renamed from: o.zbF$TaskDescription$Application */
        public static final class Application extends yYG {
            public final /* synthetic */ java.util.List<D> KWHzl;

            public Application(java.util.List<D> list) {
                this.KWHzl = list;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // o.yYO
            public void KWHzl(CallableMemberDescriptor callableMemberDescriptor) {
                Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
                OverridingUtil.AEQbTJ(callableMemberDescriptor, (Function1<CallableMemberDescriptor, Unit>) null);
                this.KWHzl.add((D) callableMemberDescriptor);
            }

            @Override // o.yYG
            public void OLrzqt(CallableMemberDescriptor callableMemberDescriptor, CallableMemberDescriptor callableMemberDescriptor2) {
                Intrinsics.checkNotNullParameter(callableMemberDescriptor, "");
                Intrinsics.checkNotNullParameter(callableMemberDescriptor2, "");
                if (callableMemberDescriptor2 instanceof AbstractC56718yPt) {
                    ((AbstractC56718yPt) callableMemberDescriptor2).copydefault(yNB.KWHzl, callableMemberDescriptor);
                }
            }
        }

        @Override // o.AbstractC59147zbZ
        public java.util.Set<C56935yXu> AhwBna() {
            java.util.List<AbstractC59233zdF> listBV_ = OLrzqt().iwGUEr.bV_();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            java.util.Iterator<T> it = listBV_.iterator();
            while (it.hasNext()) {
                C56406yEe.KWHzl(linkedHashSet, ((AbstractC59233zdF) it.next()).OLrzqt().AEQbTJ());
            }
            linkedHashSet.addAll(valueOf().EZpvd().AEQbTJ().copydefault(this.AEQbTJ));
            return linkedHashSet;
        }

        @Override // o.AbstractC59147zbZ
        public java.util.Set<C56935yXu> djBIcL() {
            java.util.List<AbstractC59233zdF> listBV_ = OLrzqt().iwGUEr.bV_();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            java.util.Iterator<T> it = listBV_.iterator();
            while (it.hasNext()) {
                C56406yEe.KWHzl(linkedHashSet, ((AbstractC59233zdF) it.next()).OLrzqt().bP_());
            }
            return linkedHashSet;
        }

        @Override // o.AbstractC59147zbZ
        public java.util.Set<C56935yXu> KWHzl() {
            java.util.List<AbstractC59233zdF> listBV_ = OLrzqt().iwGUEr.bV_();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            java.util.Iterator<T> it = listBV_.iterator();
            while (it.hasNext()) {
                java.util.Set<C56935yXu> setEZpvd = ((AbstractC59233zdF) it.next()).OLrzqt().EZpvd();
                if (setEZpvd == null) {
                    return null;
                }
                C56406yEe.KWHzl(linkedHashSet, setEZpvd);
            }
            return linkedHashSet;
        }

        @Override // o.AbstractC59147zbZ, o.AbstractC59100zaf, o.InterfaceC59101zag
        public InterfaceC56663yNs EZpvd(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
            InterfaceC56658yNn interfaceC56658yNnEZpvd;
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(yqv, "");
            OLrzqt(c56935yXu, yqv);
            Application application = OLrzqt().AhwBna;
            return (application == null || (interfaceC56658yNnEZpvd = application.EZpvd(c56935yXu)) == null) ? super.EZpvd(c56935yXu, yqv) : interfaceC56658yNnEZpvd;
        }

        @Override // o.AbstractC59147zbZ
        public C56929yXo EZpvd(@NotNull C56935yXu c56935yXu) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            return this.AEQbTJ.OLrzqt.EZpvd(c56935yXu);
        }

        @Override // o.AbstractC59147zbZ
        public void copydefault(@NotNull java.util.Collection<InterfaceC56665yNu> collection, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
            Intrinsics.checkNotNullParameter(collection, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Application application = OLrzqt().AhwBna;
            java.util.Collection<InterfaceC56658yNn> collectionEZpvd = application != null ? application.EZpvd() : null;
            if (collectionEZpvd == null) {
                collectionEZpvd = yDY.AhwBna();
            }
            collection.addAll(collectionEZpvd);
        }

        @Override // o.AbstractC59100zaf, o.InterfaceC59101zag
        public void OLrzqt(@NotNull C56935yXu c56935yXu, @NotNull yQV yqv) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            Intrinsics.checkNotNullParameter(yqv, "");
            yQU.EZpvd(valueOf().EZpvd().isConnected(), yqv, OLrzqt(), c56935yXu);
        }
    }

    /* JADX INFO: renamed from: o.zbF$Application */
    public final class Application {
        public final InterfaceC59179zcE<C56935yXu, InterfaceC56658yNn> EZpvd;
        public final InterfaceC59182zcH<java.util.Set<C56935yXu>> KWHzl;
        public final java.util.Map<C56935yXu, ProtoBuf.EnumEntry> OLrzqt;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Application() {
            java.util.List<ProtoBuf.EnumEntry> enumEntryList = C59127zbF.this.QKVWgx().getEnumEntryList();
            Intrinsics.checkNotNullExpressionValue(enumEntryList, "");
            LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(enumEntryList, 10)), 16));
            for (java.lang.Object obj : enumEntryList) {
                linkedHashMap.put(C59160zbm.OLrzqt(C59127zbF.this.QOLQEE().copydefault(), ((ProtoBuf.EnumEntry) obj).getName()), obj);
            }
            this.OLrzqt = linkedHashMap;
            this.EZpvd = C59127zbF.this.QOLQEE().valueOf().OLrzqt(new C59143zbV(this, C59127zbF.this));
            this.KWHzl = C59127zbF.this.QOLQEE().valueOf().KWHzl(new C59146zbY(this));
        }

        public static final InterfaceC56658yNn OLrzqt(Application application, C59127zbF c59127zbF, C56935yXu c56935yXu) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            ProtoBuf.EnumEntry enumEntry = application.OLrzqt.get(c56935yXu);
            if (enumEntry != null) {
                return C56712yPn.AEQbTJ(c59127zbF.QOLQEE().valueOf(), c59127zbF, c56935yXu, application.KWHzl, new C59129zbH(c59127zbF.QOLQEE().valueOf(), new C59142zbU(c59127zbF, enumEntry)), InterfaceC56686yOo.copydefault);
            }
            return null;
        }

        public static final java.util.List OLrzqt(C59127zbF c59127zbF, ProtoBuf.EnumEntry enumEntry) {
            return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(c59127zbF.QOLQEE().EZpvd().copydefault().KWHzl(c59127zbF.QVAiDq(), enumEntry));
        }

        public static final java.util.Set OLrzqt(Application application) {
            return application.KWHzl();
        }

        public final InterfaceC56658yNn EZpvd(@NotNull C56935yXu c56935yXu) {
            Intrinsics.checkNotNullParameter(c56935yXu, "");
            return this.EZpvd.invoke(c56935yXu);
        }

        public final java.util.Set<C56935yXu> KWHzl() {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator<AbstractC59233zdF> it = C59127zbF.this.fJNWhG().bV_().iterator();
            while (it.hasNext()) {
                for (InterfaceC56665yNu interfaceC56665yNu : InterfaceC59101zag.Application.getContributedDescriptors$default(it.next().OLrzqt(), null, null, 3, null)) {
                    if ((interfaceC56665yNu instanceof InterfaceC56687yOp) || (interfaceC56665yNu instanceof InterfaceC56676yOe)) {
                        hashSet.add(((CallableMemberDescriptor) interfaceC56665yNu).bR_());
                    }
                }
            }
            java.util.List<ProtoBuf.Function> functionList = C59127zbF.this.QKVWgx().getFunctionList();
            Intrinsics.checkNotNullExpressionValue(functionList, "");
            C59127zbF c59127zbF = C59127zbF.this;
            java.util.Iterator<T> it2 = functionList.iterator();
            while (it2.hasNext()) {
                hashSet.add(C59160zbm.OLrzqt(c59127zbF.QOLQEE().copydefault(), ((ProtoBuf.Function) it2.next()).getName()));
            }
            java.util.List<ProtoBuf.Property> propertyList = C59127zbF.this.QKVWgx().getPropertyList();
            Intrinsics.checkNotNullExpressionValue(propertyList, "");
            C59127zbF c59127zbF2 = C59127zbF.this;
            java.util.Iterator<T> it3 = propertyList.iterator();
            while (it3.hasNext()) {
                hashSet.add(C59160zbm.OLrzqt(c59127zbF2.QOLQEE().copydefault(), ((ProtoBuf.Property) it3.next()).getName()));
            }
            return yEJ.KWHzl(hashSet, hashSet);
        }

        public final java.util.Collection<InterfaceC56658yNn> EZpvd() {
            java.util.Set<C56935yXu> setKeySet = this.OLrzqt.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                InterfaceC56658yNn interfaceC56658yNnEZpvd = EZpvd((C56935yXu) it.next());
                if (interfaceC56658yNnEZpvd != null) {
                    arrayList.add(interfaceC56658yNnEZpvd);
                }
            }
            return arrayList;
        }
    }
}
