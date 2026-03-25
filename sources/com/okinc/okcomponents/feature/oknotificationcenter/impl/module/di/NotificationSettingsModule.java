package com.okinc.okcomponents.feature.oknotificationcenter.impl.module.di;

import com.okinc.okcomponents.feature.oknotificationcenter.impl.data.remote.NotificationSettingsService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C42600rYw;
import o.C42606rZb;
import o.rYY;
import o.rZE;
import o.rZF;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class NotificationSettingsModule {
    public static final ActionBar Companion = new ActionBar(null);

    public abstract rYY EZpvd(@NotNull C42606rZb c42606rZb);

    public abstract rZE copydefault(@NotNull rZF rzf);

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.impl.module.di.NotificationSettingsModule.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        @yCR
        public final NotificationSettingsService KWHzl() {
            return NotificationSettingsService.Companion.AEQbTJ();
        }

        @yCR
        public final C42600rYw EZpvd(@NotNull NotificationSettingsService notificationSettingsService) {
            Intrinsics.checkNotNullParameter(notificationSettingsService, "");
            return new C42600rYw(notificationSettingsService);
        }
    }
}
