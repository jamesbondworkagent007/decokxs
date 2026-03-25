package o;

import com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventShareData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oQk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C36131oQk {
    public static final java.lang.CharSequence copydefault(@NotNull MarketEventShareData marketEventShareData) {
        Intrinsics.checkNotNullParameter(marketEventShareData, "");
        return marketEventShareData.getDesc();
    }

    public static final java.lang.CharSequence KWHzl(@NotNull MarketEventShareData marketEventShareData) {
        Intrinsics.checkNotNullParameter(marketEventShareData, "");
        if (C33129mqd.OLrzqt((java.lang.CharSequence) marketEventShareData.getAddress()) && C33129mqd.OLrzqt((java.lang.CharSequence) marketEventShareData.getTitle())) {
            java.lang.String title = marketEventShareData.getTitle();
            java.lang.String address = marketEventShareData.getAddress();
            Intrinsics.copydefault((java.lang.Object) address);
            return C33061mpO.setupSpanStyles$default(title, new java.lang.String[]{address}, 0, null, false, new Function1() { // from class: o.oQl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C36131oQk.AEQbTJ((java.util.List) obj);
                }
            }, 14, null);
        }
        return marketEventShareData.getTitle();
    }

    public static final Unit AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.UnderlineSpan());
        return Unit.INSTANCE;
    }
}
