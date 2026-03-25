package com.reown.android;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.reown.android.Core;
import com.reown.android.CoreInterface;
import com.reown.android.di.CoreStorageModuleKt;
import com.reown.android.internal.common.ConditionalExponentialBackoffStrategy;
import com.reown.android.internal.common.KoinApplicationKt;
import com.reown.android.internal.common.crypto.codec.Codec;
import com.reown.android.internal.common.di.AndroidCommonDITags;
import com.reown.android.internal.common.di.CoreCommonModuleKt;
import com.reown.android.internal.common.di.CoreCryptoModuleKt;
import com.reown.android.internal.common.di.CoreNetworkModuleKt;
import com.reown.android.internal.common.di.CorePairingModuleKt;
import com.reown.android.internal.common.di.KeyServerModuleKt;
import com.reown.android.internal.common.di.PulseModuleKt;
import com.reown.android.internal.common.explorer.ExplorerInterface;
import com.reown.android.internal.common.explorer.ExplorerProtocol;
import com.reown.android.internal.common.explorer.ExplorerRepository;
import com.reown.android.internal.common.explorer.data.network.ExplorerService;
import com.reown.android.internal.common.explorer.domain.usecase.GetNotifyConfigUseCase;
import com.reown.android.internal.common.explorer.domain.usecase.GetProjectsWithPaginationUseCase;
import com.reown.android.internal.common.json_rpc.data.JsonRpcSerializer;
import com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractor;
import com.reown.android.internal.common.json_rpc.domain.link_mode.LinkModeJsonRpcInteractorInterface;
import com.reown.android.internal.common.json_rpc.domain.relay.RelayJsonRpcInteractor;
import com.reown.android.internal.common.modal.AppKitApiRepository;
import com.reown.android.internal.common.modal.data.network.AppKitService;
import com.reown.android.internal.common.modal.domain.usecase.EnableAnalyticsUseCase;
import com.reown.android.internal.common.modal.domain.usecase.EnableAnalyticsUseCaseInterface;
import com.reown.android.internal.common.modal.domain.usecase.GetInstalledWalletsIdsUseCase;
import com.reown.android.internal.common.modal.domain.usecase.GetInstalledWalletsIdsUseCaseInterface;
import com.reown.android.internal.common.modal.domain.usecase.GetSampleWalletsUseCase;
import com.reown.android.internal.common.modal.domain.usecase.GetSampleWalletsUseCaseInterface;
import com.reown.android.internal.common.modal.domain.usecase.GetWalletsUseCase;
import com.reown.android.internal.common.modal.domain.usecase.GetWalletsUseCaseInterface;
import com.reown.android.internal.common.model.AppMetaData;
import com.reown.android.internal.common.model.ProjectId;
import com.reown.android.internal.common.model.Redirect;
import com.reown.android.internal.common.model.TelemetryEnabled;
import com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface;
import com.reown.android.internal.common.storage.push_messages.PushMessagesRepository;
import com.reown.android.internal.common.storage.rpc.JsonRpcHistory;
import com.reown.android.pairing.client.PairingInterface;
import com.reown.android.pairing.client.PairingProtocol;
import com.reown.android.pairing.handler.PairingController;
import com.reown.android.pairing.handler.PairingControllerInterface;
import com.reown.android.pairing.model.PairingJsonRpcMethod;
import com.reown.android.pairing.model.PairingRpc;
import com.reown.android.push.PushInterface;
import com.reown.android.push.client.PushClient;
import com.reown.android.push.network.PushService;
import com.reown.android.push.notifications.DecryptMessageUseCaseInterface;
import com.reown.android.relay.ConnectionType;
import com.reown.android.relay.NetworkClientTimeout;
import com.reown.android.relay.RelayClient;
import com.reown.android.relay.RelayConnectionInterface;
import com.reown.android.utils.ExtensionsKt;
import com.reown.android.utils.TimberKt;
import com.reown.android.verify.client.VerifyClient;
import com.reown.android.verify.client.VerifyInterface;
import com.reown.foundation.util.Logger;
import com.reown.utils.JsonAdapterEntry;
import com.reown.utils.UtilFunctionsKt;
import com.squareup.moshi.Moshi;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AbstractC59982ztK;
import o.C56424yEw;
import o.C56524yIo;
import o.C59930zsL;
import o.C59934zsP;
import o.C59976ztE;
import o.C59978ztG;
import o.C59981ztJ;
import o.C59990ztS;
import o.C59991ztT;
import o.C60018ztu;
import o.C60053zuc;
import o.C60055zue;
import o.C60058zuh;
import o.C60059zui;
import o.C60060zuj;
import o.C60064zun;
import o.InterfaceC56551yJo;
import o.InterfaceC59997ztZ;
import o.yDY;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* JADX INFO: loaded from: classes12.dex */
public final class CoreProtocol implements CoreInterface {
    public static final Companion Companion = new Companion(null);
    public static final CoreProtocol instance = new CoreProtocol(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
    public final PushInterface Echo;
    public final ExplorerInterface Explorer;
    public final PairingInterface Pairing;
    public final PairingControllerInterface PairingController;
    public final PushInterface Push;
    public RelayClient Relay;
    public final VerifyInterface Verify;
    public final C60018ztu koinApp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoreProtocol() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void getEcho$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public PushInterface getEcho() {
        return this.Echo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public ExplorerInterface getExplorer() {
        return this.Explorer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public PairingInterface getPairing() {
        return this.Pairing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public PairingControllerInterface getPairingController() {
        return this.PairingController;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public PushInterface getPush() {
        return this.Push;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: getRelay()Lcom/reown/android/relay/RelayConnectionInterface; */
    @Override // com.reown.android.CoreInterface
    public RelayClient getRelay() {
        return this.Relay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.reown.android.CoreInterface
    public VerifyInterface getVerify() {
        return this.Verify;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setRelay(@NotNull RelayClient relayClient) {
        Intrinsics.checkNotNullParameter(relayClient, "");
        this.Relay = relayClient;
    }

    public CoreProtocol(@NotNull C60018ztu c60018ztu) {
        Intrinsics.checkNotNullParameter(c60018ztu, "");
        this.koinApp = c60018ztu;
        this.Pairing = new PairingProtocol(c60018ztu);
        this.PairingController = new PairingController(c60018ztu);
        this.Relay = new RelayClient(c60018ztu);
        PushClient pushClient = PushClient.INSTANCE;
        this.Echo = pushClient;
        this.Push = pushClient;
        this.Verify = new VerifyClient(c60018ztu, null, 2, null);
        this.Explorer = new ExplorerProtocol(c60018ztu);
        TimberKt.plantTimber();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:o.ztu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.ztu:0x0004: INVOKE  STATIC call: com.reown.android.internal.common.KoinApplicationKt.getWcKoinApp():o.ztu A[MD:():o.ztu (m), WRAPPED] (LINE:45)) : (r1v0 o.ztu))
 A[MD:(o.ztu):void (m)] (LINE:45) call: com.reown.android.CoreProtocol.<init>(o.ztu):void type: THIS */
    public /* synthetic */ CoreProtocol(C60018ztu c60018ztu, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? KoinApplicationKt.getWcKoinApp() : c60018ztu);
    }

    @Override // com.reown.android.CoreInterface
    public void setDelegate(@NotNull CoreInterface.Delegate delegate) {
        Intrinsics.checkNotNullParameter(delegate, "");
        getPairing().setDelegate(delegate);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.CoreProtocol.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final CoreProtocol getInstance() {
            return CoreProtocol.instance;
        }
    }

    @Override // com.reown.android.CoreInterface
    public void initialize(@NotNull Core.Model.AppMetaData appMetaData, @NotNull String str, @NotNull ConnectionType connectionType, @NotNull Application application, RelayConnectionInterface relayConnectionInterface, String str2, NetworkClientTimeout networkClientTimeout, boolean z, @NotNull Function1<? super Core.Model.Error, Unit> function1) {
        Intrinsics.checkNotNullParameter(appMetaData, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(connectionType, "");
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            if (!ExtensionsKt.isValidRelayServerUrl(str)) {
                throw new IllegalArgumentException("Check the schema and projectId parameter of the Server Url".toString());
            }
            setup(this, application, str, ExtensionsKt.projectId(str), z, connectionType, networkClientTimeout, relayConnectionInterface, function1, appMetaData, str2);
        } catch (Exception e) {
            function1.invoke(new Core.Model.Error(e));
        }
    }

    @Override // com.reown.android.CoreInterface
    public void initialize(@NotNull Application application, @NotNull String str, @NotNull Core.Model.AppMetaData appMetaData, @NotNull ConnectionType connectionType, RelayConnectionInterface relayConnectionInterface, String str2, NetworkClientTimeout networkClientTimeout, boolean z, @NotNull Function1<? super Core.Model.Error, Unit> function1) {
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(appMetaData, "");
        Intrinsics.checkNotNullParameter(connectionType, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            if (str.length() <= 0) {
                throw new IllegalArgumentException("Project Id cannot be empty".toString());
            }
            setup$default(this, this, application, null, str, z, connectionType, networkClientTimeout, relayConnectionInterface, function1, appMetaData, str2, 2, null);
        } catch (Exception e) {
            function1.invoke(new Core.Model.Error(e));
        }
    }

    public static /* synthetic */ void setup$default(CoreProtocol coreProtocol, CoreProtocol coreProtocol2, Application application, String str, String str2, boolean z, ConnectionType connectionType, NetworkClientTimeout networkClientTimeout, RelayConnectionInterface relayConnectionInterface, Function1 function1, Core.Model.AppMetaData appMetaData, String str3, int i, Object obj) {
        coreProtocol.setup(coreProtocol2, application, (i & 2) != 0 ? null : str, str2, z, connectionType, networkClientTimeout, relayConnectionInterface, function1, appMetaData, str3);
    }

    public final void setup(final CoreProtocol coreProtocol, Application application, String str, final String str2, final boolean z, ConnectionType connectionType, NetworkClientTimeout networkClientTimeout, final RelayConnectionInterface relayConnectionInterface, final Function1<? super Core.Model.Error, Unit> function1, final Core.Model.AppMetaData appMetaData, String str3) {
        String str4;
        String packageName = application.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        if (str == null || str.length() == 0) {
            str4 = "wss://relay.walletconnect.org?projectId=" + str2;
        } else {
            str4 = str;
        }
        C60018ztu c60018ztu = coreProtocol.koinApp;
        C59934zsP.AEQbTJ(c60018ztu, application);
        c60018ztu.EZpvd(C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.CoreProtocol$setup$1$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                final String str5 = str2;
                Function2<C60060zuj, C60053zuc, ProjectId> function2 = new Function2<C60060zuj, C60053zuc, ProjectId>() { // from class: com.reown.android.CoreProtocol$setup$1$1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final ProjectId invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new ProjectId(str5);
                    }
                };
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(ProjectId.class), null, function2, Kind.Singleton, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
            }
        }, 1, null), C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.CoreProtocol$setup$1$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt = C60058zuh.OLrzqt(AndroidCommonDITags.TELEMETRY_ENABLED);
                final boolean z2 = z;
                Function2<C60060zuj, C60053zuc, TelemetryEnabled> function2 = new Function2<C60060zuj, C60053zuc, TelemetryEnabled>() { // from class: com.reown.android.CoreProtocol$setup$1$2.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* synthetic */ TelemetryEnabled invoke(C60060zuj c60060zuj, C60053zuc c60053zuc) {
                        return TelemetryEnabled.m7246boximpl(m7174invokeflHzR8(c60060zuj, c60053zuc));
                    }

                    /* JADX INFO: renamed from: invoke-f-lHzR8, reason: not valid java name */
                    public final boolean m7174invokeflHzR8(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return TelemetryEnabled.m7247constructorimpl(z2);
                    }
                };
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(TelemetryEnabled.class), interfaceC59997ztZOLrzqt, function2, Kind.Singleton, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
            }
        }, 1, null), CoreNetworkModuleKt.coreAndroidNetworkModule(str4, connectionType, "1.0.4", networkClientTimeout, packageName), CoreCommonModuleKt.coreCommonModule(), CoreCryptoModuleKt.coreCryptoModule$default(null, null, 3, null));
        if (relayConnectionInterface == null) {
            coreProtocol.getRelay().initialize(connectionType, new Function1<Throwable, Unit>() { // from class: com.reown.android.CoreProtocol$setup$1$3
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.Core$Model$Error, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                    function1.invoke(new Core.Model.Error(th));
                }
            });
        }
        c60018ztu.EZpvd(CoreStorageModuleKt.coreStorageModule$default(null, packageName, 1, null), C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.CoreProtocol$setup$1$4
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt = C60058zuh.OLrzqt(AndroidCommonDITags.CLIENT_ID);
                AnonymousClass1 anonymousClass1 = new Function2<C60060zuj, C60053zuc, String>() { // from class: com.reown.android.CoreProtocol$setup$1$4.1
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final String invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        String string = ((SharedPreferences) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SharedPreferences.class), null, null)).getString(CoreNetworkModuleKt.KEY_CLIENT_ID, null);
                        if (string != null) {
                            return string;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                };
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(String.class), interfaceC59997ztZOLrzqt, anonymousClass1, Kind.Singleton, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
            }
        }, 1, null), C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.internal.common.di.PushModuleKt.pushModule.1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt = C60058zuh.OLrzqt(AndroidCommonDITags.PUSH_URL);
                C07011 c07011 = new Function2<C60060zuj, C60053zuc, String>() { // from class: com.reown.android.internal.common.di.PushModuleKt.pushModule.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final String invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return "https://echo.walletconnect.org/";
                    }
                };
                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                AbstractC59982ztK<?> c59981ztJ = new C59981ztJ<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(String.class), interfaceC59997ztZOLrzqt, c07011, Kind.Factory, yDY.AhwBna()));
                c59991ztT.KWHzl(c59981ztJ);
                new C59976ztE(c59991ztT, c59981ztJ);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt2 = C60058zuh.OLrzqt(AndroidCommonDITags.PUSH_RETROFIT);
                AnonymousClass2 anonymousClass2 = new Function2<C60060zuj, C60053zuc, Retrofit>() { // from class: com.reown.android.internal.common.di.PushModuleKt.pushModule.1.2
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Retrofit invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new Retrofit.Builder().baseUrl((String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.PUSH_URL), null)).addConverterFactory(MoshiConverterFactory.create()).client((OkHttpClient) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OkHttpClient.class), C60058zuh.OLrzqt(AndroidCommonDITags.OK_HTTP), null)).build();
                    }
                };
                C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                Kind kind = Kind.Singleton;
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(Retrofit.class), interfaceC59997ztZOLrzqt2, anonymousClass2, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
                AnonymousClass3 anonymousClass3 = new Function2<C60060zuj, C60053zuc, PushService>() { // from class: com.reown.android.internal.common.di.PushModuleKt.pushModule.1.3
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final PushService invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return (PushService) ((Retrofit) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Retrofit.class), C60058zuh.OLrzqt(AndroidCommonDITags.PUSH_RETROFIT), null)).create(PushService.class);
                    }
                };
                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(PushService.class), null, anonymousClass3, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS2);
                }
                new C59976ztE(c59991ztT, c59990ztS2);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt3 = C60058zuh.OLrzqt(AndroidCommonDITags.DECRYPT_USE_CASES);
                AnonymousClass4 anonymousClass4 = new Function2<C60060zuj, C60053zuc, Map<String, DecryptMessageUseCaseInterface>>() { // from class: com.reown.android.internal.common.di.PushModuleKt.pushModule.1.4
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Map<String, DecryptMessageUseCaseInterface> invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new LinkedHashMap();
                    }
                };
                C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(Map.class), interfaceC59997ztZOLrzqt3, anonymousClass4, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS3);
                }
                new C59976ztE(c59991ztT, c59990ztS3);
            }
        }, 1, null), C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.CoreProtocol$setup$1$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                final RelayConnectionInterface relayConnectionInterface2 = relayConnectionInterface;
                final CoreProtocol coreProtocol2 = coreProtocol;
                Function2<C60060zuj, C60053zuc, RelayConnectionInterface> function2 = new Function2<C60060zuj, C60053zuc, RelayConnectionInterface>() { // from class: com.reown.android.CoreProtocol$setup$1$5.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final RelayConnectionInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        RelayConnectionInterface relayConnectionInterface3 = relayConnectionInterface2;
                        return relayConnectionInterface3 == null ? coreProtocol2.getRelay() : relayConnectionInterface3;
                    }
                };
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(RelayConnectionInterface.class), null, function2, Kind.Singleton, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
            }
        }, 1, null), C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.CoreProtocol$setup$1$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                final Core.Model.AppMetaData appMetaData2 = appMetaData;
                Function2<C60060zuj, C60053zuc, AppMetaData> function2 = new Function2<C60060zuj, C60053zuc, AppMetaData>() { // from class: com.reown.android.CoreProtocol$setup$1$6.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final AppMetaData invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        Core.Model.AppMetaData appMetaData3 = appMetaData2;
                        return new AppMetaData(appMetaData3.getDescription(), appMetaData3.getUrl(), appMetaData3.getIcons(), appMetaData3.getName(), new Redirect(appMetaData3.getRedirect(), appMetaData3.getAppLink(), appMetaData3.getLinkMode()), null, 32, null);
                    }
                };
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(AppMetaData.class), null, function2, Kind.Singleton, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
            }
        }, 1, null), C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.CoreProtocol$setup$1$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                final CoreProtocol coreProtocol2 = this.$this_setup;
                Function2<C60060zuj, C60053zuc, PushInterface> function2 = new Function2<C60060zuj, C60053zuc, PushInterface>() { // from class: com.reown.android.CoreProtocol$setup$1$7.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final PushInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return coreProtocol2.getEcho();
                    }
                };
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(PushInterface.class), null, function2, Kind.Singleton, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
            }
        }, 1, null), C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.CoreProtocol$setup$1$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                final CoreProtocol coreProtocol2 = this.$this_setup;
                Function2<C60060zuj, C60053zuc, PushInterface> function2 = new Function2<C60060zuj, C60053zuc, PushInterface>() { // from class: com.reown.android.CoreProtocol$setup$1$8.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final PushInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return coreProtocol2.getPush();
                    }
                };
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(PushInterface.class), null, function2, Kind.Singleton, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
            }
        }, 1, null), C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.CoreProtocol$setup$1$9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                final CoreProtocol coreProtocol2 = this.$this_setup;
                Function2<C60060zuj, C60053zuc, VerifyInterface> function2 = new Function2<C60060zuj, C60053zuc, VerifyInterface>() { // from class: com.reown.android.CoreProtocol$setup$1$9.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final VerifyInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return coreProtocol2.getVerify();
                    }
                };
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(C60059zui.KWHzl.KWHzl(), C56524yIo.AEQbTJ(VerifyInterface.class), null, function2, Kind.Singleton, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
            }
        }, 1, null), C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.internal.common.di.CoreJsonRpcModuleKt.coreJsonRpcModule.1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                C06951 c06951 = new Function2<C60060zuj, C60053zuc, RelayJsonRpcInteractorInterface>() { // from class: com.reown.android.internal.common.di.CoreJsonRpcModuleKt.coreJsonRpcModule.1.1
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final RelayJsonRpcInteractorInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new RelayJsonRpcInteractor((RelayConnectionInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RelayConnectionInterface.class), null, null), (Codec) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Codec.class), null, null), (JsonRpcHistory) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcHistory.class), null, null), (PushMessagesRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PushMessagesRepository.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null), (ConditionalExponentialBackoffStrategy) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ConditionalExponentialBackoffStrategy.class), null, null));
                    }
                };
                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                Kind kind = Kind.Singleton;
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(RelayJsonRpcInteractorInterface.class), null, c06951, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
                UtilFunctionsKt.addSerializerEntry(c59991ztT, C56524yIo.AEQbTJ(PairingRpc.PairingPing.class));
                UtilFunctionsKt.addSerializerEntry(c59991ztT, C56524yIo.AEQbTJ(PairingRpc.PairingDelete.class));
                UtilFunctionsKt.addDeserializerEntry(c59991ztT, PairingJsonRpcMethod.WC_PAIRING_PING, C56524yIo.AEQbTJ(PairingRpc.PairingPing.class));
                UtilFunctionsKt.addDeserializerEntry(c59991ztT, PairingJsonRpcMethod.WC_PAIRING_DELETE, C56524yIo.AEQbTJ(PairingRpc.PairingDelete.class));
                AnonymousClass2 anonymousClass2 = new Function2<C60060zuj, C60053zuc, JsonRpcSerializer>() { // from class: com.reown.android.internal.common.di.CoreJsonRpcModuleKt.coreJsonRpcModule.1.2
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final JsonRpcSerializer invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new JsonRpcSerializer(CollectionsKt___CollectionsKt.OqFWZa(c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(InterfaceC56551yJo.class))), C56424yEw.copydefault(c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Pair.class))), CollectionsKt___CollectionsKt.OqFWZa(c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonAdapterEntry.class))), (Moshi.Builder) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Moshi.Builder.class), C60058zuh.OLrzqt(AndroidCommonDITags.MOSHI), null));
                    }
                };
                AbstractC59982ztK<?> c59981ztJ = new C59981ztJ<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(JsonRpcSerializer.class), null, anonymousClass2, Kind.Factory, yDY.AhwBna()));
                c59991ztT.KWHzl(c59981ztJ);
                new C59976ztE(c59991ztT, c59981ztJ);
                AnonymousClass3 anonymousClass3 = new Function2<C60060zuj, C60053zuc, LinkModeJsonRpcInteractorInterface>() { // from class: com.reown.android.internal.common.di.CoreJsonRpcModuleKt.coreJsonRpcModule.1.3
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final LinkModeJsonRpcInteractorInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new LinkModeJsonRpcInteractor((Codec) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Codec.class), null, null), (JsonRpcHistory) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JsonRpcHistory.class), null, null), C59930zsL.AEQbTJ(c60060zuj));
                    }
                };
                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(LinkModeJsonRpcInteractorInterface.class), null, anonymousClass3, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS2);
                }
                new C59976ztE(c59991ztT, c59990ztS2);
            }
        }, 1, null), CorePairingModuleKt.corePairingModule(coreProtocol.getPairing(), coreProtocol.getPairingController()), KeyServerModuleKt.keyServerModule(str3), C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.internal.common.di.ExplorerModuleKt.explorerModule.1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt = C60058zuh.OLrzqt(AndroidCommonDITags.EXPLORER_URL);
                C06981 c06981 = new Function2<C60060zuj, C60053zuc, String>() { // from class: com.reown.android.internal.common.di.ExplorerModuleKt.explorerModule.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final String invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return "https://registry.walletconnect.org/";
                    }
                };
                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                Kind kind = Kind.Singleton;
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(String.class), interfaceC59997ztZOLrzqt, c06981, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt2 = C60058zuh.OLrzqt(AndroidCommonDITags.EXPLORER_RETROFIT);
                AnonymousClass2 anonymousClass2 = new Function2<C60060zuj, C60053zuc, Retrofit>() { // from class: com.reown.android.internal.common.di.ExplorerModuleKt.explorerModule.1.2
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Retrofit invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new Retrofit.Builder().baseUrl((String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.EXPLORER_URL), null)).client((OkHttpClient) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OkHttpClient.class), C60058zuh.OLrzqt(AndroidCommonDITags.OK_HTTP), null)).addConverterFactory(MoshiConverterFactory.create((Moshi) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Moshi.class), C60058zuh.OLrzqt(AndroidCommonDITags.MOSHI), null))).build();
                    }
                };
                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(Retrofit.class), interfaceC59997ztZOLrzqt2, anonymousClass2, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS2);
                }
                new C59976ztE(c59991ztT, c59990ztS2);
                AnonymousClass3 anonymousClass3 = new Function2<C60060zuj, C60053zuc, ExplorerService>() { // from class: com.reown.android.internal.common.di.ExplorerModuleKt.explorerModule.1.3
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final ExplorerService invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return (ExplorerService) ((Retrofit) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Retrofit.class), C60058zuh.OLrzqt(AndroidCommonDITags.EXPLORER_RETROFIT), null)).create(ExplorerService.class);
                    }
                };
                C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(ExplorerService.class), null, anonymousClass3, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS3);
                }
                new C59976ztE(c59991ztT, c59990ztS3);
                AnonymousClass4 anonymousClass4 = new Function2<C60060zuj, C60053zuc, ExplorerRepository>() { // from class: com.reown.android.internal.common.di.ExplorerModuleKt.explorerModule.1.4
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final ExplorerRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new ExplorerRepository((ExplorerService) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ExplorerService.class), null, null), (ProjectId) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProjectId.class), null, null));
                    }
                };
                C59990ztS<?> c59990ztS4 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(ExplorerRepository.class), null, anonymousClass4, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS4);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS4);
                }
                new C59976ztE(c59991ztT, c59990ztS4);
                AnonymousClass5 anonymousClass5 = new Function2<C60060zuj, C60053zuc, GetProjectsWithPaginationUseCase>() { // from class: com.reown.android.internal.common.di.ExplorerModuleKt.explorerModule.1.5
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final GetProjectsWithPaginationUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new GetProjectsWithPaginationUseCase((ExplorerRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ExplorerRepository.class), null, null));
                    }
                };
                C59990ztS<?> c59990ztS5 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetProjectsWithPaginationUseCase.class), null, anonymousClass5, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS5);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS5);
                }
                new C59976ztE(c59991ztT, c59990ztS5);
                AnonymousClass6 anonymousClass6 = new Function2<C60060zuj, C60053zuc, GetNotifyConfigUseCase>() { // from class: com.reown.android.internal.common.di.ExplorerModuleKt.explorerModule.1.6
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final GetNotifyConfigUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new GetNotifyConfigUseCase((ExplorerRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ExplorerRepository.class), null, null));
                    }
                };
                C59990ztS<?> c59990ztS6 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetNotifyConfigUseCase.class), null, anonymousClass6, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS6);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS6);
                }
                new C59976ztE(c59991ztT, c59990ztS6);
            }
        }, 1, null), C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.internal.common.di.AppKitModuleKt.appKitModule.1
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(C59991ztT c59991ztT) {
                invoke2(c59991ztT);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt = C60058zuh.OLrzqt(AndroidCommonDITags.WEB3MODAL_URL);
                C06881 c06881 = new Function2<C60060zuj, C60053zuc, String>() { // from class: com.reown.android.internal.common.di.AppKitModuleKt.appKitModule.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final String invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return "https://api.web3modal.com/";
                    }
                };
                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                Kind kind = Kind.Singleton;
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(String.class), interfaceC59997ztZOLrzqt, c06881, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt2 = C60058zuh.OLrzqt(AndroidCommonDITags.APPKIT_INTERCEPTOR);
                AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(Interceptor.class), interfaceC59997ztZOLrzqt2, anonymousClass2, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS2);
                }
                new C59976ztE(c59991ztT, c59990ztS2);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt3 = C60058zuh.OLrzqt(AndroidCommonDITags.APPKIT_OKHTTP);
                AnonymousClass3 anonymousClass3 = new Function2<C60060zuj, C60053zuc, OkHttpClient>() { // from class: com.reown.android.internal.common.di.AppKitModuleKt.appKitModule.1.3
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final OkHttpClient invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return ((OkHttpClient) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OkHttpClient.class), C60058zuh.OLrzqt(AndroidCommonDITags.OK_HTTP), null)).newBuilder().addInterceptor((Interceptor) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Interceptor.class), C60058zuh.OLrzqt(AndroidCommonDITags.APPKIT_INTERCEPTOR), null)).build();
                    }
                };
                C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OkHttpClient.class), interfaceC59997ztZOLrzqt3, anonymousClass3, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS3);
                }
                new C59976ztE(c59991ztT, c59990ztS3);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt4 = C60058zuh.OLrzqt(AndroidCommonDITags.APPKIT_RETROFIT);
                AnonymousClass4 anonymousClass4 = new Function2<C60060zuj, C60053zuc, Retrofit>() { // from class: com.reown.android.internal.common.di.AppKitModuleKt.appKitModule.1.4
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Retrofit invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new Retrofit.Builder().baseUrl((String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.WEB3MODAL_URL), null)).client((OkHttpClient) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OkHttpClient.class), C60058zuh.OLrzqt(AndroidCommonDITags.APPKIT_OKHTTP), null)).addConverterFactory(MoshiConverterFactory.create((Moshi) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Moshi.class), C60058zuh.OLrzqt(AndroidCommonDITags.MOSHI), null))).build();
                    }
                };
                C59990ztS<?> c59990ztS4 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(Retrofit.class), interfaceC59997ztZOLrzqt4, anonymousClass4, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS4);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS4);
                }
                new C59976ztE(c59991ztT, c59990ztS4);
                AnonymousClass5 anonymousClass5 = new Function2<C60060zuj, C60053zuc, AppKitService>() { // from class: com.reown.android.internal.common.di.AppKitModuleKt.appKitModule.1.5
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final AppKitService invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return (AppKitService) ((Retrofit) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Retrofit.class), C60058zuh.OLrzqt(AndroidCommonDITags.APPKIT_RETROFIT), null)).create(AppKitService.class);
                    }
                };
                C59990ztS<?> c59990ztS5 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(AppKitService.class), null, anonymousClass5, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS5);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS5);
                }
                new C59976ztE(c59991ztT, c59990ztS5);
                AnonymousClass6 anonymousClass6 = new Function2<C60060zuj, C60053zuc, AppKitApiRepository>() { // from class: com.reown.android.internal.common.di.AppKitModuleKt.appKitModule.1.6
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final AppKitApiRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new AppKitApiRepository(C59930zsL.AEQbTJ(c60060zuj), (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.WEB3MODAL_URL), null), (AppKitService) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AppKitService.class), null, null));
                    }
                };
                C59990ztS<?> c59990ztS6 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(AppKitApiRepository.class), null, anonymousClass6, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS6);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS6);
                }
                new C59976ztE(c59991ztT, c59990ztS6);
                AnonymousClass7 anonymousClass7 = new Function2<C60060zuj, C60053zuc, GetInstalledWalletsIdsUseCaseInterface>() { // from class: com.reown.android.internal.common.di.AppKitModuleKt.appKitModule.1.7
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final GetInstalledWalletsIdsUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new GetInstalledWalletsIdsUseCase((AppKitApiRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AppKitApiRepository.class), null, null));
                    }
                };
                C59990ztS<?> c59990ztS7 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetInstalledWalletsIdsUseCaseInterface.class), null, anonymousClass7, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS7);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS7);
                }
                new C59976ztE(c59991ztT, c59990ztS7);
                AnonymousClass8 anonymousClass8 = new Function2<C60060zuj, C60053zuc, GetWalletsUseCaseInterface>() { // from class: com.reown.android.internal.common.di.AppKitModuleKt.appKitModule.1.8
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final GetWalletsUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new GetWalletsUseCase((AppKitApiRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AppKitApiRepository.class), null, null));
                    }
                };
                C59990ztS<?> c59990ztS8 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetWalletsUseCaseInterface.class), null, anonymousClass8, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS8);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS8);
                }
                new C59976ztE(c59991ztT, c59990ztS8);
                AnonymousClass9 anonymousClass9 = new Function2<C60060zuj, C60053zuc, GetSampleWalletsUseCaseInterface>() { // from class: com.reown.android.internal.common.di.AppKitModuleKt.appKitModule.1.9
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final GetSampleWalletsUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new GetSampleWalletsUseCase((Context) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Context.class), null, null));
                    }
                };
                C59990ztS<?> c59990ztS9 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(GetSampleWalletsUseCaseInterface.class), null, anonymousClass9, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS9);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS9);
                }
                new C59976ztE(c59991ztT, c59990ztS9);
                AnonymousClass10 anonymousClass10 = new Function2<C60060zuj, C60053zuc, EnableAnalyticsUseCaseInterface>() { // from class: com.reown.android.internal.common.di.AppKitModuleKt.appKitModule.1.10
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final EnableAnalyticsUseCaseInterface invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new EnableAnalyticsUseCase((AppKitApiRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(AppKitApiRepository.class), null, null));
                    }
                };
                C59990ztS<?> c59990ztS10 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(EnableAnalyticsUseCaseInterface.class), null, anonymousClass10, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS10);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS10);
                }
                new C59976ztE(c59991ztT, c59990ztS10);
            }

            /* JADX INFO: renamed from: com.reown.android.internal.common.di.AppKitModuleKt$appKitModule$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends Lambda implements Function2<C60060zuj, C60053zuc, Interceptor> {
                public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2() {
                    super(2);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Interceptor invoke(@NotNull final C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000d: RETURN 
                          (wrap:okhttp3.Interceptor:0x000a: CONSTRUCTOR (r2v0 'c60060zuj' o.zuj A[DONT_INLINE]) A[MD:(o.zuj):void (m), WRAPPED] (LINE:28) call: com.reown.android.internal.common.di.AppKitModuleKt$appKitModule$1$2$$ExternalSyntheticLambda0.<init>(o.zuj):void type: CONSTRUCTOR)
                         (LINE:28) in method: com.reown.android.internal.common.di.AppKitModuleKt.appKitModule.1.2.invoke(o.zuj, o.zuc):okhttp3.Interceptor, file: classes12.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.reown.android.internal.common.di.AppKitModuleKt$appKitModule$1$2$$ExternalSyntheticLambda0, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 15 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = ""
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                        com.reown.android.internal.common.di.AppKitModuleKt$appKitModule$1$2$$ExternalSyntheticLambda0 r3 = new com.reown.android.internal.common.di.AppKitModuleKt$appKitModule$1$2$$ExternalSyntheticLambda0
                        r3.<init>(r2)
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.reown.android.internal.common.di.AppKitModuleKt.AnonymousClass1.AnonymousClass2.invoke(o.zuj, o.zuc):okhttp3.Interceptor");
                }

                public static final Response invoke$lambda$0(C60060zuj c60060zuj, Interceptor.Chain chain) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(chain, "");
                    return chain.proceed(chain.request().newBuilder().addHeader("x-project-id", ((ProjectId) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProjectId.class), null, null)).getValue()).addHeader("x-sdk-version", "kotlin-1.0.4").build());
                }
            }
        }, 1, null), PulseModuleKt.pulseModule(packageName));
        coreProtocol.getPairing().initialize();
        coreProtocol.getPairingController().initialize();
        coreProtocol.getVerify().initialize();
    }
}
