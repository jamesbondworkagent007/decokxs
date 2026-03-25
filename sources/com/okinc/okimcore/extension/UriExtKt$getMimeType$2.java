package com.okinc.okimcore.extension;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.C59449zhJ;
import o.pUU;
import o.sFB;

/* JADX INFO: loaded from: classes10.dex */
public final class UriExtKt$getMimeType$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Uri $this_getMimeType;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UriExtKt$getMimeType$2(Context context, Uri uri, Continuation<? super UriExtKt$getMimeType$2> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$this_getMimeType = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UriExtKt$getMimeType$2 uriExtKt$getMimeType$2 = new UriExtKt$getMimeType$2(this.$context, this.$this_getMimeType, continuation);
        uriExtKt$getMimeType$2.L$0 = obj;
        return uriExtKt$getMimeType$2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((UriExtKt$getMimeType$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [258=5] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v16, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: java.lang.StringBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01eb  */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [T, java.lang.Object, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Object objM7377constructorimpl;
        String str;
        Object objAhwBna;
        Ref.ObjectRef objectRef2;
        Object objFetchVPNInfo;
        String str2;
        Object objIsConnected;
        T t;
        Ref.ObjectRef objectRef3;
        Object objValues;
        String str3;
        String str4;
        String str5;
        Object objAhwBna2;
        Ref.ObjectRef objectRef4;
        ?? r6;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ContentResolver contentResolver = this.$context.getContentResolver();
            objectRef = new Ref.ObjectRef();
            Uri uri = this.$this_getMimeType;
            try {
                Result.Application application = Result.Companion;
                objectRef.element = contentResolver.getType(uri);
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            Uri uri2 = this.$this_getMimeType;
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
            if (thM7380exceptionOrNullimpl != null) {
                pUU.AEQbTJ("UriExt", "Error retrieving MIME type for URI: " + uri2 + ": " + thM7380exceptionOrNullimpl.getMessage(), thM7380exceptionOrNullimpl);
                objectRef.element = null;
            }
            pUU.EZpvd("UriExt", "getMimeType: ContentResolver returned '" + objectRef.element + "' for URI: " + this.$this_getMimeType);
            T t2 = objectRef.element;
            if (t2 == 0 || C59449zhJ.startsWith$default((String) t2, "application/", false, 2, null)) {
                str = (String) objectRef.element;
                pUU.KWHzl("UriExt", "getMimeType: ContentResolver returned null/generic type, trying fallback methods");
                Uri uri3 = this.$this_getMimeType;
                Context context = this.$context;
                this.L$0 = objectRef;
                this.L$1 = str;
                this.L$2 = objectRef;
                this.label = 1;
                objAhwBna = sFB.AhwBna(uri3, context, this);
                if (objAhwBna == objCopydefault) {
                    return objCopydefault;
                }
                objectRef2 = objectRef;
                str2 = (String) objAhwBna;
                if (str2 == null) {
                }
                t = str2;
                objectRef3 = objectRef2;
                objectRef.element = t;
                pUU.KWHzl("UriExt", "getMimeType: Fallback detection result: '" + objectRef3.element + "'");
                objectRef = objectRef3;
            } else if (C59449zhJ.startsWith$default((String) objectRef.element, "image/", false, 2, null)) {
                Uri uri4 = this.$this_getMimeType;
                Context context2 = this.$context;
                this.L$0 = objectRef;
                this.label = 4;
                objFetchVPNInfo = sFB.fetchVPNInfo(uri4, context2, this);
                if (objFetchVPNInfo == objCopydefault) {
                    return objCopydefault;
                }
                str5 = (String) objFetchVPNInfo;
                Uri uri5 = this.$this_getMimeType;
                Context context3 = this.$context;
                this.L$0 = objectRef;
                this.L$1 = str5;
                this.label = 5;
                objAhwBna2 = sFB.AhwBna(uri5, context3, this);
                if (objAhwBna2 != objCopydefault) {
                }
            }
        } else if (i == 1) {
            Ref.ObjectRef objectRef5 = (Ref.ObjectRef) this.L$2;
            str = (String) this.L$1;
            objectRef2 = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objectRef = objectRef5;
            objAhwBna = obj;
            str2 = (String) objAhwBna;
            if (str2 == null) {
                Uri uri6 = this.$this_getMimeType;
                Context context4 = this.$context;
                this.L$0 = objectRef2;
                this.L$1 = str;
                this.L$2 = objectRef;
                this.label = 2;
                objIsConnected = sFB.isConnected(uri6, context4, this);
                if (objIsConnected == objCopydefault) {
                    return objCopydefault;
                }
                str2 = (String) objIsConnected;
                if (str2 == null) {
                }
            }
            t = str2;
            objectRef3 = objectRef2;
            objectRef.element = t;
            pUU.KWHzl("UriExt", "getMimeType: Fallback detection result: '" + objectRef3.element + "'");
            objectRef = objectRef3;
        } else if (i == 2) {
            Ref.ObjectRef objectRef6 = (Ref.ObjectRef) this.L$2;
            str = (String) this.L$1;
            objectRef2 = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objectRef = objectRef6;
            objIsConnected = obj;
            str2 = (String) objIsConnected;
            if (str2 == null) {
                Uri uri7 = this.$this_getMimeType;
                Context context5 = this.$context;
                this.L$0 = objectRef2;
                this.L$1 = str;
                this.L$2 = objectRef;
                this.label = 3;
                objValues = sFB.values(uri7, context5, this);
                if (objValues == objCopydefault) {
                    return objCopydefault;
                }
                str3 = str;
                objectRef3 = objectRef2;
                str4 = (String) objValues;
                t = str3;
                if (str4 != null) {
                }
                objectRef.element = t;
                pUU.KWHzl("UriExt", "getMimeType: Fallback detection result: '" + objectRef3.element + "'");
                objectRef = objectRef3;
            }
            t = str2;
            objectRef3 = objectRef2;
            objectRef.element = t;
            pUU.KWHzl("UriExt", "getMimeType: Fallback detection result: '" + objectRef3.element + "'");
            objectRef = objectRef3;
        } else if (i == 3) {
            Ref.ObjectRef objectRef7 = (Ref.ObjectRef) this.L$2;
            String str6 = (String) this.L$1;
            objectRef3 = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objectRef = objectRef7;
            objValues = obj;
            str3 = str6;
            str4 = (String) objValues;
            t = str3;
            if (str4 != null) {
                t = str4;
            }
            objectRef.element = t;
            pUU.KWHzl("UriExt", "getMimeType: Fallback detection result: '" + objectRef3.element + "'");
            objectRef = objectRef3;
        } else if (i == 4) {
            Ref.ObjectRef objectRef8 = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objectRef = objectRef8;
            objFetchVPNInfo = obj;
            str5 = (String) objFetchVPNInfo;
            Uri uri52 = this.$this_getMimeType;
            Context context32 = this.$context;
            this.L$0 = objectRef;
            this.L$1 = str5;
            this.label = 5;
            objAhwBna2 = sFB.AhwBna(uri52, context32, this);
            if (objAhwBna2 != objCopydefault) {
                return objCopydefault;
            }
            objectRef4 = objectRef;
            String str7 = (String) objAhwBna2;
            if (str5 != null) {
            }
            pUU.EZpvd("UriExt", "getMimeType: Verifying image MIME type - ContentResolver: '" + objectRef4.element + "', MagicBytes: '" + str5 + "', BitmapFactory: '" + str7 + "'");
            if (r6 != 0) {
                pUU.valueOf("UriExt", "getMimeType: MIME type mismatch detected! File extension suggests '" + objectRef4.element + "' but actual content is '" + ((String) r6) + "'. Using content-based type.");
                objectRef4.element = r6;
            }
            objectRef = objectRef4;
        } else {
            if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str5 = (String) this.L$1;
            objectRef4 = (Ref.ObjectRef) this.L$0;
            C56391yDq.AEQbTJ(obj);
            objAhwBna2 = obj;
            String str72 = (String) objAhwBna2;
            r6 = str5 != null ? str72 : str5;
            pUU.EZpvd("UriExt", "getMimeType: Verifying image MIME type - ContentResolver: '" + objectRef4.element + "', MagicBytes: '" + str5 + "', BitmapFactory: '" + str72 + "'");
            if (r6 != 0 && !Intrinsics.EZpvd((Object) r6, objectRef4.element)) {
                pUU.valueOf("UriExt", "getMimeType: MIME type mismatch detected! File extension suggests '" + objectRef4.element + "' but actual content is '" + ((String) r6) + "'. Using content-based type.");
                objectRef4.element = r6;
            }
            objectRef = objectRef4;
        }
        pUU.EZpvd("UriExt", "getMimeType: Final MIME type: '" + objectRef.element + "' for URI: " + this.$this_getMimeType);
        return objectRef.element;
    }
}
