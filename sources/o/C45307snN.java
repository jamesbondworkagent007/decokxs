package o;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.immomo.mls.fun.constants.FileInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C45307snN;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.snN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45307snN {
    public static final RequestBody OLrzqt(@NotNull android.net.Uri uri, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(context, "");
        if (Intrinsics.EZpvd((java.lang.Object) uri.getScheme(), (java.lang.Object) "content")) {
            return new TaskDescription(context, uri);
        }
        return null;
    }

    /* JADX INFO: renamed from: o.snN$TaskDescription */
    public static final class TaskDescription extends RequestBody {
        public final java.lang.String AEQbTJ;
        public final java.lang.String KWHzl;
        public final /* synthetic */ android.net.Uri OLrzqt;
        public final android.content.ContentResolver copydefault;

        public TaskDescription(android.content.Context context, android.net.Uri uri) {
            this.OLrzqt = uri;
            android.content.ContentResolver contentResolver = context.getContentResolver();
            this.copydefault = contentResolver;
            java.lang.String str = OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE;
            this.AEQbTJ = OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE;
            java.lang.String type = contentResolver.getType(uri);
            this.KWHzl = type != null ? type : str;
        }

        @Override // okhttp3.RequestBody
        public MediaType contentType() {
            return MediaType.Companion.parse(this.KWHzl);
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
        /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        @Override // okhttp3.RequestBody
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void writeTo(BufferedSink bufferedSink) {
            java.lang.Object objM7377constructorimpl;
            final java.lang.Throwable thM7380exceptionOrNullimpl;
            java.io.InputStream inputStreamOpenInputStream;
            Unit unit;
            Intrinsics.checkNotNullParameter(bufferedSink, "");
            android.net.Uri uri = this.OLrzqt;
            try {
                Result.Application application = Result.Companion;
                inputStreamOpenInputStream = this.copydefault.openInputStream(uri);
                unit = null;
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (inputStreamOpenInputStream != null) {
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        } else {
                            bufferedSink.write(bArr, 0, i);
                        }
                        Result.Application application22 = Result.Companion;
                        objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl == null) {
                            C44760scx.copydefault("Uri.asRequestBody: Failed to create RequestBody from Uri", new Function1() { // from class: o.snK
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return C45307snN.TaskDescription.EZpvd(thM7380exceptionOrNullimpl, (C44761scy) obj);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    yFA.copydefault(inputStreamOpenInputStream, null);
                    unit = unit2;
                } finally {
                }
            }
            objM7377constructorimpl = Result.m7377constructorimpl(unit);
            thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl == null) {
            }
        }

        public static final Unit EZpvd(java.lang.Throwable th, C44761scy c44761scy) {
            Intrinsics.checkNotNullParameter(c44761scy, "");
            c44761scy.KWHzl(th);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public static final kotlin.Pair<java.lang.String, java.lang.Long> copydefault(@NotNull android.net.Uri uri, @NotNull android.content.Context context) {
        java.lang.String string;
        java.lang.Long lValueOf;
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(context, "");
        android.database.Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
        java.lang.String str = null;
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    int columnIndex = cursorQuery.getColumnIndex("_display_name");
                    int columnIndex2 = cursorQuery.getColumnIndex(FileInfo.FileSize);
                    string = columnIndex != -1 ? cursorQuery.getString(columnIndex) : null;
                    lValueOf = columnIndex2 != -1 ? java.lang.Long.valueOf(cursorQuery.getLong(columnIndex2)) : null;
                } else {
                    string = null;
                    lValueOf = null;
                }
                Unit unit = Unit.INSTANCE;
                yFA.copydefault(cursorQuery, null);
                str = string;
            } finally {
            }
        } else {
            lValueOf = null;
        }
        return C56390yDp.OLrzqt(str, lValueOf);
    }
}
