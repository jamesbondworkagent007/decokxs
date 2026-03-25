package o;

import androidx.camera.video.AudioStats;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.market.features.position.domain.GetLatestPnLUseCase$dismissAlert$1;
import com.okinc.business.market.features.position.domain.GetLatestPnLUseCase$getTokenBalance$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.position.domain.GetLatestPnLUseCase$getTokenBalance$1;
import com.okinc.business.market.features.position.domain.GetLatestPnLUseCase$invoke$1;
import com.okinc.business.market.features.position.domain.GetLatestPnLUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1;
import com.okinc.business.market.features.position.domain.GetLatestPnLUseCase$shouldShowBanner$1;
import com.okinc.business.market.features.position.domain.GetLatestPnLUseCase$subscribeOthersPnl$1;
import com.okinc.business.market.features.position.domain.GetLatestPnLUseCase$subscribeOthersPnl$2;
import com.okinc.business.market.features.position.domain.GetLatestPnLUseCase$subscribeSelfPnl$1;
import com.okinc.business.market.features.position.domain.GetLatestPnLUseCase$subscribeSelfPnl$2;
import com.okinc.business.market.features.position.domain.GetLatestPnLUseCase$subscribeSelfPnl$3;
import com.okinc.business.market.features.position.ui.PositionDetailsParam;
import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.knh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29123knh {
    public final MutableStateFlow<PnLDetailsUiModel> AEQbTJ;
    public final InterfaceC28437kak AYXKKw;
    public final CoroutineDispatcher AhwBna;
    public final kKG AkhnZx;
    public final C27670jza EZpvd;
    public final java.lang.String KWHzl;
    public PnLDetailsUiModel OLrzqt;
    public final C29129knn copydefault;
    public final C29135knt djBIcL;
    public final StateFlow<PnLDetailsUiModel> gEmmrt;
    public final CoroutineScope isConnected;
    public final InterfaceC29133knr valueOf;
    public DexMultiTokenInfoBean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean AEQbTJ() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<PnLDetailsUiModel> copydefault() {
        return this.gEmmrt;
    }

    @yCM
    public C29123knh(@NotNull InterfaceC29133knr interfaceC29133knr, @NotNull InterfaceC28437kak interfaceC28437kak, @NotNull kKG kkg, @NotNull C29129knn c29129knn, @NotNull C29135knt c29135knt, @NotNull C27670jza c27670jza, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC29133knr, "");
        Intrinsics.checkNotNullParameter(interfaceC28437kak, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c29129knn, "");
        Intrinsics.checkNotNullParameter(c29135knt, "");
        Intrinsics.checkNotNullParameter(c27670jza, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.valueOf = interfaceC29133knr;
        this.AYXKKw = interfaceC28437kak;
        this.AkhnZx = kkg;
        this.copydefault = c29129knn;
        this.djBIcL = c29135knt;
        this.EZpvd = c27670jza;
        this.AhwBna = coroutineDispatcher;
        MutableStateFlow<PnLDetailsUiModel> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        this.KWHzl = "subAsset-dexSinglePosition";
        this.isConnected = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(coroutineDispatcher));
        this.OLrzqt = new PnLDetailsUiModel(false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        this.values = new DexMultiTokenInfoBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 0, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, 0, (java.lang.String) null, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 0, 0, 0, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: invoke-BWLJW6A$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m8669invokeBWLJW6A$default(C29123knh c29123knh, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        return c29123knh.EZpvd(str, str2, str3, (Continuation<? super Result<PnLDetailsUiModel>>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull Continuation<? super Result<PnLDetailsUiModel>> continuation) throws java.lang.Throwable {
        GetLatestPnLUseCase$invoke$1 getLatestPnLUseCase$invoke$1;
        if (continuation instanceof GetLatestPnLUseCase$invoke$1) {
            getLatestPnLUseCase$invoke$1 = (GetLatestPnLUseCase$invoke$1) continuation;
            int i = getLatestPnLUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLatestPnLUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getLatestPnLUseCase$invoke$1 = new GetLatestPnLUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getLatestPnLUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getLatestPnLUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AhwBna;
            GetLatestPnLUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 getLatestPnLUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1 = new GetLatestPnLUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1(null, str3, this, str, str2);
            getLatestPnLUseCase$invoke$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getLatestPnLUseCase$invokeBWLJW6A$$inlined$dexRunCatching$1, getLatestPnLUseCase$invoke$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        return ((Result) objWithContext).m7386unboximpl();
    }

    /* JADX INFO: renamed from: o.knh$Application */
    public static final class Application implements Function0<java.lang.String> {
        public final /* synthetic */ java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.String invoke() {
            InterfaceC9738bbJ interfaceC9738bbJValueOf = C29123knh.this.AkhnZx.valueOf();
            java.lang.String strKWHzl = interfaceC9738bbJValueOf != null ? C31256lqb.KWHzl(interfaceC9738bbJValueOf.EZpvd(C33129mqd.valueOf(this.EZpvd)), new ActionBar(interfaceC9738bbJValueOf)) : null;
            return strKWHzl == null ? "" : strKWHzl;
        }

        /* JADX INFO: renamed from: o.knh$Application$ActionBar */
        public static final class ActionBar implements Function0<java.lang.String> {
            public final /* synthetic */ InterfaceC9738bbJ AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ActionBar(InterfaceC9738bbJ interfaceC9738bbJ) {
                this.AEQbTJ = interfaceC9738bbJ;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                InterfaceC9780bbz interfaceC9780bbz = (InterfaceC9780bbz) CollectionsKt___CollectionsKt.firstOrNull(this.AEQbTJ.valueOf());
                java.lang.String address = interfaceC9780bbz != null ? interfaceC9780bbz.getAddress() : null;
                return address == null ? "" : address;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.lang.String str, java.lang.String str2, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        GetLatestPnLUseCase$getTokenBalance$1 getLatestPnLUseCase$getTokenBalance$1;
        if (continuation instanceof GetLatestPnLUseCase$getTokenBalance$1) {
            getLatestPnLUseCase$getTokenBalance$1 = (GetLatestPnLUseCase$getTokenBalance$1) continuation;
            int i = getLatestPnLUseCase$getTokenBalance$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLatestPnLUseCase$getTokenBalance$1.label = i - Integer.MIN_VALUE;
            } else {
                getLatestPnLUseCase$getTokenBalance$1 = new GetLatestPnLUseCase$getTokenBalance$1(this, continuation);
            }
        }
        java.lang.Object objWithContext = getLatestPnLUseCase$getTokenBalance$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getLatestPnLUseCase$getTokenBalance$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objWithContext);
            CoroutineDispatcher coroutineDispatcher = this.AhwBna;
            GetLatestPnLUseCase$getTokenBalance$$inlined$dexRunCatching$1 getLatestPnLUseCase$getTokenBalance$$inlined$dexRunCatching$1 = new GetLatestPnLUseCase$getTokenBalance$$inlined$dexRunCatching$1(null, this, str, str2);
            getLatestPnLUseCase$getTokenBalance$1.label = 1;
            objWithContext = BuildersKt.withContext(coroutineDispatcher, getLatestPnLUseCase$getTokenBalance$$inlined$dexRunCatching$1, getLatestPnLUseCase$getTokenBalance$1);
            if (objWithContext == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objWithContext);
        }
        ((Result) objWithContext).m7386unboximpl();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(@NotNull PositionDetailsParam positionDetailsParam, @NotNull Continuation<? super java.lang.Boolean> continuation) throws java.lang.Throwable {
        GetLatestPnLUseCase$shouldShowBanner$1 getLatestPnLUseCase$shouldShowBanner$1;
        java.lang.Object objAEQbTJ;
        C29123knh c29123knh;
        if (continuation instanceof GetLatestPnLUseCase$shouldShowBanner$1) {
            getLatestPnLUseCase$shouldShowBanner$1 = (GetLatestPnLUseCase$shouldShowBanner$1) continuation;
            int i = getLatestPnLUseCase$shouldShowBanner$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLatestPnLUseCase$shouldShowBanner$1.label = i - Integer.MIN_VALUE;
            } else {
                getLatestPnLUseCase$shouldShowBanner$1 = new GetLatestPnLUseCase$shouldShowBanner$1(this, continuation);
            }
        }
        java.lang.Object obj = getLatestPnLUseCase$shouldShowBanner$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getLatestPnLUseCase$shouldShowBanner$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9738bbJ interfaceC9738bbJValueOf = this.AkhnZx.valueOf();
            java.lang.String strEZpvd = interfaceC9738bbJValueOf != null ? interfaceC9738bbJValueOf.EZpvd(C33129mqd.valueOf(positionDetailsParam.getChainId())) : null;
            java.lang.String str = strEZpvd + "-" + positionDetailsParam.getTokenAddress();
            C27670jza c27670jza = this.EZpvd;
            KSerializer<java.lang.Boolean> kSerializerSerializer = BuiltinSerializersKt.serializer(yHW.OLrzqt);
            getLatestPnLUseCase$shouldShowBanner$1.L$0 = this;
            getLatestPnLUseCase$shouldShowBanner$1.label = 1;
            objAEQbTJ = c27670jza.AEQbTJ(str, kSerializerSerializer, getLatestPnLUseCase$shouldShowBanner$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c29123knh = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c29123knh = (C29123knh) getLatestPnLUseCase$shouldShowBanner$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(false);
        if (Result.m7383isFailureimpl(objAEQbTJ)) {
            objAEQbTJ = boolKWHzl;
        }
        boolean zBooleanValue = ((java.lang.Boolean) objAEQbTJ).booleanValue();
        PnLDetailsUiModel value = c29123knh.AEQbTJ.getValue();
        return C56443yFo.KWHzl((value == null || value.AYXKKw() || zBooleanValue) ? false : true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull PositionDetailsParam positionDetailsParam, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        GetLatestPnLUseCase$dismissAlert$1 getLatestPnLUseCase$dismissAlert$1;
        if (continuation instanceof GetLatestPnLUseCase$dismissAlert$1) {
            getLatestPnLUseCase$dismissAlert$1 = (GetLatestPnLUseCase$dismissAlert$1) continuation;
            int i = getLatestPnLUseCase$dismissAlert$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getLatestPnLUseCase$dismissAlert$1.label = i - Integer.MIN_VALUE;
            } else {
                getLatestPnLUseCase$dismissAlert$1 = new GetLatestPnLUseCase$dismissAlert$1(this, continuation);
            }
        }
        java.lang.Object obj = getLatestPnLUseCase$dismissAlert$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getLatestPnLUseCase$dismissAlert$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            InterfaceC9738bbJ interfaceC9738bbJValueOf = this.AkhnZx.valueOf();
            java.lang.String strEZpvd = interfaceC9738bbJValueOf != null ? interfaceC9738bbJValueOf.EZpvd(C33129mqd.valueOf(positionDetailsParam.getChainId())) : null;
            java.lang.String str = strEZpvd + "-" + positionDetailsParam.getTokenAddress();
            C27670jza c27670jza = this.EZpvd;
            KSerializer<java.lang.Boolean> kSerializerSerializer = BuiltinSerializersKt.serializer(yHW.OLrzqt);
            java.lang.Boolean boolKWHzl = C56443yFo.KWHzl(true);
            getLatestPnLUseCase$dismissAlert$1.label = 1;
            if (c27670jza.EZpvd(str, kSerializerSerializer, boolKWHzl, getLatestPnLUseCase$dismissAlert$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            ((Result) obj).m7386unboximpl();
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (C22416heu.ejfBZ()) {
            return;
        }
        C25389ivm.safeLaunch$default(this.isConnected, null, null, new GetLatestPnLUseCase$subscribeSelfPnl$1(this, null), 3, null);
        C25389ivm.safeLaunch$default(this.isConnected, null, null, new GetLatestPnLUseCase$subscribeSelfPnl$2(this, str, str2, null), 3, null);
        C25389ivm.safeLaunch$default(this.isConnected, null, null, new GetLatestPnLUseCase$subscribeSelfPnl$3(this, str, str2, null), 3, null);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        if (C22416heu.ejfBZ()) {
            return;
        }
        C25389ivm.safeLaunch$default(this.isConnected, null, null, new GetLatestPnLUseCase$subscribeOthersPnl$1(this, str3, str2, null), 3, null);
        C25389ivm.safeLaunch$default(this.isConnected, null, null, new GetLatestPnLUseCase$subscribeOthersPnl$2(this, str, str2, null), 3, null);
    }

    public static /* synthetic */ void updatePnLByPrice$default(C29123knh c29123knh, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        c29123knh.EZpvd(str);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        float fDjBIcL;
        float fDjBIcL2;
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            PnLDetailsUiModel pnLDetailsUiModel = this.OLrzqt;
            this.OLrzqt = pnLDetailsUiModel.OLrzqt((393215 & 1) != 0 ? pnLDetailsUiModel.AYXKKw : false, (393215 & 2) != 0 ? pnLDetailsUiModel.DbNXlk : null, (393215 & 4) != 0 ? pnLDetailsUiModel.isConnected : null, (393215 & 8) != 0 ? pnLDetailsUiModel.AkhnZx : null, (393215 & 16) != 0 ? pnLDetailsUiModel.KWHzl : null, (393215 & 32) != 0 ? pnLDetailsUiModel.valueOf : null, (393215 & 64) != 0 ? pnLDetailsUiModel.fJNWhG : null, (393215 & 128) != 0 ? pnLDetailsUiModel.AuCTel : null, (393215 & 256) != 0 ? pnLDetailsUiModel.AhwBna : null, (393215 & 512) != 0 ? pnLDetailsUiModel.djBIcL : null, (393215 & 1024) != 0 ? pnLDetailsUiModel.copydefault : null, (393215 & 2048) != 0 ? pnLDetailsUiModel.EZpvd : null, (393215 & 4096) != 0 ? pnLDetailsUiModel.fetchVPNInfo : null, (393215 & 8192) != 0 ? pnLDetailsUiModel.fIwbmz : null, (393215 & 16384) != 0 ? pnLDetailsUiModel.fARcdN : null, (393215 & 32768) != 0 ? pnLDetailsUiModel.values : null, (393215 & 65536) != 0 ? pnLDetailsUiModel.gEmmrt : null, (393215 & 131072) != 0 ? pnLDetailsUiModel.AEQbTJ : str, (393215 & 262144) != 0 ? pnLDetailsUiModel.OLrzqt : null);
        } else if (str.length() == 0 && this.OLrzqt.AEQbTJ().length() == 0) {
            return;
        }
        float fDjBIcL3 = C33129mqd.djBIcL(this.OLrzqt.AEQbTJ());
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.OLrzqt.AuCTel())) {
            fDjBIcL = java.lang.Math.min(C33129mqd.djBIcL(this.OLrzqt.AuCTel()), C33129mqd.djBIcL(this.OLrzqt.valueOf()));
        } else {
            fDjBIcL = C33129mqd.djBIcL(this.OLrzqt.valueOf());
        }
        float fKWHzl = C29156koN.KWHzl(fDjBIcL3, C33129mqd.djBIcL(this.OLrzqt.KWHzl()), fDjBIcL);
        float fEZpvd = C29156koN.EZpvd(fDjBIcL3, C33129mqd.djBIcL(this.OLrzqt.KWHzl()));
        float fDjBIcL4 = C33129mqd.djBIcL(this.OLrzqt.EZpvd()) + fKWHzl;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.OLrzqt.AuCTel())) {
            fDjBIcL2 = C33129mqd.djBIcL(this.OLrzqt.AuCTel()) * fDjBIcL3;
        } else {
            fDjBIcL2 = C33129mqd.djBIcL(this.OLrzqt.copydefault());
        }
        java.lang.Object objValueOf = C33129mqd.djBIcL(this.OLrzqt.AhwBna()) == 0.0f ? 0 : java.lang.Float.valueOf((C33129mqd.djBIcL(java.lang.Float.valueOf(fDjBIcL4)) / C33129mqd.djBIcL(this.OLrzqt.AhwBna())) * 100);
        PnLDetailsUiModel pnLDetailsUiModel2 = this.OLrzqt;
        PnLDetailsUiModel pnLDetailsUiModelOLrzqt = pnLDetailsUiModel2.OLrzqt((393215 & 1) != 0 ? pnLDetailsUiModel2.AYXKKw : false, (393215 & 2) != 0 ? pnLDetailsUiModel2.DbNXlk : null, (393215 & 4) != 0 ? pnLDetailsUiModel2.isConnected : pnLDetailsUiModel2.AYXKKw() ? java.lang.String.valueOf(fDjBIcL4) : "", (393215 & 8) != 0 ? pnLDetailsUiModel2.AkhnZx : this.OLrzqt.AYXKKw() ? objValueOf.toString() : "", (393215 & 16) != 0 ? pnLDetailsUiModel2.KWHzl : null, (393215 & 32) != 0 ? pnLDetailsUiModel2.valueOf : null, (393215 & 64) != 0 ? pnLDetailsUiModel2.fJNWhG : this.OLrzqt.AYXKKw() ? java.lang.String.valueOf(fKWHzl) : "", (393215 & 128) != 0 ? pnLDetailsUiModel2.AuCTel : this.OLrzqt.AYXKKw() ? java.lang.String.valueOf(fEZpvd) : "", (393215 & 256) != 0 ? pnLDetailsUiModel2.AhwBna : null, (393215 & 512) != 0 ? pnLDetailsUiModel2.djBIcL : null, (393215 & 1024) != 0 ? pnLDetailsUiModel2.copydefault : null, (393215 & 2048) != 0 ? pnLDetailsUiModel2.EZpvd : null, (393215 & 4096) != 0 ? pnLDetailsUiModel2.fetchVPNInfo : null, (393215 & 8192) != 0 ? pnLDetailsUiModel2.fIwbmz : null, (393215 & 16384) != 0 ? pnLDetailsUiModel2.fARcdN : null, (393215 & 32768) != 0 ? pnLDetailsUiModel2.values : null, (393215 & 65536) != 0 ? pnLDetailsUiModel2.gEmmrt : null, (393215 & 131072) != 0 ? pnLDetailsUiModel2.AEQbTJ : null, (393215 & 262144) != 0 ? pnLDetailsUiModel2.OLrzqt : java.lang.String.valueOf(fDjBIcL2));
        this.OLrzqt = pnLDetailsUiModelOLrzqt;
        this.AEQbTJ.setValue(pnLDetailsUiModelOLrzqt);
    }

    public final void OLrzqt() {
        this.valueOf.EZpvd();
        this.AYXKKw.OLrzqt();
        this.AYXKKw.EZpvd();
        JobKt__JobKt.cancelChildren$default(this.isConnected.getCoroutineContext(), (CancellationException) null, 1, (java.lang.Object) null);
    }
}
