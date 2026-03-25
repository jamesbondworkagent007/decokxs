package uniffi.settings;

import com.sun.jna.Structure;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uniffi.UniffiCallbackInterfaceClone;
import uniffi.UniffiCallbackInterfaceFree;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"uniffiFree", "uniffiClone", "onEvent"})
public class UniffiVTableCallbackInterfaceSettingsNotificationBridgingCallback extends Structure {
    public static final int $stable = 8;
    public UniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0 onEvent;
    public UniffiCallbackInterfaceClone uniffiClone;
    public UniffiCallbackInterfaceFree uniffiFree;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UniffiVTableCallbackInterfaceSettingsNotificationBridgingCallback() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.settings.UniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0) : (r4v0 uniffi.settings.UniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0):void (m)] (LINE:325) call: uniffi.settings.UniffiVTableCallbackInterfaceSettingsNotificationBridgingCallback.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0):void type: THIS */
    public /* synthetic */ UniffiVTableCallbackInterfaceSettingsNotificationBridgingCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0 uniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0);
    }

    public static final class UniffiByValue extends UniffiVTableCallbackInterfaceSettingsNotificationBridgingCallback implements Structure.ByValue {
        public static final int $stable = 0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UniffiByValue() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:uniffi.UniffiCallbackInterfaceFree:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceFree) : (r2v0 uniffi.UniffiCallbackInterfaceFree))
  (wrap:uniffi.UniffiCallbackInterfaceClone:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null uniffi.UniffiCallbackInterfaceClone) : (r3v0 uniffi.UniffiCallbackInterfaceClone))
  (wrap:uniffi.settings.UniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null uniffi.settings.UniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0) : (r4v0 uniffi.settings.UniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0))
 A[MD:(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0):void (m)] (LINE:330) call: uniffi.settings.UniffiVTableCallbackInterfaceSettingsNotificationBridgingCallback.UniffiByValue.<init>(uniffi.UniffiCallbackInterfaceFree, uniffi.UniffiCallbackInterfaceClone, uniffi.settings.UniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0):void type: THIS */
        public /* synthetic */ UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0 uniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uniffiCallbackInterfaceFree, (i & 2) != 0 ? null : uniffiCallbackInterfaceClone, (i & 4) != 0 ? null : uniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0);
        }

        public UniffiByValue(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0 uniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0) {
            super(uniffiCallbackInterfaceFree, uniffiCallbackInterfaceClone, uniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0);
        }
    }

    public UniffiVTableCallbackInterfaceSettingsNotificationBridgingCallback(UniffiCallbackInterfaceFree uniffiCallbackInterfaceFree, UniffiCallbackInterfaceClone uniffiCallbackInterfaceClone, UniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0 uniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0) {
        this.uniffiFree = uniffiCallbackInterfaceFree;
        this.uniffiClone = uniffiCallbackInterfaceClone;
        this.onEvent = uniffiCallbackInterfaceSettingsNotificationBridgingCallbackMethod0;
    }

    public final void uniffiSetValue$OKCore_deploy(@NotNull UniffiVTableCallbackInterfaceSettingsNotificationBridgingCallback uniffiVTableCallbackInterfaceSettingsNotificationBridgingCallback) {
        Intrinsics.checkNotNullParameter(uniffiVTableCallbackInterfaceSettingsNotificationBridgingCallback, "");
        this.uniffiFree = uniffiVTableCallbackInterfaceSettingsNotificationBridgingCallback.uniffiFree;
        this.uniffiClone = uniffiVTableCallbackInterfaceSettingsNotificationBridgingCallback.uniffiClone;
        this.onEvent = uniffiVTableCallbackInterfaceSettingsNotificationBridgingCallback.onEvent;
    }
}
