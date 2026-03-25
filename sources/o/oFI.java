package o;

import com.okinc.im.config.page.IMPageType;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessageContent;
import com.okinc.okimcore.model.room.inhouseim.GroupTagType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFI {
    public static final ActionBar Companion = new ActionBar(null);
    public final oFG AEQbTJ;

    @yCM
    public oFI(@NotNull oFG ofg) {
        Intrinsics.checkNotNullParameter(ofg, "");
        this.AEQbTJ = ofg;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFI.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final IMPageType KWHzl(IMPageType iMPageType, OKConversation oKConversation) {
        IMPageType iMPageTypeOLrzqt;
        java.lang.String targetId = oKConversation != null ? oKConversation.getTargetId() : null;
        if (iMPageType != null) {
            iMPageTypeOLrzqt = iMPageType;
        } else if (oKConversation == null) {
            iMPageTypeOLrzqt = IMPageType.NORMAL_IM;
        } else {
            GroupTagType groupType = oKConversation.getGroupType();
            OKMessageContent latestMessage = oKConversation.getLatestMessage();
            C35248nrj c35248nrj = new C35248nrj(groupType, latestMessage != null ? latestMessage.getExtra() : null);
            pUU.KWHzl("GetPageTypeUseCase", "[" + targetId + "] execute: referenceData: " + c35248nrj);
            iMPageTypeOLrzqt = this.AEQbTJ.OLrzqt(c35248nrj);
            pUU.KWHzl("GetPageTypeUseCase", "[" + targetId + "] execute: pageTypeIntercepted: " + iMPageTypeOLrzqt);
            if (iMPageTypeOLrzqt == null) {
                iMPageTypeOLrzqt = IMPageType.NORMAL_IM;
            }
        }
        pUU.KWHzl("GetPageTypeUseCase", "[" + targetId + "] execute: fixedPageType: " + iMPageType);
        pUU.KWHzl("GetPageTypeUseCase", "[" + targetId + "] execute: pageType: " + iMPageTypeOLrzqt);
        return iMPageTypeOLrzqt;
    }
}
