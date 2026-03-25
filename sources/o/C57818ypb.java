package o;

/* JADX INFO: renamed from: o.ypb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57818ypb extends C57817ypa {
    public static final java.util.HashSet<java.lang.String> copydefault = new java.util.HashSet<>(java.util.Arrays.asList("getTags()", "setSMSNumber()", "setEmail()", "logoutSMSNumber()", "logoutEmail()", "syncHashedEmail()", "setExternalUserId()", "setLanguage()", "setSubscription()", "promptLocation()", "idsAvailable()", "sendTag()", "sendTags()", "setLocationShared()", "setDisableGMSMissingPrompt()", "setRequiresUserPrivacyConsent()", "unsubscribeWhenNotificationsAreDisabled()", "handleNotificationOpen()", "onAppLostFocus()", "sendOutcome()", "sendUniqueOutcome()", "sendOutcomeWithValue()", "removeGroupedNotifications()", "removeNotification()", "clearOneSignalNotifications()"));
    public final C57752yoO valueOf;

    public C57818ypb(C57752yoO c57752yoO, InterfaceC57738yoA interfaceC57738yoA) {
        super(interfaceC57738yoA);
        this.valueOf = c57752yoO;
    }

    public boolean copydefault(java.lang.String str) {
        return !this.valueOf.fetchVPNInfo() && copydefault.contains(str);
    }
}
