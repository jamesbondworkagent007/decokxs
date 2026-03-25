package com.okinc.business.market.data.model.smart_money;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import com.okinc.business.market.data.model.smart_money.SignalGemType;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C23274hvD;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class SignalGemType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SignalGemType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<SignalGemType> CREATOR;
    public static final Companion Companion;
    private final int stringRes;
    private final String value;

    @SerialName("")
    public static final SignalGemType ALL = new SignalGemType("ALL", 0, "", C23274hvD.Fragment.KWHzl);

    @SerialName("1")
    public static final SignalGemType GOLD = new SignalGemType("GOLD", 1, "1", C23274hvD.Fragment.DCUTEI);

    @SerialName("2")
    public static final SignalGemType SILVER = new SignalGemType("SILVER", 2, "2", C23274hvD.Fragment.OBJEWx);

    @SerialName("3")
    public static final SignalGemType BRONZE = new SignalGemType("BRONZE", 3, "3", C23274hvD.Fragment.getPostValueLengthLimit);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SignalGemType[] $values() {
        return new SignalGemType[]{ALL, GOLD, SILVER, BRONZE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SignalGemType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStringRes() {
        return this.stringRes;
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

    private SignalGemType(String str, @StringRes int i, String str2, int i2) {
        this.value = str2;
        this.stringRes = i2;
    }

    static {
        SignalGemType[] signalGemTypeArr$values = $values();
        $VALUES = signalGemTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(signalGemTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<SignalGemType>() { // from class: com.okinc.business.market.data.model.smart_money.SignalGemType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignalGemType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return SignalGemType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SignalGemType[] newArray(int i) {
                return new SignalGemType[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.jyQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SignalGemType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.smart_money.SignalGemType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) SignalGemType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SignalGemType> serializer() {
            return AEQbTJ();
        }

        public final SignalGemType AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            SignalGemType signalGemType = SignalGemType.GOLD;
            if (Intrinsics.EZpvd((Object) str, (Object) signalGemType.getValue())) {
                return signalGemType;
            }
            SignalGemType signalGemType2 = SignalGemType.SILVER;
            if (Intrinsics.EZpvd((Object) str, (Object) signalGemType2.getValue())) {
                return signalGemType2;
            }
            SignalGemType signalGemType3 = SignalGemType.BRONZE;
            return Intrinsics.EZpvd((Object) str, (Object) signalGemType3.getValue()) ? signalGemType3 : SignalGemType.ALL;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.data.model.smart_money.SignalGemType", values(), new String[]{"", "1", "2", "3"}, new Annotation[][]{null, null, null, null}, null);
    }

    public static SignalGemType valueOf(String str) {
        return (SignalGemType) Enum.valueOf(SignalGemType.class, str);
    }

    public static SignalGemType[] values() {
        return (SignalGemType[]) $VALUES.clone();
    }
}
