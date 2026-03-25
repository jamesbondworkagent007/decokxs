package o;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationCategoryBean;
import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.NotificationEntryPointEnum;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class rYW {
    public final InterfaceC33171mrS KWHzl;
    public final rYV OLrzqt;
    public static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    @yCM
    public rYW(@NotNull InterfaceC33171mrS interfaceC33171mrS, @NotNull rYV ryv) {
        Intrinsics.checkNotNullParameter(interfaceC33171mrS, "");
        Intrinsics.checkNotNullParameter(ryv, "");
        this.KWHzl = interfaceC33171mrS;
        this.OLrzqt = ryv;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rYW.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final java.lang.Object AEQbTJ(boolean z, @NotNull Continuation<? super java.util.List<NotificationCategoryBean>> continuation) {
        NotificationEntryPointEnum notificationEntryPointEnum;
        pUU.KWHzl("FetchNotificationCategoriesUseCase", "execute...");
        rXO rxo = (rXO) C43251rlk.OLrzqt(rXO.class);
        boolean z2 = rxo != null && (rxo.AEQbTJ() || rxo.OLrzqt());
        boolean zFIwbmz = this.KWHzl.fIwbmz();
        boolean zCopydefault = C34703nhO.copydefault();
        if (z) {
            notificationEntryPointEnum = NotificationEntryPointEnum.COPYTRADING;
        } else if (C42597rYt.EZpvd()) {
            notificationEntryPointEnum = NotificationEntryPointEnum.CEFI;
        } else if (zCopydefault) {
            notificationEntryPointEnum = NotificationEntryPointEnum.WEB3;
        } else if (zFIwbmz) {
            if (z2) {
                notificationEntryPointEnum = NotificationEntryPointEnum.WEB3;
            } else {
                notificationEntryPointEnum = NotificationEntryPointEnum.WEB3WITHPRICEALERT;
            }
        } else if (z2) {
            notificationEntryPointEnum = NotificationEntryPointEnum.CEFI;
        } else {
            notificationEntryPointEnum = NotificationEntryPointEnum.WITHPRICEALERT;
        }
        return this.OLrzqt.OLrzqt(notificationEntryPointEnum, continuation);
    }
}
