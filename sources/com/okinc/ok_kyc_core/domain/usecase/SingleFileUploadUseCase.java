package com.okinc.ok_kyc_core.domain.usecase;

import android.content.Context;
import android.text.TextUtils;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.common.net.HttpHeaders;
import com.google.gson.reflect.TypeToken;
import com.okinc.biz.util.UploadUtils;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import com.okinc.network.okg.response.BaseResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.CardSyncResponse;
import com.okinc.ok_kyc_core.data.remote.networkmodel.OssUploadResp;
import com.okinc.ok_kyc_core.data.remote.networkmodel.SingleFileUploadResultReq;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC43728ruk;
import o.AbstractC58185ywX;
import o.C42459rTq;
import o.C43292rmY;
import o.C43662rtX;
import o.C56391yDq;
import o.C56442yFn;
import o.C56444yFp;
import o.C6813aWU;
import o.C6848aXC;
import o.InterfaceC41969rBm;
import o.InterfaceC56445yFq;
import o.pUU;
import o.rBI;
import o.rTQ;
import o.xVW;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleFileUploadUseCase implements rBI {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final CoroutineScope AEQbTJ;
    public final InterfaceC41969rBm KWHzl;
    public final Set<Integer> OLrzqt;

    public static final class Application extends TypeToken<BaseResp<OssUploadResp>> {
    }

    public SingleFileUploadUseCase(@NotNull InterfaceC41969rBm interfaceC41969rBm) {
        Intrinsics.checkNotNullParameter(interfaceC41969rBm, "");
        this.KWHzl = interfaceC41969rBm;
        this.AEQbTJ = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        this.OLrzqt = yEE.AhwBna(Integer.valueOf(MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_ON_PUSH), 3511, 3519, 3589, 3510, 3910);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FileType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ FileType[] $VALUES;
        private final int intValue;
        public static final FileType IMAGE = new FileType("IMAGE", 0, 0);
        public static final FileType PDF = new FileType("PDF", 1, 1);
        public static final FileType FILE_NOT_SUPPORTED = new FileType("FILE_NOT_SUPPORTED", 2, 999);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ FileType[] $values() {
            return new FileType[]{IMAGE, PDF, FILE_NOT_SUPPORTED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<FileType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getIntValue() {
            return this.intValue;
        }

        private FileType(String str, int i, int i2) {
            this.intValue = i2;
        }

        static {
            FileType[] fileTypeArr$values = $values();
            $VALUES = fileTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(fileTypeArr$values);
        }

        public static FileType valueOf(String str) {
            return (FileType) Enum.valueOf(FileType.class, str);
        }

        public static FileType[] values() {
            return (FileType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class UploadResult {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ UploadResult[] $VALUES;
        public static final UploadResult SUCCESS = new UploadResult("SUCCESS", 0);
        public static final UploadResult FAILED = new UploadResult(CardSyncResponse.FAILED, 1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ UploadResult[] $values() {
            return new UploadResult[]{SUCCESS, FAILED};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<UploadResult> getEntries() {
            return $ENTRIES;
        }

        private UploadResult(String str, int i) {
        }

        static {
            UploadResult[] uploadResultArr$values = $values();
            $VALUES = uploadResultArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(uploadResultArr$values);
        }

        public static UploadResult valueOf(String str) {
            return (UploadResult) Enum.valueOf(UploadResult.class, str);
        }

        public static UploadResult[] values() {
            return (UploadResult[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: classes16.dex */
    @Serializable
    public static final class UploadedFile {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String height;
        private final long imageId;
        private final String imageName;
        private final String imagePath;
        private final int imageType;
        private final String width;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component1() {
            return this.imageId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.imageName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component3() {
            return this.imageType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.imagePath;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.width;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.height;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UploadedFile copy(long j, @NotNull String str, int i, @NotNull String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new UploadedFile(j, str, i, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UploadedFile)) {
                return false;
            }
            UploadedFile uploadedFile = (UploadedFile) obj;
            return this.imageId == uploadedFile.imageId && Intrinsics.EZpvd((Object) this.imageName, (Object) uploadedFile.imageName) && this.imageType == uploadedFile.imageType && Intrinsics.EZpvd((Object) this.imagePath, (Object) uploadedFile.imagePath) && Intrinsics.EZpvd((Object) this.width, (Object) uploadedFile.width) && Intrinsics.EZpvd((Object) this.height, (Object) uploadedFile.height);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getHeight() {
            return this.height;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getImageId() {
            return this.imageId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getImageName() {
            return this.imageName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getImagePath() {
            return this.imagePath;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getImageType() {
            return this.imageType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getWidth() {
            return this.width;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.imageId);
            int iHashCode2 = this.imageName.hashCode();
            int iHashCode3 = Integer.hashCode(this.imageType);
            int iHashCode4 = this.imagePath.hashCode();
            String str = this.width;
            int iHashCode5 = str == null ? 0 : str.hashCode();
            String str2 = this.height;
            return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UploadedFile(imageId=" + this.imageId + ", imageName=" + this.imageName + ", imageType=" + this.imageType + ", imagePath=" + this.imagePath + ", width=" + this.width + ", height=" + this.height + ")";
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase.UploadedFile.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<UploadedFile> serializer() {
                return SingleFileUploadUseCase$UploadedFile$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ UploadedFile(int i, long j, String str, int i2, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                PluginExceptionsKt.throwMissingFieldException(i, 15, SingleFileUploadUseCase$UploadedFile$$serializer.INSTANCE.getDescriptor());
            }
            this.imageId = j;
            this.imageName = str;
            this.imageType = i2;
            this.imagePath = str2;
            if ((i & 16) == 0) {
                this.width = null;
            } else {
                this.width = str3;
            }
            if ((i & 32) == 0) {
                this.height = null;
            } else {
                this.height = str4;
            }
        }

        public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(UploadedFile uploadedFile, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, uploadedFile.imageId);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, uploadedFile.imageName);
            compositeEncoder.encodeIntElement(serialDescriptor, 2, uploadedFile.imageType);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, uploadedFile.imagePath);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || uploadedFile.width != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, uploadedFile.width);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && uploadedFile.height == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, uploadedFile.height);
        }

        public UploadedFile(long j, @NotNull String str, int i, @NotNull String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.imageId = j;
            this.imageName = str;
            this.imageType = i;
            this.imagePath = str2;
            this.width = str3;
            this.height = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (r11v0 long)
  (r13v0 java.lang.String)
  (r14v0 int)
  (r15v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
 A[MD:(long, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:81) call: com.okinc.ok_kyc_core.domain.usecase.SingleFileUploadUseCase.UploadedFile.<init>(long, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ UploadedFile(long j, String str, int i, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, str, i, str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:100:0x02db */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:114:0x01ce */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:128:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:52:0x019e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x022c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:92:0x02b2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:94:0x02b4 */
    /* JADX DEBUG: Type inference failed for r5v13. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r5v15. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r37v5 */
    /* JADX WARN: Type inference failed for: r37v6 */
    /* JADX WARN: Type inference failed for: r37v8 */
    /* JADX WARN: Type inference failed for: r37v9 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // o.rBI
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AEQbTJ(@NotNull Context context, @NotNull File file, byte[] bArr, @NotNull String str, int i, @NotNull FileType fileType, boolean z, @NotNull Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Pair<UploadedFile, String>> continuation) throws Throwable {
        SingleFileUploadUseCase$invoke$1 singleFileUploadUseCase$invoke$1;
        ?? r7;
        String str2;
        String str3;
        String name;
        String str4;
        String str5;
        Context context2;
        String str6;
        long j;
        String str7;
        ?? r72;
        int i2;
        String str8;
        long j2;
        ?? r37;
        Context context3;
        String str9;
        ?? r73;
        int i3 = i;
        if (continuation instanceof SingleFileUploadUseCase$invoke$1) {
            singleFileUploadUseCase$invoke$1 = (SingleFileUploadUseCase$invoke$1) continuation;
            int i4 = singleFileUploadUseCase$invoke$1.label;
            r7 = -2147483648;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                singleFileUploadUseCase$invoke$1.label = i4 - Integer.MIN_VALUE;
            } else {
                singleFileUploadUseCase$invoke$1 = new SingleFileUploadUseCase$invoke$1(this, continuation);
            }
        }
        SingleFileUploadUseCase$invoke$1 singleFileUploadUseCase$invoke$12 = singleFileUploadUseCase$invoke$1;
        Object objKWHzl = singleFileUploadUseCase$invoke$12.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i5 = singleFileUploadUseCase$invoke$12.label;
        ?? r11 = 2;
        try {
            try {
                try {
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                r7 = "";
                str2 = "FileUpload";
            }
        } catch (Throwable th3) {
            th = th3;
        }
        if (i5 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            file.getPath();
            name = file.getName();
            pUU.KWHzl("FileUpload", "get Auth");
            pUU.KWHzl("FileUpload", "startUploadFileByApi");
            String strAEQbTJ = C6813aWU.AEQbTJ("/v3/users/kyc/support/images");
            HashMap map = new HashMap();
            map.put(HttpHeaders.REFERER, C43292rmY.OLrzqt.fJNWhG());
            String strKWHzl = rTQ.OLrzqt.KWHzl();
            if (strKWHzl == null || strKWHzl.length() == 0) {
                pUU.KWHzl("FileUpload", "startUploadFileByApi token is null or empty");
            } else {
                map.put("Authorization", strKWHzl);
            }
            map.put("x-utc", C6848aXC.EZpvd.EZpvd());
            if (!TextUtils.isEmpty(xVW.copydefault())) {
                map.put("devId", xVW.copydefault());
            }
            HashMap map2 = new HashMap();
            map2.put("imageFile", bArr != null ? bArr : file);
            map2.put("imageType", String.valueOf(i));
            try {
                AbstractC58185ywX abstractC58185ywXUploadFile$default = UploadUtils.uploadFile$default(UploadUtils.OLrzqt, strAEQbTJ, map2, new Application(), map, null, 16, null);
                Intrinsics.copydefault(abstractC58185ywXUploadFile$default);
                BaseResp baseResp = (BaseResp) abstractC58185ywXUploadFile$default.AEQbTJ();
                if (baseResp.isSucceedAndDataValid()) {
                    try {
                        try {
                            long imageId = ((OssUploadResp) baseResp.data).getImageId();
                            String imagePath = ((OssUploadResp) baseResp.data).getImagePath();
                            pUU.KWHzl("FileUpload", "startUploadFileByApi success " + baseResp.data);
                            pUU.KWHzl("FileUpload", "send callback");
                            pUU.KWHzl("FileUpload", "should call OCR: " + z);
                            if (z) {
                                try {
                                    InterfaceC41969rBm interfaceC41969rBm = this.KWHzl;
                                    Intrinsics.copydefault((Object) name);
                                    str5 = "";
                                    str3 = "FileUpload";
                                    try {
                                        SingleFileUploadResultReq singleFileUploadResultReq = new SingleFileUploadResultReq(imageId, i, name, fileType.getIntValue());
                                        singleFileUploadUseCase$invoke$12.L$0 = context;
                                        singleFileUploadUseCase$invoke$12.L$1 = name;
                                        singleFileUploadUseCase$invoke$12.L$2 = imagePath;
                                        singleFileUploadUseCase$invoke$12.I$0 = i3;
                                        singleFileUploadUseCase$invoke$12.J$0 = imageId;
                                        singleFileUploadUseCase$invoke$12.label = 1;
                                        objKWHzl = interfaceC41969rBm.KWHzl(singleFileUploadResultReq, singleFileUploadUseCase$invoke$12);
                                        if (objKWHzl == objCopydefault) {
                                            return objCopydefault;
                                        }
                                        context2 = context;
                                        str6 = imagePath;
                                        j = imageId;
                                        str7 = name;
                                        AbstractC43728ruk abstractC43728ruk = (AbstractC43728ruk) objKWHzl;
                                        String string = context2.getString(C43662rtX.Dialog.fZBcTu);
                                        String str10 = str5;
                                        Intrinsics.checkNotNullExpressionValue(string, str10);
                                        abstractC43728ruk.KWHzl(string);
                                        name = str7;
                                        r73 = str10;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        r11 = str5;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    r11 = "";
                                    str3 = "FileUpload";
                                }
                            } else {
                                r11 = "";
                                str3 = "FileUpload";
                                try {
                                    if (!C42459rTq.KWHzl.KWHzl()) {
                                        InterfaceC41969rBm interfaceC41969rBm2 = this.KWHzl;
                                        Intrinsics.copydefault((Object) name);
                                        r37 = r11;
                                        try {
                                            SingleFileUploadResultReq singleFileUploadResultReq2 = new SingleFileUploadResultReq(imageId, i, name, fileType.getIntValue());
                                            singleFileUploadUseCase$invoke$12.L$0 = context;
                                            singleFileUploadUseCase$invoke$12.L$1 = name;
                                            singleFileUploadUseCase$invoke$12.L$2 = imagePath;
                                            singleFileUploadUseCase$invoke$12.I$0 = i3;
                                            singleFileUploadUseCase$invoke$12.J$0 = imageId;
                                            singleFileUploadUseCase$invoke$12.label = 2;
                                            objKWHzl = interfaceC41969rBm2.AEQbTJ(singleFileUploadResultReq2, singleFileUploadUseCase$invoke$12);
                                            if (objKWHzl == objCopydefault) {
                                                return objCopydefault;
                                            }
                                            context3 = context;
                                            str6 = imagePath;
                                            j = imageId;
                                            str9 = name;
                                            r37 = r37;
                                            AbstractC43728ruk abstractC43728ruk2 = (AbstractC43728ruk) objKWHzl;
                                            String string2 = context3.getString(C43662rtX.Dialog.fZBcTu);
                                            ?? r74 = r37;
                                            Intrinsics.checkNotNullExpressionValue(string2, r74);
                                            abstractC43728ruk2.KWHzl(string2);
                                            name = str9;
                                            r73 = r74;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            r7 = r37;
                                        }
                                    } else {
                                        r72 = r11;
                                        i2 = i3;
                                        str8 = imagePath;
                                        j2 = imageId;
                                        String str11 = name;
                                        Intrinsics.copydefault((Object) str11);
                                        return new Pair(new UploadedFile(j2, str11, i2, str8, (String) null, (String) null, 48, (DefaultConstructorMarker) null), r72);
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            r7 = "";
                            str3 = "FileUpload";
                        }
                    } catch (Exception e) {
                        e = e;
                        r7 = "";
                        str4 = "FileUpload";
                    }
                    r7 = r11;
                    str2 = str3;
                    String message = th.getMessage();
                    ?? r13 = message == null ? r7 : message;
                    pUU.copydefault(str2, "failedMessage = " + r13);
                    return new Pair(null, r13);
                }
                r7 = "";
                str4 = "FileUpload";
                try {
                    EventData eventData = new EventData();
                    eventData.setAct("event_kyc_upload_image_error");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("msg", baseResp.msg);
                    linkedHashMap.put("source", "china_id");
                    eventData.setAttrs(linkedHashMap);
                    eventData.setMsg("Android_upload_china_id_" + baseResp.msg);
                    ReportManager.AEQbTJ.EZpvd(eventData);
                    str2 = str4;
                    try {
                        try {
                            pUU.KWHzl(str2, "startUploadFileByApi fail data=" + baseResp.data + " code=" + baseResp.code + " msg=" + baseResp.msg);
                            throw new Exception(context.getString(C43662rtX.Dialog.fZBcTu));
                        } catch (Throwable th9) {
                            th = th9;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        pUU.KWHzl(str2, "startUploadFileByApi error=" + e);
                        throw new Exception(context.getString(C43662rtX.Dialog.fZBcTu));
                    }
                } catch (Exception e3) {
                    e = e3;
                    str2 = str4;
                }
                str2 = str4;
            } catch (Exception e4) {
                e = e4;
                r7 = "";
                str2 = "FileUpload";
            }
            pUU.KWHzl(str2, "startUploadFileByApi error=" + e);
            throw new Exception(context.getString(C43662rtX.Dialog.fZBcTu));
        } else if (i5 == 1) {
            j = singleFileUploadUseCase$invoke$12.J$0;
            i3 = singleFileUploadUseCase$invoke$12.I$0;
            str6 = (String) singleFileUploadUseCase$invoke$12.L$2;
            str7 = (String) singleFileUploadUseCase$invoke$12.L$1;
            context2 = (Context) singleFileUploadUseCase$invoke$12.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            str5 = "";
            str3 = "FileUpload";
            AbstractC43728ruk abstractC43728ruk3 = (AbstractC43728ruk) objKWHzl;
            String string3 = context2.getString(C43662rtX.Dialog.fZBcTu);
            String str102 = str5;
            Intrinsics.checkNotNullExpressionValue(string3, str102);
            abstractC43728ruk3.KWHzl(string3);
            name = str7;
            r73 = str102;
        } else {
            if (i5 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = singleFileUploadUseCase$invoke$12.J$0;
            i3 = singleFileUploadUseCase$invoke$12.I$0;
            str6 = (String) singleFileUploadUseCase$invoke$12.L$2;
            str9 = (String) singleFileUploadUseCase$invoke$12.L$1;
            context3 = (Context) singleFileUploadUseCase$invoke$12.L$0;
            C56391yDq.AEQbTJ(objKWHzl);
            r37 = "";
            str3 = "FileUpload";
            AbstractC43728ruk abstractC43728ruk22 = (AbstractC43728ruk) objKWHzl;
            String string22 = context3.getString(C43662rtX.Dialog.fZBcTu);
            ?? r742 = r37;
            Intrinsics.checkNotNullExpressionValue(string22, r742);
            abstractC43728ruk22.KWHzl(string22);
            name = str9;
            r73 = r742;
        }
        i2 = i3;
        j2 = j;
        str8 = str6;
        r72 = r73;
        String str112 = name;
        Intrinsics.copydefault((Object) str112);
        return new Pair(new UploadedFile(j2, str112, i2, str8, (String) null, (String) null, 48, (DefaultConstructorMarker) null), r72);
    }
}
