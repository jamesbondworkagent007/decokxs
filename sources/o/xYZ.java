package o;

import com.okinc.wallet.core.sign.InvokeMethodParams;
import com.okinc.wallet.core.sign.RawData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.UnsignedTx;
import com.okinc.wallet.core.sign.evm.AAAddressAndExecuteParamsTripleList;
import com.okinc.wallet.core.sign.evm.AAGenerateSignatureHash;
import com.okinc.wallet.core.sign.evm.AAGetUserOpHash;
import com.okinc.wallet.core.sign.evm.BaseAccountTransaction;
import com.okinc.wallet.core.sign.evm.EVMAuthorization;
import com.okinc.wallet.core.sign.evm.EvmSignatureRawValue;
import com.okinc.wallet.core.sign.evm.ExecuteParamsTriple;
import com.okinc.wallet.core.sign.evm.OpCalDataTransaction;
import com.okinc.wallet.core.sign.evm.SigData;
import com.reown.android.internal.common.signing.eip1271.EIP1271Verifier;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xYZ {
    public static final xYZ KWHzl = new xYZ();

    private xYZ() {
    }

    public final java.lang.String OLrzqt(@NotNull SignParams signParams, @NotNull BaseAccountTransaction baseAccountTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(baseAccountTransaction, "");
        java.lang.String strAYXKKw = xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, baseAccountTransaction));
        if (strAYXKKw.length() == 0) {
            return null;
        }
        return strAYXKKw;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xXV.KWHzl.copydefault(str, str2, z);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xXV.KWHzl.KWHzl(str, str2, z);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, long j, @NotNull SigData sigData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(sigData, "");
        java.lang.String strCopydefault = xXV.KWHzl.copydefault(str, j, sigData);
        if (C59449zhJ.startsWith$default(strCopydefault, EIP1271Verifier.hexPrefix, false, 2, null) || strCopydefault.length() == 0) {
            return strCopydefault;
        }
        return EIP1271Verifier.hexPrefix + strCopydefault;
    }

    public final EVMAuthorization copydefault(@NotNull SignParams signParams, @NotNull EVMAuthorization eVMAuthorization) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(eVMAuthorization, "");
        java.lang.String strAEQbTJ = xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("sign_authorization", signParams, eVMAuthorization));
        if (strAEQbTJ == null || strAEQbTJ.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ))) {
            return null;
        }
        return (EVMAuthorization) C54907xZt.OLrzqt(EVMAuthorization.Companion.serializer(), strAEQbTJ);
    }

    public final EVMAuthorization KWHzl(@NotNull SignParams signParams, @NotNull EVMAuthorization eVMAuthorization) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(eVMAuthorization, "");
        java.lang.String strAEQbTJ = xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("sign_authorization_forRPC", signParams, eVMAuthorization));
        if (strAEQbTJ == null || strAEQbTJ.length() == 0 || !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAEQbTJ))) {
            return null;
        }
        return (EVMAuthorization) C54907xZt.OLrzqt(EVMAuthorization.Companion.serializer(), strAEQbTJ);
    }

    public final java.lang.String copydefault(@NotNull SignParams signParams, @NotNull OpCalDataTransaction opCalDataTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(opCalDataTransaction, "");
        return xXV.KWHzl.copydefault(signParams, opCalDataTransaction);
    }

    public final java.lang.String OLrzqt(long j, @NotNull SigData sigData) {
        Intrinsics.checkNotNullParameter(sigData, "");
        return xXV.KWHzl.EZpvd(j, sigData);
    }

    public final java.lang.String AEQbTJ(long j, long j2, java.lang.String str, @NotNull BaseAccountTransaction baseAccountTransaction) {
        Intrinsics.checkNotNullParameter(baseAccountTransaction, "");
        return xYU.copydefault.KWHzl(new UnsignedTx(j, j2, str, baseAccountTransaction, 0, false, 48, null));
    }

    public final java.lang.String AEQbTJ(long j, @NotNull EvmSignatureRawValue evmSignatureRawValue) {
        Intrinsics.checkNotNullParameter(evmSignatureRawValue, "");
        return xYU.copydefault.copydefault(new RawData(j, 0L, evmSignatureRawValue, false, 0, 26, null));
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return xXV.KWHzl.EZpvd(str, z);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return xXV.KWHzl.copydefault(str, str2, str3);
    }

    public final TxMessage copydefault(long j, @NotNull SigData sigData) {
        Intrinsics.checkNotNullParameter(sigData, "");
        return xXV.KWHzl.OLrzqt(j, sigData);
    }

    public final TxMessage copydefault(long j, long j2, java.lang.String str, @NotNull BaseAccountTransaction baseAccountTransaction) {
        Intrinsics.checkNotNullParameter(baseAccountTransaction, "");
        return xYU.copydefault.AEQbTJ(new UnsignedTx(j, j2, str, baseAccountTransaction, 0, false, 48, null));
    }

    public final java.lang.String EZpvd(long j, @NotNull EvmSignatureRawValue evmSignatureRawValue) {
        Intrinsics.checkNotNullParameter(evmSignatureRawValue, "");
        return xYU.copydefault.AEQbTJ(new RawData(j, 0L, evmSignatureRawValue, false, 0, 26, null));
    }

    public final void EZpvd(@NotNull xYJ xyj, @NotNull ExecuteParamsTriple executeParamsTriple, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(xyj, "");
        Intrinsics.checkNotNullParameter(executeParamsTriple, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        xyj.OLrzqt("\n                okGenerateAABatchCallDataV6ToV7(" + C54907xZt.encodeToString$default(ExecuteParamsTriple.Companion.serializer(), executeParamsTriple, false, 2, null) + ");\n                ", valueCallback);
    }

    public final void EZpvd(@NotNull xYJ xyj, @NotNull java.util.List<ExecuteParamsTriple> list, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(xyj, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        xyj.OLrzqt("\n                okBatchGenerateAABatchCallDataV6ToV7(" + C54907xZt.encodeToString$default(BuiltinSerializersKt.ListSerializer(ExecuteParamsTriple.Companion.serializer()), list, false, 2, null) + ");\n                ", valueCallback);
    }

    public final void EZpvd(@NotNull xYJ xyj, @NotNull java.lang.String str, @NotNull ExecuteParamsTriple executeParamsTriple, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(xyj, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(executeParamsTriple, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        xyj.OLrzqt("\n                okGenerateAABatchCallDataV7(\"" + str + "\", " + C54907xZt.encodeToString$default(ExecuteParamsTriple.Companion.serializer(), executeParamsTriple, false, 2, null) + ");\n                ", valueCallback);
    }

    public final void copydefault(@NotNull xYJ xyj, @NotNull AAAddressAndExecuteParamsTripleList aAAddressAndExecuteParamsTripleList, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(xyj, "");
        Intrinsics.checkNotNullParameter(aAAddressAndExecuteParamsTripleList, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        xyj.OLrzqt("\n                okBatchGenerateAABatchCallDataV7(" + C54907xZt.encodeToString$default(AAAddressAndExecuteParamsTripleList.Companion.serializer(), aAAddressAndExecuteParamsTripleList, false, 2, null) + ");\n                ", valueCallback);
    }

    public final void KWHzl(@NotNull xYJ xyj, @NotNull AAGenerateSignatureHash aAGenerateSignatureHash, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(xyj, "");
        Intrinsics.checkNotNullParameter(aAGenerateSignatureHash, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        xyj.OLrzqt("\n                okGenerateSignatureHash(" + C54907xZt.EZpvd(AAGenerateSignatureHash.Companion.serializer(), aAGenerateSignatureHash, true) + ");\n                ", valueCallback);
    }

    public final void OLrzqt(@NotNull xYJ xyj, int i, int i2, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(xyj, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        xyj.OLrzqt("\n                okGenerateUnSignSignatureV7({sigTime: " + i + ", sigType: " + i2 + "});\n                ", valueCallback);
    }

    public final void copydefault(@NotNull xYJ xyj, @NotNull java.lang.String str, int i, int i2, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(xyj, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        xyj.OLrzqt("\n                okGenerateSignature({signature: \"" + str + "\", sigTime: " + i + ", sigType: " + i2 + "});\n                ", valueCallback);
    }

    public final void EZpvd(@NotNull xYJ xyj, @NotNull AAGetUserOpHash aAGetUserOpHash, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(xyj, "");
        Intrinsics.checkNotNullParameter(aAGetUserOpHash, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        xyj.OLrzqt("\n                okGetUserOpHash(" + C54907xZt.EZpvd(AAGetUserOpHash.Companion.serializer(), aAGetUserOpHash, true) + ");\n                ", valueCallback);
    }

    public final void copydefault(@NotNull xYJ xyj, @NotNull AAGetUserOpHash aAGetUserOpHash, @NotNull android.webkit.ValueCallback<java.lang.String> valueCallback) {
        Intrinsics.checkNotNullParameter(xyj, "");
        Intrinsics.checkNotNullParameter(aAGetUserOpHash, "");
        Intrinsics.checkNotNullParameter(valueCallback, "");
        xyj.OLrzqt("\n                okGetUserOpHashV7(" + C54907xZt.EZpvd(AAGetUserOpHash.Companion.serializer(), aAGetUserOpHash, true) + ");\n                ", valueCallback);
    }
}
