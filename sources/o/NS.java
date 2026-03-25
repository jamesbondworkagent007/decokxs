package o;

import com.bumptech.glide.Priority;
import o.NU;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NS<T> implements NU<T> {
    public T EZpvd;
    public final java.lang.String OLrzqt;
    public final android.content.res.AssetManager copydefault;

    public abstract T AEQbTJ(android.content.res.AssetManager assetManager, java.lang.String str) throws java.io.IOException;

    public abstract void AEQbTJ(T t) throws java.io.IOException;

    @Override // o.NU
    public void copydefault() {
    }

    public NS(android.content.res.AssetManager assetManager, java.lang.String str) {
        this.copydefault = assetManager;
        this.OLrzqt = str;
    }

    @Override // o.NU
    public void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull NU.TaskDescription<? super T> taskDescription) {
        try {
            T tAEQbTJ = AEQbTJ(this.copydefault, this.OLrzqt);
            this.EZpvd = tAEQbTJ;
            taskDescription.KWHzl(tAEQbTJ);
        } catch (java.io.IOException e) {
            taskDescription.copydefault(e);
        }
    }

    @Override // o.NU
    public void AEQbTJ() {
        T t = this.EZpvd;
        if (t == null) {
            return;
        }
        try {
            AEQbTJ(t);
        } catch (java.io.IOException unused) {
        }
    }

    @Override // o.NU
    public com.bumptech.glide.load.DataSource OLrzqt() {
        return com.bumptech.glide.load.DataSource.LOCAL;
    }
}
