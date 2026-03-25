package o;

import com.okinc.im.call.model.CallSessionV2;
import com.okinc.im.call.model.CallStateV2;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: o.nrG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35219nrG {
    public static final java.lang.String AEQbTJ(CallStateV2 callStateV2) {
        if (callStateV2 instanceof CallStateV2.Idle) {
            return "Idle";
        }
        if (callStateV2 instanceof CallStateV2.Ringing) {
            CallStateV2.Ringing ringing = (CallStateV2.Ringing) callStateV2;
            return "Ringing(" + ringing.valueOf() + "," + ringing.djBIcL().djBIcL() + ")";
        }
        if (callStateV2 instanceof CallStateV2.Connecting) {
            CallStateV2.Connecting connecting = (CallStateV2.Connecting) callStateV2;
            return "Connecting(" + connecting.valueOf() + "," + connecting.AYXKKw().djBIcL() + ")";
        }
        if (callStateV2 instanceof CallStateV2.Connected) {
            return "Connected(" + ((CallStateV2.Connected) callStateV2).AYXKKw().djBIcL() + ")";
        }
        if (!(callStateV2 instanceof CallStateV2.Disconnected)) {
            throw new NoWhenBranchMatchedException();
        }
        return "Disconnected(" + ((CallStateV2.Disconnected) callStateV2).valueOf() + ")";
    }

    public static final java.lang.String EZpvd(CallStateV2 callStateV2) {
        CallSessionV2 callSessionV2AEQbTJ = callStateV2.AEQbTJ();
        if (callSessionV2AEQbTJ == null) {
            return "none";
        }
        return "type=" + callSessionV2AEQbTJ.djBIcL() + ",group=" + callSessionV2AEQbTJ.valueOf();
    }
}
