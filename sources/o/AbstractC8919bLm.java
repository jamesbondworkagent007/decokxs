package o;

import com.okinc.business.defi.api.model.tx.signdata.ContractSignData;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC8426bCW;
import o.InterfaceC9737bbI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bLm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8919bLm<Fee extends AbstractC8426bCW<?>, SignData extends ContractSignData> extends AbstractC8601bFm<Fee, SignData> implements InterfaceC9730bbB {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction
    public java.lang.String ag_() {
        return "";
    }

    @Override // o.AbstractC8601bFm, o.AbstractC8564bFB
    public java.util.HashSet<java.lang.Long> j_() {
        C10854bwM c10854bwM;
        java.util.HashSet<java.lang.Long> hashSetJ_ = super.j_();
        if (aUsmxb() == OKWBaseTransaction.TransactionType.Approve && (c10854bwM = (C10854bwM) InterfaceC9737bbI.Application.getTokenWithContractAddressAndChainId$default(C11627cVg.KWHzl, zLjUOn(), dHguZz().fetchVPNInfo(), false, 4, null)) != null) {
            hashSetJ_.add(java.lang.Long.valueOf(c10854bwM.AhwBna()));
        }
        return hashSetJ_;
    }

    /* JADX INFO: renamed from: o.bLm$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bLm.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final boolean EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) EIP1271Verifier.hexPrefix);
        }

        public final boolean copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C59449zhJ.startsWith$default(str, "095ea7b3", false, 2, null) || C59449zhJ.startsWith$default(str, "0x095ea7b3", false, 2, null);
        }

        public final boolean AEQbTJ(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return C59449zhJ.startsWith$default(str, "a22cb465", false, 2, null) || C59449zhJ.startsWith$default(str, "0xa22cb465", false, 2, null);
        }

        public final boolean KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return (str.length() == 0 || C59454zhO.zsXlph(str) == '0') ? false : true;
        }
    }
}
