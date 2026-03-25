package com.reown.android.verify.domain;

import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.android.internal.common.crypto.UtilsKt;
import com.reown.android.internal.common.model.Validation;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository;
import com.reown.android.verify.client.VerifyInterface;
import com.reown.android.verify.model.VerifyContext;
import com.reown.utils.UtilFunctionsKt;
import java.security.NoSuchAlgorithmException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;
import o.C56391yDq;
import o.C56442yFn;
import o.C56529yIt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ResolveAttestationIdUseCase {
    public final VerifyContextStorageRepository repository;
    public final VerifyInterface verifyInterface;
    public final String verifyUrl;

    public ResolveAttestationIdUseCase(@NotNull VerifyInterface verifyInterface, @NotNull VerifyContextStorageRepository verifyContextStorageRepository, @NotNull String str) {
        Intrinsics.checkNotNullParameter(verifyInterface, "");
        Intrinsics.checkNotNullParameter(verifyContextStorageRepository, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.verifyInterface = verifyInterface;
        this.repository = verifyContextStorageRepository;
        this.verifyUrl = str;
    }

    public static /* synthetic */ void invoke$default(ResolveAttestationIdUseCase resolveAttestationIdUseCase, WCRequest wCRequest, String str, Boolean bool, String str2, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = Boolean.FALSE;
        }
        Boolean bool2 = bool;
        if ((i & 8) != 0) {
            str2 = null;
        }
        resolveAttestationIdUseCase.invoke(wCRequest, str, bool2, str2, function1);
    }

    public final void invoke(@NotNull WCRequest wCRequest, @NotNull String str, Boolean bool, String str2, @NotNull final Function1<? super VerifyContext, Unit> function1) {
        Intrinsics.checkNotNullParameter(wCRequest, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (Intrinsics.EZpvd(bool, Boolean.TRUE) && str2 != null && str2.length() != 0) {
            resolveLinkMode(wCRequest, str, str2, function1);
            return;
        }
        String attestation = wCRequest.getAttestation();
        if (attestation != null && attestation.length() != 0) {
            resolveVerifyV2(str, wCRequest, function1);
            return;
        }
        String attestation2 = wCRequest.getAttestation();
        if (attestation2 == null || attestation2.length() != 0) {
            resolveVerifyV1(wCRequest, str, function1);
        } else {
            insertContext(new VerifyContext(wCRequest.getId(), UtilFunctionsKt.getEmpty(C56529yIt.KWHzl), Validation.UNKNOWN, this.verifyUrl, null), new Function1<VerifyContext, Unit>() { // from class: com.reown.android.verify.domain.ResolveAttestationIdUseCase.invoke.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.model.VerifyContext, kotlin.Unit> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(VerifyContext verifyContext) {
                    invoke2(verifyContext);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull VerifyContext verifyContext) {
                    Intrinsics.checkNotNullParameter(verifyContext, "");
                    function1.invoke(verifyContext);
                }
            });
        }
    }

    public final void resolveLinkMode(WCRequest wCRequest, String str, String str2, final Function1<? super VerifyContext, Unit> function1) {
        insertContext(new VerifyContext(wCRequest.getId(), str, VerifyUtilsKt.getValidation(str, str2), UtilFunctionsKt.getEmpty(C56529yIt.KWHzl), null), new Function1<VerifyContext, Unit>() { // from class: com.reown.android.verify.domain.ResolveAttestationIdUseCase.resolveLinkMode.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.model.VerifyContext, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(VerifyContext verifyContext) {
                invoke2(verifyContext);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull VerifyContext verifyContext) {
                Intrinsics.checkNotNullParameter(verifyContext, "");
                function1.invoke(verifyContext);
            }
        });
    }

    public final void resolveVerifyV2(String str, final WCRequest wCRequest, final Function1<? super VerifyContext, Unit> function1) throws NoSuchAlgorithmException {
        VerifyInterface verifyInterface = this.verifyInterface;
        byte[] bytes = wCRequest.getEncryptedMessage().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String strSha256 = UtilsKt.sha256(bytes);
        String attestation = wCRequest.getAttestation();
        Intrinsics.copydefault((Object) attestation);
        verifyInterface.resolveV2(strSha256, attestation, str, new Function1<VerifyResult, Unit>() { // from class: com.reown.android.verify.domain.ResolveAttestationIdUseCase.resolveVerifyV2.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.model.VerifyContext, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(VerifyResult verifyResult) {
                invoke2(verifyResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull VerifyResult verifyResult) {
                Intrinsics.checkNotNullParameter(verifyResult, "");
                ResolveAttestationIdUseCase resolveAttestationIdUseCase = ResolveAttestationIdUseCase.this;
                VerifyContext verifyContext = new VerifyContext(wCRequest.getId(), verifyResult.getOrigin(), verifyResult.getValidation(), ResolveAttestationIdUseCase.this.verifyUrl, verifyResult.isScam());
                final Function1<VerifyContext, Unit> function12 = function1;
                resolveAttestationIdUseCase.insertContext(verifyContext, new Function1<VerifyContext, Unit>() { // from class: com.reown.android.verify.domain.ResolveAttestationIdUseCase.resolveVerifyV2.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.model.VerifyContext, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(VerifyContext verifyContext2) {
                        invoke2(verifyContext2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull VerifyContext verifyContext2) {
                        Intrinsics.checkNotNullParameter(verifyContext2, "");
                        function12.invoke(verifyContext2);
                    }
                });
            }
        }, new Function1<Throwable, Unit>() { // from class: com.reown.android.verify.domain.ResolveAttestationIdUseCase.resolveVerifyV2.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.model.VerifyContext, kotlin.Unit> */
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
                ResolveAttestationIdUseCase resolveAttestationIdUseCase = ResolveAttestationIdUseCase.this;
                VerifyContext verifyContext = new VerifyContext(wCRequest.getId(), UtilFunctionsKt.getEmpty(C56529yIt.KWHzl), Validation.UNKNOWN, ResolveAttestationIdUseCase.this.verifyUrl, null);
                final Function1<VerifyContext, Unit> function12 = function1;
                resolveAttestationIdUseCase.insertContext(verifyContext, new Function1<VerifyContext, Unit>() { // from class: com.reown.android.verify.domain.ResolveAttestationIdUseCase.resolveVerifyV2.2.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.model.VerifyContext, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(VerifyContext verifyContext2) {
                        invoke2(verifyContext2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull VerifyContext verifyContext2) {
                        Intrinsics.checkNotNullParameter(verifyContext2, "");
                        function12.invoke(verifyContext2);
                    }
                });
            }
        });
    }

    public final void resolveVerifyV1(final WCRequest wCRequest, String str, final Function1<? super VerifyContext, Unit> function1) {
        VerifyInterface verifyInterface = this.verifyInterface;
        byte[] bytes = wCRequest.getMessage().getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        verifyInterface.resolve(UtilsKt.sha256(bytes), str, new Function1<VerifyResult, Unit>() { // from class: com.reown.android.verify.domain.ResolveAttestationIdUseCase.resolveVerifyV1.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.model.VerifyContext, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(VerifyResult verifyResult) {
                invoke2(verifyResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull VerifyResult verifyResult) {
                Intrinsics.checkNotNullParameter(verifyResult, "");
                ResolveAttestationIdUseCase resolveAttestationIdUseCase = ResolveAttestationIdUseCase.this;
                VerifyContext verifyContext = new VerifyContext(wCRequest.getId(), verifyResult.getOrigin(), verifyResult.getValidation(), ResolveAttestationIdUseCase.this.verifyUrl, verifyResult.isScam());
                final Function1<VerifyContext, Unit> function12 = function1;
                resolveAttestationIdUseCase.insertContext(verifyContext, new Function1<VerifyContext, Unit>() { // from class: com.reown.android.verify.domain.ResolveAttestationIdUseCase.resolveVerifyV1.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.model.VerifyContext, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(VerifyContext verifyContext2) {
                        invoke2(verifyContext2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull VerifyContext verifyContext2) {
                        Intrinsics.checkNotNullParameter(verifyContext2, "");
                        function12.invoke(verifyContext2);
                    }
                });
            }
        }, new Function1<Throwable, Unit>() { // from class: com.reown.android.verify.domain.ResolveAttestationIdUseCase.resolveVerifyV1.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.model.VerifyContext, kotlin.Unit> */
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
                ResolveAttestationIdUseCase resolveAttestationIdUseCase = ResolveAttestationIdUseCase.this;
                VerifyContext verifyContext = new VerifyContext(wCRequest.getId(), UtilFunctionsKt.getEmpty(C56529yIt.KWHzl), Validation.UNKNOWN, ResolveAttestationIdUseCase.this.verifyUrl, null);
                final Function1<VerifyContext, Unit> function12 = function1;
                resolveAttestationIdUseCase.insertContext(verifyContext, new Function1<VerifyContext, Unit>() { // from class: com.reown.android.verify.domain.ResolveAttestationIdUseCase.resolveVerifyV1.2.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.model.VerifyContext, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(VerifyContext verifyContext2) {
                        invoke2(verifyContext2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull VerifyContext verifyContext2) {
                        Intrinsics.checkNotNullParameter(verifyContext2, "");
                        function12.invoke(verifyContext2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: com.reown.android.verify.domain.ResolveAttestationIdUseCase$insertContext$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ VerifyContext $context;
        public final /* synthetic */ Function1<VerifyContext, Unit> $onResolve;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.model.VerifyContext, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(VerifyContext verifyContext, Function1<? super VerifyContext, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = verifyContext;
            this.$onResolve = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return ResolveAttestationIdUseCase.this.new AnonymousClass1(this.$context, this.$onResolve, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.verify.domain.ResolveAttestationIdUseCase$insertContext$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ VerifyContext $context;
            public final /* synthetic */ Function1<VerifyContext, Unit> $onResolve;
            public int label;
            public final /* synthetic */ ResolveAttestationIdUseCase this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.model.VerifyContext, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07201(ResolveAttestationIdUseCase resolveAttestationIdUseCase, VerifyContext verifyContext, Function1<? super VerifyContext, Unit> function1, Continuation<? super C07201> continuation) {
                super(2, continuation);
                this.this$0 = resolveAttestationIdUseCase;
                this.$context = verifyContext;
                this.$onResolve = function1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07201(this.this$0, this.$context, this.$onResolve, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                try {
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        VerifyContextStorageRepository verifyContextStorageRepository = this.this$0.repository;
                        VerifyContext verifyContext = this.$context;
                        this.label = 1;
                        if (verifyContextStorageRepository.insertOrAbort(verifyContext, this) == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                    }
                    this.$onResolve.invoke(this.$context);
                } catch (Exception unused) {
                    this.$onResolve.invoke(this.$context);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C07201 c07201 = new C07201(ResolveAttestationIdUseCase.this, this.$context, this.$onResolve, null);
                this.label = 1;
                if (SupervisorKt.supervisorScope(c07201, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void insertContext(VerifyContext verifyContext, Function1<? super VerifyContext, Unit> function1) {
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new AnonymousClass1(verifyContext, function1, null), 3, null);
    }
}
