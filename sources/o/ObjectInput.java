package o;

import aws.sdk.kotlin.runtime.config.profile.AwsConfigLoaderKt$loadAwsSharedConfig$$inlined$withSpan$default$1;
import aws.sdk.kotlin.runtime.config.profile.AwsConfigLoaderKt$loadAwsSharedConfig$1;
import aws.sdk.kotlin.runtime.config.profile.ConfigSectionType;
import aws.sdk.kotlin.runtime.config.profile.FileType;
import aws.smithy.kotlin.runtime.telemetry.trace.SpanKind;
import aws.smithy.kotlin.runtime.telemetry.trace.SpanStatus;
import aws.smithy.kotlin.runtime.util.OsFamily;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ObjectInput {

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OsFamily.values().length];
            try {
                iArr[OsFamily.Unknown.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OsFamily.Windows.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:16:0x0033 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x00cc */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002b, B:45:0x00d0, B:47:0x00d4, B:49:0x00e6, B:48:0x00de), top: B:53:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00de A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002b, B:45:0x00d0, B:47:0x00d4, B:49:0x00e6, B:48:0x00de), top: B:53:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r1v6, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r1v9, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [o.GU] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, o.GU] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object EZpvd(@NotNull HL hl, java.lang.String str, ObjectOutput objectOutput, @NotNull Continuation<? super ObjectOutputStream> continuation) throws java.lang.Throwable {
        AwsConfigLoaderKt$loadAwsSharedConfig$1 awsConfigLoaderKt$loadAwsSharedConfig$1;
        ?? EZpvd;
        ?? r1;
        CoroutineContext c5140Gg;
        ?? r12;
        FZ fzAEQbTJ;
        InterfaceC5135Gb interfaceC5135GbOLrzqt;
        if (continuation instanceof AwsConfigLoaderKt$loadAwsSharedConfig$1) {
            awsConfigLoaderKt$loadAwsSharedConfig$1 = (AwsConfigLoaderKt$loadAwsSharedConfig$1) continuation;
            int i = awsConfigLoaderKt$loadAwsSharedConfig$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                awsConfigLoaderKt$loadAwsSharedConfig$1.label = i - Integer.MIN_VALUE;
            } else {
                awsConfigLoaderKt$loadAwsSharedConfig$1 = new AwsConfigLoaderKt$loadAwsSharedConfig$1(continuation);
            }
        }
        java.lang.Object objWithContext = awsConfigLoaderKt$loadAwsSharedConfig$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = awsConfigLoaderKt$loadAwsSharedConfig$1.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r1 = (GU) awsConfigLoaderKt$loadAwsSharedConfig$1.L$0;
                try {
                    C56391yDq.AEQbTJ(objWithContext);
                    r12 = r1;
                    r12.close();
                    return objWithContext;
                } catch (java.lang.Exception e) {
                    e = e;
                    if (e instanceof CancellationException) {
                        r1.KWHzl(SpanStatus.ERROR);
                        GX.AEQbTJ(r1, e, true);
                    } else {
                        GX.OLrzqt(r1, "cancelled", C56443yFo.KWHzl(true));
                    }
                    throw e;
                }
            }
            C56391yDq.AEQbTJ(objWithContext);
            InterfaceC57843yq interfaceC57843yqCopydefault = C58108yv.copydefault();
            SpanKind spanKind = SpanKind.INTERNAL;
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            EZpvd = FX.KWHzl(awsConfigLoaderKt$loadAwsSharedConfig$1.getContext()).copydefault().EZpvd("AwsSharedConfig").EZpvd("loadAwsSharedConfig", interfaceC57843yqCopydefault, spanKind, C5143Gj.EZpvd(awsConfigLoaderKt$loadAwsSharedConfig$1.getContext()));
            try {
                FY fy = (FY) awsConfigLoaderKt$loadAwsSharedConfig$1.getContext().get(FY.KWHzl);
                FW fwOLrzqt = (fy == null || (fzAEQbTJ = fy.AEQbTJ()) == null || (interfaceC5135GbOLrzqt = fzAEQbTJ.OLrzqt()) == null) ? null : interfaceC5135GbOLrzqt.OLrzqt();
                if (fwOLrzqt != null) {
                    c5140Gg = new C5140Gg(fwOLrzqt);
                } else {
                    c5140Gg = (C5140Gg) awsConfigLoaderKt$loadAwsSharedConfig$1.getContext().get(C5140Gg.EZpvd);
                    if (c5140Gg == null) {
                        c5140Gg = emptyCoroutineContext;
                    }
                }
                CoroutineContext coroutineContextPlus = emptyCoroutineContext.plus(new GW(EZpvd)).plus(c5140Gg);
                AwsConfigLoaderKt$loadAwsSharedConfig$$inlined$withSpan$default$1 awsConfigLoaderKt$loadAwsSharedConfig$$inlined$withSpan$default$1 = new AwsConfigLoaderKt$loadAwsSharedConfig$$inlined$withSpan$default$1(EZpvd, null, objectOutput, hl, str);
                awsConfigLoaderKt$loadAwsSharedConfig$1.L$0 = EZpvd;
                awsConfigLoaderKt$loadAwsSharedConfig$1.label = 1;
                objWithContext = BuildersKt.withContext(coroutineContextPlus, awsConfigLoaderKt$loadAwsSharedConfig$$inlined$withSpan$default$1, awsConfigLoaderKt$loadAwsSharedConfig$1);
                if (objWithContext == objCopydefault) {
                    return objCopydefault;
                }
                r12 = EZpvd;
                r12.close();
                return objWithContext;
            } catch (java.lang.Exception e2) {
                e = e2;
                r1 = EZpvd;
                if (e instanceof CancellationException) {
                }
                throw e;
            } catch (java.lang.Throwable th) {
                th = th;
                EZpvd.close();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            EZpvd = awsConfigLoaderKt$loadAwsSharedConfig$1;
        }
    }

    public static /* synthetic */ java.lang.Object loadAwsSharedConfig$default(HL hl, java.lang.String str, ObjectOutput objectOutput, Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            objectOutput = null;
        }
        return EZpvd(hl, str, objectOutput, continuation);
    }

    public static final java.util.Map<ConfigSectionType, java.util.Map<java.lang.String, ObjectStreamField>> KWHzl(@NotNull java.util.Map<ConfigSectionType, ? extends java.util.Map<java.lang.String, ObjectStreamField>>... mapArr) {
        Intrinsics.checkNotNullParameter(mapArr, "");
        java.util.Map mapOLrzqt = C56423yEv.OLrzqt();
        for (ConfigSectionType configSectionType : ConfigSectionType.values()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.Map<ConfigSectionType, ? extends java.util.Map<java.lang.String, ObjectStreamField>> map : mapArr) {
                java.util.Map<java.lang.String, ObjectStreamField> map2 = map.get(configSectionType);
                if (map2 != null) {
                    arrayList.add(map2);
                }
            }
            mapOLrzqt.put(configSectionType, copydefault(arrayList));
        }
        return C56423yEv.AYXKKw(mapOLrzqt);
    }

    public static final java.util.Map<java.lang.String, ObjectStreamField> copydefault(java.util.List<? extends java.util.Map<java.lang.String, ObjectStreamField>> list) {
        java.util.Map<java.lang.String, GetField> mapKWHzl;
        java.util.Map mapOLrzqt = C56423yEv.OLrzqt();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((java.util.Map) it.next()).entrySet()) {
                ObjectStreamField objectStreamField = (ObjectStreamField) mapOLrzqt.get(entry.getKey());
                if (objectStreamField == null || (mapKWHzl = objectStreamField.copydefault()) == null) {
                    mapKWHzl = C56424yEw.KWHzl();
                }
                ObjectStreamField objectStreamField2 = new ObjectStreamField((java.lang.String) entry.getKey(), C56424yEw.OLrzqt(mapKWHzl, ((ObjectStreamField) entry.getValue()).copydefault()), ((ObjectStreamField) entry.getValue()).EZpvd());
                mapOLrzqt.put(objectStreamField2.OLrzqt(), objectStreamField2);
            }
        }
        return C56423yEv.AYXKKw(mapOLrzqt);
    }

    public static /* synthetic */ ObjectOutput resolveConfigSource$default(HL hl, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return KWHzl(hl, str);
    }

    public static final ObjectOutput KWHzl(@NotNull HL hl, java.lang.String str) {
        Intrinsics.checkNotNullParameter(hl, "");
        if (str == null && (str = (java.lang.String) C59333zf.AEQbTJ(IOException.zsXlph.fARcdN(), hl)) == null) {
            str = "default";
        }
        return new ObjectOutput(str, AEQbTJ(FileType.CONFIGURATION.path(hl), hl), AEQbTJ(FileType.CREDENTIAL.path(hl), hl));
    }

    public static final java.lang.String AEQbTJ(@NotNull java.lang.String str, @NotNull HL hl) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(hl, "");
        if (!StringsKt__StringsKt.startsWith$default((java.lang.CharSequence) StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) str).toString(), '~', false, 2, (java.lang.Object) null)) {
            return str;
        }
        java.lang.String strKWHzl = KWHzl(hl);
        if (strKWHzl == null) {
            throw new java.lang.IllegalStateException("Unable to determine user home directory".toString());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(strKWHzl);
        java.lang.String strSubstring = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        sb.append(strSubstring);
        return sb.toString();
    }

    public static final java.lang.String KWHzl(HL hl) {
        int i = Activity.EZpvd[hl.EZpvd().KWHzl().ordinal()];
        if (i == 1 || i == 2) {
            java.lang.String strEZpvd = hl.EZpvd("HOME");
            if (strEZpvd != null) {
                return strEZpvd;
            }
            java.lang.String strEZpvd2 = hl.EZpvd("USERPROFILE");
            if (strEZpvd2 != null) {
                return strEZpvd2;
            }
            java.lang.String strEZpvd3 = EZpvd(C56390yDp.OLrzqt(hl.EZpvd("HOMEDRIVE"), hl.EZpvd("HOMEPATH")));
            return strEZpvd3 == null ? hl.OLrzqt("user.home") : strEZpvd3;
        }
        java.lang.String strEZpvd4 = hl.EZpvd("HOME");
        return strEZpvd4 == null ? hl.OLrzqt("user.home") : strEZpvd4;
    }

    public static final java.lang.String EZpvd(kotlin.Pair<java.lang.String, java.lang.String> pair) {
        if (pair.getFirst() == null || pair.getSecond() == null) {
            return null;
        }
        return pair.getFirst() + pair.getSecond();
    }
}
