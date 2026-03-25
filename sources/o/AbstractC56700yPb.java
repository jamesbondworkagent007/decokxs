package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.InterfaceC59098zad;
import o.yPS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yPb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56700yPb extends AbstractC56709yPk implements InterfaceC56690yOs {
    public static final /* synthetic */ yJA<java.lang.Object>[] copydefault = {C56524yIo.copydefault(new PropertyReference1Impl(AbstractC56700yPb.class, "constructors", "getConstructors()Ljava/util/Collection;", 0))};
    public final InterfaceC59182zcH AEQbTJ;
    public java.util.List<? extends InterfaceC56691yOt> EZpvd;
    public final InterfaceC59187zcM OLrzqt;
    public final StateListAnimator djBIcL;
    public final yNC valueOf;

    public abstract java.util.List<InterfaceC56691yOt> AuCTel();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.util.List<? extends InterfaceC56691yOt> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56663yNs
    public InterfaceC59315zei fJNWhG() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNJ, o.InterfaceC56668yNx
    public yNC getNewProxyInstance() {
        return this.valueOf;
    }

    @Override // o.yNJ
    public boolean hDKMBd() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC59187zcM values() {
        return this.OLrzqt;
    }

    @Override // o.yNJ
    public boolean zLjUOn() {
        return false;
    }

    @Override // o.yNJ
    public boolean zsXlph() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC56700yPb(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yOL yol, @NotNull C56935yXu c56935yXu, @NotNull InterfaceC56686yOo interfaceC56686yOo, @NotNull yNC ync) {
        super(interfaceC56665yNu, yol, c56935yXu, interfaceC56686yOo);
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(interfaceC56686yOo, "");
        Intrinsics.checkNotNullParameter(ync, "");
        this.OLrzqt = interfaceC59187zcM;
        this.valueOf = ync;
        this.AEQbTJ = interfaceC59187zcM.KWHzl(new C56701yPc(this));
        this.djBIcL = new StateListAnimator();
    }

    public static final java.util.Collection copydefault(AbstractC56700yPb abstractC56700yPb) {
        return abstractC56700yPb.fIwbmz();
    }

    @Override // o.InterfaceC56665yNu
    public <R, D> R AEQbTJ(@NotNull InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        Intrinsics.checkNotNullParameter(interfaceC56667yNw, "");
        return interfaceC56667yNw.EZpvd(this, d);
    }

    @Override // o.InterfaceC56659yNo
    public boolean gHZMYf() {
        return C59322zep.OLrzqt(djBIcL(), new C56703yPe(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Boolean AEQbTJ(AbstractC56700yPb abstractC56700yPb, AbstractC59331zey abstractC59331zey) {
        boolean z;
        Intrinsics.copydefault(abstractC59331zey);
        if (!C59238zdK.AEQbTJ(abstractC59331zey)) {
            InterfaceC56663yNs interfaceC56663yNsKWHzl = abstractC59331zey.djBIcL().KWHzl();
            z = (interfaceC56663yNsKWHzl instanceof InterfaceC56691yOt) && !Intrinsics.EZpvd(((InterfaceC56691yOt) interfaceC56663yNsKWHzl).AuCTel(), abstractC56700yPb);
        }
        return java.lang.Boolean.valueOf(z);
    }

    public final java.util.Collection<yPQ> fIwbmz() {
        InterfaceC56658yNn interfaceC56658yNnAEQbTJ = AEQbTJ();
        if (interfaceC56658yNnAEQbTJ == null) {
            return yDY.AhwBna();
        }
        java.util.Collection<InterfaceC56656yNl> collectionDjBIcL = interfaceC56658yNnAEQbTJ.djBIcL();
        Intrinsics.checkNotNullExpressionValue(collectionDjBIcL, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (InterfaceC56656yNl interfaceC56656yNl : collectionDjBIcL) {
            yPS.Activity activity = yPS.AxsJAY;
            InterfaceC59187zcM interfaceC59187zcM = this.OLrzqt;
            Intrinsics.copydefault(interfaceC56656yNl);
            yPQ ypqOLrzqt = activity.OLrzqt(interfaceC59187zcM, this, interfaceC56656yNl);
            if (ypqOLrzqt != null) {
                arrayList.add(ypqOLrzqt);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.yOt>, java.util.List<o.yOt> */
    @Override // o.InterfaceC56659yNo
    public java.util.List<InterfaceC56691yOt> AkhnZx() {
        java.util.List list = this.EZpvd;
        if (list != null) {
            return list;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.yNJ
    public Modality isConnected() {
        return Modality.FINAL;
    }

    @Override // o.AbstractC56711yPm
    public java.lang.String toString() {
        return "typealias " + bR_().AEQbTJ();
    }

    /* JADX DEBUG: Method merged with bridge method: DbNXlk()Lo/yNt; */
    /* JADX DEBUG: Method merged with bridge method: bS_()Lo/yNs; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    @Override // o.AbstractC56709yPk, o.AbstractC56711yPm, o.InterfaceC56665yNu
    /* JADX INFO: renamed from: fetchVPNInfo, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC56690yOs fJNWhG() {
        InterfaceC56664yNt interfaceC56664yNtBT_ = super.bT_();
        Intrinsics.copydefault(interfaceC56664yNtBT_, "");
        return (InterfaceC56690yOs) interfaceC56664yNtBT_;
    }

    public final AbstractC59242zdO AhwBna() {
        InterfaceC59098zad interfaceC59098zadORxRYg;
        InterfaceC56658yNn interfaceC56658yNnAEQbTJ = AEQbTJ();
        if (interfaceC56658yNnAEQbTJ == null || (interfaceC59098zadORxRYg = interfaceC56658yNnAEQbTJ.ORxRYg()) == null) {
            interfaceC59098zadORxRYg = InterfaceC59098zad.ActionBar.copydefault;
        }
        AbstractC59242zdO abstractC59242zdOOLrzqt = C59322zep.OLrzqt(this, interfaceC59098zadORxRYg, new C56702yPd(this));
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOOLrzqt, "");
        return abstractC59242zdOOLrzqt;
    }

    public static final AbstractC59242zdO copydefault(AbstractC56700yPb abstractC56700yPb, AbstractC59287zeG abstractC59287zeG) {
        InterfaceC56663yNs interfaceC56663yNsAEQbTJ = abstractC59287zeG.AEQbTJ(abstractC56700yPb);
        if (interfaceC56663yNsAEQbTJ != null) {
            return interfaceC56663yNsAEQbTJ.bQ_();
        }
        return null;
    }

    /* JADX INFO: renamed from: o.yPb$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC59315zei {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/yNs; */
        @Override // o.InterfaceC59315zei
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public InterfaceC56690yOs KWHzl() {
            return AbstractC56700yPb.this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC59315zei
        public InterfaceC59315zei AEQbTJ(AbstractC59287zeG abstractC59287zeG) {
            Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
            return this;
        }

        @Override // o.InterfaceC59315zei
        public boolean gEmmrt() {
            return true;
        }

        public StateListAnimator() {
        }

        @Override // o.InterfaceC59315zei
        public java.util.List<InterfaceC56691yOt> copydefault() {
            return AbstractC56700yPb.this.AuCTel();
        }

        @Override // o.InterfaceC59315zei
        public java.util.Collection<AbstractC59233zdF> bV_() {
            java.util.Collection<AbstractC59233zdF> collectionBV_ = KWHzl().djBIcL().djBIcL().bV_();
            Intrinsics.checkNotNullExpressionValue(collectionBV_, "");
            return collectionBV_;
        }

        @Override // o.InterfaceC59315zei
        public AbstractC56640yMw bU_() {
            return yZE.AEQbTJ(KWHzl());
        }

        public java.lang.String toString() {
            return "[typealias " + KWHzl().bR_().AEQbTJ() + AbstractJsonLexerKt.END_LIST;
        }
    }
}
