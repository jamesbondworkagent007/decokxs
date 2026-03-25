package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.core.util.SPUtils;
import com.okinc.modular.deeplinkv2.DeeplinkMode;
import com.okinc.planet.biz_notifications.model.CommentsSubType;
import com.okinc.planet.biz_notifications.model.FollowersSubType;
import com.okinc.planet.biz_notifications.model.LikesSubType;
import com.okinc.planet.biz_notifications.model.SystemSubType;
import com.okinc.planet.service.OKPlanetApplicationDelegate$handleClearLastUnreadMsg$1;
import com.okinc.planet.service.OKPlanetApplicationDelegate$handleWSData$1;
import com.okinc.planet.service.OKPlanetApplicationDelegate$observerModeSwitch$1;
import com.okinc.planet.service.OKPlanetApplicationDelegate$observerUserEvent$1;
import com.okinc.planet.service.OKPlanetApplicationDelegate$onCreate$1;
import com.okinc.planet_api.model.LatestMessage;
import com.okinc.planet_api.model.WSMessageData;
import com.okinc.websocket.v5config.WsArgV5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C47501trL;
import o.C54401xHa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tTp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46418tTp extends C43265rly {
    public static int AEQbTJ;
    public static final SharedFlow<WSMessageData> AYXKKw;
    public static int AhwBna;
    public static AbstractC57556yke DbNXlk;
    public static int EZpvd;
    public static final MutableSharedFlow<WSMessageData> OLrzqt;
    public static int djBIcL;
    public static int gEmmrt;
    public static int valueOf;
    public final InterfaceC56387yDm isConnected = C56392yDr.copydefault(new Function0() { // from class: o.tTu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C46418tTp.getNewProxyInstance();
        }
    });
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public static final yIP<java.lang.Object, android.app.Application> copydefault = yIJ.OLrzqt.EZpvd();

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public boolean isLazyInit() {
        return true;
    }

    /* JADX INFO: renamed from: o.tTp$Application */
    public static final class Application {
        public static final /* synthetic */ yJA<java.lang.Object>[] AEQbTJ = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(Application.class, "mApp", "getMApp()Landroid/app/Application;", 0))};

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tTp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void EZpvd(@NotNull android.app.Application application) {
            Intrinsics.checkNotNullParameter(application, "");
            C46418tTp.copydefault.KWHzl(this, AEQbTJ[0], application);
        }

        public final android.app.Application copydefault() {
            return (android.app.Application) C46418tTp.copydefault.getValue(this, AEQbTJ[0]);
        }

        public final AbstractC57556yke AYXKKw() {
            return C46418tTp.DbNXlk;
        }

        public final void OLrzqt(AbstractC57556yke abstractC57556yke) {
            C46418tTp.DbNXlk = abstractC57556yke;
        }

        public final SharedFlow<WSMessageData> AhwBna() {
            return C46418tTp.AYXKKw;
        }

        public final int djBIcL() {
            return C46418tTp.gEmmrt;
        }

        public final void djBIcL(int i) {
            C46418tTp.gEmmrt = i;
        }

        public final void EZpvd(int i) {
            C46418tTp.valueOf = i;
        }

        public final int EZpvd() {
            return C46418tTp.AhwBna;
        }

        public final void copydefault(int i) {
            C46418tTp.AhwBna = i;
        }

        public final int AEQbTJ() {
            return C46418tTp.AEQbTJ;
        }

        public final void KWHzl(int i) {
            C46418tTp.AEQbTJ = i;
        }

        public final int OLrzqt() {
            return C46418tTp.EZpvd;
        }

        public final void OLrzqt(int i) {
            C46418tTp.EZpvd = i;
        }

        public final void AEQbTJ(int i) {
            C46418tTp.djBIcL = i;
        }

        public final int KWHzl() {
            return C46418tTp.djBIcL;
        }
    }

    static {
        MutableSharedFlow<WSMessageData> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tQP QOLQEE() {
        return (tQP) this.isConnected.getValue();
    }

    public static final tQP getNewProxyInstance() {
        return tPF.copydefault.aJFbMH();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void onCreate() {
        super.onCreate();
        ((InterfaceC48893ueK) C43251rlk.copydefault(InterfaceC48893ueK.class)).EZpvd(new C47756twC());
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new OKPlanetApplicationDelegate$onCreate$1(this, null), 2, null);
    }

    public final void gHZMYf() {
        java.lang.Long l = SPUtils.getLong(C47904tys.EZpvd.KWHzl(), 0L);
        if (l.longValue() > 0) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new OKPlanetApplicationDelegate$handleClearLastUnreadMsg$1(this, l, null), 3, null);
        }
    }

    public final void AxsJAY() {
        try {
            AbstractC57556yke abstractC57556ykeKWHzl = KWHzl(C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, true, false, false, false, null, 61, null), new Function1() { // from class: o.tTF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C46418tTp.KWHzl(this.AEQbTJ, (WSMessageData) obj);
                }
            });
            DbNXlk = abstractC57556ykeKWHzl;
            if (abstractC57556ykeKWHzl != null) {
                abstractC57556ykeKWHzl.AhwBna();
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("qjf", "OKPlanetApplicationDelegate-initWebSocketListener error: " + e.getMessage());
        }
    }

    public static final Unit KWHzl(C46418tTp c46418tTp, WSMessageData wSMessageData) {
        pUU.KWHzl("qjf", "OKPlanetApplicationDelegate-wsMsgData = " + wSMessageData);
        c46418tTp.EZpvd(wSMessageData);
        return Unit.INSTANCE;
    }

    public final void sSMYrx() {
        FlowKt.launchIn(FlowKt.onEach(((InterfaceC33171mrS) C43251rlk.copydefault(InterfaceC33171mrS.class)).isConnected(), new OKPlanetApplicationDelegate$observerModeSwitch$1(this, null)), GlobalScope.INSTANCE);
    }

    public final void zuBGHE() {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new OKPlanetApplicationDelegate$observerUserEvent$1(this, null), 3, null);
    }

    public final void EZpvd(WSMessageData wSMessageData) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new OKPlanetApplicationDelegate$handleWSData$1(wSMessageData, this, null), 3, null);
    }

    public final java.lang.String AEQbTJ(LatestMessage latestMessage) {
        if (latestMessage == null) {
            return "";
        }
        android.app.Application applicationCopydefault = Companion.copydefault();
        java.lang.String senderNickname = latestMessage.getSenderNickname();
        java.lang.String str = senderNickname == null ? "" : senderNickname;
        int eventSourceType = latestMessage.getEventSourceType();
        if (eventSourceType == 1) {
            int eventSubType = latestMessage.getEventSubType();
            if (eventSubType == LikesSubType.Comments.getSubType()) {
                java.lang.String string = applicationCopydefault.getString(C47501trL.Fragment.gsvlRV);
                Intrinsics.checkNotNullExpressionValue(string, "");
                return C59449zhJ.replace$default(string, "{username}", str, false, 4, (java.lang.Object) null);
            }
            if (eventSubType == LikesSubType.Post.getSubType()) {
                java.lang.String string2 = applicationCopydefault.getString(C47501trL.Fragment.QslYrK);
                Intrinsics.checkNotNullExpressionValue(string2, "");
                return C59449zhJ.replace$default(string2, "{username}", str, false, 4, (java.lang.Object) null);
            }
            java.lang.String string3 = applicationCopydefault.getString(C47501trL.Fragment.DzkRMH);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            return string3;
        }
        if (eventSourceType == 2) {
            if (latestMessage.getEventSubType() == FollowersSubType.Subscribe.getSubType()) {
                java.lang.String string4 = applicationCopydefault.getString(C47501trL.Fragment.DGGHxk);
                Intrinsics.checkNotNullExpressionValue(string4, "");
                return C59449zhJ.replace$default(string4, "{username}", str, false, 4, (java.lang.Object) null);
            }
            java.lang.String string5 = applicationCopydefault.getString(C47501trL.Fragment.DzkRMH);
            Intrinsics.checkNotNullExpressionValue(string5, "");
            return string5;
        }
        if (eventSourceType == 3) {
            int eventSubType2 = latestMessage.getEventSubType();
            if (eventSubType2 == CommentsSubType.Reply_Comments.getSubType()) {
                java.lang.String string6 = applicationCopydefault.getString(C47501trL.Fragment.gGNlxh);
                Intrinsics.checkNotNullExpressionValue(string6, "");
                return C59449zhJ.replace$default(string6, "{username}", str, false, 4, (java.lang.Object) null);
            }
            if (eventSubType2 == CommentsSubType.Reply_Post.getSubType()) {
                java.lang.String string7 = applicationCopydefault.getString(C47501trL.Fragment.fVjYLc);
                Intrinsics.checkNotNullExpressionValue(string7, "");
                return C59449zhJ.replace$default(string7, "{username}", str, false, 4, (java.lang.Object) null);
            }
            java.lang.String string8 = applicationCopydefault.getString(C47501trL.Fragment.DzkRMH);
            Intrinsics.checkNotNullExpressionValue(string8, "");
            return string8;
        }
        if (eventSourceType == 4) {
            int eventSubType3 = latestMessage.getEventSubType();
            if (eventSubType3 == SystemSubType.Post_Review_Failed.getSubType()) {
                java.lang.String string9 = applicationCopydefault.getString(C47501trL.Fragment.jNexW);
                Intrinsics.checkNotNullExpressionValue(string9, "");
                return string9;
            }
            if (eventSubType3 == SystemSubType.Comments_Review_Failed.getSubType()) {
                java.lang.String string10 = applicationCopydefault.getString(C47501trL.Fragment.QKDJJA);
                Intrinsics.checkNotNullExpressionValue(string10, "");
                return string10;
            }
            if (eventSubType3 == SystemSubType.Post_Removed.getSubType()) {
                java.lang.String string11 = applicationCopydefault.getString(C47501trL.Fragment.QWpYiD);
                Intrinsics.checkNotNullExpressionValue(string11, "");
                return string11;
            }
            if (eventSubType3 == SystemSubType.Comments_Removed.getSubType()) {
                java.lang.String string12 = applicationCopydefault.getString(C47501trL.Fragment.ExKek);
                Intrinsics.checkNotNullExpressionValue(string12, "");
                return string12;
            }
            if (eventSubType3 == SystemSubType.Content_Sync_Success.getSubType()) {
                java.lang.String string13 = applicationCopydefault.getString(C47501trL.Fragment.dbwnZN);
                Intrinsics.checkNotNullExpressionValue(string13, "");
                return string13;
            }
            if (eventSubType3 == SystemSubType.Content_Sync_Failed.getSubType() || eventSubType3 == SystemSubType.Twitter_Sync_Failed.getSubType()) {
                java.lang.String string14 = applicationCopydefault.getString(C47501trL.Fragment.QFTsTN);
                Intrinsics.checkNotNullExpressionValue(string14, "");
                return string14;
            }
            if (eventSubType3 == SystemSubType.BIO_REVIEW_FAILS.getSubType()) {
                java.lang.String string15 = applicationCopydefault.getString(C47501trL.Fragment.fHqPtx);
                Intrinsics.copydefault((java.lang.Object) string15);
                return string15;
            }
            java.lang.String string16 = applicationCopydefault.getString(C47501trL.Fragment.DzkRMH);
            Intrinsics.checkNotNullExpressionValue(string16, "");
            return string16;
        }
        java.lang.String string17 = applicationCopydefault.getString(C47501trL.Fragment.DzkRMH);
        Intrinsics.checkNotNullExpressionValue(string17, "");
        return string17;
    }

    public final java.lang.Object AEQbTJ(Continuation<? super Unit> continuation) {
        gEmmrt = 0;
        valueOf = 0;
        java.lang.Object objEmit = OLrzqt.emit(new WSMessageData(0, (java.util.List) null, 0, 0, 0, (LatestMessage) null, (java.lang.Integer) null, 66, (DefaultConstructorMarker) null), continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    public final AbstractC57556yke KWHzl(C57567ykp c57567ykp, final Function1<? super WSMessageData, Unit> function1) {
        java.util.ArrayList<? extends InterfaceC57559ykh> arrayList = new java.util.ArrayList<>();
        arrayList.add(new WsArgV5("planet-msg-center-notification", null, null, null, null, null, null, null, 254, null));
        return C54407xHg.Companion.AEQbTJ("planet-msg-center-notification", c57567ykp, arrayList, new Function2() { // from class: o.tTr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C46418tTp.OLrzqt(function1, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
            }
        });
    }

    public static final Unit OLrzqt(Function1 function1, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        function1.invoke(WSMessageData.Companion.KWHzl(oKIncomingData.getPayload().toString()));
        return Unit.INSTANCE;
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerService(@NotNull android.content.Context context, @NotNull InterfaceC43253rlm interfaceC43253rlm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43253rlm, "");
        super.registerService(context, interfaceC43253rlm);
        interfaceC43253rlm.KWHzl(tWL.class, tRX.class);
        interfaceC43253rlm.KWHzl(tWM.class, C46377tSb.class);
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerExtensions(@NotNull android.content.Context context, @NotNull InterfaceC43299rmf interfaceC43299rmf) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43299rmf, "");
        super.registerExtensions(context, interfaceC43299rmf);
        interfaceC43299rmf.EZpvd(InterfaceC33220msO.class, C56392yDr.copydefault(new Function0() { // from class: o.tTv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46418tTp.AwvSrB();
            }
        }));
        if (C43308rmo.KWHzl(context)) {
            C43056riA.AEQbTJ.OLrzqt("market", new C46407tTe());
        }
    }

    public static final tTJ AwvSrB() {
        return new tTJ((InterfaceC47278tmy) C43251rlk.copydefault(InterfaceC47278tmy.class));
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void registerDeeplinkHandlers(@NotNull android.content.Context context, @NotNull InterfaceC43237rlW interfaceC43237rlW) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(interfaceC43237rlW, "");
        super.registerDeeplinkHandlers(context, interfaceC43237rlW);
        DeeplinkMode deeplinkMode = DeeplinkMode.PRO;
        interfaceC43237rlW.copydefault(new tPH("main/planet", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.tTm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46418tTp.AuCTelauCTel();
            }
        }));
        interfaceC43237rlW.copydefault(new tPH("main/planet/feeds", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.tTn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46418tTp.zLjUOn();
            }
        }));
        interfaceC43237rlW.copydefault(new tPH("main/planet/leaderboard", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.tTs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46418tTp.wlaJM();
            }
        }));
        interfaceC43237rlW.copydefault(new tPH("main/planet/news", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.tTt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46418tTp.AubY();
            }
        }));
        interfaceC43237rlW.copydefault(new tPE("planet/personal", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.tTw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46418tTp.zsXlph();
            }
        }));
        interfaceC43237rlW.copydefault(new tPE("planet/profile/bio", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.tTz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46418tTp.iwGUEr();
            }
        }));
        interfaceC43237rlW.copydefault(new tPH("planet/profile/setting/tradinginfo", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.tTy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46418tTp.uzCIH();
            }
        }));
        interfaceC43237rlW.copydefault(new tPI("planet/notifications", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.tTA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46418tTp.hDKMBd();
            }
        }));
        interfaceC43237rlW.copydefault(new tPG("planet/post/publisher", deeplinkMode), C56392yDr.copydefault(new Function0() { // from class: o.tTx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C46418tTp.getFieldNames();
            }
        }));
    }

    public static final C46317tPw AuCTelauCTel() {
        return new C46317tPw();
    }

    public static final C46316tPv zLjUOn() {
        return new C46316tPv();
    }

    public static final C46315tPu wlaJM() {
        return new C46315tPu();
    }

    public static final C46318tPx AubY() {
        return new C46318tPx();
    }

    public static final tPB zsXlph() {
        return new tPB();
    }

    public static final tPA iwGUEr() {
        return new tPA();
    }

    public static final C46320tPz uzCIH() {
        return new C46320tPz();
    }

    public static final tPD hDKMBd() {
        return new tPD();
    }

    public static final tPC getFieldNames() {
        return new tPC();
    }

    @Override // o.C43265rly, o.InterfaceComponentCallbacks2C43266rlz
    public void attachBaseContext(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        Companion.EZpvd(getApplication());
    }
}
