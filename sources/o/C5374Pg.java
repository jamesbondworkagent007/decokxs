package o;

import com.bumptech.glide.Priority;
import o.InterfaceC5386Ps;
import o.NU;

/* JADX INFO: renamed from: o.Pg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5374Pg<Data> implements InterfaceC5386Ps<byte[], Data> {
    public final Activity<Data> copydefault;

    /* JADX INFO: renamed from: o.Pg$Activity */
    public interface Activity<Data> {
        java.lang.Class<Data> OLrzqt();

        Data OLrzqt(byte[] bArr);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@androidx.annotation.NonNull byte[] bArr) {
        return true;
    }

    public C5374Pg(Activity<Data> activity) {
        this.copydefault = activity;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<Data> AEQbTJ(@androidx.annotation.NonNull byte[] bArr, int i, int i2, @androidx.annotation.NonNull NM nm) {
        return new InterfaceC5386Ps.Application<>(new C5465St(bArr), new Application(bArr, this.copydefault));
    }

    /* JADX INFO: renamed from: o.Pg$Application */
    public static class Application<Data> implements NU<Data> {
        public final byte[] AEQbTJ;
        public final Activity<Data> KWHzl;

        @Override // o.NU
        public void AEQbTJ() {
        }

        @Override // o.NU
        public void copydefault() {
        }

        public Application(byte[] bArr, Activity<Data> activity) {
            this.AEQbTJ = bArr;
            this.KWHzl = activity;
        }

        @Override // o.NU
        public void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super Data> taskDescription) {
            taskDescription.KWHzl(this.KWHzl.OLrzqt(this.AEQbTJ));
        }

        @Override // o.NU
        public java.lang.Class<Data> KWHzl() {
            return this.KWHzl.OLrzqt();
        }

        @Override // o.NU
        public com.bumptech.glide.load.DataSource OLrzqt() {
            return com.bumptech.glide.load.DataSource.LOCAL;
        }
    }

    /* JADX INFO: renamed from: o.Pg$ActionBar */
    public static class ActionBar implements InterfaceC5390Pw<byte[], java.nio.ByteBuffer> {
        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<byte[], java.nio.ByteBuffer> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new C5374Pg(new Activity<java.nio.ByteBuffer>() { // from class: o.Pg.ActionBar.5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C5374Pg.Activity
                public java.lang.Class<java.nio.ByteBuffer> OLrzqt() {
                    return java.nio.ByteBuffer.class;
                }

                /* JADX DEBUG: Method merged with bridge method: OLrzqt([B)Ljava/lang/Object; */
                @Override // o.C5374Pg.Activity
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public java.nio.ByteBuffer OLrzqt(byte[] bArr) {
                    return java.nio.ByteBuffer.wrap(bArr);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.Pg$StateListAnimator */
    public static class StateListAnimator implements InterfaceC5390Pw<byte[], java.io.InputStream> {
        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<byte[], java.io.InputStream> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new C5374Pg(new Activity<java.io.InputStream>() { // from class: o.Pg.StateListAnimator.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C5374Pg.Activity
                public java.lang.Class<java.io.InputStream> OLrzqt() {
                    return java.io.InputStream.class;
                }

                /* JADX DEBUG: Method merged with bridge method: OLrzqt([B)Ljava/lang/Object; */
                @Override // o.C5374Pg.Activity
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public java.io.InputStream OLrzqt(byte[] bArr) {
                    return new java.io.ByteArrayInputStream(bArr);
                }
            });
        }
    }
}
