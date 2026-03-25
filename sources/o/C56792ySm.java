package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.yMB;
import o.yOL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ySm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56792ySm implements yOL {
    public final boolean AEQbTJ;
    public final C56794ySo EZpvd;
    public final yTM OLrzqt;
    public final InterfaceC59179zcE<yTO, yOJ> copydefault;

    public C56792ySm(@NotNull C56794ySo c56794ySo, @NotNull yTM ytm, boolean z) {
        Intrinsics.checkNotNullParameter(c56794ySo, "");
        Intrinsics.checkNotNullParameter(ytm, "");
        this.EZpvd = c56794ySo;
        this.OLrzqt = ytm;
        this.AEQbTJ = z;
        this.copydefault = c56794ySo.copydefault().uzCIH().OLrzqt(new C56793ySn(this));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 o.ySo)
  (r2v0 o.yTM)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(o.ySo, o.yTM, boolean):void (m)] (LINE:26) call: o.ySm.<init>(o.ySo, o.yTM, boolean):void type: THIS */
    public /* synthetic */ C56792ySm(C56794ySo c56794ySo, yTM ytm, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c56794ySo, ytm, (i & 4) != 0 ? false : z);
    }

    @Override // o.yOL
    public boolean copydefault(@NotNull C56933yXs c56933yXs) {
        return yOL.Activity.OLrzqt(this, c56933yXs);
    }

    public static final yOJ copydefault(C56792ySm c56792ySm, yTO yto) {
        Intrinsics.checkNotNullParameter(yto, "");
        return yRM.KWHzl.copydefault(yto, c56792ySm.EZpvd, c56792ySm.AEQbTJ);
    }

    @Override // o.yOL
    public yOJ EZpvd(@NotNull C56933yXs c56933yXs) {
        yOJ yojInvoke;
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        yTO ytoCopydefault = this.OLrzqt.copydefault(c56933yXs);
        return (ytoCopydefault == null || (yojInvoke = this.copydefault.invoke(ytoCopydefault)) == null) ? yRM.KWHzl.EZpvd(c56933yXs, this.OLrzqt, this.EZpvd) : yojInvoke;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<yOJ> iterator() {
        return C59467zhb.wlaJM(C59467zhb.KWHzl((Sequence<? extends yOJ>) ((Sequence<? extends java.lang.Object>) C59467zhb.fetchVPNInfo(CollectionsKt___CollectionsKt.QVAiDq(this.OLrzqt.AEQbTJ()), this.copydefault)), yRM.KWHzl.EZpvd(yMB.Application.uzCIH, this.OLrzqt, this.EZpvd))).iterator();
    }

    @Override // o.yOL
    public boolean AEQbTJ() {
        return this.OLrzqt.AEQbTJ().isEmpty() && !this.OLrzqt.EZpvd();
    }
}
