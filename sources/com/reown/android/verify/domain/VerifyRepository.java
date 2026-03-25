package com.reown.android.verify.domain;

import com.reown.android.internal.common.model.Validation;
import com.reown.android.internal.utils.Time;
import com.reown.android.verify.data.VerifyService;
import com.reown.android.verify.model.Origin;
import com.reown.android.verify.model.VerifyClaims;
import com.reown.android.verify.model.VerifyServerPublicKey;
import com.reown.util.UtilFunctionsKt;
import com.squareup.moshi.Moshi;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import o.C56391yDq;
import o.C56442yFn;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final class VerifyRepository {
    public final JWTRepository jwtRepository;
    public final Moshi moshi;
    public final Mutex mutex;
    public final CoroutineScope scope;
    public final VerifyPublicKeyStorageRepository verifyPublicKeyStorageRepository;
    public final VerifyService verifyService;

    /* JADX INFO: renamed from: com.reown.android.verify.domain.VerifyRepository$fetchAndCacheKey$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VerifyRepository.this.fetchAndCacheKey(this);
        }
    }

    public VerifyRepository(@NotNull VerifyService verifyService, @NotNull JWTRepository jWTRepository, @NotNull Moshi moshi, @NotNull VerifyPublicKeyStorageRepository verifyPublicKeyStorageRepository, @NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(verifyService, "");
        Intrinsics.checkNotNullParameter(jWTRepository, "");
        Intrinsics.checkNotNullParameter(moshi, "");
        Intrinsics.checkNotNullParameter(verifyPublicKeyStorageRepository, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.verifyService = verifyService;
        this.jwtRepository = jWTRepository;
        this.moshi = moshi;
        this.verifyPublicKeyStorageRepository = verifyPublicKeyStorageRepository;
        this.scope = coroutineScope;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (r7v0 com.reown.android.verify.data.VerifyService)
  (r8v0 com.reown.android.verify.domain.JWTRepository)
  (r9v0 com.squareup.moshi.Moshi)
  (r10v0 com.reown.android.verify.domain.VerifyPublicKeyStorageRepository)
  (wrap:kotlinx.coroutines.CoroutineScope:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineScope:0x0012: INVOKE 
  (wrap:kotlin.coroutines.CoroutineContext:0x000e: INVOKE 
  (wrap:kotlinx.coroutines.CompletableJob:0x0006: INVOKE 
  (wrap:kotlinx.coroutines.Job:?: CAST (kotlinx.coroutines.Job) (null kotlinx.coroutines.Job))
  (1 int)
  (wrap:java.lang.Object:?: CAST (java.lang.Object) (null java.lang.Object))
 STATIC call: kotlinx.coroutines.SupervisorKt.SupervisorJob$default(kotlinx.coroutines.Job, int, java.lang.Object):kotlinx.coroutines.CompletableJob A[MD:(kotlinx.coroutines.Job, int, java.lang.Object):kotlinx.coroutines.CompletableJob (m), WRAPPED] (LINE:22))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:0x000a: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED])
 INTERFACE call: kotlin.coroutines.CoroutineContext.plus(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext A[MD:(kotlin.coroutines.CoroutineContext):kotlin.coroutines.CoroutineContext (m), WRAPPED] (LINE:22))
 STATIC call: kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlin.coroutines.CoroutineContext):kotlinx.coroutines.CoroutineScope A[MD:(kotlin.coroutines.CoroutineContext):kotlinx.coroutines.CoroutineScope (m), WRAPPED] (LINE:22)) : (r11v0 kotlinx.coroutines.CoroutineScope))
 A[MD:(com.reown.android.verify.data.VerifyService, com.reown.android.verify.domain.JWTRepository, com.squareup.moshi.Moshi, com.reown.android.verify.domain.VerifyPublicKeyStorageRepository, kotlinx.coroutines.CoroutineScope):void (m)] (LINE:17) call: com.reown.android.verify.domain.VerifyRepository.<init>(com.reown.android.verify.data.VerifyService, com.reown.android.verify.domain.JWTRepository, com.squareup.moshi.Moshi, com.reown.android.verify.domain.VerifyPublicKeyStorageRepository, kotlinx.coroutines.CoroutineScope):void type: THIS */
    public /* synthetic */ VerifyRepository(VerifyService verifyService, JWTRepository jWTRepository, Moshi moshi, VerifyPublicKeyStorageRepository verifyPublicKeyStorageRepository, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(verifyService, jWTRepository, moshi, verifyPublicKeyStorageRepository, (i & 16) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault())) : coroutineScope);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(7:12|48|13|30|34|40|41)(2:17|18))(1:19))(2:20|(1:22)(1:23))|45|24|(2:26|(1:28)(5:29|30|34|40|41))(5:32|33|34|40|41)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: getVerifyPublicKey-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7307getVerifyPublicKeyIoAF18A(@NotNull Continuation<? super Result<String>> continuation) throws Throwable {
        VerifyRepository$getVerifyPublicKey$1 verifyRepository$getVerifyPublicKey$1;
        Mutex mutex;
        VerifyRepository verifyRepository;
        String strComponent1;
        Mutex mutex2;
        Object objM7377constructorimpl;
        if (continuation instanceof VerifyRepository$getVerifyPublicKey$1) {
            verifyRepository$getVerifyPublicKey$1 = (VerifyRepository$getVerifyPublicKey$1) continuation;
            int i = verifyRepository$getVerifyPublicKey$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                verifyRepository$getVerifyPublicKey$1.label = i - Integer.MIN_VALUE;
            } else {
                verifyRepository$getVerifyPublicKey$1 = new VerifyRepository$getVerifyPublicKey$1(this, continuation);
            }
        }
        Object objFetchAndCacheKey = verifyRepository$getVerifyPublicKey$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = verifyRepository$getVerifyPublicKey$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objFetchAndCacheKey);
            mutex = this.mutex;
            verifyRepository$getVerifyPublicKey$1.L$0 = this;
            verifyRepository$getVerifyPublicKey$1.L$1 = mutex;
            verifyRepository$getVerifyPublicKey$1.label = 1;
            if (mutex.lock(null, verifyRepository$getVerifyPublicKey$1) == objCopydefault) {
                return objCopydefault;
            }
            verifyRepository = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) verifyRepository$getVerifyPublicKey$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objFetchAndCacheKey);
                    strComponent1 = (String) objFetchAndCacheKey;
                    objM7377constructorimpl = Result.m7377constructorimpl(strComponent1);
                } catch (Throwable th) {
                    th = th;
                    mutex = mutex2;
                    try {
                        Result.Application application = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        mutex2 = mutex;
                    } finally {
                        mutex.unlock(null);
                    }
                }
                return objM7377constructorimpl;
            }
            mutex = (Mutex) verifyRepository$getVerifyPublicKey$1.L$1;
            verifyRepository = (VerifyRepository) verifyRepository$getVerifyPublicKey$1.L$0;
            C56391yDq.AEQbTJ(objFetchAndCacheKey);
        }
        Result.Application application2 = Result.Companion;
        Pair<String, Long> publicKey = verifyRepository.verifyPublicKeyStorageRepository.getPublicKey();
        strComponent1 = publicKey.component1();
        if (!verifyRepository.isLocalKeyValid(strComponent1, publicKey.component2())) {
            verifyRepository$getVerifyPublicKey$1.L$0 = mutex;
            verifyRepository$getVerifyPublicKey$1.L$1 = null;
            verifyRepository$getVerifyPublicKey$1.label = 2;
            objFetchAndCacheKey = verifyRepository.fetchAndCacheKey(verifyRepository$getVerifyPublicKey$1);
            if (objFetchAndCacheKey == objCopydefault) {
                return objCopydefault;
            }
            mutex2 = mutex;
            strComponent1 = (String) objFetchAndCacheKey;
            objM7377constructorimpl = Result.m7377constructorimpl(strComponent1);
            return objM7377constructorimpl;
        }
        Intrinsics.copydefault((Object) strComponent1);
        mutex2 = mutex;
        objM7377constructorimpl = Result.m7377constructorimpl(strComponent1);
        return objM7377constructorimpl;
    }

    /* JADX INFO: renamed from: com.reown.android.verify.domain.VerifyRepository$resolveV2$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $attestationId;
        public final /* synthetic */ String $attestationJWT;
        public final /* synthetic */ String $metadataUrl;
        public final /* synthetic */ Function1<Throwable, Unit> $onError;
        public final /* synthetic */ Function1<VerifyResult, Unit> $onSuccess;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.domain.VerifyResult, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19061(String str, Function1<? super Throwable, Unit> function1, String str2, String str3, Function1<? super VerifyResult, Unit> function12, Continuation<? super C19061> continuation) {
            super(2, continuation);
            this.$attestationJWT = str;
            this.$onError = function1;
            this.$attestationId = str2;
            this.$metadataUrl = str3;
            this.$onSuccess = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return VerifyRepository.this.new C19061(this.$attestationJWT, this.$onError, this.$attestationId, this.$metadataUrl, this.$onSuccess, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.verify.domain.VerifyRepository$resolveV2$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ String $attestationId;
            public final /* synthetic */ String $attestationJWT;
            public final /* synthetic */ String $metadataUrl;
            public final /* synthetic */ Function1<Throwable, Unit> $onError;
            public final /* synthetic */ Function1<VerifyResult, Unit> $onSuccess;
            public Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public Object L$4;
            public int label;
            public final /* synthetic */ VerifyRepository this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.domain.VerifyResult, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07241(VerifyRepository verifyRepository, String str, Function1<? super Throwable, Unit> function1, String str2, String str3, Function1<? super VerifyResult, Unit> function12, Continuation<? super C07241> continuation) {
                super(2, continuation);
                this.this$0 = verifyRepository;
                this.$attestationJWT = str;
                this.$onError = function1;
                this.$attestationId = str2;
                this.$metadataUrl = str3;
                this.$onSuccess = function12;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07241(this.this$0, this.$attestationJWT, this.$onError, this.$attestationId, this.$metadataUrl, this.$onSuccess, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:35:0x00c8 A[Catch: Exception -> 0x0029, TryCatch #2 {Exception -> 0x0029, blocks: (B:7:0x0024, B:33:0x00b8, B:35:0x00c8, B:37:0x00e2, B:39:0x00ed, B:40:0x0102), top: B:51:0x0024 }] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0102 A[Catch: Exception -> 0x0029, TRY_LEAVE, TryCatch #2 {Exception -> 0x0029, blocks: (B:7:0x0024, B:33:0x00b8, B:35:0x00c8, B:37:0x00e2, B:39:0x00ed, B:40:0x0102), top: B:51:0x0024 }] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objM7307getVerifyPublicKeyIoAF18A;
                Function1<Throwable, Unit> function1;
                VerifyRepository verifyRepository;
                Function1<VerifyResult, Unit> function12;
                Function1<Throwable, Unit> function13;
                String str;
                String str2;
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    VerifyRepository verifyRepository2 = this.this$0;
                    this.label = 1;
                    objM7307getVerifyPublicKeyIoAF18A = verifyRepository2.m7307getVerifyPublicKeyIoAF18A(this);
                    if (objM7307getVerifyPublicKeyIoAF18A == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function12 = (Function1) this.L$4;
                        str2 = (String) this.L$3;
                        function13 = (Function1) this.L$2;
                        str = (String) this.L$1;
                        verifyRepository = (VerifyRepository) this.L$0;
                        try {
                            C56391yDq.AEQbTJ(obj);
                            if (!verifyRepository.jwtRepository.verifyJWT(str, UtilFunctionsKt.hexToBytes((String) obj))) {
                                VerifyClaims verifyClaims = (VerifyClaims) verifyRepository.moshi.adapter(VerifyClaims.class).fromJson(verifyRepository.jwtRepository.decodeClaimsJWT(str));
                                if (verifyClaims == null) {
                                    function13.invoke(new IllegalArgumentException("Error while decoding JWT claims"));
                                    return Unit.INSTANCE;
                                }
                                function12.invoke(new VerifyResult(verifyRepository.getValidation(verifyClaims, str2), verifyClaims.isScam(), verifyClaims.getOrigin()));
                            } else {
                                function13.invoke(new IllegalArgumentException("Error while verifying JWT"));
                            }
                        } catch (Exception e) {
                            e = e;
                            function1 = function13;
                            function1.invoke(e);
                        }
                        return Unit.INSTANCE;
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7307getVerifyPublicKeyIoAF18A = ((Result) obj).m7386unboximpl();
                }
                VerifyRepository verifyRepository3 = this.this$0;
                String str3 = this.$attestationJWT;
                function1 = this.$onError;
                String str4 = this.$attestationId;
                String str5 = this.$metadataUrl;
                Function1<VerifyResult, Unit> function14 = this.$onSuccess;
                Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7307getVerifyPublicKeyIoAF18A);
                if (thM7380exceptionOrNullimpl == null) {
                    if (verifyRepository3.jwtRepository.verifyJWT(str3, UtilFunctionsKt.hexToBytes((String) objM7307getVerifyPublicKeyIoAF18A))) {
                        try {
                            VerifyClaims verifyClaims2 = (VerifyClaims) verifyRepository3.moshi.adapter(VerifyClaims.class).fromJson(verifyRepository3.jwtRepository.decodeClaimsJWT(str3));
                            if (verifyClaims2 != null) {
                                verifyRepository3.checkIds(str4, verifyClaims2, str5, function14, function1);
                            } else {
                                function1.invoke(new IllegalArgumentException("Error while decoding JWT claims"));
                                return Unit.INSTANCE;
                            }
                        } catch (Exception e2) {
                            function1.invoke(e2);
                        }
                    } else {
                        try {
                            this.L$0 = verifyRepository3;
                            this.L$1 = str3;
                            this.L$2 = function1;
                            this.L$3 = str5;
                            this.L$4 = function14;
                            this.label = 2;
                            obj = verifyRepository3.fetchAndCacheKey(this);
                            if (obj == objCopydefault) {
                                return objCopydefault;
                            }
                            verifyRepository = verifyRepository3;
                            function12 = function14;
                            function13 = function1;
                            str = str3;
                            str2 = str5;
                            if (!verifyRepository.jwtRepository.verifyJWT(str, UtilFunctionsKt.hexToBytes((String) obj))) {
                            }
                        } catch (Exception e3) {
                            e = e3;
                            function1.invoke(e);
                        }
                    }
                } else {
                    function1.invoke(thM7380exceptionOrNullimpl);
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
                C07241 c07241 = new C07241(VerifyRepository.this, this.$attestationJWT, this.$onError, this.$attestationId, this.$metadataUrl, this.$onSuccess, null);
                this.label = 1;
                if (SupervisorKt.supervisorScope(c07241, this) == objCopydefault) {
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

    public final void resolveV2(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Function1<? super VerifyResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C19061(str2, function12, str, str3, function1, null), 3, null);
    }

    public final void checkIds(String str, VerifyClaims verifyClaims, String str2, Function1<? super VerifyResult, Unit> function1, Function1<? super Throwable, Unit> function12) {
        if (!Intrinsics.EZpvd((Object) str, (Object) verifyClaims.getId())) {
            resolve(str, str2, function1, function12);
        } else {
            function1.invoke(new VerifyResult(getValidation(verifyClaims, str2), verifyClaims.isScam(), verifyClaims.getOrigin()));
        }
    }

    public final Validation getValidation(VerifyClaims verifyClaims, String str) {
        if (!verifyClaims.isVerified() || Time.getCurrentTimeInSeconds() >= verifyClaims.getExpiration()) {
            return Validation.UNKNOWN;
        }
        return VerifyUtilsKt.getValidation(str, verifyClaims.getOrigin());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAndCacheKey(Continuation<? super String> continuation) throws Exception {
        AnonymousClass1 anonymousClass1;
        VerifyRepository verifyRepository;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object publicKey = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(publicKey);
            VerifyService verifyService = this.verifyService;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            publicKey = verifyService.getPublicKey(anonymousClass1);
            if (publicKey == objCopydefault) {
                return objCopydefault;
            }
            verifyRepository = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            verifyRepository = (VerifyRepository) anonymousClass1.L$0;
            C56391yDq.AEQbTJ(publicKey);
        }
        Response response = (Response) publicKey;
        if (response.isSuccessful() && response.body() != null) {
            JWTRepository jWTRepository = verifyRepository.jwtRepository;
            Object objBody = response.body();
            Intrinsics.copydefault(objBody);
            String strGenerateP256PublicKeyFromJWK = jWTRepository.generateP256PublicKeyFromJWK(((VerifyServerPublicKey) objBody).getJwk());
            VerifyPublicKeyStorageRepository verifyPublicKeyStorageRepository = verifyRepository.verifyPublicKeyStorageRepository;
            Object objBody2 = response.body();
            Intrinsics.copydefault(objBody2);
            verifyPublicKeyStorageRepository.upsertPublicKey(strGenerateP256PublicKeyFromJWK, ((VerifyServerPublicKey) objBody2).getExpiresAt());
            return strGenerateP256PublicKeyFromJWK;
        }
        ResponseBody responseBodyErrorBody = response.errorBody();
        throw new Exception("Error while fetching a Verify PublicKey: " + (responseBodyErrorBody != null ? responseBodyErrorBody.string() : null));
    }

    /* JADX INFO: renamed from: com.reown.android.verify.domain.VerifyRepository$resolve$1, reason: invalid class name and case insensitive filesystem */
    public static final class C19051 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String $attestationId;
        public final /* synthetic */ String $metadataUrl;
        public final /* synthetic */ Function1<Throwable, Unit> $onError;
        public final /* synthetic */ Function1<VerifyResult, Unit> $onSuccess;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.domain.VerifyResult, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C19051(String str, Function1<? super VerifyResult, Unit> function1, String str2, Function1<? super Throwable, Unit> function12, Continuation<? super C19051> continuation) {
            super(2, continuation);
            this.$attestationId = str;
            this.$onSuccess = function1;
            this.$metadataUrl = str2;
            this.$onError = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return VerifyRepository.this.new C19051(this.$attestationId, this.$onSuccess, this.$metadataUrl, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C19051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.reown.android.verify.domain.VerifyRepository$resolve$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C07231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ String $attestationId;
            public final /* synthetic */ String $metadataUrl;
            public final /* synthetic */ Function1<Throwable, Unit> $onError;
            public final /* synthetic */ Function1<VerifyResult, Unit> $onSuccess;
            public int label;
            public final /* synthetic */ VerifyRepository this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.android.verify.domain.VerifyResult, kotlin.Unit> */
            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07231(VerifyRepository verifyRepository, String str, Function1<? super VerifyResult, Unit> function1, String str2, Function1<? super Throwable, Unit> function12, Continuation<? super C07231> continuation) {
                super(2, continuation);
                this.this$0 = verifyRepository;
                this.$attestationId = str;
                this.$onSuccess = function1;
                this.$metadataUrl = str2;
                this.$onError = function12;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
                return new C07231(this.this$0, this.$attestationId, this.$onSuccess, this.$metadataUrl, this.$onError, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C07231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                try {
                    if (i == 0) {
                        C56391yDq.AEQbTJ(obj);
                        VerifyService verifyService = this.this$0.verifyService;
                        String str = this.$attestationId;
                        this.label = 1;
                        obj = verifyService.resolveAttestation(str, this);
                        if (obj == objCopydefault) {
                            return objCopydefault;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj);
                    }
                    Response response = (Response) obj;
                    if (response.isSuccessful() && response.body() != null) {
                        Object objBody = response.body();
                        Intrinsics.copydefault(objBody);
                        String origin = ((Origin) objBody).getOrigin();
                        Object objBody2 = response.body();
                        Intrinsics.copydefault(objBody2);
                        this.$onSuccess.invoke(new VerifyResult(VerifyUtilsKt.getValidation(this.$metadataUrl, origin), ((Origin) objBody2).isScam(), origin));
                    } else {
                        Function1<Throwable, Unit> function1 = this.$onError;
                        ResponseBody responseBodyErrorBody = response.errorBody();
                        function1.invoke(new IllegalArgumentException(responseBodyErrorBody != null ? responseBodyErrorBody.string() : null));
                    }
                } catch (Exception e) {
                    this.$onError.invoke(e);
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
                C07231 c07231 = new C07231(VerifyRepository.this, this.$attestationId, this.$onSuccess, this.$metadataUrl, this.$onError, null);
                this.label = 1;
                if (SupervisorKt.supervisorScope(c07231, this) == objCopydefault) {
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

    public final void resolve(@NotNull String str, @NotNull String str2, @NotNull Function1<? super VerifyResult, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C19051(str, function1, str2, function12, null), 3, null);
    }

    public final boolean isLocalKeyValid(String str, Long l) {
        return (str == null || l == null || isKeyExpired(l.longValue())) ? false : true;
    }

    public final boolean isKeyExpired(long j) {
        return Time.getCurrentTimeInSeconds() >= j;
    }
}
