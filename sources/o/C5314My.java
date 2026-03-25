package o;

import com.engagelab.privates.core.constants.MTCoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.My, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5314My implements MJ {
    public static final ActionBar Companion = new ActionBar(null);
    public final ME EZpvd;
    public final MO KWHzl;

    public C5314My(@NotNull ME me2) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(me2, "");
        this.EZpvd = me2;
        java.io.File fileDjBIcL = me2.djBIcL();
        MQ.copydefault(fileDjBIcL);
        MO mo = new MO(fileDjBIcL, me2.EZpvd(), me2.AhwBna());
        this.KWHzl = mo;
        mo.copydefault();
        OLrzqt();
    }

    /* JADX INFO: renamed from: o.My$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.My.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // o.MJ
    public void EZpvd(java.lang.String str) {
        MO mo = this.KWHzl;
        if (str == null) {
            str = "";
        }
        mo.EZpvd(MTCoreConstants.Register.KEY_USER_ID, str);
    }

    @Override // o.MJ
    public void copydefault(java.lang.String str) {
        MO mo = this.KWHzl;
        if (str == null) {
            str = "";
        }
        mo.EZpvd("device_id", str);
    }

    @Override // o.MJ
    public MF copydefault() {
        return new MF(this.KWHzl.copydefault(MTCoreConstants.Register.KEY_USER_ID, null), this.KWHzl.copydefault("device_id", null));
    }

    public final void OLrzqt() {
        if (!KWHzl("api_key", this.EZpvd.OLrzqt()) || !KWHzl("experiment_api_key", this.EZpvd.KWHzl())) {
            this.KWHzl.EZpvd(yDY.gEmmrt(MTCoreConstants.Register.KEY_USER_ID, "device_id", "api_key", "experiment_api_key"));
        }
        java.lang.String strOLrzqt = this.EZpvd.OLrzqt();
        if (strOLrzqt != null) {
            this.KWHzl.EZpvd("api_key", strOLrzqt);
        }
        java.lang.String strKWHzl = this.EZpvd.KWHzl();
        if (strKWHzl != null) {
            this.KWHzl.EZpvd("experiment_api_key", strKWHzl);
        }
    }

    public final boolean KWHzl(java.lang.String str, java.lang.String str2) {
        java.lang.String strCopydefault;
        if (str2 == null || (strCopydefault = this.KWHzl.copydefault(str, null)) == null) {
            return true;
        }
        return Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) str2);
    }
}
