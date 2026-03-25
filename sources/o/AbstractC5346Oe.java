package o;

import com.bumptech.glide.Priority;
import o.NU;

/* JADX INFO: renamed from: o.Oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5346Oe<T> implements NU<T> {
    public final android.content.ContentResolver EZpvd;
    public final android.net.Uri OLrzqt;
    public T copydefault;

    public abstract void AEQbTJ(T t) throws java.io.IOException;

    public abstract T KWHzl(android.net.Uri uri, android.content.ContentResolver contentResolver) throws java.io.FileNotFoundException;

    @Override // o.NU
    public void copydefault() {
    }

    public AbstractC5346Oe(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        this.EZpvd = contentResolver;
        this.OLrzqt = uri;
    }

    @Override // o.NU
    public final void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super T> taskDescription) {
        try {
            T tKWHzl = KWHzl(this.OLrzqt, this.EZpvd);
            this.copydefault = tKWHzl;
            taskDescription.KWHzl(tKWHzl);
        } catch (java.io.FileNotFoundException e) {
            taskDescription.copydefault(e);
        }
    }

    @Override // o.NU
    public void AEQbTJ() {
        T t = this.copydefault;
        if (t != null) {
            try {
                AEQbTJ(t);
            } catch (java.io.IOException unused) {
            }
        }
    }

    @Override // o.NU
    public com.bumptech.glide.load.DataSource OLrzqt() {
        return com.bumptech.glide.load.DataSource.LOCAL;
    }
}
