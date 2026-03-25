package com.okinc.okex.feedback;

import androidx.annotation.ColorRes;
import androidx.annotation.StringRes;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C47315tni;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class FeedbackStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FeedbackStatus[] $VALUES;
    public static final Activity Companion;
    private final int bg;
    private final int color;
    private final int status;
    private final int text;
    public static final FeedbackStatus ALL = new FeedbackStatus("ALL", 0, 0, C47315tni.PendingIntent.EZpvd, C47315tni.Activity.copydefault, C47315tni.Activity.AEQbTJ);
    public static final FeedbackStatus SUBMITTED = new FeedbackStatus("SUBMITTED", 1, 1, C47315tni.PendingIntent.AxsJAY, C47315tni.Activity.copydefault, C47315tni.Activity.AEQbTJ);
    public static final FeedbackStatus PENDING = new FeedbackStatus(CardSyncResponse.PENDING, 2, 2, C47315tni.PendingIntent.AwvSrB, C47315tni.Activity.copydefault, C47315tni.Activity.AEQbTJ);
    public static final FeedbackStatus DECLINED = new FeedbackStatus("DECLINED", 3, 3, C47315tni.PendingIntent.zsXlph, C47315tni.Activity.KWHzl, C47315tni.Activity.EZpvd);
    public static final FeedbackStatus REVIEWING_FEEDBACK = new FeedbackStatus("REVIEWING_FEEDBACK", 4, 4, C47315tni.PendingIntent.swzYdv, C47315tni.Activity.copydefault, C47315tni.Activity.AEQbTJ);
    public static final FeedbackStatus REVIEWING_BUG = new FeedbackStatus("REVIEWING_BUG", 5, 5, C47315tni.PendingIntent.gHZMYf, C47315tni.Activity.copydefault, C47315tni.Activity.AEQbTJ);
    public static final FeedbackStatus PENDING_YOUR_APPROVAL = new FeedbackStatus("PENDING_YOUR_APPROVAL", 6, 6, C47315tni.PendingIntent.hvKCwS, C47315tni.Activity.copydefault, C47315tni.Activity.AEQbTJ);
    public static final FeedbackStatus TO_BE_REWARDED = new FeedbackStatus("TO_BE_REWARDED", 7, 7, C47315tni.PendingIntent.iPSTqm, C47315tni.Activity.copydefault, C47315tni.Activity.AEQbTJ);
    public static final FeedbackStatus REWARDED = new FeedbackStatus("REWARDED", 8, 8, C47315tni.PendingIntent.zuBGHE, C47315tni.Activity.OLrzqt, C47315tni.Activity.valueOf);
    public static final FeedbackStatus YOU_REJECTED_THE_RESULT = new FeedbackStatus("YOU_REJECTED_THE_RESULT", 9, 9, C47315tni.PendingIntent.sVXHln, C47315tni.Activity.copydefault, C47315tni.Activity.AEQbTJ);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FeedbackStatus[] $values() {
        return new FeedbackStatus[]{ALL, SUBMITTED, PENDING, DECLINED, REVIEWING_FEEDBACK, REVIEWING_BUG, PENDING_YOUR_APPROVAL, TO_BE_REWARDED, REWARDED, YOU_REJECTED_THE_RESULT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FeedbackStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBg() {
        return this.bg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getColor() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getText() {
        return this.text;
    }

    private FeedbackStatus(String str, @StringRes int i, @ColorRes int i2, @ColorRes int i3, int i4, int i5) {
        this.status = i2;
        this.text = i3;
        this.color = i4;
        this.bg = i5;
    }

    static {
        FeedbackStatus[] feedbackStatusArr$values = $values();
        $VALUES = feedbackStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(feedbackStatusArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okex.feedback.FeedbackStatus.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final FeedbackStatus EZpvd(int i) {
            for (FeedbackStatus feedbackStatus : FeedbackStatus.values()) {
                if (feedbackStatus.getStatus() == i) {
                    return feedbackStatus;
                }
            }
            return null;
        }
    }

    public static FeedbackStatus valueOf(String str) {
        return (FeedbackStatus) Enum.valueOf(FeedbackStatus.class, str);
    }

    public static FeedbackStatus[] values() {
        return (FeedbackStatus[]) $VALUES.clone();
    }
}
