package o;

/* JADX INFO: loaded from: classes12.dex */
public final class xMD extends xKD {
    public final xBR AEQbTJ;
    public final xBY copydefault;

    public xMD() {
        xBY xby = new xBY();
        xby.AEQbTJ(new C56109xwc());
        this.copydefault = xby;
        xBR xbr = new xBR();
        xbr.KWHzl("OPTION");
        xbr.AEQbTJ(new C56109xwc());
        this.AEQbTJ = xbr;
    }

    @Override // o.xKD
    public java.util.List<xKK> values() {
        return yDY.gEmmrt(this.copydefault, this.AEQbTJ);
    }

    public final java.lang.String KWHzl() {
        return this.copydefault.bB_();
    }

    public final java.lang.String EZpvd() {
        return this.AEQbTJ.bB_();
    }
}
