package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKConversationType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKConversationType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<OKConversationType> CREATOR;
    public static final Companion Companion;
    public static final String GROUP_CHAT_VALUE = "0";
    public static final String PRIVATE_CHAT_VALUE = "1";
    private final String typeName;
    private final int value;
    public static final OKConversationType NONE = new OKConversationType("NONE", 0, 0, "none");
    public static final OKConversationType PRIVATE = new OKConversationType("PRIVATE", 1, 1, "private");
    public static final OKConversationType DISCUSSION = new OKConversationType("DISCUSSION", 2, 2, "discussion");
    public static final OKConversationType GROUP = new OKConversationType("GROUP", 3, 3, "group");
    public static final OKConversationType CHATROOM = new OKConversationType("CHATROOM", 4, 4, "chatroom");
    public static final OKConversationType CUSTOMER_SERVICE = new OKConversationType("CUSTOMER_SERVICE", 5, 5, "customer_service");
    public static final OKConversationType SYSTEM = new OKConversationType("SYSTEM", 6, 6, "system");
    public static final OKConversationType APP_PUBLIC_SERVICE = new OKConversationType("APP_PUBLIC_SERVICE", 7, 7, "app_public_service");
    public static final OKConversationType PUBLIC_SERVICE = new OKConversationType("PUBLIC_SERVICE", 8, 8, "public_service");
    public static final OKConversationType PUSH_SERVICE = new OKConversationType("PUSH_SERVICE", 9, 9, "push_service");
    public static final OKConversationType ENCRYPTED = new OKConversationType("ENCRYPTED", 10, 11, "encrypted");
    public static final OKConversationType RTC_ROOM = new OKConversationType("RTC_ROOM", 11, 12, "rtc_room");
    public static final OKConversationType BROADCAST = new OKConversationType("BROADCAST", 12, 13, "broadcast");
    public static final OKConversationType LiveStream = new OKConversationType(CustomMessageData.SERVICE_NAME_LIVE_STREAM, 13, 14, "livestream");
    public static final OKConversationType OrbitNotifications = new OKConversationType("OrbitNotifications", 14, 15, "OrbitUpdate");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKConversationType[] $values() {
        return new OKConversationType[]{NONE, PRIVATE, DISCUSSION, GROUP, CHATROOM, CUSTOMER_SERVICE, SYSTEM, APP_PUBLIC_SERVICE, PUBLIC_SERVICE, PUSH_SERVICE, ENCRYPTED, RTC_ROOM, BROADCAST, LiveStream, OrbitNotifications};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKConversationType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final OKConversationType setValue(int i) {
        return Companion.EZpvd(i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTypeName() {
        return this.typeName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private OKConversationType(String str, int i, int i2, String str2) {
        this.value = i2;
        this.typeName = str2;
    }

    static {
        OKConversationType[] oKConversationTypeArr$values = $values();
        $VALUES = oKConversationTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKConversationTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<OKConversationType>() { // from class: com.okinc.okimcore.model.im.OKConversationType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OKConversationType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return OKConversationType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OKConversationType[] newArray(int i) {
                return new OKConversationType[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sNP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKConversationType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKConversationType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) OKConversationType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OKConversationType> serializer() {
            return EZpvd();
        }

        public final OKConversationType EZpvd(int i) {
            for (OKConversationType oKConversationType : OKConversationType.values()) {
                if (i == oKConversationType.getValue()) {
                    return oKConversationType;
                }
            }
            return OKConversationType.NONE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.im.OKConversationType", values());
    }

    public static OKConversationType valueOf(String str) {
        return (OKConversationType) Enum.valueOf(OKConversationType.class, str);
    }

    public static OKConversationType[] values() {
        return (OKConversationType[]) $VALUES.clone();
    }
}
