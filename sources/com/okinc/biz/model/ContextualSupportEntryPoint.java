package com.okinc.biz.model;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ContextualSupportEntryPoint {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ContextualSupportEntryPoint[] $VALUES;
    public static final ActionBar Companion;
    private final String pageId;
    public static final ContextualSupportEntryPoint LoginInputUsernameAndPasswordPage = new ContextualSupportEntryPoint("LoginInputUsernameAndPasswordPage", 0, "1");
    public static final ContextualSupportEntryPoint Login2faPage = new ContextualSupportEntryPoint("Login2faPage", 1, "2");
    public static final ContextualSupportEntryPoint SignUpPage = new ContextualSupportEntryPoint("SignUpPage", 2, "3");
    public static final ContextualSupportEntryPoint ForgotPasswordPage = new ContextualSupportEntryPoint("ForgotPasswordPage", 3, "4");
    public static final ContextualSupportEntryPoint DropOffKyc = new ContextualSupportEntryPoint("DropOffKyc", 4, "5");
    public static final ContextualSupportEntryPoint Web3SupportCenter = new ContextualSupportEntryPoint("Web3SupportCenter", 5, OrderDetailListItem.SLIP_OUT);
    public static final ContextualSupportEntryPoint Web3Card = new ContextualSupportEntryPoint("Web3Card", 6, "8");
    public static final ContextualSupportEntryPoint CryptoDeposit = new ContextualSupportEntryPoint("CryptoDeposit", 7, "10");
    public static final ContextualSupportEntryPoint CryptoWithdrawal = new ContextualSupportEntryPoint("CryptoWithdrawal", 8, "11");
    public static final ContextualSupportEntryPoint CardHelpCenter = new ContextualSupportEntryPoint("CardHelpCenter", 9, "12");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ContextualSupportEntryPoint[] $values() {
        return new ContextualSupportEntryPoint[]{LoginInputUsernameAndPasswordPage, Login2faPage, SignUpPage, ForgotPasswordPage, DropOffKyc, Web3SupportCenter, Web3Card, CryptoDeposit, CryptoWithdrawal, CardHelpCenter};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ContextualSupportEntryPoint> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getPageId() {
        return this.pageId;
    }

    private ContextualSupportEntryPoint(String str, int i, String str2) {
        this.pageId = str2;
    }

    static {
        ContextualSupportEntryPoint[] contextualSupportEntryPointArr$values = $values();
        $VALUES = contextualSupportEntryPointArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(contextualSupportEntryPointArr$values);
        Companion = new ActionBar(null);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.biz.model.ContextualSupportEntryPoint.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static ContextualSupportEntryPoint valueOf(String str) {
        return (ContextualSupportEntryPoint) Enum.valueOf(ContextualSupportEntryPoint.class, str);
    }

    public static ContextualSupportEntryPoint[] values() {
        return (ContextualSupportEntryPoint[]) $VALUES.clone();
    }
}
