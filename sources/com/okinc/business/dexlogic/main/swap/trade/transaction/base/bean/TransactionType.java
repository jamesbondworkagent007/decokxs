package com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType;
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
/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TransactionType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TransactionType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<TransactionType> CREATOR;
    public static final Companion Companion;
    public static final TransactionType INQUIRY_TYPE = new TransactionType("INQUIRY_TYPE", 0);
    public static final TransactionType ORDER_TYPE = new TransactionType("ORDER_TYPE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TransactionType[] $values() {
        return new TransactionType[]{INQUIRY_TYPE, ORDER_TYPE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TransactionType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) TransactionType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TransactionType> serializer() {
            return EZpvd();
        }
    }

    private TransactionType(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType", values());
    }

    static {
        TransactionType[] transactionTypeArr$values = $values();
        $VALUES = transactionTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(transactionTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<TransactionType>() { // from class: com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return TransactionType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final TransactionType[] newArray(int i) {
                return new TransactionType[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.hqN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TransactionType._init_$_anonymous_();
            }
        });
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }
}
