package o;

import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.biz_userprofile.data.PlanetUid;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tKU {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final StateFlow<PlanetBasicUserInfoResp> AEQbTJ;
    public final InterfaceC46387tSl EZpvd;
    public final MutableStateFlow<PlanetBasicUserInfoResp> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<PlanetBasicUserInfoResp> EZpvd() {
        return this.AEQbTJ;
    }

    public tKU(@NotNull InterfaceC46387tSl interfaceC46387tSl) {
        Intrinsics.checkNotNullParameter(interfaceC46387tSl, "");
        this.EZpvd = interfaceC46387tSl;
        MutableStateFlow<PlanetBasicUserInfoResp> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow;
        this.AEQbTJ = FlowKt.asStateFlow(MutableStateFlow);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tKU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final tKU KWHzl() {
            tKU tkuFXHmeK;
            synchronized (this) {
                tkuFXHmeK = tPF.copydefault.fXHmeK();
            }
            return tkuFXHmeK;
        }
    }

    public final PlanetBasicUserInfoResp AEQbTJ() {
        return this.KWHzl.getValue();
    }

    public final java.lang.String gEmmrt() {
        PlanetBasicUserInfoResp value = this.KWHzl.getValue();
        if (value != null) {
            return value.QKVWgx();
        }
        return null;
    }

    public final java.lang.String AhwBna() {
        PlanetBasicUserInfoResp value = this.KWHzl.getValue();
        if (value != null) {
            return value.wlaJM();
        }
        return null;
    }

    public final java.lang.String AYXKKw() {
        java.lang.String strQKVWgx;
        PlanetBasicUserInfoResp value = this.KWHzl.getValue();
        if (value == null || (strQKVWgx = value.QKVWgx()) == null) {
            strQKVWgx = "";
        }
        return PlanetUid.copydefault(strQKVWgx);
    }

    public final java.lang.String djBIcL() {
        java.lang.String strQOLQEE;
        PlanetBasicUserInfoResp value = this.KWHzl.getValue();
        if (value == null || (strQOLQEE = value.QOLQEE()) == null) {
            strQOLQEE = "";
        }
        return PlanetUniqueName.AEQbTJ(strQOLQEE);
    }

    public final java.lang.String OLrzqt() {
        java.lang.String strEZpvd;
        PlanetBasicUserInfoResp value = this.KWHzl.getValue();
        if (value == null || (strEZpvd = value.EZpvd()) == null) {
            strEZpvd = "";
        }
        return PlanetAuthorId.KWHzl(strEZpvd);
    }

    public final boolean valueOf() {
        return this.EZpvd.gEmmrt() && gEmmrt() != null && Intrinsics.EZpvd((java.lang.Object) gEmmrt(), (java.lang.Object) this.EZpvd.copydefault());
    }

    public final java.lang.String KWHzl() {
        return this.EZpvd.copydefault();
    }

    public final java.lang.String copydefault() {
        return AhwBna();
    }

    public final void AEQbTJ(PlanetBasicUserInfoResp planetBasicUserInfoResp) {
        this.KWHzl.setValue(planetBasicUserInfoResp);
    }
}
