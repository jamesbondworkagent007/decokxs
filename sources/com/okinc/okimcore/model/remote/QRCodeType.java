package com.okinc.okimcore.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.remote.QRCodeType;
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
public final class QRCodeType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ QRCodeType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<QRCodeType> CREATOR;
    public static final Companion Companion;
    private final int type;
    public static final QRCodeType Unknown = new QRCodeType("Unknown", 0, 0);
    public static final QRCodeType Contact = new QRCodeType("Contact", 1, 1);
    public static final QRCodeType Group = new QRCodeType("Group", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ QRCodeType[] $values() {
        return new QRCodeType[]{Unknown, Contact, Group};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<QRCodeType> getEntries() {
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

    private QRCodeType(String str, int i, int i2) {
        this.type = i2;
    }

    static {
        QRCodeType[] qRCodeTypeArr$values = $values();
        $VALUES = qRCodeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(qRCodeTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<QRCodeType>() { // from class: com.okinc.okimcore.model.remote.QRCodeType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return QRCodeType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QRCodeType[] newArray(int i) {
                return new QRCodeType[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.sQO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return QRCodeType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.QRCodeType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) QRCodeType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<QRCodeType> serializer() {
            return OLrzqt();
        }

        public final QRCodeType AEQbTJ(int i) {
            for (QRCodeType qRCodeType : QRCodeType.values()) {
                if (qRCodeType.getType() == i) {
                    return qRCodeType;
                }
            }
            return QRCodeType.Unknown;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.okimcore.model.remote.QRCodeType", values());
    }

    public static QRCodeType valueOf(String str) {
        return (QRCodeType) Enum.valueOf(QRCodeType.class, str);
    }

    public static QRCodeType[] values() {
        return (QRCodeType[]) $VALUES.clone();
    }
}
