package o;

import com.amplitude.android.migration.AndroidStorageMigration$execute$1;
import com.amplitude.android.migration.AndroidStorageMigration$moveEventsToDestination$1;
import com.amplitude.android.migration.AndroidStorageMigration$moveSimpleValue$1;
import com.amplitude.android.migration.AndroidStorageMigration$moveSimpleValues$1;
import com.amplitude.common.Logger;
import com.amplitude.core.Storage;
import com.fasterxml.jackson.core.JsonPointer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: renamed from: o.Jy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5236Jy {
    public final JM AEQbTJ;
    public final Logger KWHzl;
    public final JM copydefault;

    public C5236Jy(@NotNull JM jm, @NotNull JM jm2, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(jm, "");
        Intrinsics.checkNotNullParameter(jm2, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.AEQbTJ = jm;
        this.copydefault = jm2;
        this.KWHzl = logger;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AndroidStorageMigration$execute$1 androidStorageMigration$execute$1;
        C5236Jy c5236Jy;
        if (continuation instanceof AndroidStorageMigration$execute$1) {
            androidStorageMigration$execute$1 = (AndroidStorageMigration$execute$1) continuation;
            int i = androidStorageMigration$execute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidStorageMigration$execute$1.label = i - Integer.MIN_VALUE;
            } else {
                androidStorageMigration$execute$1 = new AndroidStorageMigration$execute$1(this, continuation);
            }
        }
        java.lang.Object obj = androidStorageMigration$execute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = androidStorageMigration$execute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            androidStorageMigration$execute$1.L$0 = this;
            androidStorageMigration$execute$1.label = 1;
            if (OLrzqt(androidStorageMigration$execute$1) == objCopydefault) {
                return objCopydefault;
            }
            c5236Jy = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            c5236Jy = (C5236Jy) androidStorageMigration$execute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        androidStorageMigration$execute$1.L$0 = null;
        androidStorageMigration$execute$1.label = 2;
        if (c5236Jy.EZpvd(androidStorageMigration$execute$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x003b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:24:0x0066 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0081 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x012f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2 A[Catch: Exception -> 0x008c, TryCatch #1 {Exception -> 0x008c, blocks: (B:33:0x0088, B:42:0x00a1, B:44:0x00b2, B:46:0x00ba), top: B:81:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba A[Catch: Exception -> 0x008c, TRY_LEAVE, TryCatch #1 {Exception -> 0x008c, blocks: (B:33:0x0088, B:42:0x00a1, B:44:0x00b2, B:46:0x00ba), top: B:81:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8 A[Catch: Exception -> 0x003b, TryCatch #2 {Exception -> 0x003b, blocks: (B:15:0x0036, B:48:0x00c1, B:50:0x00c8, B:54:0x00ea, B:70:0x0193), top: B:82:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0107 A[Catch: Exception -> 0x0190, TRY_LEAVE, TryCatch #0 {Exception -> 0x0190, blocks: (B:56:0x0101, B:58:0x0107, B:65:0x012f, B:66:0x015c), top: B:79:0x012f }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0193 A[Catch: Exception -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x003b, blocks: (B:15:0x0036, B:48:0x00c1, B:50:0x00c8, B:54:0x00ea, B:70:0x0193), top: B:82:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.amplitude.android.migration.AndroidStorageMigration$moveEventsToDestination$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v33, types: [o.JM] */
    /* JADX WARN: Type inference failed for: r0v9, types: [o.JM] */
    /* JADX WARN: Type inference failed for: r10v3, types: [o.JM] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [o.Jy] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, o.Jy] */
    /* JADX WARN: Type inference failed for: r13v5, types: [o.Jy] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.amplitude.android.migration.AndroidStorageMigration$moveEventsToDestination$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.amplitude.android.migration.AndroidStorageMigration$moveEventsToDestination$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, o.Jy] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v8, types: [o.JM] */
    /* JADX WARN: Type inference failed for: r9v0, types: [o.Jy] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [o.Jy] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00f9 -> B:56:0x0101). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x012f -> B:56:0x0101). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        ?? androidStorageMigration$moveEventsToDestination$1;
        ?? r9;
        C5236Jy c5236Jy;
        java.util.List<java.lang.Object> listOLrzqt;
        java.util.Iterator<java.lang.Object> it;
        ?? r0;
        ?? r2;
        java.lang.String str;
        ?? r4;
        ?? r22;
        ?? r13;
        int i;
        java.lang.String str2;
        java.util.Iterator<C5242Ke> it2;
        java.util.List<C5242Ke> list;
        java.util.Iterator<java.lang.Object> it3;
        C5242Ke c5242Ke;
        java.lang.Exception e;
        if (continuation instanceof AndroidStorageMigration$moveEventsToDestination$1) {
            AndroidStorageMigration$moveEventsToDestination$1 androidStorageMigration$moveEventsToDestination$12 = (AndroidStorageMigration$moveEventsToDestination$1) continuation;
            int i2 = androidStorageMigration$moveEventsToDestination$12.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidStorageMigration$moveEventsToDestination$12.label = i2 - Integer.MIN_VALUE;
                androidStorageMigration$moveEventsToDestination$1 = androidStorageMigration$moveEventsToDestination$12;
            } else {
                androidStorageMigration$moveEventsToDestination$1 = new AndroidStorageMigration$moveEventsToDestination$1(this, continuation);
            }
        }
        java.lang.Object obj = androidStorageMigration$moveEventsToDestination$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i3 = androidStorageMigration$moveEventsToDestination$1.label;
        int i4 = 3;
        try {
        } catch (java.lang.Exception e2) {
            e = e2;
        }
        if (i3 == 0) {
            C56391yDq.AEQbTJ(obj);
            try {
                ?? r02 = this.AEQbTJ;
                androidStorageMigration$moveEventsToDestination$1.L$0 = this;
                androidStorageMigration$moveEventsToDestination$1.label = 1;
                if (r02.KWHzl(androidStorageMigration$moveEventsToDestination$1) == objCopydefault) {
                    return objCopydefault;
                }
                c5236Jy = this;
                listOLrzqt = c5236Jy.AEQbTJ.OLrzqt();
                Intrinsics.copydefault(listOLrzqt, "");
                if (!listOLrzqt.isEmpty()) {
                }
            } catch (java.lang.Exception e3) {
                e = e3;
                r9 = this;
                r9.KWHzl.EZpvd("can't move event files: " + e.getMessage());
            }
        } else {
            if (i3 == 1) {
                c5236Jy = (C5236Jy) androidStorageMigration$moveEventsToDestination$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    listOLrzqt = c5236Jy.AEQbTJ.OLrzqt();
                    Intrinsics.copydefault(listOLrzqt, "");
                } catch (java.lang.Exception e4) {
                    e = e4;
                    r9 = c5236Jy;
                    r9.KWHzl.EZpvd("can't move event files: " + e.getMessage());
                }
                if (!listOLrzqt.isEmpty()) {
                    c5236Jy.AEQbTJ.AEQbTJ();
                    return Unit.INSTANCE;
                }
                it = listOLrzqt.iterator();
                r0 = androidStorageMigration$moveEventsToDestination$1;
                r2 = c5236Jy;
                if (it.hasNext()) {
                    java.lang.String str3 = (java.lang.String) it.next();
                    ?? r10 = r2.AEQbTJ;
                    r0.L$0 = r2;
                    r0.L$1 = it;
                    r0.L$2 = str3;
                    r0.L$3 = null;
                    r0.L$4 = null;
                    r0.L$5 = null;
                    r0.label = 2;
                    java.lang.Object objEZpvd = r10.EZpvd(str3, r0);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    str = str3;
                    r4 = r0;
                    obj = objEZpvd;
                    r22 = r2;
                    java.util.Iterator<java.lang.Object> it4 = it;
                    java.lang.String str4 = str;
                    java.util.List<C5242Ke> listAEQbTJ = KX.AEQbTJ(new JSONArray((java.lang.String) obj));
                    r13 = r22;
                    androidStorageMigration$moveEventsToDestination$1 = r4;
                    i = 0;
                    str2 = str4;
                    it = it4;
                    it2 = listAEQbTJ.iterator();
                    list = listAEQbTJ;
                } else {
                    r2.AEQbTJ.AEQbTJ();
                    ?? r42 = r2.copydefault;
                    r0.L$0 = r2;
                    r0.L$1 = null;
                    r0.L$2 = null;
                    r0.L$3 = null;
                    r0.L$4 = null;
                    r0.L$5 = null;
                    r0.label = 4;
                    if (r42.KWHzl(r0) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
            } else if (i3 == 2) {
                java.lang.String str5 = (java.lang.String) androidStorageMigration$moveEventsToDestination$1.L$2;
                it = (java.util.Iterator) androidStorageMigration$moveEventsToDestination$1.L$1;
                r9 = (C5236Jy) androidStorageMigration$moveEventsToDestination$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    str = str5;
                    r4 = androidStorageMigration$moveEventsToDestination$1;
                    r22 = r9;
                    java.util.Iterator<java.lang.Object> it42 = it;
                    java.lang.String str42 = str;
                    java.util.List<C5242Ke> listAEQbTJ2 = KX.AEQbTJ(new JSONArray((java.lang.String) obj));
                    r13 = r22;
                    androidStorageMigration$moveEventsToDestination$1 = r4;
                    i = 0;
                    str2 = str42;
                    it = it42;
                    it2 = listAEQbTJ2.iterator();
                    list = listAEQbTJ2;
                } catch (java.lang.Exception e5) {
                    e = e5;
                    r9.KWHzl.EZpvd("can't move event files: " + e.getMessage());
                }
            } else {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                i = androidStorageMigration$moveEventsToDestination$1.I$0;
                c5242Ke = (C5242Ke) androidStorageMigration$moveEventsToDestination$1.L$5;
                it2 = (java.util.Iterator) androidStorageMigration$moveEventsToDestination$1.L$4;
                list = (java.util.List) androidStorageMigration$moveEventsToDestination$1.L$3;
                str2 = (java.lang.String) androidStorageMigration$moveEventsToDestination$1.L$2;
                it3 = (java.util.Iterator) androidStorageMigration$moveEventsToDestination$1.L$1;
                r13 = (C5236Jy) androidStorageMigration$moveEventsToDestination$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    it = it3;
                    androidStorageMigration$moveEventsToDestination$1 = androidStorageMigration$moveEventsToDestination$1;
                    r13 = r13;
                } catch (java.lang.Exception e6) {
                    e = e6;
                    try {
                        r13.KWHzl.EZpvd("can't move event (" + c5242Ke + ") from file " + str2 + ": " + e.getMessage());
                        it = it3;
                        i4 = 3;
                        androidStorageMigration$moveEventsToDestination$1 = androidStorageMigration$moveEventsToDestination$1;
                        r13 = r13;
                    } catch (java.lang.Exception e7) {
                        e = e7;
                        androidStorageMigration$moveEventsToDestination$1 = r13;
                        r9 = androidStorageMigration$moveEventsToDestination$1;
                        r9.KWHzl.EZpvd("can't move event files: " + e.getMessage());
                    }
                }
            }
            r9.KWHzl.EZpvd("can't move event files: " + e.getMessage());
            return Unit.INSTANCE;
        }
        while (it2.hasNext()) {
            C5242Ke next = it2.next();
            i++;
            try {
            } catch (java.lang.Exception e8) {
                e = e8;
                it3 = it;
                c5242Ke = next;
                r13.KWHzl.EZpvd("can't move event (" + c5242Ke + ") from file " + str2 + ": " + e.getMessage());
                it = it3;
                i4 = 3;
                androidStorageMigration$moveEventsToDestination$1 = androidStorageMigration$moveEventsToDestination$1;
                r13 = r13;
                while (it2.hasNext()) {
                }
                r13.KWHzl.OLrzqt("Migrated " + i + JsonPointer.SEPARATOR + list.size() + " events from " + str2);
                r13.AEQbTJ.EZpvd(str2);
                r0 = androidStorageMigration$moveEventsToDestination$1;
                r2 = r13;
                i4 = 3;
                if (it.hasNext()) {
                }
            }
            ?? r03 = r13.copydefault;
            androidStorageMigration$moveEventsToDestination$1.L$0 = r13;
            androidStorageMigration$moveEventsToDestination$1.L$1 = it;
            androidStorageMigration$moveEventsToDestination$1.L$2 = str2;
            androidStorageMigration$moveEventsToDestination$1.L$3 = list;
            androidStorageMigration$moveEventsToDestination$1.L$4 = it2;
            androidStorageMigration$moveEventsToDestination$1.L$5 = next;
            androidStorageMigration$moveEventsToDestination$1.I$0 = i;
            androidStorageMigration$moveEventsToDestination$1.label = i4;
            if (r03.EZpvd(next, androidStorageMigration$moveEventsToDestination$1) == objCopydefault) {
                return objCopydefault;
            }
        }
        r13.KWHzl.OLrzqt("Migrated " + i + JsonPointer.SEPARATOR + list.size() + " events from " + str2);
        r13.AEQbTJ.EZpvd(str2);
        r0 = androidStorageMigration$moveEventsToDestination$1;
        r2 = r13;
        i4 = 3;
        if (it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AndroidStorageMigration$moveSimpleValues$1 androidStorageMigration$moveSimpleValues$1;
        C5236Jy c5236Jy;
        Storage.Constants constants;
        Storage.Constants constants2;
        Storage.Constants constants3;
        Storage.Constants constants4;
        Storage.Constants constants5;
        Storage.Constants constants6;
        if (continuation instanceof AndroidStorageMigration$moveSimpleValues$1) {
            androidStorageMigration$moveSimpleValues$1 = (AndroidStorageMigration$moveSimpleValues$1) continuation;
            int i = androidStorageMigration$moveSimpleValues$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidStorageMigration$moveSimpleValues$1.label = i - Integer.MIN_VALUE;
            } else {
                androidStorageMigration$moveSimpleValues$1 = new AndroidStorageMigration$moveSimpleValues$1(this, continuation);
            }
        }
        java.lang.Object obj = androidStorageMigration$moveSimpleValues$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        switch (androidStorageMigration$moveSimpleValues$1.label) {
            case 0:
                C56391yDq.AEQbTJ(obj);
                Storage.Constants constants7 = Storage.Constants.PREVIOUS_SESSION_ID;
                androidStorageMigration$moveSimpleValues$1.L$0 = this;
                androidStorageMigration$moveSimpleValues$1.label = 1;
                if (KWHzl(constants7, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                    return objCopydefault;
                }
                c5236Jy = this;
                constants = Storage.Constants.LAST_EVENT_TIME;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 2;
                if (c5236Jy.KWHzl(constants, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                    return objCopydefault;
                }
                constants2 = Storage.Constants.LAST_EVENT_ID;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 3;
                if (c5236Jy.KWHzl(constants2, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                    return objCopydefault;
                }
                constants3 = Storage.Constants.OPT_OUT;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 4;
                if (c5236Jy.KWHzl(constants3, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                    return objCopydefault;
                }
                constants4 = Storage.Constants.Events;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 5;
                if (c5236Jy.KWHzl(constants4, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                    return objCopydefault;
                }
                constants5 = Storage.Constants.APP_VERSION;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 6;
                if (c5236Jy.KWHzl(constants5, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                    return objCopydefault;
                }
                constants6 = Storage.Constants.APP_BUILD;
                androidStorageMigration$moveSimpleValues$1.L$0 = null;
                androidStorageMigration$moveSimpleValues$1.label = 7;
                if (c5236Jy.KWHzl(constants6, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            case 1:
                c5236Jy = (C5236Jy) androidStorageMigration$moveSimpleValues$1.L$0;
                C56391yDq.AEQbTJ(obj);
                constants = Storage.Constants.LAST_EVENT_TIME;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 2;
                if (c5236Jy.KWHzl(constants, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                constants2 = Storage.Constants.LAST_EVENT_ID;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 3;
                if (c5236Jy.KWHzl(constants2, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                constants3 = Storage.Constants.OPT_OUT;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 4;
                if (c5236Jy.KWHzl(constants3, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                constants4 = Storage.Constants.Events;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 5;
                if (c5236Jy.KWHzl(constants4, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                constants5 = Storage.Constants.APP_VERSION;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 6;
                if (c5236Jy.KWHzl(constants5, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                constants6 = Storage.Constants.APP_BUILD;
                androidStorageMigration$moveSimpleValues$1.L$0 = null;
                androidStorageMigration$moveSimpleValues$1.label = 7;
                if (c5236Jy.KWHzl(constants6, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 2:
                c5236Jy = (C5236Jy) androidStorageMigration$moveSimpleValues$1.L$0;
                C56391yDq.AEQbTJ(obj);
                constants2 = Storage.Constants.LAST_EVENT_ID;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 3;
                if (c5236Jy.KWHzl(constants2, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                constants3 = Storage.Constants.OPT_OUT;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 4;
                if (c5236Jy.KWHzl(constants3, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                constants4 = Storage.Constants.Events;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 5;
                if (c5236Jy.KWHzl(constants4, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                constants5 = Storage.Constants.APP_VERSION;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 6;
                if (c5236Jy.KWHzl(constants5, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                constants6 = Storage.Constants.APP_BUILD;
                androidStorageMigration$moveSimpleValues$1.L$0 = null;
                androidStorageMigration$moveSimpleValues$1.label = 7;
                if (c5236Jy.KWHzl(constants6, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 3:
                c5236Jy = (C5236Jy) androidStorageMigration$moveSimpleValues$1.L$0;
                C56391yDq.AEQbTJ(obj);
                constants3 = Storage.Constants.OPT_OUT;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 4;
                if (c5236Jy.KWHzl(constants3, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                constants4 = Storage.Constants.Events;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 5;
                if (c5236Jy.KWHzl(constants4, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                constants5 = Storage.Constants.APP_VERSION;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 6;
                if (c5236Jy.KWHzl(constants5, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                constants6 = Storage.Constants.APP_BUILD;
                androidStorageMigration$moveSimpleValues$1.L$0 = null;
                androidStorageMigration$moveSimpleValues$1.label = 7;
                if (c5236Jy.KWHzl(constants6, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 4:
                c5236Jy = (C5236Jy) androidStorageMigration$moveSimpleValues$1.L$0;
                C56391yDq.AEQbTJ(obj);
                constants4 = Storage.Constants.Events;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 5;
                if (c5236Jy.KWHzl(constants4, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                constants5 = Storage.Constants.APP_VERSION;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 6;
                if (c5236Jy.KWHzl(constants5, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                constants6 = Storage.Constants.APP_BUILD;
                androidStorageMigration$moveSimpleValues$1.L$0 = null;
                androidStorageMigration$moveSimpleValues$1.label = 7;
                if (c5236Jy.KWHzl(constants6, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 5:
                c5236Jy = (C5236Jy) androidStorageMigration$moveSimpleValues$1.L$0;
                C56391yDq.AEQbTJ(obj);
                constants5 = Storage.Constants.APP_VERSION;
                androidStorageMigration$moveSimpleValues$1.L$0 = c5236Jy;
                androidStorageMigration$moveSimpleValues$1.label = 6;
                if (c5236Jy.KWHzl(constants5, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                constants6 = Storage.Constants.APP_BUILD;
                androidStorageMigration$moveSimpleValues$1.L$0 = null;
                androidStorageMigration$moveSimpleValues$1.label = 7;
                if (c5236Jy.KWHzl(constants6, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 6:
                c5236Jy = (C5236Jy) androidStorageMigration$moveSimpleValues$1.L$0;
                C56391yDq.AEQbTJ(obj);
                constants6 = Storage.Constants.APP_BUILD;
                androidStorageMigration$moveSimpleValues$1.L$0 = null;
                androidStorageMigration$moveSimpleValues$1.label = 7;
                if (c5236Jy.KWHzl(constants6, androidStorageMigration$moveSimpleValues$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            case 7:
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0037 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: o.Jy */
    /* JADX DEBUG: Multi-variable search result rejected for r10v13, resolved type: o.JM */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: o.JM */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.amplitude.android.migration.AndroidStorageMigration$moveSimpleValue$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(Storage.Constants constants, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        C5236Jy androidStorageMigration$moveSimpleValue$1;
        C5236Jy c5236Jy;
        C5236Jy c5236Jy2;
        JM jm;
        if (continuation instanceof AndroidStorageMigration$moveSimpleValue$1) {
            AndroidStorageMigration$moveSimpleValue$1 androidStorageMigration$moveSimpleValue$12 = (AndroidStorageMigration$moveSimpleValue$1) continuation;
            int i = androidStorageMigration$moveSimpleValue$12.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidStorageMigration$moveSimpleValue$12.label = i - Integer.MIN_VALUE;
                androidStorageMigration$moveSimpleValue$1 = androidStorageMigration$moveSimpleValue$12;
            } else {
                androidStorageMigration$moveSimpleValue$1 = new AndroidStorageMigration$moveSimpleValue$1(this, continuation);
            }
        }
        java.lang.Object obj = androidStorageMigration$moveSimpleValue$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = androidStorageMigration$moveSimpleValue$1.label;
        try {
            if (i2 == 0) {
                C56391yDq.AEQbTJ(obj);
                try {
                    java.lang.String strCopydefault = this.AEQbTJ.copydefault(constants);
                    if (strCopydefault == null) {
                        return Unit.INSTANCE;
                    }
                    if (this.copydefault.copydefault(constants) == null) {
                        try {
                            this.KWHzl.OLrzqt("Migrating " + constants + " with value " + strCopydefault);
                            JM jm2 = this.copydefault;
                            androidStorageMigration$moveSimpleValue$1.L$0 = this;
                            androidStorageMigration$moveSimpleValue$1.L$1 = constants;
                            androidStorageMigration$moveSimpleValue$1.label = 1;
                            if (jm2.EZpvd(constants, strCopydefault, androidStorageMigration$moveSimpleValue$1) == objCopydefault) {
                                return objCopydefault;
                            }
                        } catch (java.lang.Exception e) {
                            e = e;
                            c5236Jy = this;
                            c5236Jy.KWHzl.EZpvd("can't write destination " + constants + ": " + e.getMessage());
                            return Unit.INSTANCE;
                        }
                    }
                    c5236Jy2 = this;
                    jm = c5236Jy2.AEQbTJ;
                    androidStorageMigration$moveSimpleValue$1.L$0 = c5236Jy2;
                    androidStorageMigration$moveSimpleValue$1.L$1 = constants;
                    androidStorageMigration$moveSimpleValue$1.label = 2;
                    if (jm.KWHzl(constants, androidStorageMigration$moveSimpleValue$1) == objCopydefault) {
                    }
                } catch (java.lang.Exception e2) {
                    e = e2;
                    androidStorageMigration$moveSimpleValue$1 = this;
                    androidStorageMigration$moveSimpleValue$1.KWHzl.EZpvd("can't move " + constants + ": " + e.getMessage());
                    return Unit.INSTANCE;
                }
            } else if (i2 == 1) {
                constants = (Storage.Constants) androidStorageMigration$moveSimpleValue$1.L$1;
                c5236Jy2 = (C5236Jy) androidStorageMigration$moveSimpleValue$1.L$0;
                try {
                    C56391yDq.AEQbTJ(obj);
                    try {
                        jm = c5236Jy2.AEQbTJ;
                        androidStorageMigration$moveSimpleValue$1.L$0 = c5236Jy2;
                        androidStorageMigration$moveSimpleValue$1.L$1 = constants;
                        androidStorageMigration$moveSimpleValue$1.label = 2;
                        if (jm.KWHzl(constants, androidStorageMigration$moveSimpleValue$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        androidStorageMigration$moveSimpleValue$1 = c5236Jy2;
                        androidStorageMigration$moveSimpleValue$1.KWHzl.EZpvd("can't move " + constants + ": " + e.getMessage());
                    }
                } catch (java.lang.Exception e4) {
                    e = e4;
                    c5236Jy = c5236Jy2;
                    c5236Jy.KWHzl.EZpvd("can't write destination " + constants + ": " + e.getMessage());
                    return Unit.INSTANCE;
                }
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
        } catch (java.lang.Exception e5) {
            e = e5;
        }
        return Unit.INSTANCE;
    }
}
