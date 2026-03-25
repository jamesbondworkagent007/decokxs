package o;

import com.okinc.business.defi.biz.net.bean.TxAssetChangeBean;
import com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC10168bjP;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.bkl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C10243bkl extends AbstractC10170bjR {
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
    public C10243bkl(@NotNull android.content.Context context, @NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        super(context, txIdOrHashHistoryDetail);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String fARcdN() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityViewModelLazyKtviewModels2);
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String AkhnZx() {
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.IResultReceiver2Stub);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    @Override // o.AbstractC10170bjR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<AbstractC10168bjP.TaskDescription> AYXKKw() {
        int i;
        java.lang.String str;
        java.lang.String amount;
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
            } else if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "2")) {
                str = "-";
            } else {
                i = iCopydefault;
                str = "";
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(txAssetChangeBean.getCoinId());
                amount = txAssetChangeBean.getAmount();
                if (amount != null) {
                    strOLrzqt = C54870xYj.OLrzqt(amount, (249 & 1) != 0 ? 0 : 0, c10854bwMKWHzl != null ? c10854bwMKWHzl.DTwDnp() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                }
                java.lang.String icon = txAssetChangeBean.getIcon();
                java.lang.String str2 = icon != null ? "" : icon;
                java.lang.String str3 = str + strOLrzqt;
                java.lang.String name = txAssetChangeBean.getName();
                arrayList.add(new AbstractC10168bjP.TaskDescription(str2, str3, " ", name != null ? "" : name, i, false, false, 0, false, false, null, 0, 0L, false, 16352, null));
            }
            i = iCopydefault;
            C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(txAssetChangeBean.getCoinId());
            amount = txAssetChangeBean.getAmount();
            if (amount != null) {
            }
            java.lang.String icon2 = txAssetChangeBean.getIcon();
            if (icon2 != null) {
            }
            java.lang.String str32 = str + strOLrzqt;
            java.lang.String name2 = txAssetChangeBean.getName();
            arrayList.add(new AbstractC10168bjP.TaskDescription(str2, str32, " ", name2 != null ? "" : name2, i, false, false, 0, false, false, null, 0, 0L, false, 16352, null));
        }
        return arrayList;
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    @Override // o.AbstractC10170bjR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<AbstractC10168bjP.TaskDescription> DbNXlk() {
        int i;
        java.lang.String str;
        java.lang.String amount;
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
            } else if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "2")) {
                str = "-";
            } else {
                i = iCopydefault;
                str = "";
                C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(txAssetChangeBean.getCoinId());
                amount = txAssetChangeBean.getAmount();
                if (amount != null) {
                    strOLrzqt = C54870xYj.OLrzqt(amount, (249 & 1) != 0 ? 0 : 0, c10854bwMKWHzl != null ? c10854bwMKWHzl.DTwDnp() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                }
                java.lang.String icon = txAssetChangeBean.getIcon();
                java.lang.String str2 = icon != null ? "" : icon;
                java.lang.String str3 = str + strOLrzqt;
                java.lang.String name = txAssetChangeBean.getName();
                arrayList.add(new AbstractC10168bjP.TaskDescription(str2, str3, " ", name != null ? "" : name, i, false, false, 0, false, false, null, 0, 0L, false, 16352, null));
            }
            i = iCopydefault;
            C10854bwM c10854bwMKWHzl2 = C10954byG.EZpvd.valueOf().KWHzl(txAssetChangeBean.getCoinId());
            amount = txAssetChangeBean.getAmount();
            if (amount != null) {
            }
            java.lang.String icon2 = txAssetChangeBean.getIcon();
            if (icon2 != null) {
            }
            java.lang.String str32 = str + strOLrzqt;
            java.lang.String name2 = txAssetChangeBean.getName();
            arrayList.add(new AbstractC10168bjP.TaskDescription(str2, str32, " ", name2 != null ? "" : name2, i, false, false, 0, false, false, null, 0, 0L, false, 16352, null));
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
