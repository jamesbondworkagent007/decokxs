package o;

import java.util.Objects;
import o.InterfaceC5386Ps;

/* JADX INFO: renamed from: o.Pz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5393Pz<DataT> implements InterfaceC5386Ps<android.net.Uri, DataT> {
    public final InterfaceC5386Ps<java.lang.Integer, DataT> KWHzl;
    public final android.content.Context OLrzqt;

    public static InterfaceC5390Pw<android.net.Uri, java.io.InputStream> EZpvd(android.content.Context context) {
        return new TaskDescription(context);
    }

    public static InterfaceC5390Pw<android.net.Uri, android.content.res.AssetFileDescriptor> AEQbTJ(android.content.Context context) {
        return new StateListAnimator(context);
    }

    public C5393Pz(android.content.Context context, InterfaceC5386Ps<java.lang.Integer, DataT> interfaceC5386Ps) {
        this.OLrzqt = context.getApplicationContext();
        this.KWHzl = interfaceC5386Ps;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<DataT> AEQbTJ(@androidx.annotation.NonNull android.net.Uri uri, int i, int i2, @androidx.annotation.NonNull NM nm) {
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            return AEQbTJ2(uri, i, i2, nm);
        }
        if (pathSegments.size() == 2) {
            return OLrzqt(uri, i, i2, nm);
        }
        if (!android.util.Log.isLoggable("ResourceUriLoader", 5)) {
            return null;
        }
        Objects.toString(uri);
        return null;
    }

    public final InterfaceC5386Ps.Application<DataT> OLrzqt(@androidx.annotation.NonNull android.net.Uri uri, int i, int i2, @androidx.annotation.NonNull NM nm) {
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        java.lang.String str = pathSegments.get(0);
        int identifier = this.OLrzqt.getResources().getIdentifier(pathSegments.get(1), str, this.OLrzqt.getPackageName());
        if (identifier == 0) {
            if (!android.util.Log.isLoggable("ResourceUriLoader", 5)) {
                return null;
            }
            Objects.toString(uri);
            return null;
        }
        return this.KWHzl.AEQbTJ(java.lang.Integer.valueOf(identifier), i, i2, nm);
    }

    /* JADX INFO: renamed from: AEQbTJ, reason: avoid collision after fix types in other method */
    public final InterfaceC5386Ps.Application<DataT> AEQbTJ2(@androidx.annotation.NonNull android.net.Uri uri, int i, int i2, @androidx.annotation.NonNull NM nm) {
        try {
            int i3 = java.lang.Integer.parseInt(uri.getPathSegments().get(0));
            if (i3 == 0) {
                if (android.util.Log.isLoggable("ResourceUriLoader", 5)) {
                    Objects.toString(uri);
                }
                return null;
            }
            return this.KWHzl.AEQbTJ(java.lang.Integer.valueOf(i3), i, i2, nm);
        } catch (java.lang.NumberFormatException unused) {
            if (android.util.Log.isLoggable("ResourceUriLoader", 5)) {
                Objects.toString(uri);
            }
            return null;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@androidx.annotation.NonNull android.net.Uri uri) {
        return "android.resource".equals(uri.getScheme()) && this.OLrzqt.getPackageName().equals(uri.getAuthority());
    }

    /* JADX INFO: renamed from: o.Pz$TaskDescription */
    public static final class TaskDescription implements InterfaceC5390Pw<android.net.Uri, java.io.InputStream> {
        public final android.content.Context copydefault;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        public TaskDescription(android.content.Context context) {
            this.copydefault = context;
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<android.net.Uri, java.io.InputStream> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new C5393Pz(this.copydefault, pa.OLrzqt(java.lang.Integer.class, java.io.InputStream.class));
        }
    }

    /* JADX INFO: renamed from: o.Pz$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC5390Pw<android.net.Uri, android.content.res.AssetFileDescriptor> {
        public final android.content.Context AEQbTJ;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        public StateListAnimator(android.content.Context context) {
            this.AEQbTJ = context;
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<android.net.Uri, android.content.res.AssetFileDescriptor> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new C5393Pz(this.AEQbTJ, pa.OLrzqt(java.lang.Integer.class, android.content.res.AssetFileDescriptor.class));
        }
    }
}
