package com.okinc.planet.domain.usecase;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.firebase.messaging.Constants;
import com.okinc.planet.domain.remote.dto.ImageItem;
import com.okinc.planet.domain.remote.dto.PublishImageUplaodResp;
import com.okinc.planet.domain.usecase.SingleFileUploadUseCase;
import java.io.File;
import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC43419rot;
import o.AbstractC58185ywX;
import o.C33129mqd;
import o.C46436tUg;
import o.C46437tUh;
import o.C48948ufM;
import o.C56390yDp;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.pUU;
import o.tQV;
import o.tQZ;
import o.tTQ;
import o.yDV;
import o.yFA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SingleFileUploadUseCase implements tQZ {
    public final Mutex OLrzqt;
    public final tQV copydefault;

    public SingleFileUploadUseCase(@NotNull tQV tqv) {
        Intrinsics.checkNotNullParameter(tqv, "");
        this.copydefault = tqv;
        this.OLrzqt = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX INFO: loaded from: classes16.dex */
    @Serializable
    public static final class UploadedFile {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        private final String fileSize;
        private final String height;
        private final String imagePath;
        private final String width;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ UploadedFile copy$default(UploadedFile uploadedFile, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uploadedFile.imagePath;
            }
            if ((i & 2) != 0) {
                str2 = uploadedFile.width;
            }
            if ((i & 4) != 0) {
                str3 = uploadedFile.height;
            }
            if ((i & 8) != 0) {
                str4 = uploadedFile.fileSize;
            }
            return uploadedFile.copy(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.imagePath;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.width;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.height;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.fileSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UploadedFile copy(@NotNull String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            return new UploadedFile(str, str2, str3, str4);
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
            return Intrinsics.EZpvd((Object) this.imagePath, (Object) uploadedFile.imagePath) && Intrinsics.EZpvd((Object) this.width, (Object) uploadedFile.width) && Intrinsics.EZpvd((Object) this.height, (Object) uploadedFile.height) && Intrinsics.EZpvd((Object) this.fileSize, (Object) uploadedFile.fileSize);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getFileSize() {
            return this.fileSize;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getHeight() {
            return this.height;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getImagePath() {
            return this.imagePath;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getWidth() {
            return this.width;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.imagePath.hashCode();
            String str = this.width;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.height;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.fileSize;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UploadedFile(imagePath=" + this.imagePath + ", width=" + this.width + ", height=" + this.height + ", fileSize=" + this.fileSize + ")";
        }

        /* JADX INFO: loaded from: classes19.dex */
        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.domain.usecase.SingleFileUploadUseCase.UploadedFile.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<UploadedFile> serializer() {
                return SingleFileUploadUseCase$UploadedFile$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ UploadedFile(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, SingleFileUploadUseCase$UploadedFile$$serializer.INSTANCE.getDescriptor());
            }
            this.imagePath = str;
            if ((i & 2) == 0) {
                this.width = null;
            } else {
                this.width = str2;
            }
            if ((i & 4) == 0) {
                this.height = null;
            } else {
                this.height = str3;
            }
            if ((i & 8) == 0) {
                this.fileSize = null;
            } else {
                this.fileSize = str4;
            }
        }

        public static final /* synthetic */ void write$Self$OKPlanet_ok_feature_planet_impl(UploadedFile uploadedFile, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, uploadedFile.imagePath);
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || uploadedFile.width != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, uploadedFile.width);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || uploadedFile.height != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, uploadedFile.height);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && uploadedFile.fileSize == null) {
                return;
            }
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, uploadedFile.fileSize);
        }

        public UploadedFile(@NotNull String str, String str2, String str3, String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            this.imagePath = str;
            this.width = str2;
            this.height = str3;
            this.fileSize = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:51) call: com.okinc.planet.domain.usecase.SingleFileUploadUseCase.UploadedFile.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ UploadedFile(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:172:0x05b6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:177:0x05c5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:188:0x05db */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:228:0x0030 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:55:0x01e6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x025d */
    /* JADX DEBUG: Type inference failed for r2v55. Raw type applied. Possible types: T */
    /* JADX DEBUG: Type inference failed for r4v4. Raw type applied. Possible types: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x037a A[Catch: all -> 0x05c7, TryCatch #16 {all -> 0x05c7, blocks: (B:108:0x036a, B:110:0x037a, B:112:0x0386, B:114:0x038d, B:118:0x03dd, B:115:0x03aa, B:117:0x03b2), top: B:239:0x036a }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03aa A[Catch: all -> 0x05c7, TryCatch #16 {all -> 0x05c7, blocks: (B:108:0x036a, B:110:0x037a, B:112:0x0386, B:114:0x038d, B:118:0x03dd, B:115:0x03aa, B:117:0x03b2), top: B:239:0x036a }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03fd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0618 A[Catch: all -> 0x061f, PHI: r0 r1
  0x0618: PHI (r0v17 java.lang.Object) = (r0v15 java.lang.Object), (r0v106 java.lang.Object) binds: [B:205:0x0616, B:153:0x0551] A[DONT_GENERATE, DONT_INLINE]
  0x0618: PHI (r1v10 java.io.File) = (r1v8 java.io.File), (r1v33 java.io.File) binds: [B:205:0x0616, B:153:0x0551] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #23 {all -> 0x061f, blocks: (B:152:0x054b, B:206:0x0618, B:204:0x0610), top: B:228:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ac A[Catch: all -> 0x05de, TRY_LEAVE, TryCatch #22 {all -> 0x05de, blocks: (B:47:0x01a6, B:49:0x01ac, B:59:0x01ef, B:61:0x01f9, B:63:0x0208, B:89:0x02c7, B:91:0x02d1, B:98:0x0310, B:100:0x0325), top: B:250:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0271 A[Catch: all -> 0x02bc, TRY_LEAVE, TryCatch #12 {all -> 0x02bc, blocks: (B:74:0x0267, B:76:0x0271, B:83:0x02b6, B:84:0x02bb), top: B:232:0x0267 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02b6 A[Catch: all -> 0x02bc, TRY_ENTER, TryCatch #12 {all -> 0x02bc, blocks: (B:74:0x0267, B:76:0x0271, B:83:0x02b6, B:84:0x02bb), top: B:232:0x0267 }] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r0v30, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v20, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r15v12, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r26v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.Continuation<? super kotlin.Pair<com.okinc.planet.domain.usecase.SingleFileUploadUseCase$UploadedFile, java.lang.String>>] */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v19 */
    /* JADX WARN: Type inference failed for: r26v20 */
    /* JADX WARN: Type inference failed for: r26v21 */
    /* JADX WARN: Type inference failed for: r26v24 */
    /* JADX WARN: Type inference failed for: r26v25 */
    /* JADX WARN: Type inference failed for: r26v26 */
    /* JADX WARN: Type inference failed for: r26v28 */
    /* JADX WARN: Type inference failed for: r26v29 */
    /* JADX WARN: Type inference failed for: r26v30 */
    /* JADX WARN: Type inference failed for: r26v31 */
    /* JADX WARN: Type inference failed for: r26v32 */
    /* JADX WARN: Type inference failed for: r26v33 */
    /* JADX WARN: Type inference failed for: r26v34 */
    /* JADX WARN: Type inference failed for: r26v35 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r2v23, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v60, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v35, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v48, types: [kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v69 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v21, types: [o.tUg] */
    /* JADX WARN: Type inference failed for: r7v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
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
    @Override // o.tQZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object AEQbTJ(@NotNull Context context, @NotNull ImageItem imageItem, byte[] bArr, Bitmap bitmap, @NotNull Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Pair<UploadedFile, String>> continuation) throws Throwable {
        SingleFileUploadUseCase$invoke$1 singleFileUploadUseCase$invoke$1;
        ?? r5;
        Object obj;
        ?? OLrzqt;
        File file;
        Context context2;
        ImageItem imageItem2;
        byte[] bArr2;
        Bitmap bitmap2;
        int i;
        Object obj2;
        SingleFileUploadUseCase singleFileUploadUseCase;
        Ref.ObjectRef objectRef;
        String str;
        String str2;
        SingleFileUploadUseCase singleFileUploadUseCase2;
        Object obj3;
        Object obj4;
        Ref.ObjectRef objectRef2;
        ImageItem imageItem3;
        Object obj5;
        Object obj6;
        Context context3;
        ImageItem imageItem4;
        Object obj7;
        Ref.ObjectRef objectRef3;
        ?? r12;
        SingleFileUploadUseCase singleFileUploadUseCase3;
        ImageItem imageItem5;
        SingleFileUploadUseCase singleFileUploadUseCase4;
        Object obj8;
        Object obj9;
        Pair pairOLrzqt;
        Object obj10;
        ?? r52;
        Object obj11;
        ?? r53;
        Object obj12;
        ?? r54;
        Object obj13;
        ?? r55;
        ?? r26;
        ?? r56;
        String str3;
        SingleFileUploadUseCase singleFileUploadUseCase5;
        Ref.ObjectRef objectRef4;
        ?? r262;
        Object obj14;
        ?? r57;
        ?? r263;
        PublishImageUplaodResp publishImageUplaodResp;
        String presignUrl;
        ?? r2 = "  imageUrl=";
        if (continuation instanceof SingleFileUploadUseCase$invoke$1) {
            singleFileUploadUseCase$invoke$1 = (SingleFileUploadUseCase$invoke$1) continuation;
            int i2 = singleFileUploadUseCase$invoke$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                singleFileUploadUseCase$invoke$1.label = i2 - Integer.MIN_VALUE;
            } else {
                singleFileUploadUseCase$invoke$1 = new SingleFileUploadUseCase$invoke$1(this, continuation);
            }
        }
        Object pair = singleFileUploadUseCase$invoke$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        ?? r58 = singleFileUploadUseCase$invoke$1.label;
        try {
            try {
                try {
                    try {
                    } catch (Throwable th) {
                        th = th;
                        r2 = "";
                        r5 = r58;
                        obj = imageItem5;
                        try {
                            r5.unlock(null);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            OLrzqt = obj;
                            try {
                                String message = th.getMessage();
                                if (message == null) {
                                }
                                pUU.copydefault("FileUpload", "failedMessage = " + );
                                pair = new Pair(null, );
                                file = (File) OLrzqt.getFirst();
                                if (file != null) {
                                }
                                return pair;
                            } catch (Throwable th3) {
                                try {
                                    File file2 = (File) OLrzqt.getFirst();
                                    if (file2 != null) {
                                        C56443yFo.KWHzl(file2.delete());
                                    }
                                } catch (Throwable unused) {
                                }
                                throw th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                r2 = continuation;
                r5 = r58;
                obj = imageItem5;
                r5.unlock(null);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            r2 = "";
        }
        switch (r58) {
            case 0:
                C56391yDq.AEQbTJ(pair);
                Pair pair2 = new Pair(null, null);
                int iOLrzqt = C46437tUh.OLrzqt.OLrzqt();
                pUU.KWHzl("PlanetUpload", "image max size=" + iOLrzqt);
                Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
                Mutex mutex = this.OLrzqt;
                singleFileUploadUseCase$invoke$1.L$0 = this;
                context2 = context;
                singleFileUploadUseCase$invoke$1.L$1 = context2;
                imageItem2 = imageItem;
                singleFileUploadUseCase$invoke$1.L$2 = imageItem2;
                bArr2 = bArr;
                singleFileUploadUseCase$invoke$1.L$3 = bArr2;
                singleFileUploadUseCase$invoke$1.L$4 = bitmap;
                singleFileUploadUseCase$invoke$1.L$5 = pair2;
                singleFileUploadUseCase$invoke$1.L$6 = objectRef5;
                singleFileUploadUseCase$invoke$1.L$7 = mutex;
                singleFileUploadUseCase$invoke$1.I$0 = iOLrzqt;
                singleFileUploadUseCase$invoke$1.label = 1;
                if (mutex.lock(null, singleFileUploadUseCase$invoke$1) == objCopydefault) {
                    return objCopydefault;
                }
                bitmap2 = bitmap;
                i = iOLrzqt;
                obj2 = "";
                singleFileUploadUseCase = this;
                obj = pair2;
                r5 = mutex;
                objectRef = objectRef5;
                try {
                    if (imageItem2.getLocalUri() == null) {
                        tTQ ttq = tTQ.OLrzqt;
                        objectRef.element = ttq.OLrzqt(context2, imageItem2.getLocalUri());
                        Uri localUri = imageItem2.getLocalUri();
                        singleFileUploadUseCase$invoke$1.L$0 = singleFileUploadUseCase;
                        singleFileUploadUseCase$invoke$1.L$1 = imageItem2;
                        singleFileUploadUseCase$invoke$1.L$2 = obj;
                        singleFileUploadUseCase$invoke$1.L$3 = objectRef;
                        singleFileUploadUseCase$invoke$1.L$4 = r5;
                        str = "  imageUrl=";
                        singleFileUploadUseCase$invoke$1.L$5 = null;
                        singleFileUploadUseCase$invoke$1.L$6 = null;
                        singleFileUploadUseCase$invoke$1.L$7 = null;
                        singleFileUploadUseCase$invoke$1.label = 2;
                        pair = ttq.OLrzqt(context2, localUri, i, singleFileUploadUseCase$invoke$1);
                        if (pair == objCopydefault) {
                            return objCopydefault;
                        }
                        imageItem5 = imageItem2;
                        singleFileUploadUseCase4 = singleFileUploadUseCase;
                        Ref.ObjectRef objectRef6 = objectRef;
                        obj8 = obj;
                        objectRef2 = objectRef6;
                        r5 = r5;
                        obj9 = obj2;
                        try {
                            pairOLrzqt = (Pair) pair;
                            str2 = "PlanetUpload";
                            r53 = r5;
                            r262 = obj9;
                            OLrzqt = pairOLrzqt;
                            singleFileUploadUseCase = singleFileUploadUseCase4;
                            obj5 = null;
                            ImageItem imageItem6 = imageItem5;
                            obj4 = obj8;
                            imageItem3 = imageItem6;
                            r56 = r53;
                            r26 = r262;
                            try {
                                r56.unlock(obj5);
                                try {
                                    pUU.KWHzl("FileUpload", "get Auth");
                                    pUU.KWHzl("FileUpload", "startUploadFileByApi");
                                    if (OLrzqt.getSecond() == null) {
                                        String id = imageItem3.getId();
                                        byte[] bArr3 = (byte[]) OLrzqt.getSecond();
                                        Integer numAEQbTJ = bArr3 != null ? C56443yFo.AEQbTJ(bArr3.length) : null;
                                        str3 = str2;
                                        pUU.KWHzl(str3, "id=" + id + " useBytes size=" + numAEQbTJ);
                                    } else {
                                        str3 = str2;
                                        if (OLrzqt.getFirst() != null) {
                                            String id2 = imageItem3.getId();
                                            Object first = OLrzqt.getFirst();
                                            Intrinsics.copydefault(first);
                                            pUU.KWHzl(str3, "id=" + id2 + " useFile filepath=" + ((File) first).getPath());
                                        } else {
                                            r2 = r26;
                                            try {
                                                pUU.KWHzl("FileUpload", "image error");
                                                throw new Exception(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                                            } catch (Throwable th7) {
                                                th = th7;
                                                String message2 = th.getMessage();
                                                if (message2 == null) {
                                                }
                                                pUU.copydefault("FileUpload", "failedMessage = " + );
                                                pair = new Pair(null, );
                                                file = (File) OLrzqt.getFirst();
                                                if (file != null) {
                                                }
                                                return pair;
                                            }
                                        }
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    r2 = r26;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                r2 = r26;
                                OLrzqt = obj4;
                                String message22 = th.getMessage();
                                if (message22 == null) {
                                }
                                pUU.copydefault("FileUpload", "failedMessage = " + );
                                pair = new Pair(null, );
                                file = (File) OLrzqt.getFirst();
                                if (file != null) {
                                }
                                return pair;
                            }
                            try {
                                tQV tqv = singleFileUploadUseCase.copydefault;
                                String id3 = imageItem3.getId();
                                singleFileUploadUseCase$invoke$1.L$0 = singleFileUploadUseCase;
                                singleFileUploadUseCase$invoke$1.L$1 = imageItem3;
                                singleFileUploadUseCase$invoke$1.L$2 = OLrzqt;
                                singleFileUploadUseCase$invoke$1.L$3 = objectRef2;
                                singleFileUploadUseCase$invoke$1.L$4 = null;
                                singleFileUploadUseCase$invoke$1.L$5 = null;
                                singleFileUploadUseCase$invoke$1.L$6 = null;
                                singleFileUploadUseCase$invoke$1.L$7 = null;
                                singleFileUploadUseCase$invoke$1.label = 7;
                                pair = tqv.copydefault(id3, singleFileUploadUseCase$invoke$1);
                                if (pair != objCopydefault) {
                                    return objCopydefault;
                                }
                                r58 = OLrzqt;
                                singleFileUploadUseCase5 = singleFileUploadUseCase;
                                objectRef4 = objectRef2;
                                r263 = r26;
                                try {
                                    try {
                                        publishImageUplaodResp = (PublishImageUplaodResp) ((AbstractC43419rot) pair).AEQbTJ();
                                        presignUrl = publishImageUplaodResp.getPresignUrl();
                                    } catch (Throwable th10) {
                                        th = th10;
                                        r2 = r263;
                                        OLrzqt = r58;
                                        String message222 = th.getMessage();
                                        ?? r10 = message222 == null ? r2 : message222;
                                        pUU.copydefault("FileUpload", "failedMessage = " + r10);
                                        pair = new Pair(null, r10);
                                        file = (File) OLrzqt.getFirst();
                                        if (file != null) {
                                        }
                                    }
                                    if (presignUrl != null || presignUrl.length() == 0) {
                                        throw new Exception(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                                    }
                                    String presignUrl2 = publishImageUplaodResp.getPresignUrl();
                                    String imageUrl = publishImageUplaodResp.getImageUrl();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("getUrlPath success presignUrl = ");
                                    sb.append(presignUrl2);
                                    String str4 = str;
                                    sb.append(str4);
                                    sb.append(imageUrl);
                                    pUU.KWHzl("FileUpload", sb.toString());
                                    try {
                                        AbstractC58185ywX<Boolean> abstractC58185ywXAEQbTJ = C46436tUg.OLrzqt.AEQbTJ(publishImageUplaodResp.getPresignUrl(), r58);
                                        Intrinsics.copydefault(abstractC58185ywXAEQbTJ);
                                        if (abstractC58185ywXAEQbTJ.AEQbTJ().booleanValue()) {
                                            String imageUrl2 = publishImageUplaodResp.getImageUrl();
                                            ?? r7 = imageUrl2;
                                            if (imageUrl2 == null) {
                                                r7 = r263;
                                            }
                                            pUU.KWHzl("FileUpload", "startUploadFileByApi success presignUrl = " + publishImageUplaodResp.getPresignUrl() + str4 + publishImageUplaodResp.getImageUrl());
                                            if (r58.getSecond() != null) {
                                                Object second = r58.getSecond();
                                                Intrinsics.copydefault(second);
                                                byte[] bArr4 = (byte[]) second;
                                                pUU.KWHzl(str3, "id=" + imageItem3.getId() + " bytesSize=" + bArr4.length + " md5=" + singleFileUploadUseCase5.EZpvd(bArr4));
                                            } else {
                                                Object first2 = r58.getFirst();
                                                Intrinsics.copydefault(first2);
                                                File file3 = (File) first2;
                                                pUU.KWHzl(str3, "id=" + imageItem3.getId() + " file=" + file3.getPath() + " size=" + file3.length() + " md5=" + singleFileUploadUseCase5.KWHzl(file3));
                                            }
                                            pUU.KWHzl("FileUpload", "send callback");
                                            Pair pair3 = (Pair) objectRef4.element;
                                            int iIntValue = pair3 != null ? ((Number) pair3.getFirst()).intValue() : 200;
                                            Pair pair4 = (Pair) objectRef4.element;
                                            int iIntValue2 = pair4 != null ? ((Number) pair4.getSecond()).intValue() : 200;
                                            File file4 = (File) r58.getFirst();
                                            pair = new Pair(new UploadedFile(r7, String.valueOf(iIntValue), String.valueOf(iIntValue2), String.valueOf(file4 != null ? C56443yFo.KWHzl(file4.length()) : null)), r263);
                                            file = (File) r58.getFirst();
                                            if (file != null) {
                                                C56443yFo.KWHzl(file.delete());
                                            }
                                            break;
                                        } else {
                                            try {
                                                pUU.KWHzl("FileUpload", "startUploadFileByApi fail presignUrl = " + publishImageUplaodResp.getPresignUrl() + str4 + publishImageUplaodResp.getImageUrl());
                                                throw new Exception(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                                            } catch (Exception e) {
                                                e = e;
                                                pUU.KWHzl("FileUpload", "startUploadFileByApi error=" + e);
                                                throw new Exception(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                                            }
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                    }
                                    return pair;
                                } catch (Exception unused2) {
                                    throw new Exception(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                                }
                            } catch (Exception unused3) {
                                throw new Exception(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            r2 = obj9;
                            obj = obj8;
                            r5.unlock(null);
                            throw th;
                        }
                    }
                    str = "  imageUrl=";
                    if (C33129mqd.OLrzqt((CharSequence) imageItem2.getBitmapKey())) {
                        C48948ufM c48948ufM = C48948ufM.copydefault;
                        String bitmapKey = imageItem2.getBitmapKey();
                        Intrinsics.copydefault((Object) bitmapKey);
                        Bitmap bitmapKWHzl = c48948ufM.KWHzl(bitmapKey);
                        if (bitmapKWHzl != null) {
                            str2 = "PlanetUpload";
                            objectRef.element = new Pair(C56443yFo.AEQbTJ(bitmapKWHzl.getWidth()), C56443yFo.AEQbTJ(bitmapKWHzl.getHeight()));
                            tTQ ttq2 = tTQ.OLrzqt;
                            singleFileUploadUseCase$invoke$1.L$0 = singleFileUploadUseCase;
                            singleFileUploadUseCase$invoke$1.L$1 = context2;
                            singleFileUploadUseCase$invoke$1.L$2 = imageItem2;
                            singleFileUploadUseCase$invoke$1.L$3 = obj;
                            singleFileUploadUseCase$invoke$1.L$4 = objectRef;
                            singleFileUploadUseCase$invoke$1.L$5 = r5;
                            singleFileUploadUseCase$invoke$1.L$6 = null;
                            singleFileUploadUseCase$invoke$1.L$7 = null;
                            singleFileUploadUseCase$invoke$1.I$0 = i;
                            singleFileUploadUseCase$invoke$1.label = 3;
                            pair = ttq2.AEQbTJ(context2, bitmapKWHzl, i, singleFileUploadUseCase$invoke$1);
                            if (pair == objCopydefault) {
                                return objCopydefault;
                            }
                            imageItem4 = imageItem2;
                            obj7 = obj;
                            context3 = context2;
                            objectRef3 = objectRef;
                            r12 = r5;
                            singleFileUploadUseCase3 = singleFileUploadUseCase;
                            obj10 = obj2;
                            try {
                                pairOLrzqt = (Pair) pair;
                                if (pairOLrzqt != null) {
                                    ImageItem imageItem7 = imageItem4;
                                    singleFileUploadUseCase2 = singleFileUploadUseCase3;
                                    r52 = r12;
                                    objectRef = objectRef3;
                                    obj3 = obj7;
                                    imageItem2 = imageItem7;
                                    obj10 = obj10;
                                    try {
                                        if (!C33129mqd.OLrzqt((CharSequence) imageItem2.getFilePath())) {
                                            tTQ ttq3 = tTQ.OLrzqt;
                                            String filePath = imageItem2.getFilePath();
                                            Intrinsics.copydefault((Object) filePath);
                                            objectRef.element = ttq3.KWHzl(filePath);
                                            String filePath2 = imageItem2.getFilePath();
                                            Intrinsics.copydefault((Object) filePath2);
                                            File file5 = new File(filePath2);
                                            singleFileUploadUseCase$invoke$1.L$0 = singleFileUploadUseCase2;
                                            singleFileUploadUseCase$invoke$1.L$1 = imageItem2;
                                            singleFileUploadUseCase$invoke$1.L$2 = obj3;
                                            singleFileUploadUseCase$invoke$1.L$3 = objectRef;
                                            singleFileUploadUseCase$invoke$1.L$4 = r52;
                                            obj11 = null;
                                            singleFileUploadUseCase$invoke$1.L$5 = null;
                                            singleFileUploadUseCase$invoke$1.L$6 = null;
                                            singleFileUploadUseCase$invoke$1.L$7 = null;
                                            singleFileUploadUseCase$invoke$1.label = 4;
                                            pair = ttq3.KWHzl(context3, file5, i, singleFileUploadUseCase$invoke$1);
                                            r54 = r52;
                                            obj12 = obj10;
                                            if (pair == objCopydefault) {
                                                return objCopydefault;
                                            }
                                            pairOLrzqt = C56390yDp.OLrzqt(pair, obj11);
                                            r58 = r54;
                                            continuation = obj12;
                                            objectRef2 = objectRef;
                                            obj8 = obj3;
                                            imageItem5 = imageItem2;
                                            singleFileUploadUseCase4 = singleFileUploadUseCase2;
                                            r53 = r58;
                                            r262 = continuation;
                                            OLrzqt = pairOLrzqt;
                                            singleFileUploadUseCase = singleFileUploadUseCase4;
                                            obj5 = null;
                                            ImageItem imageItem62 = imageItem5;
                                            obj4 = obj8;
                                            imageItem3 = imageItem62;
                                            r56 = r53;
                                            r26 = r262;
                                            r56.unlock(obj5);
                                            pUU.KWHzl("FileUpload", "get Auth");
                                            pUU.KWHzl("FileUpload", "startUploadFileByApi");
                                            if (OLrzqt.getSecond() == null) {
                                            }
                                            tQV tqv2 = singleFileUploadUseCase.copydefault;
                                            String id32 = imageItem3.getId();
                                            singleFileUploadUseCase$invoke$1.L$0 = singleFileUploadUseCase;
                                            singleFileUploadUseCase$invoke$1.L$1 = imageItem3;
                                            singleFileUploadUseCase$invoke$1.L$2 = OLrzqt;
                                            singleFileUploadUseCase$invoke$1.L$3 = objectRef2;
                                            singleFileUploadUseCase$invoke$1.L$4 = null;
                                            singleFileUploadUseCase$invoke$1.L$5 = null;
                                            singleFileUploadUseCase$invoke$1.L$6 = null;
                                            singleFileUploadUseCase$invoke$1.L$7 = null;
                                            singleFileUploadUseCase$invoke$1.label = 7;
                                            pair = tqv2.copydefault(id32, singleFileUploadUseCase$invoke$1);
                                            if (pair != objCopydefault) {
                                            }
                                        } else {
                                            throw new Exception(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        r12 = r52;
                                        obj7 = obj3;
                                        r2 = obj10;
                                        r5 = r12;
                                        obj = obj7;
                                        r5.unlock(null);
                                        throw th;
                                    }
                                } else {
                                    objectRef2 = objectRef3;
                                    imageItem5 = imageItem4;
                                    Object obj15 = obj7;
                                    singleFileUploadUseCase4 = singleFileUploadUseCase3;
                                    r53 = r12;
                                    obj8 = obj15;
                                    r262 = obj10;
                                    OLrzqt = pairOLrzqt;
                                    singleFileUploadUseCase = singleFileUploadUseCase4;
                                    obj5 = null;
                                    ImageItem imageItem622 = imageItem5;
                                    obj4 = obj8;
                                    imageItem3 = imageItem622;
                                    r56 = r53;
                                    r26 = r262;
                                    r56.unlock(obj5);
                                    pUU.KWHzl("FileUpload", "get Auth");
                                    pUU.KWHzl("FileUpload", "startUploadFileByApi");
                                    if (OLrzqt.getSecond() == null) {
                                    }
                                    tQV tqv22 = singleFileUploadUseCase.copydefault;
                                    String id322 = imageItem3.getId();
                                    singleFileUploadUseCase$invoke$1.L$0 = singleFileUploadUseCase;
                                    singleFileUploadUseCase$invoke$1.L$1 = imageItem3;
                                    singleFileUploadUseCase$invoke$1.L$2 = OLrzqt;
                                    singleFileUploadUseCase$invoke$1.L$3 = objectRef2;
                                    singleFileUploadUseCase$invoke$1.L$4 = null;
                                    singleFileUploadUseCase$invoke$1.L$5 = null;
                                    singleFileUploadUseCase$invoke$1.L$6 = null;
                                    singleFileUploadUseCase$invoke$1.L$7 = null;
                                    singleFileUploadUseCase$invoke$1.label = 7;
                                    pair = tqv22.copydefault(id322, singleFileUploadUseCase$invoke$1);
                                    if (pair != objCopydefault) {
                                    }
                                }
                            } catch (Throwable th13) {
                                th = th13;
                                r2 = obj10;
                                r5 = r12;
                                obj = obj7;
                                r5.unlock(null);
                                throw th;
                            }
                        } else {
                            str2 = "PlanetUpload";
                            singleFileUploadUseCase2 = singleFileUploadUseCase;
                            Context context4 = context2;
                            obj3 = obj;
                            context3 = context4;
                            r52 = r5;
                            obj10 = obj2;
                            if (!C33129mqd.OLrzqt((CharSequence) imageItem2.getFilePath())) {
                            }
                        }
                    } else {
                        str2 = "PlanetUpload";
                        if (C33129mqd.OLrzqt((CharSequence) imageItem2.getFilePath())) {
                            tTQ ttq4 = tTQ.OLrzqt;
                            String filePath3 = imageItem2.getFilePath();
                            Intrinsics.copydefault((Object) filePath3);
                            objectRef.element = ttq4.KWHzl(filePath3);
                            String filePath4 = imageItem2.getFilePath();
                            Intrinsics.copydefault((Object) filePath4);
                            File file6 = new File(filePath4);
                            singleFileUploadUseCase$invoke$1.L$0 = singleFileUploadUseCase;
                            singleFileUploadUseCase$invoke$1.L$1 = imageItem2;
                            singleFileUploadUseCase$invoke$1.L$2 = obj;
                            singleFileUploadUseCase$invoke$1.L$3 = objectRef;
                            singleFileUploadUseCase$invoke$1.L$4 = r5;
                            obj6 = null;
                            singleFileUploadUseCase$invoke$1.L$5 = null;
                            singleFileUploadUseCase$invoke$1.L$6 = null;
                            singleFileUploadUseCase$invoke$1.L$7 = null;
                            singleFileUploadUseCase$invoke$1.label = 5;
                            pair = ttq4.KWHzl(context2, file6, i, singleFileUploadUseCase$invoke$1);
                            if (pair == objCopydefault) {
                                return objCopydefault;
                            }
                            singleFileUploadUseCase2 = singleFileUploadUseCase;
                            obj3 = obj;
                            r55 = r5;
                            obj13 = obj2;
                            pairOLrzqt = C56390yDp.OLrzqt(pair, obj6);
                            r58 = r55;
                            continuation = obj13;
                            objectRef2 = objectRef;
                            obj8 = obj3;
                            imageItem5 = imageItem2;
                            singleFileUploadUseCase4 = singleFileUploadUseCase2;
                            r53 = r58;
                            r262 = continuation;
                            OLrzqt = pairOLrzqt;
                            singleFileUploadUseCase = singleFileUploadUseCase4;
                            obj5 = null;
                            ImageItem imageItem6222 = imageItem5;
                            obj4 = obj8;
                            imageItem3 = imageItem6222;
                            r56 = r53;
                            r26 = r262;
                            r56.unlock(obj5);
                            pUU.KWHzl("FileUpload", "get Auth");
                            pUU.KWHzl("FileUpload", "startUploadFileByApi");
                            if (OLrzqt.getSecond() == null) {
                            }
                            tQV tqv222 = singleFileUploadUseCase.copydefault;
                            String id3222 = imageItem3.getId();
                            singleFileUploadUseCase$invoke$1.L$0 = singleFileUploadUseCase;
                            singleFileUploadUseCase$invoke$1.L$1 = imageItem3;
                            singleFileUploadUseCase$invoke$1.L$2 = OLrzqt;
                            singleFileUploadUseCase$invoke$1.L$3 = objectRef2;
                            singleFileUploadUseCase$invoke$1.L$4 = null;
                            singleFileUploadUseCase$invoke$1.L$5 = null;
                            singleFileUploadUseCase$invoke$1.L$6 = null;
                            singleFileUploadUseCase$invoke$1.L$7 = null;
                            singleFileUploadUseCase$invoke$1.label = 7;
                            pair = tqv222.copydefault(id3222, singleFileUploadUseCase$invoke$1);
                            if (pair != objCopydefault) {
                            }
                        } else if (bArr2 != null) {
                            objectRef.element = tTQ.OLrzqt.copydefault(bArr2);
                            OLrzqt = C56390yDp.OLrzqt(null, bArr2);
                            obj4 = obj;
                            objectRef2 = objectRef;
                            imageItem3 = imageItem2;
                            obj5 = null;
                            r56 = r5;
                            r26 = obj2;
                            r56.unlock(obj5);
                            pUU.KWHzl("FileUpload", "get Auth");
                            pUU.KWHzl("FileUpload", "startUploadFileByApi");
                            if (OLrzqt.getSecond() == null) {
                            }
                            tQV tqv2222 = singleFileUploadUseCase.copydefault;
                            String id32222 = imageItem3.getId();
                            singleFileUploadUseCase$invoke$1.L$0 = singleFileUploadUseCase;
                            singleFileUploadUseCase$invoke$1.L$1 = imageItem3;
                            singleFileUploadUseCase$invoke$1.L$2 = OLrzqt;
                            singleFileUploadUseCase$invoke$1.L$3 = objectRef2;
                            singleFileUploadUseCase$invoke$1.L$4 = null;
                            singleFileUploadUseCase$invoke$1.L$5 = null;
                            singleFileUploadUseCase$invoke$1.L$6 = null;
                            singleFileUploadUseCase$invoke$1.L$7 = null;
                            singleFileUploadUseCase$invoke$1.label = 7;
                            pair = tqv2222.copydefault(id32222, singleFileUploadUseCase$invoke$1);
                            if (pair != objCopydefault) {
                            }
                        } else if (bitmap2 != null) {
                            objectRef.element = new Pair(C56443yFo.AEQbTJ(bitmap2.getWidth()), C56443yFo.AEQbTJ(bitmap2.getHeight()));
                            tTQ ttq5 = tTQ.OLrzqt;
                            singleFileUploadUseCase$invoke$1.L$0 = singleFileUploadUseCase;
                            singleFileUploadUseCase$invoke$1.L$1 = imageItem2;
                            singleFileUploadUseCase$invoke$1.L$2 = obj;
                            singleFileUploadUseCase$invoke$1.L$3 = objectRef;
                            singleFileUploadUseCase$invoke$1.L$4 = r5;
                            singleFileUploadUseCase$invoke$1.L$5 = null;
                            singleFileUploadUseCase$invoke$1.L$6 = null;
                            singleFileUploadUseCase$invoke$1.L$7 = null;
                            singleFileUploadUseCase$invoke$1.label = 6;
                            pair = ttq5.AEQbTJ(context2, bitmap2, i, singleFileUploadUseCase$invoke$1);
                            if (pair == objCopydefault) {
                                return objCopydefault;
                            }
                            singleFileUploadUseCase2 = singleFileUploadUseCase;
                            obj3 = obj;
                            r57 = r5;
                            obj14 = obj2;
                            pairOLrzqt = (Pair) pair;
                            r58 = r57;
                            continuation = obj14;
                            objectRef2 = objectRef;
                            obj8 = obj3;
                            imageItem5 = imageItem2;
                            singleFileUploadUseCase4 = singleFileUploadUseCase2;
                            r53 = r58;
                            r262 = continuation;
                            OLrzqt = pairOLrzqt;
                            singleFileUploadUseCase = singleFileUploadUseCase4;
                            obj5 = null;
                            ImageItem imageItem62222 = imageItem5;
                            obj4 = obj8;
                            imageItem3 = imageItem62222;
                            r56 = r53;
                            r26 = r262;
                            r56.unlock(obj5);
                            pUU.KWHzl("FileUpload", "get Auth");
                            pUU.KWHzl("FileUpload", "startUploadFileByApi");
                            if (OLrzqt.getSecond() == null) {
                            }
                            tQV tqv22222 = singleFileUploadUseCase.copydefault;
                            String id322222 = imageItem3.getId();
                            singleFileUploadUseCase$invoke$1.L$0 = singleFileUploadUseCase;
                            singleFileUploadUseCase$invoke$1.L$1 = imageItem3;
                            singleFileUploadUseCase$invoke$1.L$2 = OLrzqt;
                            singleFileUploadUseCase$invoke$1.L$3 = objectRef2;
                            singleFileUploadUseCase$invoke$1.L$4 = null;
                            singleFileUploadUseCase$invoke$1.L$5 = null;
                            singleFileUploadUseCase$invoke$1.L$6 = null;
                            singleFileUploadUseCase$invoke$1.L$7 = null;
                            singleFileUploadUseCase$invoke$1.label = 7;
                            pair = tqv22222.copydefault(id322222, singleFileUploadUseCase$invoke$1);
                            if (pair != objCopydefault) {
                            }
                        } else {
                            r2 = obj2;
                            try {
                                throw new Exception(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                            } catch (Throwable th14) {
                                th = th14;
                                r5.unlock(null);
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th15) {
                    th = th15;
                    r2 = obj2;
                }
                break;
            case 1:
                int i3 = singleFileUploadUseCase$invoke$1.I$0;
                Mutex mutex2 = (Mutex) singleFileUploadUseCase$invoke$1.L$7;
                objectRef = (Ref.ObjectRef) singleFileUploadUseCase$invoke$1.L$6;
                obj4 = (Pair) singleFileUploadUseCase$invoke$1.L$5;
                Bitmap bitmap3 = (Bitmap) singleFileUploadUseCase$invoke$1.L$4;
                bArr2 = (byte[]) singleFileUploadUseCase$invoke$1.L$3;
                ImageItem imageItem8 = (ImageItem) singleFileUploadUseCase$invoke$1.L$2;
                Context context5 = (Context) singleFileUploadUseCase$invoke$1.L$1;
                SingleFileUploadUseCase singleFileUploadUseCase6 = (SingleFileUploadUseCase) singleFileUploadUseCase$invoke$1.L$0;
                try {
                    C56391yDq.AEQbTJ(pair);
                    i = i3;
                    obj2 = "";
                    bitmap2 = bitmap3;
                    imageItem2 = imageItem8;
                    singleFileUploadUseCase = singleFileUploadUseCase6;
                    r5 = mutex2;
                    obj = obj4;
                    context2 = context5;
                    if (imageItem2.getLocalUri() == null) {
                    }
                } catch (Throwable th16) {
                    th = th16;
                    r2 = "";
                    OLrzqt = obj4;
                    String message2222 = th.getMessage();
                    if (message2222 == null) {
                    }
                    pUU.copydefault("FileUpload", "failedMessage = " + r10);
                    pair = new Pair(null, r10);
                    file = (File) OLrzqt.getFirst();
                    if (file != null) {
                    }
                    return pair;
                }
                break;
            case 2:
                r5 = (Mutex) singleFileUploadUseCase$invoke$1.L$4;
                objectRef2 = (Ref.ObjectRef) singleFileUploadUseCase$invoke$1.L$3;
                obj8 = (Pair) singleFileUploadUseCase$invoke$1.L$2;
                imageItem5 = (ImageItem) singleFileUploadUseCase$invoke$1.L$1;
                singleFileUploadUseCase4 = (SingleFileUploadUseCase) singleFileUploadUseCase$invoke$1.L$0;
                try {
                    C56391yDq.AEQbTJ(pair);
                    str = "  imageUrl=";
                    obj9 = "";
                    r5 = r5;
                    pairOLrzqt = (Pair) pair;
                    str2 = "PlanetUpload";
                    r53 = r5;
                    r262 = obj9;
                    OLrzqt = pairOLrzqt;
                    singleFileUploadUseCase = singleFileUploadUseCase4;
                    obj5 = null;
                    ImageItem imageItem622222 = imageItem5;
                    obj4 = obj8;
                    imageItem3 = imageItem622222;
                    r56 = r53;
                    r26 = r262;
                    r56.unlock(obj5);
                    pUU.KWHzl("FileUpload", "get Auth");
                    pUU.KWHzl("FileUpload", "startUploadFileByApi");
                    if (OLrzqt.getSecond() == null) {
                    }
                    tQV tqv222222 = singleFileUploadUseCase.copydefault;
                    String id3222222 = imageItem3.getId();
                    singleFileUploadUseCase$invoke$1.L$0 = singleFileUploadUseCase;
                    singleFileUploadUseCase$invoke$1.L$1 = imageItem3;
                    singleFileUploadUseCase$invoke$1.L$2 = OLrzqt;
                    singleFileUploadUseCase$invoke$1.L$3 = objectRef2;
                    singleFileUploadUseCase$invoke$1.L$4 = null;
                    singleFileUploadUseCase$invoke$1.L$5 = null;
                    singleFileUploadUseCase$invoke$1.L$6 = null;
                    singleFileUploadUseCase$invoke$1.L$7 = null;
                    singleFileUploadUseCase$invoke$1.label = 7;
                    pair = tqv222222.copydefault(id3222222, singleFileUploadUseCase$invoke$1);
                    if (pair != objCopydefault) {
                    }
                } catch (Throwable th17) {
                    th = th17;
                    obj9 = "";
                    r2 = obj9;
                    obj = obj8;
                    r5.unlock(null);
                    throw th;
                }
                break;
            case 3:
                int i4 = singleFileUploadUseCase$invoke$1.I$0;
                r12 = (Mutex) singleFileUploadUseCase$invoke$1.L$5;
                objectRef3 = (Ref.ObjectRef) singleFileUploadUseCase$invoke$1.L$4;
                obj7 = (Pair) singleFileUploadUseCase$invoke$1.L$3;
                imageItem4 = (ImageItem) singleFileUploadUseCase$invoke$1.L$2;
                context3 = (Context) singleFileUploadUseCase$invoke$1.L$1;
                singleFileUploadUseCase3 = (SingleFileUploadUseCase) singleFileUploadUseCase$invoke$1.L$0;
                try {
                    C56391yDq.AEQbTJ(pair);
                    i = i4;
                    str = "  imageUrl=";
                    str2 = "PlanetUpload";
                    obj10 = "";
                    r12 = r12;
                    pairOLrzqt = (Pair) pair;
                    if (pairOLrzqt != null) {
                    }
                } catch (Throwable th18) {
                    th = th18;
                    obj10 = "";
                    r2 = obj10;
                    r5 = r12;
                    obj = obj7;
                    r5.unlock(null);
                    throw th;
                }
                break;
            case 4:
                Mutex mutex3 = (Mutex) singleFileUploadUseCase$invoke$1.L$4;
                objectRef = (Ref.ObjectRef) singleFileUploadUseCase$invoke$1.L$3;
                obj3 = (Pair) singleFileUploadUseCase$invoke$1.L$2;
                imageItem2 = (ImageItem) singleFileUploadUseCase$invoke$1.L$1;
                singleFileUploadUseCase2 = (SingleFileUploadUseCase) singleFileUploadUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(pair);
                str = "  imageUrl=";
                str2 = "PlanetUpload";
                obj12 = "";
                obj11 = null;
                r54 = mutex3;
                pairOLrzqt = C56390yDp.OLrzqt(pair, obj11);
                r58 = r54;
                continuation = obj12;
                objectRef2 = objectRef;
                obj8 = obj3;
                imageItem5 = imageItem2;
                singleFileUploadUseCase4 = singleFileUploadUseCase2;
                r53 = r58;
                r262 = continuation;
                OLrzqt = pairOLrzqt;
                singleFileUploadUseCase = singleFileUploadUseCase4;
                obj5 = null;
                ImageItem imageItem6222222 = imageItem5;
                obj4 = obj8;
                imageItem3 = imageItem6222222;
                r56 = r53;
                r26 = r262;
                r56.unlock(obj5);
                pUU.KWHzl("FileUpload", "get Auth");
                pUU.KWHzl("FileUpload", "startUploadFileByApi");
                if (OLrzqt.getSecond() == null) {
                }
                tQV tqv2222222 = singleFileUploadUseCase.copydefault;
                String id32222222 = imageItem3.getId();
                singleFileUploadUseCase$invoke$1.L$0 = singleFileUploadUseCase;
                singleFileUploadUseCase$invoke$1.L$1 = imageItem3;
                singleFileUploadUseCase$invoke$1.L$2 = OLrzqt;
                singleFileUploadUseCase$invoke$1.L$3 = objectRef2;
                singleFileUploadUseCase$invoke$1.L$4 = null;
                singleFileUploadUseCase$invoke$1.L$5 = null;
                singleFileUploadUseCase$invoke$1.L$6 = null;
                singleFileUploadUseCase$invoke$1.L$7 = null;
                singleFileUploadUseCase$invoke$1.label = 7;
                pair = tqv2222222.copydefault(id32222222, singleFileUploadUseCase$invoke$1);
                if (pair != objCopydefault) {
                }
                break;
            case 5:
                Mutex mutex4 = (Mutex) singleFileUploadUseCase$invoke$1.L$4;
                objectRef = (Ref.ObjectRef) singleFileUploadUseCase$invoke$1.L$3;
                obj3 = (Pair) singleFileUploadUseCase$invoke$1.L$2;
                imageItem2 = (ImageItem) singleFileUploadUseCase$invoke$1.L$1;
                singleFileUploadUseCase2 = (SingleFileUploadUseCase) singleFileUploadUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(pair);
                str = "  imageUrl=";
                str2 = "PlanetUpload";
                obj13 = "";
                obj6 = null;
                r55 = mutex4;
                pairOLrzqt = C56390yDp.OLrzqt(pair, obj6);
                r58 = r55;
                continuation = obj13;
                objectRef2 = objectRef;
                obj8 = obj3;
                imageItem5 = imageItem2;
                singleFileUploadUseCase4 = singleFileUploadUseCase2;
                r53 = r58;
                r262 = continuation;
                OLrzqt = pairOLrzqt;
                singleFileUploadUseCase = singleFileUploadUseCase4;
                obj5 = null;
                ImageItem imageItem62222222 = imageItem5;
                obj4 = obj8;
                imageItem3 = imageItem62222222;
                r56 = r53;
                r26 = r262;
                r56.unlock(obj5);
                pUU.KWHzl("FileUpload", "get Auth");
                pUU.KWHzl("FileUpload", "startUploadFileByApi");
                if (OLrzqt.getSecond() == null) {
                }
                tQV tqv22222222 = singleFileUploadUseCase.copydefault;
                String id322222222 = imageItem3.getId();
                singleFileUploadUseCase$invoke$1.L$0 = singleFileUploadUseCase;
                singleFileUploadUseCase$invoke$1.L$1 = imageItem3;
                singleFileUploadUseCase$invoke$1.L$2 = OLrzqt;
                singleFileUploadUseCase$invoke$1.L$3 = objectRef2;
                singleFileUploadUseCase$invoke$1.L$4 = null;
                singleFileUploadUseCase$invoke$1.L$5 = null;
                singleFileUploadUseCase$invoke$1.L$6 = null;
                singleFileUploadUseCase$invoke$1.L$7 = null;
                singleFileUploadUseCase$invoke$1.label = 7;
                pair = tqv22222222.copydefault(id322222222, singleFileUploadUseCase$invoke$1);
                if (pair != objCopydefault) {
                }
                break;
            case 6:
                Mutex mutex5 = (Mutex) singleFileUploadUseCase$invoke$1.L$4;
                objectRef = (Ref.ObjectRef) singleFileUploadUseCase$invoke$1.L$3;
                obj3 = (Pair) singleFileUploadUseCase$invoke$1.L$2;
                imageItem2 = (ImageItem) singleFileUploadUseCase$invoke$1.L$1;
                singleFileUploadUseCase2 = (SingleFileUploadUseCase) singleFileUploadUseCase$invoke$1.L$0;
                C56391yDq.AEQbTJ(pair);
                str = "  imageUrl=";
                str2 = "PlanetUpload";
                obj14 = "";
                r57 = mutex5;
                pairOLrzqt = (Pair) pair;
                r58 = r57;
                continuation = obj14;
                objectRef2 = objectRef;
                obj8 = obj3;
                imageItem5 = imageItem2;
                singleFileUploadUseCase4 = singleFileUploadUseCase2;
                r53 = r58;
                r262 = continuation;
                OLrzqt = pairOLrzqt;
                singleFileUploadUseCase = singleFileUploadUseCase4;
                obj5 = null;
                ImageItem imageItem622222222 = imageItem5;
                obj4 = obj8;
                imageItem3 = imageItem622222222;
                r56 = r53;
                r26 = r262;
                r56.unlock(obj5);
                pUU.KWHzl("FileUpload", "get Auth");
                pUU.KWHzl("FileUpload", "startUploadFileByApi");
                if (OLrzqt.getSecond() == null) {
                }
                tQV tqv222222222 = singleFileUploadUseCase.copydefault;
                String id3222222222 = imageItem3.getId();
                singleFileUploadUseCase$invoke$1.L$0 = singleFileUploadUseCase;
                singleFileUploadUseCase$invoke$1.L$1 = imageItem3;
                singleFileUploadUseCase$invoke$1.L$2 = OLrzqt;
                singleFileUploadUseCase$invoke$1.L$3 = objectRef2;
                singleFileUploadUseCase$invoke$1.L$4 = null;
                singleFileUploadUseCase$invoke$1.L$5 = null;
                singleFileUploadUseCase$invoke$1.L$6 = null;
                singleFileUploadUseCase$invoke$1.L$7 = null;
                singleFileUploadUseCase$invoke$1.label = 7;
                pair = tqv222222222.copydefault(id3222222222, singleFileUploadUseCase$invoke$1);
                if (pair != objCopydefault) {
                }
                break;
            case 7:
                objectRef4 = (Ref.ObjectRef) singleFileUploadUseCase$invoke$1.L$3;
                Pair pair5 = (Pair) singleFileUploadUseCase$invoke$1.L$2;
                imageItem3 = (ImageItem) singleFileUploadUseCase$invoke$1.L$1;
                singleFileUploadUseCase5 = (SingleFileUploadUseCase) singleFileUploadUseCase$invoke$1.L$0;
                try {
                    C56391yDq.AEQbTJ(pair);
                    str = "  imageUrl=";
                    str3 = "PlanetUpload";
                    r263 = "";
                    r58 = pair5;
                    publishImageUplaodResp = (PublishImageUplaodResp) ((AbstractC43419rot) pair).AEQbTJ();
                    presignUrl = publishImageUplaodResp.getPresignUrl();
                    if (presignUrl != null) {
                        break;
                    }
                    throw new Exception(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                } catch (Exception unused4) {
                    throw new Exception(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
                }
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final CharSequence EZpvd(byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final String EZpvd(byte[] bArr) {
        byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(bArr);
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
        return yDV.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: o.tRo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SingleFileUploadUseCase.EZpvd(((java.lang.Byte) obj).byteValue());
            }
        }, 30, (Object) null);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final String KWHzl(File file) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            DigestInputStream digestInputStream = new DigestInputStream(fileInputStream, messageDigest);
            try {
                while (digestInputStream.read(new byte[8192]) != -1) {
                }
                Unit unit = Unit.INSTANCE;
                yFA.copydefault(digestInputStream, null);
                yFA.copydefault(fileInputStream, null);
                byte[] bArrDigest = messageDigest.digest();
                Intrinsics.checkNotNullExpressionValue(bArrDigest, "");
                return yDV.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: o.tRn
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return SingleFileUploadUseCase.KWHzl(((java.lang.Byte) obj).byteValue());
                    }
                }, 30, (Object) null);
            } finally {
            }
        } finally {
        }
    }

    public static final CharSequence KWHzl(byte b) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
