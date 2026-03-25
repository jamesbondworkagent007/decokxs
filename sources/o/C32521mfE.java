package o;

import uniffi.environment.AppType;

/* JADX INFO: renamed from: o.mfE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32521mfE implements AGR {
    @Override // o.AGR
    public java.lang.String copydefault() {
        return C34703nhO.KWHzl(C32979mnm.EZpvd.OLrzqt());
    }

    @Override // o.AGR
    public java.lang.String EZpvd() {
        return C34703nhO.OLrzqt(C32979mnm.EZpvd.OLrzqt());
    }

    @Override // o.AGR
    public java.lang.String AEQbTJ() {
        return C34703nhO.valueOf(C32979mnm.EZpvd.OLrzqt());
    }

    @Override // o.AGR
    public java.lang.String KWHzl() {
        return java.lang.String.valueOf(C34703nhO.copydefault(C32979mnm.EZpvd.OLrzqt()));
    }

    @Override // o.AGR
    public AppType OLrzqt() {
        if (C34703nhO.AEQbTJ()) {
            return AppType.OKXTR;
        }
        if (C34703nhO.copydefault()) {
            return AppType.OK_WALLET;
        }
        return AppType.OKX;
    }
}
