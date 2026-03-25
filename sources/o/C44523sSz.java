package o;

import com.okinc.okimcore.model.biz.relationlocal.PhoneRelation;
import com.okinc.okimcore.model.biz.relationlocal.PhoneRelationGroup;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44523sSz {
    public static final PhoneRelation KWHzl(@NotNull PhoneRelationEntity phoneRelationEntity) {
        Intrinsics.checkNotNullParameter(phoneRelationEntity, "");
        return new PhoneRelation(phoneRelationEntity.getPhoneRelationId(), phoneRelationEntity.getRawNumber(), phoneRelationEntity.getName(), phoneRelationEntity.getCountryCode(), phoneRelationEntity.getNationalNumber(), phoneRelationEntity.getRowId(), phoneRelationEntity.getHash());
    }

    public static final java.util.List<PhoneRelation> AEQbTJ(@NotNull java.util.List<PhoneRelationEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(KWHzl((PhoneRelationEntity) it.next()));
        }
        return arrayList;
    }

    public static final java.util.List<PhoneRelationGroup> copydefault(@NotNull java.util.List<PhoneRelationEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.String phoneRelationId = ((PhoneRelationEntity) obj).getPhoneRelationId();
            java.lang.Object arrayList = linkedHashMap.get(phoneRelationId);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(phoneRelationId, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.List list2 = (java.util.List) entry.getValue();
            java.lang.String name = ((PhoneRelationEntity) CollectionsKt___CollectionsKt.AuCTelauCTel(list2)).getName();
            if (name == null) {
                name = "";
            }
            arrayList2.add(new PhoneRelationGroup(str, name, CollectionsKt___CollectionsKt.EZpvd(AEQbTJ(list2), new Application())));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: o.sSz$Application */
    public static final class Application<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(((PhoneRelation) t).getRowId(), ((PhoneRelation) t2).getRowId());
        }
    }
}
