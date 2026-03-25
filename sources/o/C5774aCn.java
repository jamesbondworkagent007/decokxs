package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.auth.impl.mfa.model.MfaFailure;
import com.okinc.auth.impl.mfa.model.MfaResponse;
import com.okinc.auth.impl.mfa.model.MfaResult;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aCn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5774aCn {
    public static final MfaResult EZpvd(@NotNull ResponseData<MfaResponse> responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            MfaResponse data = responseData.getData();
            Intrinsics.copydefault(data);
            return new MfaResult.Success(data);
        }
        return new MfaResult.Failure(OLrzqt(responseData));
    }

    public static final <T> MfaFailure OLrzqt(@NotNull ResponseData<T> responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        switch (responseData.getCode()) {
            case MfaResponse.CREATE_SESSION_FAILURE /* 5001 */:
                int code = responseData.getCode();
                break;
            case MfaResponse.BUSINESS_NOT_SUPPORTED /* 5004 */:
                int code2 = responseData.getCode();
                break;
            case MfaResponse.VERIFICATION_FAILURE /* 5005 */:
                int code3 = responseData.getCode();
                break;
            case MfaResponse.FACIAL_MAXIMUM_RETRY /* 5008 */:
                int code4 = responseData.getCode();
                break;
        }
        return new MfaFailure.GenericFailure(java.lang.String.valueOf(responseData.getCode()), responseData.getMsg());
    }

    public static final MfaFailure KWHzl(@NotNull OKServerException oKServerException) {
        java.lang.Object objM7377constructorimpl;
        JsonObject asJsonObject;
        JsonElement jsonElement;
        JsonObject asJsonObject2;
        JsonElement jsonElement2;
        Intrinsics.checkNotNullParameter(oKServerException, "");
        int code = oKServerException.getCode();
        if (code != 3909) {
            switch (code) {
                case 5000:
                    int code2 = oKServerException.getCode();
                    java.lang.String message = oKServerException.getMessage();
                    return new MfaFailure.GenericFailure(java.lang.String.valueOf(code2), message != null ? message : "");
                case MfaResponse.CREATE_SESSION_FAILURE /* 5001 */:
                    int code3 = oKServerException.getCode();
                    java.lang.String message2 = oKServerException.getMessage();
                    return new MfaFailure.FailedToCreateSession(java.lang.String.valueOf(code3), message2 != null ? message2 : "");
                case MfaResponse.SESSION_EXPIRED /* 5002 */:
                    int code4 = oKServerException.getCode();
                    java.lang.String message3 = oKServerException.getMessage();
                    return new MfaFailure.SessionExpired(java.lang.String.valueOf(code4), message3 != null ? message3 : "");
                case MfaResponse.SESSION_INVALID /* 5003 */:
                    int code5 = oKServerException.getCode();
                    java.lang.String message4 = oKServerException.getMessage();
                    return new MfaFailure.SessionInvalid(java.lang.String.valueOf(code5), message4 != null ? message4 : "");
                case MfaResponse.BUSINESS_NOT_SUPPORTED /* 5004 */:
                    int code6 = oKServerException.getCode();
                    java.lang.String message5 = oKServerException.getMessage();
                    return new MfaFailure.BusinessNotSupport(java.lang.String.valueOf(code6), message5 != null ? message5 : "");
                case MfaResponse.VERIFICATION_FAILURE /* 5005 */:
                    int code7 = oKServerException.getCode();
                    java.lang.String message6 = oKServerException.getMessage();
                    return new MfaFailure.VerificationFailure(java.lang.String.valueOf(code7), message6 != null ? message6 : "");
                case MfaResponse.MAXIMUM_RETRY /* 5006 */:
                    int code8 = oKServerException.getCode();
                    java.lang.String message7 = oKServerException.getMessage();
                    return new MfaFailure.MaximumRetry(java.lang.String.valueOf(code8), message7 != null ? message7 : "");
                case MfaResponse.FACIAL_CAN_RETRY /* 5007 */:
                    int code9 = oKServerException.getCode();
                    java.lang.String message8 = oKServerException.getMessage();
                    return new MfaFailure.FacialCanRetry(java.lang.String.valueOf(code9), message8 != null ? message8 : "");
                case MfaResponse.FACIAL_MAXIMUM_RETRY /* 5008 */:
                    int code10 = oKServerException.getCode();
                    java.lang.String message9 = oKServerException.getMessage();
                    return new MfaFailure.FacialMaximumRetry(java.lang.String.valueOf(code10), message9 != null ? message9 : "");
                default:
                    int code11 = oKServerException.getCode();
                    java.lang.String message10 = oKServerException.getMessage();
                    return new MfaFailure.GenericFailure(java.lang.String.valueOf(code11), message10 != null ? message10 : "");
            }
        }
        try {
            Result.Application application = Result.Companion;
            JsonObject response = oKServerException.getResponse();
            objM7377constructorimpl = Result.m7377constructorimpl((response == null || (asJsonObject = response.getAsJsonObject()) == null || (jsonElement = asJsonObject.get("data")) == null || (asJsonObject2 = jsonElement.getAsJsonObject()) == null || (jsonElement2 = asJsonObject2.get("remainTime")) == null) ? null : java.lang.Long.valueOf(jsonElement2.getAsLong()));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Long l = (java.lang.Long) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        if (l != null) {
            return new MfaFailure.TooManyOtpRequest(l.longValue());
        }
        int code12 = oKServerException.getCode();
        java.lang.String message11 = oKServerException.getMessage();
        return new MfaFailure.GenericFailure(java.lang.String.valueOf(code12), message11 != null ? message11 : "");
    }

    public static final MfaFailure EZpvd(@NotNull java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        if (exc instanceof OKServerException) {
            return KWHzl((OKServerException) exc);
        }
        return new MfaFailure.OtherException(exc);
    }
}
