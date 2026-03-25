package com.reown.android.internal.common.di;

import com.google.firebase.messaging.Constants;
import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.adapter.ExpiryAdapter;
import com.reown.android.internal.common.adapter.JsonRpcResultAdapter;
import com.reown.android.internal.common.adapter.TagsAdapter;
import com.reown.android.internal.common.di.CoreCommonModuleKt;
import com.reown.android.internal.common.model.Expiry;
import com.reown.android.internal.common.model.Tags;
import com.reown.foundation.di.FoundationCommonModuleKt;
import com.reown.foundation.di.FoundationDITags;
import com.reown.foundation.util.Logger;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AbstractC59982ztK;
import o.C56524yIo;
import o.C58137yvc;
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
import o.C60134zwX;
import o.yDY;
import o.yJP;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes12.dex */
public final class CoreCommonModuleKt {
    public static final C59991ztT coreCommonModule() {
        return C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.internal.common.di.CoreCommonModuleKt.coreCommonModule.1
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
                c59991ztT.OLrzqt(FoundationCommonModuleKt.foundationCommonModule());
                C06921 c06921 = new Function2<C60060zuj, C60053zuc, PolymorphicJsonAdapterFactory<JsonRpcResponse>>() { // from class: com.reown.android.internal.common.di.CoreCommonModuleKt.coreCommonModule.1.1
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final PolymorphicJsonAdapterFactory<JsonRpcResponse> invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        PolymorphicJsonAdapterFactory<JsonRpcResponse> polymorphicJsonAdapterFactoryWithSubtype = PolymorphicJsonAdapterFactory.of(JsonRpcResponse.class, "type").withSubtype(JsonRpcResponse.JsonRpcResult.class, "result").withSubtype(JsonRpcResponse.JsonRpcError.class, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                        Intrinsics.checkNotNullExpressionValue(polymorphicJsonAdapterFactoryWithSubtype, "");
                        return polymorphicJsonAdapterFactoryWithSubtype;
                    }
                };
                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                Kind kind = Kind.Singleton;
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(PolymorphicJsonAdapterFactory.class), null, c06921, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(Moshi.Builder.class), C60058zuh.OLrzqt(AndroidCommonDITags.MOSHI), AnonymousClass2.INSTANCE, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS2);
                }
                new C59976ztE(c59991ztT, c59990ztS2);
                C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(C60134zwX.ActionBar.class), null, new Function2<C60060zuj, C60053zuc, C60134zwX.ActionBar>() { // from class: com.reown.android.internal.common.di.CoreCommonModuleKt.coreCommonModule.1.3
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final C60134zwX.ActionBar invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return C60134zwX.EZpvd;
                    }
                }, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS3);
                }
                new C59976ztE(c59991ztT, c59990ztS3);
                C59990ztS<?> c59990ztS4 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(Logger.class), C60058zuh.OLrzqt(AndroidCommonDITags.LOGGER), new Function2<C60060zuj, C60053zuc, Logger>() { // from class: com.reown.android.internal.common.di.CoreCommonModuleKt.coreCommonModule.1.4
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Logger invoke(@NotNull final C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new Logger() { // from class: com.reown.android.internal.common.di.CoreCommonModuleKt.coreCommonModule.1.4.1
                            @Override // com.reown.foundation.util.Logger
                            public void log(String str) {
                                ((C60134zwX.ActionBar) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(C60134zwX.ActionBar.class), null, null)).d(str, new Object[0]);
                            }

                            @Override // com.reown.foundation.util.Logger
                            public void log(Throwable th) {
                                ((C60134zwX.ActionBar) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(C60134zwX.ActionBar.class), null, null)).d(th);
                            }

                            @Override // com.reown.foundation.util.Logger
                            public void error(String str) {
                                ((C60134zwX.ActionBar) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(C60134zwX.ActionBar.class), null, null)).e(str, new Object[0]);
                            }

                            @Override // com.reown.foundation.util.Logger
                            public void error(Throwable th) {
                                ((C60134zwX.ActionBar) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(C60134zwX.ActionBar.class), null, null)).e(th);
                            }
                        };
                    }
                }, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS4);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS4);
                }
                new C59976ztE(c59991ztT, c59990ztS4);
            }

            /* JADX INFO: renamed from: com.reown.android.internal.common.di.CoreCommonModuleKt$coreCommonModule$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends Lambda implements Function2<C60060zuj, C60053zuc, Moshi.Builder> {
                public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2() {
                    super(2);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Moshi.Builder invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    Moshi.Builder builderAdd = ((Moshi) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Moshi.class), C60058zuh.OLrzqt(FoundationDITags.MOSHI), null)).newBuilder().add(new JsonAdapter.Factory() { // from class: com.reown.android.internal.common.di.CoreCommonModuleKt$coreCommonModule$1$2$$ExternalSyntheticLambda0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // com.squareup.moshi.JsonAdapter.Factory
                        public final JsonAdapter create(Type type, Set set, Moshi moshi) {
                            return CoreCommonModuleKt.AnonymousClass1.AnonymousClass2.invoke$lambda$0(type, set, moshi);
                        }
                    }).add((JsonAdapter.Factory) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PolymorphicJsonAdapterFactory.class), null, null)).add((JsonAdapter.Factory) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(PolymorphicJsonAdapterFactory.class), null, null));
                    Intrinsics.checkNotNullExpressionValue(builderAdd, "");
                    return builderAdd;
                }

                public static final JsonAdapter invoke$lambda$0(Type type, Set set, Moshi moshi) {
                    Intrinsics.copydefault(type);
                    String name = C58137yvc.copydefault(type).getName();
                    if (Intrinsics.EZpvd((Object) name, (Object) yJP.KWHzl(C56524yIo.AEQbTJ(Expiry.class)))) {
                        return ExpiryAdapter.INSTANCE;
                    }
                    if (Intrinsics.EZpvd((Object) name, (Object) yJP.KWHzl(C56524yIo.AEQbTJ(Tags.class)))) {
                        return TagsAdapter.INSTANCE;
                    }
                    if (!Intrinsics.EZpvd((Object) name, (Object) yJP.KWHzl(C56524yIo.AEQbTJ(JsonRpcResponse.JsonRpcResult.class)))) {
                        return null;
                    }
                    Intrinsics.copydefault(moshi);
                    return new JsonRpcResultAdapter(moshi);
                }
            }
        }, 1, null);
    }
}
