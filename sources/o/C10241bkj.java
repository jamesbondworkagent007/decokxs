package o;

import com.okinc.business.defi.biz.net.bean.TxAssetChangeBean;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import o.AbstractC10168bjP;
import o.C13754dXa;
import o.C52761wXj;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.bkj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C10241bkj extends AbstractC10170bjR {
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
    public C10241bkj(@NotNull android.content.Context context, @NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        super(context, txIdOrHashHistoryDetail);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String fARcdN() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.setPipParamsSourceRectHint);
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String AkhnZx() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.IResultReceiver2Stub);
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP.Activity> AYXKKw() {
        Sequence sequenceQVAiDq;
        Sequence sequenceFetchVPNInfo;
        java.util.List<AbstractC10168bjP.Activity> listZuBGHE;
        java.util.List<TxAssetChangeBean> output = fJNWhG().getOutput();
        return (output == null || (sequenceQVAiDq = CollectionsKt___CollectionsKt.QVAiDq(output)) == null || (sequenceFetchVPNInfo = C59467zhb.fetchVPNInfo(sequenceQVAiDq, new Function1() { // from class: o.bkk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10241bkj.OLrzqt(this.copydefault, (TxAssetChangeBean) obj);
            }
        })) == null || (listZuBGHE = C59467zhb.zuBGHE(sequenceFetchVPNInfo)) == null) ? yDY.AhwBna() : listZuBGHE;
    }

    public static final AbstractC10168bjP.Activity OLrzqt(C10241bkj c10241bkj, TxAssetChangeBean txAssetChangeBean) {
        Intrinsics.checkNotNullParameter(txAssetChangeBean, "");
        return c10241bkj.OLrzqt(txAssetChangeBean);
    }

    @Override // o.AbstractC10170bjR
    public int gEmmrt() {
        return AYXKKw().size();
    }

    /* JADX DEBUG: Method merged with bridge method: AuCTel()Ljava/lang/CharSequence; */
    @Override // o.AbstractC10170bjR
    /* JADX INFO: renamed from: gHZMYf, reason: merged with bridge method [inline-methods] */
    public java.lang.String AuCTel() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.createFullyDrawnExecutor);
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP.Activity> DbNXlk() {
        Sequence sequenceQVAiDq;
        Sequence sequenceFetchVPNInfo;
        java.util.List<AbstractC10168bjP.Activity> listZuBGHE;
        java.util.List<TxAssetChangeBean> input = fJNWhG().getInput();
        return (input == null || (sequenceQVAiDq = CollectionsKt___CollectionsKt.QVAiDq(input)) == null || (sequenceFetchVPNInfo = C59467zhb.fetchVPNInfo(sequenceQVAiDq, new Function1() { // from class: o.bkh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C10241bkj.AEQbTJ(this.AEQbTJ, (TxAssetChangeBean) obj);
            }
        })) == null || (listZuBGHE = C59467zhb.zuBGHE(sequenceFetchVPNInfo)) == null) ? yDY.AhwBna() : listZuBGHE;
    }

    public static final AbstractC10168bjP.Activity AEQbTJ(C10241bkj c10241bkj, TxAssetChangeBean txAssetChangeBean) {
        Intrinsics.checkNotNullParameter(txAssetChangeBean, "");
        return c10241bkj.OLrzqt(txAssetChangeBean);
    }

    @Override // o.AbstractC10170bjR
    public int isConnected() {
        return DbNXlk().size();
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP> KWHzl() {
        return yDY.AhwBna();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC10168bjP.Activity OLrzqt(TxAssetChangeBean txAssetChangeBean) {
        int i;
        java.lang.String str;
        java.lang.String strOLrzqt;
        java.lang.String str2;
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        java.lang.String direction = txAssetChangeBean.getDirection();
        if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "1")) {
            iCopydefault = C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, AEQbTJ(), 0.0f, 2, null);
            str = Marker.ANY_NON_NULL_MARKER;
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "2")) {
                i = iCopydefault;
                str = "";
                if (txAssetChangeBean.getAmount() != null) {
                    str2 = "--";
                } else {
                    C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(txAssetChangeBean.getCoinId());
                    java.lang.String amount = txAssetChangeBean.getAmount();
                    if (amount != null) {
                        strOLrzqt = C54870xYj.OLrzqt(amount, (249 & 1) != 0 ? 0 : 0, c10854bwMKWHzl != null ? c10854bwMKWHzl.DTwDnp() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                        if (strOLrzqt == null) {
                        }
                        str2 = str + strOLrzqt;
                    } else {
                        strOLrzqt = "";
                        str2 = str + strOLrzqt;
                    }
                }
                java.lang.String str3 = str2;
                java.lang.String nftId = txAssetChangeBean.getNftId();
                java.lang.String str4 = nftId != null ? "" : nftId;
                java.lang.String icon = txAssetChangeBean.getIcon();
                java.lang.String str5 = icon != null ? "" : icon;
                java.lang.String name = txAssetChangeBean.getName();
                return new AbstractC10168bjP.Activity(str4, str5, str3, " ", name != null ? "" : name, i, fJNWhG().getCoinId(), null, false, MLKEMEngine.KyberPolyBytes, null);
            }
            str = "-";
        }
        i = iCopydefault;
        if (txAssetChangeBean.getAmount() != null) {
        }
        java.lang.String str32 = str2;
        java.lang.String nftId2 = txAssetChangeBean.getNftId();
        if (nftId2 != null) {
        }
        java.lang.String icon2 = txAssetChangeBean.getIcon();
        if (icon2 != null) {
        }
        java.lang.String name2 = txAssetChangeBean.getName();
        return new AbstractC10168bjP.Activity(str4, str5, str32, " ", name2 != null ? "" : name2, i, fJNWhG().getCoinId(), null, false, MLKEMEngine.KyberPolyBytes, null);
    }
}
