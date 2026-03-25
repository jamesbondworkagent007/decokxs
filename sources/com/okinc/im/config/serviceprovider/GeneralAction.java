package com.okinc.im.config.serviceprovider;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class GeneralAction implements Parcelable {
    public static final Application Companion = new Application(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.config.serviceprovider.GeneralAction.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ GeneralAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GeneralAction() {
    }

    public static final class OpenMediaPickerToast extends GeneralAction {
        public static final Parcelable.Creator<OpenMediaPickerToast> CREATOR = new Creator();
        public final String AEQbTJ;

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<OpenMediaPickerToast> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenMediaPickerToast createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new OpenMediaPickerToast(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenMediaPickerToast[] newArray(int i) {
                return new OpenMediaPickerToast[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OpenMediaPickerToast copy$default(OpenMediaPickerToast openMediaPickerToast, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = openMediaPickerToast.AEQbTJ;
            }
            return openMediaPickerToast.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OpenMediaPickerToast OLrzqt(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new OpenMediaPickerToast(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
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
            return (obj instanceof OpenMediaPickerToast) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((OpenMediaPickerToast) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OpenMediaPickerToast(message=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenMediaPickerToast(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class OpenDialog extends GeneralAction {
        public static final Parcelable.Creator<OpenDialog> CREATOR = new Creator();
        public final Function1<Context, Dialog> EZpvd;

        public static final class Creator implements Parcelable.Creator<OpenDialog> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenDialog createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new OpenDialog((Function1) parcel.readSerializable());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenDialog[] newArray(int i) {
                return new OpenDialog[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.config.serviceprovider.GeneralAction$OpenDialog */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OpenDialog copy$default(OpenDialog openDialog, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = openDialog.EZpvd;
            }
            return openDialog.copydefault(function1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<Context, Dialog> AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OpenDialog copydefault(@NotNull Function1<? super Context, ? extends Dialog> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return new OpenDialog(function1);
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
            return (obj instanceof OpenDialog) && Intrinsics.EZpvd(this.EZpvd, ((OpenDialog) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OpenDialog(dialogProducer=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable((Serializable) this.EZpvd);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super android.content.Context, ? extends android.app.Dialog> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OpenDialog(@NotNull Function1<? super Context, ? extends Dialog> function1) {
            super(null);
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class OpenDialogFragment extends GeneralAction {
        public static final Parcelable.Creator<OpenDialogFragment> CREATOR = new Creator();
        public final Function1<FragmentActivity, DialogFragment> AEQbTJ;
        public final String EZpvd;

        public static final class Creator implements Parcelable.Creator<OpenDialogFragment> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenDialogFragment createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new OpenDialogFragment((Function1) parcel.readSerializable(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenDialogFragment[] newArray(int i) {
                return new OpenDialogFragment[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.config.serviceprovider.GeneralAction$OpenDialogFragment */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OpenDialogFragment copy$default(OpenDialogFragment openDialogFragment, Function1 function1, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = openDialogFragment.AEQbTJ;
            }
            if ((i & 2) != 0) {
                str = openDialogFragment.EZpvd;
            }
            return openDialogFragment.copydefault(function1, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<FragmentActivity, DialogFragment> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OpenDialogFragment copydefault(@NotNull Function1<? super FragmentActivity, ? extends DialogFragment> function1, String str) {
            Intrinsics.checkNotNullParameter(function1, "");
            return new OpenDialogFragment(function1, str);
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
            if (!(obj instanceof OpenDialogFragment)) {
                return false;
            }
            OpenDialogFragment openDialogFragment = (OpenDialogFragment) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, openDialogFragment.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) openDialogFragment.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            String str = this.EZpvd;
            return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OpenDialogFragment(dialogFragmentProducer=" + this.AEQbTJ + ", dialogTag=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable((Serializable) this.AEQbTJ);
            parcel.writeString(this.EZpvd);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentActivity, ? extends androidx.fragment.app.DialogFragment> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OpenDialogFragment(@NotNull Function1<? super FragmentActivity, ? extends DialogFragment> function1, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
            this.EZpvd = str;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class OpenActivity extends GeneralAction {
        public static final Parcelable.Creator<OpenActivity> CREATOR = new Creator();
        public final Intent copydefault;

        public static final class Creator implements Parcelable.Creator<OpenActivity> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenActivity createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new OpenActivity((Intent) parcel.readParcelable(OpenActivity.class.getClassLoader()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final OpenActivity[] newArray(int i) {
                return new OpenActivity[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ OpenActivity copy$default(OpenActivity openActivity, Intent intent, int i, Object obj) {
            if ((i & 1) != 0) {
                intent = openActivity.copydefault;
            }
            return openActivity.AEQbTJ(intent);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OpenActivity AEQbTJ(@NotNull Intent intent) {
            Intrinsics.checkNotNullParameter(intent, "");
            return new OpenActivity(intent);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Intent OLrzqt() {
            return this.copydefault;
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
            return (obj instanceof OpenActivity) && Intrinsics.EZpvd(this.copydefault, ((OpenActivity) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "OpenActivity(intent=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.copydefault, i);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenActivity(@NotNull Intent intent) {
            super(null);
            Intrinsics.checkNotNullParameter(intent, "");
            this.copydefault = intent;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class LaunchActivity extends GeneralAction {
        public static final Parcelable.Creator<LaunchActivity> CREATOR = new Creator();
        public final Function1<Context, Unit> OLrzqt;

        public static final class Creator implements Parcelable.Creator<LaunchActivity> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LaunchActivity createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new LaunchActivity((Function1) parcel.readSerializable());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final LaunchActivity[] newArray(int i) {
                return new LaunchActivity[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.config.serviceprovider.GeneralAction$LaunchActivity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LaunchActivity copy$default(LaunchActivity launchActivity, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = launchActivity.OLrzqt;
            }
            return launchActivity.KWHzl(function1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LaunchActivity KWHzl(@NotNull Function1<? super Context, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return new LaunchActivity(function1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<Context, Unit> OLrzqt() {
            return this.OLrzqt;
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
            return (obj instanceof LaunchActivity) && Intrinsics.EZpvd(this.OLrzqt, ((LaunchActivity) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "LaunchActivity(onLaunch=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable((Serializable) this.OLrzqt);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super android.content.Context, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public LaunchActivity(@NotNull Function1<? super Context, Unit> function1) {
            super(null);
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
        }
    }

    public static final class SendMessages extends GeneralAction {
        public static final Parcelable.Creator<SendMessages> CREATOR = new Creator();
        public final ArrayList<SendMessageRequestParam> OLrzqt;

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<SendMessages> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SendMessages createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(SendMessages.class.getClassLoader()));
                }
                return new SendMessages(arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SendMessages[] newArray(int i) {
                return new SendMessages[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.config.serviceprovider.GeneralAction$SendMessages */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SendMessages copy$default(SendMessages sendMessages, ArrayList arrayList, int i, Object obj) {
            if ((i & 1) != 0) {
                arrayList = sendMessages.OLrzqt;
            }
            return sendMessages.AEQbTJ(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SendMessages AEQbTJ(@NotNull ArrayList<SendMessageRequestParam> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            return new SendMessages(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ArrayList<SendMessageRequestParam> copydefault() {
            return this.OLrzqt;
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
            return (obj instanceof SendMessages) && Intrinsics.EZpvd(this.OLrzqt, ((SendMessages) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SendMessages(messages=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<SendMessageRequestParam> arrayList = this.OLrzqt;
            parcel.writeInt(arrayList.size());
            Iterator<SendMessageRequestParam> it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SendMessages(@NotNull ArrayList<SendMessageRequestParam> arrayList) {
            super(null);
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.OLrzqt = arrayList;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class SetTextToEditTextField extends GeneralAction {
        public static final Parcelable.Creator<SetTextToEditTextField> CREATOR = new Creator();
        public final String EZpvd;

        public static final class Creator implements Parcelable.Creator<SetTextToEditTextField> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SetTextToEditTextField createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SetTextToEditTextField(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SetTextToEditTextField[] newArray(int i) {
                return new SetTextToEditTextField[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SetTextToEditTextField copy$default(SetTextToEditTextField setTextToEditTextField, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setTextToEditTextField.EZpvd;
            }
            return setTextToEditTextField.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SetTextToEditTextField copydefault(String str) {
            return new SetTextToEditTextField(str);
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
            return (obj instanceof SetTextToEditTextField) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((SetTextToEditTextField) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.EZpvd;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SetTextToEditTextField(text=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.EZpvd);
        }

        public SetTextToEditTextField(String str) {
            super(null);
            this.EZpvd = str;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class AppendTextToEditTextField extends GeneralAction {
        public static final Parcelable.Creator<AppendTextToEditTextField> CREATOR = new Creator();
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<AppendTextToEditTextField> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AppendTextToEditTextField createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new AppendTextToEditTextField(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AppendTextToEditTextField[] newArray(int i) {
                return new AppendTextToEditTextField[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AppendTextToEditTextField copy$default(AppendTextToEditTextField appendTextToEditTextField, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = appendTextToEditTextField.copydefault;
            }
            return appendTextToEditTextField.KWHzl(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AppendTextToEditTextField KWHzl(String str) {
            return new AppendTextToEditTextField(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.copydefault;
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
            return (obj instanceof AppendTextToEditTextField) && Intrinsics.EZpvd((Object) this.copydefault, (Object) ((AppendTextToEditTextField) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.copydefault;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AppendTextToEditTextField(text=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault);
        }

        public AppendTextToEditTextField(String str) {
            super(null);
            this.copydefault = str;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Toast extends GeneralAction {
        public static final Parcelable.Creator<Toast> CREATOR = new Creator();
        public final String AEQbTJ;

        public static final class Creator implements Parcelable.Creator<Toast> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Toast createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Toast(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Toast[] newArray(int i) {
                return new Toast[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Toast copy$default(Toast toast, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toast.AEQbTJ;
            }
            return toast.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Toast copydefault(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Toast(str);
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
            return (obj instanceof Toast) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) ((Toast) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Toast(text=" + this.AEQbTJ + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Toast(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class CustomAction extends GeneralAction {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Creator();
        public final Function1<FragmentActivity, Unit> copydefault;

        public static final class Creator implements Parcelable.Creator<CustomAction> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new CustomAction((Function1) parcel.readSerializable());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.config.serviceprovider.GeneralAction$CustomAction */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CustomAction copy$default(CustomAction customAction, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = customAction.copydefault;
            }
            return customAction.EZpvd(function1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CustomAction EZpvd(@NotNull Function1<? super FragmentActivity, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            return new CustomAction(function1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<FragmentActivity, Unit> EZpvd() {
            return this.copydefault;
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
            return (obj instanceof CustomAction) && Intrinsics.EZpvd(this.copydefault, ((CustomAction) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CustomAction(action=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeSerializable((Serializable) this.copydefault);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super androidx.fragment.app.FragmentActivity, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CustomAction(@NotNull Function1<? super FragmentActivity, Unit> function1) {
            super(null);
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class DeleteLastCharacterFromEditTextField extends GeneralAction {
        public static final DeleteLastCharacterFromEditTextField AEQbTJ = new DeleteLastCharacterFromEditTextField();
        public static final Parcelable.Creator<DeleteLastCharacterFromEditTextField> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<DeleteLastCharacterFromEditTextField> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeleteLastCharacterFromEditTextField createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                parcel.readInt();
                return DeleteLastCharacterFromEditTextField.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DeleteLastCharacterFromEditTextField[] newArray(int i) {
                return new DeleteLastCharacterFromEditTextField[i];
            }
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
            if (!(obj instanceof DeleteLastCharacterFromEditTextField)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1670888580;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DeleteLastCharacterFromEditTextField";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }

        private DeleteLastCharacterFromEditTextField() {
            super(null);
        }
    }

    public static final class ProcessPastedUris extends GeneralAction {
        public static final Parcelable.Creator<ProcessPastedUris> CREATOR = new Creator();
        public final List<Uri> EZpvd;

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<ProcessPastedUris> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProcessPastedUris createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(ProcessPastedUris.class.getClassLoader()));
                }
                return new ProcessPastedUris(arrayList);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ProcessPastedUris[] newArray(int i) {
                return new ProcessPastedUris[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.config.serviceprovider.GeneralAction$ProcessPastedUris */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProcessPastedUris copy$default(ProcessPastedUris processPastedUris, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = processPastedUris.EZpvd;
            }
            return processPastedUris.EZpvd(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ProcessPastedUris EZpvd(@NotNull List<? extends Uri> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new ProcessPastedUris(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Uri> copydefault() {
            return this.EZpvd;
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
            return (obj instanceof ProcessPastedUris) && Intrinsics.EZpvd(this.EZpvd, ((ProcessPastedUris) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ProcessPastedUris(uriList=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            List<Uri> list = this.EZpvd;
            parcel.writeInt(list.size());
            Iterator<Uri> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends android.net.Uri> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ProcessPastedUris(@NotNull List<? extends Uri> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.config.serviceprovider.GeneralAction.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
