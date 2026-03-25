package com.okinc.auth.impl.reset2fa.ui;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class ResetMfaNextPage {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ResetMfaNextPage[] $VALUES;
    public static final ActionBar Companion;
    private final String nextPage;
    public static final ResetMfaNextPage MFA_VERIFICATION = new ResetMfaNextPage("MFA_VERIFICATION", 0, "MFA_VERIFICATION");
    public static final ResetMfaNextPage UPLOAD_DOCUMENTS = new ResetMfaNextPage("UPLOAD_DOCUMENTS", 1, "UPLOAD_DOCUMENTS");
    public static final ResetMfaNextPage UPLOAD_DOCUMENTS_WITHOUT_SELFIE = new ResetMfaNextPage("UPLOAD_DOCUMENTS_WITHOUT_SELFIE", 2, "UPLOAD_DOCUMENTS_WITHOUT_SELFIE");
    public static final ResetMfaNextPage TICKET_SUBMITTED = new ResetMfaNextPage("TICKET_SUBMITTED", 3, "TICKET_SUBMITTED");
    public static final ResetMfaNextPage LINK_NEW_MFA = new ResetMfaNextPage("LINK_NEW_MFA", 4, "LINK_NEW_MFA");
    public static final ResetMfaNextPage SUCCESS = new ResetMfaNextPage("SUCCESS", 5, "SUCCESS");
    public static final ResetMfaNextPage NON_PAGE = new ResetMfaNextPage("NON_PAGE", 6, "NON_PAGE");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ResetMfaNextPage[] $values() {
        return new ResetMfaNextPage[]{MFA_VERIFICATION, UPLOAD_DOCUMENTS, UPLOAD_DOCUMENTS_WITHOUT_SELFIE, TICKET_SUBMITTED, LINK_NEW_MFA, SUCCESS, NON_PAGE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ResetMfaNextPage> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextPage() {
        return this.nextPage;
    }

    private ResetMfaNextPage(String str, int i, String str2) {
        this.nextPage = str2;
    }

    static {
        ResetMfaNextPage[] resetMfaNextPageArr$values = $values();
        $VALUES = resetMfaNextPageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(resetMfaNextPageArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.reset2fa.ui.ResetMfaNextPage.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final ResetMfaNextPage copydefault(@NotNull String str) {
            ResetMfaNextPage resetMfaNextPage;
            Intrinsics.checkNotNullParameter(str, "");
            ResetMfaNextPage[] resetMfaNextPageArrValues = ResetMfaNextPage.values();
            int length = resetMfaNextPageArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    resetMfaNextPage = null;
                    break;
                }
                resetMfaNextPage = resetMfaNextPageArrValues[i];
                if (Intrinsics.EZpvd((Object) resetMfaNextPage.getNextPage(), (Object) str)) {
                    break;
                }
                i++;
            }
            return resetMfaNextPage == null ? ResetMfaNextPage.NON_PAGE : resetMfaNextPage;
        }
    }

    public static ResetMfaNextPage valueOf(String str) {
        return (ResetMfaNextPage) Enum.valueOf(ResetMfaNextPage.class, str);
    }

    public static ResetMfaNextPage[] values() {
        return (ResetMfaNextPage[]) $VALUES.clone();
    }
}
