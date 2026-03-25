package o;

import o.InterfaceC5386Ps;

/* JADX INFO: loaded from: classes2.dex */
public class PD implements InterfaceC5386Ps<android.net.Uri, java.io.InputStream> {
    public final android.content.Context KWHzl;

    public PD(android.content.Context context) {
        this.KWHzl = context.getApplicationContext();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    public InterfaceC5386Ps.Application<java.io.InputStream> AEQbTJ(@androidx.annotation.NonNull android.net.Uri uri, int i, int i2, @androidx.annotation.NonNull NM nm) {
        if (C5345Od.AEQbTJ(i, i2)) {
            return new InterfaceC5386Ps.Application<>(new C5465St(uri), C5349Oh.KWHzl(this.KWHzl, uri));
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@androidx.annotation.NonNull android.net.Uri uri) {
        return C5345Od.KWHzl(uri);
    }

    public static class Application implements InterfaceC5390Pw<android.net.Uri, java.io.InputStream> {
        public final android.content.Context EZpvd;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        public Application(android.content.Context context) {
            this.EZpvd = context;
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<android.net.Uri, java.io.InputStream> AEQbTJ(PA pa) {
            return new PD(this.EZpvd);
        }
    }
}
