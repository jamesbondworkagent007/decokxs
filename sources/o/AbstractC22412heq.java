package o;

import com.okinc.business.dexlogic.bean.MemeModeQuoteBean;
import com.okinc.business.dexlogic.bean.track.TrackTransactionDirection;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMarketPrice;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.heq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22412heq {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.heq.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC22412heq(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC22412heq() {
    }

    /* JADX INFO: renamed from: o.heq$TaskDescription */
    public static final class TaskDescription extends AbstractC22412heq {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final PresetUserConfigBean AhwBna;
        public final java.lang.String DbNXlk;
        public final MemeModeQuoteBean EZpvd;
        public final boolean KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.util.Map<java.lang.String, java.lang.String> djBIcL;
        public final java.lang.String gEmmrt;
        public final java.lang.String isConnected;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.isConnected;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AkhnZx() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription EZpvd(@NotNull java.lang.String str, @NotNull MemeModeQuoteBean memeModeQuoteBean, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull PresetUserConfigBean presetUserConfigBean, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, java.util.Map<java.lang.String, java.lang.String> map, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(memeModeQuoteBean, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(presetUserConfigBean, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            return new TaskDescription(str, memeModeQuoteBean, str2, str3, presetUserConfigBean, str4, str5, str6, str7, str8, map, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MemeModeQuoteBean OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
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
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) taskDescription.gEmmrt) && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.DbNXlk, (java.lang.Object) taskDescription.DbNXlk) && Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) taskDescription.isConnected) && Intrinsics.EZpvd(this.AhwBna, taskDescription.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) taskDescription.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) taskDescription.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) taskDescription.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) taskDescription.AYXKKw) && Intrinsics.EZpvd(this.djBIcL, taskDescription.djBIcL) && this.KWHzl == taskDescription.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.String> gEmmrt() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.gEmmrt.hashCode();
            int iHashCode2 = this.EZpvd.hashCode();
            int iHashCode3 = this.DbNXlk.hashCode();
            int iHashCode4 = this.isConnected.hashCode();
            int iHashCode5 = this.AhwBna.hashCode();
            int iHashCode6 = this.copydefault.hashCode();
            int iHashCode7 = this.valueOf.hashCode();
            int iHashCode8 = this.OLrzqt.hashCode();
            int iHashCode9 = this.AEQbTJ.hashCode();
            int iHashCode10 = this.AYXKKw.hashCode();
            java.util.Map<java.lang.String, java.lang.String> map = this.djBIcL;
            return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (map == null ? 0 : map.hashCode())) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MemeMarketTrackingSubmit(submitType=" + this.gEmmrt + ", memeQuote=" + this.EZpvd + ", walletAddress=" + this.DbNXlk + ", transactionType=" + this.isConnected + ", preset=" + this.AhwBna + ", basicToken=" + this.copydefault + ", priorityFee=" + this.valueOf + ", gasPrice=" + this.OLrzqt + ", businessType=" + this.AEQbTJ + ", pageName=" + this.AYXKKw + ", params=" + this.djBIcL + ", isTEEWallet=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean values() {
            return this.KWHzl;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull java.lang.String str, @NotNull MemeModeQuoteBean memeModeQuoteBean, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull PresetUserConfigBean presetUserConfigBean, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, java.util.Map<java.lang.String, java.lang.String> map, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(memeModeQuoteBean, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(presetUserConfigBean, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(str8, "");
            this.gEmmrt = str;
            this.EZpvd = memeModeQuoteBean;
            this.DbNXlk = str2;
            this.isConnected = str3;
            this.AhwBna = presetUserConfigBean;
            this.copydefault = str4;
            this.valueOf = str5;
            this.OLrzqt = str6;
            this.AEQbTJ = str7;
            this.AYXKKw = str8;
            this.djBIcL = map;
            this.KWHzl = z;
        }

        public final BuySellPreset EZpvd() {
            return Intrinsics.EZpvd((java.lang.Object) this.isConnected, (java.lang.Object) TrackTransactionDirection.BUY.getValue()) ? this.AhwBna.getBuyPreset() : this.AhwBna.getSellPreset();
        }

        public final boolean fetchVPNInfo() {
            return Intrinsics.EZpvd((java.lang.Object) this.AhwBna.getPresetType(), (java.lang.Object) "1");
        }
    }

    /* JADX INFO: renamed from: o.heq$Application */
    public static final class Application extends AbstractC22412heq {
        public final java.lang.String AEQbTJ;
        public final java.lang.String AYXKKw;
        public final java.lang.String AhwBna;
        public final LimitMarketPrice EZpvd;
        public final PresetUserConfigBean KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;
        public final java.lang.String gEmmrt;
        public final java.lang.String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LimitMarketPrice EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull java.lang.String str, @NotNull LimitMarketPrice limitMarketPrice, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull PresetUserConfigBean presetUserConfigBean, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(limitMarketPrice, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(presetUserConfigBean, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return new Application(str, limitMarketPrice, str2, str3, str4, presetUserConfigBean, str5, str6, str7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.copydefault;
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
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) application.valueOf) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) application.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) application.gEmmrt) && Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) application.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((this.valueOf.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MemeStrategyTrackingSubmit(submitType=" + this.valueOf + ", memeQuote=" + this.EZpvd + ", walletAddress=" + this.AYXKKw + ", orderType=" + this.OLrzqt + ", transactionType=" + this.gEmmrt + ", preset=" + this.KWHzl + ", basicToken=" + this.AEQbTJ + ", priorityFee=" + this.AhwBna + ", gasPrice=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.AhwBna;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str, @NotNull LimitMarketPrice limitMarketPrice, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull PresetUserConfigBean presetUserConfigBean, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(limitMarketPrice, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(presetUserConfigBean, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.valueOf = str;
            this.EZpvd = limitMarketPrice;
            this.AYXKKw = str2;
            this.OLrzqt = str3;
            this.gEmmrt = str4;
            this.KWHzl = presetUserConfigBean;
            this.AEQbTJ = str5;
            this.AhwBna = str6;
            this.copydefault = str7;
        }

        public final BuySellPreset OLrzqt() {
            return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) TrackTransactionDirection.BUY.getValue()) ? this.KWHzl.getBuyPreset() : this.KWHzl.getSellPreset();
        }

        public final boolean AYXKKw() {
            return Intrinsics.EZpvd((java.lang.Object) this.KWHzl.getPresetType(), (java.lang.Object) "1");
        }
    }
}
