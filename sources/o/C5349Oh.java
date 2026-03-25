package o;

import android.provider.MediaStore;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import o.NU;

/* JADX INFO: renamed from: o.Oh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5349Oh implements NU<java.io.InputStream> {
    public final C5350Oi AEQbTJ;
    public java.io.InputStream OLrzqt;
    public final android.net.Uri copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.NU
    public java.lang.Class<java.io.InputStream> KWHzl() {
        return java.io.InputStream.class;
    }

    @Override // o.NU
    public void copydefault() {
    }

    public static C5349Oh KWHzl(android.content.Context context, android.net.Uri uri) {
        return AEQbTJ(context, uri, new ActionBar(context.getContentResolver()));
    }

    public static C5349Oh copydefault(android.content.Context context, android.net.Uri uri) {
        return AEQbTJ(context, uri, new Activity(context.getContentResolver()));
    }

    public static C5349Oh AEQbTJ(android.content.Context context, android.net.Uri uri, InterfaceC5351Oj interfaceC5351Oj) {
        return new C5349Oh(uri, new C5350Oi(Glide.OLrzqt(context).djBIcL().OLrzqt(), interfaceC5351Oj, Glide.OLrzqt(context).copydefault(), context.getContentResolver()));
    }

    public C5349Oh(android.net.Uri uri, C5350Oi c5350Oi) {
        this.copydefault = uri;
        this.AEQbTJ = c5350Oi;
    }

    @Override // o.NU
    public void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super java.io.InputStream> taskDescription) throws java.lang.Throwable {
        try {
            java.io.InputStream inputStreamEZpvd = EZpvd();
            this.OLrzqt = inputStreamEZpvd;
            taskDescription.KWHzl(inputStreamEZpvd);
        } catch (java.io.FileNotFoundException e) {
            taskDescription.copydefault(e);
        }
    }

    public final java.io.InputStream EZpvd() throws java.lang.Throwable {
        java.io.InputStream inputStreamEZpvd = this.AEQbTJ.EZpvd(this.copydefault);
        int iCopydefault = inputStreamEZpvd != null ? this.AEQbTJ.copydefault(this.copydefault) : -1;
        return iCopydefault != -1 ? new NV(inputStreamEZpvd, iCopydefault) : inputStreamEZpvd;
    }

    @Override // o.NU
    public void AEQbTJ() {
        java.io.InputStream inputStream = this.OLrzqt;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    @Override // o.NU
    public com.bumptech.glide.load.DataSource OLrzqt() {
        return com.bumptech.glide.load.DataSource.LOCAL;
    }

    /* JADX INFO: renamed from: o.Oh$Activity */
    public static class Activity implements InterfaceC5351Oj {
        public static final java.lang.String[] KWHzl = {"_data"};
        public final android.content.ContentResolver EZpvd;

        public Activity(android.content.ContentResolver contentResolver) {
            this.EZpvd = contentResolver;
        }

        @Override // o.InterfaceC5351Oj
        public android.database.Cursor AEQbTJ(android.net.Uri uri) {
            return this.EZpvd.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, KWHzl, "kind = 1 AND video_id = ?", new java.lang.String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* JADX INFO: renamed from: o.Oh$ActionBar */
    public static class ActionBar implements InterfaceC5351Oj {
        public static final java.lang.String[] AEQbTJ = {"_data"};
        public final android.content.ContentResolver OLrzqt;

        public ActionBar(android.content.ContentResolver contentResolver) {
            this.OLrzqt = contentResolver;
        }

        @Override // o.InterfaceC5351Oj
        public android.database.Cursor AEQbTJ(android.net.Uri uri) {
            return this.OLrzqt.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, AEQbTJ, "kind = 1 AND image_id = ?", new java.lang.String[]{uri.getLastPathSegment()}, null);
        }
    }
}
