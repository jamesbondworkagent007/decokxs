package o;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sFt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44166sFt {

    /* JADX INFO: renamed from: o.sFt$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.GROUP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKConversationType.PRIVATE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[GroupTagType.values().length];
            try {
                iArr2[GroupTagType.VIP_CHAT_GROUP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[GroupTagType.OTC_AGENT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[GroupTagType.OK_ASSISTANT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr2;
        }
    }

    public static final java.lang.String KWHzl(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        if (StateListAnimator.copydefault[oKConversation.getConversationType().ordinal()] == 1) {
            return oKConversation.getTargetId();
        }
        return null;
    }

    public static final java.lang.String copydefault(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        if (StateListAnimator.copydefault[oKConversation.getConversationType().ordinal()] == 2) {
            return oKConversation.getContactId();
        }
        return null;
    }

    public static final boolean OLrzqt(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        int i = StateListAnimator.AEQbTJ[oKConversation.getGroupType().ordinal()];
        return i == 1 || i == 2 || i == 3;
    }
}
