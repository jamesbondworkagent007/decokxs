package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;

/* JADX INFO: renamed from: o.gni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C20800gni extends C20775gnJ {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX INFO: renamed from: o.gni$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gni.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C20800gni EZpvd(android.os.Bundle bundle) {
            C20800gni c20800gni = new C20800gni();
            c20800gni.setArguments(bundle);
            return c20800gni;
        }
    }

    @Override // o.C20775gnJ, o.AbstractC20799gnh
    public boolean AYXKKw(boolean z) {
        AhwBna(false);
        AbstractC8664bGw<?, ?> abstractC8664bGwFJNWhG = AhwBna().fJNWhG();
        if (abstractC8664bGwFJNWhG != null && C33129mqd.valueOf(AhwBna().AuCTel(), 0)) {
            if (!z && !abstractC8664bGwFJNWhG.C_()) {
                C20775gnJ.setAmtErrInfo$default(this, false, false, null, false, false, null, 62, null);
                return true;
            }
            if (AhwBna().hDKMBd() && AhwBna().EZpvd() && !AhwBna().OLrzqt() && C33129mqd.AhwBna(AbstractC8704bHj.getTransferAmount$default(abstractC8664bGwFJNWhG, false, false, 3, null), 0)) {
                int i = C13754dXa.FragmentManager.gqOnQv;
                C17946fYd c17946fYd = C17946fYd.AEQbTJ;
                C20775gnJ.setAmtErrInfo$default(this, true, true, pTD.copydefault(this, i, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fiatamount", c17946fYd.AEQbTJ(abstractC8664bGwFJNWhG, abstractC8664bGwFJNWhG.fHqPtx().AhwBna(), "0")), C56390yDp.OLrzqt("cryptoamount", C17946fYd.formatAssetCoinAmount$default(c17946fYd, abstractC8664bGwFJNWhG.fHqPtx().AhwBna(), "0", false, true, 4, null)))), false, false, null, 56, null);
                KWHzl("too_small_balance_for_fee");
                AhwBna(true);
                return false;
            }
            java.lang.String string = getString(C13754dXa.FragmentManager.QsIRgs);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C20775gnJ.setAmtErrInfo$default(this, true, false, string, false, false, null, 56, null);
            KWHzl("amount_zero_error");
            return false;
        }
        return super.AYXKKw(z);
    }
}
