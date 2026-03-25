package com.okinc.okimcore.model.im;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.OKMentionedInfo;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.NamedCompanion;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class OKMentionedInfo implements Parcelable {
    private String mentionedContent;
    private List<MentionedUserInfo> mentionedUserList;
    private MentionedType type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OKMentionedInfo> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {MentionedType.CREATOR.serializer(), new ArrayListSerializer(MentionedUserInfo$$serializer.INSTANCE), null};

    public static final class Creator implements Parcelable.Creator<OKMentionedInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKMentionedInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            MentionedType mentionedType = (MentionedType) parcel.readParcelable(OKMentionedInfo.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(MentionedUserInfo.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new OKMentionedInfo(mentionedType, arrayList, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OKMentionedInfo[] newArray(int i) {
            return new OKMentionedInfo[i];
        }
    }

    @SerialName("mentionedContent")
    public static /* synthetic */ void getMentionedContent$annotations() {
    }

    @SerialName("mentionedUserList")
    public static /* synthetic */ void getMentionedUserList$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMentionedContent() {
        return this.mentionedContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MentionedUserInfo> getMentionedUserList() {
        return this.mentionedUserList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MentionedType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMentionedContent(String str) {
        this.mentionedContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMentionedUserList(List<MentionedUserInfo> list) {
        this.mentionedUserList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull MentionedType mentionedType) {
        Intrinsics.checkNotNullParameter(mentionedType, "");
        this.type = mentionedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.type, i);
        List<MentionedUserInfo> list = this.mentionedUserList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<MentionedUserInfo> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.mentionedContent);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKMentionedInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OKMentionedInfo> serializer() {
            return OKMentionedInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OKMentionedInfo(int i, MentionedType mentionedType, List list, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, OKMentionedInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.type = mentionedType;
        if ((i & 2) == 0) {
            this.mentionedUserList = null;
        } else {
            this.mentionedUserList = list;
        }
        if ((i & 4) == 0) {
            this.mentionedContent = null;
        } else {
            this.mentionedContent = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(OKMentionedInfo oKMentionedInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], oKMentionedInfo.type);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || oKMentionedInfo.mentionedUserList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], oKMentionedInfo.mentionedUserList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && oKMentionedInfo.mentionedContent == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, oKMentionedInfo.mentionedContent);
    }

    public OKMentionedInfo(@NotNull MentionedType mentionedType, List<MentionedUserInfo> list, String str) {
        Intrinsics.checkNotNullParameter(mentionedType, "");
        this.type = mentionedType;
        this.mentionedUserList = list;
        this.mentionedContent = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.okinc.okimcore.model.im.OKMentionedInfo$MentionedType)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(com.okinc.okimcore.model.im.OKMentionedInfo$MentionedType, java.util.List<com.okinc.okimcore.model.im.MentionedUserInfo>, java.lang.String):void (m)] (LINE:14) call: com.okinc.okimcore.model.im.OKMentionedInfo.<init>(com.okinc.okimcore.model.im.OKMentionedInfo$MentionedType, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ OKMentionedInfo(MentionedType mentionedType, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mentionedType, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Serializable
    public static final class MentionedType implements Parcelable {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ MentionedType[] $VALUES;
        private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
        public static final CREATOR CREATOR;
        private final int type;

        @SerialName("0")
        public static final MentionedType NONE = new MentionedType("NONE", 0, 0);

        @SerialName("1")
        public static final MentionedType ALL = new MentionedType("ALL", 1, 1);

        @SerialName("2")
        public static final MentionedType PART = new MentionedType("PART", 2, 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ MentionedType[] $values() {
            return new MentionedType[]{NONE, ALL, PART};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<MentionedType> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getType() {
            return this.type;
        }

        private MentionedType(String str, int i, int i2) {
            this.type = i2;
        }

        static {
            MentionedType[] mentionedTypeArr$values = $values();
            $VALUES = mentionedTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(mentionedTypeArr$values);
            CREATOR = new CREATOR(null);
            $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sNS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OKMentionedInfo.MentionedType._init_$_anonymous_();
                }
            });
        }

        private MentionedType(String str, int i, Parcel parcel) {
            this(str, i, parcel.readInt());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.type);
        }

        @NamedCompanion
        public static final class CREATOR implements Parcelable.Creator<MentionedType> {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.OKMentionedInfo.MentionedType.CREATOR.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private CREATOR() {
            }

            private final /* synthetic */ KSerializer get$cachedSerializer() {
                return (KSerializer) MentionedType.$cachedSerializer$delegate.getValue();
            }

            public final KSerializer<MentionedType> serializer() {
                return get$cachedSerializer();
            }

            public final MentionedType valueOf(int i) {
                MentionedType mentionedType;
                MentionedType[] mentionedTypeArrValues = MentionedType.values();
                int length = mentionedTypeArrValues.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        mentionedType = null;
                        break;
                    }
                    mentionedType = mentionedTypeArrValues[i2];
                    if (mentionedType.getType() == i) {
                        break;
                    }
                    i2++;
                }
                return mentionedType == null ? MentionedType.NONE : mentionedType;
            }

            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MentionedType createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return valueOf(parcel.readInt());
            }

            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MentionedType[] newArray(int i) {
                return new MentionedType[i];
            }

            public final MentionedType createFrom(Integer num) {
                MentionedType mentionedType;
                if (num != null && num.intValue() == 2) {
                    mentionedType = MentionedType.ALL;
                } else if (num != null && num.intValue() == 1) {
                    mentionedType = MentionedType.PART;
                } else if (num != null && num.intValue() == 3) {
                    mentionedType = MentionedType.PART;
                } else {
                    mentionedType = (num != null && num.intValue() == 0) ? MentionedType.PART : null;
                }
                return mentionedType == null ? MentionedType.NONE : mentionedType;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _init_$_anonymous_() {
            return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okimcore.model.im.OKMentionedInfo.MentionedType", values(), new String[]{"0", "1", "2"}, new Annotation[][]{null, null, null}, null);
        }

        public static MentionedType valueOf(String str) {
            return (MentionedType) Enum.valueOf(MentionedType.class, str);
        }

        public static MentionedType[] values() {
            return (MentionedType[]) $VALUES.clone();
        }
    }
}
