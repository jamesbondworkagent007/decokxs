package com.okinc.components.track.amplitude;

import com.amplitude.common.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC5245Kh;
import o.JZ;
import o.pUU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AmplitudeLogProxy implements InterfaceC5245Kh {
    private static final String TAG = "AmpSDKLog";
    private final ActionBar logger;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC5245Kh
    public Logger getLogger(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        return this.logger;
    }

    public AmplitudeLogProxy(@NotNull Logger.LogMode logMode) {
        Intrinsics.checkNotNullParameter(logMode, "");
        this.logger = new ActionBar(logMode);
    }

    public static final class ActionBar implements Logger {
        public Logger.LogMode KWHzl;

        public ActionBar(Logger.LogMode logMode) {
            this.KWHzl = logMode;
        }

        @Override // com.amplitude.common.Logger
        public void OLrzqt(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.EZpvd(AmplitudeLogProxy.TAG, str);
        }

        @Override // com.amplitude.common.Logger
        public void EZpvd(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.copydefault(AmplitudeLogProxy.TAG, str);
        }

        @Override // com.amplitude.common.Logger
        public void AEQbTJ(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl(AmplitudeLogProxy.TAG, str);
        }

        @Override // com.amplitude.common.Logger
        public void KWHzl(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.valueOf(AmplitudeLogProxy.TAG, str);
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.components.track.amplitude.AmplitudeLogProxy.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
