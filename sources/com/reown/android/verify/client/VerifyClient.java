package com.reown.android.verify.client;

import com.reown.android.internal.common.KoinApplicationKt;
import com.reown.android.internal.common.storage.verify.VerifyContextStorageRepository;
import com.reown.android.pairing.handler.PairingControllerInterface;
import com.reown.android.sdk.storage.data.dao.VerifyPublicKeyQueries;
import com.reown.android.verify.client.VerifyInterface;
import com.reown.android.verify.data.VerifyService;
import com.reown.android.verify.domain.JWTRepository;
import com.reown.android.verify.domain.ResolveAttestationIdUseCase;
import com.reown.android.verify.domain.VerifyPublicKeyStorageRepository;
import com.reown.android.verify.domain.VerifyRepository;
import com.reown.android.verify.domain.VerifyResult;
import com.squareup.moshi.Moshi;
import kotlin.KotlinNothingValueException;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC59982ztK;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56524yIo;
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
import o.InterfaceC56387yDm;
import o.InterfaceC59997ztZ;
import o.yDY;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.Kind;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

/* JADX INFO: loaded from: classes12.dex */
public final class VerifyClient implements VerifyInterface {
    public final C60018ztu koinApp;
    public final InterfaceC56387yDm pairingController$delegate;
    public final CoroutineScope scope;
    public final InterfaceC56387yDm verifyRepository$delegate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VerifyClient() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public VerifyClient(@NotNull C60018ztu c60018ztu, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(c60018ztu, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.koinApp = c60018ztu;
        this.scope = coroutineScope;
        this.verifyRepository$delegate = C56392yDr.copydefault(new Function0<VerifyRepository>() { // from class: com.reown.android.verify.client.VerifyClient$verifyRepository$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final VerifyRepository invoke() {
                return (VerifyRepository) this.this$0.koinApp.OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(VerifyRepository.class), null, null);
            }
        });
        this.pairingController$delegate = C56392yDr.copydefault(new Function0<PairingControllerInterface>() { // from class: com.reown.android.verify.client.VerifyClient$pairingController$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final PairingControllerInterface invoke() {
                return (PairingControllerInterface) this.this$0.koinApp.OLrzqt().EZpvd().OLrzqt().AEQbTJ(C56524yIo.AEQbTJ(PairingControllerInterface.class), null, null);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:o.ztu:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.ztu:0x0004: INVOKE  STATIC call: com.reown.android.internal.common.KoinApplicationKt.getWcKoinApp():o.ztu A[MD:():o.ztu (m), WRAPPED] (LINE:15)) : (r1v0 o.ztu))
  (wrap:kotlinx.coroutines.CoroutineScope:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineScope:0x001a: INVOKE 
  (wrap:kotlin.coroutines.CoroutineContext:0x0016: INVOKE 
  (wrap:kotlinx.coroutines.CompletableJob:0x000e: INVOKE 
  (wrap:kotlinx.coroutines.Job:?: CAST (kotlinx.coroutines.Job) (null kotlinx.coroutines.Job))
  (1 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
 STATIC call: kotlinx.coroutines.SupervisorKt.SupervisorJob$default(kotlinx.coroutines.Job, int, java.lang.Object):kotlinx.coroutines.CompletableJob A[MD:(kotlinx.coroutines.Job, int, java.lang.Object):kotlinx.coroutines.CompletableJob (m), WRAPPED] (LINE:16))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0012: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED])
 INTERFACE call: kotlin.coroutines.CoroutineContext.plus(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext A[MD:(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext (m), WRAPPED] (LINE:16))
 STATIC call: kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlin.coroutines.CoroutineContext):kotlinx.coroutines.CoroutineScope A[MD:(kotlin.coroutines.CoroutineContext):kotlinx.coroutines.CoroutineScope (m), WRAPPED] (LINE:16)) : (r2v0 kotlinx.coroutines.CoroutineScope))
 A[MD:(o.ztu, kotlinx.coroutines.CoroutineScope):void (m)] (LINE:14) call: com.reown.android.verify.client.VerifyClient.<init>(o.ztu, kotlinx.coroutines.CoroutineScope):void type: THIS */
    public /* synthetic */ VerifyClient(C60018ztu c60018ztu, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? KoinApplicationKt.getWcKoinApp() : c60018ztu, (i & 2) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault())) : coroutineScope);
    }

    public final VerifyRepository getVerifyRepository() {
        return (VerifyRepository) this.verifyRepository$delegate.getValue();
    }

    public final PairingControllerInterface getPairingController() {
        return (PairingControllerInterface) this.pairingController$delegate.getValue();
    }

    @Override // com.reown.android.verify.client.VerifyInterface
    public void initialize() {
        this.koinApp.OLrzqt(C60064zun.module$default(false, new Function1<C59991ztT, Unit>() { // from class: com.reown.android.internal.common.di.VerifyModuleKt.verifyModule.1
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
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt = C60058zuh.OLrzqt(AndroidCommonDITags.VERIFY_URL);
                C07021 c07021 = new Function2<C60060zuj, C60053zuc, String>() { // from class: com.reown.android.internal.common.di.VerifyModuleKt.verifyModule.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final String invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return "https://verify.walletconnect.org/";
                    }
                };
                C60059zui.TaskDescription taskDescription = C60059zui.KWHzl;
                AbstractC59982ztK<?> c59981ztJ = new C59981ztJ<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(String.class), interfaceC59997ztZOLrzqt, c07021, Kind.Factory, yDY.AhwBna()));
                c59991ztT.KWHzl(c59981ztJ);
                new C59976ztE(c59991ztT, c59981ztJ);
                InterfaceC59997ztZ interfaceC59997ztZOLrzqt2 = C60058zuh.OLrzqt(AndroidCommonDITags.VERIFY_RETROFIT);
                AnonymousClass2 anonymousClass2 = new Function2<C60060zuj, C60053zuc, Retrofit>() { // from class: com.reown.android.internal.common.di.VerifyModuleKt.verifyModule.1.2
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final Retrofit invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new Retrofit.Builder().baseUrl((String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.VERIFY_URL), null)).client((OkHttpClient) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(OkHttpClient.class), C60058zuh.OLrzqt(AndroidCommonDITags.OK_HTTP), null)).addConverterFactory(MoshiConverterFactory.create((Moshi) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Moshi.class), C60058zuh.OLrzqt(AndroidCommonDITags.MOSHI), null))).build();
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
                AnonymousClass3 anonymousClass3 = new Function2<C60060zuj, C60053zuc, VerifyService>() { // from class: com.reown.android.internal.common.di.VerifyModuleKt.verifyModule.1.3
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final VerifyService invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return (VerifyService) ((Retrofit) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Retrofit.class), C60058zuh.OLrzqt(AndroidCommonDITags.VERIFY_RETROFIT), null)).create(VerifyService.class);
                    }
                };
                C59990ztS<?> c59990ztS2 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(VerifyService.class), null, anonymousClass3, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS2);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS2);
                }
                new C59976ztE(c59991ztT, c59990ztS2);
                AnonymousClass4 anonymousClass4 = new Function2<C60060zuj, C60053zuc, ResolveAttestationIdUseCase>() { // from class: com.reown.android.internal.common.di.VerifyModuleKt.verifyModule.1.4
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final ResolveAttestationIdUseCase invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new ResolveAttestationIdUseCase((VerifyInterface) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(VerifyInterface.class), null, null), (VerifyContextStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(VerifyContextStorageRepository.class), null, null), (String) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(String.class), C60058zuh.OLrzqt(AndroidCommonDITags.VERIFY_URL), null));
                    }
                };
                C59990ztS<?> c59990ztS3 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(ResolveAttestationIdUseCase.class), null, anonymousClass4, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS3);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS3);
                }
                new C59976ztE(c59991ztT, c59990ztS3);
                AnonymousClass5 anonymousClass5 = new Function2<C60060zuj, C60053zuc, VerifyPublicKeyStorageRepository>() { // from class: com.reown.android.internal.common.di.VerifyModuleKt.verifyModule.1.5
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final VerifyPublicKeyStorageRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new VerifyPublicKeyStorageRepository((VerifyPublicKeyQueries) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(VerifyPublicKeyQueries.class), null, null));
                    }
                };
                C59990ztS<?> c59990ztS4 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(VerifyPublicKeyStorageRepository.class), null, anonymousClass5, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS4);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS4);
                }
                new C59976ztE(c59991ztT, c59990ztS4);
                AnonymousClass6 anonymousClass6 = new Function2<C60060zuj, C60053zuc, JWTRepository>() { // from class: com.reown.android.internal.common.di.VerifyModuleKt.verifyModule.1.6
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final JWTRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new JWTRepository();
                    }
                };
                C59990ztS<?> c59990ztS5 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(JWTRepository.class), null, anonymousClass6, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS5);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS5);
                }
                new C59976ztE(c59991ztT, c59990ztS5);
                AnonymousClass7 anonymousClass7 = new Function2<C60060zuj, C60053zuc, VerifyRepository>() { // from class: com.reown.android.internal.common.di.VerifyModuleKt.verifyModule.1.7
                    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                    @Override // kotlin.jvm.functions.Function2
                    public final VerifyRepository invoke(@NotNull C60060zuj c60060zuj, @NotNull C60053zuc c60053zuc) {
                        Intrinsics.checkNotNullParameter(c60060zuj, "");
                        Intrinsics.checkNotNullParameter(c60053zuc, "");
                        return new VerifyRepository((VerifyService) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(VerifyService.class), null, null), (JWTRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(JWTRepository.class), null, null), (Moshi) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(Moshi.class), C60058zuh.OLrzqt(AndroidCommonDITags.MOSHI), null), (VerifyPublicKeyStorageRepository) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(VerifyPublicKeyStorageRepository.class), null, null), null, 16, null);
                    }
                };
                C59990ztS<?> c59990ztS6 = new C59990ztS<>(new C59978ztG(taskDescription.KWHzl(), C56524yIo.AEQbTJ(VerifyRepository.class), null, anonymousClass7, kind, yDY.AhwBna()));
                c59991ztT.KWHzl((AbstractC59982ztK<?>) c59990ztS6);
                if (c59991ztT.OLrzqt()) {
                    c59991ztT.KWHzl(c59990ztS6);
                }
                new C59976ztE(c59991ztT, c59990ztS6);
            }
        }, 1, null));
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.android.verify.client.VerifyClient$initialize$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return VerifyClient.this.new AnonymousClass1(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.verify.client.VerifyClient$initialize$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07191<T> implements FlowCollector {
            public final /* synthetic */ VerifyClient this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C07191(VerifyClient verifyClient) {
                this.this$0 = verifyClient;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Unit) obj, (Continuation<? super Unit>) continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(@NotNull Unit unit, @NotNull Continuation<? super Unit> continuation) throws Throwable {
                VerifyClient$initialize$1$1$emit$1 verifyClient$initialize$1$1$emit$1;
                Object objM7307getVerifyPublicKeyIoAF18A;
                if (continuation instanceof VerifyClient$initialize$1$1$emit$1) {
                    verifyClient$initialize$1$1$emit$1 = (VerifyClient$initialize$1$1$emit$1) continuation;
                    int i = verifyClient$initialize$1$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        verifyClient$initialize$1$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        verifyClient$initialize$1$1$emit$1 = new VerifyClient$initialize$1$1$emit$1(this, continuation);
                    }
                }
                Object obj = verifyClient$initialize$1$1$emit$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = verifyClient$initialize$1$1$emit$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj);
                    VerifyRepository verifyRepository = this.this$0.getVerifyRepository();
                    verifyClient$initialize$1$1$emit$1.label = 1;
                    objM7307getVerifyPublicKeyIoAF18A = verifyRepository.m7307getVerifyPublicKeyIoAF18A(verifyClient$initialize$1$1$emit$1);
                    if (objM7307getVerifyPublicKeyIoAF18A == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7307getVerifyPublicKeyIoAF18A = ((Result) obj).m7386unboximpl();
                }
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7307getVerifyPublicKeyIoAF18A);
                if (thM7380exceptionOrNullimpl != null) {
                    System.out.println((Object) ("Error fetching a key: " + thM7380exceptionOrNullimpl.getMessage()));
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
                SharedFlow<Unit> checkVerifyKeyFlow = VerifyClient.this.getPairingController().getCheckVerifyKeyFlow();
                C07191 c07191 = new C07191(VerifyClient.this);
                this.label = 1;
                if (checkVerifyKeyFlow.collect(c07191, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Override // com.reown.android.verify.client.VerifyInterface
    public void resolve(@NotNull String str, @NotNull String str2, @NotNull Function1<? super VerifyResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        try {
            getVerifyRepository().resolve(str, str2, function1, function12);
        } catch (Exception e) {
            function12.invoke(e);
        }
    }

    @Override // com.reown.android.verify.client.VerifyInterface
    public void resolveV2(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super VerifyResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        try {
            getVerifyRepository().resolveV2(str, str2, str3, function1, function12);
        } catch (Exception e) {
            function12.invoke(e);
        }
    }

    @Override // com.reown.android.verify.client.VerifyInterface
    public void register(@NotNull String str, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
