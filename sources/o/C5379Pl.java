package o;

import com.bumptech.glide.Priority;
import o.InterfaceC5386Ps;
import o.NU;

/* JADX INFO: renamed from: o.Pl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5379Pl<Data> implements InterfaceC5386Ps<java.io.File, Data> {
    public final ActionBar<Data> EZpvd;

    /* JADX INFO: renamed from: o.Pl$ActionBar */
    public interface ActionBar<Data> {
        java.lang.Class<Data> EZpvd();

        Data EZpvd(java.io.File file) throws java.io.FileNotFoundException;

        void OLrzqt(Data data) throws java.io.IOException;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@androidx.annotation.NonNull java.io.File file) {
        return true;
    }

    public C5379Pl(ActionBar<Data> actionBar) {
        this.EZpvd = actionBar;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<Data> AEQbTJ(@androidx.annotation.NonNull java.io.File file, int i, int i2, @androidx.annotation.NonNull NM nm) {
        return new InterfaceC5386Ps.Application<>(new C5465St(file), new Application(file, this.EZpvd));
    }

    /* JADX INFO: renamed from: o.Pl$Application */
    public static final class Application<Data> implements NU<Data> {
        public final java.io.File AEQbTJ;
        public Data EZpvd;
        public final ActionBar<Data> KWHzl;

        @Override // o.NU
        public void copydefault() {
        }

        public Application(java.io.File file, ActionBar<Data> actionBar) {
            this.AEQbTJ = file;
            this.KWHzl = actionBar;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // o.NU
        public void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super Data> taskDescription) {
            try {
                Data dataEZpvd = this.KWHzl.EZpvd(this.AEQbTJ);
                this.EZpvd = dataEZpvd;
                taskDescription.KWHzl(dataEZpvd);
            } catch (java.io.FileNotFoundException e) {
                taskDescription.copydefault(e);
            }
        }

        @Override // o.NU
        public void AEQbTJ() {
            Data data = this.EZpvd;
            if (data != null) {
                try {
                    this.KWHzl.OLrzqt(data);
                } catch (java.io.IOException unused) {
                }
            }
        }

        @Override // o.NU
        public java.lang.Class<Data> KWHzl() {
            return this.KWHzl.EZpvd();
        }

        @Override // o.NU
        public com.bumptech.glide.load.DataSource OLrzqt() {
            return com.bumptech.glide.load.DataSource.LOCAL;
        }
    }

    /* JADX INFO: renamed from: o.Pl$Activity */
    public static class Activity<Data> implements InterfaceC5390Pw<java.io.File, Data> {
        public final ActionBar<Data> EZpvd;

        @Override // o.InterfaceC5390Pw
        public final void AEQbTJ() {
        }

        public Activity(ActionBar<Data> actionBar) {
            this.EZpvd = actionBar;
        }

        @Override // o.InterfaceC5390Pw
        public final InterfaceC5386Ps<java.io.File, Data> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new C5379Pl(this.EZpvd);
        }
    }

    /* JADX INFO: renamed from: o.Pl$TaskDescription */
    public static class TaskDescription extends Activity<java.io.InputStream> {
        public TaskDescription() {
            super(new ActionBar<java.io.InputStream>() { // from class: o.Pl.TaskDescription.5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C5379Pl.ActionBar
                public java.lang.Class<java.io.InputStream> EZpvd() {
                    return java.io.InputStream.class;
                }

                /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/io/File;)Ljava/lang/Object; */
                @Override // o.C5379Pl.ActionBar
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public java.io.InputStream EZpvd(java.io.File file) throws java.io.FileNotFoundException {
                    return new java.io.FileInputStream(file);
                }

                /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)V */
                @Override // o.C5379Pl.ActionBar
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public void OLrzqt(java.io.InputStream inputStream) throws java.io.IOException {
                    inputStream.close();
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.Pl$StateListAnimator */
    public static class StateListAnimator extends Activity<android.os.ParcelFileDescriptor> {
        public StateListAnimator() {
            super(new ActionBar<android.os.ParcelFileDescriptor>() { // from class: o.Pl.StateListAnimator.3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.C5379Pl.ActionBar
                public java.lang.Class<android.os.ParcelFileDescriptor> EZpvd() {
                    return android.os.ParcelFileDescriptor.class;
                }

                /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/io/File;)Ljava/lang/Object; */
                @Override // o.C5379Pl.ActionBar
                /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                public android.os.ParcelFileDescriptor EZpvd(java.io.File file) throws java.io.FileNotFoundException {
                    return android.os.ParcelFileDescriptor.open(file, 268435456);
                }

                /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)V */
                @Override // o.C5379Pl.ActionBar
                public void OLrzqt(android.os.ParcelFileDescriptor parcelFileDescriptor) throws java.io.IOException {
                    parcelFileDescriptor.close();
                }
            });
        }
    }
}
