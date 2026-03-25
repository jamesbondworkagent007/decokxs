package com.okinc.im.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import com.okinc.okimcore.model.im.OKConversation;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.remote.RelationInfo;
import com.okinc.okimcore.model.room.inhouseim.PhoneRelationEntity;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public interface SearchResultData extends Parcelable {

    public static final class Header implements SearchResultData {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Header> CREATOR = new Creator();
        private final int title;

        public static final class Creator implements Parcelable.Creator<Header> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Header createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Header(parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Header[] newArray(int i) {
                return new Header[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Header copy$default(Header header, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = header.title;
            }
            return header.copy(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Header copy(@StringRes int i) {
            return new Header(i);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Header) && this.title == ((Header) obj).title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Integer.hashCode(this.title);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Header(title=" + this.title + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.title);
        }

        public Header(@StringRes int i) {
            this.title = i;
        }
    }

    public static final class Divider implements SearchResultData {
        public static final int $stable = 0;
        public static final Divider INSTANCE = new Divider();
        public static final Parcelable.Creator<Divider> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Divider> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Divider createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return Divider.INSTANCE;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Divider[] newArray(int i) {
                return new Divider[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private Divider() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LoadMore implements SearchResultData {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ LoadMore[] $VALUES;
        public static final Parcelable.Creator<LoadMore> CREATOR;
        public static final LoadMore CHAT_AND_CONTACT = new LoadMore("CHAT_AND_CONTACT", 0);
        public static final LoadMore MESSAGE = new LoadMore("MESSAGE", 1);

        public static final class Creator implements Parcelable.Creator<LoadMore> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoadMore createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return LoadMore.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LoadMore[] newArray(int i) {
                return new LoadMore[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ LoadMore[] $values() {
            return new LoadMore[]{CHAT_AND_CONTACT, MESSAGE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<LoadMore> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(name());
        }

        private LoadMore(String str, int i) {
        }

        static {
            LoadMore[] loadMoreArr$values = $values();
            $VALUES = loadMoreArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(loadMoreArr$values);
            CREATOR = new Creator();
        }

        public static LoadMore valueOf(String str) {
            return (LoadMore) Enum.valueOf(LoadMore.class, str);
        }

        public static LoadMore[] values() {
            return (LoadMore[]) $VALUES.clone();
        }
    }

    public static final class ChatAndContact implements SearchResultData {
        public static final int $stable = (PhoneRelationEntity.$stable | RelationInfo.$stable) | OKConversation.$stable;
        public static final Parcelable.Creator<ChatAndContact> CREATOR = new Creator();
        private final OKConversation conversation;
        private final PhoneRelationEntity phoneRelation;
        private final RelationInfo relation;
        private final String searchKeyword;

        public static final class Creator implements Parcelable.Creator<ChatAndContact> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChatAndContact createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ChatAndContact((OKConversation) parcel.readParcelable(ChatAndContact.class.getClassLoader()), (RelationInfo) parcel.readParcelable(ChatAndContact.class.getClassLoader()), (PhoneRelationEntity) parcel.readParcelable(ChatAndContact.class.getClassLoader()), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChatAndContact[] newArray(int i) {
                return new ChatAndContact[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ChatAndContact copy$default(ChatAndContact chatAndContact, OKConversation oKConversation, RelationInfo relationInfo, PhoneRelationEntity phoneRelationEntity, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                oKConversation = chatAndContact.conversation;
            }
            if ((i & 2) != 0) {
                relationInfo = chatAndContact.relation;
            }
            if ((i & 4) != 0) {
                phoneRelationEntity = chatAndContact.phoneRelation;
            }
            if ((i & 8) != 0) {
                str = chatAndContact.searchKeyword;
            }
            return chatAndContact.copy(oKConversation, relationInfo, phoneRelationEntity, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKConversation component1() {
            return this.conversation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RelationInfo component2() {
            return this.relation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PhoneRelationEntity component3() {
            return this.phoneRelation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.searchKeyword;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ChatAndContact copy(OKConversation oKConversation, RelationInfo relationInfo, PhoneRelationEntity phoneRelationEntity, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ChatAndContact(oKConversation, relationInfo, phoneRelationEntity, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChatAndContact)) {
                return false;
            }
            ChatAndContact chatAndContact = (ChatAndContact) obj;
            return Intrinsics.EZpvd(this.conversation, chatAndContact.conversation) && Intrinsics.EZpvd(this.relation, chatAndContact.relation) && Intrinsics.EZpvd(this.phoneRelation, chatAndContact.phoneRelation) && Intrinsics.EZpvd((Object) this.searchKeyword, (Object) chatAndContact.searchKeyword);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKConversation getConversation() {
            return this.conversation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PhoneRelationEntity getPhoneRelation() {
            return this.phoneRelation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RelationInfo getRelation() {
            return this.relation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSearchKeyword() {
            return this.searchKeyword;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            OKConversation oKConversation = this.conversation;
            int iHashCode = oKConversation == null ? 0 : oKConversation.hashCode();
            RelationInfo relationInfo = this.relation;
            int iHashCode2 = relationInfo == null ? 0 : relationInfo.hashCode();
            PhoneRelationEntity phoneRelationEntity = this.phoneRelation;
            return (((((iHashCode * 31) + iHashCode2) * 31) + (phoneRelationEntity != null ? phoneRelationEntity.hashCode() : 0)) * 31) + this.searchKeyword.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ChatAndContact(conversation=" + this.conversation + ", relation=" + this.relation + ", phoneRelation=" + this.phoneRelation + ", searchKeyword=" + this.searchKeyword + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.conversation, i);
            parcel.writeParcelable(this.relation, i);
            parcel.writeParcelable(this.phoneRelation, i);
            parcel.writeString(this.searchKeyword);
        }

        public ChatAndContact(OKConversation oKConversation, RelationInfo relationInfo, PhoneRelationEntity phoneRelationEntity, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.conversation = oKConversation;
            this.relation = relationInfo;
            this.phoneRelation = phoneRelationEntity;
            this.searchKeyword = str;
        }
    }

    public static final class Message implements SearchResultData {
        public static final int $stable;
        public static final Parcelable.Creator<Message> CREATOR;
        private final RelationInfo contact;
        private final OKConversation conversation;
        private final OKMessage message;
        private final PhoneRelationEntity phoneRelation;
        private final RelationInfo taggedUserContact;

        public static final class Creator implements Parcelable.Creator<Message> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Message createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Message((OKMessage) parcel.readParcelable(Message.class.getClassLoader()), (OKConversation) parcel.readParcelable(Message.class.getClassLoader()), (RelationInfo) parcel.readParcelable(Message.class.getClassLoader()), (RelationInfo) parcel.readParcelable(Message.class.getClassLoader()), (PhoneRelationEntity) parcel.readParcelable(Message.class.getClassLoader()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Message[] newArray(int i) {
                return new Message[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int i = PhoneRelationEntity.$stable;
            int i2 = RelationInfo.$stable;
            $stable = i | i2 | i2 | OKConversation.$stable | OKMessage.$stable;
            CREATOR = new Creator();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Message copy$default(Message message, OKMessage oKMessage, OKConversation oKConversation, RelationInfo relationInfo, RelationInfo relationInfo2, PhoneRelationEntity phoneRelationEntity, int i, Object obj) {
            if ((i & 1) != 0) {
                oKMessage = message.message;
            }
            if ((i & 2) != 0) {
                oKConversation = message.conversation;
            }
            OKConversation oKConversation2 = oKConversation;
            if ((i & 4) != 0) {
                relationInfo = message.taggedUserContact;
            }
            RelationInfo relationInfo3 = relationInfo;
            if ((i & 8) != 0) {
                relationInfo2 = message.contact;
            }
            RelationInfo relationInfo4 = relationInfo2;
            if ((i & 16) != 0) {
                phoneRelationEntity = message.phoneRelation;
            }
            return message.copy(oKMessage, oKConversation2, relationInfo3, relationInfo4, phoneRelationEntity);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKMessage component1() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKConversation component2() {
            return this.conversation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RelationInfo component3() {
            return this.taggedUserContact;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RelationInfo component4() {
            return this.contact;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PhoneRelationEntity component5() {
            return this.phoneRelation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Message copy(OKMessage oKMessage, @NotNull OKConversation oKConversation, RelationInfo relationInfo, RelationInfo relationInfo2, PhoneRelationEntity phoneRelationEntity) {
            Intrinsics.checkNotNullParameter(oKConversation, "");
            return new Message(oKMessage, oKConversation, relationInfo, relationInfo2, phoneRelationEntity);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return Intrinsics.EZpvd(this.message, message.message) && Intrinsics.EZpvd(this.conversation, message.conversation) && Intrinsics.EZpvd(this.taggedUserContact, message.taggedUserContact) && Intrinsics.EZpvd(this.contact, message.contact) && Intrinsics.EZpvd(this.phoneRelation, message.phoneRelation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RelationInfo getContact() {
            return this.contact;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKConversation getConversation() {
            return this.conversation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKMessage getMessage() {
            return this.message;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PhoneRelationEntity getPhoneRelation() {
            return this.phoneRelation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RelationInfo getTaggedUserContact() {
            return this.taggedUserContact;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            OKMessage oKMessage = this.message;
            int iHashCode = oKMessage == null ? 0 : oKMessage.hashCode();
            int iHashCode2 = this.conversation.hashCode();
            RelationInfo relationInfo = this.taggedUserContact;
            int iHashCode3 = relationInfo == null ? 0 : relationInfo.hashCode();
            RelationInfo relationInfo2 = this.contact;
            int iHashCode4 = relationInfo2 == null ? 0 : relationInfo2.hashCode();
            PhoneRelationEntity phoneRelationEntity = this.phoneRelation;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (phoneRelationEntity != null ? phoneRelationEntity.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Message(message=" + this.message + ", conversation=" + this.conversation + ", taggedUserContact=" + this.taggedUserContact + ", contact=" + this.contact + ", phoneRelation=" + this.phoneRelation + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.message, i);
            parcel.writeParcelable(this.conversation, i);
            parcel.writeParcelable(this.taggedUserContact, i);
            parcel.writeParcelable(this.contact, i);
            parcel.writeParcelable(this.phoneRelation, i);
        }

        public Message(OKMessage oKMessage, @NotNull OKConversation oKConversation, RelationInfo relationInfo, RelationInfo relationInfo2, PhoneRelationEntity phoneRelationEntity) {
            Intrinsics.checkNotNullParameter(oKConversation, "");
            this.message = oKMessage;
            this.conversation = oKConversation;
            this.taggedUserContact = relationInfo;
            this.contact = relationInfo2;
            this.phoneRelation = phoneRelationEntity;
        }
    }

    public static final class GroupResult implements SearchResultData {
        public static final int $stable = OKConversation.$stable;
        public static final Parcelable.Creator<GroupResult> CREATOR = new Creator();
        private final OKConversation conversation;
        private final String searchKeyword;

        public static final class Creator implements Parcelable.Creator<GroupResult> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupResult createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new GroupResult((OKConversation) parcel.readParcelable(GroupResult.class.getClassLoader()), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupResult[] newArray(int i) {
                return new GroupResult[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ GroupResult copy$default(GroupResult groupResult, OKConversation oKConversation, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                oKConversation = groupResult.conversation;
            }
            if ((i & 2) != 0) {
                str = groupResult.searchKeyword;
            }
            return groupResult.copy(oKConversation, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKConversation component1() {
            return this.conversation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.searchKeyword;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupResult copy(OKConversation oKConversation, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new GroupResult(oKConversation, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GroupResult)) {
                return false;
            }
            GroupResult groupResult = (GroupResult) obj;
            return Intrinsics.EZpvd(this.conversation, groupResult.conversation) && Intrinsics.EZpvd((Object) this.searchKeyword, (Object) groupResult.searchKeyword);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKConversation getConversation() {
            return this.conversation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSearchKeyword() {
            return this.searchKeyword;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            OKConversation oKConversation = this.conversation;
            return ((oKConversation == null ? 0 : oKConversation.hashCode()) * 31) + this.searchKeyword.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "GroupResult(conversation=" + this.conversation + ", searchKeyword=" + this.searchKeyword + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.conversation, i);
            parcel.writeString(this.searchKeyword);
        }

        public GroupResult(OKConversation oKConversation, @NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.conversation = oKConversation;
            this.searchKeyword = str;
        }
    }
}
