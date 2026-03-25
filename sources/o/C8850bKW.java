package o;

import com.google.gson.JsonObject;
import com.okinc.business.defi.api.model.tx.signdata.CosmosContractSignDirectData;
import com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.CosmosSignDocData;
import com.okinc.wallet.core.sign.cosmos.CosmosSignDocTransaction;
import com.okinc.wallet.core.sign.cosmos.CosmosSignedTx;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bKW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8850bKW extends AbstractC8849bKV {
    public final C8784bJJ OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8850bKW(@NotNull C8784bJJ c8784bJJ) {
        super(c8784bJJ);
        Intrinsics.checkNotNullParameter(c8784bJJ, "");
        this.OLrzqt = c8784bJJ;
    }

    public final CosmosSignedTx EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd(str, null);
    }

    public final CosmosSignedTx copydefault() {
        return EZpvd(null, AhwBna());
    }

    private final CosmosSignedTx EZpvd(java.lang.String str, java.lang.String str2) {
        return xYV.copydefault.OLrzqt(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), OLrzqt());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final CosmosSignDocTransaction OLrzqt() {
        CosmosContractSignDirectData.SignDoc sign_doc = ((CosmosContractSignDirectData) this.OLrzqt.QVsKAR()).getSign_doc();
        Intrinsics.copydefault(sign_doc);
        java.lang.Object objEZpvd = C33490mxT.EZpvd(C33490mxT.OLrzqt(sign_doc), (java.lang.Class<java.lang.Object>) CosmosSignDocTransaction.class);
        Intrinsics.copydefault(objEZpvd);
        return (CosmosSignDocTransaction) objEZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String KWHzl(@NotNull CosmosSignedTx cosmosSignedTx) {
        Intrinsics.checkNotNullParameter(cosmosSignedTx, "");
        JsonObject jsonObjectOLrzqt = OLrzqt(copydefault(((CosmosContractSignDirectData) this.OLrzqt.QVsKAR()).getSign_doc()));
        java.lang.String signature = cosmosSignedTx.getSignature();
        return copydefault(new CosmosSignDocData(jsonObjectOLrzqt, AEQbTJ(signature != null ? signature : "")));
    }
}
