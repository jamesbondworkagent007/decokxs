package o;

import android.app.AlertDialog;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;

/* JADX INFO: renamed from: o.zwP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C60126zwP {
    public int AEQbTJ;
    public int AhwBna;
    public java.lang.String[] EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    public C60126zwP(@androidx.annotation.NonNull java.lang.String str, @androidx.annotation.NonNull java.lang.String str2, @androidx.annotation.NonNull java.lang.String str3, @androidx.annotation.StyleRes int i, int i2, @androidx.annotation.NonNull java.lang.String[] strArr) {
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.copydefault = str3;
        this.AhwBna = i;
        this.AEQbTJ = i2;
        this.EZpvd = strArr;
    }

    public C60126zwP(android.os.Bundle bundle) {
        this.OLrzqt = bundle.getString("positiveButton");
        this.KWHzl = bundle.getString("negativeButton");
        this.copydefault = bundle.getString("rationaleMsg");
        this.AhwBna = bundle.getInt("theme");
        this.AEQbTJ = bundle.getInt("requestCode");
        this.EZpvd = bundle.getStringArray("permissions");
    }

    public android.os.Bundle AEQbTJ() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("positiveButton", this.OLrzqt);
        bundle.putString("negativeButton", this.KWHzl);
        bundle.putString("rationaleMsg", this.copydefault);
        bundle.putInt("theme", this.AhwBna);
        bundle.putInt("requestCode", this.AEQbTJ);
        bundle.putStringArray("permissions", this.EZpvd);
        return bundle;
    }

    public androidx.appcompat.app.AlertDialog KWHzl(android.content.Context context, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        int i = this.AhwBna;
        if (i > 0) {
            builder = new AlertDialog.Builder(context, i);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        return builder.setCancelable(false).setPositiveButton(this.OLrzqt, onClickListener).setNegativeButton(this.KWHzl, onClickListener).setMessage(this.copydefault).create();
    }

    public android.app.AlertDialog AEQbTJ(android.content.Context context, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        if (this.AhwBna > 0) {
            builder = new AlertDialog.Builder(context, this.AhwBna);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        return builder.setCancelable(false).setPositiveButton(this.OLrzqt, onClickListener).setNegativeButton(this.KWHzl, onClickListener).setMessage(this.copydefault).create();
    }
}
