package uniffi.network;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", TtmlNode.START, OtpEventTracker.OTP_EVENT_VALUE_CANCEL})
public class UniffiVTableCallbackInterfaceLegacyDownloadTask extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceLegacyDownloadTaskMethod1 cancel;
    public UniffiCallbackInterfaceLegacyDownloadTaskMethod0 start;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceLegacyDownloadTask() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod0) : (r4v0 uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod1) : (r5v0 uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod0, uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod1):void (m)] (LINE:202) call: uniffi.network.UniffiVTableCallbackInterfaceLegacyDownloadTask.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod0, uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod1):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceLegacyDownloadTask(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLegacyDownloadTaskMethod0 uniffiCallbackInterfaceLegacyDownloadTaskMethod0, UniffiCallbackInterfaceLegacyDownloadTaskMethod1 uniffiCallbackInterfaceLegacyDownloadTaskMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceLegacyDownloadTaskMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceLegacyDownloadTaskMethod1);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceLegacyDownloadTask implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, null, 15, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod0) : (r4v0 uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod0))
  (wrap:uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod1:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod1) : (r5v0 uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod1))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod0, uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod1):void (m)] (LINE:208) call: uniffi.network.UniffiVTableCallbackInterfaceLegacyDownloadTask.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod0, uniffi.network.UniffiCallbackInterfaceLegacyDownloadTaskMethod1):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLegacyDownloadTaskMethod0 uniffiCallbackInterfaceLegacyDownloadTaskMethod0, UniffiCallbackInterfaceLegacyDownloadTaskMethod1 uniffiCallbackInterfaceLegacyDownloadTaskMethod1, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceLegacyDownloadTaskMethod0, (i & 8) != 0 ? null : uniffiCallbackInterfaceLegacyDownloadTaskMethod1);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLegacyDownloadTaskMethod0 uniffiCallbackInterfaceLegacyDownloadTaskMethod0, UniffiCallbackInterfaceLegacyDownloadTaskMethod1 uniffiCallbackInterfaceLegacyDownloadTaskMethod1) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceLegacyDownloadTaskMethod0, uniffiCallbackInterfaceLegacyDownloadTaskMethod1);
        }
    }

    public UniffiVTableCallbackInterfaceLegacyDownloadTask(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceLegacyDownloadTaskMethod0 uniffiCallbackInterfaceLegacyDownloadTaskMethod0, UniffiCallbackInterfaceLegacyDownloadTaskMethod1 uniffiCallbackInterfaceLegacyDownloadTaskMethod1) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.start = uniffiCallbackInterfaceLegacyDownloadTaskMethod0;
        this.cancel = uniffiCallbackInterfaceLegacyDownloadTaskMethod1;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceLegacyDownloadTask uniffiVTableCallbackInterfaceLegacyDownloadTask) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceLegacyDownloadTask, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceLegacyDownloadTask.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceLegacyDownloadTask.uniffiClone;
        this.start = uniffiVTableCallbackInterfaceLegacyDownloadTask.start;
        this.cancel = uniffiVTableCallbackInterfaceLegacyDownloadTask.cancel;
    }
}
