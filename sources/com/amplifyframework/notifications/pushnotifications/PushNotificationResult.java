package com.amplifyframework.notifications.pushnotifications;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public abstract class PushNotificationResult {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.notifications.pushnotifications.PushNotificationResult.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PushNotificationResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PushNotificationResult() {
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class NotificationPosted extends PushNotificationResult {
        public static final NotificationPosted INSTANCE = new NotificationPosted();

        private NotificationPosted() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class AppInForeground extends PushNotificationResult {
        public static final AppInForeground INSTANCE = new AppInForeground();

        private AppInForeground() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class OptedOut extends PushNotificationResult {
        public static final OptedOut INSTANCE = new OptedOut();

        private OptedOut() {
            super(null);
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Silent extends PushNotificationResult {
        public static final Silent INSTANCE = new Silent();

        private Silent() {
            super(null);
        }
    }
}
