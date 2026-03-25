package com.okinc.okimcore.model.other;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.other.InclusionType;
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
public final class InclusionType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InclusionType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final CREATOR CREATOR;
    private final int type;

    @SerialName("0")
    public static final InclusionType INCLUDE = new InclusionType("INCLUDE", 0, 0);

    @SerialName("1")
    public static final InclusionType EXCLUDE = new InclusionType("EXCLUDE", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InclusionType[] $values() {
        return new InclusionType[]{INCLUDE, EXCLUDE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InclusionType> getEntries() {
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

    private InclusionType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        InclusionType[] inclusionTypeArr$values = $values();
        $VALUES = inclusionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inclusionTypeArr$values);
        CREATOR = new CREATOR(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sQv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InclusionType._init_$_anonymous_();
            }
        });
    }

    private InclusionType(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<InclusionType> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.other.InclusionType.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) InclusionType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<InclusionType> serializer() {
            return get$cachedSerializer();
        }

        public final InclusionType valueOf(int i) {
            if (i == 0) {
                return InclusionType.INCLUDE;
            }
            if (i != 1) {
                return null;
            }
            return InclusionType.EXCLUDE;
        }

        public final boolean isValid(int i) {
            InclusionType inclusionType;
            InclusionType[] inclusionTypeArrValues = InclusionType.values();
            int length = inclusionTypeArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    inclusionType = null;
                    break;
                }
                inclusionType = inclusionTypeArrValues[i2];
                if (inclusionType.getType() == i) {
                    break;
                }
                i2++;
            }
            return inclusionType != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InclusionType createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            InclusionType inclusionTypeValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(inclusionTypeValueOf);
            return inclusionTypeValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public InclusionType[] newArray(int i) {
            return new InclusionType[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okimcore.model.other.InclusionType", values(), new String[]{"0", "1"}, new Annotation[][]{null, null}, null);
    }

    public static InclusionType valueOf(String str) {
        return (InclusionType) Enum.valueOf(InclusionType.class, str);
    }

    public static InclusionType[] values() {
        return (InclusionType[]) $VALUES.clone();
    }
}
