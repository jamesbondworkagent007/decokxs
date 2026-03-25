package o;

import com.google.gson.JsonObject;
import com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosSignDocData;
import com.okinc.wallet.core.sign.cosmos.CosmosSignMessageTransaction;
import com.okinc.wallet.core.sign.cosmos.CosmosSignedTx;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bKO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8842bKO extends AbstractC8849bKV {
    public final C8745bIX KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8842bKO(@NotNull C8745bIX c8745bIX) {
        super(c8745bIX);
        Intrinsics.checkNotNullParameter(c8745bIX, "");
        this.KWHzl = c8745bIX;
    }

    public final CosmosSignedTx KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd(str, null);
    }

    public final CosmosSignedTx AEQbTJ() {
        return EZpvd(null, AhwBna());
    }

    public final CosmosSignedTx EZpvd(java.lang.String str, java.lang.String str2) {
        return xYV.copydefault.AEQbTJ(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), OLrzqt());
    }

    public final CosmosSignMessageTransaction OLrzqt() {
        java.lang.Object objEZpvd = C33490mxT.EZpvd(C33490mxT.OLrzqt(this.KWHzl.QVsKAR()), (java.lang.Class<java.lang.Object>) CosmosSignMessageTransaction.class);
        Intrinsics.copydefault(objEZpvd);
        return (CosmosSignMessageTransaction) objEZpvd;
    }

    public final java.lang.String KWHzl(@NotNull CosmosSignedTx cosmosSignedTx) {
        Intrinsics.checkNotNullParameter(cosmosSignedTx, "");
        JsonObject jsonObjectOLrzqt = OLrzqt(copydefault(this.KWHzl.QVsKAR()));
        java.lang.String signature = cosmosSignedTx.getSignature();
        return copydefault(new CosmosSignDocData(jsonObjectOLrzqt, AEQbTJ(signature != null ? signature : "")));
    }
}
