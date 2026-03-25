package com.onesignal.influence.domain;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C59449zhJ;

/* JADX INFO: loaded from: classes12.dex */
public enum OSInfluenceType {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;

    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final OSInfluenceType fromString(String str) {
        return Companion.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDirect() {
        return this == DIRECT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDisabled() {
        return this == DISABLED;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isIndirect() {
        return this == INDIRECT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isUnattributed() {
        return this == UNATTRIBUTED;
    }

    public final boolean isAttributed() {
        return isDirect() || isIndirect();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.onesignal.influence.domain.OSInfluenceType.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final OSInfluenceType AEQbTJ(String str) {
            OSInfluenceType oSInfluenceType;
            if (str != null) {
                OSInfluenceType[] oSInfluenceTypeArrValues = OSInfluenceType.values();
                int length = oSInfluenceTypeArrValues.length;
                do {
                    length--;
                    if (length < 0) {
                        oSInfluenceType = null;
                        break;
                    }
                    oSInfluenceType = oSInfluenceTypeArrValues[length];
                } while (!C59449zhJ.gEmmrt(oSInfluenceType.name(), str, true));
            } else {
                oSInfluenceType = null;
                break;
            }
            return oSInfluenceType == null ? OSInfluenceType.UNATTRIBUTED : oSInfluenceType;
        }
    }
}
