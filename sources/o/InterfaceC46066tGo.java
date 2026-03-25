package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import com.okinc.planet.biz_userprofile.data.PlanetTradeTypes;
import com.okinc.planet.serializer.PlanetNumericString;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tGo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public interface InterfaceC46066tGo {
    Application KWHzl(@NotNull InterfaceC46073tGv interfaceC46073tGv, boolean z);

    /* JADX INFO: renamed from: o.tGo$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class StateListAnimator {
        public static /* synthetic */ Application generateProperties$default(InterfaceC46066tGo interfaceC46066tGo, InterfaceC46073tGv interfaceC46073tGv, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: generateProperties");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return interfaceC46066tGo.KWHzl(interfaceC46073tGv, z);
        }

        public static Application copydefault(@NotNull InterfaceC46066tGo interfaceC46066tGo, @NotNull InterfaceC46073tGv interfaceC46073tGv, boolean z) {
            kotlin.Pair pairOLrzqt;
            java.lang.String str;
            java.lang.String str2;
            Intrinsics.checkNotNullParameter(interfaceC46073tGv, "");
            PlanetTradeTypes planetTradeTypesOLrzqt = PlanetTradeTypes.Companion.OLrzqt(interfaceC46073tGv.getInstType());
            tRU truAEQbTJ = tRQ.AEQbTJ(interfaceC46073tGv.getInstType(), interfaceC46073tGv.getPosSide(), interfaceC46073tGv.mo7027getCloseTotalPos8XBoXJE());
            kotlin.Pair pairOLrzqt2 = tRS.OLrzqt(interfaceC46073tGv.mo7027getCloseTotalPos8XBoXJE(), interfaceC46073tGv.getInstType(), interfaceC46073tGv.mo7032getInstIdy_k7uyA(), PlanetNumericString.copydefault(interfaceC46073tGv.mo7025getCloseAvgPx8XBoXJE(), new ActionBar(interfaceC46073tGv)), (48 & 8) != 0 ? PlanetNumericString.Companion.EZpvd() : interfaceC46073tGv.mo7029getContractVal8XBoXJE(), (48 & 16) != 0 ? false : false, (48 & 32) != 0 ? null : null, (48 & 64) != 0 ? null : null);
            java.lang.String str3 = (java.lang.String) pairOLrzqt2.component1();
            java.lang.String str4 = (java.lang.String) pairOLrzqt2.component2();
            xMS xmsEZpvd = tRR.EZpvd(interfaceC46073tGv.mo7032getInstIdy_k7uyA(), interfaceC46073tGv.getInstType());
            xMV xmvEZpvd = tRP.EZpvd(interfaceC46073tGv.mo7032getInstIdy_k7uyA(), interfaceC46073tGv.getInstType(), interfaceC46073tGv.mo7035getMarginCcyFeEHGxI());
            java.lang.String strM8752formatPricePlaineLEVFN8$default = tRR.m8752formatPricePlaineLEVFN8$default(xmsEZpvd, interfaceC46073tGv.mo7036getOpenAvgPx8XBoXJE(), truAEQbTJ, false, false, 12, null);
            java.lang.String strM8746formatClosePricePlaineLEVFN8$default = tRR.m8746formatClosePricePlaineLEVFN8$default(xmsEZpvd, interfaceC46073tGv.mo7025getCloseAvgPx8XBoXJE(), truAEQbTJ, false, false, 12, null);
            java.lang.String strM8752formatPricePlaineLEVFN8$default2 = tRR.m8752formatPricePlaineLEVFN8$default(xmsEZpvd, interfaceC46073tGv.mo7036getOpenAvgPx8XBoXJE(), truAEQbTJ, false, true, 4, null);
            java.lang.String strM8746formatClosePricePlaineLEVFN8$default2 = tRR.m8746formatClosePricePlaineLEVFN8$default(xmsEZpvd, interfaceC46073tGv.mo7025getCloseAvgPx8XBoXJE(), truAEQbTJ, false, true, 4, null);
            if (z) {
                pairOLrzqt = C56390yDp.OLrzqt(OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE);
            } else {
                pairOLrzqt = C56390yDp.OLrzqt(OKDateEnum.DATE_FORMAT_SIMPLE_MD, OKTimeEnum.TIME_FORMAT_SIMPLE_HM);
            }
            OKDateEnum oKDateEnum = (OKDateEnum) pairOLrzqt.component1();
            OKTimeEnum oKTimeEnum = (OKTimeEnum) pairOLrzqt.component2();
            java.lang.Long lValueOf = java.lang.Long.valueOf(interfaceC46073tGv.getCTime());
            if (lValueOf.longValue() == 0) {
                lValueOf = null;
            }
            java.lang.String str5 = (lValueOf == null || (str2 = pTA.format$default(new Date(lValueOf.longValue()), oKDateEnum, oKTimeEnum, null, null, false, 28, null)) == null) ? "--" : str2;
            java.lang.Long lValueOf2 = java.lang.Long.valueOf(interfaceC46073tGv.getUTime());
            if (lValueOf2.longValue() == 0) {
                lValueOf2 = null;
            }
            return new Application(str3, str4, tRQ.m8743getCoinTitlejjRfxO4$default(interfaceC46073tGv.mo7032getInstIdy_k7uyA(), interfaceC46073tGv.getInstType(), false, 2, null), strM8752formatPricePlaineLEVFN8$default, strM8746formatClosePricePlaineLEVFN8$default, strM8752formatPricePlaineLEVFN8$default2, strM8746formatClosePricePlaineLEVFN8$default2, planetTradeTypesOLrzqt, xmsEZpvd, truAEQbTJ, str5, (lValueOf2 == null || (str = pTA.format$default(new Date(lValueOf2.longValue()), oKDateEnum, oKTimeEnum, null, null, false, 28, null)) == null) ? "--" : str, tRP.m8738formatPNLeLEVFN8$default(xmvEZpvd, interfaceC46073tGv.mo7038getRealizedPnl8XBoXJE(), false, false, 0, 14, null), tRP.OLrzqt(xmvEZpvd));
        }

        /* JADX INFO: renamed from: o.tGo$StateListAnimator$ActionBar */
        public static final class ActionBar implements Function0<PlanetNumericString> {
            public final /* synthetic */ InterfaceC46073tGv KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(InterfaceC46073tGv interfaceC46073tGv) {
                this.KWHzl = interfaceC46073tGv;
            }

            public final java.lang.String AEQbTJ() {
                return this.KWHzl.mo7036getOpenAvgPx8XBoXJE();
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* synthetic */ PlanetNumericString invoke() {
                return PlanetNumericString.OLrzqt(AEQbTJ());
            }
        }
    }

    /* JADX INFO: renamed from: o.tGo$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        public static final int KWHzl = xMS.AEQbTJ;
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final java.lang.String AkhnZx;
        public final java.lang.String DbNXlk;
        public final java.lang.String EZpvd;
        public final xMS OLrzqt;
        public final java.lang.String copydefault;
        public final kotlin.Pair<java.lang.String, java.lang.Integer> djBIcL;
        public final tRU fetchVPNInfo;
        public final java.lang.String gEmmrt;
        public final PlanetTradeTypes isConnected;
        public final java.lang.String valueOf;
        public final java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PlanetTradeTypes DbNXlk() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull PlanetTradeTypes planetTradeTypes, xMS xms, @NotNull tRU tru, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull kotlin.Pair<java.lang.String, java.lang.Integer> pair, @NotNull java.lang.String str10) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(planetTradeTypes, "");
            Intrinsics.checkNotNullParameter(tru, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(str10, "");
            return new Application(str, str2, str3, str4, str5, str6, str7, planetTradeTypes, xms, tru, str8, str9, pair, str10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final tRU djBIcL() {
            return this.fetchVPNInfo;
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
            return Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) application.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) application.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) application.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) application.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) application.values) && this.isConnected == application.isConnected && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt) && Intrinsics.EZpvd(this.fetchVPNInfo, application.fetchVPNInfo) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) application.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault) && Intrinsics.EZpvd(this.djBIcL, application.djBIcL) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) application.AhwBna);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AYXKKw.hashCode();
            int iHashCode2 = this.DbNXlk.hashCode();
            int iHashCode3 = this.AEQbTJ.hashCode();
            int iHashCode4 = this.EZpvd.hashCode();
            int iHashCode5 = this.gEmmrt.hashCode();
            int iHashCode6 = this.AkhnZx.hashCode();
            int iHashCode7 = this.values.hashCode();
            int iHashCode8 = this.isConnected.hashCode();
            xMS xms = this.OLrzqt;
            return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (xms == null ? 0 : xms.hashCode())) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.AhwBna.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Properties(position=" + this.AYXKKw + ", symbol=" + this.DbNXlk + ", coinName=" + this.AEQbTJ + ", averagePrice=" + this.EZpvd + ", exitPrice=" + this.gEmmrt + ", prefixOpenPrice=" + this.AkhnZx + ", prefixClosePrice=" + this.values + ", tradeType=" + this.isConnected + ", converter=" + this.OLrzqt + ", tradeSide=" + this.fetchVPNInfo + ", openTime=" + this.valueOf + ", closeTime=" + this.copydefault + ", pnl=" + this.djBIcL + ", pnlSymbol=" + this.AhwBna + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final kotlin.Pair<java.lang.String, java.lang.Integer> valueOf() {
            return this.djBIcL;
        }

        public Application(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull PlanetTradeTypes planetTradeTypes, xMS xms, @NotNull tRU tru, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull kotlin.Pair<java.lang.String, java.lang.Integer> pair, @NotNull java.lang.String str10) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(planetTradeTypes, "");
            Intrinsics.checkNotNullParameter(tru, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(pair, "");
            Intrinsics.checkNotNullParameter(str10, "");
            this.AYXKKw = str;
            this.DbNXlk = str2;
            this.AEQbTJ = str3;
            this.EZpvd = str4;
            this.gEmmrt = str5;
            this.AkhnZx = str6;
            this.values = str7;
            this.isConnected = planetTradeTypes;
            this.OLrzqt = xms;
            this.fetchVPNInfo = tru;
            this.valueOf = str8;
            this.copydefault = str9;
            this.djBIcL = pair;
            this.AhwBna = str10;
        }
    }
}
