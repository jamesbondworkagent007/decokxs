package o;

import com.okinc.business.defi.wallet.imported.WalletAddressSelectUtilsKt$splitAddress$1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fhO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18382fhO {
    public static final Sequence<java.lang.String> OLrzqt(@NotNull java.lang.CharSequence charSequence, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return OLrzqt(charSequence, java.lang.Integer.valueOf(i));
    }

    public static /* synthetic */ Sequence splitIntoAddressWords$default(java.lang.CharSequence charSequence, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 100;
        }
        return OLrzqt(charSequence, i);
    }

    public static final Sequence<java.lang.String> OLrzqt(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "");
        return splitAddress$default(charSequence, null, 1, null);
    }

    public static final Sequence<java.lang.String> OLrzqt(java.lang.CharSequence charSequence, java.lang.Integer num) {
        Sequence<java.lang.String> sequenceDbNXlk = C59467zhb.DbNXlk(C14722dqn.OLrzqt.EZpvd().splitToSequence(StringsKt__StringsKt.hDKMBd(charSequence), 0), WalletAddressSelectUtilsKt$splitAddress$1.INSTANCE);
        return num != null ? C59467zhb.AYXKKw(sequenceDbNXlk, num.intValue()) : sequenceDbNXlk;
    }

    public static /* synthetic */ Sequence splitAddress$default(java.lang.CharSequence charSequence, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return OLrzqt(charSequence, num);
    }
}
