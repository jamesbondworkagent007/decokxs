package o;

import androidx.camera.video.AudioStats;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.appsflyer.AppsFlyerProperties;
import com.okinc.buysell.ui.paymentmethod.BasePaymentMethodViewModel$getQuoteAndShowQPDialog$1;
import com.okinc.buysell.ui.paymentmethod.PaymentMethodSelectionViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.crcore.shared.net.responsebean.bsc.B2CQuoteBean;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.tracking.PaymentsReporterProperty;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import java.math.BigDecimal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lKH extends lzT {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final MutableLiveData<C32989mnw<java.lang.Boolean>> AYXKKw;
    public final MutableLiveData<C32989mnw<java.lang.Boolean>> AhwBna;
    public final MutableLiveData<C32989mnw<Activity>> AkhnZx;
    public java.lang.String AuCTel;
    public java.lang.String AuCTelauCTel;
    public boolean AubY;
    public java.lang.String AwvSrB;
    public boolean AxsJAY;
    public java.lang.String DTwDnp;
    public final MutableLiveData<C32989mnw<C31434ltu>> DbNXlk;
    public java.lang.String ORxRYg;
    public java.lang.String OcIXYQ;
    public java.lang.String QKVWgx;
    public java.lang.String QOLQEE;
    public java.lang.String QUSxYX;
    public java.lang.String QVAiDq;
    public java.lang.String QbewEr;
    public java.lang.String QfsBiF;
    public java.lang.String RJOkX;
    public java.lang.String RcXXUw;
    public java.lang.String UeEOUB;
    public java.lang.String aKErDB;
    public java.lang.String dNCPSb;
    public final MutableLiveData<C32989mnw<java.lang.String>> djBIcL;
    public java.lang.String djSkpj;
    public int dxcTrN;
    public final MutableLiveData<C32989mnw<java.lang.Boolean>> ejfBZ;
    public java.lang.String fARcdN;
    public java.lang.String fFgQHt;
    public com.okinc.okpaymentapi.data.remote.model.management.Channel fIwbmz;
    public final MutableLiveData<C32989mnw<java.lang.String>> fJNWhG;
    public java.lang.String fZBcTu;
    public final MutableLiveData<C32989mnw<Application>> fetchVPNInfo;
    public ChannelCategoryCode finit;
    public final MutableLiveData<C32989mnw<TaskDescription>> gEmmrt;
    public java.lang.String gHZMYf;
    public int getFieldNames;
    public java.lang.String getNewProxyInstance;
    public int hDKMBd;
    public final MutableLiveData<C32989mnw<lKA>> isConnected;
    public java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> iwGUEr;
    public java.lang.String sSMYrx;
    public java.lang.String uzCIH;
    public final MutableLiveData<C32989mnw<java.lang.String>> valueOf;
    public final MutableLiveData<C32989mnw<kotlin.Pair<ChannelCategoryCode, B2CQuoteBean>>> values;
    public java.lang.String wlaJM;
    public final lyX zLjUOn;
    public final lyM zsXlph;
    public boolean zuBGHE;

    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Dialog {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChannelCategoryCode.values().length];
            try {
                iArr[ChannelCategoryCode.THIRD_PARTY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChannelCategoryCode.BALANCE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChannelCategoryCode.NATIVE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(int i) {
        this.hDKMBd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fARcdN = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AxsJAY = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.QVAiDq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OcIXYQ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<java.lang.Boolean>> AkhnZx() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<java.lang.Boolean>> AuCTel() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AuCTelauCTel() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AubY() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AwvSrB() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AxsJAY() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DTwDnp() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ORxRYg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(int i) {
        this.getFieldNames = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DTwDnp = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AwvSrB = str;
    }

    public abstract void OLrzqt(@NotNull java.lang.String str, java.lang.String str2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ORxRYg() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OcIXYQ() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QKVWgx() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QOLQEE() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Application>> QUSxYX() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelCategoryCode QVAiDq() {
        return this.finit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String QbewEr() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<Activity>> RJOkX() {
        return this.AkhnZx;
    }

    public abstract void RcXXUw();

    public abstract TradeType UeEOUB();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int aKErDB() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.dxcTrN = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "");
        this.fIwbmz = channel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.QKVWgx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.fZBcTu = str;
        this.AwvSrB = str2;
        this.OcIXYQ = str3;
        this.QOLQEE = str4;
        this.dxcTrN = i;
        this.getFieldNames = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> list) {
        this.iwGUEr = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<java.lang.Boolean>> dNCPSb() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.QOLQEE = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<kotlin.Pair<ChannelCategoryCode, B2CQuoteBean>>> djSkpj() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<java.lang.String>> dvKsVJ() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<java.lang.Boolean>> dxcTrN() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ejfBZ() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<TaskDescription>> fFgQHt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<java.lang.String>> fIwbmz() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String fJNWhG() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<java.lang.String>> fZBcTu() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<TaskDescription>> fetchVPNInfo() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<C31434ltu>> finit() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean flVtFt() {
        return this.fIwbmz != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<kotlin.Pair<ChannelCategoryCode, B2CQuoteBean>>> fvQaOB() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.QfsBiF = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<lKA>> gGvvIC() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gHZMYf() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<java.lang.Boolean>> gasjUx() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getFieldNames() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<C31434ltu>> getNewProxyInstance() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int hDKMBd() {
        return this.hDKMBd;
    }

    public abstract void hUfVAv();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean iRxXKY() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean iZzfmt() {
        return this.AxsJAY;
    }

    public abstract void isConnected();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void isConnected(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fZBcTu = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int iwGUEr() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String sSMYrx() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String uzCIH() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.QbewEr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C32989mnw<java.lang.String>> values() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String wlaJM() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zLjUOn() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zsXlph() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String zuBGHE() {
        return this.QVAiDq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lKH(@NotNull lyX lyx, @NotNull lyM lym) {
        super(lym);
        Intrinsics.checkNotNullParameter(lyx, "");
        Intrinsics.checkNotNullParameter(lym, "");
        this.zLjUOn = lyx;
        this.zsXlph = lym;
        this.OcIXYQ = "USD";
        this.QOLQEE = "BTC";
        this.fZBcTu = "";
        this.AwvSrB = "";
        this.QVAiDq = "";
        this.QbewEr = "";
        this.QfsBiF = "Card payment";
        this.dxcTrN = 1;
        this.fARcdN = "";
        this.getFieldNames = 2;
        this.ORxRYg = "";
        this.finit = ChannelCategoryCode.THIRD_PARTY;
        this.aKErDB = "";
        this.dNCPSb = "";
        this.UeEOUB = "";
        this.RcXXUw = "";
        this.gHZMYf = "";
        this.sSMYrx = "";
        this.QKVWgx = "";
        this.DTwDnp = "";
        this.fFgQHt = "";
        this.QUSxYX = "";
        this.RJOkX = "";
        this.djSkpj = "";
        this.getNewProxyInstance = "";
        this.wlaJM = "";
        this.AuCTelauCTel = "";
        this.uzCIH = "USDT";
        this.AuCTel = "";
        this.DbNXlk = new MutableLiveData<>();
        this.isConnected = new MutableLiveData<>();
        this.djBIcL = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.fJNWhG = new MutableLiveData<>();
        this.AkhnZx = new MutableLiveData<>();
        this.fetchVPNInfo = new MutableLiveData<>();
        this.valueOf = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.AYXKKw = new MutableLiveData<>();
        this.ejfBZ = new MutableLiveData<>();
    }

    public static /* synthetic */ void updateDescription$default(lKH lkh, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateDescription");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        lkh.OLrzqt(str, str2);
    }

    public final com.okinc.okpaymentapi.data.remote.model.management.Channel fARcdN() {
        com.okinc.okpaymentapi.data.remote.model.management.Channel channel = this.fIwbmz;
        if (channel != null) {
            return channel;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lKH.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Application extends Activity {
            public final boolean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = application.OLrzqt;
                }
                return application.AEQbTJ(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(boolean z) {
                return new Application(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean copydefault() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && this.OLrzqt == ((Application) obj).OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Boolean.hashCode(this.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "State(enable=" + this.OLrzqt + ")";
            }

            public Application(boolean z) {
                super(null);
                this.OLrzqt = z;
            }
        }

        private Activity() {
        }

        public static final class TaskDescription extends Activity {
            public final boolean AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = taskDescription.AEQbTJ;
                }
                return taskDescription.EZpvd(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription EZpvd(boolean z) {
                return new TaskDescription(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && this.AEQbTJ == ((TaskDescription) obj).AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Boolean.hashCode(this.AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Loading(loading=" + this.AEQbTJ + ")";
            }

            public TaskDescription(boolean z) {
                super(null);
                this.AEQbTJ = z;
            }
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static abstract class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lKH.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class TaskDescription extends Application {
            public final boolean EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = taskDescription.EZpvd;
                }
                return taskDescription.AEQbTJ(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription AEQbTJ(boolean z) {
                return new TaskDescription(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean OLrzqt() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && this.EZpvd == ((TaskDescription) obj).EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Boolean.hashCode(this.EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ShowInSufficientBalanceDialog(show=" + this.EZpvd + ")";
            }

            public TaskDescription(boolean z) {
                super(null);
                this.EZpvd = z;
            }
        }

        private Application() {
        }

        public static final class ActionBar extends Application {
            public static final ActionBar AEQbTJ = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }

        public static final class StateListAnimator extends Application {
            public static final StateListAnimator KWHzl = new StateListAnimator();

            private StateListAnimator() {
                super(null);
            }
        }

        public static final class Activity extends Application {
            public static final Activity OLrzqt = new Activity();

            private Activity() {
                super(null);
            }
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription {
        public final java.lang.String EZpvd;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = taskDescription.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = taskDescription.EZpvd;
            }
            return taskDescription.OLrzqt(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TaskDescription(str, str2);
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) taskDescription.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) taskDescription.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "AmountCard(amount=" + this.copydefault + ", currency=" + this.EZpvd + ")";
        }

        public TaskDescription(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = str;
            this.EZpvd = str2;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static abstract class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lKH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class ActionBar extends StateListAnimator {
            public com.okinc.okpaymentapi.data.remote.model.management.Channel EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    channel = actionBar.EZpvd;
                }
                return actionBar.EZpvd(channel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar EZpvd(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
                Intrinsics.checkNotNullParameter(channel, "");
                return new ActionBar(channel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final com.okinc.okpaymentapi.data.remote.model.management.Channel KWHzl() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.EZpvd, ((ActionBar) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnChannelClicked(channelBean=" + this.EZpvd + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
                super(null);
                Intrinsics.checkNotNullParameter(channel, "");
                this.EZpvd = channel;
            }
        }

        private StateListAnimator() {
        }

        public static final class Activity extends StateListAnimator {
            public com.okinc.okpaymentapi.data.remote.model.management.Channel KWHzl;
            public PaymentMethod copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, PaymentMethod paymentMethod, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    channel = activity.KWHzl;
                }
                if ((i & 2) != 0) {
                    paymentMethod = activity.copydefault;
                }
                return activity.EZpvd(channel, paymentMethod);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity EZpvd(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, @NotNull PaymentMethod paymentMethod) {
                Intrinsics.checkNotNullParameter(channel, "");
                Intrinsics.checkNotNullParameter(paymentMethod, "");
                return new Activity(channel, paymentMethod);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PaymentMethod KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final com.okinc.okpaymentapi.data.remote.model.management.Channel copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Activity)) {
                    return false;
                }
                Activity activity = (Activity) obj;
                return Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && Intrinsics.EZpvd(this.copydefault, activity.copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnPaymentMethodClicked(channel=" + this.KWHzl + ", paymentMethod=" + this.copydefault + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, @NotNull PaymentMethod paymentMethod) {
                super(null);
                Intrinsics.checkNotNullParameter(channel, "");
                Intrinsics.checkNotNullParameter(paymentMethod, "");
                this.KWHzl = channel;
                this.copydefault = paymentMethod;
            }
        }

        /* JADX INFO: renamed from: o.lKH$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0870StateListAnimator extends StateListAnimator {
            public final PaymentMethodSelectionViewModel KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0870StateListAnimator copy$default(C0870StateListAnimator c0870StateListAnimator, PaymentMethodSelectionViewModel paymentMethodSelectionViewModel, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    paymentMethodSelectionViewModel = c0870StateListAnimator.KWHzl;
                }
                return c0870StateListAnimator.copydefault(paymentMethodSelectionViewModel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final PaymentMethodSelectionViewModel KWHzl() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0870StateListAnimator copydefault(@NotNull PaymentMethodSelectionViewModel paymentMethodSelectionViewModel) {
                Intrinsics.checkNotNullParameter(paymentMethodSelectionViewModel, "");
                return new C0870StateListAnimator(paymentMethodSelectionViewModel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0870StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((C0870StateListAnimator) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnChannelReload(selectionViewModel=" + this.KWHzl + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0870StateListAnimator(@NotNull PaymentMethodSelectionViewModel paymentMethodSelectionViewModel) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethodSelectionViewModel, "");
                this.KWHzl = paymentMethodSelectionViewModel;
            }
        }

        public static final class Dialog extends StateListAnimator {
            public static final Dialog AEQbTJ = new Dialog();

            private Dialog() {
                super(null);
            }
        }

        public static final class TaskDescription extends StateListAnimator {
            public static final TaskDescription copydefault = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }

        public static final class Application extends StateListAnimator {
            public static final int OLrzqt = com.okinc.okpaymentapi.data.remote.model.management.Channel.$stable;
            public final com.okinc.okpaymentapi.data.remote.model.management.Channel EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    channel = application.EZpvd;
                }
                return application.OLrzqt(channel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application OLrzqt(com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
                return new Application(channel);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.EZpvd, ((Application) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                com.okinc.okpaymentapi.data.remote.model.management.Channel channel = this.EZpvd;
                if (channel == null) {
                    return 0;
                }
                return channel.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnCTAButtonClicked(channel=" + this.EZpvd + ")";
            }

            public Application(com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
                super(null);
                this.EZpvd = channel;
            }
        }
    }

    public final void fetchVPNInfo(@NotNull java.lang.String str) {
        java.lang.String type;
        Intrinsics.checkNotNullParameter(str, "");
        C31349lsO c31349lsO = C31349lsO.EZpvd;
        java.lang.String type2 = PaymentsReporterProperty.PaymentsReportAttrPage.PAYMENT_LIST.getType();
        if (UeEOUB() == TradeType.BUY) {
            type = PaymentsReporterProperty.PaymentsReportAttrType.BUY.getType();
        } else {
            type = PaymentsReporterProperty.PaymentsReportAttrType.SELL.getType();
        }
        c31349lsO.AEQbTJ(type2, type, str);
    }

    public final void EZpvd(boolean z) {
        mHA.OLrzqt.OLrzqt(this.AkhnZx, new Activity.TaskDescription(z));
    }

    public static /* synthetic */ void updateAmountCard$default(lKH lkh, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAmountCard");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        lkh.KWHzl(str, str2);
    }

    public final void KWHzl(@NotNull java.lang.String str, java.lang.String str2) {
        java.lang.String strCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        if (str2 == null || (strCopydefault = C31661lzi.copydefault(str2, false)) == null) {
            strCopydefault = "--";
        }
        if (str2 != null) {
            this.AwvSrB = str2;
        }
        this.QOLQEE = str;
        mHA.OLrzqt.OLrzqt(this.gEmmrt, new TaskDescription(strCopydefault, str));
    }

    public final void AxsJAYaxsJAY() {
        mHA.OLrzqt.OLrzqt(this.AYXKKw, java.lang.Boolean.TRUE);
    }

    public final void gkJEwt() {
        mHA.OLrzqt.OLrzqt(this.AYXKKw, java.lang.Boolean.FALSE);
    }

    public final void onEventTrigger(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        if (stateListAnimator instanceof StateListAnimator.ActionBar) {
            KWHzl(((StateListAnimator.ActionBar) stateListAnimator).KWHzl());
            fetchVPNInfo(this.QfsBiF);
            return;
        }
        if (stateListAnimator instanceof StateListAnimator.C0870StateListAnimator) {
            ((StateListAnimator.C0870StateListAnimator) stateListAnimator).KWHzl().wlaJM();
            return;
        }
        if (stateListAnimator instanceof StateListAnimator.Activity) {
            StateListAnimator.Activity activity = (StateListAnimator.Activity) stateListAnimator;
            EZpvd(activity.copydefault(), activity.KWHzl());
            if (!this.AxsJAY) {
                RcXXUw();
                return;
            } else {
                if (C33129mqd.AEQbTJ(this.fZBcTu) > AudioStats.AUDIO_AMPLITUDE_NONE) {
                    hUfVAv();
                    return;
                }
                return;
            }
        }
        if (Intrinsics.EZpvd(stateListAnimator, StateListAnimator.Dialog.AEQbTJ)) {
            isConnected();
            return;
        }
        if (stateListAnimator instanceof StateListAnimator.Application) {
            if (this.AxsJAY) {
                mHA.OLrzqt.OLrzqt(this.fetchVPNInfo, Application.Activity.OLrzqt);
                return;
            } else {
                mHA.OLrzqt.OLrzqt(this.fetchVPNInfo, Application.ActionBar.AEQbTJ);
                return;
            }
        }
        if (!(stateListAnimator instanceof StateListAnimator.TaskDescription)) {
            throw new NoWhenBranchMatchedException();
        }
        RlQdEF();
        mHA.OLrzqt.OLrzqt(this.fetchVPNInfo, Application.StateListAnimator.KWHzl);
    }

    public final void EZpvd(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, @NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(channel, "");
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        this.aKErDB = paymentMethod.getPayment();
        this.dNCPSb = paymentMethod.getPayment();
        this.UeEOUB = paymentMethod.getPayment();
        this.RcXXUw = C33492mxV.OLrzqt() ? paymentMethod.getIconUrlNight() : paymentMethod.getIconUrl();
    }

    public final void OLrzqt(com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        if (channel != null) {
            if (UeEOUB() == TradeType.BUY && channel.getCategoryCode() == ChannelCategoryCode.BALANCE && !EZpvd(this.fZBcTu, channel)) {
                AxsJAYsNCnLh();
                mHA.OLrzqt.OLrzqt(this.fetchVPNInfo, new Application.TaskDescription(true));
            } else {
                mHA.OLrzqt.OLrzqt(this.fetchVPNInfo, new Application.TaskDescription(false));
            }
        }
    }

    public final boolean EZpvd(java.lang.String str, com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        return C33129mqd.EZpvd(C33129mqd.subS$default(EZpvd(channel), str, null, null, null, 14, null)).compareTo(BigDecimal.ZERO) >= 0;
    }

    public final java.lang.String EZpvd(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        java.util.ArrayList arrayList;
        PaymentMethod paymentMethod;
        com.okinc.okpaymentapi.data.remote.model.management.Account account;
        java.lang.String availableBalance;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(channel, "");
        java.util.List<PaymentMethod> paymentMethods = channel.getPaymentMethods();
        if (paymentMethods != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : paymentMethods) {
                if (Intrinsics.EZpvd((java.lang.Object) ((PaymentMethod) obj).getPaymentMethodType(), (java.lang.Object) "Balance")) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList) && arrayList != null && (paymentMethod = (PaymentMethod) arrayList.get(0)) != null && (account = paymentMethod.getAccount()) != null && (availableBalance = account.getAvailableBalance()) != null) {
            str = availableBalance;
        }
        this.AuCTel = str;
        return str;
    }

    public final void KWHzl(com.okinc.okpaymentapi.data.remote.model.management.Channel channel) {
        java.lang.String strGEmmrt;
        copydefault(channel);
        if (C33492mxV.OLrzqt()) {
            strGEmmrt = C33129mqd.gEmmrt(channel.getIconUrlNight());
        } else {
            strGEmmrt = C33129mqd.gEmmrt(channel.getIconUrl());
        }
        this.gHZMYf = strGEmmrt;
        this.QfsBiF = channel.getDepositName();
        this.AwvSrB = channel.getBaseAmount();
        this.fZBcTu = channel.getQuoteAmount();
        this.finit = channel.getCategoryCode();
        this.getNewProxyInstance = channel.getDepositPlatformCode();
        this.AubY = channel.isConvert();
        this.zuBGHE = channel.getChangeDisplay();
        this.AuCTelauCTel = channel.getDisplayName();
        this.wlaJM = channel.getDepositName();
        mHA.OLrzqt.OLrzqt(this.fJNWhG, this.QfsBiF);
        OLrzqt(this.OcIXYQ, channel.getQuoteAmount());
        KWHzl(this.QOLQEE, channel.getBaseAmount());
    }

    public final void giSNqX() {
        if (flVtFt()) {
            QKudOq();
            this.AubY = fARcdN().isConvert();
            this.getNewProxyInstance = C33129mqd.gEmmrt(fARcdN().getDepositPlatformCode());
            int i = Dialog.OLrzqt[this.finit.ordinal()];
            if (i == 1) {
                if (this.AubY) {
                    mHA.OLrzqt.OLrzqt(this.djBIcL, "qp_flow_third");
                    QfsBiF();
                    return;
                } else {
                    mHA.OLrzqt.OLrzqt(this.djBIcL, "third");
                    EZpvd(false);
                    isConnected();
                    return;
                }
            }
            if (i == 2) {
                EZpvd(false);
                isConnected();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                EZpvd(false);
                isConnected();
            }
        }
    }

    public final void QfsBiF() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BasePaymentMethodViewModel$getQuoteAndShowQPDialog$1(this, null), 3, null);
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("PaymentMethod_Btm_Next_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lKG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lKH.EZpvd(str, str2, this, str3, (EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(java.lang.String str, java.lang.String str2, lKH lkh, java.lang.String str3, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("payment_channel", str, false);
        eventParamsList.put(OtcExtraKeys.EXTRA_PAYMENT_METHOD, str2, false);
        EventParamsList.put$default(eventParamsList, "token", lkh.QOLQEE, false, 4, null);
        EventParamsList.put$default(eventParamsList, "currency", lkh.OcIXYQ, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str3, false, 4, null);
        eventParamsList.put("flow", lkh.UeEOUB() == TradeType.BUY ? "buy" : "sell", true);
        return Unit.INSTANCE;
    }

    public final void DAIeex() {
        C31354lsT.KWHzl.OLrzqt(UeEOUB(), this.OcIXYQ, this.QOLQEE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        C31354lsT.KWHzl.KWHzl(UeEOUB(), this.QOLQEE, this.OcIXYQ, (8 & 8) != 0 ? "" : null, C34754niS.AEQbTJ.KWHzl(), "fail", str2, str, str3);
    }

    public final void accept() {
        java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> list = this.iwGUEr;
        if (list == null || list.size() <= 1) {
            return;
        }
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("app_express_c2c_confirm_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lKI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lKH.copydefault(this.EZpvd, (EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(lKH lkh, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String upperCase = lkh.OcIXYQ.toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        eventParamsList.put(OtcExtraKeys.QUOTE_CURRENCY, upperCase, true);
        eventParamsList.put("selected_channe", lkh.fARcdN, true);
        eventParamsList.put("page_click", "back", true);
        eventParamsList.put("p2p_only", "withoutp2p", true);
        return Unit.INSTANCE;
    }

    public final void values(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("app_buycrypto_card_confirm_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lKD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lKH.copydefault(this.EZpvd, str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit copydefault(lKH lkh, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("device_type", "Android", true);
        eventParamsList.put("crypto_currency", lkh.QOLQEE, false);
        eventParamsList.put("fiat_currency", lkh.OcIXYQ, false);
        eventParamsList.put("type", lkh.UeEOUB().getType(), true);
        eventParamsList.put("fiat_currency_money", lkh.fZBcTu, false);
        eventParamsList.put("crypto_currency_money", lkh.AwvSrB, false);
        eventParamsList.put("jump_to", str, false);
        eventParamsList.put(AppsFlyerProperties.CHANNEL, lkh.fARcdN, false);
        return Unit.INSTANCE;
    }

    public final void AxsJAYsNCnLh() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("PaymentMethod_Sheet_Balance_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
    }

    public final void RlQdEF() {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.onEvent$default("PaymentMethod_Sheet_Balance_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1) null, 2, (java.lang.Object) null);
    }

    public final void QKudOq() {
        java.util.List<com.okinc.okpaymentapi.data.remote.model.management.Channel> list = this.iwGUEr;
        if (list == null || list.size() <= 1) {
            return;
        }
        final java.lang.String str = Dialog.OLrzqt[this.finit.ordinal()] == 1 ? "third" : "";
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("app_express_c2c_confirm_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lKL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lKH.EZpvd(this.OLrzqt, str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit EZpvd(lKH lkh, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String upperCase = lkh.OcIXYQ.toUpperCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        eventParamsList.put(OtcExtraKeys.QUOTE_CURRENCY, upperCase, true);
        eventParamsList.put("selected_channe", str, true);
        eventParamsList.put("page_click", Web3SecurityTrackEvent.VALUE_CONFIRM, true);
        eventParamsList.put("p2p_only", "withoutp2p", true);
        return Unit.INSTANCE;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lKH.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
