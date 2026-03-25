package com.okinc.okimcore.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.okimcore.model.remote.OfficialMark;
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
public final class OfficialMark implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OfficialMark[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final CREATOR CREATOR;
    private final int type;

    @SerialName("1")
    public static final OfficialMark OfficialPerson = new OfficialMark("OfficialPerson", 0, 1);

    @SerialName(UnsignedSwapData.CALLDATA_TYPE_EVM_TRANSFER)
    public static final OfficialMark External = new OfficialMark("External", 1, 101);

    @SerialName("201")
    public static final OfficialMark OfficialGroup = new OfficialMark("OfficialGroup", 2, 201);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OfficialMark[] $values() {
        return new OfficialMark[]{OfficialPerson, External, OfficialGroup};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OfficialMark> getEntries() {
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

    private OfficialMark(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        OfficialMark[] officialMarkArr$values = $values();
        $VALUES = officialMarkArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(officialMarkArr$values);
        CREATOR = new CREATOR(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sQP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OfficialMark._init_$_anonymous_();
            }
        });
    }

    private OfficialMark(String str, int i, Parcel parcel) {
        this(str, i, parcel.readInt());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.type);
    }

    @NamedCompanion
    public static final class CREATOR implements Parcelable.Creator<OfficialMark> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.OfficialMark.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) OfficialMark.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OfficialMark> serializer() {
            return get$cachedSerializer();
        }

        public final OfficialMark valueOf(int i) {
            if (i == 1) {
                return OfficialMark.OfficialPerson;
            }
            if (i == 101) {
                return OfficialMark.External;
            }
            if (i != 201) {
                return null;
            }
            return OfficialMark.OfficialGroup;
        }

        public final boolean isValid(int i) {
            OfficialMark officialMark;
            OfficialMark[] officialMarkArrValues = OfficialMark.values();
            int length = officialMarkArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    officialMark = null;
                    break;
                }
                officialMark = officialMarkArrValues[i2];
                if (officialMark.getType() == i) {
                    break;
                }
                i2++;
            }
            return officialMark != null;
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OfficialMark createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            OfficialMark officialMarkValueOf = valueOf(parcel.readInt());
            Intrinsics.copydefault(officialMarkValueOf);
            return officialMarkValueOf;
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OfficialMark[] newArray(int i) {
            return new OfficialMark[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.okimcore.model.remote.OfficialMark", values(), new String[]{"1", UnsignedSwapData.CALLDATA_TYPE_EVM_TRANSFER, "201"}, new Annotation[][]{null, null, null}, null);
    }

    public static OfficialMark valueOf(String str) {
        return (OfficialMark) Enum.valueOf(OfficialMark.class, str);
    }

    public static OfficialMark[] values() {
        return (OfficialMark[]) $VALUES.clone();
    }
}
