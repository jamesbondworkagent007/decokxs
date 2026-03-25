package com.okinc.common.okcore.callback;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC4503Bgm;
import o.pUU;
import o.pUX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class OKCorePanicHandlerImpl implements InterfaceC4503Bgm {
    @Override // o.InterfaceC4503Bgm
    public void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            pUX.OLrzqt.AEQbTJ(new OKCoreCrashException(str));
        } catch (Throwable th) {
            pUU.AEQbTJ("OKCoreNativeCrash", "failed to post crash exception", th);
        }
        pUU.copydefault("OKCoreNativeCrash", "crash details: " + str);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class OKCoreCrashException extends Exception {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public OKCoreCrashException() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OKCoreCrashException(@NotNull String str) {
            super(str);
            Intrinsics.checkNotNullParameter(str, "");
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:21) call: com.okinc.common.okcore.callback.OKCorePanicHandlerImpl.OKCoreCrashException.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ OKCoreCrashException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }
}
