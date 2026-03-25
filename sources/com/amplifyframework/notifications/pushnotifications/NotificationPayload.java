package com.amplifyframework.notifications.pushnotifications;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.amplifyframework.notifications.pushnotifications.NotificationContentProvider;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public class NotificationPayload implements Parcelable {
    private final String channelId;
    private final NotificationContentProvider contentProvider;
    private final Map<String, String> rawData;
    private final Class<?> targetClass;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<NotificationPayload> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Creator implements Parcelable.Creator<NotificationPayload> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationPayload createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NotificationPayload((NotificationContentProvider) parcel.readParcelable(NotificationPayload.class.getClassLoader()), parcel.readString(), (Class) parcel.readSerializable());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationPayload[] newArray(int i) {
            return new NotificationPayload[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Builder builder(@NotNull NotificationContentProvider notificationContentProvider) {
        return Companion.builder(notificationContentProvider);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final NotificationPayload fromIntent(Intent intent) {
        return Companion.fromIntent(intent);
    }

    public static /* synthetic */ void getRawData$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationContentProvider getContentProvider() {
        return this.contentProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getRawData() {
        return this.rawData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Class<?> getTargetClass() {
        return this.targetClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.contentProvider, i);
        parcel.writeString(this.channelId);
        parcel.writeSerializable(this.targetClass);
    }

    public NotificationPayload(@NotNull NotificationContentProvider notificationContentProvider, String str, Class<?> cls) {
        Intrinsics.checkNotNullParameter(notificationContentProvider, "");
        this.contentProvider = notificationContentProvider;
        this.channelId = str;
        this.targetClass = cls;
        this.rawData = extractRawData();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.amplifyframework.notifications.pushnotifications.NotificationContentProvider)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Class) : (r4v0 java.lang.Class))
 A[MD:(com.amplifyframework.notifications.pushnotifications.NotificationContentProvider, java.lang.String, java.lang.Class<?>):void (m)] (LINE:30) call: com.amplifyframework.notifications.pushnotifications.NotificationPayload.<init>(com.amplifyframework.notifications.pushnotifications.NotificationContentProvider, java.lang.String, java.lang.Class):void type: THIS */
    public /* synthetic */ NotificationPayload(NotificationContentProvider notificationContentProvider, String str, Class cls, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(notificationContentProvider, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : cls);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationPayload(@NotNull Builder builder) {
        this(builder.getContentProvider(), builder.getChannelId(), builder.getTargetClass());
        Intrinsics.checkNotNullParameter(builder, "");
    }

    private final Map<String, String> extractRawData() {
        NotificationContentProvider notificationContentProvider = this.contentProvider;
        return notificationContentProvider instanceof NotificationContentProvider.FCM ? notificationContentProvider.getContent() : C56424yEw.KWHzl();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.notifications.pushnotifications.NotificationPayload.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Builder builder(@NotNull NotificationContentProvider notificationContentProvider) {
            Intrinsics.checkNotNullParameter(notificationContentProvider, "");
            return new Builder(notificationContentProvider);
        }

        public final NotificationPayload invoke(@NotNull NotificationContentProvider notificationContentProvider, @NotNull Function1<? super Builder, Unit> function1) {
            Intrinsics.checkNotNullParameter(notificationContentProvider, "");
            Intrinsics.checkNotNullParameter(function1, "");
            Builder builder = new Builder(notificationContentProvider);
            function1.invoke(builder);
            return builder.build();
        }

        public final NotificationPayload fromIntent(Intent intent) {
            if (intent != null) {
                return (NotificationPayload) intent.getParcelableExtra("amplifyNotificationPayload");
            }
            return null;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Builder {
        private String channelId;
        private final NotificationContentProvider contentProvider;
        private Class<?> targetClass;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getChannelId() {
            return this.channelId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NotificationContentProvider getContentProvider() {
            return this.contentProvider;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Class<?> getTargetClass() {
            return this.targetClass;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder notificationChannelId(String str) {
            this.channelId = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder targetClass(Class<?> cls) {
            this.targetClass = cls;
            return this;
        }

        public Builder(@NotNull NotificationContentProvider notificationContentProvider) {
            Intrinsics.checkNotNullParameter(notificationContentProvider, "");
            this.contentProvider = notificationContentProvider;
        }

        public final NotificationPayload build() {
            return new NotificationPayload(this);
        }
    }
}
