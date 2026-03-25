package o;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.lzf.easyfloat.enums.ShowPattern;
import com.lzf.easyfloat.enums.SidePattern;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.avX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C8055avX {
    public InterfaceC8112awb AEQbTJ;
    public InterfaceC8115awe AYXKKw;
    public int AhwBna;
    public boolean AkhnZx;
    public int AuCTel;
    public SidePattern AuCTelauCTel;
    public int AubY;
    public InterfaceC8118awh DbNXlk;
    public boolean EZpvd;
    public boolean KWHzl;
    public InterfaceC8111awa OLrzqt;
    public int copydefault;
    public C8114awd djBIcL;
    public boolean ejfBZ;
    public boolean fARcdN;
    public java.lang.Integer fIwbmz;
    public android.view.View fJNWhG;
    public boolean fetchVPNInfo;
    public java.lang.String gEmmrt;
    public kotlin.Pair<java.lang.Integer, java.lang.Integer> getFieldNames;
    public int getNewProxyInstance;
    public kotlin.Pair<java.lang.Integer, java.lang.Integer> hDKMBd;
    public boolean isConnected;
    public boolean iwGUEr;
    public int uzCIH;
    public final java.util.Set<java.lang.String> valueOf;
    public boolean values;
    public boolean zLjUOn;
    public ShowPattern zsXlph;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C8055avX() {
        this(null, null, null, false, false, false, false, false, false, null, null, false, false, 0, null, null, 0, 0, 0, 0, null, null, null, null, null, null, false, false, 0, 536870911, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8055avX AEQbTJ(java.lang.Integer num, android.view.View view, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull SidePattern sidePattern, @NotNull ShowPattern showPattern, boolean z7, boolean z8, int i, @NotNull kotlin.Pair<java.lang.Integer, java.lang.Integer> pair, @NotNull kotlin.Pair<java.lang.Integer, java.lang.Integer> pair2, int i2, int i3, int i4, int i5, InterfaceC8118awh interfaceC8118awh, InterfaceC8111awa interfaceC8111awa, C8114awd c8114awd, InterfaceC8115awe interfaceC8115awe, @NotNull InterfaceC8112awb interfaceC8112awb, @NotNull java.util.Set<java.lang.String> set, boolean z9, boolean z10, int i6) {
        Intrinsics.checkNotNullParameter(sidePattern, "");
        Intrinsics.checkNotNullParameter(showPattern, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(interfaceC8112awb, "");
        Intrinsics.checkNotNullParameter(set, "");
        return new C8055avX(num, view, str, z, z2, z3, z4, z5, z6, sidePattern, showPattern, z7, z8, i, pair, pair2, i2, i3, i4, i5, interfaceC8118awh, interfaceC8111awa, c8114awd, interfaceC8115awe, interfaceC8112awb, set, z9, z10, i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC8112awb AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.AhwBna = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(android.view.View view) {
        this.fJNWhG = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(C8114awd c8114awd) {
        this.djBIcL = c8114awd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(InterfaceC8118awh interfaceC8118awh) {
        this.DbNXlk = interfaceC8118awh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.KWHzl = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C8114awd AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(boolean z) {
        this.fARcdN = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> AuCTel() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AubY() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(int i) {
        this.copydefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.ejfBZ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.getNewProxyInstance = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull SidePattern sidePattern) {
        Intrinsics.checkNotNullParameter(sidePattern, "");
        this.AuCTelauCTel = sidePattern;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.String str) {
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(InterfaceC8115awe interfaceC8115awe) {
        this.AYXKKw = interfaceC8115awe;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.iwGUEr = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC8111awa OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(int i) {
        this.AubY = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull ShowPattern showPattern) {
        Intrinsics.checkNotNullParameter(showPattern, "");
        this.zsXlph = showPattern;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.isConnected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.uzCIH = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.Integer num) {
        this.fIwbmz = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull kotlin.Pair<java.lang.Integer, java.lang.Integer> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        this.hDKMBd = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.values = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(boolean z) {
        this.zLjUOn = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer ejfBZ() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8055avX)) {
            return false;
        }
        C8055avX c8055avX = (C8055avX) obj;
        return Intrinsics.EZpvd(this.fIwbmz, c8055avX.fIwbmz) && Intrinsics.EZpvd(this.fJNWhG, c8055avX.fJNWhG) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c8055avX.gEmmrt) && this.KWHzl == c8055avX.KWHzl && this.ejfBZ == c8055avX.ejfBZ && this.values == c8055avX.values && this.fARcdN == c8055avX.fARcdN && this.fetchVPNInfo == c8055avX.fetchVPNInfo && this.AkhnZx == c8055avX.AkhnZx && Intrinsics.EZpvd(this.AuCTelauCTel, c8055avX.AuCTelauCTel) && Intrinsics.EZpvd(this.zsXlph, c8055avX.zsXlph) && this.zLjUOn == c8055avX.zLjUOn && this.isConnected == c8055avX.isConnected && this.AhwBna == c8055avX.AhwBna && Intrinsics.EZpvd(this.hDKMBd, c8055avX.hDKMBd) && Intrinsics.EZpvd(this.getFieldNames, c8055avX.getFieldNames) && this.getNewProxyInstance == c8055avX.getNewProxyInstance && this.AubY == c8055avX.AubY && this.uzCIH == c8055avX.uzCIH && this.copydefault == c8055avX.copydefault && Intrinsics.EZpvd(this.DbNXlk, c8055avX.DbNXlk) && Intrinsics.EZpvd(this.OLrzqt, c8055avX.OLrzqt) && Intrinsics.EZpvd(this.djBIcL, c8055avX.djBIcL) && Intrinsics.EZpvd(this.AYXKKw, c8055avX.AYXKKw) && Intrinsics.EZpvd(this.AEQbTJ, c8055avX.AEQbTJ) && Intrinsics.EZpvd(this.valueOf, c8055avX.valueOf) && this.EZpvd == c8055avX.EZpvd && this.iwGUEr == c8055avX.iwGUEr && this.AuCTel == c8055avX.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fARcdN() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final android.view.View fJNWhG() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC8118awh fetchVPNInfo() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Set<java.lang.String> gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SidePattern getFieldNames() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNewProxyInstance() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> hDKMBd() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [int] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r6v14, types: [int] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public int hashCode() {
        java.lang.Integer num = this.fIwbmz;
        int iHashCode = num != null ? num.hashCode() : 0;
        android.view.View view = this.fJNWhG;
        int iHashCode2 = view != null ? view.hashCode() : 0;
        java.lang.String str = this.gEmmrt;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        boolean z = this.KWHzl;
        ?? r5 = z;
        if (z) {
            r5 = 1;
        }
        boolean z2 = this.ejfBZ;
        ?? r7 = z2;
        if (z2) {
            r7 = 1;
        }
        boolean z3 = this.values;
        ?? r8 = z3;
        if (z3) {
            r8 = 1;
        }
        boolean z4 = this.fARcdN;
        ?? r9 = z4;
        if (z4) {
            r9 = 1;
        }
        boolean z5 = this.fetchVPNInfo;
        ?? r10 = z5;
        if (z5) {
            r10 = 1;
        }
        boolean z6 = this.AkhnZx;
        ?? r11 = z6;
        if (z6) {
            r11 = 1;
        }
        SidePattern sidePattern = this.AuCTelauCTel;
        int iHashCode4 = sidePattern != null ? sidePattern.hashCode() : 0;
        ShowPattern showPattern = this.zsXlph;
        int iHashCode5 = showPattern != null ? showPattern.hashCode() : 0;
        boolean z7 = this.zLjUOn;
        ?? r14 = z7;
        if (z7) {
            r14 = 1;
        }
        boolean z8 = this.isConnected;
        ?? r15 = z8;
        if (z8) {
            r15 = 1;
        }
        int i = this.AhwBna;
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pair = this.hDKMBd;
        int iHashCode6 = pair != null ? pair.hashCode() : 0;
        kotlin.Pair<java.lang.Integer, java.lang.Integer> pair2 = this.getFieldNames;
        int iHashCode7 = pair2 != null ? pair2.hashCode() : 0;
        int i2 = this.getNewProxyInstance;
        int i3 = this.AubY;
        int i4 = this.uzCIH;
        int i5 = this.copydefault;
        InterfaceC8118awh interfaceC8118awh = this.DbNXlk;
        int iHashCode8 = interfaceC8118awh != null ? interfaceC8118awh.hashCode() : 0;
        InterfaceC8111awa interfaceC8111awa = this.OLrzqt;
        int iHashCode9 = interfaceC8111awa != null ? interfaceC8111awa.hashCode() : 0;
        C8114awd c8114awd = this.djBIcL;
        int iHashCode10 = c8114awd != null ? c8114awd.hashCode() : 0;
        InterfaceC8115awe interfaceC8115awe = this.AYXKKw;
        int iHashCode11 = interfaceC8115awe != null ? interfaceC8115awe.hashCode() : 0;
        InterfaceC8112awb interfaceC8112awb = this.AEQbTJ;
        int iHashCode12 = interfaceC8112awb != null ? interfaceC8112awb.hashCode() : 0;
        java.util.Set<java.lang.String> set = this.valueOf;
        int iHashCode13 = set != null ? set.hashCode() : 0;
        boolean z9 = this.EZpvd;
        ?? r28 = z9 ? 1 : z9;
        boolean z10 = this.iwGUEr;
        ?? r6 = z10;
        if (z10) {
            r6 = 1;
        }
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + r5) * 31) + r7) * 31) + r8) * 31) + r9) * 31) + r10) * 31) + r11) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + r14) * 31) + r15) * 31) + i) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + r28) * 31) + r6) * 31) + this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int iwGUEr() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FloatConfig(layoutId=" + this.fIwbmz + ", layoutView=" + this.fJNWhG + ", floatTag=" + this.gEmmrt + ", dragEnable=" + this.KWHzl + ", isDrag=" + this.ejfBZ + ", isAnim=" + this.values + ", isShow=" + this.fARcdN + ", hasEditText=" + this.fetchVPNInfo + ", immersionStatusBar=" + this.AkhnZx + ", sidePattern=" + this.AuCTelauCTel + ", showPattern=" + this.zsXlph + ", widthMatch=" + this.zLjUOn + ", heightMatch=" + this.isConnected + ", gravity=" + this.AhwBna + ", offsetPair=" + this.hDKMBd + ", locationPair=" + this.getFieldNames + ", leftBorder=" + this.getNewProxyInstance + ", topBorder=" + this.AubY + ", rightBorder=" + this.uzCIH + ", bottomBorder=" + this.copydefault + ", invokeView=" + this.DbNXlk + ", callbacks=" + this.OLrzqt + ", floatCallbacks=" + this.djBIcL + ", floatAnimator=" + this.AYXKKw + ", displayHeight=" + this.AEQbTJ + ", filterSet=" + this.valueOf + ", filterSelf=" + this.EZpvd + ", needShow=" + this.iwGUEr + ", layoutChangedGravity=" + this.AuCTel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShowPattern uzCIH() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC8115awe valueOf() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int values() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean wlaJM() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zLjUOn() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zsXlph() {
        return this.values;
    }

    public C8055avX(java.lang.Integer num, android.view.View view, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, @NotNull SidePattern sidePattern, @NotNull ShowPattern showPattern, boolean z7, boolean z8, int i, @NotNull kotlin.Pair<java.lang.Integer, java.lang.Integer> pair, @NotNull kotlin.Pair<java.lang.Integer, java.lang.Integer> pair2, int i2, int i3, int i4, int i5, InterfaceC8118awh interfaceC8118awh, InterfaceC8111awa interfaceC8111awa, C8114awd c8114awd, InterfaceC8115awe interfaceC8115awe, @NotNull InterfaceC8112awb interfaceC8112awb, @NotNull java.util.Set<java.lang.String> set, boolean z9, boolean z10, int i6) {
        Intrinsics.checkNotNullParameter(sidePattern, "");
        Intrinsics.checkNotNullParameter(showPattern, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(interfaceC8112awb, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.fIwbmz = num;
        this.fJNWhG = view;
        this.gEmmrt = str;
        this.KWHzl = z;
        this.ejfBZ = z2;
        this.values = z3;
        this.fARcdN = z4;
        this.fetchVPNInfo = z5;
        this.AkhnZx = z6;
        this.AuCTelauCTel = sidePattern;
        this.zsXlph = showPattern;
        this.zLjUOn = z7;
        this.isConnected = z8;
        this.AhwBna = i;
        this.hDKMBd = pair;
        this.getFieldNames = pair2;
        this.getNewProxyInstance = i2;
        this.AubY = i3;
        this.uzCIH = i4;
        this.copydefault = i5;
        this.DbNXlk = interfaceC8118awh;
        this.OLrzqt = interfaceC8111awa;
        this.djBIcL = c8114awd;
        this.AYXKKw = interfaceC8115awe;
        this.AEQbTJ = interfaceC8112awb;
        this.valueOf = set;
        this.EZpvd = z9;
        this.iwGUEr = z10;
        this.AuCTel = i6;
    }

    public /* synthetic */ C8055avX(java.lang.Integer num, android.view.View view, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, SidePattern sidePattern, ShowPattern showPattern, boolean z7, boolean z8, int i, kotlin.Pair pair, kotlin.Pair pair2, int i2, int i3, int i4, int i5, InterfaceC8118awh interfaceC8118awh, InterfaceC8111awa interfaceC8111awa, C8114awd c8114awd, InterfaceC8115awe interfaceC8115awe, InterfaceC8112awb interfaceC8112awb, java.util.Set set, boolean z9, boolean z10, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        boolean z11;
        int i8;
        boolean z12;
        kotlin.Pair pair3;
        kotlin.Pair pair4;
        kotlin.Pair pair5;
        java.lang.Integer num2 = (i7 & 1) != 0 ? null : num;
        android.view.View view2 = (i7 & 2) != 0 ? null : view;
        java.lang.String str2 = (i7 & 4) != 0 ? null : str;
        boolean z13 = (i7 & 8) != 0 ? true : z;
        boolean z14 = (i7 & 16) != 0 ? false : z2;
        boolean z15 = (i7 & 32) != 0 ? false : z3;
        boolean z16 = (i7 & 64) != 0 ? false : z4;
        boolean z17 = (i7 & 128) != 0 ? false : z5;
        boolean z18 = (i7 & 256) != 0 ? false : z6;
        SidePattern sidePattern2 = (i7 & 512) != 0 ? SidePattern.DEFAULT : sidePattern;
        ShowPattern showPattern2 = (i7 & 1024) != 0 ? ShowPattern.CURRENT_ACTIVITY : showPattern;
        boolean z19 = (i7 & 2048) != 0 ? false : z7;
        boolean z20 = (i7 & 4096) != 0 ? false : z8;
        int i9 = (i7 & 8192) != 0 ? 0 : i;
        if ((i7 & 16384) != 0) {
            i8 = i9;
            z12 = false;
            z11 = z20;
            pair3 = new kotlin.Pair(0, 0);
        } else {
            z11 = z20;
            i8 = i9;
            z12 = false;
            pair3 = pair;
        }
        if ((32768 & i7) != 0) {
            pair4 = pair3;
            pair5 = new kotlin.Pair(java.lang.Integer.valueOf(z12 ? 1 : 0), java.lang.Integer.valueOf(z12 ? 1 : 0));
        } else {
            pair4 = pair3;
            pair5 = pair2;
        }
        this(num2, view2, str2, z13, z14, z15, z16, z17, z18, sidePattern2, showPattern2, z19, z11, i8, pair4, pair5, ((65536 & i7) != 0 ? z12 ? 1 : 0 : i2) == true ? 1 : 0, (131072 & i7) != 0 ? -999 : i3, (i7 & 262144) != 0 ? 9999 : i4, (i7 & 524288) == 0 ? i5 : 9999, (i7 & 1048576) != 0 ? null : interfaceC8118awh, (i7 & 2097152) != 0 ? null : interfaceC8111awa, (i7 & 4194304) != 0 ? null : c8114awd, (i7 & 8388608) != 0 ? new C8050avS() : interfaceC8115awe, (i7 & 16777216) != 0 ? new C8123awm() : interfaceC8112awb, (i7 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? new LinkedHashSet() : set, (i7 & 67108864) == 0 ? z9 : z12, (i7 & 134217728) != 0 ? true : z10, (i7 & 268435456) != 0 ? 8388659 : i6);
    }
}
