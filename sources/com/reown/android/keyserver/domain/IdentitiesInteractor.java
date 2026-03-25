package com.reown.android.keyserver.domain;

import com.reown.android.internal.common.crypto.kmr.KeyManagementRepository;
import com.reown.android.internal.common.exception.AccountHasDifferentStatementStored;
import com.reown.android.internal.common.exception.AccountHasNoCacaoPayloadStored;
import com.reown.android.internal.common.exception.AccountHasNoIdentityStored;
import com.reown.android.internal.common.exception.InvalidAccountIdException;
import com.reown.android.internal.common.exception.InvalidIdentityCacao;
import com.reown.android.internal.common.exception.UserRejectedSigning;
import com.reown.android.internal.common.jwt.did.DidJwtRepository;
import com.reown.android.internal.common.jwt.did.EncodeDidJwtPayloadUseCase;
import com.reown.android.internal.common.jwt.did.EncodeIdentityKeyDidJwtPayloadUseCase;
import com.reown.android.internal.common.model.AccountId;
import com.reown.android.internal.common.model.DidJwt;
import com.reown.android.internal.common.model.MissingKeyException;
import com.reown.android.internal.common.model.ProjectId;
import com.reown.android.internal.common.signing.cacao.Cacao;
import com.reown.android.internal.common.signing.cacao.CacaoKt;
import com.reown.android.internal.common.signing.cacao.CacaoType;
import com.reown.android.internal.common.signing.cacao.CacaoVerifier;
import com.reown.android.internal.common.signing.cacao.Issuer;
import com.reown.android.internal.common.storage.identity.IdentitiesStorageRepository;
import com.reown.android.internal.utils.ContextKt;
import com.reown.android.keyserver.domain.use_case.RegisterIdentityUseCase;
import com.reown.android.keyserver.domain.use_case.ResolveIdentityUseCase;
import com.reown.android.keyserver.domain.use_case.UnregisterIdentityUseCase;
import com.reown.android.keyserver.model.KeyServerResponse;
import com.reown.foundation.common.model.PrivateKey;
import com.reown.foundation.common.model.PublicKey;
import com.reown.foundation.util.Logger;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import com.reown.util.UtilFunctionsKt;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class IdentitiesInteractor {
    public static final Companion Companion = new Companion(null);
    public static final int NONCE_SIZE = 32;
    public final IdentitiesStorageRepository identitiesRepository;
    public final KeyManagementRepository keyManagementRepository;
    public final Logger logger;
    public final ProjectId projectId;
    public final RegisterIdentityUseCase registerIdentityUseCase;
    public final ResolveIdentityUseCase resolveIdentityUseCase;
    public final UnregisterIdentityUseCase unregisterIdentityUseCase;

    public IdentitiesInteractor(@NotNull IdentitiesStorageRepository identitiesStorageRepository, @NotNull ResolveIdentityUseCase resolveIdentityUseCase, @NotNull RegisterIdentityUseCase registerIdentityUseCase, @NotNull UnregisterIdentityUseCase unregisterIdentityUseCase, @NotNull ProjectId projectId, @NotNull KeyManagementRepository keyManagementRepository, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(identitiesStorageRepository, "");
        Intrinsics.checkNotNullParameter(resolveIdentityUseCase, "");
        Intrinsics.checkNotNullParameter(registerIdentityUseCase, "");
        Intrinsics.checkNotNullParameter(unregisterIdentityUseCase, "");
        Intrinsics.checkNotNullParameter(projectId, "");
        Intrinsics.checkNotNullParameter(keyManagementRepository, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.identitiesRepository = identitiesStorageRepository;
        this.resolveIdentityUseCase = resolveIdentityUseCase;
        this.registerIdentityUseCase = registerIdentityUseCase;
        this.unregisterIdentityUseCase = unregisterIdentityUseCase;
        this.projectId = projectId;
        this.keyManagementRepository = keyManagementRepository;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: getIdentityKeyPair-PaLCHi0, reason: not valid java name */
    public final Pair<PublicKey, PrivateKey> m7284getIdentityKeyPairPaLCHi0(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.keyManagementRepository.mo7184getKeyPairwSlyqho(m7285getIdentityPublicKeywy9PYZM(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX INFO: renamed from: registerIdentity-xVnHb-c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7288registerIdentityxVnHbc(@NotNull String str, @NotNull String str2, @NotNull String str3, List<String> list, @NotNull String str4, @NotNull Function1<? super String, Cacao.Signature> function1, @NotNull Continuation<? super Result<PublicKey>> continuation) throws Throwable {
        IdentitiesInteractor$registerIdentity$1 identitiesInteractor$registerIdentity$1;
        String str5;
        List<String> list2;
        String str6;
        String str7;
        Object objM7386unboximpl;
        String str8;
        Function1<? super String, Cacao.Signature> function12;
        IdentitiesInteractor identitiesInteractor;
        Object objM7386unboximpl2;
        Object objM7280generateAndStoreNewIdentity21kkFcg;
        String strM7323unboximpl;
        if (continuation instanceof IdentitiesInteractor$registerIdentity$1) {
            identitiesInteractor$registerIdentity$1 = (IdentitiesInteractor$registerIdentity$1) continuation;
            int i = identitiesInteractor$registerIdentity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identitiesInteractor$registerIdentity$1.label = i - Integer.MIN_VALUE;
            } else {
                identitiesInteractor$registerIdentity$1 = new IdentitiesInteractor$registerIdentity$1(this, continuation);
            }
        }
        IdentitiesInteractor$registerIdentity$1 identitiesInteractor$registerIdentity$12 = identitiesInteractor$registerIdentity$1;
        Object obj = identitiesInteractor$registerIdentity$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = identitiesInteractor$registerIdentity$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                identitiesInteractor$registerIdentity$12.L$0 = this;
                identitiesInteractor$registerIdentity$12.L$1 = str;
                identitiesInteractor$registerIdentity$12.L$2 = str2;
                str5 = str3;
                identitiesInteractor$registerIdentity$12.L$3 = str5;
                list2 = list;
                identitiesInteractor$registerIdentity$12.L$4 = list2;
                str6 = str4;
                identitiesInteractor$registerIdentity$12.L$5 = str6;
                identitiesInteractor$registerIdentity$12.L$6 = function1;
                identitiesInteractor$registerIdentity$12.label = 1;
                Object objM7283getAlreadyRegisteredValidIdentitycBM7WSQ = m7283getAlreadyRegisteredValidIdentitycBM7WSQ(str, str2, str3, list, identitiesInteractor$registerIdentity$12);
                if (objM7283getAlreadyRegisteredValidIdentitycBM7WSQ == objCopydefault) {
                    return objCopydefault;
                }
                str7 = str;
                objM7386unboximpl = objM7283getAlreadyRegisteredValidIdentitycBM7WSQ;
                str8 = str2;
                function12 = function1;
                identitiesInteractor = this;
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        C56391yDq.AEQbTJ(obj);
                        objM7280generateAndStoreNewIdentity21kkFcg = ((Result) obj).m7386unboximpl();
                        C56391yDq.AEQbTJ(objM7280generateAndStoreNewIdentity21kkFcg);
                        strM7323unboximpl = ((PublicKey) objM7280generateAndStoreNewIdentity21kkFcg).m7323unboximpl();
                        return Result.m7377constructorimpl(PublicKey.m7316boximpl(strM7323unboximpl));
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    objM7386unboximpl2 = ((Result) obj).m7386unboximpl();
                    C56391yDq.AEQbTJ(objM7386unboximpl2);
                    strM7323unboximpl = ((PublicKey) objM7386unboximpl2).m7323unboximpl();
                    return Result.m7377constructorimpl(PublicKey.m7316boximpl(strM7323unboximpl));
                }
                function12 = (Function1) identitiesInteractor$registerIdentity$12.L$6;
                String str9 = (String) identitiesInteractor$registerIdentity$12.L$5;
                List<String> list3 = (List) identitiesInteractor$registerIdentity$12.L$4;
                String str10 = (String) identitiesInteractor$registerIdentity$12.L$3;
                str8 = (String) identitiesInteractor$registerIdentity$12.L$2;
                str7 = (String) identitiesInteractor$registerIdentity$12.L$1;
                identitiesInteractor = (IdentitiesInteractor) identitiesInteractor$registerIdentity$12.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7386unboximpl = ((Result) obj).m7386unboximpl();
                str6 = str9;
                list2 = list3;
                str5 = str10;
            }
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7386unboximpl);
            if (thM7380exceptionOrNullimpl == null) {
                return objM7386unboximpl;
            }
            Result.Application application = Result.Companion;
            if (thM7380exceptionOrNullimpl instanceof MissingKeyException) {
                identitiesInteractor$registerIdentity$12.L$0 = null;
                identitiesInteractor$registerIdentity$12.L$1 = null;
                identitiesInteractor$registerIdentity$12.L$2 = null;
                identitiesInteractor$registerIdentity$12.L$3 = null;
                identitiesInteractor$registerIdentity$12.L$4 = null;
                identitiesInteractor$registerIdentity$12.L$5 = null;
                identitiesInteractor$registerIdentity$12.L$6 = null;
                identitiesInteractor$registerIdentity$12.label = 2;
                objM7280generateAndStoreNewIdentity21kkFcg = identitiesInteractor.m7280generateAndStoreNewIdentity21kkFcg(str7, str8, str5, list2, function12, identitiesInteractor$registerIdentity$12);
                if (objM7280generateAndStoreNewIdentity21kkFcg == objCopydefault) {
                    return objCopydefault;
                }
                C56391yDq.AEQbTJ(objM7280generateAndStoreNewIdentity21kkFcg);
                strM7323unboximpl = ((PublicKey) objM7280generateAndStoreNewIdentity21kkFcg).m7323unboximpl();
                return Result.m7377constructorimpl(PublicKey.m7316boximpl(strM7323unboximpl));
            }
            if (!(thM7380exceptionOrNullimpl instanceof AccountHasNoCacaoPayloadStored) && !(thM7380exceptionOrNullimpl instanceof AccountHasDifferentStatementStored)) {
                throw thM7380exceptionOrNullimpl;
            }
            identitiesInteractor$registerIdentity$12.L$0 = null;
            identitiesInteractor$registerIdentity$12.L$1 = null;
            identitiesInteractor$registerIdentity$12.L$2 = null;
            identitiesInteractor$registerIdentity$12.L$3 = null;
            identitiesInteractor$registerIdentity$12.L$4 = null;
            identitiesInteractor$registerIdentity$12.L$5 = null;
            identitiesInteractor$registerIdentity$12.L$6 = null;
            identitiesInteractor$registerIdentity$12.label = 3;
            Object objM7286handleIdentitiesOutdatedStatementsxVnHbc = identitiesInteractor.m7286handleIdentitiesOutdatedStatementsxVnHbc(str7, str8, str5, list2, str6, function12, identitiesInteractor$registerIdentity$12);
            if (objM7286handleIdentitiesOutdatedStatementsxVnHbc == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl2 = objM7286handleIdentitiesOutdatedStatementsxVnHbc;
            C56391yDq.AEQbTJ(objM7386unboximpl2);
            strM7323unboximpl = ((PublicKey) objM7386unboximpl2).m7323unboximpl();
            return Result.m7377constructorimpl(PublicKey.m7316boximpl(strM7323unboximpl));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: registerIdentity-fEM-vcc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7287registerIdentityfEMvcc(@NotNull String str, @NotNull Cacao.Payload payload, @NotNull Cacao.Signature signature, @NotNull Continuation<? super Result<Unit>> continuation) throws Throwable {
        IdentitiesInteractor$registerIdentity$3 identitiesInteractor$registerIdentity$3;
        Cacao.Payload payload2;
        Object objM7386unboximpl;
        IdentitiesInteractor identitiesInteractor;
        IdentitiesInteractor identitiesInteractor2;
        String str2;
        String str3;
        if (continuation instanceof IdentitiesInteractor$registerIdentity$3) {
            identitiesInteractor$registerIdentity$3 = (IdentitiesInteractor$registerIdentity$3) continuation;
            int i = identitiesInteractor$registerIdentity$3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identitiesInteractor$registerIdentity$3.label = i - Integer.MIN_VALUE;
            } else {
                identitiesInteractor$registerIdentity$3 = new IdentitiesInteractor$registerIdentity$3(this, continuation);
            }
        }
        IdentitiesInteractor$registerIdentity$3 identitiesInteractor$registerIdentity$32 = identitiesInteractor$registerIdentity$3;
        Object obj = identitiesInteractor$registerIdentity$32.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = identitiesInteractor$registerIdentity$32.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            RegisterIdentityUseCase registerIdentityUseCase = this.registerIdentityUseCase;
            Cacao cacao = new Cacao(CacaoType.EIP4361.toHeader(), payload, signature);
            identitiesInteractor$registerIdentity$32.L$0 = this;
            identitiesInteractor$registerIdentity$32.L$1 = str;
            identitiesInteractor$registerIdentity$32.L$2 = payload;
            identitiesInteractor$registerIdentity$32.label = 1;
            Object objM7298invokegIAlus = registerIdentityUseCase.m7298invokegIAlus(cacao, identitiesInteractor$registerIdentity$32);
            if (objM7298invokegIAlus == objCopydefault) {
                return objCopydefault;
            }
            payload2 = payload;
            objM7386unboximpl = objM7298invokegIAlus;
            identitiesInteractor = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (String) identitiesInteractor$registerIdentity$32.L$3;
                objM7386unboximpl = identitiesInteractor$registerIdentity$32.L$2;
                str2 = (String) identitiesInteractor$registerIdentity$32.L$1;
                identitiesInteractor2 = (IdentitiesInteractor) identitiesInteractor$registerIdentity$32.L$0;
                C56391yDq.AEQbTJ(obj);
                identitiesInteractor2.m7295storeIdentityPublicKeyjnUdMTY(str2, str3);
                return objM7386unboximpl;
            }
            Cacao.Payload payload3 = (Cacao.Payload) identitiesInteractor$registerIdentity$32.L$2;
            str = (String) identitiesInteractor$registerIdentity$32.L$1;
            identitiesInteractor = (IdentitiesInteractor) identitiesInteractor$registerIdentity$32.L$0;
            C56391yDq.AEQbTJ(obj);
            payload2 = payload3;
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            String strM7211constructorimpl = AccountId.m7211constructorimpl(new Issuer(payload2.getIss()).getAccountId());
            IdentitiesStorageRepository identitiesStorageRepository = identitiesInteractor.identitiesRepository;
            identitiesInteractor$registerIdentity$32.L$0 = identitiesInteractor;
            identitiesInteractor$registerIdentity$32.L$1 = str;
            identitiesInteractor$registerIdentity$32.L$2 = objM7386unboximpl;
            identitiesInteractor$registerIdentity$32.L$3 = strM7211constructorimpl;
            identitiesInteractor$registerIdentity$32.label = 2;
            if (identitiesStorageRepository.m7267insertIdentityRiN_R_Q(str, strM7211constructorimpl, payload2, true, identitiesInteractor$registerIdentity$32) == objCopydefault) {
                return objCopydefault;
            }
            identitiesInteractor2 = identitiesInteractor;
            str2 = str;
            str3 = strM7211constructorimpl;
            identitiesInteractor2.m7295storeIdentityPublicKeyjnUdMTY(str2, str3);
        }
        return objM7386unboximpl;
    }

    /* JADX INFO: renamed from: getAlreadyRegisteredValidIdentity-cBM7WSQ$default, reason: not valid java name */
    public static /* synthetic */ Object m7277getAlreadyRegisteredValidIdentitycBM7WSQ$default(IdentitiesInteractor identitiesInteractor, String str, String str2, String str3, List list, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return identitiesInteractor.m7283getAlreadyRegisteredValidIdentitycBM7WSQ(str, str2, str3, list, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX INFO: renamed from: getAlreadyRegisteredValidIdentity-cBM7WSQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7283getAlreadyRegisteredValidIdentitycBM7WSQ(@NotNull String str, String str2, @NotNull String str3, List<String> list, @NotNull Continuation<? super Result<PublicKey>> continuation) throws Throwable {
        IdentitiesInteractor$getAlreadyRegisteredValidIdentity$1 identitiesInteractor$getAlreadyRegisteredValidIdentity$1;
        String strM7285getIdentityPublicKeywy9PYZM;
        Object cacaoPayloadByIdentity;
        String str4;
        String str5;
        List<String> list2;
        IdentitiesInteractor identitiesInteractor;
        String str6 = str;
        if (continuation instanceof IdentitiesInteractor$getAlreadyRegisteredValidIdentity$1) {
            identitiesInteractor$getAlreadyRegisteredValidIdentity$1 = (IdentitiesInteractor$getAlreadyRegisteredValidIdentity$1) continuation;
            int i = identitiesInteractor$getAlreadyRegisteredValidIdentity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identitiesInteractor$getAlreadyRegisteredValidIdentity$1.label = i - Integer.MIN_VALUE;
            } else {
                identitiesInteractor$getAlreadyRegisteredValidIdentity$1 = new IdentitiesInteractor$getAlreadyRegisteredValidIdentity$1(this, continuation);
            }
        }
        Object obj = identitiesInteractor$getAlreadyRegisteredValidIdentity$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = identitiesInteractor$getAlreadyRegisteredValidIdentity$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                if (!AccountId.m7215isValidimpl(str)) {
                    throw new InvalidAccountIdException(str6, null);
                }
                Result.Application application = Result.Companion;
                strM7285getIdentityPublicKeywy9PYZM = m7285getIdentityPublicKeywy9PYZM(str);
                IdentitiesStorageRepository identitiesStorageRepository = this.identitiesRepository;
                identitiesInteractor$getAlreadyRegisteredValidIdentity$1.L$0 = str6;
                identitiesInteractor$getAlreadyRegisteredValidIdentity$1.L$1 = str2;
                identitiesInteractor$getAlreadyRegisteredValidIdentity$1.L$2 = str3;
                identitiesInteractor$getAlreadyRegisteredValidIdentity$1.L$3 = list;
                identitiesInteractor$getAlreadyRegisteredValidIdentity$1.L$4 = this;
                identitiesInteractor$getAlreadyRegisteredValidIdentity$1.L$5 = strM7285getIdentityPublicKeywy9PYZM;
                identitiesInteractor$getAlreadyRegisteredValidIdentity$1.label = 1;
                cacaoPayloadByIdentity = identitiesStorageRepository.getCacaoPayloadByIdentity(strM7285getIdentityPublicKeywy9PYZM, identitiesInteractor$getAlreadyRegisteredValidIdentity$1);
                if (cacaoPayloadByIdentity == objCopydefault) {
                    return objCopydefault;
                }
                str4 = str2;
                str5 = str3;
                list2 = list;
                identitiesInteractor = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str7 = (String) identitiesInteractor$getAlreadyRegisteredValidIdentity$1.L$5;
                IdentitiesInteractor identitiesInteractor2 = (IdentitiesInteractor) identitiesInteractor$getAlreadyRegisteredValidIdentity$1.L$4;
                List<String> list3 = (List) identitiesInteractor$getAlreadyRegisteredValidIdentity$1.L$3;
                String str8 = (String) identitiesInteractor$getAlreadyRegisteredValidIdentity$1.L$2;
                String str9 = (String) identitiesInteractor$getAlreadyRegisteredValidIdentity$1.L$1;
                String str10 = (String) identitiesInteractor$getAlreadyRegisteredValidIdentity$1.L$0;
                C56391yDq.AEQbTJ(obj);
                list2 = list3;
                str5 = str8;
                str4 = str9;
                identitiesInteractor = identitiesInteractor2;
                strM7285getIdentityPublicKeywy9PYZM = str7;
                str6 = str10;
                cacaoPayloadByIdentity = obj;
            }
            Cacao.Payload payload = (Cacao.Payload) cacaoPayloadByIdentity;
            if (payload == null) {
                throw new AccountHasNoCacaoPayloadStored(str6, null);
            }
            Object objM7281generatePayload2YvqGik = identitiesInteractor.m7281generatePayload2YvqGik(str6, strM7285getIdentityPublicKeywy9PYZM, str4, str5, list2);
            C56391yDq.AEQbTJ(objM7281generatePayload2YvqGik);
            if (Intrinsics.EZpvd((Object) payload.getStatement(), (Object) ((Cacao.Payload) objM7281generatePayload2YvqGik).getStatement())) {
                return Result.m7377constructorimpl(PublicKey.m7316boximpl(strM7285getIdentityPublicKeywy9PYZM));
            }
            throw new AccountHasDifferentStatementStored(str6, null);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: generateAndStoreNewIdentity-21kkFcg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7280generateAndStoreNewIdentity21kkFcg(String str, String str2, String str3, List<String> list, Function1<? super String, Cacao.Signature> function1, Continuation<? super Result<PublicKey>> continuation) throws Throwable {
        IdentitiesInteractor$generateAndStoreNewIdentity$1 identitiesInteractor$generateAndStoreNewIdentity$1;
        Object objM7289registerIdentityKeyInKeyserveruJKfU3c;
        IdentitiesInteractor identitiesInteractor;
        String str4;
        String str5;
        if (continuation instanceof IdentitiesInteractor$generateAndStoreNewIdentity$1) {
            identitiesInteractor$generateAndStoreNewIdentity$1 = (IdentitiesInteractor$generateAndStoreNewIdentity$1) continuation;
            int i = identitiesInteractor$generateAndStoreNewIdentity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identitiesInteractor$generateAndStoreNewIdentity$1.label = i - Integer.MIN_VALUE;
            } else {
                identitiesInteractor$generateAndStoreNewIdentity$1 = new IdentitiesInteractor$generateAndStoreNewIdentity$1(this, continuation);
            }
        }
        IdentitiesInteractor$generateAndStoreNewIdentity$1 identitiesInteractor$generateAndStoreNewIdentity$12 = identitiesInteractor$generateAndStoreNewIdentity$1;
        Object obj = identitiesInteractor$generateAndStoreNewIdentity$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = identitiesInteractor$generateAndStoreNewIdentity$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            String strM7279generateAndStoreIdentityKeyPairuN_RPug = m7279generateAndStoreIdentityKeyPairuN_RPug();
            identitiesInteractor$generateAndStoreNewIdentity$12.L$0 = this;
            identitiesInteractor$generateAndStoreNewIdentity$12.L$1 = str;
            identitiesInteractor$generateAndStoreNewIdentity$12.L$2 = strM7279generateAndStoreIdentityKeyPairuN_RPug;
            identitiesInteractor$generateAndStoreNewIdentity$12.label = 1;
            objM7289registerIdentityKeyInKeyserveruJKfU3c = m7289registerIdentityKeyInKeyserveruJKfU3c(str, strM7279generateAndStoreIdentityKeyPairuN_RPug, str2, str3, list, function1, identitiesInteractor$generateAndStoreNewIdentity$12);
            if (objM7289registerIdentityKeyInKeyserveruJKfU3c == objCopydefault) {
                return objCopydefault;
            }
            identitiesInteractor = this;
            str4 = str;
            str5 = strM7279generateAndStoreIdentityKeyPairuN_RPug;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str5 = (String) identitiesInteractor$generateAndStoreNewIdentity$12.L$2;
            str4 = (String) identitiesInteractor$generateAndStoreNewIdentity$12.L$1;
            identitiesInteractor = (IdentitiesInteractor) identitiesInteractor$generateAndStoreNewIdentity$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7289registerIdentityKeyInKeyserveruJKfU3c = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM7289registerIdentityKeyInKeyserveruJKfU3c)) {
            Result.Application application = Result.Companion;
            objM7289registerIdentityKeyInKeyserveruJKfU3c = PublicKey.m7316boximpl(str5);
        }
        Object objM7377constructorimpl = Result.m7377constructorimpl(objM7289registerIdentityKeyInKeyserveruJKfU3c);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            ((PublicKey) objM7377constructorimpl).m7323unboximpl();
            identitiesInteractor.m7295storeIdentityPublicKeyjnUdMTY(str5, str4);
        }
        return objM7377constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX INFO: renamed from: handleIdentitiesOutdatedStatements-xVnHb-c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7286handleIdentitiesOutdatedStatementsxVnHbc(String str, String str2, String str3, List<String> list, String str4, Function1<? super String, Cacao.Signature> function1, Continuation<? super Result<PublicKey>> continuation) throws Throwable {
        IdentitiesInteractor$handleIdentitiesOutdatedStatements$1 identitiesInteractor$handleIdentitiesOutdatedStatements$1;
        String str5;
        String str6;
        Function1<? super String, Cacao.Signature> function12;
        Object objM7297unregisterIdentityKeyInKeyserverslDN04U;
        String str7;
        IdentitiesInteractor identitiesInteractor;
        String str8;
        List<String> list2;
        if (continuation instanceof IdentitiesInteractor$handleIdentitiesOutdatedStatements$1) {
            identitiesInteractor$handleIdentitiesOutdatedStatements$1 = (IdentitiesInteractor$handleIdentitiesOutdatedStatements$1) continuation;
            int i = identitiesInteractor$handleIdentitiesOutdatedStatements$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identitiesInteractor$handleIdentitiesOutdatedStatements$1.label = i - Integer.MIN_VALUE;
            } else {
                identitiesInteractor$handleIdentitiesOutdatedStatements$1 = new IdentitiesInteractor$handleIdentitiesOutdatedStatements$1(this, continuation);
            }
        }
        IdentitiesInteractor$handleIdentitiesOutdatedStatements$1 identitiesInteractor$handleIdentitiesOutdatedStatements$12 = identitiesInteractor$handleIdentitiesOutdatedStatements$1;
        Object obj = identitiesInteractor$handleIdentitiesOutdatedStatements$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = identitiesInteractor$handleIdentitiesOutdatedStatements$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Pair<PublicKey, PrivateKey> pairM7284getIdentityKeyPairPaLCHi0 = m7284getIdentityKeyPairPaLCHi0(str);
            String strM7323unboximpl = pairM7284getIdentityKeyPairPaLCHi0.component1().m7323unboximpl();
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$0 = this;
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$1 = str;
            str5 = str2;
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$2 = str5;
            str6 = str3;
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$3 = str6;
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$4 = list;
            function12 = function1;
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$5 = function12;
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$6 = strM7323unboximpl;
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.label = 1;
            objM7297unregisterIdentityKeyInKeyserverslDN04U = m7297unregisterIdentityKeyInKeyserverslDN04U(str, str4, pairM7284getIdentityKeyPairPaLCHi0, identitiesInteractor$handleIdentitiesOutdatedStatements$12);
            if (objM7297unregisterIdentityKeyInKeyserverslDN04U == objCopydefault) {
                return objCopydefault;
            }
            str7 = strM7323unboximpl;
            identitiesInteractor = this;
            str8 = str;
            list2 = list;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$0;
                C56391yDq.AEQbTJ(obj);
                ((Result) obj).m7386unboximpl();
                return obj2;
            }
            String str9 = (String) identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$6;
            Function1<? super String, Cacao.Signature> function13 = (Function1) identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$5;
            List<String> list3 = (List) identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$4;
            String str10 = (String) identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$3;
            String str11 = (String) identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$2;
            str8 = (String) identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$1;
            IdentitiesInteractor identitiesInteractor2 = (IdentitiesInteractor) identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7297unregisterIdentityKeyInKeyserverslDN04U = ((Result) obj).m7386unboximpl();
            str7 = str9;
            list2 = list3;
            function12 = function13;
            identitiesInteractor = identitiesInteractor2;
            str6 = str10;
            str5 = str11;
        }
        if (Result.m7384isSuccessimpl(objM7297unregisterIdentityKeyInKeyserverslDN04U)) {
            Result.Application application = Result.Companion;
            objM7297unregisterIdentityKeyInKeyserverslDN04U = PublicKey.m7316boximpl(str7);
        }
        Object objM7377constructorimpl = Result.m7377constructorimpl(objM7297unregisterIdentityKeyInKeyserverslDN04U);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            ((PublicKey) objM7377constructorimpl).m7323unboximpl();
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$0 = objM7377constructorimpl;
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$1 = null;
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$2 = null;
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$3 = null;
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$4 = null;
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$5 = null;
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.L$6 = null;
            identitiesInteractor$handleIdentitiesOutdatedStatements$12.label = 2;
            if (identitiesInteractor.m7289registerIdentityKeyInKeyserveruJKfU3c(str8, str7, str5, str6, list2, function12, identitiesInteractor$handleIdentitiesOutdatedStatements$12) == objCopydefault) {
                return objCopydefault;
            }
        }
        return objM7377constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: unregisterIdentity-K-ifgIg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7296unregisterIdentityKifgIg(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Result<PublicKey>> continuation) throws Throwable {
        IdentitiesInteractor$unregisterIdentity$1 identitiesInteractor$unregisterIdentity$1;
        Object objM7297unregisterIdentityKeyInKeyserverslDN04U;
        IdentitiesInteractor identitiesInteractor;
        String str3;
        String str4;
        if (continuation instanceof IdentitiesInteractor$unregisterIdentity$1) {
            identitiesInteractor$unregisterIdentity$1 = (IdentitiesInteractor$unregisterIdentity$1) continuation;
            int i = identitiesInteractor$unregisterIdentity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identitiesInteractor$unregisterIdentity$1.label = i - Integer.MIN_VALUE;
            } else {
                identitiesInteractor$unregisterIdentity$1 = new IdentitiesInteractor$unregisterIdentity$1(this, continuation);
            }
        }
        Object obj = identitiesInteractor$unregisterIdentity$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = identitiesInteractor$unregisterIdentity$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                if (!AccountId.m7215isValidimpl(str)) {
                    throw new InvalidAccountIdException(str, null);
                }
                Pair<PublicKey, PrivateKey> pairM7284getIdentityKeyPairPaLCHi0 = m7284getIdentityKeyPairPaLCHi0(str);
                String strM7323unboximpl = pairM7284getIdentityKeyPairPaLCHi0.component1().m7323unboximpl();
                identitiesInteractor$unregisterIdentity$1.L$0 = this;
                identitiesInteractor$unregisterIdentity$1.L$1 = str;
                identitiesInteractor$unregisterIdentity$1.L$2 = strM7323unboximpl;
                identitiesInteractor$unregisterIdentity$1.label = 1;
                objM7297unregisterIdentityKeyInKeyserverslDN04U = m7297unregisterIdentityKeyInKeyserverslDN04U(str, str2, pairM7284getIdentityKeyPairPaLCHi0, identitiesInteractor$unregisterIdentity$1);
                if (objM7297unregisterIdentityKeyInKeyserverslDN04U == objCopydefault) {
                    return objCopydefault;
                }
                identitiesInteractor = this;
                str3 = str;
                str4 = strM7323unboximpl;
            } catch (MissingKeyException unused) {
                throw new AccountHasNoIdentityStored(str, null);
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str4 = (String) identitiesInteractor$unregisterIdentity$1.L$2;
            str3 = (String) identitiesInteractor$unregisterIdentity$1.L$1;
            identitiesInteractor = (IdentitiesInteractor) identitiesInteractor$unregisterIdentity$1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                objM7297unregisterIdentityKeyInKeyserverslDN04U = ((Result) obj).m7386unboximpl();
            } catch (MissingKeyException unused2) {
                str = str3;
                throw new AccountHasNoIdentityStored(str, null);
            }
        }
        if (Result.m7384isSuccessimpl(objM7297unregisterIdentityKeyInKeyserverslDN04U)) {
            Result.Application application = Result.Companion;
            objM7297unregisterIdentityKeyInKeyserverslDN04U = PublicKey.m7316boximpl(str4);
        }
        Object objM7377constructorimpl = Result.m7377constructorimpl(objM7297unregisterIdentityKeyInKeyserverslDN04U);
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            ((PublicKey) objM7377constructorimpl).m7323unboximpl();
            identitiesInteractor.m7290removeIdentityKeyPairjnUdMTY(str4, str3);
        }
        return objM7377constructorimpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: resolveIdentity-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7292resolveIdentitygIAlus(String str, Continuation<? super Result<AccountId>> continuation) throws Throwable {
        IdentitiesInteractor$resolveIdentity$1 identitiesInteractor$resolveIdentity$1;
        Object objM7294resolveIdentityLocallygIAlus;
        IdentitiesInteractor identitiesInteractor;
        Object objM7291resolveAndStoreIdentityRemotelygIAlus;
        if (continuation instanceof IdentitiesInteractor$resolveIdentity$1) {
            identitiesInteractor$resolveIdentity$1 = (IdentitiesInteractor$resolveIdentity$1) continuation;
            int i = identitiesInteractor$resolveIdentity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identitiesInteractor$resolveIdentity$1.label = i - Integer.MIN_VALUE;
            } else {
                identitiesInteractor$resolveIdentity$1 = new IdentitiesInteractor$resolveIdentity$1(this, continuation);
            }
        }
        Object obj = identitiesInteractor$resolveIdentity$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = identitiesInteractor$resolveIdentity$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            identitiesInteractor$resolveIdentity$1.L$0 = this;
            identitiesInteractor$resolveIdentity$1.L$1 = str;
            identitiesInteractor$resolveIdentity$1.label = 1;
            objM7294resolveIdentityLocallygIAlus = m7294resolveIdentityLocallygIAlus(str, identitiesInteractor$resolveIdentity$1);
            if (objM7294resolveIdentityLocallygIAlus == objCopydefault) {
                return objCopydefault;
            }
            identitiesInteractor = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7291resolveAndStoreIdentityRemotelygIAlus = ((Result) obj).m7386unboximpl();
                C56391yDq.AEQbTJ(objM7291resolveAndStoreIdentityRemotelygIAlus);
                return Result.m7377constructorimpl(AccountId.m7210boximpl(((AccountId) objM7291resolveAndStoreIdentityRemotelygIAlus).m7217unboximpl()));
            }
            str = (String) identitiesInteractor$resolveIdentity$1.L$1;
            identitiesInteractor = (IdentitiesInteractor) identitiesInteractor$resolveIdentity$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7294resolveIdentityLocallygIAlus = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7380exceptionOrNullimpl(objM7294resolveIdentityLocallygIAlus) == null) {
            return objM7294resolveIdentityLocallygIAlus;
        }
        Result.Application application = Result.Companion;
        identitiesInteractor$resolveIdentity$1.L$0 = null;
        identitiesInteractor$resolveIdentity$1.L$1 = null;
        identitiesInteractor$resolveIdentity$1.label = 2;
        objM7291resolveAndStoreIdentityRemotelygIAlus = identitiesInteractor.m7291resolveAndStoreIdentityRemotelygIAlus(str, identitiesInteractor$resolveIdentity$1);
        if (objM7291resolveAndStoreIdentityRemotelygIAlus == objCopydefault) {
            return objCopydefault;
        }
        C56391yDq.AEQbTJ(objM7291resolveAndStoreIdentityRemotelygIAlus);
        return Result.m7377constructorimpl(AccountId.m7210boximpl(((AccountId) objM7291resolveAndStoreIdentityRemotelygIAlus).m7217unboximpl()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: resolveIdentityDidKey-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7293resolveIdentityDidKeygIAlus(@NotNull String str, @NotNull Continuation<? super Result<AccountId>> continuation) throws Throwable {
        IdentitiesInteractor$resolveIdentityDidKey$1 identitiesInteractor$resolveIdentityDidKey$1;
        if (continuation instanceof IdentitiesInteractor$resolveIdentityDidKey$1) {
            identitiesInteractor$resolveIdentityDidKey$1 = (IdentitiesInteractor$resolveIdentityDidKey$1) continuation;
            int i = identitiesInteractor$resolveIdentityDidKey$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identitiesInteractor$resolveIdentityDidKey$1.label = i - Integer.MIN_VALUE;
            } else {
                identitiesInteractor$resolveIdentityDidKey$1 = new IdentitiesInteractor$resolveIdentityDidKey$1(this, continuation);
            }
        }
        Object obj = identitiesInteractor$resolveIdentityDidKey$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = identitiesInteractor$resolveIdentityDidKey$1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            return ((Result) obj).m7386unboximpl();
        }
        C56391yDq.AEQbTJ(obj);
        String str2 = (String) CollectionsKt___CollectionsKt.AubY(StringsKt__StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 0, 6, (Object) null));
        identitiesInteractor$resolveIdentityDidKey$1.label = 1;
        Object objM7292resolveIdentitygIAlus = m7292resolveIdentitygIAlus(str2, identitiesInteractor$resolveIdentityDidKey$1);
        return objM7292resolveIdentitygIAlus == objCopydefault ? objCopydefault : objM7292resolveIdentitygIAlus;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: resolveIdentityLocally-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7294resolveIdentityLocallygIAlus(String str, Continuation<? super Result<AccountId>> continuation) throws Throwable {
        IdentitiesInteractor$resolveIdentityLocally$1 identitiesInteractor$resolveIdentityLocally$1;
        Object objM7266getAccountIdyrRQGmQ;
        if (continuation instanceof IdentitiesInteractor$resolveIdentityLocally$1) {
            identitiesInteractor$resolveIdentityLocally$1 = (IdentitiesInteractor$resolveIdentityLocally$1) continuation;
            int i = identitiesInteractor$resolveIdentityLocally$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identitiesInteractor$resolveIdentityLocally$1.label = i - Integer.MIN_VALUE;
            } else {
                identitiesInteractor$resolveIdentityLocally$1 = new IdentitiesInteractor$resolveIdentityLocally$1(this, continuation);
            }
        }
        Object obj = identitiesInteractor$resolveIdentityLocally$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = identitiesInteractor$resolveIdentityLocally$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                Result.Application application = Result.Companion;
                IdentitiesStorageRepository identitiesStorageRepository = this.identitiesRepository;
                identitiesInteractor$resolveIdentityLocally$1.label = 1;
                objM7266getAccountIdyrRQGmQ = identitiesStorageRepository.m7266getAccountIdyrRQGmQ(str, identitiesInteractor$resolveIdentityLocally$1);
                if (objM7266getAccountIdyrRQGmQ == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                objM7266getAccountIdyrRQGmQ = ((AccountId) obj).m7217unboximpl();
            }
            return Result.m7377constructorimpl(AccountId.m7210boximpl((String) objM7266getAccountIdyrRQGmQ));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: resolveAndStoreIdentityRemotely-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7291resolveAndStoreIdentityRemotelygIAlus(String str, Continuation<? super Result<AccountId>> continuation) throws Throwable {
        IdentitiesInteractor$resolveAndStoreIdentityRemotely$1 identitiesInteractor$resolveAndStoreIdentityRemotely$1;
        Object objM7300invokegIAlus;
        IdentitiesInteractor identitiesInteractor;
        String str2;
        if (continuation instanceof IdentitiesInteractor$resolveAndStoreIdentityRemotely$1) {
            identitiesInteractor$resolveAndStoreIdentityRemotely$1 = (IdentitiesInteractor$resolveAndStoreIdentityRemotely$1) continuation;
            int i = identitiesInteractor$resolveAndStoreIdentityRemotely$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identitiesInteractor$resolveAndStoreIdentityRemotely$1.label = i - Integer.MIN_VALUE;
            } else {
                identitiesInteractor$resolveAndStoreIdentityRemotely$1 = new IdentitiesInteractor$resolveAndStoreIdentityRemotely$1(this, continuation);
            }
        }
        IdentitiesInteractor$resolveAndStoreIdentityRemotely$1 identitiesInteractor$resolveAndStoreIdentityRemotely$12 = identitiesInteractor$resolveAndStoreIdentityRemotely$1;
        Object obj = identitiesInteractor$resolveAndStoreIdentityRemotely$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = identitiesInteractor$resolveAndStoreIdentityRemotely$12.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                ResolveIdentityUseCase resolveIdentityUseCase = this.resolveIdentityUseCase;
                identitiesInteractor$resolveAndStoreIdentityRemotely$12.L$0 = this;
                identitiesInteractor$resolveAndStoreIdentityRemotely$12.L$1 = str;
                identitiesInteractor$resolveAndStoreIdentityRemotely$12.label = 1;
                objM7300invokegIAlus = resolveIdentityUseCase.m7300invokegIAlus(str, identitiesInteractor$resolveAndStoreIdentityRemotely$12);
                if (objM7300invokegIAlus == objCopydefault) {
                    return objCopydefault;
                }
                identitiesInteractor = this;
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = (String) identitiesInteractor$resolveAndStoreIdentityRemotely$12.L$0;
                    C56391yDq.AEQbTJ(obj);
                    return Result.m7377constructorimpl(AccountId.m7210boximpl(str2));
                }
                str = (String) identitiesInteractor$resolveAndStoreIdentityRemotely$12.L$1;
                identitiesInteractor = (IdentitiesInteractor) identitiesInteractor$resolveAndStoreIdentityRemotely$12.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7300invokegIAlus = ((Result) obj).m7386unboximpl();
            }
            if (!Result.m7384isSuccessimpl(objM7300invokegIAlus)) {
                return Result.m7377constructorimpl(objM7300invokegIAlus);
            }
            Result.Application application = Result.Companion;
            KeyServerResponse.ResolveIdentity resolveIdentity = (KeyServerResponse.ResolveIdentity) objM7300invokegIAlus;
            if (!new CacaoVerifier(identitiesInteractor.projectId).verify(resolveIdentity.getCacao())) {
                throw new InvalidIdentityCacao();
            }
            String strM7211constructorimpl = AccountId.m7211constructorimpl(JwtUtilsKt.decodeDidPkh(resolveIdentity.getCacao().getPayload().getIss()));
            IdentitiesStorageRepository identitiesStorageRepository = identitiesInteractor.identitiesRepository;
            Cacao.Payload payload = resolveIdentity.getCacao().getPayload();
            identitiesInteractor$resolveAndStoreIdentityRemotely$12.L$0 = strM7211constructorimpl;
            identitiesInteractor$resolveAndStoreIdentityRemotely$12.L$1 = null;
            identitiesInteractor$resolveAndStoreIdentityRemotely$12.label = 2;
            if (identitiesStorageRepository.m7267insertIdentityRiN_R_Q(str, strM7211constructorimpl, payload, false, identitiesInteractor$resolveAndStoreIdentityRemotely$12) == objCopydefault) {
                return objCopydefault;
            }
            str2 = strM7211constructorimpl;
            return Result.m7377constructorimpl(AccountId.m7210boximpl(str2));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    /* JADX INFO: renamed from: getIdentityPublicKey-wy9PYZM, reason: not valid java name */
    public final String m7285getIdentityPublicKeywy9PYZM(String str) {
        return this.keyManagementRepository.mo7185getPublicKeyp9DwDrs(ContextKt.m7268getIdentityTagPaLCHi0(str));
    }

    /* JADX INFO: renamed from: storeIdentityPublicKey-jnUdMTY, reason: not valid java name */
    public final void m7295storeIdentityPublicKeyjnUdMTY(String str, String str2) {
        this.keyManagementRepository.setKey(PublicKey.m7316boximpl(str), ContextKt.m7268getIdentityTagPaLCHi0(str2));
    }

    /* JADX INFO: renamed from: removeIdentityKeyPair-jnUdMTY, reason: not valid java name */
    public final void m7290removeIdentityKeyPairjnUdMTY(String str, String str2) {
        Object objM7377constructorimpl;
        Object objM7377constructorimpl2;
        try {
            Result.Application application = Result.Companion;
            this.keyManagementRepository.removeKeys(ContextKt.m7268getIdentityTagPaLCHi0(str2));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            this.logger.error(thM7380exceptionOrNullimpl);
        }
        try {
            Result.Application application3 = Result.Companion;
            this.keyManagementRepository.removeKeys(str);
            objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Application application4 = Result.Companion;
            objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
        if (thM7380exceptionOrNullimpl2 != null) {
            this.logger.error(thM7380exceptionOrNullimpl2);
        }
    }

    /* JADX INFO: renamed from: generateAndStoreIdentityKeyPair-uN_RPug, reason: not valid java name */
    public final String m7279generateAndStoreIdentityKeyPairuN_RPug() {
        return this.keyManagementRepository.mo7179generateAndStoreEd25519KeyPairuN_RPug();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: registerIdentityKeyInKeyserver-uJKfU3c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7289registerIdentityKeyInKeyserveruJKfU3c(String str, String str2, String str3, String str4, List<String> list, Function1<? super String, Cacao.Signature> function1, Continuation<? super Result<Unit>> continuation) throws Throwable {
        IdentitiesInteractor$registerIdentityKeyInKeyserver$1 identitiesInteractor$registerIdentityKeyInKeyserver$1;
        Object objM7386unboximpl;
        IdentitiesInteractor identitiesInteractor;
        String str5;
        Cacao cacao;
        if (continuation instanceof IdentitiesInteractor$registerIdentityKeyInKeyserver$1) {
            identitiesInteractor$registerIdentityKeyInKeyserver$1 = (IdentitiesInteractor$registerIdentityKeyInKeyserver$1) continuation;
            int i = identitiesInteractor$registerIdentityKeyInKeyserver$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identitiesInteractor$registerIdentityKeyInKeyserver$1.label = i - Integer.MIN_VALUE;
            } else {
                identitiesInteractor$registerIdentityKeyInKeyserver$1 = new IdentitiesInteractor$registerIdentityKeyInKeyserver$1(this, continuation);
            }
        }
        Object obj = identitiesInteractor$registerIdentityKeyInKeyserver$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = identitiesInteractor$registerIdentityKeyInKeyserver$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Object objM7278generateAndSignCacaoMDnJniU = m7278generateAndSignCacaoMDnJniU(str, str2, str3, str4, list, function1);
            C56391yDq.AEQbTJ(objM7278generateAndSignCacaoMDnJniU);
            Cacao cacao2 = (Cacao) objM7278generateAndSignCacaoMDnJniU;
            RegisterIdentityUseCase registerIdentityUseCase = this.registerIdentityUseCase;
            identitiesInteractor$registerIdentityKeyInKeyserver$1.L$0 = this;
            identitiesInteractor$registerIdentityKeyInKeyserver$1.L$1 = str;
            identitiesInteractor$registerIdentityKeyInKeyserver$1.L$2 = str2;
            identitiesInteractor$registerIdentityKeyInKeyserver$1.L$3 = cacao2;
            identitiesInteractor$registerIdentityKeyInKeyserver$1.label = 1;
            Object objM7298invokegIAlus = registerIdentityUseCase.m7298invokegIAlus(cacao2, identitiesInteractor$registerIdentityKeyInKeyserver$1);
            if (objM7298invokegIAlus == objCopydefault) {
                return objCopydefault;
            }
            objM7386unboximpl = objM7298invokegIAlus;
            identitiesInteractor = this;
            str5 = str;
            cacao = cacao2;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = identitiesInteractor$registerIdentityKeyInKeyserver$1.L$0;
                C56391yDq.AEQbTJ(obj);
                return obj2;
            }
            cacao = (Cacao) identitiesInteractor$registerIdentityKeyInKeyserver$1.L$3;
            str2 = (String) identitiesInteractor$registerIdentityKeyInKeyserver$1.L$2;
            str5 = (String) identitiesInteractor$registerIdentityKeyInKeyserver$1.L$1;
            identitiesInteractor = (IdentitiesInteractor) identitiesInteractor$registerIdentityKeyInKeyserver$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            IdentitiesStorageRepository identitiesStorageRepository = identitiesInteractor.identitiesRepository;
            Cacao.Payload payload = cacao.getPayload();
            identitiesInteractor$registerIdentityKeyInKeyserver$1.L$0 = objM7386unboximpl;
            identitiesInteractor$registerIdentityKeyInKeyserver$1.L$1 = null;
            identitiesInteractor$registerIdentityKeyInKeyserver$1.L$2 = null;
            identitiesInteractor$registerIdentityKeyInKeyserver$1.L$3 = null;
            identitiesInteractor$registerIdentityKeyInKeyserver$1.label = 2;
            if (identitiesStorageRepository.m7267insertIdentityRiN_R_Q(str2, str5, payload, true, identitiesInteractor$registerIdentityKeyInKeyserver$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        return objM7386unboximpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: unregisterIdentityKeyInKeyserver-slDN04U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7297unregisterIdentityKeyInKeyserverslDN04U(String str, String str2, Pair<PublicKey, PrivateKey> pair, Continuation<? super Result<Unit>> continuation) throws Throwable {
        IdentitiesInteractor$unregisterIdentityKeyInKeyserver$1 identitiesInteractor$unregisterIdentityKeyInKeyserver$1;
        Object objM7302invokegIAlus;
        IdentitiesInteractor identitiesInteractor;
        if (continuation instanceof IdentitiesInteractor$unregisterIdentityKeyInKeyserver$1) {
            identitiesInteractor$unregisterIdentityKeyInKeyserver$1 = (IdentitiesInteractor$unregisterIdentityKeyInKeyserver$1) continuation;
            int i = identitiesInteractor$unregisterIdentityKeyInKeyserver$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                identitiesInteractor$unregisterIdentityKeyInKeyserver$1.label = i - Integer.MIN_VALUE;
            } else {
                identitiesInteractor$unregisterIdentityKeyInKeyserver$1 = new IdentitiesInteractor$unregisterIdentityKeyInKeyserver$1(this, continuation);
            }
        }
        Object obj = identitiesInteractor$unregisterIdentityKeyInKeyserver$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = identitiesInteractor$unregisterIdentityKeyInKeyserver$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            UnregisterIdentityUseCase unregisterIdentityUseCase = this.unregisterIdentityUseCase;
            Object objM7282generateUnregisterIdAuthKifgIg = m7282generateUnregisterIdAuthKifgIg(str, str2, pair);
            C56391yDq.AEQbTJ(objM7282generateUnregisterIdAuthKifgIg);
            String strM7224unboximpl = ((DidJwt) objM7282generateUnregisterIdAuthKifgIg).m7224unboximpl();
            identitiesInteractor$unregisterIdentityKeyInKeyserver$1.L$0 = this;
            identitiesInteractor$unregisterIdentityKeyInKeyserver$1.L$1 = pair;
            identitiesInteractor$unregisterIdentityKeyInKeyserver$1.label = 1;
            objM7302invokegIAlus = unregisterIdentityUseCase.m7302invokegIAlus(strM7224unboximpl, identitiesInteractor$unregisterIdentityKeyInKeyserver$1);
            if (objM7302invokegIAlus == objCopydefault) {
                return objCopydefault;
            }
            identitiesInteractor = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj2 = identitiesInteractor$unregisterIdentityKeyInKeyserver$1.L$0;
                C56391yDq.AEQbTJ(obj);
                return obj2;
            }
            pair = (Pair) identitiesInteractor$unregisterIdentityKeyInKeyserver$1.L$1;
            IdentitiesInteractor identitiesInteractor2 = (IdentitiesInteractor) identitiesInteractor$unregisterIdentityKeyInKeyserver$1.L$0;
            C56391yDq.AEQbTJ(obj);
            identitiesInteractor = identitiesInteractor2;
            objM7302invokegIAlus = ((Result) obj).m7386unboximpl();
        }
        if (!Result.m7384isSuccessimpl(objM7302invokegIAlus)) {
            return objM7302invokegIAlus;
        }
        IdentitiesStorageRepository identitiesStorageRepository = identitiesInteractor.identitiesRepository;
        String strM7323unboximpl = pair.getFirst().m7323unboximpl();
        identitiesInteractor$unregisterIdentityKeyInKeyserver$1.L$0 = objM7302invokegIAlus;
        identitiesInteractor$unregisterIdentityKeyInKeyserver$1.L$1 = null;
        identitiesInteractor$unregisterIdentityKeyInKeyserver$1.label = 2;
        return identitiesStorageRepository.removeIdentity(strM7323unboximpl, identitiesInteractor$unregisterIdentityKeyInKeyserver$1) == objCopydefault ? objCopydefault : objM7302invokegIAlus;
    }

    /* JADX INFO: renamed from: generateAndSignCacao-MDnJniU, reason: not valid java name */
    public final Object m7278generateAndSignCacaoMDnJniU(String str, String str2, String str3, String str4, List<String> list, Function1<? super String, Cacao.Signature> function1) throws Throwable {
        Object objM7281generatePayload2YvqGik = m7281generatePayload2YvqGik(str, str2, str3, str4, list);
        C56391yDq.AEQbTJ(objM7281generatePayload2YvqGik);
        Cacao.Payload payload = (Cacao.Payload) objM7281generatePayload2YvqGik;
        Cacao.Signature signatureInvoke = function1.invoke(CacaoKt.toCAIP222Message$default(payload, null, 1, null));
        if (signatureInvoke == null) {
            throw new UserRejectedSigning();
        }
        Result.Application application = Result.Companion;
        return Result.m7377constructorimpl(new Cacao(CacaoType.EIP4361.toHeader(), payload, signatureInvoke));
    }

    /* JADX INFO: renamed from: generateUnregisterIdAuth-K-ifgIg, reason: not valid java name */
    public final Object m7282generateUnregisterIdAuthKifgIg(String str, String str2, Pair<PublicKey, PrivateKey> pair) {
        return DidJwtRepository.m7199encodeDidJwt57yAOYI(pair.component2().m7315unboximpl(), new EncodeIdentityKeyDidJwtPayloadUseCase(str, null), new EncodeDidJwtPayloadUseCase.Params(pair.component1().m7323unboximpl(), str2, 0L, null, 12, null));
    }

    /* JADX INFO: renamed from: generatePayload-2YvqGik, reason: not valid java name */
    public final Object m7281generatePayload2YvqGik(@NotNull String str, @NotNull String str2, String str3, @NotNull String str4, List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Result.Application application = Result.Companion;
        String strEncodeDidPkh = JwtUtilsKt.encodeDidPkh(str);
        String strBuildUri = buildUri(str4, JwtUtilsKt.encodeEd25519DidKey(PublicKey.m7320getKeyAsBytesimpl(str2)));
        String strBytesToHex = UtilFunctionsKt.bytesToHex(UtilFunctionsKt.randomBytes(32));
        String str5 = new SimpleDateFormat(Cacao.Payload.ISO_8601_PATTERN, Locale.getDefault()).format(Calendar.getInstance().getTime());
        Intrinsics.checkNotNullExpressionValue(str5, "");
        return Result.m7377constructorimpl(new Cacao.Payload(strEncodeDidPkh, str4, strBuildUri, "1", strBytesToHex, str5, null, null, CacaoKt.getStatement(new Pair(str3, list)), null, list));
    }

    public final String buildUri(String str, String str2) {
        return "bundleid://" + str + "?walletconnect_identity_key=" + str2;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.keyserver.domain.IdentitiesInteractor.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }
}
