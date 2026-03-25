package com.okinc.business.dexlogic.txs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.AttrRes;
import androidx.annotation.StringRes;
import com.okinc.business.dexlogic.txs.TxType;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C23274hvD;
import o.C52761wXj;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TxType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TxType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;

    @SerialName("0")
    public static final TxType ALL = new TxType("ALL", 0, "0", C23274hvD.Fragment.createFullyDrawnExecutor, C23274hvD.Fragment.QSLkRj, C52761wXj.ActionBar.getPostValueLengthLimit);

    @SerialName("1")
    public static final TxType BUY;
    public static final Parcelable.Creator<TxType> CREATOR;
    public static final Companion Companion;

    @SerialName("2")
    public static final TxType SELL;

    @SerialName("3")
    public static final TxType TRANSFER_IN;

    @SerialName("4")
    public static final TxType TRANSFER_OUT;
    private final int colorAttr;
    private final int titleResId;
    private final int trendTitleResId;
    private final String value;

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
    public final int getColorAttr() {
        return this.colorAttr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTrendTitleResId() {
        return this.trendTitleResId;
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

    private TxType(String str, @StringRes int i, @StringRes String str2, @AttrRes int i2, int i3, int i4) {
        this.value = str2;
        this.titleResId = i2;
        this.trendTitleResId = i3;
        this.colorAttr = i4;
    }

    static {
        int i = C23274hvD.Fragment.OFnBcz;
        BUY = new TxType("BUY", 1, "1", i, i, C52761wXj.ActionBar.DCUTEI);
        int i2 = C23274hvD.Fragment.gezFCt;
        SELL = new TxType("SELL", 2, "2", i2, i2, C52761wXj.ActionBar.OuxcSI);
        TRANSFER_IN = new TxType("TRANSFER_IN", 3, "3", C23274hvD.Fragment.zNQIcI, C23274hvD.Fragment.QSLkRj, C52761wXj.ActionBar.DCUTEI);
        TRANSFER_OUT = new TxType("TRANSFER_OUT", 4, "4", C23274hvD.Fragment.iFnJKK, C23274hvD.Fragment.QSLkRj, C52761wXj.ActionBar.OuxcSI);
        TxType[] txTypeArr$values = $values();
        $VALUES = txTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(txTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<TxType>() { // from class: com.okinc.business.dexlogic.txs.TxType.Creator
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
            public final TxType[] newArray(int i3) {
                return new TxType[i3];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.hvj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TxType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.txs.TxType.Companion.<init>():void type: THIS */
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

        public final TxType OLrzqt(String str) {
            TxType next;
            Iterator<TxType> it = TxType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((Object) next.getValue(), (Object) str)) {
                    break;
                }
            }
            TxType txType = next;
            return txType == null ? TxType.ALL : txType;
        }

        public final int KWHzl(@NotNull TxType txType) {
            Intrinsics.checkNotNullParameter(txType, "");
            return txType.getTitleResId();
        }

        public final int EZpvd(@NotNull TxType txType) {
            Intrinsics.checkNotNullParameter(txType, "");
            return txType.getTrendTitleResId();
        }

        public final int AEQbTJ(@NotNull TxType txType) {
            Intrinsics.checkNotNullParameter(txType, "");
            return txType.getColorAttr();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.dexlogic.txs.TxType", values(), new String[]{"0", "1", "2", "3", "4"}, new Annotation[][]{null, null, null, null, null}, null);
    }

    public static TxType valueOf(String str) {
        return (TxType) Enum.valueOf(TxType.class, str);
    }

    public static TxType[] values() {
        return (TxType[]) $VALUES.clone();
    }
}
