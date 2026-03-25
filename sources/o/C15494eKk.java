package o;

import com.okinc.business.defi.biz.net.bean.TxRecord;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eKk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15494eKk extends C15489eKf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15494eKk(@NotNull TxRecord txRecord) {
        super(txRecord);
        Intrinsics.checkNotNullParameter(txRecord, "");
    }

    public final C10854bwM iwGUEr() {
        return C10954byG.EZpvd.valueOf().KWHzl(AuCTel().getCoinId());
    }

    @Override // o.C15489eKf
    public java.lang.String fetchVPNInfo() {
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        int txType = AuCTel().getTxType();
        if (txType == 3) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivity);
        }
        if (txType == 4) {
            int i = C13754dXa.FragmentManager.r8lambdah2i_RK2mddCIbAsGubaI4eL8_cU;
            java.lang.String approveSymbol = AuCTel().getApproveSymbol();
            if (approveSymbol == null || !C33129mqd.OLrzqt((java.lang.CharSequence) approveSymbol) || (strAYXKKw = AuCTel().getApproveSymbol()) == null) {
                strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLastCustomNonConfigurationInstance);
            }
            return C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strAYXKKw)));
        }
        if (txType == 6) {
            int i2 = C13754dXa.FragmentManager.r8lambdahrfbBpVkizzQbtGmrw6DTx0hH1A;
            java.lang.String approveSymbol2 = AuCTel().getApproveSymbol();
            if (approveSymbol2 == null || !C33129mqd.OLrzqt((java.lang.CharSequence) approveSymbol2) || (strAYXKKw2 = AuCTel().getApproveSymbol()) == null) {
                strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLastCustomNonConfigurationInstance);
            }
            return C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("symbol", strAYXKKw2)));
        }
        if (txType == 7) {
            C10854bwM c10854bwMIwGUEr = iwGUEr();
            if (c10854bwMIwGUEr != null && c10854bwMIwGUEr.DCUTEIdCUTEI()) {
                int i3 = C13754dXa.FragmentManager.getActivityResultRegistry;
                C10854bwM c10854bwMIwGUEr2 = iwGUEr();
                java.lang.String strDjBIcL = c10854bwMIwGUEr2 != null ? c10854bwMIwGUEr2.djBIcL() : null;
                return C33069mpW.copydefault(i3, C56423yEv.EZpvd(C56390yDp.OLrzqt("net", strDjBIcL != null ? strDjBIcL : "")));
            }
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.setDrawerArrowDrawable);
        }
        if (txType == 11) {
            C10854bwM c10854bwMIwGUEr3 = iwGUEr();
            if (c10854bwMIwGUEr3 != null && c10854bwMIwGUEr3.hCLrkq()) {
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKtviewModelsfactoryPromise1);
            }
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.getDefaultViewModelProviderFactory);
        }
        if (txType == 27) {
            if (Intrinsics.EZpvd(AuCTel().getApprovalForAllListFlag(), java.lang.Boolean.TRUE)) {
                return C33070mpX.AYXKKw(C13754dXa.FragmentManager.QjzqRB);
            }
            int i4 = C13754dXa.FragmentManager.createListView;
            java.lang.String nftCollectionName = AuCTel().getNftCollectionName();
            return C33069mpW.copydefault(i4, C56423yEv.EZpvd(C56390yDp.OLrzqt("collection", nftCollectionName != null ? nftCollectionName : "")));
        }
        if (txType == 73) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.heceqZ);
        }
        switch (txType) {
            case 80:
                java.lang.String kysTxTypeText = AuCTel().getKysTxTypeText();
                java.lang.String strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivity);
                if (kysTxTypeText == null || kysTxTypeText.length() == 0) {
                }
                break;
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.ComponentActivity);
    }

    @Override // o.C15489eKf
    public java.lang.String values() {
        C10854bwM c10854bwMKWHzl;
        if (AuCTel().getTxType() == 82) {
            return "";
        }
        if (AuCTel().getTxType() == 11) {
            return C14079deg.getAddressStr$default(C14079deg.EZpvd, AuCTel().getFrom(), false, 2, null);
        }
        if (AuCTel().getTxType() == 27 && Intrinsics.EZpvd(AuCTel().getApprovalForAllListFlag(), java.lang.Boolean.TRUE)) {
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.RIKbBf);
        }
        if (AuCTel().getTxType() == 7 && (c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(AuCTel().getCoinId())) != null && c10854bwMKWHzl.DCUTEIdCUTEI()) {
            return C14079deg.getAddressStr$default(C14079deg.EZpvd, AuCTel().getFrom(), false, 2, null);
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) AuCTel().getContractName())) {
            java.lang.String contractName = AuCTel().getContractName();
            return contractName == null ? "" : contractName;
        }
        return C14079deg.EZpvd.AEQbTJ(AuCTel().getContractAddress(), true);
    }
}
