package o;

import com.google.gson.GsonBuilder;
import com.okinc.business.defi.api.bean.RawData;
import com.okinc.business.defi.api.bean.TronSignMethodVersion;
import com.okinc.business.defi.api.bean.TrxDappSignData;
import com.okinc.business.defi.api.model.tx.signdata.TronMessageSignData;
import com.okinc.wallet.core.sign.utxo.RSV;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ceU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11988ceU extends AbstractC12442cmy {
    public final C11999cef OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11988ceU(@NotNull C11999cef c11999cef) {
        super(c11999cef);
        Intrinsics.checkNotNullParameter(c11999cef, "");
        this.OLrzqt = c11999cef;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54902xZo c54902xZo = C54902xZo.KWHzl;
        java.lang.String data = ((TronMessageSignData) this.OLrzqt.QVsKAR()).getData();
        boolean addPrefix = ((TronMessageSignData) this.OLrzqt.QVsKAR()).getAddPrefix();
        TronSignMethodVersion version = ((TronMessageSignData) this.OLrzqt.QVsKAR()).getVersion();
        if (version == null) {
            version = TronSignMethodVersion.V1;
        }
        return c54902xZo.KWHzl(str, data, addPrefix, version.getVersion());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: SignData */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: SignData */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String EZpvd() {
        C54902xZo c54902xZo = C54902xZo.KWHzl;
        java.lang.String data = ((TronMessageSignData) this.OLrzqt.QVsKAR()).getData();
        boolean addPrefix = ((TronMessageSignData) this.OLrzqt.QVsKAR()).getAddPrefix();
        TronSignMethodVersion version = ((TronMessageSignData) this.OLrzqt.QVsKAR()).getVersion();
        if (version == null) {
            version = TronSignMethodVersion.V1;
        }
        return c54902xZo.OLrzqt(data, addPrefix, version.getVersion());
    }

    public final java.lang.String KWHzl(@NotNull RSV rsv) {
        Intrinsics.checkNotNullParameter(rsv, "");
        return C54902xZo.KWHzl.AEQbTJ(rsv.getR(), rsv.getS(), rsv.getV());
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!this.OLrzqt.djBIcL()) {
            str = C54910xZw.OLrzqt(str);
        }
        TrxDappSignData trxDappSignDataValueOf = this.OLrzqt.valueOf();
        if (trxDappSignDataValueOf == null) {
            trxDappSignDataValueOf = new TrxDappSignData((RawData) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.Boolean) null, 31, (DefaultConstructorMarker) null);
        }
        trxDappSignDataValueOf.setSignature(C56402yEa.EZpvd(str));
        java.lang.String json = new GsonBuilder().disableHtmlEscaping().create().toJson(trxDappSignDataValueOf);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }
}
