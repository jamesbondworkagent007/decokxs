package o;

import com.google.gson.Gson;
import com.okinc.wallet.core.sign.SignedTx;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bYV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9591bYV {
    public static final C9591bYV KWHzl = new C9591bYV();

    private C9591bYV() {
    }

    public final SignedTx KWHzl(@NotNull SignedTx signedTx, @NotNull SignedTx signedTx2) {
        Intrinsics.checkNotNullParameter(signedTx, "");
        Intrinsics.checkNotNullParameter(signedTx2, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String tx = signedTx.getTx();
        if (tx == null) {
            return null;
        }
        arrayList.add(tx);
        java.lang.String tx2 = signedTx2.getTx();
        if (tx2 == null) {
            return null;
        }
        arrayList.add(tx2);
        signedTx.setTx(new Gson().toJson(arrayList));
        return signedTx;
    }
}
