package com.okinc.account.api.model.okxtraccountconnect;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
public final class OkxTrAccountConnectSource implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OkxTrAccountConnectSource[] $VALUES;
    public static final OkxTrAccountConnectSource ACCOUNT = new OkxTrAccountConnectSource("ACCOUNT", 0, "user_center");
    public static final OkxTrAccountConnectSource ASSET = new OkxTrAccountConnectSource("ASSET", 1, "withdraw");
    public static final Parcelable.Creator<OkxTrAccountConnectSource> CREATOR;
    public static final Companion Companion;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OkxTrAccountConnectSource[] $values() {
        return new OkxTrAccountConnectSource[]{ACCOUNT, ASSET};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OkxTrAccountConnectSource> getEntries() {
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
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private OkxTrAccountConnectSource(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        OkxTrAccountConnectSource[] okxTrAccountConnectSourceArr$values = $values();
        $VALUES = okxTrAccountConnectSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(okxTrAccountConnectSourceArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<OkxTrAccountConnectSource>() { // from class: com.okinc.account.api.model.okxtraccountconnect.OkxTrAccountConnectSource.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OkxTrAccountConnectSource createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return OkxTrAccountConnectSource.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OkxTrAccountConnectSource[] newArray(int i) {
                return new OkxTrAccountConnectSource[i];
            }
        };
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.account.api.model.okxtraccountconnect.OkxTrAccountConnectSource.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OkxTrAccountConnectSource fromValue(@NotNull String str) {
            OkxTrAccountConnectSource next;
            Intrinsics.checkNotNullParameter(str, "");
            Iterator<OkxTrAccountConnectSource> it = OkxTrAccountConnectSource.getEntries().iterator();
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
            OkxTrAccountConnectSource okxTrAccountConnectSource = next;
            return okxTrAccountConnectSource == null ? OkxTrAccountConnectSource.ACCOUNT : okxTrAccountConnectSource;
        }
    }

    public static OkxTrAccountConnectSource valueOf(String str) {
        return (OkxTrAccountConnectSource) Enum.valueOf(OkxTrAccountConnectSource.class, str);
    }

    public static OkxTrAccountConnectSource[] values() {
        return (OkxTrAccountConnectSource[]) $VALUES.clone();
    }
}
