package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oeA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C36603oeA {
    public long AEQbTJ;
    public boolean EZpvd;
    public OKConversation KWHzl;
    public final ChatOrigin OLrzqt;
    public boolean copydefault;
    public final java.lang.String djBIcL;
    public java.lang.Integer gEmmrt;

    /* JADX INFO: renamed from: o.oeA$Application */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.GROUP.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
        }
    }

    public C36603oeA(ChatOrigin chatOrigin, java.lang.String str) {
        this.OLrzqt = chatOrigin;
        this.djBIcL = str;
    }

    public final void OLrzqt() {
        this.AEQbTJ = java.lang.System.currentTimeMillis();
    }

    public final void AEQbTJ(@NotNull OKConversation oKConversation) {
        Intrinsics.checkNotNullParameter(oKConversation, "");
        this.KWHzl = oKConversation;
        copydefault();
    }

    public final void copydefault(int i) {
        this.gEmmrt = java.lang.Integer.valueOf(i);
        copydefault();
    }

    public final void AEQbTJ() {
        this.copydefault = true;
        copydefault();
    }

    public final void copydefault() {
        int iIntValue;
        if (this.EZpvd) {
            return;
        }
        boolean z = this.copydefault;
        OKConversation oKConversation = this.KWHzl;
        java.lang.Integer num = this.gEmmrt;
        if (!z || oKConversation == null || num == null) {
            return;
        }
        OKConversationType conversationType = oKConversation.getConversationType();
        int[] iArr = Application.AEQbTJ;
        final int i = iArr[conversationType.ordinal()] == 1 ? 0 : 1;
        if (iArr[conversationType.ordinal()] == 1) {
            iIntValue = oKConversation.getGroupType().getValue();
        } else {
            iIntValue = num.intValue();
        }
        final int i2 = iIntValue;
        final java.lang.String targetId = oKConversation.getTargetId();
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        long j = this.AEQbTJ;
        java.lang.String conversationTitle = oKConversation.getConversationTitle();
        if (conversationTitle == null) {
            conversationTitle = "";
        }
        final java.lang.String str = conversationTitle;
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        final long j2 = jCurrentTimeMillis - j;
        C32866mlf.EZpvd("IMChat_Full_Page_View", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.oeC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C36603oeA.OLrzqt(i2, i, str, targetId, j2, this, (EventParamsList) obj);
            }
        });
        this.EZpvd = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(int i, int i2, java.lang.String str, java.lang.String str2, long j, C36603oeA c36603oeA, EventParamsList eventParamsList) {
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("group_type", java.lang.String.valueOf(i), true);
        eventParamsList.put("channel_type", java.lang.String.valueOf(i2), true);
        EventParamsList.put$default(eventParamsList, "chat_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "channel_id", str2, false, 4, null);
        EventParamsList.put$default(eventParamsList, "load_time", java.lang.String.valueOf(j), false, 4, null);
        java.lang.String str4 = c36603oeA.djBIcL;
        if (str4 == null) {
            ChatOrigin chatOrigin = c36603oeA.OLrzqt;
            java.lang.String value = chatOrigin != null ? chatOrigin.getValue() : null;
            if (value != null) {
                str3 = value;
            }
        } else {
            if (str4.length() <= 0) {
                str4 = null;
            }
            if (str4 != null) {
                str3 = str4;
            }
        }
        EventParamsList.put$default(eventParamsList, "origin", str3, false, 4, null);
        return Unit.INSTANCE;
    }
}
