package o;

import com.okinc.core.util.SPUtils;
import com.okinc.im.config.page.IMPageType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oGN {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final oFJ AEQbTJ;
    public final InterfaceC44177sGd OLrzqt;

    @yCM
    public oGN(@NotNull InterfaceC44177sGd interfaceC44177sGd, @NotNull oFJ ofj) {
        Intrinsics.checkNotNullParameter(interfaceC44177sGd, "");
        Intrinsics.checkNotNullParameter(ofj, "");
        this.OLrzqt = interfaceC44177sGd;
        this.AEQbTJ = ofj;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oGN.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final boolean copydefault(@NotNull IMPageType iMPageType) {
        Intrinsics.checkNotNullParameter(iMPageType, "");
        boolean zCopydefault = this.OLrzqt.copydefault();
        boolean z = false;
        boolean z2 = SPUtils.getBoolean("isChangeUserDataTipShowed", false);
        boolean zAkhnZx = this.AEQbTJ.KWHzl(iMPageType).AkhnZx();
        if (zCopydefault && !z2 && zAkhnZx) {
            z = true;
        }
        pUU.KWHzl("GetCurrentUserIsNeedCompleteUserInfoUseCase", "isShowTips:" + zCopydefault + ", hasUserInfo:" + z2 + ", isAllowFromPageConfig:" + zAkhnZx + ", final result:" + z);
        return z;
    }
}
