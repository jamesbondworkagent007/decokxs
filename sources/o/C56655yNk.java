package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yNk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56655yNk implements InterfaceC56691yOt {
    public final InterfaceC56691yOt AEQbTJ;
    public final int EZpvd;
    public final InterfaceC56665yNu copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56665yNu
    public <R, D> R AEQbTJ(InterfaceC56667yNw<R, D> interfaceC56667yNw, D d) {
        return (R) this.AEQbTJ.AEQbTJ(interfaceC56667yNw, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56666yNv, o.InterfaceC56665yNu
    /* JADX INFO: renamed from: AYXKKw */
    public InterfaceC56665yNu AuCTel() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56691yOt
    public InterfaceC59187zcM AhwBna() {
        InterfaceC59187zcM interfaceC59187zcMAhwBna = this.AEQbTJ.AhwBna();
        Intrinsics.checkNotNullExpressionValue(interfaceC59187zcMAhwBna, "");
        return interfaceC59187zcMAhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56663yNs
    public AbstractC59242zdO bQ_() {
        AbstractC59242zdO abstractC59242zdOBQ_ = this.AEQbTJ.bQ_();
        Intrinsics.checkNotNullExpressionValue(abstractC59242zdOBQ_, "");
        return abstractC59242zdOBQ_;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yNQ
    public C56935yXu bR_() {
        C56935yXu c56935yXuBR_ = this.AEQbTJ.bR_();
        Intrinsics.checkNotNullExpressionValue(c56935yXuBR_, "");
        return c56935yXuBR_;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yOB
    public yOL copydefault() {
        return this.AEQbTJ.copydefault();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56691yOt
    public java.util.List<AbstractC59233zdF> djBIcL() {
        java.util.List<AbstractC59233zdF> listDjBIcL = this.AEQbTJ.djBIcL();
        Intrinsics.checkNotNullExpressionValue(listDjBIcL, "");
        return listDjBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56664yNt
    public InterfaceC56686yOo fARcdN() {
        InterfaceC56686yOo interfaceC56686yOoFARcdN = this.AEQbTJ.fARcdN();
        Intrinsics.checkNotNullExpressionValue(interfaceC56686yOoFARcdN, "");
        return interfaceC56686yOoFARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56691yOt, o.InterfaceC56663yNs
    public InterfaceC59315zei fJNWhG() {
        InterfaceC59315zei interfaceC59315zeiFJNWhG = this.AEQbTJ.fJNWhG();
        Intrinsics.checkNotNullExpressionValue(interfaceC59315zeiFJNWhG, "");
        return interfaceC59315zeiFJNWhG;
    }

    @Override // o.InterfaceC56691yOt
    public boolean fetchVPNInfo() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56691yOt
    public boolean isConnected() {
        return this.AEQbTJ.isConnected();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC56691yOt
    public Variance values() {
        Variance varianceValues = this.AEQbTJ.values();
        Intrinsics.checkNotNullExpressionValue(varianceValues, "");
        return varianceValues;
    }

    public C56655yNk(@NotNull InterfaceC56691yOt interfaceC56691yOt, @NotNull InterfaceC56665yNu interfaceC56665yNu, int i) {
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        Intrinsics.checkNotNullParameter(interfaceC56665yNu, "");
        this.AEQbTJ = interfaceC56691yOt;
        this.copydefault = interfaceC56665yNu;
        this.EZpvd = i;
    }

    /* JADX DEBUG: Method merged with bridge method: bS_()Lo/yNs; */
    /* JADX DEBUG: Method merged with bridge method: bT_()Lo/yNu; */
    @Override // o.InterfaceC56665yNu
    /* JADX INFO: renamed from: valueOf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public InterfaceC56691yOt fJNWhG() {
        InterfaceC56691yOt interfaceC56691yOtBS_ = this.AEQbTJ.ejfBZ();
        Intrinsics.checkNotNullExpressionValue(interfaceC56691yOtBS_, "");
        return interfaceC56691yOtBS_;
    }

    @Override // o.InterfaceC56691yOt
    public int AEQbTJ() {
        return this.EZpvd + this.AEQbTJ.AEQbTJ();
    }

    public java.lang.String toString() {
        return this.AEQbTJ + "[inner-copy]";
    }
}
