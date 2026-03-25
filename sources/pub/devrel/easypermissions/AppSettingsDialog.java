package pub.devrel.easypermissions;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import o.C60125zwO;
import o.DialogInterfaceOnClickListenerC60120zwI;

/* JADX INFO: loaded from: classes13.dex */
public class AppSettingsDialog implements Parcelable {
    public static final Parcelable.Creator<AppSettingsDialog> CREATOR = new Parcelable.Creator<AppSettingsDialog>() { // from class: pub.devrel.easypermissions.AppSettingsDialog.1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        public AppSettingsDialog createFromParcel(Parcel parcel) {
            return new AppSettingsDialog(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        public AppSettingsDialog[] newArray(int i) {
            return new AppSettingsDialog[i];
        }
    };
    public final String AEQbTJ;
    public final int AYXKKw;
    public final int EZpvd;
    public Object KWHzl;
    public final String OLrzqt;
    public Context copydefault;
    public final String djBIcL;
    public final int gEmmrt;
    public final String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd() {
        return this.EZpvd;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AppSettingsDialog(Parcel parcel) {
        this.AYXKKw = parcel.readInt();
        this.valueOf = parcel.readString();
        this.djBIcL = parcel.readString();
        this.AEQbTJ = parcel.readString();
        this.OLrzqt = parcel.readString();
        this.gEmmrt = parcel.readInt();
        this.EZpvd = parcel.readInt();
    }

    public AppSettingsDialog(@NonNull Object obj, @StyleRes int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2, int i3) {
        copydefault(obj);
        this.AYXKKw = i;
        this.valueOf = str;
        this.djBIcL = str2;
        this.AEQbTJ = str3;
        this.OLrzqt = str4;
        this.gEmmrt = i2;
        this.EZpvd = i3;
    }

    public static AppSettingsDialog AEQbTJ(Intent intent, Activity activity) {
        AppSettingsDialog appSettingsDialogAEQbTJ = (AppSettingsDialog) intent.getParcelableExtra("extra_app_settings");
        if (appSettingsDialogAEQbTJ == null) {
            Objects.toString(intent);
            Objects.toString(intent.getExtras());
            appSettingsDialogAEQbTJ = new ActionBar(activity).AEQbTJ();
        }
        appSettingsDialogAEQbTJ.copydefault(activity);
        return appSettingsDialogAEQbTJ;
    }

    public final void copydefault(Object obj) {
        this.KWHzl = obj;
        if (obj instanceof Activity) {
            this.copydefault = (Activity) obj;
        } else {
            if (obj instanceof Fragment) {
                this.copydefault = ((Fragment) obj).getContext();
                return;
            }
            throw new IllegalStateException("Unknown object: " + obj);
        }
    }

    public final void KWHzl(Intent intent) {
        Object obj = this.KWHzl;
        if (obj instanceof Activity) {
            ((Activity) obj).startActivityForResult(intent, this.gEmmrt);
        } else if (obj instanceof Fragment) {
            ((Fragment) obj).startActivityForResult(intent, this.gEmmrt);
        }
    }

    public void AEQbTJ() {
        KWHzl(DialogInterfaceOnClickListenerC60120zwI.OLrzqt(this.copydefault, this));
    }

    public AlertDialog AEQbTJ(DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builder;
        int i = this.AYXKKw;
        if (i != -1) {
            builder = new AlertDialog.Builder(this.copydefault, i);
        } else {
            builder = new AlertDialog.Builder(this.copydefault);
        }
        return builder.setCancelable(false).setTitle(this.djBIcL).setMessage(this.valueOf).setPositiveButton(this.AEQbTJ, onClickListener).setNegativeButton(this.OLrzqt, onClickListener2).show();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(this.AYXKKw);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.gEmmrt);
        parcel.writeInt(this.EZpvd);
    }

    public static class ActionBar {
        public String AEQbTJ;
        public String AhwBna;
        public String EZpvd;
        public final Context KWHzl;
        public final Object copydefault;
        public String djBIcL;
        public int valueOf = -1;
        public int gEmmrt = -1;
        public boolean OLrzqt = false;

        public ActionBar(@NonNull Activity activity) {
            this.copydefault = activity;
            this.KWHzl = activity;
        }

        public ActionBar(@NonNull Fragment fragment) {
            this.copydefault = fragment;
            this.KWHzl = fragment.getContext();
        }

        public AppSettingsDialog AEQbTJ() {
            this.djBIcL = TextUtils.isEmpty(this.djBIcL) ? this.KWHzl.getString(C60125zwO.Activity.KWHzl) : this.djBIcL;
            this.AhwBna = TextUtils.isEmpty(this.AhwBna) ? this.KWHzl.getString(C60125zwO.Activity.AEQbTJ) : this.AhwBna;
            this.AEQbTJ = TextUtils.isEmpty(this.AEQbTJ) ? this.KWHzl.getString(R.string.ok) : this.AEQbTJ;
            this.EZpvd = TextUtils.isEmpty(this.EZpvd) ? this.KWHzl.getString(R.string.cancel) : this.EZpvd;
            int i = this.gEmmrt;
            if (i <= 0) {
                i = 16061;
            }
            this.gEmmrt = i;
            return new AppSettingsDialog(this.copydefault, this.valueOf, this.djBIcL, this.AhwBna, this.AEQbTJ, this.EZpvd, this.gEmmrt, this.OLrzqt ? 268435456 : 0);
        }
    }
}
