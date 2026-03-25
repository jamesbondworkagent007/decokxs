package com.okinc.buysell.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.buysell.api.QuickConvertBottomSheetSubmissionStatus;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
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
/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class QuickConvertBottomSheetSubmissionStatus implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ QuickConvertBottomSheetSubmissionStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<QuickConvertBottomSheetSubmissionStatus> CREATOR;
    public static final Companion Companion;
    public static final QuickConvertBottomSheetSubmissionStatus SUCCESS = new QuickConvertBottomSheetSubmissionStatus("SUCCESS", 0);
    public static final QuickConvertBottomSheetSubmissionStatus FAILED = new QuickConvertBottomSheetSubmissionStatus(CardSyncResponse.FAILED, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ QuickConvertBottomSheetSubmissionStatus[] $values() {
        return new QuickConvertBottomSheetSubmissionStatus[]{SUCCESS, FAILED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<QuickConvertBottomSheetSubmissionStatus> getEntries() {
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.buysell.api.QuickConvertBottomSheetSubmissionStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) QuickConvertBottomSheetSubmissionStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<QuickConvertBottomSheetSubmissionStatus> serializer() {
            return OLrzqt();
        }
    }

    private QuickConvertBottomSheetSubmissionStatus(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.buysell.api.QuickConvertBottomSheetSubmissionStatus", values());
    }

    static {
        QuickConvertBottomSheetSubmissionStatus[] quickConvertBottomSheetSubmissionStatusArr$values = $values();
        $VALUES = quickConvertBottomSheetSubmissionStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(quickConvertBottomSheetSubmissionStatusArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<QuickConvertBottomSheetSubmissionStatus>() { // from class: com.okinc.buysell.api.QuickConvertBottomSheetSubmissionStatus.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuickConvertBottomSheetSubmissionStatus createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return QuickConvertBottomSheetSubmissionStatus.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final QuickConvertBottomSheetSubmissionStatus[] newArray(int i) {
                return new QuickConvertBottomSheetSubmissionStatus[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.ltk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return QuickConvertBottomSheetSubmissionStatus._init_$_anonymous_();
            }
        });
    }

    public static QuickConvertBottomSheetSubmissionStatus valueOf(String str) {
        return (QuickConvertBottomSheetSubmissionStatus) Enum.valueOf(QuickConvertBottomSheetSubmissionStatus.class, str);
    }

    public static QuickConvertBottomSheetSubmissionStatus[] values() {
        return (QuickConvertBottomSheetSubmissionStatus[]) $VALUES.clone();
    }
}
