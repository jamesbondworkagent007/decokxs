package o;

import com.bumptech.glide.Priority;
import o.InterfaceC5386Ps;
import o.NU;

/* JADX INFO: renamed from: o.Pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5377Pj<Model, Data> implements InterfaceC5386Ps<Model, Data> {
    public final Activity<Data> AEQbTJ;

    /* JADX INFO: renamed from: o.Pj$Activity */
    public interface Activity<Data> {
        java.lang.Class<Data> AEQbTJ();

        void KWHzl(Data data) throws java.io.IOException;

        Data copydefault(java.lang.String str) throws java.lang.IllegalArgumentException;
    }

    public C5377Pj(Activity<Data> activity) {
        this.AEQbTJ = activity;
    }

    @Override // o.InterfaceC5386Ps
    public InterfaceC5386Ps.Application<Data> AEQbTJ(@androidx.annotation.NonNull Model model, int i, int i2, @androidx.annotation.NonNull NM nm) {
        return new InterfaceC5386Ps.Application<>(new C5465St(model), new StateListAnimator(model.toString(), this.AEQbTJ));
    }

    @Override // o.InterfaceC5386Ps
    public boolean OLrzqt(@androidx.annotation.NonNull Model model) {
        return model.toString().startsWith("data:image");
    }

    /* JADX INFO: renamed from: o.Pj$StateListAnimator */
    public static final class StateListAnimator<Data> implements NU<Data> {
        public Data AEQbTJ;
        public final Activity<Data> EZpvd;
        public final java.lang.String KWHzl;

        @Override // o.NU
        public void copydefault() {
        }

        public StateListAnimator(java.lang.String str, Activity<Data> activity) {
            this.KWHzl = str;
            this.EZpvd = activity;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [Data, java.lang.Object] */
        @Override // o.NU
        public void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super Data> taskDescription) {
            try {
                Data dataCopydefault = this.EZpvd.copydefault(this.KWHzl);
                this.AEQbTJ = dataCopydefault;
                taskDescription.KWHzl(dataCopydefault);
            } catch (java.lang.IllegalArgumentException e) {
                taskDescription.copydefault(e);
            }
        }

        @Override // o.NU
        public void AEQbTJ() {
            try {
                this.EZpvd.KWHzl(this.AEQbTJ);
            } catch (java.io.IOException unused) {
            }
        }

        @Override // o.NU
        public java.lang.Class<Data> KWHzl() {
            return this.EZpvd.AEQbTJ();
        }

        @Override // o.NU
        public com.bumptech.glide.load.DataSource OLrzqt() {
            return com.bumptech.glide.load.DataSource.LOCAL;
        }
    }

    /* JADX INFO: renamed from: o.Pj$ActionBar */
    public static final class ActionBar<Model> implements InterfaceC5390Pw<Model, java.io.InputStream> {
        public final Activity<java.io.InputStream> EZpvd = new Activity<java.io.InputStream>() { // from class: o.Pj.ActionBar.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C5377Pj.Activity
            public java.lang.Class<java.io.InputStream> AEQbTJ() {
                return java.io.InputStream.class;
            }

            /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/String;)Ljava/lang/Object; */
            @Override // o.C5377Pj.Activity
            /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
            public java.io.InputStream copydefault(java.lang.String str) {
                if (!str.startsWith("data:image")) {
                    throw new java.lang.IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new java.lang.IllegalArgumentException("Missing comma in data URL.");
                }
                if (!str.substring(0, iIndexOf).endsWith(";base64")) {
                    throw new java.lang.IllegalArgumentException("Not a base64 image data URL.");
                }
                return new java.io.ByteArrayInputStream(android.util.Base64.decode(str.substring(iIndexOf + 1), 0));
            }

            /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)V */
            @Override // o.C5377Pj.Activity
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public void KWHzl(java.io.InputStream inputStream) throws java.io.IOException {
                inputStream.close();
            }
        };

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<Model, java.io.InputStream> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new C5377Pj(this.EZpvd);
        }
    }
}
