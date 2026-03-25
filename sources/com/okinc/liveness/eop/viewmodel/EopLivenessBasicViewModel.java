package com.okinc.liveness.eop.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.AuthSession;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.core.Consumer;
import com.google.firebase.messaging.Constants;
import com.google.gson.Gson;
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.kyc.api.biz.bean.FacialExtParams;
import com.okinc.liveness.eop.bean.AwsConfigResp;
import com.okinc.liveness.eop.bean.AwsSessionResultResp;
import com.okinc.liveness.eop.bean.EFRConfig;
import com.okinc.liveness.eop.bean.EFRResultReq;
import com.okinc.liveness.eop.bean.LivenessConfig;
import com.okinc.liveness.eop.bean.LivenessRouter;
import com.okinc.liveness.eop.bean.LivenessRouterResp;
import com.okinc.liveness.eop.bean.LivenessSessionInfoResp;
import com.okinc.liveness.eop.bean.RiskVendorType;
import com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.liveness.lca.KycSdkEventConst;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.ok_kyc_core.data.efr.EFRData;
import com.okinc.ok_kyc_core.data.eop.VendorConfig;
import com.okinc.ok_kyc_core.data.lca.LcaJwstWsSessionIdOriginalData;
import com.okinc.ok_kyc_core.data.lca.LcaMissedKeyException;
import com.okinc.ok_kyc_core.data.lca.LcaObfuscateData;
import com.okinc.ok_kyc_core.data.lca.LcaSdkLivenessConfig;
import com.okinc.ok_kyc_core.data.lca.LivenessSessionInfoLcaEncryptionData;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.okinc.okrisk.OKRiskLibrarySource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import o.AbstractC33073mpa;
import o.AbstractC43419rot;
import o.C32866mlf;
import o.C32868mlh;
import o.C33070mpX;
import o.C33129mqd;
import o.C38208pQf;
import o.C38274pSs;
import o.C42467rTy;
import o.C43251rlk;
import o.C43401rob;
import o.C43422row;
import o.C43734ruq;
import o.C45508srO;
import o.C46979thQ;
import o.C47029tiN;
import o.C52481wN;
import o.C54819xWm;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56444yFp;
import o.C59449zhJ;
import o.C6777aVl;
import o.C6885aXn;
import o.C6887aXp;
import o.InterfaceC42440rSy;
import o.InterfaceC46982thT;
import o.InterfaceC47027tiL;
import o.InterfaceC5079Dx;
import o.InterfaceC56445yFq;
import o.InterfaceC6884aXm;
import o.pHD;
import o.pRV;
import o.pUU;
import o.rTL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class EopLivenessBasicViewModel extends AbstractC33073mpa {
    public boolean AuCTelauCTel;
    public int ORxRYg;
    public String QbewEr;
    public VendorConfig QfsBiF;
    public String ejfBZ;
    public String fARcdN;
    public String fIwbmz;
    public boolean gHZMYf;
    public FacialExtParams uzCIH;
    public String values;
    public LcaSdkLivenessConfig zLjUOn;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public static final String AEQbTJ = LivenessRouter.AWS.getVendorName();
    public static final String EZpvd = LivenessRouter.ALI.getVendorName();
    public static final String KWHzl = LivenessRouter.LCA.getVendorName();
    public static final String OLrzqt = LivenessRouter.EFR.getVendorName();
    public String RJOkX = "";
    public String fetchVPNInfo = "";
    public String QVAiDq = "";
    public ArrayList<EopPageNode> QOLQEE = new ArrayList<>();
    public final pRV<String> zuBGHE = new pRV<>();
    public final pRV<String> djBIcL = new pRV<>();
    public final pRV<Boolean> OcIXYQ = new pRV<>();
    public final pRV<String> isConnected = new pRV<>();
    public final pRV<Pair<Integer, Intent>> iwGUEr = new pRV<>();
    public final pRV<EFRData> fJNWhG = new pRV<>();
    public final pRV<String> wlaJM = new pRV<>();
    public boolean getFieldNames = true;
    public boolean getNewProxyInstance = true;
    public boolean zsXlph = true;
    public final pRV<String> AuCTel = new pRV<>();
    public final pRV<C43734ruq<Boolean>> valueOf = new pRV<>();
    public final pRV<C43734ruq<Boolean>> AhwBna = new pRV<>();
    public final pRV<C43734ruq<Boolean>> AYXKKw = new pRV<>();
    public String sSMYrx = "";
    public String AubY = "";
    public String DbNXlk = "";
    public String gEmmrt = "";
    public String hDKMBd = "";
    public String djSkpj = "";
    public String QUSxYX = "";
    public String QKVWgx = "";
    public String DTwDnp = "";
    public String AwvSrB = "";
    public ArrayList<String> AxsJAY = new ArrayList<>();
    public String AkhnZx = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pRV<String> AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sSMYrx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pRV<String> AuCTelauCTel() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> AxsJAY() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DTwDnp() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void DbNXlk(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.QVAiDq = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd() {
        this.ORxRYg--;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fetchVPNInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AuCTelauCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(FacialExtParams facialExtParams) {
        this.uzCIH = facialExtParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(VendorConfig vendorConfig) {
        this.QfsBiF = vendorConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ORxRYg() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VendorConfig QKVWgx() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QOLQEE() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QUSxYX() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QbewEr() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean RJOkX() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(LcaSdkLivenessConfig lcaSdkLivenessConfig) {
        this.zLjUOn = lcaSdkLivenessConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void dNCPSb() {
        this.ORxRYg++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pRV<Pair<Integer, Intent>> ejfBZ() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pRV<String> fARcdN() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pRV<String> fIwbmz() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FacialExtParams fJNWhG() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pRV<EFRData> fetchVPNInfo() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fetchVPNInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.QUSxYX = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.RJOkX = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gHZMYf() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaSdkLivenessConfig getFieldNames() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String hDKMBd() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pRV<String> iwGUEr() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String sSMYrx() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String uzCIH() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AubY = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<Boolean>> values() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<Boolean>> wlaJM() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C43734ruq<Boolean>> zLjUOn() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zsXlph() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pRV<Boolean> zuBGHE() {
        return this.OcIXYQ;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final String KWHzl() {
            return EopLivenessBasicViewModel.AEQbTJ;
        }

        public final String copydefault() {
            return EopLivenessBasicViewModel.EZpvd;
        }

        public final String OLrzqt() {
            return EopLivenessBasicViewModel.KWHzl;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class EopPageNode {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ EopPageNode[] $VALUES;
        public static final EopPageNode FaceGuide = new EopPageNode("FaceGuide", 0);
        public static final EopPageNode FaceScan = new EopPageNode("FaceScan", 1);
        public static final EopPageNode FaceResult = new EopPageNode("FaceResult", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ EopPageNode[] $values() {
            return new EopPageNode[]{FaceGuide, FaceScan, FaceResult};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<EopPageNode> getEntries() {
            return $ENTRIES;
        }

        private EopPageNode(String str, int i) {
        }

        static {
            EopPageNode[] eopPageNodeArr$values = $values();
            $VALUES = eopPageNodeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(eopPageNodeArr$values);
        }

        public static EopPageNode valueOf(String str) {
            return (EopPageNode) Enum.valueOf(EopPageNode.class, str);
        }

        public static EopPageNode[] values() {
            return (EopPageNode[]) $VALUES.clone();
        }
    }

    public final String OcIXYQ() {
        if (this.AuCTelauCTel) {
            return "face_verification";
        }
        VendorConfig vendorConfig = this.QfsBiF;
        return C33129mqd.gEmmrt(vendorConfig != null ? vendorConfig.getSource() : null);
    }

    public static /* synthetic */ void initTaskLink$default(EopLivenessBasicViewModel eopLivenessBasicViewModel, EopPageNode eopPageNode, int i, Object obj) {
        if ((i & 1) != 0) {
            eopPageNode = EopPageNode.FaceGuide;
        }
        eopLivenessBasicViewModel.KWHzl(eopPageNode);
    }

    public final void KWHzl(EopPageNode eopPageNode) {
        int iCopydefault;
        this.ORxRYg = 0;
        this.QOLQEE.clear();
        this.QOLQEE.add(EopPageNode.FaceGuide);
        this.QOLQEE.add(EopPageNode.FaceScan);
        this.QOLQEE.add(EopPageNode.FaceResult);
        if (!C33129mqd.OLrzqt((CharSequence) this.sSMYrx) || (iCopydefault = CollectionsKt___CollectionsKt.copydefault((List<? extends EopPageNode>) ((List<? extends Object>) this.QOLQEE), eopPageNode)) < 0) {
            return;
        }
        this.ORxRYg = iCopydefault;
    }

    public final EopPageNode AkhnZx() {
        int size = this.QOLQEE.size();
        int i = this.ORxRYg;
        if (i < 0 || i >= size) {
            return null;
        }
        return this.QOLQEE.get(i);
    }

    public final void djBIcL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AuCTelauCTel().setValue(str);
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        fIwbmz().setValue(str);
    }

    public final void EZpvd(boolean z) {
        zuBGHE().setValue(Boolean.valueOf(z));
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AYXKKw().setValue(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.Pair<java.lang.Integer, ? extends android.content.Intent> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(@NotNull Pair<Integer, ? extends Intent> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        ejfBZ().setValue(pair);
    }

    public final void copydefault(@NotNull EFRData eFRData) {
        Intrinsics.checkNotNullParameter(eFRData, "");
        fetchVPNInfo().setValue(eFRData);
    }

    public final void AYXKKw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        iwGUEr().setValue(str);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        fARcdN().setValue(str);
    }

    public final boolean QVAiDq() {
        return Intrinsics.EZpvd((Object) this.AuCTel.getValue(), (Object) AEQbTJ) || Intrinsics.EZpvd((Object) this.AuCTel.getValue(), (Object) EZpvd);
    }

    public static /* synthetic */ void toastError$default(EopLivenessBasicViewModel eopLivenessBasicViewModel, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        eopLivenessBasicViewModel.OLrzqt(i, str, str2);
    }

    public final void OLrzqt(final int i, final String str, final String str2) {
        String str3;
        try {
            str3 = C33070mpX.AYXKKw(C45508srO.Application.EZpvd) + " " + i;
        } catch (Exception e) {
            pUU.KWHzl("kyc_in_house", "getString() error1=" + e);
            str3 = "";
        }
        if (str3.length() == 0) {
            try {
                str3 = C54819xWm.KWHzl().AEQbTJ().getString(C45508srO.Application.EZpvd) + " " + i;
            } catch (Exception e2) {
                pUU.KWHzl("kyc_in_house", "getString() error2=" + e2);
            }
        }
        C55326xho.toastWithFailedIcon$default(str3, 0, 1, (Object) null);
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("Provicence_Eye_Livensss_Check_Type_Failed", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return EopLivenessBasicViewModel.AEQbTJ(i, str, this, str2, (EventParamsList) obj);
            }
        });
    }

    public static final Unit AEQbTJ(int i, String str, EopLivenessBasicViewModel eopLivenessBasicViewModel, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("code", String.valueOf(i), true);
        eventParamsList.put("type", str, true);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        if (Intrinsics.EZpvd((Object) str, (Object) Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_MSG_HUMP, str2, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getLivenessRouter$default(EopLivenessBasicViewModel eopLivenessBasicViewModel, Context context, Function0 function0, Function1 function1, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return eopLivenessBasicViewModel.copydefault(context, (Function0<Unit>) function0, (Function1<? super String, Unit>) function1, (Continuation<? super Unit>) continuation);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:109:0x0259 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:111:0x025b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:140:0x02f6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:149:0x0324 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0053 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:201:0x0217 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0233 A[Catch: Exception -> 0x025b, TRY_LEAVE, TryCatch #15 {Exception -> 0x025b, blocks: (B:102:0x022b, B:104:0x0233, B:98:0x0217), top: B:201:0x0217 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0202  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v10, types: [com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r3v28, types: [com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel] */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v18, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r7v22, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r7v23, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r7v31, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type update failed for variable: r25v0 'this'  ??, new type: com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9481. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:58)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Type update failed for variable: r25v0 'this'  ??, new type: com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9481. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:72)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Type update failed for variable: r25v0 'this'  com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel, new type: com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9481. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyInvokeTypes(TypeUpdate.java:399)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.invokeListener(TypeUpdate.java:364)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:72)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Type update failed for variable: r8v4 ??, new type: com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9481. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:58)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Type update failed for variable: r8v6 ??, new type: com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9481. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:58)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Type update failed for variable: r8v8 ??, new type: com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9481. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:58)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Context context, @NotNull Function0<Unit> function0, Function1<? super String, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        EopLivenessBasicViewModel$getLivenessRouter$1 eopLivenessBasicViewModel$getLivenessRouter$1;
        String str;
        final ?? r6;
        ?? r5;
        String str2;
        ?? r12;
        ?? r8;
        ?? r15;
        Context context2;
        Function0<Unit> function02;
        Function1<? super String, Unit> function12;
        Function1<? super String, Unit> function13;
        final EopLivenessBasicViewModel eopLivenessBasicViewModel;
        CoroutineDispatcher io2;
        EopLivenessBasicViewModel$getLivenessRouter$livenessRouterResp$1$1 eopLivenessBasicViewModel$getLivenessRouter$livenessRouterResp$1$1;
        AbstractC43419rot actionBar;
        AbstractC43419rot actionBar2;
        Function1<? super String, Unit> function14;
        final LivenessRouterResp livenessRouterResp;
        String faceCheckType;
        String riskVendorType;
        EopLivenessBasicViewModel eopLivenessBasicViewModel2;
        ?? r52;
        String str3;
        String faceCheckType2;
        String faceCheckType3;
        LivenessConfig livenessConfig;
        String faceCheckType4;
        String strAwvSrB;
        String encryptionData;
        C42467rTy c42467rTy;
        Function1<? super String, Unit> function15;
        ResponseData responseData;
        Function0 function03;
        EopLivenessBasicViewModel eopLivenessBasicViewModel3;
        if (continuation instanceof EopLivenessBasicViewModel$getLivenessRouter$1) {
            eopLivenessBasicViewModel$getLivenessRouter$1 = (EopLivenessBasicViewModel$getLivenessRouter$1) continuation;
            int i = eopLivenessBasicViewModel$getLivenessRouter$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eopLivenessBasicViewModel$getLivenessRouter$1.label = i - Integer.MIN_VALUE;
            } else {
                eopLivenessBasicViewModel$getLivenessRouter$1 = new EopLivenessBasicViewModel$getLivenessRouter$1(this, continuation);
            }
        }
        EopLivenessBasicViewModel$getLivenessRouter$1 eopLivenessBasicViewModel$getLivenessRouter$12 = eopLivenessBasicViewModel$getLivenessRouter$1;
        Object objWithContext = eopLivenessBasicViewModel$getLivenessRouter$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r122 = 1;
        String str4 = "kyc_in_house";
        try {
        } catch (Exception e) {
            e = e;
        }
        switch (eopLivenessBasicViewModel$getLivenessRouter$12.label) {
            case 0:
                C56391yDq.AEQbTJ(objWithContext);
                try {
                    io2 = Dispatchers.getIO();
                    eopLivenessBasicViewModel$getLivenessRouter$livenessRouterResp$1$1 = new EopLivenessBasicViewModel$getLivenessRouter$livenessRouterResp$1$1(this, null);
                    eopLivenessBasicViewModel$getLivenessRouter$12.L$0 = this;
                    context2 = context;
                } catch (Throwable th) {
                    th = th;
                    context2 = context;
                }
                try {
                    eopLivenessBasicViewModel$getLivenessRouter$12.L$1 = context2;
                    function02 = function0;
                } catch (Throwable th2) {
                    th = th2;
                    function02 = function0;
                    function12 = function1;
                    function13 = function12;
                    eopLivenessBasicViewModel = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    function14 = function13;
                    actionBar2 = actionBar;
                    r122 = function02;
                    try {
                        livenessRouterResp = (LivenessRouterResp) actionBar2.AEQbTJ();
                        faceCheckType = livenessRouterResp.getFaceCheckType();
                        if (faceCheckType == null) {
                        }
                        eopLivenessBasicViewModel.QUSxYX = faceCheckType;
                        riskVendorType = livenessRouterResp.getRiskVendorType();
                        if (riskVendorType == null) {
                        }
                        eopLivenessBasicViewModel.QbewEr = riskVendorType;
                        C46979thQ c46979thQ = C46979thQ.copydefault;
                        InterfaceC46982thT interfaceC46982thTOLrzqt = c46979thQ.OLrzqt();
                        OKRiskLibrarySource oKRiskLibrarySource = OKRiskLibrarySource.KYC_LIVENESS;
                        InterfaceC46982thT.TaskDescription.profileBiometric$default(interfaceC46982thTOLrzqt, oKRiskLibrarySource, null, 2, null);
                        if (Intrinsics.EZpvd((Object) eopLivenessBasicViewModel.QbewEr, (Object) RiskVendorType.ALI.getVendorName())) {
                        }
                        try {
                            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
                            C32866mlf.EZpvd("FaceLiveness_Get_Router_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRy
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return EopLivenessBasicViewModel.EZpvd(this.EZpvd, livenessRouterResp, (EventParamsList) obj);
                                }
                            });
                            str3 = str;
                            try {
                                pUU.KWHzl(str3, "getLivenessRouter->vendorType=" + eopLivenessBasicViewModel.QUSxYX);
                                faceCheckType2 = livenessRouterResp.getFaceCheckType();
                                if (Intrinsics.EZpvd((Object) faceCheckType2, (Object) LivenessRouter.AWS.getVendorName())) {
                                }
                            } catch (Exception e2) {
                                e = e2;
                                r15 = eopLivenessBasicViewModel;
                                str = str3;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            r15 = eopLivenessBasicViewModel;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        r15 = eopLivenessBasicViewModel;
                        str2 = null;
                        str = "kyc_in_house";
                    }
                    return Unit.INSTANCE;
                }
                try {
                    eopLivenessBasicViewModel$getLivenessRouter$12.L$2 = function02;
                    function12 = function1;
                } catch (Throwable th3) {
                    th = th3;
                    function12 = function1;
                    function13 = function12;
                    eopLivenessBasicViewModel = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    function14 = function13;
                    actionBar2 = actionBar;
                    r122 = function02;
                    livenessRouterResp = (LivenessRouterResp) actionBar2.AEQbTJ();
                    faceCheckType = livenessRouterResp.getFaceCheckType();
                    if (faceCheckType == null) {
                    }
                    eopLivenessBasicViewModel.QUSxYX = faceCheckType;
                    riskVendorType = livenessRouterResp.getRiskVendorType();
                    if (riskVendorType == null) {
                    }
                    eopLivenessBasicViewModel.QbewEr = riskVendorType;
                    C46979thQ c46979thQ2 = C46979thQ.copydefault;
                    InterfaceC46982thT interfaceC46982thTOLrzqt2 = c46979thQ2.OLrzqt();
                    OKRiskLibrarySource oKRiskLibrarySource2 = OKRiskLibrarySource.KYC_LIVENESS;
                    InterfaceC46982thT.TaskDescription.profileBiometric$default(interfaceC46982thTOLrzqt2, oKRiskLibrarySource2, null, 2, null);
                    if (Intrinsics.EZpvd((Object) eopLivenessBasicViewModel.QbewEr, (Object) RiskVendorType.ALI.getVendorName())) {
                    }
                    TrackChannel[] trackChannelArrCopydefault2 = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("FaceLiveness_Get_Router_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return EopLivenessBasicViewModel.EZpvd(this.EZpvd, livenessRouterResp, (EventParamsList) obj);
                        }
                    });
                    str3 = str;
                    pUU.KWHzl(str3, "getLivenessRouter->vendorType=" + eopLivenessBasicViewModel.QUSxYX);
                    faceCheckType2 = livenessRouterResp.getFaceCheckType();
                    if (Intrinsics.EZpvd((Object) faceCheckType2, (Object) LivenessRouter.AWS.getVendorName())) {
                    }
                    return Unit.INSTANCE;
                }
                try {
                    eopLivenessBasicViewModel$getLivenessRouter$12.L$3 = function12;
                    eopLivenessBasicViewModel$getLivenessRouter$12.label = 1;
                    objWithContext = BuildersKt.withContext(io2, eopLivenessBasicViewModel$getLivenessRouter$livenessRouterResp$1$1, eopLivenessBasicViewModel$getLivenessRouter$12);
                    break;
                } catch (Throwable th4) {
                    th = th4;
                    function13 = function12;
                    eopLivenessBasicViewModel = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    function14 = function13;
                    actionBar2 = actionBar;
                    r122 = function02;
                    livenessRouterResp = (LivenessRouterResp) actionBar2.AEQbTJ();
                    faceCheckType = livenessRouterResp.getFaceCheckType();
                    if (faceCheckType == null) {
                    }
                    eopLivenessBasicViewModel.QUSxYX = faceCheckType;
                    riskVendorType = livenessRouterResp.getRiskVendorType();
                    if (riskVendorType == null) {
                    }
                    eopLivenessBasicViewModel.QbewEr = riskVendorType;
                    C46979thQ c46979thQ22 = C46979thQ.copydefault;
                    InterfaceC46982thT interfaceC46982thTOLrzqt22 = c46979thQ22.OLrzqt();
                    OKRiskLibrarySource oKRiskLibrarySource22 = OKRiskLibrarySource.KYC_LIVENESS;
                    InterfaceC46982thT.TaskDescription.profileBiometric$default(interfaceC46982thTOLrzqt22, oKRiskLibrarySource22, null, 2, null);
                    if (Intrinsics.EZpvd((Object) eopLivenessBasicViewModel.QbewEr, (Object) RiskVendorType.ALI.getVendorName())) {
                    }
                    TrackChannel[] trackChannelArrCopydefault22 = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("FaceLiveness_Get_Router_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault22, trackChannelArrCopydefault22.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return EopLivenessBasicViewModel.EZpvd(this.EZpvd, livenessRouterResp, (EventParamsList) obj);
                        }
                    });
                    str3 = str;
                    pUU.KWHzl(str3, "getLivenessRouter->vendorType=" + eopLivenessBasicViewModel.QUSxYX);
                    faceCheckType2 = livenessRouterResp.getFaceCheckType();
                    if (Intrinsics.EZpvd((Object) faceCheckType2, (Object) LivenessRouter.AWS.getVendorName())) {
                    }
                    return Unit.INSTANCE;
                }
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                function13 = function12;
                eopLivenessBasicViewModel = this;
                try {
                    responseData = (ResponseData) objWithContext;
                } catch (Throwable th5) {
                    th = th5;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                    function14 = function13;
                    actionBar2 = actionBar;
                    r122 = function02;
                    livenessRouterResp = (LivenessRouterResp) actionBar2.AEQbTJ();
                    faceCheckType = livenessRouterResp.getFaceCheckType();
                    if (faceCheckType == null) {
                    }
                    eopLivenessBasicViewModel.QUSxYX = faceCheckType;
                    riskVendorType = livenessRouterResp.getRiskVendorType();
                    if (riskVendorType == null) {
                    }
                    eopLivenessBasicViewModel.QbewEr = riskVendorType;
                    C46979thQ c46979thQ222 = C46979thQ.copydefault;
                    InterfaceC46982thT interfaceC46982thTOLrzqt222 = c46979thQ222.OLrzqt();
                    OKRiskLibrarySource oKRiskLibrarySource222 = OKRiskLibrarySource.KYC_LIVENESS;
                    InterfaceC46982thT.TaskDescription.profileBiometric$default(interfaceC46982thTOLrzqt222, oKRiskLibrarySource222, null, 2, null);
                    if (Intrinsics.EZpvd((Object) eopLivenessBasicViewModel.QbewEr, (Object) RiskVendorType.ALI.getVendorName())) {
                    }
                    TrackChannel[] trackChannelArrCopydefault222 = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("FaceLiveness_Get_Router_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault222, trackChannelArrCopydefault222.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return EopLivenessBasicViewModel.EZpvd(this.EZpvd, livenessRouterResp, (EventParamsList) obj);
                        }
                    });
                    str3 = str;
                    pUU.KWHzl(str3, "getLivenessRouter->vendorType=" + eopLivenessBasicViewModel.QUSxYX);
                    faceCheckType2 = livenessRouterResp.getFaceCheckType();
                    if (Intrinsics.EZpvd((Object) faceCheckType2, (Object) LivenessRouter.AWS.getVendorName())) {
                    }
                    return Unit.INSTANCE;
                }
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                r122 = function02;
                Function1<? super String, Unit> function16 = function13;
                actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                function14 = function16;
                livenessRouterResp = (LivenessRouterResp) actionBar2.AEQbTJ();
                faceCheckType = livenessRouterResp.getFaceCheckType();
                if (faceCheckType == null) {
                    faceCheckType = "";
                }
                eopLivenessBasicViewModel.QUSxYX = faceCheckType;
                riskVendorType = livenessRouterResp.getRiskVendorType();
                if (riskVendorType == null) {
                    riskVendorType = "";
                }
                eopLivenessBasicViewModel.QbewEr = riskVendorType;
                C46979thQ c46979thQ2222 = C46979thQ.copydefault;
                InterfaceC46982thT interfaceC46982thTOLrzqt2222 = c46979thQ2222.OLrzqt();
                OKRiskLibrarySource oKRiskLibrarySource2222 = OKRiskLibrarySource.KYC_LIVENESS;
                InterfaceC46982thT.TaskDescription.profileBiometric$default(interfaceC46982thTOLrzqt2222, oKRiskLibrarySource2222, null, 2, null);
                if (Intrinsics.EZpvd((Object) eopLivenessBasicViewModel.QbewEr, (Object) RiskVendorType.ALI.getVendorName())) {
                    try {
                        rTL.OLrzqt.OLrzqt();
                        str = "kyc_in_house";
                        try {
                            InterfaceC46982thT.TaskDescription.profile$default(c46979thQ2222.OLrzqt(), oKRiskLibrarySource2222, new Application(System.currentTimeMillis()), eopLivenessBasicViewModel.RJOkX, null, 8, null);
                        } catch (Exception e5) {
                            e = e5;
                            eopLivenessBasicViewModel2 = eopLivenessBasicViewModel;
                            r52 = r122;
                            str2 = null;
                            r5 = r52;
                            r6 = eopLivenessBasicViewModel2;
                            r6.AhwBna.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
                            pUU.KWHzl(str, "getLivenessRouter error = " + e.getMessage() + ",vendorType=" + r6.QUSxYX);
                            if (!(e instanceof OKServerException)) {
                                TrackChannel[] trackChannelArrCopydefault3 = C32868mlh.OLrzqt.copydefault();
                                C32866mlf.EZpvd("FaceLiveness_Get_Router_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRD
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return EopLivenessBasicViewModel.AEQbTJ(this.copydefault, e, (EventParamsList) obj);
                                    }
                                });
                                String message = e.getMessage();
                                if (message != null) {
                                    C55326xho.toastWithFailedIcon$default(message, 0, 1, str2);
                                }
                            } else {
                                r6.OLrzqt(4, Constants.IPC_BUNDLE_KEY_SEND_ERROR, e.toString());
                            }
                            r5.invoke();
                            return Unit.INSTANCE;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        str = "kyc_in_house";
                    }
                    break;
                } else {
                    str = "kyc_in_house";
                }
                TrackChannel[] trackChannelArrCopydefault2222 = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("FaceLiveness_Get_Router_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2222, trackChannelArrCopydefault2222.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return EopLivenessBasicViewModel.EZpvd(this.EZpvd, livenessRouterResp, (EventParamsList) obj);
                    }
                });
                str3 = str;
                pUU.KWHzl(str3, "getLivenessRouter->vendorType=" + eopLivenessBasicViewModel.QUSxYX);
                faceCheckType2 = livenessRouterResp.getFaceCheckType();
                if (Intrinsics.EZpvd((Object) faceCheckType2, (Object) LivenessRouter.AWS.getVendorName())) {
                    try {
                        faceCheckType3 = livenessRouterResp.getFaceCheckType();
                        eopLivenessBasicViewModel$getLivenessRouter$12.L$0 = eopLivenessBasicViewModel;
                        eopLivenessBasicViewModel$getLivenessRouter$12.L$1 = r122;
                        eopLivenessBasicViewModel$getLivenessRouter$12.L$2 = null;
                        eopLivenessBasicViewModel$getLivenessRouter$12.L$3 = null;
                        eopLivenessBasicViewModel$getLivenessRouter$12.label = 2;
                        str = str3;
                    } catch (Exception e7) {
                        e = e7;
                        str = str3;
                        r52 = r122;
                        eopLivenessBasicViewModel2 = eopLivenessBasicViewModel;
                        str2 = null;
                        r5 = r52;
                        r6 = eopLivenessBasicViewModel2;
                        r6.AhwBna.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
                        pUU.KWHzl(str, "getLivenessRouter error = " + e.getMessage() + ",vendorType=" + r6.QUSxYX);
                        if (!(e instanceof OKServerException)) {
                        }
                        r5.invoke();
                    }
                    try {
                        if (getLivenessSessionInfo$default(eopLivenessBasicViewModel, faceCheckType3, null, null, r122, function14, eopLivenessBasicViewModel$getLivenessRouter$12, 6, null) == objCopydefault) {
                            return objCopydefault;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        r8 = eopLivenessBasicViewModel;
                        str2 = null;
                        r12 = r122;
                        r6 = r8;
                        r5 = r12;
                        r6.AhwBna.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
                        pUU.KWHzl(str, "getLivenessRouter error = " + e.getMessage() + ",vendorType=" + r6.QUSxYX);
                        if (!(e instanceof OKServerException)) {
                        }
                        r5.invoke();
                    }
                } else {
                    EopLivenessBasicViewModel eopLivenessBasicViewModel4 = eopLivenessBasicViewModel;
                    str = str3;
                    try {
                        if (!Intrinsics.EZpvd((Object) faceCheckType2, (Object) LivenessRouter.ALI.getVendorName())) {
                            r15 = eopLivenessBasicViewModel4;
                            try {
                                if (Intrinsics.EZpvd((Object) faceCheckType2, (Object) LivenessRouter.LCA.getVendorName())) {
                                    LivenessConfig livenessConfig2 = livenessRouterResp.getLivenessConfig();
                                    if (livenessConfig2 != null && (encryptionData = livenessConfig2.getEncryptionData()) != null) {
                                        rTL rtl = rTL.OLrzqt;
                                        Gson gson = new Gson();
                                        byte[] bArrDecode = Base64.decode(encryptionData, 0);
                                        Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
                                        Object objFromJson = gson.fromJson(C59449zhJ.copydefault(bArrDecode), (Class<Object>) LcaObfuscateData.class);
                                        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
                                        LivenessConfig livenessConfig3 = (LivenessConfig) rtl.EZpvd((LcaObfuscateData) objFromJson, LivenessConfig.class);
                                        if (livenessConfig3 == null) {
                                            livenessConfig = null;
                                            faceCheckType4 = livenessRouterResp.getFaceCheckType();
                                            strAwvSrB = r15.AwvSrB();
                                            eopLivenessBasicViewModel$getLivenessRouter$12.L$0 = r15;
                                            eopLivenessBasicViewModel$getLivenessRouter$12.L$1 = r122;
                                            eopLivenessBasicViewModel$getLivenessRouter$12.L$2 = null;
                                            eopLivenessBasicViewModel$getLivenessRouter$12.L$3 = null;
                                            eopLivenessBasicViewModel$getLivenessRouter$12.label = 5;
                                            if (r15.EZpvd(faceCheckType4, livenessConfig, strAwvSrB, r122, function14, eopLivenessBasicViewModel$getLivenessRouter$12) == objCopydefault) {
                                            }
                                        } else {
                                            livenessConfig = livenessConfig3;
                                            faceCheckType4 = livenessRouterResp.getFaceCheckType();
                                            strAwvSrB = r15.AwvSrB();
                                            eopLivenessBasicViewModel$getLivenessRouter$12.L$0 = r15;
                                            eopLivenessBasicViewModel$getLivenessRouter$12.L$1 = r122;
                                            eopLivenessBasicViewModel$getLivenessRouter$12.L$2 = null;
                                            eopLivenessBasicViewModel$getLivenessRouter$12.L$3 = null;
                                            eopLivenessBasicViewModel$getLivenessRouter$12.label = 5;
                                            if (r15.EZpvd(faceCheckType4, livenessConfig, strAwvSrB, r122, function14, eopLivenessBasicViewModel$getLivenessRouter$12) == objCopydefault) {
                                            }
                                        }
                                    } else {
                                        livenessConfig = null;
                                        faceCheckType4 = livenessRouterResp.getFaceCheckType();
                                        strAwvSrB = r15.AwvSrB();
                                        eopLivenessBasicViewModel$getLivenessRouter$12.L$0 = r15;
                                        eopLivenessBasicViewModel$getLivenessRouter$12.L$1 = r122;
                                        eopLivenessBasicViewModel$getLivenessRouter$12.L$2 = null;
                                        eopLivenessBasicViewModel$getLivenessRouter$12.L$3 = null;
                                        eopLivenessBasicViewModel$getLivenessRouter$12.label = 5;
                                        if (r15.EZpvd(faceCheckType4, livenessConfig, strAwvSrB, r122, function14, eopLivenessBasicViewModel$getLivenessRouter$12) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                    }
                                } else if (Intrinsics.EZpvd((Object) faceCheckType2, (Object) LivenessRouter.EFR.getVendorName())) {
                                    String faceCheckType5 = livenessRouterResp.getFaceCheckType();
                                    eopLivenessBasicViewModel$getLivenessRouter$12.L$0 = r15;
                                    eopLivenessBasicViewModel$getLivenessRouter$12.L$1 = r122;
                                    eopLivenessBasicViewModel$getLivenessRouter$12.L$2 = null;
                                    eopLivenessBasicViewModel$getLivenessRouter$12.L$3 = null;
                                    eopLivenessBasicViewModel$getLivenessRouter$12.label = 6;
                                    str2 = null;
                                    try {
                                        if (getLivenessSessionInfo$default(r15, faceCheckType5, null, null, r122, function14, eopLivenessBasicViewModel$getLivenessRouter$12, 6, null) == objCopydefault) {
                                            return objCopydefault;
                                        }
                                    } catch (Exception e9) {
                                        e = e9;
                                        r8 = r15;
                                        r12 = r122;
                                        r6 = r8;
                                        r5 = r12;
                                        r6.AhwBna.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
                                        pUU.KWHzl(str, "getLivenessRouter error = " + e.getMessage() + ",vendorType=" + r6.QUSxYX);
                                        if (!(e instanceof OKServerException)) {
                                        }
                                        r5.invoke();
                                    }
                                } else {
                                    str2 = null;
                                    try {
                                        pUU.KWHzl(str, "checkType = " + livenessRouterResp.getFaceCheckType());
                                        String faceCheckType6 = livenessRouterResp.getFaceCheckType();
                                        if (faceCheckType6 == null) {
                                            faceCheckType6 = "";
                                        }
                                        r15.OLrzqt(6, faceCheckType6, "");
                                        r122.invoke();
                                    } catch (Exception e10) {
                                        e = e10;
                                        r5 = r122;
                                        r6 = r15;
                                        r6.AhwBna.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
                                        pUU.KWHzl(str, "getLivenessRouter error = " + e.getMessage() + ",vendorType=" + r6.QUSxYX);
                                        if (!(e instanceof OKServerException)) {
                                        }
                                        r5.invoke();
                                    }
                                    break;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                str2 = null;
                            }
                        } else if (context2 != null) {
                            try {
                                c42467rTy = C42467rTy.KWHzl;
                                r15 = eopLivenessBasicViewModel4;
                            } catch (Exception e12) {
                                e = e12;
                                r15 = eopLivenessBasicViewModel4;
                                str4 = null;
                                str2 = str4;
                                r8 = r15;
                                r12 = r122;
                                r6 = r8;
                                r5 = r12;
                                r6.AhwBna.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
                                pUU.KWHzl(str, "getLivenessRouter error = " + e.getMessage() + ",vendorType=" + r6.QUSxYX);
                                if (!(e instanceof OKServerException)) {
                                }
                                r5.invoke();
                            }
                            try {
                                eopLivenessBasicViewModel$getLivenessRouter$12.L$0 = r15;
                                eopLivenessBasicViewModel$getLivenessRouter$12.L$1 = r122;
                                eopLivenessBasicViewModel$getLivenessRouter$12.L$2 = function14;
                                eopLivenessBasicViewModel$getLivenessRouter$12.L$3 = livenessRouterResp;
                                eopLivenessBasicViewModel$getLivenessRouter$12.label = 3;
                                Object objAEQbTJ = c42467rTy.AEQbTJ(context2, eopLivenessBasicViewModel$getLivenessRouter$12);
                                if (objAEQbTJ == objCopydefault) {
                                    return objCopydefault;
                                }
                                function15 = function14;
                                objWithContext = objAEQbTJ;
                                r122 = r122;
                                r15 = r15;
                                if (((Boolean) objWithContext).booleanValue()) {
                                    String strKWHzl = ((InterfaceC42440rSy) C43251rlk.copydefault(InterfaceC42440rSy.class)).KWHzl();
                                    String faceCheckType7 = livenessRouterResp.getFaceCheckType();
                                    eopLivenessBasicViewModel$getLivenessRouter$12.L$0 = r15;
                                    eopLivenessBasicViewModel$getLivenessRouter$12.L$1 = r122;
                                    eopLivenessBasicViewModel$getLivenessRouter$12.L$2 = null;
                                    eopLivenessBasicViewModel$getLivenessRouter$12.L$3 = null;
                                    eopLivenessBasicViewModel$getLivenessRouter$12.label = 4;
                                    if (r15.EZpvd(faceCheckType7, null, strKWHzl, r122, function15, eopLivenessBasicViewModel$getLivenessRouter$12) == objCopydefault) {
                                        return objCopydefault;
                                    }
                                }
                            } catch (Exception e13) {
                                e = e13;
                                str4 = null;
                                str2 = str4;
                                r8 = r15;
                                r12 = r122;
                                r6 = r8;
                                r5 = r12;
                                r6.AhwBna.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
                                pUU.KWHzl(str, "getLivenessRouter error = " + e.getMessage() + ",vendorType=" + r6.QUSxYX);
                                if (!(e instanceof OKServerException)) {
                                }
                                r5.invoke();
                            }
                        }
                    } catch (Exception e14) {
                        e = e14;
                        r15 = eopLivenessBasicViewModel4;
                        str2 = null;
                        r5 = r122;
                        r6 = r15;
                        r6.AhwBna.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
                        pUU.KWHzl(str, "getLivenessRouter error = " + e.getMessage() + ",vendorType=" + r6.QUSxYX);
                        if (!(e instanceof OKServerException)) {
                        }
                        r5.invoke();
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                function13 = (Function1) eopLivenessBasicViewModel$getLivenessRouter$12.L$3;
                Function0<Unit> function04 = (Function0) eopLivenessBasicViewModel$getLivenessRouter$12.L$2;
                Context context3 = (Context) eopLivenessBasicViewModel$getLivenessRouter$12.L$1;
                eopLivenessBasicViewModel = (EopLivenessBasicViewModel) eopLivenessBasicViewModel$getLivenessRouter$12.L$0;
                try {
                    C56391yDq.AEQbTJ(objWithContext);
                    function02 = function04;
                    context2 = context3;
                    responseData = (ResponseData) objWithContext;
                    if (responseData.getCode() != 0) {
                    }
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    r122 = function02;
                    Function1<? super String, Unit> function162 = function13;
                    actionBar2 = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    function14 = function162;
                    break;
                } catch (Throwable th6) {
                    th = th6;
                    function02 = function04;
                    context2 = context3;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    function14 = function13;
                    actionBar2 = actionBar;
                    r122 = function02;
                    livenessRouterResp = (LivenessRouterResp) actionBar2.AEQbTJ();
                    faceCheckType = livenessRouterResp.getFaceCheckType();
                    if (faceCheckType == null) {
                    }
                    eopLivenessBasicViewModel.QUSxYX = faceCheckType;
                    riskVendorType = livenessRouterResp.getRiskVendorType();
                    if (riskVendorType == null) {
                    }
                    eopLivenessBasicViewModel.QbewEr = riskVendorType;
                    C46979thQ c46979thQ22222 = C46979thQ.copydefault;
                    InterfaceC46982thT interfaceC46982thTOLrzqt22222 = c46979thQ22222.OLrzqt();
                    OKRiskLibrarySource oKRiskLibrarySource22222 = OKRiskLibrarySource.KYC_LIVENESS;
                    InterfaceC46982thT.TaskDescription.profileBiometric$default(interfaceC46982thTOLrzqt22222, oKRiskLibrarySource22222, null, 2, null);
                    if (Intrinsics.EZpvd((Object) eopLivenessBasicViewModel.QbewEr, (Object) RiskVendorType.ALI.getVendorName())) {
                    }
                    TrackChannel[] trackChannelArrCopydefault22222 = C32868mlh.OLrzqt.copydefault();
                    C32866mlf.EZpvd("FaceLiveness_Get_Router_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault22222, trackChannelArrCopydefault22222.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return EopLivenessBasicViewModel.EZpvd(this.EZpvd, livenessRouterResp, (EventParamsList) obj);
                        }
                    });
                    str3 = str;
                    pUU.KWHzl(str3, "getLivenessRouter->vendorType=" + eopLivenessBasicViewModel.QUSxYX);
                    faceCheckType2 = livenessRouterResp.getFaceCheckType();
                    if (Intrinsics.EZpvd((Object) faceCheckType2, (Object) LivenessRouter.AWS.getVendorName())) {
                    }
                    return Unit.INSTANCE;
                }
                livenessRouterResp = (LivenessRouterResp) actionBar2.AEQbTJ();
                faceCheckType = livenessRouterResp.getFaceCheckType();
                if (faceCheckType == null) {
                }
                eopLivenessBasicViewModel.QUSxYX = faceCheckType;
                riskVendorType = livenessRouterResp.getRiskVendorType();
                if (riskVendorType == null) {
                }
                eopLivenessBasicViewModel.QbewEr = riskVendorType;
                C46979thQ c46979thQ222222 = C46979thQ.copydefault;
                InterfaceC46982thT interfaceC46982thTOLrzqt222222 = c46979thQ222222.OLrzqt();
                OKRiskLibrarySource oKRiskLibrarySource222222 = OKRiskLibrarySource.KYC_LIVENESS;
                InterfaceC46982thT.TaskDescription.profileBiometric$default(interfaceC46982thTOLrzqt222222, oKRiskLibrarySource222222, null, 2, null);
                if (Intrinsics.EZpvd((Object) eopLivenessBasicViewModel.QbewEr, (Object) RiskVendorType.ALI.getVendorName())) {
                }
                TrackChannel[] trackChannelArrCopydefault222222 = C32868mlh.OLrzqt.copydefault();
                C32866mlf.EZpvd("FaceLiveness_Get_Router_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault222222, trackChannelArrCopydefault222222.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return EopLivenessBasicViewModel.EZpvd(this.EZpvd, livenessRouterResp, (EventParamsList) obj);
                    }
                });
                str3 = str;
                pUU.KWHzl(str3, "getLivenessRouter->vendorType=" + eopLivenessBasicViewModel.QUSxYX);
                faceCheckType2 = livenessRouterResp.getFaceCheckType();
                if (Intrinsics.EZpvd((Object) faceCheckType2, (Object) LivenessRouter.AWS.getVendorName())) {
                }
                return Unit.INSTANCE;
            case 2:
            case 4:
            case 5:
            case 6:
                Function0 function05 = (Function0) eopLivenessBasicViewModel$getLivenessRouter$12.L$1;
                EopLivenessBasicViewModel eopLivenessBasicViewModel5 = (EopLivenessBasicViewModel) eopLivenessBasicViewModel$getLivenessRouter$12.L$0;
                try {
                    C56391yDq.AEQbTJ(objWithContext);
                    break;
                } catch (Exception e15) {
                    e = e15;
                    function03 = function05;
                    eopLivenessBasicViewModel3 = eopLivenessBasicViewModel5;
                    str2 = null;
                    str = "kyc_in_house";
                    r5 = function03;
                    r6 = eopLivenessBasicViewModel3;
                    r6.AhwBna.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
                    pUU.KWHzl(str, "getLivenessRouter error = " + e.getMessage() + ",vendorType=" + r6.QUSxYX);
                    if (!(e instanceof OKServerException)) {
                    }
                    r5.invoke();
                }
                return Unit.INSTANCE;
            case 3:
                livenessRouterResp = (LivenessRouterResp) eopLivenessBasicViewModel$getLivenessRouter$12.L$3;
                Function1<? super String, Unit> function17 = (Function1) eopLivenessBasicViewModel$getLivenessRouter$12.L$2;
                function03 = (Function0) eopLivenessBasicViewModel$getLivenessRouter$12.L$1;
                eopLivenessBasicViewModel3 = (EopLivenessBasicViewModel) eopLivenessBasicViewModel$getLivenessRouter$12.L$0;
                try {
                    C56391yDq.AEQbTJ(objWithContext);
                    function15 = function17;
                    r122 = function03;
                    r15 = eopLivenessBasicViewModel3;
                    str = "kyc_in_house";
                    if (((Boolean) objWithContext).booleanValue()) {
                    }
                } catch (Exception e16) {
                    e = e16;
                    str2 = null;
                    str = "kyc_in_house";
                    r5 = function03;
                    r6 = eopLivenessBasicViewModel3;
                    r6.AhwBna.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
                    pUU.KWHzl(str, "getLivenessRouter error = " + e.getMessage() + ",vendorType=" + r6.QUSxYX);
                    if (!(e instanceof OKServerException)) {
                    }
                    r5.invoke();
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final class Application implements InterfaceC47027tiL {
        public final /* synthetic */ long EZpvd;

        public Application(long j) {
            this.EZpvd = j;
        }

        @Override // o.InterfaceC47027tiL
        public void onDeviceTokenReturned(final C47029tiN c47029tiN) {
            Intrinsics.checkNotNullParameter(c47029tiN, "");
            pUU.KWHzl("kyc_in_house", "Risk onDeviceTokenReturned, status=" + c47029tiN.OLrzqt() + " | alicode=" + c47029tiN.KWHzl());
            rTL.OLrzqt.AEQbTJ(C33129mqd.gEmmrt(c47029tiN.AEQbTJ()));
            final long jCurrentTimeMillis = System.currentTimeMillis();
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            TrackChannel[] trackChannelArr = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
            final long j = this.EZpvd;
            C32866mlf.EZpvd("FaceLiveness_Get_VendorToken_View", trackChannelArr, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return EopLivenessBasicViewModel.Application.copydefault(jCurrentTimeMillis, j, c47029tiN, (EventParamsList) obj);
                }
            });
        }

        public static final Unit copydefault(long j, long j2, C47029tiN c47029tiN, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "duration", C33129mqd.gEmmrt(Long.valueOf(j - j2)), false, 4, null);
            EventParamsList.put$default(eventParamsList, "status", C33129mqd.gEmmrt(c47029tiN.OLrzqt()), false, 4, null);
            EventParamsList.put$default(eventParamsList, "code", C33129mqd.gEmmrt(c47029tiN.KWHzl()), false, 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final Unit EZpvd(EopLivenessBasicViewModel eopLivenessBasicViewModel, LivenessRouterResp livenessRouterResp, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "type", eopLivenessBasicViewModel.QUSxYX, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        EventParamsList.put$default(eventParamsList, "result", "success", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, C33129mqd.gEmmrt(livenessRouterResp.getNeedProxy()), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EopLivenessBasicViewModel eopLivenessBasicViewModel, Exception exc, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "type", eopLivenessBasicViewModel.QUSxYX, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_MSG, C33129mqd.gEmmrt(exc.getMessage()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        EventParamsList.put$default(eventParamsList, "result", EopTrackEvent.KEY_RESULT_FAILED, false, 4, null);
        return Unit.INSTANCE;
    }

    public final String AwvSrB() {
        C6885aXn c6885aXnAEQbTJ;
        String json;
        InterfaceC6884aXm interfaceC6884aXmOLrzqt = C6887aXp.copydefault.OLrzqt();
        if (interfaceC6884aXmOLrzqt != null && (c6885aXnAEQbTJ = interfaceC6884aXmOLrzqt.AEQbTJ()) != null && (json = new Gson().toJson(rTL.OLrzqt.OLrzqt(new LivenessSessionInfoLcaEncryptionData(c6885aXnAEQbTJ.EZpvd())))) != null) {
            return json;
        }
        pUU.copydefault("kyc_in_house", "getObfuscatedLcaPubKey getKey fail, is null");
        C6777aVl.Companion.EZpvd(new LcaMissedKeyException("no public key"));
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getLivenessSessionInfo$default(EopLivenessBasicViewModel eopLivenessBasicViewModel, String str, LivenessConfig livenessConfig, String str2, Function0 function0, Function1 function1, Continuation continuation, int i, Object obj) {
        return eopLivenessBasicViewModel.EZpvd(str, (i & 2) != 0 ? null : livenessConfig, (i & 4) != 0 ? null : str2, function0, (i & 16) != 0 ? null : function1, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:19|(7:143|20|21|149|37|(2:42|43)(1:41)|148)|58|145|59|(2:61|(1:65))(2:66|(8:68|(1:70)(1:71)|72|(1:74)(1:75)|76|(2:87|(2:89|90)(2:91|(1:93)(1:94)))|95|96)(2:97|(2:99|(1:101)(3:102|103|(0)))(2:104|(4:106|(5:113|(1:115)(1:116)|(1:121)|122|123)|124|125))))|126|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03bc, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x041c, code lost:
    
        r0 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0420, code lost:
    
        if (r0 != null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0422, code lost:
    
        o.C55326xho.toastWithFailedIcon$default(r0, 0, 1, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0427, code lost:
    
        r4.OLrzqt(4, com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR, r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b2 A[Catch: Exception -> 0x0046, TRY_ENTER, TRY_LEAVE, TryCatch #6 {Exception -> 0x0046, blocks: (B:13:0x0041, B:128:0x03b2), top: B:153:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5 A[Catch: all -> 0x00f7, TRY_LEAVE, TryCatch #4 {all -> 0x00f7, blocks: (B:37:0x00aa, B:39:0x00b2, B:41:0x00b8, B:42:0x00c5), top: B:149:0x00aa }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0166 A[Catch: Exception -> 0x03bc, TryCatch #2 {Exception -> 0x03bc, blocks: (B:59:0x0129, B:61:0x0166, B:63:0x0177, B:65:0x017d, B:66:0x01b1, B:68:0x01bd, B:70:0x01c7, B:72:0x01cd, B:74:0x01d3, B:76:0x01d9, B:95:0x0252, B:80:0x01ec, B:84:0x01f5, B:87:0x01fc, B:89:0x0218, B:91:0x0232, B:93:0x0238, B:94:0x0241, B:97:0x027b, B:99:0x0287, B:104:0x02d2, B:106:0x02de, B:108:0x02e4, B:113:0x02f0, B:115:0x0312, B:118:0x031d, B:121:0x0324, B:122:0x0345, B:124:0x0372), top: B:145:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b1 A[Catch: Exception -> 0x03bc, TryCatch #2 {Exception -> 0x03bc, blocks: (B:59:0x0129, B:61:0x0166, B:63:0x0177, B:65:0x017d, B:66:0x01b1, B:68:0x01bd, B:70:0x01c7, B:72:0x01cd, B:74:0x01d3, B:76:0x01d9, B:95:0x0252, B:80:0x01ec, B:84:0x01f5, B:87:0x01fc, B:89:0x0218, B:91:0x0232, B:93:0x0238, B:94:0x0241, B:97:0x027b, B:99:0x0287, B:104:0x02d2, B:106:0x02de, B:108:0x02e4, B:113:0x02f0, B:115:0x0312, B:118:0x031d, B:121:0x0324, B:122:0x0345, B:124:0x0372), top: B:145:0x0129 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(String str, LivenessConfig livenessConfig, String str2, @NotNull Function0<Unit> function0, Function1<? super String, Unit> function1, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        EopLivenessBasicViewModel$getLivenessSessionInfo$1 eopLivenessBasicViewModel$getLivenessSessionInfo$1;
        final String str3;
        LivenessConfig livenessConfig2;
        final Function0<Unit> function02;
        Function1<? super String, Unit> function12;
        final EopLivenessBasicViewModel eopLivenessBasicViewModel;
        CoroutineDispatcher io2;
        EopLivenessBasicViewModel$getLivenessSessionInfo$livenessSessionResultResp$1$1 eopLivenessBasicViewModel$getLivenessSessionInfo$livenessSessionResultResp$1$1;
        AbstractC43419rot actionBar;
        EopLivenessBasicViewModel eopLivenessBasicViewModel2;
        Function0<Unit> function03;
        Function1<? super String, Unit> function13;
        EFRConfig efrConfig;
        ResponseData responseData;
        if (continuation instanceof EopLivenessBasicViewModel$getLivenessSessionInfo$1) {
            eopLivenessBasicViewModel$getLivenessSessionInfo$1 = (EopLivenessBasicViewModel$getLivenessSessionInfo$1) continuation;
            int i = eopLivenessBasicViewModel$getLivenessSessionInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eopLivenessBasicViewModel$getLivenessSessionInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                eopLivenessBasicViewModel$getLivenessSessionInfo$1 = new EopLivenessBasicViewModel$getLivenessSessionInfo$1(this, continuation);
            }
        }
        Object objWithContext = eopLivenessBasicViewModel$getLivenessSessionInfo$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = eopLivenessBasicViewModel$getLivenessSessionInfo$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            try {
                io2 = Dispatchers.getIO();
                eopLivenessBasicViewModel$getLivenessSessionInfo$livenessSessionResultResp$1$1 = new EopLivenessBasicViewModel$getLivenessSessionInfo$livenessSessionResultResp$1$1(this, str2, null);
                eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$0 = this;
                str3 = str;
            } catch (Throwable th) {
                th = th;
                str3 = str;
            }
            try {
                eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$1 = str3;
                livenessConfig2 = livenessConfig;
                try {
                    eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$2 = livenessConfig2;
                    function02 = function0;
                } catch (Throwable th2) {
                    th = th2;
                    function02 = function0;
                    function12 = function1;
                    eopLivenessBasicViewModel = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    LivenessConfig livenessConfig3 = livenessConfig2;
                    final LivenessSessionInfoResp livenessSessionInfoResp = (LivenessSessionInfoResp) actionBar.AEQbTJ();
                    C32868mlh c32868mlh = C32868mlh.OLrzqt;
                    TrackChannel[] trackChannelArrCopydefault = c32868mlh.copydefault();
                    C32866mlf.EZpvd("FaceLiveness_Get_Session_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return EopLivenessBasicViewModel.AYXKKw(str3, eopLivenessBasicViewModel, livenessSessionInfoResp, (EventParamsList) obj);
                        }
                    });
                    pUU.KWHzl("kyc_in_house", "getLivenessSessionInfo->mCheckType = " + eopLivenessBasicViewModel.QUSxYX);
                    if (Intrinsics.EZpvd((Object) str3, (Object) LivenessRouter.EFR.getVendorName())) {
                    }
                    eopLivenessBasicViewModel2 = eopLivenessBasicViewModel;
                    function03 = function02;
                    if (function12 != null) {
                    }
                    return Unit.INSTANCE;
                }
                try {
                    eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$3 = function02;
                    function12 = function1;
                } catch (Throwable th3) {
                    th = th3;
                    function12 = function1;
                    eopLivenessBasicViewModel = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    LivenessConfig livenessConfig32 = livenessConfig2;
                    final LivenessSessionInfoResp livenessSessionInfoResp2 = (LivenessSessionInfoResp) actionBar.AEQbTJ();
                    C32868mlh c32868mlh2 = C32868mlh.OLrzqt;
                    TrackChannel[] trackChannelArrCopydefault2 = c32868mlh2.copydefault();
                    C32866mlf.EZpvd("FaceLiveness_Get_Session_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return EopLivenessBasicViewModel.AYXKKw(str3, eopLivenessBasicViewModel, livenessSessionInfoResp2, (EventParamsList) obj);
                        }
                    });
                    pUU.KWHzl("kyc_in_house", "getLivenessSessionInfo->mCheckType = " + eopLivenessBasicViewModel.QUSxYX);
                    if (Intrinsics.EZpvd((Object) str3, (Object) LivenessRouter.EFR.getVendorName())) {
                    }
                    eopLivenessBasicViewModel2 = eopLivenessBasicViewModel;
                    function03 = function02;
                    if (function12 != null) {
                    }
                    return Unit.INSTANCE;
                }
                try {
                    eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$4 = function12;
                    eopLivenessBasicViewModel$getLivenessSessionInfo$1.label = 1;
                    objWithContext = BuildersKt.withContext(io2, eopLivenessBasicViewModel$getLivenessSessionInfo$livenessSessionResultResp$1$1, eopLivenessBasicViewModel$getLivenessSessionInfo$1);
                } catch (Throwable th4) {
                    th = th4;
                    eopLivenessBasicViewModel = this;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                    LivenessConfig livenessConfig322 = livenessConfig2;
                    final LivenessSessionInfoResp livenessSessionInfoResp22 = (LivenessSessionInfoResp) actionBar.AEQbTJ();
                    C32868mlh c32868mlh22 = C32868mlh.OLrzqt;
                    TrackChannel[] trackChannelArrCopydefault22 = c32868mlh22.copydefault();
                    C32866mlf.EZpvd("FaceLiveness_Get_Session_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault22, trackChannelArrCopydefault22.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRK
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return EopLivenessBasicViewModel.AYXKKw(str3, eopLivenessBasicViewModel, livenessSessionInfoResp22, (EventParamsList) obj);
                        }
                    });
                    pUU.KWHzl("kyc_in_house", "getLivenessSessionInfo->mCheckType = " + eopLivenessBasicViewModel.QUSxYX);
                    if (Intrinsics.EZpvd((Object) str3, (Object) LivenessRouter.EFR.getVendorName())) {
                    }
                    eopLivenessBasicViewModel2 = eopLivenessBasicViewModel;
                    function03 = function02;
                    if (function12 != null) {
                    }
                    return Unit.INSTANCE;
                }
            } catch (Throwable th5) {
                th = th5;
                livenessConfig2 = livenessConfig;
                function02 = function0;
                function12 = function1;
                eopLivenessBasicViewModel = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                LivenessConfig livenessConfig3222 = livenessConfig2;
                final LivenessSessionInfoResp livenessSessionInfoResp222 = (LivenessSessionInfoResp) actionBar.AEQbTJ();
                C32868mlh c32868mlh222 = C32868mlh.OLrzqt;
                TrackChannel[] trackChannelArrCopydefault222 = c32868mlh222.copydefault();
                C32866mlf.EZpvd("FaceLiveness_Get_Session_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault222, trackChannelArrCopydefault222.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return EopLivenessBasicViewModel.AYXKKw(str3, eopLivenessBasicViewModel, livenessSessionInfoResp222, (EventParamsList) obj);
                    }
                });
                pUU.KWHzl("kyc_in_house", "getLivenessSessionInfo->mCheckType = " + eopLivenessBasicViewModel.QUSxYX);
                if (Intrinsics.EZpvd((Object) str3, (Object) LivenessRouter.EFR.getVendorName())) {
                }
                eopLivenessBasicViewModel2 = eopLivenessBasicViewModel;
                function03 = function02;
                if (function12 != null) {
                }
                return Unit.INSTANCE;
            }
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
            eopLivenessBasicViewModel = this;
            responseData = (ResponseData) objWithContext;
            if (responseData.getCode() != 0) {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                LivenessConfig livenessConfig32222 = livenessConfig2;
                final LivenessSessionInfoResp livenessSessionInfoResp2222 = (LivenessSessionInfoResp) actionBar.AEQbTJ();
                C32868mlh c32868mlh2222 = C32868mlh.OLrzqt;
                TrackChannel[] trackChannelArrCopydefault2222 = c32868mlh2222.copydefault();
                C32866mlf.EZpvd("FaceLiveness_Get_Session_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2222, trackChannelArrCopydefault2222.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return EopLivenessBasicViewModel.AYXKKw(str3, eopLivenessBasicViewModel, livenessSessionInfoResp2222, (EventParamsList) obj);
                    }
                });
                pUU.KWHzl("kyc_in_house", "getLivenessSessionInfo->mCheckType = " + eopLivenessBasicViewModel.QUSxYX);
                if (Intrinsics.EZpvd((Object) str3, (Object) LivenessRouter.EFR.getVendorName())) {
                }
                eopLivenessBasicViewModel2 = eopLivenessBasicViewModel;
                function03 = function02;
                if (function12 != null) {
                }
            }
        } else if (i2 == 1) {
            Function1<? super String, Unit> function14 = (Function1) eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$4;
            Function0<Unit> function04 = (Function0) eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$3;
            livenessConfig2 = (LivenessConfig) eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$2;
            String str4 = (String) eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$1;
            EopLivenessBasicViewModel eopLivenessBasicViewModel3 = (EopLivenessBasicViewModel) eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                function12 = function14;
                eopLivenessBasicViewModel = eopLivenessBasicViewModel3;
                function02 = function04;
                str3 = str4;
                try {
                    responseData = (ResponseData) objWithContext;
                    if (responseData.getCode() != 0 && responseData.getData() != null) {
                        Object data = responseData.getData();
                        Intrinsics.copydefault(data);
                        actionBar = new AbstractC43419rot.StateListAnimator(data);
                    } else {
                        pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                        actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                    }
                } catch (Throwable th6) {
                    th = th6;
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                    actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                }
            } catch (Throwable th7) {
                th = th7;
                function12 = function14;
                eopLivenessBasicViewModel = eopLivenessBasicViewModel3;
                function02 = function04;
                str3 = str4;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
                LivenessConfig livenessConfig322222 = livenessConfig2;
                final LivenessSessionInfoResp livenessSessionInfoResp22222 = (LivenessSessionInfoResp) actionBar.AEQbTJ();
                C32868mlh c32868mlh22222 = C32868mlh.OLrzqt;
                TrackChannel[] trackChannelArrCopydefault22222 = c32868mlh22222.copydefault();
                C32866mlf.EZpvd("FaceLiveness_Get_Session_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault22222, trackChannelArrCopydefault22222.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRK
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return EopLivenessBasicViewModel.AYXKKw(str3, eopLivenessBasicViewModel, livenessSessionInfoResp22222, (EventParamsList) obj);
                    }
                });
                pUU.KWHzl("kyc_in_house", "getLivenessSessionInfo->mCheckType = " + eopLivenessBasicViewModel.QUSxYX);
                if (Intrinsics.EZpvd((Object) str3, (Object) LivenessRouter.EFR.getVendorName())) {
                }
                eopLivenessBasicViewModel2 = eopLivenessBasicViewModel;
                function03 = function02;
                if (function12 != null) {
                }
                return Unit.INSTANCE;
            }
            LivenessConfig livenessConfig3222222 = livenessConfig2;
            final LivenessSessionInfoResp livenessSessionInfoResp222222 = (LivenessSessionInfoResp) actionBar.AEQbTJ();
            C32868mlh c32868mlh222222 = C32868mlh.OLrzqt;
            TrackChannel[] trackChannelArrCopydefault222222 = c32868mlh222222.copydefault();
            C32866mlf.EZpvd("FaceLiveness_Get_Session_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault222222, trackChannelArrCopydefault222222.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return EopLivenessBasicViewModel.AYXKKw(str3, eopLivenessBasicViewModel, livenessSessionInfoResp222222, (EventParamsList) obj);
                }
            });
            pUU.KWHzl("kyc_in_house", "getLivenessSessionInfo->mCheckType = " + eopLivenessBasicViewModel.QUSxYX);
            if (Intrinsics.EZpvd((Object) str3, (Object) LivenessRouter.EFR.getVendorName())) {
                eopLivenessBasicViewModel.sSMYrx = livenessSessionInfoResp222222.getFaceSessionId();
                eopLivenessBasicViewModel.OLrzqt(OLrzqt);
                LivenessConfig livenessConfig4 = livenessSessionInfoResp222222.getLivenessConfig();
                if (livenessConfig4 != null && (efrConfig = livenessConfig4.getEfrConfig()) != null) {
                    eopLivenessBasicViewModel.copydefault(new EFRData(C33129mqd.gEmmrt(efrConfig.getEfrData()), C33129mqd.valueOf(efrConfig.getCode()), C33129mqd.gEmmrt(efrConfig.getValue()), C33129mqd.gEmmrt(efrConfig.getExpiry()), eopLivenessBasicViewModel.RJOkX, eopLivenessBasicViewModel.sSMYrx));
                }
            } else {
                if (Intrinsics.EZpvd((Object) str3, (Object) LivenessRouter.AWS.getVendorName())) {
                    final String faceSessionId = livenessSessionInfoResp222222.getFaceSessionId();
                    AwsConfigResp awsConfig = livenessSessionInfoResp222222.getAwsConfig();
                    String awsUserPoolsWebClientId = awsConfig != null ? awsConfig.getAwsUserPoolsWebClientId() : null;
                    AwsConfigResp awsConfig2 = livenessSessionInfoResp222222.getAwsConfig();
                    String awsCognitoRegion = awsConfig2 != null ? awsConfig2.getAwsCognitoRegion() : null;
                    C52481wN.EZpvd.KWHzl(eopLivenessBasicViewModel.new Activity());
                    if (faceSessionId.length() != 0 && awsUserPoolsWebClientId != null && awsUserPoolsWebClientId.length() != 0 && awsCognitoRegion != null && awsCognitoRegion.length() != 0) {
                        eopLivenessBasicViewModel.DbNXlk = awsCognitoRegion;
                        eopLivenessBasicViewModel.gEmmrt = awsUserPoolsWebClientId;
                        eopLivenessBasicViewModel.gHZMYf = livenessSessionInfoResp222222.getNeedProxy();
                        eopLivenessBasicViewModel.hDKMBd = livenessSessionInfoResp222222.getHttpProxyPath();
                        eopLivenessBasicViewModel.djSkpj = livenessSessionInfoResp222222.getWssProxyPath();
                        if (!eopLivenessBasicViewModel.OLrzqt(awsUserPoolsWebClientId, awsCognitoRegion)) {
                            pUU.KWHzl("kyc_in_house", "initSuccess failed");
                            toastError$default(eopLivenessBasicViewModel, 2, str3, null, 4, null);
                            function02.invoke();
                            return Unit.INSTANCE;
                        }
                        if (livenessSessionInfoResp222222.getNeedProxy()) {
                            eopLivenessBasicViewModel.sSMYrx = faceSessionId;
                            eopLivenessBasicViewModel.OLrzqt(AEQbTJ);
                        } else {
                            Amplify.Auth.fetchAuthSession(new Consumer() { // from class: o.pRM
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // com.amplifyframework.core.Consumer
                                public final void accept(java.lang.Object obj) {
                                    EopLivenessBasicViewModel.copydefault(this.copydefault, faceSessionId, (AuthSession) obj);
                                }
                            }, new Consumer() { // from class: o.pRP
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // com.amplifyframework.core.Consumer
                                public final void accept(java.lang.Object obj) {
                                    EopLivenessBasicViewModel.copydefault(this.AEQbTJ, str3, function02, (AuthException) obj);
                                }
                            });
                        }
                    }
                    pUU.KWHzl("kyc_in_house", "getLivenessSessionInfo param aws invalid " + livenessSessionInfoResp222222);
                    toastError$default(eopLivenessBasicViewModel, 1, str3, null, 4, null);
                    function02.invoke();
                    return Unit.INSTANCE;
                }
                if (Intrinsics.EZpvd((Object) str3, (Object) LivenessRouter.ALI.getVendorName())) {
                    String faceSessionId2 = livenessSessionInfoResp222222.getFaceSessionId();
                    eopLivenessBasicViewModel.sSMYrx = faceSessionId2;
                    eopLivenessBasicViewModel.OLrzqt(EZpvd);
                    TrackChannel[] trackChannelArrCopydefault3 = c32868mlh222222.copydefault();
                    C32866mlf.EZpvd("FaceLiveness_Router_AliCloud_Start", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRU
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return EopLivenessBasicViewModel.gEmmrt(this.OLrzqt, (EventParamsList) obj);
                        }
                    });
                    pUU.KWHzl("kyc_in_house", "getLivenessSessionInfo->startAlifaceGlobal");
                    InterfaceC42440rSy interfaceC42440rSy = (InterfaceC42440rSy) C43251rlk.copydefault(InterfaceC42440rSy.class);
                    StateListAnimator stateListAnimator = eopLivenessBasicViewModel.new StateListAnimator(function02);
                    eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$0 = eopLivenessBasicViewModel;
                    eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$1 = function02;
                    eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$2 = function12;
                    eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$3 = null;
                    eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$4 = null;
                    eopLivenessBasicViewModel$getLivenessSessionInfo$1.label = 2;
                    if (interfaceC42440rSy.OLrzqt(faceSessionId2, stateListAnimator, eopLivenessBasicViewModel$getLivenessSessionInfo$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    eopLivenessBasicViewModel2 = eopLivenessBasicViewModel;
                    function03 = function02;
                    function13 = function12;
                    function12 = function13;
                    if (function12 != null) {
                    }
                } else if (Intrinsics.EZpvd((Object) str3, (Object) LivenessRouter.LCA.getVendorName())) {
                    String encryptionData = livenessSessionInfoResp222222.getEncryptionData();
                    if (encryptionData != null && encryptionData.length() != 0 && livenessConfig3222222 != null) {
                        rTL rtl = rTL.OLrzqt;
                        Object objFromJson = new Gson().fromJson(livenessSessionInfoResp222222.getEncryptionData(), (Class<Object>) LcaObfuscateData.class);
                        Intrinsics.checkNotNullExpressionValue(objFromJson, "");
                        LcaJwstWsSessionIdOriginalData lcaJwstWsSessionIdOriginalData = (LcaJwstWsSessionIdOriginalData) rtl.EZpvd((LcaObfuscateData) objFromJson, LcaJwstWsSessionIdOriginalData.class);
                        String wsSessionId = lcaJwstWsSessionIdOriginalData != null ? lcaJwstWsSessionIdOriginalData.getWsSessionId() : null;
                        if (wsSessionId != null && wsSessionId.length() != 0) {
                            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(eopLivenessBasicViewModel), Dispatchers.getMain(), null, new EopLivenessBasicViewModel$getLivenessSessionInfo$11(eopLivenessBasicViewModel, wsSessionId, livenessSessionInfoResp222222, livenessConfig3222222, null), 2, null);
                        }
                        TrackChannel[] trackChannelArrCopydefault4 = c32868mlh222222.copydefault();
                        C32866mlf.EZpvd("FaceLiveness_Get_Session_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault4, trackChannelArrCopydefault4.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRR
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return EopLivenessBasicViewModel.EZpvd(str3, eopLivenessBasicViewModel, livenessSessionInfoResp222222, (EventParamsList) obj);
                            }
                        });
                        pUU.KWHzl("kyc_in_house", "getLivenessSessionInfo param lcaSessionId is null or empty");
                        toastError$default(eopLivenessBasicViewModel, 1, str3, null, 4, null);
                        function02.invoke();
                        return Unit.INSTANCE;
                    }
                    TrackChannel[] trackChannelArrCopydefault5 = c32868mlh222222.copydefault();
                    C32866mlf.EZpvd("FaceLiveness_Get_Session_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault5, trackChannelArrCopydefault5.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRQ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return EopLivenessBasicViewModel.copydefault(str3, eopLivenessBasicViewModel, livenessSessionInfoResp222222, (EventParamsList) obj);
                        }
                    });
                    pUU.KWHzl("kyc_in_house", "getLivenessSessionInfo param lca invalid " + livenessSessionInfoResp222222);
                    toastError$default(eopLivenessBasicViewModel, 1, str3, null, 4, null);
                    function02.invoke();
                    return Unit.INSTANCE;
                }
            }
            eopLivenessBasicViewModel2 = eopLivenessBasicViewModel;
            function03 = function02;
            if (function12 != null) {
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function13 = (Function1) eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$2;
            function03 = (Function0) eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$1;
            eopLivenessBasicViewModel2 = (EopLivenessBasicViewModel) eopLivenessBasicViewModel$getLivenessSessionInfo$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                function12 = function13;
                if (function12 != null) {
                    function12.invoke(eopLivenessBasicViewModel2.QUSxYX);
                }
            } catch (Exception e) {
                e = e;
                function02 = function03;
                eopLivenessBasicViewModel = eopLivenessBasicViewModel2;
                eopLivenessBasicViewModel.AhwBna.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
                pUU.KWHzl("kyc_in_house", "getLivenessSessionInfo error = " + e.getMessage() + ",vendorType = " + eopLivenessBasicViewModel.QUSxYX);
                C32868mlh c32868mlh3 = C32868mlh.OLrzqt;
                TrackChannel[] trackChannelArrCopydefault6 = c32868mlh3.copydefault();
                C32866mlf.EZpvd("Selfie_Get_Session_Error", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault6, trackChannelArrCopydefault6.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return EopLivenessBasicViewModel.copydefault(e, eopLivenessBasicViewModel, (EventParamsList) obj);
                    }
                });
                TrackChannel[] trackChannelArrCopydefault7 = c32868mlh3.copydefault();
                C32866mlf.EZpvd("FaceLiveness_Get_Session_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault7, trackChannelArrCopydefault7.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return EopLivenessBasicViewModel.OLrzqt(this.OLrzqt, e, (EventParamsList) obj);
                    }
                });
                if (!(e instanceof OKServerException)) {
                }
                function02.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(String str, EopLivenessBasicViewModel eopLivenessBasicViewModel, LivenessSessionInfoResp livenessSessionInfoResp, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "type", C33129mqd.gEmmrt(str), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        EventParamsList.put$default(eventParamsList, "result", "success", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, C33129mqd.gEmmrt(Boolean.valueOf(livenessSessionInfoResp.getNeedProxy())), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final class Activity implements InterfaceC5079Dx {
        public Activity() {
        }

        @Override // o.InterfaceC5079Dx
        public void OLrzqt(final String str) {
            Intrinsics.checkNotNullParameter(str, "");
            pUU.KWHzl("kyc_in_house", "aws onNetError msg = " + str);
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            TrackChannel[] trackChannelArr = (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length);
            final EopLivenessBasicViewModel eopLivenessBasicViewModel = EopLivenessBasicViewModel.this;
            C32866mlf.EZpvd("AWSCaptureSelfie_Net_Failed", trackChannelArr, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return EopLivenessBasicViewModel.Activity.AEQbTJ(str, eopLivenessBasicViewModel, (EventParamsList) obj);
                }
            });
        }

        public static final Unit AEQbTJ(String str, EopLivenessBasicViewModel eopLivenessBasicViewModel, EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "msg", str, false, 4, null);
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.isConnected(), false, 4, null);
            EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
            EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.ORxRYg(), false, 4, null);
            return Unit.INSTANCE;
        }
    }

    public static final void copydefault(EopLivenessBasicViewModel eopLivenessBasicViewModel, String str, AuthSession authSession) {
        Intrinsics.checkNotNullParameter(authSession, "");
        pUU.KWHzl("kyc_in_house", "fetchAuthSession success");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(eopLivenessBasicViewModel), Dispatchers.getMain(), null, new EopLivenessBasicViewModel$getLivenessSessionInfo$5$1(eopLivenessBasicViewModel, str, null), 2, null);
    }

    public static final void copydefault(final EopLivenessBasicViewModel eopLivenessBasicViewModel, String str, Function0 function0, final AuthException authException) {
        Intrinsics.checkNotNullParameter(authException, "");
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("AWSCaptureSelfie_Get_AWS_Auth_Failed", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return EopLivenessBasicViewModel.EZpvd(authException, eopLivenessBasicViewModel, (EventParamsList) obj);
            }
        });
        pUU.KWHzl("kyc_in_house", "AWSCaptureSelfie_Get_AWS_Auth_Failed " + authException);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(eopLivenessBasicViewModel), Dispatchers.getMain(), null, new EopLivenessBasicViewModel$getLivenessSessionInfo$6$2(eopLivenessBasicViewModel, str, function0, null), 2, null);
    }

    public static final Unit EZpvd(AuthException authException, EopLivenessBasicViewModel eopLivenessBasicViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "msg", String.valueOf(authException), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(EopLivenessBasicViewModel eopLivenessBasicViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator implements pHD {
        public final /* synthetic */ Function0<Unit> copydefault;

        public StateListAnimator(Function0<Unit> function0) {
            this.copydefault = function0;
        }
    }

    public static final Unit copydefault(String str, EopLivenessBasicViewModel eopLivenessBasicViewModel, LivenessSessionInfoResp livenessSessionInfoResp, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "type", C33129mqd.gEmmrt(str), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        EventParamsList.put$default(eventParamsList, "result", EopTrackEvent.KEY_RESULT_FAILED, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, C33129mqd.gEmmrt(Boolean.valueOf(livenessSessionInfoResp.getNeedProxy())), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_MSG, "Liveness config or encryptionData from getSession is null", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(String str, EopLivenessBasicViewModel eopLivenessBasicViewModel, LivenessSessionInfoResp livenessSessionInfoResp, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "type", C33129mqd.gEmmrt(str), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        EventParamsList.put$default(eventParamsList, "result", EopTrackEvent.KEY_RESULT_FAILED, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, C33129mqd.gEmmrt(Boolean.valueOf(livenessSessionInfoResp.getNeedProxy())), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_MSG, "wsSessionId is null from obfuscated data", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Exception exc, EopLivenessBasicViewModel eopLivenessBasicViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_MSG_HUMP, String.valueOf(exc.getMessage()), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(EopLivenessBasicViewModel eopLivenessBasicViewModel, Exception exc, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "type", eopLivenessBasicViewModel.QUSxYX, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_MSG, C33129mqd.gEmmrt(exc.getMessage()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        EventParamsList.put$default(eventParamsList, "result", EopTrackEvent.KEY_RESULT_FAILED, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        this.AhwBna.setValue(new C43734ruq<>(Boolean.FALSE));
        this.valueOf.setValue(new C43734ruq<>(Boolean.TRUE));
    }

    public final void djBIcL() {
        this.AhwBna.setValue(new C43734ruq<>(Boolean.FALSE));
    }

    public final Object OLrzqt(String str, String str2, String str3, String str4, @NotNull Continuation<? super Unit> continuation) {
        this.AhwBna.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
        this.values = str;
        this.fARcdN = str3;
        this.fIwbmz = str2;
        this.ejfBZ = str4;
        Object livenessSessionResult$default = getLivenessSessionResult$default(this, null, null, continuation, 3, null);
        return livenessSessionResult$default == C56442yFn.copydefault() ? livenessSessionResult$default : Unit.INSTANCE;
    }

    public final Object AEQbTJ(String str, @NotNull Continuation<? super Unit> continuation) {
        this.AhwBna.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
        this.ejfBZ = str;
        Object livenessSessionResult$default = getLivenessSessionResult$default(this, null, null, continuation, 3, null);
        return livenessSessionResult$default == C56442yFn.copydefault() ? livenessSessionResult$default : Unit.INSTANCE;
    }

    public final void OLrzqt() {
        this.AhwBna.setValue(new C43734ruq<>(Boolean.FALSE));
        this.sSMYrx = "";
    }

    public final Object KWHzl(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        this.AhwBna.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(KycSdkEventConst.FaceLiveness_Router_LcaResult_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return EopLivenessBasicViewModel.isConnected(this.KWHzl, (EventParamsList) obj);
            }
        });
        Object livenessSessionResult$default = getLivenessSessionResult$default(this, null, str, continuation, 1, null);
        return livenessSessionResult$default == C56442yFn.copydefault() ? livenessSessionResult$default : Unit.INSTANCE;
    }

    public static final Unit isConnected(EopLivenessBasicViewModel eopLivenessBasicViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        EventParamsList.put$default(eventParamsList, "status", "success", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, eopLivenessBasicViewModel.AubY, false, 4, null);
        return Unit.INSTANCE;
    }

    public final Object copydefault(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object livenessSessionResult$default = getLivenessSessionResult$default(this, null, str, continuation, 1, null);
        return livenessSessionResult$default == C56442yFn.copydefault() ? livenessSessionResult$default : Unit.INSTANCE;
    }

    public final void RcXXUw() {
        pRV<C43734ruq<Boolean>> prv = this.AhwBna;
        Boolean bool = Boolean.FALSE;
        prv.setValue(new C43734ruq<>(bool));
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd(KycSdkEventConst.FaceLiveness_Router_LcaResult_View, (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return EopLivenessBasicViewModel.AkhnZx(this.KWHzl, (EventParamsList) obj);
            }
        });
        this.sSMYrx = "";
        this.AubY = "";
        this.zLjUOn = null;
        this.AhwBna.setValue(new C43734ruq<>(bool));
        this.valueOf.setValue(new C43734ruq<>(bool));
    }

    public static final Unit AkhnZx(EopLivenessBasicViewModel eopLivenessBasicViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        EventParamsList.put$default(eventParamsList, "status", OtpEventTracker.OTP_EVENT_VALUE_CANCEL, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_LCA_SESSION_INFO, eopLivenessBasicViewModel.AubY, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void djSkpj() {
        pRV<C43734ruq<Boolean>> prv = this.AhwBna;
        Boolean bool = Boolean.FALSE;
        prv.setValue(new C43734ruq<>(bool));
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("FaceLiveness_Router_LcaResult_FD", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return EopLivenessBasicViewModel.DbNXlk(this.copydefault, (EventParamsList) obj);
            }
        });
        this.sSMYrx = "";
        this.AubY = "";
        this.zLjUOn = null;
        this.AhwBna.setValue(new C43734ruq<>(bool));
        this.valueOf.setValue(new C43734ruq<>(bool));
    }

    public static final Unit DbNXlk(EopLivenessBasicViewModel eopLivenessBasicViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        EventParamsList.put$default(eventParamsList, "status", "fd_load_error", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void UeEOUB() {
        this.AhwBna.setValue(new C43734ruq<>(Boolean.FALSE));
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("FaceLiveness_Router_LcaResult_FD", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return EopLivenessBasicViewModel.fetchVPNInfo(this.KWHzl, (EventParamsList) obj);
            }
        });
    }

    public static final Unit fetchVPNInfo(EopLivenessBasicViewModel eopLivenessBasicViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        EventParamsList.put$default(eventParamsList, "status", "fd_load_success", false, 4, null);
        return Unit.INSTANCE;
    }

    public final boolean OLrzqt(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C38274pSs.KWHzl.KWHzl(str, str2, this.fetchVPNInfo, OcIXYQ(), this.QVAiDq);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.okinc.liveness.eop.viewmodel.EopLivenessBasicViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getLivenessSessionResult$default(EopLivenessBasicViewModel eopLivenessBasicViewModel, Function0 function0, String str, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return eopLivenessBasicViewModel.KWHzl((Function0<Unit>) function0, str, (Continuation<? super Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00da A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:12:0x003c, B:29:0x00bf, B:31:0x00c7, B:33:0x00cd, B:34:0x00da), top: B:126:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KWHzl(Function0<Unit> function0, String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        EopLivenessBasicViewModel$getLivenessSessionResult$1 eopLivenessBasicViewModel$getLivenessSessionResult$1;
        final EopLivenessBasicViewModel eopLivenessBasicViewModel;
        AbstractC43419rot actionBar;
        ResponseData responseData;
        Function0<Unit> function02 = function0;
        if (continuation instanceof EopLivenessBasicViewModel$getLivenessSessionResult$1) {
            eopLivenessBasicViewModel$getLivenessSessionResult$1 = (EopLivenessBasicViewModel$getLivenessSessionResult$1) continuation;
            int i = eopLivenessBasicViewModel$getLivenessSessionResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eopLivenessBasicViewModel$getLivenessSessionResult$1.label = i - Integer.MIN_VALUE;
            } else {
                eopLivenessBasicViewModel$getLivenessSessionResult$1 = new EopLivenessBasicViewModel$getLivenessSessionResult$1(this, continuation);
            }
        }
        Object objWithContext = eopLivenessBasicViewModel$getLivenessSessionResult$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = eopLivenessBasicViewModel$getLivenessSessionResult$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            if (aKErDB()) {
                String str2 = "get session result " + this.QUSxYX + " param is empty";
                pUU.valueOf("kyc_in_house", str2);
                this.QKVWgx = "LOCAL_PARAM_ERROR";
                KWHzl(str2, function02);
                return Unit.INSTANCE;
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            if (Intrinsics.EZpvd((Object) this.QUSxYX, (Object) LivenessRouter.EFR.getVendorName())) {
                objectRef.element = new Gson().toJson(new EFRResultReq(this.values, this.fARcdN, this.fIwbmz, this.ejfBZ));
            }
            try {
                CoroutineDispatcher io2 = Dispatchers.getIO();
                EopLivenessBasicViewModel$getLivenessSessionResult$livenessSessionResultResp$1$1 eopLivenessBasicViewModel$getLivenessSessionResult$livenessSessionResultResp$1$1 = new EopLivenessBasicViewModel$getLivenessSessionResult$livenessSessionResultResp$1$1(this, str, objectRef, null);
                eopLivenessBasicViewModel$getLivenessSessionResult$1.L$0 = this;
                eopLivenessBasicViewModel$getLivenessSessionResult$1.L$1 = function02;
                eopLivenessBasicViewModel$getLivenessSessionResult$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, eopLivenessBasicViewModel$getLivenessSessionResult$livenessSessionResultResp$1$1, eopLivenessBasicViewModel$getLivenessSessionResult$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                eopLivenessBasicViewModel = this;
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0) {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (Throwable th) {
                th = th;
                eopLivenessBasicViewModel = this;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            function02 = (Function0) eopLivenessBasicViewModel$getLivenessSessionResult$1.L$1;
            eopLivenessBasicViewModel = (EopLivenessBasicViewModel) eopLivenessBasicViewModel$getLivenessSessionResult$1.L$0;
            try {
                C56391yDq.AEQbTJ(objWithContext);
                responseData = (ResponseData) objWithContext;
                if (responseData.getCode() != 0 && responseData.getData() != null) {
                    Object data = responseData.getData();
                    Intrinsics.copydefault(data);
                    actionBar = new AbstractC43419rot.StateListAnimator(data);
                } else {
                    pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                    actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
                }
            } catch (Throwable th2) {
                th = th2;
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
                actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
            }
        }
        eopLivenessBasicViewModel.sSMYrx = "";
        try {
            final AwsSessionResultResp awsSessionResultResp = (AwsSessionResultResp) actionBar.AEQbTJ();
            C32868mlh c32868mlh = C32868mlh.OLrzqt;
            TrackChannel[] trackChannelArrCopydefault = c32868mlh.copydefault();
            C32866mlf.EZpvd("FaceLiveness_Finish_Get_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return EopLivenessBasicViewModel.OLrzqt(this.EZpvd, awsSessionResultResp, (EventParamsList) obj);
                }
            });
            String status = awsSessionResultResp.getStatus();
            eopLivenessBasicViewModel.QKVWgx = status;
            pUU.KWHzl("kyc_in_house", "getLivenessSessionResult resultFailType = " + status + ",mCheckType = " + eopLivenessBasicViewModel.QUSxYX);
            String status2 = awsSessionResultResp.getStatus();
            int iHashCode = status2.hashCode();
            if (iHashCode != -562638271) {
                if (iHashCode != 35394935) {
                    if (iHashCode == 2066319421 && status2.equals(CardSyncResponse.FAILED)) {
                        eopLivenessBasicViewModel.DTwDnp = awsSessionResultResp.getReferenceImage();
                        eopLivenessBasicViewModel.AwvSrB = awsSessionResultResp.getNoteTitle();
                        eopLivenessBasicViewModel.AxsJAY = awsSessionResultResp.getNotes();
                        eopLivenessBasicViewModel.AkhnZx = awsSessionResultResp.getCheckMsg();
                        if (function02 == null) {
                            String str3 = eopLivenessBasicViewModel.QUSxYX;
                            if (Intrinsics.EZpvd((Object) str3, (Object) LivenessRouter.ALI.getVendorName()) || Intrinsics.EZpvd((Object) str3, (Object) LivenessRouter.EFR.getVendorName()) || Intrinsics.EZpvd((Object) str3, (Object) LivenessRouter.LCA.getVendorName())) {
                                eopLivenessBasicViewModel.valueOf.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
                                if (eopLivenessBasicViewModel.AkhnZx() != EopPageNode.FaceResult) {
                                    eopLivenessBasicViewModel.dNCPSb();
                                    eopLivenessBasicViewModel.djBIcL("RESULT_FAILED");
                                } else {
                                    eopLivenessBasicViewModel.EZpvd(true);
                                }
                            } else if (Intrinsics.EZpvd((Object) str3, (Object) LivenessRouter.AWS.getVendorName())) {
                                eopLivenessBasicViewModel.djBIcL("RESULT_FAILED");
                            }
                        } else {
                            function02.invoke();
                        }
                    }
                } else if (status2.equals(CardSyncResponse.PENDING)) {
                    if (function02 == null) {
                        String str4 = eopLivenessBasicViewModel.QUSxYX;
                        if (Intrinsics.EZpvd((Object) str4, (Object) LivenessRouter.ALI.getVendorName()) || Intrinsics.EZpvd((Object) str4, (Object) LivenessRouter.EFR.getVendorName()) || Intrinsics.EZpvd((Object) str4, (Object) LivenessRouter.LCA.getVendorName())) {
                            eopLivenessBasicViewModel.valueOf.setValue(new C43734ruq<>(C56443yFo.KWHzl(false)));
                            if (eopLivenessBasicViewModel.AkhnZx() != EopPageNode.FaceResult) {
                                eopLivenessBasicViewModel.dNCPSb();
                                eopLivenessBasicViewModel.djBIcL("RESULT_PENDING");
                            } else {
                                eopLivenessBasicViewModel.EZpvd(true);
                            }
                        } else if (Intrinsics.EZpvd((Object) str4, (Object) LivenessRouter.AWS.getVendorName())) {
                            eopLivenessBasicViewModel.djBIcL("RESULT_PENDING");
                        }
                    } else {
                        function02.invoke();
                    }
                }
            } else if (status2.equals(CardSyncResponse.SUCCEEDED)) {
                String str5 = eopLivenessBasicViewModel.QUSxYX;
                if (Intrinsics.EZpvd((Object) str5, (Object) LivenessRouter.AWS.getVendorName())) {
                    if (eopLivenessBasicViewModel.AuCTelauCTel) {
                        eopLivenessBasicViewModel.AEQbTJ("FACIAL_VERIFICATION_RESULT_SUCCESS");
                    } else {
                        eopLivenessBasicViewModel.dNCPSb();
                        eopLivenessBasicViewModel.djBIcL("RESULT_SUCCESS");
                    }
                    TrackChannel[] trackChannelArrCopydefault2 = c32868mlh.copydefault();
                    C32866mlf.EZpvd("AWSCaptureSelfie_Get_Session_Success", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault2, trackChannelArrCopydefault2.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRH
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return EopLivenessBasicViewModel.AYXKKw(this.OLrzqt, (EventParamsList) obj);
                        }
                    });
                    TrackChannel[] trackChannelArrCopydefault3 = c32868mlh.copydefault();
                    C32866mlf.EZpvd("AWSCaptureSelfie_Get_Result_Success", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault3, trackChannelArrCopydefault3.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRG
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return EopLivenessBasicViewModel.AhwBna(this.AEQbTJ, (EventParamsList) obj);
                        }
                    });
                } else if (Intrinsics.EZpvd((Object) str5, (Object) LivenessRouter.ALI.getVendorName()) || Intrinsics.EZpvd((Object) str5, (Object) LivenessRouter.EFR.getVendorName()) || Intrinsics.EZpvd((Object) str5, (Object) LivenessRouter.LCA.getVendorName())) {
                    if (eopLivenessBasicViewModel.AuCTelauCTel) {
                        eopLivenessBasicViewModel.AEQbTJ("FACIAL_VERIFICATION_RESULT_SUCCESS");
                    } else if (eopLivenessBasicViewModel.AkhnZx() != EopPageNode.FaceResult) {
                        eopLivenessBasicViewModel.dNCPSb();
                        eopLivenessBasicViewModel.dNCPSb();
                        eopLivenessBasicViewModel.djBIcL("RESULT_SUCCESS");
                    } else {
                        eopLivenessBasicViewModel.djBIcL("RESULT_SUCCESS");
                    }
                }
            }
        } catch (Exception e) {
            if (e instanceof OKServerException) {
                Throwable origin = ((OKServerException) e).getOrigin();
                if (Intrinsics.EZpvd((Object) (origin != null ? origin.getClass().getSimpleName() : null), (Object) "JobCancellationException")) {
                    pUU.KWHzl("kyc_in_house", "getLivenessSessionResult canceled");
                    return Unit.INSTANCE;
                }
            }
            pUU.KWHzl("kyc_in_house", "getLivenessSessionResult exception=" + e.getMessage() + ",mCheckType = " + eopLivenessBasicViewModel.QUSxYX);
            eopLivenessBasicViewModel.QKVWgx = "LOCAL_NET_ERROR";
            eopLivenessBasicViewModel.KWHzl(C33129mqd.gEmmrt(e.getMessage()), function02);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(EopLivenessBasicViewModel eopLivenessBasicViewModel, AwsSessionResultResp awsSessionResultResp, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "type", eopLivenessBasicViewModel.QUSxYX, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        EventParamsList.put$default(eventParamsList, "status", awsSessionResultResp.getStatus(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "result", "success", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(EopLivenessBasicViewModel eopLivenessBasicViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, eopLivenessBasicViewModel.gHZMYf ? "true" : "false", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(EopLivenessBasicViewModel eopLivenessBasicViewModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.PROXY_MODE, eopLivenessBasicViewModel.gHZMYf ? "true" : "false", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final String str, Function0<Unit> function0) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("FaceLiveness_Finish_Get_Result", (TrackChannel[]) Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.pRI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return EopLivenessBasicViewModel.EZpvd(this.KWHzl, str, (EventParamsList) obj);
            }
        });
        if (function0 == null) {
            String str2 = this.QUSxYX;
            if (Intrinsics.EZpvd((Object) str2, (Object) LivenessRouter.ALI.getVendorName()) || Intrinsics.EZpvd((Object) str2, (Object) LivenessRouter.EFR.getVendorName()) || Intrinsics.EZpvd((Object) str2, (Object) LivenessRouter.LCA.getVendorName())) {
                this.valueOf.setValue(new C43734ruq<>(Boolean.FALSE));
                if (AkhnZx() != EopPageNode.FaceResult) {
                    dNCPSb();
                    djBIcL("RESULT_EXCEPTION");
                    return;
                } else {
                    EZpvd(true);
                    return;
                }
            }
            if (Intrinsics.EZpvd((Object) str2, (Object) LivenessRouter.AWS.getVendorName())) {
                djBIcL("RESULT_EXCEPTION");
                return;
            }
            return;
        }
        function0.invoke();
    }

    public static final Unit EZpvd(EopLivenessBasicViewModel eopLivenessBasicViewModel, String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "type", eopLivenessBasicViewModel.QUSxYX, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_COR, eopLivenessBasicViewModel.fetchVPNInfo, false, 4, null);
        EventParamsList.put$default(eventParamsList, "flow_source", eopLivenessBasicViewModel.OcIXYQ(), false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_SOURCE_CODE, eopLivenessBasicViewModel.QVAiDq, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_ERROR_MSG, str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "result", EopTrackEvent.KEY_RESULT_FAILED, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        EopLivenessBasicViewModel$reportLivenessSessionResult$1 eopLivenessBasicViewModel$reportLivenessSessionResult$1;
        AbstractC43419rot actionBar;
        if (continuation instanceof EopLivenessBasicViewModel$reportLivenessSessionResult$1) {
            eopLivenessBasicViewModel$reportLivenessSessionResult$1 = (EopLivenessBasicViewModel$reportLivenessSessionResult$1) continuation;
            int i = eopLivenessBasicViewModel$reportLivenessSessionResult$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eopLivenessBasicViewModel$reportLivenessSessionResult$1.label = i - Integer.MIN_VALUE;
            } else {
                eopLivenessBasicViewModel$reportLivenessSessionResult$1 = new EopLivenessBasicViewModel$reportLivenessSessionResult$1(this, continuation);
            }
        }
        Object objWithContext = eopLivenessBasicViewModel$reportLivenessSessionResult$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = eopLivenessBasicViewModel$reportLivenessSessionResult$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objWithContext);
                if (aKErDB()) {
                    pUU.valueOf("kyc_in_house", "report get result " + this.QUSxYX + " param is empty");
                    return Unit.INSTANCE;
                }
                CoroutineDispatcher io2 = Dispatchers.getIO();
                EopLivenessBasicViewModel$reportLivenessSessionResult$livenessSessionResultResp$1$1 eopLivenessBasicViewModel$reportLivenessSessionResult$livenessSessionResultResp$1$1 = new EopLivenessBasicViewModel$reportLivenessSessionResult$livenessSessionResultResp$1$1(this, str, null);
                eopLivenessBasicViewModel$reportLivenessSessionResult$1.label = 1;
                objWithContext = BuildersKt.withContext(io2, eopLivenessBasicViewModel$reportLivenessSessionResult$livenessSessionResultResp$1$1, eopLivenessBasicViewModel$reportLivenessSessionResult$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objWithContext);
            }
            ResponseData responseData = (ResponseData) objWithContext;
            if (responseData.getCode() == 0 && responseData.getData() != null) {
                Object data = responseData.getData();
                Intrinsics.copydefault(data);
                actionBar = new AbstractC43419rot.StateListAnimator(data);
            } else {
                pUU.copydefault(AbstractC43419rot.TAG, "Error: " + responseData);
                actionBar = new AbstractC43419rot.ActionBar(new OKServerException(responseData.getCode(), C43422row.AEQbTJ((ResponseData<?>) responseData), C43401rob.EZpvd(responseData), null, 8, null));
            }
        } catch (Throwable th) {
            pUU.copydefault(AbstractC43419rot.TAG, "Error: " + th);
            actionBar = new AbstractC43419rot.ActionBar(C43422row.OLrzqt(th));
        }
        try {
            actionBar.AEQbTJ();
            pUU.KWHzl("kyc_in_house", "report getLivenessSessionResult success");
        } catch (Exception e) {
            pUU.KWHzl("kyc_in_house", "report getLivenessSessionResult exception=" + e);
        }
        return Unit.INSTANCE;
    }

    public final boolean aKErDB() {
        String str = this.QUSxYX;
        LivenessRouter livenessRouter = LivenessRouter.LCA;
        return (!Intrinsics.EZpvd((Object) str, (Object) livenessRouter.getVendorName()) && this.sSMYrx.length() == 0) || (Intrinsics.EZpvd((Object) this.QUSxYX, (Object) livenessRouter.getVendorName()) && this.AubY.length() == 0);
    }

    public final boolean QfsBiF() {
        return AkhnZx() == EopPageNode.FaceResult && QVAiDq();
    }

    public final String AubY() {
        String str = this.QKVWgx;
        return Intrinsics.EZpvd((Object) str, (Object) CardSyncResponse.PENDING) ? "pending" : Intrinsics.EZpvd((Object) str, (Object) CardSyncResponse.FAILED) ? EopTrackEvent.KEY_RESULT_FAILED : "exception";
    }

    public final void getNewProxyInstance() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EopLivenessBasicViewModel$getLivenessExperimentData$1(this, null), 3, null);
    }

    public final void KWHzl(String str) {
        C38208pQf.TaskDescription taskDescription = C38208pQf.TaskDescription.copydefault;
        if (Intrinsics.EZpvd((Object) str, (Object) taskDescription.KWHzl())) {
            this.AYXKKw.setValue(new C43734ruq<>(Boolean.FALSE));
            return;
        }
        if (Intrinsics.EZpvd((Object) str, (Object) taskDescription.AEQbTJ())) {
            this.AYXKKw.setValue(new C43734ruq<>(Boolean.TRUE));
        } else if (Intrinsics.EZpvd((Object) str, (Object) C38208pQf.AEQbTJ.KWHzl())) {
            this.AYXKKw.setValue(new C43734ruq<>(Boolean.FALSE));
        } else {
            this.AYXKKw.setValue(new C43734ruq<>(Boolean.FALSE));
        }
    }
}
