package o;

import com.okinc.business.defi.biz.core.customchain.meta.CustomChainCoinMeta;
import com.okinc.localization.util.format.DisplaySign;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.brR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10594brR implements InterfaceC9742bbN {
    public final C10854bwM AEQbTJ;
    public final java.lang.String AYXKKw;
    public final long AhwBna;
    public final long EZpvd;
    public final InterfaceC9780bbz KWHzl;
    public final long OLrzqt;
    public java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public java.lang.String gEmmrt;
    public final CustomChainCoinMeta valueOf;
    public final AbstractC12782ctV values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9742bbN
    public long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9742bbN
    public java.lang.String AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV DbNXlk() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9742bbN
    public InterfaceC9780bbz EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.gEmmrt = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9742bbN
    public long OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9742bbN
    public java.lang.String OLrzqt(boolean z) {
        return "0";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9742bbN
    public java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9742bbN
    public java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainCoinMeta fetchVPNInfo() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9742bbN
    public long gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/bbC; */
    @Override // o.InterfaceC9742bbN
    /* JADX INFO: renamed from: isConnected, reason: merged with bridge method [inline-methods] */
    public C10854bwM KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9742bbN
    public java.lang.String valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String values() {
        return this.copydefault;
    }

    public C10594brR(@NotNull CustomChainCoinMeta customChainCoinMeta, @NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(customChainCoinMeta, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.valueOf = customChainCoinMeta;
        this.values = abstractC12782ctV;
        this.AEQbTJ = customChainCoinMeta.AEQbTJ();
        this.OLrzqt = customChainCoinMeta.valueOf();
        this.EZpvd = customChainCoinMeta.copydefault();
        this.AhwBna = KWHzl().fetchVPNInfo();
        this.KWHzl = abstractC12782ctV.copydefault(java.lang.Long.valueOf(AEQbTJ()));
        this.djBIcL = KWHzl().fJNWhG();
        this.AYXKKw = "";
        this.copydefault = "0";
        this.gEmmrt = "0.00";
    }

    @Override // o.InterfaceC9742bbN
    public java.lang.String AYXKKw() {
        return C54870xYj.EZpvd(this.copydefault, KWHzl().valueOf(), KWHzl().AkhnZx(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
    }

    @Override // o.InterfaceC9742bbN
    public java.lang.String KWHzl(boolean z, boolean z2) {
        return C54870xYj.EZpvd(this.copydefault, KWHzl().valueOf(), KWHzl().AkhnZx(), z ? KWHzl().fJNWhG() : null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
    }
}
