package com.okinc.auth.impl.guard.domain;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.common.primitives.SignedBytes;
import com.okinc.auth.impl.passkey.model.RegistrationFinishBody;
import com.okinc.auth.impl.passkey.model.RegistrationStartResponse;
import com.okinc.auth.impl.util.SimpleCBOREncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import o.AbstractC5726aBs;
import o.C34703nhO;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56424yEw;
import o.C56442yFn;
import o.C5689aBH;
import o.C5691aBJ;
import o.C5692aBK;
import o.C5700aBS;
import o.C6617aSi;
import o.InterfaceC5693aBL;
import o.InterfaceC5696aBO;
import o.InterfaceC5697aBP;
import o.InterfaceC5699aBR;
import o.yCM;
import o.yDT;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivateGuardUseCase extends AbstractC5726aBs<StateListAnimator, TaskDescription> {
    public final C5691aBJ AEQbTJ;
    public final CoroutineDispatcher EZpvd;
    public final InterfaceC5697aBP copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yCM
    public ActivateGuardUseCase(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull InterfaceC5697aBP interfaceC5697aBP, @NotNull C5691aBJ c5691aBJ) {
        super(coroutineDispatcher);
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(interfaceC5697aBP, "");
        Intrinsics.checkNotNullParameter(c5691aBJ, "");
        this.EZpvd = coroutineDispatcher;
        this.copydefault = interfaceC5697aBP;
        this.AEQbTJ = c5691aBJ;
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.AbstractC5726aBs
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object EZpvd(@NotNull StateListAnimator stateListAnimator, @NotNull Continuation<? super TaskDescription> continuation) throws Throwable {
        ActivateGuardUseCase$getData$1 activateGuardUseCase$getData$1;
        List<String> listAhwBna;
        InterfaceC5699aBR interfaceC5699aBRCopydefault;
        Object c0238TaskDescription;
        List<RegistrationStartResponse.PublicKey.CredentialDescriptor> excludeCredentials;
        RegistrationStartResponse.PublicKey.User user;
        RegistrationStartResponse.PublicKey.Rp rp;
        if (continuation instanceof ActivateGuardUseCase$getData$1) {
            activateGuardUseCase$getData$1 = (ActivateGuardUseCase$getData$1) continuation;
            int i = activateGuardUseCase$getData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                activateGuardUseCase$getData$1.label = i - Integer.MIN_VALUE;
            } else {
                activateGuardUseCase$getData$1 = new ActivateGuardUseCase$getData$1(this, continuation);
            }
        }
        ActivateGuardUseCase$getData$1 activateGuardUseCase$getData$12 = activateGuardUseCase$getData$1;
        Object objEZpvd = activateGuardUseCase$getData$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = activateGuardUseCase$getData$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            C5689aBH.KWHzl.AEQbTJ("[ACTIVATE]", "start passkey registration, response: " + stateListAnimator.OLrzqt() + " ");
            RegistrationStartResponse registrationStartResponseOLrzqt = stateListAnimator.OLrzqt();
            RegistrationStartResponse.PublicKey publicKey = registrationStartResponseOLrzqt.getPublicKey();
            String challenge = publicKey != null ? publicKey.getChallenge() : null;
            String str = challenge == null ? "" : challenge;
            RegistrationStartResponse.PublicKey publicKey2 = registrationStartResponseOLrzqt.getPublicKey();
            String id = (publicKey2 == null || (rp = publicKey2.getRp()) == null) ? null : rp.getId();
            String str2 = id == null ? "" : id;
            RegistrationStartResponse.PublicKey publicKey3 = registrationStartResponseOLrzqt.getPublicKey();
            String id2 = (publicKey3 == null || (user = publicKey3.getUser()) == null) ? null : user.getId();
            String str3 = id2 == null ? "" : id2;
            RegistrationStartResponse.PublicKey publicKey4 = registrationStartResponseOLrzqt.getPublicKey();
            if (publicKey4 == null || (excludeCredentials = publicKey4.getExcludeCredentials()) == null) {
                listAhwBna = yDY.AhwBna();
                interfaceC5699aBRCopydefault = C5692aBK.KWHzl.copydefault(listAhwBna, generateCredentialId$default(this, 0, 1, null), str3, str2, stateListAnimator.KWHzl());
                if (!(interfaceC5699aBRCopydefault instanceof InterfaceC5699aBR.Application)) {
                    C5689aBH.KWHzl.AEQbTJ("[ACTIVATE]", "create key pair success");
                    C5700aBS c5700aBSKWHzl = ((InterfaceC5699aBR.Application) interfaceC5699aBRCopydefault).KWHzl();
                    activateGuardUseCase$getData$12.label = 1;
                    objEZpvd = EZpvd(stateListAnimator, c5700aBSKWHzl, str2, str, activateGuardUseCase$getData$12);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                } else if (interfaceC5699aBRCopydefault instanceof InterfaceC5699aBR.TaskDescription) {
                    C5689aBH.KWHzl.AEQbTJ("[ACTIVATE]", "key pair already existed");
                    c0238TaskDescription = TaskDescription.ActionBar.KWHzl;
                } else if (Intrinsics.EZpvd(interfaceC5699aBRCopydefault, InterfaceC5699aBR.Activity.AEQbTJ)) {
                    C5689aBH.KWHzl.AEQbTJ("[ACTIVATE]", "biometric not enabled");
                    c0238TaskDescription = new TaskDescription.StateListAnimator(InterfaceC5693aBL.StateListAnimator.TaskDescription.EZpvd);
                } else {
                    if (!(interfaceC5699aBRCopydefault instanceof InterfaceC5699aBR.StateListAnimator)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    InterfaceC5699aBR.StateListAnimator stateListAnimator2 = (InterfaceC5699aBR.StateListAnimator) interfaceC5699aBRCopydefault;
                    C5689aBH.KWHzl.AEQbTJ("[ACTIVATE]", "activate error, error: " + stateListAnimator2.copydefault());
                    c0238TaskDescription = new TaskDescription.C0238TaskDescription(stateListAnimator2.copydefault());
                }
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = excludeCredentials.iterator();
                while (it.hasNext()) {
                    String id3 = ((RegistrationStartResponse.PublicKey.CredentialDescriptor) it.next()).getId();
                    if (id3 != null) {
                        arrayList.add(id3);
                    }
                }
                listAhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
                if (listAhwBna == null) {
                }
                interfaceC5699aBRCopydefault = C5692aBK.KWHzl.copydefault(listAhwBna, generateCredentialId$default(this, 0, 1, null), str3, str2, stateListAnimator.KWHzl());
                if (!(interfaceC5699aBRCopydefault instanceof InterfaceC5699aBR.Application)) {
                }
            }
            if (c0238TaskDescription instanceof TaskDescription.Fragment) {
                C5689aBH.KWHzl.AEQbTJ("[ACTIVATE]", "activate success");
            }
            return c0238TaskDescription;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objEZpvd);
        c0238TaskDescription = (TaskDescription) objEZpvd;
        if (c0238TaskDescription instanceof TaskDescription.Fragment) {
        }
        return c0238TaskDescription;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff A[PHI: r14
  0x00ff: PHI (r14v13 java.lang.Object) = (r14v12 java.lang.Object), (r14v1 java.lang.Object) binds: [B:29:0x00fc, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(StateListAnimator stateListAnimator, C5700aBS c5700aBS, String str, String str2, Continuation<? super TaskDescription> continuation) throws Throwable {
        ActivateGuardUseCase$authBiometric$1 activateGuardUseCase$authBiometric$1;
        ActivateGuardUseCase activateGuardUseCase;
        C5700aBS c5700aBS2;
        String str3;
        String str4;
        Signature signature;
        if (continuation instanceof ActivateGuardUseCase$authBiometric$1) {
            activateGuardUseCase$authBiometric$1 = (ActivateGuardUseCase$authBiometric$1) continuation;
            int i = activateGuardUseCase$authBiometric$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                activateGuardUseCase$authBiometric$1.label = i - Integer.MIN_VALUE;
            } else {
                activateGuardUseCase$authBiometric$1 = new ActivateGuardUseCase$authBiometric$1(this, continuation);
            }
        }
        ActivateGuardUseCase$authBiometric$1 activateGuardUseCase$authBiometric$12 = activateGuardUseCase$authBiometric$1;
        Object objOLrzqt = activateGuardUseCase$authBiometric$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = activateGuardUseCase$authBiometric$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            C5689aBH.KWHzl.AEQbTJ("[ACTIVATE]", "start auth biometric");
            InterfaceC5697aBP interfaceC5697aBP = this.copydefault;
            Fragment fragmentCopydefault = stateListAnimator.copydefault();
            activateGuardUseCase$authBiometric$12.L$0 = this;
            activateGuardUseCase$authBiometric$12.L$1 = stateListAnimator;
            activateGuardUseCase$authBiometric$12.L$2 = c5700aBS;
            activateGuardUseCase$authBiometric$12.L$3 = str;
            activateGuardUseCase$authBiometric$12.L$4 = str2;
            activateGuardUseCase$authBiometric$12.label = 1;
            objOLrzqt = interfaceC5697aBP.OLrzqt(fragmentCopydefault, c5700aBS, activateGuardUseCase$authBiometric$12);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            activateGuardUseCase = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C56391yDq.AEQbTJ(objOLrzqt);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str5 = (String) activateGuardUseCase$authBiometric$12.L$5;
                C5700aBS c5700aBS3 = (C5700aBS) activateGuardUseCase$authBiometric$12.L$4;
                Signature signature2 = (Signature) activateGuardUseCase$authBiometric$12.L$3;
                String str6 = (String) activateGuardUseCase$authBiometric$12.L$2;
                String str7 = (String) activateGuardUseCase$authBiometric$12.L$1;
                ActivateGuardUseCase activateGuardUseCase2 = (ActivateGuardUseCase) activateGuardUseCase$authBiometric$12.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                str4 = str5;
                c5700aBS2 = c5700aBS3;
                signature = signature2;
                str = str7;
                activateGuardUseCase = activateGuardUseCase2;
                str3 = str6;
                activateGuardUseCase$authBiometric$12.L$0 = null;
                activateGuardUseCase$authBiometric$12.L$1 = null;
                activateGuardUseCase$authBiometric$12.L$2 = null;
                activateGuardUseCase$authBiometric$12.L$3 = null;
                activateGuardUseCase$authBiometric$12.L$4 = null;
                activateGuardUseCase$authBiometric$12.L$5 = null;
                activateGuardUseCase$authBiometric$12.label = 3;
                objOLrzqt = activateGuardUseCase.KWHzl(str, str3, signature, c5700aBS2, str4, (String) objOLrzqt, activateGuardUseCase$authBiometric$12);
                return objOLrzqt != objCopydefault ? objCopydefault : objOLrzqt;
            }
            str2 = (String) activateGuardUseCase$authBiometric$12.L$4;
            str = (String) activateGuardUseCase$authBiometric$12.L$3;
            c5700aBS = (C5700aBS) activateGuardUseCase$authBiometric$12.L$2;
            stateListAnimator = (StateListAnimator) activateGuardUseCase$authBiometric$12.L$1;
            activateGuardUseCase = (ActivateGuardUseCase) activateGuardUseCase$authBiometric$12.L$0;
            C56391yDq.AEQbTJ(objOLrzqt);
        }
        InterfaceC5693aBL interfaceC5693aBL = (InterfaceC5693aBL) objOLrzqt;
        if (interfaceC5693aBL instanceof InterfaceC5693aBL.TaskDescription) {
            C5689aBH.KWHzl.AEQbTJ("[ACTIVATE]", "auth biometric success");
            Signature signatureKWHzl = ((InterfaceC5693aBL.TaskDescription) interfaceC5693aBL).KWHzl();
            String strKWHzl = C34703nhO.KWHzl(stateListAnimator.copydefault().getContext());
            Intrinsics.checkNotNullExpressionValue(strKWHzl, "");
            C5691aBJ c5691aBJ = activateGuardUseCase.AEQbTJ;
            Context context = stateListAnimator.copydefault().getContext();
            activateGuardUseCase$authBiometric$12.L$0 = activateGuardUseCase;
            activateGuardUseCase$authBiometric$12.L$1 = str;
            activateGuardUseCase$authBiometric$12.L$2 = str2;
            activateGuardUseCase$authBiometric$12.L$3 = signatureKWHzl;
            activateGuardUseCase$authBiometric$12.L$4 = c5700aBS;
            activateGuardUseCase$authBiometric$12.L$5 = strKWHzl;
            activateGuardUseCase$authBiometric$12.label = 2;
            Object objCopydefault2 = c5691aBJ.copydefault(context, activateGuardUseCase$authBiometric$12);
            if (objCopydefault2 == objCopydefault) {
                return objCopydefault;
            }
            c5700aBS2 = c5700aBS;
            str3 = str2;
            str4 = strKWHzl;
            signature = signatureKWHzl;
            objOLrzqt = objCopydefault2;
            activateGuardUseCase$authBiometric$12.L$0 = null;
            activateGuardUseCase$authBiometric$12.L$1 = null;
            activateGuardUseCase$authBiometric$12.L$2 = null;
            activateGuardUseCase$authBiometric$12.L$3 = null;
            activateGuardUseCase$authBiometric$12.L$4 = null;
            activateGuardUseCase$authBiometric$12.L$5 = null;
            activateGuardUseCase$authBiometric$12.label = 3;
            objOLrzqt = activateGuardUseCase.KWHzl(str, str3, signature, c5700aBS2, str4, (String) objOLrzqt, activateGuardUseCase$authBiometric$12);
            if (objOLrzqt != objCopydefault) {
            }
        } else {
            if (!(interfaceC5693aBL instanceof InterfaceC5693aBL.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            C5689aBH.KWHzl.AEQbTJ("[ACTIVATE]", "auth biometric error, error: " + interfaceC5693aBL);
            return new TaskDescription.StateListAnimator((InterfaceC5693aBL.StateListAnimator) interfaceC5693aBL);
        }
    }

    public final byte[] OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        try {
            byte[] bytes = str3.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            Map<String, ? extends Object> mapGEmmrt = C56424yEw.gEmmrt(C56390yDp.OLrzqt("fmt", str), C56390yDp.OLrzqt("attStmt", C56424yEw.KWHzl()), C56390yDp.OLrzqt("authData", createAuthData$default(this, str2, bytes, bArr, false, false, false, 56, null)));
            C5689aBH.KWHzl.AEQbTJ("[ACTIVATE]", "attestation: " + mapGEmmrt);
            return SimpleCBOREncoder.OLrzqt.KWHzl(mapGEmmrt);
        } catch (Exception e) {
            C5689aBH c5689aBH = C5689aBH.KWHzl;
            e.printStackTrace();
            c5689aBH.AEQbTJ("[ACTIVATE]", "buildAttestationObjectCbor: " + Unit.INSTANCE);
            return new byte[0];
        }
    }

    public final Object KWHzl(String str, String str2, Signature signature, C5700aBS c5700aBS, String str3, String str4, Continuation<? super TaskDescription> continuation) {
        C5689aBH c5689aBH = C5689aBH.KWHzl;
        c5689aBH.AEQbTJ("[ACTIVATE]", "start signing");
        byte[] bArrCopydefault = c5700aBS.copydefault();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str2.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        InterfaceC5696aBO interfaceC5696aBOOLrzqt = C5692aBK.KWHzl.OLrzqt(signature, bytes);
        if (interfaceC5696aBOOLrzqt instanceof InterfaceC5696aBO.Activity) {
            c5689aBH.AEQbTJ("[ACTIVATE]", "sign success");
            ClientData clientData = new ClientData("webauthn.create", str2, str4, str3);
            Json.Default r0 = Json.Default;
            r0.getSerializersModule();
            byte[] bytes2 = r0.encodeToString(ClientData.Companion.serializer(), clientData).getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "");
            String strAEQbTJ = C6617aSi.AEQbTJ(bytes2);
            c5689aBH.AEQbTJ("[ACTIVATE]", "finalClientDataJson: " + strAEQbTJ);
            String strAEQbTJ2 = C6617aSi.AEQbTJ(OLrzqt("none", str, c5700aBS.AEQbTJ(), bArrCopydefault));
            c5689aBH.AEQbTJ("[ACTIVATE]", "finalAttestationObject: " + strAEQbTJ2);
            String strAEQbTJ3 = c5700aBS.AEQbTJ();
            String string = PublicKeyCredentialType.PUBLIC_KEY.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return new TaskDescription.Fragment(new RegistrationFinishBody(string, strAEQbTJ3, (String) null, MTPushConstants.PlatformNode.KEY_PLATFORM, new RegistrationFinishBody.ResponseData(strAEQbTJ, strAEQbTJ2, C56402yEa.EZpvd("internal")), new RegistrationFinishBody.ClientExtensionResultsData((RegistrationFinishBody.CredPropsData) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0)), 4, (DefaultConstructorMarker) null));
        }
        if (!(interfaceC5696aBOOLrzqt instanceof InterfaceC5696aBO.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC5696aBO.StateListAnimator stateListAnimator = (InterfaceC5696aBO.StateListAnimator) interfaceC5696aBOOLrzqt;
        c5689aBH.AEQbTJ("[ACTIVATE]", "sign error, error: " + stateListAnimator.AEQbTJ());
        return new TaskDescription.Application(stateListAnimator.AEQbTJ());
    }

    public static /* synthetic */ byte[] createAuthData$default(ActivateGuardUseCase activateGuardUseCase, String str, byte[] bArr, byte[] bArr2, boolean z, boolean z2, boolean z3, int i, Object obj) {
        return activateGuardUseCase.EZpvd(str, bArr, bArr2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }

    public final byte[] EZpvd(@NotNull String str, @NotNull byte[] bArr, @NotNull byte[] bArr2, boolean z, boolean z2, boolean z3) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArrDigest = messageDigest.digest(bytes);
        byte b = z2 ? (byte) 1 : (byte) 0;
        if (z3) {
            b = (byte) (b | 4);
        }
        if (z) {
            b = (byte) (b | SignedBytes.MAX_POWER_OF_TWO);
        }
        byte[] bArrArray = ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(0).array();
        ArrayList arrayList = new ArrayList();
        byte[] bArr3 = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr3[i] = 9;
        }
        arrayList.addAll(yDT.valueOf(bArr3));
        arrayList.addAll(yDT.valueOf(OLrzqt((short) bArr.length)));
        arrayList.addAll(yDT.valueOf(bArr));
        arrayList.addAll(yDT.valueOf(bArr2));
        byte[] bArrDbNXlk = CollectionsKt___CollectionsKt.DbNXlk(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Intrinsics.copydefault(bArrDigest);
        arrayList2.addAll(yDT.valueOf(bArrDigest));
        arrayList2.add(Byte.valueOf(b));
        Intrinsics.copydefault(bArrArray);
        arrayList2.addAll(yDT.valueOf(bArrArray));
        arrayList2.addAll(yDT.valueOf(bArrDbNXlk));
        return CollectionsKt___CollectionsKt.DbNXlk(arrayList2);
    }

    public final byte[] OLrzqt(short s) {
        byte[] bArrArray = ByteBuffer.allocate(2).putShort(s).array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "");
        return bArrArray;
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator {
        public final boolean AEQbTJ;
        public final Fragment OLrzqt;
        public final RegistrationStartResponse copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, Fragment fragment, RegistrationStartResponse registrationStartResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                z = stateListAnimator.AEQbTJ;
            }
            if ((i & 2) != 0) {
                fragment = stateListAnimator.OLrzqt;
            }
            if ((i & 4) != 0) {
                registrationStartResponse = stateListAnimator.copydefault;
            }
            return stateListAnimator.OLrzqt(z, fragment, registrationStartResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator OLrzqt(boolean z, @NotNull Fragment fragment, @NotNull RegistrationStartResponse registrationStartResponse) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(registrationStartResponse, "");
            return new StateListAnimator(z, fragment, registrationStartResponse);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RegistrationStartResponse OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Fragment copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Boolean.hashCode(this.AEQbTJ) * 31) + this.OLrzqt.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Input(removeExistedIfPossible=" + this.AEQbTJ + ", fragment=" + this.OLrzqt + ", registrationStartResponse=" + this.copydefault + ")";
        }

        public StateListAnimator(boolean z, @NotNull Fragment fragment, @NotNull RegistrationStartResponse registrationStartResponse) {
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(registrationStartResponse, "");
            this.AEQbTJ = z;
            this.OLrzqt = fragment;
            this.copydefault = registrationStartResponse;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface TaskDescription {

        public static final class Fragment implements TaskDescription {
            public final RegistrationFinishBody OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Fragment copy$default(Fragment fragment, RegistrationFinishBody registrationFinishBody, int i, Object obj) {
                if ((i & 1) != 0) {
                    registrationFinishBody = fragment.OLrzqt;
                }
                return fragment.EZpvd(registrationFinishBody);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RegistrationFinishBody AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Fragment EZpvd(@NotNull RegistrationFinishBody registrationFinishBody) {
                Intrinsics.checkNotNullParameter(registrationFinishBody, "");
                return new Fragment(registrationFinishBody);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fragment) && Intrinsics.EZpvd(this.OLrzqt, ((Fragment) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Success(body=" + this.OLrzqt + ")";
            }

            public Fragment(@NotNull RegistrationFinishBody registrationFinishBody) {
                Intrinsics.checkNotNullParameter(registrationFinishBody, "");
                this.OLrzqt = registrationFinishBody;
            }
        }

        public static final class ActionBar implements TaskDescription {
            public static final ActionBar KWHzl = new ActionBar();

            private ActionBar() {
            }
        }

        /* JADX INFO: renamed from: com.okinc.auth.impl.guard.domain.ActivateGuardUseCase$TaskDescription$TaskDescription, reason: collision with other inner class name */
        public static final class C0238TaskDescription implements TaskDescription {
            public final String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0238TaskDescription copy$default(C0238TaskDescription c0238TaskDescription, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = c0238TaskDescription.AEQbTJ;
                }
                return c0238TaskDescription.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0238TaskDescription AEQbTJ(String str) {
                return new C0238TaskDescription(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0238TaskDescription) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((C0238TaskDescription) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.AEQbTJ;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "CreateUserKeyPairError(message=" + this.AEQbTJ + ")";
            }

            public C0238TaskDescription(String str) {
                this.AEQbTJ = str;
            }
        }

        public static final class StateListAnimator implements TaskDescription {
            public final InterfaceC5693aBL.StateListAnimator copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, InterfaceC5693aBL.StateListAnimator stateListAnimator2, int i, Object obj) {
                if ((i & 1) != 0) {
                    stateListAnimator2 = stateListAnimator.copydefault;
                }
                return stateListAnimator.KWHzl(stateListAnimator2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator KWHzl(@NotNull InterfaceC5693aBL.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                return new StateListAnimator(stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InterfaceC5693aBL.StateListAnimator KWHzl() {
                return this.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.copydefault, ((StateListAnimator) obj).copydefault);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.copydefault.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "AuthBiometricError(error=" + this.copydefault + ")";
            }

            public StateListAnimator(@NotNull InterfaceC5693aBL.StateListAnimator stateListAnimator) {
                Intrinsics.checkNotNullParameter(stateListAnimator, "");
                this.copydefault = stateListAnimator;
            }
        }

        public static final class Application implements TaskDescription {
            public final String AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = application.AEQbTJ;
                }
                return application.OLrzqt(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application OLrzqt(String str) {
                return new Application(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((Application) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.AEQbTJ;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SignError(message=" + this.AEQbTJ + ")";
            }

            public Application(String str) {
                this.AEQbTJ = str;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Activity implements TaskDescription {
            public final String EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Activity copy$default(Activity activity, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = activity.EZpvd;
                }
                return activity.copydefault(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String EZpvd() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity copydefault(String str) {
                return new Activity(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((Activity) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.EZpvd;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RegisterPasskeyError(message=" + this.EZpvd + ")";
            }

            public Activity(String str) {
                this.EZpvd = str;
            }
        }

        /* JADX INFO: loaded from: classes17.dex */
        public static final class Dialog implements TaskDescription {
            public final String KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Dialog copy$default(Dialog dialog, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = dialog.KWHzl;
                }
                return dialog.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Dialog AEQbTJ(String str) {
                return new Dialog(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String copydefault() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Dialog) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) ((Dialog) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                String str = this.KWHzl;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "UnknownError(message=" + this.KWHzl + ")";
            }

            public Dialog(String str) {
                this.KWHzl = str;
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    @Serializable
    public static final class ClientData {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public final String androidPackageName;
        public final String challenge;
        public final String origin;
        public final String type;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ClientData copy$default(ClientData clientData, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clientData.type;
            }
            if ((i & 2) != 0) {
                str2 = clientData.challenge;
            }
            if ((i & 4) != 0) {
                str3 = clientData.origin;
            }
            if ((i & 8) != 0) {
                str4 = clientData.androidPackageName;
            }
            return clientData.OLrzqt(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ClientData OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new ClientData(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClientData)) {
                return false;
            }
            ClientData clientData = (ClientData) obj;
            return Intrinsics.EZpvd((Object) this.type, (Object) clientData.type) && Intrinsics.EZpvd((Object) this.challenge, (Object) clientData.challenge) && Intrinsics.EZpvd((Object) this.origin, (Object) clientData.origin) && Intrinsics.EZpvd((Object) this.androidPackageName, (Object) clientData.androidPackageName);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.type.hashCode() * 31) + this.challenge.hashCode()) * 31) + this.origin.hashCode()) * 31) + this.androidPackageName.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ClientData(type=" + this.type + ", challenge=" + this.challenge + ", origin=" + this.origin + ", androidPackageName=" + this.androidPackageName + ")";
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.guard.domain.ActivateGuardUseCase.ClientData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<ClientData> serializer() {
                return ActivateGuardUseCase$ClientData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ClientData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, ActivateGuardUseCase$ClientData$$serializer.INSTANCE.getDescriptor());
            }
            this.type = str;
            this.challenge = str2;
            this.origin = str3;
            this.androidPackageName = str4;
        }

        public static final /* synthetic */ void copydefault(ClientData clientData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, clientData.type);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, clientData.challenge);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, clientData.origin);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, clientData.androidPackageName);
        }

        public ClientData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.type = str;
            this.challenge = str2;
            this.origin = str3;
            this.androidPackageName = str4;
        }
    }

    public static /* synthetic */ String generateCredentialId$default(ActivateGuardUseCase activateGuardUseCase, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 16;
        }
        return activateGuardUseCase.KWHzl(i);
    }

    public final String KWHzl(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return C6617aSi.EZpvd(bArr);
    }
}
