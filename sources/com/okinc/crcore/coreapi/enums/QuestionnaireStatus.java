package com.okinc.crcore.coreapi.enums;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class QuestionnaireStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ QuestionnaireStatus[] $VALUES;
    public static final Application Companion;
    private final String status;
    public static final QuestionnaireStatus SUCCESS = new QuestionnaireStatus("SUCCESS", 0, "SUCCESS");
    public static final QuestionnaireStatus NOT_STARTED = new QuestionnaireStatus("NOT_STARTED", 1, "NOT_STARTED");
    public static final QuestionnaireStatus IN_PROGRESS = new QuestionnaireStatus("IN_PROGRESS", 2, "IN_PROGRESS");
    public static final QuestionnaireStatus FAILURE = new QuestionnaireStatus("FAILURE", 3, "FAILURE");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ QuestionnaireStatus[] $values() {
        return new QuestionnaireStatus[]{SUCCESS, NOT_STARTED, IN_PROGRESS, FAILURE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<QuestionnaireStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    private QuestionnaireStatus(String str, int i, String str2) {
        this.status = str2;
    }

    static {
        QuestionnaireStatus[] questionnaireStatusArr$values = $values();
        $VALUES = questionnaireStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(questionnaireStatusArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.enums.QuestionnaireStatus.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static QuestionnaireStatus valueOf(String str) {
        return (QuestionnaireStatus) Enum.valueOf(QuestionnaireStatus.class, str);
    }

    public static QuestionnaireStatus[] values() {
        return (QuestionnaireStatus[]) $VALUES.clone();
    }
}
