package com.onesignal.influence.domain;

import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public enum OSInfluenceChannel {
    IAM("iam"),
    NOTIFICATION(RemoteMessageConst.NOTIFICATION);

    public static final StateListAnimator Companion = new StateListAnimator(null);
    private final String nameValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final OSInfluenceChannel fromString(String str) {
        return Companion.copydefault(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.nameValue;
    }

    OSInfluenceChannel(String str) {
        this.nameValue = str;
    }

    public final boolean equalsName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((Object) this.nameValue, (Object) str);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.onesignal.influence.domain.OSInfluenceChannel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final OSInfluenceChannel copydefault(String str) {
            OSInfluenceChannel oSInfluenceChannel;
            if (str != null) {
                OSInfluenceChannel[] oSInfluenceChannelArrValues = OSInfluenceChannel.values();
                int length = oSInfluenceChannelArrValues.length;
                do {
                    length--;
                    if (length < 0) {
                        oSInfluenceChannel = null;
                        break;
                    }
                    oSInfluenceChannel = oSInfluenceChannelArrValues[length];
                } while (!oSInfluenceChannel.equalsName(str));
            } else {
                oSInfluenceChannel = null;
                break;
            }
            return oSInfluenceChannel == null ? OSInfluenceChannel.NOTIFICATION : oSInfluenceChannel;
        }
    }
}
