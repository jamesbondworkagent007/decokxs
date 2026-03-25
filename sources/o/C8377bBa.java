package o;

import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.wallet.core.sign.SignatureRawValue;
import com.okinc.wallet.core.sign.cosmos.CosmosIBCTransaction;
import com.okinc.wallet.core.sign.cosmos.CosmosSignatureRawValue;
import com.okinc.wallet.core.sign.cosmos.CosmosSignedTx;
import com.okinc.wallet.core.sign.cosmos.CosmosTransaction;
import com.okinc.wallet.core.sign.evm.EvmSignatureRawValue;
import com.okinc.wallet.core.sign.solana.SolanaTokenTransaction;
import com.okinc.wallet.core.sign.solana.SolanaTransaction;
import com.okinc.wallet.core.sign.tron.TronTokenTransaction;
import com.okinc.wallet.core.sign.tron.TronTransaction;
import com.okinc.wallet.core.sign.utxo.DummyInfo;
import com.okinc.wallet.core.sign.utxo.UTXOTransaction;
import com.okinc.wallet.core.sign.utxo.UTXOTxIn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bBa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8377bBa {
    public static final C8377bBa AEQbTJ = new C8377bBa();

    private C8377bBa() {
    }

    public final java.lang.String EZpvd(int i, long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return xYZ.KWHzl.AEQbTJ(j, new EvmSignatureRawValue(i, str, str3, str4, str5, str2));
    }

    public final java.lang.String KWHzl(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, java.lang.String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return C54902xZo.KWHzl.KWHzl(j, null, new TronTransaction(str, str2, str3, str4, str5, str6, str7, str8, str9, str10));
    }

    public final java.lang.String KWHzl(long j, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, java.lang.String str14, @NotNull java.lang.String str15) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str15, "");
        return C54902xZo.KWHzl.KWHzl(j, str, new TronTokenTransaction(str2, str3, str4, str5, str6, str7, str8, str9, str10, str13, str11, str12, str14, str15));
    }

    public final java.lang.String KWHzl(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C54902xZo.KWHzl.OLrzqt(j, new SignatureRawValue(str, str2));
    }

    public final java.lang.String AEQbTJ(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return C54892xZe.KWHzl.EZpvd(j, new SolanaTransaction(str, str2, str3, str4, str5, str6));
    }

    public final java.lang.String KWHzl(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, java.lang.String str8, @NotNull java.lang.String str9, java.lang.String str10, boolean z, java.lang.String str11, java.lang.String str12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return C54892xZe.KWHzl.OLrzqt(j, str2, new SolanaTokenTransaction(str, str3, str2, str4, str5, str6, str7, str8, str9, str10, z, str11, str12));
    }

    public final java.lang.String AEQbTJ(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return xYV.copydefault.EZpvd(j, new CosmosTransaction(str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, ExtJson.BRC20TYPE_TRANSFER, str));
    }

    public final java.lang.String copydefault(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9, @NotNull java.lang.String str10, @NotNull java.lang.String str11, @NotNull java.lang.String str12, @NotNull java.lang.String str13, @NotNull java.lang.String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        return xYV.copydefault.EZpvd(j, new CosmosIBCTransaction(str2, str3, str4, str5, ExtJson.BRC20TYPE_TRANSFER, str6, str7, str8, str9, str10, str11, str12, str13, str14, "ibcTransfer", str));
    }

    public final CosmosSignedTx copydefault(long j, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return xYV.copydefault.AEQbTJ(j, new CosmosSignatureRawValue(str, str2, str3));
    }

    public final java.lang.String EZpvd(long j, java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.util.List<UTXOTxIn> list, int i, java.lang.String str8) {
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        return C54904xZq.copydefault.EZpvd(j, str, i, new UTXOTransaction(str2, str3, str4, str5, str6, str7, list, str8, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (DummyInfo) null, (java.lang.String) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.Boolean) null, (java.util.List) null, (java.lang.String) null, (java.lang.Integer) null, 524032, (DefaultConstructorMarker) null));
    }

    public final java.lang.String OLrzqt(@NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        return C54904xZq.copydefault.KWHzl(uTXOTransaction);
    }
}
