package com.okinc.liveness.lca.manager;

import com.okinc.liveness.lca.LcaLivenessCheckResult;
import com.okinc.liveness.lca.LcaSdkConfiguration;
import com.okinc.liveness.lca.debugtool.data.LcaDebugInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaSdkManager {
    public static volatile LcaSdkManager instance;
    public Function1<? super LcaDebugInfo, Unit> debugInfoCallback;
    public Function2<? super LcaLivenessCheckResult, ? super Function0<Unit>, Unit> livenessResultCallback;
    public LcaSdkConfiguration sdkConfig;
    public Function2<? super byte[], ? super Long, Unit> videoSegmentCallback;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.manager.LcaSdkManager.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LcaSdkManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkConfiguration getConfiguration() {
        return this.sdkConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.okinc.liveness.lca.debugtool.data.LcaDebugInfo, kotlin.Unit>, kotlin.jvm.functions.Function1<com.okinc.liveness.lca.debugtool.data.LcaDebugInfo, kotlin.Unit> */
    public final Function1<LcaDebugInfo, Unit> getDebugInfoCallback() {
        return this.debugInfoCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super com.okinc.liveness.lca.LcaLivenessCheckResult, ? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>, kotlin.jvm.functions.Function2<com.okinc.liveness.lca.LcaLivenessCheckResult, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit> */
    public final Function2<LcaLivenessCheckResult, Function0<Unit>, Unit> getLivenessResultCallback() {
        return this.livenessResultCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.Long, kotlin.Unit>, kotlin.jvm.functions.Function2<byte[], java.lang.Long, kotlin.Unit> */
    public final Function2<byte[], Long, Unit> getVideoSegmentCallback() {
        return this.videoSegmentCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConfiguration(@NotNull LcaSdkConfiguration lcaSdkConfiguration) {
        Intrinsics.checkNotNullParameter(lcaSdkConfiguration, "");
        this.sdkConfig = lcaSdkConfiguration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDebugInfoCallback(Function1<? super LcaDebugInfo, Unit> function1) {
        this.debugInfoCallback = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setResultCallback(@NotNull Function2<? super LcaLivenessCheckResult, ? super Function0<Unit>, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        this.livenessResultCallback = function2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVideoSegmentCallback(Function2<? super byte[], ? super Long, Unit> function2) {
        this.videoSegmentCallback = function2;
    }

    private LcaSdkManager() {
        this.sdkConfig = new LcaSdkConfiguration(0, null, null, null, null, null, false, false, null, null, false, false, false, 0, false, null, 65535, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.liveness.lca.manager.LcaSdkManager */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setVideoSegmentCallback$default(LcaSdkManager lcaSdkManager, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            function2 = null;
        }
        lcaSdkManager.setVideoSegmentCallback(function2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.liveness.lca.manager.LcaSdkManager */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setDebugInfoCallback$default(LcaSdkManager lcaSdkManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        lcaSdkManager.setDebugInfoCallback(function1);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.manager.LcaSdkManager.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LcaSdkManager getInstance() {
            LcaSdkManager lcaSdkManager = LcaSdkManager.instance;
            if (lcaSdkManager == null) {
                synchronized (this) {
                    lcaSdkManager = LcaSdkManager.instance;
                    if (lcaSdkManager == null) {
                        lcaSdkManager = new LcaSdkManager(null);
                        Companion companion = LcaSdkManager.Companion;
                        LcaSdkManager.instance = lcaSdkManager;
                    }
                }
            }
            return lcaSdkManager;
        }

        public final void setInstance(@NotNull LcaSdkManager lcaSdkManager) {
            Intrinsics.checkNotNullParameter(lcaSdkManager, "");
            LcaSdkManager.instance = lcaSdkManager;
        }

        public final void resetInstance() {
            LcaSdkManager.instance = null;
        }
    }
}
