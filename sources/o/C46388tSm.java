package o;

import com.okinc.okuser.data.User;
import com.okinc.okuser.data.UserInfo;
import com.okinc.okuser.data.UserProfile;
import com.okinc.planet.biz_onboarding.data.OrbitBeanResp;
import com.okinc.planet.biz_userprofile.data.PlanetBasicUserInfoResp;
import com.okinc.planet.domain.remote.dto.PublishPermissionResp;
import com.okinc.planet.manager.OrbitStatus;
import com.okinc.planet.manager.PlanetAccountUserManager$1$onLogin$1;
import com.okinc.planet.manager.PlanetAccountUserManager$2;
import com.okinc.planet.manager.PlanetAccountUserManager$getOrbitDataResp$1;
import com.okinc.planet.manager.PlanetAccountUserManager$getPublishPermissionResp$1;
import com.okinc.planet.manager.PlanetAccountUserManager$loadCachedData$2;
import com.okinc.planet.manager.PlanetAccountUserManager$refreshOrbit$1;
import com.okinc.planet.manager.PlanetAccountUserManager$refreshOrbitInfo$1;
import com.okinc.planet.manager.PlanetAccountUserManager$refreshPublish$1;
import com.okinc.planet.manager.PlanetAccountUserManager$refreshPublishPermission$1;
import com.okinc.planet.manager.PlanetAccountUserManager$refreshSelf$1;
import com.okinc.planet.manager.PlanetAccountUserManager$refreshSelfUserInfo$1;
import com.okinc.planet.manager.PlanetAccountUserManager$triggerSelfUserInfoRefreshIfNeeded$1;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.AbstractC46197tLk;
import o.C46195tLi;
import o.tQR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tSm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46388tSm implements InterfaceC46387tSl {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final MutableStateFlow<PlanetBasicUserInfoResp> AEQbTJ;
    public final C46195tLi AYXKKw;
    public final CoroutineScope AhwBna;
    public final StateFlow<OrbitBeanResp> AkhnZx;
    public final StateFlow<PlanetBasicUserInfoResp> AuCTel;
    public final Mutex DbNXlk;
    public final MutableStateFlow<AbstractC46197tLk<C46189tLc>> EZpvd;
    public final MutableStateFlow<OrbitBeanResp> OLrzqt;
    public final MutableStateFlow<PublishPermissionResp> copydefault;
    public final CoroutineDispatcher djBIcL;
    public final StateFlow<AbstractC46197tLk<C46189tLc>> ejfBZ;
    public final Mutex fARcdN;
    public int fIwbmz;
    public final StateFlow<PublishPermissionResp> fJNWhG;
    public boolean fetchVPNInfo;
    public final tAC gEmmrt;
    public final tQR isConnected;
    public final InterfaceC47278tmy uzCIH;
    public boolean valueOf;
    public final Mutex values;

    @Override // o.InterfaceC46387tSl
    public boolean AEQbTJ() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StateFlow<PlanetBasicUserInfoResp> fIwbmz() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fetchVPNInfo() {
        return this.fIwbmz;
    }

    public C46388tSm(@NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull C46385tSj c46385tSj, @NotNull C46195tLi c46195tLi, @NotNull tAC tac, @NotNull tQR tqr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(c46385tSj, "");
        Intrinsics.checkNotNullParameter(c46195tLi, "");
        Intrinsics.checkNotNullParameter(tac, "");
        Intrinsics.checkNotNullParameter(tqr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.uzCIH = interfaceC47278tmy;
        this.AYXKKw = c46195tLi;
        this.gEmmrt = tac;
        this.isConnected = tqr;
        this.djBIcL = coroutineDispatcher;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getMain()));
        this.AhwBna = CoroutineScope;
        this.values = MutexKt.Mutex$default(false, 1, null);
        this.DbNXlk = MutexKt.Mutex$default(false, 1, null);
        this.fARcdN = MutexKt.Mutex$default(false, 1, null);
        MutableStateFlow<PlanetBasicUserInfoResp> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.AuCTel = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<AbstractC46197tLk<C46189tLc>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(AbstractC46197tLk.Companion.OLrzqt(true));
        this.EZpvd = MutableStateFlow2;
        this.ejfBZ = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<OrbitBeanResp> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.OLrzqt = MutableStateFlow3;
        this.AkhnZx = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<PublishPermissionResp> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow4;
        this.fJNWhG = FlowKt.asStateFlow(MutableStateFlow4);
        c46385tSj.AEQbTJ(this);
        c46385tSj.AEQbTJ(new InterfaceC46389tSn() { // from class: o.tSm.4
            @Override // o.InterfaceC46389tSn
            public void copydefault(boolean z) {
                pUU.KWHzl("PlanetAccountUserManager", "executeOnChangingMode isLite: " + z);
                if (z == C46219tMf.Companion.copydefault().EZpvd()) {
                    return;
                }
                C46388tSm.this.getNewProxyInstance();
                C46388tSm.this.iwGUEr();
                C46388tSm.this.fJNWhG();
                C46388tSm.this.getFieldNames();
                C46388tSm.this.fIwbmz = C46388tSm.this.fetchVPNInfo() + 1;
            }

            @Override // o.InterfaceC46389tSn
            public void copydefault(C47265tml c47265tml) {
                pUU.EZpvd("PlanetAccountUserManager", "SwitchTradingModeEvent " + c47265tml);
                C46388tSm.this.getNewProxyInstance();
                C46388tSm.this.iwGUEr();
                C46388tSm.this.fJNWhG();
                C46388tSm.this.getFieldNames();
                C46388tSm.this.fIwbmz = C46388tSm.this.fetchVPNInfo() + 1;
            }

            @Override // o.InterfaceC46389tSn
            public void AEQbTJ() {
                pUU.EZpvd("PlanetAccountUserManager", "onLoginChange");
                C46388tSm.this.getNewProxyInstance();
                BuildersKt__Builders_commonKt.launch$default(C46388tSm.this.AhwBna, C46388tSm.this.djBIcL, null, new PlanetAccountUserManager$1$onLogin$1(C46388tSm.this, null), 2, null);
                C46388tSm.this.iwGUEr();
                C46388tSm.this.fJNWhG();
                C46388tSm.this.getFieldNames();
                C46388tSm.this.fIwbmz = C46388tSm.this.fetchVPNInfo() + 1;
            }

            @Override // o.InterfaceC46389tSn
            public void OLrzqt() {
                pUU.EZpvd("PlanetAccountUserManager", "onLogout");
                C46388tSm.this.getNewProxyInstance();
                C46388tSm.this.fIwbmz = C46388tSm.this.fetchVPNInfo() + 1;
                C46388tSm.this.EZpvd.setValue(AbstractC46197tLk.Companion.OLrzqt(new java.lang.Throwable("LOG_OUT")));
            }
        });
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, coroutineDispatcher, null, new PlanetAccountUserManager$2(this, null), 2, null);
    }

    /* JADX INFO: renamed from: o.tSm$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tSm.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C46388tSm KWHzl() {
            C46388tSm c46388tSmAlsFma;
            synchronized (this) {
                c46388tSmAlsFma = tPF.copydefault.alsFma();
            }
            return c46388tSmAlsFma;
        }
    }

    @Override // o.InterfaceC46387tSl
    public PlanetBasicUserInfoResp OLrzqt() {
        return this.AEQbTJ.getValue();
    }

    public C46189tLc AuCTel() {
        return this.EZpvd.getValue().OLrzqt();
    }

    public OrbitBeanResp values() {
        OrbitBeanResp value = this.OLrzqt.getValue();
        pUU.EZpvd("PlanetAccountUserManager", "getOrbitDataResp currentValue=" + value + ", isLocked=" + this.DbNXlk.isLocked() + ", isRefreshed=" + this.valueOf);
        if (!this.DbNXlk.isLocked() && !AYXKKw() && !this.valueOf) {
            pUU.EZpvd("PlanetAccountUserManager", "getOrbitDataResp: triggering refresh");
            BuildersKt__Builders_commonKt.launch$default(this.AhwBna, this.djBIcL, null, new PlanetAccountUserManager$getOrbitDataResp$1(this, null), 2, null);
        }
        return value;
    }

    @Override // o.InterfaceC46387tSl
    public OrbitBeanResp EZpvd() {
        return this.OLrzqt.getValue();
    }

    @Override // o.InterfaceC46387tSl
    public PublishPermissionResp KWHzl() {
        PublishPermissionResp value = this.copydefault.getValue();
        pUU.EZpvd("PlanetAccountUserManager", "getPublishPermissionResp currentValue=" + value + ", isLocked=" + this.fARcdN.isLocked());
        if (!this.fARcdN.isLocked() && !AYXKKw()) {
            pUU.EZpvd("PlanetAccountUserManager", "getPublishPermissionResp: triggering refresh");
            BuildersKt__Builders_commonKt.launch$default(this.AhwBna, this.djBIcL, null, new PlanetAccountUserManager$getPublishPermissionResp$1(this, null), 2, null);
        }
        pUU.EZpvd("PlanetAccountUserManager", "getPublishPermissionResp return=" + value);
        return value;
    }

    @Override // o.InterfaceC46387tSl
    public java.lang.String copydefault() {
        User userOLrzqt;
        if (!gEmmrt() || (userOLrzqt = this.uzCIH.OLrzqt()) == null) {
            return null;
        }
        return userOLrzqt.getUid();
    }

    public java.lang.String isConnected() {
        UserProfile profile;
        UserProfile.AvatarInfo avatarInfo;
        User userOLrzqt = this.uzCIH.OLrzqt();
        if (userOLrzqt == null || (profile = userOLrzqt.getProfile()) == null || (avatarInfo = profile.getAvatarInfo()) == null) {
            return null;
        }
        return avatarInfo.getAvatar();
    }

    @Override // o.InterfaceC46387tSl
    public java.lang.String djBIcL() {
        PlanetBasicUserInfoResp value = this.AEQbTJ.getValue();
        if (value != null) {
            return value.QKVWgx();
        }
        return null;
    }

    @Override // o.InterfaceC46387tSl
    public Flow<AbstractC47263tmj> AkhnZx() {
        return this.uzCIH.fIwbmz();
    }

    @Override // o.InterfaceC46387tSl
    public boolean gEmmrt() {
        return this.uzCIH.values();
    }

    @Override // o.InterfaceC46387tSl
    public boolean AYXKKw() {
        com.okinc.okuser.data.UserInfo info;
        User userOLrzqt = this.uzCIH.OLrzqt();
        return (userOLrzqt == null || (info = userOLrzqt.getInfo()) == null || !info.isSubUser()) ? false : true;
    }

    public boolean fARcdN() {
        com.okinc.okuser.data.UserInfo info;
        UserInfo.SubAccountFunction subAccountFunction;
        if (!AYXKKw()) {
            return true;
        }
        User userOLrzqt = this.uzCIH.OLrzqt();
        return (userOLrzqt == null || (info = userOLrzqt.getInfo()) == null || (subAccountFunction = info.getSubAccountFunction()) == null || !subAccountFunction.getCopyTrading()) ? false : true;
    }

    @Override // o.InterfaceC46387tSl
    public void KWHzl(PlanetBasicUserInfoResp planetBasicUserInfoResp) {
        this.AEQbTJ.setValue(planetBasicUserInfoResp);
    }

    public final boolean EZpvd(java.lang.String str) {
        java.lang.String strCopydefault = copydefault();
        if (strCopydefault == null) {
            strCopydefault = "";
        }
        return Intrinsics.EZpvd((java.lang.Object) strCopydefault, (java.lang.Object) str);
    }

    @Override // o.InterfaceC46387tSl
    public boolean copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        hDKMBd();
        return ((str == null || str.length() == 0) && ((str3 == null || str3.length() == 0) && (str2 == null || str2.length() == 0))) || (C33129mqd.OLrzqt((java.lang.CharSequence) str) && EZpvd(str)) || (C33129mqd.OLrzqt((java.lang.CharSequence) str2) && OLrzqt(str2));
    }

    public final void hDKMBd() {
        if (this.values.isLocked() || this.fetchVPNInfo || !gEmmrt() || !fARcdN()) {
            return;
        }
        pUU.EZpvd("PlanetAccountUserManager", "triggerSelfUserInfoRefreshIfNeeded: triggering refresh");
        BuildersKt__Builders_commonKt.launch$default(this.AhwBna, this.djBIcL, null, new PlanetAccountUserManager$triggerSelfUserInfoRefreshIfNeeded$1(this, null), 2, null);
    }

    public final boolean OLrzqt(java.lang.String str) {
        PlanetBasicUserInfoResp value = this.AEQbTJ.getValue();
        return Intrinsics.EZpvd((java.lang.Object) (value != null ? value.QOLQEE() : null), (java.lang.Object) str);
    }

    public boolean ejfBZ() {
        User userOLrzqt = this.uzCIH.OLrzqt();
        if (userOLrzqt != null) {
            return userOLrzqt.isVip();
        }
        return false;
    }

    @Override // o.InterfaceC46387tSl
    public boolean AhwBna() {
        return DbNXlk().isOrbiter();
    }

    public OrbitStatus DbNXlk() {
        OrbitStatus.ActionBar actionBar = OrbitStatus.Companion;
        OrbitBeanResp orbitBeanRespValues = values();
        return actionBar.AEQbTJ(orbitBeanRespValues != null ? orbitBeanRespValues.getOrbitLevel() : null);
    }

    @Override // o.InterfaceC46387tSl
    public boolean valueOf() {
        OrbitBeanResp orbitBeanRespValues;
        java.lang.Integer profileModified;
        return !C46437tUh.OLrzqt.AEQbTJ() || (orbitBeanRespValues = values()) == null || (profileModified = orbitBeanRespValues.getProfileModified()) == null || profileModified.intValue() == 1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(12:12|61|13|33|59|39|(1:41)(1:42)|43|44|(1:46)|47|(2:49|65)(2:50|51))(2:17|18))(1:19))(2:20|(2:22|23)(2:24|(1:26)(1:27)))|63|28|57|29|(1:31)(10:32|33|59|39|(0)(0)|43|44|(0)|47|(0)(0))|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8 A[Catch: all -> 0x0157, TryCatch #1 {all -> 0x0157, blocks: (B:39:0x00d1, B:43:0x00e1, B:42:0x00d8), top: B:59:0x00d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC46387tSl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object copydefault(@NotNull Continuation<? super kotlin.Pair<C46189tLc, ? extends java.lang.Throwable>> continuation) throws java.lang.Throwable {
        PlanetAccountUserManager$refreshSelfUserInfo$1 planetAccountUserManager$refreshSelfUserInfo$1;
        Mutex mutex;
        C46388tSm c46388tSm;
        Mutex mutex2;
        C46388tSm c46388tSm2;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        C46189tLc c46189tLcOLrzqt;
        if (continuation instanceof PlanetAccountUserManager$refreshSelfUserInfo$1) {
            planetAccountUserManager$refreshSelfUserInfo$1 = (PlanetAccountUserManager$refreshSelfUserInfo$1) continuation;
            int i = planetAccountUserManager$refreshSelfUserInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetAccountUserManager$refreshSelfUserInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                planetAccountUserManager$refreshSelfUserInfo$1 = new PlanetAccountUserManager$refreshSelfUserInfo$1(this, continuation);
            }
        }
        java.lang.Object objKWHzl = planetAccountUserManager$refreshSelfUserInfo$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = planetAccountUserManager$refreshSelfUserInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objKWHzl);
                pUU.EZpvd("PlanetAccountUserManager", "refreshSelfUserInfo is locked: " + this.values.isLocked());
                if (!gEmmrt()) {
                    return C56390yDp.OLrzqt(null, null);
                }
                this.values.isLocked();
                mutex = this.values;
                planetAccountUserManager$refreshSelfUserInfo$1.L$0 = this;
                planetAccountUserManager$refreshSelfUserInfo$1.L$1 = mutex;
                planetAccountUserManager$refreshSelfUserInfo$1.label = 1;
                if (mutex.lock(null, planetAccountUserManager$refreshSelfUserInfo$1) == objCopydefault) {
                    return objCopydefault;
                }
                c46388tSm = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) planetAccountUserManager$refreshSelfUserInfo$1.L$1;
                    c46388tSm2 = (C46388tSm) planetAccountUserManager$refreshSelfUserInfo$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objKWHzl);
                        objM7377constructorimpl = Result.m7377constructorimpl(AbstractC46197tLk.Companion.KWHzl((C46189tLc) objKWHzl));
                    } catch (java.lang.Throwable th) {
                        th = th;
                        c46388tSm = c46388tSm2;
                        mutex = mutex2;
                        Result.Application application = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        mutex2 = mutex;
                        c46388tSm2 = c46388tSm;
                    }
                    try {
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl == null) {
                            pUU.AEQbTJ("PlanetAccountUserManager", thM7380exceptionOrNullimpl);
                            objM7377constructorimpl = AbstractC46197tLk.Companion.OLrzqt(thM7380exceptionOrNullimpl);
                        }
                        AbstractC46197tLk<C46189tLc> abstractC46197tLk = (AbstractC46197tLk) objM7377constructorimpl;
                        mutex2.unlock(null);
                        pUU.KWHzl("PlanetAccountUserManager", "refreshSelfUserInfo " + abstractC46197tLk.OLrzqt());
                        c46189tLcOLrzqt = abstractC46197tLk.OLrzqt();
                        if (c46189tLcOLrzqt != null) {
                            C46386tSk.copydefault.EZpvd(c46388tSm2.copydefault(), c46189tLcOLrzqt.EZpvd());
                            c46388tSm2.AEQbTJ.setValue(c46189tLcOLrzqt.EZpvd());
                            c46388tSm2.fetchVPNInfo = true;
                            pUU.EZpvd("PlanetAccountUserManager", "refreshSelfUserInfo: marked as refreshed");
                        }
                        c46388tSm2.EZpvd.setValue(abstractC46197tLk);
                        if (!(c46388tSm2.EZpvd.getValue() instanceof AbstractC46197tLk.Activity)) {
                            C46189tLc c46189tLcAuCTel = c46388tSm2.AuCTel();
                            AbstractC46197tLk<C46189tLc> value = c46388tSm2.EZpvd.getValue();
                            Intrinsics.copydefault(value, "");
                            return C56390yDp.OLrzqt(c46189tLcAuCTel, ((AbstractC46197tLk.Activity) value).EZpvd());
                        }
                        return C56390yDp.OLrzqt(c46388tSm2.AuCTel(), null);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                mutex = (Mutex) planetAccountUserManager$refreshSelfUserInfo$1.L$1;
                c46388tSm = (C46388tSm) planetAccountUserManager$refreshSelfUserInfo$1.L$0;
                C56391yDq.AEQbTJ(objKWHzl);
            }
            C46189tLc c46189tLcAuCTel2 = c46388tSm.AuCTel();
            c46388tSm.EZpvd.setValue(AbstractC46197tLk.TaskDescription.loading$default(AbstractC46197tLk.Companion, false, 1, null));
            Result.Application application2 = Result.Companion;
            C46195tLi c46195tLi = c46388tSm.AYXKKw;
            C46195tLi.StateListAnimator stateListAnimator = new C46195tLi.StateListAnimator(c46189tLcAuCTel2, c46388tSm);
            planetAccountUserManager$refreshSelfUserInfo$1.L$0 = c46388tSm;
            planetAccountUserManager$refreshSelfUserInfo$1.L$1 = mutex;
            planetAccountUserManager$refreshSelfUserInfo$1.label = 2;
            objKWHzl = c46195tLi.KWHzl(stateListAnimator, (Continuation) planetAccountUserManager$refreshSelfUserInfo$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            mutex2 = mutex;
            c46388tSm2 = c46388tSm;
            objM7377constructorimpl = Result.m7377constructorimpl(AbstractC46197tLk.Companion.KWHzl((C46189tLc) objKWHzl));
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
            }
            AbstractC46197tLk<C46189tLc> abstractC46197tLk2 = (AbstractC46197tLk) objM7377constructorimpl;
            mutex2.unlock(null);
            pUU.KWHzl("PlanetAccountUserManager", "refreshSelfUserInfo " + abstractC46197tLk2.OLrzqt());
            c46189tLcOLrzqt = abstractC46197tLk2.OLrzqt();
            if (c46189tLcOLrzqt != null) {
            }
            c46388tSm2.EZpvd.setValue(abstractC46197tLk2);
            if (!(c46388tSm2.EZpvd.getValue() instanceof AbstractC46197tLk.Activity)) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            mutex.unlock(null);
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(13:12|69|13|35|67|41|(1:43)(1:44)|45|46|(3:48|(1:53)|54)|(1:57)|58|59)(2:17|18))(1:19))(2:20|(1:22)(4:23|(1:25)|26|(1:28)(1:29)))|71|30|65|31|(1:33)(11:34|35|67|41|(0)(0)|45|46|(0)|(0)|58|59)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6 A[Catch: all -> 0x0127, TryCatch #1 {all -> 0x0127, blocks: (B:41:0x00bf, B:45:0x00cc, B:44:0x00c6), top: B:67:0x00bf }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC46387tSl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Continuation<? super OrbitBeanResp> continuation) throws java.lang.Throwable {
        PlanetAccountUserManager$refreshOrbitInfo$1 planetAccountUserManager$refreshOrbitInfo$1;
        Mutex mutex;
        C46388tSm c46388tSm;
        Mutex mutex2;
        C46388tSm c46388tSm2;
        java.lang.Object objM7377constructorimpl;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        OrbitBeanResp orbitBeanResp;
        if (continuation instanceof PlanetAccountUserManager$refreshOrbitInfo$1) {
            planetAccountUserManager$refreshOrbitInfo$1 = (PlanetAccountUserManager$refreshOrbitInfo$1) continuation;
            int i = planetAccountUserManager$refreshOrbitInfo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetAccountUserManager$refreshOrbitInfo$1.label = i - Integer.MIN_VALUE;
            } else {
                planetAccountUserManager$refreshOrbitInfo$1 = new PlanetAccountUserManager$refreshOrbitInfo$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = planetAccountUserManager$refreshOrbitInfo$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = planetAccountUserManager$refreshOrbitInfo$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(objCopydefault);
                pUU.EZpvd("PlanetAccountUserManager", "refreshOrbitInfo is locked: " + this.DbNXlk.isLocked());
                if (!gEmmrt()) {
                    return null;
                }
                if (this.DbNXlk.isLocked()) {
                    pUU.EZpvd("PlanetAccountUserManager", "refreshOrbitInfo already in progress, waiting...");
                }
                mutex = this.DbNXlk;
                planetAccountUserManager$refreshOrbitInfo$1.L$0 = this;
                planetAccountUserManager$refreshOrbitInfo$1.L$1 = mutex;
                planetAccountUserManager$refreshOrbitInfo$1.label = 1;
                if (mutex.lock(null, planetAccountUserManager$refreshOrbitInfo$1) == objCopydefault2) {
                    return objCopydefault2;
                }
                c46388tSm = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = (Mutex) planetAccountUserManager$refreshOrbitInfo$1.L$1;
                    c46388tSm2 = (C46388tSm) planetAccountUserManager$refreshOrbitInfo$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objCopydefault);
                        objM7377constructorimpl = Result.m7377constructorimpl((OrbitBeanResp) objCopydefault);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        c46388tSm = c46388tSm2;
                        mutex = mutex2;
                        Result.Application application = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        mutex2 = mutex;
                        c46388tSm2 = c46388tSm;
                    }
                    try {
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl == null) {
                            pUU.AEQbTJ("PlanetAccountUserManager", "refreshOrbitInfo failed", thM7380exceptionOrNullimpl);
                            objM7377constructorimpl = null;
                        }
                        orbitBeanResp = (OrbitBeanResp) objM7377constructorimpl;
                        mutex2.unlock(null);
                        pUU.KWHzl("PlanetAccountUserManager", "refreshOrbitInfo net=: " + orbitBeanResp);
                        if (orbitBeanResp != null) {
                            java.lang.Integer orbiterPlusExpireStatus = orbitBeanResp.getOrbiterPlusExpireStatus();
                            if (orbiterPlusExpireStatus != null && orbiterPlusExpireStatus.intValue() == 1) {
                                C46386tSk.copydefault.OLrzqt();
                            }
                            c46388tSm2.OLrzqt.setValue(orbitBeanResp);
                            C46386tSk.copydefault.AEQbTJ(c46388tSm2.copydefault(), orbitBeanResp);
                            c46388tSm2.valueOf = true;
                            pUU.EZpvd("PlanetAccountUserManager", "refreshOrbitInfo: marked as refreshed");
                        }
                        pUU.EZpvd("PlanetAccountUserManager", "refreshOrbitInfo completed: " + (orbitBeanResp != null));
                        return orbitBeanResp;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        mutex = mutex2;
                        mutex.unlock(null);
                        throw th;
                    }
                }
                mutex = (Mutex) planetAccountUserManager$refreshOrbitInfo$1.L$1;
                c46388tSm = (C46388tSm) planetAccountUserManager$refreshOrbitInfo$1.L$0;
                C56391yDq.AEQbTJ(objCopydefault);
            }
            pUU.EZpvd("PlanetAccountUserManager", "refreshOrbitInfo starting");
            Result.Application application2 = Result.Companion;
            tAC tac = c46388tSm.gEmmrt;
            planetAccountUserManager$refreshOrbitInfo$1.L$0 = c46388tSm;
            planetAccountUserManager$refreshOrbitInfo$1.L$1 = mutex;
            planetAccountUserManager$refreshOrbitInfo$1.label = 2;
            objCopydefault = tac.copydefault(planetAccountUserManager$refreshOrbitInfo$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            mutex2 = mutex;
            c46388tSm2 = c46388tSm;
            objM7377constructorimpl = Result.m7377constructorimpl((OrbitBeanResp) objCopydefault);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
            }
            orbitBeanResp = (OrbitBeanResp) objM7377constructorimpl;
            mutex2.unlock(null);
            pUU.KWHzl("PlanetAccountUserManager", "refreshOrbitInfo net=: " + orbitBeanResp);
            if (orbitBeanResp != null) {
            }
            if (orbitBeanResp != null) {
            }
            pUU.EZpvd("PlanetAccountUserManager", "refreshOrbitInfo completed: " + (orbitBeanResp != null));
            return orbitBeanResp;
        } catch (java.lang.Throwable th3) {
            th = th3;
            mutex.unlock(null);
            throw th;
        }
    }

    @Override // o.InterfaceC46387tSl
    public java.lang.Object EZpvd(java.lang.Integer num, java.lang.Integer num2, @NotNull Continuation<? super Unit> continuation) {
        OrbitBeanResp value;
        OrbitBeanResp value2;
        if (num != null && (value2 = this.OLrzqt.getValue()) != null) {
            value2.setHasVisitedOrbitGuide(num);
        }
        if (num2 != null && (value = this.OLrzqt.getValue()) != null) {
            value.setHasVisitedOrbitPopup(num2);
        }
        OrbitBeanResp value3 = this.OLrzqt.getValue();
        if (value3 != null) {
            C46386tSk.copydefault.AEQbTJ(copydefault(), value3);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.tQR.ActionBar.invoke$default(o.tQR, java.lang.String, kotlin.coroutines.Continuation, int, java.lang.Object):java.lang.Object */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:54:0x0120 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:57:0x00b9 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x0027 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:? */
    /* JADX WARN: Can't wrap try/catch for region: R(6:58|(1:(1:(12:12|62|13|36|64|42|(1:44)(1:45)|46|47|(1:49)|50|51)(2:17|18))(1:19))(2:20|(2:22|23)(4:24|(1:26)|27|(1:29)(1:30)))|31|60|32|(1:34)(10:35|36|64|42|(0)(0)|46|47|(0)|50|51)) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc A[Catch: all -> 0x011d, TryCatch #3 {all -> 0x011d, blocks: (B:42:0x00c5, B:46:0x00d5, B:45:0x00cc), top: B:64:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // o.InterfaceC46387tSl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Continuation<? super kotlin.Pair<PublishPermissionResp, java.lang.String>> continuation) throws java.lang.Throwable {
        PlanetAccountUserManager$refreshPublishPermission$1 planetAccountUserManager$refreshPublishPermission$1;
        C46388tSm c46388tSm;
        ?? r1;
        C46388tSm c46388tSm2;
        java.lang.Object objM7377constructorimpl;
        ?? r12;
        java.lang.Throwable thM7380exceptionOrNullimpl;
        PublishPermissionResp publishPermissionResp;
        if (continuation instanceof PlanetAccountUserManager$refreshPublishPermission$1) {
            planetAccountUserManager$refreshPublishPermission$1 = (PlanetAccountUserManager$refreshPublishPermission$1) continuation;
            int i = planetAccountUserManager$refreshPublishPermission$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                planetAccountUserManager$refreshPublishPermission$1.label = i - Integer.MIN_VALUE;
            } else {
                planetAccountUserManager$refreshPublishPermission$1 = new PlanetAccountUserManager$refreshPublishPermission$1(this, continuation);
            }
        }
        java.lang.Object objInvoke$default = planetAccountUserManager$refreshPublishPermission$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        ?? r2 = planetAccountUserManager$refreshPublishPermission$1.label;
        try {
            if (r2 == 0) {
                C56391yDq.AEQbTJ(objInvoke$default);
                pUU.EZpvd("PlanetAccountUserManager", "refreshPublishPermission is locked: " + this.fARcdN.isLocked());
                if (!gEmmrt()) {
                    return C56390yDp.OLrzqt(null, "");
                }
                if (this.fARcdN.isLocked()) {
                    pUU.EZpvd("PlanetAccountUserManager", "refreshPublishPermission already in progress, waiting...");
                }
                Mutex mutex = this.fARcdN;
                planetAccountUserManager$refreshPublishPermission$1.L$0 = this;
                planetAccountUserManager$refreshPublishPermission$1.L$1 = mutex;
                planetAccountUserManager$refreshPublishPermission$1.label = 1;
                if (mutex.lock(null, planetAccountUserManager$refreshPublishPermission$1) == objCopydefault) {
                    return objCopydefault;
                }
                c46388tSm = this;
                r2 = mutex;
            } else {
                if (r2 != 1) {
                    if (r2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r1 = (Mutex) planetAccountUserManager$refreshPublishPermission$1.L$1;
                    c46388tSm2 = (C46388tSm) planetAccountUserManager$refreshPublishPermission$1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objInvoke$default);
                        r1 = r1;
                        objM7377constructorimpl = Result.m7377constructorimpl((kotlin.Pair) objInvoke$default);
                        r12 = r1;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        c46388tSm = c46388tSm2;
                        r2 = r1;
                        Result.Application application = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        r12 = r2;
                        c46388tSm2 = c46388tSm;
                    }
                    try {
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl == null) {
                            pUU.AEQbTJ("PlanetAccountUserManager", "refreshPublishPermission failed", thM7380exceptionOrNullimpl);
                            objM7377constructorimpl = C56390yDp.OLrzqt(null, "");
                        }
                        kotlin.Pair pair = (kotlin.Pair) objM7377constructorimpl;
                        r12.unlock(null);
                        pUU.KWHzl("PlanetAccountUserManager", "refreshPublishPermission net=: " + pair);
                        publishPermissionResp = (PublishPermissionResp) pair.getFirst();
                        if (publishPermissionResp != null) {
                            c46388tSm2.copydefault.setValue((PublishPermissionResp) pair.getFirst());
                            C46386tSk.copydefault.copydefault(c46388tSm2.copydefault(), publishPermissionResp);
                        }
                        pUU.EZpvd("PlanetAccountUserManager", "refreshPublishPermission completed: true");
                        return pair;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        r2 = r12;
                        r2.unlock(null);
                        throw th;
                    }
                }
                Mutex mutex2 = (Mutex) planetAccountUserManager$refreshPublishPermission$1.L$1;
                c46388tSm = (C46388tSm) planetAccountUserManager$refreshPublishPermission$1.L$0;
                C56391yDq.AEQbTJ(objInvoke$default);
                r2 = mutex2;
            }
            pUU.EZpvd("PlanetAccountUserManager", "refreshPublishPermission starting");
            Result.Application application2 = Result.Companion;
            tQR tqr = c46388tSm.isConnected;
            planetAccountUserManager$refreshPublishPermission$1.L$0 = c46388tSm;
            planetAccountUserManager$refreshPublishPermission$1.L$1 = r2;
            planetAccountUserManager$refreshPublishPermission$1.label = 2;
            objInvoke$default = tQR.ActionBar.invoke$default(tqr, null, planetAccountUserManager$refreshPublishPermission$1, 1, null);
            if (objInvoke$default == objCopydefault) {
                return objCopydefault;
            }
            r1 = r2;
            c46388tSm2 = c46388tSm;
            objM7377constructorimpl = Result.m7377constructorimpl((kotlin.Pair) objInvoke$default);
            r12 = r1;
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
            }
            kotlin.Pair pair2 = (kotlin.Pair) objM7377constructorimpl;
            r12.unlock(null);
            pUU.KWHzl("PlanetAccountUserManager", "refreshPublishPermission net=: " + pair2);
            publishPermissionResp = (PublishPermissionResp) pair2.getFirst();
            if (publishPermissionResp != null) {
            }
            pUU.EZpvd("PlanetAccountUserManager", "refreshPublishPermission completed: true");
            return pair2;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    public final void iwGUEr() {
        this.fetchVPNInfo = false;
        if (fARcdN() && this.uzCIH.values()) {
            pUU.EZpvd("PlanetAccountUserManager", "refreshSelf: launching coroutine");
            BuildersKt__Builders_commonKt.launch$default(this.AhwBna, this.djBIcL, null, new PlanetAccountUserManager$refreshSelf$1(this, null), 2, null);
        } else {
            pUU.EZpvd("PlanetAccountUserManager", "refreshSelf: skipped (not main account or not logged in)");
        }
    }

    public final void fJNWhG() {
        this.valueOf = false;
        if (!AYXKKw() && this.uzCIH.values()) {
            pUU.EZpvd("PlanetAccountUserManager", "refreshOrbit: launching coroutine");
            BuildersKt__Builders_commonKt.launch$default(this.AhwBna, this.djBIcL, null, new PlanetAccountUserManager$refreshOrbit$1(this, null), 2, null);
        } else {
            pUU.EZpvd("PlanetAccountUserManager", "refreshOrbit: skipped (sub user or not logged in)");
        }
    }

    public final void getFieldNames() {
        if (!AYXKKw() && this.uzCIH.values()) {
            pUU.EZpvd("PlanetAccountUserManager", "refreshPublish: launching coroutine");
            BuildersKt__Builders_commonKt.launch$default(this.AhwBna, this.djBIcL, null, new PlanetAccountUserManager$refreshPublish$1(this, null), 2, null);
        } else {
            pUU.EZpvd("PlanetAccountUserManager", "refreshPublish: skipped (sub user or not logged in)");
        }
    }

    public final void getNewProxyInstance() {
        this.EZpvd.setValue(AbstractC46197tLk.Companion.OLrzqt(true));
        this.AEQbTJ.setValue(null);
        this.OLrzqt.setValue(null);
        this.valueOf = false;
        this.fetchVPNInfo = false;
    }

    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext = BuildersKt.withContext(this.djBIcL, new PlanetAccountUserManager$loadCachedData$2(this, null), continuation);
        return objWithContext == C56442yFn.copydefault() ? objWithContext : Unit.INSTANCE;
    }
}
