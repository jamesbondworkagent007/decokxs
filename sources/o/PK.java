package o;

import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import o.InterfaceC5386Ps;

/* JADX INFO: loaded from: classes2.dex */
public class PK implements InterfaceC5386Ps<android.net.Uri, java.io.InputStream> {
    public final android.content.Context EZpvd;

    public PK(android.content.Context context) {
        this.EZpvd = context.getApplicationContext();
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<java.io.InputStream> AEQbTJ(@androidx.annotation.NonNull android.net.Uri uri, int i, int i2, @androidx.annotation.NonNull NM nm) {
        if (C5345Od.AEQbTJ(i, i2) && KWHzl(nm)) {
            return new InterfaceC5386Ps.Application<>(new C5465St(uri), C5349Oh.copydefault(this.EZpvd, uri));
        }
        return null;
    }

    public final boolean KWHzl(NM nm) {
        java.lang.Long l = (java.lang.Long) nm.OLrzqt(VideoDecoder.OLrzqt);
        return l != null && l.longValue() == -1;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    public boolean OLrzqt(@androidx.annotation.NonNull android.net.Uri uri) {
        return C5345Od.OLrzqt(uri);
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
            return new PK(this.EZpvd);
        }
    }
}
