package o;

import com.okinc.lib.monitor.memory.LeakCertainty;
import com.okinc.okapm.Apm;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC38044pKd;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.mgO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32584mgO {
    public static final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.mgR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32584mgO.gEmmrt();
        }
    });
    public static final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.mgQ
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C32584mgO.copydefault();
        }
    });

    public static final long AEQbTJ(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        return jSONObject.optLong("confirmedLeakThreshold", 1000L);
    }

    public static final long djBIcL(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        return jSONObject.optLong("suspectedLeakThreshold", 5000L);
    }

    public static final long copydefault(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        return jSONObject.optLong("reportProcessingInterval", 2000L);
    }

    public static final long OLrzqt(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        return jSONObject.optLong("referenceQueuePollInterval", 3000L);
    }

    public static final float KWHzl(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        return jSONObject.optLong("memoryRatioExceededThreshold", 20L) / 100.0f;
    }

    public static final boolean EZpvd(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        return jSONObject.optBoolean("isFragmentLeakDetectEnabled", true);
    }

    public static final pJZ OLrzqt() {
        return (pJZ) OLrzqt.getValue();
    }

    public static final TaskDescription gEmmrt() {
        return new TaskDescription();
    }

    /* JADX INFO: renamed from: o.mgO$TaskDescription */
    public static final class TaskDescription implements pJZ {
        public final java.lang.String EZpvd = "GrafanaReporter";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.pJZ
        public java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        @Override // o.pJZ
        public void OLrzqt(InterfaceC38044pKd interfaceC38044pKd) {
            Intrinsics.checkNotNullParameter(interfaceC38044pKd, "");
            if (interfaceC38044pKd instanceof InterfaceC38044pKd.ActionBar) {
                InterfaceC38044pKd.ActionBar actionBar = (InterfaceC38044pKd.ActionBar) interfaceC38044pKd;
                java.util.Map<java.lang.String, java.lang.String> mapCopydefault = actionBar.copydefault();
                com.okinc.okapm.Apm apmAEQbTJ = com.okinc.okapm.Apm.Companion.AEQbTJ();
                if (apmAEQbTJ != null) {
                    Apm.TaskDescription.Activity activity = Apm.TaskDescription.Companion;
                    java.lang.String str = mapCopydefault.get("path");
                    java.lang.String str2 = str != null ? str : "";
                    apmAEQbTJ.copydefault(activity.OLrzqt(Apm.EventGroupType.CUSTOM.getValue(), Apm.EventType.MEMORY_LEAK.getValue(), str2, actionBar.copydefault()));
                }
            }
        }
    }

    public static final pJZ KWHzl() {
        return (pJZ) KWHzl.getValue();
    }

    public static final ActionBar copydefault() {
        return new ActionBar();
    }

    /* JADX INFO: renamed from: o.mgO$ActionBar */
    public static final class ActionBar implements pJZ {
        public final java.lang.String copydefault = "E2EReporter";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.pJZ
        public java.lang.String AEQbTJ() {
            return this.copydefault;
        }

        @Override // o.pJZ
        public void OLrzqt(InterfaceC38044pKd interfaceC38044pKd) {
            Intrinsics.checkNotNullParameter(interfaceC38044pKd, "");
            if (interfaceC38044pKd instanceof InterfaceC38044pKd.ActionBar) {
                java.util.Map<java.lang.String, java.lang.String> mapCopydefault = ((InterfaceC38044pKd.ActionBar) interfaceC38044pKd).copydefault();
                java.lang.String str = mapCopydefault.get("path");
                if (str == null) {
                    str = "unknown";
                }
                java.lang.String str2 = str;
                java.lang.String displayName = mapCopydefault.get("type");
                if (displayName == null) {
                    displayName = LeakCertainty.LOW.getDisplayName();
                }
                mNS.outputE2EMemoryLeakAPM$default(mNS.copydefault, str2, displayName, null, mapCopydefault, 4, null);
            }
        }
    }
}
