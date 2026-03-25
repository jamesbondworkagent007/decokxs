package o;

import com.okinc.im.bean.IMUserInfo;
import com.okinc.okimcore.model.im.OKMessage;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oAi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C35697oAi extends oAX {
    public static final C35697oAi KWHzl = new C35697oAi();
    public static final Activity OLrzqt;

    /* JADX INFO: renamed from: o.oAi$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKMessage.MessageDirection.values().length];
            try {
                iArr[OKMessage.MessageDirection.SEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OKMessage.MessageDirection.RECEIVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    private C35697oAi() {
    }

    static {
        Activity activity = new Activity();
        OLrzqt = activity;
        C35699oAk.AEQbTJ.KWHzl(activity);
        C35695oAg.AEQbTJ.KWHzl(activity);
    }

    /* JADX INFO: renamed from: o.oAi$Activity */
    public static final class Activity implements InterfaceC35717oBb {
        @Override // o.InterfaceC35717oBb
        public void copydefault(IMUserInfo iMUserInfo) {
            Intrinsics.checkNotNullParameter(iMUserInfo, "");
            C35697oAi.KWHzl.copydefault(iMUserInfo);
        }
    }

    @Override // o.oAX
    public java.lang.Object OLrzqt(@NotNull OKMessage oKMessage, @NotNull Continuation<? super IMUserInfo> continuation) {
        int i = StateListAnimator.EZpvd[oKMessage.getMessageDirection().ordinal()];
        if (i == 1) {
            return C35699oAk.AEQbTJ.OLrzqt(oKMessage, continuation);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C35695oAg.AEQbTJ.OLrzqt(oKMessage, continuation);
    }
}
