package com.okinc.okrisk.collection.apps;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Base64;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.okinc.okrisk.OKRiskPayloadManager;
import com.okinc.okrisk.collection.apps.AppsCollectionUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o.C33129mqd;
import o.C47050tii;
import o.C47054tim;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C56444yFp;
import o.C59405zgS;
import o.C59449zhJ;
import o.C59467zhb;
import o.InterfaceC56445yFq;
import o.yDV;
import o.yDX;
import o.yDY;
import o.yFA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class AppsCollectionUtils {
    public static final int $stable;
    private static final char[] HEX_CHARS_UPPER;
    public static final AppsCollectionUtils INSTANCE = new AppsCollectionUtils();
    private static final ThreadLocal<CertificateFactory> certFactoryThreadLocal = new ActionBar();
    private static final ThreadLocal<MessageDigest> md5DigestThreadLocal = new TaskDescription();

    /* JADX INFO: renamed from: com.okinc.okrisk.collection.apps.AppsCollectionUtils$buildAppInfo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppsCollectionUtils.this.buildAppInfo(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.okinc.okrisk.collection.apps.AppsCollectionUtils$getAppInfoAsJson$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17451 extends ContinuationImpl {
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17451(Continuation<? super C17451> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppsCollectionUtils.this.getAppInfoAsJson(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.okinc.okrisk.collection.apps.AppsCollectionUtils$iconBase64$1, reason: invalid class name and case insensitive filesystem */
    public static final class C17461 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C17461(Continuation<? super C17461> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppsCollectionUtils.this.iconBase64(null, null, 0, this);
        }
    }

    private AppsCollectionUtils() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AppType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ AppType[] $VALUES;
        public static final AppType ALL = new AppType("ALL", 0);
        public static final AppType USER = new AppType("USER", 1);
        public static final AppType SYSTEM = new AppType("SYSTEM", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ AppType[] $values() {
            return new AppType[]{ALL, USER, SYSTEM};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<AppType> getEntries() {
            return $ENTRIES;
        }

        private AppType(String str, int i) {
        }

        static {
            AppType[] appTypeArr$values = $values();
            $VALUES = appTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(appTypeArr$values);
        }

        public static AppType valueOf(String str) {
            return (AppType) Enum.valueOf(AppType.class, str);
        }

        public static AppType[] values() {
            return (AppType[]) $VALUES.clone();
        }
    }

    public static final class ActionBar extends ThreadLocal<CertificateFactory> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public CertificateFactory initialValue() throws CertificateException {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            Intrinsics.checkNotNullExpressionValue(certificateFactory, "");
            return certificateFactory;
        }
    }

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "");
        HEX_CHARS_UPPER = charArray;
        $stable = 8;
    }

    public static final class TaskDescription extends ThreadLocal<MessageDigest> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public MessageDigest initialValue() throws NoSuchAlgorithmException {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Intrinsics.checkNotNullExpressionValue(messageDigest, "");
            return messageDigest;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buildAppInfo(@NotNull PackageManager packageManager, @NotNull PackageInfo packageInfo, @NotNull Continuation<? super C47054tim> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AppsCollectionUtils appsCollectionUtils;
        PackageInfo packageInfo2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        AnonymousClass1 anonymousClass12 = anonymousClass1;
        Object objIconBase64$default = anonymousClass12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objIconBase64$default);
            String strPackageName = packageName(packageInfo);
            String strAppName = appName(packageManager, packageInfo);
            String strVersion = version(packageInfo);
            if (OKRiskPayloadManager.copydefault.zLjUOn()) {
                anonymousClass12.L$0 = this;
                anonymousClass12.L$1 = packageInfo;
                anonymousClass12.L$2 = strPackageName;
                anonymousClass12.L$3 = strAppName;
                anonymousClass12.L$4 = strVersion;
                anonymousClass12.label = 1;
                objIconBase64$default = iconBase64$default(this, packageManager, packageInfo, 0, anonymousClass12, 4, null);
                if (objIconBase64$default == objCopydefault) {
                    return objCopydefault;
                }
                appsCollectionUtils = this;
                packageInfo2 = packageInfo;
                str5 = strPackageName;
                str6 = strAppName;
                str7 = strVersion;
            } else {
                appsCollectionUtils = this;
                packageInfo2 = packageInfo;
                str = strPackageName;
                str2 = strAppName;
                str3 = strVersion;
                str4 = "";
                String strPermissions = appsCollectionUtils.permissions(packageInfo2);
                String strServices = appsCollectionUtils.services(packageInfo2);
                C47050tii c47050tiiSignatures = appsCollectionUtils.signatures(packageInfo2);
                long jFirstInstallTime = appsCollectionUtils.firstInstallTime(packageInfo2);
                long jLastUpdateTime = appsCollectionUtils.lastUpdateTime(packageInfo2);
                int iAppUid = appsCollectionUtils.appUid(packageInfo2);
                String strPath = appsCollectionUtils.path(packageInfo2);
                long size = appsCollectionUtils.size(packageInfo2);
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                return new C47054tim(str, str2, str3, str4, strPermissions, strServices, c47050tiiSignatures, jFirstInstallTime, jLastUpdateTime, iAppUid, strPath, "", size, appsCollectionUtils.listSoFilesFromApk(applicationInfo == null ? applicationInfo.sourceDir : null, new Function1() { // from class: o.til
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(AppsCollectionUtils.buildAppInfo$lambda$0((java.lang.String) obj));
                    }
                }), appsCollectionUtils.appType(packageInfo2));
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str7 = (String) anonymousClass12.L$4;
            str6 = (String) anonymousClass12.L$3;
            str5 = (String) anonymousClass12.L$2;
            packageInfo2 = (PackageInfo) anonymousClass12.L$1;
            appsCollectionUtils = (AppsCollectionUtils) anonymousClass12.L$0;
            C56391yDq.AEQbTJ(objIconBase64$default);
        }
        str4 = (String) objIconBase64$default;
        str3 = str7;
        str2 = str6;
        str = str5;
        String strPermissions2 = appsCollectionUtils.permissions(packageInfo2);
        String strServices2 = appsCollectionUtils.services(packageInfo2);
        C47050tii c47050tiiSignatures2 = appsCollectionUtils.signatures(packageInfo2);
        long jFirstInstallTime2 = appsCollectionUtils.firstInstallTime(packageInfo2);
        long jLastUpdateTime2 = appsCollectionUtils.lastUpdateTime(packageInfo2);
        int iAppUid2 = appsCollectionUtils.appUid(packageInfo2);
        String strPath2 = appsCollectionUtils.path(packageInfo2);
        long size2 = appsCollectionUtils.size(packageInfo2);
        ApplicationInfo applicationInfo2 = packageInfo2.applicationInfo;
        return new C47054tim(str, str2, str3, str4, strPermissions2, strServices2, c47050tiiSignatures2, jFirstInstallTime2, jLastUpdateTime2, iAppUid2, strPath2, "", size2, appsCollectionUtils.listSoFilesFromApk(applicationInfo2 == null ? applicationInfo2.sourceDir : null, new Function1() { // from class: o.til
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(AppsCollectionUtils.buildAppInfo$lambda$0((java.lang.String) obj));
            }
        }), appsCollectionUtils.appType(packageInfo2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buildAppInfo$lambda$0(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C59449zhJ.startsWith$default(str, "lib/", false, 2, null) && C59449zhJ.endsWith$default(str, ".so", false, 2, null);
    }

    public static /* synthetic */ Object getAppInfoAsJson$default(AppsCollectionUtils appsCollectionUtils, PackageManager packageManager, PackageInfo packageInfo, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return appsCollectionUtils.getAppInfoAsJson(packageManager, packageInfo, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAppInfoAsJson(@NotNull PackageManager packageManager, @NotNull PackageInfo packageInfo, boolean z, @NotNull Continuation<? super String> continuation) throws Throwable {
        C17451 c17451;
        if (continuation instanceof C17451) {
            c17451 = (C17451) continuation;
            int i = c17451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c17451.label = i - Integer.MIN_VALUE;
            } else {
                c17451 = new C17451(continuation);
            }
        }
        Object objBuildAppInfo = c17451.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c17451.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objBuildAppInfo);
            c17451.Z$0 = z;
            c17451.label = 1;
            objBuildAppInfo = buildAppInfo(packageManager, packageInfo, c17451);
            if (objBuildAppInfo == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = c17451.Z$0;
            C56391yDq.AEQbTJ(objBuildAppInfo);
        }
        C47054tim c47054tim = (C47054tim) objBuildAppInfo;
        return z ? c47054tim.AEQbTJ() : c47054tim.KWHzl();
    }

    public final String packageName(@NotNull PackageInfo packageInfo) {
        Intrinsics.checkNotNullParameter(packageInfo, "");
        return C33129mqd.gEmmrt(packageInfo.packageName);
    }

    public final String appName(@NotNull PackageManager packageManager, @NotNull PackageInfo packageInfo) {
        Intrinsics.checkNotNullParameter(packageManager, "");
        Intrinsics.checkNotNullParameter(packageInfo, "");
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        return C33129mqd.gEmmrt(applicationInfo != null ? applicationInfo.loadLabel(packageManager) : null);
    }

    public final String version(@NotNull PackageInfo packageInfo) {
        Intrinsics.checkNotNullParameter(packageInfo, "");
        return C33129mqd.gEmmrt(packageInfo.versionName);
    }

    /* JADX INFO: renamed from: com.okinc.okrisk.collection.apps.AppsCollectionUtils$icon$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Drawable>, Object> {
        final /* synthetic */ PackageInfo $packageInfo;
        final /* synthetic */ PackageManager $packageManager;
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PackageInfo packageInfo, PackageManager packageManager, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$packageInfo = packageInfo;
            this.$packageManager = packageManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$packageInfo, this.$packageManager, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Drawable> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                ApplicationInfo applicationInfo = this.$packageInfo.applicationInfo;
                if (applicationInfo == null) {
                    return null;
                }
                C33129mqd.gEmmrt(applicationInfo != null ? C56443yFo.AEQbTJ(applicationInfo.icon) : null);
                PackageManager packageManager = this.$packageManager;
                ApplicationInfo applicationInfo2 = this.$packageInfo.applicationInfo;
                Intrinsics.copydefault(applicationInfo2);
                return packageManager.getApplicationIcon(applicationInfo2);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final Object icon(@NotNull PackageManager packageManager, @NotNull PackageInfo packageInfo, @NotNull Continuation<? super Drawable> continuation) {
        return BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(packageInfo, packageManager, null), continuation);
    }

    public static /* synthetic */ Object iconBase64$default(AppsCollectionUtils appsCollectionUtils, PackageManager packageManager, PackageInfo packageInfo, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 64;
        }
        return appsCollectionUtils.iconBase64(packageManager, packageInfo, i, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object iconBase64(@NotNull PackageManager packageManager, @NotNull PackageInfo packageInfo, int i, @NotNull Continuation<? super String> continuation) throws Throwable {
        C17461 c17461;
        AppsCollectionUtils appsCollectionUtils;
        if (continuation instanceof C17461) {
            c17461 = (C17461) continuation;
            int i2 = c17461.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c17461.label = i2 - Integer.MIN_VALUE;
            } else {
                c17461 = new C17461(continuation);
            }
        }
        Object objIcon = c17461.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = c17461.label;
        try {
            if (i3 == 0) {
                C56391yDq.AEQbTJ(objIcon);
                c17461.L$0 = this;
                c17461.I$0 = i;
                c17461.label = 1;
                objIcon = icon(packageManager, packageInfo, c17461);
                if (objIcon == objCopydefault) {
                    return objCopydefault;
                }
                appsCollectionUtils = this;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = c17461.I$0;
                appsCollectionUtils = (AppsCollectionUtils) c17461.L$0;
                C56391yDq.AEQbTJ(objIcon);
            }
            final Drawable drawable = (Drawable) objIcon;
            OKRiskPayloadManager.copydefault.copydefault(new Function0() { // from class: o.tit
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AppsCollectionUtils.iconBase64$lambda$2(drawable);
                }
            });
            if (drawable == null) {
                return "";
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(appsCollectionUtils.drawableToBitmap(drawable), i, i, true);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateScaledBitmap, "");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
            return strEncodeToString;
        } catch (Exception e) {
            OKRiskPayloadManager.copydefault.copydefault(new Function0() { // from class: o.tiu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AppsCollectionUtils.iconBase64$lambda$1(e);
                }
            });
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String iconBase64$lambda$1(Exception exc) {
        return "icon64 " + exc.getMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String iconBase64$lambda$2(Drawable drawable) {
        return "icon64 " + drawable;
    }

    private final Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable.getBitmap();
                Intrinsics.copydefault(bitmap);
                return bitmap;
            }
        }
        Integer numValueOf = Integer.valueOf(drawable.getIntrinsicWidth());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 256;
        Integer numValueOf2 = Integer.valueOf(drawable.getIntrinsicHeight());
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, num != null ? num.intValue() : 256, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public final String permissions(@NotNull PackageInfo packageInfo) {
        Intrinsics.checkNotNullParameter(packageInfo, "");
        String[] strArr = packageInfo.requestedPermissions;
        return C33129mqd.gEmmrt(strArr != null ? yDV.AwvSrB(strArr) : null);
    }

    public final String services(@NotNull PackageInfo packageInfo) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(packageInfo, "");
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            arrayList = new ArrayList(serviceInfoArr.length);
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                arrayList.add(serviceInfo.name);
            }
        } else {
            arrayList = null;
        }
        return C33129mqd.gEmmrt(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: Exception -> 0x00b7, TryCatch #1 {Exception -> 0x00b7, blocks: (B:3:0x0007, B:5:0x000e, B:7:0x0014, B:9:0x001a, B:11:0x0020, B:17:0x0035, B:19:0x0043, B:21:0x0051, B:23:0x005f, B:25:0x0063, B:26:0x0066, B:28:0x0070, B:31:0x0077, B:12:0x0027, B:14:0x002b), top: B:42:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[Catch: Exception -> 0x00b7, TryCatch #1 {Exception -> 0x00b7, blocks: (B:3:0x0007, B:5:0x000e, B:7:0x0014, B:9:0x001a, B:11:0x0020, B:17:0x0035, B:19:0x0043, B:21:0x0051, B:23:0x005f, B:25:0x0063, B:26:0x0066, B:28:0x0070, B:31:0x0077, B:12:0x0027, B:14:0x002b), top: B:42:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C47050tii signatures(@NotNull PackageInfo packageInfo) {
        Signature signature;
        Certificate certificateGenerateCertificate;
        Signature[] apkContentsSigners;
        Intrinsics.checkNotNullParameter(packageInfo, "");
        try {
            if (Build.VERSION.SDK_INT >= 28 && packageInfo.signingInfo != null) {
                SigningInfo signingInfo = packageInfo.signingInfo;
                if (signingInfo != null && (apkContentsSigners = signingInfo.getApkContentsSigners()) != null) {
                    signature = (Signature) yDV.zsXlph(apkContentsSigners);
                }
                if (signature != null) {
                }
            } else {
                Signature[] signatureArr = packageInfo.signatures;
                signature = signatureArr != null ? (Signature) yDV.zsXlph(signatureArr) : null;
                if (signature != null) {
                    return new C47050tii(null, null, null, null, 15, null);
                }
                byte[] byteArray = signature.toByteArray();
                CertificateFactory certificateFactory = certFactoryThreadLocal.get();
                if (certificateFactory != null) {
                    Intrinsics.copydefault(byteArray);
                    certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(byteArray));
                } else {
                    certificateGenerateCertificate = null;
                }
                X509Certificate x509Certificate = certificateGenerateCertificate instanceof X509Certificate ? (X509Certificate) certificateGenerateCertificate : null;
                MessageDigest messageDigest = md5DigestThreadLocal.get();
                if (messageDigest != null) {
                    messageDigest.reset();
                }
                try {
                    if (x509Certificate != null && messageDigest != null) {
                        byte[] bArrDigest = messageDigest.digest(byteArray);
                        Intrinsics.copydefault(bArrDigest);
                        String lowerCase = bytesToHex(bArrDigest).toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        return new C47050tii(x509Certificate.getSubjectDN().getName(), x509Certificate.getSerialNumber().toString(), x509Certificate.getSigAlgName(), lowerCase);
                    }
                    return new C47050tii(null, null, null, null, 15, null);
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        return new C47050tii(null, null, null, null, 15, null);
    }

    private final String bytesToHex(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = HEX_CHARS_UPPER;
            cArr[i2] = cArr2[(b & UnsignedBytes.MAX_VALUE) >>> 4];
            cArr[i2 + 1] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }

    public final long firstInstallTime(@NotNull PackageInfo packageInfo) {
        Intrinsics.checkNotNullParameter(packageInfo, "");
        return packageInfo.firstInstallTime;
    }

    public final long lastUpdateTime(@NotNull PackageInfo packageInfo) {
        Intrinsics.checkNotNullParameter(packageInfo, "");
        return packageInfo.lastUpdateTime;
    }

    public final int appUid(@NotNull PackageInfo packageInfo) {
        Intrinsics.checkNotNullParameter(packageInfo, "");
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo != null) {
            return applicationInfo.uid;
        }
        return 0;
    }

    public final String path(@NotNull PackageInfo packageInfo) {
        Intrinsics.checkNotNullParameter(packageInfo, "");
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        return C33129mqd.gEmmrt(applicationInfo != null ? applicationInfo.sourceDir : null);
    }

    public final String appType(@NotNull PackageInfo packageInfo) {
        Intrinsics.checkNotNullParameter(packageInfo, "");
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo == null) {
            return "thirdparty";
        }
        int i = applicationInfo.flags;
        return (((i & 1) != 0) || ((i & 128) != 0)) ? "system" : "user";
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final String md5(@NotNull PackageInfo packageInfo) {
        String str;
        Intrinsics.checkNotNullParameter(packageInfo, "");
        try {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            str = applicationInfo != null ? applicationInfo.sourceDir : null;
        } catch (Exception unused) {
        }
        if (str != null && str.length() != 0) {
            File file = new File(str);
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i > 0) {
                        messageDigest.update(bArr, 0, i);
                    } else {
                        Unit unit = Unit.INSTANCE;
                        yFA.copydefault(fileInputStream, null);
                        byte[] bArrDigest = messageDigest.digest();
                        Intrinsics.copydefault(bArrDigest);
                        return yDV.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: o.tiq
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return AppsCollectionUtils.md5$lambda$8(((java.lang.Byte) obj).byteValue());
                            }
                        }, 30, (Object) null);
                    }
                }
            } finally {
            }
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence md5$lambda$8(byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final long size(@NotNull PackageInfo packageInfo) {
        Intrinsics.checkNotNullParameter(packageInfo, "");
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String str = applicationInfo != null ? applicationInfo.sourceDir : null;
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return new File(str).length();
    }

    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final List<String> listSoFilesFromApk(String str, @NotNull Function1<? super String, Boolean> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (str == null) {
            return yDY.AhwBna();
        }
        ZipFile zipFile = new ZipFile(str);
        try {
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            Intrinsics.checkNotNullExpressionValue(enumerationEntries, "");
            List<String> listZuBGHE = C59467zhb.zuBGHE(C59467zhb.DbNXlk(C59467zhb.fetchVPNInfo(C59405zgS.AEQbTJ(yDX.AEQbTJ(enumerationEntries)), new Function1() { // from class: o.tir
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return ((ZipEntry) obj).getName();
                }
            }), function1));
            yFA.copydefault(zipFile, null);
            return listZuBGHE;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                yFA.copydefault(zipFile, th);
                throw th2;
            }
        }
    }
}
