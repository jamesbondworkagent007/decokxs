package o;

import com.okinc.im.imui.broadcastmessages.messagelist.viewproviders.BroadcastWelcomeSystemMessage;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.CreateBroadcastChannelResponse;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35764oCv {
    public final oGM KWHzl;
    public final oGH copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    @yCM
    public C35764oCv(@NotNull oGH ogh, @NotNull oGM ogm) {
        Intrinsics.checkNotNullParameter(ogh, "");
        Intrinsics.checkNotNullParameter(ogm, "");
        this.copydefault = ogh;
        this.KWHzl = ogm;
    }

    /* JADX INFO: renamed from: o.oCv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oCv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final java.lang.Object AEQbTJ(@NotNull CreateBroadcastChannelResponse createBroadcastChannelResponse, @NotNull Continuation<? super C35254nrp> continuation) {
        java.util.ArrayList arrayList;
        java.lang.String strCopydefault;
        java.util.List<CreateBroadcastChannelResponse.UserInfo> listOLrzqt = createBroadcastChannelResponse.OLrzqt();
        if (listOLrzqt != null) {
            arrayList = new java.util.ArrayList();
            for (CreateBroadcastChannelResponse.UserInfo userInfo : listOLrzqt) {
                java.lang.String strKWHzl = userInfo.KWHzl();
                if (strKWHzl == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strKWHzl)) {
                    boolean zOLrzqt = C33142mqq.EZpvd.OLrzqt();
                    java.lang.String strAEQbTJ = userInfo.AEQbTJ();
                    if (strAEQbTJ == null) {
                        strAEQbTJ = "";
                    }
                    if (zOLrzqt || (strCopydefault = userInfo.copydefault()) == null || strCopydefault.length() == 0) {
                        strCopydefault = strAEQbTJ;
                    }
                } else {
                    strCopydefault = userInfo.KWHzl();
                }
                if (strCopydefault != null) {
                    arrayList.add(strCopydefault);
                }
            }
        } else {
            arrayList = null;
        }
        pUU.KWHzl("GetBroadcastWelcomeMessageBcBcResponseUseCase", "nameList: " + arrayList);
        pUU.KWHzl("GetBroadcastWelcomeMessageBcBcResponseUseCase", "total: " + createBroadcastChannelResponse.EZpvd());
        BroadcastWelcomeSystemMessage broadcastWelcomeSystemMessage = new BroadcastWelcomeSystemMessage();
        broadcastWelcomeSystemMessage.AEQbTJ(arrayList);
        broadcastWelcomeSystemMessage.EZpvd(createBroadcastChannelResponse.EZpvd());
        oGH ogh = this.copydefault;
        OKMessage oKMessageAEQbTJ = OKMessage.Companion.AEQbTJ("", OKConversationType.BROADCAST, broadcastWelcomeSystemMessage);
        oKMessageAEQbTJ.setSeq(0L);
        oKMessageAEQbTJ.setSenderUserId(this.KWHzl.AEQbTJ());
        oKMessageAEQbTJ.setSentTime(java.lang.System.currentTimeMillis());
        return ogh.EZpvd(oKMessageAEQbTJ, (256 & 2) != 0 ? yDY.AhwBna() : null, (256 & 4) != 0 ? null : null, (256 & 8) != 0 ? null : null, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? null : null, (256 & 64) != 0 ? null : null, (256 & 128) != 0 ? 0 : null, (256 & 256) != 0 ? null : null, continuation);
    }
}
