package com.okinc.okpaymentapi.data.remote.model.management;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ChannelCategoryCode implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChannelCategoryCode[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<ChannelCategoryCode> CREATOR;
    public static final Companion Companion;
    private final int code;
    public static final ChannelCategoryCode THIRD_PARTY = new ChannelCategoryCode("THIRD_PARTY", 0, 2);
    public static final ChannelCategoryCode BALANCE = new ChannelCategoryCode("BALANCE", 1, 3);
    public static final ChannelCategoryCode NATIVE = new ChannelCategoryCode("NATIVE", 2, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChannelCategoryCode[] $values() {
        return new ChannelCategoryCode[]{THIRD_PARTY, BALANCE, NATIVE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChannelCategoryCode> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) ChannelCategoryCode.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<ChannelCategoryCode> serializer() {
            return KWHzl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode", values());
    }

    private ChannelCategoryCode(String str, int i, int i2) {
        this.code = i2;
    }

    static {
        ChannelCategoryCode[] channelCategoryCodeArr$values = $values();
        $VALUES = channelCategoryCodeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(channelCategoryCodeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<ChannelCategoryCode>() { // from class: com.okinc.okpaymentapi.data.remote.model.management.ChannelCategoryCode.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChannelCategoryCode createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return ChannelCategoryCode.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ChannelCategoryCode[] newArray(int i) {
                return new ChannelCategoryCode[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tfQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return ChannelCategoryCode._init_$_anonymous_();
            }
        });
    }

    public static ChannelCategoryCode valueOf(String str) {
        return (ChannelCategoryCode) Enum.valueOf(ChannelCategoryCode.class, str);
    }

    public static ChannelCategoryCode[] values() {
        return (ChannelCategoryCode[]) $VALUES.clone();
    }
}
