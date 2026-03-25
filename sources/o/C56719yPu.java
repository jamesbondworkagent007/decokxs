package o;

import java.util.Collections;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yPu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56719yPu extends AbstractC56722yPx {
    public java.util.List<InterfaceC56691yOt> AEQbTJ;
    public TypeSubstitutor EZpvd;
    public InterfaceC59315zei KWHzl;
    public final AbstractC56722yPx OLrzqt;
    public final TypeSubstitutor copydefault;
    public java.util.List<InterfaceC56691yOt> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void KWHzl(int i) {
        java.lang.String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10 || i == 13 || i == 23) ? 3 : 2];
        if (i == 2) {
            objArr[0] = "typeArguments";
        } else if (i == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i != 6) {
            if (i != 8) {
                if (i != 10) {
                    if (i != 13) {
                        if (i != 23) {
                            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                        } else {
                            objArr[0] = "substitutor";
                        }
                    }
                }
            }
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 31:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i == 2 || i == 3 || i == 5 || i == 6 || i == 8 || i == 10) {
            objArr[2] = "getMemberScope";
        } else if (i == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i == 23) {
            objArr[2] = "substitute";
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 8 && i != 10 && i != 13 && i != 23) {
            throw new java.lang.IllegalStateException(str2);
        }
        throw new java.lang.IllegalArgumentException(str2);
    }

    public C56719yPu(AbstractC56722yPx abstractC56722yPx, TypeSubstitutor typeSubstitutor) {
        this.OLrzqt = abstractC56722yPx;
        this.copydefault = typeSubstitutor;
    }

    public final TypeSubstitutor AEQbTJ() {
        if (this.EZpvd == null) {
            if (this.copydefault.EZpvd()) {
                this.EZpvd = this.copydefault;
            } else {
                java.util.List<InterfaceC56691yOt> listCopydefault = this.OLrzqt.fJNWhG().copydefault();
                this.djBIcL = new java.util.ArrayList(listCopydefault.size());
                this.EZpvd = C59268zdo.AEQbTJ(listCopydefault, this.copydefault.KWHzl(), this, this.djBIcL);
                this.AEQbTJ = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) this.djBIcL, (Function1) new Function1<InterfaceC56691yOt, java.lang.Boolean>() { // from class: o.yPu.4
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public java.lang.Boolean invoke(InterfaceC56691yOt interfaceC56691yOt) {
                        return java.lang.Boolean.valueOf(!interfaceC56691yOt.fetchVPNInfo());
                    }
                });
            }
        }
        return this.EZpvd;
    }

    @Override // o.InterfaceC56663yNs
    public InterfaceC59315zei fJNWhG() {
        InterfaceC59315zei interfaceC59315zeiFJNWhG = this.OLrzqt.fJNWhG();
        if (this.copydefault.EZpvd()) {
            if (interfaceC59315zeiFJNWhG == null) {
                KWHzl(0);
            }
            return interfaceC59315zeiFJNWhG;
        }
        if (this.KWHzl == null) {
            TypeSubstitutor typeSubstitutorAEQbTJ = AEQbTJ();
            java.util.Collection<AbstractC59233zdF> collectionBV_ = interfaceC59315zeiFJNWhG.bV_();
            java.util.ArrayList arrayList = new java.util.ArrayList(collectionBV_.size());
            java.util.Iterator<AbstractC59233zdF> it = collectionBV_.iterator();
            while (it.hasNext()) {
                arrayList.add(typeSubstitutorAEQbTJ.OLrzqt(it.next(), Variance.INVARIANT));
            }
            this.KWHzl = new C59256zdc(this, this.djBIcL, arrayList, LockBasedStorageManager.KWHzl);
        }
        InterfaceC59315zei interfaceC59315zei = this.KWHzl;
        if (interfaceC59315zei == null) {
            KWHzl(1);
        }
        return interfaceC59315zei;
    }

    @Override // o.AbstractC56722yPx
    public InterfaceC59098zad KWHzl(@NotNull AbstractC59325zes abstractC59325zes, @NotNull AbstractC59287zeG abstractC59287zeG) {
        if (abstractC59325zes == null) {
            KWHzl(5);
        }
        if (abstractC59287zeG == null) {
            KWHzl(6);
        }
        InterfaceC59098zad interfaceC59098zadKWHzl = this.OLrzqt.KWHzl(abstractC59325zes, abstractC59287zeG);
        if (!this.copydefault.EZpvd()) {
            return new C59107zam(interfaceC59098zadKWHzl, AEQbTJ());
        }
        if (interfaceC59098zadKWHzl == null) {
            KWHzl(7);
        }
        return interfaceC59098zadKWHzl;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC59098zad copydefault(@NotNull AbstractC59325zes abstractC59325zes) {
        if (abstractC59325zes == null) {
            KWHzl(10);
        }
        InterfaceC59098zad interfaceC59098zadKWHzl = KWHzl(abstractC59325zes, yZE.OLrzqt(yYH.OLrzqt(this)));
        if (interfaceC59098zadKWHzl == null) {
            KWHzl(11);
        }
        return interfaceC59098zadKWHzl;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC59098zad ORxRYg() {
        InterfaceC59098zad interfaceC59098zadAEQbTJ = AEQbTJ(yZE.OLrzqt(yYH.OLrzqt(this.OLrzqt)));
        if (interfaceC59098zadAEQbTJ == null) {
            KWHzl(12);
        }
        return interfaceC59098zadAEQbTJ;
    }

    @Override // o.AbstractC56722yPx
    public InterfaceC59098zad AEQbTJ(@NotNull AbstractC59287zeG abstractC59287zeG) {
        if (abstractC59287zeG == null) {
            KWHzl(13);
        }
        InterfaceC59098zad interfaceC59098zadAEQbTJ = this.OLrzqt.AEQbTJ(abstractC59287zeG);
        if (!this.copydefault.EZpvd()) {
            return new C59107zam(interfaceC59098zadAEQbTJ, AEQbTJ());
        }
        if (interfaceC59098zadAEQbTJ == null) {
            KWHzl(14);
        }
        return interfaceC59098zadAEQbTJ;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC59098zad ejfBZ() {
        InterfaceC59098zad interfaceC59098zadEjfBZ = this.OLrzqt.ejfBZ();
        if (interfaceC59098zadEjfBZ == null) {
            KWHzl(15);
        }
        return interfaceC59098zadEjfBZ;
    }

    @Override // o.InterfaceC56658yNn, o.InterfaceC56663yNs
    public AbstractC59242zdO bQ_() {
        AbstractC59242zdO abstractC59242zdOOLrzqt = C59231zdD.OLrzqt(C59263zdj.OLrzqt.OLrzqt(copydefault(), null, null), fJNWhG(), C59322zep.OLrzqt(fJNWhG().copydefault()), false, ORxRYg());
        if (abstractC59242zdOOLrzqt == null) {
            KWHzl(16);
        }
        return abstractC59242zdOOLrzqt;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC56679yOh DTwDnp() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // o.InterfaceC56658yNn
    public java.util.List<InterfaceC56679yOh> AxsJAY() {
        java.util.List<InterfaceC56679yOh> listEmptyList = Collections.emptyList();
        if (listEmptyList == null) {
            KWHzl(17);
        }
        return listEmptyList;
    }

    @Override // o.InterfaceC56658yNn
    public java.util.Collection<InterfaceC56656yNl> djBIcL() {
        java.util.Collection<InterfaceC56656yNl> collectionDjBIcL = this.OLrzqt.djBIcL();
        java.util.ArrayList arrayList = new java.util.ArrayList(collectionDjBIcL.size());
        for (InterfaceC56656yNl interfaceC56656yNl : collectionDjBIcL) {
            arrayList.add(((InterfaceC56656yNl) interfaceC56656yNl.sSMYrx().KWHzl(interfaceC56656yNl.bT_()).copydefault(interfaceC56656yNl.isConnected()).copydefault(interfaceC56656yNl.getNewProxyInstance()).copydefault(interfaceC56656yNl.bW_()).KWHzl(false).AEQbTJ()).copydefault(AEQbTJ()));
        }
        return arrayList;
    }

    @Override // o.yOB
    public yOL copydefault() {
        yOL yolCopydefault = this.OLrzqt.copydefault();
        if (yolCopydefault == null) {
            KWHzl(19);
        }
        return yolCopydefault;
    }

    @Override // o.yNQ
    public C56935yXu bR_() {
        C56935yXu c56935yXuBR_ = this.OLrzqt.bR_();
        if (c56935yXuBR_ == null) {
            KWHzl(20);
        }
        return c56935yXuBR_;
    }

    /* JADX DEBUG: Method merged with bridge method: bS_()Lo/yNs; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    @Override // o.AbstractC56722yPx, o.InterfaceC56665yNu
    /* JADX INFO: renamed from: zuBGHE, reason: merged with bridge method [inline-methods] */
    public InterfaceC56658yNn bT_() {
        InterfaceC56658yNn interfaceC56658yNnBT_ = this.OLrzqt.bT_();
        if (interfaceC56658yNnBT_ == null) {
            KWHzl(21);
        }
        return interfaceC56658yNnBT_;
    }

    @Override // o.InterfaceC56658yNn, o.InterfaceC56666yNv, o.InterfaceC56665yNu
    /* JADX INFO: renamed from: AYXKKw */
    public InterfaceC56665yNu AuCTel() {
        InterfaceC56665yNu interfaceC56665yNuAuCTel = this.OLrzqt.AuCTel();
        if (interfaceC56665yNuAuCTel == null) {
            KWHzl(22);
        }
        return interfaceC56665yNuAuCTel;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yNv; */
    @Override // o.InterfaceC56688yOq
    public InterfaceC56658yNn OLrzqt(@NotNull TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            KWHzl(23);
        }
        return typeSubstitutor.EZpvd() ? this : new C56719yPu(this, TypeSubstitutor.AEQbTJ(typeSubstitutor.KWHzl(), AEQbTJ().KWHzl()));
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC56658yNn valueOf() {
        return this.OLrzqt.valueOf();
    }

    @Override // o.InterfaceC56658yNn
    public ClassKind DbNXlk() {
        ClassKind classKindDbNXlk = this.OLrzqt.DbNXlk();
        if (classKindDbNXlk == null) {
            KWHzl(25);
        }
        return classKindDbNXlk;
    }

    @Override // o.InterfaceC56658yNn, o.yNJ
    public Modality isConnected() {
        Modality modalityIsConnected = this.OLrzqt.isConnected();
        if (modalityIsConnected == null) {
            KWHzl(26);
        }
        return modalityIsConnected;
    }

    @Override // o.InterfaceC56658yNn, o.yNJ, o.InterfaceC56668yNx
    public yNC getNewProxyInstance() {
        yNC newProxyInstance = this.OLrzqt.getNewProxyInstance();
        if (newProxyInstance == null) {
            KWHzl(27);
        }
        return newProxyInstance;
    }

    @Override // o.InterfaceC56659yNo
    public boolean gHZMYf() {
        return this.OLrzqt.gHZMYf();
    }

    @Override // o.InterfaceC56658yNn
    public boolean AubY() {
        return this.OLrzqt.AubY();
    }

    @Override // o.InterfaceC56658yNn
    public boolean sSMYrx() {
        return this.OLrzqt.sSMYrx();
    }

    @Override // o.InterfaceC56658yNn
    public boolean wlaJM() {
        return this.OLrzqt.wlaJM();
    }

    @Override // o.InterfaceC56658yNn
    public boolean AwvSrB() {
        return this.OLrzqt.AwvSrB();
    }

    @Override // o.yNJ
    public boolean zsXlph() {
        return this.OLrzqt.zsXlph();
    }

    @Override // o.InterfaceC56658yNn
    public boolean AuCTelauCTel() {
        return this.OLrzqt.AuCTelauCTel();
    }

    @Override // o.yNJ
    public boolean zLjUOn() {
        return this.OLrzqt.zLjUOn();
    }

    @Override // o.yNJ
    public boolean hDKMBd() {
        return this.OLrzqt.hDKMBd();
    }

    @Override // o.InterfaceC56665yNu
    public <R, D> R AEQbTJ(InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        return interfaceC56667yNw.EZpvd(this, d);
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC59098zad OcIXYQ() {
        InterfaceC59098zad interfaceC59098zadOcIXYQ = this.OLrzqt.OcIXYQ();
        if (interfaceC59098zadOcIXYQ == null) {
            KWHzl(28);
        }
        return interfaceC59098zadOcIXYQ;
    }

    @Override // o.InterfaceC56658yNn
    public InterfaceC56656yNl uzCIH() {
        return this.OLrzqt.uzCIH();
    }

    @Override // o.InterfaceC56664yNt
    public InterfaceC56686yOo fARcdN() {
        InterfaceC56686yOo interfaceC56686yOo = InterfaceC56686yOo.copydefault;
        if (interfaceC56686yOo == null) {
            KWHzl(29);
        }
        return interfaceC56686yOo;
    }

    @Override // o.InterfaceC56658yNn, o.InterfaceC56659yNo
    public java.util.List<InterfaceC56691yOt> AkhnZx() {
        AEQbTJ();
        java.util.List<InterfaceC56691yOt> list = this.AEQbTJ;
        if (list == null) {
            KWHzl(30);
        }
        return list;
    }

    @Override // o.InterfaceC56658yNn
    public java.util.Collection<InterfaceC56658yNn> fetchVPNInfo() {
        java.util.Collection<InterfaceC56658yNn> collectionFetchVPNInfo = this.OLrzqt.fetchVPNInfo();
        if (collectionFetchVPNInfo == null) {
            KWHzl(31);
        }
        return collectionFetchVPNInfo;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: o.yOA<Other extends o.zfu>, o.yOA<o.zdO> */
    @Override // o.InterfaceC56658yNn
    public yOA<AbstractC59242zdO> iwGUEr() {
        yOA<AbstractC59242zdO> yoaIwGUEr = this.OLrzqt.iwGUEr();
        if (yoaIwGUEr == null) {
            return null;
        }
        return yoaIwGUEr.EZpvd(new Function1<AbstractC59242zdO, AbstractC59242zdO>() { // from class: o.yPu.1
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
            public AbstractC59242zdO invoke(AbstractC59242zdO abstractC59242zdO) {
                return C56719yPu.this.EZpvd(abstractC59242zdO);
            }
        });
    }

    public final AbstractC59242zdO EZpvd(AbstractC59242zdO abstractC59242zdO) {
        return (abstractC59242zdO == null || this.copydefault.EZpvd()) ? abstractC59242zdO : (AbstractC59242zdO) AEQbTJ().OLrzqt(abstractC59242zdO, Variance.INVARIANT);
    }
}
