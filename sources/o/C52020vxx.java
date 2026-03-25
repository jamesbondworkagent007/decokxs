package o;

import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradingbot.impl.minimumInvest.domain.FetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1;
import com.okinc.tradingbot.impl.minimumInvest.domain.FetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1;
import com.okinc.tradingbot.impl.minimumInvest.domain.FetchMinimumInvestAmountUseCase$calculateRecurringMinInvest$1;
import com.okinc.tradingbot.impl.minimumInvest.domain.FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2;
import com.okinc.tradingbot.impl.minimumInvest.domain.FetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1;
import com.okinc.tradingbot.impl.minimumInvest.domain.FetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1;
import com.okinc.tradingbot.impl.minimumInvest.domain.FetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1;
import com.okinc.tradingbot.impl.minimumInvest.domain.FetchMinimumInvestAmountUseCase$execute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CoinRatioParam;
import com.okinc.unify_trade.biz.MinInvestReq;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.biz.subscribe.LimitPriceData;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.bot.constant.SubArbitrageType4Remote;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import o.AbstractC43419rot;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vxx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C52020vxx extends vNH<Activity, ActionBar> {
    public final InterfaceC50055vAf AEQbTJ;
    public final wTM KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C52020vxx(@NotNull InterfaceC50055vAf interfaceC50055vAf, @NotNull wTM wtm, @NotNull CoroutineDispatcher coroutineDispatcher) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(interfaceC50055vAf, "");
        Intrinsics.checkNotNullParameter(wtm, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = interfaceC50055vAf;
        this.KWHzl = wtm;
    }

    /* JADX INFO: renamed from: o.vxx$Activity */
    /* JADX INFO: loaded from: classes19.dex */
    public interface Activity {

        /* JADX INFO: renamed from: o.vxx$Activity$LoaderManager */
        public static final class LoaderManager implements Activity {
            public final boolean AEQbTJ;
            public final java.lang.String AYXKKw;
            public final int AhwBna;
            public final java.lang.String AkhnZx;
            public final java.lang.String DbNXlk;
            public final java.lang.String EZpvd;
            public final java.lang.String KWHzl;
            public final java.lang.String OLrzqt;
            public final java.lang.String copydefault;
            public final java.lang.String djBIcL;
            public final java.lang.String fetchVPNInfo;
            public final java.lang.String gEmmrt;
            public final java.lang.String isConnected;
            public final java.lang.String valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AEQbTJ() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AYXKKw() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AhwBna() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String OLrzqt() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoaderManager copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, int i, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, boolean z, java.lang.String str11, java.lang.String str12) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                return new LoaderManager(str, str2, str3, str4, str5, str6, i, str7, str8, str9, str10, z, str11, str12);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String djBIcL() {
                return this.isConnected;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoaderManager)) {
                    return false;
                }
                LoaderManager loaderManager = (LoaderManager) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) loaderManager.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) loaderManager.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) loaderManager.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) loaderManager.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) loaderManager.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) loaderManager.valueOf) && this.AhwBna == loaderManager.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) loaderManager.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) loaderManager.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) loaderManager.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) loaderManager.AkhnZx) && this.AEQbTJ == loaderManager.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) loaderManager.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) loaderManager.AYXKKw);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String fetchVPNInfo() {
                return this.AkhnZx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String gEmmrt() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.KWHzl.hashCode();
                int iHashCode2 = this.copydefault.hashCode();
                java.lang.String str = this.DbNXlk;
                int iHashCode3 = str == null ? 0 : str.hashCode();
                int iHashCode4 = this.EZpvd.hashCode();
                int iHashCode5 = this.gEmmrt.hashCode();
                int iHashCode6 = this.valueOf.hashCode();
                int iHashCode7 = java.lang.Integer.hashCode(this.AhwBna);
                java.lang.String str2 = this.djBIcL;
                int iHashCode8 = str2 == null ? 0 : str2.hashCode();
                java.lang.String str3 = this.isConnected;
                int iHashCode9 = str3 == null ? 0 : str3.hashCode();
                java.lang.String str4 = this.fetchVPNInfo;
                int iHashCode10 = str4 == null ? 0 : str4.hashCode();
                java.lang.String str5 = this.AkhnZx;
                int iHashCode11 = str5 == null ? 0 : str5.hashCode();
                int iHashCode12 = java.lang.Boolean.hashCode(this.AEQbTJ);
                java.lang.String str6 = this.OLrzqt;
                int iHashCode13 = str6 == null ? 0 : str6.hashCode();
                java.lang.String str7 = this.AYXKKw;
                return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str7 != null ? str7.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "SpotGrid(instId=" + this.KWHzl + ", instType=" + this.copydefault + ", tradeQuoteCcy=" + this.DbNXlk + ", gridNum=" + this.EZpvd + ", maxPx=" + this.gEmmrt + ", minPx=" + this.valueOf + ", runType=" + this.AhwBna + ", sourceAlgoId=" + this.djBIcL + ", sourceCcy=" + this.isConnected + ", triggerStrategy=" + this.fetchVPNInfo + ", triggerPx=" + this.AkhnZx + ", autoReserve=" + this.AEQbTJ + ", investmentData=" + this.OLrzqt + ", perGridProfitRatio=" + this.AYXKKw + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int valueOf() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String values() {
                return this.fetchVPNInfo;
            }

            public LoaderManager(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, int i, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, boolean z, java.lang.String str11, java.lang.String str12) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                this.KWHzl = str;
                this.copydefault = str2;
                this.DbNXlk = str3;
                this.EZpvd = str4;
                this.gEmmrt = str5;
                this.valueOf = str6;
                this.AhwBna = i;
                this.djBIcL = str7;
                this.isConnected = str8;
                this.fetchVPNInfo = str9;
                this.AkhnZx = str10;
                this.AEQbTJ = z;
                this.OLrzqt = str11;
                this.AYXKKw = str12;
            }
        }

        /* JADX INFO: renamed from: o.vxx$Activity$Application */
        public static final class Application implements Activity {
            public final java.lang.Boolean AEQbTJ;
            public final java.lang.String AYXKKw;
            public final java.lang.String AhwBna;
            public final java.lang.String AkhnZx;
            public final int DbNXlk;
            public final boolean EZpvd;
            public final java.lang.String KWHzl;
            public final java.lang.String OLrzqt;
            public final java.lang.String copydefault;
            public final java.lang.String djBIcL;
            public final java.lang.String fARcdN;
            public final java.lang.String fetchVPNInfo;
            public final java.lang.String gEmmrt;
            public final java.lang.String isConnected;
            public final java.lang.String valueOf;
            public final java.lang.String values;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AYXKKw() {
                return this.fetchVPNInfo;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AhwBna() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AkhnZx() {
                return this.fARcdN;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final int DbNXlk() {
                return this.DbNXlk;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Boolean copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, int i, @NotNull java.lang.String str7, @NotNull java.lang.String str8, java.lang.Boolean bool, java.lang.String str9, java.lang.String str10, java.lang.String str11, boolean z, java.lang.String str12, java.lang.String str13) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                return new Application(str, str2, str3, str4, str5, str6, i, str7, str8, bool, str9, str10, str11, z, str12, str13);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String djBIcL() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Application)) {
                    return false;
                }
                Application application = (Application) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) application.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) application.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) application.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) application.valueOf) && this.DbNXlk == application.DbNXlk && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) application.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) application.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.fARcdN, (java.lang.Object) application.fARcdN) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) application.values) && this.EZpvd == application.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) application.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) application.fetchVPNInfo);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String fetchVPNInfo() {
                return this.AkhnZx;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String gEmmrt() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.OLrzqt.hashCode();
                int iHashCode2 = this.AhwBna.hashCode();
                java.lang.String str = this.isConnected;
                int iHashCode3 = str == null ? 0 : str.hashCode();
                int iHashCode4 = this.KWHzl.hashCode();
                int iHashCode5 = this.djBIcL.hashCode();
                int iHashCode6 = this.valueOf.hashCode();
                int iHashCode7 = java.lang.Integer.hashCode(this.DbNXlk);
                int iHashCode8 = this.AYXKKw.hashCode();
                int iHashCode9 = this.copydefault.hashCode();
                java.lang.Boolean bool = this.AEQbTJ;
                int iHashCode10 = bool == null ? 0 : bool.hashCode();
                java.lang.String str2 = this.AkhnZx;
                int iHashCode11 = str2 == null ? 0 : str2.hashCode();
                java.lang.String str3 = this.fARcdN;
                int iHashCode12 = str3 == null ? 0 : str3.hashCode();
                java.lang.String str4 = this.values;
                int iHashCode13 = str4 == null ? 0 : str4.hashCode();
                int iHashCode14 = java.lang.Boolean.hashCode(this.EZpvd);
                java.lang.String str5 = this.gEmmrt;
                int iHashCode15 = str5 == null ? 0 : str5.hashCode();
                java.lang.String str6 = this.fetchVPNInfo;
                return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str6 == null ? 0 : str6.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ContractGrid(instId=" + this.OLrzqt + ", instType=" + this.AhwBna + ", tradeQuoteCcy=" + this.isConnected + ", gridNum=" + this.KWHzl + ", maxPx=" + this.djBIcL + ", minPx=" + this.valueOf + ", runType=" + this.DbNXlk + ", lever=" + this.AYXKKw + ", direction=" + this.copydefault + ", basePos=" + this.AEQbTJ + ", sourceAlgoId=" + this.AkhnZx + ", triggerStrategy=" + this.fARcdN + ", triggerPx=" + this.values + ", autoReserve=" + this.EZpvd + ", investmentData=" + this.gEmmrt + ", perGridProfitRatio=" + this.fetchVPNInfo + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String valueOf() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String values() {
                return this.values;
            }

            public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, int i, @NotNull java.lang.String str7, @NotNull java.lang.String str8, java.lang.Boolean bool, java.lang.String str9, java.lang.String str10, java.lang.String str11, boolean z, java.lang.String str12, java.lang.String str13) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                this.OLrzqt = str;
                this.AhwBna = str2;
                this.isConnected = str3;
                this.KWHzl = str4;
                this.djBIcL = str5;
                this.valueOf = str6;
                this.DbNXlk = i;
                this.AYXKKw = str7;
                this.copydefault = str8;
                this.AEQbTJ = bool;
                this.AkhnZx = str9;
                this.fARcdN = str10;
                this.values = str11;
                this.EZpvd = z;
                this.gEmmrt = str12;
                this.fetchVPNInfo = str13;
            }
        }

        /* JADX INFO: renamed from: o.vxx$Activity$Fragment */
        public static final class Fragment implements Activity {
            public final java.lang.String AEQbTJ;
            public final java.lang.String AhwBna;
            public final java.lang.String EZpvd;
            public final java.lang.String KWHzl;
            public final java.lang.String OLrzqt;
            public final java.lang.String copydefault;
            public final boolean djBIcL;
            public final java.lang.String gEmmrt;
            public final java.lang.String valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Fragment EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                return new Fragment(str, str2, str3, str4, str5, str6, str7, str8, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean copydefault() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String djBIcL() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Fragment)) {
                    return false;
                }
                Fragment fragment = (Fragment) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) fragment.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) fragment.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) fragment.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) fragment.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) fragment.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) fragment.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) fragment.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) fragment.gEmmrt) && this.djBIcL == fragment.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.copydefault.hashCode();
                int iHashCode2 = this.EZpvd.hashCode();
                java.lang.String str = this.valueOf;
                int iHashCode3 = str == null ? 0 : str.hashCode();
                int iHashCode4 = this.AEQbTJ.hashCode();
                java.lang.String str2 = this.KWHzl;
                return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.OLrzqt.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.djBIcL);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "SpotDca(instId=" + this.copydefault + ", instType=" + this.EZpvd + ", tradeQuoteCcy=" + this.valueOf + ", maxSafetyOrds=" + this.AEQbTJ + ", pxSteps=" + this.KWHzl + ", pxStepsMult=" + this.OLrzqt + ", volMult=" + this.AhwBna + ", safetyOrdRatio=" + this.gEmmrt + ", reserveFunds=" + this.djBIcL + ")";
            }

            public Fragment(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                this.copydefault = str;
                this.EZpvd = str2;
                this.valueOf = str3;
                this.AEQbTJ = str4;
                this.KWHzl = str5;
                this.OLrzqt = str6;
                this.AhwBna = str7;
                this.gEmmrt = str8;
                this.djBIcL = z;
            }
        }

        /* JADX INFO: renamed from: o.vxx$Activity$ActionBar */
        public static final class ActionBar implements Activity {
            public final java.lang.String AEQbTJ;
            public final java.lang.String AYXKKw;
            public final java.lang.String AhwBna;
            public final java.lang.String EZpvd;
            public final java.lang.String KWHzl;
            public final java.lang.String OLrzqt;
            public final java.lang.String copydefault;
            public final java.lang.String djBIcL;
            public final java.lang.String gEmmrt;
            public final java.lang.String isConnected;
            public final boolean valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String AEQbTJ() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AYXKKw() {
                return this.isConnected;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AhwBna() {
                return this.AhwBna;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                Intrinsics.checkNotNullParameter(str9, "");
                Intrinsics.checkNotNullParameter(str10, "");
                return new ActionBar(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String djBIcL() {
                return this.AYXKKw;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ActionBar)) {
                    return false;
                }
                ActionBar actionBar = (ActionBar) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) actionBar.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) actionBar.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) actionBar.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) actionBar.isConnected) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) actionBar.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && this.valueOf == actionBar.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.KWHzl.hashCode();
                int iHashCode2 = this.AEQbTJ.hashCode();
                java.lang.String str = this.djBIcL;
                return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.OLrzqt.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + java.lang.Boolean.hashCode(this.valueOf);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ContractDca(instId=" + this.KWHzl + ", instType=" + this.AEQbTJ + ", tradeQuoteCcy=" + this.djBIcL + ", maxSafetyOrds=" + this.OLrzqt + ", pxSteps=" + this.gEmmrt + ", pxStepsMult=" + this.AYXKKw + ", volMult=" + this.isConnected + ", safetyOrdRatio=" + this.AhwBna + ", direction=" + this.EZpvd + ", lever=" + this.copydefault + ", reserveFunds=" + this.valueOf + ")";
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String valueOf() {
                return this.gEmmrt;
            }

            public ActionBar(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, boolean z) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str6, "");
                Intrinsics.checkNotNullParameter(str7, "");
                Intrinsics.checkNotNullParameter(str8, "");
                Intrinsics.checkNotNullParameter(str9, "");
                Intrinsics.checkNotNullParameter(str10, "");
                this.KWHzl = str;
                this.AEQbTJ = str2;
                this.djBIcL = str3;
                this.OLrzqt = str4;
                this.gEmmrt = str5;
                this.AYXKKw = str6;
                this.isConnected = str7;
                this.AhwBna = str8;
                this.EZpvd = str9;
                this.copydefault = str10;
                this.valueOf = z;
            }
        }

        /* JADX INFO: renamed from: o.vxx$Activity$StateListAnimator */
        public static final class StateListAnimator implements Activity {
            public final java.lang.String AEQbTJ;
            public final java.lang.String EZpvd;
            public final java.lang.String KWHzl;
            public final java.lang.String OLrzqt;
            public final java.util.List<CoinRatioParam> copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.vxx$Activity$StateListAnimator */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.KWHzl;
                }
                if ((i & 2) != 0) {
                    str2 = stateListAnimator.OLrzqt;
                }
                java.lang.String str5 = str2;
                if ((i & 4) != 0) {
                    str3 = stateListAnimator.EZpvd;
                }
                java.lang.String str6 = str3;
                if ((i & 8) != 0) {
                    str4 = stateListAnimator.AEQbTJ;
                }
                java.lang.String str7 = str4;
                if ((i & 16) != 0) {
                    list = stateListAnimator.copydefault;
                }
                return stateListAnimator.EZpvd(str, str5, str6, str7, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<CoinRatioParam> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(list, "");
                return new StateListAnimator(str, str2, str3, str4, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.List<CoinRatioParam> OLrzqt() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StateListAnimator)) {
                    return false;
                }
                StateListAnimator stateListAnimator = (StateListAnimator) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) stateListAnimator.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) stateListAnimator.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) stateListAnimator.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.KWHzl.hashCode();
                int iHashCode2 = this.OLrzqt.hashCode();
                java.lang.String str = this.EZpvd;
                return (((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Recurring(instId=" + this.KWHzl + ", instType=" + this.OLrzqt + ", tradeQuoteCcy=" + this.EZpvd + ", investCcy=" + this.AEQbTJ + ", recurringList=" + this.copydefault + ")";
            }

            public StateListAnimator(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<CoinRatioParam> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.KWHzl = str;
                this.OLrzqt = str2;
                this.EZpvd = str3;
                this.AEQbTJ = str4;
                this.copydefault = list;
            }
        }

        /* JADX INFO: renamed from: o.vxx$Activity$TaskDescription */
        public static final class TaskDescription implements Activity {
            public final java.lang.String AEQbTJ;
            public final java.lang.String EZpvd;
            public final java.util.List<CoinRatioParam> KWHzl;
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.vxx$Activity$TaskDescription */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = taskDescription.EZpvd;
                }
                if ((i & 2) != 0) {
                    str2 = taskDescription.copydefault;
                }
                if ((i & 4) != 0) {
                    str3 = taskDescription.AEQbTJ;
                }
                if ((i & 8) != 0) {
                    list = taskDescription.KWHzl;
                }
                return taskDescription.KWHzl(str, str2, str3, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.util.List<CoinRatioParam> AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.util.List<CoinRatioParam> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(list, "");
                return new TaskDescription(str, str2, str3, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TaskDescription)) {
                    return false;
                }
                TaskDescription taskDescription = (TaskDescription) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.EZpvd.hashCode();
                int iHashCode2 = this.copydefault.hashCode();
                java.lang.String str = this.AEQbTJ;
                return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "SmartPortfolio(instId=" + this.EZpvd + ", instType=" + this.copydefault + ", tradeQuoteCcy=" + this.AEQbTJ + ", portfolioList=" + this.KWHzl + ")";
            }

            public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.util.List<CoinRatioParam> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.EZpvd = str;
                this.copydefault = str2;
                this.AEQbTJ = str3;
                this.KWHzl = list;
            }
        }

        /* JADX INFO: renamed from: o.vxx$Activity$Activity, reason: collision with other inner class name */
        public static final class C0987Activity implements Activity {
            public final java.lang.String AEQbTJ;
            public final java.lang.String AYXKKw;
            public final java.lang.String AhwBna;
            public final java.lang.String EZpvd;
            public final java.lang.String KWHzl;
            public final java.lang.String OLrzqt;
            public final java.lang.String copydefault;
            public final java.lang.Float djBIcL;
            public final java.lang.String fetchVPNInfo;
            public final SubArbitrageType4Remote gEmmrt;
            public final java.lang.String valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String AhwBna() {
                return this.valueOf;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0987Activity EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.Float f, java.lang.String str6, @NotNull java.lang.String str7, java.lang.String str8, SubArbitrageType4Remote subArbitrageType4Remote, java.lang.String str9) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str7, "");
                return new C0987Activity(str, str2, str3, str4, str5, f, str6, str7, str8, subArbitrageType4Remote, str9);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SubArbitrageType4Remote OLrzqt() {
                return this.gEmmrt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Float copydefault() {
                return this.djBIcL;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0987Activity)) {
                    return false;
                }
                C0987Activity c0987Activity = (C0987Activity) obj;
                return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c0987Activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c0987Activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.fetchVPNInfo, (java.lang.Object) c0987Activity.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c0987Activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c0987Activity.KWHzl) && Intrinsics.EZpvd(this.djBIcL, c0987Activity.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c0987Activity.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c0987Activity.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c0987Activity.AYXKKw) && this.gEmmrt == c0987Activity.gEmmrt && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c0987Activity.AhwBna);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.EZpvd.hashCode();
                int iHashCode2 = this.copydefault.hashCode();
                java.lang.String str = this.fetchVPNInfo;
                int iHashCode3 = str == null ? 0 : str.hashCode();
                int iHashCode4 = this.OLrzqt.hashCode();
                int iHashCode5 = this.KWHzl.hashCode();
                java.lang.Float f = this.djBIcL;
                int iHashCode6 = f == null ? 0 : f.hashCode();
                java.lang.String str2 = this.AEQbTJ;
                int iHashCode7 = str2 == null ? 0 : str2.hashCode();
                int iHashCode8 = this.valueOf.hashCode();
                java.lang.String str3 = this.AYXKKw;
                int iHashCode9 = str3 == null ? 0 : str3.hashCode();
                SubArbitrageType4Remote subArbitrageType4Remote = this.gEmmrt;
                int iHashCode10 = subArbitrageType4Remote == null ? 0 : subArbitrageType4Remote.hashCode();
                java.lang.String str4 = this.AhwBna;
                return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str4 != null ? str4.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "SmartArbitrage(instId=" + this.EZpvd + ", instType=" + this.copydefault + ", tradeQuoteCcy=" + this.fetchVPNInfo + ", instFamily=" + this.OLrzqt + ", arbType=" + this.KWHzl + ", leveragePrincipal=" + this.djBIcL + ", algoId=" + this.AEQbTJ + ", totalAmt=" + this.valueOf + ", spreadRatio=" + this.AYXKKw + ", subArbTypes=" + this.gEmmrt + ", stopType=" + this.AhwBna + ")";
            }

            public C0987Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, java.lang.Float f, java.lang.String str6, @NotNull java.lang.String str7, java.lang.String str8, SubArbitrageType4Remote subArbitrageType4Remote, java.lang.String str9) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(str4, "");
                Intrinsics.checkNotNullParameter(str5, "");
                Intrinsics.checkNotNullParameter(str7, "");
                this.EZpvd = str;
                this.copydefault = str2;
                this.fetchVPNInfo = str3;
                this.OLrzqt = str4;
                this.KWHzl = str5;
                this.djBIcL = f;
                this.AEQbTJ = str6;
                this.valueOf = str7;
                this.AYXKKw = str8;
                this.gEmmrt = subArbitrageType4Remote;
                this.AhwBna = str9;
            }
        }
    }

    /* JADX INFO: renamed from: o.vxx$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Double.valueOf(C33129mqd.AEQbTJ(((CoinRatioParam) t).getRatio())), java.lang.Double.valueOf(C33129mqd.AEQbTJ(((CoinRatioParam) t2).getRatio())));
        }
    }

    /* JADX INFO: renamed from: o.vxx$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = actionBar.KWHzl;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = actionBar.OLrzqt;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = actionBar.AEQbTJ;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = actionBar.EZpvd;
            }
            return actionBar.OLrzqt(str, str6, str7, str8, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str, str2, str3, str4, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) actionBar.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) actionBar.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) actionBar.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) actionBar.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) actionBar.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.copydefault.hashCode();
            java.lang.String str = this.KWHzl;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.OLrzqt;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.AEQbTJ;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.EZpvd;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Output(minInvestment=" + this.copydefault + ", minQuoteSz=" + this.KWHzl + ", singleAmt=" + this.OLrzqt + ", errorMessage=" + this.AEQbTJ + ", maxInvestment=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            Intrinsics.checkNotNullParameter(str, "");
            this.copydefault = str;
            this.KWHzl = str2;
            this.OLrzqt = str3;
            this.AEQbTJ = str4;
            this.EZpvd = str5;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:188) call: o.vxx.ActionBar.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ ActionBar(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.vNH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object OLrzqt(@NotNull Activity activity, @NotNull Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        FetchMinimumInvestAmountUseCase$execute$1 fetchMinimumInvestAmountUseCase$execute$1;
        if (continuation instanceof FetchMinimumInvestAmountUseCase$execute$1) {
            fetchMinimumInvestAmountUseCase$execute$1 = (FetchMinimumInvestAmountUseCase$execute$1) continuation;
            int i = fetchMinimumInvestAmountUseCase$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchMinimumInvestAmountUseCase$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchMinimumInvestAmountUseCase$execute$1 = new FetchMinimumInvestAmountUseCase$execute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = fetchMinimumInvestAmountUseCase$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        try {
            switch (fetchMinimumInvestAmountUseCase$execute$1.label) {
                case 0:
                    C56391yDq.AEQbTJ(objOLrzqt);
                    if (activity instanceof Activity.LoaderManager) {
                        fetchMinimumInvestAmountUseCase$execute$1.label = 1;
                        objOLrzqt = copydefault((Activity.LoaderManager) activity, fetchMinimumInvestAmountUseCase$execute$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        return (ActionBar) objOLrzqt;
                    }
                    if (activity instanceof Activity.Application) {
                        fetchMinimumInvestAmountUseCase$execute$1.label = 2;
                        objOLrzqt = OLrzqt((Activity.Application) activity, (Continuation<? super ActionBar>) fetchMinimumInvestAmountUseCase$execute$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        return (ActionBar) objOLrzqt;
                    }
                    if (activity instanceof Activity.Fragment) {
                        fetchMinimumInvestAmountUseCase$execute$1.label = 3;
                        objOLrzqt = KWHzl((Activity.Fragment) activity, (Continuation<? super ActionBar>) fetchMinimumInvestAmountUseCase$execute$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        return (ActionBar) objOLrzqt;
                    }
                    if (activity instanceof Activity.ActionBar) {
                        fetchMinimumInvestAmountUseCase$execute$1.label = 4;
                        objOLrzqt = OLrzqt((Activity.ActionBar) activity, (Continuation<? super ActionBar>) fetchMinimumInvestAmountUseCase$execute$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        return (ActionBar) objOLrzqt;
                    }
                    if (activity instanceof Activity.StateListAnimator) {
                        fetchMinimumInvestAmountUseCase$execute$1.label = 5;
                        objOLrzqt = EZpvd((Activity.StateListAnimator) activity, (Continuation<? super ActionBar>) fetchMinimumInvestAmountUseCase$execute$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        return (ActionBar) objOLrzqt;
                    }
                    if (activity instanceof Activity.TaskDescription) {
                        fetchMinimumInvestAmountUseCase$execute$1.label = 6;
                        objOLrzqt = EZpvd((Activity.TaskDescription) activity, (Continuation<? super ActionBar>) fetchMinimumInvestAmountUseCase$execute$1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        return (ActionBar) objOLrzqt;
                    }
                    if (!(activity instanceof Activity.C0987Activity)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fetchMinimumInvestAmountUseCase$execute$1.label = 7;
                    objOLrzqt = OLrzqt((Activity.C0987Activity) activity, (Continuation<? super ActionBar>) fetchMinimumInvestAmountUseCase$execute$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    return (ActionBar) objOLrzqt;
                case 1:
                    C56391yDq.AEQbTJ(objOLrzqt);
                    return (ActionBar) objOLrzqt;
                case 2:
                    C56391yDq.AEQbTJ(objOLrzqt);
                    return (ActionBar) objOLrzqt;
                case 3:
                    C56391yDq.AEQbTJ(objOLrzqt);
                    return (ActionBar) objOLrzqt;
                case 4:
                    C56391yDq.AEQbTJ(objOLrzqt);
                    return (ActionBar) objOLrzqt;
                case 5:
                    C56391yDq.AEQbTJ(objOLrzqt);
                    return (ActionBar) objOLrzqt;
                case 6:
                    C56391yDq.AEQbTJ(objOLrzqt);
                    return (ActionBar) objOLrzqt;
                case 7:
                    C56391yDq.AEQbTJ(objOLrzqt);
                    return (ActionBar) objOLrzqt;
                default:
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (java.lang.Exception e) {
            java.lang.String message = e.getMessage();
            if (message == null) {
                message = "Unknown error occurred";
            }
            return new ActionBar("0", null, null, message, null, 22, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7 A[Catch: all -> 0x0100, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:25:0x00ab, B:27:0x00b3, B:29:0x00b9, B:30:0x00c7), top: B:71:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(Activity.LoaderManager loaderManager, Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        FetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1 fetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1;
        java.lang.String str;
        java.lang.String str2;
        Activity.LoaderManager loaderManager2;
        InterfaceC50055vAf interfaceC50055vAf;
        java.lang.String strOLrzqt;
        java.lang.String strEZpvd;
        java.lang.String strAEQbTJ;
        java.lang.String strAhwBna;
        int iValueOf;
        java.lang.String strCopydefault;
        java.lang.String strAYXKKw;
        java.lang.String strGEmmrt;
        java.lang.String strValues;
        java.lang.String strDjBIcL;
        java.lang.Boolean boolKWHzl;
        java.lang.String strFetchVPNInfo;
        java.lang.String str3;
        java.lang.String str4;
        AbstractC43419rot actionBar;
        MinInvestResp minInvestResp;
        java.lang.String strDjBIcL2;
        java.lang.String minQuoteSz;
        ResponseData responseData;
        if (continuation instanceof FetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1) {
            fetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1 = (FetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1) continuation;
            int i = fetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1 = new FetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1(this, continuation);
            }
        }
        java.lang.Object obj = fetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                interfaceC50055vAf = this.AEQbTJ;
                strOLrzqt = loaderManager.OLrzqt();
                strEZpvd = loaderManager.EZpvd();
                strAEQbTJ = loaderManager.AEQbTJ();
                strAhwBna = loaderManager.AhwBna();
                iValueOf = loaderManager.valueOf();
                strCopydefault = loaderManager.copydefault();
                strAYXKKw = loaderManager.AYXKKw();
                strGEmmrt = loaderManager.gEmmrt();
                strValues = loaderManager.values();
                strDjBIcL = loaderManager.djBIcL();
                boolKWHzl = C56443yFo.KWHzl(loaderManager.KWHzl());
                strFetchVPNInfo = loaderManager.fetchVPNInfo();
                fetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1.L$0 = loaderManager;
                fetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1.label = 1;
                str3 = AbstractC43419rot.TAG;
                str4 = "Error: ";
            } catch (java.lang.Throwable th) {
                th = th;
                str = AbstractC43419rot.TAG;
                str2 = "Error: ";
            }
            try {
                java.lang.Object objOLrzqt = interfaceC50055vAf.OLrzqt(null, strOLrzqt, strEZpvd, strAEQbTJ, strAhwBna, iValueOf, null, null, strCopydefault, strAYXKKw, strGEmmrt, null, null, strValues, strDjBIcL, boolKWHzl, strFetchVPNInfo, fetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                obj = objOLrzqt;
                loaderManager2 = loaderManager;
                responseData = (ResponseData) obj;
                if (responseData.getCode() != 0) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    str2 = str4;
                    sb.append(str2);
                    sb.append(responseData);
                    str = str3;
                    pUU.copydefault(str, sb.toString());
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                str = str3;
                str2 = str4;
                loaderManager2 = loaderManager;
                pUU.copydefault(str, str2 + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                minInvestResp = (MinInvestResp) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar.AEQbTJ());
                strDjBIcL2 = loaderManager2.djBIcL();
                if (strDjBIcL2 == null) {
                    if (minInvestResp == null) {
                    }
                }
                if (minQuoteSz == null) {
                    minQuoteSz = "0";
                }
                return new ActionBar(minQuoteSz, minInvestResp != null ? minInvestResp.getMinQuoteSz() : null, minInvestResp != null ? minInvestResp.getSingleAmt() : null, null, null, 24, null);
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            loaderManager2 = (Activity.LoaderManager) fetchMinimumInvestAmountUseCase$calculateSpotGridMinInvest$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                str3 = AbstractC43419rot.TAG;
                str4 = "Error: ";
                try {
                    responseData = (ResponseData) obj;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        java.lang.Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        str2 = str4;
                        try {
                            sb2.append(str2);
                            sb2.append(responseData);
                            str = str3;
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            str = str3;
                        }
                        try {
                            pUU.copydefault(str, sb2.toString());
                            actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            pUU.copydefault(str, str2 + th);
                            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                        }
                    }
                } catch (java.lang.Throwable th5) {
                    th = th5;
                    str = str3;
                    str2 = str4;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                str = AbstractC43419rot.TAG;
                str2 = "Error: ";
                pUU.copydefault(str, str2 + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                minInvestResp = (MinInvestResp) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar.AEQbTJ());
                strDjBIcL2 = loaderManager2.djBIcL();
                if (strDjBIcL2 == null) {
                }
                if (minQuoteSz == null) {
                }
                return new ActionBar(minQuoteSz, minInvestResp != null ? minInvestResp.getMinQuoteSz() : null, minInvestResp != null ? minInvestResp.getSingleAmt() : null, null, null, 24, null);
            }
        }
        minInvestResp = (MinInvestResp) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar.AEQbTJ());
        strDjBIcL2 = loaderManager2.djBIcL();
        if (strDjBIcL2 == null || strDjBIcL2.length() == 0) {
            minQuoteSz = minInvestResp == null ? minInvestResp.getMinQuoteSz() : null;
        } else if (minInvestResp != null) {
            minQuoteSz = minInvestResp.getMinSourceSz();
        }
        if (minQuoteSz == null || minQuoteSz.length() == 0) {
            minQuoteSz = "0";
        }
        return new ActionBar(minQuoteSz, minInvestResp != null ? minInvestResp.getMinQuoteSz() : null, minInvestResp != null ? minInvestResp.getSingleAmt() : null, null, null, 24, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Activity.Application application, Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        FetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1 fetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1;
        java.lang.String str;
        java.lang.String str2;
        AbstractC43419rot actionBar;
        MinInvestResp minInvestResp;
        java.lang.String minInvestment;
        java.lang.String str3;
        java.lang.String str4;
        if (continuation instanceof FetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1) {
            fetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1 = (FetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1) continuation;
            int i = fetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1 = new FetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1(this, continuation);
            }
        }
        java.lang.Object obj = fetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1.label;
        java.lang.String str5 = "Error: ";
        java.lang.String str6 = AbstractC43419rot.TAG;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC50055vAf interfaceC50055vAf = this.AEQbTJ;
                java.lang.String strOLrzqt = application.OLrzqt();
                java.lang.String strAEQbTJ = application.AEQbTJ();
                java.lang.String strEZpvd = application.EZpvd();
                java.lang.String strDjBIcL = application.djBIcL();
                java.lang.String strGEmmrt = application.gEmmrt();
                int iDbNXlk = application.DbNXlk();
                java.lang.String strValueOf = application.valueOf();
                java.lang.Boolean boolCopydefault = application.copydefault();
                java.lang.String strAhwBna = application.AhwBna();
                java.lang.String strAYXKKw = application.AYXKKw();
                java.lang.String strFetchVPNInfo = application.fetchVPNInfo();
                java.lang.String strAkhnZx = application.AkhnZx();
                java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(application.KWHzl());
                java.lang.String strValues = application.values();
                fetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1.label = 1;
                str3 = AbstractC43419rot.TAG;
                str6 = strAhwBna;
                str4 = "Error: ";
                str5 = strAYXKKw;
                try {
                    java.lang.Object objOLrzqt = interfaceC50055vAf.OLrzqt(strOLrzqt, strAEQbTJ, strEZpvd, strDjBIcL, strGEmmrt, iDbNXlk, strValueOf, boolCopydefault, str6, str5, strFetchVPNInfo, null, null, strAkhnZx, null, boolKWHzl, strValues, fetchMinimumInvestAmountUseCase$calculateContractGridMinInvest$1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    obj = objOLrzqt;
                } catch (java.lang.Throwable th) {
                    th = th;
                    str = str3;
                    str2 = str4;
                    pUU.copydefault(str, str2 + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    minInvestResp = (MinInvestResp) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar.AEQbTJ());
                    if (minInvestResp != null) {
                        minInvestment = "0";
                    }
                    return new ActionBar(minInvestment, minInvestResp == null ? minInvestResp.getMinQuoteSz() : null, minInvestResp == null ? minInvestResp.getSingleAmt() : null, null, null, 24, null);
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                str3 = AbstractC43419rot.TAG;
                str4 = "Error: ";
            }
            ResponseData responseData = (ResponseData) obj;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                java.lang.Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                str2 = str4;
                try {
                    sb.append(str2);
                    sb.append(responseData);
                    str = str3;
                    try {
                        pUU.copydefault(str, sb.toString());
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        pUU.copydefault(str, str2 + th);
                        actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    str = str3;
                }
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            str = str6;
            str2 = str5;
        }
        minInvestResp = (MinInvestResp) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar.AEQbTJ());
        if (minInvestResp != null || (minInvestment = minInvestResp.getMinInvestment()) == null) {
            minInvestment = "0";
        }
        return new ActionBar(minInvestment, minInvestResp == null ? minInvestResp.getMinQuoteSz() : null, minInvestResp == null ? minInvestResp.getSingleAmt() : null, null, null, 24, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #3 {all -> 0x0058, blocks: (B:20:0x0054, B:31:0x0077, B:33:0x007f, B:35:0x0085, B:36:0x0092), top: B:74:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:13:0x003c, B:52:0x011c, B:54:0x0124, B:56:0x012a, B:58:0x0139), top: B:69:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(Activity.Fragment fragment, Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        FetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1 fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1;
        Activity.Fragment fragment2;
        C52020vxx c52020vxx;
        Activity.Fragment fragment3;
        InterfaceC50055vAf interfaceC50055vAf;
        java.lang.String strKWHzl;
        AbstractC43419rot actionBar;
        StrategyConfigInfo strategyConfigInfo;
        C52020vxx c52020vxx2;
        StrategyConfigInfo strategyConfigInfo2;
        ResponseData responseData;
        AbstractC43419rot actionBar2;
        C52020vxx c52020vxx3;
        StrategyConfigInfo strategyConfigInfo3;
        TickersData tickersData;
        ResponseData responseData2;
        if (continuation instanceof FetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1) {
            fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1 = (FetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1) continuation;
            int i = fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1 = new FetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1(this, continuation);
            }
        }
        java.lang.Object objAhwBna = fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAhwBna);
            try {
                interfaceC50055vAf = this.AEQbTJ;
                strKWHzl = fragment.KWHzl();
                fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.L$0 = this;
                fragment2 = fragment;
            } catch (java.lang.Throwable th) {
                th = th;
                fragment2 = fragment;
            }
            try {
                fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.L$1 = fragment2;
                fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.label = 1;
                objAhwBna = interfaceC50055vAf.AhwBna("spot_dca", strKWHzl, fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1);
            } catch (java.lang.Throwable th2) {
                th = th2;
                c52020vxx = this;
                fragment3 = fragment2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            if (objAhwBna == objCopydefault) {
                return objCopydefault;
            }
            c52020vxx = this;
            fragment3 = fragment2;
            responseData = (ResponseData) objAhwBna;
            if (responseData.getCode() != 0) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
            tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar2.AEQbTJ());
            if (tickersData == null) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                strategyConfigInfo2 = (StrategyConfigInfo) fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.L$2;
                fragment3 = (Activity.Fragment) fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.L$1;
                c52020vxx2 = (C52020vxx) fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objAhwBna);
                    responseData2 = (ResponseData) objAhwBna;
                    if (responseData2.getCode() != 0 && responseData2.getData() != null) {
                        java.lang.Object data = responseData2.getData();
                        Intrinsics.copydefault(data);
                        actionBar2 = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData2);
                        actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData2.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData2), C43401rob.EZpvd(responseData2), null, 8, null));
                    }
                    c52020vxx3 = c52020vxx2;
                    strategyConfigInfo3 = strategyConfigInfo2;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    c52020vxx = c52020vxx2;
                    strategyConfigInfo = strategyConfigInfo2;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar2 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    c52020vxx3 = c52020vxx;
                    strategyConfigInfo3 = strategyConfigInfo;
                }
                tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar2.AEQbTJ());
                if (tickersData == null) {
                    return new ActionBar("0", null, null, "Ticker data not found", null, 22, null);
                }
                return new ActionBar(c52020vxx3.copydefault(tickersData, strategyConfigInfo3, fragment3.OLrzqt(), fragment3.djBIcL(), fragment3.EZpvd(), fragment3.KWHzl(), fragment3.AEQbTJ(), fragment3.copydefault()), null, null, null, null, 30, null);
            }
            fragment3 = (Activity.Fragment) fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.L$1;
            c52020vxx = (C52020vxx) fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.L$0;
            try {
                C56391yDq.AEQbTJ(objAhwBna);
                responseData = (ResponseData) objAhwBna;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data2 = responseData.getData();
                    Intrinsics.copydefault(data2);
                    actionBar = new AbstractC43419rot.StateListAnimator(data2);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        strategyConfigInfo = (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar.AEQbTJ());
        if (strategyConfigInfo == null) {
            return new ActionBar("0", null, null, "Strategy config not found", null, 22, null);
        }
        try {
            InterfaceC50055vAf interfaceC50055vAf2 = c52020vxx.AEQbTJ;
            java.lang.String strKWHzl2 = fragment3.KWHzl();
            fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.L$0 = c52020vxx;
            fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.L$1 = fragment3;
            fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.L$2 = strategyConfigInfo;
            fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1.label = 2;
            objAhwBna = interfaceC50055vAf2.fetchVPNInfo(strKWHzl2, fetchMinimumInvestAmountUseCase$calculateSpotDcaMinInvest$1);
        } catch (java.lang.Throwable th5) {
            th = th5;
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar2 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            c52020vxx3 = c52020vxx;
            strategyConfigInfo3 = strategyConfigInfo;
        }
        if (objAhwBna == objCopydefault) {
            return objCopydefault;
        }
        c52020vxx2 = c52020vxx;
        strategyConfigInfo2 = strategyConfigInfo;
        responseData2 = (ResponseData) objAhwBna;
        if (responseData2.getCode() != 0) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData2);
            actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData2.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData2), C43401rob.EZpvd(responseData2), null, 8, null));
            c52020vxx3 = c52020vxx2;
            strategyConfigInfo3 = strategyConfigInfo2;
        }
        tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar2.AEQbTJ());
        if (tickersData == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:26:0x006f, B:37:0x0092, B:39:0x009a, B:41:0x00a0, B:42:0x00ad), top: B:89:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0153 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:21:0x005f, B:58:0x0138, B:60:0x0140, B:62:0x0146, B:63:0x0153), top: B:90:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0202 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #4 {all -> 0x0048, blocks: (B:14:0x0043, B:76:0x01e4, B:78:0x01ec, B:80:0x01f2, B:82:0x0202), top: B:95:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Activity.ActionBar actionBar, Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        FetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1 fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1;
        Activity.ActionBar actionBar2;
        C52020vxx c52020vxx;
        Activity.ActionBar actionBar3;
        InterfaceC50055vAf interfaceC50055vAf;
        java.lang.String strCopydefault;
        AbstractC43419rot actionBar4;
        StrategyConfigInfo strategyConfigInfo;
        Activity.ActionBar actionBar5;
        StrategyConfigInfo strategyConfigInfo2;
        ResponseData responseData;
        AbstractC43419rot actionBar6;
        TickersData tickersData;
        Activity.ActionBar actionBar7;
        C52020vxx c52020vxx2;
        TickersData tickersData2;
        ResponseData responseData2;
        StrategyConfigInfo strategyConfigInfo3;
        C52020vxx c52020vxx3;
        TickersData tickersData3;
        AbstractC43419rot actionBar8;
        ResponseData responseData3;
        if (continuation instanceof FetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1) {
            fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1 = (FetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1) continuation;
            int i = fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1 = new FetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1(this, continuation);
            }
        }
        java.lang.Object objAhwBna = fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAhwBna);
            try {
                interfaceC50055vAf = this.AEQbTJ;
                strCopydefault = actionBar.copydefault();
                fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$0 = this;
                actionBar2 = actionBar;
            } catch (java.lang.Throwable th) {
                th = th;
                actionBar2 = actionBar;
            }
            try {
                fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$1 = actionBar2;
                fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.label = 1;
                objAhwBna = interfaceC50055vAf.AhwBna("contract_dca", strCopydefault, fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1);
            } catch (java.lang.Throwable th2) {
                th = th2;
                c52020vxx = this;
                actionBar3 = actionBar2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar4 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            if (objAhwBna == objCopydefault) {
                return objCopydefault;
            }
            c52020vxx = this;
            actionBar3 = actionBar2;
            responseData = (ResponseData) objAhwBna;
            if (responseData.getCode() != 0) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar4 = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
            return new ActionBar(c52020vxx3.AEQbTJ(tickersData3, (LimitPriceData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar8.AEQbTJ()), strategyConfigInfo3, actionBar7.EZpvd(), actionBar7.valueOf(), actionBar7.djBIcL(), actionBar7.AYXKKw(), actionBar7.AhwBna(), actionBar7.OLrzqt(), actionBar7.KWHzl(), actionBar7.copydefault(), actionBar7.AEQbTJ()), null, null, null, null, 30, null);
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tickersData2 = (TickersData) fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$3;
                strategyConfigInfo2 = (StrategyConfigInfo) fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$2;
                actionBar7 = (Activity.ActionBar) fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$1;
                c52020vxx2 = (C52020vxx) fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objAhwBna);
                    responseData3 = (ResponseData) objAhwBna;
                    if (responseData3.getCode() != 0 && responseData3.getData() != null) {
                        java.lang.Object data = responseData3.getData();
                        Intrinsics.copydefault(data);
                        actionBar8 = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData3);
                        actionBar8 = new AbstractC43419rot.ActionBar(new OKServerException(responseData3.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData3), C43401rob.EZpvd(responseData3), null, 8, null));
                    }
                    c52020vxx3 = c52020vxx2;
                    tickersData3 = tickersData2;
                    strategyConfigInfo3 = strategyConfigInfo2;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    c52020vxx = c52020vxx2;
                    tickersData = tickersData2;
                    actionBar5 = actionBar7;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    strategyConfigInfo3 = strategyConfigInfo2;
                    actionBar7 = actionBar5;
                    c52020vxx3 = c52020vxx;
                    tickersData3 = tickersData;
                    actionBar8 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
                return new ActionBar(c52020vxx3.AEQbTJ(tickersData3, (LimitPriceData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar8.AEQbTJ()), strategyConfigInfo3, actionBar7.EZpvd(), actionBar7.valueOf(), actionBar7.djBIcL(), actionBar7.AYXKKw(), actionBar7.AhwBna(), actionBar7.OLrzqt(), actionBar7.KWHzl(), actionBar7.copydefault(), actionBar7.AEQbTJ()), null, null, null, null, 30, null);
            }
            strategyConfigInfo2 = (StrategyConfigInfo) fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$2;
            actionBar5 = (Activity.ActionBar) fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$1;
            c52020vxx = (C52020vxx) fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$0;
            try {
                C56391yDq.AEQbTJ(objAhwBna);
                responseData2 = (ResponseData) objAhwBna;
                if (responseData2.getCode() != 0 && responseData2.getData() != null) {
                    java.lang.Object data2 = responseData2.getData();
                    Intrinsics.copydefault(data2);
                    actionBar6 = new AbstractC43419rot.StateListAnimator(data2);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData2);
                    actionBar6 = new AbstractC43419rot.ActionBar(new OKServerException(responseData2.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData2), C43401rob.EZpvd(responseData2), null, 8, null));
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                strategyConfigInfo = strategyConfigInfo2;
                actionBar3 = actionBar5;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar5 = actionBar3;
                strategyConfigInfo2 = strategyConfigInfo;
                actionBar6 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar6.AEQbTJ());
            if (tickersData != null) {
                return new ActionBar("0", null, null, "Ticker data not found", null, 22, null);
            }
            try {
                InterfaceC50055vAf interfaceC50055vAf2 = c52020vxx.AEQbTJ;
                java.lang.String strCopydefault2 = actionBar5.copydefault();
                fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$0 = c52020vxx;
                fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$1 = actionBar5;
                fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$2 = strategyConfigInfo2;
                fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$3 = tickersData;
                fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.label = 3;
                objAhwBna = interfaceC50055vAf2.DbNXlk(strCopydefault2, fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1);
            } catch (java.lang.Throwable th5) {
                th = th5;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                strategyConfigInfo3 = strategyConfigInfo2;
                actionBar7 = actionBar5;
                c52020vxx3 = c52020vxx;
                tickersData3 = tickersData;
                actionBar8 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
            if (objAhwBna == objCopydefault) {
                return objCopydefault;
            }
            actionBar7 = actionBar5;
            c52020vxx2 = c52020vxx;
            tickersData2 = tickersData;
            responseData3 = (ResponseData) objAhwBna;
            if (responseData3.getCode() != 0) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData3);
                actionBar8 = new AbstractC43419rot.ActionBar(new OKServerException(responseData3.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData3), C43401rob.EZpvd(responseData3), null, 8, null));
                c52020vxx3 = c52020vxx2;
                tickersData3 = tickersData2;
                strategyConfigInfo3 = strategyConfigInfo2;
            }
            return new ActionBar(c52020vxx3.AEQbTJ(tickersData3, (LimitPriceData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar8.AEQbTJ()), strategyConfigInfo3, actionBar7.EZpvd(), actionBar7.valueOf(), actionBar7.djBIcL(), actionBar7.AYXKKw(), actionBar7.AhwBna(), actionBar7.OLrzqt(), actionBar7.KWHzl(), actionBar7.copydefault(), actionBar7.AEQbTJ()), null, null, null, null, 30, null);
        }
        actionBar3 = (Activity.ActionBar) fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$1;
        c52020vxx = (C52020vxx) fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$0;
        try {
            C56391yDq.AEQbTJ(objAhwBna);
            responseData = (ResponseData) objAhwBna;
            if (responseData.getCode() != 0 && responseData.getData() != null) {
                java.lang.Object data3 = responseData.getData();
                Intrinsics.copydefault(data3);
                actionBar4 = new AbstractC43419rot.StateListAnimator(data3);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar4 = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar4 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        strategyConfigInfo = (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar4.AEQbTJ());
        if (strategyConfigInfo == null) {
            return new ActionBar("0", null, null, "Strategy config not found", null, 22, null);
        }
        try {
            InterfaceC50055vAf interfaceC50055vAf3 = c52020vxx.AEQbTJ;
            java.lang.String strCopydefault3 = actionBar3.copydefault();
            fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$0 = c52020vxx;
            fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$1 = actionBar3;
            fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.L$2 = strategyConfigInfo;
            fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1.label = 2;
            objAhwBna = interfaceC50055vAf3.fetchVPNInfo(strCopydefault3, fetchMinimumInvestAmountUseCase$calculateContractDcaMinInvest$1);
        } catch (java.lang.Throwable th7) {
            th = th7;
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar5 = actionBar3;
            strategyConfigInfo2 = strategyConfigInfo;
            actionBar6 = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (objAhwBna == objCopydefault) {
            return objCopydefault;
        }
        actionBar5 = actionBar3;
        strategyConfigInfo2 = strategyConfigInfo;
        responseData2 = (ResponseData) objAhwBna;
        if (responseData2.getCode() != 0) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData2);
            actionBar6 = new AbstractC43419rot.ActionBar(new OKServerException(responseData2.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData2), C43401rob.EZpvd(responseData2), null, 8, null));
            tickersData = (TickersData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar6.AEQbTJ());
            if (tickersData != null) {
            }
        }
        return new ActionBar(c52020vxx3.AEQbTJ(tickersData3, (LimitPriceData) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar8.AEQbTJ()), strategyConfigInfo3, actionBar7.EZpvd(), actionBar7.valueOf(), actionBar7.djBIcL(), actionBar7.AYXKKw(), actionBar7.AhwBna(), actionBar7.OLrzqt(), actionBar7.KWHzl(), actionBar7.copydefault(), actionBar7.AEQbTJ()), null, null, null, null, 30, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Activity.StateListAnimator stateListAnimator, Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        FetchMinimumInvestAmountUseCase$calculateRecurringMinInvest$1 fetchMinimumInvestAmountUseCase$calculateRecurringMinInvest$1;
        AbstractC43419rot.ActionBar actionBar;
        AbstractC43419rot stateListAnimator2;
        MinInvestResp minInvestResp;
        java.lang.String minInvestment;
        ResponseData responseData;
        if (continuation instanceof FetchMinimumInvestAmountUseCase$calculateRecurringMinInvest$1) {
            fetchMinimumInvestAmountUseCase$calculateRecurringMinInvest$1 = (FetchMinimumInvestAmountUseCase$calculateRecurringMinInvest$1) continuation;
            int i = fetchMinimumInvestAmountUseCase$calculateRecurringMinInvest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchMinimumInvestAmountUseCase$calculateRecurringMinInvest$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchMinimumInvestAmountUseCase$calculateRecurringMinInvest$1 = new FetchMinimumInvestAmountUseCase$calculateRecurringMinInvest$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = fetchMinimumInvestAmountUseCase$calculateRecurringMinInvest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchMinimumInvestAmountUseCase$calculateRecurringMinInvest$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC50055vAf interfaceC50055vAf = this.AEQbTJ;
                MinInvestReq minInvestReq = new MinInvestReq(stateListAnimator.EZpvd(), stateListAnimator.OLrzqt(), stateListAnimator.AEQbTJ());
                fetchMinimumInvestAmountUseCase$calculateRecurringMinInvest$1.label = 1;
                objKWHzl = interfaceC50055vAf.KWHzl(minInvestReq, fetchMinimumInvestAmountUseCase$calculateRecurringMinInvest$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
            }
            responseData = (ResponseData) objKWHzl;
        } catch (java.lang.Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            java.lang.Object data = responseData.getData();
            Intrinsics.copydefault(data);
            stateListAnimator2 = new AbstractC43419rot.StateListAnimator(data);
            minInvestResp = (MinInvestResp) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) stateListAnimator2.AEQbTJ());
            if (minInvestResp != null) {
                minInvestment = "0";
            }
            return new ActionBar(minInvestment, minInvestResp == null ? minInvestResp.getMinQuoteSz() : null, minInvestResp == null ? minInvestResp.getSingleAmt() : null, null, null, 24, null);
        }
        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
        stateListAnimator2 = actionBar;
        minInvestResp = (MinInvestResp) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) stateListAnimator2.AEQbTJ());
        if (minInvestResp != null || (minInvestment = minInvestResp.getMinInvestment()) == null) {
            minInvestment = "0";
        }
        return new ActionBar(minInvestment, minInvestResp == null ? minInvestResp.getMinQuoteSz() : null, minInvestResp == null ? minInvestResp.getSingleAmt() : null, null, null, 24, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #2 {all -> 0x0035, blocks: (B:12:0x0031, B:25:0x0059, B:27:0x0061, B:29:0x0067, B:30:0x0074), top: B:57:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Activity.TaskDescription taskDescription, Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        FetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1 fetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1;
        Activity.TaskDescription taskDescription2;
        Activity.TaskDescription taskDescription3;
        InterfaceC50055vAf interfaceC50055vAf;
        java.lang.String strEZpvd;
        AbstractC43419rot actionBar;
        java.lang.String ratio;
        ResponseData responseData;
        if (continuation instanceof FetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1) {
            fetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1 = (FetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1) continuation;
            int i = fetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1.label = i - Integer.MIN_VALUE;
            } else {
                fetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1 = new FetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1(this, continuation);
            }
        }
        java.lang.Object objAhwBna = fetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = fetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAhwBna);
            try {
                interfaceC50055vAf = this.AEQbTJ;
                strEZpvd = taskDescription.EZpvd();
                taskDescription2 = taskDescription;
            } catch (java.lang.Throwable th) {
                th = th;
                taskDescription2 = taskDescription;
            }
            try {
                fetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1.L$0 = taskDescription2;
                fetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1.label = 1;
                objAhwBna = interfaceC50055vAf.AhwBna("smart_portfolio", strEZpvd, fetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1);
                if (objAhwBna == objCopydefault) {
                    return objCopydefault;
                }
                taskDescription3 = taskDescription2;
                responseData = (ResponseData) objAhwBna;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                taskDescription3 = taskDescription2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            taskDescription3 = (Activity.TaskDescription) fetchMinimumInvestAmountUseCase$calculateSmartPortfolioMinInvest$1.L$0;
            try {
                C56391yDq.AEQbTJ(objAhwBna);
                responseData = (ResponseData) objAhwBna;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    java.lang.Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        StrategyConfigInfo strategyConfigInfo = (StrategyConfigInfo) CollectionsKt___CollectionsKt.firstOrNull((java.util.List) actionBar.AEQbTJ());
        if (strategyConfigInfo == null) {
            return new ActionBar("0", null, null, "Strategy config not found", null, 22, null);
        }
        java.util.List<CoinRatioParam> listAEQbTJ = taskDescription3.AEQbTJ();
        if (listAEQbTJ.isEmpty()) {
            return new ActionBar("0", null, null, "Portfolio list is empty", null, 22, null);
        }
        CoinRatioParam coinRatioParam = (CoinRatioParam) CollectionsKt___CollectionsKt.firstOrNull(CollectionsKt___CollectionsKt.EZpvd(listAEQbTJ, new Application()));
        if (coinRatioParam == null || (ratio = coinRatioParam.getRatio()) == null) {
            ratio = "1";
        }
        return new ActionBar(C33129mqd.divS$default(strategyConfigInfo.getPerCoinMinAmt(), C56443yFo.AEQbTJ(C33129mqd.AEQbTJ(ratio)), null, null, null, 14, null), null, null, null, null, 30, null);
    }

    public final java.lang.Object OLrzqt(Activity.C0987Activity c0987Activity, Continuation<? super ActionBar> continuation) {
        return SupervisorKt.supervisorScope(new FetchMinimumInvestAmountUseCase$calculateSmartArbitrageMinInvest$2(this, c0987Activity, null), continuation);
    }

    public final java.lang.String copydefault(TickersData tickersData, StrategyConfigInfo strategyConfigInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z) {
        java.lang.String strMulS$default;
        java.lang.String str6;
        java.lang.String strAEQbTJ = AEQbTJ(tickersData, strategyConfigInfo, str4, str5);
        if (C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
            return strAEQbTJ;
        }
        java.lang.String strOLrzqt = OLrzqt(strAEQbTJ, str, str2);
        java.lang.String strDivS$default = C33129mqd.divS$default(strOLrzqt, str3, null, null, null, 14, null);
        if (C33129mqd.gEmmrt(strDivS$default, strAEQbTJ)) {
            str6 = strAEQbTJ;
            strMulS$default = C33129mqd.mulS$default(str6, str3, null, null, null, 14, null);
        } else {
            strMulS$default = strOLrzqt;
            str6 = strDivS$default;
        }
        if (z) {
            return C33129mqd.addS$default(str6, C56045xvR.KWHzl.copydefault(strMulS$default, str, str2), null, null, null, 14, null);
        }
        return C33129mqd.addS$default(str6, strMulS$default, null, null, null, 14, null);
    }

    public final java.lang.String AEQbTJ(TickersData tickersData, LimitPriceData limitPriceData, StrategyConfigInfo strategyConfigInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        java.lang.String strOLrzqt = OLrzqt(tickersData, limitPriceData, str6, str7, strategyConfigInfo, str8, str9);
        java.lang.String strOLrzqt2 = OLrzqt(tickersData, str2, str3, str, str4, str6, str7, strategyConfigInfo, str8, str9);
        if (C33129mqd.valueOf(strOLrzqt, 0) || C33129mqd.valueOf(strOLrzqt2, 0)) {
            return "0";
        }
        if (C33129mqd.OLrzqt((java.lang.Object) str, (java.lang.Object) 0)) {
            return strOLrzqt;
        }
        if (C33129mqd.gEmmrt(C33129mqd.divS$default(strOLrzqt2, strOLrzqt, null, null, null, 14, null), str5)) {
            strOLrzqt2 = C33129mqd.mulS$default(strOLrzqt, str5, null, null, null, 14, null);
        } else {
            strOLrzqt = C33129mqd.divS$default(strOLrzqt2, str5, null, null, null, 14, null);
        }
        return C33129mqd.addS$default(strOLrzqt, C56045xvR.KWHzl.copydefault(strOLrzqt2, str, str4), null, null, null, 14, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(TickersData tickersData, StrategyConfigInfo strategyConfigInfo, java.lang.String str, java.lang.String str2) {
        xMS xmsGEmmrt;
        java.lang.String strAhwBna;
        BizInstrument suggestedInstrument$default;
        java.lang.String quoteSymbol;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(str2)) != null) {
            xmsGEmmrt = abstractC54531xLwOLrzqt.gEmmrt(xUW.KWHzl.AEQbTJ(str));
            if (xmsGEmmrt == null) {
            }
            InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
            if (interfaceC54581xNrOLrzqt2 == null) {
            }
            if (suggestedInstrument$default == null) {
            }
            if (!Intrinsics.EZpvd((java.lang.Object) quoteSymbol, (java.lang.Object) "USDT")) {
            }
            return C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.max(C33129mqd.AEQbTJ(C33129mqd.mulS$default(C33129mqd.mulS$default(suggestedInstrument$default.getMinSize(), strAhwBna, null, null, null, 14, null), strategyConfigInfo.getMinAmtBuffer(), null, null, null, 14, null)), java.lang.Math.max(C33129mqd.AEQbTJ(strategyConfigInfo.getMinQuoteThold()), C33129mqd.AEQbTJ(suggestedInstrument$default.getTickerSize())))));
        }
        xmsGEmmrt = null;
        strAhwBna = xmsGEmmrt == null ? xmsGEmmrt.AhwBna(tickersData.getLast()) : null;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt22 = c54589xNz.OLrzqt();
        suggestedInstrument$default = interfaceC54581xNrOLrzqt22 == null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt22, str2, str, null, null, 12, null) : null;
        quoteSymbol = suggestedInstrument$default == null ? suggestedInstrument$default.getQuoteSymbol() : null;
        if (!Intrinsics.EZpvd((java.lang.Object) quoteSymbol, (java.lang.Object) "USDT") || Intrinsics.EZpvd((java.lang.Object) quoteSymbol, (java.lang.Object) "USDC")) {
            return C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.max(C33129mqd.AEQbTJ(C33129mqd.mulS$default(C33129mqd.mulS$default(suggestedInstrument$default.getMinSize(), strAhwBna, null, null, null, 14, null), strategyConfigInfo.getMinAmtBuffer(), null, null, null, 14, null)), java.lang.Math.max(C33129mqd.AEQbTJ(strategyConfigInfo.getMinQuoteThold()), C33129mqd.AEQbTJ(suggestedInstrument$default.getTickerSize())))));
        }
        return C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.max(C33129mqd.AEQbTJ(C33129mqd.mulS$default(C33129mqd.mulS$default(suggestedInstrument$default != null ? suggestedInstrument$default.getMinSize() : null, strAhwBna, null, null, null, 14, null), strategyConfigInfo.getMinAmtBuffer(), null, null, null, 14, null)), C33129mqd.AEQbTJ(suggestedInstrument$default != null ? suggestedInstrument$default.getTickerSize() : null))));
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.max(C33129mqd.AEQbTJ(str), C33129mqd.AEQbTJ(C33129mqd.divS$default(str, java.lang.Double.valueOf(java.lang.Math.pow(C33129mqd.AEQbTJ(str3), C33129mqd.AhwBna(str2) - 1)), null, null, null, 14, null)))));
    }

    public final java.lang.String OLrzqt(TickersData tickersData, LimitPriceData limitPriceData, java.lang.String str, java.lang.String str2, StrategyConfigInfo strategyConfigInfo, java.lang.String str3, java.lang.String str4) {
        if (!Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "long")) {
            strGEmmrt = C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.max(C33129mqd.AEQbTJ(limitPriceData != null ? limitPriceData.getSellLmt() : null), C33129mqd.AEQbTJ(tickersData.getBidPx()))));
        } else if (limitPriceData != null) {
            strGEmmrt = limitPriceData.getBuyLmt();
        }
        return copydefault(strGEmmrt, str2, strategyConfigInfo, str3, str4);
    }

    public final java.lang.String OLrzqt(TickersData tickersData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, StrategyConfigInfo strategyConfigInfo, java.lang.String str7, java.lang.String str8) {
        java.lang.String last;
        if (Intrinsics.EZpvd((java.lang.Object) str5, (java.lang.Object) "long") || C33129mqd.valueOf(str, 0) || C33129mqd.valueOf(str2, 0) || C33129mqd.valueOf(str3, 0)) {
            last = tickersData.getLast();
        } else {
            last = C33129mqd.mulS$default(tickersData.getLast(), C33129mqd.addS$default(1, C56045xvR.KWHzl.EZpvd(str, str3, str2), null, null, null, 14, null), null, null, null, 14, null);
        }
        java.lang.String strCopydefault = copydefault(last, str6, strategyConfigInfo, str7, str8);
        return C33129mqd.gEmmrt(java.lang.Double.valueOf(java.lang.Math.max(C33129mqd.AEQbTJ(strCopydefault), C33129mqd.AEQbTJ(C33129mqd.divS$default(strCopydefault, java.lang.Double.valueOf(java.lang.Math.pow(C33129mqd.AEQbTJ(str4), C33129mqd.AhwBna(str3) - 1)), null, null, null, 14, null)))));
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2, StrategyConfigInfo strategyConfigInfo, java.lang.String str3, java.lang.String str4) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        BizInstrument suggestedInstrument$default = interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, str4, str3, null, null, 12, null) : null;
        SwapInstrument swapInstrument = suggestedInstrument$default instanceof SwapInstrument ? (SwapInstrument) suggestedInstrument$default : null;
        return C56045xvR.KWHzl.AEQbTJ(swapInstrument != null ? swapInstrument.getMinSize() : null, swapInstrument != null ? swapInstrument.getCtVal() : null, str, str2, strategyConfigInfo.getMarginBuffer());
    }
}
