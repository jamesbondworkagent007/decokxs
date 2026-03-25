package o;

import com.okinc.business.defi.biz.net.bean.TxAssetChangeBean;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10168bjP;
import o.C13754dXa;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.bko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C10246bko extends AbstractC10170bjR {
    @Override // o.AbstractC10170bjR
    public boolean AxsJAY() {
        return true;
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
    public C10246bko(@NotNull android.content.Context context, @NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        super(context, txIdOrHashHistoryDetail);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String fARcdN() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambdanew2);
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String AkhnZx() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.IResultReceiver2Stub);
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP> AYXKKw() {
        java.lang.String str;
        java.lang.Object activity;
        java.util.List<TxAssetChangeBean> output = fJNWhG().getOutput();
        if (output == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(output, 10));
        for (TxAssetChangeBean txAssetChangeBean : output) {
            int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            java.lang.String direction = txAssetChangeBean.getDirection();
            java.lang.String strOLrzqt = null;
            if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "1")) {
                iCopydefault = C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, AEQbTJ(), 0.0f, 2, null);
                str = Marker.ANY_NON_NULL_MARKER;
            } else {
                str = Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "2") ? "-" : "";
            }
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(txAssetChangeBean.getCoinId());
            java.lang.String amount = txAssetChangeBean.getAmount();
            if (amount != null) {
                strOLrzqt = C54870xYj.OLrzqt(amount, (249 & 1) != 0 ? 0 : 0, c10854bwMKWHzl != null ? c10854bwMKWHzl.DTwDnp() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) txAssetChangeBean.getNftId()) || C33129mqd.OLrzqt((java.lang.CharSequence) txAssetChangeBean.getNftImageUrl())) {
                java.lang.String nftId = txAssetChangeBean.getNftId();
                java.lang.String str2 = nftId == null ? "" : nftId;
                java.lang.String nftImageUrl = txAssetChangeBean.getNftImageUrl();
                java.lang.String str3 = nftImageUrl == null ? "" : nftImageUrl;
                java.lang.String str4 = str + strOLrzqt;
                java.lang.String name = txAssetChangeBean.getName();
                activity = new AbstractC10168bjP.Activity(str2, str3, str4, " ", name == null ? "" : name, iCopydefault, fJNWhG().getCoinId(), null, false, MLKEMEngine.KyberPolyBytes, null);
            } else {
                java.lang.String icon = txAssetChangeBean.getIcon();
                java.lang.String str5 = icon == null ? "" : icon;
                java.lang.String str6 = str + strOLrzqt;
                java.lang.String name2 = txAssetChangeBean.getName();
                java.lang.String str7 = name2 == null ? "" : name2;
                boolean zUzCIH = uzCIH();
                java.lang.String protocolName = txAssetChangeBean.getProtocolName();
                activity = new AbstractC10168bjP.TaskDescription(str5, str6, " ", str7, iCopydefault, false, false, 0, zUzCIH, false, protocolName == null ? "" : protocolName, 0, 0L, false, 15072, null);
            }
            arrayList.add(activity);
        }
        return arrayList;
    }

    @Override // o.AbstractC10170bjR
    public int gEmmrt() {
        return AYXKKw().size();
    }

    /* JADX DEBUG: Method merged with bridge method: AuCTel()Ljava/lang/CharSequence; */
    @Override // o.AbstractC10170bjR
    /* JADX INFO: renamed from: zuBGHE, reason: merged with bridge method [inline-methods] */
    public java.lang.String AuCTel() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.createFullyDrawnExecutor);
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP> DbNXlk() {
        java.lang.String str;
        java.lang.Object taskDescription;
        java.util.List<TxAssetChangeBean> input = fJNWhG().getInput();
        if (input == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(input, 10));
        for (TxAssetChangeBean txAssetChangeBean : input) {
            int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            java.lang.String direction = txAssetChangeBean.getDirection();
            java.lang.String strOLrzqt = null;
            if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "1")) {
                iCopydefault = C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, AEQbTJ(), 0.0f, 2, null);
                str = Marker.ANY_NON_NULL_MARKER;
            } else {
                str = Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "2") ? "-" : "";
            }
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(txAssetChangeBean.getCoinId());
            java.lang.String amount = txAssetChangeBean.getAmount();
            if (amount != null) {
                strOLrzqt = C54870xYj.OLrzqt(amount, (249 & 1) != 0 ? 0 : 0, c10854bwMKWHzl != null ? c10854bwMKWHzl.DTwDnp() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) txAssetChangeBean.getNftId())) {
                java.lang.String nftId = txAssetChangeBean.getNftId();
                java.lang.String str2 = nftId == null ? "" : nftId;
                java.lang.String nftImageUrl = txAssetChangeBean.getNftImageUrl();
                java.lang.String str3 = nftImageUrl == null ? "" : nftImageUrl;
                java.lang.String str4 = str + strOLrzqt;
                java.lang.String name = txAssetChangeBean.getName();
                taskDescription = new AbstractC10168bjP.Activity(str2, str3, str4, " ", name == null ? "" : name, iCopydefault, fJNWhG().getCoinId(), null, false, MLKEMEngine.KyberPolyBytes, null);
            } else {
                java.lang.String icon = txAssetChangeBean.getIcon();
                java.lang.String str5 = icon == null ? "" : icon;
                java.lang.String str6 = str + strOLrzqt;
                java.lang.String name2 = txAssetChangeBean.getName();
                java.lang.String str7 = name2 == null ? "" : name2;
                java.lang.String protocolName = txAssetChangeBean.getProtocolName();
                taskDescription = new AbstractC10168bjP.TaskDescription(str5, str6, " ", str7, iCopydefault, false, false, 0, false, false, protocolName == null ? "" : protocolName, 0, 0L, false, 15328, null);
            }
            arrayList.add(taskDescription);
        }
        return arrayList;
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
