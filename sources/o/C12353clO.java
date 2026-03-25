package o;

import com.okinc.business.defi.biz.core.transaction.sign.utxo.bean.UTXOSignInfo;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.clO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12353clO extends C11990ceW {
    public final C12317ckf DbNXlk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12353clO(@NotNull C12317ckf c12317ckf) {
        super(c12317ckf);
        Intrinsics.checkNotNullParameter(c12317ckf, "");
        this.DbNXlk = c12317ckf;
    }

    @Override // o.C11990ceW
    public java.lang.String copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String strCopydefault = super.copydefault(str);
        UTXOSignInfo uTXOSignInfoUeEOUB = this.DbNXlk.UeEOUB();
        return C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(strCopydefault, uTXOSignInfoUeEOUB != null ? uTXOSignInfoUeEOUB.getMinOutput() : null), false, RoundingMode.UP, 1, (java.lang.Object) null);
    }
}
