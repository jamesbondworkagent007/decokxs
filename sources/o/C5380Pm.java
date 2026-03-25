package o;

import android.content.res.Resources;
import com.bumptech.glide.Priority;
import o.InterfaceC5386Ps;
import o.NU;

/* JADX INFO: renamed from: o.Pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5380Pm<DataT> implements InterfaceC5386Ps<java.lang.Integer, DataT> {
    public final android.content.Context EZpvd;
    public final Application<DataT> OLrzqt;

    /* JADX INFO: renamed from: o.Pm$Application */
    public interface Application<DataT> {
        java.lang.Class<DataT> EZpvd();

        DataT copydefault(@androidx.annotation.Nullable Resources.Theme theme, android.content.res.Resources resources, int i);

        void copydefault(DataT datat) throws java.io.IOException;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@androidx.annotation.NonNull java.lang.Integer num) {
        return true;
    }

    public static InterfaceC5390Pw<java.lang.Integer, java.io.InputStream> KWHzl(android.content.Context context) {
        return new TaskDescription(context);
    }

    public static InterfaceC5390Pw<java.lang.Integer, android.content.res.AssetFileDescriptor> copydefault(android.content.Context context) {
        return new Activity(context);
    }

    public static InterfaceC5390Pw<java.lang.Integer, android.graphics.drawable.Drawable> OLrzqt(android.content.Context context) {
        return new ActionBar(context);
    }

    public C5380Pm(android.content.Context context, Application<DataT> application) {
        this.EZpvd = context.getApplicationContext();
        this.OLrzqt = application;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<DataT> AEQbTJ(@androidx.annotation.NonNull java.lang.Integer num, int i, int i2, @androidx.annotation.NonNull NM nm) {
        android.content.res.Resources resources;
        Resources.Theme theme = (Resources.Theme) nm.OLrzqt(QT.AEQbTJ);
        if (theme != null) {
            resources = theme.getResources();
        } else {
            resources = this.EZpvd.getResources();
        }
        return new InterfaceC5386Ps.Application<>(new C5465St(num), new StateListAnimator(theme, resources, this.OLrzqt, num.intValue()));
    }

    /* JADX INFO: renamed from: o.Pm$Activity */
    public static final class Activity implements InterfaceC5390Pw<java.lang.Integer, android.content.res.AssetFileDescriptor>, Application<android.content.res.AssetFileDescriptor> {
        public final android.content.Context KWHzl;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C5380Pm.Application
        public java.lang.Class<android.content.res.AssetFileDescriptor> EZpvd() {
            return android.content.res.AssetFileDescriptor.class;
        }

        public Activity(android.content.Context context) {
            this.KWHzl = context;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Ljava/lang/Object; */
        @Override // o.C5380Pm.Application
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public android.content.res.AssetFileDescriptor copydefault(@androidx.annotation.Nullable Resources.Theme theme, android.content.res.Resources resources, int i) {
            return resources.openRawResourceFd(i);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;)V */
        @Override // o.C5380Pm.Application
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.content.res.AssetFileDescriptor assetFileDescriptor) throws java.io.IOException {
            assetFileDescriptor.close();
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<java.lang.Integer, android.content.res.AssetFileDescriptor> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new C5380Pm(this.KWHzl, this);
        }
    }

    /* JADX INFO: renamed from: o.Pm$TaskDescription */
    public static final class TaskDescription implements InterfaceC5390Pw<java.lang.Integer, java.io.InputStream>, Application<java.io.InputStream> {
        public final android.content.Context OLrzqt;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C5380Pm.Application
        public java.lang.Class<java.io.InputStream> EZpvd() {
            return java.io.InputStream.class;
        }

        public TaskDescription(android.content.Context context) {
            this.OLrzqt = context;
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<java.lang.Integer, java.io.InputStream> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new C5380Pm(this.OLrzqt, this);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Ljava/lang/Object; */
        @Override // o.C5380Pm.Application
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public java.io.InputStream copydefault(@androidx.annotation.Nullable Resources.Theme theme, android.content.res.Resources resources, int i) {
            return resources.openRawResource(i);
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;)V */
        @Override // o.C5380Pm.Application
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void copydefault(java.io.InputStream inputStream) throws java.io.IOException {
            inputStream.close();
        }
    }

    /* JADX INFO: renamed from: o.Pm$ActionBar */
    public static final class ActionBar implements InterfaceC5390Pw<java.lang.Integer, android.graphics.drawable.Drawable>, Application<android.graphics.drawable.Drawable> {
        public final android.content.Context OLrzqt;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;)V */
        @Override // o.C5380Pm.Application
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public void copydefault(android.graphics.drawable.Drawable drawable) throws java.io.IOException {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.C5380Pm.Application
        public java.lang.Class<android.graphics.drawable.Drawable> EZpvd() {
            return android.graphics.drawable.Drawable.class;
        }

        public ActionBar(android.content.Context context) {
            this.OLrzqt = context;
        }

        /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Ljava/lang/Object; */
        @Override // o.C5380Pm.Application
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public android.graphics.drawable.Drawable copydefault(@androidx.annotation.Nullable Resources.Theme theme, android.content.res.Resources resources, int i) {
            return QM.AEQbTJ(this.OLrzqt, i, theme);
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<java.lang.Integer, android.graphics.drawable.Drawable> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new C5380Pm(this.OLrzqt, this);
        }
    }

    /* JADX INFO: renamed from: o.Pm$StateListAnimator */
    public static final class StateListAnimator<DataT> implements NU<DataT> {
        public DataT AEQbTJ;
        public final Application<DataT> EZpvd;
        public final android.content.res.Resources KWHzl;
        public final Resources.Theme OLrzqt;
        public final int copydefault;

        @Override // o.NU
        public void copydefault() {
        }

        public StateListAnimator(@androidx.annotation.Nullable Resources.Theme theme, android.content.res.Resources resources, Application<DataT> application, int i) {
            this.OLrzqt = theme;
            this.KWHzl = resources;
            this.EZpvd = application;
            this.copydefault = i;
        }

        /* JADX WARN: Type inference failed for: r4v3, types: [DataT, java.lang.Object] */
        @Override // o.NU
        public void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super DataT> taskDescription) {
            try {
                DataT datatCopydefault = this.EZpvd.copydefault(this.OLrzqt, this.KWHzl, this.copydefault);
                this.AEQbTJ = datatCopydefault;
                taskDescription.KWHzl(datatCopydefault);
            } catch (Resources.NotFoundException e) {
                taskDescription.copydefault(e);
            }
        }

        @Override // o.NU
        public void AEQbTJ() {
            DataT datat = this.AEQbTJ;
            if (datat != null) {
                try {
                    this.EZpvd.copydefault(datat);
                } catch (java.io.IOException unused) {
                }
            }
        }

        @Override // o.NU
        public java.lang.Class<DataT> KWHzl() {
            return this.EZpvd.EZpvd();
        }

        @Override // o.NU
        public com.bumptech.glide.load.DataSource OLrzqt() {
            return com.bumptech.glide.load.DataSource.LOCAL;
        }
    }
}
