package com.okinc.auth.impl.mfa.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SwitchVerificationMethodRequest implements Parcelable {
    public final boolean AEQbTJ;
    public final boolean AYXKKw;
    public final boolean AhwBna;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final boolean djBIcL;
    public final boolean gEmmrt;
    public final Long valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final Parcelable.Creator<SwitchVerificationMethodRequest> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SwitchVerificationMethodRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwitchVerificationMethodRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SwitchVerificationMethodRequest(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwitchVerificationMethodRequest[] newArray(int i) {
            return new SwitchVerificationMethodRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwitchVerificationMethodRequest EZpvd(Long l, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        return new SwitchVerificationMethodRequest(l, z, z2, z3, z4, z5, z6, z7, z8, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.EZpvd;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitchVerificationMethodRequest)) {
            return false;
        }
        SwitchVerificationMethodRequest switchVerificationMethodRequest = (SwitchVerificationMethodRequest) obj;
        return Intrinsics.EZpvd(this.valueOf, switchVerificationMethodRequest.valueOf) && this.AEQbTJ == switchVerificationMethodRequest.AEQbTJ && this.OLrzqt == switchVerificationMethodRequest.OLrzqt && this.KWHzl == switchVerificationMethodRequest.KWHzl && this.gEmmrt == switchVerificationMethodRequest.gEmmrt && this.djBIcL == switchVerificationMethodRequest.djBIcL && this.EZpvd == switchVerificationMethodRequest.EZpvd && this.AYXKKw == switchVerificationMethodRequest.AYXKKw && this.copydefault == switchVerificationMethodRequest.copydefault && this.AhwBna == switchVerificationMethodRequest.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.valueOf;
        return ((((((((((((((((((l == null ? 0 : l.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + Boolean.hashCode(this.gEmmrt)) * 31) + Boolean.hashCode(this.djBIcL)) * 31) + Boolean.hashCode(this.EZpvd)) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwitchVerificationMethodRequest(remainTime=" + this.valueOf + ", hasPasskey=" + this.AEQbTJ + ", hasPassword=" + this.OLrzqt + ", hasGa=" + this.KWHzl + ", hasSms=" + this.gEmmrt + ", hasVoice=" + this.djBIcL + ", hasEmail=" + this.EZpvd + ", hasUnavailableOption=" + this.AYXKKw + ", hasFaceVerify=" + this.copydefault + ", hasUnavailableVerifyPasskey=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.valueOf;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeInt(this.djBIcL ? 1 : 0);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeInt(this.AhwBna ? 1 : 0);
    }

    public SwitchVerificationMethodRequest(Long l, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.valueOf = l;
        this.AEQbTJ = z;
        this.OLrzqt = z2;
        this.KWHzl = z3;
        this.gEmmrt = z4;
        this.djBIcL = z5;
        this.EZpvd = z6;
        this.AYXKKw = z7;
        this.copydefault = z8;
        this.AhwBna = z9;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.model.SwitchVerificationMethodRequest.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ SwitchVerificationMethodRequest buildRequest$default(TaskDescription taskDescription, OTP otp, MfaResponse mfaResponse, Long l, int i, Object obj) {
            if ((i & 4) != 0) {
                l = 0L;
            }
            return taskDescription.copydefault(otp, mfaResponse, l);
        }

        public final SwitchVerificationMethodRequest copydefault(OTP otp, @NotNull MfaResponse mfaResponse, Long l) {
            Boolean boolEZpvd;
            Boolean boolCopydefault;
            List<String> listOLrzqt;
            Intrinsics.checkNotNullParameter(mfaResponse, "");
            List<String> listOLrzqt2 = mfaResponse.OLrzqt();
            boolean zContains = listOLrzqt2 != null ? listOLrzqt2.contains("PASSKEY") : false;
            List<String> listOLrzqt3 = mfaResponse.OLrzqt();
            boolean zContains2 = listOLrzqt3 != null ? listOLrzqt3.contains("PASSWORD") : false;
            List<String> listOLrzqt4 = mfaResponse.OLrzqt();
            boolean zContains3 = listOLrzqt4 != null ? listOLrzqt4.contains("AUTHENTICATOR") : false;
            boolean z = otp == OTP.VOICE || ((listOLrzqt = mfaResponse.OLrzqt()) != null && listOLrzqt.contains("PHONE"));
            List<String> listOLrzqt5 = mfaResponse.OLrzqt();
            boolean zContains4 = listOLrzqt5 != null ? listOLrzqt5.contains("EMAIL") : false;
            boolean z2 = otp == OTP.SMS;
            boolean z3 = CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends String>) ((Iterable<? extends Object>) yDY.gEmmrt(MfaNextStep.EMAIL.getKey(), MfaNextStep.PHONE.getKey(), MfaNextStep.AUTHENTICATOR.getKey())), mfaResponse.djBIcL()) && (boolCopydefault = mfaResponse.copydefault()) != null && boolCopydefault.booleanValue();
            List<String> listOLrzqt6 = mfaResponse.OLrzqt();
            return new SwitchVerificationMethodRequest(l, zContains, zContains2, zContains3, z, z2, zContains4, z3, listOLrzqt6 != null ? listOLrzqt6.contains("FACE_VERIFY") : false, Intrinsics.EZpvd((Object) mfaResponse.djBIcL(), (Object) MfaNextStep.PASSKEY.getKey()) && (boolEZpvd = mfaResponse.EZpvd()) != null && boolEZpvd.booleanValue());
        }
    }
}
