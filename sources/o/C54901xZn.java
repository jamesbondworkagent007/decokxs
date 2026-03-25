package o;

import com.okinc.wallet.core.sign.InvokeMethodParams;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.ton.TonAddress;
import com.okinc.wallet.core.sign.ton.TonBaseTransaction;
import com.okinc.wallet.core.sign.ton.TonConnectProto;
import com.okinc.wallet.core.sign.ton.TonMultiTransaction;
import com.okinc.wallet.core.sign.ton.TonProofData;
import com.okinc.wallet.core.sign.ton.TonSignedTx;
import com.okinc.wallet.core.sign.ton.TonWalletInformation;
import com.okinc.wallet.core.sign.ton.X25519KeyPair;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xZn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54901xZn {
    public static final int EZpvd = 0;
    public static final C54901xZn OLrzqt = new C54901xZn();

    private C54901xZn() {
    }

    public final TonSignedTx copydefault(@NotNull SignParams signParams, @NotNull TonBaseTransaction tonBaseTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(tonBaseTransaction, "");
        return TonSignedTx.Companion.OLrzqt(xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, tonBaseTransaction)));
    }

    public final TonSignedTx KWHzl(@NotNull SignParams signParams, @NotNull TonBaseTransaction tonBaseTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(tonBaseTransaction, "");
        return TonSignedTx.Companion.OLrzqt(xYU.copydefault.EZpvd(InvokeMethodParams.Companion.EZpvd("simulate", signParams, tonBaseTransaction)));
    }

    public final java.lang.String copydefault(@NotNull SignParams signParams, @NotNull TonProofData tonProofData) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(tonProofData, "");
        return xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("signProof", signParams, tonProofData));
    }

    public final TonSignedTx copydefault(@NotNull SignParams signParams, @NotNull TonMultiTransaction tonMultiTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(tonMultiTransaction, "");
        return TonSignedTx.Companion.OLrzqt(xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("multi", signParams, tonMultiTransaction)));
    }

    public final TonSignedTx EZpvd(@NotNull SignParams signParams, @NotNull TonMultiTransaction tonMultiTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(tonMultiTransaction, "");
        return TonSignedTx.Companion.OLrzqt(xYU.copydefault.EZpvd(InvokeMethodParams.Companion.EZpvd("simulateMulti", signParams, tonMultiTransaction)));
    }

    public final TonWalletInformation OLrzqt(@NotNull SignParams signParams, @NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = xYU.copydefault.EZpvd(InvokeMethodParams.Companion.EZpvd("getWalletInformation", signParams, str));
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((TonWalletInformation) C54907xZt.OLrzqt(TonWalletInformation.Companion.serializer(), strEZpvd));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (TonWalletInformation) objM7377constructorimpl;
    }

    public final X25519KeyPair OLrzqt(@NotNull SignParams signParams) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(signParams, "");
        java.lang.String strEZpvd = xYU.copydefault.EZpvd(InvokeMethodParams.Companion.EZpvd("newX25519", signParams, ""));
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((X25519KeyPair) C54907xZt.OLrzqt(X25519KeyPair.Companion.serializer(), strEZpvd));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        return (X25519KeyPair) objM7377constructorimpl;
    }

    public final java.lang.String EZpvd(@NotNull SignParams signParams, @NotNull TonConnectProto tonConnectProto) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(tonConnectProto, "");
        return xYU.copydefault.EZpvd(InvokeMethodParams.Companion.EZpvd("encrypt", signParams, tonConnectProto));
    }

    public final java.lang.String AEQbTJ(@NotNull SignParams signParams, @NotNull TonConnectProto tonConnectProto) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(tonConnectProto, "");
        return xYU.copydefault.EZpvd(InvokeMethodParams.Companion.EZpvd("decrypt", signParams, tonConnectProto));
    }

    public final java.util.List<TonAddress> KWHzl(@NotNull SignParams signParams, @NotNull java.lang.String str) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strEZpvd = xYU.copydefault.EZpvd(InvokeMethodParams.Companion.EZpvd("addressStrings", signParams, str));
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((java.util.List) C54907xZt.OLrzqt(BuiltinSerializersKt.ListSerializer(TonAddress.Companion.serializer()), strEZpvd));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.util.List listAhwBna = yDY.AhwBna();
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = listAhwBna;
        }
        return (java.util.List) objM7377constructorimpl;
    }
}
