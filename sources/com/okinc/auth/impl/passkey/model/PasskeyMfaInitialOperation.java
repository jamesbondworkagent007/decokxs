package com.okinc.auth.impl.passkey.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.auth.impl.passkey.model.PasskeyMfaInitialOperation;
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
/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class PasskeyMfaInitialOperation implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PasskeyMfaInitialOperation[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<PasskeyMfaInitialOperation> CREATOR;
    public static final Companion Companion;
    public static final PasskeyMfaInitialOperation REG = new PasskeyMfaInitialOperation("REG", 0);
    public static final PasskeyMfaInitialOperation REMOVE = new PasskeyMfaInitialOperation("REMOVE", 1);
    public static final PasskeyMfaInitialOperation RESET = new PasskeyMfaInitialOperation("RESET", 2);
    public static final PasskeyMfaInitialOperation RESET_NO_REBIND = new PasskeyMfaInitialOperation("RESET_NO_REBIND", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PasskeyMfaInitialOperation[] $values() {
        return new PasskeyMfaInitialOperation[]{REG, REMOVE, RESET, RESET_NO_REBIND};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PasskeyMfaInitialOperation> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.PasskeyMfaInitialOperation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) PasskeyMfaInitialOperation.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PasskeyMfaInitialOperation> serializer() {
            return EZpvd();
        }
    }

    private PasskeyMfaInitialOperation(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.auth.impl.passkey.model.PasskeyMfaInitialOperation", values());
    }

    static {
        PasskeyMfaInitialOperation[] passkeyMfaInitialOperationArr$values = $values();
        $VALUES = passkeyMfaInitialOperationArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(passkeyMfaInitialOperationArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<PasskeyMfaInitialOperation>() { // from class: com.okinc.auth.impl.passkey.model.PasskeyMfaInitialOperation.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PasskeyMfaInitialOperation createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return PasskeyMfaInitialOperation.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PasskeyMfaInitialOperation[] newArray(int i) {
                return new PasskeyMfaInitialOperation[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.aGl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PasskeyMfaInitialOperation._init_$_anonymous_();
            }
        });
    }

    public static PasskeyMfaInitialOperation valueOf(String str) {
        return (PasskeyMfaInitialOperation) Enum.valueOf(PasskeyMfaInitialOperation.class, str);
    }

    public static PasskeyMfaInitialOperation[] values() {
        return (PasskeyMfaInitialOperation[]) $VALUES.clone();
    }
}
