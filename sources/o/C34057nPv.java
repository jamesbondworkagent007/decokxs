package o;

import o.mMP;

/* JADX INFO: renamed from: o.nPv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34057nPv extends AbstractC43215rlA implements mMP {
    public final int copydefault = 1;
    public final int OLrzqt = 300;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public int getPriority() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.mMP
    public java.lang.String name() {
        return "Turn On/Off IM Web Socket Floating Window";
    }

    @Override // o.mMP
    public boolean supportRelease() {
        return true;
    }

    @Override // o.mMP
    public java.lang.String contentDesc() {
        return mMP.Application.EZpvd(this);
    }

    @Override // o.mMP
    public boolean onClick() {
        C34040nPe.copydefault.valueOf();
        return true;
    }
}
