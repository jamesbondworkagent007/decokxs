package o;

import o.InterfaceC5386Ps;

/* JADX INFO: renamed from: o.Pe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5372Pe<Data> implements InterfaceC5386Ps<android.net.Uri, Data> {
    public static final int EZpvd = 22;
    public final Application<Data> KWHzl;
    public final android.content.res.AssetManager OLrzqt;

    /* JADX INFO: renamed from: o.Pe$Application */
    public interface Application<Data> {
        NU<Data> OLrzqt(android.content.res.AssetManager assetManager, java.lang.String str);
    }

    public C5372Pe(android.content.res.AssetManager assetManager, Application<Data> application) {
        this.OLrzqt = assetManager;
        this.KWHzl = application;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<Data> AEQbTJ(@androidx.annotation.NonNull android.net.Uri uri, int i, int i2, @androidx.annotation.NonNull NM nm) {
        return new InterfaceC5386Ps.Application<>(new C5465St(uri), this.KWHzl.OLrzqt(this.OLrzqt, uri.toString().substring(EZpvd)));
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@androidx.annotation.NonNull android.net.Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    /* JADX INFO: renamed from: o.Pe$TaskDescription */
    public static class TaskDescription implements InterfaceC5390Pw<android.net.Uri, java.io.InputStream>, Application<java.io.InputStream> {
        public final android.content.res.AssetManager copydefault;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        public TaskDescription(android.content.res.AssetManager assetManager) {
            this.copydefault = assetManager;
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<android.net.Uri, java.io.InputStream> AEQbTJ(PA pa) {
            return new C5372Pe(this.copydefault, this);
        }

        @Override // o.C5372Pe.Application
        public NU<java.io.InputStream> OLrzqt(android.content.res.AssetManager assetManager, java.lang.String str) {
            return new C5343Ob(assetManager, str);
        }
    }

    /* JADX INFO: renamed from: o.Pe$Activity */
    public static class Activity implements InterfaceC5390Pw<android.net.Uri, android.content.res.AssetFileDescriptor>, Application<android.content.res.AssetFileDescriptor> {
        public final android.content.res.AssetManager OLrzqt;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        public Activity(android.content.res.AssetManager assetManager) {
            this.OLrzqt = assetManager;
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<android.net.Uri, android.content.res.AssetFileDescriptor> AEQbTJ(PA pa) {
            return new C5372Pe(this.OLrzqt, this);
        }

        @Override // o.C5372Pe.Application
        public NU<android.content.res.AssetFileDescriptor> OLrzqt(android.content.res.AssetManager assetManager, java.lang.String str) {
            return new NY(assetManager, str);
        }
    }
}
