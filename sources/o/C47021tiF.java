package o;

import com.google.android.gms.common.ConnectionResult;
import com.okinc.components.track.ABTestManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: renamed from: o.tiF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47021tiF implements InterfaceC47019tiD {
    @Override // o.InterfaceC47019tiD
    public boolean KWHzl() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "okrisk_dynamic_config", null, 2, null), (java.lang.Object) "enabled");
    }

    @Override // o.InterfaceC47019tiD
    public boolean AhwBna() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "okrisk_disable_sampling", null, 2, null), (java.lang.Object) "true");
    }

    @Override // o.InterfaceC47019tiD
    public boolean OLrzqt() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "okrisk_disable_appreport", null, 2, null), (java.lang.Object) "true");
    }

    @Override // o.InterfaceC47019tiD
    public boolean gEmmrt() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "okrisk_icon_collection_enabled", null, 2, null), (java.lang.Object) "true");
    }

    @Override // o.InterfaceC47019tiD
    public boolean EZpvd() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "okrisk_file_upload_enabled", null, 2, null), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    @Override // o.InterfaceC47019tiD
    public int copydefault() {
        java.lang.Integer intOrNull;
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "okrisk_app_batch_process_size", null, 2, null);
        if (value$default == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(value$default)) == null) {
            return 1;
        }
        return intOrNull.intValue();
    }

    @Override // o.InterfaceC47019tiD
    public boolean AYXKKw() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "okrisk_sec_token_enabled", null, 2, null), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }

    @Override // o.InterfaceC47019tiD
    public int AEQbTJ() {
        java.lang.Integer intOrNull;
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, "okrisk_ali_token_threshold", null, 2, null);
        return (value$default == null || (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(value$default)) == null) ? ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED : intOrNull.intValue();
    }

    @Override // o.InterfaceC47019tiD
    public boolean djBIcL() {
        return Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "okrisk_file_upload_enforced", null, 2, null), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON);
    }
}
