package o;

/* JADX INFO: loaded from: classes12.dex */
public final class xMG extends xKD {
    public final xBR EZpvd;
    public final C54268xCc KWHzl;
    public final xCB OLrzqt;

    public xMG() {
        C54268xCc c54268xCc = new C54268xCc();
        c54268xCc.AEQbTJ(new C56109xwc());
        this.KWHzl = c54268xCc;
        xBR xbr = new xBR();
        xbr.KWHzl("SWAP");
        xbr.AEQbTJ(new C56109xwc());
        this.EZpvd = xbr;
        xCB xcb = new xCB();
        xcb.OLrzqt("SWAP");
        xcb.fIwbmz();
        this.OLrzqt = xcb;
    }

    @Override // o.xKD
    public java.util.List<xKK> values() {
        return yDY.gEmmrt(this.KWHzl, this.EZpvd, this.OLrzqt);
    }

    public final java.lang.String AEQbTJ() {
        return this.KWHzl.bB_();
    }

    public final java.lang.String KWHzl() {
        return this.EZpvd.bB_();
    }

    public final java.lang.String EZpvd() {
        return this.OLrzqt.bB_();
    }
}
