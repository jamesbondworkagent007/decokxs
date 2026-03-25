package com.okinc.business.defi.biz.walletconnect;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class WCEthereumSignMessage implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WCEthereumSignMessage> CREATOR = new Creator();
    private final List<String> raw;
    private final WCSignType type;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[WCSignType.values().length];
            try {
                iArr[WCSignType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WCSignType.TYPED_MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WCSignType.PERSONAL_MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    public static final class Creator implements Parcelable.Creator<WCEthereumSignMessage> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WCEthereumSignMessage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WCEthereumSignMessage(parcel.createStringArrayList(), WCSignType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WCEthereumSignMessage[] newArray(int i) {
            return new WCEthereumSignMessage[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.walletconnect.WCEthereumSignMessage */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WCEthereumSignMessage copy$default(WCEthereumSignMessage wCEthereumSignMessage, List list, WCSignType wCSignType, int i, Object obj) {
        if ((i & 1) != 0) {
            list = wCEthereumSignMessage.raw;
        }
        if ((i & 2) != 0) {
            wCSignType = wCEthereumSignMessage.type;
        }
        return wCEthereumSignMessage.copy(list, wCSignType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.raw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WCSignType component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WCEthereumSignMessage copy(@NotNull List<String> list, @NotNull WCSignType wCSignType) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(wCSignType, "");
        return new WCEthereumSignMessage(list, wCSignType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WCEthereumSignMessage)) {
            return false;
        }
        WCEthereumSignMessage wCEthereumSignMessage = (WCEthereumSignMessage) obj;
        return Intrinsics.EZpvd(this.raw, wCEthereumSignMessage.raw) && this.type == wCEthereumSignMessage.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getRaw() {
        return this.raw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WCSignType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.raw.hashCode() * 31) + this.type.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WCEthereumSignMessage(raw=" + this.raw + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.raw);
        parcel.writeString(this.type.name());
    }

    public WCEthereumSignMessage(@NotNull List<String> list, @NotNull WCSignType wCSignType) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(wCSignType, "");
        this.raw = list;
        this.type = wCSignType;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WCSignType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ WCSignType[] $VALUES;
        public static final WCSignType MESSAGE = new WCSignType("MESSAGE", 0);
        public static final WCSignType PERSONAL_MESSAGE = new WCSignType("PERSONAL_MESSAGE", 1);
        public static final WCSignType TYPED_MESSAGE = new WCSignType("TYPED_MESSAGE", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ WCSignType[] $values() {
            return new WCSignType[]{MESSAGE, PERSONAL_MESSAGE, TYPED_MESSAGE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<WCSignType> getEntries() {
            return $ENTRIES;
        }

        private WCSignType(String str, int i) {
        }

        static {
            WCSignType[] wCSignTypeArr$values = $values();
            $VALUES = wCSignTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(wCSignTypeArr$values);
        }

        public static WCSignType valueOf(String str) {
            return (WCSignType) Enum.valueOf(WCSignType.class, str);
        }

        public static WCSignType[] values() {
            return (WCSignType[]) $VALUES.clone();
        }
    }

    public final String getData() {
        String str;
        int i = Activity.EZpvd[this.type.ordinal()];
        if (i == 1 || i == 2) {
            str = (String) CollectionsKt___CollectionsKt.AkhnZx(this.raw, 1);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = (String) CollectionsKt___CollectionsKt.AkhnZx(this.raw, 0);
        }
        return str == null ? "" : str;
    }
}
