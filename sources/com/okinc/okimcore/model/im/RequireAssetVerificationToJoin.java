package com.okinc.okimcore.model.im;

import com.okinc.okimcore.model.im.inhouseim.ws.SystemMessageData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class RequireAssetVerificationToJoin extends GroupSystemMessage {
    public static final int $stable = 0;
    public static final Activity Companion = new Activity(null);
    private final ChangeType changeType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChangeType getChangeType() {
        return this.changeType;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.RequireAssetVerificationToJoin.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final ChangeType copydefault(int i) {
            return i == SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_ENABLE_ASSET_VERIFICATION.getSystemAction() ? ChangeType.ENABLE : i == SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_UPDATE_ASSET_VERIFICATION.getSystemAction() ? ChangeType.UPDATE : i == SystemMessageData.VisibleSystemAction.SYSTEM_ACTION_DISABLE_ASSET_VERIFICATION.getSystemAction() ? ChangeType.DISABLE : ChangeType.NONE;
        }
    }

    public RequireAssetVerificationToJoin(@NotNull ChangeType changeType) {
        Intrinsics.checkNotNullParameter(changeType, "");
        this.changeType = changeType;
    }
}
