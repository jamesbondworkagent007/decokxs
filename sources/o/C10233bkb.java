package o;

import com.okinc.business.defi.biz.net.bean.TxAssetChangeBean;
import com.okinc.business.defi.biz.net.bean.TxContractInfo;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.AbstractC10168bjP;
import o.C13754dXa;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bkb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C10233bkb extends AbstractC10170bjR {
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
        return false;
    }

    @Override // o.AbstractC10170bjR
    public C10169bjQ values() {
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10233bkb(@NotNull android.content.Context context, @NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        super(context, txIdOrHashHistoryDetail);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String fARcdN() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.setView);
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String AkhnZx() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.onKeyUp);
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP.Activity> AYXKKw() {
        Sequence sequenceQVAiDq;
        Sequence sequenceDbNXlk;
        Sequence sequenceFetchVPNInfo;
        java.util.List<AbstractC10168bjP.Activity> listZuBGHE;
        java.util.List<TxAssetChangeBean> output = fJNWhG().getOutput();
        return (output == null || (sequenceQVAiDq = CollectionsKt___CollectionsKt.QVAiDq(output)) == null || (sequenceDbNXlk = C59467zhb.DbNXlk(sequenceQVAiDq, new Function1() { // from class: o.bjZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C10233bkb.OLrzqt((TxAssetChangeBean) obj));
            }
        })) == null || (sequenceFetchVPNInfo = C59467zhb.fetchVPNInfo(sequenceDbNXlk, new Function1() { // from class: o.bka
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10233bkb.copydefault(this.KWHzl, (TxAssetChangeBean) obj);
            }
        })) == null || (listZuBGHE = C59467zhb.zuBGHE(sequenceFetchVPNInfo)) == null) ? yDY.AhwBna() : listZuBGHE;
    }

    public static final boolean OLrzqt(TxAssetChangeBean txAssetChangeBean) {
        Intrinsics.checkNotNullParameter(txAssetChangeBean, "");
        return C33129mqd.OLrzqt((java.lang.CharSequence) txAssetChangeBean.getNftId());
    }

    public static final AbstractC10168bjP.Activity copydefault(C10233bkb c10233bkb, TxAssetChangeBean txAssetChangeBean) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(txAssetChangeBean, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) txAssetChangeBean.getName())) {
            strAYXKKw = txAssetChangeBean.getName();
            Intrinsics.copydefault((java.lang.Object) strAYXKKw);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertController1);
        }
        java.lang.String str = strAYXKKw;
        java.lang.String nftId = txAssetChangeBean.getNftId();
        Intrinsics.copydefault((java.lang.Object) nftId);
        java.lang.String icon = txAssetChangeBean.getIcon();
        return new AbstractC10168bjP.Activity(nftId, icon == null ? "" : icon, "", "", str, C33070mpX.copydefault(C52761wXj.Activity.fdOvFl), c10233bkb.fJNWhG().getCoinId(), null, false, MLKEMEngine.KyberPolyBytes, null);
    }

    @Override // o.AbstractC10170bjR
    public int gEmmrt() {
        return AYXKKw().size();
    }

    @Override // o.AbstractC10170bjR
    public java.lang.CharSequence AuCTel() {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.setButtonPanelLayoutHint);
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
        float f;
        java.lang.CharSequence charSequence;
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
            charSequence = spannableString;
            f = 0.3f;
        } else {
            f = 1.0f;
            charSequence = strAYXKKw;
        }
        TxContractInfo contractInfo3 = fJNWhG().getContractInfo();
        if (contractInfo3 == null || (icon = contractInfo3.getIcon()) == null) {
            icon = "";
        }
        return C56402yEa.EZpvd(new AbstractC10168bjP.Application(icon, f, charSequence, "", "", ""));
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
