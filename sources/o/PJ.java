package o;

import o.InterfaceC5386Ps;

/* JADX INFO: loaded from: classes2.dex */
public class PJ implements InterfaceC5386Ps<java.net.URL, java.io.InputStream> {
    public final InterfaceC5386Ps<C5378Pk, java.io.InputStream> copydefault;

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@androidx.annotation.NonNull java.net.URL url) {
        return true;
    }

    public PJ(InterfaceC5386Ps<C5378Pk, java.io.InputStream> interfaceC5386Ps) {
        this.copydefault = interfaceC5386Ps;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<java.io.InputStream> AEQbTJ(@androidx.annotation.NonNull java.net.URL url, int i, int i2, @androidx.annotation.NonNull NM nm) {
        return this.copydefault.AEQbTJ(new C5378Pk(url), i, i2, nm);
    }

    public static class Activity implements InterfaceC5390Pw<java.net.URL, java.io.InputStream> {
        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<java.net.URL, java.io.InputStream> AEQbTJ(PA pa) {
            return new PJ(pa.OLrzqt(C5378Pk.class, java.io.InputStream.class));
        }
    }
}
