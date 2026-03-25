package com.okinc.business.rewards.okplatform.bean.ui;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class OkPlatformJoinBtnField implements Parcelable {
    private final OkPlatformUIStructureTextData buttonTextBeforeEnrolmentStarts;
    private final OkPlatformUIStructureTextData buttonTextEnrolmentHasStarted;
    private final String sectionName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OkPlatformJoinBtnField> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OkPlatformJoinBtnField> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformJoinBtnField createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OkPlatformJoinBtnField(parcel.readString(), (OkPlatformUIStructureTextData) parcel.readParcelable(OkPlatformJoinBtnField.class.getClassLoader()), (OkPlatformUIStructureTextData) parcel.readParcelable(OkPlatformJoinBtnField.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformJoinBtnField[] newArray(int i) {
            return new OkPlatformJoinBtnField[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformUIStructureTextData getButtonTextBeforeEnrolmentStarts() {
        return this.buttonTextBeforeEnrolmentStarts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformUIStructureTextData getButtonTextEnrolmentHasStarted() {
        return this.buttonTextEnrolmentHasStarted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSectionName() {
        return this.sectionName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.sectionName);
        parcel.writeParcelable(this.buttonTextBeforeEnrolmentStarts, i);
        parcel.writeParcelable(this.buttonTextEnrolmentHasStarted, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformJoinBtnField.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OkPlatformJoinBtnField> serializer() {
            return OkPlatformJoinBtnField$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OkPlatformJoinBtnField(int i, String str, OkPlatformUIStructureTextData okPlatformUIStructureTextData, OkPlatformUIStructureTextData okPlatformUIStructureTextData2, SerializationConstructorMarker serializationConstructorMarker) {
        if (6 != (i & 6)) {
            PluginExceptionsKt.throwMissingFieldException(i, 6, OkPlatformJoinBtnField$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.sectionName = "";
        } else {
            this.sectionName = str;
        }
        this.buttonTextBeforeEnrolmentStarts = okPlatformUIStructureTextData;
        this.buttonTextEnrolmentHasStarted = okPlatformUIStructureTextData2;
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_rewards_api(OkPlatformJoinBtnField okPlatformJoinBtnField, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) okPlatformJoinBtnField.sectionName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, okPlatformJoinBtnField.sectionName);
        }
        OkPlatformUIStructureTextData$$serializer okPlatformUIStructureTextData$$serializer = OkPlatformUIStructureTextData$$serializer.INSTANCE;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, okPlatformUIStructureTextData$$serializer, okPlatformJoinBtnField.buttonTextBeforeEnrolmentStarts);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, okPlatformUIStructureTextData$$serializer, okPlatformJoinBtnField.buttonTextEnrolmentHasStarted);
    }

    public OkPlatformJoinBtnField(String str, @NotNull OkPlatformUIStructureTextData okPlatformUIStructureTextData, @NotNull OkPlatformUIStructureTextData okPlatformUIStructureTextData2) {
        Intrinsics.checkNotNullParameter(okPlatformUIStructureTextData, "");
        Intrinsics.checkNotNullParameter(okPlatformUIStructureTextData2, "");
        this.sectionName = str;
        this.buttonTextBeforeEnrolmentStarts = okPlatformUIStructureTextData;
        this.buttonTextEnrolmentHasStarted = okPlatformUIStructureTextData2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData)
  (r3v0 com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData)
 A[MD:(java.lang.String, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData):void (m)] (LINE:22) call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformJoinBtnField.<init>(java.lang.String, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData):void type: THIS */
    public /* synthetic */ OkPlatformJoinBtnField(String str, OkPlatformUIStructureTextData okPlatformUIStructureTextData, OkPlatformUIStructureTextData okPlatformUIStructureTextData2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, okPlatformUIStructureTextData, okPlatformUIStructureTextData2);
    }
}
