package o;

import java.util.Collections;
import o.InterfaceC5386Ps;

/* JADX INFO: loaded from: classes2.dex */
public class PG<Data> implements InterfaceC5386Ps<android.net.Uri, Data> {
    public static final java.util.Set<java.lang.String> EZpvd = Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("file", "content", "android.resource")));
    public final TaskDescription<Data> copydefault;

    public interface TaskDescription<Data> {
        NU<Data> AEQbTJ(android.net.Uri uri);
    }

    public PG(TaskDescription<Data> taskDescription) {
        this.copydefault = taskDescription;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<Data> AEQbTJ(@androidx.annotation.NonNull android.net.Uri uri, int i, int i2, @androidx.annotation.NonNull NM nm) {
        return new InterfaceC5386Ps.Application<>(new C5465St(uri), this.copydefault.AEQbTJ(uri));
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@androidx.annotation.NonNull android.net.Uri uri) {
        return EZpvd.contains(uri.getScheme());
    }

    public static class StateListAnimator implements InterfaceC5390Pw<android.net.Uri, java.io.InputStream>, TaskDescription<java.io.InputStream> {
        public final android.content.ContentResolver EZpvd;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        public StateListAnimator(android.content.ContentResolver contentResolver) {
            this.EZpvd = contentResolver;
        }

        @Override // o.PG.TaskDescription
        public NU<java.io.InputStream> AEQbTJ(android.net.Uri uri) {
            return new C5342Oa(this.EZpvd, uri);
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<android.net.Uri, java.io.InputStream> AEQbTJ(PA pa) {
            return new PG(this);
        }
    }

    public static class Application implements InterfaceC5390Pw<android.net.Uri, android.os.ParcelFileDescriptor>, TaskDescription<android.os.ParcelFileDescriptor> {
        public final android.content.ContentResolver copydefault;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        public Application(android.content.ContentResolver contentResolver) {
            this.copydefault = contentResolver;
        }

        @Override // o.PG.TaskDescription
        public NU<android.os.ParcelFileDescriptor> AEQbTJ(android.net.Uri uri) {
            return new NZ(this.copydefault, uri);
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<android.net.Uri, android.os.ParcelFileDescriptor> AEQbTJ(PA pa) {
            return new PG(this);
        }
    }

    public static final class ActionBar implements InterfaceC5390Pw<android.net.Uri, android.content.res.AssetFileDescriptor>, TaskDescription<android.content.res.AssetFileDescriptor> {
        public final android.content.ContentResolver EZpvd;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        public ActionBar(android.content.ContentResolver contentResolver) {
            this.EZpvd = contentResolver;
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<android.net.Uri, android.content.res.AssetFileDescriptor> AEQbTJ(PA pa) {
            return new PG(this);
        }

        @Override // o.PG.TaskDescription
        public NU<android.content.res.AssetFileDescriptor> AEQbTJ(android.net.Uri uri) {
            return new NO(this.EZpvd, uri);
        }
    }
}
