package com.amplifyframework.notifications.pushnotifications;

import com.amplifyframework.notifications.NotificationsException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public class PushNotificationsException extends NotificationsException {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r3v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.String, java.lang.Throwable):void (m)] (LINE:27) call: com.amplifyframework.notifications.pushnotifications.PushNotificationsException.<init>(java.lang.String, java.lang.String, java.lang.Throwable):void type: THIS */
    public /* synthetic */ PushNotificationsException(String str, String str2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationsException(@NotNull String str, @NotNull String str2, Throwable th) {
        super(str, str2, th);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
    }
}
