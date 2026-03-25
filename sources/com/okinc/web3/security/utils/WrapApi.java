package com.okinc.web3.security.utils;

import android.content.Context;
import android.util.Base64;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.web3.security.utils.internal.WrapUtilsImpl;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Arrays;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C56391yDq;
import o.pUU;
import o.yDT;
import o.yDV;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WrapApi {
    public static final int $stable = 0;
    public static final WrapApi INSTANCE = new WrapApi();

    private WrapApi() {
    }

    public static final String dataWrap(@NotNull Context context, @NotNull String str) {
        Object objM7377constructorimpl;
        Object obj = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            Result.Application application = Result.Companion;
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            objM7377constructorimpl = Result.m7377constructorimpl(Base64.encodeToString(WrapUtilsImpl.INSTANCE.wrap$OKWeb3Security_web3_security_lib(context, bytes), 2));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            obj = objM7377constructorimpl;
        } else {
            pUU.AEQbTJ("WrapApi", "dataWrap failed", thM7380exceptionOrNullimpl);
            EventData eventData = new EventData();
            eventData.setAct("web3_security_wrap_sensitive_data");
            eventData.setMsg("data_wrap_sensitive_data_failed");
            ReportManager.AEQbTJ.EZpvd(eventData);
        }
        return (String) obj;
    }

    public static final String dataUnwrap(@NotNull Context context, @NotNull String str) {
        Object objM7377constructorimpl;
        Object obj = "";
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!INSTANCE.isAuthorizedDataUnwrapCaller()) {
            WrapUtilsImpl wrapUtilsImpl = WrapUtilsImpl.INSTANCE;
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTrace, "");
            wrapUtilsImpl.monitorSecurityAttack("Unauthorized direct access to dataUnwrap", yDV.joinToString$default(stackTrace, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.okinc.web3.security.utils.WrapApi$$ExternalSyntheticLambda0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return WrapApi.dataUnwrap$lambda$3((StackTraceElement) obj2);
                }
            }, 30, (Object) null));
            if (wrapUtilsImpl.isCallerCheckHitGray()) {
                throw new SecurityException("Unauthorized caller for dataUnwrap operation");
            }
        }
        try {
            Result.Application application = Result.Companion;
            byte[] bArrDecode = Base64.decode(str, 2);
            WrapUtilsImpl wrapUtilsImpl2 = WrapUtilsImpl.INSTANCE;
            Intrinsics.copydefault(bArrDecode);
            objM7377constructorimpl = Result.m7377constructorimpl(new String(wrapUtilsImpl2.unwrap$OKWeb3Security_web3_security_lib(context, bArrDecode), Charsets.UTF_8));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            obj = objM7377constructorimpl;
        } else {
            pUU.AEQbTJ("WrapApi", "dataUnwrap failed[" + Thread.currentThread().getName() + "]", thM7380exceptionOrNullimpl);
            EventData eventData = new EventData();
            eventData.setAct("web3_security_wrap_sensitive_data");
            eventData.setMsg("data_unwrap_sensitive_data_failed");
            ReportManager.AEQbTJ.EZpvd(eventData);
        }
        return (String) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence dataUnwrap$lambda$3(StackTraceElement stackTraceElement) {
        return stackTraceElement.getClassName() + JwtUtilsKt.JWT_DELIMITER + stackTraceElement.getMethodName() + "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")";
    }

    public static final boolean isEqual(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        WrapApi wrapApi = INSTANCE;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(Boolean.valueOf(wrapApi.unwrapAndCompare$OKWeb3Security_web3_security_lib(context, str, str2)));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("WrapApi", "unwrapAndCompare failed[" + Thread.currentThread().getName() + "]", thM7380exceptionOrNullimpl);
            objM7377constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM7377constructorimpl).booleanValue();
    }

    public final boolean unwrapAndCompare$OKWeb3Security_web3_security_lib(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        WrapUtilsImpl wrapUtilsImpl = WrapUtilsImpl.INSTANCE;
        byte[] bArrDecode = Base64.decode(str, 2);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "");
        byte[] bArrUnwrap$OKWeb3Security_web3_security_lib = wrapUtilsImpl.unwrap$OKWeb3Security_web3_security_lib(context, bArrDecode);
        byte[] bArrDecode2 = Base64.decode(str2, 2);
        Intrinsics.checkNotNullExpressionValue(bArrDecode2, "");
        byte[] bArrUnwrap$OKWeb3Security_web3_security_lib2 = wrapUtilsImpl.unwrap$OKWeb3Security_web3_security_lib(context, bArrDecode2);
        try {
            return Arrays.equals(bArrUnwrap$OKWeb3Security_web3_security_lib, bArrUnwrap$OKWeb3Security_web3_security_lib2);
        } finally {
            byte b = 0;
            int i = 0;
            yDT.fill$default(bArrUnwrap$OKWeb3Security_web3_security_lib, (byte) 0, (int) b, i, 6, (Object) null);
            yDT.fill$default(bArrUnwrap$OKWeb3Security_web3_security_lib2, b, i, 0, 6, (Object) null);
        }
    }

    private final boolean isAuthorizedDataUnwrapCaller() {
        return WrapUtilsImpl.INSTANCE.isAuthorizedCaller(yDY.gEmmrt("com.okinc.web3.security.model.Mnemonic.words", "com.okinc.web3.security.service.Web3SecurityServiceImpl.showPrivateKeyDialog", "com.okinc.web3.security.features.backup.privatekey.PrivateKeyBottomSheet.onViewCreated", "com.okinc.web3.security.features.backup.privatekey.BackupPrivateKeyActivity.onBindViewHolder", "com.okinc.web3.security.features.backup.privatekey.CopyPrivateKeyProtectFragment.onCreateContent", "com.okinc.web3.security.features.mpc.MpcPrivateKeyItemViewBinding.onBindViewHolder", "com.okinc.web3.security.features.mpc.MpcPrivateKeyRecyclerView.copyAllPrivateKey"));
    }
}
