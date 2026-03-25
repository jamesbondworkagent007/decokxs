package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qDE extends C40512qYp {
    public qDE(final java.lang.String str, @NotNull qDN qdn) {
        Intrinsics.checkNotNullParameter(qdn, "");
        register(C39994qFk.class, new qDB(str, qdn));
        register(C27622jyf.class, new C27956kJo(new Function1() { // from class: o.qDC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return qDE.OLrzqt(str, (android.view.View) obj);
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(java.lang.String str, android.view.View view) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(view, "");
        android.content.Intent intent = new android.content.Intent(view.getContext(), (java.lang.Class<?>) ActivityC34993nmt.class);
        if (str == null) {
            str2 = "RANKING_HOT_CRYPTO";
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -1001959400) {
                if (iHashCode != 629738236) {
                    if (iHashCode == 1297255772 && str.equals("most_buyers")) {
                        str2 = "RANKING_MOST_BUYERS";
                    }
                } else if (str.equals("popular_searches")) {
                    str2 = "RANKING_POPULAR_SEARCHES";
                }
            } else if (str.equals("most_sellers")) {
                str2 = "RANKING_MOST_SELLERS";
            }
        }
        intent.putExtra("ranking_tab_key", str2);
        view.getContext().startActivity(intent);
        qHN qhnOLrzqt = qHO.OLrzqt(view);
        if (qhnOLrzqt != null) {
            qhnOLrzqt.djBIcL(str);
        }
        return Unit.INSTANCE;
    }
}
