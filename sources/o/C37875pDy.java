package o;

import android.provider.Settings;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pDy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37875pDy {
    public Function1<? super java.lang.Boolean, Unit> EZpvd;
    public final android.content.Context KWHzl;
    public android.database.ContentObserver copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault != null;
    }

    public C37875pDy(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = context.getApplicationContext();
    }

    public final void copydefault(@NotNull Function1<? super java.lang.Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (copydefault()) {
            this.EZpvd = function1;
            function1.invoke(java.lang.Boolean.valueOf(OLrzqt()));
            return;
        }
        this.EZpvd = function1;
        this.copydefault = new ActionBar(new android.os.Handler(android.os.Looper.getMainLooper()));
        android.content.ContentResolver contentResolver = this.KWHzl.getContentResolver();
        android.net.Uri uriFor = Settings.System.getUriFor("accelerometer_rotation");
        android.database.ContentObserver contentObserver = this.copydefault;
        Intrinsics.copydefault(contentObserver);
        contentResolver.registerContentObserver(uriFor, false, contentObserver);
        Function1<? super java.lang.Boolean, Unit> function12 = this.EZpvd;
        if (function12 != null) {
            function12.invoke(java.lang.Boolean.valueOf(OLrzqt()));
        }
    }

    /* JADX INFO: renamed from: o.pDy$ActionBar */
    public static final class ActionBar extends android.database.ContentObserver {
        public ActionBar(android.os.Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, android.net.Uri uri) {
            super.onChange(z, uri);
            Function1 function1 = C37875pDy.this.EZpvd;
            if (function1 != null) {
                function1.invoke(java.lang.Boolean.valueOf(C37875pDy.this.OLrzqt()));
            }
        }
    }

    public final void KWHzl() {
        android.database.ContentObserver contentObserver = this.copydefault;
        if (contentObserver != null) {
            this.KWHzl.getContentResolver().unregisterContentObserver(contentObserver);
            this.copydefault = null;
        }
        this.EZpvd = null;
    }

    public final boolean OLrzqt() {
        return Settings.System.getInt(this.KWHzl.getContentResolver(), "accelerometer_rotation") == 1;
    }
}
