package o;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.TokenAsset;
import com.okinc.localization.util.format.DisplaySign;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C10407bnq;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10525bqB extends AbstractC10406bnp implements InterfaceC9742bbN {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String AYXKKw;
    public BigDecimal AhwBna;
    public boolean AkhnZx;
    public boolean AuCTel;
    public java.lang.String AuCTelauCTel;
    public java.lang.String AubY;
    public BigDecimal DbNXlk;
    public ChainAddress KWHzl;
    public java.util.ArrayList<java.lang.Long> copydefault;
    public final C10854bwM djBIcL;
    public boolean ejfBZ;
    public boolean fARcdN;
    public boolean fIwbmz;
    public java.lang.String fJNWhG;
    public java.lang.String fetchVPNInfo;
    public java.lang.String gEmmrt;
    public java.lang.String getFieldNames;
    public final int getNewProxyInstance;
    public final AbstractC12782ctV hDKMBd;
    public java.lang.String isConnected;
    public java.lang.String iwGUEr;
    public java.lang.String uzCIH;
    public java.lang.String valueOf;
    public java.lang.String values;
    public java.lang.String wlaJM;
    public final boolean zLjUOn;
    public java.lang.String zsXlph;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.bwM), (r2v0 o.ctV) A[MD:(o.bwM, o.ctV):void (m)] call: o.bqB.<init>(o.bwM, o.ctV):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C10525bqB(C10854bwM c10854bwM, AbstractC12782ctV abstractC12782ctV, DefaultConstructorMarker defaultConstructorMarker) {
        this(c10854bwM, abstractC12782ctV);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AubY = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9742bbN
    public java.lang.String AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uzCIH = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AuCTelauCTel = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: EZpvd()Lo/bbz; */
    @Override // o.InterfaceC9742bbN
    /* JADX INFO: renamed from: AuCTel, reason: merged with bridge method [inline-methods] */
    public ChainAddress EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTelauCTel() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AubY() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AwvSrB() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AxsJAY() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DTwDnp() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void DbNXlk(java.lang.String str) {
        this.zsXlph = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.String str) {
        this.isConnected = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.util.ArrayList<java.lang.Long> arrayList) {
        this.copydefault = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AkhnZx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ORxRYg() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OcIXYQ() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QKVWgx() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC9742bbN
    public java.lang.String copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(java.lang.String str) {
        this.iwGUEr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ejfBZ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.Long> fARcdN() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal fJNWhG() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fetchVPNInfo(java.lang.String str) {
        this.wlaJM = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getFieldNames = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gHZMYf() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl()Lo/bbC; */
    @Override // o.InterfaceC9742bbN
    /* JADX INFO: renamed from: getFieldNames, reason: merged with bridge method [inline-methods] */
    public C10854bwM KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getNewProxyInstance() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String hDKMBd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BigDecimal iwGUEr() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String sSMYrx() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC10406bnp
    public AbstractC12782ctV values() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zLjUOn() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zsXlph() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zuBGHE() {
        return this.fJNWhG;
    }

    public C10525bqB(C10854bwM c10854bwM, AbstractC12782ctV abstractC12782ctV) {
        super(abstractC12782ctV);
        this.djBIcL = c10854bwM;
        this.hDKMBd = abstractC12782ctV;
        this.AEQbTJ = "0";
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
        this.AhwBna = bigDecimal;
        this.valueOf = "0";
        this.gEmmrt = "0";
        this.values = "0.00";
        this.DbNXlk = C33129mqd.EZpvd(AhwBna());
        this.fetchVPNInfo = "0.00";
        this.fJNWhG = "";
        this.ejfBZ = KWHzl().DCUTEI();
        this.zLjUOn = KWHzl().djSkpj();
        this.AubY = KWHzl().dNCPSb();
        this.getNewProxyInstance = KWHzl().UeEOUB();
        this.AYXKKw = "";
        this.uzCIH = "";
        this.getFieldNames = "";
        this.AuCTelauCTel = "";
    }

    public java.lang.String wlaJM() {
        return C10953byF.KWHzl.AEQbTJ(OLrzqt());
    }

    @Override // o.AbstractC10406bnp, o.InterfaceC9742bbN
    public long gEmmrt() {
        return KWHzl().fetchVPNInfo();
    }

    @Override // o.InterfaceC9742bbN
    public long OLrzqt() {
        return KWHzl().AhwBna();
    }

    @Override // o.InterfaceC9742bbN
    public long AEQbTJ() {
        return KWHzl().AEQbTJ();
    }

    @Override // o.InterfaceC9742bbN
    public java.lang.String valueOf() {
        return KWHzl().fJNWhG();
    }

    public final void AEQbTJ(java.lang.String str) {
        this.AEQbTJ = str;
        QbewEr();
    }

    public final java.lang.String fIwbmz() {
        return (this.fIwbmz || this.fARcdN) ? this.AEQbTJ : C54870xYj.AEQbTJ(copydefault(), KWHzl().valueOf());
    }

    public final void QbewEr() {
        BigDecimal bigDecimalEZpvd;
        if (this.fIwbmz || this.fARcdN) {
            bigDecimalEZpvd = C33129mqd.EZpvd(fIwbmz());
        } else {
            bigDecimalEZpvd = C33129mqd.EZpvd(copydefault()).movePointLeft(KWHzl().valueOf());
            Intrinsics.copydefault(bigDecimalEZpvd);
        }
        this.AhwBna = bigDecimalEZpvd;
    }

    public final void copydefault(java.lang.String str) {
        this.gEmmrt = str;
        QbewEr();
    }

    public final void KWHzl(java.lang.String str) {
        this.values = str;
        this.DbNXlk = C33129mqd.EZpvd(str);
    }

    public final void valueOf(java.lang.String str) {
        this.KWHzl = AbstractC12782ctV.addressFromAddress$default(values(), str, null, 2, null);
        this.fJNWhG = str;
    }

    public final void AEQbTJ(boolean z) {
        this.fIwbmz = z;
        QbewEr();
    }

    public final void copydefault(boolean z) {
        this.fARcdN = z;
        QbewEr();
    }

    public final boolean QOLQEE() {
        return KWHzl().DWgRXt() || this.AuCTel;
    }

    public final boolean QVAiDq() {
        return KWHzl().getNewProxyInstance();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bnq.ActionBar.getInstance$default(o.bnq$ActionBar, android.content.Context, int, java.lang.Object):o.bnq */
    /* JADX DEBUG: Class process forced to load method for inline: o.xYj.formatCoinFromAmt$default(java.lang.String, int, int, java.lang.String, com.okinc.localization.util.format.DisplaySign, boolean, java.lang.Boolean, boolean, java.math.RoundingMode, int, java.lang.Object):java.lang.String */
    @Override // o.InterfaceC9742bbN
    public java.lang.String KWHzl(boolean z, boolean z2) {
        if (!z2) {
            return C54870xYj.OLrzqt(fIwbmz(), (249 & 1) != 0 ? 0 : 0, KWHzl().AkhnZx(), z ? KWHzl().fJNWhG() : null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
        }
        if (C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).valueOf() || C33129mqd.AEQbTJ(fIwbmz(), 0)) {
            return C54870xYj.OLrzqt(fIwbmz(), (249 & 1) != 0 ? 0 : 0, KWHzl().AkhnZx(), z ? KWHzl().fJNWhG() : null, (249 & 8) != 0 ? DisplaySign.AUTO : null, (249 & 16) != 0 ? false : false, (249 & 32) != 0 ? null : null, (249 & 64) != 0 ? false : false, (249 & 128) != 0 ? RoundingMode.DOWN : null);
        }
        return copydefault();
    }

    @Override // o.InterfaceC9742bbN
    public java.lang.String AYXKKw() {
        return C54870xYj.EZpvd(fIwbmz(), KWHzl().fZBcTu(), RoundingMode.DOWN);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xYt.formatValuationFromAsset$default(java.lang.String, com.okinc.wallet.core.formatter.WalletCurrencyBean, boolean, int, boolean, int, java.lang.Object):java.lang.String */
    @Override // o.InterfaceC9742bbN
    public java.lang.String OLrzqt(boolean z) {
        return C54880xYt.formatValuationFromAsset$default(AhwBna(), null, false, 0, false, 15, null);
    }

    public final boolean RJOkX() {
        return C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).OLrzqt(OLrzqt());
    }

    public final java.lang.String uzCIH() {
        return RJOkX() ? "0" : AhwBna();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gsH.handleCreateCodeAddress$default(o.gsH, o.bwM, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Boolean, o.bwM, java.lang.String, int, java.lang.Object):java.lang.String */
    @Override // o.InterfaceC9742bbN
    public java.lang.String djBIcL() {
        return C21038gsH.copydefault.EZpvd(KWHzl(), zuBGHE(), (TypedValues.PositionType.TYPE_CURVE_FIT & 4) != 0 ? "" : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 8) != 0 ? "" : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 16) != 0 ? "" : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 32) != 0 ? false : false, (TypedValues.PositionType.TYPE_CURVE_FIT & 64) != 0 ? null : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 128) != 0 ? null : null, (TypedValues.PositionType.TYPE_CURVE_FIT & 256) != 0 ? null : null);
    }

    public final void DbNXlk() {
        OLrzqt(this);
    }

    public final void EZpvd(@NotNull C10525bqB c10525bqB) {
        Intrinsics.checkNotNullParameter(c10525bqB, "");
        OLrzqt(c10525bqB);
        copydefault(c10525bqB);
        this.ejfBZ = this.ejfBZ || c10525bqB.ejfBZ;
    }

    public final void OLrzqt(C10525bqB c10525bqB) {
        if (KWHzl().giSNqX()) {
            if (this.copydefault == null) {
                this.copydefault = new java.util.ArrayList<>();
            }
            java.util.ArrayList<java.lang.Long> arrayList = this.copydefault;
            if (arrayList != null) {
                arrayList.add(java.lang.Long.valueOf(c10525bqB.OLrzqt()));
            }
            AEQbTJ(true);
            this.AubY = C33070mpX.AYXKKw(C13754dXa.FragmentManager.hcetpZ);
            if (c10525bqB.KWHzl().DWgRXt()) {
                this.AuCTel = true;
                return;
            }
            return;
        }
        if (KWHzl().dxcTrN()) {
            copydefault(true);
        }
    }

    public final void copydefault(C10525bqB c10525bqB) {
        AEQbTJ(C54862xYb.convertToString$default(C54862xYb.KWHzl(KWHzl(fIwbmz(), KWHzl().fZBcTu()), KWHzl(c10525bqB.fIwbmz(), c10525bqB.KWHzl().fZBcTu())), false, null, null, 7, null));
        KWHzl(C54862xYb.convertToString$default(C54862xYb.KWHzl(KWHzl(AhwBna(), 12), KWHzl(c10525bqB.AhwBna(), 12)), false, null, null, 7, null));
        copydefault(C54862xYb.convertToString$default(C54862xYb.KWHzl(copydefault(), c10525bqB.copydefault()), false, null, null, 7, null));
        this.fetchVPNInfo = C54862xYb.convertToString$default(C54862xYb.KWHzl(this.fetchVPNInfo, c10525bqB.fetchVPNInfo), false, null, null, 7, null);
        this.valueOf = c10525bqB.valueOf;
        this.zsXlph = null;
        this.wlaJM = null;
    }

    public final java.lang.String KWHzl(java.lang.String str, int i) {
        return C54862xYb.convertToString$default(C33129mqd.EZpvd(str), false, java.lang.Integer.valueOf(i), null, 5, null);
    }

    public static /* synthetic */ void setValues$default(C10525bqB c10525bqB, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i, java.lang.Object obj) {
        c10525bqB.EZpvd(str, str2, str3, str4, (i & 16) != 0 ? "0" : str5, str6, str7, str8, str9);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        copydefault(str);
        KWHzl(str2);
        this.fetchVPNInfo = str3;
        valueOf(str4);
        this.valueOf = str5;
        this.zsXlph = str6;
        this.wlaJM = str7;
        this.iwGUEr = str8;
        this.isConnected = str9;
    }

    public final C10525bqB fetchVPNInfo() {
        C10525bqB c10525bqB = new C10525bqB(KWHzl(), values());
        c10525bqB.AEQbTJ(fIwbmz());
        c10525bqB.copydefault(copydefault());
        c10525bqB.KWHzl(AhwBna());
        c10525bqB.fetchVPNInfo = this.fetchVPNInfo;
        c10525bqB.valueOf(this.fJNWhG);
        c10525bqB.KWHzl = EZpvd();
        c10525bqB.AEQbTJ(this.fIwbmz);
        c10525bqB.copydefault(this.fARcdN);
        c10525bqB.copydefault = this.copydefault;
        c10525bqB.AkhnZx = this.AkhnZx;
        c10525bqB.AubY = this.AubY;
        c10525bqB.AYXKKw = this.AYXKKw;
        c10525bqB.uzCIH = this.uzCIH;
        c10525bqB.valueOf = this.valueOf;
        c10525bqB.zsXlph = this.zsXlph;
        c10525bqB.wlaJM = this.wlaJM;
        c10525bqB.getFieldNames = this.getFieldNames;
        c10525bqB.AuCTelauCTel = this.AuCTelauCTel;
        c10525bqB.iwGUEr = this.iwGUEr;
        c10525bqB.isConnected = this.isConnected;
        return c10525bqB;
    }

    public final WalletCoinAssetEntity AkhnZx() {
        java.lang.String strDbNXlk = values().DbNXlk();
        long jOLrzqt = OLrzqt();
        java.lang.String strFIwbmz = fIwbmz();
        java.lang.String strCopydefault = copydefault();
        java.lang.String strAhwBna = AhwBna();
        java.lang.String str = this.fetchVPNInfo;
        java.lang.String str2 = this.fJNWhG;
        int iAhwBna = C33129mqd.AhwBna(java.lang.Boolean.valueOf(RJOkX()));
        java.lang.String str3 = this.zsXlph;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = this.wlaJM;
        java.lang.String str6 = str5 == null ? "" : str5;
        java.lang.String str7 = this.getFieldNames;
        java.lang.String str8 = this.AuCTelauCTel;
        java.lang.String str9 = this.iwGUEr;
        java.lang.String str10 = str9 == null ? "" : str9;
        java.lang.String str11 = this.isConnected;
        return new WalletCoinAssetEntity(strDbNXlk, jOLrzqt, strFIwbmz, strCopydefault, strAhwBna, str, 0, str2, iAhwBna, str4, str6, str7, str8, str10, str11 == null ? "" : str11, 64, null);
    }

    /* JADX INFO: renamed from: o.bqB$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bqB.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.xYb.convertToBigIntegerString$default(java.lang.String, boolean, java.math.RoundingMode, int, java.lang.Object):java.lang.String */
        public final C10525bqB AEQbTJ(@NotNull TokenAsset tokenAsset, @NotNull C10854bwM c10854bwM, @NotNull AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(tokenAsset, "");
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            C10525bqB c10525bqB = new C10525bqB(c10854bwM, abstractC12782ctV, null);
            c10525bqB.EZpvd(C54862xYb.convertToBigIntegerString$default(tokenAsset.getCoinAmount(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigDecimalString$default(tokenAsset.getCurrencyAmount(), false, 1, null), "", tokenAsset.getAddress(), tokenAsset.getCoinAmountDec(), tokenAsset.getUnPnl(), tokenAsset.getUnPnlYield(), tokenAsset.getSpotBalance(), tokenAsset.getHoldAvgPrice());
            c10525bqB.gEmmrt(tokenAsset.getPlatformName());
            c10525bqB.AkhnZx(tokenAsset.getWalletInvestmentType());
            return c10525bqB;
        }

        public static /* synthetic */ C10525bqB fromCoinMeta$default(StateListAnimator stateListAnimator, C10854bwM c10854bwM, AbstractC12782ctV abstractC12782ctV, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                str = null;
            }
            return stateListAnimator.AEQbTJ(c10854bwM, abstractC12782ctV, str);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025 A[PHI: r15
  0x0025: PHI (r15v1 java.lang.String) = (r15v0 java.lang.String), (r15v3 java.lang.String) binds: [B:3:0x000e, B:8:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C10525bqB AEQbTJ(@NotNull C10854bwM c10854bwM, @NotNull AbstractC12782ctV abstractC12782ctV, java.lang.String str) {
            java.lang.String str2;
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            C10525bqB c10525bqB = new C10525bqB(c10854bwM, abstractC12782ctV, null);
            if (str != null) {
                str2 = str;
            } else {
                ChainAddress chainAddressOLrzqt = abstractC12782ctV.OLrzqt(c10854bwM.AEQbTJ(), (java.lang.Integer) null);
                str = chainAddressOLrzqt != null ? chainAddressOLrzqt.getAddress() : null;
                if (str == null) {
                    str2 = "";
                }
            }
            c10525bqB.EZpvd("0", "0", "0", str2, "0", null, null, null, null);
            return c10525bqB;
        }

        public final C10525bqB copydefault(@NotNull WalletCoinAssetEntity walletCoinAssetEntity, @NotNull C10854bwM c10854bwM, @NotNull AbstractC12782ctV abstractC12782ctV) {
            Intrinsics.checkNotNullParameter(walletCoinAssetEntity, "");
            Intrinsics.checkNotNullParameter(c10854bwM, "");
            Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
            C10525bqB c10525bqB = new C10525bqB(c10854bwM, abstractC12782ctV, null);
            c10525bqB.EZpvd(walletCoinAssetEntity.getAmountInt(), walletCoinAssetEntity.getCcyAmount(), walletCoinAssetEntity.getDailyChange(), walletCoinAssetEntity.getAddress(), walletCoinAssetEntity.getAmount(), walletCoinAssetEntity.getUnPnl(), walletCoinAssetEntity.getUnPnlYield(), walletCoinAssetEntity.getSpotBalance(), walletCoinAssetEntity.getHoldAvgPrice());
            c10525bqB.gEmmrt(walletCoinAssetEntity.getPlatformName());
            c10525bqB.AkhnZx(walletCoinAssetEntity.getWalletInvestmentType());
            return c10525bqB;
        }
    }
}
