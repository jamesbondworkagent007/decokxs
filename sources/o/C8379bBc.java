package o;

import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.evm.AccountTokenTransaction;
import com.okinc.wallet.core.sign.evm.AccountTransaction;
import com.okinc.wallet.core.sign.evm.EvmSignatureRawValue;
import com.okinc.wallet.core.sign.utxo.BTCSignatureRawValue;
import com.okinc.wallet.core.sign.utxo.DummyInfo;
import com.okinc.wallet.core.sign.utxo.RSV;
import com.okinc.wallet.core.sign.utxo.UTXOTransaction;
import com.okinc.wallet.core.sign.utxo.UTXOTxIn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bBc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8379bBc {
    public static final C8379bBc AEQbTJ = new C8379bBc();

    private C8379bBc() {
    }

    public final TxMessage copydefault(long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return xYZ.KWHzl.copydefault(j, j2, null, new AccountTransaction(str2, str, str4, str5, str3, null, i, str6, str7, str8, str9));
    }

    public final TxMessage OLrzqt(long j, long j2, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, int i, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.Boolean bool) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return xYZ.KWHzl.copydefault(j, j2, str, new AccountTokenTransaction(str3, str2, str5, str6, Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) ? str4 : "0", i, str9, str10, str11, (java.lang.String) null, str7, str4, str8, 512, (DefaultConstructorMarker) null));
    }

    public final java.lang.String OLrzqt(int i, long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return xYZ.KWHzl.EZpvd(j, new EvmSignatureRawValue(i, str, str3, str4, str5, str2));
    }

    public final TxMessage KWHzl(long j, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.util.List<UTXOTxIn> list, int i, java.lang.String str9) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list, "");
        return C54904xZq.copydefault.AEQbTJ(j, str, i, new UTXOTransaction(str3, str4, str5, str6, str7, str8, list, str2, str9, (java.lang.String) null, (java.lang.String) null, (DummyInfo) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.lang.String) null, (java.lang.Integer) null, 523776, (DefaultConstructorMarker) null));
    }

    public final java.lang.String copydefault(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.util.List<RSV> list, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return C54904xZq.copydefault.OLrzqt(j, i, new BTCSignatureRawValue(str, str2, list));
    }
}
