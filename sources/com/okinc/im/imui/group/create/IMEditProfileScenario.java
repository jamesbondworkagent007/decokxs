package com.okinc.im.imui.group.create;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.account.api.model.usercenter.EditProfileScenario;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C33070mpX;
import o.C35399nuc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public abstract class IMEditProfileScenario implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.create.IMEditProfileScenario.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IMEditProfileScenario(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private IMEditProfileScenario() {
    }

    public static final class ImGroup extends IMEditProfileScenario {
        public static final ImGroup copydefault = new ImGroup();
        public static final Parcelable.Creator<ImGroup> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<ImGroup> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ImGroup createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return ImGroup.copydefault;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ImGroup[] newArray(int i) {
                return new ImGroup[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private ImGroup() {
            super(null);
        }

        public final EditProfileScenario AEQbTJ() {
            return EditProfileScenario.CompleteOrbiterProfile.INSTANCE;
        }

        public final String OLrzqt() {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.KWHzl);
        }

        public final String EZpvd() {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.AEQbTJ);
        }

        public final String copydefault() {
            return C33070mpX.AYXKKw(C35399nuc.LoaderManager.fIwbmz);
        }
    }
}
