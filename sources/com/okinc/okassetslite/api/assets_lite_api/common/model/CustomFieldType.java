package com.okinc.okassetslite.api.assets_lite_api.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.okinc.okassetslite.api.assets_lite_api.common.model.CustomFieldType;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CustomFieldType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CustomFieldType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<CustomFieldType> CREATOR;
    public static final Companion Companion;
    private final int type;

    @SerializedName("1")
    @SerialName("1")
    public static final CustomFieldType FIAT_VALUATION = new CustomFieldType("FIAT_VALUATION", 0, 1);

    @SerializedName("2")
    @SerialName("2")
    public static final CustomFieldType TIMESTAMP = new CustomFieldType("TIMESTAMP", 1, 2);

    @SerializedName("3")
    @SerialName("3")
    public static final CustomFieldType EXECUTION_TIMESTAMP = new CustomFieldType("EXECUTION_TIMESTAMP", 2, 3);

    @SerializedName("4")
    @SerialName("4")
    public static final CustomFieldType CURRENCY_AMOUNT = new CustomFieldType("CURRENCY_AMOUNT", 3, 4);

    @SerializedName("5")
    @SerialName("5")
    public static final CustomFieldType PLAINTEXT = new CustomFieldType("PLAINTEXT", 4, 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CustomFieldType[] $values() {
        return new CustomFieldType[]{FIAT_VALUATION, TIMESTAMP, EXECUTION_TIMESTAMP, CURRENCY_AMOUNT, PLAINTEXT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CustomFieldType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.common.model.CustomFieldType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) CustomFieldType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<CustomFieldType> serializer() {
            return KWHzl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okassetslite.api.assets_lite_api.common.model.CustomFieldType", values(), new String[]{"1", "2", "3", "4", "5"}, new Annotation[][]{null, null, null, null, null}, null);
    }

    private CustomFieldType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        CustomFieldType[] customFieldTypeArr$values = $values();
        $VALUES = customFieldTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(customFieldTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<CustomFieldType>() { // from class: com.okinc.okassetslite.api.assets_lite_api.common.model.CustomFieldType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomFieldType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return CustomFieldType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomFieldType[] newArray(int i) {
                return new CustomFieldType[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rWR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return CustomFieldType._init_$_anonymous_();
            }
        });
    }

    public static CustomFieldType valueOf(String str) {
        return (CustomFieldType) Enum.valueOf(CustomFieldType.class, str);
    }

    public static CustomFieldType[] values() {
        return (CustomFieldType[]) $VALUES.clone();
    }
}
