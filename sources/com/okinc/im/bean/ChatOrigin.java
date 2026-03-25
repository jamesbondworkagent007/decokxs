package com.okinc.im.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import com.okinc.p2p.api.OtcRouteConst;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ChatOrigin implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChatOrigin[] $VALUES;
    public static final Parcelable.Creator<ChatOrigin> CREATOR;
    private final String value;
    public static final ChatOrigin OKIM_SERVICE = new ChatOrigin("OKIM_SERVICE", 0, "okim_service");
    public static final ChatOrigin NEW_CHAT_FRIEND_LIST = new ChatOrigin("NEW_CHAT_FRIEND_LIST", 1, "new_chat_friend_list");
    public static final ChatOrigin SEARCH_BY_PHONE = new ChatOrigin("SEARCH_BY_PHONE", 2, "search_by_phone");
    public static final ChatOrigin CONTACT_INFO = new ChatOrigin("CONTACT_INFO", 3, "contact_info");
    public static final ChatOrigin CONTACT_SETTINGS = new ChatOrigin("CONTACT_SETTINGS", 4, "contact_settings");
    public static final ChatOrigin CONVERSATION_LIST = new ChatOrigin("CONVERSATION_LIST", 5, "conversation_list");
    public static final ChatOrigin CHAT = new ChatOrigin("CHAT", 6, "chat");
    public static final ChatOrigin MESSAGE_AVATAR = new ChatOrigin("MESSAGE_AVATAR", 7, "message_avatar");
    public static final ChatOrigin SEARCH = new ChatOrigin("SEARCH", 8, "search");
    public static final ChatOrigin DEEPLINK = new ChatOrigin("DEEPLINK", 9, "deeplink");
    public static final ChatOrigin AFFILIATE = new ChatOrigin("AFFILIATE", 10, "affiliate");
    public static final ChatOrigin P2P = new ChatOrigin(CustomMessageData.SERVICE_NAME_P2P, 11, OtcRouteConst.P2P);
    public static final ChatOrigin OK_PAY = new ChatOrigin("OK_PAY", 12, "okpay");
    public static final ChatOrigin PLANET = new ChatOrigin("PLANET", 13, "planet");
    public static final ChatOrigin RM = new ChatOrigin("RM", 14, "rm");
    public static final ChatOrigin OTC = new ChatOrigin("OTC", 15, "otc");
    public static final ChatOrigin UNKNOWN = new ChatOrigin("UNKNOWN", 16, "unknown");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChatOrigin[] $values() {
        return new ChatOrigin[]{OKIM_SERVICE, NEW_CHAT_FRIEND_LIST, SEARCH_BY_PHONE, CONTACT_INFO, CONTACT_SETTINGS, CONVERSATION_LIST, CHAT, MESSAGE_AVATAR, SEARCH, DEEPLINK, AFFILIATE, P2P, OK_PAY, PLANET, RM, OTC, UNKNOWN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChatOrigin> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private ChatOrigin(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        ChatOrigin[] chatOriginArr$values = $values();
        $VALUES = chatOriginArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chatOriginArr$values);
        CREATOR = new Parcelable.Creator<ChatOrigin>() { // from class: com.okinc.im.bean.ChatOrigin.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChatOrigin createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ChatOrigin.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChatOrigin[] newArray(int i) {
                return new ChatOrigin[i];
            }
        };
    }

    public static ChatOrigin valueOf(String str) {
        return (ChatOrigin) Enum.valueOf(ChatOrigin.class, str);
    }

    public static ChatOrigin[] values() {
        return (ChatOrigin[]) $VALUES.clone();
    }
}
