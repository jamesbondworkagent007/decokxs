package com.okinc.auth.impl.passkey.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class GetAuthenticationTypeResponse implements Parcelable {
    public static final String AUTH_TYPE_EMAIL = "EMAIL";
    public static final String AUTH_TYPE_FIDO2 = "FIDO2";
    public static final String AUTH_TYPE_GA = "AUTHENTICATOR";
    public static final String AUTH_TYPE_MOBILE = "MOBILE";

    @SerializedName("authTypes")
    private final List<String> authTypes;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<GetAuthenticationTypeResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<GetAuthenticationTypeResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetAuthenticationTypeResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GetAuthenticationTypeResponse(parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GetAuthenticationTypeResponse[] newArray(int i) {
            return new GetAuthenticationTypeResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.auth.impl.passkey.model.GetAuthenticationTypeResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetAuthenticationTypeResponse copy$default(GetAuthenticationTypeResponse getAuthenticationTypeResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getAuthenticationTypeResponse.authTypes;
        }
        return getAuthenticationTypeResponse.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.authTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetAuthenticationTypeResponse copy(List<String> list) {
        return new GetAuthenticationTypeResponse(list);
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
        return (obj instanceof GetAuthenticationTypeResponse) && Intrinsics.EZpvd(this.authTypes, ((GetAuthenticationTypeResponse) obj).authTypes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAuthTypes() {
        return this.authTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.authTypes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetAuthenticationTypeResponse(authTypes=" + this.authTypes + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.authTypes);
    }

    public GetAuthenticationTypeResponse(List<String> list) {
        this.authTypes = list;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.GetAuthenticationTypeResponse.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [26=4] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Fido2VerificationOption> toFido2VerificationOption() {
        Fido2VerificationOption fido2VerificationOption;
        List<String> list = this.authTypes;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                switch (str.hashCode()) {
                    case -2015525726:
                        fido2VerificationOption = str.equals("MOBILE") ? Fido2VerificationOption.SMS : null;
                        break;
                    case 66081660:
                        if (str.equals("EMAIL")) {
                            fido2VerificationOption = Fido2VerificationOption.EMAIL;
                            break;
                        }
                        break;
                    case 66889060:
                        if (str.equals(AUTH_TYPE_FIDO2)) {
                            fido2VerificationOption = Fido2VerificationOption.FIDO2;
                            break;
                        }
                        break;
                    case 636276051:
                        if (str.equals("AUTHENTICATOR")) {
                            fido2VerificationOption = Fido2VerificationOption.GA;
                            break;
                        }
                        break;
                }
                if (fido2VerificationOption != null) {
                    arrayList.add(fido2VerificationOption);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((Fido2VerificationOption) obj) != Fido2VerificationOption.FIDO2) {
                    arrayList2.add(obj);
                }
            }
            List<Fido2VerificationOption> listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList2);
            if (listAxsJAYsNCnLh != null) {
                return listAxsJAYsNCnLh;
            }
        }
        return yDY.AhwBna();
    }
}
