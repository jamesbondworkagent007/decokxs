package com.okinc.web3.security.utils;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes24.dex */
public final class SerializableKt {
    public static final /* synthetic */ <T extends Serializable> T getSerializableCompat(Intent intent, String str) {
        Intrinsics.checkNotNullParameter(intent, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) intent.getSerializableExtra(str, Serializable.class);
        }
        T t = (T) intent.getSerializableExtra(str);
        Intrinsics.KWHzl(1, "T?");
        return t;
    }

    public static final /* synthetic */ <T extends Parcelable> T getParcelableCompat(Bundle bundle, String str) {
        Intrinsics.checkNotNullParameter(bundle, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.KWHzl(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) bundle.getParcelable(str, Parcelable.class);
        }
        T t = (T) bundle.getParcelable(str);
        Intrinsics.KWHzl(1, "T?");
        return t;
    }
}
