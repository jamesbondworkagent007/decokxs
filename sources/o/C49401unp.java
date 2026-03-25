package o;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49401unp {
    public static final C49401unp OLrzqt = new C49401unp();
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.unn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C49401unp.copydefault();
        }
    });
    public static final int copydefault = 8;

    private C49401unp() {
    }

    public static final Gson copydefault() {
        return new Gson();
    }

    public final Gson EZpvd() {
        return (Gson) EZpvd.getValue();
    }

    public static /* synthetic */ void onEvent$default(C49401unp c49401unp, java.util.Map map, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = "OKTrade-Track-Report";
        }
        c49401unp.KWHzl(map, str);
    }

    public final void KWHzl(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "OKTrade-Track-Report")) {
            xHZ.KWHzl.AEQbTJ(map);
        }
        java.lang.String string = JsonParser.parseString(EZpvd().toJson(map)).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        pUU.KWHzl(str, string);
    }
}
