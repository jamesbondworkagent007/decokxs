package com.okinc.assets.api.utils;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public abstract class Message implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.api.utils.Message.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ Message(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private Message() {
    }

    public static final class StringMessage extends Message {
        public static final Parcelable.Creator<StringMessage> CREATOR = new Creator();
        public final String OLrzqt;

        public static final class Creator implements Parcelable.Creator<StringMessage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringMessage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new StringMessage(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StringMessage[] newArray(int i) {
                return new StringMessage[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StringMessage copy$default(StringMessage stringMessage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stringMessage.OLrzqt;
            }
            return stringMessage.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StringMessage KWHzl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StringMessage(str);
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
            return (obj instanceof StringMessage) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((StringMessage) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "StringMessage(message=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringMessage(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.OLrzqt = str;
        }
    }

    public static final class ResourceMessage extends Message {
        public static final Parcelable.Creator<ResourceMessage> CREATOR = new Creator();
        public final int OLrzqt;

        public static final class Creator implements Parcelable.Creator<ResourceMessage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResourceMessage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ResourceMessage(parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ResourceMessage[] newArray(int i) {
                return new ResourceMessage[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ResourceMessage copy$default(ResourceMessage resourceMessage, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = resourceMessage.OLrzqt;
            }
            return resourceMessage.OLrzqt(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ResourceMessage OLrzqt(@StringRes int i) {
            return new ResourceMessage(i);
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
            return (obj instanceof ResourceMessage) && this.OLrzqt == ((ResourceMessage) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ResourceMessage(message=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.OLrzqt);
        }

        public ResourceMessage(@StringRes int i) {
            super(null);
            this.OLrzqt = i;
        }
    }

    public static final class FormattedResourceMessage extends Message {
        public static final Parcelable.Creator<FormattedResourceMessage> CREATOR = new Creator();
        public final int AEQbTJ;
        public final Map<String, String> EZpvd;

        public static final class Creator implements Parcelable.Creator<FormattedResourceMessage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FormattedResourceMessage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
                return new FormattedResourceMessage(i, linkedHashMap);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FormattedResourceMessage[] newArray(int i) {
                return new FormattedResourceMessage[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.api.utils.Message$FormattedResourceMessage */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FormattedResourceMessage copy$default(FormattedResourceMessage formattedResourceMessage, int i, Map map, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = formattedResourceMessage.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                map = formattedResourceMessage.EZpvd;
            }
            return formattedResourceMessage.KWHzl(i, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FormattedResourceMessage KWHzl(@StringRes int i, @NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            return new FormattedResourceMessage(i, map);
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
            if (!(obj instanceof FormattedResourceMessage)) {
                return false;
            }
            FormattedResourceMessage formattedResourceMessage = (FormattedResourceMessage) obj;
            return this.AEQbTJ == formattedResourceMessage.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, formattedResourceMessage.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Integer.hashCode(this.AEQbTJ) * 31) + this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FormattedResourceMessage(message=" + this.AEQbTJ + ", args=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.AEQbTJ);
            Map<String, String> map = this.EZpvd;
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FormattedResourceMessage(@StringRes int i, @NotNull Map<String, String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(map, "");
            this.AEQbTJ = i;
            this.EZpvd = map;
        }
    }

    public static final class FormattedPluralResourceMessage extends Message {
        public static final Parcelable.Creator<FormattedPluralResourceMessage> CREATOR = new Creator();
        public final int KWHzl;
        public final Map<String, String> OLrzqt;
        public final int copydefault;

        public static final class Creator implements Parcelable.Creator<FormattedPluralResourceMessage> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FormattedPluralResourceMessage createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                int i2 = parcel.readInt();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i3 = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new FormattedPluralResourceMessage(i, i2, linkedHashMap);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FormattedPluralResourceMessage[] newArray(int i) {
                return new FormattedPluralResourceMessage[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.api.utils.Message$FormattedPluralResourceMessage */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FormattedPluralResourceMessage copy$default(FormattedPluralResourceMessage formattedPluralResourceMessage, int i, int i2, Map map, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = formattedPluralResourceMessage.copydefault;
            }
            if ((i3 & 2) != 0) {
                i2 = formattedPluralResourceMessage.KWHzl;
            }
            if ((i3 & 4) != 0) {
                map = formattedPluralResourceMessage.OLrzqt;
            }
            return formattedPluralResourceMessage.OLrzqt(i, i2, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FormattedPluralResourceMessage OLrzqt(@PluralsRes int i, int i2, Map<String, String> map) {
            return new FormattedPluralResourceMessage(i, i2, map);
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
            if (!(obj instanceof FormattedPluralResourceMessage)) {
                return false;
            }
            FormattedPluralResourceMessage formattedPluralResourceMessage = (FormattedPluralResourceMessage) obj;
            return this.copydefault == formattedPluralResourceMessage.copydefault && this.KWHzl == formattedPluralResourceMessage.KWHzl && Intrinsics.EZpvd(this.OLrzqt, formattedPluralResourceMessage.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.copydefault);
            int iHashCode2 = Integer.hashCode(this.KWHzl);
            Map<String, String> map = this.OLrzqt;
            return (((iHashCode * 31) + iHashCode2) * 31) + (map == null ? 0 : map.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FormattedPluralResourceMessage(message=" + this.copydefault + ", value=" + this.KWHzl + ", args=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.copydefault);
            parcel.writeInt(this.KWHzl);
            Map<String, String> map = this.OLrzqt;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeString(entry.getValue());
            }
        }

        public FormattedPluralResourceMessage(@PluralsRes int i, int i2, Map<String, String> map) {
            super(null);
            this.copydefault = i;
            this.KWHzl = i2;
            this.OLrzqt = map;
        }
    }
}
