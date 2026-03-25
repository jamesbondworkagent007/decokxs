package o;

import com.okinc.lib.dionysus.crash.bean.ErrorAttachmentLog;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface pIB {
    void AEQbTJ(java.lang.Throwable th, @NotNull android.app.Activity activity);

    java.lang.Iterable<ErrorAttachmentLog> KWHzl();

    void KWHzl(java.lang.Throwable th, @NotNull android.app.Activity activity);

    boolean copydefault(@NotNull java.lang.Throwable th);
}
