package o;

import com.okinc.im.bean.ChatOrigin;
import com.okinc.okimcore.model.im.RelationSourceType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nqW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35182nqW {

    /* JADX INFO: renamed from: o.nqW$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChatOrigin.values().length];
            try {
                iArr[ChatOrigin.AFFILIATE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChatOrigin.P2P.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatOrigin.PLANET.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            OLrzqt = iArr;
        }
    }

    public static final ChatOrigin KWHzl(@NotNull java.lang.String str) {
        ChatOrigin next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<ChatOrigin> it = ChatOrigin.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) next.getValue(), (java.lang.Object) str)) {
                break;
            }
        }
        ChatOrigin chatOrigin = next;
        return chatOrigin == null ? ChatOrigin.OKIM_SERVICE : chatOrigin;
    }

    public static final RelationSourceType AEQbTJ(ChatOrigin chatOrigin) {
        int i = chatOrigin == null ? -1 : TaskDescription.OLrzqt[chatOrigin.ordinal()];
        if (i == 1) {
            return RelationSourceType.AFFILIATE;
        }
        if (i == 2) {
            return RelationSourceType.P2P;
        }
        if (i == 3) {
            return RelationSourceType.ORBIT;
        }
        return RelationSourceType.NORMAL;
    }
}
