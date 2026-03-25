package o;

import androidx.compose.material3.CalendarModelKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.business.defi.biz.constant.EOSState;
import com.okinc.business.defi.biz.constant.WalletSyncStatus;
import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import com.okinc.business.defi.biz.core.error.OKWAssetAllException;
import com.okinc.business.defi.biz.core.ticker.WalletTickerManager;
import com.okinc.business.defi.biz.core.ws.channel.WalletApprovalRiskSubManager;
import com.okinc.business.defi.biz.core.ws.channel.WalletCoinAssetSubManager;
import com.okinc.business.defi.biz.core.ws.channel.WalletCoinSubManager;
import com.okinc.business.defi.biz.core.ws.channel.WalletDefiAssetSubManager;
import com.okinc.business.defi.biz.core.ws.channel.WalletInformSubManager;
import com.okinc.business.defi.biz.core.ws.channel.WalletNftAssetSubManager;
import com.okinc.business.defi.biz.core.ws.channel.WalletPnlSubManager;
import com.okinc.business.defi.biz.core.ws.channel.bean.WalletEIP7702StatusData;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetPartialEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetPnlEntity;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.biz.net.bean.ReportRiskyTokenReq;
import com.okinc.business.defi.biz.net.bean.ReportRiskyTokenResp;
import com.okinc.business.defi.wallet.home.WalletViewModel$checkMainWalletSyncStatus$1;
import com.okinc.business.defi.wallet.home.WalletViewModel$fetchMainWalletTeeAndEIP7702Status$1;
import com.okinc.business.defi.wallet.home.WalletViewModel$fetchMetaData$1;
import com.okinc.business.defi.wallet.home.WalletViewModel$requestAllHomeData$1;
import com.okinc.business.defi.wallet.home.WalletViewModel$requestAllHomeData$7$1$1;
import com.okinc.business.defi.wallet.home.WalletViewModel$requestAllHomeData$7$2$1;
import com.okinc.business.defi.wallet.home.WalletViewModel$updateTeeGuideStatus$1;
import com.okinc.business.defi.wallet.home.WalletViewModel$walletInformSubListener$1$onSubData$3$1;
import com.okinc.business.defi.wallet.home.escapebind.model.EscapeBindStatusResp;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.amplitude.AmplitudeName;
import com.okinc.core.util.SPUtils;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.core.ws.WalletWSBaseArgsChannel;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.rx2.RxSingleKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import o.C10407bnq;
import o.C10614brl;
import o.C10619brq;
import o.C12827cuN;
import o.C13754dXa;
import o.C15530eLt;
import o.InterfaceC13426dKx;
import o.InterfaceC9742bbN;
import o.eUI;
import o.xZF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eUI extends AbstractC33073mpa {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final MutableLiveData<java.lang.Boolean> AEQbTJ;
    public final Application AYXKKw;
    public final C14448dle<java.lang.Boolean> AhwBna;
    public final Fragment AkhnZx;
    public final java.util.List<C10525bqB> AuCTel;
    public volatile boolean AuCTelauCTel;
    public java.lang.Boolean AubY;
    public final MutableLiveData<Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer>> AwvSrB;
    public boolean AxsJAY;
    public InterfaceC58217yxC AxsJAYaxsJAY;
    public final WalletTickerManager AxsJAYsNCnLh;
    public final FragmentManager DTwDnp;
    public final InterfaceC56387yDm DbNXlk;
    public final MutableLiveData<java.lang.Boolean> EZpvd;
    public final java.lang.String OLrzqt;
    public boolean ORxRYg;
    public final LiveData<java.lang.Boolean> OcIXYQ;
    public long QKVWgx;
    public final MutableLiveData<AbstractC12782ctV> QOLQEE;
    public Function0<Unit> QUSxYX;
    public final MutableLiveData<java.lang.Boolean> QVAiDq;
    public long QbewEr;
    public InterfaceC58217yxC QfsBiF;
    public boolean RJOkX;
    public final LiveData<java.lang.Boolean> RcXXUw;
    public boolean UeEOUB;
    public final MutableLiveData<java.lang.Boolean> aKErDB;
    public final MutableSharedFlow<AbstractC12782ctV> copydefault;
    public final MutableLiveData<java.lang.Boolean> dNCPSb;
    public xZH<WalletCoinAssetSubManager.SubResponse, WalletDefiAssetSubManager.SubResponse, WalletNftAssetSubManager.SubResponse> djBIcL;
    public final SharedFlow<AbstractC12782ctV> djSkpj;
    public final xZA dvKsVJ;
    public final C17926fXk dxcTrN;
    public boolean ejfBZ;
    public boolean fARcdN;
    public final C17924fXi fFgQHt;
    public volatile boolean fIwbmz;
    public final android.os.Handler fJNWhG;
    public final MutableLiveData<AbstractC12782ctV> fZBcTu;
    public final MutableLiveData<java.lang.Boolean> fetchVPNInfo;
    public final C18269ffH finit;
    public java.util.ArrayList<eUG> flVtFt;
    public InterfaceC58217yxC fvQaOB;
    public final MutableLiveData<C32989mnw<java.lang.Integer>> gEmmrt;
    public java.util.List<C10525bqB> gGvvIC;
    public java.lang.String gHZMYf;
    public final MutableLiveData<java.util.ArrayList<eUG>> gasjUx;
    public boolean getFieldNames;
    public final LiveData<java.lang.Boolean> getNewProxyInstance;
    public InterfaceC58217yxC giSNqX;
    public final Dialog gkJEwt;
    public boolean hDKMBd;
    public final AssistContent hUfVAv;
    public final eZZ iRxXKY;
    public final InterfaceC56387yDm iZzfmt;
    public final C15275eCh isConnected;
    public final MutableLiveData<java.lang.String> iwGUEr;
    public long sSMYrx;
    public final MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.String>> uzCIH;
    public InterfaceC58217yxC valueOf;
    public final TaskDescription values;
    public java.lang.Boolean wlaJM;
    public java.lang.Boolean zLjUOn;
    public java.lang.Boolean zsXlph;
    public boolean zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public eUI() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final kotlin.Pair KWHzl(kotlin.Pair pair, java.lang.Integer num, Unit unit) {
        Intrinsics.checkNotNullParameter(num, "");
        Intrinsics.checkNotNullParameter(unit, "");
        return pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(long j) {
        this.QbewEr = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.getFieldNames = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C32989mnw<java.lang.Integer>> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(boolean z) {
        this.UeEOUB = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> AkhnZx() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> AuCTel() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTelauCTel() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final eZZ AubY() {
        return this.iRxXKY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String DbNXlk() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(long j) {
        this.QKVWgx = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gHZMYf = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.hDKMBd = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(boolean z) {
        this.RJOkX = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long ejfBZ() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<AbstractC12782ctV> fARcdN() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long fJNWhG() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC12782ctV> getFieldNames() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> getNewProxyInstance() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> hDKMBd() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> isConnected() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> iwGUEr() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> uzCIH() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<java.lang.Integer, java.lang.String>> values() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.util.ArrayList<eUG>> zsXlph() {
        return this.gasjUx;
    }

    public static final class AssistContent extends xZF.TaskDescription<WalletInformSubManager.SubResponse> {

        public static final class Activity implements Function1<WalletInformSubManager.SubResponse, java.lang.Boolean> {
            public final /* synthetic */ AbstractC12782ctV AEQbTJ;
            public final /* synthetic */ int OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(int i, AbstractC12782ctV abstractC12782ctV) {
                this.OLrzqt = i;
                this.AEQbTJ = abstractC12782ctV;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public final java.lang.Boolean invoke(WalletInformSubManager.SubResponse subResponse) {
                Intrinsics.checkNotNullParameter(subResponse, "");
                return java.lang.Boolean.valueOf(subResponse.getType() == this.OLrzqt && subResponse.getAddress().length() > 0 && this.AEQbTJ.DbNXlk(subResponse.getAddress()));
            }
        }

        public static final class StateListAnimator implements Function1<WalletInformSubManager.SubResponse, WalletEIP7702StatusData> {
            public static final StateListAnimator EZpvd = new StateListAnimator();

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX WARN: Type inference failed for: r3v2, types: [com.okinc.business.defi.biz.core.ws.channel.bean.WalletEIP7702StatusData, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public final WalletEIP7702StatusData invoke(WalletInformSubManager.SubResponse subResponse) {
                Intrinsics.checkNotNullParameter(subResponse, "");
                Json jsonAEQbTJ = C33489mxS.KWHzl.AEQbTJ();
                JsonElement data = subResponse.getData();
                jsonAEQbTJ.getSerializersModule();
                return jsonAEQbTJ.decodeFromJsonElement(WalletEIP7702StatusData.Companion.serializer(), data);
            }
        }

        public AssistContent(xZA xza) {
            super("subInform-home", xza);
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(java.util.List<WalletInformSubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            super.EZpvd(list);
            final AbstractC12782ctV value = eUI.this.fARcdN().getValue();
            if (value == null) {
                return;
            }
            java.util.List listZuBGHE = C59467zhb.zuBGHE(C59467zhb.fetchVPNInfo(C59467zhb.fetchVPNInfo(C59467zhb.DbNXlk(CollectionsKt___CollectionsKt.QVAiDq(list), new Activity(1, value)), StateListAnimator.EZpvd), new Function1() { // from class: o.eVL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eUI.AssistContent.AEQbTJ(value, (WalletEIP7702StatusData) obj);
                }
            }));
            eUI eui = eUI.this;
            if (listZuBGHE == null || listZuBGHE.isEmpty()) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(eui), null, null, new WalletViewModel$walletInformSubListener$1$onSubData$3$1(eui, listZuBGHE, null), 3, null);
        }

        public static final C11449cOr AEQbTJ(AbstractC12782ctV abstractC12782ctV, WalletEIP7702StatusData walletEIP7702StatusData) {
            Intrinsics.checkNotNullParameter(walletEIP7702StatusData, "");
            return new C11449cOr(abstractC12782ctV.DbNXlk(), walletEIP7702StatusData.getChainIndex(), walletEIP7702StatusData.getStatus());
        }
    }

    public static final class LoaderManager<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(java.lang.Long.valueOf(-((C10594brR) t).fetchVPNInfo().gEmmrt()), java.lang.Long.valueOf(-((C10594brR) t2).fetchVPNInfo().gEmmrt()));
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0065: CONSTRUCTOR 
  (wrap:o.eZZ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.eZZ:0x000c: CONSTRUCTOR 
  (null o.dnn)
  (null com.okinc.business.defi.common.utils.ReferralManager)
  (null kotlinx.coroutines.CoroutineDispatcher)
  (7 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(o.dnn, com.okinc.business.defi.common.utils.ReferralManager, kotlinx.coroutines.CoroutineDispatcher, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:112) call: o.eZY.<init>(o.dnn, com.okinc.business.defi.common.utils.ReferralManager, kotlinx.coroutines.CoroutineDispatcher, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r7v0 o.eZZ))
  (wrap:o.eCh:0x0021: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.eCh:0x001d: INVOKE 
  (wrap:o.dKx:0x0019: INVOKE 
  (wrap:android.app.Application:0x0015: INVOKE (wrap:o.baC$Activity:0x0013: SGET  A[WRAPPED] (LINE:113) o.baC.Companion o.baC$Activity) VIRTUAL call: o.baC.Activity.AEQbTJ():android.app.Application A[MD:():android.app.Application (m), WRAPPED] (LINE:113))
 STATIC call: o.dMb.EZpvd(android.content.Context):o.dKx A[MD:(android.content.Context):o.dKx (m), WRAPPED] (LINE:113))
 INTERFACE call: o.dKx.AhwBna():o.eCh A[MD:():o.eCh (m), WRAPPED] (LINE:113)) : (r8v0 o.eCh))
  (wrap:o.fXk:0x0037: TERNARY null = ((wrap:int:0x0022: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.fXk:0x0034: CONSTRUCTOR 
  (wrap:o.fVJ:0x002e: INVOKE 
  (wrap:o.dKx:0x002a: INVOKE 
  (wrap:o.dKx$TaskDescription:0x0028: SGET  A[WRAPPED] (LINE:115) o.dKx.Companion o.dKx$TaskDescription)
  (null android.content.Context)
  (1 int)
  (null java.lang.Object)
 STATIC call: o.dKx.TaskDescription.getInstance$default(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx A[MD:(o.dKx$TaskDescription, android.content.Context, int, java.lang.Object):o.dKx (m), WRAPPED] (LINE:115))
 INTERFACE call: o.dKx.getFieldNames():o.fVJ A[MD:():o.fVJ (m), WRAPPED] (LINE:115))
 A[MD:(o.fVJ):void (m), WRAPPED] (LINE:114) call: o.fXk.<init>(o.fVJ):void type: CONSTRUCTOR) : (r9v0 o.fXk))
  (wrap:o.fXi:0x0054: TERNARY null = ((wrap:int:0x0038: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.fXi:0x0051: CONSTRUCTOR 
  (wrap:o.fVK:0x004c: CONSTRUCTOR 
  (wrap:o.dbu:0x0046: INVOKE 
  (wrap:o.dKx:0x0042: INVOKE 
  (wrap:android.app.Application:0x003e: INVOKE (wrap:o.baC$Activity:0x003c: SGET  A[WRAPPED] (LINE:119) o.baC.Companion o.baC$Activity) VIRTUAL call: o.baC.Activity.AEQbTJ():android.app.Application A[MD:():android.app.Application (m), WRAPPED] (LINE:119))
 STATIC call: o.dMb.EZpvd(android.content.Context):o.dKx A[MD:(android.content.Context):o.dKx (m), WRAPPED] (LINE:119))
 INTERFACE call: o.dKx.DTwDnp():o.dbu A[MD:():o.dbu (m), WRAPPED] (LINE:119))
 A[MD:(o.dbu):void (m), WRAPPED] (LINE:118) call: o.fVK.<init>(o.dbu):void type: CONSTRUCTOR)
 A[MD:(o.fVN):void (m), WRAPPED] (LINE:117) call: o.fXi.<init>(o.fVN):void type: CONSTRUCTOR) : (r10v0 o.fXi))
  (wrap:o.ffH:?: TERNARY null = ((wrap:int:0x0055: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:o.ffH:0x005b: CONSTRUCTOR 
  (null o.brl)
  (1 int)
  (wrap:byte:?: TERNARY null = ((0 byte) == true) ? (1 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) : (0 ??[int, float, boolean, short, byte, char, OBJECT, ARRAY]))
 A[MD:(o.brl, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:122) call: o.ffH.<init>(o.brl, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r11v0 o.ffH))
 A[MD:(o.eZZ, o.eCh, o.fXk, o.fXi, o.ffH):void (m)] (LINE:111) call: o.eUI.<init>(o.eZZ, o.eCh, o.fXk, o.fXi, o.ffH):void type: THIS */
    public /* synthetic */ eUI(eZZ ezz, C15275eCh c15275eCh, C17926fXk c17926fXk, C17924fXi c17924fXi, C18269ffH c18269ffH, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new eZY(null, null, null, 7, null) : ezz, (i & 2) != 0 ? C13458dMb.EZpvd(C9678baC.Companion.AEQbTJ()).AhwBna() : c15275eCh, (i & 4) != 0 ? new C17926fXk(InterfaceC13426dKx.TaskDescription.getInstance$default(InterfaceC13426dKx.Companion, null, 1, null).getFieldNames()) : c17926fXk, (i & 8) != 0 ? new C17924fXi(new fVK(C13458dMb.EZpvd(C9678baC.Companion.AEQbTJ()).DTwDnp())) : c17924fXi, (i & 16) != 0 ? new C18269ffH(null, 1, 0 == true ? 1 : 0) : c18269ffH);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eUI.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public eUI(@NotNull eZZ ezz, @NotNull C15275eCh c15275eCh, @NotNull C17926fXk c17926fXk, @NotNull C17924fXi c17924fXi, @NotNull C18269ffH c18269ffH) {
        Intrinsics.checkNotNullParameter(ezz, "");
        Intrinsics.checkNotNullParameter(c15275eCh, "");
        Intrinsics.checkNotNullParameter(c17926fXk, "");
        Intrinsics.checkNotNullParameter(c17924fXi, "");
        Intrinsics.checkNotNullParameter(c18269ffH, "");
        this.iRxXKY = ezz;
        this.isConnected = c15275eCh;
        this.dxcTrN = c17926fXk;
        this.fFgQHt = c17924fXi;
        this.finit = c18269ffH;
        this.OLrzqt = "WalletViewModel";
        this.QOLQEE = new MutableLiveData<>();
        this.fZBcTu = new MutableLiveData<>();
        MutableSharedFlow<AbstractC12782ctV> MutableSharedFlow = SharedFlowKt.MutableSharedFlow(1, 1, BufferOverflow.DROP_OLDEST);
        this.copydefault = MutableSharedFlow;
        this.djSkpj = FlowKt.asSharedFlow(MutableSharedFlow);
        this.gasjUx = new MutableLiveData<>();
        MutableLiveData<java.lang.Boolean> mutableLiveData = new MutableLiveData<>();
        this.AEQbTJ = mutableLiveData;
        this.OcIXYQ = mutableLiveData;
        C14448dle<java.lang.Boolean> c14448dle = new C14448dle<>();
        this.AhwBna = c14448dle;
        this.RcXXUw = c14448dle;
        this.QKVWgx = Long.MIN_VALUE;
        this.QbewEr = Long.MIN_VALUE;
        this.fJNWhG = new android.os.Handler(android.os.Looper.getMainLooper());
        this.aKErDB = new MutableLiveData<>();
        this.QVAiDq = new MutableLiveData<>();
        MutableLiveData<java.lang.Boolean> mutableLiveData2 = new MutableLiveData<>(java.lang.Boolean.FALSE);
        this.EZpvd = mutableLiveData2;
        this.getNewProxyInstance = mutableLiveData2;
        this.ejfBZ = true;
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.eUT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eUI.AEQbTJ();
            }
        });
        this.AwvSrB = new MutableLiveData<>();
        this.iwGUEr = new MutableLiveData<>();
        this.dNCPSb = new MutableLiveData<>();
        this.uzCIH = new MutableLiveData<>();
        this.fetchVPNInfo = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>(new C32989mnw(-1));
        this.gHZMYf = "";
        this.iZzfmt = C56392yDr.copydefault(new Function0() { // from class: o.eVg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eUI.KWHzl();
            }
        });
        this.AuCTelauCTel = true;
        this.fIwbmz = true;
        AbstractC58253yxm abstractC58253yxm = null;
        int i = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        xZA xza = new xZA(1000L, 1000L, abstractC58253yxm, i, defaultConstructorMarker);
        this.dvKsVJ = xza;
        TaskDescription taskDescription = new TaskDescription();
        this.values = taskDescription;
        this.gkJEwt = new Dialog();
        Fragment fragment = new Fragment();
        this.AkhnZx = fragment;
        FragmentManager fragmentManager = new FragmentManager();
        this.DTwDnp = fragmentManager;
        this.AYXKKw = new Application();
        this.hUfVAv = new AssistContent(new xZA(0L, 300L, abstractC58253yxm, i, defaultConstructorMarker));
        this.djBIcL = new ActionBar(xza, taskDescription, fragment, fragmentManager);
        this.AxsJAYsNCnLh = new WalletTickerManager();
        this.AxsJAY = true;
        this.ORxRYg = true;
        this.AuCTel = new java.util.ArrayList();
    }

    public static final class Activity {
        public final C10405bno AEQbTJ;
        public final java.util.ArrayList<eUG> EZpvd;
        public final java.util.List<C10525bqB> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eUI$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, C10405bno c10405bno, java.util.List list, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c10405bno = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                list = activity.OLrzqt;
            }
            if ((i & 4) != 0) {
                arrayList = activity.EZpvd;
            }
            return activity.copydefault(c10405bno, list, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C10525bqB> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C10405bno OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<eUG> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull C10405bno c10405bno, @NotNull java.util.List<C10525bqB> list, @NotNull java.util.ArrayList<eUG> arrayList) {
            Intrinsics.checkNotNullParameter(c10405bno, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            return new Activity(c10405bno, list, arrayList);
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
            return Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "HomeDataResult(assetsData=" + this.AEQbTJ + ", allCoinData=" + this.OLrzqt + ", uiData=" + this.EZpvd + ")";
        }

        public Activity(@NotNull C10405bno c10405bno, @NotNull java.util.List<C10525bqB> list, @NotNull java.util.ArrayList<eUG> arrayList) {
            Intrinsics.checkNotNullParameter(c10405bno, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.AEQbTJ = c10405bno;
            this.OLrzqt = list;
            this.EZpvd = arrayList;
        }
    }

    public final void copydefault(java.lang.String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletViewModel$updateTeeGuideStatus$1(str, this, null), 3, null);
    }

    public final InterfaceC25424iwU gEmmrt() {
        return (InterfaceC25424iwU) this.DbNXlk.getValue();
    }

    public static final InterfaceC25424iwU AEQbTJ() {
        return (InterfaceC25424iwU) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(InterfaceC25424iwU.class));
    }

    public final C13934dbu wlaJM() {
        return (C13934dbu) this.iZzfmt.getValue();
    }

    public static final C13934dbu KWHzl() {
        return new C13934dbu();
    }

    public static final class TaskDescription extends WalletCoinAssetSubManager.TaskDescription {
        public TaskDescription() {
            super("subAsset-home", null, null, false, 14, null);
        }
    }

    public static final class Dialog extends xZF.TaskDescription<WalletCoinSubManager.SubResponse> {
        public Dialog() {
            super("customCoin-home", null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class Fragment extends xZF.TaskDescription<WalletDefiAssetSubManager.SubResponse> {
        public Fragment() {
            super("subDefi-home", null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class FragmentManager extends xZF.TaskDescription<WalletNftAssetSubManager.SubResponse> {
        public FragmentManager() {
            super("subNft-home", null, 2, 0 == true ? 1 : 0);
        }
    }

    public static final class Application extends xZF.TaskDescription<WalletApprovalRiskSubManager.SubResponse> {
        public Application() {
            super("subApprovalRisk-home", null, 2, 0 == true ? 1 : 0);
        }

        @Override // o.xZF.TaskDescription
        public void copydefault(java.util.List<WalletApprovalRiskSubManager.SubResponse> list) {
            WalletApprovalRiskSubManager.SubResponse subResponse;
            java.lang.String address;
            Intrinsics.checkNotNullParameter(list, "");
            super.copydefault(list);
            AbstractC12782ctV value = eUI.this.fARcdN().getValue();
            if (value == null || (subResponse = (WalletApprovalRiskSubManager.SubResponse) CollectionsKt___CollectionsKt.firstOrNull(list)) == null || (address = subResponse.getAddress()) == null || !value.DbNXlk(address)) {
                return;
            }
            C15530eLt instance$default = C15530eLt.ActionBar.getInstance$default(C15530eLt.Companion, null, 1, null);
            java.lang.String strDbNXlk = value.DbNXlk();
            WalletApprovalRiskSubManager.SubResponse.ApproveRiskData data = subResponse.getData();
            java.lang.Boolean approvalAddressRiskyFlag = data != null ? data.getApprovalAddressRiskyFlag() : null;
            WalletApprovalRiskSubManager.SubResponse.ApproveRiskData data2 = subResponse.getData();
            java.lang.Long approvalAddressRiskyTimeStamp = data2 != null ? data2.getApprovalAddressRiskyTimeStamp() : null;
            WalletApprovalRiskSubManager.SubResponse.ApproveRiskData data3 = subResponse.getData();
            java.lang.Boolean longTimeNoActiveFlag = data3 != null ? data3.getLongTimeNoActiveFlag() : null;
            WalletApprovalRiskSubManager.SubResponse.ApproveRiskData data4 = subResponse.getData();
            instance$default.EZpvd(strDbNXlk, approvalAddressRiskyFlag, approvalAddressRiskyTimeStamp, longTimeNoActiveFlag, data4 != null ? data4.getLongTimeNoActiveFlagTimeStamp() : null);
        }
    }

    public static final class ActionBar extends xZH<WalletCoinAssetSubManager.SubResponse, WalletDefiAssetSubManager.SubResponse, WalletNftAssetSubManager.SubResponse> {
        public ActionBar(xZA xza, TaskDescription taskDescription, Fragment fragment, FragmentManager fragmentManager) {
            super(xza, taskDescription, fragment, fragmentManager);
        }

        @Override // o.xZH
        public void AEQbTJ(java.util.List<WalletCoinAssetSubManager.SubResponse> list, java.util.List<WalletDefiAssetSubManager.SubResponse> list2, java.util.List<WalletNftAssetSubManager.SubResponse> list3) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            boolean z = true;
            if ((!list.isEmpty()) || (!list2.isEmpty()) || (!list3.isEmpty())) {
                if ((list instanceof java.util.Collection) && list.isEmpty()) {
                    z = false;
                } else {
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(((WalletCoinAssetSubManager.SubResponse) it.next()).getCoinId());
                        if (c10854bwMKWHzl != null && c10854bwMKWHzl.giSNqX()) {
                            break;
                        }
                    }
                    z = false;
                }
                eUI.requestAllHomeData$default(eUI.this, "assetPush", null, false, false, true, z, null, false, false, null, TypedValues.Custom.TYPE_COLOR, null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: o.eUI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requestAllHomeData$default(eUI eui, java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, boolean z4, java.lang.Integer num, boolean z5, boolean z6, Function0 function0, int i, java.lang.Object obj) {
        eui.KWHzl(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? 0 : num, (i & 128) != 0 ? false : z5, (i & 256) == 0 ? z6 : false, (i & 512) == 0 ? function0 : null);
    }

    public final void KWHzl(@NotNull final java.lang.String str, java.lang.String str2, final boolean z, final boolean z2, final boolean z3, boolean z4, final java.lang.Integer num, final boolean z5, final boolean z6, final Function0<Unit> function0) {
        AbstractC58185ywX<java.util.List<C10594brR>> abstractC58185ywXAEQbTJ;
        InterfaceC25424iwU interfaceC25424iwUGEmmrt;
        Intrinsics.checkNotNullParameter(str, "");
        C10856bwO.copydefault(this.OLrzqt, 0, "requestAllHomeData from:" + str + " type:" + num + " cacheFirst:" + z2 + " isFromPush:" + z3 + " isForceRefresh:" + z5 + " isPullDownRefresh:" + z6 + " isAggregatedAssetChange:" + z4);
        if (z) {
            this.EZpvd.setValue(java.lang.Boolean.FALSE);
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        this.sSMYrx = java.lang.System.currentTimeMillis();
        if (z4 && zuBGHE() && (interfaceC25424iwUGEmmrt = gEmmrt()) != null) {
            interfaceC25424iwUGEmmrt.AEQbTJ();
        }
        if (!z3) {
            if (zuBGHE()) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletViewModel$requestAllHomeData$1(this, null), 3, null);
            }
            if (z || (z5 && !this.AxsJAY)) {
                C15523eLm c15523eLm = C15523eLm.KWHzl;
                if (c15523eLm.copydefault()) {
                    c15523eLm.KWHzl(str2, z);
                }
            }
            if (eLJ.Companion.AEQbTJ() && (z || this.AxsJAY)) {
                C15530eLt.ActionBar actionBar = C15530eLt.Companion;
                C15530eLt.ActionBar.getInstance$default(actionBar, null, 1, null).EZpvd(true);
                C15530eLt.ActionBar.getInstance$default(actionBar, null, 1, null).KWHzl(str2);
            }
            C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).OLrzqt().DbNXlk();
        }
        if (this.AxsJAY) {
            this.AxsJAY = false;
        }
        if (!z3 && !z5 && this.dvKsVJ.KWHzl()) {
            if (function0 != null) {
                function0.invoke();
            }
            copydefault(str2);
            return;
        }
        if (z3) {
            Function0<Unit> function02 = this.QUSxYX;
            if (function02 != null) {
                function02.invoke();
            }
            this.QUSxYX = null;
        } else {
            this.QUSxYX = function0;
        }
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        if (str2 == null || str2.length() == 0) {
            abstractC58185ywXAEQbTJ = C10619brq.TaskDescription.getInstance$default(C10619brq.Companion, null, 1, null).AEQbTJ();
        } else {
            abstractC58185ywXAEQbTJ = C10619brq.TaskDescription.getInstance$default(C10619brq.Companion, null, 1, null).copydefault(str2);
        }
        final Function1 function1 = new Function1() { // from class: o.eUW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eUI.gEmmrt((java.lang.Throwable) obj);
            }
        };
        AbstractC58185ywX<java.util.List<C10594brR>> abstractC58185ywXDjBIcL = abstractC58185ywXAEQbTJ.djBIcL(new InterfaceC58229yxO() { // from class: o.eVa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return eUI.sSMYrx(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.eVb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eUI.KWHzl(this.KWHzl, str, num, z2, z3, (java.util.List) obj);
            }
        };
        InterfaceC60096zvd interfaceC60096zvdAEQbTJ = abstractC58185ywXDjBIcL.AEQbTJ(new InterfaceC58229yxO() { // from class: o.eVd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return eUI.AwvSrB(function12, obj);
            }
        });
        AbstractC58185ywX<C10405bno> abstractC58185ywXEZpvd = C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).EZpvd(z2, num);
        final Function2 function2 = new Function2() { // from class: o.eVc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return eUI.copydefault(this.KWHzl, (java.util.List) obj, (C10405bno) obj2);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(interfaceC60096zvdAEQbTJ, abstractC58185ywXEZpvd, new InterfaceC58223yxI() { // from class: o.eVe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58223yxI
            public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                return eUI.OLrzqt(function2, obj, obj2);
            }
        });
        final Function1 function13 = new Function1() { // from class: o.eVf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eUI.copydefault(this.EZpvd, str, num, z2, z3, z, z5, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXKWHzl.KWHzl(new InterfaceC58229yxO() { // from class: o.eVj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return eUI.zLjUOn(function13, obj);
            }
        });
        final Function1 function14 = new Function1() { // from class: o.eVi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eUI.KWHzl(this.OLrzqt, str, num, z2, z3, (kotlin.Pair) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl3 = abstractC58185ywXKWHzl2.KWHzl(new InterfaceC58229yxO() { // from class: o.eVh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return eUI.wlaJM(function14, obj);
            }
        }).KWHzl(C58266yxz.OLrzqt());
        final Function1 function15 = new Function1() { // from class: o.eUZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eUI.OLrzqt(this.copydefault, z3, z5, function0, z2, booleanRef, z6, (eUI.Activity) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eUV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eUI.AuCTelauCTel(function15, obj);
            }
        };
        final Function1 function16 = new Function1() { // from class: o.eUX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eUI.AEQbTJ(this.KWHzl, str, num, z2, z3, function0, (java.lang.Throwable) obj);
            }
        };
        this.valueOf = abstractC58185ywXKWHzl3.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eUY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eUI.zsXlph(function16, obj);
            }
        });
    }

    public static final java.util.List sSMYrx(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List gEmmrt(java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        return yDY.AhwBna();
    }

    public static final java.util.List AwvSrB(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (java.util.List) function1.invoke(obj);
    }

    public static final java.util.List KWHzl(eUI eui, java.lang.String str, java.lang.Integer num, boolean z, boolean z2, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C10856bwO.copydefault(eui.OLrzqt, 0, "requestAllHomeData from:" + str + " type:" + num + " cacheFirst:" + z + " isFromPush:" + z2 + " refresh asset finish, size:" + list.size());
        return CollectionsKt___CollectionsKt.EZpvd(list, new LoaderManager());
    }

    public static final kotlin.Pair OLrzqt(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final kotlin.Pair copydefault(eUI eui, java.util.List list, C10405bno c10405bno) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(c10405bno, "");
        eui.EZpvd((java.util.List<C10594brR>) list, c10405bno.EZpvd());
        return C56390yDp.OLrzqt(list, c10405bno);
    }

    public static final InterfaceC60096zvd zLjUOn(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd copydefault(eUI eui, java.lang.String str, java.lang.Integer num, boolean z, boolean z2, boolean z3, boolean z4, final kotlin.Pair pair) {
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXKWHzl;
        Intrinsics.checkNotNullParameter(pair, "");
        C10856bwO.copydefault(eui.OLrzqt, 0, "requestAllHomeData from:" + str + " type:" + num + " cacheFirst:" + z + " isFromPush:" + z2 + " start to fetch tee and 7702 status");
        if (z3 || eui.AxsJAY || z4) {
            if (((C10405bno) pair.getSecond()).KWHzl()) {
                abstractC58185ywXKWHzl = eui.EZpvd(((C10405bno) pair.getSecond()).EZpvd());
            } else {
                abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(0);
                Intrinsics.copydefault(abstractC58185ywXKWHzl);
            }
            AbstractC58185ywX<Unit> abstractC58185ywXAEQbTJ = eui.AEQbTJ(((C10405bno) pair.getSecond()).EZpvd());
            final Function2 function2 = new Function2() { // from class: o.eVq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return eUI.KWHzl(pair, (java.lang.Integer) obj, (Unit) obj2);
                }
            };
            return AbstractC58185ywX.KWHzl(abstractC58185ywXKWHzl, abstractC58185ywXAEQbTJ, new InterfaceC58223yxI() { // from class: o.eVx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58223yxI
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return eUI.EZpvd(function2, obj, obj2);
                }
            });
        }
        return AbstractC58185ywX.KWHzl(pair);
    }

    public static final kotlin.Pair EZpvd(Function2 function2, java.lang.Object obj, java.lang.Object obj2) {
        Intrinsics.checkNotNullParameter(obj, "");
        Intrinsics.checkNotNullParameter(obj2, "");
        return (kotlin.Pair) function2.invoke(obj, obj2);
    }

    public static final InterfaceC60096zvd wlaJM(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(final eUI eui, java.lang.String str, java.lang.Integer num, boolean z, boolean z2, final kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        C10856bwO.copydefault(eui.OLrzqt, 0, "requestAllHomeData from:" + str + " type:" + num + " cacheFirst:" + z + " isFromPush:" + z2 + " start to convert token to UIBean");
        if (eui.fARcdN) {
            eui.fARcdN = false;
            eui.fZBcTu.postValue(((C10405bno) pair.getSecond()).EZpvd());
        }
        final java.util.List<C10525bqB> listAEQbTJ = eui.AEQbTJ(((C10405bno) pair.getSecond()).EZpvd(), ((C10405bno) pair.getSecond()).AEQbTJ());
        AbstractC12782ctV abstractC12782ctVEZpvd = ((C10405bno) pair.getSecond()).EZpvd();
        java.util.List<C10525bqB> listOLrzqt = ((C10405bno) pair.getSecond()).OLrzqt();
        java.lang.Object first = pair.getFirst();
        Intrinsics.checkNotNullExpressionValue(first, "");
        AbstractC58185ywX<java.util.ArrayList<eUG>> abstractC58185ywXAEQbTJ = eui.AEQbTJ(abstractC12782ctVEZpvd, listOLrzqt, listAEQbTJ, (java.util.List) first);
        final Function1 function1 = new Function1() { // from class: o.eVs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eUI.EZpvd(pair, listAEQbTJ, eui, (java.util.ArrayList) obj);
            }
        };
        return abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58229yxO() { // from class: o.eVz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return eUI.AubY(function1, obj);
            }
        }).copydefault(yBP.KWHzl());
    }

    public static final Activity AubY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Activity) function1.invoke(obj);
    }

    public static final Activity EZpvd(kotlin.Pair pair, java.util.List list, eUI eui, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.List<C10525bqB> listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) ((C10405bno) pair.getSecond()).OLrzqt(), (java.lang.Iterable) list);
        eui.OLrzqt((java.util.ArrayList<eUG>) arrayList, listDjBIcL);
        java.lang.Object second = pair.getSecond();
        Intrinsics.checkNotNullExpressionValue(second, "");
        return new Activity((C10405bno) second, listDjBIcL, arrayList);
    }

    public static final void AuCTelauCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(eUI eui, boolean z, boolean z2, Function0 function0, boolean z3, Ref.BooleanRef booleanRef, boolean z4, Activity activity) {
        C32989mnw<java.lang.Integer> c32989mnw;
        C10405bno c10405bnoOLrzqt = activity.OLrzqt();
        C10856bwO.copydefault(eui.OLrzqt, 0, "requestAllHomeData success " + c10405bnoOLrzqt.KWHzl());
        if (!z && !z2 && eui.dvKsVJ.KWHzl()) {
            if (function0 != null) {
                function0.invoke();
            }
            eui.copydefault.tryEmit(c10405bnoOLrzqt.EZpvd());
            eui.EZpvd.setValue(java.lang.Boolean.TRUE);
            return Unit.INSTANCE;
        }
        if (eui.AuCTelauCTel) {
            eui.AuCTelauCTel = false;
            C17920fXe.EZpvd.KWHzl(c10405bnoOLrzqt.EZpvd());
        }
        eui.QOLQEE.setValue(c10405bnoOLrzqt.EZpvd());
        eui.copydefault.tryEmit(c10405bnoOLrzqt.EZpvd());
        MutableLiveData<java.lang.Boolean> mutableLiveData = eui.EZpvd;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        mutableLiveData.setValue(bool);
        MutableLiveData<C32989mnw<java.lang.Integer>> mutableLiveData2 = eui.gEmmrt;
        if (c10405bnoOLrzqt.EZpvd().zLjUOn()) {
            c32989mnw = new C32989mnw<>(1);
        } else {
            c32989mnw = new C32989mnw<>(0);
        }
        mutableLiveData2.setValue(c32989mnw);
        eui.gGvvIC = activity.EZpvd();
        eui.flVtFt = activity.copydefault();
        eui.gasjUx.setValue(activity.copydefault());
        eui.copydefault(c10405bnoOLrzqt.EZpvd());
        if (eui.fIwbmz) {
            eui.copydefault();
        }
        if (z3) {
            eui.AEQbTJ.setValue(java.lang.Boolean.valueOf(booleanRef.element));
            if (!booleanRef.element) {
                eui.OLrzqt(eui.QOLQEE.getValue());
                eui.OLrzqt("requestAllHomeData1", c10405bnoOLrzqt.EZpvd(), activity.EZpvd());
                AbstractC12782ctV value = eui.QOLQEE.getValue();
                if (value != null) {
                    BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(eui), null, null, new WalletViewModel$requestAllHomeData$7$1$1(eui, value, null), 3, null);
                }
            }
            booleanRef.element = false;
        } else {
            eui.OLrzqt(eui.QOLQEE.getValue());
            eui.OLrzqt("requestAllHomeData2", c10405bnoOLrzqt.EZpvd(), activity.EZpvd());
            AbstractC12782ctV value2 = eui.QOLQEE.getValue();
            if (value2 != null) {
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(eui), null, null, new WalletViewModel$requestAllHomeData$7$2$1(eui, value2, null), 3, null);
            }
            if (z2 || z4 || eui.fIwbmz) {
                eui.fIwbmz = false;
                eui.AEQbTJ.setValue(java.lang.Boolean.FALSE);
            } else {
                eui.AEQbTJ.setValue(bool);
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void zsXlph(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(eUI eui, java.lang.String str, java.lang.Integer num, boolean z, boolean z2, Function0 function0, java.lang.Throwable th) {
        java.lang.String strAYXKKw;
        java.lang.String message = th.getMessage();
        if (message == null || message.length() == 0) {
            strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.dNCPSb);
        } else {
            strAYXKKw = th.getMessage();
        }
        C10856bwO.copydefault(eui.OLrzqt, 0, "requestAllHomeData error from:" + str + " type:" + num + " cacheFirst:" + z + " isFromPush:" + z2 + " msg:" + strAYXKKw);
        if (!z2 && !eui.AxsJAY) {
            C55326xho.toast$default(strAYXKKw, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        eui.AEQbTJ.setValue(java.lang.Boolean.TRUE);
        if (function0 != null) {
            function0.invoke();
        }
        if (th instanceof OKWAssetAllException) {
            MutableLiveData<java.lang.String> mutableLiveData = eui.iwGUEr;
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            mutableLiveData.setValue(strAYXKKw);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Type inference failed for r3v5. Raw type applied. Possible types: o.ywX<R>, java.lang.Object, o.ywX<kotlin.Unit> */
    public final AbstractC58185ywX<Unit> AEQbTJ(AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV.AubY() && zLjUOn()) {
            AbstractC58185ywX<ResponseData<EscapeBindStatusResp>> abstractC58185ywXValues = wlaJM().values(abstractC12782ctV.DbNXlk());
            final Function1 function1 = new Function1() { // from class: o.eUS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eUI.KWHzl(this.copydefault, (ResponseData) obj);
                }
            };
            AbstractC58185ywX abstractC58185ywXAEQbTJ = abstractC58185ywXValues.AEQbTJ(new InterfaceC58229yxO() { // from class: o.eUR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return eUI.iwGUEr(function1, obj);
                }
            });
            Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
            return abstractC58185ywXAEQbTJ;
        }
        AbstractC58185ywX<Unit> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(Unit.INSTANCE);
        Intrinsics.copydefault(abstractC58185ywXKWHzl);
        return abstractC58185ywXKWHzl;
    }

    public static final Unit iwGUEr(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (Unit) function1.invoke(obj);
    }

    public static final Unit KWHzl(eUI eui, ResponseData responseData) {
        EscapeBindStatusResp escapeBindStatusResp;
        Intrinsics.checkNotNullParameter(responseData, "");
        eui.QVAiDq.postValue(java.lang.Boolean.valueOf(responseData.getCode() == 0 && responseData.getData() != null && (escapeBindStatusResp = (EscapeBindStatusResp) responseData.getData()) != null && Intrinsics.EZpvd(escapeBindStatusResp.isBind(), java.lang.Boolean.TRUE)));
        return Unit.INSTANCE;
    }

    public final AbstractC58185ywX<java.lang.Integer> EZpvd(AbstractC12782ctV abstractC12782ctV) {
        AbstractC58185ywX<java.lang.Integer> abstractC58185ywXEZpvd = RxSingleKt.rxSingle$default(null, new WalletViewModel$fetchMainWalletTeeAndEIP7702Status$1(abstractC12782ctV, this, null), 1, null).EZpvd();
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXEZpvd, "");
        return abstractC58185ywXEZpvd;
    }

    public final void valueOf() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletViewModel$fetchMetaData$1(this, null), 3, null);
    }

    public final void QKVWgx() {
        java.util.ArrayList<eUG> arrayList;
        if (this.ejfBZ) {
            this.ejfBZ = false;
            java.util.List<C10525bqB> list = this.gGvvIC;
            if (list == null || (arrayList = this.flVtFt) == null) {
                return;
            }
            this.gasjUx.setValue(OLrzqt(arrayList, list));
        }
    }

    public final void EZpvd(java.util.List<C10594brR> list, AbstractC12782ctV abstractC12782ctV) {
        C10594brR c10594brREjfBZ;
        WalletSelectedChainBean walletSelectedChainBeanKWHzl = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(abstractC12782ctV.DbNXlk());
        if (walletSelectedChainBeanKWHzl.isSingleMode()) {
            for (C10594brR c10594brR : list) {
                if (Intrinsics.EZpvd((java.lang.Object) c10594brR.DbNXlk().DbNXlk(), (java.lang.Object) abstractC12782ctV.DbNXlk()) && Intrinsics.EZpvd((java.lang.Object) walletSelectedChainBeanKWHzl.getChainId(), (java.lang.Object) java.lang.String.valueOf(c10594brR.AEQbTJ())) && (c10594brREjfBZ = abstractC12782ctV.ejfBZ(c10594brR.OLrzqt())) != null) {
                    c10594brREjfBZ.EZpvd(c10594brR.values(), c10594brR.AhwBna());
                }
            }
        }
    }

    public final boolean zuBGHE() {
        if (this.wlaJM == null) {
            this.wlaJM = java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) ABTestManager.AEQbTJ.AEQbTJ("mobile_wallet_home_page_apy", AmplitudeName.WEB3), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON));
        }
        return Intrinsics.EZpvd(this.wlaJM, java.lang.Boolean.TRUE);
    }

    public final boolean zLjUOn() {
        if (this.AubY == null) {
            this.AubY = java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_wallet_cedefi_escape_assets_flag", AmplitudeName.WEB3), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON));
        }
        return Intrinsics.EZpvd(this.AubY, java.lang.Boolean.TRUE);
    }

    public final boolean AxsJAY() {
        if (this.zsXlph == null) {
            this.zsXlph = java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "e2e_disable_wallet_sa_guide_pop_up", null, 2, null), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON));
        }
        return Intrinsics.EZpvd(this.zsXlph, java.lang.Boolean.TRUE);
    }

    public final boolean sSMYrx() {
        if (this.zLjUOn == null) {
            this.zLjUOn = java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(ABTestManager.AEQbTJ, "e2e_disable_wallet_approve_risky_pop_up", null, 2, null), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON));
        }
        return Intrinsics.EZpvd(this.zLjUOn, java.lang.Boolean.TRUE);
    }

    public static final Unit copydefault(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eUI */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean isPreZeroState$default(eUI eui, Function1 function1, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: o.eVn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return eUI.copydefault(((java.lang.Boolean) obj2).booleanValue());
                }
            };
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return eui.copydefault((Function1<? super java.lang.Boolean, Unit>) function1, str);
    }

    public final boolean copydefault(@NotNull final Function1<? super java.lang.Boolean, Unit> function1, java.lang.String str) {
        AbstractC12782ctV value;
        Intrinsics.checkNotNullParameter(function1, "");
        java.lang.String strDbNXlk = null;
        if (this.QOLQEE.getValue() == null && str == null) {
            AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault(false);
            final Function1 function12 = new Function1() { // from class: o.eVu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eUI.OLrzqt(function1, (AbstractC12782ctV) obj);
                }
            };
            InterfaceC58227yxM<? super AbstractC12782ctV> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eVy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    eUI.getFieldNames(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.eVw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eUI.KWHzl(function1, (java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eVD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    eUI.getNewProxyInstance(function13, obj);
                }
            });
            return false;
        }
        if (str == null) {
            MutableLiveData<AbstractC12782ctV> mutableLiveData = this.QOLQEE;
            if (mutableLiveData != null && (value = mutableLiveData.getValue()) != null) {
                strDbNXlk = value.DbNXlk();
            }
            boolean z = !SPUtils.getBoolean("skip_zero_asset" + strDbNXlk, false);
            function1.invoke(java.lang.Boolean.valueOf(z));
            return z;
        }
        boolean z2 = !SPUtils.getBoolean("skip_zero_asset" + str, false);
        function1.invoke(java.lang.Boolean.valueOf(z2));
        return z2;
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, AbstractC12782ctV abstractC12782ctV) {
        java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
        function1.invoke(java.lang.Boolean.valueOf(!SPUtils.getBoolean("skip_zero_asset" + strDbNXlk, false)));
        return Unit.INSTANCE;
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Function1 function1, java.lang.Throwable th) {
        function1.invoke(java.lang.Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public final void copydefault(AbstractC12782ctV abstractC12782ctV) {
        if (!this.getFieldNames && abstractC12782ctV.QCjLjM() < WalletSyncStatus.HasCreate.getValue()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletViewModel$checkMainWalletSyncStatus$1(abstractC12782ctV, this, null), 3, null);
        }
    }

    public final void copydefault() {
        if (Intrinsics.EZpvd((java.lang.Object) ABTestManager.AEQbTJ.AEQbTJ("mobile_web3_wallet_icloud_backup_mnemonic_enabled", AmplitudeName.WEB3), (java.lang.Object) "show") && !((OKComplianceRestrictionService) C43251rlk.copydefault(OKComplianceRestrictionService.class)).OLrzqt(OKComplianceRestrictionService.Feature.DEFI)) {
            java.lang.Long l = SPUtils.getLong("last_check_manual_backup_time", 0L, "wallet_biz_sp_file");
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            Intrinsics.copydefault(l);
            if (jCurrentTimeMillis - l.longValue() < CalendarModelKt.MillisecondsIn24Hours) {
                return;
            }
            SPUtils.put("last_check_manual_backup_time", java.lang.Long.valueOf(jCurrentTimeMillis), "wallet_biz_sp_file");
            AbstractC58260yxt abstractC58260yxtFetchAllWallets$default = C12827cuN.fetchAllWallets$default(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null), false, false, false, 7, null);
            final Function1 function1 = new Function1() { // from class: o.eVk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eUI.KWHzl(this.copydefault, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eVl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    eUI.AuCTel(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.eVm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eUI.EZpvd((java.lang.Throwable) obj);
                }
            };
            abstractC58260yxtFetchAllWallets$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eVo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    eUI.uzCIH(function12, obj);
                }
            });
        }
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(final eUI eui, final java.util.List list) {
        eui.fJNWhG.postDelayed(new java.lang.Runnable() { // from class: o.eUQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                eUI.AEQbTJ(this.EZpvd, list);
            }
        }, 500L);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(eUI eui, java.util.List list) {
        boolean z;
        MutableLiveData<java.lang.Boolean> mutableLiveData = eui.aKErDB;
        Intrinsics.copydefault(list);
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            z = false;
        } else {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) it.next();
                if (abstractC12782ctV.AubY() && abstractC12782ctV.zLjUOn() && !abstractC12782ctV.gasjUx()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        mutableLiveData.setValue(java.lang.Boolean.valueOf(z));
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final AbstractC58185ywX<java.util.ArrayList<eUG>> AEQbTJ(final AbstractC12782ctV abstractC12782ctV, final java.util.List<C10525bqB> list, final java.util.List<C10525bqB> list2, final java.util.List<C10594brR> list3) {
        AbstractC58185ywX<java.util.ArrayList<eUG>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.eVv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return eUI.EZpvd(this.copydefault, abstractC12782ctV, list, list2, list3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.ArrayList EZpvd(eUI eui, AbstractC12782ctV abstractC12782ctV, java.util.List list, java.util.List list2, java.util.List list3) {
        java.util.ArrayList<eUG> arrayListOLrzqt = eui.OLrzqt(abstractC12782ctV, (java.util.List<C10525bqB>) list);
        java.util.ArrayList<eUG> arrayListOLrzqt2 = eui.OLrzqt(abstractC12782ctV, (java.util.List<C10525bqB>) list2);
        if (!arrayListOLrzqt2.isEmpty()) {
            arrayListOLrzqt.add(new eUG("", "", C33069mpW.copydefault(C13754dXa.FragmentManager.startActivityForResult, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C54862xYb.EZpvd(C33129mqd.gEmmrt(java.lang.Integer.valueOf(arrayListOLrzqt2.size())))))), "", "", false, "", "", false, arrayListOLrzqt2, "", 5, null, "1", null, "1", false, null, false, false, false, 0, false, false, 0, null, null, false, false, false, false, null, null, false, false, null, null, -45056, 31, null));
        }
        arrayListOLrzqt.addAll(eui.KWHzl(abstractC12782ctV, (java.util.List<C10594brR>) list3));
        return arrayListOLrzqt;
    }

    public final void OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        if (abstractC12782ctV == null) {
            return;
        }
        java.util.ArrayList<ChainAddress> arrayListOBJEWx = abstractC12782ctV.isConnected();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListOBJEWx, 10));
        java.util.Iterator<T> it = arrayListOBJEWx.iterator();
        while (it.hasNext()) {
            arrayList.add(((ChainAddress) it.next()).getAddress());
        }
        C11205cFp c11205cFp = C11205cFp.EZpvd;
        if (c11205cFp.AEQbTJ(arrayList).getFirst().booleanValue()) {
            RxBus.AEQbTJ(new C9915beb());
        }
        c11205cFp.OLrzqt(arrayList);
        c11205cFp.zLjUOn().AEQbTJ(this.values);
        c11205cFp.AubY().AEQbTJ(this.AkhnZx);
        c11205cFp.AwvSrB().AEQbTJ(this.DTwDnp);
        c11205cFp.ORxRYg().AEQbTJ(this.gkJEwt);
        if (eLJ.Companion.AEQbTJ()) {
            c11205cFp.wlaJM().AEQbTJ(this.AYXKKw);
        }
        c11205cFp.OcIXYQ().AEQbTJ(this.hUfVAv);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull AbstractC12782ctV abstractC12782ctV, @NotNull java.util.List<java.lang.Long> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        Intrinsics.checkNotNullParameter(list, "");
        androidx.collection.ArraySet arraySet = new androidx.collection.ArraySet(0, 1, null);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.List<ChainAddress> listDbNXlk = abstractC12782ctV.DbNXlk(((java.lang.Number) it.next()).longValue());
            if (listDbNXlk != null) {
                java.util.Iterator<T> it2 = listDbNXlk.iterator();
                while (it2.hasNext()) {
                    arraySet.add(((ChainAddress) it2.next()).getAddress());
                }
            }
        }
        if (arraySet.isEmpty()) {
            return;
        }
        WalletPnlSubManager walletPnlSubManagerSSMYrx = C11205cFp.EZpvd.sSMYrx();
        xZA xza = this.dvKsVJ;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arraySet, 10));
        java.util.Iterator<E> it3 = arraySet.iterator();
        while (it3.hasNext()) {
            arrayList.add(new WalletPnlSubManager.StateListAnimator((java.lang.String) it3.next()));
        }
        walletPnlSubManagerSSMYrx.copydefault(new PendingIntent(abstractC12782ctV, xza, arrayList));
    }

    public static final class PendingIntent extends WalletWSBaseArgsChannel.Application<WalletPnlSubManager.StateListAnimator, WalletPnlSubManager.SubResponse> {
        public final /* synthetic */ AbstractC12782ctV OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(AbstractC12782ctV abstractC12782ctV, xZA xza, java.util.List<WalletPnlSubManager.StateListAnimator> list) {
            super("subPnl-home", xza, list);
            this.OLrzqt = abstractC12782ctV;
        }

        @Override // o.xZF.TaskDescription
        public void EZpvd(final java.util.List<WalletPnlSubManager.SubResponse> list) {
            Intrinsics.checkNotNullParameter(list, "");
            super.EZpvd(list);
            final AbstractC12782ctV value = eUI.this.fARcdN().getValue();
            if (value != null && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt.DbNXlk(), (java.lang.Object) value.DbNXlk())) {
                value.isConnected();
                final eUI eui = eUI.this;
                AbstractC58260yxt abstractC58260yxtOLrzqt = AbstractC58260yxt.copydefault(new Callable() { // from class: o.eVG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.util.concurrent.Callable
                    public final java.lang.Object call() {
                        return eUI.PendingIntent.AEQbTJ(list, value, eui);
                    }
                }).KWHzl(yBP.KWHzl()).OLrzqt(yBP.AEQbTJ());
                final Function1 function1 = new Function1() { // from class: o.eVF
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eUI.PendingIntent.OLrzqt((java.util.ArrayList) obj);
                    }
                };
                AbstractC58260yxt abstractC58260yxtOLrzqt2 = abstractC58260yxtOLrzqt.OLrzqt(new InterfaceC58229yxO() { // from class: o.eVI
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58229yxO
                    public final java.lang.Object apply(java.lang.Object obj) {
                        return eUI.PendingIntent.AEQbTJ(function1, obj);
                    }
                }).OLrzqt(C58266yxz.OLrzqt());
                final eUI eui2 = eUI.this;
                final Function1 function12 = new Function1() { // from class: o.eVE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eUI.PendingIntent.copydefault(eui2, (java.lang.Integer) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eVM
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        eUI.PendingIntent.EZpvd(function12, obj);
                    }
                };
                final Function1 function13 = new Function1() { // from class: o.eVJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return eUI.PendingIntent.OLrzqt((java.lang.Throwable) obj);
                    }
                };
                abstractC58260yxtOLrzqt2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eVK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        eUI.PendingIntent.AYXKKw(function13, obj);
                    }
                });
            }
        }

        public static final java.util.ArrayList AEQbTJ(java.util.List list, AbstractC12782ctV abstractC12782ctV, eUI eui) {
            java.lang.String holdAvgPrice;
            java.lang.Long chainId;
            C10854bwM c10854bwMEZpvd;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.util.List<WalletPnlSubManager.SubResponse.PnlPushData> pnlPushList = ((WalletPnlSubManager.SubResponse) it.next()).getPnlPushList();
                if (pnlPushList != null) {
                    for (WalletPnlSubManager.SubResponse.PnlPushData pnlPushData : pnlPushList) {
                        java.lang.String spotBalance = pnlPushData.getSpotBalance();
                        if (spotBalance != null && spotBalance.length() != 0 && (holdAvgPrice = pnlPushData.getHoldAvgPrice()) != null && holdAvgPrice.length() != 0) {
                            C10948byA c10948byAValueOf = C10954byG.EZpvd.valueOf();
                            java.lang.String tokenContractAddress = pnlPushData.getTokenContractAddress();
                            if (tokenContractAddress != null && (chainId = pnlPushData.getChainId()) != null && (c10854bwMEZpvd = c10948byAValueOf.EZpvd(tokenContractAddress, chainId.longValue())) != null) {
                                long jAhwBna = c10854bwMEZpvd.AhwBna();
                                java.lang.String walletAddress = pnlPushData.getWalletAddress();
                                if (walletAddress != null) {
                                    C10525bqB c10525bqBEZpvd = abstractC12782ctV.EZpvd(jAhwBna, walletAddress);
                                    if (c10525bqBEZpvd != null && !C33129mqd.OLrzqt(c10525bqBEZpvd.fIwbmz(), "0")) {
                                        WalletTickerManager.CoinPrice coinPriceAEQbTJ = eui.AxsJAYsNCnLh.AEQbTJ(c10854bwMEZpvd.AhwBna());
                                        if (coinPriceAEQbTJ == null) {
                                            java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
                                            long jOLrzqt = c10525bqBEZpvd.OLrzqt();
                                            java.lang.String walletAddress2 = pnlPushData.getWalletAddress();
                                            java.lang.String strSSMYrx = c10525bqBEZpvd.sSMYrx();
                                            java.lang.String str = strSSMYrx == null ? "" : strSSMYrx;
                                            java.lang.String strGHZMYf = c10525bqBEZpvd.gHZMYf();
                                            arrayList.add(new WalletCoinAssetPnlEntity(strDbNXlk, jOLrzqt, walletAddress2, str, strGHZMYf == null ? "" : strGHZMYf, pnlPushData.getSpotBalance(), pnlPushData.getHoldAvgPrice()));
                                        } else if (coinPriceAEQbTJ.getHasPrice()) {
                                            kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault = C10541bqR.OLrzqt.copydefault("subPnl", c10525bqBEZpvd.fIwbmz(), pnlPushData.getSpotBalance(), coinPriceAEQbTJ.getPrice(), pnlPushData.getHoldAvgPrice());
                                            c10525bqBEZpvd.DbNXlk(pairCopydefault.getFirst());
                                            c10525bqBEZpvd.fetchVPNInfo(pairCopydefault.getSecond());
                                            c10525bqBEZpvd.djBIcL(pnlPushData.getSpotBalance());
                                            c10525bqBEZpvd.EZpvd(pnlPushData.getHoldAvgPrice());
                                            java.lang.String strDbNXlk2 = abstractC12782ctV.DbNXlk();
                                            long jOLrzqt2 = c10525bqBEZpvd.OLrzqt();
                                            java.lang.String walletAddress3 = pnlPushData.getWalletAddress();
                                            java.lang.String strSSMYrx2 = c10525bqBEZpvd.sSMYrx();
                                            java.lang.String str2 = strSSMYrx2 == null ? "" : strSSMYrx2;
                                            java.lang.String strGHZMYf2 = c10525bqBEZpvd.gHZMYf();
                                            arrayList.add(new WalletCoinAssetPnlEntity(strDbNXlk2, jOLrzqt2, walletAddress3, str2, strGHZMYf2 == null ? "" : strGHZMYf2, pnlPushData.getSpotBalance(), pnlPushData.getHoldAvgPrice()));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return arrayList;
        }

        public static final InterfaceC58261yxu AEQbTJ(Function1 function1, java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
            return (InterfaceC58261yxu) function1.invoke(obj);
        }

        public static final InterfaceC58261yxu OLrzqt(java.util.ArrayList arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            if (!arrayList.isEmpty()) {
                return C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl().AEQbTJ(arrayList);
            }
            AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(-1);
            Intrinsics.copydefault(abstractC58260yxtCopydefault);
            return abstractC58260yxtCopydefault;
        }

        public static final void EZpvd(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit copydefault(eUI eui, java.lang.Integer num) {
            eUI.requestAllHomeData$default(eui, "pnl", null, false, false, true, false, null, false, false, null, 806, null);
            return Unit.INSTANCE;
        }

        public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final Unit OLrzqt(java.lang.Throwable th) {
            return Unit.INSTANCE;
        }
    }

    public final void OLrzqt(java.lang.String str, final AbstractC12782ctV abstractC12782ctV, final java.util.List<C10525bqB> list) {
        C10856bwO.copydefault(this.OLrzqt, 0, "subTickers from:" + str + " isNeedSubTickers:" + this.zuBGHE + " wallet:" + abstractC12782ctV.AkhnZx());
        if (this.zuBGHE) {
            if (list.isEmpty()) {
                InterfaceC58217yxC interfaceC58217yxC = this.fvQaOB;
                if (interfaceC58217yxC != null) {
                    interfaceC58217yxC.dispose();
                    return;
                }
                return;
            }
            this.AuCTel.clear();
            this.AuCTel.addAll(list);
            InterfaceC58217yxC interfaceC58217yxC2 = this.giSNqX;
            if (interfaceC58217yxC2 != null) {
                interfaceC58217yxC2.dispose();
            }
            AbstractC58185ywX abstractC58185ywXCopydefault = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.eVA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.concurrent.Callable
                public final java.lang.Object call() {
                    return eUI.EZpvd(abstractC12782ctV, list, this);
                }
            }).copydefault(yBP.KWHzl());
            final Function1 function1 = new Function1() { // from class: o.eVC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eUI.EZpvd(this.copydefault, abstractC12782ctV, (java.util.List) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eVB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    eUI.OcIXYQ(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.eVH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eUI.valueOf((java.lang.Throwable) obj);
                }
            };
            this.giSNqX = abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eUK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    eUI.QOLQEE(function12, obj);
                }
            });
        }
    }

    public static final boolean EZpvd(java.util.List<WalletTickerManager.CoinInfo> list, java.util.List<WalletTickerManager.CoinInfo> list2) {
        return list != null && CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) list, (java.lang.Iterable) list2).isEmpty() && CollectionsKt___CollectionsKt.gEmmrt((java.lang.Iterable) list2, (java.lang.Iterable) list).isEmpty();
    }

    public static final java.util.List EZpvd(AbstractC12782ctV abstractC12782ctV, java.util.List list, eUI eui) {
        long jAhwBna;
        java.lang.Object next;
        WalletSelectedChainBean walletSelectedChainBeanKWHzl = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(abstractC12782ctV.DbNXlk());
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            C10525bqB c10525bqB = (C10525bqB) it.next();
            long jFetchVPNInfo = c10525bqB.KWHzl().fetchVPNInfo();
            if (c10525bqB.ORxRYg() && !walletSelectedChainBeanKWHzl.isAllNetwork()) {
                java.util.Iterator<T> it2 = c10525bqB.values().QHmsKR().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    C10525bqB c10525bqB2 = (C10525bqB) next;
                    if (c10525bqB2.AEQbTJ() == C33129mqd.valueOf(walletSelectedChainBeanKWHzl.getChainId()) && Intrinsics.EZpvd((java.lang.Object) c10525bqB2.valueOf(), (java.lang.Object) c10525bqB.valueOf()) && c10525bqB2.KWHzl().giSNqX()) {
                        break;
                    }
                }
                C10525bqB c10525bqB3 = (C10525bqB) next;
                jAhwBna = c10525bqB3 != null ? c10525bqB3.OLrzqt() : c10525bqB.KWHzl().AhwBna();
            } else {
                jAhwBna = c10525bqB.KWHzl().AhwBna();
            }
            arrayList.add(new WalletTickerManager.CoinInfo(jFetchVPNInfo, jAhwBna, c10525bqB.KWHzl().OLrzqt(), c10525bqB.ORxRYg() && walletSelectedChainBeanKWHzl.isAllNetwork()));
        }
        return EZpvd(eui.AxsJAYsNCnLh.AYXKKw(), arrayList) ? yDY.AhwBna() : arrayList;
    }

    public static final void OcIXYQ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final eUI eui, final AbstractC12782ctV abstractC12782ctV, java.util.List list) {
        Intrinsics.copydefault(list);
        if (!list.isEmpty()) {
            InterfaceC58217yxC interfaceC58217yxC = eui.fvQaOB;
            if (interfaceC58217yxC != null) {
                interfaceC58217yxC.dispose();
            }
            WalletTickerManager walletTickerManager = eui.AxsJAYsNCnLh;
            AbstractC58185ywX<WalletTickerManager.CoinPriceRes> abstractC58185ywXCopydefault = walletTickerManager.copydefault("subTicker-home", walletTickerManager.gEmmrt(), (java.util.List<WalletTickerManager.CoinInfo>) list);
            final Function1 function1 = new Function1() { // from class: o.eUO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eUI.copydefault(this.AEQbTJ, abstractC12782ctV, (WalletTickerManager.CoinPriceRes) obj);
                }
            };
            AbstractC58185ywX<R> abstractC58185ywXCopydefault2 = abstractC58185ywXCopydefault.copydefault(new InterfaceC58229yxO() { // from class: o.eUP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58229yxO
                public final java.lang.Object apply(java.lang.Object obj) {
                    return eUI.gHZMYf(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.eUN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eUI.OLrzqt(this.copydefault, (java.lang.Integer) obj);
                }
            };
            InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.eUM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    eUI.zuBGHE(function12, obj);
                }
            };
            final Function1 function13 = new Function1() { // from class: o.eUL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eUI.AhwBna((java.lang.Throwable) obj);
                }
            };
            eui.fvQaOB = abstractC58185ywXCopydefault2.AEQbTJ((InterfaceC58227yxM<? super R>) interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.eUU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    eUI.ORxRYg(function13, obj);
                }
            });
        } else {
            C10856bwO.copydefault(eui.OLrzqt, 0, "subTickers coins no change");
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC58261yxu gHZMYf(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu copydefault(eUI eui, AbstractC12782ctV abstractC12782ctV, WalletTickerManager.CoinPriceRes coinPriceRes) {
        Intrinsics.checkNotNullParameter(coinPriceRes, "");
        return eui.KWHzl(abstractC12782ctV);
    }

    public static final void zuBGHE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(eUI eui, java.lang.Integer num) {
        requestAllHomeData$default(eui, RemoteMessageConst.Notification.TICKER, null, false, false, true, false, null, false, false, null, 806, null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void ORxRYg(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final void QOLQEE(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit valueOf(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final WalletCoinAssetPartialEntity AEQbTJ(AbstractC12782ctV abstractC12782ctV, C10525bqB c10525bqB, WalletTickerManager.CoinPrice coinPrice) {
        kotlin.Pair<java.lang.String, java.lang.String> pairOLrzqt;
        java.lang.String strZLjUOn;
        if (c10525bqB == null) {
            return null;
        }
        if ((C33129mqd.OLrzqt(c10525bqB.fIwbmz(), "0") && C33129mqd.OLrzqt((java.lang.Object) new BigDecimal(c10525bqB.AhwBna()), (java.lang.Object) 0)) || coinPrice == null) {
            return null;
        }
        java.lang.String strZsXlph = c10525bqB.zsXlph();
        if (strZsXlph != null && strZsXlph.length() > 0 && (strZLjUOn = c10525bqB.zLjUOn()) != null && strZLjUOn.length() > 0) {
            C10541bqR c10541bqR = C10541bqR.OLrzqt;
            java.lang.String strFIwbmz = c10525bqB.fIwbmz();
            java.lang.String strZsXlph2 = c10525bqB.zsXlph();
            java.lang.String str = strZsXlph2 == null ? "" : strZsXlph2;
            java.lang.String price = coinPrice.getPrice();
            java.lang.String strZLjUOn2 = c10525bqB.zLjUOn();
            pairOLrzqt = c10541bqR.copydefault("", strFIwbmz, str, price, strZLjUOn2 == null ? "" : strZLjUOn2);
        } else {
            pairOLrzqt = C56390yDp.OLrzqt(c10525bqB.sSMYrx(), c10525bqB.gHZMYf());
        }
        java.lang.String strDbNXlk = abstractC12782ctV.DbNXlk();
        long jOLrzqt = c10525bqB.OLrzqt();
        java.lang.String strZuBGHE = c10525bqB.zuBGHE();
        java.lang.String strConvertToString$default = C54862xYb.convertToString$default(C54862xYb.OLrzqt(c10525bqB.fIwbmz(), coinPrice.getPrice()), false, null, null, 7, null);
        java.lang.String first = pairOLrzqt.getFirst();
        java.lang.String str2 = first == null ? "" : first;
        java.lang.String second = pairOLrzqt.getSecond();
        return new WalletCoinAssetPartialEntity(strDbNXlk, jOLrzqt, strZuBGHE, strConvertToString$default, str2, second == null ? "" : second);
    }

    public final AbstractC58260yxt<java.lang.Integer> KWHzl(final AbstractC12782ctV abstractC12782ctV) {
        final java.util.ArrayList arrayList = new java.util.ArrayList(this.AuCTel);
        AbstractC58260yxt abstractC58260yxtKWHzl = AbstractC58260yxt.copydefault(new Callable() { // from class: o.eVt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return eUI.OLrzqt(abstractC12782ctV, arrayList, this);
            }
        }).KWHzl(yBP.KWHzl());
        final Function1 function1 = new Function1() { // from class: o.eVr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eUI.OLrzqt((java.util.ArrayList) obj);
            }
        };
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtOLrzqt = abstractC58260yxtKWHzl.OLrzqt(new InterfaceC58229yxO() { // from class: o.eVp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return eUI.AxsJAY(function1, obj);
            }
        }).OLrzqt(C58266yxz.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtOLrzqt, "");
        return abstractC58260yxtOLrzqt;
    }

    public static final java.util.ArrayList OLrzqt(AbstractC12782ctV abstractC12782ctV, java.util.ArrayList arrayList, eUI eui) {
        C10525bqB c10525bqBKWHzl;
        C10854bwM c10854bwMKWHzl;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        WalletSelectedChainBean walletSelectedChainBeanKWHzl = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(abstractC12782ctV.DbNXlk());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C10525bqB c10525bqB = (C10525bqB) it.next();
            if (c10525bqB.ORxRYg()) {
                if (walletSelectedChainBeanKWHzl.isAllNetwork()) {
                    KWHzl(abstractC12782ctV, eui, c10525bqB, arrayList2, abstractC12782ctV.KWHzl(c10525bqB.OLrzqt(), (java.lang.Integer) null));
                    java.util.ArrayList<java.lang.Long> arrayListFARcdN = c10525bqB.fARcdN();
                    if (arrayListFARcdN != null) {
                        java.util.Iterator<T> it2 = arrayListFARcdN.iterator();
                        while (it2.hasNext()) {
                            KWHzl(abstractC12782ctV, eui, c10525bqB, arrayList2, abstractC12782ctV.KWHzl(((java.lang.Number) it2.next()).longValue(), (java.lang.Integer) null));
                        }
                    }
                } else {
                    if (c10525bqB.KWHzl().AEQbTJ() == C33129mqd.valueOf(walletSelectedChainBeanKWHzl.getChainId())) {
                        c10525bqBKWHzl = abstractC12782ctV.KWHzl(c10525bqB.KWHzl().AhwBna(), (java.lang.Integer) null);
                    } else {
                        java.util.ArrayList<java.lang.Long> arrayListFARcdN2 = c10525bqB.fARcdN();
                        if (arrayListFARcdN2 != null) {
                            java.util.Iterator<T> it3 = arrayListFARcdN2.iterator();
                            while (it3.hasNext()) {
                                C10525bqB c10525bqBKWHzl2 = abstractC12782ctV.KWHzl(((java.lang.Number) it3.next()).longValue(), (java.lang.Integer) null);
                                if (c10525bqBKWHzl2 != null && (c10854bwMKWHzl = c10525bqBKWHzl2.KWHzl()) != null && c10854bwMKWHzl.AEQbTJ() == C33129mqd.valueOf(walletSelectedChainBeanKWHzl.getChainId())) {
                                    c10525bqBKWHzl = c10525bqBKWHzl2;
                                    break;
                                }
                            }
                            c10525bqBKWHzl = null;
                        } else {
                            c10525bqBKWHzl = null;
                        }
                    }
                    WalletCoinAssetPartialEntity walletCoinAssetPartialEntityAEQbTJ = AEQbTJ(abstractC12782ctV, c10525bqBKWHzl, eui.AxsJAYsNCnLh.AEQbTJ(c10525bqBKWHzl != null ? c10525bqBKWHzl.OLrzqt() : -1L));
                    if (walletCoinAssetPartialEntityAEQbTJ != null) {
                        arrayList2.add(walletCoinAssetPartialEntityAEQbTJ);
                    }
                }
            } else if (c10525bqB.QKVWgx()) {
                java.util.List<C10525bqB> listAYXKKw = abstractC12782ctV.AYXKKw(c10525bqB.OLrzqt());
                if (listAYXKKw != null) {
                    for (C10525bqB c10525bqB2 : listAYXKKw) {
                        WalletCoinAssetPartialEntity walletCoinAssetPartialEntityAEQbTJ2 = AEQbTJ(abstractC12782ctV, c10525bqB2, eui.AxsJAYsNCnLh.AEQbTJ(c10525bqB2.OLrzqt()));
                        if (walletCoinAssetPartialEntityAEQbTJ2 != null) {
                            arrayList2.add(walletCoinAssetPartialEntityAEQbTJ2);
                        }
                    }
                }
            } else {
                WalletCoinAssetPartialEntity walletCoinAssetPartialEntityAEQbTJ3 = AEQbTJ(abstractC12782ctV, c10525bqB, eui.AxsJAYsNCnLh.AEQbTJ(c10525bqB.OLrzqt()));
                if (walletCoinAssetPartialEntityAEQbTJ3 != null) {
                    arrayList2.add(walletCoinAssetPartialEntityAEQbTJ3);
                }
            }
        }
        return arrayList2;
    }

    public static final void KWHzl(AbstractC12782ctV abstractC12782ctV, eUI eui, C10525bqB c10525bqB, java.util.ArrayList<WalletCoinAssetPartialEntity> arrayList, C10525bqB c10525bqB2) {
        WalletCoinAssetPartialEntity walletCoinAssetPartialEntityAEQbTJ = AEQbTJ(abstractC12782ctV, c10525bqB2, eui.AxsJAYsNCnLh.copydefault(c10525bqB.OLrzqt()));
        if (walletCoinAssetPartialEntityAEQbTJ != null) {
            arrayList.add(walletCoinAssetPartialEntityAEQbTJ);
        }
    }

    public static final InterfaceC58261yxu AxsJAY(Function1 function1, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC58261yxu) function1.invoke(obj);
    }

    public static final InterfaceC58261yxu OLrzqt(java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, 1, null).KWHzl().EZpvd(arrayList).KWHzl(yBP.AEQbTJ());
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0155 */
    /* JADX DEBUG: Multi-variable search result rejected for r37v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r37v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r37v2, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.util.ArrayList<eUG> KWHzl(AbstractC12782ctV abstractC12782ctV, java.util.List<C10594brR> list) {
        InterfaceC25424iwU interfaceC25424iwUGEmmrt = gEmmrt();
        boolean z = true;
        int i = 0;
        boolean z2 = interfaceC25424iwUGEmmrt != null && interfaceC25424iwUGEmmrt.EZpvd(abstractC12782ctV.DbNXlk());
        java.util.ArrayList<eUG> arrayList = new java.util.ArrayList<>();
        for (C10594brR c10594brR : list) {
            boolean zAEQbTJ = C33129mqd.AEQbTJ(c10594brR.values(), java.lang.Integer.valueOf(i));
            java.lang.String strAkhnZx = c10594brR.fetchVPNInfo().AkhnZx();
            java.lang.String strFetchVPNInfo = c10594brR.fetchVPNInfo().fetchVPNInfo();
            java.lang.String strFJNWhG = c10594brR.KWHzl().fJNWhG();
            java.lang.String strValues = c10594brR.KWHzl().values();
            java.lang.String strEZpvd = C54870xYj.EZpvd(c10594brR.values(), c10594brR.KWHzl().valueOf(), c10594brR.KWHzl().AkhnZx(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null);
            java.lang.String strAhwBna = c10594brR.AhwBna();
            java.util.ArrayList arrayListCopydefault = yDY.copydefault(new eUG(c10594brR.DbNXlk().DbNXlk(), "", C14733dqy.copydefault.KWHzl(c10594brR.DbNXlk()), "", c10594brR.KWHzl().values(), true, C54870xYj.EZpvd(c10594brR.values(), c10594brR.KWHzl().valueOf(), c10594brR.KWHzl().AkhnZx(), null, (248 & 8) != 0 ? DisplaySign.AUTO : null, (248 & 16) != 0 ? false : false, (248 & 32) != 0 ? null : null, (248 & 64) != 0 ? false : false, (248 & 128) != 0 ? RoundingMode.DOWN : null), c10594brR.AhwBna(), false, null, "", 0, null, null, null, null, false, null, false, false, false, 0, false, false, 0, null, null, false, false, false, false, null, null, false, false, null, null, -2048, 31, null));
            int iQfsBiF = c10594brR.KWHzl().QfsBiF();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (zAEQbTJ) {
                arrayList2.add(java.lang.Long.valueOf(c10594brR.KWHzl().AhwBna()));
            }
            Unit unit = Unit.INSTANCE;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            if (!zAEQbTJ) {
                arrayList3.add(java.lang.Long.valueOf(c10594brR.KWHzl().AhwBna()));
            }
            boolean z3 = (abstractC12782ctV.AwvSrB() || abstractC12782ctV.AubY()) ? z : i;
            java.util.ArrayList<eUG> arrayList4 = arrayList;
            arrayList4.add(new eUG(strAkhnZx, strFetchVPNInfo, strFJNWhG, "", strValues, false, strEZpvd, strAhwBna, false, arrayListCopydefault, "", 0, null, "", "", "", true, java.lang.Integer.valueOf(iQfsBiF), false, false, false, 0, false, false, 0, arrayList2, arrayList3, false, z2, false, false, null, null, z3, abstractC12782ctV.DTwDnp(), null, null, -369354752, 25, null));
            arrayList = arrayList4;
            z = true;
            i = 0;
        }
        return arrayList;
    }

    public final java.util.List<C10525bqB> AEQbTJ(AbstractC12782ctV abstractC12782ctV, java.util.List<C10525bqB> list) {
        return this.finit.AEQbTJ(abstractC12782ctV, list);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.bbN.TaskDescription.getDisplayAmount$default(o.bbN, boolean, boolean, int, java.lang.Object):java.lang.String */
    /* JADX DEBUG: Multi-variable search result rejected for r37v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r3v16, resolved type: java.lang.Long */
    /* JADX DEBUG: Multi-variable search result rejected for r3v19, resolved type: java.lang.Long */
    /* JADX DEBUG: Multi-variable search result rejected for r3v30, resolved type: java.lang.Long */
    /* JADX DEBUG: Multi-variable search result rejected for r3v31, resolved type: java.lang.Long */
    /* JADX DEBUG: Multi-variable search result rejected for r40v2, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.ArrayList<eUG> OLrzqt(AbstractC12782ctV abstractC12782ctV, java.util.List<C10525bqB> list) {
        java.lang.Integer num;
        java.util.Map<java.lang.String, java.util.List<java.lang.Long>> map;
        WalletTickerManager.CoinPrice coinPriceAEQbTJ;
        boolean zAEQbTJ;
        int i;
        boolean z;
        boolean z2;
        int i2;
        java.lang.String priceChangePercent24h;
        java.lang.String price;
        boolean zAEQbTJ2;
        java.lang.Long l;
        C10854bwM c10854bwMKWHzl;
        long jLongValue;
        InterfaceC25424iwU interfaceC25424iwUGEmmrt;
        java.util.ArrayList<eUG> arrayList = new java.util.ArrayList<>();
        java.lang.Integer num2 = 0;
        boolean z3 = zuBGHE() && (interfaceC25424iwUGEmmrt = gEmmrt()) != null && interfaceC25424iwUGEmmrt.EZpvd(abstractC12782ctV.DbNXlk());
        java.util.Map<java.lang.String, java.util.List<java.lang.Long>> mapDLWbHP = abstractC12782ctV.DLWbHP();
        java.lang.Integer num3 = null;
        WalletSelectedChainBean walletSelectedChainBeanKWHzl = C10614brl.TaskDescription.getInstance$default(C10614brl.Companion, null, 1, null).KWHzl(abstractC12782ctV.DbNXlk());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        boolean z4 = false;
        for (C10525bqB c10525bqB : list) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            if (c10525bqB.ORxRYg()) {
                if (walletSelectedChainBeanKWHzl.isAllNetwork()) {
                    boolean z5 = z4;
                    WalletTickerManager.CoinPrice coinPriceCopydefault = this.AxsJAYsNCnLh.copydefault(c10525bqB.KWHzl().AhwBna());
                    java.util.Iterator<T> it = mapDLWbHP.getOrDefault(c10525bqB.KWHzl().fJNWhG(), yDY.AhwBna()).iterator();
                    boolean zAEQbTJ3 = z5;
                    while (it.hasNext()) {
                        java.lang.Integer num4 = num2;
                        long jLongValue2 = ((java.lang.Number) it.next()).longValue();
                        C10525bqB c10525bqBKWHzl = c10525bqB.values().KWHzl(jLongValue2, num3);
                        zAEQbTJ3 = C33129mqd.AEQbTJ(c10525bqBKWHzl != null ? c10525bqBKWHzl.fIwbmz() : num3, num4);
                        if (zAEQbTJ3) {
                            arrayList3.add(java.lang.Long.valueOf(jLongValue2));
                        } else {
                            arrayList4.add(java.lang.Long.valueOf(jLongValue2));
                        }
                        num2 = num4;
                    }
                    num = num2;
                    coinPriceAEQbTJ = coinPriceCopydefault;
                    zAEQbTJ = zAEQbTJ3;
                    map = mapDLWbHP;
                } else {
                    num = num2;
                    boolean z6 = z4;
                    if (c10525bqB.KWHzl().AEQbTJ() == C33129mqd.valueOf(walletSelectedChainBeanKWHzl.getChainId())) {
                        java.lang.Long lValueOf = java.lang.Long.valueOf(c10525bqB.OLrzqt());
                        zAEQbTJ2 = C33129mqd.AEQbTJ(c10525bqB.fIwbmz(), num);
                        l = lValueOf;
                    } else {
                        java.util.ArrayList<java.lang.Long> arrayListFARcdN = c10525bqB.fARcdN();
                        if (arrayListFARcdN != null) {
                            java.util.Iterator<T> it2 = arrayListFARcdN.iterator();
                            while (it2.hasNext()) {
                                long jLongValue3 = ((java.lang.Number) it2.next()).longValue();
                                C10525bqB c10525bqBKWHzl2 = c10525bqB.values().KWHzl(jLongValue3, num3);
                                if (c10525bqBKWHzl2 != null && (c10854bwMKWHzl = c10525bqBKWHzl2.KWHzl()) != null && c10854bwMKWHzl.AEQbTJ() == C33129mqd.valueOf(walletSelectedChainBeanKWHzl.getChainId())) {
                                    java.lang.Long lValueOf2 = java.lang.Long.valueOf(jLongValue3);
                                    zAEQbTJ2 = C33129mqd.AEQbTJ(c10525bqBKWHzl2.fIwbmz(), num);
                                    l = lValueOf2;
                                    break;
                                }
                            }
                            zAEQbTJ2 = z6;
                            l = num3;
                        } else {
                            zAEQbTJ2 = z6;
                            l = num3;
                        }
                    }
                    WalletTickerManager walletTickerManager = this.AxsJAYsNCnLh;
                    if (l != 0) {
                        map = mapDLWbHP;
                        jLongValue = l.longValue();
                    } else {
                        map = mapDLWbHP;
                        jLongValue = -1;
                    }
                    WalletTickerManager.CoinPrice coinPriceAEQbTJ2 = walletTickerManager.AEQbTJ(jLongValue);
                    if (zAEQbTJ2) {
                        arrayList3.add(java.lang.Long.valueOf(l != 0 ? l.longValue() : -1L));
                    } else {
                        arrayList4.add(java.lang.Long.valueOf(l != 0 ? l.longValue() : -1L));
                    }
                    coinPriceAEQbTJ = coinPriceAEQbTJ2;
                    zAEQbTJ = zAEQbTJ2;
                }
            } else {
                num = num2;
                map = mapDLWbHP;
                coinPriceAEQbTJ = this.AxsJAYsNCnLh.AEQbTJ(c10525bqB.KWHzl().AhwBna());
                zAEQbTJ = C33129mqd.AEQbTJ(c10525bqB.fIwbmz(), num);
                if (zAEQbTJ) {
                    arrayList3.add(java.lang.Long.valueOf(c10525bqB.KWHzl().AhwBna()));
                } else {
                    arrayList4.add(java.lang.Long.valueOf(c10525bqB.KWHzl().AhwBna()));
                }
            }
            java.lang.String strWlaJM = c10525bqB.wlaJM();
            java.lang.String strDbNXlk = c10525bqB.KWHzl().DbNXlk();
            java.lang.String strFJNWhG = c10525bqB.KWHzl().fJNWhG();
            java.lang.String strGEmmrt = c10525bqB.KWHzl().gEmmrt();
            boolean z7 = zAEQbTJ;
            java.lang.String displayAmount$default = InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB, false, true, 1, null);
            java.lang.String strAhwBna = c10525bqB.AhwBna();
            if (c10525bqB.KWHzl().OuxcSI()) {
                C13852daR c13852daRODWQjV = c10525bqB.values().ODWQjV();
                if ((c13852daRODWQjV != null ? c13852daRODWQjV.valueOf() : null) != EOSState.Opened) {
                    i = 1;
                    z = true;
                }
            } else {
                i = 1;
                z = false;
            }
            eUG[] eugArr = new eUG[i];
            java.lang.String strDbNXlk2 = c10525bqB.values().DbNXlk();
            java.util.Map<java.lang.String, java.util.List<java.lang.Long>> map2 = map;
            java.lang.CharSequence charSequenceKWHzl = C14733dqy.copydefault.KWHzl(c10525bqB.values());
            java.lang.Integer num5 = num;
            java.lang.String addressStr$default = C14079deg.getAddressStr$default(C14079deg.EZpvd, c10525bqB.zuBGHE(), false, 2, null);
            java.lang.String displayAmount$default2 = InterfaceC9742bbN.TaskDescription.getDisplayAmount$default(c10525bqB, false, true, 1, null);
            java.lang.String strAhwBna2 = c10525bqB.AhwBna();
            if (c10525bqB.KWHzl().OuxcSI()) {
                C13852daR c13852daRODWQjV2 = c10525bqB.values().ODWQjV();
                if ((c13852daRODWQjV2 != null ? c13852daRODWQjV2.valueOf() : null) != EOSState.Opened) {
                    z2 = true;
                }
            } else {
                z2 = false;
            }
            eugArr[0] = new eUG(strDbNXlk2, "", charSequenceKWHzl, "", addressStr$default, true, displayAmount$default2, strAhwBna2, z2, null, "", 0, null, null, null, null, false, null, false, false, false, 0, false, false, 0, null, null, false, false, false, false, null, null, false, false, null, null, -2048, 31, null);
            java.util.ArrayList arrayListCopydefault = yDY.copydefault(eugArr);
            java.lang.String str = (coinPriceAEQbTJ == null || (price = coinPriceAEQbTJ.getPrice()) == null) ? "" : price;
            java.lang.String str2 = (coinPriceAEQbTJ == null || (priceChangePercent24h = coinPriceAEQbTJ.getPriceChangePercent24h()) == null) ? "" : priceChangePercent24h;
            java.lang.String strFIwbmz = c10525bqB.fIwbmz();
            int iQfsBiF = c10525bqB.KWHzl().QfsBiF();
            boolean zIsAnchoredToken = coinPriceAEQbTJ != null ? coinPriceAEQbTJ.isAnchoredToken() : false;
            boolean zRJOkX = c10525bqB.RJOkX();
            java.lang.Integer numQUSxYX = c10525bqB.KWHzl().QUSxYX();
            int iIntValue = numQUSxYX != null ? numQUSxYX.intValue() : 0;
            java.lang.Integer numDHguZz = c10525bqB.KWHzl().dHguZz();
            if (numDHguZz == null) {
                i2 = 1;
            } else {
                i2 = 1;
                boolean z8 = numDHguZz.intValue() == 1;
                java.util.ArrayList arrayList5 = arrayList2;
                eUG eug = new eUG(strWlaJM, strDbNXlk, strFJNWhG, "", strGEmmrt, false, displayAmount$default, strAhwBna, z, arrayListCopydefault, "", false ? 1 : 0, null, str, str2, strFIwbmz, false, java.lang.Integer.valueOf(iQfsBiF), zIsAnchoredToken, zRJOkX, false, iIntValue, z8, c10525bqB.KWHzl().getNewProxyInstance(), c10525bqB.KWHzl().AkhnZx(), arrayList3, arrayList4, c10525bqB.ORxRYg(), z3, C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, i2, null).KWHzl(abstractC12782ctV), (!c10525bqB.ORxRYg() || c10525bqB.QKVWgx()) ? i2 : 0, c10525bqB.sSMYrx(), c10525bqB.gHZMYf(), (!abstractC12782ctV.AwvSrB() || (abstractC12782ctV.AubY() && !abstractC12782ctV.DTwDnp())) ? i2 : 0, abstractC12782ctV.DTwDnp(), c10525bqB.AubY(), c10525bqB.OcIXYQ(), 1120256, 0, null);
                java.lang.String strDjBIcL = eug.djBIcL();
                java.lang.CharSequence charSequenceAhwBna = eug.AhwBna();
                arrayList5.add(strDjBIcL + "-" + ((java.lang.Object) charSequenceAhwBna) + "-" + eug.KWHzl() + "/" + (coinPriceAEQbTJ == null ? java.lang.Long.valueOf(coinPriceAEQbTJ.getCoinId()) : null) + "-" + (coinPriceAEQbTJ == null ? coinPriceAEQbTJ.getPrice() : null));
                arrayList.add(eug);
                z4 = z7;
                mapDLWbHP = map2;
                arrayList2 = arrayList5;
                num2 = num5;
                num3 = null;
            }
            java.util.ArrayList arrayList52 = arrayList2;
            eUG eug2 = new eUG(strWlaJM, strDbNXlk, strFJNWhG, "", strGEmmrt, false, displayAmount$default, strAhwBna, z, arrayListCopydefault, "", false ? 1 : 0, null, str, str2, strFIwbmz, false, java.lang.Integer.valueOf(iQfsBiF), zIsAnchoredToken, zRJOkX, false, iIntValue, z8, c10525bqB.KWHzl().getNewProxyInstance(), c10525bqB.KWHzl().AkhnZx(), arrayList3, arrayList4, c10525bqB.ORxRYg(), z3, C10407bnq.ActionBar.getInstance$default(C10407bnq.Companion, null, i2, null).KWHzl(abstractC12782ctV), (!c10525bqB.ORxRYg() || c10525bqB.QKVWgx()) ? i2 : 0, c10525bqB.sSMYrx(), c10525bqB.gHZMYf(), (!abstractC12782ctV.AwvSrB() || (abstractC12782ctV.AubY() && !abstractC12782ctV.DTwDnp())) ? i2 : 0, abstractC12782ctV.DTwDnp(), c10525bqB.AubY(), c10525bqB.OcIXYQ(), 1120256, 0, null);
            java.lang.String strDjBIcL2 = eug2.djBIcL();
            java.lang.CharSequence charSequenceAhwBna2 = eug2.AhwBna();
            if (coinPriceAEQbTJ == null) {
            }
            if (coinPriceAEQbTJ == null) {
            }
            arrayList52.add(strDjBIcL2 + "-" + ((java.lang.Object) charSequenceAhwBna2) + "-" + eug2.KWHzl() + "/" + (coinPriceAEQbTJ == null ? java.lang.Long.valueOf(coinPriceAEQbTJ.getCoinId()) : null) + "-" + (coinPriceAEQbTJ == null ? coinPriceAEQbTJ.getPrice() : null));
            arrayList.add(eug2);
            z4 = z7;
            mapDLWbHP = map2;
            arrayList2 = arrayList52;
            num2 = num5;
            num3 = null;
        }
        C10856bwO.copydefault(this.OLrzqt, 0, "generateTokenList: " + arrayList2);
        return arrayList;
    }

    public final void KWHzl(boolean z) {
        AbstractC12782ctV value;
        this.zuBGHE = z;
        if (z) {
            if (!C33129mqd.KWHzl((java.util.Collection) this.gGvvIC) || (value = this.QOLQEE.getValue()) == null) {
                return;
            }
            java.util.List<C10525bqB> listAhwBna = this.gGvvIC;
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            OLrzqt("setNeedSubTicker", value, listAhwBna);
            return;
        }
        AwvSrB();
    }

    public final void AwvSrB() {
        InterfaceC58217yxC interfaceC58217yxC = this.giSNqX;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.fvQaOB;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
    }

    public final void gHZMYf() {
        C11205cFp.EZpvd.sSMYrx().OLrzqt("subPnl-home");
    }

    public final void EZpvd(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, final Function0<Unit> function0, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        AbstractC58185ywX<ResponseData<ReportRiskyTokenResp>> abstractC58185ywXKWHzl = wlaJM().KWHzl(new ReportRiskyTokenReq(java.lang.Long.valueOf(j), str, str2, java.lang.Integer.valueOf(i)), str3, str4, str5).copydefault(yBP.AEQbTJ()).KWHzl(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.eUH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eUI.OLrzqt(function0, (ResponseData) obj);
            }
        };
        this.QfsBiF = abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.eUJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                eUI.hDKMBd(function1, obj);
            }
        });
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function0 function0, ResponseData responseData) {
        java.lang.Boolean reportStatus;
        ReportRiskyTokenResp reportRiskyTokenResp = (ReportRiskyTokenResp) responseData.getData();
        if (reportRiskyTokenResp != null && (reportStatus = reportRiskyTokenResp.getReportStatus()) != null && reportStatus.booleanValue() && function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        InterfaceC58217yxC interfaceC58217yxC = this.valueOf;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC2 = this.AxsJAYaxsJAY;
        if (interfaceC58217yxC2 != null) {
            interfaceC58217yxC2.dispose();
        }
        InterfaceC58217yxC interfaceC58217yxC3 = this.QfsBiF;
        if (interfaceC58217yxC3 != null) {
            interfaceC58217yxC3.dispose();
        }
        C11205cFp c11205cFp = C11205cFp.EZpvd;
        c11205cFp.zLjUOn().OLrzqt(this.values);
        c11205cFp.AubY().OLrzqt(this.AkhnZx);
        c11205cFp.AwvSrB().OLrzqt(this.DTwDnp);
        c11205cFp.ORxRYg().OLrzqt(this.gkJEwt);
        if (eLJ.Companion.AEQbTJ()) {
            c11205cFp.wlaJM().OLrzqt(this.AYXKKw);
        }
        c11205cFp.OcIXYQ().OLrzqt(this.hUfVAv);
        AwvSrB();
        gHZMYf();
        this.djBIcL = null;
        this.fJNWhG.removeCallbacksAndMessages(null);
    }

    public final java.util.ArrayList<eUG> OLrzqt(java.util.ArrayList<eUG> arrayList, java.util.List<C10525bqB> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
        for (java.lang.Object obj : list) {
            linkedHashMap.put(((C10525bqB) obj).KWHzl().OcIXYQ(), obj);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (eUG eug : arrayList) {
            if (eug.ejfBZ() == 5) {
                java.util.List listAYXKKw = eug.AYXKKw();
                if (listAYXKKw == null) {
                    listAYXKKw = yDY.AhwBna();
                }
                arrayList2.addAll(listAYXKKw);
            } else {
                arrayList2.add(eug);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (java.lang.Object obj2 : arrayList2) {
            eUG eug2 = (eUG) obj2;
            C10525bqB c10525bqB = (C10525bqB) linkedHashMap.get(eug2.djBIcL());
            java.lang.Long lValueOf = c10525bqB != null ? java.lang.Long.valueOf(c10525bqB.AEQbTJ()) : null;
            java.lang.String lowerCase = StringsKt__StringsKt.KWHzl(eug2.AhwBna().toString(), (java.lang.CharSequence) "$").toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            kotlin.Pair pair = new kotlin.Pair(lowerCase, lValueOf);
            java.lang.Object arrayList3 = linkedHashMap2.get(pair);
            if (arrayList3 == null) {
                arrayList3 = new java.util.ArrayList();
                linkedHashMap2.put(pair, arrayList3);
            }
            ((java.util.List) arrayList3).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (((java.util.List) entry.getValue()).size() > 1) {
                for (eUG eug3 : (java.lang.Iterable) entry.getValue()) {
                    if (!eug3.zLjUOn()) {
                        eug3.OLrzqt(4);
                    }
                }
            }
        }
        return arrayList;
    }
}
