package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.amplifyframework.core.model.ModelIdentifier;
import com.just.agentweb.DefaultWebClient;
import com.okinc.components.track.ABTestManager;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.network.okg.cache.CacheStrategy;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.planet.biz_content.draft.DraftDataInfo;
import com.okinc.planet.biz_content.input.ContentValidationType;
import com.okinc.planet.biz_content.input.GenericInputParentViewModel;
import com.okinc.planet.biz_content.input.data.InputDraft;
import com.okinc.planet.biz_content.input.data.InputHyperlinkType;
import com.okinc.planet.biz_content.input.data.InputPageState;
import com.okinc.planet.biz_content.input.data.NetDraftContent;
import com.okinc.planet.biz_content.input.data.SerializableContentValidationResult;
import com.okinc.planet.biz_content.input.data.SerializableImageItem;
import com.okinc.planet.biz_content.input.data.SerializableInputSpanData;
import com.okinc.planet.biz_content.input.data.SerializableInputTextState;
import com.okinc.planet.biz_content.publisher.PlanetPublisherViewModel$checkForRestorableDrafts$1;
import com.okinc.planet.biz_content.publisher.PlanetPublisherViewModel$clearAllSavedState$1;
import com.okinc.planet.biz_content.publisher.PlanetPublisherViewModel$createAutoSaveDraft$1;
import com.okinc.planet.biz_content.publisher.PlanetPublisherViewModel$getTokenList$1;
import com.okinc.planet.biz_content.publisher.PlanetPublisherViewModel$getTokenListFromNet$1;
import com.okinc.planet.biz_content.publisher.PlanetPublisherViewModel$getTopicList$1;
import com.okinc.planet.biz_content.publisher.PlanetPublisherViewModel$getTopicListFromNet$1;
import com.okinc.planet.biz_content.publisher.PlanetPublisherViewModel$handleLinkDetection$1;
import com.okinc.planet.biz_content.publisher.PlanetPublisherViewModel$markDraftAsRestored$1;
import com.okinc.planet.biz_content.publisher.PlanetPublisherViewModel$publishContent$1;
import com.okinc.planet.biz_content.publisher.PlanetPublisherViewModel$refreshTokenList$1;
import com.okinc.planet.biz_content.publisher.PlanetPublisherViewModel$refreshTopicList$1;
import com.okinc.planet.biz_content.publisher.PlanetPublisherViewModel$saveDraft$1;
import com.okinc.planet.biz_content.publisher.ToolFragmentType;
import com.okinc.planet.domain.remote.dto.ActivityCardPublish;
import com.okinc.planet.domain.remote.dto.CampaignData;
import com.okinc.planet.domain.remote.dto.CashTag;
import com.okinc.planet.domain.remote.dto.ContentTags;
import com.okinc.planet.domain.remote.dto.HashTag;
import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet.domain.remote.dto.LinkInfo;
import com.okinc.planet.domain.remote.dto.PublishImageItem;
import com.okinc.planet.domain.remote.dto.PublishPermissionResp;
import com.okinc.planet.domain.remote.dto.PublishResponse;
import com.okinc.planet.domain.remote.dto.PublisherTokenInfo;
import com.okinc.planet.domain.remote.dto.PublisherTopicInfo;
import com.okinc.planet.domain.remote.dto.SaveDraftResponse;
import com.okinc.planet.domain.remote.dto.UploadState;
import com.okinc.planet_api.ActivityCard;
import com.okinc.planet_api.ActivityCardImage;
import com.okinc.planet_api.PlanetShareConfig;
import com.okinc.planet_api.RichShareToFeedConfig;
import com.okinc.planet_api.ShareTopic;
import com.okinc.planet_api.publisher.PlanetPublisherChannelId;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC47552tsK;
import o.C47546tsE;
import o.C52761wXj;
import o.tQN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.twn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47793twn extends GenericInputParentViewModel {
    public final MutableStateFlow<java.util.List<java.lang.String>> AwvSrB;
    public final SavedStateHandle AxsJAYaxsJAY;
    public ActivityCard AxsJAYsNCnLh;
    public java.lang.String DAIeex;
    public final Flow<C47805twz> DCJXGO;
    public final MutableStateFlow<C47802tww> DTwDnp;
    public final Flow<C47754twA> ODWQjV;
    public final MutableStateFlow<PlanetShareConfig> ORxRYg;
    public final MutableStateFlow<InputDraft> OcIXYQ;
    public final Flow<C47802tww> OqFWZa;
    public final MutableSharedFlow<C47802tww> QKVWgx;
    public java.util.ArrayList<ShareTopic> QKudOq;
    public final MutableSharedFlow<C47754twA> QOLQEE;
    public final C46349tRa QUSxYX;
    public final InterfaceC46387tSl QVAiDq;
    public final MutableStateFlow<C47805twz> QbewEr;
    public final MutableSharedFlow<C47805twz> QfsBiF;
    public final MutableStateFlow<C47754twA> RJOkX;
    public final StateFlow<Application> RcXXUw;
    public java.util.ArrayList<CashTag> RlQdEF;
    public final InterfaceC56387yDm UeEOUB;
    public final InterfaceC47550tsI aKErDB;
    public final StateFlow<PlanetShareConfig> accept;
    public final StateFlow<java.util.List<java.lang.String>> dNCPSb;
    public final CoroutineDispatcher djSkpj;
    public boolean dvKsVJ;
    public final C46359tRk dxcTrN;
    public final C46352tRd fFgQHt;
    public final C46353tRe fZBcTu;
    public boolean finit;
    public final StateFlow<java.lang.Boolean> flVtFt;
    public java.util.Map<java.lang.String, tQN.Activity> fvQaOB;
    public java.util.List<java.lang.String> gGvvIC;
    public final MutableStateFlow<Application> gHZMYf;
    public DraftDataInfo gasjUx;
    public Job giSNqX;
    public final StateFlow<NetDraftContent> gkJEwt;
    public final C46358tRj hUfVAv;
    public final StateFlow<InputDraft> iRxXKY;
    public final C46364tRp iZzfmt;
    public final MutableStateFlow<java.lang.Boolean> sSMYrx;
    public final MutableStateFlow<NetDraftContent> zuBGHE;
    public static final Activity Companion = new Activity(null);
    public static final int AxsJAY = 8;

    /* JADX INFO: renamed from: o.twn$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ToolFragmentType.values().length];
            try {
                iArr[ToolFragmentType.TOKEN_LIST.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ToolFragmentType.TOPIC_LIST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ToolFragmentType.IMAGE_SELECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ToolFragmentType.PLUGIN_LIST.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[ToolFragmentType.REPLY_TEST.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.util.ArrayList<ShareTopic> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.QKudOq = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DraftDataInfo AxsJAY() {
        return this.gasjUx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<PlanetShareConfig> OcIXYQ() {
        return this.accept;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<C47802tww> QKVWgx() {
        return this.OqFWZa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<C47754twA> QUSxYX() {
        return this.ODWQjV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<C47805twz> QVAiDq() {
        return this.DCJXGO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.util.ArrayList<CashTag> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.RlQdEF = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InputDraft> gHZMYf() {
        return this.iRxXKY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<NetDraftContent> sSMYrx() {
        return this.gkJEwt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Application> zLjUOn() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<java.lang.String>> zsXlph() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0084: CONSTRUCTOR 
  (r11v0 androidx.lifecycle.SavedStateHandle)
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:79)) : (r12v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:o.tRe:?: TERNARY null = ((wrap:int:0x000c: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: INVOKE (wrap:o.tPF:0x0010: SGET  A[WRAPPED] (LINE:80) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.OTwTPd():o.tRe A[MD:():o.tRe (m), WRAPPED] (LINE:80)) : (r13v0 o.tRe))
  (wrap:o.tRd:?: TERNARY null = ((wrap:int:0x0018: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001e: INVOKE (wrap:o.tPF:0x001c: SGET  A[WRAPPED] (LINE:81) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.RKcVTr():o.tRd A[MD:():o.tRd (m), WRAPPED] (LINE:81)) : (r14v0 o.tRd))
  (wrap:o.tsI:?: TERNARY null = ((wrap:int:0x0024: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: CONSTRUCTOR (r11v0 androidx.lifecycle.SavedStateHandle) A[MD:(androidx.lifecycle.SavedStateHandle):void (m), WRAPPED] (LINE:82) call: o.tsL.<init>(androidx.lifecycle.SavedStateHandle):void type: CONSTRUCTOR) : (r15v0 o.tsI))
  (wrap:o.tRj:?: TERNARY null = ((wrap:int:0x0031: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0037: INVOKE (wrap:o.tPF:0x0035: SGET  A[WRAPPED] (LINE:83) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.dLBcXg():o.tRj A[MD:():o.tRj (m), WRAPPED] (LINE:83)) : (r16v0 o.tRj))
  (wrap:o.tRa:?: TERNARY null = ((wrap:int:0x003e: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0044: INVOKE (wrap:o.tPF:0x0042: SGET  A[WRAPPED] (LINE:84) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.DCUTEIdCUTEI():o.tRa A[MD:():o.tRa (m), WRAPPED] (LINE:84)) : (r17v0 o.tRa))
  (wrap:o.tSl:?: TERNARY null = ((wrap:int:0x004b: ARITH (r21v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0051: INVOKE (wrap:o.tPF:0x004f: SGET  A[WRAPPED] (LINE:85) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.alsFma():o.tSm A[MD:():o.tSm (m), WRAPPED] (LINE:85)) : (r18v0 o.tSl))
  (wrap:o.tRk:?: TERNARY null = ((wrap:int:0x0058: ARITH (r21v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005e: INVOKE (wrap:o.tPF:0x005c: SGET  A[WRAPPED] (LINE:86) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.KDccX():o.tRk A[MD:():o.tRk (m), WRAPPED] (LINE:86)) : (r19v0 o.tRk))
  (wrap:o.tRp:?: TERNARY null = ((wrap:int:0x0065: ARITH (r21v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006b: INVOKE (wrap:o.tPF:0x0069: SGET  A[WRAPPED] (LINE:87) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.hlkKmr():o.tRp A[MD:():o.tRp (m), WRAPPED] (LINE:87)) : (r20v0 o.tRp))
 A[MD:(androidx.lifecycle.SavedStateHandle, kotlinx.coroutines.CoroutineDispatcher, o.tRe, o.tRd, o.tsI, o.tRj, o.tRa, o.tSl, o.tRk, o.tRp):void (m)] (LINE:77) call: o.twn.<init>(androidx.lifecycle.SavedStateHandle, kotlinx.coroutines.CoroutineDispatcher, o.tRe, o.tRd, o.tsI, o.tRj, o.tRa, o.tSl, o.tRk, o.tRp):void type: THIS */
    public /* synthetic */ C47793twn(SavedStateHandle savedStateHandle, CoroutineDispatcher coroutineDispatcher, C46353tRe c46353tRe, C46352tRd c46352tRd, InterfaceC47550tsI interfaceC47550tsI, C46358tRj c46358tRj, C46349tRa c46349tRa, InterfaceC46387tSl interfaceC46387tSl, C46359tRk c46359tRk, C46364tRp c46364tRp, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateHandle, (i & 2) != 0 ? Dispatchers.getDefault() : coroutineDispatcher, (i & 4) != 0 ? tPF.copydefault.OTwTPd() : c46353tRe, (i & 8) != 0 ? tPF.copydefault.RKcVTr() : c46352tRd, (i & 16) != 0 ? new C47553tsL(savedStateHandle) : interfaceC47550tsI, (i & 32) != 0 ? tPF.copydefault.dLBcXg() : c46358tRj, (i & 64) != 0 ? tPF.copydefault.DCUTEIdCUTEI() : c46349tRa, (i & 128) != 0 ? tPF.copydefault.alsFma() : interfaceC46387tSl, (i & 256) != 0 ? tPF.copydefault.KDccX() : c46359tRk, (i & 512) != 0 ? tPF.copydefault.hlkKmr() : c46364tRp);
    }

    public C47793twn(@NotNull SavedStateHandle savedStateHandle, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C46353tRe c46353tRe, @NotNull C46352tRd c46352tRd, @NotNull InterfaceC47550tsI interfaceC47550tsI, @NotNull C46358tRj c46358tRj, @NotNull C46349tRa c46349tRa, @NotNull InterfaceC46387tSl interfaceC46387tSl, @NotNull C46359tRk c46359tRk, @NotNull C46364tRp c46364tRp) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c46353tRe, "");
        Intrinsics.checkNotNullParameter(c46352tRd, "");
        Intrinsics.checkNotNullParameter(interfaceC47550tsI, "");
        Intrinsics.checkNotNullParameter(c46358tRj, "");
        Intrinsics.checkNotNullParameter(c46349tRa, "");
        Intrinsics.checkNotNullParameter(interfaceC46387tSl, "");
        Intrinsics.checkNotNullParameter(c46359tRk, "");
        Intrinsics.checkNotNullParameter(c46364tRp, "");
        this.AxsJAYaxsJAY = savedStateHandle;
        this.djSkpj = coroutineDispatcher;
        this.fZBcTu = c46353tRe;
        this.fFgQHt = c46352tRd;
        this.aKErDB = interfaceC47550tsI;
        this.hUfVAv = c46358tRj;
        this.QUSxYX = c46349tRa;
        this.QVAiDq = interfaceC46387tSl;
        this.dxcTrN = c46359tRk;
        this.iZzfmt = c46364tRp;
        this.RJOkX = StateFlowKt.MutableStateFlow(new C47754twA(null, false, false, 7, null));
        MutableSharedFlow<C47754twA> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 64, null, 4, null);
        this.QOLQEE = mutableSharedFlowMutableSharedFlow$default;
        this.ODWQjV = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.DTwDnp = StateFlowKt.MutableStateFlow(new C47802tww(null, false, false, 7, null));
        MutableSharedFlow<C47802tww> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 64, null, 4, null);
        this.QKVWgx = mutableSharedFlowMutableSharedFlow$default2;
        this.OqFWZa = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        this.QbewEr = StateFlowKt.MutableStateFlow(new C47805twz(null, false, false, 7, null));
        MutableSharedFlow<C47805twz> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 64, null, 4, null);
        this.QfsBiF = mutableSharedFlowMutableSharedFlow$default3;
        this.DCJXGO = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableStateFlow<PlanetShareConfig> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.ORxRYg = MutableStateFlow;
        this.accept = FlowKt.asStateFlow(MutableStateFlow);
        this.UeEOUB = C56392yDr.copydefault(new Function0() { // from class: o.twr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C47793twn.fARcdN(this.EZpvd));
            }
        });
        MutableStateFlow<NetDraftContent> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.zuBGHE = MutableStateFlow2;
        this.gkJEwt = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<java.util.List<java.lang.String>> MutableStateFlow3 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AwvSrB = MutableStateFlow3;
        this.dNCPSb = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Application> MutableStateFlow4 = StateFlowKt.MutableStateFlow(new Application(false, null, null, null, 0, null, null, null, null, null, null, null, 4095, null));
        this.gHZMYf = MutableStateFlow4;
        this.RcXXUw = FlowKt.asStateFlow(MutableStateFlow4);
        this.gGvvIC = yDY.AhwBna();
        this.fvQaOB = C56424yEw.KWHzl();
        MutableStateFlow<InputDraft> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.OcIXYQ = MutableStateFlow5;
        this.iRxXKY = FlowKt.asStateFlow(MutableStateFlow5);
        MutableStateFlow<java.lang.Boolean> MutableStateFlow6 = StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.sSMYrx = MutableStateFlow6;
        this.flVtFt = FlowKt.asStateFlow(MutableStateFlow6);
        QOLQEE();
        RJOkX();
        hDKMBd();
        gGvvIC();
    }

    /* JADX INFO: renamed from: o.twn$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.twn.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX INFO: renamed from: o.twn$Application */
    public static final class Application {
        public static final int copydefault = ActivityCardImage.$stable;
        public final java.lang.String AEQbTJ;
        public final boolean AYXKKw;
        public final java.lang.String AhwBna;
        public final UploadState AkhnZx;
        public final ActivityCardImage EZpvd;
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;
        public final java.lang.String djBIcL;
        public final int fetchVPNInfo;
        public final java.lang.String gEmmrt;
        public final PublishImageItem valueOf;
        public final java.lang.String values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(false, null, null, null, 0, null, null, null, null, null, null, null, 4095, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActivityCardImage AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UploadState AkhnZx() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(boolean z, @NotNull UploadState uploadState, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, PublishImageItem publishImageItem, ActivityCardImage activityCardImage) {
            Intrinsics.checkNotNullParameter(uploadState, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            return new Application(z, uploadState, str, str2, i, str3, str4, str5, str6, str7, publishImageItem, activityCardImage);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.values;
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
            return this.AYXKKw == application.AYXKKw && this.AkhnZx == application.AkhnZx && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl) && this.fetchVPNInfo == application.fetchVPNInfo && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) application.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) application.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) application.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.values, (java.lang.Object) application.values) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) application.djBIcL) && Intrinsics.EZpvd(this.valueOf, application.valueOf) && Intrinsics.EZpvd(this.EZpvd, application.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int gEmmrt() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.AYXKKw);
            int iHashCode2 = this.AkhnZx.hashCode();
            int iHashCode3 = this.OLrzqt.hashCode();
            int iHashCode4 = this.KWHzl.hashCode();
            int iHashCode5 = java.lang.Integer.hashCode(this.fetchVPNInfo);
            int iHashCode6 = this.gEmmrt.hashCode();
            int iHashCode7 = this.AEQbTJ.hashCode();
            int iHashCode8 = this.AhwBna.hashCode();
            int iHashCode9 = this.values.hashCode();
            int iHashCode10 = this.djBIcL.hashCode();
            PublishImageItem publishImageItem = this.valueOf;
            int iHashCode11 = publishImageItem == null ? 0 : publishImageItem.hashCode();
            ActivityCardImage activityCardImage = this.EZpvd;
            return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (activityCardImage != null ? activityCardImage.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CampaignCardState(isVisible=" + this.AYXKKw + ", uploadState=" + this.AkhnZx + ", activityId=" + this.OLrzqt + ", activityUrl=" + this.KWHzl + ", shareType=" + this.fetchVPNInfo + ", link=" + this.gEmmrt + ", deeplink=" + this.AEQbTJ + ", language=" + this.AhwBna + ", title=" + this.values + ", description=" + this.djBIcL + ", image=" + this.valueOf + ", activityCardImage=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PublishImageItem valueOf() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean values() {
            return this.AYXKKw;
        }

        public Application(boolean z, @NotNull UploadState uploadState, @NotNull java.lang.String str, @NotNull java.lang.String str2, int i, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, PublishImageItem publishImageItem, ActivityCardImage activityCardImage) {
            Intrinsics.checkNotNullParameter(uploadState, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(str7, "");
            this.AYXKKw = z;
            this.AkhnZx = uploadState;
            this.OLrzqt = str;
            this.KWHzl = str2;
            this.fetchVPNInfo = i;
            this.gEmmrt = str3;
            this.AEQbTJ = str4;
            this.AhwBna = str5;
            this.values = str6;
            this.djBIcL = str7;
            this.valueOf = publishImageItem;
            this.EZpvd = activityCardImage;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:com.okinc.planet.domain.remote.dto.UploadState:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] (LINE:102) com.okinc.planet.domain.remote.dto.UploadState.Idle com.okinc.planet.domain.remote.dto.UploadState) : (r15v0 com.okinc.planet.domain.remote.dto.UploadState))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0024: ARITH (r26v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r18v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r26v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
  (wrap:com.okinc.planet.domain.remote.dto.PublishImageItem:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.planet.domain.remote.dto.PublishImageItem) : (r24v0 com.okinc.planet.domain.remote.dto.PublishImageItem))
  (wrap:com.okinc.planet_api.ActivityCardImage:?: TERNARY null = ((wrap:int:0x005b: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 com.okinc.planet_api.ActivityCardImage) : (null com.okinc.planet_api.ActivityCardImage))
 A[MD:(boolean, com.okinc.planet.domain.remote.dto.UploadState, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.domain.remote.dto.PublishImageItem, com.okinc.planet_api.ActivityCardImage):void (m)] (LINE:100) call: o.twn.Application.<init>(boolean, com.okinc.planet.domain.remote.dto.UploadState, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.planet.domain.remote.dto.PublishImageItem, com.okinc.planet_api.ActivityCardImage):void type: THIS */
        public /* synthetic */ Application(boolean z, UploadState uploadState, java.lang.String str, java.lang.String str2, int i, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, PublishImageItem publishImageItem, ActivityCardImage activityCardImage, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? UploadState.Idle : uploadState, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) == 0 ? i : 0, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) == 0 ? str7 : "", (i2 & 1024) != 0 ? null : publishImageItem, (i2 & 2048) == 0 ? activityCardImage : null);
        }
    }

    public final void OLrzqt(PlanetShareConfig planetShareConfig) {
        this.ORxRYg.setValue(planetShareConfig);
    }

    public final boolean AuCTelauCTel() {
        return ((java.lang.Boolean) this.UeEOUB.getValue()).booleanValue();
    }

    public static final boolean fARcdN(C47793twn c47793twn) {
        PublishPermissionResp publishPermissionRespKWHzl = c47793twn.QVAiDq.KWHzl();
        if (publishPermissionRespKWHzl != null) {
            return Intrinsics.EZpvd(publishPermissionRespKWHzl.getUrlPermission(), java.lang.Boolean.TRUE);
        }
        return false;
    }

    public final void copydefault(NetDraftContent netDraftContent) {
        this.zuBGHE.setValue(netDraftContent);
    }

    public final java.util.List<PublisherTokenInfo> ORxRYg() {
        return this.DTwDnp.getValue().copydefault();
    }

    public final java.util.List<PublisherTopicInfo> QfsBiF() {
        return this.QbewEr.getValue().EZpvd();
    }

    public final PlanetPublisherChannelId AubY() {
        java.lang.String str = (java.lang.String) this.AxsJAYaxsJAY.get("extra_channel_id");
        PlanetPublisherChannelId.Activity activity = PlanetPublisherChannelId.Companion;
        if (str == null) {
            str = "";
        }
        PlanetPublisherChannelId planetPublisherChannelIdAEQbTJ = activity.AEQbTJ(str);
        return planetPublisherChannelIdAEQbTJ == null ? PlanetPublisherChannelId.FEED_NEWS : planetPublisherChannelIdAEQbTJ;
    }

    public final java.util.Map<java.lang.String, java.lang.String> wlaJM() {
        android.os.Bundle bundle = (android.os.Bundle) this.AxsJAYaxsJAY.get("extra_channel_data");
        if (bundle != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            java.util.Set<java.lang.String> setKeySet = bundle.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "");
            for (java.lang.String str : setKeySet) {
                java.lang.String string = bundle.getString(str);
                if (string != null) {
                    linkedHashMap.put(str, string);
                }
            }
            if (!linkedHashMap.isEmpty()) {
                return linkedHashMap;
            }
        }
        return null;
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!UeEOUB()) {
            if (this.dvKsVJ) {
                Job job = this.giSNqX;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
                }
                this.AwvSrB.setValue(yDY.AhwBna());
                this.fvQaOB = C56424yEw.KWHzl();
                this.gGvvIC = yDY.AhwBna();
                return;
            }
            getFieldNames();
            return;
        }
        java.util.List<java.lang.String> listQbewEr = CollectionsKt___CollectionsKt.QbewEr(C46454tUy.OLrzqt.KWHzl(str));
        if (!listQbewEr.isEmpty()) {
            if (Intrinsics.EZpvd(listQbewEr, this.gGvvIC)) {
                return;
            }
            this.gGvvIC = listQbewEr;
            Job job2 = this.giSNqX;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.giSNqX = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djSkpj, null, new PlanetPublisherViewModel$handleLinkDetection$1(this, listQbewEr, null), 2, null);
            return;
        }
        if (!this.dvKsVJ) {
            getFieldNames();
            return;
        }
        Job job3 = this.giSNqX;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.AwvSrB.setValue(yDY.AhwBna());
        this.fvQaOB = C56424yEw.KWHzl();
        this.gGvvIC = yDY.AhwBna();
    }

    public final void uzCIH() {
        java.lang.String strAYXKKw = this.gHZMYf.getValue().AYXKKw();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAYXKKw)) {
            this.DAIeex = strAYXKKw;
        }
        this.gHZMYf.setValue(new Application(false, null, null, null, 0, null, null, null, null, null, null, null, 4095, null));
        this.dvKsVJ = false;
    }

    public final void KWHzl(boolean z) {
        this.finit = z;
        if (z) {
            uzCIH();
        }
    }

    public final void AEQbTJ(ActivityCard activityCard) {
        this.AxsJAYsNCnLh = activityCard;
        boolean z = activityCard != null;
        this.dvKsVJ = z;
        if (z) {
            KWHzl(yDY.AhwBna(), yDY.AhwBna());
        }
    }

    public final boolean UeEOUB() {
        return AuCTelauCTel();
    }

    public final void KWHzl(java.util.List<java.lang.String> list, java.util.List<LinkInfo> list2) {
        java.lang.String deeplink;
        java.lang.Object next;
        java.lang.Object next2;
        ActivityCardImage activityCardImage;
        CampaignData campaignDataEZpvd;
        deeplink = "";
        if (this.dvKsVJ) {
            if (this.finit || (!fIwbmz().getValue().isEmpty())) {
                this.gHZMYf.setValue(new Application(false, null, null, null, 0, null, null, null, null, null, null, null, 4095, null));
                return;
            }
            ActivityCard activityCard = this.AxsJAYsNCnLh;
            if (activityCard == null) {
                this.gHZMYf.setValue(new Application(false, null, null, null, 0, null, null, null, null, null, null, null, 4095, null));
                return;
            }
            if (C59449zhJ.AYXKKw(activityCard.getLinkUrl(), DefaultWebClient.HTTPS_SCHEME, true)) {
                deeplink = activityCard.getLinkUrl();
            } else if (C59449zhJ.AYXKKw(activityCard.getDeeplink(), DefaultWebClient.HTTPS_SCHEME, true)) {
                deeplink = activityCard.getDeeplink();
            }
            MutableStateFlow<Application> mutableStateFlow = this.gHZMYf;
            mutableStateFlow.setValue(new Application(true, mutableStateFlow.getValue().AkhnZx(), activityCard.getActivityId(), deeplink, 2, activityCard.getLinkUrl(), activityCard.getDeeplink(), "", activityCard.getTitle(), EZpvd(activityCard.getDescription()), this.gHZMYf.getValue().valueOf(), activityCard.getImage()));
            return;
        }
        if (this.finit) {
            this.gHZMYf.setValue(new Application(false, null, null, null, 0, null, null, null, null, null, null, null, 4095, null));
            return;
        }
        if (!fIwbmz().getValue().isEmpty()) {
            this.gHZMYf.setValue(new Application(false, null, null, null, 0, null, null, null, null, null, null, null, 4095, null));
            return;
        }
        java.lang.String str = this.DAIeex;
        if (str != null && !CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) list), str)) {
            this.DAIeex = null;
        }
        java.util.Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            LinkInfo linkInfo = (LinkInfo) next;
            if (linkInfo.djBIcL() && linkInfo.AEQbTJ() && (campaignDataEZpvd = linkInfo.EZpvd()) != null && campaignDataEZpvd.AEQbTJ()) {
                break;
            }
        }
        LinkInfo linkInfo2 = (LinkInfo) next;
        java.lang.String strOLrzqt = linkInfo2 != null ? linkInfo2.OLrzqt() : null;
        java.lang.String str2 = strOLrzqt == null ? "" : strOLrzqt;
        java.util.Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (Intrinsics.EZpvd(next2, (java.lang.Object) str2)) {
                    break;
                }
            }
        }
        java.lang.String str3 = (java.lang.String) next2;
        java.lang.String str4 = str3 == null ? str2 : str3;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str2) || Intrinsics.EZpvd((java.lang.Object) this.DAIeex, (java.lang.Object) str2)) {
            this.gHZMYf.setValue(new Application(false, null, null, null, 0, null, null, null, null, null, null, null, 4095, null));
            return;
        }
        CampaignData campaignDataEZpvd2 = linkInfo2 != null ? linkInfo2.EZpvd() : null;
        java.lang.String strOLrzqt2 = campaignDataEZpvd2 != null ? campaignDataEZpvd2.OLrzqt() : null;
        if (strOLrzqt2 == null || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt2))) {
            strOLrzqt2 = null;
        }
        if (strOLrzqt2 == null) {
            strOLrzqt2 = "";
        }
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt2))) {
            strOLrzqt2 = null;
        }
        boolean z = false;
        if (strOLrzqt2 != null) {
            activityCardImage = new ActivityCardImage((C59449zhJ.startsWith$default(strOLrzqt2, DefaultWebClient.HTTP_SCHEME, false, 2, null) || C59449zhJ.startsWith$default(strOLrzqt2, DefaultWebClient.HTTPS_SCHEME, false, 2, null)) ? "url" : "url_path", strOLrzqt2);
        } else {
            activityCardImage = null;
        }
        java.lang.String type = activityCardImage != null ? activityCardImage.getType() : null;
        ActivityCardImage activityCardImageAEQbTJ = this.gHZMYf.getValue().AEQbTJ();
        if (Intrinsics.EZpvd((java.lang.Object) type, (java.lang.Object) (activityCardImageAEQbTJ != null ? activityCardImageAEQbTJ.getType() : null))) {
            java.lang.String value = activityCardImage != null ? activityCardImage.getValue() : null;
            ActivityCardImage activityCardImageAEQbTJ2 = this.gHZMYf.getValue().AEQbTJ();
            if (Intrinsics.EZpvd((java.lang.Object) value, (java.lang.Object) (activityCardImageAEQbTJ2 != null ? activityCardImageAEQbTJ2.getValue() : null))) {
                z = true;
            }
        }
        MutableStateFlow<Application> mutableStateFlow2 = this.gHZMYf;
        java.lang.String strCopydefault = linkInfo2 != null ? linkInfo2.copydefault() : null;
        java.lang.String str5 = strCopydefault == null ? "" : strCopydefault;
        java.lang.String strEZpvd = campaignDataEZpvd2 != null ? campaignDataEZpvd2.EZpvd() : null;
        java.lang.String str6 = strEZpvd == null ? "" : strEZpvd;
        java.lang.String strKWHzl = campaignDataEZpvd2 != null ? campaignDataEZpvd2.KWHzl() : null;
        if (strKWHzl == null || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl))) {
            strKWHzl = null;
        }
        java.lang.String str7 = strKWHzl == null ? "" : strKWHzl;
        java.lang.String strCopydefault2 = campaignDataEZpvd2 != null ? campaignDataEZpvd2.copydefault() : null;
        if (strCopydefault2 == null || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault2))) {
            strCopydefault2 = null;
        }
        mutableStateFlow2.setValue(new Application(true, z ? this.gHZMYf.getValue().AkhnZx() : UploadState.Idle, str5, str4, 1, str2, null, str6, str7, EZpvd(strCopydefault2 != null ? strCopydefault2 : ""), z ? this.gHZMYf.getValue().valueOf() : null, activityCardImage, 64, null));
    }

    public final java.lang.String EZpvd(java.lang.String str) {
        java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString();
        if (string.length() <= 100) {
            return string;
        }
        return C59454zhO.AkhnZx(string, 100) + "...";
    }

    public final void getFieldNames() {
        Job job = this.giSNqX;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.AwvSrB.setValue(yDY.AhwBna());
        this.fvQaOB = C56424yEw.KWHzl();
        this.gGvvIC = yDY.AhwBna();
        this.gHZMYf.setValue(new Application(false, null, null, null, 0, null, null, null, null, null, null, null, 4095, null));
    }

    public final void copydefault(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.gHZMYf.setValue(application);
    }

    public final void QOLQEE() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djSkpj, null, new PlanetPublisherViewModel$getTokenList$1(this, null), 2, null);
    }

    public final void fFgQHt() {
        java.util.Collection<CashTag> collectionAhwBna;
        java.util.ArrayList<CashTag> arrayList = this.RlQdEF;
        if (arrayList != null) {
            java.util.List<PublisherTokenInfo> listORxRYg = ORxRYg();
            if (listORxRYg == null) {
                listORxRYg = yDY.AhwBna();
            }
            collectionAhwBna = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                CashTag cashTag = (CashTag) obj;
                if (!(listORxRYg instanceof java.util.Collection) || !listORxRYg.isEmpty()) {
                    java.util.Iterator<T> it = listORxRYg.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.EZpvd((java.lang.Object) ((PublisherTokenInfo) it.next()).getName(), (java.lang.Object) cashTag.copydefault())) {
                            break;
                        }
                    }
                }
                collectionAhwBna.add(obj);
            }
        } else {
            collectionAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList<PublisherTokenInfo> arrayList2 = new java.util.ArrayList<>();
        for (CashTag cashTag2 : collectionAhwBna) {
            arrayList2.add(new PublisherTokenInfo(cashTag2.copydefault(), cashTag2.copydefault(), (java.lang.String) null, 4, (DefaultConstructorMarker) null));
        }
        if (!arrayList2.isEmpty()) {
            EZpvd(arrayList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        PlanetPublisherViewModel$getTokenListFromNet$1 planetPublisherViewModel$getTokenListFromNet$1;
        C47793twn c47793twn;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof PlanetPublisherViewModel$getTokenListFromNet$1) {
            planetPublisherViewModel$getTokenListFromNet$1 = (PlanetPublisherViewModel$getTokenListFromNet$1) continuation;
            int i = planetPublisherViewModel$getTokenListFromNet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetPublisherViewModel$getTokenListFromNet$1.label = i - Integer.MIN_VALUE;
            } else {
                planetPublisherViewModel$getTokenListFromNet$1 = new PlanetPublisherViewModel$getTokenListFromNet$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = planetPublisherViewModel$getTokenListFromNet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetPublisherViewModel$getTokenListFromNet$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C47802tww c47802tww = new C47802tww(ORxRYg(), true, true);
            this.DTwDnp.setValue(c47802tww);
            this.QKVWgx.tryEmit(c47802tww);
            try {
                Result.Application application = Result.Companion;
                C46353tRe c46353tRe = this.fZBcTu;
                CacheStrategy cacheStrategy = CacheStrategy.NO_CACHE;
                planetPublisherViewModel$getTokenListFromNet$1.L$0 = this;
                planetPublisherViewModel$getTokenListFromNet$1.label = 1;
                objKWHzl = c46353tRe.KWHzl(cacheStrategy, planetPublisherViewModel$getTokenListFromNet$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c47793twn = this;
            } catch (java.lang.Throwable th) {
                th = th;
                c47793twn = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c47793twn = (C47793twn) planetPublisherViewModel$getTokenListFromNet$1.L$0;
            try {
                C56391yDq.AEQbTJ(objKWHzl);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((kotlin.Pair) objKWHzl);
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(yDY.AhwBna(), C56443yFo.KWHzl(false));
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = pairOLrzqt;
        }
        kotlin.Pair pair = (kotlin.Pair) objM7377constructorimpl;
        if (!((java.lang.Boolean) pair.getSecond()).booleanValue()) {
            C47802tww c47802tww2 = new C47802tww((java.util.List) pair.getFirst(), false, false);
            c47793twn.DTwDnp.setValue(c47802tww2);
            c47793twn.QKVWgx.tryEmit(c47802tww2);
        } else {
            C47802tww c47802tww3 = new C47802tww(c47793twn.ORxRYg(), false, true);
            c47793twn.DTwDnp.setValue(c47802tww3);
            c47793twn.QKVWgx.tryEmit(c47802tww3);
        }
        return Unit.INSTANCE;
    }

    public final void fZBcTu() {
        if (this.DTwDnp.getValue().KWHzl()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djSkpj, null, new PlanetPublisherViewModel$refreshTokenList$1(this, null), 2, null);
    }

    public final int giSNqX() {
        return C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "feature_planet_topic", null, 2, null), "treatment", false, 2, null) ? 0 : 8;
    }

    public final void RJOkX() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djSkpj, null, new PlanetPublisherViewModel$getTopicList$1(this, null), 2, null);
    }

    public final void finit() {
        java.util.Collection<ShareTopic> collectionAhwBna;
        java.util.ArrayList<ShareTopic> arrayList = this.QKudOq;
        if (arrayList != null) {
            java.util.List<PublisherTopicInfo> listQfsBiF = QfsBiF();
            if (listQfsBiF == null) {
                listQfsBiF = yDY.AhwBna();
            }
            collectionAhwBna = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                ShareTopic shareTopic = (ShareTopic) obj;
                if (!(listQfsBiF instanceof java.util.Collection) || !listQfsBiF.isEmpty()) {
                    for (PublisherTopicInfo publisherTopicInfo : listQfsBiF) {
                        if (!Intrinsics.EZpvd((java.lang.Object) publisherTopicInfo.getTag(), (java.lang.Object) shareTopic.getTag()) || !Intrinsics.EZpvd((java.lang.Object) publisherTopicInfo.getActivityKey(), (java.lang.Object) shareTopic.getTopicId())) {
                        }
                    }
                }
                collectionAhwBna.add(obj);
            }
        } else {
            collectionAhwBna = yDY.AhwBna();
        }
        java.util.ArrayList<PublisherTopicInfo> arrayList2 = new java.util.ArrayList<>();
        for (ShareTopic shareTopic2 : collectionAhwBna) {
            arrayList2.add(new PublisherTopicInfo(shareTopic2.getTag(), shareTopic2.getLinkUrl(), shareTopic2.getDeepLinkUrl(), shareTopic2.getTopicId()));
        }
        if (!arrayList2.isEmpty()) {
            KWHzl(arrayList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        PlanetPublisherViewModel$getTopicListFromNet$1 planetPublisherViewModel$getTopicListFromNet$1;
        C47793twn c47793twn;
        java.lang.Object objM7377constructorimpl;
        if (continuation instanceof PlanetPublisherViewModel$getTopicListFromNet$1) {
            planetPublisherViewModel$getTopicListFromNet$1 = (PlanetPublisherViewModel$getTopicListFromNet$1) continuation;
            int i = planetPublisherViewModel$getTopicListFromNet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetPublisherViewModel$getTopicListFromNet$1.label = i - Integer.MIN_VALUE;
            } else {
                planetPublisherViewModel$getTopicListFromNet$1 = new PlanetPublisherViewModel$getTopicListFromNet$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = planetPublisherViewModel$getTopicListFromNet$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetPublisherViewModel$getTopicListFromNet$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C47805twz c47805twz = new C47805twz(QfsBiF(), true, true);
            this.QbewEr.setValue(c47805twz);
            this.QfsBiF.tryEmit(c47805twz);
            try {
                Result.Application application = Result.Companion;
                C46352tRd c46352tRd = this.fFgQHt;
                CacheStrategy cacheStrategy = CacheStrategy.NO_CACHE;
                planetPublisherViewModel$getTopicListFromNet$1.L$0 = this;
                planetPublisherViewModel$getTopicListFromNet$1.label = 1;
                objKWHzl = c46352tRd.KWHzl(cacheStrategy, planetPublisherViewModel$getTopicListFromNet$1);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                c47793twn = this;
            } catch (java.lang.Throwable th) {
                th = th;
                c47793twn = this;
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c47793twn = (C47793twn) planetPublisherViewModel$getTopicListFromNet$1.L$0;
            try {
                C56391yDq.AEQbTJ(objKWHzl);
            } catch (java.lang.Throwable th2) {
                th = th2;
                Result.Application application22 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
        objM7377constructorimpl = Result.m7377constructorimpl((kotlin.Pair) objKWHzl);
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(yDY.AhwBna(), C56443yFo.KWHzl(false));
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = pairOLrzqt;
        }
        kotlin.Pair pair = (kotlin.Pair) objM7377constructorimpl;
        if (!((java.lang.Boolean) pair.getSecond()).booleanValue()) {
            C47805twz c47805twz2 = new C47805twz((java.util.List) pair.getFirst(), false, false);
            c47793twn.QbewEr.setValue(c47805twz2);
            c47793twn.QfsBiF.tryEmit(c47805twz2);
        } else {
            C47805twz c47805twz3 = new C47805twz(c47793twn.QfsBiF(), false, true);
            c47793twn.QbewEr.setValue(c47805twz3);
            c47793twn.QfsBiF.tryEmit(c47805twz3);
        }
        return Unit.INSTANCE;
    }

    public final void dxcTrN() {
        if (this.QbewEr.getValue().copydefault()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djSkpj, null, new PlanetPublisherViewModel$refreshTopicList$1(this, null), 2, null);
    }

    public static /* synthetic */ void handleToolFragmentAction$default(C47793twn c47793twn, ToolFragmentType toolFragmentType, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        c47793twn.copydefault(toolFragmentType, z);
    }

    public final void copydefault(@NotNull ToolFragmentType toolFragmentType, boolean z) {
        Intrinsics.checkNotNullParameter(toolFragmentType, "");
        if (this.RJOkX.getValue().AEQbTJ() == toolFragmentType) {
            djSkpj();
            return;
        }
        java.lang.String strEZpvd = EZpvd(toolFragmentType);
        if (z && strEZpvd != null) {
            KWHzl(strEZpvd);
        } else {
            AEQbTJ(toolFragmentType);
        }
    }

    public final java.lang.String EZpvd(ToolFragmentType toolFragmentType) {
        int i = ActionBar.copydefault[toolFragmentType.ordinal()];
        if (i == 1) {
            return "$";
        }
        if (i != 2) {
            return null;
        }
        return ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER;
    }

    public final void AEQbTJ(ToolFragmentType toolFragmentType) {
        C47754twA c47754twA;
        C47754twA c47754twA2;
        int i = ActionBar.copydefault[toolFragmentType.ordinal()];
        if (i == 1 || i == 2) {
            c47754twA = new C47754twA(toolFragmentType, true, false);
        } else if (i == 3 || i == 4 || i == 5) {
            c47754twA = new C47754twA(toolFragmentType, false, true);
        } else {
            c47754twA2 = new C47754twA(null, false, false, 7, null);
            this.RJOkX.setValue(c47754twA2);
            this.QOLQEE.tryEmit(c47754twA2);
        }
        c47754twA2 = c47754twA;
        this.RJOkX.setValue(c47754twA2);
        this.QOLQEE.tryEmit(c47754twA2);
    }

    public final ToolFragmentType OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "$")) {
            return ToolFragmentType.TOKEN_LIST;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)) {
            return ToolFragmentType.TOPIC_LIST;
        }
        return null;
    }

    public final void djSkpj() {
        C47754twA c47754twA = new C47754twA(null, false, false, 7, null);
        this.RJOkX.setValue(c47754twA);
        this.QOLQEE.tryEmit(c47754twA);
    }

    public final boolean RcXXUw() {
        return this.RJOkX.getValue().AEQbTJ() != ToolFragmentType.NONE;
    }

    public final C47754twA QbewEr() {
        return this.RJOkX.getValue();
    }

    public final InputPageState OLrzqt(@NotNull SerializableInputTextState serializableInputTextState) {
        Intrinsics.checkNotNullParameter(serializableInputTextState, "");
        java.util.List<ImageItem> value = djBIcL().getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(value, 10));
        java.util.Iterator<T> it = value.iterator();
        while (it.hasNext()) {
            arrayList.add(SerializableImageItem.Companion.EZpvd((ImageItem) it.next()));
        }
        boolean zBooleanValue = DbNXlk().getValue().booleanValue();
        boolean zBooleanValue2 = AuCTel().getValue().booleanValue();
        java.util.Map<ContentValidationType, C47572tse> mapOLrzqt = AkhnZx().getValue().OLrzqt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(mapOLrzqt.size()));
        java.util.Iterator<T> it2 = mapOLrzqt.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(((ContentValidationType) entry.getKey()).name(), entry.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), SerializableContentValidationResult.Companion.OLrzqt((C47572tse) entry2.getValue()));
        }
        InputPageState inputPageState = new InputPageState(serializableInputTextState, arrayList, zBooleanValue, zBooleanValue2, linkedHashMap2, this.RJOkX.getValue().AEQbTJ().name(), 0L, 64, null);
        this.AxsJAYaxsJAY.set("planet_publisher_page_state", inputPageState);
        this.AxsJAYaxsJAY.set("page_state_restored", java.lang.Boolean.FALSE);
        EZpvd(serializableInputTextState, djBIcL().getValue());
        return inputPageState;
    }

    @Override // com.okinc.planet.biz_content.input.GenericInputParentViewModel
    public void EZpvd(@NotNull InputPageState inputPageState) {
        ToolFragmentType toolFragmentTypeValueOf;
        Intrinsics.checkNotNullParameter(inputPageState, "");
        if (dNCPSb()) {
            return;
        }
        super.EZpvd(inputPageState);
        try {
            toolFragmentTypeValueOf = ToolFragmentType.valueOf(inputPageState.getToolFragmentType());
        } catch (java.lang.IllegalArgumentException unused) {
            toolFragmentTypeValueOf = ToolFragmentType.NONE;
        }
        ToolFragmentType toolFragmentType = toolFragmentTypeValueOf;
        if (toolFragmentType != ToolFragmentType.NONE) {
            this.RJOkX.setValue(new C47754twA(toolFragmentType, false, false, 6, null));
        }
        java.util.List<SerializableImageItem> imageItems = inputPageState.getImageItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(imageItems, 10));
        java.util.Iterator<T> it = imageItems.iterator();
        while (it.hasNext()) {
            arrayList.add(((SerializableImageItem) it.next()).toImageItem());
        }
        EZpvd((java.util.List<ImageItem>) arrayList);
        this.AxsJAYaxsJAY.set("page_state_restored", java.lang.Boolean.TRUE);
    }

    public final void getNewProxyInstance() {
        this.AxsJAYaxsJAY.remove("planet_publisher_page_state");
        this.AxsJAYaxsJAY.remove("page_state_restored");
        this.AxsJAYaxsJAY.remove("draft_checked_on_recreation");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetPublisherViewModel$clearAllSavedState$1(this, null), 3, null);
    }

    public final InputPageState AwvSrB() {
        return (InputPageState) this.AxsJAYaxsJAY.get("planet_publisher_page_state");
    }

    public final boolean aKErDB() {
        return this.AxsJAYaxsJAY.contains("planet_publisher_page_state");
    }

    public final boolean dNCPSb() {
        java.lang.Boolean bool = (java.lang.Boolean) this.AxsJAYaxsJAY.get("page_state_restored");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void gGvvIC() {
        try {
            InputPageState inputPageStateAwvSrB = AwvSrB();
            if (inputPageStateAwvSrB != null) {
                EZpvd(inputPageStateAwvSrB);
            } else {
                DTwDnp();
                zuBGHE();
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("PublisherVM", "Failed to restore page state: " + e);
        }
    }

    public final void DTwDnp() {
        RichShareToFeedConfig richShareToFeedConfigCopydefault;
        PlanetShareConfig planetShareConfig = (PlanetShareConfig) this.AxsJAYaxsJAY.get("planetShare");
        this.QKudOq = (planetShareConfig == null || (richShareToFeedConfigCopydefault = planetShareConfig.copydefault()) == null) ? null : richShareToFeedConfigCopydefault.getTopics();
        OLrzqt(planetShareConfig);
    }

    public final void zuBGHE() {
        copydefault(AEQbTJ((DraftDataInfo) this.AxsJAYaxsJAY.get("extra_draft_mode")));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final NetDraftContent AEQbTJ(DraftDataInfo draftDataInfo) {
        java.lang.String content;
        java.util.List<CashTag> listKWHzl;
        java.util.List<HashTag> listOLrzqt;
        java.util.List<java.lang.Integer> list;
        java.lang.Integer numGEmmrt;
        if (draftDataInfo == null || (content = draftDataInfo.getContent()) == null) {
            return null;
        }
        this.gasjUx = draftDataInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<PublishImageItem> imageList = draftDataInfo.getImageList();
        if (imageList != null) {
            for (PublishImageItem publishImageItem : imageList) {
                arrayList.add(new SerializableImageItem(UUID.randomUUID() + "_" + java.lang.System.currentTimeMillis(), null, null, UploadState.Success, publishImageItem.AEQbTJ(), publishImageItem.KWHzl(), publishImageItem.copydefault(), publishImageItem.OLrzqt(), null, publishImageItem.EZpvd(), 262, null));
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        ContentTags contentTags = draftDataInfo.getContentTags();
        if (contentTags != null && (listOLrzqt = contentTags.OLrzqt()) != null) {
            for (HashTag hashTag : listOLrzqt) {
                if (hashTag.gEmmrt() == null || ((numGEmmrt = hashTag.gEmmrt()) != null && numGEmmrt.intValue() == 0)) {
                    java.lang.String string = StringsKt__StringsKt.iwGUEr((java.lang.CharSequence) StringsKt__StringsKt.KWHzl(hashTag.valueOf(), (java.lang.CharSequence) ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER)).toString();
                    arrayList3.add(new ShareTopic(string, (java.lang.String) null, (java.lang.String) null, hashTag.AEQbTJ(), 6, (DefaultConstructorMarker) null));
                    java.util.List<java.lang.Integer> listCopydefault = copydefault(content, hashTag.valueOf());
                    java.util.Iterator<T> it = hashTag.OLrzqt().iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((java.lang.Number) it.next()).intValue() - 1;
                        if (iIntValue < 0 || iIntValue >= listCopydefault.size()) {
                            list = listCopydefault;
                        } else {
                            int iIntValue2 = listCopydefault.get(iIntValue).intValue();
                            int length = iIntValue2 + hashTag.valueOf().length();
                            if (iIntValue2 >= 0 && length > iIntValue2 && length <= content.length()) {
                                java.lang.String strSubstring = content.substring(iIntValue2, length);
                                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                                list = listCopydefault;
                                arrayList2.add(new SerializableInputSpanData(iIntValue2, length, strSubstring, string, InputHyperlinkType.TOPIC, hashTag.AEQbTJ(), C52761wXj.Activity.dvKsVJ));
                            }
                        }
                        listCopydefault = list;
                    }
                }
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        ContentTags contentTags2 = draftDataInfo.getContentTags();
        if (contentTags2 != null && (listKWHzl = contentTags2.KWHzl()) != null) {
            for (CashTag cashTag : listKWHzl) {
                arrayList4.add(cashTag);
                java.util.List<java.lang.Integer> listCopydefault2 = copydefault(content, cashTag.KWHzl());
                java.util.Iterator<T> it2 = cashTag.EZpvd().iterator();
                while (it2.hasNext()) {
                    int iIntValue3 = ((java.lang.Number) it2.next()).intValue() - 1;
                    if (iIntValue3 >= 0 && iIntValue3 < listCopydefault2.size()) {
                        int iIntValue4 = listCopydefault2.get(iIntValue3).intValue();
                        int length2 = iIntValue4 + cashTag.KWHzl().length();
                        if (iIntValue4 >= 0 && length2 > iIntValue4 && length2 <= content.length()) {
                            java.lang.String strSubstring2 = content.substring(iIntValue4, length2);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                            arrayList2.add(new SerializableInputSpanData(iIntValue4, length2, strSubstring2, cashTag.copydefault(), InputHyperlinkType.TOKEN, "", C52761wXj.Activity.dvKsVJ));
                        }
                    }
                }
            }
        }
        return new NetDraftContent(new SerializableInputTextState(draftDataInfo.getContent(), arrayList2), arrayList, arrayList3, arrayList4);
    }

    public final java.util.List<java.lang.Integer> copydefault(java.lang.String str, java.lang.String str2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, 0, false, 6, (java.lang.Object) null);
        while (iIndexOf$default >= 0) {
            arrayList.add(java.lang.Integer.valueOf(iIndexOf$default));
            iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) str, str2, iIndexOf$default + 1, false, 4, (java.lang.Object) null);
        }
        return arrayList;
    }

    public final void EZpvd(SerializableInputTextState serializableInputTextState, java.util.List<ImageItem> list) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetPublisherViewModel$createAutoSaveDraft$1(serializableInputTextState, list, this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        PlanetPublisherViewModel$markDraftAsRestored$1 planetPublisherViewModel$markDraftAsRestored$1;
        C47793twn c47793twn;
        C47793twn c47793twn2;
        if (continuation instanceof PlanetPublisherViewModel$markDraftAsRestored$1) {
            planetPublisherViewModel$markDraftAsRestored$1 = (PlanetPublisherViewModel$markDraftAsRestored$1) continuation;
            int i = planetPublisherViewModel$markDraftAsRestored$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetPublisherViewModel$markDraftAsRestored$1.label = i - Integer.MIN_VALUE;
            } else {
                planetPublisherViewModel$markDraftAsRestored$1 = new PlanetPublisherViewModel$markDraftAsRestored$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = planetPublisherViewModel$markDraftAsRestored$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetPublisherViewModel$markDraftAsRestored$1.label;
        try {
        } catch (java.lang.Exception e) {
            pUU.copydefault("PlanetPublisherViewModel", "Failed to mark draft as restored: " + str + " - " + e);
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            InterfaceC47550tsI interfaceC47550tsI = this.aKErDB;
            planetPublisherViewModel$markDraftAsRestored$1.L$0 = this;
            planetPublisherViewModel$markDraftAsRestored$1.L$1 = str;
            planetPublisherViewModel$markDraftAsRestored$1.label = 1;
            objEZpvd = interfaceC47550tsI.EZpvd(str, planetPublisherViewModel$markDraftAsRestored$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            c47793twn = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (java.lang.String) planetPublisherViewModel$markDraftAsRestored$1.L$1;
                c47793twn2 = (C47793twn) planetPublisherViewModel$markDraftAsRestored$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd);
                c47793twn2.OcIXYQ.setValue(null);
                return Unit.INSTANCE;
            }
            str = (java.lang.String) planetPublisherViewModel$markDraftAsRestored$1.L$1;
            c47793twn = (C47793twn) planetPublisherViewModel$markDraftAsRestored$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        AbstractC47552tsK abstractC47552tsK = (AbstractC47552tsK) objEZpvd;
        if (abstractC47552tsK.copydefault()) {
            Intrinsics.copydefault(abstractC47552tsK, "");
            InputDraft inputDraft = (InputDraft) ((AbstractC47552tsK.StateListAnimator) abstractC47552tsK).EZpvd();
            if (inputDraft != null) {
                InputDraft inputDraftMarkAsRestored = inputDraft.markAsRestored();
                InterfaceC47550tsI interfaceC47550tsI2 = c47793twn.aKErDB;
                planetPublisherViewModel$markDraftAsRestored$1.L$0 = c47793twn;
                planetPublisherViewModel$markDraftAsRestored$1.L$1 = str;
                planetPublisherViewModel$markDraftAsRestored$1.label = 2;
                if (interfaceC47550tsI2.OLrzqt(inputDraftMarkAsRestored, planetPublisherViewModel$markDraftAsRestored$1) == objCopydefault) {
                    return objCopydefault;
                }
                c47793twn2 = c47793twn;
                c47793twn2.OcIXYQ.setValue(null);
            }
        }
        return Unit.INSTANCE;
    }

    public final void hDKMBd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetPublisherViewModel$checkForRestorableDrafts$1(this, null), 3, null);
    }

    public final void iwGUEr() {
        java.lang.Boolean bool = (java.lang.Boolean) this.AxsJAYaxsJAY.get("draft_checked_on_recreation");
        if (bool == null || !bool.booleanValue()) {
            hDKMBd();
            this.AxsJAYaxsJAY.set("draft_checked_on_recreation", java.lang.Boolean.TRUE);
        }
    }

    public final SerializableInputTextState dvKsVJ() {
        InputDraft value = this.OcIXYQ.getValue();
        if (value == null || !value.needsRestore()) {
            return null;
        }
        java.util.List<SerializableImageItem> imageItems = value.getContent().getImageItems();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(imageItems, 10));
        java.util.Iterator<T> it = imageItems.iterator();
        while (it.hasNext()) {
            arrayList.add(((SerializableImageItem) it.next()).toImageItem());
        }
        EZpvd((java.util.List<ImageItem>) arrayList);
        return value.getContent().getTextState();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull final java.lang.String str, @NotNull C47625tte c47625tte, final C47546tsE.StateListAnimator stateListAnimator, @NotNull Continuation<? super AbstractC43419rot<PublishResponse, OKServerException>> continuation) throws java.lang.Throwable {
        PlanetPublisherViewModel$publishContent$1 planetPublisherViewModel$publishContent$1;
        java.util.List<com.okinc.planet.domain.remote.dto.PluginData> listAhwBna;
        int i;
        final ContentTags contentTags;
        final java.lang.String str2;
        final java.util.List<ImageItem> list;
        final C47793twn c47793twn;
        final C47546tsE.StateListAnimator stateListAnimator2;
        if (continuation instanceof PlanetPublisherViewModel$publishContent$1) {
            planetPublisherViewModel$publishContent$1 = (PlanetPublisherViewModel$publishContent$1) continuation;
            int i2 = planetPublisherViewModel$publishContent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                planetPublisherViewModel$publishContent$1.label = i2 - Integer.MIN_VALUE;
            } else {
                planetPublisherViewModel$publishContent$1 = new PlanetPublisherViewModel$publishContent$1(this, continuation);
            }
        }
        PlanetPublisherViewModel$publishContent$1 planetPublisherViewModel$publishContent$12 = planetPublisherViewModel$publishContent$1;
        java.lang.Object obj = planetPublisherViewModel$publishContent$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = planetPublisherViewModel$publishContent$12.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            final ContentTags contentTagsAEQbTJ = tQN.EZpvd.AEQbTJ(c47625tte, c47625tte.valueOf(), this.fvQaOB);
            final java.util.List<ImageItem> value = fIwbmz().getValue();
            if (stateListAnimator == null || (listAhwBna = C56402yEa.EZpvd(new com.okinc.planet.domain.remote.dto.PluginData(stateListAnimator.KWHzl().getValue(), stateListAnimator.AEQbTJ().AEQbTJ(), stateListAnimator.AEQbTJ().copydefault(), stateListAnimator.AEQbTJ().KWHzl()))) == null) {
                listAhwBna = yDY.AhwBna();
            }
            java.util.List<com.okinc.planet.domain.remote.dto.PluginData> list2 = listAhwBna;
            final ActivityCardPublish activityCardPublishEjfBZ = ejfBZ();
            C32866mlf.onEvent$default("Feeds_Mid_PublishPost_Click", (TrackChannel[]) null, new Function1() { // from class: o.twv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C47793twn.KWHzl(this.AEQbTJ, str, value, contentTagsAEQbTJ, stateListAnimator, activityCardPublishEjfBZ, (EventParamsList) obj2);
                }
            }, 1, (java.lang.Object) null);
            C46358tRj c46358tRj = this.hUfVAv;
            DraftDataInfo draftDataInfo = this.gasjUx;
            java.lang.String draftId = draftDataInfo != null ? draftDataInfo.getDraftId() : null;
            PlanetPublisherChannelId planetPublisherChannelIdAubY = AubY();
            java.util.Map<java.lang.String, java.lang.String> mapWlaJM = wlaJM();
            planetPublisherViewModel$publishContent$12.L$0 = this;
            planetPublisherViewModel$publishContent$12.L$1 = str;
            planetPublisherViewModel$publishContent$12.L$2 = stateListAnimator;
            planetPublisherViewModel$publishContent$12.L$3 = contentTagsAEQbTJ;
            planetPublisherViewModel$publishContent$12.L$4 = value;
            planetPublisherViewModel$publishContent$12.label = 1;
            i = 1;
            java.lang.Object objAEQbTJ = c46358tRj.AEQbTJ(draftId, str, value, list2, contentTagsAEQbTJ, activityCardPublishEjfBZ, planetPublisherChannelIdAubY, mapWlaJM, planetPublisherViewModel$publishContent$12);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            contentTags = contentTagsAEQbTJ;
            obj = objAEQbTJ;
            str2 = str;
            list = value;
            c47793twn = this;
            stateListAnimator2 = stateListAnimator;
        } else {
            if (i3 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.util.List<ImageItem> list3 = (java.util.List) planetPublisherViewModel$publishContent$12.L$4;
            ContentTags contentTags2 = (ContentTags) planetPublisherViewModel$publishContent$12.L$3;
            C47546tsE.StateListAnimator stateListAnimator3 = (C47546tsE.StateListAnimator) planetPublisherViewModel$publishContent$12.L$2;
            java.lang.String str3 = (java.lang.String) planetPublisherViewModel$publishContent$12.L$1;
            C47793twn c47793twn2 = (C47793twn) planetPublisherViewModel$publishContent$12.L$0;
            C56391yDq.AEQbTJ(obj);
            list = list3;
            contentTags = contentTags2;
            str2 = str3;
            c47793twn = c47793twn2;
            i = 1;
            stateListAnimator2 = stateListAnimator3;
        }
        final AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        C32866mlf.onEvent$default("Feeds_Btm_PublishedToast_View", (TrackChannel[]) null, new Function1() { // from class: o.twt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return C47793twn.EZpvd(this.OLrzqt, str2, list, contentTags, stateListAnimator2, abstractC43419rot, (EventParamsList) obj2);
            }
        }, i, (java.lang.Object) null);
        return abstractC43419rot;
    }

    public static final Unit KWHzl(C47793twn c47793twn, java.lang.String str, java.util.List list, ContentTags contentTags, C47546tsE.StateListAnimator stateListAnimator, ActivityCardPublish activityCardPublish, EventParamsList eventParamsList) {
        tWV twvAEQbTJ;
        java.util.Map<java.lang.String, C46511tXa> mapOLrzqt;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        PlanetPublisherChannelId planetPublisherChannelIdAubY = c47793twn.AubY();
        int length = str.length();
        int size = list.size();
        int size2 = contentTags.OLrzqt().size();
        int size3 = contentTags.KWHzl().size();
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(contentTags.OLrzqt(), ",", null, null, 0, null, new Function1() { // from class: o.tws
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47793twn.OLrzqt((HashTag) obj);
            }
        }, 30, null);
        java.lang.String strJoinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(contentTags.KWHzl(), ",", null, null, 0, null, new Function1() { // from class: o.twu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47793twn.KWHzl((CashTag) obj);
            }
        }, 30, null);
        java.util.Map<java.lang.String, java.lang.String> mapOLrzqt2 = C47727tva.EZpvd.OLrzqt(stateListAnimator != null ? stateListAnimator.KWHzl() : null);
        DraftDataInfo draftDataInfo = c47793twn.gasjUx;
        EventParamsList.put$default(eventParamsList, "is_draft", C33129mqd.OLrzqt((java.lang.CharSequence) (draftDataInfo != null ? draftDataInfo.getDraftId() : null)) ? "yes" : "no", false, 4, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (HashTag hashTag : contentTags.OLrzqt()) {
            java.lang.Integer numGEmmrt = hashTag.gEmmrt();
            if (numGEmmrt != null && numGEmmrt.intValue() == 1) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) hashTag.EZpvd())) {
                    java.lang.String strEZpvd = hashTag.EZpvd();
                    if (strEZpvd == null) {
                        strEZpvd = "";
                    }
                    arrayList.add(strEZpvd);
                }
                if (C33129mqd.OLrzqt((java.lang.CharSequence) hashTag.copydefault())) {
                    java.lang.String strCopydefault = hashTag.copydefault();
                    if (strCopydefault == null) {
                        strCopydefault = "";
                    }
                    arrayList.add(strCopydefault);
                }
            }
        }
        if (activityCardPublish != null) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) activityCardPublish.djBIcL())) {
                arrayList.add(activityCardPublish.djBIcL());
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) activityCardPublish.AEQbTJ())) {
                arrayList.add(activityCardPublish.AEQbTJ());
            }
        }
        EventParamsList.put$default(eventParamsList, "link", arrayList.toString(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_page", planetPublisherChannelIdAubY.getFromPage(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", planetPublisherChannelIdAubY.getTab(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "compose_type", "tweet", false, 4, null);
        EventParamsList.put$default(eventParamsList, "content_length", java.lang.String.valueOf(length), false, 4, null);
        EventParamsList.put$default(eventParamsList, "image_count", java.lang.String.valueOf(size), false, 4, null);
        EventParamsList.put$default(eventParamsList, "topic_count", java.lang.String.valueOf(size2), false, 4, null);
        EventParamsList.put$default(eventParamsList, "topic_name", strJoinToString$default, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_count", java.lang.String.valueOf(size3), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_name", strJoinToString$default2, false, 4, null);
        for (Map.Entry<java.lang.String, java.lang.String> entry : mapOLrzqt2.entrySet()) {
            eventParamsList.put(entry.getKey(), entry.getValue(), true);
        }
        if (stateListAnimator != null && (twvAEQbTJ = stateListAnimator.AEQbTJ()) != null && (mapOLrzqt = twvAEQbTJ.OLrzqt()) != null) {
            for (Map.Entry<java.lang.String, C46511tXa> entry2 : mapOLrzqt.entrySet()) {
                EventParamsList.put$default(eventParamsList, entry2.getKey(), entry2.getValue().KWHzl(), false, 4, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.CharSequence OLrzqt(HashTag hashTag) {
        Intrinsics.checkNotNullParameter(hashTag, "");
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) hashTag.valueOf()).toString();
    }

    public static final java.lang.CharSequence KWHzl(CashTag cashTag) {
        Intrinsics.checkNotNullParameter(cashTag, "");
        return StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) cashTag.KWHzl()).toString();
    }

    public static final Unit EZpvd(C47793twn c47793twn, java.lang.String str, java.util.List list, ContentTags contentTags, C47546tsE.StateListAnimator stateListAnimator, AbstractC43419rot abstractC43419rot, EventParamsList eventParamsList) {
        tWV twvAEQbTJ;
        java.util.Map<java.lang.String, C46511tXa> mapOLrzqt;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        PlanetPublisherChannelId planetPublisherChannelIdAubY = c47793twn.AubY();
        int length = str.length();
        int size = list.size();
        int size2 = contentTags.OLrzqt().size();
        int size3 = contentTags.KWHzl().size();
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(contentTags.OLrzqt(), ",", null, null, 0, null, new Function1() { // from class: o.twp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47793twn.AEQbTJ((HashTag) obj);
            }
        }, 30, null);
        java.lang.String strJoinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(contentTags.KWHzl(), ",", null, null, 0, null, new Function1() { // from class: o.twq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C47793twn.OLrzqt((CashTag) obj);
            }
        }, 30, null);
        java.util.Map<java.lang.String, java.lang.String> mapOLrzqt2 = C47727tva.EZpvd.OLrzqt(stateListAnimator != null ? stateListAnimator.KWHzl() : null);
        EventParamsList.put$default(eventParamsList, "state", abstractC43419rot.EZpvd() ? "pass" : "fail", false, 4, null);
        EventParamsList.put$default(eventParamsList, "from_page", planetPublisherChannelIdAubY.getFromPage(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "tab", planetPublisherChannelIdAubY.getTab(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "compose_type", "tweet", false, 4, null);
        EventParamsList.put$default(eventParamsList, "content_length", java.lang.String.valueOf(length), false, 4, null);
        EventParamsList.put$default(eventParamsList, "image_count", java.lang.String.valueOf(size), false, 4, null);
        EventParamsList.put$default(eventParamsList, "topic_count", java.lang.String.valueOf(size2), false, 4, null);
        EventParamsList.put$default(eventParamsList, "topic_name", strJoinToString$default, false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_count", java.lang.String.valueOf(size3), false, 4, null);
        EventParamsList.put$default(eventParamsList, "token_name", strJoinToString$default2, false, 4, null);
        for (Map.Entry<java.lang.String, java.lang.String> entry : mapOLrzqt2.entrySet()) {
            eventParamsList.put(entry.getKey(), entry.getValue(), true);
        }
        if (stateListAnimator != null && (twvAEQbTJ = stateListAnimator.AEQbTJ()) != null && (mapOLrzqt = twvAEQbTJ.OLrzqt()) != null) {
            for (Map.Entry<java.lang.String, C46511tXa> entry2 : mapOLrzqt.entrySet()) {
                EventParamsList.put$default(eventParamsList, entry2.getKey(), entry2.getValue().KWHzl(), false, 4, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final java.lang.CharSequence AEQbTJ(HashTag hashTag) {
        Intrinsics.checkNotNullParameter(hashTag, "");
        return hashTag.valueOf();
    }

    public static final java.lang.CharSequence OLrzqt(CashTag cashTag) {
        Intrinsics.checkNotNullParameter(cashTag, "");
        return cashTag.KWHzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull C47625tte c47625tte, C47546tsE.StateListAnimator stateListAnimator, @NotNull Continuation<? super AbstractC43419rot<SaveDraftResponse, OKServerException>> continuation) throws java.lang.Throwable {
        PlanetPublisherViewModel$saveDraft$1 planetPublisherViewModel$saveDraft$1;
        java.util.List<com.okinc.planet.domain.remote.dto.PluginData> listAhwBna;
        if (continuation instanceof PlanetPublisherViewModel$saveDraft$1) {
            planetPublisherViewModel$saveDraft$1 = (PlanetPublisherViewModel$saveDraft$1) continuation;
            int i = planetPublisherViewModel$saveDraft$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetPublisherViewModel$saveDraft$1.label = i - Integer.MIN_VALUE;
            } else {
                planetPublisherViewModel$saveDraft$1 = new PlanetPublisherViewModel$saveDraft$1(this, continuation);
            }
        }
        PlanetPublisherViewModel$saveDraft$1 planetPublisherViewModel$saveDraft$12 = planetPublisherViewModel$saveDraft$1;
        java.lang.Object objEZpvd = planetPublisherViewModel$saveDraft$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetPublisherViewModel$saveDraft$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            ContentTags contentTagsAEQbTJ = tQN.EZpvd.AEQbTJ(c47625tte, c47625tte.valueOf(), this.fvQaOB);
            java.util.List<ImageItem> value = fIwbmz().getValue();
            if (stateListAnimator == null || (listAhwBna = C56402yEa.EZpvd(new com.okinc.planet.domain.remote.dto.PluginData(stateListAnimator.KWHzl().getValue(), stateListAnimator.AEQbTJ().AEQbTJ(), stateListAnimator.AEQbTJ().copydefault(), stateListAnimator.AEQbTJ().KWHzl()))) == null) {
                listAhwBna = yDY.AhwBna();
            }
            java.util.List<com.okinc.planet.domain.remote.dto.PluginData> list = listAhwBna;
            C46364tRp c46364tRp = this.iZzfmt;
            DraftDataInfo draftDataInfo = this.gasjUx;
            java.lang.String draftId = draftDataInfo != null ? draftDataInfo.getDraftId() : null;
            ActivityCardPublish activityCardPublishEjfBZ = ejfBZ();
            PlanetPublisherChannelId planetPublisherChannelIdAubY = AubY();
            java.util.Map<java.lang.String, java.lang.String> mapWlaJM = wlaJM();
            planetPublisherViewModel$saveDraft$12.label = 1;
            objEZpvd = c46364tRp.EZpvd(draftId, str, value, list, contentTagsAEQbTJ, activityCardPublishEjfBZ, planetPublisherChannelIdAubY, mapWlaJM, planetPublisherViewModel$saveDraft$12);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objEZpvd);
        }
        return (AbstractC43419rot) objEZpvd;
    }

    public final ActivityCardPublish ejfBZ() {
        if (!this.gHZMYf.getValue().values()) {
            return null;
        }
        java.lang.String strOLrzqt = this.gHZMYf.getValue().OLrzqt();
        java.lang.String strKWHzl = this.gHZMYf.getValue().KWHzl();
        int iGEmmrt = this.gHZMYf.getValue().gEmmrt();
        return new ActivityCardPublish(strOLrzqt, strKWHzl, java.lang.Integer.valueOf(iGEmmrt), this.gHZMYf.getValue().AYXKKw(), this.gHZMYf.getValue().copydefault(), this.gHZMYf.getValue().AhwBna(), this.gHZMYf.getValue().djBIcL(), this.gHZMYf.getValue().EZpvd(), this.gHZMYf.getValue().valueOf());
    }
}
