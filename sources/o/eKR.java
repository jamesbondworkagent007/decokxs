package o;

import com.okinc.business.defi.biz.net.bean.AssetChangeInfo;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes15.dex */
public final class eKR {
    public static final eKR OLrzqt = new eKR();

    private eKR() {
    }

    public final java.lang.String AEQbTJ(@NotNull AssetChangeInfo assetChangeInfo) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(assetChangeInfo, "");
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(java.lang.Long.valueOf(assetChangeInfo.getCoinId()));
        java.lang.String coinAmount = assetChangeInfo.getCoinAmount();
        if (coinAmount != null) {
            strOLrzqt = C54870xYj.OLrzqt(coinAmount, (249 & 1) != 0 ? 0 : 0, c10854bwMKWHzl != null ? c10854bwMKWHzl.AkhnZx() : 6, null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
        } else {
            strOLrzqt = null;
        }
        if (assetChangeInfo.getDirection() == 1) {
            return Marker.ANY_NON_NULL_MARKER + strOLrzqt;
        }
        return "-" + strOLrzqt;
    }

    public static /* synthetic */ int getPlaceholder$default(eKR ekr, C15489eKf c15489eKf, AssetChangeInfo assetChangeInfo, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            assetChangeInfo = null;
        }
        return ekr.AEQbTJ(c15489eKf, assetChangeInfo);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.addCases(SwitchRegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:71)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:96)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AEQbTJ(@org.jetbrains.annotations.NotNull o.C15489eKf r2, com.okinc.business.defi.biz.net.bean.AssetChangeInfo r3) {
        /*
            r1 = this;
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            com.okinc.business.defi.biz.net.bean.TxRecord r2 = r2.AuCTel()
            int r2 = r2.getTxType()
            r0 = 11
            if (r2 == r0) goto L67
            r0 = 12
            if (r2 == r0) goto L67
            r0 = 40
            if (r2 == r0) goto L64
            r0 = 41
            if (r2 == r0) goto L61
            r0 = 72
            if (r2 == r0) goto L5e
            r0 = 87
            if (r2 == r0) goto L5e
            switch(r2) {
                case 1: goto L5e;
                case 2: goto L5e;
                case 3: goto L5b;
                case 4: goto L3a;
                case 5: goto L64;
                case 6: goto L3a;
                case 7: goto L67;
                default: goto L28;
            }
        L28:
            switch(r2) {
                case 20: goto L3d;
                case 21: goto L3d;
                case 22: goto L3d;
                case 23: goto L3d;
                case 24: goto L3d;
                case 25: goto L5b;
                case 26: goto L4f;
                case 27: goto L3a;
                default: goto L2b;
            }
        L2b:
            switch(r2) {
                case 30: goto L5e;
                case 31: goto L5e;
                case 32: goto L5e;
                case 33: goto L5e;
                case 34: goto L5e;
                case 35: goto L5e;
                case 36: goto L5e;
                default: goto L2e;
            }
        L2e:
            switch(r2) {
                case 50: goto L5e;
                case 51: goto L5e;
                case 52: goto L5e;
                case 53: goto L5e;
                case 54: goto L5e;
                default: goto L31;
            }
        L31:
            switch(r2) {
                case 60: goto L5e;
                case 61: goto L52;
                case 62: goto L4f;
                default: goto L34;
            }
        L34:
            switch(r2) {
                case 80: goto L5b;
                case 81: goto L58;
                case 82: goto L55;
                default: goto L37;
            }
        L37:
            int r2 = o.C52761wXj.TaskDescription.aHXSQp
            goto L69
        L3a:
            int r2 = o.C13754dXa.Activity.gwTjWJ
            goto L69
        L3d:
            if (r3 == 0) goto L4c
            java.lang.String r2 = r3.getNftId()
            boolean r2 = o.C33129mqd.OLrzqt(r2)
            if (r2 == 0) goto L5e
            int r2 = o.kNQ.StateListAnimator.KWHzl
            return r2
        L4c:
            int r2 = o.kNQ.StateListAnimator.KWHzl
            goto L69
        L4f:
            int r2 = o.kNQ.StateListAnimator.KWHzl
            return r2
        L52:
            int r2 = o.C13754dXa.Activity.OHqIaq
            goto L69
        L55:
            int r2 = o.C13754dXa.Activity.djSkpj
            goto L69
        L58:
            int r2 = o.C13754dXa.Activity.dxcTrN
            goto L69
        L5b:
            int r2 = o.C13754dXa.Activity.aKErDB
            goto L69
        L5e:
            int r2 = o.C52761wXj.TaskDescription.aHXSQp
            goto L69
        L61:
            int r2 = o.C13754dXa.Activity.hBpjJd
            goto L69
        L64:
            int r2 = o.C13754dXa.Activity.RdAHlO
            goto L69
        L67:
            int r2 = o.C13754dXa.Activity.OqFWZa
        L69:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.eKR.AEQbTJ(o.eKf, com.okinc.business.defi.biz.net.bean.AssetChangeInfo):int");
    }
}
