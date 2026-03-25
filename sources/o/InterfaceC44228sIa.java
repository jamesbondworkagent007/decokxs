package o;

import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.OKRecallNotificationMessage;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sIa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC44228sIa {
    void AEQbTJ(@NotNull OKMessage oKMessage, @NotNull OKRecallNotificationMessage oKRecallNotificationMessage);

    java.lang.Object EZpvd(@NotNull OKMessage oKMessage, boolean z, @NotNull Continuation<? super Unit> continuation);

    void EZpvd(@NotNull OKMessage oKMessage);

    void OLrzqt(@NotNull OKMessage oKMessage);
}
