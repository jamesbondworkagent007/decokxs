package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.InterfaceC13987dcu;

/* JADX INFO: renamed from: o.dcj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13976dcj {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.dcj.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC13976dcj(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC13976dcj() {
    }

    /* JADX INFO: renamed from: o.dcj$TaskDescription */
    public static final class TaskDescription extends AbstractC13976dcj {
        public static final TaskDescription AEQbTJ = new TaskDescription();
        public static final java.lang.String copydefault = InterfaceC13987dcu.Fragment.Companion.OLrzqt();
        public static final java.util.List<java.lang.String> KWHzl = yDY.gEmmrt("chainChanged", "accountsChanged");
        public static final java.util.List<java.lang.String> OLrzqt = yDY.gEmmrt("eth_sendTransaction", "personal_sign", "eth_sign", "eth_signTypedData", "eth_signTypedData_v4", "wallet_addEthereumChain", "sync_all_addresses", "metax_sendTransaction");
        public static final int EZpvd = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String EZpvd() {
            return copydefault;
        }

        private TaskDescription() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.dcj$Activity */
    public static final class Activity extends AbstractC13976dcj {
        public static final Activity KWHzl = new Activity();
        public static final java.lang.String AEQbTJ = InterfaceC13987dcu.Fragment.Companion.gEmmrt();
        public static final java.util.List<java.lang.String> OLrzqt = yDY.AhwBna();
        public static final java.util.List<java.lang.String> gEmmrt = yDY.gEmmrt("solana_signTransaction", "solana_signMessage", "sync_all_addresses");
        public static final java.lang.String EZpvd = InterfaceC13987dcu.LoaderManager.Companion.EZpvd();
        public static final int copydefault = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String OLrzqt() {
            return AEQbTJ;
        }

        private Activity() {
            super(null);
        }
    }
}
