package com.okinc.ok_kyc_core.notification;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class RecallNotificationDeeplinkParams {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RecallNotificationDeeplinkParams[] $VALUES;
    public static final Activity Companion;
    public static final RecallNotificationDeeplinkParams IS_LOCAL_PUSH_RECALL = new RecallNotificationDeeplinkParams("IS_LOCAL_PUSH_RECALL", 0, "isLocalPushRecall");
    public static final RecallNotificationDeeplinkParams UNKNOWN = new RecallNotificationDeeplinkParams("UNKNOWN", 1, "unknown");
    private final String param;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RecallNotificationDeeplinkParams.values().length];
            try {
                iArr[RecallNotificationDeeplinkParams.IS_LOCAL_PUSH_RECALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RecallNotificationDeeplinkParams.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RecallNotificationDeeplinkParams[] $values() {
        return new RecallNotificationDeeplinkParams[]{IS_LOCAL_PUSH_RECALL, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RecallNotificationDeeplinkParams> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getParam() {
        return this.param;
    }

    private RecallNotificationDeeplinkParams(String str, int i, String str2) {
        this.param = str2;
    }

    static {
        RecallNotificationDeeplinkParams[] recallNotificationDeeplinkParamsArr$values = $values();
        $VALUES = recallNotificationDeeplinkParamsArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(recallNotificationDeeplinkParamsArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.notification.RecallNotificationDeeplinkParams.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final RecallNotificationType AEQbTJ(@NotNull String str) {
            RecallNotificationDeeplinkParams next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<RecallNotificationDeeplinkParams> it = RecallNotificationDeeplinkParams.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getParam(), (Object) str)) {
                    break;
                }
            }
            RecallNotificationDeeplinkParams recallNotificationDeeplinkParams = next;
            if (recallNotificationDeeplinkParams != null) {
                return recallNotificationDeeplinkParams.toEventTracker();
            }
            return null;
        }
    }

    public final RecallNotificationType toEventTracker() {
        int i = Application.EZpvd[ordinal()];
        if (i == 1) {
            return RecallNotificationType.LOCAL_PUSH_NOTIFICATION;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return RecallNotificationType.UNKNOWN;
    }

    public static RecallNotificationDeeplinkParams valueOf(String str) {
        return (RecallNotificationDeeplinkParams) Enum.valueOf(RecallNotificationDeeplinkParams.class, str);
    }

    public static RecallNotificationDeeplinkParams[] values() {
        return (RecallNotificationDeeplinkParams[]) $VALUES.clone();
    }
}
