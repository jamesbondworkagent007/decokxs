package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.common.primitives.UnsignedBytes;
import com.okinc.auth.impl.guard.domain.ActivateGuardUseCase;
import com.okinc.auth.impl.guard.domain.VerifyGuardUseCase$authBiometric$1;
import com.okinc.auth.impl.guard.domain.VerifyGuardUseCase$getData$1;
import com.okinc.auth.impl.passkey.model.AuthenticationStartResponse;
import com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import o.InterfaceC5693aBL;
import o.InterfaceC5696aBO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aBN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5695aBN extends AbstractC5726aBs<Application, ActionBar> {
    public final C5691aBJ AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC5697aBP KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public C5695aBN(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC5697aBP interfaceC5697aBP, @NotNull C5691aBJ c5691aBJ) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC5697aBP, "");
        Intrinsics.checkNotNullParameter(c5691aBJ, "");
        this.EZpvd = coroutineDispatcher;
        this.KWHzl = interfaceC5697aBP;
        this.AEQbTJ = c5691aBJ;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC5726aBs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Application application, @NotNull Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        VerifyGuardUseCase$getData$1 verifyGuardUseCase$getData$1;
        java.util.List<AuthenticationStartResponse.CredentialDescriptor> listAhwBna;
        C5700aBS c5700aBS;
        java.lang.String str;
        C5695aBN c5695aBN;
        java.lang.String str2;
        androidx.fragment.app.Fragment fragment;
        ActionBar actionBar;
        if (continuation instanceof VerifyGuardUseCase$getData$1) {
            verifyGuardUseCase$getData$1 = (VerifyGuardUseCase$getData$1) continuation;
            int i = verifyGuardUseCase$getData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                verifyGuardUseCase$getData$1.label = i - Integer.MIN_VALUE;
            } else {
                verifyGuardUseCase$getData$1 = new VerifyGuardUseCase$getData$1(this, continuation);
            }
        }
        VerifyGuardUseCase$getData$1 verifyGuardUseCase$getData$12 = verifyGuardUseCase$getData$1;
        java.lang.Object objKWHzl = verifyGuardUseCase$getData$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = verifyGuardUseCase$getData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            C5689aBH.KWHzl.AEQbTJ("[VERIFY]", "start verify");
            AuthenticationStartResponse authenticationStartResponseAEQbTJ = application.AEQbTJ();
            AuthenticationStartResponse.PublicKey publicKey = authenticationStartResponseAEQbTJ.getPublicKey();
            java.lang.String challenge = publicKey != null ? publicKey.getChallenge() : null;
            if (challenge == null) {
                challenge = "";
            }
            AuthenticationStartResponse.PublicKey publicKey2 = authenticationStartResponseAEQbTJ.getPublicKey();
            java.lang.String rpId = publicKey2 != null ? publicKey2.getRpId() : null;
            java.lang.String str3 = rpId != null ? rpId : "";
            AuthenticationStartResponse.PublicKey publicKey3 = authenticationStartResponseAEQbTJ.getPublicKey();
            if (publicKey3 == null || (listAhwBna = publicKey3.getAllowCredentials()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
            java.util.Iterator<T> it = listAhwBna.iterator();
            while (it.hasNext()) {
                arrayList.add(((AuthenticationStartResponse.CredentialDescriptor) it.next()).getId());
            }
            java.util.List listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(CollectionsKt___CollectionsKt.QfsBiF(arrayList));
            C5689aBH.KWHzl.AEQbTJ("[VERIFY]", "allowCredentialIdList ex: " + listAxsJAYsNCnLh);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it2 = listAxsJAYsNCnLh.iterator();
            while (it2.hasNext()) {
                C5700aBS c5700aBSEZpvd = C5692aBK.KWHzl.EZpvd((java.lang.String) it2.next());
                if (c5700aBSEZpvd == null) {
                    c5700aBSEZpvd = null;
                }
                if (c5700aBSEZpvd != null) {
                    arrayList2.add(c5700aBSEZpvd);
                }
            }
            C5700aBS c5700aBS2 = (C5700aBS) CollectionsKt___CollectionsKt.firstOrNull(arrayList2);
            if (c5700aBS2 == null) {
                C5689aBH.KWHzl.AEQbTJ("[VERIFY]", "user key pair not exist");
                return ActionBar.StateListAnimator.KWHzl;
            }
            androidx.fragment.app.Fragment fragmentKWHzl = application.KWHzl();
            C5691aBJ c5691aBJ = this.AEQbTJ;
            android.content.Context context = application.KWHzl().getContext();
            verifyGuardUseCase$getData$12.L$0 = this;
            verifyGuardUseCase$getData$12.L$1 = fragmentKWHzl;
            verifyGuardUseCase$getData$12.L$2 = c5700aBS2;
            verifyGuardUseCase$getData$12.L$3 = challenge;
            verifyGuardUseCase$getData$12.L$4 = str3;
            verifyGuardUseCase$getData$12.label = 1;
            java.lang.Object objCopydefault2 = c5691aBJ.copydefault(context, verifyGuardUseCase$getData$12);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            c5700aBS = c5700aBS2;
            objKWHzl = objCopydefault2;
            str = challenge;
            c5695aBN = this;
            str2 = str3;
            fragment = fragmentKWHzl;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objKWHzl);
                actionBar = (ActionBar) objKWHzl;
                if (actionBar instanceof ActionBar.C0808ActionBar) {
                    C5689aBH.KWHzl.AEQbTJ("[VERIFY]", "verify success");
                }
                return actionBar;
            }
            java.lang.String str4 = (java.lang.String) verifyGuardUseCase$getData$12.L$4;
            java.lang.String str5 = (java.lang.String) verifyGuardUseCase$getData$12.L$3;
            c5700aBS = (C5700aBS) verifyGuardUseCase$getData$12.L$2;
            fragment = (androidx.fragment.app.Fragment) verifyGuardUseCase$getData$12.L$1;
            C5695aBN c5695aBN2 = (C5695aBN) verifyGuardUseCase$getData$12.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            str2 = str4;
            str = str5;
            c5695aBN = c5695aBN2;
        }
        verifyGuardUseCase$getData$12.L$0 = null;
        verifyGuardUseCase$getData$12.L$1 = null;
        verifyGuardUseCase$getData$12.L$2 = null;
        verifyGuardUseCase$getData$12.L$3 = null;
        verifyGuardUseCase$getData$12.L$4 = null;
        verifyGuardUseCase$getData$12.label = 2;
        objKWHzl = c5695aBN.KWHzl(fragment, c5700aBS, str, str2, (java.lang.String) objKWHzl, verifyGuardUseCase$getData$12);
        if (objKWHzl == objCopydefault) {
            return objCopydefault;
        }
        actionBar = (ActionBar) objKWHzl;
        if (actionBar instanceof ActionBar.C0808ActionBar) {
        }
        return actionBar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(androidx.fragment.app.Fragment fragment, C5700aBS c5700aBS, java.lang.String str, java.lang.String str2, java.lang.String str3, Continuation<? super ActionBar> continuation) throws java.lang.Throwable {
        VerifyGuardUseCase$authBiometric$1 verifyGuardUseCase$authBiometric$1;
        C5695aBN c5695aBN;
        if (continuation instanceof VerifyGuardUseCase$authBiometric$1) {
            verifyGuardUseCase$authBiometric$1 = (VerifyGuardUseCase$authBiometric$1) continuation;
            int i = verifyGuardUseCase$authBiometric$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                verifyGuardUseCase$authBiometric$1.label = i - Integer.MIN_VALUE;
            } else {
                verifyGuardUseCase$authBiometric$1 = new VerifyGuardUseCase$authBiometric$1(this, continuation);
            }
        }
        VerifyGuardUseCase$authBiometric$1 verifyGuardUseCase$authBiometric$12 = verifyGuardUseCase$authBiometric$1;
        java.lang.Object objOLrzqt = verifyGuardUseCase$authBiometric$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = verifyGuardUseCase$authBiometric$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C5689aBH.KWHzl.AEQbTJ("[VERIFY]", "start auth biometric");
            InterfaceC5697aBP interfaceC5697aBP = this.KWHzl;
            verifyGuardUseCase$authBiometric$12.L$0 = this;
            verifyGuardUseCase$authBiometric$12.L$1 = c5700aBS;
            verifyGuardUseCase$authBiometric$12.L$2 = str;
            verifyGuardUseCase$authBiometric$12.L$3 = str2;
            verifyGuardUseCase$authBiometric$12.L$4 = str3;
            verifyGuardUseCase$authBiometric$12.label = 1;
            objOLrzqt = interfaceC5697aBP.OLrzqt(fragment, c5700aBS, verifyGuardUseCase$authBiometric$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            c5695aBN = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(objOLrzqt);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (java.lang.String) verifyGuardUseCase$authBiometric$12.L$4;
            str2 = (java.lang.String) verifyGuardUseCase$authBiometric$12.L$3;
            str = (java.lang.String) verifyGuardUseCase$authBiometric$12.L$2;
            c5700aBS = (C5700aBS) verifyGuardUseCase$authBiometric$12.L$1;
            C5695aBN c5695aBN2 = (C5695aBN) verifyGuardUseCase$authBiometric$12.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            c5695aBN = c5695aBN2;
        }
        C5700aBS c5700aBS2 = c5700aBS;
        java.lang.String str4 = str;
        java.lang.String str5 = str3;
        InterfaceC5693aBL interfaceC5693aBL = (InterfaceC5693aBL) objOLrzqt;
        if (interfaceC5693aBL instanceof InterfaceC5693aBL.TaskDescription) {
            C5689aBH.KWHzl.AEQbTJ("[VERIFY]", "auth biometric success");
            java.security.Signature signatureKWHzl = ((InterfaceC5693aBL.TaskDescription) interfaceC5693aBL).KWHzl();
            verifyGuardUseCase$authBiometric$12.L$0 = null;
            verifyGuardUseCase$authBiometric$12.L$1 = null;
            verifyGuardUseCase$authBiometric$12.L$2 = null;
            verifyGuardUseCase$authBiometric$12.L$3 = null;
            verifyGuardUseCase$authBiometric$12.L$4 = null;
            verifyGuardUseCase$authBiometric$12.label = 2;
            objOLrzqt = c5695aBN.KWHzl(signatureKWHzl, str4, str2, c5700aBS2, str5, verifyGuardUseCase$authBiometric$12);
            return objOLrzqt == objCopydefault ? objCopydefault : objOLrzqt;
        }
        if (!(interfaceC5693aBL instanceof InterfaceC5693aBL.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        C5689aBH.KWHzl.AEQbTJ("[VERIFY]", "auth biometric error, error=" + interfaceC5693aBL);
        return new ActionBar.Application((InterfaceC5693aBL.StateListAnimator) interfaceC5693aBL);
    }

    public final java.lang.Object KWHzl(java.security.Signature signature, java.lang.String str, java.lang.String str2, C5700aBS c5700aBS, java.lang.String str3, Continuation<? super ActionBar> continuation) {
        C5689aBH c5689aBH = C5689aBH.KWHzl;
        c5689aBH.AEQbTJ("[VERIFY]", "start signing");
        ActivateGuardUseCase.ClientData clientData = new ActivateGuardUseCase.ClientData("webauthn.get", str, str3, "com.okinc.okex.gp");
        Json.Default r3 = Json.Default;
        r3.getSerializersModule();
        byte[] bytes = r3.encodeToString(ActivateGuardUseCase.ClientData.Companion.serializer(), clientData).getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bytes);
        c5689aBH.AEQbTJ("[VERIFY]", "clientDataJsonByteArray: " + C6617aSi.AEQbTJ(bytes));
        byte[] bArrCreateAuthData$default = createAuthData$default(this, str2, 0, true, true, null, 16, null);
        c5689aBH.AEQbTJ("[VERIFY]", "authDataByteArray: " + C6617aSi.AEQbTJ(bArrCreateAuthData$default));
        Intrinsics.copydefault(bArrDigest);
        byte[] bArrCopydefault = yDT.copydefault(bArrCreateAuthData$default, bArrDigest);
        c5689aBH.AEQbTJ("[VERIFY]", "dataToSign: " + C6617aSi.AEQbTJ(bArrCopydefault));
        InterfaceC5696aBO interfaceC5696aBOOLrzqt = C5692aBK.KWHzl.OLrzqt(signature, bArrCopydefault);
        if (interfaceC5696aBOOLrzqt instanceof InterfaceC5696aBO.Activity) {
            c5689aBH.AEQbTJ("[VERIFY]", "sign success");
            try {
                java.lang.String strAEQbTJ = c5700aBS.AEQbTJ();
                java.lang.String string = PublicKeyCredentialType.PUBLIC_KEY.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody = new UnlockTokenWithFidoRequestBody(string, strAEQbTJ, (java.lang.String) null, MTPushConstants.PlatformNode.KEY_PLATFORM, new UnlockTokenWithFidoRequestBody.ResponseData(C6617aSi.AEQbTJ(bytes), C6617aSi.AEQbTJ(bArrCreateAuthData$default), C6617aSi.AEQbTJ(((InterfaceC5696aBO.Activity) interfaceC5696aBOOLrzqt).KWHzl()), c5700aBS.OLrzqt()), new UnlockTokenWithFidoRequestBody.ClientExtensionResultsData((UnlockTokenWithFidoRequestBody.CredPropsData) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0)), 4, (DefaultConstructorMarker) null);
                c5689aBH.AEQbTJ("[VERIFY]", "UnlockTokenWithFidoRequestBody body: " + unlockTokenWithFidoRequestBody);
                return new ActionBar.C0808ActionBar(unlockTokenWithFidoRequestBody);
            } catch (java.lang.Exception e) {
                C5689aBH.KWHzl.AEQbTJ("[VERIFY]", "UnlockTokenWithFidoRequestBody ex: " + e.getMessage());
                return new ActionBar.Activity(e.getMessage());
            }
        }
        if (!(interfaceC5696aBOOLrzqt instanceof InterfaceC5696aBO.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC5696aBO.StateListAnimator stateListAnimator = (InterfaceC5696aBO.StateListAnimator) interfaceC5696aBOOLrzqt;
        c5689aBH.AEQbTJ("[VERIFY]", "sign error, error=" + stateListAnimator.AEQbTJ());
        return new ActionBar.Activity(stateListAnimator.AEQbTJ());
    }

    /* JADX INFO: renamed from: o.aBN$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application {
        public final androidx.fragment.app.Fragment KWHzl;
        public final AuthenticationStartResponse copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, androidx.fragment.app.Fragment fragment, AuthenticationStartResponse authenticationStartResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fragment = application.KWHzl;
            }
            if ((i & 2) != 0) {
                authenticationStartResponse = application.copydefault;
            }
            return application.KWHzl(fragment, authenticationStartResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthenticationStartResponse AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final androidx.fragment.app.Fragment KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application KWHzl(@NotNull androidx.fragment.app.Fragment fragment, @NotNull AuthenticationStartResponse authenticationStartResponse) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(authenticationStartResponse, "");
            return new Application(fragment, authenticationStartResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.KWHzl, application.KWHzl) && Intrinsics.EZpvd(this.copydefault, application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Input(fragment=" + this.KWHzl + ", authStartResponse=" + this.copydefault + ")";
        }

        public Application(@NotNull androidx.fragment.app.Fragment fragment, @NotNull AuthenticationStartResponse authenticationStartResponse) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(authenticationStartResponse, "");
            this.KWHzl = fragment;
            this.copydefault = authenticationStartResponse;
        }
    }

    /* JADX INFO: renamed from: o.aBN$ActionBar */
    /* JADX INFO: loaded from: classes14.dex */
    public interface ActionBar {

        /* JADX INFO: renamed from: o.aBN$ActionBar$ActionBar, reason: collision with other inner class name */
        public static final class C0808ActionBar implements ActionBar {
            public final UnlockTokenWithFidoRequestBody OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0808ActionBar copy$default(C0808ActionBar c0808ActionBar, UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    unlockTokenWithFidoRequestBody = c0808ActionBar.OLrzqt;
                }
                return c0808ActionBar.AEQbTJ(unlockTokenWithFidoRequestBody);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0808ActionBar AEQbTJ(@NotNull UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody) {
                Intrinsics.checkNotNullParameter(unlockTokenWithFidoRequestBody, "");
                return new C0808ActionBar(unlockTokenWithFidoRequestBody);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UnlockTokenWithFidoRequestBody OLrzqt() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0808ActionBar) && Intrinsics.EZpvd(this.OLrzqt, ((C0808ActionBar) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Success";
            }

            public C0808ActionBar(@NotNull UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody) {
                Intrinsics.checkNotNullParameter(unlockTokenWithFidoRequestBody, "");
                this.OLrzqt = unlockTokenWithFidoRequestBody;
            }
        }

        /* JADX INFO: renamed from: o.aBN$ActionBar$StateListAnimator */
        public static final class StateListAnimator implements ActionBar {
            public static final StateListAnimator KWHzl = new StateListAnimator();

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "UserKeyPairNotExist";
            }

            private StateListAnimator() {
            }
        }

        /* JADX INFO: renamed from: o.aBN$ActionBar$Application */
        public static final class Application implements ActionBar {
            public final InterfaceC5693aBL.StateListAnimator copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, InterfaceC5693aBL.StateListAnimator stateListAnimator, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    stateListAnimator = application.copydefault;
                }
                return application.AEQbTJ(stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application AEQbTJ(@NotNull InterfaceC5693aBL.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                return new Application(stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InterfaceC5693aBL.StateListAnimator EZpvd() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.copydefault, ((Application) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            public Application(@NotNull InterfaceC5693aBL.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                this.copydefault = stateListAnimator;
            }

            public java.lang.String toString() {
                return "AuthBiometricError(error=" + this.copydefault + ")";
            }
        }

        /* JADX INFO: renamed from: o.aBN$ActionBar$Activity */
        public static final class Activity implements ActionBar {
            public final java.lang.String copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = activity.copydefault;
                }
                return activity.KWHzl(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity KWHzl(java.lang.String str) {
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.String copydefault() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) ((Activity) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                java.lang.String str = this.copydefault;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public Activity(java.lang.String str) {
                this.copydefault = str;
            }

            public java.lang.String toString() {
                return "SignError(message=" + this.copydefault + ")";
            }
        }
    }

    public static /* synthetic */ byte[] createAuthData$default(C5695aBN c5695aBN, java.lang.String str, int i, boolean z, boolean z2, byte[] bArr, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        int i3 = i;
        boolean z3 = (i2 & 4) != 0 ? true : z;
        boolean z4 = (i2 & 8) != 0 ? true : z2;
        if ((i2 & 16) != 0) {
            bArr = null;
        }
        return c5695aBN.EZpvd(str, i3, z3, z4, bArr);
    }

    public final byte[] EZpvd(@NotNull java.lang.String str, int i, boolean z, boolean z2, byte[] bArr) throws java.security.NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        byte b = z ? (byte) 1 : (byte) 0;
        if (z2) {
            b = (byte) (b | 4);
        }
        if (bArr != null) {
            b = (byte) (b | UnsignedBytes.MAX_POWER_OF_TWO);
        }
        byte[] bArrArray = java.nio.ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(i).array();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Intrinsics.copydefault(bArrDigest);
        arrayList.addAll(yDT.valueOf(bArrDigest));
        arrayList.add(java.lang.Byte.valueOf(b));
        Intrinsics.copydefault(bArrArray);
        arrayList.addAll(yDT.valueOf(bArrArray));
        if (bArr != null) {
            arrayList.addAll(yDT.valueOf(bArr));
        }
        return CollectionsKt___CollectionsKt.DbNXlk(arrayList);
    }
}
