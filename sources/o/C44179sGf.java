package o;

import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: renamed from: o.sGf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44179sGf {
    public static final C44179sGf AEQbTJ = new C44179sGf();
    public static final java.util.List<InHouseIMChannelType> AhwBna;
    public static final int EZpvd;
    public static final java.util.List<InHouseIMChannelType> KWHzl;
    public static final java.util.List<GroupTagType> OLrzqt;
    public static final java.util.List<GroupTagType> copydefault;
    public static final java.util.List<InHouseIMChannelType> gEmmrt;
    public static final java.util.Set<java.lang.Integer> valueOf;

    private C44179sGf() {
    }

    static {
        GroupTagType groupTagType = GroupTagType.OK_ASSISTANT;
        GroupTagType groupTagType2 = GroupTagType.VIDEO_CALL_CHAT_GROUP;
        GroupTagType groupTagType3 = GroupTagType.GBSC_OUTBOUND_CALL_GROUP;
        OLrzqt = yDY.gEmmrt(groupTagType, groupTagType2, groupTagType3);
        GroupTagType groupTagType4 = GroupTagType.VIP_CHAT_GROUP;
        GroupTagType groupTagType5 = GroupTagType.OTC_AGENT;
        copydefault = yDY.gEmmrt(groupTagType, groupTagType4, groupTagType2, groupTagType3, groupTagType5);
        valueOf = yEE.AhwBna(java.lang.Integer.valueOf(groupTagType4.getValue()), java.lang.Integer.valueOf(groupTagType5.getValue()));
        InHouseIMChannelType inHouseIMChannelType = InHouseIMChannelType.SystemNotification;
        InHouseIMChannelType inHouseIMChannelType2 = InHouseIMChannelType.LiveStreamChatRoom;
        InHouseIMChannelType inHouseIMChannelType3 = InHouseIMChannelType.OrbitNotifications;
        gEmmrt = yDY.gEmmrt(inHouseIMChannelType, inHouseIMChannelType2, inHouseIMChannelType3);
        AhwBna = C56402yEa.EZpvd(inHouseIMChannelType2);
        KWHzl = yDY.gEmmrt(inHouseIMChannelType, inHouseIMChannelType3);
        EZpvd = 8;
    }

    public final boolean AEQbTJ(java.lang.Integer num, java.lang.Integer num2) {
        return num != null && num.intValue() == GroupTagType.OK_ASSISTANT.getValue() && CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.Integer>) ((java.lang.Iterable<? extends java.lang.Object>) valueOf), num2);
    }

    public final java.util.List<java.lang.Integer> KWHzl() {
        java.util.List<GroupTagType> list = OLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((GroupTagType) it.next()).getValue()));
        }
        return arrayList;
    }

    public final java.util.List<java.lang.Integer> EZpvd() {
        java.util.List<GroupTagType> list = copydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((GroupTagType) it.next()).getValue()));
        }
        return arrayList;
    }

    public final java.util.List<java.lang.Integer> AEQbTJ() {
        java.util.List<InHouseIMChannelType> list = gEmmrt;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((InHouseIMChannelType) it.next()).getApiValue()));
        }
        return arrayList;
    }

    public final java.util.List<java.lang.Integer> copydefault() {
        java.util.List<InHouseIMChannelType> list = KWHzl;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((InHouseIMChannelType) it.next()).getApiValue()));
        }
        return arrayList;
    }

    public final java.util.List<java.lang.Integer> OLrzqt() {
        java.util.List<InHouseIMChannelType> list = AhwBna;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((InHouseIMChannelType) it.next()).getApiValue()));
        }
        return arrayList;
    }
}
