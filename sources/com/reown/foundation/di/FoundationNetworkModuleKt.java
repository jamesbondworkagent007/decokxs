package com.reown.foundation.di;

import com.reown.foundation.di.FoundationNetworkModuleKt;
import com.reown.foundation.network.BaseRelayClient;
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
import o.C58079yuX;
import o.C58081yuZ;
import o.C58085yud;
import o.C58142yvh;
import o.C59976ztE;
import o.C59978ztG;
import o.C59990ztS;
import o.C59991ztT;
import o.C60053zuc;
import o.C60055zue;
import o.C60058zuh;
import o.C60059zui;
import o.C60060zuj;
import o.C60064zun;
import o.InterfaceC58026ytX;
import o.InterfaceC58080yuY;
import o.InterfaceC58091yuj;
import o.InterfaceC59997ztZ;
import o.yDY;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes24.dex */
public final class FoundationNetworkModuleKt {
    public static final C59991ztT networkModule(@NotNull final String str, @NotNull final String str2, @NotNull final String str3, @NotNull final String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.foundation.di.FoundationNetworkModuleKt.networkModule.1
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

            /* JADX INFO: renamed from: com.reown.foundation.di.FoundationNetworkModuleKt$networkModule$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C07291 extends Lambda implements Function2<C60060zuj, C60053zuc, Interceptor> {
                final /* synthetic */ String $sdkVersion;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07291(String str) {
                    super(2);
                    this.$sdkVersion = str;
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Interceptor invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    final String str = this.$sdkVersion;
                    return new Interceptor() { // from class: com.reown.foundation.di.FoundationNetworkModuleKt$networkModule$1$1$$ExternalSyntheticLambda0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) {
                            return FoundationNetworkModuleKt.AnonymousClass1.C07291.invoke$lambda$0(str, chain);
                        }
                    };
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Response invoke$lambda$0(String str, Interceptor.Chain chain) {
                    Intrinsics.checkNotNullParameter(str, "");
                    Intrinsics.checkNotNullParameter(chain, "");
                    return chain.proceed(chain.request().newBuilder().addHeader("User-Agent", "wc-2/kotlin-" + str).build());
                }
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull C59991ztT c59991ztT) {
                Intrinsics.checkNotNullParameter(c59991ztT, "");
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt = C60058zuh.OLrzqt(FoundationDITags.INTERCEPTOR);
                C07291 c07291 = new C07291(str2);
                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                Kind kind = Kind.Singleton;
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(Interceptor.class), interfaceC59997ztZOLrzqt, c07291, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt2 = C60058zuh.OLrzqt(FoundationDITags.OK_HTTP);
                final long j = 40000;
                Function2<C60060zuj, C60053zuc, OkHttpClient> function2 = new Function2<C60060zuj, C60053zuc, OkHttpClient>() { // from class: com.reown.foundation.di.FoundationNetworkModuleKt.networkModule.1.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final OkHttpClient invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        OkHttpClient.Builder builderAddInterceptor = new OkHttpClient.Builder().addInterceptor((Interceptor) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Interceptor.class), C60058zuh.OLrzqt(FoundationDITags.INTERCEPTOR), null)).addInterceptor(new HttpLoggingInterceptor(null, 1, null).setLevel(HttpLoggingInterceptor.Level.BODY));
                        long j2 = j;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        return builderAddInterceptor.writeTimeout(j2, timeUnit).readTimeout(j, timeUnit).callTimeout(j, timeUnit).connectTimeout(j, timeUnit).build();
                    }
                };
                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(OkHttpClient.class), interfaceC59997ztZOLrzqt2, function2, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS2);
                }
                new C59976ztE(c59991ztT, c59990ztS2);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt3 = C60058zuh.OLrzqt(FoundationDITags.MSG_ADAPTER);
                AnonymousClass3 anonymousClass3 = new Function2<C60060zuj, C60053zuc, C58081yuZ.Activity>() { // from class: com.reown.foundation.di.FoundationNetworkModuleKt.networkModule.1.3
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final C58081yuZ.Activity invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new C58081yuZ.Activity((Moshi) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Moshi.class), C60058zuh.OLrzqt(FoundationDITags.MOSHI), null), null, 2, null);
                    }
                };
                C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(C58081yuZ.Activity.class), interfaceC59997ztZOLrzqt3, anonymousClass3, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS3);
                }
                new C59976ztE(c59991ztT, c59990ztS3);
                AnonymousClass4 anonymousClass4 = new Function2<C60060zuj, C60053zuc, FlowStreamAdapter.Factory>() { // from class: com.reown.foundation.di.FoundationNetworkModuleKt.networkModule.1.4
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final FlowStreamAdapter.Factory invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new FlowStreamAdapter.Factory();
                    }
                };
                C59990ztS<?> c59990ztS4 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(FlowStreamAdapter.Factory.class), null, anonymousClass4, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS4);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS4);
                }
                new C59976ztE(c59991ztT, c59990ztS4);
                final long j2 = 5;
                Function2<C60060zuj, C60053zuc, C58079yuX> function22 = new Function2<C60060zuj, C60053zuc, C58079yuX>() { // from class: com.reown.foundation.di.FoundationNetworkModuleKt.networkModule.1.5
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final C58079yuX invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new C58079yuX(TimeUnit.SECONDS.toMillis(j2));
                    }
                };
                C59990ztS<?> c59990ztS5 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(C58079yuX.class), null, function22, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS5);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS5);
                }
                new C59976ztE(c59991ztT, c59990ztS5);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt4 = C60058zuh.OLrzqt(FoundationDITags.SCARLET);
                final String str5 = str;
                final String str6 = str3;
                final String str7 = str4;
                Function2<C60060zuj, C60053zuc, C58085yud> function23 = new Function2<C60060zuj, C60053zuc, C58085yud>() { // from class: com.reown.foundation.di.FoundationNetworkModuleKt.networkModule.1.6
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final C58085yud invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new C58085yud.Activity().KWHzl((InterfaceC58080yuY) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(C58079yuX.class), null, null)).KWHzl(C58142yvh.OLrzqt((OkHttpClient) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OkHttpClient.class), C60058zuh.OLrzqt(FoundationDITags.OK_HTTP), null), str5 + "&auth=" + str6 + "&packageName=" + str7)).AEQbTJ((InterfaceC58026ytX.TaskDescription) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(C58081yuZ.Activity.class), C60058zuh.OLrzqt(FoundationDITags.MSG_ADAPTER), null)).KWHzl((InterfaceC58091yuj.TaskDescription) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(FlowStreamAdapter.Factory.class), null, null)).copydefault();
                    }
                };
                C59990ztS<?> c59990ztS6 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(C58085yud.class), interfaceC59997ztZOLrzqt4, function23, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS6);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS6);
                }
                new C59976ztE(c59991ztT, c59990ztS6);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt5 = C60058zuh.OLrzqt(FoundationDITags.RELAY_SERVICE);
                AnonymousClass7 anonymousClass7 = new Function2<C60060zuj, C60053zuc, RelayService>() { // from class: com.reown.foundation.di.FoundationNetworkModuleKt.networkModule.1.7
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final RelayService invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return (RelayService) ((C58085yud) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(C58085yud.class), C60058zuh.OLrzqt(FoundationDITags.SCARLET), null)).copydefault(RelayService.class);
                    }
                };
                C59990ztS<?> c59990ztS7 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(RelayService.class), interfaceC59997ztZOLrzqt5, anonymousClass7, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS7);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS7);
                }
                new C59976ztE(c59991ztT, c59990ztS7);
                AnonymousClass8 anonymousClass8 = new Function2<C60060zuj, C60053zuc, BaseRelayClient>() { // from class: com.reown.foundation.di.FoundationNetworkModuleKt.networkModule.1.8
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final BaseRelayClient invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new BaseRelayClient() { // from class: com.reown.foundation.di.FoundationNetworkModuleKt.networkModule.1.8.1
                        };
                    }
                };
                C59990ztS<?> c59990ztS8 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(BaseRelayClient.class), null, anonymousClass8, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS8);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS8);
                }
                new C59976ztE(c59991ztT, c59990ztS8);
            }
        }, 1, null);
    }
}
