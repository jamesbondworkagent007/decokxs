package com.reown.android.internal.common.di;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import com.reown.android.internal.common.ConditionalExponentialBackoffStrategy;
import com.reown.android.internal.common.connection.ConnectivityState;
import com.reown.android.internal.common.connection.DefaultConnectionLifecycle;
import com.reown.android.internal.common.connection.ManualConnectionLifecycle;
import com.reown.android.internal.common.di.CoreNetworkModuleKt;
import com.reown.android.internal.common.jwt.clientid.GenerateJwtStoreClientIdUseCase;
import com.reown.android.relay.ConnectionType;
import com.reown.android.relay.NetworkClientTimeout;
import com.reown.foundation.crypto.data.repository.ClientIdJwtRepository;
import com.reown.foundation.network.data.adapter.FlowStreamAdapter;
import com.reown.foundation.network.data.service.RelayService;
import com.squareup.moshi.Moshi;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AbstractC59982ztK;
import o.C56524yIo;
import o.C57848yqE;
import o.C58081yuZ;
import o.C58085yud;
import o.C58142yvh;
import o.C59930zsL;
import o.C59976ztE;
import o.C59978ztG;
import o.C59981ztJ;
import o.C59990ztS;
import o.C59991ztT;
import o.C60053zuc;
import o.C60055zue;
import o.C60058zuh;
import o.C60059zui;
import o.C60060zuj;
import o.C60064zun;
import o.InterfaceC58026ytX;
import o.InterfaceC58028ytZ;
import o.InterfaceC58080yuY;
import o.InterfaceC58091yuj;
import o.InterfaceC59997ztZ;
import o.yDY;
import okhttp3.Authenticator;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes12.dex */
public final class CoreNetworkModuleKt {
    public static final long INIT_BACKOFF_MILLIS = 1;
    public static final String KEY_CLIENT_ID = "clientId";
    public static final long MAX_BACKOFF_SEC = 20;

