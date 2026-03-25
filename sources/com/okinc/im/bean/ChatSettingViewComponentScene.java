package com.okinc.im.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class ChatSettingViewComponentScene implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChatSettingViewComponentScene[] $VALUES;
    public static final Parcelable.Creator<ChatSettingViewComponentScene> CREATOR;
    private final String value;
    public static final ChatSettingViewComponentScene ORBIT = new ChatSettingViewComponentScene("ORBIT", 0, "orbit");
    public static final ChatSettingViewComponentScene CHAT_SETTINGS = new ChatSettingViewComponentScene("CHAT_SETTINGS", 1, "chat_settings");
    public static final ChatSettingViewComponentScene USER_CENTER = new ChatSettingViewComponentScene("USER_CENTER", 2, "user_center");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChatSettingViewComponentScene[] $values() {
        return new ChatSettingViewComponentScene[]{ORBIT, CHAT_SETTINGS, USER_CENTER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChatSettingViewComponentScene> getEntries() {
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

    private ChatSettingViewComponentScene(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        ChatSettingViewComponentScene[] chatSettingViewComponentSceneArr$values = $values();
        $VALUES = chatSettingViewComponentSceneArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(chatSettingViewComponentSceneArr$values);
        CREATOR = new Parcelable.Creator<ChatSettingViewComponentScene>() { // from class: com.okinc.im.bean.ChatSettingViewComponentScene.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChatSettingViewComponentScene createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ChatSettingViewComponentScene.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChatSettingViewComponentScene[] newArray(int i) {
                return new ChatSettingViewComponentScene[i];
            }
        };
    }

    public static ChatSettingViewComponentScene valueOf(String str) {
        return (ChatSettingViewComponentScene) Enum.valueOf(ChatSettingViewComponentScene.class, str);
    }

    public static ChatSettingViewComponentScene[] values() {
        return (ChatSettingViewComponentScene[]) $VALUES.clone();
    }
}
