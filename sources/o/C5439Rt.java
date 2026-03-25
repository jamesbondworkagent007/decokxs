package o;

import o.InterfaceC5432Rm;

/* JADX INFO: renamed from: o.Rt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5439Rt implements InterfaceC5432Rm {
    public final android.content.Context AEQbTJ;
    public final InterfaceC5432Rm.ActionBar KWHzl;

    @Override // o.InterfaceC5441Rv
    public void valueOf() {
    }

    public C5439Rt(@androidx.annotation.NonNull android.content.Context context, @androidx.annotation.NonNull InterfaceC5432Rm.ActionBar actionBar) {
        this.AEQbTJ = context.getApplicationContext();
        this.KWHzl = actionBar;
    }

    public final void OLrzqt() {
        RE.EZpvd(this.AEQbTJ).OLrzqt(this.KWHzl);
    }

    public final void EZpvd() {
        RE.EZpvd(this.AEQbTJ).KWHzl(this.KWHzl);
    }

    @Override // o.InterfaceC5441Rv
    public void AYXKKw() {
        OLrzqt();
    }

    @Override // o.InterfaceC5441Rv
    public void AhwBna() {
        EZpvd();
    }
}
