package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okx.paymentapi.service.VerificationStatus;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
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
public final class VerificationStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ VerificationStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<VerificationStatus> CREATOR;
    public static final Companion Companion;
    private final int priority;
    public static final VerificationStatus PRE_LOGIN = new VerificationStatus("PRE_LOGIN", 0, 0);
    public static final VerificationStatus PRE_KYC = new VerificationStatus("PRE_KYC", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ VerificationStatus[] $values() {
        return new VerificationStatus[]{PRE_LOGIN, PRE_KYC};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<VerificationStatus> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPriority() {
        return this.priority;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private VerificationStatus(String str, int i, int i2) {
        this.priority = i2;
    }

    static {
        VerificationStatus[] verificationStatusArr$values = $values();
        $VALUES = verificationStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(verificationStatusArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<VerificationStatus>() { // from class: com.okinc.okx.paymentapi.service.VerificationStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return VerificationStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final VerificationStatus[] newArray(int i) {
                return new VerificationStatus[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tnb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return VerificationStatus._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.service.VerificationStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer EZpvd() {
            return (KSerializer) VerificationStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<VerificationStatus> serializer() {
            return EZpvd();
        }

        public final VerificationStatus EZpvd(@NotNull List<? extends VerificationStatus> list) {
            Intrinsics.checkNotNullParameter(list, "");
            if (list.isEmpty()) {
                return null;
            }
            Iterator<T> it = list.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (it.hasNext()) {
                int priority = ((VerificationStatus) next).getPriority();
                do {
                    Object next2 = it.next();
                    int priority2 = ((VerificationStatus) next2).getPriority();
                    if (priority > priority2) {
                        next = next2;
                        priority = priority2;
                    }
                } while (it.hasNext());
            }
            return (VerificationStatus) next;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.okx.paymentapi.service.VerificationStatus", values());
    }

    public static VerificationStatus valueOf(String str) {
        return (VerificationStatus) Enum.valueOf(VerificationStatus.class, str);
    }

    public static VerificationStatus[] values() {
        return (VerificationStatus[]) $VALUES.clone();
    }
}
