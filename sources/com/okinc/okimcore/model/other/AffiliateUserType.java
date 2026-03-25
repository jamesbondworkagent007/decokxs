package com.okinc.okimcore.model.other;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.other.AffiliateUserType;
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
/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class AffiliateUserType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AffiliateUserType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final CREATOR CREATOR;
    private final int type;

    @SerialName("0")
    public static final AffiliateUserType NODE = new AffiliateUserType("NODE", 0, 0);

    @SerialName("1")
    public static final AffiliateUserType SUB_AFFILIATE = new AffiliateUserType("SUB_AFFILIATE", 1, 1);

    @SerialName("2")
    public static final AffiliateUserType COMMON_USER = new AffiliateUserType("COMMON_USER", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AffiliateUserType[] $values() {
        return new AffiliateUserType[]{NODE, SUB_AFFILIATE, COMMON_USER};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AffiliateUserType> getEntries() {
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

    private AffiliateUserType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        AffiliateUserType[] affiliateUserTypeArr$values = $values();
        $VALUES = affiliateUserTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(affiliateUserTypeArr$values);
        CREATOR = new CREATOR(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sQj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AffiliateUserType._init_$_anonymous_();
            }
        });
    }

    private AffiliateUserType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<AffiliateUserType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.AffiliateUserType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) AffiliateUserType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<AffiliateUserType> serializer() {
            return get$cachedSerializer();
        }

        public final AffiliateUserType valueOf(int i) {
            if (i == 0) {
                return AffiliateUserType.NODE;
            }
            if (i == 1) {
                return AffiliateUserType.SUB_AFFILIATE;
            }
            if (i != 2) {
                return null;
            }
            return AffiliateUserType.COMMON_USER;
        }

        public final boolean isValid(int i) {
            AffiliateUserType affiliateUserType;
            AffiliateUserType[] affiliateUserTypeArrValues = AffiliateUserType.values();
            int length = affiliateUserTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    affiliateUserType = null;
                    break;
                }
                affiliateUserType = affiliateUserTypeArrValues[i2];
                if (affiliateUserType.getType() == i) {
                    break;
                }
                i2++;
            }
            return affiliateUserType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AffiliateUserType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return valueOf(parcel.readInt());
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AffiliateUserType[] newArray(int i) {
            return new AffiliateUserType[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okimcore.model.other.AffiliateUserType", values(), new String[]{"0", "1", "2"}, new Annotation[][]{null, null, null}, null);
    }

    public static AffiliateUserType valueOf(String str) {
        return (AffiliateUserType) Enum.valueOf(AffiliateUserType.class, str);
    }

    public static AffiliateUserType[] values() {
        return (AffiliateUserType[]) $VALUES.clone();
    }
}
