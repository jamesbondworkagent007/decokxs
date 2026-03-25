package com.okinc.planet.utils;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.okinc.im.bean.ChatOrigin;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import kotlin.jvm.internal.Intrinsics;
import o.C43251rlk;
import o.C56444yFp;
import o.InterfaceC35180nqU;
import o.InterfaceC35698oAj;
import o.InterfaceC56445yFq;
import o.pUU;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class IMUtils {
    public static final IMUtils KWHzl = new IMUtils();

    private IMUtils() {
    }

    public final void OLrzqt(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null) {
            interfaceC35180nqU.KWHzl(fragmentActivity, yDY.gEmmrt(new InterfaceC35698oAj.Fragment(true), new InterfaceC35698oAj.StateListAnimator(true), new InterfaceC35698oAj.TaskDescription(true), new InterfaceC35698oAj.Application(true)));
        }
    }

    public final Fragment AEQbTJ() {
        pUU.EZpvd("IMUtils", "makeConversationListPage");
        InterfaceC35180nqU interfaceC35180nqU = (InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class);
        if (interfaceC35180nqU != null) {
            return interfaceC35180nqU.copydefault(ChatOrigin.PLANET);
        }
        return null;
    }

    public final boolean OLrzqt() {
        return !(((InterfaceC35180nqU) C43251rlk.OLrzqt(InterfaceC35180nqU.class)) != null ? r0.valueOf() : false);
    }

    public final boolean copydefault() {
        return !(((OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class)) != null ? r0.AEQbTJ(OKComplianceRestrictionService.Feature.CR_TWITTER) : false);
    }

    public final boolean EZpvd() {
        return !(((OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class)) != null ? r0.AEQbTJ(OKComplianceRestrictionService.Feature.COPY_TRADING) : false);
    }

    public final boolean KWHzl() {
        return !(((OKComplianceRestrictionService) C43251rlk.OLrzqt(OKComplianceRestrictionService.class)) != null ? r0.AEQbTJ(OKComplianceRestrictionService.Feature.LIVE_STREAMING) : false);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class UnReadMsgStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ UnReadMsgStatus[] $VALUES;
        public static final UnReadMsgStatus DEFAULT = new UnReadMsgStatus("DEFAULT", 0, "NULL");
        public static final UnReadMsgStatus RESET = new UnReadMsgStatus("RESET", 1, "RESET");
        private final String flag;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ UnReadMsgStatus[] $values() {
            return new UnReadMsgStatus[]{DEFAULT, RESET};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<UnReadMsgStatus> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFlag() {
            return this.flag;
        }

        private UnReadMsgStatus(String str, int i, String str2) {
            this.flag = str2;
        }

        static {
            UnReadMsgStatus[] unReadMsgStatusArr$values = $values();
            $VALUES = unReadMsgStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(unReadMsgStatusArr$values);
        }

        public static UnReadMsgStatus valueOf(String str) {
            return (UnReadMsgStatus) Enum.valueOf(UnReadMsgStatus.class, str);
        }

        public static UnReadMsgStatus[] values() {
            return (UnReadMsgStatus[]) $VALUES.clone();
        }
    }
}
