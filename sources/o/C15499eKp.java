package o;

import com.okinc.business.defi.biz.net.bean.TxRecord;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eKp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15499eKp extends C15489eKf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15499eKp(@NotNull TxRecord txRecord) {
        super(txRecord);
        Intrinsics.checkNotNullParameter(txRecord, "");
    }

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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
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
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
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
    @Override // o.C15489eKf
    public java.lang.String fetchVPNInfo() {
        /*
            r2 = this;
            com.okinc.business.defi.biz.net.bean.TxRecord r0 = r2.AuCTel()
            int r0 = r0.getTxType()
            r1 = 5
            if (r0 == r1) goto L6a
            r1 = 36
            if (r0 == r1) goto L63
            r1 = 50
            if (r0 == r1) goto L5c
            r1 = 52
            if (r0 == r1) goto L6a
            r1 = 74
            if (r0 == r1) goto L6a
            switch(r0) {
                case 40: goto L39;
                case 41: goto L32;
                case 42: goto L2b;
                default: goto L1e;
            }
        L1e:
            switch(r0) {
                case 59: goto L6a;
                case 60: goto L40;
                case 61: goto L40;
                case 62: goto L5c;
                default: goto L21;
            }
        L21:
            switch(r0) {
                case 66: goto L55;
                case 67: goto L4e;
                case 68: goto L47;
                default: goto L24;
            }
        L24:
            int r0 = o.C13754dXa.FragmentManager.lambdanew1
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L70
        L2b:
            int r0 = o.C13754dXa.FragmentManager.isAttachedToWindow
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L70
        L32:
            int r0 = o.C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplApi28ExternalSyntheticApiModelOutline0
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L70
        L39:
            int r0 = o.C13754dXa.FragmentManager.getFullyDrawnReporter
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L70
        L40:
            int r0 = o.C13754dXa.FragmentManager.Api19Impl
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L70
        L47:
            int r0 = o.C13754dXa.FragmentManager.QCjLjM
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L70
        L4e:
            int r0 = o.C13754dXa.FragmentManager.QwvEab
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L70
        L55:
            int r0 = o.C13754dXa.FragmentManager.QSLkRj
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L70
        L5c:
            int r0 = o.C13754dXa.FragmentManager.Api26Impl
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L70
        L63:
            int r0 = o.C13754dXa.FragmentManager.iPSTqm
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
            goto L70
        L6a:
            int r0 = o.C13754dXa.FragmentManager.lambdanew1
            java.lang.String r0 = o.C33070mpX.AYXKKw(r0)
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C15499eKp.fetchVPNInfo():java.lang.String");
    }

    @Override // o.C15489eKf
    public java.lang.String values() {
        if (AuCTel().getTxType() == 36) {
            return gEmmrt();
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) AuCTel().getContractName())) {
            java.lang.String contractName = AuCTel().getContractName();
            return contractName == null ? "" : contractName;
        }
        return C14079deg.EZpvd.AEQbTJ(AuCTel().getContractAddress(), true);
    }

    @Override // o.C15489eKf
    public boolean ejfBZ() {
        return AuCTel().getTxType() == 52 || AuCTel().getTxType() == 50 || AuCTel().getTxType() == 60 || AuCTel().getTxType() == 61 || AuCTel().getTxType() == 62;
    }

    @Override // o.C15489eKf
    public boolean fARcdN() {
        return AuCTel().getTxType() == 59 || AuCTel().getTxType() == 36;
    }
}
