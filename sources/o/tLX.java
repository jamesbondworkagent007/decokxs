package o;

import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.im.bean.IMCacheStrategy;
import com.okinc.im.bean.IMRelationInfo;
import com.okinc.im.bean.RelationModel;
import com.okinc.planet.biz_notifications.model.FollowStatusV2Enum;
import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.biz_userprofile.data.PlanetTradeTypes;
import com.okinc.planet.biz_userprofile.data.PlanetUid;
import com.okinc.planet.biz_userprofile.data.PlanetUniqueName;
import com.okinc.planet.biz_userprofile.viewmodel.PlanetUserProfileViewModel$1;
import com.okinc.planet.biz_userprofile.viewmodel.PlanetUserProfileViewModel$loadBasicUserInfo$1;
import com.okinc.planet.biz_userprofile.viewmodel.PlanetUserProfileViewModel$loadIMAliasData$1;
import com.okinc.planet.biz_userprofile.viewmodel.PlanetUserProfileViewModel$registerContentMinLuaEvent$1$call$1;
import com.okinc.planet.biz_userprofile.viewmodel.PlanetUserProfileViewModel$special$$inlined$map$1$2$1;
import com.okinc.planet.biz_userprofile.viewmodel.PlanetUserProfileViewModel$toggleFollowState$1;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.planet.utils.IMUtils;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC46197tLk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tLX extends AbstractC33073mpa {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final java.lang.String AEQbTJ;
    public final C46203tLq AYXKKw;
    public final Flow<PlanetTradeTypes> AhwBna;
    public final StateFlow<AbstractC46197tLk<C46189tLc>> AkhnZx;
    public final java.util.ArrayList<InterfaceC46198tLl> AuCTel;
    public final tKU DbNXlk;
    public final MutableStateFlow<java.util.List<InterfaceC46198tLl>> EZpvd;
    public final MutableSharedFlow<Application> KWHzl;
    public final MutableStateFlow<AbstractC46197tLk<C46189tLc>> copydefault;
    public final CoroutineDispatcher djBIcL;
    public final InterfaceC56387yDm ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final SavedStateHandle fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public final InterfaceC46387tSl fetchVPNInfo;
    public final CoroutineDispatcher gEmmrt;
    public final SharedFlow<Application> getFieldNames;
    public final StateFlow<java.util.List<InterfaceC46198tLl>> getNewProxyInstance;
    public final java.lang.String hDKMBd;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm iwGUEr;
    public final java.lang.String uzCIH;
    public boolean valueOf;
    public final tQV values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.valueOf = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<InterfaceC46198tLl> AYXKKw() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AkhnZx() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Flow<PlanetTradeTypes> KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC46197tLk<C46189tLc>> OLrzqt() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Application> isConnected() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<InterfaceC46198tLl>> valueOf() {
        return this.getNewProxyInstance;
    }

    public static final class PendingIntent implements Flow<PlanetTradeTypes> {
        public final /* synthetic */ tLX KWHzl;
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.tLX$PendingIntent$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ tLX EZpvd;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, tLX tlx) {
                this.copydefault = flowCollector;
                this.EZpvd = tlx;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                PlanetUserProfileViewModel$special$$inlined$map$1$2$1 planetUserProfileViewModel$special$$inlined$map$1$2$1;
                if (continuation instanceof PlanetUserProfileViewModel$special$$inlined$map$1$2$1) {
                    planetUserProfileViewModel$special$$inlined$map$1$2$1 = (PlanetUserProfileViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = planetUserProfileViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        planetUserProfileViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        planetUserProfileViewModel$special$$inlined$map$1$2$1 = new PlanetUserProfileViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = planetUserProfileViewModel$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = planetUserProfileViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    PlanetBasicUserInfoResp planetBasicUserInfoResp = (PlanetBasicUserInfoResp) obj;
                    PlanetTradeTypes planetTradeTypesDjBIcL = null;
                    java.util.List<PlanetTradeTypes> listAEQbTJ = planetBasicUserInfoResp != null ? planetBasicUserInfoResp.AEQbTJ() : null;
                    if (listAEQbTJ != null && CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends PlanetTradeTypes>) ((java.lang.Iterable<? extends java.lang.Object>) listAEQbTJ), this.EZpvd.djBIcL())) {
                        planetTradeTypesDjBIcL = this.EZpvd.djBIcL();
                    } else if (listAEQbTJ != null) {
                        planetTradeTypesDjBIcL = (PlanetTradeTypes) CollectionsKt___CollectionsKt.firstOrNull(listAEQbTJ);
                    }
                    planetUserProfileViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(planetTradeTypesDjBIcL, planetUserProfileViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public PendingIntent(Flow flow, tLX tlx) {
            this.OLrzqt = flow;
            this.KWHzl = tlx;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super PlanetTradeTypes> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004c: CONSTRUCTOR 
  (r7v0 androidx.lifecycle.SavedStateHandle)
  (wrap:o.tSl:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:60) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.alsFma():o.tSm A[MD:():o.tSm (m), WRAPPED] (LINE:60)) : (r8v0 o.tSl))
  (wrap:o.tQV:?: TERNARY null = ((wrap:int:0x000c: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: INVOKE (wrap:o.tPF:0x0010: SGET  A[WRAPPED] (LINE:61) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.UscePu():o.tQV A[MD:():o.tQV (m), WRAPPED] (LINE:61)) : (r9v0 o.tQV))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0018: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001c: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getIO():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:62)) : (r10v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0022: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0026: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:63)) : (r11v0 kotlinx.coroutines.CoroutineDispatcher))
  (wrap:o.tKU:?: TERNARY null = ((wrap:int:0x002c: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0032: INVOKE (wrap:o.tPF:0x0030: SGET  A[WRAPPED] (LINE:64) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.fXHmeK():o.tKU A[MD:():o.tKU (m), WRAPPED] (LINE:64)) : (r12v0 o.tKU))
  (wrap:o.tLq:?: TERNARY null = ((wrap:int:0x0038: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003e: INVOKE (wrap:o.tPF:0x003c: SGET  A[WRAPPED] (LINE:65) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.UrRBLY():o.tLq A[MD:():o.tLq (m), WRAPPED] (LINE:65)) : (r13v0 o.tLq))
 A[MD:(androidx.lifecycle.SavedStateHandle, o.tSl, o.tQV, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, o.tKU, o.tLq):void (m)] (LINE:58) call: o.tLX.<init>(androidx.lifecycle.SavedStateHandle, o.tSl, o.tQV, kotlinx.coroutines.CoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher, o.tKU, o.tLq):void type: THIS */
    public /* synthetic */ tLX(SavedStateHandle savedStateHandle, InterfaceC46387tSl interfaceC46387tSl, tQV tqv, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, tKU tku, C46203tLq c46203tLq, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateHandle, (i & 2) != 0 ? tPF.copydefault.alsFma() : interfaceC46387tSl, (i & 4) != 0 ? tPF.copydefault.UscePu() : tqv, (i & 8) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i & 16) != 0 ? Dispatchers.getDefault() : coroutineDispatcher2, (i & 32) != 0 ? tPF.copydefault.fXHmeK() : tku, (i & 64) != 0 ? tPF.copydefault.UrRBLY() : c46203tLq);
    }

    public tLX(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC46387tSl interfaceC46387tSl, @NotNull tQV tqv, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull CoroutineDispatcher coroutineDispatcher2, @NotNull tKU tku, @NotNull C46203tLq c46203tLq) {
        java.lang.String strDjBIcL;
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(interfaceC46387tSl, "");
        Intrinsics.checkNotNullParameter(tqv, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher2, "");
        Intrinsics.checkNotNullParameter(tku, "");
        Intrinsics.checkNotNullParameter(c46203tLq, "");
        this.fIwbmz = savedStateHandle;
        this.fetchVPNInfo = interfaceC46387tSl;
        this.values = tqv;
        this.djBIcL = coroutineDispatcher;
        this.gEmmrt = coroutineDispatcher2;
        this.DbNXlk = tku;
        this.AYXKKw = c46203tLq;
        PlanetUniqueName planetUniqueName = (PlanetUniqueName) savedStateHandle.get(PlanetUniqueName.Key);
        java.lang.String strEZpvd = planetUniqueName != null ? planetUniqueName.EZpvd() : null;
        this.uzCIH = strEZpvd == null ? PlanetUniqueName.Companion.AEQbTJ() : strEZpvd;
        PlanetUid planetUid = (PlanetUid) savedStateHandle.get(PlanetUid.Key);
        java.lang.String strCopydefault = planetUid != null ? planetUid.copydefault() : null;
        this.hDKMBd = strCopydefault == null ? PlanetUid.Companion.copydefault() : strCopydefault;
        PlanetAuthorId planetAuthorId = (PlanetAuthorId) savedStateHandle.get(PlanetAuthorId.Key);
        java.lang.String strCopydefault2 = planetAuthorId != null ? planetAuthorId.copydefault() : null;
        this.AEQbTJ = strCopydefault2 == null ? PlanetAuthorId.Companion.OLrzqt() : strCopydefault2;
        MutableStateFlow<AbstractC46197tLk<C46189tLc>> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC46197tLk.TaskDescription.loading$default(AbstractC46197tLk.Companion, false, 1, null));
        this.copydefault = MutableStateFlow;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<java.util.List<InterfaceC46198tLl>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.EZpvd = MutableStateFlow2;
        this.getNewProxyInstance = FlowKt.asStateFlow(MutableStateFlow2);
        this.AuCTel = new java.util.ArrayList<>();
        MutableSharedFlow<Application> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.getFieldNames = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        this.fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.tLW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tLX.DbNXlk(this.copydefault);
            }
        });
        this.fARcdN = C56392yDr.copydefault(new TaskDescription());
        this.ejfBZ = C56392yDr.copydefault(new StateListAnimator());
        this.isConnected = C56392yDr.copydefault(new Activity());
        this.iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.tMa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return tLX.ejfBZ(this.AEQbTJ);
            }
        });
        pUU.EZpvd("PlanetUserProfileViewModel", "init");
        fIwbmz();
        if (interfaceC46387tSl.gEmmrt() && ((strDjBIcL = interfaceC46387tSl.djBIcL()) == null || strDjBIcL.length() == 0)) {
            pUU.EZpvd("zhoulijuan", "PlanetUserProfileViewModel refesh");
            C46374tRz.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetUserProfileViewModel$1(this, null), 3, null);
        }
        DbNXlk();
        this.AhwBna = new PendingIntent(tku.EZpvd(), this);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tLX.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final C46189tLc AEQbTJ() {
        return this.copydefault.getValue().OLrzqt();
    }

    public static final java.lang.String DbNXlk(tLX tlx) {
        return tlx.fetchVPNInfo.copydefault();
    }

    public static final class TaskDescription implements Function0<PlanetUid> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ PlanetUid invoke() {
            return PlanetUid.KWHzl(AEQbTJ());
        }

        public final java.lang.String AEQbTJ() {
            return tLX.this.DbNXlk.AYXKKw();
        }
    }

    public final java.lang.String gEmmrt() {
        return ((PlanetUid) this.fARcdN.getValue()).copydefault();
    }

    public static final class StateListAnimator implements Function0<PlanetUniqueName> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ PlanetUniqueName invoke() {
            return PlanetUniqueName.EZpvd(EZpvd());
        }

        public final java.lang.String EZpvd() {
            return tLX.this.DbNXlk.djBIcL();
        }
    }

    public final java.lang.String AhwBna() {
        return ((PlanetUniqueName) this.ejfBZ.getValue()).EZpvd();
    }

    public static final class Activity implements Function0<PlanetAuthorId> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ PlanetAuthorId invoke() {
            return PlanetAuthorId.OLrzqt(AEQbTJ());
        }

        public final java.lang.String AEQbTJ() {
            return tLX.this.DbNXlk.OLrzqt();
        }
    }

    public final java.lang.String copydefault() {
        return ((PlanetAuthorId) this.isConnected.getValue()).copydefault();
    }

    public final PlanetTradeTypes djBIcL() {
        return (PlanetTradeTypes) this.iwGUEr.getValue();
    }

    public static final PlanetTradeTypes ejfBZ(tLX tlx) {
        return (PlanetTradeTypes) tlx.fIwbmz.get(PlanetTradeTypes.Key);
    }

    public final boolean values() {
        return (this.uzCIH.length() == 0 && this.AEQbTJ.length() == 0 && this.hDKMBd.length() == 0) || this.DbNXlk.valueOf();
    }

    public final java.lang.String EZpvd() {
        return C33129mqd.gEmmrt(this.DbNXlk.copydefault());
    }

    public final java.lang.Boolean fetchVPNInfo() {
        C46189tLc c46189tLcAEQbTJ = AEQbTJ();
        if (c46189tLcAEQbTJ == null) {
            return null;
        }
        return c46189tLcAEQbTJ.EZpvd().gEmmrt().AYXKKw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC7298ahG AuCTel() {
        return C7323ahf.KWHzl();
    }

    private final void fIwbmz() {
        InterfaceC7298ahG interfaceC7298ahGAuCTel = AuCTel();
        if (interfaceC7298ahGAuCTel != null) {
            interfaceC7298ahGAuCTel.EZpvd("follow_button_update_status_listener", new Fragment(), "follow_button_update_status_listener");
        }
    }

    public static final class Fragment implements InterfaceC7835arN {
        @Override // o.InterfaceC8024aus
        public void OLrzqt() {
        }

        public Fragment() {
        }

        @Override // o.InterfaceC7835arN
        public boolean EZpvd(java.lang.Object... objArr) {
            Intrinsics.checkNotNullParameter(objArr, "");
            if (!(objArr.length == 0)) {
                java.lang.Object obj = objArr[0];
                if (obj instanceof java.util.Map) {
                    Intrinsics.copydefault(obj, "");
                    java.util.Map map = (java.util.Map) obj;
                    java.lang.Object obj2 = map.get("authorId");
                    java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
                    java.lang.Object obj3 = map.get("isFollowing");
                    java.lang.Boolean bool = obj3 instanceof java.lang.Boolean ? (java.lang.Boolean) obj3 : null;
                    java.lang.Object obj4 = map.get("followStatusV2");
                    java.lang.String str2 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
                    if (str != null && bool != null && Intrinsics.EZpvd((java.lang.Object) tLX.this.copydefault(), (java.lang.Object) str)) {
                        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(tLX.this), tLX.this.gEmmrt, null, new PlanetUserProfileViewModel$registerContentMinLuaEvent$1$call$1(tLX.this, bool, str2, null), 2, null);
                    }
                }
            }
            return true;
        }
    }

    public final void fARcdN() {
        if (this.copydefault.getValue() instanceof AbstractC46197tLk.StateListAnimator) {
            return;
        }
        DbNXlk();
    }

    public final void DbNXlk() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.gEmmrt, null, new PlanetUserProfileViewModel$loadBasicUserInfo$1(this, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(PlanetBasicUserInfoResp planetBasicUserInfoResp, Continuation<? super java.lang.String> continuation) throws java.lang.Throwable {
        PlanetUserProfileViewModel$loadIMAliasData$1 planetUserProfileViewModel$loadIMAliasData$1;
        java.util.List list;
        java.lang.String displayName;
        IMRelationInfo iMRelationInfo;
        if (continuation instanceof PlanetUserProfileViewModel$loadIMAliasData$1) {
            planetUserProfileViewModel$loadIMAliasData$1 = (PlanetUserProfileViewModel$loadIMAliasData$1) continuation;
            int i = planetUserProfileViewModel$loadIMAliasData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetUserProfileViewModel$loadIMAliasData$1.label = i - Integer.MIN_VALUE;
            } else {
                planetUserProfileViewModel$loadIMAliasData$1 = new PlanetUserProfileViewModel$loadIMAliasData$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = planetUserProfileViewModel$loadIMAliasData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetUserProfileViewModel$loadIMAliasData$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                InterfaceC35177nqR interfaceC35177nqR = (InterfaceC35177nqR) C43251rlk.OLrzqt(InterfaceC35177nqR.class);
                if (interfaceC35177nqR != null) {
                    java.util.List<RelationModel> listEZpvd = C56402yEa.EZpvd(new RelationModel(planetBasicUserInfoResp.QKVWgx(), planetBasicUserInfoResp.fJNWhG()));
                    IMCacheStrategy iMCacheStrategy = IMCacheStrategy.CacheFirst;
                    planetUserProfileViewModel$loadIMAliasData$1.L$0 = planetBasicUserInfoResp;
                    planetUserProfileViewModel$loadIMAliasData$1.label = 1;
                    objKWHzl = interfaceC35177nqR.KWHzl(listEZpvd, iMCacheStrategy, planetUserProfileViewModel$loadIMAliasData$1);
                    if (objKWHzl == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    list = null;
                    displayName = (list != null || (iMRelationInfo = (IMRelationInfo) CollectionsKt___CollectionsKt.firstOrNull(list)) == null) ? null : iMRelationInfo.getDisplayName();
                    if (Intrinsics.EZpvd((java.lang.Object) planetBasicUserInfoResp.fJNWhG(), (java.lang.Object) displayName)) {
                        return displayName;
                    }
                    return null;
                }
            } else {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                planetBasicUserInfoResp = (PlanetBasicUserInfoResp) planetUserProfileViewModel$loadIMAliasData$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            list = (java.util.List) objKWHzl;
            if (list != null) {
            }
            if (Intrinsics.EZpvd((java.lang.Object) planetBasicUserInfoResp.fJNWhG(), (java.lang.Object) displayName)) {
            }
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final void ejfBZ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new PlanetUserProfileViewModel$toggleFollowState$1(this, null), 3, null);
    }

    public final java.lang.Object copydefault(tLX tlx, final boolean z, final java.lang.String str, Continuation<? super Unit> continuation) {
        tRN.AEQbTJ(tlx.copydefault, new Function1() { // from class: o.tLZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return tLX.copydefault(str, z, (C46189tLc) obj);
            }
        });
        java.lang.Object objEmit = tlx.KWHzl.emit(new Application.ActionBar(z), continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    public static final C46189tLc copydefault(java.lang.String str, boolean z, C46189tLc c46189tLc) {
        java.lang.String strAkhnZx;
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(c46189tLc, "");
        PlanetBasicUserInfoResp planetBasicUserInfoRespEZpvd = c46189tLc.EZpvd();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            str2 = str;
        } else {
            FollowStatusV2Enum.Activity activity = FollowStatusV2Enum.Companion;
            if (z != activity.OLrzqt(c46189tLc.EZpvd().AkhnZx())) {
                FollowStatusV2Enum followStatusV2EnumCopydefault = activity.copydefault(c46189tLc.EZpvd().AkhnZx());
                strAkhnZx = followStatusV2EnumCopydefault != null ? followStatusV2EnumCopydefault.getStatus() : null;
            } else {
                strAkhnZx = c46189tLc.EZpvd().AkhnZx();
            }
            str2 = strAkhnZx;
        }
        java.lang.String strIsConnected = c46189tLc.EZpvd().isConnected();
        return C46189tLc.copy$default(c46189tLc, planetBasicUserInfoRespEZpvd.AEQbTJ(((-3145733) & 1) != 0 ? planetBasicUserInfoRespEZpvd.authorId : null, ((-3145733) & 2) != 0 ? planetBasicUserInfoRespEZpvd.bio : null, ((-3145733) & 4) != 0 ? planetBasicUserInfoRespEZpvd.followerCount : PlanetNumericString.AEQbTJ(z ? tRL.OLrzqt(strIsConnected) : tRL.KWHzl(strIsConnected)), ((-3145733) & 8) != 0 ? planetBasicUserInfoRespEZpvd.followeeCount : null, ((-3145733) & 16) != 0 ? planetBasicUserInfoRespEZpvd.twitterFollowerCount : null, ((-3145733) & 32) != 0 ? planetBasicUserInfoRespEZpvd.twitterFolloweeCount : null, ((-3145733) & 64) != 0 ? planetBasicUserInfoRespEZpvd.badgeList : null, ((-3145733) & 128) != 0 ? planetBasicUserInfoRespEZpvd.sourceUrl : null, ((-3145733) & 256) != 0 ? planetBasicUserInfoRespEZpvd.officialStatus : null, ((-3145733) & 512) != 0 ? planetBasicUserInfoRespEZpvd.userType : null, ((-3145733) & 1024) != 0 ? planetBasicUserInfoRespEZpvd.uid : null, ((-3145733) & 2048) != 0 ? planetBasicUserInfoRespEZpvd.countryId : null, ((-3145733) & 4096) != 0 ? planetBasicUserInfoRespEZpvd.nickName : null, ((-3145733) & 8192) != 0 ? planetBasicUserInfoRespEZpvd.enNickName : null, ((-3145733) & 16384) != 0 ? planetBasicUserInfoRespEZpvd.portrait : null, ((-3145733) & 32768) != 0 ? planetBasicUserInfoRespEZpvd.originalPortrait : null, ((-3145733) & 65536) != 0 ? planetBasicUserInfoRespEZpvd.roleType : null, ((-3145733) & 131072) != 0 ? planetBasicUserInfoRespEZpvd.targetId : null, ((-3145733) & 262144) != 0 ? planetBasicUserInfoRespEZpvd.uniqueName : null, ((-3145733) & 524288) != 0 ? planetBasicUserInfoRespEZpvd.publicStatus : null, ((-3145733) & 1048576) != 0 ? planetBasicUserInfoRespEZpvd.followStatus : z, ((-3145733) & 2097152) != 0 ? planetBasicUserInfoRespEZpvd.followStatusV2 : str2, ((-3145733) & 4194304) != 0 ? planetBasicUserInfoRespEZpvd.strategyRoleType : null, ((-3145733) & 8388608) != 0 ? planetBasicUserInfoRespEZpvd.signalRoleType : null, ((-3145733) & 16777216) != 0 ? planetBasicUserInfoRespEZpvd.spotTradingRoleType : null, ((-3145733) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? planetBasicUserInfoRespEZpvd.translatedBio : null, ((-3145733) & 67108864) != 0 ? planetBasicUserInfoRespEZpvd.tier : null, ((-3145733) & 134217728) != 0 ? planetBasicUserInfoRespEZpvd.countryName : null, ((-3145733) & 268435456) != 0 ? planetBasicUserInfoRespEZpvd.showCountryTag : false, ((-3145733) & 536870912) != 0 ? planetBasicUserInfoRespEZpvd.countryInfo : null, ((-3145733) & 1073741824) != 0 ? planetBasicUserInfoRespEZpvd.groupInfoList : null, ((-3145733) & Integer.MIN_VALUE) != 0 ? planetBasicUserInfoRespEZpvd.competitionUrl : null, (FrameMetricsAggregator.EVERY_DURATION & 1) != 0 ? planetBasicUserInfoRespEZpvd.orbitLevel : 0, (FrameMetricsAggregator.EVERY_DURATION & 2) != 0 ? planetBasicUserInfoRespEZpvd.orbiterPlusStatus : 0, (FrameMetricsAggregator.EVERY_DURATION & 4) != 0 ? planetBasicUserInfoRespEZpvd.twitterHandleName : null, (FrameMetricsAggregator.EVERY_DURATION & 8) != 0 ? planetBasicUserInfoRespEZpvd.curveStatTime : null, (FrameMetricsAggregator.EVERY_DURATION & 16) != 0 ? planetBasicUserInfoRespEZpvd.liveStatus : null, (FrameMetricsAggregator.EVERY_DURATION & 32) != 0 ? planetBasicUserInfoRespEZpvd.liveStreamTab : null, (FrameMetricsAggregator.EVERY_DURATION & 64) != 0 ? planetBasicUserInfoRespEZpvd.shareCode : null, (FrameMetricsAggregator.EVERY_DURATION & 128) != 0 ? planetBasicUserInfoRespEZpvd.metricCurve : null, (FrameMetricsAggregator.EVERY_DURATION & 256) != 0 ? planetBasicUserInfoRespEZpvd.copyTradingData : null), false, null, 6, null);
    }

    public final java.util.List<InterfaceC46198tLl> copydefault(C46189tLc c46189tLc) {
        C46199tLm c46199tLm = C46199tLm.KWHzl;
        boolean zValues = values();
        boolean zGEmmrt = this.fetchVPNInfo.gEmmrt();
        PlanetBasicUserInfoResp planetBasicUserInfoRespOLrzqt = this.fetchVPNInfo.OLrzqt();
        boolean z = planetBasicUserInfoRespOLrzqt != null && planetBasicUserInfoRespOLrzqt.djSkpj();
        PlanetBasicUserInfoResp planetBasicUserInfoRespOLrzqt2 = this.fetchVPNInfo.OLrzqt();
        java.util.List<InterfaceC46198tLl> listAEQbTJ = c46199tLm.AEQbTJ(c46189tLc, zGEmmrt, z, planetBasicUserInfoRespOLrzqt2 != null && planetBasicUserInfoRespOLrzqt2.aKErDB(), zValues, c46189tLc.isConnected(), Intrinsics.EZpvd((java.lang.Object) c46189tLc.EZpvd().fARcdN(), (java.lang.Object) "1") && IMUtils.KWHzl.KWHzl());
        this.EZpvd.setValue(listAEQbTJ);
        return listAEQbTJ;
    }

    public interface Application {

        public static final class StateListAnimator implements Application {
            public final java.lang.String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = stateListAnimator.EZpvd;
                }
                return stateListAnimator.EZpvd(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator EZpvd(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((StateListAnimator) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "ErrorToast(message=" + this.EZpvd + ")";
            }

            public StateListAnimator(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.EZpvd = str;
            }
        }

        public static final class ActionBar implements Application {
            public final boolean OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = actionBar.OLrzqt;
                }
                return actionBar.OLrzqt(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean EZpvd() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar OLrzqt(boolean z) {
                return new ActionBar(z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionBar) && this.OLrzqt == ((ActionBar) obj).OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return java.lang.Boolean.hashCode(this.OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "FollowedUser(hasFollowed=" + this.OLrzqt + ")";
            }

            public ActionBar(boolean z) {
                this.OLrzqt = z;
            }
        }

        /* JADX INFO: loaded from: classes16.dex */
        public static final class Activity implements Application {
            public final java.lang.String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activity.OLrzqt;
                }
                return activity.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity AEQbTJ(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((Activity) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "NavigateToCompleteBio(message=" + this.OLrzqt + ")";
            }

            public Activity(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }
        }
    }
}
