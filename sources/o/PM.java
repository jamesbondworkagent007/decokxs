package o;

import android.os.Build;
import com.bumptech.glide.Priority;
import o.InterfaceC5386Ps;
import o.NU;

/* JADX INFO: loaded from: classes2.dex */
public final class PM<DataT> implements InterfaceC5386Ps<android.net.Uri, DataT> {
    public final java.lang.Class<DataT> AEQbTJ;
    public final InterfaceC5386Ps<java.io.File, DataT> EZpvd;
    public final InterfaceC5386Ps<android.net.Uri, DataT> OLrzqt;
    public final android.content.Context copydefault;

    public PM(android.content.Context context, InterfaceC5386Ps<java.io.File, DataT> interfaceC5386Ps, InterfaceC5386Ps<android.net.Uri, DataT> interfaceC5386Ps2, java.lang.Class<DataT> cls) {
        this.copydefault = context.getApplicationContext();
        this.EZpvd = interfaceC5386Ps;
        this.OLrzqt = interfaceC5386Ps2;
        this.AEQbTJ = cls;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<DataT> AEQbTJ(@androidx.annotation.NonNull android.net.Uri uri, int i, int i2, @androidx.annotation.NonNull NM nm) {
        return new InterfaceC5386Ps.Application<>(new C5465St(uri), new TaskDescription(this.copydefault, this.EZpvd, this.OLrzqt, uri, i, i2, nm, this.AEQbTJ));
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@androidx.annotation.NonNull android.net.Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && C5345Od.AEQbTJ(uri);
    }

    public static final class TaskDescription<DataT> implements NU<DataT> {
        public static final java.lang.String[] KWHzl = {"_data"};
        public final android.content.Context AEQbTJ;
        public volatile boolean AYXKKw;
        public final InterfaceC5386Ps<android.net.Uri, DataT> AhwBna;
        public final InterfaceC5386Ps<java.io.File, DataT> EZpvd;
        public volatile NU<DataT> OLrzqt;
        public final java.lang.Class<DataT> copydefault;
        public final int djBIcL;
        public final int fetchVPNInfo;
        public final NM gEmmrt;
        public final android.net.Uri valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NU
        public java.lang.Class<DataT> KWHzl() {
            return this.copydefault;
        }

        public TaskDescription(android.content.Context context, InterfaceC5386Ps<java.io.File, DataT> interfaceC5386Ps, InterfaceC5386Ps<android.net.Uri, DataT> interfaceC5386Ps2, android.net.Uri uri, int i, int i2, NM nm, java.lang.Class<DataT> cls) {
            this.AEQbTJ = context.getApplicationContext();
            this.EZpvd = interfaceC5386Ps;
            this.AhwBna = interfaceC5386Ps2;
            this.valueOf = uri;
            this.fetchVPNInfo = i;
            this.djBIcL = i2;
            this.gEmmrt = nm;
            this.copydefault = cls;
        }

        @Override // o.NU
        public void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super DataT> taskDescription) {
            try {
                NU<DataT> nuAYXKKw = AYXKKw();
                if (nuAYXKKw == null) {
                    taskDescription.copydefault(new java.lang.IllegalArgumentException("Failed to build fetcher for: " + this.valueOf));
                    return;
                }
                this.OLrzqt = nuAYXKKw;
                if (this.AYXKKw) {
                    copydefault();
                } else {
                    nuAYXKKw.EZpvd(priority, taskDescription);
                }
            } catch (java.io.FileNotFoundException e) {
                taskDescription.copydefault(e);
            }
        }

        public final NU<DataT> AYXKKw() throws java.io.FileNotFoundException {
            InterfaceC5386Ps.Application<DataT> applicationEZpvd = EZpvd();
            if (applicationEZpvd != null) {
                return applicationEZpvd.EZpvd;
            }
            return null;
        }

        public final InterfaceC5386Ps.Application<DataT> EZpvd() throws java.io.FileNotFoundException {
            if (android.os.Environment.isExternalStorageLegacy()) {
                return this.EZpvd.AEQbTJ(KWHzl(this.valueOf), this.fetchVPNInfo, this.djBIcL, this.gEmmrt);
            }
            return this.AhwBna.AEQbTJ(djBIcL() ? android.provider.MediaStore.setRequireOriginal(this.valueOf) : this.valueOf, this.fetchVPNInfo, this.djBIcL, this.gEmmrt);
        }

        @Override // o.NU
        public void AEQbTJ() {
            NU<DataT> nu = this.OLrzqt;
            if (nu != null) {
                nu.AEQbTJ();
            }
        }

        @Override // o.NU
        public void copydefault() {
            this.AYXKKw = true;
            NU<DataT> nu = this.OLrzqt;
            if (nu != null) {
                nu.copydefault();
            }
        }

        @Override // o.NU
        public com.bumptech.glide.load.DataSource OLrzqt() {
            return com.bumptech.glide.load.DataSource.LOCAL;
        }

        public final java.io.File KWHzl(android.net.Uri uri) throws java.io.FileNotFoundException {
            android.database.Cursor cursor = null;
            try {
                android.database.Cursor cursorQuery = this.AEQbTJ.getContentResolver().query(uri, KWHzl, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new java.io.FileNotFoundException("Failed to media store entry for: " + uri);
                }
                java.lang.String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (android.text.TextUtils.isEmpty(string)) {
                    throw new java.io.FileNotFoundException("File path was empty in media store for: " + uri);
                }
                java.io.File file = new java.io.File(string);
                cursorQuery.close();
                return file;
            } catch (java.lang.Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        public final boolean djBIcL() {
            return this.AEQbTJ.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }
    }

    public static final class Application extends StateListAnimator<java.io.InputStream> {
        public Application(android.content.Context context) {
            super(context, java.io.InputStream.class);
        }
    }

    public static final class ActionBar extends StateListAnimator<android.os.ParcelFileDescriptor> {
        public ActionBar(android.content.Context context) {
            super(context, android.os.ParcelFileDescriptor.class);
        }
    }

    public static abstract class StateListAnimator<DataT> implements InterfaceC5390Pw<android.net.Uri, DataT> {
        public final android.content.Context AEQbTJ;
        public final java.lang.Class<DataT> OLrzqt;

        @Override // o.InterfaceC5390Pw
        public final void AEQbTJ() {
        }

        public StateListAnimator(android.content.Context context, java.lang.Class<DataT> cls) {
            this.AEQbTJ = context;
            this.OLrzqt = cls;
        }

        @Override // o.InterfaceC5390Pw
        public final InterfaceC5386Ps<android.net.Uri, DataT> AEQbTJ(@androidx.annotation.NonNull PA pa) {
            return new PM(this.AEQbTJ, pa.OLrzqt(java.io.File.class, this.OLrzqt), pa.OLrzqt(android.net.Uri.class, this.OLrzqt), this.OLrzqt);
        }
    }
}
