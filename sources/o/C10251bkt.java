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

/* JADX INFO: renamed from: o.bkt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C10251bkt extends AbstractC10170bjR {
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
    public C10251bkt(@NotNull android.content.Context context, @NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        super(context, txIdOrHashHistoryDetail);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String fARcdN() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambdanew1);
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String AkhnZx() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.IResultReceiver2Stub);
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP> AYXKKw() {
        java.util.List<TxAssetChangeBean> output = fJNWhG().getOutput();
        if (output == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(output, 10));
        java.util.Iterator<T> it = output.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd((TxAssetChangeBean) it.next()));
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
        java.util.List<TxAssetChangeBean> input = fJNWhG().getInput();
        if (input == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(input, 10));
        java.util.Iterator<T> it = input.iterator();
        while (it.hasNext()) {
            arrayList.add(EZpvd((TxAssetChangeBean) it.next()));
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

    private final AbstractC10168bjP EZpvd(TxAssetChangeBean txAssetChangeBean) {
        int iTradeRiseDefault$default;
        int iTradeRiseDefault$default2;
        java.lang.String strOLrzqt;
        boolean zOLrzqt = C33129mqd.OLrzqt((java.lang.CharSequence) txAssetChangeBean.getNftId());
        java.lang.String str = Marker.ANY_NON_NULL_MARKER;
        java.lang.String strOLrzqt2 = null;
        if (zOLrzqt) {
            int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
            java.lang.String direction = txAssetChangeBean.getDirection();
            if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "1")) {
                iTradeRiseDefault$default2 = C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, AEQbTJ(), 0.0f, 2, null);
            } else {
                iTradeRiseDefault$default2 = iCopydefault;
                str = Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "2") ? "-" : "";
            }
            java.lang.String nftId = txAssetChangeBean.getNftId();
            Intrinsics.copydefault((java.lang.Object) nftId);
            java.lang.String icon = txAssetChangeBean.getIcon();
            java.lang.String str2 = icon == null ? "" : icon;
            java.lang.String amount = txAssetChangeBean.getAmount();
            if (amount == null || (strOLrzqt = C54862xYb.OLrzqt(amount)) == null) {
                strOLrzqt = "";
            }
            java.lang.String str3 = str + strOLrzqt;
            java.lang.String name = txAssetChangeBean.getName();
            return new AbstractC10168bjP.Activity(nftId, str2, str3, " ", name == null ? "" : name, iTradeRiseDefault$default2, fJNWhG().getCoinId(), null, false, MLKEMEngine.KyberPolyBytes, null);
        }
        int iCopydefault2 = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        java.lang.String direction2 = txAssetChangeBean.getDirection();
        if (Intrinsics.EZpvd((java.lang.Object) direction2, (java.lang.Object) "1")) {
            iTradeRiseDefault$default = C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, AEQbTJ(), 0.0f, 2, null);
        } else {
            iTradeRiseDefault$default = iCopydefault2;
            str = Intrinsics.EZpvd((java.lang.Object) direction2, (java.lang.Object) "2") ? "-" : "";
        }
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(txAssetChangeBean.getCoinId());
        java.lang.String amount2 = txAssetChangeBean.getAmount();
        if (amount2 != null) {
            strOLrzqt2 = C54870xYj.OLrzqt(amount2, (249 & 1) != 0 ? 0 : 0, c10854bwMKWHzl != null ? c10854bwMKWHzl.DTwDnp() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
        }
        boolean z = strOLrzqt2 == null || strOLrzqt2.length() == 0;
        java.lang.String icon2 = txAssetChangeBean.getIcon();
        java.lang.String str4 = icon2 == null ? "" : icon2;
        java.lang.String str5 = str + strOLrzqt2;
        java.lang.String name2 = txAssetChangeBean.getName();
        return new AbstractC10168bjP.TaskDescription(str4, str5, " ", name2 == null ? "" : name2, iTradeRiseDefault$default, z, false, 0, false, false, null, 0, 0L, false, 16320, null);
    }
}
