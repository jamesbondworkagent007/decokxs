package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class ySD implements InterfaceC56787ySh {
    public static final /* synthetic */ yJA<java.lang.Object>[] KWHzl = {C56524yIo.copydefault(new PropertyReference1Impl(ySD.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(ySD.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)), C56524yIo.copydefault(new PropertyReference1Impl(ySD.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};
    public final C56794ySo AEQbTJ;
    public final InterfaceC59182zcH AYXKKw;
    public final yTK AhwBna;
    public final InterfaceC59182zcH EZpvd;
    public final InterfaceC59180zcF OLrzqt;
    public final boolean copydefault;
    public final boolean djBIcL;
    public final yTO valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/yOo; */
    @Override // o.yOJ
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public yTK EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56787ySh
    public boolean valueOf() {
        return this.djBIcL;
    }

    public ySD(@NotNull C56794ySo c56794ySo, @NotNull yTO yto, boolean z) {
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(yto, "");
        this.AEQbTJ = c56794ySo;
        this.valueOf = yto;
        this.OLrzqt = c56794ySo.EZpvd().copydefault(new ySG(this));
        this.AYXKKw = c56794ySo.EZpvd().KWHzl(new ySH(this));
        this.AhwBna = c56794ySo.copydefault().AuCTel().KWHzl(yto);
        this.EZpvd = c56794ySo.EZpvd().KWHzl(new ySF(this));
        this.djBIcL = yto.EZpvd();
        this.copydefault = yto.KWHzl() || z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.ySo)
  (r2v0 o.yTO)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(o.ySo, o.yTO, boolean):void (m)] (LINE:41) call: o.ySD.<init>(o.ySo, o.yTO, boolean):void type: THIS */
    public /* synthetic */ ySD(C56794ySo c56794ySo, yTO yto, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c56794ySo, yto, (i & 4) != 0 ? false : z);
    }

    @Override // o.yOJ
    public C56933yXs KWHzl() {
        return (C56933yXs) C59183zcI.EZpvd(this.OLrzqt, this, KWHzl[0]);
    }

    public static final C56933yXs EZpvd(ySD ysd) {
        C56929yXo c56929yXoAEQbTJ = ysd.valueOf.AEQbTJ();
        if (c56929yXoAEQbTJ != null) {
            return c56929yXoAEQbTJ.AEQbTJ();
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ()Lo/zdF; */
    @Override // o.yOJ
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public AbstractC59242zdO AEQbTJ() {
        return (AbstractC59242zdO) C59183zcI.AEQbTJ(this.AYXKKw, this, KWHzl[1]);
    }

    public static final AbstractC59242zdO gEmmrt(ySD ysd) {
        C56933yXs c56933yXsKWHzl = ysd.KWHzl();
        if (c56933yXsKWHzl == null) {
            return C59370zfk.EZpvd(ErrorTypeKind.NOT_FOUND_FQNAME_FOR_JAVA_ANNOTATION, ysd.valueOf.toString());
        }
        InterfaceC56658yNn interfaceC56658yNnMapJavaToKotlin$default = yMP.mapJavaToKotlin$default(yMP.copydefault, c56933yXsKWHzl, ysd.AEQbTJ.AEQbTJ().AEQbTJ(), null, 4, null);
        if (interfaceC56658yNnMapJavaToKotlin$default == null) {
            yTT yttAYXKKw = ysd.valueOf.AYXKKw();
            interfaceC56658yNnMapJavaToKotlin$default = yttAYXKKw != null ? ysd.AEQbTJ.copydefault().values().KWHzl(yttAYXKKw) : null;
            if (interfaceC56658yNnMapJavaToKotlin$default == null) {
                interfaceC56658yNnMapJavaToKotlin$default = ysd.OLrzqt(c56933yXsKWHzl);
            }
        }
        return interfaceC56658yNnMapJavaToKotlin$default.bQ_();
    }

    @Override // o.yOJ
    public java.util.Map<C56935yXu, AbstractC56975yZg<?>> OLrzqt() {
        return (java.util.Map) C59183zcI.AEQbTJ(this.EZpvd, this, KWHzl[2]);
    }

    public static final java.util.Map AEQbTJ(ySD ysd) {
        java.util.Collection<yTN> collectionCopydefault = ysd.valueOf.copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (yTN ytn : collectionCopydefault) {
            C56935yXu c56935yXuAEQbTJ = ytn.AEQbTJ();
            if (c56935yXuAEQbTJ == null) {
                c56935yXuAEQbTJ = yRE.OLrzqt;
            }
            AbstractC56975yZg<?> abstractC56975yZgEZpvd = ysd.EZpvd(ytn);
            kotlin.Pair pairOLrzqt = abstractC56975yZgEZpvd != null ? C56390yDp.OLrzqt(c56935yXuAEQbTJ, abstractC56975yZgEZpvd) : null;
            if (pairOLrzqt != null) {
                arrayList.add(pairOLrzqt);
            }
        }
        return C56424yEw.copydefault(arrayList);
    }

    public final AbstractC56975yZg<?> EZpvd(yTN ytn) {
        if (ytn instanceof yTX) {
            return C56978yZj.createConstantValue$default(C56978yZj.OLrzqt, ((yTX) ytn).EZpvd(), null, 2, null);
        }
        if (ytn instanceof yTV) {
            yTV ytv = (yTV) ytn;
            return copydefault(ytv.EZpvd(), ytv.OLrzqt());
        }
        if (!(ytn instanceof yTL)) {
            if (ytn instanceof yTP) {
                return KWHzl(((yTP) ytn).OLrzqt());
            }
            if (ytn instanceof yTR) {
                return copydefault(((yTR) ytn).OLrzqt());
            }
            return null;
        }
        yTL ytl = (yTL) ytn;
        C56935yXu c56935yXuAEQbTJ = ytl.AEQbTJ();
        if (c56935yXuAEQbTJ == null) {
            c56935yXuAEQbTJ = yRE.OLrzqt;
        }
        Intrinsics.copydefault(c56935yXuAEQbTJ);
        return AEQbTJ(c56935yXuAEQbTJ, ytl.KWHzl());
    }

    public final AbstractC56975yZg<?> KWHzl(yTO yto) {
        return new C56970yZb(new ySD(this.AEQbTJ, yto, false, 4, null));
    }

    public final AbstractC56975yZg<?> AEQbTJ(C56935yXu c56935yXu, java.util.List<? extends yTN> list) {
        AbstractC59233zdF abstractC59233zdFAEQbTJ;
        if (C59238zdK.AEQbTJ(AEQbTJ())) {
            return null;
        }
        InterfaceC56658yNn interfaceC56658yNnOLrzqt = yZE.OLrzqt(this);
        Intrinsics.copydefault(interfaceC56658yNnOLrzqt);
        InterfaceC56695yOx interfaceC56695yOxKWHzl = yRO.KWHzl(c56935yXu, interfaceC56658yNnOLrzqt);
        if (interfaceC56695yOxKWHzl == null || (abstractC59233zdFAEQbTJ = interfaceC56695yOxKWHzl.uzCIH()) == null) {
            abstractC59233zdFAEQbTJ = this.AEQbTJ.copydefault().fetchVPNInfo().AEQbTJ().AEQbTJ(Variance.INVARIANT, C59370zfk.EZpvd(ErrorTypeKind.UNKNOWN_ARRAY_ELEMENT_TYPE_OF_ANNOTATION_ARGUMENT, new java.lang.String[0]));
            Intrinsics.checkNotNullExpressionValue(abstractC59233zdFAEQbTJ, "");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            AbstractC56975yZg<?> abstractC56975yZgEZpvd = EZpvd((yTN) it.next());
            if (abstractC56975yZgEZpvd == null) {
                abstractC56975yZgEZpvd = new C56992yZx();
            }
            arrayList.add(abstractC56975yZgEZpvd);
        }
        return C56978yZj.OLrzqt.copydefault(arrayList, abstractC59233zdFAEQbTJ);
    }

    public final AbstractC56975yZg<?> copydefault(C56929yXo c56929yXo, C56935yXu c56935yXu) {
        if (c56929yXo == null || c56935yXu == null) {
            return null;
        }
        return new C56981yZm(c56929yXo, c56935yXu);
    }

    public final AbstractC56975yZg<?> copydefault(InterfaceC56839yUf interfaceC56839yUf) {
        return C56984yZp.OLrzqt.OLrzqt(this.AEQbTJ.AYXKKw().EZpvd(interfaceC56839yUf, C56831yTy.toAttributes$default(TypeUsage.COMMON, false, false, null, 7, null)));
    }

    public java.lang.String toString() {
        return yXX.renderAnnotation$default(yXX.gEmmrt, this, null, 2, null);
    }

    public final InterfaceC56658yNn OLrzqt(C56933yXs c56933yXs) {
        return yNE.OLrzqt(this.AEQbTJ.AEQbTJ(), C56929yXo.AEQbTJ.KWHzl(c56933yXs), this.AEQbTJ.copydefault().KWHzl().KWHzl().fARcdN());
    }
}
