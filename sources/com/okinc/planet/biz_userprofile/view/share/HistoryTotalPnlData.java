package com.okinc.planet.biz_userprofile.view.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.planet.serializer.PlanetNumericString;
import com.okinc.planet.serializer.PlanetNumericString$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Serializable
public final class HistoryTotalPnlData implements Parcelable {
    public static final int $stable = 0;
    public final String pnl;
    public final String ratio;
    public final String statTime;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<HistoryTotalPnlData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HistoryTotalPnlData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryTotalPnlData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HistoryTotalPnlData(parcel.readString(), parcel.readString(), PlanetNumericString.CREATOR.createFromParcel(parcel).AEQbTJ(), null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HistoryTotalPnlData[] newArray(int i) {
            return new HistoryTotalPnlData[i];
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 int)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 kotlinx.serialization.internal.SerializationConstructorMarker)
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void (m)] call: com.okinc.planet.biz_userprofile.view.share.HistoryTotalPnlData.<init>(int, java.lang.String, java.lang.String, java.lang.String, kotlinx.serialization.internal.SerializationConstructorMarker):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HistoryTotalPnlData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, serializationConstructorMarker);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 java.lang.String), (r2v0 java.lang.String), (r3v0 java.lang.String) A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] call: com.okinc.planet.biz_userprofile.view.share.HistoryTotalPnlData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HistoryTotalPnlData(String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX INFO: renamed from: copy-TfqVun8$default, reason: not valid java name */
    public static /* synthetic */ HistoryTotalPnlData m7058copyTfqVun8$default(HistoryTotalPnlData historyTotalPnlData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = historyTotalPnlData.ratio;
        }
        if ((i & 2) != 0) {
            str2 = historyTotalPnlData.statTime;
        }
        if ((i & 4) != 0) {
            str3 = historyTotalPnlData.pnl;
        }
        return historyTotalPnlData.OLrzqt(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.statTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryTotalPnlData OLrzqt(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new HistoryTotalPnlData(str, str2, str3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.ratio;
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
        if (!(obj instanceof HistoryTotalPnlData)) {
            return false;
        }
        HistoryTotalPnlData historyTotalPnlData = (HistoryTotalPnlData) obj;
        return Intrinsics.EZpvd((Object) this.ratio, (Object) historyTotalPnlData.ratio) && Intrinsics.EZpvd((Object) this.statTime, (Object) historyTotalPnlData.statTime) && PlanetNumericString.EZpvd(this.pnl, historyTotalPnlData.pnl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.ratio.hashCode() * 31) + this.statTime.hashCode()) * 31) + PlanetNumericString.EZpvd(this.pnl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryTotalPnlData(ratio=" + this.ratio + ", statTime=" + this.statTime + ", pnl=" + PlanetNumericString.copydefault(this.pnl) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ratio);
        parcel.writeString(this.statTime);
        PlanetNumericString.AEQbTJ(this.pnl, parcel, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.biz_userprofile.view.share.HistoryTotalPnlData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HistoryTotalPnlData> serializer() {
            return HistoryTotalPnlData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HistoryTotalPnlData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ratio = "";
        } else {
            this.ratio = str;
        }
        if ((i & 2) == 0) {
            this.statTime = "";
        } else {
            this.statTime = str2;
        }
        if ((i & 4) == 0) {
            this.pnl = PlanetNumericString.Companion.EZpvd();
        } else {
            this.pnl = str3;
        }
    }

    public static final /* synthetic */ void EZpvd(HistoryTotalPnlData historyTotalPnlData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) historyTotalPnlData.ratio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, historyTotalPnlData.ratio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) historyTotalPnlData.statTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, historyTotalPnlData.statTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && PlanetNumericString.EZpvd(historyTotalPnlData.pnl, PlanetNumericString.Companion.EZpvd())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, PlanetNumericString$$serializer.INSTANCE, PlanetNumericString.OLrzqt(historyTotalPnlData.pnl));
    }

    public HistoryTotalPnlData(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.ratio = str;
        this.statTime = str2;
        this.pnl = str3;
    }
}
