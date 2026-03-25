package com.okinc.liveness.lca.ui;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public abstract class LivenessUIState {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.ui.LivenessUIState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LivenessUIState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class StartingUp extends LivenessUIState {
        public static final int $stable = 0;
        public static final StartingUp INSTANCE = new StartingUp();

        private StartingUp() {
            super(null);
        }
    }

    private LivenessUIState() {
    }

    public static final class FarSelfie extends LivenessUIState {
        public static final int $stable = 0;
        public static final FarSelfie INSTANCE = new FarSelfie();

        private FarSelfie() {
            super(null);
        }
    }

    public static final class CloseSelfie extends LivenessUIState {
        public static final int $stable = 0;
        public static final CloseSelfie INSTANCE = new CloseSelfie();

        private CloseSelfie() {
            super(null);
        }
    }

    public static final class FinalCheck extends LivenessUIState {
        public static final int $stable = 0;
        public static final FinalCheck INSTANCE = new FinalCheck();

        private FinalCheck() {
            super(null);
        }
    }

    public static final class Error extends LivenessUIState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }
}
