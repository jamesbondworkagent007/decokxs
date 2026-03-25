package com.okinc.okimcore.model.im;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData;
import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData$UserInfo$$serializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33489mxS;
import o.C56521yIl;
import o.yDY;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupSystemMessageInfo {
    private static final KSerializer<Object>[] $childSerializers;
    private List<Long> announcementIds;
    private final String operatorEnNickname;
    private final String operatorId;
    private final String operatorNickname;
    private Integer targetUidAmount;
    private List<String> targetUserDisplayEnNames;
    private final List<SystemMessageData.UserInfo> targetUserDisplayList;
    private List<String> targetUserDisplayNames;
    private final List<String> targetUserIds;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupSystemMessageInfo() {
        this((String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Integer) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.operatorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.operatorNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.operatorEnNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.targetUserIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SystemMessageData.UserInfo> component5() {
        return this.targetUserDisplayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.targetUserDisplayNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component7() {
        return this.targetUserDisplayEnNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component8() {
        return this.announcementIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.targetUidAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupSystemMessageInfo copy(String str, String str2, String str3, List<String> list, List<SystemMessageData.UserInfo> list2, List<String> list3, List<String> list4, List<Long> list5, Integer num) {
        return new GroupSystemMessageInfo(str, str2, str3, list, list2, list3, list4, list5, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupSystemMessageInfo)) {
            return false;
        }
        GroupSystemMessageInfo groupSystemMessageInfo = (GroupSystemMessageInfo) obj;
        return Intrinsics.EZpvd((Object) this.operatorId, (Object) groupSystemMessageInfo.operatorId) && Intrinsics.EZpvd((Object) this.operatorNickname, (Object) groupSystemMessageInfo.operatorNickname) && Intrinsics.EZpvd((Object) this.operatorEnNickname, (Object) groupSystemMessageInfo.operatorEnNickname) && Intrinsics.EZpvd(this.targetUserIds, groupSystemMessageInfo.targetUserIds) && Intrinsics.EZpvd(this.targetUserDisplayList, groupSystemMessageInfo.targetUserDisplayList) && Intrinsics.EZpvd(this.targetUserDisplayNames, groupSystemMessageInfo.targetUserDisplayNames) && Intrinsics.EZpvd(this.targetUserDisplayEnNames, groupSystemMessageInfo.targetUserDisplayEnNames) && Intrinsics.EZpvd(this.announcementIds, groupSystemMessageInfo.announcementIds) && Intrinsics.EZpvd(this.targetUidAmount, groupSystemMessageInfo.targetUidAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getAnnouncementIds() {
        return this.announcementIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOperatorEnNickname() {
        return this.operatorEnNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOperatorId() {
        return this.operatorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOperatorNickname() {
        return this.operatorNickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTargetUidAmount() {
        return this.targetUidAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTargetUserDisplayEnNames() {
        return this.targetUserDisplayEnNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SystemMessageData.UserInfo> getTargetUserDisplayList() {
        return this.targetUserDisplayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTargetUserDisplayNames() {
        return this.targetUserDisplayNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTargetUserIds() {
        return this.targetUserIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.operatorId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.operatorNickname;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.operatorEnNickname;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        List<String> list = this.targetUserIds;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List<SystemMessageData.UserInfo> list2 = this.targetUserDisplayList;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.targetUserDisplayNames;
        int iHashCode6 = list3 == null ? 0 : list3.hashCode();
        List<String> list4 = this.targetUserDisplayEnNames;
        int iHashCode7 = list4 == null ? 0 : list4.hashCode();
        List<Long> list5 = this.announcementIds;
        int iHashCode8 = list5 == null ? 0 : list5.hashCode();
        Integer num = this.targetUidAmount;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAnnouncementIds(List<Long> list) {
        this.announcementIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetUidAmount(Integer num) {
        this.targetUidAmount = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetUserDisplayEnNames(List<String> list) {
        this.targetUserDisplayEnNames = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetUserDisplayNames(List<String> list) {
        this.targetUserDisplayNames = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupSystemMessageInfo(operatorId=" + this.operatorId + ", operatorNickname=" + this.operatorNickname + ", operatorEnNickname=" + this.operatorEnNickname + ", targetUserIds=" + this.targetUserIds + ", targetUserDisplayList=" + this.targetUserDisplayList + ", targetUserDisplayNames=" + this.targetUserDisplayNames + ", targetUserDisplayEnNames=" + this.targetUserDisplayEnNames + ", announcementIds=" + this.announcementIds + ", targetUidAmount=" + this.targetUidAmount + ")";
    }

    public /* synthetic */ GroupSystemMessageInfo(int i, String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.operatorId = null;
        } else {
            this.operatorId = str;
        }
        if ((i & 2) == 0) {
            this.operatorNickname = null;
        } else {
            this.operatorNickname = str2;
        }
        if ((i & 4) == 0) {
            this.operatorEnNickname = null;
        } else {
            this.operatorEnNickname = str3;
        }
        if ((i & 8) == 0) {
            this.targetUserIds = null;
        } else {
            this.targetUserIds = list;
        }
        if ((i & 16) == 0) {
            this.targetUserDisplayList = null;
        } else {
            this.targetUserDisplayList = list2;
        }
        if ((i & 32) == 0) {
            this.targetUserDisplayNames = null;
        } else {
            this.targetUserDisplayNames = list3;
        }
        if ((i & 64) == 0) {
            this.targetUserDisplayEnNames = null;
        } else {
            this.targetUserDisplayEnNames = list4;
        }
        if ((i & 128) == 0) {
            this.announcementIds = null;
        } else {
            this.announcementIds = list5;
        }
        if ((i & 256) == 0) {
            this.targetUidAmount = null;
        } else {
            this.targetUidAmount = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupSystemMessageInfo groupSystemMessageInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupSystemMessageInfo.operatorId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, groupSystemMessageInfo.operatorId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupSystemMessageInfo.operatorNickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, groupSystemMessageInfo.operatorNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || groupSystemMessageInfo.operatorEnNickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, groupSystemMessageInfo.operatorEnNickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || groupSystemMessageInfo.targetUserIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], groupSystemMessageInfo.targetUserIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || groupSystemMessageInfo.targetUserDisplayList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], groupSystemMessageInfo.targetUserDisplayList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || groupSystemMessageInfo.targetUserDisplayNames != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], groupSystemMessageInfo.targetUserDisplayNames);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || groupSystemMessageInfo.targetUserDisplayEnNames != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], groupSystemMessageInfo.targetUserDisplayEnNames);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || groupSystemMessageInfo.announcementIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], groupSystemMessageInfo.announcementIds);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && groupSystemMessageInfo.targetUidAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, IntSerializer.INSTANCE, groupSystemMessageInfo.targetUidAmount);
    }

    public GroupSystemMessageInfo(String str, String str2, String str3, List<String> list, List<SystemMessageData.UserInfo> list2, List<String> list3, List<String> list4, List<Long> list5, Integer num) {
        this.operatorId = str;
        this.operatorNickname = str2;
        this.operatorEnNickname = str3;
        this.targetUserIds = list;
        this.targetUserDisplayList = list2;
        this.targetUserDisplayNames = list3;
        this.targetUserDisplayEnNames = list4;
        this.announcementIds = list5;
        this.targetUidAmount = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r14v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r16v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.Integer) : (null java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData$UserInfo>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.Long>, java.lang.Integer):void (m)] (LINE:133) call: com.okinc.okimcore.model.im.GroupSystemMessageInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.lang.Integer):void type: THIS */
    public /* synthetic */ GroupSystemMessageInfo(String str, String str2, String str3, List list, List list2, List list3, List list4, List list5, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : list4, (i & 128) != 0 ? null : list5, (i & 256) == 0 ? num : null);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.GroupSystemMessageInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GroupSystemMessageInfo> serializer() {
            return GroupSystemMessageInfo$$serializer.INSTANCE;
        }

        public final GroupSystemMessageInfo copydefault(SystemMessageData systemMessageData) {
            SystemMessageData.UserInfo userInfo;
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            List list;
            Map<String, String> mapAEQbTJ;
            String str;
            List<SystemMessageData.UserInfo> listAhwBna;
            List<SystemMessageData.UserInfo> listAhwBna2;
            Object next;
            if (systemMessageData == null || (listAhwBna2 = systemMessageData.AhwBna()) == null) {
                userInfo = null;
            } else {
                Iterator<T> it = listAhwBna2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd((Object) ((SystemMessageData.UserInfo) next).KWHzl(), (Object) systemMessageData.KWHzl())) {
                        break;
                    }
                }
                userInfo = (SystemMessageData.UserInfo) next;
            }
            if (systemMessageData == null || (listAhwBna = systemMessageData.AhwBna()) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj : listAhwBna) {
                    SystemMessageData.UserInfo userInfo2 = (SystemMessageData.UserInfo) obj;
                    List<String> listValueOf = systemMessageData.valueOf();
                    if (listValueOf == null) {
                        listValueOf = yDY.AhwBna();
                    }
                    if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) listValueOf), userInfo2.KWHzl()) && !Intrinsics.EZpvd((Object) userInfo2.KWHzl(), (Object) systemMessageData.KWHzl())) {
                        arrayList5.add(obj);
                    }
                }
                arrayList = arrayList5;
            }
            String strKWHzl = userInfo != null ? userInfo.KWHzl() : null;
            String strEZpvd = userInfo != null ? userInfo.EZpvd() : null;
            String strCopydefault = userInfo != null ? userInfo.copydefault() : null;
            if (arrayList != null) {
                ArrayList arrayList6 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String strKWHzl2 = ((SystemMessageData.UserInfo) it2.next()).KWHzl();
                    if (strKWHzl2 != null) {
                        arrayList6.add(strKWHzl2);
                    }
                }
                arrayList2 = arrayList6;
            } else {
                arrayList2 = null;
            }
            if (arrayList != null) {
                ArrayList arrayList7 = new ArrayList();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String strEZpvd2 = ((SystemMessageData.UserInfo) it3.next()).EZpvd();
                    if (strEZpvd2 != null) {
                        arrayList7.add(strEZpvd2);
                    }
                }
                arrayList3 = arrayList7;
            } else {
                arrayList3 = null;
            }
            if (arrayList != null) {
                ArrayList arrayList8 = new ArrayList();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    String strCopydefault2 = ((SystemMessageData.UserInfo) it4.next()).copydefault();
                    if (strCopydefault2 != null) {
                        arrayList8.add(strCopydefault2);
                    }
                }
                arrayList4 = arrayList8;
            } else {
                arrayList4 = null;
            }
            Integer numOLrzqt = systemMessageData != null ? systemMessageData.OLrzqt() : null;
            if (systemMessageData == null || (mapAEQbTJ = systemMessageData.AEQbTJ()) == null || (str = mapAEQbTJ.get("announcementIds")) == null) {
                list = null;
            } else {
                try {
                    list = (List) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) BuiltinSerializersKt.ListSerializer(BuiltinSerializersKt.serializer(C56521yIl.copydefault)), str);
                } catch (Exception unused) {
                    list = null;
                }
            }
            return new GroupSystemMessageInfo(strKWHzl, strEZpvd, strCopydefault, arrayList2, arrayList, arrayList3, arrayList4, list, numOLrzqt);
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(stringSerializer), new ArrayListSerializer(SystemMessageData$UserInfo$$serializer.INSTANCE), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(stringSerializer), new ArrayListSerializer(LongSerializer.INSTANCE), null};
    }
}
