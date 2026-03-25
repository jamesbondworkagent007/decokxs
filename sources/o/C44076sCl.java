package o;

import com.okinc.okex.uploadlog.bean.enums.TicketStatus;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sCl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44076sCl extends C6984aZg<TicketStatus> {
    public C44076sCl() {
        super("TicketStatus", new Function1() { // from class: o.sCk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44076sCl.copydefault((TicketStatus) obj);
            }
        }, new Function1() { // from class: o.sCm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44076sCl.KWHzl((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String copydefault(TicketStatus ticketStatus) {
        Intrinsics.checkNotNullParameter(ticketStatus, "");
        return ticketStatus.getValue();
    }

    public static final TicketStatus KWHzl(java.lang.String str) {
        TicketStatus ticketStatus;
        Intrinsics.checkNotNullParameter(str, "");
        TicketStatus[] ticketStatusArrValues = TicketStatus.values();
        int length = ticketStatusArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ticketStatus = null;
                break;
            }
            ticketStatus = ticketStatusArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) ticketStatus.getValue(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return ticketStatus == null ? TicketStatus.New : ticketStatus;
    }
}
