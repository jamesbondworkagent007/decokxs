package o;

import com.okinc.wallet.core.sign.RawData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.SignatureRawValue;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.UnsignedTx;
import com.okinc.wallet.core.sign.cosmos.RSVSignatureRawValue;
import com.okinc.wallet.core.sign.tron.BaseTronTransaction;
import com.okinc.wallet.core.sign.tron.SignedTransaction;
import com.okinc.wallet.core.sign.tron.TronGenerateUnsignedContract;
import com.okinc.wallet.core.sign.tron.TronSignContract;
import com.okinc.wallet.core.sign.tron.TronSignData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xZo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54902xZo {
    public static final C54902xZo KWHzl = new C54902xZo();

    private C54902xZo() {
    }

    public final java.lang.String OLrzqt(@NotNull SignParams signParams, @NotNull BaseTronTransaction baseTronTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(baseTronTransaction, "");
        return xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, baseTronTransaction));
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xXV.KWHzl.AEQbTJ(str, str2, z, i);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return xXV.KWHzl.OLrzqt(str, z, i);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return xXV.KWHzl.EZpvd(str, str2, str3);
    }

    public final TxMessage AEQbTJ(@NotNull TronGenerateUnsignedContract tronGenerateUnsignedContract) {
        Intrinsics.checkNotNullParameter(tronGenerateUnsignedContract, "");
        return xXV.KWHzl.AEQbTJ(tronGenerateUnsignedContract);
    }

    public final TxMessage KWHzl(@NotNull TronSignData tronSignData, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(tronSignData, "");
        Intrinsics.checkNotNullParameter(str, "");
        return xXV.KWHzl.copydefault(tronSignData, str);
    }

    public final java.lang.String AEQbTJ(@NotNull TronSignContract tronSignContract) {
        Intrinsics.checkNotNullParameter(tronSignContract, "");
        return xXV.KWHzl.AEQbTJ(tronSignContract);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull TronSignData tronSignData, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tronSignData, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xXV.KWHzl.AEQbTJ(str, tronSignData, str2);
    }

    public final java.lang.String KWHzl(long j, java.lang.String str, @NotNull BaseTronTransaction baseTronTransaction) {
        Intrinsics.checkNotNullParameter(baseTronTransaction, "");
        return xYU.copydefault.KWHzl(new UnsignedTx(j, 0L, str, baseTronTransaction, 0, false, 50, null));
    }

    public final java.lang.String OLrzqt(long j, @NotNull SignatureRawValue signatureRawValue) {
        Intrinsics.checkNotNullParameter(signatureRawValue, "");
        return xYU.copydefault.copydefault(new RawData(j, 0L, signatureRawValue, false, 0, 26, null));
    }

    public final TxMessage EZpvd(long j, java.lang.String str, @NotNull BaseTronTransaction baseTronTransaction) {
        Intrinsics.checkNotNullParameter(baseTronTransaction, "");
        return xYU.copydefault.AEQbTJ(new UnsignedTx(j, 0L, str, baseTronTransaction, 0, false, 50, null));
    }

    public final SignedTransaction EZpvd(long j, @NotNull RSVSignatureRawValue rSVSignatureRawValue) {
        Intrinsics.checkNotNullParameter(rSVSignatureRawValue, "");
        return (SignedTransaction) C54907xZt.OLrzqt(SignedTransaction.Companion.serializer(), xYU.copydefault.AEQbTJ(new RawData(j, 0L, rSVSignatureRawValue, false, 0, 26, null)));
    }
}
