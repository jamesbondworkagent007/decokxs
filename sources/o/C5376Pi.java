package o;

import com.bumptech.glide.Priority;
import o.InterfaceC5386Ps;
import o.NU;

/* JADX INFO: renamed from: o.Pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5376Pi implements InterfaceC5386Ps<java.io.File, java.nio.ByteBuffer> {
    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    public boolean OLrzqt(@androidx.annotation.NonNull java.io.File file) {
        return true;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<java.nio.ByteBuffer> AEQbTJ(@androidx.annotation.NonNull java.io.File file, int i, int i2, @androidx.annotation.NonNull NM nm) {
        return new InterfaceC5386Ps.Application<>(new C5465St(file), new Activity(file));
    }

    /* JADX INFO: renamed from: o.Pi$Application */
    public static class Application implements InterfaceC5390Pw<java.io.File, java.nio.ByteBuffer> {
        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<java.io.File, java.nio.ByteBuffer> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new C5376Pi();
        }
    }

    /* JADX INFO: renamed from: o.Pi$Activity */
    public static final class Activity implements NU<java.nio.ByteBuffer> {
        public final java.io.File EZpvd;

        @Override // o.NU
        public void AEQbTJ() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NU
        public java.lang.Class<java.nio.ByteBuffer> KWHzl() {
            return java.nio.ByteBuffer.class;
        }

        @Override // o.NU
        public void copydefault() {
        }

        public Activity(java.io.File file) {
            this.EZpvd = file;
        }

        @Override // o.NU
        public void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super java.nio.ByteBuffer> taskDescription) {
            try {
                taskDescription.KWHzl(C5466Su.OLrzqt(this.EZpvd));
            } catch (java.io.IOException e) {
                taskDescription.copydefault(e);
            }
        }

        @Override // o.NU
        public com.bumptech.glide.load.DataSource OLrzqt() {
            return com.bumptech.glide.load.DataSource.LOCAL;
        }
    }
}
