package com.reown.android.internal.common.di;

import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.model.ProjectId;
import com.reown.android.internal.common.storage.identity.IdentitiesStorageRepository;
import com.reown.android.keyserver.data.service.KeyServerService;
import com.reown.android.keyserver.domain.IdentitiesInteractor;
import com.reown.android.keyserver.domain.use_case.RegisterIdentityUseCase;
import com.reown.android.keyserver.domain.use_case.RegisterInviteUseCase;
import com.reown.android.keyserver.domain.use_case.ResolveIdentityUseCase;
import com.reown.android.keyserver.domain.use_case.ResolveInviteUseCase;
import com.reown.android.keyserver.domain.use_case.UnregisterIdentityUseCase;
import com.reown.android.keyserver.domain.use_case.UnregisterInviteUseCase;
import com.reown.foundation.util.Logger;
import com.squareup.moshi.Moshi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC59982ztK;
import o.C56524yIo;
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
import o.InterfaceC59997ztZ;
import o.yDY;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class KeyServerModuleKt {
    public static final String DEFAULT_KEYSERVER_URL = "https://keys.walletconnect.org";

    public static final /* synthetic */ C59991ztT keyServerModule(final String str) {
        return C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.internal.common.di.KeyServerModuleKt.keyServerModule.1
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
                final String str2 = str;
                if (str2 == null) {
                    str2 = KeyServerModuleKt.DEFAULT_KEYSERVER_URL;
                }
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt = C60058zuh.OLrzqt(AndroidCommonDITags.KEYSERVER_URL);
                Function2<C60060zuj, C60053zuc, String> function2 = new Function2<C60060zuj, C60053zuc, String>() { // from class: com.reown.android.internal.common.di.KeyServerModuleKt.keyServerModule.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final String invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return str2;
                    }
                };
                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                Kind kind = Kind.Singleton;
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(String.class), interfaceC59997ztZOLrzqt, function2, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt2 = C60058zuh.OLrzqt(AndroidCommonDITags.KEYSERVER_RETROFIT);
                Function2<C60060zuj, C60053zuc, Retrofit> function22 = new Function2<C60060zuj, C60053zuc, Retrofit>() { // from class: com.reown.android.internal.common.di.KeyServerModuleKt.keyServerModule.1.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Retrofit invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new Retrofit.Builder().baseUrl(str2).client((OkHttpClient) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OkHttpClient.class), C60058zuh.OLrzqt(AndroidCommonDITags.OK_HTTP), null)).addConverterFactory(MoshiConverterFactory.create((Moshi) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Moshi.class), C60058zuh.OLrzqt(AndroidCommonDITags.MOSHI), null))).build();
                    }
                };
                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(Retrofit.class), interfaceC59997ztZOLrzqt2, function22, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS2);
                }
                new C59976ztE(c59991ztT, c59990ztS2);
                AnonymousClass3 anonymousClass3 = new Function2<C60060zuj, C60053zuc, KeyServerService>() { // from class: com.reown.android.internal.common.di.KeyServerModuleKt.keyServerModule.1.3
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final KeyServerService invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return (KeyServerService) ((Retrofit) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Retrofit.class), C60058zuh.OLrzqt(AndroidCommonDITags.KEYSERVER_RETROFIT), null)).create(KeyServerService.class);
                    }
                };
                C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(KeyServerService.class), null, anonymousClass3, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS3);
                }
                new C59976ztE(c59991ztT, c59990ztS3);
                AnonymousClass4 anonymousClass4 = new Function2<C60060zuj, C60053zuc, RegisterIdentityUseCase>() { // from class: com.reown.android.internal.common.di.KeyServerModuleKt.keyServerModule.1.4
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final RegisterIdentityUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new RegisterIdentityUseCase((KeyServerService) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyServerService.class), null, null));
                    }
                };
                C59990ztS<?> c59990ztS4 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(RegisterIdentityUseCase.class), null, anonymousClass4, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS4);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS4);
                }
                new C59976ztE(c59991ztT, c59990ztS4);
                AnonymousClass5 anonymousClass5 = new Function2<C60060zuj, C60053zuc, UnregisterIdentityUseCase>() { // from class: com.reown.android.internal.common.di.KeyServerModuleKt.keyServerModule.1.5
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final UnregisterIdentityUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new UnregisterIdentityUseCase((KeyServerService) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyServerService.class), null, null));
                    }
                };
                C59990ztS<?> c59990ztS5 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(UnregisterIdentityUseCase.class), null, anonymousClass5, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS5);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS5);
                }
                new C59976ztE(c59991ztT, c59990ztS5);
                AnonymousClass6 anonymousClass6 = new Function2<C60060zuj, C60053zuc, ResolveIdentityUseCase>() { // from class: com.reown.android.internal.common.di.KeyServerModuleKt.keyServerModule.1.6
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final ResolveIdentityUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new ResolveIdentityUseCase((KeyServerService) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyServerService.class), null, null));
                    }
                };
                C59990ztS<?> c59990ztS6 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(ResolveIdentityUseCase.class), null, anonymousClass6, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS6);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS6);
                }
                new C59976ztE(c59991ztT, c59990ztS6);
                AnonymousClass7 anonymousClass7 = new Function2<C60060zuj, C60053zuc, RegisterInviteUseCase>() { // from class: com.reown.android.internal.common.di.KeyServerModuleKt.keyServerModule.1.7
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final RegisterInviteUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new RegisterInviteUseCase((KeyServerService) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyServerService.class), null, null));
                    }
                };
                C59990ztS<?> c59990ztS7 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(RegisterInviteUseCase.class), null, anonymousClass7, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS7);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS7);
                }
                new C59976ztE(c59991ztT, c59990ztS7);
                AnonymousClass8 anonymousClass8 = new Function2<C60060zuj, C60053zuc, UnregisterInviteUseCase>() { // from class: com.reown.android.internal.common.di.KeyServerModuleKt.keyServerModule.1.8
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final UnregisterInviteUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new UnregisterInviteUseCase((KeyServerService) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyServerService.class), null, null));
                    }
                };
                C59990ztS<?> c59990ztS8 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(UnregisterInviteUseCase.class), null, anonymousClass8, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS8);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS8);
                }
                new C59976ztE(c59991ztT, c59990ztS8);
                AnonymousClass9 anonymousClass9 = new Function2<C60060zuj, C60053zuc, ResolveInviteUseCase>() { // from class: com.reown.android.internal.common.di.KeyServerModuleKt.keyServerModule.1.9
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final ResolveInviteUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new ResolveInviteUseCase((KeyServerService) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyServerService.class), null, null));
                    }
                };
                C59990ztS<?> c59990ztS9 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(ResolveInviteUseCase.class), null, anonymousClass9, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS9);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS9);
                }
                new C59976ztE(c59991ztT, c59990ztS9);
                AnonymousClass10 anonymousClass10 = new Function2<C60060zuj, C60053zuc, IdentitiesInteractor>() { // from class: com.reown.android.internal.common.di.KeyServerModuleKt.keyServerModule.1.10
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final IdentitiesInteractor invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new IdentitiesInteractor((IdentitiesStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(IdentitiesStorageRepository.class), null, null), (ResolveIdentityUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ResolveIdentityUseCase.class), null, null), (RegisterIdentityUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(RegisterIdentityUseCase.class), null, null), (UnregisterIdentityUseCase) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(UnregisterIdentityUseCase.class), null, null), (ProjectId) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(ProjectId.class), null, null), (KeyManagementRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KeyManagementRepository.class), null, null), (Logger) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), null));
                    }
                };
                C59990ztS<?> c59990ztS10 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(IdentitiesInteractor.class), null, anonymousClass10, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS10);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS10);
                }
                new C59976ztE(c59991ztT, c59990ztS10);
            }
        }, 1, null);
    }

    public static /* synthetic */ C59991ztT keyServerModule$default(String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return keyServerModule(str);
    }
}
