package o;

import com.okinc.business.defi.biz.core.transaction.sign.cosmos.bean.SignType;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.cosmos.CosmosSignMessageTransaction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bKU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8848bKU extends AbstractC8849bKV {
    public final C8857bKd KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8848bKU(@NotNull C8857bKd c8857bKd) {
        super(c8857bKd);
        Intrinsics.checkNotNullParameter(c8857bKd, "");
        this.KWHzl = c8857bKd;
    }

    public final java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xYV.copydefault.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), KWHzl());
    }

    private final CosmosSignMessageTransaction KWHzl() {
        java.lang.Object objEZpvd = C33490mxT.EZpvd(C33490mxT.OLrzqt(this.KWHzl.OLrzqt()), (java.lang.Class<java.lang.Object>) CosmosSignMessageTransaction.class);
        Intrinsics.copydefault(objEZpvd);
        return (CosmosSignMessageTransaction) objEZpvd;
    }

    public final TxMessage AEQbTJ() {
        return xYV.copydefault.AEQbTJ(this.KWHzl.fERRXa().getPublicKey(), KWHzl(), SignType.SignTypeAminoMsg.getType());
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(AEQbTJ(str));
    }
}
