package o;

import com.okinc.okimcore.model.exception.ChannelErrorCode;
import com.okinc.okimcore.model.exception.ChannelErrorStatus;
import com.okinc.okimcore.model.exception.OKIMReportException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.sDX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sSf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44503sSf implements InterfaceC44505sSh {
    public final android.content.Context AEQbTJ;
    public final java.util.List<ChannelErrorStatus> EZpvd;

    /* JADX INFO: renamed from: o.sSf$ActionBar */
    /* JADX INFO: loaded from: classes16.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChannelErrorStatus.values().length];
            try {
                iArr[ChannelErrorStatus.InvalidChannel.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChannelErrorStatus.DisconnectByKick.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChannelErrorStatus.NotInGroup.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ChannelErrorStatus.RejectedByBlackList.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[ChannelErrorStatus.Unknown.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            OLrzqt = iArr;
        }
    }

    @yCM
    public C44503sSf(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.AEQbTJ = context;
        this.EZpvd = yDY.gEmmrt(ChannelErrorStatus.DisconnectByKick, ChannelErrorStatus.NotInGroup);
    }

    @Override // o.InterfaceC44505sSh
    public void AEQbTJ(@NotNull ChannelErrorCode channelErrorCode) {
        Intrinsics.checkNotNullParameter(channelErrorCode, "");
        if (!this.EZpvd.contains(channelErrorCode.getStatus())) {
            copydefault(channelErrorCode, "im send message error");
        }
        int i = ActionBar.OLrzqt[channelErrorCode.getStatus().ordinal()];
        if (i == 1) {
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(sDX.StateListAnimator.AuCTel), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        if (i == 2) {
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(sDX.StateListAnimator.fIwbmz), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        if (i == 3) {
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(sDX.StateListAnimator.valueOf), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        if (i == 4) {
            C55328xhq.show$default(C55328xhq.OLrzqt, java.lang.Integer.valueOf(sDX.StateListAnimator.fARcdN), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            return;
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        pUU.EZpvd("msg_error", "un handle msg error==" + channelErrorCode.getCode() + " -> " + channelErrorCode.getMessage());
        Unit unit = Unit.INSTANCE;
    }

    public void copydefault(@NotNull ChannelErrorCode channelErrorCode, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(channelErrorCode, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (C34703nhO.AhwBna(this.AEQbTJ)) {
            return;
        }
        C44170sFx.KWHzl(new OKIMReportException(str + ", uuid is " + C44157sFk.copydefault(C44157sFk.gEmmrt()) + ", error code is :" + channelErrorCode.getCode() + ", error message is " + channelErrorCode.getMessage()));
    }
}
