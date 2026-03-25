package com.okinc.planet.biz_plugin.future.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.planet.biz_plugin.future.data.FutureCustomizeType;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C33070mpX;
import o.C47501trL;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class FutureCustomizeType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FutureCustomizeType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Parcelable.Creator<FutureCustomizeType> CREATOR;
    public static final Companion Companion;
    public static final FutureCustomizeType Future_Customize_PnlPercent = new FutureCustomizeType("Future_Customize_PnlPercent", 0, "ratioOnly", "pnl_percentage", C33070mpX.AYXKKw(C47501trL.Fragment.atDTRm));
    public static final FutureCustomizeType Future_Customize_Pnl_And_Percent = new FutureCustomizeType("Future_Customize_Pnl_And_Percent", 1, "pnlAndRatio", "pnl_percentage_and_dollar", C33070mpX.AYXKKw(C47501trL.Fragment.YFmri));
    private final String title;
    private final String track;
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FutureCustomizeType[] $values() {
        return new FutureCustomizeType[]{Future_Customize_PnlPercent, Future_Customize_Pnl_And_Percent};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FutureCustomizeType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrack() {
        return this.track;
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

    private FutureCustomizeType(String str, int i, String str2, String str3, String str4) {
        this.value = str2;
        this.track = str3;
        this.title = str4;
    }

    static {
        FutureCustomizeType[] futureCustomizeTypeArr$values = $values();
        $VALUES = futureCustomizeTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(futureCustomizeTypeArr$values);
        Companion = new Companion(null);
        CREATOR = new Parcelable.Creator<FutureCustomizeType>() { // from class: com.okinc.planet.biz_plugin.future.data.FutureCustomizeType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FutureCustomizeType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return FutureCustomizeType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FutureCustomizeType[] newArray(int i) {
                return new FutureCustomizeType[i];
            }
        };
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.tCw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return FutureCustomizeType._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_plugin.future.data.FutureCustomizeType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) FutureCustomizeType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<FutureCustomizeType> serializer() {
            return AEQbTJ();
        }

        public final FutureCustomizeType KWHzl(String str) {
            FutureCustomizeType next;
            Iterator<FutureCustomizeType> it = FutureCustomizeType.getEntries().iterator();
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
            FutureCustomizeType futureCustomizeType = next;
            return futureCustomizeType == null ? FutureCustomizeType.Future_Customize_PnlPercent : futureCustomizeType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.planet.biz_plugin.future.data.FutureCustomizeType", values());
    }

    public static FutureCustomizeType valueOf(String str) {
        return (FutureCustomizeType) Enum.valueOf(FutureCustomizeType.class, str);
    }

    public static FutureCustomizeType[] values() {
        return (FutureCustomizeType[]) $VALUES.clone();
    }
}
