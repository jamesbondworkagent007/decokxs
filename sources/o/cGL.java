package o;

import com.okinc.business.defi.biz.database.addressbook.entity.SendCoinRecordEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cGL {
    public static final cGL KWHzl = new cGL();
    public static final C11256cHm EZpvd = new C11256cHm(C9678baC.Companion.AEQbTJ());
    public static final int copydefault = 8;

    private cGL() {
    }

    public final AbstractC58260yxt<java.util.List<SendCoinRecordEntity>> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C11607cUn.valueOf(EZpvd.OLrzqt(str, str2));
    }

    public final AbstractC58260yxt<java.util.List<SendCoinRecordEntity>> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C11607cUn.valueOf(EZpvd.KWHzl(str, str2));
    }

    public final AbstractC58260yxt<java.lang.Long> KWHzl(@NotNull SendCoinRecordEntity sendCoinRecordEntity) {
        Intrinsics.checkNotNullParameter(sendCoinRecordEntity, "");
        return C11607cUn.valueOf(EZpvd.OLrzqt(sendCoinRecordEntity));
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> copydefault(@NotNull java.util.List<SendCoinRecordEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return C11607cUn.valueOf(EZpvd.AEQbTJ(list));
    }

    public final AbstractC58260yxt<java.util.List<SendCoinRecordEntity>> AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C11607cUn.valueOf(EZpvd.AEQbTJ(str, str2));
    }

    public final AbstractC58260yxt<java.util.List<SendCoinRecordEntity>> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C11607cUn.valueOf(EZpvd.copydefault(str, str2));
    }
}
