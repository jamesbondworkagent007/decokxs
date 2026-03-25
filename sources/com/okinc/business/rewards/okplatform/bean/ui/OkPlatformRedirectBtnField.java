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
public final class OkPlatformRedirectBtnField implements Parcelable {
    private final OkPlatformUIStructureTextData buttonTextActivityHasStarted;
    private final OkPlatformUIStructureTextData buttonTextBeforeActivityStarts;
    private final OkPlatformUIStructureTextData redirectUrl;
    private final String sectionName;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OkPlatformRedirectBtnField> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<OkPlatformRedirectBtnField> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformRedirectBtnField createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OkPlatformRedirectBtnField(parcel.readString(), (OkPlatformUIStructureTextData) parcel.readParcelable(OkPlatformRedirectBtnField.class.getClassLoader()), (OkPlatformUIStructureTextData) parcel.readParcelable(OkPlatformRedirectBtnField.class.getClassLoader()), (OkPlatformUIStructureTextData) parcel.readParcelable(OkPlatformRedirectBtnField.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OkPlatformRedirectBtnField[] newArray(int i) {
            return new OkPlatformRedirectBtnField[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformUIStructureTextData getButtonTextActivityHasStarted() {
        return this.buttonTextActivityHasStarted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformUIStructureTextData getButtonTextBeforeActivityStarts() {
        return this.buttonTextBeforeActivityStarts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OkPlatformUIStructureTextData getRedirectUrl() {
        return this.redirectUrl;
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
        parcel.writeParcelable(this.buttonTextBeforeActivityStarts, i);
        parcel.writeParcelable(this.buttonTextActivityHasStarted, i);
        parcel.writeParcelable(this.redirectUrl, i);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRedirectBtnField.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OkPlatformRedirectBtnField> serializer() {
            return OkPlatformRedirectBtnField$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OkPlatformRedirectBtnField(int i, String str, OkPlatformUIStructureTextData okPlatformUIStructureTextData, OkPlatformUIStructureTextData okPlatformUIStructureTextData2, OkPlatformUIStructureTextData okPlatformUIStructureTextData3, SerializationConstructorMarker serializationConstructorMarker) {
        if (14 != (i & 14)) {
            PluginExceptionsKt.throwMissingFieldException(i, 14, OkPlatformRedirectBtnField$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.sectionName = "";
        } else {
            this.sectionName = str;
        }
        this.buttonTextBeforeActivityStarts = okPlatformUIStructureTextData;
        this.buttonTextActivityHasStarted = okPlatformUIStructureTextData2;
        this.redirectUrl = okPlatformUIStructureTextData3;
    }

    public static final /* synthetic */ void write$Self$OKGrowthTools_rewards_api(OkPlatformRedirectBtnField okPlatformRedirectBtnField, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) okPlatformRedirectBtnField.sectionName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, okPlatformRedirectBtnField.sectionName);
        }
        OkPlatformUIStructureTextData$$serializer okPlatformUIStructureTextData$$serializer = OkPlatformUIStructureTextData$$serializer.INSTANCE;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, okPlatformUIStructureTextData$$serializer, okPlatformRedirectBtnField.buttonTextBeforeActivityStarts);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, okPlatformUIStructureTextData$$serializer, okPlatformRedirectBtnField.buttonTextActivityHasStarted);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, okPlatformUIStructureTextData$$serializer, okPlatformRedirectBtnField.redirectUrl);
    }

    public OkPlatformRedirectBtnField(String str, @NotNull OkPlatformUIStructureTextData okPlatformUIStructureTextData, @NotNull OkPlatformUIStructureTextData okPlatformUIStructureTextData2, @NotNull OkPlatformUIStructureTextData okPlatformUIStructureTextData3) {
        Intrinsics.checkNotNullParameter(okPlatformUIStructureTextData, "");
        Intrinsics.checkNotNullParameter(okPlatformUIStructureTextData2, "");
        Intrinsics.checkNotNullParameter(okPlatformUIStructureTextData3, "");
        this.sectionName = str;
        this.buttonTextBeforeActivityStarts = okPlatformUIStructureTextData;
        this.buttonTextActivityHasStarted = okPlatformUIStructureTextData2;
        this.redirectUrl = okPlatformUIStructureTextData3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (r2v0 com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData)
  (r3v0 com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData)
  (r4v0 com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData)
 A[MD:(java.lang.String, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData):void (m)] (LINE:18) call: com.okinc.business.rewards.okplatform.bean.ui.OkPlatformRedirectBtnField.<init>(java.lang.String, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData, com.okinc.business.rewards.okplatform.bean.ui.OkPlatformUIStructureTextData):void type: THIS */
    public /* synthetic */ OkPlatformRedirectBtnField(String str, OkPlatformUIStructureTextData okPlatformUIStructureTextData, OkPlatformUIStructureTextData okPlatformUIStructureTextData2, OkPlatformUIStructureTextData okPlatformUIStructureTextData3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, okPlatformUIStructureTextData, okPlatformUIStructureTextData2, okPlatformUIStructureTextData3);
    }
}
