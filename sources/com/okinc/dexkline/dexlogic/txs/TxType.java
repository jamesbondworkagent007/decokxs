package com.okinc.dexkline.dexlogic.txs;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.dexkline.dexlogic.txs.TxType;
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
/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class TxType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TxType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<TxType> CREATOR;
    public static final Companion Companion;
    private final String value;

    @SerialName("0")
    public static final TxType ALL = new TxType("ALL", 0, "0");

    @SerialName("1")
    public static final TxType BUY = new TxType("BUY", 1, "1");

    @SerialName("2")
    public static final TxType SELL = new TxType("SELL", 2, "2");

    @SerialName("3")
    public static final TxType TRANSFER_IN = new TxType("TRANSFER_IN", 3, "3");

    @SerialName("4")
    public static final TxType TRANSFER_OUT = new TxType("TRANSFER_OUT", 4, "4");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TxType[] $values() {
        return new TxType[]{ALL, BUY, SELL, TRANSFER_IN, TRANSFER_OUT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TxType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private TxType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        TxType[] txTypeArr$values = $values();
        $VALUES = txTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(txTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<TxType>() { // from class: com.okinc.dexkline.dexlogic.txs.TxType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TxType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TxType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TxType[] newArray(int i) {
                return new TxType[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mRy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TxType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.dexlogic.txs.TxType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) TxType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TxType> serializer() {
            return OLrzqt();
        }

        public final TxType copydefault(String str) {
            TxType txType;
            TxType[] txTypeArrValues = TxType.values();
            int length = txTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    txType = null;
                    break;
                }
                txType = txTypeArrValues[i];
                if (Intrinsics.EZpvd((Object) txType.getValue(), (Object) str)) {
                    break;
                }
                i++;
            }
            return txType == null ? TxType.ALL : txType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.dexkline.dexlogic.txs.TxType", values(), new String[]{"0", "1", "2", "3", "4"}, new Annotation[][]{null, null, null, null, null}, null);
    }

    public static TxType valueOf(String str) {
        return (TxType) Enum.valueOf(TxType.class, str);
    }

    public static TxType[] values() {
        return (TxType[]) $VALUES.clone();
    }
}
