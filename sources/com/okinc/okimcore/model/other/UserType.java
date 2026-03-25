package com.okinc.okimcore.model.other;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.other.UserType;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.NamedCompanion;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class UserType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UserType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final CREATOR CREATOR;
    private final int type;

    @SerialName("0")
    public static final UserType CGC_INVITEE = new UserType("CGC_INVITEE", 0, 0);

    @SerialName("1")
    public static final UserType CGC_SUB_AFFILIATE = new UserType("CGC_SUB_AFFILIATE", 1, 1);

    @SerialName("2")
    public static final UserType GGC_INVITEE = new UserType("GGC_INVITEE", 2, 2);

    @SerialName("3")
    public static final UserType GGC_SUB_AFFILIATE = new UserType("GGC_SUB_AFFILIATE", 3, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UserType[] $values() {
        return new UserType[]{CGC_INVITEE, CGC_SUB_AFFILIATE, GGC_INVITEE, GGC_SUB_AFFILIATE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UserType> getEntries() {
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

    private UserType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        UserType[] userTypeArr$values = $values();
        $VALUES = userTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(userTypeArr$values);
        CREATOR = new CREATOR(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sQD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return UserType._init_$_anonymous_();
            }
        });
    }

    private UserType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<UserType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.UserType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) UserType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<UserType> serializer() {
            return get$cachedSerializer();
        }

        public final UserType valueOf(int i) {
            if (i == 0) {
                return UserType.CGC_INVITEE;
            }
            if (i == 1) {
                return UserType.CGC_SUB_AFFILIATE;
            }
            if (i == 2) {
                return UserType.GGC_INVITEE;
            }
            if (i != 3) {
                return null;
            }
            return UserType.GGC_SUB_AFFILIATE;
        }

        public final boolean isValid(int i) {
            UserType userType;
            UserType[] userTypeArrValues = UserType.values();
            int length = userTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    userType = null;
                    break;
                }
                userType = userTypeArrValues[i2];
                if (userType.getType() == i) {
                    break;
                }
                i2++;
            }
            return userType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            UserType userTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(userTypeValueOf);
            return userTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UserType[] newArray(int i) {
            return new UserType[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okimcore.model.other.UserType", values(), new String[]{"0", "1", "2", "3"}, new Annotation[][]{null, null, null, null}, null);
    }

    public static UserType valueOf(String str) {
        return (UserType) Enum.valueOf(UserType.class, str);
    }

    public static UserType[] values() {
        return (UserType[]) $VALUES.clone();
    }
}
