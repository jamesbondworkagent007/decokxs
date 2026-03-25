package o;

import java.util.Collections;
import o.InterfaceC5386Ps;

/* JADX INFO: loaded from: classes2.dex */
public class PE<Data> implements InterfaceC5386Ps<android.net.Uri, Data> {
    public static final java.util.Set<java.lang.String> KWHzl = Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("http", "https")));
    public final InterfaceC5386Ps<C5378Pk, Data> AEQbTJ;

    public PE(InterfaceC5386Ps<C5378Pk, Data> interfaceC5386Ps) {
        this.AEQbTJ = interfaceC5386Ps;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<Data> AEQbTJ(@androidx.annotation.NonNull android.net.Uri uri, int i, int i2, @androidx.annotation.NonNull NM nm) {
        return this.AEQbTJ.AEQbTJ(new C5378Pk(uri.toString()), i, i2, nm);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    public boolean OLrzqt(@androidx.annotation.NonNull android.net.Uri uri) {
        return KWHzl.contains(uri.getScheme());
    }

    public static class Activity implements InterfaceC5390Pw<android.net.Uri, java.io.InputStream> {
        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<android.net.Uri, java.io.InputStream> AEQbTJ(PA pa) {
            return new PE(pa.OLrzqt(C5378Pk.class, java.io.InputStream.class));
        }
    }
}
