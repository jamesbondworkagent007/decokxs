package o;

import com.okinc.okimcore.feature.conversation.repository.remote.inhouseim.InHouseIMConversationService;
import com.okinc.okimcore.feature.message.MessageDownloadScheduler$downloadRemainingMessages$1;
import com.okinc.okimcore.feature.message.MessageDownloadScheduler$internalScheduleDownload$1;
import com.okinc.okimcore.feature.message.MessageDownloadScheduler$internalScheduleDownload$5;
import com.okinc.okimcore.feature.message.MessageDownloadScheduler$scheduleDownload$1;
import com.okinc.okimcore.feature.message.MessageDownloadScheduler$scheduleDownloadByBatch$1;
import com.okinc.okimcore.feature.message.MessageDownloadScheduler$scheduleDownloadByBatch$messages$1;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.inhouseim.ws.WSMessageListResponse;
import com.okinc.okimcore.model.im.inhouseim.ws.WSSendMessageDetailData;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMMessageWithReactions;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import o.sFA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class sJY {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final InHouseIMConversationService AEQbTJ;
    public final sJW AYXKKw;
    public final C44272sJr AhwBna;
    public final C44484sRn EZpvd;
    public final C44485sRo KWHzl;
    public final CoroutineScope OLrzqt;
    public final sMF djBIcL;
    public final InterfaceC44293sKl fetchVPNInfo;
    public final sJZ gEmmrt;
    public final C44486sRp valueOf;
    public final C44489sRs values;

    public sJY(@NotNull InterfaceC44293sKl interfaceC44293sKl, @NotNull CoroutineScope coroutineScope, @NotNull C44486sRp c44486sRp, @NotNull C44489sRs c44489sRs, @NotNull C44485sRo c44485sRo, @NotNull C44484sRn c44484sRn, @NotNull InHouseIMConversationService inHouseIMConversationService, @NotNull sJW sjw, @NotNull sJZ sjz, @NotNull sMF smf, @NotNull C44272sJr c44272sJr) {
        Intrinsics.checkNotNullParameter(interfaceC44293sKl, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(c44486sRp, "");
        Intrinsics.checkNotNullParameter(c44489sRs, "");
        Intrinsics.checkNotNullParameter(c44485sRo, "");
        Intrinsics.checkNotNullParameter(c44484sRn, "");
        Intrinsics.checkNotNullParameter(inHouseIMConversationService, "");
        Intrinsics.checkNotNullParameter(sjw, "");
        Intrinsics.checkNotNullParameter(sjz, "");
        Intrinsics.checkNotNullParameter(smf, "");
        Intrinsics.checkNotNullParameter(c44272sJr, "");
        this.fetchVPNInfo = interfaceC44293sKl;
        this.OLrzqt = coroutineScope;
        this.valueOf = c44486sRp;
        this.values = c44489sRs;
        this.KWHzl = c44485sRo;
        this.EZpvd = c44484sRn;
        this.AEQbTJ = inHouseIMConversationService;
        this.AYXKKw = sjw;
        this.gEmmrt = sjz;
        this.djBIcL = smf;
        this.AhwBna = c44272sJr;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sJY.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final void OLrzqt(@NotNull java.lang.String str, long j, java.lang.Long l, long j2, boolean z, long j3) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, null, null, new MessageDownloadScheduler$scheduleDownload$1(this, str, j, l, j2, z, j3, null), 3, null);
    }

    public final void OLrzqt(@NotNull java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(this.OLrzqt, null, null, new MessageDownloadScheduler$downloadRemainingMessages$1(this, str, j, null), 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [113=4] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0413 A[LOOP:1: B:108:0x040d->B:110:0x0413, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x049c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0381  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x030e -> B:133:0x0324). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(java.lang.String str, long j, long j2, long j3, long j4, boolean z, long j5, Continuation<? super Unit> continuation) throws java.lang.Exception {
        MessageDownloadScheduler$internalScheduleDownload$1 messageDownloadScheduler$internalScheduleDownload$1;
        java.lang.String str2;
        long j6;
        java.lang.String str3;
        int i;
        java.lang.String str4;
        sJY sjy;
        java.lang.String str5;
        boolean z2;
        MessageDownloadScheduler$internalScheduleDownload$1 messageDownloadScheduler$internalScheduleDownload$12;
        java.lang.Object obj;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        java.lang.String str6;
        boolean z3;
        java.lang.String str7;
        java.lang.String str8;
        long j12;
        sJY sjy2;
        long j13;
        java.lang.String str9;
        long j14;
        java.util.List list;
        java.lang.String str10;
        java.util.Iterator it;
        java.util.List list2;
        java.lang.Long lKWHzl;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.Throwable th;
        java.lang.String str14;
        long j15;
        long j16;
        java.lang.String str15;
        java.lang.String str16;
        boolean z4;
        java.lang.String str17;
        sJY sjy3;
        java.lang.String str18;
        java.lang.Object obj2;
        long j17;
        long j18;
        long j19;
        long j20;
        java.util.Iterator it2;
        java.util.Iterator it3;
        java.lang.String str19;
        java.lang.Object objWithContext;
        java.lang.Object obj3;
        sJY sjy4;
        long j21;
        boolean z5;
        long j22;
        java.util.List list3;
        MessageDownloadScheduler$internalScheduleDownload$1 messageDownloadScheduler$internalScheduleDownload$13;
        long j23;
        long j24;
        long j25;
        java.lang.String str20;
        if (continuation instanceof MessageDownloadScheduler$internalScheduleDownload$1) {
            messageDownloadScheduler$internalScheduleDownload$1 = (MessageDownloadScheduler$internalScheduleDownload$1) continuation;
            int i2 = messageDownloadScheduler$internalScheduleDownload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messageDownloadScheduler$internalScheduleDownload$1.label = i2 - Integer.MIN_VALUE;
            } else {
                messageDownloadScheduler$internalScheduleDownload$1 = new MessageDownloadScheduler$internalScheduleDownload$1(this, continuation);
            }
        }
        MessageDownloadScheduler$internalScheduleDownload$1 messageDownloadScheduler$internalScheduleDownload$14 = messageDownloadScheduler$internalScheduleDownload$1;
        java.lang.Object obj4 = messageDownloadScheduler$internalScheduleDownload$14.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = messageDownloadScheduler$internalScheduleDownload$14.label;
        java.lang.String str21 = "MessageDownloadScheduler";
        java.lang.String str22 = " ";
        if (i3 == 0) {
            str2 = "internalScheduleDownload: [";
            C56391yDq.AEQbTJ(obj4);
            if (j2 < j3 || j3 < 0) {
                return Unit.INSTANCE;
            }
            long jMax = java.lang.Math.max(j5, j3);
            C44486sRp c44486sRp = this.valueOf;
            messageDownloadScheduler$internalScheduleDownload$14.L$0 = this;
            messageDownloadScheduler$internalScheduleDownload$14.L$1 = str;
            j6 = j;
            messageDownloadScheduler$internalScheduleDownload$14.J$0 = j6;
            messageDownloadScheduler$internalScheduleDownload$14.J$1 = j2;
            messageDownloadScheduler$internalScheduleDownload$14.J$2 = j4;
            messageDownloadScheduler$internalScheduleDownload$14.Z$0 = z;
            messageDownloadScheduler$internalScheduleDownload$14.J$3 = j5;
            messageDownloadScheduler$internalScheduleDownload$14.J$4 = jMax;
            messageDownloadScheduler$internalScheduleDownload$14.label = 1;
            str3 = " ";
            i = 10;
            str4 = "MessageDownloadScheduler";
            java.lang.Object objOLrzqt = c44486sRp.OLrzqt(str, jMax, j2, messageDownloadScheduler$internalScheduleDownload$14);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            sjy = this;
            str5 = str;
            z2 = z;
            messageDownloadScheduler$internalScheduleDownload$12 = messageDownloadScheduler$internalScheduleDownload$14;
            obj = objOLrzqt;
            j7 = j5;
            j8 = jMax;
            j9 = j2;
            j10 = j4;
        } else if (i3 == 1) {
            long j26 = messageDownloadScheduler$internalScheduleDownload$14.J$4;
            j7 = messageDownloadScheduler$internalScheduleDownload$14.J$3;
            z2 = messageDownloadScheduler$internalScheduleDownload$14.Z$0;
            long j27 = messageDownloadScheduler$internalScheduleDownload$14.J$2;
            j9 = messageDownloadScheduler$internalScheduleDownload$14.J$1;
            str2 = "internalScheduleDownload: [";
            j6 = messageDownloadScheduler$internalScheduleDownload$14.J$0;
            str5 = (java.lang.String) messageDownloadScheduler$internalScheduleDownload$14.L$1;
            sJY sjy5 = (sJY) messageDownloadScheduler$internalScheduleDownload$14.L$0;
            C56391yDq.AEQbTJ(obj4);
            j8 = j26;
            messageDownloadScheduler$internalScheduleDownload$12 = messageDownloadScheduler$internalScheduleDownload$14;
            str3 = " ";
            obj = obj4;
            sjy = sjy5;
            j10 = j27;
            i = 10;
            str4 = "MessageDownloadScheduler";
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj4);
                        return Unit.INSTANCE;
                    }
                    long j28 = messageDownloadScheduler$internalScheduleDownload$14.J$4;
                    long j29 = messageDownloadScheduler$internalScheduleDownload$14.J$3;
                    boolean z6 = messageDownloadScheduler$internalScheduleDownload$14.Z$0;
                    long j30 = messageDownloadScheduler$internalScheduleDownload$14.J$2;
                    j25 = j28;
                    long j31 = messageDownloadScheduler$internalScheduleDownload$14.J$1;
                    long j32 = messageDownloadScheduler$internalScheduleDownload$14.J$0;
                    list3 = (java.util.List) messageDownloadScheduler$internalScheduleDownload$14.L$2;
                    java.lang.String str23 = (java.lang.String) messageDownloadScheduler$internalScheduleDownload$14.L$1;
                    sJY sjy6 = (sJY) messageDownloadScheduler$internalScheduleDownload$14.L$0;
                    C56391yDq.AEQbTJ(obj4);
                    sjy4 = sjy6;
                    z5 = z6;
                    obj3 = objCopydefault;
                    str18 = str23;
                    str19 = "internalScheduleDownload: [";
                    str20 = "-";
                    j21 = j31;
                    messageDownloadScheduler$internalScheduleDownload$13 = messageDownloadScheduler$internalScheduleDownload$14;
                    j24 = j32;
                    j23 = j30;
                    j22 = j29;
                    int size = list3.size();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(str19);
                    sb.append(str18);
                    sb.append(str22);
                    sb.append(j24);
                    sb.append(str20);
                    sb.append(j22);
                    MessageDownloadScheduler$internalScheduleDownload$1 messageDownloadScheduler$internalScheduleDownload$15 = messageDownloadScheduler$internalScheduleDownload$13;
                    sb.append("] visibleMessagesNowSize=");
                    sb.append(size);
                    sb.append(", fromSeq=");
                    sb.append(j24);
                    sb.append(", toSeq=");
                    sb.append(j22);
                    pUU.KWHzl(str21, sb.toString());
                    java.lang.String str24 = str21;
                    long j33 = j22;
                    if (list3.size() < j23) {
                        long j34 = (int) j23;
                        int size2 = list3.size();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append(str19);
                        sb2.append(str18);
                        sb2.append(str22);
                        sb2.append(j24);
                        sb2.append(str20);
                        sb2.append(j33);
                        sb2.append("] visibleMessagesNowSize=");
                        sb2.append(size2);
                        sb2.append(", newFromSeq=");
                        long j35 = j21;
                        sb2.append(j35);
                        sb2.append(", newToSeq=");
                        sb2.append(j33);
                        pUU.KWHzl(str24, sb2.toString());
                        messageDownloadScheduler$internalScheduleDownload$15.L$0 = null;
                        messageDownloadScheduler$internalScheduleDownload$15.L$1 = null;
                        messageDownloadScheduler$internalScheduleDownload$15.L$2 = null;
                        messageDownloadScheduler$internalScheduleDownload$15.label = 5;
                        if (sjy4.EZpvd(str18, j24, j35 - j34, j25 - j34, j23, z5, j33, messageDownloadScheduler$internalScheduleDownload$15) == obj3) {
                            return obj3;
                        }
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                long j36 = messageDownloadScheduler$internalScheduleDownload$14.J$4;
                long j37 = messageDownloadScheduler$internalScheduleDownload$14.J$3;
                boolean z7 = messageDownloadScheduler$internalScheduleDownload$14.Z$0;
                long j38 = messageDownloadScheduler$internalScheduleDownload$14.J$2;
                long j39 = messageDownloadScheduler$internalScheduleDownload$14.J$1;
                long j40 = messageDownloadScheduler$internalScheduleDownload$14.J$0;
                java.util.List list4 = (java.util.List) messageDownloadScheduler$internalScheduleDownload$14.L$2;
                java.lang.String str25 = (java.lang.String) messageDownloadScheduler$internalScheduleDownload$14.L$1;
                sJY sjy7 = (sJY) messageDownloadScheduler$internalScheduleDownload$14.L$0;
                C56391yDq.AEQbTJ(obj4);
                sjy3 = sjy7;
                z4 = z7;
                obj2 = objCopydefault;
                str14 = "internalScheduleDownload: [";
                str18 = str25;
                j16 = j39;
                j15 = j37;
                list = list4;
                str17 = " ";
                j6 = j40;
                str16 = "MessageDownloadScheduler";
                j18 = j38;
                str15 = "-";
                j17 = j36;
                long j41 = j18;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                it2 = ((java.lang.Iterable) obj4).iterator();
                while (it2.hasNext()) {
                    OKMessage oKMessageOLrzqt = C44169sFw.OLrzqt((InHouseIMMessageWithReactions) it2.next());
                    if (oKMessageOLrzqt != null) {
                        arrayList.add(oKMessageOLrzqt);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                for (it3 = list.iterator(); it3.hasNext(); it3 = it3) {
                    arrayList2.add(C56443yFo.KWHzl(((OKMessage) it3.next()).getSeq()));
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                long j42 = j16;
                str19 = str14;
                sb3.append(str19);
                sb3.append(str18);
                sb3.append(str17);
                sb3.append(j6);
                sb3.append(str15);
                sb3.append(j15);
                sb3.append("] insertedMessages=");
                sb3.append(arrayList2);
                pUU.KWHzl(str16, sb3.toString());
                CoroutineDispatcher coroutineDispatcherCopydefault = sDN.copydefault.copydefault();
                MessageDownloadScheduler$internalScheduleDownload$5 messageDownloadScheduler$internalScheduleDownload$5 = new MessageDownloadScheduler$internalScheduleDownload$5(str18, j6, j15, list, sjy3, null);
                messageDownloadScheduler$internalScheduleDownload$14.L$0 = sjy3;
                messageDownloadScheduler$internalScheduleDownload$14.L$1 = str18;
                messageDownloadScheduler$internalScheduleDownload$14.L$2 = arrayList;
                messageDownloadScheduler$internalScheduleDownload$14.J$0 = j6;
                messageDownloadScheduler$internalScheduleDownload$14.J$1 = j42;
                java.lang.String str26 = str17;
                messageDownloadScheduler$internalScheduleDownload$14.J$2 = j41;
                sJY sjy8 = sjy3;
                boolean z8 = z4;
                messageDownloadScheduler$internalScheduleDownload$14.Z$0 = z8;
                messageDownloadScheduler$internalScheduleDownload$14.J$3 = j15;
                long j43 = j15;
                long j44 = j17;
                messageDownloadScheduler$internalScheduleDownload$14.J$4 = j44;
                messageDownloadScheduler$internalScheduleDownload$14.label = 4;
                objWithContext = BuildersKt.withContext(coroutineDispatcherCopydefault, messageDownloadScheduler$internalScheduleDownload$5, messageDownloadScheduler$internalScheduleDownload$14);
                obj3 = obj2;
                if (objWithContext != obj3) {
                    return obj3;
                }
                sjy4 = sjy8;
                j21 = j42;
                z5 = z8;
                j22 = j43;
                java.lang.String str27 = str15;
                list3 = arrayList;
                messageDownloadScheduler$internalScheduleDownload$13 = messageDownloadScheduler$internalScheduleDownload$14;
                j23 = j41;
                str21 = str16;
                j24 = j6;
                str22 = str26;
                j25 = j44;
                str20 = str27;
                int size3 = list3.size();
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str19);
                sb4.append(str18);
                sb4.append(str22);
                sb4.append(j24);
                sb4.append(str20);
                sb4.append(j22);
                MessageDownloadScheduler$internalScheduleDownload$1 messageDownloadScheduler$internalScheduleDownload$152 = messageDownloadScheduler$internalScheduleDownload$13;
                sb4.append("] visibleMessagesNowSize=");
                sb4.append(size3);
                sb4.append(", fromSeq=");
                sb4.append(j24);
                sb4.append(", toSeq=");
                sb4.append(j22);
                pUU.KWHzl(str21, sb4.toString());
                java.lang.String str242 = str21;
                long j332 = j22;
                if (list3.size() < j23) {
                }
                return Unit.INSTANCE;
            }
            long j45 = messageDownloadScheduler$internalScheduleDownload$14.J$4;
            long j46 = messageDownloadScheduler$internalScheduleDownload$14.J$3;
            z3 = messageDownloadScheduler$internalScheduleDownload$14.Z$0;
            long j47 = messageDownloadScheduler$internalScheduleDownload$14.J$2;
            long j48 = messageDownloadScheduler$internalScheduleDownload$14.J$1;
            long j49 = messageDownloadScheduler$internalScheduleDownload$14.J$0;
            java.util.List list5 = (java.util.List) messageDownloadScheduler$internalScheduleDownload$14.L$4;
            java.util.Iterator it4 = (java.util.Iterator) messageDownloadScheduler$internalScheduleDownload$14.L$3;
            java.util.List list6 = (java.util.List) messageDownloadScheduler$internalScheduleDownload$14.L$2;
            java.lang.String str28 = (java.lang.String) messageDownloadScheduler$internalScheduleDownload$14.L$1;
            sJY sjy9 = (sJY) messageDownloadScheduler$internalScheduleDownload$14.L$0;
            try {
                C56391yDq.AEQbTJ(obj4);
                long j50 = j49;
                long j51 = j45;
                java.lang.String str29 = "internalScheduleDownload: [";
                java.lang.String str30 = " ";
                java.lang.String str31 = "-";
                long j52 = j48;
                java.lang.String str32 = str28;
                java.lang.Object obj5 = obj4;
                java.util.List list7 = list5;
                java.util.Iterator it5 = it4;
                java.util.List list8 = list6;
                sJY sjy10 = sjy9;
                try {
                    list7.addAll((java.util.Collection) obj5);
                    str7 = str30;
                    sjy2 = sjy10;
                    it = it5;
                    str10 = str32;
                    str9 = str21;
                    j13 = j46;
                    j14 = j47;
                    list = list8;
                    j9 = j52;
                    j6 = j50;
                    str8 = str31;
                    str6 = str29;
                    j12 = j51;
                    if (it.hasNext()) {
                        try {
                            str29 = str6;
                            java.util.List<java.lang.Long> list9 = (java.util.List) it.next();
                            try {
                                messageDownloadScheduler$internalScheduleDownload$14.L$0 = sjy2;
                                messageDownloadScheduler$internalScheduleDownload$14.L$1 = str10;
                                messageDownloadScheduler$internalScheduleDownload$14.L$2 = list;
                                messageDownloadScheduler$internalScheduleDownload$14.L$3 = it;
                                messageDownloadScheduler$internalScheduleDownload$14.L$4 = list;
                                messageDownloadScheduler$internalScheduleDownload$14.J$0 = j6;
                                messageDownloadScheduler$internalScheduleDownload$14.J$1 = j9;
                                messageDownloadScheduler$internalScheduleDownload$14.J$2 = j14;
                                messageDownloadScheduler$internalScheduleDownload$14.Z$0 = z3;
                                messageDownloadScheduler$internalScheduleDownload$14.J$3 = j13;
                                messageDownloadScheduler$internalScheduleDownload$14.J$4 = j20;
                                java.util.Iterator it6 = it;
                                messageDownloadScheduler$internalScheduleDownload$14.label = 2;
                                java.lang.Object objCopydefault2 = sjy2.copydefault(str10, list9, messageDownloadScheduler$internalScheduleDownload$14);
                                if (objCopydefault2 == objCopydefault) {
                                    return objCopydefault;
                                }
                                j51 = j20;
                                j52 = j9;
                                str31 = str8;
                                str21 = str9;
                                j47 = j14;
                                j50 = j6;
                                obj5 = objCopydefault2;
                                str32 = str10;
                                list8 = list;
                                list7 = list8;
                                j46 = j19;
                                it5 = it6;
                                sjy10 = sjy2;
                                str30 = str7;
                                list7.addAll((java.util.Collection) obj5);
                                str7 = str30;
                                sjy2 = sjy10;
                                it = it5;
                                str10 = str32;
                                str9 = str21;
                                j13 = j46;
                                j14 = j47;
                                list = list8;
                                j9 = j52;
                                j6 = j50;
                                str8 = str31;
                                str6 = str29;
                                j12 = j51;
                                if (it.hasNext()) {
                                    str14 = str6;
                                    long j53 = j13;
                                    long j54 = j12;
                                    C44486sRp c44486sRp2 = sjy2.valueOf;
                                    int i4 = (int) j14;
                                    messageDownloadScheduler$internalScheduleDownload$14.L$0 = sjy2;
                                    messageDownloadScheduler$internalScheduleDownload$14.L$1 = str10;
                                    messageDownloadScheduler$internalScheduleDownload$14.L$2 = list;
                                    sJY sjy11 = sjy2;
                                    messageDownloadScheduler$internalScheduleDownload$14.L$3 = null;
                                    messageDownloadScheduler$internalScheduleDownload$14.L$4 = null;
                                    messageDownloadScheduler$internalScheduleDownload$14.J$0 = j6;
                                    messageDownloadScheduler$internalScheduleDownload$14.J$1 = j9;
                                    messageDownloadScheduler$internalScheduleDownload$14.J$2 = j14;
                                    messageDownloadScheduler$internalScheduleDownload$14.Z$0 = z3;
                                    long j55 = j14;
                                    j15 = j53;
                                    messageDownloadScheduler$internalScheduleDownload$14.J$3 = j15;
                                    messageDownloadScheduler$internalScheduleDownload$14.J$4 = j54;
                                    messageDownloadScheduler$internalScheduleDownload$14.label = 3;
                                    java.lang.Object objCopydefault3 = c44486sRp2.copydefault(str10, j6, j15, i4, z3, i4, messageDownloadScheduler$internalScheduleDownload$14);
                                    if (objCopydefault3 == objCopydefault) {
                                        return objCopydefault;
                                    }
                                    j16 = j9;
                                    str15 = str8;
                                    str16 = str9;
                                    z4 = z3;
                                    str17 = str7;
                                    java.lang.String str33 = str10;
                                    obj4 = objCopydefault3;
                                    sjy3 = sjy11;
                                    str18 = str33;
                                    obj2 = objCopydefault;
                                    j17 = j54;
                                    j18 = j55;
                                    long j412 = j18;
                                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                                    it2 = ((java.lang.Iterable) obj4).iterator();
                                    while (it2.hasNext()) {
                                    }
                                    java.util.ArrayList arrayList22 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                                    while (it3.hasNext()) {
                                    }
                                    java.lang.StringBuilder sb32 = new java.lang.StringBuilder();
                                    long j422 = j16;
                                    str19 = str14;
                                    sb32.append(str19);
                                    sb32.append(str18);
                                    sb32.append(str17);
                                    sb32.append(j6);
                                    sb32.append(str15);
                                    sb32.append(j15);
                                    sb32.append("] insertedMessages=");
                                    sb32.append(arrayList22);
                                    pUU.KWHzl(str16, sb32.toString());
                                    CoroutineDispatcher coroutineDispatcherCopydefault2 = sDN.copydefault.copydefault();
                                    MessageDownloadScheduler$internalScheduleDownload$5 messageDownloadScheduler$internalScheduleDownload$52 = new MessageDownloadScheduler$internalScheduleDownload$5(str18, j6, j15, list, sjy3, null);
                                    messageDownloadScheduler$internalScheduleDownload$14.L$0 = sjy3;
                                    messageDownloadScheduler$internalScheduleDownload$14.L$1 = str18;
                                    messageDownloadScheduler$internalScheduleDownload$14.L$2 = arrayList3;
                                    messageDownloadScheduler$internalScheduleDownload$14.J$0 = j6;
                                    messageDownloadScheduler$internalScheduleDownload$14.J$1 = j422;
                                    java.lang.String str262 = str17;
                                    messageDownloadScheduler$internalScheduleDownload$14.J$2 = j412;
                                    sJY sjy82 = sjy3;
                                    boolean z82 = z4;
                                    messageDownloadScheduler$internalScheduleDownload$14.Z$0 = z82;
                                    messageDownloadScheduler$internalScheduleDownload$14.J$3 = j15;
                                    long j432 = j15;
                                    long j442 = j17;
                                    messageDownloadScheduler$internalScheduleDownload$14.J$4 = j442;
                                    messageDownloadScheduler$internalScheduleDownload$14.label = 4;
                                    objWithContext = BuildersKt.withContext(coroutineDispatcherCopydefault2, messageDownloadScheduler$internalScheduleDownload$52, messageDownloadScheduler$internalScheduleDownload$14);
                                    obj3 = obj2;
                                    if (objWithContext != obj3) {
                                    }
                                }
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                j19 = j13;
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                            str11 = str7;
                            str21 = str9;
                            j46 = j19;
                            str12 = str10;
                            str13 = str8;
                            pUU.copydefault(str21, "scheduleDownloadByBatch: [" + str12 + str11 + j6 + str13 + j46 + "] " + C56379yDe.AEQbTJ(th));
                            throw th;
                        }
                        j19 = j13;
                        j20 = j12;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                    str11 = str30;
                    str12 = str32;
                    j6 = j50;
                    str13 = str31;
                    pUU.copydefault(str21, "scheduleDownloadByBatch: [" + str12 + str11 + j6 + str13 + j46 + "] " + C56379yDe.AEQbTJ(th));
                    throw th;
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                j6 = j49;
                str12 = str28;
                str11 = " ";
                str13 = "-";
                pUU.copydefault(str21, "scheduleDownloadByBatch: [" + str12 + str11 + j6 + str13 + j46 + "] " + C56379yDe.AEQbTJ(th));
                throw th;
            }
        }
        java.util.List list10 = (java.util.List) obj;
        boolean z9 = z2;
        sJY sjy12 = sjy;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(list10, i));
        java.util.Iterator it7 = list10.iterator();
        while (it7.hasNext()) {
            arrayList4.add(C56443yFo.KWHzl(((InHouseIMMessageEntity) it7.next()).getSeq()));
        }
        if (list10.size() >= j10) {
            if (!list10.isEmpty()) {
                java.util.Iterator it8 = list10.iterator();
                while (it8.hasNext()) {
                    j11 = j10;
                    if (Intrinsics.EZpvd(((InHouseIMMessageEntity) it8.next()).isVisible(), C56443yFo.KWHzl(true))) {
                        j10 = j11;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        j11 = j10;
        long j56 = j8;
        C56540yJd c56540yJd = new C56540yJd(j56, j9);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator<java.lang.Long> it9 = c56540yJd.iterator();
        while (it9.hasNext()) {
            long jNextLong = ((AbstractC56422yEu) it9).nextLong();
            if (list10.isEmpty()) {
                list2 = list10;
                lKWHzl = C56443yFo.KWHzl(jNextLong);
            } else {
                java.util.Iterator it10 = list10.iterator();
                while (it10.hasNext()) {
                    if (((InHouseIMMessageEntity) it10.next()).getSeq() == jNextLong) {
                        list2 = list10;
                        lKWHzl = null;
                        break;
                    }
                }
                list2 = list10;
                lKWHzl = C56443yFo.KWHzl(jNextLong);
            }
            if (lKWHzl != null) {
                arrayList5.add(lKWHzl);
            }
            list10 = list2;
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
        str6 = str2;
        sb5.append(str6);
        sb5.append(str5);
        sb5.append(str3);
        sb5.append(j6);
        sb5.append("-");
        sb5.append(j7);
        sb5.append("] databaseMessageIds=");
        sb5.append(arrayList4);
        pUU.KWHzl(str4, sb5.toString());
        pUU.KWHzl(str4, str6 + str5 + str3 + j6 + "-" + j7 + "] missingMessageIds=" + arrayList5);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        if (!arrayList5.isEmpty()) {
            java.util.Iterator it11 = CollectionsKt___CollectionsKt.valueOf((java.lang.Iterable) arrayList5, 50).iterator();
            z3 = z9;
            str7 = str3;
            str8 = "-";
            j12 = j56;
            sjy2 = sjy12;
            j13 = j7;
            str9 = str4;
            j14 = j11;
            list = arrayList6;
            messageDownloadScheduler$internalScheduleDownload$14 = messageDownloadScheduler$internalScheduleDownload$12;
            str10 = str5;
            it = it11;
            if (it.hasNext()) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0190 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.String str, java.util.List<java.lang.Long> list, Continuation<? super java.util.List<OKMessage>> continuation) throws java.lang.Exception {
        MessageDownloadScheduler$scheduleDownloadByBatch$1 messageDownloadScheduler$scheduleDownloadByBatch$1;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.Object obj;
        sJY sjy;
        java.lang.Object obj2;
        sJY sjy2;
        java.lang.String str4;
        java.util.Iterator<T> it;
        sJZ sjz;
        java.util.Set<java.lang.String> setValueOf;
        sFA.TaskDescription taskDescription;
        java.util.List list2;
        java.lang.String str5 = str;
        if (continuation instanceof MessageDownloadScheduler$scheduleDownloadByBatch$1) {
            messageDownloadScheduler$scheduleDownloadByBatch$1 = (MessageDownloadScheduler$scheduleDownloadByBatch$1) continuation;
            int i = messageDownloadScheduler$scheduleDownloadByBatch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                messageDownloadScheduler$scheduleDownloadByBatch$1.label = i - Integer.MIN_VALUE;
            } else {
                messageDownloadScheduler$scheduleDownloadByBatch$1 = new MessageDownloadScheduler$scheduleDownloadByBatch$1(this, continuation);
            }
        }
        java.lang.Object obj3 = messageDownloadScheduler$scheduleDownloadByBatch$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = messageDownloadScheduler$scheduleDownloadByBatch$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj3);
            pUU.KWHzl("MessageDownloadScheduler", "scheduleDownloadByBatch: [" + str5 + "] messageIds=" + list);
            MessageDownloadScheduler$scheduleDownloadByBatch$messages$1 messageDownloadScheduler$scheduleDownloadByBatch$messages$1 = new MessageDownloadScheduler$scheduleDownloadByBatch$messages$1(this, str5, list, null);
            messageDownloadScheduler$scheduleDownloadByBatch$1.L$0 = this;
            messageDownloadScheduler$scheduleDownloadByBatch$1.L$1 = str5;
            messageDownloadScheduler$scheduleDownloadByBatch$1.label = 1;
            str2 = "scheduleDownloadByBatch: [";
            str3 = "MessageDownloadScheduler";
            java.lang.Object objWithRetry$default = C44157sFk.withRetry$default(3, 0L, messageDownloadScheduler$scheduleDownloadByBatch$messages$1, messageDownloadScheduler$scheduleDownloadByBatch$1, 2, null);
            if (objWithRetry$default == objCopydefault) {
                return objCopydefault;
            }
            obj = objWithRetry$default;
            sjy = this;
        } else if (i2 == 1) {
            str5 = (java.lang.String) messageDownloadScheduler$scheduleDownloadByBatch$1.L$1;
            sJY sjy3 = (sJY) messageDownloadScheduler$scheduleDownloadByBatch$1.L$0;
            C56391yDq.AEQbTJ(obj3);
            obj = obj3;
            str2 = "scheduleDownloadByBatch: [";
            sjy = sjy3;
            str3 = "MessageDownloadScheduler";
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    java.util.List list3 = (java.util.List) messageDownloadScheduler$scheduleDownloadByBatch$1.L$0;
                    C56391yDq.AEQbTJ(obj3);
                    return list3;
                }
                list2 = (java.util.List) messageDownloadScheduler$scheduleDownloadByBatch$1.L$3;
                sFA.TaskDescription taskDescription2 = (sFA.TaskDescription) messageDownloadScheduler$scheduleDownloadByBatch$1.L$2;
                str4 = (java.lang.String) messageDownloadScheduler$scheduleDownloadByBatch$1.L$1;
                sjy2 = (sJY) messageDownloadScheduler$scheduleDownloadByBatch$1.L$0;
                C56391yDq.AEQbTJ(obj3);
                taskDescription = taskDescription2;
                obj2 = objCopydefault;
                sJW sjw = sjy2.AYXKKw;
                java.util.Set<java.lang.String> setOLrzqt = taskDescription.OLrzqt();
                messageDownloadScheduler$scheduleDownloadByBatch$1.L$0 = list2;
                messageDownloadScheduler$scheduleDownloadByBatch$1.L$1 = null;
                messageDownloadScheduler$scheduleDownloadByBatch$1.L$2 = null;
                messageDownloadScheduler$scheduleDownloadByBatch$1.L$3 = null;
                messageDownloadScheduler$scheduleDownloadByBatch$1.label = 4;
                return sjw.AEQbTJ(str4, setOLrzqt, messageDownloadScheduler$scheduleDownloadByBatch$1) != obj2 ? obj2 : list2;
            }
            java.lang.String str6 = (java.lang.String) messageDownloadScheduler$scheduleDownloadByBatch$1.L$1;
            sJY sjy4 = (sJY) messageDownloadScheduler$scheduleDownloadByBatch$1.L$0;
            C56391yDq.AEQbTJ(obj3);
            str4 = str6;
            sjy2 = sjy4;
            obj2 = objCopydefault;
            sFA.TaskDescription taskDescription3 = (sFA.TaskDescription) obj3;
            java.util.List<InHouseIMMessageWithReactions> listEZpvd = taskDescription3.EZpvd();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            it = listEZpvd.iterator();
            while (it.hasNext()) {
                OKMessage oKMessageOLrzqt = C44169sFw.OLrzqt((InHouseIMMessageWithReactions) it.next());
                if (oKMessageOLrzqt != null) {
                    arrayList.add(oKMessageOLrzqt);
                }
            }
            sjz = sjy2.gEmmrt;
            setValueOf = taskDescription3.valueOf();
            messageDownloadScheduler$scheduleDownloadByBatch$1.L$0 = sjy2;
            messageDownloadScheduler$scheduleDownloadByBatch$1.L$1 = str4;
            messageDownloadScheduler$scheduleDownloadByBatch$1.L$2 = taskDescription3;
            messageDownloadScheduler$scheduleDownloadByBatch$1.L$3 = arrayList;
            messageDownloadScheduler$scheduleDownloadByBatch$1.label = 3;
            if (sjz.KWHzl(str4, setValueOf, messageDownloadScheduler$scheduleDownloadByBatch$1) != obj2) {
                return obj2;
            }
            taskDescription = taskDescription3;
            list2 = arrayList;
            sJW sjw2 = sjy2.AYXKKw;
            java.util.Set<java.lang.String> setOLrzqt2 = taskDescription.OLrzqt();
            messageDownloadScheduler$scheduleDownloadByBatch$1.L$0 = list2;
            messageDownloadScheduler$scheduleDownloadByBatch$1.L$1 = null;
            messageDownloadScheduler$scheduleDownloadByBatch$1.L$2 = null;
            messageDownloadScheduler$scheduleDownloadByBatch$1.L$3 = null;
            messageDownloadScheduler$scheduleDownloadByBatch$1.label = 4;
            if (sjw2.AEQbTJ(str4, setOLrzqt2, messageDownloadScheduler$scheduleDownloadByBatch$1) != obj2) {
            }
        }
        WSMessageListResponse wSMessageListResponse = (WSMessageListResponse) obj;
        java.util.List<WSSendMessageDetailData> listEZpvd2 = wSMessageListResponse != null ? wSMessageListResponse.EZpvd() : null;
        java.util.List<WSSendMessageDetailData> listAhwBna = listEZpvd2 == null ? yDY.AhwBna() : listEZpvd2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator<T> it2 = listAhwBna.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((WSSendMessageDetailData) it2.next()).getSeq());
        }
        pUU.KWHzl(str3, str2 + str5 + "] downloadedMessages=" + arrayList2);
        sFA sfa = sFA.KWHzl;
        C44486sRp c44486sRp = sjy.valueOf;
        C44484sRn c44484sRn = sjy.EZpvd;
        C44485sRo c44485sRo = sjy.KWHzl;
        InHouseIMConversationService inHouseIMConversationService = sjy.AEQbTJ;
        C44489sRs c44489sRs = sjy.values;
        sMF smf = sjy.djBIcL;
        C44272sJr c44272sJr = sjy.AhwBna;
        messageDownloadScheduler$scheduleDownloadByBatch$1.L$0 = sjy;
        messageDownloadScheduler$scheduleDownloadByBatch$1.L$1 = str5;
        messageDownloadScheduler$scheduleDownloadByBatch$1.label = 2;
        obj2 = objCopydefault;
        java.lang.Object objKWHzl = sfa.KWHzl(c44486sRp, c44484sRn, c44485sRo, inHouseIMConversationService, str5, listAhwBna, true, c44489sRs, smf, c44272sJr, messageDownloadScheduler$scheduleDownloadByBatch$1);
        if (objKWHzl == obj2) {
            return obj2;
        }
        sjy2 = sjy;
        obj3 = objKWHzl;
        str4 = str5;
        sFA.TaskDescription taskDescription32 = (sFA.TaskDescription) obj3;
        java.util.List<InHouseIMMessageWithReactions> listEZpvd3 = taskDescription32.EZpvd();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        it = listEZpvd3.iterator();
        while (it.hasNext()) {
        }
        sjz = sjy2.gEmmrt;
        setValueOf = taskDescription32.valueOf();
        messageDownloadScheduler$scheduleDownloadByBatch$1.L$0 = sjy2;
        messageDownloadScheduler$scheduleDownloadByBatch$1.L$1 = str4;
        messageDownloadScheduler$scheduleDownloadByBatch$1.L$2 = taskDescription32;
        messageDownloadScheduler$scheduleDownloadByBatch$1.L$3 = arrayList3;
        messageDownloadScheduler$scheduleDownloadByBatch$1.label = 3;
        if (sjz.KWHzl(str4, setValueOf, messageDownloadScheduler$scheduleDownloadByBatch$1) != obj2) {
        }
    }
}
