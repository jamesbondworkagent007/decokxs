package o;

import com.okinc.im.message.MessageClusterType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oEe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35801oEe {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public final C35809oEm KWHzl;

    /* JADX INFO: renamed from: o.oEe$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MessageClusterType.values().length];
            try {
                iArr[MessageClusterType.First.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MessageClusterType.Middle.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MessageClusterType.RECALLED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    @yCM
    public C35801oEe(@NotNull C35809oEm c35809oEm) {
        Intrinsics.checkNotNullParameter(c35809oEm, "");
        this.KWHzl = c35809oEm;
    }

    /* JADX INFO: renamed from: o.oEe$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oEe.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(int i, @NotNull OKMessage oKMessage, @NotNull java.util.List<OKMessage> list, @NotNull Continuation<? super java.lang.Boolean> continuation) {
        java.lang.String targetId = oKMessage.getTargetId();
        long seq = oKMessage.getSeq();
        boolean z = true;
        int i2 = i + 1;
        MessageClusterType messageClusterTypeOLrzqt = OLrzqt((OKMessage) CollectionsKt___CollectionsKt.AkhnZx(list, i2), i2, list);
        pUU.KWHzl("GetClusterAvatarVisibility", "[" + targetId + "][" + seq + "]: nextMessageClusterType=" + messageClusterTypeOLrzqt);
        int i3 = messageClusterTypeOLrzqt == null ? -1 : TaskDescription.copydefault[messageClusterTypeOLrzqt.ordinal()];
        if (i3 != -1 && i3 != 1) {
            if (i3 == 2) {
                z = false;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    OKMessageContent content = ((OKMessage) obj).getContent();
                    if (content != null && !C44169sFw.KWHzl(content)) {
                        arrayList.add(obj);
                    }
                }
                MessageClusterType messageClusterTypeOLrzqt2 = OLrzqt((OKMessage) CollectionsKt___CollectionsKt.AkhnZx(arrayList, arrayList.lastIndexOf(oKMessage) + 1), i2, arrayList);
                if (messageClusterTypeOLrzqt2 != null && messageClusterTypeOLrzqt2 != MessageClusterType.First) {
                }
            }
        }
        return C56443yFo.KWHzl(z);
    }

    public final MessageClusterType OLrzqt(OKMessage oKMessage, int i, java.util.List<OKMessage> list) {
        if (oKMessage != null) {
            return this.KWHzl.AEQbTJ(i, oKMessage, list);
        }
        return null;
    }
}
