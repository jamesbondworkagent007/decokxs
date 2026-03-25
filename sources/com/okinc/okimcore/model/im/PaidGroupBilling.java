package com.okinc.okimcore.model.im;

import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class PaidGroupBilling extends GroupSystemMessage {
    public static final int $stable = 0;
    public static final ActionBar Companion = new ActionBar(null);
    private final ChangeType changeType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChangeType getChangeType() {
        return this.changeType;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.PaidGroupBilling.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ChangeType copydefault(int i) {
            return i == SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_PAID_GROUP_BILLING.getSystemAction() ? ChangeType.ENABLE : i == SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_UPDATE_PAID_GROUP_BILLING.getSystemAction() ? ChangeType.UPDATE : i == SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_PAID_GROUP_BILLING.getSystemAction() ? ChangeType.DISABLE : ChangeType.NONE;
        }
    }

    public PaidGroupBilling(@NotNull ChangeType changeType) {
        Intrinsics.checkNotNullParameter(changeType, "");
        this.changeType = changeType;
    }
}
