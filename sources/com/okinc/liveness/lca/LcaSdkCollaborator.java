package com.okinc.liveness.lca;

import android.content.Context;
import android.content.Intent;
import com.okinc.liveness.lca.debugtool.data.LcaDebugInfo;
import com.okinc.liveness.lca.manager.LcaSdkManager;
import com.okinc.liveness.lca.ui.LcaLivenessScanActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LcaSdkCollaborator {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static volatile LcaSdkCollaborator instance;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.LcaSdkCollaborator.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LcaSdkCollaborator(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.lca.LcaSdkCollaborator.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final LcaSdkCollaborator getInstance() {
            LcaSdkCollaborator lcaSdkCollaborator = LcaSdkCollaborator.instance;
            if (lcaSdkCollaborator == null) {
                synchronized (this) {
                    lcaSdkCollaborator = LcaSdkCollaborator.instance;
                    if (lcaSdkCollaborator == null) {
                        lcaSdkCollaborator = new LcaSdkCollaborator(null);
                        Companion companion = LcaSdkCollaborator.Companion;
                        LcaSdkCollaborator.instance = lcaSdkCollaborator;
                    }
                }
            }
            return lcaSdkCollaborator;
        }
    }

    private LcaSdkCollaborator() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.liveness.lca.LcaSdkCollaborator */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void startLivenessCheck$default(LcaSdkCollaborator lcaSdkCollaborator, Context context, LcaSdkConfiguration lcaSdkConfiguration, Function2 function2, Function2 function22, int i, Object obj) {
        if ((i & 8) != 0) {
            function22 = null;
        }
        lcaSdkCollaborator.startLivenessCheck(context, lcaSdkConfiguration, function2, function22);
    }

    public final void startLivenessCheck(@NotNull Context context, @NotNull LcaSdkConfiguration lcaSdkConfiguration, @NotNull Function2<? super LcaLivenessCheckResult, ? super Function0<Unit>, Unit> function2, Function2<? super byte[], ? super Long, Unit> function22) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lcaSdkConfiguration, "");
        Intrinsics.checkNotNullParameter(function2, "");
        LcaSdkManager.Companion companion = LcaSdkManager.Companion;
        companion.getInstance().setConfiguration(lcaSdkConfiguration);
        companion.getInstance().setResultCallback(function2);
        companion.getInstance().setVideoSegmentCallback(function22);
        Intent intent = new Intent(context, (Class<?>) LcaLivenessScanActivity.class);
        intent.setFlags(536870912);
        context.startActivity(intent);
    }

    public final void startLivenessCheck$OKCompliance_ok_compliance_dynamic_lca_impl(@NotNull Context context, @NotNull LcaSdkConfiguration lcaSdkConfiguration, @NotNull Function2<? super LcaLivenessCheckResult, ? super Function0<Unit>, Unit> function2, Function2<? super byte[], ? super Long, Unit> function22, Function1<? super LcaDebugInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(lcaSdkConfiguration, "");
        Intrinsics.checkNotNullParameter(function2, "");
        LcaSdkManager.Companion companion = LcaSdkManager.Companion;
        companion.getInstance().setConfiguration(lcaSdkConfiguration);
        companion.getInstance().setResultCallback(function2);
        companion.getInstance().setVideoSegmentCallback(function22);
        companion.getInstance().setDebugInfoCallback(function1);
        Intent intent = new Intent(context, (Class<?>) LcaLivenessScanActivity.class);
        intent.setFlags(536870912);
        context.startActivity(intent);
    }
}
