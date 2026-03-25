package o;

import com.okinc.business.defi.biz.net.bean.TxAssetChangeBean;
import com.okinc.business.defi.biz.net.bean.TxContractInfo;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10168bjP;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bjV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C10174bjV extends AbstractC10170bjR {
    @Override // o.AbstractC10170bjR
    public boolean AxsJAY() {
        return false;
    }

    @Override // o.AbstractC10170bjR
    public C10169bjQ fetchVPNInfo() {
        return null;
    }

    @Override // o.AbstractC10170bjR
    public boolean getFieldNames() {
        return true;
    }

    @Override // o.AbstractC10170bjR
    public C10169bjQ values() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10174bjV(@NotNull android.content.Context context, @NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        super(context, txIdOrHashHistoryDetail);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String fARcdN() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.IResultReceiver2Default);
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String AkhnZx() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.IResultReceiver2Default);
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP.StateListAnimator> AYXKKw() {
        java.lang.String icon;
        java.lang.String strAYXKKw;
        TxAssetChangeBean approveInfo = fJNWhG().getApproveInfo();
        if (approveInfo == null || (icon = approveInfo.getIcon()) == null) {
            icon = "";
        }
        TxAssetChangeBean approveInfo2 = fJNWhG().getApproveInfo();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (approveInfo2 != null ? approveInfo2.getName() : null))) {
            TxAssetChangeBean approveInfo3 = fJNWhG().getApproveInfo();
            strAYXKKw = approveInfo3 != null ? approveInfo3.getName() : null;
            Intrinsics.copydefault((java.lang.Object) strAYXKKw);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLastCustomNonConfigurationInstance);
        }
        return C56402yEa.EZpvd(new AbstractC10168bjP.StateListAnimator(icon, strAYXKKw));
    }

    @Override // o.AbstractC10170bjR
    public int gEmmrt() {
        return AYXKKw().size();
    }

    @Override // o.AbstractC10170bjR
    public java.lang.CharSequence AuCTel() {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ResultReceiver);
        if (fJNWhG().getTxStatus() != 1) {
            return strAYXKKw;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(strAYXKKw);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.Dff)), 0, strAYXKKw.length(), 17);
        return spannableString;
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP.Application> DbNXlk() {
        java.lang.String strAYXKKw;
        java.lang.CharSequence charSequence;
        float f;
        java.lang.String icon;
        TxContractInfo contractInfo = fJNWhG().getContractInfo();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (contractInfo != null ? contractInfo.getName() : null))) {
            TxContractInfo contractInfo2 = fJNWhG().getContractInfo();
            strAYXKKw = contractInfo2 != null ? contractInfo2.getName() : null;
            Intrinsics.copydefault((java.lang.Object) strAYXKKw);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLifecycle);
        }
        if (fJNWhG().getTxStatus() == 1) {
            android.text.SpannableString spannableString = new android.text.SpannableString(strAYXKKw);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.Dff)), 0, strAYXKKw.length(), 17);
            f = 0.3f;
            charSequence = spannableString;
        } else {
            charSequence = strAYXKKw;
            f = 1.0f;
        }
        TxContractInfo contractInfo3 = fJNWhG().getContractInfo();
        java.lang.String address = contractInfo3 != null ? contractInfo3.getAddress() : null;
        TxContractInfo contractInfo4 = fJNWhG().getContractInfo();
        return C56402yEa.EZpvd(new AbstractC10168bjP.Application((contractInfo4 == null || (icon = contractInfo4.getIcon()) == null) ? "" : icon, f, charSequence, address == null ? "" : C14079deg.getAddressStr$default(C14079deg.EZpvd, address, false, 2, null), address == null ? "" : address, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo)));
    }

    @Override // o.AbstractC10170bjR
    public int isConnected() {
        return DbNXlk().size();
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP> KWHzl() {
        return yDY.AhwBna();
    }
}
