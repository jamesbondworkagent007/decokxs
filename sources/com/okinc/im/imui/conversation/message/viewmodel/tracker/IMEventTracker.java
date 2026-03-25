package com.okinc.im.imui.conversation.message.viewmodel.tracker;

import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import com.okinc.okimcore.model.other.GroupRole;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C43251rlk;
import o.C56444yFp;
import o.InterfaceC35180nqU;
import o.InterfaceC56445yFq;
import o.sDN;
import o.sFU;
import o.sHZ;
import o.sIR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class IMEventTracker {

    /* JADX INFO: loaded from: classes18.dex */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKConversationType.values().length];
            try {
                iArr[OKConversationType.GROUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            OLrzqt = iArr;
            int[] iArr2 = new int[GroupRole.values().length];
            try {
                iArr2[GroupRole.Owner.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[GroupRole.Administrator.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            copydefault = iArr2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LinkLocation {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ LinkLocation[] $VALUES;
        private final String value;
        public static final LinkLocation Message = new LinkLocation("Message", 0, "message");
        public static final LinkLocation Announcement = new LinkLocation("Announcement", 1, "announcement");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ LinkLocation[] $values() {
            return new LinkLocation[]{Message, Announcement};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<LinkLocation> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private LinkLocation(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            LinkLocation[] linkLocationArr$values = $values();
            $VALUES = linkLocationArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(linkLocationArr$values);
        }

        public static LinkLocation valueOf(String str) {
            return (LinkLocation) Enum.valueOf(LinkLocation.class, str);
        }

        public static LinkLocation[] values() {
            return (LinkLocation[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ void trackIMLinkClicked$default(IMEventTracker iMEventTracker, CoroutineScope coroutineScope, String str, String str2, LinkLocation linkLocation, String str3, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        iMEventTracker.OLrzqt(coroutineScope, str, str2, linkLocation, str3);
    }

    public final void OLrzqt(@NotNull CoroutineScope coroutineScope, @NotNull String str, @NotNull String str2, @NotNull LinkLocation linkLocation, String str3) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(linkLocation, "");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, sDN.copydefault.copydefault(), null, new IMEventTracker$trackIMLinkClicked$1(str, this, str3, linkLocation, str2, null), 2, null);
    }

    public final int EZpvd(OKConversation oKConversation) {
        return TaskDescription.OLrzqt[oKConversation.getConversationType().ordinal()] == 1 ? 0 : 1;
    }

    public final Integer AEQbTJ(OKConversation oKConversation) {
        InterfaceC35180nqU interfaceC35180nqU;
        sFU sfuEZpvd;
        GroupInfo groupInfoOLrzqt;
        if (oKConversation.getConversationType() != OKConversationType.GROUP || (interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class)) == null || (sfuEZpvd = interfaceC35180nqU.EZpvd()) == null || (groupInfoOLrzqt = sfuEZpvd.OLrzqt(oKConversation.getTargetId())) == null) {
            return null;
        }
        return groupInfoOLrzqt.getType();
    }

    public final Integer OLrzqt(OKConversation oKConversation, String str) {
        sHZ shzAEQbTJ;
        sIR sirCopydefault;
        GroupMemberInfo groupMemberInfoOLrzqt;
        GroupRole role = null;
        if (oKConversation.getConversationType() != OKConversationType.GROUP || str == null) {
            return null;
        }
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null && (shzAEQbTJ = interfaceC35180nqU.AEQbTJ()) != null && (sirCopydefault = shzAEQbTJ.copydefault()) != null && (groupMemberInfoOLrzqt = sirCopydefault.OLrzqt(oKConversation.getTargetId(), str)) != null) {
            role = groupMemberInfoOLrzqt.getRole();
        }
        int i = role == null ? -1 : TaskDescription.copydefault[role.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            i2 = 2;
        }
        return Integer.valueOf(i2);
    }
}
