package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zcv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59222zcv extends AbstractC56700yPb implements InterfaceC59144zbW {
    public final InterfaceC59145zbX AhwBna;
    public AbstractC59242zdO AkhnZx;
    public final yWW AuCTel;
    public final ProtoBuf.TypeAlias DbNXlk;
    public final yWX ejfBZ;
    public AbstractC59242zdO fIwbmz;
    public java.util.List<? extends InterfaceC56691yOt> fJNWhG;
    public AbstractC59242zdO fetchVPNInfo;
    public final yWS isConnected;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59144zbW
    public InterfaceC59145zbX OcIXYQ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59144zbW
    public yWS QKVWgx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59144zbW
    public yWW RJOkX() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: QUSxYX()Lo/yXQ; */
    @Override // o.InterfaceC59144zbW
    /* JADX INFO: renamed from: ejfBZ, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.TypeAlias QUSxYX() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public yWX iwGUEr() {
        return this.ejfBZ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C59222zcv(@NotNull InterfaceC59187zcM interfaceC59187zcM, @NotNull InterfaceC56665yNu interfaceC56665yNu, @NotNull yOL yol, @NotNull C56935yXu c56935yXu, @NotNull yNC ync, @NotNull ProtoBuf.TypeAlias typeAlias, @NotNull yWS yws, @NotNull yWW yww, @NotNull yWX ywx, InterfaceC59145zbX interfaceC59145zbX) {
        Intrinsics.checkNotNullParameter(interfaceC59187zcM, "");
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        Intrinsics.checkNotNullParameter(yol, "");
        Intrinsics.checkNotNullParameter(c56935yXu, "");
        Intrinsics.checkNotNullParameter(ync, "");
        Intrinsics.checkNotNullParameter(typeAlias, "");
        Intrinsics.checkNotNullParameter(yws, "");
        Intrinsics.checkNotNullParameter(yww, "");
        Intrinsics.checkNotNullParameter(ywx, "");
        InterfaceC56686yOo interfaceC56686yOo = InterfaceC56686yOo.copydefault;
        Intrinsics.checkNotNullExpressionValue(interfaceC56686yOo, "");
        super(interfaceC59187zcM, interfaceC56665yNu, yol, c56935yXu, interfaceC56686yOo, ync);
        this.DbNXlk = typeAlias;
        this.isConnected = yws;
        this.AuCTel = yww;
        this.ejfBZ = ywx;
        this.AhwBna = interfaceC59145zbX;
    }

    @Override // o.InterfaceC56690yOs
    public AbstractC59242zdO djBIcL() {
        AbstractC59242zdO abstractC59242zdO = this.fIwbmz;
        if (abstractC59242zdO != null) {
            return abstractC59242zdO;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.InterfaceC56690yOs
    public AbstractC59242zdO valueOf() {
        AbstractC59242zdO abstractC59242zdO = this.AkhnZx;
        if (abstractC59242zdO != null) {
            return abstractC59242zdO;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void KWHzl(@NotNull java.util.List<? extends InterfaceC56691yOt> list, @NotNull AbstractC59242zdO abstractC59242zdO, @NotNull AbstractC59242zdO abstractC59242zdO2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(abstractC59242zdO, "");
        Intrinsics.checkNotNullParameter(abstractC59242zdO2, "");
        OLrzqt(list);
        this.fIwbmz = abstractC59242zdO;
        this.AkhnZx = abstractC59242zdO2;
        this.fJNWhG = C56692yOu.copydefault((InterfaceC56659yNo) this);
        this.fetchVPNInfo = AhwBna();
    }

    @Override // o.InterfaceC56690yOs
    public InterfaceC56658yNn AEQbTJ() {
        if (!C59238zdK.AEQbTJ(valueOf())) {
            InterfaceC56663yNs interfaceC56663yNsOLrzqt = valueOf().djBIcL().OLrzqt();
            if (interfaceC56663yNsOLrzqt instanceof InterfaceC56658yNn) {
                return (InterfaceC56658yNn) interfaceC56663yNsOLrzqt;
            }
        }
        return null;
    }

    @Override // o.InterfaceC56663yNs
    public AbstractC59242zdO bQ_() {
        AbstractC59242zdO abstractC59242zdO = this.fetchVPNInfo;
        if (abstractC59242zdO != null) {
            return abstractC59242zdO;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lkotlin/reflect/jvm/internal/impl/types/TypeSubstitutor;)Lo/yNv; */
    @Override // o.InterfaceC56688yOq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public InterfaceC56690yOs OLrzqt(@NotNull TypeSubstitutor typeSubstitutor) {
        Intrinsics.checkNotNullParameter(typeSubstitutor, "");
        if (typeSubstitutor.EZpvd()) {
            return this;
        }
        InterfaceC59187zcM interfaceC59187zcMValues = values();
        InterfaceC56665yNu interfaceC56665yNuAuCTel = AuCTel();
        Intrinsics.checkNotNullExpressionValue(interfaceC56665yNuAuCTel, "");
        yOL yolCopydefault = copydefault();
        Intrinsics.checkNotNullExpressionValue(yolCopydefault, "");
        C56935yXu c56935yXuBR_ = bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
        C59222zcv c59222zcv = new C59222zcv(interfaceC59187zcMValues, interfaceC56665yNuAuCTel, yolCopydefault, c56935yXuBR_, getNewProxyInstance(), QUSxYX(), QKVWgx(), RJOkX(), iwGUEr(), OcIXYQ());
        java.util.List<InterfaceC56691yOt> listAkhnZx = AkhnZx();
        AbstractC59242zdO abstractC59242zdODjBIcL = djBIcL();
        Variance variance = Variance.INVARIANT;
        AbstractC59233zdF abstractC59233zdFAEQbTJ = typeSubstitutor.AEQbTJ(abstractC59242zdODjBIcL, variance);
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFAEQbTJ, "");
        AbstractC59242zdO abstractC59242zdOCopydefault = C59326zet.copydefault(abstractC59233zdFAEQbTJ);
        AbstractC59233zdF abstractC59233zdFAEQbTJ2 = typeSubstitutor.AEQbTJ(valueOf(), variance);
        Intrinsics.checkNotNullExpressionValue(abstractC59233zdFAEQbTJ2, "");
        c59222zcv.KWHzl(listAkhnZx, abstractC59242zdOCopydefault, C59326zet.copydefault(abstractC59233zdFAEQbTJ2));
        return c59222zcv;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends o.yOt>, java.util.List<o.yOt> */
    @Override // o.AbstractC56700yPb
    public java.util.List<InterfaceC56691yOt> AuCTel() {
        java.util.List list = this.fJNWhG;
        if (list != null) {
            return list;
        }
        Intrinsics.gEmmrt("");
        return null;
    }
}
