package o;

import o.InterfaceC5386Ps;

/* JADX INFO: loaded from: classes2.dex */
public class PB<Data> implements InterfaceC5386Ps<java.lang.String, Data> {
    public final InterfaceC5386Ps<android.net.Uri, Data> copydefault;

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@androidx.annotation.NonNull java.lang.String str) {
        return true;
    }

    public PB(InterfaceC5386Ps<android.net.Uri, Data> interfaceC5386Ps) {
        this.copydefault = interfaceC5386Ps;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    public InterfaceC5386Ps.Application<Data> AEQbTJ(@androidx.annotation.NonNull java.lang.String str, int i, int i2, @androidx.annotation.NonNull NM nm) {
        android.net.Uri uriCopydefault = copydefault(str);
        if (uriCopydefault == null || !this.copydefault.OLrzqt(uriCopydefault)) {
            return null;
        }
        return this.copydefault.AEQbTJ(uriCopydefault, i, i2, nm);
    }

    public static android.net.Uri copydefault(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return AEQbTJ(str);
        }
        android.net.Uri uri = android.net.Uri.parse(str);
        return uri.getScheme() == null ? AEQbTJ(str) : uri;
    }

    public static android.net.Uri AEQbTJ(java.lang.String str) {
        return android.net.Uri.fromFile(new java.io.File(str));
    }

    public static class TaskDescription implements InterfaceC5390Pw<java.lang.String, java.io.InputStream> {
        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<java.lang.String, java.io.InputStream> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new PB(pa.OLrzqt(android.net.Uri.class, java.io.InputStream.class));
        }
    }

    public static class Application implements InterfaceC5390Pw<java.lang.String, android.os.ParcelFileDescriptor> {
        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<java.lang.String, android.os.ParcelFileDescriptor> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new PB(pa.OLrzqt(android.net.Uri.class, android.os.ParcelFileDescriptor.class));
        }
    }

    public static final class StateListAnimator implements InterfaceC5390Pw<java.lang.String, android.content.res.AssetFileDescriptor> {
        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<java.lang.String, android.content.res.AssetFileDescriptor> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new PB(pa.OLrzqt(android.net.Uri.class, android.content.res.AssetFileDescriptor.class));
        }
    }
}
