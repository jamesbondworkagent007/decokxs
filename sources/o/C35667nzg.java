package o;

import com.okinc.im.bean.ContactType;
import com.okinc.im.bean.IMRelationInfo;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nzg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35667nzg {
    public static final C35667nzg EZpvd = new C35667nzg();

    /* JADX INFO: renamed from: o.nzg$Activity */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ContactType.values().length];
            try {
                iArr[ContactType.ALL_FRIEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ContactType.BOTH_FRIEND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ContactType.SINGLE_FRIEND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    private C35667nzg() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.nzg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.List filterRelationList$default(C35667nzg c35667nzg, java.util.List list, ContactType contactType, boolean z, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            contactType = null;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        return c35667nzg.OLrzqt(list, contactType, z, list2);
    }

    public static /* synthetic */ IMRelationInfo toIMRelationInfo$default(C35667nzg c35667nzg, RelationInfo relationInfo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return c35667nzg.OLrzqt(relationInfo, str);
    }

    public final IMRelationInfo OLrzqt(@NotNull RelationInfo relationInfo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(relationInfo, "");
        return new IMRelationInfo(relationInfo.getContactsId(), relationInfo.getAvatar(), C44157sFk.KWHzl(relationInfo, str), relationInfo.getHash());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<RelationInfo> OLrzqt(@NotNull java.util.List<RelationInfo> list, ContactType contactType, boolean z, java.util.List<java.lang.String> list2) {
        boolean zIsBothFriend;
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            RelationInfo relationInfo = (RelationInfo) obj;
            int i = contactType == null ? -1 : Activity.copydefault[contactType.ordinal()];
            boolean zContains = false;
            if (i == 1) {
                zIsBothFriend = true;
            } else if (i == 2) {
                zIsBothFriend = relationInfo.isBothFriend();
            } else if (i == 3 && (!relationInfo.isFriend() || relationInfo.isBothFriend())) {
                zIsBothFriend = false;
            }
            boolean z2 = (z && relationInfo.isCurrentUser()) ? false : true;
            if (!C33129mqd.KWHzl((java.util.Collection) list2)) {
                zContains = true;
            } else if (list2 != null) {
                zContains = list2.contains(relationInfo.getContactsId());
            }
            if (zIsBothFriend && z2 && zContains) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
