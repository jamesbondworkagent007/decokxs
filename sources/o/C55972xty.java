package o;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.okinc.unify_trade.biz.SignalEventDetail;
import com.okinc.unify_trade.bot.data.HistoryEventCard;
import java.util.Date;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xty, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C55972xty implements InterfaceC54501xKt<java.util.List<? extends SignalEventDetail>, java.util.List<? extends HistoryEventCard>> {
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.xtB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C55972xty.OLrzqt();
        }
    });
    public java.lang.String copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    public static final Gson OLrzqt() {
        return new GsonBuilder().setPrettyPrinting().serializeNulls().create();
    }

    public final Gson KWHzl() {
        return (Gson) this.KWHzl.getValue();
    }

    /* JADX INFO: renamed from: o.xty$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xty.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;)Ljava/lang/Object; */
    /* JADX WARN: Can't wrap try/catch for region: R(19:5|(1:7)|8|(1:29)(2:10|(2:12|(3:14|(2:20|28)|29)(3:21|(2:24|28)|29))(3:25|(2:27|28)|29))|30|(1:32)(2:33|(1:35)(12:37|38|(1:40)(1:41)|42|(1:44)(1:45)|69|46|(1:48)(1:49)|50|53|(2:58|72)(2:57|73)|59))|36|38|(0)(0)|42|(0)(0)|69|46|(0)(0)|50|53|(3:55|58|72)(0)|59|3) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
    
        r0.printStackTrace();
        o.pUU.copydefault("SignalHistoryEventDataMapper", "parse string " + r14 + " failed cause by " + kotlin.Unit.INSTANCE);
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4 A[Catch: Exception -> 0x00d2, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d2, blocks: (B:46:0x00bc, B:49:0x00c4), top: B:69:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    @Override // o.InterfaceC54501xKt
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.List<HistoryEventCard> KWHzl(@NotNull java.util.List<SignalEventDetail> list) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String strAYXKKw;
        java.util.List<java.lang.String> orderData;
        java.lang.String strAYXKKw2;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            SignalEventDetail signalEventDetail = (SignalEventDetail) obj;
            java.lang.String eventType = signalEventDetail.getEventType();
            if (eventType == null) {
                str = "";
            } else {
                int iHashCode = eventType.hashCode();
                if (iHashCode == -1415251061) {
                    if (eventType.equals("Signal Processing")) {
                        strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.IIEbr);
                        str = strAYXKKw2;
                    }
                    str = "";
                } else if (iHashCode != -7420885) {
                    if (iHashCode == 1454476615 && eventType.equals("System Action")) {
                        strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.OfWYUE);
                        str = strAYXKKw2;
                    }
                    str = "";
                } else {
                    if (eventType.equals("User Action")) {
                        strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.ZGRCNj);
                        str = strAYXKKw2;
                    }
                    str = "";
                }
            }
            java.lang.String eventStatus = signalEventDetail.getEventStatus();
            if (Intrinsics.EZpvd((java.lang.Object) eventStatus, (java.lang.Object) "SUCCESS")) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ArkbYM);
            } else if (Intrinsics.EZpvd((java.lang.Object) eventStatus, (java.lang.Object) "FAILURE")) {
                strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.GVpNrs);
            } else {
                str2 = "";
                java.lang.String simpleDateTime$default = pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(signalEventDetail.getEventCtime())), null, 1, null);
                java.lang.String eventProcessMessage = signalEventDetail.getEventProcessMessage();
                java.lang.String str3 = eventProcessMessage != null ? "" : eventProcessMessage;
                java.lang.String alertMessage = signalEventDetail.getAlertMessage();
                java.lang.String json = alertMessage != null ? "" : alertMessage;
                json = !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) json) ? "" : KWHzl().toJson(JsonParser.parseString(json));
                arrayList.add(new HistoryEventCard(str, str2, simpleDateTime$default, str3, json, (C33129mqd.KWHzl((java.util.Collection) signalEventDetail.getOrderData()) || (orderData = signalEventDetail.getOrderData()) == null) ? null : CollectionsKt___CollectionsKt.joinToString$default(orderData, ",", null, null, 0, null, null, 62, null), signalEventDetail.getHistoryEventExtData(), C33129mqd.gEmmrt(C33129mqd.addS$default(java.lang.Integer.valueOf(i), 1, null, null, null, 14, null), java.lang.Integer.valueOf(size))));
                i++;
            }
            str2 = strAYXKKw;
            java.lang.String simpleDateTime$default2 = pTA.formatSimpleDateTime$default(new Date(C33129mqd.valueOf(signalEventDetail.getEventCtime())), null, 1, null);
            java.lang.String eventProcessMessage2 = signalEventDetail.getEventProcessMessage();
            if (eventProcessMessage2 != null) {
            }
            java.lang.String alertMessage2 = signalEventDetail.getAlertMessage();
            if (alertMessage2 != null) {
            }
            json = !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) json) ? "" : KWHzl().toJson(JsonParser.parseString(json));
            arrayList.add(new HistoryEventCard(str, str2, simpleDateTime$default2, str3, json, (C33129mqd.KWHzl((java.util.Collection) signalEventDetail.getOrderData()) || (orderData = signalEventDetail.getOrderData()) == null) ? null : CollectionsKt___CollectionsKt.joinToString$default(orderData, ",", null, null, 0, null, null, 62, null), signalEventDetail.getHistoryEventExtData(), C33129mqd.gEmmrt(C33129mqd.addS$default(java.lang.Integer.valueOf(i), 1, null, null, null, 14, null), java.lang.Integer.valueOf(size))));
            i++;
        }
        if (C33129mqd.KWHzl((java.util.Collection) list)) {
            SignalEventDetail signalEventDetail2 = (SignalEventDetail) CollectionsKt___CollectionsKt.wlaJM(list);
            this.copydefault = signalEventDetail2 != null ? signalEventDetail2.getEventCtime() : null;
        }
        return arrayList;
    }
}
