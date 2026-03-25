package o;

import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.im.OKReferenceMessage;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oGK {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @yCM
    public oGK() {
    }

    public final java.util.List<C35254nrp> EZpvd(@NotNull java.util.List<C35254nrp> list, long j) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            OKMessageContent content = ((C35254nrp) obj).OLrzqt().getContent();
            OKReferenceMessage oKReferenceMessage = content instanceof OKReferenceMessage ? (OKReferenceMessage) content : null;
            if (Intrinsics.EZpvd((java.lang.Object) (oKReferenceMessage != null ? oKReferenceMessage.getReferMsgUid() : null), (java.lang.Object) java.lang.String.valueOf(j))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
