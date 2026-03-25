package o;

import com.okinc.im.config.page.IMPageType;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFA {
    public static final Activity Companion = new Activity(null);
    public final oFG copydefault;

    @yCM
    public oFA(@NotNull oFG ofg) {
        Intrinsics.checkNotNullParameter(ofg, "");
        this.copydefault = ofg;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFA.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final IMPageType AEQbTJ(@NotNull OKMessage oKMessage, OKConversation oKConversation, @NotNull IMPageType iMPageType) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(iMPageType, "");
        GroupTagType groupType = oKConversation != null ? oKConversation.getGroupType() : null;
        OKMessageContent content = oKMessage.getContent();
        C35248nrj c35248nrj = new C35248nrj(groupType, content != null ? content.getExtra() : null);
        pUU.KWHzl("CheckPageSwitchUseCase", "referenceData: " + c35248nrj);
        IMPageType iMPageTypeOLrzqt = this.copydefault.OLrzqt(c35248nrj);
        if (iMPageType == iMPageTypeOLrzqt) {
            return null;
        }
        pUU.KWHzl("CheckPageSwitchUseCase", "pageType changed: " + iMPageTypeOLrzqt);
        return iMPageTypeOLrzqt;
    }
}
