package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import com.okinc.biz.util.UploadUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mzh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33610mzh {
    public static final C33610mzh OLrzqt = new C33610mzh();

    private C33610mzh() {
    }

    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull final Function1<? super android.graphics.Bitmap, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58185ywX abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(str).KWHzl(yBP.AEQbTJ());
        final Function1 function12 = new Function1() { // from class: o.mzk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33610mzh.AEQbTJ(function1, (java.lang.String) obj);
            }
        };
        abstractC58185ywXKWHzl.AEQbTJ(new InterfaceC58227yxM() { // from class: o.mzj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C33610mzh.KWHzl(function12, obj);
            }
        });
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0049 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(Function1 function1, java.lang.String str) throws java.lang.Throwable {
        java.lang.OutOfMemoryError e;
        java.io.InputStream inputStreamByteStream;
        java.lang.Exception e2;
        android.graphics.Bitmap bitmapDecodeStream;
        Request.Builder builder = new Request.Builder();
        Intrinsics.copydefault((java.lang.Object) str);
        Request requestBuild = builder.url(str).build();
        ?? r1 = 0;
        java.io.InputStream inputStream = null;
        bitmap = null;
        bitmap = null;
        android.graphics.Bitmap bitmap = null;
        try {
            try {
                Response responseExecute = UploadUtils.OLrzqt.OLrzqt().newCall(requestBuild).execute();
                if (responseExecute.code() == 200) {
                    ResponseBody responseBodyBody = responseExecute.body();
                    inputStreamByteStream = responseBodyBody != null ? responseBodyBody.byteStream() : null;
                    try {
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamByteStream);
                        inputStream = inputStreamByteStream;
                    } catch (java.lang.Exception e3) {
                        e2 = e3;
                        pUU.AEQbTJ("tag", e2);
                        if (inputStreamByteStream != null) {
                            inputStreamByteStream.close();
                        }
                    } catch (java.lang.OutOfMemoryError e4) {
                        e = e4;
                        pUU.AEQbTJ("tag", e);
                        if (inputStreamByteStream != null) {
                            inputStreamByteStream.close();
                        }
                    }
                } else {
                    bitmapDecodeStream = null;
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                bitmap = bitmapDecodeStream;
            } catch (java.lang.Exception e5) {
                e2 = e5;
                inputStreamByteStream = null;
            } catch (java.lang.OutOfMemoryError e6) {
                e = e6;
                inputStreamByteStream = null;
            } catch (java.lang.Throwable th) {
                th = th;
                if (r1 != 0) {
                }
                throw th;
            }
            function1.invoke(bitmap);
            return Unit.INSTANCE;
        } catch (java.lang.Throwable th2) {
            th = th2;
            r1 = requestBuild;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    public final android.graphics.Bitmap EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            byte[] bArrDecode = android.util.Base64.decode(C59449zhJ.replace$default(C59449zhJ.replace$default(str, "data:image/png;base64,", "", false, 4, (java.lang.Object) null), "data:image/jpeg;base64,", "", false, 4, (java.lang.Object) null), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
            return null;
        }
    }

    public final java.lang.String OLrzqt(@NotNull android.content.Context context, android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(context, "");
        try {
            android.net.Uri uri = android.net.Uri.parse(MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "shareImage" + java.lang.System.currentTimeMillis(), (java.lang.String) null));
            Intrinsics.copydefault(uri);
            return EZpvd(context, uri);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
            return "";
        }
    }

    public final java.lang.String KWHzl(@NotNull android.content.Context context, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return OLrzqt(context, EZpvd(str));
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
            return "";
        }
    }

    public final void copydefault(@NotNull final android.content.Context context, @NotNull java.lang.String str, @NotNull final Function1<? super java.lang.String, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        try {
            copydefault(str, new Function1() { // from class: o.mzo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C33610mzh.EZpvd(function1, context, (android.graphics.Bitmap) obj);
                }
            });
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("tag", e);
        }
    }

    public static final Unit EZpvd(Function1 function1, android.content.Context context, android.graphics.Bitmap bitmap) {
        function1.invoke(OLrzqt.OLrzqt(context, bitmap));
        return Unit.INSTANCE;
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context, @NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        android.database.Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(uri, new java.lang.String[]{"_data"}, null, null, null);
            Intrinsics.copydefault(cursorQuery);
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
            cursorQuery.moveToFirst();
            java.lang.String string = cursorQuery.getString(columnIndexOrThrow);
            cursorQuery.close();
            return string;
        } catch (java.lang.Exception unused) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return "";
        } catch (java.lang.Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static /* synthetic */ java.lang.String saveBitmapWithCompression$default(C33610mzh c33610mzh, android.content.Context context, android.graphics.Bitmap bitmap, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 90;
        }
        return c33610mzh.EZpvd(context, bitmap, i);
    }

    public final java.lang.String EZpvd(@NotNull android.content.Context context, @NotNull android.graphics.Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        return AEQbTJ(new java.io.File(context.getExternalCacheDir(), "upload.jpg"), bitmap, i);
    }

    public static /* synthetic */ java.lang.String saveBitmapByCustomName$default(C33610mzh c33610mzh, android.content.Context context, android.graphics.Bitmap bitmap, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 90;
        }
        return c33610mzh.AEQbTJ(context, bitmap, i);
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context, @NotNull android.graphics.Bitmap bitmap, int i) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        return AEQbTJ(new java.io.File(context.getExternalCacheDir(), java.lang.System.currentTimeMillis() + ".jpg"), bitmap, i);
    }

    public final java.lang.String AEQbTJ(@NotNull java.io.File file, @NotNull android.graphics.Bitmap bitmap, int i) {
        java.io.FileOutputStream fileOutputStream;
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
        } catch (java.io.IOException e) {
            pUU.AEQbTJ("saveBitmapToFile", e);
        }
        java.lang.String path = null;
        try {
            fileOutputStream = new java.io.FileOutputStream(file);
        } catch (java.io.FileNotFoundException e2) {
            pUU.AEQbTJ("saveBitmapToFile", e2);
            fileOutputStream = null;
        }
        if (fileOutputStream != null) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
            path = file.getPath();
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.flush();
            } catch (java.io.IOException e3) {
                e3.printStackTrace();
            }
        }
        if (fileOutputStream != null) {
            fileOutputStream.close();
        }
        return path;
    }
}
