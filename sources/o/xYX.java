package o;

import com.google.gson.JsonObject;
import com.okinc.wallet.core.sign.InvokeMethodParams;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.aptos.AptosPayloadTransaction;
import com.okinc.wallet.core.sign.aptos.AptosRawTransaction;
import com.okinc.wallet.core.sign.aptos.AptosTransaction;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xYX {
    public static final xYX copydefault = new xYX();

    private xYX() {
    }

    public final SignedTx OLrzqt(@NotNull SignParams signParams, @NotNull AptosTransaction aptosTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(aptosTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, aptosTransaction)));
    }

    public final SignedTx copydefault(@NotNull SignParams signParams, @NotNull AptosTransaction aptosTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(aptosTransaction, "");
        return SignedTx.Companion.KWHzl(xXV.KWHzl.KWHzl(InvokeMethodParams.Companion.EZpvd("fungibleAssetTransfer", signParams, aptosTransaction)));
    }

    public final java.lang.String EZpvd(@NotNull SignParams signParams, @NotNull AptosTransaction aptosTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(aptosTransaction, "");
        return xXV.KWHzl.AEQbTJ(InvokeMethodParams.Companion.EZpvd("simulateTransfer", signParams, aptosTransaction));
    }

    public final SignedTx EZpvd(@NotNull SignParams signParams, @NotNull AptosPayloadTransaction aptosPayloadTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(aptosPayloadTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("payloadTransaction", signParams, aptosPayloadTransaction)));
    }

    public final java.lang.String copydefault(@NotNull SignParams signParams, @NotNull AptosPayloadTransaction aptosPayloadTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(aptosPayloadTransaction, "");
        return xXV.KWHzl.AEQbTJ(InvokeMethodParams.Companion.EZpvd("simulatePayloadTransaction", signParams, aptosPayloadTransaction));
    }

    public final SignedTx AEQbTJ(@NotNull SignParams signParams, @NotNull AptosPayloadTransaction aptosPayloadTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(aptosPayloadTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("buildScriptTransaction", signParams, aptosPayloadTransaction)));
    }

    public final java.lang.String KWHzl(@NotNull SignParams signParams, @NotNull AptosPayloadTransaction aptosPayloadTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(aptosPayloadTransaction, "");
        return xXV.KWHzl.AEQbTJ(InvokeMethodParams.Companion.EZpvd("simulateBuildScriptTransaction", signParams, aptosPayloadTransaction));
    }

    public final SignedTx AEQbTJ(@NotNull SignParams signParams, @NotNull AptosRawTransaction aptosRawTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(aptosRawTransaction, "");
        return new SignedTx(xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("signSimpleTx", signParams, aptosRawTransaction)), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 14, (DefaultConstructorMarker) null);
    }

    public final SignedTx OLrzqt(@NotNull SignParams signParams, @NotNull AptosRawTransaction aptosRawTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(aptosRawTransaction, "");
        return new SignedTx(xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("signMultiAgentTx", signParams, aptosRawTransaction)), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 14, (DefaultConstructorMarker) null);
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xXV.KWHzl.EZpvd(str, str2);
    }

    public final java.lang.String EZpvd(@NotNull SignParams signParams, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(str, "");
        JsonObject jsonObjectOLrzqt = C33490mxT.OLrzqt(str);
        if (jsonObjectOLrzqt == null) {
            return "";
        }
        return xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("signMessageByPayload", signParams, jsonObjectOLrzqt));
    }
}
