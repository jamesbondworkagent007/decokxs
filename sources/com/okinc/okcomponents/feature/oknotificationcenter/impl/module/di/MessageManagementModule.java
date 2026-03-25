package com.okinc.okcomponents.feature.oknotificationcenter.impl.module.di;

import com.okinc.okcomponents.feature.oknotificationcenter.impl.data.remote.MessageManagementService;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C42601rYx;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class MessageManagementModule {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okcomponents.feature.oknotificationcenter.impl.module.di.MessageManagementModule.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        @yCR
        public final MessageManagementService EZpvd() {
            return MessageManagementService.Companion.KWHzl();
        }

        @yCR
        public final C42601rYx KWHzl(@NotNull MessageManagementService messageManagementService) {
            Intrinsics.checkNotNullParameter(messageManagementService, "");
            return new C42601rYx(messageManagementService);
        }
    }
}
