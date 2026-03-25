package o;

import android.os.Build;
import android.provider.MediaStore;
import com.okinc.components.track.TrackChannel;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: renamed from: o.udS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48848udS {
    public static final java.lang.String AEQbTJ = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
    public static final java.lang.String[] OLrzqt = {"_id", "_data", "date_added", "width", "height"};
    public final WeakReference<android.app.Activity> AhwBna;
    public WeakReference<android.database.ContentObserver> KWHzl;
    public final C57904yrH copydefault;
    public final java.util.List<java.lang.String> EZpvd = java.util.Arrays.asList("screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap", "screenshots", "截屏", "截图");
    public final java.util.List<java.lang.String> djBIcL = new java.util.ArrayList(16);

    public C48848udS(android.app.Activity activity) {
        this.AhwBna = new WeakReference<>(activity);
        this.copydefault = new C57904yrH(activity);
    }

    public static AbstractC58247yxg<android.util.Pair<android.net.Uri, java.lang.String>> EZpvd(android.app.Activity activity) {
        return new C48848udS(activity).copydefault();
    }

    public static boolean EZpvd(java.lang.String str) {
        return str.toLowerCase().contains("screenshot") || str.contains("截屏") || str.contains("截图");
    }

    public static boolean copydefault(long j, long j2) {
        return java.lang.Math.abs(j - j2) <= 60;
    }

    public final boolean OLrzqt(long j, long j2) {
        android.graphics.Point point = new android.graphics.Point();
        if (this.AhwBna.get() != null) {
            this.AhwBna.get().getWindowManager().getDefaultDisplay().getRealSize(point);
        }
        if (point.x == j || point.y == j2) {
            long j3 = point.y;
            if (j3 == j || j3 == j2) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Type inference failed for r0v3. Raw type applied. Possible types: o.yxg<R>, o.yxg<android.util.Pair<android.net.Uri, java.lang.String>> */
    public final AbstractC58247yxg<android.util.Pair<android.net.Uri, java.lang.String>> copydefault() {
        if (Build.VERSION.SDK_INT >= 33) {
            return AbstractC58247yxg.error(new java.lang.SecurityException("Permission not granted"));
        }
        return this.copydefault.KWHzl("android.permission.READ_EXTERNAL_STORAGE").flatMap(new InterfaceC58229yxO() { // from class: o.udR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return this.AEQbTJ.AEQbTJ((java.lang.Boolean) obj);
            }
        });
    }

    public final /* synthetic */ InterfaceC58255yxo AEQbTJ(java.lang.Boolean bool) throws java.lang.Exception {
        if (bool.booleanValue()) {
            if (this.AhwBna.get() != null) {
                return copydefault(this.AhwBna.get());
            }
            return AbstractC58247yxg.error(new java.lang.Exception("Activity has been recycled."));
        }
        return AbstractC58247yxg.error(new java.lang.SecurityException("Permission not granted"));
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2, long j, long j2) {
        if (this.djBIcL.contains(str2)) {
            return;
        }
        if (this.djBIcL.size() > 10) {
            this.djBIcL.remove(0);
        }
        if (copydefault(str2) && copydefault(j, j2)) {
            pUU.EZpvd("ScreenshotDetector", "reportScreenShotDetector, uri:" + android.net.Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, str) + ",path:" + str2);
            C32866mlf.KWHzl("screenshot_detector", TrackChannel.OKStatistics);
            this.djBIcL.add(str2);
        }
    }

    public final boolean copydefault(java.lang.String str) {
        java.util.Iterator<java.lang.String> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            if (str.toLowerCase().contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o.udS$2, reason: invalid class name */
    /* JADX INFO: loaded from: classes19.dex */
    public class AnonymousClass2 implements InterfaceC58249yxi<android.util.Pair<android.net.Uri, java.lang.String>> {
        public final /* synthetic */ android.content.ContentResolver copydefault;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public AnonymousClass2(android.content.ContentResolver contentResolver) {
            this.copydefault = contentResolver;
        }

        @Override // o.InterfaceC58249yxi
        public void subscribe(final InterfaceC58251yxk<android.util.Pair<android.net.Uri, java.lang.String>> interfaceC58251yxk) {
            C48848udS.this.KWHzl = new WeakReference(new android.database.ContentObserver(null) { // from class: o.udS.2.5
                @Override // android.database.ContentObserver
                public void onChange(boolean z, android.net.Uri uri) {
                    long j;
                    long j2;
                    uri.toString();
                    if (uri.toString().startsWith(C48848udS.AEQbTJ)) {
                        android.database.Cursor cursorQuery = null;
                        try {
                            try {
                                cursorQuery = AnonymousClass2.this.copydefault.query(uri, C48848udS.OLrzqt, null, null, "date_added DESC");
                                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                                    int columnIndex = cursorQuery.getColumnIndex("_id");
                                    int columnIndex2 = cursorQuery.getColumnIndex("_data");
                                    int columnIndex3 = cursorQuery.getColumnIndex("date_added");
                                    int columnIndex4 = cursorQuery.getColumnIndex("width");
                                    int columnIndex5 = cursorQuery.getColumnIndex("height");
                                    if (columnIndex >= 0 && columnIndex2 >= 0 && columnIndex3 >= 0 && columnIndex4 >= 0 && columnIndex5 >= 0) {
                                        java.lang.String string = cursorQuery.getString(columnIndex);
                                        java.lang.String string2 = cursorQuery.getString(columnIndex2);
                                        long j3 = cursorQuery.getLong(columnIndex3);
                                        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
                                        long j4 = cursorQuery.getLong(columnIndex4);
                                        long j5 = cursorQuery.getLong(columnIndex5);
                                        C48848udS.this.EZpvd(string, string2, jCurrentTimeMillis, j3);
                                        if (C48848udS.EZpvd(string2) && C48848udS.copydefault(jCurrentTimeMillis, j3)) {
                                            j = j5;
                                            j2 = j4;
                                            if (C48848udS.this.OLrzqt(j2, j)) {
                                                android.net.Uri uriWithAppendedPath = android.net.Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, string);
                                                Objects.toString(uriWithAppendedPath);
                                                interfaceC58251yxk.onNext(new android.util.Pair(uriWithAppendedPath, string2));
                                            }
                                        } else {
                                            j = j5;
                                            j2 = j4;
                                        }
                                        C48848udS.EZpvd(string2);
                                        C48848udS.copydefault(jCurrentTimeMillis, j3);
                                        C48848udS.this.OLrzqt(j2, j);
                                    }
                                    cursorQuery.close();
                                    return;
                                }
                            } catch (java.lang.Exception e) {
                                e.getMessage();
                                if (0 != 0) {
                                }
                            }
                        } finally {
                            if (0 != 0) {
                                cursorQuery.close();
                            }
                        }
                    }
                    super.onChange(z, uri);
                }
            });
            if (C48848udS.this.KWHzl.get() != null) {
                this.copydefault.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, (android.database.ContentObserver) C48848udS.this.KWHzl.get());
            }
            final android.content.ContentResolver contentResolver = this.copydefault;
            interfaceC58251yxk.setCancellable(new InterfaceC58225yxK() { // from class: o.udT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58225yxK
                public final void cancel() throws java.lang.Exception {
                    this.EZpvd.OLrzqt(contentResolver);
                }
            });
        }

        public final /* synthetic */ void OLrzqt(android.content.ContentResolver contentResolver) throws java.lang.Exception {
            if (C48848udS.this.KWHzl == null || C48848udS.this.KWHzl.get() == null) {
                return;
            }
            contentResolver.unregisterContentObserver((android.database.ContentObserver) C48848udS.this.KWHzl.get());
        }
    }

    public AbstractC58247yxg<android.util.Pair<android.net.Uri, java.lang.String>> copydefault(android.content.Context context) {
        return AbstractC58247yxg.create(new AnonymousClass2(context.getContentResolver()));
    }
}
