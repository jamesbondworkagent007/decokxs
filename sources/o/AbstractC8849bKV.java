package o;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.okinc.business.defi.biz.core.transaction.sign.OKWBaseTransaction;
import com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosPubKey;
import com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosSignature;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bKV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8849bKV extends AbstractC12442cmy {
    public final OKWBaseTransaction<?> EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8849bKV(@NotNull OKWBaseTransaction<?> oKWBaseTransaction) {
        super(oKWBaseTransaction);
        Intrinsics.checkNotNullParameter(oKWBaseTransaction, "");
        this.EZpvd = oKWBaseTransaction;
    }

    public final CosmosSignature AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        xYW xyw = xYW.AEQbTJ;
        return new CosmosSignature(new CosmosPubKey("tendermint/PubKeySecp256k1", xyw.fetchVPNInfo(xyw.AEQbTJ(this.EZpvd.fERRXa().getPublicKey()))), str);
    }

    public final java.lang.String copydefault(java.lang.Object obj) {
        java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(obj);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public final JsonObject OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C33490mxT.OLrzqt(str);
    }
}
