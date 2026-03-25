package o;

import com.okinc.business.defi.biz.net.bean.IncludeAssetChangeBean;
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

/* JADX INFO: renamed from: o.bjU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C10173bjU extends AbstractC10170bjR {
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
    public C10173bjU(@NotNull android.content.Context context, @NotNull TxIdOrHashHistoryDetail txIdOrHashHistoryDetail) {
        super(context, txIdOrHashHistoryDetail);
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(txIdOrHashHistoryDetail, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // o.AbstractC10170bjR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String fARcdN() {
        int txType = fJNWhG().getTxType();
        if (txType != 74) {
            switch (txType) {
                case 50:
                    return C33070mpX.AYXKKw(C13754dXa.FragmentManager.Api26Impl);
                case 51:
                    return C33070mpX.AYXKKw(C13754dXa.FragmentManager.Api19Impl);
                case 52:
                    break;
                case 53:
                    return C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambdanew2);
                case 54:
                    return C33070mpX.AYXKKw(C13754dXa.FragmentManager.createFullyDrawnExecutor);
                default:
                    switch (txType) {
                        case 56:
                            break;
                        case 57:
                            break;
                        case 58:
                        case 60:
                        case 61:
                            break;
                        case 59:
                            break;
                        case 62:
                            break;
                        default:
                            return "";
                    }
                    break;
            }
        }
        return C33070mpX.AYXKKw(C13754dXa.FragmentManager.lambdanew1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // o.AbstractC10170bjR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String AkhnZx() {
        /*
            r2 = this;
            com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail r0 = r2.fJNWhG()
            int r0 = r0.getTxType()
            r1 = 74
            if (r0 == r1) goto L2b
            switch(r0) {
                case 50: goto L28;
                case 51: goto L13;
                case 52: goto L2b;
                case 53: goto L21;
                case 54: goto L1a;
                default: goto Lf;
            }
        Lf:
            switch(r0) {
                case 56: goto L21;
                case 57: goto L1a;
                case 58: goto L13;
                case 59: goto L2b;
                default: goto L12;
            }
        L12:
            goto L28
        L13:
            int r0 = o.C13754dXa.FragmentManager.IResultReceiver2Stub
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L31
        L1a:
            int r0 = o.C13754dXa.FragmentManager.createFullyDrawnExecutor
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L31
        L21:
            int r0 = o.C13754dXa.FragmentManager.onMetadataChanged
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L31
        L28:
            java.lang.String r0 = ""
            goto L31
        L2b:
            int r0 = o.C13754dXa.FragmentManager.IResultReceiver2Stub
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C10173bjU.AkhnZx():java.lang.String");
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP> AYXKKw() {
        if (fJNWhG().getTxType() == 54 || fJNWhG().getTxType() == 57) {
            java.util.List<TxAssetChangeBean> input = fJNWhG().getInput();
            if (input == null) {
                return yDY.AhwBna();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(input, 10));
            java.util.Iterator<T> it = input.iterator();
            while (it.hasNext()) {
                arrayList.add(OLrzqt((TxAssetChangeBean) it.next()));
            }
            return arrayList;
        }
        java.util.List<TxAssetChangeBean> output = fJNWhG().getOutput();
        if (output == null) {
            return yDY.AhwBna();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(output, 10));
        java.util.Iterator<T> it2 = output.iterator();
        while (it2.hasNext()) {
            arrayList2.add(OLrzqt((TxAssetChangeBean) it2.next()));
        }
        return arrayList2;
    }

    @Override // o.AbstractC10170bjR
    public int gEmmrt() {
        return AYXKKw().size();
    }

    /* JADX DEBUG: Method merged with bridge method: AuCTel()Ljava/lang/CharSequence; */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1067)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // o.AbstractC10170bjR
    /* JADX INFO: renamed from: sSMYrx, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String AuCTel() {
        /*
            r2 = this;
            com.okinc.business.defi.biz.net.bean.TxIdOrHashHistoryDetail r0 = r2.fJNWhG()
            int r0 = r0.getTxType()
            r1 = 74
            if (r0 == r1) goto L2b
            switch(r0) {
                case 50: goto L28;
                case 51: goto L13;
                case 52: goto L2b;
                case 53: goto L21;
                case 54: goto L1a;
                default: goto Lf;
            }
        Lf:
            switch(r0) {
                case 56: goto L21;
                case 57: goto L1a;
                case 58: goto L13;
                case 59: goto L2b;
                default: goto L12;
            }
        L12:
            goto L28
        L13:
            int r0 = o.C13754dXa.FragmentManager.Api19Impl
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L31
        L1a:
            int r0 = o.C13754dXa.FragmentManager.onExtrasChanged
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L31
        L21:
            int r0 = o.C13754dXa.FragmentManager.onExtrasChanged
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L31
        L28:
            java.lang.String r0 = ""
            goto L31
        L2b:
            int r0 = o.C13754dXa.FragmentManager.createFullyDrawnExecutor
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C10173bjU.AuCTel():java.lang.String");
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP> DbNXlk() {
        if (fJNWhG().getTxType() != 53 && fJNWhG().getTxType() != 56 && fJNWhG().getTxType() != 54 && fJNWhG().getTxType() != 57) {
            java.util.List<TxAssetChangeBean> input = fJNWhG().getInput();
            if (input == null) {
                return yDY.AhwBna();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(input, 10));
            java.util.Iterator<T> it = input.iterator();
            while (it.hasNext()) {
                arrayList.add(OLrzqt((TxAssetChangeBean) it.next()));
            }
            return arrayList;
        }
        return yDY.AhwBna();
    }

    @Override // o.AbstractC10170bjR
    public int isConnected() {
        return DbNXlk().size();
    }

    @Override // o.AbstractC10170bjR
    public java.util.List<AbstractC10168bjP.TaskDescription> KWHzl() {
        if (fJNWhG().getTxType() == 53 || fJNWhG().getTxType() == 56 || fJNWhG().getTxType() == 54 || fJNWhG().getTxType() == 57) {
            java.util.List<IncludeAssetChangeBean> include = fJNWhG().getInclude();
            if (include == null) {
                return yDY.AhwBna();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(include, 10));
            java.util.Iterator<T> it = include.iterator();
            while (it.hasNext()) {
                arrayList.add(AEQbTJ((IncludeAssetChangeBean) it.next()));
            }
            return arrayList;
        }
        return yDY.AhwBna();
    }

    @Override // o.AbstractC10170bjR
    public java.lang.String OLrzqt() {
        return zuBGHE();
    }

    public final java.lang.String zuBGHE() {
        int txType = fJNWhG().getTxType();
        boolean z = fJNWhG().getMainCoinId() == 1 || Intrinsics.EZpvd((java.lang.Object) fJNWhG().getChainSymbol(), (java.lang.Object) "BTC");
        boolean z2 = fJNWhG().getTxStatus() == 1;
        if (z && z2) {
            if (txType != 22) {
                if (txType == 50) {
                    return C33070mpX.AYXKKw(C13754dXa.FragmentManager.ixgjPv);
                }
                if (txType != 52) {
                    return fJNWhG().getFailReason();
                }
            }
            return C33070mpX.AYXKKw(C13754dXa.FragmentManager.zblBkD);
        }
        return fJNWhG().getFailReason();
    }

    public final AbstractC10168bjP OLrzqt(TxAssetChangeBean txAssetChangeBean) {
        java.lang.String str;
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
        if (fJNWhG().getTxType() != 61 && fJNWhG().getTxType() != 62 && C33129mqd.OLrzqt((java.lang.CharSequence) txAssetChangeBean.getNftId())) {
            java.lang.String nftId = txAssetChangeBean.getNftId();
            Intrinsics.copydefault((java.lang.Object) nftId);
            java.lang.String icon = txAssetChangeBean.getIcon();
            java.lang.String str2 = icon == null ? "" : icon;
            java.lang.String str3 = str + strOLrzqt;
            java.lang.String name = txAssetChangeBean.getName();
            return new AbstractC10168bjP.Activity(nftId, str2, str3, " ", name == null ? "" : name, iCopydefault, fJNWhG().getCoinId(), null, false, MLKEMEngine.KyberPolyBytes, null);
        }
        java.lang.String icon2 = txAssetChangeBean.getIcon();
        java.lang.String str4 = icon2 == null ? "" : icon2;
        java.lang.String str5 = str + strOLrzqt;
        java.lang.String name2 = txAssetChangeBean.getName();
        java.lang.String str6 = name2 == null ? "" : name2;
        boolean brc20Coin = txAssetChangeBean.getBrc20Coin();
        int txType = fJNWhG().getTxType();
        java.lang.String protocolName = txAssetChangeBean.getProtocolName();
        return new AbstractC10168bjP.TaskDescription(str4, str5, " ", str6, iCopydefault, false, brc20Coin, txType, false, false, protocolName == null ? "" : protocolName, 0, 0L, false, 15136, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC10168bjP.TaskDescription AEQbTJ(IncludeAssetChangeBean includeAssetChangeBean) {
        int i;
        java.lang.String str;
        java.lang.String amount;
        int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
        java.lang.String direction = includeAssetChangeBean.getDirection();
        java.lang.String strOLrzqt = null;
        if (Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "1")) {
            iCopydefault = C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, AEQbTJ(), 0.0f, 2, null);
            str = Marker.ANY_NON_NULL_MARKER;
        } else {
            if (!Intrinsics.EZpvd((java.lang.Object) direction, (java.lang.Object) "2")) {
                i = iCopydefault;
                str = "";
                amount = includeAssetChangeBean.getAmount();
                if (amount != null) {
                    strOLrzqt = C54870xYj.OLrzqt(amount, (249 & 1) != 0 ? 0 : 0, 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
                }
                java.lang.String icon = includeAssetChangeBean.getIcon();
                java.lang.String str2 = icon != null ? "" : icon;
                java.lang.String str3 = str + strOLrzqt;
                java.lang.String name = includeAssetChangeBean.getName();
                java.lang.String str4 = name != null ? "" : name;
                boolean brc20Coin = includeAssetChangeBean.getBrc20Coin();
                int txType = fJNWhG().getTxType();
                java.lang.Integer protocolId = includeAssetChangeBean.getProtocolId();
                int iIntValue = protocolId == null ? protocolId.intValue() : 0;
                java.lang.String protocolName = includeAssetChangeBean.getProtocolName();
                return new AbstractC10168bjP.TaskDescription(str2, str3, " ", str4, i, false, brc20Coin, txType, false, false, protocolName != null ? "" : protocolName, iIntValue, 0L, false, 13088, null);
            }
            str = "-";
        }
        i = iCopydefault;
        amount = includeAssetChangeBean.getAmount();
        if (amount != null) {
        }
        java.lang.String icon2 = includeAssetChangeBean.getIcon();
        if (icon2 != null) {
        }
        java.lang.String str32 = str + strOLrzqt;
        java.lang.String name2 = includeAssetChangeBean.getName();
        if (name2 != null) {
        }
        boolean brc20Coin2 = includeAssetChangeBean.getBrc20Coin();
        int txType2 = fJNWhG().getTxType();
        java.lang.Integer protocolId2 = includeAssetChangeBean.getProtocolId();
        int iIntValue2 = protocolId2 == null ? protocolId2.intValue() : 0;
        java.lang.String protocolName2 = includeAssetChangeBean.getProtocolName();
        return new AbstractC10168bjP.TaskDescription(str2, str32, " ", str4, i, false, brc20Coin2, txType2, false, false, protocolName2 != null ? "" : protocolName2, iIntValue2, 0L, false, 13088, null);
    }
}
