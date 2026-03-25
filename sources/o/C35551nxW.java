package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.okinc.im.imui.contacts.ContactOrderHelper$insertSectionByAlphabet$2;
import com.okinc.im.imui.contacts.ContactOrderHelper$sortDisplayNameByWord$2;
import com.okinc.im.imui.contacts.ContactOrderHelper$sortFriendRelationDisplayNameByWord$2;
import com.okinc.im.imui.contacts.ContactOrderHelper$sortPhonebookDisplayNameByWord$2;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagType;
import com.okinc.okimcore.model.remote.RelationInfo;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nxW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35551nxW {
    public static final C35551nxW copydefault = new C35551nxW();
    public static final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.nxU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C35551nxW.AEQbTJ();
        }
    });
    public static final int OLrzqt = 8;

    private C35551nxW() {
    }

    public final java.util.HashMap<java.lang.Character, java.lang.Integer> EZpvd() {
        return (java.util.HashMap) EZpvd.getValue();
    }

    public static final java.util.HashMap AEQbTJ() {
        java.util.HashMap map = new java.util.HashMap();
        int i = 0;
        int i2 = 0;
        while (i < "↑ABCDEFGHIJKLMNOPQRSTUVWXYZ#".length()) {
            map.put(java.lang.Character.valueOf("↑ABCDEFGHIJKLMNOPQRSTUVWXYZ#".charAt(i)), java.lang.Integer.valueOf(i2));
            i++;
            i2++;
        }
        return map;
    }

    public final java.lang.String AEQbTJ(java.lang.Character ch) {
        return (ch == null || !EZpvd().containsKey(ch)) ? ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER : ch.toString();
    }

    public final java.lang.Object EZpvd(@NotNull java.util.List<RelationInfo> list, @NotNull Continuation<? super java.util.List<RelationInfo>> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new ContactOrderHelper$sortDisplayNameByWord$2(list, null), continuation);
    }

    public final java.lang.Object AEQbTJ(@NotNull java.util.List<RelationInfo> list, @NotNull Continuation<? super java.util.List<? extends java.lang.Object>> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new ContactOrderHelper$insertSectionByAlphabet$2(list, null), continuation);
    }

    public final java.util.List<GroupMemberInfo> copydefault(@NotNull java.util.List<GroupMemberInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.List<GroupMemberInfo> listKWHzl = KWHzl(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : listKWHzl) {
            GroupRole role = ((GroupMemberInfo) obj).getRole();
            java.lang.Object arrayList = linkedHashMap.get(role);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(role, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.List<GroupMemberInfo> list2 = (java.util.List) linkedHashMap.get(GroupRole.Owner);
        if (list2 != null) {
            arrayList2.addAll(copydefault.OLrzqt(list2));
        }
        java.util.List<GroupMemberInfo> list3 = (java.util.List) linkedHashMap.get(GroupRole.Administrator);
        if (list3 != null) {
            arrayList2.addAll(copydefault.OLrzqt(list3));
        }
        java.util.List<GroupMemberInfo> list4 = (java.util.List) linkedHashMap.get(GroupRole.Common);
        if (list4 != null) {
            arrayList2.addAll(copydefault.OLrzqt(list4));
        }
        java.util.List<GroupMemberInfo> list5 = (java.util.List) linkedHashMap.get(GroupRole.Unknown);
        if (list5 != null) {
            arrayList2.addAll(copydefault.OLrzqt(list5));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: o.nxW$Activity */
    public static final class Activity<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((GroupMemberInfo) t).getDisplayAlphabetText(), ((GroupMemberInfo) t2).getDisplayAlphabetText());
        }
    }

    /* JADX INFO: renamed from: o.nxW$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.String displayAlphabetText = ((GroupMemberInfo) t).getDisplayAlphabetText();
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = displayAlphabetText.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String lowerCase2 = ((GroupMemberInfo) t2).getDisplayAlphabetText().toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            return yET.KWHzl(lowerCase, lowerCase2);
        }
    }

    /* JADX INFO: renamed from: o.nxW$ActionBar */
    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Integer numAEQbTJ = C44170sFx.AEQbTJ(((C34282nYe) t2).djBIcL());
            int iIntValue = numAEQbTJ != null ? numAEQbTJ.intValue() : 0;
            java.lang.Integer numAEQbTJ2 = C44170sFx.AEQbTJ(((C34282nYe) t).djBIcL());
            return yET.KWHzl(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(numAEQbTJ2 != null ? numAEQbTJ2.intValue() : 0));
        }
    }

    /* JADX INFO: renamed from: o.nxW$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.lang.Integer numAEQbTJ = C35551nxW.AEQbTJ(((GroupMemberInfo) t2).getOfficialTags());
            int iIntValue = numAEQbTJ != null ? numAEQbTJ.intValue() : 0;
            java.lang.Integer numAEQbTJ2 = C35551nxW.AEQbTJ(((GroupMemberInfo) t).getOfficialTags());
            return yET.KWHzl(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(numAEQbTJ2 != null ? numAEQbTJ2.intValue() : 0));
        }
    }

    public final java.util.List<C34282nYe> EZpvd(@NotNull java.util.List<C34282nYe> list) {
        Intrinsics.checkNotNullParameter(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C34282nYe c34282nYe : list) {
            linkedHashMap.put(c34282nYe.AhwBna(), c34282nYe);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C34282nYe) it.next()).values());
        }
        java.util.List<GroupMemberInfo> listCopydefault = copydefault(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator<T> it2 = listCopydefault.iterator();
        while (it2.hasNext()) {
            C34282nYe c34282nYe2 = (C34282nYe) linkedHashMap.get(((GroupMemberInfo) it2.next()).getMemberId());
            if (c34282nYe2 != null) {
                arrayList2.add(c34282nYe2);
            }
        }
        return arrayList2;
    }

    public final java.util.List<C34282nYe> AEQbTJ(@NotNull java.util.List<C34282nYe> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (C34282nYe c34282nYe : list) {
            if (C44170sFx.valueOf(c34282nYe.djBIcL())) {
                arrayList.add(c34282nYe);
            } else if (C44170sFx.copydefault(c34282nYe.djBIcL())) {
                arrayList2.add(c34282nYe);
            } else {
                arrayList3.add(c34282nYe);
            }
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new ActionBar());
        java.util.List<C34282nYe> listEZpvd2 = EZpvd(arrayList2);
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listEZpvd, (java.lang.Iterable) listEZpvd2), (java.lang.Iterable) EZpvd(arrayList3));
    }

    public final java.util.List<GroupMemberInfo> OLrzqt(@NotNull java.util.List<GroupMemberInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (GroupMemberInfo groupMemberInfo : list) {
            java.lang.String strEZpvd = C44157sFk.EZpvd(groupMemberInfo);
            groupMemberInfo.setDisplayAlphabetText(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strEZpvd) ? ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER : strEZpvd);
            java.lang.Character chWlaJM = C59454zhO.wlaJM(strEZpvd);
            if (chWlaJM != null && (C44508sSk.OLrzqt.KWHzl(chWlaJM.charValue()) || Intrinsics.EZpvd((java.lang.Object) chWlaJM.toString(), (java.lang.Object) "↑"))) {
                arrayList.add(groupMemberInfo);
            } else {
                arrayList2.add(groupMemberInfo);
            }
        }
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.EZpvd(arrayList, new Application()), (java.lang.Iterable) CollectionsKt___CollectionsKt.EZpvd(arrayList2, new Activity()));
    }

    public final java.lang.Object copydefault(@NotNull java.util.List<C37246oqH> list, @NotNull Continuation<? super java.util.List<C37246oqH>> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new ContactOrderHelper$sortPhonebookDisplayNameByWord$2(list, null), continuation);
    }

    public final java.lang.Object KWHzl(@NotNull java.util.List<C37248oqJ> list, @NotNull Continuation<? super java.util.List<C37248oqJ>> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new ContactOrderHelper$sortFriendRelationDisplayNameByWord$2(list, null), continuation);
    }

    public static final java.lang.Integer AEQbTJ(OfficialTagInfo officialTagInfo) {
        java.util.List<OfficialTagType> supportTagTypes;
        java.lang.Object next;
        if (officialTagInfo == null || (supportTagTypes = officialTagInfo.getSupportTagTypes()) == null) {
            return null;
        }
        java.util.Iterator<T> it = supportTagTypes.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (yDY.gEmmrt(OfficialTagType.Vip1, OfficialTagType.Vip2, OfficialTagType.Vip3, OfficialTagType.Vip4, OfficialTagType.Vip5, OfficialTagType.Vip6, OfficialTagType.Vip7, OfficialTagType.Vip8, OfficialTagType.Vip9).contains((OfficialTagType) next)) {
                break;
            }
        }
        OfficialTagType officialTagType = (OfficialTagType) next;
        if (officialTagType != null) {
            return java.lang.Integer.valueOf(officialTagType.getType());
        }
        return null;
    }

    public static final boolean OLrzqt(OfficialTagInfo officialTagInfo) {
        return AEQbTJ(officialTagInfo) != null;
    }

    public static final boolean EZpvd(OfficialTagInfo officialTagInfo) {
        java.util.List<OfficialTagType> supportTagTypes;
        if (officialTagInfo != null && (supportTagTypes = officialTagInfo.getSupportTagTypes()) != null && !supportTagTypes.isEmpty()) {
            for (OfficialTagType officialTagType : supportTagTypes) {
                if (officialTagType == OfficialTagType.VipRM || officialTagType == OfficialTagType.VipSupport) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.util.List<GroupMemberInfo> AYXKKw(@NotNull java.util.List<GroupMemberInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (GroupMemberInfo groupMemberInfo : list) {
            if (OLrzqt(groupMemberInfo.getOfficialTags())) {
                arrayList.add(groupMemberInfo);
            } else if (EZpvd(groupMemberInfo.getOfficialTags())) {
                arrayList2.add(groupMemberInfo);
            } else {
                arrayList3.add(groupMemberInfo);
            }
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(arrayList, new TaskDescription());
        java.util.List<GroupMemberInfo> listCopydefault = copydefault(arrayList2);
        return CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listEZpvd, (java.lang.Iterable) listCopydefault), (java.lang.Iterable) copydefault(arrayList3));
    }

    public final java.util.List<GroupMemberInfo> KWHzl(@NotNull java.util.List<GroupMemberInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        for (GroupMemberInfo groupMemberInfo : list) {
            java.lang.String strEZpvd = C44157sFk.EZpvd(groupMemberInfo);
            groupMemberInfo.setDisplayAlphabetText(C33129mqd.OLrzqt((java.lang.CharSequence) strEZpvd) ? java.lang.String.valueOf(strEZpvd.charAt(0)) : ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER);
        }
        return list;
    }
}
