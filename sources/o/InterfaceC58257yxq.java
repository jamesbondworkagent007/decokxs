package o;

/* JADX INFO: renamed from: o.yxq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC58257yxq<T> {
    boolean isDisposed();

    void onError(java.lang.Throwable th);

    void onSuccess(T t);

    void setCancellable(InterfaceC58225yxK interfaceC58225yxK);

    void setDisposable(InterfaceC58217yxC interfaceC58217yxC);

    boolean tryOnError(java.lang.Throwable th);
}
