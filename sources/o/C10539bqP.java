package o;

import com.okinc.wallet.api.bean.AddressType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10539bqP implements java.util.Comparator<C19577gHn> {
    public static final C10539bqP AEQbTJ = new C10539bqP();

    private C10539bqP() {
    }

    /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
    @Override // java.util.Comparator
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public int compare(@NotNull C19577gHn c19577gHn, @NotNull C19577gHn c19577gHn2) {
        Intrinsics.checkNotNullParameter(c19577gHn, "");
        Intrinsics.checkNotNullParameter(c19577gHn2, "");
        return EZpvd(c19577gHn.EZpvd()) < EZpvd(c19577gHn2.EZpvd()) ? -1 : 1;
    }

    public final int EZpvd(int i) {
        if (i == AddressType.P2TRType.getValue()) {
            return 1;
        }
        if (i == AddressType.Legacy.getValue()) {
            return 2;
        }
        if (i == AddressType.P2SHType.getValue() || i == AddressType.P2SHCommonType.getValue()) {
            return 3;
        }
        return (i == AddressType.BCHPubKeyAddr.getValue() || i == AddressType.Bech32Type.getValue()) ? 4 : -1;
    }
}
