package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import o.InterfaceC59098zad;
import o.InterfaceC59307zea;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59253zdZ {
    public static final Application KWHzl = new Application(null);
    public static final C59253zdZ OLrzqt = new C59253zdZ(InterfaceC59307zea.ActionBar.KWHzl, false);
    public final InterfaceC59307zea AEQbTJ;
    public final boolean copydefault;

    public C59253zdZ(@NotNull InterfaceC59307zea interfaceC59307zea, boolean z) {
        Intrinsics.checkNotNullParameter(interfaceC59307zea, "");
        this.AEQbTJ = interfaceC59307zea;
        this.copydefault = z;
    }

    public final AbstractC59242zdO AEQbTJ(@NotNull C59310zed c59310zed, @NotNull C59308zeb c59308zeb) {
        Intrinsics.checkNotNullParameter(c59310zed, "");
        Intrinsics.checkNotNullParameter(c59308zeb, "");
        return EZpvd(c59310zed, c59308zeb, false, 0, true);
    }

    public final AbstractC59242zdO EZpvd(C59310zed c59310zed, C59308zeb c59308zeb, boolean z, int i, boolean z2) {
        InterfaceC59317zek interfaceC59317zekAEQbTJ = AEQbTJ(new C59323zeq(Variance.INVARIANT, c59310zed.EZpvd().djBIcL()), c59310zed, null, i);
        AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zekAEQbTJ.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
        AbstractC59242zdO abstractC59242zdOCopydefault = C59326zet.copydefault(abstractC59233zdFOLrzqt);
        if (C59238zdK.AEQbTJ(abstractC59242zdOCopydefault)) {
            return abstractC59242zdOCopydefault;
        }
        interfaceC59317zekAEQbTJ.EZpvd();
        copydefault(abstractC59242zdOCopydefault.copydefault(), C59259zdf.KWHzl(c59308zeb));
        AbstractC59242zdO abstractC59242zdOCopydefault2 = C59322zep.copydefault(copydefault(abstractC59242zdOCopydefault, c59308zeb), z);
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOCopydefault2, "");
        return z2 ? C59245zdR.AEQbTJ(abstractC59242zdOCopydefault2, OLrzqt(c59310zed, c59308zeb, z)) : abstractC59242zdOCopydefault2;
    }

    public final AbstractC59242zdO OLrzqt(C59310zed c59310zed, C59308zeb c59308zeb, boolean z) {
        InterfaceC59315zei interfaceC59315zeiFJNWhG = c59310zed.EZpvd().fJNWhG();
        Intrinsics.checkNotNullExpressionValue(interfaceC59315zeiFJNWhG, "");
        return C59231zdD.OLrzqt(c59308zeb, interfaceC59315zeiFJNWhG, c59310zed.copydefault(), z, InterfaceC59098zad.ActionBar.copydefault);
    }

    public final InterfaceC59317zek AEQbTJ(InterfaceC59317zek interfaceC59317zek, C59310zed c59310zed, InterfaceC56691yOt interfaceC56691yOt, int i) {
        Variance varianceValues;
        AbstractC59233zdF abstractC59233zdFEZpvd;
        Variance variance;
        Variance variance2;
        KWHzl.AEQbTJ(i, c59310zed.EZpvd());
        if (interfaceC59317zek.AEQbTJ()) {
            Intrinsics.copydefault(interfaceC56691yOt);
            InterfaceC59317zek interfaceC59317zekEZpvd = C59322zep.EZpvd(interfaceC56691yOt);
            Intrinsics.checkNotNullExpressionValue(interfaceC59317zekEZpvd, "");
            return interfaceC59317zekEZpvd;
        }
        AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zek.OLrzqt();
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
        InterfaceC59317zek interfaceC59317zekAEQbTJ = c59310zed.AEQbTJ(abstractC59233zdFOLrzqt.djBIcL());
        if (interfaceC59317zekAEQbTJ == null) {
            return AEQbTJ(interfaceC59317zek, c59310zed, i);
        }
        if (interfaceC59317zekAEQbTJ.AEQbTJ()) {
            Intrinsics.copydefault(interfaceC56691yOt);
            InterfaceC59317zek interfaceC59317zekEZpvd2 = C59322zep.EZpvd(interfaceC56691yOt);
            Intrinsics.checkNotNullExpressionValue(interfaceC59317zekEZpvd2, "");
            return interfaceC59317zekEZpvd2;
        }
        AbstractC59331zey abstractC59331zeyAkhnZx = interfaceC59317zekAEQbTJ.OLrzqt().AkhnZx();
        Variance varianceEZpvd = interfaceC59317zekAEQbTJ.EZpvd();
        Intrinsics.checkNotNullExpressionValue(varianceEZpvd, "");
        Variance varianceEZpvd2 = interfaceC59317zek.EZpvd();
        Intrinsics.checkNotNullExpressionValue(varianceEZpvd2, "");
        if (varianceEZpvd2 != varianceEZpvd && varianceEZpvd2 != (variance2 = Variance.INVARIANT)) {
            if (varianceEZpvd == variance2) {
                varianceEZpvd = varianceEZpvd2;
            } else {
                this.AEQbTJ.EZpvd(c59310zed.EZpvd(), interfaceC56691yOt, abstractC59331zeyAkhnZx);
            }
        }
        if (interfaceC56691yOt == null || (varianceValues = interfaceC56691yOt.values()) == null) {
            varianceValues = Variance.INVARIANT;
        }
        if (varianceValues != varianceEZpvd && varianceValues != (variance = Variance.INVARIANT)) {
            if (varianceEZpvd == variance) {
                varianceEZpvd = variance;
            } else {
                this.AEQbTJ.EZpvd(c59310zed.EZpvd(), interfaceC56691yOt, abstractC59331zeyAkhnZx);
            }
        }
        copydefault(abstractC59233zdFOLrzqt.copydefault(), abstractC59331zeyAkhnZx.copydefault());
        if (abstractC59331zeyAkhnZx instanceof C59266zdm) {
            abstractC59233zdFEZpvd = copydefault((C59266zdm) abstractC59331zeyAkhnZx, abstractC59233zdFOLrzqt.bX_());
        } else {
            abstractC59233zdFEZpvd = EZpvd(C59326zet.copydefault(abstractC59331zeyAkhnZx), abstractC59233zdFOLrzqt);
        }
        return new C59323zeq(varianceEZpvd, abstractC59233zdFEZpvd);
    }

    public final C59266zdm copydefault(C59266zdm c59266zdm, C59308zeb c59308zeb) {
        return c59266zdm.AEQbTJ(KWHzl(c59266zdm, c59308zeb));
    }

    public final AbstractC59242zdO copydefault(AbstractC59242zdO abstractC59242zdO, C59308zeb c59308zeb) {
        return C59238zdK.AEQbTJ(abstractC59242zdO) ? abstractC59242zdO : C59326zet.replace$default(abstractC59242zdO, null, KWHzl(abstractC59242zdO, c59308zeb), 1, null);
    }

    public final C59308zeb KWHzl(AbstractC59233zdF abstractC59233zdF, C59308zeb c59308zeb) {
        return C59238zdK.AEQbTJ(abstractC59233zdF) ? abstractC59233zdF.bX_() : c59308zeb.KWHzl(abstractC59233zdF.bX_());
    }

    public final void copydefault(yOL yol, yOL yol2) {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<yOJ> it = yol.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().KWHzl());
        }
        for (yOJ yoj : yol2) {
            if (hashSet.contains(yoj.KWHzl())) {
                this.AEQbTJ.OLrzqt(yoj);
            }
        }
    }

    public final AbstractC59242zdO copydefault(AbstractC59242zdO abstractC59242zdO, AbstractC59233zdF abstractC59233zdF) {
        AbstractC59242zdO abstractC59242zdOCopydefault = C59322zep.copydefault(abstractC59242zdO, abstractC59233zdF.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOCopydefault, "");
        return abstractC59242zdOCopydefault;
    }

    public final AbstractC59242zdO EZpvd(AbstractC59242zdO abstractC59242zdO, AbstractC59233zdF abstractC59233zdF) {
        return copydefault(copydefault(abstractC59242zdO, abstractC59233zdF), abstractC59233zdF.bX_());
    }

    public final InterfaceC59317zek AEQbTJ(InterfaceC59317zek interfaceC59317zek, C59310zed c59310zed, int i) {
        AbstractC59331zey abstractC59331zeyAkhnZx = interfaceC59317zek.OLrzqt().AkhnZx();
        if (C59275zdv.OLrzqt(abstractC59331zeyAkhnZx)) {
            return interfaceC59317zek;
        }
        AbstractC59242zdO abstractC59242zdOCopydefault = C59326zet.copydefault(abstractC59331zeyAkhnZx);
        if (C59238zdK.AEQbTJ(abstractC59242zdOCopydefault) || !C59336zfC.values(abstractC59242zdOCopydefault)) {
            return interfaceC59317zek;
        }
        InterfaceC59315zei interfaceC59315zeiDjBIcL = abstractC59242zdOCopydefault.djBIcL();
        InterfaceC56663yNs interfaceC56663yNsOLrzqt = interfaceC59315zeiDjBIcL.OLrzqt();
        interfaceC59315zeiDjBIcL.copydefault().size();
        abstractC59242zdOCopydefault.bY_().size();
        if (interfaceC56663yNsOLrzqt instanceof InterfaceC56691yOt) {
            return interfaceC59317zek;
        }
        if (interfaceC56663yNsOLrzqt instanceof InterfaceC56690yOs) {
            InterfaceC56690yOs interfaceC56690yOs = (InterfaceC56690yOs) interfaceC56663yNsOLrzqt;
            if (c59310zed.OLrzqt(interfaceC56690yOs)) {
                this.AEQbTJ.KWHzl(interfaceC56690yOs);
                return new C59323zeq(Variance.INVARIANT, C59370zfk.EZpvd(ErrorTypeKind.RECURSIVE_TYPE_ALIAS, interfaceC56690yOs.bR_().toString()));
            }
            java.util.List<InterfaceC59317zek> listBY_ = abstractC59242zdOCopydefault.bY_();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listBY_, 10));
            int i2 = 0;
            for (java.lang.Object obj : listBY_) {
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                arrayList.add(AEQbTJ((InterfaceC59317zek) obj, c59310zed, interfaceC59315zeiDjBIcL.copydefault().get(i2), i + 1));
                i2++;
            }
            AbstractC59242zdO abstractC59242zdOEZpvd = EZpvd(C59310zed.KWHzl.EZpvd(c59310zed, interfaceC56690yOs, arrayList), abstractC59242zdOCopydefault.bX_(), abstractC59242zdOCopydefault.AEQbTJ(), i + 1, false);
            AbstractC59242zdO abstractC59242zdOOLrzqt = OLrzqt(abstractC59242zdOCopydefault, c59310zed, i);
            if (!C59275zdv.OLrzqt(abstractC59242zdOEZpvd)) {
                abstractC59242zdOEZpvd = C59245zdR.AEQbTJ(abstractC59242zdOEZpvd, abstractC59242zdOOLrzqt);
            }
            return new C59323zeq(interfaceC59317zek.EZpvd(), abstractC59242zdOEZpvd);
        }
        AbstractC59242zdO abstractC59242zdOOLrzqt2 = OLrzqt(abstractC59242zdOCopydefault, c59310zed, i);
        copydefault((AbstractC59233zdF) abstractC59242zdOCopydefault, (AbstractC59233zdF) abstractC59242zdOOLrzqt2);
        return new C59323zeq(interfaceC59317zek.EZpvd(), abstractC59242zdOOLrzqt2);
    }

    public final AbstractC59242zdO OLrzqt(AbstractC59242zdO abstractC59242zdO, C59310zed c59310zed, int i) {
        InterfaceC59315zei interfaceC59315zeiDjBIcL = abstractC59242zdO.djBIcL();
        java.util.List<InterfaceC59317zek> listBY_ = abstractC59242zdO.bY_();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listBY_, 10));
        int i2 = 0;
        for (java.lang.Object obj : listBY_) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            InterfaceC59317zek interfaceC59317zek = (InterfaceC59317zek) obj;
            InterfaceC59317zek interfaceC59317zekAEQbTJ = AEQbTJ(interfaceC59317zek, c59310zed, interfaceC59315zeiDjBIcL.copydefault().get(i2), i + 1);
            if (!interfaceC59317zekAEQbTJ.AEQbTJ()) {
                interfaceC59317zekAEQbTJ = new C59323zeq(interfaceC59317zekAEQbTJ.EZpvd(), C59322zep.AEQbTJ(interfaceC59317zekAEQbTJ.OLrzqt(), interfaceC59317zek.OLrzqt().AEQbTJ()));
            }
            arrayList.add(interfaceC59317zekAEQbTJ);
            i2++;
        }
        return C59326zet.replace$default(abstractC59242zdO, arrayList, null, 2, null);
    }

    public final void copydefault(AbstractC59233zdF abstractC59233zdF, AbstractC59233zdF abstractC59233zdF2) {
        TypeSubstitutor typeSubstitutorOLrzqt = TypeSubstitutor.OLrzqt(abstractC59233zdF2);
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorOLrzqt, "");
        int i = 0;
        for (java.lang.Object obj : abstractC59233zdF2.bY_()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            InterfaceC59317zek interfaceC59317zek = (InterfaceC59317zek) obj;
            if (!interfaceC59317zek.AEQbTJ()) {
                AbstractC59233zdF abstractC59233zdFOLrzqt = interfaceC59317zek.OLrzqt();
                Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt, "");
                if (!C59336zfC.KWHzl(abstractC59233zdFOLrzqt)) {
                    InterfaceC59317zek interfaceC59317zek2 = abstractC59233zdF.bY_().get(i);
                    InterfaceC56691yOt interfaceC56691yOt = abstractC59233zdF.djBIcL().copydefault().get(i);
                    if (this.copydefault) {
                        InterfaceC59307zea interfaceC59307zea = this.AEQbTJ;
                        AbstractC59233zdF abstractC59233zdFOLrzqt2 = interfaceC59317zek2.OLrzqt();
                        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt2, "");
                        AbstractC59233zdF abstractC59233zdFOLrzqt3 = interfaceC59317zek.OLrzqt();
                        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFOLrzqt3, "");
                        Intrinsics.copydefault(interfaceC56691yOt);
                        interfaceC59307zea.copydefault(typeSubstitutorOLrzqt, abstractC59233zdFOLrzqt2, abstractC59233zdFOLrzqt3, interfaceC56691yOt);
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: o.zdZ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zdZ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void AEQbTJ(int i, InterfaceC56690yOs interfaceC56690yOs) {
            if (i <= 100) {
                return;
            }
            throw new java.lang.AssertionError("Too deep recursion while expanding type alias " + interfaceC56690yOs.bR_());
        }
    }
}
