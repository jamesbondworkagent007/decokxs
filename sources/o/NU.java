package o;

import com.bumptech.glide.Priority;

/* JADX INFO: loaded from: classes2.dex */
public interface NU<T> {

    public interface TaskDescription<T> {
        void KWHzl(@androidx.annotation.Nullable T t);

        void copydefault(@androidx.annotation.NonNull java.lang.Exception exc);
    }

    void AEQbTJ();

    void EZpvd(@androidx.annotation.NonNull Priority priority, @androidx.annotation.NonNull TaskDescription<? super T> taskDescription);

    java.lang.Class<T> KWHzl();

    com.bumptech.glide.load.DataSource OLrzqt();

    void copydefault();
}
