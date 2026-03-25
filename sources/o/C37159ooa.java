package o;

import com.okinc.okimcore.model.im.OKCallCommon;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.C35399nuc;
import o.InterfaceC35336ntR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ooa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37159ooa {
    public static final C37159ooa copydefault = new C37159ooa();

    /* JADX INFO: renamed from: o.ooa$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKCallCommon.OKCallDisconnectedReason.values().length];
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.CANCEL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REJECT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.HANGUP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.BUSY_LINE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_BUSY_LINE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.NO_RESPONSE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_NO_RESPONSE.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.ENGINE_UNSUPPORTED.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.NETWORK_ERROR.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_NETWORK_ERROR.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_CANCEL.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_REJECT.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_HANGUP.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REMOTE_ENGINE_UNSUPPORTED.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.SERVICE_DISCONNECTED.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.REJECTED_BY_BLACKLIST.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.INIT_VIDEO_ERROR.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.OTHER_DEVICE_HAD_ACCEPTED.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[OKCallCommon.OKCallDisconnectedReason.SERVICE_NOT_OPENED.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            OLrzqt = iArr;
        }
    }

    private C37159ooa() {
    }

    /* JADX INFO: renamed from: o.ooa$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class ActionBar {
        public final int KWHzl;
        public final boolean copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = actionBar.KWHzl;
            }
            if ((i2 & 2) != 0) {
                z = actionBar.copydefault;
            }
            return actionBar.AEQbTJ(i, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(int i, boolean z) {
            return new ActionBar(i, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.KWHzl == actionBar.KWHzl && this.copydefault == actionBar.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.KWHzl) * 31) + java.lang.Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ErrorInfo(toastResId=" + this.KWHzl + ", shouldNavigateToCall=" + this.copydefault + ")";
        }

        public ActionBar(int i, boolean z) {
            this.KWHzl = i;
            this.copydefault = z;
        }
    }

    public final ActionBar OLrzqt(@NotNull InterfaceC35336ntR interfaceC35336ntR) {
        Intrinsics.checkNotNullParameter(interfaceC35336ntR, "");
        if ((interfaceC35336ntR instanceof InterfaceC35336ntR.StateListAnimator) || (interfaceC35336ntR instanceof InterfaceC35336ntR.Application) || (interfaceC35336ntR instanceof InterfaceC35336ntR.Activity)) {
            return new ActionBar(C35399nuc.LoaderManager.zAEkPU, true);
        }
        if (interfaceC35336ntR instanceof InterfaceC35336ntR.ActionBar) {
            return new ActionBar(C35399nuc.LoaderManager.DPHsZd, false);
        }
        if (!(interfaceC35336ntR instanceof InterfaceC35336ntR.SharedElementCallback) && !(interfaceC35336ntR instanceof InterfaceC35336ntR.Dialog) && !(interfaceC35336ntR instanceof InterfaceC35336ntR.LoaderManager) && !(interfaceC35336ntR instanceof InterfaceC35336ntR.Fragment) && !(interfaceC35336ntR instanceof InterfaceC35336ntR.PendingIntent) && !(interfaceC35336ntR instanceof InterfaceC35336ntR.TaskDescription) && !(interfaceC35336ntR instanceof InterfaceC35336ntR.FragmentManager) && !(interfaceC35336ntR instanceof InterfaceC35336ntR.TaskStackBuilder)) {
            throw new NoWhenBranchMatchedException();
        }
        return new ActionBar(C35399nuc.LoaderManager.vLaW, false);
    }

    public final int OLrzqt(OKCallCommon.OKCallDisconnectedReason oKCallDisconnectedReason) {
        switch (oKCallDisconnectedReason == null ? -1 : TaskDescription.OLrzqt[oKCallDisconnectedReason.ordinal()]) {
            case 1:
            default:
                return C35399nuc.LoaderManager.iPSTqm;
            case 2:
                return C35399nuc.LoaderManager.fhwtiV;
            case 3:
                return C35399nuc.LoaderManager.hvKCwS;
            case 4:
            case 5:
                return C35399nuc.LoaderManager.zKcAg;
            case 6:
            case 7:
                return C35399nuc.LoaderManager.zDUObI;
            case 8:
                return C35399nuc.LoaderManager.gSBher;
            case 9:
            case 10:
                return C35399nuc.LoaderManager.vLaW;
            case 11:
                return C35399nuc.LoaderManager.zOIQXb;
            case 12:
                return C35399nuc.LoaderManager.zqTOFw;
            case 13:
                return C35399nuc.LoaderManager.sjbWxX;
            case 14:
                return C35399nuc.LoaderManager.hlkKmr;
            case 15:
                return C35399nuc.LoaderManager.tIwhY;
            case 16:
                return C35399nuc.LoaderManager.zYHWMc;
            case 17:
            case 18:
                return C35399nuc.LoaderManager.gUEfcq;
            case 19:
                return C35399nuc.LoaderManager.zAEkPU;
        }
    }
}
