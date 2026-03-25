package o;

import com.okinc.business.defi.assets.detail.biz.ItemType;
import com.okinc.business.defi.biz.net.bean.TxAssetChangeBean;
import com.okinc.business.defi.biz.net.bean.TxContractInfo;
import com.okinc.business.defi.biz.net.bean.TxDetailApproveInfo;
import com.okinc.business.defi.biz.net.bean.TxDetailContractInfo;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10168bjP;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bkq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C10248bkq extends AbstractC10170bjR {
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
    public C10248bkq(@NotNull android.content.Context context, @NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        super(context, txIdOrHashHistoryDetail);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String fARcdN() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.isDevMode);
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String AkhnZx() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.IIEbr);
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP.ActionBar> AYXKKw() {
        java.lang.String nftCollectionIcon;
        java.lang.String str = "";
        if (C33129mqd.KWHzl((java.util.Collection) fJNWhG().getApproveInfoList())) {
            java.util.List<TxDetailApproveInfo> approveInfoList = fJNWhG().getApproveInfoList();
            Intrinsics.copydefault(approveInfoList);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(approveInfoList, 10));
            for (TxDetailApproveInfo txDetailApproveInfo : approveInfoList) {
                java.lang.String nftCollectionIcon2 = txDetailApproveInfo.getNftCollectionIcon();
                if (nftCollectionIcon2 == null) {
                    nftCollectionIcon2 = "";
                }
                java.lang.String nftCollectionName = txDetailApproveInfo.getNftCollectionName();
                if (C33129mqd.OLrzqt((java.lang.CharSequence) nftCollectionName)) {
                    Intrinsics.copydefault((java.lang.Object) nftCollectionName);
                } else {
                    nftCollectionName = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertController2);
                }
                arrayList.add(new AbstractC10168bjP.ActionBar(nftCollectionIcon2, nftCollectionName));
            }
            return arrayList;
        }
        TxAssetChangeBean approveInfo = fJNWhG().getApproveInfo();
        if (approveInfo != null && (nftCollectionIcon = approveInfo.getNftCollectionIcon()) != null) {
            str = nftCollectionIcon;
        }
        TxAssetChangeBean approveInfo2 = fJNWhG().getApproveInfo();
        java.lang.String nftCollectionName2 = approveInfo2 != null ? approveInfo2.getNftCollectionName() : null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) nftCollectionName2)) {
            Intrinsics.copydefault((java.lang.Object) nftCollectionName2);
        } else {
            nftCollectionName2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.AlertController2);
        }
        return C56402yEa.EZpvd(new AbstractC10168bjP.ActionBar(str, nftCollectionName2));
    }

    @Override // o.AbstractC10170bjR
    public int gEmmrt() {
        return AYXKKw().size();
    }

    @Override // o.AbstractC10170bjR
    public java.lang.CharSequence AuCTel() {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.wtf);
        if (fJNWhG().getTxStatus() != 1) {
            return strAYXKKw;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(strAYXKKw);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.Dff)), 0, strAYXKKw.length(), 17);
        return spannableString;
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP.Application> DbNXlk() {
        java.lang.CharSequence charSequenceAYXKKw;
        java.lang.String icon;
        java.lang.CharSequence charSequenceAYXKKw2;
        float f;
        float f2 = 0.3f;
        java.lang.String str = "";
        if (C33129mqd.KWHzl((java.util.Collection) fJNWhG().getContractInfoList())) {
            java.util.List<TxDetailContractInfo> contractInfoList = fJNWhG().getContractInfoList();
            Intrinsics.copydefault(contractInfoList);
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(contractInfoList, 10));
            for (TxDetailContractInfo txDetailContractInfo : contractInfoList) {
                java.lang.String icon2 = txDetailContractInfo.getIcon();
                if (icon2 == null) {
                    icon2 = "";
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) txDetailContractInfo.getName())) {
                    charSequenceAYXKKw2 = txDetailContractInfo.getName();
                    Intrinsics.copydefault(charSequenceAYXKKw2);
                } else {
                    charSequenceAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLifecycle);
                }
                if (fJNWhG().getTxStatus() == 1) {
                    android.text.SpannableString spannableString = new android.text.SpannableString(charSequenceAYXKKw2);
                    spannableString.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.Dff)), 0, charSequenceAYXKKw2.length(), 17);
                    charSequenceAYXKKw2 = spannableString;
                    f = 0.3f;
                } else {
                    f = 1.0f;
                }
                arrayList.add(OLrzqt(icon2, f, charSequenceAYXKKw2, txDetailContractInfo.getAddress()));
            }
            return arrayList;
        }
        TxContractInfo contractInfo = fJNWhG().getContractInfo();
        if (contractInfo != null && (icon = contractInfo.getIcon()) != null) {
            str = icon;
        }
        TxContractInfo contractInfo2 = fJNWhG().getContractInfo();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (contractInfo2 != null ? contractInfo2.getName() : null))) {
            TxContractInfo contractInfo3 = fJNWhG().getContractInfo();
            charSequenceAYXKKw = contractInfo3 != null ? contractInfo3.getName() : null;
            Intrinsics.copydefault(charSequenceAYXKKw);
        } else {
            charSequenceAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLifecycle);
        }
        if (fJNWhG().getTxStatus() == 1) {
            android.text.SpannableString spannableString2 = new android.text.SpannableString(charSequenceAYXKKw);
            spannableString2.setSpan(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.Dff)), 0, charSequenceAYXKKw.length(), 17);
            charSequenceAYXKKw = spannableString2;
        } else {
            f2 = 1.0f;
        }
        TxContractInfo contractInfo4 = fJNWhG().getContractInfo();
        return C56402yEa.EZpvd(OLrzqt(str, f2, charSequenceAYXKKw, contractInfo4 != null ? contractInfo4.getAddress() : null));
    }

    public final AbstractC10168bjP.Application OLrzqt(java.lang.String str, float f, java.lang.CharSequence charSequence, java.lang.String str2) {
        java.lang.String addressStr$default;
        if (str2 == null) {
            addressStr$default = "";
        } else {
            addressStr$default = C14079deg.getAddressStr$default(C14079deg.EZpvd, str2, false, 2, null);
        }
        return new AbstractC10168bjP.Application(str, f, charSequence, addressStr$default, str2 == null ? "" : str2, C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo));
    }

    @Override // o.AbstractC10170bjR
    public int isConnected() {
        return DbNXlk().size();
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP> KWHzl() {
        return yDY.AhwBna();
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<ItemType> AubY() {
        java.util.List<ItemType> listAubY = super.AubY();
        int iIndexOf = listAubY.indexOf(ItemType.ITEM_TYPE_TRANSACTION_HASH);
        int iIndexOf2 = listAubY.indexOf(ItemType.ITEM_TYPE_BLOCK_CONFIRMATION);
        if (iIndexOf2 == -1) {
            listAubY.add(iIndexOf + 1, ItemType.ITEM_TYPE_APPROVED_ASSETS);
        } else {
            listAubY.add(iIndexOf2 + 1, ItemType.ITEM_TYPE_APPROVED_ASSETS);
        }
        return listAubY;
    }
}
