package o;

import com.okinc.okimcore.model.im.RelationSourceType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sNW extends C44442sPz<RelationSourceType> {
    public sNW() {
        super("RelationSourceType", (java.lang.Enum[]) RelationSourceType.getEntries().toArray(new RelationSourceType[0]), new Function1() { // from class: o.sOe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(sNW.EZpvd((RelationSourceType) obj));
            }
        }, new Function1() { // from class: o.sOc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sNW.KWHzl(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int EZpvd(RelationSourceType relationSourceType) {
        Intrinsics.checkNotNullParameter(relationSourceType, "");
        return relationSourceType.getValue();
    }

    public static final RelationSourceType KWHzl(int i) {
        RelationSourceType next;
        java.util.Iterator<RelationSourceType> it = RelationSourceType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getValue() == i) {
                break;
            }
        }
        RelationSourceType relationSourceType = next;
        return relationSourceType == null ? RelationSourceType.UNKNOWN : relationSourceType;
    }
}
