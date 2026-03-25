package o;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.huawei.hms.framework.common.ContainerUtils;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateResponse;
import com.okinc.auth.api.passkey.PasskeyPromotionAuthenticator;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.aSi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6617aSi {
    public static final int KWHzl = 11;

    public static final java.lang.String EZpvd(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        java.lang.String strEncodeToString = android.util.Base64.encodeToString(bArr, KWHzl);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        return strEncodeToString;
    }

    public static final byte[] AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        byte[] bArrDecode = android.util.Base64.decode(str, KWHzl);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
        return bArrDecode;
    }

    public static final java.lang.String AEQbTJ(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return C59449zhJ.replace$default(C59449zhJ.replace$default(C59449zhJ.replace$default(EZpvd(bArr), Marker.ANY_NON_NULL_MARKER, "-", false, 4, (java.lang.Object) null), "/", "_", false, 4, (java.lang.Object) null), ContainerUtils.KEY_VALUE_DELIMITER, "", false, 4, (java.lang.Object) null);
    }

    public static final <T> java.lang.Object EZpvd(@NotNull Task<T> task, @NotNull Continuation<? super T> continuation) throws java.lang.Exception {
        if (task.isComplete()) {
            java.lang.Exception exception = task.getException();
            if (exception == null) {
                if (task.isCanceled()) {
                    throw new CancellationException("Task " + task + " was cancelled normally.");
                }
                return task.getResult();
            }
            throw exception;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        task.addOnCompleteListener(new TaskDescription(task, cancellableContinuationImpl));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return result;
    }

    /* JADX INFO: renamed from: o.aSi$TaskDescription */
    public static final class TaskDescription<TResult> implements OnCompleteListener {
        public final /* synthetic */ Task<T> EZpvd;
        public final /* synthetic */ CancellableContinuation<T> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super T> */
        /* JADX WARN: Multi-variable type inference failed */
        public TaskDescription(Task<T> task, CancellableContinuation<? super T> cancellableContinuation) {
            this.EZpvd = task;
            this.copydefault = cancellableContinuation;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task<T> task) {
            Intrinsics.checkNotNullParameter(task, "");
            java.lang.Exception exception = this.EZpvd.getException();
            if (exception == null) {
                if (this.EZpvd.isCanceled()) {
                    CancellableContinuation.DefaultImpls.cancel$default(this.copydefault, null, 1, null);
                    return;
                }
                Continuation continuation = this.copydefault;
                Result.Application application = Result.Companion;
                continuation.resumeWith(Result.m7377constructorimpl(this.EZpvd.getResult()));
                return;
            }
            Continuation continuation2 = this.copydefault;
            Result.Application application2 = Result.Companion;
            continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(exception)));
        }
    }

    public static final PublicKeyCredentialCreationOptions KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PublicKeyCredentialCreationOptions(str);
    }

    public static final PublicKeyCredentialDescriptor OLrzqt(@NotNull java.lang.String str, @NotNull byte[] bArr, @NotNull java.util.List<? extends Transport> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new PublicKeyCredentialDescriptor(str, bArr, (java.util.List<Transport>) list);
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(passkeyPromotionAuthenticator, "");
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("authenticatorSelection");
            if (jSONObjectOptJSONObject != null) {
                if (Intrinsics.EZpvd(passkeyPromotionAuthenticator, PasskeyPromotionAuthenticator.All.KWHzl)) {
                    Unit unit = Unit.INSTANCE;
                } else if (Intrinsics.EZpvd(passkeyPromotionAuthenticator, PasskeyPromotionAuthenticator.ExternalOnly.EZpvd)) {
                    jSONObjectOptJSONObject.put("authenticatorAttachment", "cross-platform");
                } else {
                    if (!Intrinsics.EZpvd(passkeyPromotionAuthenticator, PasskeyPromotionAuthenticator.InternalOnly.copydefault)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jSONObjectOptJSONObject.put("authenticatorAttachment", MTPushConstants.PlatformNode.KEY_PLATFORM);
                }
                java.lang.String string = jSONObject.toString();
                if (string != null) {
                    return string;
                }
            }
            pUU.copydefault("AddAuthenticatorAttachment", "authenticatorSelectionObject is null");
            return str;
        } catch (java.lang.Exception e) {
            pUU.copydefault("AddAuthenticatorAttachment", "addAttachmentWithGson: " + e.getMessage());
            return str;
        }
    }

    public static final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("allowCredentials");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    jSONArrayOptJSONArray.getJSONObject(i).put("transports", C56402yEa.EZpvd("internal"));
                }
            }
            java.lang.String string = jSONObject.toString();
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        } catch (java.lang.Exception e) {
            pUU.copydefault("PasskeyExt", "PasskeyExt: String.limitToInternalAuthenticator(): " + e.getMessage());
            return str;
        }
    }

    public static final java.lang.String OLrzqt(@NotNull PasskeyAuthenticateRequest passkeyAuthenticateRequest, boolean z) {
        Intrinsics.checkNotNullParameter(passkeyAuthenticateRequest, "");
        if (z) {
            return C33488mxR.EZpvd(passkeyAuthenticateRequest);
        }
        return EZpvd(C33488mxR.EZpvd(passkeyAuthenticateRequest));
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final PublicKeyCredentialRequestOptions EZpvd(@NotNull PasskeyAuthenticateRequest passkeyAuthenticateRequest, boolean z) {
        java.util.List<PublicKeyCredentialDescriptor> listAhwBna;
        byte[] bArrAEQbTJ;
        java.util.List listEZpvd;
        java.lang.Object objM7377constructorimpl;
        java.util.List<java.lang.String> listAEQbTJ;
        java.util.List<java.lang.String> listAEQbTJ2;
        byte[] bArrAEQbTJ2;
        Intrinsics.checkNotNullParameter(passkeyAuthenticateRequest, "");
        PublicKeyCredentialRequestOptions.Builder builder = new PublicKeyCredentialRequestOptions.Builder();
        java.lang.String strEZpvd = passkeyAuthenticateRequest.EZpvd();
        if (strEZpvd != null && (bArrAEQbTJ2 = AEQbTJ(strEZpvd)) != null) {
            builder.setChallenge(bArrAEQbTJ2);
        }
        java.lang.String strKWHzl = passkeyAuthenticateRequest.KWHzl();
        if (strKWHzl != null) {
            builder.setRpId(strKWHzl);
        }
        java.util.List<PasskeyAuthenticateRequest.AllowCredential> listOLrzqt = passkeyAuthenticateRequest.OLrzqt();
        if (listOLrzqt != null) {
            java.util.ArrayList<PasskeyAuthenticateRequest.AllowCredential> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listOLrzqt) {
                PasskeyAuthenticateRequest.AllowCredential allowCredential = (PasskeyAuthenticateRequest.AllowCredential) obj;
                if (z || (((listAEQbTJ = allowCredential.AEQbTJ()) != null && listAEQbTJ.contains("hybrid")) || ((listAEQbTJ2 = allowCredential.AEQbTJ()) != null && listAEQbTJ2.contains("unknown")))) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            for (PasskeyAuthenticateRequest.AllowCredential allowCredential2 : arrayList) {
                java.lang.String string = PublicKeyCredentialType.PUBLIC_KEY.toString();
                java.lang.String strCopydefault = allowCredential2.copydefault();
                if (strCopydefault == null || (bArrAEQbTJ = AEQbTJ(strCopydefault)) == null) {
                    bArrAEQbTJ = new byte[0];
                }
                if (z) {
                    java.util.List<java.lang.String> listAEQbTJ3 = allowCredential2.AEQbTJ();
                    listEZpvd = null;
                    if (listAEQbTJ3 != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.String str : listAEQbTJ3) {
                            try {
                                Result.Application application = Result.Companion;
                                objM7377constructorimpl = Result.m7377constructorimpl(Transport.fromString(str));
                            } catch (java.lang.Throwable th) {
                                Result.Application application2 = Result.Companion;
                                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                            }
                            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                                objM7377constructorimpl = null;
                            }
                            Transport transport = (Transport) objM7377constructorimpl;
                            if (transport != null) {
                                arrayList3.add(transport);
                            }
                        }
                        listEZpvd = arrayList3;
                    }
                    if (listEZpvd == null) {
                        listEZpvd = yDY.AhwBna();
                    }
                } else {
                    listEZpvd = C56402yEa.EZpvd(Transport.INTERNAL);
                }
                arrayList2.add(new PublicKeyCredentialDescriptor(string, bArrAEQbTJ, (java.util.List<Transport>) listEZpvd));
            }
            listAhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2);
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
        }
        builder.setAllowList(listAhwBna);
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptionsBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(publicKeyCredentialRequestOptionsBuild, "");
        return publicKeyCredentialRequestOptionsBuild;
    }

    public static final PasskeyAuthenticateResponse EZpvd(@NotNull PublicKeyCredential publicKeyCredential) {
        Intrinsics.checkNotNullParameter(publicKeyCredential, "");
        AuthenticatorResponse response = publicKeyCredential.getResponse();
        Intrinsics.copydefault(response, "");
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) response;
        java.lang.String id = publicKeyCredential.getId();
        java.lang.String string = PublicKeyCredentialType.PUBLIC_KEY.toString();
        java.lang.String authenticatorAttachment = publicKeyCredential.getAuthenticatorAttachment();
        java.lang.String str = authenticatorAttachment == null ? "" : authenticatorAttachment;
        byte[] clientDataJSON = authenticatorAssertionResponse.getClientDataJSON();
        Intrinsics.checkNotNullExpressionValue(clientDataJSON, "");
        java.lang.String strAEQbTJ = AEQbTJ(clientDataJSON);
        byte[] authenticatorData = authenticatorAssertionResponse.getAuthenticatorData();
        Intrinsics.checkNotNullExpressionValue(authenticatorData, "");
        java.lang.String strAEQbTJ2 = AEQbTJ(authenticatorData);
        byte[] signature = authenticatorAssertionResponse.getSignature();
        Intrinsics.checkNotNullExpressionValue(signature, "");
        return new PasskeyAuthenticateResponse(id, string, str, new PasskeyAuthenticateResponse.Response(strAEQbTJ, strAEQbTJ2, AEQbTJ(signature)), (PasskeyAuthenticateResponse.ClientExtensionResultsData) null, 16, (DefaultConstructorMarker) null);
    }

    public static final PasskeyAuthenticateResponse copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        JSONObject jSONObject = new JSONObject(str);
        java.lang.String strOptString = jSONObject.optString("id");
        jSONObject.optString("rawId");
        java.lang.String strOptString2 = jSONObject.optString("authenticatorAttachment");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("response");
        java.lang.String strOptString3 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("clientDataJSON") : null;
        java.lang.String strOptString4 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("authenticatorData") : null;
        java.lang.String strOptString5 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("signature") : null;
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optString("userHandle");
        }
        java.lang.String string = PublicKeyCredentialType.PUBLIC_KEY.toString();
        if (strOptString2 == null) {
            strOptString2 = "";
        }
        return new PasskeyAuthenticateResponse(strOptString, string, strOptString2, new PasskeyAuthenticateResponse.Response(strOptString3, strOptString4, strOptString5), (PasskeyAuthenticateResponse.ClientExtensionResultsData) null, 16, (DefaultConstructorMarker) null);
    }
}
