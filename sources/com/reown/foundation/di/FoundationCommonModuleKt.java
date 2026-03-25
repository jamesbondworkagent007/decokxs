package com.reown.foundation.di;

import com.reown.foundation.common.adapters.SubscriptionIdAdapter;
import com.reown.foundation.common.adapters.TopicAdapter;
import com.reown.foundation.common.adapters.TtlAdapter;
import com.reown.foundation.common.model.SubscriptionId;
import com.reown.foundation.common.model.Topic;
import com.reown.foundation.common.model.Ttl;
import com.reown.foundation.di.FoundationCommonModuleKt;
import com.reown.foundation.util.Logger;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import java.lang.reflect.Type;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AbstractC59982ztK;
import o.C56379yDe;
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
import o.InterfaceC59997ztZ;
import o.yDY;
import o.yJP;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;

/* JADX INFO: loaded from: classes12.dex */
public final class FoundationCommonModuleKt {
    public static final C59991ztT foundationCommonModule() {
        return C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.foundation.di.FoundationCommonModuleKt.foundationCommonModule.1
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
                C07251 c07251 = new Function2<C60060zuj, C60053zuc, KotlinJsonAdapterFactory>() { // from class: com.reown.foundation.di.FoundationCommonModuleKt.foundationCommonModule.1.1
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final KotlinJsonAdapterFactory invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new KotlinJsonAdapterFactory();
                    }
                };
                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                C60055zue c60055zueKWHzl = taskDescription.KWHzl();
                Kind kind = Kind.Singleton;
                C59990ztS<?> c59990ztS = new C59990ztS<>(new C59978ztG(c60055zueKWHzl, C56524yIo.AEQbTJ(KotlinJsonAdapterFactory.class), null, c07251, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS);
                }
                new C59976ztE(c59991ztT, c59990ztS);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt = C60058zuh.OLrzqt(FoundationDITags.MOSHI);
                AnonymousClass2 anonymousClass2 = AnonymousClass2.INSTANCE;
                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(Moshi.class), interfaceC59997ztZOLrzqt, anonymousClass2, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS2);
                }
                new C59976ztE(c59991ztT, c59990ztS2);
                AnonymousClass3 anonymousClass3 = new Function2<C60060zuj, C60053zuc, Logger>() { // from class: com.reown.foundation.di.FoundationCommonModuleKt.foundationCommonModule.1.3
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Logger invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new Logger() { // from class: com.reown.foundation.di.FoundationCommonModuleKt.foundationCommonModule.1.3.1
                            @Override // com.reown.foundation.util.Logger
                            public void log(String str) {
                                System.out.println((Object) str);
                            }

                            @Override // com.reown.foundation.util.Logger
                            public void log(Throwable th) {
                                String message;
                                if (th == null || (message = C56379yDe.AEQbTJ(th)) == null) {
                                    message = th != null ? th.getMessage() : null;
                                    Intrinsics.copydefault((Object) message);
                                }
                                System.out.println((Object) message);
                            }

                            @Override // com.reown.foundation.util.Logger
                            public void error(String str) {
                                System.out.println((Object) str);
                            }

                            @Override // com.reown.foundation.util.Logger
                            public void error(Throwable th) {
                                String message;
                                if (th == null || (message = C56379yDe.AEQbTJ(th)) == null) {
                                    message = th != null ? th.getMessage() : null;
                                    Intrinsics.copydefault((Object) message);
                                }
                                System.out.println((Object) message);
                            }
                        };
                    }
                };
                C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(Logger.class), null, anonymousClass3, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS3);
                }
                new C59976ztE(c59991ztT, c59990ztS3);
            }

            /* JADX INFO: renamed from: com.reown.foundation.di.FoundationCommonModuleKt$foundationCommonModule$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends Lambda implements Function2<C60060zuj, C60053zuc, Moshi> {
                public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                public AnonymousClass2() {
                    super(2);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // kotlin.jvm.functions.Function2
                public final Moshi invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                    Intrinsics.checkNotNullParameter(c60060zuj, "");
                    Intrinsics.checkNotNullParameter(c60053zuc, "");
                    Moshi moshiBuild = new Moshi.Builder().add(new JsonAdapter.Factory() { // from class: com.reown.foundation.di.FoundationCommonModuleKt$foundationCommonModule$1$2$$ExternalSyntheticLambda0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // com.squareup.moshi.JsonAdapter.Factory
                        public final JsonAdapter create(Type type, Set set, Moshi moshi) {
                            return FoundationCommonModuleKt.AnonymousClass1.AnonymousClass2.invoke$lambda$0(type, set, moshi);
                        }
                    }).addLast((JsonAdapter.Factory) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(KotlinJsonAdapterFactory.class), null, null)).build();
                    Intrinsics.checkNotNullExpressionValue(moshiBuild, "");
                    return moshiBuild;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final JsonAdapter invoke$lambda$0(Type type, Set set, Moshi moshi) {
                    Intrinsics.copydefault(type);
                    String name = C58137yvc.copydefault(type).getName();
                    if (Intrinsics.EZpvd((Object) name, (Object) yJP.KWHzl(C56524yIo.AEQbTJ(SubscriptionId.class)))) {
                        return SubscriptionIdAdapter.INSTANCE;
                    }
                    if (Intrinsics.EZpvd((Object) name, (Object) yJP.KWHzl(C56524yIo.AEQbTJ(Topic.class)))) {
                        return TopicAdapter.INSTANCE;
                    }
                    if (Intrinsics.EZpvd((Object) name, (Object) yJP.KWHzl(C56524yIo.AEQbTJ(Ttl.class)))) {
                        return TtlAdapter.INSTANCE;
                    }
                    return null;
                }
            }
        }, 1, null);
    }
}
