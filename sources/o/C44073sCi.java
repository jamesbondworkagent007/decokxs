package o;

import com.okinc.okex.uploadlog.bean.enums.TicketChannel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sCi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44073sCi extends C6984aZg<TicketChannel> {
    public C44073sCi() {
        super("TicketChannel", new Function1() { // from class: o.sCh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44073sCi.KWHzl((TicketChannel) obj);
            }
        }, new Function1() { // from class: o.sCg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44073sCi.KWHzl((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String KWHzl(TicketChannel ticketChannel) {
        Intrinsics.checkNotNullParameter(ticketChannel, "");
        return ticketChannel.getValue();
    }

    public static final TicketChannel KWHzl(java.lang.String str) {
        TicketChannel ticketChannel;
        Intrinsics.checkNotNullParameter(str, "");
        TicketChannel[] ticketChannelArrValues = TicketChannel.values();
        int length = ticketChannelArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ticketChannel = null;
                break;
            }
            ticketChannel = ticketChannelArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) ticketChannel.getValue(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return ticketChannel == null ? TicketChannel.UserTicket : ticketChannel;
    }
}
