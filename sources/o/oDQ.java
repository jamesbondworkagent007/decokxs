package o;

import com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import java.util.Date;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oDQ {
    public static final C34282nYe EZpvd(@NotNull GroupMemberInfo groupMemberInfo) {
        Triple triple;
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        PaidGroupMemberStatus paidGroupMemberStatus = groupMemberInfo.getPaidGroupMemberStatus();
        if ((paidGroupMemberStatus != null ? paidGroupMemberStatus.getBillingCyclePaymentStatus() : null) == BillingCyclePaymentStatus.EXEMPTED) {
            triple = new Triple(paidGroupMemberStatus.getBillingCyclePaymentStatus(), null, null);
        } else if (paidGroupMemberStatus != null) {
            BillingCyclePaymentStatus billingCyclePaymentStatus = paidGroupMemberStatus.getBillingCyclePaymentStatus();
            java.lang.Long nextPaymentDatetime = paidGroupMemberStatus.getNextPaymentDatetime();
            Date date = nextPaymentDatetime != null ? new Date(nextPaymentDatetime.longValue()) : null;
            java.lang.Long lastPaymentDatetime = paidGroupMemberStatus.getLastPaymentDatetime();
            triple = new Triple(billingCyclePaymentStatus, date, lastPaymentDatetime != null ? new Date(lastPaymentDatetime.longValue()) : null);
        } else {
            triple = new Triple(null, null, null);
        }
        BillingCyclePaymentStatus billingCyclePaymentStatus2 = (BillingCyclePaymentStatus) triple.component1();
        Date date2 = (Date) triple.component2();
        Date date3 = (Date) triple.component3();
        java.lang.String memberId = groupMemberInfo.getMemberId();
        java.lang.String strEZpvd = C44157sFk.EZpvd(groupMemberInfo);
        GroupRole role = groupMemberInfo.getRole();
        OfficialTagInfo officialTags = groupMemberInfo.getOfficialTags();
        if (billingCyclePaymentStatus2 == null) {
            billingCyclePaymentStatus2 = BillingCyclePaymentStatus.UNKNOWN;
        }
        return new C34282nYe(groupMemberInfo, memberId, strEZpvd, "", role, officialTags, groupMemberInfo.getAvatar(), "", "", billingCyclePaymentStatus2, date2, date3, null, false, false, false, 61440, null);
    }

    public static final java.util.List<C34282nYe> OLrzqt(@NotNull java.util.List<C34282nYe> list, @NotNull java.lang.String str, boolean z) {
        java.lang.String str2;
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            java.util.HashMap map = new java.util.HashMap();
            java.util.ArrayList<C34282nYe> arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                C34282nYe c34282nYe = (C34282nYe) obj;
                GroupMemberInfo groupMemberInfoValues = c34282nYe.values();
                if (z) {
                    str2 = str;
                    if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c34282nYe.AhwBna(), (java.lang.CharSequence) str2, true)) {
                        map.put(c34282nYe.AhwBna(), c34282nYe.AhwBna());
                    }
                    arrayList.add(obj);
                } else {
                    str2 = str;
                }
                if (!StringsKt__StringsKt.AhwBna((java.lang.CharSequence) c34282nYe.AEQbTJ(), (java.lang.CharSequence) str2, true)) {
                    if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) groupMemberInfoValues.getNickName(), (java.lang.CharSequence) str2, true)) {
                        map.put(c34282nYe.AhwBna(), groupMemberInfoValues.getNickName());
                    } else {
                        java.lang.String remarkName = groupMemberInfoValues.getRemarkName();
                        if (remarkName == null) {
                            remarkName = "";
                        }
                        if (StringsKt__StringsKt.AhwBna((java.lang.CharSequence) remarkName, (java.lang.CharSequence) str2, true)) {
                            java.lang.String strAhwBna = c34282nYe.AhwBna();
                            java.lang.String remarkName2 = groupMemberInfoValues.getRemarkName();
                            if (remarkName2 == null) {
                                remarkName2 = "";
                            }
                            map.put(strAhwBna, remarkName2);
                        }
                    }
                }
                arrayList.add(obj);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            for (C34282nYe c34282nYe2 : arrayList) {
                java.lang.String str4 = (java.lang.String) map.get(c34282nYe2.AhwBna());
                java.util.ArrayList arrayList3 = arrayList2;
                arrayList3.add(c34282nYe2.EZpvd((61431 & 1) != 0 ? c34282nYe2.DbNXlk : null, (61431 & 2) != 0 ? c34282nYe2.gEmmrt : null, (61431 & 4) != 0 ? c34282nYe2.AEQbTJ : null, (61431 & 8) != 0 ? c34282nYe2.copydefault : str4 == null ? str3 : str4, (61431 & 16) != 0 ? c34282nYe2.fetchVPNInfo : null, (61431 & 32) != 0 ? c34282nYe2.isConnected : null, (61431 & 64) != 0 ? c34282nYe2.EZpvd : null, (61431 & 128) != 0 ? c34282nYe2.fIwbmz : null, (61431 & 256) != 0 ? c34282nYe2.KWHzl : null, (61431 & 512) != 0 ? c34282nYe2.OLrzqt : null, (61431 & 1024) != 0 ? c34282nYe2.values : null, (61431 & 2048) != 0 ? c34282nYe2.djBIcL : null, (61431 & 4096) != 0 ? c34282nYe2.AkhnZx : str, (61431 & 8192) != 0 ? c34282nYe2.AYXKKw : false, (61431 & 16384) != 0 ? c34282nYe2.valueOf : false, (61431 & 32768) != 0 ? c34282nYe2.AhwBna : false));
                arrayList2 = arrayList3;
                str3 = str3;
                map = map;
            }
            return arrayList2;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (C34282nYe c34282nYe3 : list) {
            java.util.ArrayList arrayList5 = arrayList4;
            arrayList5.add(c34282nYe3.EZpvd((61431 & 1) != 0 ? c34282nYe3.DbNXlk : null, (61431 & 2) != 0 ? c34282nYe3.gEmmrt : null, (61431 & 4) != 0 ? c34282nYe3.AEQbTJ : null, (61431 & 8) != 0 ? c34282nYe3.copydefault : "", (61431 & 16) != 0 ? c34282nYe3.fetchVPNInfo : null, (61431 & 32) != 0 ? c34282nYe3.isConnected : null, (61431 & 64) != 0 ? c34282nYe3.EZpvd : null, (61431 & 128) != 0 ? c34282nYe3.fIwbmz : null, (61431 & 256) != 0 ? c34282nYe3.KWHzl : null, (61431 & 512) != 0 ? c34282nYe3.OLrzqt : null, (61431 & 1024) != 0 ? c34282nYe3.values : null, (61431 & 2048) != 0 ? c34282nYe3.djBIcL : null, (61431 & 4096) != 0 ? c34282nYe3.AkhnZx : str, (61431 & 8192) != 0 ? c34282nYe3.AYXKKw : false, (61431 & 16384) != 0 ? c34282nYe3.valueOf : false, (61431 & 32768) != 0 ? c34282nYe3.AhwBna : false));
            arrayList4 = arrayList5;
        }
        return arrayList4;
    }
}
