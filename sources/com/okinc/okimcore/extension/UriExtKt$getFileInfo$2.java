package com.okinc.okimcore.extension;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.immomo.mls.fun.constants.FileInfo;
import java.io.File;
import java.io.InputStream;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C44161sFo;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;
import o.sFB;
import o.yFA;

/* JADX INFO: loaded from: classes10.dex */
public final class UriExtKt$getFileInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C44161sFo>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Uri $this_getFileInfo;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriExtKt$getFileInfo$2(Uri uri, Context context, Continuation<? super UriExtKt$getFileInfo$2> continuation) {
        super(2, continuation);
        this.$this_getFileInfo = uri;
        this.$context = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UriExtKt$getFileInfo$2 uriExtKt$getFileInfo$2 = new UriExtKt$getFileInfo$2(this.$this_getFileInfo, this.$context, continuation);
        uriExtKt$getFileInfo$2.L$0 = obj;
        return uriExtKt$getFileInfo$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C44161sFo> continuation) {
        return ((UriExtKt$getFileInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v15, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v15, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Uri uri;
        ContentResolver contentResolver;
        Ref.ObjectRef objectRef;
        Object objAkhnZx;
        Ref.LongRef longRef;
        Object objM7377constructorimpl;
        long j;
        Object objM7377constructorimpl2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            uri = this.$this_getFileInfo;
            contentResolver = this.$context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "");
            objectRef = new Ref.ObjectRef();
            String lastPathSegment = this.$this_getFileInfo.getLastPathSegment();
            T tAEQbTJ = lastPathSegment;
            if (lastPathSegment == null) {
                tAEQbTJ = sFB.AEQbTJ();
            }
            objectRef.element = tAEQbTJ;
            Ref.LongRef longRef2 = new Ref.LongRef();
            longRef2.element = -1L;
            pUU.KWHzl("UriExt", "Getting file info for URI: " + uri);
            pUU.KWHzl("UriExt", "Initial fileName: " + objectRef.element);
            if (Intrinsics.EZpvd((Object) uri.getScheme(), (Object) "file")) {
                String path = uri.getPath();
                File file = path != null ? new File(path) : null;
                if (file != null && file.exists()) {
                    objectRef.element = file.getName();
                    longRef2.element = file.length();
                    return new C44161sFo((String) objectRef.element, longRef2.element, MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(file.toURI().toString())));
                }
            }
            Context context = this.$context;
            this.L$0 = coroutineScope;
            this.L$1 = uri;
            this.L$2 = contentResolver;
            this.L$3 = objectRef;
            this.L$4 = longRef2;
            this.label = 1;
            objAkhnZx = sFB.AkhnZx(uri, context, this);
            if (objAkhnZx == objCopydefault) {
                return objCopydefault;
            }
            longRef = longRef2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRef = (Ref.LongRef) this.L$4;
            Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.L$3;
            contentResolver = (ContentResolver) this.L$2;
            uri = (Uri) this.L$1;
            C56391yDq.AEQbTJ(obj);
            objectRef = objectRef2;
            objAkhnZx = obj;
        }
        String str = (String) objAkhnZx;
        int i2 = -1;
        try {
            Result.Application application = Result.Companion;
            Cursor cursorQuery = contentResolver.query(uri, new String[]{"_display_name", FileInfo.FileSize}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int columnIndex = cursorQuery.getColumnIndex("_display_name");
                        if (columnIndex != -1) {
                            objectRef.element = cursorQuery.getString(columnIndex);
                        } else {
                            pUU.valueOf("UriExt", "OpenableColumns.DISPLAY_NAME column not found for URI: " + uri);
                        }
                        int columnIndex2 = cursorQuery.getColumnIndex(FileInfo.FileSize);
                        if (columnIndex2 != -1) {
                            longRef.element = cursorQuery.getLong(columnIndex2);
                        } else {
                            pUU.valueOf("UriExt", "OpenableColumns.SIZE column not found for URI: " + uri);
                        }
                    } else {
                        pUU.valueOf("UriExt", "No data found in cursor for URI: " + uri);
                    }
                    Unit unit = Unit.INSTANCE;
                    yFA.copydefault(cursorQuery, null);
                } finally {
                }
            } else {
                pUU.copydefault("UriExt", "ContentResolver.query returned null for URI: " + uri);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            pUU.AEQbTJ("UriExt", "Error querying file size for URI: " + uri + ": " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
            j = -1;
            longRef.element = -1L;
        } else {
            j = -1;
        }
        if (longRef.element == j) {
            pUU.EZpvd("UriExt", "Falling back to InputStream read for size for URI: " + uri);
            try {
                Result.Application application3 = Result.Companion;
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    try {
                        long jAvailable = inputStreamOpenInputStream.available();
                        if (jAvailable > 0) {
                            longRef.element = jAvailable;
                            pUU.EZpvd("UriExt", "Size from available(): " + jAvailable + " bytes for URI: " + uri);
                        } else {
                            pUU.valueOf("UriExt", "InputStream.available() returned 0 or less, reading stream to get accurate size for URI: " + uri);
                            byte[] bArr = new byte[4096];
                            long j2 = 0L;
                            while (true) {
                                int i3 = inputStreamOpenInputStream.read(bArr);
                                if (i3 == i2) {
                                    break;
                                }
                                j2 += (long) i3;
                                i2 = -1;
                            }
                            longRef.element = j2;
                            pUU.EZpvd("UriExt", "Size from full stream read: " + j2 + " bytes for URI: " + uri);
                        }
                        Unit unit2 = Unit.INSTANCE;
                        yFA.copydefault(inputStreamOpenInputStream, null);
                    } finally {
                    }
                } else {
                    pUU.copydefault("UriExt", "Failed to open input stream for URI: " + uri);
                }
                objM7377constructorimpl2 = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Application application4 = Result.Companion;
                objM7377constructorimpl2 = Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
            }
            Throwable thM7380exceptionOrNullimpl2 = Result.m7380exceptionOrNullimpl(objM7377constructorimpl2);
            if (thM7380exceptionOrNullimpl2 != null) {
                pUU.AEQbTJ("UriExt", "Error reading input stream to get size for URI: " + uri + ": " + thM7380exceptionOrNullimpl2.getMessage(), thM7380exceptionOrNullimpl2);
                longRef.element = -1L;
            }
        }
        pUU.KWHzl("UriExt", "Final fileName: " + objectRef.element + ", fileSize: " + longRef.element + ", mimeType: " + str + " for URI: " + uri);
        return new C44161sFo((String) objectRef.element, longRef.element, str);
    }
}
