package o;

import com.bumptech.glide.Priority;
import o.InterfaceC5386Ps;
import o.NU;

/* JADX INFO: renamed from: o.Pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5381Pn implements InterfaceC5386Ps<android.net.Uri, java.io.File> {
    public final android.content.Context copydefault;

    public C5381Pn(android.content.Context context) {
        this.copydefault = context;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Ljava/lang/Object;IILo/NM;)Lo/Ps$Application; */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InterfaceC5386Ps.Application<java.io.File> AEQbTJ(@androidx.annotation.NonNull android.net.Uri uri, int i, int i2, @androidx.annotation.NonNull NM nm) {
        return new InterfaceC5386Ps.Application<>(new C5465St(uri), new Application(this.copydefault, uri));
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;)Z */
    @Override // o.InterfaceC5386Ps
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public boolean OLrzqt(@androidx.annotation.NonNull android.net.Uri uri) {
        return C5345Od.AEQbTJ(uri);
    }

    /* JADX INFO: renamed from: o.Pn$Application */
    public static class Application implements NU<java.io.File> {
        public static final java.lang.String[] EZpvd = {"_data"};
        public final android.net.Uri KWHzl;
        public final android.content.Context OLrzqt;

        @Override // o.NU
        public void AEQbTJ() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NU
        public java.lang.Class<java.io.File> KWHzl() {
            return java.io.File.class;
        }

        @Override // o.NU
        public void copydefault() {
        }

        public Application(android.content.Context context, android.net.Uri uri) {
            this.OLrzqt = context;
            this.KWHzl = uri;
        }

        @Override // o.NU
        public void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super java.io.File> taskDescription) {
            android.database.Cursor cursorQuery = this.OLrzqt.getContentResolver().query(this.KWHzl, EZpvd, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    cursorQuery.close();
                }
            }
            if (android.text.TextUtils.isEmpty(string)) {
                taskDescription.copydefault(new java.io.FileNotFoundException("Failed to find file path for: " + this.KWHzl));
                return;
            }
            taskDescription.KWHzl(new java.io.File(string));
        }

        @Override // o.NU
        public com.bumptech.glide.load.DataSource OLrzqt() {
            return com.bumptech.glide.load.DataSource.LOCAL;
        }
    }

    /* JADX INFO: renamed from: o.Pn$TaskDescription */
    public static final class TaskDescription implements InterfaceC5390Pw<android.net.Uri, java.io.File> {
        public final android.content.Context AEQbTJ;

        @Override // o.InterfaceC5390Pw
        public void AEQbTJ() {
        }

        public TaskDescription(android.content.Context context) {
            this.AEQbTJ = context;
        }

        @Override // o.InterfaceC5390Pw
        public InterfaceC5386Ps<android.net.Uri, java.io.File> AEQbTJ(PA pa) {
            return new C5381Pn(this.AEQbTJ);
        }
    }
}
