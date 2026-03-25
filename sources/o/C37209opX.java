package o;

import com.okinc.okimcore.feature.notification.model.NotificationSource;
import com.okinc.okimcore.feature.notification.model.NotificationType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.opX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37209opX implements InterfaceC46949tgn {
    @Override // o.InterfaceC46949tgn
    public C46953tgr OLrzqt() {
        return new C46953tgr(true);
    }

    @Override // o.InterfaceC46949tgn
    public void copydefault(@NotNull C46952tgq c46952tgq) {
        Intrinsics.checkNotNullParameter(c46952tgq, "");
        C44124sEe.imLogNotification$default("on push notification [im/message], " + c46952tgq, null, 2, null);
        C37207opV.copydefault.AEQbTJ(new C44363sNa(c46952tgq, NotificationType.MESSAGE), (C44467sQx) null, NotificationSource.PUSH_CHANNEL);
    }
}