    public static final /* synthetic */ C59991ztT coreAndroidNetworkModule(final String str, final ConnectionType connectionType, final String str2, final NetworkClientTimeout networkClientTimeout, final String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(connectionType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt.coreAndroidNetworkModule.1
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
                final NetworkClientTimeout defaultTimeout = networkClientTimeout;
                if (defaultTimeout == null) {
                    defaultTimeout = NetworkClientTimeout.Companion.getDefaultTimeout();
                }
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt = C60058zuh.OLrzqt(AndroidCommonDITags.RELAY_URL);
                final String str4 = str;
                final String str5 = str3;
                Function2<C60060zuj, C60053zuc, String> function2 = new Function2<C60060zuj, C60053zuc, String>() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt.coreAndroidNetworkModule.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final String invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return Uri.parse(str4).buildUpon().appendQueryParameter("auth", ((GenerateJwtStoreClientIdUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(GenerateJwtStoreClientIdUseCase.class), null, null)).invoke(str4)).appendQueryParameter("ua", (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.USER_AGENT), null)).appendQueryParameter("packageName", str5).build().toString();
                    }
                };
                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                Kind kind = Kind.Factory;
                AbstractC59982ztK<?> c59981ztJ = new C59981ztJ<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(String.class), interfaceC59997ztZOLrzqt, function2, kind, yDY.AhwBna()));
                c59991ztT.KWHzl(c59981ztJ);
                new C59976ztE(c59991ztT, c59981ztJ);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt2 = C60058zuh.OLrzqt(AndroidCommonDITags.USER_AGENT);
                final String str6 = str2;
                Function2<C60060zuj, C60053zuc, String> function22 = new Function2<C60060zuj, C60053zuc, String>() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt.coreAndroidNetworkModule.1.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final String invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return "wc-2/reown-kotlin-" + str6 + "/android-" + Build.VERSION.RELEASE;
                    }
                };
                AbstractC59982ztK<?> c59981ztJ2 = new C59981ztJ<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(String.class), interfaceC59997ztZOLrzqt2, function22, kind, yDY.AhwBna()));
                c59991ztT.KWHzl(c59981ztJ2);
                new C59976ztE(c59991ztT, c59981ztJ2);
                AnonymousClass3 anonymousClass3 = new Function2<C60060zuj, C60053zuc, GenerateJwtStoreClientIdUseCase>() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt.coreAndroidNetworkModule.1.3
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final GenerateJwtStoreClientIdUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new GenerateJwtStoreClientIdUseCase((ClientIdJwtRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ClientIdJwtRepository.class), null, null), (SharedPreferences) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(SharedPreferences.class), null, null));
                    }
                };
                C60055zue c60055zueKWHzl2 = taskDescription.KWHzl();
                Kind kind2 = Kind.Singleton;
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl2, C56524yIo.AEQbTJ(GenerateJwtStoreClientIdUseCase.class), null, anonymousClass3, kind2, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt3 = C60058zuh.OLrzqt(AndroidCommonDITags.SHARED_INTERCEPTOR);
                AnonymousClass4 anonymousClass4 = AnonymousClass4.INSTANCE;
                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(Interceptor.class), interfaceC59997ztZOLrzqt3, anonymousClass4, kind2, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS2);
                }
                new C59976ztE(c59991ztT, c59990ztS2);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt4 = C60058zuh.OLrzqt(AndroidCommonDITags.LOGGING_INTERCEPTOR);
                AnonymousClass5 anonymousClass5 = new Function2<C60060zuj, C60053zuc, Interceptor>() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt.coreAndroidNetworkModule.1.5
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Interceptor invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
                        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                        return httpLoggingInterceptor;
                    }
                };
                C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(Interceptor.class), interfaceC59997ztZOLrzqt4, anonymousClass5, kind2, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS3);
                }
                new C59976ztE(c59991ztT, c59990ztS3);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt5 = C60058zuh.OLrzqt(AndroidCommonDITags.AUTHENTICATOR);
                AnonymousClass6 anonymousClass6 = new AnonymousClass6(str);
                C59990ztS<?> c59990ztS4 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(Authenticator.class), interfaceC59997ztZOLrzqt5, anonymousClass6, kind2, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS4);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS4);
                }
                new C59976ztE(c59991ztT, c59990ztS4);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt6 = C60058zuh.OLrzqt(AndroidCommonDITags.OK_HTTP);
                Function2<C60060zuj, C60053zuc, OkHttpClient> function23 = new Function2<C60060zuj, C60053zuc, OkHttpClient>() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt.coreAndroidNetworkModule.1.7
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final OkHttpClient invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        OkHttpClient.Builder builderConnectTimeout = new OkHttpClient.Builder().addInterceptor((Interceptor) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Interceptor.class), C60058zuh.OLrzqt(AndroidCommonDITags.SHARED_INTERCEPTOR), null)).authenticator((Authenticator) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Authenticator.class), C60058zuh.OLrzqt(AndroidCommonDITags.AUTHENTICATOR), null)).writeTimeout(defaultTimeout.getTimeout(), defaultTimeout.getTimeUnit()).readTimeout(defaultTimeout.getTimeout(), defaultTimeout.getTimeUnit()).callTimeout(defaultTimeout.getTimeout(), defaultTimeout.getTimeUnit()).connectTimeout(defaultTimeout.getTimeout(), defaultTimeout.getTimeUnit());
                        Interceptor interceptor = (Interceptor) C57848yqE.copydefault.copydefault();
                        if (interceptor != null) {
                            builderConnectTimeout.addInterceptor(interceptor);
                        }
                        return builderConnectTimeout.retryOnConnectionFailure(true).build();
                    }
                };
                C59990ztS<?> c59990ztS5 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OkHttpClient.class), interfaceC59997ztZOLrzqt6, function23, kind2, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS5);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS5);
                }
                new C59976ztE(c59991ztT, c59990ztS5);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt7 = C60058zuh.OLrzqt(AndroidCommonDITags.MSG_ADAPTER);
                AnonymousClass8 anonymousClass8 = new Function2<C60060zuj, C60053zuc, C58081yuZ.Activity>() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt.coreAndroidNetworkModule.1.8
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final C58081yuZ.Activity invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        Moshi moshiBuild = ((Moshi.Builder) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Moshi.Builder.class), C60058zuh.OLrzqt(AndroidCommonDITags.MOSHI), null)).build();
                        Intrinsics.checkNotNullExpressionValue(moshiBuild, "");
                        return new C58081yuZ.Activity(moshiBuild, null, 2, null);
                    }
                };
                C59990ztS<?> c59990ztS6 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(C58081yuZ.Activity.class), interfaceC59997ztZOLrzqt7, anonymousClass8, kind2, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS6);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS6);
                }
                new C59976ztE(c59991ztT, c59990ztS6);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt8 = C60058zuh.OLrzqt(AndroidCommonDITags.MANUAL_CONNECTION_LIFECYCLE);
                AnonymousClass9 anonymousClass9 = new Function2<C60060zuj, C60053zuc, ManualConnectionLifecycle>() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt.coreAndroidNetworkModule.1.9
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final ManualConnectionLifecycle invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new ManualConnectionLifecycle(null, 1, null);
                    }
                };
                C59990ztS<?> c59990ztS7 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(ManualConnectionLifecycle.class), interfaceC59997ztZOLrzqt8, anonymousClass9, kind2, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS7);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS7);
                }
                new C59976ztE(c59991ztT, c59990ztS7);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt9 = C60058zuh.OLrzqt(AndroidCommonDITags.DEFAULT_CONNECTION_LIFECYCLE);
                AnonymousClass10 anonymousClass10 = new Function2<C60060zuj, C60053zuc, DefaultConnectionLifecycle>() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt.coreAndroidNetworkModule.1.10
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final DefaultConnectionLifecycle invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new DefaultConnectionLifecycle(C59930zsL.copydefault(c60060zuj), null, 2, null);
                    }
                };
                C59990ztS<?> c59990ztS8 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(DefaultConnectionLifecycle.class), interfaceC59997ztZOLrzqt9, anonymousClass10, kind2, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS8);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS8);
                }
                new C59976ztE(c59991ztT, c59990ztS8);
                AnonymousClass11 anonymousClass11 = new Function2<C60060zuj, C60053zuc, ConditionalExponentialBackoffStrategy>() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt.coreAndroidNetworkModule.1.11
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final ConditionalExponentialBackoffStrategy invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new ConditionalExponentialBackoffStrategy(1L, TimeUnit.SECONDS.toMillis(20L));
                    }
                };
                C59990ztS<?> c59990ztS9 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(ConditionalExponentialBackoffStrategy.class), null, anonymousClass11, kind2, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS9);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS9);
                }
                new C59976ztE(c59991ztT, c59990ztS9);
                AnonymousClass12 anonymousClass12 = new Function2<C60060zuj, C60053zuc, FlowStreamAdapter.Factory>() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt.coreAndroidNetworkModule.1.12
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final FlowStreamAdapter.Factory invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new FlowStreamAdapter.Factory();
                    }
                };
                C59990ztS<?> c59990ztS10 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(FlowStreamAdapter.Factory.class), null, anonymousClass12, kind2, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS10);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS10);
                }
                new C59976ztE(c59991ztT, c59990ztS10);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt10 = C60058zuh.OLrzqt(AndroidCommonDITags.SCARLET);
                final ConnectionType connectionType2 = connectionType;
                Function2<C60060zuj, C60053zuc, C58085yud> function24 = new Function2<C60060zuj, C60053zuc, C58085yud>() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt.coreAndroidNetworkModule.1.13
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final C58085yud invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new C58085yud.Activity().KWHzl((InterfaceC58080yuY) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ConditionalExponentialBackoffStrategy.class), null, null)).KWHzl(C58142yvh.OLrzqt((OkHttpClient) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OkHttpClient.class), C60058zuh.OLrzqt(AndroidCommonDITags.OK_HTTP), null), (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.RELAY_URL), null))).AEQbTJ(CoreNetworkModuleKt.getLifecycle(c60060zuj, connectionType2)).AEQbTJ((InterfaceC58026ytX.TaskDescription) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(C58081yuZ.Activity.class), C60058zuh.OLrzqt(AndroidCommonDITags.MSG_ADAPTER), null)).KWHzl((InterfaceC58091yuj.TaskDescription) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(FlowStreamAdapter.Factory.class), null, null)).copydefault();
                    }
                };
                C59990ztS<?> c59990ztS11 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(C58085yud.class), interfaceC59997ztZOLrzqt10, function24, kind2, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS11);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS11);
                }
                new C59976ztE(c59991ztT, c59990ztS11);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt11 = C60058zuh.OLrzqt(AndroidCommonDITags.RELAY_SERVICE);
                AnonymousClass14 anonymousClass14 = new Function2<C60060zuj, C60053zuc, RelayService>() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt.coreAndroidNetworkModule.1.14
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final RelayService invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return (RelayService) ((C58085yud) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(C58085yud.class), C60058zuh.OLrzqt(AndroidCommonDITags.SCARLET), null)).copydefault(RelayService.class);
                    }
                };
                C59990ztS<?> c59990ztS12 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(RelayService.class), interfaceC59997ztZOLrzqt11, anonymousClass14, kind2, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS12);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS12);
                }
                new C59976ztE(c59991ztT, c59990ztS12);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt12 = C60058zuh.OLrzqt(AndroidCommonDITags.CONNECTIVITY_STATE);
                AnonymousClass15 anonymousClass15 = new Function2<C60060zuj, C60053zuc, ConnectivityState>() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt.coreAndroidNetworkModule.1.15
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final ConnectivityState invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new ConnectivityState(C59930zsL.copydefault(c60060zuj));
                    }
                };
                C59990ztS<?> c59990ztS13 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(ConnectivityState.class), interfaceC59997ztZOLrzqt12, anonymousClass15, kind2, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS13);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS13);
                }
                new C59976ztE(c59991ztT, c59990ztS13);
            }

            /* JADX INFO: renamed from: com.reown.android.internal.common.di.CoreNetworkModuleKt$coreAndroidNetworkModule$1$4, reason: invalid class name */
            public static final class AnonymousClass4 extends Lambda implements Function2<C60060zuj, C60053zuc, Interceptor> {
                public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass4() {
                    super(2);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Interceptor invoke(@NotNull final C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    return new Interceptor() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt$coreAndroidNetworkModule$1$4$$ExternalSyntheticLambda0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) {
                            return CoreNetworkModuleKt.AnonymousClass1.AnonymousClass4.invoke$lambda$0(c60060zuj, chain);
                        }
                    };
                }

                public static final Response invoke$lambda$0(C60060zuj c60060zuj, Interceptor.Chain chain) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(chain, "");
                    return chain.proceed(chain.request().newBuilder().addHeader("User-Agent", (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.USER_AGENT), null)).build());
                }
            }

            /* JADX INFO: renamed from: com.reown.android.internal.common.di.CoreNetworkModuleKt$coreAndroidNetworkModule$1$6, reason: invalid class name */
            public static final class AnonymousClass6 extends Lambda implements Function2<C60060zuj, C60053zuc, Authenticator> {
                public final /* synthetic */ String $serverUrl;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass6(String str) {
                    super(2);
                    this.$serverUrl = str;
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Authenticator invoke(@NotNull final C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    final String str = this.$serverUrl;
                    return new Authenticator() { // from class: com.reown.android.internal.common.di.CoreNetworkModuleKt$coreAndroidNetworkModule$1$6$$ExternalSyntheticLambda0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // okhttp3.Authenticator
                        public final Request authenticate(Route route, Response response) {
                            return CoreNetworkModuleKt.AnonymousClass1.AnonymousClass6.invoke$lambda$1(str, c60060zuj, route, response);
                        }
                    };
                }

                public static final Request invoke$lambda$1(String str, C60060zuj c60060zuj, Route route, Response response) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(response, "");
                    Request request = response.request();
                    if (!Intrinsics.EZpvd((Object) Uri.parse(str).getHost(), (Object) request.url().host())) {
                        return null;
                    }
                    return request.newBuilder().url((String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.RELAY_URL), null)).build();
                }
            }
        }, 1, null);
    }

    public static /* synthetic */ C59991ztT coreAndroidNetworkModule$default(String str, ConnectionType connectionType, String str2, NetworkClientTimeout networkClientTimeout, String str3, int i, Object obj) {
        if ((i & 8) != 0) {
            networkClientTimeout = null;
        }
        return coreAndroidNetworkModule(str, connectionType, str2, networkClientTimeout, str3);
    }

    public static final InterfaceC58028ytZ getLifecycle(C60060zuj c60060zuj, ConnectionType connectionType) {
        if (connectionType == ConnectionType.MANUAL) {
            return (InterfaceC58028ytZ) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ManualConnectionLifecycle.class), C60058zuh.OLrzqt(AndroidCommonDITags.MANUAL_CONNECTION_LIFECYCLE), null);
        }
        return (InterfaceC58028ytZ) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(DefaultConnectionLifecycle.class), C60058zuh.OLrzqt(AndroidCommonDITags.DEFAULT_CONNECTION_LIFECYCLE), null);
    }
}
